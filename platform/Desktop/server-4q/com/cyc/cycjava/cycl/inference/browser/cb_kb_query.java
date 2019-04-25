package com.cyc.cycjava.cycl.inference.browser;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cb_assertion_editor;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.cb_tools;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cb_editor;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cb_form_widgets;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_kb_query extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_kb_query";
    public static final String myFingerPrint = "25761554e88d7e3e847a639d0d30f994e2f499d04f33be924c259d7d7984e574";
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 842L)
    private static SubLSymbol $kbq_inference_query_spec_map$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 17691L)
    private static SubLSymbol $cb_multiple_choice_max_options$;
    private static final SubLInteger $int0$1024;
    private static final SubLSymbol $sym1$INFERENCE_P;
    private static final SubLSymbol $sym2$KBQ_QUERY_SPEC_P;
    private static final SubLString $str3$_Ask_Query_;
    private static final SubLSymbol $kw4$MAIN;
    private static final SubLString $str5$cb_ask_kb_query__a;
    private static final SubLSymbol $kw6$KBQ_ASK;
    private static final SubLSymbol $sym7$CB_LINK_KBQ_ASK;
    private static final SubLSymbol $sym8$CB_ASK_KB_QUERY;
    private static final SubLSymbol $kw9$HTML_HANDLER;
    private static final SubLSymbol $sym10$CB_ADD_TO_PROOF_CHECKER_RULES;
    private static final SubLSymbol $kw11$ALLOWED_RULES;
    private static final SubLString $str12$_Proof_check_Query_;
    private static final SubLString $str13$cb_ask_kb_query_in_proof_checker_;
    private static final SubLSymbol $kw14$KBQ_ASK_IN_PROOF_CHECKER;
    private static final SubLSymbol $sym15$CB_LINK_KBQ_ASK_IN_PROOF_CHECKER;
    private static final SubLSymbol $sym16$CB_ASK_KB_QUERY_IN_PROOF_CHECKER;
    private static final SubLObject $const17$queryPracticeRules;
    private static final SubLString $str18$_Save_As_Query_;
    private static final SubLSymbol $kw19$SELF;
    private static final SubLSymbol $kw20$OVERLIB;
    private static final SubLString $str21$Create_an_instance_of___CycLQuery;
    private static final SubLString $str22$cb_save_as_query__A__A;
    private static final SubLString $str23$nd___;
    private static final SubLSymbol $kw24$KBQ_SAVE;
    private static final SubLSymbol $sym25$CB_LINK_KBQ_SAVE;
    private static final SubLList $list26;
    private static final SubLString $str27$Inference__S_in_problem_store__S_;
    private static final SubLSymbol $sym28$CB_SAVE_AS_QUERY;
    private static final SubLString $str29$_Edit_Query_;
    private static final SubLString $str30$Edit_the_sentence__microtheory__i;
    private static final SubLString $str31$cb_edit_query__A;
    private static final SubLSymbol $kw32$KBQ_EDIT;
    private static final SubLSymbol $sym33$CB_LINK_KBQ_EDIT;
    private static final SubLString $str34$_A_does_not_denote_a_query_specif;
    private static final SubLSymbol $sym35$CB_EDIT_QUERY;
    private static final SubLString $str36$Edit_Query_Specification;
    private static final SubLString $str37$Save_Inference_Settings_as_Query_;
    private static final SubLString $str38$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str39$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw40$UNINITIALIZED;
    private static final SubLString $str41$yui_skin_sam;
    private static final SubLString $str42$post;
    private static final SubLString $str43$cb_handle_confirm_save_as_query;
    private static final SubLString $str44$The_interface_for_creating_and_ed;
    private static final SubLString $str45$Save_As_Query;
    private static final SubLString $str46$Goto_section__;
    private static final SubLString $str47$Shortcut_links_to_sections_that_a;
    private static final SubLString $str48$mt_section;
    private static final SubLString $str49$_Mt_;
    private static final SubLString $str50$Change_the_Microtheory_settings_t;
    private static final SubLString $str51$sentence_section;
    private static final SubLString $str52$_Sentence_;
    private static final SubLString $str53$Change_the_CycL_sentence_to_be_us;
    private static final SubLString $str54$parameters_section;
    private static final SubLString $str55$_Inference_Parameters_;
    private static final SubLString $str56$Adjust_the_inference_parameters_a;
    private static final SubLString $str57$multiple_choice_section;
    private static final SubLString $str58$_Multiple_Choice_;
    private static final SubLString $str59$If_this_query_is_to_be_a_multiple;
    private static final SubLString $str60$Save_As_New_Query;
    private static final SubLString $str61$Creates_a_new___CycLQuerySpecific;
    private static final SubLString $str62$new;
    private static final SubLString $str63$Name__;
    private static final SubLString $str64$The_constant_name_to_save_the_que;
    private static final SubLString $str65$name;
    private static final SubLInteger $int66$40;
    private static final SubLString $str67$Overwrite_Existing_Query;
    private static final SubLString $str68$Overwrites_the_existing_query_spe;
    private static final SubLString $str69$overwrite;
    private static final SubLString $str70$Reset_Values;
    private static final SubLString $str71$cb_kbq_save_mt;
    private static final SubLString $str72$Show;
    private static final SubLString $str73$Hide;
    private static final SubLSymbol $kw74$VISIBLE;
    private static final SubLString $str75$Save_In_Mt__;
    private static final SubLString $str76$The_microtheory_in_which_to_save_;
    private static final SubLSymbol $kw77$PARAGRAPH;
    private static final SubLList $list78;
    private static final SubLString $str79$comment_section;
    private static final SubLString $str80$query_comment;
    private static final SubLString $str81$Query_Comment__optional_;
    private static final SubLString $str82$Specify_a_comment_for_the_CycLQue;
    private static final SubLString $str83$comment;
    private static final SubLString $str84$Add_a_Comment__;
    private static final SubLString $str85$new_comment;
    private static final SubLInteger $int86$80;
    private static final SubLString $str87$virtual;
    private static final SubLString $str88$;
    private static final SubLString $str89$cb_query_inference_mt;
    private static final SubLString $str90$Query_Mt;
    private static final SubLString $str91$The_microtheory_in_which_the_quer;
    private static final SubLString $str92$query_sentence;
    private static final SubLString $str93$Query_Sentence;
    private static final SubLString $str94$The_CycL_Sentence_for_the_query_;
    private static final SubLString $str95$pragmatics_section;
    private static final SubLString $str96$query_pragmatics;
    private static final SubLString $str97$Query_Pragmatics;
    private static final SubLString $str98$An_optional_sentence_that_will_co;
    private static final SubLSymbol $kw99$INVISIBLE;
    private static final SubLString $str100$inference_parameters;
    private static final SubLString $str101$Inference_Parameters;
    private static final SubLString $str102$The_inference_parameters_and_reso;
    private static final SubLString $str103$multiple_choice;
    private static final SubLString $str104$Multiple_Choice_Options;
    private static final SubLString $str105$mc_option_number_;
    private static final SubLString $str106$_0;
    private static final SubLString $str107$mc_option_full_label_;
    private static final SubLString $str108$mc_option_index_label_;
    private static final SubLList $list109;
    private static final SubLString $str110$_;
    private static final SubLString $str111$_;
    private static final SubLString $str112$Option___;
    private static final SubLString $str113$Full_label__;
    private static final SubLString $str114$A_label_that_fully_describes_this;
    private static final SubLInteger $int115$30;
    private static final SubLString $str116$Index_label__;
    private static final SubLString $str117$A_label_serving_as_a_unique_index;
    private static final SubLString $str118$mc_option_binding_;
    private static final SubLString $str119$_;
    private static final SubLString $str120$Binding_for__A__;
    private static final SubLString $str121$red;
    private static final SubLString $str122$A_query_specification_can_have_on;
    private static final SubLString $str123$A_query_specification_can_have_on;
    private static final SubLString $str124$_A;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLSymbol $kw128$NEW;
    private static final SubLSymbol $kw129$OVERWRITE;
    private static final SubLString $str130$Unknown_query_save_method__A;
    private static final SubLSymbol $sym131$CB_HANDLE_CONFIRM_SAVE_AS_QUERY;
    private static final SubLSymbol $kw132$UNKNOWN;
    private static final SubLString $str133$query_spec;
    private static final SubLString $str134$No_name_was_specified_;
    private static final SubLString $str135$gloss;
    private static final SubLString $str136$new_gloss;
    private static final SubLString $str137$folder;
    private static final SubLString $str138$new_folder;
    private static final SubLString $str139$new_folder_mt;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLString $str142$mc_option_;
    private static final SubLList $list143;
    private static final SubLList $list144;
    private static final SubLString $str145$number;
    private static final SubLSymbol $kw146$NUMBER;
    private static final SubLString $str147$full_label;
    private static final SubLSymbol $kw148$FULL_LABEL;
    private static final SubLString $str149$index_label;
    private static final SubLSymbol $kw150$INDEX_LABEL;
    private static final SubLString $str151$binding;
    private static final SubLString $str152$BINDING_;
    private static final SubLString $str153$Unexpected_multiple_choice_option;
    private static final SubLSymbol $kw154$NOT_FOUND;
    private static final SubLSymbol $sym155$SAFE__;
    private static final SubLSymbol $sym156$FIRST;
    private static final SubLString $str157$Save_Query_Specification;
    private static final SubLString $str158$_A_is_not_a_valid_constant_name_;
    private static final SubLString $str159$Already_a_constant_named__A;
    private static final SubLString $str160$Constant__S_already_exists_which_;
    private static final SubLString $str161$Overwrite_Query_Specification;
    private static final SubLString $str162$_A_is_not_the_name_of_a_CycLQuery;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 975L)
    public static SubLObject kbq_register_query_spec_of_inference(final SubLObject inference, final SubLObject query_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_kb_query.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        assert cb_kb_query.NIL != kb_query.kbq_query_spec_p(query_spec) : query_spec;
        return Hashtables.sethash(inference, cb_kb_query.$kbq_inference_query_spec_map$.getDynamicValue(thread), query_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 1291L)
    public static SubLObject kbq_deregister_query_spec_of_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_kb_query.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        return Hashtables.remhash(inference, cb_kb_query.$kbq_inference_query_spec_map$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 1515L)
    public static SubLObject kbq_lookup_query_spec_by_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_kb_query.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        return Hashtables.gethash(inference, cb_kb_query.$kbq_inference_query_spec_map$.getDynamicValue(thread), (SubLObject)cb_kb_query.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 1761L)
    public static SubLObject cb_kb_query_from_query_spec(final SubLObject query_spec) {
        final SubLObject sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        final SubLObject non_explanatory_sentence = kb_query.kbq_pragmatics(query_spec);
        final SubLObject v_properties = inference_strategist.implicify_inference_mode_defaults(inference_parameters.explicify_inference_engine_query_property_defaults(kb_query.kbq_query_properties(query_spec)));
        return cb_query.cb_kb_query(sentence, mt, v_properties, query_spec, non_explanatory_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 2241L)
    public static SubLObject cb_link_kbq_ask(final SubLObject query_spec, SubLObject linktext) {
        if (linktext == cb_kb_query.UNPROVIDED) {
            linktext = (SubLObject)cb_kb_query.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_kb_query.NIL == linktext) {
            linktext = (SubLObject)cb_kb_query.$str3$_Ask_Query_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_kb_query.$kw4$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_kb_query.$str5$cb_ask_kb_query__a, cb_utilities.cb_term_identifier(query_spec));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        if (cb_kb_query.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return query_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 2597L)
    public static SubLObject cb_ask_kb_query(final SubLObject args) {
        final SubLObject query_spec = cb_utilities.cb_guess_term(args, (SubLObject)cb_kb_query.UNPROVIDED);
        cb_kb_query_from_query_spec(query_spec);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 2747L)
    public static SubLObject cb_kb_query_in_proof_checker_from_query_spec(final SubLObject query_spec) {
        final SubLObject sentence = kb_query.kbq_sentence(query_spec);
        final SubLObject mt = kb_query.kbq_mt(query_spec);
        final SubLObject non_explanatory_sentence = kb_query.kbq_pragmatics(query_spec);
        SubLObject v_properties = inference_strategist.implicify_inference_mode_defaults(inference_parameters.explicify_inference_engine_query_property_defaults(kb_query.kbq_query_properties(query_spec)));
        final SubLObject rules = kbq_query_practice_rules(query_spec);
        Mapping.mapcar((SubLObject)cb_kb_query.$sym10$CB_ADD_TO_PROOF_CHECKER_RULES, rules);
        if (cb_kb_query.NIL != rules) {
            v_properties = conses_high.putf(v_properties, (SubLObject)cb_kb_query.$kw11$ALLOWED_RULES, rules);
        }
        return cb_query.cb_kb_query(sentence, mt, v_properties, query_spec, non_explanatory_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 3470L)
    public static SubLObject cb_link_kbq_ask_in_proof_checker(final SubLObject query_spec, SubLObject linktext) {
        if (linktext == cb_kb_query.UNPROVIDED) {
            linktext = (SubLObject)cb_kb_query.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_kb_query.NIL == linktext) {
            linktext = (SubLObject)cb_kb_query.$str12$_Proof_check_Query_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_kb_query.$kw4$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_kb_query.$str13$cb_ask_kb_query_in_proof_checker_, cb_utilities.cb_fort_identifier(query_spec));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        if (cb_kb_query.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return query_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 3866L)
    public static SubLObject cb_ask_kb_query_in_proof_checker(final SubLObject args) {
        final SubLObject query_spec = cb_utilities.cb_guess_fort(args, (SubLObject)cb_kb_query.UNPROVIDED);
        cb_kb_query_in_proof_checker_from_query_spec(query_spec);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 4050L)
    public static SubLObject kbq_query_practice_rules(final SubLObject query_spec) {
        SubLObject rules = (SubLObject)cb_kb_query.NIL;
        if (cb_kb_query.NIL != kb_indexing_datastructures.indexed_term_p(query_spec)) {
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt(query_spec, cb_kb_query.$const17$queryPracticeRules, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
            SubLObject rule = (SubLObject)cb_kb_query.NIL;
            rule = cdolist_list_var.first();
            while (cb_kb_query.NIL != cdolist_list_var) {
                rules = (SubLObject)ConsesLow.cons(rule, rules);
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            }
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 4280L)
    public static SubLObject cb_link_kbq_save(final SubLObject inference, SubLObject linktext) {
        if (linktext == cb_kb_query.UNPROVIDED) {
            linktext = (SubLObject)cb_kb_query.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_kb_query.NIL == linktext) {
            linktext = (SubLObject)cb_kb_query.$str18$_Save_As_Query_;
        }
        assert cb_kb_query.NIL != inference_datastructures_inference.inference_p(inference) : inference;
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_kb_query.$kw19$SELF);
        cyc_file_dependencies.javascript((SubLObject)cb_kb_query.$kw20$OVERLIB);
        if (cb_kb_query.$str21$Create_an_instance_of___CycLQuery.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover((SubLObject)cb_kb_query.$str21$Create_an_instance_of___CycLQuery, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_kb_query.$str22$cb_save_as_query__A__A, inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference)), inference_datastructures_inference.inference_suid(inference));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            if (cb_kb_query.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(onmouseover);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_kb_query.$str23$nd___);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 4872L)
    public static SubLObject cb_save_as_query(final SubLObject args) {
        SubLObject store_id_string = (SubLObject)cb_kb_query.NIL;
        SubLObject inference_id_string = (SubLObject)cb_kb_query.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_kb_query.$list26);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_kb_query.$list26);
        inference_id_string = current.first();
        current = current.rest();
        if (cb_kb_query.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_kb_query.$list26);
            return (SubLObject)cb_kb_query.NIL;
        }
        final SubLObject store_id = reader.parse_integer(store_id_string, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject inference_id = reader.parse_integer(inference_id_string, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(store_id, inference_id);
        final SubLObject query_spec = (SubLObject)((cb_kb_query.NIL != inference) ? kbq_lookup_query_spec_by_inference(inference) : cb_kb_query.NIL);
        if (cb_kb_query.NIL == inference) {
            return cb_utilities.cb_error((SubLObject)cb_kb_query.$str27$Inference__S_in_problem_store__S_, inference_id, store_id, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        cb_kb_query_state.cb_set_kb_query_being_saved(cb_kb_query_state.cb_kbq_new_query_state_from_inference(inference, (SubLObject)cb_kb_query.UNPROVIDED));
        if (cb_kb_query.NIL != kb_query.kbq_query_spec_p(query_spec)) {
            cb_kb_query_state._csetf_kb_query_state_query_spec(cb_kb_query_state.cb_kb_query_being_saved(), query_spec);
        }
        return cb_confirm_save_as_query(query_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 5621L)
    public static SubLObject cb_link_kbq_edit(final SubLObject query_spec, SubLObject linktext) {
        if (linktext == cb_kb_query.UNPROVIDED) {
            linktext = (SubLObject)cb_kb_query.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_kb_query.NIL == linktext) {
            linktext = (SubLObject)cb_kb_query.$str29$_Edit_Query_;
        }
        assert cb_kb_query.NIL != kb_query.kbq_query_spec_p(query_spec) : query_spec;
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_kb_query.$kw4$MAIN);
        cyc_file_dependencies.javascript((SubLObject)cb_kb_query.$kw20$OVERLIB);
        if (cb_kb_query.$str30$Edit_the_sentence__microtheory__i.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover((SubLObject)cb_kb_query.$str30$Edit_the_sentence__microtheory__i, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_kb_query.$str31$cb_edit_query__A, cb_utilities.cb_fort_identifier(query_spec));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            if (cb_kb_query.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(onmouseover);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_kb_query.$str23$nd___);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 6051L)
    public static SubLObject cb_edit_query(final SubLObject args) {
        final SubLObject query_spec = cb_utilities.cb_guess_fort(args.first(), (SubLObject)cb_kb_query.UNPROVIDED);
        if (cb_kb_query.NIL == kb_query.kbq_query_spec_p(query_spec)) {
            return cb_utilities.cb_error((SubLObject)cb_kb_query.$str34$_A_does_not_denote_a_query_specif, args.first(), (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        cb_kb_query_state.cb_set_kb_query_being_saved(cb_kb_query_state.cb_kbq_new_query_state_from_query_spec(query_spec, (SubLObject)cb_kb_query.UNPROVIDED));
        cb_confirm_save_as_query(query_spec);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 6481L)
    public static SubLObject cb_confirm_save_as_query(SubLObject query_spec) {
        if (query_spec == cb_kb_query.UNPROVIDED) {
            query_spec = (SubLObject)cb_kb_query.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = (SubLObject)((cb_kb_query.NIL != query_spec) ? cb_kb_query.$str36$Edit_Query_Specification : cb_kb_query.$str37$Save_Inference_Settings_as_Query_);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_kb_query.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_kb_query.$str38$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_kb_query.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_kb_query.$str39$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_kb_query.$kw40$UNINITIALIZED) ? ConsesLow.list(cb_kb_query.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_utilities.html_princ(title);
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.html_basic_cb_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_kb_query.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_kb_query.$str41$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
                        html_script_utilities.cb_hoverover_page_init();
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_kb_query.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_kb_query.$str42$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                        if (cb_kb_query.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_kb_query.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_kb_query.$str43$cb_handle_confirm_save_as_query, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.UNPROVIDED);
                            cb_show_save_as_query_header(title);
                            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
                            cb_save_as_query_submit_section();
                            html_utilities.html_newline((SubLObject)cb_kb_query.TWO_INTEGER);
                            cb_query.cb_query_new_inference_mt_section(cb_kb_query_state.kb_query_state_best_sentence(cb_kb_query_state.cb_kb_query_being_saved()), cb_kb_query_state.kb_query_state_best_mt(cb_kb_query_state.cb_kb_query_being_saved()), (SubLObject)cb_kb_query.NIL);
                            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
                            cb_kb_query_warn_of_extra_mt();
                            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
                            cb_query.cb_query_new_inference_sentence_section(cb_kb_query_state.kb_query_state_best_sentence(cb_kb_query_state.cb_kb_query_being_saved()), (SubLObject)cb_kb_query.NIL);
                            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
                            cb_kb_query_warn_of_extra_sentence();
                            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
                            cb_query.cb_query_new_inference_non_explanatory_sentence_section(cb_kb_query_state.kb_query_state_non_explanatory_sentence(cb_kb_query_state.cb_kb_query_being_saved()), (SubLObject)cb_kb_query.NIL);
                            html_utilities.html_hr((SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                            cb_kb_query_parameters_section((SubLObject)cb_kb_query.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                            cb_multiple_choice_query_options_section(cb_kb_query_state.cb_kb_query_being_saved());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 8262L)
    public static SubLObject cb_show_save_as_query_header(final SubLObject title) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size_val = (SubLObject)cb_kb_query.FIVE_INTEGER;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_kb_query.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            cb_query.cb_princ_strong_with_explanation(title, (SubLObject)cb_kb_query.$str44$The_interface_for_creating_and_ed, (SubLObject)cb_kb_query.$str45$Save_As_Query, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_kb_query.FOUR_INTEGER);
        cb_query.cb_princ_strong_with_explanation((SubLObject)cb_kb_query.$str46$Goto_section__, (SubLObject)cb_kb_query.$str47$Shortcut_links_to_sections_that_a, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_kb_query.UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation((SubLObject)cb_kb_query.$str48$mt_section, (SubLObject)cb_kb_query.$str49$_Mt_, (SubLObject)cb_kb_query.$str50$Change_the_Microtheory_settings_t, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_kb_query.UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation((SubLObject)cb_kb_query.$str51$sentence_section, (SubLObject)cb_kb_query.$str52$_Sentence_, (SubLObject)cb_kb_query.$str53$Change_the_CycL_sentence_to_be_us, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_kb_query.UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation((SubLObject)cb_kb_query.$str54$parameters_section, (SubLObject)cb_kb_query.$str55$_Inference_Parameters_, (SubLObject)cb_kb_query.$str56$Adjust_the_inference_parameters_a, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_kb_query.UNPROVIDED);
        cb_query.cb_princ_with_target_reference_and_explanation((SubLObject)cb_kb_query.$str57$multiple_choice_section, (SubLObject)cb_kb_query.$str58$_Multiple_Choice_, (SubLObject)cb_kb_query.$str59$If_this_query_is_to_be_a_multiple, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_hr((SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 9825L)
    public static SubLObject cb_save_as_query_submit_section() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_indent((SubLObject)cb_kb_query.UNPROVIDED);
        cb_query.cb_submit_input_with_explanation((SubLObject)cb_kb_query.$str60$Save_As_New_Query, (SubLObject)cb_kb_query.$str61$Creates_a_new___CycLQuerySpecific, (SubLObject)cb_kb_query.$str62$new, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_kb_query.UNPROVIDED);
        cb_query.cb_princ_strong_with_explanation((SubLObject)cb_kb_query.$str63$Name__, (SubLObject)cb_kb_query.$str64$The_constant_name_to_save_the_que, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_text_input((SubLObject)cb_kb_query.$str65$name, cb_kb_query_state.kb_query_state_name(cb_kb_query_state.cb_kb_query_being_saved()), (SubLObject)cb_kb_query.$int66$40);
        if (cb_kb_query.NIL != cb_kb_query_state.kb_query_state_query_spec(cb_kb_query_state.cb_kb_query_being_saved())) {
            html_utilities.html_indent((SubLObject)cb_kb_query.UNPROVIDED);
            cb_query.cb_submit_input_with_explanation((SubLObject)cb_kb_query.$str67$Overwrite_Existing_Query, (SubLObject)cb_kb_query.$str68$Overwrites_the_existing_query_spe, (SubLObject)cb_kb_query.$str69$overwrite, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_reset_input((SubLObject)cb_kb_query.$str70$Reset_Values);
        html_utilities.html_newline((SubLObject)cb_kb_query.TWO_INTEGER);
        dhtml_macros.dhtml_switch_visibility_links((SubLObject)cb_kb_query.$str71$cb_kbq_save_mt, (SubLObject)cb_kb_query.$str72$Show, (SubLObject)cb_kb_query.$str73$Hide);
        final SubLObject initial_visibility = (SubLObject)cb_kb_query.$kw74$VISIBLE;
        final SubLObject size_val = (SubLObject)cb_kb_query.FOUR_INTEGER;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_kb_query.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            cb_query.cb_princ_strong_with_explanation((SubLObject)cb_kb_query.$str75$Save_In_Mt__, (SubLObject)cb_kb_query.$str76$The_microtheory_in_which_to_save_, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_kb_query.$str71$cb_kbq_save_mt, initial_visibility, (SubLObject)cb_kb_query.$kw77$PARAGRAPH);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_kb_query.$str71$cb_kbq_save_mt);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            cb_form_widgets.cb_mt_input_section(cb_kb_query_state.kb_query_state_save_mt(cb_kb_query_state.cb_kb_query_being_saved()), (SubLObject)cb_kb_query.$list78);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 11344L)
    public static SubLObject cb_kb_query_comment_section() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_target_definition((SubLObject)cb_kb_query.$str79$comment_section);
        dhtml_macros.dhtml_switch_visibility_links((SubLObject)cb_kb_query.$str80$query_comment, (SubLObject)cb_kb_query.$str72$Show, (SubLObject)cb_kb_query.$str73$Hide);
        final SubLObject size_val = (SubLObject)cb_kb_query.FOUR_INTEGER;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_kb_query.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            cb_query.cb_princ_strong_with_explanation((SubLObject)cb_kb_query.$str81$Query_Comment__optional_, (SubLObject)cb_kb_query.$str82$Specify_a_comment_for_the_CycLQue, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_kb_query.$str80$query_comment, (SubLObject)cb_kb_query.$kw74$VISIBLE, (SubLObject)cb_kb_query.$kw77$PARAGRAPH);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_kb_query.$str80$query_comment);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            SubLObject cdolist_list_var;
            final SubLObject current_comments = cdolist_list_var = cb_kb_query_state.kb_query_state_comments(cb_kb_query_state.cb_kb_query_being_saved());
            SubLObject comment = (SubLObject)cb_kb_query.NIL;
            comment = cdolist_list_var.first();
            while (cb_kb_query.NIL != cdolist_list_var) {
                html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
                html_utilities.html_checkbox_input((SubLObject)cb_kb_query.$str83$comment, comment, (SubLObject)cb_kb_query.T, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_kb_query.TWO_INTEGER);
                cb_utilities.cb_form(comment, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                comment = cdolist_list_var.first();
            }
            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_princ_strong((SubLObject)cb_kb_query.$str84$Add_a_Comment__);
            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_kb_query.$str85$new_comment);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_kb_query.$int86$80);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_kb_query.THREE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_kb_query.$str87$virtual);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
                html_utilities.html_princ((SubLObject)cb_kb_query.$str88$);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
            }
            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 12220L)
    public static SubLObject cb_kb_query_show_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_target_definition((SubLObject)cb_kb_query.$str48$mt_section);
        dhtml_macros.dhtml_switch_visibility_links((SubLObject)cb_kb_query.$str89$cb_query_inference_mt, (SubLObject)cb_kb_query.$str72$Show, (SubLObject)cb_kb_query.$str73$Hide);
        final SubLObject size_val = (SubLObject)cb_kb_query.FOUR_INTEGER;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_kb_query.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            cb_query.cb_princ_strong_with_explanation((SubLObject)cb_kb_query.$str90$Query_Mt, (SubLObject)cb_kb_query.$str91$The_microtheory_in_which_the_quer, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_kb_query.$str89$cb_query_inference_mt, (SubLObject)cb_kb_query.$kw74$VISIBLE, (SubLObject)cb_kb_query.$kw77$PARAGRAPH);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_kb_query.$str89$cb_query_inference_mt);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            final SubLObject mt = cb_kb_query_state.kb_query_state_best_mt(cb_kb_query_state.cb_kb_query_being_saved());
            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
            cb_utilities.cb_form(mt, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 12774L)
    public static SubLObject cb_kb_query_show_sentence() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_target_definition((SubLObject)cb_kb_query.$str51$sentence_section);
        dhtml_macros.dhtml_switch_visibility_links((SubLObject)cb_kb_query.$str92$query_sentence, (SubLObject)cb_kb_query.$str72$Show, (SubLObject)cb_kb_query.$str73$Hide);
        final SubLObject size_val = (SubLObject)cb_kb_query.FOUR_INTEGER;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_kb_query.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            cb_query.cb_princ_strong_with_explanation((SubLObject)cb_kb_query.$str93$Query_Sentence, (SubLObject)cb_kb_query.$str94$The_CycL_Sentence_for_the_query_, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_kb_query.$str92$query_sentence, (SubLObject)cb_kb_query.$kw74$VISIBLE, (SubLObject)cb_kb_query.$kw77$PARAGRAPH);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_kb_query.$str92$query_sentence);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            final SubLObject mt = cb_kb_query_state.kb_query_state_best_sentence(cb_kb_query_state.cb_kb_query_being_saved());
            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
            cb_utilities.cb_form(mt, (SubLObject)cb_kb_query.ZERO_INTEGER, (SubLObject)cb_kb_query.T);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 13307L)
    public static SubLObject cb_kb_query_show_pragmatics() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_target_definition((SubLObject)cb_kb_query.$str95$pragmatics_section);
        dhtml_macros.dhtml_switch_visibility_links((SubLObject)cb_kb_query.$str96$query_pragmatics, (SubLObject)cb_kb_query.$str72$Show, (SubLObject)cb_kb_query.$str73$Hide);
        final SubLObject size_val = (SubLObject)cb_kb_query.FOUR_INTEGER;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_kb_query.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            cb_query.cb_princ_strong_with_explanation((SubLObject)cb_kb_query.$str97$Query_Pragmatics, (SubLObject)cb_kb_query.$str98$An_optional_sentence_that_will_co, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        final SubLObject sentence = cb_kb_query_state.kb_query_state_non_explanatory_sentence(cb_kb_query_state.cb_kb_query_being_saved());
        final SubLObject visibility = (SubLObject)((cb_kb_query.NIL != cycl_grammar.cycl_sentence_p(sentence)) ? cb_kb_query.$kw74$VISIBLE : cb_kb_query.$kw99$INVISIBLE);
        dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_kb_query.$str96$query_pragmatics, visibility, (SubLObject)cb_kb_query.$kw77$PARAGRAPH);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_kb_query.$str96$query_pragmatics);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
            cb_utilities.cb_form(sentence, (SubLObject)cb_kb_query.ZERO_INTEGER, (SubLObject)cb_kb_query.T);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 16699L)
    public static SubLObject cb_kb_query_parameters_section(SubLObject allow_editP) {
        if (allow_editP == cb_kb_query.UNPROVIDED) {
            allow_editP = (SubLObject)cb_kb_query.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_properties = cb_kb_query_state.kb_query_state_query_properties(cb_kb_query_state.cb_kb_query_being_saved());
        if (cb_kb_query.NIL != allow_editP) {
            return cb_query.cb_query_parameters_section((SubLObject)cb_kb_query.NIL, query_properties);
        }
        dhtml_macros.dhtml_switch_visibility_links((SubLObject)cb_kb_query.$str100$inference_parameters, (SubLObject)cb_kb_query.$str72$Show, (SubLObject)cb_kb_query.$str73$Hide);
        final SubLObject size_val = (SubLObject)cb_kb_query.FOUR_INTEGER;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_kb_query.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            cb_query.cb_princ_strong_with_explanation((SubLObject)cb_kb_query.$str101$Inference_Parameters, (SubLObject)cb_kb_query.$str102$The_inference_parameters_and_reso, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_kb_query.$str100$inference_parameters, (SubLObject)cb_kb_query.$kw99$INVISIBLE, (SubLObject)cb_kb_query.$kw77$PARAGRAPH);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_kb_query.$str100$inference_parameters);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
            cb_query.cb_query_inference_resource_constraints_section((SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL, query_properties);
            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
            cb_query.cb_query_advanced_inference_dynamic_properties((SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL, query_properties, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
            cb_query.cb_query_advanced_inference_static_properties((SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.NIL, query_properties, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 17748L)
    public static SubLObject cb_multiple_choice_query_options_section(final SubLObject query_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_target_definition((SubLObject)cb_kb_query.$str57$multiple_choice_section);
        dhtml_macros.dhtml_switch_visibility_links((SubLObject)cb_kb_query.$str103$multiple_choice, (SubLObject)cb_kb_query.$str72$Show, (SubLObject)cb_kb_query.$str73$Hide);
        final SubLObject size_val = (SubLObject)cb_kb_query.FOUR_INTEGER;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_kb_query.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            cb_query.cb_princ_strong_with_explanation((SubLObject)cb_kb_query.$str104$Multiple_Choice_Options, (SubLObject)cb_kb_query.$str59$If_this_query_is_to_be_a_multiple, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_kb_query.$str103$multiple_choice, (SubLObject)cb_kb_query.$kw74$VISIBLE, (SubLObject)cb_kb_query.$kw77$PARAGRAPH);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_kb_query.$str103$multiple_choice);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
            final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence(query_state);
            SubLObject option_num;
            SubLObject option_number_label;
            SubLObject full_label_label;
            SubLObject index_label_label;
            SubLObject query_spec;
            SubLObject option_spec;
            SubLObject full_label_default;
            SubLObject index_label_default;
            SubLObject current;
            SubLObject datum;
            SubLObject kb_n;
            SubLObject kb_full_label;
            SubLObject kb_index_label;
            SubLObject kb_bindings;
            SubLObject free_el_variables;
            SubLObject kb_bindings2;
            SubLObject list_var;
            SubLObject var;
            SubLObject var_num;
            SubLObject binding_label;
            SubLObject binding_default;
            for (option_num = (SubLObject)cb_kb_query.NIL, option_num = (SubLObject)cb_kb_query.ZERO_INTEGER; option_num.numL(cb_kb_query.$cb_multiple_choice_max_options$.getGlobalValue()); option_num = Numbers.add(option_num, (SubLObject)cb_kb_query.ONE_INTEGER)) {
                option_number_label = Sequences.cconcatenate((SubLObject)cb_kb_query.$str105$mc_option_number_, new SubLObject[] { format_nil.format_nil_a_no_copy(option_num), cb_kb_query.$str106$_0 });
                full_label_label = Sequences.cconcatenate((SubLObject)cb_kb_query.$str107$mc_option_full_label_, new SubLObject[] { format_nil.format_nil_a_no_copy(option_num), cb_kb_query.$str106$_0 });
                index_label_label = Sequences.cconcatenate((SubLObject)cb_kb_query.$str108$mc_option_index_label_, new SubLObject[] { format_nil.format_nil_a_no_copy(option_num), cb_kb_query.$str106$_0 });
                query_spec = cb_kb_query_state.kb_query_state_query_spec(query_state);
                option_spec = (SubLObject)((cb_kb_query.NIL != query_spec) ? kb_query.kbq_multiple_choice_option_spec(query_spec, option_num) : cb_kb_query.NIL);
                full_label_default = (SubLObject)cb_kb_query.$str88$;
                index_label_default = (SubLObject)cb_kb_query.$str88$;
                if (cb_kb_query.NIL != option_spec) {
                    datum = (current = option_spec);
                    kb_n = (SubLObject)cb_kb_query.NIL;
                    kb_full_label = (SubLObject)cb_kb_query.NIL;
                    kb_index_label = (SubLObject)cb_kb_query.NIL;
                    kb_bindings = (SubLObject)cb_kb_query.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_kb_query.$list109);
                    kb_n = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_kb_query.$list109);
                    kb_full_label = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_kb_query.$list109);
                    kb_index_label = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_kb_query.$list109);
                    kb_bindings = current.first();
                    current = current.rest();
                    if (cb_kb_query.NIL == current) {
                        full_label_default = kb_full_label;
                        index_label_default = kb_index_label;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_kb_query.$list109);
                    }
                }
                else {
                    index_label_default = (full_label_default = Sequences.cconcatenate((SubLObject)cb_kb_query.$str110$_, new SubLObject[] { format_nil.format_nil_a_no_copy(string_utilities.nth_letter_of_alphabet_upcase(option_num)), cb_kb_query.$str111$_ }));
                }
                html_utilities.html_newline((SubLObject)cb_kb_query.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_kb_query.$str112$Option___);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_text_input(option_number_label, string_utilities.str(number_utilities.f_1X(option_num)), (SubLObject)cb_kb_query.ONE_INTEGER);
                html_utilities.html_indent((SubLObject)cb_kb_query.TWO_INTEGER);
                cb_query.html_princ_strong_with_explanation((SubLObject)cb_kb_query.$str113$Full_label__, (SubLObject)cb_kb_query.$str114$A_label_that_fully_describes_this, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                html_utilities.html_text_input(full_label_label, full_label_default, (SubLObject)cb_kb_query.$int115$30);
                html_utilities.html_indent((SubLObject)cb_kb_query.TWO_INTEGER);
                cb_query.html_princ_strong_with_explanation((SubLObject)cb_kb_query.$str116$Index_label__, (SubLObject)cb_kb_query.$str117$A_label_serving_as_a_unique_index, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                html_utilities.html_text_input(index_label_label, index_label_default, (SubLObject)cb_kb_query.FIVE_INTEGER);
                html_utilities.html_indent((SubLObject)cb_kb_query.TWO_INTEGER);
                free_el_variables = ((cb_kb_query.NIL != el_utilities.el_implication_p(sentence)) ? el_utilities.conditional_sentence_free_variables(sentence, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED) : el_utilities.sentence_free_variables(sentence, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED));
                kb_bindings2 = (SubLObject)((cb_kb_query.NIL != option_spec) ? conses_high.fourth(option_spec) : cb_kb_query.NIL);
                if (!bindings.bindings_variables(kb_bindings2).equal(free_el_variables)) {
                    kb_bindings2 = (SubLObject)cb_kb_query.NIL;
                }
                list_var = (SubLObject)cb_kb_query.NIL;
                var = (SubLObject)cb_kb_query.NIL;
                var_num = (SubLObject)cb_kb_query.NIL;
                list_var = free_el_variables;
                var = list_var.first();
                for (var_num = (SubLObject)cb_kb_query.ZERO_INTEGER; cb_kb_query.NIL != list_var; list_var = list_var.rest(), var = list_var.first(), var_num = Numbers.add((SubLObject)cb_kb_query.ONE_INTEGER, var_num)) {
                    binding_label = Sequences.cconcatenate((SubLObject)cb_kb_query.$str118$mc_option_binding_, new SubLObject[] { format_nil.format_nil_a_no_copy(option_num), cb_kb_query.$str119$_, format_nil.format_nil_a_no_copy(var_num) });
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_kb_query.$str120$Binding_for__A__, var);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    binding_default = list_utilities.alist_lookup(kb_bindings2, var, Symbols.symbol_function((SubLObject)cb_kb_query.EQL), (SubLObject)cb_kb_query.$str88$);
                    html_utilities.html_autocomplete_text_input(binding_label, binding_default, (SubLObject)cb_kb_query.$int115$30, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                }
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_kb_query.UNPROVIDED);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 20561L)
    public static SubLObject cb_kb_query_warn_of_extra_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_kb_query.NIL != cb_kb_query_state.kb_query_state_other_mts(cb_kb_query_state.cb_kb_query_being_saved())) {
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_kb_query.$str121$red));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_kb_query.$str122$A_query_specification_can_have_on);
                html_utilities.html_br();
                SubLObject cdolist_list_var = cb_kb_query_state.kb_query_state_other_mts(cb_kb_query_state.cb_kb_query_being_saved());
                SubLObject mt = (SubLObject)cb_kb_query.NIL;
                mt = cdolist_list_var.first();
                while (cb_kb_query.NIL != cdolist_list_var) {
                    cb_utilities.cb_form(mt, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                    html_utilities.html_br();
                    cdolist_list_var = cdolist_list_var.rest();
                    mt = cdolist_list_var.first();
                }
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 20954L)
    public static SubLObject cb_kb_query_warn_of_extra_sentence() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_kb_query.NIL != cb_kb_query_state.kb_query_state_other_sentences(cb_kb_query_state.cb_kb_query_being_saved())) {
            html_utilities.html_br();
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_kb_query.$str121$red));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_kb_query.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_kb_query.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_kb_query.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_kb_query.$str123$A_query_specification_can_have_on);
                html_utilities.html_br();
                SubLObject cdolist_list_var = cb_kb_query_state.kb_query_state_other_sentences(cb_kb_query_state.cb_kb_query_being_saved());
                SubLObject sentence = (SubLObject)cb_kb_query.NIL;
                sentence = cdolist_list_var.first();
                while (cb_kb_query.NIL != cdolist_list_var) {
                    cb_utilities.cb_form(sentence, (SubLObject)cb_kb_query.ZERO_INTEGER, (SubLObject)cb_kb_query.T);
                    html_utilities.html_br();
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence = cdolist_list_var.first();
                }
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 21407L)
    public static SubLObject cb_handle_confirm_save_as_query(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject save_method = cb_kb_query_extract_save_method(args);
        final SubLObject query_spec = cb_kb_query_state.kb_query_state_query_spec(cb_kb_query_state.cb_kb_query_being_saved());
        final SubLObject glosses = cb_kb_query_extract_glosses(args);
        thread.resetMultipleValues();
        final SubLObject name = cb_kb_query_extract_name(args);
        final SubLObject name_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_kb_query.NIL != name_error) {
            return cb_utilities.cb_error((SubLObject)cb_kb_query.$str124$_A, name_error, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject defining_mt = cb_kb_query_extract_defining_mt(args);
        final SubLObject defining_mt_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_kb_query.NIL != defining_mt_error) {
            return cb_utilities.cb_error((SubLObject)cb_kb_query.$str124$_A, defining_mt_error, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject v_inference_parameters = cb_query.cb_query_extract_parameters(args, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject parameter_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_kb_query.NIL != parameter_error) {
            return cb_utilities.cb_error((SubLObject)cb_kb_query.$str124$_A, parameter_error, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_kb_query.NIL != mt_error) {
            cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
            return (SubLObject)cb_kb_query.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_kb_query.$list125);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_kb_query.NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject non_explanatory_sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_kb_query.$list126);
        final SubLObject non_explanatory_sentence_error = thread.secondMultipleValue();
        final SubLObject non_explanatory_sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_kb_query.NIL != non_explanatory_sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(non_explanatory_sentence_error, non_explanatory_sentence_error_string, (SubLObject)cb_kb_query.$list127);
        }
        thread.resetMultipleValues();
        final SubLObject folder_mt_pairs = cb_kb_query_extract_folder_mt_pairs(args);
        final SubLObject folder_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_kb_query.NIL != folder_error) {
            return cb_utilities.cb_error((SubLObject)cb_kb_query.$str124$_A, folder_error, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        final SubLObject mc_option_specs = cb_kb_query_extract_multiple_choice_option_specs(args, sentence);
        cb_kb_query_state._csetf_kb_query_state_query_spec(cb_kb_query_state.cb_kb_query_being_saved(), query_spec);
        cb_kb_query_state._csetf_kb_query_state_template_glosses(cb_kb_query_state.cb_kb_query_being_saved(), glosses);
        cb_kb_query_state._csetf_kb_query_state_name(cb_kb_query_state.cb_kb_query_being_saved(), name);
        cb_kb_query_state._csetf_kb_query_state_save_mt(cb_kb_query_state.cb_kb_query_being_saved(), defining_mt);
        cb_kb_query_state._csetf_kb_query_state_query_properties(cb_kb_query_state.cb_kb_query_being_saved(), v_inference_parameters);
        cb_kb_query_state._csetf_kb_query_state_query_mts(cb_kb_query_state.cb_kb_query_being_saved(), (SubLObject)ConsesLow.list(mt));
        cb_kb_query_state._csetf_kb_query_state_sentences(cb_kb_query_state.cb_kb_query_being_saved(), (SubLObject)ConsesLow.list(sentence));
        cb_kb_query_state._csetf_kb_query_state_non_explanatory_sentence(cb_kb_query_state.cb_kb_query_being_saved(), non_explanatory_sentence);
        cb_kb_query_state._csetf_kb_query_state_template_folder_mt_pairs(cb_kb_query_state.cb_kb_query_being_saved(), folder_mt_pairs);
        cb_kb_query_state._csetf_kb_query_state_multiple_choice_option_specs(cb_kb_query_state.cb_kb_query_being_saved(), mc_option_specs);
        final SubLObject pcase_var = save_method;
        if (pcase_var.eql((SubLObject)cb_kb_query.$kw128$NEW)) {
            return cb_kb_save_new_query(cb_kb_query_state.cb_kb_query_being_saved(), (SubLObject)cb_kb_query.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)cb_kb_query.$kw129$OVERWRITE)) {
            return cb_kb_overwrite_query(cb_kb_query_state.cb_kb_query_being_saved());
        }
        return cb_utilities.cb_error((SubLObject)cb_kb_query.$str130$Unknown_query_save_method__A, save_method, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 24468L)
    public static SubLObject cb_kb_query_extract_save_method(final SubLObject args) {
        if (cb_kb_query.NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_kb_query.$str62$new, args))) {
            return (SubLObject)cb_kb_query.$kw128$NEW;
        }
        if (cb_kb_query.NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_kb_query.$str69$overwrite, args))) {
            return (SubLObject)cb_kb_query.$kw129$OVERWRITE;
        }
        return (SubLObject)cb_kb_query.$kw132$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 24692L)
    public static SubLObject cb_kb_query_extract_query_spec(final SubLObject args) {
        final SubLObject query_spec_id_string = html_utilities.html_extract_input((SubLObject)cb_kb_query.$str133$query_spec, args);
        final SubLObject query_spec = cb_utilities.cb_guess_fort(query_spec_id_string, (SubLObject)cb_kb_query.UNPROVIDED);
        return query_spec;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 24894L)
    public static SubLObject cb_kb_query_extract_name(final SubLObject args) {
        final SubLObject name = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cb_kb_query.$str65$name, args));
        SubLObject name_error = (SubLObject)cb_kb_query.NIL;
        if (!name.isString() || name.equal((SubLObject)cb_kb_query.$str88$)) {
            name_error = (SubLObject)cb_kb_query.$str134$No_name_was_specified_;
        }
        return Values.values(name, name_error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 25177L)
    public static SubLObject cb_kb_query_extract_defining_mt(final SubLObject args) {
        return cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.$list78);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 25304L)
    public static SubLObject cb_kb_query_extract_glosses(final SubLObject args) {
        SubLObject glosses = html_utilities.html_extract_input_values((SubLObject)cb_kb_query.$str135$gloss, args);
        final SubLObject new_gloss = html_utilities.html_extract_input((SubLObject)cb_kb_query.$str136$new_gloss, args);
        if (cb_kb_query.NIL == string_utilities.empty_stringP(new_gloss)) {
            glosses = (SubLObject)ConsesLow.cons(new_gloss, glosses);
        }
        return glosses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 25563L)
    public static SubLObject cb_kb_query_extract_folder_mt_pairs(final SubLObject args) {
        final SubLObject folder_mt_strings = html_utilities.html_extract_input_values((SubLObject)cb_kb_query.$str137$folder, args);
        final SubLObject new_folder = cb_utilities.cb_decode_fort_list_selector_result((SubLObject)cb_kb_query.$str138$new_folder, args);
        final SubLObject new_folder_mt = cb_utilities.cb_decode_fort_list_selector_result((SubLObject)cb_kb_query.$str139$new_folder_mt, args);
        SubLObject folder_mt_pairs = (SubLObject)cb_kb_query.NIL;
        final SubLObject error = (SubLObject)cb_kb_query.NIL;
        SubLObject cdolist_list_var = folder_mt_strings;
        SubLObject folder_mt_string = (SubLObject)cb_kb_query.NIL;
        folder_mt_string = cdolist_list_var.first();
        while (cb_kb_query.NIL != cdolist_list_var) {
            final SubLObject pair = string_utilities.break_words(folder_mt_string, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject folder_id = (SubLObject)cb_kb_query.NIL;
            SubLObject mt_id = (SubLObject)cb_kb_query.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_kb_query.$list140);
            folder_id = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_kb_query.$list140);
            mt_id = current.first();
            current = current.rest();
            if (cb_kb_query.NIL == current) {
                if (cb_kb_query.NIL != cb_utilities.cb_valid_fort_identifierP(folder_id) && cb_kb_query.NIL != cb_utilities.cb_valid_fort_identifierP(mt_id)) {
                    final SubLObject folder = cb_utilities.cb_guess_fort(folder_id, (SubLObject)cb_kb_query.UNPROVIDED);
                    final SubLObject mt = cb_utilities.cb_guess_fort(mt_id, (SubLObject)cb_kb_query.UNPROVIDED);
                    if (cb_kb_query.NIL != forts.fort_p(folder) && cb_kb_query.NIL != forts.fort_p(mt)) {
                        final SubLObject item_var = (SubLObject)ConsesLow.list(folder, mt);
                        if (cb_kb_query.NIL == conses_high.member(item_var, folder_mt_pairs, Symbols.symbol_function((SubLObject)cb_kb_query.EQUAL), Symbols.symbol_function((SubLObject)cb_kb_query.IDENTITY))) {
                            folder_mt_pairs = (SubLObject)ConsesLow.cons(item_var, folder_mt_pairs);
                        }
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_kb_query.$list140);
            }
            cdolist_list_var = cdolist_list_var.rest();
            folder_mt_string = cdolist_list_var.first();
        }
        if (cb_kb_query.NIL == cb_utilities.cb_fort_list_none_selected_p(new_folder) && cb_kb_query.NIL == cb_utilities.cb_fort_list_none_selected_p(new_folder_mt) && cb_kb_query.NIL != forts.fort_p(new_folder) && cb_kb_query.NIL != forts.fort_p(new_folder_mt)) {
            final SubLObject item_var2 = (SubLObject)ConsesLow.list(new_folder, new_folder_mt);
            if (cb_kb_query.NIL == conses_high.member(item_var2, folder_mt_pairs, Symbols.symbol_function((SubLObject)cb_kb_query.EQUAL), Symbols.symbol_function((SubLObject)cb_kb_query.IDENTITY))) {
                folder_mt_pairs = (SubLObject)ConsesLow.cons(item_var2, folder_mt_pairs);
            }
        }
        return Values.values(folder_mt_pairs, error);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 26636L)
    public static SubLObject cb_kb_query_extract_multiple_choice_option_specs(final SubLObject args, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject multiple_choice_queryP = (SubLObject)cb_kb_query.NIL;
        final SubLObject mc_option_plist_dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cb_kb_query.EQ), (SubLObject)cb_kb_query.UNPROVIDED);
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)cb_kb_query.NIL;
        arg = cdolist_list_var.first();
        while (cb_kb_query.NIL != cdolist_list_var) {
            if (cb_kb_query.NIL != list_utilities.doubletonP(arg)) {
                SubLObject current;
                final SubLObject datum = current = arg;
                SubLObject label = (SubLObject)cb_kb_query.NIL;
                SubLObject value = (SubLObject)cb_kb_query.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_kb_query.$list141);
                label = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_kb_query.$list141);
                value = current.first();
                current = current.rest();
                if (cb_kb_query.NIL == current) {
                    if (cb_kb_query.NIL != string_utilities.starts_with(label, (SubLObject)cb_kb_query.$str142$mc_option_) && cb_kb_query.NIL == string_utilities.empty_string_p(value)) {
                        final SubLObject label_chunks = string_utilities.split_string(label, (SubLObject)cb_kb_query.$list143);
                        SubLObject current_$7;
                        final SubLObject datum_$6 = current_$7 = label_chunks;
                        SubLObject mc = (SubLObject)cb_kb_query.NIL;
                        SubLObject option = (SubLObject)cb_kb_query.NIL;
                        SubLObject item_type = (SubLObject)cb_kb_query.NIL;
                        SubLObject item_id_str = (SubLObject)cb_kb_query.NIL;
                        SubLObject var_id_str = (SubLObject)cb_kb_query.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)cb_kb_query.$list144);
                        mc = current_$7.first();
                        current_$7 = current_$7.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)cb_kb_query.$list144);
                        option = current_$7.first();
                        current_$7 = current_$7.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)cb_kb_query.$list144);
                        item_type = current_$7.first();
                        current_$7 = current_$7.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)cb_kb_query.$list144);
                        item_id_str = current_$7.first();
                        current_$7 = current_$7.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)cb_kb_query.$list144);
                        var_id_str = current_$7.first();
                        current_$7 = current_$7.rest();
                        if (cb_kb_query.NIL == current_$7) {
                            final SubLObject item_id = reader.read_from_string_ignoring_errors(item_id_str, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                            final SubLObject var_id = reader.read_from_string_ignoring_errors(var_id_str, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                            if (cb_kb_query.$str145$number.equal(item_type)) {
                                dictionary_utilities.dictionary_putf(mc_option_plist_dict, item_id, (SubLObject)cb_kb_query.$kw146$NUMBER, reader.read_from_string_ignoring_errors(value, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED));
                            }
                            else if (cb_kb_query.$str147$full_label.equal(item_type)) {
                                multiple_choice_queryP = (SubLObject)cb_kb_query.T;
                                dictionary_utilities.dictionary_putf(mc_option_plist_dict, item_id, (SubLObject)cb_kb_query.$kw148$FULL_LABEL, value);
                            }
                            else if (cb_kb_query.$str149$index_label.equal(item_type)) {
                                multiple_choice_queryP = (SubLObject)cb_kb_query.T;
                                dictionary_utilities.dictionary_putf(mc_option_plist_dict, item_id, (SubLObject)cb_kb_query.$kw150$INDEX_LABEL, value);
                            }
                            else if (cb_kb_query.$str151$binding.equal(item_type)) {
                                multiple_choice_queryP = (SubLObject)cb_kb_query.T;
                                final SubLObject indicator = Symbols.make_keyword(Sequences.cconcatenate((SubLObject)cb_kb_query.$str152$BINDING_, string_utilities.str(var_id)));
                                dictionary_utilities.dictionary_putf(mc_option_plist_dict, item_id, indicator, value);
                            }
                            else {
                                Errors.warn((SubLObject)cb_kb_query.$str153$Unexpected_multiple_choice_option, label);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$6, (SubLObject)cb_kb_query.$list144);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_kb_query.$list141);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        if (cb_kb_query.NIL != multiple_choice_queryP) {
            SubLObject mc_option_specs = (SubLObject)cb_kb_query.NIL;
            final SubLObject free_el_variables = (cb_kb_query.NIL != el_utilities.el_implication_p(sentence)) ? el_utilities.conditional_sentence_free_variables(sentence, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED) : el_utilities.sentence_free_variables(sentence, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mc_option_plist_dict)); cb_kb_query.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject plist = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject option_num = list_utilities.plist_lookup(plist, (SubLObject)cb_kb_query.$kw146$NUMBER, (SubLObject)cb_kb_query.UNPROVIDED);
                final SubLObject full_label = list_utilities.plist_lookup(plist, (SubLObject)cb_kb_query.$kw148$FULL_LABEL, (SubLObject)cb_kb_query.UNPROVIDED);
                final SubLObject index_label = list_utilities.plist_lookup(plist, (SubLObject)cb_kb_query.$kw150$INDEX_LABEL, (SubLObject)cb_kb_query.UNPROVIDED);
                SubLObject el_bindings = (SubLObject)cb_kb_query.NIL;
                SubLObject var_num = (SubLObject)cb_kb_query.ZERO_INTEGER;
                SubLObject doneP = (SubLObject)cb_kb_query.NIL;
                while (cb_kb_query.NIL == doneP) {
                    final SubLObject indicator2 = Symbols.make_keyword(Sequences.cconcatenate((SubLObject)cb_kb_query.$str152$BINDING_, string_utilities.str(var_num)));
                    final SubLObject var = ConsesLow.nth(var_num, free_el_variables);
                    SubLObject binding_value = list_utilities.plist_lookup(plist, indicator2, (SubLObject)cb_kb_query.$kw154$NOT_FOUND);
                    if (cb_kb_query.$kw154$NOT_FOUND == binding_value) {
                        doneP = (SubLObject)cb_kb_query.T;
                    }
                    else if (cb_kb_query.NIL == string_utilities.empty_string_p(binding_value)) {
                        binding_value = reader.read_from_string_ignoring_errors(string_utilities.cyclify_string(binding_value), (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
                        el_bindings = (SubLObject)ConsesLow.cons(bindings.make_variable_binding(var, binding_value), el_bindings);
                    }
                    var_num = Numbers.add(var_num, (SubLObject)cb_kb_query.ONE_INTEGER);
                }
                final SubLObject kb_bindings_list = (SubLObject)((cb_kb_query.NIL != el_bindings) ? bindings.kbify_inference_set_of_binding_sets((SubLObject)ConsesLow.list(el_bindings)) : cb_kb_query.NIL);
                mc_option_specs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(option_num, full_label, index_label, kb_bindings_list), mc_option_specs);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return Sort.sort(mc_option_specs, Symbols.symbol_function((SubLObject)cb_kb_query.$sym155$SAFE__), Symbols.symbol_function((SubLObject)cb_kb_query.$sym156$FIRST));
        }
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 29354L)
    public static SubLObject cb_kb_save_new_query(final SubLObject query_state, SubLObject quietP) {
        if (quietP == cb_kb_query.UNPROVIDED) {
            quietP = (SubLObject)cb_kb_query.NIL;
        }
        if (cb_kb_query.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_kb_query.$str157$Save_Query_Specification);
            return (SubLObject)cb_kb_query.NIL;
        }
        if (cb_kb_query.NIL == constant_completion_high.valid_constant_name_p(cb_kb_query_state.kb_query_state_name(query_state))) {
            return cb_utilities.cb_error((SubLObject)cb_kb_query.$str158$_A_is_not_a_valid_constant_name_, cb_kb_query_state.kb_query_state_name(query_state), (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        final SubLObject exact_constant = constants_high.find_constant(cb_kb_query_state.kb_query_state_name(query_state));
        SubLObject new_query_spec = (SubLObject)cb_kb_query.NIL;
        if (cb_kb_query.NIL != exact_constant) {
            return cb_utilities.cb_error((SubLObject)cb_kb_query.$str159$Already_a_constant_named__A, cb_kb_query_state.kb_query_state_name(query_state), (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        final SubLObject inexact_constants = constant_completion_high.constant_complete(cb_kb_query_state.kb_query_state_name(query_state), (SubLObject)cb_kb_query.NIL, (SubLObject)cb_kb_query.T, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        if (cb_kb_query.NIL != inexact_constants) {
            return cb_utilities.cb_error((SubLObject)cb_kb_query.$str160$Constant__S_already_exists_which_, inexact_constants.first(), cb_kb_query_state.kb_query_state_name(query_state), (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        new_query_spec = cb_editor.cb_create_hook(cb_kb_query_state.kb_query_state_name(query_state));
        cb_kb_query_state._csetf_kb_query_state_query_spec(query_state, new_query_spec);
        kb_query.kbq_assert_query_spec_definition(cb_kb_query_state.kb_query_state_query_spec(query_state), cb_kb_query_state.kb_query_state_best_sentence(query_state), cb_kb_query_state.kb_query_state_best_mt(query_state), inference_parameters.explicify_query_tool_query_property_defaults(cb_kb_query_state.kb_query_state_query_properties(query_state), cb_kb_query_state.kb_query_state_best_sentence(query_state)), cb_kb_query_state.kb_query_state_save_mt(query_state), cb_kb_query_state.kb_query_state_non_explanatory_sentence(query_state), cb_kb_query_state.kb_query_state_multiple_choice_option_specs(query_state));
        kb_query.kbq_assert_template_definition(cb_kb_query_state.kb_query_state_query_spec(query_state), cb_kb_query_state.kb_query_state_template(query_state), cb_kb_query_state.kb_query_state_template_glosses(query_state), cb_kb_query_state.kb_query_state_template_folder_mt_pairs(query_state), cb_kb_query_state.kb_query_state_save_mt(query_state));
        if (cb_kb_query.NIL != constant_handles.constant_p(new_query_spec)) {
            cb_tools.cb_add_to_constant_history(new_query_spec);
        }
        else if (cb_kb_query.NIL != nart_handles.nart_p(new_query_spec)) {
            cb_tools.cb_add_to_nat_history(new_query_spec);
        }
        if (cb_kb_query.NIL != quietP) {
            cb_utilities.cb_form(new_query_spec, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        else {
            cb_assertion_editor.cb_note_edit_change((SubLObject)cb_kb_query.$str157$Save_Query_Specification, (SubLObject)cb_kb_query.T, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        }
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-kb-query.lisp", position = 31566L)
    public static SubLObject cb_kb_overwrite_query(final SubLObject query_state) {
        if (cb_kb_query.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_kb_query.$str161$Overwrite_Query_Specification);
            return (SubLObject)cb_kb_query.NIL;
        }
        final SubLObject name = cb_kb_query_state.kb_query_state_name(query_state);
        if (cb_kb_query.NIL != name) {
            final SubLObject query_spec_to_edit = cb_utilities.cb_guess_term(name, (SubLObject)cb_kb_query.UNPROVIDED);
            if (cb_kb_query.NIL == kb_query.kbq_query_spec_p(query_spec_to_edit)) {
                return cb_utilities.cb_error((SubLObject)cb_kb_query.$str162$_A_is_not_the_name_of_a_CycLQuery, name, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
            }
            cb_kb_query_state._csetf_kb_query_state_query_spec(query_state, query_spec_to_edit);
        }
        final SubLObject query_spec = cb_kb_query_state.kb_query_state_query_spec(query_state);
        final SubLObject sentence = cb_kb_query_state.kb_query_state_best_sentence(query_state);
        final SubLObject non_explanatory_sentence = cb_kb_query_state.kb_query_state_non_explanatory_sentence(query_state);
        final SubLObject query_mt = cb_kb_query_state.kb_query_state_best_mt(query_state);
        final SubLObject query_properties = cb_kb_query_state.kb_query_state_query_properties(query_state);
        final SubLObject defining_mt = cb_kb_query_state.kb_query_state_save_mt(query_state);
        final SubLObject template = cb_kb_query_state.kb_query_state_template(query_state);
        final SubLObject glosses = cb_kb_query_state.kb_query_state_template_glosses(query_state);
        final SubLObject folder_mt_pairs = cb_kb_query_state.kb_query_state_template_folder_mt_pairs(query_state);
        final SubLObject multiple_choice_option_specs = cb_kb_query_state.kb_query_state_multiple_choice_option_specs(query_state);
        kb_query.kbq_ensure_query_spec_definition(query_spec, sentence, query_mt, inference_parameters.explicify_query_tool_query_property_defaults(query_properties, sentence), defining_mt, non_explanatory_sentence, multiple_choice_option_specs);
        kb_query.kbq_ensure_template_definition(query_spec, template, glosses, folder_mt_pairs, defining_mt);
        cb_assertion_editor.cb_note_edit_change((SubLObject)cb_kb_query.$str36$Edit_Query_Specification, (SubLObject)cb_kb_query.T, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    public static SubLObject declare_cb_kb_query_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "kbq_register_query_spec_of_inference", "KBQ-REGISTER-QUERY-SPEC-OF-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "kbq_deregister_query_spec_of_inference", "KBQ-DEREGISTER-QUERY-SPEC-OF-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "kbq_lookup_query_spec_by_inference", "KBQ-LOOKUP-QUERY-SPEC-BY-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_from_query_spec", "CB-KB-QUERY-FROM-QUERY-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_link_kbq_ask", "CB-LINK-KBQ-ASK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_ask_kb_query", "CB-ASK-KB-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_in_proof_checker_from_query_spec", "CB-KB-QUERY-IN-PROOF-CHECKER-FROM-QUERY-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_link_kbq_ask_in_proof_checker", "CB-LINK-KBQ-ASK-IN-PROOF-CHECKER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_ask_kb_query_in_proof_checker", "CB-ASK-KB-QUERY-IN-PROOF-CHECKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "kbq_query_practice_rules", "KBQ-QUERY-PRACTICE-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_link_kbq_save", "CB-LINK-KBQ-SAVE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_save_as_query", "CB-SAVE-AS-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_link_kbq_edit", "CB-LINK-KBQ-EDIT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_edit_query", "CB-EDIT-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_confirm_save_as_query", "CB-CONFIRM-SAVE-AS-QUERY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_show_save_as_query_header", "CB-SHOW-SAVE-AS-QUERY-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_save_as_query_submit_section", "CB-SAVE-AS-QUERY-SUBMIT-SECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_comment_section", "CB-KB-QUERY-COMMENT-SECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_show_mt", "CB-KB-QUERY-SHOW-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_show_sentence", "CB-KB-QUERY-SHOW-SENTENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_show_pragmatics", "CB-KB-QUERY-SHOW-PRAGMATICS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_parameters_section", "CB-KB-QUERY-PARAMETERS-SECTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_multiple_choice_query_options_section", "CB-MULTIPLE-CHOICE-QUERY-OPTIONS-SECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_warn_of_extra_mt", "CB-KB-QUERY-WARN-OF-EXTRA-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_warn_of_extra_sentence", "CB-KB-QUERY-WARN-OF-EXTRA-SENTENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_handle_confirm_save_as_query", "CB-HANDLE-CONFIRM-SAVE-AS-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_extract_save_method", "CB-KB-QUERY-EXTRACT-SAVE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_extract_query_spec", "CB-KB-QUERY-EXTRACT-QUERY-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_extract_name", "CB-KB-QUERY-EXTRACT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_extract_defining_mt", "CB-KB-QUERY-EXTRACT-DEFINING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_extract_glosses", "CB-KB-QUERY-EXTRACT-GLOSSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_extract_folder_mt_pairs", "CB-KB-QUERY-EXTRACT-FOLDER-MT-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_query_extract_multiple_choice_option_specs", "CB-KB-QUERY-EXTRACT-MULTIPLE-CHOICE-OPTION-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_save_new_query", "CB-KB-SAVE-NEW-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.cb_kb_query", "cb_kb_overwrite_query", "CB-KB-OVERWRITE-QUERY", 1, 0, false);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    public static SubLObject init_cb_kb_query_file() {
        cb_kb_query.$kbq_inference_query_spec_map$ = SubLFiles.defparameter("*KBQ-INFERENCE-QUERY-SPEC-MAP*", Hashtables.make_hash_table((SubLObject)cb_kb_query.$int0$1024, (SubLObject)cb_kb_query.UNPROVIDED, (SubLObject)cb_kb_query.UNPROVIDED));
        cb_kb_query.$cb_multiple_choice_max_options$ = SubLFiles.deflexical("*CB-MULTIPLE-CHOICE-MAX-OPTIONS*", (SubLObject)cb_kb_query.FIVE_INTEGER);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    public static SubLObject setup_cb_kb_query_file() {
        cb_utilities.setup_cb_link_method((SubLObject)cb_kb_query.$kw6$KBQ_ASK, (SubLObject)cb_kb_query.$sym7$CB_LINK_KBQ_ASK, (SubLObject)cb_kb_query.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_kb_query.$sym8$CB_ASK_KB_QUERY, (SubLObject)cb_kb_query.$kw9$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_kb_query.$kw14$KBQ_ASK_IN_PROOF_CHECKER, (SubLObject)cb_kb_query.$sym15$CB_LINK_KBQ_ASK_IN_PROOF_CHECKER, (SubLObject)cb_kb_query.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_kb_query.$sym16$CB_ASK_KB_QUERY_IN_PROOF_CHECKER, (SubLObject)cb_kb_query.$kw9$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_kb_query.$kw24$KBQ_SAVE, (SubLObject)cb_kb_query.$sym25$CB_LINK_KBQ_SAVE, (SubLObject)cb_kb_query.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_kb_query.$sym28$CB_SAVE_AS_QUERY, (SubLObject)cb_kb_query.$kw9$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_kb_query.$kw32$KBQ_EDIT, (SubLObject)cb_kb_query.$sym33$CB_LINK_KBQ_EDIT, (SubLObject)cb_kb_query.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_kb_query.$sym35$CB_EDIT_QUERY, (SubLObject)cb_kb_query.$kw9$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_kb_query.$sym131$CB_HANDLE_CONFIRM_SAVE_AS_QUERY, (SubLObject)cb_kb_query.$kw9$HTML_HANDLER);
        return (SubLObject)cb_kb_query.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_kb_query_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_kb_query_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_kb_query_file();
    }
    
    static {
        me = (SubLFile)new cb_kb_query();
        cb_kb_query.$kbq_inference_query_spec_map$ = null;
        cb_kb_query.$cb_multiple_choice_max_options$ = null;
        $int0$1024 = SubLObjectFactory.makeInteger(1024);
        $sym1$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $sym2$KBQ_QUERY_SPEC_P = SubLObjectFactory.makeSymbol("KBQ-QUERY-SPEC-P");
        $str3$_Ask_Query_ = SubLObjectFactory.makeString("[Ask Query]");
        $kw4$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str5$cb_ask_kb_query__a = SubLObjectFactory.makeString("cb-ask-kb-query&~a");
        $kw6$KBQ_ASK = SubLObjectFactory.makeKeyword("KBQ-ASK");
        $sym7$CB_LINK_KBQ_ASK = SubLObjectFactory.makeSymbol("CB-LINK-KBQ-ASK");
        $sym8$CB_ASK_KB_QUERY = SubLObjectFactory.makeSymbol("CB-ASK-KB-QUERY");
        $kw9$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym10$CB_ADD_TO_PROOF_CHECKER_RULES = SubLObjectFactory.makeSymbol("CB-ADD-TO-PROOF-CHECKER-RULES");
        $kw11$ALLOWED_RULES = SubLObjectFactory.makeKeyword("ALLOWED-RULES");
        $str12$_Proof_check_Query_ = SubLObjectFactory.makeString("[Proof-check Query]");
        $str13$cb_ask_kb_query_in_proof_checker_ = SubLObjectFactory.makeString("cb-ask-kb-query-in-proof-checker&~a");
        $kw14$KBQ_ASK_IN_PROOF_CHECKER = SubLObjectFactory.makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $sym15$CB_LINK_KBQ_ASK_IN_PROOF_CHECKER = SubLObjectFactory.makeSymbol("CB-LINK-KBQ-ASK-IN-PROOF-CHECKER");
        $sym16$CB_ASK_KB_QUERY_IN_PROOF_CHECKER = SubLObjectFactory.makeSymbol("CB-ASK-KB-QUERY-IN-PROOF-CHECKER");
        $const17$queryPracticeRules = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryPracticeRules"));
        $str18$_Save_As_Query_ = SubLObjectFactory.makeString("[Save As Query]");
        $kw19$SELF = SubLObjectFactory.makeKeyword("SELF");
        $kw20$OVERLIB = SubLObjectFactory.makeKeyword("OVERLIB");
        $str21$Create_an_instance_of___CycLQuery = SubLObjectFactory.makeString("Create an instance of #$CycLQuerySpecification with the focal inference's sentence, microtheory and inference settings.");
        $str22$cb_save_as_query__A__A = SubLObjectFactory.makeString("cb-save-as-query&~A&~A");
        $str23$nd___ = SubLObjectFactory.makeString("nd();");
        $kw24$KBQ_SAVE = SubLObjectFactory.makeKeyword("KBQ-SAVE");
        $sym25$CB_LINK_KBQ_SAVE = SubLObjectFactory.makeSymbol("CB-LINK-KBQ-SAVE");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID-STRING"));
        $str27$Inference__S_in_problem_store__S_ = SubLObjectFactory.makeString("Inference ~S in problem store ~S is no longer available.");
        $sym28$CB_SAVE_AS_QUERY = SubLObjectFactory.makeSymbol("CB-SAVE-AS-QUERY");
        $str29$_Edit_Query_ = SubLObjectFactory.makeString("[Edit Query]");
        $str30$Edit_the_sentence__microtheory__i = SubLObjectFactory.makeString("Edit the sentence, microtheory, inference settings, etc. for this instance of #$CycLQuerySpecification.");
        $str31$cb_edit_query__A = SubLObjectFactory.makeString("cb-edit-query&~A");
        $kw32$KBQ_EDIT = SubLObjectFactory.makeKeyword("KBQ-EDIT");
        $sym33$CB_LINK_KBQ_EDIT = SubLObjectFactory.makeSymbol("CB-LINK-KBQ-EDIT");
        $str34$_A_does_not_denote_a_query_specif = SubLObjectFactory.makeString("~A does not denote a query specification");
        $sym35$CB_EDIT_QUERY = SubLObjectFactory.makeSymbol("CB-EDIT-QUERY");
        $str36$Edit_Query_Specification = SubLObjectFactory.makeString("Edit Query Specification");
        $str37$Save_Inference_Settings_as_Query_ = SubLObjectFactory.makeString("Save Inference Settings as Query Specification");
        $str38$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str39$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw40$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str41$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str42$post = SubLObjectFactory.makeString("post");
        $str43$cb_handle_confirm_save_as_query = SubLObjectFactory.makeString("cb-handle-confirm-save-as-query");
        $str44$The_interface_for_creating_and_ed = SubLObjectFactory.makeString("The interface for creating and editing CycLQuerySpecification instances.  Hover over the various headers for context-sensitive help.");
        $str45$Save_As_Query = SubLObjectFactory.makeString("Save As Query");
        $str46$Goto_section__ = SubLObjectFactory.makeString("Goto section :");
        $str47$Shortcut_links_to_sections_that_a = SubLObjectFactory.makeString("Shortcut links to sections that appear further down on this page.");
        $str48$mt_section = SubLObjectFactory.makeString("mt-section");
        $str49$_Mt_ = SubLObjectFactory.makeString("[Mt]");
        $str50$Change_the_Microtheory_settings_t = SubLObjectFactory.makeString("Change the Microtheory settings to be used for the saved query.");
        $str51$sentence_section = SubLObjectFactory.makeString("sentence-section");
        $str52$_Sentence_ = SubLObjectFactory.makeString("[Sentence]");
        $str53$Change_the_CycL_sentence_to_be_us = SubLObjectFactory.makeString("Change the CycL sentence to be used for the saved query.");
        $str54$parameters_section = SubLObjectFactory.makeString("parameters-section");
        $str55$_Inference_Parameters_ = SubLObjectFactory.makeString("[Inference Parameters]");
        $str56$Adjust_the_inference_parameters_a = SubLObjectFactory.makeString("Adjust the inference parameters and resource constraints that will be used when saving this query.");
        $str57$multiple_choice_section = SubLObjectFactory.makeString("multiple-choice-section");
        $str58$_Multiple_Choice_ = SubLObjectFactory.makeString("[Multiple Choice]");
        $str59$If_this_query_is_to_be_a_multiple = SubLObjectFactory.makeString("If this query is to be a multiple-choice query, define its multiple-choice options here.");
        $str60$Save_As_New_Query = SubLObjectFactory.makeString("Save As New Query");
        $str61$Creates_a_new___CycLQuerySpecific = SubLObjectFactory.makeString("Creates a new #$CycLQuerySpecification instance, with the specified sentence, mt and inference settings.");
        $str62$new = SubLObjectFactory.makeString("new");
        $str63$Name__ = SubLObjectFactory.makeString("Name: ");
        $str64$The_constant_name_to_save_the_que = SubLObjectFactory.makeString("The constant name to save the query specification as.");
        $str65$name = SubLObjectFactory.makeString("name");
        $int66$40 = SubLObjectFactory.makeInteger(40);
        $str67$Overwrite_Existing_Query = SubLObjectFactory.makeString("Overwrite Existing Query");
        $str68$Overwrites_the_existing_query_spe = SubLObjectFactory.makeString("Overwrites the existing query specification with the sentence, mt and inference settings specified here.");
        $str69$overwrite = SubLObjectFactory.makeString("overwrite");
        $str70$Reset_Values = SubLObjectFactory.makeString("Reset Values");
        $str71$cb_kbq_save_mt = SubLObjectFactory.makeString("cb-kbq-save-mt");
        $str72$Show = SubLObjectFactory.makeString("Show");
        $str73$Hide = SubLObjectFactory.makeString("Hide");
        $kw74$VISIBLE = SubLObjectFactory.makeKeyword("VISIBLE");
        $str75$Save_In_Mt__ = SubLObjectFactory.makeString("Save In Mt: ");
        $str76$The_microtheory_in_which_to_save_ = SubLObjectFactory.makeString("The microtheory in which to save the assertions about the query specification.  Should be a spec-mt of #$TestVocabularyMt.");
        $kw77$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("defining-mt"));
        $str79$comment_section = SubLObjectFactory.makeString("comment-section");
        $str80$query_comment = SubLObjectFactory.makeString("query-comment");
        $str81$Query_Comment__optional_ = SubLObjectFactory.makeString("Query Comment (optional)");
        $str82$Specify_a_comment_for_the_CycLQue = SubLObjectFactory.makeString("Specify a comment for the CycLQuerySpecification");
        $str83$comment = SubLObjectFactory.makeString("comment");
        $str84$Add_a_Comment__ = SubLObjectFactory.makeString("Add a Comment: ");
        $str85$new_comment = SubLObjectFactory.makeString("new-comment");
        $int86$80 = SubLObjectFactory.makeInteger(80);
        $str87$virtual = SubLObjectFactory.makeString("virtual");
        $str88$ = SubLObjectFactory.makeString("");
        $str89$cb_query_inference_mt = SubLObjectFactory.makeString("cb-query-inference-mt");
        $str90$Query_Mt = SubLObjectFactory.makeString("Query Mt");
        $str91$The_microtheory_in_which_the_quer = SubLObjectFactory.makeString("The microtheory in which the query will be performed.");
        $str92$query_sentence = SubLObjectFactory.makeString("query-sentence");
        $str93$Query_Sentence = SubLObjectFactory.makeString("Query Sentence");
        $str94$The_CycL_Sentence_for_the_query_ = SubLObjectFactory.makeString("The CycL Sentence for the query.");
        $str95$pragmatics_section = SubLObjectFactory.makeString("pragmatics-section");
        $str96$query_pragmatics = SubLObjectFactory.makeString("query-pragmatics");
        $str97$Query_Pragmatics = SubLObjectFactory.makeString("Query Pragmatics");
        $str98$An_optional_sentence_that_will_co = SubLObjectFactory.makeString("An optional sentence that will constrain the query for pragmatic reasons.  Justifications for answers will not include this sentence.");
        $kw99$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $str100$inference_parameters = SubLObjectFactory.makeString("inference-parameters");
        $str101$Inference_Parameters = SubLObjectFactory.makeString("Inference Parameters");
        $str102$The_inference_parameters_and_reso = SubLObjectFactory.makeString("The inference parameters and resource constraints that will be used when running the test query.");
        $str103$multiple_choice = SubLObjectFactory.makeString("multiple-choice");
        $str104$Multiple_Choice_Options = SubLObjectFactory.makeString("Multiple Choice Options");
        $str105$mc_option_number_ = SubLObjectFactory.makeString("mc-option-number-");
        $str106$_0 = SubLObjectFactory.makeString("-0");
        $str107$mc_option_full_label_ = SubLObjectFactory.makeString("mc-option-full_label-");
        $str108$mc_option_index_label_ = SubLObjectFactory.makeString("mc-option-index_label-");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-N"), (SubLObject)SubLObjectFactory.makeSymbol("KB-FULL-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("KB-INDEX-LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("KB-BINDINGS"));
        $str110$_ = SubLObjectFactory.makeString("(");
        $str111$_ = SubLObjectFactory.makeString(")");
        $str112$Option___ = SubLObjectFactory.makeString("Option # ");
        $str113$Full_label__ = SubLObjectFactory.makeString("Full label: ");
        $str114$A_label_that_fully_describes_this = SubLObjectFactory.makeString("A label that fully describes this multiple choice option, e.g. (A) 26");
        $int115$30 = SubLObjectFactory.makeInteger(30);
        $str116$Index_label__ = SubLObjectFactory.makeString("Index label: ");
        $str117$A_label_serving_as_a_unique_index = SubLObjectFactory.makeString("A label serving as a unique index for this multiple choice option, e.g. (A)");
        $str118$mc_option_binding_ = SubLObjectFactory.makeString("mc-option-binding-");
        $str119$_ = SubLObjectFactory.makeString("-");
        $str120$Binding_for__A__ = SubLObjectFactory.makeString("Binding for ~A: ");
        $str121$red = SubLObjectFactory.makeString("red");
        $str122$A_query_specification_can_have_on = SubLObjectFactory.makeString("A query specification can have only one query mt.  These extra mts will be dropped.");
        $str123$A_query_specification_can_have_on = SubLObjectFactory.makeString("A query specification can have only one query sentence.  These extra sentences will be dropped.");
        $str124$_A = SubLObjectFactory.makeString("~A");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("non_exp_sentence"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED?"), (SubLObject)cb_kb_query.NIL);
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCATION"), (SubLObject)SubLObjectFactory.makeString("Pragmatics"));
        $kw128$NEW = SubLObjectFactory.makeKeyword("NEW");
        $kw129$OVERWRITE = SubLObjectFactory.makeKeyword("OVERWRITE");
        $str130$Unknown_query_save_method__A = SubLObjectFactory.makeString("Unknown query save method ~A");
        $sym131$CB_HANDLE_CONFIRM_SAVE_AS_QUERY = SubLObjectFactory.makeSymbol("CB-HANDLE-CONFIRM-SAVE-AS-QUERY");
        $kw132$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str133$query_spec = SubLObjectFactory.makeString("query-spec");
        $str134$No_name_was_specified_ = SubLObjectFactory.makeString("No name was specified.");
        $str135$gloss = SubLObjectFactory.makeString("gloss");
        $str136$new_gloss = SubLObjectFactory.makeString("new-gloss");
        $str137$folder = SubLObjectFactory.makeString("folder");
        $str138$new_folder = SubLObjectFactory.makeString("new-folder");
        $str139$new_folder_mt = SubLObjectFactory.makeString("new-folder-mt");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOLDER-ID"), (SubLObject)SubLObjectFactory.makeSymbol("MT-ID"));
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str142$mc_option_ = SubLObjectFactory.makeString("mc-option-");
        $list143 = ConsesLow.list((SubLObject)Characters.CHAR_hyphen);
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MC"), (SubLObject)SubLObjectFactory.makeSymbol("OPTION"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM-ID-STR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-ID-STR"));
        $str145$number = SubLObjectFactory.makeString("number");
        $kw146$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $str147$full_label = SubLObjectFactory.makeString("full_label");
        $kw148$FULL_LABEL = SubLObjectFactory.makeKeyword("FULL-LABEL");
        $str149$index_label = SubLObjectFactory.makeString("index_label");
        $kw150$INDEX_LABEL = SubLObjectFactory.makeKeyword("INDEX-LABEL");
        $str151$binding = SubLObjectFactory.makeString("binding");
        $str152$BINDING_ = SubLObjectFactory.makeString("BINDING-");
        $str153$Unexpected_multiple_choice_option = SubLObjectFactory.makeString("Unexpected multiple choice option label ~s");
        $kw154$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym155$SAFE__ = SubLObjectFactory.makeSymbol("SAFE-<");
        $sym156$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str157$Save_Query_Specification = SubLObjectFactory.makeString("Save Query Specification");
        $str158$_A_is_not_a_valid_constant_name_ = SubLObjectFactory.makeString("~A is not a valid constant name.");
        $str159$Already_a_constant_named__A = SubLObjectFactory.makeString("Already a constant named ~A");
        $str160$Constant__S_already_exists_which_ = SubLObjectFactory.makeString("Constant ~S already exists which differs from ~S only by case");
        $str161$Overwrite_Query_Specification = SubLObjectFactory.makeString("Overwrite Query Specification");
        $str162$_A_is_not_the_name_of_a_CycLQuery = SubLObjectFactory.makeString("~A is not the name of a CycLQuerySpecification.");
    }
}

/*

	Total time: 724 ms
	
*/