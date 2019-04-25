package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.pragma_induction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_assertion_editor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_assertion_editor";
  public static final String myFingerPrint = "a1ed74a3ab51f817df50c54ad64b2debba88c7c3c2511fc4d23e25d3097847b8";
  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLSymbol $dtp_cb_assertion_spec$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 46403L)
  private static SubLSymbol $cb_assert_modes_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 91641L)
  private static SubLSymbol $cb_proof_checker_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 96799L)
  private static SubLSymbol $cb_strength_input_default_name$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 97018L)
  private static SubLSymbol $cb_direction_input_default_name$;
  private static final SubLSymbol $sym0$CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING;
  private static final SubLSymbol $sym1$CB_ASSERTION_SPEC;
  private static final SubLSymbol $sym2$CB_ASSERTION_SPEC_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym8$CB_ASSERTION_SPEC_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$ASSERTION_SPEC_SENTENCE;
  private static final SubLSymbol $sym11$_CSETF_ASSERTION_SPEC_SENTENCE;
  private static final SubLSymbol $sym12$ASSERTION_SPEC_MT;
  private static final SubLSymbol $sym13$_CSETF_ASSERTION_SPEC_MT;
  private static final SubLSymbol $sym14$ASSERTION_SPEC_STRENGTH;
  private static final SubLSymbol $sym15$_CSETF_ASSERTION_SPEC_STRENGTH;
  private static final SubLSymbol $sym16$ASSERTION_SPEC_DIRECTION;
  private static final SubLSymbol $sym17$_CSETF_ASSERTION_SPEC_DIRECTION;
  private static final SubLSymbol $sym18$ASSERTION_SPEC_UNASSERTS;
  private static final SubLSymbol $sym19$_CSETF_ASSERTION_SPEC_UNASSERTS;
  private static final SubLSymbol $sym20$ASSERTION_SPEC_METAS;
  private static final SubLSymbol $sym21$_CSETF_ASSERTION_SPEC_METAS;
  private static final SubLSymbol $kw22$SENTENCE;
  private static final SubLSymbol $kw23$MT;
  private static final SubLSymbol $kw24$STRENGTH;
  private static final SubLSymbol $kw25$DIRECTION;
  private static final SubLSymbol $kw26$UNASSERTS;
  private static final SubLSymbol $kw27$METAS;
  private static final SubLString $str28$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw29$BEGIN;
  private static final SubLSymbol $sym30$MAKE_CB_ASSERTION_SPEC;
  private static final SubLSymbol $kw31$SLOT;
  private static final SubLSymbol $kw32$END;
  private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_CB_ASSERTION_SPEC_METHOD;
  private static final SubLInteger $int34$2000;
  private static final SubLString $str35$_a_operation_was_added_to_queue;
  private static final SubLString $str36$_a_operation_completed;
  private static final SubLSymbol $kw37$CB_WFF_CHECK_FORMULA;
  private static final SubLString $str38$cb_wff_check_formula_html;
  private static final SubLSymbol $sym39$STACK_P;
  private static final SubLSymbol $kw40$IO_MODE;
  private static final SubLSymbol $kw41$NL;
  private static final SubLSymbol $kw42$VIOLATIONS;
  private static final SubLString $str43$Sentence_not_Well_Formed;
  private static final SubLString $str44$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str45$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw46$UNINITIALIZED;
  private static final SubLSymbol $kw47$CB_CYC;
  private static final SubLSymbol $kw48$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw49$SHA1;
  private static final SubLString $str50$yui_skin_sam;
  private static final SubLString $str51$reloadFrameButton;
  private static final SubLString $str52$button;
  private static final SubLString $str53$reload;
  private static final SubLString $str54$Refresh_Frames;
  private static final SubLString $str55$Mt___;
  private static final SubLString $str56$Sentence___;
  private static final SubLString $str57$Repairs___;
  private static final SubLString $str58$No_repairs_available___Could_not_;
  private static final SubLString $str59$Explanation__;
  private static final SubLString $str60$wff_explain;
  private static final SubLString $str61$Stack_of_pending_assertions_depen;
  private static final SubLString $str62$__in_;
  private static final SubLSymbol $sym63$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const64$EverythingPSC;
  private static final SubLSymbol $sym65$ASSERTED_ASSERTION_;
  private static final SubLString $str66$The_fact_;
  private static final SubLString $str67$_must_be_added_to_;
  private static final SubLString $str68$_in_order_for_the_above_sentence_;
  private static final SubLSymbol $kw69$REPAIR_AND_REATTEMPT;
  private static final SubLSymbol $sym70$ASSERTION_MT;
  private static final SubLSymbol $sym71$GENERALITY_ESTIMATE;
  private static final SubLString $str72$That_fact_is_already_asserted_in_;
  private static final SubLString $str73$_;
  private static final SubLString $str74$You_can_repair_this_by_doing_eith;
  private static final SubLString $str75$1__Lifting_the_assertion_to_;
  private static final SubLString $str76$2__Asserting_it_in_;
  private static final SubLString $str77$_as_well;
  private static final SubLString $str78$You_can_repair_this_by_doing_the_;
  private static final SubLString $str79$Asserting_it_in_;
  private static final SubLString $str80$_must_be_lifted_to_;
  private static final SubLString $str81$It_is_currently_asserted_in_the_f;
  private static final SubLString $str82$_Make_this_repair_and_then_reatte;
  private static final SubLSymbol $kw83$SELF;
  private static final SubLString $str84$cb_repair_and_reattempt__A__A;
  private static final SubLSymbol $sym85$CB_LINK_REPAIR_AND_REATTEMPT;
  private static final SubLString $str86$the_Cyc_KB_editing_facilities;
  private static final SubLList $list87;
  private static final SubLString $str88$Repair_and_assert_operations_comp;
  private static final SubLSymbol $sym89$CB_REPAIR_AND_REATTEMPT;
  private static final SubLSymbol $kw90$HTML_HANDLER;
  private static final SubLSymbol $kw91$CB_AF;
  private static final SubLString $str92$cb_af_html;
  private static final SubLSymbol $kw93$SHOW_ENGLISH;
  private static final SubLSymbol $kw94$SHOW_EL_FORMULA;
  private static final SubLSymbol $kw95$WFF_ASSERTION;
  private static final SubLSymbol $kw96$FIND_SIMILAR_ASSERTION;
  private static final SubLSymbol $kw97$CHANGE_MT;
  private static final SubLSymbol $kw98$CHANGE_STRENGTH;
  private static final SubLSymbol $kw99$CHANGE_DIRECTION;
  private static final SubLSymbol $kw100$CHANGE_META_ASSERTION_MT;
  private static final SubLSymbol $kw101$RENAME_VARIABLES;
  private static final SubLSymbol $kw102$ASSERT_SIMILAR;
  private static final SubLSymbol $kw103$ASSERT_META;
  private static final SubLSymbol $kw104$SUGGEST_PRAGMAS;
  private static final SubLSymbol $kw105$FIX_TYPO;
  private static final SubLSymbol $kw106$EDIT_ASSERTION;
  private static final SubLSymbol $kw107$REASSERT;
  private static final SubLSymbol $kw108$UNASSERT;
  private static final SubLSymbol $kw109$BLAST;
  private static final SubLSymbol $kw110$ASSERTION_PROOF_VIEW;
  private static final SubLSymbol $kw111$ANTECEDENT_QUERY;
  private static final SubLString $str112$_Query_Antecedent_;
  private static final SubLSymbol $kw113$RULE_KNOWN_EXTENT_QUERY;
  private static final SubLString $str114$_Known_Extent_;
  private static final SubLSymbol $kw115$RULE_UNKNOWN_EXTENT_QUERY;
  private static final SubLString $str116$_Unknown_Extent_;
  private static final SubLSymbol $kw117$TRIGGER_TEST;
  private static final SubLString $str118$_Trigger_Test_;
  private static final SubLSymbol $kw119$ASSERTION_SIMILAR_QUERY;
  private static final SubLSymbol $kw120$ASSERT_TMS;
  private static final SubLSymbol $kw121$JUSTIFY;
  private static final SubLSymbol $kw122$ASSERTION_DEPENDENCIES;
  private static final SubLSymbol $kw123$RECANONICALIZE;
  private static final SubLSymbol $kw124$REPROPAGATE;
  private static final SubLSymbol $kw125$REPROPAGATE_BROWSABLY;
  private static final SubLSymbol $kw126$TEST_GEN_TEMPLATE;
  private static final SubLSymbol $kw127$USE_IN_PROOF;
  private static final SubLSymbol $kw128$USE_IN_PLAN_CHECKING;
  private static final SubLSymbol $kw129$REINFORCE_RULE;
  private static final SubLObject $const130$InferenceRelatedBookkeepingPredic;
  private static final SubLSymbol $kw131$CB_CHANGE_MT;
  private static final SubLString $str132$cb_change_mt_html;
  private static final SubLString $str133$the_Change_Assertion_Mt_page;
  private static final SubLList $list134;
  private static final SubLString $str135$Change_Assertion_Mt;
  private static final SubLString $str136$post;
  private static final SubLString $str137$cb_handle_change_mt;
  private static final SubLString $str138$id;
  private static final SubLSymbol $kw139$RED;
  private static final SubLString $str140$Note___This_assertion_has_meta_as;
  private static final SubLList $list141;
  private static final SubLString $str142$Abort_Edit;
  private static final SubLString $str143$Current_Value;
  private static final SubLString $str144$Change_Mt;
  private static final SubLSymbol $sym145$CB_CHANGE_MT;
  private static final SubLString $str146$To_change_Mt_of_all_meta_assertio;
  private static final SubLString $str147$move_all_meta_assertions;
  private static final SubLString $str148$t;
  private static final SubLString $str149$Change_the_Mt_of_all_meta_asserti;
  private static final SubLString $str150$change_microtheory;
  private static final SubLString $str151$Assertion_is_already_in__S;
  private static final SubLString $str152$preserve_;
  private static final SubLSymbol $sym153$CB_HANDLE_CHANGE_MT;
  private static final SubLString $str154$_Change_Mt_;
  private static final SubLString $str155$cb_change_mt__a;
  private static final SubLSymbol $sym156$CB_LINK_CHANGE_MT;
  private static final SubLSymbol $kw157$CB_CHANGE_STRENGTH;
  private static final SubLString $str158$cb_change_strength_html;
  private static final SubLString $str159$the_Change_Assertion_Strength_pag;
  private static final SubLString $str160$Change_Assertion_Strength;
  private static final SubLString $str161$cb_handle_change_strength;
  private static final SubLString $str162$Choose_a_new_truth_strength__;
  private static final SubLString $str163$strength;
  private static final SubLString $str164$_default;
  private static final SubLSymbol $kw165$DEFAULT;
  private static final SubLString $str166$Default;
  private static final SubLString $str167$_monotonic;
  private static final SubLSymbol $kw168$MONOTONIC;
  private static final SubLString $str169$Monotonic;
  private static final SubLString $str170$Change_Strength;
  private static final SubLSymbol $sym171$CB_CHANGE_STRENGTH;
  private static final SubLString $str172$change_strength;
  private static final SubLList $list173;
  private static final SubLString $str174$_a_was_not_a_microtheory;
  private static final SubLSymbol $sym175$CB_HANDLE_CHANGE_STRENGTH;
  private static final SubLString $str176$_Change_Strength_;
  private static final SubLString $str177$cb_change_strength__a;
  private static final SubLSymbol $sym178$CB_LINK_CHANGE_STRENGTH;
  private static final SubLSymbol $kw179$CB_CHANGE_DIRECTION;
  private static final SubLString $str180$cb_change_direction_html;
  private static final SubLString $str181$the_Change_Assertion_Direction_pa;
  private static final SubLString $str182$Change_Assertion_Direction;
  private static final SubLString $str183$cb_handle_change_direction;
  private static final SubLString $str184$Choose_a_direction__;
  private static final SubLString $str185$direction;
  private static final SubLString $str186$_backward;
  private static final SubLSymbol $kw187$BACKWARD;
  private static final SubLString $str188$Backward;
  private static final SubLString $str189$_forward;
  private static final SubLSymbol $kw190$FORWARD;
  private static final SubLString $str191$Forward;
  private static final SubLString $str192$Change_Direction;
  private static final SubLSymbol $sym193$CB_CHANGE_DIRECTION;
  private static final SubLString $str194$direction_changes;
  private static final SubLString $str195$shoehorn_;
  private static final SubLString $str196$_a_does_not_specify_a_valid_direc;
  private static final SubLObject $const197$cyclistNotes;
  private static final SubLString $str198$This_rule_was_shoehorned_forward_;
  private static final SubLString $str199$_by_;
  private static final SubLSymbol $sym200$CB_HANDLE_CHANGE_DIRECTION;
  private static final SubLString $str201$_Change_Direction_;
  private static final SubLString $str202$cb_change_direction__a;
  private static final SubLSymbol $sym203$CB_LINK_CHANGE_DIRECTION;
  private static final SubLSymbol $kw204$CB_CHANGE_META_ASSERTION_MT;
  private static final SubLString $str205$cb_change_meta_assertion_mt_html;
  private static final SubLString $str206$Change_Meta_Assertions_Mt;
  private static final SubLString $str207$cb_handle_change_meta_assertion_m;
  private static final SubLString $str208$Change_the_Mt_of_Meta_Assertions_;
  private static final SubLString $str209$change_meta_;
  private static final SubLString $str210$Choose_the_meta_assertions__;
  private static final SubLSymbol $sym211$CB_CHANGE_META_ASSERTION_MT;
  private static final SubLSymbol $sym212$CB_HANDLE_CHANGE_META_ASSERTION_MT;
  private static final SubLString $str213$_Change_Meta_Assertions_Mt_;
  private static final SubLString $str214$cb_change_meta_assertion_mt__a;
  private static final SubLSymbol $sym215$CB_LINK_CHANGE_META_ASSERTION_MT;
  private static final SubLSymbol $kw216$CB_RENAME_VARIABLES;
  private static final SubLString $str217$cb_rename_variables_html;
  private static final SubLString $str218$the_facility_to_rename_variables;
  private static final SubLString $str219$Rename_Assertion_Variables;
  private static final SubLString $str220$cb_handle_rename_variables;
  private static final SubLString $str221$Rename_the_variables_of_the_asser;
  private static final SubLString $str222$Note__;
  private static final SubLString $str223$Variables_listed_in_;
  private static final SubLString $str224$red;
  private static final SubLString $str225$_have_invalid_variable_names___Va;
  private static final SubLSymbol $kw226$LEFT;
  private static final SubLSymbol $kw227$TOP;
  private static final SubLString $str228$Current_Variable;
  private static final SubLString $str229$Changed_Variable;
  private static final SubLString $str230$Rename_Variables;
  private static final SubLString $str231$rename;
  private static final SubLSymbol $sym232$CB_RENAME_VARIABLES;
  private static final SubLString $str233$No_variables_were_specified_to_be;
  private static final SubLList $list234;
  private static final SubLString $str235$The_proposed_rename_may_change_th;
  private static final SubLString $str236$Yes;
  private static final SubLString $str237$continue;
  private static final SubLString $str238$No;
  private static final SubLSymbol $kw239$EDIT;
  private static final SubLSymbol $sym240$CB_HANDLE_RENAME_VARIABLES;
  private static final SubLList $list241;
  private static final SubLList $list242;
  private static final SubLString $str243$_;
  private static final SubLString $str244$;
  private static final SubLString $str245$Invalid_Variables;
  private static final SubLString $str246$Back;
  private static final SubLString $str247$The_following_variables_have_inva;
  private static final SubLSymbol $sym248$STR;
  private static final SubLString $str249$__;
  private static final SubLString $str250$__and_;
  private static final SubLString $str251$Valid_variables_must_satisfy_the_;
  private static final SubLString $str252$_Rename_Variables_;
  private static final SubLString $str253$cb_rename_variables__a;
  private static final SubLSymbol $sym254$CB_LINK_RENAME_VARIABLES;
  private static final SubLString $str255$the_facility_to_repropagate_forwa;
  private static final SubLString $str256$Forward_Assertion_Repropagation;
  private static final SubLString $str257$_a_does_not_specify_an_assertion;
  private static final SubLSymbol $sym258$CB_REPROPAGATE;
  private static final SubLString $str259$_Repropagate_;
  private static final SubLString $str260$cb_repropagate__a;
  private static final SubLSymbol $sym261$CB_LINK_REPROPAGATE;
  private static final SubLString $str262$the_facility_to_repropagate_and_b;
  private static final SubLString $str263$Forward_repropagation_complete___;
  private static final SubLSymbol $sym264$CB_REPROPAGATE_BROWSABLY;
  private static final SubLString $str265$_Repropagate_and_Browse_;
  private static final SubLString $str266$cb_repropagate_browsably__a;
  private static final SubLSymbol $sym267$CB_LINK_REPROPAGATE_BROWSABLY;
  private static final SubLString $str268$the_facility_to_recanonicalize_an;
  private static final SubLString $str269$_S_did_not_specify_an_assertion_;
  private static final SubLString $str270$Assertion_is_already_canonical;
  private static final SubLString $str271$Recanonicalize_Assertion;
  private static final SubLSymbol $sym272$CB_RECANONICALIZE;
  private static final SubLString $str273$_Recanonicalize_;
  private static final SubLString $str274$cb_recanonicalize__a;
  private static final SubLSymbol $sym275$CB_LINK_RECANONICALIZE;
  private static final SubLSymbol $kw276$CB_WFF;
  private static final SubLString $str277$cb_wff_html;
  private static final SubLString $str278$WFF_Check_Sentence;
  private static final SubLString $str279$cb_handle_wff;
  private static final SubLString $str280$Clear;
  private static final SubLObject $const281$UniversalVocabularyMt;
  private static final SubLList $list282;
  private static final SubLSymbol $sym283$CB_WFF;
  private static final SubLString $str284$WFF_Check;
  private static final SubLSymbol $kw285$MAIN;
  private static final SubLString $str286$cb_wff;
  private static final SubLSymbol $kw287$WFF;
  private static final SubLSymbol $sym288$CB_LINK_WFF;
  private static final SubLString $str289$WFF;
  private static final SubLString $str290$Check_a_CycL_Expression_for_well_;
  private static final SubLSymbol $sym291$CB_HANDLE_WFF;
  private static final SubLList $list292;
  private static final SubLString $str293$Sentence_is_Well_Formed;
  private static final SubLString $str294$WFF_Status___;
  private static final SubLString $str295$OK;
  private static final SubLList $list296;
  private static final SubLSymbol $sym297$CB_ASSERT;
  private static final SubLString $str298$assertions;
  private static final SubLString $str299$wff_check;
  private static final SubLString $str300$assertion_queue;
  private static final SubLSymbol $kw301$BROWSE;
  private static final SubLString $str302$Forward_propagation_complete___Br;
  private static final SubLSymbol $kw303$NOW;
  private static final SubLString $str304$EL_Sentence_Assert;
  private static final SubLSymbol $sym305$CB_HANDLE_ASSERT;
  private static final SubLSymbol $kw306$ASSERT;
  private static final SubLString $str307$assert_tool_gif;
  private static final SubLString $str308$Assert;
  private static final SubLString $str309$cb_assert;
  private static final SubLSymbol $sym310$CB_LINK_ASSERT;
  private static final SubLString $str311$Asrt;
  private static final SubLString $str312$Assert_CycL_Expression;
  private static final SubLSymbol $kw313$CB_ASSERT_INTERNAL;
  private static final SubLString $str314$cb_assert_internal_html;
  private static final SubLString $str315$Fatal_Error;
  private static final SubLString $str316$cb_assert_called_without_a_valid_;
  private static final SubLList $list317;
  private static final SubLSymbol $kw318$META;
  private static final SubLString $str319$Please_use_;
  private static final SubLString $str320$_to_refer_to_the_following_assert;
  private static final SubLString $str321$Reset_All_Fields;
  private static final SubLString $str322$assert;
  private static final SubLSymbol $kw323$SIMILAR;
  private static final SubLString $str324$_local;
  private static final SubLSymbol $kw325$LOCAL;
  private static final SubLString $str326$Assert_using_Local_queue;
  private static final SubLString $str327$_browse;
  private static final SubLString $str328$Assert_now_and_browse_forward_inf;
  private static final SubLString $str329$_now;
  private static final SubLString $str330$Assert_now__bypassing_Local_queue;
  private static final SubLString $str331$cb_assert_parameters;
  private static final SubLString $str332$Show;
  private static final SubLString $str333$Hide;
  private static final SubLString $str334$Assert_Context;
  private static final SubLSymbol $kw335$INVISIBLE;
  private static final SubLSymbol $kw336$PARAGRAPH;
  private static final SubLSymbol $kw337$EDIT_ONLY;
  private static final SubLSymbol $kw338$EDIT_ALLOWED_;
  private static final SubLSymbol $kw339$MONAD_CHOICES;
  private static final SubLList $list340;
  private static final SubLSymbol $kw341$ANYTIME_PSC_ALLOWED_;
  private static final SubLSymbol $kw342$INPUT_NAME;
  private static final SubLString $str343$sentence;
  private static final SubLSymbol $kw344$COMPLETE_LABEL;
  private static final SubLString $str345$Complete;
  private static final SubLSymbol $kw346$CYCLIFY_LABEL;
  private static final SubLString $str347$Cyclify;
  private static final SubLSymbol $kw348$CLEAR_LABEL;
  private static final SubLString $str349$Clear_Sentence;
  private static final SubLSymbol $kw350$HEIGHT;
  private static final SubLSymbol $kw351$WIDTH;
  private static final SubLInteger $int352$80;
  private static final SubLSymbol $kw353$MODE;
  private static final SubLSymbol $kw354$CHOICES;
  private static final SubLList $list355;
  private static final SubLString $str356$cb_handle_fix_typo;
  private static final SubLString $str357$cb_handle_edit;
  private static final SubLString $str358$cb_handle_sentence_edit;
  private static final SubLString $str359$Choose_analogous_meta_assertions_;
  private static final SubLObject $const360$assertionOriginalText;
  private static final SubLString $str361$_a_S;
  private static final SubLObject $const362$TheAssertionSentence;
  private static final SubLSymbol $sym363$STRINGP;
  private static final SubLString $str364$_S_did_not_specify_a_microtheory_;
  private static final SubLString $str365$_S_is_not_a_microtheory_;
  private static final SubLObject $const366$Microtheory;
  private static final SubLString $str367$Bad_sentence__probably_due_to_a_m;
  private static final SubLList $list368;
  private static final SubLObject $const369$ist;
  private static final SubLSymbol $sym370$CB_ASSERT_FORMULA;
  private static final SubLObject $const371$BaseKB;
  private static final SubLString $str372$_Assert_Formula_;
  private static final SubLString $str373$cb_assert_formula__A__A;
  private static final SubLSymbol $kw374$ASSERT_FORMULA;
  private static final SubLSymbol $sym375$CB_LINK_ASSERT_FORMULA;
  private static final SubLSymbol $sym376$CB_SIMILAR;
  private static final SubLString $str377$_Assert_Similar_;
  private static final SubLString $str378$cb_similar__a;
  private static final SubLSymbol $sym379$CB_LINK_ASSERT_SIMILAR;
  private static final SubLSymbol $sym380$CB_ASSERT_META;
  private static final SubLString $str381$editing;
  private static final SubLString $str382$The_sentence_did_not_mention__S_;
  private static final SubLString $str383$EL_Meta_Sentence_Assert;
  private static final SubLSymbol $sym384$CB_HANDLE_ASSERT_META;
  private static final SubLString $str385$_Assert_Meta_;
  private static final SubLString $str386$cb_assert_meta__a;
  private static final SubLSymbol $sym387$CB_LINK_ASSERT_META;
  private static final SubLSymbol $sym388$CB_SUGGEST_PRAGMAS;
  private static final SubLString $str389$_Suggest_Pragmas_;
  private static final SubLString $str390$cb_suggest_pragmas__a;
  private static final SubLSymbol $sym391$CB_LINK_SUGGEST_PRAGMAS;
  private static final SubLString $str392$Suggested_Pragmas;
  private static final SubLSymbol $kw393$CB_SUGGEST_PRAGMAS;
  private static final SubLString $str394$Pragmatic_requirements_worth_cons;
  private static final SubLObject $const395$pragmaticRequirement;
  private static final SubLSymbol $kw396$ASSERT_SUGGESTED_PRAGMA;
  private static final SubLString $str397$_Assert_;
  private static final SubLSymbol $kw398$NBSP;
  private static final SubLString $str399$cb_assert_suggested_pragma__a__a;
  private static final SubLSymbol $sym400$CB_LINK_ASSERT_SUGGESTED_PRAGMA;
  private static final SubLList $list401;
  private static final SubLSymbol $sym402$CB_ASSERT_SUGGESTED_PRAGMA;
  private static final SubLSymbol $sym403$CLET;
  private static final SubLList $list404;
  private static final SubLSymbol $sym405$CB_EDIT;
  private static final SubLString $str406$Assertion_Edit;
  private static final SubLSymbol $sym407$CB_HANDLE_EDIT;
  private static final SubLList $list408;
  private static final SubLString $str409$_Edit_;
  private static final SubLString $str410$cb_edit__a;
  private static final SubLSymbol $sym411$CB_LINK_EDIT_ASSERTION;
  private static final SubLString $str412$error;
  private static final SubLString $str413$_S;
  private static final SubLString $str414$assertion_editing_facilities;
  private static final SubLSymbol $sym415$_EXIT;
  private static final SubLString $str416$oldAssertionId;
  private static final SubLSymbol $kw417$SENTENCE_NUM;
  private static final SubLSymbol $kw418$MESSAGE;
  private static final SubLString $str419$response;
  private static final SubLSymbol $kw420$NOT_WELL_FORMED;
  private static final SubLString $str421$invalidSentence;
  private static final SubLString $str422$message;
  private static final SubLString $str423$count;
  private static final SubLString $str424$assertionsQueued;
  private static final SubLString $str425$_A_assertion_P_added_to_the_local;
  private static final SubLList $list426;
  private static final SubLString $str427$unassertedQueued;
  private static final SubLString $str428$_A_unassert__P_added_to_the_local;
  private static final SubLSymbol $sym429$CB_HANDLE_EDIT_ASSERTION;
  private static final SubLSymbol $kw430$XML_HANDLER;
  private static final SubLString $str431$_S_did_not_specify_a_CycL_sentenc;
  private static final SubLSymbol $sym432$CB_HANDLE_SENTENCE_EDIT;
  private static final SubLString $str433$the_Cyc_KB_typo_fixing_facilities;
  private static final SubLSymbol $sym434$CB_FIX_TYPO_EDIT;
  private static final SubLString $str435$_Fix_Typo_;
  private static final SubLString $str436$cb_fix_typo_edit__a;
  private static final SubLSymbol $sym437$CB_LINK_FIX_TYPO;
  private static final SubLSymbol $sym438$CYCL_STRING_P;
  private static final SubLString $str439$Edited_sentence_does_not_differ_o;
  private static final SubLSymbol $sym440$CB_HANDLE_FIX_TYPO;
  private static final SubLString $str441$Reassert;
  private static final SubLSymbol $sym442$CB_REASSERT;
  private static final SubLString $str443$_Reassert_;
  private static final SubLString $str444$cb_reassert__a;
  private static final SubLSymbol $sym445$CB_LINK_REASSERT;
  private static final SubLString $str446$Unassert;
  private static final SubLSymbol $sym447$CB_UNASSERT;
  private static final SubLString $str448$_Unassert_;
  private static final SubLString $str449$cb_unassert__a;
  private static final SubLSymbol $sym450$CB_LINK_UNASSERT;
  private static final SubLString $str451$Assertion_Blast;
  private static final SubLSymbol $sym452$CB_BLAST;
  private static final SubLString $str453$_Blast_;
  private static final SubLString $str454$cb_blast__a;
  private static final SubLSymbol $sym455$CB_LINK_BLAST;
  private static final SubLList $list456;
  private static final SubLString $str457$_a_does_not_specify_a_deduction;
  private static final SubLString $str458$Deduction_Removal;
  private static final SubLSymbol $sym459$CB_REMOVE_DEDUCTION;
  private static final SubLString $str460$_Remove_Deduction_;
  private static final SubLString $str461$cb_remove_deduction__a;
  private static final SubLSymbol $kw462$REMOVE_DEDUCTION;
  private static final SubLSymbol $sym463$CB_LINK_REMOVE_DEDUCTION;
  private static final SubLString $str464$Redo_TMS_for_Assertion;
  private static final SubLSymbol $sym465$CB_ASSERTION_TMS;
  private static final SubLString $str466$_Redo_TMS_;
  private static final SubLString $str467$cb_assertion_tms__a;
  private static final SubLSymbol $sym468$CB_LINK_ASSERT_TMS;
  private static final SubLSymbol $kw469$CB_DIAGNOSE_ASSERTION;
  private static final SubLString $str470$cb_diagnose_assertion_html;
  private static final SubLString $str471$the_Assertion_Diagnostics_page;
  private static final SubLString $str472$_a_does_not_specify_a_Cyc_asserti;
  private static final SubLString $str473$Assertion_Diagnostics;
  private static final SubLString $str474$Diagnosis_of__;
  private static final SubLSymbol $sym475$CB_DIAGNOSE_ASSERTION;
  private static final SubLString $str476$_Run_Diagnostics_;
  private static final SubLString $str477$cb_diagnose_assertion__A;
  private static final SubLSymbol $kw478$DIAGNOSE_ASSERTION;
  private static final SubLSymbol $sym479$CB_LINK_DIAGNOSE_ASSERTION;
  private static final SubLSymbol $sym480$SUPPORT_P;
  private static final SubLSymbol $sym481$RULE_ASSERTION_;
  private static final SubLString $str482$cb_trigger_test__a__a;
  private static final SubLString $str483$cb_trigger_test__a;
  private static final SubLString $str484$cb_trigger_test;
  private static final SubLSymbol $sym485$CB_LINK_TRIGGER_TEST;
  private static final SubLList $list486;
  private static final SubLString $str487$the_Trigger_Test_page;
  private static final SubLSymbol $sym488$CB_TRIGGER_TEST;
  private static final SubLObject $const489$InferencePSC;
  private static final SubLString $str490$Trigger_Test_Results;
  private static final SubLSymbol $kw491$CB_TRIGGER_TEST;
  private static final SubLString $str492$Results_of_triggering__;
  private static final SubLString $str493$_Retrigger_;
  private static final SubLString $str494$against_rule__;
  private static final SubLString $str495$No_results_;
  private static final SubLString $str496$One_Conclusion;
  private static final SubLString $str497$Conclusions__;
  private static final SubLString $str498$_total_;
  private static final SubLString $str499$Justification;
  private static final SubLList $list500;
  private static final SubLSymbol $kw501$OPAQUE;
  private static final SubLString $str502$just;
  private static final SubLString $str503$Trigger_Test_Setup;
  private static final SubLString $str504$Support_to_trigger__;
  private static final SubLString $str505$Please_select_a_rule_to_trigger__;
  private static final SubLString $str506$_Trigger_;
  private static final SubLString $str507$There_are_currently_no_rules_in_y;
  private static final SubLString $str508$Rule_to_trigger__;
  private static final SubLString $str509$Please_select_a_support_to_trigge;
  private static final SubLString $str510$There_are_currently_no_supports_i;
  private static final SubLString $str511$Time_to_implement_cb_trigger_test;
  private static final SubLSymbol $sym512$_CB_PROOF_CHECKER_RULES_;
  private static final SubLSymbol $sym513$VALID_ASSERTION;
  private static final SubLString $str514$Assertion_specified_was_not_a_rul;
  private static final SubLString $str515$Rule_has_been_added_to_proof_chec;
  private static final SubLSymbol $sym516$CB_USE_IN_PROOF;
  private static final SubLSymbol $sym517$ASSERTION_P;
  private static final SubLString $str518$_Use_in_Proof_;
  private static final SubLString $str519$cb_use_in_proof__a;
  private static final SubLSymbol $sym520$CB_LINK_USE_IN_PROOF;
  private static final SubLString $str521$_a_does_not_specify_a_rule;
  private static final SubLSymbol $sym522$CB_REINFORCE_RULE;
  private static final SubLString $str523$_Reinforce_;
  private static final SubLString $str524$cb_reinforce_rule__a;
  private static final SubLSymbol $sym525$CB_LINK_REINFORCE_RULE;
  private static final SubLInteger $int526$100;
  private static final SubLSymbol $kw527$STRENGTH_INPUT_NAME;
  private static final SubLSymbol $kw528$DIRECTION_INPUT_NAME;
  private static final SubLString $str529$Strength__;
  private static final SubLString $str530$_default_strength;
  private static final SubLString $str531$_monotonic_strength;
  private static final SubLString $str532$Direction__;
  private static final SubLString $str533$_;
  private static final SubLString $str534$_;
  private static final SubLSymbol $kw535$CONTENT;
  private static final SubLString $str536$cb_assertion_graph__A;
  private static final SubLSymbol $kw537$ASSERTION_GRAPH;
  private static final SubLSymbol $sym538$CB_LINK_ASSERTION_GRAPH;
  private static final SubLSymbol $sym539$CB_ASSERTION_GRAPH;
  private static final SubLString $str540$Graph_of_an_assertion;
  private static final SubLString $str541$Refresh;
  private static final SubLString $str542$reloadCurrentFrame__reloadFrameBu;
  private static final SubLString $str543$Graph_for_;
  private static final SubLString $str544$Rule_Graph;
  private static final SubLString $str545$Unknown_Graph;
  private static final SubLString $str546$_a;
  private static final SubLInteger $int547$30;
  private static final SubLSymbol $kw548$BUILDER_FN;
  private static final SubLSymbol $sym549$BBF_RULE;
  private static final SubLSymbol $kw550$ASSERTIONS;
  private static final SubLInteger $int551$800;
  private static final SubLInteger $int552$600;
  private static final SubLSymbol $kw553$SIGNATURE;

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 750L)
  public static SubLObject cb_change_mt_hook(final SubLObject assertion, final SubLObject new_mt, SubLObject meta_assertions_to_preserve)
  {
    if( meta_assertions_to_preserve == UNPROVIDED )
    {
      meta_assertions_to_preserve = NIL;
    }
    cb_tools.cb_rem_from_assertion_history( assertion );
    return ke.ke_change_assertion_mt( assertion, new_mt, meta_assertions_to_preserve );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1009L)
  public static SubLObject cb_change_strength_hook(final SubLObject assertion, final SubLObject strength)
  {
    return ke.ke_change_assertion_strength( assertion, strength );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1122L)
  public static SubLObject cb_change_direction_hook(final SubLObject assertion, final SubLObject direction)
  {
    return ke.ke_change_assertion_direction( assertion, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1239L)
  public static SubLObject cb_repropagate_hook(final SubLObject assertion)
  {
    return ke.ke_repropagate_assertion( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1326L)
  public static SubLObject cb_repropagate_browsably_hook(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$browse_forward_inferencesP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = forward.$forward_inference_browsing_callback$.currentBinding( thread );
    final SubLObject _prev_bind_3 = forward.$forward_inference_browsing_callback_more_infoP$.currentBinding( thread );
    try
    {
      control_vars.$browse_forward_inferencesP$.bind( T, thread );
      forward.$forward_inference_browsing_callback$.bind( $sym0$CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING, thread );
      forward.$forward_inference_browsing_callback_more_infoP$.bind( T, thread );
      cb_forward_inference_browser.prepare_to_browse_new_forward_inference( assertion );
      result = ke.ke_repropagate_assertion_now( assertion );
      cb_forward_inference_browser.cleanup_from_browsing_new_forward_inference();
    }
    finally
    {
      forward.$forward_inference_browsing_callback_more_infoP$.rebind( _prev_bind_3, thread );
      forward.$forward_inference_browsing_callback$.rebind( _prev_bind_2, thread );
      control_vars.$browse_forward_inferencesP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1618L)
  public static SubLObject cb_recanonicalize_hook(final SubLObject assertion, SubLObject meta_assertions_to_preserve)
  {
    if( meta_assertions_to_preserve == UNPROVIDED )
    {
      meta_assertions_to_preserve = NIL;
    }
    cb_tools.cb_rem_from_assertion_history( assertion );
    cb_tools.cb_add_sentence_in_mt_to_assertion_history( fi.assertion_fi_ist_formula( assertion, UNPROVIDED ), NIL );
    return ke.ke_recanonicalize_assertion( assertion, meta_assertions_to_preserve );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1909L)
  public static SubLObject cb_rename_variables_hook(final SubLObject assertion, final SubLObject rename_variable_alist)
  {
    return ke.ke_rename_variables( uncanonicalizer.assertion_el_formula( assertion ), rename_variable_alist, assertions_high.assertion_mt( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 2088L)
  public static SubLObject cb_edit_assertion_hook(final SubLObject assertion, final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject meta_assertions_to_preserve,
      SubLObject sentence_string_to_preserve)
  {
    if( meta_assertions_to_preserve == UNPROVIDED )
    {
      meta_assertions_to_preserve = NIL;
    }
    if( sentence_string_to_preserve == UNPROVIDED )
    {
      sentence_string_to_preserve = NIL;
    }
    SubLObject result = NIL;
    cb_tools.cb_rem_from_assertion_history( assertion );
    cb_tools.cb_add_sentence_in_mt_to_assertion_history( sentence, mt );
    if( NIL != meta_assertions_to_preserve )
    {
      result = ke.ke_edit_assertion_preserving_meta_assertions( assertion, meta_assertions_to_preserve, sentence, mt, strength, direction );
    }
    else
    {
      result = ke.ke_edit_assertion( assertion, sentence, mt, strength, direction );
    }
    if( NIL != result && sentence_string_to_preserve.isString() )
    {
      ke.ke_add_assertion_original_text( sentence, mt, sentence_string_to_preserve, UNPROVIDED );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 2772L)
  public static SubLObject cb_null_edit_assertion_hook(final SubLObject assertion)
  {
    if( NIL != assertions_high.asserted_assertionP( assertion ) )
    {
      return cb_recanonicalize_hook( assertion, assertion_utilities.meta_assertion_list_for_editing( assertion ) );
    }
    return ke.ke_reassert_assertion( assertion, assertions_high.assertion_strength( assertion ), assertions_high.assertion_direction( assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3072L)
  public static SubLObject cb_edit_assertion_strings_hook(final SubLObject assertion, final SubLObject sentence, SubLObject meta_assertions_to_preserve)
  {
    if( meta_assertions_to_preserve == UNPROVIDED )
    {
      meta_assertions_to_preserve = NIL;
    }
    cb_tools.cb_rem_from_assertion_history( assertion );
    return ke.ke_edit_assertion_strings( assertion, sentence, meta_assertions_to_preserve );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject cb_assertion_spec_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject cb_assertion_spec_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cb_assertion_spec_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject assertion_spec_sentence(final SubLObject v_object)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject assertion_spec_mt(final SubLObject v_object)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject assertion_spec_strength(final SubLObject v_object)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject assertion_spec_direction(final SubLObject v_object)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject assertion_spec_unasserts(final SubLObject v_object)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject assertion_spec_metas(final SubLObject v_object)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject _csetf_assertion_spec_sentence(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject _csetf_assertion_spec_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject _csetf_assertion_spec_strength(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject _csetf_assertion_spec_direction(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject _csetf_assertion_spec_unasserts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject _csetf_assertion_spec_metas(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_assertion_spec_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject make_cb_assertion_spec(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cb_assertion_spec_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw22$SENTENCE ) )
      {
        _csetf_assertion_spec_sentence( v_new, current_value );
      }
      else if( pcase_var.eql( $kw23$MT ) )
      {
        _csetf_assertion_spec_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw24$STRENGTH ) )
      {
        _csetf_assertion_spec_strength( v_new, current_value );
      }
      else if( pcase_var.eql( $kw25$DIRECTION ) )
      {
        _csetf_assertion_spec_direction( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$UNASSERTS ) )
      {
        _csetf_assertion_spec_unasserts( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$METAS ) )
      {
        _csetf_assertion_spec_metas( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject visit_defstruct_cb_assertion_spec(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym30$MAKE_CB_ASSERTION_SPEC, SIX_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw22$SENTENCE, assertion_spec_sentence( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw23$MT, assertion_spec_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw24$STRENGTH, assertion_spec_strength( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw25$DIRECTION, assertion_spec_direction( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw26$UNASSERTS, assertion_spec_unasserts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw27$METAS, assertion_spec_metas( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym30$MAKE_CB_ASSERTION_SPEC, SIX_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
  public static SubLObject visit_defstruct_object_cb_assertion_spec_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cb_assertion_spec( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 4107L)
  public static SubLObject new_cb_assertion_spec(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction, SubLObject unasserts, SubLObject metas)
  {
    if( strength == UNPROVIDED )
    {
      strength = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( unasserts == UNPROVIDED )
    {
      unasserts = NIL;
    }
    if( metas == UNPROVIDED )
    {
      metas = NIL;
    }
    return make_cb_assertion_spec( ConsesLow.list( new SubLObject[] { $kw22$SENTENCE, sentence, $kw23$MT, mt, $kw24$STRENGTH, strength, $kw25$DIRECTION, direction, $kw26$UNASSERTS, unasserts, $kw27$METAS, metas
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 4404L)
  public static SubLObject ke_assert_assertion_spec(final SubLObject cb_assertion_spec)
  {
    assert NIL != cb_assertion_spec_p( cb_assertion_spec ) : cb_assertion_spec;
    final SubLObject sentence = assertion_spec_sentence( cb_assertion_spec );
    final SubLObject mt = assertion_spec_mt( cb_assertion_spec );
    final SubLObject strength = assertion_spec_strength( cb_assertion_spec );
    final SubLObject direction = assertion_spec_direction( cb_assertion_spec );
    return ke.ke_assert( sentence, mt, strength, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 4962L)
  public static SubLObject cb_note_edit_change(final SubLObject message, final SubLObject queue_usedP, SubLObject back, SubLObject delay)
  {
    if( back == UNPROVIDED )
    {
      back = TWO_INTEGER;
    }
    if( delay == UNPROVIDED )
    {
      delay = $int34$2000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject final_message = NIL;
    if( NIL != queue_usedP && NIL != api_control_vars.$use_local_queueP$.getDynamicValue( thread ) )
    {
      final_message = PrintLow.format( NIL, $str35$_a_operation_was_added_to_queue, message );
    }
    else
    {
      final_message = PrintLow.format( NIL, $str36$_a_operation_completed, message );
    }
    if( back.eql( ONE_INTEGER ) )
    {
      return cb_utilities.cb_simple_message_page( final_message, back, delay );
    }
    return cb_utilities.cb_message_page_with_history( final_message, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 5408L)
  public static SubLObject cb_attempt_to_repair_and_assert(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject args, final SubLObject violations)
  {
    final SubLObject metas = NIL;
    return cb_explain_why_not_wff( sentence, mt, violations, strength, direction, T, NIL, NIL, metas );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 6083L)
  public static SubLObject cb_explain_why_not_wff(final SubLObject sentence, final SubLObject mt, SubLObject violations, SubLObject strength, SubLObject direction, SubLObject attempt_to_repair_and_assertP,
      SubLObject pending_assertions, SubLObject unasserts, SubLObject metas)
  {
    if( violations == UNPROVIDED )
    {
      violations = NIL;
    }
    if( strength == UNPROVIDED )
    {
      strength = NIL;
    }
    if( direction == UNPROVIDED )
    {
      direction = NIL;
    }
    if( attempt_to_repair_and_assertP == UNPROVIDED )
    {
      attempt_to_repair_and_assertP = NIL;
    }
    if( pending_assertions == UNPROVIDED )
    {
      pending_assertions = NIL;
    }
    if( unasserts == UNPROVIDED )
    {
      unasserts = NIL;
    }
    if( metas == UNPROVIDED )
    {
      metas = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != pending_assertions )
    {
      assert NIL != stacks.stack_p( pending_assertions ) : pending_assertions;
    }
    else
    {
      pending_assertions = stacks.create_stack();
    }
    final SubLObject explanation_of_why_not_wff = wff.explanation_of_why_not_wff( sentence, mt, ConsesLow.list( $kw40$IO_MODE, $kw41$NL, $kw42$VIOLATIONS, violations ) );
    final SubLObject repairs = wff_suggest.non_wffness_repairs( sentence, mt );
    final SubLObject old_pending_assertions_list = stacks.stack_elements( pending_assertions );
    final SubLObject title_var = $str43$Sentence_not_Well_Formed;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw47$CB_CYC );
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
          html_utilities.html_markup( $str50$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str52$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str54$Refresh_Frames );
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
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw37$CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str55$Mt___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str56$Sentence___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_form( sentence, ZERO_INTEGER, T );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str57$Repairs___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              if( NIL != list_utilities.non_empty_list_p( repairs ) )
              {
                stacks.stack_push( new_cb_assertion_spec( sentence, mt, strength, direction, unasserts, metas ), pending_assertions );
                SubLObject cdolist_list_var = repairs;
                SubLObject repair = NIL;
                repair = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  cb_wff_repair_advice( repair, mt, strength, direction, attempt_to_repair_and_assertP, pending_assertions );
                  cdolist_list_var = cdolist_list_var.rest();
                  repair = cdolist_list_var.first();
                }
              }
              else
              {
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
                html_utilities.html_princ( $str58$No_repairs_available___Could_not_ );
                html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
              }
              html_macros.verify_not_within_html_pre();
              html_utilities.html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
              final SubLObject _prev_bind_0_$6 = html_macros.$within_html_pre$.currentBinding( thread );
              try
              {
                html_macros.$within_html_pre$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str59$Explanation__ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str60$wff_explain );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ_doc_string( explanation_of_why_not_wff, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                }
                html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$within_html_pre$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
              if( NIL != list_utilities.non_empty_list_p( old_pending_assertions_list ) )
              {
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str61$Stack_of_pending_assertions_depen );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                SubLObject cdolist_list_var = Sequences.reverse( old_pending_assertions_list );
                SubLObject assertion_spec = NIL;
                assertion_spec = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  final SubLObject pending_sentence = assertion_spec_sentence( assertion_spec );
                  final SubLObject pending_mt = assertion_spec_mt( assertion_spec );
                  cb_utilities.cb_form( pending_sentence, ZERO_INTEGER, T );
                  html_utilities.html_princ( $str62$__in_ );
                  cb_utilities.cb_form( pending_mt, UNPROVIDED, UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  assertion_spec = cdolist_list_var.first();
                }
              }
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 8809L)
  public static SubLObject cb_wff_repair_advice(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject attempt_to_repair_and_assertP,
      final SubLObject pending_assertions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
    SubLObject existing_assertions = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym63$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const64$EverythingPSC, thread );
      existing_assertions = czer_meta.find_assertions_cycl( repair_sentence, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    existing_assertions = list_utilities.delete_if_not( Symbols.symbol_function( $sym65$ASSERTED_ASSERTION_ ), existing_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.empty_list_p( existing_assertions ) )
    {
      cb_wff_repair_advise_assertion_creation( repair_sentence, mt, strength, direction, attempt_to_repair_and_assertP, pending_assertions );
    }
    else
    {
      cb_wff_repair_advise_assertion_creation_or_lift( repair_sentence, mt, strength, direction, existing_assertions, attempt_to_repair_and_assertP, pending_assertions );
    }
    html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 9571L)
  public static SubLObject cb_wff_repair_advise_assertion_creation(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction,
      final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions)
  {
    html_utilities.html_princ( $str66$The_fact_ );
    cb_utilities.cb_form( repair_sentence, ZERO_INTEGER, T );
    html_utilities.html_princ( $str67$_must_be_added_to_ );
    cb_utilities.cb_form( mt, ZERO_INTEGER, NIL );
    html_utilities.html_princ( $str68$_in_order_for_the_above_sentence_ );
    if( NIL != attempt_to_repair_and_assertP )
    {
      final SubLObject repair_assertion_spec = new_cb_assertion_spec( repair_sentence, mt, strength, direction, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      cb_utilities.cb_link( $kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 10159L)
  public static SubLObject cb_wff_repair_advise_assertion_creation_or_lift(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction,
      final SubLObject existing_assertions, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions)
  {
    final SubLObject existing_assertions_in_spec_mts = assertions_in_spec_mts_among( mt, existing_assertions );
    if( NIL != list_utilities.empty_list_p( existing_assertions_in_spec_mts ) )
    {
      cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt( repair_sentence, mt, strength, direction, existing_assertions, attempt_to_repair_and_assertP, pending_assertions );
    }
    else
    {
      cb_wff_repair_advise_assertion_lift_from_spec_mt( repair_sentence, mt, strength, direction, existing_assertions_in_spec_mts, attempt_to_repair_and_assertP, pending_assertions );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 10954L)
  public static SubLObject assertions_in_spec_mts_among(final SubLObject mt, final SubLObject assertions)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
      if( NIL != genl_mts.genl_mtP( assertion_mt, mt, UNPROVIDED, UNPROVIDED ) )
      {
        result = ConsesLow.cons( assertion, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 11342L)
  public static SubLObject cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction,
      final SubLObject existing_assertions, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions)
  {
    final SubLObject existing_assertions_mts = Mapping.mapcar( Symbols.symbol_function( $sym70$ASSERTION_MT ), existing_assertions );
    final SubLObject min_ceiling_mts = genl_mts.min_ceiling_mts( ConsesLow.cons( mt, existing_assertions_mts ), UNPROVIDED, UNPROVIDED );
    final SubLObject min_ceiling_mt = ( NIL != min_ceiling_mts ) ? number_utilities.minimum( min_ceiling_mts, Symbols.symbol_function( $sym71$GENERALITY_ESTIMATE ) ) : NIL;
    html_utilities.html_princ( $str66$The_fact_ );
    cb_utilities.cb_form( repair_sentence, ZERO_INTEGER, T );
    html_utilities.html_princ( $str67$_must_be_added_to_ );
    cb_utilities.cb_form( mt, ZERO_INTEGER, NIL );
    html_utilities.html_princ( $str68$_in_order_for_the_above_sentence_ );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str72$That_fact_is_already_asserted_in_ );
    cb_utilities.cb_form_item_list( existing_assertions_mts );
    html_utilities.html_princ( $str73$_ );
    html_utilities.html_newline( UNPROVIDED );
    if( NIL != min_ceiling_mt )
    {
      html_utilities.html_princ( $str74$You_can_repair_this_by_doing_eith );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_princ( $str75$1__Lifting_the_assertion_to_ );
      cb_utilities.cb_form( min_ceiling_mt, UNPROVIDED, UNPROVIDED );
      if( NIL != attempt_to_repair_and_assertP )
      {
        final SubLObject repair_assertion_spec = new_cb_assertion_spec( repair_sentence, min_ceiling_mt, strength, direction, existing_assertions, UNPROVIDED );
        html_utilities.html_indent( TWO_INTEGER );
        cb_utilities.cb_link( $kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_princ( $str76$2__Asserting_it_in_ );
      cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
      html_utilities.html_princ( $str77$_as_well );
      if( NIL != attempt_to_repair_and_assertP )
      {
        final SubLObject repair_assertion_spec = new_cb_assertion_spec( repair_sentence, mt, strength, direction, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( TWO_INTEGER );
        cb_utilities.cb_link( $kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      html_utilities.html_princ( $str78$You_can_repair_this_by_doing_the_ );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      html_utilities.html_princ( $str79$Asserting_it_in_ );
      cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
      if( NIL != attempt_to_repair_and_assertP )
      {
        final SubLObject repair_assertion_spec = new_cb_assertion_spec( repair_sentence, mt, strength, direction, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( TWO_INTEGER );
        cb_utilities.cb_link( $kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 13506L)
  public static SubLObject cb_wff_repair_advise_assertion_lift_from_spec_mt(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction,
      final SubLObject existing_assertions_in_spec_mts, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions)
  {
    html_utilities.html_princ( $str66$The_fact_ );
    cb_utilities.cb_form( repair_sentence, ZERO_INTEGER, T );
    html_utilities.html_princ( $str80$_must_be_lifted_to_ );
    cb_utilities.cb_form( mt, ZERO_INTEGER, NIL );
    html_utilities.html_princ( $str68$_in_order_for_the_above_sentence_ );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str81$It_is_currently_asserted_in_the_f );
    SubLObject cdolist_list_var = Mapping.mapcar( Symbols.symbol_function( $sym70$ASSERTION_MT ), existing_assertions_in_spec_mts );
    SubLObject spec_mt = NIL;
    spec_mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
      cb_utilities.cb_form( spec_mt, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      spec_mt = cdolist_list_var.first();
    }
    if( NIL != attempt_to_repair_and_assertP )
    {
      html_utilities.html_newline( UNPROVIDED );
      final SubLObject repair_assertion_spec = new_cb_assertion_spec( repair_sentence, mt, strength, direction, existing_assertions_in_spec_mts, UNPROVIDED );
      cb_utilities.cb_link( $kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 14395L)
  public static SubLObject cb_link_repair_and_reattempt(final SubLObject repair_assertion_spec, final SubLObject assertion_stack, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str82$_Make_this_repair_and_then_reatte;
    }
    final SubLObject repair_assertion_spec_id = cb_parameters.cb_glob_id( repair_assertion_spec );
    final SubLObject assertion_stack_id = cb_parameters.cb_glob_id( assertion_stack );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str84$cb_repair_and_reattempt__A__A, repair_assertion_spec_id, assertion_stack_id );
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
    return assertion_stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 14888L)
  public static SubLObject cb_repair_and_reattempt(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
      return NIL;
    }
    SubLObject repair_assertion_spec_id = NIL;
    SubLObject assertion_stack_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list87 );
    repair_assertion_spec_id = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list87 );
    assertion_stack_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject repair_assertion_spec = cb_parameters.cb_glob_lookup_by_string( repair_assertion_spec_id );
      final SubLObject assertion_stack = cb_parameters.cb_glob_lookup_by_string( assertion_stack_id );
      SubLObject found_non_wffP = NIL;
      stacks.stack_push( repair_assertion_spec, assertion_stack );
      while ( NIL == stacks.stack_empty_p( assertion_stack ) && NIL == found_non_wffP)
      {
        final SubLObject assertion_spec = stacks.stack_pop( assertion_stack );
        final SubLObject sentence = assertion_spec_sentence( assertion_spec );
        final SubLObject mt = assertion_spec_mt( assertion_spec );
        final SubLObject strength = assertion_spec_strength( assertion_spec );
        final SubLObject direction = assertion_spec_direction( assertion_spec );
        final SubLObject unasserts = assertion_spec_unasserts( assertion_spec );
        final SubLObject metas = assertion_spec_metas( assertion_spec );
        final SubLObject wff_violations = wff.why_not_wff_assert( sentence, mt, UNPROVIDED );
        if( NIL != wff_violations )
        {
          cb_explain_why_not_wff( sentence, mt, wff_violations, strength, direction, T, assertion_stack, UNPROVIDED, UNPROVIDED );
          found_non_wffP = T;
        }
        else
        {
          ke.ke_assert_now( sentence, mt, strength, direction );
          cb_tools.cb_add_sentence_in_mt_to_assertion_history( sentence, mt );
          SubLObject cdolist_list_var = unasserts;
          SubLObject unassert = NIL;
          unassert = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            ke.ke_unassert_assertion( unassert );
            cdolist_list_var = cdolist_list_var.rest();
            unassert = cdolist_list_var.first();
          }
          cdolist_list_var = metas;
          SubLObject meta = NIL;
          meta = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            ke_assert_assertion_spec( meta );
            cdolist_list_var = cdolist_list_var.rest();
            meta = cdolist_list_var.first();
          }
        }
      }
      if( NIL == found_non_wffP )
      {
        cb_utilities.cb_message_page_with_history( $str88$Repair_and_assert_operations_comp, T );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list87 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 16536L)
  public static SubLObject cb_assertion_toolbar(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      final SubLObject modification_permittedP = assertion_modification_permittedP( assertion );
      final SubLObject forwardP = assertions_high.forward_assertionP( assertion );
      final SubLObject ruleP = assertions_high.rule_assertionP( assertion );
      final SubLObject assertedP = assertions_high.asserted_assertionP( assertion );
      final SubLObject deducedP = assertions_high.deduced_assertionP( assertion );
      final SubLObject non_modifiable_via_fiP = makeBoolean( NIL == modification_permittedP );
      final SubLObject has_meta_assertionsP = assertion_utilities.assertion_has_meta_assertionsP( assertion );
      cb_utilities.cb_help_preamble( $kw91$CB_AF, UNPROVIDED, UNPROVIDED );
      if( NIL == cb_parameters.$cb_a_show_english$.getDynamicValue( thread ) )
      {
        cb_utilities.cb_link( $kw93$SHOW_ENGLISH, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL == cb_parameters.$cb_a_show_el_formula$.getDynamicValue( thread ) )
      {
        cb_utilities.cb_link( $kw94$SHOW_EL_FORMULA, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      cb_utilities.cb_link( $kw95$WFF_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      cb_utilities.cb_link( $kw96$FIND_SIMILAR_ASSERTION, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      if( NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue( thread ) && NIL != assertedP )
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_link( $kw97$CHANGE_MT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
        cb_utilities.cb_link( $kw98$CHANGE_STRENGTH, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
        cb_utilities.cb_link( $kw99$CHANGE_DIRECTION, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
        if( NIL != has_meta_assertionsP )
        {
          cb_utilities.cb_link( $kw100$CHANGE_META_ASSERTION_MT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        if( NIL != assertions_high.assertion_el_variables( assertion ) )
        {
          if( NIL != assertion_utilities.rule_has_unlabelled_dont_care_variableP( assertion ) )
          {
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            cb_utilities.cb_link( $kw101$RENAME_VARIABLES, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
          else
          {
            cb_utilities.cb_link( $kw101$RENAME_VARIABLES, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
          }
          html_utilities.html_indent( UNPROVIDED );
        }
      }
      if( NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue( thread ) )
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_link( $kw102$ASSERT_SIMILAR, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
        cb_utilities.cb_link( $kw103$ASSERT_META, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
        if( NIL != assertions_high.rule_assertionP( assertion ) && NIL != pragma_induction.some_suggested_pragma_sentences_for_ruleP( assertion ) )
        {
          cb_utilities.cb_link( $kw104$SUGGEST_PRAGMAS, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        if( NIL != assertedP && NIL != cb_fix_typo_assertionP( assertion ) )
        {
          cb_utilities.cb_link( $kw105$FIX_TYPO, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        if( NIL != assertedP )
        {
          cb_utilities.cb_link( $kw106$EDIT_ASSERTION, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        cb_utilities.cb_link( $kw107$REASSERT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
        if( NIL != assertedP )
        {
          cb_utilities.cb_link( $kw108$UNASSERT, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        if( NIL != assertions_high.assertion_arguments( assertion ) )
        {
          cb_utilities.cb_link( $kw109$BLAST, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        if( NIL != assertions_high.deduced_assertionP( assertion ) )
        {
          cb_utilities.cb_link( $kw110$ASSERTION_PROOF_VIEW, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      if( NIL != assertions_high.rule_assertionP( assertion ) )
      {
        final SubLObject rule_cnf = assertions_high.assertion_cnf( assertion );
        html_utilities.html_newline( UNPROVIDED );
        if( NIL != clauses.neg_lits( rule_cnf ) )
        {
          cb_utilities.cb_link( $kw111$ANTECEDENT_QUERY, assertion, $str112$_Query_Antecedent_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        if( NIL != clauses.pos_lits( rule_cnf ) )
        {
          cb_utilities.cb_link( $kw113$RULE_KNOWN_EXTENT_QUERY, assertion, $str114$_Known_Extent_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        if( NIL != clauses.pos_lits( rule_cnf ) )
        {
          cb_utilities.cb_link( $kw115$RULE_UNKNOWN_EXTENT_QUERY, assertion, $str116$_Unknown_Extent_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        if( NIL != clauses.neg_lits( rule_cnf ) )
        {
          cb_utilities.cb_link( $kw117$TRIGGER_TEST, NIL, assertion, $str118$_Trigger_Test_, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
        }
        cb_utilities.cb_link( $kw119$ASSERTION_SIMILAR_QUERY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      html_utilities.html_newline( UNPROVIDED );
      if( NIL != deducedP )
      {
        cb_utilities.cb_link( $kw120$ASSERT_TMS, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != deducedP )
      {
        cb_utilities.cb_link( $kw121$JUSTIFY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != assertions_high.assertion_has_dependents_p( assertion ) )
      {
        cb_utilities.cb_link( $kw122$ASSERTION_DEPENDENCIES, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue( thread ) && NIL != assertedP )
      {
        cb_utilities.cb_link( $kw123$RECANONICALIZE, assertion, NIL, non_modifiable_via_fiP, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != assertions_high.gaf_assertionP( assertion ) )
      {
        cb_utilities.cb_link( $kw117$TRIGGER_TEST, assertion, NIL, $str118$_Trigger_Test_, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue( thread ) && NIL != forwardP )
      {
        cb_utilities.cb_link( $kw124$REPROPAGATE, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue( thread ) && NIL != forwardP )
      {
        cb_utilities.cb_link( $kw125$REPROPAGATE_BROWSABLY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != pph_templates.assertion_has_phrase_naut_argP( assertion ) )
      {
        cb_utilities.cb_link( $kw126$TEST_GEN_TEMPLATE, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL == assertions_high.rule_assertionP( assertion ) )
      {
        cb_utilities.cb_link( $kw119$ASSERTION_SIMILAR_QUERY, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != ruleP )
      {
        cb_utilities.cb_link( $kw127$USE_IN_PROOF, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != shop_main.shop_planning_assertionP( assertion ) )
      {
        cb_utilities.cb_link( $kw128$USE_IN_PLAN_CHECKING, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != assertions_high.rule_assertionP( assertion ) )
      {
        cb_utilities.cb_link( $kw129$REINFORCE_RULE, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 22790L)
  public static SubLObject assertion_modification_permittedP(final SubLObject assertion)
  {
    if( NIL != assertions_high.code_assertionP( assertion ) )
    {
      return NIL;
    }
    if( NIL == assertions_high.gaf_assertionP( assertion ) )
    {
      return T;
    }
    return makeBoolean( NIL == isa.isaP( assertions_high.gaf_predicate( assertion ), $const130$InferenceRelatedBookkeepingPredic, mt_vars.$inference_related_bookkeeping_predicate_mt$.getGlobalValue(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 23198L)
  public static SubLObject cb_disabled_link(final SubLObject linktext)
  {
    html_utilities.html_princ( linktext );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 23445L)
  public static SubLObject cb_change_mt(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str133$the_Change_Assertion_Mt_page );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        final SubLObject mt = assertions_high.assertion_mt( assertion );
        final SubLObject title_var = $str135$Change_Assertion_Mt;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
        try
        {
          html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
              ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
              : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
          html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
          if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
          try
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list(
                EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
            html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw47$CB_CYC );
            dhtml_macros.html_basic_cb_scripts();
            if( NIL != title_var )
            {
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
            }
            html_complete.html_complete_script();
            cyc_file_dependencies.css( $kw48$SAM_AUTOCOMPLETE_CSS );
            html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
              html_utilities.html_markup( $str50$yui_skin_sam );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str51$reloadFrameButton );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str52$button );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str53$reload );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_princ( $str54$Refresh_Frames );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
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
                html_utilities.html_markup( $str136$post );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != frame_name_var )
                {
                  html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( frame_name_var );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.$within_html_form$.bind( T, thread );
                  html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                  html_utilities.html_hidden_input( $str137$cb_handle_change_mt, T, UNPROVIDED );
                  html_utilities.html_hidden_input( $str138$id, id, UNPROVIDED );
                  cb_utilities.cb_help_preamble( $kw131$CB_CHANGE_MT, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  if( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) )
                  {
                    final SubLObject color_val = $kw139$RED;
                    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                    if( NIL != color_val )
                    {
                      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_color( color_val ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ_strong( $str140$Note___This_assertion_has_meta_as );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                    html_utilities.html_newline( TWO_INTEGER );
                  }
                  cb_form_widgets.cb_mt_input_section( mt, $list141 );
                  cb_utilities.cb_back_button( $kw83$SELF, $str142$Abort_Edit );
                  html_utilities.html_indent( UNPROVIDED );
                  html_utilities.html_reset_input( $str143$Current_Value );
                  html_utilities.html_indent( UNPROVIDED );
                  html_utilities.html_submit_input( $str144$Change_Mt, UNPROVIDED, UNPROVIDED );
                  cb_change_all_meta_assertions_mt_check( assertion );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str56$Sentence___ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_newline( UNPROVIDED );
                  cb_utilities.cb_form_assertion_edit_formula( assertion, ZERO_INTEGER, T );
                  cb_tabulate_checkable_meta_assertions( assertion, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
                }
                finally
                {
                  html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                  html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                }
                html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_copyright_notice();
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
              }
              html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
          }
          finally
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$8, thread );
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
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 24597L)
  public static SubLObject cb_change_all_meta_assertions_mt_check(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) )
    {
      final SubLObject all_meta_assertions = assertion_utilities.all_meta_assertions( assertion );
      SubLObject assertion_mt = NIL;
      SubLObject meta_assertion_mt = NIL;
      assertion_mt = assertions_high.assertion_mt( assertion );
      SubLObject cdolist_list_var = all_meta_assertions;
      SubLObject meta_assertion = NIL;
      meta_assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        meta_assertion_mt = assertions_high.assertion_mt( meta_assertion );
        if( !assertion_mt.eql( meta_assertion_mt ) )
        {
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          html_utilities.html_princ_strong( $str146$To_change_Mt_of_all_meta_assertio );
          cb_utilities.cb_link( $kw100$CHANGE_META_ASSERTION_MT, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        meta_assertion = cdolist_list_var.first();
      }
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      html_utilities.html_checkbox_input( $str147$move_all_meta_assertions, $str148$t, cb_parameters.$cb_a_change_all_meta_assertions_mt_by_defaultP$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      html_utilities.html_princ_strong( $str149$Change_the_Mt_of_all_meta_asserti );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 25468L)
  public static SubLObject cb_handle_change_mt(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str150$change_microtheory );
      return NIL;
    }
    final SubLObject id = html_utilities.html_extract_input( $str138$id, args );
    final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
    thread.resetMultipleValues();
    final SubLObject new_mt = cb_form_widgets.cb_extract_mt_input( args, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_error = thread.secondMultipleValue();
    final SubLObject mt_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != mt_error )
    {
      return cb_form_widgets.cb_mt_error( mt_error, mt_error_string );
    }
    if( NIL != hlmt.hlmt_equalP( new_mt, assertions_high.assertion_mt( assertion ) ) )
    {
      return cb_utilities.cb_error( $str151$Assertion_is_already_in__S, new_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject change_meta_assertion_mtP = html_utilities.html_extract_input( $str147$move_all_meta_assertions, args );
    final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args( assertion, args, $str152$preserve_, ( NIL != change_meta_assertion_mtP ) ? new_mt : NIL );
    cb_change_mt_hook( assertion, new_mt, meta_assertions_to_preserve );
    cb_note_edit_change( $str135$Change_Assertion_Mt, T, THREE_INTEGER, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 26339L)
  public static SubLObject cb_link_change_mt(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str154$_Change_Mt_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str155$cb_change_mt__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 26777L)
  public static SubLObject cb_change_strength(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str159$the_Change_Assertion_Strength_pag );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        final SubLObject strength = assertions_high.assertion_strength( assertion );
        final SubLObject title_var = $str160$Change_Assertion_Strength;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
        try
        {
          html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
              ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
              : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
          html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
          if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$14 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
          try
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list(
                EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
            html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw47$CB_CYC );
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
            final SubLObject _prev_bind_0_$15 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
              html_utilities.html_markup( $str50$yui_skin_sam );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str51$reloadFrameButton );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str52$button );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str53$reload );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_princ( $str54$Refresh_Frames );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
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
                html_utilities.html_markup( $str136$post );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != frame_name_var )
                {
                  html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( frame_name_var );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.$within_html_form$.bind( T, thread );
                  html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                  html_utilities.html_hidden_input( $str161$cb_handle_change_strength, T, UNPROVIDED );
                  html_utilities.html_hidden_input( $str138$id, id, UNPROVIDED );
                  cb_utilities.cb_help_preamble( $kw157$CB_CHANGE_STRENGTH, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str162$Choose_a_new_truth_strength__ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_newline( TWO_INTEGER );
                  html_utilities.html_radio_input( $str163$strength, $str164$_default, Equality.eq( strength, $kw165$DEFAULT ), UNPROVIDED );
                  html_utilities.html_indent( TWO_INTEGER );
                  html_utilities.html_princ( $str166$Default );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_radio_input( $str163$strength, $str167$_monotonic, Equality.eq( strength, $kw168$MONOTONIC ), UNPROVIDED );
                  html_utilities.html_indent( TWO_INTEGER );
                  html_utilities.html_princ( $str169$Monotonic );
                  html_utilities.html_newline( TWO_INTEGER );
                  cb_utilities.cb_back_button( $kw83$SELF, $str142$Abort_Edit );
                  html_utilities.html_indent( ONE_INTEGER );
                  html_utilities.html_reset_input( $str143$Current_Value );
                  html_utilities.html_indent( ONE_INTEGER );
                  html_utilities.html_submit_input( $str170$Change_Strength, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str55$Mt___ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  cb_utilities.cb_form( assertions_high.assertion_mt( assertion ), UNPROVIDED, UNPROVIDED );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str56$Sentence___ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_newline( UNPROVIDED );
                  cb_utilities.cb_form_assertion_edit_formula( assertion, ZERO_INTEGER, T );
                  html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
                }
                finally
                {
                  html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                  html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                }
                html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_copyright_notice();
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
              }
              html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$15, thread );
            }
            html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
          }
          finally
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$14, thread );
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
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 28119L)
  public static SubLObject cb_handle_change_strength(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str172$change_strength );
      return NIL;
    }
    final SubLObject id = html_utilities.html_extract_input( $str138$id, args );
    final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
    final SubLObject new_strength = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str163$strength, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != subl_promotions.memberP( new_strength, $list173, UNPROVIDED, UNPROVIDED ) )
    {
      if( !new_strength.equal( assertions_high.assertion_strength( assertion ) ) )
      {
        cb_change_strength_hook( assertion, new_strength );
      }
      cb_note_edit_change( $str160$Change_Assertion_Strength, T, TWO_INTEGER, UNPROVIDED );
    }
    else
    {
      cb_utilities.cb_error( $str174$_a_was_not_a_microtheory, conses_high.second( args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 28738L)
  public static SubLObject cb_link_change_strength(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str176$_Change_Strength_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str177$cb_change_strength__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 29199L)
  public static SubLObject cb_change_direction(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str181$the_Change_Assertion_Direction_pa );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        final SubLObject direction = assertions_high.assertion_direction( assertion );
        final SubLObject title_var = $str182$Change_Assertion_Direction;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
        try
        {
          html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
              ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
              : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
          html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
          if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$19 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
          try
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list(
                EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
            html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw47$CB_CYC );
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
            final SubLObject _prev_bind_0_$20 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
              html_utilities.html_markup( $str50$yui_skin_sam );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str51$reloadFrameButton );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str52$button );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str53$reload );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_princ( $str54$Refresh_Frames );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
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
                html_utilities.html_markup( $str136$post );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != frame_name_var )
                {
                  html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( frame_name_var );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.$within_html_form$.bind( T, thread );
                  html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                  html_utilities.html_hidden_input( $str183$cb_handle_change_direction, T, UNPROVIDED );
                  html_utilities.html_hidden_input( $str138$id, id, UNPROVIDED );
                  cb_utilities.cb_help_preamble( $kw179$CB_CHANGE_DIRECTION, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str184$Choose_a_direction__ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_radio_input( $str185$direction, $str186$_backward, Equality.eq( direction, $kw187$BACKWARD ), UNPROVIDED );
                  html_utilities.html_indent( UNPROVIDED );
                  html_utilities.html_princ( $str188$Backward );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_radio_input( $str185$direction, $str189$_forward, Equality.eq( direction, $kw190$FORWARD ), UNPROVIDED );
                  html_utilities.html_indent( UNPROVIDED );
                  html_utilities.html_princ( $str191$Forward );
                  if( NIL != assertions_high.rule_assertionP( assertion ) )
                  {
                    final SubLObject rule_cnf = assertions_high.assertion_cnf( assertion );
                    if( NIL != clauses.neg_lits( rule_cnf ) )
                    {
                      html_utilities.html_indent( TWO_INTEGER );
                      cb_utilities.cb_link( $kw111$ANTECEDENT_QUERY, assertion, $str112$_Query_Antecedent_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                  }
                  html_utilities.html_newline( TWO_INTEGER );
                  cb_utilities.cb_back_button( $kw83$SELF, $str142$Abort_Edit );
                  html_utilities.html_indent( ONE_INTEGER );
                  html_utilities.html_reset_input( $str143$Current_Value );
                  html_utilities.html_indent( ONE_INTEGER );
                  html_utilities.html_submit_input( $str192$Change_Direction, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str55$Mt___ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  cb_utilities.cb_form( assertions_high.assertion_mt( assertion ), UNPROVIDED, UNPROVIDED );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str56$Sentence___ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_newline( UNPROVIDED );
                  cb_utilities.cb_form_assertion_edit_formula( assertion, ZERO_INTEGER, T );
                  html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
                }
                finally
                {
                  html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                  html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
                }
                html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_copyright_notice();
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
              }
              html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$20, thread );
            }
            html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
          }
          finally
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$19, thread );
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
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 31155L)
  public static SubLObject cb_handle_change_direction(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str194$direction_changes );
      return NIL;
    }
    final SubLObject id = html_utilities.html_extract_input( $str138$id, args );
    final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
    final SubLObject new_direction = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str185$direction, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject shoehornP = html_utilities.html_extract_boolean( $str195$shoehorn_, args, UNPROVIDED );
    final SubLObject direction = assertions_high.assertion_direction( assertion );
    if( NIL == enumeration_types.direction_p( new_direction ) )
    {
      cb_utilities.cb_error( $str196$_a_does_not_specify_a_valid_direc, conses_high.second( args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( !new_direction.eql( direction ) )
    {
      if( new_direction == $kw190$FORWARD && NIL != assertions_high.rule_assertionP( assertion ) && NIL != shoehornP )
      {
        ke.ke_shoehorn_rule_forward( assertion );
        ke.ke_assert( ConsesLow.list( $const197$cyclistNotes, assertion, Sequences.cconcatenate( $str198$This_rule_was_shoehorned_forward_, new SubLObject[] { format_nil.format_nil_a_no_copy( numeric_date_utilities
            .timestring( UNPROVIDED ) ), $str199$_by_, format_nil.format_nil_a_no_copy( operation_communication.the_cyclist() ), $str73$_
        } ) ), assertions_high.assertion_mt( assertion ), UNPROVIDED, UNPROVIDED );
        cb_note_edit_change( $str182$Change_Assertion_Direction, T, TWO_INTEGER, UNPROVIDED );
      }
      else
      {
        cb_change_direction_hook( assertion, new_direction );
        cb_note_edit_change( $str182$Change_Assertion_Direction, T, TWO_INTEGER, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 32251L)
  public static SubLObject cb_link_change_direction(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str201$_Change_Direction_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str202$cb_change_direction__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 32756L)
  public static SubLObject cb_change_meta_assertion_mt(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str133$the_Change_Assertion_Mt_page );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        final SubLObject mt = assertions_high.assertion_mt( assertion );
        final SubLObject title_var = $str206$Change_Meta_Assertions_Mt;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
        try
        {
          html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
              ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
              : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
          html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
          if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$24 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
          try
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list(
                EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
            html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw47$CB_CYC );
            dhtml_macros.html_basic_cb_scripts();
            if( NIL != title_var )
            {
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
            }
            html_complete.html_complete_script();
            cyc_file_dependencies.css( $kw48$SAM_AUTOCOMPLETE_CSS );
            html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            final SubLObject _prev_bind_0_$25 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
              html_utilities.html_markup( $str50$yui_skin_sam );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str51$reloadFrameButton );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str52$button );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str53$reload );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_princ( $str54$Refresh_Frames );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
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
                html_utilities.html_markup( $str136$post );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != frame_name_var )
                {
                  html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( frame_name_var );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.$within_html_form$.bind( T, thread );
                  html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                  html_utilities.html_hidden_input( $str207$cb_handle_change_meta_assertion_m, T, UNPROVIDED );
                  html_utilities.html_hidden_input( $str138$id, id, UNPROVIDED );
                  cb_utilities.cb_help_preamble( $kw204$CB_CHANGE_META_ASSERTION_MT, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str208$Change_the_Mt_of_Meta_Assertions_ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_newline( TWO_INTEGER );
                  cb_utilities.cb_show_assertion_readably( assertion, T, T );
                  html_utilities.html_newline( TWO_INTEGER );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                  cb_form_widgets.cb_mt_input_section( mt, $list141 );
                  cb_utilities.cb_back_button( $kw83$SELF, $str142$Abort_Edit );
                  html_utilities.html_indent( UNPROVIDED );
                  html_utilities.html_reset_input( $str143$Current_Value );
                  html_utilities.html_indent( UNPROVIDED );
                  html_utilities.html_submit_input( $str144$Change_Mt, UNPROVIDED, UNPROVIDED );
                  cb_tabulate_checkable_meta_assertions( assertion, TWO_INTEGER, $str209$change_meta_, $str210$Choose_the_meta_assertions__, T );
                  html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
                }
                finally
                {
                  html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                  html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
                }
                html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_copyright_notice();
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
              }
              html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$25, thread );
            }
            html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
          }
          finally
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$24, thread );
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
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 33854L)
  public static SubLObject cb_handle_change_meta_assertion_mt(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str150$change_microtheory );
      return NIL;
    }
    final SubLObject id = html_utilities.html_extract_input( $str138$id, args );
    final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
    thread.resetMultipleValues();
    final SubLObject new_mt = cb_form_widgets.cb_extract_mt_input( args, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_error = thread.secondMultipleValue();
    final SubLObject mt_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != mt_error )
    {
      return cb_form_widgets.cb_mt_error( mt_error, mt_error_string );
    }
    final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args( assertion, args, $str209$change_meta_, UNPROVIDED );
    SubLObject operations = ZERO_INTEGER;
    SubLObject cdolist_list_var = meta_assertions_to_preserve;
    SubLObject meta_assertion_pair = NIL;
    meta_assertion_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject meta_assertion = meta_assertion_pair.first();
      if( NIL == hlmt.hlmt_equalP( new_mt, assertions_high.assertion_mt( meta_assertion ) ) )
      {
        cb_change_mt_hook( meta_assertion, new_mt, NIL );
        operations = Numbers.add( operations, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      meta_assertion_pair = cdolist_list_var.first();
    }
    cb_note_edit_change( $str206$Change_Meta_Assertions_Mt, T, THREE_INTEGER, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 34716L)
  public static SubLObject cb_link_change_meta_assertion_mt(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str213$_Change_Meta_Assertions_Mt_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str214$cb_change_meta_assertion_mt__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 35227L)
  public static SubLObject cb_rename_variables(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str218$the_facility_to_rename_variables );
    }
    SubLObject id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
    id = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
      final SubLObject assertion_el_variables = assertions_high.assertion_el_variables( assertion );
      final SubLObject mal_variables = wff_utilities.mal_variables( assertion_el_variables );
      final SubLObject correction_pair_alist = el_utilities.correct_variables( mal_variables );
      SubLObject corrected_variable = NIL;
      final SubLObject title_var = $str219$Rename_Assertion_Variables;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$29 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw47$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_complete.html_complete_script();
          cyc_file_dependencies.css( $kw48$SAM_AUTOCOMPLETE_CSS );
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$30 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str50$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str51$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str52$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str53$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str54$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
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
              html_utilities.html_markup( $str136$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str220$cb_handle_rename_variables, T, UNPROVIDED );
                html_utilities.html_hidden_input( $str138$id, id, UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw216$CB_RENAME_VARIABLES, UNPROVIDED, UNPROVIDED );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str221$Rename_the_variables_of_the_asser );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( TWO_INTEGER );
                cb_utilities.cb_show_assertion_readably( assertion, T, T );
                html_utilities.html_newline( TWO_INTEGER );
                if( NIL != mal_variables )
                {
                  html_utilities.html_princ_strong( $str222$Note__ );
                  html_utilities.html_princ( $str223$Variables_listed_in_ );
                  final SubLObject color_val = $kw139$RED;
                  html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                  if( NIL != color_val )
                  {
                    html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_color( color_val ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ_strong( $str224$red );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                  html_utilities.html_princ( $str225$_have_invalid_variable_names___Va );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
                  html_utilities.html_princ( cycl_variables.$valid_el_var_regular_expression$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
                  html_utilities.html_newline( UNPROVIDED );
                }
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw226$LEFT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_indent( TWO_INTEGER );
                      html_utilities.html_princ_strong( $str228$Current_Variable );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw226$LEFT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_indent( TWO_INTEGER );
                      html_utilities.html_princ_strong( $str229$Changed_Variable );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  SubLObject cdolist_list_var = assertion_el_variables;
                  SubLObject current_variable = NIL;
                  current_variable = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    corrected_variable = list_utilities.alist_lookup( correction_pair_alist, current_variable, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw226$LEFT ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_indent( TWO_INTEGER );
                        if( NIL != subl_promotions.memberP( current_variable, mal_variables, UNPROVIDED, UNPROVIDED ) )
                        {
                          final SubLObject color_val2 = $kw139$RED;
                          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                          if( NIL != color_val2 )
                          {
                            html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_color( color_val2 ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          }
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_princ_strong( current_variable );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                        }
                        else
                        {
                          html_utilities.html_princ( current_variable );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( html_utilities.html_align( $kw226$LEFT ) );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_indent( TWO_INTEGER );
                          html_utilities.html_text_input( current_variable, ( NIL != corrected_variable ) ? corrected_variable : current_variable, cb_parameters.$cb_constant_input_width$.getDynamicValue( thread ) );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                    html_utilities.html_source_readability_terpri( UNPROVIDED );
                    cdolist_list_var = cdolist_list_var.rest();
                    current_variable = cdolist_list_var.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str230$Rename_Variables, $str231$rename, UNPROVIDED );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$30, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$29, thread );
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
      cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 37503L)
  public static SubLObject cb_handle_rename_variables(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = html_utilities.html_extract_input( $str138$id, args );
    final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
    SubLObject rename_alist = NIL;
    SubLObject invalid_rename_list = NIL;
    thread.resetMultipleValues();
    final SubLObject rename_alist_$43 = cb_extract_variables_from_args( args );
    final SubLObject invalid_rename_list_$44 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    rename_alist = rename_alist_$43;
    invalid_rename_list = invalid_rename_list_$44;
    if( NIL != invalid_rename_list )
    {
      return cb_show_invalid_variables_message( invalid_rename_list );
    }
    if( NIL == rename_alist )
    {
      return cb_utilities.cb_simple_message_page( $str233$No_variables_were_specified_to_be, TWO_INTEGER, $int34$2000 );
    }
    if( NIL != html_utilities.html_extract_input( $str231$rename, args ) )
    {
      if( NIL != el_utilities.simple_variable_rename_impossibleP( assertion, rename_alist ) )
      {
        final SubLObject title_var = $str219$Rename_Assertion_Variables;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
        try
        {
          html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
              ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
              : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
          html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
          if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$45 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
          try
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list(
                EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
            html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
            cyc_file_dependencies.css( $kw47$CB_CYC );
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
            final SubLObject _prev_bind_0_$46 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
              html_utilities.html_markup( $str50$yui_skin_sam );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str51$reloadFrameButton );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str52$button );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str53$reload );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_princ( $str54$Refresh_Frames );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
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
                html_utilities.html_markup( $str136$post );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != frame_name_var )
                {
                  html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( frame_name_var );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_macros.$within_html_form$.bind( T, thread );
                  html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                  html_utilities.html_hidden_input( $str220$cb_handle_rename_variables, T, UNPROVIDED );
                  html_utilities.html_hidden_input( $str138$id, id, UNPROVIDED );
                  SubLObject cdolist_list_var = rename_alist;
                  SubLObject cons = NIL;
                  cons = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject variable = NIL;
                    SubLObject renamed_variable = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list234 );
                    variable = current.first();
                    current = ( renamed_variable = current.rest() );
                    html_utilities.html_hidden_input( variable, renamed_variable, UNPROVIDED );
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                  }
                  html_utilities.html_princ_strong( $str235$The_proposed_rename_may_change_th );
                  html_utilities.html_newline( TWO_INTEGER );
                  html_utilities.html_submit_input( $str236$Yes, $str237$continue, UNPROVIDED );
                  html_utilities.html_indent( TWO_INTEGER );
                  cb_utilities.cb_back_button( $kw83$SELF, $str238$No );
                  html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
                }
                finally
                {
                  html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                  html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
                }
                html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_copyright_notice();
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
              }
              html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$46, thread );
            }
            html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
          }
          finally
          {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$45, thread );
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
        cb_rename_variables_hook( assertion, rename_alist );
        cb_note_edit_change( $str230$Rename_Variables, T, UNPROVIDED, UNPROVIDED );
      }
    }
    else if( NIL != html_utilities.html_extract_input( $str237$continue, args ) )
    {
      SubLObject new_formula = conses_high.copy_tree( uncanonicalizer.assertion_el_formula( assertion ) );
      new_formula = conses_high.sublis( rename_alist, new_formula, UNPROVIDED, UNPROVIDED );
      cb_assert_internal( $kw239$EDIT, assertion, new_formula, T );
      cb_note_edit_change( $str230$Rename_Variables, T, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 39189L)
  public static SubLObject cb_extract_variables_from_args(final SubLObject args)
  {
    SubLObject rename_alist = NIL;
    SubLObject invalid_rename_list = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isCons() )
      {
        SubLObject current;
        final SubLObject datum = current = arg;
        SubLObject variable_name = NIL;
        SubLObject new_variable_name = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
        variable_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list241 );
        new_variable_name = current.first();
        current = current.rest();
        if( NIL == current )
        {
          new_variable_name = Strings.string_trim( $list242, new_variable_name );
          if( NIL != string_utilities.starts_with( variable_name, $str243$_ ) && NIL == Strings.string_equal( new_variable_name, $str244$, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != Strings
              .string_not_equal( variable_name, new_variable_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            if( NIL != cycl_variables.valid_el_var_nameP( new_variable_name ) )
            {
              rename_alist = list_utilities.alist_enter( rename_alist, cycl_variables.make_el_var( variable_name ), cycl_variables.make_el_var( new_variable_name ), UNPROVIDED );
            }
            else
            {
              invalid_rename_list = ConsesLow.cons( new_variable_name, invalid_rename_list );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list241 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Values.values( rename_alist, invalid_rename_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 40143L)
  public static SubLObject cb_show_invalid_variables_message(final SubLObject invalid_variables_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str245$Invalid_Variables;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$50 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw47$CB_CYC );
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
        final SubLObject _prev_bind_0_$51 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str50$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str52$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str54$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$53, thread );
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
            final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_back_button( $kw83$SELF, $str246$Back );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_princ_strong( $str247$The_following_variables_have_inva );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_princ( string_utilities.stringify_items( invalid_variables_list, Symbols.symbol_function( $sym248$STR ), $str249$__, $str250$__and_ ) );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_princ_strong( $str251$Valid_variables_must_satisfy_the_ );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
              html_utilities.html_princ( cycl_variables.$valid_el_var_regular_expression$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$54, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$51, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$50, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 40771L)
  public static SubLObject cb_link_rename_variables(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str252$_Rename_Variables_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str253$cb_rename_variables__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 41104L)
  public static SubLObject cb_repropagate(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str255$the_facility_to_repropagate_forwa );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        final SubLObject direction = assertions_high.assertion_direction( assertion );
        if( direction == $kw190$FORWARD )
        {
          cb_repropagate_hook( assertion );
          cb_note_edit_change( $str256$Forward_Assertion_Repropagation, T, ONE_INTEGER, UNPROVIDED );
        }
        else
        {
          cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 41664L)
  public static SubLObject cb_link_repropagate(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str259$_Repropagate_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str260$cb_repropagate__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 41989L)
  public static SubLObject cb_repropagate_browsably(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str262$the_facility_to_repropagate_and_b );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        final SubLObject direction = assertions_high.assertion_direction( assertion );
        if( direction == $kw190$FORWARD )
        {
          cb_repropagate_browsably_hook( assertion );
          cb_forward_inference_browser.cb_forward_inference_browser( ConsesLow.list( $str263$Forward_repropagation_complete___ ) );
        }
        else
        {
          cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 41989L)
  public static SubLObject cb_link_repropagate_browsably(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str265$_Repropagate_and_Browse_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str266$cb_repropagate_browsably__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 43101L)
  public static SubLObject cb_recanonicalize(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str268$the_facility_to_recanonicalize_an );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        if( NIL == assertion_handles.assertion_p( assertion ) )
        {
          return cb_utilities.cb_error( $str269$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        if( NIL == czer_main.canonicalizer_problemP( assertion ) )
        {
          return cb_utilities.cb_simple_message_page( $str270$Assertion_is_already_canonical, TWO_INTEGER, $int34$2000 );
        }
        cb_recanonicalize_hook( assertion, assertion_utilities.meta_assertion_list_for_editing( assertion ) );
        cb_note_edit_change( $str271$Recanonicalize_Assertion, T, ONE_INTEGER, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 43874L)
  public static SubLObject cb_link_recanonicalize(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str273$_Recanonicalize_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str274$cb_recanonicalize__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 44276L)
  public static SubLObject cb_wff(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str278$WFF_Check_Sentence;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$55 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw47$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw48$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$56 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str50$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str52$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str54$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
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
            html_utilities.html_markup( $str136$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str279$cb_handle_wff, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw276$CB_WFF, NIL, UNPROVIDED );
              html_utilities.html_reset_input( $str280$Clear );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str278$WFF_Check_Sentence, UNPROVIDED, UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_form_widgets.cb_mt_input_section( $const281$UniversalVocabularyMt, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cb_form_widgets.cb_el_sentence_input_section( NIL, $list282 );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$56, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$55, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 44895L)
  public static SubLObject cb_link_wff(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str284$WFF_Check;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw285$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str286$cb_wff );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 45175L)
  public static SubLObject cb_handle_wff(final SubLObject args)
  {
    return cb_wff_check_formula( args, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 45259L)
  public static SubLObject cb_wff_check_formula(final SubLObject args, SubLObject assert_modeP)
  {
    if( assert_modeP == UNPROVIDED )
    {
      assert_modeP = NIL;
    }
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
    final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input( args, $list292 );
    final SubLObject sentence_error = thread.secondMultipleValue();
    final SubLObject sentence_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sentence_error )
    {
      return cb_form_widgets.cb_el_sentence_error( sentence_error, sentence_string, UNPROVIDED );
    }
    return cb_wff_check_sentence_int( sentence, mt, T, assert_modeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 45857L)
  public static SubLObject cb_wff_check_formula_ok(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str293$Sentence_is_Well_Formed;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$60 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw47$CB_CYC );
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
        final SubLObject _prev_bind_0_$61 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str50$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str52$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str54$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
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
            final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw37$CB_WFF_CHECK_FORMULA, NIL, UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str55$Mt___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str56$Sentence___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_form( sentence, ZERO_INTEGER, T );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str294$WFF_Status___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_princ( $str295$OK );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$64, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$62, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$61, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$60, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 47110L)
  public static SubLObject cb_assert(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    else
    {
      cb_assert_internal( $kw165$DEFAULT, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 47304L)
  public static SubLObject cb_handle_assert(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str298$assertions );
      return NIL;
    }
    if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str299$wff_check, args ) ) )
    {
      return cb_wff_check_formula( args, T );
    }
    thread.resetMultipleValues();
    final SubLObject error = cb_extract_some_assert_arguments( args );
    final SubLObject mt = thread.secondMultipleValue();
    final SubLObject sentence = thread.thirdMultipleValue();
    final SubLObject strength = thread.fourthMultipleValue();
    final SubLObject direction = thread.fifthMultipleValue();
    final SubLObject sentence_string = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      return NIL;
    }
    final SubLObject wff_violations = wff.why_not_wff_assert( sentence, mt, UNPROVIDED );
    if( NIL != wff_violations )
    {
      return cb_attempt_to_repair_and_assert( sentence, mt, strength, direction, args, wff_violations );
    }
    final SubLObject pcase_var;
    final SubLObject queue = pcase_var = reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str300$assertion_queue, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( pcase_var.eql( $kw301$BROWSE ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$browse_forward_inferencesP$.currentBinding( thread );
      final SubLObject _prev_bind_2 = forward.$forward_inference_browsing_callback$.currentBinding( thread );
      final SubLObject _prev_bind_3 = forward.$forward_inference_browsing_callback_more_infoP$.currentBinding( thread );
      try
      {
        control_vars.$browse_forward_inferencesP$.bind( T, thread );
        forward.$forward_inference_browsing_callback$.bind( $sym0$CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING, thread );
        forward.$forward_inference_browsing_callback_more_infoP$.bind( T, thread );
        cb_forward_inference_browser.prepare_to_browse_new_forward_inference( el_utilities.make_ist_sentence( mt, sentence ) );
        ke.ke_assert_now( sentence, mt, strength, direction );
        cb_forward_inference_browser.cleanup_from_browsing_new_forward_inference();
      }
      finally
      {
        forward.$forward_inference_browsing_callback_more_infoP$.rebind( _prev_bind_3, thread );
        forward.$forward_inference_browsing_callback$.rebind( _prev_bind_2, thread );
        control_vars.$browse_forward_inferencesP$.rebind( _prev_bind_0, thread );
      }
      cb_tools.cb_add_sentence_in_mt_to_assertion_history( sentence, mt );
      ke.ke_add_assertion_original_text( sentence, mt, sentence_string, UNPROVIDED );
      return cb_forward_inference_browser.cb_forward_inference_browser( ConsesLow.list( $str302$Forward_propagation_complete___Br ) );
    }
    if( pcase_var.eql( $kw303$NOW ) )
    {
      ke.ke_assert_now( sentence, mt, strength, direction );
      ke.ke_add_assertion_original_text( sentence, mt, sentence_string, T );
    }
    else
    {
      ke.ke_assert( sentence, mt, strength, direction );
      ke.ke_add_assertion_original_text( sentence, mt, sentence_string, UNPROVIDED );
    }
    cb_tools.cb_add_sentence_in_mt_to_assertion_history( sentence, mt );
    return cb_note_edit_change( $str304$EL_Sentence_Assert, T, TWO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 49028L)
  public static SubLObject cb_extract_some_assert_arguments(final SubLObject args)
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
      return Values.values( mt_error, NIL, NIL, NIL, NIL );
    }
    thread.resetMultipleValues();
    final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input( args, $list292 );
    final SubLObject sentence_error = thread.secondMultipleValue();
    final SubLObject sentence_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sentence_error )
    {
      cb_form_widgets.cb_el_sentence_error( sentence_error, sentence_string, UNPROVIDED );
      return Values.values( sentence_error, NIL, NIL, NIL, NIL );
    }
    thread.resetMultipleValues();
    final SubLObject strength = cb_extract_strength_and_direction_input( args, UNPROVIDED );
    final SubLObject direction = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( NIL, mt, sentence, strength, direction, sentence_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 50117L)
  public static SubLObject cb_link_assert(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str308$Assert;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw285$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str309$cb_assert );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 50467L)
  public static SubLObject cb_assert_internal(final SubLObject mode, SubLObject assertion, SubLObject sentence, SubLObject use_sentenceP)
  {
    if( assertion == UNPROVIDED )
    {
      assertion = NIL;
    }
    if( sentence == UNPROVIDED )
    {
      sentence = NIL;
    }
    if( use_sentenceP == UNPROVIDED )
    {
      use_sentenceP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode_data = conses_high.assoc( mode, $cb_assert_modes_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( NIL == mode_data )
    {
      cyc_navigator_internals.generic_message_page( $str315$Fatal_Error, PrintLow.format( NIL, $str316$cb_assert_called_without_a_valid_ ) );
      return NIL;
    }
    SubLObject current;
    final SubLObject datum = current = mode_data;
    SubLObject keyword = NIL;
    SubLObject handler = NIL;
    SubLObject title = NIL;
    SubLObject action_label = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list317 );
    keyword = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list317 );
    handler = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list317 );
    title = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list317 );
    action_label = current.first();
    current = current.rest();
    if( NIL == current )
    {
      thread.resetMultipleValues();
      final SubLObject id = cb_extract_values_for_assert( assertion, sentence, use_sentenceP, handler );
      SubLObject formula = thread.secondMultipleValue();
      final SubLObject mt = thread.thirdMultipleValue();
      final SubLObject direction = thread.fourthMultipleValue();
      SubLObject strength = thread.fifthMultipleValue();
      final SubLObject editing = thread.sixthMultipleValue();
      final SubLObject edit_formula_only = thread.seventhMultipleValue();
      final SubLObject asserted_by = thread.eighthMultipleValue();
      thread.resetMultipleValues();
      if( NIL == strength )
      {
        strength = $kw165$DEFAULT;
      }
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$65 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          html_complete.html_complete_script();
          dhtml_macros.dhtml_with_toggle_visibility_support();
          dhtml_macros.html_basic_cb_scripts();
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$66 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str50$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str136$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( handler, T, UNPROVIDED );
                if( NIL != assertion_handles.assertion_p( assertion ) )
                {
                  html_utilities.html_hidden_input( $str138$id, id, UNPROVIDED );
                }
                else if( NIL != cycl_grammar.cycl_sentence_p( sentence ) )
                {
                  html_utilities.html_hidden_input( $str138$id, cb_parameters.cb_glob_id( sentence ), UNPROVIDED );
                }
                if( $kw318$META == mode )
                {
                  if( NIL == use_sentenceP )
                  {
                    formula = cb_parameters.$cb_assertion_indexical$.getGlobalValue();
                  }
                  html_utilities.html_princ( $str319$Please_use_ );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  cb_utilities.cb_form( cb_parameters.$cb_assertion_indexical$.getGlobalValue(), ZERO_INTEGER, NIL );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                  html_utilities.html_princ( $str320$_to_refer_to_the_following_assert );
                  html_utilities.html_markup( html_macros.$html_blockquote_head$.getGlobalValue() );
                  cb_utilities.cb_show_assertion_readably( assertion, T, T );
                  html_utilities.html_markup( html_macros.$html_blockquote_tail$.getGlobalValue() );
                }
                if( NIL != assertion_handles.assertion_p( assertion ) && ( $kw239$EDIT == mode || $kw105$FIX_TYPO == mode ) && NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) )
                {
                  final SubLObject color_val = $kw139$RED;
                  html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                  if( NIL != color_val )
                  {
                    html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_color( color_val ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ_strong( $str140$Note___This_assertion_has_meta_as );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$69, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                  html_utilities.html_newline( TWO_INTEGER );
                }
                cb_utilities.cb_help_preamble( $kw313$CB_ASSERT_INTERNAL, NIL, UNPROVIDED );
                html_utilities.html_reset_input( $str321$Reset_All_Fields );
                html_utilities.html_indent( ONE_INTEGER );
                html_utilities.html_submit_input( action_label, $str322$assert, UNPROVIDED );
                html_utilities.html_indent( ONE_INTEGER );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                if( mode == $kw165$DEFAULT || mode == $kw323$SIMILAR )
                {
                  final SubLObject assertion_queue_input_name = $str300$assertion_queue;
                  html_utilities.html_radio_input( assertion_queue_input_name, $str324$_local, Equality.eq( cb_parameters.$cb_assert_queue_default$.getDynamicValue( thread ), $kw325$LOCAL ), $str324$_local );
                  html_utilities.html_indent( ONE_INTEGER );
                  html_utilities.html_princ( $str326$Assert_using_Local_queue );
                  html_utilities.html_indent( THREE_INTEGER );
                  html_utilities.html_markup( html_macros.$html_label_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_label_for$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( $str327$_browse ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_radio_input( assertion_queue_input_name, $str327$_browse, Equality.eq( cb_parameters.$cb_assert_queue_default$.getDynamicValue( thread ), $kw301$BROWSE ), $str327$_browse );
                    html_utilities.html_indent( ONE_INTEGER );
                    html_utilities.html_princ( $str328$Assert_now_and_browse_forward_inf );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_label_tail$.getGlobalValue() );
                  html_utilities.html_indent( TWO_INTEGER );
                  html_utilities.html_markup( html_macros.$html_label_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_label_for$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_color( $str329$_now ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_radio_input( assertion_queue_input_name, $str329$_now, Equality.eq( cb_parameters.$cb_assert_queue_default$.getDynamicValue( thread ), $kw303$NOW ), $str329$_now );
                    html_utilities.html_indent( ONE_INTEGER );
                    html_utilities.html_princ( $str330$Assert_now__bypassing_Local_queue );
                    html_utilities.html_indent( THREE_INTEGER );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$71, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_label_tail$.getGlobalValue() );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                }
                dhtml_macros.dhtml_switch_visibility_links( $str331$cb_assert_parameters, $str332$Show, $str333$Hide );
                html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( $str334$Assert_Context );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                final SubLObject initial_visibility = $kw335$INVISIBLE;
                dhtml_macros.dhtml_set_switched_visibility( $str331$cb_assert_parameters, initial_visibility, $kw336$PARAGRAPH );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str331$cb_assert_parameters );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  cb_strength_and_direction_section( strength, direction, ConsesLow.list( $kw337$EDIT_ONLY, edit_formula_only ) );
                  final SubLObject display_options = ConsesLow.list( $kw338$EDIT_ALLOWED_, makeBoolean( NIL == edit_formula_only ), $kw339$MONAD_CHOICES, $list340, $kw341$ANYTIME_PSC_ALLOWED_, NIL );
                  cb_form_widgets.cb_mt_input_section( mt, display_options );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$72, thread );
                }
                html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                final SubLObject choices = cb_assert_sentence_constant_suggestions( mode );
                final SubLObject display_options2 = ConsesLow.list( new SubLObject[] { $kw342$INPUT_NAME, $str343$sentence, $kw344$COMPLETE_LABEL, $str345$Complete, $kw346$CYCLIFY_LABEL, $str347$Cyclify,
                  $kw348$CLEAR_LABEL, $str349$Clear_Sentence, $kw350$HEIGHT, TWENTY_INTEGER, $kw351$WIDTH, $int352$80, $kw353$MODE, $kw306$ASSERT, $kw354$CHOICES, choices
                } );
                cb_form_widgets.cb_el_sentence_input_section( formula, display_options2 );
                if( NIL != assertion_handles.assertion_p( assertion ) && ( $kw239$EDIT == mode || $kw105$FIX_TYPO == mode ) )
                {
                  cb_tabulate_checkable_meta_assertions( assertion, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$68, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
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
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list317 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 55582L)
  public static SubLObject cb_assert_sentence_constant_suggestions(final SubLObject mode)
  {
    if( mode.eql( $kw318$META ) )
    {
      return $list355;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 55826L)
  public static SubLObject cb_extract_values_for_assert(final SubLObject assertion, final SubLObject sentence, final SubLObject use_sentenceP, final SubLObject handler)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject id = NIL;
    SubLObject formula = NIL;
    SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
    SubLObject direction = NIL;
    SubLObject strength = NIL;
    SubLObject editing = NIL;
    SubLObject edit_formula_only = NIL;
    SubLObject asserted_by = NIL;
    final SubLObject assertion_specifiedP = assertion_handles.assertion_p( assertion );
    final SubLObject sentence_specifiedP = el_utilities.possibly_sentence_p( sentence );
    final SubLObject ist_sentenceP = el_utilities.ist_sentence_p( sentence, UNPROVIDED );
    if( NIL != cb_parameters.$cb_default_mt$.getDynamicValue( thread ) )
    {
      mt = cb_parameters.$cb_default_mt$.getDynamicValue( thread );
    }
    if( NIL != sentence_specifiedP )
    {
      if( NIL != ist_sentenceP )
      {
        mt = el_utilities.designated_mt( sentence );
        formula = el_utilities.designated_sentence( sentence );
      }
      else
      {
        formula = sentence;
      }
    }
    if( NIL != assertion_specifiedP )
    {
      if( NIL == ist_sentenceP || NIL == use_sentenceP )
      {
        mt = assertions_high.assertion_mt( assertion );
      }
      if( NIL == sentence_specifiedP || NIL == use_sentenceP )
      {
        formula = ke.ke_assertion_edit_formula( assertion );
      }
      id = assertion_handles.assertion_id( assertion );
      direction = assertions_high.assertion_direction( assertion );
      strength = assertions_high.assertion_strength( assertion );
      editing = makeBoolean( $str356$cb_handle_fix_typo.equal( handler ) || $str357$cb_handle_edit.equal( handler ) || $str358$cb_handle_sentence_edit.equal( handler ) );
      edit_formula_only = Equality.equal( $str356$cb_handle_fix_typo, handler );
      asserted_by = ( NIL != assertions_high.asserted_assertionP( assertion ) ) ? assertions_high.asserted_by( assertion ) : NIL;
    }
    return Values.values( id, formula, mt, direction, strength, editing, edit_formula_only, asserted_by );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 57528L)
  public static SubLObject cb_tabulate_checkable_meta_assertions(final SubLObject assertion, SubLObject newlines_before_message, SubLObject checkbox_name_prefix, SubLObject message, SubLObject meta_assertions_checkedP)
  {
    if( newlines_before_message == UNPROVIDED )
    {
      newlines_before_message = ZERO_INTEGER;
    }
    if( checkbox_name_prefix == UNPROVIDED )
    {
      checkbox_name_prefix = $str152$preserve_;
    }
    if( message == UNPROVIDED )
    {
      message = $str359$Choose_analogous_meta_assertions_;
    }
    if( meta_assertions_checkedP == UNPROVIDED )
    {
      meta_assertions_checkedP = cb_parameters.$cb_a_edit_preserve_meta_assertions_by_defaultP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_utilities.assertion_has_meta_assertionsP( assertion ) )
    {
      html_utilities.html_newline( newlines_before_message );
      html_utilities.html_princ_strong( message );
      final SubLObject all_meta_assertions = assertion_utilities.all_meta_assertions( assertion );
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject cdolist_list_var = all_meta_assertions;
        SubLObject meta_assertion = NIL;
        meta_assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == assertion_utilities.gaf_assertion_with_pred_p( meta_assertion, $const360$assertionOriginalText ) )
          {
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw226$LEFT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                final SubLObject meta_assertion_checkbox_value = assertion_handles.assertion_id( meta_assertion );
                final SubLObject meta_assertion_checkbox_name = PrintLow.format( NIL, $str361$_a_S, checkbox_name_prefix, meta_assertion_checkbox_value );
                html_utilities.html_checkbox_input( meta_assertion_checkbox_name, meta_assertion_checkbox_value, meta_assertions_checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$74, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw226$LEFT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_show_meta_assertion_readably( meta_assertion, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$75, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$73, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          cdolist_list_var = cdolist_list_var.rest();
          meta_assertion = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 58731L)
  public static SubLObject cb_show_meta_assertion_readably(final SubLObject meta_assertion, final SubLObject assertion, SubLObject assertion_indexical, SubLObject wrapP, SubLObject include_mtP)
  {
    if( assertion_indexical == UNPROVIDED )
    {
      assertion_indexical = $const362$TheAssertionSentence;
    }
    if( wrapP == UNPROVIDED )
    {
      wrapP = T;
    }
    if( include_mtP == UNPROVIDED )
    {
      include_mtP = T;
    }
    return cb_utilities.cb_show_assertion_readably( meta_assertion, wrapP, include_mtP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 59094L)
  public static SubLObject cb_extract_mt_from_string(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject mt = cb_utilities.cb_guess_hlmt( string );
    if( NIL == hlmt.hlmt_p( mt ) )
    {
      cb_utilities.cb_error( $str364$_S_did_not_specify_a_microtheory_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    if( NIL == cb_valid_microtheoryP( mt ) )
    {
      cb_utilities.cb_error( $str365$_S_is_not_a_microtheory_, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 59599L)
  public static SubLObject cb_valid_microtheoryP(final SubLObject mt)
  {
    return makeBoolean( NIL != mt && NIL != hlmt.possibly_hlmt_p( mt ) && NIL != isa.isa_in_any_mtP( mt, $const366$Microtheory ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 59861L)
  public static SubLObject cb_extract_formula_from_string(final SubLObject string, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != Types.stringp( string ) : string;
    final SubLObject sentence = reader.read_from_string_ignoring_errors( string, NIL, NIL, UNPROVIDED, UNPROVIDED );
    if( NIL == el_utilities.possibly_sentence_p( sentence ) )
    {
      cb_utilities.cb_error( $str367$Bad_sentence__probably_due_to_a_m, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    if( NIL != mt )
    {
      final SubLObject wff_violations = wff.why_not_wff( sentence, mt, UNPROVIDED );
      if( NIL != wff_violations )
      {
        return cb_explain_why_not_wff( sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 60625L)
  public static SubLObject cb_wff_check_sentence_int(final SubLObject sentence, final SubLObject mt, SubLObject show_ok_pageP, SubLObject assert_modeP)
  {
    if( show_ok_pageP == UNPROVIDED )
    {
      show_ok_pageP = T;
    }
    if( assert_modeP == UNPROVIDED )
    {
      assert_modeP = NIL;
    }
    SubLObject wff_violations = NIL;
    if( NIL != assert_modeP )
    {
      wff_violations = wff.why_not_wff_assert( sentence, mt, UNPROVIDED );
    }
    else
    {
      wff_violations = wff.why_not_wff( sentence, mt, UNPROVIDED );
    }
    if( NIL != wff_violations )
    {
      cb_explain_why_not_wff( sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != show_ok_pageP )
    {
      cb_wff_check_formula_ok( sentence, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 61048L)
  public static SubLObject cb_assert_formula(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    else
    {
      SubLObject formula_id = NIL;
      SubLObject mt_id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list368 );
      formula_id = args.first();
      SubLObject current = args.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, args, $list368 );
      mt_id = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject formula = cb_parameters.cb_glob_lookup_by_string( formula_id );
        final SubLObject mt = cb_utilities.cb_guess_fort( mt_id, UNPROVIDED );
        final SubLObject sentence = ConsesLow.list( $const369$ist, mt, formula );
        cb_assert_internal( $kw165$DEFAULT, NIL, sentence, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list368 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 61590L)
  public static SubLObject cb_link_assert_formula(final SubLObject formula, SubLObject mt, SubLObject linktext)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == mt )
    {
      mt = $const371$BaseKB;
    }
    if( NIL == linktext )
    {
      linktext = $str372$_Assert_Formula_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str373$cb_assert_formula__A__A, cb_parameters.cb_glob_id( formula ), cb_utilities.cb_fort_identifier( mt ) );
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
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 61916L)
  public static SubLObject cb_similar(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        if( NIL == assertion_handles.assertion_p( assertion ) )
        {
          cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return NIL;
        }
        cb_assert_internal( $kw323$SIMILAR, assertion, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 62330L)
  public static SubLObject cb_link_assert_similar(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str377$_Assert_Similar_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str378$cb_similar__a, assertion_handles.assertion_id( assertion ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 62595L)
  public static SubLObject cb_assert_meta(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    SubLObject id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
    id = args.first();
    final SubLObject current = args.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      return NIL;
    }
    final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    return cb_assert_internal( $kw318$META, assertion, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 63012L)
  public static SubLObject cb_handle_assert_meta(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str381$editing );
      return NIL;
    }
    final SubLObject id = html_utilities.html_extract_input( $str138$id, args );
    final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      return cb_utilities.cb_error( $str269$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject error = cb_extract_some_assert_arguments( args );
    final SubLObject mt = thread.secondMultipleValue();
    SubLObject sentence = thread.thirdMultipleValue();
    final SubLObject strength = thread.fourthMultipleValue();
    final SubLObject direction = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      return NIL;
    }
    if( NIL == list_utilities.tree_find( cb_parameters.$cb_assertion_indexical$.getGlobalValue(), sentence, UNPROVIDED, UNPROVIDED ) )
    {
      return cb_utilities.cb_error( $str382$The_sentence_did_not_mention__S_, cb_parameters.$cb_assertion_indexical$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject assertion_sentence = uncanonicalizer.assertion_el_ist_formula( assertion );
    sentence = conses_high.subst( assertion_sentence, cb_parameters.$cb_assertion_indexical$.getGlobalValue(), sentence, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str299$wff_check, args ) ) )
    {
      return cb_wff_check_sentence_int( sentence, mt, T, UNPROVIDED );
    }
    final SubLObject wff_violations = wff.why_not_wff_assert( sentence, mt, UNPROVIDED );
    if( NIL != wff_violations )
    {
      return cb_attempt_to_repair_and_assert( sentence, mt, strength, direction, args, wff_violations );
    }
    ke.ke_assert( sentence, mt, strength, direction );
    return cb_note_edit_change( $str383$EL_Meta_Sentence_Assert, T, THREE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 64512L)
  public static SubLObject cb_link_assert_meta(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str385$_Assert_Meta_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str386$cb_assert_meta__a, assertion_handles.assertion_id( assertion ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 64772L)
  public static SubLObject cb_suggest_pragmas(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        if( NIL == assertion_handles.assertion_p( assertion ) )
        {
          cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return NIL;
        }
        cb_suggest_pragmas_guts( assertion );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 65214L)
  public static SubLObject cb_link_suggest_pragmas(final SubLObject rule, SubLObject linktext, SubLObject disabledP, SubLObject target)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = NIL;
    }
    if( target == UNPROVIDED )
    {
      target = $kw83$SELF;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str389$_Suggest_Pragmas_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( target );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str390$cb_suggest_pragmas__a, assertion_handles.assertion_id( rule ) );
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
    return rule;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 65549L)
  public static SubLObject cb_suggest_pragmas_guts(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pragmas = pragma_induction.rule_suggested_pragma_sentences( rule, UNPROVIDED );
    final SubLObject title_var = $str392$Suggested_Pragmas;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$76 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw47$CB_CYC );
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
        final SubLObject _prev_bind_0_$77 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str50$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str52$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str54$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$79, thread );
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
            final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw393$CB_SUGGEST_PRAGMAS, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str394$Pragmatic_requirements_worth_cons );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_show_assertion_readably( rule, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject cdolist_list_var = pragmas;
                SubLObject pragma = NIL;
                pragma = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      final SubLObject pragmatic_requirement = el_utilities.make_binary_formula( $const395$pragmaticRequirement, pragma, $const362$TheAssertionSentence );
                      cb_utilities.cb_link( $kw396$ASSERT_SUGGESTED_PRAGMA, rule, pragmatic_requirement, $str397$_Assert_, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$83, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_glyph( $kw398$NBSP, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$84, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_utilities.cb_show_term( pragma, ZERO_INTEGER, T );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$85, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$82, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  pragma = cdolist_list_var.first();
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$81, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$80, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$78, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$77, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$76, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 66385L)
  public static SubLObject cb_link_assert_suggested_pragma(final SubLObject assertion, final SubLObject pragma, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str397$_Assert_;
    }
    final SubLObject id = assertion_handles.assertion_id( assertion );
    final SubLObject encoded_pragma = cb_utilities.cb_string_for_sentence( pragma );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str399$cb_assert_suggested_pragma__a__a, id, encoded_pragma );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 66765L)
  public static SubLObject cb_assert_suggested_pragma(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    SubLObject id_string = NIL;
    SubLObject pragma_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list401 );
    id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list401 );
    pragma_string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( id_string );
      final SubLObject pragma = cb_utilities.cb_guess_sentence( pragma_string );
      return cb_assert_internal( $kw318$META, assertion, pragma, T );
    }
    cdestructuring_bind.cdestructuring_bind_error( args, $list401 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 67126L)
  public static SubLObject without_arg_format_and_relator_checking(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym403$CLET, $list404, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 67585L)
  public static SubLObject cb_edit(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        if( NIL == assertion_handles.assertion_p( assertion ) )
        {
          cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return NIL;
        }
        cb_assert_internal( $kw239$EDIT, assertion, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 67950L)
  public static SubLObject cb_handle_edit(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str381$editing );
      return NIL;
    }
    if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str299$wff_check, args ) ) )
    {
      return cb_wff_check_formula( args, NIL );
    }
    final SubLObject id = html_utilities.html_extract_input( $str138$id, args );
    final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      return cb_utilities.cb_error( $str269$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject error = cb_extract_some_assert_arguments( args );
    final SubLObject mt = thread.secondMultipleValue();
    final SubLObject sentence = thread.thirdMultipleValue();
    final SubLObject strength = thread.fourthMultipleValue();
    final SubLObject direction = thread.fifthMultipleValue();
    final SubLObject sentence_string = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      return NIL;
    }
    SubLObject wff_violations = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    try
    {
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      wff_violations = wff.why_not_wff( sentence, mt, UNPROVIDED );
    }
    finally
    {
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_2, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != wff_violations )
    {
      cb_explain_why_not_wff( sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args( assertion, args, UNPROVIDED, UNPROVIDED );
    cb_edit_assertion_hook( assertion, sentence, mt, strength, direction, meta_assertions_to_preserve, sentence_string );
    return cb_note_edit_change( $str406$Assertion_Edit, T, THREE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 69587L)
  public static SubLObject cb_extract_meta_assertions_from_args(final SubLObject assertion, final SubLObject args, SubLObject start_with_prefix, SubLObject new_meta_assertion_mt)
  {
    if( start_with_prefix == UNPROVIDED )
    {
      start_with_prefix = $str152$preserve_;
    }
    if( new_meta_assertion_mt == UNPROVIDED )
    {
      new_meta_assertion_mt = NIL;
    }
    SubLObject meta_assertions_to_preserve = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isCons() )
      {
        SubLObject current;
        final SubLObject datum = current = arg;
        SubLObject input_name = NIL;
        SubLObject assertion_id_string = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list408 );
        input_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list408 );
        assertion_id_string = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != string_utilities.starts_with( input_name, start_with_prefix ) )
          {
            final SubLObject meta_assertion = cb_utilities.cb_guess_assertion( assertion_id_string );
            final SubLObject meta_assertion_mt = ( NIL != new_meta_assertion_mt ) ? new_meta_assertion_mt : assertions_high.assertion_mt( meta_assertion );
            if( NIL != assertion_handles.assertion_p( meta_assertion ) && NIL != cycl_utilities.expression_find( assertion, meta_assertion, T, UNPROVIDED, UNPROVIDED ) )
            {
              meta_assertions_to_preserve = ConsesLow.cons( ConsesLow.list( meta_assertion, meta_assertion_mt ), meta_assertions_to_preserve );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list408 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Sequences.nreverse( meta_assertions_to_preserve );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 70537L)
  public static SubLObject cb_link_edit_assertion(final SubLObject assertion, SubLObject linktext, SubLObject disabledP, SubLObject target)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = NIL;
    }
    if( target == UNPROVIDED )
    {
      target = $kw83$SELF;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str409$_Edit_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( target );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str410$cb_edit__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 70877L)
  public static SubLObject cb_handle_edit_assertion(final SubLObject args)
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
          final SubLObject _prev_bind_0_$86 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str412$error, NIL, NIL, NIL, $kw46$UNINITIALIZED );
            final SubLObject _prev_bind_0_$87 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw46$UNINITIALIZED, thread );
              PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str413$_S, cyc_navigator_internals.guest_warn_string( $str414$assertion_editing_facilities ) );
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$87, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$86, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str412$error );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$88, thread );
          }
        }
        return NIL;
      }
      SubLObject problem_sentence_info = NIL;
      SubLObject good_sentence_info = NIL;
      final SubLObject assertion_id_to_delete = html_utilities.html_extract_sexpr( $str416$oldAssertionId, args, UNPROVIDED );
      final SubLObject assertion_to_delete = ( NIL != assertion_id_to_delete ) ? assertion_handles.find_assertion_by_id( assertion_id_to_delete ) : NIL;
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != list_utilities.proper_list_p( arg ) )
        {
          final SubLObject param = arg.first();
          if( NIL != string_utilities.starts_with( param, $str343$sentence ) )
          {
            final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input( args, ConsesLow.list( $kw342$INPUT_NAME, param ) );
            final SubLObject sentence_num = Sequences.subseq( param, EIGHT_INTEGER, UNPROVIDED );
            if( NIL != wff.el_wffP( sentence, UNPROVIDED, UNPROVIDED ) )
            {
              good_sentence_info = ConsesLow.cons( ConsesLow.list( $kw417$SENTENCE_NUM, sentence_num, $kw22$SENTENCE, sentence ), good_sentence_info );
            }
            else
            {
              problem_sentence_info = ConsesLow.cons( ConsesLow.list( $kw417$SENTENCE_NUM, sentence_num, $kw22$SENTENCE, html_utilities.html_extract_input( param, args ), $kw418$MESSAGE, wff
                  .explanation_of_why_not_wff_terse( sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first() ), problem_sentence_info );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
      if( NIL == problem_sentence_info )
      {
        if( NIL != assertion_to_delete && NIL != list_utilities.lengthE( good_sentence_info, ONE_INTEGER, UNPROVIDED ) )
        {
          final SubLObject to_add = conses_high.getf( good_sentence_info.first(), $kw22$SENTENCE, UNPROVIDED );
          thread.resetMultipleValues();
          final SubLObject successP = ke.ke_edit_now( uncanonicalizer.assertion_el_formula( assertion_to_delete ), to_add, assertions_high.assertion_mt( assertion_to_delete ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          final SubLObject err_msg = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL == successP )
          {
            problem_sentence_info = ConsesLow.cons( ConsesLow.list( $kw22$SENTENCE, to_add, $kw417$SENTENCE_NUM, conses_high.getf( good_sentence_info.first(), $kw417$SENTENCE_NUM, UNPROVIDED ), $kw418$MESSAGE,
                string_utilities.bunge( wff.explanation_of_why_not_wff_terse_assert( to_add, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Characters.CHAR_newline ) ), problem_sentence_info );
          }
        }
        else
        {
          if( NIL != assertion_to_delete )
          {
            ke.ke_unassert_assertion_now( assertion_to_delete );
          }
          cdolist_list_var = good_sentence_info;
          SubLObject sentence_info = NIL;
          sentence_info = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject sentence2 = conses_high.getf( sentence_info, $kw22$SENTENCE, UNPROVIDED );
            thread.resetMultipleValues();
            final SubLObject successP2 = ke.ke_assert_now( sentence2, $const371$BaseKB, UNPROVIDED, UNPROVIDED );
            final SubLObject msg = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL == successP2 )
            {
              problem_sentence_info = ConsesLow.cons( ConsesLow.list( $kw22$SENTENCE, sentence2, $kw417$SENTENCE_NUM, conses_high.getf( sentence_info, $kw417$SENTENCE_NUM, UNPROVIDED ), $kw418$MESSAGE, msg ),
                  problem_sentence_info );
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence_info = cdolist_list_var.first();
          }
        }
      }
      try
      {
        final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str419$response, NIL, NIL, NIL, $kw46$UNINITIALIZED );
          final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw46$UNINITIALIZED, thread );
            if( NIL != problem_sentence_info )
            {
              try
              {
                final SubLObject _prev_bind_0_$91 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str412$error, NIL, NIL, NIL, $kw46$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw46$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var2 = problem_sentence_info;
                    SubLObject sentence_info2 = NIL;
                    sentence_info2 = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      final SubLObject sentence3 = conses_high.getf( sentence_info2, $kw22$SENTENCE, UNPROVIDED );
                      final SubLObject error_message = conses_high.getf( sentence_info2, $kw418$MESSAGE, $kw420$NOT_WELL_FORMED );
                      final SubLObject attrs = ConsesLow.list( $str138$id, conses_high.getf( sentence_info2, $kw417$SENTENCE_NUM, UNPROVIDED ) );
                      try
                      {
                        final SubLObject _prev_bind_0_$93 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str421$invalidSentence, attrs, NIL, NIL, $kw46$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$94 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw46$UNINITIALIZED, thread );
                            xml_utilities.xml_cdata( format_nil.format_nil_s( sentence3 ) );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$94, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$93, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$93, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values2 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str421$invalidSentence );
                          Values.restoreValuesFromVector( _values2 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$95, thread );
                        }
                      }
                      try
                      {
                        final SubLObject _prev_bind_0_$96 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str422$message, NIL, NIL, NIL, $kw46$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$97 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw46$UNINITIALIZED, thread );
                            xml_utilities.xml_cdata( error_message );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$97, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$94, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$96, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$98 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values3 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str422$message );
                          Values.restoreValuesFromVector( _values3 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$98, thread );
                        }
                      }
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      sentence_info2 = cdolist_list_var2.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$92, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$92, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$91, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str412$error );
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$99, thread );
                }
              }
            }
            else
            {
              final SubLObject attrs2 = ConsesLow.list( $str423$count, string_utilities.to_string( Sequences.length( good_sentence_info ) ) );
              try
              {
                final SubLObject _prev_bind_0_$100 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$95 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str424$assertionsQueued, attrs2, NIL, NIL, $kw46$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$101 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw46$UNINITIALIZED, thread );
                    PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str425$_A_assertion_P_added_to_the_local, Sequences.length( good_sentence_info ), Sequences.length( good_sentence_info ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$101, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$95, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$100, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$102 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values5 = Values.getValuesAsVector();
                  xml_utilities.xml_end_tag_internal( $str424$assertionsQueued );
                  Values.restoreValuesFromVector( _values5 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$102, thread );
                }
              }
              if( NIL != assertion_to_delete )
              {
                final SubLObject attrs_$107 = $list426;
                try
                {
                  final SubLObject _prev_bind_0_$103 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                  try
                  {
                    xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                    xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                    xml_utilities.xml_start_tag_internal( $str427$unassertedQueued, attrs_$107, NIL, NIL, $kw46$UNINITIALIZED );
                    final SubLObject _prev_bind_0_$104 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                    try
                    {
                      xml_vars.$xml_default_namespace$.bind( $kw46$UNINITIALIZED, thread );
                      PrintLow.format( xml_vars.$xml_stream$.getDynamicValue( thread ), $str428$_A_unassert__P_added_to_the_local, ONE_INTEGER );
                    }
                    finally
                    {
                      xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$104, thread );
                    }
                  }
                  finally
                  {
                    xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$96, thread );
                    xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$103, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$105 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values6 = Values.getValuesAsVector();
                    xml_utilities.xml_end_tag_internal( $str427$unassertedQueued );
                    Values.restoreValuesFromVector( _values6 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$105, thread );
                  }
                }
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$90, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$89, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values7 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str419$response );
          Values.restoreValuesFromVector( _values7 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$106, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 74287L)
  public static SubLObject cb_handle_sentence_edit(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str381$editing );
      return NIL;
    }
    final SubLObject id = html_utilities.html_extract_input( $str138$id, args );
    final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string( id );
    if( NIL == el_utilities.ist_sentence_p( sentence, UNPROVIDED ) )
    {
      return cb_utilities.cb_error( $str431$_S_did_not_specify_a_CycL_sentenc, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject error = cb_extract_some_assert_arguments( args );
    final SubLObject new_mt = thread.secondMultipleValue();
    final SubLObject new_sentence = thread.thirdMultipleValue();
    final SubLObject new_strength = thread.fourthMultipleValue();
    final SubLObject new_direction = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      return NIL;
    }
    SubLObject wff_violations = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    try
    {
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      wff_violations = wff.why_not_wff_assert( new_sentence, new_mt, UNPROVIDED );
    }
    finally
    {
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_2, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != wff_violations )
    {
      return cb_explain_why_not_wff( new_sentence, new_mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject old_sentence = cycl_utilities.formula_arg2( sentence, UNPROVIDED );
    final SubLObject old_mt = cycl_utilities.formula_arg1( sentence, UNPROVIDED );
    cb_handle_sentence_edit_int( old_sentence, old_mt, new_sentence, new_mt, new_strength, new_direction );
    return cb_note_edit_change( $str406$Assertion_Edit, T, THREE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 75667L)
  public static SubLObject cb_handle_sentence_edit_int(final SubLObject old_sentence, final SubLObject old_mt, final SubLObject new_sentence, final SubLObject new_mt, final SubLObject new_strength,
      final SubLObject new_direction)
  {
    cb_tools.cb_rem_from_sentence_history( el_utilities.make_ist_sentence( old_mt, old_sentence ) );
    cb_tools.cb_add_sentence_in_mt_to_assertion_history( new_sentence, new_mt );
    return ke.ke_edit( old_sentence, new_sentence, old_mt, new_mt, new_strength, new_direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 76008L)
  public static SubLObject cb_fix_typo_edit(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str433$the_Cyc_KB_typo_fixing_facilities );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list134 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        if( NIL == assertion_handles.assertion_p( assertion ) )
        {
          cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return NIL;
        }
        cb_assert_internal( $kw105$FIX_TYPO, assertion, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list134 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 76451L)
  public static SubLObject cb_link_fix_typo(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str435$_Fix_Typo_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str436$cb_fix_typo_edit__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 76769L)
  public static SubLObject cb_handle_fix_typo(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str433$the_Cyc_KB_typo_fixing_facilities );
      return NIL;
    }
    if( NIL != list_utilities.sublisp_boolean( html_utilities.html_extract_input( $str299$wff_check, args ) ) )
    {
      return cb_wff_check_formula( args, T );
    }
    final SubLObject id = html_utilities.html_extract_input( $str138$id, args );
    final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      return cb_utilities.cb_error( $str269$_S_did_not_specify_an_assertion_, args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject error = cb_extract_some_assert_arguments( args );
    final SubLObject mt = thread.secondMultipleValue();
    final SubLObject sentence = thread.thirdMultipleValue();
    final SubLObject strength = thread.fourthMultipleValue();
    final SubLObject direction = thread.fifthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error )
    {
      return NIL;
    }
    final SubLObject old_sentence = ke.ke_assertion_edit_formula( assertion );
    if( NIL == ke.formulas_differ_only_in_strings( old_sentence, sentence, $sym438$CYCL_STRING_P ) )
    {
      return cb_utilities.cb_error( $str439$Edited_sentence_does_not_differ_o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject wff_violations = NIL;
    final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
    try
    {
      at_vars.$at_check_arg_formatP$.bind( NIL, thread );
      at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
      wff_violations = wff.why_not_wff_assert( sentence, mt, UNPROVIDED );
    }
    finally
    {
      at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_2, thread );
      at_vars.$at_check_arg_formatP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != wff_violations )
    {
      return cb_explain_why_not_wff( sentence, mt, wff_violations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args( assertion, args, UNPROVIDED, UNPROVIDED );
    cb_edit_assertion_strings_hook( assertion, sentence, meta_assertions_to_preserve );
    return cb_note_edit_change( $str406$Assertion_Edit, T, THREE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 78951L)
  public static SubLObject cb_fix_typo_assertionP(final SubLObject assertion)
  {
    return cycl_utilities.assertion_find_if( Symbols.symbol_function( $sym363$STRINGP ), assertion, T, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 79068L)
  public static SubLObject cb_reassert(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    else
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
      if( NIL == assertion_handles.assertion_p( assertion ) )
      {
        cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cb_null_edit_assertion_hook( assertion );
        cb_note_edit_change( $str441$Reassert, T, TWO_INTEGER, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 79495L)
  public static SubLObject cb_link_reassert(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str443$_Reassert_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str444$cb_reassert__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 79811L)
  public static SubLObject cb_unassert(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    else
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
      if( NIL == assertion_handles.assertion_p( assertion ) )
      {
        cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cb_tools.cb_rem_from_assertion_history( assertion );
        ke.ke_unassert_assertion( assertion );
        cb_note_edit_change( $str446$Unassert, T, TWO_INTEGER, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 80276L)
  public static SubLObject cb_link_unassert(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str448$_Unassert_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str449$cb_unassert__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 80592L)
  public static SubLObject cb_blast(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    else
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
      if( NIL == assertion_handles.assertion_p( assertion ) )
      {
        cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cb_tools.cb_rem_from_assertion_history( assertion );
        ke.ke_blast_assertion( assertion );
        cb_note_edit_change( $str451$Assertion_Blast, T, TWO_INTEGER, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 81049L)
  public static SubLObject cb_link_blast(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str453$_Blast_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str454$cb_blast__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 81353L)
  public static SubLObject cb_remove_deduction(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    SubLObject id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list456 );
    id_string = args.first();
    final SubLObject current = args.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list456 );
      return NIL;
    }
    final SubLObject deduction = cb_utilities.cb_guess_deduction( id_string );
    if( NIL == deduction_handles.deduction_p( deduction ) )
    {
      return cb_utilities.cb_error( $str457$_a_does_not_specify_a_deduction, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    ke.ke_remove_deduction( deduction );
    return cb_note_edit_change( $str458$Deduction_Removal, T, TWO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 81852L)
  public static SubLObject cb_link_remove_deduction(final SubLObject deduction, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str460$_Remove_Deduction_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str461$cb_remove_deduction__a, deduction_handles.deduction_id( deduction ) );
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
    return deduction;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 82189L)
  public static SubLObject cb_assertion_tms(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str86$the_Cyc_KB_editing_facilities );
    }
    else
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
      if( NIL == assertion_handles.assertion_p( assertion ) )
      {
        cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        ke.ke_tms_reconsider_assertion( assertion );
        cb_note_edit_change( $str464$Redo_TMS_for_Assertion, T, TWO_INTEGER, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 82719L)
  public static SubLObject cb_link_assert_tms(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
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
      linktext = $str466$_Redo_TMS_;
    }
    if( NIL != disabledP )
    {
      cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str467$cb_assertion_tms__a, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 83224L)
  public static SubLObject cb_diagnose_assertion(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str471$the_Assertion_Diagnostics_page );
    }
    else
    {
      final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
      if( NIL == assertion_handles.assertion_p( assertion ) )
      {
        cb_utilities.cb_error( $str472$_a_does_not_specify_a_Cyc_asserti, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      final SubLObject title_var = $str473$Assertion_Diagnostics;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$113 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw47$CB_CYC );
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
          final SubLObject _prev_bind_0_$114 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str50$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str51$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str52$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str53$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str54$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$116, thread );
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
              final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                cb_utilities.cb_help_preamble( $kw469$CB_DIAGNOSE_ASSERTION, UNPROVIDED, UNPROVIDED );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str474$Diagnosis_of__ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                cb_utilities.cb_show_assertion_readably( assertion, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                final SubLObject access_problem = cb_assertion_browser.cb_assertion_access_diagnostics( assertion );
                final SubLObject results = cb_diagnose_assertion_int( assertion );
                if( NIL == results && NIL == access_problem )
                {
                  html_utilities.html_princ( $str295$OK );
                }
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$117, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$115, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$114, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$113, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 84024L)
  public static SubLObject cb_diagnose_assertion_int(final SubLObject assertion)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 84557L)
  public static SubLObject cb_link_diagnose_assertion(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str476$_Run_Diagnostics_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw285$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str477$cb_diagnose_assertion__A, assertion_handles.assertion_id( assertion ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 84834L)
  public static SubLObject cb_link_trigger_test(SubLObject support, SubLObject rule, SubLObject linktext)
  {
    if( support == UNPROVIDED )
    {
      support = NIL;
    }
    if( rule == UNPROVIDED )
    {
      rule = NIL;
    }
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str118$_Trigger_Test_;
    }
    if( NIL != support && !assertionsDisabledInClass && NIL == arguments.support_p( support ) )
    {
      throw new AssertionError( support );
    }
    if( NIL != rule && !assertionsDisabledInClass && NIL == assertions_high.rule_assertionP( rule ) )
    {
      throw new AssertionError( rule );
    }
    thread.resetMultipleValues();
    final SubLObject support_id = cb_trigger_test_id_strings( support, rule );
    final SubLObject rule_id = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    if( NIL != rule_id )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str482$cb_trigger_test__a__a, support_id, rule_id );
    }
    else if( NIL != support_id )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str483$cb_trigger_test__a, support_id );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str484$cb_trigger_test );
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
    return support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 85491L)
  public static SubLObject cb_trigger_test_id_strings(final SubLObject support, final SubLObject rule)
  {
    SubLObject support_id = NIL;
    SubLObject rule_id = NIL;
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      support_id = assertion_handles.assertion_id( support );
    }
    if( NIL != rule )
    {
      rule_id = assertion_handles.assertion_id( rule );
    }
    return Values.values( support_id, rule_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 85803L)
  public static SubLObject cb_extract_trigger_test_args(final SubLObject args)
  {
    if( NIL == args )
    {
      return Values.values( NIL, NIL );
    }
    if( NIL != list_utilities.singletonP( args ) )
    {
      final SubLObject support = cb_utilities.cb_guess_assertion( args );
      return Values.values( support, NIL );
    }
    SubLObject support_id = NIL;
    SubLObject rule_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list486 );
    support_id = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list486 );
    rule_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject support2 = cb_utilities.cb_guess_assertion( support_id );
      final SubLObject rule = cb_utilities.cb_guess_assertion( rule_id );
      return Values.values( support2, rule );
    }
    cdestructuring_bind.cdestructuring_bind_error( args, $list486 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 86198L)
  public static SubLObject cb_trigger_test(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str487$the_Trigger_Test_page );
    }
    thread.resetMultipleValues();
    final SubLObject trigger_support = cb_extract_trigger_test_args( args );
    final SubLObject trigger_rule = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != arguments.support_p( trigger_support ) )
    {
      if( NIL != assertions_high.rule_assertionP( trigger_rule ) )
      {
        return cb_trigger_test_support_and_rule( trigger_support, trigger_rule );
      }
      return cb_trigger_test_support( trigger_support );
    }
    else
    {
      if( NIL != assertions_high.rule_assertionP( trigger_rule ) )
      {
        return cb_trigger_test_rule( trigger_rule );
      }
      return cb_trigger_test_unspecified();
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 86758L)
  public static SubLObject cb_trigger_test_support_and_rule(final SubLObject trigger_support, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertibles_queue = forward.forward_propagate_one_support_wrt_rule_and_generate_assertibles( trigger_support, rule, $const489$InferencePSC );
    final SubLObject title_var = $str490$Trigger_Test_Results;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$118 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw47$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        dhtml_macros.dhtml_with_toggle_visibility_support();
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$119 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str50$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str52$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str54$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$121, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw491$CB_TRIGGER_TEST, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str492$Results_of_triggering__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            html_utilities.html_indent( FOUR_INTEGER );
            cb_utilities.cb_link( $kw117$TRIGGER_TEST, trigger_support, rule, $str493$_Retrigger_, UNPROVIDED, UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            cb_assertion_browser.cb_show_support( trigger_support, UNPROVIDED );
            html_utilities.html_newline( TWO_INTEGER );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str494$against_rule__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            cb_utilities.cb_show_assertion_readably( rule, T, T );
            html_utilities.html_newline( TWO_INTEGER );
            if( NIL != queues.queue_empty_p( assertibles_queue ) )
            {
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_princ_strong( $str495$No_results_ );
            }
            else
            {
              final SubLObject total = queues.queue_size( assertibles_queue );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ONE_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    final SubLObject conclusion_label = ( NIL != number_utilities.onep( total ) ) ? $str496$One_Conclusion
                        : Sequences.cconcatenate( $str497$Conclusions__, new SubLObject[]
                        { format_nil.format_nil_s_no_copy( total ), $str498$_total_
                        } );
                    html_utilities.html_princ_strong( conclusion_label );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$124, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ_strong( $str499$Justification );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$125, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$123, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                SubLObject index = ZERO_INTEGER;
                SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements( assertibles_queue );
                SubLObject assertible = NIL;
                assertible = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  SubLObject current;
                  final SubLObject datum = current = assertible;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list500 );
                  final SubLObject temp = current.rest();
                  current = current.first();
                  SubLObject gaf_cnf = NIL;
                  SubLObject concluded_mt = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list500 );
                  gaf_cnf = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list500 );
                  concluded_mt = current.first();
                  final SubLObject rest;
                  current = ( rest = current.rest() );
                  current = temp;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list500 );
                  final SubLObject temp_$126 = current.rest();
                  current = current.first();
                  SubLObject deduction_token = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list500 );
                  deduction_token = current.first();
                  final SubLObject justification;
                  current = ( justification = current.rest() );
                  current = temp_$126;
                  if( NIL == current )
                  {
                    final SubLObject gaf_formula = clauses.cnf_formula( gaf_cnf, UNPROVIDED );
                    final SubLObject concluded_gaf = kb_indexing.find_gaf( gaf_formula, concluded_mt );
                    final SubLObject concluded_support = ( NIL != concluded_gaf ) ? concluded_gaf : arguments.make_hl_support( $kw501$OPAQUE, gaf_formula, concluded_mt, UNPROVIDED );
                    final SubLObject justification_tag = Sequences.cconcatenate( $str502$just, format_nil.format_nil_a_no_copy( index ) );
                    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw226$LEFT ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        cb_assertion_browser.cb_show_support( concluded_support, UNPROVIDED );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$127, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw226$LEFT ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        dhtml_macros.dhtml_switch_visibility_links( justification_tag, $str332$Show, $str333$Hide );
                        final SubLObject initial_visibility = $kw335$INVISIBLE;
                        dhtml_macros.dhtml_set_switched_visibility( justification_tag, initial_visibility, $kw336$PARAGRAPH );
                        html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                        if( NIL != justification_tag )
                        {
                          html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( justification_tag );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        }
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          cb_assertion_browser.cb_show_justification_readably( justification, UNPROVIDED );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$129, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
                        html_utilities.html_source_readability_terpri( UNPROVIDED );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$128, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$126, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                    html_utilities.html_source_readability_terpri( UNPROVIDED );
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list500 );
                  }
                  index = Numbers.add( index, ONE_INTEGER );
                  cdolist_list_var = cdolist_list_var.rest();
                  assertible = cdolist_list_var.first();
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$122, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$120, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$119, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$118, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 89315L)
  public static SubLObject cb_trigger_test_support(final SubLObject trigger_support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str503$Trigger_Test_Setup;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$131 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw47$CB_CYC );
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
        final SubLObject _prev_bind_0_$132 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str50$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str52$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str54$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$134, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw491$CB_TRIGGER_TEST, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str504$Support_to_trigger__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            cb_assertion_browser.cb_show_support( trigger_support, UNPROVIDED );
            html_utilities.html_newline( TWO_INTEGER );
            final SubLObject history_rules = list_utilities.remove_if_not( Symbols.symbol_function( $sym481$RULE_ASSERTION_ ), cb_tools.cb_assertion_history_items(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != history_rules )
            {
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str505$Please_select_a_rule_to_trigger__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject cdolist_list_var = history_rules;
                SubLObject rule = NIL;
                rule = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_utilities.cb_link( $kw117$TRIGGER_TEST, trigger_support, rule, $str506$_Trigger_, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$137, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_utilities.cb_show_assertion_readably( rule, T, T );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$138, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$136, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  rule = cdolist_list_var.first();
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$135, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            }
            else
            {
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str507$There_are_currently_no_rules_in_y );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$133, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$132, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$131, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 90269L)
  public static SubLObject cb_trigger_test_rule(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str503$Trigger_Test_Setup;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$139 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw47$CB_CYC );
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
        final SubLObject _prev_bind_0_$140 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str50$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str52$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str54$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$142, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw491$CB_TRIGGER_TEST, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str508$Rule_to_trigger__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            cb_utilities.cb_show_assertion_readably( rule, T, T );
            html_utilities.html_newline( TWO_INTEGER );
            final SubLObject history_gafs = Sequences.remove_if( Symbols.symbol_function( $sym481$RULE_ASSERTION_ ), cb_tools.cb_assertion_history_items(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != history_gafs )
            {
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str509$Please_select_a_support_to_trigge );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject cdolist_list_var = history_gafs;
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_utilities.cb_link( $kw117$TRIGGER_TEST, support, rule, $str506$_Trigger_, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$145, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw227$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_utilities.cb_show_assertion_readably( support, T, T );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$146, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$144, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  support = cdolist_list_var.first();
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$143, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            }
            else
            {
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str510$There_are_currently_no_supports_i );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$141, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$140, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$139, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 91206L)
  public static SubLObject cb_trigger_test_unspecified()
  {
    return cb_utilities.cb_error( $str511$Time_to_implement_cb_trigger_test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 91692L)
  public static SubLObject cb_proof_checker_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_proof_checker_rules$.setDynamicValue( list_utilities.delete_if_not( Symbols.symbol_function( $sym513$VALID_ASSERTION ), $cb_proof_checker_rules$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), thread );
    return conses_high.copy_list( $cb_proof_checker_rules$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 91876L)
  public static SubLObject cb_add_to_proof_checker_rules(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( assertion ) && NIL != assertions_high.rule_assertionP( assertion ) && NIL == conses_high.member( assertion, $cb_proof_checker_rules$.getDynamicValue( thread ), Symbols
        .symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $cb_proof_checker_rules$.setDynamicValue( ConsesLow.cons( assertion, $cb_proof_checker_rules$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 92078L)
  public static SubLObject cb_delete_from_proof_checker_rules(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_proof_checker_rules$.setDynamicValue( Sequences.delete( assertion, $cb_proof_checker_rules$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 92238L)
  public static SubLObject cb_delete_all_proof_checker_rules()
  {
    $cb_proof_checker_rules$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 92346L)
  public static SubLObject cb_use_in_proof(final SubLObject args)
  {
    final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      return cb_utilities.cb_error( $str257$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == assertions_high.rule_assertionP( assertion ) )
    {
      return cb_utilities.cb_error( $str514$Assertion_specified_was_not_a_rul, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cb_add_to_proof_checker_rules( assertion );
    return cb_utilities.cb_simple_message_page( $str515$Rule_has_been_added_to_proof_chec, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 92852L)
  public static SubLObject cb_link_use_in_proof(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == linktext )
    {
      linktext = $str518$_Use_in_Proof_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str519$cb_use_in_proof__a, assertion_handles.assertion_id( assertion ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 93155L)
  public static SubLObject cb_reinforce_rule(final SubLObject args)
  {
    final SubLObject assertion = cb_utilities.cb_guess_assertion( args );
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      reinforce_rule( assertion, UNPROVIDED );
      return cb_assertion_browser.cb_af( args );
    }
    return cb_utilities.cb_error( $str521$_a_does_not_specify_a_rule, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 93436L)
  public static SubLObject cb_link_reinforce_rule(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    if( NIL == linktext )
    {
      linktext = $str523$_Reinforce_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw83$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str524$cb_reinforce_rule__a, assertion_handles.assertion_id( assertion ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 93740L)
  public static SubLObject reinforce_rule(final SubLObject rule, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $int526$100;
    }
    inference_analysis.increment_transformation_rule_considered_count( rule, T, n, UNPROVIDED );
    inference_analysis.increment_transformation_rule_success_count( rule, T, n, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 97147L)
  public static SubLObject cb_strength_and_direction_section(final SubLObject strength, final SubLObject direction, SubLObject display_options)
  {
    if( display_options == UNPROVIDED )
    {
      display_options = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject current;
    final SubLObject datum = current = display_options;
    final SubLObject edit_only_tail = cdestructuring_bind.property_list_member( $kw337$EDIT_ONLY, current );
    final SubLObject edit_only = ( NIL != edit_only_tail ) ? conses_high.cadr( edit_only_tail ) : NIL;
    final SubLObject strength_input_name_tail = cdestructuring_bind.property_list_member( $kw527$STRENGTH_INPUT_NAME, current );
    final SubLObject strength_input_name = ( NIL != strength_input_name_tail ) ? conses_high.cadr( strength_input_name_tail ) : $cb_strength_input_default_name$.getGlobalValue();
    final SubLObject direction_input_name_tail = cdestructuring_bind.property_list_member( $kw528$DIRECTION_INPUT_NAME, current );
    final SubLObject direction_input_name = ( NIL != direction_input_name_tail ) ? conses_high.cadr( direction_input_name_tail ) : $cb_direction_input_default_name$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
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
      final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_princ( $str529$Strength__ );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$148, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != edit_only )
          {
            html_utilities.html_glyph( $kw398$NBSP, UNPROVIDED );
            cb_utilities.cb_show_strength( strength );
            html_utilities.html_hidden_input( strength_input_name, strength, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
          }
          else
          {
            html_utilities.html_markup( html_macros.$html_label_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_label_for$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( $str530$_default_strength ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_radio_input( strength_input_name, $str164$_default, Equality.eq( strength, $kw165$DEFAULT ), $str530$_default_strength );
              html_utilities.html_indent( ONE_INTEGER );
              html_utilities.html_princ( $str166$Default );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$150, thread );
            }
            html_utilities.html_markup( html_macros.$html_label_tail$.getGlobalValue() );
            html_utilities.html_indent( TWO_INTEGER );
            html_utilities.html_markup( html_macros.$html_label_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_label_for$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( $str531$_monotonic_strength ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_radio_input( strength_input_name, $str167$_monotonic, Equality.eq( strength, $kw168$MONOTONIC ), $str531$_monotonic_strength );
              html_utilities.html_indent( ONE_INTEGER );
              html_utilities.html_princ( $str169$Monotonic );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$151, thread );
            }
            html_utilities.html_markup( html_macros.$html_label_tail$.getGlobalValue() );
            html_utilities.html_indent( TWO_INTEGER );
            html_utilities.html_indent( TWO_INTEGER );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$149, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$152 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_princ( $str532$Direction__ );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$152, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != edit_only )
          {
            html_utilities.html_glyph( $kw398$NBSP, UNPROVIDED );
            cb_utilities.cb_show_direction( direction );
            html_utilities.html_hidden_input( direction_input_name, direction, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
          }
          else
          {
            html_utilities.html_markup( html_macros.$html_label_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_label_for$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( $str186$_backward ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_radio_input( direction_input_name, $str186$_backward, NIL, $str186$_backward );
              html_utilities.html_indent( ONE_INTEGER );
              html_utilities.html_princ( $str188$Backward );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$154, thread );
            }
            html_utilities.html_markup( html_macros.$html_label_tail$.getGlobalValue() );
            html_utilities.html_indent( TWO_INTEGER );
            html_utilities.html_markup( html_macros.$html_label_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_label_for$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( $str189$_forward ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_radio_input( direction_input_name, $str189$_forward, NIL, $str189$_forward );
              html_utilities.html_indent( ONE_INTEGER );
              html_utilities.html_princ( $str191$Forward );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$155, thread );
            }
            html_utilities.html_markup( html_macros.$html_label_tail$.getGlobalValue() );
            html_utilities.html_indent( TWO_INTEGER );
            html_utilities.html_indent( TWO_INTEGER );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$153, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$147, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 99155L)
  public static SubLObject cb_extract_strength_and_direction_input(final SubLObject args, SubLObject input_options)
  {
    if( input_options == UNPROVIDED )
    {
      input_options = NIL;
    }
    final SubLObject current;
    final SubLObject datum = current = input_options;
    final SubLObject strength_input_name_tail = cdestructuring_bind.property_list_member( $kw527$STRENGTH_INPUT_NAME, current );
    final SubLObject strength_input_name = ( NIL != strength_input_name_tail ) ? conses_high.cadr( strength_input_name_tail ) : $cb_strength_input_default_name$.getGlobalValue();
    final SubLObject direction_input_name_tail = cdestructuring_bind.property_list_member( $kw528$DIRECTION_INPUT_NAME, current );
    final SubLObject direction_input_name = ( NIL != direction_input_name_tail ) ? conses_high.cadr( direction_input_name_tail ) : $cb_direction_input_default_name$.getGlobalValue();
    final SubLObject strength_string = html_utilities.html_extract_input( strength_input_name, args );
    final SubLObject direction_string = html_utilities.html_extract_input( direction_input_name, args );
    SubLObject strength = NIL;
    SubLObject direction = NIL;
    if( strength_string.isString() )
    {
      strength = reader.read_from_string_ignoring_errors( strength_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    if( direction_string.isString() )
    {
      direction = reader.read_from_string_ignoring_errors( direction_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
    }
    return Values.values( strength, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
  public static SubLObject cb_link_assertion_graph(final SubLObject assertion, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = Sequences.cconcatenate( $str533$_, new SubLObject[] { cb_assertion_graph_type_string( assertion ), $str534$_
      } );
    }
    if( NIL != cb_assertion_check_graph( assertion ) )
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw535$CONTENT );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str536$cb_assertion_graph__A, assertion_handles.assertion_id( assertion ) );
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
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
  public static SubLObject cb_assertion_graph(final SubLObject args)
  {
    final SubLObject assertion = cb_utilities.cb_guess_assertion( args.first() );
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      cb_assertion_graph_internal( assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
  public static SubLObject cb_assertion_graph_internal(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var;
    final SubLObject title = title_var = $str540$Graph_of_an_assertion;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str44$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str45$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$156 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw46$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw47$CB_CYC );
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        dhtml_macros.html_basic_cb_scripts();
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$157 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str50$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str51$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str52$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str53$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str541$Refresh );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str542$reloadCurrentFrame__reloadFrameBu );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$159, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
            html_utilities.html_princ( $str543$Graph_for_ );
            html_utilities.html_newline( UNPROVIDED );
            cb_utilities.cb_form( assertion, NIL, T );
            html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
            cb_assertion_print_graph( assertion );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$158, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$157, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$156, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
  public static SubLObject cb_assertion_graph_type_string(final SubLObject assertion)
  {
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      return $str544$Rule_Graph;
    }
    return $str545$Unknown_Graph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
  public static SubLObject cb_assertion_print_graph(final SubLObject assertion)
  {
    if( NIL != assertions_high.rule_assertionP( assertion ) )
    {
      cb_assertion_print_graph_of_rule( assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
  public static SubLObject cb_assertion_check_graph(final SubLObject assertion)
  {
    return assertions_high.rule_assertionP( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
  public static SubLObject cb_assertion_print_graph_of_rule(final SubLObject assertion)
  {
    html_utilities.html_newline( TWO_INTEGER );
    final SubLObject signature = PrintLow.format( NIL, $str546$_a, random.random( Numbers.expt( TWO_INTEGER, $int547$30 ) ) );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    blue_grapher_utilities.blue_event( signature, ConsesLow.list( cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), ConsesLow.list( $kw548$BUILDER_FN, $sym549$BBF_RULE, $kw550$ASSERTIONS,
        ConsesLow.list( assertion ), $kw23$MT, mt ) ) );
    cb_blue_grapher.cb_blue_applet( ConsesLow.list( $kw351$WIDTH, $int551$800, $kw350$HEIGHT, $int552$600, $kw553$SIGNATURE, signature ) );
    return NIL;
  }

  public static SubLObject declare_cb_assertion_editor_file()
  {
    SubLFiles.declareFunction( me, "cb_change_mt_hook", "CB-CHANGE-MT-HOOK", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_change_strength_hook", "CB-CHANGE-STRENGTH-HOOK", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_change_direction_hook", "CB-CHANGE-DIRECTION-HOOK", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_repropagate_hook", "CB-REPROPAGATE-HOOK", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_repropagate_browsably_hook", "CB-REPROPAGATE-BROWSABLY-HOOK", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_recanonicalize_hook", "CB-RECANONICALIZE-HOOK", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_rename_variables_hook", "CB-RENAME-VARIABLES-HOOK", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_edit_assertion_hook", "CB-EDIT-ASSERTION-HOOK", 5, 2, false );
    SubLFiles.declareFunction( me, "cb_null_edit_assertion_hook", "CB-NULL-EDIT-ASSERTION-HOOK", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_edit_assertion_strings_hook", "CB-EDIT-ASSERTION-STRINGS-HOOK", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_spec_print_function_trampoline", "CB-ASSERTION-SPEC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_spec_p", "CB-ASSERTION-SPEC-P", 1, 0, false );
    new $cb_assertion_spec_p$UnaryFunction();
    SubLFiles.declareFunction( me, "assertion_spec_sentence", "ASSERTION-SPEC-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_spec_mt", "ASSERTION-SPEC-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_spec_strength", "ASSERTION-SPEC-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_spec_direction", "ASSERTION-SPEC-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_spec_unasserts", "ASSERTION-SPEC-UNASSERTS", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_spec_metas", "ASSERTION-SPEC-METAS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_assertion_spec_sentence", "_CSETF-ASSERTION-SPEC-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_assertion_spec_mt", "_CSETF-ASSERTION-SPEC-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_assertion_spec_strength", "_CSETF-ASSERTION-SPEC-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_assertion_spec_direction", "_CSETF-ASSERTION-SPEC-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_assertion_spec_unasserts", "_CSETF-ASSERTION-SPEC-UNASSERTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_assertion_spec_metas", "_CSETF-ASSERTION-SPEC-METAS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cb_assertion_spec", "MAKE-CB-ASSERTION-SPEC", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cb_assertion_spec", "VISIT-DEFSTRUCT-CB-ASSERTION-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cb_assertion_spec_method", "VISIT-DEFSTRUCT-OBJECT-CB-ASSERTION-SPEC-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cb_assertion_spec", "NEW-CB-ASSERTION-SPEC", 2, 4, false );
    SubLFiles.declareFunction( me, "ke_assert_assertion_spec", "KE-ASSERT-ASSERTION-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_note_edit_change", "CB-NOTE-EDIT-CHANGE", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_attempt_to_repair_and_assert", "CB-ATTEMPT-TO-REPAIR-AND-ASSERT", 6, 0, false );
    SubLFiles.declareFunction( me, "cb_explain_why_not_wff", "CB-EXPLAIN-WHY-NOT-WFF", 2, 7, false );
    SubLFiles.declareFunction( me, "cb_wff_repair_advice", "CB-WFF-REPAIR-ADVICE", 6, 0, false );
    SubLFiles.declareFunction( me, "cb_wff_repair_advise_assertion_creation", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION", 6, 0, false );
    SubLFiles.declareFunction( me, "cb_wff_repair_advise_assertion_creation_or_lift", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT", 7, 0, false );
    SubLFiles.declareFunction( me, "assertions_in_spec_mts_among", "ASSERTIONS-IN-SPEC-MTS-AMONG", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT-TO-MIN-CEILING-MT", 7, 0, false );
    SubLFiles.declareFunction( me, "cb_wff_repair_advise_assertion_lift_from_spec_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-LIFT-FROM-SPEC-MT", 7, 0, false );
    SubLFiles.declareFunction( me, "cb_link_repair_and_reattempt", "CB-LINK-REPAIR-AND-REATTEMPT", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_repair_and_reattempt", "CB-REPAIR-AND-REATTEMPT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_toolbar", "CB-ASSERTION-TOOLBAR", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_modification_permittedP", "ASSERTION-MODIFICATION-PERMITTED?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_disabled_link", "CB-DISABLED-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_change_mt", "CB-CHANGE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_change_all_meta_assertions_mt_check", "CB-CHANGE-ALL-META-ASSERTIONS-MT-CHECK", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_change_mt", "CB-HANDLE-CHANGE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_change_mt", "CB-LINK-CHANGE-MT", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_change_strength", "CB-CHANGE-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_change_strength", "CB-HANDLE-CHANGE-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_change_strength", "CB-LINK-CHANGE-STRENGTH", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_change_direction", "CB-CHANGE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_change_direction", "CB-HANDLE-CHANGE-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_change_direction", "CB-LINK-CHANGE-DIRECTION", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_change_meta_assertion_mt", "CB-CHANGE-META-ASSERTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_change_meta_assertion_mt", "CB-HANDLE-CHANGE-META-ASSERTION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_change_meta_assertion_mt", "CB-LINK-CHANGE-META-ASSERTION-MT", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_rename_variables", "CB-RENAME-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_rename_variables", "CB-HANDLE-RENAME-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_variables_from_args", "CB-EXTRACT-VARIABLES-FROM-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_invalid_variables_message", "CB-SHOW-INVALID-VARIABLES-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_rename_variables", "CB-LINK-RENAME-VARIABLES", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_repropagate", "CB-REPROPAGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_repropagate", "CB-LINK-REPROPAGATE", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_repropagate_browsably", "CB-REPROPAGATE-BROWSABLY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_repropagate_browsably", "CB-LINK-REPROPAGATE-BROWSABLY", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_recanonicalize", "CB-RECANONICALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_recanonicalize", "CB-LINK-RECANONICALIZE", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_wff", "CB-WFF", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_wff", "CB-LINK-WFF", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_wff", "CB-HANDLE-WFF", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_wff_check_formula", "CB-WFF-CHECK-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_wff_check_formula_ok", "CB-WFF-CHECK-FORMULA-OK", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_assert", "CB-ASSERT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_assert", "CB-HANDLE-ASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_some_assert_arguments", "CB-EXTRACT-SOME-ASSERT-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_assert", "CB-LINK-ASSERT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_assert_internal", "CB-ASSERT-INTERNAL", 1, 3, false );
    SubLFiles.declareFunction( me, "cb_assert_sentence_constant_suggestions", "CB-ASSERT-SENTENCE-CONSTANT-SUGGESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_values_for_assert", "CB-EXTRACT-VALUES-FOR-ASSERT", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_tabulate_checkable_meta_assertions", "CB-TABULATE-CHECKABLE-META-ASSERTIONS", 1, 4, false );
    SubLFiles.declareFunction( me, "cb_show_meta_assertion_readably", "CB-SHOW-META-ASSERTION-READABLY", 2, 3, false );
    SubLFiles.declareFunction( me, "cb_extract_mt_from_string", "CB-EXTRACT-MT-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_valid_microtheoryP", "CB-VALID-MICROTHEORY?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_formula_from_string", "CB-EXTRACT-FORMULA-FROM-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_wff_check_sentence_int", "CB-WFF-CHECK-SENTENCE-INT", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_assert_formula", "CB-ASSERT-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_assert_formula", "CB-LINK-ASSERT-FORMULA", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_similar", "CB-SIMILAR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_assert_similar", "CB-LINK-ASSERT-SIMILAR", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assert_meta", "CB-ASSERT-META", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_assert_meta", "CB-HANDLE-ASSERT-META", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_assert_meta", "CB-LINK-ASSERT-META", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_suggest_pragmas", "CB-SUGGEST-PRAGMAS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_suggest_pragmas", "CB-LINK-SUGGEST-PRAGMAS", 1, 3, false );
    SubLFiles.declareFunction( me, "cb_suggest_pragmas_guts", "CB-SUGGEST-PRAGMAS-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_assert_suggested_pragma", "CB-LINK-ASSERT-SUGGESTED-PRAGMA", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_assert_suggested_pragma", "CB-ASSERT-SUGGESTED-PRAGMA", 1, 0, false );
    SubLFiles.declareMacro( me, "without_arg_format_and_relator_checking", "WITHOUT-ARG-FORMAT-AND-RELATOR-CHECKING" );
    SubLFiles.declareFunction( me, "cb_edit", "CB-EDIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_edit", "CB-HANDLE-EDIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_meta_assertions_from_args", "CB-EXTRACT-META-ASSERTIONS-FROM-ARGS", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_link_edit_assertion", "CB-LINK-EDIT-ASSERTION", 1, 3, false );
    SubLFiles.declareFunction( me, "cb_handle_edit_assertion", "CB-HANDLE-EDIT-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_sentence_edit", "CB-HANDLE-SENTENCE-EDIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_sentence_edit_int", "CB-HANDLE-SENTENCE-EDIT-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "cb_fix_typo_edit", "CB-FIX-TYPO-EDIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_fix_typo", "CB-LINK-FIX-TYPO", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_handle_fix_typo", "CB-HANDLE-FIX-TYPO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_fix_typo_assertionP", "CB-FIX-TYPO-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_reassert", "CB-REASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_reassert", "CB-LINK-REASSERT", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_unassert", "CB-UNASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_unassert", "CB-LINK-UNASSERT", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_blast", "CB-BLAST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_blast", "CB-LINK-BLAST", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_remove_deduction", "CB-REMOVE-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_remove_deduction", "CB-LINK-REMOVE-DEDUCTION", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_assertion_tms", "CB-ASSERTION-TMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_assert_tms", "CB-LINK-ASSERT-TMS", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_diagnose_assertion", "CB-DIAGNOSE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_diagnose_assertion_int", "CB-DIAGNOSE-ASSERTION-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_diagnose_assertion", "CB-LINK-DIAGNOSE-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_trigger_test", "CB-LINK-TRIGGER-TEST", 0, 3, false );
    SubLFiles.declareFunction( me, "cb_trigger_test_id_strings", "CB-TRIGGER-TEST-ID-STRINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_trigger_test_args", "CB-EXTRACT-TRIGGER-TEST-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_trigger_test", "CB-TRIGGER-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_trigger_test_support_and_rule", "CB-TRIGGER-TEST-SUPPORT-AND-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_trigger_test_support", "CB-TRIGGER-TEST-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_trigger_test_rule", "CB-TRIGGER-TEST-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_trigger_test_unspecified", "CB-TRIGGER-TEST-UNSPECIFIED", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_proof_checker_rules", "CB-PROOF-CHECKER-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_add_to_proof_checker_rules", "CB-ADD-TO-PROOF-CHECKER-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_delete_from_proof_checker_rules", "CB-DELETE-FROM-PROOF-CHECKER-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_delete_all_proof_checker_rules", "CB-DELETE-ALL-PROOF-CHECKER-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_use_in_proof", "CB-USE-IN-PROOF", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_use_in_proof", "CB-LINK-USE-IN-PROOF", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_reinforce_rule", "CB-REINFORCE-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_reinforce_rule", "CB-LINK-REINFORCE-RULE", 1, 1, false );
    SubLFiles.declareFunction( me, "reinforce_rule", "REINFORCE-RULE", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_strength_and_direction_section", "CB-STRENGTH-AND-DIRECTION-SECTION", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_extract_strength_and_direction_input", "CB-EXTRACT-STRENGTH-AND-DIRECTION-INPUT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_assertion_graph", "CB-LINK-ASSERTION-GRAPH", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_assertion_graph", "CB-ASSERTION-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_graph_internal", "CB-ASSERTION-GRAPH-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_graph_type_string", "CB-ASSERTION-GRAPH-TYPE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_print_graph", "CB-ASSERTION-PRINT-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_check_graph", "CB-ASSERTION-CHECK-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_print_graph_of_rule", "CB-ASSERTION-PRINT-GRAPH-OF-RULE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_assertion_editor_file()
  {
    $dtp_cb_assertion_spec$ = SubLFiles.defconstant( "*DTP-CB-ASSERTION-SPEC*", $sym1$CB_ASSERTION_SPEC );
    $cb_assert_modes_table$ = SubLFiles.defparameter( "*CB-ASSERT-MODES-TABLE*", $list296 );
    $cb_proof_checker_rules$ = SubLFiles.defparameter( "*CB-PROOF-CHECKER-RULES*", NIL );
    $cb_strength_input_default_name$ = SubLFiles.deflexical( "*CB-STRENGTH-INPUT-DEFAULT-NAME*", $str163$strength );
    $cb_direction_input_default_name$ = SubLFiles.deflexical( "*CB-DIRECTION-INPUT-DEFAULT-NAME*", $str185$direction );
    return NIL;
  }

  public static SubLObject setup_cb_assertion_editor_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cb_assertion_spec$.getGlobalValue(), Symbols.symbol_function( $sym8$CB_ASSERTION_SPEC_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$ASSERTION_SPEC_SENTENCE, $sym11$_CSETF_ASSERTION_SPEC_SENTENCE );
    Structures.def_csetf( $sym12$ASSERTION_SPEC_MT, $sym13$_CSETF_ASSERTION_SPEC_MT );
    Structures.def_csetf( $sym14$ASSERTION_SPEC_STRENGTH, $sym15$_CSETF_ASSERTION_SPEC_STRENGTH );
    Structures.def_csetf( $sym16$ASSERTION_SPEC_DIRECTION, $sym17$_CSETF_ASSERTION_SPEC_DIRECTION );
    Structures.def_csetf( $sym18$ASSERTION_SPEC_UNASSERTS, $sym19$_CSETF_ASSERTION_SPEC_UNASSERTS );
    Structures.def_csetf( $sym20$ASSERTION_SPEC_METAS, $sym21$_CSETF_ASSERTION_SPEC_METAS );
    Equality.identity( $sym1$CB_ASSERTION_SPEC );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_assertion_spec$.getGlobalValue(), Symbols.symbol_function(
        $sym33$VISIT_DEFSTRUCT_OBJECT_CB_ASSERTION_SPEC_METHOD ) );
    Hashtables.sethash( $kw37$CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str38$cb_wff_check_formula_html, NIL ) );
    cb_utilities.setup_cb_link_method( $kw69$REPAIR_AND_REATTEMPT, $sym85$CB_LINK_REPAIR_AND_REATTEMPT, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym89$CB_REPAIR_AND_REATTEMPT, $kw90$HTML_HANDLER );
    Hashtables.sethash( $kw91$CB_AF, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str92$cb_af_html, NIL ) );
    Hashtables.sethash( $kw131$CB_CHANGE_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str132$cb_change_mt_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym145$CB_CHANGE_MT, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym153$CB_HANDLE_CHANGE_MT, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw97$CHANGE_MT, $sym156$CB_LINK_CHANGE_MT, THREE_INTEGER );
    Hashtables.sethash( $kw157$CB_CHANGE_STRENGTH, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str158$cb_change_strength_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym171$CB_CHANGE_STRENGTH, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym175$CB_HANDLE_CHANGE_STRENGTH, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw98$CHANGE_STRENGTH, $sym178$CB_LINK_CHANGE_STRENGTH, THREE_INTEGER );
    Hashtables.sethash( $kw179$CB_CHANGE_DIRECTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str180$cb_change_direction_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym193$CB_CHANGE_DIRECTION, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym200$CB_HANDLE_CHANGE_DIRECTION, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw99$CHANGE_DIRECTION, $sym203$CB_LINK_CHANGE_DIRECTION, THREE_INTEGER );
    Hashtables.sethash( $kw204$CB_CHANGE_META_ASSERTION_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str205$cb_change_meta_assertion_mt_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym211$CB_CHANGE_META_ASSERTION_MT, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym212$CB_HANDLE_CHANGE_META_ASSERTION_MT, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw100$CHANGE_META_ASSERTION_MT, $sym215$CB_LINK_CHANGE_META_ASSERTION_MT, THREE_INTEGER );
    Hashtables.sethash( $kw216$CB_RENAME_VARIABLES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str217$cb_rename_variables_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym232$CB_RENAME_VARIABLES, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym240$CB_HANDLE_RENAME_VARIABLES, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw101$RENAME_VARIABLES, $sym254$CB_LINK_RENAME_VARIABLES, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym258$CB_REPROPAGATE, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw124$REPROPAGATE, $sym261$CB_LINK_REPROPAGATE, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym264$CB_REPROPAGATE_BROWSABLY, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw125$REPROPAGATE_BROWSABLY, $sym267$CB_LINK_REPROPAGATE_BROWSABLY, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym272$CB_RECANONICALIZE, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw123$RECANONICALIZE, $sym275$CB_LINK_RECANONICALIZE, THREE_INTEGER );
    Hashtables.sethash( $kw276$CB_WFF, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str277$cb_wff_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym283$CB_WFF, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw287$WFF, $sym288$CB_LINK_WFF, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw287$WFF, $str284$WFF_Check, $str289$WFF, $str290$Check_a_CycL_Expression_for_well_ );
    html_macros.note_cgi_handler_function( $sym291$CB_HANDLE_WFF, $kw90$HTML_HANDLER );
    Hashtables.sethash( $kw37$CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str38$cb_wff_check_formula_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym297$CB_ASSERT, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym305$CB_HANDLE_ASSERT, $kw90$HTML_HANDLER );
    Hashtables.sethash( $kw306$ASSERT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str307$assert_tool_gif, NIL ) );
    cb_utilities.setup_cb_link_method( $kw306$ASSERT, $sym310$CB_LINK_ASSERT, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw306$ASSERT, $str308$Assert, $str311$Asrt, $str312$Assert_CycL_Expression );
    Hashtables.sethash( $kw313$CB_ASSERT_INTERNAL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str314$cb_assert_internal_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym370$CB_ASSERT_FORMULA, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw374$ASSERT_FORMULA, $sym375$CB_LINK_ASSERT_FORMULA, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym376$CB_SIMILAR, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw102$ASSERT_SIMILAR, $sym379$CB_LINK_ASSERT_SIMILAR, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym380$CB_ASSERT_META, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym384$CB_HANDLE_ASSERT_META, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw103$ASSERT_META, $sym387$CB_LINK_ASSERT_META, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym388$CB_SUGGEST_PRAGMAS, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw104$SUGGEST_PRAGMAS, $sym391$CB_LINK_SUGGEST_PRAGMAS, FOUR_INTEGER );
    cb_utilities.setup_cb_link_method( $kw396$ASSERT_SUGGESTED_PRAGMA, $sym400$CB_LINK_ASSERT_SUGGESTED_PRAGMA, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym402$CB_ASSERT_SUGGESTED_PRAGMA, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym405$CB_EDIT, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym407$CB_HANDLE_EDIT, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw106$EDIT_ASSERTION, $sym411$CB_LINK_EDIT_ASSERTION, FOUR_INTEGER );
    html_macros.note_cgi_handler_function( $sym429$CB_HANDLE_EDIT_ASSERTION, $kw430$XML_HANDLER );
    html_macros.note_cgi_handler_function( $sym432$CB_HANDLE_SENTENCE_EDIT, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym434$CB_FIX_TYPO_EDIT, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw105$FIX_TYPO, $sym437$CB_LINK_FIX_TYPO, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym440$CB_HANDLE_FIX_TYPO, $kw90$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym442$CB_REASSERT, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw107$REASSERT, $sym445$CB_LINK_REASSERT, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym447$CB_UNASSERT, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw108$UNASSERT, $sym450$CB_LINK_UNASSERT, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym452$CB_BLAST, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw109$BLAST, $sym455$CB_LINK_BLAST, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym459$CB_REMOVE_DEDUCTION, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw462$REMOVE_DEDUCTION, $sym463$CB_LINK_REMOVE_DEDUCTION, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym465$CB_ASSERTION_TMS, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw120$ASSERT_TMS, $sym468$CB_LINK_ASSERT_TMS, THREE_INTEGER );
    Hashtables.sethash( $kw469$CB_DIAGNOSE_ASSERTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str470$cb_diagnose_assertion_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym475$CB_DIAGNOSE_ASSERTION, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw478$DIAGNOSE_ASSERTION, $sym479$CB_LINK_DIAGNOSE_ASSERTION, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw117$TRIGGER_TEST, $sym485$CB_LINK_TRIGGER_TEST, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym488$CB_TRIGGER_TEST, $kw90$HTML_HANDLER );
    utilities_macros.register_html_state_variable( $sym512$_CB_PROOF_CHECKER_RULES_ );
    html_macros.note_cgi_handler_function( $sym516$CB_USE_IN_PROOF, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw127$USE_IN_PROOF, $sym520$CB_LINK_USE_IN_PROOF, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym522$CB_REINFORCE_RULE, $kw90$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw129$REINFORCE_RULE, $sym525$CB_LINK_REINFORCE_RULE, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw537$ASSERTION_GRAPH, $sym538$CB_LINK_ASSERTION_GRAPH, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym539$CB_ASSERTION_GRAPH, $kw90$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_assertion_editor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_assertion_editor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_assertion_editor_file();
  }
  static
  {
    me = new cb_assertion_editor();
    $dtp_cb_assertion_spec$ = null;
    $cb_assert_modes_table$ = null;
    $cb_proof_checker_rules$ = null;
    $cb_strength_input_default_name$ = null;
    $cb_direction_input_default_name$ = null;
    $sym0$CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING = makeSymbol( "CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING" );
    $sym1$CB_ASSERTION_SPEC = makeSymbol( "CB-ASSERTION-SPEC" );
    $sym2$CB_ASSERTION_SPEC_P = makeSymbol( "CB-ASSERTION-SPEC-P" );
    $list3 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "STRENGTH" ), makeSymbol( "DIRECTION" ), makeSymbol( "UNASSERTS" ), makeSymbol( "METAS" ) );
    $list4 = ConsesLow.list( makeKeyword( "SENTENCE" ), makeKeyword( "MT" ), makeKeyword( "STRENGTH" ), makeKeyword( "DIRECTION" ), makeKeyword( "UNASSERTS" ), makeKeyword( "METAS" ) );
    $list5 = ConsesLow.list( makeSymbol( "ASSERTION-SPEC-SENTENCE" ), makeSymbol( "ASSERTION-SPEC-MT" ), makeSymbol( "ASSERTION-SPEC-STRENGTH" ), makeSymbol( "ASSERTION-SPEC-DIRECTION" ), makeSymbol(
        "ASSERTION-SPEC-UNASSERTS" ), makeSymbol( "ASSERTION-SPEC-METAS" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-ASSERTION-SPEC-SENTENCE" ), makeSymbol( "_CSETF-ASSERTION-SPEC-MT" ), makeSymbol( "_CSETF-ASSERTION-SPEC-STRENGTH" ), makeSymbol( "_CSETF-ASSERTION-SPEC-DIRECTION" ),
        makeSymbol( "_CSETF-ASSERTION-SPEC-UNASSERTS" ), makeSymbol( "_CSETF-ASSERTION-SPEC-METAS" ) );
    $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym8$CB_ASSERTION_SPEC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CB-ASSERTION-SPEC-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CB-ASSERTION-SPEC-P" ) );
    $sym10$ASSERTION_SPEC_SENTENCE = makeSymbol( "ASSERTION-SPEC-SENTENCE" );
    $sym11$_CSETF_ASSERTION_SPEC_SENTENCE = makeSymbol( "_CSETF-ASSERTION-SPEC-SENTENCE" );
    $sym12$ASSERTION_SPEC_MT = makeSymbol( "ASSERTION-SPEC-MT" );
    $sym13$_CSETF_ASSERTION_SPEC_MT = makeSymbol( "_CSETF-ASSERTION-SPEC-MT" );
    $sym14$ASSERTION_SPEC_STRENGTH = makeSymbol( "ASSERTION-SPEC-STRENGTH" );
    $sym15$_CSETF_ASSERTION_SPEC_STRENGTH = makeSymbol( "_CSETF-ASSERTION-SPEC-STRENGTH" );
    $sym16$ASSERTION_SPEC_DIRECTION = makeSymbol( "ASSERTION-SPEC-DIRECTION" );
    $sym17$_CSETF_ASSERTION_SPEC_DIRECTION = makeSymbol( "_CSETF-ASSERTION-SPEC-DIRECTION" );
    $sym18$ASSERTION_SPEC_UNASSERTS = makeSymbol( "ASSERTION-SPEC-UNASSERTS" );
    $sym19$_CSETF_ASSERTION_SPEC_UNASSERTS = makeSymbol( "_CSETF-ASSERTION-SPEC-UNASSERTS" );
    $sym20$ASSERTION_SPEC_METAS = makeSymbol( "ASSERTION-SPEC-METAS" );
    $sym21$_CSETF_ASSERTION_SPEC_METAS = makeSymbol( "_CSETF-ASSERTION-SPEC-METAS" );
    $kw22$SENTENCE = makeKeyword( "SENTENCE" );
    $kw23$MT = makeKeyword( "MT" );
    $kw24$STRENGTH = makeKeyword( "STRENGTH" );
    $kw25$DIRECTION = makeKeyword( "DIRECTION" );
    $kw26$UNASSERTS = makeKeyword( "UNASSERTS" );
    $kw27$METAS = makeKeyword( "METAS" );
    $str28$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw29$BEGIN = makeKeyword( "BEGIN" );
    $sym30$MAKE_CB_ASSERTION_SPEC = makeSymbol( "MAKE-CB-ASSERTION-SPEC" );
    $kw31$SLOT = makeKeyword( "SLOT" );
    $kw32$END = makeKeyword( "END" );
    $sym33$VISIT_DEFSTRUCT_OBJECT_CB_ASSERTION_SPEC_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CB-ASSERTION-SPEC-METHOD" );
    $int34$2000 = makeInteger( 2000 );
    $str35$_a_operation_was_added_to_queue = makeString( "~a operation was added to queue" );
    $str36$_a_operation_completed = makeString( "~a operation completed" );
    $kw37$CB_WFF_CHECK_FORMULA = makeKeyword( "CB-WFF-CHECK-FORMULA" );
    $str38$cb_wff_check_formula_html = makeString( "cb-wff-check-formula.html" );
    $sym39$STACK_P = makeSymbol( "STACK-P" );
    $kw40$IO_MODE = makeKeyword( "IO-MODE" );
    $kw41$NL = makeKeyword( "NL" );
    $kw42$VIOLATIONS = makeKeyword( "VIOLATIONS" );
    $str43$Sentence_not_Well_Formed = makeString( "Sentence not Well-Formed" );
    $str44$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str45$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw46$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw47$CB_CYC = makeKeyword( "CB-CYC" );
    $kw48$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw49$SHA1 = makeKeyword( "SHA1" );
    $str50$yui_skin_sam = makeString( "yui-skin-sam" );
    $str51$reloadFrameButton = makeString( "reloadFrameButton" );
    $str52$button = makeString( "button" );
    $str53$reload = makeString( "reload" );
    $str54$Refresh_Frames = makeString( "Refresh Frames" );
    $str55$Mt___ = makeString( "Mt : " );
    $str56$Sentence___ = makeString( "Sentence : " );
    $str57$Repairs___ = makeString( "Repairs : " );
    $str58$No_repairs_available___Could_not_ = makeString( "No repairs available.  Could not determine any way to make the above sentence well-formed by adding new knowledge." );
    $str59$Explanation__ = makeString( "Explanation :" );
    $str60$wff_explain = makeString( "wff-explain" );
    $str61$Stack_of_pending_assertions_depen = makeString( "Stack of pending assertions depending on this one :" );
    $str62$__in_ = makeString( "  in " );
    $sym63$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const64$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym65$ASSERTED_ASSERTION_ = makeSymbol( "ASSERTED-ASSERTION?" );
    $str66$The_fact_ = makeString( "The fact " );
    $str67$_must_be_added_to_ = makeString( " must be added to " );
    $str68$_in_order_for_the_above_sentence_ = makeString( " in order for the above sentence to be well-formed." );
    $kw69$REPAIR_AND_REATTEMPT = makeKeyword( "REPAIR-AND-REATTEMPT" );
    $sym70$ASSERTION_MT = makeSymbol( "ASSERTION-MT" );
    $sym71$GENERALITY_ESTIMATE = makeSymbol( "GENERALITY-ESTIMATE" );
    $str72$That_fact_is_already_asserted_in_ = makeString( "That fact is already asserted in " );
    $str73$_ = makeString( "." );
    $str74$You_can_repair_this_by_doing_eith = makeString( "You can repair this by doing either of the following:" );
    $str75$1__Lifting_the_assertion_to_ = makeString( "1) Lifting the assertion to " );
    $str76$2__Asserting_it_in_ = makeString( "2) Asserting it in " );
    $str77$_as_well = makeString( " as well" );
    $str78$You_can_repair_this_by_doing_the_ = makeString( "You can repair this by doing the following:" );
    $str79$Asserting_it_in_ = makeString( "Asserting it in " );
    $str80$_must_be_lifted_to_ = makeString( " must be lifted to " );
    $str81$It_is_currently_asserted_in_the_f = makeString( "It is currently asserted in the following spec Mts:" );
    $str82$_Make_this_repair_and_then_reatte = makeString( "[Make this repair and then reattempt]" );
    $kw83$SELF = makeKeyword( "SELF" );
    $str84$cb_repair_and_reattempt__A__A = makeString( "cb-repair-and-reattempt&~A&~A" );
    $sym85$CB_LINK_REPAIR_AND_REATTEMPT = makeSymbol( "CB-LINK-REPAIR-AND-REATTEMPT" );
    $str86$the_Cyc_KB_editing_facilities = makeString( "the Cyc KB editing facilities" );
    $list87 = ConsesLow.list( makeSymbol( "REPAIR-ASSERTION-SPEC-ID" ), makeSymbol( "ASSERTION-STACK-ID" ) );
    $str88$Repair_and_assert_operations_comp = makeString( "Repair and assert operations completed" );
    $sym89$CB_REPAIR_AND_REATTEMPT = makeSymbol( "CB-REPAIR-AND-REATTEMPT" );
    $kw90$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $kw91$CB_AF = makeKeyword( "CB-AF" );
    $str92$cb_af_html = makeString( "cb-af.html" );
    $kw93$SHOW_ENGLISH = makeKeyword( "SHOW-ENGLISH" );
    $kw94$SHOW_EL_FORMULA = makeKeyword( "SHOW-EL-FORMULA" );
    $kw95$WFF_ASSERTION = makeKeyword( "WFF-ASSERTION" );
    $kw96$FIND_SIMILAR_ASSERTION = makeKeyword( "FIND-SIMILAR-ASSERTION" );
    $kw97$CHANGE_MT = makeKeyword( "CHANGE-MT" );
    $kw98$CHANGE_STRENGTH = makeKeyword( "CHANGE-STRENGTH" );
    $kw99$CHANGE_DIRECTION = makeKeyword( "CHANGE-DIRECTION" );
    $kw100$CHANGE_META_ASSERTION_MT = makeKeyword( "CHANGE-META-ASSERTION-MT" );
    $kw101$RENAME_VARIABLES = makeKeyword( "RENAME-VARIABLES" );
    $kw102$ASSERT_SIMILAR = makeKeyword( "ASSERT-SIMILAR" );
    $kw103$ASSERT_META = makeKeyword( "ASSERT-META" );
    $kw104$SUGGEST_PRAGMAS = makeKeyword( "SUGGEST-PRAGMAS" );
    $kw105$FIX_TYPO = makeKeyword( "FIX-TYPO" );
    $kw106$EDIT_ASSERTION = makeKeyword( "EDIT-ASSERTION" );
    $kw107$REASSERT = makeKeyword( "REASSERT" );
    $kw108$UNASSERT = makeKeyword( "UNASSERT" );
    $kw109$BLAST = makeKeyword( "BLAST" );
    $kw110$ASSERTION_PROOF_VIEW = makeKeyword( "ASSERTION-PROOF-VIEW" );
    $kw111$ANTECEDENT_QUERY = makeKeyword( "ANTECEDENT-QUERY" );
    $str112$_Query_Antecedent_ = makeString( "[Query Antecedent]" );
    $kw113$RULE_KNOWN_EXTENT_QUERY = makeKeyword( "RULE-KNOWN-EXTENT-QUERY" );
    $str114$_Known_Extent_ = makeString( "[Known Extent]" );
    $kw115$RULE_UNKNOWN_EXTENT_QUERY = makeKeyword( "RULE-UNKNOWN-EXTENT-QUERY" );
    $str116$_Unknown_Extent_ = makeString( "[Unknown Extent]" );
    $kw117$TRIGGER_TEST = makeKeyword( "TRIGGER-TEST" );
    $str118$_Trigger_Test_ = makeString( "[Trigger Test]" );
    $kw119$ASSERTION_SIMILAR_QUERY = makeKeyword( "ASSERTION-SIMILAR-QUERY" );
    $kw120$ASSERT_TMS = makeKeyword( "ASSERT-TMS" );
    $kw121$JUSTIFY = makeKeyword( "JUSTIFY" );
    $kw122$ASSERTION_DEPENDENCIES = makeKeyword( "ASSERTION-DEPENDENCIES" );
    $kw123$RECANONICALIZE = makeKeyword( "RECANONICALIZE" );
    $kw124$REPROPAGATE = makeKeyword( "REPROPAGATE" );
    $kw125$REPROPAGATE_BROWSABLY = makeKeyword( "REPROPAGATE-BROWSABLY" );
    $kw126$TEST_GEN_TEMPLATE = makeKeyword( "TEST-GEN-TEMPLATE" );
    $kw127$USE_IN_PROOF = makeKeyword( "USE-IN-PROOF" );
    $kw128$USE_IN_PLAN_CHECKING = makeKeyword( "USE-IN-PLAN-CHECKING" );
    $kw129$REINFORCE_RULE = makeKeyword( "REINFORCE-RULE" );
    $const130$InferenceRelatedBookkeepingPredic = constant_handles.reader_make_constant_shell( makeString( "InferenceRelatedBookkeepingPredicate" ) );
    $kw131$CB_CHANGE_MT = makeKeyword( "CB-CHANGE-MT" );
    $str132$cb_change_mt_html = makeString( "cb-change-mt.html" );
    $str133$the_Change_Assertion_Mt_page = makeString( "the Change Assertion Mt page" );
    $list134 = ConsesLow.list( makeSymbol( "ID" ) );
    $str135$Change_Assertion_Mt = makeString( "Change Assertion Mt" );
    $str136$post = makeString( "post" );
    $str137$cb_handle_change_mt = makeString( "cb-handle-change-mt" );
    $str138$id = makeString( "id" );
    $kw139$RED = makeKeyword( "RED" );
    $str140$Note___This_assertion_has_meta_as = makeString( "Note : This assertion has meta-assertions" );
    $list141 = ConsesLow.list( makeKeyword( "ANYTIME-PSC-ALLOWED?" ), NIL );
    $str142$Abort_Edit = makeString( "Abort Edit" );
    $str143$Current_Value = makeString( "Current Value" );
    $str144$Change_Mt = makeString( "Change Mt" );
    $sym145$CB_CHANGE_MT = makeSymbol( "CB-CHANGE-MT" );
    $str146$To_change_Mt_of_all_meta_assertio = makeString( "To change Mt of all meta-assertions use " );
    $str147$move_all_meta_assertions = makeString( "move-all-meta-assertions" );
    $str148$t = makeString( "t" );
    $str149$Change_the_Mt_of_all_meta_asserti = makeString( "Change the Mt of all meta-assertions to the new Mt" );
    $str150$change_microtheory = makeString( "change microtheory" );
    $str151$Assertion_is_already_in__S = makeString( "Assertion is already in ~S" );
    $str152$preserve_ = makeString( "preserve_" );
    $sym153$CB_HANDLE_CHANGE_MT = makeSymbol( "CB-HANDLE-CHANGE-MT" );
    $str154$_Change_Mt_ = makeString( "[Change Mt]" );
    $str155$cb_change_mt__a = makeString( "cb-change-mt&~a" );
    $sym156$CB_LINK_CHANGE_MT = makeSymbol( "CB-LINK-CHANGE-MT" );
    $kw157$CB_CHANGE_STRENGTH = makeKeyword( "CB-CHANGE-STRENGTH" );
    $str158$cb_change_strength_html = makeString( "cb-change-strength.html" );
    $str159$the_Change_Assertion_Strength_pag = makeString( "the Change Assertion Strength page" );
    $str160$Change_Assertion_Strength = makeString( "Change Assertion Strength" );
    $str161$cb_handle_change_strength = makeString( "cb-handle-change-strength" );
    $str162$Choose_a_new_truth_strength__ = makeString( "Choose a new truth strength :" );
    $str163$strength = makeString( "strength" );
    $str164$_default = makeString( ":default" );
    $kw165$DEFAULT = makeKeyword( "DEFAULT" );
    $str166$Default = makeString( "Default" );
    $str167$_monotonic = makeString( ":monotonic" );
    $kw168$MONOTONIC = makeKeyword( "MONOTONIC" );
    $str169$Monotonic = makeString( "Monotonic" );
    $str170$Change_Strength = makeString( "Change Strength" );
    $sym171$CB_CHANGE_STRENGTH = makeSymbol( "CB-CHANGE-STRENGTH" );
    $str172$change_strength = makeString( "change strength" );
    $list173 = ConsesLow.list( makeKeyword( "DEFAULT" ), makeKeyword( "MONOTONIC" ) );
    $str174$_a_was_not_a_microtheory = makeString( "~a was not a microtheory" );
    $sym175$CB_HANDLE_CHANGE_STRENGTH = makeSymbol( "CB-HANDLE-CHANGE-STRENGTH" );
    $str176$_Change_Strength_ = makeString( "[Change Strength]" );
    $str177$cb_change_strength__a = makeString( "cb-change-strength&~a" );
    $sym178$CB_LINK_CHANGE_STRENGTH = makeSymbol( "CB-LINK-CHANGE-STRENGTH" );
    $kw179$CB_CHANGE_DIRECTION = makeKeyword( "CB-CHANGE-DIRECTION" );
    $str180$cb_change_direction_html = makeString( "cb-change-direction.html" );
    $str181$the_Change_Assertion_Direction_pa = makeString( "the Change Assertion Direction page" );
    $str182$Change_Assertion_Direction = makeString( "Change Assertion Direction" );
    $str183$cb_handle_change_direction = makeString( "cb-handle-change-direction" );
    $str184$Choose_a_direction__ = makeString( "Choose a direction :" );
    $str185$direction = makeString( "direction" );
    $str186$_backward = makeString( ":backward" );
    $kw187$BACKWARD = makeKeyword( "BACKWARD" );
    $str188$Backward = makeString( "Backward" );
    $str189$_forward = makeString( ":forward" );
    $kw190$FORWARD = makeKeyword( "FORWARD" );
    $str191$Forward = makeString( "Forward" );
    $str192$Change_Direction = makeString( "Change Direction" );
    $sym193$CB_CHANGE_DIRECTION = makeSymbol( "CB-CHANGE-DIRECTION" );
    $str194$direction_changes = makeString( "direction changes" );
    $str195$shoehorn_ = makeString( "shoehorn?" );
    $str196$_a_does_not_specify_a_valid_direc = makeString( "~a does not specify a valid direction" );
    $const197$cyclistNotes = constant_handles.reader_make_constant_shell( makeString( "cyclistNotes" ) );
    $str198$This_rule_was_shoehorned_forward_ = makeString( "This rule was shoehorned forward " );
    $str199$_by_ = makeString( " by " );
    $sym200$CB_HANDLE_CHANGE_DIRECTION = makeSymbol( "CB-HANDLE-CHANGE-DIRECTION" );
    $str201$_Change_Direction_ = makeString( "[Change Direction]" );
    $str202$cb_change_direction__a = makeString( "cb-change-direction&~a" );
    $sym203$CB_LINK_CHANGE_DIRECTION = makeSymbol( "CB-LINK-CHANGE-DIRECTION" );
    $kw204$CB_CHANGE_META_ASSERTION_MT = makeKeyword( "CB-CHANGE-META-ASSERTION-MT" );
    $str205$cb_change_meta_assertion_mt_html = makeString( "cb-change-meta-assertion-mt.html" );
    $str206$Change_Meta_Assertions_Mt = makeString( "Change Meta Assertions Mt" );
    $str207$cb_handle_change_meta_assertion_m = makeString( "cb-handle-change-meta-assertion-mt" );
    $str208$Change_the_Mt_of_Meta_Assertions_ = makeString( "Change the Mt of Meta-Assertions of the assertion : " );
    $str209$change_meta_ = makeString( "change_meta_" );
    $str210$Choose_the_meta_assertions__ = makeString( "Choose the meta assertions :" );
    $sym211$CB_CHANGE_META_ASSERTION_MT = makeSymbol( "CB-CHANGE-META-ASSERTION-MT" );
    $sym212$CB_HANDLE_CHANGE_META_ASSERTION_MT = makeSymbol( "CB-HANDLE-CHANGE-META-ASSERTION-MT" );
    $str213$_Change_Meta_Assertions_Mt_ = makeString( "[Change Meta Assertions Mt]" );
    $str214$cb_change_meta_assertion_mt__a = makeString( "cb-change-meta-assertion-mt&~a" );
    $sym215$CB_LINK_CHANGE_META_ASSERTION_MT = makeSymbol( "CB-LINK-CHANGE-META-ASSERTION-MT" );
    $kw216$CB_RENAME_VARIABLES = makeKeyword( "CB-RENAME-VARIABLES" );
    $str217$cb_rename_variables_html = makeString( "cb-rename-variables.html" );
    $str218$the_facility_to_rename_variables = makeString( "the facility to rename variables" );
    $str219$Rename_Assertion_Variables = makeString( "Rename Assertion Variables" );
    $str220$cb_handle_rename_variables = makeString( "cb-handle-rename-variables" );
    $str221$Rename_the_variables_of_the_asser = makeString( "Rename the variables of the assertion : " );
    $str222$Note__ = makeString( "Note: " );
    $str223$Variables_listed_in_ = makeString( "Variables listed in " );
    $str224$red = makeString( "red" );
    $str225$_have_invalid_variable_names___Va = makeString( " have invalid variable names.  Valid variables must satisfy the regular expression " );
    $kw226$LEFT = makeKeyword( "LEFT" );
    $kw227$TOP = makeKeyword( "TOP" );
    $str228$Current_Variable = makeString( "Current Variable" );
    $str229$Changed_Variable = makeString( "Changed Variable" );
    $str230$Rename_Variables = makeString( "Rename Variables" );
    $str231$rename = makeString( "rename" );
    $sym232$CB_RENAME_VARIABLES = makeSymbol( "CB-RENAME-VARIABLES" );
    $str233$No_variables_were_specified_to_be = makeString( "No variables were specified to be renamed." );
    $list234 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "RENAMED-VARIABLE" ) );
    $str235$The_proposed_rename_may_change_th = makeString( "The proposed rename may change the logical intent of the assertion, and would require unasserting and reasserting it.  Do you want to continue?" );
    $str236$Yes = makeString( "Yes" );
    $str237$continue = makeString( "continue" );
    $str238$No = makeString( "No" );
    $kw239$EDIT = makeKeyword( "EDIT" );
    $sym240$CB_HANDLE_RENAME_VARIABLES = makeSymbol( "CB-HANDLE-RENAME-VARIABLES" );
    $list241 = ConsesLow.list( makeSymbol( "VARIABLE-NAME" ), makeSymbol( "NEW-VARIABLE-NAME" ) );
    $list242 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_tab, Characters.CHAR_newline );
    $str243$_ = makeString( "?" );
    $str244$ = makeString( "" );
    $str245$Invalid_Variables = makeString( "Invalid Variables" );
    $str246$Back = makeString( "Back" );
    $str247$The_following_variables_have_inva = makeString( "The following variables have invalid variable names" );
    $sym248$STR = makeSymbol( "STR" );
    $str249$__ = makeString( ", " );
    $str250$__and_ = makeString( ", and " );
    $str251$Valid_variables_must_satisfy_the_ = makeString( "Valid variables must satisfy the regular expression " );
    $str252$_Rename_Variables_ = makeString( "[Rename Variables]" );
    $str253$cb_rename_variables__a = makeString( "cb-rename-variables&~a" );
    $sym254$CB_LINK_RENAME_VARIABLES = makeSymbol( "CB-LINK-RENAME-VARIABLES" );
    $str255$the_facility_to_repropagate_forwa = makeString( "the facility to repropagate forward inference on an assertion" );
    $str256$Forward_Assertion_Repropagation = makeString( "Forward Assertion Repropagation" );
    $str257$_a_does_not_specify_an_assertion = makeString( "~a does not specify an assertion" );
    $sym258$CB_REPROPAGATE = makeSymbol( "CB-REPROPAGATE" );
    $str259$_Repropagate_ = makeString( "[Repropagate]" );
    $str260$cb_repropagate__a = makeString( "cb-repropagate&~a" );
    $sym261$CB_LINK_REPROPAGATE = makeSymbol( "CB-LINK-REPROPAGATE" );
    $str262$the_facility_to_repropagate_and_b = makeString( "the facility to repropagate and browse forward inference on an assertion" );
    $str263$Forward_repropagation_complete___ = makeString( "Forward repropagation complete.  Browse results:" );
    $sym264$CB_REPROPAGATE_BROWSABLY = makeSymbol( "CB-REPROPAGATE-BROWSABLY" );
    $str265$_Repropagate_and_Browse_ = makeString( "[Repropagate and Browse]" );
    $str266$cb_repropagate_browsably__a = makeString( "cb-repropagate-browsably&~a" );
    $sym267$CB_LINK_REPROPAGATE_BROWSABLY = makeSymbol( "CB-LINK-REPROPAGATE-BROWSABLY" );
    $str268$the_facility_to_recanonicalize_an = makeString( "the facility to recanonicalize an assertion" );
    $str269$_S_did_not_specify_an_assertion_ = makeString( "~S did not specify an assertion." );
    $str270$Assertion_is_already_canonical = makeString( "Assertion is already canonical" );
    $str271$Recanonicalize_Assertion = makeString( "Recanonicalize Assertion" );
    $sym272$CB_RECANONICALIZE = makeSymbol( "CB-RECANONICALIZE" );
    $str273$_Recanonicalize_ = makeString( "[Recanonicalize]" );
    $str274$cb_recanonicalize__a = makeString( "cb-recanonicalize&~a" );
    $sym275$CB_LINK_RECANONICALIZE = makeSymbol( "CB-LINK-RECANONICALIZE" );
    $kw276$CB_WFF = makeKeyword( "CB-WFF" );
    $str277$cb_wff_html = makeString( "cb-wff.html" );
    $str278$WFF_Check_Sentence = makeString( "WFF-Check Sentence" );
    $str279$cb_handle_wff = makeString( "cb-handle-wff" );
    $str280$Clear = makeString( "Clear" );
    $const281$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $list282 = ConsesLow.list( new SubLObject[] { makeKeyword( "INPUT-NAME" ), makeString( "sentence" ), makeKeyword( "COMPLETE-LABEL" ), makeString( "Complete" ), makeKeyword( "CYCLIFY-LABEL" ), makeString( "Cyclify" ),
      makeKeyword( "CLEAR-LABEL" ), makeString( "Clear Sentence" ), makeKeyword( "HEIGHT" ), TWENTY_INTEGER, makeKeyword( "WIDTH" ), makeInteger( 80 )
    } );
    $sym283$CB_WFF = makeSymbol( "CB-WFF" );
    $str284$WFF_Check = makeString( "WFF Check" );
    $kw285$MAIN = makeKeyword( "MAIN" );
    $str286$cb_wff = makeString( "cb-wff" );
    $kw287$WFF = makeKeyword( "WFF" );
    $sym288$CB_LINK_WFF = makeSymbol( "CB-LINK-WFF" );
    $str289$WFF = makeString( "WFF" );
    $str290$Check_a_CycL_Expression_for_well_ = makeString( "Check a CycL Expression for well-formedness" );
    $sym291$CB_HANDLE_WFF = makeSymbol( "CB-HANDLE-WFF" );
    $list292 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "sentence" ) );
    $str293$Sentence_is_Well_Formed = makeString( "Sentence is Well Formed" );
    $str294$WFF_Status___ = makeString( "WFF-Status : " );
    $str295$OK = makeString( "OK" );
    $list296 = ConsesLow.list( ConsesLow.list( makeKeyword( "DEFAULT" ), makeString( "cb-handle-assert" ), makeString( "Assert Sentence" ), makeString( "Assert Sentence" ) ), ConsesLow.list( makeKeyword( "SIMILAR" ),
        makeString( "cb-handle-assert" ), makeString( "Assert Similar Sentence" ), makeString( "Assert Sentence" ) ), ConsesLow.list( makeKeyword( "EDIT" ), makeString( "cb-handle-edit" ), makeString( "Edit Assertion" ),
            makeString( "Perform Edit" ) ), ConsesLow.list( makeKeyword( "EDIT-SENTENCE" ), makeString( "cb-handle-sentence-edit" ), makeString( "Edit Sentence" ), makeString( "Perform Edit" ) ), ConsesLow.list(
                makeKeyword( "FIX-TYPO" ), makeString( "cb-handle-fix-typo" ), makeString( "Fix Assertion" ), makeString( "Perform Fix" ) ), ConsesLow.list( makeKeyword( "META" ), makeString( "cb-handle-assert-meta" ),
                    makeString( "Assert Meta Assertion" ), makeString( "Assert Sentence" ) ) );
    $sym297$CB_ASSERT = makeSymbol( "CB-ASSERT" );
    $str298$assertions = makeString( "assertions" );
    $str299$wff_check = makeString( "wff-check" );
    $str300$assertion_queue = makeString( "assertion-queue" );
    $kw301$BROWSE = makeKeyword( "BROWSE" );
    $str302$Forward_propagation_complete___Br = makeString( "Forward propagation complete.  Browse results:" );
    $kw303$NOW = makeKeyword( "NOW" );
    $str304$EL_Sentence_Assert = makeString( "EL Sentence Assert" );
    $sym305$CB_HANDLE_ASSERT = makeSymbol( "CB-HANDLE-ASSERT" );
    $kw306$ASSERT = makeKeyword( "ASSERT" );
    $str307$assert_tool_gif = makeString( "assert-tool.gif" );
    $str308$Assert = makeString( "Assert" );
    $str309$cb_assert = makeString( "cb-assert" );
    $sym310$CB_LINK_ASSERT = makeSymbol( "CB-LINK-ASSERT" );
    $str311$Asrt = makeString( "Asrt" );
    $str312$Assert_CycL_Expression = makeString( "Assert CycL Expression" );
    $kw313$CB_ASSERT_INTERNAL = makeKeyword( "CB-ASSERT-INTERNAL" );
    $str314$cb_assert_internal_html = makeString( "cb-assert-internal.html" );
    $str315$Fatal_Error = makeString( "Fatal Error" );
    $str316$cb_assert_called_without_a_valid_ = makeString( "cb-assert called without a valid mode" );
    $list317 = ConsesLow.list( makeSymbol( "KEYWORD" ), makeSymbol( "HANDLER" ), makeSymbol( "TITLE" ), makeSymbol( "ACTION-LABEL" ) );
    $kw318$META = makeKeyword( "META" );
    $str319$Please_use_ = makeString( "Please use " );
    $str320$_to_refer_to_the_following_assert = makeString( " to refer to the following assertion :" );
    $str321$Reset_All_Fields = makeString( "Reset All Fields" );
    $str322$assert = makeString( "assert" );
    $kw323$SIMILAR = makeKeyword( "SIMILAR" );
    $str324$_local = makeString( ":local" );
    $kw325$LOCAL = makeKeyword( "LOCAL" );
    $str326$Assert_using_Local_queue = makeString( "Assert using Local queue" );
    $str327$_browse = makeString( ":browse" );
    $str328$Assert_now_and_browse_forward_inf = makeString( "Assert now and browse forward inference" );
    $str329$_now = makeString( ":now" );
    $str330$Assert_now__bypassing_Local_queue = makeString( "Assert now, bypassing Local queue" );
    $str331$cb_assert_parameters = makeString( "cb-assert-parameters" );
    $str332$Show = makeString( "Show" );
    $str333$Hide = makeString( "Hide" );
    $str334$Assert_Context = makeString( "Assert Context" );
    $kw335$INVISIBLE = makeKeyword( "INVISIBLE" );
    $kw336$PARAGRAPH = makeKeyword( "PARAGRAPH" );
    $kw337$EDIT_ONLY = makeKeyword( "EDIT-ONLY" );
    $kw338$EDIT_ALLOWED_ = makeKeyword( "EDIT-ALLOWED?" );
    $kw339$MONAD_CHOICES = makeKeyword( "MONAD-CHOICES" );
    $list340 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ) );
    $kw341$ANYTIME_PSC_ALLOWED_ = makeKeyword( "ANYTIME-PSC-ALLOWED?" );
    $kw342$INPUT_NAME = makeKeyword( "INPUT-NAME" );
    $str343$sentence = makeString( "sentence" );
    $kw344$COMPLETE_LABEL = makeKeyword( "COMPLETE-LABEL" );
    $str345$Complete = makeString( "Complete" );
    $kw346$CYCLIFY_LABEL = makeKeyword( "CYCLIFY-LABEL" );
    $str347$Cyclify = makeString( "Cyclify" );
    $kw348$CLEAR_LABEL = makeKeyword( "CLEAR-LABEL" );
    $str349$Clear_Sentence = makeString( "Clear Sentence" );
    $kw350$HEIGHT = makeKeyword( "HEIGHT" );
    $kw351$WIDTH = makeKeyword( "WIDTH" );
    $int352$80 = makeInteger( 80 );
    $kw353$MODE = makeKeyword( "MODE" );
    $kw354$CHOICES = makeKeyword( "CHOICES" );
    $list355 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "exceptWhen" ) ), constant_handles
        .reader_make_constant_shell( makeString( "pragmaticRequirement" ) ), constant_handles.reader_make_constant_shell( makeString( "salientAssertions" ) ) );
    $str356$cb_handle_fix_typo = makeString( "cb-handle-fix-typo" );
    $str357$cb_handle_edit = makeString( "cb-handle-edit" );
    $str358$cb_handle_sentence_edit = makeString( "cb-handle-sentence-edit" );
    $str359$Choose_analogous_meta_assertions_ = makeString( "Choose analogous meta-assertions to assert :" );
    $const360$assertionOriginalText = constant_handles.reader_make_constant_shell( makeString( "assertionOriginalText" ) );
    $str361$_a_S = makeString( "~a~S" );
    $const362$TheAssertionSentence = constant_handles.reader_make_constant_shell( makeString( "TheAssertionSentence" ) );
    $sym363$STRINGP = makeSymbol( "STRINGP" );
    $str364$_S_did_not_specify_a_microtheory_ = makeString( "~S did not specify a microtheory." );
    $str365$_S_is_not_a_microtheory_ = makeString( "~S is not a microtheory." );
    $const366$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $str367$Bad_sentence__probably_due_to_a_m = makeString( "Bad sentence, probably due to a misspelling.~%Check these inputs:~%~%~S" );
    $list368 = ConsesLow.list( makeSymbol( "FORMULA-ID" ), makeSymbol( "MT-ID" ) );
    $const369$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $sym370$CB_ASSERT_FORMULA = makeSymbol( "CB-ASSERT-FORMULA" );
    $const371$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $str372$_Assert_Formula_ = makeString( "[Assert Formula]" );
    $str373$cb_assert_formula__A__A = makeString( "cb-assert-formula&~A&~A" );
    $kw374$ASSERT_FORMULA = makeKeyword( "ASSERT-FORMULA" );
    $sym375$CB_LINK_ASSERT_FORMULA = makeSymbol( "CB-LINK-ASSERT-FORMULA" );
    $sym376$CB_SIMILAR = makeSymbol( "CB-SIMILAR" );
    $str377$_Assert_Similar_ = makeString( "[Assert Similar]" );
    $str378$cb_similar__a = makeString( "cb-similar&~a" );
    $sym379$CB_LINK_ASSERT_SIMILAR = makeSymbol( "CB-LINK-ASSERT-SIMILAR" );
    $sym380$CB_ASSERT_META = makeSymbol( "CB-ASSERT-META" );
    $str381$editing = makeString( "editing" );
    $str382$The_sentence_did_not_mention__S_ = makeString( "The sentence did not mention ~S." );
    $str383$EL_Meta_Sentence_Assert = makeString( "EL Meta Sentence Assert" );
    $sym384$CB_HANDLE_ASSERT_META = makeSymbol( "CB-HANDLE-ASSERT-META" );
    $str385$_Assert_Meta_ = makeString( "[Assert Meta]" );
    $str386$cb_assert_meta__a = makeString( "cb-assert-meta&~a" );
    $sym387$CB_LINK_ASSERT_META = makeSymbol( "CB-LINK-ASSERT-META" );
    $sym388$CB_SUGGEST_PRAGMAS = makeSymbol( "CB-SUGGEST-PRAGMAS" );
    $str389$_Suggest_Pragmas_ = makeString( "[Suggest Pragmas]" );
    $str390$cb_suggest_pragmas__a = makeString( "cb-suggest-pragmas&~a" );
    $sym391$CB_LINK_SUGGEST_PRAGMAS = makeSymbol( "CB-LINK-SUGGEST-PRAGMAS" );
    $str392$Suggested_Pragmas = makeString( "Suggested Pragmas" );
    $kw393$CB_SUGGEST_PRAGMAS = makeKeyword( "CB-SUGGEST-PRAGMAS" );
    $str394$Pragmatic_requirements_worth_cons = makeString( "Pragmatic requirements worth considering for :" );
    $const395$pragmaticRequirement = constant_handles.reader_make_constant_shell( makeString( "pragmaticRequirement" ) );
    $kw396$ASSERT_SUGGESTED_PRAGMA = makeKeyword( "ASSERT-SUGGESTED-PRAGMA" );
    $str397$_Assert_ = makeString( "[Assert]" );
    $kw398$NBSP = makeKeyword( "NBSP" );
    $str399$cb_assert_suggested_pragma__a__a = makeString( "cb-assert-suggested-pragma&~a&~a" );
    $sym400$CB_LINK_ASSERT_SUGGESTED_PRAGMA = makeSymbol( "CB-LINK-ASSERT-SUGGESTED-PRAGMA" );
    $list401 = ConsesLow.list( makeSymbol( "ID-STRING" ), makeSymbol( "PRAGMA-STRING" ) );
    $sym402$CB_ASSERT_SUGGESTED_PRAGMA = makeSymbol( "CB-ASSERT-SUGGESTED-PRAGMA" );
    $sym403$CLET = makeSymbol( "CLET" );
    $list404 = ConsesLow.list( ConsesLow.list( makeSymbol( "*AT-CHECK-ARG-FORMAT?*" ), NIL ), ConsesLow.list( makeSymbol( "*AT-CHECK-RELATOR-CONSTRAINTS?*" ), NIL ) );
    $sym405$CB_EDIT = makeSymbol( "CB-EDIT" );
    $str406$Assertion_Edit = makeString( "Assertion Edit" );
    $sym407$CB_HANDLE_EDIT = makeSymbol( "CB-HANDLE-EDIT" );
    $list408 = ConsesLow.list( makeSymbol( "INPUT-NAME" ), makeSymbol( "ASSERTION-ID-STRING" ) );
    $str409$_Edit_ = makeString( "[Edit]" );
    $str410$cb_edit__a = makeString( "cb-edit&~a" );
    $sym411$CB_LINK_EDIT_ASSERTION = makeSymbol( "CB-LINK-EDIT-ASSERTION" );
    $str412$error = makeString( "error" );
    $str413$_S = makeString( "~S" );
    $str414$assertion_editing_facilities = makeString( "assertion editing facilities" );
    $sym415$_EXIT = makeSymbol( "%EXIT" );
    $str416$oldAssertionId = makeString( "oldAssertionId" );
    $kw417$SENTENCE_NUM = makeKeyword( "SENTENCE-NUM" );
    $kw418$MESSAGE = makeKeyword( "MESSAGE" );
    $str419$response = makeString( "response" );
    $kw420$NOT_WELL_FORMED = makeKeyword( "NOT-WELL-FORMED" );
    $str421$invalidSentence = makeString( "invalidSentence" );
    $str422$message = makeString( "message" );
    $str423$count = makeString( "count" );
    $str424$assertionsQueued = makeString( "assertionsQueued" );
    $str425$_A_assertion_P_added_to_the_local = makeString( "~A assertion~P added to the local queue." );
    $list426 = ConsesLow.list( makeString( "count" ), makeString( "1" ) );
    $str427$unassertedQueued = makeString( "unassertedQueued" );
    $str428$_A_unassert__P_added_to_the_local = makeString( "~A unassert~:P added to the local queue." );
    $sym429$CB_HANDLE_EDIT_ASSERTION = makeSymbol( "CB-HANDLE-EDIT-ASSERTION" );
    $kw430$XML_HANDLER = makeKeyword( "XML-HANDLER" );
    $str431$_S_did_not_specify_a_CycL_sentenc = makeString( "~S did not specify a CycL sentence eligible for editing." );
    $sym432$CB_HANDLE_SENTENCE_EDIT = makeSymbol( "CB-HANDLE-SENTENCE-EDIT" );
    $str433$the_Cyc_KB_typo_fixing_facilities = makeString( "the Cyc KB typo fixing facilities" );
    $sym434$CB_FIX_TYPO_EDIT = makeSymbol( "CB-FIX-TYPO-EDIT" );
    $str435$_Fix_Typo_ = makeString( "[Fix Typo]" );
    $str436$cb_fix_typo_edit__a = makeString( "cb-fix-typo-edit&~a" );
    $sym437$CB_LINK_FIX_TYPO = makeSymbol( "CB-LINK-FIX-TYPO" );
    $sym438$CYCL_STRING_P = makeSymbol( "CYCL-STRING-P" );
    $str439$Edited_sentence_does_not_differ_o = makeString( "Edited sentence does not differ only in strings." );
    $sym440$CB_HANDLE_FIX_TYPO = makeSymbol( "CB-HANDLE-FIX-TYPO" );
    $str441$Reassert = makeString( "Reassert" );
    $sym442$CB_REASSERT = makeSymbol( "CB-REASSERT" );
    $str443$_Reassert_ = makeString( "[Reassert]" );
    $str444$cb_reassert__a = makeString( "cb-reassert&~a" );
    $sym445$CB_LINK_REASSERT = makeSymbol( "CB-LINK-REASSERT" );
    $str446$Unassert = makeString( "Unassert" );
    $sym447$CB_UNASSERT = makeSymbol( "CB-UNASSERT" );
    $str448$_Unassert_ = makeString( "[Unassert]" );
    $str449$cb_unassert__a = makeString( "cb-unassert&~a" );
    $sym450$CB_LINK_UNASSERT = makeSymbol( "CB-LINK-UNASSERT" );
    $str451$Assertion_Blast = makeString( "Assertion Blast" );
    $sym452$CB_BLAST = makeSymbol( "CB-BLAST" );
    $str453$_Blast_ = makeString( "[Blast]" );
    $str454$cb_blast__a = makeString( "cb-blast&~a" );
    $sym455$CB_LINK_BLAST = makeSymbol( "CB-LINK-BLAST" );
    $list456 = ConsesLow.list( makeSymbol( "ID-STRING" ) );
    $str457$_a_does_not_specify_a_deduction = makeString( "~a does not specify a deduction" );
    $str458$Deduction_Removal = makeString( "Deduction Removal" );
    $sym459$CB_REMOVE_DEDUCTION = makeSymbol( "CB-REMOVE-DEDUCTION" );
    $str460$_Remove_Deduction_ = makeString( "[Remove Deduction]" );
    $str461$cb_remove_deduction__a = makeString( "cb-remove-deduction&~a" );
    $kw462$REMOVE_DEDUCTION = makeKeyword( "REMOVE-DEDUCTION" );
    $sym463$CB_LINK_REMOVE_DEDUCTION = makeSymbol( "CB-LINK-REMOVE-DEDUCTION" );
    $str464$Redo_TMS_for_Assertion = makeString( "Redo TMS for Assertion" );
    $sym465$CB_ASSERTION_TMS = makeSymbol( "CB-ASSERTION-TMS" );
    $str466$_Redo_TMS_ = makeString( "[Redo TMS]" );
    $str467$cb_assertion_tms__a = makeString( "cb-assertion-tms&~a" );
    $sym468$CB_LINK_ASSERT_TMS = makeSymbol( "CB-LINK-ASSERT-TMS" );
    $kw469$CB_DIAGNOSE_ASSERTION = makeKeyword( "CB-DIAGNOSE-ASSERTION" );
    $str470$cb_diagnose_assertion_html = makeString( "cb-diagnose-assertion.html" );
    $str471$the_Assertion_Diagnostics_page = makeString( "the Assertion Diagnostics page" );
    $str472$_a_does_not_specify_a_Cyc_asserti = makeString( "~a does not specify a Cyc assertion" );
    $str473$Assertion_Diagnostics = makeString( "Assertion Diagnostics" );
    $str474$Diagnosis_of__ = makeString( "Diagnosis of :" );
    $sym475$CB_DIAGNOSE_ASSERTION = makeSymbol( "CB-DIAGNOSE-ASSERTION" );
    $str476$_Run_Diagnostics_ = makeString( "[Run Diagnostics]" );
    $str477$cb_diagnose_assertion__A = makeString( "cb-diagnose-assertion&~A" );
    $kw478$DIAGNOSE_ASSERTION = makeKeyword( "DIAGNOSE-ASSERTION" );
    $sym479$CB_LINK_DIAGNOSE_ASSERTION = makeSymbol( "CB-LINK-DIAGNOSE-ASSERTION" );
    $sym480$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $sym481$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $str482$cb_trigger_test__a__a = makeString( "cb-trigger-test&~a&~a" );
    $str483$cb_trigger_test__a = makeString( "cb-trigger-test&~a" );
    $str484$cb_trigger_test = makeString( "cb-trigger-test" );
    $sym485$CB_LINK_TRIGGER_TEST = makeSymbol( "CB-LINK-TRIGGER-TEST" );
    $list486 = ConsesLow.list( makeSymbol( "SUPPORT-ID" ), makeSymbol( "RULE-ID" ) );
    $str487$the_Trigger_Test_page = makeString( "the Trigger Test page" );
    $sym488$CB_TRIGGER_TEST = makeSymbol( "CB-TRIGGER-TEST" );
    $const489$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $str490$Trigger_Test_Results = makeString( "Trigger Test Results" );
    $kw491$CB_TRIGGER_TEST = makeKeyword( "CB-TRIGGER-TEST" );
    $str492$Results_of_triggering__ = makeString( "Results of triggering :" );
    $str493$_Retrigger_ = makeString( "[Retrigger]" );
    $str494$against_rule__ = makeString( "against rule :" );
    $str495$No_results_ = makeString( "No results." );
    $str496$One_Conclusion = makeString( "One Conclusion" );
    $str497$Conclusions__ = makeString( "Conclusions (" );
    $str498$_total_ = makeString( " total)" );
    $str499$Justification = makeString( "Justification" );
    $list500 = ConsesLow.list( ConsesLow.list( makeSymbol( "GAF-CNF" ), makeSymbol( "CONCLUDED-MT" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) ), ConsesLow.list( makeSymbol( "DEDUCTION-TOKEN" ), makeSymbol( "&REST" ),
        makeSymbol( "JUSTIFICATION" ) ) );
    $kw501$OPAQUE = makeKeyword( "OPAQUE" );
    $str502$just = makeString( "just" );
    $str503$Trigger_Test_Setup = makeString( "Trigger Test Setup" );
    $str504$Support_to_trigger__ = makeString( "Support to trigger :" );
    $str505$Please_select_a_rule_to_trigger__ = makeString( "Please select a rule to trigger :" );
    $str506$_Trigger_ = makeString( "[Trigger]" );
    $str507$There_are_currently_no_rules_in_y = makeString( "There are currently no rules in your history." );
    $str508$Rule_to_trigger__ = makeString( "Rule to trigger :" );
    $str509$Please_select_a_support_to_trigge = makeString( "Please select a support to trigger :" );
    $str510$There_are_currently_no_supports_i = makeString( "There are currently no supports in your history." );
    $str511$Time_to_implement_cb_trigger_test = makeString( "Time to implement cb-trigger-test-unspecified" );
    $sym512$_CB_PROOF_CHECKER_RULES_ = makeSymbol( "*CB-PROOF-CHECKER-RULES*" );
    $sym513$VALID_ASSERTION = makeSymbol( "VALID-ASSERTION" );
    $str514$Assertion_specified_was_not_a_rul = makeString( "Assertion specified was not a rule" );
    $str515$Rule_has_been_added_to_proof_chec = makeString( "Rule has been added to proof checker rule set." );
    $sym516$CB_USE_IN_PROOF = makeSymbol( "CB-USE-IN-PROOF" );
    $sym517$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $str518$_Use_in_Proof_ = makeString( "[Use in Proof]" );
    $str519$cb_use_in_proof__a = makeString( "cb-use-in-proof&~a" );
    $sym520$CB_LINK_USE_IN_PROOF = makeSymbol( "CB-LINK-USE-IN-PROOF" );
    $str521$_a_does_not_specify_a_rule = makeString( "~a does not specify a rule" );
    $sym522$CB_REINFORCE_RULE = makeSymbol( "CB-REINFORCE-RULE" );
    $str523$_Reinforce_ = makeString( "[Reinforce]" );
    $str524$cb_reinforce_rule__a = makeString( "cb-reinforce-rule&~a" );
    $sym525$CB_LINK_REINFORCE_RULE = makeSymbol( "CB-LINK-REINFORCE-RULE" );
    $int526$100 = makeInteger( 100 );
    $kw527$STRENGTH_INPUT_NAME = makeKeyword( "STRENGTH-INPUT-NAME" );
    $kw528$DIRECTION_INPUT_NAME = makeKeyword( "DIRECTION-INPUT-NAME" );
    $str529$Strength__ = makeString( "Strength :" );
    $str530$_default_strength = makeString( ":default-strength" );
    $str531$_monotonic_strength = makeString( ":monotonic-strength" );
    $str532$Direction__ = makeString( "Direction :" );
    $str533$_ = makeString( "[" );
    $str534$_ = makeString( "]" );
    $kw535$CONTENT = makeKeyword( "CONTENT" );
    $str536$cb_assertion_graph__A = makeString( "cb-assertion-graph&~A" );
    $kw537$ASSERTION_GRAPH = makeKeyword( "ASSERTION-GRAPH" );
    $sym538$CB_LINK_ASSERTION_GRAPH = makeSymbol( "CB-LINK-ASSERTION-GRAPH" );
    $sym539$CB_ASSERTION_GRAPH = makeSymbol( "CB-ASSERTION-GRAPH" );
    $str540$Graph_of_an_assertion = makeString( "Graph of an assertion" );
    $str541$Refresh = makeString( "Refresh" );
    $str542$reloadCurrentFrame__reloadFrameBu = makeString( "reloadCurrentFrame('reloadFrameButton');" );
    $str543$Graph_for_ = makeString( "Graph for:" );
    $str544$Rule_Graph = makeString( "Rule Graph" );
    $str545$Unknown_Graph = makeString( "Unknown Graph" );
    $str546$_a = makeString( "~a" );
    $int547$30 = makeInteger( 30 );
    $kw548$BUILDER_FN = makeKeyword( "BUILDER-FN" );
    $sym549$BBF_RULE = makeSymbol( "BBF-RULE" );
    $kw550$ASSERTIONS = makeKeyword( "ASSERTIONS" );
    $int551$800 = makeInteger( 800 );
    $int552$600 = makeInteger( 600 );
    $kw553$SIGNATURE = makeKeyword( "SIGNATURE" );
  }

  public static final class $cb_assertion_spec_native
      extends
        SubLStructNative
  {
    public SubLObject $sentence;
    public SubLObject $mt;
    public SubLObject $strength;
    public SubLObject $direction;
    public SubLObject $unasserts;
    public SubLObject $metas;
    private static final SubLStructDeclNative structDecl;

    public $cb_assertion_spec_native()
    {
      this.$sentence = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$strength = CommonSymbols.NIL;
      this.$direction = CommonSymbols.NIL;
      this.$unasserts = CommonSymbols.NIL;
      this.$metas = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cb_assertion_spec_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$sentence;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$strength;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$direction;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$unasserts;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$metas;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$sentence = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$strength = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$direction = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$unasserts = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$metas = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cb_assertion_spec_native.class, $sym1$CB_ASSERTION_SPEC, $sym2$CB_ASSERTION_SPEC_P, $list3, $list4, new String[] { "$sentence", "$mt", "$strength", "$direction",
        "$unasserts", "$metas"
      }, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $cb_assertion_spec_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cb_assertion_spec_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CB-ASSERTION-SPEC-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cb_assertion_spec_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 3893 ms synthetic
 */