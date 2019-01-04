package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.rtp.rtp_madlibs;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_assertion_browser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_assertion_browser";
    public static final String myFingerPrint = "25ac89dccc3544bbb856a3cdcadf86a2a30c79c24182117eacf5568366bb9563";
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 6482L)
    private static SubLSymbol $cb_assertion_info_dependent_assertion_count_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 38464L)
    private static SubLSymbol $cb_deduction_id_url_pattern$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 45551L)
    public static SubLSymbol $cb_justify_table$;
    private static final SubLString $str0$Find_Assertion;
    private static final SubLString $str1$cb_handle_find_assertion;
    private static final SubLSymbol $sym2$CB_FIND_ASSERTION;
    private static final SubLSymbol $kw3$HTML_HANDLER;
    private static final SubLSymbol $kw4$CB_FIND_ASSERTION;
    private static final SubLString $str5$cb_find_assertion_html;
    private static final SubLObject $const6$EverythingPSC;
    private static final SubLString $str7$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str8$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw9$UNINITIALIZED;
    private static final SubLSymbol $kw10$CB_CYC;
    private static final SubLSymbol $kw11$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw12$SHA1;
    private static final SubLString $str13$yui_skin_sam;
    private static final SubLString $str14$reloadFrameButton;
    private static final SubLString $str15$button;
    private static final SubLString $str16$reload;
    private static final SubLString $str17$Refresh_Frames;
    private static final SubLString $str18$post;
    private static final SubLString $str19$Reset;
    private static final SubLList $list20;
    private static final SubLString $str21$use_genl_mts;
    private static final SubLString $str22$t;
    private static final SubLString $str23$Additionally_search_genlMts_for_t;
    private static final SubLSymbol $kw24$MAIN;
    private static final SubLString $str25$cb_find_assertion;
    private static final SubLSymbol $kw26$FIND_ASSERTION;
    private static final SubLSymbol $sym27$CB_LINK_FIND_ASSERTION;
    private static final SubLString $str28$FindAsrt;
    private static final SubLString $str29$Find_a_CycL_Assertion;
    private static final SubLString $str30$Sentence_was_not_well_formed_;
    private static final SubLString $str31$No_assertions_were_found_;
    private static final SubLString $str32$Some_assertions_were_found__;
    private static final SubLSymbol $sym33$CB_HANDLE_FIND_ASSERTION;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLString $str36$Could_not_determine_an_assertion_;
    private static final SubLString $str37$Find_Similar_Assertion;
    private static final SubLSymbol $sym38$CB_FIND_SIMILAR_ASSERTION;
    private static final SubLSymbol $sym39$ASSERTION_P;
    private static final SubLString $str40$_Find_Similar_;
    private static final SubLSymbol $kw41$SELF;
    private static final SubLString $str42$cb_find_similar_assertion__A;
    private static final SubLSymbol $kw43$FIND_SIMILAR_ASSERTION;
    private static final SubLSymbol $sym44$CB_LINK_FIND_SIMILAR_ASSERTION;
    private static final SubLSymbol $sym45$CB_ASSERTION;
    private static final SubLSymbol $sym46$CB_AF;
    private static final SubLString $str47$Public_;
    private static final SubLString $str48$;
    private static final SubLString $str49$Assertion__;
    private static final SubLString $str50$Meta_Assertions__;
    private static final SubLInteger $int51$1000;
    private static final SubLSymbol $kw52$UNKNOWN;
    private static final SubLString $str53$Truth___;
    private static final SubLString $str54$Strength___;
    private static final SubLString $str55$Direction___;
    private static final SubLSymbol $kw56$ARGUMENTS;
    private static final SubLString $str57$Arguments;
    private static final SubLString $str58$___;
    private static final SubLString $str59$No_Dependents;
    private static final SubLSymbol $kw60$DEPENDENTS;
    private static final SubLString $str61$Dependents;
    private static final SubLString $str62$_;
    private static final SubLString $str63$_A_assertion_P;
    private static final SubLString $str64$___A_unique_sentences_;
    private static final SubLString $str65$__;
    private static final SubLString $str66$_A_KB_HL_support_P;
    private static final SubLString $str67$_;
    private static final SubLSymbol $kw68$TRANSFORMATION_RULE_STATISTICS;
    private static final SubLString $str69$Backward_Inference_Statistics__;
    private static final SubLSymbol $kw70$NBSP;
    private static final SubLSymbol $kw71$VERBOSE;
    private static final SubLSymbol $kw72$CLEAR_TRANSFORMATION_RULE_STATISTICS;
    private static final SubLString $str73$_Clear_;
    private static final SubLSymbol $kw74$TOP;
    private static final SubLSymbol $kw75$RULE_FORWARD_INFERENCE_METRICS;
    private static final SubLString $str76$Forward_Inference_Statistics__;
    private static final SubLString $str77$Rule_properties__;
    private static final SubLString $str78$Self_Looping_;
    private static final SubLString $str79$Self_Expanding_;
    private static final SubLString $str80$Modification_of_this_Assertion_is;
    private static final SubLString $str81$Assertion_not_well_formed;
    private static final SubLList $list82;
    private static final SubLString $str83$Assertion_is_either_miscanonicali;
    private static final SubLString $str84$This_is_probably_due_to_a_canonic;
    private static final SubLString $str85$_;
    private static final SubLObject $const86$trueSentence;
    private static final SubLString $str87$This_is_probably_due_to_a___trueS;
    private static final SubLString $str88$Assertion_excepted_in_some_mts__;
    private static final SubLString $str89$Assertion_doomed_due_to__;
    private static final SubLList $list90;
    private static final SubLSymbol $kw91$RED;
    private static final SubLString $str92$EL_and_;
    private static final SubLString $str93$EL_Formula___;
    private static final SubLString $str94$f__;
    private static final SubLString $str95$__;
    private static final SubLString $str96$HL_Formula___;
    private static final SubLString $str97$__;
    private static final SubLSymbol $kw98$NL;
    private static final SubLString $str99$English_Translation___;
    private static final SubLSymbol $sym100$VARIABLE_P;
    private static final SubLList $list101;
    private static final SubLObject $const102$isa;
    private static final SubLObject $const103$quotedIsa;
    private static final SubLObject $const104$genls;
    private static final SubLSymbol $sym105$BOOLEAN;
    private static final SubLSymbol $sym106$SECOND;
    private static final SubLSymbol $sym107$THIRD;
    private static final SubLString $str108$Rule_Variable_Constraints__;
    private static final SubLString $str109$Variable;
    private static final SubLSymbol $sym110$CYC_VAR_;
    private static final SubLString $str111$_dddddd;
    private static final SubLString $str112$_cccccc;
    private static final SubLObject $const113$Thing;
    private static final SubLObject $const114$queryTemplate_Reln;
    private static final SubLString $str115$____which_ought_to_parse_any_of__;
    private static final SubLList $list116;
    private static final SubLSymbol $kw117$HTML;
    private static final SubLString $str118$Exceptions__;
    private static final SubLSymbol $kw119$NEW;
    private static final SubLSymbol $sym120$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY;
    private static final SubLSymbol $sym121$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY;
    private static final SubLSymbol $sym122$CB_ASSERTION_LINK_WITH_MT;
    private static final SubLSymbol $sym123$CB_ASSERTION_LINK;
    private static final SubLString $str124$Pragmatic_Requirements__;
    private static final SubLSymbol $sym125$CB_ASSERTION_WITH_SHOW_ENGLISH;
    private static final SubLString $str126$_Show_English_;
    private static final SubLString $str127$cb_assertion_with_show_english__a;
    private static final SubLSymbol $kw128$SHOW_ENGLISH;
    private static final SubLSymbol $sym129$CB_LINK_SHOW_ENGLISH;
    private static final SubLSymbol $sym130$CB_ASSERTION_WITH_SHOW_EL_FORMULA;
    private static final SubLString $str131$_EL_Formula_;
    private static final SubLString $str132$cb_assertion_with_show_el_formula;
    private static final SubLSymbol $kw133$SHOW_EL_FORMULA;
    private static final SubLSymbol $sym134$CB_LINK_SHOW_EL_FORMULA;
    private static final SubLSymbol $kw135$CB_ARGUMENTS;
    private static final SubLString $str136$cb_arguments_html;
    private static final SubLString $str137$_A_does_not_specify_an_assertion;
    private static final SubLString $str138$Arguments_for_Assertion___S;
    private static final SubLString $str139$Assertion___;
    private static final SubLSymbol $sym140$CB_ARGUMENTS;
    private static final SubLString $str141$cb_arguments__A;
    private static final SubLSymbol $sym142$CB_LINK_ARGUMENTS;
    private static final SubLSymbol $kw143$CB_DEPENDENTS;
    private static final SubLString $str144$cb_dependents_html;
    private static final SubLString $str145$Dependents_for_Assertion___S;
    private static final SubLString $str146$_A_Assertions_Deduced_using_Asser;
    private static final SubLString $str147$Assertion_Deduced_using_Assertion;
    private static final SubLString $str148$Supports___;
    private static final SubLString $str149$_Deduction_;
    private static final SubLString $str150$_;
    private static final SubLSymbol $kw151$DEDUCTION;
    private static final SubLSymbol $sym152$CB_DEPENDENTS;
    private static final SubLString $str153$cb_dependents__A;
    private static final SubLSymbol $sym154$CB_LINK_DEPENDENTS;
    private static final SubLSymbol $sym155$CB_ASSERTION_DEPENDENCIES;
    private static final SubLString $str156$_Dependencies_;
    private static final SubLString $str157$cb_assertion_dependencies__A;
    private static final SubLSymbol $kw158$ASSERTION_DEPENDENCIES;
    private static final SubLSymbol $sym159$CB_LINK_ASSERTION_DEPENDENCIES;
    private static final SubLString $str160$Assertion_Dependencies;
    private static final SubLString $str161$_S_dependent_assertion_A;
    private static final SubLString $str162$s__in_order;
    private static final SubLString $str163$_Refresh_;
    private static final SubLString $str164$_A_does_not_specify_an_argument;
    private static final SubLSymbol $sym165$CB_DEDUCTION;
    private static final SubLString $str166$cb_deduction__A;
    private static final SubLString $str167$Dont_know_how_to_convert__A_into_;
    private static final SubLSymbol $sym168$DEDUCTION_P;
    private static final SubLString $str169$Deduction___A;
    private static final SubLSymbol $sym170$CB_LINK_DEDUCTION;
    private static final SubLString $str171$__;
    private static final SubLString $str172$DEDUCTION___A;
    private static final SubLString $str173$_;
    private static final SubLString $str174$__DEDUCTION___;
    private static final SubLSymbol $kw175$DEDUCTION_STRUCT;
    private static final SubLSymbol $sym176$CB_LINK_DEDUCTION_STRUCT;
    private static final SubLSymbol $sym177$CB_FORM_DEDUCTION_METHOD;
    private static final SubLString $str178$Deduced_Argument_detail;
    private static final SubLSymbol $kw179$CB_SOURCE;
    private static final SubLString $str180$cb_source_html;
    private static final SubLString $str181$Deduced_Argument___S;
    private static final SubLSymbol $kw182$REMOVE_DEDUCTION;
    private static final SubLString $str183$_Remove_Deduction_;
    private static final SubLString $str184$Previous;
    private static final SubLString $str185$Next;
    private static final SubLString $str186$Argument_was_Overruled;
    private static final SubLString $str187$Conclusion__;
    private static final SubLString $str188$Mt___;
    private static final SubLString $str189$Supported_conclusion_is_invalid_;
    private static final SubLString $str190$Justification___;
    private static final SubLList $list191;
    private static final SubLSymbol $sym192$_;
    private static final SubLString $str193$Date_of_most_recent_supporting_as;
    private static final SubLString $str194$Supporting_asserted_assertions___;
    private static final SubLString $str195$Supports;
    private static final SubLString $str196$_and_pragmatic_supports;
    private static final SubLString $str197$_max_floor_mts___;
    private static final SubLSymbol $kw198$BULL;
    private static final SubLSymbol $sym199$SUPPORT_MT;
    private static final SubLSymbol $sym200$RULE_ASSERTION_;
    private static final SubLString $str201$Bound_rule_justification___;
    private static final SubLSymbol $sym202$_CB_JUSTIFY_TABLE_;
    private static final SubLSymbol $kw203$CB_JUSTIFY;
    private static final SubLString $str204$cb_justify_html;
    private static final SubLInteger $int205$100;
    private static final SubLString $str206$Full_justification_for_Assertion_;
    private static final SubLString $str207$Assertion_Supported__;
    private static final SubLSymbol $sym208$CB_JUSTIFY;
    private static final SubLString $str209$_Justify_;
    private static final SubLString $str210$cb_justify__A;
    private static final SubLSymbol $kw211$JUSTIFY;
    private static final SubLSymbol $sym212$CB_LINK_JUSTIFY;
    private static final SubLString $str213$Complete_Justification_for_Assert;
    private static final SubLString $str214$Arguments_Supporting_Assertion__;
    private static final SubLString $str215$Argument___;
    private static final SubLString $str216$Justified_Above;
    private static final SubLString $str217$disc;
    private static final SubLString $str218$1;
    private static final SubLString $str219$Asserted_locally;
    private static final SubLString $str220$_by_;
    private static final SubLString $str221$_on_;
    private static final SubLString $str222$_at_;
    private static final SubLString $str223$_for_;
    private static final SubLSymbol $kw224$NONE;
    private static final SubLSymbol $kw225$LEFT;
    private static final SubLList $list226;
    private static final SubLString $str227$_A_does_not_specify_an_HL_support;
    private static final SubLSymbol $sym228$CB_HL_SUPPORT;
    private static final SubLSymbol $sym229$HL_SUPPORT_P;
    private static final SubLSymbol $sym230$INTERMEDIATE_STEP_VALIDATION_LEVEL_P;
    private static final SubLString $str231$cb_hl_support__A__A;
    private static final SubLSymbol $kw232$HL_SUPPORT;
    private static final SubLSymbol $sym233$CB_LINK_HL_SUPPORT;
    private static final SubLString $str234$KB_HL_Support__S_Detail;
    private static final SubLString $str235$HL_Support_Detail;
    private static final SubLSymbol $kw236$CB_HL_SUPPORT;
    private static final SubLString $str237$cb_hl_support_html;
    private static final SubLSymbol $kw238$HL_SUPPORT_VALIDATE;
    private static final SubLString $str239$_Validate_;
    private static final SubLSymbol $kw240$HL_SUPPORT_SIMILAR_QUERY;
    private static final SubLString $str241$_Query_Similar_;
    private static final SubLString $str242$Unknown;
    private static final SubLString $str243$Module___;
    private static final SubLString $str244$None_available;
    private static final SubLString $str245$Nothing_deeper_available;
    private static final SubLString $str246$Computed_forward_mt_combos___;
    private static final SubLObject $const247$InferencePSC;
    private static final SubLString $str248$__This_HL_support_has_a_very_slow;
    private static final SubLString $str249$__This_HL_support_has_a_stale_mt_;
    private static final SubLString $str250$KB_HL_Support_argument___;
    private static final SubLString $str251$_A_KB_HL_Support_dependents___;
    private static final SubLString $str252$cb_hl_validate__A__A;
    private static final SubLSymbol $sym253$CB_LINK_HL_SUPPORT_VALIDATE;
    private static final SubLString $str254$The_hl_support_is_not_available_;
    private static final SubLSymbol $sym255$CB_HL_VALIDATE;
    private static final SubLString $str256$cb_hl_support_similar_query__A;
    private static final SubLSymbol $sym257$CB_LINK_HL_SUPPORT_SIMILAR_QUERY;
    private static final SubLSymbol $sym258$CB_HL_SUPPORT_SIMILAR_QUERY;
    private static final SubLString $str259$_A_does_not_specify_an_HL_clause_;
    private static final SubLSymbol $sym260$CB_CLAUSE_STRUC;
    private static final SubLSymbol $sym261$CLAUSE_STRUC_P;
    private static final SubLString $str262$cb_clause_struc__A;
    private static final SubLString $str263$CLAUSE_STRUC___S;
    private static final SubLSymbol $kw264$CLAUSE_STRUC;
    private static final SubLSymbol $sym265$CB_LINK_CLAUSE_STRUC;
    private static final SubLSymbol $sym266$CB_FORM_CLAUSE_STRUC_METHOD;
    private static final SubLSymbol $kw267$CB_CLAUSE_STRUC;
    private static final SubLString $str268$cb_clause_struc_html;
    private static final SubLString $str269$Clause_Struc___S;
    private static final SubLString $str270$CNF_clause___;
    private static final SubLString $str271$Assertions_using_this_clause___;
    private static final SubLString $str272$__;
    private static final SubLString $str273$__;
    private static final SubLString $str274$assertion_id;
    private static final SubLString $str275$sentence;
    private static final SubLString $str276$sentence_type;
    private static final SubLString $str277$question;
    private static final SubLString $str278$question_type;
    private static final SubLSymbol $kw279$S;
    private static final SubLSymbol $kw280$Q;
    private static final SubLSymbol $sym281$CB_PROCESS_SUGGESTED_ENGLISH;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 641L)
    public static SubLObject cb_find_assertion(SubLObject args) {
        if (args == cb_assertion_browser.UNPROVIDED) {
            args = (SubLObject)cb_assertion_browser.NIL;
        }
        return cb_find_assertion_internal((SubLObject)cb_assertion_browser.$str0$Find_Assertion, (SubLObject)cb_assertion_browser.$str1$cb_handle_find_assertion, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 919L)
    public static SubLObject cb_find_assertion_internal(final SubLObject title_string, final SubLObject handler, SubLObject sentence, SubLObject mt) {
        if (sentence == cb_assertion_browser.UNPROVIDED) {
            sentence = (SubLObject)cb_assertion_browser.NIL;
        }
        if (mt == cb_assertion_browser.UNPROVIDED) {
            mt = cb_assertion_browser.$const6$EverythingPSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_browser.NIL != title_string) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_string);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw11$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_browser.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            if (cb_assertion_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_browser.NIL != title_string) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ(title_string);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str18$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        if (cb_assertion_browser.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input(handler, (SubLObject)cb_assertion_browser.T, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_browser.$kw4$CB_FIND_ASSERTION, (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_assertion_browser.$str19$Reset);
                            html_utilities.html_indent((SubLObject)cb_assertion_browser.ONE_INTEGER);
                            html_utilities.html_submit_input((SubLObject)cb_assertion_browser.$str0$Find_Assertion, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_assertion_browser.ONE_INTEGER);
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                            cb_form_widgets.cb_mt_input_section(mt, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section(sentence, (SubLObject)cb_assertion_browser.$list20);
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_checkbox_input((SubLObject)cb_assertion_browser.$str21$use_genl_mts, (SubLObject)cb_assertion_browser.$str22$t, (SubLObject)cb_assertion_browser.T, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ_strong((SubLObject)cb_assertion_browser.$str23$Additionally_search_genlMts_for_t);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 1835L)
    public static SubLObject cb_link_find_assertion(SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_browser.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_browser.$str0$Find_Assertion;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str25$cb_find_assertion);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 2142L)
    public static SubLObject cb_handle_find_assertion(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_find_assertion_args(args);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject use_genl_mtsP = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_browser.NIL != error) {
            return (SubLObject)cb_assertion_browser.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject assertions = czer_meta.find_assertions_cycl_in_mt(sentence, mt, use_genl_mtsP);
        final SubLObject all_presentP = thread.secondMultipleValue();
        final SubLObject czer_error = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_browser.NIL != czer_error) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str30$Sentence_was_not_well_formed_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        if (cb_assertion_browser.NIL == assertions) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str31$No_assertions_were_found_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        if (cb_assertion_browser.NIL != list_utilities.singletonP(assertions) && cb_assertion_browser.NIL != all_presentP) {
            return cb_assertion_internal(assertions.first());
        }
        final SubLObject title_var = (SubLObject)cb_assertion_browser.$str0$Find_Assertion;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_browser.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            if (cb_assertion_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        html_utilities.html_princ_strong((SubLObject)cb_assertion_browser.$str32$Some_assertions_were_found__);
                        SubLObject cdolist_list_var = assertions;
                        SubLObject assertion = (SubLObject)cb_assertion_browser.NIL;
                        assertion = cdolist_list_var.first();
                        while (cb_assertion_browser.NIL != cdolist_list_var) {
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_assertion_browser.T, (SubLObject)cb_assertion_browser.T);
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion = cdolist_list_var.first();
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$6, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 3051L)
    public static SubLObject cb_extract_find_assertion_args(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_browser.NIL != mt_error) {
            cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
            return Values.values(mt_error, (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.NIL);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_assertion_browser.$list34);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_browser.NIL != sentence_error) {
            cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, (SubLObject)cb_assertion_browser.UNPROVIDED);
            return Values.values(sentence_error, (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.NIL);
        }
        final SubLObject use_genl_mtsP = html_utilities.html_extract_input((SubLObject)cb_assertion_browser.$str21$use_genl_mts, args);
        return Values.values((SubLObject)cb_assertion_browser.NIL, mt, sentence, use_genl_mtsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 3684L)
    public static SubLObject cb_find_similar_assertion(final SubLObject args) {
        SubLObject assertion_id = (SubLObject)cb_assertion_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_browser.$list35);
        assertion_id = args.first();
        final SubLObject current = args.rest();
        if (cb_assertion_browser.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_browser.$list35);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLObject assertion = cb_utilities.cb_guess_assertion(assertion_id);
        if (cb_assertion_browser.NIL == assertion_handles.assertion_p(assertion)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str36$Could_not_determine_an_assertion_, assertion_id, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject sentence = ke.ke_assertion_edit_formula(assertion);
        return cb_find_assertion_internal((SubLObject)cb_assertion_browser.$str37$Find_Similar_Assertion, (SubLObject)cb_assertion_browser.$str1$cb_handle_find_assertion, sentence, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 4265L)
    public static SubLObject cb_link_find_similar_assertion(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (cb_assertion_browser.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_browser.$str40$_Find_Similar_;
        }
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str42$cb_find_similar_assertion__A, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 4610L)
    public static SubLObject cb_assertion(final SubLObject args) {
        SubLObject assertion_id = (SubLObject)cb_assertion_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_browser.$list35);
        assertion_id = args.first();
        final SubLObject current = args.rest();
        if (cb_assertion_browser.NIL == current) {
            final SubLObject assertion = cb_utilities.cb_guess_assertion(assertion_id);
            if (cb_assertion_browser.NIL == assertion_handles.assertion_p(assertion)) {
                return cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str36$Could_not_determine_an_assertion_, assertion_id, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            }
            cb_assertion_internal(assertion);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_browser.$list35);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 4971L)
    public static SubLObject cb_af(final SubLObject args) {
        return cb_assertion(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 5046L)
    public static SubLObject cb_assertion_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_tools.cb_add_to_assertion_history(assertion);
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject publicP = (SubLObject)cb_assertion_browser.NIL;
        final SubLObject title_var;
        final SubLObject title = title_var = Sequences.cconcatenate(format_nil.format_nil_a_no_copy((SubLObject)((cb_assertion_browser.NIL != publicP) ? cb_assertion_browser.$str47$Public_ : cb_assertion_browser.$str48$)), new SubLObject[] { cb_assertion_browser.$str49$Assertion__, format_nil.format_nil_a_no_copy(id) });
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_browser.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            if (cb_assertion_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        if (cb_assertion_browser.NIL != cb_tools.cb_bookmarks_supported_for_current_user()) {
                            cb_browser.cb_add_bookmark_term_link(assertion);
                        }
                        html_utilities.html_princ(title);
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        html_script_utilities.cb_hoverover_page_init();
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_assertion_editor.cb_assertion_toolbar(assertion);
                            html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            cb_assertion_info(assertion);
                            cb_assertion_diagnostics(assertion);
                            if (cb_assertion_browser.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                                final SubLObject _prev_bind_0_$15 = cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.currentBinding(thread);
                                try {
                                    cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.bind(assertion, thread);
                                    html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str50$Meta_Assertions__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                                    cb_browser.cb_c_total_internal(assertion);
                                    if (kb_indexing.num_exception_rule_index(assertion, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED).numG((SubLObject)cb_assertion_browser.ZERO_INTEGER)) {
                                        html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                        cb_show_exception_rule_index(assertion);
                                    }
                                    if (kb_indexing.num_pragma_rule_index(assertion, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED).numG((SubLObject)cb_assertion_browser.ZERO_INTEGER)) {
                                        html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                        cb_show_pragma_rule_index(assertion);
                                    }
                                }
                                finally {
                                    cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.rebind(_prev_bind_0_$15, thread);
                                }
                            }
                            cb_assertion_variable_info(assertion);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$11, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$10, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 6665L)
    public static SubLObject cb_assertion_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_browser.$kw52$UNKNOWN == assertions_high.assertion_truth(assertion)) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str53$Truth___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_utilities.cb_show_truth((SubLObject)cb_assertion_browser.$kw52$UNKNOWN);
        }
        else {
            final SubLObject strength = assertions_high.assertion_strength(assertion);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str54$Strength___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_utilities.cb_show_strength(strength);
        }
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str55$Direction___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_utilities.cb_show_direction(direction);
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw56$ARGUMENTS, assertion, (SubLObject)cb_assertion_browser.$str57$Arguments, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str58$___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_princ(Sequences.length(v_arguments));
        html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
        if (cb_assertion_browser.NIL == assertions_high.assertion_has_dependents_p(assertion)) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str59$No_Dependents);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        else {
            final SubLObject dependent_deduction_count = assertions_high.assertion_dependent_count(assertion);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw60$DEPENDENTS, assertion, (SubLObject)cb_assertion_browser.$str61$Dependents, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str58$___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_princ(dependent_deduction_count);
            if (dependent_deduction_count.numL(cb_assertion_browser.$cb_assertion_info_dependent_assertion_count_threshold$.getDynamicValue(thread))) {
                html_utilities.html_indent((SubLObject)cb_assertion_browser.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject dependent_assertion_count = assertion_utilities.assertion_dependent_supported_object_counts(assertion);
                final SubLObject dependent_kb_hl_support_count = thread.secondMultipleValue();
                final SubLObject dependent_clause_struct_count = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject some_assertionsP = Numbers.plusp(dependent_assertion_count);
                final SubLObject some_kb_hl_supportsP = Numbers.plusp(dependent_kb_hl_support_count);
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str62$_);
                if (cb_assertion_browser.NIL != some_assertionsP) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str63$_A_assertion_P, dependent_assertion_count, dependent_assertion_count);
                    if (!dependent_clause_struct_count.isZero() && !dependent_assertion_count.eql(dependent_clause_struct_count)) {
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str64$___A_unique_sentences_, dependent_clause_struct_count);
                    }
                }
                if (cb_assertion_browser.NIL != some_assertionsP && cb_assertion_browser.NIL != some_kb_hl_supportsP) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str65$__);
                }
                if (cb_assertion_browser.NIL != some_kb_hl_supportsP) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str66$_A_KB_HL_support_P, dependent_kb_hl_support_count, dependent_kb_hl_support_count);
                }
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str67$_);
            }
        }
        if (cb_assertion_browser.NIL != assertions_high.asserted_assertionP(assertion)) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            cb_asserted_argument(assertion);
        }
        if (cb_assertion_browser.NIL != assertions_high.rule_assertionP(assertion)) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
            cb_show_rule_info(assertion);
        }
        else {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        cb_assertion_show_formula_variants(assertion);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 9184L)
    public static SubLObject cb_show_rule_info(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_assertion_browser.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_assertion_browser.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw68$TRANSFORMATION_RULE_STATISTICS, (SubLObject)cb_assertion_browser.$str69$Backward_Inference_Statistics__, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    cb_query.cb_show_transformation_rule_statistics_for_rule(rule, (SubLObject)cb_assertion_browser.$kw71$VERBOSE);
                    if (cb_assertion_browser.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread) && inference_analysis.transformation_rule_considered_count(rule).isPositive()) {
                        html_utilities.html_indent((SubLObject)cb_assertion_browser.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw72$CLEAR_TRANSFORMATION_RULE_STATISTICS, rule, (SubLObject)cb_assertion_browser.$str73$_Clear_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            if (cb_assertion_browser.NIL != assertions_high.forward_assertionP(rule) && cb_assertion_browser.NIL != inference_metrics.$gathering_forward_inference_metricsP$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw75$RULE_FORWARD_INFERENCE_METRICS, rule, (SubLObject)cb_assertion_browser.$str76$Forward_Inference_Statistics__, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        cb_query.cb_show_forward_inference_statistics_for_rule(rule);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        final SubLObject self_looping = assertion_utilities.self_looping_ruleP(rule);
        final SubLObject self_expanding = assertion_utilities.self_expanding_ruleP(rule);
        if (cb_assertion_browser.NIL != self_looping || cb_assertion_browser.NIL != self_expanding) {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str77$Rule_properties__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        if (cb_assertion_browser.NIL != self_looping) {
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str78$Self_Looping_);
                        }
                        if (cb_assertion_browser.NIL != self_expanding) {
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str79$Self_Expanding_);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 10636L)
    public static SubLObject cb_assertion_diagnostics(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_browser.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread) && cb_assertion_browser.NIL == cb_assertion_editor.assertion_modification_permittedP(assertion)) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str80$Modification_of_this_Assertion_is);
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        cb_assertion_exception_info(assertion);
        cb_assertion_doomed_info(assertion);
        cb_rule_assertion_analysis_info(assertion);
        if (cb_assertion_browser.NIL != cb_parameters.$cb_a_perform_access_diagnostics$.getDynamicValue(thread)) {
            cb_assertion_access_diagnostics(assertion);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 11187L)
    public static SubLObject cb_canonicalizer_problemP(final SubLObject assertion) {
        return list_utilities.sublisp_boolean(cb_canonicalizer_problems(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 11338L)
    public static SubLObject cb_canonicalizer_problems(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject result = (SubLObject)cb_assertion_browser.NIL;
        thread.resetMultipleValues();
        final SubLObject el_formula = cb_utilities.cb_assertion_el_formula(assertion, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_browser.NIL == wff.el_wffP(el_formula, el_mt, (SubLObject)cb_assertion_browser.UNPROVIDED)) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.$str81$Assertion_not_well_formed, wff.explanation_of_why_not_wff(el_formula, el_mt, (SubLObject)cb_assertion_browser.$list82)), result);
        }
        if (cb_assertion_browser.NIL == subl_promotions.memberP(assertion, fi.sentence_assertions(el_formula, el_mt), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED)) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.$str83$Assertion_is_either_miscanonicali), result);
            if (cb_assertion_browser.NIL != assertions_high.gaf_assertionP(assertion) && cb_assertion_browser.NIL != czer_utilities.some_canonicalizer_directive_assertions_somewhereP(assertions_high.gaf_predicate(assertion))) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.NIL, Sequences.cconcatenate((SubLObject)cb_assertion_browser.$str84$This_is_probably_due_to_a_canonic, new SubLObject[] { format_nil.format_nil_s_no_copy(assertions_high.gaf_predicate(assertion)), cb_assertion_browser.$str85$_ })), result);
            }
            if (cb_assertion_browser.NIL != cycl_utilities.expression_find(cb_assertion_browser.$const86$trueSentence, assertions_high.assertion_cnf(assertion), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.$str87$This_is_probably_due_to_a___trueS), result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 12439L)
    public static SubLObject cb_assertion_exception_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justification = assertion_utilities.excepted_assertion_in_any_mtP(assertion, (SubLObject)cb_assertion_browser.T, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != justification) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str88$Assertion_excepted_in_some_mts__);
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject _prev_bind_0 = cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.currentBinding(thread);
            try {
                cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.bind(assertion, thread);
                SubLObject cdolist_list_var = justification;
                SubLObject support = (SubLObject)cb_assertion_browser.NIL;
                support = cdolist_list_var.first();
                while (cb_assertion_browser.NIL != cdolist_list_var) {
                    html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
                    cb_utilities.cb_show_assertion_readably(support, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                }
            }
            finally {
                cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
        }
        return justification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 12956L)
    public static SubLObject cb_assertion_doomed_info(final SubLObject assertion) {
        final SubLObject justification = assertion_utilities.doomed_assertionP(assertion, (SubLObject)cb_assertion_browser.T, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != justification) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str89$Assertion_doomed_due_to__);
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            SubLObject cdolist_list_var = justification;
            SubLObject support = (SubLObject)cb_assertion_browser.NIL;
            support = cdolist_list_var.first();
            while (cb_assertion_browser.NIL != cdolist_list_var) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
                cb_utilities.cb_show_assertion_readably(support, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
        }
        return justification;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 13369L)
    public static SubLObject cb_rule_assertion_analysis_info(final SubLObject assertion) {
        if (cb_assertion_browser.NIL != assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)cb_assertion_browser.NIL;
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 13731L)
    public static SubLObject cb_assertion_access_diagnostics(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject problems = cdolist_list_var = cb_canonicalizer_problems(assertion);
        SubLObject problem = (SubLObject)cb_assertion_browser.NIL;
        problem = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = problem;
            SubLObject description = (SubLObject)cb_assertion_browser.NIL;
            SubLObject more_descriptions = (SubLObject)cb_assertion_browser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_browser.$list90);
            description = current.first();
            current = (more_descriptions = current.rest());
            if (description.isString()) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject color_val = (SubLObject)cb_assertion_browser.$kw91$RED;
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (cb_assertion_browser.NIL != color_val) {
                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_val));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_utilities.html_princ(description);
                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            SubLObject cdolist_list_var_$28 = more_descriptions;
            SubLObject more_description = (SubLObject)cb_assertion_browser.NIL;
            more_description = cdolist_list_var_$28.first();
            while (cb_assertion_browser.NIL != cdolist_list_var_$28) {
                html_macros.verify_not_within_html_pre();
                html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                final SubLObject _prev_bind_2 = html_macros.$within_html_pre$.currentBinding(thread);
                try {
                    html_macros.$within_html_pre$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_princ(more_description);
                }
                finally {
                    html_macros.$within_html_pre$.rebind(_prev_bind_2, thread);
                }
                html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                more_description = cdolist_list_var_$28.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            problem = cdolist_list_var.first();
        }
        return problems;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 14218L)
    public static SubLObject cb_assertion_show_formula_variants(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_formula = fi.assertion_hl_formula(assertion, (SubLObject)cb_assertion_browser.UNPROVIDED);
        SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding(thread);
        try {
            html_cycl_string_printer.$html_large_string_limit$.bind((SubLObject)cb_assertion_browser.NIL, thread);
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            if (cb_assertion_browser.NIL != cb_parameters.$cb_a_show_el_formula$.getDynamicValue(thread)) {
                thread.resetMultipleValues();
                final SubLObject el_formula = cb_utilities.cb_assertion_el_formula(assertion, hl_formula);
                final SubLObject el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (fi.assertion_expand(narts_high.nart_expand(el_formula)).equal(fi.assertion_expand(narts_high.nart_expand(hl_formula))) && cb_assertion_browser.NIL != cb_parameters.$cb_a_show_hl_formula$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str92$EL_and_);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                else {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str93$EL_Formula___);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                    cb_browser.cb_c_mt_header(el_mt, (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.NIL);
                    html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$29 = cb_utilities.$rule_unlabelled_dont_care_variables$.currentBinding(thread);
                    try {
                        cb_utilities.$rule_unlabelled_dont_care_variables$.bind((SubLObject)((cb_assertion_browser.NIL != assertions_high.rule_assertionP(assertion)) ? el_utilities.rule_formula_unlabelled_dont_care_variables(el_formula) : cb_assertion_browser.NIL), thread);
                        if (cb_assertion_browser.NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread)) {
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str94$f__);
                        }
                        cb_utilities.cb_form_assertion_formula(assertion, el_formula, (SubLObject)cb_assertion_browser.ZERO_INTEGER, (SubLObject)cb_assertion_browser.T, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        if (cb_assertion_browser.NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread)) {
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str95$__);
                        }
                    }
                    finally {
                        cb_utilities.$rule_unlabelled_dont_care_variables$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                }
            }
            if (cb_assertion_browser.NIL != cb_parameters.$cb_a_show_hl_formula$.getDynamicValue(thread)) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str96$HL_Formula___);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                cb_browser.cb_c_mt_header(assertions_high.assertion_mt(assertion), (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.NIL);
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                if (cb_assertion_browser.NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread)) {
                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str94$f__);
                }
                cb_utilities.cb_form(assertion, (SubLObject)cb_assertion_browser.ZERO_INTEGER, (SubLObject)cb_assertion_browser.T);
                if (cb_assertion_browser.NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread)) {
                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str97$__);
                }
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            }
        }
        finally {
            html_cycl_string_printer.$html_large_string_limit$.rebind(_prev_bind_0, thread);
        }
        if (cb_assertion_browser.NIL != cb_parameters.$cb_a_show_english$.getDynamicValue(thread) || cb_assertion_browser.$kw98$NL == control_vars.$cb_major_presentation_language$.getDynamicValue(thread)) {
            _prev_bind_0 = control_vars.$cb_major_presentation_language$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
            try {
                control_vars.$cb_major_presentation_language$.bind((SubLObject)cb_assertion_browser.$kw98$NL, thread);
                pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)cb_assertion_browser.T, thread);
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str99$English_Translation___);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.NIL);
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            }
            finally {
                pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_2, thread);
                control_vars.$cb_major_presentation_language$.rebind(_prev_bind_0, thread);
            }
            if (cb_assertion_browser.NIL != rtp_madlibs.rtp_madlibs_formula_p(hl_formula, (SubLObject)cb_assertion_browser.UNPROVIDED)) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                cb_show_formula_madlibs(hl_formula);
            }
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 18808L)
    public static SubLObject rule_variable_arg_constraints_formula(final SubLObject rule_assertion) {
        final SubLObject hl_formula = assertions_high.assertion_formula(rule_assertion);
        final SubLObject mt = assertions_high.assertion_mt(rule_assertion);
        final SubLObject analysis_formula = el_utilities.make_conjunction((SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(hl_formula, (SubLObject)cb_assertion_browser.UNPROVIDED), cycl_utilities.formula_arg2(hl_formula, (SubLObject)cb_assertion_browser.UNPROVIDED)));
        final SubLObject constraints_dict = at_var_types.formula_variables_arg_constraints_dict(analysis_formula, mt, Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym100$VARIABLE_P), (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject constraints_formula = constraint_formula_from_constraints_dict(constraints_dict, mt);
        return constraints_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 19363L)
    public static SubLObject constraint_formula_from_constraints_dict(final SubLObject dict, SubLObject mt) {
        if (mt == cb_assertion_browser.UNPROVIDED) {
            mt = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cb_assertion_browser.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); cb_assertion_browser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject constraints = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject current;
            final SubLObject datum = current = constraints;
            SubLObject isa_cols = (SubLObject)cb_assertion_browser.NIL;
            SubLObject genls_cols = (SubLObject)cb_assertion_browser.NIL;
            SubLObject qisa_cols = (SubLObject)cb_assertion_browser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_browser.$list101);
            isa_cols = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_browser.$list101);
            genls_cols = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_browser.$list101);
            qisa_cols = current.first();
            current = current.rest();
            if (cb_assertion_browser.NIL == current) {
                isa_cols = genls.min_cols(isa_cols, mt, (SubLObject)cb_assertion_browser.UNPROVIDED);
                qisa_cols = genls.min_cols(qisa_cols, mt, (SubLObject)cb_assertion_browser.UNPROVIDED);
                genls_cols = genls.min_cols(genls_cols, mt, (SubLObject)cb_assertion_browser.UNPROVIDED);
                SubLObject cdolist_list_var = isa_cols;
                SubLObject v_isa = (SubLObject)cb_assertion_browser.NIL;
                v_isa = cdolist_list_var.first();
                while (cb_assertion_browser.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(cb_assertion_browser.$const102$isa, var, v_isa), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_isa = cdolist_list_var.first();
                }
                cdolist_list_var = qisa_cols;
                SubLObject qisa = (SubLObject)cb_assertion_browser.NIL;
                qisa = cdolist_list_var.first();
                while (cb_assertion_browser.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(cb_assertion_browser.$const103$quotedIsa, var, qisa), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    qisa = cdolist_list_var.first();
                }
                cdolist_list_var = genls_cols;
                SubLObject genl = (SubLObject)cb_assertion_browser.NIL;
                genl = cdolist_list_var.first();
                while (cb_assertion_browser.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(el_utilities.make_binary_formula(cb_assertion_browser.$const104$genls, var, genl), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    genl = cdolist_list_var.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_assertion_browser.$list101);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (cb_assertion_browser.NIL == result) {
            return (SubLObject)cb_assertion_browser.NIL;
        }
        if (cb_assertion_browser.NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return simplifier.conjoin(Sequences.nreverse(result), (SubLObject)cb_assertion_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 20076L)
    public static SubLObject cb_assertion_variable_info(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_browser.NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject el_formula = uncanonicalizer.assertion_el_formula(assertion);
            final SubLObject formula = el_utilities.make_conjunction((SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(el_formula, (SubLObject)cb_assertion_browser.UNPROVIDED), cycl_utilities.formula_arg2(el_formula, (SubLObject)cb_assertion_browser.UNPROVIDED)));
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject variables_arg_constraints_dict = at_var_types.formula_variables_arg_constraints_dict(formula, mt, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            if (cb_assertion_browser.NIL == dictionary.dictionary_empty_p(variables_arg_constraints_dict)) {
                final SubLObject all_values = dictionary.dictionary_values(variables_arg_constraints_dict);
                final SubLObject some_genlsP = Sequences.find_if(Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym105$BOOLEAN), all_values, Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym106$SECOND), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject some_qisaP = Sequences.find_if(Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym105$BOOLEAN), all_values, Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym107$THIRD), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str108$Rule_Variable_Constraints__);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.THREE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (cb_assertion_browser.NIL != html_macros.$html_color_dark_grey$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_color_dark_grey$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str109$Variable);
                            html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            cb_utilities.cb_form(cb_assertion_browser.$const102$isa, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        if (cb_assertion_browser.NIL != some_genlsP) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                                html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                cb_utilities.cb_form(cb_assertion_browser.$const104$genls, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        if (cb_assertion_browser.NIL != some_qisaP) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                                html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                cb_utilities.cb_form(cb_assertion_browser.$const103$quotedIsa, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject v_variables = list_utilities.remove_duplicates_preserving_order(Sequences.nreverse(cycl_utilities.expression_gather(formula, (SubLObject)cb_assertion_browser.$sym110$CYC_VAR_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED)), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    SubLObject bgcolor = (SubLObject)cb_assertion_browser.NIL;
                    SubLObject color_toggle = (SubLObject)cb_assertion_browser.NIL;
                    SubLObject list_var = (SubLObject)cb_assertion_browser.NIL;
                    SubLObject var = (SubLObject)cb_assertion_browser.NIL;
                    SubLObject ignore_me = (SubLObject)cb_assertion_browser.NIL;
                    list_var = v_variables;
                    var = list_var.first();
                    for (ignore_me = (SubLObject)cb_assertion_browser.ZERO_INTEGER; cb_assertion_browser.NIL != list_var; list_var = list_var.rest(), var = list_var.first(), ignore_me = Numbers.add((SubLObject)cb_assertion_browser.ONE_INTEGER, ignore_me)) {
                        if (cb_assertion_browser.NIL != color_toggle) {
                            color_toggle = (SubLObject)cb_assertion_browser.NIL;
                        }
                        else {
                            color_toggle = (SubLObject)cb_assertion_browser.T;
                        }
                        bgcolor = (SubLObject)((cb_assertion_browser.NIL != color_toggle) ? cb_assertion_browser.$str111$_dddddd : cb_assertion_browser.$str112$_cccccc);
                        final SubLObject isa_genl_qisa = dictionary.dictionary_lookup(variables_arg_constraints_dict, var, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (cb_assertion_browser.NIL != bgcolor) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(bgcolor);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ(var);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                                SubLObject cdolist_list_var = assertion_variable_info_cols(isa_genl_qisa.first(), mt);
                                SubLObject col = (SubLObject)cb_assertion_browser.NIL;
                                col = cdolist_list_var.first();
                                while (cb_assertion_browser.NIL != cdolist_list_var) {
                                    html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                    cb_utilities.cb_form(col, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    col = cdolist_list_var.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            if (cb_assertion_browser.NIL != some_genlsP) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                                    SubLObject cdolist_list_var = assertion_variable_info_cols(conses_high.second(isa_genl_qisa), mt);
                                    SubLObject col = (SubLObject)cb_assertion_browser.NIL;
                                    col = cdolist_list_var.first();
                                    while (cb_assertion_browser.NIL != cdolist_list_var) {
                                        html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                        cb_utilities.cb_form(col, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        col = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            if (cb_assertion_browser.NIL != some_qisaP) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                                    SubLObject cdolist_list_var = assertion_variable_info_cols(conses_high.third(isa_genl_qisa), mt);
                                    SubLObject col = (SubLObject)cb_assertion_browser.NIL;
                                    col = cdolist_list_var.first();
                                    while (cb_assertion_browser.NIL != cdolist_list_var) {
                                        html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                        cb_utilities.cb_form(col, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        col = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 22508L)
    public static SubLObject assertion_variable_info_cols(final SubLObject cols, final SubLObject mt) {
        return Sequences.remove(cb_assertion_browser.$const113$Thing, genls.min_cols(cols, mt, (SubLObject)cb_assertion_browser.UNPROVIDED), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 24621L)
    public static SubLObject cb_show_formula_madlibs(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = el_utilities.literal_predicate(sentence, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject query_modeP = genl_predicates.genl_predicateP(predicate, cb_assertion_browser.$const114$queryTemplate_Reln, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject madlibs = rtp_madlibs.rtp_generate_madlibs(sentence, (SubLObject)cb_assertion_browser.SIX_INTEGER, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        if (cb_assertion_browser.NIL != set.non_empty_set_p(madlibs)) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str115$____which_ought_to_parse_any_of__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(madlibs);
            SubLObject basis_object;
            SubLObject state;
            SubLObject madlib;
            SubLObject current;
            SubLObject datum;
            SubLObject syntax;
            SubLObject semantics;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)cb_assertion_browser.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); cb_assertion_browser.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                madlib = set_contents.do_set_contents_next(basis_object, state);
                if (cb_assertion_browser.NIL != set_contents.do_set_contents_element_validP(state, madlib)) {
                    datum = (current = madlib);
                    syntax = (SubLObject)cb_assertion_browser.NIL;
                    semantics = (SubLObject)cb_assertion_browser.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_browser.$list116);
                    syntax = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_browser.$list116);
                    semantics = current.first();
                    current = current.rest();
                    if (cb_assertion_browser.NIL == current) {
                        if (cb_assertion_browser.NIL != query_modeP) {
                            cb_utilities.cb_show_question_in_nl(syntax, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        else {
                            cb_utilities.cb_show_sentence_in_nl(syntax, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_assertion_browser.SIX_INTEGER);
                        cb_utilities.cb_form(semantics, (SubLObject)cb_assertion_browser.TWO_INTEGER, (SubLObject)cb_assertion_browser.NIL);
                        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_assertion_browser.$list116);
                    }
                }
            }
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 25458L)
    public static SubLObject cb_show_exception_rule_index(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)cb_assertion_browser.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$40 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$41 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$42 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$43 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$44 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = cb_utilities.$assertion_filter_hook$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                        pph_vars.$paraphrase_mode$.bind((SubLObject)cb_assertion_browser.$kw117$HTML, thread);
                                        cb_utilities.$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str118$Exceptions__);
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                                        cb_show_exception_rule_rec(rule);
                                    }
                                    finally {
                                        cb_utilities.$assertion_filter_hook$.rebind(_prev_bind_3, thread);
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$44, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_browser.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$42, thread);
                        }
                        if (new_or_reused == cb_assertion_browser.$kw119$NEW && cb_assertion_browser.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$41, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_browser.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (cb_assertion_browser.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$40, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 25779L)
    public static SubLObject cb_show_exception_rule_rec(final SubLObject rule) {
        SubLObject cdolist_list_var;
        final SubLObject mts = cdolist_list_var = kb_indexing.key_exception_rule_index(rule, (SubLObject)cb_assertion_browser.UNPROVIDED);
        SubLObject mt = (SubLObject)cb_assertion_browser.NIL;
        mt = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            cb_show_exception_rule_rec_mt(rule, mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 25961L)
    public static SubLObject cb_show_exception_rule_rec_mt(final SubLObject rule, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_browser.cb_c_mt_header(mt, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject assertion_link_fn = (cb_assertion_browser.NIL != cb_browser.cb_show_el_formulas_for_hookP(rule)) ? Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym121$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym123$CB_ASSERTION_LINK);
        final SubLObject _prev_bind_0 = cb_parameters.$cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_parameters.$cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
        try {
            cb_parameters.$cb_show_el_assertion_readably_last_formula$.bind((SubLObject)cb_assertion_browser.NIL, thread);
            cb_parameters.$cb_show_el_assertion_readably_last_mt$.bind((SubLObject)cb_assertion_browser.NIL, thread);
            kb_mapping.map_exception_rule_index(assertion_link_fn, rule, (SubLObject)cb_assertion_browser.NIL, mt);
        }
        finally {
            cb_parameters.$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
            cb_parameters.$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 26169L)
    public static SubLObject cb_show_pragma_rule_index(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)cb_assertion_browser.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$47 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$48 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$49 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$50 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$51 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = cb_utilities.$assertion_filter_hook$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_language_mt$.bind(cb_tools.cb_paraphrase_mt(), thread);
                                        pph_vars.$paraphrase_mode$.bind((SubLObject)cb_assertion_browser.$kw117$HTML, thread);
                                        cb_utilities.$assertion_filter_hook$.bind(cb_viewpoint.cb_calc_filter_hooks(), thread);
                                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str124$Pragmatic_Requirements__);
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                                        cb_show_pragma_rule_rec(rule);
                                    }
                                    finally {
                                        cb_utilities.$assertion_filter_hook$.rebind(_prev_bind_3, thread);
                                        pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$51, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_browser.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$49, thread);
                        }
                        if (new_or_reused == cb_assertion_browser.$kw119$NEW && cb_assertion_browser.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$48, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_browser.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (cb_assertion_browser.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$47, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 26452L)
    public static SubLObject cb_show_pragma_rule_rec(final SubLObject rule) {
        SubLObject cdolist_list_var;
        final SubLObject mts = cdolist_list_var = kb_indexing.key_pragma_rule_index(rule, (SubLObject)cb_assertion_browser.UNPROVIDED);
        SubLObject mt = (SubLObject)cb_assertion_browser.NIL;
        mt = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            cb_show_pragma_rule_rec_mt(rule, mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 26625L)
    public static SubLObject cb_show_pragma_rule_rec_mt(final SubLObject rule, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_browser.cb_c_mt_header(mt, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject assertion_link_fn = (cb_assertion_browser.NIL != cb_browser.cb_show_el_formulas_for_hookP(rule)) ? Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym121$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY) : Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym123$CB_ASSERTION_LINK);
        final SubLObject _prev_bind_0 = cb_parameters.$cb_show_el_assertion_readably_last_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = cb_parameters.$cb_show_el_assertion_readably_last_mt$.currentBinding(thread);
        try {
            cb_parameters.$cb_show_el_assertion_readably_last_formula$.bind((SubLObject)cb_assertion_browser.NIL, thread);
            cb_parameters.$cb_show_el_assertion_readably_last_mt$.bind((SubLObject)cb_assertion_browser.NIL, thread);
            kb_mapping.map_pragma_rule_index(assertion_link_fn, rule, (SubLObject)cb_assertion_browser.NIL, mt);
        }
        finally {
            cb_parameters.$cb_show_el_assertion_readably_last_mt$.rebind(_prev_bind_2, thread);
            cb_parameters.$cb_show_el_assertion_readably_last_formula$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 26827L)
    public static SubLObject cb_assertion_with_show_english(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_parameters.$cb_a_show_english$.currentBinding(thread);
        try {
            cb_parameters.$cb_a_show_english$.bind((SubLObject)cb_assertion_browser.T, thread);
            cb_assertion(args);
        }
        finally {
            cb_parameters.$cb_a_show_english$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 27105L)
    public static SubLObject cb_link_show_english(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_browser.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_browser.$str126$_Show_English_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str127$cb_assertion_with_show_english__a, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 27427L)
    public static SubLObject cb_assertion_with_show_el_formula(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_parameters.$cb_a_show_el_formula$.currentBinding(thread);
        try {
            cb_parameters.$cb_a_show_el_formula$.bind((SubLObject)cb_assertion_browser.T, thread);
            cb_assertion(args);
        }
        finally {
            cb_parameters.$cb_a_show_el_formula$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 27565L)
    public static SubLObject cb_link_show_el_formula(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_browser.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_browser.$str131$_EL_Formula_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str132$cb_assertion_with_show_el_formula, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 33547L)
    public static SubLObject cb_arguments(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
        if (cb_assertion_browser.NIL == assertion_handles.assertion_p(assertion)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str137$_A_does_not_specify_an_assertion, args, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLObject title_var;
        final SubLObject title = title_var = PrintLow.format((SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.$str138$Arguments_for_Assertion___S, assertion_handles.assertion_id(assertion));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$54 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_browser.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            if (cb_assertion_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_browser.$kw135$CB_ARGUMENTS, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str139$Assertion___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                            cb_justify_internal(assertion, (SubLObject)cb_assertion_browser.NIL);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$55, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$54, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 34138L)
    public static SubLObject cb_link_arguments(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str141$cb_arguments__A, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            if (cb_assertion_browser.NIL != linktext) {
                html_utilities.html_princ(linktext);
            }
            else {
                html_utilities.html_princ(Sequences.length(assertions_high.assertion_arguments(assertion)));
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 34495L)
    public static SubLObject cb_dependents(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
        if (cb_assertion_browser.NIL == assertion_handles.assertion_p(assertion)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str137$_A_does_not_specify_an_assertion, args, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLObject deductions = assertions_high.assertion_dependent_list(assertion);
        final SubLObject deduction_count = Sequences.length(deductions);
        final SubLObject v_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cb_assertion_browser.EQUAL), deduction_count);
        final SubLObject title = PrintLow.format((SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.$str145$Dependents_for_Assertion___S, assertion_handles.assertion_id(assertion));
        SubLObject cdolist_list_var = deductions;
        SubLObject deduction = (SubLObject)cb_assertion_browser.NIL;
        deduction = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_push(v_dictionary, deductions_high.deduction_assertion(deduction), deduction);
            cdolist_list_var = cdolist_list_var.rest();
            deduction = cdolist_list_var.first();
        }
        final SubLObject title_var = title;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$59 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$60 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_browser.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            if (cb_assertion_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_browser.$kw143$CB_DEPENDENTS, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str139$Assertion___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                            cb_utilities.cb_show_assertion_readably(assertion, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.T);
                            final SubLObject assertion_count = dictionary.dictionary_length(v_dictionary);
                            SubLObject index = (SubLObject)cb_assertion_browser.ZERO_INTEGER;
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            if (assertion_count.numG((SubLObject)cb_assertion_browser.ONE_INTEGER)) {
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str146$_A_Assertions_Deduced_using_Asser, assertion_count);
                            }
                            else {
                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str147$Assertion_Deduced_using_Assertion, assertion_count);
                            }
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); cb_assertion_browser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject dependent_assertion = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject deductions_$64 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                index = Numbers.add(index, (SubLObject)cb_assertion_browser.ONE_INTEGER);
                                html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                                if (cb_assertion_browser.NIL != assertion_handles.assertion_p(dependent_assertion)) {
                                    cb_utilities.cb_show_assertion_readably(dependent_assertion, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                }
                                else {
                                    cb_show_support(dependent_assertion, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                }
                                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_assertion_browser.THREE_INTEGER);
                                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str148$Supports___);
                                SubLObject cdolist_list_var2 = deductions_$64;
                                SubLObject deduction2 = (SubLObject)cb_assertion_browser.NIL;
                                deduction2 = cdolist_list_var2.first();
                                while (cb_assertion_browser.NIL != cdolist_list_var2) {
                                    html_utilities.html_indent((SubLObject)cb_assertion_browser.UNPROVIDED);
                                    final SubLObject id = deduction_handles.deduction_id(deduction2);
                                    final SubLObject linktext = Sequences.cconcatenate((SubLObject)cb_assertion_browser.$str149$_Deduction_, new SubLObject[] { format_nil.format_nil_a_no_copy(id), cb_assertion_browser.$str150$_ });
                                    cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw151$DEDUCTION, deduction2, linktext, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    deduction2 = cdolist_list_var2.first();
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$60, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$59, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 36209L)
    public static SubLObject cb_link_dependents(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str153$cb_dependents__A, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            if (cb_assertion_browser.NIL != linktext) {
                html_utilities.html_princ(linktext);
            }
            else {
                html_utilities.html_princ(assertions_high.assertion_dependent_count(assertion));
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 36462L)
    public static SubLObject cb_assertion_dependencies(final SubLObject args) {
        final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
        if (cb_assertion_browser.NIL == assertion_handles.assertion_p(assertion)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str137$_A_does_not_specify_an_assertion, args, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        return cb_assertion_dependencies_internal(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 36905L)
    public static SubLObject cb_link_assertion_dependencies(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (cb_assertion_browser.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_browser.$str156$_Dependencies_;
        }
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str157$cb_assertion_dependencies__A, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 37248L)
    public static SubLObject cb_assertion_dependencies_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_assertion_browser.$str160$Assertion_Dependencies;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$65 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_browser.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            if (cb_assertion_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        cb_assertion_dependencies_section(assertion);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$66, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$65, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 37430L)
    public static SubLObject cb_assertion_dependencies_section(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dependent_assertions = assertions_interface.all_dependent_assertions(assertion);
        final SubLObject count = number_utilities.f_1_(Sequences.length(dependent_assertions));
        cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_assertion_browser.T, (SubLObject)cb_assertion_browser.T);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str161$_S_dependent_assertion_A, count, (SubLObject)((cb_assertion_browser.NIL != number_utilities.onep(count)) ? cb_assertion_browser.$str48$ : cb_assertion_browser.$str162$s__in_order));
        html_utilities.html_indent((SubLObject)cb_assertion_browser.FOUR_INTEGER);
        cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw158$ASSERTION_DEPENDENCIES, assertion, (SubLObject)cb_assertion_browser.$str163$_Refresh_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        SubLObject cdolist_list_var = dependent_assertions;
        SubLObject dependent = (SubLObject)cb_assertion_browser.NIL;
        dependent = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            if (cb_assertion_browser.NIL == kb_utilities.kbeq(dependent, assertion)) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                cb_utilities.cb_show_assertion_readably(dependent, (SubLObject)cb_assertion_browser.T, (SubLObject)cb_assertion_browser.T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 38110L)
    public static SubLObject cb_deduction(final SubLObject args) {
        final SubLObject deduction = cb_utilities.cb_guess_deduction(args);
        if (cb_assertion_browser.NIL == deduction_handles.deduction_p(deduction)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str164$_A_does_not_specify_an_argument, args, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        return cb_deduction_internal(deduction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 38538L)
    public static SubLObject cb_deduction_id_url(final SubLObject v_object) {
        if (cb_assertion_browser.NIL != subl_promotions.non_negative_integer_p(v_object)) {
            return PrintLow.format((SubLObject)cb_assertion_browser.NIL, cb_assertion_browser.$cb_deduction_id_url_pattern$.getGlobalValue(), v_object);
        }
        if (cb_assertion_browser.NIL != deduction_handles.deduction_p(v_object)) {
            return cb_deduction_id_url(deduction_handles.deduction_id(v_object));
        }
        Errors.error((SubLObject)cb_assertion_browser.$str167$Dont_know_how_to_convert__A_into_, v_object);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 38858L)
    public static SubLObject cb_link_deduction(final SubLObject deduction, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != deduction_handles.deduction_p(deduction) : deduction;
        final SubLObject id = deduction_handles.deduction_id(deduction);
        cb_adornments.handle_adornments((SubLObject)cb_assertion_browser.$kw151$DEDUCTION, (SubLObject)cb_assertion_browser.$kw24$MAIN, deduction, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), cb_assertion_browser.$cb_deduction_id_url_pattern$.getGlobalValue(), id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            if (cb_assertion_browser.NIL != linktext) {
                html_utilities.html_princ(linktext);
            }
            else {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str169$Deduction___A, id);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 39225L)
    public static SubLObject cb_link_deduction_struct(final SubLObject deduction, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != deduction_handles.deduction_p(deduction) : deduction;
        final SubLObject id = deduction_handles.deduction_id(deduction);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), cb_assertion_browser.$cb_deduction_id_url_pattern$.getGlobalValue(), id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            if (cb_assertion_browser.NIL != linktext) {
                html_utilities.html_princ(linktext);
            }
            else {
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                if (id.isInteger()) {
                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str171$__);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str172$DEDUCTION___A, id);
                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str173$_);
                }
                else {
                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str174$__DEDUCTION___);
                }
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 39689L)
    public static SubLObject cb_form_deduction_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_assertion_browser.UNPROVIDED) {
            depth = (SubLObject)cb_assertion_browser.NIL;
        }
        if (wrap_axiomsP == cb_assertion_browser.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_assertion_browser.NIL;
        }
        cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw175$DEDUCTION_STRUCT, v_object, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 39843L)
    public static SubLObject cb_deduction_internal(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != deduction_handles.deduction_p(deduction) : deduction;
        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str178$Deduced_Argument_detail);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$69 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        cb_deduction_toolbar(deduction);
                        html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        cb_deduction_info(deduction);
                        cb_deduction_supports(deduction);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$69, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 40375L)
    public static SubLObject cb_deduction_toolbar(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_browser.NIL != deduction_handles.deduction_p(deduction)) {
            final SubLObject id = deduction_handles.deduction_id(deduction);
            final SubLObject title = PrintLow.format((SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.$str181$Deduced_Argument___S, id);
            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_browser.$kw179$CB_SOURCE, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            cb_goto_previous_deduction_control(deduction);
            html_utilities.html_indent((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_assertion_browser.UNPROVIDED);
            cb_goto_next_deduction_control(deduction);
            html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw151$DEDUCTION, deduction, (SubLObject)cb_assertion_browser.$str163$_Refresh_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            if (cb_assertion_browser.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread)) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw182$REMOVE_DEDUCTION, deduction, (SubLObject)cb_assertion_browser.$str183$_Remove_Deduction_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            }
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 41053L)
    public static SubLObject cb_goto_previous_deduction_control(final SubLObject deduction) {
        final SubLObject prev_d = kb_utilities.previous_deduction(deduction);
        if (cb_assertion_browser.NIL != deduction_handles.deduction_p(prev_d)) {
            cb_utilities.cb_left_arrow(cb_deduction_id_url(prev_d), (SubLObject)cb_assertion_browser.$str184$Previous, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        else {
            cb_utilities.cb_inactive_left_arrow();
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 41317L)
    public static SubLObject cb_goto_next_deduction_control(final SubLObject deduction) {
        final SubLObject next_d = kb_utilities.next_deduction(deduction);
        if (cb_assertion_browser.NIL != deduction_handles.deduction_p(next_d)) {
            cb_utilities.cb_right_arrow(cb_deduction_id_url(next_d), (SubLObject)cb_assertion_browser.$str185$Next, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        else {
            cb_utilities.cb_inactive_right_arrow();
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 41571L)
    public static SubLObject cb_deduction_info(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        final SubLObject truth = arguments.argument_truth(deduction);
        if (cb_assertion_browser.$kw52$UNKNOWN != truth) {
            final SubLObject strength = arguments.argument_strength(deduction);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str54$Strength___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_utilities.cb_show_strength(strength);
            html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
        }
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str53$Truth___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_utilities.cb_show_truth(truth);
        html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
        if (cb_assertion_browser.NIL != arguments.valid_supportP(supported_object, (SubLObject)cb_assertion_browser.UNPROVIDED)) {
            if (!truth.equal(arguments.support_truth(supported_object))) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                final SubLObject color_val = (SubLObject)cb_assertion_browser.$kw91$RED;
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (cb_assertion_browser.NIL != color_val) {
                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_val));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str186$Argument_was_Overruled);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
            }
            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str187$Conclusion__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject mt = arguments.support_mt(supported_object);
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str188$Mt___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_utilities.cb_form(mt, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            if (cb_assertion_browser.NIL != assertion_handles.assertion_p(supported_object)) {
                cb_assertion_show_formula_variants(supported_object);
            }
            else {
                cb_hl_support_show_formula_variants(supported_object);
            }
        }
        else {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str189$Supported_conclusion_is_invalid_);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 42952L)
    public static SubLObject cb_deduction_supports(final SubLObject deduction) {
        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str190$Justification___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_show_justification_readably(supports, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject assertion_dictionary = assertion_utilities.deduction_asserted_assertion_supports(deduction, (SubLObject)cb_assertion_browser.UNPROVIDED);
        SubLObject assertion_mts = (SubLObject)cb_assertion_browser.NIL;
        SubLObject latest_assertion_date = (SubLObject)cb_assertion_browser.NIL;
        SubLObject sorted_assertions = (SubLObject)cb_assertion_browser.NIL;
        SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values(assertion_dictionary, (SubLObject)cb_assertion_browser.$sym192$_);
        SubLObject cons = (SubLObject)cb_assertion_browser.NIL;
        cons = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject a = (SubLObject)cb_assertion_browser.NIL;
            SubLObject count = (SubLObject)cb_assertion_browser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_browser.$list191);
            a = current.first();
            current = (count = current.rest());
            final SubLObject date = assertions_high.asserted_when(a);
            if (cb_assertion_browser.NIL != date && (cb_assertion_browser.NIL == latest_assertion_date || date.numG(latest_assertion_date))) {
                latest_assertion_date = date;
            }
            final SubLObject item_var = assertions_high.assertion_mt(a);
            if (cb_assertion_browser.NIL == conses_high.member(item_var, assertion_mts, Symbols.symbol_function((SubLObject)cb_assertion_browser.EQL), Symbols.symbol_function((SubLObject)cb_assertion_browser.IDENTITY))) {
                assertion_mts = (SubLObject)ConsesLow.cons(item_var, assertion_mts);
            }
            sorted_assertions = (SubLObject)ConsesLow.cons(a, sorted_assertions);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str193$Date_of_most_recent_supporting_as);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_princ(latest_assertion_date);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str194$Supporting_asserted_assertions___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cdolist_list_var = sorted_assertions;
        SubLObject a2 = (SubLObject)cb_assertion_browser.NIL;
        a2 = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ(dictionary.dictionary_lookup(assertion_dictionary, a2, (SubLObject)cb_assertion_browser.UNPROVIDED));
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_assertion_browser.UNPROVIDED);
            cb_utilities.cb_show_assertion_readably(a2, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            a2 = cdolist_list_var.first();
        }
        final SubLObject pragmatic_support_mts = deductions_high.deduction_pragmatic_support_mts(deduction);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str195$Supports);
        if (cb_assertion_browser.NIL != pragmatic_support_mts) {
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str196$_and_pragmatic_supports);
        }
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str197$_max_floor_mts___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        SubLObject cdolist_list_var2 = genl_mts.max_floor_mts(ConsesLow.append(pragmatic_support_mts, Mapping.mapcar((SubLObject)cb_assertion_browser.$sym199$SUPPORT_MT, deductions_high.deduction_supports(deduction))), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        SubLObject mt = (SubLObject)cb_assertion_browser.NIL;
        mt = cdolist_list_var2.first();
        while (cb_assertion_browser.NIL != cdolist_list_var2) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw198$BULL, (SubLObject)cb_assertion_browser.UNPROVIDED);
            cb_utilities.cb_form(mt, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            mt = cdolist_list_var2.first();
        }
        final SubLObject v_bindings = deductions_high.deduction_bindings(deduction);
        if (cb_assertion_browser.NIL != v_bindings) {
            final SubLObject rule = Sequences.find_if((SubLObject)cb_assertion_browser.$sym200$RULE_ASSERTION_, deductions_high.deduction_supports(deduction), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str201$Bound_rule_justification___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject rule_bindings = bindings.apply_bindings_backwards(inference_worker_transformation.rule_assertion_base_variable_map(rule), v_bindings);
            final SubLObject rule_bound_el_formula = bindings.apply_bindings(rule_bindings, uncanonicalizer.assertion_el_formula(rule));
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            cb_utilities.cb_form(rule_bound_el_formula, (SubLObject)cb_assertion_browser.ZERO_INTEGER, (SubLObject)cb_assertion_browser.T);
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 45741L)
    public static SubLObject cb_justify(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
        if (cb_assertion_browser.NIL == assertion_handles.assertion_p(assertion)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str137$_A_does_not_specify_an_assertion, args, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        if (cb_assertion_browser.NIL == cb_assertion_browser.$cb_justify_table$.getDynamicValue(thread)) {
            cb_assertion_browser.$cb_justify_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)cb_assertion_browser.$int205$100, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED), thread);
        }
        Hashtables.clrhash(cb_assertion_browser.$cb_justify_table$.getDynamicValue(thread));
        Hashtables.sethash(assertion, cb_assertion_browser.$cb_justify_table$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.T);
        final SubLObject title_var;
        final SubLObject title = title_var = PrintLow.format((SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.$str206$Full_justification_for_Assertion_, assertion_handles.assertion_id(assertion));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$72 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_browser.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            if (cb_assertion_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_browser.$kw203$CB_JUSTIFY, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str207$Assertion_Supported__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                            cb_justify_internal(assertion, (SubLObject)cb_assertion_browser.T);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$73, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$72, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 46849L)
    public static SubLObject cb_link_justify(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_browser.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_browser.$str209$_Justify_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str210$cb_justify__A, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 47086L)
    public static SubLObject cb_justify_internal(final SubLObject assertion, SubLObject recurse) {
        if (recurse == cb_assertion_browser.UNPROVIDED) {
            recurse = (SubLObject)cb_assertion_browser.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_utilities.cb_show_assertion_readably(assertion, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.T);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        if (cb_assertion_browser.NIL != recurse) {
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str213$Complete_Justification_for_Assert);
        }
        else {
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str214$Arguments_Supporting_Assertion__);
        }
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        final SubLObject asserted_argument = assertions_high.get_asserted_argument(assertion);
        if (cb_assertion_browser.NIL != asserted_argument) {
            cb_asserted_argument(assertion);
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        SubLObject cdolist_list_var = v_arguments;
        SubLObject argument = (SubLObject)cb_assertion_browser.NIL;
        argument = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            if (!argument.eql(asserted_argument)) {
                if (!argument.eql(v_arguments.first())) {
                    html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                cb_justify_deduction(argument, recurse);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 47834L)
    public static SubLObject cb_justify_deduction(final SubLObject deduction, SubLObject recurse) {
        if (recurse == cb_assertion_browser.UNPROVIDED) {
            recurse = (SubLObject)cb_assertion_browser.T;
        }
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str215$Argument___);
        cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw151$DEDUCTION, deduction, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject supports = cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support = (SubLObject)cb_assertion_browser.NIL;
        support = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            cb_justify_support(support, recurse);
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 48154L)
    public static SubLObject cb_justify_support(final SubLObject support, SubLObject recurse) {
        if (recurse == cb_assertion_browser.UNPROVIDED) {
            recurse = (SubLObject)cb_assertion_browser.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_show_support(support, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != recurse && cb_assertion_browser.NIL != assertion_handles.assertion_p(support)) {
            if (cb_assertion_browser.NIL != Hashtables.gethash(support, cb_assertion_browser.$cb_justify_table$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.UNPROVIDED)) {
                if (cb_assertion_browser.NIL == assertions_high.asserted_assertionP(support)) {
                    html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)cb_assertion_browser.$str216$Justified_Above);
                }
            }
            else {
                Hashtables.sethash(support, cb_assertion_browser.$cb_justify_table$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.T);
                final SubLObject v_arguments = assertions_high.assertion_arguments(support);
                final SubLObject asserted_argument = assertions_high.get_asserted_argument(support);
                if (cb_assertion_browser.NIL != list_utilities.singletonP(v_arguments)) {
                    if (cb_assertion_browser.NIL == asserted_argument) {
                        html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_list_item_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str217$disc);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                                cb_justify_deduction(v_arguments.first(), (SubLObject)cb_assertion_browser.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
                    }
                }
                else {
                    html_utilities.html_markup(html_macros.$html_ordered_list_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        if (cb_assertion_browser.NIL != asserted_argument) {
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_list_item_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str218$1);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                                cb_asserted_argument(support);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        SubLObject cdolist_list_var = v_arguments;
                        SubLObject argument = (SubLObject)cb_assertion_browser.NIL;
                        argument = cdolist_list_var.first();
                        while (cb_assertion_browser.NIL != cdolist_list_var) {
                            if (!argument.eql(asserted_argument)) {
                                html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_list_item_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_browser.$str218$1);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                                    cb_justify_deduction(argument, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            argument = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_ordered_list_tail$.getGlobalValue());
                }
            }
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 49143L)
    public static SubLObject cb_asserted_argument(final SubLObject assertion) {
        final SubLObject cyclist = assertions_high.asserted_by(assertion);
        final SubLObject date = assertions_high.asserted_when(assertion);
        final SubLObject purpose = assertions_high.asserted_why(assertion);
        final SubLObject second = assertions_high.asserted_second(assertion);
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str219$Asserted_locally);
        if (cb_assertion_browser.NIL != cyclist) {
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str220$_by_);
            cb_utilities.cb_show_cyclist(cyclist);
        }
        if (cb_assertion_browser.NIL != date) {
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str221$_on_);
            cb_utilities.cb_show_date(date);
        }
        if (cb_assertion_browser.NIL != second) {
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str222$_at_);
            cb_utilities.cb_show_second(second);
        }
        if (cb_assertion_browser.NIL != purpose) {
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str223$_for_);
            cb_utilities.cb_form(purpose, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 49724L)
    public static SubLObject cb_show_support(final SubLObject support, SubLObject validation_level) {
        if (validation_level == cb_assertion_browser.UNPROVIDED) {
            validation_level = (SubLObject)cb_assertion_browser.$kw224$NONE;
        }
        if (cb_assertion_browser.NIL != assertion_handles.assertion_p(support)) {
            cb_utilities.cb_show_assertion_readably(support, (SubLObject)cb_assertion_browser.T, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        else if (cb_assertion_browser.NIL != kb_hl_support_handles.kb_hl_support_p(support)) {
            final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support(support);
            cb_utilities.cb_show_hl_support_readably(hl_support, validation_level);
        }
        else {
            cb_utilities.cb_show_hl_support_readably(support, validation_level);
        }
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 50114L)
    public static SubLObject cb_show_justification_readably(final SubLObject justification, SubLObject validation_level) {
        if (validation_level == cb_assertion_browser.UNPROVIDED) {
            validation_level = (SubLObject)cb_assertion_browser.$kw224$NONE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_assertion_browser.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_assertion_browser.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_assertion_browser.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            SubLObject cdolist_list_var = justification;
            SubLObject support = (SubLObject)cb_assertion_browser.NIL;
            support = cdolist_list_var.first();
            while (cb_assertion_browser.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw225$LEFT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_browser.$kw74$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        cb_show_support(support, validation_level);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 50451L)
    public static SubLObject cb_hl_support(final SubLObject args) {
        SubLObject id = (SubLObject)cb_assertion_browser.NIL;
        SubLObject validation_level_str = (SubLObject)cb_assertion_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_browser.$list226);
        id = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_assertion_browser.$list226);
        validation_level_str = current.first();
        current = current.rest();
        if (cb_assertion_browser.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_browser.$list226);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLObject hl_support = cb_guess_hl_support(id);
        final SubLObject validation_level = Symbols.make_keyword(validation_level_str);
        if (cb_assertion_browser.NIL == arguments.hl_support_p(hl_support)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str227$_A_does_not_specify_an_HL_support, args, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        return cb_hl_support_internal(hl_support, validation_level);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 50936L)
    public static SubLObject cb_link_hl_support(final SubLObject hl_support, SubLObject validation_level, SubLObject linktext) {
        if (validation_level == cb_assertion_browser.UNPROVIDED) {
            validation_level = (SubLObject)cb_assertion_browser.$kw224$NONE;
        }
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != arguments.hl_support_p(hl_support) : hl_support;
        assert cb_assertion_browser.NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) : validation_level;
        final SubLObject id = cb_hl_support_identifier(hl_support);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str231$cb_hl_support__A__A, id, validation_level);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            if (cb_assertion_browser.NIL != linktext) {
                html_utilities.html_princ(linktext);
            }
            else {
                html_utilities.html_prin1(arguments.support_module(hl_support));
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 51393L)
    public static SubLObject cb_hl_support_internal(final SubLObject hl_support, final SubLObject validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            final SubLObject possible_kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
            if (cb_assertion_browser.NIL != kb_hl_support_handles.kb_hl_support_p(possible_kb_hl_support)) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str234$KB_HL_Support__S_Detail, kb_hl_support_handles.kb_hl_support_id(possible_kb_hl_support));
            }
            else {
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str235$HL_Support_Detail);
            }
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$82 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        cb_hl_support_toolbar(hl_support, validation_level);
                        html_utilities.html_hr((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        cb_hl_support_info(hl_support);
                        cb_hl_support_justify(hl_support);
                        cb_hl_support_more_info(hl_support);
                        cb_hl_support_argument(hl_support);
                        cb_hl_support_dependents(hl_support);
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$82, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        return hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 52331L)
    public static SubLObject cb_hl_support_toolbar(final SubLObject hl_support, final SubLObject validation_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_browser.NIL != arguments.hl_support_p(hl_support)) {
            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_browser.$kw236$CB_HL_SUPPORT, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            final SubLObject possible_kb_hl_support = kb_hl_supports_high.find_kb_hl_support(hl_support);
            if (cb_assertion_browser.NIL != kb_hl_support_handles.kb_hl_support_p(possible_kb_hl_support)) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str234$KB_HL_Support__S_Detail, kb_hl_support_handles.kb_hl_support_id(possible_kb_hl_support));
            }
            else {
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str235$HL_Support_Detail);
            }
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw238$HL_SUPPORT_VALIDATE, hl_support, validation_level, (SubLObject)cb_assertion_browser.$str239$_Validate_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw232$HL_SUPPORT, hl_support, validation_level, (SubLObject)cb_assertion_browser.$str163$_Refresh_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw240$HL_SUPPORT_SIMILAR_QUERY, hl_support, (SubLObject)cb_assertion_browser.$str241$_Query_Similar_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 53108L)
    public static SubLObject cb_hl_support_info(final SubLObject hl_support) {
        if (cb_assertion_browser.$kw52$UNKNOWN == arguments.support_truth(hl_support)) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str53$Truth___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str242$Unknown);
        }
        else {
            final SubLObject strength = arguments.support_strength(hl_support);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str54$Strength___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            cb_utilities.cb_show_strength(strength);
        }
        final SubLObject module = arguments.support_module(hl_support);
        html_utilities.html_indent((SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str243$Module___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_utilities.cb_show_support_module(module);
        final SubLObject mt = arguments.support_mt(hl_support);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str188$Mt___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_utilities.cb_form(mt, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_hl_support_show_formula_variants(hl_support);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 53884L)
    public static SubLObject cb_hl_support_show_formula_variants(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_formula = arguments.support_formula(hl_support);
        if (cb_assertion_browser.NIL != cb_parameters.$cb_a_show_hl_formula$.getDynamicValue(thread) || cb_assertion_browser.NIL != cb_parameters.$cb_a_show_el_formula$.getDynamicValue(thread)) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str96$HL_Formula___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            cb_utilities.cb_form(hl_formula, (SubLObject)cb_assertion_browser.ZERO_INTEGER, (SubLObject)cb_assertion_browser.T);
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        if (cb_assertion_browser.NIL != cb_parameters.$cb_a_show_english$.getDynamicValue(thread)) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str99$English_Translation___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = control_vars.$cb_major_presentation_language$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            try {
                control_vars.$cb_major_presentation_language$.bind((SubLObject)cb_assertion_browser.$kw98$NL, thread);
                pph_vars.$pph_domain_mt$.bind(arguments.support_mt(hl_support), thread);
                cb_utilities.cb_show_hl_support_formula_readably(hl_formula);
            }
            finally {
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
                control_vars.$cb_major_presentation_language$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 54905L)
    public static SubLObject cb_hl_support_justify(final SubLObject hl_support) {
        final SubLObject justification = arguments.support_justification(hl_support);
        return cb_hl_support_justify_int(hl_support, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 55083L)
    public static SubLObject cb_hl_support_justify_int(final SubLObject hl_support, final SubLObject justification) {
        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str190$Justification___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (cb_assertion_browser.NIL == justification) {
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str244$None_available);
        }
        else if (cb_assertion_browser.NIL != list_utilities.singletonP(justification) && hl_support.equal(justification.first())) {
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str245$Nothing_deeper_available);
        }
        else {
            SubLObject cdolist_list_var = justification;
            SubLObject justify_support = (SubLObject)cb_assertion_browser.NIL;
            justify_support = cdolist_list_var.first();
            while (cb_assertion_browser.NIL != cdolist_list_var) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                cb_show_support(justify_support, (SubLObject)cb_assertion_browser.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                justify_support = cdolist_list_var.first();
            }
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 55552L)
    public static SubLObject cb_hl_support_more_info(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str246$Computed_forward_mt_combos___);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        SubLObject mts = (SubLObject)cb_assertion_browser.NIL;
        SubLObject forward_mt_combos_time = (SubLObject)cb_assertion_browser.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        mts = Mapping.mapcar((SubLObject)cb_assertion_browser.$sym199$SUPPORT_MT, hl_supports.hl_forward_mt_combos(arguments.make_hl_support(arguments.hl_support_module(hl_support), arguments.hl_support_sentence(hl_support), cb_assertion_browser.$const247$InferencePSC, (SubLObject)cb_assertion_browser.UNPROVIDED)));
        forward_mt_combos_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (forward_mt_combos_time.numG((SubLObject)cb_assertion_browser.ONE_INTEGER)) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_assertion_browser.$kw91$RED));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str248$__This_HL_support_has_a_very_slow, forward_mt_combos_time);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        if (cb_assertion_browser.NIL == list_utilities.member_kbeqP(arguments.support_mt(hl_support), mts)) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_assertion_browser.$kw91$RED));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str249$__This_HL_support_has_a_stale_mt_);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        SubLObject cdolist_list_var = mts;
        SubLObject mt = (SubLObject)cb_assertion_browser.NIL;
        mt = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            cb_utilities.cb_form(mt, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 56438L)
    public static SubLObject cb_hl_support_argument(final SubLObject hl_support) {
        final SubLObject kb_hl_support = (SubLObject)((cb_assertion_browser.NIL != kb_hl_support_handles.kb_hl_support_p(hl_support)) ? hl_support : ((cb_assertion_browser.NIL != arguments.hl_support_p(hl_support)) ? kb_hl_supports_high.find_kb_hl_support(hl_support) : cb_assertion_browser.NIL));
        if (cb_assertion_browser.NIL != kb_hl_support) {
            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str250$KB_HL_Support_argument___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            final SubLObject deduction = kb_hl_supports_interface.kb_kb_hl_support_argument(kb_hl_support);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw151$DEDUCTION, deduction, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            SubLObject cdolist_list_var = Sequences.nreverse(deductions_high.deduction_supports(deduction));
            SubLObject support = (SubLObject)cb_assertion_browser.NIL;
            support = cdolist_list_var.first();
            while (cb_assertion_browser.NIL != cdolist_list_var) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                cb_show_support(support, (SubLObject)cb_assertion_browser.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 57018L)
    public static SubLObject cb_hl_support_dependents(final SubLObject hl_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kb_hl_support = (SubLObject)((cb_assertion_browser.NIL != kb_hl_support_handles.kb_hl_support_p(hl_support)) ? hl_support : ((cb_assertion_browser.NIL != arguments.hl_support_p(hl_support)) ? kb_hl_supports_high.find_kb_hl_support(hl_support) : cb_assertion_browser.NIL));
        if (cb_assertion_browser.NIL != kb_hl_support) {
            final SubLObject deductions = kb_hl_supports_interface.kb_kb_hl_support_dependents(kb_hl_support);
            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str251$_A_KB_HL_Support_dependents___, Sequences.length(deductions));
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
            SubLObject cdolist_list_var = deductions;
            SubLObject deduction = (SubLObject)cb_assertion_browser.NIL;
            deduction = cdolist_list_var.first();
            while (cb_assertion_browser.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw151$DEDUCTION, deduction, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str58$___);
                cb_utilities.cb_form(deductions_high.deduction_supported_object(deduction), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                deduction = cdolist_list_var.first();
            }
        }
        return kb_hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 57653L)
    public static SubLObject cb_hl_support_identifier(final SubLObject hl_support) {
        return cb_parameters.cb_glob_id(hl_support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 57741L)
    public static SubLObject cb_guess_hl_support(final SubLObject args) {
        if (args.isInteger()) {
            return cb_parameters.cb_glob_lookup(args);
        }
        if (cb_assertion_browser.NIL != arguments.hl_support_p(args)) {
            return args;
        }
        if (cb_assertion_browser.NIL == args) {
            return (SubLObject)cb_assertion_browser.NIL;
        }
        if (args.isString()) {
            final SubLObject id = reader.read_from_string_ignoring_errors(args, (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            return cb_guess_hl_support(id);
        }
        if (args.isCons()) {
            return cb_guess_hl_support(args.first());
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 58127L)
    public static SubLObject cb_link_hl_support_validate(final SubLObject hl_support, final SubLObject validation_level, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != arguments.hl_support_p(hl_support) : hl_support;
        assert cb_assertion_browser.NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(validation_level) : validation_level;
        if (validation_level == cb_assertion_browser.$kw224$NONE) {
            return hl_support;
        }
        if (cb_assertion_browser.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_browser.$str239$_Validate_;
        }
        final SubLObject id = cb_hl_support_identifier(hl_support);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str252$cb_hl_validate__A__A, id, validation_level);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 58634L)
    public static SubLObject cb_hl_validate(final SubLObject args) {
        SubLObject id = (SubLObject)cb_assertion_browser.NIL;
        SubLObject validation_level_str = (SubLObject)cb_assertion_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_browser.$list226);
        id = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_assertion_browser.$list226);
        validation_level_str = current.first();
        current = current.rest();
        if (cb_assertion_browser.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_browser.$list226);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLObject hl_support = cb_guess_hl_support(id);
        final SubLObject validation_level = Symbols.make_keyword(validation_level_str);
        if (cb_assertion_browser.NIL == hl_support) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str254$The_hl_support_is_not_available_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        final SubLObject sentence = arguments.support_el_sentence(hl_support);
        final SubLObject mt = arguments.support_elmt(hl_support);
        final SubLObject violations = hl_supports.hl_validate_wff_violations(hl_support, validation_level);
        return cb_assertion_editor.cb_explain_why_not_wff(sentence, mt, violations, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 59164L)
    public static SubLObject cb_link_hl_support_similar_query(final SubLObject hl_support, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != arguments.hl_support_p(hl_support) : hl_support;
        if (cb_assertion_browser.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_browser.$str241$_Query_Similar_;
        }
        final SubLObject id = cb_hl_support_identifier(hl_support);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw41$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str256$cb_hl_support_similar_query__A, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return hl_support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 59529L)
    public static SubLObject cb_hl_support_similar_query(final SubLObject args) {
        final SubLObject hl_support = cb_guess_hl_support(args);
        if (cb_assertion_browser.NIL == hl_support) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str254$The_hl_support_is_not_available_, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        final SubLObject sentence = arguments.support_el_sentence(hl_support);
        final SubLObject mt = arguments.support_elmt(hl_support);
        return cb_query.cb_similar_query(sentence, mt, (SubLObject)cb_assertion_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 59869L)
    public static SubLObject cb_clause_struc(final SubLObject args) {
        final SubLObject clause_struc = cb_guess_clause_struc(args);
        if (cb_assertion_browser.NIL == clause_strucs.clause_struc_p(clause_struc)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_browser.$str259$_A_does_not_specify_an_HL_clause_, args, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            return (SubLObject)cb_assertion_browser.NIL;
        }
        return cb_clause_struc_internal(clause_struc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 60213L)
    public static SubLObject cb_link_clause_struc(final SubLObject clause_struc, SubLObject linktext) {
        if (linktext == cb_assertion_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_browser.NIL != clause_strucs.clause_struc_p(clause_struc) : clause_struc;
        final SubLObject id = clause_strucs.clause_struc_id(clause_struc);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_browser.$kw24$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str262$cb_clause_struc__A, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        if (cb_assertion_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
            if (cb_assertion_browser.NIL != linktext) {
                html_utilities.html_princ(linktext);
            }
            else {
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str171$__);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_browser.$str263$CLAUSE_STRUC___S, id);
                html_utilities.html_princ((SubLObject)cb_assertion_browser.$str173$_);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return clause_struc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 60614L)
    public static SubLObject cb_form_clause_struc_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_assertion_browser.UNPROVIDED) {
            depth = (SubLObject)cb_assertion_browser.NIL;
        }
        if (wrap_axiomsP == cb_assertion_browser.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_assertion_browser.NIL;
        }
        cb_utilities.cb_link((SubLObject)cb_assertion_browser.$kw264$CLAUSE_STRUC, v_object, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 60835L)
    public static SubLObject cb_clause_struc_internal(final SubLObject clause_struc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cnf = clause_strucs.clause_struc_cnf(clause_struc);
        final SubLObject title_var;
        final SubLObject title = title_var = PrintLow.format((SubLObject)cb_assertion_browser.NIL, (SubLObject)cb_assertion_browser.$str269$Clause_Struc___S, clause_strucs.clause_struc_id(clause_struc));
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_browser.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str7$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_browser.$str8$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$85 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_browser.$kw9$UNINITIALIZED) ? ConsesLow.list(cb_assertion_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_browser.$kw10$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_browser.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$86 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_browser.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_browser.$str13$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_browser.$str14$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str15$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.$str16$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str17$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            if (cb_assertion_browser.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_browser.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_browser.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_browser.$kw267$CB_CLAUSE_STRUC, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str270$CNF_clause___);
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            cb_cnf(clauses.neg_lits(cnf), clauses.pos_lits(cnf));
                            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                            final SubLObject assertions = clause_strucs.clause_struc_assertions(clause_struc);
                            html_utilities.html_newline((SubLObject)cb_assertion_browser.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_browser.$str271$Assertions_using_this_clause___);
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            SubLObject cdolist_list_var = assertions;
                            SubLObject assertion = (SubLObject)cb_assertion_browser.NIL;
                            assertion = cdolist_list_var.first();
                            while (cb_assertion_browser.NIL != cdolist_list_var) {
                                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                                cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                assertion = cdolist_list_var.first();
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$86, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$85, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 61568L)
    public static SubLObject cb_cnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str272$__);
        SubLObject first = (SubLObject)cb_assertion_browser.T;
        SubLObject cdolist_list_var = neg_lits;
        SubLObject lit = (SubLObject)cb_assertion_browser.NIL;
        lit = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            if (cb_assertion_browser.NIL == first) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.TWO_INTEGER);
            }
            cb_utilities.cb_form(lit, (SubLObject)cb_assertion_browser.ONE_INTEGER, (SubLObject)cb_assertion_browser.UNPROVIDED);
            first = (SubLObject)cb_assertion_browser.NIL;
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str67$_);
        html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str62$_);
        first = (SubLObject)cb_assertion_browser.T;
        cdolist_list_var = pos_lits;
        lit = (SubLObject)cb_assertion_browser.NIL;
        lit = cdolist_list_var.first();
        while (cb_assertion_browser.NIL != cdolist_list_var) {
            if (cb_assertion_browser.NIL == first) {
                html_utilities.html_newline((SubLObject)cb_assertion_browser.UNPROVIDED);
                html_utilities.html_glyph((SubLObject)cb_assertion_browser.$kw70$NBSP, (SubLObject)cb_assertion_browser.TWO_INTEGER);
            }
            cb_utilities.cb_form(lit, (SubLObject)cb_assertion_browser.ONE_INTEGER, (SubLObject)cb_assertion_browser.UNPROVIDED);
            first = (SubLObject)cb_assertion_browser.NIL;
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        html_utilities.html_princ((SubLObject)cb_assertion_browser.$str273$__);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 62055L)
    public static SubLObject cb_guess_clause_struc(final SubLObject args) {
        if (args.isInteger()) {
            return clause_strucs.find_clause_struc_by_id(args);
        }
        if (cb_assertion_browser.NIL != clause_strucs.clause_struc_p(args)) {
            return args;
        }
        if (cb_assertion_browser.NIL == args) {
            return (SubLObject)cb_assertion_browser.NIL;
        }
        if (args.isString()) {
            final SubLObject id = reader.read_from_string_ignoring_errors(args, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
            if (id.isInteger()) {
                return clause_strucs.find_clause_struc_by_id(id);
            }
            return (SubLObject)cb_assertion_browser.NIL;
        }
        else {
            if (args.isCons()) {
                return cb_guess_clause_struc(args.first());
            }
            return (SubLObject)cb_assertion_browser.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 62505L)
    public static SubLObject cb_process_suggested_english(final SubLObject args) {
        final SubLObject assertion_id = reader.read_from_string(html_utilities.html_extract_input((SubLObject)cb_assertion_browser.$str274$assertion_id, args), (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        final SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
        final SubLObject assertion_cycl = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject sentence = html_utilities.html_extract_input((SubLObject)cb_assertion_browser.$str275$sentence, args);
        final SubLObject sentence_type = string_utilities.keyword_from_string(html_utilities.html_extract_input((SubLObject)cb_assertion_browser.$str276$sentence_type, args));
        final SubLObject v_question = html_utilities.html_extract_input((SubLObject)cb_assertion_browser.$str277$question, args);
        final SubLObject question_type = string_utilities.keyword_from_string(html_utilities.html_extract_input((SubLObject)cb_assertion_browser.$str278$question_type, args));
        if (cb_assertion_browser.NIL == string_utilities.empty_string_p(sentence)) {
            parsing_utilities.record_suggested_nl_for_assertion(assertion_cycl, sentence, (SubLObject)cb_assertion_browser.$kw279$S, sentence_type, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        if (cb_assertion_browser.NIL == string_utilities.empty_string_p(v_question)) {
            parsing_utilities.record_suggested_nl_for_assertion(assertion_cycl, v_question, (SubLObject)cb_assertion_browser.$kw280$Q, question_type, (SubLObject)cb_assertion_browser.UNPROVIDED, (SubLObject)cb_assertion_browser.UNPROVIDED);
        }
        cb_assertion_internal(assertion);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    public static SubLObject declare_cb_assertion_browser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_find_assertion", "CB-FIND-ASSERTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_find_assertion_internal", "CB-FIND-ASSERTION-INTERNAL", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_find_assertion", "CB-LINK-FIND-ASSERTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_handle_find_assertion", "CB-HANDLE-FIND-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_extract_find_assertion_args", "CB-EXTRACT-FIND-ASSERTION-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_find_similar_assertion", "CB-FIND-SIMILAR-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_find_similar_assertion", "CB-LINK-FIND-SIMILAR-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion", "CB-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_af", "CB-AF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_internal", "CB-ASSERTION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_info", "CB-ASSERTION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_rule_info", "CB-SHOW-RULE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_diagnostics", "CB-ASSERTION-DIAGNOSTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_canonicalizer_problemP", "CB-CANONICALIZER-PROBLEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_canonicalizer_problems", "CB-CANONICALIZER-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_exception_info", "CB-ASSERTION-EXCEPTION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_doomed_info", "CB-ASSERTION-DOOMED-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_rule_assertion_analysis_info", "CB-RULE-ASSERTION-ANALYSIS-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_access_diagnostics", "CB-ASSERTION-ACCESS-DIAGNOSTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_show_formula_variants", "CB-ASSERTION-SHOW-FORMULA-VARIANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "rule_variable_arg_constraints_formula", "RULE-VARIABLE-ARG-CONSTRAINTS-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "constraint_formula_from_constraints_dict", "CONSTRAINT-FORMULA-FROM-CONSTRAINTS-DICT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_variable_info", "CB-ASSERTION-VARIABLE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "assertion_variable_info_cols", "ASSERTION-VARIABLE-INFO-COLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_formula_madlibs", "CB-SHOW-FORMULA-MADLIBS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_exception_rule_index", "CB-SHOW-EXCEPTION-RULE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_exception_rule_rec", "CB-SHOW-EXCEPTION-RULE-REC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_exception_rule_rec_mt", "CB-SHOW-EXCEPTION-RULE-REC-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_pragma_rule_index", "CB-SHOW-PRAGMA-RULE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_pragma_rule_rec", "CB-SHOW-PRAGMA-RULE-REC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_pragma_rule_rec_mt", "CB-SHOW-PRAGMA-RULE-REC-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_with_show_english", "CB-ASSERTION-WITH-SHOW-ENGLISH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_show_english", "CB-LINK-SHOW-ENGLISH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_with_show_el_formula", "CB-ASSERTION-WITH-SHOW-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_show_el_formula", "CB-LINK-SHOW-EL-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_arguments", "CB-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_arguments", "CB-LINK-ARGUMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_dependents", "CB-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_dependents", "CB-LINK-DEPENDENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_dependencies", "CB-ASSERTION-DEPENDENCIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_assertion_dependencies", "CB-LINK-ASSERTION-DEPENDENCIES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_dependencies_internal", "CB-ASSERTION-DEPENDENCIES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_assertion_dependencies_section", "CB-ASSERTION-DEPENDENCIES-SECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_deduction", "CB-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_deduction_id_url", "CB-DEDUCTION-ID-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_deduction", "CB-LINK-DEDUCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_deduction_struct", "CB-LINK-DEDUCTION-STRUCT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_form_deduction_method", "CB-FORM-DEDUCTION-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_deduction_internal", "CB-DEDUCTION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_deduction_toolbar", "CB-DEDUCTION-TOOLBAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_goto_previous_deduction_control", "CB-GOTO-PREVIOUS-DEDUCTION-CONTROL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_goto_next_deduction_control", "CB-GOTO-NEXT-DEDUCTION-CONTROL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_deduction_info", "CB-DEDUCTION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_deduction_supports", "CB-DEDUCTION-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_justify", "CB-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_justify", "CB-LINK-JUSTIFY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_justify_internal", "CB-JUSTIFY-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_justify_deduction", "CB-JUSTIFY-DEDUCTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_justify_support", "CB-JUSTIFY-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_asserted_argument", "CB-ASSERTED-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_support", "CB-SHOW-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_show_justification_readably", "CB-SHOW-JUSTIFICATION-READABLY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support", "CB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_hl_support", "CB-LINK-HL-SUPPORT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_internal", "CB-HL-SUPPORT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_toolbar", "CB-HL-SUPPORT-TOOLBAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_info", "CB-HL-SUPPORT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_show_formula_variants", "CB-HL-SUPPORT-SHOW-FORMULA-VARIANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_justify", "CB-HL-SUPPORT-JUSTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_justify_int", "CB-HL-SUPPORT-JUSTIFY-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_more_info", "CB-HL-SUPPORT-MORE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_argument", "CB-HL-SUPPORT-ARGUMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_dependents", "CB-HL-SUPPORT-DEPENDENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_identifier", "CB-HL-SUPPORT-IDENTIFIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_guess_hl_support", "CB-GUESS-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_hl_support_validate", "CB-LINK-HL-SUPPORT-VALIDATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_validate", "CB-HL-VALIDATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_hl_support_similar_query", "CB-LINK-HL-SUPPORT-SIMILAR-QUERY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_hl_support_similar_query", "CB-HL-SUPPORT-SIMILAR-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_clause_struc", "CB-CLAUSE-STRUC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_link_clause_struc", "CB-LINK-CLAUSE-STRUC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_form_clause_struc_method", "CB-FORM-CLAUSE-STRUC-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_clause_struc_internal", "CB-CLAUSE-STRUC-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_cnf", "CB-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_guess_clause_struc", "CB-GUESS-CLAUSE-STRUC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_browser", "cb_process_suggested_english", "CB-PROCESS-SUGGESTED-ENGLISH", 1, 0, false);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    public static SubLObject init_cb_assertion_browser_file() {
        cb_assertion_browser.$cb_assertion_info_dependent_assertion_count_threshold$ = SubLFiles.defparameter("*CB-ASSERTION-INFO-DEPENDENT-ASSERTION-COUNT-THRESHOLD*", (SubLObject)cb_assertion_browser.$int51$1000);
        cb_assertion_browser.$cb_deduction_id_url_pattern$ = SubLFiles.deflexical("*CB-DEDUCTION-ID-URL-PATTERN*", (SubLObject)cb_assertion_browser.$str166$cb_deduction__A);
        cb_assertion_browser.$cb_justify_table$ = SubLFiles.defparameter("*CB-JUSTIFY-TABLE*", (SubLObject)cb_assertion_browser.NIL);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    public static SubLObject setup_cb_assertion_browser_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym2$CB_FIND_ASSERTION, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_assertion_browser.$kw4$CB_FIND_ASSERTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.$str5$cb_find_assertion_html, (SubLObject)cb_assertion_browser.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw26$FIND_ASSERTION, (SubLObject)cb_assertion_browser.$sym27$CB_LINK_FIND_ASSERTION, (SubLObject)cb_assertion_browser.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_assertion_browser.$kw26$FIND_ASSERTION, (SubLObject)cb_assertion_browser.$str0$Find_Assertion, (SubLObject)cb_assertion_browser.$str28$FindAsrt, (SubLObject)cb_assertion_browser.$str29$Find_a_CycL_Assertion);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym33$CB_HANDLE_FIND_ASSERTION, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym38$CB_FIND_SIMILAR_ASSERTION, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw43$FIND_SIMILAR_ASSERTION, (SubLObject)cb_assertion_browser.$sym44$CB_LINK_FIND_SIMILAR_ASSERTION, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym45$CB_ASSERTION, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym46$CB_AF, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym125$CB_ASSERTION_WITH_SHOW_ENGLISH, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw128$SHOW_ENGLISH, (SubLObject)cb_assertion_browser.$sym129$CB_LINK_SHOW_ENGLISH, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym130$CB_ASSERTION_WITH_SHOW_EL_FORMULA, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw133$SHOW_EL_FORMULA, (SubLObject)cb_assertion_browser.$sym134$CB_LINK_SHOW_EL_FORMULA, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        Hashtables.sethash((SubLObject)cb_assertion_browser.$kw135$CB_ARGUMENTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.$str136$cb_arguments_html, (SubLObject)cb_assertion_browser.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym140$CB_ARGUMENTS, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw56$ARGUMENTS, (SubLObject)cb_assertion_browser.$sym142$CB_LINK_ARGUMENTS, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        Hashtables.sethash((SubLObject)cb_assertion_browser.$kw143$CB_DEPENDENTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.$str144$cb_dependents_html, (SubLObject)cb_assertion_browser.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym152$CB_DEPENDENTS, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw60$DEPENDENTS, (SubLObject)cb_assertion_browser.$sym154$CB_LINK_DEPENDENTS, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym155$CB_ASSERTION_DEPENDENCIES, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw158$ASSERTION_DEPENDENCIES, (SubLObject)cb_assertion_browser.$sym159$CB_LINK_ASSERTION_DEPENDENCIES, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym165$CB_DEDUCTION, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw151$DEDUCTION, (SubLObject)cb_assertion_browser.$sym170$CB_LINK_DEDUCTION, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw175$DEDUCTION_STRUCT, (SubLObject)cb_assertion_browser.$sym176$CB_LINK_DEDUCTION_STRUCT, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym177$CB_FORM_DEDUCTION_METHOD));
        Hashtables.sethash((SubLObject)cb_assertion_browser.$kw179$CB_SOURCE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.$str180$cb_source_html, (SubLObject)cb_assertion_browser.NIL));
        utilities_macros.register_html_state_variable((SubLObject)cb_assertion_browser.$sym202$_CB_JUSTIFY_TABLE_);
        Hashtables.sethash((SubLObject)cb_assertion_browser.$kw203$CB_JUSTIFY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.$str204$cb_justify_html, (SubLObject)cb_assertion_browser.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym208$CB_JUSTIFY, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw211$JUSTIFY, (SubLObject)cb_assertion_browser.$sym212$CB_LINK_JUSTIFY, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym228$CB_HL_SUPPORT, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw232$HL_SUPPORT, (SubLObject)cb_assertion_browser.$sym233$CB_LINK_HL_SUPPORT, (SubLObject)cb_assertion_browser.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_assertion_browser.$kw236$CB_HL_SUPPORT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.$str237$cb_hl_support_html, (SubLObject)cb_assertion_browser.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw238$HL_SUPPORT_VALIDATE, (SubLObject)cb_assertion_browser.$sym253$CB_LINK_HL_SUPPORT_VALIDATE, (SubLObject)cb_assertion_browser.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym255$CB_HL_VALIDATE, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw240$HL_SUPPORT_SIMILAR_QUERY, (SubLObject)cb_assertion_browser.$sym257$CB_LINK_HL_SUPPORT_SIMILAR_QUERY, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym258$CB_HL_SUPPORT_SIMILAR_QUERY, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym260$CB_CLAUSE_STRUC, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_browser.$kw264$CLAUSE_STRUC, (SubLObject)cb_assertion_browser.$sym265$CB_LINK_CLAUSE_STRUC, (SubLObject)cb_assertion_browser.TWO_INTEGER);
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_assertion_browser.$sym266$CB_FORM_CLAUSE_STRUC_METHOD));
        Hashtables.sethash((SubLObject)cb_assertion_browser.$kw267$CB_CLAUSE_STRUC, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_browser.$str268$cb_clause_struc_html, (SubLObject)cb_assertion_browser.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_browser.$sym281$CB_PROCESS_SUGGESTED_ENGLISH, (SubLObject)cb_assertion_browser.$kw3$HTML_HANDLER);
        return (SubLObject)cb_assertion_browser.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_assertion_browser_file();
    }
    
    public void initializeVariables() {
        init_cb_assertion_browser_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_assertion_browser_file();
    }
    
    static {
        me = (SubLFile)new cb_assertion_browser();
        cb_assertion_browser.$cb_assertion_info_dependent_assertion_count_threshold$ = null;
        cb_assertion_browser.$cb_deduction_id_url_pattern$ = null;
        cb_assertion_browser.$cb_justify_table$ = null;
        $str0$Find_Assertion = SubLObjectFactory.makeString("Find Assertion");
        $str1$cb_handle_find_assertion = SubLObjectFactory.makeString("cb-handle-find-assertion");
        $sym2$CB_FIND_ASSERTION = SubLObjectFactory.makeSymbol("CB-FIND-ASSERTION");
        $kw3$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $kw4$CB_FIND_ASSERTION = SubLObjectFactory.makeKeyword("CB-FIND-ASSERTION");
        $str5$cb_find_assertion_html = SubLObjectFactory.makeString("cb-find-assertion.html");
        $const6$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str7$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str8$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw9$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw10$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw11$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw12$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str13$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str14$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str15$button = SubLObjectFactory.makeString("button");
        $str16$reload = SubLObjectFactory.makeString("reload");
        $str17$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str18$post = SubLObjectFactory.makeString("post");
        $str19$Reset = SubLObjectFactory.makeString("Reset");
        $list20 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeString("sentence"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeString("Complete"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeString("Cyclify"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeString("Clear Sentence"), SubLObjectFactory.makeKeyword("HEIGHT"), cb_assertion_browser.TWENTY_INTEGER, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(80) });
        $str21$use_genl_mts = SubLObjectFactory.makeString("use-genl-mts");
        $str22$t = SubLObjectFactory.makeString("t");
        $str23$Additionally_search_genlMts_for_t = SubLObjectFactory.makeString("Additionally search genlMts for this assertion");
        $kw24$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str25$cb_find_assertion = SubLObjectFactory.makeString("cb-find-assertion");
        $kw26$FIND_ASSERTION = SubLObjectFactory.makeKeyword("FIND-ASSERTION");
        $sym27$CB_LINK_FIND_ASSERTION = SubLObjectFactory.makeSymbol("CB-LINK-FIND-ASSERTION");
        $str28$FindAsrt = SubLObjectFactory.makeString("FindAsrt");
        $str29$Find_a_CycL_Assertion = SubLObjectFactory.makeString("Find a CycL Assertion");
        $str30$Sentence_was_not_well_formed_ = SubLObjectFactory.makeString("Sentence was not well-formed.");
        $str31$No_assertions_were_found_ = SubLObjectFactory.makeString("No assertions were found.");
        $str32$Some_assertions_were_found__ = SubLObjectFactory.makeString("Some assertions were found :");
        $sym33$CB_HANDLE_FIND_ASSERTION = SubLObjectFactory.makeSymbol("CB-HANDLE-FIND-ASSERTION");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID"));
        $str36$Could_not_determine_an_assertion_ = SubLObjectFactory.makeString("Could not determine an assertion from ~a");
        $str37$Find_Similar_Assertion = SubLObjectFactory.makeString("Find Similar Assertion");
        $sym38$CB_FIND_SIMILAR_ASSERTION = SubLObjectFactory.makeSymbol("CB-FIND-SIMILAR-ASSERTION");
        $sym39$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str40$_Find_Similar_ = SubLObjectFactory.makeString("[Find Similar]");
        $kw41$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str42$cb_find_similar_assertion__A = SubLObjectFactory.makeString("cb-find-similar-assertion&~A");
        $kw43$FIND_SIMILAR_ASSERTION = SubLObjectFactory.makeKeyword("FIND-SIMILAR-ASSERTION");
        $sym44$CB_LINK_FIND_SIMILAR_ASSERTION = SubLObjectFactory.makeSymbol("CB-LINK-FIND-SIMILAR-ASSERTION");
        $sym45$CB_ASSERTION = SubLObjectFactory.makeSymbol("CB-ASSERTION");
        $sym46$CB_AF = SubLObjectFactory.makeSymbol("CB-AF");
        $str47$Public_ = SubLObjectFactory.makeString("Public ");
        $str48$ = SubLObjectFactory.makeString("");
        $str49$Assertion__ = SubLObjectFactory.makeString("Assertion #");
        $str50$Meta_Assertions__ = SubLObjectFactory.makeString("Meta Assertions :");
        $int51$1000 = SubLObjectFactory.makeInteger(1000);
        $kw52$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str53$Truth___ = SubLObjectFactory.makeString("Truth : ");
        $str54$Strength___ = SubLObjectFactory.makeString("Strength : ");
        $str55$Direction___ = SubLObjectFactory.makeString("Direction : ");
        $kw56$ARGUMENTS = SubLObjectFactory.makeKeyword("ARGUMENTS");
        $str57$Arguments = SubLObjectFactory.makeString("Arguments");
        $str58$___ = SubLObjectFactory.makeString(" : ");
        $str59$No_Dependents = SubLObjectFactory.makeString("No Dependents");
        $kw60$DEPENDENTS = SubLObjectFactory.makeKeyword("DEPENDENTS");
        $str61$Dependents = SubLObjectFactory.makeString("Dependents");
        $str62$_ = SubLObjectFactory.makeString("(");
        $str63$_A_assertion_P = SubLObjectFactory.makeString("~A assertion~P");
        $str64$___A_unique_sentences_ = SubLObjectFactory.makeString(" (~A unique sentences)");
        $str65$__ = SubLObjectFactory.makeString(", ");
        $str66$_A_KB_HL_support_P = SubLObjectFactory.makeString("~A KB HL support~P");
        $str67$_ = SubLObjectFactory.makeString(")");
        $kw68$TRANSFORMATION_RULE_STATISTICS = SubLObjectFactory.makeKeyword("TRANSFORMATION-RULE-STATISTICS");
        $str69$Backward_Inference_Statistics__ = SubLObjectFactory.makeString("Backward Inference Statistics :");
        $kw70$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $kw71$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $kw72$CLEAR_TRANSFORMATION_RULE_STATISTICS = SubLObjectFactory.makeKeyword("CLEAR-TRANSFORMATION-RULE-STATISTICS");
        $str73$_Clear_ = SubLObjectFactory.makeString("[Clear]");
        $kw74$TOP = SubLObjectFactory.makeKeyword("TOP");
        $kw75$RULE_FORWARD_INFERENCE_METRICS = SubLObjectFactory.makeKeyword("RULE-FORWARD-INFERENCE-METRICS");
        $str76$Forward_Inference_Statistics__ = SubLObjectFactory.makeString("Forward Inference Statistics :");
        $str77$Rule_properties__ = SubLObjectFactory.makeString("Rule properties: ");
        $str78$Self_Looping_ = SubLObjectFactory.makeString("Self-Looping ");
        $str79$Self_Expanding_ = SubLObjectFactory.makeString("Self-Expanding ");
        $str80$Modification_of_this_Assertion_is = SubLObjectFactory.makeString("Modification of this Assertion is not permitted.");
        $str81$Assertion_not_well_formed = SubLObjectFactory.makeString("Assertion not well formed");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IO-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("NL"));
        $str83$Assertion_is_either_miscanonicali = SubLObjectFactory.makeString("Assertion is either miscanonicalized or incorrectly indexed.");
        $str84$This_is_probably_due_to_a_canonic = SubLObjectFactory.makeString("This is probably due to a canonicalizer directive on ");
        $str85$_ = SubLObjectFactory.makeString(".");
        $const86$trueSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("trueSentence"));
        $str87$This_is_probably_due_to_a___trueS = SubLObjectFactory.makeString("This is probably due to a #$trueSentence wrapper being used in the original EL to avoid skolemization.");
        $str88$Assertion_excepted_in_some_mts__ = SubLObjectFactory.makeString("Assertion excepted in some mts :");
        $str89$Assertion_doomed_due_to__ = SubLObjectFactory.makeString("Assertion doomed due to :");
        $list90 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-DESCRIPTIONS"));
        $kw91$RED = SubLObjectFactory.makeKeyword("RED");
        $str92$EL_and_ = SubLObjectFactory.makeString("EL and ");
        $str93$EL_Formula___ = SubLObjectFactory.makeString("EL Formula : ");
        $str94$f__ = SubLObjectFactory.makeString("f: ");
        $str95$__ = SubLObjectFactory.makeString(" .");
        $str96$HL_Formula___ = SubLObjectFactory.makeString("HL Formula : ");
        $str97$__ = SubLObjectFactory.makeString(". ");
        $kw98$NL = SubLObjectFactory.makeKeyword("NL");
        $str99$English_Translation___ = SubLObjectFactory.makeString("English Translation : ");
        $sym100$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-COLS"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS-COLS"), (SubLObject)SubLObjectFactory.makeSymbol("QISA-COLS"));
        $const102$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const103$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const104$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $sym105$BOOLEAN = SubLObjectFactory.makeSymbol("BOOLEAN");
        $sym106$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym107$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $str108$Rule_Variable_Constraints__ = SubLObjectFactory.makeString("Rule Variable Constraints :");
        $str109$Variable = SubLObjectFactory.makeString("Variable");
        $sym110$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $str111$_dddddd = SubLObjectFactory.makeString("#dddddd");
        $str112$_cccccc = SubLObjectFactory.makeString("#cccccc");
        $const113$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const114$queryTemplate_Reln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryTemplate-Reln"));
        $str115$____which_ought_to_parse_any_of__ = SubLObjectFactory.makeString("... which ought to parse any of: ");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYNTAX"), (SubLObject)SubLObjectFactory.makeSymbol("SEMANTICS"));
        $kw117$HTML = SubLObjectFactory.makeKeyword("HTML");
        $str118$Exceptions__ = SubLObjectFactory.makeString("Exceptions :");
        $kw119$NEW = SubLObjectFactory.makeKeyword("NEW");
        $sym120$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY = SubLObjectFactory.makeSymbol("CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY");
        $sym121$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY = SubLObjectFactory.makeSymbol("CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY");
        $sym122$CB_ASSERTION_LINK_WITH_MT = SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK-WITH-MT");
        $sym123$CB_ASSERTION_LINK = SubLObjectFactory.makeSymbol("CB-ASSERTION-LINK");
        $str124$Pragmatic_Requirements__ = SubLObjectFactory.makeString("Pragmatic Requirements :");
        $sym125$CB_ASSERTION_WITH_SHOW_ENGLISH = SubLObjectFactory.makeSymbol("CB-ASSERTION-WITH-SHOW-ENGLISH");
        $str126$_Show_English_ = SubLObjectFactory.makeString("[Show English]");
        $str127$cb_assertion_with_show_english__a = SubLObjectFactory.makeString("cb-assertion-with-show-english&~a");
        $kw128$SHOW_ENGLISH = SubLObjectFactory.makeKeyword("SHOW-ENGLISH");
        $sym129$CB_LINK_SHOW_ENGLISH = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-ENGLISH");
        $sym130$CB_ASSERTION_WITH_SHOW_EL_FORMULA = SubLObjectFactory.makeSymbol("CB-ASSERTION-WITH-SHOW-EL-FORMULA");
        $str131$_EL_Formula_ = SubLObjectFactory.makeString("[EL Formula]");
        $str132$cb_assertion_with_show_el_formula = SubLObjectFactory.makeString("cb-assertion-with-show-el-formula&~a");
        $kw133$SHOW_EL_FORMULA = SubLObjectFactory.makeKeyword("SHOW-EL-FORMULA");
        $sym134$CB_LINK_SHOW_EL_FORMULA = SubLObjectFactory.makeSymbol("CB-LINK-SHOW-EL-FORMULA");
        $kw135$CB_ARGUMENTS = SubLObjectFactory.makeKeyword("CB-ARGUMENTS");
        $str136$cb_arguments_html = SubLObjectFactory.makeString("cb-arguments.html");
        $str137$_A_does_not_specify_an_assertion = SubLObjectFactory.makeString("~A does not specify an assertion");
        $str138$Arguments_for_Assertion___S = SubLObjectFactory.makeString("Arguments for Assertion #~S");
        $str139$Assertion___ = SubLObjectFactory.makeString("Assertion : ");
        $sym140$CB_ARGUMENTS = SubLObjectFactory.makeSymbol("CB-ARGUMENTS");
        $str141$cb_arguments__A = SubLObjectFactory.makeString("cb-arguments&~A");
        $sym142$CB_LINK_ARGUMENTS = SubLObjectFactory.makeSymbol("CB-LINK-ARGUMENTS");
        $kw143$CB_DEPENDENTS = SubLObjectFactory.makeKeyword("CB-DEPENDENTS");
        $str144$cb_dependents_html = SubLObjectFactory.makeString("cb-dependents.html");
        $str145$Dependents_for_Assertion___S = SubLObjectFactory.makeString("Dependents for Assertion #~S");
        $str146$_A_Assertions_Deduced_using_Asser = SubLObjectFactory.makeString("~A Assertions Deduced using Assertion: ");
        $str147$Assertion_Deduced_using_Assertion = SubLObjectFactory.makeString("Assertion Deduced using Assertion: ");
        $str148$Supports___ = SubLObjectFactory.makeString("Supports : ");
        $str149$_Deduction_ = SubLObjectFactory.makeString("[Deduction ");
        $str150$_ = SubLObjectFactory.makeString("]");
        $kw151$DEDUCTION = SubLObjectFactory.makeKeyword("DEDUCTION");
        $sym152$CB_DEPENDENTS = SubLObjectFactory.makeSymbol("CB-DEPENDENTS");
        $str153$cb_dependents__A = SubLObjectFactory.makeString("cb-dependents&~A");
        $sym154$CB_LINK_DEPENDENTS = SubLObjectFactory.makeSymbol("CB-LINK-DEPENDENTS");
        $sym155$CB_ASSERTION_DEPENDENCIES = SubLObjectFactory.makeSymbol("CB-ASSERTION-DEPENDENCIES");
        $str156$_Dependencies_ = SubLObjectFactory.makeString("[Dependencies]");
        $str157$cb_assertion_dependencies__A = SubLObjectFactory.makeString("cb-assertion-dependencies&~A");
        $kw158$ASSERTION_DEPENDENCIES = SubLObjectFactory.makeKeyword("ASSERTION-DEPENDENCIES");
        $sym159$CB_LINK_ASSERTION_DEPENDENCIES = SubLObjectFactory.makeSymbol("CB-LINK-ASSERTION-DEPENDENCIES");
        $str160$Assertion_Dependencies = SubLObjectFactory.makeString("Assertion Dependencies");
        $str161$_S_dependent_assertion_A = SubLObjectFactory.makeString("~S dependent assertion~A");
        $str162$s__in_order = SubLObjectFactory.makeString("s, in order");
        $str163$_Refresh_ = SubLObjectFactory.makeString("[Refresh]");
        $str164$_A_does_not_specify_an_argument = SubLObjectFactory.makeString("~A does not specify an argument");
        $sym165$CB_DEDUCTION = SubLObjectFactory.makeSymbol("CB-DEDUCTION");
        $str166$cb_deduction__A = SubLObjectFactory.makeString("cb-deduction&~A");
        $str167$Dont_know_how_to_convert__A_into_ = SubLObjectFactory.makeString("Dont know how to convert ~A into a deduction.");
        $sym168$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $str169$Deduction___A = SubLObjectFactory.makeString("Deduction #~A");
        $sym170$CB_LINK_DEDUCTION = SubLObjectFactory.makeSymbol("CB-LINK-DEDUCTION");
        $str171$__ = SubLObjectFactory.makeString("#<");
        $str172$DEDUCTION___A = SubLObjectFactory.makeString("DEDUCTION #~A");
        $str173$_ = SubLObjectFactory.makeString(">");
        $str174$__DEDUCTION___ = SubLObjectFactory.makeString("#<DEDUCTION ?>");
        $kw175$DEDUCTION_STRUCT = SubLObjectFactory.makeKeyword("DEDUCTION-STRUCT");
        $sym176$CB_LINK_DEDUCTION_STRUCT = SubLObjectFactory.makeSymbol("CB-LINK-DEDUCTION-STRUCT");
        $sym177$CB_FORM_DEDUCTION_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-DEDUCTION-METHOD");
        $str178$Deduced_Argument_detail = SubLObjectFactory.makeString("Deduced Argument detail");
        $kw179$CB_SOURCE = SubLObjectFactory.makeKeyword("CB-SOURCE");
        $str180$cb_source_html = SubLObjectFactory.makeString("cb-source.html");
        $str181$Deduced_Argument___S = SubLObjectFactory.makeString("Deduced Argument #~S");
        $kw182$REMOVE_DEDUCTION = SubLObjectFactory.makeKeyword("REMOVE-DEDUCTION");
        $str183$_Remove_Deduction_ = SubLObjectFactory.makeString("[Remove Deduction]");
        $str184$Previous = SubLObjectFactory.makeString("Previous");
        $str185$Next = SubLObjectFactory.makeString("Next");
        $str186$Argument_was_Overruled = SubLObjectFactory.makeString("Argument was Overruled");
        $str187$Conclusion__ = SubLObjectFactory.makeString("Conclusion :");
        $str188$Mt___ = SubLObjectFactory.makeString("Mt : ");
        $str189$Supported_conclusion_is_invalid_ = SubLObjectFactory.makeString("Supported conclusion is invalid!");
        $str190$Justification___ = SubLObjectFactory.makeString("Justification : ");
        $list191 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT"));
        $sym192$_ = SubLObjectFactory.makeSymbol("<");
        $str193$Date_of_most_recent_supporting_as = SubLObjectFactory.makeString("Date of most recent supporting asserted assertion : ");
        $str194$Supporting_asserted_assertions___ = SubLObjectFactory.makeString("Supporting asserted assertions : ");
        $str195$Supports = SubLObjectFactory.makeString("Supports");
        $str196$_and_pragmatic_supports = SubLObjectFactory.makeString(" and pragmatic supports");
        $str197$_max_floor_mts___ = SubLObjectFactory.makeString(" max-floor-mts : ");
        $kw198$BULL = SubLObjectFactory.makeKeyword("BULL");
        $sym199$SUPPORT_MT = SubLObjectFactory.makeSymbol("SUPPORT-MT");
        $sym200$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $str201$Bound_rule_justification___ = SubLObjectFactory.makeString("Bound rule justification : ");
        $sym202$_CB_JUSTIFY_TABLE_ = SubLObjectFactory.makeSymbol("*CB-JUSTIFY-TABLE*");
        $kw203$CB_JUSTIFY = SubLObjectFactory.makeKeyword("CB-JUSTIFY");
        $str204$cb_justify_html = SubLObjectFactory.makeString("cb-justify.html");
        $int205$100 = SubLObjectFactory.makeInteger(100);
        $str206$Full_justification_for_Assertion_ = SubLObjectFactory.makeString("Full justification for Assertion #~S");
        $str207$Assertion_Supported__ = SubLObjectFactory.makeString("Assertion Supported :");
        $sym208$CB_JUSTIFY = SubLObjectFactory.makeSymbol("CB-JUSTIFY");
        $str209$_Justify_ = SubLObjectFactory.makeString("[Justify]");
        $str210$cb_justify__A = SubLObjectFactory.makeString("cb-justify&~A");
        $kw211$JUSTIFY = SubLObjectFactory.makeKeyword("JUSTIFY");
        $sym212$CB_LINK_JUSTIFY = SubLObjectFactory.makeSymbol("CB-LINK-JUSTIFY");
        $str213$Complete_Justification_for_Assert = SubLObjectFactory.makeString("Complete Justification for Assertion :");
        $str214$Arguments_Supporting_Assertion__ = SubLObjectFactory.makeString("Arguments Supporting Assertion :");
        $str215$Argument___ = SubLObjectFactory.makeString("Argument : ");
        $str216$Justified_Above = SubLObjectFactory.makeString("Justified Above");
        $str217$disc = SubLObjectFactory.makeString("disc");
        $str218$1 = SubLObjectFactory.makeString("1");
        $str219$Asserted_locally = SubLObjectFactory.makeString("Asserted locally");
        $str220$_by_ = SubLObjectFactory.makeString(" by ");
        $str221$_on_ = SubLObjectFactory.makeString(" on ");
        $str222$_at_ = SubLObjectFactory.makeString(" at ");
        $str223$_for_ = SubLObjectFactory.makeString(" for ");
        $kw224$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw225$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $list226 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("VALIDATION-LEVEL-STR"));
        $str227$_A_does_not_specify_an_HL_support = SubLObjectFactory.makeString("~A does not specify an HL support");
        $sym228$CB_HL_SUPPORT = SubLObjectFactory.makeSymbol("CB-HL-SUPPORT");
        $sym229$HL_SUPPORT_P = SubLObjectFactory.makeSymbol("HL-SUPPORT-P");
        $sym230$INTERMEDIATE_STEP_VALIDATION_LEVEL_P = SubLObjectFactory.makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL-P");
        $str231$cb_hl_support__A__A = SubLObjectFactory.makeString("cb-hl-support&~A&~A");
        $kw232$HL_SUPPORT = SubLObjectFactory.makeKeyword("HL-SUPPORT");
        $sym233$CB_LINK_HL_SUPPORT = SubLObjectFactory.makeSymbol("CB-LINK-HL-SUPPORT");
        $str234$KB_HL_Support__S_Detail = SubLObjectFactory.makeString("KB HL Support ~S Detail");
        $str235$HL_Support_Detail = SubLObjectFactory.makeString("HL Support Detail");
        $kw236$CB_HL_SUPPORT = SubLObjectFactory.makeKeyword("CB-HL-SUPPORT");
        $str237$cb_hl_support_html = SubLObjectFactory.makeString("cb-hl-support.html");
        $kw238$HL_SUPPORT_VALIDATE = SubLObjectFactory.makeKeyword("HL-SUPPORT-VALIDATE");
        $str239$_Validate_ = SubLObjectFactory.makeString("[Validate]");
        $kw240$HL_SUPPORT_SIMILAR_QUERY = SubLObjectFactory.makeKeyword("HL-SUPPORT-SIMILAR-QUERY");
        $str241$_Query_Similar_ = SubLObjectFactory.makeString("[Query Similar]");
        $str242$Unknown = SubLObjectFactory.makeString("Unknown");
        $str243$Module___ = SubLObjectFactory.makeString("Module : ");
        $str244$None_available = SubLObjectFactory.makeString("None available");
        $str245$Nothing_deeper_available = SubLObjectFactory.makeString("Nothing deeper available");
        $str246$Computed_forward_mt_combos___ = SubLObjectFactory.makeString("Computed forward mt combos : ");
        $const247$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $str248$__This_HL_support_has_a_very_slow = SubLObjectFactory.makeString(" (This HL support has a very slow forward-mt-combos call of ~A seconds.)");
        $str249$__This_HL_support_has_a_stale_mt_ = SubLObjectFactory.makeString(" (This HL support has a stale mt.)");
        $str250$KB_HL_Support_argument___ = SubLObjectFactory.makeString("KB HL Support argument : ");
        $str251$_A_KB_HL_Support_dependents___ = SubLObjectFactory.makeString("~A KB HL Support dependents : ");
        $str252$cb_hl_validate__A__A = SubLObjectFactory.makeString("cb-hl-validate&~A&~A");
        $sym253$CB_LINK_HL_SUPPORT_VALIDATE = SubLObjectFactory.makeSymbol("CB-LINK-HL-SUPPORT-VALIDATE");
        $str254$The_hl_support_is_not_available_ = SubLObjectFactory.makeString("The hl-support is not available.");
        $sym255$CB_HL_VALIDATE = SubLObjectFactory.makeSymbol("CB-HL-VALIDATE");
        $str256$cb_hl_support_similar_query__A = SubLObjectFactory.makeString("cb-hl-support-similar-query&~A");
        $sym257$CB_LINK_HL_SUPPORT_SIMILAR_QUERY = SubLObjectFactory.makeSymbol("CB-LINK-HL-SUPPORT-SIMILAR-QUERY");
        $sym258$CB_HL_SUPPORT_SIMILAR_QUERY = SubLObjectFactory.makeSymbol("CB-HL-SUPPORT-SIMILAR-QUERY");
        $str259$_A_does_not_specify_an_HL_clause_ = SubLObjectFactory.makeString("~A does not specify an HL clause-struc");
        $sym260$CB_CLAUSE_STRUC = SubLObjectFactory.makeSymbol("CB-CLAUSE-STRUC");
        $sym261$CLAUSE_STRUC_P = SubLObjectFactory.makeSymbol("CLAUSE-STRUC-P");
        $str262$cb_clause_struc__A = SubLObjectFactory.makeString("cb-clause-struc&~A");
        $str263$CLAUSE_STRUC___S = SubLObjectFactory.makeString("CLAUSE-STRUC #~S");
        $kw264$CLAUSE_STRUC = SubLObjectFactory.makeKeyword("CLAUSE-STRUC");
        $sym265$CB_LINK_CLAUSE_STRUC = SubLObjectFactory.makeSymbol("CB-LINK-CLAUSE-STRUC");
        $sym266$CB_FORM_CLAUSE_STRUC_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-CLAUSE-STRUC-METHOD");
        $kw267$CB_CLAUSE_STRUC = SubLObjectFactory.makeKeyword("CB-CLAUSE-STRUC");
        $str268$cb_clause_struc_html = SubLObjectFactory.makeString("cb-clause-struc.html");
        $str269$Clause_Struc___S = SubLObjectFactory.makeString("Clause Struc #~S");
        $str270$CNF_clause___ = SubLObjectFactory.makeString("CNF clause : ");
        $str271$Assertions_using_this_clause___ = SubLObjectFactory.makeString("Assertions using this clause : ");
        $str272$__ = SubLObjectFactory.makeString("((");
        $str273$__ = SubLObjectFactory.makeString("))");
        $str274$assertion_id = SubLObjectFactory.makeString("assertion-id");
        $str275$sentence = SubLObjectFactory.makeString("sentence");
        $str276$sentence_type = SubLObjectFactory.makeString("sentence-type");
        $str277$question = SubLObjectFactory.makeString("question");
        $str278$question_type = SubLObjectFactory.makeString("question-type");
        $kw279$S = SubLObjectFactory.makeKeyword("S");
        $kw280$Q = SubLObjectFactory.makeKeyword("Q");
        $sym281$CB_PROCESS_SUGGESTED_ENGLISH = SubLObjectFactory.makeSymbol("CB-PROCESS-SUGGESTED-ENGLISH");
    }
}

/*

	Total time: 1639 ms
	
*/