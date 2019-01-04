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

public final class cb_assertion_editor extends SubLTranslatedFile
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
    public static SubLObject cb_change_mt_hook(final SubLObject assertion, final SubLObject new_mt, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == cb_assertion_editor.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)cb_assertion_editor.NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        return ke.ke_change_assertion_mt(assertion, new_mt, meta_assertions_to_preserve);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1009L)
    public static SubLObject cb_change_strength_hook(final SubLObject assertion, final SubLObject strength) {
        return ke.ke_change_assertion_strength(assertion, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1122L)
    public static SubLObject cb_change_direction_hook(final SubLObject assertion, final SubLObject direction) {
        return ke.ke_change_assertion_direction(assertion, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1239L)
    public static SubLObject cb_repropagate_hook(final SubLObject assertion) {
        return ke.ke_repropagate_assertion(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1326L)
    public static SubLObject cb_repropagate_browsably_hook(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cb_assertion_editor.NIL;
        final SubLObject _prev_bind_0 = control_vars.$browse_forward_inferencesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = forward.$forward_inference_browsing_callback$.currentBinding(thread);
        final SubLObject _prev_bind_3 = forward.$forward_inference_browsing_callback_more_infoP$.currentBinding(thread);
        try {
            control_vars.$browse_forward_inferencesP$.bind((SubLObject)cb_assertion_editor.T, thread);
            forward.$forward_inference_browsing_callback$.bind((SubLObject)cb_assertion_editor.$sym0$CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING, thread);
            forward.$forward_inference_browsing_callback_more_infoP$.bind((SubLObject)cb_assertion_editor.T, thread);
            cb_forward_inference_browser.prepare_to_browse_new_forward_inference(assertion);
            result = ke.ke_repropagate_assertion_now(assertion);
            cb_forward_inference_browser.cleanup_from_browsing_new_forward_inference();
        }
        finally {
            forward.$forward_inference_browsing_callback_more_infoP$.rebind(_prev_bind_3, thread);
            forward.$forward_inference_browsing_callback$.rebind(_prev_bind_2, thread);
            control_vars.$browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1618L)
    public static SubLObject cb_recanonicalize_hook(final SubLObject assertion, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == cb_assertion_editor.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)cb_assertion_editor.NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(fi.assertion_fi_ist_formula(assertion, (SubLObject)cb_assertion_editor.UNPROVIDED), (SubLObject)cb_assertion_editor.NIL);
        return ke.ke_recanonicalize_assertion(assertion, meta_assertions_to_preserve);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 1909L)
    public static SubLObject cb_rename_variables_hook(final SubLObject assertion, final SubLObject rename_variable_alist) {
        return ke.ke_rename_variables(uncanonicalizer.assertion_el_formula(assertion), rename_variable_alist, assertions_high.assertion_mt(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 2088L)
    public static SubLObject cb_edit_assertion_hook(final SubLObject assertion, final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, SubLObject meta_assertions_to_preserve, SubLObject sentence_string_to_preserve) {
        if (meta_assertions_to_preserve == cb_assertion_editor.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)cb_assertion_editor.NIL;
        }
        if (sentence_string_to_preserve == cb_assertion_editor.UNPROVIDED) {
            sentence_string_to_preserve = (SubLObject)cb_assertion_editor.NIL;
        }
        SubLObject result = (SubLObject)cb_assertion_editor.NIL;
        cb_tools.cb_rem_from_assertion_history(assertion);
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
        if (cb_assertion_editor.NIL != meta_assertions_to_preserve) {
            result = ke.ke_edit_assertion_preserving_meta_assertions(assertion, meta_assertions_to_preserve, sentence, mt, strength, direction);
        }
        else {
            result = ke.ke_edit_assertion(assertion, sentence, mt, strength, direction);
        }
        if (cb_assertion_editor.NIL != result && sentence_string_to_preserve.isString()) {
            ke.ke_add_assertion_original_text(sentence, mt, sentence_string_to_preserve, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 2772L)
    public static SubLObject cb_null_edit_assertion_hook(final SubLObject assertion) {
        if (cb_assertion_editor.NIL != assertions_high.asserted_assertionP(assertion)) {
            return cb_recanonicalize_hook(assertion, assertion_utilities.meta_assertion_list_for_editing(assertion));
        }
        return ke.ke_reassert_assertion(assertion, assertions_high.assertion_strength(assertion), assertions_high.assertion_direction(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3072L)
    public static SubLObject cb_edit_assertion_strings_hook(final SubLObject assertion, final SubLObject sentence, SubLObject meta_assertions_to_preserve) {
        if (meta_assertions_to_preserve == cb_assertion_editor.UNPROVIDED) {
            meta_assertions_to_preserve = (SubLObject)cb_assertion_editor.NIL;
        }
        cb_tools.cb_rem_from_assertion_history(assertion);
        return ke.ke_edit_assertion_strings(assertion, sentence, meta_assertions_to_preserve);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject cb_assertion_spec_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)cb_assertion_editor.ZERO_INTEGER);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject cb_assertion_spec_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $cb_assertion_spec_native.class) ? cb_assertion_editor.T : cb_assertion_editor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject assertion_spec_sentence(final SubLObject v_object) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject assertion_spec_mt(final SubLObject v_object) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject assertion_spec_strength(final SubLObject v_object) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject assertion_spec_direction(final SubLObject v_object) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject assertion_spec_unasserts(final SubLObject v_object) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject assertion_spec_metas(final SubLObject v_object) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject _csetf_assertion_spec_sentence(final SubLObject v_object, final SubLObject value) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject _csetf_assertion_spec_mt(final SubLObject v_object, final SubLObject value) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject _csetf_assertion_spec_strength(final SubLObject v_object, final SubLObject value) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject _csetf_assertion_spec_direction(final SubLObject v_object, final SubLObject value) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject _csetf_assertion_spec_unasserts(final SubLObject v_object, final SubLObject value) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject _csetf_assertion_spec_metas(final SubLObject v_object, final SubLObject value) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject make_cb_assertion_spec(SubLObject arglist) {
        if (arglist == cb_assertion_editor.UNPROVIDED) {
            arglist = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $cb_assertion_spec_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_assertion_editor.NIL, next = arglist; cb_assertion_editor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_assertion_editor.$kw22$SENTENCE)) {
                _csetf_assertion_spec_sentence(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_assertion_editor.$kw23$MT)) {
                _csetf_assertion_spec_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_assertion_editor.$kw24$STRENGTH)) {
                _csetf_assertion_spec_strength(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_assertion_editor.$kw25$DIRECTION)) {
                _csetf_assertion_spec_direction(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_assertion_editor.$kw26$UNASSERTS)) {
                _csetf_assertion_spec_unasserts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_assertion_editor.$kw27$METAS)) {
                _csetf_assertion_spec_metas(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_assertion_editor.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject visit_defstruct_cb_assertion_spec(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_assertion_editor.$kw29$BEGIN, (SubLObject)cb_assertion_editor.$sym30$MAKE_CB_ASSERTION_SPEC, (SubLObject)cb_assertion_editor.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_assertion_editor.$kw31$SLOT, (SubLObject)cb_assertion_editor.$kw22$SENTENCE, assertion_spec_sentence(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_assertion_editor.$kw31$SLOT, (SubLObject)cb_assertion_editor.$kw23$MT, assertion_spec_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_assertion_editor.$kw31$SLOT, (SubLObject)cb_assertion_editor.$kw24$STRENGTH, assertion_spec_strength(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_assertion_editor.$kw31$SLOT, (SubLObject)cb_assertion_editor.$kw25$DIRECTION, assertion_spec_direction(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_assertion_editor.$kw31$SLOT, (SubLObject)cb_assertion_editor.$kw26$UNASSERTS, assertion_spec_unasserts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_assertion_editor.$kw31$SLOT, (SubLObject)cb_assertion_editor.$kw27$METAS, assertion_spec_metas(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_assertion_editor.$kw32$END, (SubLObject)cb_assertion_editor.$sym30$MAKE_CB_ASSERTION_SPEC, (SubLObject)cb_assertion_editor.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 3624L)
    public static SubLObject visit_defstruct_object_cb_assertion_spec_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cb_assertion_spec(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 4107L)
    public static SubLObject new_cb_assertion_spec(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction, SubLObject unasserts, SubLObject metas) {
        if (strength == cb_assertion_editor.UNPROVIDED) {
            strength = (SubLObject)cb_assertion_editor.NIL;
        }
        if (direction == cb_assertion_editor.UNPROVIDED) {
            direction = (SubLObject)cb_assertion_editor.NIL;
        }
        if (unasserts == cb_assertion_editor.UNPROVIDED) {
            unasserts = (SubLObject)cb_assertion_editor.NIL;
        }
        if (metas == cb_assertion_editor.UNPROVIDED) {
            metas = (SubLObject)cb_assertion_editor.NIL;
        }
        return make_cb_assertion_spec((SubLObject)ConsesLow.list(new SubLObject[] { cb_assertion_editor.$kw22$SENTENCE, sentence, cb_assertion_editor.$kw23$MT, mt, cb_assertion_editor.$kw24$STRENGTH, strength, cb_assertion_editor.$kw25$DIRECTION, direction, cb_assertion_editor.$kw26$UNASSERTS, unasserts, cb_assertion_editor.$kw27$METAS, metas }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 4404L)
    public static SubLObject ke_assert_assertion_spec(final SubLObject cb_assertion_spec) {
        assert cb_assertion_editor.NIL != cb_assertion_spec_p(cb_assertion_spec) : cb_assertion_spec;
        final SubLObject sentence = assertion_spec_sentence(cb_assertion_spec);
        final SubLObject mt = assertion_spec_mt(cb_assertion_spec);
        final SubLObject strength = assertion_spec_strength(cb_assertion_spec);
        final SubLObject direction = assertion_spec_direction(cb_assertion_spec);
        return ke.ke_assert(sentence, mt, strength, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 4962L)
    public static SubLObject cb_note_edit_change(final SubLObject message, final SubLObject queue_usedP, SubLObject back, SubLObject delay) {
        if (back == cb_assertion_editor.UNPROVIDED) {
            back = (SubLObject)cb_assertion_editor.TWO_INTEGER;
        }
        if (delay == cb_assertion_editor.UNPROVIDED) {
            delay = (SubLObject)cb_assertion_editor.$int34$2000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject final_message = (SubLObject)cb_assertion_editor.NIL;
        if (cb_assertion_editor.NIL != queue_usedP && cb_assertion_editor.NIL != api_control_vars.$use_local_queueP$.getDynamicValue(thread)) {
            final_message = PrintLow.format((SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$str35$_a_operation_was_added_to_queue, message);
        }
        else {
            final_message = PrintLow.format((SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$str36$_a_operation_completed, message);
        }
        if (back.eql((SubLObject)cb_assertion_editor.ONE_INTEGER)) {
            return cb_utilities.cb_simple_message_page(final_message, back, delay);
        }
        return cb_utilities.cb_message_page_with_history(final_message, (SubLObject)cb_assertion_editor.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 5408L)
    public static SubLObject cb_attempt_to_repair_and_assert(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject args, final SubLObject violations) {
        final SubLObject metas = (SubLObject)cb_assertion_editor.NIL;
        return cb_explain_why_not_wff(sentence, mt, violations, strength, direction, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, metas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 6083L)
    public static SubLObject cb_explain_why_not_wff(final SubLObject sentence, final SubLObject mt, SubLObject violations, SubLObject strength, SubLObject direction, SubLObject attempt_to_repair_and_assertP, SubLObject pending_assertions, SubLObject unasserts, SubLObject metas) {
        if (violations == cb_assertion_editor.UNPROVIDED) {
            violations = (SubLObject)cb_assertion_editor.NIL;
        }
        if (strength == cb_assertion_editor.UNPROVIDED) {
            strength = (SubLObject)cb_assertion_editor.NIL;
        }
        if (direction == cb_assertion_editor.UNPROVIDED) {
            direction = (SubLObject)cb_assertion_editor.NIL;
        }
        if (attempt_to_repair_and_assertP == cb_assertion_editor.UNPROVIDED) {
            attempt_to_repair_and_assertP = (SubLObject)cb_assertion_editor.NIL;
        }
        if (pending_assertions == cb_assertion_editor.UNPROVIDED) {
            pending_assertions = (SubLObject)cb_assertion_editor.NIL;
        }
        if (unasserts == cb_assertion_editor.UNPROVIDED) {
            unasserts = (SubLObject)cb_assertion_editor.NIL;
        }
        if (metas == cb_assertion_editor.UNPROVIDED) {
            metas = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != pending_assertions) {
            assert cb_assertion_editor.NIL != stacks.stack_p(pending_assertions) : pending_assertions;
        }
        else {
            pending_assertions = stacks.create_stack();
        }
        final SubLObject explanation_of_why_not_wff = wff.explanation_of_why_not_wff(sentence, mt, (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw40$IO_MODE, (SubLObject)cb_assertion_editor.$kw41$NL, (SubLObject)cb_assertion_editor.$kw42$VIOLATIONS, violations));
        final SubLObject repairs = wff_suggest.non_wffness_repairs(sentence, mt);
        final SubLObject old_pending_assertions_list = stacks.stack_elements(pending_assertions);
        final SubLObject title_var = (SubLObject)cb_assertion_editor.$str43$Sentence_not_Well_Formed;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw37$CB_WFF_CHECK_FORMULA, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str55$Mt___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_utilities.cb_form(mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str56$Sentence___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                            cb_utilities.cb_form(sentence, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str57$Repairs___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            if (cb_assertion_editor.NIL != list_utilities.non_empty_list_p(repairs)) {
                                stacks.stack_push(new_cb_assertion_spec(sentence, mt, strength, direction, unasserts, metas), pending_assertions);
                                SubLObject cdolist_list_var = repairs;
                                SubLObject repair = (SubLObject)cb_assertion_editor.NIL;
                                repair = cdolist_list_var.first();
                                while (cb_assertion_editor.NIL != cdolist_list_var) {
                                    cb_wff_repair_advice(repair, mt, strength, direction, attempt_to_repair_and_assertP, pending_assertions);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    repair = cdolist_list_var.first();
                                }
                            }
                            else {
                                html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_assertion_editor.$str58$No_repairs_available___Could_not_);
                                html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                            }
                            html_macros.verify_not_within_html_pre();
                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$6 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_assertion_editor.$str59$Explanation__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str60$wff_explain);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_utilities.html_princ_doc_string(explanation_of_why_not_wff, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                            if (cb_assertion_editor.NIL != list_utilities.non_empty_list_p(old_pending_assertions_list)) {
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_assertion_editor.$str61$Stack_of_pending_assertions_depen);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                SubLObject cdolist_list_var = Sequences.reverse(old_pending_assertions_list);
                                SubLObject assertion_spec = (SubLObject)cb_assertion_editor.NIL;
                                assertion_spec = cdolist_list_var.first();
                                while (cb_assertion_editor.NIL != cdolist_list_var) {
                                    final SubLObject pending_sentence = assertion_spec_sentence(assertion_spec);
                                    final SubLObject pending_mt = assertion_spec_mt(assertion_spec);
                                    cb_utilities.cb_form(pending_sentence, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str62$__in_);
                                    cb_utilities.cb_form(pending_mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    assertion_spec = cdolist_list_var.first();
                                }
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 8809L)
    public static SubLObject cb_wff_repair_advice(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        SubLObject existing_assertions = (SubLObject)cb_assertion_editor.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_assertion_editor.$sym63$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_assertion_editor.$const64$EverythingPSC, thread);
            existing_assertions = czer_meta.find_assertions_cycl(repair_sentence, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        existing_assertions = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym65$ASSERTED_ASSERTION_), existing_assertions, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != list_utilities.empty_list_p(existing_assertions)) {
            cb_wff_repair_advise_assertion_creation(repair_sentence, mt, strength, direction, attempt_to_repair_and_assertP, pending_assertions);
        }
        else {
            cb_wff_repair_advise_assertion_creation_or_lift(repair_sentence, mt, strength, direction, existing_assertions, attempt_to_repair_and_assertP, pending_assertions);
        }
        html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 9571L)
    public static SubLObject cb_wff_repair_advise_assertion_creation(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str66$The_fact_);
        cb_utilities.cb_form(repair_sentence, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str67$_must_be_added_to_);
        cb_utilities.cb_form(mt, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.NIL);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str68$_in_order_for_the_above_sentence_);
        if (cb_assertion_editor.NIL != attempt_to_repair_and_assertP) {
            final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
            cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 10159L)
    public static SubLObject cb_wff_repair_advise_assertion_creation_or_lift(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject existing_assertions, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        final SubLObject existing_assertions_in_spec_mts = assertions_in_spec_mts_among(mt, existing_assertions);
        if (cb_assertion_editor.NIL != list_utilities.empty_list_p(existing_assertions_in_spec_mts)) {
            cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt(repair_sentence, mt, strength, direction, existing_assertions, attempt_to_repair_and_assertP, pending_assertions);
        }
        else {
            cb_wff_repair_advise_assertion_lift_from_spec_mt(repair_sentence, mt, strength, direction, existing_assertions_in_spec_mts, attempt_to_repair_and_assertP, pending_assertions);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 10954L)
    public static SubLObject assertions_in_spec_mts_among(final SubLObject mt, final SubLObject assertions) {
        SubLObject result = (SubLObject)cb_assertion_editor.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)cb_assertion_editor.NIL;
        assertion = cdolist_list_var.first();
        while (cb_assertion_editor.NIL != cdolist_list_var) {
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            if (cb_assertion_editor.NIL != genl_mts.genl_mtP(assertion_mt, mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED)) {
                result = (SubLObject)ConsesLow.cons(assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 11342L)
    public static SubLObject cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject existing_assertions, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        final SubLObject existing_assertions_mts = Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym70$ASSERTION_MT), existing_assertions);
        final SubLObject min_ceiling_mts = genl_mts.min_ceiling_mts((SubLObject)ConsesLow.cons(mt, existing_assertions_mts), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject min_ceiling_mt = (SubLObject)((cb_assertion_editor.NIL != min_ceiling_mts) ? number_utilities.minimum(min_ceiling_mts, Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym71$GENERALITY_ESTIMATE)) : cb_assertion_editor.NIL);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str66$The_fact_);
        cb_utilities.cb_form(repair_sentence, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str67$_must_be_added_to_);
        cb_utilities.cb_form(mt, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.NIL);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str68$_in_order_for_the_above_sentence_);
        html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str72$That_fact_is_already_asserted_in_);
        cb_utilities.cb_form_item_list(existing_assertions_mts);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str73$_);
        html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != min_ceiling_mt) {
            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str74$You_can_repair_this_by_doing_eith);
            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str75$1__Lifting_the_assertion_to_);
            cb_utilities.cb_form(min_ceiling_mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != attempt_to_repair_and_assertP) {
                final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, min_ceiling_mt, strength, direction, existing_assertions, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str76$2__Asserting_it_in_);
            cb_utilities.cb_form(mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str77$_as_well);
            if (cb_assertion_editor.NIL != attempt_to_repair_and_assertP) {
                final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        else {
            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str78$You_can_repair_this_by_doing_the_);
            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str79$Asserting_it_in_);
            cb_utilities.cb_form(mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != attempt_to_repair_and_assertP) {
                final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 13506L)
    public static SubLObject cb_wff_repair_advise_assertion_lift_from_spec_mt(final SubLObject repair_sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction, final SubLObject existing_assertions_in_spec_mts, final SubLObject attempt_to_repair_and_assertP, final SubLObject pending_assertions) {
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str66$The_fact_);
        cb_utilities.cb_form(repair_sentence, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str80$_must_be_lifted_to_);
        cb_utilities.cb_form(mt, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.NIL);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str68$_in_order_for_the_above_sentence_);
        html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str81$It_is_currently_asserted_in_the_f);
        SubLObject cdolist_list_var = Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym70$ASSERTION_MT), existing_assertions_in_spec_mts);
        SubLObject spec_mt = (SubLObject)cb_assertion_editor.NIL;
        spec_mt = cdolist_list_var.first();
        while (cb_assertion_editor.NIL != cdolist_list_var) {
            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
            cb_utilities.cb_form(spec_mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            spec_mt = cdolist_list_var.first();
        }
        if (cb_assertion_editor.NIL != attempt_to_repair_and_assertP) {
            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject repair_assertion_spec = new_cb_assertion_spec(repair_sentence, mt, strength, direction, existing_assertions_in_spec_mts, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw69$REPAIR_AND_REATTEMPT, repair_assertion_spec, pending_assertions, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 14395L)
    public static SubLObject cb_link_repair_and_reattempt(final SubLObject repair_assertion_spec, final SubLObject assertion_stack, SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str82$_Make_this_repair_and_then_reatte;
        }
        final SubLObject repair_assertion_spec_id = cb_parameters.cb_glob_id(repair_assertion_spec);
        final SubLObject assertion_stack_id = cb_parameters.cb_glob_id(assertion_stack);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str84$cb_repair_and_reattempt__A__A, repair_assertion_spec_id, assertion_stack_id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion_stack;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 14888L)
    public static SubLObject cb_repair_and_reattempt(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        SubLObject repair_assertion_spec_id = (SubLObject)cb_assertion_editor.NIL;
        SubLObject assertion_stack_id = (SubLObject)cb_assertion_editor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list87);
        repair_assertion_spec_id = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_assertion_editor.$list87);
        assertion_stack_id = current.first();
        current = current.rest();
        if (cb_assertion_editor.NIL == current) {
            final SubLObject repair_assertion_spec = cb_parameters.cb_glob_lookup_by_string(repair_assertion_spec_id);
            final SubLObject assertion_stack = cb_parameters.cb_glob_lookup_by_string(assertion_stack_id);
            SubLObject found_non_wffP = (SubLObject)cb_assertion_editor.NIL;
            stacks.stack_push(repair_assertion_spec, assertion_stack);
            while (cb_assertion_editor.NIL == stacks.stack_empty_p(assertion_stack) && cb_assertion_editor.NIL == found_non_wffP) {
                final SubLObject assertion_spec = stacks.stack_pop(assertion_stack);
                final SubLObject sentence = assertion_spec_sentence(assertion_spec);
                final SubLObject mt = assertion_spec_mt(assertion_spec);
                final SubLObject strength = assertion_spec_strength(assertion_spec);
                final SubLObject direction = assertion_spec_direction(assertion_spec);
                final SubLObject unasserts = assertion_spec_unasserts(assertion_spec);
                final SubLObject metas = assertion_spec_metas(assertion_spec);
                final SubLObject wff_violations = wff.why_not_wff_assert(sentence, mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
                if (cb_assertion_editor.NIL != wff_violations) {
                    cb_explain_why_not_wff(sentence, mt, wff_violations, strength, direction, (SubLObject)cb_assertion_editor.T, assertion_stack, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    found_non_wffP = (SubLObject)cb_assertion_editor.T;
                }
                else {
                    ke.ke_assert_now(sentence, mt, strength, direction);
                    cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
                    SubLObject cdolist_list_var = unasserts;
                    SubLObject unassert = (SubLObject)cb_assertion_editor.NIL;
                    unassert = cdolist_list_var.first();
                    while (cb_assertion_editor.NIL != cdolist_list_var) {
                        ke.ke_unassert_assertion(unassert);
                        cdolist_list_var = cdolist_list_var.rest();
                        unassert = cdolist_list_var.first();
                    }
                    cdolist_list_var = metas;
                    SubLObject meta = (SubLObject)cb_assertion_editor.NIL;
                    meta = cdolist_list_var.first();
                    while (cb_assertion_editor.NIL != cdolist_list_var) {
                        ke_assert_assertion_spec(meta);
                        cdolist_list_var = cdolist_list_var.rest();
                        meta = cdolist_list_var.first();
                    }
                }
            }
            if (cb_assertion_editor.NIL == found_non_wffP) {
                cb_utilities.cb_message_page_with_history((SubLObject)cb_assertion_editor.$str88$Repair_and_assert_operations_comp, (SubLObject)cb_assertion_editor.T);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list87);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 16536L)
    public static SubLObject cb_assertion_toolbar(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject modification_permittedP = assertion_modification_permittedP(assertion);
            final SubLObject forwardP = assertions_high.forward_assertionP(assertion);
            final SubLObject ruleP = assertions_high.rule_assertionP(assertion);
            final SubLObject assertedP = assertions_high.asserted_assertionP(assertion);
            final SubLObject deducedP = assertions_high.deduced_assertionP(assertion);
            final SubLObject non_modifiable_via_fiP = (SubLObject)SubLObjectFactory.makeBoolean(cb_assertion_editor.NIL == modification_permittedP);
            final SubLObject has_meta_assertionsP = assertion_utilities.assertion_has_meta_assertionsP(assertion);
            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw91$CB_AF, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL == cb_parameters.$cb_a_show_english$.getDynamicValue(thread)) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw93$SHOW_ENGLISH, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL == cb_parameters.$cb_a_show_el_formula$.getDynamicValue(thread)) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw94$SHOW_EL_FORMULA, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw95$WFF_ASSERTION, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw96$FIND_SIMILAR_ASSERTION, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread) && cb_assertion_editor.NIL != assertedP) {
                html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw97$CHANGE_MT, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw98$CHANGE_STRENGTH, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw99$CHANGE_DIRECTION, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                if (cb_assertion_editor.NIL != has_meta_assertionsP) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw100$CHANGE_META_ASSERTION_MT, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                if (cb_assertion_editor.NIL != assertions_high.assertion_el_variables(assertion)) {
                    if (cb_assertion_editor.NIL != assertion_utilities.rule_has_unlabelled_dont_care_variableP(assertion)) {
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw101$RENAME_VARIABLES, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    else {
                        cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw101$RENAME_VARIABLES, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
            }
            if (cb_assertion_editor.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread)) {
                html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw102$ASSERT_SIMILAR, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw103$ASSERT_META, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                if (cb_assertion_editor.NIL != assertions_high.rule_assertionP(assertion) && cb_assertion_editor.NIL != pragma_induction.some_suggested_pragma_sentences_for_ruleP(assertion)) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw104$SUGGEST_PRAGMAS, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                if (cb_assertion_editor.NIL != assertedP && cb_assertion_editor.NIL != cb_fix_typo_assertionP(assertion)) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw105$FIX_TYPO, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                if (cb_assertion_editor.NIL != assertedP) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw106$EDIT_ASSERTION, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw107$REASSERT, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                if (cb_assertion_editor.NIL != assertedP) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw108$UNASSERT, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                if (cb_assertion_editor.NIL != assertions_high.assertion_arguments(assertion)) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw109$BLAST, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                if (cb_assertion_editor.NIL != assertions_high.deduced_assertionP(assertion)) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw110$ASSERTION_PROOF_VIEW, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                }
            }
            if (cb_assertion_editor.NIL != assertions_high.rule_assertionP(assertion)) {
                final SubLObject rule_cnf = assertions_high.assertion_cnf(assertion);
                html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                if (cb_assertion_editor.NIL != clauses.neg_lits(rule_cnf)) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw111$ANTECEDENT_QUERY, assertion, (SubLObject)cb_assertion_editor.$str112$_Query_Antecedent_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                if (cb_assertion_editor.NIL != clauses.pos_lits(rule_cnf)) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw113$RULE_KNOWN_EXTENT_QUERY, assertion, (SubLObject)cb_assertion_editor.$str114$_Known_Extent_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                if (cb_assertion_editor.NIL != clauses.pos_lits(rule_cnf)) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw115$RULE_UNKNOWN_EXTENT_QUERY, assertion, (SubLObject)cb_assertion_editor.$str116$_Unknown_Extent_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                if (cb_assertion_editor.NIL != clauses.neg_lits(rule_cnf)) {
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw117$TRIGGER_TEST, (SubLObject)cb_assertion_editor.NIL, assertion, (SubLObject)cb_assertion_editor.$str118$_Trigger_Test_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw119$ASSERTION_SIMILAR_QUERY, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != deducedP) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw120$ASSERT_TMS, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != deducedP) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw121$JUSTIFY, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != assertions_high.assertion_has_dependents_p(assertion)) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw122$ASSERTION_DEPENDENCIES, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread) && cb_assertion_editor.NIL != assertedP) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw123$RECANONICALIZE, assertion, (SubLObject)cb_assertion_editor.NIL, non_modifiable_via_fiP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != assertions_high.gaf_assertionP(assertion)) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw117$TRIGGER_TEST, assertion, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$str118$_Trigger_Test_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread) && cb_assertion_editor.NIL != forwardP) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw124$REPROPAGATE, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread) && cb_assertion_editor.NIL != forwardP) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw125$REPROPAGATE_BROWSABLY, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != assertions_high.gaf_assertionP(assertion) && cb_assertion_editor.NIL != pph_templates.assertion_has_phrase_naut_argP(assertion)) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw126$TEST_GEN_TEMPLATE, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL == assertions_high.rule_assertionP(assertion)) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw119$ASSERTION_SIMILAR_QUERY, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != ruleP) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw127$USE_IN_PROOF, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != shop_main.shop_planning_assertionP(assertion)) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw128$USE_IN_PLAN_CHECKING, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            if (cb_assertion_editor.NIL != assertions_high.rule_assertionP(assertion)) {
                cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw129$REINFORCE_RULE, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 22790L)
    public static SubLObject assertion_modification_permittedP(final SubLObject assertion) {
        if (cb_assertion_editor.NIL != assertions_high.code_assertionP(assertion)) {
            return (SubLObject)cb_assertion_editor.NIL;
        }
        if (cb_assertion_editor.NIL == assertions_high.gaf_assertionP(assertion)) {
            return (SubLObject)cb_assertion_editor.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_assertion_editor.NIL == isa.isaP(assertions_high.gaf_predicate(assertion), cb_assertion_editor.$const130$InferenceRelatedBookkeepingPredic, mt_vars.$inference_related_bookkeeping_predicate_mt$.getGlobalValue(), (SubLObject)cb_assertion_editor.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 23198L)
    public static SubLObject cb_disabled_link(final SubLObject linktext) {
        html_utilities.html_princ(linktext);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 23445L)
    public static SubLObject cb_change_mt(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str133$the_Change_Assertion_Mt_page);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject title_var = (SubLObject)cb_assertion_editor.$str135$Change_Assertion_Mt;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw48$SAM_AUTOCOMPLETE_CSS);
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (cb_assertion_editor.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.NIL);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str136$post);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                if (cb_assertion_editor.NIL != frame_name_var) {
                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(frame_name_var);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str137$cb_handle_change_mt, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str138$id, id, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw131$CB_CHANGE_MT, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    if (cb_assertion_editor.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                                        final SubLObject color_val = (SubLObject)cb_assertion_editor.$kw139$RED;
                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (cb_assertion_editor.NIL != color_val) {
                                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(color_val));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str140$Note___This_assertion_has_meta_as);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    }
                                    cb_form_widgets.cb_mt_input_section(mt, (SubLObject)cb_assertion_editor.$list141);
                                    cb_utilities.cb_back_button((SubLObject)cb_assertion_editor.$kw83$SELF, (SubLObject)cb_assertion_editor.$str142$Abort_Edit);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_reset_input((SubLObject)cb_assertion_editor.$str143$Current_Value);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_submit_input((SubLObject)cb_assertion_editor.$str144$Change_Mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_change_all_meta_assertions_mt_check(assertion);
                                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str56$Sentence___);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_utilities.cb_form_assertion_edit_formula(assertion, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
                                    cb_tabulate_checkable_meta_assertions(assertion, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 24597L)
    public static SubLObject cb_change_all_meta_assertions_mt_check(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
            final SubLObject all_meta_assertions = assertion_utilities.all_meta_assertions(assertion);
            SubLObject assertion_mt = (SubLObject)cb_assertion_editor.NIL;
            SubLObject meta_assertion_mt = (SubLObject)cb_assertion_editor.NIL;
            assertion_mt = assertions_high.assertion_mt(assertion);
            SubLObject cdolist_list_var = all_meta_assertions;
            SubLObject meta_assertion = (SubLObject)cb_assertion_editor.NIL;
            meta_assertion = cdolist_list_var.first();
            while (cb_assertion_editor.NIL != cdolist_list_var) {
                meta_assertion_mt = assertions_high.assertion_mt(meta_assertion);
                if (!assertion_mt.eql(meta_assertion_mt)) {
                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str146$To_change_Mt_of_all_meta_assertio);
                    cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw100$CHANGE_META_ASSERTION_MT, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    return (SubLObject)cb_assertion_editor.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                meta_assertion = cdolist_list_var.first();
            }
            html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_checkbox_input((SubLObject)cb_assertion_editor.$str147$move_all_meta_assertions, (SubLObject)cb_assertion_editor.$str148$t, cb_parameters.$cb_a_change_all_meta_assertions_mt_by_defaultP$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str149$Change_the_Mt_of_all_meta_asserti);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 25468L)
    public static SubLObject cb_handle_change_mt(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str150$change_microtheory);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str138$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        thread.resetMultipleValues();
        final SubLObject new_mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        if (cb_assertion_editor.NIL != hlmt.hlmt_equalP(new_mt, assertions_high.assertion_mt(assertion))) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str151$Assertion_is_already_in__S, new_mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        final SubLObject change_meta_assertion_mtP = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str147$move_all_meta_assertions, args);
        final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, (SubLObject)cb_assertion_editor.$str152$preserve_, (SubLObject)((cb_assertion_editor.NIL != change_meta_assertion_mtP) ? new_mt : cb_assertion_editor.NIL));
        cb_change_mt_hook(assertion, new_mt, meta_assertions_to_preserve);
        cb_note_edit_change((SubLObject)cb_assertion_editor.$str135$Change_Assertion_Mt, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.THREE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 26339L)
    public static SubLObject cb_link_change_mt(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str154$_Change_Mt_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str155$cb_change_mt__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 26777L)
    public static SubLObject cb_change_strength(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str159$the_Change_Assertion_Strength_pag);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                final SubLObject strength = assertions_high.assertion_strength(assertion);
                final SubLObject title_var = (SubLObject)cb_assertion_editor.$str160$Change_Assertion_Strength;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (cb_assertion_editor.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.NIL);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str136$post);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                if (cb_assertion_editor.NIL != frame_name_var) {
                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(frame_name_var);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str161$cb_handle_change_strength, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str138$id, id, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw157$CB_CHANGE_STRENGTH, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str162$Choose_a_new_truth_strength__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_radio_input((SubLObject)cb_assertion_editor.$str163$strength, (SubLObject)cb_assertion_editor.$str164$_default, Equality.eq(strength, (SubLObject)cb_assertion_editor.$kw165$DEFAULT), (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str166$Default);
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_radio_input((SubLObject)cb_assertion_editor.$str163$strength, (SubLObject)cb_assertion_editor.$str167$_monotonic, Equality.eq(strength, (SubLObject)cb_assertion_editor.$kw168$MONOTONIC), (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str169$Monotonic);
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    cb_utilities.cb_back_button((SubLObject)cb_assertion_editor.$kw83$SELF, (SubLObject)cb_assertion_editor.$str142$Abort_Edit);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                                    html_utilities.html_reset_input((SubLObject)cb_assertion_editor.$str143$Current_Value);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                                    html_utilities.html_submit_input((SubLObject)cb_assertion_editor.$str170$Change_Strength, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str55$Mt___);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    cb_utilities.cb_form(assertions_high.assertion_mt(assertion), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str56$Sentence___);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_utilities.cb_form_assertion_edit_formula(assertion, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 28119L)
    public static SubLObject cb_handle_change_strength(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str172$change_strength);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str138$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        final SubLObject new_strength = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str163$strength, args), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != subl_promotions.memberP(new_strength, (SubLObject)cb_assertion_editor.$list173, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED)) {
            if (!new_strength.equal(assertions_high.assertion_strength(assertion))) {
                cb_change_strength_hook(assertion, new_strength);
            }
            cb_note_edit_change((SubLObject)cb_assertion_editor.$str160$Change_Assertion_Strength, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        else {
            cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str174$_a_was_not_a_microtheory, conses_high.second(args), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 28738L)
    public static SubLObject cb_link_change_strength(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str176$_Change_Strength_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str177$cb_change_strength__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 29199L)
    public static SubLObject cb_change_direction(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str181$the_Change_Assertion_Direction_pa);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                final SubLObject title_var = (SubLObject)cb_assertion_editor.$str182$Change_Assertion_Direction;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (cb_assertion_editor.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.NIL);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str136$post);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                if (cb_assertion_editor.NIL != frame_name_var) {
                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(frame_name_var);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str183$cb_handle_change_direction, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str138$id, id, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw179$CB_CHANGE_DIRECTION, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str184$Choose_a_direction__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_radio_input((SubLObject)cb_assertion_editor.$str185$direction, (SubLObject)cb_assertion_editor.$str186$_backward, Equality.eq(direction, (SubLObject)cb_assertion_editor.$kw187$BACKWARD), (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str188$Backward);
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_radio_input((SubLObject)cb_assertion_editor.$str185$direction, (SubLObject)cb_assertion_editor.$str189$_forward, Equality.eq(direction, (SubLObject)cb_assertion_editor.$kw190$FORWARD), (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str191$Forward);
                                    if (cb_assertion_editor.NIL != assertions_high.rule_assertionP(assertion)) {
                                        final SubLObject rule_cnf = assertions_high.assertion_cnf(assertion);
                                        if (cb_assertion_editor.NIL != clauses.neg_lits(rule_cnf)) {
                                            html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                            cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw111$ANTECEDENT_QUERY, assertion, (SubLObject)cb_assertion_editor.$str112$_Query_Antecedent_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        }
                                    }
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    cb_utilities.cb_back_button((SubLObject)cb_assertion_editor.$kw83$SELF, (SubLObject)cb_assertion_editor.$str142$Abort_Edit);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                                    html_utilities.html_reset_input((SubLObject)cb_assertion_editor.$str143$Current_Value);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                                    html_utilities.html_submit_input((SubLObject)cb_assertion_editor.$str192$Change_Direction, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str55$Mt___);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    cb_utilities.cb_form(assertions_high.assertion_mt(assertion), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str56$Sentence___);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_utilities.cb_form_assertion_edit_formula(assertion, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$19, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 31155L)
    public static SubLObject cb_handle_change_direction(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str194$direction_changes);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str138$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        final SubLObject new_direction = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str185$direction, args), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject shoehornP = html_utilities.html_extract_boolean((SubLObject)cb_assertion_editor.$str195$shoehorn_, args, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject direction = assertions_high.assertion_direction(assertion);
        if (cb_assertion_editor.NIL == enumeration_types.direction_p(new_direction)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str196$_a_does_not_specify_a_valid_direc, conses_high.second(args), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        else if (!new_direction.eql(direction)) {
            if (new_direction == cb_assertion_editor.$kw190$FORWARD && cb_assertion_editor.NIL != assertions_high.rule_assertionP(assertion) && cb_assertion_editor.NIL != shoehornP) {
                ke.ke_shoehorn_rule_forward(assertion);
                ke.ke_assert((SubLObject)ConsesLow.list(cb_assertion_editor.$const197$cyclistNotes, assertion, Sequences.cconcatenate((SubLObject)cb_assertion_editor.$str198$This_rule_was_shoehorned_forward_, new SubLObject[] { format_nil.format_nil_a_no_copy(numeric_date_utilities.timestring((SubLObject)cb_assertion_editor.UNPROVIDED)), cb_assertion_editor.$str199$_by_, format_nil.format_nil_a_no_copy(operation_communication.the_cyclist()), cb_assertion_editor.$str73$_ })), assertions_high.assertion_mt(assertion), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                cb_note_edit_change((SubLObject)cb_assertion_editor.$str182$Change_Assertion_Direction, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                cb_change_direction_hook(assertion, new_direction);
                cb_note_edit_change((SubLObject)cb_assertion_editor.$str182$Change_Assertion_Direction, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 32251L)
    public static SubLObject cb_link_change_direction(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str201$_Change_Direction_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str202$cb_change_direction__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 32756L)
    public static SubLObject cb_change_meta_assertion_mt(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str133$the_Change_Assertion_Mt_page);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject title_var = (SubLObject)cb_assertion_editor.$str206$Change_Meta_Assertions_Mt;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw48$SAM_AUTOCOMPLETE_CSS);
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$25 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (cb_assertion_editor.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.NIL);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str136$post);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                if (cb_assertion_editor.NIL != frame_name_var) {
                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(frame_name_var);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str207$cb_handle_change_meta_assertion_m, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str138$id, id, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw204$CB_CHANGE_META_ASSERTION_MT, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str208$Change_the_Mt_of_Meta_Assertions_);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.T);
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_form_widgets.cb_mt_input_section(mt, (SubLObject)cb_assertion_editor.$list141);
                                    cb_utilities.cb_back_button((SubLObject)cb_assertion_editor.$kw83$SELF, (SubLObject)cb_assertion_editor.$str142$Abort_Edit);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_reset_input((SubLObject)cb_assertion_editor.$str143$Current_Value);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_submit_input((SubLObject)cb_assertion_editor.$str144$Change_Mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cb_tabulate_checkable_meta_assertions(assertion, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.$str209$change_meta_, (SubLObject)cb_assertion_editor.$str210$Choose_the_meta_assertions__, (SubLObject)cb_assertion_editor.T);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$25, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 33854L)
    public static SubLObject cb_handle_change_meta_assertion_mt(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str150$change_microtheory);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str138$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        thread.resetMultipleValues();
        final SubLObject new_mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, (SubLObject)cb_assertion_editor.$str209$change_meta_, (SubLObject)cb_assertion_editor.UNPROVIDED);
        SubLObject operations = (SubLObject)cb_assertion_editor.ZERO_INTEGER;
        SubLObject cdolist_list_var = meta_assertions_to_preserve;
        SubLObject meta_assertion_pair = (SubLObject)cb_assertion_editor.NIL;
        meta_assertion_pair = cdolist_list_var.first();
        while (cb_assertion_editor.NIL != cdolist_list_var) {
            final SubLObject meta_assertion = meta_assertion_pair.first();
            if (cb_assertion_editor.NIL == hlmt.hlmt_equalP(new_mt, assertions_high.assertion_mt(meta_assertion))) {
                cb_change_mt_hook(meta_assertion, new_mt, (SubLObject)cb_assertion_editor.NIL);
                operations = Numbers.add(operations, (SubLObject)cb_assertion_editor.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_assertion_pair = cdolist_list_var.first();
        }
        cb_note_edit_change((SubLObject)cb_assertion_editor.$str206$Change_Meta_Assertions_Mt, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.THREE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 34716L)
    public static SubLObject cb_link_change_meta_assertion_mt(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str213$_Change_Meta_Assertions_Mt_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str214$cb_change_meta_assertion_mt__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 35227L)
    public static SubLObject cb_rename_variables(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str218$the_facility_to_rename_variables);
        }
        SubLObject id = (SubLObject)cb_assertion_editor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
        id = args.first();
        final SubLObject current = args.rest();
        if (cb_assertion_editor.NIL == current) {
            final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
            final SubLObject assertion_el_variables = assertions_high.assertion_el_variables(assertion);
            final SubLObject mal_variables = wff_utilities.mal_variables(assertion_el_variables);
            final SubLObject correction_pair_alist = el_utilities.correct_variables(mal_variables);
            SubLObject corrected_variable = (SubLObject)cb_assertion_editor.NIL;
            final SubLObject title_var = (SubLObject)cb_assertion_editor.$str219$Rename_Assertion_Variables;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_assertion_editor.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw48$SAM_AUTOCOMPLETE_CSS);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_assertion_editor.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str136$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str220$cb_handle_rename_variables, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str138$id, id, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw216$CB_RENAME_VARIABLES, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_assertion_editor.$str221$Rename_the_variables_of_the_asser);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.T);
                                html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                if (cb_assertion_editor.NIL != mal_variables) {
                                    html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str222$Note__);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str223$Variables_listed_in_);
                                    final SubLObject color_val = (SubLObject)cb_assertion_editor.$kw139$RED;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_assertion_editor.NIL != color_val) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(color_val));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str224$red);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str225$_have_invalid_variable_names___Va);
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                                    html_utilities.html_princ(cycl_variables.$valid_el_var_regular_expression$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw226$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                            html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str228$Current_Variable);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw226$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                            html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str229$Changed_Variable);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    SubLObject cdolist_list_var = assertion_el_variables;
                                    SubLObject current_variable = (SubLObject)cb_assertion_editor.NIL;
                                    current_variable = cdolist_list_var.first();
                                    while (cb_assertion_editor.NIL != cdolist_list_var) {
                                        corrected_variable = list_utilities.alist_lookup(correction_pair_alist, current_variable, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw226$LEFT));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                                html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                                if (cb_assertion_editor.NIL != subl_promotions.memberP(current_variable, mal_variables, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED)) {
                                                    final SubLObject color_val2 = (SubLObject)cb_assertion_editor.$kw139$RED;
                                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                    if (cb_assertion_editor.NIL != color_val2) {
                                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                        html_utilities.html_markup(html_utilities.html_color(color_val2));
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                    }
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                                        html_utilities.html_princ_strong(current_variable);
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                }
                                                else {
                                                    html_utilities.html_princ(current_variable);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw226$LEFT));
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                                    html_utilities.html_text_input(current_variable, (cb_assertion_editor.NIL != corrected_variable) ? corrected_variable : current_variable, cb_parameters.$cb_constant_input_width$.getDynamicValue(thread));
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        current_variable = cdolist_list_var.first();
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                html_utilities.html_submit_input((SubLObject)cb_assertion_editor.$str230$Rename_Variables, (SubLObject)cb_assertion_editor.$str231$rename, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$29, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 37503L)
    public static SubLObject cb_handle_rename_variables(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str138$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        SubLObject rename_alist = (SubLObject)cb_assertion_editor.NIL;
        SubLObject invalid_rename_list = (SubLObject)cb_assertion_editor.NIL;
        thread.resetMultipleValues();
        final SubLObject rename_alist_$43 = cb_extract_variables_from_args(args);
        final SubLObject invalid_rename_list_$44 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        rename_alist = rename_alist_$43;
        invalid_rename_list = invalid_rename_list_$44;
        if (cb_assertion_editor.NIL != invalid_rename_list) {
            return cb_show_invalid_variables_message(invalid_rename_list);
        }
        if (cb_assertion_editor.NIL == rename_alist) {
            return cb_utilities.cb_simple_message_page((SubLObject)cb_assertion_editor.$str233$No_variables_were_specified_to_be, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.$int34$2000);
        }
        if (cb_assertion_editor.NIL != html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str231$rename, args)) {
            if (cb_assertion_editor.NIL != el_utilities.simple_variable_rename_impossibleP(assertion, rename_alist)) {
                final SubLObject title_var = (SubLObject)cb_assertion_editor.$str219$Rename_Assertion_Variables;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$45 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$46 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (cb_assertion_editor.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.NIL);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str136$post);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                if (cb_assertion_editor.NIL != frame_name_var) {
                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(frame_name_var);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str220$cb_handle_rename_variables, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str138$id, id, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    SubLObject cdolist_list_var = rename_alist;
                                    SubLObject cons = (SubLObject)cb_assertion_editor.NIL;
                                    cons = cdolist_list_var.first();
                                    while (cb_assertion_editor.NIL != cdolist_list_var) {
                                        SubLObject current;
                                        final SubLObject datum = current = cons;
                                        SubLObject variable = (SubLObject)cb_assertion_editor.NIL;
                                        SubLObject renamed_variable = (SubLObject)cb_assertion_editor.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list234);
                                        variable = current.first();
                                        current = (renamed_variable = current.rest());
                                        html_utilities.html_hidden_input(variable, renamed_variable, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        cons = cdolist_list_var.first();
                                    }
                                    html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str235$The_proposed_rename_may_change_th);
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_submit_input((SubLObject)cb_assertion_editor.$str236$Yes, (SubLObject)cb_assertion_editor.$str237$continue, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    cb_utilities.cb_back_button((SubLObject)cb_assertion_editor.$kw83$SELF, (SubLObject)cb_assertion_editor.$str238$No);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$46, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$45, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cb_rename_variables_hook(assertion, rename_alist);
                cb_note_edit_change((SubLObject)cb_assertion_editor.$str230$Rename_Variables, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        else if (cb_assertion_editor.NIL != html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str237$continue, args)) {
            SubLObject new_formula = conses_high.copy_tree(uncanonicalizer.assertion_el_formula(assertion));
            new_formula = conses_high.sublis(rename_alist, new_formula, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_assert_internal((SubLObject)cb_assertion_editor.$kw239$EDIT, assertion, new_formula, (SubLObject)cb_assertion_editor.T);
            cb_note_edit_change((SubLObject)cb_assertion_editor.$str230$Rename_Variables, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 39189L)
    public static SubLObject cb_extract_variables_from_args(final SubLObject args) {
        SubLObject rename_alist = (SubLObject)cb_assertion_editor.NIL;
        SubLObject invalid_rename_list = (SubLObject)cb_assertion_editor.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)cb_assertion_editor.NIL;
        arg = cdolist_list_var.first();
        while (cb_assertion_editor.NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current;
                final SubLObject datum = current = arg;
                SubLObject variable_name = (SubLObject)cb_assertion_editor.NIL;
                SubLObject new_variable_name = (SubLObject)cb_assertion_editor.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list241);
                variable_name = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list241);
                new_variable_name = current.first();
                current = current.rest();
                if (cb_assertion_editor.NIL == current) {
                    new_variable_name = Strings.string_trim((SubLObject)cb_assertion_editor.$list242, new_variable_name);
                    if (cb_assertion_editor.NIL != string_utilities.starts_with(variable_name, (SubLObject)cb_assertion_editor.$str243$_) && cb_assertion_editor.NIL == Strings.string_equal(new_variable_name, (SubLObject)cb_assertion_editor.$str244$, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED) && cb_assertion_editor.NIL != Strings.string_not_equal(variable_name, new_variable_name, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED)) {
                        if (cb_assertion_editor.NIL != cycl_variables.valid_el_var_nameP(new_variable_name)) {
                            rename_alist = list_utilities.alist_enter(rename_alist, cycl_variables.make_el_var(variable_name), cycl_variables.make_el_var(new_variable_name), (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        else {
                            invalid_rename_list = (SubLObject)ConsesLow.cons(new_variable_name, invalid_rename_list);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_assertion_editor.$list241);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Values.values(rename_alist, invalid_rename_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 40143L)
    public static SubLObject cb_show_invalid_variables_message(final SubLObject invalid_variables_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_assertion_editor.$str245$Invalid_Variables;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$50 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$51 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_back_button((SubLObject)cb_assertion_editor.$kw83$SELF, (SubLObject)cb_assertion_editor.$str246$Back);
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str247$The_following_variables_have_inva);
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_princ(string_utilities.stringify_items(invalid_variables_list, Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym248$STR), (SubLObject)cb_assertion_editor.$str249$__, (SubLObject)cb_assertion_editor.$str250$__and_));
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str251$Valid_variables_must_satisfy_the_);
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                            html_utilities.html_princ(cycl_variables.$valid_el_var_regular_expression$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$51, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$50, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 40771L)
    public static SubLObject cb_link_rename_variables(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str252$_Rename_Variables_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str253$cb_rename_variables__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 41104L)
    public static SubLObject cb_repropagate(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str255$the_facility_to_repropagate_forwa);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                if (direction == cb_assertion_editor.$kw190$FORWARD) {
                    cb_repropagate_hook(assertion);
                    cb_note_edit_change((SubLObject)cb_assertion_editor.$str256$Forward_Assertion_Repropagation, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.ONE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                else {
                    cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, args.first(), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 41664L)
    public static SubLObject cb_link_repropagate(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str259$_Repropagate_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str260$cb_repropagate__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 41989L)
    public static SubLObject cb_repropagate_browsably(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str262$the_facility_to_repropagate_and_b);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                final SubLObject direction = assertions_high.assertion_direction(assertion);
                if (direction == cb_assertion_editor.$kw190$FORWARD) {
                    cb_repropagate_browsably_hook(assertion);
                    cb_forward_inference_browser.cb_forward_inference_browser((SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str263$Forward_repropagation_complete___));
                }
                else {
                    cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, args.first(), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 41989L)
    public static SubLObject cb_link_repropagate_browsably(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str265$_Repropagate_and_Browse_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str266$cb_repropagate_browsably__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 43101L)
    public static SubLObject cb_recanonicalize(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str268$the_facility_to_recanonicalize_an);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                    return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str269$_S_did_not_specify_an_assertion_, args.first(), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                if (cb_assertion_editor.NIL == czer_main.canonicalizer_problemP(assertion)) {
                    return cb_utilities.cb_simple_message_page((SubLObject)cb_assertion_editor.$str270$Assertion_is_already_canonical, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.$int34$2000);
                }
                cb_recanonicalize_hook(assertion, assertion_utilities.meta_assertion_list_for_editing(assertion));
                cb_note_edit_change((SubLObject)cb_assertion_editor.$str271$Recanonicalize_Assertion, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.ONE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 43874L)
    public static SubLObject cb_link_recanonicalize(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str273$_Recanonicalize_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str274$cb_recanonicalize__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 44276L)
    public static SubLObject cb_wff(SubLObject args) {
        if (args == cb_assertion_editor.UNPROVIDED) {
            args = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_assertion_editor.$str278$WFF_Check_Sentence;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$55 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw48$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str136$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        if (cb_assertion_editor.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str279$cb_handle_wff, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw276$CB_WFF, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_assertion_editor.$str280$Clear);
                            html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_assertion_editor.$str278$WFF_Check_Sentence, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            cb_form_widgets.cb_mt_input_section(cb_assertion_editor.$const281$UniversalVocabularyMt, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section((SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$list282);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$56, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$55, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 44895L)
    public static SubLObject cb_link_wff(SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str284$WFF_Check;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw285$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str286$cb_wff);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 45175L)
    public static SubLObject cb_handle_wff(final SubLObject args) {
        return cb_wff_check_formula(args, (SubLObject)cb_assertion_editor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 45259L)
    public static SubLObject cb_wff_check_formula(final SubLObject args, SubLObject assert_modeP) {
        if (assert_modeP == cb_assertion_editor.UNPROVIDED) {
            assert_modeP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_assertion_editor.$list292);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_string, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        return cb_wff_check_sentence_int(sentence, mt, (SubLObject)cb_assertion_editor.T, assert_modeP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 45857L)
    public static SubLObject cb_wff_check_formula_ok(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_assertion_editor.$str293$Sentence_is_Well_Formed;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$60 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$61 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw37$CB_WFF_CHECK_FORMULA, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str55$Mt___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            cb_utilities.cb_form(mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str56$Sentence___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                            cb_utilities.cb_form(sentence, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str294$WFF_Status___);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str295$OK);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$61, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$60, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 47110L)
    public static SubLObject cb_assert(SubLObject args) {
        if (args == cb_assertion_editor.UNPROVIDED) {
            args = (SubLObject)cb_assertion_editor.NIL;
        }
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        else {
            cb_assert_internal((SubLObject)cb_assertion_editor.$kw165$DEFAULT, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 47304L)
    public static SubLObject cb_handle_assert(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str298$assertions);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        if (cb_assertion_editor.NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str299$wff_check, args))) {
            return cb_wff_check_formula(args, (SubLObject)cb_assertion_editor.T);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject strength = thread.fourthMultipleValue();
        final SubLObject direction = thread.fifthMultipleValue();
        final SubLObject sentence_string = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != error) {
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject wff_violations = wff.why_not_wff_assert(sentence, mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != wff_violations) {
            return cb_attempt_to_repair_and_assert(sentence, mt, strength, direction, args, wff_violations);
        }
        final SubLObject pcase_var;
        final SubLObject queue = pcase_var = reader.read_from_string_ignoring_errors(html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str300$assertion_queue, args), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (pcase_var.eql((SubLObject)cb_assertion_editor.$kw301$BROWSE)) {
            final SubLObject _prev_bind_0 = control_vars.$browse_forward_inferencesP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = forward.$forward_inference_browsing_callback$.currentBinding(thread);
            final SubLObject _prev_bind_3 = forward.$forward_inference_browsing_callback_more_infoP$.currentBinding(thread);
            try {
                control_vars.$browse_forward_inferencesP$.bind((SubLObject)cb_assertion_editor.T, thread);
                forward.$forward_inference_browsing_callback$.bind((SubLObject)cb_assertion_editor.$sym0$CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING, thread);
                forward.$forward_inference_browsing_callback_more_infoP$.bind((SubLObject)cb_assertion_editor.T, thread);
                cb_forward_inference_browser.prepare_to_browse_new_forward_inference(el_utilities.make_ist_sentence(mt, sentence));
                ke.ke_assert_now(sentence, mt, strength, direction);
                cb_forward_inference_browser.cleanup_from_browsing_new_forward_inference();
            }
            finally {
                forward.$forward_inference_browsing_callback_more_infoP$.rebind(_prev_bind_3, thread);
                forward.$forward_inference_browsing_callback$.rebind(_prev_bind_2, thread);
                control_vars.$browse_forward_inferencesP$.rebind(_prev_bind_0, thread);
            }
            cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
            ke.ke_add_assertion_original_text(sentence, mt, sentence_string, (SubLObject)cb_assertion_editor.UNPROVIDED);
            return cb_forward_inference_browser.cb_forward_inference_browser((SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str302$Forward_propagation_complete___Br));
        }
        if (pcase_var.eql((SubLObject)cb_assertion_editor.$kw303$NOW)) {
            ke.ke_assert_now(sentence, mt, strength, direction);
            ke.ke_add_assertion_original_text(sentence, mt, sentence_string, (SubLObject)cb_assertion_editor.T);
        }
        else {
            ke.ke_assert(sentence, mt, strength, direction);
            ke.ke_add_assertion_original_text(sentence, mt, sentence_string, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(sentence, mt);
        return cb_note_edit_change((SubLObject)cb_assertion_editor.$str304$EL_Sentence_Assert, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 49028L)
    public static SubLObject cb_extract_some_assert_arguments(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != mt_error) {
            cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
            return Values.values(mt_error, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_assertion_editor.$list292);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != sentence_error) {
            cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_string, (SubLObject)cb_assertion_editor.UNPROVIDED);
            return Values.values(sentence_error, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL);
        }
        thread.resetMultipleValues();
        final SubLObject strength = cb_extract_strength_and_direction_input(args, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject direction = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values((SubLObject)cb_assertion_editor.NIL, mt, sentence, strength, direction, sentence_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 50117L)
    public static SubLObject cb_link_assert(SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str308$Assert;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw285$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str309$cb_assert);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 50467L)
    public static SubLObject cb_assert_internal(final SubLObject mode, SubLObject assertion, SubLObject sentence, SubLObject use_sentenceP) {
        if (assertion == cb_assertion_editor.UNPROVIDED) {
            assertion = (SubLObject)cb_assertion_editor.NIL;
        }
        if (sentence == cb_assertion_editor.UNPROVIDED) {
            sentence = (SubLObject)cb_assertion_editor.NIL;
        }
        if (use_sentenceP == cb_assertion_editor.UNPROVIDED) {
            use_sentenceP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode_data = conses_high.assoc(mode, cb_assertion_editor.$cb_assert_modes_table$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL == mode_data) {
            cyc_navigator_internals.generic_message_page((SubLObject)cb_assertion_editor.$str315$Fatal_Error, PrintLow.format((SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$str316$cb_assert_called_without_a_valid_));
            return (SubLObject)cb_assertion_editor.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = mode_data;
        SubLObject keyword = (SubLObject)cb_assertion_editor.NIL;
        SubLObject handler = (SubLObject)cb_assertion_editor.NIL;
        SubLObject title = (SubLObject)cb_assertion_editor.NIL;
        SubLObject action_label = (SubLObject)cb_assertion_editor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list317);
        keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list317);
        handler = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list317);
        title = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list317);
        action_label = current.first();
        current = current.rest();
        if (cb_assertion_editor.NIL == current) {
            thread.resetMultipleValues();
            final SubLObject id = cb_extract_values_for_assert(assertion, sentence, use_sentenceP, handler);
            SubLObject formula = thread.secondMultipleValue();
            final SubLObject mt = thread.thirdMultipleValue();
            final SubLObject direction = thread.fourthMultipleValue();
            SubLObject strength = thread.fifthMultipleValue();
            final SubLObject editing = thread.sixthMultipleValue();
            final SubLObject edit_formula_only = thread.seventhMultipleValue();
            final SubLObject asserted_by = thread.eighthMultipleValue();
            thread.resetMultipleValues();
            if (cb_assertion_editor.NIL == strength) {
                strength = (SubLObject)cb_assertion_editor.$kw165$DEFAULT;
            }
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$65 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    html_complete.html_complete_script();
                    dhtml_macros.dhtml_with_toggle_visibility_support();
                    dhtml_macros.html_basic_cb_scripts();
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$66 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ(title);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str136$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input(handler, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                if (cb_assertion_editor.NIL != assertion_handles.assertion_p(assertion)) {
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str138$id, id, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                else if (cb_assertion_editor.NIL != cycl_grammar.cycl_sentence_p(sentence)) {
                                    html_utilities.html_hidden_input((SubLObject)cb_assertion_editor.$str138$id, cb_parameters.cb_glob_id(sentence), (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                if (cb_assertion_editor.$kw318$META == mode) {
                                    if (cb_assertion_editor.NIL == use_sentenceP) {
                                        formula = cb_parameters.$cb_assertion_indexical$.getGlobalValue();
                                    }
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str319$Please_use_);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    cb_utilities.cb_form(cb_parameters.$cb_assertion_indexical$.getGlobalValue(), (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.NIL);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str320$_to_refer_to_the_following_assert);
                                    html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
                                    cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.T);
                                    html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
                                }
                                if (cb_assertion_editor.NIL != assertion_handles.assertion_p(assertion) && (cb_assertion_editor.$kw239$EDIT == mode || cb_assertion_editor.$kw105$FIX_TYPO == mode) && cb_assertion_editor.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
                                    final SubLObject color_val = (SubLObject)cb_assertion_editor.$kw139$RED;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_assertion_editor.NIL != color_val) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(color_val));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str140$Note___This_assertion_has_meta_as);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                }
                                cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw313$CB_ASSERT_INTERNAL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_reset_input((SubLObject)cb_assertion_editor.$str321$Reset_All_Fields);
                                html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                                html_utilities.html_submit_input(action_label, (SubLObject)cb_assertion_editor.$str322$assert, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                                html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                if (mode == cb_assertion_editor.$kw165$DEFAULT || mode == cb_assertion_editor.$kw323$SIMILAR) {
                                    final SubLObject assertion_queue_input_name = (SubLObject)cb_assertion_editor.$str300$assertion_queue;
                                    html_utilities.html_radio_input(assertion_queue_input_name, (SubLObject)cb_assertion_editor.$str324$_local, Equality.eq(cb_parameters.$cb_assert_queue_default$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$kw325$LOCAL), (SubLObject)cb_assertion_editor.$str324$_local);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str326$Assert_using_Local_queue);
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.THREE_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_label_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_label_for$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_assertion_editor.$str327$_browse));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        html_utilities.html_radio_input(assertion_queue_input_name, (SubLObject)cb_assertion_editor.$str327$_browse, Equality.eq(cb_parameters.$cb_assert_queue_default$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$kw301$BROWSE), (SubLObject)cb_assertion_editor.$str327$_browse);
                                        html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                                        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str328$Assert_now_and_browse_forward_inf);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_label_tail$.getGlobalValue());
                                    html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                    html_utilities.html_markup(html_macros.$html_label_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_label_for$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_assertion_editor.$str329$_now));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        html_utilities.html_radio_input(assertion_queue_input_name, (SubLObject)cb_assertion_editor.$str329$_now, Equality.eq(cb_parameters.$cb_assert_queue_default$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$kw303$NOW), (SubLObject)cb_assertion_editor.$str329$_now);
                                        html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                                        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str330$Assert_now__bypassing_Local_queue);
                                        html_utilities.html_indent((SubLObject)cb_assertion_editor.THREE_INTEGER);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_label_tail$.getGlobalValue());
                                    html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                dhtml_macros.dhtml_switch_visibility_links((SubLObject)cb_assertion_editor.$str331$cb_assert_parameters, (SubLObject)cb_assertion_editor.$str332$Show, (SubLObject)cb_assertion_editor.$str333$Hide);
                                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_assertion_editor.$str334$Assert_Context);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject initial_visibility = (SubLObject)cb_assertion_editor.$kw335$INVISIBLE;
                                dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_assertion_editor.$str331$cb_assert_parameters, initial_visibility, (SubLObject)cb_assertion_editor.$kw336$PARAGRAPH);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str331$cb_assert_parameters);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    cb_strength_and_direction_section(strength, direction, (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw337$EDIT_ONLY, edit_formula_only));
                                    final SubLObject display_options = (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw338$EDIT_ALLOWED_, (SubLObject)SubLObjectFactory.makeBoolean(cb_assertion_editor.NIL == edit_formula_only), (SubLObject)cb_assertion_editor.$kw339$MONAD_CHOICES, (SubLObject)cb_assertion_editor.$list340, (SubLObject)cb_assertion_editor.$kw341$ANYTIME_PSC_ALLOWED_, (SubLObject)cb_assertion_editor.NIL);
                                    cb_form_widgets.cb_mt_input_section(mt, display_options);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject choices = cb_assert_sentence_constant_suggestions(mode);
                                final SubLObject display_options2 = (SubLObject)ConsesLow.list(new SubLObject[] { cb_assertion_editor.$kw342$INPUT_NAME, cb_assertion_editor.$str343$sentence, cb_assertion_editor.$kw344$COMPLETE_LABEL, cb_assertion_editor.$str345$Complete, cb_assertion_editor.$kw346$CYCLIFY_LABEL, cb_assertion_editor.$str347$Cyclify, cb_assertion_editor.$kw348$CLEAR_LABEL, cb_assertion_editor.$str349$Clear_Sentence, cb_assertion_editor.$kw350$HEIGHT, cb_assertion_editor.TWENTY_INTEGER, cb_assertion_editor.$kw351$WIDTH, cb_assertion_editor.$int352$80, cb_assertion_editor.$kw353$MODE, cb_assertion_editor.$kw306$ASSERT, cb_assertion_editor.$kw354$CHOICES, choices });
                                cb_form_widgets.cb_el_sentence_input_section(formula, display_options2);
                                if (cb_assertion_editor.NIL != assertion_handles.assertion_p(assertion) && (cb_assertion_editor.$kw239$EDIT == mode || cb_assertion_editor.$kw105$FIX_TYPO == mode)) {
                                    cb_tabulate_checkable_meta_assertions(assertion, (SubLObject)cb_assertion_editor.ONE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                }
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$66, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$65, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_assertion_editor.$list317);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 55582L)
    public static SubLObject cb_assert_sentence_constant_suggestions(final SubLObject mode) {
        if (mode.eql((SubLObject)cb_assertion_editor.$kw318$META)) {
            return (SubLObject)cb_assertion_editor.$list355;
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 55826L)
    public static SubLObject cb_extract_values_for_assert(final SubLObject assertion, final SubLObject sentence, final SubLObject use_sentenceP, final SubLObject handler) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = (SubLObject)cb_assertion_editor.NIL;
        SubLObject formula = (SubLObject)cb_assertion_editor.NIL;
        SubLObject mt = mt_vars.$default_assert_mt$.getGlobalValue();
        SubLObject direction = (SubLObject)cb_assertion_editor.NIL;
        SubLObject strength = (SubLObject)cb_assertion_editor.NIL;
        SubLObject editing = (SubLObject)cb_assertion_editor.NIL;
        SubLObject edit_formula_only = (SubLObject)cb_assertion_editor.NIL;
        SubLObject asserted_by = (SubLObject)cb_assertion_editor.NIL;
        final SubLObject assertion_specifiedP = assertion_handles.assertion_p(assertion);
        final SubLObject sentence_specifiedP = el_utilities.possibly_sentence_p(sentence);
        final SubLObject ist_sentenceP = el_utilities.ist_sentence_p(sentence, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != cb_parameters.$cb_default_mt$.getDynamicValue(thread)) {
            mt = cb_parameters.$cb_default_mt$.getDynamicValue(thread);
        }
        if (cb_assertion_editor.NIL != sentence_specifiedP) {
            if (cb_assertion_editor.NIL != ist_sentenceP) {
                mt = el_utilities.designated_mt(sentence);
                formula = el_utilities.designated_sentence(sentence);
            }
            else {
                formula = sentence;
            }
        }
        if (cb_assertion_editor.NIL != assertion_specifiedP) {
            if (cb_assertion_editor.NIL == ist_sentenceP || cb_assertion_editor.NIL == use_sentenceP) {
                mt = assertions_high.assertion_mt(assertion);
            }
            if (cb_assertion_editor.NIL == sentence_specifiedP || cb_assertion_editor.NIL == use_sentenceP) {
                formula = ke.ke_assertion_edit_formula(assertion);
            }
            id = assertion_handles.assertion_id(assertion);
            direction = assertions_high.assertion_direction(assertion);
            strength = assertions_high.assertion_strength(assertion);
            editing = (SubLObject)SubLObjectFactory.makeBoolean(cb_assertion_editor.$str356$cb_handle_fix_typo.equal(handler) || cb_assertion_editor.$str357$cb_handle_edit.equal(handler) || cb_assertion_editor.$str358$cb_handle_sentence_edit.equal(handler));
            edit_formula_only = Equality.equal((SubLObject)cb_assertion_editor.$str356$cb_handle_fix_typo, handler);
            asserted_by = (SubLObject)((cb_assertion_editor.NIL != assertions_high.asserted_assertionP(assertion)) ? assertions_high.asserted_by(assertion) : cb_assertion_editor.NIL);
        }
        return Values.values(id, formula, mt, direction, strength, editing, edit_formula_only, asserted_by);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 57528L)
    public static SubLObject cb_tabulate_checkable_meta_assertions(final SubLObject assertion, SubLObject newlines_before_message, SubLObject checkbox_name_prefix, SubLObject message, SubLObject meta_assertions_checkedP) {
        if (newlines_before_message == cb_assertion_editor.UNPROVIDED) {
            newlines_before_message = (SubLObject)cb_assertion_editor.ZERO_INTEGER;
        }
        if (checkbox_name_prefix == cb_assertion_editor.UNPROVIDED) {
            checkbox_name_prefix = (SubLObject)cb_assertion_editor.$str152$preserve_;
        }
        if (message == cb_assertion_editor.UNPROVIDED) {
            message = (SubLObject)cb_assertion_editor.$str359$Choose_analogous_meta_assertions_;
        }
        if (meta_assertions_checkedP == cb_assertion_editor.UNPROVIDED) {
            meta_assertions_checkedP = cb_parameters.$cb_a_edit_preserve_meta_assertions_by_defaultP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
            html_utilities.html_newline(newlines_before_message);
            html_utilities.html_princ_strong(message);
            final SubLObject all_meta_assertions = assertion_utilities.all_meta_assertions(assertion);
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                SubLObject cdolist_list_var = all_meta_assertions;
                SubLObject meta_assertion = (SubLObject)cb_assertion_editor.NIL;
                meta_assertion = cdolist_list_var.first();
                while (cb_assertion_editor.NIL != cdolist_list_var) {
                    if (cb_assertion_editor.NIL == assertion_utilities.gaf_assertion_with_pred_p(meta_assertion, cb_assertion_editor.$const360$assertionOriginalText)) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw226$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                final SubLObject meta_assertion_checkbox_value = assertion_handles.assertion_id(meta_assertion);
                                final SubLObject meta_assertion_checkbox_name = PrintLow.format((SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$str361$_a_S, checkbox_name_prefix, meta_assertion_checkbox_value);
                                html_utilities.html_checkbox_input(meta_assertion_checkbox_name, meta_assertion_checkbox_value, meta_assertions_checkedP, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw226$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                cb_show_meta_assertion_readably(meta_assertion, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    meta_assertion = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 58731L)
    public static SubLObject cb_show_meta_assertion_readably(final SubLObject meta_assertion, final SubLObject assertion, SubLObject assertion_indexical, SubLObject wrapP, SubLObject include_mtP) {
        if (assertion_indexical == cb_assertion_editor.UNPROVIDED) {
            assertion_indexical = cb_assertion_editor.$const362$TheAssertionSentence;
        }
        if (wrapP == cb_assertion_editor.UNPROVIDED) {
            wrapP = (SubLObject)cb_assertion_editor.T;
        }
        if (include_mtP == cb_assertion_editor.UNPROVIDED) {
            include_mtP = (SubLObject)cb_assertion_editor.T;
        }
        return cb_utilities.cb_show_assertion_readably(meta_assertion, wrapP, include_mtP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 59094L)
    public static SubLObject cb_extract_mt_from_string(final SubLObject string) {
        assert cb_assertion_editor.NIL != Types.stringp(string) : string;
        final SubLObject mt = cb_utilities.cb_guess_hlmt(string);
        if (cb_assertion_editor.NIL == hlmt.hlmt_p(mt)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str364$_S_did_not_specify_a_microtheory_, string, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        if (cb_assertion_editor.NIL == cb_valid_microtheoryP(mt)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str365$_S_is_not_a_microtheory_, mt, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 59599L)
    public static SubLObject cb_valid_microtheoryP(final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_assertion_editor.NIL != mt && cb_assertion_editor.NIL != hlmt.possibly_hlmt_p(mt) && cb_assertion_editor.NIL != isa.isa_in_any_mtP(mt, cb_assertion_editor.$const366$Microtheory));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 59861L)
    public static SubLObject cb_extract_formula_from_string(final SubLObject string, SubLObject mt) {
        if (mt == cb_assertion_editor.UNPROVIDED) {
            mt = (SubLObject)cb_assertion_editor.NIL;
        }
        assert cb_assertion_editor.NIL != Types.stringp(string) : string;
        final SubLObject sentence = reader.read_from_string_ignoring_errors(string, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL == el_utilities.possibly_sentence_p(sentence)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str367$Bad_sentence__probably_due_to_a_m, string, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        if (cb_assertion_editor.NIL != mt) {
            final SubLObject wff_violations = wff.why_not_wff(sentence, mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != wff_violations) {
                return cb_explain_why_not_wff(sentence, mt, wff_violations, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 60625L)
    public static SubLObject cb_wff_check_sentence_int(final SubLObject sentence, final SubLObject mt, SubLObject show_ok_pageP, SubLObject assert_modeP) {
        if (show_ok_pageP == cb_assertion_editor.UNPROVIDED) {
            show_ok_pageP = (SubLObject)cb_assertion_editor.T;
        }
        if (assert_modeP == cb_assertion_editor.UNPROVIDED) {
            assert_modeP = (SubLObject)cb_assertion_editor.NIL;
        }
        SubLObject wff_violations = (SubLObject)cb_assertion_editor.NIL;
        if (cb_assertion_editor.NIL != assert_modeP) {
            wff_violations = wff.why_not_wff_assert(sentence, mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        else {
            wff_violations = wff.why_not_wff(sentence, mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        if (cb_assertion_editor.NIL != wff_violations) {
            cb_explain_why_not_wff(sentence, mt, wff_violations, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        else if (cb_assertion_editor.NIL != show_ok_pageP) {
            cb_wff_check_formula_ok(sentence, mt);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 61048L)
    public static SubLObject cb_assert_formula(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        else {
            SubLObject formula_id = (SubLObject)cb_assertion_editor.NIL;
            SubLObject mt_id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list368);
            formula_id = args.first();
            SubLObject current = args.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_assertion_editor.$list368);
            mt_id = current.first();
            current = current.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject formula = cb_parameters.cb_glob_lookup_by_string(formula_id);
                final SubLObject mt = cb_utilities.cb_guess_fort(mt_id, (SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject sentence = (SubLObject)ConsesLow.list(cb_assertion_editor.$const369$ist, mt, formula);
                cb_assert_internal((SubLObject)cb_assertion_editor.$kw165$DEFAULT, (SubLObject)cb_assertion_editor.NIL, sentence, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list368);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 61590L)
    public static SubLObject cb_link_assert_formula(final SubLObject formula, SubLObject mt, SubLObject linktext) {
        if (mt == cb_assertion_editor.UNPROVIDED) {
            mt = (SubLObject)cb_assertion_editor.NIL;
        }
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == mt) {
            mt = cb_assertion_editor.$const371$BaseKB;
        }
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str372$_Assert_Formula_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str373$cb_assert_formula__A__A, cb_parameters.cb_glob_id(formula), cb_utilities.cb_fort_identifier(mt));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 61916L)
    public static SubLObject cb_similar(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                    cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, id, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    return (SubLObject)cb_assertion_editor.NIL;
                }
                cb_assert_internal((SubLObject)cb_assertion_editor.$kw323$SIMILAR, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 62330L)
    public static SubLObject cb_link_assert_similar(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str377$_Assert_Similar_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str378$cb_similar__a, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 62595L)
    public static SubLObject cb_assert_meta(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        SubLObject id = (SubLObject)cb_assertion_editor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
        id = args.first();
        final SubLObject current = args.rest();
        if (cb_assertion_editor.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
            cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, id, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        return cb_assert_internal((SubLObject)cb_assertion_editor.$kw318$META, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 63012L)
    public static SubLObject cb_handle_assert_meta(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str381$editing);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str138$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str269$_S_did_not_specify_an_assertion_, args.first(), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject mt = thread.secondMultipleValue();
        SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject strength = thread.fourthMultipleValue();
        final SubLObject direction = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != error) {
            return (SubLObject)cb_assertion_editor.NIL;
        }
        if (cb_assertion_editor.NIL == list_utilities.tree_find(cb_parameters.$cb_assertion_indexical$.getGlobalValue(), sentence, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str382$The_sentence_did_not_mention__S_, cb_parameters.$cb_assertion_indexical$.getGlobalValue(), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        final SubLObject assertion_sentence = uncanonicalizer.assertion_el_ist_formula(assertion);
        sentence = conses_high.subst(assertion_sentence, cb_parameters.$cb_assertion_indexical$.getGlobalValue(), sentence, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str299$wff_check, args))) {
            return cb_wff_check_sentence_int(sentence, mt, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        final SubLObject wff_violations = wff.why_not_wff_assert(sentence, mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != wff_violations) {
            return cb_attempt_to_repair_and_assert(sentence, mt, strength, direction, args, wff_violations);
        }
        ke.ke_assert(sentence, mt, strength, direction);
        return cb_note_edit_change((SubLObject)cb_assertion_editor.$str383$EL_Meta_Sentence_Assert, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.THREE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 64512L)
    public static SubLObject cb_link_assert_meta(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str385$_Assert_Meta_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str386$cb_assert_meta__a, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 64772L)
    public static SubLObject cb_suggest_pragmas(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                    cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, id, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    return (SubLObject)cb_assertion_editor.NIL;
                }
                cb_suggest_pragmas_guts(assertion);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 65214L)
    public static SubLObject cb_link_suggest_pragmas(final SubLObject rule, SubLObject linktext, SubLObject disabledP, SubLObject target) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        if (target == cb_assertion_editor.UNPROVIDED) {
            target = (SubLObject)cb_assertion_editor.$kw83$SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str389$_Suggest_Pragmas_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str390$cb_suggest_pragmas__a, assertion_handles.assertion_id(rule));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 65549L)
    public static SubLObject cb_suggest_pragmas_guts(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pragmas = pragma_induction.rule_suggested_pragma_sentences(rule, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject title_var = (SubLObject)cb_assertion_editor.$str392$Suggested_Pragmas;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$76 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$77 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw393$CB_SUGGEST_PRAGMAS, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str394$Pragmatic_requirements_worth_cons);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                            cb_utilities.cb_show_assertion_readably(rule, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                SubLObject cdolist_list_var = pragmas;
                                SubLObject pragma = (SubLObject)cb_assertion_editor.NIL;
                                pragma = cdolist_list_var.first();
                                while (cb_assertion_editor.NIL != cdolist_list_var) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            final SubLObject pragmatic_requirement = el_utilities.make_binary_formula(cb_assertion_editor.$const395$pragmaticRequirement, pragma, cb_assertion_editor.$const362$TheAssertionSentence);
                                            cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw396$ASSERT_SUGGESTED_PRAGMA, rule, pragmatic_requirement, (SubLObject)cb_assertion_editor.$str397$_Assert_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            html_utilities.html_glyph((SubLObject)cb_assertion_editor.$kw398$NBSP, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            cb_utilities.cb_show_term(pragma, (SubLObject)cb_assertion_editor.ZERO_INTEGER, (SubLObject)cb_assertion_editor.T);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    pragma = cdolist_list_var.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$77, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$76, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 66385L)
    public static SubLObject cb_link_assert_suggested_pragma(final SubLObject assertion, final SubLObject pragma, SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str397$_Assert_;
        }
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject encoded_pragma = cb_utilities.cb_string_for_sentence(pragma);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str399$cb_assert_suggested_pragma__a__a, id, encoded_pragma);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 66765L)
    public static SubLObject cb_assert_suggested_pragma(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        SubLObject id_string = (SubLObject)cb_assertion_editor.NIL;
        SubLObject pragma_string = (SubLObject)cb_assertion_editor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list401);
        id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_assertion_editor.$list401);
        pragma_string = current.first();
        current = current.rest();
        if (cb_assertion_editor.NIL == current) {
            final SubLObject assertion = cb_utilities.cb_guess_assertion(id_string);
            final SubLObject pragma = cb_utilities.cb_guess_sentence(pragma_string);
            return cb_assert_internal((SubLObject)cb_assertion_editor.$kw318$META, assertion, pragma, (SubLObject)cb_assertion_editor.T);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list401);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 67126L)
    public static SubLObject without_arg_format_and_relator_checking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)cb_assertion_editor.$sym403$CLET, (SubLObject)cb_assertion_editor.$list404, ConsesLow.append(body, (SubLObject)cb_assertion_editor.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 67585L)
    public static SubLObject cb_edit(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                    cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, id, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    return (SubLObject)cb_assertion_editor.NIL;
                }
                cb_assert_internal((SubLObject)cb_assertion_editor.$kw239$EDIT, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 67950L)
    public static SubLObject cb_handle_edit(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str381$editing);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        if (cb_assertion_editor.NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str299$wff_check, args))) {
            return cb_wff_check_formula(args, (SubLObject)cb_assertion_editor.NIL);
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str138$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str269$_S_did_not_specify_an_assertion_, args.first(), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject strength = thread.fourthMultipleValue();
        final SubLObject direction = thread.fifthMultipleValue();
        final SubLObject sentence_string = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != error) {
            return (SubLObject)cb_assertion_editor.NIL;
        }
        SubLObject wff_violations = (SubLObject)cb_assertion_editor.NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        try {
            at_vars.$at_check_arg_formatP$.bind((SubLObject)cb_assertion_editor.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)cb_assertion_editor.NIL, thread);
            wff_violations = wff.why_not_wff(sentence, mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
        }
        if (cb_assertion_editor.NIL != wff_violations) {
            cb_explain_why_not_wff(sentence, mt, wff_violations, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_edit_assertion_hook(assertion, sentence, mt, strength, direction, meta_assertions_to_preserve, sentence_string);
        return cb_note_edit_change((SubLObject)cb_assertion_editor.$str406$Assertion_Edit, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.THREE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 69587L)
    public static SubLObject cb_extract_meta_assertions_from_args(final SubLObject assertion, final SubLObject args, SubLObject start_with_prefix, SubLObject new_meta_assertion_mt) {
        if (start_with_prefix == cb_assertion_editor.UNPROVIDED) {
            start_with_prefix = (SubLObject)cb_assertion_editor.$str152$preserve_;
        }
        if (new_meta_assertion_mt == cb_assertion_editor.UNPROVIDED) {
            new_meta_assertion_mt = (SubLObject)cb_assertion_editor.NIL;
        }
        SubLObject meta_assertions_to_preserve = (SubLObject)cb_assertion_editor.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)cb_assertion_editor.NIL;
        arg = cdolist_list_var.first();
        while (cb_assertion_editor.NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current;
                final SubLObject datum = current = arg;
                SubLObject input_name = (SubLObject)cb_assertion_editor.NIL;
                SubLObject assertion_id_string = (SubLObject)cb_assertion_editor.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list408);
                input_name = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list408);
                assertion_id_string = current.first();
                current = current.rest();
                if (cb_assertion_editor.NIL == current) {
                    if (cb_assertion_editor.NIL != string_utilities.starts_with(input_name, start_with_prefix)) {
                        final SubLObject meta_assertion = cb_utilities.cb_guess_assertion(assertion_id_string);
                        final SubLObject meta_assertion_mt = (cb_assertion_editor.NIL != new_meta_assertion_mt) ? new_meta_assertion_mt : assertions_high.assertion_mt(meta_assertion);
                        if (cb_assertion_editor.NIL != assertion_handles.assertion_p(meta_assertion) && cb_assertion_editor.NIL != cycl_utilities.expression_find(assertion, meta_assertion, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED)) {
                            meta_assertions_to_preserve = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(meta_assertion, meta_assertion_mt), meta_assertions_to_preserve);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_assertion_editor.$list408);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(meta_assertions_to_preserve);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 70537L)
    public static SubLObject cb_link_edit_assertion(final SubLObject assertion, SubLObject linktext, SubLObject disabledP, SubLObject target) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        if (target == cb_assertion_editor.UNPROVIDED) {
            target = (SubLObject)cb_assertion_editor.$kw83$SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str409$_Edit_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str410$cb_edit__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 70877L)
    public static SubLObject cb_handle_edit_assertion(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
                try {
                    final SubLObject _prev_bind_0_$86 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)cb_assertion_editor.$str412$error, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$87 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED, thread);
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str413$_S, cyc_navigator_internals.guest_warn_string((SubLObject)cb_assertion_editor.$str414$assertion_editing_facilities));
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$87, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$86, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$88 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_editor.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)cb_assertion_editor.$str412$error);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                    }
                }
                return (SubLObject)cb_assertion_editor.NIL;
            }
            SubLObject problem_sentence_info = (SubLObject)cb_assertion_editor.NIL;
            SubLObject good_sentence_info = (SubLObject)cb_assertion_editor.NIL;
            final SubLObject assertion_id_to_delete = html_utilities.html_extract_sexpr((SubLObject)cb_assertion_editor.$str416$oldAssertionId, args, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject assertion_to_delete = (SubLObject)((cb_assertion_editor.NIL != assertion_id_to_delete) ? assertion_handles.find_assertion_by_id(assertion_id_to_delete) : cb_assertion_editor.NIL);
            SubLObject cdolist_list_var = args;
            SubLObject arg = (SubLObject)cb_assertion_editor.NIL;
            arg = cdolist_list_var.first();
            while (cb_assertion_editor.NIL != cdolist_list_var) {
                if (cb_assertion_editor.NIL != list_utilities.proper_list_p(arg)) {
                    final SubLObject param = arg.first();
                    if (cb_assertion_editor.NIL != string_utilities.starts_with(param, (SubLObject)cb_assertion_editor.$str343$sentence)) {
                        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw342$INPUT_NAME, param));
                        final SubLObject sentence_num = Sequences.subseq(param, (SubLObject)cb_assertion_editor.EIGHT_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        if (cb_assertion_editor.NIL != wff.el_wffP(sentence, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED)) {
                            good_sentence_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw417$SENTENCE_NUM, sentence_num, (SubLObject)cb_assertion_editor.$kw22$SENTENCE, sentence), good_sentence_info);
                        }
                        else {
                            problem_sentence_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw417$SENTENCE_NUM, sentence_num, (SubLObject)cb_assertion_editor.$kw22$SENTENCE, html_utilities.html_extract_input(param, args), (SubLObject)cb_assertion_editor.$kw418$MESSAGE, wff.explanation_of_why_not_wff_terse(sentence, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED).first()), problem_sentence_info);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            if (cb_assertion_editor.NIL == problem_sentence_info) {
                if (cb_assertion_editor.NIL != assertion_to_delete && cb_assertion_editor.NIL != list_utilities.lengthE(good_sentence_info, (SubLObject)cb_assertion_editor.ONE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED)) {
                    final SubLObject to_add = conses_high.getf(good_sentence_info.first(), (SubLObject)cb_assertion_editor.$kw22$SENTENCE, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject successP = ke.ke_edit_now(uncanonicalizer.assertion_el_formula(assertion_to_delete), to_add, assertions_high.assertion_mt(assertion_to_delete), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject err_msg = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (cb_assertion_editor.NIL == successP) {
                        problem_sentence_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw22$SENTENCE, to_add, (SubLObject)cb_assertion_editor.$kw417$SENTENCE_NUM, conses_high.getf(good_sentence_info.first(), (SubLObject)cb_assertion_editor.$kw417$SENTENCE_NUM, (SubLObject)cb_assertion_editor.UNPROVIDED), (SubLObject)cb_assertion_editor.$kw418$MESSAGE, string_utilities.bunge(wff.explanation_of_why_not_wff_terse_assert(to_add, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), (SubLObject)Characters.CHAR_newline)), problem_sentence_info);
                    }
                }
                else {
                    if (cb_assertion_editor.NIL != assertion_to_delete) {
                        ke.ke_unassert_assertion_now(assertion_to_delete);
                    }
                    cdolist_list_var = good_sentence_info;
                    SubLObject sentence_info = (SubLObject)cb_assertion_editor.NIL;
                    sentence_info = cdolist_list_var.first();
                    while (cb_assertion_editor.NIL != cdolist_list_var) {
                        final SubLObject sentence2 = conses_high.getf(sentence_info, (SubLObject)cb_assertion_editor.$kw22$SENTENCE, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        thread.resetMultipleValues();
                        final SubLObject successP2 = ke.ke_assert_now(sentence2, cb_assertion_editor.$const371$BaseKB, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject msg = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (cb_assertion_editor.NIL == successP2) {
                            problem_sentence_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw22$SENTENCE, sentence2, (SubLObject)cb_assertion_editor.$kw417$SENTENCE_NUM, conses_high.getf(sentence_info, (SubLObject)cb_assertion_editor.$kw417$SENTENCE_NUM, (SubLObject)cb_assertion_editor.UNPROVIDED), (SubLObject)cb_assertion_editor.$kw418$MESSAGE, msg), problem_sentence_info);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        sentence_info = cdolist_list_var.first();
                    }
                }
            }
            try {
                final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)cb_assertion_editor.$str419$response, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED, thread);
                        if (cb_assertion_editor.NIL != problem_sentence_info) {
                            try {
                                final SubLObject _prev_bind_0_$91 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_assertion_editor.$str412$error, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$92 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var2 = problem_sentence_info;
                                        SubLObject sentence_info2 = (SubLObject)cb_assertion_editor.NIL;
                                        sentence_info2 = cdolist_list_var2.first();
                                        while (cb_assertion_editor.NIL != cdolist_list_var2) {
                                            final SubLObject sentence3 = conses_high.getf(sentence_info2, (SubLObject)cb_assertion_editor.$kw22$SENTENCE, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            final SubLObject error_message = conses_high.getf(sentence_info2, (SubLObject)cb_assertion_editor.$kw418$MESSAGE, (SubLObject)cb_assertion_editor.$kw420$NOT_WELL_FORMED);
                                            final SubLObject attrs = (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str138$id, conses_high.getf(sentence_info2, (SubLObject)cb_assertion_editor.$kw417$SENTENCE_NUM, (SubLObject)cb_assertion_editor.UNPROVIDED));
                                            try {
                                                final SubLObject _prev_bind_0_$93 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_assertion_editor.$str421$invalidSentence, attrs, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$94 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED, thread);
                                                        xml_utilities.xml_cdata(format_nil.format_nil_s(sentence3));
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$94, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$93, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$93, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_editor.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_assertion_editor.$str421$invalidSentence);
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                                                }
                                            }
                                            try {
                                                final SubLObject _prev_bind_0_$96 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_assertion_editor.$str422$message, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$97 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED, thread);
                                                        xml_utilities.xml_cdata(error_message);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$97, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$94, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$96, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$98 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_editor.T, thread);
                                                    final SubLObject _values3 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_assertion_editor.$str422$message);
                                                    Values.restoreValuesFromVector(_values3);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$98, thread);
                                                }
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            sentence_info2 = cdolist_list_var2.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$92, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$92, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$91, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    final SubLObject _values4 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_assertion_editor.$str412$error);
                                    Values.restoreValuesFromVector(_values4);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                                }
                            }
                        }
                        else {
                            final SubLObject attrs2 = (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str423$count, string_utilities.to_string(Sequences.length(good_sentence_info)));
                            try {
                                final SubLObject _prev_bind_0_$100 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$95 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_assertion_editor.$str424$assertionsQueued, attrs2, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$101 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED, thread);
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str425$_A_assertion_P_added_to_the_local, Sequences.length(good_sentence_info), Sequences.length(good_sentence_info));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$101, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$95, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$100, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$102 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    final SubLObject _values5 = Values.getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_assertion_editor.$str424$assertionsQueued);
                                    Values.restoreValuesFromVector(_values5);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$102, thread);
                                }
                            }
                            if (cb_assertion_editor.NIL != assertion_to_delete) {
                                final SubLObject attrs_$107 = (SubLObject)cb_assertion_editor.$list426;
                                try {
                                    final SubLObject _prev_bind_0_$103 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)cb_assertion_editor.$str427$unassertedQueued, attrs_$107, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$104 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)cb_assertion_editor.$kw46$UNINITIALIZED, thread);
                                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str428$_A_unassert__P_added_to_the_local, (SubLObject)cb_assertion_editor.ONE_INTEGER);
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$104, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$96, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$103, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$105 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        final SubLObject _values6 = Values.getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal((SubLObject)cb_assertion_editor.$str427$unassertedQueued);
                                        Values.restoreValuesFromVector(_values6);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$90, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$89, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$106 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    final SubLObject _values7 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)cb_assertion_editor.$str419$response);
                    Values.restoreValuesFromVector(_values7);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 74287L)
    public static SubLObject cb_handle_sentence_edit(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str381$editing);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str138$id, args);
        final SubLObject sentence = cb_parameters.cb_glob_lookup_by_string(id);
        if (cb_assertion_editor.NIL == el_utilities.ist_sentence_p(sentence, (SubLObject)cb_assertion_editor.UNPROVIDED)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str431$_S_did_not_specify_a_CycL_sentenc, sentence, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject new_mt = thread.secondMultipleValue();
        final SubLObject new_sentence = thread.thirdMultipleValue();
        final SubLObject new_strength = thread.fourthMultipleValue();
        final SubLObject new_direction = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != error) {
            return (SubLObject)cb_assertion_editor.NIL;
        }
        SubLObject wff_violations = (SubLObject)cb_assertion_editor.NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        try {
            at_vars.$at_check_arg_formatP$.bind((SubLObject)cb_assertion_editor.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)cb_assertion_editor.NIL, thread);
            wff_violations = wff.why_not_wff_assert(new_sentence, new_mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
        }
        if (cb_assertion_editor.NIL != wff_violations) {
            return cb_explain_why_not_wff(new_sentence, new_mt, wff_violations, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        final SubLObject old_sentence = cycl_utilities.formula_arg2(sentence, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject old_mt = cycl_utilities.formula_arg1(sentence, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_handle_sentence_edit_int(old_sentence, old_mt, new_sentence, new_mt, new_strength, new_direction);
        return cb_note_edit_change((SubLObject)cb_assertion_editor.$str406$Assertion_Edit, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.THREE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 75667L)
    public static SubLObject cb_handle_sentence_edit_int(final SubLObject old_sentence, final SubLObject old_mt, final SubLObject new_sentence, final SubLObject new_mt, final SubLObject new_strength, final SubLObject new_direction) {
        cb_tools.cb_rem_from_sentence_history(el_utilities.make_ist_sentence(old_mt, old_sentence));
        cb_tools.cb_add_sentence_in_mt_to_assertion_history(new_sentence, new_mt);
        return ke.ke_edit(old_sentence, new_sentence, old_mt, new_mt, new_strength, new_direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 76008L)
    public static SubLObject cb_fix_typo_edit(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str433$the_Cyc_KB_typo_fixing_facilities);
        }
        else {
            SubLObject id = (SubLObject)cb_assertion_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list134);
            id = args.first();
            final SubLObject current = args.rest();
            if (cb_assertion_editor.NIL == current) {
                final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
                if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                    cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, id, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    return (SubLObject)cb_assertion_editor.NIL;
                }
                cb_assert_internal((SubLObject)cb_assertion_editor.$kw105$FIX_TYPO, assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list134);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 76451L)
    public static SubLObject cb_link_fix_typo(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str435$_Fix_Typo_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str436$cb_fix_typo_edit__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 76769L)
    public static SubLObject cb_handle_fix_typo(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str433$the_Cyc_KB_typo_fixing_facilities);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        if (cb_assertion_editor.NIL != list_utilities.sublisp_boolean(html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str299$wff_check, args))) {
            return cb_wff_check_formula(args, (SubLObject)cb_assertion_editor.T);
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_assertion_editor.$str138$id, args);
        final SubLObject assertion = cb_utilities.cb_guess_assertion(id);
        if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str269$_S_did_not_specify_an_assertion_, args.first(), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject error = cb_extract_some_assert_arguments(args);
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject sentence = thread.thirdMultipleValue();
        final SubLObject strength = thread.fourthMultipleValue();
        final SubLObject direction = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != error) {
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject old_sentence = ke.ke_assertion_edit_formula(assertion);
        if (cb_assertion_editor.NIL == ke.formulas_differ_only_in_strings(old_sentence, sentence, (SubLObject)cb_assertion_editor.$sym438$CYCL_STRING_P)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str439$Edited_sentence_does_not_differ_o, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        SubLObject wff_violations = (SubLObject)cb_assertion_editor.NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        try {
            at_vars.$at_check_arg_formatP$.bind((SubLObject)cb_assertion_editor.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)cb_assertion_editor.NIL, thread);
            wff_violations = wff.why_not_wff_assert(sentence, mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
        }
        if (cb_assertion_editor.NIL != wff_violations) {
            return cb_explain_why_not_wff(sentence, mt, wff_violations, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        final SubLObject meta_assertions_to_preserve = cb_extract_meta_assertions_from_args(assertion, args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_edit_assertion_strings_hook(assertion, sentence, meta_assertions_to_preserve);
        return cb_note_edit_change((SubLObject)cb_assertion_editor.$str406$Assertion_Edit, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.THREE_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 78951L)
    public static SubLObject cb_fix_typo_assertionP(final SubLObject assertion) {
        return cycl_utilities.assertion_find_if(Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym363$STRINGP), assertion, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 79068L)
    public static SubLObject cb_reassert(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        else {
            final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
            if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                cb_null_edit_assertion_hook(assertion);
                cb_note_edit_change((SubLObject)cb_assertion_editor.$str441$Reassert, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 79495L)
    public static SubLObject cb_link_reassert(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str443$_Reassert_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str444$cb_reassert__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 79811L)
    public static SubLObject cb_unassert(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        else {
            final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
            if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                cb_tools.cb_rem_from_assertion_history(assertion);
                ke.ke_unassert_assertion(assertion);
                cb_note_edit_change((SubLObject)cb_assertion_editor.$str446$Unassert, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 80276L)
    public static SubLObject cb_link_unassert(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str448$_Unassert_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str449$cb_unassert__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 80592L)
    public static SubLObject cb_blast(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        else {
            final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
            if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                cb_tools.cb_rem_from_assertion_history(assertion);
                ke.ke_blast_assertion(assertion);
                cb_note_edit_change((SubLObject)cb_assertion_editor.$str451$Assertion_Blast, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 81049L)
    public static SubLObject cb_link_blast(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str453$_Blast_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str454$cb_blast__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 81353L)
    public static SubLObject cb_remove_deduction(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        SubLObject id_string = (SubLObject)cb_assertion_editor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list456);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (cb_assertion_editor.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list456);
            return (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject deduction = cb_utilities.cb_guess_deduction(id_string);
        if (cb_assertion_editor.NIL == deduction_handles.deduction_p(deduction)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str457$_a_does_not_specify_a_deduction, id_string, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        ke.ke_remove_deduction(deduction);
        return cb_note_edit_change((SubLObject)cb_assertion_editor.$str458$Deduction_Removal, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 81852L)
    public static SubLObject cb_link_remove_deduction(final SubLObject deduction, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str460$_Remove_Deduction_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str461$cb_remove_deduction__a, deduction_handles.deduction_id(deduction));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return deduction;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 82189L)
    public static SubLObject cb_assertion_tms(final SubLObject args) {
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str86$the_Cyc_KB_editing_facilities);
        }
        else {
            final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
            if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            else {
                ke.ke_tms_reconsider_assertion(assertion);
                cb_note_edit_change((SubLObject)cb_assertion_editor.$str464$Redo_TMS_for_Assertion, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 82719L)
    public static SubLObject cb_link_assert_tms(final SubLObject assertion, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        if (disabledP == cb_assertion_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str466$_Redo_TMS_;
        }
        if (cb_assertion_editor.NIL != disabledP) {
            cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str467$cb_assertion_tms__a, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 83224L)
    public static SubLObject cb_diagnose_assertion(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str471$the_Assertion_Diagnostics_page);
        }
        else {
            final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
            if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
                cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str472$_a_does_not_specify_a_Cyc_asserti, args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                return (SubLObject)cb_assertion_editor.NIL;
            }
            final SubLObject title_var = (SubLObject)cb_assertion_editor.$str473$Assertion_Diagnostics;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$113 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_assertion_editor.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$114 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_assertion_editor.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw469$CB_DIAGNOSE_ASSERTION, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_assertion_editor.$str474$Diagnosis_of__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                                cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                                final SubLObject access_problem = cb_assertion_browser.cb_assertion_access_diagnostics(assertion);
                                final SubLObject results = cb_diagnose_assertion_int(assertion);
                                if (cb_assertion_editor.NIL == results && cb_assertion_editor.NIL == access_problem) {
                                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str295$OK);
                                }
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$114, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$113, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 84024L)
    public static SubLObject cb_diagnose_assertion_int(final SubLObject assertion) {
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 84557L)
    public static SubLObject cb_link_diagnose_assertion(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str476$_Run_Diagnostics_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw285$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str477$cb_diagnose_assertion__A, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 84834L)
    public static SubLObject cb_link_trigger_test(SubLObject support, SubLObject rule, SubLObject linktext) {
        if (support == cb_assertion_editor.UNPROVIDED) {
            support = (SubLObject)cb_assertion_editor.NIL;
        }
        if (rule == cb_assertion_editor.UNPROVIDED) {
            rule = (SubLObject)cb_assertion_editor.NIL;
        }
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str118$_Trigger_Test_;
        }
        if (cb_assertion_editor.NIL != support && !cb_assertion_editor.assertionsDisabledInClass && cb_assertion_editor.NIL == arguments.support_p(support)) {
            throw new AssertionError(support);
        }
        if (cb_assertion_editor.NIL != rule && !cb_assertion_editor.assertionsDisabledInClass && cb_assertion_editor.NIL == assertions_high.rule_assertionP(rule)) {
            throw new AssertionError(rule);
        }
        thread.resetMultipleValues();
        final SubLObject support_id = cb_trigger_test_id_strings(support, rule);
        final SubLObject rule_id = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        if (cb_assertion_editor.NIL != rule_id) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str482$cb_trigger_test__a__a, support_id, rule_id);
        }
        else if (cb_assertion_editor.NIL != support_id) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str483$cb_trigger_test__a, support_id);
        }
        else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str484$cb_trigger_test);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return support;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 85491L)
    public static SubLObject cb_trigger_test_id_strings(final SubLObject support, final SubLObject rule) {
        SubLObject support_id = (SubLObject)cb_assertion_editor.NIL;
        SubLObject rule_id = (SubLObject)cb_assertion_editor.NIL;
        if (cb_assertion_editor.NIL != assertion_handles.assertion_p(support)) {
            support_id = assertion_handles.assertion_id(support);
        }
        if (cb_assertion_editor.NIL != rule) {
            rule_id = assertion_handles.assertion_id(rule);
        }
        return Values.values(support_id, rule_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 85803L)
    public static SubLObject cb_extract_trigger_test_args(final SubLObject args) {
        if (cb_assertion_editor.NIL == args) {
            return Values.values((SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL);
        }
        if (cb_assertion_editor.NIL != list_utilities.singletonP(args)) {
            final SubLObject support = cb_utilities.cb_guess_assertion(args);
            return Values.values(support, (SubLObject)cb_assertion_editor.NIL);
        }
        SubLObject support_id = (SubLObject)cb_assertion_editor.NIL;
        SubLObject rule_id = (SubLObject)cb_assertion_editor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_assertion_editor.$list486);
        support_id = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_assertion_editor.$list486);
        rule_id = current.first();
        current = current.rest();
        if (cb_assertion_editor.NIL == current) {
            final SubLObject support2 = cb_utilities.cb_guess_assertion(support_id);
            final SubLObject rule = cb_utilities.cb_guess_assertion(rule_id);
            return Values.values(support2, rule);
        }
        cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_assertion_editor.$list486);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 86198L)
    public static SubLObject cb_trigger_test(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn((SubLObject)cb_assertion_editor.$str487$the_Trigger_Test_page);
        }
        thread.resetMultipleValues();
        final SubLObject trigger_support = cb_extract_trigger_test_args(args);
        final SubLObject trigger_rule = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_assertion_editor.NIL != arguments.support_p(trigger_support)) {
            if (cb_assertion_editor.NIL != assertions_high.rule_assertionP(trigger_rule)) {
                return cb_trigger_test_support_and_rule(trigger_support, trigger_rule);
            }
            return cb_trigger_test_support(trigger_support);
        }
        else {
            if (cb_assertion_editor.NIL != assertions_high.rule_assertionP(trigger_rule)) {
                return cb_trigger_test_rule(trigger_rule);
            }
            return cb_trigger_test_unspecified();
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 86758L)
    public static SubLObject cb_trigger_test_support_and_rule(final SubLObject trigger_support, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertibles_queue = forward.forward_propagate_one_support_wrt_rule_and_generate_assertibles(trigger_support, rule, cb_assertion_editor.$const489$InferencePSC);
        final SubLObject title_var = (SubLObject)cb_assertion_editor.$str490$Trigger_Test_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$118 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$119 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw491$CB_TRIGGER_TEST, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str492$Results_of_triggering__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_assertion_editor.FOUR_INTEGER);
                        cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw117$TRIGGER_TEST, trigger_support, rule, (SubLObject)cb_assertion_editor.$str493$_Retrigger_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                        cb_assertion_browser.cb_show_support(trigger_support, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str494$against_rule__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                        cb_utilities.cb_show_assertion_readably(rule, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.T);
                        html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                        if (cb_assertion_editor.NIL != queues.queue_empty_p(assertibles_queue)) {
                            html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str495$No_results_);
                        }
                        else {
                            final SubLObject total = queues.queue_size(assertibles_queue);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.ONE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        final SubLObject conclusion_label = (SubLObject)((cb_assertion_editor.NIL != number_utilities.onep(total)) ? cb_assertion_editor.$str496$One_Conclusion : Sequences.cconcatenate((SubLObject)cb_assertion_editor.$str497$Conclusions__, new SubLObject[] { format_nil.format_nil_s_no_copy(total), cb_assertion_editor.$str498$_total_ }));
                                        html_utilities.html_princ_strong(conclusion_label);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        html_utilities.html_princ_strong((SubLObject)cb_assertion_editor.$str499$Justification);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                SubLObject index = (SubLObject)cb_assertion_editor.ZERO_INTEGER;
                                SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements(assertibles_queue);
                                SubLObject assertible = (SubLObject)cb_assertion_editor.NIL;
                                assertible = cdolist_list_var.first();
                                while (cb_assertion_editor.NIL != cdolist_list_var) {
                                    SubLObject current;
                                    final SubLObject datum = current = assertible;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list500);
                                    final SubLObject temp = current.rest();
                                    current = current.first();
                                    SubLObject gaf_cnf = (SubLObject)cb_assertion_editor.NIL;
                                    SubLObject concluded_mt = (SubLObject)cb_assertion_editor.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list500);
                                    gaf_cnf = current.first();
                                    current = current.rest();
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list500);
                                    concluded_mt = current.first();
                                    final SubLObject rest;
                                    current = (rest = current.rest());
                                    current = temp;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list500);
                                    final SubLObject temp_$126 = current.rest();
                                    current = current.first();
                                    SubLObject deduction_token = (SubLObject)cb_assertion_editor.NIL;
                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_assertion_editor.$list500);
                                    deduction_token = current.first();
                                    final SubLObject justification;
                                    current = (justification = current.rest());
                                    current = temp_$126;
                                    if (cb_assertion_editor.NIL == current) {
                                        final SubLObject gaf_formula = clauses.cnf_formula(gaf_cnf, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject concluded_gaf = kb_indexing.find_gaf(gaf_formula, concluded_mt);
                                        final SubLObject concluded_support = (cb_assertion_editor.NIL != concluded_gaf) ? concluded_gaf : arguments.make_hl_support((SubLObject)cb_assertion_editor.$kw501$OPAQUE, gaf_formula, concluded_mt, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject justification_tag = Sequences.cconcatenate((SubLObject)cb_assertion_editor.$str502$just, format_nil.format_nil_a_no_copy(index));
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw226$LEFT));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                                cb_assertion_browser.cb_show_support(concluded_support, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw226$LEFT));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                                dhtml_macros.dhtml_switch_visibility_links(justification_tag, (SubLObject)cb_assertion_editor.$str332$Show, (SubLObject)cb_assertion_editor.$str333$Hide);
                                                final SubLObject initial_visibility = (SubLObject)cb_assertion_editor.$kw335$INVISIBLE;
                                                dhtml_macros.dhtml_set_switched_visibility(justification_tag, initial_visibility, (SubLObject)cb_assertion_editor.$kw336$PARAGRAPH);
                                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                                if (cb_assertion_editor.NIL != justification_tag) {
                                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                    html_utilities.html_markup(justification_tag);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                }
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                                    cb_assertion_browser.cb_show_justification_readably(justification, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    }
                                    else {
                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_assertion_editor.$list500);
                                    }
                                    index = Numbers.add(index, (SubLObject)cb_assertion_editor.ONE_INTEGER);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    assertible = cdolist_list_var.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$119, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$118, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 89315L)
    public static SubLObject cb_trigger_test_support(final SubLObject trigger_support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_assertion_editor.$str503$Trigger_Test_Setup;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$131 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$132 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw491$CB_TRIGGER_TEST, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str504$Support_to_trigger__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                        cb_assertion_browser.cb_show_support(trigger_support, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                        final SubLObject history_rules = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym481$RULE_ASSERTION_), cb_tools.cb_assertion_history_items(), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        if (cb_assertion_editor.NIL != history_rules) {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str505$Please_select_a_rule_to_trigger__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                SubLObject cdolist_list_var = history_rules;
                                SubLObject rule = (SubLObject)cb_assertion_editor.NIL;
                                rule = cdolist_list_var.first();
                                while (cb_assertion_editor.NIL != cdolist_list_var) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw117$TRIGGER_TEST, trigger_support, rule, (SubLObject)cb_assertion_editor.$str506$_Trigger_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            cb_utilities.cb_show_assertion_readably(rule, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.T);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    rule = cdolist_list_var.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$135, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        else {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str507$There_are_currently_no_rules_in_y);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$132, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$131, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 90269L)
    public static SubLObject cb_trigger_test_rule(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_assertion_editor.$str503$Trigger_Test_Setup;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$139 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_assertion_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$140 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str54$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$142, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_assertion_editor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_assertion_editor.$kw491$CB_TRIGGER_TEST, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        html_utilities.html_hr((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str508$Rule_to_trigger__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                        cb_utilities.cb_show_assertion_readably(rule, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.T);
                        html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
                        final SubLObject history_gafs = Sequences.remove_if(Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym481$RULE_ASSERTION_), cb_tools.cb_assertion_history_items(), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        if (cb_assertion_editor.NIL != history_gafs) {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str509$Please_select_a_support_to_trigge);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                SubLObject cdolist_list_var = history_gafs;
                                SubLObject support = (SubLObject)cb_assertion_editor.NIL;
                                support = cdolist_list_var.first();
                                while (cb_assertion_editor.NIL != cdolist_list_var) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            cb_utilities.cb_link((SubLObject)cb_assertion_editor.$kw117$TRIGGER_TEST, support, rule, (SubLObject)cb_assertion_editor.$str506$_Trigger_, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_assertion_editor.$kw227$TOP));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                                            cb_utilities.cb_show_assertion_readably(support, (SubLObject)cb_assertion_editor.T, (SubLObject)cb_assertion_editor.T);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$146, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    support = cdolist_list_var.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$143, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        else {
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str510$There_are_currently_no_supports_i);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$140, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$139, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 91206L)
    public static SubLObject cb_trigger_test_unspecified() {
        return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str511$Time_to_implement_cb_trigger_test, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 91692L)
    public static SubLObject cb_proof_checker_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_assertion_editor.$cb_proof_checker_rules$.setDynamicValue(list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym513$VALID_ASSERTION), cb_assertion_editor.$cb_proof_checker_rules$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
        return conses_high.copy_list(cb_assertion_editor.$cb_proof_checker_rules$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 91876L)
    public static SubLObject cb_add_to_proof_checker_rules(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL != assertion_handles.assertion_p(assertion) && cb_assertion_editor.NIL != assertions_high.rule_assertionP(assertion) && cb_assertion_editor.NIL == conses_high.member(assertion, cb_assertion_editor.$cb_proof_checker_rules$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)cb_assertion_editor.EQL), Symbols.symbol_function((SubLObject)cb_assertion_editor.IDENTITY))) {
            cb_assertion_editor.$cb_proof_checker_rules$.setDynamicValue((SubLObject)ConsesLow.cons(assertion, cb_assertion_editor.$cb_proof_checker_rules$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 92078L)
    public static SubLObject cb_delete_from_proof_checker_rules(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_assertion_editor.$cb_proof_checker_rules$.setDynamicValue(Sequences.delete(assertion, cb_assertion_editor.$cb_proof_checker_rules$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 92238L)
    public static SubLObject cb_delete_all_proof_checker_rules() {
        cb_assertion_editor.$cb_proof_checker_rules$.setDynamicValue((SubLObject)cb_assertion_editor.NIL);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 92346L)
    public static SubLObject cb_use_in_proof(final SubLObject args) {
        final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
        if (cb_assertion_editor.NIL == assertion_handles.assertion_p(assertion)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str257$_a_does_not_specify_an_assertion, args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        if (cb_assertion_editor.NIL == assertions_high.rule_assertionP(assertion)) {
            return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str514$Assertion_specified_was_not_a_rul, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        cb_add_to_proof_checker_rules(assertion);
        return cb_utilities.cb_simple_message_page((SubLObject)cb_assertion_editor.$str515$Rule_has_been_added_to_proof_chec, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 92852L)
    public static SubLObject cb_link_use_in_proof(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_editor.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str518$_Use_in_Proof_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str519$cb_use_in_proof__a, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 93155L)
    public static SubLObject cb_reinforce_rule(final SubLObject args) {
        final SubLObject assertion = cb_utilities.cb_guess_assertion(args);
        if (cb_assertion_editor.NIL != assertions_high.rule_assertionP(assertion)) {
            reinforce_rule(assertion, (SubLObject)cb_assertion_editor.UNPROVIDED);
            return cb_assertion_browser.cb_af(args);
        }
        return cb_utilities.cb_error((SubLObject)cb_assertion_editor.$str521$_a_does_not_specify_a_rule, args, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 93436L)
    public static SubLObject cb_link_reinforce_rule(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_assertion_editor.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (cb_assertion_editor.NIL == linktext) {
            linktext = (SubLObject)cb_assertion_editor.$str523$_Reinforce_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw83$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str524$cb_reinforce_rule__a, assertion_handles.assertion_id(assertion));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        if (cb_assertion_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 93740L)
    public static SubLObject reinforce_rule(final SubLObject rule, SubLObject n) {
        if (n == cb_assertion_editor.UNPROVIDED) {
            n = (SubLObject)cb_assertion_editor.$int526$100;
        }
        inference_analysis.increment_transformation_rule_considered_count(rule, (SubLObject)cb_assertion_editor.T, n, (SubLObject)cb_assertion_editor.UNPROVIDED);
        inference_analysis.increment_transformation_rule_success_count(rule, (SubLObject)cb_assertion_editor.T, n, (SubLObject)cb_assertion_editor.UNPROVIDED);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 97147L)
    public static SubLObject cb_strength_and_direction_section(final SubLObject strength, final SubLObject direction, SubLObject display_options) {
        if (display_options == cb_assertion_editor.UNPROVIDED) {
            display_options = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = display_options;
        final SubLObject edit_only_tail = cdestructuring_bind.property_list_member((SubLObject)cb_assertion_editor.$kw337$EDIT_ONLY, current);
        final SubLObject edit_only = (SubLObject)((cb_assertion_editor.NIL != edit_only_tail) ? conses_high.cadr(edit_only_tail) : cb_assertion_editor.NIL);
        final SubLObject strength_input_name_tail = cdestructuring_bind.property_list_member((SubLObject)cb_assertion_editor.$kw527$STRENGTH_INPUT_NAME, current);
        final SubLObject strength_input_name = (cb_assertion_editor.NIL != strength_input_name_tail) ? conses_high.cadr(strength_input_name_tail) : cb_assertion_editor.$cb_strength_input_default_name$.getGlobalValue();
        final SubLObject direction_input_name_tail = cdestructuring_bind.property_list_member((SubLObject)cb_assertion_editor.$kw528$DIRECTION_INPUT_NAME, current);
        final SubLObject direction_input_name = (cb_assertion_editor.NIL != direction_input_name_tail) ? conses_high.cadr(direction_input_name_tail) : cb_assertion_editor.$cb_direction_input_default_name$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_assertion_editor.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_assertion_editor.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str529$Strength__);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$148, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                    if (cb_assertion_editor.NIL != edit_only) {
                        html_utilities.html_glyph((SubLObject)cb_assertion_editor.$kw398$NBSP, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        cb_utilities.cb_show_strength(strength);
                        html_utilities.html_hidden_input(strength_input_name, strength, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                    }
                    else {
                        html_utilities.html_markup(html_macros.$html_label_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_label_for$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_assertion_editor.$str530$_default_strength));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_radio_input(strength_input_name, (SubLObject)cb_assertion_editor.$str164$_default, Equality.eq(strength, (SubLObject)cb_assertion_editor.$kw165$DEFAULT), (SubLObject)cb_assertion_editor.$str530$_default_strength);
                            html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str166$Default);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_label_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_label_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_label_for$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_assertion_editor.$str531$_monotonic_strength));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_radio_input(strength_input_name, (SubLObject)cb_assertion_editor.$str167$_monotonic, Equality.eq(strength, (SubLObject)cb_assertion_editor.$kw168$MONOTONIC), (SubLObject)cb_assertion_editor.$str531$_monotonic_strength);
                            html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str169$Monotonic);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_label_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                        html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$152 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_assertion_editor.$str532$Direction__);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$152, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                    if (cb_assertion_editor.NIL != edit_only) {
                        html_utilities.html_glyph((SubLObject)cb_assertion_editor.$kw398$NBSP, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        cb_utilities.cb_show_direction(direction);
                        html_utilities.html_hidden_input(direction_input_name, direction, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                    }
                    else {
                        html_utilities.html_markup(html_macros.$html_label_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_label_for$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_assertion_editor.$str186$_backward));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_radio_input(direction_input_name, (SubLObject)cb_assertion_editor.$str186$_backward, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$str186$_backward);
                            html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str188$Backward);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_label_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_label_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_label_for$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color((SubLObject)cb_assertion_editor.$str189$_forward));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_radio_input(direction_input_name, (SubLObject)cb_assertion_editor.$str189$_forward, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$str189$_forward);
                            html_utilities.html_indent((SubLObject)cb_assertion_editor.ONE_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str191$Forward);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_label_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                        html_utilities.html_indent((SubLObject)cb_assertion_editor.TWO_INTEGER);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$147, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 99155L)
    public static SubLObject cb_extract_strength_and_direction_input(final SubLObject args, SubLObject input_options) {
        if (input_options == cb_assertion_editor.UNPROVIDED) {
            input_options = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLObject current;
        final SubLObject datum = current = input_options;
        final SubLObject strength_input_name_tail = cdestructuring_bind.property_list_member((SubLObject)cb_assertion_editor.$kw527$STRENGTH_INPUT_NAME, current);
        final SubLObject strength_input_name = (cb_assertion_editor.NIL != strength_input_name_tail) ? conses_high.cadr(strength_input_name_tail) : cb_assertion_editor.$cb_strength_input_default_name$.getGlobalValue();
        final SubLObject direction_input_name_tail = cdestructuring_bind.property_list_member((SubLObject)cb_assertion_editor.$kw528$DIRECTION_INPUT_NAME, current);
        final SubLObject direction_input_name = (cb_assertion_editor.NIL != direction_input_name_tail) ? conses_high.cadr(direction_input_name_tail) : cb_assertion_editor.$cb_direction_input_default_name$.getGlobalValue();
        final SubLObject strength_string = html_utilities.html_extract_input(strength_input_name, args);
        final SubLObject direction_string = html_utilities.html_extract_input(direction_input_name, args);
        SubLObject strength = (SubLObject)cb_assertion_editor.NIL;
        SubLObject direction = (SubLObject)cb_assertion_editor.NIL;
        if (strength_string.isString()) {
            strength = reader.read_from_string_ignoring_errors(strength_string, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        if (direction_string.isString()) {
            direction = reader.read_from_string_ignoring_errors(direction_string, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        return Values.values(strength, direction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
    public static SubLObject cb_link_assertion_graph(final SubLObject assertion, SubLObject linktext) {
        if (linktext == cb_assertion_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_assertion_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_assertion_editor.NIL == linktext) {
            linktext = Sequences.cconcatenate((SubLObject)cb_assertion_editor.$str533$_, new SubLObject[] { cb_assertion_graph_type_string(assertion), cb_assertion_editor.$str534$_ });
        }
        if (cb_assertion_editor.NIL != cb_assertion_check_graph(assertion)) {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_assertion_editor.$kw535$CONTENT);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_assertion_editor.$str536$cb_assertion_graph__A, assertion_handles.assertion_id(assertion));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            if (cb_assertion_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
    public static SubLObject cb_assertion_graph(final SubLObject args) {
        final SubLObject assertion = cb_utilities.cb_guess_assertion(args.first());
        if (cb_assertion_editor.NIL != assertion_handles.assertion_p(assertion)) {
            cb_assertion_graph_internal(assertion);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
    public static SubLObject cb_assertion_graph_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var;
        final SubLObject title = title_var = (SubLObject)cb_assertion_editor.$str540$Graph_of_an_assertion;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_assertion_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED, (SubLObject)cb_assertion_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str44$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_assertion_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_assertion_editor.$str45$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$156 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_assertion_editor.$kw46$UNINITIALIZED) ? ConsesLow.list(cb_assertion_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_assertion_editor.$kw47$CB_CYC);
                if (cb_assertion_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.html_basic_cb_scripts();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$157 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_assertion_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_assertion_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_assertion_editor.$str50$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_assertion_editor.$str51$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_assertion_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str52$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str53$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_assertion_editor.$str541$Refresh);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_assertion_editor.$str542$reloadCurrentFrame__reloadFrameBu);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_assertion_editor.UNPROVIDED);
                            if (cb_assertion_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_assertion_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_assertion_editor.$str543$Graph_for_);
                        html_utilities.html_newline((SubLObject)cb_assertion_editor.UNPROVIDED);
                        cb_utilities.cb_form(assertion, (SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.T);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        cb_assertion_print_graph(assertion);
                        html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$157, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$156, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_assertion_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
    public static SubLObject cb_assertion_graph_type_string(final SubLObject assertion) {
        if (cb_assertion_editor.NIL != assertions_high.rule_assertionP(assertion)) {
            return (SubLObject)cb_assertion_editor.$str544$Rule_Graph;
        }
        return (SubLObject)cb_assertion_editor.$str545$Unknown_Graph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
    public static SubLObject cb_assertion_print_graph(final SubLObject assertion) {
        if (cb_assertion_editor.NIL != assertions_high.rule_assertionP(assertion)) {
            cb_assertion_print_graph_of_rule(assertion);
        }
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
    public static SubLObject cb_assertion_check_graph(final SubLObject assertion) {
        return assertions_high.rule_assertionP(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-assertion-editor.lisp", position = 104921L)
    public static SubLObject cb_assertion_print_graph_of_rule(final SubLObject assertion) {
        html_utilities.html_newline((SubLObject)cb_assertion_editor.TWO_INTEGER);
        final SubLObject signature = PrintLow.format((SubLObject)cb_assertion_editor.NIL, (SubLObject)cb_assertion_editor.$str546$_a, random.random(Numbers.expt((SubLObject)cb_assertion_editor.TWO_INTEGER, (SubLObject)cb_assertion_editor.$int547$30)));
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        blue_grapher_utilities.blue_event(signature, (SubLObject)ConsesLow.list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw548$BUILDER_FN, (SubLObject)cb_assertion_editor.$sym549$BBF_RULE, (SubLObject)cb_assertion_editor.$kw550$ASSERTIONS, (SubLObject)ConsesLow.list(assertion), (SubLObject)cb_assertion_editor.$kw23$MT, mt)));
        cb_blue_grapher.cb_blue_applet((SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$kw351$WIDTH, (SubLObject)cb_assertion_editor.$int551$800, (SubLObject)cb_assertion_editor.$kw350$HEIGHT, (SubLObject)cb_assertion_editor.$int552$600, (SubLObject)cb_assertion_editor.$kw553$SIGNATURE, signature));
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    public static SubLObject declare_cb_assertion_editor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_change_mt_hook", "CB-CHANGE-MT-HOOK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_change_strength_hook", "CB-CHANGE-STRENGTH-HOOK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_change_direction_hook", "CB-CHANGE-DIRECTION-HOOK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_repropagate_hook", "CB-REPROPAGATE-HOOK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_repropagate_browsably_hook", "CB-REPROPAGATE-BROWSABLY-HOOK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_recanonicalize_hook", "CB-RECANONICALIZE-HOOK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_rename_variables_hook", "CB-RENAME-VARIABLES-HOOK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_edit_assertion_hook", "CB-EDIT-ASSERTION-HOOK", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_null_edit_assertion_hook", "CB-NULL-EDIT-ASSERTION-HOOK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_edit_assertion_strings_hook", "CB-EDIT-ASSERTION-STRINGS-HOOK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_spec_print_function_trampoline", "CB-ASSERTION-SPEC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_spec_p", "CB-ASSERTION-SPEC-P", 1, 0, false);
        new $cb_assertion_spec_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "assertion_spec_sentence", "ASSERTION-SPEC-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "assertion_spec_mt", "ASSERTION-SPEC-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "assertion_spec_strength", "ASSERTION-SPEC-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "assertion_spec_direction", "ASSERTION-SPEC-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "assertion_spec_unasserts", "ASSERTION-SPEC-UNASSERTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "assertion_spec_metas", "ASSERTION-SPEC-METAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "_csetf_assertion_spec_sentence", "_CSETF-ASSERTION-SPEC-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "_csetf_assertion_spec_mt", "_CSETF-ASSERTION-SPEC-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "_csetf_assertion_spec_strength", "_CSETF-ASSERTION-SPEC-STRENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "_csetf_assertion_spec_direction", "_CSETF-ASSERTION-SPEC-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "_csetf_assertion_spec_unasserts", "_CSETF-ASSERTION-SPEC-UNASSERTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "_csetf_assertion_spec_metas", "_CSETF-ASSERTION-SPEC-METAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "make_cb_assertion_spec", "MAKE-CB-ASSERTION-SPEC", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "visit_defstruct_cb_assertion_spec", "VISIT-DEFSTRUCT-CB-ASSERTION-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "visit_defstruct_object_cb_assertion_spec_method", "VISIT-DEFSTRUCT-OBJECT-CB-ASSERTION-SPEC-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "new_cb_assertion_spec", "NEW-CB-ASSERTION-SPEC", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "ke_assert_assertion_spec", "KE-ASSERT-ASSERTION-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_note_edit_change", "CB-NOTE-EDIT-CHANGE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_attempt_to_repair_and_assert", "CB-ATTEMPT-TO-REPAIR-AND-ASSERT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_explain_why_not_wff", "CB-EXPLAIN-WHY-NOT-WFF", 2, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_wff_repair_advice", "CB-WFF-REPAIR-ADVICE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_wff_repair_advise_assertion_creation", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_wff_repair_advise_assertion_creation_or_lift", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "assertions_in_spec_mts_among", "ASSERTIONS-IN-SPEC-MTS-AMONG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_wff_repair_advise_assertion_creation_or_lift_to_min_ceiling_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-CREATION-OR-LIFT-TO-MIN-CEILING-MT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_wff_repair_advise_assertion_lift_from_spec_mt", "CB-WFF-REPAIR-ADVISE-ASSERTION-LIFT-FROM-SPEC-MT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_repair_and_reattempt", "CB-LINK-REPAIR-AND-REATTEMPT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_repair_and_reattempt", "CB-REPAIR-AND-REATTEMPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_toolbar", "CB-ASSERTION-TOOLBAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "assertion_modification_permittedP", "ASSERTION-MODIFICATION-PERMITTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_disabled_link", "CB-DISABLED-LINK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_change_mt", "CB-CHANGE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_change_all_meta_assertions_mt_check", "CB-CHANGE-ALL-META-ASSERTIONS-MT-CHECK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_change_mt", "CB-HANDLE-CHANGE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_change_mt", "CB-LINK-CHANGE-MT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_change_strength", "CB-CHANGE-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_change_strength", "CB-HANDLE-CHANGE-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_change_strength", "CB-LINK-CHANGE-STRENGTH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_change_direction", "CB-CHANGE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_change_direction", "CB-HANDLE-CHANGE-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_change_direction", "CB-LINK-CHANGE-DIRECTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_change_meta_assertion_mt", "CB-CHANGE-META-ASSERTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_change_meta_assertion_mt", "CB-HANDLE-CHANGE-META-ASSERTION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_change_meta_assertion_mt", "CB-LINK-CHANGE-META-ASSERTION-MT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_rename_variables", "CB-RENAME-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_rename_variables", "CB-HANDLE-RENAME-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_extract_variables_from_args", "CB-EXTRACT-VARIABLES-FROM-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_show_invalid_variables_message", "CB-SHOW-INVALID-VARIABLES-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_rename_variables", "CB-LINK-RENAME-VARIABLES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_repropagate", "CB-REPROPAGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_repropagate", "CB-LINK-REPROPAGATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_repropagate_browsably", "CB-REPROPAGATE-BROWSABLY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_repropagate_browsably", "CB-LINK-REPROPAGATE-BROWSABLY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_recanonicalize", "CB-RECANONICALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_recanonicalize", "CB-LINK-RECANONICALIZE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_wff", "CB-WFF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_wff", "CB-LINK-WFF", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_wff", "CB-HANDLE-WFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_wff_check_formula", "CB-WFF-CHECK-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_wff_check_formula_ok", "CB-WFF-CHECK-FORMULA-OK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assert", "CB-ASSERT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_assert", "CB-HANDLE-ASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_extract_some_assert_arguments", "CB-EXTRACT-SOME-ASSERT-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_assert", "CB-LINK-ASSERT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assert_internal", "CB-ASSERT-INTERNAL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assert_sentence_constant_suggestions", "CB-ASSERT-SENTENCE-CONSTANT-SUGGESTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_extract_values_for_assert", "CB-EXTRACT-VALUES-FOR-ASSERT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_tabulate_checkable_meta_assertions", "CB-TABULATE-CHECKABLE-META-ASSERTIONS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_show_meta_assertion_readably", "CB-SHOW-META-ASSERTION-READABLY", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_extract_mt_from_string", "CB-EXTRACT-MT-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_valid_microtheoryP", "CB-VALID-MICROTHEORY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_extract_formula_from_string", "CB-EXTRACT-FORMULA-FROM-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_wff_check_sentence_int", "CB-WFF-CHECK-SENTENCE-INT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assert_formula", "CB-ASSERT-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_assert_formula", "CB-LINK-ASSERT-FORMULA", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_similar", "CB-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_assert_similar", "CB-LINK-ASSERT-SIMILAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assert_meta", "CB-ASSERT-META", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_assert_meta", "CB-HANDLE-ASSERT-META", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_assert_meta", "CB-LINK-ASSERT-META", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_suggest_pragmas", "CB-SUGGEST-PRAGMAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_suggest_pragmas", "CB-LINK-SUGGEST-PRAGMAS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_suggest_pragmas_guts", "CB-SUGGEST-PRAGMAS-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_assert_suggested_pragma", "CB-LINK-ASSERT-SUGGESTED-PRAGMA", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assert_suggested_pragma", "CB-ASSERT-SUGGESTED-PRAGMA", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_assertion_editor", "without_arg_format_and_relator_checking", "WITHOUT-ARG-FORMAT-AND-RELATOR-CHECKING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_edit", "CB-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_edit", "CB-HANDLE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_extract_meta_assertions_from_args", "CB-EXTRACT-META-ASSERTIONS-FROM-ARGS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_edit_assertion", "CB-LINK-EDIT-ASSERTION", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_edit_assertion", "CB-HANDLE-EDIT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_sentence_edit", "CB-HANDLE-SENTENCE-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_sentence_edit_int", "CB-HANDLE-SENTENCE-EDIT-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_fix_typo_edit", "CB-FIX-TYPO-EDIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_fix_typo", "CB-LINK-FIX-TYPO", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_handle_fix_typo", "CB-HANDLE-FIX-TYPO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_fix_typo_assertionP", "CB-FIX-TYPO-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_reassert", "CB-REASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_reassert", "CB-LINK-REASSERT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_unassert", "CB-UNASSERT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_unassert", "CB-LINK-UNASSERT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_blast", "CB-BLAST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_blast", "CB-LINK-BLAST", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_remove_deduction", "CB-REMOVE-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_remove_deduction", "CB-LINK-REMOVE-DEDUCTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_tms", "CB-ASSERTION-TMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_assert_tms", "CB-LINK-ASSERT-TMS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_diagnose_assertion", "CB-DIAGNOSE-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_diagnose_assertion_int", "CB-DIAGNOSE-ASSERTION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_diagnose_assertion", "CB-LINK-DIAGNOSE-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_trigger_test", "CB-LINK-TRIGGER-TEST", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_trigger_test_id_strings", "CB-TRIGGER-TEST-ID-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_extract_trigger_test_args", "CB-EXTRACT-TRIGGER-TEST-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_trigger_test", "CB-TRIGGER-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_trigger_test_support_and_rule", "CB-TRIGGER-TEST-SUPPORT-AND-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_trigger_test_support", "CB-TRIGGER-TEST-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_trigger_test_rule", "CB-TRIGGER-TEST-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_trigger_test_unspecified", "CB-TRIGGER-TEST-UNSPECIFIED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_proof_checker_rules", "CB-PROOF-CHECKER-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_add_to_proof_checker_rules", "CB-ADD-TO-PROOF-CHECKER-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_delete_from_proof_checker_rules", "CB-DELETE-FROM-PROOF-CHECKER-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_delete_all_proof_checker_rules", "CB-DELETE-ALL-PROOF-CHECKER-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_use_in_proof", "CB-USE-IN-PROOF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_use_in_proof", "CB-LINK-USE-IN-PROOF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_reinforce_rule", "CB-REINFORCE-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_reinforce_rule", "CB-LINK-REINFORCE-RULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "reinforce_rule", "REINFORCE-RULE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_strength_and_direction_section", "CB-STRENGTH-AND-DIRECTION-SECTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_extract_strength_and_direction_input", "CB-EXTRACT-STRENGTH-AND-DIRECTION-INPUT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_link_assertion_graph", "CB-LINK-ASSERTION-GRAPH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_graph", "CB-ASSERTION-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_graph_internal", "CB-ASSERTION-GRAPH-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_graph_type_string", "CB-ASSERTION-GRAPH-TYPE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_print_graph", "CB-ASSERTION-PRINT-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_check_graph", "CB-ASSERTION-CHECK-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_assertion_editor", "cb_assertion_print_graph_of_rule", "CB-ASSERTION-PRINT-GRAPH-OF-RULE", 1, 0, false);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    public static SubLObject init_cb_assertion_editor_file() {
        cb_assertion_editor.$dtp_cb_assertion_spec$ = SubLFiles.defconstant("*DTP-CB-ASSERTION-SPEC*", (SubLObject)cb_assertion_editor.$sym1$CB_ASSERTION_SPEC);
        cb_assertion_editor.$cb_assert_modes_table$ = SubLFiles.defparameter("*CB-ASSERT-MODES-TABLE*", (SubLObject)cb_assertion_editor.$list296);
        cb_assertion_editor.$cb_proof_checker_rules$ = SubLFiles.defparameter("*CB-PROOF-CHECKER-RULES*", (SubLObject)cb_assertion_editor.NIL);
        cb_assertion_editor.$cb_strength_input_default_name$ = SubLFiles.deflexical("*CB-STRENGTH-INPUT-DEFAULT-NAME*", (SubLObject)cb_assertion_editor.$str163$strength);
        cb_assertion_editor.$cb_direction_input_default_name$ = SubLFiles.deflexical("*CB-DIRECTION-INPUT-DEFAULT-NAME*", (SubLObject)cb_assertion_editor.$str185$direction);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    public static SubLObject setup_cb_assertion_editor_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_assertion_editor.$dtp_cb_assertion_spec$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym8$CB_ASSERTION_SPEC_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_assertion_editor.$list9);
        Structures.def_csetf((SubLObject)cb_assertion_editor.$sym10$ASSERTION_SPEC_SENTENCE, (SubLObject)cb_assertion_editor.$sym11$_CSETF_ASSERTION_SPEC_SENTENCE);
        Structures.def_csetf((SubLObject)cb_assertion_editor.$sym12$ASSERTION_SPEC_MT, (SubLObject)cb_assertion_editor.$sym13$_CSETF_ASSERTION_SPEC_MT);
        Structures.def_csetf((SubLObject)cb_assertion_editor.$sym14$ASSERTION_SPEC_STRENGTH, (SubLObject)cb_assertion_editor.$sym15$_CSETF_ASSERTION_SPEC_STRENGTH);
        Structures.def_csetf((SubLObject)cb_assertion_editor.$sym16$ASSERTION_SPEC_DIRECTION, (SubLObject)cb_assertion_editor.$sym17$_CSETF_ASSERTION_SPEC_DIRECTION);
        Structures.def_csetf((SubLObject)cb_assertion_editor.$sym18$ASSERTION_SPEC_UNASSERTS, (SubLObject)cb_assertion_editor.$sym19$_CSETF_ASSERTION_SPEC_UNASSERTS);
        Structures.def_csetf((SubLObject)cb_assertion_editor.$sym20$ASSERTION_SPEC_METAS, (SubLObject)cb_assertion_editor.$sym21$_CSETF_ASSERTION_SPEC_METAS);
        Equality.identity((SubLObject)cb_assertion_editor.$sym1$CB_ASSERTION_SPEC);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_assertion_editor.$dtp_cb_assertion_spec$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_assertion_editor.$sym33$VISIT_DEFSTRUCT_OBJECT_CB_ASSERTION_SPEC_METHOD));
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw37$CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str38$cb_wff_check_formula_html, (SubLObject)cb_assertion_editor.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw69$REPAIR_AND_REATTEMPT, (SubLObject)cb_assertion_editor.$sym85$CB_LINK_REPAIR_AND_REATTEMPT, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym89$CB_REPAIR_AND_REATTEMPT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw91$CB_AF, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str92$cb_af_html, (SubLObject)cb_assertion_editor.NIL));
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw131$CB_CHANGE_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str132$cb_change_mt_html, (SubLObject)cb_assertion_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym145$CB_CHANGE_MT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym153$CB_HANDLE_CHANGE_MT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw97$CHANGE_MT, (SubLObject)cb_assertion_editor.$sym156$CB_LINK_CHANGE_MT, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw157$CB_CHANGE_STRENGTH, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str158$cb_change_strength_html, (SubLObject)cb_assertion_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym171$CB_CHANGE_STRENGTH, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym175$CB_HANDLE_CHANGE_STRENGTH, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw98$CHANGE_STRENGTH, (SubLObject)cb_assertion_editor.$sym178$CB_LINK_CHANGE_STRENGTH, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw179$CB_CHANGE_DIRECTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str180$cb_change_direction_html, (SubLObject)cb_assertion_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym193$CB_CHANGE_DIRECTION, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym200$CB_HANDLE_CHANGE_DIRECTION, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw99$CHANGE_DIRECTION, (SubLObject)cb_assertion_editor.$sym203$CB_LINK_CHANGE_DIRECTION, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw204$CB_CHANGE_META_ASSERTION_MT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str205$cb_change_meta_assertion_mt_html, (SubLObject)cb_assertion_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym211$CB_CHANGE_META_ASSERTION_MT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym212$CB_HANDLE_CHANGE_META_ASSERTION_MT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw100$CHANGE_META_ASSERTION_MT, (SubLObject)cb_assertion_editor.$sym215$CB_LINK_CHANGE_META_ASSERTION_MT, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw216$CB_RENAME_VARIABLES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str217$cb_rename_variables_html, (SubLObject)cb_assertion_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym232$CB_RENAME_VARIABLES, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym240$CB_HANDLE_RENAME_VARIABLES, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw101$RENAME_VARIABLES, (SubLObject)cb_assertion_editor.$sym254$CB_LINK_RENAME_VARIABLES, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym258$CB_REPROPAGATE, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw124$REPROPAGATE, (SubLObject)cb_assertion_editor.$sym261$CB_LINK_REPROPAGATE, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym264$CB_REPROPAGATE_BROWSABLY, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw125$REPROPAGATE_BROWSABLY, (SubLObject)cb_assertion_editor.$sym267$CB_LINK_REPROPAGATE_BROWSABLY, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym272$CB_RECANONICALIZE, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw123$RECANONICALIZE, (SubLObject)cb_assertion_editor.$sym275$CB_LINK_RECANONICALIZE, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw276$CB_WFF, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str277$cb_wff_html, (SubLObject)cb_assertion_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym283$CB_WFF, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw287$WFF, (SubLObject)cb_assertion_editor.$sym288$CB_LINK_WFF, (SubLObject)cb_assertion_editor.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_assertion_editor.$kw287$WFF, (SubLObject)cb_assertion_editor.$str284$WFF_Check, (SubLObject)cb_assertion_editor.$str289$WFF, (SubLObject)cb_assertion_editor.$str290$Check_a_CycL_Expression_for_well_);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym291$CB_HANDLE_WFF, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw37$CB_WFF_CHECK_FORMULA, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str38$cb_wff_check_formula_html, (SubLObject)cb_assertion_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym297$CB_ASSERT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym305$CB_HANDLE_ASSERT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw306$ASSERT, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str307$assert_tool_gif, (SubLObject)cb_assertion_editor.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw306$ASSERT, (SubLObject)cb_assertion_editor.$sym310$CB_LINK_ASSERT, (SubLObject)cb_assertion_editor.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_assertion_editor.$kw306$ASSERT, (SubLObject)cb_assertion_editor.$str308$Assert, (SubLObject)cb_assertion_editor.$str311$Asrt, (SubLObject)cb_assertion_editor.$str312$Assert_CycL_Expression);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw313$CB_ASSERT_INTERNAL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str314$cb_assert_internal_html, (SubLObject)cb_assertion_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym370$CB_ASSERT_FORMULA, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw374$ASSERT_FORMULA, (SubLObject)cb_assertion_editor.$sym375$CB_LINK_ASSERT_FORMULA, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym376$CB_SIMILAR, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw102$ASSERT_SIMILAR, (SubLObject)cb_assertion_editor.$sym379$CB_LINK_ASSERT_SIMILAR, (SubLObject)cb_assertion_editor.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym380$CB_ASSERT_META, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym384$CB_HANDLE_ASSERT_META, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw103$ASSERT_META, (SubLObject)cb_assertion_editor.$sym387$CB_LINK_ASSERT_META, (SubLObject)cb_assertion_editor.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym388$CB_SUGGEST_PRAGMAS, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw104$SUGGEST_PRAGMAS, (SubLObject)cb_assertion_editor.$sym391$CB_LINK_SUGGEST_PRAGMAS, (SubLObject)cb_assertion_editor.FOUR_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw396$ASSERT_SUGGESTED_PRAGMA, (SubLObject)cb_assertion_editor.$sym400$CB_LINK_ASSERT_SUGGESTED_PRAGMA, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym402$CB_ASSERT_SUGGESTED_PRAGMA, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym405$CB_EDIT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym407$CB_HANDLE_EDIT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw106$EDIT_ASSERTION, (SubLObject)cb_assertion_editor.$sym411$CB_LINK_EDIT_ASSERTION, (SubLObject)cb_assertion_editor.FOUR_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym429$CB_HANDLE_EDIT_ASSERTION, (SubLObject)cb_assertion_editor.$kw430$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym432$CB_HANDLE_SENTENCE_EDIT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym434$CB_FIX_TYPO_EDIT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw105$FIX_TYPO, (SubLObject)cb_assertion_editor.$sym437$CB_LINK_FIX_TYPO, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym440$CB_HANDLE_FIX_TYPO, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym442$CB_REASSERT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw107$REASSERT, (SubLObject)cb_assertion_editor.$sym445$CB_LINK_REASSERT, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym447$CB_UNASSERT, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw108$UNASSERT, (SubLObject)cb_assertion_editor.$sym450$CB_LINK_UNASSERT, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym452$CB_BLAST, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw109$BLAST, (SubLObject)cb_assertion_editor.$sym455$CB_LINK_BLAST, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym459$CB_REMOVE_DEDUCTION, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw462$REMOVE_DEDUCTION, (SubLObject)cb_assertion_editor.$sym463$CB_LINK_REMOVE_DEDUCTION, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym465$CB_ASSERTION_TMS, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw120$ASSERT_TMS, (SubLObject)cb_assertion_editor.$sym468$CB_LINK_ASSERT_TMS, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_assertion_editor.$kw469$CB_DIAGNOSE_ASSERTION, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_assertion_editor.$str470$cb_diagnose_assertion_html, (SubLObject)cb_assertion_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym475$CB_DIAGNOSE_ASSERTION, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw478$DIAGNOSE_ASSERTION, (SubLObject)cb_assertion_editor.$sym479$CB_LINK_DIAGNOSE_ASSERTION, (SubLObject)cb_assertion_editor.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw117$TRIGGER_TEST, (SubLObject)cb_assertion_editor.$sym485$CB_LINK_TRIGGER_TEST, (SubLObject)cb_assertion_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym488$CB_TRIGGER_TEST, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        utilities_macros.register_html_state_variable((SubLObject)cb_assertion_editor.$sym512$_CB_PROOF_CHECKER_RULES_);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym516$CB_USE_IN_PROOF, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw127$USE_IN_PROOF, (SubLObject)cb_assertion_editor.$sym520$CB_LINK_USE_IN_PROOF, (SubLObject)cb_assertion_editor.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym522$CB_REINFORCE_RULE, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw129$REINFORCE_RULE, (SubLObject)cb_assertion_editor.$sym525$CB_LINK_REINFORCE_RULE, (SubLObject)cb_assertion_editor.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_assertion_editor.$kw537$ASSERTION_GRAPH, (SubLObject)cb_assertion_editor.$sym538$CB_LINK_ASSERTION_GRAPH, (SubLObject)cb_assertion_editor.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_assertion_editor.$sym539$CB_ASSERTION_GRAPH, (SubLObject)cb_assertion_editor.$kw90$HTML_HANDLER);
        return (SubLObject)cb_assertion_editor.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_assertion_editor_file();
    }
    
    public void initializeVariables() {
        init_cb_assertion_editor_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_assertion_editor_file();
    }
    
    static {
        me = (SubLFile)new cb_assertion_editor();
        cb_assertion_editor.$dtp_cb_assertion_spec$ = null;
        cb_assertion_editor.$cb_assert_modes_table$ = null;
        cb_assertion_editor.$cb_proof_checker_rules$ = null;
        cb_assertion_editor.$cb_strength_input_default_name$ = null;
        cb_assertion_editor.$cb_direction_input_default_name$ = null;
        $sym0$CB_NOTE_NEW_FORWARD_INFERENCE_FOR_BROWSING = SubLObjectFactory.makeSymbol("CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING");
        $sym1$CB_ASSERTION_SPEC = SubLObjectFactory.makeSymbol("CB-ASSERTION-SPEC");
        $sym2$CB_ASSERTION_SPEC_P = SubLObjectFactory.makeSymbol("CB-ASSERTION-SPEC-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("UNASSERTS"), (SubLObject)SubLObjectFactory.makeSymbol("METAS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENTENCE"), (SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("UNASSERTS"), (SubLObject)SubLObjectFactory.makeKeyword("METAS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-SPEC-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-SPEC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-SPEC-STRENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-SPEC-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-SPEC-UNASSERTS"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-SPEC-METAS"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-STRENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-UNASSERTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-METAS"));
        $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym8$CB_ASSERTION_SPEC_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CB-ASSERTION-SPEC-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CB-ASSERTION-SPEC-P"));
        $sym10$ASSERTION_SPEC_SENTENCE = SubLObjectFactory.makeSymbol("ASSERTION-SPEC-SENTENCE");
        $sym11$_CSETF_ASSERTION_SPEC_SENTENCE = SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-SENTENCE");
        $sym12$ASSERTION_SPEC_MT = SubLObjectFactory.makeSymbol("ASSERTION-SPEC-MT");
        $sym13$_CSETF_ASSERTION_SPEC_MT = SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-MT");
        $sym14$ASSERTION_SPEC_STRENGTH = SubLObjectFactory.makeSymbol("ASSERTION-SPEC-STRENGTH");
        $sym15$_CSETF_ASSERTION_SPEC_STRENGTH = SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-STRENGTH");
        $sym16$ASSERTION_SPEC_DIRECTION = SubLObjectFactory.makeSymbol("ASSERTION-SPEC-DIRECTION");
        $sym17$_CSETF_ASSERTION_SPEC_DIRECTION = SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-DIRECTION");
        $sym18$ASSERTION_SPEC_UNASSERTS = SubLObjectFactory.makeSymbol("ASSERTION-SPEC-UNASSERTS");
        $sym19$_CSETF_ASSERTION_SPEC_UNASSERTS = SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-UNASSERTS");
        $sym20$ASSERTION_SPEC_METAS = SubLObjectFactory.makeSymbol("ASSERTION-SPEC-METAS");
        $sym21$_CSETF_ASSERTION_SPEC_METAS = SubLObjectFactory.makeSymbol("_CSETF-ASSERTION-SPEC-METAS");
        $kw22$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $kw23$MT = SubLObjectFactory.makeKeyword("MT");
        $kw24$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $kw25$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw26$UNASSERTS = SubLObjectFactory.makeKeyword("UNASSERTS");
        $kw27$METAS = SubLObjectFactory.makeKeyword("METAS");
        $str28$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw29$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym30$MAKE_CB_ASSERTION_SPEC = SubLObjectFactory.makeSymbol("MAKE-CB-ASSERTION-SPEC");
        $kw31$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw32$END = SubLObjectFactory.makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_CB_ASSERTION_SPEC_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CB-ASSERTION-SPEC-METHOD");
        $int34$2000 = SubLObjectFactory.makeInteger(2000);
        $str35$_a_operation_was_added_to_queue = SubLObjectFactory.makeString("~a operation was added to queue");
        $str36$_a_operation_completed = SubLObjectFactory.makeString("~a operation completed");
        $kw37$CB_WFF_CHECK_FORMULA = SubLObjectFactory.makeKeyword("CB-WFF-CHECK-FORMULA");
        $str38$cb_wff_check_formula_html = SubLObjectFactory.makeString("cb-wff-check-formula.html");
        $sym39$STACK_P = SubLObjectFactory.makeSymbol("STACK-P");
        $kw40$IO_MODE = SubLObjectFactory.makeKeyword("IO-MODE");
        $kw41$NL = SubLObjectFactory.makeKeyword("NL");
        $kw42$VIOLATIONS = SubLObjectFactory.makeKeyword("VIOLATIONS");
        $str43$Sentence_not_Well_Formed = SubLObjectFactory.makeString("Sentence not Well-Formed");
        $str44$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str45$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw46$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw47$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw48$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw49$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str50$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str51$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str52$button = SubLObjectFactory.makeString("button");
        $str53$reload = SubLObjectFactory.makeString("reload");
        $str54$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str55$Mt___ = SubLObjectFactory.makeString("Mt : ");
        $str56$Sentence___ = SubLObjectFactory.makeString("Sentence : ");
        $str57$Repairs___ = SubLObjectFactory.makeString("Repairs : ");
        $str58$No_repairs_available___Could_not_ = SubLObjectFactory.makeString("No repairs available.  Could not determine any way to make the above sentence well-formed by adding new knowledge.");
        $str59$Explanation__ = SubLObjectFactory.makeString("Explanation :");
        $str60$wff_explain = SubLObjectFactory.makeString("wff-explain");
        $str61$Stack_of_pending_assertions_depen = SubLObjectFactory.makeString("Stack of pending assertions depending on this one :");
        $str62$__in_ = SubLObjectFactory.makeString("  in ");
        $sym63$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const64$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym65$ASSERTED_ASSERTION_ = SubLObjectFactory.makeSymbol("ASSERTED-ASSERTION?");
        $str66$The_fact_ = SubLObjectFactory.makeString("The fact ");
        $str67$_must_be_added_to_ = SubLObjectFactory.makeString(" must be added to ");
        $str68$_in_order_for_the_above_sentence_ = SubLObjectFactory.makeString(" in order for the above sentence to be well-formed.");
        $kw69$REPAIR_AND_REATTEMPT = SubLObjectFactory.makeKeyword("REPAIR-AND-REATTEMPT");
        $sym70$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $sym71$GENERALITY_ESTIMATE = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE");
        $str72$That_fact_is_already_asserted_in_ = SubLObjectFactory.makeString("That fact is already asserted in ");
        $str73$_ = SubLObjectFactory.makeString(".");
        $str74$You_can_repair_this_by_doing_eith = SubLObjectFactory.makeString("You can repair this by doing either of the following:");
        $str75$1__Lifting_the_assertion_to_ = SubLObjectFactory.makeString("1) Lifting the assertion to ");
        $str76$2__Asserting_it_in_ = SubLObjectFactory.makeString("2) Asserting it in ");
        $str77$_as_well = SubLObjectFactory.makeString(" as well");
        $str78$You_can_repair_this_by_doing_the_ = SubLObjectFactory.makeString("You can repair this by doing the following:");
        $str79$Asserting_it_in_ = SubLObjectFactory.makeString("Asserting it in ");
        $str80$_must_be_lifted_to_ = SubLObjectFactory.makeString(" must be lifted to ");
        $str81$It_is_currently_asserted_in_the_f = SubLObjectFactory.makeString("It is currently asserted in the following spec Mts:");
        $str82$_Make_this_repair_and_then_reatte = SubLObjectFactory.makeString("[Make this repair and then reattempt]");
        $kw83$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str84$cb_repair_and_reattempt__A__A = SubLObjectFactory.makeString("cb-repair-and-reattempt&~A&~A");
        $sym85$CB_LINK_REPAIR_AND_REATTEMPT = SubLObjectFactory.makeSymbol("CB-LINK-REPAIR-AND-REATTEMPT");
        $str86$the_Cyc_KB_editing_facilities = SubLObjectFactory.makeString("the Cyc KB editing facilities");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPAIR-ASSERTION-SPEC-ID"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-STACK-ID"));
        $str88$Repair_and_assert_operations_comp = SubLObjectFactory.makeString("Repair and assert operations completed");
        $sym89$CB_REPAIR_AND_REATTEMPT = SubLObjectFactory.makeSymbol("CB-REPAIR-AND-REATTEMPT");
        $kw90$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $kw91$CB_AF = SubLObjectFactory.makeKeyword("CB-AF");
        $str92$cb_af_html = SubLObjectFactory.makeString("cb-af.html");
        $kw93$SHOW_ENGLISH = SubLObjectFactory.makeKeyword("SHOW-ENGLISH");
        $kw94$SHOW_EL_FORMULA = SubLObjectFactory.makeKeyword("SHOW-EL-FORMULA");
        $kw95$WFF_ASSERTION = SubLObjectFactory.makeKeyword("WFF-ASSERTION");
        $kw96$FIND_SIMILAR_ASSERTION = SubLObjectFactory.makeKeyword("FIND-SIMILAR-ASSERTION");
        $kw97$CHANGE_MT = SubLObjectFactory.makeKeyword("CHANGE-MT");
        $kw98$CHANGE_STRENGTH = SubLObjectFactory.makeKeyword("CHANGE-STRENGTH");
        $kw99$CHANGE_DIRECTION = SubLObjectFactory.makeKeyword("CHANGE-DIRECTION");
        $kw100$CHANGE_META_ASSERTION_MT = SubLObjectFactory.makeKeyword("CHANGE-META-ASSERTION-MT");
        $kw101$RENAME_VARIABLES = SubLObjectFactory.makeKeyword("RENAME-VARIABLES");
        $kw102$ASSERT_SIMILAR = SubLObjectFactory.makeKeyword("ASSERT-SIMILAR");
        $kw103$ASSERT_META = SubLObjectFactory.makeKeyword("ASSERT-META");
        $kw104$SUGGEST_PRAGMAS = SubLObjectFactory.makeKeyword("SUGGEST-PRAGMAS");
        $kw105$FIX_TYPO = SubLObjectFactory.makeKeyword("FIX-TYPO");
        $kw106$EDIT_ASSERTION = SubLObjectFactory.makeKeyword("EDIT-ASSERTION");
        $kw107$REASSERT = SubLObjectFactory.makeKeyword("REASSERT");
        $kw108$UNASSERT = SubLObjectFactory.makeKeyword("UNASSERT");
        $kw109$BLAST = SubLObjectFactory.makeKeyword("BLAST");
        $kw110$ASSERTION_PROOF_VIEW = SubLObjectFactory.makeKeyword("ASSERTION-PROOF-VIEW");
        $kw111$ANTECEDENT_QUERY = SubLObjectFactory.makeKeyword("ANTECEDENT-QUERY");
        $str112$_Query_Antecedent_ = SubLObjectFactory.makeString("[Query Antecedent]");
        $kw113$RULE_KNOWN_EXTENT_QUERY = SubLObjectFactory.makeKeyword("RULE-KNOWN-EXTENT-QUERY");
        $str114$_Known_Extent_ = SubLObjectFactory.makeString("[Known Extent]");
        $kw115$RULE_UNKNOWN_EXTENT_QUERY = SubLObjectFactory.makeKeyword("RULE-UNKNOWN-EXTENT-QUERY");
        $str116$_Unknown_Extent_ = SubLObjectFactory.makeString("[Unknown Extent]");
        $kw117$TRIGGER_TEST = SubLObjectFactory.makeKeyword("TRIGGER-TEST");
        $str118$_Trigger_Test_ = SubLObjectFactory.makeString("[Trigger Test]");
        $kw119$ASSERTION_SIMILAR_QUERY = SubLObjectFactory.makeKeyword("ASSERTION-SIMILAR-QUERY");
        $kw120$ASSERT_TMS = SubLObjectFactory.makeKeyword("ASSERT-TMS");
        $kw121$JUSTIFY = SubLObjectFactory.makeKeyword("JUSTIFY");
        $kw122$ASSERTION_DEPENDENCIES = SubLObjectFactory.makeKeyword("ASSERTION-DEPENDENCIES");
        $kw123$RECANONICALIZE = SubLObjectFactory.makeKeyword("RECANONICALIZE");
        $kw124$REPROPAGATE = SubLObjectFactory.makeKeyword("REPROPAGATE");
        $kw125$REPROPAGATE_BROWSABLY = SubLObjectFactory.makeKeyword("REPROPAGATE-BROWSABLY");
        $kw126$TEST_GEN_TEMPLATE = SubLObjectFactory.makeKeyword("TEST-GEN-TEMPLATE");
        $kw127$USE_IN_PROOF = SubLObjectFactory.makeKeyword("USE-IN-PROOF");
        $kw128$USE_IN_PLAN_CHECKING = SubLObjectFactory.makeKeyword("USE-IN-PLAN-CHECKING");
        $kw129$REINFORCE_RULE = SubLObjectFactory.makeKeyword("REINFORCE-RULE");
        $const130$InferenceRelatedBookkeepingPredic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferenceRelatedBookkeepingPredicate"));
        $kw131$CB_CHANGE_MT = SubLObjectFactory.makeKeyword("CB-CHANGE-MT");
        $str132$cb_change_mt_html = SubLObjectFactory.makeString("cb-change-mt.html");
        $str133$the_Change_Assertion_Mt_page = SubLObjectFactory.makeString("the Change Assertion Mt page");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $str135$Change_Assertion_Mt = SubLObjectFactory.makeString("Change Assertion Mt");
        $str136$post = SubLObjectFactory.makeString("post");
        $str137$cb_handle_change_mt = SubLObjectFactory.makeString("cb-handle-change-mt");
        $str138$id = SubLObjectFactory.makeString("id");
        $kw139$RED = SubLObjectFactory.makeKeyword("RED");
        $str140$Note___This_assertion_has_meta_as = SubLObjectFactory.makeString("Note : This assertion has meta-assertions");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTIME-PSC-ALLOWED?"), (SubLObject)cb_assertion_editor.NIL);
        $str142$Abort_Edit = SubLObjectFactory.makeString("Abort Edit");
        $str143$Current_Value = SubLObjectFactory.makeString("Current Value");
        $str144$Change_Mt = SubLObjectFactory.makeString("Change Mt");
        $sym145$CB_CHANGE_MT = SubLObjectFactory.makeSymbol("CB-CHANGE-MT");
        $str146$To_change_Mt_of_all_meta_assertio = SubLObjectFactory.makeString("To change Mt of all meta-assertions use ");
        $str147$move_all_meta_assertions = SubLObjectFactory.makeString("move-all-meta-assertions");
        $str148$t = SubLObjectFactory.makeString("t");
        $str149$Change_the_Mt_of_all_meta_asserti = SubLObjectFactory.makeString("Change the Mt of all meta-assertions to the new Mt");
        $str150$change_microtheory = SubLObjectFactory.makeString("change microtheory");
        $str151$Assertion_is_already_in__S = SubLObjectFactory.makeString("Assertion is already in ~S");
        $str152$preserve_ = SubLObjectFactory.makeString("preserve_");
        $sym153$CB_HANDLE_CHANGE_MT = SubLObjectFactory.makeSymbol("CB-HANDLE-CHANGE-MT");
        $str154$_Change_Mt_ = SubLObjectFactory.makeString("[Change Mt]");
        $str155$cb_change_mt__a = SubLObjectFactory.makeString("cb-change-mt&~a");
        $sym156$CB_LINK_CHANGE_MT = SubLObjectFactory.makeSymbol("CB-LINK-CHANGE-MT");
        $kw157$CB_CHANGE_STRENGTH = SubLObjectFactory.makeKeyword("CB-CHANGE-STRENGTH");
        $str158$cb_change_strength_html = SubLObjectFactory.makeString("cb-change-strength.html");
        $str159$the_Change_Assertion_Strength_pag = SubLObjectFactory.makeString("the Change Assertion Strength page");
        $str160$Change_Assertion_Strength = SubLObjectFactory.makeString("Change Assertion Strength");
        $str161$cb_handle_change_strength = SubLObjectFactory.makeString("cb-handle-change-strength");
        $str162$Choose_a_new_truth_strength__ = SubLObjectFactory.makeString("Choose a new truth strength :");
        $str163$strength = SubLObjectFactory.makeString("strength");
        $str164$_default = SubLObjectFactory.makeString(":default");
        $kw165$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str166$Default = SubLObjectFactory.makeString("Default");
        $str167$_monotonic = SubLObjectFactory.makeString(":monotonic");
        $kw168$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $str169$Monotonic = SubLObjectFactory.makeString("Monotonic");
        $str170$Change_Strength = SubLObjectFactory.makeString("Change Strength");
        $sym171$CB_CHANGE_STRENGTH = SubLObjectFactory.makeSymbol("CB-CHANGE-STRENGTH");
        $str172$change_strength = SubLObjectFactory.makeString("change strength");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"));
        $str174$_a_was_not_a_microtheory = SubLObjectFactory.makeString("~a was not a microtheory");
        $sym175$CB_HANDLE_CHANGE_STRENGTH = SubLObjectFactory.makeSymbol("CB-HANDLE-CHANGE-STRENGTH");
        $str176$_Change_Strength_ = SubLObjectFactory.makeString("[Change Strength]");
        $str177$cb_change_strength__a = SubLObjectFactory.makeString("cb-change-strength&~a");
        $sym178$CB_LINK_CHANGE_STRENGTH = SubLObjectFactory.makeSymbol("CB-LINK-CHANGE-STRENGTH");
        $kw179$CB_CHANGE_DIRECTION = SubLObjectFactory.makeKeyword("CB-CHANGE-DIRECTION");
        $str180$cb_change_direction_html = SubLObjectFactory.makeString("cb-change-direction.html");
        $str181$the_Change_Assertion_Direction_pa = SubLObjectFactory.makeString("the Change Assertion Direction page");
        $str182$Change_Assertion_Direction = SubLObjectFactory.makeString("Change Assertion Direction");
        $str183$cb_handle_change_direction = SubLObjectFactory.makeString("cb-handle-change-direction");
        $str184$Choose_a_direction__ = SubLObjectFactory.makeString("Choose a direction :");
        $str185$direction = SubLObjectFactory.makeString("direction");
        $str186$_backward = SubLObjectFactory.makeString(":backward");
        $kw187$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $str188$Backward = SubLObjectFactory.makeString("Backward");
        $str189$_forward = SubLObjectFactory.makeString(":forward");
        $kw190$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $str191$Forward = SubLObjectFactory.makeString("Forward");
        $str192$Change_Direction = SubLObjectFactory.makeString("Change Direction");
        $sym193$CB_CHANGE_DIRECTION = SubLObjectFactory.makeSymbol("CB-CHANGE-DIRECTION");
        $str194$direction_changes = SubLObjectFactory.makeString("direction changes");
        $str195$shoehorn_ = SubLObjectFactory.makeString("shoehorn?");
        $str196$_a_does_not_specify_a_valid_direc = SubLObjectFactory.makeString("~a does not specify a valid direction");
        $const197$cyclistNotes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes"));
        $str198$This_rule_was_shoehorned_forward_ = SubLObjectFactory.makeString("This rule was shoehorned forward ");
        $str199$_by_ = SubLObjectFactory.makeString(" by ");
        $sym200$CB_HANDLE_CHANGE_DIRECTION = SubLObjectFactory.makeSymbol("CB-HANDLE-CHANGE-DIRECTION");
        $str201$_Change_Direction_ = SubLObjectFactory.makeString("[Change Direction]");
        $str202$cb_change_direction__a = SubLObjectFactory.makeString("cb-change-direction&~a");
        $sym203$CB_LINK_CHANGE_DIRECTION = SubLObjectFactory.makeSymbol("CB-LINK-CHANGE-DIRECTION");
        $kw204$CB_CHANGE_META_ASSERTION_MT = SubLObjectFactory.makeKeyword("CB-CHANGE-META-ASSERTION-MT");
        $str205$cb_change_meta_assertion_mt_html = SubLObjectFactory.makeString("cb-change-meta-assertion-mt.html");
        $str206$Change_Meta_Assertions_Mt = SubLObjectFactory.makeString("Change Meta Assertions Mt");
        $str207$cb_handle_change_meta_assertion_m = SubLObjectFactory.makeString("cb-handle-change-meta-assertion-mt");
        $str208$Change_the_Mt_of_Meta_Assertions_ = SubLObjectFactory.makeString("Change the Mt of Meta-Assertions of the assertion : ");
        $str209$change_meta_ = SubLObjectFactory.makeString("change_meta_");
        $str210$Choose_the_meta_assertions__ = SubLObjectFactory.makeString("Choose the meta assertions :");
        $sym211$CB_CHANGE_META_ASSERTION_MT = SubLObjectFactory.makeSymbol("CB-CHANGE-META-ASSERTION-MT");
        $sym212$CB_HANDLE_CHANGE_META_ASSERTION_MT = SubLObjectFactory.makeSymbol("CB-HANDLE-CHANGE-META-ASSERTION-MT");
        $str213$_Change_Meta_Assertions_Mt_ = SubLObjectFactory.makeString("[Change Meta Assertions Mt]");
        $str214$cb_change_meta_assertion_mt__a = SubLObjectFactory.makeString("cb-change-meta-assertion-mt&~a");
        $sym215$CB_LINK_CHANGE_META_ASSERTION_MT = SubLObjectFactory.makeSymbol("CB-LINK-CHANGE-META-ASSERTION-MT");
        $kw216$CB_RENAME_VARIABLES = SubLObjectFactory.makeKeyword("CB-RENAME-VARIABLES");
        $str217$cb_rename_variables_html = SubLObjectFactory.makeString("cb-rename-variables.html");
        $str218$the_facility_to_rename_variables = SubLObjectFactory.makeString("the facility to rename variables");
        $str219$Rename_Assertion_Variables = SubLObjectFactory.makeString("Rename Assertion Variables");
        $str220$cb_handle_rename_variables = SubLObjectFactory.makeString("cb-handle-rename-variables");
        $str221$Rename_the_variables_of_the_asser = SubLObjectFactory.makeString("Rename the variables of the assertion : ");
        $str222$Note__ = SubLObjectFactory.makeString("Note: ");
        $str223$Variables_listed_in_ = SubLObjectFactory.makeString("Variables listed in ");
        $str224$red = SubLObjectFactory.makeString("red");
        $str225$_have_invalid_variable_names___Va = SubLObjectFactory.makeString(" have invalid variable names.  Valid variables must satisfy the regular expression ");
        $kw226$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw227$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str228$Current_Variable = SubLObjectFactory.makeString("Current Variable");
        $str229$Changed_Variable = SubLObjectFactory.makeString("Changed Variable");
        $str230$Rename_Variables = SubLObjectFactory.makeString("Rename Variables");
        $str231$rename = SubLObjectFactory.makeString("rename");
        $sym232$CB_RENAME_VARIABLES = SubLObjectFactory.makeSymbol("CB-RENAME-VARIABLES");
        $str233$No_variables_were_specified_to_be = SubLObjectFactory.makeString("No variables were specified to be renamed.");
        $list234 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMED-VARIABLE"));
        $str235$The_proposed_rename_may_change_th = SubLObjectFactory.makeString("The proposed rename may change the logical intent of the assertion, and would require unasserting and reasserting it.  Do you want to continue?");
        $str236$Yes = SubLObjectFactory.makeString("Yes");
        $str237$continue = SubLObjectFactory.makeString("continue");
        $str238$No = SubLObjectFactory.makeString("No");
        $kw239$EDIT = SubLObjectFactory.makeKeyword("EDIT");
        $sym240$CB_HANDLE_RENAME_VARIABLES = SubLObjectFactory.makeSymbol("CB-HANDLE-RENAME-VARIABLES");
        $list241 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VARIABLE-NAME"));
        $list242 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_tab, (SubLObject)Characters.CHAR_newline);
        $str243$_ = SubLObjectFactory.makeString("?");
        $str244$ = SubLObjectFactory.makeString("");
        $str245$Invalid_Variables = SubLObjectFactory.makeString("Invalid Variables");
        $str246$Back = SubLObjectFactory.makeString("Back");
        $str247$The_following_variables_have_inva = SubLObjectFactory.makeString("The following variables have invalid variable names");
        $sym248$STR = SubLObjectFactory.makeSymbol("STR");
        $str249$__ = SubLObjectFactory.makeString(", ");
        $str250$__and_ = SubLObjectFactory.makeString(", and ");
        $str251$Valid_variables_must_satisfy_the_ = SubLObjectFactory.makeString("Valid variables must satisfy the regular expression ");
        $str252$_Rename_Variables_ = SubLObjectFactory.makeString("[Rename Variables]");
        $str253$cb_rename_variables__a = SubLObjectFactory.makeString("cb-rename-variables&~a");
        $sym254$CB_LINK_RENAME_VARIABLES = SubLObjectFactory.makeSymbol("CB-LINK-RENAME-VARIABLES");
        $str255$the_facility_to_repropagate_forwa = SubLObjectFactory.makeString("the facility to repropagate forward inference on an assertion");
        $str256$Forward_Assertion_Repropagation = SubLObjectFactory.makeString("Forward Assertion Repropagation");
        $str257$_a_does_not_specify_an_assertion = SubLObjectFactory.makeString("~a does not specify an assertion");
        $sym258$CB_REPROPAGATE = SubLObjectFactory.makeSymbol("CB-REPROPAGATE");
        $str259$_Repropagate_ = SubLObjectFactory.makeString("[Repropagate]");
        $str260$cb_repropagate__a = SubLObjectFactory.makeString("cb-repropagate&~a");
        $sym261$CB_LINK_REPROPAGATE = SubLObjectFactory.makeSymbol("CB-LINK-REPROPAGATE");
        $str262$the_facility_to_repropagate_and_b = SubLObjectFactory.makeString("the facility to repropagate and browse forward inference on an assertion");
        $str263$Forward_repropagation_complete___ = SubLObjectFactory.makeString("Forward repropagation complete.  Browse results:");
        $sym264$CB_REPROPAGATE_BROWSABLY = SubLObjectFactory.makeSymbol("CB-REPROPAGATE-BROWSABLY");
        $str265$_Repropagate_and_Browse_ = SubLObjectFactory.makeString("[Repropagate and Browse]");
        $str266$cb_repropagate_browsably__a = SubLObjectFactory.makeString("cb-repropagate-browsably&~a");
        $sym267$CB_LINK_REPROPAGATE_BROWSABLY = SubLObjectFactory.makeSymbol("CB-LINK-REPROPAGATE-BROWSABLY");
        $str268$the_facility_to_recanonicalize_an = SubLObjectFactory.makeString("the facility to recanonicalize an assertion");
        $str269$_S_did_not_specify_an_assertion_ = SubLObjectFactory.makeString("~S did not specify an assertion.");
        $str270$Assertion_is_already_canonical = SubLObjectFactory.makeString("Assertion is already canonical");
        $str271$Recanonicalize_Assertion = SubLObjectFactory.makeString("Recanonicalize Assertion");
        $sym272$CB_RECANONICALIZE = SubLObjectFactory.makeSymbol("CB-RECANONICALIZE");
        $str273$_Recanonicalize_ = SubLObjectFactory.makeString("[Recanonicalize]");
        $str274$cb_recanonicalize__a = SubLObjectFactory.makeString("cb-recanonicalize&~a");
        $sym275$CB_LINK_RECANONICALIZE = SubLObjectFactory.makeSymbol("CB-LINK-RECANONICALIZE");
        $kw276$CB_WFF = SubLObjectFactory.makeKeyword("CB-WFF");
        $str277$cb_wff_html = SubLObjectFactory.makeString("cb-wff.html");
        $str278$WFF_Check_Sentence = SubLObjectFactory.makeString("WFF-Check Sentence");
        $str279$cb_handle_wff = SubLObjectFactory.makeString("cb-handle-wff");
        $str280$Clear = SubLObjectFactory.makeString("Clear");
        $const281$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $list282 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeString("sentence"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeString("Complete"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeString("Cyclify"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeString("Clear Sentence"), SubLObjectFactory.makeKeyword("HEIGHT"), cb_assertion_editor.TWENTY_INTEGER, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(80) });
        $sym283$CB_WFF = SubLObjectFactory.makeSymbol("CB-WFF");
        $str284$WFF_Check = SubLObjectFactory.makeString("WFF Check");
        $kw285$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str286$cb_wff = SubLObjectFactory.makeString("cb-wff");
        $kw287$WFF = SubLObjectFactory.makeKeyword("WFF");
        $sym288$CB_LINK_WFF = SubLObjectFactory.makeSymbol("CB-LINK-WFF");
        $str289$WFF = SubLObjectFactory.makeString("WFF");
        $str290$Check_a_CycL_Expression_for_well_ = SubLObjectFactory.makeString("Check a CycL Expression for well-formedness");
        $sym291$CB_HANDLE_WFF = SubLObjectFactory.makeSymbol("CB-HANDLE-WFF");
        $list292 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $str293$Sentence_is_Well_Formed = SubLObjectFactory.makeString("Sentence is Well Formed");
        $str294$WFF_Status___ = SubLObjectFactory.makeString("WFF-Status : ");
        $str295$OK = SubLObjectFactory.makeString("OK");
        $list296 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)SubLObjectFactory.makeString("cb-handle-assert"), (SubLObject)SubLObjectFactory.makeString("Assert Sentence"), (SubLObject)SubLObjectFactory.makeString("Assert Sentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIMILAR"), (SubLObject)SubLObjectFactory.makeString("cb-handle-assert"), (SubLObject)SubLObjectFactory.makeString("Assert Similar Sentence"), (SubLObject)SubLObjectFactory.makeString("Assert Sentence")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EDIT"), (SubLObject)SubLObjectFactory.makeString("cb-handle-edit"), (SubLObject)SubLObjectFactory.makeString("Edit Assertion"), (SubLObject)SubLObjectFactory.makeString("Perform Edit")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EDIT-SENTENCE"), (SubLObject)SubLObjectFactory.makeString("cb-handle-sentence-edit"), (SubLObject)SubLObjectFactory.makeString("Edit Sentence"), (SubLObject)SubLObjectFactory.makeString("Perform Edit")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIX-TYPO"), (SubLObject)SubLObjectFactory.makeString("cb-handle-fix-typo"), (SubLObject)SubLObjectFactory.makeString("Fix Assertion"), (SubLObject)SubLObjectFactory.makeString("Perform Fix")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("META"), (SubLObject)SubLObjectFactory.makeString("cb-handle-assert-meta"), (SubLObject)SubLObjectFactory.makeString("Assert Meta Assertion"), (SubLObject)SubLObjectFactory.makeString("Assert Sentence")));
        $sym297$CB_ASSERT = SubLObjectFactory.makeSymbol("CB-ASSERT");
        $str298$assertions = SubLObjectFactory.makeString("assertions");
        $str299$wff_check = SubLObjectFactory.makeString("wff-check");
        $str300$assertion_queue = SubLObjectFactory.makeString("assertion-queue");
        $kw301$BROWSE = SubLObjectFactory.makeKeyword("BROWSE");
        $str302$Forward_propagation_complete___Br = SubLObjectFactory.makeString("Forward propagation complete.  Browse results:");
        $kw303$NOW = SubLObjectFactory.makeKeyword("NOW");
        $str304$EL_Sentence_Assert = SubLObjectFactory.makeString("EL Sentence Assert");
        $sym305$CB_HANDLE_ASSERT = SubLObjectFactory.makeSymbol("CB-HANDLE-ASSERT");
        $kw306$ASSERT = SubLObjectFactory.makeKeyword("ASSERT");
        $str307$assert_tool_gif = SubLObjectFactory.makeString("assert-tool.gif");
        $str308$Assert = SubLObjectFactory.makeString("Assert");
        $str309$cb_assert = SubLObjectFactory.makeString("cb-assert");
        $sym310$CB_LINK_ASSERT = SubLObjectFactory.makeSymbol("CB-LINK-ASSERT");
        $str311$Asrt = SubLObjectFactory.makeString("Asrt");
        $str312$Assert_CycL_Expression = SubLObjectFactory.makeString("Assert CycL Expression");
        $kw313$CB_ASSERT_INTERNAL = SubLObjectFactory.makeKeyword("CB-ASSERT-INTERNAL");
        $str314$cb_assert_internal_html = SubLObjectFactory.makeString("cb-assert-internal.html");
        $str315$Fatal_Error = SubLObjectFactory.makeString("Fatal Error");
        $str316$cb_assert_called_without_a_valid_ = SubLObjectFactory.makeString("cb-assert called without a valid mode");
        $list317 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLER"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-LABEL"));
        $kw318$META = SubLObjectFactory.makeKeyword("META");
        $str319$Please_use_ = SubLObjectFactory.makeString("Please use ");
        $str320$_to_refer_to_the_following_assert = SubLObjectFactory.makeString(" to refer to the following assertion :");
        $str321$Reset_All_Fields = SubLObjectFactory.makeString("Reset All Fields");
        $str322$assert = SubLObjectFactory.makeString("assert");
        $kw323$SIMILAR = SubLObjectFactory.makeKeyword("SIMILAR");
        $str324$_local = SubLObjectFactory.makeString(":local");
        $kw325$LOCAL = SubLObjectFactory.makeKeyword("LOCAL");
        $str326$Assert_using_Local_queue = SubLObjectFactory.makeString("Assert using Local queue");
        $str327$_browse = SubLObjectFactory.makeString(":browse");
        $str328$Assert_now_and_browse_forward_inf = SubLObjectFactory.makeString("Assert now and browse forward inference");
        $str329$_now = SubLObjectFactory.makeString(":now");
        $str330$Assert_now__bypassing_Local_queue = SubLObjectFactory.makeString("Assert now, bypassing Local queue");
        $str331$cb_assert_parameters = SubLObjectFactory.makeString("cb-assert-parameters");
        $str332$Show = SubLObjectFactory.makeString("Show");
        $str333$Hide = SubLObjectFactory.makeString("Hide");
        $str334$Assert_Context = SubLObjectFactory.makeString("Assert Context");
        $kw335$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $kw336$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $kw337$EDIT_ONLY = SubLObjectFactory.makeKeyword("EDIT-ONLY");
        $kw338$EDIT_ALLOWED_ = SubLObjectFactory.makeKeyword("EDIT-ALLOWED?");
        $kw339$MONAD_CHOICES = SubLObjectFactory.makeKeyword("MONAD-CHOICES");
        $list340 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")));
        $kw341$ANYTIME_PSC_ALLOWED_ = SubLObjectFactory.makeKeyword("ANYTIME-PSC-ALLOWED?");
        $kw342$INPUT_NAME = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $str343$sentence = SubLObjectFactory.makeString("sentence");
        $kw344$COMPLETE_LABEL = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $str345$Complete = SubLObjectFactory.makeString("Complete");
        $kw346$CYCLIFY_LABEL = SubLObjectFactory.makeKeyword("CYCLIFY-LABEL");
        $str347$Cyclify = SubLObjectFactory.makeString("Cyclify");
        $kw348$CLEAR_LABEL = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $str349$Clear_Sentence = SubLObjectFactory.makeString("Clear Sentence");
        $kw350$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw351$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $int352$80 = SubLObjectFactory.makeInteger(80);
        $kw353$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw354$CHOICES = SubLObjectFactory.makeKeyword("CHOICES");
        $list355 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheAssertionSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptWhen")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pragmaticRequirement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salientAssertions")));
        $str356$cb_handle_fix_typo = SubLObjectFactory.makeString("cb-handle-fix-typo");
        $str357$cb_handle_edit = SubLObjectFactory.makeString("cb-handle-edit");
        $str358$cb_handle_sentence_edit = SubLObjectFactory.makeString("cb-handle-sentence-edit");
        $str359$Choose_analogous_meta_assertions_ = SubLObjectFactory.makeString("Choose analogous meta-assertions to assert :");
        $const360$assertionOriginalText = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionOriginalText"));
        $str361$_a_S = SubLObjectFactory.makeString("~a~S");
        $const362$TheAssertionSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheAssertionSentence"));
        $sym363$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str364$_S_did_not_specify_a_microtheory_ = SubLObjectFactory.makeString("~S did not specify a microtheory.");
        $str365$_S_is_not_a_microtheory_ = SubLObjectFactory.makeString("~S is not a microtheory.");
        $const366$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $str367$Bad_sentence__probably_due_to_a_m = SubLObjectFactory.makeString("Bad sentence, probably due to a misspelling.~%Check these inputs:~%~%~S");
        $list368 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ID"), (SubLObject)SubLObjectFactory.makeSymbol("MT-ID"));
        $const369$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym370$CB_ASSERT_FORMULA = SubLObjectFactory.makeSymbol("CB-ASSERT-FORMULA");
        $const371$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $str372$_Assert_Formula_ = SubLObjectFactory.makeString("[Assert Formula]");
        $str373$cb_assert_formula__A__A = SubLObjectFactory.makeString("cb-assert-formula&~A&~A");
        $kw374$ASSERT_FORMULA = SubLObjectFactory.makeKeyword("ASSERT-FORMULA");
        $sym375$CB_LINK_ASSERT_FORMULA = SubLObjectFactory.makeSymbol("CB-LINK-ASSERT-FORMULA");
        $sym376$CB_SIMILAR = SubLObjectFactory.makeSymbol("CB-SIMILAR");
        $str377$_Assert_Similar_ = SubLObjectFactory.makeString("[Assert Similar]");
        $str378$cb_similar__a = SubLObjectFactory.makeString("cb-similar&~a");
        $sym379$CB_LINK_ASSERT_SIMILAR = SubLObjectFactory.makeSymbol("CB-LINK-ASSERT-SIMILAR");
        $sym380$CB_ASSERT_META = SubLObjectFactory.makeSymbol("CB-ASSERT-META");
        $str381$editing = SubLObjectFactory.makeString("editing");
        $str382$The_sentence_did_not_mention__S_ = SubLObjectFactory.makeString("The sentence did not mention ~S.");
        $str383$EL_Meta_Sentence_Assert = SubLObjectFactory.makeString("EL Meta Sentence Assert");
        $sym384$CB_HANDLE_ASSERT_META = SubLObjectFactory.makeSymbol("CB-HANDLE-ASSERT-META");
        $str385$_Assert_Meta_ = SubLObjectFactory.makeString("[Assert Meta]");
        $str386$cb_assert_meta__a = SubLObjectFactory.makeString("cb-assert-meta&~a");
        $sym387$CB_LINK_ASSERT_META = SubLObjectFactory.makeSymbol("CB-LINK-ASSERT-META");
        $sym388$CB_SUGGEST_PRAGMAS = SubLObjectFactory.makeSymbol("CB-SUGGEST-PRAGMAS");
        $str389$_Suggest_Pragmas_ = SubLObjectFactory.makeString("[Suggest Pragmas]");
        $str390$cb_suggest_pragmas__a = SubLObjectFactory.makeString("cb-suggest-pragmas&~a");
        $sym391$CB_LINK_SUGGEST_PRAGMAS = SubLObjectFactory.makeSymbol("CB-LINK-SUGGEST-PRAGMAS");
        $str392$Suggested_Pragmas = SubLObjectFactory.makeString("Suggested Pragmas");
        $kw393$CB_SUGGEST_PRAGMAS = SubLObjectFactory.makeKeyword("CB-SUGGEST-PRAGMAS");
        $str394$Pragmatic_requirements_worth_cons = SubLObjectFactory.makeString("Pragmatic requirements worth considering for :");
        $const395$pragmaticRequirement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pragmaticRequirement"));
        $kw396$ASSERT_SUGGESTED_PRAGMA = SubLObjectFactory.makeKeyword("ASSERT-SUGGESTED-PRAGMA");
        $str397$_Assert_ = SubLObjectFactory.makeString("[Assert]");
        $kw398$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str399$cb_assert_suggested_pragma__a__a = SubLObjectFactory.makeString("cb-assert-suggested-pragma&~a&~a");
        $sym400$CB_LINK_ASSERT_SUGGESTED_PRAGMA = SubLObjectFactory.makeSymbol("CB-LINK-ASSERT-SUGGESTED-PRAGMA");
        $list401 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PRAGMA-STRING"));
        $sym402$CB_ASSERT_SUGGESTED_PRAGMA = SubLObjectFactory.makeSymbol("CB-ASSERT-SUGGESTED-PRAGMA");
        $sym403$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list404 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-FORMAT?*"), (SubLObject)cb_assertion_editor.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*"), (SubLObject)cb_assertion_editor.NIL));
        $sym405$CB_EDIT = SubLObjectFactory.makeSymbol("CB-EDIT");
        $str406$Assertion_Edit = SubLObjectFactory.makeString("Assertion Edit");
        $sym407$CB_HANDLE_EDIT = SubLObjectFactory.makeSymbol("CB-HANDLE-EDIT");
        $list408 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID-STRING"));
        $str409$_Edit_ = SubLObjectFactory.makeString("[Edit]");
        $str410$cb_edit__a = SubLObjectFactory.makeString("cb-edit&~a");
        $sym411$CB_LINK_EDIT_ASSERTION = SubLObjectFactory.makeSymbol("CB-LINK-EDIT-ASSERTION");
        $str412$error = SubLObjectFactory.makeString("error");
        $str413$_S = SubLObjectFactory.makeString("~S");
        $str414$assertion_editing_facilities = SubLObjectFactory.makeString("assertion editing facilities");
        $sym415$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str416$oldAssertionId = SubLObjectFactory.makeString("oldAssertionId");
        $kw417$SENTENCE_NUM = SubLObjectFactory.makeKeyword("SENTENCE-NUM");
        $kw418$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $str419$response = SubLObjectFactory.makeString("response");
        $kw420$NOT_WELL_FORMED = SubLObjectFactory.makeKeyword("NOT-WELL-FORMED");
        $str421$invalidSentence = SubLObjectFactory.makeString("invalidSentence");
        $str422$message = SubLObjectFactory.makeString("message");
        $str423$count = SubLObjectFactory.makeString("count");
        $str424$assertionsQueued = SubLObjectFactory.makeString("assertionsQueued");
        $str425$_A_assertion_P_added_to_the_local = SubLObjectFactory.makeString("~A assertion~P added to the local queue.");
        $list426 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("count"), (SubLObject)SubLObjectFactory.makeString("1"));
        $str427$unassertedQueued = SubLObjectFactory.makeString("unassertedQueued");
        $str428$_A_unassert__P_added_to_the_local = SubLObjectFactory.makeString("~A unassert~:P added to the local queue.");
        $sym429$CB_HANDLE_EDIT_ASSERTION = SubLObjectFactory.makeSymbol("CB-HANDLE-EDIT-ASSERTION");
        $kw430$XML_HANDLER = SubLObjectFactory.makeKeyword("XML-HANDLER");
        $str431$_S_did_not_specify_a_CycL_sentenc = SubLObjectFactory.makeString("~S did not specify a CycL sentence eligible for editing.");
        $sym432$CB_HANDLE_SENTENCE_EDIT = SubLObjectFactory.makeSymbol("CB-HANDLE-SENTENCE-EDIT");
        $str433$the_Cyc_KB_typo_fixing_facilities = SubLObjectFactory.makeString("the Cyc KB typo fixing facilities");
        $sym434$CB_FIX_TYPO_EDIT = SubLObjectFactory.makeSymbol("CB-FIX-TYPO-EDIT");
        $str435$_Fix_Typo_ = SubLObjectFactory.makeString("[Fix Typo]");
        $str436$cb_fix_typo_edit__a = SubLObjectFactory.makeString("cb-fix-typo-edit&~a");
        $sym437$CB_LINK_FIX_TYPO = SubLObjectFactory.makeSymbol("CB-LINK-FIX-TYPO");
        $sym438$CYCL_STRING_P = SubLObjectFactory.makeSymbol("CYCL-STRING-P");
        $str439$Edited_sentence_does_not_differ_o = SubLObjectFactory.makeString("Edited sentence does not differ only in strings.");
        $sym440$CB_HANDLE_FIX_TYPO = SubLObjectFactory.makeSymbol("CB-HANDLE-FIX-TYPO");
        $str441$Reassert = SubLObjectFactory.makeString("Reassert");
        $sym442$CB_REASSERT = SubLObjectFactory.makeSymbol("CB-REASSERT");
        $str443$_Reassert_ = SubLObjectFactory.makeString("[Reassert]");
        $str444$cb_reassert__a = SubLObjectFactory.makeString("cb-reassert&~a");
        $sym445$CB_LINK_REASSERT = SubLObjectFactory.makeSymbol("CB-LINK-REASSERT");
        $str446$Unassert = SubLObjectFactory.makeString("Unassert");
        $sym447$CB_UNASSERT = SubLObjectFactory.makeSymbol("CB-UNASSERT");
        $str448$_Unassert_ = SubLObjectFactory.makeString("[Unassert]");
        $str449$cb_unassert__a = SubLObjectFactory.makeString("cb-unassert&~a");
        $sym450$CB_LINK_UNASSERT = SubLObjectFactory.makeSymbol("CB-LINK-UNASSERT");
        $str451$Assertion_Blast = SubLObjectFactory.makeString("Assertion Blast");
        $sym452$CB_BLAST = SubLObjectFactory.makeSymbol("CB-BLAST");
        $str453$_Blast_ = SubLObjectFactory.makeString("[Blast]");
        $str454$cb_blast__a = SubLObjectFactory.makeString("cb-blast&~a");
        $sym455$CB_LINK_BLAST = SubLObjectFactory.makeSymbol("CB-LINK-BLAST");
        $list456 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"));
        $str457$_a_does_not_specify_a_deduction = SubLObjectFactory.makeString("~a does not specify a deduction");
        $str458$Deduction_Removal = SubLObjectFactory.makeString("Deduction Removal");
        $sym459$CB_REMOVE_DEDUCTION = SubLObjectFactory.makeSymbol("CB-REMOVE-DEDUCTION");
        $str460$_Remove_Deduction_ = SubLObjectFactory.makeString("[Remove Deduction]");
        $str461$cb_remove_deduction__a = SubLObjectFactory.makeString("cb-remove-deduction&~a");
        $kw462$REMOVE_DEDUCTION = SubLObjectFactory.makeKeyword("REMOVE-DEDUCTION");
        $sym463$CB_LINK_REMOVE_DEDUCTION = SubLObjectFactory.makeSymbol("CB-LINK-REMOVE-DEDUCTION");
        $str464$Redo_TMS_for_Assertion = SubLObjectFactory.makeString("Redo TMS for Assertion");
        $sym465$CB_ASSERTION_TMS = SubLObjectFactory.makeSymbol("CB-ASSERTION-TMS");
        $str466$_Redo_TMS_ = SubLObjectFactory.makeString("[Redo TMS]");
        $str467$cb_assertion_tms__a = SubLObjectFactory.makeString("cb-assertion-tms&~a");
        $sym468$CB_LINK_ASSERT_TMS = SubLObjectFactory.makeSymbol("CB-LINK-ASSERT-TMS");
        $kw469$CB_DIAGNOSE_ASSERTION = SubLObjectFactory.makeKeyword("CB-DIAGNOSE-ASSERTION");
        $str470$cb_diagnose_assertion_html = SubLObjectFactory.makeString("cb-diagnose-assertion.html");
        $str471$the_Assertion_Diagnostics_page = SubLObjectFactory.makeString("the Assertion Diagnostics page");
        $str472$_a_does_not_specify_a_Cyc_asserti = SubLObjectFactory.makeString("~a does not specify a Cyc assertion");
        $str473$Assertion_Diagnostics = SubLObjectFactory.makeString("Assertion Diagnostics");
        $str474$Diagnosis_of__ = SubLObjectFactory.makeString("Diagnosis of :");
        $sym475$CB_DIAGNOSE_ASSERTION = SubLObjectFactory.makeSymbol("CB-DIAGNOSE-ASSERTION");
        $str476$_Run_Diagnostics_ = SubLObjectFactory.makeString("[Run Diagnostics]");
        $str477$cb_diagnose_assertion__A = SubLObjectFactory.makeString("cb-diagnose-assertion&~A");
        $kw478$DIAGNOSE_ASSERTION = SubLObjectFactory.makeKeyword("DIAGNOSE-ASSERTION");
        $sym479$CB_LINK_DIAGNOSE_ASSERTION = SubLObjectFactory.makeSymbol("CB-LINK-DIAGNOSE-ASSERTION");
        $sym480$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym481$RULE_ASSERTION_ = SubLObjectFactory.makeSymbol("RULE-ASSERTION?");
        $str482$cb_trigger_test__a__a = SubLObjectFactory.makeString("cb-trigger-test&~a&~a");
        $str483$cb_trigger_test__a = SubLObjectFactory.makeString("cb-trigger-test&~a");
        $str484$cb_trigger_test = SubLObjectFactory.makeString("cb-trigger-test");
        $sym485$CB_LINK_TRIGGER_TEST = SubLObjectFactory.makeSymbol("CB-LINK-TRIGGER-TEST");
        $list486 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORT-ID"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-ID"));
        $str487$the_Trigger_Test_page = SubLObjectFactory.makeString("the Trigger Test page");
        $sym488$CB_TRIGGER_TEST = SubLObjectFactory.makeSymbol("CB-TRIGGER-TEST");
        $const489$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $str490$Trigger_Test_Results = SubLObjectFactory.makeString("Trigger Test Results");
        $kw491$CB_TRIGGER_TEST = SubLObjectFactory.makeKeyword("CB-TRIGGER-TEST");
        $str492$Results_of_triggering__ = SubLObjectFactory.makeString("Results of triggering :");
        $str493$_Retrigger_ = SubLObjectFactory.makeString("[Retrigger]");
        $str494$against_rule__ = SubLObjectFactory.makeString("against rule :");
        $str495$No_results_ = SubLObjectFactory.makeString("No results.");
        $str496$One_Conclusion = SubLObjectFactory.makeString("One Conclusion");
        $str497$Conclusions__ = SubLObjectFactory.makeString("Conclusions (");
        $str498$_total_ = SubLObjectFactory.makeString(" total)");
        $str499$Justification = SubLObjectFactory.makeString("Justification");
        $list500 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF-CNF"), (SubLObject)SubLObjectFactory.makeSymbol("CONCLUDED-MT"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-TOKEN"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION")));
        $kw501$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $str502$just = SubLObjectFactory.makeString("just");
        $str503$Trigger_Test_Setup = SubLObjectFactory.makeString("Trigger Test Setup");
        $str504$Support_to_trigger__ = SubLObjectFactory.makeString("Support to trigger :");
        $str505$Please_select_a_rule_to_trigger__ = SubLObjectFactory.makeString("Please select a rule to trigger :");
        $str506$_Trigger_ = SubLObjectFactory.makeString("[Trigger]");
        $str507$There_are_currently_no_rules_in_y = SubLObjectFactory.makeString("There are currently no rules in your history.");
        $str508$Rule_to_trigger__ = SubLObjectFactory.makeString("Rule to trigger :");
        $str509$Please_select_a_support_to_trigge = SubLObjectFactory.makeString("Please select a support to trigger :");
        $str510$There_are_currently_no_supports_i = SubLObjectFactory.makeString("There are currently no supports in your history.");
        $str511$Time_to_implement_cb_trigger_test = SubLObjectFactory.makeString("Time to implement cb-trigger-test-unspecified");
        $sym512$_CB_PROOF_CHECKER_RULES_ = SubLObjectFactory.makeSymbol("*CB-PROOF-CHECKER-RULES*");
        $sym513$VALID_ASSERTION = SubLObjectFactory.makeSymbol("VALID-ASSERTION");
        $str514$Assertion_specified_was_not_a_rul = SubLObjectFactory.makeString("Assertion specified was not a rule");
        $str515$Rule_has_been_added_to_proof_chec = SubLObjectFactory.makeString("Rule has been added to proof checker rule set.");
        $sym516$CB_USE_IN_PROOF = SubLObjectFactory.makeSymbol("CB-USE-IN-PROOF");
        $sym517$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $str518$_Use_in_Proof_ = SubLObjectFactory.makeString("[Use in Proof]");
        $str519$cb_use_in_proof__a = SubLObjectFactory.makeString("cb-use-in-proof&~a");
        $sym520$CB_LINK_USE_IN_PROOF = SubLObjectFactory.makeSymbol("CB-LINK-USE-IN-PROOF");
        $str521$_a_does_not_specify_a_rule = SubLObjectFactory.makeString("~a does not specify a rule");
        $sym522$CB_REINFORCE_RULE = SubLObjectFactory.makeSymbol("CB-REINFORCE-RULE");
        $str523$_Reinforce_ = SubLObjectFactory.makeString("[Reinforce]");
        $str524$cb_reinforce_rule__a = SubLObjectFactory.makeString("cb-reinforce-rule&~a");
        $sym525$CB_LINK_REINFORCE_RULE = SubLObjectFactory.makeSymbol("CB-LINK-REINFORCE-RULE");
        $int526$100 = SubLObjectFactory.makeInteger(100);
        $kw527$STRENGTH_INPUT_NAME = SubLObjectFactory.makeKeyword("STRENGTH-INPUT-NAME");
        $kw528$DIRECTION_INPUT_NAME = SubLObjectFactory.makeKeyword("DIRECTION-INPUT-NAME");
        $str529$Strength__ = SubLObjectFactory.makeString("Strength :");
        $str530$_default_strength = SubLObjectFactory.makeString(":default-strength");
        $str531$_monotonic_strength = SubLObjectFactory.makeString(":monotonic-strength");
        $str532$Direction__ = SubLObjectFactory.makeString("Direction :");
        $str533$_ = SubLObjectFactory.makeString("[");
        $str534$_ = SubLObjectFactory.makeString("]");
        $kw535$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $str536$cb_assertion_graph__A = SubLObjectFactory.makeString("cb-assertion-graph&~A");
        $kw537$ASSERTION_GRAPH = SubLObjectFactory.makeKeyword("ASSERTION-GRAPH");
        $sym538$CB_LINK_ASSERTION_GRAPH = SubLObjectFactory.makeSymbol("CB-LINK-ASSERTION-GRAPH");
        $sym539$CB_ASSERTION_GRAPH = SubLObjectFactory.makeSymbol("CB-ASSERTION-GRAPH");
        $str540$Graph_of_an_assertion = SubLObjectFactory.makeString("Graph of an assertion");
        $str541$Refresh = SubLObjectFactory.makeString("Refresh");
        $str542$reloadCurrentFrame__reloadFrameBu = SubLObjectFactory.makeString("reloadCurrentFrame('reloadFrameButton');");
        $str543$Graph_for_ = SubLObjectFactory.makeString("Graph for:");
        $str544$Rule_Graph = SubLObjectFactory.makeString("Rule Graph");
        $str545$Unknown_Graph = SubLObjectFactory.makeString("Unknown Graph");
        $str546$_a = SubLObjectFactory.makeString("~a");
        $int547$30 = SubLObjectFactory.makeInteger(30);
        $kw548$BUILDER_FN = SubLObjectFactory.makeKeyword("BUILDER-FN");
        $sym549$BBF_RULE = SubLObjectFactory.makeSymbol("BBF-RULE");
        $kw550$ASSERTIONS = SubLObjectFactory.makeKeyword("ASSERTIONS");
        $int551$800 = SubLObjectFactory.makeInteger(800);
        $int552$600 = SubLObjectFactory.makeInteger(600);
        $kw553$SIGNATURE = SubLObjectFactory.makeKeyword("SIGNATURE");
    }
    
    public static final class $cb_assertion_spec_native extends SubLStructNative
    {
        public SubLObject $sentence;
        public SubLObject $mt;
        public SubLObject $strength;
        public SubLObject $direction;
        public SubLObject $unasserts;
        public SubLObject $metas;
        private static final SubLStructDeclNative structDecl;
        
        public $cb_assertion_spec_native() {
            this.$sentence = (SubLObject)CommonSymbols.NIL;
            this.$mt = (SubLObject)CommonSymbols.NIL;
            this.$strength = (SubLObject)CommonSymbols.NIL;
            this.$direction = (SubLObject)CommonSymbols.NIL;
            this.$unasserts = (SubLObject)CommonSymbols.NIL;
            this.$metas = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$cb_assertion_spec_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$sentence;
        }
        
        public SubLObject getField3() {
            return this.$mt;
        }
        
        public SubLObject getField4() {
            return this.$strength;
        }
        
        public SubLObject getField5() {
            return this.$direction;
        }
        
        public SubLObject getField6() {
            return this.$unasserts;
        }
        
        public SubLObject getField7() {
            return this.$metas;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$sentence = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$strength = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$direction = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$unasserts = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$metas = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$cb_assertion_spec_native.class, cb_assertion_editor.$sym1$CB_ASSERTION_SPEC, cb_assertion_editor.$sym2$CB_ASSERTION_SPEC_P, cb_assertion_editor.$list3, cb_assertion_editor.$list4, new String[] { "$sentence", "$mt", "$strength", "$direction", "$unasserts", "$metas" }, cb_assertion_editor.$list5, cb_assertion_editor.$list6, cb_assertion_editor.$sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $cb_assertion_spec_p$UnaryFunction extends UnaryFunction
    {
        public $cb_assertion_spec_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CB-ASSERTION-SPEC-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return cb_assertion_editor.cb_assertion_spec_p(arg1);
        }
    }
}

/*

	Total time: 3893 ms
	 synthetic 
*/