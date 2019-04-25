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

public final class cb_editor extends SubLTranslatedFile
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
    public static SubLObject cb_create_hook(final SubLObject new_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)cb_editor.NIL, thread);
            return ke.ke_create(new_name);
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 847L)
    public static SubLObject cb_hypothesize_hook(final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)cb_editor.NIL;
        SubLObject error = (SubLObject)cb_editor.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)cb_editor.NIL, thread);
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cb_editor.$sym1$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        ans = prove.fi_hypothesize(formula, mt, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cb_editor.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return (cb_editor.NIL != error) ? error : ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 1058L)
    public static SubLObject cb_term_toolbar(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL != forts.fort_p(fort)) {
            final SubLObject modification_permittedP = term_modification_permittedP(fort);
            final SubLObject not_modifiableP = (SubLObject)SubLObjectFactory.makeBoolean(cb_editor.NIL == modification_permittedP);
            if (cb_editor.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread)) {
                if (cb_editor.NIL != cb_editor.$cb_enable_legacy_create_similar$.getDynamicValue(thread)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw2$CREATE_SIMILAR_LEGACY, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_editor.$kw3$CREATE_SIMILAR, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                if (cb_editor.NIL != fort_types_interface.collectionP(fort)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw4$CREATE_INSTANCE, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (cb_editor.NIL != fort_types_interface.collectionP(fort)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw5$CREATE_SPEC, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (cb_editor.NIL != cycl_grammar.cycl_predicate_p(fort)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw6$CREATE_SPEC_PRED, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (cb_editor.NIL != fort_types_interface.microtheory_p(fort)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw7$CREATE_SPEC_MT, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (cb_editor.NIL == nart_handles.nart_p(fort)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw8$RENAME, fort, (SubLObject)cb_editor.NIL, not_modifiableP, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (cb_editor.NIL != term_as_merge_source_permittedP(fort)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw9$MERGE, fort, (SubLObject)cb_editor.NIL, not_modifiableP, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                if (cb_editor.NIL != cb_parameters.$cb_confirm_kills$.getDynamicValue(thread)) {
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw10$CONFIRM_KILL, fort, (SubLObject)cb_editor.NIL, not_modifiableP, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                }
                else {
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw11$KILL, fort, (SubLObject)cb_editor.NIL, not_modifiableP, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (cb_editor.NIL != cb_parameters.$show_kb_monitor_links$.getDynamicValue(thread)) {
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_editor.$kw12$KB_MONITOR_INDEX_HOOK, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            final SubLObject unlexifiedP = lexification_utilities.unlexifiedP(fort, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL != unlexifiedP) {
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_editor.$kw13$LEXIFY_TERM, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            }
            else {
                cb_utilities.cb_link((SubLObject)cb_editor.$kw13$LEXIFY_TERM, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            }
            if (cb_editor.NIL != kct_utils.kct_test_spec_p(fort, (SubLObject)cb_editor.UNPROVIDED)) {
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                final SubLObject ttt_linkP = (SubLObject)cb_editor.NIL;
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                if (cb_editor.NIL != ttt_linkP) {
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw14$TTT_TEST, fort, (SubLObject)cb_editor.$str15$_Take_Test_, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                }
                else {
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw16$KCT_TEST, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                final SubLObject query = kct_utils.kct_query_specification(fort, (SubLObject)cb_editor.UNPROVIDED);
                if (cb_editor.NIL != forts.fort_p(query)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw17$KBQ_ASK, query, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    if (cb_editor.NIL != cb_kb_query.kbq_query_practice_rules(query)) {
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_editor.$kw18$KBQ_ASK_IN_PROOF_CHECKER, query, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    }
                }
            }
            if (cb_editor.NIL != kct_utils.kct_test_collection_p(fort, (SubLObject)cb_editor.UNPROVIDED)) {
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_editor.$kw19$KCT_TEST_SET, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (cb_editor.NIL != kct_utils.kct_test_spec_p(fort, (SubLObject)cb_editor.UNPROVIDED)) {
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_editor.$kw20$KCT_EDIT, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (cb_editor.NIL != kb_query.kbq_query_spec_p(fort)) {
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_editor.$kw17$KBQ_ASK, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                if (cb_editor.NIL != cb_kb_query.kbq_query_practice_rules(fort)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw18$KBQ_ASK_IN_PROOF_CHECKER, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_editor.$kw21$KBQ_EDIT, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (cb_editor.NIL != iterative_template_parser.syntactic_option_node_p(fort)) {
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_editor.$kw22$SYNTACTIC_NODE_TOOLKIT, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
            if (cb_editor.NIL != sksi_kb_accessors.sk_source_in_any_mt_p(fort)) {
                final SubLObject pcase_var = sksi_sks_manager.sks_registration_state(fort);
                if (pcase_var.eql((SubLObject)cb_editor.$kw23$NOREG)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw24$SKSI_REGISTER, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                else if (pcase_var.eql((SubLObject)cb_editor.$kw25$PARTIAL)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw24$SKSI_REGISTER, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw26$SKSI_DEREGISTER, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                else if (pcase_var.eql((SubLObject)cb_editor.$kw27$REG)) {
                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw26$SKSI_DEREGISTER, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                if (cb_editor.NIL != sksi_smt.$allow_smt_editing_links$.getDynamicValue(thread) && cb_editor.NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(fort)) {
                    cb_utilities.cb_link((SubLObject)cb_editor.$kw28$EDIT_IN_SMT, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                }
            }
            if (cb_editor.NIL != isa.isa_in_any_mtP(fort, cb_editor.$const29$Ontology)) {
                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_editor.$kw30$CB_OWL_EXPORT_XML, (SubLObject)cb_editor.$str31$_OWL_Export_, html_arghash.arglist_to_arghash((SubLObject)ConsesLow.list((SubLObject)cb_editor.$list32, (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str33$_ontology, fort))), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            }
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 5685L)
    public static SubLObject term_modification_permittedP(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_editor.NIL == term_modification_forbiddenP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 5863L)
    public static SubLObject term_modification_forbiddenP(final SubLObject v_term) {
        if (cb_editor.NIL != constant_completion.constant_mentioned_in_codeP(v_term) || cb_editor.NIL != isa.quoted_isa_in_any_mtP(v_term, cb_editor.$const34$ReservedConstant)) {
            return (SubLObject)cb_editor.T;
        }
        return sbhl_time_utilities.sbhl_temporal_point_nartP(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 6909L)
    public static SubLObject term_as_merge_source_permittedP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_editor.NIL != constant_handles.constant_p(v_term) || (cb_editor.NIL != nart_handles.nart_p(v_term) && cb_editor.NIL != list_utilities.member_eqP(cycl_utilities.nat_function(v_term), cb_editor.$merge_permitted_functions$.getDynamicValue(thread))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 7174L)
    public static SubLObject cb_create(SubLObject args) {
        if (args == cb_editor.UNPROVIDED) {
            args = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str38$the_Create_Constant_page);
        }
        else {
            final SubLObject title_var = (SubLObject)cb_editor.$str39$Create_Constant;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_editor.$str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_editor.$str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_editor.$kw43$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_editor.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css((SubLObject)cb_editor.$kw44$SAM_AUTOCOMPLETE_CSS);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str46$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str47$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str49$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_editor.$str50$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_editor.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str51$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            if (cb_editor.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_editor.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_editor.$str52$cb_handle_create, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)cb_editor.$kw36$CB_CREATE, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_reset_input((SubLObject)cb_editor.$str53$Clear);
                                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)cb_editor.$str39$Create_Constant, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_editor.$str54$Enter_name_for_new_constant___);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                html_complete.html_complete_button((SubLObject)cb_editor.$str55$new_name, (SubLObject)cb_editor.$str56$Complete, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_text_input((SubLObject)cb_editor.$str55$new_name, (SubLObject)cb_editor.$str57$, (SubLObject)cb_editor.$int58$40);
                                html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                cb_utilities.cb_doc_link((SubLObject)cb_editor.$str59$creating, (SubLObject)cb_editor.$str60$Cyc_Naming_Conventions, cb_utilities.cyc_system_doc_naming_conventions(), (SubLObject)cb_editor.UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 7904L)
    public static SubLObject cb_handle_create(final SubLObject args) {
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str63$Creating);
            return (SubLObject)cb_editor.NIL;
        }
        final SubLObject new_name = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cb_editor.$str55$new_name, args));
        if (!new_name.isString() || new_name.equal((SubLObject)cb_editor.$str57$)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str64$No_name_was_specified, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else if (cb_editor.NIL == constant_completion_high.valid_constant_name_p(new_name)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str65$_S_is_not_a_valid_constant_name, new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else if (cb_editor.NIL != constants_high.find_constant(new_name)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str66$Already_a_constant_named__a, new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else {
            final SubLObject new_constant = cb_create_hook(new_name);
            if (cb_editor.NIL != constant_handles.constant_p(new_constant)) {
                cb_tools.cb_add_to_constant_history(new_constant);
                cb_assertion_editor.cb_note_edit_change((SubLObject)cb_editor.$str67$Constant_Create, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            }
            else {
                cb_utilities.cb_error((SubLObject)cb_editor.$str68$Unable_to_create_a_constant_named, new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            }
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 8817L)
    public static SubLObject cb_link_create(SubLObject linktext) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str72$Create;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_editor.$str74$cb_create);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 9375L)
    public static SubLObject cb_create_similar_legacy(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str81$the_Create_Similar_Term_page);
        }
        else {
            SubLObject fort_spec = (SubLObject)cb_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_editor.$list82);
            fort_spec = args.first();
            final SubLObject current = args.rest();
            if (cb_editor.NIL == current) {
                final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_editor.UNPROVIDED);
                if (cb_editor.NIL == forts.fort_p(fort)) {
                    cb_utilities.cb_error((SubLObject)cb_editor.$str83$_a_does_not_specify_a_Cyc_term, fort_spec, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    return (SubLObject)cb_editor.NIL;
                }
                fort_spec = cb_utilities.cb_fort_identifier(fort);
                final SubLObject title_var = (SubLObject)cb_editor.$str84$Create_Similar_Term;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((cb_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)cb_editor.$str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (cb_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str41$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_editor.$kw43$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (cb_editor.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_complete.html_complete_script();
                        cyc_file_dependencies.css((SubLObject)cb_editor.$kw44$SAM_AUTOCOMPLETE_CSS);
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (cb_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str46$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str47$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_editor.$str49$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_editor.$str50$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (cb_editor.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                }
                                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str51$post);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                if (cb_editor.NIL != frame_name_var) {
                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(frame_name_var);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_editor.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_editor.$str85$cb_handle_create_similar_legacy, fort_spec, (SubLObject)cb_editor.UNPROVIDED);
                                    cb_utilities.cb_help_preamble((SubLObject)cb_editor.$kw78$CB_CREATE_SIMILAR, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_editor.$str86$Enter_name_for_new_term_similar_t);
                                    cb_utilities.cb_form(fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_editor.$str87$__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                    html_utilities.html_autocomplete_text_input((SubLObject)cb_editor.$str55$new_name, (SubLObject)cb_editor.$str57$, (SubLObject)cb_editor.$int58$40, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_reset_input((SubLObject)cb_editor.$str53$Clear);
                                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_submit_input((SubLObject)cb_editor.$str88$Create_Similar, (SubLObject)cb_editor.$str89$create, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_submit_input((SubLObject)cb_editor.$str90$Copy_Assertions, (SubLObject)cb_editor.$str91$copy, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                    cb_utilities.cb_doc_link((SubLObject)cb_editor.$str59$creating, (SubLObject)cb_editor.$str60$Cyc_Naming_Conventions, cb_utilities.cyc_system_doc_naming_conventions(), (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_editor.$str92$Check_the_assertions_from_);
                                    cb_utilities.cb_form(fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_editor.$str93$_which_you_wish_to_copy_as_well__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                    final SubLObject _prev_bind_0_$12 = cb_parameters.$cb_assertion_link_hook$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$13 = cb_parameters.$cb_c_gaf_arg_use_binary$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$14 = cb_parameters.$cb_c_default_content$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = cb_parameters.$cb_c_suppress_body_level_elements$.currentBinding(thread);
                                    try {
                                        cb_parameters.$cb_assertion_link_hook$.bind((SubLObject)cb_editor.$sym94$CB_CREATE_SIMILAR_CHECKBOX, thread);
                                        cb_parameters.$cb_c_gaf_arg_use_binary$.bind((SubLObject)cb_editor.NIL, thread);
                                        cb_parameters.$cb_c_default_content$.bind((SubLObject)cb_editor.$kw95$MAXIMAL, thread);
                                        cb_parameters.$cb_c_suppress_body_level_elements$.bind((SubLObject)cb_editor.T, thread);
                                        cb_frames.cb_default_content_internal(fort);
                                    }
                                    finally {
                                        cb_parameters.$cb_c_suppress_body_level_elements$.rebind(_prev_bind_4, thread);
                                        cb_parameters.$cb_c_default_content$.rebind(_prev_bind_2_$14, thread);
                                        cb_parameters.$cb_c_gaf_arg_use_binary$.rebind(_prev_bind_1_$13, thread);
                                        cb_parameters.$cb_assertion_link_hook$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_editor.$list82);
            }
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 9375L)
    public static SubLObject cb_handle_create_similar_legacy(final SubLObject args) {
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str97$create_similar_facilities);
            return (SubLObject)cb_editor.NIL;
        }
        final SubLObject source_fort = cb_utilities.cb_guess_fort(args.first(), (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject new_name = string_utilities.trim_whitespace(html_utilities.html_extract_input((SubLObject)cb_editor.$str55$new_name, args));
        SubLObject target_term = (SubLObject)cb_editor.NIL;
        final SubLObject copy = html_utilities.html_extract_input((SubLObject)cb_editor.$str91$copy, args);
        if (cb_editor.NIL == forts.fort_p(source_fort)) {
            return cb_utilities.cb_error((SubLObject)cb_editor.$str98$Unable_to_determine_a_term_from__, args.first(), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        if (!new_name.isString() || new_name.equal((SubLObject)cb_editor.$str57$)) {
            return cb_utilities.cb_error((SubLObject)cb_editor.$str99$No_term_was_specified, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        if (cb_editor.NIL == copy && cb_editor.NIL == constant_completion_high.valid_constant_name_p(new_name) && cb_editor.NIL == cb_utilities.cb_guess_naut(new_name, (SubLObject)cb_editor.UNPROVIDED)) {
            return cb_utilities.cb_error((SubLObject)cb_editor.$str100$_S_is_not_a_valid_term_name, new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        if (cb_editor.NIL != cb_utilities.cb_guess_naut(new_name, (SubLObject)cb_editor.UNPROVIDED)) {
            target_term = cb_utilities.cb_guess_naut(new_name, (SubLObject)cb_editor.UNPROVIDED);
        }
        else if (cb_editor.NIL != copy) {
            final SubLObject existing_fort = cb_utilities.cb_guess_fort(new_name, (SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL == forts.fort_p(existing_fort)) {
                return cb_utilities.cb_error((SubLObject)cb_editor.$str98$Unable_to_determine_a_term_from__, new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            }
            target_term = existing_fort;
        }
        else {
            final SubLObject exact_constant = constants_high.find_constant(new_name);
            if (cb_editor.NIL != exact_constant) {
                return cb_utilities.cb_error((SubLObject)cb_editor.$str101$Already_a_constant_named__S, new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            }
            final SubLObject inexact_constants = constant_completion_high.constant_complete(new_name, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL != inexact_constants) {
                return cb_utilities.cb_error((SubLObject)cb_editor.$str102$Constant__S_already_exists_which_, inexact_constants.first(), new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            }
            target_term = cb_create_hook(new_name);
        }
        if (cb_editor.NIL == cycl_utilities.fort_or_naut_p(target_term)) {
            return cb_utilities.cb_error((SubLObject)cb_editor.$str103$Unable_to_create_a_similar_term_n, new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        cb_tools.cb_add_to_history(target_term);
        final SubLObject source_fort_el_formula = forts.fort_el_formula(source_fort);
        final SubLObject target_term_el_formula = (cb_editor.NIL != el_utilities.el_formula_p(target_term)) ? target_term : forts.fort_el_formula(target_term);
        SubLObject cdolist_list_var = conses_high.nthcdr((SubLObject)cb_editor.THREE_INTEGER, args);
        SubLObject copy_spec = (SubLObject)cb_editor.NIL;
        copy_spec = cdolist_list_var.first();
        while (cb_editor.NIL != cdolist_list_var) {
            final SubLObject id = reader.read_from_string_ignoring_errors(copy_spec.first(), (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            if (id.isInteger()) {
                final SubLObject assertion = assertion_handles.find_assertion_by_id(id);
                if (cb_editor.NIL != assertion_handles.assertion_p(assertion)) {
                    SubLObject similar_formula = ke.ke_assertion_edit_formula(assertion);
                    SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject strength = assertions_high.assertion_strength(assertion);
                    final SubLObject direction = assertions_high.assertion_direction(assertion);
                    if (cb_editor.NIL != list_utilities.tree_find(source_fort_el_formula, similar_formula, Symbols.symbol_function((SubLObject)cb_editor.EQUAL), (SubLObject)cb_editor.UNPROVIDED) || cb_editor.NIL != list_utilities.tree_find(source_fort_el_formula, mt, Symbols.symbol_function((SubLObject)cb_editor.$sym104$HLMT_EQUAL), (SubLObject)cb_editor.UNPROVIDED)) {
                        similar_formula = conses_high.subst(target_term_el_formula, source_fort_el_formula, similar_formula, Symbols.symbol_function((SubLObject)cb_editor.EQUAL), (SubLObject)cb_editor.UNPROVIDED);
                        mt = conses_high.subst(target_term_el_formula, source_fort_el_formula, mt, Symbols.symbol_function((SubLObject)cb_editor.EQUAL), (SubLObject)cb_editor.UNPROVIDED);
                        ke.ke_assert(similar_formula, mt, strength, direction);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            copy_spec = cdolist_list_var.first();
        }
        if (cb_editor.NIL != copy) {
            return cb_assertion_editor.cb_note_edit_change((SubLObject)cb_editor.$str90$Copy_Assertions, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        return cb_assertion_editor.cb_note_edit_change((SubLObject)cb_editor.$str88$Create_Similar, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 14093L)
    public static SubLObject cb_handle_create_similar(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            if (cb_editor.NIL != ke.cyclist_is_guest()) {
                try {
                    final SubLObject _prev_bind_0_$15 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str106$error, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$16 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                            PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str107$_S, cyc_navigator_internals.guest_warn_string((SubLObject)cb_editor.$str97$create_similar_facilities));
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$15, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str106$error);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                    }
                }
                return (SubLObject)cb_editor.NIL;
            }
            final SubLObject new_term_name = html_utilities.html_extract_input((SubLObject)cb_editor.$str108$focalterm, args);
            SubLObject new_term = cycl_utilities.find_denotational_term(new_term_name);
            SubLObject problem_sentence_info = (SubLObject)cb_editor.NIL;
            SubLObject good_sentences = (SubLObject)cb_editor.NIL;
            if (cb_editor.NIL == new_term) {
                if (cb_editor.NIL != new_term_name && cb_editor.NIL == create_similar_valid_nat_nameP(new_term_name) && cb_editor.NIL == constant_completion_high.valid_constant_name_p(new_term_name)) {
                    try {
                        final SubLObject _prev_bind_0_$18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str109$response, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$19 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str106$error, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$22 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str110$invalidTerm, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str111$_S_is_not_a_valid_term_name_, new_term_name);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$22, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str110$invalidTerm);
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$21, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$20, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str106$error);
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                    }
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$18, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                            final SubLObject _values4 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str109$response);
                            Values.restoreValuesFromVector(_values4);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                        }
                    }
                    return (SubLObject)cb_editor.NIL;
                }
                if (cb_editor.NIL != new_term_name && cb_editor.NIL != constant_completion_high.constant_complete(new_term_name, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED)) {
                    try {
                        final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str109$response, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                            final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                try {
                                    final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str106$error, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                            try {
                                                final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str110$invalidTerm, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str112$Constant__A_already_exists__which, constant_completion_high.constant_complete(new_term_name, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED).first(), new_term_name);
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$24, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                                    final SubLObject _values5 = Values.getValuesAsVector();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str110$invalidTerm);
                                                    Values.restoreValuesFromVector(_values5);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                                        }
                                    }
                                    finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$23, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$29, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                        final SubLObject _values6 = Values.getValuesAsVector();
                                        xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str106$error);
                                        Values.restoreValuesFromVector(_values6);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                    }
                                }
                            }
                            finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                        finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                            final SubLObject _values7 = Values.getValuesAsVector();
                            xml_utilities.xml_terpri();
                            xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str109$response);
                            Values.restoreValuesFromVector(_values7);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                        }
                    }
                    return (SubLObject)cb_editor.NIL;
                }
                if (cb_editor.NIL != constant_completion_high.valid_constant_name_p(new_term_name)) {
                    new_term = cb_create_hook(new_term_name);
                }
                else if (cb_editor.NIL != new_term_name) {
                    new_term = reader.read_from_string_ignoring_errors(string_utilities.cyclify_string(new_term_name), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                }
            }
            if (cb_editor.NIL != new_term_name && cb_editor.NIL == cycl_utilities.fort_or_naut_p(new_term)) {
                try {
                    final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str109$response, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                            try {
                                final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str106$error, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str113$Unable_to_create_a_term_named__S_, new_term_name);
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$39, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$25, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$38, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                    final SubLObject _values8 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str106$error);
                                    Values.restoreValuesFromVector(_values8);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                                }
                            }
                            return (SubLObject)cb_editor.NIL;
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$36, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                        final SubLObject _values9 = Values.getValuesAsVector();
                        xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str109$response);
                        Values.restoreValuesFromVector(_values9);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            }
            SubLObject cdolist_list_var = args;
            SubLObject arg = (SubLObject)cb_editor.NIL;
            arg = cdolist_list_var.first();
            while (cb_editor.NIL != cdolist_list_var) {
                if (cb_editor.NIL != list_utilities.proper_list_p(arg)) {
                    final SubLObject param = arg.first();
                    if (cb_editor.NIL != string_utilities.starts_with(param, (SubLObject)cb_editor.$str114$sentence)) {
                        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)ConsesLow.list((SubLObject)cb_editor.$kw115$INPUT_NAME, param));
                        final SubLObject sentence_num = Sequences.subseq(param, (SubLObject)cb_editor.EIGHT_INTEGER, (SubLObject)cb_editor.UNPROVIDED);
                        if (cycl_utilities.formula_arg0(sentence).equal(cb_editor.$const116$unknownSentence)) {
                            good_sentences = (SubLObject)ConsesLow.cons(sentence, good_sentences);
                        }
                        else if (cb_editor.NIL != wff.el_lenient_wff_assertibleP(sentence, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED)) {
                            good_sentences = (SubLObject)ConsesLow.cons(sentence, good_sentences);
                        }
                        else {
                            problem_sentence_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cb_editor.$kw117$SENTENCE_NUM, sentence_num, (SubLObject)cb_editor.$kw118$SENTENCE, html_utilities.html_extract_input(param, args)), problem_sentence_info);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
            if (cb_editor.NIL == problem_sentence_info) {
                cdolist_list_var = Sequences.nreverse(good_sentences);
                SubLObject sentence2 = (SubLObject)cb_editor.NIL;
                sentence2 = cdolist_list_var.first();
                while (cb_editor.NIL != cdolist_list_var) {
                    if (cycl_utilities.formula_arg0(sentence2).eql(cb_editor.$const116$unknownSentence)) {
                        ke.ke_unassert(cycl_utilities.formula_arg1(sentence2, (SubLObject)cb_editor.UNPROVIDED), cb_editor.$const119$BaseKB);
                    }
                    else {
                        ke.ke_assert(sentence2, cb_editor.$const119$BaseKB, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sentence2 = cdolist_list_var.first();
                }
            }
            try {
                final SubLObject _prev_bind_0_$42 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str109$response, (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str120$newTermId, kb_utilities.compact_hl_external_id_string(new_term)), (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                        if (cb_editor.NIL != problem_sentence_info) {
                            try {
                                final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str106$error, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                        SubLObject cdolist_list_var2 = problem_sentence_info;
                                        SubLObject sentence_info = (SubLObject)cb_editor.NIL;
                                        sentence_info = cdolist_list_var2.first();
                                        while (cb_editor.NIL != cdolist_list_var2) {
                                            final SubLObject sentence3 = conses_high.getf(sentence_info, (SubLObject)cb_editor.$kw118$SENTENCE, (SubLObject)cb_editor.UNPROVIDED);
                                            final SubLObject attrs = (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str121$id, conses_high.getf(sentence_info, (SubLObject)cb_editor.$kw117$SENTENCE_NUM, (SubLObject)cb_editor.UNPROVIDED));
                                            try {
                                                final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                try {
                                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str122$invalidSentence, attrs, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                                    final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                    try {
                                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                                        xml_utilities.xml_cdata(format_nil.format_nil_s(sentence3));
                                                    }
                                                    finally {
                                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$47, thread);
                                                    }
                                                }
                                                finally {
                                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$27, thread);
                                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$46, thread);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                                    final SubLObject _values10 = Values.getValuesAsVector();
                                                    xml_utilities.xml_terpri();
                                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str122$invalidSentence);
                                                    Values.restoreValuesFromVector(_values10);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                                }
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            sentence_info = cdolist_list_var2.first();
                                        }
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$45, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$26, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$44, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                    final SubLObject _values11 = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str106$error);
                                    Values.restoreValuesFromVector(_values11);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                }
                            }
                        }
                        else {
                            final SubLObject attrs2 = (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str123$count, string_utilities.to_string(Sequences.length(good_sentences)));
                            try {
                                final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str124$assertionsQueued, attrs2, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                        PrintLow.format(xml_vars.$xml_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str125$_A_assertions_added_to_the_local_, Sequences.length(good_sentences));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$51, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$28, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$50, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                    final SubLObject _values12 = Values.getValuesAsVector();
                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str124$assertionsQueued);
                                    Values.restoreValuesFromVector(_values12);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                }
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$43, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_3, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$42, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                    final SubLObject _values13 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str109$response);
                    Values.restoreValuesFromVector(_values13);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                }
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 17108L)
    public static SubLObject cb_link_create_similar(final SubLObject fort, SubLObject linktext) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str128$_Create_Similar_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str129$cb_create_similar__A, cb_utilities.cb_fort_identifier(fort));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 17367L)
    public static SubLObject cb_create_similar_guest_warn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (cb_editor.NIL != cb_html_parameters.$cb_html_warn_class$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(cb_html_parameters.$cb_html_warn_class$.getDynamicValue(thread));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str131$color_red__font_size_120___font_w);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            if (operation_communication.the_cyclist().equal(cb_editor.$const132$Guest)) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str133$Sorry__);
                cb_utilities.cb_form(operation_communication.the_cyclist(), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_editor.$str134$_cannot_make_assertions_using_the);
                cyc_navigator_internals.nav_link((SubLObject)cb_editor.$kw135$CB_LOGIN, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$str136$login, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_editor.$str137$_using_your_real_name_now_so_that);
                html_utilities.html_br();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 17862L)
    public static SubLObject cb_similar_button_row(SubLObject id_suffix) {
        if (id_suffix == cb_editor.UNPROVIDED) {
            id_suffix = (SubLObject)cb_editor.$str57$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lookup_id = Sequences.cconcatenate((SubLObject)cb_editor.$str138$lookupbutton, id_suffix);
        final SubLObject assert_id = Sequences.cconcatenate((SubLObject)cb_editor.$str139$assertbutton, id_suffix);
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str140$font_size_10pt);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_editor.$str141$All_Mts);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str142$togglecheckall___);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_attribute_title$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str143$Check_All___Uncheck_All);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str140$font_size_10pt);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_editor.$str144$Undo);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str145$uncommit__);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str140$font_size_10pt);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_editor.$str146$Redo);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str147$recommit__);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str140$font_size_10pt);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != lookup_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(lookup_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_editor.$str148$Switch_to_Browse_Mode);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str149$togglelookupmode__);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_input_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str140$font_size_10pt);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != assert_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(assert_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_editor.$str150$SEND);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str151$dosubmit__);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_attribute_title$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_editor.$str152$Assert_selected_sentences);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 18671L)
    public static SubLObject xml_fort_info(final SubLObject fort_spec, SubLObject content_spec) {
        if (content_spec == cb_editor.UNPROVIDED) {
            content_spec = (SubLObject)cb_editor.$kw153$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject derived_to_always_include = (SubLObject)((cb_editor.NIL != nart_handles.nart_p(fort)) ? narts_high.nart_dependent_assertions(fort) : cb_editor.NIL);
        final SubLObject preds = fort_info_preds(fort, content_spec);
        final SubLObject max_arities = Mapping.mapcar((SubLObject)cb_editor.$sym154$MAX_ARITY, preds);
        final SubLObject max_arity = list_utilities.extremal(Sequences.remove((SubLObject)cb_editor.NIL, max_arities, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), (SubLObject)cb_editor.$sym155$_, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject copy_term = (cb_editor.NIL != constant_handles.constant_p(fort)) ? fort : constants_high.gentemp_constant(Strings.string_upcase(string_utilities.string_subst((SubLObject)cb_editor.$str57$, (SubLObject)cb_editor.$str156$_, string_utilities.string_subst((SubLObject)cb_editor.$str57$, (SubLObject)cb_editor.$str157$_, string_utilities.string_subst((SubLObject)cb_editor.$str158$_, (SubLObject)cb_editor.$str159$_, cycl_utilities.denotational_term_name(fort), (SubLObject)cb_editor.UNPROVIDED), (SubLObject)cb_editor.UNPROVIDED), (SubLObject)cb_editor.UNPROVIDED), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject focal_term_name = constants_high.constant_name(copy_term);
        final SubLObject assertion_attrs = (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str160$focalTerm, focal_term_name, (SubLObject)cb_editor.$str161$hlid, kb_utilities.compact_hl_external_id_string(fort), (SubLObject)cb_editor.$str162$contentspec, content_spec);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_editor.$sym163$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_editor.$const164$EverythingPSC, thread);
            try {
                final SubLObject _prev_bind_0_$62 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                final SubLObject _prev_bind_1_$63 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str165$assertions, assertion_attrs, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                    final SubLObject _prev_bind_0_$63 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                    try {
                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
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
                        for (end_var = max_arity, pred_index = (SubLObject)cb_editor.NIL, pred_index = (SubLObject)cb_editor.ONE_INTEGER; !pred_index.numGE(end_var); pred_index = number_utilities.f_1X(pred_index)) {
                            cdolist_list_var = preds;
                            pred = (SubLObject)cb_editor.NIL;
                            pred = cdolist_list_var.first();
                            while (cb_editor.NIL != cdolist_list_var) {
                                pred_index_count = (SubLObject)cb_editor.ZERO_INTEGER;
                                pred_var = pred;
                                if (cb_editor.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, pred_index, pred_var)) {
                                    iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, pred_index, pred_var);
                                    done_var = (SubLObject)cb_editor.NIL;
                                    token_var = (SubLObject)cb_editor.NIL;
                                    while (cb_editor.NIL == done_var) {
                                        final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                        if (cb_editor.NIL != valid) {
                                            final_index_iterator = (SubLObject)cb_editor.NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)cb_editor.$kw166$GAF, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL);
                                                done_var_$65 = (SubLObject)cb_editor.NIL;
                                                token_var_$66 = (SubLObject)cb_editor.NIL;
                                                while (cb_editor.NIL == done_var_$65) {
                                                    v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$66);
                                                    valid_$67 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$66.eql(v_assert));
                                                    if (cb_editor.NIL != valid_$67 && !pred_index_count.numG((SubLObject)cb_editor.TWENTY_INTEGER) && (content_spec == cb_editor.$kw167$ALL_INFERRED || cb_editor.NIL != assertions_high.asserted_assertionP(v_assert) || cb_editor.NIL != subl_promotions.memberP(v_assert, derived_to_always_include, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED))) {
                                                        pred_index_count = Numbers.add(pred_index_count, (SubLObject)cb_editor.ONE_INTEGER);
                                                        try {
                                                            _prev_bind_0_$64 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            _prev_bind_1_$64 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str168$assertion, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                                                _prev_bind_0_$65 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                                                try {
                                                                    xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                                                    cycml.cycml_serialize_mt(assertions_high.assertion_mt(v_assert));
                                                                }
                                                                finally {
                                                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$65, thread);
                                                                }
                                                            }
                                                            finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$64, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$64, thread);
                                                            }
                                                        }
                                                        finally {
                                                            _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                                                _values = Values.getValuesAsVector();
                                                                xml_utilities.xml_terpri();
                                                                xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str168$assertion);
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                                            }
                                                        }
                                                        cycml.cycml_serialize_sentence(conses_high.subst(copy_term, fort, assertions_high.assertion_formula(v_assert), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED));
                                                    }
                                                    done_var_$65 = (SubLObject)SubLObjectFactory.makeBoolean(cb_editor.NIL == valid_$67);
                                                }
                                            }
                                            finally {
                                                _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                                    _values2 = Values.getValuesAsVector();
                                                    if (cb_editor.NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                                }
                                            }
                                        }
                                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(cb_editor.NIL == valid);
                                    }
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pred = cdolist_list_var.first();
                            }
                        }
                    }
                    finally {
                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$63, thread);
                    }
                }
                finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$63, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$62, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str165$assertions);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (cb_editor.NIL == constant_handles.constant_p(fort)) {
            constant_handles.free_constant(copy_term);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 20090L)
    public static SubLObject fort_info_preds(final SubLObject fort, SubLObject content_spec) {
        if (content_spec == cb_editor.UNPROVIDED) {
            content_spec = (SubLObject)cb_editor.$kw153$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = Sequences.nreverse(list_utilities.remove_duplicates_from_end(ConsesLow.nconc(isa.all_instances_in_all_mts(cb_editor.$const169$DocumentationPredicate), conses_high.copy_list(cb_utilities.cb_definitional_preds_for_fort(fort))), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED));
        if (kb_indexing.num_gaf_arg_index(fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED).numL((SubLObject)cb_editor.$int170$100)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_editor.$sym163$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(cb_editor.$const164$EverythingPSC, thread);
                final SubLObject pred_var = (SubLObject)cb_editor.NIL;
                if (cb_editor.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)cb_editor.NIL, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)cb_editor.NIL, pred_var);
                    SubLObject done_var = (SubLObject)cb_editor.NIL;
                    final SubLObject token_var = (SubLObject)cb_editor.NIL;
                    while (cb_editor.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (cb_editor.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)cb_editor.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)cb_editor.$kw166$GAF, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL);
                                SubLObject done_var_$74 = (SubLObject)cb_editor.NIL;
                                final SubLObject token_var_$75 = (SubLObject)cb_editor.NIL;
                                while (cb_editor.NIL == done_var_$74) {
                                    final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$75);
                                    final SubLObject valid_$76 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$75.eql(v_assert));
                                    if (cb_editor.NIL != valid_$76) {
                                        final SubLObject item_var = cycl_utilities.formula_arg0(v_assert);
                                        if (cb_editor.NIL == conses_high.member(item_var, preds, Symbols.symbol_function((SubLObject)cb_editor.EQUAL), Symbols.symbol_function((SubLObject)cb_editor.IDENTITY))) {
                                            preds = (SubLObject)ConsesLow.cons(item_var, preds);
                                        }
                                    }
                                    done_var_$74 = (SubLObject)SubLObjectFactory.makeBoolean(cb_editor.NIL == valid_$76);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (cb_editor.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(cb_editor.NIL == valid);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return Sequences.nreverse(preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 20697L)
    public static SubLObject create_similar_valid_nat_nameP(final SubLObject str) {
        final SubLObject cyclified = string_utilities.cyclify_string(str);
        final SubLObject listy = reader.read_from_string_ignoring_errors(cyclified, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_editor.NIL == cycl_utilities.expression_find_if((SubLObject)cb_editor.$sym171$SYMBOLP, listy, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED) && cb_editor.NIL != term.function_termP(listy));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 20951L)
    public static SubLObject cb_create_similar(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort_spec = args.first();
        final SubLObject content_spec = html_utilities.html_extract_sexpr((SubLObject)cb_editor.$str162$contentspec, args, (SubLObject)cb_editor.$kw153$DEFAULT);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject title_var = (SubLObject)cb_editor.$str57$;
            final SubLObject _prev_bind_0_$78 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_editor.$str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_editor.$str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$79 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_editor.$kw43$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_editor.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css((SubLObject)cb_editor.$kw44$SAM_AUTOCOMPLETE_CSS);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$80 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str46$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str47$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str49$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_editor.$str50$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_editor.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            cb_create_similar_guest_warn();
                            xml_fort_info(fort_spec, content_spec);
                            cyc_file_dependencies.javascript((SubLObject)cb_editor.$kw172$CB_CREATE_SIMILAR_JS);
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$80, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$79, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_$78, thread);
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 21317L)
    public static SubLObject cb_link_create_similar_legacy(final SubLObject fort, SubLObject linktext) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str128$_Create_Similar_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str174$cb_create_similar_legacy__A, cb_utilities.cb_fort_identifier(fort));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 21593L)
    public static SubLObject cb_link_create_instance(final SubLObject fort, SubLObject linktext) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str176$_Create_Instance_;
        }
        final SubLObject id = dhtml_macros.get_next_html_element_id();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str177$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string(fort), id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != id) {
            html_utilities.html_markup(html_macros.$html_anchor_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        if (cb_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 21950L)
    public static SubLObject cb_link_create_spec(final SubLObject fort, SubLObject linktext) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str179$_Create_Spec_;
        }
        final SubLObject id = dhtml_macros.get_next_html_element_id();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str180$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string(fort), id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != id) {
            html_utilities.html_markup(html_macros.$html_anchor_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        if (cb_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 22295L)
    public static SubLObject cb_link_create_spec_mt(final SubLObject fort, SubLObject linktext) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str182$_Create_Spec_Mt_;
        }
        final SubLObject id = dhtml_macros.get_next_html_element_id();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str183$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string(fort), id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != id) {
            html_utilities.html_markup(html_macros.$html_anchor_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        if (cb_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 22649L)
    public static SubLObject cb_link_create_spec_pred(final SubLObject fort, SubLObject linktext) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str185$_Create_Spec_Pred_;
        }
        final SubLObject id = dhtml_macros.get_next_html_element_id();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str186$javascript_startCreate___A_____A_, kb_utilities.compact_hl_external_id_string(fort), id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != id) {
            html_utilities.html_markup(html_macros.$html_anchor_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        if (cb_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 23009L)
    public static SubLObject cb_create_similar_checkbox(final SubLObject assertion) {
        if (cb_editor.NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject id = assertion_handles.assertion_id(assertion);
            html_utilities.html_checkbox_input(id, (SubLObject)cb_editor.T, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 23290L)
    public static SubLObject cb_rename(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str190$the_Rename_Constant_page);
        }
        else {
            final SubLObject constant = cb_utilities.cb_guess_constant(args);
            if (cb_editor.NIL == constant_handles.constant_p(constant)) {
                cb_utilities.cb_error((SubLObject)cb_editor.$str191$_a_does_not_specify_a_Cyc_constan, conses_high.second(args), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                return (SubLObject)cb_editor.NIL;
            }
            final SubLObject title_var = (SubLObject)cb_editor.$str192$Rename_Constant;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_editor.$str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_editor.$str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_editor.$kw43$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_editor.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css((SubLObject)cb_editor.$kw44$SAM_AUTOCOMPLETE_CSS);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$84 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str46$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str47$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str49$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_editor.$str50$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_editor.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str51$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            if (cb_editor.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_editor.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_editor.$str193$cb_handle_rename, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_hidden_input((SubLObject)cb_editor.$str121$id, cb_utilities.cb_fort_identifier(constant), (SubLObject)cb_editor.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)cb_editor.$kw188$CB_RENAME, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_editor.$str194$Enter_new_name_for_);
                                html_utilities.html_princ(constant);
                                html_utilities.html_princ((SubLObject)cb_editor.$str87$__);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                html_complete.html_complete_button((SubLObject)cb_editor.$str55$new_name, (SubLObject)cb_editor.$str56$Complete, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_text_input((SubLObject)cb_editor.$str55$new_name, constants_high.constant_name(constant), (SubLObject)cb_editor.$int58$40);
                                html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_reset_input((SubLObject)cb_editor.$str195$Current_Name);
                                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                                html_script_utilities.html_clear_input_button((SubLObject)cb_editor.$str55$new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)cb_editor.$str196$Rename, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                cb_utilities.cb_doc_link((SubLObject)cb_editor.$str197$naming, (SubLObject)cb_editor.$str60$Cyc_Naming_Conventions, cb_utilities.cyc_system_doc_naming_conventions(), (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
                                cb_utilities.cb_doc_link((SubLObject)cb_editor.$str198$renaming, (SubLObject)cb_editor.$str199$Cyc_Rename_Kill, cb_utilities.cyc_system_doc_rename_kill(), (SubLObject)cb_editor.UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$84, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$83, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 24514L)
    public static SubLObject cb_handle_rename(final SubLObject args) {
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str198$renaming);
            return (SubLObject)cb_editor.NIL;
        }
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_editor.$str121$id, args);
        final SubLObject new_name = html_utilities.html_extract_input((SubLObject)cb_editor.$str55$new_name, args);
        final SubLObject constant = cb_utilities.cb_guess_constant(id);
        if (cb_editor.NIL == constant_handles.constant_p(constant)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str201$Could_not_determine_a_term_from__, id, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else if (!new_name.isString()) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str64$No_name_was_specified, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else if (cb_editor.NIL == constant_completion_high.valid_constant_name_p(new_name)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str65$_S_is_not_a_valid_constant_name, new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else if (new_name.equal(constants_high.constant_name(constant))) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str202$Name_specified_is_same_as_current, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else if (cb_editor.NIL != constants_high.find_constant(new_name)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str66$Already_a_constant_named__a, new_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else {
            ke.ke_rename(constant, new_name);
            cb_assertion_editor.cb_note_edit_change((SubLObject)cb_editor.$str203$Constant_Rename, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 25336L)
    public static SubLObject cb_link_rename(final SubLObject constant, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        if (disabledP == cb_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str205$_Rename_;
        }
        if (cb_editor.NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str206$cb_rename__A, cb_utilities.cb_fort_identifier(constant));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 25723L)
    public static SubLObject cb_merge(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str210$the_Merge_Term_page);
        }
        else {
            final SubLObject fort = cb_utilities.cb_guess_fort(args, (SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL == forts.fort_p(fort)) {
                cb_utilities.cb_error((SubLObject)cb_editor.$str83$_a_does_not_specify_a_Cyc_term, conses_high.second(args), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                return (SubLObject)cb_editor.NIL;
            }
            final SubLObject title_var = (SubLObject)cb_editor.$str211$Merge_Term;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_editor.$str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_editor.$str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_editor.$kw43$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_editor.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_complete.html_complete_script();
                    cyc_file_dependencies.css((SubLObject)cb_editor.$kw44$SAM_AUTOCOMPLETE_CSS);
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str46$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str47$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str49$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_editor.$str50$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_editor.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str51$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            if (cb_editor.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_editor.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_editor.$str212$cb_handle_merge, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_hidden_input((SubLObject)cb_editor.$str213$fort_spec, cb_utilities.cb_fort_identifier(fort), (SubLObject)cb_editor.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)cb_editor.$kw208$CB_MERGE, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_editor.$str214$Merge_the_term_);
                                cb_utilities.cb_form(fort, (SubLObject)cb_editor.ZERO_INTEGER, (SubLObject)cb_editor.NIL);
                                html_utilities.html_princ((SubLObject)cb_editor.$str215$_onto_the_existing_constant_named);
                                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_autocomplete_text_input((SubLObject)cb_editor.$str216$target_name, (SubLObject)cb_editor.$str57$, (SubLObject)cb_editor.$int58$40, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_editor.TWO_INTEGER);
                                html_script_utilities.html_clear_input_button((SubLObject)cb_editor.$str216$target_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_submit_input((SubLObject)cb_editor.$str217$Merge, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$88, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 26566L)
    public static SubLObject cb_handle_merge(final SubLObject args) {
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str219$merging);
            return (SubLObject)cb_editor.NIL;
        }
        final SubLObject fort_spec = html_utilities.html_extract_input((SubLObject)cb_editor.$str213$fort_spec, args);
        final SubLObject source_fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject target_name = html_utilities.html_extract_input((SubLObject)cb_editor.$str216$target_name, args);
        if (cb_editor.NIL == forts.fort_p(source_fort)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str201$Could_not_determine_a_term_from__, fort_spec, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else if (!target_name.isString()) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str64$No_name_was_specified, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        final SubLObject target_term = cb_utilities.cb_guess_fort(target_name, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL == forts.fort_p(target_term)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str201$Could_not_determine_a_term_from__, target_name, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else if (source_fort.eql(target_term)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str220$Attempt_to_merge__S_with_itself_, source_fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        else {
            cb_tools.cb_rem_fort_from_all_histories(source_fort);
            ke.ke_merge(source_fort, target_term);
            cb_assertion_editor.cb_note_edit_change((SubLObject)cb_editor.$str211$Merge_Term, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 27430L)
    public static SubLObject cb_link_merge(final SubLObject fort, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        if (disabledP == cb_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str222$_Merge_;
        }
        if (cb_editor.NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str223$cb_merge__A, cb_utilities.cb_fort_identifier(fort));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 27724L)
    public static SubLObject cb_kill(final SubLObject args) {
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str225$the_Cyc_term_kill_facility);
        }
        else {
            final SubLObject fort_spec = args.first();
            final SubLObject confirmed = html_utilities.html_extract_input((SubLObject)cb_editor.$str226$confirmed, args);
            final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL == forts.fort_p(fort)) {
                cb_utilities.cb_error((SubLObject)cb_editor.$str83$_a_does_not_specify_a_Cyc_term, fort_spec, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                return (SubLObject)cb_editor.NIL;
            }
            cb_tools.cb_rem_fort_from_all_histories(fort);
            ke.ke_kill(fort);
            cb_assertion_editor.cb_note_edit_change((SubLObject)cb_editor.$str227$Term_Kill, (SubLObject)cb_editor.T, (SubLObject)((cb_editor.NIL != confirmed) ? cb_editor.THREE_INTEGER : cb_editor.TWO_INTEGER), (SubLObject)cb_editor.UNPROVIDED);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 28249L)
    public static SubLObject cb_link_kill(final SubLObject fort, SubLObject linktext, SubLObject disabledP, SubLObject not_confirmedP) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        if (disabledP == cb_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_editor.NIL;
        }
        if (not_confirmedP == cb_editor.UNPROVIDED) {
            not_confirmedP = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str229$_Kill_;
        }
        if (cb_editor.NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            if (cb_editor.NIL != not_confirmedP) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str230$cb_kill__A, cb_utilities.cb_fort_identifier(fort));
            }
            else {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str231$cb_kill__A_confirmed_T, cb_utilities.cb_fort_identifier(fort));
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 28710L)
    public static SubLObject cb_confirm_kill(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str225$the_Cyc_term_kill_facility);
        }
        else {
            SubLObject fort_spec = (SubLObject)cb_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_editor.$list82);
            fort_spec = args.first();
            final SubLObject current = args.rest();
            if (cb_editor.NIL == current) {
                final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_editor.UNPROVIDED);
                if (cb_editor.NIL == forts.fort_p(fort)) {
                    cb_utilities.cb_error((SubLObject)cb_editor.$str83$_a_does_not_specify_a_Cyc_term, fort_spec, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    return (SubLObject)cb_editor.NIL;
                }
                final SubLObject assertion_count = kb_indexing.num_index(fort);
                final SubLObject title_var = (SubLObject)cb_editor.$str235$Confirm_Term_Kill;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((cb_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)cb_editor.$str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (cb_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str41$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$93 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_editor.$kw43$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (cb_editor.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$94 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (cb_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str46$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str47$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_editor.$str49$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_editor.$str50$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (cb_editor.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                }
                                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str51$post);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                if (cb_editor.NIL != frame_name_var) {
                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(frame_name_var);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_editor.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_editor.$str236$cb_kill, fort_spec, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_hidden_input((SubLObject)cb_editor.$str226$confirmed, (SubLObject)cb_editor.$str237$T, (SubLObject)cb_editor.UNPROVIDED);
                                    cb_utilities.cb_help_preamble((SubLObject)cb_editor.$kw233$CB_CONFIRM_KILL, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    if (cb_editor.NIL == nart_handles.nart_p(fort)) {
                                        html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                        html_utilities.html_indent((SubLObject)cb_editor.THREE_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_editor.$str238$NOTE__);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
                                        html_utilities.html_princ((SubLObject)cb_editor.$str239$If_you_are_killing_this_term_to_r);
                                        cb_utilities.cb_link((SubLObject)cb_editor.$kw240$RECREATE, fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                        html_utilities.html_princ((SubLObject)cb_editor.$str241$_page_instead_);
                                        html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
                                    }
                                    html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_editor.$str242$Please_confirm_kill_of_);
                                    cb_utilities.cb_form(fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    if (assertion_count.numG((SubLObject)cb_editor.ZERO_INTEGER)) {
                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str243$_and_the_removal_of_all__S_assert, assertion_count);
                                    }
                                    html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                    cb_utilities.cb_back_button((SubLObject)cb_editor.$kw244$SELF, (SubLObject)cb_editor.$str245$No);
                                    html_utilities.html_submit_input((SubLObject)cb_editor.$str246$Yes__Kill, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                    cb_utilities.cb_doc_link((SubLObject)cb_editor.$str247$killing_constants, (SubLObject)cb_editor.$str199$Cyc_Rename_Kill, cb_utilities.cyc_system_doc_rename_kill(), (SubLObject)cb_editor.UNPROVIDED);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$94, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$93, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_editor.$list82);
            }
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 30042L)
    public static SubLObject cb_link_confirm_kill(final SubLObject fort, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        if (disabledP == cb_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str229$_Kill_;
        }
        if (cb_editor.NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str249$cb_confirm_kill__A, cb_utilities.cb_fort_identifier(fort));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 30443L)
    public static SubLObject cb_recreate(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str253$the_Cyc_constant_recreate_facilit);
            return (SubLObject)cb_editor.NIL;
        }
        SubLObject constant_spec = (SubLObject)cb_editor.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_editor.$list254);
        constant_spec = args.first();
        final SubLObject current = args.rest();
        if (cb_editor.NIL == current) {
            final SubLObject constant = cb_utilities.cb_guess_constant(constant_spec);
            if (cb_editor.NIL == constant_handles.constant_p(constant)) {
                cb_utilities.cb_error((SubLObject)cb_editor.$str191$_a_does_not_specify_a_Cyc_constan, constant_spec, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                return (SubLObject)cb_editor.NIL;
            }
            final SubLObject title_var = (SubLObject)cb_editor.$str255$Recreate_Constant;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_editor.$str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_editor.$str41$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$98 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_editor.$kw43$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_editor.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$99 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str46$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str47$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str49$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_editor.$str50$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_editor.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
                            html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str51$post);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            if (cb_editor.NIL != frame_name_var) {
                                html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(frame_name_var);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_macros.$within_html_form$.bind((SubLObject)cb_editor.T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_utilities.html_hidden_input((SubLObject)cb_editor.$str256$cb_recreate_handler, constant_spec, (SubLObject)cb_editor.UNPROVIDED);
                                cb_utilities.cb_help_preamble((SubLObject)cb_editor.$kw251$CB_RECREATE, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                final SubLObject assertion_count = kb_indexing.num_index(constant);
                                html_utilities.html_princ((SubLObject)cb_editor.$str257$Please_confirm_recreation_of_);
                                cb_utilities.cb_form(constant, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                if (assertion_count.numG((SubLObject)cb_editor.ZERO_INTEGER)) {
                                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str243$_and_the_removal_of_all__S_assert, assertion_count);
                                }
                                html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                cb_utilities.cb_back_button((SubLObject)cb_editor.$kw244$SELF, (SubLObject)cb_editor.$str245$No);
                                html_utilities.html_submit_input((SubLObject)cb_editor.$str258$Yes__Recreate, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$99, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$98, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_editor.$list254);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 31522L)
    public static SubLObject cb_recreate_handler(final SubLObject args) {
        final SubLObject id = args.first();
        final SubLObject constant = cb_utilities.cb_guess_constant(id);
        if (cb_editor.NIL == constant_handles.constant_p(constant)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str191$_a_does_not_specify_a_Cyc_constan, id, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            return (SubLObject)cb_editor.NIL;
        }
        ke.ke_recreate(constant);
        cb_assertion_editor.cb_note_edit_change((SubLObject)cb_editor.$str260$Constant_Recreate, (SubLObject)cb_editor.T, (SubLObject)cb_editor.THREE_INTEGER, (SubLObject)cb_editor.UNPROVIDED);
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 31912L)
    public static SubLObject cb_link_recreate(final SubLObject constant, SubLObject linktext, SubLObject disabledP) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        if (disabledP == cb_editor.UNPROVIDED) {
            disabledP = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str262$_Recreate_;
        }
        if (cb_editor.NIL != disabledP) {
            cb_assertion_editor.cb_disabled_link(linktext);
        }
        else {
            final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str263$cb_recreate__A, cb_utilities.cb_fort_identifier(constant));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            if (cb_editor.NIL != frame_name_var) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup(frame_name_var);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                html_utilities.html_princ(linktext);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return constant;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 32386L)
    public static SubLObject cb_all_assertions_tms(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_editor.$str267$the_Reperform_TMS_facility);
        }
        else {
            SubLObject fort_spec = (SubLObject)cb_editor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_editor.$list82);
            fort_spec = args.first();
            final SubLObject current = args.rest();
            if (cb_editor.NIL == current) {
                final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_editor.UNPROVIDED);
                if (cb_editor.NIL == forts.fort_p(fort)) {
                    cb_utilities.cb_error((SubLObject)cb_editor.$str191$_a_does_not_specify_a_Cyc_constan, fort_spec, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                    return (SubLObject)cb_editor.NIL;
                }
                final SubLObject assertion_count = kb_indexing.num_index(fort);
                final SubLObject title_var = (SubLObject)cb_editor.$str268$Confirm_Reperform_TMS_Page;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind((cb_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), thread);
                    html_utilities.html_markup((SubLObject)cb_editor.$str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (cb_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str41$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$103 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css((SubLObject)cb_editor.$kw43$CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (cb_editor.NIL != title_var) {
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$104 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind((SubLObject)cb_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (cb_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str46$yui_skin_sam);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str47$reloadFrameButton);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                    html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_editor.$str49$reload);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_editor.$str50$Refresh_Frames);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (cb_editor.NIL != title_var) {
                                    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ(title_var);
                                    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                }
                                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
                                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_editor.$str51$post);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                if (cb_editor.NIL != frame_name_var) {
                                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_markup(frame_name_var);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                                final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                                    html_macros.$within_html_form$.bind((SubLObject)cb_editor.T, thread);
                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                    html_utilities.html_hidden_input((SubLObject)cb_editor.$str269$cb_all_assertions_tms_handler, fort_spec, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_hidden_input((SubLObject)cb_editor.$str226$confirmed, (SubLObject)cb_editor.$str237$T, (SubLObject)cb_editor.UNPROVIDED);
                                    cb_utilities.cb_help_preamble((SubLObject)cb_editor.$kw265$CB_ALL_ASSERTIONS_TMS_HANDLER, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_editor.$str270$These_operations_may_take_some_ti);
                                    html_utilities.html_princ(assertion_count);
                                    html_utilities.html_princ((SubLObject)cb_editor.$str271$_of_the_assertions_of_the_constan);
                                    cb_utilities.cb_form(fort, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_editor.$str272$_);
                                    html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
                                    cb_utilities.cb_back_button((SubLObject)cb_editor.$kw244$SELF, (SubLObject)cb_editor.$str245$No);
                                    html_utilities.html_indent((SubLObject)cb_editor.TWO_INTEGER);
                                    html_utilities.html_submit_input((SubLObject)cb_editor.$str273$Do_it_, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                }
                                finally {
                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                                html_utilities.html_copyright_notice();
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$104, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    }
                    finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$103, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_editor.$list82);
            }
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 33360L)
    public static SubLObject cb_all_assertions_tms_handler(final SubLObject args) {
        final SubLObject fort_spec = args.first();
        final SubLObject confirmed = html_utilities.html_extract_input((SubLObject)cb_editor.$str226$confirmed, args);
        final SubLObject fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL == forts.fort_p(fort)) {
            cb_utilities.cb_error((SubLObject)cb_editor.$str191$_a_does_not_specify_a_Cyc_constan, fort_spec, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            return (SubLObject)cb_editor.NIL;
        }
        ke.ke_tms_reconsider_term(fort, (SubLObject)cb_editor.UNPROVIDED);
        cb_assertion_editor.cb_note_edit_change((SubLObject)cb_editor.$str275$Reperform_TMS_on_indexed_Assertio, (SubLObject)cb_editor.T, (SubLObject)((cb_editor.NIL != confirmed) ? cb_editor.THREE_INTEGER : cb_editor.TWO_INTEGER), (SubLObject)cb_editor.UNPROVIDED);
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 33795L)
    public static SubLObject cb_link_all_assertions_tms(final SubLObject fort, SubLObject linktext) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str277$_Force_TMS_;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_editor.$str278$cb_all_assertions_tms__A, cb_utilities.cb_fort_identifier(fort));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 44689L)
    public static SubLObject cb_hypothesize_handler(SubLObject args) {
        if (args == cb_editor.UNPROVIDED) {
            args = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_editor.$str285$Hypothesize;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_editor.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_editor.$str40$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_editor.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_editor.$str41$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
            final SubLObject _prev_bind_0_$108 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_editor.$kw43$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_editor.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_editor.$kw44$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                final SubLObject _prev_bind_0_$109 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_editor.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_editor.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_editor.$str46$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                    final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str47$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str48$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_editor.$str49$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_editor.$str50$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            if (cb_editor.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_editor.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_editor.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_editor.$str51$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        if (cb_editor.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
                        final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_editor.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_editor.$str286$cb_hypothesize_handler, (SubLObject)cb_editor.T, (SubLObject)cb_editor.UNPROVIDED);
                            if (cb_editor.NIL != args) {
                                cb_hypothesize_results(args);
                            }
                            cb_utilities.cb_help_preamble((SubLObject)cb_editor.$kw283$CB_HYPOTHESIZE_HANDLER, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_editor.$str287$Reset_Values);
                            html_utilities.html_indent((SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_submit_input((SubLObject)cb_editor.$str285$Hypothesize, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
                            final SubLObject mt = (SubLObject)((cb_editor.NIL != forts.fort_p(cb_editor.$cb_last_hyp_mt$.getDynamicValue(thread))) ? cb_editor.$cb_last_hyp_mt$.getDynamicValue(thread) : cb_editor.NIL);
                            html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
                            cb_form_widgets.cb_mt_input_section(mt, (SubLObject)cb_editor.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
                            cb_form_widgets.cb_el_sentence_input_section((SubLObject)((cb_editor.NIL != cb_editor.$cb_last_hyp_formula$.getDynamicValue(thread)) ? cb_editor.$cb_last_hyp_formula$.getDynamicValue(thread) : cb_editor.NIL), (SubLObject)cb_editor.$list288);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$109, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$108, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_editor.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 45474L)
    public static SubLObject cb_hypothesize_results(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject mt_error = thread.secondMultipleValue();
        final SubLObject mt_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_editor.NIL != mt_error) {
            return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
        }
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_editor.$list290);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject sentence_error_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (cb_editor.NIL != sentence_error) {
            return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, (SubLObject)cb_editor.UNPROVIDED);
        }
        cb_editor.$cb_last_hyp_formula$.setDynamicValue(sentence, thread);
        cb_editor.$cb_last_hyp_mt$.setDynamicValue(mt, thread);
        final SubLObject result = cb_hypothesize_hook(cb_editor.$cb_last_hyp_formula$.getDynamicValue(thread), cb_editor.$cb_last_hyp_mt$.getDynamicValue(thread));
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_editor.$str291$Last_hypothesis_in_);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        cb_utilities.cb_form(cb_editor.$cb_last_hyp_mt$.getDynamicValue(thread), (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_editor.$str87$__);
        html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
        cb_utilities.cb_form(cb_editor.$cb_last_hyp_formula$.getDynamicValue(thread), (SubLObject)cb_editor.ZERO_INTEGER, (SubLObject)cb_editor.T);
        html_utilities.html_newline((SubLObject)cb_editor.TWO_INTEGER);
        if (result.equal((SubLObject)cb_editor.$kw292$ERROR)) {
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_editor.$str293$Error_description__);
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_macros.verify_not_within_html_pre();
            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
            final SubLObject _prev_bind_0 = html_macros.$within_html_pre$.currentBinding(thread);
            try {
                html_macros.$within_html_pre$.bind((SubLObject)cb_editor.T, thread);
                html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
                cb_browser.cb_c_documentation_string(fi.fi_get_error_string_int());
            }
            finally {
                html_macros.$within_html_pre$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_editor.$str294$Hypothesis_results___);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_editor.UNPROVIDED);
            cb_utilities.cb_form(result, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_hr((SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 46611L)
    public static SubLObject cb_link_hypothesize(SubLObject linktext) {
        if (linktext == cb_editor.UNPROVIDED) {
            linktext = (SubLObject)cb_editor.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_editor.NIL == linktext) {
            linktext = (SubLObject)cb_editor.$str285$Hypothesize;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_editor.$kw73$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_editor.$str286$cb_hypothesize_handler);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        if (cb_editor.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_editor.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_editor.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 46935L)
    public static SubLObject xml_assertion_info(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assert_spec = html_utilities.html_extract_input((SubLObject)cb_editor.$str299$assertionId, args);
        final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
        try {
            xml_vars.$xml_stream$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            final SubLObject v_assert = cb_utilities.cb_guess_assertion(assert_spec);
            final SubLObject _prev_bind_0_$113 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_editor.$sym163$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(cb_editor.$const164$EverythingPSC, thread);
                try {
                    final SubLObject _prev_bind_0_$114 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$115 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str165$assertions, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                        final SubLObject _prev_bind_0_$115 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                        try {
                            xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                            xml_utilities.xml_terpri();
                            try {
                                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$116 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(Numbers.add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal((SubLObject)cb_editor.$str168$assertion, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.NIL, (SubLObject)cb_editor.$kw42$UNINITIALIZED);
                                    final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_default_namespace$.bind((SubLObject)cb_editor.$kw42$UNINITIALIZED, thread);
                                        cycml.cycml_serialize_mt(assertions_high.assertion_mt(v_assert));
                                    }
                                    finally {
                                        xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$117, thread);
                                    }
                                }
                                finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$116, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$116, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    xml_utilities.xml_terpri();
                                    xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str168$assertion);
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                }
                            }
                            cycml.cycml_serialize_sentence(uncanonicalizer.assertion_el_formula(v_assert));
                        }
                        finally {
                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$115, thread);
                        }
                    }
                    finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$115, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$114, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_editor.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        xml_utilities.xml_terpri();
                        xml_utilities.xml_end_tag_internal((SubLObject)cb_editor.$str165$assertions);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$113, thread);
            }
        }
        finally {
            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-editor.lisp", position = 47379L)
    public static SubLObject cb_form_smart(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl = cb_form_widgets.cb_extract_el_sentence_input(args, (SubLObject)cb_editor.$list301);
        final SubLObject assertion = czer_meta.find_assertion_cycl(cycl, (SubLObject)cb_editor.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_editor.$kw42$UNINITIALIZED) ? ConsesLow.list(cb_editor.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            if (cb_editor.NIL != assertion) {
                cb_utilities.cb_show_assertion_readably(assertion, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            }
            else {
                cb_utilities.cb_form(cycl, (SubLObject)cb_editor.UNPROVIDED, (SubLObject)cb_editor.UNPROVIDED);
            }
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_editor.NIL;
    }
    
    public static SubLObject declare_cb_editor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_create_hook", "CB-CREATE-HOOK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_hypothesize_hook", "CB-HYPOTHESIZE-HOOK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_term_toolbar", "CB-TERM-TOOLBAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "term_modification_permittedP", "TERM-MODIFICATION-PERMITTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "term_modification_forbiddenP", "TERM-MODIFICATION-FORBIDDEN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "term_as_merge_source_permittedP", "TERM-AS-MERGE-SOURCE-PERMITTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_create", "CB-CREATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_handle_create", "CB-HANDLE-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_create", "CB-LINK-CREATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_create_similar_legacy", "CB-CREATE-SIMILAR-LEGACY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_handle_create_similar_legacy", "CB-HANDLE-CREATE-SIMILAR-LEGACY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_handle_create_similar", "CB-HANDLE-CREATE-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_create_similar", "CB-LINK-CREATE-SIMILAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_create_similar_guest_warn", "CB-CREATE-SIMILAR-GUEST-WARN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_similar_button_row", "CB-SIMILAR-BUTTON-ROW", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "xml_fort_info", "XML-FORT-INFO", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "fort_info_preds", "FORT-INFO-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "create_similar_valid_nat_nameP", "CREATE-SIMILAR-VALID-NAT-NAME?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_create_similar", "CB-CREATE-SIMILAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_create_similar_legacy", "CB-LINK-CREATE-SIMILAR-LEGACY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_create_instance", "CB-LINK-CREATE-INSTANCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_create_spec", "CB-LINK-CREATE-SPEC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_create_spec_mt", "CB-LINK-CREATE-SPEC-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_create_spec_pred", "CB-LINK-CREATE-SPEC-PRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_create_similar_checkbox", "CB-CREATE-SIMILAR-CHECKBOX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_rename", "CB-RENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_handle_rename", "CB-HANDLE-RENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_rename", "CB-LINK-RENAME", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_merge", "CB-MERGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_handle_merge", "CB-HANDLE-MERGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_merge", "CB-LINK-MERGE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_kill", "CB-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_kill", "CB-LINK-KILL", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_confirm_kill", "CB-CONFIRM-KILL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_confirm_kill", "CB-LINK-CONFIRM-KILL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_recreate", "CB-RECREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_recreate_handler", "CB-RECREATE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_recreate", "CB-LINK-RECREATE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_all_assertions_tms", "CB-ALL-ASSERTIONS-TMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_all_assertions_tms_handler", "CB-ALL-ASSERTIONS-TMS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_all_assertions_tms", "CB-LINK-ALL-ASSERTIONS-TMS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_hypothesize_handler", "CB-HYPOTHESIZE-HANDLER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_hypothesize_results", "CB-HYPOTHESIZE-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_link_hypothesize", "CB-LINK-HYPOTHESIZE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "xml_assertion_info", "XML-ASSERTION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_editor", "cb_form_smart", "CB-FORM-SMART", 1, 0, false);
        return (SubLObject)cb_editor.NIL;
    }
    
    public static SubLObject init_cb_editor_file() {
        cb_editor.$merge_permitted_functions$ = SubLFiles.defparameter("*MERGE-PERMITTED-FUNCTIONS*", (SubLObject)cb_editor.$list35);
        cb_editor.$cb_enable_legacy_create_similar$ = SubLFiles.defparameter("*CB-ENABLE-LEGACY-CREATE-SIMILAR*", (SubLObject)cb_editor.NIL);
        cb_editor.$cb_last_hyp_formula$ = SubLFiles.defparameter("*CB-LAST-HYP-FORMULA*", (SubLObject)cb_editor.NIL);
        cb_editor.$cb_last_hyp_mt$ = SubLFiles.defparameter("*CB-LAST-HYP-MT*", mt_vars.$default_assert_mt$.getGlobalValue());
        return (SubLObject)cb_editor.NIL;
    }
    
    public static SubLObject setup_cb_editor_file() {
        Hashtables.sethash((SubLObject)cb_editor.$kw36$CB_CREATE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str37$cb_create_html, (SubLObject)cb_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym61$CB_CREATE, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym69$CB_HANDLE_CREATE, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_editor.$kw70$CREATE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str71$create_tool_gif, (SubLObject)cb_editor.NIL));
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw70$CREATE, (SubLObject)cb_editor.$sym75$CB_LINK_CREATE, (SubLObject)cb_editor.ONE_INTEGER);
        cb_utilities.declare_deprecated_cb_tool((SubLObject)cb_editor.$kw70$CREATE, (SubLObject)cb_editor.$str72$Create, (SubLObject)cb_editor.$str76$Crt, (SubLObject)cb_editor.$str77$Create_Bare_Cyc_Constant);
        Hashtables.sethash((SubLObject)cb_editor.$kw78$CB_CREATE_SIMILAR, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str79$cb_create_similar_html, (SubLObject)cb_editor.NIL));
        utilities_macros.register_html_state_variable((SubLObject)cb_editor.$sym80$_CB_ENABLE_LEGACY_CREATE_SIMILAR_);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym96$CB_CREATE_SIMILAR_LEGACY, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym105$CB_HANDLE_CREATE_SIMILAR_LEGACY, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym126$CB_HANDLE_CREATE_SIMILAR, (SubLObject)cb_editor.$kw127$XML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw3$CREATE_SIMILAR, (SubLObject)cb_editor.$sym130$CB_LINK_CREATE_SIMILAR, (SubLObject)cb_editor.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym173$CB_CREATE_SIMILAR, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw2$CREATE_SIMILAR_LEGACY, (SubLObject)cb_editor.$sym175$CB_LINK_CREATE_SIMILAR_LEGACY, (SubLObject)cb_editor.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw4$CREATE_INSTANCE, (SubLObject)cb_editor.$sym178$CB_LINK_CREATE_INSTANCE, (SubLObject)cb_editor.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw5$CREATE_SPEC, (SubLObject)cb_editor.$sym181$CB_LINK_CREATE_SPEC, (SubLObject)cb_editor.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw7$CREATE_SPEC_MT, (SubLObject)cb_editor.$sym184$CB_LINK_CREATE_SPEC_MT, (SubLObject)cb_editor.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw6$CREATE_SPEC_PRED, (SubLObject)cb_editor.$sym187$CB_LINK_CREATE_SPEC_PRED, (SubLObject)cb_editor.TWO_INTEGER);
        Hashtables.sethash((SubLObject)cb_editor.$kw188$CB_RENAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str189$cb_rename_html, (SubLObject)cb_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym200$CB_RENAME, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym204$CB_HANDLE_RENAME, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw8$RENAME, (SubLObject)cb_editor.$sym207$CB_LINK_RENAME, (SubLObject)cb_editor.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_editor.$kw208$CB_MERGE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str209$cb_merge_html, (SubLObject)cb_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym218$CB_MERGE, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym221$CB_HANDLE_MERGE, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw9$MERGE, (SubLObject)cb_editor.$sym224$CB_LINK_MERGE, (SubLObject)cb_editor.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym228$CB_KILL, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw11$KILL, (SubLObject)cb_editor.$sym232$CB_LINK_KILL, (SubLObject)cb_editor.FOUR_INTEGER);
        Hashtables.sethash((SubLObject)cb_editor.$kw233$CB_CONFIRM_KILL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str234$cb_confirm_kill_html, (SubLObject)cb_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym248$CB_CONFIRM_KILL, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw10$CONFIRM_KILL, (SubLObject)cb_editor.$sym250$CB_LINK_CONFIRM_KILL, (SubLObject)cb_editor.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_editor.$kw251$CB_RECREATE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str252$cb_recreate_html, (SubLObject)cb_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym259$CB_RECREATE, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym261$CB_RECREATE_HANDLER, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw240$RECREATE, (SubLObject)cb_editor.$sym264$CB_LINK_RECREATE, (SubLObject)cb_editor.THREE_INTEGER);
        Hashtables.sethash((SubLObject)cb_editor.$kw265$CB_ALL_ASSERTIONS_TMS_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str266$cb_all_assertions_tms_handler_htm, (SubLObject)cb_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym274$CB_ALL_ASSERTIONS_TMS, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym276$CB_ALL_ASSERTIONS_TMS_HANDLER, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw279$ALL_ASSERTIONS_TMS, (SubLObject)cb_editor.$sym280$CB_LINK_ALL_ASSERTIONS_TMS, (SubLObject)cb_editor.TWO_INTEGER);
        utilities_macros.register_html_state_variable((SubLObject)cb_editor.$sym281$_CB_LAST_HYP_FORMULA_);
        utilities_macros.register_html_state_variable((SubLObject)cb_editor.$sym282$_CB_LAST_HYP_MT_);
        Hashtables.sethash((SubLObject)cb_editor.$kw283$CB_HYPOTHESIZE_HANDLER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_editor.$str284$cb_hypothesize_handler_html, (SubLObject)cb_editor.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym289$CB_HYPOTHESIZE_HANDLER, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_editor.$kw295$HYPOTHESIZE, (SubLObject)cb_editor.$sym296$CB_LINK_HYPOTHESIZE, (SubLObject)cb_editor.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_editor.$kw295$HYPOTHESIZE, (SubLObject)cb_editor.$str285$Hypothesize, (SubLObject)cb_editor.$str297$Hyp, (SubLObject)cb_editor.$str298$Hypothesize_a_formula);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym300$XML_ASSERTION_INFO, (SubLObject)cb_editor.$kw127$XML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_editor.$sym302$CB_FORM_SMART, (SubLObject)cb_editor.$kw62$HTML_HANDLER);
        return (SubLObject)cb_editor.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_editor_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_editor_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_editor_file();
    }
    
    static {
        me = (SubLFile)new cb_editor();
        cb_editor.$merge_permitted_functions$ = null;
        cb_editor.$cb_enable_legacy_create_similar$ = null;
        cb_editor.$cb_last_hyp_formula$ = null;
        cb_editor.$cb_last_hyp_mt$ = null;
        $sym0$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym1$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw2$CREATE_SIMILAR_LEGACY = SubLObjectFactory.makeKeyword("CREATE-SIMILAR-LEGACY");
        $kw3$CREATE_SIMILAR = SubLObjectFactory.makeKeyword("CREATE-SIMILAR");
        $kw4$CREATE_INSTANCE = SubLObjectFactory.makeKeyword("CREATE-INSTANCE");
        $kw5$CREATE_SPEC = SubLObjectFactory.makeKeyword("CREATE-SPEC");
        $kw6$CREATE_SPEC_PRED = SubLObjectFactory.makeKeyword("CREATE-SPEC-PRED");
        $kw7$CREATE_SPEC_MT = SubLObjectFactory.makeKeyword("CREATE-SPEC-MT");
        $kw8$RENAME = SubLObjectFactory.makeKeyword("RENAME");
        $kw9$MERGE = SubLObjectFactory.makeKeyword("MERGE");
        $kw10$CONFIRM_KILL = SubLObjectFactory.makeKeyword("CONFIRM-KILL");
        $kw11$KILL = SubLObjectFactory.makeKeyword("KILL");
        $kw12$KB_MONITOR_INDEX_HOOK = SubLObjectFactory.makeKeyword("KB-MONITOR-INDEX-HOOK");
        $kw13$LEXIFY_TERM = SubLObjectFactory.makeKeyword("LEXIFY-TERM");
        $kw14$TTT_TEST = SubLObjectFactory.makeKeyword("TTT-TEST");
        $str15$_Take_Test_ = SubLObjectFactory.makeString("[Take Test]");
        $kw16$KCT_TEST = SubLObjectFactory.makeKeyword("KCT-TEST");
        $kw17$KBQ_ASK = SubLObjectFactory.makeKeyword("KBQ-ASK");
        $kw18$KBQ_ASK_IN_PROOF_CHECKER = SubLObjectFactory.makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $kw19$KCT_TEST_SET = SubLObjectFactory.makeKeyword("KCT-TEST-SET");
        $kw20$KCT_EDIT = SubLObjectFactory.makeKeyword("KCT-EDIT");
        $kw21$KBQ_EDIT = SubLObjectFactory.makeKeyword("KBQ-EDIT");
        $kw22$SYNTACTIC_NODE_TOOLKIT = SubLObjectFactory.makeKeyword("SYNTACTIC-NODE-TOOLKIT");
        $kw23$NOREG = SubLObjectFactory.makeKeyword("NOREG");
        $kw24$SKSI_REGISTER = SubLObjectFactory.makeKeyword("SKSI-REGISTER");
        $kw25$PARTIAL = SubLObjectFactory.makeKeyword("PARTIAL");
        $kw26$SKSI_DEREGISTER = SubLObjectFactory.makeKeyword("SKSI-DEREGISTER");
        $kw27$REG = SubLObjectFactory.makeKeyword("REG");
        $kw28$EDIT_IN_SMT = SubLObjectFactory.makeKeyword("EDIT-IN-SMT");
        $const29$Ontology = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ontology"));
        $kw30$CB_OWL_EXPORT_XML = SubLObjectFactory.makeKeyword("CB-OWL-EXPORT-XML");
        $str31$_OWL_Export_ = SubLObjectFactory.makeString("[OWL Export]");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":type"), (SubLObject)SubLObjectFactory.makeKeyword("ONTOLOGY"));
        $str33$_ontology = SubLObjectFactory.makeString(":ontology");
        $const34$ReservedConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReservedConstant"));
        $list35 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceNamedFn-Ternary")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperSubcollectionNamedFn-Ternary")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CityNamedFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PersonNamedFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlaceNamedFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PredicateNamedFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StreetNamedFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OrganizationNamedFn")));
        $kw36$CB_CREATE = SubLObjectFactory.makeKeyword("CB-CREATE");
        $str37$cb_create_html = SubLObjectFactory.makeString("cb-create.html");
        $str38$the_Create_Constant_page = SubLObjectFactory.makeString("the Create Constant page");
        $str39$Create_Constant = SubLObjectFactory.makeString("Create Constant");
        $str40$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str41$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw42$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw43$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw44$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw45$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str46$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str47$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str48$button = SubLObjectFactory.makeString("button");
        $str49$reload = SubLObjectFactory.makeString("reload");
        $str50$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str51$post = SubLObjectFactory.makeString("post");
        $str52$cb_handle_create = SubLObjectFactory.makeString("cb-handle-create");
        $str53$Clear = SubLObjectFactory.makeString("Clear");
        $str54$Enter_name_for_new_constant___ = SubLObjectFactory.makeString("Enter name for new constant : ");
        $str55$new_name = SubLObjectFactory.makeString("new-name");
        $str56$Complete = SubLObjectFactory.makeString("Complete");
        $str57$ = SubLObjectFactory.makeString("");
        $int58$40 = SubLObjectFactory.makeInteger(40);
        $str59$creating = SubLObjectFactory.makeString("creating");
        $str60$Cyc_Naming_Conventions = SubLObjectFactory.makeString("Cyc Naming Conventions");
        $sym61$CB_CREATE = SubLObjectFactory.makeSymbol("CB-CREATE");
        $kw62$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str63$Creating = SubLObjectFactory.makeString("Creating");
        $str64$No_name_was_specified = SubLObjectFactory.makeString("No name was specified");
        $str65$_S_is_not_a_valid_constant_name = SubLObjectFactory.makeString("~S is not a valid constant name");
        $str66$Already_a_constant_named__a = SubLObjectFactory.makeString("Already a constant named ~a");
        $str67$Constant_Create = SubLObjectFactory.makeString("Constant Create");
        $str68$Unable_to_create_a_constant_named = SubLObjectFactory.makeString("Unable to create a constant named ~S");
        $sym69$CB_HANDLE_CREATE = SubLObjectFactory.makeSymbol("CB-HANDLE-CREATE");
        $kw70$CREATE = SubLObjectFactory.makeKeyword("CREATE");
        $str71$create_tool_gif = SubLObjectFactory.makeString("create-tool.gif");
        $str72$Create = SubLObjectFactory.makeString("Create");
        $kw73$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str74$cb_create = SubLObjectFactory.makeString("cb-create");
        $sym75$CB_LINK_CREATE = SubLObjectFactory.makeSymbol("CB-LINK-CREATE");
        $str76$Crt = SubLObjectFactory.makeString("Crt");
        $str77$Create_Bare_Cyc_Constant = SubLObjectFactory.makeString("Create Bare Cyc Constant");
        $kw78$CB_CREATE_SIMILAR = SubLObjectFactory.makeKeyword("CB-CREATE-SIMILAR");
        $str79$cb_create_similar_html = SubLObjectFactory.makeString("cb-create-similar.html");
        $sym80$_CB_ENABLE_LEGACY_CREATE_SIMILAR_ = SubLObjectFactory.makeSymbol("*CB-ENABLE-LEGACY-CREATE-SIMILAR*");
        $str81$the_Create_Similar_Term_page = SubLObjectFactory.makeString("the Create Similar Term page");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-SPEC"));
        $str83$_a_does_not_specify_a_Cyc_term = SubLObjectFactory.makeString("~a does not specify a Cyc term");
        $str84$Create_Similar_Term = SubLObjectFactory.makeString("Create Similar Term");
        $str85$cb_handle_create_similar_legacy = SubLObjectFactory.makeString("cb-handle-create-similar-legacy");
        $str86$Enter_name_for_new_term_similar_t = SubLObjectFactory.makeString("Enter name for new term similar to ");
        $str87$__ = SubLObjectFactory.makeString(" :");
        $str88$Create_Similar = SubLObjectFactory.makeString("Create Similar");
        $str89$create = SubLObjectFactory.makeString("create");
        $str90$Copy_Assertions = SubLObjectFactory.makeString("Copy Assertions");
        $str91$copy = SubLObjectFactory.makeString("copy");
        $str92$Check_the_assertions_from_ = SubLObjectFactory.makeString("Check the assertions from ");
        $str93$_which_you_wish_to_copy_as_well__ = SubLObjectFactory.makeString(" which you wish to copy as well: ");
        $sym94$CB_CREATE_SIMILAR_CHECKBOX = SubLObjectFactory.makeSymbol("CB-CREATE-SIMILAR-CHECKBOX");
        $kw95$MAXIMAL = SubLObjectFactory.makeKeyword("MAXIMAL");
        $sym96$CB_CREATE_SIMILAR_LEGACY = SubLObjectFactory.makeSymbol("CB-CREATE-SIMILAR-LEGACY");
        $str97$create_similar_facilities = SubLObjectFactory.makeString("create similar facilities");
        $str98$Unable_to_determine_a_term_from__ = SubLObjectFactory.makeString("Unable to determine a term from ~S");
        $str99$No_term_was_specified = SubLObjectFactory.makeString("No term was specified");
        $str100$_S_is_not_a_valid_term_name = SubLObjectFactory.makeString("~S is not a valid term name");
        $str101$Already_a_constant_named__S = SubLObjectFactory.makeString("Already a constant named ~S");
        $str102$Constant__S_already_exists_which_ = SubLObjectFactory.makeString("Constant ~S already exists which differs from ~S only by case");
        $str103$Unable_to_create_a_similar_term_n = SubLObjectFactory.makeString("Unable to create a similar term named ~S");
        $sym104$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $sym105$CB_HANDLE_CREATE_SIMILAR_LEGACY = SubLObjectFactory.makeSymbol("CB-HANDLE-CREATE-SIMILAR-LEGACY");
        $str106$error = SubLObjectFactory.makeString("error");
        $str107$_S = SubLObjectFactory.makeString("~S");
        $str108$focalterm = SubLObjectFactory.makeString("focalterm");
        $str109$response = SubLObjectFactory.makeString("response");
        $str110$invalidTerm = SubLObjectFactory.makeString("invalidTerm");
        $str111$_S_is_not_a_valid_term_name_ = SubLObjectFactory.makeString("~S is not a valid term name.");
        $str112$Constant__A_already_exists__which = SubLObjectFactory.makeString("Constant ~A already exists, which differs from ~S only by case.");
        $str113$Unable_to_create_a_term_named__S_ = SubLObjectFactory.makeString("Unable to create a term named ~S.");
        $str114$sentence = SubLObjectFactory.makeString("sentence");
        $kw115$INPUT_NAME = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $const116$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $kw117$SENTENCE_NUM = SubLObjectFactory.makeKeyword("SENTENCE-NUM");
        $kw118$SENTENCE = SubLObjectFactory.makeKeyword("SENTENCE");
        $const119$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $str120$newTermId = SubLObjectFactory.makeString("newTermId");
        $str121$id = SubLObjectFactory.makeString("id");
        $str122$invalidSentence = SubLObjectFactory.makeString("invalidSentence");
        $str123$count = SubLObjectFactory.makeString("count");
        $str124$assertionsQueued = SubLObjectFactory.makeString("assertionsQueued");
        $str125$_A_assertions_added_to_the_local_ = SubLObjectFactory.makeString("~A assertions added to the local queue.");
        $sym126$CB_HANDLE_CREATE_SIMILAR = SubLObjectFactory.makeSymbol("CB-HANDLE-CREATE-SIMILAR");
        $kw127$XML_HANDLER = SubLObjectFactory.makeKeyword("XML-HANDLER");
        $str128$_Create_Similar_ = SubLObjectFactory.makeString("[Create Similar]");
        $str129$cb_create_similar__A = SubLObjectFactory.makeString("cb-create-similar&~A");
        $sym130$CB_LINK_CREATE_SIMILAR = SubLObjectFactory.makeSymbol("CB-LINK-CREATE-SIMILAR");
        $str131$color_red__font_size_120___font_w = SubLObjectFactory.makeString("color:red; font-size:120%; font-weight:700");
        $const132$Guest = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Guest"));
        $str133$Sorry__ = SubLObjectFactory.makeString("Sorry, ");
        $str134$_cannot_make_assertions_using_the = SubLObjectFactory.makeString(" cannot make assertions using the tool.   Please ");
        $kw135$CB_LOGIN = SubLObjectFactory.makeKeyword("CB-LOGIN");
        $str136$login = SubLObjectFactory.makeString("login");
        $str137$_using_your_real_name_now_so_that = SubLObjectFactory.makeString(" using your real name now so that you can make assertions using this tool.");
        $str138$lookupbutton = SubLObjectFactory.makeString("lookupbutton");
        $str139$assertbutton = SubLObjectFactory.makeString("assertbutton");
        $str140$font_size_10pt = SubLObjectFactory.makeString("font-size:10pt");
        $str141$All_Mts = SubLObjectFactory.makeString("All Mts");
        $str142$togglecheckall___ = SubLObjectFactory.makeString("togglecheckall();");
        $str143$Check_All___Uncheck_All = SubLObjectFactory.makeString("Check All / Uncheck All");
        $str144$Undo = SubLObjectFactory.makeString("Undo");
        $str145$uncommit__ = SubLObjectFactory.makeString("uncommit()");
        $str146$Redo = SubLObjectFactory.makeString("Redo");
        $str147$recommit__ = SubLObjectFactory.makeString("recommit()");
        $str148$Switch_to_Browse_Mode = SubLObjectFactory.makeString("Switch to Browse Mode");
        $str149$togglelookupmode__ = SubLObjectFactory.makeString("togglelookupmode()");
        $str150$SEND = SubLObjectFactory.makeString("SEND");
        $str151$dosubmit__ = SubLObjectFactory.makeString("dosubmit()");
        $str152$Assert_selected_sentences = SubLObjectFactory.makeString("Assert selected sentences");
        $kw153$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym154$MAX_ARITY = SubLObjectFactory.makeSymbol("MAX-ARITY");
        $sym155$_ = SubLObjectFactory.makeSymbol(">");
        $str156$_ = SubLObjectFactory.makeString(")");
        $str157$_ = SubLObjectFactory.makeString("(");
        $str158$_ = SubLObjectFactory.makeString("_");
        $str159$_ = SubLObjectFactory.makeString(" ");
        $str160$focalTerm = SubLObjectFactory.makeString("focalTerm");
        $str161$hlid = SubLObjectFactory.makeString("hlid");
        $str162$contentspec = SubLObjectFactory.makeString("contentspec");
        $sym163$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const164$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str165$assertions = SubLObjectFactory.makeString("assertions");
        $kw166$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw167$ALL_INFERRED = SubLObjectFactory.makeKeyword("ALL-INFERRED");
        $str168$assertion = SubLObjectFactory.makeString("assertion");
        $const169$DocumentationPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DocumentationPredicate"));
        $int170$100 = SubLObjectFactory.makeInteger(100);
        $sym171$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $kw172$CB_CREATE_SIMILAR_JS = SubLObjectFactory.makeKeyword("CB-CREATE-SIMILAR-JS");
        $sym173$CB_CREATE_SIMILAR = SubLObjectFactory.makeSymbol("CB-CREATE-SIMILAR");
        $str174$cb_create_similar_legacy__A = SubLObjectFactory.makeString("cb-create-similar-legacy&~A");
        $sym175$CB_LINK_CREATE_SIMILAR_LEGACY = SubLObjectFactory.makeSymbol("CB-LINK-CREATE-SIMILAR-LEGACY");
        $str176$_Create_Instance_ = SubLObjectFactory.makeString("[Create Instance]");
        $str177$javascript_startCreate___A_____A_ = SubLObjectFactory.makeString("javascript:startCreate('~A', '~A', 'instance');");
        $sym178$CB_LINK_CREATE_INSTANCE = SubLObjectFactory.makeSymbol("CB-LINK-CREATE-INSTANCE");
        $str179$_Create_Spec_ = SubLObjectFactory.makeString("[Create Spec]");
        $str180$javascript_startCreate___A_____A_ = SubLObjectFactory.makeString("javascript:startCreate('~A', '~A', 'spec');");
        $sym181$CB_LINK_CREATE_SPEC = SubLObjectFactory.makeSymbol("CB-LINK-CREATE-SPEC");
        $str182$_Create_Spec_Mt_ = SubLObjectFactory.makeString("[Create Spec Mt]");
        $str183$javascript_startCreate___A_____A_ = SubLObjectFactory.makeString("javascript:startCreate('~A', '~A', 'spec-mt');");
        $sym184$CB_LINK_CREATE_SPEC_MT = SubLObjectFactory.makeSymbol("CB-LINK-CREATE-SPEC-MT");
        $str185$_Create_Spec_Pred_ = SubLObjectFactory.makeString("[Create Spec Pred]");
        $str186$javascript_startCreate___A_____A_ = SubLObjectFactory.makeString("javascript:startCreate('~A', '~A', 'spec-pred');");
        $sym187$CB_LINK_CREATE_SPEC_PRED = SubLObjectFactory.makeSymbol("CB-LINK-CREATE-SPEC-PRED");
        $kw188$CB_RENAME = SubLObjectFactory.makeKeyword("CB-RENAME");
        $str189$cb_rename_html = SubLObjectFactory.makeString("cb-rename.html");
        $str190$the_Rename_Constant_page = SubLObjectFactory.makeString("the Rename Constant page");
        $str191$_a_does_not_specify_a_Cyc_constan = SubLObjectFactory.makeString("~a does not specify a Cyc constant");
        $str192$Rename_Constant = SubLObjectFactory.makeString("Rename Constant");
        $str193$cb_handle_rename = SubLObjectFactory.makeString("cb-handle-rename");
        $str194$Enter_new_name_for_ = SubLObjectFactory.makeString("Enter new name for ");
        $str195$Current_Name = SubLObjectFactory.makeString("Current Name");
        $str196$Rename = SubLObjectFactory.makeString("Rename");
        $str197$naming = SubLObjectFactory.makeString("naming");
        $str198$renaming = SubLObjectFactory.makeString("renaming");
        $str199$Cyc_Rename_Kill = SubLObjectFactory.makeString("Cyc Rename/Kill");
        $sym200$CB_RENAME = SubLObjectFactory.makeSymbol("CB-RENAME");
        $str201$Could_not_determine_a_term_from__ = SubLObjectFactory.makeString("Could not determine a term from ~S");
        $str202$Name_specified_is_same_as_current = SubLObjectFactory.makeString("Name specified is same as current name");
        $str203$Constant_Rename = SubLObjectFactory.makeString("Constant Rename");
        $sym204$CB_HANDLE_RENAME = SubLObjectFactory.makeSymbol("CB-HANDLE-RENAME");
        $str205$_Rename_ = SubLObjectFactory.makeString("[Rename]");
        $str206$cb_rename__A = SubLObjectFactory.makeString("cb-rename&~A");
        $sym207$CB_LINK_RENAME = SubLObjectFactory.makeSymbol("CB-LINK-RENAME");
        $kw208$CB_MERGE = SubLObjectFactory.makeKeyword("CB-MERGE");
        $str209$cb_merge_html = SubLObjectFactory.makeString("cb-merge.html");
        $str210$the_Merge_Term_page = SubLObjectFactory.makeString("the Merge Term page");
        $str211$Merge_Term = SubLObjectFactory.makeString("Merge Term");
        $str212$cb_handle_merge = SubLObjectFactory.makeString("cb-handle-merge");
        $str213$fort_spec = SubLObjectFactory.makeString("fort-spec");
        $str214$Merge_the_term_ = SubLObjectFactory.makeString("Merge the term ");
        $str215$_onto_the_existing_constant_named = SubLObjectFactory.makeString(" onto the existing constant named :");
        $str216$target_name = SubLObjectFactory.makeString("target-name");
        $str217$Merge = SubLObjectFactory.makeString("Merge");
        $sym218$CB_MERGE = SubLObjectFactory.makeSymbol("CB-MERGE");
        $str219$merging = SubLObjectFactory.makeString("merging");
        $str220$Attempt_to_merge__S_with_itself_ = SubLObjectFactory.makeString("Attempt to merge ~S with itself.");
        $sym221$CB_HANDLE_MERGE = SubLObjectFactory.makeSymbol("CB-HANDLE-MERGE");
        $str222$_Merge_ = SubLObjectFactory.makeString("[Merge]");
        $str223$cb_merge__A = SubLObjectFactory.makeString("cb-merge&~A");
        $sym224$CB_LINK_MERGE = SubLObjectFactory.makeSymbol("CB-LINK-MERGE");
        $str225$the_Cyc_term_kill_facility = SubLObjectFactory.makeString("the Cyc term kill facility");
        $str226$confirmed = SubLObjectFactory.makeString("confirmed");
        $str227$Term_Kill = SubLObjectFactory.makeString("Term Kill");
        $sym228$CB_KILL = SubLObjectFactory.makeSymbol("CB-KILL");
        $str229$_Kill_ = SubLObjectFactory.makeString("[Kill]");
        $str230$cb_kill__A = SubLObjectFactory.makeString("cb-kill&~A");
        $str231$cb_kill__A_confirmed_T = SubLObjectFactory.makeString("cb-kill&~A|confirmed=T");
        $sym232$CB_LINK_KILL = SubLObjectFactory.makeSymbol("CB-LINK-KILL");
        $kw233$CB_CONFIRM_KILL = SubLObjectFactory.makeKeyword("CB-CONFIRM-KILL");
        $str234$cb_confirm_kill_html = SubLObjectFactory.makeString("cb-confirm-kill.html");
        $str235$Confirm_Term_Kill = SubLObjectFactory.makeString("Confirm Term Kill");
        $str236$cb_kill = SubLObjectFactory.makeString("cb-kill");
        $str237$T = SubLObjectFactory.makeString("T");
        $str238$NOTE__ = SubLObjectFactory.makeString("NOTE: ");
        $str239$If_you_are_killing_this_term_to_r = SubLObjectFactory.makeString("If you are killing this term to remove its assertions and start again from scratch, please go to the ");
        $kw240$RECREATE = SubLObjectFactory.makeKeyword("RECREATE");
        $str241$_page_instead_ = SubLObjectFactory.makeString(" page instead.");
        $str242$Please_confirm_kill_of_ = SubLObjectFactory.makeString("Please confirm kill of ");
        $str243$_and_the_removal_of_all__S_assert = SubLObjectFactory.makeString(" and the removal of all ~S assertions involving it.");
        $kw244$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str245$No = SubLObjectFactory.makeString("No");
        $str246$Yes__Kill = SubLObjectFactory.makeString("Yes, Kill");
        $str247$killing_constants = SubLObjectFactory.makeString("killing constants");
        $sym248$CB_CONFIRM_KILL = SubLObjectFactory.makeSymbol("CB-CONFIRM-KILL");
        $str249$cb_confirm_kill__A = SubLObjectFactory.makeString("cb-confirm-kill&~A");
        $sym250$CB_LINK_CONFIRM_KILL = SubLObjectFactory.makeSymbol("CB-LINK-CONFIRM-KILL");
        $kw251$CB_RECREATE = SubLObjectFactory.makeKeyword("CB-RECREATE");
        $str252$cb_recreate_html = SubLObjectFactory.makeString("cb-recreate.html");
        $str253$the_Cyc_constant_recreate_facilit = SubLObjectFactory.makeString("the Cyc constant recreate facility");
        $list254 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-SPEC"));
        $str255$Recreate_Constant = SubLObjectFactory.makeString("Recreate Constant");
        $str256$cb_recreate_handler = SubLObjectFactory.makeString("cb-recreate-handler");
        $str257$Please_confirm_recreation_of_ = SubLObjectFactory.makeString("Please confirm recreation of ");
        $str258$Yes__Recreate = SubLObjectFactory.makeString("Yes, Recreate");
        $sym259$CB_RECREATE = SubLObjectFactory.makeSymbol("CB-RECREATE");
        $str260$Constant_Recreate = SubLObjectFactory.makeString("Constant Recreate");
        $sym261$CB_RECREATE_HANDLER = SubLObjectFactory.makeSymbol("CB-RECREATE-HANDLER");
        $str262$_Recreate_ = SubLObjectFactory.makeString("[Recreate]");
        $str263$cb_recreate__A = SubLObjectFactory.makeString("cb-recreate&~A");
        $sym264$CB_LINK_RECREATE = SubLObjectFactory.makeSymbol("CB-LINK-RECREATE");
        $kw265$CB_ALL_ASSERTIONS_TMS_HANDLER = SubLObjectFactory.makeKeyword("CB-ALL-ASSERTIONS-TMS-HANDLER");
        $str266$cb_all_assertions_tms_handler_htm = SubLObjectFactory.makeString("cb-all-assertions-tms-handler.html");
        $str267$the_Reperform_TMS_facility = SubLObjectFactory.makeString("the Reperform TMS facility");
        $str268$Confirm_Reperform_TMS_Page = SubLObjectFactory.makeString("Confirm Reperform TMS Page");
        $str269$cb_all_assertions_tms_handler = SubLObjectFactory.makeString("cb-all-assertions-tms-handler");
        $str270$These_operations_may_take_some_ti = SubLObjectFactory.makeString("These operations may take some time.  Please confirm that you really want to force TMS for all ");
        $str271$_of_the_assertions_of_the_constan = SubLObjectFactory.makeString(" of the assertions of the constant ");
        $str272$_ = SubLObjectFactory.makeString(".");
        $str273$Do_it_ = SubLObjectFactory.makeString("Do it!");
        $sym274$CB_ALL_ASSERTIONS_TMS = SubLObjectFactory.makeSymbol("CB-ALL-ASSERTIONS-TMS");
        $str275$Reperform_TMS_on_indexed_Assertio = SubLObjectFactory.makeString("Reperform TMS on indexed Assertions");
        $sym276$CB_ALL_ASSERTIONS_TMS_HANDLER = SubLObjectFactory.makeSymbol("CB-ALL-ASSERTIONS-TMS-HANDLER");
        $str277$_Force_TMS_ = SubLObjectFactory.makeString("[Force TMS]");
        $str278$cb_all_assertions_tms__A = SubLObjectFactory.makeString("cb-all-assertions-tms&~A");
        $kw279$ALL_ASSERTIONS_TMS = SubLObjectFactory.makeKeyword("ALL-ASSERTIONS-TMS");
        $sym280$CB_LINK_ALL_ASSERTIONS_TMS = SubLObjectFactory.makeSymbol("CB-LINK-ALL-ASSERTIONS-TMS");
        $sym281$_CB_LAST_HYP_FORMULA_ = SubLObjectFactory.makeSymbol("*CB-LAST-HYP-FORMULA*");
        $sym282$_CB_LAST_HYP_MT_ = SubLObjectFactory.makeSymbol("*CB-LAST-HYP-MT*");
        $kw283$CB_HYPOTHESIZE_HANDLER = SubLObjectFactory.makeKeyword("CB-HYPOTHESIZE-HANDLER");
        $str284$cb_hypothesize_handler_html = SubLObjectFactory.makeString("cb-hypothesize-handler.html");
        $str285$Hypothesize = SubLObjectFactory.makeString("Hypothesize");
        $str286$cb_hypothesize_handler = SubLObjectFactory.makeString("cb-hypothesize-handler");
        $str287$Reset_Values = SubLObjectFactory.makeString("Reset Values");
        $list288 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INPUT-NAME"), SubLObjectFactory.makeString("sentence"), SubLObjectFactory.makeKeyword("COMPLETE-LABEL"), SubLObjectFactory.makeString("Complete"), SubLObjectFactory.makeKeyword("CYCLIFY-LABEL"), SubLObjectFactory.makeString("Cyclify"), SubLObjectFactory.makeKeyword("CLEAR-LABEL"), SubLObjectFactory.makeString("Clear Sentence"), SubLObjectFactory.makeKeyword("HEIGHT"), cb_editor.TEN_INTEGER, SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeInteger(80) });
        $sym289$CB_HYPOTHESIZE_HANDLER = SubLObjectFactory.makeSymbol("CB-HYPOTHESIZE-HANDLER");
        $list290 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("sentence"));
        $str291$Last_hypothesis_in_ = SubLObjectFactory.makeString("Last hypothesis in ");
        $kw292$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str293$Error_description__ = SubLObjectFactory.makeString("Error description: ");
        $str294$Hypothesis_results___ = SubLObjectFactory.makeString("Hypothesis results : ");
        $kw295$HYPOTHESIZE = SubLObjectFactory.makeKeyword("HYPOTHESIZE");
        $sym296$CB_LINK_HYPOTHESIZE = SubLObjectFactory.makeSymbol("CB-LINK-HYPOTHESIZE");
        $str297$Hyp = SubLObjectFactory.makeString("Hyp");
        $str298$Hypothesize_a_formula = SubLObjectFactory.makeString("Hypothesize a formula");
        $str299$assertionId = SubLObjectFactory.makeString("assertionId");
        $sym300$XML_ASSERTION_INFO = SubLObjectFactory.makeSymbol("XML-ASSERTION-INFO");
        $list301 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString("cycl"));
        $sym302$CB_FORM_SMART = SubLObjectFactory.makeSymbol("CB-FORM-SMART");
    }
}

/*

	Total time: 2602 ms
	
*/