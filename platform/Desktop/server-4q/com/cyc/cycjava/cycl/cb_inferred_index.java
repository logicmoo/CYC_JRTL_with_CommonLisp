package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_inferred_index extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_inferred_index";
    public static final String myFingerPrint = "7133c6a831460df2b0a87f7409aa3e4394efaa5fb1979c158caf258cd12f3eea";
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 848L)
    public static SubLSymbol $cb_inferred_index_order_by$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 1005L)
    public static SubLSymbol $cb_inferred_index_filters$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 1280L)
    public static SubLSymbol $cb_inferred_index_visibility$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 42489L)
    private static SubLSymbol $predicate_support_module_map$;
    private static final SubLSymbol $kw0$ONTOLOGY;
    private static final SubLSymbol $sym1$_CB_INFERRED_INDEX_ORDER_BY_;
    private static final SubLSymbol $sym2$_CB_INFERRED_INDEX_FILTERS_;
    private static final SubLSymbol $kw3$INVISIBLE;
    private static final SubLSymbol $sym4$_CB_INFERRED_INDEX_VISIBILITY_;
    private static final SubLList $list5;
    private static final SubLString $str6$Unable_to_determine_a_term_from__;
    private static final SubLSymbol $sym7$CB_INFERRED_INDEX_FRAME;
    private static final SubLSymbol $kw8$HTML_HANDLER;
    private static final SubLSymbol $kw9$SELF;
    private static final SubLString $str10$_Inferred_;
    private static final SubLString $str11$cb_inferred_index_frame__A;
    private static final SubLSymbol $kw12$INFERRED_INDEX;
    private static final SubLSymbol $sym13$CB_LINK_INFERRED_INDEX;
    private static final SubLSymbol $sym14$CB_LEGACY_INDEX_FRAME;
    private static final SubLString $str15$_Legacy_;
    private static final SubLString $str16$cb_legacy_index_frame__A;
    private static final SubLSymbol $kw17$LEGACY_INDEX;
    private static final SubLSymbol $sym18$CB_LINK_LEGACY_INDEX;
    private static final SubLString $str19$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str20$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw21$UNINITIALIZED;
    private static final SubLSymbol $kw22$CB_CYC;
    private static final SubLString $str23$Browsing___;
    private static final SubLSymbol $kw24$DOCUMENTATION;
    private static final SubLString $str25$documentation;
    private static final SubLString $str26$___;
    private static final SubLSymbol $kw27$DEFINITIONAL;
    private static final SubLString $str28$definitional;
    private static final SubLSymbol $kw29$LEXICAL;
    private static final SubLString $str30$lexical;
    private static final SubLString $str31$Editing___;
    private static final SubLSymbol $kw32$EDIT_IN_SMT;
    private static final SubLString $str33$edit_in_SMT;
    private static final SubLSymbol $kw34$CREATE_SIMILAR;
    private static final SubLString $str35$copy;
    private static final SubLSymbol $kw36$RENAME;
    private static final SubLString $str37$rename;
    private static final SubLSymbol $kw38$LEXIFY_TERM;
    private static final SubLString $str39$lexify;
    private static final SubLSymbol $kw40$MERGE;
    private static final SubLString $str41$merge;
    private static final SubLSymbol $kw42$CONFIRM_KILL;
    private static final SubLSymbol $kw43$KILL;
    private static final SubLString $str44$kill;
    private static final SubLSymbol $kw45$CREATE_INSTANCE;
    private static final SubLString $str46$create_instance;
    private static final SubLSymbol $kw47$CREATE_SPEC;
    private static final SubLString $str48$create_spec;
    private static final SubLString $str49$Advanced___;
    private static final SubLSymbol $kw50$CHRONOLOGICAL_ORDER;
    private static final SubLString $str51$history;
    private static final SubLSymbol $kw52$DESCRIBE_NART;
    private static final SubLSymbol $kw53$DESCRIBE_CONSTANT;
    private static final SubLSymbol $kw54$TTT_TEST;
    private static final SubLString $str55$take_test;
    private static final SubLSymbol $kw56$KCT_TEST;
    private static final SubLString $str57$run_test;
    private static final SubLSymbol $kw58$KBQ_ASK;
    private static final SubLString $str59$ask_query;
    private static final SubLSymbol $kw60$KBQ_ASK_IN_PROOF_CHECKER;
    private static final SubLString $str61$proof_check_query;
    private static final SubLSymbol $kw62$KCT_EDIT;
    private static final SubLString $str63$edit_test;
    private static final SubLSymbol $kw64$KBQ_EDIT;
    private static final SubLString $str65$edit_query;
    private static final SubLSymbol $kw66$KB_MONITOR_INDEX_HOOK;
    private static final SubLString $str67$monitor;
    private static final SubLSymbol $kw68$KCT_TEST_SET;
    private static final SubLString $str69$run_test_set;
    private static final SubLString $str70$more_filters;
    private static final SubLSymbol $kw71$HANDLER;
    private static final SubLSymbol $sym72$CB_C_PERTINENT_QUERY_LINKS;
    private static final SubLSymbol $kw73$ARGS;
    private static final SubLString $str74$term;
    private static final SubLSymbol $kw75$MESSAGE;
    private static final SubLString $str76$Checking_for_Pertinent_Queries___;
    private static final SubLSymbol $kw77$TAG;
    private static final SubLString $str78$div;
    private static final SubLSymbol $kw79$DELAY;
    private static final SubLInteger $int80$50;
    private static final SubLSymbol $kw81$BEFORE;
    private static final SubLObject $const82$EverythingPSC;
    private static final SubLSymbol $kw83$BOTH;
    private static final SubLSymbol $kw84$AFTER;
    private static final SubLString $str85$as_seen_from;
    private static final SubLString $str86$100_;
    private static final SubLSymbol $kw87$LEFT;
    private static final SubLSymbol $kw88$TOP;
    private static final SubLSymbol $kw89$RIGHT;
    private static final SubLString $str90$40_;
    private static final SubLString $str91$order_by__;
    private static final SubLSymbol $kw92$PREDICATE;
    private static final SubLString $str93$predicate;
    private static final SubLSymbol $kw94$INFERRED_INDEX_ORDER_BY;
    private static final SubLString $str95$ontology;
    private static final SubLString $str96$filters__;
    private static final SubLSymbol $kw97$INFERRED_INDEX_PREDICATE_FILTERS;
    private static final SubLSymbol $kw98$INFERRED_INDEX_ONTOLOGY_FILTERS;
    private static final SubLSymbol $kw99$INFERRED_INDEX_MICROTHEORY_FILTERS;
    private static final SubLString $str100$mt;
    private static final SubLString $str101$index_view__;
    private static final SubLString $str102$inferred;
    private static final SubLString $str103$legacy;
    private static final SubLString $str104$Unexpected_order_by____S;
    private static final SubLString $str105$;
    private static final SubLString $str106$via_;
    private static final SubLSymbol $kw107$INFERRED_GAF_ARG_ASSERTIONS;
    private static final SubLInteger $int108$100;
    private static final SubLSymbol $kw109$VISIBLE;
    private static final SubLSymbol $kw110$TEXT;
    private static final SubLList $list111;
    private static final SubLString $str112$_arg_S;
    private static final SubLSymbol $kw113$LITERAL_QUERY;
    private static final SubLSymbol $kw114$HIER_BROW;
    private static final SubLString $str115$All_Assertions;
    private static final SubLInteger $int116$1000;
    private static final SubLSymbol $kw117$INFERRED_INDEX_TOGGLE_VISIBILITY;
    private static final SubLString $str118$__A_;
    private static final SubLString $str119$color__red__background_color_yell;
    private static final SubLString $str120$_;
    private static final SubLString $str121$igai_;
    private static final SubLSymbol $kw122$CONTENT;
    private static final SubLString $str123$cb_lq__A__A__A__A;
    private static final SubLString $str124$cb_lq__A__A__A;
    private static final SubLSymbol $kw125$PLUS_GREEN;
    private static final SubLSymbol $sym126$CB_LINK_LITERAL_QUERY;
    private static final SubLString $str127$cb_hier__A__A__A__A;
    private static final SubLString $str128$cb_hier__A__A__A;
    private static final SubLSymbol $kw129$RED_DIAMOND;
    private static final SubLSymbol $sym130$CB_LINK_HIER_BROW;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$CB_INFERRED_INDEX_ORDER_BY;
    private static final SubLString $str134$cb_inferred_index_order_by__A__A;
    private static final SubLSymbol $sym135$CB_LINK_INFERRED_INDEX_ORDER_BY;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$CB_INFERRED_INDEX_VISIBILITY;
    private static final SubLString $str138$close_all;
    private static final SubLString $str139$open_all;
    private static final SubLSymbol $kw140$DOWN_TRIANGLE_V;
    private static final SubLSymbol $kw141$RIGHT_TRIANGLE_V;
    private static final SubLString $str142$cb_inferred_index_visibility__A__;
    private static final SubLSymbol $kw143$CENTER;
    private static final SubLSymbol $sym144$CB_LINK_INFERRED_INDEX_TOGGLE_VISIBILITY;
    private static final SubLList $list145;
    private static final SubLString $str146$_S_did_not_specify_a_term;
    private static final SubLSymbol $sym147$CB_INFERRED_INDEX_PREDICATE_FILTERS;
    private static final SubLString $str148$_Predicate_Filters_;
    private static final SubLString $str149$cb_inferred_index_predicate_filte;
    private static final SubLSymbol $sym150$CB_LINK_INFERRED_INDEX_PREDICATE_FILTERS;
    private static final SubLString $str151$Inferred_Index_Predicate_Filters;
    private static final SubLString $str152$post;
    private static final SubLString $str153$cb_handle_inferred_index_predicat;
    private static final SubLString $str154$relevant_to_;
    private static final SubLString $str155$Update_Filters;
    private static final SubLString $str156$update;
    private static final SubLString $str157$Reset_Values;
    private static final SubLString $str158$Remove_All_Filters;
    private static final SubLString $str159$clear;
    private static final SubLSymbol $kw160$ALLOW_PREDICATES;
    private static final SubLSymbol $kw161$ALLOW_PREDICATE_TYPES;
    private static final SubLSymbol $kw162$FORBID_PREDICATES;
    private static final SubLSymbol $kw163$FORBID_PREDICATE_TYPES;
    private static final SubLString $str164$Allowed_Types;
    private static final SubLString $str165$check_to_remove;
    private static final SubLString $str166$add_;
    private static final SubLString $str167$type_allow;
    private static final SubLInteger $int168$30;
    private static final SubLString $str169$Complete;
    private static final SubLObject $const170$Collection;
    private static final SubLString $str171$Forbidden_Types;
    private static final SubLString $str172$type_forbid;
    private static final SubLString $str173$Allowed_Predicates;
    private static final SubLSymbol $kw174$RED;
    private static final SubLString $str175$None_;
    private static final SubLString $str176$check_to_forbid;
    private static final SubLString $str177$Forbidden_Predicates;
    private static final SubLString $str178$check_to_allow;
    private static final SubLString $str179$remove_type_allow_;
    private static final SubLString $str180$T;
    private static final SubLString $str181$remove_type_forbid_;
    private static final SubLString $str182$forbid_;
    private static final SubLString $str183$allow_;
    private static final SubLSymbol $sym184$CB_HANDLE_INFERRED_INDEX_PREDICATE_FILTERS;
    private static final SubLList $list185;
    private static final SubLSymbol $sym186$CB_INFERRED_INDEX_ONTOLOGY_FILTERS;
    private static final SubLString $str187$_Ontology_Filters_;
    private static final SubLString $str188$cb_inferred_index_ontology_filter;
    private static final SubLSymbol $sym189$CB_LINK_INFERRED_INDEX_ONTOLOGY_FILTERS;
    private static final SubLString $str190$Inferred_Index_Ontology_Filters;
    private static final SubLString $str191$cb_handle_inferred_index_ontology;
    private static final SubLSymbol $kw192$ONTOLOGY_HORIZON;
    private static final SubLString $str193$Generality_Horizon;
    private static final SubLString $str194$select_a_qualitative_boundary;
    private static final SubLList $list195;
    private static final SubLString $str196$or_a_generalization;
    private static final SubLSymbol $kw197$ALL;
    private static final SubLString $str198$ontology_horizon;
    private static final SubLSymbol $sym199$CB_HANDLE_INFERRED_INDEX_ONTOLOGY_FILTERS;
    private static final SubLString $str200$Just_on_the_term;
    private static final SubLSymbol $kw201$LOWER;
    private static final SubLString $str202$Also_from_the_lower_ontology;
    private static final SubLSymbol $kw203$MIDDLE;
    private static final SubLString $str204$Also_up_through_the_middle_ontolo;
    private static final SubLString $str205$Everything;
    private static final SubLString $str206$Time_to_implement_cb_inferred_ind;
    private static final SubLSymbol $sym207$CB_INFERRED_INDEX_MICROTHEORY_FILTERS;
    private static final SubLString $str208$_Microtheory_Filters_;
    private static final SubLSymbol $sym209$CB_LINK_INFERRED_INDEX_MICROTHEORY_FILTERS;
    private static final SubLSymbol $kw210$MICROTHEORY;
    private static final SubLString $str211$cb_inferred_gaf_arg_assertions__A;
    private static final SubLString $str212$cb_inferred_gaf_arg_assertions__A;
    private static final SubLString $str213$cb_inferred_gaf_arg_assertions__A;
    private static final SubLSymbol $sym214$CB_LINK_INFERRED_GAF_ARG_ASSERTIONS;
    private static final SubLList $list215;
    private static final SubLString $str216$Could_not_determine_a_term_from__;
    private static final SubLString $str217$NIL;
    private static final SubLString $str218$Could_not_determine_an_argnum_fro;
    private static final SubLSymbol $sym219$CB_INFERRED_GAF_ARG_ASSERTIONS;
    private static final SubLString $str220$Inferred_GAF_arg_index_for__S;
    private static final SubLString $str221$yui_skin_sam;
    private static final SubLString $str222$reloadFrameButton;
    private static final SubLString $str223$button;
    private static final SubLString $str224$reload;
    private static final SubLString $str225$Refresh;
    private static final SubLString $str226$reloadCurrentFrame__reloadFrameBu;
    private static final SubLSymbol $kw227$QUERY_ISA;
    private static final SubLString $str228$_query;
    private static final SubLList $list229;
    private static final SubLSymbol $kw230$QUERY;
    private static final SubLObject $const231$equals;
    private static final SubLString $str232$on_;
    private static final SubLString $str233$the_term;
    private static final SubLObject $const234$isa;
    private static final SubLSymbol $kw235$HL_SUPPORT;
    private static final SubLSymbol $kw236$NONE;
    private static final SubLString $str237$___;
    private static final SubLList $list238;
    private static final SubLSymbol $kw239$CLOSE_RED;
    private static final SubLString $str240$red_x_close_15_gif;
    private static final SubLSymbol $kw241$CLOSE_RED_DIM;
    private static final SubLString $str242$dim_red_x_close_15_gif;
    private static final SubLString $str243$gaf_entry;
    private static final SubLString $str244$___;
    private static final SubLString $str245$___;
    private static final SubLString $str246$Open_the_CURE_on_;
    private static final SubLString $str247$_to_add_more_facts_;
    private static final SubLString $str248$___;
    private static final SubLString $str249$__;
    private static final SubLList $list250;
    private static final SubLList $list251;
    private static final SubLSymbol $kw252$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw253$NAME;
    private static final SubLSymbol $kw254$PRED;
    private static final SubLSymbol $kw255$ARGNUM;
    private static final SubLInteger $int256$200;
    private static final SubLSymbol $kw257$PARAGRAPH;
    private static final SubLString $str258$unary_frame;
    private static final SubLString $str259$cb_handle_gaf_entry;
    private static final SubLString $str260$implicit_arg1;
    private static final SubLString $str261$unary_frame_pred;
    private static final SubLString $str262$unary_predicate;
    private static final SubLObject $const263$UnaryPredicate;
    private static final SubLString $str264$binary_frame;
    private static final SubLString $str265$_arg2;
    private static final SubLSymbol $kw266$BOTTOM;
    private static final SubLString $str267$Assert;
    private static final SubLSymbol $kw268$INPUT_NAME;
    private static final SubLSymbol $kw269$COMPLETE_TYPE;
    private static final SubLSymbol $kw270$CLEAR_LABEL;
    private static final SubLSymbol $kw271$COMPLETE_LABEL;
    private static final SubLSymbol $kw272$WIDTH;
    private static final SubLString $str273$binary_frame_pred;
    private static final SubLString $str274$binary_predicate;
    private static final SubLObject $const275$BinaryPredicate;
    private static final SubLString $str276$binary;
    private static final SubLString $str277$_arg1;
    private static final SubLString $str278$binary_frame_arg2;
    private static final SubLString $str279$arg2;
    private static final SubLObject $const280$Thing;
    private static final SubLString $str281$ternary;
    private static final SubLString $str282$_arg3;
    private static final SubLString $str283$binary_pred;
    private static final SubLString $str284$binary_arg1;
    private static final SubLString $str285$arg1;
    private static final SubLString $str286$binary_arg2;
    private static final SubLString $str287$ternary_pred;
    private static final SubLString $str288$ternary_predicate;
    private static final SubLObject $const289$TernaryPredicate;
    private static final SubLString $str290$ternary_arg1;
    private static final SubLString $str291$ternary_arg2;
    private static final SubLString $str292$ternary_arg3;
    private static final SubLString $str293$arg3;
    private static final SubLString $str294$_arg4;
    private static final SubLSymbol $kw295$DEFAULT;
    private static final SubLSymbol $sym296$CB_HANDLE_GAF_ENTRY;
    private static final SubLString $str297$_did_not_specify_a_term;
    private static final SubLString $str298$Unexpected_sentence_entry_method;
    private static final SubLString $str299$_A;
    private static final SubLString $str300$dim_;
    private static final SubLInteger $int301$10000;
    private static final SubLString $str302$setVisibility__;
    private static final SubLString $str303$___inline___setVisibility__;
    private static final SubLString $str304$___none___;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 1464L)
    public static SubLObject cb_inferred_index_frame(final SubLObject args) {
        SubLObject index_id = (SubLObject)cb_inferred_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inferred_index.$list5);
        index_id = args.first();
        final SubLObject current = args.rest();
        if (cb_inferred_index.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inferred_index.$list5);
            return (SubLObject)cb_inferred_index.NIL;
        }
        final SubLObject index_hook = cb_utilities.cb_guess_index(index_id);
        if (cb_inferred_index.NIL == index_hook) {
            return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str6$Unable_to_determine_a_term_from__, index_id, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        return cb_inferred_index(index_hook);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 1799L)
    public static SubLObject cb_link_inferred_index(final SubLObject v_term, SubLObject linktext, SubLObject target) {
        if (linktext == cb_inferred_index.UNPROVIDED) {
            linktext = (SubLObject)cb_inferred_index.NIL;
        }
        if (target == cb_inferred_index.UNPROVIDED) {
            target = (SubLObject)cb_inferred_index.$kw9$SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_inferred_index.NIL == linktext) {
            linktext = (SubLObject)cb_inferred_index.$str10$_Inferred_;
        }
        final SubLObject index_id = cb_utilities.cb_index_identifier(v_term);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str11$cb_inferred_index_frame__A, index_id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 2111L)
    public static SubLObject cb_legacy_index_frame(final SubLObject args) {
        SubLObject index_id = (SubLObject)cb_inferred_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inferred_index.$list5);
        index_id = args.first();
        final SubLObject current = args.rest();
        if (cb_inferred_index.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inferred_index.$list5);
            return (SubLObject)cb_inferred_index.NIL;
        }
        final SubLObject index_hook = cb_utilities.cb_guess_index(index_id);
        if (cb_inferred_index.NIL == index_hook) {
            return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str6$Unable_to_determine_a_term_from__, index_id, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        return cb_browser.cb_c_index(index_hook);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 2382L)
    public static SubLObject cb_link_legacy_index(final SubLObject v_term, SubLObject linktext, SubLObject target) {
        if (linktext == cb_inferred_index.UNPROVIDED) {
            linktext = (SubLObject)cb_inferred_index.NIL;
        }
        if (target == cb_inferred_index.UNPROVIDED) {
            target = (SubLObject)cb_inferred_index.$kw9$SELF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_inferred_index.NIL == linktext) {
            linktext = (SubLObject)cb_inferred_index.$str15$_Legacy_;
        }
        final SubLObject index_id = cb_utilities.cb_index_identifier(v_term);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name(target);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str16$cb_legacy_index_frame__A, index_id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 2688L)
    public static SubLObject cb_inferred_index(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject order_by = cb_inferred_index.$cb_inferred_index_order_by$.getDynamicValue(thread);
        final SubLObject filters = cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread);
        html_utilities.html_markup((SubLObject)cb_inferred_index.$str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_inferred_index.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_inferred_index.$str20$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_inferred_index.$kw21$UNINITIALIZED) ? ConsesLow.list(cb_inferred_index.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_inferred_index.$kw22$CB_CYC);
            final SubLObject _prev_bind_0_$1 = dhtml_macros.$html_element_id$.currentBinding(thread);
            try {
                dhtml_macros.$html_element_id$.bind((SubLObject)cb_inferred_index.ZERO_INTEGER, thread);
                dhtml_macros.basic_ajax_scripts();
                html_utilities.html_markup(dhtml_macros.$js_load_later$.getGlobalValue());
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.basic_ajax_scripts();
                dhtml_macros.dhtml_creation_scripts();
            }
            finally {
                dhtml_macros.$html_element_id$.rebind(_prev_bind_0_$1, thread);
            }
            final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_inferred_index.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    final SubLObject browsing_mt = inferred_indexing.inferred_index_filters_extract_microtheory(filters);
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(browsing_mt);
                    final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        cb_show_inferred_gaf_arg_index_header(v_term, filters, order_by);
                        html_utilities.html_hr((SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                        cb_show_inferred_gaf_arg_index_utilities_section(v_term);
                        html_utilities.html_hr((SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                        cb_show_inferred_gaf_arg_index(v_term, filters, order_by);
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
            }
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 3438L)
    public static SubLObject cb_show_inferred_gaf_arg_index_utilities_section(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject modification_permittedP = cb_editor.term_modification_permittedP(v_term);
        final SubLObject not_modifiableP = (SubLObject)SubLObjectFactory.makeBoolean(cb_inferred_index.NIL == modification_permittedP);
        html_utilities.html_princ_strong((SubLObject)cb_inferred_index.$str23$Browsing___);
        cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw24$DOCUMENTATION, v_term, (SubLObject)cb_inferred_index.$str25$documentation, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
        cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw27$DEFINITIONAL, v_term, (SubLObject)cb_inferred_index.$str28$definitional, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
        cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw29$LEXICAL, v_term, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$str30$lexical, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != cb_parameters.$cb_editing_enabled$.getDynamicValue(thread)) {
            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_princ_strong((SubLObject)cb_inferred_index.$str31$Editing___);
            if (cb_inferred_index.NIL != sksi_smt.$allow_smt_editing_links$.getDynamicValue(thread) && cb_inferred_index.NIL != sksi_kb_accessors.sk_source_in_any_mt_p(v_term) && cb_inferred_index.NIL != sksi_infrastructure_utilities.top_level_knowledge_source_in_any_mt_p(v_term)) {
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw32$EDIT_IN_SMT, v_term, (SubLObject)cb_inferred_index.$str33$edit_in_SMT, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
            }
            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw34$CREATE_SIMILAR, v_term, (SubLObject)cb_inferred_index.$str35$copy, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL != constant_handles.constant_p(v_term)) {
                html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw36$RENAME, v_term, (SubLObject)cb_inferred_index.$str37$rename, not_modifiableP, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            final SubLObject unlexifiedP = lexification_utilities.unlexifiedP(v_term, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
            if (cb_inferred_index.NIL != unlexifiedP) {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw38$LEXIFY_TERM, v_term, (SubLObject)cb_inferred_index.$str39$lexify, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            else {
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw38$LEXIFY_TERM, v_term, (SubLObject)cb_inferred_index.$str39$lexify, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            if (cb_inferred_index.NIL != cb_editor.term_as_merge_source_permittedP(v_term)) {
                html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw40$MERGE, v_term, (SubLObject)cb_inferred_index.$str41$merge, not_modifiableP, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
            cb_utilities.cb_link((SubLObject)((cb_inferred_index.NIL != cb_parameters.$cb_confirm_kills$.getDynamicValue(thread)) ? cb_inferred_index.$kw42$CONFIRM_KILL : cb_inferred_index.$kw43$KILL), v_term, (SubLObject)cb_inferred_index.$str44$kill, not_modifiableP, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL != fort_types_interface.collectionP(v_term)) {
                html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw45$CREATE_INSTANCE, v_term, (SubLObject)cb_inferred_index.$str46$create_instance, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw47$CREATE_SPEC, v_term, (SubLObject)cb_inferred_index.$str48$create_spec, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
        }
        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_princ_strong((SubLObject)cb_inferred_index.$str49$Advanced___);
        if (cb_inferred_index.NIL != forts.fort_p(v_term)) {
            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw50$CHRONOLOGICAL_ORDER, v_term, (SubLObject)cb_inferred_index.$str51$history, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
        }
        if (cb_inferred_index.NIL != nart_handles.nart_p(v_term)) {
            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw52$DESCRIBE_NART, v_term, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
        }
        else if (cb_inferred_index.NIL != constant_handles.constant_p(v_term)) {
            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw53$DESCRIBE_CONSTANT, v_term, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
        }
        if (cb_inferred_index.NIL != kct_utils.kct_test_spec_p(v_term, (SubLObject)cb_inferred_index.UNPROVIDED)) {
            final SubLObject ttt_linkP = (SubLObject)cb_inferred_index.NIL;
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            if (cb_inferred_index.NIL != ttt_linkP) {
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw54$TTT_TEST, v_term, (SubLObject)cb_inferred_index.$str55$take_test, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            else {
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw56$KCT_TEST, v_term, (SubLObject)cb_inferred_index.$str57$run_test, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        if (cb_inferred_index.NIL != kb_query.kbq_query_spec_p(v_term) || cb_inferred_index.NIL != kct_utils.kct_test_spec_p(v_term, (SubLObject)cb_inferred_index.UNPROVIDED)) {
            final SubLObject query = (cb_inferred_index.NIL != kct_utils.kct_test_spec_p(v_term, (SubLObject)cb_inferred_index.UNPROVIDED)) ? kct_utils.kct_query_specification(v_term, (SubLObject)cb_inferred_index.UNPROVIDED) : v_term;
            if (cb_inferred_index.NIL != forts.fort_p(query)) {
                html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw58$KBQ_ASK, query, (SubLObject)cb_inferred_index.$str59$ask_query, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                if (cb_inferred_index.NIL != cb_kb_query.kbq_query_practice_rules(query)) {
                    html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw60$KBQ_ASK_IN_PROOF_CHECKER, query, (SubLObject)cb_inferred_index.$str61$proof_check_query, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
            }
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            if (cb_inferred_index.NIL != kct_utils.kct_test_spec_p(v_term, (SubLObject)cb_inferred_index.UNPROVIDED)) {
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw62$KCT_EDIT, v_term, (SubLObject)cb_inferred_index.$str63$edit_test, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            else {
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw64$KBQ_EDIT, query, (SubLObject)cb_inferred_index.$str65$edit_query, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        if (cb_inferred_index.NIL != cb_parameters.$show_kb_monitor_links$.getDynamicValue(thread)) {
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw66$KB_MONITOR_INDEX_HOOK, v_term, (SubLObject)cb_inferred_index.$str67$monitor, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        if (cb_inferred_index.NIL != kct_utils.kct_test_collection_p(v_term, (SubLObject)cb_inferred_index.UNPROVIDED)) {
            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw68$KCT_TEST_SET, v_term, (SubLObject)cb_inferred_index.$str69$run_test_set, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        html_utilities.html_princ((SubLObject)cb_inferred_index.$str26$___);
        cb_browser.cb_c_index_views(v_term, (SubLObject)cb_inferred_index.$str70$more_filters);
        if (cb_inferred_index.NIL == cb_tools.cb_fastP()) {
            dhtml_macros.js_delayed_load_int((SubLObject)ConsesLow.list(new SubLObject[] { cb_inferred_index.$kw71$HANDLER, cb_inferred_index.$sym72$CB_C_PERTINENT_QUERY_LINKS, cb_inferred_index.$kw73$ARGS, ConsesLow.list(reader.bq_cons((SubLObject)cb_inferred_index.$str74$term, v_term)), cb_inferred_index.$kw75$MESSAGE, cb_inferred_index.$str76$Checking_for_Pertinent_Queries___, cb_inferred_index.$kw77$TAG, cb_inferred_index.$str78$div, cb_inferred_index.$kw79$DELAY, cb_inferred_index.$int80$50 }));
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 7932L)
    public static SubLObject cb_possibly_show_term_as_seen_from_mt_header(final SubLObject mt, SubLObject newline_mode) {
        if (newline_mode == cb_inferred_index.UNPROVIDED) {
            newline_mode = (SubLObject)cb_inferred_index.$kw81$BEFORE;
        }
        if (cb_inferred_index.NIL == kb_utilities.kbeq(mt, cb_inferred_index.$const82$EverythingPSC)) {
            SubLObject pcase_var = newline_mode;
            if (pcase_var.eql((SubLObject)cb_inferred_index.$kw81$BEFORE) || pcase_var.eql((SubLObject)cb_inferred_index.$kw83$BOTH)) {
                html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
            }
            cb_show_term_as_seen_from_mt_header(mt);
            pcase_var = newline_mode;
            if (pcase_var.eql((SubLObject)cb_inferred_index.$kw84$AFTER) || pcase_var.eql((SubLObject)cb_inferred_index.$kw83$BOTH)) {
                html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
            }
            return mt;
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 8247L)
    public static SubLObject cb_show_term_as_seen_from_mt_header(final SubLObject mt) {
        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_inferred_index.$str85$as_seen_from);
        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        cb_browser.cb_c_mt_header(mt, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.T, (SubLObject)cb_inferred_index.UNPROVIDED);
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 8412L)
    public static SubLObject cb_show_inferred_gaf_arg_index_header(final SubLObject v_term, final SubLObject filters, final SubLObject order_by) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_inferred_index.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_inferred_index.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_inferred_index.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    final SubLObject size = cb_utilities.cb_term_font_size(v_term, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    final SubLObject size_val = size;
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (cb_inferred_index.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                        cb_utilities.cb_show_term(v_term, (SubLObject)cb_inferred_index.ZERO_INTEGER, (SubLObject)cb_inferred_index.T);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    final SubLObject browsing_mt = inferred_indexing.inferred_index_filters_extract_microtheory(filters);
                    cb_possibly_show_term_as_seen_from_mt_header(browsing_mt, (SubLObject)cb_inferred_index.$kw81$BEFORE);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_utilities.html_indent((SubLObject)cb_inferred_index.TWO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw89$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inferred_index.$str90$40_);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_inferred_index.$str91$order_by__);
                    html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                    if (order_by == cb_inferred_index.$kw92$PREDICATE) {
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str93$predicate);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    else {
                        cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw94$INFERRED_INDEX_ORDER_BY, v_term, (SubLObject)cb_inferred_index.$kw92$PREDICATE, (SubLObject)cb_inferred_index.$str93$predicate, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                    if (order_by == cb_inferred_index.$kw0$ONTOLOGY) {
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str95$ontology);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    else {
                        cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw94$INFERRED_INDEX_ORDER_BY, v_term, (SubLObject)cb_inferred_index.$kw0$ONTOLOGY, (SubLObject)cb_inferred_index.$str95$ontology, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_inferred_index.$str96$filters__);
                    html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw97$INFERRED_INDEX_PREDICATE_FILTERS, v_term, (SubLObject)cb_inferred_index.$str93$predicate, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw98$INFERRED_INDEX_ONTOLOGY_FILTERS, v_term, (SubLObject)cb_inferred_index.$str95$ontology, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw99$INFERRED_INDEX_MICROTHEORY_FILTERS, v_term, (SubLObject)cb_inferred_index.$str100$mt, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_inferred_index.$str101$index_view__);
                    html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw12$INFERRED_INDEX, v_term, (SubLObject)cb_inferred_index.$str102$inferred, (SubLObject)cb_inferred_index.$kw9$SELF, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                    cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw17$LEGACY_INDEX, v_term, (SubLObject)cb_inferred_index.$str103$legacy, (SubLObject)cb_inferred_index.$kw9$SELF, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 10145L)
    public static SubLObject cb_show_inferred_gaf_arg_index(final SubLObject v_term, SubLObject filters, SubLObject order_by) {
        if (filters == cb_inferred_index.UNPROVIDED) {
            filters = (SubLObject)cb_inferred_index.NIL;
        }
        if (order_by == cb_inferred_index.UNPROVIDED) {
            order_by = (SubLObject)cb_inferred_index.$kw92$PREDICATE;
        }
        final SubLObject tuples = inferred_indexing.all_inferred_gaf_arg_index_tuples(v_term, filters, order_by);
        final SubLObject tuple_groups = inferred_indexing.categorize_inferred_gaf_arg_index_tuples(v_term, tuples, order_by);
        final SubLObject pcase_var = order_by;
        if (pcase_var.eql((SubLObject)cb_inferred_index.$kw0$ONTOLOGY)) {
            return cb_show_inferred_gaf_arg_index_by_ontology(v_term, tuple_groups);
        }
        if (pcase_var.eql((SubLObject)cb_inferred_index.$kw92$PREDICATE)) {
            return cb_show_inferred_gaf_arg_index_by_predicate(v_term, tuple_groups);
        }
        return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str104$Unexpected_order_by____S, order_by, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 10685L)
    public static SubLObject cb_show_inferred_gaf_arg_index_by_ontology(final SubLObject v_term, final SubLObject tuple_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_inferred_index.NIL != tuple_groups) {
            cb_show_inferred_gaf_arg_index_all_assertions_line(v_term, tuple_groups);
            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
        }
        SubLObject cdolist_list_var = tuple_groups;
        SubLObject tuples = (SubLObject)cb_inferred_index.NIL;
        tuples = cdolist_list_var.first();
        while (cb_inferred_index.NIL != cdolist_list_var) {
            final SubLObject first_tuple = tuples.first();
            final SubLObject group_qua = conses_high.second(first_tuple);
            final SubLObject dhtml_object_id = cb_make_inferred_gaf_arg_index_tuples_object_id(group_qua, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, (SubLObject)cb_inferred_index.$str105$);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str106$via_);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw107$INFERRED_GAF_ARG_ASSERTIONS, v_term, group_qua, group_qua, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject count = inferred_indexing.num_inferred_gaf_arg_index_tuples(tuples, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_inferred_index.TWO_INTEGER);
            cb_show_inferred_index_count(count, (SubLObject)cb_inferred_index.$int108$100);
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
            dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, (SubLObject)(group_qua.eql(v_term) ? cb_inferred_index.$kw109$VISIBLE : cb_inferred_index.$cb_inferred_index_visibility$.getDynamicValue(thread)), (SubLObject)cb_inferred_index.$kw110$TEXT);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            if (cb_inferred_index.NIL != dhtml_object_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(dhtml_object_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                SubLObject cdolist_list_var_$10 = tuples;
                SubLObject tuple = (SubLObject)cb_inferred_index.NIL;
                tuple = cdolist_list_var_$10.first();
                while (cb_inferred_index.NIL != cdolist_list_var_$10) {
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject infer_pred = (SubLObject)cb_inferred_index.NIL;
                    SubLObject qua = (SubLObject)cb_inferred_index.NIL;
                    SubLObject argnum = (SubLObject)cb_inferred_index.NIL;
                    SubLObject pred = (SubLObject)cb_inferred_index.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    infer_pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    qua = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    argnum = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    pred = current.first();
                    current = current.rest();
                    if (cb_inferred_index.NIL == current) {
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_inferred_index.FOUR_INTEGER);
                        cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw107$INFERRED_GAF_ARG_ASSERTIONS, v_term, pred, qua, argnum, pred);
                        if (!argnum.numE((SubLObject)cb_inferred_index.ONE_INTEGER)) {
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str112$_arg_S, argnum);
                        }
                        final SubLObject count2 = inferred_indexing.num_inferred_gaf_arg_index_tuple(tuple, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_inferred_index.TWO_INTEGER);
                        cb_show_inferred_index_count(count2, (SubLObject)cb_inferred_index.$int108$100);
                        final SubLObject literal_queryP = cb_show_inferred_index_literal_query_linkP(v_term, argnum, pred);
                        final SubLObject hierarchy_browserP = cb_show_inferred_index_hierarchy_browser_linkP(v_term, argnum, pred);
                        if (cb_inferred_index.NIL != literal_queryP) {
                            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw113$LITERAL_QUERY, v_term, argnum, pred, cb_inferred_index.$const82$EverythingPSC, (SubLObject)cb_inferred_index.UNPROVIDED);
                        }
                        if (cb_inferred_index.NIL != hierarchy_browserP) {
                            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw114$HIER_BROW, v_term, argnum, pred, cb_inferred_index.$const82$EverythingPSC, (SubLObject)cb_inferred_index.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_inferred_index.$list111);
                    }
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    tuple = cdolist_list_var_$10.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            tuples = cdolist_list_var.first();
        }
        cb_browser.cb_show_term_index_besides_gaf_arg(v_term);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 12767L)
    public static SubLObject cb_show_inferred_gaf_arg_index_by_predicate(final SubLObject v_term, final SubLObject tuple_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_inferred_index.NIL != tuple_groups) {
            cb_show_inferred_gaf_arg_index_all_assertions_line(v_term, tuple_groups);
            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
        }
        SubLObject cdolist_list_var = tuple_groups;
        SubLObject tuples = (SubLObject)cb_inferred_index.NIL;
        tuples = cdolist_list_var.first();
        while (cb_inferred_index.NIL != cdolist_list_var) {
            final SubLObject first_tuple = tuples.first();
            final SubLObject first_qua = conses_high.second(first_tuple);
            final SubLObject group_pred = conses_high.fourth(first_tuple);
            final SubLObject group_argnum = conses_high.third(first_tuple);
            final SubLObject dhtml_object_id = cb_make_inferred_gaf_arg_index_tuples_object_id(group_pred, group_argnum);
            final SubLObject only_selfP = (SubLObject)SubLObjectFactory.makeBoolean(cb_inferred_index.NIL != list_utilities.singletonP(tuples) && v_term.equal(first_qua));
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            if (cb_inferred_index.NIL != only_selfP) {
                dhtml_macros.dhtml_switch_visibility_no_arrow();
            }
            else {
                dhtml_macros.dhtml_switch_visibility_links_arrows(dhtml_object_id, (SubLObject)cb_inferred_index.$str105$);
            }
            final SubLObject size_val;
            final SubLObject size = size_val = cb_utilities.cb_term_font_size(group_pred, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_inferred_index.NIL != size_val) {
                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(size_val);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw107$INFERRED_GAF_ARG_ASSERTIONS, v_term, group_pred, (SubLObject)cb_inferred_index.NIL, group_argnum, group_pred);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            if (!group_argnum.numE((SubLObject)cb_inferred_index.ONE_INTEGER)) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str112$_arg_S, group_argnum);
            }
            final SubLObject count = inferred_indexing.num_inferred_gaf_arg_index_tuples(tuples, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_inferred_index.TWO_INTEGER);
            cb_show_inferred_index_count(count, (SubLObject)cb_inferred_index.$int108$100);
            final SubLObject literal_queryP = (SubLObject)SubLObjectFactory.makeBoolean(cb_inferred_index.NIL == only_selfP || cb_inferred_index.NIL != cb_show_inferred_index_literal_query_linkP(v_term, group_argnum, group_pred));
            if (cb_inferred_index.NIL != literal_queryP) {
                html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw113$LITERAL_QUERY, v_term, group_argnum, group_pred, cb_inferred_index.$const82$EverythingPSC, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            final SubLObject hierarchy_browserP = cb_show_inferred_index_hierarchy_browser_linkP(v_term, group_argnum, group_pred);
            if (cb_inferred_index.NIL != hierarchy_browserP) {
                html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw114$HIER_BROW, v_term, group_argnum, group_pred, cb_inferred_index.$const82$EverythingPSC, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL == list_utilities.singletonP(tuples) || !v_term.equal(first_qua)) {
                dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id, cb_inferred_index.$cb_inferred_index_visibility$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw110$TEXT);
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (cb_inferred_index.NIL != dhtml_object_id) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(dhtml_object_id);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    SubLObject cdolist_list_var_$11 = tuples;
                    SubLObject tuple = (SubLObject)cb_inferred_index.NIL;
                    tuple = cdolist_list_var_$11.first();
                    while (cb_inferred_index.NIL != cdolist_list_var_$11) {
                        SubLObject current;
                        final SubLObject datum = current = tuple;
                        SubLObject infer_pred = (SubLObject)cb_inferred_index.NIL;
                        SubLObject qua = (SubLObject)cb_inferred_index.NIL;
                        SubLObject argnum = (SubLObject)cb_inferred_index.NIL;
                        SubLObject pred = (SubLObject)cb_inferred_index.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                        infer_pred = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                        qua = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                        argnum = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                        pred = current.first();
                        current = current.rest();
                        if (cb_inferred_index.NIL == current) {
                            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                            html_utilities.html_indent((SubLObject)cb_inferred_index.FOUR_INTEGER);
                            html_utilities.html_princ((SubLObject)cb_inferred_index.$str106$via_);
                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw107$INFERRED_GAF_ARG_ASSERTIONS, v_term, qua, qua, argnum, pred);
                            final SubLObject count2 = inferred_indexing.num_inferred_gaf_arg_index_tuple(tuple, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_inferred_index.TWO_INTEGER);
                            cb_show_inferred_index_count(count2, (SubLObject)cb_inferred_index.$int108$100);
                            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_inferred_index.$list111);
                        }
                        cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                        tuple = cdolist_list_var_$11.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuples = cdolist_list_var.first();
        }
        cb_browser.cb_show_term_index_besides_gaf_arg(v_term);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 15285L)
    public static SubLObject cb_show_inferred_gaf_arg_index_all_assertions_line(final SubLObject v_term, final SubLObject tuple_groups) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw107$INFERRED_GAF_ARG_ASSERTIONS, v_term, (SubLObject)cb_inferred_index.$str115$All_Assertions, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject count = inferred_indexing.num_inferred_gaf_arg_index_tuple_groups(tuple_groups, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_inferred_index.TWO_INTEGER);
        cb_show_inferred_index_count(count, (SubLObject)cb_inferred_index.$int116$1000);
        html_utilities.html_indent((SubLObject)cb_inferred_index.FOUR_INTEGER);
        cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw117$INFERRED_INDEX_TOGGLE_VISIBILITY, v_term, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 15711L)
    public static SubLObject cb_show_inferred_index_count(final SubLObject count, SubLObject warning_limit) {
        if (warning_limit == cb_inferred_index.UNPROVIDED) {
            warning_limit = (SubLObject)cb_inferred_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!cb_inferred_index.ONE_INTEGER.numE(count)) {
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str118$__A_, count);
            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
            if (cb_inferred_index.NIL != warning_limit && count.numG(warning_limit)) {
                html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                if (cb_inferred_index.NIL != cb_html_parameters.$cb_html_warn_class$.getDynamicValue(thread)) {
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(cb_html_parameters.$cb_html_warn_class$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inferred_index.$str119$color__red__background_color_yell);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_utilities.html_princ((SubLObject)cb_inferred_index.$str120$_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 16111L)
    public static SubLObject cb_make_inferred_gaf_arg_index_tuples_object_id(final SubLObject v_term, SubLObject argnum) {
        if (argnum == cb_inferred_index.UNPROVIDED) {
            argnum = (SubLObject)cb_inferred_index.NIL;
        }
        final SubLObject id = cb_utilities.cb_term_identifier(v_term);
        return Sequences.cconcatenate((SubLObject)cb_inferred_index.$str121$igai_, new SubLObject[] { format_nil.format_nil_a_no_copy(id), format_nil.format_nil_a_no_copy((SubLObject)((cb_inferred_index.NIL != argnum) ? argnum : cb_inferred_index.$str105$)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 16304L)
    public static SubLObject cb_link_literal_query(final SubLObject v_term, final SubLObject argnum, final SubLObject pred, SubLObject mt) {
        if (mt == cb_inferred_index.UNPROVIDED) {
            mt = (SubLObject)cb_inferred_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.$kw122$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        if (cb_inferred_index.NIL != mt) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str123$cb_lq__A__A__A__A, new SubLObject[] { cb_utilities.cb_fort_identifier(v_term), argnum, cb_utilities.cb_fort_identifier(pred), cb_utilities.cb_fort_identifier(mt) });
        }
        else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str124$cb_lq__A__A__A, new SubLObject[] { cb_utilities.cb_fort_identifier(v_term), argnum, cb_utilities.cb_fort_identifier(pred) });
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_inferred_index.$kw125$PLUS_GREEN);
            final SubLObject align = (SubLObject)cb_inferred_index.$kw88$TOP;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_inferred_index.$kw125$PLUS_GREEN);
            final SubLObject border = (SubLObject)cb_inferred_index.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            if (cb_inferred_index.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            if (cb_inferred_index.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 16678L)
    public static SubLObject cb_show_inferred_index_literal_query_linkP(final SubLObject v_term, final SubLObject argnum, final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_inferred_index.NIL != hl_supports.hl_predicate_p(pred) || cb_inferred_index.NIL != inference_trampolines.inference_symmetric_predicateP(pred) || cb_inferred_index.NIL != inference_trampolines.inference_transitive_predicateP(pred) || cb_inferred_index.NIL != inference_trampolines.inference_reflexive_predicateP(pred));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 17077L)
    public static SubLObject cb_link_hier_brow(final SubLObject v_term, final SubLObject argnum, final SubLObject pred, SubLObject mt) {
        if (mt == cb_inferred_index.UNPROVIDED) {
            mt = (SubLObject)cb_inferred_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.$kw122$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        if (cb_inferred_index.NIL != mt) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str127$cb_hier__A__A__A__A, new SubLObject[] { cb_utilities.cb_fort_identifier(v_term), argnum, cb_utilities.cb_fort_identifier(pred), cb_utilities.cb_fort_identifier(mt) });
        }
        else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str128$cb_hier__A__A__A, new SubLObject[] { cb_utilities.cb_fort_identifier(v_term), argnum, cb_utilities.cb_fort_identifier(pred) });
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_inferred_index.$kw129$RED_DIAMOND);
            final SubLObject align = (SubLObject)cb_inferred_index.$kw88$TOP;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_inferred_index.$kw129$RED_DIAMOND);
            final SubLObject border = (SubLObject)cb_inferred_index.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            if (cb_inferred_index.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            if (cb_inferred_index.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 17452L)
    public static SubLObject cb_show_inferred_index_hierarchy_browser_linkP(final SubLObject v_term, final SubLObject argnum, final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_inferred_index.NIL != genl_predicates.any_genl_predP(pred, (SubLObject)cb_inferred_index.$list131, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED) && argnum.eql((SubLObject)cb_inferred_index.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 17641L)
    public static SubLObject cb_inferred_index_order_by(final SubLObject args) {
        SubLObject index_id = (SubLObject)cb_inferred_index.NIL;
        SubLObject order_by_string = (SubLObject)cb_inferred_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inferred_index.$list132);
        index_id = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inferred_index.$list132);
        order_by_string = current.first();
        current = current.rest();
        if (cb_inferred_index.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inferred_index.$list132);
            return (SubLObject)cb_inferred_index.NIL;
        }
        final SubLObject index_hook = cb_utilities.cb_guess_index(index_id);
        if (cb_inferred_index.NIL == index_hook) {
            return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str6$Unable_to_determine_a_term_from__, index_id, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        final SubLObject order_by = Symbols.make_keyword(order_by_string);
        cb_inferred_index.$cb_inferred_index_order_by$.setDynamicValue(order_by);
        return cb_inferred_index(index_hook);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 18129L)
    public static SubLObject cb_link_inferred_index_order_by(final SubLObject v_term, final SubLObject order_by, final SubLObject linktext) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_id = cb_utilities.cb_index_identifier(v_term);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.$kw9$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str134$cb_inferred_index_order_by__A__A, index_id, order_by);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 18393L)
    public static SubLObject cb_inferred_index_visibility(final SubLObject args) {
        SubLObject index_id = (SubLObject)cb_inferred_index.NIL;
        SubLObject visibility_string = (SubLObject)cb_inferred_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inferred_index.$list136);
        index_id = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)cb_inferred_index.$list136);
        visibility_string = current.first();
        current = current.rest();
        if (cb_inferred_index.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inferred_index.$list136);
            return (SubLObject)cb_inferred_index.NIL;
        }
        final SubLObject index_hook = cb_utilities.cb_guess_index(index_id);
        final SubLObject visibility = reader.read_from_string_ignoring_errors(visibility_string, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL == index_hook) {
            return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str6$Unable_to_determine_a_term_from__, index_id, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        cb_inferred_index.$cb_inferred_index_visibility$.setDynamicValue(visibility);
        return cb_inferred_index(index_hook);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 18912L)
    public static SubLObject cb_link_inferred_index_toggle_visibility(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_id = cb_utilities.cb_index_identifier(v_term);
        final SubLObject toggled_visibility = (SubLObject)((cb_inferred_index.$cb_inferred_index_visibility$.getDynamicValue(thread) == cb_inferred_index.$kw109$VISIBLE) ? cb_inferred_index.$kw3$INVISIBLE : cb_inferred_index.$kw109$VISIBLE);
        final SubLObject linktext = (SubLObject)((cb_inferred_index.$cb_inferred_index_visibility$.getDynamicValue(thread) == cb_inferred_index.$kw109$VISIBLE) ? cb_inferred_index.$str138$close_all : cb_inferred_index.$str139$open_all);
        final SubLObject icon = (SubLObject)((cb_inferred_index.$cb_inferred_index_visibility$.getDynamicValue(thread) == cb_inferred_index.$kw109$VISIBLE) ? cb_inferred_index.$kw140$DOWN_TRIANGLE_V : cb_inferred_index.$kw141$RIGHT_TRIANGLE_V);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.$kw9$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str142$cb_inferred_index_visibility__A__, index_id, toggled_visibility);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src(icon));
            final SubLObject align = (SubLObject)cb_inferred_index.$kw88$TOP;
            final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string(icon);
            final SubLObject border = (SubLObject)cb_inferred_index.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            if (cb_inferred_index.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            if (cb_inferred_index.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            html_utilities.html_princ(linktext);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 19563L)
    public static SubLObject cb_inferred_index_predicate_filters(final SubLObject args) {
        SubLObject id_string = (SubLObject)cb_inferred_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inferred_index.$list145);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (cb_inferred_index.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inferred_index.$list145);
            return (SubLObject)cb_inferred_index.NIL;
        }
        final SubLObject v_term = cb_utilities.cb_guess_term(id_string, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL == kb_indexing_datastructures.indexed_term_p(v_term)) {
            return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str146$_S_did_not_specify_a_term, id_string, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        return cb_inferred_index_predicate_filters_guts(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 20054L)
    public static SubLObject cb_link_inferred_index_predicate_filters(SubLObject v_term, SubLObject linktext) {
        if (v_term == cb_inferred_index.UNPROVIDED) {
            v_term = (SubLObject)cb_inferred_index.NIL;
        }
        if (linktext == cb_inferred_index.UNPROVIDED) {
            linktext = (SubLObject)cb_inferred_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_inferred_index.NIL == linktext) {
            linktext = (SubLObject)cb_inferred_index.$str148$_Predicate_Filters_;
        }
        final SubLObject id = cb_utilities.cb_term_identifier(v_term);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.$kw122$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str149$cb_inferred_index_predicate_filte, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 20378L)
    public static SubLObject cb_inferred_index_predicate_filters_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = (SubLObject)cb_inferred_index.$str151$Inferred_Index_Predicate_Filters;
        html_utilities.html_markup((SubLObject)cb_inferred_index.$str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_inferred_index.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_inferred_index.$str20$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_inferred_index.$kw21$UNINITIALIZED) ? ConsesLow.list(cb_inferred_index.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_inferred_index.$kw22$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$15 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_inferred_index.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_inferred_index.$str152$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    if (cb_inferred_index.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_inferred_index.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str153$cb_handle_inferred_index_predicat, (SubLObject)cb_inferred_index.T, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject size_val = (SubLObject)cb_inferred_index.FIVE_INTEGER;
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (cb_inferred_index.NIL != size_val) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(size_val);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_princ_strong(title);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str154$relevant_to_);
                        html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_show_term(v_term, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_inferred_index.TWO_INTEGER);
                        html_utilities.html_submit_input((SubLObject)cb_inferred_index.$str155$Update_Filters, (SubLObject)cb_inferred_index.$str156$update, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_inferred_index.TWO_INTEGER);
                        html_utilities.html_reset_input((SubLObject)cb_inferred_index.$str157$Reset_Values);
                        html_utilities.html_indent((SubLObject)cb_inferred_index.FOUR_INTEGER);
                        html_utilities.html_submit_input((SubLObject)cb_inferred_index.$str158$Remove_All_Filters, (SubLObject)cb_inferred_index.$str159$clear, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_inferred_index.TWO_INTEGER);
                        final SubLObject current;
                        final SubLObject datum = current = cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread);
                        final SubLObject allow_predicates_tail = cdestructuring_bind.property_list_member((SubLObject)cb_inferred_index.$kw160$ALLOW_PREDICATES, current);
                        final SubLObject allow_predicates = (SubLObject)((cb_inferred_index.NIL != allow_predicates_tail) ? conses_high.cadr(allow_predicates_tail) : cb_inferred_index.NIL);
                        final SubLObject allow_predicate_types_tail = cdestructuring_bind.property_list_member((SubLObject)cb_inferred_index.$kw161$ALLOW_PREDICATE_TYPES, current);
                        final SubLObject allow_predicate_types = (SubLObject)((cb_inferred_index.NIL != allow_predicate_types_tail) ? conses_high.cadr(allow_predicate_types_tail) : cb_inferred_index.NIL);
                        final SubLObject forbid_predicates_tail = cdestructuring_bind.property_list_member((SubLObject)cb_inferred_index.$kw162$FORBID_PREDICATES, current);
                        final SubLObject forbid_predicates = (SubLObject)((cb_inferred_index.NIL != forbid_predicates_tail) ? conses_high.cadr(forbid_predicates_tail) : cb_inferred_index.NIL);
                        final SubLObject forbid_predicate_types_tail = cdestructuring_bind.property_list_member((SubLObject)cb_inferred_index.$kw163$FORBID_PREDICATE_TYPES, current);
                        final SubLObject forbid_predicate_types = (SubLObject)((cb_inferred_index.NIL != forbid_predicate_types_tail) ? conses_high.cadr(forbid_predicate_types_tail) : cb_inferred_index.NIL);
                        final SubLObject term_predicates = inferred_indexing.all_inferred_gaf_arg_index_predicates(v_term);
                        thread.resetMultipleValues();
                        SubLObject term_allow_predicates = inferred_indexing.categorize_via_pred_filters(term_predicates, cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread));
                        SubLObject term_forbid_predicates = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        term_allow_predicates = conses_high.union(allow_predicates, term_allow_predicates, Symbols.symbol_function((SubLObject)cb_inferred_index.EQ), (SubLObject)cb_inferred_index.UNPROVIDED);
                        term_forbid_predicates = conses_high.union(forbid_predicates, term_forbid_predicates, Symbols.symbol_function((SubLObject)cb_inferred_index.EQ), (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str74$term, cb_utilities.cb_term_identifier(v_term), (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    final SubLObject size_val2 = (SubLObject)cb_inferred_index.FIVE_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_inferred_index.NIL != size_val2) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(size_val2);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str164$Allowed_Types);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    if (cb_inferred_index.NIL != allow_predicate_types) {
                                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str165$check_to_remove);
                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        SubLObject cdolist_list_var = allow_predicate_types;
                                        SubLObject type = (SubLObject)cb_inferred_index.NIL;
                                        type = cdolist_list_var.first();
                                        while (cb_inferred_index.NIL != cdolist_list_var) {
                                            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                            cb_inferred_index_predicate_type_filter_remove_allow_checkbox(type);
                                            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                                            cb_utilities.cb_show_term(type, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            type = cdolist_list_var.first();
                                        }
                                    }
                                    html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_inferred_index.$str166$add_);
                                    html_utilities.html_text_input((SubLObject)cb_inferred_index.$str167$type_allow, (SubLObject)cb_inferred_index.$str105$, (SubLObject)cb_inferred_index.$int168$30);
                                    html_utilities.html_indent((SubLObject)cb_inferred_index.ONE_INTEGER);
                                    html_complete.html_complete_button((SubLObject)cb_inferred_index.$str167$type_allow, (SubLObject)cb_inferred_index.$str169$Complete, cb_inferred_index.$const170$Collection, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_inferred_index.TWO_INTEGER);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_indent((SubLObject)cb_inferred_index.FOUR_INTEGER);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    final SubLObject size_val2 = (SubLObject)cb_inferred_index.FIVE_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_inferred_index.NIL != size_val2) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(size_val2);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str171$Forbidden_Types);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    if (cb_inferred_index.NIL != forbid_predicate_types) {
                                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str165$check_to_remove);
                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        SubLObject cdolist_list_var = forbid_predicate_types;
                                        SubLObject type = (SubLObject)cb_inferred_index.NIL;
                                        type = cdolist_list_var.first();
                                        while (cb_inferred_index.NIL != cdolist_list_var) {
                                            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                            cb_inferred_index_predicate_type_filter_remove_forbid_checkbox(type);
                                            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                                            cb_utilities.cb_show_term(type, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            type = cdolist_list_var.first();
                                        }
                                    }
                                    html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_princ((SubLObject)cb_inferred_index.$str166$add_);
                                    html_utilities.html_text_input((SubLObject)cb_inferred_index.$str172$type_forbid, (SubLObject)cb_inferred_index.$str105$, (SubLObject)cb_inferred_index.$int168$30);
                                    html_utilities.html_indent((SubLObject)cb_inferred_index.ONE_INTEGER);
                                    html_complete.html_complete_button((SubLObject)cb_inferred_index.$str172$type_forbid, (SubLObject)cb_inferred_index.$str169$Complete, cb_inferred_index.$const170$Collection, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_newline((SubLObject)cb_inferred_index.TWO_INTEGER);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    final SubLObject size_val2 = (SubLObject)cb_inferred_index.FIVE_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_inferred_index.NIL != size_val2) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(size_val2);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str173$Allowed_Predicates);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    if (cb_inferred_index.NIL == term_allow_predicates) {
                                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject color_val = (SubLObject)cb_inferred_index.$kw174$RED;
                                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                        if (cb_inferred_index.NIL != color_val) {
                                            html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_color(color_val));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_princ((SubLObject)cb_inferred_index.$str175$None_);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    }
                                    if (cb_inferred_index.NIL != term_allow_predicates) {
                                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str176$check_to_forbid);
                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        SubLObject cdolist_list_var = term_allow_predicates;
                                        SubLObject predicate = (SubLObject)cb_inferred_index.NIL;
                                        predicate = cdolist_list_var.first();
                                        while (cb_inferred_index.NIL != cdolist_list_var) {
                                            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                            cb_inferred_index_predicate_filter_forbid_checkbox(predicate);
                                            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                                            cb_utilities.cb_show_term(predicate, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            predicate = cdolist_list_var.first();
                                        }
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_indent((SubLObject)cb_inferred_index.FOUR_INTEGER);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    final SubLObject size_val2 = (SubLObject)cb_inferred_index.FIVE_INTEGER;
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_inferred_index.NIL != size_val2) {
                                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(size_val2);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str177$Forbidden_Predicates);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    if (cb_inferred_index.NIL == term_forbid_predicates) {
                                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str175$None_);
                                    }
                                    if (cb_inferred_index.NIL != term_forbid_predicates) {
                                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str178$check_to_allow);
                                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        SubLObject cdolist_list_var = term_forbid_predicates;
                                        SubLObject predicate = (SubLObject)cb_inferred_index.NIL;
                                        predicate = cdolist_list_var.first();
                                        while (cb_inferred_index.NIL != cdolist_list_var) {
                                            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                            cb_inferred_index_predicate_filter_allow_checkbox(predicate);
                                            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                                            cb_utilities.cb_show_term(predicate, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            predicate = cdolist_list_var.first();
                                        }
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$15, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 24307L)
    public static SubLObject cb_inferred_index_predicate_type_filter_remove_allow_checkbox(final SubLObject type) {
        return html_utilities.html_checkbox_input(Sequences.cconcatenate((SubLObject)cb_inferred_index.$str179$remove_type_allow_, format_nil.format_nil_a_no_copy(cb_utilities.cb_term_identifier(type))), (SubLObject)cb_inferred_index.$str180$T, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 24495L)
    public static SubLObject cb_inferred_index_predicate_type_filter_remove_forbid_checkbox(final SubLObject type) {
        return html_utilities.html_checkbox_input(Sequences.cconcatenate((SubLObject)cb_inferred_index.$str181$remove_type_forbid_, format_nil.format_nil_a_no_copy(cb_utilities.cb_term_identifier(type))), (SubLObject)cb_inferred_index.$str180$T, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 24684L)
    public static SubLObject cb_inferred_index_predicate_filter_forbid_checkbox(final SubLObject predicate) {
        return html_utilities.html_checkbox_input(Sequences.cconcatenate((SubLObject)cb_inferred_index.$str182$forbid_, format_nil.format_nil_a_no_copy(cb_utilities.cb_term_identifier(predicate))), (SubLObject)cb_inferred_index.$str180$T, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 24861L)
    public static SubLObject cb_inferred_index_predicate_filter_allow_checkbox(final SubLObject predicate) {
        return html_utilities.html_checkbox_input(Sequences.cconcatenate((SubLObject)cb_inferred_index.$str183$allow_, format_nil.format_nil_a_no_copy(cb_utilities.cb_term_identifier(predicate))), (SubLObject)cb_inferred_index.$str180$T, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 25034L)
    public static SubLObject cb_handle_inferred_index_predicate_filters(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_string = html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str74$term, args);
        final SubLObject v_term = cb_utilities.cb_guess_term(term_string, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str159$clear, args)) {
            cb_clear_inferred_index_predicate_filters();
        }
        else {
            thread.resetMultipleValues();
            final SubLObject new_type_allow = cb_extract_inferred_index_predicate_filters(args);
            final SubLObject type_allows_to_remove = thread.secondMultipleValue();
            final SubLObject new_type_forbid = thread.thirdMultipleValue();
            final SubLObject type_forbids_to_remove = thread.fourthMultipleValue();
            final SubLObject new_predicates_to_allow = thread.fifthMultipleValue();
            final SubLObject new_predicates_to_forbid = thread.sixthMultipleValue();
            thread.resetMultipleValues();
            cb_update_inferred_index_predicate_filters(new_type_allow, type_allows_to_remove, new_type_forbid, type_forbids_to_remove, new_predicates_to_allow, new_predicates_to_forbid);
        }
        return cb_inferred_index_predicate_filters_guts(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 26085L)
    public static SubLObject cb_extract_inferred_index_predicate_filters(final SubLObject args) {
        SubLObject new_type_allow = (SubLObject)cb_inferred_index.NIL;
        SubLObject type_allows_to_remove = (SubLObject)cb_inferred_index.NIL;
        SubLObject new_type_forbid = (SubLObject)cb_inferred_index.NIL;
        SubLObject type_forbids_to_remove = (SubLObject)cb_inferred_index.NIL;
        SubLObject new_predicates_to_allow = (SubLObject)cb_inferred_index.NIL;
        SubLObject new_predicates_to_forbid = (SubLObject)cb_inferred_index.NIL;
        final SubLObject type_allow_string = html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str167$type_allow, args);
        if (cb_inferred_index.NIL == string_utilities.empty_string_p(type_allow_string)) {
            final SubLObject v_term = cb_utilities.cb_guess_term(type_allow_string, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL != v_term) {
                new_type_allow = v_term;
            }
        }
        final SubLObject type_forbid_string = html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str172$type_forbid, args);
        if (cb_inferred_index.NIL == string_utilities.empty_string_p(type_forbid_string)) {
            final SubLObject v_term2 = cb_utilities.cb_guess_term(type_forbid_string, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL != v_term2) {
                new_type_forbid = v_term2;
            }
        }
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)cb_inferred_index.NIL;
        arg = cdolist_list_var.first();
        while (cb_inferred_index.NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current;
                final SubLObject datum = current = arg;
                SubLObject name = (SubLObject)cb_inferred_index.NIL;
                SubLObject value = (SubLObject)cb_inferred_index.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list185);
                name = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list185);
                value = current.first();
                current = current.rest();
                if (cb_inferred_index.NIL == current) {
                    if (cb_inferred_index.NIL != string_utilities.starts_with(name, (SubLObject)cb_inferred_index.$str182$forbid_)) {
                        final SubLObject id_string = string_utilities.substring(name, (SubLObject)cb_inferred_index.SEVEN_INTEGER, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject var;
                        final SubLObject v_term3 = var = cb_utilities.cb_guess_term(id_string, (SubLObject)cb_inferred_index.UNPROVIDED);
                        if (cb_inferred_index.NIL != var) {
                            new_predicates_to_forbid = (SubLObject)ConsesLow.cons(var, new_predicates_to_forbid);
                        }
                    }
                    else if (cb_inferred_index.NIL != string_utilities.starts_with(name, (SubLObject)cb_inferred_index.$str183$allow_)) {
                        final SubLObject id_string = string_utilities.substring(name, (SubLObject)cb_inferred_index.SIX_INTEGER, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject var;
                        final SubLObject v_term3 = var = cb_utilities.cb_guess_term(id_string, (SubLObject)cb_inferred_index.UNPROVIDED);
                        if (cb_inferred_index.NIL != var) {
                            new_predicates_to_allow = (SubLObject)ConsesLow.cons(var, new_predicates_to_allow);
                        }
                    }
                    else if (cb_inferred_index.NIL != string_utilities.starts_with(name, (SubLObject)cb_inferred_index.$str181$remove_type_forbid_)) {
                        final SubLObject id_string = string_utilities.substring(name, (SubLObject)cb_inferred_index.NINETEEN_INTEGER, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject var;
                        final SubLObject v_term3 = var = cb_utilities.cb_guess_term(id_string, (SubLObject)cb_inferred_index.UNPROVIDED);
                        if (cb_inferred_index.NIL != var) {
                            type_forbids_to_remove = (SubLObject)ConsesLow.cons(var, type_forbids_to_remove);
                        }
                    }
                    else if (cb_inferred_index.NIL != string_utilities.starts_with(name, (SubLObject)cb_inferred_index.$str179$remove_type_allow_)) {
                        final SubLObject id_string = string_utilities.substring(name, (SubLObject)cb_inferred_index.EIGHTEEN_INTEGER, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject var;
                        final SubLObject v_term3 = var = cb_utilities.cb_guess_term(id_string, (SubLObject)cb_inferred_index.UNPROVIDED);
                        if (cb_inferred_index.NIL != var) {
                            type_allows_to_remove = (SubLObject)ConsesLow.cons(var, type_allows_to_remove);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_inferred_index.$list185);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Values.values(new_type_allow, type_allows_to_remove, new_type_forbid, type_forbids_to_remove, new_predicates_to_allow, new_predicates_to_forbid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 27785L)
    public static SubLObject cb_clear_inferred_index_predicate_filters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(Symbols.remprop((SubLObject)cb_inferred_index.$kw161$ALLOW_PREDICATE_TYPES, cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread)), thread);
        cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(Symbols.remprop((SubLObject)cb_inferred_index.$kw163$FORBID_PREDICATE_TYPES, cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread)), thread);
        cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(Symbols.remprop((SubLObject)cb_inferred_index.$kw160$ALLOW_PREDICATES, cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread)), thread);
        cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(Symbols.remprop((SubLObject)cb_inferred_index.$kw162$FORBID_PREDICATES, cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread)), thread);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 28264L)
    public static SubLObject cb_update_inferred_index_predicate_filters(final SubLObject new_type_allow, final SubLObject type_allows_to_remove, final SubLObject new_type_forbid, final SubLObject type_forbids_to_remove, final SubLObject new_predicates_to_allow, final SubLObject new_predicates_to_forbid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_inferred_index.NIL != new_type_allow || cb_inferred_index.NIL != type_allows_to_remove) {
            SubLObject types = conses_high.getf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw161$ALLOW_PREDICATE_TYPES, (SubLObject)cb_inferred_index.NIL);
            if (cb_inferred_index.NIL != new_type_allow && cb_inferred_index.NIL == conses_high.member(new_type_allow, types, Symbols.symbol_function((SubLObject)cb_inferred_index.EQL), Symbols.symbol_function((SubLObject)cb_inferred_index.IDENTITY))) {
                types = (SubLObject)ConsesLow.cons(new_type_allow, types);
            }
            SubLObject cdolist_list_var = type_allows_to_remove;
            SubLObject type = (SubLObject)cb_inferred_index.NIL;
            type = cdolist_list_var.first();
            while (cb_inferred_index.NIL != cdolist_list_var) {
                types = list_utilities.delete_first(type, types, Symbols.symbol_function((SubLObject)cb_inferred_index.EQ));
                cdolist_list_var = cdolist_list_var.rest();
                type = cdolist_list_var.first();
            }
            cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(conses_high.putf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw161$ALLOW_PREDICATE_TYPES, types), thread);
        }
        if (cb_inferred_index.NIL != new_type_forbid || cb_inferred_index.NIL != type_forbids_to_remove) {
            SubLObject types = conses_high.getf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw163$FORBID_PREDICATE_TYPES, (SubLObject)cb_inferred_index.NIL);
            if (cb_inferred_index.NIL != new_type_forbid && cb_inferred_index.NIL == conses_high.member(new_type_forbid, types, Symbols.symbol_function((SubLObject)cb_inferred_index.EQL), Symbols.symbol_function((SubLObject)cb_inferred_index.IDENTITY))) {
                types = (SubLObject)ConsesLow.cons(new_type_forbid, types);
            }
            SubLObject cdolist_list_var = type_forbids_to_remove;
            SubLObject type = (SubLObject)cb_inferred_index.NIL;
            type = cdolist_list_var.first();
            while (cb_inferred_index.NIL != cdolist_list_var) {
                types = list_utilities.delete_first(type, types, Symbols.symbol_function((SubLObject)cb_inferred_index.EQ));
                cdolist_list_var = cdolist_list_var.rest();
                type = cdolist_list_var.first();
            }
            cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(conses_high.putf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw163$FORBID_PREDICATE_TYPES, types), thread);
        }
        if (cb_inferred_index.NIL != new_predicates_to_allow || cb_inferred_index.NIL != new_predicates_to_forbid) {
            SubLObject allow = conses_high.getf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw160$ALLOW_PREDICATES, (SubLObject)cb_inferred_index.NIL);
            SubLObject forbid = conses_high.getf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw162$FORBID_PREDICATES, (SubLObject)cb_inferred_index.NIL);
            SubLObject cdolist_list_var = new_predicates_to_allow;
            SubLObject pred = (SubLObject)cb_inferred_index.NIL;
            pred = cdolist_list_var.first();
            while (cb_inferred_index.NIL != cdolist_list_var) {
                forbid = list_utilities.delete_first(pred, forbid, Symbols.symbol_function((SubLObject)cb_inferred_index.EQ));
                final SubLObject item_var = pred;
                if (cb_inferred_index.NIL == conses_high.member(item_var, allow, Symbols.symbol_function((SubLObject)cb_inferred_index.EQ), Symbols.symbol_function((SubLObject)cb_inferred_index.IDENTITY))) {
                    allow = (SubLObject)ConsesLow.cons(item_var, allow);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            cdolist_list_var = new_predicates_to_forbid;
            pred = (SubLObject)cb_inferred_index.NIL;
            pred = cdolist_list_var.first();
            while (cb_inferred_index.NIL != cdolist_list_var) {
                allow = list_utilities.delete_first(pred, allow, Symbols.symbol_function((SubLObject)cb_inferred_index.EQ));
                final SubLObject item_var = pred;
                if (cb_inferred_index.NIL == conses_high.member(item_var, forbid, Symbols.symbol_function((SubLObject)cb_inferred_index.EQ), Symbols.symbol_function((SubLObject)cb_inferred_index.IDENTITY))) {
                    forbid = (SubLObject)ConsesLow.cons(item_var, forbid);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(conses_high.putf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw160$ALLOW_PREDICATES, allow), thread);
            cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(conses_high.putf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw162$FORBID_PREDICATES, forbid), thread);
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 29966L)
    public static SubLObject cb_inferred_index_ontology_filters(final SubLObject args) {
        SubLObject id_string = (SubLObject)cb_inferred_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inferred_index.$list145);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (cb_inferred_index.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inferred_index.$list145);
            return (SubLObject)cb_inferred_index.NIL;
        }
        final SubLObject v_term = cb_utilities.cb_guess_term(id_string, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL == kb_indexing_datastructures.indexed_term_p(v_term)) {
            return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str146$_S_did_not_specify_a_term, id_string, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        return cb_inferred_index_ontology_filters_guts(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 30456L)
    public static SubLObject cb_link_inferred_index_ontology_filters(SubLObject v_term, SubLObject linktext) {
        if (v_term == cb_inferred_index.UNPROVIDED) {
            v_term = (SubLObject)cb_inferred_index.NIL;
        }
        if (linktext == cb_inferred_index.UNPROVIDED) {
            linktext = (SubLObject)cb_inferred_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_inferred_index.NIL == linktext) {
            linktext = (SubLObject)cb_inferred_index.$str187$_Ontology_Filters_;
        }
        final SubLObject id = cb_utilities.cb_term_identifier(v_term);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.$kw122$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str188$cb_inferred_index_ontology_filter, id);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 30777L)
    public static SubLObject cb_inferred_index_ontology_filters_guts(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title = (SubLObject)cb_inferred_index.$str190$Inferred_Index_Ontology_Filters;
        html_utilities.html_markup((SubLObject)cb_inferred_index.$str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_inferred_index.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_inferred_index.$str20$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_inferred_index.$kw21$UNINITIALIZED) ? ConsesLow.list(cb_inferred_index.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_inferred_index.$kw22$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(title);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$33 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_inferred_index.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_inferred_index.$str152$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    if (cb_inferred_index.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_inferred_index.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str191$cb_handle_inferred_index_ontology, (SubLObject)cb_inferred_index.T, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject size_val = (SubLObject)cb_inferred_index.FIVE_INTEGER;
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (cb_inferred_index.NIL != size_val) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(size_val);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_princ_strong(title);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str154$relevant_to_);
                        html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_show_term(v_term, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_inferred_index.TWO_INTEGER);
                        html_utilities.html_submit_input((SubLObject)cb_inferred_index.$str155$Update_Filters, (SubLObject)cb_inferred_index.$str156$update, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_inferred_index.TWO_INTEGER);
                        html_utilities.html_reset_input((SubLObject)cb_inferred_index.$str157$Reset_Values);
                        html_utilities.html_newline((SubLObject)cb_inferred_index.TWO_INTEGER);
                        final SubLObject current;
                        final SubLObject datum = current = cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread);
                        final SubLObject ontology_horizon_tail = cdestructuring_bind.property_list_member((SubLObject)cb_inferred_index.$kw192$ONTOLOGY_HORIZON, current);
                        final SubLObject ontology_horizon = (SubLObject)((cb_inferred_index.NIL != ontology_horizon_tail) ? conses_high.cadr(ontology_horizon_tail) : cb_inferred_index.NIL);
                        final SubLObject ontology_terms = inferred_indexing.all_inferred_gaf_arg_index_ontology_terms(v_term);
                        html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str74$term, cb_utilities.cb_term_identifier(v_term), (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject size_val2 = (SubLObject)cb_inferred_index.FIVE_INTEGER;
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (cb_inferred_index.NIL != size_val2) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(size_val2);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_princ((SubLObject)cb_inferred_index.$str193$Generality_Horizon);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str194$select_a_qualitative_boundary);
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        SubLObject cdolist_list_var = (SubLObject)cb_inferred_index.$list195;
                        SubLObject qua = (SubLObject)cb_inferred_index.NIL;
                        qua = cdolist_list_var.first();
                        while (cb_inferred_index.NIL != cdolist_list_var) {
                            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                            cb_inferred_index_ontology_horizon_radio_button(qua, ontology_horizon);
                            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                            cb_show_ontology_horizon_term(qua);
                            cdolist_list_var = cdolist_list_var.rest();
                            qua = cdolist_list_var.first();
                        }
                        html_utilities.html_newline((SubLObject)cb_inferred_index.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_inferred_index.$str196$or_a_generalization);
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        cdolist_list_var = ontology_terms;
                        qua = (SubLObject)cb_inferred_index.NIL;
                        qua = cdolist_list_var.first();
                        while (cb_inferred_index.NIL != cdolist_list_var) {
                            if (!qua.equal(v_term)) {
                                html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                                cb_inferred_index_ontology_horizon_radio_button(qua, ontology_horizon);
                                html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                                cb_show_ontology_horizon_term(qua);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            qua = cdolist_list_var.first();
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$33, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 32468L)
    public static SubLObject cb_inferred_index_ontology_horizon_radio_button(final SubLObject qua, final SubLObject ontology_horizon) {
        final SubLObject checkedP = (SubLObject)SubLObjectFactory.makeBoolean((cb_inferred_index.NIL == ontology_horizon && qua == cb_inferred_index.$kw197$ALL) || qua.eql(ontology_horizon));
        final SubLObject value = (cb_inferred_index.NIL != forts.fort_p(qua)) ? cb_utilities.cb_fort_identifier(qua) : print_high.prin1_to_string(qua);
        return html_utilities.html_radio_input((SubLObject)cb_inferred_index.$str198$ontology_horizon, value, checkedP, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 32821L)
    public static SubLObject cb_handle_inferred_index_ontology_filters(final SubLObject args) {
        final SubLObject term_string = html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str74$term, args);
        final SubLObject v_term = cb_utilities.cb_guess_term(term_string, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject ontology_horizon = cb_extract_inferred_index_ontology_horizon(args);
        cb_update_inferred_index_ontology_filters(ontology_horizon);
        return cb_inferred_index_ontology_filters_guts(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 33223L)
    public static SubLObject cb_show_ontology_horizon_term(final SubLObject qua) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (qua.eql((SubLObject)cb_inferred_index.$kw9$SELF)) {
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str200$Just_on_the_term);
        }
        else if (qua.eql((SubLObject)cb_inferred_index.$kw201$LOWER)) {
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str202$Also_from_the_lower_ontology);
        }
        else if (qua.eql((SubLObject)cb_inferred_index.$kw203$MIDDLE)) {
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str204$Also_up_through_the_middle_ontolo);
        }
        else if (qua.eql((SubLObject)cb_inferred_index.$kw197$ALL)) {
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str205$Everything);
        }
        else {
            final SubLObject size_val;
            final SubLObject size = size_val = cb_utilities.cb_term_font_size(qua, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_inferred_index.NIL != size_val) {
                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(size_val);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                cb_utilities.cb_show_term(qua, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 33620L)
    public static SubLObject cb_extract_inferred_index_ontology_horizon(final SubLObject args) {
        final SubLObject identifier_string = html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str198$ontology_horizon, args);
        final SubLObject fort = cb_utilities.cb_guess_fort(identifier_string, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != forts.fort_p(fort)) {
            return fort;
        }
        return reader.read_from_string_ignoring_errors(identifier_string, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 33907L)
    public static SubLObject cb_update_inferred_index_ontology_filters(SubLObject ontology_horizon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (ontology_horizon == cb_inferred_index.$kw197$ALL) {
            ontology_horizon = (SubLObject)cb_inferred_index.NIL;
        }
        cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(conses_high.putf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw192$ONTOLOGY_HORIZON, ontology_horizon), thread);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 34172L)
    public static SubLObject cb_inferred_index_microtheory_filters(final SubLObject args) {
        SubLObject id_string = (SubLObject)cb_inferred_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inferred_index.$list145);
        id_string = args.first();
        final SubLObject current = args.rest();
        if (cb_inferred_index.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inferred_index.$list145);
            return (SubLObject)cb_inferred_index.NIL;
        }
        final SubLObject v_term = cb_utilities.cb_guess_term(id_string, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL == kb_indexing_datastructures.indexed_term_p(v_term)) {
            return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str146$_S_did_not_specify_a_term, id_string, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str206$Time_to_implement_cb_inferred_ind, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 34771L)
    public static SubLObject cb_link_inferred_index_microtheory_filters(SubLObject v_term, SubLObject linktext) {
        if (v_term == cb_inferred_index.UNPROVIDED) {
            v_term = (SubLObject)cb_inferred_index.NIL;
        }
        if (linktext == cb_inferred_index.UNPROVIDED) {
            linktext = (SubLObject)cb_inferred_index.NIL;
        }
        if (cb_inferred_index.NIL == linktext) {
            linktext = (SubLObject)cb_inferred_index.$str208$_Microtheory_Filters_;
        }
        final SubLObject id = cb_utilities.cb_term_identifier(v_term);
        html_utilities.html_princ(linktext);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 35150L)
    public static SubLObject cb_set_microtheory_browsing_filter(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_inferred_index.$cb_inferred_index_filters$.setDynamicValue(conses_high.putf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw210$MICROTHEORY, mt), thread);
        cb_viewpoint.cb_set_microtheory_browsing_filter_viewpoint(mt);
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 35410L)
    public static SubLObject cb_link_inferred_gaf_arg_assertions(final SubLObject v_term, final SubLObject display_term, SubLObject qua, SubLObject argnum, SubLObject pred) {
        if (qua == cb_inferred_index.UNPROVIDED) {
            qua = (SubLObject)cb_inferred_index.NIL;
        }
        if (argnum == cb_inferred_index.UNPROVIDED) {
            argnum = (SubLObject)cb_inferred_index.NIL;
        }
        if (pred == cb_inferred_index.UNPROVIDED) {
            pred = (SubLObject)cb_inferred_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject display_string = display_term.isString() ? display_term : cb_utilities.cb_term_display_string(display_term);
        final SubLObject size = cb_utilities.cb_term_font_size(display_term, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.$kw122$CONTENT);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        if (cb_inferred_index.NIL != qua && cb_inferred_index.NIL != argnum && cb_inferred_index.NIL != pred) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str211$cb_inferred_gaf_arg_assertions__A, new SubLObject[] { cb_utilities.cb_index_identifier(v_term), cb_utilities.cb_index_identifier(qua), argnum, cb_utilities.cb_index_identifier(pred) });
        }
        else if (cb_inferred_index.NIL == qua && cb_inferred_index.NIL != argnum && cb_inferred_index.NIL != pred) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str211$cb_inferred_gaf_arg_assertions__A, new SubLObject[] { cb_utilities.cb_index_identifier(v_term), cb_inferred_index.NIL, argnum, cb_utilities.cb_index_identifier(pred) });
        }
        else if (cb_inferred_index.NIL != qua && cb_inferred_index.NIL == argnum && cb_inferred_index.NIL == pred) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str212$cb_inferred_gaf_arg_assertions__A, cb_utilities.cb_index_identifier(v_term), cb_utilities.cb_index_identifier(qua));
        }
        else if (cb_inferred_index.NIL == qua && cb_inferred_index.NIL == argnum && cb_inferred_index.NIL == pred) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str213$cb_inferred_gaf_arg_assertions__A, cb_utilities.cb_index_identifier(v_term));
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            final SubLObject size_val = size;
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_inferred_index.NIL != size_val) {
                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(size_val);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                html_utilities.html_princ(display_string);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return display_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 38401L)
    public static SubLObject cb_inferred_gaf_arg_assertions(final SubLObject args) {
        SubLObject term_spec = (SubLObject)cb_inferred_index.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_inferred_index.$list215);
        term_spec = args.first();
        SubLObject current = args.rest();
        final SubLObject qua_spec = (SubLObject)(current.isCons() ? current.first() : cb_inferred_index.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)cb_inferred_index.$list215);
        current = current.rest();
        final SubLObject argnum_spec = (SubLObject)(current.isCons() ? current.first() : cb_inferred_index.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)cb_inferred_index.$list215);
        current = current.rest();
        final SubLObject pred_spec = (SubLObject)(current.isCons() ? current.first() : cb_inferred_index.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)cb_inferred_index.$list215);
        current = current.rest();
        if (cb_inferred_index.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_inferred_index.$list215);
            return (SubLObject)cb_inferred_index.NIL;
        }
        SubLObject v_term = (SubLObject)cb_inferred_index.NIL;
        SubLObject qua = (SubLObject)cb_inferred_index.NIL;
        SubLObject argnum = (SubLObject)cb_inferred_index.NIL;
        SubLObject predicate = (SubLObject)cb_inferred_index.NIL;
        v_term = cb_utilities.cb_guess_index(term_spec);
        if (cb_inferred_index.NIL == kb_indexing_datastructures.indexed_term_p(v_term)) {
            return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str216$Could_not_determine_a_term_from__, term_spec, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        if (cb_inferred_index.NIL != qua_spec && !cb_inferred_index.$str217$NIL.equal(qua_spec)) {
            qua = cb_utilities.cb_guess_index(qua_spec);
            if (cb_inferred_index.NIL == kb_indexing_datastructures.indexed_term_p(qua)) {
                return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str216$Could_not_determine_a_term_from__, qua_spec, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
        }
        if (cb_inferred_index.NIL != argnum_spec) {
            argnum = reader.read_from_string_ignoring_errors(argnum_spec, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (!argnum.isInteger()) {
                return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str218$Could_not_determine_an_argnum_fro, argnum_spec, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
        }
        if (cb_inferred_index.NIL != pred_spec) {
            predicate = cb_utilities.cb_guess_fort(pred_spec, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL == forts.fort_p(predicate)) {
                return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str216$Could_not_determine_a_term_from__, pred_spec, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
        }
        return cb_inferred_gaf_arg_assertions_guts(v_term, qua, argnum, predicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 39444L)
    public static SubLObject cb_inferred_gaf_arg_assertions_guts(final SubLObject v_term, final SubLObject qua, final SubLObject argnum, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject filters = cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread);
        final SubLObject mt = inferred_indexing.inferred_index_filters_extract_microtheory(filters);
        final SubLObject order_by = cb_inferred_index.$cb_inferred_index_order_by$.getDynamicValue(thread);
        final SubLObject raw_tuples = inferred_indexing.all_inferred_gaf_arg_index_tuples(v_term, filters, order_by);
        final SubLObject filtered_tuples = filter_gaf_arg_index_tuples(raw_tuples, qua, argnum, predicate);
        final SubLObject tuple_groups = inferred_indexing.categorize_inferred_gaf_arg_index_tuples(v_term, filtered_tuples, order_by);
        final SubLObject title_var;
        final SubLObject title = title_var = PrintLow.format((SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$str220$Inferred_GAF_arg_index_for__S, v_term);
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_inferred_index.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_inferred_index.$str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_inferred_index.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inferred_index.$str20$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$39 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_inferred_index.$kw21$UNINITIALIZED) ? ConsesLow.list(cb_inferred_index.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_inferred_index.$kw22$CB_CYC);
                if (cb_inferred_index.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.html_basic_cb_scripts();
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_inferred_index.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_inferred_index.$str221$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_inferred_index.$str222$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_inferred_index.$str223$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_inferred_index.$str224$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_inferred_index.$str225$Refresh);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_inferred_index.$str226$reloadCurrentFrame__reloadFrameBu);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            if (cb_inferred_index.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        cb_browser.cb_possibly_show_followup_widget(v_term);
                        cb_term_type_header_with_gaf_entry(v_term, (SubLObject)cb_inferred_index.UNPROVIDED);
                        cb_possibly_show_term_as_seen_from_mt_header(mt, (SubLObject)cb_inferred_index.$kw84$AFTER);
                        final SubLObject pcase_var = order_by;
                        if (pcase_var.eql((SubLObject)cb_inferred_index.$kw0$ONTOLOGY)) {
                            cb_show_inferred_gaf_arg_assertions_by_ontology(v_term, tuple_groups);
                        }
                        else if (pcase_var.eql((SubLObject)cb_inferred_index.$kw92$PREDICATE)) {
                            cb_show_inferred_gaf_arg_assertions_by_predicate(v_term, tuple_groups);
                        }
                        else {
                            cb_utilities.cb_error((SubLObject)cb_inferred_index.$str104$Unexpected_order_by____S, order_by, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$40, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$39, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 40491L)
    public static SubLObject cb_show_inferred_gaf_arg_assertions_by_ontology(final SubLObject v_term, final SubLObject tuple_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_browser.$cb_c_gaf_arg_show_arg_headerP$.currentBinding(thread);
        try {
            cb_browser.$cb_c_gaf_arg_show_arg_headerP$.bind((SubLObject)cb_inferred_index.NIL, thread);
            SubLObject list_var = (SubLObject)cb_inferred_index.NIL;
            SubLObject tuples = (SubLObject)cb_inferred_index.NIL;
            SubLObject index = (SubLObject)cb_inferred_index.NIL;
            list_var = tuple_groups;
            tuples = list_var.first();
            for (index = (SubLObject)cb_inferred_index.ZERO_INTEGER; cb_inferred_index.NIL != list_var; list_var = list_var.rest(), tuples = list_var.first(), index = Numbers.add((SubLObject)cb_inferred_index.ONE_INTEGER, index)) {
                if (!index.isZero()) {
                    html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                }
                final SubLObject first_tuple = tuples.first();
                final SubLObject infer_pred = first_tuple.first();
                final SubLObject group_qua = conses_high.second(first_tuple);
                cb_show_qua_justification(infer_pred, v_term, group_qua);
                html_utilities.html_newline((SubLObject)cb_inferred_index.TWO_INTEGER);
                SubLObject cdolist_list_var = tuples;
                SubLObject tuple = (SubLObject)cb_inferred_index.NIL;
                tuple = cdolist_list_var.first();
                while (cb_inferred_index.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject infer_pred_$43 = (SubLObject)cb_inferred_index.NIL;
                    SubLObject qua = (SubLObject)cb_inferred_index.NIL;
                    SubLObject argnum = (SubLObject)cb_inferred_index.NIL;
                    SubLObject pred = (SubLObject)cb_inferred_index.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    infer_pred_$43 = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    qua = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    argnum = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    pred = current.first();
                    current = current.rest();
                    if (cb_inferred_index.NIL == current) {
                        cb_show_inferred_gaf_arg_index_assertions_final(v_term, infer_pred_$43, qua, argnum, pred);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_inferred_index.$list111);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    tuple = cdolist_list_var.first();
                }
            }
        }
        finally {
            cb_browser.$cb_c_gaf_arg_show_arg_headerP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 41120L)
    public static SubLObject cb_show_inferred_gaf_arg_assertions_by_predicate(final SubLObject v_term, final SubLObject tuple_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_browser.$cb_c_gaf_arg_show_arg_headerP$.currentBinding(thread);
        try {
            cb_browser.$cb_c_gaf_arg_show_arg_headerP$.bind((SubLObject)cb_inferred_index.NIL, thread);
            final SubLObject ontology_horizon = conses_high.getf(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$kw192$ONTOLOGY_HORIZON, (SubLObject)cb_inferred_index.UNPROVIDED);
            SubLObject list_var = (SubLObject)cb_inferred_index.NIL;
            SubLObject tuples = (SubLObject)cb_inferred_index.NIL;
            SubLObject index = (SubLObject)cb_inferred_index.NIL;
            list_var = tuple_groups;
            tuples = list_var.first();
            for (index = (SubLObject)cb_inferred_index.ZERO_INTEGER; cb_inferred_index.NIL != list_var; list_var = list_var.rest(), tuples = list_var.first(), index = Numbers.add((SubLObject)cb_inferred_index.ONE_INTEGER, index)) {
                SubLObject last_qua = (SubLObject)cb_inferred_index.NIL;
                SubLObject list_var_$44 = (SubLObject)cb_inferred_index.NIL;
                SubLObject tuple = (SubLObject)cb_inferred_index.NIL;
                SubLObject tuple_index = (SubLObject)cb_inferred_index.NIL;
                list_var_$44 = tuples;
                tuple = list_var_$44.first();
                for (tuple_index = (SubLObject)cb_inferred_index.ZERO_INTEGER; cb_inferred_index.NIL != list_var_$44; list_var_$44 = list_var_$44.rest(), tuple = list_var_$44.first(), tuple_index = Numbers.add((SubLObject)cb_inferred_index.ONE_INTEGER, tuple_index)) {
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject infer_pred = (SubLObject)cb_inferred_index.NIL;
                    SubLObject qua = (SubLObject)cb_inferred_index.NIL;
                    SubLObject argnum = (SubLObject)cb_inferred_index.NIL;
                    SubLObject pred = (SubLObject)cb_inferred_index.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    infer_pred = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    qua = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    argnum = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
                    pred = current.first();
                    current = current.rest();
                    if (cb_inferred_index.NIL == current) {
                        if (!qua.equal(last_qua)) {
                            if (!index.isZero() || !tuple_index.isZero()) {
                                html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                            }
                            if (cb_inferred_index.$kw9$SELF != ontology_horizon) {
                                cb_show_qua_justification(infer_pred, v_term, qua);
                                html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
                            }
                        }
                        cb_show_inferred_gaf_arg_index_assertions_final(v_term, infer_pred, qua, argnum, pred);
                        last_qua = qua;
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_inferred_index.$list111);
                    }
                }
            }
        }
        finally {
            cb_browser.$cb_c_gaf_arg_show_arg_headerP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 41885L)
    public static SubLObject cb_show_inferred_gaf_arg_index_assertions_final(final SubLObject v_term, final SubLObject infer_pred, final SubLObject qua, final SubLObject argnum, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (infer_pred.eql((SubLObject)cb_inferred_index.$kw227$QUERY_ISA)) {
            cb_utilities.cb_show_term(pred, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (!argnum.numE((SubLObject)cb_inferred_index.ONE_INTEGER)) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_inferred_index.$str112$_arg_S, argnum);
            }
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str228$_query);
            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw113$LITERAL_QUERY, v_term, argnum, pred, cb_inferred_index.$const82$EverythingPSC, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
        }
        else {
            final SubLObject filters = cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread);
            final SubLObject browsing_mt = inferred_indexing.inferred_index_filters_extract_microtheory(filters);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(browsing_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                cb_browser.cb_c_gaf_arg_internal(qua, argnum, pred, (SubLObject)cb_inferred_index.NIL);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 42655L)
    public static SubLObject hl_support_module_for_predicate(final SubLObject predicate) {
        return list_utilities.alist_lookup_without_values(cb_inferred_index.$predicate_support_module_map$.getGlobalValue(), predicate, Symbols.symbol_function((SubLObject)cb_inferred_index.EQUAL), (SubLObject)cb_inferred_index.$kw230$QUERY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 42810L)
    public static SubLObject cb_show_qua_justification(SubLObject infer_pred, final SubLObject v_term, final SubLObject qua) {
        final SubLObject leader = (SubLObject)((cb_inferred_index.NIL != kb_utilities.kbeq(infer_pred, cb_inferred_index.$const231$equals)) ? cb_inferred_index.$str232$on_ : cb_inferred_index.$str106$via_);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ(leader);
        html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
        if (cb_inferred_index.NIL != kb_utilities.kbeq(infer_pred, cb_inferred_index.$const231$equals)) {
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str233$the_term);
        }
        else {
            cb_utilities.cb_show_term(qua, (SubLObject)cb_inferred_index.ZERO_INTEGER, (SubLObject)cb_inferred_index.NIL);
        }
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (cb_inferred_index.NIL == kb_utilities.kbeq(infer_pred, cb_inferred_index.$const231$equals)) {
            if (infer_pred == cb_inferred_index.$kw227$QUERY_ISA) {
                infer_pred = cb_inferred_index.$const234$isa;
            }
            final SubLObject sentence = el_utilities.make_binary_formula(infer_pred, v_term, qua);
            final SubLObject module = hl_support_module_for_predicate(infer_pred);
            final SubLObject support = arguments.make_hl_support(module, sentence, cb_inferred_index.$const82$EverythingPSC, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_superscript_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            cb_utilities.cb_link((SubLObject)cb_inferred_index.$kw235$HL_SUPPORT, support, (SubLObject)cb_inferred_index.$kw236$NONE, (SubLObject)cb_inferred_index.$str237$___, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_superscript_tail$.getGlobalValue());
            return support;
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 43535L)
    public static SubLObject filter_gaf_arg_index_tuples(final SubLObject tuples, SubLObject match_qua, SubLObject match_argnum, SubLObject match_pred) {
        if (match_qua == cb_inferred_index.UNPROVIDED) {
            match_qua = (SubLObject)cb_inferred_index.NIL;
        }
        if (match_argnum == cb_inferred_index.UNPROVIDED) {
            match_argnum = (SubLObject)cb_inferred_index.NIL;
        }
        if (match_pred == cb_inferred_index.UNPROVIDED) {
            match_pred = (SubLObject)cb_inferred_index.NIL;
        }
        if (cb_inferred_index.NIL == match_qua && cb_inferred_index.NIL == match_argnum && cb_inferred_index.NIL == match_pred) {
            return tuples;
        }
        SubLObject result_tuples = (SubLObject)cb_inferred_index.NIL;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = (SubLObject)cb_inferred_index.NIL;
        tuple = cdolist_list_var.first();
        while (cb_inferred_index.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject infer_pred = (SubLObject)cb_inferred_index.NIL;
            SubLObject qua = (SubLObject)cb_inferred_index.NIL;
            SubLObject argnum = (SubLObject)cb_inferred_index.NIL;
            SubLObject pred = (SubLObject)cb_inferred_index.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
            infer_pred = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
            qua = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
            argnum = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_inferred_index.$list111);
            pred = current.first();
            current = current.rest();
            if (cb_inferred_index.NIL == current) {
                if ((cb_inferred_index.NIL == match_qua || qua.equal(match_qua)) && (cb_inferred_index.NIL == match_argnum || argnum.equal(match_argnum)) && (cb_inferred_index.NIL == match_pred || pred.equal(match_pred))) {
                    result_tuples = (SubLObject)ConsesLow.cons(tuple, result_tuples);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_inferred_index.$list111);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return Sequences.nreverse(result_tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 44093L)
    public static SubLObject cb_inferred_index_definitional_information(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_inferred_index.$cb_inferred_index_filters$.currentBinding(thread);
        try {
            cb_inferred_index.$cb_inferred_index_filters$.bind(inferred_index_definitional_information_override(cb_inferred_index.$cb_inferred_index_filters$.getDynamicValue(thread), fort), thread);
            cb_inferred_gaf_arg_assertions_guts(fort, fort, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.NIL);
        }
        finally {
            cb_inferred_index.$cb_inferred_index_filters$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 44546L)
    public static SubLObject inferred_index_definitional_information_override(SubLObject filters, final SubLObject fort) {
        filters = conses_high.copy_list(filters);
        final SubLObject predicates = cb_utilities.cb_definitional_preds_for_fort(fort);
        filters = conses_high.putf(filters, (SubLObject)cb_inferred_index.$kw160$ALLOW_PREDICATES, predicates);
        filters = conses_high.putf(filters, (SubLObject)cb_inferred_index.$kw161$ALLOW_PREDICATE_TYPES, (SubLObject)cb_inferred_index.NIL);
        filters = conses_high.putf(filters, (SubLObject)cb_inferred_index.$kw162$FORBID_PREDICATES, (SubLObject)cb_inferred_index.NIL);
        filters = conses_high.putf(filters, (SubLObject)cb_inferred_index.$kw163$FORBID_PREDICATE_TYPES, (SubLObject)cb_inferred_index.$list238);
        return filters;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 45308L)
    public static SubLObject cb_term_type_header_with_gaf_entry(final SubLObject v_term, SubLObject gaf_entry_properties) {
        if (gaf_entry_properties == cb_inferred_index.UNPROVIDED) {
            gaf_entry_properties = (SubLObject)cb_inferred_index.NIL;
        }
        cb_term_type_header(v_term, (SubLObject)cb_inferred_index.FIVE_INTEGER);
        if (cb_inferred_index.NIL != forts.fort_p(v_term)) {
            html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_superscript_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            cb_gaf_entry_widget_links((SubLObject)cb_inferred_index.$str243$gaf_entry, (SubLObject)cb_inferred_index.$str244$___, (SubLObject)cb_inferred_index.$str245$___);
            html_utilities.html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_superscript_tail$.getGlobalValue());
            if (cb_inferred_index.NIL != cure_api.$cb_show_cure_link$.getGlobalValue()) {
                html_utilities.html_indent((SubLObject)cb_inferred_index.UNPROVIDED);
                cure_api.cb_possibly_add_cure_link(v_term, Sequences.cconcatenate((SubLObject)cb_inferred_index.$str246$Open_the_CURE_on_, new SubLObject[] { format_nil.format_nil_a_no_copy(cycl_utilities.denotational_term_name(v_term)), cb_inferred_index.$str247$_to_add_more_facts_ }), (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_newline((SubLObject)cb_inferred_index.TWO_INTEGER);
            cb_gaf_entry_widget(v_term, gaf_entry_properties);
        }
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 45980L)
    public static SubLObject cb_term_type_header(final SubLObject v_term, SubLObject baseline_size) {
        if (baseline_size == cb_inferred_index.UNPROVIDED) {
            baseline_size = (SubLObject)cb_inferred_index.FIVE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_inferred_index.NIL != cb_tools.cb_bookmarks_supported_for_current_user()) {
            cb_browser.cb_add_bookmark_term_link(v_term);
        }
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        final SubLObject size_val = baseline_size;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_inferred_index.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            cb_browser.cb_c_type(v_term);
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str248$___);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (cb_inferred_index.NIL != nart_handles.nart_p(v_term)) {
            html_utilities.html_newline((SubLObject)cb_inferred_index.UNPROVIDED);
        }
        final SubLObject size = cb_utilities.cb_term_font_size(v_term, baseline_size, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        final SubLObject size_val2 = size;
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (cb_inferred_index.NIL != size_val2) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(size_val2);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            cb_utilities.cb_show_term(v_term, (SubLObject)cb_inferred_index.ZERO_INTEGER, (SubLObject)cb_inferred_index.T);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        if (cb_inferred_index.NIL != cb_parameters.$cb_ke_text_mode$.getDynamicValue(thread)) {
            html_utilities.html_princ((SubLObject)cb_inferred_index.$str249$__);
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 46512L)
    public static SubLObject cb_gaf_entry_widget_links(SubLObject name, SubLObject show_text, SubLObject hide_text) {
        if (name == cb_inferred_index.UNPROVIDED) {
            name = (SubLObject)cb_inferred_index.$str243$gaf_entry;
        }
        if (show_text == cb_inferred_index.UNPROVIDED) {
            show_text = (SubLObject)cb_inferred_index.$str244$___;
        }
        if (hide_text == cb_inferred_index.UNPROVIDED) {
            hide_text = (SubLObject)cb_inferred_index.$str245$___;
        }
        dhtml_macros.dhtml_switch_visibility_links(name, show_text, hide_text);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 46694L)
    public static SubLObject cb_gaf_entry_widget(final SubLObject fort, SubLObject v_properties) {
        if (v_properties == cb_inferred_index.UNPROVIDED) {
            v_properties = (SubLObject)cb_inferred_index.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        SubLObject allow_other_keys_p = (SubLObject)cb_inferred_index.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)cb_inferred_index.NIL;
        SubLObject current_$45 = (SubLObject)cb_inferred_index.NIL;
        while (cb_inferred_index.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_inferred_index.$list250);
            current_$45 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)cb_inferred_index.$list250);
            if (cb_inferred_index.NIL == conses_high.member(current_$45, (SubLObject)cb_inferred_index.$list251, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED)) {
                bad = (SubLObject)cb_inferred_index.T;
            }
            if (current_$45 == cb_inferred_index.$kw252$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (cb_inferred_index.NIL != bad && cb_inferred_index.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_inferred_index.$list250);
        }
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)cb_inferred_index.$kw253$NAME, current);
        final SubLObject name = (SubLObject)((cb_inferred_index.NIL != name_tail) ? conses_high.cadr(name_tail) : cb_inferred_index.$str243$gaf_entry);
        final SubLObject pred_tail = cdestructuring_bind.property_list_member((SubLObject)cb_inferred_index.$kw254$PRED, current);
        final SubLObject pred = (SubLObject)((cb_inferred_index.NIL != pred_tail) ? conses_high.cadr(pred_tail) : cb_inferred_index.NIL);
        final SubLObject argnum_tail = cdestructuring_bind.property_list_member((SubLObject)cb_inferred_index.$kw255$ARGNUM, current);
        final SubLObject argnum = (SubLObject)((cb_inferred_index.NIL != argnum_tail) ? conses_high.cadr(argnum_tail) : cb_inferred_index.NIL);
        final SubLObject text_width = (SubLObject)cb_inferred_index.$int256$200;
        dhtml_macros.dhtml_set_switched_visibility(name, (SubLObject)cb_inferred_index.$kw3$INVISIBLE, (SubLObject)cb_inferred_index.$kw257$PARAGRAPH);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (cb_inferred_index.NIL != name) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(name);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_inferred_index.$str258$unary_frame, (SubLObject)cb_inferred_index.$kw3$INVISIBLE, (SubLObject)cb_inferred_index.$kw257$PARAGRAPH);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_inferred_index.$str258$unary_frame);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.NIL);
                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inferred_index.$str152$post);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                if (cb_inferred_index.NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_macros.$within_html_form$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str259$cb_handle_gaf_entry, (SubLObject)cb_inferred_index.T, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str260$implicit_arg1, cb_utilities.cb_fort_identifier(fort), (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                    final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link((SubLObject)cb_inferred_index.$str261$unary_frame_pred, (SubLObject)cb_inferred_index.$str262$unary_predicate, cb_inferred_index.$const263$UnaryPredicate, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw89$RIGHT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_complete.javascript_void_url());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.dhtml_change_visible_section_onclick((SubLObject)cb_inferred_index.$str264$binary_frame, (SubLObject)cb_inferred_index.$str258$unary_frame));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                html_utilities.html_princ((SubLObject)cb_inferred_index.$str265$_arg2);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_inferred_index.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw89$RIGHT));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw266$BOTTOM));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_submit_input((SubLObject)cb_inferred_index.$str267$Assert, (SubLObject)cb_inferred_index.$str258$unary_frame, (SubLObject)cb_inferred_index.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { cb_inferred_index.$kw268$INPUT_NAME, cb_inferred_index.$str261$unary_frame_pred, cb_inferred_index.$kw269$COMPLETE_TYPE, cb_inferred_index.$const263$UnaryPredicate, cb_inferred_index.$kw270$CLEAR_LABEL, cb_inferred_index.NIL, cb_inferred_index.$kw271$COMPLETE_LABEL, cb_inferred_index.NIL, cb_inferred_index.$kw272$WIDTH, text_width }));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                }
                finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_inferred_index.$str264$binary_frame, (SubLObject)cb_inferred_index.$kw109$VISIBLE, (SubLObject)cb_inferred_index.$kw257$PARAGRAPH);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_inferred_index.$str264$binary_frame);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.NIL);
                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inferred_index.$str152$post);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                if (cb_inferred_index.NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_macros.$within_html_form$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str259$cb_handle_gaf_entry, (SubLObject)cb_inferred_index.T, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str260$implicit_arg1, cb_utilities.cb_fort_identifier(fort), (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                    final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link((SubLObject)cb_inferred_index.$str273$binary_frame_pred, (SubLObject)cb_inferred_index.$str274$binary_predicate, cb_inferred_index.$const275$BinaryPredicate, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw89$RIGHT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_complete.javascript_void_url());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.dhtml_change_visible_section_onclick((SubLObject)cb_inferred_index.$str276$binary, (SubLObject)cb_inferred_index.$str264$binary_frame));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                html_utilities.html_princ((SubLObject)cb_inferred_index.$str277$_arg1);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_complete.html_complete_link((SubLObject)cb_inferred_index.$str278$binary_frame_arg2, (SubLObject)cb_inferred_index.$str279$arg2, cb_inferred_index.$const280$Thing, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_complete.javascript_void_url());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.dhtml_change_visible_section_onclick((SubLObject)cb_inferred_index.$str258$unary_frame, (SubLObject)cb_inferred_index.$str264$binary_frame));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_inferred_index.$kw239$CLOSE_RED);
                                                final SubLObject align = (SubLObject)cb_inferred_index.$kw88$TOP;
                                                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_inferred_index.$kw239$CLOSE_RED);
                                                final SubLObject border = (SubLObject)cb_inferred_index.ZERO_INTEGER;
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                html_utilities.html_markup(image_src);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                if (cb_inferred_index.NIL != alt) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                    html_utilities.html_markup(alt);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                }
                                                if (cb_inferred_index.NIL != align) {
                                                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align(align));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                }
                                                if (cb_inferred_index.NIL != border) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                    html_utilities.html_markup(border);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                }
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw89$RIGHT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_complete.javascript_void_url());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.dhtml_change_visible_section_onclick((SubLObject)cb_inferred_index.$str281$ternary, (SubLObject)cb_inferred_index.$str264$binary_frame));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                html_utilities.html_princ((SubLObject)cb_inferred_index.$str282$_arg3);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_inferred_index.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw89$RIGHT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw266$BOTTOM));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_submit_input((SubLObject)cb_inferred_index.$str267$Assert, (SubLObject)cb_inferred_index.$str264$binary_frame, (SubLObject)cb_inferred_index.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { cb_inferred_index.$kw268$INPUT_NAME, cb_inferred_index.$str273$binary_frame_pred, cb_inferred_index.$kw269$COMPLETE_TYPE, cb_inferred_index.$const275$BinaryPredicate, cb_inferred_index.$kw270$CLEAR_LABEL, cb_inferred_index.NIL, cb_inferred_index.$kw271$COMPLETE_LABEL, cb_inferred_index.NIL, cb_inferred_index.$kw272$WIDTH, text_width }));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list((SubLObject)cb_inferred_index.$kw268$INPUT_NAME, (SubLObject)cb_inferred_index.$str278$binary_frame_arg2, (SubLObject)cb_inferred_index.$kw270$CLEAR_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw271$COMPLETE_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw272$WIDTH, text_width));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                }
                finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_inferred_index.$str276$binary, (SubLObject)cb_inferred_index.$kw3$INVISIBLE, (SubLObject)cb_inferred_index.$kw257$PARAGRAPH);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_inferred_index.$str276$binary);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.NIL);
                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inferred_index.$str152$post);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                if (cb_inferred_index.NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_macros.$within_html_form$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str259$cb_handle_gaf_entry, (SubLObject)cb_inferred_index.T, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                    final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link((SubLObject)cb_inferred_index.$str283$binary_pred, (SubLObject)cb_inferred_index.$str274$binary_predicate, cb_inferred_index.$const275$BinaryPredicate, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_complete.html_complete_link((SubLObject)cb_inferred_index.$str284$binary_arg1, (SubLObject)cb_inferred_index.$str285$arg1, cb_inferred_index.$const280$Thing, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_complete.javascript_void_url());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.dhtml_change_visible_section_onclick((SubLObject)cb_inferred_index.$str264$binary_frame, (SubLObject)cb_inferred_index.$str276$binary));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_inferred_index.$kw239$CLOSE_RED);
                                                final SubLObject align = (SubLObject)cb_inferred_index.$kw88$TOP;
                                                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_inferred_index.$kw239$CLOSE_RED);
                                                final SubLObject border = (SubLObject)cb_inferred_index.ZERO_INTEGER;
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                html_utilities.html_markup(image_src);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                if (cb_inferred_index.NIL != alt) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                    html_utilities.html_markup(alt);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                }
                                                if (cb_inferred_index.NIL != align) {
                                                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align(align));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                }
                                                if (cb_inferred_index.NIL != border) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                    html_utilities.html_markup(border);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                }
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link((SubLObject)cb_inferred_index.$str286$binary_arg2, (SubLObject)cb_inferred_index.$str279$arg2, cb_inferred_index.$const280$Thing, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw89$RIGHT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_complete.javascript_void_url());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.dhtml_change_visible_section_onclick((SubLObject)cb_inferred_index.$str281$ternary, (SubLObject)cb_inferred_index.$str276$binary));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                html_utilities.html_princ((SubLObject)cb_inferred_index.$str282$_arg3);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_inferred_index.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw266$BOTTOM));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_submit_input((SubLObject)cb_inferred_index.$str267$Assert, (SubLObject)cb_inferred_index.$str276$binary, (SubLObject)cb_inferred_index.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { cb_inferred_index.$kw268$INPUT_NAME, cb_inferred_index.$str283$binary_pred, cb_inferred_index.$kw269$COMPLETE_TYPE, cb_inferred_index.$const275$BinaryPredicate, cb_inferred_index.$kw270$CLEAR_LABEL, cb_inferred_index.NIL, cb_inferred_index.$kw271$COMPLETE_LABEL, cb_inferred_index.NIL, cb_inferred_index.$kw272$WIDTH, text_width }));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list((SubLObject)cb_inferred_index.$kw268$INPUT_NAME, (SubLObject)cb_inferred_index.$str284$binary_arg1, (SubLObject)cb_inferred_index.$kw270$CLEAR_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw271$COMPLETE_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw272$WIDTH, text_width));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list((SubLObject)cb_inferred_index.$kw268$INPUT_NAME, (SubLObject)cb_inferred_index.$str286$binary_arg2, (SubLObject)cb_inferred_index.$kw270$CLEAR_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw271$COMPLETE_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw272$WIDTH, text_width));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                }
                finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_inferred_index.$str281$ternary, (SubLObject)cb_inferred_index.$kw3$INVISIBLE, (SubLObject)cb_inferred_index.$kw257$PARAGRAPH);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_inferred_index.$str281$ternary);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_inferred_index.NIL);
                html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_inferred_index.$str152$post);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                if (cb_inferred_index.NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_macros.$within_html_form$.bind((SubLObject)cb_inferred_index.T, thread);
                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                    html_utilities.html_hidden_input((SubLObject)cb_inferred_index.$str259$cb_handle_gaf_entry, (SubLObject)cb_inferred_index.T, (SubLObject)cb_inferred_index.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                    final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_complete.html_complete_link((SubLObject)cb_inferred_index.$str287$ternary_pred, (SubLObject)cb_inferred_index.$str288$ternary_predicate, cb_inferred_index.$const289$TernaryPredicate, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_complete.html_complete_link((SubLObject)cb_inferred_index.$str290$ternary_arg1, (SubLObject)cb_inferred_index.$str285$arg1, cb_inferred_index.$const280$Thing, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                html_complete.html_complete_link((SubLObject)cb_inferred_index.$str291$ternary_arg2, (SubLObject)cb_inferred_index.$str279$arg2, cb_inferred_index.$const280$Thing, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw203$MIDDLE));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_complete.html_complete_link((SubLObject)cb_inferred_index.$str292$ternary_arg3, (SubLObject)cb_inferred_index.$str293$arg3, cb_inferred_index.$const280$Thing, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup((SubLObject)cb_inferred_index.$str86$100_);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_complete.javascript_void_url());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_markup(dhtml_macros.dhtml_change_visible_section_onclick((SubLObject)cb_inferred_index.$str276$binary, (SubLObject)cb_inferred_index.$str281$ternary));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_inferred_index.$kw239$CLOSE_RED);
                                                final SubLObject align = (SubLObject)cb_inferred_index.$kw88$TOP;
                                                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_inferred_index.$kw239$CLOSE_RED);
                                                final SubLObject border = (SubLObject)cb_inferred_index.ZERO_INTEGER;
                                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                html_utilities.html_markup(image_src);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                if (cb_inferred_index.NIL != alt) {
                                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                    html_utilities.html_markup(alt);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                }
                                                if (cb_inferred_index.NIL != align) {
                                                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align(align));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                }
                                                if (cb_inferred_index.NIL != border) {
                                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                    html_utilities.html_markup(border);
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                }
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw89$RIGHT));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                            html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
                                            html_utilities.html_princ((SubLObject)cb_inferred_index.$str294$_arg4);
                                            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_rowspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_inferred_index.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw266$BOTTOM));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                html_utilities.html_submit_input((SubLObject)cb_inferred_index.$str267$Assert, (SubLObject)cb_inferred_index.$str281$ternary, (SubLObject)cb_inferred_index.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw88$TOP));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                        final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list(new SubLObject[] { cb_inferred_index.$kw268$INPUT_NAME, cb_inferred_index.$str287$ternary_pred, cb_inferred_index.$kw269$COMPLETE_TYPE, cb_inferred_index.$const289$TernaryPredicate, cb_inferred_index.$kw270$CLEAR_LABEL, cb_inferred_index.NIL, cb_inferred_index.$kw271$COMPLETE_LABEL, cb_inferred_index.NIL, cb_inferred_index.$kw272$WIDTH, text_width }));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list((SubLObject)cb_inferred_index.$kw268$INPUT_NAME, (SubLObject)cb_inferred_index.$str290$ternary_arg1, (SubLObject)cb_inferred_index.$kw270$CLEAR_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw271$COMPLETE_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw272$WIDTH, text_width));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list((SubLObject)cb_inferred_index.$kw268$INPUT_NAME, (SubLObject)cb_inferred_index.$str291$ternary_arg2, (SubLObject)cb_inferred_index.$kw270$CLEAR_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw271$COMPLETE_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw272$WIDTH, text_width));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_inferred_index.$kw87$LEFT));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
                            final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
                                cb_form_widgets.cb_el_term_input_section((SubLObject)cb_inferred_index.NIL, (SubLObject)ConsesLow.list((SubLObject)cb_inferred_index.$kw268$INPUT_NAME, (SubLObject)cb_inferred_index.$str292$ternary_arg3, (SubLObject)cb_inferred_index.$kw270$CLEAR_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw271$COMPLETE_LABEL, (SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$kw272$WIDTH, text_width));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                }
                finally {
                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                    html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                }
                html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_inferred_index.UNPROVIDED);
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 56429L)
    public static SubLObject cb_handle_gaf_entry(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = cb_extract_gaf_entry_sentence(args);
        final SubLObject error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_inferred_index.NIL != error) {
            return cb_show_gaf_entry_error(error);
        }
        return cb_assertion_editor.cb_assert_internal((SubLObject)cb_inferred_index.$kw295$DEFAULT, (SubLObject)cb_inferred_index.NIL, sentence, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 56679L)
    public static SubLObject cb_extract_gaf_entry_sentence(final SubLObject args) {
        if (cb_inferred_index.NIL != html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str258$unary_frame, args)) {
            final SubLObject pred = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str261$unary_frame_pred, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject arg1 = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str260$implicit_arg1, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL == pred) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str261$unary_frame_pred, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            if (cb_inferred_index.NIL == arg1) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str260$implicit_arg1, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            final SubLObject sentence = el_utilities.make_unary_formula(pred, arg1);
            return Values.values(sentence, (SubLObject)cb_inferred_index.NIL);
        }
        else if (cb_inferred_index.NIL != html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str264$binary_frame, args)) {
            final SubLObject pred = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str273$binary_frame_pred, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject arg1 = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str260$implicit_arg1, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject arg2 = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str278$binary_frame_arg2, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL == pred) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str273$binary_frame_pred, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            if (cb_inferred_index.NIL == arg1) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str260$implicit_arg1, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            if (cb_inferred_index.NIL == arg2) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str278$binary_frame_arg2, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            final SubLObject sentence2 = el_utilities.make_binary_formula(pred, arg1, arg2);
            return Values.values(sentence2, (SubLObject)cb_inferred_index.NIL);
        }
        else if (cb_inferred_index.NIL != html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str276$binary, args)) {
            final SubLObject pred = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str283$binary_pred, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject arg1 = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str284$binary_arg1, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject arg2 = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str286$binary_arg2, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL == pred) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str283$binary_pred, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            if (cb_inferred_index.NIL == arg1) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str284$binary_arg1, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            if (cb_inferred_index.NIL == arg2) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str286$binary_arg2, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            final SubLObject sentence2 = el_utilities.make_binary_formula(pred, arg1, arg2);
            return Values.values(sentence2, (SubLObject)cb_inferred_index.NIL);
        }
        else {
            if (cb_inferred_index.NIL == html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str281$ternary, args)) {
                return Values.values((SubLObject)cb_inferred_index.NIL, (SubLObject)cb_inferred_index.$str298$Unexpected_sentence_entry_method);
            }
            final SubLObject pred = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str287$ternary_pred, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject arg1 = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str290$ternary_arg1, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject arg2 = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str291$ternary_arg2, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject arg3 = cb_utilities.cb_guess_term(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str292$ternary_arg3, args), (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL == pred) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str287$ternary_pred, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            if (cb_inferred_index.NIL == arg1) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str290$ternary_arg1, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            if (cb_inferred_index.NIL == arg2) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str291$ternary_arg2, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            if (cb_inferred_index.NIL == arg3) {
                return Values.values((SubLObject)cb_inferred_index.NIL, Sequences.cconcatenate(format_nil.format_nil_a_no_copy(html_utilities.html_extract_input((SubLObject)cb_inferred_index.$str292$ternary_arg3, args)), (SubLObject)cb_inferred_index.$str297$_did_not_specify_a_term));
            }
            final SubLObject sentence3 = el_utilities.make_ternary_formula(pred, arg1, arg2, arg3);
            return Values.values(sentence3, (SubLObject)cb_inferred_index.NIL);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 59746L)
    public static SubLObject cb_show_gaf_entry_error(final SubLObject error) {
        return cb_utilities.cb_error((SubLObject)cb_inferred_index.$str299$_A, error, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED, (SubLObject)cb_inferred_index.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-inferred-index.lisp", position = 59836L)
    public static SubLObject dhtml_highlight_icon_on_mouseover(final SubLObject dim_icon, final SubLObject bright_icon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dim_id = Sequences.cconcatenate((SubLObject)cb_inferred_index.$str300$dim_, format_nil.format_nil_a_no_copy(random.random((SubLObject)cb_inferred_index.$int301$10000)));
        final SubLObject bright_id = Sequences.cconcatenate((SubLObject)cb_inferred_index.$str300$dim_, format_nil.format_nil_a_no_copy(random.random((SubLObject)cb_inferred_index.$int301$10000)));
        final SubLObject dim_src = cyc_file_dependencies.cb_icon_file_path(dim_icon);
        final SubLObject bright_src = cyc_file_dependencies.cb_icon_file_path(bright_icon);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(html_complete.javascript_void_url());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(Sequences.cconcatenate((SubLObject)cb_inferred_index.$str302$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy(bright_id), cb_inferred_index.$str303$___inline___setVisibility__, format_nil.format_nil_a_no_copy(dim_id), cb_inferred_index.$str304$___none___ }));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_markup(Sequences.cconcatenate((SubLObject)cb_inferred_index.$str302$setVisibility__, new SubLObject[] { format_nil.format_nil_a_no_copy(dim_id), cb_inferred_index.$str303$___inline___setVisibility__, format_nil.format_nil_a_no_copy(bright_id), cb_inferred_index.$str304$___none___ }));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(dim_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL != dim_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(dim_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_inferred_index.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$135, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup(bright_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            if (cb_inferred_index.NIL != bright_id) {
                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
                html_utilities.html_markup(bright_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_inferred_index.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_inferred_index.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_inferred_index.UNPROVIDED);
            final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_inferred_index.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    public static SubLObject declare_cb_inferred_index_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_frame", "CB-INFERRED-INDEX-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_inferred_index", "CB-LINK-INFERRED-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_legacy_index_frame", "CB-LEGACY-INDEX-FRAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_legacy_index", "CB-LINK-LEGACY-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index", "CB-INFERRED-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_gaf_arg_index_utilities_section", "CB-SHOW-INFERRED-GAF-ARG-INDEX-UTILITIES-SECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_possibly_show_term_as_seen_from_mt_header", "CB-POSSIBLY-SHOW-TERM-AS-SEEN-FROM-MT-HEADER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_term_as_seen_from_mt_header", "CB-SHOW-TERM-AS-SEEN-FROM-MT-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_gaf_arg_index_header", "CB-SHOW-INFERRED-GAF-ARG-INDEX-HEADER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_gaf_arg_index", "CB-SHOW-INFERRED-GAF-ARG-INDEX", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_gaf_arg_index_by_ontology", "CB-SHOW-INFERRED-GAF-ARG-INDEX-BY-ONTOLOGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_gaf_arg_index_by_predicate", "CB-SHOW-INFERRED-GAF-ARG-INDEX-BY-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_gaf_arg_index_all_assertions_line", "CB-SHOW-INFERRED-GAF-ARG-INDEX-ALL-ASSERTIONS-LINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_index_count", "CB-SHOW-INFERRED-INDEX-COUNT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_make_inferred_gaf_arg_index_tuples_object_id", "CB-MAKE-INFERRED-GAF-ARG-INDEX-TUPLES-OBJECT-ID", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_literal_query", "CB-LINK-LITERAL-QUERY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_index_literal_query_linkP", "CB-SHOW-INFERRED-INDEX-LITERAL-QUERY-LINK?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_hier_brow", "CB-LINK-HIER-BROW", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_index_hierarchy_browser_linkP", "CB-SHOW-INFERRED-INDEX-HIERARCHY-BROWSER-LINK?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_order_by", "CB-INFERRED-INDEX-ORDER-BY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_inferred_index_order_by", "CB-LINK-INFERRED-INDEX-ORDER-BY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_visibility", "CB-INFERRED-INDEX-VISIBILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_inferred_index_toggle_visibility", "CB-LINK-INFERRED-INDEX-TOGGLE-VISIBILITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_predicate_filters", "CB-INFERRED-INDEX-PREDICATE-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_inferred_index_predicate_filters", "CB-LINK-INFERRED-INDEX-PREDICATE-FILTERS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_predicate_filters_guts", "CB-INFERRED-INDEX-PREDICATE-FILTERS-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_predicate_type_filter_remove_allow_checkbox", "CB-INFERRED-INDEX-PREDICATE-TYPE-FILTER-REMOVE-ALLOW-CHECKBOX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_predicate_type_filter_remove_forbid_checkbox", "CB-INFERRED-INDEX-PREDICATE-TYPE-FILTER-REMOVE-FORBID-CHECKBOX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_predicate_filter_forbid_checkbox", "CB-INFERRED-INDEX-PREDICATE-FILTER-FORBID-CHECKBOX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_predicate_filter_allow_checkbox", "CB-INFERRED-INDEX-PREDICATE-FILTER-ALLOW-CHECKBOX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_handle_inferred_index_predicate_filters", "CB-HANDLE-INFERRED-INDEX-PREDICATE-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_extract_inferred_index_predicate_filters", "CB-EXTRACT-INFERRED-INDEX-PREDICATE-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_clear_inferred_index_predicate_filters", "CB-CLEAR-INFERRED-INDEX-PREDICATE-FILTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_update_inferred_index_predicate_filters", "CB-UPDATE-INFERRED-INDEX-PREDICATE-FILTERS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_ontology_filters", "CB-INFERRED-INDEX-ONTOLOGY-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_inferred_index_ontology_filters", "CB-LINK-INFERRED-INDEX-ONTOLOGY-FILTERS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_ontology_filters_guts", "CB-INFERRED-INDEX-ONTOLOGY-FILTERS-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_ontology_horizon_radio_button", "CB-INFERRED-INDEX-ONTOLOGY-HORIZON-RADIO-BUTTON", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_handle_inferred_index_ontology_filters", "CB-HANDLE-INFERRED-INDEX-ONTOLOGY-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_ontology_horizon_term", "CB-SHOW-ONTOLOGY-HORIZON-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_extract_inferred_index_ontology_horizon", "CB-EXTRACT-INFERRED-INDEX-ONTOLOGY-HORIZON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_update_inferred_index_ontology_filters", "CB-UPDATE-INFERRED-INDEX-ONTOLOGY-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_microtheory_filters", "CB-INFERRED-INDEX-MICROTHEORY-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_inferred_index_microtheory_filters", "CB-LINK-INFERRED-INDEX-MICROTHEORY-FILTERS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_set_microtheory_browsing_filter", "CB-SET-MICROTHEORY-BROWSING-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_link_inferred_gaf_arg_assertions", "CB-LINK-INFERRED-GAF-ARG-ASSERTIONS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_gaf_arg_assertions", "CB-INFERRED-GAF-ARG-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_gaf_arg_assertions_guts", "CB-INFERRED-GAF-ARG-ASSERTIONS-GUTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_gaf_arg_assertions_by_ontology", "CB-SHOW-INFERRED-GAF-ARG-ASSERTIONS-BY-ONTOLOGY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_gaf_arg_assertions_by_predicate", "CB-SHOW-INFERRED-GAF-ARG-ASSERTIONS-BY-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_inferred_gaf_arg_index_assertions_final", "CB-SHOW-INFERRED-GAF-ARG-INDEX-ASSERTIONS-FINAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "hl_support_module_for_predicate", "HL-SUPPORT-MODULE-FOR-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_qua_justification", "CB-SHOW-QUA-JUSTIFICATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "filter_gaf_arg_index_tuples", "FILTER-GAF-ARG-INDEX-TUPLES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_inferred_index_definitional_information", "CB-INFERRED-INDEX-DEFINITIONAL-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "inferred_index_definitional_information_override", "INFERRED-INDEX-DEFINITIONAL-INFORMATION-OVERRIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_term_type_header_with_gaf_entry", "CB-TERM-TYPE-HEADER-WITH-GAF-ENTRY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_term_type_header", "CB-TERM-TYPE-HEADER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_gaf_entry_widget_links", "CB-GAF-ENTRY-WIDGET-LINKS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_gaf_entry_widget", "CB-GAF-ENTRY-WIDGET", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_handle_gaf_entry", "CB-HANDLE-GAF-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_extract_gaf_entry_sentence", "CB-EXTRACT-GAF-ENTRY-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "cb_show_gaf_entry_error", "CB-SHOW-GAF-ENTRY-ERROR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_inferred_index", "dhtml_highlight_icon_on_mouseover", "DHTML-HIGHLIGHT-ICON-ON-MOUSEOVER", 2, 0, false);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    public static SubLObject init_cb_inferred_index_file() {
        cb_inferred_index.$cb_inferred_index_order_by$ = SubLFiles.defvar("*CB-INFERRED-INDEX-ORDER-BY*", (SubLObject)cb_inferred_index.$kw0$ONTOLOGY);
        cb_inferred_index.$cb_inferred_index_filters$ = SubLFiles.defvar("*CB-INFERRED-INDEX-FILTERS*", (SubLObject)cb_inferred_index.NIL);
        cb_inferred_index.$cb_inferred_index_visibility$ = SubLFiles.defvar("*CB-INFERRED-INDEX-VISIBILITY*", (SubLObject)cb_inferred_index.$kw3$INVISIBLE);
        cb_inferred_index.$predicate_support_module_map$ = SubLFiles.deflexical("*PREDICATE-SUPPORT-MODULE-MAP*", (SubLObject)cb_inferred_index.$list229);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    public static SubLObject setup_cb_inferred_index_file() {
        utilities_macros.register_html_state_variable((SubLObject)cb_inferred_index.$sym1$_CB_INFERRED_INDEX_ORDER_BY_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_inferred_index.$sym1$_CB_INFERRED_INDEX_ORDER_BY_);
        utilities_macros.register_html_state_variable((SubLObject)cb_inferred_index.$sym2$_CB_INFERRED_INDEX_FILTERS_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_inferred_index.$sym2$_CB_INFERRED_INDEX_FILTERS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_inferred_index.$sym4$_CB_INFERRED_INDEX_VISIBILITY_);
        utilities_macros.register_html_interface_variable((SubLObject)cb_inferred_index.$sym4$_CB_INFERRED_INDEX_VISIBILITY_);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym7$CB_INFERRED_INDEX_FRAME, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw12$INFERRED_INDEX, (SubLObject)cb_inferred_index.$sym13$CB_LINK_INFERRED_INDEX, (SubLObject)cb_inferred_index.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym14$CB_LEGACY_INDEX_FRAME, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw17$LEGACY_INDEX, (SubLObject)cb_inferred_index.$sym18$CB_LINK_LEGACY_INDEX, (SubLObject)cb_inferred_index.THREE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw113$LITERAL_QUERY, (SubLObject)cb_inferred_index.$sym126$CB_LINK_LITERAL_QUERY, (SubLObject)cb_inferred_index.FOUR_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw114$HIER_BROW, (SubLObject)cb_inferred_index.$sym130$CB_LINK_HIER_BROW, (SubLObject)cb_inferred_index.FOUR_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym133$CB_INFERRED_INDEX_ORDER_BY, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw94$INFERRED_INDEX_ORDER_BY, (SubLObject)cb_inferred_index.$sym135$CB_LINK_INFERRED_INDEX_ORDER_BY, (SubLObject)cb_inferred_index.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym137$CB_INFERRED_INDEX_VISIBILITY, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw117$INFERRED_INDEX_TOGGLE_VISIBILITY, (SubLObject)cb_inferred_index.$sym144$CB_LINK_INFERRED_INDEX_TOGGLE_VISIBILITY, (SubLObject)cb_inferred_index.ONE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym147$CB_INFERRED_INDEX_PREDICATE_FILTERS, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw97$INFERRED_INDEX_PREDICATE_FILTERS, (SubLObject)cb_inferred_index.$sym150$CB_LINK_INFERRED_INDEX_PREDICATE_FILTERS, (SubLObject)cb_inferred_index.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym184$CB_HANDLE_INFERRED_INDEX_PREDICATE_FILTERS, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym186$CB_INFERRED_INDEX_ONTOLOGY_FILTERS, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw98$INFERRED_INDEX_ONTOLOGY_FILTERS, (SubLObject)cb_inferred_index.$sym189$CB_LINK_INFERRED_INDEX_ONTOLOGY_FILTERS, (SubLObject)cb_inferred_index.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym199$CB_HANDLE_INFERRED_INDEX_ONTOLOGY_FILTERS, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym207$CB_INFERRED_INDEX_MICROTHEORY_FILTERS, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw99$INFERRED_INDEX_MICROTHEORY_FILTERS, (SubLObject)cb_inferred_index.$sym209$CB_LINK_INFERRED_INDEX_MICROTHEORY_FILTERS, (SubLObject)cb_inferred_index.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_inferred_index.$kw107$INFERRED_GAF_ARG_ASSERTIONS, (SubLObject)cb_inferred_index.$sym214$CB_LINK_INFERRED_GAF_ARG_ASSERTIONS, (SubLObject)cb_inferred_index.FIVE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym219$CB_INFERRED_GAF_ARG_ASSERTIONS, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_inferred_index.$kw239$CLOSE_RED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_inferred_index.$str240$red_x_close_15_gif, (SubLObject)cb_inferred_index.NIL));
        Hashtables.sethash((SubLObject)cb_inferred_index.$kw241$CLOSE_RED_DIM, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_inferred_index.$str242$dim_red_x_close_15_gif, (SubLObject)cb_inferred_index.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_inferred_index.$sym296$CB_HANDLE_GAF_ENTRY, (SubLObject)cb_inferred_index.$kw8$HTML_HANDLER);
        return (SubLObject)cb_inferred_index.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_inferred_index_file();
    }
    
    public void initializeVariables() {
        init_cb_inferred_index_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_inferred_index_file();
    }
    
    static {
        me = (SubLFile)new cb_inferred_index();
        cb_inferred_index.$cb_inferred_index_order_by$ = null;
        cb_inferred_index.$cb_inferred_index_filters$ = null;
        cb_inferred_index.$cb_inferred_index_visibility$ = null;
        cb_inferred_index.$predicate_support_module_map$ = null;
        $kw0$ONTOLOGY = SubLObjectFactory.makeKeyword("ONTOLOGY");
        $sym1$_CB_INFERRED_INDEX_ORDER_BY_ = SubLObjectFactory.makeSymbol("*CB-INFERRED-INDEX-ORDER-BY*");
        $sym2$_CB_INFERRED_INDEX_FILTERS_ = SubLObjectFactory.makeSymbol("*CB-INFERRED-INDEX-FILTERS*");
        $kw3$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $sym4$_CB_INFERRED_INDEX_VISIBILITY_ = SubLObjectFactory.makeSymbol("*CB-INFERRED-INDEX-VISIBILITY*");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ID"));
        $str6$Unable_to_determine_a_term_from__ = SubLObjectFactory.makeString("Unable to determine a term from ~S");
        $sym7$CB_INFERRED_INDEX_FRAME = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-FRAME");
        $kw8$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $kw9$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str10$_Inferred_ = SubLObjectFactory.makeString("[Inferred]");
        $str11$cb_inferred_index_frame__A = SubLObjectFactory.makeString("cb-inferred-index-frame&~A");
        $kw12$INFERRED_INDEX = SubLObjectFactory.makeKeyword("INFERRED-INDEX");
        $sym13$CB_LINK_INFERRED_INDEX = SubLObjectFactory.makeSymbol("CB-LINK-INFERRED-INDEX");
        $sym14$CB_LEGACY_INDEX_FRAME = SubLObjectFactory.makeSymbol("CB-LEGACY-INDEX-FRAME");
        $str15$_Legacy_ = SubLObjectFactory.makeString("[Legacy]");
        $str16$cb_legacy_index_frame__A = SubLObjectFactory.makeString("cb-legacy-index-frame&~A");
        $kw17$LEGACY_INDEX = SubLObjectFactory.makeKeyword("LEGACY-INDEX");
        $sym18$CB_LINK_LEGACY_INDEX = SubLObjectFactory.makeSymbol("CB-LINK-LEGACY-INDEX");
        $str19$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str20$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw21$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw22$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str23$Browsing___ = SubLObjectFactory.makeString("Browsing : ");
        $kw24$DOCUMENTATION = SubLObjectFactory.makeKeyword("DOCUMENTATION");
        $str25$documentation = SubLObjectFactory.makeString("documentation");
        $str26$___ = SubLObjectFactory.makeString(" | ");
        $kw27$DEFINITIONAL = SubLObjectFactory.makeKeyword("DEFINITIONAL");
        $str28$definitional = SubLObjectFactory.makeString("definitional");
        $kw29$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $str30$lexical = SubLObjectFactory.makeString("lexical");
        $str31$Editing___ = SubLObjectFactory.makeString("Editing : ");
        $kw32$EDIT_IN_SMT = SubLObjectFactory.makeKeyword("EDIT-IN-SMT");
        $str33$edit_in_SMT = SubLObjectFactory.makeString("edit in SMT");
        $kw34$CREATE_SIMILAR = SubLObjectFactory.makeKeyword("CREATE-SIMILAR");
        $str35$copy = SubLObjectFactory.makeString("copy");
        $kw36$RENAME = SubLObjectFactory.makeKeyword("RENAME");
        $str37$rename = SubLObjectFactory.makeString("rename");
        $kw38$LEXIFY_TERM = SubLObjectFactory.makeKeyword("LEXIFY-TERM");
        $str39$lexify = SubLObjectFactory.makeString("lexify");
        $kw40$MERGE = SubLObjectFactory.makeKeyword("MERGE");
        $str41$merge = SubLObjectFactory.makeString("merge");
        $kw42$CONFIRM_KILL = SubLObjectFactory.makeKeyword("CONFIRM-KILL");
        $kw43$KILL = SubLObjectFactory.makeKeyword("KILL");
        $str44$kill = SubLObjectFactory.makeString("kill");
        $kw45$CREATE_INSTANCE = SubLObjectFactory.makeKeyword("CREATE-INSTANCE");
        $str46$create_instance = SubLObjectFactory.makeString("create instance");
        $kw47$CREATE_SPEC = SubLObjectFactory.makeKeyword("CREATE-SPEC");
        $str48$create_spec = SubLObjectFactory.makeString("create spec");
        $str49$Advanced___ = SubLObjectFactory.makeString("Advanced : ");
        $kw50$CHRONOLOGICAL_ORDER = SubLObjectFactory.makeKeyword("CHRONOLOGICAL-ORDER");
        $str51$history = SubLObjectFactory.makeString("history");
        $kw52$DESCRIBE_NART = SubLObjectFactory.makeKeyword("DESCRIBE-NART");
        $kw53$DESCRIBE_CONSTANT = SubLObjectFactory.makeKeyword("DESCRIBE-CONSTANT");
        $kw54$TTT_TEST = SubLObjectFactory.makeKeyword("TTT-TEST");
        $str55$take_test = SubLObjectFactory.makeString("take test");
        $kw56$KCT_TEST = SubLObjectFactory.makeKeyword("KCT-TEST");
        $str57$run_test = SubLObjectFactory.makeString("run test");
        $kw58$KBQ_ASK = SubLObjectFactory.makeKeyword("KBQ-ASK");
        $str59$ask_query = SubLObjectFactory.makeString("ask query");
        $kw60$KBQ_ASK_IN_PROOF_CHECKER = SubLObjectFactory.makeKeyword("KBQ-ASK-IN-PROOF-CHECKER");
        $str61$proof_check_query = SubLObjectFactory.makeString("proof-check query");
        $kw62$KCT_EDIT = SubLObjectFactory.makeKeyword("KCT-EDIT");
        $str63$edit_test = SubLObjectFactory.makeString("edit test");
        $kw64$KBQ_EDIT = SubLObjectFactory.makeKeyword("KBQ-EDIT");
        $str65$edit_query = SubLObjectFactory.makeString("edit query");
        $kw66$KB_MONITOR_INDEX_HOOK = SubLObjectFactory.makeKeyword("KB-MONITOR-INDEX-HOOK");
        $str67$monitor = SubLObjectFactory.makeString("monitor");
        $kw68$KCT_TEST_SET = SubLObjectFactory.makeKeyword("KCT-TEST-SET");
        $str69$run_test_set = SubLObjectFactory.makeString("run test set");
        $str70$more_filters = SubLObjectFactory.makeString("more filters");
        $kw71$HANDLER = SubLObjectFactory.makeKeyword("HANDLER");
        $sym72$CB_C_PERTINENT_QUERY_LINKS = SubLObjectFactory.makeSymbol("CB-C-PERTINENT-QUERY-LINKS");
        $kw73$ARGS = SubLObjectFactory.makeKeyword("ARGS");
        $str74$term = SubLObjectFactory.makeString("term");
        $kw75$MESSAGE = SubLObjectFactory.makeKeyword("MESSAGE");
        $str76$Checking_for_Pertinent_Queries___ = SubLObjectFactory.makeString("Checking for Pertinent Queries...");
        $kw77$TAG = SubLObjectFactory.makeKeyword("TAG");
        $str78$div = SubLObjectFactory.makeString("div");
        $kw79$DELAY = SubLObjectFactory.makeKeyword("DELAY");
        $int80$50 = SubLObjectFactory.makeInteger(50);
        $kw81$BEFORE = SubLObjectFactory.makeKeyword("BEFORE");
        $const82$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw83$BOTH = SubLObjectFactory.makeKeyword("BOTH");
        $kw84$AFTER = SubLObjectFactory.makeKeyword("AFTER");
        $str85$as_seen_from = SubLObjectFactory.makeString("as seen from");
        $str86$100_ = SubLObjectFactory.makeString("100%");
        $kw87$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $kw88$TOP = SubLObjectFactory.makeKeyword("TOP");
        $kw89$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $str90$40_ = SubLObjectFactory.makeString("40%");
        $str91$order_by__ = SubLObjectFactory.makeString("order by :");
        $kw92$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $str93$predicate = SubLObjectFactory.makeString("predicate");
        $kw94$INFERRED_INDEX_ORDER_BY = SubLObjectFactory.makeKeyword("INFERRED-INDEX-ORDER-BY");
        $str95$ontology = SubLObjectFactory.makeString("ontology");
        $str96$filters__ = SubLObjectFactory.makeString("filters :");
        $kw97$INFERRED_INDEX_PREDICATE_FILTERS = SubLObjectFactory.makeKeyword("INFERRED-INDEX-PREDICATE-FILTERS");
        $kw98$INFERRED_INDEX_ONTOLOGY_FILTERS = SubLObjectFactory.makeKeyword("INFERRED-INDEX-ONTOLOGY-FILTERS");
        $kw99$INFERRED_INDEX_MICROTHEORY_FILTERS = SubLObjectFactory.makeKeyword("INFERRED-INDEX-MICROTHEORY-FILTERS");
        $str100$mt = SubLObjectFactory.makeString("mt");
        $str101$index_view__ = SubLObjectFactory.makeString("index view :");
        $str102$inferred = SubLObjectFactory.makeString("inferred");
        $str103$legacy = SubLObjectFactory.makeString("legacy");
        $str104$Unexpected_order_by____S = SubLObjectFactory.makeString("Unexpected order-by : ~S");
        $str105$ = SubLObjectFactory.makeString("");
        $str106$via_ = SubLObjectFactory.makeString("via ");
        $kw107$INFERRED_GAF_ARG_ASSERTIONS = SubLObjectFactory.makeKeyword("INFERRED-GAF-ARG-ASSERTIONS");
        $int108$100 = SubLObjectFactory.makeInteger(100);
        $kw109$VISIBLE = SubLObjectFactory.makeKeyword("VISIBLE");
        $kw110$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFER-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("QUA"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $str112$_arg_S = SubLObjectFactory.makeString(" arg~S");
        $kw113$LITERAL_QUERY = SubLObjectFactory.makeKeyword("LITERAL-QUERY");
        $kw114$HIER_BROW = SubLObjectFactory.makeKeyword("HIER-BROW");
        $str115$All_Assertions = SubLObjectFactory.makeString("All Assertions");
        $int116$1000 = SubLObjectFactory.makeInteger(1000);
        $kw117$INFERRED_INDEX_TOGGLE_VISIBILITY = SubLObjectFactory.makeKeyword("INFERRED-INDEX-TOGGLE-VISIBILITY");
        $str118$__A_ = SubLObjectFactory.makeString("(~A)");
        $str119$color__red__background_color_yell = SubLObjectFactory.makeString("color: red; background-color:yellow; font-family:monospace");
        $str120$_ = SubLObjectFactory.makeString("!");
        $str121$igai_ = SubLObjectFactory.makeString("igai_");
        $kw122$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $str123$cb_lq__A__A__A__A = SubLObjectFactory.makeString("cb-lq&~A&~A&~A&~A");
        $str124$cb_lq__A__A__A = SubLObjectFactory.makeString("cb-lq&~A&~A&~A");
        $kw125$PLUS_GREEN = SubLObjectFactory.makeKeyword("PLUS-GREEN");
        $sym126$CB_LINK_LITERAL_QUERY = SubLObjectFactory.makeSymbol("CB-LINK-LITERAL-QUERY");
        $str127$cb_hier__A__A__A__A = SubLObjectFactory.makeString("cb-hier&~A&~A&~A&~A");
        $str128$cb_hier__A__A__A = SubLObjectFactory.makeString("cb-hier&~A&~A&~A");
        $kw129$RED_DIAMOND = SubLObjectFactory.makeKeyword("RED-DIAMOND");
        $sym130$CB_LINK_HIER_BROW = SubLObjectFactory.makeSymbol("CB-LINK-HIER-BROW");
        $list131 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")));
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ID"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER-BY-STRING"));
        $sym133$CB_INFERRED_INDEX_ORDER_BY = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-ORDER-BY");
        $str134$cb_inferred_index_order_by__A__A = SubLObjectFactory.makeString("cb-inferred-index-order-by&~A&~A");
        $sym135$CB_LINK_INFERRED_INDEX_ORDER_BY = SubLObjectFactory.makeSymbol("CB-LINK-INFERRED-INDEX-ORDER-BY");
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-ID"), (SubLObject)SubLObjectFactory.makeSymbol("VISIBILITY-STRING"));
        $sym137$CB_INFERRED_INDEX_VISIBILITY = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-VISIBILITY");
        $str138$close_all = SubLObjectFactory.makeString("close all");
        $str139$open_all = SubLObjectFactory.makeString("open all");
        $kw140$DOWN_TRIANGLE_V = SubLObjectFactory.makeKeyword("DOWN-TRIANGLE-V");
        $kw141$RIGHT_TRIANGLE_V = SubLObjectFactory.makeKeyword("RIGHT-TRIANGLE-V");
        $str142$cb_inferred_index_visibility__A__ = SubLObjectFactory.makeString("cb-inferred-index-visibility&~A&~S");
        $kw143$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $sym144$CB_LINK_INFERRED_INDEX_TOGGLE_VISIBILITY = SubLObjectFactory.makeSymbol("CB-LINK-INFERRED-INDEX-TOGGLE-VISIBILITY");
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STRING"));
        $str146$_S_did_not_specify_a_term = SubLObjectFactory.makeString("~S did not specify a term");
        $sym147$CB_INFERRED_INDEX_PREDICATE_FILTERS = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-PREDICATE-FILTERS");
        $str148$_Predicate_Filters_ = SubLObjectFactory.makeString("[Predicate Filters]");
        $str149$cb_inferred_index_predicate_filte = SubLObjectFactory.makeString("cb-inferred-index-predicate-filters&~A");
        $sym150$CB_LINK_INFERRED_INDEX_PREDICATE_FILTERS = SubLObjectFactory.makeSymbol("CB-LINK-INFERRED-INDEX-PREDICATE-FILTERS");
        $str151$Inferred_Index_Predicate_Filters = SubLObjectFactory.makeString("Inferred Index Predicate Filters");
        $str152$post = SubLObjectFactory.makeString("post");
        $str153$cb_handle_inferred_index_predicat = SubLObjectFactory.makeString("cb-handle-inferred-index-predicate-filters");
        $str154$relevant_to_ = SubLObjectFactory.makeString("relevant to ");
        $str155$Update_Filters = SubLObjectFactory.makeString("Update Filters");
        $str156$update = SubLObjectFactory.makeString("update");
        $str157$Reset_Values = SubLObjectFactory.makeString("Reset Values");
        $str158$Remove_All_Filters = SubLObjectFactory.makeString("Remove All Filters");
        $str159$clear = SubLObjectFactory.makeString("clear");
        $kw160$ALLOW_PREDICATES = SubLObjectFactory.makeKeyword("ALLOW-PREDICATES");
        $kw161$ALLOW_PREDICATE_TYPES = SubLObjectFactory.makeKeyword("ALLOW-PREDICATE-TYPES");
        $kw162$FORBID_PREDICATES = SubLObjectFactory.makeKeyword("FORBID-PREDICATES");
        $kw163$FORBID_PREDICATE_TYPES = SubLObjectFactory.makeKeyword("FORBID-PREDICATE-TYPES");
        $str164$Allowed_Types = SubLObjectFactory.makeString("Allowed Types");
        $str165$check_to_remove = SubLObjectFactory.makeString("check to remove");
        $str166$add_ = SubLObjectFactory.makeString("add ");
        $str167$type_allow = SubLObjectFactory.makeString("type_allow");
        $int168$30 = SubLObjectFactory.makeInteger(30);
        $str169$Complete = SubLObjectFactory.makeString("Complete");
        $const170$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $str171$Forbidden_Types = SubLObjectFactory.makeString("Forbidden Types");
        $str172$type_forbid = SubLObjectFactory.makeString("type_forbid");
        $str173$Allowed_Predicates = SubLObjectFactory.makeString("Allowed Predicates");
        $kw174$RED = SubLObjectFactory.makeKeyword("RED");
        $str175$None_ = SubLObjectFactory.makeString("None!");
        $str176$check_to_forbid = SubLObjectFactory.makeString("check to forbid");
        $str177$Forbidden_Predicates = SubLObjectFactory.makeString("Forbidden Predicates");
        $str178$check_to_allow = SubLObjectFactory.makeString("check to allow");
        $str179$remove_type_allow_ = SubLObjectFactory.makeString("remove_type_allow_");
        $str180$T = SubLObjectFactory.makeString("T");
        $str181$remove_type_forbid_ = SubLObjectFactory.makeString("remove_type_forbid_");
        $str182$forbid_ = SubLObjectFactory.makeString("forbid_");
        $str183$allow_ = SubLObjectFactory.makeString("allow_");
        $sym184$CB_HANDLE_INFERRED_INDEX_PREDICATE_FILTERS = SubLObjectFactory.makeSymbol("CB-HANDLE-INFERRED-INDEX-PREDICATE-FILTERS");
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym186$CB_INFERRED_INDEX_ONTOLOGY_FILTERS = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-ONTOLOGY-FILTERS");
        $str187$_Ontology_Filters_ = SubLObjectFactory.makeString("[Ontology Filters]");
        $str188$cb_inferred_index_ontology_filter = SubLObjectFactory.makeString("cb-inferred-index-ontology-filters&~A");
        $sym189$CB_LINK_INFERRED_INDEX_ONTOLOGY_FILTERS = SubLObjectFactory.makeSymbol("CB-LINK-INFERRED-INDEX-ONTOLOGY-FILTERS");
        $str190$Inferred_Index_Ontology_Filters = SubLObjectFactory.makeString("Inferred Index Ontology Filters");
        $str191$cb_handle_inferred_index_ontology = SubLObjectFactory.makeString("cb-handle-inferred-index-ontology-filters");
        $kw192$ONTOLOGY_HORIZON = SubLObjectFactory.makeKeyword("ONTOLOGY-HORIZON");
        $str193$Generality_Horizon = SubLObjectFactory.makeString("Generality Horizon");
        $str194$select_a_qualitative_boundary = SubLObjectFactory.makeString("select a qualitative boundary");
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELF"), (SubLObject)SubLObjectFactory.makeKeyword("LOWER"), (SubLObject)SubLObjectFactory.makeKeyword("MIDDLE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $str196$or_a_generalization = SubLObjectFactory.makeString("or a generalization");
        $kw197$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str198$ontology_horizon = SubLObjectFactory.makeString("ontology-horizon");
        $sym199$CB_HANDLE_INFERRED_INDEX_ONTOLOGY_FILTERS = SubLObjectFactory.makeSymbol("CB-HANDLE-INFERRED-INDEX-ONTOLOGY-FILTERS");
        $str200$Just_on_the_term = SubLObjectFactory.makeString("Just on the term");
        $kw201$LOWER = SubLObjectFactory.makeKeyword("LOWER");
        $str202$Also_from_the_lower_ontology = SubLObjectFactory.makeString("Also from the lower ontology");
        $kw203$MIDDLE = SubLObjectFactory.makeKeyword("MIDDLE");
        $str204$Also_up_through_the_middle_ontolo = SubLObjectFactory.makeString("Also up through the middle ontology");
        $str205$Everything = SubLObjectFactory.makeString("Everything");
        $str206$Time_to_implement_cb_inferred_ind = SubLObjectFactory.makeString("Time to implement cb-inferred-index-microtheory-filters-guts");
        $sym207$CB_INFERRED_INDEX_MICROTHEORY_FILTERS = SubLObjectFactory.makeSymbol("CB-INFERRED-INDEX-MICROTHEORY-FILTERS");
        $str208$_Microtheory_Filters_ = SubLObjectFactory.makeString("[Microtheory Filters]");
        $sym209$CB_LINK_INFERRED_INDEX_MICROTHEORY_FILTERS = SubLObjectFactory.makeSymbol("CB-LINK-INFERRED-INDEX-MICROTHEORY-FILTERS");
        $kw210$MICROTHEORY = SubLObjectFactory.makeKeyword("MICROTHEORY");
        $str211$cb_inferred_gaf_arg_assertions__A = SubLObjectFactory.makeString("cb-inferred-gaf-arg-assertions&~A&~A&~A&~A");
        $str212$cb_inferred_gaf_arg_assertions__A = SubLObjectFactory.makeString("cb-inferred-gaf-arg-assertions&~A&~A");
        $str213$cb_inferred_gaf_arg_assertions__A = SubLObjectFactory.makeString("cb-inferred-gaf-arg-assertions&~A");
        $sym214$CB_LINK_INFERRED_GAF_ARG_ASSERTIONS = SubLObjectFactory.makeSymbol("CB-LINK-INFERRED-GAF-ARG-ASSERTIONS");
        $list215 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("QUA-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-SPEC"));
        $str216$Could_not_determine_a_term_from__ = SubLObjectFactory.makeString("Could not determine a term from ~a");
        $str217$NIL = SubLObjectFactory.makeString("NIL");
        $str218$Could_not_determine_an_argnum_fro = SubLObjectFactory.makeString("Could not determine an argnum from ~a");
        $sym219$CB_INFERRED_GAF_ARG_ASSERTIONS = SubLObjectFactory.makeSymbol("CB-INFERRED-GAF-ARG-ASSERTIONS");
        $str220$Inferred_GAF_arg_index_for__S = SubLObjectFactory.makeString("Inferred GAF arg index for ~S");
        $str221$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str222$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str223$button = SubLObjectFactory.makeString("button");
        $str224$reload = SubLObjectFactory.makeString("reload");
        $str225$Refresh = SubLObjectFactory.makeString("Refresh");
        $str226$reloadCurrentFrame__reloadFrameBu = SubLObjectFactory.makeString("reloadCurrentFrame('reloadFrameButton');");
        $kw227$QUERY_ISA = SubLObjectFactory.makeKeyword("QUERY-ISA");
        $str228$_query = SubLObjectFactory.makeString(" query");
        $list229 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeKeyword("ISA")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeKeyword("GENLS")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeKeyword("EQUALITY")));
        $kw230$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $const231$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $str232$on_ = SubLObjectFactory.makeString("on ");
        $str233$the_term = SubLObjectFactory.makeString("the term");
        $const234$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw235$HL_SUPPORT = SubLObjectFactory.makeKeyword("HL-SUPPORT");
        $kw236$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str237$___ = SubLObjectFactory.makeString("[?]");
        $list238 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $kw239$CLOSE_RED = SubLObjectFactory.makeKeyword("CLOSE-RED");
        $str240$red_x_close_15_gif = SubLObjectFactory.makeString("red-x-close-15.gif");
        $kw241$CLOSE_RED_DIM = SubLObjectFactory.makeKeyword("CLOSE-RED-DIM");
        $str242$dim_red_x_close_15_gif = SubLObjectFactory.makeString("dim-red-x-close-15.gif");
        $str243$gaf_entry = SubLObjectFactory.makeString("gaf_entry");
        $str244$___ = SubLObjectFactory.makeString("[+]");
        $str245$___ = SubLObjectFactory.makeString("[-]");
        $str246$Open_the_CURE_on_ = SubLObjectFactory.makeString("Open the CURE on ");
        $str247$_to_add_more_facts_ = SubLObjectFactory.makeString(" to add more facts.");
        $str248$___ = SubLObjectFactory.makeString(" : ");
        $str249$__ = SubLObjectFactory.makeString(" .");
        $list250 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeString("gaf_entry")), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"));
        $list251 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("ARGNUM"));
        $kw252$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw253$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw254$PRED = SubLObjectFactory.makeKeyword("PRED");
        $kw255$ARGNUM = SubLObjectFactory.makeKeyword("ARGNUM");
        $int256$200 = SubLObjectFactory.makeInteger(200);
        $kw257$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $str258$unary_frame = SubLObjectFactory.makeString("unary_frame");
        $str259$cb_handle_gaf_entry = SubLObjectFactory.makeString("cb-handle-gaf-entry");
        $str260$implicit_arg1 = SubLObjectFactory.makeString("implicit_arg1");
        $str261$unary_frame_pred = SubLObjectFactory.makeString("unary_frame_pred");
        $str262$unary_predicate = SubLObjectFactory.makeString("unary predicate");
        $const263$UnaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnaryPredicate"));
        $str264$binary_frame = SubLObjectFactory.makeString("binary_frame");
        $str265$_arg2 = SubLObjectFactory.makeString("+arg2");
        $kw266$BOTTOM = SubLObjectFactory.makeKeyword("BOTTOM");
        $str267$Assert = SubLObjectFactory.makeString("Assert");
        $kw268$INPUT_NAME = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $kw269$COMPLETE_TYPE = SubLObjectFactory.makeKeyword("COMPLETE-TYPE");
        $kw270$CLEAR_LABEL = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $kw271$COMPLETE_LABEL = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $kw272$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $str273$binary_frame_pred = SubLObjectFactory.makeString("binary_frame_pred");
        $str274$binary_predicate = SubLObjectFactory.makeString("binary predicate");
        $const275$BinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"));
        $str276$binary = SubLObjectFactory.makeString("binary");
        $str277$_arg1 = SubLObjectFactory.makeString("+arg1");
        $str278$binary_frame_arg2 = SubLObjectFactory.makeString("binary_frame_arg2");
        $str279$arg2 = SubLObjectFactory.makeString("arg2");
        $const280$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $str281$ternary = SubLObjectFactory.makeString("ternary");
        $str282$_arg3 = SubLObjectFactory.makeString("+arg3");
        $str283$binary_pred = SubLObjectFactory.makeString("binary_pred");
        $str284$binary_arg1 = SubLObjectFactory.makeString("binary_arg1");
        $str285$arg1 = SubLObjectFactory.makeString("arg1");
        $str286$binary_arg2 = SubLObjectFactory.makeString("binary_arg2");
        $str287$ternary_pred = SubLObjectFactory.makeString("ternary_pred");
        $str288$ternary_predicate = SubLObjectFactory.makeString("ternary predicate");
        $const289$TernaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TernaryPredicate"));
        $str290$ternary_arg1 = SubLObjectFactory.makeString("ternary_arg1");
        $str291$ternary_arg2 = SubLObjectFactory.makeString("ternary_arg2");
        $str292$ternary_arg3 = SubLObjectFactory.makeString("ternary_arg3");
        $str293$arg3 = SubLObjectFactory.makeString("arg3");
        $str294$_arg4 = SubLObjectFactory.makeString("+arg4");
        $kw295$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym296$CB_HANDLE_GAF_ENTRY = SubLObjectFactory.makeSymbol("CB-HANDLE-GAF-ENTRY");
        $str297$_did_not_specify_a_term = SubLObjectFactory.makeString(" did not specify a term");
        $str298$Unexpected_sentence_entry_method = SubLObjectFactory.makeString("Unexpected sentence entry method");
        $str299$_A = SubLObjectFactory.makeString("~A");
        $str300$dim_ = SubLObjectFactory.makeString("dim_");
        $int301$10000 = SubLObjectFactory.makeInteger(10000);
        $str302$setVisibility__ = SubLObjectFactory.makeString("setVisibility('");
        $str303$___inline___setVisibility__ = SubLObjectFactory.makeString("','inline');setVisibility('");
        $str304$___none___ = SubLObjectFactory.makeString("','none');");
    }
}

/*

	Total time: 9127 ms
	
*/