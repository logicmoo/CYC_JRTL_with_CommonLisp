package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class cb_assertion_browser
    extends
      SubLTranslatedFile
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
  public static SubLObject cb_find_assertion(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_find_assertion_internal( $str0$Find_Assertion, $str1$cb_handle_find_assertion, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 919L)
  public static SubLObject cb_find_assertion_internal(final SubLObject title_string, final SubLObject handler, SubLObject sentence, SubLObject mt)
  {
    if( sentence == UNPROVIDED )
    {
      sentence = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = $const6$EverythingPSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_string )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_string );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw11$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_string )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_string );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str18$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( handler, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw4$CB_FIND_ASSERTION, NIL, UNPROVIDED );
              html_utilities.html_reset_input( $str19$Reset );
              html_utilities.html_indent( ONE_INTEGER );
              html_utilities.html_submit_input( $str0$Find_Assertion, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( ONE_INTEGER );
              html_utilities.html_newline( UNPROVIDED );
              cb_form_widgets.cb_mt_input_section( mt, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cb_form_widgets.cb_el_sentence_input_section( sentence, $list20 );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_checkbox_input( $str21$use_genl_mts, $str22$t, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ_strong( $str23$Additionally_search_genlMts_for_t );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 1835L)
  public static SubLObject cb_link_find_assertion(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str0$Find_Assertion;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str25$cb_find_assertion );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 2142L)
  public static SubLObject cb_handle_find_assertion(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject error = cb_extract_find_assertion_args( args );
    final SubLObject mt = thread.secondMultipleValue();
    final SubLObject sentence = thread.thirdMultipleValue();
    final SubLObject use_genl_mtsP = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject assertions = czer_meta.find_assertions_cycl_in_mt( sentence, mt, use_genl_mtsP );
    final SubLObject all_presentP = thread.secondMultipleValue();
    final SubLObject czer_error = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != czer_error )
    {
      return cb_utilities.cb_error( $str30$Sentence_was_not_well_formed_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == assertions )
    {
      return cb_utilities.cb_error( $str31$No_assertions_were_found_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != list_utilities.singletonP( assertions ) && NIL != all_presentP )
    {
      return cb_assertion_internal( assertions.first() );
    }
    final SubLObject title_var = $str0$Find_Assertion;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_princ_strong( $str32$Some_assertions_were_found__ );
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_newline( TWO_INTEGER );
              cb_utilities.cb_show_assertion_readably( assertion, T, T );
              cdolist_list_var = cdolist_list_var.rest();
              assertion = cdolist_list_var.first();
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$7, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$6, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 3051L)
  public static SubLObject cb_extract_find_assertion_args(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject mt = cb_form_widgets.cb_extract_mt_input( args, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_error = thread.secondMultipleValue();
    final SubLObject mt_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != mt_error )
    {
      cb_form_widgets.cb_mt_error( mt_error, mt_error_string );
      return Values.values( mt_error, NIL, NIL );
    }
    thread.resetMultipleValues();
    final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input( args, $list34 );
    final SubLObject sentence_error = thread.secondMultipleValue();
    final SubLObject sentence_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sentence_error )
    {
      cb_form_widgets.cb_el_sentence_error( sentence_error, sentence_error_string, UNPROVIDED );
      return Values.values( sentence_error, NIL, NIL );
    }
    final SubLObject use_genl_mtsP = html_utilities.html_extract_input( $str21$use_genl_mts, args );
    return Values.values( NIL, mt, sentence, use_genl_mtsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 3684L)
  public static SubLObject cb_find_similar_assertion(final SubLObject args)
  {
    SubLObject assertion_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list35 );
    assertion_id = args.first();
    final SubLObject current = args.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list35 );
      return NIL;
    }
    final SubLObject assertion = cb_utilities.cb_guess_assertion( assertion_id );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      return cb_utilities.cb_error( $str36$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject sentence = ke.ke_assertion_edit_formula( assertion );
    return cb_find_assertion_internal( $str37$Find_Similar_Assertion, $str1$cb_handle_find_assertion, sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 4265L)
  public static SubLObject cb_link_find_similar_assertion(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == linktext )
    {
      linktext = $str40$_Find_Similar_;
    }
    final SubLObject id = assertion_handles.assertion_id( assertion );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw41$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str42$cb_find_similar_assertion__A, id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 4610L)
  public static SubLObject cb_assertion(final SubLObject args)
  {
    SubLObject assertion_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list35 );
    assertion_id = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( assertion_id );
      if( NIL == assertion_handles.assertion_p( assertion ) )
      {
        return cb_utilities.cb_error( $str36$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cb_assertion_internal( assertion );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list35 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 4971L)
  public static SubLObject cb_af(final SubLObject args)
  {
    return cb_assertion( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 5046L)
  public static SubLObject cb_assertion_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_tools.cb_add_to_assertion_history( assertion );
    final SubLObject id = assertion_handles.assertion_id( assertion );
    final SubLObject publicP = NIL;
    final SubLObject title_var;
    final SubLObject title = title_var = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( ( NIL != publicP ) ? $str47$Public_ : $str48$ ), new SubLObject[] { $str49$Assertion__, format_nil.format_nil_a_no_copy(
        id )
    } );
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$10 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            if( NIL != cb_tools.cb_bookmarks_supported_for_current_user() )
            {
              cb_browser.cb_add_bookmark_term_link( assertion );
            }
            html_utilities.html_princ( title );
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            dhtml_macros.dhtml_with_toggle_visibility_support();
            html_script_utilities.cb_hoverover_page_init();
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_assertion_editor.cb_assertion_toolbar( assertion );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_assertion_info( assertion );
              cb_assertion_diagnostics( assertion );
              if( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) )
              {
                final SubLObject _prev_bind_0_$15 = cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.currentBinding( thread );
                try
                {
                  cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.bind( assertion, thread );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str50$Meta_Assertions__ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
                  html_utilities.html_newline( TWO_INTEGER );
                  cb_browser.cb_c_total_internal( assertion );
                  if( kb_indexing.num_exception_rule_index( assertion, UNPROVIDED, UNPROVIDED ).numG( ZERO_INTEGER ) )
                  {
                    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                    cb_show_exception_rule_index( assertion );
                  }
                  if( kb_indexing.num_pragma_rule_index( assertion, UNPROVIDED, UNPROVIDED ).numG( ZERO_INTEGER ) )
                  {
                    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                    cb_show_pragma_rule_index( assertion );
                  }
                }
                finally
                {
                  cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.rebind( _prev_bind_0_$15, thread );
                }
              }
              cb_assertion_variable_info( assertion );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$11, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$10, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 6665L)
  public static SubLObject cb_assertion_info(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw52$UNKNOWN == assertions_high.assertion_truth( assertion ) )
    {
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str53$Truth___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      cb_utilities.cb_show_truth( $kw52$UNKNOWN );
    }
    else
    {
      final SubLObject strength = assertions_high.assertion_strength( assertion );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str54$Strength___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      cb_utilities.cb_show_strength( strength );
    }
    final SubLObject direction = assertions_high.assertion_direction( assertion );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str55$Direction___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    cb_utilities.cb_show_direction( direction );
    final SubLObject v_arguments = assertions_high.assertion_arguments( assertion );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    cb_utilities.cb_link( $kw56$ARGUMENTS, assertion, $str57$Arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str58$___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_princ( Sequences.length( v_arguments ) );
    html_utilities.html_indent( TWO_INTEGER );
    if( NIL == assertions_high.assertion_has_dependents_p( assertion ) )
    {
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str59$No_Dependents );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    else
    {
      final SubLObject dependent_deduction_count = assertions_high.assertion_dependent_count( assertion );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      cb_utilities.cb_link( $kw60$DEPENDENTS, assertion, $str61$Dependents, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_princ( $str58$___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_princ( dependent_deduction_count );
      if( dependent_deduction_count.numL( $cb_assertion_info_dependent_assertion_count_threshold$.getDynamicValue( thread ) ) )
      {
        html_utilities.html_indent( UNPROVIDED );
        thread.resetMultipleValues();
        final SubLObject dependent_assertion_count = assertion_utilities.assertion_dependent_supported_object_counts( assertion );
        final SubLObject dependent_kb_hl_support_count = thread.secondMultipleValue();
        final SubLObject dependent_clause_struct_count = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject some_assertionsP = Numbers.plusp( dependent_assertion_count );
        final SubLObject some_kb_hl_supportsP = Numbers.plusp( dependent_kb_hl_support_count );
        html_utilities.html_princ( $str62$_ );
        if( NIL != some_assertionsP )
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str63$_A_assertion_P, dependent_assertion_count, dependent_assertion_count );
          if( !dependent_clause_struct_count.isZero() && !dependent_assertion_count.eql( dependent_clause_struct_count ) )
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str64$___A_unique_sentences_, dependent_clause_struct_count );
          }
        }
        if( NIL != some_assertionsP && NIL != some_kb_hl_supportsP )
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str65$__ );
        }
        if( NIL != some_kb_hl_supportsP )
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str66$_A_KB_HL_support_P, dependent_kb_hl_support_count, dependent_kb_hl_support_count );
        }
        html_utilities.html_princ( $str67$_ );
      }
    }
    if( NIL != assertions_high.asserted_assertionP( assertion ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      cb_asserted_argument( assertion );
    }
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      html_utilities.html_newline( TWO_INTEGER );
      cb_show_rule_info( assertion );
    }
    else
    {
      html_utilities.html_newline( UNPROVIDED );
    }
    cb_assertion_show_formula_variants( assertion );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 9184L)
  public static SubLObject cb_show_rule_info(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw68$TRANSFORMATION_RULE_STATISTICS, $str69$Backward_Inference_Statistics__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_query.cb_show_transformation_rule_statistics_for_rule( rule, $kw71$VERBOSE );
          if( NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue( thread ) && inference_analysis.transformation_rule_considered_count( rule ).isPositive() )
          {
            html_utilities.html_indent( UNPROVIDED );
            cb_utilities.cb_link( $kw72$CLEAR_TRANSFORMATION_RULE_STATISTICS, rule, $str73$_Clear_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      if( NIL != assertions_high.forward_assertionP( rule ) && NIL != inference_metrics.$gathering_forward_inference_metricsP$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            cb_utilities.cb_link( $kw75$RULE_FORWARD_INFERENCE_METRICS, rule, $str76$Forward_Inference_Statistics__, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_query.cb_show_forward_inference_statistics_for_rule( rule );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    final SubLObject self_looping = assertion_utilities.self_looping_ruleP( rule );
    final SubLObject self_expanding = assertion_utilities.self_expanding_ruleP( rule );
    if( NIL != self_looping || NIL != self_expanding )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str77$Rule_properties__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != self_looping )
            {
              html_utilities.html_princ( $str78$Self_Looping_ );
            }
            if( NIL != self_expanding )
            {
              html_utilities.html_princ( $str79$Self_Expanding_ );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 10636L)
  public static SubLObject cb_assertion_diagnostics(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue( thread ) && NIL == cb_assertion_editor.assertion_modification_permittedP( assertion ) )
    {
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
      html_utilities.html_princ( $str80$Modification_of_this_Assertion_is );
      html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    cb_assertion_exception_info( assertion );
    cb_assertion_doomed_info( assertion );
    cb_rule_assertion_analysis_info( assertion );
    if( NIL != cb_parameters.$cb_a_perform_access_diagnostics$.getDynamicValue( thread ) )
    {
      cb_assertion_access_diagnostics( assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 11187L)
  public static SubLObject cb_canonicalizer_problemP(final SubLObject assertion)
  {
    return list_utilities.sublisp_boolean( cb_canonicalizer_problems( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 11338L)
  public static SubLObject cb_canonicalizer_problems(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject el_formula = cb_utilities.cb_assertion_el_formula( assertion, UNPROVIDED );
    final SubLObject el_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == wff.el_wffP( el_formula, el_mt, UNPROVIDED ) )
    {
      result = ConsesLow.cons( ConsesLow.list( $str81$Assertion_not_well_formed, wff.explanation_of_why_not_wff( el_formula, el_mt, $list82 ) ), result );
    }
    if( NIL == subl_promotions.memberP( assertion, fi.sentence_assertions( el_formula, el_mt ), UNPROVIDED, UNPROVIDED ) )
    {
      result = ConsesLow.cons( ConsesLow.list( $str83$Assertion_is_either_miscanonicali ), result );
      if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != czer_utilities.some_canonicalizer_directive_assertions_somewhereP( assertions_high.gaf_predicate( assertion ) ) )
      {
        result = ConsesLow.cons( ConsesLow.list( NIL, Sequences.cconcatenate( $str84$This_is_probably_due_to_a_canonic, new SubLObject[] { format_nil.format_nil_s_no_copy( assertions_high.gaf_predicate( assertion ) ),
          $str85$_
        } ) ), result );
      }
      if( NIL != cycl_utilities.expression_find( $const86$trueSentence, assertions_high.assertion_cnf( assertion ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( ConsesLow.list( NIL, $str87$This_is_probably_due_to_a___trueS ), result );
      }
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 12439L)
  public static SubLObject cb_assertion_exception_info(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject justification = assertion_utilities.excepted_assertion_in_any_mtP( assertion, T, UNPROVIDED );
    if( NIL != justification )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
      html_utilities.html_princ( $str88$Assertion_excepted_in_some_mts__ );
      html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      final SubLObject _prev_bind_0 = cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.currentBinding( thread );
      try
      {
        cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.bind( assertion, thread );
        SubLObject cdolist_list_var = justification;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_indent( TWO_INTEGER );
          cb_utilities.cb_show_assertion_readably( support, UNPROVIDED, UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          support = cdolist_list_var.first();
        }
      }
      finally
      {
        cb_utilities.$cb_assertion_for_the_assertion_sentence_replacement$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_newline( TWO_INTEGER );
    }
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 12956L)
  public static SubLObject cb_assertion_doomed_info(final SubLObject assertion)
  {
    final SubLObject justification = assertion_utilities.doomed_assertionP( assertion, T, UNPROVIDED );
    if( NIL != justification )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
      html_utilities.html_princ( $str89$Assertion_doomed_due_to__ );
      html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      SubLObject cdolist_list_var = justification;
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_indent( TWO_INTEGER );
        cb_utilities.cb_show_assertion_readably( support, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
      html_utilities.html_newline( TWO_INTEGER );
    }
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 13369L)
  public static SubLObject cb_rule_assertion_analysis_info(final SubLObject assertion)
  {
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 13731L)
  public static SubLObject cb_assertion_access_diagnostics(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var;
    final SubLObject problems = cdolist_list_var = cb_canonicalizer_problems( assertion );
    SubLObject problem = NIL;
    problem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = problem;
      SubLObject description = NIL;
      SubLObject more_descriptions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
      description = current.first();
      current = ( more_descriptions = current.rest() );
      if( description.isString() )
      {
        html_utilities.html_newline( UNPROVIDED );
        final SubLObject color_val = $kw91$RED;
        html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
        if( NIL != color_val )
        {
          html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_val ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
          html_utilities.html_princ( description );
          html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      }
      SubLObject cdolist_list_var_$28 = more_descriptions;
      SubLObject more_description = NIL;
      more_description = cdolist_list_var_$28.first();
      while ( NIL != cdolist_list_var_$28)
      {
        html_macros.verify_not_within_html_pre();
        html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
        final SubLObject _prev_bind_2 = html_macros.$within_html_pre$.currentBinding( thread );
        try
        {
          html_macros.$within_html_pre$.bind( T, thread );
          html_utilities.html_princ( more_description );
        }
        finally
        {
          html_macros.$within_html_pre$.rebind( _prev_bind_2, thread );
        }
        html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
        cdolist_list_var_$28 = cdolist_list_var_$28.rest();
        more_description = cdolist_list_var_$28.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      problem = cdolist_list_var.first();
    }
    return problems;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 14218L)
  public static SubLObject cb_assertion_show_formula_variants(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hl_formula = fi.assertion_hl_formula( assertion, UNPROVIDED );
    SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding( thread );
    try
    {
      html_cycl_string_printer.$html_large_string_limit$.bind( NIL, thread );
      html_utilities.html_newline( UNPROVIDED );
      if( NIL != cb_parameters.$cb_a_show_el_formula$.getDynamicValue( thread ) )
      {
        thread.resetMultipleValues();
        final SubLObject el_formula = cb_utilities.cb_assertion_el_formula( assertion, hl_formula );
        final SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( fi.assertion_expand( narts_high.nart_expand( el_formula ) ).equal( fi.assertion_expand( narts_high.nart_expand( hl_formula ) ) ) && NIL != cb_parameters.$cb_a_show_hl_formula$.getDynamicValue( thread ) )
        {
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str92$EL_and_ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        else
        {
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str93$EL_Formula___ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          cb_browser.cb_c_mt_header( el_mt, NIL, NIL, NIL );
          html_utilities.html_newline( UNPROVIDED );
          final SubLObject _prev_bind_0_$29 = cb_utilities.$rule_unlabelled_dont_care_variables$.currentBinding( thread );
          try
          {
            cb_utilities.$rule_unlabelled_dont_care_variables$.bind( ( NIL != assertions_high.rule_assertionP( assertion ) ) ? el_utilities.rule_formula_unlabelled_dont_care_variables( el_formula ) : NIL, thread );
            if( NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) )
            {
              html_utilities.html_princ( $str94$f__ );
            }
            cb_utilities.cb_form_assertion_formula( assertion, el_formula, ZERO_INTEGER, T, UNPROVIDED );
            if( NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) )
            {
              html_utilities.html_princ( $str95$__ );
            }
          }
          finally
          {
            cb_utilities.$rule_unlabelled_dont_care_variables$.rebind( _prev_bind_0_$29, thread );
          }
          html_utilities.html_newline( TWO_INTEGER );
        }
      }
      if( NIL != cb_parameters.$cb_a_show_hl_formula$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str96$HL_Formula___ );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
        cb_browser.cb_c_mt_header( assertions_high.assertion_mt( assertion ), NIL, NIL, NIL );
        html_utilities.html_newline( UNPROVIDED );
        if( NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_princ( $str94$f__ );
        }
        cb_utilities.cb_form( assertion, ZERO_INTEGER, T );
        if( NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_princ( $str97$__ );
        }
        html_utilities.html_newline( UNPROVIDED );
      }
    }
    finally
    {
      html_cycl_string_printer.$html_large_string_limit$.rebind( _prev_bind_0, thread );
    }
    if( NIL != cb_parameters.$cb_a_show_english$.getDynamicValue( thread ) || $kw98$NL == control_vars.$cb_major_presentation_language$.getDynamicValue( thread ) )
    {
      _prev_bind_0 = control_vars.$cb_major_presentation_language$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding( thread );
      try
      {
        control_vars.$cb_major_presentation_language$.bind( $kw98$NL, thread );
        pph_vars.$pph_use_bulleted_listsP$.bind( T, thread );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str99$English_Translation___ );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_show_assertion_readably( assertion, NIL, NIL );
        html_utilities.html_newline( UNPROVIDED );
      }
      finally
      {
        pph_vars.$pph_use_bulleted_listsP$.rebind( _prev_bind_2, thread );
        control_vars.$cb_major_presentation_language$.rebind( _prev_bind_0, thread );
      }
      if( NIL != rtp_madlibs.rtp_madlibs_formula_p( hl_formula, UNPROVIDED ) )
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_show_formula_madlibs( hl_formula );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 18808L)
  public static SubLObject rule_variable_arg_constraints_formula(final SubLObject rule_assertion)
  {
    final SubLObject hl_formula = assertions_high.assertion_formula( rule_assertion );
    final SubLObject mt = assertions_high.assertion_mt( rule_assertion );
    final SubLObject analysis_formula = el_utilities.make_conjunction( ConsesLow.list( cycl_utilities.formula_arg1( hl_formula, UNPROVIDED ), cycl_utilities.formula_arg2( hl_formula, UNPROVIDED ) ) );
    final SubLObject constraints_dict = at_var_types.formula_variables_arg_constraints_dict( analysis_formula, mt, Symbols.symbol_function( $sym100$VARIABLE_P ), UNPROVIDED );
    final SubLObject constraints_formula = constraint_formula_from_constraints_dict( constraints_dict, mt );
    return constraints_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 19363L)
  public static SubLObject constraint_formula_from_constraints_dict(final SubLObject dict, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject constraints = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject current;
      final SubLObject datum = current = constraints;
      SubLObject isa_cols = NIL;
      SubLObject genls_cols = NIL;
      SubLObject qisa_cols = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
      isa_cols = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
      genls_cols = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list101 );
      qisa_cols = current.first();
      current = current.rest();
      if( NIL == current )
      {
        isa_cols = genls.min_cols( isa_cols, mt, UNPROVIDED );
        qisa_cols = genls.min_cols( qisa_cols, mt, UNPROVIDED );
        genls_cols = genls.min_cols( genls_cols, mt, UNPROVIDED );
        SubLObject cdolist_list_var = isa_cols;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.cons( el_utilities.make_binary_formula( $const102$isa, var, v_isa ), result );
          cdolist_list_var = cdolist_list_var.rest();
          v_isa = cdolist_list_var.first();
        }
        cdolist_list_var = qisa_cols;
        SubLObject qisa = NIL;
        qisa = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.cons( el_utilities.make_binary_formula( $const103$quotedIsa, var, qisa ), result );
          cdolist_list_var = cdolist_list_var.rest();
          qisa = cdolist_list_var.first();
        }
        cdolist_list_var = genls_cols;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.cons( el_utilities.make_binary_formula( $const104$genls, var, genl ), result );
          cdolist_list_var = cdolist_list_var.rest();
          genl = cdolist_list_var.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list101 );
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    if( NIL == result )
    {
      return NIL;
    }
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    return simplifier.conjoin( Sequences.nreverse( result ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 20076L)
  public static SubLObject cb_assertion_variable_info(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      final SubLObject el_formula = uncanonicalizer.assertion_el_formula( assertion );
      final SubLObject formula = el_utilities.make_conjunction( ConsesLow.list( cycl_utilities.formula_arg1( el_formula, UNPROVIDED ), cycl_utilities.formula_arg2( el_formula, UNPROVIDED ) ) );
      final SubLObject mt = assertions_high.assertion_mt( assertion );
      final SubLObject variables_arg_constraints_dict = at_var_types.formula_variables_arg_constraints_dict( formula, mt, UNPROVIDED, UNPROVIDED );
      if( NIL == dictionary.dictionary_empty_p( variables_arg_constraints_dict ) )
      {
        final SubLObject all_values = dictionary.dictionary_values( variables_arg_constraints_dict );
        final SubLObject some_genlsP = Sequences.find_if( Symbols.symbol_function( $sym105$BOOLEAN ), all_values, Symbols.symbol_function( $sym106$SECOND ), UNPROVIDED, UNPROVIDED );
        final SubLObject some_qisaP = Sequences.find_if( Symbols.symbol_function( $sym105$BOOLEAN ), all_values, Symbols.symbol_function( $sym107$THIRD ), UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        html_utilities.html_princ( $str108$Rule_Variable_Constraints__ );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        html_utilities.html_newline( TWO_INTEGER );
        html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( TWO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( THREE_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          if( NIL != html_macros.$html_color_dark_grey$.getGlobalValue() )
          {
            html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_color_dark_grey$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str109$Variable );
              html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              cb_utilities.cb_form( $const102$isa, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            if( NIL != some_genlsP )
            {
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                cb_utilities.cb_form( $const104$genls, UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            if( NIL != some_qisaP )
            {
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                cb_utilities.cb_form( $const103$quotedIsa, UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject v_variables = list_utilities.remove_duplicates_preserving_order( Sequences.nreverse( cycl_utilities.expression_gather( formula, $sym110$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED,
              UNPROVIDED ) ), UNPROVIDED, UNPROVIDED );
          SubLObject bgcolor = NIL;
          SubLObject color_toggle = NIL;
          SubLObject list_var = NIL;
          SubLObject var = NIL;
          SubLObject ignore_me = NIL;
          list_var = v_variables;
          var = list_var.first();
          for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), var = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
          {
            if( NIL != color_toggle )
            {
              color_toggle = NIL;
            }
            else
            {
              color_toggle = T;
            }
            bgcolor = ( NIL != color_toggle ) ? $str111$_dddddd : $str112$_cccccc;
            final SubLObject isa_genl_qisa = dictionary.dictionary_lookup( variables_arg_constraints_dict, var, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            if( NIL != bgcolor )
            {
              html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( bgcolor );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( var );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject cdolist_list_var = assertion_variable_info_cols( isa_genl_qisa.first(), mt );
                SubLObject col = NIL;
                col = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
                  cb_utilities.cb_form( col, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_newline( UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  col = cdolist_list_var.first();
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              if( NIL != some_genlsP )
              {
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  SubLObject cdolist_list_var = assertion_variable_info_cols( conses_high.second( isa_genl_qisa ), mt );
                  SubLObject col = NIL;
                  col = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
                    cb_utilities.cb_form( col, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_newline( UNPROVIDED );
                    cdolist_list_var = cdolist_list_var.rest();
                    col = cdolist_list_var.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              if( NIL != some_qisaP )
              {
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  SubLObject cdolist_list_var = assertion_variable_info_cols( conses_high.third( isa_genl_qisa ), mt );
                  SubLObject col = NIL;
                  col = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
                    cb_utilities.cb_form( col, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_newline( UNPROVIDED );
                    cdolist_list_var = cdolist_list_var.rest();
                    col = cdolist_list_var.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 22508L)
  public static SubLObject assertion_variable_info_cols(final SubLObject cols, final SubLObject mt)
  {
    return Sequences.remove( $const113$Thing, genls.min_cols( cols, mt, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 24621L)
  public static SubLObject cb_show_formula_madlibs(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = el_utilities.literal_predicate( sentence, UNPROVIDED );
    final SubLObject query_modeP = genl_predicates.genl_predicateP( predicate, $const114$queryTemplate_Reln, UNPROVIDED, UNPROVIDED );
    final SubLObject madlibs = rtp_madlibs.rtp_generate_madlibs( sentence, SIX_INTEGER, pph_vars.$pph_domain_mt$.getDynamicValue( thread ) );
    if( NIL != set.non_empty_set_p( madlibs ) )
    {
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str115$____which_ought_to_parse_any_of__ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      final SubLObject set_contents_var = set.do_set_internal( madlibs );
      SubLObject basis_object;
      SubLObject state;
      SubLObject madlib;
      SubLObject current;
      SubLObject datum;
      SubLObject syntax;
      SubLObject semantics;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        madlib = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, madlib ) )
        {
          datum = ( current = madlib );
          syntax = NIL;
          semantics = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
          syntax = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
          semantics = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL != query_modeP )
            {
              cb_utilities.cb_show_question_in_nl( syntax, UNPROVIDED );
            }
            else
            {
              cb_utilities.cb_show_sentence_in_nl( syntax, UNPROVIDED );
            }
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_indent( SIX_INTEGER );
            cb_utilities.cb_form( semantics, TWO_INTEGER, NIL );
            html_utilities.html_newline( UNPROVIDED );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 25458L)
  public static SubLObject cb_show_exception_rule_index(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$40 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$41 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$42 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$43 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  final SubLObject _prev_bind_0_$44 = pph_vars.$pph_language_mt$.currentBinding( thread );
                  final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = cb_utilities.$assertion_filter_hook$.currentBinding( thread );
                  try
                  {
                    pph_vars.$pph_language_mt$.bind( cb_tools.cb_paraphrase_mt(), thread );
                    pph_vars.$paraphrase_mode$.bind( $kw117$HTML, thread );
                    cb_utilities.$assertion_filter_hook$.bind( cb_viewpoint.cb_calc_filter_hooks(), thread );
                    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                    html_utilities.html_princ( $str118$Exceptions__ );
                    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                    html_utilities.html_newline( UNPROVIDED );
                    cb_show_exception_rule_rec( rule );
                  }
                  finally
                  {
                    cb_utilities.$assertion_filter_hook$.rebind( _prev_bind_3, thread );
                    pph_vars.$paraphrase_mode$.rebind( _prev_bind_2, thread );
                    pph_vars.$pph_language_mt$.rebind( _prev_bind_0_$44, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$43, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$42, thread );
            }
            if( new_or_reused == $kw119$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$41, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$40, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 25779L)
  public static SubLObject cb_show_exception_rule_rec(final SubLObject rule)
  {
    SubLObject cdolist_list_var;
    final SubLObject mts = cdolist_list_var = kb_indexing.key_exception_rule_index( rule, UNPROVIDED );
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cb_show_exception_rule_rec_mt( rule, mt );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 25961L)
  public static SubLObject cb_show_exception_rule_rec_mt(final SubLObject rule, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_browser.cb_c_mt_header( mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject assertion_link_fn = ( NIL != cb_browser.cb_show_el_formulas_for_hookP( rule ) ) ? Symbols.symbol_function( $sym121$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY )
        : Symbols.symbol_function( $sym123$CB_ASSERTION_LINK );
    final SubLObject _prev_bind_0 = cb_parameters.$cb_show_el_assertion_readably_last_formula$.currentBinding( thread );
    final SubLObject _prev_bind_2 = cb_parameters.$cb_show_el_assertion_readably_last_mt$.currentBinding( thread );
    try
    {
      cb_parameters.$cb_show_el_assertion_readably_last_formula$.bind( NIL, thread );
      cb_parameters.$cb_show_el_assertion_readably_last_mt$.bind( NIL, thread );
      kb_mapping.map_exception_rule_index( assertion_link_fn, rule, NIL, mt );
    }
    finally
    {
      cb_parameters.$cb_show_el_assertion_readably_last_mt$.rebind( _prev_bind_2, thread );
      cb_parameters.$cb_show_el_assertion_readably_last_formula$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 26169L)
  public static SubLObject cb_show_pragma_rule_index(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$47 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$48 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$49 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$50 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  final SubLObject _prev_bind_0_$51 = pph_vars.$pph_language_mt$.currentBinding( thread );
                  final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                  final SubLObject _prev_bind_3 = cb_utilities.$assertion_filter_hook$.currentBinding( thread );
                  try
                  {
                    pph_vars.$pph_language_mt$.bind( cb_tools.cb_paraphrase_mt(), thread );
                    pph_vars.$paraphrase_mode$.bind( $kw117$HTML, thread );
                    cb_utilities.$assertion_filter_hook$.bind( cb_viewpoint.cb_calc_filter_hooks(), thread );
                    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                    html_utilities.html_princ( $str124$Pragmatic_Requirements__ );
                    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                    html_utilities.html_newline( UNPROVIDED );
                    cb_show_pragma_rule_rec( rule );
                  }
                  finally
                  {
                    cb_utilities.$assertion_filter_hook$.rebind( _prev_bind_3, thread );
                    pph_vars.$paraphrase_mode$.rebind( _prev_bind_2, thread );
                    pph_vars.$pph_language_mt$.rebind( _prev_bind_0_$51, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$50, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$49, thread );
            }
            if( new_or_reused == $kw119$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$48, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$53, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$47, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 26452L)
  public static SubLObject cb_show_pragma_rule_rec(final SubLObject rule)
  {
    SubLObject cdolist_list_var;
    final SubLObject mts = cdolist_list_var = kb_indexing.key_pragma_rule_index( rule, UNPROVIDED );
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cb_show_pragma_rule_rec_mt( rule, mt );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 26625L)
  public static SubLObject cb_show_pragma_rule_rec_mt(final SubLObject rule, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_browser.cb_c_mt_header( mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject assertion_link_fn = ( NIL != cb_browser.cb_show_el_formulas_for_hookP( rule ) ) ? Symbols.symbol_function( $sym121$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY )
        : Symbols.symbol_function( $sym123$CB_ASSERTION_LINK );
    final SubLObject _prev_bind_0 = cb_parameters.$cb_show_el_assertion_readably_last_formula$.currentBinding( thread );
    final SubLObject _prev_bind_2 = cb_parameters.$cb_show_el_assertion_readably_last_mt$.currentBinding( thread );
    try
    {
      cb_parameters.$cb_show_el_assertion_readably_last_formula$.bind( NIL, thread );
      cb_parameters.$cb_show_el_assertion_readably_last_mt$.bind( NIL, thread );
      kb_mapping.map_pragma_rule_index( assertion_link_fn, rule, NIL, mt );
    }
    finally
    {
      cb_parameters.$cb_show_el_assertion_readably_last_mt$.rebind( _prev_bind_2, thread );
      cb_parameters.$cb_show_el_assertion_readably_last_formula$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 26827L)
  public static SubLObject cb_assertion_with_show_english(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cb_parameters.$cb_a_show_english$.currentBinding( thread );
    try
    {
      cb_parameters.$cb_a_show_english$.bind( T, thread );
      cb_assertion( args );
    }
    finally
    {
      cb_parameters.$cb_a_show_english$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 27105L)
  public static SubLObject cb_link_show_english(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str126$_Show_English_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str127$cb_assertion_with_show_english__a, assertion_handles.assertion_id( assertion ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 27427L)
  public static SubLObject cb_assertion_with_show_el_formula(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = cb_parameters.$cb_a_show_el_formula$.currentBinding( thread );
    try
    {
      cb_parameters.$cb_a_show_el_formula$.bind( T, thread );
      cb_assertion( args );
    }
    finally
    {
      cb_parameters.$cb_a_show_el_formula$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 27565L)
  public static SubLObject cb_link_show_el_formula(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str131$_EL_Formula_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str132$cb_assertion_with_show_el_formula, assertion_handles.assertion_id( assertion ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 33547L)
  public static SubLObject cb_arguments(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      cb_utilities.cb_error( $str137$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject title_var;
    final SubLObject title = title_var = PrintLow.format( NIL, $str138$Arguments_for_Assertion___S, assertion_handles.assertion_id( assertion ) );
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$54 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$55 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw135$CB_ARGUMENTS, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str139$Assertion___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_justify_internal( assertion, NIL );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$55, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$54, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 34138L)
  public static SubLObject cb_link_arguments(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str141$cb_arguments__A, assertion_handles.assertion_id( assertion ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != linktext )
      {
        html_utilities.html_princ( linktext );
      }
      else
      {
        html_utilities.html_princ( Sequences.length( assertions_high.assertion_arguments( assertion ) ) );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 34495L)
  public static SubLObject cb_dependents(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      cb_utilities.cb_error( $str137$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject deductions = assertions_high.assertion_dependent_list( assertion );
    final SubLObject deduction_count = Sequences.length( deductions );
    final SubLObject v_dictionary = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), deduction_count );
    final SubLObject title = PrintLow.format( NIL, $str145$Dependents_for_Assertion___S, assertion_handles.assertion_id( assertion ) );
    SubLObject cdolist_list_var = deductions;
    SubLObject deduction = NIL;
    deduction = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      dictionary_utilities.dictionary_push( v_dictionary, deductions_high.deduction_assertion( deduction ), deduction );
      cdolist_list_var = cdolist_list_var.rest();
      deduction = cdolist_list_var.first();
    }
    final SubLObject title_var = title;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$59 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$60 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$62, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw143$CB_DEPENDENTS, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str139$Assertion___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_show_assertion_readably( assertion, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread ), T );
              final SubLObject assertion_count = dictionary.dictionary_length( v_dictionary );
              SubLObject index = ZERO_INTEGER;
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              if( assertion_count.numG( ONE_INTEGER ) )
              {
                PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str146$_A_Assertions_Deduced_using_Asser, assertion_count );
              }
              else
              {
                PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str147$Assertion_Deduced_using_Assertion, assertion_count );
              }
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              SubLObject iteration_state;
              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( v_dictionary ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
              {
                thread.resetMultipleValues();
                final SubLObject dependent_assertion = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                final SubLObject deductions_$64 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                index = Numbers.add( index, ONE_INTEGER );
                html_utilities.html_newline( TWO_INTEGER );
                if( NIL != assertion_handles.assertion_p( dependent_assertion ) )
                {
                  cb_utilities.cb_show_assertion_readably( dependent_assertion, UNPROVIDED, UNPROVIDED );
                }
                else
                {
                  cb_show_support( dependent_assertion, UNPROVIDED );
                }
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( THREE_INTEGER );
                html_utilities.html_princ( $str148$Supports___ );
                SubLObject cdolist_list_var2 = deductions_$64;
                SubLObject deduction2 = NIL;
                deduction2 = cdolist_list_var2.first();
                while ( NIL != cdolist_list_var2)
                {
                  html_utilities.html_indent( UNPROVIDED );
                  final SubLObject id = deduction_handles.deduction_id( deduction2 );
                  final SubLObject linktext = Sequences.cconcatenate( $str149$_Deduction_, new SubLObject[] { format_nil.format_nil_a_no_copy( id ), $str150$_
                  } );
                  cb_utilities.cb_link( $kw151$DEDUCTION, deduction2, linktext, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  cdolist_list_var2 = cdolist_list_var2.rest();
                  deduction2 = cdolist_list_var2.first();
                }
              }
              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$60, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$59, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 36209L)
  public static SubLObject cb_link_dependents(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str153$cb_dependents__A, assertion_handles.assertion_id( assertion ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != linktext )
      {
        html_utilities.html_princ( linktext );
      }
      else
      {
        html_utilities.html_princ( assertions_high.assertion_dependent_count( assertion ) );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 36462L)
  public static SubLObject cb_assertion_dependencies(final SubLObject args)
  {
    final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      cb_utilities.cb_error( $str137$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    return cb_assertion_dependencies_internal( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 36905L)
  public static SubLObject cb_link_assertion_dependencies(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == linktext )
    {
      linktext = $str156$_Dependencies_;
    }
    final SubLObject id = assertion_handles.assertion_id( assertion );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw41$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str157$cb_assertion_dependencies__A, id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 37248L)
  public static SubLObject cb_assertion_dependencies_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str160$Assertion_Dependencies;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$65 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$66 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$68, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            cb_assertion_dependencies_section( assertion );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$67, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$66, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$65, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 37430L)
  public static SubLObject cb_assertion_dependencies_section(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject dependent_assertions = assertions_interface.all_dependent_assertions( assertion );
    final SubLObject count = number_utilities.f_1_( Sequences.length( dependent_assertions ) );
    cb_utilities.cb_show_assertion_readably( assertion, T, T );
    html_utilities.html_newline( TWO_INTEGER );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str161$_S_dependent_assertion_A, count, ( NIL != number_utilities.onep( count ) ) ? $str48$ : $str162$s__in_order );
    html_utilities.html_indent( FOUR_INTEGER );
    cb_utilities.cb_link( $kw158$ASSERTION_DEPENDENCIES, assertion, $str163$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    SubLObject cdolist_list_var = dependent_assertions;
    SubLObject dependent = NIL;
    dependent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == kb_utilities.kbeq( dependent, assertion ) )
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_show_assertion_readably( dependent, T, T );
      }
      cdolist_list_var = cdolist_list_var.rest();
      dependent = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 38110L)
  public static SubLObject cb_deduction(final SubLObject args)
  {
    final SubLObject deduction = cb_utilities.cb_guess_deduction( args );
    if( NIL == deduction_handles.deduction_p( deduction ) )
    {
      cb_utilities.cb_error( $str164$_A_does_not_specify_an_argument, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    return cb_deduction_internal( deduction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 38538L)
  public static SubLObject cb_deduction_id_url(final SubLObject v_object)
  {
    if( NIL != subl_promotions.non_negative_integer_p( v_object ) )
    {
      return PrintLow.format( NIL, $cb_deduction_id_url_pattern$.getGlobalValue(), v_object );
    }
    if( NIL != deduction_handles.deduction_p( v_object ) )
    {
      return cb_deduction_id_url( deduction_handles.deduction_id( v_object ) );
    }
    Errors.error( $str167$Dont_know_how_to_convert__A_into_, v_object );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 38858L)
  public static SubLObject cb_link_deduction(final SubLObject deduction, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    final SubLObject id = deduction_handles.deduction_id( deduction );
    cb_adornments.handle_adornments( $kw151$DEDUCTION, $kw24$MAIN, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $cb_deduction_id_url_pattern$.getGlobalValue(), id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != linktext )
      {
        html_utilities.html_princ( linktext );
      }
      else
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str169$Deduction___A, id );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 39225L)
  public static SubLObject cb_link_deduction_struct(final SubLObject deduction, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    final SubLObject id = deduction_handles.deduction_id( deduction );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $cb_deduction_id_url_pattern$.getGlobalValue(), id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != linktext )
      {
        html_utilities.html_princ( linktext );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        if( id.isInteger() )
        {
          html_utilities.html_princ( $str171$__ );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str172$DEDUCTION___A, id );
          html_utilities.html_princ( $str173$_ );
        }
        else
        {
          html_utilities.html_princ( $str174$__DEDUCTION___ );
        }
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 39689L)
  public static SubLObject cb_form_deduction_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    cb_utilities.cb_link( $kw175$DEDUCTION_STRUCT, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 39843L)
  public static SubLObject cb_deduction_internal(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != deduction_handles.deduction_p( deduction ) : deduction;
    html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw10$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str178$Deduced_Argument_detail );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$69 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            cb_deduction_toolbar( deduction );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_deduction_info( deduction );
            cb_deduction_supports( deduction );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$71, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$69, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 40375L)
  public static SubLObject cb_deduction_toolbar(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != deduction_handles.deduction_p( deduction ) )
    {
      final SubLObject id = deduction_handles.deduction_id( deduction );
      final SubLObject title = PrintLow.format( NIL, $str181$Deduced_Argument___S, id );
      cb_utilities.cb_help_preamble( $kw179$CB_SOURCE, UNPROVIDED, UNPROVIDED );
      cb_goto_previous_deduction_control( deduction );
      html_utilities.html_indent( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( title );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      html_utilities.html_indent( UNPROVIDED );
      cb_goto_next_deduction_control( deduction );
      html_utilities.html_indent( TWO_INTEGER );
      cb_utilities.cb_link( $kw151$DEDUCTION, deduction, $str163$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue( thread ) )
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_link( $kw182$REMOVE_DEDUCTION, deduction, $str183$_Remove_Deduction_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 41053L)
  public static SubLObject cb_goto_previous_deduction_control(final SubLObject deduction)
  {
    final SubLObject prev_d = kb_utilities.previous_deduction( deduction );
    if( NIL != deduction_handles.deduction_p( prev_d ) )
    {
      cb_utilities.cb_left_arrow( cb_deduction_id_url( prev_d ), $str184$Previous, UNPROVIDED );
    }
    else
    {
      cb_utilities.cb_inactive_left_arrow();
    }
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 41317L)
  public static SubLObject cb_goto_next_deduction_control(final SubLObject deduction)
  {
    final SubLObject next_d = kb_utilities.next_deduction( deduction );
    if( NIL != deduction_handles.deduction_p( next_d ) )
    {
      cb_utilities.cb_right_arrow( cb_deduction_id_url( next_d ), $str185$Next, UNPROVIDED );
    }
    else
    {
      cb_utilities.cb_inactive_right_arrow();
    }
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 41571L)
  public static SubLObject cb_deduction_info(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject supported_object = deductions_high.deduction_supported_object( deduction );
    final SubLObject truth = arguments.argument_truth( deduction );
    if( $kw52$UNKNOWN != truth )
    {
      final SubLObject strength = arguments.argument_strength( deduction );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str54$Strength___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      cb_utilities.cb_show_strength( strength );
      html_utilities.html_indent( TWO_INTEGER );
    }
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str53$Truth___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    cb_utilities.cb_show_truth( truth );
    html_utilities.html_indent( TWO_INTEGER );
    if( NIL != arguments.valid_supportP( supported_object, UNPROVIDED ) )
    {
      if( !truth.equal( arguments.support_truth( supported_object ) ) )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        final SubLObject color_val = $kw91$RED;
        html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
        if( NIL != color_val )
        {
          html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_val ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str186$Argument_was_Overruled );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_indent( TWO_INTEGER );
      }
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str187$Conclusion__ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      final SubLObject mt = arguments.support_mt( supported_object );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str188$Mt___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
      if( NIL != assertion_handles.assertion_p( supported_object ) )
      {
        cb_assertion_show_formula_variants( supported_object );
      }
      else
      {
        cb_hl_support_show_formula_variants( supported_object );
      }
    }
    else
    {
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str189$Supported_conclusion_is_invalid_ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 42952L)
  public static SubLObject cb_deduction_supports(final SubLObject deduction)
  {
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str190$Justification___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    final SubLObject supports = deductions_high.deduction_supports( deduction );
    html_utilities.html_newline( UNPROVIDED );
    cb_show_justification_readably( supports, UNPROVIDED );
    final SubLObject assertion_dictionary = assertion_utilities.deduction_asserted_assertion_supports( deduction, UNPROVIDED );
    SubLObject assertion_mts = NIL;
    SubLObject latest_assertion_date = NIL;
    SubLObject sorted_assertions = NIL;
    SubLObject cdolist_list_var = dictionary_utilities.sort_dictionary_by_values( assertion_dictionary, $sym192$_ );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject a = NIL;
      SubLObject count = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list191 );
      a = current.first();
      current = ( count = current.rest() );
      final SubLObject date = assertions_high.asserted_when( a );
      if( NIL != date && ( NIL == latest_assertion_date || date.numG( latest_assertion_date ) ) )
      {
        latest_assertion_date = date;
      }
      final SubLObject item_var = assertions_high.assertion_mt( a );
      if( NIL == conses_high.member( item_var, assertion_mts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
      {
        assertion_mts = ConsesLow.cons( item_var, assertion_mts );
      }
      sorted_assertions = ConsesLow.cons( a, sorted_assertions );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str193$Date_of_most_recent_supporting_as );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_princ( latest_assertion_date );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str194$Supporting_asserted_assertions___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    cdolist_list_var = sorted_assertions;
    SubLObject a2 = NIL;
    a2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
      html_utilities.html_princ( dictionary.dictionary_lookup( assertion_dictionary, a2, UNPROVIDED ) );
      html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      html_utilities.html_indent( UNPROVIDED );
      cb_utilities.cb_show_assertion_readably( a2, UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      cdolist_list_var = cdolist_list_var.rest();
      a2 = cdolist_list_var.first();
    }
    final SubLObject pragmatic_support_mts = deductions_high.deduction_pragmatic_support_mts( deduction );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str195$Supports );
    if( NIL != pragmatic_support_mts )
    {
      html_utilities.html_princ( $str196$_and_pragmatic_supports );
    }
    html_utilities.html_princ( $str197$_max_floor_mts___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    SubLObject cdolist_list_var2 = genl_mts.max_floor_mts( ConsesLow.append( pragmatic_support_mts, Mapping.mapcar( $sym199$SUPPORT_MT, deductions_high.deduction_supports( deduction ) ) ), UNPROVIDED, UNPROVIDED );
    SubLObject mt = NIL;
    mt = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      html_utilities.html_glyph( $kw198$BULL, UNPROVIDED );
      cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var2 = cdolist_list_var2.rest();
      mt = cdolist_list_var2.first();
    }
    final SubLObject v_bindings = deductions_high.deduction_bindings( deduction );
    if( NIL != v_bindings )
    {
      final SubLObject rule = Sequences.find_if( $sym200$RULE_ASSERTION_, deductions_high.deduction_supports( deduction ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str201$Bound_rule_justification___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      final SubLObject rule_bindings = bindings.apply_bindings_backwards( inference_worker_transformation.rule_assertion_base_variable_map( rule ), v_bindings );
      final SubLObject rule_bound_el_formula = bindings.apply_bindings( rule_bindings, uncanonicalizer.assertion_el_formula( rule ) );
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_form( rule_bound_el_formula, ZERO_INTEGER, T );
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 45741L)
  public static SubLObject cb_justify(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      cb_utilities.cb_error( $str137$_A_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    if( NIL == $cb_justify_table$.getDynamicValue( thread ) )
    {
      $cb_justify_table$.setDynamicValue( Hashtables.make_hash_table( $int205$100, UNPROVIDED, UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $cb_justify_table$.getDynamicValue( thread ) );
    Hashtables.sethash( assertion, $cb_justify_table$.getDynamicValue( thread ), T );
    final SubLObject title_var;
    final SubLObject title = title_var = PrintLow.format( NIL, $str206$Full_justification_for_Assertion_, assertion_handles.assertion_id( assertion ) );
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$72 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$73 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$75, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw203$CB_JUSTIFY, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str207$Assertion_Supported__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_justify_internal( assertion, T );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$76, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$74, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$73, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$72, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 46849L)
  public static SubLObject cb_link_justify(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str209$_Justify_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str210$cb_justify__A, assertion_handles.assertion_id( assertion ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 47086L)
  public static SubLObject cb_justify_internal(final SubLObject assertion, SubLObject recurse)
  {
    if( recurse == UNPROVIDED )
    {
      recurse = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_utilities.cb_show_assertion_readably( assertion, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread ), T );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    if( NIL != recurse )
    {
      html_utilities.html_princ( $str213$Complete_Justification_for_Assert );
    }
    else
    {
      html_utilities.html_princ( $str214$Arguments_Supporting_Assertion__ );
    }
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    final SubLObject v_arguments = assertions_high.assertion_arguments( assertion );
    final SubLObject asserted_argument = assertions_high.get_asserted_argument( assertion );
    if( NIL != asserted_argument )
    {
      cb_asserted_argument( assertion );
      html_utilities.html_newline( UNPROVIDED );
    }
    SubLObject cdolist_list_var = v_arguments;
    SubLObject argument = NIL;
    argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !argument.eql( asserted_argument ) )
      {
        if( !argument.eql( v_arguments.first() ) )
        {
          html_utilities.html_newline( UNPROVIDED );
        }
        cb_justify_deduction( argument, recurse );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argument = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 47834L)
  public static SubLObject cb_justify_deduction(final SubLObject deduction, SubLObject recurse)
  {
    if( recurse == UNPROVIDED )
    {
      recurse = T;
    }
    html_utilities.html_princ( $str215$Argument___ );
    cb_utilities.cb_link( $kw151$DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject supports = cdolist_list_var = deductions_high.deduction_supports( deduction );
    SubLObject support = NIL;
    support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cb_justify_support( support, recurse );
      html_utilities.html_newline( UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      support = cdolist_list_var.first();
    }
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 48154L)
  public static SubLObject cb_justify_support(final SubLObject support, SubLObject recurse)
  {
    if( recurse == UNPROVIDED )
    {
      recurse = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_show_support( support, UNPROVIDED );
    if( NIL != recurse && NIL != assertion_handles.assertion_p( support ) )
    {
      if( NIL != Hashtables.gethash( support, $cb_justify_table$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        if( NIL == assertions_high.asserted_assertionP( support ) )
        {
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ( $str216$Justified_Above );
        }
      }
      else
      {
        Hashtables.sethash( support, $cb_justify_table$.getDynamicValue( thread ), T );
        final SubLObject v_arguments = assertions_high.assertion_arguments( support );
        final SubLObject asserted_argument = assertions_high.get_asserted_argument( support );
        if( NIL != list_utilities.singletonP( v_arguments ) )
        {
          if( NIL == asserted_argument )
          {
            html_utilities.html_markup( html_macros.$html_unordered_list_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_list_item_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str217$disc );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_justify_deduction( v_arguments.first(), UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$77, thread );
              }
              html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
            }
            html_utilities.html_markup( html_macros.$html_unordered_list_tail$.getGlobalValue() );
          }
        }
        else
        {
          html_utilities.html_markup( html_macros.$html_ordered_list_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != asserted_argument )
            {
              html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_list_item_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str218$1 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_asserted_argument( support );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$78, thread );
              }
              html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
            }
            SubLObject cdolist_list_var = v_arguments;
            SubLObject argument = NIL;
            argument = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( !argument.eql( asserted_argument ) )
              {
                html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_list_item_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str218$1 );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  cb_justify_deduction( argument, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$79, thread );
                }
                html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
              }
              cdolist_list_var = cdolist_list_var.rest();
              argument = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
          }
          html_utilities.html_markup( html_macros.$html_ordered_list_tail$.getGlobalValue() );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 49143L)
  public static SubLObject cb_asserted_argument(final SubLObject assertion)
  {
    final SubLObject cyclist = assertions_high.asserted_by( assertion );
    final SubLObject date = assertions_high.asserted_when( assertion );
    final SubLObject purpose = assertions_high.asserted_why( assertion );
    final SubLObject second = assertions_high.asserted_second( assertion );
    html_utilities.html_princ( $str219$Asserted_locally );
    if( NIL != cyclist )
    {
      html_utilities.html_princ( $str220$_by_ );
      cb_utilities.cb_show_cyclist( cyclist );
    }
    if( NIL != date )
    {
      html_utilities.html_princ( $str221$_on_ );
      cb_utilities.cb_show_date( date );
    }
    if( NIL != second )
    {
      html_utilities.html_princ( $str222$_at_ );
      cb_utilities.cb_show_second( second );
    }
    if( NIL != purpose )
    {
      html_utilities.html_princ( $str223$_for_ );
      cb_utilities.cb_form( purpose, UNPROVIDED, UNPROVIDED );
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 49724L)
  public static SubLObject cb_show_support(final SubLObject support, SubLObject validation_level)
  {
    if( validation_level == UNPROVIDED )
    {
      validation_level = $kw224$NONE;
    }
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      cb_utilities.cb_show_assertion_readably( support, T, UNPROVIDED );
    }
    else if( NIL != kb_hl_support_handles.kb_hl_support_p( support ) )
    {
      final SubLObject hl_support = kb_hl_supports_high.kb_hl_support_hl_support( support );
      cb_utilities.cb_show_hl_support_readably( hl_support, validation_level );
    }
    else
    {
      cb_utilities.cb_show_hl_support_readably( support, validation_level );
    }
    return support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 50114L)
  public static SubLObject cb_show_justification_readably(final SubLObject justification, SubLObject validation_level)
  {
    if( validation_level == UNPROVIDED )
    {
      validation_level = $kw224$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject cdolist_list_var = justification;
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw225$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw74$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_show_support( support, validation_level );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$81, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$80, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 50451L)
  public static SubLObject cb_hl_support(final SubLObject args)
  {
    SubLObject id = NIL;
    SubLObject validation_level_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list226 );
    id = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list226 );
    validation_level_str = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list226 );
      return NIL;
    }
    final SubLObject hl_support = cb_guess_hl_support( id );
    final SubLObject validation_level = Symbols.make_keyword( validation_level_str );
    if( NIL == arguments.hl_support_p( hl_support ) )
    {
      cb_utilities.cb_error( $str227$_A_does_not_specify_an_HL_support, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    return cb_hl_support_internal( hl_support, validation_level );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 50936L)
  public static SubLObject cb_link_hl_support(final SubLObject hl_support, SubLObject validation_level, SubLObject linktext)
  {
    if( validation_level == UNPROVIDED )
    {
      validation_level = $kw224$NONE;
    }
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != arguments.hl_support_p( hl_support ) : hl_support;
    assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p( validation_level ) : validation_level;
    final SubLObject id = cb_hl_support_identifier( hl_support );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str231$cb_hl_support__A__A, id, validation_level );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != linktext )
      {
        html_utilities.html_princ( linktext );
      }
      else
      {
        html_utilities.html_prin1( arguments.support_module( hl_support ) );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 51393L)
  public static SubLObject cb_hl_support_internal(final SubLObject hl_support, final SubLObject validation_level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw10$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      final SubLObject possible_kb_hl_support = kb_hl_supports_high.find_kb_hl_support( hl_support );
      if( NIL != kb_hl_support_handles.kb_hl_support_p( possible_kb_hl_support ) )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str234$KB_HL_Support__S_Detail, kb_hl_support_handles.kb_hl_support_id( possible_kb_hl_support ) );
      }
      else
      {
        html_utilities.html_princ( $str235$HL_Support_Detail );
      }
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$82 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            cb_hl_support_toolbar( hl_support, validation_level );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_hl_support_info( hl_support );
            cb_hl_support_justify( hl_support );
            cb_hl_support_more_info( hl_support );
            cb_hl_support_argument( hl_support );
            cb_hl_support_dependents( hl_support );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$84, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$83, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$82, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 52331L)
  public static SubLObject cb_hl_support_toolbar(final SubLObject hl_support, final SubLObject validation_level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != arguments.hl_support_p( hl_support ) )
    {
      cb_utilities.cb_help_preamble( $kw236$CB_HL_SUPPORT, UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      final SubLObject possible_kb_hl_support = kb_hl_supports_high.find_kb_hl_support( hl_support );
      if( NIL != kb_hl_support_handles.kb_hl_support_p( possible_kb_hl_support ) )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str234$KB_HL_Support__S_Detail, kb_hl_support_handles.kb_hl_support_id( possible_kb_hl_support ) );
      }
      else
      {
        html_utilities.html_princ( $str235$HL_Support_Detail );
      }
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      html_utilities.html_indent( TWO_INTEGER );
      cb_utilities.cb_link( $kw238$HL_SUPPORT_VALIDATE, hl_support, validation_level, $str239$_Validate_, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      cb_utilities.cb_link( $kw232$HL_SUPPORT, hl_support, validation_level, $str163$_Refresh_, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      cb_utilities.cb_link( $kw240$HL_SUPPORT_SIMILAR_QUERY, hl_support, $str241$_Query_Similar_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 53108L)
  public static SubLObject cb_hl_support_info(final SubLObject hl_support)
  {
    if( $kw52$UNKNOWN == arguments.support_truth( hl_support ) )
    {
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str53$Truth___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_princ( $str242$Unknown );
    }
    else
    {
      final SubLObject strength = arguments.support_strength( hl_support );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str54$Strength___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      cb_utilities.cb_show_strength( strength );
    }
    final SubLObject module = arguments.support_module( hl_support );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str243$Module___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    cb_utilities.cb_show_support_module( module );
    final SubLObject mt = arguments.support_mt( hl_support );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str188$Mt___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
    cb_hl_support_show_formula_variants( hl_support );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 53884L)
  public static SubLObject cb_hl_support_show_formula_variants(final SubLObject hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hl_formula = arguments.support_formula( hl_support );
    if( NIL != cb_parameters.$cb_a_show_hl_formula$.getDynamicValue( thread ) || NIL != cb_parameters.$cb_a_show_el_formula$.getDynamicValue( thread ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str96$HL_Formula___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_form( hl_formula, ZERO_INTEGER, T );
      html_utilities.html_newline( UNPROVIDED );
    }
    if( NIL != cb_parameters.$cb_a_show_english$.getDynamicValue( thread ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str99$English_Translation___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      final SubLObject _prev_bind_0 = control_vars.$cb_major_presentation_language$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding( thread );
      try
      {
        control_vars.$cb_major_presentation_language$.bind( $kw98$NL, thread );
        pph_vars.$pph_domain_mt$.bind( arguments.support_mt( hl_support ), thread );
        cb_utilities.cb_show_hl_support_formula_readably( hl_formula );
      }
      finally
      {
        pph_vars.$pph_domain_mt$.rebind( _prev_bind_2, thread );
        control_vars.$cb_major_presentation_language$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 54905L)
  public static SubLObject cb_hl_support_justify(final SubLObject hl_support)
  {
    final SubLObject justification = arguments.support_justification( hl_support );
    return cb_hl_support_justify_int( hl_support, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 55083L)
  public static SubLObject cb_hl_support_justify_int(final SubLObject hl_support, final SubLObject justification)
  {
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str190$Justification___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    if( NIL == justification )
    {
      html_utilities.html_princ( $str244$None_available );
    }
    else if( NIL != list_utilities.singletonP( justification ) && hl_support.equal( justification.first() ) )
    {
      html_utilities.html_princ( $str245$Nothing_deeper_available );
    }
    else
    {
      SubLObject cdolist_list_var = justification;
      SubLObject justify_support = NIL;
      justify_support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_show_support( justify_support, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        justify_support = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 55552L)
  public static SubLObject cb_hl_support_more_info(final SubLObject hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str246$Computed_forward_mt_combos___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    SubLObject mts = NIL;
    SubLObject forward_mt_combos_time = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    mts = Mapping.mapcar( $sym199$SUPPORT_MT, hl_supports.hl_forward_mt_combos( arguments.make_hl_support( arguments.hl_support_module( hl_support ), arguments.hl_support_sentence( hl_support ), $const247$InferencePSC,
        UNPROVIDED ) ) );
    forward_mt_combos_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    if( forward_mt_combos_time.numG( ONE_INTEGER ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_color( $kw91$RED ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str248$__This_HL_support_has_a_very_slow, forward_mt_combos_time );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    if( NIL == list_utilities.member_kbeqP( arguments.support_mt( hl_support ), mts ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_color( $kw91$RED ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str249$__This_HL_support_has_a_stale_mt_ );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    }
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 56438L)
  public static SubLObject cb_hl_support_argument(final SubLObject hl_support)
  {
    final SubLObject kb_hl_support = ( NIL != kb_hl_support_handles.kb_hl_support_p( hl_support ) ) ? hl_support
        : ( ( NIL != arguments.hl_support_p( hl_support ) ) ? kb_hl_supports_high.find_kb_hl_support( hl_support ) : NIL );
    if( NIL != kb_hl_support )
    {
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str250$KB_HL_Support_argument___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      final SubLObject deduction = kb_hl_supports_interface.kb_kb_hl_support_argument( kb_hl_support );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      cb_utilities.cb_link( $kw151$DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      SubLObject cdolist_list_var = Sequences.nreverse( deductions_high.deduction_supports( deduction ) );
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_show_support( support, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 57018L)
  public static SubLObject cb_hl_support_dependents(final SubLObject hl_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject kb_hl_support = ( NIL != kb_hl_support_handles.kb_hl_support_p( hl_support ) ) ? hl_support
        : ( ( NIL != arguments.hl_support_p( hl_support ) ) ? kb_hl_supports_high.find_kb_hl_support( hl_support ) : NIL );
    if( NIL != kb_hl_support )
    {
      final SubLObject deductions = kb_hl_supports_interface.kb_kb_hl_support_dependents( kb_hl_support );
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str251$_A_KB_HL_Support_dependents___, Sequences.length( deductions ) );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      SubLObject cdolist_list_var = deductions;
      SubLObject deduction = NIL;
      deduction = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        cb_utilities.cb_link( $kw151$DEDUCTION, deduction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_princ( $str58$___ );
        cb_utilities.cb_form( deductions_high.deduction_supported_object( deduction ), UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        deduction = cdolist_list_var.first();
      }
    }
    return kb_hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 57653L)
  public static SubLObject cb_hl_support_identifier(final SubLObject hl_support)
  {
    return cb_parameters.cb_glob_id( hl_support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 57741L)
  public static SubLObject cb_guess_hl_support(final SubLObject args)
  {
    if( args.isInteger() )
    {
      return cb_parameters.cb_glob_lookup( args );
    }
    if( NIL != arguments.hl_support_p( args ) )
    {
      return args;
    }
    if( NIL == args )
    {
      return NIL;
    }
    if( args.isString() )
    {
      final SubLObject id = reader.read_from_string_ignoring_errors( args, NIL, NIL, UNPROVIDED, UNPROVIDED );
      return cb_guess_hl_support( id );
    }
    if( args.isCons() )
    {
      return cb_guess_hl_support( args.first() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 58127L)
  public static SubLObject cb_link_hl_support_validate(final SubLObject hl_support, final SubLObject validation_level, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != arguments.hl_support_p( hl_support ) : hl_support;
    assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p( validation_level ) : validation_level;
    if( validation_level == $kw224$NONE )
    {
      return hl_support;
    }
    if( NIL == linktext )
    {
      linktext = $str239$_Validate_;
    }
    final SubLObject id = cb_hl_support_identifier( hl_support );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw41$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str252$cb_hl_validate__A__A, id, validation_level );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 58634L)
  public static SubLObject cb_hl_validate(final SubLObject args)
  {
    SubLObject id = NIL;
    SubLObject validation_level_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list226 );
    id = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list226 );
    validation_level_str = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list226 );
      return NIL;
    }
    final SubLObject hl_support = cb_guess_hl_support( id );
    final SubLObject validation_level = Symbols.make_keyword( validation_level_str );
    if( NIL == hl_support )
    {
      return cb_utilities.cb_error( $str254$The_hl_support_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject sentence = arguments.support_el_sentence( hl_support );
    final SubLObject mt = arguments.support_elmt( hl_support );
    final SubLObject violations = hl_supports.hl_validate_wff_violations( hl_support, validation_level );
    return cb_assertion_editor.cb_explain_why_not_wff( sentence, mt, violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 59164L)
  public static SubLObject cb_link_hl_support_similar_query(final SubLObject hl_support, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != arguments.hl_support_p( hl_support ) : hl_support;
    if( NIL == linktext )
    {
      linktext = $str241$_Query_Similar_;
    }
    final SubLObject id = cb_hl_support_identifier( hl_support );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw41$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str256$cb_hl_support_similar_query__A, id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return hl_support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 59529L)
  public static SubLObject cb_hl_support_similar_query(final SubLObject args)
  {
    final SubLObject hl_support = cb_guess_hl_support( args );
    if( NIL == hl_support )
    {
      return cb_utilities.cb_error( $str254$The_hl_support_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject sentence = arguments.support_el_sentence( hl_support );
    final SubLObject mt = arguments.support_elmt( hl_support );
    return cb_query.cb_similar_query( sentence, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 59869L)
  public static SubLObject cb_clause_struc(final SubLObject args)
  {
    final SubLObject clause_struc = cb_guess_clause_struc( args );
    if( NIL == clause_strucs.clause_struc_p( clause_struc ) )
    {
      cb_utilities.cb_error( $str259$_A_does_not_specify_an_HL_clause_, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    return cb_clause_struc_internal( clause_struc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 60213L)
  public static SubLObject cb_link_clause_struc(final SubLObject clause_struc, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != clause_strucs.clause_struc_p( clause_struc ) : clause_struc;
    final SubLObject id = clause_strucs.clause_struc_id( clause_struc );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw24$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str262$cb_clause_struc__A, id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != linktext )
      {
        html_utilities.html_princ( linktext );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_princ( $str171$__ );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str263$CLAUSE_STRUC___S, id );
        html_utilities.html_princ( $str173$_ );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return clause_struc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 60614L)
  public static SubLObject cb_form_clause_struc_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    cb_utilities.cb_link( $kw264$CLAUSE_STRUC, v_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 60835L)
  public static SubLObject cb_clause_struc_internal(final SubLObject clause_struc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cnf = clause_strucs.clause_struc_cnf( clause_struc );
    final SubLObject title_var;
    final SubLObject title = title_var = PrintLow.format( NIL, $str269$Clause_Struc___S, clause_strucs.clause_struc_id( clause_struc ) );
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str7$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str8$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$85 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw9$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw10$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$86 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str13$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str17$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$88, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw267$CB_CLAUSE_STRUC, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              html_utilities.html_princ( $str270$CNF_clause___ );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
              cb_cnf( clauses.neg_lits( cnf ), clauses.pos_lits( cnf ) );
              html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
              final SubLObject assertions = clause_strucs.clause_struc_assertions( clause_struc );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              html_utilities.html_princ( $str271$Assertions_using_this_clause___ );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              SubLObject cdolist_list_var = assertions;
              SubLObject assertion = NIL;
              assertion = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_newline( UNPROVIDED );
                cb_utilities.cb_show_assertion_readably( assertion, UNPROVIDED, UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$89, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$87, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$86, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$85, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 61568L)
  public static SubLObject cb_cnf(final SubLObject neg_lits, final SubLObject pos_lits)
  {
    html_utilities.html_princ( $str272$__ );
    SubLObject first = T;
    SubLObject cdolist_list_var = neg_lits;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == first )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_glyph( $kw70$NBSP, TWO_INTEGER );
      }
      cb_utilities.cb_form( lit, ONE_INTEGER, UNPROVIDED );
      first = NIL;
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    html_utilities.html_princ( $str67$_ );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_glyph( $kw70$NBSP, UNPROVIDED );
    html_utilities.html_princ( $str62$_ );
    first = T;
    cdolist_list_var = pos_lits;
    lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == first )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_glyph( $kw70$NBSP, TWO_INTEGER );
      }
      cb_utilities.cb_form( lit, ONE_INTEGER, UNPROVIDED );
      first = NIL;
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    html_utilities.html_princ( $str273$__ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 62055L)
  public static SubLObject cb_guess_clause_struc(final SubLObject args)
  {
    if( args.isInteger() )
    {
      return clause_strucs.find_clause_struc_by_id( args );
    }
    if( NIL != clause_strucs.clause_struc_p( args ) )
    {
      return args;
    }
    if( NIL == args )
    {
      return NIL;
    }
    if( args.isString() )
    {
      final SubLObject id = reader.read_from_string_ignoring_errors( args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( id.isInteger() )
      {
        return clause_strucs.find_clause_struc_by_id( id );
      }
      return NIL;
    }
    else
    {
      if( args.isCons() )
      {
        return cb_guess_clause_struc( args.first() );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-browser.lisp", position = 62505L)
  public static SubLObject cb_process_suggested_english(final SubLObject args)
  {
    final SubLObject assertion_id = reader.read_from_string( html_utilities.html_extract_input( $str274$assertion_id, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject assertion = assertion_handles.find_assertion_by_id( assertion_id );
    final SubLObject assertion_cycl = uncanonicalizer.assertion_el_formula( assertion );
    final SubLObject sentence = html_utilities.html_extract_input( $str275$sentence, args );
    final SubLObject sentence_type = string_utilities.keyword_from_string( html_utilities.html_extract_input( $str276$sentence_type, args ) );
    final SubLObject v_question = html_utilities.html_extract_input( $str277$question, args );
    final SubLObject question_type = string_utilities.keyword_from_string( html_utilities.html_extract_input( $str278$question_type, args ) );
    if( NIL == string_utilities.empty_string_p( sentence ) )
    {
      parsing_utilities.record_suggested_nl_for_assertion( assertion_cycl, sentence, $kw279$S, sentence_type, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == string_utilities.empty_string_p( v_question ) )
    {
      parsing_utilities.record_suggested_nl_for_assertion( assertion_cycl, v_question, $kw280$Q, question_type, UNPROVIDED, UNPROVIDED );
    }
    cb_assertion_internal( assertion );
    return NIL;
  }

  public static SubLObject declare_cb_assertion_browser_file()
  {
    SubLFiles.declareFunction( me, "cb_find_assertion", "CB-FIND-ASSERTION", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_find_assertion_internal", "CB-FIND-ASSERTION-INTERNAL", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_link_find_assertion", "CB-LINK-FIND-ASSERTION", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_find_assertion", "CB-HANDLE-FIND-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_find_assertion_args", "CB-EXTRACT-FIND-ASSERTION-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_find_similar_assertion", "CB-FIND-SIMILAR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_find_similar_assertion", "CB-LINK-FIND-SIMILAR-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion", "CB-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_af", "CB-AF", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_internal", "CB-ASSERTION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_info", "CB-ASSERTION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_rule_info", "CB-SHOW-RULE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_diagnostics", "CB-ASSERTION-DIAGNOSTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_canonicalizer_problemP", "CB-CANONICALIZER-PROBLEM?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_canonicalizer_problems", "CB-CANONICALIZER-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_exception_info", "CB-ASSERTION-EXCEPTION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_doomed_info", "CB-ASSERTION-DOOMED-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rule_assertion_analysis_info", "CB-RULE-ASSERTION-ANALYSIS-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_access_diagnostics", "CB-ASSERTION-ACCESS-DIAGNOSTICS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_show_formula_variants", "CB-ASSERTION-SHOW-FORMULA-VARIANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "rule_variable_arg_constraints_formula", "RULE-VARIABLE-ARG-CONSTRAINTS-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_formula_from_constraints_dict", "CONSTRAINT-FORMULA-FROM-CONSTRAINTS-DICT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_variable_info", "CB-ASSERTION-VARIABLE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_variable_info_cols", "ASSERTION-VARIABLE-INFO-COLS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_formula_madlibs", "CB-SHOW-FORMULA-MADLIBS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_exception_rule_index", "CB-SHOW-EXCEPTION-RULE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_exception_rule_rec", "CB-SHOW-EXCEPTION-RULE-REC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_exception_rule_rec_mt", "CB-SHOW-EXCEPTION-RULE-REC-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_pragma_rule_index", "CB-SHOW-PRAGMA-RULE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_pragma_rule_rec", "CB-SHOW-PRAGMA-RULE-REC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_pragma_rule_rec_mt", "CB-SHOW-PRAGMA-RULE-REC-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_with_show_english", "CB-ASSERTION-WITH-SHOW-ENGLISH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_show_english", "CB-LINK-SHOW-ENGLISH", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_with_show_el_formula", "CB-ASSERTION-WITH-SHOW-EL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_show_el_formula", "CB-LINK-SHOW-EL-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_arguments", "CB-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_arguments", "CB-LINK-ARGUMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_dependents", "CB-DEPENDENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_dependents", "CB-LINK-DEPENDENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_dependencies", "CB-ASSERTION-DEPENDENCIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_assertion_dependencies", "CB-LINK-ASSERTION-DEPENDENCIES", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_dependencies_internal", "CB-ASSERTION-DEPENDENCIES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_dependencies_section", "CB-ASSERTION-DEPENDENCIES-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_deduction", "CB-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_deduction_id_url", "CB-DEDUCTION-ID-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_deduction", "CB-LINK-DEDUCTION", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_deduction_struct", "CB-LINK-DEDUCTION-STRUCT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_form_deduction_method", "CB-FORM-DEDUCTION-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_deduction_internal", "CB-DEDUCTION-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_deduction_toolbar", "CB-DEDUCTION-TOOLBAR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_goto_previous_deduction_control", "CB-GOTO-PREVIOUS-DEDUCTION-CONTROL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_goto_next_deduction_control", "CB-GOTO-NEXT-DEDUCTION-CONTROL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_deduction_info", "CB-DEDUCTION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_deduction_supports", "CB-DEDUCTION-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_justify", "CB-JUSTIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_justify", "CB-LINK-JUSTIFY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_justify_internal", "CB-JUSTIFY-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_justify_deduction", "CB-JUSTIFY-DEDUCTION", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_justify_support", "CB-JUSTIFY-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_asserted_argument", "CB-ASSERTED-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_support", "CB-SHOW-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_justification_readably", "CB-SHOW-JUSTIFICATION-READABLY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_hl_support", "CB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_hl_support", "CB-LINK-HL-SUPPORT", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_hl_support_internal", "CB-HL-SUPPORT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_toolbar", "CB-HL-SUPPORT-TOOLBAR", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_info", "CB-HL-SUPPORT-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_show_formula_variants", "CB-HL-SUPPORT-SHOW-FORMULA-VARIANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_justify", "CB-HL-SUPPORT-JUSTIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_justify_int", "CB-HL-SUPPORT-JUSTIFY-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_more_info", "CB-HL-SUPPORT-MORE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_argument", "CB-HL-SUPPORT-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_dependents", "CB-HL-SUPPORT-DEPENDENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hl_support_identifier", "CB-HL-SUPPORT-IDENTIFIER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_hl_support", "CB-GUESS-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_hl_support_validate", "CB-LINK-HL-SUPPORT-VALIDATE", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_hl_validate", "CB-HL-VALIDATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_hl_support_similar_query", "CB-LINK-HL-SUPPORT-SIMILAR-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_hl_support_similar_query", "CB-HL-SUPPORT-SIMILAR-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_clause_struc", "CB-CLAUSE-STRUC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_clause_struc", "CB-LINK-CLAUSE-STRUC", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_form_clause_struc_method", "CB-FORM-CLAUSE-STRUC-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_clause_struc_internal", "CB-CLAUSE-STRUC-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_cnf", "CB-CNF", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_clause_struc", "CB-GUESS-CLAUSE-STRUC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_process_suggested_english", "CB-PROCESS-SUGGESTED-ENGLISH", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_assertion_browser_file()
  {
    $cb_assertion_info_dependent_assertion_count_threshold$ = SubLFiles.defparameter( "*CB-ASSERTION-INFO-DEPENDENT-ASSERTION-COUNT-THRESHOLD*", $int51$1000 );
    $cb_deduction_id_url_pattern$ = SubLFiles.deflexical( "*CB-DEDUCTION-ID-URL-PATTERN*", $str166$cb_deduction__A );
    $cb_justify_table$ = SubLFiles.defparameter( "*CB-JUSTIFY-TABLE*", NIL );
    return NIL;
  }

  public static SubLObject setup_cb_assertion_browser_file()
  {
    html_macros.note_cgi_handler_function( $sym2$CB_FIND_ASSERTION, $kw3$HTML_HANDLER );
    Hashtables.sethash( $kw4$CB_FIND_ASSERTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str5$cb_find_assertion_html, NIL ) );
    cb_utilities.setup_cb_link_method( $kw26$FIND_ASSERTION, $sym27$CB_LINK_FIND_ASSERTION, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw26$FIND_ASSERTION, $str0$Find_Assertion, $str28$FindAsrt, $str29$Find_a_CycL_Assertion );
    html_macros.note_cgi_handler_function( $sym33$CB_HANDLE_FIND_ASSERTION, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym38$CB_FIND_SIMILAR_ASSERTION, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw43$FIND_SIMILAR_ASSERTION, $sym44$CB_LINK_FIND_SIMILAR_ASSERTION, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym45$CB_ASSERTION, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym46$CB_AF, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym125$CB_ASSERTION_WITH_SHOW_ENGLISH, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw128$SHOW_ENGLISH, $sym129$CB_LINK_SHOW_ENGLISH, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym130$CB_ASSERTION_WITH_SHOW_EL_FORMULA, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw133$SHOW_EL_FORMULA, $sym134$CB_LINK_SHOW_EL_FORMULA, TWO_INTEGER );
    Hashtables.sethash( $kw135$CB_ARGUMENTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str136$cb_arguments_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym140$CB_ARGUMENTS, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw56$ARGUMENTS, $sym142$CB_LINK_ARGUMENTS, TWO_INTEGER );
    Hashtables.sethash( $kw143$CB_DEPENDENTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str144$cb_dependents_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym152$CB_DEPENDENTS, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw60$DEPENDENTS, $sym154$CB_LINK_DEPENDENTS, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym155$CB_ASSERTION_DEPENDENCIES, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw158$ASSERTION_DEPENDENCIES, $sym159$CB_LINK_ASSERTION_DEPENDENCIES, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym165$CB_DEDUCTION, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw151$DEDUCTION, $sym170$CB_LINK_DEDUCTION, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw175$DEDUCTION_STRUCT, $sym176$CB_LINK_DEDUCTION_STRUCT, TWO_INTEGER );
    Structures.register_method( cb_utilities.$cb_form_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function( $sym177$CB_FORM_DEDUCTION_METHOD ) );
    Hashtables.sethash( $kw179$CB_SOURCE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str180$cb_source_html, NIL ) );
    utilities_macros.register_html_state_variable( $sym202$_CB_JUSTIFY_TABLE_ );
    Hashtables.sethash( $kw203$CB_JUSTIFY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str204$cb_justify_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym208$CB_JUSTIFY, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw211$JUSTIFY, $sym212$CB_LINK_JUSTIFY, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym228$CB_HL_SUPPORT, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw232$HL_SUPPORT, $sym233$CB_LINK_HL_SUPPORT, THREE_INTEGER );
    Hashtables.sethash( $kw236$CB_HL_SUPPORT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str237$cb_hl_support_html, NIL ) );
    cb_utilities.setup_cb_link_method( $kw238$HL_SUPPORT_VALIDATE, $sym253$CB_LINK_HL_SUPPORT_VALIDATE, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym255$CB_HL_VALIDATE, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw240$HL_SUPPORT_SIMILAR_QUERY, $sym257$CB_LINK_HL_SUPPORT_SIMILAR_QUERY, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym258$CB_HL_SUPPORT_SIMILAR_QUERY, $kw3$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym260$CB_CLAUSE_STRUC, $kw3$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw264$CLAUSE_STRUC, $sym265$CB_LINK_CLAUSE_STRUC, TWO_INTEGER );
    Structures.register_method( cb_utilities.$cb_form_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function( $sym266$CB_FORM_CLAUSE_STRUC_METHOD ) );
    Hashtables.sethash( $kw267$CB_CLAUSE_STRUC, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str268$cb_clause_struc_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym281$CB_PROCESS_SUGGESTED_ENGLISH, $kw3$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_assertion_browser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_assertion_browser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_assertion_browser_file();
  }
  static
  {
    me = new cb_assertion_browser();
    $cb_assertion_info_dependent_assertion_count_threshold$ = null;
    $cb_deduction_id_url_pattern$ = null;
    $cb_justify_table$ = null;
    $str0$Find_Assertion = makeString( "Find Assertion" );
    $str1$cb_handle_find_assertion = makeString( "cb-handle-find-assertion" );
    $sym2$CB_FIND_ASSERTION = makeSymbol( "CB-FIND-ASSERTION" );
    $kw3$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $kw4$CB_FIND_ASSERTION = makeKeyword( "CB-FIND-ASSERTION" );
    $str5$cb_find_assertion_html = makeString( "cb-find-assertion.html" );
    $const6$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str7$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str8$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw9$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw10$CB_CYC = makeKeyword( "CB-CYC" );
    $kw11$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw12$SHA1 = makeKeyword( "SHA1" );
    $str13$yui_skin_sam = makeString( "yui-skin-sam" );
    $str14$reloadFrameButton = makeString( "reloadFrameButton" );
    $str15$button = makeString( "button" );
    $str16$reload = makeString( "reload" );
    $str17$Refresh_Frames = makeString( "Refresh Frames" );
    $str18$post = makeString( "post" );
    $str19$Reset = makeString( "Reset" );
    $list20 = ConsesLow.list( new SubLObject[] { makeKeyword( "INPUT-NAME" ), makeString( "sentence" ), makeKeyword( "COMPLETE-LABEL" ), makeString( "Complete" ), makeKeyword( "CYCLIFY-LABEL" ), makeString( "Cyclify" ),
      makeKeyword( "CLEAR-LABEL" ), makeString( "Clear Sentence" ), makeKeyword( "HEIGHT" ), TWENTY_INTEGER, makeKeyword( "WIDTH" ), makeInteger( 80 )
    } );
    $str21$use_genl_mts = makeString( "use-genl-mts" );
    $str22$t = makeString( "t" );
    $str23$Additionally_search_genlMts_for_t = makeString( "Additionally search genlMts for this assertion" );
    $kw24$MAIN = makeKeyword( "MAIN" );
    $str25$cb_find_assertion = makeString( "cb-find-assertion" );
    $kw26$FIND_ASSERTION = makeKeyword( "FIND-ASSERTION" );
    $sym27$CB_LINK_FIND_ASSERTION = makeSymbol( "CB-LINK-FIND-ASSERTION" );
    $str28$FindAsrt = makeString( "FindAsrt" );
    $str29$Find_a_CycL_Assertion = makeString( "Find a CycL Assertion" );
    $str30$Sentence_was_not_well_formed_ = makeString( "Sentence was not well-formed." );
    $str31$No_assertions_were_found_ = makeString( "No assertions were found." );
    $str32$Some_assertions_were_found__ = makeString( "Some assertions were found :" );
    $sym33$CB_HANDLE_FIND_ASSERTION = makeSymbol( "CB-HANDLE-FIND-ASSERTION" );
    $list34 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "sentence" ) );
    $list35 = ConsesLow.list( makeSymbol( "ASSERTION-ID" ) );
    $str36$Could_not_determine_an_assertion_ = makeString( "Could not determine an assertion from ~a" );
    $str37$Find_Similar_Assertion = makeString( "Find Similar Assertion" );
    $sym38$CB_FIND_SIMILAR_ASSERTION = makeSymbol( "CB-FIND-SIMILAR-ASSERTION" );
    $sym39$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $str40$_Find_Similar_ = makeString( "[Find Similar]" );
    $kw41$SELF = makeKeyword( "SELF" );
    $str42$cb_find_similar_assertion__A = makeString( "cb-find-similar-assertion&~A" );
    $kw43$FIND_SIMILAR_ASSERTION = makeKeyword( "FIND-SIMILAR-ASSERTION" );
    $sym44$CB_LINK_FIND_SIMILAR_ASSERTION = makeSymbol( "CB-LINK-FIND-SIMILAR-ASSERTION" );
    $sym45$CB_ASSERTION = makeSymbol( "CB-ASSERTION" );
    $sym46$CB_AF = makeSymbol( "CB-AF" );
    $str47$Public_ = makeString( "Public " );
    $str48$ = makeString( "" );
    $str49$Assertion__ = makeString( "Assertion #" );
    $str50$Meta_Assertions__ = makeString( "Meta Assertions :" );
    $int51$1000 = makeInteger( 1000 );
    $kw52$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str53$Truth___ = makeString( "Truth : " );
    $str54$Strength___ = makeString( "Strength : " );
    $str55$Direction___ = makeString( "Direction : " );
    $kw56$ARGUMENTS = makeKeyword( "ARGUMENTS" );
    $str57$Arguments = makeString( "Arguments" );
    $str58$___ = makeString( " : " );
    $str59$No_Dependents = makeString( "No Dependents" );
    $kw60$DEPENDENTS = makeKeyword( "DEPENDENTS" );
    $str61$Dependents = makeString( "Dependents" );
    $str62$_ = makeString( "(" );
    $str63$_A_assertion_P = makeString( "~A assertion~P" );
    $str64$___A_unique_sentences_ = makeString( " (~A unique sentences)" );
    $str65$__ = makeString( ", " );
    $str66$_A_KB_HL_support_P = makeString( "~A KB HL support~P" );
    $str67$_ = makeString( ")" );
    $kw68$TRANSFORMATION_RULE_STATISTICS = makeKeyword( "TRANSFORMATION-RULE-STATISTICS" );
    $str69$Backward_Inference_Statistics__ = makeString( "Backward Inference Statistics :" );
    $kw70$NBSP = makeKeyword( "NBSP" );
    $kw71$VERBOSE = makeKeyword( "VERBOSE" );
    $kw72$CLEAR_TRANSFORMATION_RULE_STATISTICS = makeKeyword( "CLEAR-TRANSFORMATION-RULE-STATISTICS" );
    $str73$_Clear_ = makeString( "[Clear]" );
    $kw74$TOP = makeKeyword( "TOP" );
    $kw75$RULE_FORWARD_INFERENCE_METRICS = makeKeyword( "RULE-FORWARD-INFERENCE-METRICS" );
    $str76$Forward_Inference_Statistics__ = makeString( "Forward Inference Statistics :" );
    $str77$Rule_properties__ = makeString( "Rule properties: " );
    $str78$Self_Looping_ = makeString( "Self-Looping " );
    $str79$Self_Expanding_ = makeString( "Self-Expanding " );
    $str80$Modification_of_this_Assertion_is = makeString( "Modification of this Assertion is not permitted." );
    $str81$Assertion_not_well_formed = makeString( "Assertion not well formed" );
    $list82 = ConsesLow.list( makeKeyword( "IO-MODE" ), makeKeyword( "NL" ) );
    $str83$Assertion_is_either_miscanonicali = makeString( "Assertion is either miscanonicalized or incorrectly indexed." );
    $str84$This_is_probably_due_to_a_canonic = makeString( "This is probably due to a canonicalizer directive on " );
    $str85$_ = makeString( "." );
    $const86$trueSentence = constant_handles.reader_make_constant_shell( makeString( "trueSentence" ) );
    $str87$This_is_probably_due_to_a___trueS = makeString( "This is probably due to a #$trueSentence wrapper being used in the original EL to avoid skolemization." );
    $str88$Assertion_excepted_in_some_mts__ = makeString( "Assertion excepted in some mts :" );
    $str89$Assertion_doomed_due_to__ = makeString( "Assertion doomed due to :" );
    $list90 = ConsesLow.cons( makeSymbol( "DESCRIPTION" ), makeSymbol( "MORE-DESCRIPTIONS" ) );
    $kw91$RED = makeKeyword( "RED" );
    $str92$EL_and_ = makeString( "EL and " );
    $str93$EL_Formula___ = makeString( "EL Formula : " );
    $str94$f__ = makeString( "f: " );
    $str95$__ = makeString( " ." );
    $str96$HL_Formula___ = makeString( "HL Formula : " );
    $str97$__ = makeString( ". " );
    $kw98$NL = makeKeyword( "NL" );
    $str99$English_Translation___ = makeString( "English Translation : " );
    $sym100$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $list101 = ConsesLow.list( makeSymbol( "ISA-COLS" ), makeSymbol( "GENLS-COLS" ), makeSymbol( "QISA-COLS" ) );
    $const102$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const103$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $const104$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym105$BOOLEAN = makeSymbol( "BOOLEAN" );
    $sym106$SECOND = makeSymbol( "SECOND" );
    $sym107$THIRD = makeSymbol( "THIRD" );
    $str108$Rule_Variable_Constraints__ = makeString( "Rule Variable Constraints :" );
    $str109$Variable = makeString( "Variable" );
    $sym110$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $str111$_dddddd = makeString( "#dddddd" );
    $str112$_cccccc = makeString( "#cccccc" );
    $const113$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const114$queryTemplate_Reln = constant_handles.reader_make_constant_shell( makeString( "queryTemplate-Reln" ) );
    $str115$____which_ought_to_parse_any_of__ = makeString( "... which ought to parse any of: " );
    $list116 = ConsesLow.list( makeSymbol( "SYNTAX" ), makeSymbol( "SEMANTICS" ) );
    $kw117$HTML = makeKeyword( "HTML" );
    $str118$Exceptions__ = makeString( "Exceptions :" );
    $kw119$NEW = makeKeyword( "NEW" );
    $sym120$CB_EL_ASSERTION_LINK_WITH_MT_CHECKING_REDUNDANCY = makeSymbol( "CB-EL-ASSERTION-LINK-WITH-MT-CHECKING-REDUNDANCY" );
    $sym121$CB_EL_ASSERTION_LINK_CHECKING_REDUNDANCY = makeSymbol( "CB-EL-ASSERTION-LINK-CHECKING-REDUNDANCY" );
    $sym122$CB_ASSERTION_LINK_WITH_MT = makeSymbol( "CB-ASSERTION-LINK-WITH-MT" );
    $sym123$CB_ASSERTION_LINK = makeSymbol( "CB-ASSERTION-LINK" );
    $str124$Pragmatic_Requirements__ = makeString( "Pragmatic Requirements :" );
    $sym125$CB_ASSERTION_WITH_SHOW_ENGLISH = makeSymbol( "CB-ASSERTION-WITH-SHOW-ENGLISH" );
    $str126$_Show_English_ = makeString( "[Show English]" );
    $str127$cb_assertion_with_show_english__a = makeString( "cb-assertion-with-show-english&~a" );
    $kw128$SHOW_ENGLISH = makeKeyword( "SHOW-ENGLISH" );
    $sym129$CB_LINK_SHOW_ENGLISH = makeSymbol( "CB-LINK-SHOW-ENGLISH" );
    $sym130$CB_ASSERTION_WITH_SHOW_EL_FORMULA = makeSymbol( "CB-ASSERTION-WITH-SHOW-EL-FORMULA" );
    $str131$_EL_Formula_ = makeString( "[EL Formula]" );
    $str132$cb_assertion_with_show_el_formula = makeString( "cb-assertion-with-show-el-formula&~a" );
    $kw133$SHOW_EL_FORMULA = makeKeyword( "SHOW-EL-FORMULA" );
    $sym134$CB_LINK_SHOW_EL_FORMULA = makeSymbol( "CB-LINK-SHOW-EL-FORMULA" );
    $kw135$CB_ARGUMENTS = makeKeyword( "CB-ARGUMENTS" );
    $str136$cb_arguments_html = makeString( "cb-arguments.html" );
    $str137$_A_does_not_specify_an_assertion = makeString( "~A does not specify an assertion" );
    $str138$Arguments_for_Assertion___S = makeString( "Arguments for Assertion #~S" );
    $str139$Assertion___ = makeString( "Assertion : " );
    $sym140$CB_ARGUMENTS = makeSymbol( "CB-ARGUMENTS" );
    $str141$cb_arguments__A = makeString( "cb-arguments&~A" );
    $sym142$CB_LINK_ARGUMENTS = makeSymbol( "CB-LINK-ARGUMENTS" );
    $kw143$CB_DEPENDENTS = makeKeyword( "CB-DEPENDENTS" );
    $str144$cb_dependents_html = makeString( "cb-dependents.html" );
    $str145$Dependents_for_Assertion___S = makeString( "Dependents for Assertion #~S" );
    $str146$_A_Assertions_Deduced_using_Asser = makeString( "~A Assertions Deduced using Assertion: " );
    $str147$Assertion_Deduced_using_Assertion = makeString( "Assertion Deduced using Assertion: " );
    $str148$Supports___ = makeString( "Supports : " );
    $str149$_Deduction_ = makeString( "[Deduction " );
    $str150$_ = makeString( "]" );
    $kw151$DEDUCTION = makeKeyword( "DEDUCTION" );
    $sym152$CB_DEPENDENTS = makeSymbol( "CB-DEPENDENTS" );
    $str153$cb_dependents__A = makeString( "cb-dependents&~A" );
    $sym154$CB_LINK_DEPENDENTS = makeSymbol( "CB-LINK-DEPENDENTS" );
    $sym155$CB_ASSERTION_DEPENDENCIES = makeSymbol( "CB-ASSERTION-DEPENDENCIES" );
    $str156$_Dependencies_ = makeString( "[Dependencies]" );
    $str157$cb_assertion_dependencies__A = makeString( "cb-assertion-dependencies&~A" );
    $kw158$ASSERTION_DEPENDENCIES = makeKeyword( "ASSERTION-DEPENDENCIES" );
    $sym159$CB_LINK_ASSERTION_DEPENDENCIES = makeSymbol( "CB-LINK-ASSERTION-DEPENDENCIES" );
    $str160$Assertion_Dependencies = makeString( "Assertion Dependencies" );
    $str161$_S_dependent_assertion_A = makeString( "~S dependent assertion~A" );
    $str162$s__in_order = makeString( "s, in order" );
    $str163$_Refresh_ = makeString( "[Refresh]" );
    $str164$_A_does_not_specify_an_argument = makeString( "~A does not specify an argument" );
    $sym165$CB_DEDUCTION = makeSymbol( "CB-DEDUCTION" );
    $str166$cb_deduction__A = makeString( "cb-deduction&~A" );
    $str167$Dont_know_how_to_convert__A_into_ = makeString( "Dont know how to convert ~A into a deduction." );
    $sym168$DEDUCTION_P = makeSymbol( "DEDUCTION-P" );
    $str169$Deduction___A = makeString( "Deduction #~A" );
    $sym170$CB_LINK_DEDUCTION = makeSymbol( "CB-LINK-DEDUCTION" );
    $str171$__ = makeString( "#<" );
    $str172$DEDUCTION___A = makeString( "DEDUCTION #~A" );
    $str173$_ = makeString( ">" );
    $str174$__DEDUCTION___ = makeString( "#<DEDUCTION ?>" );
    $kw175$DEDUCTION_STRUCT = makeKeyword( "DEDUCTION-STRUCT" );
    $sym176$CB_LINK_DEDUCTION_STRUCT = makeSymbol( "CB-LINK-DEDUCTION-STRUCT" );
    $sym177$CB_FORM_DEDUCTION_METHOD = makeSymbol( "CB-FORM-DEDUCTION-METHOD" );
    $str178$Deduced_Argument_detail = makeString( "Deduced Argument detail" );
    $kw179$CB_SOURCE = makeKeyword( "CB-SOURCE" );
    $str180$cb_source_html = makeString( "cb-source.html" );
    $str181$Deduced_Argument___S = makeString( "Deduced Argument #~S" );
    $kw182$REMOVE_DEDUCTION = makeKeyword( "REMOVE-DEDUCTION" );
    $str183$_Remove_Deduction_ = makeString( "[Remove Deduction]" );
    $str184$Previous = makeString( "Previous" );
    $str185$Next = makeString( "Next" );
    $str186$Argument_was_Overruled = makeString( "Argument was Overruled" );
    $str187$Conclusion__ = makeString( "Conclusion :" );
    $str188$Mt___ = makeString( "Mt : " );
    $str189$Supported_conclusion_is_invalid_ = makeString( "Supported conclusion is invalid!" );
    $str190$Justification___ = makeString( "Justification : " );
    $list191 = ConsesLow.cons( makeSymbol( "A" ), makeSymbol( "COUNT" ) );
    $sym192$_ = makeSymbol( "<" );
    $str193$Date_of_most_recent_supporting_as = makeString( "Date of most recent supporting asserted assertion : " );
    $str194$Supporting_asserted_assertions___ = makeString( "Supporting asserted assertions : " );
    $str195$Supports = makeString( "Supports" );
    $str196$_and_pragmatic_supports = makeString( " and pragmatic supports" );
    $str197$_max_floor_mts___ = makeString( " max-floor-mts : " );
    $kw198$BULL = makeKeyword( "BULL" );
    $sym199$SUPPORT_MT = makeSymbol( "SUPPORT-MT" );
    $sym200$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $str201$Bound_rule_justification___ = makeString( "Bound rule justification : " );
    $sym202$_CB_JUSTIFY_TABLE_ = makeSymbol( "*CB-JUSTIFY-TABLE*" );
    $kw203$CB_JUSTIFY = makeKeyword( "CB-JUSTIFY" );
    $str204$cb_justify_html = makeString( "cb-justify.html" );
    $int205$100 = makeInteger( 100 );
    $str206$Full_justification_for_Assertion_ = makeString( "Full justification for Assertion #~S" );
    $str207$Assertion_Supported__ = makeString( "Assertion Supported :" );
    $sym208$CB_JUSTIFY = makeSymbol( "CB-JUSTIFY" );
    $str209$_Justify_ = makeString( "[Justify]" );
    $str210$cb_justify__A = makeString( "cb-justify&~A" );
    $kw211$JUSTIFY = makeKeyword( "JUSTIFY" );
    $sym212$CB_LINK_JUSTIFY = makeSymbol( "CB-LINK-JUSTIFY" );
    $str213$Complete_Justification_for_Assert = makeString( "Complete Justification for Assertion :" );
    $str214$Arguments_Supporting_Assertion__ = makeString( "Arguments Supporting Assertion :" );
    $str215$Argument___ = makeString( "Argument : " );
    $str216$Justified_Above = makeString( "Justified Above" );
    $str217$disc = makeString( "disc" );
    $str218$1 = makeString( "1" );
    $str219$Asserted_locally = makeString( "Asserted locally" );
    $str220$_by_ = makeString( " by " );
    $str221$_on_ = makeString( " on " );
    $str222$_at_ = makeString( " at " );
    $str223$_for_ = makeString( " for " );
    $kw224$NONE = makeKeyword( "NONE" );
    $kw225$LEFT = makeKeyword( "LEFT" );
    $list226 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "VALIDATION-LEVEL-STR" ) );
    $str227$_A_does_not_specify_an_HL_support = makeString( "~A does not specify an HL support" );
    $sym228$CB_HL_SUPPORT = makeSymbol( "CB-HL-SUPPORT" );
    $sym229$HL_SUPPORT_P = makeSymbol( "HL-SUPPORT-P" );
    $sym230$INTERMEDIATE_STEP_VALIDATION_LEVEL_P = makeSymbol( "INTERMEDIATE-STEP-VALIDATION-LEVEL-P" );
    $str231$cb_hl_support__A__A = makeString( "cb-hl-support&~A&~A" );
    $kw232$HL_SUPPORT = makeKeyword( "HL-SUPPORT" );
    $sym233$CB_LINK_HL_SUPPORT = makeSymbol( "CB-LINK-HL-SUPPORT" );
    $str234$KB_HL_Support__S_Detail = makeString( "KB HL Support ~S Detail" );
    $str235$HL_Support_Detail = makeString( "HL Support Detail" );
    $kw236$CB_HL_SUPPORT = makeKeyword( "CB-HL-SUPPORT" );
    $str237$cb_hl_support_html = makeString( "cb-hl-support.html" );
    $kw238$HL_SUPPORT_VALIDATE = makeKeyword( "HL-SUPPORT-VALIDATE" );
    $str239$_Validate_ = makeString( "[Validate]" );
    $kw240$HL_SUPPORT_SIMILAR_QUERY = makeKeyword( "HL-SUPPORT-SIMILAR-QUERY" );
    $str241$_Query_Similar_ = makeString( "[Query Similar]" );
    $str242$Unknown = makeString( "Unknown" );
    $str243$Module___ = makeString( "Module : " );
    $str244$None_available = makeString( "None available" );
    $str245$Nothing_deeper_available = makeString( "Nothing deeper available" );
    $str246$Computed_forward_mt_combos___ = makeString( "Computed forward mt combos : " );
    $const247$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $str248$__This_HL_support_has_a_very_slow = makeString( " (This HL support has a very slow forward-mt-combos call of ~A seconds.)" );
    $str249$__This_HL_support_has_a_stale_mt_ = makeString( " (This HL support has a stale mt.)" );
    $str250$KB_HL_Support_argument___ = makeString( "KB HL Support argument : " );
    $str251$_A_KB_HL_Support_dependents___ = makeString( "~A KB HL Support dependents : " );
    $str252$cb_hl_validate__A__A = makeString( "cb-hl-validate&~A&~A" );
    $sym253$CB_LINK_HL_SUPPORT_VALIDATE = makeSymbol( "CB-LINK-HL-SUPPORT-VALIDATE" );
    $str254$The_hl_support_is_not_available_ = makeString( "The hl-support is not available." );
    $sym255$CB_HL_VALIDATE = makeSymbol( "CB-HL-VALIDATE" );
    $str256$cb_hl_support_similar_query__A = makeString( "cb-hl-support-similar-query&~A" );
    $sym257$CB_LINK_HL_SUPPORT_SIMILAR_QUERY = makeSymbol( "CB-LINK-HL-SUPPORT-SIMILAR-QUERY" );
    $sym258$CB_HL_SUPPORT_SIMILAR_QUERY = makeSymbol( "CB-HL-SUPPORT-SIMILAR-QUERY" );
    $str259$_A_does_not_specify_an_HL_clause_ = makeString( "~A does not specify an HL clause-struc" );
    $sym260$CB_CLAUSE_STRUC = makeSymbol( "CB-CLAUSE-STRUC" );
    $sym261$CLAUSE_STRUC_P = makeSymbol( "CLAUSE-STRUC-P" );
    $str262$cb_clause_struc__A = makeString( "cb-clause-struc&~A" );
    $str263$CLAUSE_STRUC___S = makeString( "CLAUSE-STRUC #~S" );
    $kw264$CLAUSE_STRUC = makeKeyword( "CLAUSE-STRUC" );
    $sym265$CB_LINK_CLAUSE_STRUC = makeSymbol( "CB-LINK-CLAUSE-STRUC" );
    $sym266$CB_FORM_CLAUSE_STRUC_METHOD = makeSymbol( "CB-FORM-CLAUSE-STRUC-METHOD" );
    $kw267$CB_CLAUSE_STRUC = makeKeyword( "CB-CLAUSE-STRUC" );
    $str268$cb_clause_struc_html = makeString( "cb-clause-struc.html" );
    $str269$Clause_Struc___S = makeString( "Clause Struc #~S" );
    $str270$CNF_clause___ = makeString( "CNF clause : " );
    $str271$Assertions_using_this_clause___ = makeString( "Assertions using this clause : " );
    $str272$__ = makeString( "((" );
    $str273$__ = makeString( "))" );
    $str274$assertion_id = makeString( "assertion-id" );
    $str275$sentence = makeString( "sentence" );
    $str276$sentence_type = makeString( "sentence-type" );
    $str277$question = makeString( "question" );
    $str278$question_type = makeString( "question-type" );
    $kw279$S = makeKeyword( "S" );
    $kw280$Q = makeKeyword( "Q" );
    $sym281$CB_PROCESS_SUGGESTED_ENGLISH = makeSymbol( "CB-PROCESS-SUGGESTED-ENGLISH" );
  }
}
/*
 * 
 * Total time: 1639 ms
 * 
 */