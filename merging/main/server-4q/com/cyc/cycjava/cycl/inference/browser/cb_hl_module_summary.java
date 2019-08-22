/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.browser;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_id;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_lookup_by_string;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_form_method_table$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_string_for_fort;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_help_definitions$;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_indent_row_internal;
import static com.cyc.cycjava.cycl.html_utilities.html_indent_table_internal;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_doc_string;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_target_definition;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.get;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.html_macros;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_hl_module_summary extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt99$ = makeString("");

    public static final SubLFile me = new cb_hl_module_summary();

 public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_gather_evaluatable_predicates$ = makeSymbol("*CB-GATHER-EVALUATABLE-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_gather_evaluatable_functions$ = makeSymbol("*CB-GATHER-EVALUATABLE-FUNCTIONS*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $CB_HL_MODULE_SUMMARY = makeKeyword("CB-HL-MODULE-SUMMARY");

    static private final SubLString $str1$cb_hl_module_summary_html = makeString("cb-hl-module-summary.html");

    private static final SubLString $str2$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str3$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLString $$$HL_Module_Summary = makeString("HL Module Summary");

    private static final SubLSymbol $HL_MODULE_INDEX = makeKeyword("HL-MODULE-INDEX");

    private static final SubLString $$$Index_to_all_HL_modules = makeString("Index to all HL modules");

    private static final SubLString $$$Transformation_Modules = makeString("Transformation Modules");

    private static final SubLString $str11$___S_total_ = makeString(" (~S total)");

    private static final SubLSymbol $GENERIC_REMOVAL_MODULES = makeKeyword("GENERIC-REMOVAL-MODULES");

    private static final SubLString $$$Generic_Removal_Modules = makeString("Generic Removal Modules");

    private static final SubLString $str14$_SpecificRemovalModules = makeString("#SpecificRemovalModules");

    private static final SubLString $$$Specific_Removal_Modules = makeString("Specific Removal Modules");

    private static final SubLSymbol $GENERIC_PREFERENCE_MODULES = makeKeyword("GENERIC-PREFERENCE-MODULES");

    private static final SubLString $$$Generic_Preference_Modules = makeString("Generic Preference Modules");

    private static final SubLString $str18$_SpecificPreferenceModules = makeString("#SpecificPreferenceModules");

    private static final SubLString $$$Specific_Preference_Modules = makeString("Specific Preference Modules");

    private static final SubLSymbol $CONJUNCTIVE_REMOVAL_MODULES = makeKeyword("CONJUNCTIVE-REMOVAL-MODULES");

    private static final SubLString $$$Conjunctive_Removal_Modules = makeString("Conjunctive Removal Modules");

    private static final SubLString $$$Rewrite_Modules = makeString("Rewrite Modules");

    private static final SubLString $$$Forward_Modules = makeString("Forward Modules");

    private static final SubLSymbol $HL_STORAGE_MODULES = makeKeyword("HL-STORAGE-MODULES");

    private static final SubLString $$$Storage_Modules = makeString("Storage Modules");

    private static final SubLString $$$Evaluatable_Predicates = makeString("Evaluatable Predicates");

    private static final SubLString $$$Evaluatable_Functions = makeString("Evaluatable Functions");

    private static final SubLString $$$SpecificRemovalModules = makeString("SpecificRemovalModules");

    private static final SubLString $str33$Specific_Removal_Modules__ = makeString("Specific Removal Modules :");

    private static final SubLSymbol $PREDICATE_SPECIFIC_REMOVAL_MODULES = makeKeyword("PREDICATE-SPECIFIC-REMOVAL-MODULES");

    private static final SubLString $$$_literals = makeString(" literals");

    private static final SubLString $$$SpecificPreferenceModules = makeString("SpecificPreferenceModules");

    private static final SubLString $str37$Specific_Preference_Modules__ = makeString("Specific Preference Modules :");

    private static final SubLSymbol $PREDICATE_SPECIFIC_PREFERENCE_MODULES = makeKeyword("PREDICATE-SPECIFIC-PREFERENCE-MODULES");

    private static final SubLSymbol CB_HL_MODULE_SUMMARY = makeSymbol("CB-HL-MODULE-SUMMARY");

    private static final SubLString $str42$cb_hl_module_summary = makeString("cb-hl-module-summary");

    private static final SubLSymbol CB_LINK_HL_MODULE_INDEX = makeSymbol("CB-LINK-HL-MODULE-INDEX");

    private static final SubLSymbol $HL_MODULE_SUMMARY = makeKeyword("HL-MODULE-SUMMARY");

    private static final SubLList $list46 = list(makeKeyword("INFERENCE"));

    private static final SubLSymbol CB_TRANSFORMATION_MODULES = makeSymbol("CB-TRANSFORMATION-MODULES");

    private static final SubLString $str49$cb_transformation_modules = makeString("cb-transformation-modules");

    private static final SubLSymbol CB_LINK_TRANSFORMATION_MODULES = makeSymbol("CB-LINK-TRANSFORMATION-MODULES");

    private static final SubLSymbol $sym51$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");

    private static final SubLSymbol CB_GENERIC_REMOVAL_MODULES = makeSymbol("CB-GENERIC-REMOVAL-MODULES");

    private static final SubLString $str54$cb_generic_removal_modules = makeString("cb-generic-removal-modules");

    private static final SubLSymbol CB_LINK_GENERIC_REMOVAL_MODULES = makeSymbol("CB-LINK-GENERIC-REMOVAL-MODULES");

    private static final SubLSymbol CB_GENERIC_PREFERENCE_MODULES = makeSymbol("CB-GENERIC-PREFERENCE-MODULES");

    private static final SubLString $str57$cb_generic_preference_modules = makeString("cb-generic-preference-modules");

    private static final SubLSymbol CB_LINK_GENERIC_PREFERENCE_MODULES = makeSymbol("CB-LINK-GENERIC-PREFERENCE-MODULES");

    private static final SubLSymbol PREFERENCE_MODULE_NAME = makeSymbol("PREFERENCE-MODULE-NAME");

    private static final SubLSymbol CB_CONJUNCTIVE_REMOVAL_MODULES = makeSymbol("CB-CONJUNCTIVE-REMOVAL-MODULES");

    private static final SubLString $str61$cb_conjunctive_removal_modules = makeString("cb-conjunctive-removal-modules");

    private static final SubLSymbol CB_LINK_CONJUNCTIVE_REMOVAL_MODULES = makeSymbol("CB-LINK-CONJUNCTIVE-REMOVAL-MODULES");

    private static final SubLList $list63 = list(makeSymbol("FORT-ID"));

    private static final SubLString $str64$_S_did_not_specify_a_predicate_ = makeString("~S did not specify a predicate.");

    private static final SubLSymbol CB_PREDICATE_SPECIFIC_REMOVAL_MODULES = makeSymbol("CB-PREDICATE-SPECIFIC-REMOVAL-MODULES");

    private static final SubLString $str67$Predicate_Specific_Removal_Module = makeString("Predicate Specific Removal Modules");

    private static final SubLString $str68$cb_predicate_specific_removal_mod = makeString("cb-predicate-specific-removal-modules&~A");

    private static final SubLSymbol CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES = makeSymbol("CB-LINK-PREDICATE-SPECIFIC-REMOVAL-MODULES");

    private static final SubLString $$$_removal_modules = makeString(" removal modules");

    private static final SubLString $str71$The_following_generic_modules_are = makeString("The following generic modules are also used for ");

    private static final SubLString $str72$_literals__ = makeString(" literals :");

    private static final SubLString $str73$__ = makeString(", ");

    private static final SubLSymbol CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES = makeSymbol("CB-PREDICATE-SPECIFIC-PREFERENCE-MODULES");

    private static final SubLString $str75$Predicate_Specific_Preference_Mod = makeString("Predicate Specific Preference Modules");

    private static final SubLString $str76$cb_predicate_specific_preference_ = makeString("cb-predicate-specific-preference-modules&~A");

    private static final SubLSymbol CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES = makeSymbol("CB-LINK-PREDICATE-SPECIFIC-PREFERENCE-MODULES");

    private static final SubLString $str78$Predicate_Specific_Storage_Module = makeString("Predicate Specific Storage Modules");

    private static final SubLString $$$_preference_modules = makeString(" preference modules");

    private static final SubLSymbol CB_REWRITE_MODULES = makeSymbol("CB-REWRITE-MODULES");

    private static final SubLString $str81$cb_rewrite_modules = makeString("cb-rewrite-modules");

    private static final SubLSymbol CB_LINK_REWRITE_MODULES = makeSymbol("CB-LINK-REWRITE-MODULES");

    private static final SubLSymbol CB_FORWARD_MODULES = makeSymbol("CB-FORWARD-MODULES");

    private static final SubLString $str84$cb_forward_modules = makeString("cb-forward-modules");

    private static final SubLSymbol CB_LINK_FORWARD_MODULES = makeSymbol("CB-LINK-FORWARD-MODULES");

    private static final SubLSymbol $GENERIC_HL_STORAGE_MODULES = makeKeyword("GENERIC-HL-STORAGE-MODULES");

    private static final SubLString $$$Generic_Storage_Modules = makeString("Generic Storage Modules");

    private static final SubLString $str88$Predicate_Specific_Storage_Module = makeString("Predicate Specific Storage Modules :");

    private static final SubLSymbol $PREDICATE_SPECIFIC_HL_STORAGE_MODULES = makeKeyword("PREDICATE-SPECIFIC-HL-STORAGE-MODULES");

    private static final SubLString $$$_modules = makeString(" modules");

    private static final SubLSymbol CB_HL_STORAGE_MODULES = makeSymbol("CB-HL-STORAGE-MODULES");

    private static final SubLString $str92$cb_hl_storage_modules = makeString("cb-hl-storage-modules");

    private static final SubLSymbol CB_LINK_HL_STORAGE_MODULES = makeSymbol("CB-LINK-HL-STORAGE-MODULES");

    private static final SubLSymbol CB_GENERIC_HL_STORAGE_MODULES = makeSymbol("CB-GENERIC-HL-STORAGE-MODULES");

    private static final SubLString $str95$cb_generic_hl_storage_modules = makeString("cb-generic-hl-storage-modules");

    private static final SubLSymbol CB_LINK_GENERIC_HL_STORAGE_MODULES = makeSymbol("CB-LINK-GENERIC-HL-STORAGE-MODULES");

    private static final SubLSymbol CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES = makeSymbol("CB-PREDICATE-SPECIFIC-HL-STORAGE-MODULES");

    private static final SubLString $str98$Predicate_Specific_Hl_Storage_Mod = makeString("Predicate Specific Hl-Storage Modules");

    private static final SubLString $str99$cb_predicate_specific_hl_storage_ = makeString("cb-predicate-specific-hl-storage-modules&~A");

    private static final SubLSymbol CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES = makeSymbol("CB-LINK-PREDICATE-SPECIFIC-HL-STORAGE-MODULES");

    private static final SubLString $$$_storage_modules = makeString(" storage modules");

    private static final SubLString $$$module_ = makeString("module ");

    private static final SubLString $str104$ = makeString("");

    private static final SubLString $str105$documentation__ = makeString("documentation :");

    private static final SubLString $$$no_documentation = makeString("no documentation");

    private static final SubLString $str107$example__ = makeString("example :");

    private static final SubLString $$$no_example = makeString("no example");

    private static final SubLString $str110$Module_supplants__ = makeString("Module supplants :");

    private static final SubLString $$$_all_other_modules = makeString(" all other modules");

    private static final SubLString $str112$unknown_supplants_type____S = makeString("unknown supplants type : ~S");

    private static final SubLList $list113 = list(makeSymbol("HL-MODULE-ID"));

    private static final SubLString $str114$The_inference_module__A_is_no_lon = makeString("The inference module ~A is no longer available.");

    private static final SubLSymbol CB_HL_MODULE = makeSymbol("CB-HL-MODULE");

    private static final SubLString $str117$cb_hl_module__A = makeString("cb-hl-module&~A");

    private static final SubLSymbol CB_LINK_HL_MODULE = makeSymbol("CB-LINK-HL-MODULE");

    private static final SubLSymbol CB_FORM_HL_MODULE_METHOD = makeSymbol("CB-FORM-HL-MODULE-METHOD");

    private static final SubLString $str120$HL_Module__A = makeString("HL Module ~A");

    private static final SubLString $$$HL_Module = makeString("HL Module");

    private static final SubLString $$$Property = makeString("Property");

    private static final SubLString $$$Value = makeString("Value");

    private static final SubLSymbol CB_EVALUATABLE_PREDICATES = makeSymbol("CB-EVALUATABLE-PREDICATES");

    private static final SubLString $str127$cb_evaluatable_predicates = makeString("cb-evaluatable-predicates");

    private static final SubLSymbol CB_LINK_EVALUATABLE_PREDICATES = makeSymbol("CB-LINK-EVALUATABLE-PREDICATES");

    private static final SubLString $$$predicate_ = makeString("predicate ");

    private static final SubLList $list130 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("knownSentence"), list(reader_make_constant_shell("isa"), makeSymbol("?PRED"), reader_make_constant_shell("EvaluatablePredicate"))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("evaluationDefn"), makeSymbol("?PRED"), makeSymbol("?DEFN"))), list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(makeSymbol("?DEFN")), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(QUOTE, makeSymbol("?DEFN"))))))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("evaluationDefn"), makeSymbol("?PRED"), makeSymbol("?DEFN"))), list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("SubLQuoteFn"), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(QUOTE, makeSymbol("?DEFN"))))))), list(reader_make_constant_shell("assertedPredicateArg"), makeSymbol("?PRED"), ONE_INTEGER, reader_make_constant_shell("expansion"))));



    private static final SubLList $list132 = list(new SubLObject[]{ makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-UNION"), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?PRED")) });

    private static final SubLSymbol CB_EVALUATABLE_FUNCTIONS = makeSymbol("CB-EVALUATABLE-FUNCTIONS");

    private static final SubLString $str134$cb_evaluatable_functions = makeString("cb-evaluatable-functions");

    private static final SubLSymbol CB_LINK_EVALUATABLE_FUNCTIONS = makeSymbol("CB-LINK-EVALUATABLE-FUNCTIONS");

    private static final SubLString $$$function_ = makeString("function ");

    private static final SubLString $str137$____ = makeString(" -> ");



    private static final SubLList $list140 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("knownSentence"), list(reader_make_constant_shell("isa"), makeSymbol("?FUNC"), reader_make_constant_shell("EvaluatableFunction"))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("evaluationDefn"), makeSymbol("?FUNC"), makeSymbol("?DEFN"))), list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(makeSymbol("?DEFN")), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(QUOTE, makeSymbol("?DEFN"))))))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("evaluationDefn"), makeSymbol("?FUNC"), makeSymbol("?DEFN"))), list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("SubLQuoteFn"), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(QUOTE, makeSymbol("?DEFN"))))))), list(reader_make_constant_shell("assertedPredicateArg"), makeSymbol("?FUNC"), ONE_INTEGER, reader_make_constant_shell("expansion"))));

    private static final SubLList $list141 = list(new SubLObject[]{ makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-UNION"), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?FUNC")) });

    private static final SubLString $str142$___ = makeString(" : ");

    private static final SubLString $str143$_ = makeString("(");

    private static final SubLString $str144$______ = makeString(" ... )");

    private static final SubLString $str145$_ = makeString(")");

    private static final SubLString $str146$___ = makeString(" ? ");

    private static final SubLString $str147$example___ = makeString("example : ");

    // Definitions
    public static final SubLObject cb_hl_module_summary_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$HL_Module_Summary);
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
                        SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_macros.$within_html_form$.bind(T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    cb_link($HL_MODULE_INDEX, $$$HL_Module_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    cb_help_preamble($CB_HL_MODULE_SUMMARY, UNPROVIDED, UNPROVIDED);
                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($$$Index_to_all_HL_modules);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    cb_link($TRANSFORMATION_MODULES, $$$Transformation_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, inference_modules.transformation_module_count());
                                    html_newline(UNPROVIDED);
                                    cb_link($GENERIC_REMOVAL_MODULES, $$$Generic_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, inference_modules.generic_removal_module_count());
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt10$_SpecificRemovalModules);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$Specific_Removal_Modules);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_total_specific_removal_module_count());
                                    html_newline(UNPROVIDED);
                                    cb_link($GENERIC_PREFERENCE_MODULES, $$$Generic_Preference_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, preference_modules.generic_preference_module_count());
                                    html_newline(UNPROVIDED);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt14$_SpecificPreferenceModules);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($$$Specific_Preference_Modules);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, preference_modules.specific_preference_module_count());
                                    html_newline(UNPROVIDED);
                                    cb_link($CONJUNCTIVE_REMOVAL_MODULES, $$$Conjunctive_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, inference_modules.conjunctive_removal_module_count());
                                    html_newline(UNPROVIDED);
                                    cb_link($REWRITE_MODULES, $$$Rewrite_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, inference_modules.rewrite_module_count());
                                    html_newline(UNPROVIDED);
                                    cb_link($FORWARD_MODULES, $$$Forward_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, forward_modules.forward_module_count());
                                    html_newline(UNPROVIDED);
                                    cb_link($HL_STORAGE_MODULES, $$$Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, hl_storage_modules.hl_storage_module_count());
                                    html_newline(UNPROVIDED);
                                    html_newline(UNPROVIDED);
                                    cb_link($EVALUATABLE_PREDICATES, $$$Evaluatable_Predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_evaluatable_predicate_count());
                                    html_newline(UNPROVIDED);
                                    cb_link($EVALUATABLE_FUNCTIONS, $$$Evaluatable_Functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_evaluatable_function_count());
                                    html_newline(TWO_INTEGER);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$SpecificRemovalModules);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str_alt29$Specific_Removal_Modules__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_total_specific_removal_module_count());
                                    {
                                        SubLObject predicates = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_removal_module_predicates();
                                        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = predicates;
                                                    SubLObject predicate = NIL;
                                                    for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                                                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject predicate_reference = cb_string_for_fort(predicate);
                                                                    cb_link($PREDICATE_SPECIFIC_REMOVAL_MODULES, predicate, predicate_reference, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    html_princ($str_alt31$_literals);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                                    }
                                    html_newline(TWO_INTEGER);
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($$$SpecificPreferenceModules);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str_alt33$Specific_Preference_Modules__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, preference_modules.specific_preference_module_count());
                                    {
                                        SubLObject predicates = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_all_specific_preference_module_predicates();
                                        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = predicates;
                                                    SubLObject predicate = NIL;
                                                    for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                                                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                {
                                                                    SubLObject predicate_reference = cb_string_for_fort(predicate);
                                                                    cb_link($PREDICATE_SPECIFIC_PREFERENCE_MODULES, predicate, predicate_reference, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    html_princ($str_alt31$_literals);
                                                                }
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                                    }
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                } finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
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

    // Definitions
    public static SubLObject cb_hl_module_summary(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$HL_Module_Summary);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$within_html_form$.bind(T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        cb_link($HL_MODULE_INDEX, $$$HL_Module_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        cb_help_preamble($CB_HL_MODULE_SUMMARY, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_big_head$.getGlobalValue());
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($$$Index_to_all_HL_modules);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_markup(html_macros.$html_big_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        html_newline(UNPROVIDED);
                        cb_link($TRANSFORMATION_MODULES, $$$Transformation_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, inference_modules.transformation_module_count());
                        html_newline(UNPROVIDED);
                        cb_link($GENERIC_REMOVAL_MODULES, $$$Generic_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, inference_modules.generic_removal_module_count());
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str14$_SpecificRemovalModules);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Specific_Removal_Modules);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_total_specific_removal_module_count());
                        html_newline(UNPROVIDED);
                        cb_link($GENERIC_PREFERENCE_MODULES, $$$Generic_Preference_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, preference_modules.generic_preference_module_count());
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str18$_SpecificPreferenceModules);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ($$$Specific_Preference_Modules);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, preference_modules.specific_preference_module_count());
                        html_newline(UNPROVIDED);
                        cb_link($CONJUNCTIVE_REMOVAL_MODULES, $$$Conjunctive_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, inference_modules.conjunctive_removal_module_count());
                        html_newline(UNPROVIDED);
                        cb_link($REWRITE_MODULES, $$$Rewrite_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, inference_modules.rewrite_module_count());
                        html_newline(UNPROVIDED);
                        cb_link($FORWARD_MODULES, $$$Forward_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, forward_modules.forward_module_count());
                        html_newline(UNPROVIDED);
                        cb_link($HL_STORAGE_MODULES, $$$Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, hl_storage_modules.hl_storage_module_count());
                        html_newline(UNPROVIDED);
                        html_newline(UNPROVIDED);
                        cb_link($EVALUATABLE_PREDICATES, $$$Evaluatable_Predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_evaluatable_predicate_count());
                        html_newline(UNPROVIDED);
                        cb_link($EVALUATABLE_FUNCTIONS, $$$Evaluatable_Functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_evaluatable_function_count());
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$SpecificRemovalModules);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str33$Specific_Removal_Modules__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_total_specific_removal_module_count());
                        SubLObject predicates = cb_specific_removal_module_predicates();
                        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var = predicates;
                            SubLObject predicate = NIL;
                            predicate = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject predicate_reference = cb_string_for_fort(predicate);
                                    cb_link($PREDICATE_SPECIFIC_REMOVAL_MODULES, predicate, predicate_reference, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_princ($$$_literals);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                predicate = cdolist_list_var.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                        html_markup(html_macros.$html_anchor_name$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$SpecificPreferenceModules);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str37$Specific_Preference_Modules__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, preference_modules.specific_preference_module_count());
                        predicates = cb_all_specific_preference_module_predicates();
                        html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var = predicates;
                            SubLObject predicate = NIL;
                            predicate = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject predicate_reference = cb_string_for_fort(predicate);
                                    cb_link($PREDICATE_SPECIFIC_PREFERENCE_MODULES, predicate, predicate_reference, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_princ($$$_literals);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                predicate = cdolist_list_var.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    } finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_hl_module_index_alt(SubLObject linktext, SubLObject target) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = $SELF;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$HL_Module_Summary;
            }
            {
                SubLObject frame_name_var = cb_frame_name(target);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt37$cb_hl_module_summary);
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

    public static SubLObject cb_link_hl_module_index(SubLObject linktext, SubLObject target) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (target == UNPROVIDED) {
            target = $SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$HL_Module_Summary;
        }
        final SubLObject frame_name_var = cb_frame_name(target);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str42$cb_hl_module_summary);
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

    public static final SubLObject cb_transformation_modules_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Transformation_Modules);
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
                        SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($TRANSFORMATION_MODULES, $$$Transformation_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_all_transformation_modules();
                                SubLObject hl_module = NIL;
                                for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_hl_module_info(hl_module);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
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

    public static SubLObject cb_transformation_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Transformation_Modules);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($TRANSFORMATION_MODULES, $$$Transformation_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_transformation_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_transformation_modules_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Transformation_Modules;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt44$cb_transformation_modules);
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

    public static SubLObject cb_link_transformation_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Transformation_Modules;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str49$cb_transformation_modules);
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

    public static final SubLObject cb_all_transformation_modules_alt() {
        {
            SubLObject hl_modules = NIL;
            SubLObject cdolist_list_var = inference_modules.transformation_modules();
            SubLObject hl_module = NIL;
            for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                hl_modules = cons(hl_module, hl_modules);
            }
            return Sort.sort(hl_modules, $sym46$TERM__, HL_MODULE_NAME);
        }
    }

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
        return Sort.sort(hl_modules, $sym51$TERM__, HL_MODULE_NAME);
    }

    public static final SubLObject cb_generic_removal_modules_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Generic_Removal_Modules);
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
                        SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($GENERIC_REMOVAL_MODULES, $$$Generic_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_all_generic_removal_modules();
                                SubLObject hl_module = NIL;
                                for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_hl_module_info(hl_module);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
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

    public static SubLObject cb_generic_removal_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Generic_Removal_Modules);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($GENERIC_REMOVAL_MODULES, $$$Generic_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_generic_removal_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$14, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_generic_removal_modules_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Generic_Removal_Modules;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt49$cb_generic_removal_modules);
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

    public static SubLObject cb_link_generic_removal_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Generic_Removal_Modules;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str54$cb_generic_removal_modules);
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

    public static final SubLObject cb_all_generic_removal_modules_alt() {
        return Sort.sort(inference_modules.generic_removal_modules(), $sym46$TERM__, HL_MODULE_NAME);
    }

    public static SubLObject cb_all_generic_removal_modules() {
        return Sort.sort(inference_modules.generic_removal_modules(), $sym51$TERM__, HL_MODULE_NAME);
    }

    public static final SubLObject cb_generic_preference_modules_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Generic_Preference_Modules);
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
                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($GENERIC_PREFERENCE_MODULES, $$$Generic_Preference_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_all_generic_preference_modules();
                                SubLObject prefmod = NIL;
                                for (prefmod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , prefmod = cdolist_list_var.first()) {
                                    preference_modules.cb_display_preference_module_info(prefmod);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
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

    public static SubLObject cb_generic_preference_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Generic_Preference_Modules);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($GENERIC_PREFERENCE_MODULES, $$$Generic_Preference_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_generic_preference_modules();
                    SubLObject prefmod = NIL;
                    prefmod = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        preference_modules.cb_display_preference_module_info(prefmod);
                        cdolist_list_var = cdolist_list_var.rest();
                        prefmod = cdolist_list_var.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$16, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_generic_preference_modules_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Generic_Preference_Modules;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt52$cb_generic_preference_modules);
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

    public static SubLObject cb_link_generic_preference_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Generic_Preference_Modules;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str57$cb_generic_preference_modules);
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

    public static final SubLObject cb_all_generic_preference_modules_alt() {
        return Sort.sort(preference_modules.generic_preference_modules(), $sym46$TERM__, PREFERENCE_MODULE_NAME);
    }

    public static SubLObject cb_all_generic_preference_modules() {
        return Sort.sort(preference_modules.generic_preference_modules(), $sym51$TERM__, PREFERENCE_MODULE_NAME);
    }

    public static final SubLObject cb_conjunctive_removal_modules_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Conjunctive_Removal_Modules);
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
                        SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($CONJUNCTIVE_REMOVAL_MODULES, $$$Conjunctive_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_all_conjunctive_removal_modules();
                                SubLObject hl_module = NIL;
                                for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_hl_module_info(hl_module);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
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

    public static SubLObject cb_conjunctive_removal_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Conjunctive_Removal_Modules);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$18 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($CONJUNCTIVE_REMOVAL_MODULES, $$$Conjunctive_Removal_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_conjunctive_removal_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$18, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_conjunctive_removal_modules_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Conjunctive_Removal_Modules;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt56$cb_conjunctive_removal_modules);
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

    public static SubLObject cb_link_conjunctive_removal_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Conjunctive_Removal_Modules;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str61$cb_conjunctive_removal_modules);
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

    public static final SubLObject cb_all_conjunctive_removal_modules_alt() {
        return Sort.sort(inference_modules.conjunctive_removal_modules(), $sym46$TERM__, HL_MODULE_NAME);
    }

    public static SubLObject cb_all_conjunctive_removal_modules() {
        return Sort.sort(inference_modules.conjunctive_removal_modules(), $sym51$TERM__, HL_MODULE_NAME);
    }

    public static final SubLObject cb_predicate_specific_removal_modules_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject fort_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            fort_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject predicate = cb_guess_fort(fort_id, UNPROVIDED);
                    if (NIL == forts.fort_p(predicate)) {
                        return cb_error($str_alt59$_S_did_not_specify_a_predicate_, fort_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_predicate_specific_removal_modules_guts(predicate);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt58);
            }
        }
        return NIL;
    }

    public static SubLObject cb_predicate_specific_removal_modules(final SubLObject args) {
        SubLObject fort_id = NIL;
        destructuring_bind_must_consp(args, args, $list63);
        fort_id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list63);
            return NIL;
        }
        final SubLObject predicate = cb_guess_fort(fort_id, UNPROVIDED);
        if (NIL == forts.fort_p(predicate)) {
            return cb_error($str64$_S_did_not_specify_a_predicate_, fort_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_predicate_specific_removal_modules_guts(predicate);
    }

    public static final SubLObject cb_link_predicate_specific_removal_modules_alt(SubLObject predicate, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            if (NIL == linktext) {
                linktext = $str_alt62$Predicate_Specific_Removal_Module;
            }
            {
                SubLObject id = cb_fort_identifier(predicate);
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt63$cb_predicate_specific_removal_mod, id);
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
            return predicate;
        }
    }

    public static SubLObject cb_link_predicate_specific_removal_modules(final SubLObject predicate, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        if (NIL == linktext) {
            linktext = $str67$Predicate_Specific_Removal_Module;
        }
        final SubLObject id = cb_fort_identifier(predicate);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str68$cb_predicate_specific_removal_mod, id);
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
        return predicate;
    }

    public static final SubLObject cb_predicate_specific_removal_modules_guts_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str_alt62$Predicate_Specific_Removal_Module);
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
                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($PREDICATE_SPECIFIC_REMOVAL_MODULES, predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_princ($str_alt65$_removal_modules);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject use_generic = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_use_generic(predicate);
                                if (NIL != use_generic) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_specific_use_generic(predicate, use_generic);
                                }
                                {
                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_removal_modules(predicate);
                                    SubLObject hl_module = NIL;
                                    for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                                        if (NIL == subl_promotions.memberP(hl_module, use_generic, UNPROVIDED, UNPROVIDED)) {
                                            com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_hl_module_info(hl_module);
                                        }
                                    }
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
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

    public static SubLObject cb_predicate_specific_removal_modules_guts(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str67$Predicate_Specific_Removal_Module);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($PREDICATE_SPECIFIC_REMOVAL_MODULES, predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_princ($$$_removal_modules);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject use_generic = cb_specific_use_generic(predicate);
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
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$20, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_display_specific_use_generic_alt(SubLObject predicate, SubLObject generic_modules) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_princ($str_alt66$The_following_generic_modules_are);
            cb_form(predicate, UNPROVIDED, UNPROVIDED);
            html_princ($str_alt67$_literals__);
            html_newline(UNPROVIDED);
            {
                SubLObject cdolist_list_var = generic_modules;
                SubLObject generic_module = NIL;
                for (generic_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , generic_module = cdolist_list_var.first()) {
                    if (generic_module != generic_modules.first()) {
                        html_princ($str_alt68$__);
                    }
                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_hash, UNPROVIDED);
                    html_markup(generic_module);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(generic_module);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                    }
                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                }
            }
            html_newline(TWO_INTEGER);
            return NIL;
        }
    }

    public static SubLObject cb_display_specific_use_generic(final SubLObject predicate, final SubLObject generic_modules) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_princ($str71$The_following_generic_modules_are);
        cb_form(predicate, UNPROVIDED, UNPROVIDED);
        html_princ($str72$_literals__);
        html_newline(UNPROVIDED);
        SubLObject cdolist_list_var = generic_modules;
        SubLObject generic_module = NIL;
        generic_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!generic_module.eql(generic_modules.first())) {
                html_princ($str73$__);
            }
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_hash, UNPROVIDED);
            html_markup(generic_module);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(generic_module);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            generic_module = cdolist_list_var.first();
        } 
        html_newline(TWO_INTEGER);
        return NIL;
    }

    public static final SubLObject cb_specific_removal_module_predicates_alt() {
        return kb_utilities.sort_terms(inference_modules.predicates_with_specific_removal_modules(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_specific_removal_module_predicates() {
        return kb_utilities.sort_terms(inference_modules.predicates_with_specific_removal_modules(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_specific_removal_modules_alt(SubLObject predicate) {
        return Sort.sort(inference_modules.removal_modules_specific(predicate), $sym46$TERM__, HL_MODULE_NAME);
    }

    public static SubLObject cb_specific_removal_modules(final SubLObject predicate) {
        return Sort.sort(inference_modules.removal_modules_specific(predicate), $sym51$TERM__, HL_MODULE_NAME);
    }

    public static final SubLObject cb_specific_use_generic_alt(SubLObject predicate) {
        {
            SubLObject hl_modules = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_removal_modules(predicate);
            SubLObject generic = NIL;
            SubLObject cdolist_list_var = hl_modules;
            SubLObject hl_module = NIL;
            for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                if (predicate != inference_modules.hl_module_predicate(hl_module)) {
                    generic = cons(hl_module, generic);
                }
            }
            return nreverse(generic);
        }
    }

    public static SubLObject cb_specific_use_generic(final SubLObject predicate) {
        final SubLObject hl_modules = cb_specific_removal_modules(predicate);
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
        return nreverse(generic);
    }

    public static final SubLObject cb_total_specific_removal_module_count_alt() {
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_removal_module_predicates();
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                total = add(total, com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_removal_module_count(predicate));
            }
            return total;
        }
    }

    public static SubLObject cb_total_specific_removal_module_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = cb_specific_removal_module_predicates();
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total = add(total, cb_specific_removal_module_count(predicate));
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return total;
    }

    public static final SubLObject cb_specific_removal_module_count_alt(SubLObject predicate) {
        {
            SubLObject hl_modules = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_removal_modules(predicate);
            SubLObject generic = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_use_generic(predicate);
            return subtract(length(hl_modules), length(generic));
        }
    }

    public static SubLObject cb_specific_removal_module_count(final SubLObject predicate) {
        final SubLObject hl_modules = cb_specific_removal_modules(predicate);
        final SubLObject generic = cb_specific_use_generic(predicate);
        return subtract(length(hl_modules), length(generic));
    }

    public static final SubLObject cb_predicate_specific_preference_modules_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject fort_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            fort_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject predicate = cb_guess_fort(fort_id, UNPROVIDED);
                    if (NIL == forts.fort_p(predicate)) {
                        return cb_error($str_alt59$_S_did_not_specify_a_predicate_, fort_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_predicate_specific_preference_modules_guts(predicate);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt58);
            }
        }
        return NIL;
    }

    public static SubLObject cb_predicate_specific_preference_modules(final SubLObject args) {
        SubLObject fort_id = NIL;
        destructuring_bind_must_consp(args, args, $list63);
        fort_id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list63);
            return NIL;
        }
        final SubLObject predicate = cb_guess_fort(fort_id, UNPROVIDED);
        if (NIL == forts.fort_p(predicate)) {
            return cb_error($str64$_S_did_not_specify_a_predicate_, fort_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_predicate_specific_preference_modules_guts(predicate);
    }

    public static final SubLObject cb_link_predicate_specific_preference_modules_alt(SubLObject predicate, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            if (NIL == linktext) {
                linktext = $str_alt70$Predicate_Specific_Preference_Mod;
            }
            {
                SubLObject id = cb_fort_identifier(predicate);
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt71$cb_predicate_specific_preference_, id);
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
            return predicate;
        }
    }

    public static SubLObject cb_link_predicate_specific_preference_modules(final SubLObject predicate, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        if (NIL == linktext) {
            linktext = $str75$Predicate_Specific_Preference_Mod;
        }
        final SubLObject id = cb_fort_identifier(predicate);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str76$cb_predicate_specific_preference_, id);
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
        return predicate;
    }

    public static final SubLObject cb_predicate_specific_preference_modules_guts_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str_alt73$Predicate_Specific_Storage_Module);
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
                        SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($PREDICATE_SPECIFIC_PREFERENCE_MODULES, predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_princ($str_alt74$_preference_modules);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = preference_modules.specific_preference_modules_for_pred(predicate);
                                SubLObject prefmod = NIL;
                                for (prefmod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , prefmod = cdolist_list_var.first()) {
                                    preference_modules.cb_display_preference_module_info(prefmod);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
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

    public static SubLObject cb_predicate_specific_preference_modules_guts(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str78$Predicate_Specific_Storage_Module);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$22 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($PREDICATE_SPECIFIC_PREFERENCE_MODULES, predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_princ($$$_preference_modules);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = preference_modules.specific_preference_modules_for_pred(predicate);
                    SubLObject prefmod = NIL;
                    prefmod = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        preference_modules.cb_display_preference_module_info(prefmod);
                        cdolist_list_var = cdolist_list_var.rest();
                        prefmod = cdolist_list_var.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$22, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_all_specific_preference_module_predicates_alt() {
        return kb_utilities.sort_terms(preference_modules.specific_preference_module_predicates(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_all_specific_preference_module_predicates() {
        return kb_utilities.sort_terms(preference_modules.specific_preference_module_predicates(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_rewrite_modules_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Rewrite_Modules);
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
                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($REWRITE_MODULES, $$$Rewrite_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_all_rewrite_modules();
                                SubLObject hl_module = NIL;
                                for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_hl_module_info(hl_module);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
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

    public static SubLObject cb_rewrite_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Rewrite_Modules);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$24 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($REWRITE_MODULES, $$$Rewrite_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_rewrite_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$24, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_rewrite_modules_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Rewrite_Modules;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt76$cb_rewrite_modules);
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

    public static SubLObject cb_link_rewrite_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Rewrite_Modules;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str81$cb_rewrite_modules);
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

    public static final SubLObject cb_all_rewrite_modules_alt() {
        return Sort.sort(inference_modules.rewrite_modules(), $sym46$TERM__, HL_MODULE_NAME);
    }

    public static SubLObject cb_all_rewrite_modules() {
        return Sort.sort(inference_modules.rewrite_modules(), $sym51$TERM__, HL_MODULE_NAME);
    }

    public static final SubLObject cb_forward_modules_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Forward_Modules);
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
                        SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($FORWARD_MODULES, $$$Forward_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_all_forward_modules();
                                SubLObject hl_module = NIL;
                                for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_hl_module_info(hl_module);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
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

    public static SubLObject cb_forward_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Forward_Modules);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$26 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($FORWARD_MODULES, $$$Forward_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_forward_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$26, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_forward_modules_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Forward_Modules;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt79$cb_forward_modules);
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

    public static SubLObject cb_link_forward_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Forward_Modules;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str84$cb_forward_modules);
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

    public static final SubLObject cb_all_forward_modules_alt() {
        return nreverse(copy_list(forward_modules.forward_modules()));
    }

    public static SubLObject cb_all_forward_modules() {
        return nreverse(copy_list(forward_modules.forward_modules()));
    }

    public static final SubLObject cb_hl_storage_modules_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Storage_Modules);
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
                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($HL_STORAGE_MODULES, $$$Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_link($GENERIC_HL_STORAGE_MODULES, $$$Generic_Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, hl_storage_modules.generic_hl_storage_module_count());
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str_alt83$Predicate_Specific_Storage_Module);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt7$___S_total_, com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_total_specific_hl_storage_module_count());
                            {
                                SubLObject predicates = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_hl_storage_module_predicates();
                                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        {
                                            SubLObject cdolist_list_var = predicates;
                                            SubLObject predicate = NIL;
                                            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                                                html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject predicate_reference = cb_string_for_fort(predicate);
                                                            cb_link($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, predicate, predicate_reference, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_princ($str_alt85$_modules);
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                    }
                                }
                                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
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

    public static SubLObject cb_hl_storage_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Storage_Modules);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$28 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($HL_STORAGE_MODULES, $$$Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    html_newline(UNPROVIDED);
                    cb_link($GENERIC_HL_STORAGE_MODULES, $$$Generic_Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, hl_storage_modules.generic_hl_storage_module_count());
                    html_newline(TWO_INTEGER);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str88$Predicate_Specific_Storage_Module);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str11$___S_total_, cb_total_specific_hl_storage_module_count());
                    final SubLObject predicates = cb_specific_hl_storage_module_predicates();
                    html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject cdolist_list_var = predicates;
                        SubLObject predicate = NIL;
                        predicate = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                final SubLObject predicate_reference = cb_string_for_fort(predicate);
                                cb_link($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, predicate, predicate_reference, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_princ($$$_modules);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                            }
                            html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            cdolist_list_var = cdolist_list_var.rest();
                            predicate = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$28, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_hl_storage_modules_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Storage_Modules;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt87$cb_hl_storage_modules);
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

    public static SubLObject cb_link_hl_storage_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Storage_Modules;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str92$cb_hl_storage_modules);
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

    public static final SubLObject cb_generic_hl_storage_modules_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Generic_Storage_Modules);
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
                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($GENERIC_HL_STORAGE_MODULES, $$$Generic_Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_all_generic_hl_storage_modules();
                                SubLObject hl_module = NIL;
                                for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_hl_module_info(hl_module);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
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

    public static SubLObject cb_generic_hl_storage_modules(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Generic_Storage_Modules);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$32 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($GENERIC_HL_STORAGE_MODULES, $$$Generic_Storage_Modules, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_all_generic_hl_storage_modules();
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$32, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_generic_hl_storage_modules_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Generic_Storage_Modules;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt90$cb_generic_hl_storage_modules);
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

    public static SubLObject cb_link_generic_hl_storage_modules(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Generic_Storage_Modules;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str95$cb_generic_hl_storage_modules);
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

    public static final SubLObject cb_all_generic_hl_storage_modules_alt() {
        return Sort.sort(hl_storage_modules.generic_hl_storage_modules(), $sym46$TERM__, HL_MODULE_NAME);
    }

    public static SubLObject cb_all_generic_hl_storage_modules() {
        return Sort.sort(hl_storage_modules.generic_hl_storage_modules(), $sym51$TERM__, HL_MODULE_NAME);
    }

    public static final SubLObject cb_predicate_specific_hl_storage_modules_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject fort_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            fort_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject predicate = cb_guess_fort(fort_id, UNPROVIDED);
                    if (NIL == forts.fort_p(predicate)) {
                        return cb_error($str_alt59$_S_did_not_specify_a_predicate_, fort_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_predicate_specific_hl_storage_modules_guts(predicate);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt58);
            }
        }
        return NIL;
    }

    public static SubLObject cb_predicate_specific_hl_storage_modules(final SubLObject args) {
        SubLObject fort_id = NIL;
        destructuring_bind_must_consp(args, args, $list63);
        fort_id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list63);
            return NIL;
        }
        final SubLObject predicate = cb_guess_fort(fort_id, UNPROVIDED);
        if (NIL == forts.fort_p(predicate)) {
            return cb_error($str64$_S_did_not_specify_a_predicate_, fort_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_predicate_specific_hl_storage_modules_guts(predicate);
    }

    public static final SubLObject cb_link_predicate_specific_hl_storage_modules_alt(SubLObject predicate, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            if (NIL == linktext) {
                linktext = $str_alt93$Predicate_Specific_Hl_Storage_Mod;
            }
            {
                SubLObject id = cb_fort_identifier(predicate);
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt94$cb_predicate_specific_hl_storage_, id);
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
            return predicate;
        }
    }

    public static SubLObject cb_link_predicate_specific_hl_storage_modules(final SubLObject predicate, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        if (NIL == linktext) {
            linktext = $str98$Predicate_Specific_Hl_Storage_Mod;
        }
        final SubLObject id = cb_fort_identifier(predicate);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str99$cb_predicate_specific_hl_storage_, id);
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
        return predicate;
    }

    public static final SubLObject cb_predicate_specific_hl_storage_modules_guts_alt(SubLObject predicate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(predicate, FORT_P);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str_alt73$Predicate_Specific_Storage_Module);
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
                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_princ($str_alt96$_storage_modules);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_hl_storage_modules(predicate);
                                SubLObject hl_module = NIL;
                                for (hl_module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , hl_module = cdolist_list_var.first()) {
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_hl_module_info(hl_module);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
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

    public static SubLObject cb_predicate_specific_hl_storage_modules_guts(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($str78$Predicate_Specific_Storage_Module);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, predicate, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_princ($$$_storage_modules);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject cdolist_list_var = cb_specific_hl_storage_modules(predicate);
                    SubLObject hl_module = NIL;
                    hl_module = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cb_display_hl_module_info(hl_module);
                        cdolist_list_var = cdolist_list_var.rest();
                        hl_module = cdolist_list_var.first();
                    } 
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$34, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_specific_hl_storage_module_predicates_alt() {
        return kb_utilities.sort_terms(hl_storage_modules.predicates_with_specific_hl_storage_modules(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_specific_hl_storage_module_predicates() {
        return kb_utilities.sort_terms(hl_storage_modules.predicates_with_specific_hl_storage_modules(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cb_specific_hl_storage_modules_alt(SubLObject predicate) {
        return Sort.sort(hl_storage_modules.hl_storage_modules_for_predicate(predicate), $sym46$TERM__, HL_MODULE_NAME);
    }

    public static SubLObject cb_specific_hl_storage_modules(final SubLObject predicate) {
        return Sort.sort(hl_storage_modules.hl_storage_modules_for_predicate(predicate), $sym51$TERM__, HL_MODULE_NAME);
    }

    public static final SubLObject cb_total_specific_hl_storage_module_count_alt() {
        {
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_hl_storage_module_predicates();
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                total = add(total, com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_hl_storage_module_count(predicate));
            }
            return total;
        }
    }

    public static SubLObject cb_total_specific_hl_storage_module_count() {
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = cb_specific_hl_storage_module_predicates();
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            total = add(total, cb_specific_hl_storage_module_count(predicate));
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return total;
    }

    public static final SubLObject cb_specific_hl_storage_module_count_alt(SubLObject predicate) {
        return length(com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_specific_hl_storage_modules(predicate));
    }

    public static SubLObject cb_specific_hl_storage_module_count(final SubLObject predicate) {
        return length(cb_specific_hl_storage_modules(predicate));
    }

    public static final SubLObject cb_display_hl_module_info_alt(SubLObject hl_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_target_definition(hl_module);
            {
                SubLObject documentation = inference_modules.hl_module_documentation_string(hl_module);
                SubLObject example = inference_modules.hl_module_example_string(hl_module);
                SubLObject exclusive = inference_modules.hl_module_exclusive_func(hl_module);
                SubLObject supplants = inference_modules.hl_module_supplants_info(hl_module);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    SubLObject _prev_bind_1 = html_macros.$html_indent_table_max$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_macros.$html_indent_table_max$.bind(TWO_INTEGER, thread);
                        {
                            SubLObject indent = ZERO_INTEGER;
                            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent_row_internal(indent);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != span) {
                                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(span);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ($str_alt97$module_);
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            cb_link($HL_MODULE, hl_module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        if ((!documentation.equal($str_alt99$)) || (!example.equal($str_alt99$))) {
                            {
                                SubLObject indent = ZERO_INTEGER;
                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent_row_internal(indent);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != span) {
                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(span);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt100$documentation__);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                            {
                                SubLObject indent = ONE_INTEGER;
                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent_row_internal(indent);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != span) {
                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(span);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (documentation.equal($str_alt99$)) {
                                                    html_princ($$$no_documentation);
                                                } else {
                                                    html_macros.verify_not_within_html_pre();
                                                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                    {
                                                        SubLObject _prev_bind_0_30 = html_macros.$within_html_pre$.currentBinding(thread);
                                                        try {
                                                            html_macros.$within_html_pre$.bind(T, thread);
                                                            html_princ_doc_string(documentation, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$within_html_pre$.rebind(_prev_bind_0_30, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                            {
                                SubLObject indent = ZERO_INTEGER;
                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent_row_internal(indent);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != span) {
                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(span);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt102$example__);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_31, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                            {
                                SubLObject indent = ONE_INTEGER;
                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent_row_internal(indent);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != span) {
                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(span);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                if (example.equal($str_alt99$)) {
                                                    html_princ($$$no_example);
                                                } else {
                                                    html_macros.verify_not_within_html_pre();
                                                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                                                    {
                                                        SubLObject _prev_bind_0_35 = html_macros.$within_html_pre$.currentBinding(thread);
                                                        try {
                                                            html_macros.$within_html_pre$.bind(T, thread);
                                                            html_princ_doc_string(example, UNPROVIDED);
                                                        } finally {
                                                            html_macros.$within_html_pre$.rebind(_prev_bind_0_35, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        } else {
                            {
                                SubLObject indent = ZERO_INTEGER;
                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent_row_internal(indent);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != span) {
                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(span);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($$$no_documentation);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        if ((NIL != exclusive) && (supplants == $ALL)) {
                            {
                                SubLObject indent = ZERO_INTEGER;
                                SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent_row_internal(indent);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != span) {
                                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(span);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_princ($str_alt105$Module_supplants__);
                                                html_princ($str_alt106$_all_other_modules);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        } else {
                            if (supplants == $ALL) {
                            } else {
                                if (supplants.isList()) {
                                    {
                                        SubLObject indent = ZERO_INTEGER;
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_indent_row_internal(indent);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (NIL != span) {
                                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(span);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ($str_alt105$Module_supplants__);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                    }
                                    {
                                        SubLObject indent = ONE_INTEGER;
                                        SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_indent_row_internal(indent);
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                if (NIL != span) {
                                                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(span);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = supplants;
                                                            SubLObject supplanted = NIL;
                                                            for (supplanted = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supplanted = cdolist_list_var.first()) {
                                                                if (supplanted != supplants.first()) {
                                                                    html_princ($str_alt68$__);
                                                                }
                                                                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_char(CHAR_hash, UNPROVIDED);
                                                                html_markup(supplanted);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_princ(supplanted);
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                            }
                                                        }
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
                                    }
                                } else {
                                    Errors.error($str_alt107$unknown_supplants_type____S, supplants);
                                }
                            }
                        }
                        html_indent_table_internal(TWO_INTEGER);
                    } finally {
                        html_macros.$html_indent_table_max$.rebind(_prev_bind_1, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject cb_display_hl_module_info(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_target_definition(hl_module);
        final SubLObject documentation = inference_modules.hl_module_documentation_string(hl_module);
        final SubLObject example = inference_modules.hl_module_example_string(hl_module);
        final SubLObject exclusive = inference_modules.hl_module_exclusive_func(hl_module);
        final SubLObject supplants = inference_modules.hl_module_supplants_info(hl_module);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = html_macros.$html_indent_table_max$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_macros.$html_indent_table_max$.bind(TWO_INTEGER, thread);
            SubLObject indent = ZERO_INTEGER;
            SubLObject span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_indent_row_internal(indent);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != span) {
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(span);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($$$module_);
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_link($HL_MODULE, hl_module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if ((!documentation.equal($str104$)) || (!example.equal($str104$))) {
                indent = ZERO_INTEGER;
                span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent_row_internal(indent);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(span);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str105$documentation__);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                indent = ONE_INTEGER;
                span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent_row_internal(indent);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(span);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (documentation.equal($str104$)) {
                            html_princ($$$no_documentation);
                        } else {
                            html_macros.verify_not_within_html_pre();
                            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$42 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                html_princ_doc_string(documentation, UNPROVIDED);
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                indent = ZERO_INTEGER;
                span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent_row_internal(indent);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(span);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str107$example__);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                indent = ONE_INTEGER;
                span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent_row_internal(indent);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(span);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (example.equal($str104$)) {
                            html_princ($$$no_example);
                        } else {
                            html_macros.verify_not_within_html_pre();
                            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$47 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                html_princ_doc_string(example, UNPROVIDED);
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$47, thread);
                            }
                            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } else {
                indent = ZERO_INTEGER;
                span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent_row_internal(indent);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(span);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($$$no_documentation);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            if ((NIL != exclusive) && (supplants == $ALL)) {
                indent = ZERO_INTEGER;
                span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_indent_row_internal(indent);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != span) {
                        html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(span);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str110$Module_supplants__);
                        html_princ($$$_all_other_modules);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } else
                if (supplants != $ALL) {
                    if (supplants.isList()) {
                        indent = ZERO_INTEGER;
                        span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent_row_internal(indent);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != span) {
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(span);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ($str110$Module_supplants__);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        indent = ONE_INTEGER;
                        span = max(ONE_INTEGER, subtract(html_macros.$html_indent_table_max$.getDynamicValue(thread), indent));
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent_row_internal(indent);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != span) {
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(span);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject cdolist_list_var = supplants;
                                SubLObject supplanted = NIL;
                                supplanted = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (!supplanted.eql(supplants.first())) {
                                        html_princ($str73$__);
                                    }
                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_hash, UNPROVIDED);
                                    html_markup(supplanted);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(supplanted);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                                    }
                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                    cdolist_list_var = cdolist_list_var.rest();
                                    supplanted = cdolist_list_var.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } else {
                        Errors.error($str112$unknown_supplants_type____S, supplants);
                    }
                }

            html_indent_table_internal(TWO_INTEGER);
        } finally {
            html_macros.$html_indent_table_max$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject cb_hl_module_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject hl_module_id = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt108);
            hl_module_id = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject hl_module = cb_glob_lookup_by_string(hl_module_id);
                    if (NIL == inference_modules.hl_module_p(hl_module)) {
                        return cb_error($str_alt109$The_inference_module__A_is_no_lon, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_hl_module_guts(hl_module);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt108);
            }
        }
        return NIL;
    }

    public static SubLObject cb_hl_module(final SubLObject args) {
        SubLObject hl_module_id = NIL;
        destructuring_bind_must_consp(args, args, $list113);
        hl_module_id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list113);
            return NIL;
        }
        final SubLObject hl_module = cb_glob_lookup_by_string(hl_module_id);
        if (NIL == inference_modules.hl_module_p(hl_module)) {
            return cb_error($str114$The_inference_module__A_is_no_lon, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_hl_module_guts(hl_module);
    }

    public static final SubLObject cb_link_hl_module_alt(SubLObject hl_module, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(hl_module, HL_MODULE_P);
            if (NIL == linktext) {
                linktext = princ_to_string(inference_modules.hl_module_name(hl_module));
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt112$cb_hl_module__A, cb_glob_id(hl_module));
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
            return hl_module;
        }
    }

    public static SubLObject cb_link_hl_module(final SubLObject hl_module, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        if (NIL == linktext) {
            linktext = princ_to_string(inference_modules.hl_module_name(hl_module));
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str117$cb_hl_module__A, cb_glob_id(hl_module));
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
        return hl_module;
    }

    public static final SubLObject cb_form_hl_module_method_alt(SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_link($HL_MODULE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_form_hl_module_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (wrap_axiomsP == UNPROVIDED) {
            wrap_axiomsP = NIL;
        }
        cb_link($HL_MODULE, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_hl_module_id_alt(SubLObject hl_module) {
        return prin1_to_string(inference_modules.hl_module_name(hl_module));
    }

    public static SubLObject cb_hl_module_id(final SubLObject hl_module) {
        return prin1_to_string(inference_modules.hl_module_name(hl_module));
    }

    public static final SubLObject cb_guess_hl_module_alt(SubLObject string) {
        return inference_modules.find_hl_module_by_name(read_from_string_ignoring_errors(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cb_guess_hl_module(final SubLObject string) {
        return inference_modules.find_hl_module_by_name(read_from_string_ignoring_errors(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject cb_hl_module_guts_alt(SubLObject hl_module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(hl_module, HL_MODULE_P);
            {
                SubLObject title = format(NIL, $str_alt115$HL_Module__A, hl_module);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
                    {
                        SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != color_value) {
                                html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(color_value));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ_strong($$$HL_Module);
                                    html_indent(UNPROVIDED);
                                    cb_link($HL_MODULE, hl_module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    html_newline(TWO_INTEGER);
                                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    if (true) {
                                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(ONE_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(TWO_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    if (true) {
                                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(TWO_INTEGER);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align($LEFT));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align($TOP));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_princ_strong($$$Property);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align($LEFT));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    if (true) {
                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_align($TOP));
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                    }
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_princ_strong($$$Value);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
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
                                                SubLObject module_var = hl_module;
                                                SubLObject cdolist_list_var = inference_modules.hl_module_properties();
                                                SubLObject property = NIL;
                                                for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , property = cdolist_list_var.first()) {
                                                    if (NIL != inference_modules.hl_module_property_not_defaultP(module_var, property)) {
                                                        {
                                                            SubLObject value = inference_modules.hl_module_property_without_values(module_var, property);
                                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(html_align($LEFT));
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(html_align($TOP));
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                                                            cb_form(property, UNPROVIDED, UNPROVIDED);
                                                                            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(html_align($LEFT));
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(html_align($TOP));
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            cb_form(value, ZERO_INTEGER, T);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                            html_source_readability_terpri(UNPROVIDED);
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_copyright_notice();
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
                                }
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                return NIL;
            }
        }
    }

    public static SubLObject cb_hl_module_guts(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_modules.hl_module_p(hl_module) : "! inference_modules.hl_module_p(hl_module) " + ("inference_modules.hl_module_p(hl_module) " + "CommonSymbols.NIL != inference_modules.hl_module_p(hl_module) ") + hl_module;
        final SubLObject title = format(NIL, $str120$HL_Module__A, hl_module);
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ(title);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$57 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$HL_Module);
                    html_indent(UNPROVIDED);
                    cb_link($HL_MODULE, hl_module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_newline(TWO_INTEGER);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ_strong($$$Property);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ_strong($$$Value);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        SubLObject cdolist_list_var = inference_modules.hl_module_properties();
                        SubLObject property = NIL;
                        property = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != inference_modules.hl_module_property_not_defaultP(hl_module, property)) {
                                final SubLObject value = inference_modules.hl_module_property_without_values(hl_module, property);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                        cb_form(property, UNPROVIDED, UNPROVIDED);
                                        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        cb_form(value, ZERO_INTEGER, T);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            property = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$57, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_evaluatable_predicates_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Evaluatable_Predicates);
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
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($EVALUATABLE_PREDICATES, $$$Evaluatable_Predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject list_var = NIL;
                                SubLObject predicate = NIL;
                                SubLObject index = NIL;
                                for (list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_gather_evaluatable_predicates(), predicate = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , predicate = list_var.first() , index = add(ONE_INTEGER, index)) {
                                    if (!index.isZero()) {
                                        html_newline(TWO_INTEGER);
                                    }
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_evaluatable_predicate(predicate);
                                }
                            }
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

    public static SubLObject cb_evaluatable_predicates(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Evaluatable_Predicates);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$66 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($EVALUATABLE_PREDICATES, $$$Evaluatable_Predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject list_var = NIL;
                    SubLObject predicate = NIL;
                    SubLObject index = NIL;
                    list_var = cb_gather_evaluatable_predicates();
                    predicate = list_var.first();
                    for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , predicate = list_var.first() , index = add(ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            html_newline(TWO_INTEGER);
                        }
                        cb_display_evaluatable_predicate(predicate);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$66, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_evaluatable_predicates_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Evaluatable_Predicates;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt122$cb_evaluatable_predicates);
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

    public static SubLObject cb_link_evaluatable_predicates(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Evaluatable_Predicates;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str127$cb_evaluatable_predicates);
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

    public static final SubLObject cb_display_evaluatable_predicate_alt(SubLObject predicate) {
        html_princ($str_alt124$predicate_);
        cb_form(predicate, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_relation_arg_signature(predicate);
        com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_evaluation_defn_example(predicate);
        return NIL;
    }

    public static SubLObject cb_display_evaluatable_predicate(final SubLObject predicate) {
        html_princ($$$predicate_);
        cb_form(predicate, UNPROVIDED, UNPROVIDED);
        cb_relation_arg_signature(predicate);
        cb_display_evaluation_defn_example(predicate);
        return NIL;
    }

    public static final SubLObject cb_gather_evaluatable_predicates_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_gather_evaluatable_predicates$.getDynamicValue(thread)) {
                {
                    SubLObject predicates = inference_kernel.new_cyc_query($list_alt125, $$EverythingPSC, $list_alt127);
                    $cb_gather_evaluatable_predicates$.setDynamicValue(kb_utilities.sort_terms(predicates, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                }
            }
            return $cb_gather_evaluatable_predicates$.getDynamicValue(thread);
        }
    }

    public static SubLObject cb_gather_evaluatable_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cb_gather_evaluatable_predicates$.getDynamicValue(thread)) {
            final SubLObject predicates = inference_kernel.new_cyc_query($list130, $$EverythingPSC, $list132);
            $cb_gather_evaluatable_predicates$.setDynamicValue(kb_utilities.sort_terms(predicates, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        return $cb_gather_evaluatable_predicates$.getDynamicValue(thread);
    }

    public static final SubLObject cb_evaluatable_predicate_count_alt() {
        return length(com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_gather_evaluatable_predicates());
    }

    public static SubLObject cb_evaluatable_predicate_count() {
        return length(cb_gather_evaluatable_predicates());
    }

    public static final SubLObject cb_evaluatable_functions_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Evaluatable_Functions);
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
                        SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            cb_link($EVALUATABLE_FUNCTIONS, $$$Evaluatable_Functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject list_var = NIL;
                                SubLObject function = NIL;
                                SubLObject index = NIL;
                                for (list_var = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_gather_evaluatable_functions(), function = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , function = list_var.first() , index = add(ONE_INTEGER, index)) {
                                    if (!index.isZero()) {
                                        html_newline(TWO_INTEGER);
                                    }
                                    com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_evaluatable_function(function);
                                }
                            }
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
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

    public static SubLObject cb_evaluatable_functions(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str2$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str3$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$Evaluatable_Functions);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$68 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    cb_link($EVALUATABLE_FUNCTIONS, $$$Evaluatable_Functions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    SubLObject list_var = NIL;
                    SubLObject function = NIL;
                    SubLObject index = NIL;
                    list_var = cb_gather_evaluatable_functions();
                    function = list_var.first();
                    for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , function = list_var.first() , index = add(ONE_INTEGER, index)) {
                        if (!index.isZero()) {
                            html_newline(TWO_INTEGER);
                        }
                        cb_display_evaluatable_function(function);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$68, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static final SubLObject cb_link_evaluatable_functions_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $$$Evaluatable_Functions;
            }
            {
                SubLObject frame_name_var = cb_frame_name($SELF);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt129$cb_evaluatable_functions);
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

    public static SubLObject cb_link_evaluatable_functions(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Evaluatable_Functions;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str134$cb_evaluatable_functions);
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

    public static final SubLObject cb_display_evaluatable_function_alt(SubLObject function) {
        html_princ($str_alt131$function_);
        cb_form(function, UNPROVIDED, UNPROVIDED);
        com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_relation_arg_signature(function);
        com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_function_result_type(function);
        com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_display_evaluation_defn_example(function);
        return NIL;
    }

    public static SubLObject cb_display_evaluatable_function(final SubLObject function) {
        html_princ($$$function_);
        cb_form(function, UNPROVIDED, UNPROVIDED);
        cb_relation_arg_signature(function);
        cb_function_result_type(function);
        cb_display_evaluation_defn_example(function);
        return NIL;
    }

    public static final SubLObject cb_function_result_type_alt(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            html_princ($str_alt132$____);
            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject result_isa = kb_accessors.result_isa(function, NIL);
                        if (result_isa.isList()) {
                            result_isa = result_isa.first();
                        }
                        if (NIL == result_isa) {
                            result_isa = $$Thing;
                        }
                        cb_form(result_isa, UNPROVIDED, UNPROVIDED);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_function_result_type(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_princ($str137$____);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject result_isa = kb_accessors.result_isa(function, NIL);
            if (result_isa.isList()) {
                result_isa = result_isa.first();
            }
            if (NIL == result_isa) {
                result_isa = $$Thing;
            }
            cb_form(result_isa, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_gather_evaluatable_functions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $cb_gather_evaluatable_functions$.getDynamicValue(thread)) {
                {
                    SubLObject functions = inference_kernel.new_cyc_query($list_alt135, $$EverythingPSC, $list_alt136);
                    $cb_gather_evaluatable_functions$.setDynamicValue(kb_utilities.sort_terms(functions, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                }
            }
            return $cb_gather_evaluatable_functions$.getDynamicValue(thread);
        }
    }

    public static SubLObject cb_gather_evaluatable_functions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $cb_gather_evaluatable_functions$.getDynamicValue(thread)) {
            final SubLObject functions = inference_kernel.new_cyc_query($list140, $$EverythingPSC, $list141);
            $cb_gather_evaluatable_functions$.setDynamicValue(kb_utilities.sort_terms(functions, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        }
        return $cb_gather_evaluatable_functions$.getDynamicValue(thread);
    }

    public static final SubLObject cb_evaluatable_function_count_alt() {
        return length(com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.cb_gather_evaluatable_functions());
    }

    public static SubLObject cb_evaluatable_function_count() {
        return length(cb_gather_evaluatable_functions());
    }

    public static final SubLObject cb_relation_arg_signature_alt(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            html_princ($str_alt137$___);
            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject argsisa = kb_accessors.args_isa(relation, NIL);
                        if (NIL != argsisa) {
                            html_princ($str_alt138$_);
                            cb_form(argsisa.first(), UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            html_princ($str_alt139$______);
                            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                        } else {
                            {
                                SubLObject v_arity = arity.arity(relation);
                                if (v_arity.isInteger()) {
                                    html_princ($str_alt138$_);
                                    {
                                        SubLObject index = NIL;
                                        for (index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                                            {
                                                SubLObject arg = add(index, ONE_INTEGER);
                                                if (!arg.numE(ONE_INTEGER)) {
                                                    html_indent(UNPROVIDED);
                                                }
                                                {
                                                    SubLObject argn_isa = kb_accessors.argn_isa(relation, arg, NIL);
                                                    if (argn_isa.isList()) {
                                                        argn_isa = argn_isa.first();
                                                    }
                                                    if (NIL == argn_isa) {
                                                        argn_isa = $$Thing;
                                                    }
                                                    cb_form(argn_isa, UNPROVIDED, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                    html_princ($str_alt140$_);
                                } else {
                                    html_princ($str_alt141$___);
                                }
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject cb_relation_arg_signature(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_princ($str142$___);
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject argsisa = kb_accessors.args_isa(relation, NIL);
            if (NIL != argsisa) {
                html_princ($str143$_);
                cb_form(argsisa.first(), UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                html_princ($str144$______);
                html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            } else {
                final SubLObject v_arity = arity.arity(relation);
                if (v_arity.isInteger()) {
                    html_princ($str143$_);
                    SubLObject index;
                    SubLObject arg;
                    SubLObject argn_isa;
                    for (index = NIL, index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                        arg = add(index, ONE_INTEGER);
                        if (!arg.numE(ONE_INTEGER)) {
                            html_indent(UNPROVIDED);
                        }
                        argn_isa = kb_accessors.argn_isa(relation, arg, NIL);
                        if (argn_isa.isList()) {
                            argn_isa = argn_isa.first();
                        }
                        if (NIL == argn_isa) {
                            argn_isa = $$Thing;
                        }
                        cb_form(argn_isa, UNPROVIDED, UNPROVIDED);
                    }
                    html_princ($str145$_);
                } else {
                    html_princ($str146$___);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cb_display_evaluation_defn_example_alt(SubLObject relation) {
        {
            SubLObject defn = relation_evaluation.evaluation_defn(relation, NIL);
            if (defn.isSymbol() && (NIL != fboundp(defn))) {
                {
                    SubLObject example = com.cyc.cycjava.cycl.inference.browser.cb_hl_module_summary.evaluation_defn_example(defn);
                    if (example.isString()) {
                        html_newline(UNPROVIDED);
                        html_princ($str_alt142$example___);
                        html_princ_doc_string(example, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_display_evaluation_defn_example(final SubLObject relation) {
        final SubLObject defn = relation_evaluation.evaluation_defn(relation, NIL);
        if (defn.isSymbol() && (NIL != fboundp(defn))) {
            final SubLObject example = evaluation_defn_example(defn);
            if (example.isString()) {
                html_newline(UNPROVIDED);
                html_princ($str147$example___);
                html_princ_doc_string(example, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject evaluation_defn_example_alt(SubLObject defn) {
        return get(defn, $EXAMPLE, NIL);
    }

    public static SubLObject evaluation_defn_example(final SubLObject defn) {
        return get(defn, $EXAMPLE, NIL);
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
        defparameter("*CB-GATHER-EVALUATABLE-PREDICATES*", NIL);
        defparameter("*CB-GATHER-EVALUATABLE-FUNCTIONS*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cb_hl_module_summary_file_alt() {
        sethash($CB_HL_MODULE_SUMMARY, $cb_help_definitions$.getGlobalValue(), list($str_alt1$cb_hl_module_summary_html, NIL));
        html_macros.note_html_handler_function(CB_HL_MODULE_SUMMARY);
        setup_cb_link_method($HL_MODULE_INDEX, CB_LINK_HL_MODULE_INDEX, TWO_INTEGER);
        cyc_navigator_internals.def_navigator_link($HL_MODULE_SUMMARY, $TEXT, $list_alt41, $str_alt37$cb_hl_module_summary, ZERO_INTEGER, $MAIN, $$$HL_Module_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_macros.note_html_handler_function(CB_TRANSFORMATION_MODULES);
        setup_cb_link_method($TRANSFORMATION_MODULES, CB_LINK_TRANSFORMATION_MODULES, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_GENERIC_REMOVAL_MODULES);
        setup_cb_link_method($GENERIC_REMOVAL_MODULES, CB_LINK_GENERIC_REMOVAL_MODULES, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_GENERIC_PREFERENCE_MODULES);
        setup_cb_link_method($GENERIC_PREFERENCE_MODULES, CB_LINK_GENERIC_PREFERENCE_MODULES, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_CONJUNCTIVE_REMOVAL_MODULES);
        setup_cb_link_method($CONJUNCTIVE_REMOVAL_MODULES, CB_LINK_CONJUNCTIVE_REMOVAL_MODULES, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_PREDICATE_SPECIFIC_REMOVAL_MODULES);
        setup_cb_link_method($PREDICATE_SPECIFIC_REMOVAL_MODULES, CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES);
        setup_cb_link_method($PREDICATE_SPECIFIC_PREFERENCE_MODULES, CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_REWRITE_MODULES);
        setup_cb_link_method($REWRITE_MODULES, CB_LINK_REWRITE_MODULES, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_FORWARD_MODULES);
        setup_cb_link_method($FORWARD_MODULES, CB_LINK_FORWARD_MODULES, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_HL_STORAGE_MODULES);
        setup_cb_link_method($HL_STORAGE_MODULES, CB_LINK_HL_STORAGE_MODULES, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_GENERIC_HL_STORAGE_MODULES);
        setup_cb_link_method($GENERIC_HL_STORAGE_MODULES, CB_LINK_GENERIC_HL_STORAGE_MODULES, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES);
        setup_cb_link_method($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES, TWO_INTEGER);
        html_macros.note_html_handler_function(CB_HL_MODULE);
        setup_cb_link_method($HL_MODULE, CB_LINK_HL_MODULE, TWO_INTEGER);
        register_method($cb_form_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), symbol_function(CB_FORM_HL_MODULE_METHOD));
        html_macros.note_html_handler_function(CB_EVALUATABLE_PREDICATES);
        setup_cb_link_method($EVALUATABLE_PREDICATES, CB_LINK_EVALUATABLE_PREDICATES, ONE_INTEGER);
        html_macros.note_html_handler_function(CB_EVALUATABLE_FUNCTIONS);
        setup_cb_link_method($EVALUATABLE_FUNCTIONS, CB_LINK_EVALUATABLE_FUNCTIONS, ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_cb_hl_module_summary_file() {
        if (SubLFiles.USE_V1) {
            sethash($CB_HL_MODULE_SUMMARY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_hl_module_summary_html, NIL));
            html_macros.note_cgi_handler_function(CB_HL_MODULE_SUMMARY, $HTML_HANDLER);
            setup_cb_link_method($HL_MODULE_INDEX, CB_LINK_HL_MODULE_INDEX, TWO_INTEGER);
            cyc_navigator_internals.def_navigator_link($HL_MODULE_SUMMARY, $TEXT, $list46, $str42$cb_hl_module_summary, ZERO_INTEGER, $MAIN, $$$HL_Module_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_macros.note_cgi_handler_function(CB_TRANSFORMATION_MODULES, $HTML_HANDLER);
            setup_cb_link_method($TRANSFORMATION_MODULES, CB_LINK_TRANSFORMATION_MODULES, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_GENERIC_REMOVAL_MODULES, $HTML_HANDLER);
            setup_cb_link_method($GENERIC_REMOVAL_MODULES, CB_LINK_GENERIC_REMOVAL_MODULES, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_GENERIC_PREFERENCE_MODULES, $HTML_HANDLER);
            setup_cb_link_method($GENERIC_PREFERENCE_MODULES, CB_LINK_GENERIC_PREFERENCE_MODULES, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_CONJUNCTIVE_REMOVAL_MODULES, $HTML_HANDLER);
            setup_cb_link_method($CONJUNCTIVE_REMOVAL_MODULES, CB_LINK_CONJUNCTIVE_REMOVAL_MODULES, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_PREDICATE_SPECIFIC_REMOVAL_MODULES, $HTML_HANDLER);
            setup_cb_link_method($PREDICATE_SPECIFIC_REMOVAL_MODULES, CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES, $HTML_HANDLER);
            setup_cb_link_method($PREDICATE_SPECIFIC_PREFERENCE_MODULES, CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_REWRITE_MODULES, $HTML_HANDLER);
            setup_cb_link_method($REWRITE_MODULES, CB_LINK_REWRITE_MODULES, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_FORWARD_MODULES, $HTML_HANDLER);
            setup_cb_link_method($FORWARD_MODULES, CB_LINK_FORWARD_MODULES, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_HL_STORAGE_MODULES, $HTML_HANDLER);
            setup_cb_link_method($HL_STORAGE_MODULES, CB_LINK_HL_STORAGE_MODULES, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_GENERIC_HL_STORAGE_MODULES, $HTML_HANDLER);
            setup_cb_link_method($GENERIC_HL_STORAGE_MODULES, CB_LINK_GENERIC_HL_STORAGE_MODULES, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES, $HTML_HANDLER);
            setup_cb_link_method($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES, TWO_INTEGER);
            html_macros.note_cgi_handler_function(CB_HL_MODULE, $HTML_HANDLER);
            setup_cb_link_method($HL_MODULE, CB_LINK_HL_MODULE, TWO_INTEGER);
            register_method($cb_form_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), symbol_function(CB_FORM_HL_MODULE_METHOD));
            html_macros.note_cgi_handler_function(CB_EVALUATABLE_PREDICATES, $HTML_HANDLER);
            setup_cb_link_method($EVALUATABLE_PREDICATES, CB_LINK_EVALUATABLE_PREDICATES, ONE_INTEGER);
            html_macros.note_cgi_handler_function(CB_EVALUATABLE_FUNCTIONS, $HTML_HANDLER);
            setup_cb_link_method($EVALUATABLE_FUNCTIONS, CB_LINK_EVALUATABLE_FUNCTIONS, ONE_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_HL_MODULE_SUMMARY);
            cyc_navigator_internals.def_navigator_link($HL_MODULE_SUMMARY, $TEXT, $list_alt41, $str_alt37$cb_hl_module_summary, ZERO_INTEGER, $MAIN, $$$HL_Module_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_macros.note_html_handler_function(CB_TRANSFORMATION_MODULES);
            html_macros.note_html_handler_function(CB_GENERIC_REMOVAL_MODULES);
            html_macros.note_html_handler_function(CB_GENERIC_PREFERENCE_MODULES);
            html_macros.note_html_handler_function(CB_CONJUNCTIVE_REMOVAL_MODULES);
            html_macros.note_html_handler_function(CB_PREDICATE_SPECIFIC_REMOVAL_MODULES);
            html_macros.note_html_handler_function(CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES);
            html_macros.note_html_handler_function(CB_REWRITE_MODULES);
            html_macros.note_html_handler_function(CB_FORWARD_MODULES);
            html_macros.note_html_handler_function(CB_HL_STORAGE_MODULES);
            html_macros.note_html_handler_function(CB_GENERIC_HL_STORAGE_MODULES);
            html_macros.note_html_handler_function(CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES);
            html_macros.note_html_handler_function(CB_HL_MODULE);
            html_macros.note_html_handler_function(CB_EVALUATABLE_PREDICATES);
            html_macros.note_html_handler_function(CB_EVALUATABLE_FUNCTIONS);
        }
        return NIL;
    }

    public static SubLObject setup_cb_hl_module_summary_file_Previous() {
        sethash($CB_HL_MODULE_SUMMARY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_hl_module_summary_html, NIL));
        html_macros.note_cgi_handler_function(CB_HL_MODULE_SUMMARY, $HTML_HANDLER);
        setup_cb_link_method($HL_MODULE_INDEX, CB_LINK_HL_MODULE_INDEX, TWO_INTEGER);
        cyc_navigator_internals.def_navigator_link($HL_MODULE_SUMMARY, $TEXT, $list46, $str42$cb_hl_module_summary, ZERO_INTEGER, $MAIN, $$$HL_Module_Summary, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_macros.note_cgi_handler_function(CB_TRANSFORMATION_MODULES, $HTML_HANDLER);
        setup_cb_link_method($TRANSFORMATION_MODULES, CB_LINK_TRANSFORMATION_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_GENERIC_REMOVAL_MODULES, $HTML_HANDLER);
        setup_cb_link_method($GENERIC_REMOVAL_MODULES, CB_LINK_GENERIC_REMOVAL_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_GENERIC_PREFERENCE_MODULES, $HTML_HANDLER);
        setup_cb_link_method($GENERIC_PREFERENCE_MODULES, CB_LINK_GENERIC_PREFERENCE_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_CONJUNCTIVE_REMOVAL_MODULES, $HTML_HANDLER);
        setup_cb_link_method($CONJUNCTIVE_REMOVAL_MODULES, CB_LINK_CONJUNCTIVE_REMOVAL_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_PREDICATE_SPECIFIC_REMOVAL_MODULES, $HTML_HANDLER);
        setup_cb_link_method($PREDICATE_SPECIFIC_REMOVAL_MODULES, CB_LINK_PREDICATE_SPECIFIC_REMOVAL_MODULES, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_PREDICATE_SPECIFIC_PREFERENCE_MODULES, $HTML_HANDLER);
        setup_cb_link_method($PREDICATE_SPECIFIC_PREFERENCE_MODULES, CB_LINK_PREDICATE_SPECIFIC_PREFERENCE_MODULES, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_REWRITE_MODULES, $HTML_HANDLER);
        setup_cb_link_method($REWRITE_MODULES, CB_LINK_REWRITE_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_FORWARD_MODULES, $HTML_HANDLER);
        setup_cb_link_method($FORWARD_MODULES, CB_LINK_FORWARD_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_HL_STORAGE_MODULES, $HTML_HANDLER);
        setup_cb_link_method($HL_STORAGE_MODULES, CB_LINK_HL_STORAGE_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_GENERIC_HL_STORAGE_MODULES, $HTML_HANDLER);
        setup_cb_link_method($GENERIC_HL_STORAGE_MODULES, CB_LINK_GENERIC_HL_STORAGE_MODULES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_PREDICATE_SPECIFIC_HL_STORAGE_MODULES, $HTML_HANDLER);
        setup_cb_link_method($PREDICATE_SPECIFIC_HL_STORAGE_MODULES, CB_LINK_PREDICATE_SPECIFIC_HL_STORAGE_MODULES, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_HL_MODULE, $HTML_HANDLER);
        setup_cb_link_method($HL_MODULE, CB_LINK_HL_MODULE, TWO_INTEGER);
        register_method($cb_form_method_table$.getGlobalValue(), inference_modules.$dtp_hl_module$.getGlobalValue(), symbol_function(CB_FORM_HL_MODULE_METHOD));
        html_macros.note_cgi_handler_function(CB_EVALUATABLE_PREDICATES, $HTML_HANDLER);
        setup_cb_link_method($EVALUATABLE_PREDICATES, CB_LINK_EVALUATABLE_PREDICATES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_EVALUATABLE_FUNCTIONS, $HTML_HANDLER);
        setup_cb_link_method($EVALUATABLE_FUNCTIONS, CB_LINK_EVALUATABLE_FUNCTIONS, ONE_INTEGER);
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

    

    static private final SubLString $str_alt1$cb_hl_module_summary_html = makeString("cb-hl-module-summary.html");

    static private final SubLString $str_alt7$___S_total_ = makeString(" (~S total)");

    static private final SubLString $str_alt10$_SpecificRemovalModules = makeString("#SpecificRemovalModules");

    static private final SubLString $str_alt14$_SpecificPreferenceModules = makeString("#SpecificPreferenceModules");

    static private final SubLString $str_alt29$Specific_Removal_Modules__ = makeString("Specific Removal Modules :");

    static private final SubLString $str_alt31$_literals = makeString(" literals");

    static private final SubLString $str_alt33$Specific_Preference_Modules__ = makeString("Specific Preference Modules :");

    static private final SubLString $str_alt37$cb_hl_module_summary = makeString("cb-hl-module-summary");

    static private final SubLList $list_alt41 = list(makeKeyword("INFERENCE"));

    static private final SubLString $str_alt44$cb_transformation_modules = makeString("cb-transformation-modules");

    static private final SubLSymbol $sym46$TERM__ = makeSymbol("TERM-<");

    static private final SubLString $str_alt49$cb_generic_removal_modules = makeString("cb-generic-removal-modules");

    static private final SubLString $str_alt52$cb_generic_preference_modules = makeString("cb-generic-preference-modules");

    static private final SubLString $str_alt56$cb_conjunctive_removal_modules = makeString("cb-conjunctive-removal-modules");

    static private final SubLList $list_alt58 = list(makeSymbol("FORT-ID"));

    static private final SubLString $str_alt59$_S_did_not_specify_a_predicate_ = makeString("~S did not specify a predicate.");

    static private final SubLString $str_alt62$Predicate_Specific_Removal_Module = makeString("Predicate Specific Removal Modules");

    static private final SubLString $str_alt63$cb_predicate_specific_removal_mod = makeString("cb-predicate-specific-removal-modules&~A");

    static private final SubLString $str_alt65$_removal_modules = makeString(" removal modules");

    static private final SubLString $str_alt66$The_following_generic_modules_are = makeString("The following generic modules are also used for ");

    static private final SubLString $str_alt67$_literals__ = makeString(" literals :");

    static private final SubLString $str_alt68$__ = makeString(", ");

    static private final SubLString $str_alt70$Predicate_Specific_Preference_Mod = makeString("Predicate Specific Preference Modules");

    static private final SubLString $str_alt71$cb_predicate_specific_preference_ = makeString("cb-predicate-specific-preference-modules&~A");

    static private final SubLString $str_alt73$Predicate_Specific_Storage_Module = makeString("Predicate Specific Storage Modules");

    static private final SubLString $str_alt74$_preference_modules = makeString(" preference modules");

    static private final SubLString $str_alt76$cb_rewrite_modules = makeString("cb-rewrite-modules");

    static private final SubLString $str_alt79$cb_forward_modules = makeString("cb-forward-modules");

    static private final SubLString $str_alt83$Predicate_Specific_Storage_Module = makeString("Predicate Specific Storage Modules :");

    static private final SubLString $str_alt85$_modules = makeString(" modules");

    static private final SubLString $str_alt87$cb_hl_storage_modules = makeString("cb-hl-storage-modules");

    static private final SubLString $str_alt90$cb_generic_hl_storage_modules = makeString("cb-generic-hl-storage-modules");

    static private final SubLString $str_alt93$Predicate_Specific_Hl_Storage_Mod = makeString("Predicate Specific Hl-Storage Modules");

    static private final SubLString $str_alt94$cb_predicate_specific_hl_storage_ = makeString("cb-predicate-specific-hl-storage-modules&~A");

    static private final SubLString $str_alt96$_storage_modules = makeString(" storage modules");

    static private final SubLString $str_alt97$module_ = makeString("module ");

    static private final SubLString $str_alt100$documentation__ = makeString("documentation :");

    static private final SubLString $str_alt102$example__ = makeString("example :");

    static private final SubLString $str_alt105$Module_supplants__ = makeString("Module supplants :");

    static private final SubLString $str_alt106$_all_other_modules = makeString(" all other modules");

    static private final SubLString $str_alt107$unknown_supplants_type____S = makeString("unknown supplants type : ~S");

    static private final SubLList $list_alt108 = list(makeSymbol("HL-MODULE-ID"));

    static private final SubLString $str_alt109$The_inference_module__A_is_no_lon = makeString("The inference module ~A is no longer available.");

    static private final SubLString $str_alt112$cb_hl_module__A = makeString("cb-hl-module&~A");

    static private final SubLString $str_alt115$HL_Module__A = makeString("HL Module ~A");

    static private final SubLString $str_alt122$cb_evaluatable_predicates = makeString("cb-evaluatable-predicates");

    static private final SubLString $str_alt124$predicate_ = makeString("predicate ");

    static private final SubLList $list_alt125 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("knownSentence"), list(reader_make_constant_shell("isa"), makeSymbol("?PRED"), reader_make_constant_shell("EvaluatablePredicate"))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("evaluationDefn"), makeSymbol("?PRED"), makeSymbol("?DEFN"))), list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(makeSymbol("?DEFN")), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(QUOTE, makeSymbol("?DEFN"))))))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("evaluationDefn"), makeSymbol("?PRED"), makeSymbol("?DEFN"))), list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("SubLQuoteFn"), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(QUOTE, makeSymbol("?DEFN"))))))), list(reader_make_constant_shell("assertedPredicateArg"), makeSymbol("?PRED"), ONE_INTEGER, reader_make_constant_shell("expansion"))));

    static private final SubLList $list_alt127 = list(new SubLObject[]{ makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-UNION"), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?PRED")) });

    static private final SubLString $str_alt129$cb_evaluatable_functions = makeString("cb-evaluatable-functions");

    static private final SubLString $str_alt131$function_ = makeString("function ");

    static private final SubLString $str_alt132$____ = makeString(" -> ");

    static private final SubLList $list_alt135 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("knownSentence"), list(reader_make_constant_shell("isa"), makeSymbol("?FUNC"), reader_make_constant_shell("EvaluatableFunction"))), list(reader_make_constant_shell("or"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("evaluationDefn"), makeSymbol("?FUNC"), makeSymbol("?DEFN"))), list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("ExpandSubLFn"), list(makeSymbol("?DEFN")), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(QUOTE, makeSymbol("?DEFN"))))))), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("evaluationDefn"), makeSymbol("?FUNC"), makeSymbol("?DEFN"))), list(reader_make_constant_shell("trueSubL"), list(reader_make_constant_shell("SubLQuoteFn"), list(makeSymbol("FBOUNDP"), list(makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), list(QUOTE, makeSymbol("?DEFN"))))))), list(reader_make_constant_shell("assertedPredicateArg"), makeSymbol("?FUNC"), ONE_INTEGER, reader_make_constant_shell("expansion"))));

    static private final SubLList $list_alt136 = list(new SubLObject[]{ makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-UNION"), makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), $NONE, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), makeSymbol("?FUNC")) });

    static private final SubLString $str_alt137$___ = makeString(" : ");

    static private final SubLString $str_alt138$_ = makeString("(");

    static private final SubLString $str_alt139$______ = makeString(" ... )");

    static private final SubLString $str_alt140$_ = makeString(")");

    static private final SubLString $str_alt141$___ = makeString(" ? ");

    static private final SubLString $str_alt142$example___ = makeString("example : ");
}

/**
 * Total time: 1130 ms
 */
