package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_facets extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_facets";
    public static final String myFingerPrint = "4d5c3fef85397db1f3237d5b49321894ce2ac4a5559f7021979029eb2a5eef35";
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 831L)
    private static SubLSymbol $default_facet_tool_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 946L)
    public static SubLSymbol $facet_tool_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 1066L)
    private static SubLSymbol $cb_facet_tool_name$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 1156L)
    private static SubLSymbol $cb_facet_tool_handler$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLSymbol $dtp_perspective$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 5214L)
    private static SubLSymbol $perspectives$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 5307L)
    private static SubLSymbol $perspectives_by_keyword$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 7121L)
    private static SubLSymbol $perspective_type_sort$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLSymbol $dtp_perspective_action$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 24167L)
    private static SubLSymbol $perspective_actions$;
    private static final SubLObject $const0$UniversalVocabularyMt;
    private static final SubLSymbol $sym1$_FACET_TOOL_MT_;
    private static final SubLString $str2$Facets_Browser;
    private static final SubLString $str3$cb_facet;
    private static final SubLSymbol $kw4$FACET_BROWSER;
    private static final SubLString $str5$facet_browser_gif;
    private static final SubLString $str6$_Facets_;
    private static final SubLSymbol $kw7$FACET_BROWSER_DISABLED;
    private static final SubLString $str8$facet_browser_disabled_gif;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$VFACETS;
    private static final SubLSymbol $sym11$ADORNMENT_NAME;
    private static final SubLSymbol $kw12$FORT;
    private static final SubLSymbol $kw13$JUST_FORT;
    private static final SubLString $str14$No_term_provided_;
    private static final SubLString $str15$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str16$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw17$UNINITIALIZED;
    private static final SubLSymbol $kw18$CB_CYC;
    private static final SubLSymbol $kw19$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw20$SHA1;
    private static final SubLString $str21$yui_skin_sam;
    private static final SubLString $str22$reloadFrameButton;
    private static final SubLString $str23$button;
    private static final SubLString $str24$reload;
    private static final SubLString $str25$Refresh_Frames;
    private static final SubLString $str26$WARNING__You_are_transmitting_ope;
    private static final SubLSymbol $kw27$POST;
    private static final SubLSymbol $kw28$PERSPECTIVE;
    private static final SubLSymbol $kw29$GLOBAL_TOP;
    private static final SubLSymbol $kw30$GLOBAL_BOTTOM;
    private static final SubLSymbol $sym31$CB_FACET;
    private static final SubLSymbol $kw32$HTML_HANDLER;
    private static final SubLSymbol $sym33$PERSPECTIVE;
    private static final SubLSymbol $sym34$PERSPECTIVE_P;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$PRINT_PERSPECTIVE;
    private static final SubLSymbol $sym40$PERSPECTIVE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$PERSPECTIVE_NAME;
    private static final SubLSymbol $sym43$_CSETF_PERSPECTIVE_NAME;
    private static final SubLSymbol $sym44$PERSPECTIVE_KEYWORD;
    private static final SubLSymbol $sym45$_CSETF_PERSPECTIVE_KEYWORD;
    private static final SubLSymbol $sym46$PERSPECTIVE_DISPLAY__FN;
    private static final SubLSymbol $sym47$_CSETF_PERSPECTIVE_DISPLAY__FN;
    private static final SubLSymbol $sym48$PERSPECTIVE_DISPLAY_FN;
    private static final SubLSymbol $sym49$_CSETF_PERSPECTIVE_DISPLAY_FN;
    private static final SubLSymbol $sym50$PERSPECTIVE_DISPLAY_STRING;
    private static final SubLSymbol $sym51$_CSETF_PERSPECTIVE_DISPLAY_STRING;
    private static final SubLSymbol $kw52$NAME;
    private static final SubLSymbol $kw53$KEYWORD;
    private static final SubLSymbol $kw54$DISPLAY__FN;
    private static final SubLSymbol $kw55$DISPLAY_FN;
    private static final SubLSymbol $kw56$DISPLAY_STRING;
    private static final SubLString $str57$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw58$BEGIN;
    private static final SubLSymbol $sym59$MAKE_PERSPECTIVE;
    private static final SubLSymbol $kw60$SLOT;
    private static final SubLSymbol $kw61$END;
    private static final SubLSymbol $sym62$VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_METHOD;
    private static final SubLInteger $int63$32;
    private static final SubLString $str64$_;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$NEW_PERSPECTIVE;
    private static final SubLSymbol $sym67$CLET;
    private static final SubLSymbol $sym68$QUOTE;
    private static final SubLSymbol $sym69$CSETF;
    private static final SubLSymbol $sym70$SETHASH;
    private static final SubLSymbol $sym71$_PERSPECTIVES_BY_KEYWORD_;
    private static final SubLSymbol $sym72$CSETQ;
    private static final SubLSymbol $sym73$_PERSPECTIVES_;
    private static final SubLSymbol $sym74$CONS;
    private static final SubLSymbol $sym75$DELETE;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$AS_INDIVIDUAL;
    private static final SubLString $str80$100_;
    private static final SubLSymbol $kw81$A_FACET;
    private static final SubLSymbol $sym82$GENERALITY_ESTIMATE_;
    private static final SubLSymbol $sym83$FORT_NAME_;
    private static final SubLString $str84$6_;
    private static final SubLObject $const85$isa;
    private static final SubLSymbol $kw86$RIGHT;
    private static final SubLSymbol $kw87$ASSERTION;
    private static final SubLSymbol $kw88$NBSP;
    private static final SubLString $str89$i_;
    private static final SubLSymbol $kw90$ADD_SUP;
    private static final SubLSymbol $kw91$ADD_SUP_FROM;
    private static final SubLSymbol $kw92$DEFAULT;
    private static final SubLString $str93$x_;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$AS_COLLECTION;
    private static final SubLObject $const96$genls;
    private static final SubLSymbol $kw97$ASSERTED_TRUE;
    private static final SubLSymbol $kw98$COEXTENSIONAL;
    private static final SubLString $str99$__genls__;
    private static final SubLString $str100$in_Mt;
    private static final SubLString $str101$Unassert;
    private static final SubLSymbol $kw102$UNASSERT_GO;
    private static final SubLString $str103$__coextensional_;
    private static final SubLSymbol $kw104$CENTER;
    private static final SubLSymbol $kw105$UNASSERT_ID;
    private static final SubLSymbol $sym106$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $kw107$FACETS_;
    private static final SubLString $str108$__faceted_specs__;
    private static final SubLSymbol $kw109$FACET_ID;
    private static final SubLSymbol $kw110$FACET_ID_SELECTED;
    private static final SubLString $str111$_A_SPEC;
    private static final SubLString $str112$_A_SPEC_SELECTED;
    private static final SubLSymbol $kw113$SPECS_FACETED_;
    private static final SubLInteger $int114$200;
    private static final SubLInteger $int115$100;
    private static final SubLSymbol $kw116$SPECS_UNFACETED_;
    private static final SubLString $str117$__unfaceted_specs__;
    private static final SubLSymbol $kw118$SPEC_UNFACETED;
    private static final SubLString $str119$____;
    private static final SubLString $str120$_unfaceted_specs_not_shown_;
    private static final SubLObject $const121$Collection;
    private static final SubLSymbol $kw122$INSTANCES_;
    private static final SubLString $str123$__instances__;
    private static final SubLSymbol $kw124$INSTANCE;
    private static final SubLString $str125$_instances_not_shown_;
    private static final SubLSymbol $sym126$PERSPECTIVE_ACTION;
    private static final SubLSymbol $sym127$PERSPECTIVE_ACTION_P;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$PRINT_PERSPECTIVE_ACTION;
    private static final SubLSymbol $sym133$PERSPECTIVE_ACTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list134;
    private static final SubLSymbol $sym135$PERSPECTIVE_ACTION_NAME;
    private static final SubLSymbol $sym136$_CSETF_PERSPECTIVE_ACTION_NAME;
    private static final SubLSymbol $sym137$PERSPECTIVE_ACTION_KEYWORD;
    private static final SubLSymbol $sym138$_CSETF_PERSPECTIVE_ACTION_KEYWORD;
    private static final SubLSymbol $sym139$PERSPECTIVE_ACTION_ORDER_NUM;
    private static final SubLSymbol $sym140$_CSETF_PERSPECTIVE_ACTION_ORDER_NUM;
    private static final SubLSymbol $sym141$PERSPECTIVE_ACTION_PERSPECTIVE;
    private static final SubLSymbol $sym142$_CSETF_PERSPECTIVE_ACTION_PERSPECTIVE;
    private static final SubLSymbol $sym143$PERSPECTIVE_ACTION_DISPLAY__FN;
    private static final SubLSymbol $sym144$_CSETF_PERSPECTIVE_ACTION_DISPLAY__FN;
    private static final SubLSymbol $sym145$PERSPECTIVE_ACTION_DISPLAY_FN;
    private static final SubLSymbol $sym146$_CSETF_PERSPECTIVE_ACTION_DISPLAY_FN;
    private static final SubLSymbol $sym147$PERSPECTIVE_ACTION_HANDLER__FN;
    private static final SubLSymbol $sym148$_CSETF_PERSPECTIVE_ACTION_HANDLER__FN;
    private static final SubLSymbol $sym149$PERSPECTIVE_ACTION_HANDLER_FN;
    private static final SubLSymbol $sym150$_CSETF_PERSPECTIVE_ACTION_HANDLER_FN;
    private static final SubLSymbol $kw151$ORDER_NUM;
    private static final SubLSymbol $kw152$HANDLER__FN;
    private static final SubLSymbol $kw153$HANDLER_FN;
    private static final SubLSymbol $sym154$MAKE_PERSPECTIVE_ACTION;
    private static final SubLSymbol $sym155$VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_ACTION_METHOD;
    private static final SubLSymbol $sym156$NEW_PERSPECTIVE_ACTION;
    private static final SubLSymbol $sym157$_PERSPECTIVE_ACTIONS_;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$_;
    private static final SubLList $list160;
    private static final SubLSymbol $sym161$CHANGE_PERSPECTIVE;
    private static final SubLString $str162$__A_;
    private static final SubLString $str163$_A__A;
    private static final SubLSymbol $kw164$NEW_PERSPECTIVE;
    private static final SubLSymbol $kw165$DISPLAY;
    private static final SubLList $list166;
    private static final SubLSymbol $sym167$SHOW_DEFINITION;
    private static final SubLSymbol $kw168$MIDDLE;
    private static final SubLString $str169$_Show_;
    private static final SubLString $str170$_in_Index_Browser_;
    private static final SubLSymbol $sym171$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const172$EverythingPSC;
    private static final SubLSymbol $sym173$ASSERTION_MT;
    private static final SubLSymbol $sym174$HLMT_EQUAL;
    private static final SubLString $str175$Defined_in_;
    private static final SubLString $str176$_;
    private static final SubLObject $const177$comment;
    private static final SubLString $str178$No_comment_;
    private static final SubLString $str179$__isa__;
    private static final SubLString $str180$Undefined_in_current_Mt_;
    private static final SubLSymbol $kw181$DESCENDING;
    private static final SubLList $list182;
    private static final SubLSymbol $sym183$ADD_FORT_TO_CHOSEN_COLS;
    private static final SubLString $str184$__Make_;
    private static final SubLString $str185$_a_direct_instance_of_selected_co;
    private static final SubLString $str186$Go;
    private static final SubLSymbol $kw187$ADD_FORT_TO_CHOSEN_COLS_GO;
    private static final SubLSymbol $kw188$ERRORS;
    private static final SubLList $list189;
    private static final SubLList $list190;
    private static final SubLSymbol $sym191$ADD_SPECS_TO_FACET;
    private static final SubLString $str192$__Add_selected_spec_s__to_selecte;
    private static final SubLSymbol $kw193$ADD_SPECS_TO_FACET_GO;
    private static final SubLList $list194;
    private static final SubLList $list195;
    private static final SubLSymbol $kw196$UNSUPPORTED_FACET_CHOSEN;
    private static final SubLString $str197$_A_assertions_must_currently_be_h;
    private static final SubLList $list198;
    private static final SubLSymbol $sym199$ADD_SPECS_TO_NEW_FACET;
    private static final SubLString $str200$__Make_a_new_facet_with_selected_;
    private static final SubLSymbol $kw201$ADD_SPECS_TO_NEW_FACET_GO;
    private static final SubLString $str202$New_facet_name__;
    private static final SubLString $str203$TypeBy;
    private static final SubLSymbol $kw204$NEW_FACET_NAME;
    private static final SubLString $str205$;
    private static final SubLString $str206$New_facet_type__;
    private static final SubLSymbol $kw207$NEW_FACET_TYPE;
    private static final SubLObject $const208$facets_Generic;
    private static final SubLString $str209$_generic_;
    private static final SubLObject $const210$facets_Strict;
    private static final SubLString $str211$_strict_;
    private static final SubLObject $const212$facets_Covering;
    private static final SubLString $str213$_covering_;
    private static final SubLObject $const214$facets_Partition;
    private static final SubLString $str215$_partition_;
    private static final SubLList $list216;
    private static final SubLList $list217;
    private static final SubLString $str218$_ATypeBy_A;
    private static final SubLList $list219;
    private static final SubLList $list220;
    private static final SubLList $list221;
    private static final SubLString $str222$A_collection_of_collections__Each;
    private static final SubLList $list223;
    private static final SubLSymbol $sym224$MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC;
    private static final SubLString $str225$__Make_selected_spec_s__direct_sp;
    private static final SubLSymbol $kw226$MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC_GO;
    private static final SubLString $str227$Collection_or_new_spec_name__;
    private static final SubLSymbol $kw228$NEW_SPEC_NAME;
    private static final SubLList $list229;
    private static final SubLList $list230;
    private static final SubLList $list231;
    private static final SubLSymbol $sym232$MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS;
    private static final SubLString $str233$__Make_selected_unfaceted_spec_s_;
    private static final SubLSymbol $kw234$MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS_GO;
    private static final SubLList $list235;
    private static final SubLList $list236;
    private static final SubLList $list237;
    private static final SubLSymbol $sym238$ADD_INSTANCES_TO_SPECS;
    private static final SubLString $str239$__Add_selected_instance_s__to_sel;
    private static final SubLSymbol $kw240$ADD_INSTANCES_TO_SPECS_GO;
    private static final SubLList $list241;
    private static final SubLList $list242;
    private static final SubLList $list243;
    private static final SubLSymbol $sym244$UNASSERT;
    private static final SubLList $list245;
    private static final SubLList $list246;
    private static final SubLObject $const247$CollectionTypeType;
    private static final SubLObject $const248$CollectionType;
    private static final SubLObject $const249$Individual;
    private static final SubLList $list250;
    private static final SubLSymbol $sym251$CHANGE_MT;
    private static final SubLSymbol $kw252$MT;
    private static final SubLString $str253$__Change_current_Mt_from_;
    private static final SubLSymbol $kw254$CHANGE_MT_GO;
    private static final SubLString $str255$_New_Mt_name__;
    private static final SubLInteger $int256$30;
    private static final SubLString $str257$Complete;
    private static final SubLObject $const258$Microtheory;
    private static final SubLSymbol $sym259$STRING_DOWNCASE;
    private static final SubLList $list260;
    private static final SubLString $str261$_A___A;
    private static final SubLString $str262$Errors_found_;
    private static final SubLSymbol $kw263$SUCCESSES;
    private static final SubLString $str264$Actions_taken_;
    private static final SubLSymbol $kw265$ASSERTED;
    private static final SubLString $str266$_A_in__A;
    private static final SubLSymbol $kw267$UNASSERTED;
    private static final SubLString $str268$_A_from__A;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 1916L)
    public static SubLObject cb_facet(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arghash = html_arghash.arglist_to_arghash(args);
        if (cb_facets.NIL == forts.fort_p(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash))) {
            html_arghash.set_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash, html_arghash.get_arghash_value((SubLObject)cb_facets.$kw13$JUST_FORT, arghash));
        }
        if (cb_facets.NIL == forts.fort_p(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash))) {
            html_utilities.html_princ((SubLObject)cb_facets.$str14$No_term_provided_);
            html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
            return (SubLObject)cb_facets.NIL;
        }
        arghash = perspective_actions_handler(arghash);
        final SubLObject title_var = cb_facets.$cb_facet_tool_name$.getGlobalValue();
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_facets.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_facets.$str15$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_facets.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.$str16$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_facets.$kw17$UNINITIALIZED) ? ConsesLow.list(cb_facets.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_facets.$kw18$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_facets.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_facets.$kw19$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_facets.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_facets.$str21$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_facets.$str22$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_facets.$str23$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_facets.$str24$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_facets.$str25$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            if (cb_facets.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_facets.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_facets.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_facets.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        }
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        dhtml_macros.dhtml_with_dom_script();
                        html_arghash_possibly_show_errors(arghash);
                        html_arghash_possibly_show_successes(arghash);
                        cb_browser.cb_term_page_heading(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash), (SubLObject)cb_facets.$sym10$VFACETS);
                        html_utilities.html_hr((SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                        if (cb_facets.NIL != operation_communication.transmittingP()) {
                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (cb_facets.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_facets.$str26$WARNING__You_are_transmitting_ope);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_facets.TWO_INTEGER);
                        }
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_facets.$kw27$POST);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_facets.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input(cb_facets.$cb_facet_tool_handler$.getGlobalValue(), (SubLObject)cb_facets.T, (SubLObject)cb_facets.UNPROVIDED);
                            html_arghash.html_arghash_hidden_input(arghash, (SubLObject)cb_facets.$kw12$FORT, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                            html_arghash.html_arghash_hidden_input(arghash, (SubLObject)cb_facets.$kw28$PERSPECTIVE, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                            arghash = display_perspective_actions_for_perspective((SubLObject)cb_facets.$kw29$GLOBAL_TOP, arghash);
                            final SubLObject perspective = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw28$PERSPECTIVE, arghash);
                            if (cb_facets.NIL != perspective) {
                                final SubLObject display_fn = perspective_display_fn(Hashtables.gethash(perspective, cb_facets.$perspectives_by_keyword$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED));
                                if (cb_facets.NIL != display_fn) {
                                    arghash = Functions.funcall(display_fn, arghash);
                                }
                                arghash = display_perspective_actions_for_perspective(perspective, arghash);
                            }
                            arghash = display_perspective_actions_for_perspective((SubLObject)cb_facets.$kw30$GLOBAL_BOTTOM, arghash);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4092L)
    public static SubLObject cb_facet_form(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = cb_utilities.$cb_default_fort_handler$.currentBinding(thread);
        try {
            cb_utilities.$cb_default_fort_handler$.bind(cb_facets.$cb_facet_tool_handler$.getGlobalValue(), thread);
            cb_utilities.cb_form(v_object, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
        }
        finally {
            cb_utilities.$cb_default_fort_handler$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject perspective_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_perspective(v_object, stream, (SubLObject)cb_facets.ZERO_INTEGER);
        return (SubLObject)cb_facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject perspective_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $perspective_native.class) ? cb_facets.T : cb_facets.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject perspective_name(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject perspective_keyword(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject perspective_displayP_fn(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject perspective_display_fn(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject perspective_display_string(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject _csetf_perspective_name(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject _csetf_perspective_keyword(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject _csetf_perspective_displayP_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject _csetf_perspective_display_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject _csetf_perspective_display_string(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject make_perspective(SubLObject arglist) {
        if (arglist == cb_facets.UNPROVIDED) {
            arglist = (SubLObject)cb_facets.NIL;
        }
        final SubLObject v_new = (SubLObject)new $perspective_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_facets.NIL, next = arglist; cb_facets.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_facets.$kw52$NAME)) {
                _csetf_perspective_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw53$KEYWORD)) {
                _csetf_perspective_keyword(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw54$DISPLAY__FN)) {
                _csetf_perspective_displayP_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw55$DISPLAY_FN)) {
                _csetf_perspective_display_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw56$DISPLAY_STRING)) {
                _csetf_perspective_display_string(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_facets.$str57$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject visit_defstruct_perspective(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw58$BEGIN, (SubLObject)cb_facets.$sym59$MAKE_PERSPECTIVE, (SubLObject)cb_facets.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw52$NAME, perspective_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw53$KEYWORD, perspective_keyword(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw54$DISPLAY__FN, perspective_displayP_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw55$DISPLAY_FN, perspective_display_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw56$DISPLAY_STRING, perspective_display_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw61$END, (SubLObject)cb_facets.$sym59$MAKE_PERSPECTIVE, (SubLObject)cb_facets.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 4337L)
    public static SubLObject visit_defstruct_object_perspective_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_perspective(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 5429L)
    public static SubLObject print_perspective(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_facets.NIL != print_high.$print_level$.getDynamicValue(thread) && depth.numG(print_high.$print_level$.getDynamicValue(thread))) {
            print_high.princ((SubLObject)cb_facets.$str64$_, stream);
        }
        else if (cb_facets.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)cb_facets.T, (SubLObject)cb_facets.T);
            print_high.princ(perspective_name(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)cb_facets.NIL, (SubLObject)cb_facets.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 5688L)
    public static SubLObject defperspective(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cb_facets.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_facets.$list65);
        name = current.first();
        final SubLObject arglist;
        current = (arglist = current.rest());
        final SubLObject new_perspective = (SubLObject)cb_facets.$sym66$NEW_PERSPECTIVE;
        return (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym67$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_perspective, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym59$MAKE_PERSPECTIVE, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym68$QUOTE, arglist)))), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym69$CSETF, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym42$PERSPECTIVE_NAME, new_perspective), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym68$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym70$SETHASH, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym44$PERSPECTIVE_KEYWORD, new_perspective), (SubLObject)cb_facets.$sym71$_PERSPECTIVES_BY_KEYWORD_, new_perspective), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym72$CSETQ, (SubLObject)cb_facets.$sym73$_PERSPECTIVES_, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym74$CONS, new_perspective, (SubLObject)ConsesLow.listS((SubLObject)cb_facets.$sym75$DELETE, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym68$QUOTE, name), (SubLObject)cb_facets.$list76))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 6273L)
    public static SubLObject perspective_from_keyword(final SubLObject perspective_keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject perspective = Hashtables.gethash(perspective_keyword, cb_facets.$perspectives_by_keyword$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED);
        return perspective;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 6441L)
    public static SubLObject relevant_perspectives(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevant_perspectives = (SubLObject)cb_facets.NIL;
        SubLObject cdolist_list_var = cb_facets.$perspectives$.getDynamicValue(thread);
        SubLObject perspective = (SubLObject)cb_facets.NIL;
        perspective = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            final SubLObject perspective_test = perspective_displayP_fn(perspective);
            if (cb_facets.NIL != Functions.funcall(perspective_test, arghash)) {
                relevant_perspectives = (SubLObject)ConsesLow.cons(perspective, relevant_perspectives);
            }
            cdolist_list_var = cdolist_list_var.rest();
            perspective = cdolist_list_var.first();
        }
        return Sequences.nreverse(relevant_perspectives);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 6777L)
    public static SubLObject perspective_from_keyword_relevantP(final SubLObject perspective_keyword, final SubLObject arghash) {
        final SubLObject perspective = perspective_from_keyword(perspective_keyword);
        if (cb_facets.NIL == perspective_p(perspective)) {
            return (SubLObject)cb_facets.NIL;
        }
        final SubLObject perspective_displayP_fn = perspective_displayP_fn(perspective);
        return Functions.funcall(perspective_displayP_fn, arghash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 7814L)
    public static SubLObject show_as_individualP(final SubLObject arghash) {
        return (SubLObject)cb_facets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 7891L)
    public static SubLObject html_show_as_individual(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
        final SubLObject v_facets = facets.all_facets_with_mt(fort, cb_facets.$facet_tool_mt$.getDynamicValue(thread));
        if (cb_facets.NIL != v_facets) {
            SubLObject cdolist_list_var = v_facets;
            SubLObject facet = (SubLObject)cb_facets.NIL;
            facet = cdolist_list_var.first();
            while (cb_facets.NIL != cdolist_list_var) {
                html_utilities.html_flush();
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                if (cb_facets.NIL != html_macros.$html_color_light_purple$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_light_purple$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_print_facet_block(fort, facet, arghash);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                facet = cdolist_list_var.first();
            }
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 8302L)
    public static SubLObject html_print_facet_block(final SubLObject fort, final SubLObject facet, SubLObject arghash) {
        if (arghash == cb_facets.UNPROVIDED) {
            arghash = (SubLObject)cb_facets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject facet_instances = facets.facet_instances(facet, cb_facets.$facet_tool_mt$.getDynamicValue(thread));
        final SubLObject facet_strength = facets.facet_strength(facet);
        final SubLObject facet_col_type = facets.facet_col_type(facet);
        final SubLObject facet_id = facets.facet_id(facet);
        html_arghash.html_arghash_hidden_input_force(arghash, (SubLObject)cb_facets.$kw81$A_FACET, facet_id, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject sup_facet_cols = facets.current_fort_faceting(fort, facet, cb_facets.$facet_tool_mt$.getDynamicValue(thread));
        final SubLObject not_sup_facet_cols = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (Sequences.length(facet_instances).numL((SubLObject)cb_facets.TWENTY_INTEGER)) {
            facet_instances = Sort.sort(facet_instances, Symbols.symbol_function((SubLObject)cb_facets.$sym82$GENERALITY_ESTIMATE_), (SubLObject)cb_facets.UNPROVIDED);
        }
        else {
            facet_instances = Sort.sort(facet_instances, Symbols.symbol_function((SubLObject)cb_facets.$sym83$FORT_NAME_), (SubLObject)cb_facets.UNPROVIDED);
        }
        final SubLObject unknown_facet_cols = Sequences.nreverse(conses_high.set_difference(facet_instances, ConsesLow.append(sup_facet_cols, not_sup_facet_cols), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED));
        SubLObject more_cols = (SubLObject)cb_facets.NIL;
        final SubLObject col_1_width = (SubLObject)cb_facets.$str84$6_;
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_facets.TWO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                if (cb_facets.NIL != unknown_facet_cols) {
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    cb_facet_form(facet);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                else {
                    cb_facet_form(facet);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        SubLObject cdolist_list_var = sup_facet_cols;
        SubLObject sup_facet_col = (SubLObject)cb_facets.NIL;
        sup_facet_col = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            final SubLObject isa_assertion = kb_indexing.find_gaf_any_mt((SubLObject)ConsesLow.list(cb_facets.$const85$isa, fort, sup_facet_col));
            if (cb_facets.NIL != isa_assertion) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw86$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    if (cb_facets.NIL != col_1_width) {
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(col_1_width);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        cb_utilities.cb_link((SubLObject)cb_facets.$kw87$ASSERTION, isa_assertion, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        cb_facet_form(sup_facet_col);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
            }
            else {
                more_cols = (SubLObject)ConsesLow.cons(sup_facet_col, more_cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sup_facet_col = cdolist_list_var.first();
        }
        more_cols = (cdolist_list_var = Sequences.nreverse(more_cols));
        SubLObject more_col = (SubLObject)cb_facets.NIL;
        more_col = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw86$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                if (cb_facets.NIL != col_1_width) {
                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(col_1_width);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_facets.$str89$i_);
                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    cb_facet_form(more_col);
                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            more_col = cdolist_list_var.first();
        }
        if (cb_facets.TEN_INTEGER.numGE(Sequences.length(unknown_facet_cols))) {
            final SubLObject disjoint_facetP = conses_high.member(facet_strength, facets.$facet_predicates_disjoint$.getGlobalValue(), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
            SubLObject cdolist_list_var2 = unknown_facet_cols;
            SubLObject unknown_facet_col = (SubLObject)cb_facets.NIL;
            unknown_facet_col = cdolist_list_var2.first();
            while (cb_facets.NIL != cdolist_list_var2) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw86$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    if (cb_facets.NIL != col_1_width) {
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(col_1_width);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        if (cb_facets.NIL != disjoint_facetP) {
                            html_arghash.html_arghash_radio_input(arghash, facet_id, unknown_facet_col);
                        }
                        else {
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw90$ADD_SUP, unknown_facet_col, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                        }
                        html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        cb_facet_form(unknown_facet_col);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                cdolist_list_var2 = cdolist_list_var2.rest();
                unknown_facet_col = cdolist_list_var2.first();
            }
        }
        else {
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw86$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                if (cb_facets.NIL != col_1_width) {
                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(col_1_width);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw91$ADD_SUP_FROM, facet_col_type, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    final SubLObject key_string = html_arghash.arghash_make_key_string(facet_col_type, (SubLObject)cb_facets.$kw12$FORT);
                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(key_string);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    if (cb_facets.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        SubLObject cdolist_list_var3 = unknown_facet_cols;
                        SubLObject unknown_facet_col2 = (SubLObject)cb_facets.NIL;
                        unknown_facet_col2 = cdolist_list_var3.first();
                        while (cb_facets.NIL != cdolist_list_var3) {
                            final SubLObject selected = list_utilities.member_equalP(unknown_facet_col2, html_arghash.get_arghash_value_list(facet_col_type, arghash));
                            final SubLObject value_string = html_arghash.arghash_get_string(unknown_facet_col2, (SubLObject)cb_facets.$kw92$DEFAULT);
                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                            if (cb_facets.NIL != selected) {
                                html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                            }
                            if (cb_facets.NIL != value_string) {
                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_markup(value_string);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_utilities.html_princ(kb_paths.fort_name(unknown_facet_col2));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            unknown_facet_col2 = cdolist_list_var3.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        }
        more_cols = (SubLObject)cb_facets.NIL;
        cdolist_list_var = not_sup_facet_cols;
        SubLObject not_sup_facet_col = (SubLObject)cb_facets.NIL;
        not_sup_facet_col = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            final SubLObject not_isa_assertion = kb_indexing.find_gaf_any_mt((SubLObject)ConsesLow.list(cb_facets.$const85$isa, fort, not_sup_facet_col));
            if (cb_facets.NIL != not_isa_assertion) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw86$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    if (cb_facets.NIL != col_1_width) {
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(col_1_width);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        cb_utilities.cb_link((SubLObject)cb_facets.$kw87$ASSERTION, not_isa_assertion, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
                        cb_facet_form(not_sup_facet_col);
                        html_utilities.html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
            }
            else {
                more_cols = (SubLObject)ConsesLow.cons(not_sup_facet_col, more_cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            not_sup_facet_col = cdolist_list_var.first();
        }
        more_cols = Sequences.nreverse(more_cols);
        if (cb_facets.TEN_INTEGER.numGE(Sequences.length(more_cols))) {
            cdolist_list_var = more_cols;
            more_col = (SubLObject)cb_facets.NIL;
            more_col = cdolist_list_var.first();
            while (cb_facets.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw86$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    if (cb_facets.NIL != col_1_width) {
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(col_1_width);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_princ((SubLObject)cb_facets.$str93$x_);
                        html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_strikethrough_head$.getGlobalValue());
                        cb_facet_form(more_col);
                        html_utilities.html_markup(html_macros.$html_strikethrough_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_3, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                more_col = cdolist_list_var.first();
            }
        }
        else {
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw86$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                if (cb_facets.NIL != col_1_width) {
                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(col_1_width);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_princ((SubLObject)cb_facets.$str93$x_);
                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    final SubLObject select_name = cb_utilities.cb_fort_identifier(facet_col_type);
                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(select_name);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    if (cb_facets.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                        html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        SubLObject cdolist_list_var3 = more_cols;
                        SubLObject more_col2 = (SubLObject)cb_facets.NIL;
                        more_col2 = cdolist_list_var3.first();
                        while (cb_facets.NIL != cdolist_list_var3) {
                            final SubLObject select_value = cb_utilities.cb_fort_identifier(more_col2);
                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                            if (cb_facets.NIL != select_value) {
                                html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_markup(select_value);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_utilities.html_princ(kb_paths.fort_name(more_col2));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            more_col2 = cdolist_list_var3.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        }
        return (SubLObject)cb_facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 13365L)
    public static SubLObject show_as_collectionP(final SubLObject arghash) {
        return fort_types_interface.collectionP(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 13469L)
    public static SubLObject html_show_as_collection(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
        final SubLObject asserted_genls_links = facets.asserted_links(fort, cb_facets.$const96$genls, (SubLObject)cb_facets.NIL, cb_facets.$facet_tool_mt$.getDynamicValue(thread));
        final SubLObject asserted_genls = conses_high.getf(asserted_genls_links, (SubLObject)cb_facets.$kw97$ASSERTED_TRUE, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject coextensional = conses_high.getf(asserted_genls_links, (SubLObject)cb_facets.$kw98$COEXTENSIONAL, (SubLObject)cb_facets.UNPROVIDED);
        if (cb_facets.NIL != asserted_genls) {
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            if (cb_facets.NIL != html_macros.$html_color_light_green$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_color_light_green$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_facets.$str99$__genls__);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_facets.$str100$in_Mt);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str101$Unassert, (SubLObject)cb_facets.$kw102$UNASSERT_GO, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                SubLObject cdolist_list_var = asserted_genls;
                SubLObject asserted_genl = (SubLObject)cb_facets.NIL;
                asserted_genl = cdolist_list_var.first();
                while (cb_facets.NIL != cdolist_list_var) {
                    final SubLObject genls_assertion = kb_indexing.find_gaf_possibly_in_mt((SubLObject)ConsesLow.list(cb_facets.$const96$genls, fort, asserted_genl), cb_facets.$facet_tool_mt$.getDynamicValue(thread));
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (cb_facets.NIL != html_macros.$html_color_lighter_green$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_color_lighter_green$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                            if (cb_facets.NIL != genls_assertion) {
                                cb_utilities.cb_link((SubLObject)cb_facets.$kw87$ASSERTION, genls_assertion, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_facets.ONE_INTEGER);
                            }
                            cb_facet_form(asserted_genl);
                            if (cb_facets.NIL != subl_promotions.memberP(asserted_genl, coextensional, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)) {
                                html_utilities.html_princ((SubLObject)cb_facets.$str103$__coextensional_);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            cb_facet_form(assertions_high.assertion_mt(genls_assertion));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw104$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            if (cb_facets.NIL != assertion_handles.assertion_p(genls_assertion)) {
                                html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw105$UNASSERT_ID, assertion_handles.assertion_id(genls_assertion), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    asserted_genl = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_facets.$sym106$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(cb_facets.$facet_tool_mt$.getDynamicValue(thread), thread);
            final SubLObject v_facets = facets.facets_from_cols((SubLObject)ConsesLow.list(fort), cb_facets.$facet_tool_mt$.getDynamicValue(thread));
            SubLObject specs_faceted = (SubLObject)cb_facets.NIL;
            SubLObject specs_unfaceted = (SubLObject)cb_facets.NIL;
            SubLObject num_specs_unfaceted_not_shown = (SubLObject)cb_facets.ZERO_INTEGER;
            final SubLObject asserted_specs = genls.asserted_specs(fort, cb_facets.$facet_tool_mt$.getDynamicValue(thread));
            if (cb_facets.NIL != v_facets) {
                html_arghash.set_arghash_value((SubLObject)cb_facets.$kw107$FACETS_, arghash, (SubLObject)cb_facets.T);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                if (cb_facets.NIL != html_macros.$html_color_light_purple$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_light_purple$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_facets.$str108$__faceted_specs__);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_facets.$str100$in_Mt);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str101$Unassert, (SubLObject)cb_facets.$kw102$UNASSERT_GO, (SubLObject)cb_facets.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                    SubLObject cdolist_list_var2 = v_facets;
                    SubLObject facet = (SubLObject)cb_facets.NIL;
                    facet = cdolist_list_var2.first();
                    while (cb_facets.NIL != cdolist_list_var2) {
                        final SubLObject facet_col_type = facets.facet_col_type(facet);
                        final SubLObject facet_instances = facets.facet_instances(facet, cb_facets.$facet_tool_mt$.getDynamicValue(thread));
                        final SubLObject facet_id = facets.facet_id(facet);
                        final SubLObject facet_mt = facets.facet_mt(facet);
                        final SubLObject facet_assertion = facets.facet_assertion(facet);
                        specs_faceted = ConsesLow.append(specs_faceted, conses_high.copy_list(facet_instances));
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_arghash.html_arghash_hidden_input_force(arghash, (SubLObject)cb_facets.$kw109$FACET_ID, facet_id, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_facets.$kw110$FACET_ID_SELECTED, facet_id);
                                html_utilities.html_indent((SubLObject)cb_facets.UNPROVIDED);
                                cb_facet_form(facet);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                cb_facet_form(facet_mt);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw104$CENTER));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                if (cb_facets.NIL != assertion_handles.assertion_p(facet_assertion)) {
                                    html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw105$UNASSERT_ID, assertion_handles.assertion_id(facet_assertion), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.THREE_INTEGER);
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                        SubLObject cdolist_list_var_$43 = Sort.sort(facet_instances, Symbols.symbol_function((SubLObject)cb_facets.$sym82$GENERALITY_ESTIMATE_), (SubLObject)cb_facets.UNPROVIDED);
                        SubLObject facet_instance = (SubLObject)cb_facets.NIL;
                        facet_instance = cdolist_list_var_$43.first();
                        while (cb_facets.NIL != cdolist_list_var_$43) {
                            final SubLObject isa_assertion = kb_indexing.find_gaf_possibly_in_mt((SubLObject)ConsesLow.list(cb_facets.$const85$isa, facet_instance, facet_col_type), cb_facets.$facet_tool_mt$.getDynamicValue(thread));
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                    html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                                    html_arghash.html_arghash_hidden_input(arghash, Symbols.make_keyword(PrintLow.format((SubLObject)cb_facets.NIL, (SubLObject)cb_facets.$str111$_A_SPEC, facet_id)), facet_instance, (SubLObject)cb_facets.UNPROVIDED);
                                    html_arghash.html_arghash_checkbox_input(arghash, Symbols.make_keyword(PrintLow.format((SubLObject)cb_facets.NIL, (SubLObject)cb_facets.$str112$_A_SPEC_SELECTED, facet_id)), facet_instance, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                                    if (cb_facets.NIL != assertion_handles.assertion_p(isa_assertion)) {
                                        cb_utilities.cb_link((SubLObject)cb_facets.$kw87$ASSERTION, isa_assertion, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                    }
                                    cb_facet_form(facet_instance);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                    if (cb_facets.NIL != assertion_handles.assertion_p(isa_assertion)) {
                                        html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.TWO_INTEGER);
                                        cb_facet_form(assertions_high.assertion_mt(isa_assertion));
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw104$CENTER));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                    if (cb_facets.NIL != assertion_handles.assertion_p(isa_assertion)) {
                                        html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.THREE_INTEGER);
                                        html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw105$UNASSERT_ID, assertion_handles.assertion_id(isa_assertion), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                            cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                            facet_instance = cdolist_list_var_$43.first();
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        facet = cdolist_list_var2.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
            }
            if (cb_facets.NIL != specs_faceted) {
                html_arghash.set_arghash_value((SubLObject)cb_facets.$kw113$SPECS_FACETED_, arghash, (SubLObject)cb_facets.T);
            }
            html_utilities.html_flush();
            specs_unfaceted = conses_high.set_difference(asserted_specs, specs_faceted, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
            if (cb_facets.NIL != specs_unfaceted) {
                specs_unfaceted = Sort.sort(specs_unfaceted, Symbols.symbol_function((SubLObject)cb_facets.$sym82$GENERALITY_ESTIMATE_), (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject num_specs_unfaceted = Sequences.length(specs_unfaceted);
                if (num_specs_unfaceted.numG((SubLObject)cb_facets.$int114$200)) {
                    num_specs_unfaceted_not_shown = Numbers.subtract(num_specs_unfaceted, (SubLObject)cb_facets.$int114$200);
                    specs_unfaceted = list_utilities.first_n((SubLObject)cb_facets.$int115$100, specs_unfaceted);
                }
                html_arghash.set_arghash_value((SubLObject)cb_facets.$kw116$SPECS_UNFACETED_, arghash, (SubLObject)cb_facets.T);
                final SubLObject show_next_levelP = Numbers.numL(Sequences.length(specs_unfaceted), (SubLObject)cb_facets.TWENTY_INTEGER);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                if (cb_facets.NIL != html_macros.$html_color_light_purple$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_light_purple$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_facets.$str117$__unfaceted_specs__);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_facets.$str100$in_Mt);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str101$Unassert, (SubLObject)cb_facets.$kw102$UNASSERT_GO, (SubLObject)cb_facets.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                    SubLObject cdolist_list_var3 = specs_unfaceted;
                    SubLObject spec_unfaceted = (SubLObject)cb_facets.NIL;
                    spec_unfaceted = cdolist_list_var3.first();
                    while (cb_facets.NIL != cdolist_list_var3) {
                        final SubLObject possible_gaf = kb_indexing.find_gaf_possibly_in_mt((SubLObject)ConsesLow.list(cb_facets.$const96$genls, spec_unfaceted, fort), cb_facets.$facet_tool_mt$.getDynamicValue(thread));
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                                html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw118$SPEC_UNFACETED, spec_unfaceted, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_facets.UNPROVIDED);
                                if (cb_facets.NIL != assertion_handles.assertion_p(possible_gaf)) {
                                    cb_utilities.cb_link((SubLObject)cb_facets.$kw87$ASSERTION, possible_gaf, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                    html_utilities.html_indent((SubLObject)cb_facets.UNPROVIDED);
                                }
                                cb_facet_form(spec_unfaceted);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                if (cb_facets.NIL != assertion_handles.assertion_p(possible_gaf)) {
                                    cb_facet_form(assertions_high.assertion_mt(possible_gaf));
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw104$CENTER));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                if (cb_facets.NIL != assertion_handles.assertion_p(possible_gaf)) {
                                    html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw105$UNASSERT_ID, assertion_handles.assertion_id(possible_gaf), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.THREE_INTEGER);
                                }
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
                        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                        if (cb_facets.NIL != show_next_levelP) {
                            SubLObject sub_specs = genls.asserted_specs(spec_unfaceted, cb_facets.$facet_tool_mt$.getDynamicValue(thread));
                            if (Sequences.length(sub_specs).numL((SubLObject)cb_facets.TWENTY_INTEGER)) {
                                SubLObject cdolist_list_var_$44;
                                sub_specs = (cdolist_list_var_$44 = Sort.sort(sub_specs, Symbols.symbol_function((SubLObject)cb_facets.$sym82$GENERALITY_ESTIMATE_), (SubLObject)cb_facets.UNPROVIDED));
                                SubLObject sub_spec = (SubLObject)cb_facets.NIL;
                                sub_spec = cdolist_list_var_$44.first();
                                while (cb_facets.NIL != cdolist_list_var_$44) {
                                    final SubLObject possible_gaf2 = kb_indexing.find_gaf_possibly_in_mt((SubLObject)ConsesLow.list(cb_facets.$const96$genls, sub_spec, spec_unfaceted), cb_facets.$facet_tool_mt$.getDynamicValue(thread));
                                    if (cb_facets.NIL == subl_promotions.memberP(sub_spec, specs_faceted, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)) {
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        if (cb_facets.NIL != html_macros.$html_color_lighter_purple$.getGlobalValue()) {
                                            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                            html_utilities.html_markup(html_macros.$html_color_lighter_purple$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                        }
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                                html_utilities.html_indent((SubLObject)cb_facets.EIGHT_INTEGER);
                                                html_utilities.html_princ((SubLObject)cb_facets.$str119$____);
                                                html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw118$SPEC_UNFACETED, sub_spec, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                                if (cb_facets.NIL != assertion_handles.assertion_p(possible_gaf2)) {
                                                    cb_utilities.cb_link((SubLObject)cb_facets.$kw87$ASSERTION, possible_gaf2, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                                    html_utilities.html_indent((SubLObject)cb_facets.UNPROVIDED);
                                                }
                                                html_utilities.html_indent((SubLObject)cb_facets.UNPROVIDED);
                                                cb_facet_form(sub_spec);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                                if (cb_facets.NIL != assertion_handles.assertion_p(possible_gaf2)) {
                                                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.TWO_INTEGER);
                                                    cb_facet_form(assertions_high.assertion_mt(possible_gaf2));
                                                }
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                            html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw104$CENTER));
                                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                                if (cb_facets.NIL != assertion_handles.assertion_p(possible_gaf2)) {
                                                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.THREE_INTEGER);
                                                    html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw105$UNASSERT_ID, assertion_handles.assertion_id(possible_gaf2), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                                }
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                                    }
                                    cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                                    sub_spec = cdolist_list_var_$44.first();
                                }
                            }
                        }
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        spec_unfaceted = cdolist_list_var3.first();
                    }
                    if (num_specs_unfaceted_not_shown.numG((SubLObject)cb_facets.ZERO_INTEGER)) {
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_facets.THREE_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                                html_utilities.html_princ(num_specs_unfaceted_not_shown);
                                html_utilities.html_princ((SubLObject)cb_facets.$str120$_unfaceted_specs_not_shown_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            html_utilities.html_flush();
            if (cb_facets.NIL != isa.isaP(fort, cb_facets.$const121$Collection, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)) {
                SubLObject v_instances = isa.instances(fort, cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject cols_per_row = (SubLObject)cb_facets.FOUR_INTEGER;
                SubLObject ok_instances = (SubLObject)cb_facets.NIL;
                SubLObject cdolist_list_var4 = v_instances;
                SubLObject i = (SubLObject)cb_facets.NIL;
                i = cdolist_list_var4.first();
                while (cb_facets.NIL != cdolist_list_var4) {
                    if (cb_facets.NIL != forts.fort_p(i)) {
                        ok_instances = (SubLObject)ConsesLow.cons(i, ok_instances);
                    }
                    cdolist_list_var4 = cdolist_list_var4.rest();
                    i = cdolist_list_var4.first();
                }
                v_instances = Sequences.nreverse(ok_instances);
                if (cb_facets.NIL != v_instances) {
                    html_arghash.set_arghash_value((SubLObject)cb_facets.$kw122$INSTANCES_, arghash, (SubLObject)cb_facets.T);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    if (cb_facets.NIL != html_macros.$html_color_light_yellow$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_color_light_yellow$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (cb_facets.NIL != cols_per_row) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_markup(cols_per_row);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)cb_facets.$str123$__instances__);
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                        SubLObject sorted_instances = Sort.sort(v_instances, Symbols.symbol_function((SubLObject)cb_facets.$sym82$GENERALITY_ESTIMATE_), (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject num_instances = Sequences.length(sorted_instances);
                        final SubLObject max_instances_shown = Numbers.multiply((SubLObject)cb_facets.TWENTY_INTEGER, Numbers.subtract(cols_per_row, (SubLObject)cb_facets.ONE_INTEGER));
                        SubLObject cur_instances_shown = (SubLObject)cb_facets.ZERO_INTEGER;
                        SubLObject doneP = (SubLObject)cb_facets.NIL;
                        while (cb_facets.NIL == doneP) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            if (cb_facets.NIL != html_macros.$html_color_lighter_yellow$.getGlobalValue()) {
                                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_color_lighter_yellow$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.FIVE_INTEGER);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                SubLObject cols_left = Numbers.subtract(cols_per_row, (SubLObject)cb_facets.ONE_INTEGER);
                                while (cb_facets.ZERO_INTEGER.numL(cols_left)) {
                                    cols_left = Numbers.subtract(cols_left, (SubLObject)cb_facets.ONE_INTEGER);
                                    if (cb_facets.NIL == doneP) {
                                        final SubLObject instance = sorted_instances.first();
                                        sorted_instances = sorted_instances.rest();
                                        cur_instances_shown = Numbers.add(cur_instances_shown, (SubLObject)cb_facets.ONE_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw124$INSTANCE, instance, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                            html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                                            cb_facet_form(instance);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    else {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                            html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    if (cur_instances_shown.numGE(max_instances_shown) || cur_instances_shown.numGE(num_instances)) {
                                        doneP = (SubLObject)cb_facets.T;
                                    }
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                        }
                        final SubLObject num_instances_not_shown = Numbers.subtract(num_instances, max_instances_shown);
                        if (cb_facets.ZERO_INTEGER.numL(num_instances_not_shown)) {
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (cb_facets.NIL != cols_per_row) {
                                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_markup(cols_per_row);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                            final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                                html_utilities.html_princ(num_instances_not_shown);
                                html_utilities.html_princ((SubLObject)cb_facets.$str125$_instances_not_shown_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
            }
            html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_perspective_action(v_object, stream, (SubLObject)cb_facets.ZERO_INTEGER);
        return (SubLObject)cb_facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $perspective_action_native.class) ? cb_facets.T : cb_facets.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_name(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_keyword(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_order_num(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_perspective(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_displayP_fn(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_display_fn(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_handlerP_fn(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject perspective_action_handler_fn(final SubLObject v_object) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject _csetf_perspective_action_name(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject _csetf_perspective_action_keyword(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject _csetf_perspective_action_order_num(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject _csetf_perspective_action_perspective(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject _csetf_perspective_action_displayP_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject _csetf_perspective_action_display_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject _csetf_perspective_action_handlerP_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject _csetf_perspective_action_handler_fn(final SubLObject v_object, final SubLObject value) {
        assert cb_facets.NIL != perspective_action_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject make_perspective_action(SubLObject arglist) {
        if (arglist == cb_facets.UNPROVIDED) {
            arglist = (SubLObject)cb_facets.NIL;
        }
        final SubLObject v_new = (SubLObject)new $perspective_action_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)cb_facets.NIL, next = arglist; cb_facets.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)cb_facets.$kw52$NAME)) {
                _csetf_perspective_action_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw53$KEYWORD)) {
                _csetf_perspective_action_keyword(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw151$ORDER_NUM)) {
                _csetf_perspective_action_order_num(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw28$PERSPECTIVE)) {
                _csetf_perspective_action_perspective(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw54$DISPLAY__FN)) {
                _csetf_perspective_action_displayP_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw55$DISPLAY_FN)) {
                _csetf_perspective_action_display_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw152$HANDLER__FN)) {
                _csetf_perspective_action_handlerP_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)cb_facets.$kw153$HANDLER_FN)) {
                _csetf_perspective_action_handler_fn(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)cb_facets.$str57$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject visit_defstruct_perspective_action(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw58$BEGIN, (SubLObject)cb_facets.$sym154$MAKE_PERSPECTIVE_ACTION, (SubLObject)cb_facets.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw52$NAME, perspective_action_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw53$KEYWORD, perspective_action_keyword(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw151$ORDER_NUM, perspective_action_order_num(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw28$PERSPECTIVE, perspective_action_perspective(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw54$DISPLAY__FN, perspective_action_displayP_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw55$DISPLAY_FN, perspective_action_display_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw152$HANDLER__FN, perspective_action_handlerP_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw60$SLOT, (SubLObject)cb_facets.$kw153$HANDLER_FN, perspective_action_handler_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)cb_facets.$kw61$END, (SubLObject)cb_facets.$sym154$MAKE_PERSPECTIVE_ACTION, (SubLObject)cb_facets.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 23087L)
    public static SubLObject visit_defstruct_object_perspective_action_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_perspective_action(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 24280L)
    public static SubLObject print_perspective_action(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_facets.NIL != print_high.$print_level$.getDynamicValue(thread) && depth.numG(print_high.$print_level$.getDynamicValue(thread))) {
            print_high.princ((SubLObject)cb_facets.$str64$_, stream);
        }
        else if (cb_facets.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)cb_facets.T, (SubLObject)cb_facets.T);
            print_high.princ(perspective_action_name(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)cb_facets.NIL, (SubLObject)cb_facets.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 24553L)
    public static SubLObject defperspective_action(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cb_facets.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_facets.$list65);
        name = current.first();
        final SubLObject arglist;
        current = (arglist = current.rest());
        final SubLObject new_perspective_action = (SubLObject)cb_facets.$sym156$NEW_PERSPECTIVE_ACTION;
        return (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym67$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_perspective_action, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym154$MAKE_PERSPECTIVE_ACTION, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym68$QUOTE, arglist)))), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym69$CSETF, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME, new_perspective_action), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym68$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym72$CSETQ, (SubLObject)cb_facets.$sym157$_PERSPECTIVE_ACTIONS_, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym74$CONS, new_perspective_action, (SubLObject)ConsesLow.listS((SubLObject)cb_facets.$sym75$DELETE, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$sym68$QUOTE, name), (SubLObject)cb_facets.$list158))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 24990L)
    public static SubLObject perspective_actions() {
        return cb_facets.$perspective_actions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 25060L)
    public static SubLObject sort_perspective_actions(final SubLObject perspective_actions) {
        return Sort.sort(perspective_actions, Symbols.symbol_function((SubLObject)cb_facets.$sym159$_), Symbols.symbol_function((SubLObject)cb_facets.$sym139$PERSPECTIVE_ACTION_ORDER_NUM));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 25194L)
    public static SubLObject sorted_perspective_actions_for_perspective(final SubLObject perspective) {
        SubLObject result = (SubLObject)cb_facets.NIL;
        SubLObject cdolist_list_var = perspective_actions();
        SubLObject poss_perspective_action = (SubLObject)cb_facets.NIL;
        poss_perspective_action = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            final SubLObject perspective_action_perspective = perspective_action_perspective(poss_perspective_action);
            if (perspective.eql(perspective_action_perspective)) {
                result = (SubLObject)ConsesLow.cons(poss_perspective_action, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            poss_perspective_action = cdolist_list_var.first();
        }
        return sort_perspective_actions(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 25596L)
    public static SubLObject display_perspective_actions_for_perspective(final SubLObject perspective, SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject perspective_actions = sorted_perspective_actions_for_perspective(perspective);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        if (cb_facets.NIL != html_macros.$html_color_light_grey$.getGlobalValue()) {
            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_color_light_grey$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            SubLObject cdolist_list_var = perspective_actions;
            SubLObject perspective_action = (SubLObject)cb_facets.NIL;
            perspective_action = cdolist_list_var.first();
            while (cb_facets.NIL != cdolist_list_var) {
                if (cb_facets.NIL != perspective_action_p(perspective_action)) {
                    final SubLObject perspective_action_displayP_fn = perspective_action_displayP_fn(perspective_action);
                    final SubLObject perspective_action_display_fn = perspective_action_display_fn(perspective_action);
                    if (perspective_action_displayP_fn.isFunctionSpec() && perspective_action_display_fn.isFunctionSpec() && cb_facets.NIL != Functions.funcall(perspective_action_displayP_fn, arghash)) {
                        arghash = Functions.funcall(perspective_action_display_fn, arghash);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                perspective_action = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 26562L)
    public static SubLObject perspective_actions_handler(SubLObject arghash) {
        SubLObject cdolist_list_var = cb_facets.$perspective_actions$.getGlobalValue();
        SubLObject perspective_action = (SubLObject)cb_facets.NIL;
        perspective_action = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            final SubLObject perspective_action_handlerP_fn = perspective_action_handlerP_fn(perspective_action);
            final SubLObject perspective_action_handler_fn = perspective_action_handler_fn(perspective_action);
            if (perspective_action_handlerP_fn.isFunctionSpec() && perspective_action_handler_fn.isFunctionSpec() && cb_facets.NIL != Functions.funcall(perspective_action_handlerP_fn, arghash)) {
                arghash = Functions.funcall(perspective_action_handler_fn, arghash);
            }
            cdolist_list_var = cdolist_list_var.rest();
            perspective_action = cdolist_list_var.first();
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 27763L)
    public static SubLObject perspective_action_change_perspective_displayP(final SubLObject arghash) {
        return (SubLObject)cb_facets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 27884L)
    public static SubLObject perspective_action_change_perspective_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        if (cb_facets.NIL != html_macros.$html_color_light_grey$.getGlobalValue()) {
            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_color_light_grey$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            SubLObject shown_perspective_keywords = (SubLObject)cb_facets.NIL;
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    SubLObject cdolist_list_var = conses_high.getf(cb_facets.$perspective_type_sort$.getDynamicValue(thread), (SubLObject)cb_facets.$kw165$DISPLAY, (SubLObject)cb_facets.UNPROVIDED);
                    SubLObject perspective_keyword = (SubLObject)cb_facets.NIL;
                    perspective_keyword = cdolist_list_var.first();
                    while (cb_facets.NIL != cdolist_list_var) {
                        final SubLObject item_var = perspective_keyword;
                        if (cb_facets.NIL == conses_high.member(item_var, shown_perspective_keywords, Symbols.symbol_function((SubLObject)cb_facets.EQL), Symbols.symbol_function((SubLObject)cb_facets.IDENTITY))) {
                            shown_perspective_keywords = (SubLObject)ConsesLow.cons(item_var, shown_perspective_keywords);
                        }
                        final SubLObject perspective = Hashtables.gethash(perspective_keyword, cb_facets.$perspectives_by_keyword$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED);
                        if (cb_facets.NIL != perspective) {
                            final SubLObject perspective_display_string = PrintLow.format((SubLObject)cb_facets.NIL, (SubLObject)cb_facets.$str162$__A_, perspective_display_string(perspective));
                            final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
                            final SubLObject perspective_relevantP = Functions.funcall(perspective_displayP_fn(perspective), arghash);
                            if (cb_facets.NIL != perspective_relevantP) {
                                if (perspective_keyword.eql(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw28$PERSPECTIVE, arghash))) {
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ(perspective_display_string);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                else {
                                    final SubLObject href = PrintLow.format((SubLObject)cb_facets.NIL, (SubLObject)cb_facets.$str163$_A__A, system_parameters.$cyc_cgi_program$.getDynamicValue(thread), html_arghash.html_arghash_href(html_arghash.argassoc_to_arghash((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)cb_facets.$kw12$FORT, fort), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$kw164$NEW_PERSPECTIVE, perspective_keyword))), cb_facets.$cb_facet_tool_handler$.getGlobalValue()));
                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                    html_utilities.html_markup(href);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                                        html_utilities.html_princ(perspective_display_string);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                }
                                html_utilities.html_indent((SubLObject)cb_facets.UNPROVIDED);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        perspective_keyword = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 29091L)
    public static SubLObject perspective_action_change_perspective_handlerP(final SubLObject arghash) {
        return (SubLObject)cb_facets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 29214L)
    public static SubLObject perspective_action_change_perspective_handler(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_perspective = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw164$NEW_PERSPECTIVE, arghash);
        if (cb_facets.NIL != new_perspective) {
            html_arghash.set_arghash_value((SubLObject)cb_facets.$kw28$PERSPECTIVE, arghash, new_perspective);
        }
        SubLObject have_perspectiveP = (SubLObject)cb_facets.NIL;
        if (cb_facets.NIL == have_perspectiveP) {
            SubLObject csome_list_var = (SubLObject)ConsesLow.cons(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw28$PERSPECTIVE, arghash), conses_high.getf(cb_facets.$perspective_type_sort$.getDynamicValue(thread), (SubLObject)cb_facets.$kw92$DEFAULT, (SubLObject)cb_facets.UNPROVIDED));
            SubLObject perspective_keyword = (SubLObject)cb_facets.NIL;
            perspective_keyword = csome_list_var.first();
            while (cb_facets.NIL == have_perspectiveP && cb_facets.NIL != csome_list_var) {
                final SubLObject perspective_relevantP = perspective_from_keyword_relevantP(perspective_keyword, arghash);
                if (cb_facets.NIL != perspective_relevantP) {
                    have_perspectiveP = (SubLObject)cb_facets.T;
                    html_arghash.set_arghash_value((SubLObject)cb_facets.$kw28$PERSPECTIVE, arghash, perspective_keyword);
                }
                csome_list_var = csome_list_var.rest();
                perspective_keyword = csome_list_var.first();
            }
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 30328L)
    public static SubLObject perspective_action_show_definition_displayP(final SubLObject arghash) {
        return (SubLObject)cb_facets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 30446L)
    public static SubLObject perspective_action_show_definition_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        if (cb_facets.NIL != html_macros.$html_color_light_blue$.getGlobalValue()) {
            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_color_light_blue$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw168$MIDDLE));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_facets.FIVE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        cb_facet_form(fort);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw86$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw168$MIDDLE));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_facets.THREE_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_princ((SubLObject)cb_facets.$str169$_Show_);
                        cb_utilities.cb_form(fort, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_facets.$str170$_in_Index_Browser_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (cb_facets.NIL != html_macros.$html_color_light_blue$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_color_light_blue$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_facets.$sym171$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(cb_facets.$const172$EverythingPSC, thread);
                    final SubLObject defining_mts = Sort.sort(Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_facets.$sym173$ASSERTION_MT), kb_mapping.gather_gaf_arg_index(fort, (SubLObject)cb_facets.ONE_INTEGER, cb_facets.$const85$isa, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)), Symbols.symbol_function((SubLObject)cb_facets.$sym174$HLMT_EQUAL), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED), Symbols.symbol_function((SubLObject)cb_facets.$sym82$GENERALITY_ESTIMATE_), (SubLObject)cb_facets.UNPROVIDED);
                    if (cb_facets.NIL != list_utilities.sublisp_boolean(defining_mts)) {
                        html_utilities.html_princ((SubLObject)cb_facets.$str175$Defined_in_);
                        SubLObject cdolist_list_var = defining_mts;
                        SubLObject defining_mt = (SubLObject)cb_facets.NIL;
                        defining_mt = cdolist_list_var.first();
                        while (cb_facets.NIL != cdolist_list_var) {
                            cb_facet_form(defining_mt);
                            html_utilities.html_princ((SubLObject)cb_facets.$str176$_);
                            cdolist_list_var = cdolist_list_var.rest();
                            defining_mt = cdolist_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (cb_facets.NIL != html_macros.$html_color_lighter_blue$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_color_lighter_blue$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.TWO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    final SubLObject comments = kb_mapping_utilities.pred_values_in_any_mt(fort, cb_facets.$const177$comment, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                    if (cb_facets.NIL != comments) {
                        SubLObject cdolist_list_var2 = comments;
                        SubLObject comment = (SubLObject)cb_facets.NIL;
                        comment = cdolist_list_var2.first();
                        while (cb_facets.NIL != cdolist_list_var2) {
                            cb_facet_form(comment);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            comment = cdolist_list_var2.first();
                        }
                    }
                    else {
                        html_utilities.html_princ((SubLObject)cb_facets.$str178$No_comment_);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
        final SubLObject asserted_isa = isa.asserted_isa(fort, cb_facets.$facet_tool_mt$.getDynamicValue(thread));
        final SubLObject min_isa = isa.min_isa(fort, cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        if (cb_facets.NIL != html_macros.$html_color_light_yellow$.getGlobalValue()) {
            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_color_light_yellow$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject _prev_bind_4 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_facets.$str179$__isa__);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_facets.$str100$in_Mt);
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str101$Unassert, (SubLObject)cb_facets.$kw102$UNASSERT_GO, (SubLObject)cb_facets.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
            if (cb_facets.NIL == min_isa) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (cb_facets.NIL != html_macros.$html_color_lighter_yellow$.getGlobalValue()) {
                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_color_lighter_yellow$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                        html_utilities.html_princ((SubLObject)cb_facets.$str180$Undefined_in_current_Mt_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
            }
            SubLObject cdolist_list_var3 = cardinality_estimates.sort_by_generality_estimate(asserted_isa, (SubLObject)cb_facets.$kw181$DESCENDING);
            SubLObject an_isa = (SubLObject)cb_facets.NIL;
            an_isa = cdolist_list_var3.first();
            while (cb_facets.NIL != cdolist_list_var3) {
                SubLObject cdolist_list_var_$90;
                final SubLObject isa_assertions = cdolist_list_var_$90 = kb_indexing.find_all_gafs((SubLObject)ConsesLow.list(cb_facets.$const85$isa, fort, an_isa));
                SubLObject isa_assertion = (SubLObject)cb_facets.NIL;
                isa_assertion = cdolist_list_var_$90.first();
                while (cb_facets.NIL != cdolist_list_var_$90) {
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (cb_facets.NIL != html_macros.$html_color_lighter_yellow$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_color_lighter_yellow$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                            if (cb_facets.NIL != isa_assertion) {
                                cb_utilities.cb_link((SubLObject)cb_facets.$kw87$ASSERTION, isa_assertion, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                                html_utilities.html_indent((SubLObject)cb_facets.UNPROVIDED);
                            }
                            cb_facet_form(an_isa);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            cb_facet_form(assertions_high.assertion_mt(isa_assertion));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_facets.$kw104$CENTER));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                        final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_facets.$kw105$UNASSERT_ID, assertion_handles.assertion_id(isa_assertion), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
                    cdolist_list_var_$90 = cdolist_list_var_$90.rest();
                    isa_assertion = cdolist_list_var_$90.first();
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                an_isa = cdolist_list_var3.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_4, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 33335L)
    public static SubLObject perspective_action_show_definition_handlerP(final SubLObject arghash) {
        return (SubLObject)cb_facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 33454L)
    public static SubLObject perspective_action_show_definition_handler(final SubLObject arghash) {
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 33974L)
    public static SubLObject perspective_action_add_fort_to_chosen_cols_displayP(final SubLObject arghash) {
        return (SubLObject)cb_facets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 34083L)
    public static SubLObject perspective_action_add_fort_to_chosen_cols_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_facets.$str184$__Make_);
                cb_facet_form(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash));
                html_utilities.html_princ((SubLObject)cb_facets.$str185$_a_direct_instance_of_selected_co);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str186$Go, (SubLObject)cb_facets.$kw187$ADD_FORT_TO_CHOSEN_COLS_GO, (SubLObject)cb_facets.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 34522L)
    public static SubLObject perspective_action_add_fort_to_chosen_cols_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw187$ADD_FORT_TO_CHOSEN_COLS_GO, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 34676L)
    public static SubLObject perspective_action_add_fort_to_chosen_cols_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
        final SubLObject add_sups = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw90$ADD_SUP, arghash);
        final SubLObject add_sup_froms = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw91$ADD_SUP_FROM, arghash);
        SubLObject all_sups = add_sups;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw81$A_FACET, arghash);
        SubLObject facet_id = (SubLObject)cb_facets.NIL;
        facet_id = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$96 = html_arghash.get_arghash_value_list(facet_id, arghash);
            SubLObject the_sup = (SubLObject)cb_facets.NIL;
            the_sup = cdolist_list_var_$96.first();
            while (cb_facets.NIL != cdolist_list_var_$96) {
                if (cb_facets.NIL != forts.fort_p(the_sup)) {
                    final SubLObject item_var = the_sup;
                    if (cb_facets.NIL == conses_high.member(item_var, all_sups, Symbols.symbol_function((SubLObject)cb_facets.EQL), Symbols.symbol_function((SubLObject)cb_facets.IDENTITY))) {
                        all_sups = (SubLObject)ConsesLow.cons(item_var, all_sups);
                    }
                }
                cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                the_sup = cdolist_list_var_$96.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            facet_id = cdolist_list_var.first();
        }
        cdolist_list_var = add_sup_froms;
        SubLObject add_sup_from = (SubLObject)cb_facets.NIL;
        add_sup_from = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$97;
            final SubLObject the_sups = cdolist_list_var_$97 = html_arghash.get_arghash_value_list(add_sup_from, arghash);
            SubLObject the_sup2 = (SubLObject)cb_facets.NIL;
            the_sup2 = cdolist_list_var_$97.first();
            while (cb_facets.NIL != cdolist_list_var_$97) {
                if (cb_facets.NIL != forts.fort_p(the_sup2)) {
                    final SubLObject item_var2 = the_sup2;
                    if (cb_facets.NIL == conses_high.member(item_var2, all_sups, Symbols.symbol_function((SubLObject)cb_facets.EQL), Symbols.symbol_function((SubLObject)cb_facets.IDENTITY))) {
                        all_sups = (SubLObject)ConsesLow.cons(item_var2, all_sups);
                    }
                }
                cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                the_sup2 = cdolist_list_var_$97.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            add_sup_from = cdolist_list_var.first();
        }
        if (cb_facets.NIL == all_sups) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list189, arghash);
            return arghash;
        }
        cdolist_list_var = all_sups;
        SubLObject sup = (SubLObject)cb_facets.NIL;
        sup = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            SubLObject abortP = (SubLObject)cb_facets.NIL;
            thread.resetMultipleValues();
            final SubLObject arghash_$98 = arghash_assert_now(arghash, (SubLObject)ConsesLow.list(cb_facets.$const85$isa, fort, sup), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject abortP_$99 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$98;
            abortP = abortP_$99;
            cdolist_list_var = cdolist_list_var.rest();
            sup = cdolist_list_var.first();
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 36182L)
    public static SubLObject perspective_action_add_specs_to_facet_displayP(final SubLObject arghash) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw107$FACETS_, arghash) && (cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw113$SPECS_FACETED_, arghash) || cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw116$SPECS_UNFACETED_, arghash)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 36415L)
    public static SubLObject perspective_action_add_specs_to_facet_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_facets.$str192$__Add_selected_spec_s__to_selecte);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str186$Go, (SubLObject)cb_facets.$kw193$ADD_SPECS_TO_FACET_GO, (SubLObject)cb_facets.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 36693L)
    public static SubLObject perspective_action_add_specs_to_facet_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw193$ADD_SPECS_TO_FACET_GO, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 36837L)
    public static SubLObject perspective_action_add_specs_to_facet_handler(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject selected_specs = get_selected_specs(arghash);
        if (cb_facets.NIL == selected_specs) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list194, arghash);
        }
        else {
            final SubLObject facet_id_selected = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw110$FACET_ID_SELECTED, arghash);
            if (!facet_id_selected.isNumber()) {
                html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list195, arghash);
                return arghash;
            }
            final SubLObject facet = facets.find_facet_by_id(facet_id_selected);
            if (cb_facets.NIL == facets.facet_p(facet)) {
                html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list195, arghash);
                return arghash;
            }
            final SubLObject facet_col_type = facets.facet_col_type(facet);
            if (cb_facets.NIL == fort_types_interface.collectionP(facet_col_type)) {
                html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$kw196$UNSUPPORTED_FACET_CHOSEN, (SubLObject)cb_facets.$str197$_A_assertions_must_currently_be_h, facets.facet_strength(facet)), arghash);
                return arghash;
            }
            SubLObject cdolist_list_var = selected_specs;
            SubLObject spec = (SubLObject)cb_facets.NIL;
            spec = cdolist_list_var.first();
            while (cb_facets.NIL != cdolist_list_var) {
                final SubLObject the_formula = (SubLObject)ConsesLow.list(cb_facets.$const85$isa, spec, facet_col_type);
                arghash_assert_now(arghash, the_formula, cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                spec = cdolist_list_var.first();
            }
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 38337L)
    public static SubLObject perspective_action_add_specs_to_new_facet_displayP(final SubLObject arghash) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw113$SPECS_FACETED_, arghash) || cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw116$SPECS_UNFACETED_, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 38525L)
    public static SubLObject perspective_action_add_specs_to_new_facet_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_facets.$str200$__Make_a_new_facet_with_selected_);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str186$Go, (SubLObject)cb_facets.$kw201$ADD_SPECS_TO_NEW_FACET_GO, (SubLObject)cb_facets.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        if (cb_facets.NIL != html_macros.$html_color_lighter_grey$.getGlobalValue()) {
            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                html_utilities.html_princ((SubLObject)cb_facets.$str202$New_facet_name__);
                html_utilities.html_princ(string_utilities.make_valid_constant_name(kb_paths.fort_name(fort), (SubLObject)cb_facets.UNPROVIDED));
                html_utilities.html_princ((SubLObject)cb_facets.$str203$TypeBy);
                html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_facets.$kw204$NEW_FACET_NAME, (SubLObject)cb_facets.$str205$, (SubLObject)cb_facets.TWENTY_INTEGER, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                html_utilities.html_princ((SubLObject)cb_facets.$str206$New_facet_type__);
                html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_facets.$kw207$NEW_FACET_TYPE, cb_facets.$const208$facets_Generic);
                html_utilities.html_princ((SubLObject)cb_facets.$str209$_generic_);
                html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_facets.$kw207$NEW_FACET_TYPE, cb_facets.$const210$facets_Strict);
                html_utilities.html_princ((SubLObject)cb_facets.$str211$_strict_);
                html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_facets.$kw207$NEW_FACET_TYPE, cb_facets.$const212$facets_Covering);
                html_utilities.html_princ((SubLObject)cb_facets.$str213$_covering_);
                html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_facets.$kw207$NEW_FACET_TYPE, cb_facets.$const214$facets_Partition);
                html_utilities.html_princ((SubLObject)cb_facets.$str215$_partition_);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 39676L)
    public static SubLObject perspective_action_add_specs_to_new_facet_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw201$ADD_SPECS_TO_NEW_FACET_GO, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 39828L)
    public static SubLObject perspective_action_add_specs_to_new_facet_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_facet_name = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw204$NEW_FACET_NAME, arghash);
        final SubLObject new_facet_type = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw207$NEW_FACET_TYPE, arghash);
        SubLObject specs = get_selected_specs(arghash);
        final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
        SubLObject abortP = (SubLObject)cb_facets.NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw109$FACET_ID, arghash);
        SubLObject facet_id = (SubLObject)cb_facets.NIL;
        facet_id = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$103 = html_arghash.get_arghash_value_list(facet_id, arghash);
            SubLObject the_spec = (SubLObject)cb_facets.NIL;
            the_spec = cdolist_list_var_$103.first();
            while (cb_facets.NIL != cdolist_list_var_$103) {
                if (cb_facets.NIL != forts.fort_p(the_spec)) {
                    final SubLObject item_var = the_spec;
                    if (cb_facets.NIL == conses_high.member(item_var, specs, Symbols.symbol_function((SubLObject)cb_facets.EQL), Symbols.symbol_function((SubLObject)cb_facets.IDENTITY))) {
                        specs = (SubLObject)ConsesLow.cons(item_var, specs);
                    }
                }
                cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                the_spec = cdolist_list_var_$103.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            facet_id = cdolist_list_var.first();
        }
        if (cb_facets.NIL == specs) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list194, arghash);
            abortP = (SubLObject)cb_facets.T;
        }
        if (cb_facets.NIL == subl_promotions.memberP(new_facet_type, facets.$facet_predicates$.getGlobalValue(), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list216, arghash);
            abortP = (SubLObject)cb_facets.T;
        }
        if (cb_facets.NIL == string_utilities.non_empty_stringP(new_facet_name)) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list217, arghash);
            abortP = (SubLObject)cb_facets.T;
        }
        if (cb_facets.NIL != abortP) {
            return arghash;
        }
        final SubLObject facet_col_name = string_utilities.make_valid_constant_name(PrintLow.format((SubLObject)cb_facets.NIL, (SubLObject)cb_facets.$str218$_ATypeBy_A, string_utilities.make_valid_constant_name(kb_paths.fort_name(fort), (SubLObject)cb_facets.UNPROVIDED), new_facet_name), (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject facet_col = ke.ke_create_now(facet_col_name, (SubLObject)cb_facets.UNPROVIDED);
        if (cb_facets.NIL != subl_promotions.memberP(new_facet_type, facets.$facet_predicates_disjoint$.getGlobalValue(), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject arghash_$104 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const85$isa, facet_col, (SubLObject)cb_facets.$list219), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject abortP_$105 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$104;
            abortP = abortP_$105;
        }
        else {
            thread.resetMultipleValues();
            final SubLObject arghash_$105 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const85$isa, facet_col, (SubLObject)cb_facets.$list220), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject abortP_$106 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$105;
            abortP = abortP_$106;
        }
        if (cb_facets.NIL != abortP) {
            return arghash;
        }
        thread.resetMultipleValues();
        final SubLObject arghash_$106 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const96$genls, facet_col, (SubLObject)cb_facets.$list221), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject abortP_$107 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        arghash = arghash_$106;
        abortP = abortP_$107;
        if (cb_facets.NIL != abortP) {
            return arghash;
        }
        final SubLObject facet_col_comment = PrintLow.format((SubLObject)cb_facets.NIL, (SubLObject)cb_facets.$str222$A_collection_of_collections__Each, string_utilities.object_to_string(fort), string_utilities.bunge(string_utilities.relevant_substrings(new_facet_name), (SubLObject)cb_facets.UNPROVIDED));
        thread.resetMultipleValues();
        final SubLObject arghash_$107 = arghash_assert_now(arghash, (SubLObject)ConsesLow.list(cb_facets.$const177$comment, facet_col, facet_col_comment), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject abortP_$108 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        arghash = arghash_$107;
        abortP = abortP_$108;
        if (cb_facets.NIL != abortP) {
            return arghash;
        }
        SubLObject cdolist_list_var2 = specs;
        SubLObject spec = (SubLObject)cb_facets.NIL;
        spec = cdolist_list_var2.first();
        while (cb_facets.NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject arghash_$108 = arghash_assert_now(arghash, (SubLObject)ConsesLow.list(cb_facets.$const85$isa, spec, facet_col), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject abortP_$109 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$108;
            abortP = abortP_$109;
            if (cb_facets.NIL != abortP) {
                return arghash;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            spec = cdolist_list_var2.first();
        }
        thread.resetMultipleValues();
        final SubLObject arghash_$109 = arghash_assert_now(arghash, (SubLObject)ConsesLow.list(new_facet_type, fort, facet_col), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject abortP_$110 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        arghash = arghash_$109;
        abortP = abortP_$110;
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 42807L)
    public static SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_displayP(final SubLObject arghash) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw113$SPECS_FACETED_, arghash) || cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw116$SPECS_UNFACETED_, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 43012L)
    public static SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_facets.$str225$__Make_selected_spec_s__direct_sp);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str186$Go, (SubLObject)cb_facets.$kw226$MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC_GO, (SubLObject)cb_facets.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        if (cb_facets.NIL != html_macros.$html_color_lighter_grey$.getGlobalValue()) {
            html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                html_utilities.html_princ((SubLObject)cb_facets.$str227$Collection_or_new_spec_name__);
                html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_facets.$kw228$NEW_SPEC_NAME, (SubLObject)cb_facets.$str205$, (SubLObject)cb_facets.TWENTY_INTEGER, (SubLObject)cb_facets.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 43655L)
    public static SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw226$MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC_GO, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 43843L)
    public static SubLObject perspective_action_make_specs_instances_of_col_or_new_spec_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_spec_name = string_utilities.string_remove_constant_reader_prefix(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw228$NEW_SPEC_NAME, arghash));
        SubLObject specs = get_selected_specs(arghash);
        final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
        SubLObject abortP = (SubLObject)cb_facets.NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw109$FACET_ID, arghash);
        SubLObject facet_id = (SubLObject)cb_facets.NIL;
        facet_id = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$118 = html_arghash.get_arghash_value_list(facet_id, arghash);
            SubLObject the_spec = (SubLObject)cb_facets.NIL;
            the_spec = cdolist_list_var_$118.first();
            while (cb_facets.NIL != cdolist_list_var_$118) {
                if (cb_facets.NIL != forts.fort_p(the_spec)) {
                    final SubLObject item_var = the_spec;
                    if (cb_facets.NIL == conses_high.member(item_var, specs, Symbols.symbol_function((SubLObject)cb_facets.EQL), Symbols.symbol_function((SubLObject)cb_facets.IDENTITY))) {
                        specs = (SubLObject)ConsesLow.cons(item_var, specs);
                    }
                }
                cdolist_list_var_$118 = cdolist_list_var_$118.rest();
                the_spec = cdolist_list_var_$118.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            facet_id = cdolist_list_var.first();
        }
        if (cb_facets.NIL == specs) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list194, arghash);
            abortP = (SubLObject)cb_facets.T;
        }
        if (cb_facets.NIL == constant_completion_high.valid_constant_name_p(new_spec_name)) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list229, arghash);
            abortP = (SubLObject)cb_facets.T;
        }
        if (cb_facets.NIL != abortP) {
            return arghash;
        }
        SubLObject new_col = constants_high.find_constant(new_spec_name);
        if (cb_facets.NIL == new_col) {
            new_col = ke.ke_create_now(new_spec_name, (SubLObject)cb_facets.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject arghash_$119 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const85$isa, new_col, (SubLObject)cb_facets.$list230), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject abortP_$120 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$119;
            abortP = abortP_$120;
            if (cb_facets.NIL != abortP) {
                return arghash;
            }
            thread.resetMultipleValues();
            final SubLObject arghash_$120 = arghash_assert_now(arghash, (SubLObject)ConsesLow.list(cb_facets.$const96$genls, new_col, fort), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject abortP_$121 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$120;
            abortP = abortP_$121;
            if (cb_facets.NIL != abortP) {
                return arghash;
            }
        }
        SubLObject cdolist_list_var2 = specs;
        SubLObject spec = (SubLObject)cb_facets.NIL;
        spec = cdolist_list_var2.first();
        while (cb_facets.NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject arghash_$121 = arghash_assert_now(arghash, (SubLObject)ConsesLow.list(cb_facets.$const96$genls, spec, new_col), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject abortP_$122 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$121;
            abortP = abortP_$122;
            if (cb_facets.NIL != abortP) {
                return arghash;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            spec = cdolist_list_var2.first();
        }
        cdolist_list_var2 = specs;
        spec = (SubLObject)cb_facets.NIL;
        spec = cdolist_list_var2.first();
        while (cb_facets.NIL != cdolist_list_var2) {
            thread.resetMultipleValues();
            final SubLObject arghash_$122 = arghash_unassert_now(arghash, (SubLObject)ConsesLow.list(cb_facets.$const96$genls, spec, fort), cb_facets.$facet_tool_mt$.getDynamicValue(thread));
            final SubLObject abortP_$123 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$122;
            abortP = abortP_$123;
            if (cb_facets.NIL != abortP) {
                return arghash;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            spec = cdolist_list_var2.first();
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 46383L)
    public static SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_displayP(final SubLObject arghash) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw113$SPECS_FACETED_, arghash) && cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw116$SPECS_UNFACETED_, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 46601L)
    public static SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_facets.$str233$__Make_selected_unfaceted_spec_s_);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str186$Go, (SubLObject)cb_facets.$kw234$MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS_GO, (SubLObject)cb_facets.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 47050L)
    public static SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw234$MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS_GO, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 47260L)
    public static SubLObject perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject specs_unfaceted = get_selected_specs_unfaceted(arghash);
        final SubLObject specs_faceted = get_selected_specs_faceted(arghash);
        SubLObject abortP = (SubLObject)cb_facets.NIL;
        if (cb_facets.NIL == specs_unfaceted) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list235, arghash);
            abortP = (SubLObject)cb_facets.T;
        }
        if (cb_facets.NIL == specs_faceted) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list236, arghash);
            abortP = (SubLObject)cb_facets.T;
        }
        if (cb_facets.NIL != abortP) {
            return arghash;
        }
        SubLObject cdolist_list_var = specs_unfaceted;
        SubLObject spec_unfaceted = (SubLObject)cb_facets.NIL;
        spec_unfaceted = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$128 = specs_faceted;
            SubLObject spec_faceted = (SubLObject)cb_facets.NIL;
            spec_faceted = cdolist_list_var_$128.first();
            while (cb_facets.NIL != cdolist_list_var_$128) {
                thread.resetMultipleValues();
                final SubLObject arghash_$129 = arghash_assert_now(arghash, (SubLObject)ConsesLow.list(cb_facets.$const96$genls, spec_unfaceted, spec_faceted), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject abortP_$130 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                arghash = arghash_$129;
                abortP = abortP_$130;
                cdolist_list_var_$128 = cdolist_list_var_$128.rest();
                spec_faceted = cdolist_list_var_$128.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_unfaceted = cdolist_list_var.first();
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 48443L)
    public static SubLObject perspective_action_add_instances_to_specs_displayP(final SubLObject arghash) {
        return (SubLObject)SubLObjectFactory.makeBoolean((cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw113$SPECS_FACETED_, arghash) || cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw116$SPECS_UNFACETED_, arghash)) && cb_facets.NIL != html_arghash.get_arghash_value((SubLObject)cb_facets.$kw122$INSTANCES_, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 48683L)
    public static SubLObject perspective_action_add_instances_to_specs_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_facets.$str239$__Add_selected_instance_s__to_sel);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str186$Go, (SubLObject)cb_facets.$kw240$ADD_INSTANCES_TO_SPECS_GO, (SubLObject)cb_facets.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 49048L)
    public static SubLObject perspective_action_add_instances_to_specs_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw240$ADD_INSTANCES_TO_SPECS_GO, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 49202L)
    public static SubLObject perspective_action_add_instances_to_specs_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
        final SubLObject specs = get_selected_specs(arghash);
        final SubLObject v_instances = get_selected_instances(arghash);
        SubLObject abortP = (SubLObject)cb_facets.NIL;
        if (cb_facets.NIL == specs) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list241, arghash);
            abortP = (SubLObject)cb_facets.T;
        }
        if (cb_facets.NIL == v_instances) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, (SubLObject)cb_facets.$list242, arghash);
            abortP = (SubLObject)cb_facets.T;
        }
        if (cb_facets.NIL != abortP) {
            return arghash;
        }
        SubLObject cdolist_list_var = v_instances;
        SubLObject instance = (SubLObject)cb_facets.NIL;
        instance = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            final SubLObject poss_assertion = kb_indexing.find_gaf_any_mt((SubLObject)ConsesLow.list(cb_facets.$const85$isa, instance, fort));
            SubLObject strength = (SubLObject)cb_facets.NIL;
            SubLObject direction = (SubLObject)cb_facets.NIL;
            if (cb_facets.NIL != assertion_handles.assertion_p(poss_assertion)) {
                strength = assertions_high.assertion_strength(poss_assertion);
                direction = assertions_high.assertion_direction(poss_assertion);
            }
            SubLObject cdolist_list_var_$132 = specs;
            SubLObject spec = (SubLObject)cb_facets.NIL;
            spec = cdolist_list_var_$132.first();
            while (cb_facets.NIL != cdolist_list_var_$132) {
                thread.resetMultipleValues();
                final SubLObject arghash_$133 = arghash_assert_now(arghash, (SubLObject)ConsesLow.list(cb_facets.$const85$isa, instance, spec), cb_facets.$facet_tool_mt$.getDynamicValue(thread), strength, direction);
                final SubLObject abortP_$134 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                arghash = arghash_$133;
                abortP = abortP_$134;
                cdolist_list_var_$132 = cdolist_list_var_$132.rest();
                spec = cdolist_list_var_$132.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            instance = cdolist_list_var.first();
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 50489L)
    public static SubLObject perspective_action_unassert_displayP(final SubLObject arghash) {
        return (SubLObject)cb_facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 50585L)
    public static SubLObject perspective_action_unassert_display(final SubLObject arghash) {
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 50687L)
    public static SubLObject perspective_action_unassert_handlerP(final SubLObject arghash) {
        return list_utilities.sublisp_boolean(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw102$UNASSERT_GO, arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 50811L)
    public static SubLObject perspective_action_unassert_handler(SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject assertion_ids = cdolist_list_var = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw105$UNASSERT_ID, arghash);
        SubLObject assertion_id = (SubLObject)cb_facets.NIL;
        assertion_id = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            final SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
            final SubLObject assertion_gaf = assertions_high.gaf_formula(assertion);
            final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
            final SubLObject fort = html_arghash.get_arghash_value((SubLObject)cb_facets.$kw12$FORT, arghash);
            final SubLObject fort_order = fort_order(fort, (SubLObject)cb_facets.UNPROVIDED);
            SubLObject abortP = (SubLObject)cb_facets.NIL;
            thread.resetMultipleValues();
            final SubLObject arghash_$135 = arghash_unassert_now(arghash, assertion_gaf, assertion_mt);
            final SubLObject abortP_$136 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            arghash = arghash_$135;
            abortP = abortP_$136;
            if (cb_facets.NIL != abortP) {
                return arghash;
            }
            if (cb_facets.NIL == isa.all_isa(fort, cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED)) {
                final SubLObject pcase_var = fort_order;
                if (pcase_var.eql((SubLObject)cb_facets.ZERO_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject arghash_$136 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const85$isa, fort, (SubLObject)cb_facets.$list245), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject abortP_$137 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    arghash = arghash_$136;
                    abortP = abortP_$137;
                }
                else if (pcase_var.eql((SubLObject)cb_facets.ONE_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject arghash_$137 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const85$isa, fort, (SubLObject)cb_facets.$list230), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject abortP_$138 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    arghash = arghash_$137;
                    abortP = abortP_$138;
                }
                else if (pcase_var.eql((SubLObject)cb_facets.TWO_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject arghash_$138 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const85$isa, fort, (SubLObject)cb_facets.$list220), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject abortP_$139 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    arghash = arghash_$138;
                    abortP = abortP_$139;
                }
                else if (pcase_var.eql((SubLObject)cb_facets.THREE_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject arghash_$139 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const85$isa, fort, (SubLObject)cb_facets.$list246), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject abortP_$140 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    arghash = arghash_$139;
                    abortP = abortP_$140;
                }
            }
            if (cb_facets.NIL == genls.all_genls(fort, cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED)) {
                final SubLObject pcase_var = fort_order;
                if (pcase_var.eql((SubLObject)cb_facets.ONE_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject arghash_$140 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const96$genls, fort, (SubLObject)cb_facets.$list245), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject abortP_$141 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    arghash = arghash_$140;
                    abortP = abortP_$141;
                }
                else if (pcase_var.eql((SubLObject)cb_facets.TWO_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject arghash_$141 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const96$genls, fort, (SubLObject)cb_facets.$list230), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject abortP_$142 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    arghash = arghash_$141;
                    abortP = abortP_$142;
                }
                else if (pcase_var.eql((SubLObject)cb_facets.THREE_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject arghash_$142 = arghash_assert_now(arghash, (SubLObject)ConsesLow.listS(cb_facets.$const96$genls, fort, (SubLObject)cb_facets.$list220), cb_facets.$facet_tool_mt$.getDynamicValue(thread), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED);
                    final SubLObject abortP_$143 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    arghash = arghash_$142;
                    abortP = abortP_$143;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion_id = cdolist_list_var.first();
        }
        html_arghash.rem_arghash_value((SubLObject)cb_facets.$kw105$UNASSERT_ID, arghash);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 52672L)
    public static SubLObject fort_order(final SubLObject fort, SubLObject mt) {
        if (mt == cb_facets.UNPROVIDED) {
            mt = (SubLObject)cb_facets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cb_facets.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (cb_facets.NIL != isa.isaP(fort, cb_facets.$const247$CollectionTypeType, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)) {
                result = (SubLObject)cb_facets.THREE_INTEGER;
            }
            else if (cb_facets.NIL != isa.isaP(fort, cb_facets.$const248$CollectionType, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)) {
                result = (SubLObject)cb_facets.TWO_INTEGER;
            }
            else if (cb_facets.NIL != isa.isaP(fort, cb_facets.$const121$Collection, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)) {
                result = (SubLObject)cb_facets.ONE_INTEGER;
            }
            else if (cb_facets.NIL != isa.isaP(fort, cb_facets.$const249$Individual, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)) {
                result = (SubLObject)cb_facets.ZERO_INTEGER;
            }
            else {
                result = (SubLObject)cb_facets.NIL;
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 53489L)
    public static SubLObject perspective_action_change_mt_displayP(final SubLObject arghash) {
        return (SubLObject)cb_facets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 53601L)
    public static SubLObject perspective_action_change_mt_display(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_arghash.rem_arghash_value((SubLObject)cb_facets.$kw252$MT, arghash);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        if (cb_facets.NIL != html_macros.$html_color_light_grey$.getGlobalValue()) {
            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_color_light_grey$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_facets.$str80$100_);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$152 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_facets.$str253$__Change_current_Mt_from_);
                    cb_facet_form(cb_facets.$facet_tool_mt$.getDynamicValue(thread));
                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    html_utilities.html_glyph((SubLObject)cb_facets.$kw88$NBSP, (SubLObject)cb_facets.UNPROVIDED);
                    html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_facets.$str186$Go, (SubLObject)cb_facets.$kw254$CHANGE_MT_GO, (SubLObject)cb_facets.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$152, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            if (cb_facets.NIL != html_macros.$html_color_lighter_grey$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_color_lighter_grey$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
                final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                    html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                    html_utilities.html_princ((SubLObject)cb_facets.$str255$_New_Mt_name__);
                    html_arghash.html_arghash_fort_input(arghash, (SubLObject)cb_facets.$kw252$MT, (SubLObject)cb_facets.NIL, (SubLObject)cb_facets.$int256$30, (SubLObject)cb_facets.$str257$Complete, cb_facets.$const258$Microtheory);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_facets.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 54319L)
    public static SubLObject perspective_action_change_mt_handlerP(final SubLObject arghash) {
        return (SubLObject)cb_facets.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 54415L)
    public static SubLObject perspective_action_change_mt_handler(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_facets.NIL != fort_types_interface.microtheory_p(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw252$MT, arghash)) && !cb_facets.$facet_tool_mt$.getDynamicValue(thread).eql(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw252$MT, arghash))) {
            cb_facets.$facet_tool_mt$.setDynamicValue(html_arghash.get_arghash_value((SubLObject)cb_facets.$kw252$MT, arghash), thread);
        }
        if (cb_facets.NIL == fort_types_interface.microtheory_p(cb_facets.$facet_tool_mt$.getDynamicValue(thread))) {
            cb_facets.$facet_tool_mt$.setDynamicValue(cb_facets.$default_facet_tool_mt$.getGlobalValue(), thread);
        }
        html_arghash.rem_arghash_value((SubLObject)cb_facets.$kw252$MT, arghash);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 54844L)
    public static SubLObject get_selected_specs_faceted(final SubLObject arghash) {
        SubLObject specs = (SubLObject)cb_facets.NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw109$FACET_ID, arghash);
        SubLObject facet_id = (SubLObject)cb_facets.NIL;
        facet_id = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$155 = html_arghash.get_arghash_value_list(Symbols.make_keyword(PrintLow.format((SubLObject)cb_facets.NIL, (SubLObject)cb_facets.$str112$_A_SPEC_SELECTED, facet_id)), arghash);
            SubLObject spec = (SubLObject)cb_facets.NIL;
            spec = cdolist_list_var_$155.first();
            while (cb_facets.NIL != cdolist_list_var_$155) {
                specs = (SubLObject)ConsesLow.cons(spec, specs);
                cdolist_list_var_$155 = cdolist_list_var_$155.rest();
                spec = cdolist_list_var_$155.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            facet_id = cdolist_list_var.first();
        }
        return specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 55275L)
    public static SubLObject get_selected_specs_unfaceted(final SubLObject arghash) {
        SubLObject specs = (SubLObject)cb_facets.NIL;
        SubLObject cdolist_list_var = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw118$SPEC_UNFACETED, arghash);
        SubLObject spec = (SubLObject)cb_facets.NIL;
        spec = cdolist_list_var.first();
        while (cb_facets.NIL != cdolist_list_var) {
            specs = (SubLObject)ConsesLow.cons(spec, specs);
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        return specs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 55483L)
    public static SubLObject get_selected_specs(final SubLObject arghash) {
        return ConsesLow.append(get_selected_specs_faceted(arghash), get_selected_specs_unfaceted(arghash));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 55623L)
    public static SubLObject get_selected_instances(final SubLObject arghash) {
        return html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw124$INSTANCE, arghash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 55725L)
    public static SubLObject error_keyword_to_string(final SubLObject error_keyword) {
        SubLObject string_tokens = Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_facets.$sym259$STRING_DOWNCASE), string_utilities.string_tokenize(string_utilities.string_from_keyword(error_keyword), (SubLObject)cb_facets.$list260, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED));
        string_tokens = (SubLObject)ConsesLow.cons(string_utilities.nupcase_leading(string_tokens.first()), string_tokens.rest());
        return string_utilities.bunge(string_tokens, (SubLObject)cb_facets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 56167L)
    public static SubLObject arghash_status_string(final SubLObject error_list) {
        final SubLObject error_keyword_string = error_keyword_to_string(error_list.first());
        final SubLObject error_format_control = conses_high.cadr(error_list);
        final SubLObject error_format_arguments = conses_high.cddr(error_list);
        SubLObject error_string = (SubLObject)cb_facets.NIL;
        if (error_format_control.isString()) {
            error_string = PrintLow.format((SubLObject)cb_facets.NIL, (SubLObject)cb_facets.$str261$_A___A, error_keyword_string, PrintLow.format((SubLObject)cb_facets.NIL, error_format_control, new SubLObject[] { error_format_arguments.first(), conses_high.second(error_format_arguments), conses_high.third(error_format_arguments), conses_high.fourth(error_format_arguments), conses_high.fifth(error_format_arguments) }));
        }
        else {
            error_string = error_keyword_string;
        }
        return error_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 56850L)
    public static SubLObject html_arghash_possibly_show_errors(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_facets.NIL != html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw188$ERRORS, arghash)) {
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_facets.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_princ((SubLObject)cb_facets.$str262$Errors_found_);
                html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
                SubLObject cdolist_list_var = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw188$ERRORS, arghash);
                SubLObject error_list = (SubLObject)cb_facets.NIL;
                error_list = cdolist_list_var.first();
                while (cb_facets.NIL != cdolist_list_var) {
                    final SubLObject error_string = arghash_status_string(error_list);
                    if (cb_facets.NIL != error_string) {
                        html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                        html_utilities.html_princ(error_string);
                        html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    error_list = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
        }
        return (SubLObject)cb_facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 57341L)
    public static SubLObject html_arghash_possibly_show_successes(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_facets.NIL != html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw263$SUCCESSES, arghash)) {
            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_facets.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_facets.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_facets.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_facets.T, thread);
                html_utilities.html_princ((SubLObject)cb_facets.$str264$Actions_taken_);
                html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
                SubLObject cdolist_list_var = html_arghash.get_arghash_value_list((SubLObject)cb_facets.$kw263$SUCCESSES, arghash);
                SubLObject success_list = (SubLObject)cb_facets.NIL;
                success_list = cdolist_list_var.first();
                while (cb_facets.NIL != cdolist_list_var) {
                    final SubLObject success_string = arghash_status_string(success_list);
                    if (cb_facets.NIL != success_string) {
                        html_utilities.html_indent((SubLObject)cb_facets.FIVE_INTEGER);
                        html_utilities.html_princ(success_string);
                        html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    success_list = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_utilities.html_newline((SubLObject)cb_facets.UNPROVIDED);
        }
        return (SubLObject)cb_facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 57852L)
    public static SubLObject arghash_assert_now(final SubLObject arghash, final SubLObject formula, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == cb_facets.UNPROVIDED) {
            strength = (SubLObject)cb_facets.$kw92$DEFAULT;
        }
        if (direction == cb_facets.UNPROVIDED) {
            direction = (SubLObject)cb_facets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errorP = (SubLObject)cb_facets.NIL;
        thread.resetMultipleValues();
        final SubLObject result = ke.ke_assert_now(formula, mt, strength, direction);
        final SubLObject error_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_facets.NIL == result) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, error_list, arghash);
            errorP = (SubLObject)cb_facets.T;
        }
        else {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw263$SUCCESSES, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$kw265$ASSERTED, (SubLObject)cb_facets.$str266$_A_in__A, formula, mt), arghash);
        }
        return Values.values(arghash, errorP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-facets.lisp", position = 58449L)
    public static SubLObject arghash_unassert_now(final SubLObject arghash, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject errorP = (SubLObject)cb_facets.NIL;
        thread.resetMultipleValues();
        final SubLObject result = ke.ke_unassert_now(formula, mt);
        final SubLObject error_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (cb_facets.NIL == result) {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw188$ERRORS, error_list, arghash);
            errorP = (SubLObject)cb_facets.T;
        }
        else {
            html_arghash.push_arghash_value((SubLObject)cb_facets.$kw263$SUCCESSES, (SubLObject)ConsesLow.list((SubLObject)cb_facets.$kw267$UNASSERTED, (SubLObject)cb_facets.$str268$_A_from__A, formula, mt), arghash);
        }
        return Values.values(arghash, errorP);
    }
    
    public static SubLObject declare_cb_facets_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "cb_facet", "CB-FACET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "cb_facet_form", "CB-FACET-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_print_function_trampoline", "PERSPECTIVE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_p", "PERSPECTIVE-P", 1, 0, false);
        new $perspective_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_name", "PERSPECTIVE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_keyword", "PERSPECTIVE-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_displayP_fn", "PERSPECTIVE-DISPLAY?-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_display_fn", "PERSPECTIVE-DISPLAY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_display_string", "PERSPECTIVE-DISPLAY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_name", "_CSETF-PERSPECTIVE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_keyword", "_CSETF-PERSPECTIVE-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_displayP_fn", "_CSETF-PERSPECTIVE-DISPLAY?-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_display_fn", "_CSETF-PERSPECTIVE-DISPLAY-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_display_string", "_CSETF-PERSPECTIVE-DISPLAY-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "make_perspective", "MAKE-PERSPECTIVE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "visit_defstruct_perspective", "VISIT-DEFSTRUCT-PERSPECTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "visit_defstruct_object_perspective_method", "VISIT-DEFSTRUCT-OBJECT-PERSPECTIVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "print_perspective", "PRINT-PERSPECTIVE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_facets", "defperspective", "DEFPERSPECTIVE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_from_keyword", "PERSPECTIVE-FROM-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "relevant_perspectives", "RELEVANT-PERSPECTIVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_from_keyword_relevantP", "PERSPECTIVE-FROM-KEYWORD-RELEVANT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "show_as_individualP", "SHOW-AS-INDIVIDUAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "html_show_as_individual", "HTML-SHOW-AS-INDIVIDUAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "html_print_facet_block", "HTML-PRINT-FACET-BLOCK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "show_as_collectionP", "SHOW-AS-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "html_show_as_collection", "HTML-SHOW-AS-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_print_function_trampoline", "PERSPECTIVE-ACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_p", "PERSPECTIVE-ACTION-P", 1, 0, false);
        new $perspective_action_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_name", "PERSPECTIVE-ACTION-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_keyword", "PERSPECTIVE-ACTION-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_order_num", "PERSPECTIVE-ACTION-ORDER-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_perspective", "PERSPECTIVE-ACTION-PERSPECTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_displayP_fn", "PERSPECTIVE-ACTION-DISPLAY?-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_display_fn", "PERSPECTIVE-ACTION-DISPLAY-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_handlerP_fn", "PERSPECTIVE-ACTION-HANDLER?-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_handler_fn", "PERSPECTIVE-ACTION-HANDLER-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_action_name", "_CSETF-PERSPECTIVE-ACTION-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_action_keyword", "_CSETF-PERSPECTIVE-ACTION-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_action_order_num", "_CSETF-PERSPECTIVE-ACTION-ORDER-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_action_perspective", "_CSETF-PERSPECTIVE-ACTION-PERSPECTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_action_displayP_fn", "_CSETF-PERSPECTIVE-ACTION-DISPLAY?-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_action_display_fn", "_CSETF-PERSPECTIVE-ACTION-DISPLAY-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_action_handlerP_fn", "_CSETF-PERSPECTIVE-ACTION-HANDLER?-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "_csetf_perspective_action_handler_fn", "_CSETF-PERSPECTIVE-ACTION-HANDLER-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "make_perspective_action", "MAKE-PERSPECTIVE-ACTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "visit_defstruct_perspective_action", "VISIT-DEFSTRUCT-PERSPECTIVE-ACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "visit_defstruct_object_perspective_action_method", "VISIT-DEFSTRUCT-OBJECT-PERSPECTIVE-ACTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "print_perspective_action", "PRINT-PERSPECTIVE-ACTION", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_facets", "defperspective_action", "DEFPERSPECTIVE-ACTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_actions", "PERSPECTIVE-ACTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "sort_perspective_actions", "SORT-PERSPECTIVE-ACTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "sorted_perspective_actions_for_perspective", "SORTED-PERSPECTIVE-ACTIONS-FOR-PERSPECTIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "display_perspective_actions_for_perspective", "DISPLAY-PERSPECTIVE-ACTIONS-FOR-PERSPECTIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_actions_handler", "PERSPECTIVE-ACTIONS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_change_perspective_displayP", "PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_change_perspective_display", "PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_change_perspective_handlerP", "PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_change_perspective_handler", "PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_show_definition_displayP", "PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_show_definition_display", "PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_show_definition_handlerP", "PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_show_definition_handler", "PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_fort_to_chosen_cols_displayP", "PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_fort_to_chosen_cols_display", "PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_fort_to_chosen_cols_handlerP", "PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_fort_to_chosen_cols_handler", "PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_specs_to_facet_displayP", "PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_specs_to_facet_display", "PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_specs_to_facet_handlerP", "PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_specs_to_facet_handler", "PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_specs_to_new_facet_displayP", "PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_specs_to_new_facet_display", "PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_specs_to_new_facet_handlerP", "PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_specs_to_new_facet_handler", "PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_make_specs_instances_of_col_or_new_spec_displayP", "PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_make_specs_instances_of_col_or_new_spec_display", "PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_make_specs_instances_of_col_or_new_spec_handlerP", "PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_make_specs_instances_of_col_or_new_spec_handler", "PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_displayP", "PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_display", "PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handlerP", "PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_make_unfaceted_specs_direct_specs_of_faceted_specs_handler", "PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_instances_to_specs_displayP", "PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_instances_to_specs_display", "PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_instances_to_specs_handlerP", "PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_add_instances_to_specs_handler", "PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_unassert_displayP", "PERSPECTIVE-ACTION-UNASSERT-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_unassert_display", "PERSPECTIVE-ACTION-UNASSERT-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_unassert_handlerP", "PERSPECTIVE-ACTION-UNASSERT-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_unassert_handler", "PERSPECTIVE-ACTION-UNASSERT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "fort_order", "FORT-ORDER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_change_mt_displayP", "PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_change_mt_display", "PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_change_mt_handlerP", "PERSPECTIVE-ACTION-CHANGE-MT-HANDLER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "perspective_action_change_mt_handler", "PERSPECTIVE-ACTION-CHANGE-MT-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "get_selected_specs_faceted", "GET-SELECTED-SPECS-FACETED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "get_selected_specs_unfaceted", "GET-SELECTED-SPECS-UNFACETED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "get_selected_specs", "GET-SELECTED-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "get_selected_instances", "GET-SELECTED-INSTANCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "error_keyword_to_string", "ERROR-KEYWORD-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "arghash_status_string", "ARGHASH-STATUS-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "html_arghash_possibly_show_errors", "HTML-ARGHASH-POSSIBLY-SHOW-ERRORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "html_arghash_possibly_show_successes", "HTML-ARGHASH-POSSIBLY-SHOW-SUCCESSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "arghash_assert_now", "ARGHASH-ASSERT-NOW", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_facets", "arghash_unassert_now", "ARGHASH-UNASSERT-NOW", 3, 0, false);
        return (SubLObject)cb_facets.NIL;
    }
    
    public static SubLObject init_cb_facets_file() {
        cb_facets.$default_facet_tool_mt$ = SubLFiles.deflexical("*DEFAULT-FACET-TOOL-MT*", cb_facets.$const0$UniversalVocabularyMt);
        cb_facets.$facet_tool_mt$ = SubLFiles.defparameter("*FACET-TOOL-MT*", cb_facets.$default_facet_tool_mt$.getGlobalValue());
        cb_facets.$cb_facet_tool_name$ = SubLFiles.deflexical("*CB-FACET-TOOL-NAME*", (SubLObject)cb_facets.$str2$Facets_Browser);
        cb_facets.$cb_facet_tool_handler$ = SubLFiles.deflexical("*CB-FACET-TOOL-HANDLER*", (SubLObject)cb_facets.$str3$cb_facet);
        cb_facets.$dtp_perspective$ = SubLFiles.defconstant("*DTP-PERSPECTIVE*", (SubLObject)cb_facets.$sym33$PERSPECTIVE);
        cb_facets.$perspectives$ = SubLFiles.defparameter("*PERSPECTIVES*", (SubLObject)cb_facets.NIL);
        cb_facets.$perspectives_by_keyword$ = SubLFiles.defparameter("*PERSPECTIVES-BY-KEYWORD*", Hashtables.make_hash_table((SubLObject)cb_facets.$int63$32, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED));
        cb_facets.$perspective_type_sort$ = SubLFiles.defparameter("*PERSPECTIVE-TYPE-SORT*", (SubLObject)cb_facets.$list77);
        cb_facets.$dtp_perspective_action$ = SubLFiles.defconstant("*DTP-PERSPECTIVE-ACTION*", (SubLObject)cb_facets.$sym126$PERSPECTIVE_ACTION);
        cb_facets.$perspective_actions$ = SubLFiles.deflexical("*PERSPECTIVE-ACTIONS*", (SubLObject)cb_facets.NIL);
        return (SubLObject)cb_facets.NIL;
    }
    
    public static SubLObject setup_cb_facets_file() {
        utilities_macros.register_html_state_variable((SubLObject)cb_facets.$sym1$_FACET_TOOL_MT_);
        Hashtables.sethash((SubLObject)cb_facets.$kw4$FACET_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$str5$facet_browser_gif, (SubLObject)cb_facets.$str6$_Facets_));
        Hashtables.sethash((SubLObject)cb_facets.$kw7$FACET_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_facets.$str8$facet_browser_disabled_gif, (SubLObject)cb_facets.$str6$_Facets_));
        final SubLObject old = cb_adornments.$cb_adornment_table$.getGlobalValue();
        final SubLObject v_new = cb_adornments.make_adornment((SubLObject)cb_facets.$list9);
        cb_adornments._csetf_adornment_name(v_new, (SubLObject)cb_facets.$sym10$VFACETS);
        cb_adornments.$cb_adornment_table$.setGlobalValue((SubLObject)ConsesLow.cons(v_new, Sequences.delete((SubLObject)cb_facets.$sym10$VFACETS, old, Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym11$ADORNMENT_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        html_macros.note_cgi_handler_function((SubLObject)cb_facets.$sym31$CB_FACET, (SubLObject)cb_facets.$kw32$HTML_HANDLER);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_facets.$dtp_perspective$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.$sym40$PERSPECTIVE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_facets.$list41);
        Structures.def_csetf((SubLObject)cb_facets.$sym42$PERSPECTIVE_NAME, (SubLObject)cb_facets.$sym43$_CSETF_PERSPECTIVE_NAME);
        Structures.def_csetf((SubLObject)cb_facets.$sym44$PERSPECTIVE_KEYWORD, (SubLObject)cb_facets.$sym45$_CSETF_PERSPECTIVE_KEYWORD);
        Structures.def_csetf((SubLObject)cb_facets.$sym46$PERSPECTIVE_DISPLAY__FN, (SubLObject)cb_facets.$sym47$_CSETF_PERSPECTIVE_DISPLAY__FN);
        Structures.def_csetf((SubLObject)cb_facets.$sym48$PERSPECTIVE_DISPLAY_FN, (SubLObject)cb_facets.$sym49$_CSETF_PERSPECTIVE_DISPLAY_FN);
        Structures.def_csetf((SubLObject)cb_facets.$sym50$PERSPECTIVE_DISPLAY_STRING, (SubLObject)cb_facets.$sym51$_CSETF_PERSPECTIVE_DISPLAY_STRING);
        Equality.identity((SubLObject)cb_facets.$sym33$PERSPECTIVE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_facets.$dtp_perspective$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.$sym62$VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_METHOD));
        SubLObject new_perspective = make_perspective((SubLObject)cb_facets.$list78);
        _csetf_perspective_name(new_perspective, (SubLObject)cb_facets.$sym79$AS_INDIVIDUAL);
        Hashtables.sethash(perspective_keyword(new_perspective), cb_facets.$perspectives_by_keyword$.getDynamicValue(), new_perspective);
        cb_facets.$perspectives$.setDynamicValue((SubLObject)ConsesLow.cons(new_perspective, Sequences.delete((SubLObject)cb_facets.$sym79$AS_INDIVIDUAL, cb_facets.$perspectives$.getDynamicValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym42$PERSPECTIVE_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective = make_perspective((SubLObject)cb_facets.$list94);
        _csetf_perspective_name(new_perspective, (SubLObject)cb_facets.$sym95$AS_COLLECTION);
        Hashtables.sethash(perspective_keyword(new_perspective), cb_facets.$perspectives_by_keyword$.getDynamicValue(), new_perspective);
        cb_facets.$perspectives$.setDynamicValue((SubLObject)ConsesLow.cons(new_perspective, Sequences.delete((SubLObject)cb_facets.$sym95$AS_COLLECTION, cb_facets.$perspectives$.getDynamicValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym42$PERSPECTIVE_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), cb_facets.$dtp_perspective_action$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.$sym133$PERSPECTIVE_ACTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)cb_facets.$list134);
        Structures.def_csetf((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME, (SubLObject)cb_facets.$sym136$_CSETF_PERSPECTIVE_ACTION_NAME);
        Structures.def_csetf((SubLObject)cb_facets.$sym137$PERSPECTIVE_ACTION_KEYWORD, (SubLObject)cb_facets.$sym138$_CSETF_PERSPECTIVE_ACTION_KEYWORD);
        Structures.def_csetf((SubLObject)cb_facets.$sym139$PERSPECTIVE_ACTION_ORDER_NUM, (SubLObject)cb_facets.$sym140$_CSETF_PERSPECTIVE_ACTION_ORDER_NUM);
        Structures.def_csetf((SubLObject)cb_facets.$sym141$PERSPECTIVE_ACTION_PERSPECTIVE, (SubLObject)cb_facets.$sym142$_CSETF_PERSPECTIVE_ACTION_PERSPECTIVE);
        Structures.def_csetf((SubLObject)cb_facets.$sym143$PERSPECTIVE_ACTION_DISPLAY__FN, (SubLObject)cb_facets.$sym144$_CSETF_PERSPECTIVE_ACTION_DISPLAY__FN);
        Structures.def_csetf((SubLObject)cb_facets.$sym145$PERSPECTIVE_ACTION_DISPLAY_FN, (SubLObject)cb_facets.$sym146$_CSETF_PERSPECTIVE_ACTION_DISPLAY_FN);
        Structures.def_csetf((SubLObject)cb_facets.$sym147$PERSPECTIVE_ACTION_HANDLER__FN, (SubLObject)cb_facets.$sym148$_CSETF_PERSPECTIVE_ACTION_HANDLER__FN);
        Structures.def_csetf((SubLObject)cb_facets.$sym149$PERSPECTIVE_ACTION_HANDLER_FN, (SubLObject)cb_facets.$sym150$_CSETF_PERSPECTIVE_ACTION_HANDLER_FN);
        Equality.identity((SubLObject)cb_facets.$sym126$PERSPECTIVE_ACTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), cb_facets.$dtp_perspective_action$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.$sym155$VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_ACTION_METHOD));
        SubLObject new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list160);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym161$CHANGE_PERSPECTIVE);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym161$CHANGE_PERSPECTIVE, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list166);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym167$SHOW_DEFINITION);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym167$SHOW_DEFINITION, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list182);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym183$ADD_FORT_TO_CHOSEN_COLS);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym183$ADD_FORT_TO_CHOSEN_COLS, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list190);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym191$ADD_SPECS_TO_FACET);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym191$ADD_SPECS_TO_FACET, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list198);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym199$ADD_SPECS_TO_NEW_FACET);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym199$ADD_SPECS_TO_NEW_FACET, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list223);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym224$MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym224$MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list231);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym232$MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym232$MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list237);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym238$ADD_INSTANCES_TO_SPECS);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym238$ADD_INSTANCES_TO_SPECS, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list243);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym244$UNASSERT);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym244$UNASSERT, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        new_perspective_action = make_perspective_action((SubLObject)cb_facets.$list250);
        _csetf_perspective_action_name(new_perspective_action, (SubLObject)cb_facets.$sym251$CHANGE_MT);
        cb_facets.$perspective_actions$.setGlobalValue((SubLObject)ConsesLow.cons(new_perspective_action, Sequences.delete((SubLObject)cb_facets.$sym251$CHANGE_MT, cb_facets.$perspective_actions$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_facets.EQUAL), Symbols.symbol_function((SubLObject)cb_facets.$sym135$PERSPECTIVE_ACTION_NAME), (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED, (SubLObject)cb_facets.UNPROVIDED)));
        return (SubLObject)cb_facets.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_facets_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_facets_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_facets_file();
    }
    
    static {
        me = (SubLFile)new cb_facets();
        cb_facets.$default_facet_tool_mt$ = null;
        cb_facets.$facet_tool_mt$ = null;
        cb_facets.$cb_facet_tool_name$ = null;
        cb_facets.$cb_facet_tool_handler$ = null;
        cb_facets.$dtp_perspective$ = null;
        cb_facets.$perspectives$ = null;
        cb_facets.$perspectives_by_keyword$ = null;
        cb_facets.$perspective_type_sort$ = null;
        cb_facets.$dtp_perspective_action$ = null;
        cb_facets.$perspective_actions$ = null;
        $const0$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $sym1$_FACET_TOOL_MT_ = SubLObjectFactory.makeSymbol("*FACET-TOOL-MT*");
        $str2$Facets_Browser = SubLObjectFactory.makeString("Facets Browser");
        $str3$cb_facet = SubLObjectFactory.makeString("cb-facet");
        $kw4$FACET_BROWSER = SubLObjectFactory.makeKeyword("FACET-BROWSER");
        $str5$facet_browser_gif = SubLObjectFactory.makeString("facet-browser.gif");
        $str6$_Facets_ = SubLObjectFactory.makeString("[Facets]");
        $kw7$FACET_BROWSER_DISABLED = SubLObjectFactory.makeKeyword("FACET-BROWSER-DISABLED");
        $str8$facet_browser_disabled_gif = SubLObjectFactory.makeString("facet-browser-disabled.gif");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("INDEX-FORT"), SubLObjectFactory.makeKeyword("ACTIVE-P"), cb_facets.T, SubLObjectFactory.makeKeyword("IMAGE"), SubLObjectFactory.makeKeyword("FACET-BROWSER"), SubLObjectFactory.makeKeyword("IMAGE-DISABLED"), SubLObjectFactory.makeKeyword("FACET-BROWSER-DISABLED"), SubLObjectFactory.makeKeyword("IMAGE-ALT"), SubLObjectFactory.makeString("[Facets]"), SubLObjectFactory.makeKeyword("EFFECTIVE-FN"), SubLObjectFactory.makeSymbol("FORT-P"), SubLObjectFactory.makeKeyword("HANDLER"), SubLObjectFactory.makeString("cb-facet"), SubLObjectFactory.makeKeyword("TOOL"), cb_facets.NIL, SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeString("Facets Browser"), SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("Link to the faceting information for FORT") });
        $sym10$VFACETS = SubLObjectFactory.makeSymbol("VFACETS");
        $sym11$ADORNMENT_NAME = SubLObjectFactory.makeSymbol("ADORNMENT-NAME");
        $kw12$FORT = SubLObjectFactory.makeKeyword("FORT");
        $kw13$JUST_FORT = SubLObjectFactory.makeKeyword("JUST-FORT");
        $str14$No_term_provided_ = SubLObjectFactory.makeString("No term provided!");
        $str15$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str16$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw17$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw18$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw19$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw20$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str21$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str22$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str23$button = SubLObjectFactory.makeString("button");
        $str24$reload = SubLObjectFactory.makeString("reload");
        $str25$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str26$WARNING__You_are_transmitting_ope = SubLObjectFactory.makeString("WARNING: You are transmitting operations  Be very careful.");
        $kw27$POST = SubLObjectFactory.makeKeyword("POST");
        $kw28$PERSPECTIVE = SubLObjectFactory.makeKeyword("PERSPECTIVE");
        $kw29$GLOBAL_TOP = SubLObjectFactory.makeKeyword("GLOBAL-TOP");
        $kw30$GLOBAL_BOTTOM = SubLObjectFactory.makeKeyword("GLOBAL-BOTTOM");
        $sym31$CB_FACET = SubLObjectFactory.makeSymbol("CB-FACET");
        $kw32$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym33$PERSPECTIVE = SubLObjectFactory.makeSymbol("PERSPECTIVE");
        $sym34$PERSPECTIVE_P = SubLObjectFactory.makeSymbol("PERSPECTIVE-P");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-STRING"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-STRING"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-DISPLAY-STRING"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-STRING"));
        $sym39$PRINT_PERSPECTIVE = SubLObjectFactory.makeSymbol("PRINT-PERSPECTIVE");
        $sym40$PERSPECTIVE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PERSPECTIVE-PRINT-FUNCTION-TRAMPOLINE");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-P"));
        $sym42$PERSPECTIVE_NAME = SubLObjectFactory.makeSymbol("PERSPECTIVE-NAME");
        $sym43$_CSETF_PERSPECTIVE_NAME = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-NAME");
        $sym44$PERSPECTIVE_KEYWORD = SubLObjectFactory.makeSymbol("PERSPECTIVE-KEYWORD");
        $sym45$_CSETF_PERSPECTIVE_KEYWORD = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-KEYWORD");
        $sym46$PERSPECTIVE_DISPLAY__FN = SubLObjectFactory.makeSymbol("PERSPECTIVE-DISPLAY?-FN");
        $sym47$_CSETF_PERSPECTIVE_DISPLAY__FN = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-DISPLAY?-FN");
        $sym48$PERSPECTIVE_DISPLAY_FN = SubLObjectFactory.makeSymbol("PERSPECTIVE-DISPLAY-FN");
        $sym49$_CSETF_PERSPECTIVE_DISPLAY_FN = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-FN");
        $sym50$PERSPECTIVE_DISPLAY_STRING = SubLObjectFactory.makeSymbol("PERSPECTIVE-DISPLAY-STRING");
        $sym51$_CSETF_PERSPECTIVE_DISPLAY_STRING = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-DISPLAY-STRING");
        $kw52$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw53$KEYWORD = SubLObjectFactory.makeKeyword("KEYWORD");
        $kw54$DISPLAY__FN = SubLObjectFactory.makeKeyword("DISPLAY?-FN");
        $kw55$DISPLAY_FN = SubLObjectFactory.makeKeyword("DISPLAY-FN");
        $kw56$DISPLAY_STRING = SubLObjectFactory.makeKeyword("DISPLAY-STRING");
        $str57$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw58$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym59$MAKE_PERSPECTIVE = SubLObjectFactory.makeSymbol("MAKE-PERSPECTIVE");
        $kw60$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw61$END = SubLObjectFactory.makeKeyword("END");
        $sym62$VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PERSPECTIVE-METHOD");
        $int63$32 = SubLObjectFactory.makeInteger(32);
        $str64$_ = SubLObjectFactory.makeString("#");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"));
        $sym66$NEW_PERSPECTIVE = SubLObjectFactory.makeUninternedSymbol("NEW-PERSPECTIVE");
        $sym67$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym68$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym69$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym70$SETHASH = SubLObjectFactory.makeSymbol("SETHASH");
        $sym71$_PERSPECTIVES_BY_KEYWORD_ = SubLObjectFactory.makeSymbol("*PERSPECTIVES-BY-KEYWORD*");
        $sym72$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym73$_PERSPECTIVES_ = SubLObjectFactory.makeSymbol("*PERSPECTIVES*");
        $sym74$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym75$DELETE = SubLObjectFactory.makeSymbol("DELETE");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PERSPECTIVES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)cb_facets.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-NAME")));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DISPLAY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AS-INDIVIDUAL"), (SubLObject)SubLObjectFactory.makeKeyword("AS-COLLECTION")), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AS-COLLECTION"), (SubLObject)SubLObjectFactory.makeKeyword("AS-INDIVIDUAL")));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("AS-INDIVIDUAL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-AS-INDIVIDUAL?"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-SHOW-AS-INDIVIDUAL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-STRING"), (SubLObject)SubLObjectFactory.makeString("Individual"));
        $sym79$AS_INDIVIDUAL = SubLObjectFactory.makeSymbol("AS-INDIVIDUAL");
        $str80$100_ = SubLObjectFactory.makeString("100%");
        $kw81$A_FACET = SubLObjectFactory.makeKeyword("A-FACET");
        $sym82$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE>");
        $sym83$FORT_NAME_ = SubLObjectFactory.makeSymbol("FORT-NAME<");
        $str84$6_ = SubLObjectFactory.makeString("6%");
        $const85$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw86$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $kw87$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw88$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $str89$i_ = SubLObjectFactory.makeString("i ");
        $kw90$ADD_SUP = SubLObjectFactory.makeKeyword("ADD-SUP");
        $kw91$ADD_SUP_FROM = SubLObjectFactory.makeKeyword("ADD-SUP-FROM");
        $kw92$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str93$x_ = SubLObjectFactory.makeString("x ");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("AS-COLLECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOW-AS-COLLECTION?"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-SHOW-AS-COLLECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-STRING"), (SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym95$AS_COLLECTION = SubLObjectFactory.makeSymbol("AS-COLLECTION");
        $const96$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw97$ASSERTED_TRUE = SubLObjectFactory.makeKeyword("ASSERTED-TRUE");
        $kw98$COEXTENSIONAL = SubLObjectFactory.makeKeyword("COEXTENSIONAL");
        $str99$__genls__ = SubLObjectFactory.makeString("* genls: ");
        $str100$in_Mt = SubLObjectFactory.makeString("in Mt");
        $str101$Unassert = SubLObjectFactory.makeString("Unassert");
        $kw102$UNASSERT_GO = SubLObjectFactory.makeKeyword("UNASSERT-GO");
        $str103$__coextensional_ = SubLObjectFactory.makeString(" (coextensional)");
        $kw104$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $kw105$UNASSERT_ID = SubLObjectFactory.makeKeyword("UNASSERT-ID");
        $sym106$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $kw107$FACETS_ = SubLObjectFactory.makeKeyword("FACETS?");
        $str108$__faceted_specs__ = SubLObjectFactory.makeString("* faceted specs: ");
        $kw109$FACET_ID = SubLObjectFactory.makeKeyword("FACET-ID");
        $kw110$FACET_ID_SELECTED = SubLObjectFactory.makeKeyword("FACET-ID-SELECTED");
        $str111$_A_SPEC = SubLObjectFactory.makeString("~A-SPEC");
        $str112$_A_SPEC_SELECTED = SubLObjectFactory.makeString("~A-SPEC-SELECTED");
        $kw113$SPECS_FACETED_ = SubLObjectFactory.makeKeyword("SPECS-FACETED?");
        $int114$200 = SubLObjectFactory.makeInteger(200);
        $int115$100 = SubLObjectFactory.makeInteger(100);
        $kw116$SPECS_UNFACETED_ = SubLObjectFactory.makeKeyword("SPECS-UNFACETED?");
        $str117$__unfaceted_specs__ = SubLObjectFactory.makeString("* unfaceted specs: ");
        $kw118$SPEC_UNFACETED = SubLObjectFactory.makeKeyword("SPEC-UNFACETED");
        $str119$____ = SubLObjectFactory.makeString("|__ ");
        $str120$_unfaceted_specs_not_shown_ = SubLObjectFactory.makeString(" unfaceted specs not shown.");
        $const121$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $kw122$INSTANCES_ = SubLObjectFactory.makeKeyword("INSTANCES?");
        $str123$__instances__ = SubLObjectFactory.makeString("* instances: ");
        $kw124$INSTANCE = SubLObjectFactory.makeKeyword("INSTANCE");
        $str125$_instances_not_shown_ = SubLObjectFactory.makeString(" instances not shown.");
        $sym126$PERSPECTIVE_ACTION = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION");
        $sym127$PERSPECTIVE_ACTION_P = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-P");
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("ORDER-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLER?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLER-FN"));
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("ORDER-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("PERSPECTIVE"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER?-FN"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER-FN"));
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ORDER-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-PERSPECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-HANDLER?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-HANDLER-FN"));
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-ORDER-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-PERSPECTIVE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER?-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER-FN"));
        $sym132$PRINT_PERSPECTIVE_ACTION = SubLObjectFactory.makeSymbol("PRINT-PERSPECTIVE-ACTION");
        $sym133$PERSPECTIVE_ACTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-PRINT-FUNCTION-TRAMPOLINE");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-P"));
        $sym135$PERSPECTIVE_ACTION_NAME = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-NAME");
        $sym136$_CSETF_PERSPECTIVE_ACTION_NAME = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-NAME");
        $sym137$PERSPECTIVE_ACTION_KEYWORD = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-KEYWORD");
        $sym138$_CSETF_PERSPECTIVE_ACTION_KEYWORD = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-KEYWORD");
        $sym139$PERSPECTIVE_ACTION_ORDER_NUM = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ORDER-NUM");
        $sym140$_CSETF_PERSPECTIVE_ACTION_ORDER_NUM = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-ORDER-NUM");
        $sym141$PERSPECTIVE_ACTION_PERSPECTIVE = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-PERSPECTIVE");
        $sym142$_CSETF_PERSPECTIVE_ACTION_PERSPECTIVE = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-PERSPECTIVE");
        $sym143$PERSPECTIVE_ACTION_DISPLAY__FN = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-DISPLAY?-FN");
        $sym144$_CSETF_PERSPECTIVE_ACTION_DISPLAY__FN = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY?-FN");
        $sym145$PERSPECTIVE_ACTION_DISPLAY_FN = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-DISPLAY-FN");
        $sym146$_CSETF_PERSPECTIVE_ACTION_DISPLAY_FN = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-DISPLAY-FN");
        $sym147$PERSPECTIVE_ACTION_HANDLER__FN = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-HANDLER?-FN");
        $sym148$_CSETF_PERSPECTIVE_ACTION_HANDLER__FN = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER?-FN");
        $sym149$PERSPECTIVE_ACTION_HANDLER_FN = SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-HANDLER-FN");
        $sym150$_CSETF_PERSPECTIVE_ACTION_HANDLER_FN = SubLObjectFactory.makeSymbol("_CSETF-PERSPECTIVE-ACTION-HANDLER-FN");
        $kw151$ORDER_NUM = SubLObjectFactory.makeKeyword("ORDER-NUM");
        $kw152$HANDLER__FN = SubLObjectFactory.makeKeyword("HANDLER?-FN");
        $kw153$HANDLER_FN = SubLObjectFactory.makeKeyword("HANDLER-FN");
        $sym154$MAKE_PERSPECTIVE_ACTION = SubLObjectFactory.makeSymbol("MAKE-PERSPECTIVE-ACTION");
        $sym155$VISIT_DEFSTRUCT_OBJECT_PERSPECTIVE_ACTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PERSPECTIVE-ACTION-METHOD");
        $sym156$NEW_PERSPECTIVE_ACTION = SubLObjectFactory.makeUninternedSymbol("NEW-PERSPECTIVE-ACTION");
        $sym157$_PERSPECTIVE_ACTIONS_ = SubLObjectFactory.makeSymbol("*PERSPECTIVE-ACTIONS*");
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PERSPECTIVE-ACTIONS*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)cb_facets.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-NAME")));
        $sym159$_ = SubLObjectFactory.makeSymbol("<");
        $list160 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("CHANGE-PERSPECTIVE"), SubLObjectFactory.makeKeyword("ORDER-NUM"), cb_facets.TEN_INTEGER, SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("GLOBAL-TOP"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-CHANGE-PERSPECTIVE-HANDLER") });
        $sym161$CHANGE_PERSPECTIVE = SubLObjectFactory.makeSymbol("CHANGE-PERSPECTIVE");
        $str162$__A_ = SubLObjectFactory.makeString("[~A]");
        $str163$_A__A = SubLObjectFactory.makeString("~A?~A");
        $kw164$NEW_PERSPECTIVE = SubLObjectFactory.makeKeyword("NEW-PERSPECTIVE");
        $kw165$DISPLAY = SubLObjectFactory.makeKeyword("DISPLAY");
        $list166 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("SHOW-DEFINITION"), SubLObjectFactory.makeKeyword("ORDER-NUM"), cb_facets.TWENTY_INTEGER, SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("GLOBAL-TOP"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-SHOW-DEFINITION-HANDLER") });
        $sym167$SHOW_DEFINITION = SubLObjectFactory.makeSymbol("SHOW-DEFINITION");
        $kw168$MIDDLE = SubLObjectFactory.makeKeyword("MIDDLE");
        $str169$_Show_ = SubLObjectFactory.makeString("(Show ");
        $str170$_in_Index_Browser_ = SubLObjectFactory.makeString(" in Index Browser)");
        $sym171$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const172$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym173$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $sym174$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $str175$Defined_in_ = SubLObjectFactory.makeString("Defined in ");
        $str176$_ = SubLObjectFactory.makeString(" ");
        $const177$comment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment"));
        $str178$No_comment_ = SubLObjectFactory.makeString("No comment.");
        $str179$__isa__ = SubLObjectFactory.makeString("* isa: ");
        $str180$Undefined_in_current_Mt_ = SubLObjectFactory.makeString("Undefined in current Mt.");
        $kw181$DESCENDING = SubLObjectFactory.makeKeyword("DESCENDING");
        $list182 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ADD-FORT-TO-CHOSEN-COLS"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-INDIVIDUAL"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-FORT-TO-CHOSEN-COLS-HANDLER") });
        $sym183$ADD_FORT_TO_CHOSEN_COLS = SubLObjectFactory.makeSymbol("ADD-FORT-TO-CHOSEN-COLS");
        $str184$__Make_ = SubLObjectFactory.makeString("* Make ");
        $str185$_a_direct_instance_of_selected_co = SubLObjectFactory.makeString(" a direct instance of selected collections. ");
        $str186$Go = SubLObjectFactory.makeString("Go");
        $kw187$ADD_FORT_TO_CHOSEN_COLS_GO = SubLObjectFactory.makeKeyword("ADD-FORT-TO-CHOSEN-COLS-GO");
        $kw188$ERRORS = SubLObjectFactory.makeKeyword("ERRORS");
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-COLLECTIONS-CHOSEN"));
        $list190 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ADD-SPECS-TO-FACET"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(40), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-FACET-HANDLER") });
        $sym191$ADD_SPECS_TO_FACET = SubLObjectFactory.makeSymbol("ADD-SPECS-TO-FACET");
        $str192$__Add_selected_spec_s__to_selecte = SubLObjectFactory.makeString("* Add selected spec(s) to selected facet ");
        $kw193$ADD_SPECS_TO_FACET_GO = SubLObjectFactory.makeKeyword("ADD-SPECS-TO-FACET-GO");
        $list194 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-SPEC-CHOSEN"));
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-FACET-CHOSEN"));
        $kw196$UNSUPPORTED_FACET_CHOSEN = SubLObjectFactory.makeKeyword("UNSUPPORTED-FACET-CHOSEN");
        $str197$_A_assertions_must_currently_be_h = SubLObjectFactory.makeString("~A assertions must currently be hand edited.");
        $list198 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ADD-SPECS-TO-NEW-FACET"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(50), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-SPECS-TO-NEW-FACET-HANDLER") });
        $sym199$ADD_SPECS_TO_NEW_FACET = SubLObjectFactory.makeSymbol("ADD-SPECS-TO-NEW-FACET");
        $str200$__Make_a_new_facet_with_selected_ = SubLObjectFactory.makeString("* Make a new facet with selected spec(s) as instances ");
        $kw201$ADD_SPECS_TO_NEW_FACET_GO = SubLObjectFactory.makeKeyword("ADD-SPECS-TO-NEW-FACET-GO");
        $str202$New_facet_name__ = SubLObjectFactory.makeString("New facet name: ");
        $str203$TypeBy = SubLObjectFactory.makeString("TypeBy");
        $kw204$NEW_FACET_NAME = SubLObjectFactory.makeKeyword("NEW-FACET-NAME");
        $str205$ = SubLObjectFactory.makeString("");
        $str206$New_facet_type__ = SubLObjectFactory.makeString("New facet type: ");
        $kw207$NEW_FACET_TYPE = SubLObjectFactory.makeKeyword("NEW-FACET-TYPE");
        $const208$facets_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Generic"));
        $str209$_generic_ = SubLObjectFactory.makeString(" generic ");
        $const210$facets_Strict = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Strict"));
        $str211$_strict_ = SubLObjectFactory.makeString(" strict ");
        $const212$facets_Covering = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Covering"));
        $str213$_covering_ = SubLObjectFactory.makeString(" covering ");
        $const214$facets_Partition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Partition"));
        $str215$_partition_ = SubLObjectFactory.makeString(" partition ");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-FACET-TYPE-CHOSEN"));
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-FACET-NAME-CHOSEN"));
        $str218$_ATypeBy_A = SubLObjectFactory.makeString("~ATypeBy~A");
        $list219 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DisjointCollectionType")));
        $list220 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType")));
        $list221 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConventionalClassificationType")));
        $str222$A_collection_of_collections__Each = SubLObjectFactory.makeString("A collection of collections. Each instance is a spec of ~A whose instances are all of the same ~A.");
        $list223 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(60), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-HANDLER") });
        $sym224$MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC = SubLObjectFactory.makeSymbol("MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC");
        $str225$__Make_selected_spec_s__direct_sp = SubLObjectFactory.makeString("* Make selected spec(s) direct specs of specified collection or new spec");
        $kw226$MAKE_SPECS_INSTANCES_OF_COL_OR_NEW_SPEC_GO = SubLObjectFactory.makeKeyword("MAKE-SPECS-INSTANCES-OF-COL-OR-NEW-SPEC-GO");
        $str227$Collection_or_new_spec_name__ = SubLObjectFactory.makeString("Collection or new spec name: ");
        $kw228$NEW_SPEC_NAME = SubLObjectFactory.makeKeyword("NEW-SPEC-NAME");
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVALID-SPEC-NAME"));
        $list230 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")));
        $list231 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(60), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-HANDLER") });
        $sym232$MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS = SubLObjectFactory.makeSymbol("MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS");
        $str233$__Make_selected_unfaceted_spec_s_ = SubLObjectFactory.makeString("* Make selected unfaceted spec(s) direct specs of selected faceted spec(s)");
        $kw234$MAKE_UNFACETED_SPECS_DIRECT_SPECS_OF_FACETED_SPECS_GO = SubLObjectFactory.makeKeyword("MAKE-UNFACETED-SPECS-DIRECT-SPECS-OF-FACETED-SPECS-GO");
        $list235 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-UNFACETED-SPECS-CHOSEN"));
        $list236 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-FACETED-SPECS-CHOSEN"));
        $list237 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ADD-INSTANCES-TO-SPECS"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(70), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("AS-COLLECTION"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-ADD-INSTANCES-TO-SPECS-HANDLER") });
        $sym238$ADD_INSTANCES_TO_SPECS = SubLObjectFactory.makeSymbol("ADD-INSTANCES-TO-SPECS");
        $str239$__Add_selected_instance_s__to_sel = SubLObjectFactory.makeString("* Add selected instance(s) to selected spec(s)");
        $kw240$ADD_INSTANCES_TO_SPECS_GO = SubLObjectFactory.makeKeyword("ADD-INSTANCES-TO-SPECS-GO");
        $list241 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-SPECS-CHOSEN"));
        $list242 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-INSTANCES-CHOSEN"));
        $list243 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("UNASSERT"), SubLObjectFactory.makeKeyword("ORDER-NUM"), cb_facets.ZERO_INTEGER, SubLObjectFactory.makeKeyword("PERSPECTIVE"), cb_facets.NIL, SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-UNASSERT-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-UNASSERT-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-UNASSERT-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-UNASSERT-HANDLER") });
        $sym244$UNASSERT = SubLObjectFactory.makeSymbol("UNASSERT");
        $list245 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $list246 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionTypeType")));
        $const247$CollectionTypeType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionTypeType"));
        $const248$CollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $const249$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $list250 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("CHANGE-MT"), SubLObjectFactory.makeKeyword("ORDER-NUM"), SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeKeyword("PERSPECTIVE"), SubLObjectFactory.makeKeyword("GLOBAL-BOTTOM"), SubLObjectFactory.makeKeyword("DISPLAY?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY?"), SubLObjectFactory.makeKeyword("DISPLAY-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-DISPLAY"), SubLObjectFactory.makeKeyword("HANDLER?-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-HANDLER?"), SubLObjectFactory.makeKeyword("HANDLER-FN"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTION-CHANGE-MT-HANDLER") });
        $sym251$CHANGE_MT = SubLObjectFactory.makeSymbol("CHANGE-MT");
        $kw252$MT = SubLObjectFactory.makeKeyword("MT");
        $str253$__Change_current_Mt_from_ = SubLObjectFactory.makeString("* Change current Mt from ");
        $kw254$CHANGE_MT_GO = SubLObjectFactory.makeKeyword("CHANGE-MT-GO");
        $str255$_New_Mt_name__ = SubLObjectFactory.makeString(" New Mt name: ");
        $int256$30 = SubLObjectFactory.makeInteger(30);
        $str257$Complete = SubLObjectFactory.makeString("Complete");
        $const258$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $sym259$STRING_DOWNCASE = SubLObjectFactory.makeSymbol("STRING-DOWNCASE");
        $list260 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("-"));
        $str261$_A___A = SubLObjectFactory.makeString("~A: ~A");
        $str262$Errors_found_ = SubLObjectFactory.makeString("Errors found:");
        $kw263$SUCCESSES = SubLObjectFactory.makeKeyword("SUCCESSES");
        $str264$Actions_taken_ = SubLObjectFactory.makeString("Actions taken:");
        $kw265$ASSERTED = SubLObjectFactory.makeKeyword("ASSERTED");
        $str266$_A_in__A = SubLObjectFactory.makeString("~A in ~A");
        $kw267$UNASSERTED = SubLObjectFactory.makeKeyword("UNASSERTED");
        $str268$_A_from__A = SubLObjectFactory.makeString("~A from ~A");
    }
    
    public static final class $perspective_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $keyword;
        public SubLObject $displayP_fn;
        public SubLObject $display_fn;
        public SubLObject $display_string;
        private static final SubLStructDeclNative structDecl;
        
        public $perspective_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$keyword = (SubLObject)CommonSymbols.NIL;
            this.$displayP_fn = (SubLObject)CommonSymbols.NIL;
            this.$display_fn = (SubLObject)CommonSymbols.NIL;
            this.$display_string = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$perspective_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$keyword;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$displayP_fn;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$display_fn;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$display_string;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$keyword = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$displayP_fn = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$display_fn = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$display_string = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$perspective_native.class, cb_facets.$sym33$PERSPECTIVE, cb_facets.$sym34$PERSPECTIVE_P, cb_facets.$list35, cb_facets.$list36, new String[] { "$name", "$keyword", "$displayP_fn", "$display_fn", "$display_string" }, cb_facets.$list37, cb_facets.$list38, cb_facets.$sym39$PRINT_PERSPECTIVE);
        }
    }
    
    public static final class $perspective_p$UnaryFunction extends UnaryFunction
    {
        public $perspective_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PERSPECTIVE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cb_facets.perspective_p(arg1);
        }
    }
    
    public static final class $perspective_action_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $keyword;
        public SubLObject $order_num;
        public SubLObject $perspective;
        public SubLObject $displayP_fn;
        public SubLObject $display_fn;
        public SubLObject $handlerP_fn;
        public SubLObject $handler_fn;
        private static final SubLStructDeclNative structDecl;
        
        public $perspective_action_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$keyword = (SubLObject)CommonSymbols.NIL;
            this.$order_num = (SubLObject)CommonSymbols.NIL;
            this.$perspective = (SubLObject)CommonSymbols.NIL;
            this.$displayP_fn = (SubLObject)CommonSymbols.NIL;
            this.$display_fn = (SubLObject)CommonSymbols.NIL;
            this.$handlerP_fn = (SubLObject)CommonSymbols.NIL;
            this.$handler_fn = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$perspective_action_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$keyword;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$order_num;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$perspective;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$displayP_fn;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$display_fn;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$handlerP_fn;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$handler_fn;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$keyword = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$order_num = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$perspective = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$displayP_fn = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$display_fn = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$handlerP_fn = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$handler_fn = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$perspective_action_native.class, cb_facets.$sym126$PERSPECTIVE_ACTION, cb_facets.$sym127$PERSPECTIVE_ACTION_P, cb_facets.$list128, cb_facets.$list129, new String[] { "$name", "$keyword", "$order_num", "$perspective", "$displayP_fn", "$display_fn", "$handlerP_fn", "$handler_fn" }, cb_facets.$list130, cb_facets.$list131, cb_facets.$sym132$PRINT_PERSPECTIVE_ACTION);
        }
    }
    
    public static final class $perspective_action_p$UnaryFunction extends UnaryFunction
    {
        public $perspective_action_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PERSPECTIVE-ACTION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return cb_facets.perspective_action_p(arg1);
        }
    }
}

/*

	Total time: 3522 ms
	
*/