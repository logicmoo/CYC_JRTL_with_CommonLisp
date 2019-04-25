package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_rtv extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_rtv";
    public static final String myFingerPrint = "58deacc99f0e953d57b8faa9d7c8dc205ba788e108037247f50e444ef4664c5d";
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1449L)
    private static SubLSymbol $cb_rtv_fort_generation_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1774L)
    private static SubLSymbol $cb_rtv_fort_parse_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1966L)
    private static SubLSymbol $rtv_default_query_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 2140L)
    public static SubLSymbol $cb_rtv_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3107L)
    public static SubLSymbol $cb_rtv_ask_results$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3217L)
    public static SubLSymbol $cb_rtv_collections$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 17604L)
    private static SubLSymbol $cb_rtv_meta_support_level$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 17880L)
    private static SubLSymbol $cb_rtv_meta_support_max$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    private static SubLSymbol $cb_rtv_graph_keys$;
    private static final SubLString $str0$RTV;
    private static final SubLSymbol $kw1$MAIN;
    private static final SubLString $str2$cb_rtv;
    private static final SubLSymbol $kw3$RTV_QUERY;
    private static final SubLSymbol $sym4$CB_LINK_RTV_QUERY;
    private static final SubLString $str5$relatedToVia_Query_Tool;
    private static final SubLSymbol $sym6$GENERATE_PHRASE;
    private static final SubLSymbol $kw7$NL;
    private static final SubLSymbol $sym8$FORT_TO_STRING;
    private static final SubLSymbol $sym9$TERMS_FOR_BROWSING;
    private static final SubLObject $const10$CurrentWorldDataCollectorMt_NonHo;
    private static final SubLSymbol $sym11$_CB_RTV_PREDICATES_;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$_CB_RTV_ASK_RESULTS_;
    private static final SubLSymbol $sym14$_CB_RTV_COLLECTIONS_;
    private static final SubLSymbol $sym15$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const16$EverythingPSC;
    private static final SubLObject $const17$RTVDemoCollection;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$MT;
    private static final SubLSymbol $kw20$RESET;
    private static final SubLString $str21$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str22$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw23$UNINITIALIZED;
    private static final SubLSymbol $kw24$TERM1;
    private static final SubLObject $const25$Individual;
    private static final SubLSymbol $kw26$TERM2_TYPE;
    private static final SubLSymbol $kw27$INDIVIDUAL;
    private static final SubLSymbol $kw28$TERM2;
    private static final SubLSymbol $kw29$ISA;
    private static final SubLSymbol $kw30$GENL;
    private static final SubLSymbol $kw31$TERM2_ADD_TYPE;
    private static final SubLObject $const32$Collection;
    private static final SubLSymbol $kw33$TERM2_VARIABLE_TYPE;
    private static final SubLSymbol $kw34$PRED;
    private static final SubLObject $const35$genls;
    private static final SubLSymbol $kw36$NUM;
    private static final SubLSymbol $kw37$NEW_PRED;
    private static final SubLObject $const38$Predicate;
    private static final SubLSymbol $kw39$REMOVE_PREDS;
    private static final SubLSymbol $kw40$PREDICATES;
    private static final SubLSymbol $kw41$ON;
    private static final SubLSymbol $kw42$GENL_PRED_REASONING;
    private static final SubLObject $const43$Microtheory;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$_ANY;
    private static final SubLObject $const46$TheSet;
    private static final SubLSymbol $kw47$DEPTH;
    private static final SubLObject $const48$relatedToVia;
    private static final SubLObject $const49$isa;
    private static final SubLObject $const50$Thing;
    private static final SubLObject $const51$and;
    private static final SubLSymbol $kw52$ASK_FORMULA;
    private static final SubLString $str53$___;
    private static final SubLSymbol $sym54$STRING_;
    private static final SubLSymbol $sym55$SYMBOL_NAME;
    private static final SubLSymbol $kw56$RUN_QUERY;
    private static final SubLString $str57$cg;
    private static final SubLString $str58$How_can_the_individual_named_;
    private static final SubLSymbol $kw59$NBSP;
    private static final SubLString $str60$be_connected_to_;
    private static final SubLSymbol $kw61$KEYWORD;
    private static final SubLString $str62$onChange_javascript_this_form_sub;
    private static final SubLSymbol $kw63$DEFAULT;
    private static final SubLString $str64$the_individual_named;
    private static final SubLString $str65$any;
    private static final SubLString $str66$any_type_of;
    private static final SubLSymbol $kw67$FORT;
    private static final SubLString $str68$___;
    private static final SubLString $str69$by_at_most;
    private static final SubLString $str70$links_using_;
    private static final SubLString $str71$_the_selected_relations_and_their;
    private static final SubLSymbol $kw72$OFF;
    private static final SubLString $str73$_only_the_selected_relations_;
    private static final SubLSymbol $kw74$CENTER;
    private static final SubLSymbol $kw75$RED;
    private static final SubLString $str76$_;
    private static final SubLString $str77$________Add_New_Relation;
    private static final SubLSymbol $kw78$ADD_PRED;
    private static final SubLString $str79$_____Remove_Selected_Relations;
    private static final SubLSymbol $kw80$RTV_PREDICATE_GRAPH_EVENT;
    private static final SubLString $str81$_Visualize_Selected_Relations_;
    private static final SubLString $str82$in_the_context_;
    private static final SubLString $str83$Current_query_formula____A;
    private static final SubLSymbol $sym84$BOOLEANP;
    private static final SubLSymbol $sym85$CB_RTV;
    private static final SubLSymbol $kw86$HTML_HANDLER;
    private static final SubLString $str87$Update;
    private static final SubLSymbol $kw88$UPDATE;
    private static final SubLString $str89$Run_This_Query;
    private static final SubLString $str90$Reset_Completely;
    private static final SubLString $str91$No_answers_found_;
    private static final SubLString $str92$Query_Results;
    private static final SubLSymbol $kw93$RTV_GRAPH_EVENT;
    private static final SubLString $str94$_Visualize_below_justification_;
    private static final SubLString $str95$_Visualize_more_justifications_;
    private static final SubLSymbol $kw96$EXPANDED_NODE_TO_NODE;
    private static final SubLString $str97$_Visualize_justifications_of_all_;
    private static final SubLList $list98;
    private static final SubLString $str99$True__;
    private static final SubLSymbol $kw100$RTV_JUSTIFY_TERM;
    private static final SubLString $str101$_Explain_;
    private static final SubLString $str102$_Visualize_;
    private static final SubLSymbol $sym103$CB_RTV_JUSTIFY_TERM;
    private static final SubLSymbol $kw104$TERM;
    private static final SubLSymbol $kw105$CB_CYC;
    private static final SubLSymbol $kw106$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw107$SHA1;
    private static final SubLString $str108$yui_skin_sam;
    private static final SubLString $str109$reloadFrameButton;
    private static final SubLString $str110$button;
    private static final SubLString $str111$reload;
    private static final SubLString $str112$Refresh_Frames;
    private static final SubLString $str113$1;
    private static final SubLSymbol $sym114$CB_RTV_JUSTIFY_TERM_OPEN_WINDOW;
    private static final SubLSymbol $kw115$SIGNATURE;
    private static final SubLString $str116$justify_me;
    private static final SubLString $str117$cb_rtv_justify_term;
    private static final SubLSymbol $sym118$CB_LINK_RTV_JUSTIFY_TERM;
    private static final SubLString $str119$window_open__;
    private static final SubLString $str120$__;
    private static final SubLString $str121$__A_;
    private static final SubLString $str122$null;
    private static final SubLString $str123$___A____;
    private static final SubLString $str124$dependent_yes_height_360_width_64;
    private static final SubLString $str125$return_false_;
    private static final SubLSymbol $sym126$HTML_TABLE_ROW;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$HTML_TABLE_DATA;
    private static final SubLString $str129$meta_supports_;
    private static final SubLString $str130$text_css;
    private static final SubLString $str131$screen;
    private static final SubLString $str132$none;
    private static final SubLString $str133$;
    private static final SubLSymbol $kw134$INVISIBLE;
    private static final SubLSymbol $kw135$TEXT;
    private static final SubLString $str136$_A_meta__D;
    private static final SubLString $str137$support;
    private static final SubLString $str138$additional_supports_;
    private static final SubLString $str139$Additional_Supports;
    private static final SubLSymbol $kw140$VISIBLE;
    private static final SubLString $str141$_A_additional__D;
    private static final SubLString $str142$_A__D;
    private static final SubLString $str143$_A_;
    private static final SubLString $str144$_A_D;
    private static final SubLSymbol $kw145$TOP;
    private static final SubLString $str146$_S_;
    private static final SubLSymbol $kw147$RTV;
    private static final SubLList $list148;
    private static final SubLSymbol $kw149$FORTS;
    private static final SubLSymbol $kw150$PREDS;
    private static final SubLSymbol $kw151$FILTER_PRED;
    private static final SubLSymbol $kw152$GENLS;
    private static final SubLSymbol $kw153$FILTER_FORT;
    private static final SubLSymbol $kw154$GRAPH_TYPE;
    private static final SubLString $str155$_A;
    private static final SubLInteger $int156$30;
    private static final SubLString $str157$cb_rtv_graph_event;
    private static final SubLSymbol $sym158$CB_LINK_RTV_GRAPH_EVENT;
    private static final SubLSymbol $sym159$CB_RTV_GRAPH_EVENT_PROCESS;
    private static final SubLSymbol $sym160$CB_RTV_GRAPH_EVENT;
    private static final SubLSymbol $kw161$BUILDER_FN;
    private static final SubLSymbol $sym162$BBF_RTV_ALL_EDGES_BETWEEN;
    private static final SubLSymbol $sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING;
    private static final SubLSymbol $kw164$PARAMS;
    private static final SubLSymbol $kw165$FORMULA;
    private static final SubLList $list166;
    private static final SubLObject $const167$genlPreds;
    private static final SubLSymbol $sym168$BBF_RTV_ALL_EDGES_FROM_NODE;
    private static final SubLList $list169;
    private static final SubLList $list170;
    private static final SubLSymbol $sym171$ASSERTION_FORMULA;
    private static final SubLList $list172;
    private static final SubLSymbol $sym173$RTV_CLAUSE_P;
    private static final SubLSymbol $sym174$BBF_RTV;
    private static final SubLSymbol $kw175$PRED_SET;
    private static final SubLString $str176$cb_rtv_predicate_graph_event;
    private static final SubLSymbol $sym177$CB_LINK_RTV_PREDICATE_GRAPH_EVENT;
    private static final SubLSymbol $sym178$CB_RTV_PREDICATE_GRAPH_EVENT_PROCESS;
    private static final SubLSymbol $sym179$CB_RTV_PREDICATE_GRAPH_EVENT;
    private static final SubLSymbol $sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS;
    private static final SubLList $list181;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1090L)
    public static SubLObject cb_link_rtv_query(SubLObject linktext) {
        if (linktext == cb_rtv.UNPROVIDED) {
            linktext = (SubLObject)cb_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_rtv.NIL == linktext) {
            linktext = (SubLObject)cb_rtv.$str0$RTV;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_rtv.$kw1$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_rtv.$str2$cb_rtv);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        if (cb_rtv.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1573L)
    public static SubLObject cb_rtv_fort_generation_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = control_vars.$cb_major_presentation_language$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)cb_rtv.$kw7$NL)) {
            return cb_rtv.$cb_rtv_fort_generation_fn$.getDynamicValue(thread);
        }
        return Symbols.symbol_function((SubLObject)cb_rtv.$sym8$FORT_TO_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1893L)
    public static SubLObject cb_rtv_fort_parse_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cb_rtv.$cb_rtv_fort_parse_fn$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 2248L)
    public static SubLObject maybe_initialize_cb_rtv_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_rtv.NIL == cb_rtv.$cb_rtv_predicates$.getDynamicValue(thread)) {
            initialize_cb_rtv_predicates();
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 2384L)
    public static SubLObject initialize_cb_rtv_predicates() {
        cb_rtv.$cb_rtv_predicates$.setDynamicValue((SubLObject)cb_rtv.$list12);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3333L)
    public static SubLObject maybe_initialize_cb_rtv_collections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_rtv.NIL == cb_rtv.$cb_rtv_collections$.getDynamicValue(thread)) {
            return initialize_cb_rtv_collections();
        }
        return (SubLObject)cb_rtv.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3475L)
    public static SubLObject initialize_cb_rtv_collections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_rtv.$sym15$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_rtv.$const16$EverythingPSC, thread);
            cb_rtv.$cb_rtv_collections$.setDynamicValue(isa.all_fort_instances(cb_rtv.$const17$RTVDemoCollection, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED), thread);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (cb_rtv.NIL == cb_rtv.$cb_rtv_collections$.getDynamicValue(thread)) {
            cb_rtv.$cb_rtv_collections$.setDynamicValue((SubLObject)cb_rtv.$list18, thread);
        }
        return cb_rtv.$cb_rtv_collections$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3746L)
    public static SubLObject cb_rtv(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arghash = html_arghash.arglist_to_arghash(args);
        final SubLObject debug = (SubLObject)cb_rtv.NIL;
        SubLObject running_query_nowP = (SubLObject)cb_rtv.NIL;
        SubLObject genl_preds_reasoning_enabledP = (SubLObject)cb_rtv.NIL;
        final SubLObject filter_mt = (cb_rtv.NIL != fort_types_interface.mtP(html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw19$MT, arghash))) ? html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw19$MT, arghash) : cb_rtv.$rtv_default_query_mt$.getGlobalValue();
        final SubLObject generation_fn = cb_rtv_fort_generation_fn();
        final SubLObject parse_fn = cb_rtv_fort_parse_fn();
        if (cb_rtv.NIL != html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw20$RESET, arghash)) {
            arghash = html_arghash.new_arghash((SubLObject)cb_rtv.UNPROVIDED);
            initialize_cb_rtv_collections();
            initialize_cb_rtv_predicates();
        }
        maybe_initialize_cb_rtv_predicates();
        maybe_initialize_cb_rtv_collections();
        html_utilities.html_markup((SubLObject)cb_rtv.$str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_rtv.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_rtv.$str22$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_rtv.$kw23$UNINITIALIZED) ? ConsesLow.list(cb_rtv.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_rtv.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_rtv.$str5$relatedToVia_Query_Tool);
            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_rtv.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_color_white$.getGlobalValue();
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_rtv.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_rtv.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                    arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, (SubLObject)cb_rtv.$kw24$TERM1, debug, generation_fn, parse_fn, cb_rtv.$const25$Individual, filter_mt);
                    if (html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash) == cb_rtv.$kw27$INDIVIDUAL) {
                        arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, (SubLObject)cb_rtv.$kw28$TERM2, debug, generation_fn, parse_fn, cb_rtv.$const25$Individual, filter_mt);
                    }
                    else if (html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash) == cb_rtv.$kw29$ISA || html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash) == cb_rtv.$kw30$GENL) {
                        arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, (SubLObject)cb_rtv.$kw31$TERM2_ADD_TYPE, debug, generation_fn, parse_fn, cb_rtv.$const32$Collection, filter_mt);
                        if (cb_rtv.NIL != forts.fort_p(html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw31$TERM2_ADD_TYPE, arghash))) {
                            cb_rtv.$cb_rtv_collections$.setDynamicValue((SubLObject)ConsesLow.cons(html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw31$TERM2_ADD_TYPE, arghash), cb_rtv.$cb_rtv_collections$.getDynamicValue(thread)), thread);
                            html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw33$TERM2_VARIABLE_TYPE, arghash, html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw31$TERM2_ADD_TYPE, arghash));
                            html_arghash.html_arghash_nl_fort_input_clear(arghash, (SubLObject)cb_rtv.$kw31$TERM2_ADD_TYPE);
                        }
                    }
                    else {
                        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash, (SubLObject)cb_rtv.$kw27$INDIVIDUAL);
                    }
                    if (cb_rtv.NIL == html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw34$PRED, arghash)) {
                        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw34$PRED, arghash, cb_rtv.$const35$genls);
                    }
                    if (cb_rtv.NIL == html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw36$NUM, arghash)) {
                        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw36$NUM, arghash, (SubLObject)cb_rtv.TWO_INTEGER);
                    }
                    arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, (SubLObject)cb_rtv.$kw37$NEW_PRED, debug, generation_fn, parse_fn, cb_rtv.$const38$Predicate, filter_mt);
                    if (cb_rtv.NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, (SubLObject)cb_rtv.$kw37$NEW_PRED)) {
                        final SubLObject item_var = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw37$NEW_PRED, arghash);
                        if (cb_rtv.NIL == conses_high.member(item_var, cb_rtv.$cb_rtv_predicates$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)cb_rtv.EQL), Symbols.symbol_function((SubLObject)cb_rtv.IDENTITY))) {
                            cb_rtv.$cb_rtv_predicates$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, cb_rtv.$cb_rtv_predicates$.getDynamicValue(thread)), thread);
                        }
                        arghash = html_arghash.html_arghash_nl_fort_input_clear(arghash, (SubLObject)cb_rtv.$kw37$NEW_PRED);
                    }
                    if (cb_rtv.NIL != html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw39$REMOVE_PREDS, arghash)) {
                        cb_rtv.$cb_rtv_predicates$.setDynamicValue(list_utilities.remove_objects_from_list(html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw40$PREDICATES, arghash), cb_rtv.$cb_rtv_predicates$.getDynamicValue(thread), (SubLObject)cb_rtv.UNPROVIDED), thread);
                        html_arghash.rem_arghash_value((SubLObject)cb_rtv.$kw39$REMOVE_PREDS, arghash);
                    }
                    maybe_initialize_cb_rtv_collections();
                    maybe_initialize_cb_rtv_predicates();
                    genl_preds_reasoning_enabledP = Equality.eq((SubLObject)cb_rtv.$kw41$ON, html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw42$GENL_PRED_REASONING, arghash));
                    arghash = html_arghash.html_arghash_nl_fort_input_force_default_if_unset(arghash, (SubLObject)cb_rtv.$kw19$MT, cb_rtv.$rtv_default_query_mt$.getGlobalValue(), generation_fn, debug);
                    arghash = html_arghash.html_arghash_nl_fort_input_validate(arghash, (SubLObject)cb_rtv.$kw19$MT, debug, generation_fn, parse_fn, cb_rtv.$const43$Microtheory, filter_mt);
                    final SubLObject cb_rtv_query_readyP = cb_rtv_query_readyP(arghash);
                    final SubLObject arg1 = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw24$TERM1, arghash);
                    final SubLObject arg2 = (SubLObject)((cb_rtv.NIL != conses_high.member(html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash), (SubLObject)cb_rtv.$list44, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED)) ? cb_rtv.$sym45$_ANY : html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw28$TERM2, arghash));
                    final SubLObject pred_set = (SubLObject)ConsesLow.cons(cb_rtv.$const46$TheSet, html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw40$PREDICATES, arghash));
                    final SubLObject depth = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw47$DEPTH, arghash);
                    SubLObject ask_formula = (SubLObject)ConsesLow.list(cb_rtv.$const48$relatedToVia, arg1, arg2, pred_set, depth);
                    final SubLObject arg2_var_type = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw33$TERM2_VARIABLE_TYPE, arghash);
                    final SubLObject arg2_pred = (html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash) == cb_rtv.$kw30$GENL) ? cb_rtv.$const35$genls : cb_rtv.$const49$isa;
                    final SubLObject mt = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw19$MT, arghash);
                    if (cb_rtv.NIL != cb_rtv_query_readyP) {
                        if (arg2 == cb_rtv.$sym45$_ANY && cb_rtv.NIL != arg2_var_type && cb_rtv.NIL == kb_utilities.kbeq(arg2_var_type, cb_rtv.$const50$Thing)) {
                            ask_formula = (SubLObject)ConsesLow.list(cb_rtv.$const51$and, ask_formula, (SubLObject)ConsesLow.list(arg2_pred, (SubLObject)cb_rtv.$sym45$_ANY, arg2_var_type));
                        }
                        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw52$ASK_FORMULA, arghash, ask_formula);
                    }
                    if (cb_rtv.NIL != debug) {
                        html_utilities.html_hr((SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                        SubLObject cdolist_list_var = Sort.sort(hash_table_utilities.hash_table_keys(arghash), Symbols.symbol_function((SubLObject)cb_rtv.$sym54$STRING_), Symbols.symbol_function((SubLObject)cb_rtv.$sym55$SYMBOL_NAME));
                        SubLObject k = (SubLObject)cb_rtv.NIL;
                        k = cdolist_list_var.first();
                        while (cb_rtv.NIL != cdolist_list_var) {
                            html_utilities.html_princ(k);
                            html_utilities.html_princ((SubLObject)cb_rtv.$str53$___);
                            html_utilities.html_princ(Hashtables.gethash(k, arghash, (SubLObject)cb_rtv.UNPROVIDED));
                            html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            k = cdolist_list_var.first();
                        }
                        html_utilities.html_hr((SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                    }
                    dhtml_macros.dhtml_with_toggle_visibility_support();
                    dhtml_macros.dhtml_with_dom_script();
                    if (cb_rtv.NIL != html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw56$RUN_QUERY, arghash)) {
                        running_query_nowP = (SubLObject)cb_rtv.T;
                    }
                    html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw56$RUN_QUERY, arghash, (SubLObject)cb_rtv.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_rtv.$str57$cg);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                    if (cb_rtv.NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_rtv.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_rtv.$str2$cb_rtv, (SubLObject)cb_rtv.T, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtv.ONE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtv.FIVE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtv.ONE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        if (cb_rtv.NIL != html_macros.$html_color_lighter_blue$.getGlobalValue()) {
                            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_rtv.$str58$How_can_the_individual_named_);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                                html_arghash.html_arghash_nl_fort_input(arghash, (SubLObject)cb_rtv.$kw24$TERM1, debug, generation_fn, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_terpri((SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_rtv.$str60$be_connected_to_);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                                SubLObject key_string = html_arghash.arghash_make_key_string((SubLObject)cb_rtv.$kw26$TERM2_TYPE, (SubLObject)cb_rtv.$kw61$KEYWORD);
                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup(key_string);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_rtv.$str62$onChange_javascript_this_form_sub);
                                if (cb_rtv.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                    SubLObject selected = list_utilities.member_equalP((SubLObject)cb_rtv.$kw27$INDIVIDUAL, html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash));
                                    SubLObject value_string = html_arghash.arghash_get_string((SubLObject)cb_rtv.$kw27$INDIVIDUAL, (SubLObject)cb_rtv.$kw63$DEFAULT);
                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (cb_rtv.NIL != selected) {
                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (cb_rtv.NIL != value_string) {
                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                        html_utilities.html_markup(value_string);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_rtv.$str64$the_individual_named);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    selected = list_utilities.member_equalP((SubLObject)cb_rtv.$kw29$ISA, html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash));
                                    value_string = html_arghash.arghash_get_string((SubLObject)cb_rtv.$kw29$ISA, (SubLObject)cb_rtv.$kw63$DEFAULT);
                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (cb_rtv.NIL != selected) {
                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (cb_rtv.NIL != value_string) {
                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                        html_utilities.html_markup(value_string);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_rtv.$str65$any);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    selected = list_utilities.member_equalP((SubLObject)cb_rtv.$kw30$GENL, html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash));
                                    value_string = html_arghash.arghash_get_string((SubLObject)cb_rtv.$kw30$GENL, (SubLObject)cb_rtv.$kw63$DEFAULT);
                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (cb_rtv.NIL != selected) {
                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (cb_rtv.NIL != value_string) {
                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                        html_utilities.html_markup(value_string);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_rtv.$str66$any_type_of);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                if (html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash) == cb_rtv.$kw27$INDIVIDUAL) {
                                    html_arghash.html_arghash_nl_fort_input(arghash, (SubLObject)cb_rtv.$kw28$TERM2, debug, generation_fn, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                                    html_arghash.html_arghash_hidden_input(arghash, (SubLObject)cb_rtv.$kw33$TERM2_VARIABLE_TYPE, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                                }
                                else {
                                    key_string = html_arghash.arghash_make_key_string((SubLObject)cb_rtv.$kw33$TERM2_VARIABLE_TYPE, (SubLObject)cb_rtv.$kw67$FORT);
                                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                    html_utilities.html_markup(key_string);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                    if (cb_rtv.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                        SubLObject cdolist_list_var2 = cb_rtv.$cb_rtv_collections$.getDynamicValue(thread);
                                        SubLObject any_type = (SubLObject)cb_rtv.NIL;
                                        any_type = cdolist_list_var2.first();
                                        while (cb_rtv.NIL != cdolist_list_var2) {
                                            final SubLObject selected2 = list_utilities.member_equalP(any_type, html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw33$TERM2_VARIABLE_TYPE, arghash));
                                            final SubLObject value_string2 = html_arghash.arghash_get_string(any_type, (SubLObject)cb_rtv.$kw63$DEFAULT);
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            if (cb_rtv.NIL != selected2) {
                                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                            }
                                            if (cb_rtv.NIL != value_string2) {
                                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                                html_utilities.html_markup(value_string2);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                            }
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                                html_utilities.html_princ(Functions.funcall(generation_fn, any_type));
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            any_type = cdolist_list_var2.first();
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_rtv.$str68$___);
                                    html_arghash.html_arghash_nl_fort_input(arghash, (SubLObject)cb_rtv.$kw31$TERM2_ADD_TYPE, (SubLObject)cb_rtv.NIL, generation_fn, (SubLObject)cb_rtv.NIL, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                                    html_arghash.html_arghash_nl_fort_input_invisible(arghash, (SubLObject)cb_rtv.$kw28$TERM2);
                                }
                                html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_rtv.$str69$by_at_most);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                                html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_rtv.$kw47$DEPTH, (SubLObject)cb_rtv.TWO_INTEGER, (SubLObject)cb_rtv.THREE_INTEGER, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_rtv.$str70$links_using_);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                key_string = html_arghash.arghash_make_key_string((SubLObject)cb_rtv.$kw42$GENL_PRED_REASONING, (SubLObject)cb_rtv.$kw61$KEYWORD);
                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup(key_string);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_rtv.$str62$onChange_javascript_this_form_sub);
                                if (cb_rtv.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                    SubLObject selected = list_utilities.member_equalP((SubLObject)cb_rtv.$kw41$ON, html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw42$GENL_PRED_REASONING, arghash));
                                    SubLObject value_string = html_arghash.arghash_get_string((SubLObject)cb_rtv.$kw41$ON, (SubLObject)cb_rtv.$kw63$DEFAULT);
                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (cb_rtv.NIL != selected) {
                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (cb_rtv.NIL != value_string) {
                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                        html_utilities.html_markup(value_string);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_rtv.$str71$_the_selected_relations_and_their);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                    selected = list_utilities.member_equalP((SubLObject)cb_rtv.$kw72$OFF, html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw42$GENL_PRED_REASONING, arghash));
                                    value_string = html_arghash.arghash_get_string((SubLObject)cb_rtv.$kw72$OFF, (SubLObject)cb_rtv.$kw63$DEFAULT);
                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                    if (cb_rtv.NIL != selected) {
                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    if (cb_rtv.NIL != value_string) {
                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                        html_utilities.html_markup(value_string);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_rtv.$str73$_only_the_selected_relations_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_rtv.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_rtv.FIVE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_rtv.ZERO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_rtv.$kw74$CENTER));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                            if (cb_rtv.NIL == html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw40$PREDICATES, arghash)) {
                                                final SubLObject color = html_utilities.html_color((SubLObject)cb_rtv.$kw75$RED);
                                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                if (cb_rtv.NIL != color) {
                                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_color(color));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                                }
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                                    html_utilities.html_princ((SubLObject)cb_rtv.$str76$_);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                                }
                                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                            }
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                            final SubLObject key_string2 = html_arghash.arghash_make_key_string((SubLObject)cb_rtv.$kw40$PREDICATES, (SubLObject)cb_rtv.$kw67$FORT);
                                            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                            html_utilities.html_markup(key_string2);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                            html_utilities.html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                            html_utilities.html_markup((SubLObject)cb_rtv.FIFTEEN_INTEGER);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                            if (cb_rtv.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                            }
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                                SubLObject cdolist_list_var3 = cb_rtv.$cb_rtv_predicates$.getDynamicValue(thread);
                                                SubLObject pred = (SubLObject)cb_rtv.NIL;
                                                pred = cdolist_list_var3.first();
                                                while (cb_rtv.NIL != cdolist_list_var3) {
                                                    final SubLObject selected3 = list_utilities.member_equalP(pred, html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw40$PREDICATES, arghash));
                                                    final SubLObject value_string3 = html_arghash.arghash_get_string(pred, (SubLObject)cb_rtv.$kw63$DEFAULT);
                                                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                                    if (cb_rtv.NIL != selected3) {
                                                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                                                    }
                                                    if (cb_rtv.NIL != value_string3) {
                                                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                                        html_utilities.html_markup(value_string3);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                                                    }
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                                        html_utilities.html_princ(Functions.funcall(generation_fn, pred));
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                                    pred = cdolist_list_var3.first();
                                                }
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                            html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                                            html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                            html_arghash.html_arghash_nl_fort_input(arghash, (SubLObject)cb_rtv.$kw37$NEW_PRED, debug, generation_fn, (SubLObject)cb_rtv.NIL, cb_rtv.$const38$Predicate, (SubLObject)cb_rtv.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_rtv.TWO_INTEGER);
                                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_rtv.$str77$________Add_New_Relation, (SubLObject)cb_rtv.$kw78$ADD_PRED, (SubLObject)cb_rtv.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_rtv.TWO_INTEGER);
                                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_rtv.$str79$_____Remove_Selected_Relations, (SubLObject)cb_rtv.$kw39$REMOVE_PREDS, (SubLObject)cb_rtv.UNPROVIDED);
                                            html_utilities.html_newline((SubLObject)cb_rtv.TWO_INTEGER);
                                            if (cb_rtv.ONE_INTEGER.numL(Sequences.length(pred_set)) && cb_rtv.NIL != fort_types_interface.microtheory_p(mt)) {
                                                html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                                                cb_utilities.cb_link((SubLObject)cb_rtv.$kw80$RTV_PREDICATE_GRAPH_EVENT, (SubLObject)cb_rtv.$str81$_Visualize_Selected_Relations_, (SubLObject)ConsesLow.list(pred_set, mt), (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                                            }
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_rtv.$str82$in_the_context_);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_arghash.html_arghash_nl_fort_input(arghash, (SubLObject)cb_rtv.$kw19$MT, debug, generation_fn, (SubLObject)cb_rtv.T, cb_rtv.$const43$Microtheory, (SubLObject)cb_rtv.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                        cb_rtv_submit_buttons(arghash, cb_rtv_query_readyP);
                        html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                        if (cb_rtv.NIL != html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw52$ASK_FORMULA, arghash)) {
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtv.$str83$Current_query_formula____A, html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw52$ASK_FORMULA, arghash));
                            html_utilities.html_newline((SubLObject)cb_rtv.TWO_INTEGER);
                        }
                        if (cb_rtv.NIL != running_query_nowP) {
                            final SubLObject ask_formula_$24 = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw52$ASK_FORMULA, arghash);
                            final SubLObject mt_$25 = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw19$MT, arghash);
                            assert cb_rtv.NIL != Types.booleanp(genl_preds_reasoning_enabledP) : genl_preds_reasoning_enabledP;
                            final SubLObject _prev_bind_0_$24 = ghl_search_vars.$ghl_uses_spec_preds_p$.currentBinding(thread);
                            try {
                                ghl_search_vars.$ghl_uses_spec_preds_p$.bind(genl_preds_reasoning_enabledP, thread);
                                cb_rtv_show_query_results(ask_formula_$24, mt_$25, arghash);
                            }
                            finally {
                                ghl_search_vars.$ghl_uses_spec_preds_p$.rebind(_prev_bind_0_$24, thread);
                            }
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 12916L)
    public static SubLObject cb_rtv_submit_buttons(final SubLObject arghash, final SubLObject cb_rtv_query_readyP) {
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_rtv.$str87$Update, (SubLObject)cb_rtv.$kw88$UPDATE, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
        if (cb_rtv.NIL != cb_rtv_query_readyP) {
            html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
            html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_rtv.$str89$Run_This_Query, (SubLObject)cb_rtv.$kw56$RUN_QUERY, (SubLObject)cb_rtv.UNPROVIDED);
        }
        html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
        html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_rtv.$str90$Reset_Completely, (SubLObject)cb_rtv.$kw20$RESET, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 13325L)
    public static SubLObject cb_rtv_query_readyP(final SubLObject arghash) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_rtv.NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, (SubLObject)cb_rtv.$kw24$TERM1) && (cb_rtv.NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, (SubLObject)cb_rtv.$kw28$TERM2) || cb_rtv.NIL != conses_high.member(html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash), (SubLObject)cb_rtv.$list44, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED)) && cb_rtv.NIL != html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw40$PREDICATES, arghash) && cb_rtv.NIL != html_arghash.html_arghash_nl_fort_input_doneP(arghash, (SubLObject)cb_rtv.$kw19$MT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 13713L)
    public static SubLObject cb_rtv_show_query_results(final SubLObject ask_formula, final SubLObject mt, SubLObject arghash) {
        if (arghash == cb_rtv.UNPROVIDED) {
            arghash = (SubLObject)cb_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_rtv.$cb_rtv_ask_results$.setDynamicValue(dictionary.new_dictionary((SubLObject)cb_rtv.EQUAL, (SubLObject)cb_rtv.UNPROVIDED), thread);
        final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)cb_rtv.NIL, thread);
            final SubLObject results = ask_utilities.ask_justified(ask_formula, mt, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
            html_utilities.html_hr((SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
            if (cb_rtv.NIL == results) {
                html_utilities.html_princ((SubLObject)cb_rtv.$str91$No_answers_found_);
            }
            else {
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtv.$str92$Query_Results);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_rtv.TWO_INTEGER);
                if (cb_rtv.NIL != html_arghash.arghash_p(arghash)) {
                    if (html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, arghash) == cb_rtv.$kw27$INDIVIDUAL) {
                        cb_utilities.cb_link((SubLObject)cb_rtv.$kw93$RTV_GRAPH_EVENT, (SubLObject)cb_rtv.$str94$_Visualize_below_justification_, arghash, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                        cb_utilities.cb_link((SubLObject)cb_rtv.$kw93$RTV_GRAPH_EVENT, (SubLObject)cb_rtv.$str95$_Visualize_more_justifications_, arghash, (SubLObject)cb_rtv.$kw96$EXPANDED_NODE_TO_NODE, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                    }
                    else {
                        final SubLObject safe_arghash = html_arghash.copy_arghash(arghash);
                        html_arghash.rem_arghash_value((SubLObject)cb_rtv.$kw28$TERM2, safe_arghash);
                        cb_utilities.cb_link((SubLObject)cb_rtv.$kw93$RTV_GRAPH_EVENT, (SubLObject)cb_rtv.$str97$_Visualize_justifications_of_all_, safe_arghash, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                    }
                    html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                    SubLObject list_var = (SubLObject)cb_rtv.NIL;
                    SubLObject v_answer = (SubLObject)cb_rtv.NIL;
                    SubLObject answer_num = (SubLObject)cb_rtv.NIL;
                    list_var = results;
                    v_answer = list_var.first();
                    for (answer_num = (SubLObject)cb_rtv.ZERO_INTEGER; cb_rtv.NIL != list_var; list_var = list_var.rest(), v_answer = list_var.first(), answer_num = Numbers.add((SubLObject)cb_rtv.ONE_INTEGER, answer_num)) {
                        SubLObject current;
                        final SubLObject datum = current = v_answer;
                        SubLObject v_bindings = (SubLObject)cb_rtv.NIL;
                        SubLObject justification = (SubLObject)cb_rtv.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_rtv.$list98);
                        v_bindings = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_rtv.$list98);
                        justification = current.first();
                        current = current.rest();
                        if (cb_rtv.NIL == current) {
                            final SubLObject v_term = bindings.variable_binding_value(v_bindings.first());
                            final SubLObject boolean_queryP = cyc_kernel.closed_query_bindings_p(v_bindings);
                            html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                                dictionary.dictionary_enter(cb_rtv.$cb_rtv_ask_results$.getDynamicValue(thread), v_term, justification);
                                if (cb_rtv.NIL != boolean_queryP) {
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_rtv.$str99$True__);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                else {
                                    final SubLObject pcase_var = control_vars.$cb_major_presentation_language$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)cb_rtv.$kw7$NL)) {
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_markup(pph_html.html_generate_phrase(v_term, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED));
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    else {
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        cb_utilities.cb_form(v_term, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                                    cb_utilities.cb_link((SubLObject)cb_rtv.$kw100$RTV_JUSTIFY_TERM, (SubLObject)cb_rtv.$str101$_Explain_, v_term, justification, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                                    if (cb_rtv.NIL != html_arghash.arghash_p(arghash)) {
                                        html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                                        final SubLObject safe_arghash2 = html_arghash.copy_arghash(arghash);
                                        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw28$TERM2, safe_arghash2, v_term);
                                        cb_utilities.cb_link((SubLObject)cb_rtv.$kw93$RTV_GRAPH_EVENT, (SubLObject)cb_rtv.$str102$_Visualize_, safe_arghash2, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                                    }
                                }
                                html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                                if (cb_rtv.NIL != boolean_queryP) {
                                    cb_rtv_show_argument(justification, PrintLow.write_to_string(answer_num, cb_rtv.EMPTY_SUBL_OBJECT_ARRAY));
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_rtv.$list98);
                        }
                        html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
        }
        finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 15826L)
    public static SubLObject cb_rtv_justify_term(final SubLObject args) {
        cb_rtv_justify_term_open_window(args);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 16382L)
    public static SubLObject cb_rtv_justify_term_open_window(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        final SubLObject v_term = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw104$TERM, arghash);
        final SubLObject term_string = Functions.funcall(cb_rtv_fort_generation_fn(), v_term);
        final SubLObject justification = dictionary.dictionary_lookup(cb_rtv.$cb_rtv_ask_results$.getDynamicValue(thread), v_term, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject title_var = term_string;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_rtv.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_rtv.$str21$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_rtv.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_rtv.$str22$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
            final SubLObject _prev_bind_0_$29 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_rtv.$kw23$UNINITIALIZED) ? ConsesLow.list(cb_rtv.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_rtv.$kw105$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_rtv.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_rtv.$kw106$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                final SubLObject _prev_bind_0_$30 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_rtv.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_rtv.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_rtv.$str108$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtv.$str109$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtv.$str110$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_rtv.$str111$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_rtv.$str112$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                            if (cb_rtv.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_rtv.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtv.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_rtv.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        }
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        dhtml_macros.dhtml_with_dom_script();
                        cb_rtv_show_argument(justification, (SubLObject)cb_rtv.$str113$1);
                        html_utilities.html_newline((SubLObject)cb_rtv.TWO_INTEGER);
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_script_utilities.html_kill_window_button((SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$30, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$29, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 16932L)
    public static SubLObject cb_link_rtv_justify_term(final SubLObject linktext, final SubLObject v_term) {
        final SubLObject arghash = html_arghash.new_arghash((SubLObject)cb_rtv.UNPROVIDED);
        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw115$SIGNATURE, arghash, (SubLObject)cb_rtv.$str116$justify_me);
        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw104$TERM, arghash, v_term);
        cb_rtv_justify_open_window_link(arghash, linktext, (SubLObject)cb_rtv.$str117$cb_rtv_justify_term);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 17214L)
    public static SubLObject cb_rtv_justify_open_window_link(final SubLObject arghash, final SubLObject linktext, SubLObject handler) {
        if (handler == cb_rtv.UNPROVIDED) {
            handler = (SubLObject)cb_rtv.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject frame_name_var = (SubLObject)((cb_rtv.NIL != html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw115$SIGNATURE, arghash)) ? cb_utilities.cb_frame_name(html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw115$SIGNATURE, arghash)) : cb_rtv.NIL);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ(html_arghash.html_arghash_href(arghash, handler));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        if (cb_rtv.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtv.$str119$window_open__);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ(html_arghash.html_arghash_href(arghash, handler));
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtv.$str120$__);
        if (cb_rtv.NIL != html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw115$SIGNATURE, arghash)) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtv.$str121$__A_, html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw115$SIGNATURE, arghash));
        }
        else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtv.$str122$null);
        }
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtv.$str123$___A____, (SubLObject)cb_rtv.$str124$dependent_yes_height_360_width_64);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtv.$str125$return_false_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 18007L)
    public static SubLObject rtv_hl_justify(final SubLObject support) {
        return hl_supports.hl_justify(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 18159L)
    public static SubLObject cb_rtv_indented_table_data(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$sym126$HTML_TABLE_ROW, (SubLObject)cb_rtv.$list127, reader.bq_cons((SubLObject)cb_rtv.$sym128$HTML_TABLE_DATA, ConsesLow.append(body, (SubLObject)cb_rtv.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 18397L)
    public static SubLObject cb_rtv_meta_supports_to_show(final SubLObject support) {
        final SubLObject all_meta_supports = rtv_hl_justify(support);
        final SubLObject support_formula = arguments.support_formula(support);
        SubLObject ans = (SubLObject)cb_rtv.NIL;
        SubLObject cdolist_list_var = all_meta_supports;
        SubLObject meta_support = (SubLObject)cb_rtv.NIL;
        meta_support = cdolist_list_var.first();
        while (cb_rtv.NIL != cdolist_list_var) {
            if (!arguments.support_formula(meta_support).equal(support_formula)) {
                ans = (SubLObject)ConsesLow.cons(meta_support, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_support = cdolist_list_var.first();
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 18811L)
    public static SubLObject cb_rtv_maybe_show_meta_supports(final SubLObject meta_supports, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject object_id = Sequences.cconcatenate((SubLObject)cb_rtv.$str129$meta_supports_, index_string);
        html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
        html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_rtv.$str130$text_css);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_rtv.$str131$screen);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
            html_utilities.html_terpri((SubLObject)cb_rtv.UNPROVIDED);
            dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
            dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_rtv.$str132$none);
            dhtml_macros.dhtml_dom_attribute_postamble();
            dhtml_macros.dhtml_dom_wrapper_postamble();
            html_utilities.html_terpri((SubLObject)cb_rtv.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
        html_utilities.html_terpri((SubLObject)cb_rtv.UNPROVIDED);
        dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, (SubLObject)cb_rtv.$str133$);
        dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)cb_rtv.$kw134$INVISIBLE, (SubLObject)cb_rtv.$kw135$TEXT);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (cb_rtv.NIL != object_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
            html_utilities.html_markup(object_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                SubLObject list_var = (SubLObject)cb_rtv.NIL;
                SubLObject support = (SubLObject)cb_rtv.NIL;
                SubLObject support_num = (SubLObject)cb_rtv.NIL;
                list_var = meta_supports;
                support = list_var.first();
                for (support_num = (SubLObject)cb_rtv.ZERO_INTEGER; cb_rtv.NIL != list_var; list_var = list_var.rest(), support = list_var.first(), support_num = Numbers.add((SubLObject)cb_rtv.ONE_INTEGER, support_num)) {
                    final SubLObject support_index_string = PrintLow.format((SubLObject)cb_rtv.NIL, (SubLObject)cb_rtv.$str136$_A_meta__D, index_string, support_num);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                            html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                            cb_rtv_show_support(support, support_index_string);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 19483L)
    public static SubLObject cb_rtv_show_support(final SubLObject support, SubLObject index_string) {
        if (index_string == cb_rtv.UNPROVIDED) {
            index_string = (SubLObject)cb_rtv.$str137$support;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_rtv.NIL != assertion_handles.assertion_p(support)) {
            cb_rtv_show_support_readably(support, (SubLObject)cb_rtv.UNPROVIDED);
        }
        else if (cb_rtv.NIL != arguments.hl_support_p(support)) {
            final SubLObject formula = arguments.support_sentence(support);
            final SubLObject meta_supports = (SubLObject)(cb_rtv.$cb_rtv_meta_support_level$.getDynamicValue(thread).numL(cb_rtv.$cb_rtv_meta_support_max$.getGlobalValue()) ? cb_rtv_meta_supports_to_show(support) : cb_rtv.NIL);
            cb_rtv_show_support_readably(formula, arguments.support_mt(support));
            if (cb_rtv.NIL != meta_supports) {
                final SubLObject _prev_bind_0 = cb_rtv.$cb_rtv_meta_support_level$.currentBinding(thread);
                try {
                    cb_rtv.$cb_rtv_meta_support_level$.bind(number_utilities.f_1X(cb_rtv.$cb_rtv_meta_support_level$.getDynamicValue(thread)), thread);
                    cb_rtv_maybe_show_meta_supports(meta_supports, index_string);
                }
                finally {
                    cb_rtv.$cb_rtv_meta_support_level$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 20167L)
    public static SubLObject cb_rtv_show_support_readably(final SubLObject support, SubLObject mt) {
        if (mt == cb_rtv.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_rtv.NIL != assertion_handles.assertion_p(support)) {
            cb_utilities.cb_show_assertion_readably(support, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_rtv.NIL);
            return (SubLObject)cb_rtv.NIL;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_rtv.$sym15$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_rtv.$const16$EverythingPSC, thread);
            final SubLObject assertion = czer_meta.find_assertion_cycl(support, (SubLObject)cb_rtv.UNPROVIDED);
            if (cb_rtv.NIL != assertion) {
                cb_utilities.cb_show_assertion_readably(assertion, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_rtv.NIL);
            }
            else {
                cb_sentence_browser.cb_show_sentence_readably(support, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_rtv.NIL, (SubLObject)cb_rtv.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 20672L)
    public static SubLObject cb_rtv_maybe_show_additional_supports(final SubLObject supports, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject object_id = Sequences.cconcatenate((SubLObject)cb_rtv.$str138$additional_supports_, index_string);
        html_utilities.html_markup(dhtml_macros.$dhtml_css_head$.getGlobalValue());
        html_utilities.html_markup(dhtml_macros.$dhtml_css_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_rtv.$str130$text_css);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_markup(dhtml_macros.$dhtml_css_media$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_rtv.$str131$screen);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
            html_utilities.html_terpri((SubLObject)cb_rtv.UNPROVIDED);
            dhtml_macros.dhtml_dom_wrapper_preamble(object_id);
            dhtml_macros.dhtml_dom_attribute_preamble(dhtml_macros.$dhtml_dom_display$.getGlobalValue());
            html_utilities.html_markup((SubLObject)cb_rtv.$str132$none);
            dhtml_macros.dhtml_dom_attribute_postamble();
            dhtml_macros.dhtml_dom_wrapper_postamble();
            html_utilities.html_terpri((SubLObject)cb_rtv.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(dhtml_macros.$dhtml_css_tail$.getGlobalValue());
        html_utilities.html_terpri((SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_rtv.UNPROVIDED);
        dhtml_macros.dhtml_switch_visibility_links_arrows(object_id, (SubLObject)cb_rtv.$str139$Additional_Supports);
        dhtml_macros.dhtml_set_switched_visibility(object_id, (SubLObject)cb_rtv.$kw140$VISIBLE, (SubLObject)cb_rtv.$kw135$TEXT);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (cb_rtv.NIL != object_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
            html_utilities.html_markup(object_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                SubLObject list_var = (SubLObject)cb_rtv.NIL;
                SubLObject support = (SubLObject)cb_rtv.NIL;
                SubLObject support_num = (SubLObject)cb_rtv.NIL;
                list_var = supports;
                support = list_var.first();
                for (support_num = (SubLObject)cb_rtv.ZERO_INTEGER; cb_rtv.NIL != list_var; list_var = list_var.rest(), support = list_var.first(), support_num = Numbers.add((SubLObject)cb_rtv.ONE_INTEGER, support_num)) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                    final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                            html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                            final SubLObject support_index_string = PrintLow.format((SubLObject)cb_rtv.NIL, (SubLObject)cb_rtv.$str141$_A_additional__D, index_string, support_num);
                            cb_rtv_show_support(support, support_index_string);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 21406L)
    public static SubLObject cb_rtv_show_argument(final SubLObject argument, final SubLObject index_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_rtv.NIL != list_utilities.singletonP(argument)) {
            cb_rtv_show_support(argument.first(), index_string);
        }
        else {
            SubLObject additional_supports = (SubLObject)cb_rtv.NIL;
            SubLObject new_argument = (SubLObject)cb_rtv.NIL;
            SubLObject cdolist_list_var = argument;
            SubLObject support = (SubLObject)cb_rtv.NIL;
            support = cdolist_list_var.first();
            while (cb_rtv.NIL != cdolist_list_var) {
                if (cb_rtv.NIL != rkf_argument_communicator.rkf_irrelevant_support_p(support)) {
                    additional_supports = (SubLObject)ConsesLow.cons(support, additional_supports);
                }
                else {
                    new_argument = Sequences.cconcatenate(new_argument, (SubLObject)ConsesLow.list(support));
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                SubLObject list_var = (SubLObject)cb_rtv.NIL;
                SubLObject support2 = (SubLObject)cb_rtv.NIL;
                SubLObject support_num = (SubLObject)cb_rtv.NIL;
                list_var = new_argument;
                support2 = list_var.first();
                for (support_num = (SubLObject)cb_rtv.ZERO_INTEGER; cb_rtv.NIL != list_var; list_var = list_var.rest(), support2 = list_var.first(), support_num = Numbers.add((SubLObject)cb_rtv.ONE_INTEGER, support_num)) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                            html_utilities.html_glyph((SubLObject)cb_rtv.$kw59$NBSP, (SubLObject)cb_rtv.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                            final SubLObject support_index_string = PrintLow.format((SubLObject)cb_rtv.NIL, (SubLObject)cb_rtv.$str142$_A__D, index_string, support_num);
                            cb_rtv_show_support(support2, support_index_string);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            if (cb_rtv.NIL != additional_supports) {
                cb_rtv_maybe_show_additional_supports(additional_supports, index_string);
            }
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 22474L)
    public static SubLObject cb_rtv_show_arguments(final SubLObject v_arguments, SubLObject type, SubLObject show_separatorP) {
        if (type == cb_rtv.UNPROVIDED) {
            type = (SubLObject)cb_rtv.NIL;
        }
        if (show_separatorP == cb_rtv.UNPROVIDED) {
            show_separatorP = (SubLObject)cb_rtv.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_rtv.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
            SubLObject list_var = (SubLObject)cb_rtv.NIL;
            SubLObject argument = (SubLObject)cb_rtv.NIL;
            SubLObject index = (SubLObject)cb_rtv.NIL;
            list_var = v_arguments;
            argument = list_var.first();
            for (index = (SubLObject)cb_rtv.ZERO_INTEGER; cb_rtv.NIL != list_var; list_var = list_var.rest(), argument = list_var.first(), index = Numbers.add((SubLObject)cb_rtv.ONE_INTEGER, index)) {
                final SubLObject prefix_string = (SubLObject)((cb_rtv.NIL != type) ? PrintLow.format((SubLObject)cb_rtv.NIL, (SubLObject)cb_rtv.$str143$_A_, type) : cb_rtv.$str133$);
                final SubLObject index_string = PrintLow.format((SubLObject)cb_rtv.NIL, (SubLObject)cb_rtv.$str144$_A_D, prefix_string, index);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_rtv.$kw145$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                    final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_rtv.$str146$_S_, number_utilities.f_1X(index));
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                        cb_rtv_show_argument(argument, index_string);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                if (cb_rtv.NIL != list_utilities.lengthG(v_arguments, index, (SubLObject)cb_rtv.UNPROVIDED) && cb_rtv.NIL != show_separatorP) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                    final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_rtv.TWO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_rtv.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_rtv.UNPROVIDED);
                        final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_rtv.T, thread);
                            html_utilities.html_hr((SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_rtv.UNPROVIDED);
                }
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23241L)
    public static SubLObject rtv_supportP(final SubLObject support) {
        if (support.first() == cb_rtv.$kw147$RTV) {
            return (SubLObject)cb_rtv.T;
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject cb_link_rtv_graph_event(final SubLObject linktext, final SubLObject arghash, SubLObject graph_type) {
        if (graph_type == cb_rtv.UNPROVIDED) {
            graph_type = (SubLObject)cb_rtv.NIL;
        }
        final SubLObject safe_arghash = html_arghash.copy_arghash(arghash);
        html_arghash.set_arghash_value_list((SubLObject)cb_rtv.$kw149$FORTS, safe_arghash, (SubLObject)ConsesLow.list(html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw24$TERM1, safe_arghash), html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw28$TERM2, safe_arghash)));
        html_arghash.set_arghash_value_list((SubLObject)cb_rtv.$kw150$PREDS, safe_arghash, html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw40$PREDICATES, safe_arghash));
        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw151$FILTER_PRED, safe_arghash, (SubLObject)((cb_rtv.$kw29$ISA == html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, safe_arghash)) ? cb_rtv.$const49$isa : ((cb_rtv.$kw152$GENLS == html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw26$TERM2_TYPE, safe_arghash)) ? cb_rtv.$const35$genls : cb_rtv.NIL)));
        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw153$FILTER_FORT, safe_arghash, html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw33$TERM2_VARIABLE_TYPE, safe_arghash));
        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw154$GRAPH_TYPE, safe_arghash, graph_type);
        html_arghash.rem_arghash_values_inverse(cb_rtv.$cb_rtv_graph_keys$.getGlobalValue(), safe_arghash);
        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw115$SIGNATURE, safe_arghash, PrintLow.format((SubLObject)cb_rtv.NIL, (SubLObject)cb_rtv.$str155$_A, random.random(Numbers.expt((SubLObject)cb_rtv.TWO_INTEGER, (SubLObject)cb_rtv.$int156$30))));
        cb_blue_grapher.cb_blue_applet_window_link(safe_arghash, linktext, (SubLObject)cb_rtv.$str157$cb_rtv_graph_event);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject cb_rtv_graph_event(final SubLObject args) {
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        cb_blue_grapher.cb_blue_applet_window_internal(arghash);
        subl_promotions.make_process_with_args((SubLObject)cb_rtv.$str157$cb_rtv_graph_event, Symbols.symbol_function((SubLObject)cb_rtv.$sym159$CB_RTV_GRAPH_EVENT_PROCESS), (SubLObject)ConsesLow.list(arghash));
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject cb_rtv_graph_event_process(final SubLObject arghash) {
        final SubLObject ask_formula = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw52$ASK_FORMULA, arghash);
        final SubLObject mt = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw19$MT, arghash);
        final SubLObject v_forts = html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw149$FORTS, arghash);
        final SubLObject preds = html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw150$PREDS, arghash);
        final SubLObject depth = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw47$DEPTH, arghash);
        final SubLObject filter_pred = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw151$FILTER_PRED, arghash);
        final SubLObject filter_fort = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw153$FILTER_FORT, arghash);
        final SubLObject signature = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw115$SIGNATURE, arghash);
        final SubLObject graph_type = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw154$GRAPH_TYPE, arghash);
        final SubLObject arg1 = v_forts.first();
        final SubLObject arg2 = conses_high.second(v_forts);
        if (cb_rtv.NIL != forts.fort_p(arg2)) {
            blue_grapher_utilities.blue_event(signature, (SubLObject)ConsesLow.list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), (SubLObject)ConsesLow.list(new SubLObject[] { cb_rtv.$kw161$BUILDER_FN, cb_rtv.$sym162$BBF_RTV_ALL_EDGES_BETWEEN, cb_rtv.$kw149$FORTS, ConsesLow.list(arg1, arg2), cb_rtv.$kw150$PREDS, preds, cb_rtv.$kw47$DEPTH, depth, cb_rtv.$kw19$MT, mt, cb_rtv.$kw154$GRAPH_TYPE, graph_type })));
        }
        else {
            blue_grapher_utilities.blue_event(signature, (SubLObject)ConsesLow.list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$kw161$BUILDER_FN, (SubLObject)cb_rtv.$sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, (SubLObject)cb_rtv.$kw164$PARAMS, (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$kw165$FORMULA, ask_formula), (SubLObject)cb_rtv.$kw19$MT, mt, (SubLObject)cb_rtv.$kw154$GRAPH_TYPE, graph_type)));
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject bbf_rtv_all_edges_between(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_forts = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw149$FORTS, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject preds = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw150$PREDS, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject depth = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw47$DEPTH, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject mt = (cb_rtv.NIL != conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw19$MT, (SubLObject)cb_rtv.UNPROVIDED)) ? conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw19$MT, (SubLObject)cb_rtv.UNPROVIDED) : cb_rtv.$rtv_default_query_mt$.getGlobalValue();
        final SubLObject graph_type = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw154$GRAPH_TYPE, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject cdolist_list_var = list_utilities.pick_two(v_forts);
        SubLObject fort_pair = (SubLObject)cb_rtv.NIL;
        fort_pair = cdolist_list_var.first();
        if (cb_rtv.NIL != cdolist_list_var) {
            final SubLObject fort1 = fort_pair.first();
            final SubLObject fort2 = conses_high.second(fort_pair);
            SubLObject just_assertions = (SubLObject)cb_rtv.NIL;
            SubLObject result_links = (SubLObject)cb_rtv.NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (graph_type == cb_rtv.$kw96$EXPANDED_NODE_TO_NODE) {
                    just_assertions = Sequences.remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_node(fort1, fort2, preds, depth, (SubLObject)cb_rtv.UNPROVIDED), (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
                }
                else {
                    just_assertions = removal_modules_rtv.inference_rtv_justify((SubLObject)ConsesLow.list(cb_rtv.$const48$relatedToVia, fort1, fort2, reader.bq_cons(cb_rtv.$const46$TheSet, ConsesLow.append(preds, (SubLObject)cb_rtv.NIL)), depth), (SubLObject)cb_rtv.UNPROVIDED);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var_$49 = just_assertions;
            SubLObject just_assertion = (SubLObject)cb_rtv.NIL;
            just_assertion = cdolist_list_var_$49.first();
            while (cb_rtv.NIL != cdolist_list_var_$49) {
                if (cb_rtv.NIL != assertion_handles.assertion_p(just_assertion) && cb_rtv.NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)), cb_rtv.$const167$genlPreds)) {
                    result_links = (SubLObject)ConsesLow.cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
                }
                cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                just_assertion = cdolist_list_var_$49.first();
            }
            return blue_grapher_utilities.bbf_make_graph((SubLObject)cb_rtv.NIL, list_utilities.hash_remove_duplicates(result_links, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$kw19$MT, mt));
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject bbf_rtv_all_edges_from_node(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_forts = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw149$FORTS, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject preds = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw150$PREDS, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject depth = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw47$DEPTH, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw19$MT, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject filter_pred = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw151$FILTER_PRED, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject filter_fort = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw153$FILTER_FORT, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject fort1 = v_forts.first();
        final SubLObject test_formula = (SubLObject)((cb_rtv.NIL != forts.fort_p(filter_pred) && cb_rtv.NIL != forts.fort_p(filter_fort)) ? ConsesLow.list(filter_pred, (SubLObject)cb_rtv.$sym45$_ANY, filter_fort) : cb_rtv.$list170);
        SubLObject just_assertions = (SubLObject)cb_rtv.NIL;
        SubLObject result_links = (SubLObject)cb_rtv.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            just_assertions = Sequences.remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort1, test_formula, preds, depth, (SubLObject)cb_rtv.UNPROVIDED), Symbols.symbol_function((SubLObject)cb_rtv.EQUAL), Symbols.symbol_function((SubLObject)cb_rtv.$sym171$ASSERTION_FORMULA), (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = just_assertions;
        SubLObject just_assertion = (SubLObject)cb_rtv.NIL;
        just_assertion = cdolist_list_var.first();
        while (cb_rtv.NIL != cdolist_list_var) {
            if (cb_rtv.NIL != assertion_handles.assertion_p(just_assertion) && cb_rtv.NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)), cb_rtv.$const167$genlPreds)) {
                result_links = (SubLObject)ConsesLow.cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just_assertion = cdolist_list_var.first();
        }
        return blue_grapher_utilities.bbf_make_graph((SubLObject)cb_rtv.NIL, list_utilities.hash_remove_duplicates(result_links, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$kw19$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject bbf_rtv_all_edges_from_node_satisfying(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject params = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw164$PARAMS, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject formula = conses_high.getf(params, (SubLObject)cb_rtv.$kw165$FORMULA, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw19$MT, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject rtv_clause = list_utilities.tree_find_if((SubLObject)cb_rtv.$sym173$RTV_CLAUSE_P, formula, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject fort = (cb_rtv.NIL != forts.fort_p(cycl_utilities.formula_arg1(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED))) ? cycl_utilities.formula_arg1(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED) : cycl_utilities.formula_arg2(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject preds = el_utilities.el_extensional_set_elements(cycl_utilities.formula_arg3(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED));
        final SubLObject depth = cycl_utilities.formula_arg4(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED);
        SubLObject just_assertions = (SubLObject)cb_rtv.NIL;
        SubLObject result_links = (SubLObject)cb_rtv.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            just_assertions = Sequences.remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort, formula, preds, depth, mt), Symbols.symbol_function((SubLObject)cb_rtv.EQUAL), Symbols.symbol_function((SubLObject)cb_rtv.$sym171$ASSERTION_FORMULA), (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = just_assertions;
        SubLObject just_assertion = (SubLObject)cb_rtv.NIL;
        just_assertion = cdolist_list_var.first();
        while (cb_rtv.NIL != cdolist_list_var) {
            if (cb_rtv.NIL != assertion_handles.assertion_p(just_assertion) && cb_rtv.NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)), cb_rtv.$const167$genlPreds)) {
                result_links = (SubLObject)ConsesLow.cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just_assertion = cdolist_list_var.first();
        }
        return blue_grapher_utilities.bbf_make_graph((SubLObject)cb_rtv.NIL, list_utilities.hash_remove_duplicates(result_links, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$kw19$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject bbf_rtv(final SubLObject arg_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject params = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw164$PARAMS, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject formula = conses_high.getf(params, (SubLObject)cb_rtv.$kw165$FORMULA, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject mt = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw19$MT, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject rtv_clause = list_utilities.tree_find_if((SubLObject)cb_rtv.$sym173$RTV_CLAUSE_P, formula, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject arg1 = czer_main.canonicalize_term(cycl_utilities.formula_arg1(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED), (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject arg2 = czer_main.canonicalize_term(cycl_utilities.formula_arg2(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED), (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject fort = (cb_rtv.NIL != forts.fort_p(arg1)) ? arg1 : arg2;
        final SubLObject preds = el_utilities.el_extensional_set_elements(cycl_utilities.formula_arg3(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED));
        final SubLObject depth = cycl_utilities.formula_arg4(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject graph_type = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw154$GRAPH_TYPE, (SubLObject)cb_rtv.UNPROVIDED);
        SubLObject just_assertions = (SubLObject)cb_rtv.NIL;
        SubLObject result_links = (SubLObject)cb_rtv.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (cb_rtv.NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED)) || cb_rtv.NIL != cycl_variables.el_varP(cycl_utilities.formula_arg2(rtv_clause, (SubLObject)cb_rtv.UNPROVIDED))) {
                just_assertions = Sequences.remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying(fort, formula, preds, depth, mt), Symbols.symbol_function((SubLObject)cb_rtv.EQUAL), Symbols.symbol_function((SubLObject)cb_rtv.$sym171$ASSERTION_FORMULA), (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
            }
            else if (graph_type == cb_rtv.$kw96$EXPANDED_NODE_TO_NODE) {
                just_assertions = Sequences.remove_duplicates(removal_modules_rtv.rtv_all_edges_from_node_to_node(arg1, arg2, preds, depth, (SubLObject)cb_rtv.UNPROVIDED), (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED);
            }
            else {
                just_assertions = removal_modules_rtv.inference_rtv_justify((SubLObject)ConsesLow.list(cb_rtv.$const48$relatedToVia, arg1, arg2, reader.bq_cons(cb_rtv.$const46$TheSet, ConsesLow.append(preds, (SubLObject)cb_rtv.NIL)), depth), (SubLObject)cb_rtv.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = just_assertions;
        SubLObject just_assertion = (SubLObject)cb_rtv.NIL;
        just_assertion = cdolist_list_var.first();
        while (cb_rtv.NIL != cdolist_list_var) {
            if (cb_rtv.NIL != assertion_handles.assertion_p(just_assertion) && cb_rtv.NIL == kb_utilities.kbeq(cycl_utilities.formula_arg0(assertions_high.assertion_formula(just_assertion)), cb_rtv.$const167$genlPreds)) {
                result_links = (SubLObject)ConsesLow.cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just_assertion = cdolist_list_var.first();
        }
        return blue_grapher_utilities.bbf_make_graph((SubLObject)cb_rtv.NIL, list_utilities.hash_remove_duplicates(result_links, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$kw19$MT, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject cb_link_rtv_predicate_graph_event(final SubLObject linktext, final SubLObject args) {
        final SubLObject arghash = html_arghash.new_arghash((SubLObject)cb_rtv.UNPROVIDED);
        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw115$SIGNATURE, arghash, PrintLow.format((SubLObject)cb_rtv.NIL, (SubLObject)cb_rtv.$str155$_A, random.random(Numbers.expt((SubLObject)cb_rtv.TWO_INTEGER, (SubLObject)cb_rtv.$int156$30))));
        html_arghash.set_arghash_value_list((SubLObject)cb_rtv.$kw175$PRED_SET, arghash, ConsesLow.nth((SubLObject)cb_rtv.ZERO_INTEGER, args));
        html_arghash.set_arghash_value((SubLObject)cb_rtv.$kw19$MT, arghash, (cb_rtv.NIL != ConsesLow.nth((SubLObject)cb_rtv.ONE_INTEGER, args)) ? ConsesLow.nth((SubLObject)cb_rtv.ONE_INTEGER, args) : cb_rtv.$rtv_default_query_mt$.getGlobalValue());
        cb_blue_grapher.cb_blue_applet_window_link(arghash, linktext, (SubLObject)cb_rtv.$str176$cb_rtv_predicate_graph_event);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject cb_rtv_predicate_graph_event(final SubLObject args) {
        cb_blue_grapher.cb_blue_applet_window(args);
        final SubLObject arghash = html_arghash.arglist_to_arghash(args);
        subl_promotions.make_process_with_args((SubLObject)cb_rtv.$str176$cb_rtv_predicate_graph_event, Symbols.symbol_function((SubLObject)cb_rtv.$sym178$CB_RTV_PREDICATE_GRAPH_EVENT_PROCESS), (SubLObject)ConsesLow.list(arghash));
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject cb_rtv_predicate_graph_event_process(final SubLObject arghash) {
        final SubLObject mt = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw19$MT, arghash);
        final SubLObject preds = html_arghash.get_arghash_value_list((SubLObject)cb_rtv.$kw175$PRED_SET, arghash).rest();
        final SubLObject signature = html_arghash.get_arghash_value((SubLObject)cb_rtv.$kw115$SIGNATURE, arghash);
        blue_grapher_utilities.blue_event(signature, (SubLObject)ConsesLow.list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$kw161$BUILDER_FN, (SubLObject)cb_rtv.$sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS, (SubLObject)cb_rtv.$kw150$PREDS, preds, (SubLObject)cb_rtv.$kw19$MT, mt)));
        SubLObject cdolist_list_var = preds;
        SubLObject pred = (SubLObject)cb_rtv.NIL;
        pred = cdolist_list_var.first();
        while (cb_rtv.NIL != cdolist_list_var) {
            blue_grapher_utilities.blue_event(signature, (SubLObject)ConsesLow.list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_node_string$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$kw149$FORTS, (SubLObject)ConsesLow.list(pred))));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return (SubLObject)cb_rtv.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
    public static SubLObject bbf_all_edges_subsumed_by_preds(final SubLObject arg_plist) {
        final SubLObject preds = conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw150$PREDS, (SubLObject)cb_rtv.UNPROVIDED);
        final SubLObject mt = (cb_rtv.NIL != conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw19$MT, (SubLObject)cb_rtv.UNPROVIDED)) ? conses_high.getf(arg_plist, (SubLObject)cb_rtv.$kw19$MT, (SubLObject)cb_rtv.UNPROVIDED) : cb_rtv.$rtv_default_query_mt$.getGlobalValue();
        final SubLObject just_assertions = removal_modules_rtv.all_edges_subsumed_by_preds(preds, mt);
        SubLObject result_links = (SubLObject)cb_rtv.NIL;
        SubLObject cdolist_list_var = just_assertions;
        SubLObject just_assertion = (SubLObject)cb_rtv.NIL;
        just_assertion = cdolist_list_var.first();
        while (cb_rtv.NIL != cdolist_list_var) {
            if (cb_rtv.NIL != assertion_handles.assertion_p(just_assertion)) {
                result_links = (SubLObject)ConsesLow.cons(blue_grapher_utilities.bbf_make_edge_from_assertion(just_assertion), result_links);
            }
            cdolist_list_var = cdolist_list_var.rest();
            just_assertion = cdolist_list_var.first();
        }
        return blue_grapher_utilities.bbf_make_graph((SubLObject)cb_rtv.NIL, list_utilities.hash_remove_duplicates(result_links, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED, (SubLObject)cb_rtv.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)cb_rtv.$kw19$MT, mt));
    }
    
    public static SubLObject declare_cb_rtv_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_link_rtv_query", "CB-LINK-RTV-QUERY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_fort_generation_fn", "CB-RTV-FORT-GENERATION-FN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_fort_parse_fn", "CB-RTV-FORT-PARSE-FN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "maybe_initialize_cb_rtv_predicates", "MAYBE-INITIALIZE-CB-RTV-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "initialize_cb_rtv_predicates", "INITIALIZE-CB-RTV-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "maybe_initialize_cb_rtv_collections", "MAYBE-INITIALIZE-CB-RTV-COLLECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "initialize_cb_rtv_collections", "INITIALIZE-CB-RTV-COLLECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv", "CB-RTV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_submit_buttons", "CB-RTV-SUBMIT-BUTTONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_query_readyP", "CB-RTV-QUERY-READY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_show_query_results", "CB-RTV-SHOW-QUERY-RESULTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_justify_term", "CB-RTV-JUSTIFY-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_justify_term_open_window", "CB-RTV-JUSTIFY-TERM-OPEN-WINDOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_link_rtv_justify_term", "CB-LINK-RTV-JUSTIFY-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_justify_open_window_link", "CB-RTV-JUSTIFY-OPEN-WINDOW-LINK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "rtv_hl_justify", "RTV-HL-JUSTIFY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_indented_table_data", "CB-RTV-INDENTED-TABLE-DATA");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_meta_supports_to_show", "CB-RTV-META-SUPPORTS-TO-SHOW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_maybe_show_meta_supports", "CB-RTV-MAYBE-SHOW-META-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_show_support", "CB-RTV-SHOW-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_show_support_readably", "CB-RTV-SHOW-SUPPORT-READABLY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_maybe_show_additional_supports", "CB-RTV-MAYBE-SHOW-ADDITIONAL-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_show_argument", "CB-RTV-SHOW-ARGUMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_show_arguments", "CB-RTV-SHOW-ARGUMENTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "rtv_supportP", "RTV-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_link_rtv_graph_event", "CB-LINK-RTV-GRAPH-EVENT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_graph_event", "CB-RTV-GRAPH-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_graph_event_process", "CB-RTV-GRAPH-EVENT-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "bbf_rtv_all_edges_between", "BBF-RTV-ALL-EDGES-BETWEEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "bbf_rtv_all_edges_from_node", "BBF-RTV-ALL-EDGES-FROM-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "bbf_rtv_all_edges_from_node_satisfying", "BBF-RTV-ALL-EDGES-FROM-NODE-SATISFYING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "bbf_rtv", "BBF-RTV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_link_rtv_predicate_graph_event", "CB-LINK-RTV-PREDICATE-GRAPH-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_predicate_graph_event", "CB-RTV-PREDICATE-GRAPH-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "cb_rtv_predicate_graph_event_process", "CB-RTV-PREDICATE-GRAPH-EVENT-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_rtv", "bbf_all_edges_subsumed_by_preds", "BBF-ALL-EDGES-SUBSUMED-BY-PREDS", 1, 0, false);
        return (SubLObject)cb_rtv.NIL;
    }
    
    public static SubLObject init_cb_rtv_file() {
        cb_rtv.$cb_rtv_fort_generation_fn$ = SubLFiles.defparameter("*CB-RTV-FORT-GENERATION-FN*", (SubLObject)cb_rtv.$sym6$GENERATE_PHRASE);
        cb_rtv.$cb_rtv_fort_parse_fn$ = SubLFiles.defparameter("*CB-RTV-FORT-PARSE-FN*", (SubLObject)cb_rtv.$sym9$TERMS_FOR_BROWSING);
        cb_rtv.$rtv_default_query_mt$ = SubLFiles.deflexical("*RTV-DEFAULT-QUERY-MT*", cb_rtv.$const10$CurrentWorldDataCollectorMt_NonHo);
        cb_rtv.$cb_rtv_predicates$ = SubLFiles.defparameter("*CB-RTV-PREDICATES*", (SubLObject)cb_rtv.NIL);
        cb_rtv.$cb_rtv_ask_results$ = SubLFiles.defparameter("*CB-RTV-ASK-RESULTS*", (SubLObject)cb_rtv.NIL);
        cb_rtv.$cb_rtv_collections$ = SubLFiles.defparameter("*CB-RTV-COLLECTIONS*", (SubLObject)cb_rtv.NIL);
        cb_rtv.$cb_rtv_meta_support_level$ = SubLFiles.defparameter("*CB-RTV-META-SUPPORT-LEVEL*", (SubLObject)cb_rtv.ZERO_INTEGER);
        cb_rtv.$cb_rtv_meta_support_max$ = SubLFiles.deflexical("*CB-RTV-META-SUPPORT-MAX*", (SubLObject)cb_rtv.FIVE_INTEGER);
        cb_rtv.$cb_rtv_graph_keys$ = SubLFiles.deflexical("*CB-RTV-GRAPH-KEYS*", (SubLObject)cb_rtv.$list148);
        return (SubLObject)cb_rtv.NIL;
    }
    
    public static SubLObject setup_cb_rtv_file() {
        cb_utilities.setup_cb_link_method((SubLObject)cb_rtv.$kw3$RTV_QUERY, (SubLObject)cb_rtv.$sym4$CB_LINK_RTV_QUERY, (SubLObject)cb_rtv.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)cb_rtv.$kw3$RTV_QUERY, (SubLObject)cb_rtv.$str0$RTV, (SubLObject)cb_rtv.$str0$RTV, (SubLObject)cb_rtv.$str5$relatedToVia_Query_Tool);
        utilities_macros.register_html_state_variable((SubLObject)cb_rtv.$sym11$_CB_RTV_PREDICATES_);
        utilities_macros.register_html_state_variable((SubLObject)cb_rtv.$sym13$_CB_RTV_ASK_RESULTS_);
        utilities_macros.register_html_state_variable((SubLObject)cb_rtv.$sym14$_CB_RTV_COLLECTIONS_);
        html_macros.note_cgi_handler_function((SubLObject)cb_rtv.$sym85$CB_RTV, (SubLObject)cb_rtv.$kw86$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_rtv.$sym103$CB_RTV_JUSTIFY_TERM, (SubLObject)cb_rtv.$kw86$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_rtv.$sym114$CB_RTV_JUSTIFY_TERM_OPEN_WINDOW, (SubLObject)cb_rtv.$kw86$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_rtv.$kw100$RTV_JUSTIFY_TERM, (SubLObject)cb_rtv.$sym118$CB_LINK_RTV_JUSTIFY_TERM, (SubLObject)cb_rtv.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_rtv.$kw93$RTV_GRAPH_EVENT, (SubLObject)cb_rtv.$sym158$CB_LINK_RTV_GRAPH_EVENT, (SubLObject)cb_rtv.THREE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_rtv.$sym160$CB_RTV_GRAPH_EVENT, (SubLObject)cb_rtv.$kw86$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_rtv.$sym162$BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)cb_rtv.T);
        Hashtables.sethash((SubLObject)cb_rtv.$sym162$BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)cb_rtv.$list166);
        utilities_macros.register_api_predefined_function((SubLObject)cb_rtv.$sym162$BBF_RTV_ALL_EDGES_BETWEEN);
        Hashtables.sethash((SubLObject)cb_rtv.$sym168$BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)cb_rtv.T);
        Hashtables.sethash((SubLObject)cb_rtv.$sym168$BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)cb_rtv.$list169);
        utilities_macros.register_api_predefined_function((SubLObject)cb_rtv.$sym168$BBF_RTV_ALL_EDGES_FROM_NODE);
        Hashtables.sethash((SubLObject)cb_rtv.$sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)cb_rtv.T);
        Hashtables.sethash((SubLObject)cb_rtv.$sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)cb_rtv.$list172);
        utilities_macros.register_api_predefined_function((SubLObject)cb_rtv.$sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING);
        Hashtables.sethash((SubLObject)cb_rtv.$sym174$BBF_RTV, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)cb_rtv.T);
        Hashtables.sethash((SubLObject)cb_rtv.$sym174$BBF_RTV, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)cb_rtv.$list172);
        utilities_macros.register_api_predefined_function((SubLObject)cb_rtv.$sym174$BBF_RTV);
        cb_utilities.setup_cb_link_method((SubLObject)cb_rtv.$kw80$RTV_PREDICATE_GRAPH_EVENT, (SubLObject)cb_rtv.$sym177$CB_LINK_RTV_PREDICATE_GRAPH_EVENT, (SubLObject)cb_rtv.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_rtv.$sym179$CB_RTV_PREDICATE_GRAPH_EVENT, (SubLObject)cb_rtv.$kw86$HTML_HANDLER);
        Hashtables.sethash((SubLObject)cb_rtv.$sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), (SubLObject)cb_rtv.T);
        Hashtables.sethash((SubLObject)cb_rtv.$sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), (SubLObject)cb_rtv.$list181);
        utilities_macros.register_api_predefined_function((SubLObject)cb_rtv.$sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS);
        return (SubLObject)cb_rtv.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_rtv_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_rtv_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_rtv_file();
    }
    
    static {
        me = (SubLFile)new cb_rtv();
        cb_rtv.$cb_rtv_fort_generation_fn$ = null;
        cb_rtv.$cb_rtv_fort_parse_fn$ = null;
        cb_rtv.$rtv_default_query_mt$ = null;
        cb_rtv.$cb_rtv_predicates$ = null;
        cb_rtv.$cb_rtv_ask_results$ = null;
        cb_rtv.$cb_rtv_collections$ = null;
        cb_rtv.$cb_rtv_meta_support_level$ = null;
        cb_rtv.$cb_rtv_meta_support_max$ = null;
        cb_rtv.$cb_rtv_graph_keys$ = null;
        $str0$RTV = SubLObjectFactory.makeString("RTV");
        $kw1$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str2$cb_rtv = SubLObjectFactory.makeString("cb-rtv");
        $kw3$RTV_QUERY = SubLObjectFactory.makeKeyword("RTV-QUERY");
        $sym4$CB_LINK_RTV_QUERY = SubLObjectFactory.makeSymbol("CB-LINK-RTV-QUERY");
        $str5$relatedToVia_Query_Tool = SubLObjectFactory.makeString("relatedToVia Query Tool");
        $sym6$GENERATE_PHRASE = SubLObjectFactory.makeSymbol("GENERATE-PHRASE");
        $kw7$NL = SubLObjectFactory.makeKeyword("NL");
        $sym8$FORT_TO_STRING = SubLObjectFactory.makeSymbol("FORT-TO-STRING");
        $sym9$TERMS_FOR_BROWSING = SubLObjectFactory.makeSymbol("TERMS-FOR-BROWSING");
        $const10$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentWorldDataCollectorMt-NonHomocentric"));
        $sym11$_CB_RTV_PREDICATES_ = SubLObjectFactory.makeSymbol("*CB-RTV-PREDICATES*");
        $list12 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("actors")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("affiliatedWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acquaintedWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("allies")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("citizens")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("containsInformation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deliberateActors")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("deviceUsed")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("directingAgent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doesBusinessWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("employees")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLeaders")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasOwnershipIn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("in-ContCompletely")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likesAsFriend")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("possesses")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("residenceOfOrganization")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subEvents")) });
        $sym13$_CB_RTV_ASK_RESULTS_ = SubLObjectFactory.makeSymbol("*CB-RTV-ASK-RESULTS*");
        $sym14$_CB_RTV_COLLECTIONS_ = SubLObjectFactory.makeSymbol("*CB-RTV-COLLECTIONS*");
        $sym15$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const16$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const17$RTVDemoCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RTVDemoCollection"));
        $list18 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place")));
        $kw19$MT = SubLObjectFactory.makeKeyword("MT");
        $kw20$RESET = SubLObjectFactory.makeKeyword("RESET");
        $str21$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str22$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw23$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw24$TERM1 = SubLObjectFactory.makeKeyword("TERM1");
        $const25$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $kw26$TERM2_TYPE = SubLObjectFactory.makeKeyword("TERM2-TYPE");
        $kw27$INDIVIDUAL = SubLObjectFactory.makeKeyword("INDIVIDUAL");
        $kw28$TERM2 = SubLObjectFactory.makeKeyword("TERM2");
        $kw29$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw30$GENL = SubLObjectFactory.makeKeyword("GENL");
        $kw31$TERM2_ADD_TYPE = SubLObjectFactory.makeKeyword("TERM2-ADD-TYPE");
        $const32$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $kw33$TERM2_VARIABLE_TYPE = SubLObjectFactory.makeKeyword("TERM2-VARIABLE-TYPE");
        $kw34$PRED = SubLObjectFactory.makeKeyword("PRED");
        $const35$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw36$NUM = SubLObjectFactory.makeKeyword("NUM");
        $kw37$NEW_PRED = SubLObjectFactory.makeKeyword("NEW-PRED");
        $const38$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $kw39$REMOVE_PREDS = SubLObjectFactory.makeKeyword("REMOVE-PREDS");
        $kw40$PREDICATES = SubLObjectFactory.makeKeyword("PREDICATES");
        $kw41$ON = SubLObjectFactory.makeKeyword("ON");
        $kw42$GENL_PRED_REASONING = SubLObjectFactory.makeKeyword("GENL-PRED-REASONING");
        $const43$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("GENL"));
        $sym45$_ANY = SubLObjectFactory.makeSymbol("?ANY");
        $const46$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $kw47$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $const48$relatedToVia = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relatedToVia"));
        $const49$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const50$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const51$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw52$ASK_FORMULA = SubLObjectFactory.makeKeyword("ASK-FORMULA");
        $str53$___ = SubLObjectFactory.makeString(" : ");
        $sym54$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $sym55$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $kw56$RUN_QUERY = SubLObjectFactory.makeKeyword("RUN-QUERY");
        $str57$cg = SubLObjectFactory.makeString("cg");
        $str58$How_can_the_individual_named_ = SubLObjectFactory.makeString("How can the individual named ");
        $kw59$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str60$be_connected_to_ = SubLObjectFactory.makeString("be connected to ");
        $kw61$KEYWORD = SubLObjectFactory.makeKeyword("KEYWORD");
        $str62$onChange_javascript_this_form_sub = SubLObjectFactory.makeString("onChange=javascript:this.form.submit();");
        $kw63$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str64$the_individual_named = SubLObjectFactory.makeString("the individual named");
        $str65$any = SubLObjectFactory.makeString("any");
        $str66$any_type_of = SubLObjectFactory.makeString("any type of");
        $kw67$FORT = SubLObjectFactory.makeKeyword("FORT");
        $str68$___ = SubLObjectFactory.makeString("<--");
        $str69$by_at_most = SubLObjectFactory.makeString("by at most");
        $str70$links_using_ = SubLObjectFactory.makeString("links using ");
        $str71$_the_selected_relations_and_their = SubLObjectFactory.makeString(" the selected relations and their specializations ");
        $kw72$OFF = SubLObjectFactory.makeKeyword("OFF");
        $str73$_only_the_selected_relations_ = SubLObjectFactory.makeString(" only the selected relations ");
        $kw74$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $kw75$RED = SubLObjectFactory.makeKeyword("RED");
        $str76$_ = SubLObjectFactory.makeString("*");
        $str77$________Add_New_Relation = SubLObjectFactory.makeString("   <--- Add New Relation");
        $kw78$ADD_PRED = SubLObjectFactory.makeKeyword("ADD-PRED");
        $str79$_____Remove_Selected_Relations = SubLObjectFactory.makeString("---> Remove Selected Relations");
        $kw80$RTV_PREDICATE_GRAPH_EVENT = SubLObjectFactory.makeKeyword("RTV-PREDICATE-GRAPH-EVENT");
        $str81$_Visualize_Selected_Relations_ = SubLObjectFactory.makeString("[Visualize Selected Relations]");
        $str82$in_the_context_ = SubLObjectFactory.makeString("in the context ");
        $str83$Current_query_formula____A = SubLObjectFactory.makeString("Current query formula : ~A");
        $sym84$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym85$CB_RTV = SubLObjectFactory.makeSymbol("CB-RTV");
        $kw86$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str87$Update = SubLObjectFactory.makeString("Update");
        $kw88$UPDATE = SubLObjectFactory.makeKeyword("UPDATE");
        $str89$Run_This_Query = SubLObjectFactory.makeString("Run This Query");
        $str90$Reset_Completely = SubLObjectFactory.makeString("Reset Completely");
        $str91$No_answers_found_ = SubLObjectFactory.makeString("No answers found.");
        $str92$Query_Results = SubLObjectFactory.makeString("Query Results");
        $kw93$RTV_GRAPH_EVENT = SubLObjectFactory.makeKeyword("RTV-GRAPH-EVENT");
        $str94$_Visualize_below_justification_ = SubLObjectFactory.makeString("[Visualize below justification]");
        $str95$_Visualize_more_justifications_ = SubLObjectFactory.makeString("[Visualize more justifications]");
        $kw96$EXPANDED_NODE_TO_NODE = SubLObjectFactory.makeKeyword("EXPANDED-NODE-TO-NODE");
        $str97$_Visualize_justifications_of_all_ = SubLObjectFactory.makeString("[Visualize justifications of all results]");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $str99$True__ = SubLObjectFactory.makeString("True: ");
        $kw100$RTV_JUSTIFY_TERM = SubLObjectFactory.makeKeyword("RTV-JUSTIFY-TERM");
        $str101$_Explain_ = SubLObjectFactory.makeString("[Explain]");
        $str102$_Visualize_ = SubLObjectFactory.makeString("[Visualize]");
        $sym103$CB_RTV_JUSTIFY_TERM = SubLObjectFactory.makeSymbol("CB-RTV-JUSTIFY-TERM");
        $kw104$TERM = SubLObjectFactory.makeKeyword("TERM");
        $kw105$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw106$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw107$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str108$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str109$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str110$button = SubLObjectFactory.makeString("button");
        $str111$reload = SubLObjectFactory.makeString("reload");
        $str112$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str113$1 = SubLObjectFactory.makeString("1");
        $sym114$CB_RTV_JUSTIFY_TERM_OPEN_WINDOW = SubLObjectFactory.makeSymbol("CB-RTV-JUSTIFY-TERM-OPEN-WINDOW");
        $kw115$SIGNATURE = SubLObjectFactory.makeKeyword("SIGNATURE");
        $str116$justify_me = SubLObjectFactory.makeString("justify-me");
        $str117$cb_rtv_justify_term = SubLObjectFactory.makeString("cb-rtv-justify-term");
        $sym118$CB_LINK_RTV_JUSTIFY_TERM = SubLObjectFactory.makeSymbol("CB-LINK-RTV-JUSTIFY-TERM");
        $str119$window_open__ = SubLObjectFactory.makeString("window.open('");
        $str120$__ = SubLObjectFactory.makeString("',");
        $str121$__A_ = SubLObjectFactory.makeString("'~A'");
        $str122$null = SubLObjectFactory.makeString("null");
        $str123$___A____ = SubLObjectFactory.makeString(",'~A'); ");
        $str124$dependent_yes_height_360_width_64 = SubLObjectFactory.makeString("dependent=yes,height=360,width=640,innerheight=360,innerwidth=640,hotkeys=no,directories=no,menubar=no,resizable=yes,scrollbars=yes,toolbar=no");
        $str125$return_false_ = SubLObjectFactory.makeString("return false;");
        $sym126$HTML_TABLE_ROW = SubLObjectFactory.makeSymbol("HTML-TABLE-ROW");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-GLYPH"), (SubLObject)SubLObjectFactory.makeKeyword("NBSP")));
        $sym128$HTML_TABLE_DATA = SubLObjectFactory.makeSymbol("HTML-TABLE-DATA");
        $str129$meta_supports_ = SubLObjectFactory.makeString("meta_supports_");
        $str130$text_css = SubLObjectFactory.makeString("text/css");
        $str131$screen = SubLObjectFactory.makeString("screen");
        $str132$none = SubLObjectFactory.makeString("none");
        $str133$ = SubLObjectFactory.makeString("");
        $kw134$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $kw135$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str136$_A_meta__D = SubLObjectFactory.makeString("~A_meta_~D");
        $str137$support = SubLObjectFactory.makeString("support");
        $str138$additional_supports_ = SubLObjectFactory.makeString("additional_supports_");
        $str139$Additional_Supports = SubLObjectFactory.makeString("Additional Supports");
        $kw140$VISIBLE = SubLObjectFactory.makeKeyword("VISIBLE");
        $str141$_A_additional__D = SubLObjectFactory.makeString("~A_additional_~D");
        $str142$_A__D = SubLObjectFactory.makeString("~A_~D");
        $str143$_A_ = SubLObjectFactory.makeString("~A_");
        $str144$_A_D = SubLObjectFactory.makeString("~A~D");
        $kw145$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str146$_S_ = SubLObjectFactory.makeString("~S.");
        $kw147$RTV = SubLObjectFactory.makeKeyword("RTV");
        $list148 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ASK-FORMULA"), SubLObjectFactory.makeKeyword("FORTS"), SubLObjectFactory.makeKeyword("PREDS"), SubLObjectFactory.makeKeyword("MT"), SubLObjectFactory.makeKeyword("DEPTH"), SubLObjectFactory.makeKeyword("FILTER-PRED"), SubLObjectFactory.makeKeyword("FILTER-FORT"), SubLObjectFactory.makeKeyword("SIGNATURE"), SubLObjectFactory.makeKeyword("GRAPH-TYPE") });
        $kw149$FORTS = SubLObjectFactory.makeKeyword("FORTS");
        $kw150$PREDS = SubLObjectFactory.makeKeyword("PREDS");
        $kw151$FILTER_PRED = SubLObjectFactory.makeKeyword("FILTER-PRED");
        $kw152$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $kw153$FILTER_FORT = SubLObjectFactory.makeKeyword("FILTER-FORT");
        $kw154$GRAPH_TYPE = SubLObjectFactory.makeKeyword("GRAPH-TYPE");
        $str155$_A = SubLObjectFactory.makeString("~A");
        $int156$30 = SubLObjectFactory.makeInteger(30);
        $str157$cb_rtv_graph_event = SubLObjectFactory.makeString("cb-rtv-graph-event");
        $sym158$CB_LINK_RTV_GRAPH_EVENT = SubLObjectFactory.makeSymbol("CB-LINK-RTV-GRAPH-EVENT");
        $sym159$CB_RTV_GRAPH_EVENT_PROCESS = SubLObjectFactory.makeSymbol("CB-RTV-GRAPH-EVENT-PROCESS");
        $sym160$CB_RTV_GRAPH_EVENT = SubLObjectFactory.makeSymbol("CB-RTV-GRAPH-EVENT");
        $kw161$BUILDER_FN = SubLObjectFactory.makeKeyword("BUILDER-FN");
        $sym162$BBF_RTV_ALL_EDGES_BETWEEN = SubLObjectFactory.makeSymbol("BBF-RTV-ALL-EDGES-BETWEEN");
        $sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING = SubLObjectFactory.makeSymbol("BBF-RTV-ALL-EDGES-FROM-NODE-SATISFYING");
        $kw164$PARAMS = SubLObjectFactory.makeKeyword("PARAMS");
        $kw165$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show links between two FORTS (nodes) through PREDS (links) in MT with maximum path length of DEPTH.  (Forts failing FILTER-FNS are filtered.)  (Currently only one path is shown.)"));
        $const167$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $sym168$BBF_RTV_ALL_EDGES_FROM_NODE = SubLObjectFactory.makeSymbol("BBF-RTV-ALL-EDGES-FROM-NODE");
        $list169 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show all from one FORTS (nodes) through PREDS (links) in MT to DEPTH.  (Forts failing FILTER-FNS are filtered.)  (Note that this can make huge graphs for higher values of DEPTH.)"));
        $list170 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ANY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $sym171$ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString(""));
        $sym173$RTV_CLAUSE_P = SubLObjectFactory.makeSymbol("RTV-CLAUSE-P");
        $sym174$BBF_RTV = SubLObjectFactory.makeSymbol("BBF-RTV");
        $kw175$PRED_SET = SubLObjectFactory.makeKeyword("PRED-SET");
        $str176$cb_rtv_predicate_graph_event = SubLObjectFactory.makeString("cb-rtv-predicate-graph-event");
        $sym177$CB_LINK_RTV_PREDICATE_GRAPH_EVENT = SubLObjectFactory.makeSymbol("CB-LINK-RTV-PREDICATE-GRAPH-EVENT");
        $sym178$CB_RTV_PREDICATE_GRAPH_EVENT_PROCESS = SubLObjectFactory.makeSymbol("CB-RTV-PREDICATE-GRAPH-EVENT-PROCESS");
        $sym179$CB_RTV_PREDICATE_GRAPH_EVENT = SubLObjectFactory.makeSymbol("CB-RTV-PREDICATE-GRAPH-EVENT");
        $sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS = SubLObjectFactory.makeSymbol("BBF-ALL-EDGES-SUBSUMED-BY-PREDS");
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HELP-STRING"), (SubLObject)SubLObjectFactory.makeString("Show all specPreds of PREDS (nodes) in MT."));
    }
}

/*

	Total time: 1334 ms
	
*/