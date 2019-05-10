package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_editor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_editor";
  public static final String myFingerPrint = "922637ba296e727eea2419d166c2a4305a2da143a4803dd0557d6686889f7e59";
  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 6681L)
  private static SubLSymbol $merge_permitted_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 9237L)
  public static SubLSymbol $cb_enable_legacy_create_similar$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 44296L)
  public static SubLSymbol $cb_last_hyp_formula$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 44496L)
  public static SubLSymbol $cb_last_hyp_mt$;
  private static final SubLSymbol $sym0$_EXIT;
  private static final SubLSymbol $sym1$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw2$CREATE_SIMILAR_LEGACY;
  private static final SubLSymbol $kw3$CREATE_SIMILAR;
  private static final SubLSymbol $kw4$CREATE_INSTANCE;
  private static final SubLSymbol $kw5$CREATE_SPEC;
  private static final SubLSymbol $kw6$CREATE_SPEC_PRED;
  private static final SubLSymbol $kw7$CREATE_SPEC_MT;
  private static final SubLSymbol $kw8$RENAME;
  private static final SubLSymbol $kw9$MERGE;
  private static final SubLSymbol $kw10$CONFIRM_KILL;
  private static final SubLSymbol $kw11$KILL;
  private static final SubLSymbol $kw12$KB_MONITOR_INDEX_HOOK;
  private static final SubLSymbol $kw13$LEXIFY_TERM;
  private static final SubLSymbol $kw14$TTT_TEST;
  private static final SubLString $str15$_Take_Test_;
  private static final SubLSymbol $kw16$KCT_TEST;
  private static final SubLSymbol $kw17$KBQ_ASK;
  private static final SubLSymbol $kw18$KBQ_ASK_IN_PROOF_CHECKER;
  private static final SubLSymbol $kw19$KCT_TEST_SET;
  private static final SubLSymbol $kw20$KCT_EDIT;
  private static final SubLSymbol $kw21$KBQ_EDIT;
  private static final SubLSymbol $kw22$SYNTACTIC_NODE_TOOLKIT;
  private static final SubLSymbol $kw23$NOREG;
  private static final SubLSymbol $kw24$SKSI_REGISTER;
  private static final SubLSymbol $kw25$PARTIAL;
  private static final SubLSymbol $kw26$SKSI_DEREGISTER;
  private static final SubLSymbol $kw27$REG;
  private static final SubLSymbol $kw28$EDIT_IN_SMT;
  private static final SubLObject $const29$Ontology;
  private static final SubLSymbol $kw30$CB_OWL_EXPORT_XML;
  private static final SubLString $str31$_OWL_Export_;
  private static final SubLList $list32;
  private static final SubLString $str33$_ontology;
  private static final SubLObject $const34$ReservedConstant;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$CB_CREATE;
  private static final SubLString $str37$cb_create_html;
  private static final SubLString $str38$the_Create_Constant_page;
  private static final SubLString $str39$Create_Constant;
  private static final SubLString $str40$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str41$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw42$UNINITIALIZED;
  private static final SubLSymbol $kw43$CB_CYC;
  private static final SubLSymbol $kw44$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw45$SHA1;
  private static final SubLString $str46$yui_skin_sam;
  private static final SubLString $str47$reloadFrameButton;
  private static final SubLString $str48$button;
  private static final SubLString $str49$reload;
  private static final SubLString $str50$Refresh_Frames;
  private static final SubLString $str51$post;
  private static final SubLString $str52$cb_handle_create;
  private static final SubLString $str53$Clear;
  private static final SubLString $str54$Enter_name_for_new_constant___;
  private static final SubLString $str55$new_name;
  private static final SubLString $str56$Complete;
  private static final SubLString $str57$;
  private static final SubLInteger $int58$40;
  private static final SubLString $str59$creating;
  private static final SubLString $str60$Cyc_Naming_Conventions;
  private static final SubLSymbol $sym61$CB_CREATE;
  private static final SubLSymbol $kw62$HTML_HANDLER;
  private static final SubLString $str63$Creating;
  private static final SubLString $str64$No_name_was_specified;
  private static final SubLString $str65$_S_is_not_a_valid_constant_name;
  private static final SubLString $str66$Already_a_constant_named__a;
  private static final SubLString $str67$Constant_Create;
  private static final SubLString $str68$Unable_to_create_a_constant_named;
  private static final SubLSymbol $sym69$CB_HANDLE_CREATE;
  private static final SubLSymbol $kw70$CREATE;
  private static final SubLString $str71$create_tool_gif;
  private static final SubLString $str72$Create;
  private static final SubLSymbol $kw73$MAIN;
  private static final SubLString $str74$cb_create;
  private static final SubLSymbol $sym75$CB_LINK_CREATE;
  private static final SubLString $str76$Crt;
  private static final SubLString $str77$Create_Bare_Cyc_Constant;
  private static final SubLSymbol $kw78$CB_CREATE_SIMILAR;
  private static final SubLString $str79$cb_create_similar_html;
  private static final SubLSymbol $sym80$_CB_ENABLE_LEGACY_CREATE_SIMILAR_;
  private static final SubLString $str81$the_Create_Similar_Term_page;
  private static final SubLList $list82;
  private static final SubLString $str83$_a_does_not_specify_a_Cyc_term;
  private static final SubLString $str84$Create_Similar_Term;
  private static final SubLString $str85$cb_handle_create_similar_legacy;
  private static final SubLString $str86$Enter_name_for_new_term_similar_t;
  private static final SubLString $str87$__;
  private static final SubLString $str88$Create_Similar;
  private static final SubLString $str89$create;
  private static final SubLString $str90$Copy_Assertions;
  private static final SubLString $str91$copy;
  private static final SubLString $str92$Check_the_assertions_from_;
  private static final SubLString $str93$_which_you_wish_to_copy_as_well__;
  private static final SubLSymbol $sym94$CB_CREATE_SIMILAR_CHECKBOX;
  private static final SubLSymbol $kw95$MAXIMAL;
  private static final SubLSymbol $sym96$CB_CREATE_SIMILAR_LEGACY;
  private static final SubLString $str97$create_similar_facilities;
  private static final SubLString $str98$Unable_to_determine_a_term_from__;
  private static final SubLString $str99$No_term_was_specified;
  private static final SubLString $str100$_S_is_not_a_valid_term_name;
  private static final SubLString $str101$Already_a_constant_named__S;
  private static final SubLString $str102$Constant__S_already_exists_which_;
  private static final SubLString $str103$Unable_to_create_a_similar_term_n;
  private static final SubLSymbol $sym104$HLMT_EQUAL;
  private static final SubLSymbol $sym105$CB_HANDLE_CREATE_SIMILAR_LEGACY;
  private static final SubLString $str106$error;
  private static final SubLString $str107$_S;
  private static final SubLString $str108$focalterm;
  private static final SubLString $str109$response;
  private static final SubLString $str110$invalidTerm;
  private static final SubLString $str111$_S_is_not_a_valid_term_name_;
  private static final SubLString $str112$Constant__A_already_exists__which;
  private static final SubLString $str113$Unable_to_create_a_term_named__S_;
  private static final SubLString $str114$sentence;
  private static final SubLSymbol $kw115$INPUT_NAME;
  private static final SubLObject $const116$unknownSentence;
  private static final SubLSymbol $kw117$SENTENCE_NUM;
  private static final SubLSymbol $kw118$SENTENCE;
  private static final SubLObject $const119$BaseKB;
  private static final SubLString $str120$newTermId;
  private static final SubLString $str121$id;
  private static final SubLString $str122$invalidSentence;
  private static final SubLString $str123$count;
  private static final SubLString $str124$assertionsQueued;
  private static final SubLString $str125$_A_assertions_added_to_the_local_;
  private static final SubLSymbol $sym126$CB_HANDLE_CREATE_SIMILAR;
  private static final SubLSymbol $kw127$XML_HANDLER;
  private static final SubLString $str128$_Create_Similar_;
  private static final SubLString $str129$cb_create_similar__A;
  private static final SubLSymbol $sym130$CB_LINK_CREATE_SIMILAR;
  private static final SubLString $str131$color_red__font_size_120___font_w;
  private static final SubLObject $const132$Guest;
  private static final SubLString $str133$Sorry__;
  private static final SubLString $str134$_cannot_make_assertions_using_the;
  private static final SubLSymbol $kw135$CB_LOGIN;
  private static final SubLString $str136$login;
  private static final SubLString $str137$_using_your_real_name_now_so_that;
  private static final SubLString $str138$lookupbutton;
  private static final SubLString $str139$assertbutton;
  private static final SubLString $str140$font_size_10pt;
  private static final SubLString $str141$All_Mts;
  private static final SubLString $str142$togglecheckall___;
  private static final SubLString $str143$Check_All___Uncheck_All;
  private static final SubLString $str144$Undo;
  private static final SubLString $str145$uncommit__;
  private static final SubLString $str146$Redo;
  private static final SubLString $str147$recommit__;
  private static final SubLString $str148$Switch_to_Browse_Mode;
  private static final SubLString $str149$togglelookupmode__;
  private static final SubLString $str150$SEND;
  private static final SubLString $str151$dosubmit__;
  private static final SubLString $str152$Assert_selected_sentences;
  private static final SubLSymbol $kw153$DEFAULT;
  private static final SubLSymbol $sym154$MAX_ARITY;
  private static final SubLSymbol $sym155$_;
  private static final SubLString $str156$_;
  private static final SubLString $str157$_;
  private static final SubLString $str158$_;
  private static final SubLString $str159$_;
  private static final SubLString $str160$focalTerm;
  private static final SubLString $str161$hlid;
  private static final SubLString $str162$contentspec;
  private static final SubLSymbol $sym163$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const164$EverythingPSC;
  private static final SubLString $str165$assertions;
  private static final SubLSymbol $kw166$GAF;
  private static final SubLSymbol $kw167$ALL_INFERRED;
  private static final SubLString $str168$assertion;
  private static final SubLObject $const169$DocumentationPredicate;
  private static final SubLInteger $int170$100;
  private static final SubLSymbol $sym171$SYMBOLP;
  private static final SubLSymbol $kw172$CB_CREATE_SIMILAR_JS;
  private static final SubLSymbol $sym173$CB_CREATE_SIMILAR;
  private static final SubLString $str174$cb_create_similar_legacy__A;
  private static final SubLSymbol $sym175$CB_LINK_CREATE_SIMILAR_LEGACY;
  private static final SubLString $str176$_Create_Instance_;
  private static final SubLString $str177$javascript_startCreate___A_____A_;
  private static final SubLSymbol $sym178$CB_LINK_CREATE_INSTANCE;
  private static final SubLString $str179$_Create_Spec_;
  private static final SubLString $str180$javascript_startCreate___A_____A_;
  private static final SubLSymbol $sym181$CB_LINK_CREATE_SPEC;
  private static final SubLString $str182$_Create_Spec_Mt_;
  private static final SubLString $str183$javascript_startCreate___A_____A_;
  private static final SubLSymbol $sym184$CB_LINK_CREATE_SPEC_MT;
  private static final SubLString $str185$_Create_Spec_Pred_;
  private static final SubLString $str186$javascript_startCreate___A_____A_;
  private static final SubLSymbol $sym187$CB_LINK_CREATE_SPEC_PRED;
  private static final SubLSymbol $kw188$CB_RENAME;
  private static final SubLString $str189$cb_rename_html;
  private static final SubLString $str190$the_Rename_Constant_page;
  private static final SubLString $str191$_a_does_not_specify_a_Cyc_constan;
  private static final SubLString $str192$Rename_Constant;
  private static final SubLString $str193$cb_handle_rename;
  private static final SubLString $str194$Enter_new_name_for_;
  private static final SubLString $str195$Current_Name;
  private static final SubLString $str196$Rename;
  private static final SubLString $str197$naming;
  private static final SubLString $str198$renaming;
  private static final SubLString $str199$Cyc_Rename_Kill;
  private static final SubLSymbol $sym200$CB_RENAME;
  private static final SubLString $str201$Could_not_determine_a_term_from__;
  private static final SubLString $str202$Name_specified_is_same_as_current;
  private static final SubLString $str203$Constant_Rename;
  private static final SubLSymbol $sym204$CB_HANDLE_RENAME;
  private static final SubLString $str205$_Rename_;
  private static final SubLString $str206$cb_rename__A;
  private static final SubLSymbol $sym207$CB_LINK_RENAME;
  private static final SubLSymbol $kw208$CB_MERGE;
  private static final SubLString $str209$cb_merge_html;
  private static final SubLString $str210$the_Merge_Term_page;
  private static final SubLString $str211$Merge_Term;
  private static final SubLString $str212$cb_handle_merge;
  private static final SubLString $str213$fort_spec;
  private static final SubLString $str214$Merge_the_term_;
  private static final SubLString $str215$_onto_the_existing_constant_named;
  private static final SubLString $str216$target_name;
  private static final SubLString $str217$Merge;
  private static final SubLSymbol $sym218$CB_MERGE;
  private static final SubLString $str219$merging;
  private static final SubLString $str220$Attempt_to_merge__S_with_itself_;
  private static final SubLSymbol $sym221$CB_HANDLE_MERGE;
  private static final SubLString $str222$_Merge_;
  private static final SubLString $str223$cb_merge__A;
  private static final SubLSymbol $sym224$CB_LINK_MERGE;
  private static final SubLString $str225$the_Cyc_term_kill_facility;
  private static final SubLString $str226$confirmed;
  private static final SubLString $str227$Term_Kill;
  private static final SubLSymbol $sym228$CB_KILL;
  private static final SubLString $str229$_Kill_;
  private static final SubLString $str230$cb_kill__A;
  private static final SubLString $str231$cb_kill__A_confirmed_T;
  private static final SubLSymbol $sym232$CB_LINK_KILL;
  private static final SubLSymbol $kw233$CB_CONFIRM_KILL;
  private static final SubLString $str234$cb_confirm_kill_html;
  private static final SubLString $str235$Confirm_Term_Kill;
  private static final SubLString $str236$cb_kill;
  private static final SubLString $str237$T;
  private static final SubLString $str238$NOTE__;
  private static final SubLString $str239$If_you_are_killing_this_term_to_r;
  private static final SubLSymbol $kw240$RECREATE;
  private static final SubLString $str241$_page_instead_;
  private static final SubLString $str242$Please_confirm_kill_of_;
  private static final SubLString $str243$_and_the_removal_of_all__S_assert;
  private static final SubLSymbol $kw244$SELF;
  private static final SubLString $str245$No;
  private static final SubLString $str246$Yes__Kill;
  private static final SubLString $str247$killing_constants;
  private static final SubLSymbol $sym248$CB_CONFIRM_KILL;
  private static final SubLString $str249$cb_confirm_kill__A;
  private static final SubLSymbol $sym250$CB_LINK_CONFIRM_KILL;
  private static final SubLSymbol $kw251$CB_RECREATE;
  private static final SubLString $str252$cb_recreate_html;
  private static final SubLString $str253$the_Cyc_constant_recreate_facilit;
  private static final SubLList $list254;
  private static final SubLString $str255$Recreate_Constant;
  private static final SubLString $str256$cb_recreate_handler;
  private static final SubLString $str257$Please_confirm_recreation_of_;
  private static final SubLString $str258$Yes__Recreate;
  private static final SubLSymbol $sym259$CB_RECREATE;
  private static final SubLString $str260$Constant_Recreate;
  private static final SubLSymbol $sym261$CB_RECREATE_HANDLER;
  private static final SubLString $str262$_Recreate_;
  private static final SubLString $str263$cb_recreate__A;
  private static final SubLSymbol $sym264$CB_LINK_RECREATE;
  private static final SubLSymbol $kw265$CB_ALL_ASSERTIONS_TMS_HANDLER;
  private static final SubLString $str266$cb_all_assertions_tms_handler_htm;
  private static final SubLString $str267$the_Reperform_TMS_facility;
  private static final SubLString $str268$Confirm_Reperform_TMS_Page;
  private static final SubLString $str269$cb_all_assertions_tms_handler;
  private static final SubLString $str270$These_operations_may_take_some_ti;
  private static final SubLString $str271$_of_the_assertions_of_the_constan;
  private static final SubLString $str272$_;
  private static final SubLString $str273$Do_it_;
  private static final SubLSymbol $sym274$CB_ALL_ASSERTIONS_TMS;
  private static final SubLString $str275$Reperform_TMS_on_indexed_Assertio;
  private static final SubLSymbol $sym276$CB_ALL_ASSERTIONS_TMS_HANDLER;
  private static final SubLString $str277$_Force_TMS_;
  private static final SubLString $str278$cb_all_assertions_tms__A;
  private static final SubLSymbol $kw279$ALL_ASSERTIONS_TMS;
  private static final SubLSymbol $sym280$CB_LINK_ALL_ASSERTIONS_TMS;
  private static final SubLSymbol $sym281$_CB_LAST_HYP_FORMULA_;
  private static final SubLSymbol $sym282$_CB_LAST_HYP_MT_;
  private static final SubLSymbol $kw283$CB_HYPOTHESIZE_HANDLER;
  private static final SubLString $str284$cb_hypothesize_handler_html;
  private static final SubLString $str285$Hypothesize;
  private static final SubLString $str286$cb_hypothesize_handler;
  private static final SubLString $str287$Reset_Values;
  private static final SubLList $list288;
  private static final SubLSymbol $sym289$CB_HYPOTHESIZE_HANDLER;
  private static final SubLList $list290;
  private static final SubLString $str291$Last_hypothesis_in_;
  private static final SubLSymbol $kw292$ERROR;
  private static final SubLString $str293$Error_description__;
  private static final SubLString $str294$Hypothesis_results___;
  private static final SubLSymbol $kw295$HYPOTHESIZE;
  private static final SubLSymbol $sym296$CB_LINK_HYPOTHESIZE;
  private static final SubLString $str297$Hyp;
  private static final SubLString $str298$Hypothesize_a_formula;
  private static final SubLString $str299$assertionId;
  private static final SubLSymbol $sym300$XML_ASSERTION_INFO;
  private static final SubLList $list301;
  private static final SubLSymbol $sym302$CB_FORM_SMART;

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 692L)
  public static SubLObject cb_create_hook(final SubLObject new_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    try
    {
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      return ke.ke_create( new_name );
    }
    finally
    {
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 847L)
  public static SubLObject cb_hypothesize_hook(final SubLObject formula, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject error = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    try
    {
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym1$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            ans = prove.fi_hypothesize( formula, mt, UNPROVIDED, UNPROVIDED );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0_$1, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
    }
    return ( NIL != error ) ? error : ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 1058L)
  public static SubLObject cb_term_toolbar(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.fort_p( fort ) )
    {
      final SubLObject modification_permittedP = term_modification_permittedP( fort );
      final SubLObject not_modifiableP = makeBoolean( NIL == modification_permittedP );
      if( NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue( thread ) )
      {
        if( NIL != $cb_enable_legacy_create_similar$.getDynamicValue( thread ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw2$CREATE_SIMILAR_LEGACY, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        cb_utilities.cb_link( $kw3$CREATE_SIMILAR, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        if( NIL != fort_types_interface.collectionP( fort ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw4$CREATE_INSTANCE, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        if( NIL != fort_types_interface.collectionP( fort ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw5$CREATE_SPEC, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        if( NIL != cycl_grammar.cycl_predicate_p( fort ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw6$CREATE_SPEC_PRED, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        if( NIL != fort_types_interface.microtheory_p( fort ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw7$CREATE_SPEC_MT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        if( NIL == nart_handles.nart_p( fort ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw8$RENAME, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        if( NIL != term_as_merge_source_permittedP( fort ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw9$MERGE, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        if( NIL != cb_parameters.$cb_confirm_kills$.getDynamicValue( thread ) )
        {
          cb_utilities.cb_link( $kw10$CONFIRM_KILL, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          cb_utilities.cb_link( $kw11$KILL, fort, NIL, not_modifiableP, UNPROVIDED, UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      if( NIL != cb_parameters.$show_kb_monitor_links$.getDynamicValue( thread ) )
      {
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        cb_utilities.cb_link( $kw12$KB_MONITOR_INDEX_HOOK, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      final SubLObject unlexifiedP = lexification_utilities.unlexifiedP( fort, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      if( NIL != unlexifiedP )
      {
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        cb_utilities.cb_link( $kw13$LEXIFY_TERM, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      }
      else
      {
        cb_utilities.cb_link( $kw13$LEXIFY_TERM, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != kct_utils.kct_test_spec_p( fort, UNPROVIDED ) )
      {
        html_utilities.html_indent( UNPROVIDED );
        final SubLObject ttt_linkP = NIL;
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        if( NIL != ttt_linkP )
        {
          cb_utilities.cb_link( $kw14$TTT_TEST, fort, $str15$_Take_Test_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          cb_utilities.cb_link( $kw16$KCT_TEST, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        final SubLObject query = kct_utils.kct_query_specification( fort, UNPROVIDED );
        if( NIL != forts.fort_p( query ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw17$KBQ_ASK, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          if( NIL != cb_kb_query.kbq_query_practice_rules( query ) )
          {
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_indent( UNPROVIDED );
            cb_utilities.cb_link( $kw18$KBQ_ASK_IN_PROOF_CHECKER, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          }
        }
      }
      if( NIL != kct_utils.kct_test_collection_p( fort, UNPROVIDED ) )
      {
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        cb_utilities.cb_link( $kw19$KCT_TEST_SET, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      if( NIL != kct_utils.kct_test_spec_p( fort, UNPROVIDED ) )
      {
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        cb_utilities.cb_link( $kw20$KCT_EDIT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      if( NIL != kb_query.kbq_query_spec_p( fort ) )
      {
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        cb_utilities.cb_link( $kw17$KBQ_ASK, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        if( NIL != cb_kb_query.kbq_query_practice_rules( fort ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw18$KBQ_ASK_IN_PROOF_CHECKER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        cb_utilities.cb_link( $kw21$KBQ_EDIT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      if( NIL != iterative_template_parser.syntactic_option_node_p( fort ) )
      {
        html_utilities.html_indent( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        cb_utilities.cb_link( $kw22$SYNTACTIC_NODE_TOOLKIT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      if( NIL != sksi_kb_accessors.sk_source_in_any_mt_p( fort ) )
      {
        final SubLObject pcase_var = sksi_sks_manager.sks_registration_state( fort );
        if( pcase_var.eql( $kw23$NOREG ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw24$SKSI_REGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        else if( pcase_var.eql( $kw25$PARTIAL ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw24$SKSI_REGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw26$SKSI_DEREGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        else if( pcase_var.eql( $kw27$REG ) )
        {
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_utilities.cb_link( $kw26$SKSI_DEREGISTER, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        if( NIL != sksi_smt.$allow_smt_editing_links$.getDynamicValue( thread ) && NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p( fort ) )
        {
          cb_utilities.cb_link( $kw28$EDIT_IN_SMT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      if( NIL != isa.isa_in_any_mtP( fort, $const29$Ontology ) )
      {
        html_utilities.html_indent( UNPROVIDED );
        cb_utilities.cb_link( $kw30$CB_OWL_EXPORT_XML, $str31$_OWL_Export_, html_arghash.arglist_to_arghash( ConsesLow.list( $list32, ConsesLow.list( $str33$_ontology, fort ) ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 5685L)
  public static SubLObject term_modification_permittedP(final SubLObject v_term)
  {
    return makeBoolean( NIL == term_modification_forbiddenP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 5863L)
  public static SubLObject term_modification_forbiddenP(final SubLObject v_term)
  {
    if( NIL != constant_completion.constant_mentioned_in_codeP( v_term ) || NIL != isa.quoted_isa_in_any_mtP( v_term, $const34$ReservedConstant ) )
    {
      return T;
    }
    return sbhl_time_utilities.sbhl_temporal_point_nartP( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 6909L)
  public static SubLObject term_as_merge_source_permittedP(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != constant_handles.constant_p( v_term ) || ( NIL != nart_handles.nart_p( v_term ) && NIL != list_utilities.member_eqP( cycl_utilities.nat_function( v_term ), $merge_permitted_functions$
        .getDynamicValue( thread ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 7174L)
  public static SubLObject cb_create(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str38$the_Create_Constant_page );
    }
    else
    {
      final SubLObject title_var = $str39$Create_Constant;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw43$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_complete.html_complete_script();
          cyc_file_dependencies.css( $kw44$SAM_AUTOCOMPLETE_CSS );
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str46$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str47$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str48$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str49$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str50$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
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
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str51$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str52$cb_handle_create, T, UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw36$CB_CREATE, NIL, UNPROVIDED );
                html_utilities.html_reset_input( $str53$Clear );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_submit_input( $str39$Create_Constant, UNPROVIDED, UNPROVIDED );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str54$Enter_name_for_new_constant___ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( TWO_INTEGER );
                html_complete.html_complete_button( $str55$new_name, $str56$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_text_input( $str55$new_name, $str57$, $int58$40 );
                html_utilities.html_newline( TWO_INTEGER );
                cb_utilities.cb_doc_link( $str59$creating, $str60$Cyc_Naming_Conventions, cb_utilities.cyc_system_doc_naming_conventions(), UNPROVIDED );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 7904L)
  public static SubLObject cb_handle_create(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str63$Creating );
      return NIL;
    }
    final SubLObject new_name = string_utilities.trim_whitespace( html_utilities.html_extract_input( $str55$new_name, args ) );
    if( !new_name.isString() || new_name.equal( $str57$ ) )
    {
      cb_utilities.cb_error( $str64$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL == constant_completion_high.valid_constant_name_p( new_name ) )
    {
      cb_utilities.cb_error( $str65$_S_is_not_a_valid_constant_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != constants_high.find_constant( new_name ) )
    {
      cb_utilities.cb_error( $str66$Already_a_constant_named__a, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      final SubLObject new_constant = cb_create_hook( new_name );
      if( NIL != constant_handles.constant_p( new_constant ) )
      {
        cb_tools.cb_add_to_constant_history( new_constant );
        cb_assertion_editor.cb_note_edit_change( $str67$Constant_Create, NIL, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cb_utilities.cb_error( $str68$Unable_to_create_a_constant_named, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 8817L)
  public static SubLObject cb_link_create(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str72$Create;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str74$cb_create );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 9375L)
  public static SubLObject cb_create_similar_legacy(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str81$the_Create_Similar_Term_page );
    }
    else
    {
      SubLObject fort_spec = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list82 );
      fort_spec = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
        if( NIL == forts.fort_p( fort ) )
        {
          cb_utilities.cb_error( $str83$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return NIL;
        }
        fort_spec = cb_utilities.cb_fort_identifier( fort );
        final SubLObject title_var = $str84$Create_Similar_Term;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
        try
        {
          html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
              ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
              : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
          html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
          if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
          try
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
                EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
            html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw43$CB_CYC );
            dhtml_macros.html_basic_cb_scripts();
            if( NIL != title_var )
            {
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
            }
            html_complete.html_complete_script();
            cyc_file_dependencies.css( $kw44$SAM_AUTOCOMPLETE_CSS );
            html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
              html_utilities.html_markup( $str46$yui_skin_sam );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str47$reloadFrameButton );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str48$button );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str49$reload );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_princ( $str50$Refresh_Frames );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
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
                final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
                html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str51$post );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != frame_name_var )
                {
                  html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( frame_name_var );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.$within_html_form$.bind( T, thread );
                  html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                  html_utilities.html_hidden_input( $str85$cb_handle_create_similar_legacy, fort_spec, UNPROVIDED );
                  cb_utilities.cb_help_preamble( $kw78$CB_CREATE_SIMILAR, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str86$Enter_name_for_new_term_similar_t );
                  cb_utilities.cb_form( fort, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_princ( $str87$__ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_newline( TWO_INTEGER );
                  html_utilities.html_autocomplete_text_input( $str55$new_name, $str57$, $int58$40, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_reset_input( $str53$Clear );
                  html_utilities.html_indent( UNPROVIDED );
                  html_utilities.html_submit_input( $str88$Create_Similar, $str89$create, UNPROVIDED );
                  html_utilities.html_indent( UNPROVIDED );
                  html_utilities.html_submit_input( $str90$Copy_Assertions, $str91$copy, UNPROVIDED );
                  html_utilities.html_newline( TWO_INTEGER );
                  cb_utilities.cb_doc_link( $str59$creating, $str60$Cyc_Naming_Conventions, cb_utilities.cyc_system_doc_naming_conventions(), UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str92$Check_the_assertions_from_ );
                  cb_utilities.cb_form( fort, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_princ( $str93$_which_you_wish_to_copy_as_well__ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_newline( TWO_INTEGER );
                  final SubLObject _prev_bind_0_$12 = cb_parameters.$cb_assertion_link_hook$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$13 = cb_parameters.$cb_c_gaf_arg_use_binary$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$14 = cb_parameters.$cb_c_default_content$.currentBinding( thread );
                  final SubLObject _prev_bind_4 = cb_parameters.$cb_c_suppress_body_level_elements$.currentBinding( thread );
                  try
                  {
                    cb_parameters.$cb_assertion_link_hook$.bind( $sym94$CB_CREATE_SIMILAR_CHECKBOX, thread );
                    cb_parameters.$cb_c_gaf_arg_use_binary$.bind( NIL, thread );
                    cb_parameters.$cb_c_default_content$.bind( $kw95$MAXIMAL, thread );
                    cb_parameters.$cb_c_suppress_body_level_elements$.bind( T, thread );
                    cb_frames.cb_default_content_internal( fort );
                  }
                  finally
                  {
                    cb_parameters.$cb_c_suppress_body_level_elements$.rebind( _prev_bind_4, thread );
                    cb_parameters.$cb_c_default_content$.rebind( _prev_bind_2_$14, thread );
                    cb_parameters.$cb_c_gaf_arg_use_binary$.rebind( _prev_bind_1_$13, thread );
                    cb_parameters.$cb_assertion_link_hook$.rebind( _prev_bind_0_$12, thread );
                  }
                  html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
                }
                finally
                {
                  html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                  html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                }
                html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
              }
              html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$8, thread );
            }
            html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
          }
          finally
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$7, thread );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list82 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 9375L)
  public static SubLObject cb_handle_create_similar_legacy(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str97$create_similar_facilities );
      return NIL;
    }
    final SubLObject source_fort = cb_utilities.cb_guess_fort( args.first(), UNPROVIDED );
    final SubLObject new_name = string_utilities.trim_whitespace( html_utilities.html_extract_input( $str55$new_name, args ) );
    SubLObject target_term = NIL;
    final SubLObject copy = html_utilities.html_extract_input( $str91$copy, args );
    if( NIL == forts.fort_p( source_fort ) )
    {
      return cb_utilities.cb_error( $str98$Unable_to_determine_a_term_from__, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( !new_name.isString() || new_name.equal( $str57$ ) )
    {
      return cb_utilities.cb_error( $str99$No_term_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == copy && NIL == constant_completion_high.valid_constant_name_p( new_name ) && NIL == cb_utilities.cb_guess_naut( new_name, UNPROVIDED ) )
    {
      return cb_utilities.cb_error( $str100$_S_is_not_a_valid_term_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != cb_utilities.cb_guess_naut( new_name, UNPROVIDED ) )
    {
      target_term = cb_utilities.cb_guess_naut( new_name, UNPROVIDED );
    }
    else if( NIL != copy )
    {
      final SubLObject existing_fort = cb_utilities.cb_guess_fort( new_name, UNPROVIDED );
      if( NIL == forts.fort_p( existing_fort ) )
      {
        return cb_utilities.cb_error( $str98$Unable_to_determine_a_term_from__, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      target_term = existing_fort;
    }
    else
    {
      final SubLObject exact_constant = constants_high.find_constant( new_name );
      if( NIL != exact_constant )
      {
        return cb_utilities.cb_error( $str101$Already_a_constant_named__S, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject inexact_constants = constant_completion_high.constant_complete( new_name, NIL, T, UNPROVIDED, UNPROVIDED );
      if( NIL != inexact_constants )
      {
        return cb_utilities.cb_error( $str102$Constant__S_already_exists_which_, inexact_constants.first(), new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      target_term = cb_create_hook( new_name );
    }
    if( NIL == cycl_utilities.fort_or_naut_p( target_term ) )
    {
      return cb_utilities.cb_error( $str103$Unable_to_create_a_similar_term_n, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cb_tools.cb_add_to_history( target_term );
    final SubLObject source_fort_el_formula = forts.fort_el_formula( source_fort );
    final SubLObject target_term_el_formula = ( NIL != el_utilities.el_formula_p( target_term ) ) ? target_term : forts.fort_el_formula( target_term );
    SubLObject cdolist_list_var = conses_high.nthcdr( THREE_INTEGER, args );
    SubLObject copy_spec = NIL;
    copy_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject id = reader.read_from_string_ignoring_errors( copy_spec.first(), NIL, NIL, UNPROVIDED, UNPROVIDED );
      if( id.isInteger() )
      {
        final SubLObject assertion = assertion_handles.find_assertion_by_id( id );
        if( NIL != assertion_handles.assertion_p( assertion ) )
        {
          SubLObject similar_formula = ke.ke_assertion_edit_formula( assertion );
          SubLObject mt = assertions_high.assertion_mt( assertion );
          final SubLObject strength = assertions_high.assertion_strength( assertion );
          final SubLObject direction = assertions_high.assertion_direction( assertion );
          if( NIL != list_utilities.tree_find( source_fort_el_formula, similar_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED ) || NIL != list_utilities.tree_find( source_fort_el_formula, mt, Symbols
              .symbol_function( $sym104$HLMT_EQUAL ), UNPROVIDED ) )
          {
            similar_formula = conses_high.subst( target_term_el_formula, source_fort_el_formula, similar_formula, Symbols.symbol_function( EQUAL ), UNPROVIDED );
            mt = conses_high.subst( target_term_el_formula, source_fort_el_formula, mt, Symbols.symbol_function( EQUAL ), UNPROVIDED );
            ke.ke_assert( similar_formula, mt, strength, direction );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      copy_spec = cdolist_list_var.first();
    }
    if( NIL != copy )
    {
      return cb_assertion_editor.cb_note_edit_change( $str90$Copy_Assertions, T, UNPROVIDED, UNPROVIDED );
    }
    return cb_assertion_editor.cb_note_edit_change( $str88$Create_Similar, T, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 14093L)
  public static SubLObject cb_handle_create_similar(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      if( NIL != ke.cyclist_is_guest() )
      {
        try
        {
          final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str106$error, NIL, NIL, NIL, $kw42$UNINITIALIZED );
            final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
              PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str107$_S, cyc_navigator_internals.guest_warn_string( $str97$create_similar_facilities ) );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$16, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$15, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str106$error );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
          }
        }
        return NIL;
      }
      final SubLObject new_term_name = html_utilities.html_extract_input( $str108$focalterm, args );
      SubLObject new_term = cycl_utilities.find_denotational_term( new_term_name );
      SubLObject problem_sentence_info = NIL;
      SubLObject good_sentences = NIL;
      if( NIL == new_term )
      {
        if( NIL != new_term_name && NIL == create_similar_valid_nat_nameP( new_term_name ) && NIL == constant_completion_high.valid_constant_name_p( new_term_name ) )
        {
          try
          {
            final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str109$response, NIL, NIL, NIL, $kw42$UNINITIALIZED );
              final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                try
                {
                  final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str106$error, NIL, NIL, NIL, $kw42$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                      try
                      {
                        final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str110$invalidTerm, NIL, NIL, NIL, $kw42$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                            PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str111$_S_is_not_a_valid_term_name_, new_term_name );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$23, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$22, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$22, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values2 = Values.getValuesAsVector();
                          xml_utilities.xml_end_tag_internal( $str110$invalidTerm );
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
                        }
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$21, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$21, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$20, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    xml_utilities.xml_end_tag_internal( $str106$error );
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
                  }
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$19, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$18, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values4 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str109$response );
              Values.restoreValuesFromVector( _values4 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
            }
          }
          return NIL;
        }
        if( NIL != new_term_name && NIL != constant_completion_high.constant_complete( new_term_name, NIL, T, UNPROVIDED, UNPROVIDED ) )
        {
          try
          {
            final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str109$response, NIL, NIL, NIL, $kw42$UNINITIALIZED );
              final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                try
                {
                  final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$23 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str106$error, NIL, NIL, NIL, $kw42$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                      try
                      {
                        final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$24 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str110$invalidTerm, NIL, NIL, NIL, $kw42$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                            PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str112$Constant__A_already_exists__which, constant_completion_high.constant_complete( new_term_name, NIL, T, UNPROVIDED,
                                UNPROVIDED ).first(), new_term_name );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$32, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$24, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$31, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values5 = Values.getValuesAsVector();
                          xml_utilities.xml_end_tag_internal( $str110$invalidTerm );
                          Values.restoreValuesFromVector( _values5 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
                        }
                      }
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$30, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$23, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$29, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values6 = Values.getValuesAsVector();
                    xml_utilities.xml_end_tag_internal( $str106$error );
                    Values.restoreValuesFromVector( _values6 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
                  }
                }
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$28, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$27, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values7 = Values.getValuesAsVector();
              xml_utilities.xml_terpri();
              xml_utilities.xml_end_tag_internal( $str109$response );
              Values.restoreValuesFromVector( _values7 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
            }
          }
          return NIL;
        }
        if( NIL != constant_completion_high.valid_constant_name_p( new_term_name ) )
        {
          new_term = cb_create_hook( new_term_name );
        }
        else if( NIL != new_term_name )
        {
          new_term = reader.read_from_string_ignoring_errors( string_utilities.cyclify_string( new_term_name ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      if( NIL != new_term_name && NIL == cycl_utilities.fort_or_naut_p( new_term ) )
      {
        try
        {
          final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str109$response, NIL, NIL, NIL, $kw42$UNINITIALIZED );
            final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
              try
              {
                final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str106$error, NIL, NIL, NIL, $kw42$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                    PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str113$Unable_to_create_a_term_named__S_, new_term_name );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$39, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$25, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$38, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values8 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str106$error );
                  Values.restoreValuesFromVector( _values8 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
                }
              }
              return NIL;
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$37, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$36, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values9 = Values.getValuesAsVector();
            xml_utilities.xml_end_tag_internal( $str109$response );
            Values.restoreValuesFromVector( _values9 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
          }
        }
      }
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != list_utilities.proper_list_p( arg ) )
        {
          final SubLObject param = arg.first();
          if( NIL != string_utilities.starts_with( param, $str114$sentence ) )
          {
            final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input( args, ConsesLow.list( $kw115$INPUT_NAME, param ) );
            final SubLObject sentence_num = Sequences.subseq( param, EIGHT_INTEGER, UNPROVIDED );
            if( cycl_utilities.formula_arg0( sentence ).equal( $const116$unknownSentence ) )
            {
              good_sentences = ConsesLow.cons( sentence, good_sentences );
            }
            else if( NIL != wff.el_lenient_wff_assertibleP( sentence, UNPROVIDED, UNPROVIDED ) )
            {
              good_sentences = ConsesLow.cons( sentence, good_sentences );
            }
            else
            {
              problem_sentence_info = ConsesLow.cons( ConsesLow.list( $kw117$SENTENCE_NUM, sentence_num, $kw118$SENTENCE, html_utilities.html_extract_input( param, args ) ), problem_sentence_info );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      if( NIL == problem_sentence_info )
      {
        cdolist_list_var = Sequences.nreverse( good_sentences );
        SubLObject sentence2 = NIL;
        sentence2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( cycl_utilities.formula_arg0( sentence2 ).eql( $const116$unknownSentence ) )
          {
            ke.ke_unassert( cycl_utilities.formula_arg1( sentence2, UNPROVIDED ), $const119$BaseKB );
          }
          else
          {
            ke.ke_assert( sentence2, $const119$BaseKB, UNPROVIDED, UNPROVIDED );
          }
          cdolist_list_var = cdolist_list_var.rest();
          sentence2 = cdolist_list_var.first();
        }
      }
      try
      {
        final SubLObject _prev_bind_0_$42 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str109$response, ConsesLow.list( $str120$newTermId, kb_utilities.compact_hl_external_id_string( new_term ) ), NIL, NIL, $kw42$UNINITIALIZED );
          final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
            if( NIL != problem_sentence_info )
            {
              try
              {
                final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str106$error, NIL, NIL, NIL, $kw42$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var2 = problem_sentence_info;
                    SubLObject sentence_info = NIL;
                    sentence_info = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      final SubLObject sentence3 = conses_high.getf( sentence_info, $kw118$SENTENCE, UNPROVIDED );
                      final SubLObject attrs = ConsesLow.list( $str121$id, conses_high.getf( sentence_info, $kw117$SENTENCE_NUM, UNPROVIDED ) );
                      try
                      {
                        final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str122$invalidSentence, attrs, NIL, NIL, $kw42$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                            xml_utilities.xml_cdata( format_nil.format_nil_s( sentence3 ) );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$47, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$27, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$46, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values10 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str122$invalidSentence );
                          Values.restoreValuesFromVector( _values10 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$48, thread );
                        }
                      }
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      sentence_info = cdolist_list_var2.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$45, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$26, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$44, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values11 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str106$error );
                  Values.restoreValuesFromVector( _values11 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
                }
              }
            }
            else
            {
              final SubLObject attrs2 = ConsesLow.list( $str123$count, string_utilities.to_string( Sequences.length( good_sentences ) ) );
              try
              {
                final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str124$assertionsQueued, attrs2, NIL, NIL, $kw42$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                    PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str125$_A_assertions_added_to_the_local_, Sequences.length( good_sentences ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$51, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$28, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$50, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values12 = Values.getValuesAsVector();
                  xml_utilities.xml_end_tag_internal( $str124$assertionsQueued );
                  Values.restoreValuesFromVector( _values12 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
                }
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$43, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$42, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values13 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str109$response );
          Values.restoreValuesFromVector( _values13 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$53, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 17108L)
  public static SubLObject cb_link_create_similar(final SubLObject fort, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str128$_Create_Similar_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str129$cb_create_similar__A, cb_utilities.cb_fort_identifier( fort ) );
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
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 17367L)
  public static SubLObject cb_create_similar_guest_warn()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    if( NIL != cb_html_parameters.$cb_html_warn_class$.getDynamicValue( thread ) )
    {
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( cb_html_parameters.$cb_html_warn_class$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str131$color_red__font_size_120___font_w );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( operation_communication.the_cyclist().equal( $const132$Guest ) )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str133$Sorry__ );
        cb_utilities.cb_form( operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED );
        html_utilities.html_princ( $str134$_cannot_make_assertions_using_the );
        cyc_navigator_internals.nav_link( $kw135$CB_LOGIN, NIL, NIL, $str136$login, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_princ( $str137$_using_your_real_name_now_so_that );
        html_utilities.html_br();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 17862L)
  public static SubLObject cb_similar_button_row(SubLObject id_suffix)
  {
    if( id_suffix == UNPROVIDED )
    {
      id_suffix = $str57$;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lookup_id = Sequences.cconcatenate( $str138$lookupbutton, id_suffix );
    final SubLObject assert_id = Sequences.cconcatenate( $str139$assertbutton, id_suffix );
    html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str48$button );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str140$font_size_10pt );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_princ( $str141$All_Mts );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str142$togglecheckall___ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_attribute_title$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str143$Check_All___Uncheck_All );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str48$button );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str140$font_size_10pt );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_princ( $str144$Undo );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str145$uncommit__ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str48$button );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str140$font_size_10pt );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_princ( $str146$Redo );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str147$recommit__ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str48$button );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str140$font_size_10pt );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != lookup_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( lookup_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_princ( $str148$Switch_to_Browse_Mode );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str149$togglelookupmode__ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str48$button );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_input_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str140$font_size_10pt );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != assert_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( assert_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_princ( $str150$SEND );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str151$dosubmit__ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_attribute_title$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str152$Assert_selected_sentences );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 18671L)
  public static SubLObject xml_fort_info(final SubLObject fort_spec, SubLObject content_spec)
  {
    if( content_spec == UNPROVIDED )
    {
      content_spec = $kw153$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
    final SubLObject derived_to_always_include = ( NIL != nart_handles.nart_p( fort ) ) ? narts_high.nart_dependent_assertions( fort ) : NIL;
    final SubLObject preds = fort_info_preds( fort, content_spec );
    final SubLObject max_arities = Mapping.mapcar( $sym154$MAX_ARITY, preds );
    final SubLObject max_arity = list_utilities.extremal( Sequences.remove( NIL, max_arities, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $sym155$_, UNPROVIDED );
    final SubLObject copy_term = ( NIL != constant_handles.constant_p( fort ) ) ? fort
        : constants_high.gentemp_constant( Strings.string_upcase( string_utilities.string_subst( $str57$, $str156$_, string_utilities.string_subst( $str57$, $str157$_, string_utilities.string_subst( $str158$_, $str159$_,
            cycl_utilities.denotational_term_name( fort ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED ), UNPROVIDED, UNPROVIDED ), UNPROVIDED );
    final SubLObject focal_term_name = constants_high.constant_name( copy_term );
    final SubLObject assertion_attrs = ConsesLow.list( $str160$focalTerm, focal_term_name, $str161$hlid, kb_utilities.compact_hl_external_id_string( fort ), $str162$contentspec, content_spec );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym163$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const164$EverythingPSC, thread );
      try
      {
        final SubLObject _prev_bind_0_$62 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_1_$63 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str165$assertions, assertion_attrs, NIL, NIL, $kw42$UNINITIALIZED );
          final SubLObject _prev_bind_0_$63 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
            xml_utilities.xml_terpri();
            SubLObject end_var;
            SubLObject pred_index;
            SubLObject cdolist_list_var;
            SubLObject pred;
            SubLObject pred_index_count;
            SubLObject pred_var;
            SubLObject iterator_var;
            SubLObject done_var;
            SubLObject token_var;
            SubLObject final_index_spec;
            SubLObject valid;
            SubLObject final_index_iterator;
            SubLObject done_var_$65;
            SubLObject token_var_$66;
            SubLObject v_assert;
            SubLObject valid_$67;
            SubLObject _prev_bind_0_$64;
            SubLObject _prev_bind_1_$64;
            SubLObject _prev_bind_0_$65;
            SubLObject _prev_bind_0_$66;
            SubLObject _values;
            SubLObject _prev_bind_0_$67;
            SubLObject _values2;
            for( end_var = max_arity, pred_index = NIL, pred_index = ONE_INTEGER; !pred_index.numGE( end_var ); pred_index = number_utilities.f_1X( pred_index ) )
            {
              cdolist_list_var = preds;
              pred = NIL;
              pred = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                pred_index_count = ZERO_INTEGER;
                pred_var = pred;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, pred_index, pred_var ) )
                {
                  iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, pred_index, pred_var );
                  done_var = NIL;
                  token_var = NIL;
                  while ( NIL == done_var)
                  {
                    final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                    valid = makeBoolean( !token_var.eql( final_index_spec ) );
                    if( NIL != valid )
                    {
                      final_index_iterator = NIL;
                      try
                      {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw166$GAF, NIL, NIL );
                        done_var_$65 = NIL;
                        token_var_$66 = NIL;
                        while ( NIL == done_var_$65)
                        {
                          v_assert = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$66 );
                          valid_$67 = makeBoolean( !token_var_$66.eql( v_assert ) );
                          if( NIL != valid_$67 && !pred_index_count.numG( TWENTY_INTEGER ) && ( content_spec == $kw167$ALL_INFERRED || NIL != assertions_high.asserted_assertionP( v_assert ) || NIL != subl_promotions
                              .memberP( v_assert, derived_to_always_include, UNPROVIDED, UNPROVIDED ) ) )
                          {
                            pred_index_count = Numbers.add( pred_index_count, ONE_INTEGER );
                            try
                            {
                              _prev_bind_0_$64 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                              _prev_bind_1_$64 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                              try
                              {
                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                    thread ) ), thread );
                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                xml_utilities.xml_start_tag_internal( $str168$assertion, NIL, NIL, NIL, $kw42$UNINITIALIZED );
                                _prev_bind_0_$65 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                try
                                {
                                  xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                                  cycml.cycml_serialize_mt( assertions_high.assertion_mt( v_assert ) );
                                }
                                finally
                                {
                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$65, thread );
                                }
                              }
                              finally
                              {
                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$64, thread );
                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$64, thread );
                              }
                            }
                            finally
                            {
                              _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                _values = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal( $str168$assertion );
                                Values.restoreValuesFromVector( _values );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$66, thread );
                              }
                            }
                            cycml.cycml_serialize_sentence( conses_high.subst( copy_term, fort, assertions_high.assertion_formula( v_assert ), UNPROVIDED, UNPROVIDED ) );
                          }
                          done_var_$65 = makeBoolean( NIL == valid_$67 );
                        }
                      }
                      finally
                      {
                        _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          _values2 = Values.getValuesAsVector();
                          if( NIL != final_index_iterator )
                          {
                            kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                          }
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$67, thread );
                        }
                      }
                    }
                    done_var = makeBoolean( NIL == valid );
                  }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$63, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$63, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$62, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str165$assertions );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$68, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL == constant_handles.constant_p( fort ) )
    {
      constant_handles.free_constant( copy_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 20090L)
  public static SubLObject fort_info_preds(final SubLObject fort, SubLObject content_spec)
  {
    if( content_spec == UNPROVIDED )
    {
      content_spec = $kw153$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = Sequences.nreverse( list_utilities.remove_duplicates_from_end( ConsesLow.nconc( isa.all_instances_in_all_mts( $const169$DocumentationPredicate ), conses_high.copy_list( cb_utilities
        .cb_definitional_preds_for_fort( fort ) ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    if( kb_indexing.num_gaf_arg_index( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED ).numL( $int170$100 ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym163$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const164$EverythingPSC, thread );
        final SubLObject pred_var = NIL;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw166$GAF, NIL, NIL );
                SubLObject done_var_$74 = NIL;
                final SubLObject token_var_$75 = NIL;
                while ( NIL == done_var_$74)
                {
                  final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$75 );
                  final SubLObject valid_$76 = makeBoolean( !token_var_$75.eql( v_assert ) );
                  if( NIL != valid_$76 )
                  {
                    final SubLObject item_var = cycl_utilities.formula_arg0( v_assert );
                    if( NIL == conses_high.member( item_var, preds, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      preds = ConsesLow.cons( item_var, preds );
                    }
                  }
                  done_var_$74 = makeBoolean( NIL == valid_$76 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$77, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return Sequences.nreverse( preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 20697L)
  public static SubLObject create_similar_valid_nat_nameP(final SubLObject str)
  {
    final SubLObject cyclified = string_utilities.cyclify_string( str );
    final SubLObject listy = reader.read_from_string_ignoring_errors( cyclified, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return makeBoolean( NIL == cycl_utilities.expression_find_if( $sym171$SYMBOLP, listy, UNPROVIDED, UNPROVIDED ) && NIL != term.function_termP( listy ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 20951L)
  public static SubLObject cb_create_similar(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fort_spec = args.first();
    final SubLObject content_spec = html_utilities.html_extract_sexpr( $str162$contentspec, args, $kw153$DEFAULT );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      final SubLObject title_var = $str57$;
      final SubLObject _prev_bind_0_$78 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$79 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw43$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_complete.html_complete_script();
          cyc_file_dependencies.css( $kw44$SAM_AUTOCOMPLETE_CSS );
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$80 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str46$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str47$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str48$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str49$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str50$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$82, thread );
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
              cb_create_similar_guest_warn();
              xml_fort_info( fort_spec, content_spec );
              cyc_file_dependencies.javascript( $kw172$CB_CREATE_SIMILAR_JS );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$81, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$80, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$79, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0_$78, thread );
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 21317L)
  public static SubLObject cb_link_create_similar_legacy(final SubLObject fort, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str128$_Create_Similar_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str174$cb_create_similar_legacy__A, cb_utilities.cb_fort_identifier( fort ) );
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
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 21593L)
  public static SubLObject cb_link_create_instance(final SubLObject fort, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str176$_Create_Instance_;
    }
    final SubLObject id = dhtml_macros.get_next_html_element_id();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str177$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string( fort ), id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != id )
    {
      html_utilities.html_markup( html_macros.$html_anchor_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
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
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 21950L)
  public static SubLObject cb_link_create_spec(final SubLObject fort, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str179$_Create_Spec_;
    }
    final SubLObject id = dhtml_macros.get_next_html_element_id();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str180$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string( fort ), id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != id )
    {
      html_utilities.html_markup( html_macros.$html_anchor_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
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
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 22295L)
  public static SubLObject cb_link_create_spec_mt(final SubLObject fort, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str182$_Create_Spec_Mt_;
    }
    final SubLObject id = dhtml_macros.get_next_html_element_id();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str183$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string( fort ), id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != id )
    {
      html_utilities.html_markup( html_macros.$html_anchor_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
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
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 22649L)
  public static SubLObject cb_link_create_spec_pred(final SubLObject fort, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str185$_Create_Spec_Pred_;
    }
    final SubLObject id = dhtml_macros.get_next_html_element_id();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str186$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string( fort ), id );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != id )
    {
      html_utilities.html_markup( html_macros.$html_anchor_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
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
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 23009L)
  public static SubLObject cb_create_similar_checkbox(final SubLObject assertion)
  {
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      final SubLObject id = assertion_handles.assertion_id( assertion );
      html_utilities.html_checkbox_input( id, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 23290L)
  public static SubLObject cb_rename(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str190$the_Rename_Constant_page );
    }
    else
    {
      final SubLObject constant = cb_utilities.cb_guess_constant( args );
      if( NIL == constant_handles.constant_p( constant ) )
      {
        cb_utilities.cb_error( $str191$_a_does_not_specify_a_Cyc_constan, conses_high.second( args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      final SubLObject title_var = $str192$Rename_Constant;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$83 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw43$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_complete.html_complete_script();
          cyc_file_dependencies.css( $kw44$SAM_AUTOCOMPLETE_CSS );
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$84 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str46$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str47$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str48$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str49$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str50$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$86, thread );
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
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str51$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str193$cb_handle_rename, T, UNPROVIDED );
                html_utilities.html_hidden_input( $str121$id, cb_utilities.cb_fort_identifier( constant ), UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw188$CB_RENAME, UNPROVIDED, UNPROVIDED );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str194$Enter_new_name_for_ );
                html_utilities.html_princ( constant );
                html_utilities.html_princ( $str87$__ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( TWO_INTEGER );
                html_complete.html_complete_button( $str55$new_name, $str56$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_text_input( $str55$new_name, constants_high.constant_name( constant ), $int58$40 );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_reset_input( $str195$Current_Name );
                html_utilities.html_indent( UNPROVIDED );
                html_script_utilities.html_clear_input_button( $str55$new_name, UNPROVIDED, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_submit_input( $str196$Rename, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                cb_utilities.cb_doc_link( $str197$naming, $str60$Cyc_Naming_Conventions, cb_utilities.cyc_system_doc_naming_conventions(), UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                cb_utilities.cb_doc_link( $str198$renaming, $str199$Cyc_Rename_Kill, cb_utilities.cyc_system_doc_rename_kill(), UNPROVIDED );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$87, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$85, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$84, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$83, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 24514L)
  public static SubLObject cb_handle_rename(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str198$renaming );
      return NIL;
    }
    final SubLObject id = html_utilities.html_extract_input( $str121$id, args );
    final SubLObject new_name = html_utilities.html_extract_input( $str55$new_name, args );
    final SubLObject constant = cb_utilities.cb_guess_constant( id );
    if( NIL == constant_handles.constant_p( constant ) )
    {
      cb_utilities.cb_error( $str201$Could_not_determine_a_term_from__, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( !new_name.isString() )
    {
      cb_utilities.cb_error( $str64$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL == constant_completion_high.valid_constant_name_p( new_name ) )
    {
      cb_utilities.cb_error( $str65$_S_is_not_a_valid_constant_name, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( new_name.equal( constants_high.constant_name( constant ) ) )
    {
      cb_utilities.cb_error( $str202$Name_specified_is_same_as_current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != constants_high.find_constant( new_name ) )
    {
      cb_utilities.cb_error( $str66$Already_a_constant_named__a, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      ke.ke_rename( constant, new_name );
      cb_assertion_editor.cb_note_edit_change( $str203$Constant_Rename, T, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 25336L)
  public static SubLObject cb_link_rename(final SubLObject constant, SubLObject linktext, SubLObject disabledP)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str205$_Rename_;
    }
    if( NIL != disabledP )
    {
      cb_assertion_editor.cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str206$cb_rename__A, cb_utilities.cb_fort_identifier( constant ) );
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
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 25723L)
  public static SubLObject cb_merge(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str210$the_Merge_Term_page );
    }
    else
    {
      final SubLObject fort = cb_utilities.cb_guess_fort( args, UNPROVIDED );
      if( NIL == forts.fort_p( fort ) )
      {
        cb_utilities.cb_error( $str83$_a_does_not_specify_a_Cyc_term, conses_high.second( args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      final SubLObject title_var = $str211$Merge_Term;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$88 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw43$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_complete.html_complete_script();
          cyc_file_dependencies.css( $kw44$SAM_AUTOCOMPLETE_CSS );
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$89 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str46$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str47$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str48$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str49$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str50$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$91, thread );
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
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str51$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str212$cb_handle_merge, T, UNPROVIDED );
                html_utilities.html_hidden_input( $str213$fort_spec, cb_utilities.cb_fort_identifier( fort ), UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw208$CB_MERGE, UNPROVIDED, UNPROVIDED );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str214$Merge_the_term_ );
                cb_utilities.cb_form( fort, ZERO_INTEGER, NIL );
                html_utilities.html_princ( $str215$_onto_the_existing_constant_named );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_autocomplete_text_input( $str216$target_name, $str57$, $int58$40, UNPROVIDED, UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
                html_script_utilities.html_clear_input_button( $str216$target_name, UNPROVIDED, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_submit_input( $str217$Merge, UNPROVIDED, UNPROVIDED );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$92, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$90, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$89, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$88, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 26566L)
  public static SubLObject cb_handle_merge(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str219$merging );
      return NIL;
    }
    final SubLObject fort_spec = html_utilities.html_extract_input( $str213$fort_spec, args );
    final SubLObject source_fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
    final SubLObject target_name = html_utilities.html_extract_input( $str216$target_name, args );
    if( NIL == forts.fort_p( source_fort ) )
    {
      cb_utilities.cb_error( $str201$Could_not_determine_a_term_from__, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( !target_name.isString() )
    {
      cb_utilities.cb_error( $str64$No_name_was_specified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject target_term = cb_utilities.cb_guess_fort( target_name, UNPROVIDED );
    if( NIL == forts.fort_p( target_term ) )
    {
      cb_utilities.cb_error( $str201$Could_not_determine_a_term_from__, target_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( source_fort.eql( target_term ) )
    {
      cb_utilities.cb_error( $str220$Attempt_to_merge__S_with_itself_, source_fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cb_tools.cb_rem_fort_from_all_histories( source_fort );
      ke.ke_merge( source_fort, target_term );
      cb_assertion_editor.cb_note_edit_change( $str211$Merge_Term, T, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 27430L)
  public static SubLObject cb_link_merge(final SubLObject fort, SubLObject linktext, SubLObject disabledP)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str222$_Merge_;
    }
    if( NIL != disabledP )
    {
      cb_assertion_editor.cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str223$cb_merge__A, cb_utilities.cb_fort_identifier( fort ) );
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
    }
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 27724L)
  public static SubLObject cb_kill(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str225$the_Cyc_term_kill_facility );
    }
    else
    {
      final SubLObject fort_spec = args.first();
      final SubLObject confirmed = html_utilities.html_extract_input( $str226$confirmed, args );
      final SubLObject fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
      if( NIL == forts.fort_p( fort ) )
      {
        cb_utilities.cb_error( $str83$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      cb_tools.cb_rem_fort_from_all_histories( fort );
      ke.ke_kill( fort );
      cb_assertion_editor.cb_note_edit_change( $str227$Term_Kill, T, ( NIL != confirmed ) ? THREE_INTEGER : TWO_INTEGER, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 28249L)
  public static SubLObject cb_link_kill(final SubLObject fort, SubLObject linktext, SubLObject disabledP, SubLObject not_confirmedP)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = NIL;
    }
    if( not_confirmedP == UNPROVIDED )
    {
      not_confirmedP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str229$_Kill_;
    }
    if( NIL != disabledP )
    {
      cb_assertion_editor.cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      if( NIL != not_confirmedP )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str230$cb_kill__A, cb_utilities.cb_fort_identifier( fort ) );
      }
      else
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str231$cb_kill__A_confirmed_T, cb_utilities.cb_fort_identifier( fort ) );
      }
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
    }
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 28710L)
  public static SubLObject cb_confirm_kill(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str225$the_Cyc_term_kill_facility );
    }
    else
    {
      SubLObject fort_spec = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list82 );
      fort_spec = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
        if( NIL == forts.fort_p( fort ) )
        {
          cb_utilities.cb_error( $str83$_a_does_not_specify_a_Cyc_term, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return NIL;
        }
        final SubLObject assertion_count = kb_indexing.num_index( fort );
        final SubLObject title_var = $str235$Confirm_Term_Kill;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
        try
        {
          html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
              ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
              : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
          html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
          if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$93 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
          try
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
                EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
            html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw43$CB_CYC );
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
            final SubLObject _prev_bind_0_$94 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
              html_utilities.html_markup( $str46$yui_skin_sam );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str47$reloadFrameButton );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str48$button );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str49$reload );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_princ( $str50$Refresh_Frames );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$96, thread );
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
                final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
                html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str51$post );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != frame_name_var )
                {
                  html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( frame_name_var );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding( thread );
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.$within_html_form$.bind( T, thread );
                  html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                  html_utilities.html_hidden_input( $str236$cb_kill, fort_spec, UNPROVIDED );
                  html_utilities.html_hidden_input( $str226$confirmed, $str237$T, UNPROVIDED );
                  cb_utilities.cb_help_preamble( $kw233$CB_CONFIRM_KILL, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  if( NIL == nart_handles.nart_p( fort ) )
                  {
                    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                    html_utilities.html_indent( THREE_INTEGER );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str238$NOTE__ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                    html_utilities.html_newline( UNPROVIDED );
                    html_utilities.html_princ( $str239$If_you_are_killing_this_term_to_r );
                    cb_utilities.cb_link( $kw240$RECREATE, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_princ( $str241$_page_instead_ );
                    html_utilities.html_newline( UNPROVIDED );
                  }
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_princ( $str242$Please_confirm_kill_of_ );
                  cb_utilities.cb_form( fort, UNPROVIDED, UNPROVIDED );
                  if( assertion_count.numG( ZERO_INTEGER ) )
                  {
                    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str243$_and_the_removal_of_all__S_assert, assertion_count );
                  }
                  html_utilities.html_newline( TWO_INTEGER );
                  cb_utilities.cb_back_button( $kw244$SELF, $str245$No );
                  html_utilities.html_submit_input( $str246$Yes__Kill, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_newline( TWO_INTEGER );
                  cb_utilities.cb_doc_link( $str247$killing_constants, $str199$Cyc_Rename_Kill, cb_utilities.cyc_system_doc_rename_kill(), UNPROVIDED );
                  html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
                }
                finally
                {
                  html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                  html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$97, thread );
                }
                html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_copyright_notice();
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$95, thread );
              }
              html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$94, thread );
            }
            html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
          }
          finally
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$93, thread );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list82 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 30042L)
  public static SubLObject cb_link_confirm_kill(final SubLObject fort, SubLObject linktext, SubLObject disabledP)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str229$_Kill_;
    }
    if( NIL != disabledP )
    {
      cb_assertion_editor.cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str249$cb_confirm_kill__A, cb_utilities.cb_fort_identifier( fort ) );
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
    }
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 30443L)
  public static SubLObject cb_recreate(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str253$the_Cyc_constant_recreate_facilit );
      return NIL;
    }
    SubLObject constant_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list254 );
    constant_spec = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      final SubLObject constant = cb_utilities.cb_guess_constant( constant_spec );
      if( NIL == constant_handles.constant_p( constant ) )
      {
        cb_utilities.cb_error( $str191$_a_does_not_specify_a_Cyc_constan, constant_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      final SubLObject title_var = $str255$Recreate_Constant;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$98 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw43$CB_CYC );
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
          final SubLObject _prev_bind_0_$99 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str46$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str47$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str48$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str49$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str50$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$101, thread );
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
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str51$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str256$cb_recreate_handler, constant_spec, UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw251$CB_RECREATE, UNPROVIDED, UNPROVIDED );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                final SubLObject assertion_count = kb_indexing.num_index( constant );
                html_utilities.html_princ( $str257$Please_confirm_recreation_of_ );
                cb_utilities.cb_form( constant, UNPROVIDED, UNPROVIDED );
                if( assertion_count.numG( ZERO_INTEGER ) )
                {
                  PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str243$_and_the_removal_of_all__S_assert, assertion_count );
                }
                html_utilities.html_newline( TWO_INTEGER );
                cb_utilities.cb_back_button( $kw244$SELF, $str245$No );
                html_utilities.html_submit_input( $str258$Yes__Recreate, UNPROVIDED, UNPROVIDED );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$102, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$100, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$99, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$98, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list254 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 31522L)
  public static SubLObject cb_recreate_handler(final SubLObject args)
  {
    final SubLObject id = args.first();
    final SubLObject constant = cb_utilities.cb_guess_constant( id );
    if( NIL == constant_handles.constant_p( constant ) )
    {
      cb_utilities.cb_error( $str191$_a_does_not_specify_a_Cyc_constan, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    ke.ke_recreate( constant );
    cb_assertion_editor.cb_note_edit_change( $str260$Constant_Recreate, T, THREE_INTEGER, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 31912L)
  public static SubLObject cb_link_recreate(final SubLObject constant, SubLObject linktext, SubLObject disabledP)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str262$_Recreate_;
    }
    if( NIL != disabledP )
    {
      cb_assertion_editor.cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str263$cb_recreate__A, cb_utilities.cb_fort_identifier( constant ) );
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
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 32386L)
  public static SubLObject cb_all_assertions_tms(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str267$the_Reperform_TMS_facility );
    }
    else
    {
      SubLObject fort_spec = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list82 );
      fort_spec = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
        if( NIL == forts.fort_p( fort ) )
        {
          cb_utilities.cb_error( $str191$_a_does_not_specify_a_Cyc_constan, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return NIL;
        }
        final SubLObject assertion_count = kb_indexing.num_index( fort );
        final SubLObject title_var = $str268$Confirm_Reperform_TMS_Page;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
        try
        {
          html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
              ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
              : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
          html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
          if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$103 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
          try
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
                EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
            html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw43$CB_CYC );
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
            final SubLObject _prev_bind_0_$104 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
              html_utilities.html_markup( $str46$yui_skin_sam );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str47$reloadFrameButton );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str48$button );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str49$reload );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_princ( $str50$Refresh_Frames );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$106, thread );
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
                final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
                html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str51$post );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != frame_name_var )
                {
                  html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( frame_name_var );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding( thread );
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.$within_html_form$.bind( T, thread );
                  html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                  html_utilities.html_hidden_input( $str269$cb_all_assertions_tms_handler, fort_spec, UNPROVIDED );
                  html_utilities.html_hidden_input( $str226$confirmed, $str237$T, UNPROVIDED );
                  cb_utilities.cb_help_preamble( $kw265$CB_ALL_ASSERTIONS_TMS_HANDLER, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_princ( $str270$These_operations_may_take_some_ti );
                  html_utilities.html_princ( assertion_count );
                  html_utilities.html_princ( $str271$_of_the_assertions_of_the_constan );
                  cb_utilities.cb_form( fort, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_princ( $str272$_ );
                  html_utilities.html_newline( TWO_INTEGER );
                  cb_utilities.cb_back_button( $kw244$SELF, $str245$No );
                  html_utilities.html_indent( TWO_INTEGER );
                  html_utilities.html_submit_input( $str273$Do_it_, UNPROVIDED, UNPROVIDED );
                  html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
                }
                finally
                {
                  html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                  html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$107, thread );
                }
                html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_copyright_notice();
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$105, thread );
              }
              html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$104, thread );
            }
            html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
          }
          finally
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$103, thread );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list82 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 33360L)
  public static SubLObject cb_all_assertions_tms_handler(final SubLObject args)
  {
    final SubLObject fort_spec = args.first();
    final SubLObject confirmed = html_utilities.html_extract_input( $str226$confirmed, args );
    final SubLObject fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
    if( NIL == forts.fort_p( fort ) )
    {
      cb_utilities.cb_error( $str191$_a_does_not_specify_a_Cyc_constan, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    ke.ke_tms_reconsider_term( fort, UNPROVIDED );
    cb_assertion_editor.cb_note_edit_change( $str275$Reperform_TMS_on_indexed_Assertio, T, ( NIL != confirmed ) ? THREE_INTEGER : TWO_INTEGER, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 33795L)
  public static SubLObject cb_link_all_assertions_tms(final SubLObject fort, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str277$_Force_TMS_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str278$cb_all_assertions_tms__A, cb_utilities.cb_fort_identifier( fort ) );
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
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 44689L)
  public static SubLObject cb_hypothesize_handler(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str285$Hypothesize;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$108 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw43$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw44$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$109 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str46$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str47$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str48$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str49$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str50$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$111, thread );
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
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str286$cb_hypothesize_handler, T, UNPROVIDED );
              if( NIL != args )
              {
                cb_hypothesize_results( args );
              }
              cb_utilities.cb_help_preamble( $kw283$CB_HYPOTHESIZE_HANDLER, UNPROVIDED, UNPROVIDED );
              html_utilities.html_reset_input( $str287$Reset_Values );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str285$Hypothesize, UNPROVIDED, UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              final SubLObject mt = ( NIL != forts.fort_p( $cb_last_hyp_mt$.getDynamicValue( thread ) ) ) ? $cb_last_hyp_mt$.getDynamicValue( thread ) : NIL;
              html_utilities.html_newline( UNPROVIDED );
              cb_form_widgets.cb_mt_input_section( mt, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cb_form_widgets.cb_el_sentence_input_section( ( NIL != $cb_last_hyp_formula$.getDynamicValue( thread ) ) ? $cb_last_hyp_formula$.getDynamicValue( thread ) : NIL, $list288 );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$112, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$110, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$109, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$108, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 45474L)
  public static SubLObject cb_hypothesize_results(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject mt = cb_form_widgets.cb_extract_mt_input( args, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_error = thread.secondMultipleValue();
    final SubLObject mt_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != mt_error )
    {
      return cb_form_widgets.cb_mt_error( mt_error, mt_error_string );
    }
    thread.resetMultipleValues();
    final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input( args, $list290 );
    final SubLObject sentence_error = thread.secondMultipleValue();
    final SubLObject sentence_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sentence_error )
    {
      return cb_form_widgets.cb_el_sentence_error( sentence_error, sentence_error_string, UNPROVIDED );
    }
    $cb_last_hyp_formula$.setDynamicValue( sentence, thread );
    $cb_last_hyp_mt$.setDynamicValue( mt, thread );
    final SubLObject result = cb_hypothesize_hook( $cb_last_hyp_formula$.getDynamicValue( thread ), $cb_last_hyp_mt$.getDynamicValue( thread ) );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str291$Last_hypothesis_in_ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    cb_utilities.cb_form( $cb_last_hyp_mt$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str87$__ );
    html_utilities.html_newline( UNPROVIDED );
    cb_utilities.cb_form( $cb_last_hyp_formula$.getDynamicValue( thread ), ZERO_INTEGER, T );
    html_utilities.html_newline( TWO_INTEGER );
    if( result.equal( $kw292$ERROR ) )
    {
      html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
      html_utilities.html_princ( $str293$Error_description__ );
      html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      html_macros.verify_not_within_html_pre();
      html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
      final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding( thread );
      try
      {
        html_macros.$within_html_pre$.bind( T, thread );
        html_utilities.html_newline( UNPROVIDED );
        cb_browser.cb_c_documentation_string( fi.fi_get_error_string_int() );
      }
      finally
      {
        html_macros.$within_html_pre$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str294$Hypothesis_results___ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_form( result, UNPROVIDED, UNPROVIDED );
    }
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 46611L)
  public static SubLObject cb_link_hypothesize(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str285$Hypothesize;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw73$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str286$cb_hypothesize_handler );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 46935L)
  public static SubLObject xml_assertion_info(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assert_spec = html_utilities.html_extract_input( $str299$assertionId, args );
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( html_macros.$html_stream$.getDynamicValue( thread ), thread );
      final SubLObject v_assert = cb_utilities.cb_guess_assertion( assert_spec );
      final SubLObject _prev_bind_0_$113 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym163$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const164$EverythingPSC, thread );
        try
        {
          final SubLObject _prev_bind_0_$114 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_1_$115 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str165$assertions, NIL, NIL, NIL, $kw42$UNINITIALIZED );
            final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
              xml_utilities.xml_terpri();
              try
              {
                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$116 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str168$assertion, NIL, NIL, NIL, $kw42$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw42$UNINITIALIZED, thread );
                    cycml.cycml_serialize_mt( assertions_high.assertion_mt( v_assert ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$117, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$116, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$116, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str168$assertion );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$118, thread );
                }
              }
              cycml.cycml_serialize_sentence( uncanonicalizer.assertion_el_formula( v_assert ) );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$115, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$115, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$114, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str165$assertions );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$119, thread );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$113, thread );
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 47379L)
  public static SubLObject cb_form_smart(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cycl = cb_form_widgets.cb_extract_el_sentence_input( args, $list301 );
    final SubLObject assertion = czer_meta.find_assertion_cycl( cycl, UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      if( NIL != assertion )
      {
        cb_utilities.cb_show_assertion_readably( assertion, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cb_utilities.cb_form( cycl, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_cb_editor_file()
  {
    SubLFiles.declareFunction( me, "cb_create_hook", "CB-CREATE-HOOK", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hypothesize_hook", "CB-HYPOTHESIZE-HOOK", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_term_toolbar", "CB-TERM-TOOLBAR", 1, 0, false );
    SubLFiles.declareFunction( me, "term_modification_permittedP", "TERM-MODIFICATION-PERMITTED?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_modification_forbiddenP", "TERM-MODIFICATION-FORBIDDEN?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_as_merge_source_permittedP", "TERM-AS-MERGE-SOURCE-PERMITTED?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_create", "CB-CREATE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_create", "CB-HANDLE-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_create", "CB-LINK-CREATE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_create_similar_legacy", "CB-CREATE-SIMILAR-LEGACY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_create_similar_legacy", "CB-HANDLE-CREATE-SIMILAR-LEGACY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_create_similar", "CB-HANDLE-CREATE-SIMILAR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_create_similar", "CB-LINK-CREATE-SIMILAR", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_create_similar_guest_warn", "CB-CREATE-SIMILAR-GUEST-WARN", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_similar_button_row", "CB-SIMILAR-BUTTON-ROW", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_fort_info", "XML-FORT-INFO", 1, 1, false );
    SubLFiles.declareFunction( me, "fort_info_preds", "FORT-INFO-PREDS", 1, 1, false );
    SubLFiles.declareFunction( me, "create_similar_valid_nat_nameP", "CREATE-SIMILAR-VALID-NAT-NAME?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_create_similar", "CB-CREATE-SIMILAR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_create_similar_legacy", "CB-LINK-CREATE-SIMILAR-LEGACY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_create_instance", "CB-LINK-CREATE-INSTANCE", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_create_spec", "CB-LINK-CREATE-SPEC", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_create_spec_mt", "CB-LINK-CREATE-SPEC-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_create_spec_pred", "CB-LINK-CREATE-SPEC-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_create_similar_checkbox", "CB-CREATE-SIMILAR-CHECKBOX", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rename", "CB-RENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_rename", "CB-HANDLE-RENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_rename", "CB-LINK-RENAME", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_merge", "CB-MERGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_merge", "CB-HANDLE-MERGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_merge", "CB-LINK-MERGE", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_kill", "CB-KILL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_kill", "CB-LINK-KILL", 1, 3, false );
    SubLFiles.declareFunction( me, "cb_confirm_kill", "CB-CONFIRM-KILL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_confirm_kill", "CB-LINK-CONFIRM-KILL", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_recreate", "CB-RECREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_recreate_handler", "CB-RECREATE-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_recreate", "CB-LINK-RECREATE", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_all_assertions_tms", "CB-ALL-ASSERTIONS-TMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_all_assertions_tms_handler", "CB-ALL-ASSERTIONS-TMS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_all_assertions_tms", "CB-LINK-ALL-ASSERTIONS-TMS", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_hypothesize_handler", "CB-HYPOTHESIZE-HANDLER", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_hypothesize_results", "CB-HYPOTHESIZE-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_hypothesize", "CB-LINK-HYPOTHESIZE", 0, 1, false );
    SubLFiles.declareFunction( me, "xml_assertion_info", "XML-ASSERTION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_form_smart", "CB-FORM-SMART", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_editor_file()
  {
    $merge_permitted_functions$ = SubLFiles.defparameter( "*MERGE-PERMITTED-FUNCTIONS*", $list35 );
    $cb_enable_legacy_create_similar$ = SubLFiles.defparameter( "*CB-ENABLE-LEGACY-CREATE-SIMILAR*", NIL );
    $cb_last_hyp_formula$ = SubLFiles.defparameter( "*CB-LAST-HYP-FORMULA*", NIL );
    $cb_last_hyp_mt$ = SubLFiles.defparameter( "*CB-LAST-HYP-MT*", mt_vars.$default_assert_mt$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_cb_editor_file()
  {
    Hashtables.sethash( $kw36$CB_CREATE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str37$cb_create_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym61$CB_CREATE, $kw62$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym69$CB_HANDLE_CREATE, $kw62$HTML_HANDLER );
    Hashtables.sethash( $kw70$CREATE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str71$create_tool_gif, NIL ) );
    cb_utilities.setup_cb_link_method( $kw70$CREATE, $sym75$CB_LINK_CREATE, ONE_INTEGER );
    cb_utilities.declare_deprecated_cb_tool( $kw70$CREATE, $str72$Create, $str76$Crt, $str77$Create_Bare_Cyc_Constant );
    Hashtables.sethash( $kw78$CB_CREATE_SIMILAR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str79$cb_create_similar_html, NIL ) );
    utilities_macros.register_html_state_variable( $sym80$_CB_ENABLE_LEGACY_CREATE_SIMILAR_ );
    html_macros.note_cgi_handler_function( $sym96$CB_CREATE_SIMILAR_LEGACY, $kw62$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym105$CB_HANDLE_CREATE_SIMILAR_LEGACY, $kw62$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym126$CB_HANDLE_CREATE_SIMILAR, $kw127$XML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw3$CREATE_SIMILAR, $sym130$CB_LINK_CREATE_SIMILAR, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym173$CB_CREATE_SIMILAR, $kw62$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw2$CREATE_SIMILAR_LEGACY, $sym175$CB_LINK_CREATE_SIMILAR_LEGACY, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw4$CREATE_INSTANCE, $sym178$CB_LINK_CREATE_INSTANCE, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw5$CREATE_SPEC, $sym181$CB_LINK_CREATE_SPEC, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw7$CREATE_SPEC_MT, $sym184$CB_LINK_CREATE_SPEC_MT, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw6$CREATE_SPEC_PRED, $sym187$CB_LINK_CREATE_SPEC_PRED, TWO_INTEGER );
    Hashtables.sethash( $kw188$CB_RENAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str189$cb_rename_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym200$CB_RENAME, $kw62$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym204$CB_HANDLE_RENAME, $kw62$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw8$RENAME, $sym207$CB_LINK_RENAME, THREE_INTEGER );
    Hashtables.sethash( $kw208$CB_MERGE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str209$cb_merge_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym218$CB_MERGE, $kw62$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym221$CB_HANDLE_MERGE, $kw62$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw9$MERGE, $sym224$CB_LINK_MERGE, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym228$CB_KILL, $kw62$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw11$KILL, $sym232$CB_LINK_KILL, FOUR_INTEGER );
    Hashtables.sethash( $kw233$CB_CONFIRM_KILL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str234$cb_confirm_kill_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym248$CB_CONFIRM_KILL, $kw62$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw10$CONFIRM_KILL, $sym250$CB_LINK_CONFIRM_KILL, THREE_INTEGER );
    Hashtables.sethash( $kw251$CB_RECREATE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str252$cb_recreate_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym259$CB_RECREATE, $kw62$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym261$CB_RECREATE_HANDLER, $kw62$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw240$RECREATE, $sym264$CB_LINK_RECREATE, THREE_INTEGER );
    Hashtables.sethash( $kw265$CB_ALL_ASSERTIONS_TMS_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str266$cb_all_assertions_tms_handler_htm, NIL ) );
    html_macros.note_cgi_handler_function( $sym274$CB_ALL_ASSERTIONS_TMS, $kw62$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym276$CB_ALL_ASSERTIONS_TMS_HANDLER, $kw62$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw279$ALL_ASSERTIONS_TMS, $sym280$CB_LINK_ALL_ASSERTIONS_TMS, TWO_INTEGER );
    utilities_macros.register_html_state_variable( $sym281$_CB_LAST_HYP_FORMULA_ );
    utilities_macros.register_html_state_variable( $sym282$_CB_LAST_HYP_MT_ );
    Hashtables.sethash( $kw283$CB_HYPOTHESIZE_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str284$cb_hypothesize_handler_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym289$CB_HYPOTHESIZE_HANDLER, $kw62$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw295$HYPOTHESIZE, $sym296$CB_LINK_HYPOTHESIZE, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw295$HYPOTHESIZE, $str285$Hypothesize, $str297$Hyp, $str298$Hypothesize_a_formula );
    html_macros.note_cgi_handler_function( $sym300$XML_ASSERTION_INFO, $kw127$XML_HANDLER );
    html_macros.note_cgi_handler_function( $sym302$CB_FORM_SMART, $kw62$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_editor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_editor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_editor_file();
  }
  static
  {
    me = new cb_editor();
    $merge_permitted_functions$ = null;
    $cb_enable_legacy_create_similar$ = null;
    $cb_last_hyp_formula$ = null;
    $cb_last_hyp_mt$ = null;
    $sym0$_EXIT = makeSymbol( "%EXIT" );
    $sym1$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw2$CREATE_SIMILAR_LEGACY = makeKeyword( "CREATE-SIMILAR-LEGACY" );
    $kw3$CREATE_SIMILAR = makeKeyword( "CREATE-SIMILAR" );
    $kw4$CREATE_INSTANCE = makeKeyword( "CREATE-INSTANCE" );
    $kw5$CREATE_SPEC = makeKeyword( "CREATE-SPEC" );
    $kw6$CREATE_SPEC_PRED = makeKeyword( "CREATE-SPEC-PRED" );
    $kw7$CREATE_SPEC_MT = makeKeyword( "CREATE-SPEC-MT" );
    $kw8$RENAME = makeKeyword( "RENAME" );
    $kw9$MERGE = makeKeyword( "MERGE" );
    $kw10$CONFIRM_KILL = makeKeyword( "CONFIRM-KILL" );
    $kw11$KILL = makeKeyword( "KILL" );
    $kw12$KB_MONITOR_INDEX_HOOK = makeKeyword( "KB-MONITOR-INDEX-HOOK" );
    $kw13$LEXIFY_TERM = makeKeyword( "LEXIFY-TERM" );
    $kw14$TTT_TEST = makeKeyword( "TTT-TEST" );
    $str15$_Take_Test_ = makeString( "[Take Test]" );
    $kw16$KCT_TEST = makeKeyword( "KCT-TEST" );
    $kw17$KBQ_ASK = makeKeyword( "KBQ-ASK" );
    $kw18$KBQ_ASK_IN_PROOF_CHECKER = makeKeyword( "KBQ-ASK-IN-PROOF-CHECKER" );
    $kw19$KCT_TEST_SET = makeKeyword( "KCT-TEST-SET" );
    $kw20$KCT_EDIT = makeKeyword( "KCT-EDIT" );
    $kw21$KBQ_EDIT = makeKeyword( "KBQ-EDIT" );
    $kw22$SYNTACTIC_NODE_TOOLKIT = makeKeyword( "SYNTACTIC-NODE-TOOLKIT" );
    $kw23$NOREG = makeKeyword( "NOREG" );
    $kw24$SKSI_REGISTER = makeKeyword( "SKSI-REGISTER" );
    $kw25$PARTIAL = makeKeyword( "PARTIAL" );
    $kw26$SKSI_DEREGISTER = makeKeyword( "SKSI-DEREGISTER" );
    $kw27$REG = makeKeyword( "REG" );
    $kw28$EDIT_IN_SMT = makeKeyword( "EDIT-IN-SMT" );
    $const29$Ontology = constant_handles.reader_make_constant_shell( makeString( "Ontology" ) );
    $kw30$CB_OWL_EXPORT_XML = makeKeyword( "CB-OWL-EXPORT-XML" );
    $str31$_OWL_Export_ = makeString( "[OWL Export]" );
    $list32 = ConsesLow.list( makeString( ":type" ), makeKeyword( "ONTOLOGY" ) );
    $str33$_ontology = makeString( ":ontology" );
    $const34$ReservedConstant = constant_handles.reader_make_constant_shell( makeString( "ReservedConstant" ) );
    $list35 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn-Ternary" ) ), constant_handles.reader_make_constant_shell( makeString( "ProperSubcollectionNamedFn-Ternary" ) ),
        constant_handles.reader_make_constant_shell( makeString( "CityNamedFn" ) ), constant_handles.reader_make_constant_shell( makeString( "PersonNamedFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "PlaceNamedFn" ) ), constant_handles.reader_make_constant_shell( makeString( "PredicateNamedFn" ) ), constant_handles.reader_make_constant_shell( makeString( "StreetNamedFn" ) ), constant_handles
                .reader_make_constant_shell( makeString( "OrganizationNamedFn" ) ) );
    $kw36$CB_CREATE = makeKeyword( "CB-CREATE" );
    $str37$cb_create_html = makeString( "cb-create.html" );
    $str38$the_Create_Constant_page = makeString( "the Create Constant page" );
    $str39$Create_Constant = makeString( "Create Constant" );
    $str40$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str41$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw42$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw43$CB_CYC = makeKeyword( "CB-CYC" );
    $kw44$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw45$SHA1 = makeKeyword( "SHA1" );
    $str46$yui_skin_sam = makeString( "yui-skin-sam" );
    $str47$reloadFrameButton = makeString( "reloadFrameButton" );
    $str48$button = makeString( "button" );
    $str49$reload = makeString( "reload" );
    $str50$Refresh_Frames = makeString( "Refresh Frames" );
    $str51$post = makeString( "post" );
    $str52$cb_handle_create = makeString( "cb-handle-create" );
    $str53$Clear = makeString( "Clear" );
    $str54$Enter_name_for_new_constant___ = makeString( "Enter name for new constant : " );
    $str55$new_name = makeString( "new-name" );
    $str56$Complete = makeString( "Complete" );
    $str57$ = makeString( "" );
    $int58$40 = makeInteger( 40 );
    $str59$creating = makeString( "creating" );
    $str60$Cyc_Naming_Conventions = makeString( "Cyc Naming Conventions" );
    $sym61$CB_CREATE = makeSymbol( "CB-CREATE" );
    $kw62$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str63$Creating = makeString( "Creating" );
    $str64$No_name_was_specified = makeString( "No name was specified" );
    $str65$_S_is_not_a_valid_constant_name = makeString( "~S is not a valid constant name" );
    $str66$Already_a_constant_named__a = makeString( "Already a constant named ~a" );
    $str67$Constant_Create = makeString( "Constant Create" );
    $str68$Unable_to_create_a_constant_named = makeString( "Unable to create a constant named ~S" );
    $sym69$CB_HANDLE_CREATE = makeSymbol( "CB-HANDLE-CREATE" );
    $kw70$CREATE = makeKeyword( "CREATE" );
    $str71$create_tool_gif = makeString( "create-tool.gif" );
    $str72$Create = makeString( "Create" );
    $kw73$MAIN = makeKeyword( "MAIN" );
    $str74$cb_create = makeString( "cb-create" );
    $sym75$CB_LINK_CREATE = makeSymbol( "CB-LINK-CREATE" );
    $str76$Crt = makeString( "Crt" );
    $str77$Create_Bare_Cyc_Constant = makeString( "Create Bare Cyc Constant" );
    $kw78$CB_CREATE_SIMILAR = makeKeyword( "CB-CREATE-SIMILAR" );
    $str79$cb_create_similar_html = makeString( "cb-create-similar.html" );
    $sym80$_CB_ENABLE_LEGACY_CREATE_SIMILAR_ = makeSymbol( "*CB-ENABLE-LEGACY-CREATE-SIMILAR*" );
    $str81$the_Create_Similar_Term_page = makeString( "the Create Similar Term page" );
    $list82 = ConsesLow.list( makeSymbol( "FORT-SPEC" ) );
    $str83$_a_does_not_specify_a_Cyc_term = makeString( "~a does not specify a Cyc term" );
    $str84$Create_Similar_Term = makeString( "Create Similar Term" );
    $str85$cb_handle_create_similar_legacy = makeString( "cb-handle-create-similar-legacy" );
    $str86$Enter_name_for_new_term_similar_t = makeString( "Enter name for new term similar to " );
    $str87$__ = makeString( " :" );
    $str88$Create_Similar = makeString( "Create Similar" );
    $str89$create = makeString( "create" );
    $str90$Copy_Assertions = makeString( "Copy Assertions" );
    $str91$copy = makeString( "copy" );
    $str92$Check_the_assertions_from_ = makeString( "Check the assertions from " );
    $str93$_which_you_wish_to_copy_as_well__ = makeString( " which you wish to copy as well: " );
    $sym94$CB_CREATE_SIMILAR_CHECKBOX = makeSymbol( "CB-CREATE-SIMILAR-CHECKBOX" );
    $kw95$MAXIMAL = makeKeyword( "MAXIMAL" );
    $sym96$CB_CREATE_SIMILAR_LEGACY = makeSymbol( "CB-CREATE-SIMILAR-LEGACY" );
    $str97$create_similar_facilities = makeString( "create similar facilities" );
    $str98$Unable_to_determine_a_term_from__ = makeString( "Unable to determine a term from ~S" );
    $str99$No_term_was_specified = makeString( "No term was specified" );
    $str100$_S_is_not_a_valid_term_name = makeString( "~S is not a valid term name" );
    $str101$Already_a_constant_named__S = makeString( "Already a constant named ~S" );
    $str102$Constant__S_already_exists_which_ = makeString( "Constant ~S already exists which differs from ~S only by case" );
    $str103$Unable_to_create_a_similar_term_n = makeString( "Unable to create a similar term named ~S" );
    $sym104$HLMT_EQUAL = makeSymbol( "HLMT-EQUAL" );
    $sym105$CB_HANDLE_CREATE_SIMILAR_LEGACY = makeSymbol( "CB-HANDLE-CREATE-SIMILAR-LEGACY" );
    $str106$error = makeString( "error" );
    $str107$_S = makeString( "~S" );
    $str108$focalterm = makeString( "focalterm" );
    $str109$response = makeString( "response" );
    $str110$invalidTerm = makeString( "invalidTerm" );
    $str111$_S_is_not_a_valid_term_name_ = makeString( "~S is not a valid term name." );
    $str112$Constant__A_already_exists__which = makeString( "Constant ~A already exists, which differs from ~S only by case." );
    $str113$Unable_to_create_a_term_named__S_ = makeString( "Unable to create a term named ~S." );
    $str114$sentence = makeString( "sentence" );
    $kw115$INPUT_NAME = makeKeyword( "INPUT-NAME" );
    $const116$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $kw117$SENTENCE_NUM = makeKeyword( "SENTENCE-NUM" );
    $kw118$SENTENCE = makeKeyword( "SENTENCE" );
    $const119$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $str120$newTermId = makeString( "newTermId" );
    $str121$id = makeString( "id" );
    $str122$invalidSentence = makeString( "invalidSentence" );
    $str123$count = makeString( "count" );
    $str124$assertionsQueued = makeString( "assertionsQueued" );
    $str125$_A_assertions_added_to_the_local_ = makeString( "~A assertions added to the local queue." );
    $sym126$CB_HANDLE_CREATE_SIMILAR = makeSymbol( "CB-HANDLE-CREATE-SIMILAR" );
    $kw127$XML_HANDLER = makeKeyword( "XML-HANDLER" );
    $str128$_Create_Similar_ = makeString( "[Create Similar]" );
    $str129$cb_create_similar__A = makeString( "cb-create-similar&~A" );
    $sym130$CB_LINK_CREATE_SIMILAR = makeSymbol( "CB-LINK-CREATE-SIMILAR" );
    $str131$color_red__font_size_120___font_w = makeString( "color:red; font-size:120%; font-weight:700" );
    $const132$Guest = constant_handles.reader_make_constant_shell( makeString( "Guest" ) );
    $str133$Sorry__ = makeString( "Sorry, " );
    $str134$_cannot_make_assertions_using_the = makeString( " cannot make assertions using the tool.   Please " );
    $kw135$CB_LOGIN = makeKeyword( "CB-LOGIN" );
    $str136$login = makeString( "login" );
    $str137$_using_your_real_name_now_so_that = makeString( " using your real name now so that you can make assertions using this tool." );
    $str138$lookupbutton = makeString( "lookupbutton" );
    $str139$assertbutton = makeString( "assertbutton" );
    $str140$font_size_10pt = makeString( "font-size:10pt" );
    $str141$All_Mts = makeString( "All Mts" );
    $str142$togglecheckall___ = makeString( "togglecheckall();" );
    $str143$Check_All___Uncheck_All = makeString( "Check All / Uncheck All" );
    $str144$Undo = makeString( "Undo" );
    $str145$uncommit__ = makeString( "uncommit()" );
    $str146$Redo = makeString( "Redo" );
    $str147$recommit__ = makeString( "recommit()" );
    $str148$Switch_to_Browse_Mode = makeString( "Switch to Browse Mode" );
    $str149$togglelookupmode__ = makeString( "togglelookupmode()" );
    $str150$SEND = makeString( "SEND" );
    $str151$dosubmit__ = makeString( "dosubmit()" );
    $str152$Assert_selected_sentences = makeString( "Assert selected sentences" );
    $kw153$DEFAULT = makeKeyword( "DEFAULT" );
    $sym154$MAX_ARITY = makeSymbol( "MAX-ARITY" );
    $sym155$_ = makeSymbol( ">" );
    $str156$_ = makeString( ")" );
    $str157$_ = makeString( "(" );
    $str158$_ = makeString( "_" );
    $str159$_ = makeString( " " );
    $str160$focalTerm = makeString( "focalTerm" );
    $str161$hlid = makeString( "hlid" );
    $str162$contentspec = makeString( "contentspec" );
    $sym163$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const164$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str165$assertions = makeString( "assertions" );
    $kw166$GAF = makeKeyword( "GAF" );
    $kw167$ALL_INFERRED = makeKeyword( "ALL-INFERRED" );
    $str168$assertion = makeString( "assertion" );
    $const169$DocumentationPredicate = constant_handles.reader_make_constant_shell( makeString( "DocumentationPredicate" ) );
    $int170$100 = makeInteger( 100 );
    $sym171$SYMBOLP = makeSymbol( "SYMBOLP" );
    $kw172$CB_CREATE_SIMILAR_JS = makeKeyword( "CB-CREATE-SIMILAR-JS" );
    $sym173$CB_CREATE_SIMILAR = makeSymbol( "CB-CREATE-SIMILAR" );
    $str174$cb_create_similar_legacy__A = makeString( "cb-create-similar-legacy&~A" );
    $sym175$CB_LINK_CREATE_SIMILAR_LEGACY = makeSymbol( "CB-LINK-CREATE-SIMILAR-LEGACY" );
    $str176$_Create_Instance_ = makeString( "[Create Instance]" );
    $str177$javascript_startCreate___A_____A_ = makeString( "javascript:startCreate('~A', '~A', 'instance');" );
    $sym178$CB_LINK_CREATE_INSTANCE = makeSymbol( "CB-LINK-CREATE-INSTANCE" );
    $str179$_Create_Spec_ = makeString( "[Create Spec]" );
    $str180$javascript_startCreate___A_____A_ = makeString( "javascript:startCreate('~A', '~A', 'spec');" );
    $sym181$CB_LINK_CREATE_SPEC = makeSymbol( "CB-LINK-CREATE-SPEC" );
    $str182$_Create_Spec_Mt_ = makeString( "[Create Spec Mt]" );
    $str183$javascript_startCreate___A_____A_ = makeString( "javascript:startCreate('~A', '~A', 'spec-mt');" );
    $sym184$CB_LINK_CREATE_SPEC_MT = makeSymbol( "CB-LINK-CREATE-SPEC-MT" );
    $str185$_Create_Spec_Pred_ = makeString( "[Create Spec Pred]" );
    $str186$javascript_startCreate___A_____A_ = makeString( "javascript:startCreate('~A', '~A', 'spec-pred');" );
    $sym187$CB_LINK_CREATE_SPEC_PRED = makeSymbol( "CB-LINK-CREATE-SPEC-PRED" );
    $kw188$CB_RENAME = makeKeyword( "CB-RENAME" );
    $str189$cb_rename_html = makeString( "cb-rename.html" );
    $str190$the_Rename_Constant_page = makeString( "the Rename Constant page" );
    $str191$_a_does_not_specify_a_Cyc_constan = makeString( "~a does not specify a Cyc constant" );
    $str192$Rename_Constant = makeString( "Rename Constant" );
    $str193$cb_handle_rename = makeString( "cb-handle-rename" );
    $str194$Enter_new_name_for_ = makeString( "Enter new name for " );
    $str195$Current_Name = makeString( "Current Name" );
    $str196$Rename = makeString( "Rename" );
    $str197$naming = makeString( "naming" );
    $str198$renaming = makeString( "renaming" );
    $str199$Cyc_Rename_Kill = makeString( "Cyc Rename/Kill" );
    $sym200$CB_RENAME = makeSymbol( "CB-RENAME" );
    $str201$Could_not_determine_a_term_from__ = makeString( "Could not determine a term from ~S" );
    $str202$Name_specified_is_same_as_current = makeString( "Name specified is same as current name" );
    $str203$Constant_Rename = makeString( "Constant Rename" );
    $sym204$CB_HANDLE_RENAME = makeSymbol( "CB-HANDLE-RENAME" );
    $str205$_Rename_ = makeString( "[Rename]" );
    $str206$cb_rename__A = makeString( "cb-rename&~A" );
    $sym207$CB_LINK_RENAME = makeSymbol( "CB-LINK-RENAME" );
    $kw208$CB_MERGE = makeKeyword( "CB-MERGE" );
    $str209$cb_merge_html = makeString( "cb-merge.html" );
    $str210$the_Merge_Term_page = makeString( "the Merge Term page" );
    $str211$Merge_Term = makeString( "Merge Term" );
    $str212$cb_handle_merge = makeString( "cb-handle-merge" );
    $str213$fort_spec = makeString( "fort-spec" );
    $str214$Merge_the_term_ = makeString( "Merge the term " );
    $str215$_onto_the_existing_constant_named = makeString( " onto the existing constant named :" );
    $str216$target_name = makeString( "target-name" );
    $str217$Merge = makeString( "Merge" );
    $sym218$CB_MERGE = makeSymbol( "CB-MERGE" );
    $str219$merging = makeString( "merging" );
    $str220$Attempt_to_merge__S_with_itself_ = makeString( "Attempt to merge ~S with itself." );
    $sym221$CB_HANDLE_MERGE = makeSymbol( "CB-HANDLE-MERGE" );
    $str222$_Merge_ = makeString( "[Merge]" );
    $str223$cb_merge__A = makeString( "cb-merge&~A" );
    $sym224$CB_LINK_MERGE = makeSymbol( "CB-LINK-MERGE" );
    $str225$the_Cyc_term_kill_facility = makeString( "the Cyc term kill facility" );
    $str226$confirmed = makeString( "confirmed" );
    $str227$Term_Kill = makeString( "Term Kill" );
    $sym228$CB_KILL = makeSymbol( "CB-KILL" );
    $str229$_Kill_ = makeString( "[Kill]" );
    $str230$cb_kill__A = makeString( "cb-kill&~A" );
    $str231$cb_kill__A_confirmed_T = makeString( "cb-kill&~A|confirmed=T" );
    $sym232$CB_LINK_KILL = makeSymbol( "CB-LINK-KILL" );
    $kw233$CB_CONFIRM_KILL = makeKeyword( "CB-CONFIRM-KILL" );
    $str234$cb_confirm_kill_html = makeString( "cb-confirm-kill.html" );
    $str235$Confirm_Term_Kill = makeString( "Confirm Term Kill" );
    $str236$cb_kill = makeString( "cb-kill" );
    $str237$T = makeString( "T" );
    $str238$NOTE__ = makeString( "NOTE: " );
    $str239$If_you_are_killing_this_term_to_r = makeString( "If you are killing this term to remove its assertions and start again from scratch, please go to the " );
    $kw240$RECREATE = makeKeyword( "RECREATE" );
    $str241$_page_instead_ = makeString( " page instead." );
    $str242$Please_confirm_kill_of_ = makeString( "Please confirm kill of " );
    $str243$_and_the_removal_of_all__S_assert = makeString( " and the removal of all ~S assertions involving it." );
    $kw244$SELF = makeKeyword( "SELF" );
    $str245$No = makeString( "No" );
    $str246$Yes__Kill = makeString( "Yes, Kill" );
    $str247$killing_constants = makeString( "killing constants" );
    $sym248$CB_CONFIRM_KILL = makeSymbol( "CB-CONFIRM-KILL" );
    $str249$cb_confirm_kill__A = makeString( "cb-confirm-kill&~A" );
    $sym250$CB_LINK_CONFIRM_KILL = makeSymbol( "CB-LINK-CONFIRM-KILL" );
    $kw251$CB_RECREATE = makeKeyword( "CB-RECREATE" );
    $str252$cb_recreate_html = makeString( "cb-recreate.html" );
    $str253$the_Cyc_constant_recreate_facilit = makeString( "the Cyc constant recreate facility" );
    $list254 = ConsesLow.list( makeSymbol( "CONSTANT-SPEC" ) );
    $str255$Recreate_Constant = makeString( "Recreate Constant" );
    $str256$cb_recreate_handler = makeString( "cb-recreate-handler" );
    $str257$Please_confirm_recreation_of_ = makeString( "Please confirm recreation of " );
    $str258$Yes__Recreate = makeString( "Yes, Recreate" );
    $sym259$CB_RECREATE = makeSymbol( "CB-RECREATE" );
    $str260$Constant_Recreate = makeString( "Constant Recreate" );
    $sym261$CB_RECREATE_HANDLER = makeSymbol( "CB-RECREATE-HANDLER" );
    $str262$_Recreate_ = makeString( "[Recreate]" );
    $str263$cb_recreate__A = makeString( "cb-recreate&~A" );
    $sym264$CB_LINK_RECREATE = makeSymbol( "CB-LINK-RECREATE" );
    $kw265$CB_ALL_ASSERTIONS_TMS_HANDLER = makeKeyword( "CB-ALL-ASSERTIONS-TMS-HANDLER" );
    $str266$cb_all_assertions_tms_handler_htm = makeString( "cb-all-assertions-tms-handler.html" );
    $str267$the_Reperform_TMS_facility = makeString( "the Reperform TMS facility" );
    $str268$Confirm_Reperform_TMS_Page = makeString( "Confirm Reperform TMS Page" );
    $str269$cb_all_assertions_tms_handler = makeString( "cb-all-assertions-tms-handler" );
    $str270$These_operations_may_take_some_ti = makeString( "These operations may take some time.  Please confirm that you really want to force TMS for all " );
    $str271$_of_the_assertions_of_the_constan = makeString( " of the assertions of the constant " );
    $str272$_ = makeString( "." );
    $str273$Do_it_ = makeString( "Do it!" );
    $sym274$CB_ALL_ASSERTIONS_TMS = makeSymbol( "CB-ALL-ASSERTIONS-TMS" );
    $str275$Reperform_TMS_on_indexed_Assertio = makeString( "Reperform TMS on indexed Assertions" );
    $sym276$CB_ALL_ASSERTIONS_TMS_HANDLER = makeSymbol( "CB-ALL-ASSERTIONS-TMS-HANDLER" );
    $str277$_Force_TMS_ = makeString( "[Force TMS]" );
    $str278$cb_all_assertions_tms__A = makeString( "cb-all-assertions-tms&~A" );
    $kw279$ALL_ASSERTIONS_TMS = makeKeyword( "ALL-ASSERTIONS-TMS" );
    $sym280$CB_LINK_ALL_ASSERTIONS_TMS = makeSymbol( "CB-LINK-ALL-ASSERTIONS-TMS" );
    $sym281$_CB_LAST_HYP_FORMULA_ = makeSymbol( "*CB-LAST-HYP-FORMULA*" );
    $sym282$_CB_LAST_HYP_MT_ = makeSymbol( "*CB-LAST-HYP-MT*" );
    $kw283$CB_HYPOTHESIZE_HANDLER = makeKeyword( "CB-HYPOTHESIZE-HANDLER" );
    $str284$cb_hypothesize_handler_html = makeString( "cb-hypothesize-handler.html" );
    $str285$Hypothesize = makeString( "Hypothesize" );
    $str286$cb_hypothesize_handler = makeString( "cb-hypothesize-handler" );
    $str287$Reset_Values = makeString( "Reset Values" );
    $list288 = ConsesLow.list( new SubLObject[] { makeKeyword( "INPUT-NAME" ), makeString( "sentence" ), makeKeyword( "COMPLETE-LABEL" ), makeString( "Complete" ), makeKeyword( "CYCLIFY-LABEL" ), makeString( "Cyclify" ),
      makeKeyword( "CLEAR-LABEL" ), makeString( "Clear Sentence" ), makeKeyword( "HEIGHT" ), TEN_INTEGER, makeKeyword( "WIDTH" ), makeInteger( 80 )
    } );
    $sym289$CB_HYPOTHESIZE_HANDLER = makeSymbol( "CB-HYPOTHESIZE-HANDLER" );
    $list290 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "sentence" ) );
    $str291$Last_hypothesis_in_ = makeString( "Last hypothesis in " );
    $kw292$ERROR = makeKeyword( "ERROR" );
    $str293$Error_description__ = makeString( "Error description: " );
    $str294$Hypothesis_results___ = makeString( "Hypothesis results : " );
    $kw295$HYPOTHESIZE = makeKeyword( "HYPOTHESIZE" );
    $sym296$CB_LINK_HYPOTHESIZE = makeSymbol( "CB-LINK-HYPOTHESIZE" );
    $str297$Hyp = makeString( "Hyp" );
    $str298$Hypothesize_a_formula = makeString( "Hypothesize a formula" );
    $str299$assertionId = makeString( "assertionId" );
    $sym300$XML_ASSERTION_INFO = makeSymbol( "XML-ASSERTION-INFO" );
    $list301 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "cycl" ) );
    $sym302$CB_FORM_SMART = makeSymbol( "CB-FORM-SMART" );
  }
}
/*
 * 
 * Total time: 2602 ms
 * 
 */