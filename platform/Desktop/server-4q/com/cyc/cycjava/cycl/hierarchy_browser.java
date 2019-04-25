package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hierarchy_browser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hierarchy_browser";
    public static final String myFingerPrint = "3d8e80573d40656003f46dc8cf56a9bc4254f25339aa04cb83f178deffb1ccef";
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 570L)
    private static SubLSymbol $hb_type_default_forms$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 1045L)
    private static SubLSymbol $hb_alternate_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 1413L)
    private static SubLSymbol $hb_icon_choices$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 1565L)
    private static SubLSymbol $hb_bar_choice$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 1623L)
    private static SubLSymbol $hb_previous_term_id$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 1780L)
    public static SubLSymbol $hb_icon$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 1825L)
    public static SubLSymbol $hb_bar$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 1869L)
    public static SubLSymbol $hb_top_sign$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 1920L)
    public static SubLSymbol $hb_bottom_sign$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 1974L)
    public static SubLSymbol $hb_more_superiors_sign$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2037L)
    public static SubLSymbol $hb_more_inferiors_sign$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2100L)
    public static SubLSymbol $hb_cycle_sign$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2162L)
    public static SubLSymbol $hb_large_font_size$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2206L)
    public static SubLSymbol $hb_small_font_size$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2250L)
    public static SubLSymbol $hb_tiny_font_size$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2293L)
    public static SubLSymbol $hb_pivot_term$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2430L)
    public static SubLSymbol $hb_table$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2491L)
    public static SubLSymbol $hb_superior_table$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2602L)
    public static SubLSymbol $hb_duplicates_table$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2719L)
    public static SubLSymbol $hb_indent_quantum$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2772L)
    public static SubLSymbol $hb_indent$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2807L)
    public static SubLSymbol $hb_counter$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2843L)
    public static SubLSymbol $hb_reset_parameter_notice_threshhold$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2907L)
    public static SubLSymbol $hb_use_defaults_for_type$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 2959L)
    public static SubLSymbol $hb_alternate_predicate$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3009L)
    public static SubLSymbol $hb_use_lexicon$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3130L)
    public static SubLSymbol $hb_computed_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3177L)
    public static SubLSymbol $hb_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3225L)
    public static SubLSymbol $hb_max_height$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3274L)
    public static SubLSymbol $hb_max_inferiors$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3328L)
    public static SubLSymbol $hb_show_comments$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3382L)
    public static SubLSymbol $hb_show_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3429L)
    public static SubLSymbol $hb_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3500L)
    public static SubLSymbol $hb_predicate$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3574L)
    public static SubLSymbol $hb_index_argument$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3627L)
    public static SubLSymbol $hb_gather_argument$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3671L)
    public static SubLSymbol $hb_use_genl_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3724L)
    public static SubLSymbol $hb_background_color$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3789L)
    public static SubLSymbol $hb_message_color$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3844L)
    public static SubLSymbol $hb_message$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3882L)
    public static SubLSymbol $hb_eval_form$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3922L)
    public static SubLSymbol $hb_inverse_eval_form$;
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 3970L)
    private static SubLSymbol $hb_debug$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$YELLOW_STAR;
    private static final SubLString $str3$star_gif;
    private static final SubLString $str4$_;
    private static final SubLSymbol $kw5$GREEN_STAR;
    private static final SubLString $str6$grnstar_gif;
    private static final SubLSymbol $kw7$CYAN_STAR;
    private static final SubLString $str8$cyanstar_gif;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$CELTIC_BAR;
    private static final SubLString $str11$celtic_bar_gif;
    private static final SubLSymbol $sym12$_HB_ICON_;
    private static final SubLSymbol $sym13$_HB_BAR_;
    private static final SubLString $str14$___;
    private static final SubLSymbol $sym15$_HB_TOP_SIGN_;
    private static final SubLString $str16$___;
    private static final SubLSymbol $sym17$_HB_BOTTOM_SIGN_;
    private static final SubLString $str18$____;
    private static final SubLSymbol $sym19$_HB_MORE_SUPERIORS_SIGN_;
    private static final SubLString $str20$____;
    private static final SubLSymbol $sym21$_HB_MORE_INFERIORS_SIGN_;
    private static final SubLString $str22$__see_above_;
    private static final SubLSymbol $sym23$_HB_CYCLE_SIGN_;
    private static final SubLSymbol $sym24$_HB_LARGE_FONT_SIZE_;
    private static final SubLSymbol $sym25$_HB_SMALL_FONT_SIZE_;
    private static final SubLSymbol $sym26$_HB_TINY_FONT_SIZE_;
    private static final SubLSymbol $sym27$_HB_PIVOT_TERM_;
    private static final SubLSymbol $sym28$_HB_TABLE_;
    private static final SubLSymbol $sym29$_HB_SUPERIOR_TABLE_;
    private static final SubLSymbol $sym30$_HB_DUPLICATES_TABLE_;
    private static final SubLSymbol $sym31$_HB_INDENT_QUANTUM_;
    private static final SubLSymbol $sym32$_HB_INDENT_;
    private static final SubLSymbol $sym33$_HB_COUNTER_;
    private static final SubLSymbol $sym34$_HB_RESET_PARAMETER_NOTICE_THRESHHOLD_;
    private static final SubLSymbol $sym35$_HB_USE_DEFAULTS_FOR_TYPE_;
    private static final SubLSymbol $sym36$_HB_ALTERNATE_PREDICATE_;
    private static final SubLSymbol $sym37$_HB_USE_LEXICON_;
    private static final SubLSymbol $sym38$_HB_COMPUTED_MAX_DEPTH_;
    private static final SubLSymbol $sym39$_HB_MAX_DEPTH_;
    private static final SubLSymbol $sym40$_HB_MAX_HEIGHT_;
    private static final SubLInteger $int41$200;
    private static final SubLSymbol $sym42$_HB_MAX_INFERIORS_;
    private static final SubLSymbol $sym43$_HB_SHOW_COMMENTS_;
    private static final SubLSymbol $sym44$_HB_SHOW_MTS_;
    private static final SubLSymbol $kw45$ALL;
    private static final SubLSymbol $sym46$_HB_MT_;
    private static final SubLSymbol $sym47$_HB_PREDICATE_;
    private static final SubLSymbol $sym48$_HB_INDEX_ARGUMENT_;
    private static final SubLSymbol $sym49$_HB_GATHER_ARGUMENT_;
    private static final SubLSymbol $sym50$_HB_USE_GENL_MTS_;
    private static final SubLSymbol $kw51$LIGHT_GRAY;
    private static final SubLSymbol $sym52$_HB_BACKGROUND_COLOR_;
    private static final SubLSymbol $kw53$RED;
    private static final SubLSymbol $sym54$_HB_MESSAGE_COLOR_;
    private static final SubLSymbol $sym55$_HB_MESSAGE_;
    private static final SubLSymbol $sym56$_HB_EVAL_FORM_;
    private static final SubLSymbol $sym57$_HB_INVERSE_EVAL_FORM_;
    private static final SubLSymbol $sym58$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const59$EverythingPSC;
    private static final SubLSymbol $kw60$RED_DIAMOND;
    private static final SubLString $str61$;
    private static final SubLString $str62$Starting_Term;
    private static final SubLString $str63$Current_Term__;
    private static final SubLString $str64$_2;
    private static final SubLString $str65$None;
    private static final SubLString $str66$cur_term;
    private static final SubLString $str67$Change_Term__;
    private static final SubLString $str68$new_term;
    private static final SubLString $str69$Complete;
    private static final SubLInteger $int70$25;
    private static final SubLString $str71$defaults_for_type;
    private static final SubLString $str72$_Use_default_settings_for_term;
    private static final SubLSymbol $kw73$TOP;
    private static final SubLString $str74$Specify_Non_Default_Settings;
    private static final SubLString $str75$middle;
    private static final SubLString $str76$top;
    private static final SubLString $str77$Binary_Predicate;
    private static final SubLString $str78$pred;
    private static final SubLObject $const79$BinaryPredicate;
    private static final SubLString $str80$Index_Argument;
    private static final SubLString $str81$index;
    private static final SubLString $str82$_1;
    private static final SubLString $str83$_2;
    private static final SubLString $str84$Microtheory;
    private static final SubLString $str85$mt;
    private static final SubLObject $const86$Microtheory;
    private static final SubLString $str87$genl_mts;
    private static final SubLString $str88$_Use_its_genl_mts_too__if_possibl;
    private static final SubLString $str89$all_mts;
    private static final SubLString $str90$_Use_all_mts;
    private static final SubLString $str91$Height_and_Depth;
    private static final SubLString $str92$right;
    private static final SubLString $str93$Max_height__;
    private static final SubLString $str94$height;
    private static final SubLSymbol $sym95$ALL;
    private static final SubLSymbol $sym96$NONE;
    private static final SubLList $list97;
    private static final SubLString $str98$Max_depth__;
    private static final SubLString $str99$depth;
    private static final SubLString $str100$Max_inferior_terms__;
    private static final SubLString $str101$inferior;
    private static final SubLString $str102$Extras;
    private static final SubLString $str103$lex;
    private static final SubLString $str104$_Use_lexicon_entries__if_possible;
    private static final SubLString $str105$comments;
    private static final SubLString $str106$_Show_comments_for_terms;
    private static final SubLString $str107$mts_after;
    private static final SubLString $str108$_Show_assertion_s_mts_after_terms;
    private static final SubLString $str109$Indent_quantum__;
    private static final SubLString $str110$quantum;
    private static final SubLSymbol $kw111$HB_COLORS_AND_SYMBOLS;
    private static final SubLString $str112$bg_color;
    private static final SubLString $str113$__;
    private static final SubLString $str114$The_background_color_for_Hierarch;
    private static final SubLString $str115$msg_color;
    private static final SubLString $str116$The_color_for_Hierarchy_Browser_a;
    private static final SubLString $str117$hb_icon;
    private static final SubLString $str118$The_hierarchical_display_link_ico;
    private static final SubLString $str119$hb_bar;
    private static final SubLString $str120$___;
    private static final SubLString $str121$Use_decorative_separator_bar;
    private static final SubLString $str122$hb_top_sign;
    private static final SubLString $str123$__term_;
    private static final SubLString $str124$Indicates_that__term__has_no_supe;
    private static final SubLString $str125$_term__;
    private static final SubLString $str126$hb_bottom_sign;
    private static final SubLString $str127$Indicates_that__term__has_no_infe;
    private static final SubLString $str128$superiors_sign;
    private static final SubLString $str129$Indicates_that__term__has_more_un;
    private static final SubLString $str130$inferiors_sign;
    private static final SubLString $str131$Indicates_that__term__has_more_un;
    private static final SubLString $str132$cycle_sign;
    private static final SubLString $str133$Indicates_that_a_sequence_of_term;
    private static final SubLSymbol $sym134$STRING_LESSP;
    private static final SubLSymbol $sym135$COERCE_NAME;
    private static final SubLSymbol $kw136$HB_PARAMETERS;
    private static final SubLString $str137$hb_parameters_html;
    private static final SubLString $str138$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str139$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw140$UNINITIALIZED;
    private static final SubLSymbol $kw141$CB_CYC;
    private static final SubLString $str142$Cyc_Hierarchy_Browser;
    private static final SubLString $str143$post;
    private static final SubLString $str144$hb_handle_parameters;
    private static final SubLString $str145$Current_Settings;
    private static final SubLString $str146$Display_Hierarchy;
    private static final SubLSymbol $sym147$HB_PARAMETERS;
    private static final SubLSymbol $kw148$HTML_HANDLER;
    private static final SubLString $str149$HB_Colors_and_Symbols;
    private static final SubLString $str150$Hierarchy_Browser_Colors_and_Symb;
    private static final SubLString $str151$hb_handle_colors_and_symbols;
    private static final SubLString $str152$Update;
    private static final SubLSymbol $sym153$HB_COLORS_AND_SYMBOLS;
    private static final SubLString $str154$term;
    private static final SubLSymbol $sym155$VALID_TIMESTRING_CHAR_;
    private static final SubLSymbol $sym156$VALID_FORT_;
    private static final SubLList $list157;
    private static final SubLSymbol $sym158$MT_;
    private static final SubLSymbol $sym159$HB_BINARY_PREDICATE_;
    private static final SubLString $str160$2;
    private static final SubLInteger $int161$50;
    private static final SubLSymbol $kw162$TERM;
    private static final SubLObject $const163$Predicate;
    private static final SubLSymbol $kw164$PRED;
    private static final SubLSymbol $kw165$MT;
    private static final SubLString $str166$The_input__s_did_not_yield_a_vali;
    private static final SubLString $str167$The_input__s_did_not_yield_a_vali;
    private static final SubLString $str168$The_input__s_did_not_yield_a_vali;
    private static final SubLString $str169$Parameters_updated_at__a_on__a;
    private static final SubLSymbol $sym170$HB_HANDLE_PARAMETERS;
    private static final SubLSymbol $kw171$DEFAULT;
    private static final SubLSymbol $kw172$BLACK;
    private static final SubLString $str173$Colors_and_symbols_updated_at__a_;
    private static final SubLSymbol $sym174$HB_HANDLE_COLORS_AND_SYMBOLS;
    private static final SubLList $list175;
    private static final SubLString $str176$Using_default_settings_for_instan;
    private static final SubLString $str177$No_default_display_parameters_are;
    private static final SubLSymbol $sym178$HB_STRING_FOR_CONSTANT;
    private static final SubLString $str179$predicate;
    private static final SubLString $str180$microtheory;
    private static final SubLString $str181$microtheories;
    private static final SubLString $str182$_as;
    private static final SubLString $str183$Choose_Constants__Simple_Version;
    private static final SubLString $str184$Choose_a__a;
    private static final SubLString $str185$Please_choose_one_of_the_followin;
    private static final SubLString $str186$left;
    private static final SubLSymbol $kw187$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS;
    private static final SubLSymbol $kw188$SELF;
    private static final SubLSymbol $sym189$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS;
    private static final SubLString $str190$Choose_Constants__Complex_Version;
    private static final SubLString $str191$Resolve_Ambiguous_Input;
    private static final SubLString $str192$hb_handle_complex_choose_constant;
    private static final SubLString $str193$Go;
    private static final SubLString $str194$Please_select_one_term_from_each_;
    private static final SubLString $str195$Terms;
    private static final SubLString $str196$Predicates;
    private static final SubLString $str197$Microtheories;
    private static final SubLString $str198$_a;
    private static final SubLString $str199$_;
    private static final SubLSymbol $sym200$HB_HANDLE_COMPLEX_CHOOSE_CONSTANTS;
    private static final SubLSymbol $sym201$HB_SELECT_NODE;
    private static final SubLSymbol $sym202$RELEVANT_MT_IS_EQ;
    private static final SubLObject $const203$comment;
    private static final SubLSymbol $sym204$NAME_OF_CAR;
    private static final SubLSymbol $kw205$HB_SELECT_NODE_TEXT;
    private static final SubLSymbol $kw206$HB_SELECT_NODE_IMAGE;
    private static final SubLSymbol $sym207$CB_CF;
    private static final SubLSymbol $kw208$ISA;
    private static final SubLSymbol $sym209$MIN_ISA;
    private static final SubLSymbol $kw210$GENLS;
    private static final SubLSymbol $sym211$MIN_GENLS;
    private static final SubLSymbol $kw212$ALL_ISA;
    private static final SubLSymbol $sym213$ALL_ISA;
    private static final SubLSymbol $kw214$ALL_GENLS;
    private static final SubLSymbol $sym215$ALL_GENLS;
    private static final SubLSymbol $sym216$LIST;
    private static final SubLObject $const217$isa;
    private static final SubLString $str218$__;
    private static final SubLObject $const219$Collection;
    private static final SubLObject $const220$genls;
    private static final SubLString $str221$Context__;
    private static final SubLString $str222$Union_of_all_contexts;
    private static final SubLString $str223$_and_its_;
    private static final SubLObject $const224$genlMt;
    private static final SubLString $str225$s;
    private static final SubLString $str226$Unknown_;
    private static final SubLString $str227$Predicate__;
    private static final SubLString $str228$Index__;
    private static final SubLInteger $int229$100;
    private static final SubLString $str230$__________;
    private static final SubLSymbol $kw231$HB_PRINT_NODES;
    private static final SubLString $str232$hb_print_nodes_html;
    private static final SubLString $str233$Hierarchical_Display___a;
    private static final SubLSymbol $sym234$HIERARCHY_DEFAULT;
    private static final SubLString $str235$hb_parameters;
    private static final SubLString $str236$Change_Hierarchy_Browser_Settings;
    private static final SubLString $str237$_a_is_not_a_valid_constant_;
    private static final SubLSymbol $sym238$HB_PRINT_NODES;
    private static final SubLSymbol $kw239$SUPERIOR;
    private static final SubLSymbol $kw240$INFERIOR;
    private static final SubLString $str241$__;
    private static final SubLString $str242$_;
    private static final SubLString $str243$_;
    private static final SubLString $str244$_____;
    private static final SubLString $str245$__;
    private static final SubLString $str246$_Unknown__;
    private static final SubLSymbol $sym247$STRING_;
    private static final SubLString $str248$No_superior_terms;
    private static final SubLString $str249$__not_an_indexed_term_;
    private static final SubLString $str250$No_inferior_terms;
    private static final SubLString $str251$Go_to_Top;
    private static final SubLString $str252$____;
    private static final SubLString $str253$____Level_finished___s;
    private static final SubLString $str254$__;
    private static final SubLString $str255$_______Total_count___s;
    private static final SubLString $str256$Computed_max_depth___s;
    private static final SubLSymbol $sym257$HB_START;
    private static final SubLString $str258$Hier;
    private static final SubLSymbol $kw259$MAIN;
    private static final SubLString $str260$hb_start;
    private static final SubLSymbol $kw261$HIERARCHY_BROWSER;
    private static final SubLSymbol $sym262$CB_LINK_HIERARCHY_BROWSER;
    private static final SubLString $str263$Hierarchy_Browser;
    private static final SubLString $str264$The_Hierarchy_Browser;
    private static final SubLList $list265;
    private static final SubLString $str266$Could_not_determine_a_term_from__;
    private static final SubLSymbol $sym267$CB_HIER_DEFAULT;
    private static final SubLList $list268;
    private static final SubLString $str269$Could_not_determine_an_arg_from__;
    private static final SubLSymbol $sym270$CB_HIER;
    private static final SubLSymbol $sym271$SECOND;
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4009L)
    public static SubLObject hb_default_method_info(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject info = (SubLObject)hierarchy_browser.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(hierarchy_browser.$const59$EverythingPSC, thread);
            final SubLObject isas = isa.all_isa(fort, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            if (hierarchy_browser.NIL == info) {
                SubLObject csome_list_var;
                SubLObject v_isa;
                for (csome_list_var = isas, v_isa = (SubLObject)hierarchy_browser.NIL, v_isa = csome_list_var.first(); hierarchy_browser.NIL == info && hierarchy_browser.NIL != csome_list_var; info = conses_high.assoc(v_isa, hierarchy_browser.$hb_type_default_forms$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED), csome_list_var = csome_list_var.rest(), v_isa = csome_list_var.first()) {}
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4221L)
    public static SubLObject hb_default_method_availableP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hierarchy_browser.NIL != forts.fort_p(v_object) && hierarchy_browser.NIL != list_utilities.sublisp_boolean(hb_default_method_info(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4356L)
    public static SubLObject set_default_hb_icon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hierarchy_browser.NIL == hierarchy_browser.$hb_icon$.getDynamicValue(thread)) {
            hierarchy_browser.$hb_icon$.setDynamicValue((SubLObject)hierarchy_browser.$kw60$RED_DIAMOND, thread);
        }
        return hierarchy_browser.$hb_icon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4472L)
    public static SubLObject hb_debug() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        hierarchy_browser.$hb_debug$.setDynamicValue((SubLObject)hierarchy_browser.T, thread);
        return hierarchy_browser.$hb_debug$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4544L)
    public static SubLObject hb_no_debug() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        hierarchy_browser.$hb_debug$.setDynamicValue((SubLObject)hierarchy_browser.NIL, thread);
        return hierarchy_browser.$hb_debug$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4621L)
    public static SubLObject hb_message(SubLObject top_spaces, SubLObject bottom_spaces, SubLObject string) {
        if (top_spaces == hierarchy_browser.UNPROVIDED) {
            top_spaces = (SubLObject)hierarchy_browser.NIL;
        }
        if (bottom_spaces == hierarchy_browser.UNPROVIDED) {
            bottom_spaces = (SubLObject)hierarchy_browser.NIL;
        }
        if (string == hierarchy_browser.UNPROVIDED) {
            string = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = (SubLObject)((hierarchy_browser.NIL != string_utilities.non_empty_stringP(string)) ? string : ((hierarchy_browser.NIL != string_utilities.non_empty_stringP(hierarchy_browser.$hb_message$.getDynamicValue(thread))) ? hierarchy_browser.$hb_message$.getDynamicValue(thread) : hierarchy_browser.$str61$));
        final SubLObject color = hierarchy_browser.$hb_message_color$.getDynamicValue(thread);
        if (hierarchy_browser.NIL != string_utilities.non_empty_stringP(message)) {
            if (top_spaces.isInteger()) {
                SubLObject i;
                for (i = (SubLObject)hierarchy_browser.NIL, i = (SubLObject)hierarchy_browser.ZERO_INTEGER; i.numL(top_spaces); i = Numbers.add(i, (SubLObject)hierarchy_browser.ONE_INTEGER)) {
                    html_utilities.html_br();
                }
            }
            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            final SubLObject color_val = color;
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (hierarchy_browser.NIL != color_val) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), message);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
            if (bottom_spaces.isInteger()) {
                SubLObject i;
                for (i = (SubLObject)hierarchy_browser.NIL, i = (SubLObject)hierarchy_browser.ZERO_INTEGER; i.numL(bottom_spaces); i = Numbers.add(i, (SubLObject)hierarchy_browser.ONE_INTEGER)) {
                    html_utilities.html_br();
                }
            }
            hierarchy_browser.$hb_message$.setDynamicValue((SubLObject)hierarchy_browser.NIL, thread);
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 5215L)
    public static SubLObject hb_show_parameters(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_hr((SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)hierarchy_browser.$str62$Starting_Term);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)hierarchy_browser.$str63$Current_Term__);
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)hierarchy_browser.$str64$_2);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
            if (hierarchy_browser.NIL != forts.fort_p(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread))) {
                cb_utilities.cb_form(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            else {
                html_utilities.html_princ((SubLObject)hierarchy_browser.$str65$None);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_utilities.html_hidden_input((SubLObject)hierarchy_browser.$str66$cur_term, cb_utilities.cb_fort_identifier(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread)), (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_indent((SubLObject)hierarchy_browser.FIVE_INTEGER);
        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)hierarchy_browser.$str67$Change_Term__);
        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        if (hierarchy_browser.NIL != html_complete.$cb_enable_constant_completion$.getDynamicValue(thread)) {
            html_complete.html_complete_button((SubLObject)hierarchy_browser.$str68$new_term, (SubLObject)hierarchy_browser.$str69$Complete, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_indent((SubLObject)hierarchy_browser.UNPROVIDED);
        }
        html_utilities.html_text_input((SubLObject)hierarchy_browser.$str68$new_term, (SubLObject)hierarchy_browser.$str61$, (SubLObject)hierarchy_browser.$int70$25);
        html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_checkbox_input((SubLObject)hierarchy_browser.$str71$defaults_for_type, (SubLObject)hierarchy_browser.$str71$defaults_for_type, hierarchy_browser.$hb_use_defaults_for_type$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_princ((SubLObject)hierarchy_browser.$str72$_Use_default_settings_for_term);
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        html_utilities.html_hr((SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_caption_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_caption_align$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$kw73$TOP));
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)hierarchy_browser.$str74$Specify_Non_Default_Settings);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_caption_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str76$top));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str77$Binary_Predicate);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_complete.html_complete_button((SubLObject)hierarchy_browser.$str78$pred, (SubLObject)hierarchy_browser.$str69$Complete, hierarchy_browser.$const79$BinaryPredicate, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_text_input((SubLObject)hierarchy_browser.$str78$pred, misc_kb_utilities.coerce_name(hierarchy_browser.$hb_predicate$.getDynamicValue(thread)), (SubLObject)hierarchy_browser.$int70$25);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str80$Index_Argument);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_radio_input((SubLObject)hierarchy_browser.$str81$index, (SubLObject)hierarchy_browser.ONE_INTEGER, Equality.equal(hierarchy_browser.$hb_index_argument$.getDynamicValue(thread), (SubLObject)hierarchy_browser.ONE_INTEGER), (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str82$_1);
                    html_utilities.html_indent((SubLObject)hierarchy_browser.THREE_INTEGER);
                    html_utilities.html_radio_input((SubLObject)hierarchy_browser.$str81$index, (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeBoolean(!hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).equal((SubLObject)hierarchy_browser.ONE_INTEGER)), (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str83$_2);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_indent((SubLObject)hierarchy_browser.FIVE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str76$top));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str84$Microtheory);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_complete.html_complete_button((SubLObject)hierarchy_browser.$str85$mt, (SubLObject)hierarchy_browser.$str69$Complete, hierarchy_browser.$const86$Microtheory, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_indent((SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_text_input((SubLObject)hierarchy_browser.$str85$mt, misc_kb_utilities.coerce_name(hierarchy_browser.$hb_mt$.getDynamicValue(thread)), (SubLObject)hierarchy_browser.$int70$25);
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_checkbox_input((SubLObject)hierarchy_browser.$str87$genl_mts, (SubLObject)hierarchy_browser.$str87$genl_mts, hierarchy_browser.$hb_use_genl_mts$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)hierarchy_browser.$str88$_Use_its_genl_mts_too__if_possibl);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_checkbox_input((SubLObject)hierarchy_browser.$str89$all_mts, (SubLObject)hierarchy_browser.$str89$all_mts, Equality.eq(hierarchy_browser.$hb_mt$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$kw45$ALL), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)hierarchy_browser.$str90$_Use_all_mts);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str76$top));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str91$Height_and_Depth);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_princ((SubLObject)hierarchy_browser.$str93$Max_height__);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str94$height);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        SubLObject current = hierarchy_browser.$hb_max_height$.getDynamicValue(thread);
                                        if (hierarchy_browser.NIL == current) {
                                            current = (SubLObject)hierarchy_browser.$sym95$ALL;
                                        }
                                        else if (current.equal((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
                                            current = (SubLObject)hierarchy_browser.$sym96$NONE;
                                        }
                                        SubLObject cdolist_list_var = (SubLObject)hierarchy_browser.$list97;
                                        SubLObject i = (SubLObject)hierarchy_browser.NIL;
                                        i = cdolist_list_var.first();
                                        while (hierarchy_browser.NIL != cdolist_list_var) {
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                                                if (i.equal(current)) {
                                                    html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                                    html_utilities.html_princ(i);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            cdolist_list_var = cdolist_list_var.rest();
                                            i = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_princ((SubLObject)hierarchy_browser.$str98$Max_depth__);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                                    html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str99$depth);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        SubLObject current = hierarchy_browser.$hb_max_depth$.getDynamicValue(thread);
                                        if (hierarchy_browser.NIL == current) {
                                            current = (SubLObject)hierarchy_browser.$sym95$ALL;
                                        }
                                        else if (current.equal((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
                                            current = (SubLObject)hierarchy_browser.$sym96$NONE;
                                        }
                                        SubLObject cdolist_list_var = (SubLObject)hierarchy_browser.$list97;
                                        SubLObject i = (SubLObject)hierarchy_browser.NIL;
                                        i = cdolist_list_var.first();
                                        while (hierarchy_browser.NIL != cdolist_list_var) {
                                            html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                                                if (i.equal(current)) {
                                                    html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                                }
                                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                                    html_utilities.html_princ(i);
                                                }
                                                finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                                }
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                            cdolist_list_var = cdolist_list_var.rest();
                                            i = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str100$Max_inferior_terms__);
                    html_utilities.html_text_input((SubLObject)hierarchy_browser.$str101$inferior, hierarchy_browser.$hb_max_inferiors$.getDynamicValue(thread), (SubLObject)hierarchy_browser.FOUR_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_indent((SubLObject)hierarchy_browser.FIVE_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str76$top));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str102$Extras);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_checkbox_input((SubLObject)hierarchy_browser.$str103$lex, (SubLObject)hierarchy_browser.$str103$lex, hierarchy_browser.$hb_use_lexicon$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)hierarchy_browser.$str104$_Use_lexicon_entries__if_possible);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_checkbox_input((SubLObject)hierarchy_browser.$str105$comments, (SubLObject)hierarchy_browser.$str105$comments, hierarchy_browser.$hb_show_comments$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)hierarchy_browser.$str106$_Show_comments_for_terms);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_checkbox_input((SubLObject)hierarchy_browser.$str107$mts_after, (SubLObject)hierarchy_browser.$str107$mts_after, hierarchy_browser.$hb_show_mts$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)hierarchy_browser.$str108$_Show_assertion_s_mts_after_terms);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_princ((SubLObject)hierarchy_browser.$str109$Indent_quantum__);
                                html_utilities.html_text_input((SubLObject)hierarchy_browser.$str110$quantum, hierarchy_browser.$hb_indent_quantum$.getDynamicValue(thread), (SubLObject)hierarchy_browser.THREE_INTEGER);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                cyc_navigator_internals.nav_link((SubLObject)hierarchy_browser.$kw111$HB_COLORS_AND_SYMBOLS, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
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
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 9942L)
    public static SubLObject hb_show_colors_and_symbols(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str112$bg_color);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            SubLObject cdolist_list_var = apps_shared.$app_color_name_map$.getDynamicValue(thread);
                            SubLObject pair = (SubLObject)hierarchy_browser.NIL;
                            pair = cdolist_list_var.first();
                            while (hierarchy_browser.NIL != cdolist_list_var) {
                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                                    if (pair.first().eql(hierarchy_browser.$hb_background_color$.getDynamicValue(thread))) {
                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_princ(pair.rest());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                pair = cdolist_list_var.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str113$__);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str114$The_background_color_for_Hierarch);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str115$msg_color);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            SubLObject cdolist_list_var = apps_shared.$app_color_name_map$.getDynamicValue(thread);
                            SubLObject pair = (SubLObject)hierarchy_browser.NIL;
                            pair = cdolist_list_var.first();
                            while (hierarchy_browser.NIL != cdolist_list_var) {
                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                                    if (pair.first().eql(hierarchy_browser.$hb_message_color$.getDynamicValue(thread))) {
                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_princ(pair.rest());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                pair = cdolist_list_var.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str113$__);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str116$The_color_for_Hierarchy_Browser_a);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                    final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                        html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str117$hb_icon);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                            SubLObject cdolist_list_var = hierarchy_browser.$hb_icon_choices$.getDynamicValue(thread);
                            SubLObject item = (SubLObject)hierarchy_browser.NIL;
                            item = cdolist_list_var.first();
                            while (hierarchy_browser.NIL != cdolist_list_var) {
                                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                                final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.NIL, thread);
                                    if (item.equal(hierarchy_browser.$hb_icon$.getDynamicValue(thread))) {
                                        html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_princ(item);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                                    }
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                                cdolist_list_var = cdolist_list_var.rest();
                                item = cdolist_list_var.first();
                            }
                            html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str113$__);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str118$The_hierarchical_display_link_ico);
                    if (hierarchy_browser.$hb_icon$.getDynamicValue(thread).equalp((SubLObject)hierarchy_browser.$str4$_)) {
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str4$_);
                    }
                    else {
                        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(hierarchy_browser.$hb_icon$.getDynamicValue(thread));
                        final SubLObject align = (SubLObject)hierarchy_browser.$kw73$TOP;
                        final SubLObject alt = (SubLObject)hierarchy_browser.$str4$_;
                        final SubLObject border = (SubLObject)hierarchy_browser.ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(image_src);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        if (hierarchy_browser.NIL != alt) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(alt);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        if (hierarchy_browser.NIL != align) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        if (hierarchy_browser.NIL != border) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(border);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_checkbox_input((SubLObject)hierarchy_browser.$str119$hb_bar, (SubLObject)hierarchy_browser.$str119$hb_bar, hierarchy_browser.$hb_bar$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str120$___);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str121$Use_decorative_separator_bar);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_text_input((SubLObject)hierarchy_browser.$str122$hb_top_sign, hierarchy_browser.$hb_top_sign$.getDynamicValue(thread), (SubLObject)hierarchy_browser.FOUR_INTEGER);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str123$__term_);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str120$___);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str124$Indicates_that__term__has_no_supe);
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
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str125$_term__);
                    html_utilities.html_text_input((SubLObject)hierarchy_browser.$str126$hb_bottom_sign, hierarchy_browser.$hb_bottom_sign$.getDynamicValue(thread), (SubLObject)hierarchy_browser.FOUR_INTEGER);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str120$___);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str127$Indicates_that__term__has_no_infe);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_text_input((SubLObject)hierarchy_browser.$str128$superiors_sign, hierarchy_browser.$hb_more_superiors_sign$.getDynamicValue(thread), (SubLObject)hierarchy_browser.FOUR_INTEGER);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str123$__term_);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str120$___);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str129$Indicates_that__term__has_more_un);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str125$_term__);
                    html_utilities.html_text_input((SubLObject)hierarchy_browser.$str130$inferiors_sign, hierarchy_browser.$hb_more_inferiors_sign$.getDynamicValue(thread), (SubLObject)hierarchy_browser.FOUR_INTEGER);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str120$___);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str131$Indicates_that__term__has_more_un);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str125$_term__);
                    html_utilities.html_text_input((SubLObject)hierarchy_browser.$str132$cycle_sign, hierarchy_browser.$hb_cycle_sign$.getDynamicValue(thread), (SubLObject)hierarchy_browser.TWELVE_INTEGER);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str120$___);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str133$Indicates_that_a_sequence_of_term);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 13290L)
    public static SubLObject sorted_gaf_mts(final SubLObject gaf, SubLObject test, SubLObject key) {
        if (test == hierarchy_browser.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP);
        }
        if (key == hierarchy_browser.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)hierarchy_browser.$sym135$COERCE_NAME);
        }
        final SubLObject mts = kb_indexing.gaf_mts(gaf);
        final SubLObject sorted_mts = Sort.sort(mts, test, key);
        return sorted_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 13519L)
    public static SubLObject hb_parameters(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color = hierarchy_browser.$hb_background_color$.getDynamicValue(thread);
        html_utilities.html_markup((SubLObject)hierarchy_browser.$str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (hierarchy_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)hierarchy_browser.$str139$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == hierarchy_browser.$kw140$UNINITIALIZED) ? ConsesLow.list(hierarchy_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)hierarchy_browser.$kw141$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)hierarchy_browser.$str142$Cyc_Hierarchy_Browser);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$81 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (hierarchy_browser.NIL != color) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str142$Cyc_Hierarchy_Browser);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    hb_message((SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)hierarchy_browser.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)hierarchy_browser.$str143$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    if (hierarchy_browser.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)hierarchy_browser.$str144$hb_handle_parameters, (SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        cb_utilities.cb_help_preamble((SubLObject)hierarchy_browser.$kw136$HB_PARAMETERS, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_reset_input((SubLObject)hierarchy_browser.$str145$Current_Settings);
                        html_utilities.html_indent((SubLObject)hierarchy_browser.TWO_INTEGER);
                        html_utilities.html_submit_input((SubLObject)hierarchy_browser.$str146$Display_Hierarchy, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_br();
                        hb_show_parameters((SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$81, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 14182L)
    public static SubLObject hb_colors_and_symbols(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color = hierarchy_browser.$hb_background_color$.getDynamicValue(thread);
        html_utilities.html_markup((SubLObject)hierarchy_browser.$str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (hierarchy_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)hierarchy_browser.$str139$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == hierarchy_browser.$kw140$UNINITIALIZED) ? ConsesLow.list(hierarchy_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)hierarchy_browser.$kw141$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)hierarchy_browser.$str149$HB_Colors_and_Symbols);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_complete.html_complete_script();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$84 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (hierarchy_browser.NIL != color) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str150$Hierarchy_Browser_Colors_and_Symb);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    hb_message((SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)hierarchy_browser.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)hierarchy_browser.$str143$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    if (hierarchy_browser.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)hierarchy_browser.$str151$hb_handle_colors_and_symbols, (SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        cb_utilities.cb_back_button((SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)hierarchy_browser.TWO_INTEGER);
                        html_utilities.html_reset_input((SubLObject)hierarchy_browser.$str145$Current_Settings);
                        html_utilities.html_indent((SubLObject)hierarchy_browser.TWO_INTEGER);
                        html_utilities.html_submit_input((SubLObject)hierarchy_browser.$str152$Update, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_br();
                        hb_show_colors_and_symbols((SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$84, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 14942L)
    public static SubLObject hb_binary_predicateP(final SubLObject fort) {
        return isa.isa_in_any_mtP(fort, hierarchy_browser.$const79$BinaryPredicate);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 15036L)
    public static SubLObject hb_handle_parameters(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = (SubLObject)hierarchy_browser.NIL;
        final SubLObject cur_term = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str66$cur_term, args);
        final SubLObject new_term = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str68$new_term, args);
        final SubLObject pos_term = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str154$term, args);
        SubLObject defaults = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str71$defaults_for_type, args);
        SubLObject mt = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str85$mt, args);
        SubLObject v_genl_mts = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str87$genl_mts, args);
        SubLObject all_mts = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str89$all_mts, args);
        SubLObject pred = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str78$pred, args);
        SubLObject index = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str81$index, args);
        SubLObject lex = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str103$lex, args);
        SubLObject comments = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str105$comments, args);
        SubLObject mts_after = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str107$mts_after, args);
        SubLObject height = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str94$height, args);
        SubLObject depth = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str99$depth, args);
        SubLObject inferior = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str101$inferior, args);
        SubLObject quantum = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str110$quantum, args);
        final SubLObject strings = string_utilities.break_words(numeric_date_utilities.timestring((SubLObject)hierarchy_browser.UNPROVIDED), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym155$VALID_TIMESTRING_CHAR_), (SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject time = conses_high.second(strings);
        final SubLObject date = strings.first();
        if (hierarchy_browser.NIL != string_utilities.non_empty_stringP(new_term)) {
            v_term = cb_frames.terms_for_browsing(new_term, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            if (v_term.isCons()) {
                v_term = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)hierarchy_browser.$sym156$VALID_FORT_), v_term, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            if (v_term.isCons() && Sequences.length(v_term).numE((SubLObject)hierarchy_browser.ONE_INTEGER)) {
                v_term = v_term.first();
            }
        }
        else if (hierarchy_browser.NIL != cur_term) {
            v_term = cb_utilities.cb_guess_fort(cur_term, (SubLObject)hierarchy_browser.UNPROVIDED);
        }
        else {
            v_term = cb_frames.terms_for_browsing(pos_term, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        }
        defaults = Equality.equalp(defaults, (SubLObject)hierarchy_browser.$str71$defaults_for_type);
        if (hierarchy_browser.NIL != string_utilities.non_empty_stringP(mt)) {
            if (hierarchy_browser.NIL != Sequences.find(mt, (SubLObject)hierarchy_browser.$list157, Symbols.symbol_function((SubLObject)hierarchy_browser.EQUALP), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED)) {
                mt = (SubLObject)hierarchy_browser.$kw45$ALL;
            }
            else {
                mt = cb_frames.terms_for_browsing(mt, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            if (mt.isCons()) {
                mt = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)hierarchy_browser.$sym158$MT_), mt, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            if (mt.isCons() && Sequences.length(mt).numE((SubLObject)hierarchy_browser.ONE_INTEGER)) {
                mt = mt.first();
            }
        }
        v_genl_mts = Equality.equalp(v_genl_mts, (SubLObject)hierarchy_browser.$str87$genl_mts);
        all_mts = (SubLObject)SubLObjectFactory.makeBoolean(all_mts.equalp((SubLObject)hierarchy_browser.$str89$all_mts) || mt == hierarchy_browser.$kw45$ALL);
        if (hierarchy_browser.NIL != string_utilities.non_empty_stringP(pred)) {
            pred = cb_frames.terms_for_browsing(pred, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            if (pred.isCons()) {
                pred = list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)hierarchy_browser.$sym159$HB_BINARY_PREDICATE_), pred, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            if (pred.isCons() && Sequences.length(pred).numE((SubLObject)hierarchy_browser.ONE_INTEGER)) {
                pred = pred.first();
            }
        }
        index = (SubLObject)(index.equalp((SubLObject)hierarchy_browser.$str160$2) ? hierarchy_browser.TWO_INTEGER : hierarchy_browser.ONE_INTEGER);
        lex = Equality.equalp(lex, (SubLObject)hierarchy_browser.$str103$lex);
        comments = Equality.equalp(comments, (SubLObject)hierarchy_browser.$str105$comments);
        mts_after = Equality.equalp(mts_after, (SubLObject)hierarchy_browser.$str107$mts_after);
        height = reader.read_from_string_ignoring_errors(height, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        if (!height.isInteger()) {
            if (height.equal((SubLObject)hierarchy_browser.$sym96$NONE)) {
                height = (SubLObject)hierarchy_browser.ZERO_INTEGER;
            }
            else if (height.equal((SubLObject)hierarchy_browser.$sym95$ALL)) {
                height = (SubLObject)hierarchy_browser.NIL;
            }
            else {
                height = (SubLObject)hierarchy_browser.FOUR_INTEGER;
            }
        }
        depth = reader.read_from_string_ignoring_errors(depth, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        if (!depth.isInteger()) {
            if (depth.equal((SubLObject)hierarchy_browser.$sym96$NONE)) {
                depth = (SubLObject)hierarchy_browser.ZERO_INTEGER;
            }
            else if (depth.equal((SubLObject)hierarchy_browser.$sym95$ALL)) {
                depth = (SubLObject)hierarchy_browser.NIL;
            }
            else {
                depth = (SubLObject)hierarchy_browser.FOUR_INTEGER;
            }
        }
        if (hierarchy_browser.NIL != string_utilities.non_empty_stringP(inferior)) {
            inferior = reader.read_from_string_ignoring_errors(inferior, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        }
        if (!inferior.isInteger() || !inferior.numGE((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
            inferior = (SubLObject)hierarchy_browser.$str61$;
        }
        if (hierarchy_browser.NIL != string_utilities.non_empty_stringP(quantum)) {
            quantum = reader.read_from_string_ignoring_errors(quantum, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        }
        if (!quantum.isInteger() || !quantum.numGE((SubLObject)hierarchy_browser.ZERO_INTEGER) || !quantum.numLE((SubLObject)hierarchy_browser.$int161$50)) {
            quantum = (SubLObject)hierarchy_browser.FOUR_INTEGER;
        }
        hierarchy_browser.$hb_use_defaults_for_type$.setDynamicValue(defaults, thread);
        hierarchy_browser.$hb_use_genl_mts$.setDynamicValue(v_genl_mts, thread);
        hierarchy_browser.$hb_index_argument$.setDynamicValue(index, thread);
        hierarchy_browser.$hb_gather_argument$.setDynamicValue((SubLObject)(hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).numE((SubLObject)hierarchy_browser.ONE_INTEGER) ? hierarchy_browser.TWO_INTEGER : hierarchy_browser.ONE_INTEGER), thread);
        hierarchy_browser.$hb_use_lexicon$.setDynamicValue(lex, thread);
        hierarchy_browser.$hb_show_comments$.setDynamicValue(comments, thread);
        hierarchy_browser.$hb_show_mts$.setDynamicValue(mts_after, thread);
        hierarchy_browser.$hb_max_height$.setDynamicValue(height, thread);
        hierarchy_browser.$hb_max_depth$.setDynamicValue(depth, thread);
        hierarchy_browser.$hb_max_inferiors$.setDynamicValue(inferior, thread);
        hierarchy_browser.$hb_indent_quantum$.setDynamicValue(quantum, thread);
        SubLObject successes = (SubLObject)hierarchy_browser.NIL;
        SubLObject failures = (SubLObject)hierarchy_browser.NIL;
        if (hierarchy_browser.NIL != forts.valid_fortP(v_term)) {
            hierarchy_browser.$hb_pivot_term$.setDynamicValue(v_term, thread);
            if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_defaults_for_type$.getDynamicValue(thread)) {
                hb_set_defaults_for_type(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread));
                return hb_print_nodes((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            successes = (SubLObject)ConsesLow.cons((SubLObject)hierarchy_browser.$kw162$TERM, successes);
        }
        if (hierarchy_browser.NIL != forts.valid_fortP(pred) && hierarchy_browser.NIL != isa.isa_in_any_mtP(pred, hierarchy_browser.$const163$Predicate)) {
            hierarchy_browser.$hb_predicate$.setDynamicValue(pred, thread);
            successes = (SubLObject)ConsesLow.cons((SubLObject)hierarchy_browser.$kw164$PRED, successes);
        }
        if (hierarchy_browser.NIL != all_mts || (hierarchy_browser.NIL != forts.valid_fortP(mt) && hierarchy_browser.NIL != isa.isa_in_any_mtP(mt, hierarchy_browser.$const86$Microtheory))) {
            hierarchy_browser.$hb_mt$.setDynamicValue((SubLObject)((hierarchy_browser.NIL != all_mts) ? hierarchy_browser.$kw45$ALL : mt), thread);
            successes = (SubLObject)ConsesLow.cons((SubLObject)hierarchy_browser.$kw165$MT, successes);
        }
        if (hierarchy_browser.NIL == Sequences.find((SubLObject)hierarchy_browser.$kw162$TERM, successes, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED)) {
            if (!v_term.isCons()) {
                hierarchy_browser.$hb_message$.setDynamicValue(PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str166$The_input__s_did_not_yield_a_vali, html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str68$new_term, args)), thread);
                return hb_parameters((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            failures = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)hierarchy_browser.$kw162$TERM, v_term), failures);
        }
        if (hierarchy_browser.NIL == Sequences.find((SubLObject)hierarchy_browser.$kw164$PRED, successes, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED)) {
            if (!pred.isCons()) {
                hierarchy_browser.$hb_message$.setDynamicValue(PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str167$The_input__s_did_not_yield_a_vali, html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str78$pred, args)), thread);
                return hb_parameters((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            failures = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)hierarchy_browser.$kw164$PRED, pred), failures);
        }
        if (hierarchy_browser.NIL == Sequences.find((SubLObject)hierarchy_browser.$kw165$MT, successes, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED)) {
            if (!mt.isCons()) {
                hierarchy_browser.$hb_message$.setDynamicValue(PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str168$The_input__s_did_not_yield_a_vali, html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str85$mt, args)), thread);
                return hb_parameters((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            failures = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)hierarchy_browser.$kw165$MT, mt), failures);
        }
        if (hierarchy_browser.NIL != failures) {
            return hb_choose_constants(failures);
        }
        if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_defaults_for_type$.getDynamicValue(thread)) {
            hb_set_defaults_for_type(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread));
        }
        hierarchy_browser.$hb_message$.setDynamicValue(PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str169$Parameters_updated_at__a_on__a, time, date), thread);
        return hb_print_nodes((SubLObject)hierarchy_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 20617L)
    public static SubLObject hb_handle_colors_and_symbols(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bg_color = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str112$bg_color, args);
        SubLObject msg_color = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str115$msg_color, args);
        SubLObject icon = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str117$hb_icon, args);
        SubLObject bar = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str119$hb_bar, args);
        SubLObject top_sign = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str122$hb_top_sign, args);
        SubLObject bottom_sign = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str126$hb_bottom_sign, args);
        SubLObject sup_sign = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str128$superiors_sign, args);
        SubLObject inf_sign = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str130$inferiors_sign, args);
        SubLObject cycle = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str132$cycle_sign, args);
        final SubLObject strings = string_utilities.break_words(numeric_date_utilities.timestring((SubLObject)hierarchy_browser.UNPROVIDED), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym155$VALID_TIMESTRING_CHAR_), (SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject time = conses_high.second(strings);
        final SubLObject date = strings.first();
        if (hierarchy_browser.NIL != string_utilities.non_empty_stringP(bg_color)) {
            bg_color = conses_high.rassoc(bg_color, apps_shared.$app_color_name_map$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)hierarchy_browser.EQUALP), (SubLObject)hierarchy_browser.UNPROVIDED).first();
        }
        else {
            bg_color = (SubLObject)hierarchy_browser.$kw171$DEFAULT;
        }
        if (hierarchy_browser.NIL != string_utilities.non_empty_stringP(msg_color)) {
            msg_color = conses_high.rassoc(msg_color, apps_shared.$app_color_name_map$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)hierarchy_browser.EQUALP), (SubLObject)hierarchy_browser.UNPROVIDED).first();
        }
        else {
            msg_color = (SubLObject)hierarchy_browser.$kw172$BLACK;
        }
        if (hierarchy_browser.NIL != string_utilities.non_empty_stringP(icon)) {
            icon = string_utilities.keyword_from_string(icon);
        }
        else {
            icon = (SubLObject)hierarchy_browser.$str4$_;
        }
        if (hierarchy_browser.NIL == string_utilities.non_empty_stringP(bar)) {
            bar = (SubLObject)hierarchy_browser.NIL;
        }
        if (hierarchy_browser.NIL == string_utilities.non_empty_stringP(top_sign)) {
            top_sign = (SubLObject)hierarchy_browser.$str61$;
        }
        if (hierarchy_browser.NIL == string_utilities.non_empty_stringP(bottom_sign)) {
            bottom_sign = (SubLObject)hierarchy_browser.$str61$;
        }
        if (hierarchy_browser.NIL == string_utilities.non_empty_stringP(sup_sign)) {
            sup_sign = (SubLObject)hierarchy_browser.$str61$;
        }
        if (hierarchy_browser.NIL == string_utilities.non_empty_stringP(inf_sign)) {
            inf_sign = (SubLObject)hierarchy_browser.$str61$;
        }
        if (hierarchy_browser.NIL == string_utilities.non_empty_stringP(cycle)) {
            cycle = (SubLObject)hierarchy_browser.$str61$;
        }
        hierarchy_browser.$hb_background_color$.setDynamicValue(bg_color, thread);
        hierarchy_browser.$hb_message_color$.setDynamicValue(msg_color, thread);
        hierarchy_browser.$hb_icon$.setDynamicValue((SubLObject)((hierarchy_browser.NIL != conses_high.member(icon, hierarchy_browser.$hb_icon_choices$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED)) ? icon : hierarchy_browser.$str4$_), thread);
        hierarchy_browser.$hb_bar$.setDynamicValue((SubLObject)((hierarchy_browser.NIL != bar && hierarchy_browser.$hb_bar_choice$.getDynamicValue(thread).isKeyword()) ? hierarchy_browser.$hb_bar_choice$.getDynamicValue(thread) : hierarchy_browser.NIL), thread);
        hierarchy_browser.$hb_top_sign$.setDynamicValue(top_sign, thread);
        hierarchy_browser.$hb_bottom_sign$.setDynamicValue(bottom_sign, thread);
        hierarchy_browser.$hb_more_superiors_sign$.setDynamicValue(sup_sign, thread);
        hierarchy_browser.$hb_more_inferiors_sign$.setDynamicValue(inf_sign, thread);
        hierarchy_browser.$hb_cycle_sign$.setDynamicValue(cycle, thread);
        hierarchy_browser.$hb_message$.setDynamicValue(PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str173$Colors_and_symbols_updated_at__a_, time, date), thread);
        return hb_parameters((SubLObject)hierarchy_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 22874L)
    public static SubLObject hb_set_defaults_for_type(final SubLObject fort) {
        if (hierarchy_browser.NIL != kb_indexing_datastructures.indexed_term_p(fort)) {
            final SubLObject default_method_info = hb_default_method_info(fort);
            if (hierarchy_browser.NIL == default_method_info) {
                hierarchy_browser.$hb_message$.setDynamicValue(PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str177$No_default_display_parameters_are, hb_string_for_constant(fort)));
                return hb_parameters((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            SubLObject current;
            final SubLObject datum = current = default_method_info;
            SubLObject type = (SubLObject)hierarchy_browser.NIL;
            SubLObject predicate = (SubLObject)hierarchy_browser.NIL;
            SubLObject index = (SubLObject)hierarchy_browser.NIL;
            SubLObject gather = (SubLObject)hierarchy_browser.NIL;
            SubLObject height = (SubLObject)hierarchy_browser.NIL;
            SubLObject depth = (SubLObject)hierarchy_browser.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hierarchy_browser.$list175);
            type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hierarchy_browser.$list175);
            predicate = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hierarchy_browser.$list175);
            index = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hierarchy_browser.$list175);
            gather = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hierarchy_browser.$list175);
            height = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hierarchy_browser.$list175);
            depth = current.first();
            current = current.rest();
            if (hierarchy_browser.NIL == current) {
                hierarchy_browser.$hb_pivot_term$.setDynamicValue(fort);
                hierarchy_browser.$hb_predicate$.setDynamicValue(predicate);
                hierarchy_browser.$hb_mt$.setDynamicValue((SubLObject)hierarchy_browser.$kw45$ALL);
                hierarchy_browser.$hb_index_argument$.setDynamicValue(index);
                hierarchy_browser.$hb_gather_argument$.setDynamicValue(gather);
                hierarchy_browser.$hb_max_height$.setDynamicValue(height);
                hierarchy_browser.$hb_max_depth$.setDynamicValue(depth);
                hierarchy_browser.$hb_message$.setDynamicValue(PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str176$Using_default_settings_for_instan, hb_string_for_constant(type)));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hierarchy_browser.$list175);
            }
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 23732L)
    public static SubLObject hb_simple_choose_constants(final SubLObject failures) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color = hierarchy_browser.$hb_background_color$.getDynamicValue(thread);
        final SubLObject form = failures.first();
        final SubLObject key = form.first();
        final SubLObject v_forts = conses_high.second(form);
        final SubLObject sorted_forts = Sort.sort(v_forts, Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym178$HB_STRING_FOR_CONSTANT));
        final SubLObject string = (SubLObject)((key == hierarchy_browser.$kw162$TERM) ? hierarchy_browser.$str154$term : ((key == hierarchy_browser.$kw164$PRED) ? hierarchy_browser.$str179$predicate : hierarchy_browser.$str180$microtheory));
        final SubLObject plural = (SubLObject)(string.equalp((SubLObject)hierarchy_browser.$str180$microtheory) ? hierarchy_browser.$str181$microtheories : PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str182$_as, string));
        html_utilities.html_markup((SubLObject)hierarchy_browser.$str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (hierarchy_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)hierarchy_browser.$str139$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == hierarchy_browser.$kw140$UNINITIALIZED) ? ConsesLow.list(hierarchy_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)hierarchy_browser.$kw141$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)hierarchy_browser.$str183$Choose_Constants__Simple_Version);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$87 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (hierarchy_browser.NIL != color) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$str184$Choose_a__a, Strings.string_capitalize(string, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED));
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_br();
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$str185$Please_choose_one_of_the_followin, plural);
                    html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                    html_utilities.html_br();
                    html_utilities.html_br();
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        SubLObject cdolist_list_var = sorted_forts;
                        SubLObject c = (SubLObject)hierarchy_browser.NIL;
                        c = cdolist_list_var.first();
                        while (hierarchy_browser.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str186$left));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                    cyc_navigator_internals.nav_link((SubLObject)hierarchy_browser.$kw187$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, (SubLObject)ConsesLow.list(cb_utilities.cb_fort_identifier(c), string), (SubLObject)hierarchy_browser.$kw188$SELF, hb_string_for_constant(c), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            c = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$87, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 24881L)
    public static SubLObject hb_handle_simple_choose_constants(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = reader.read_from_string_ignoring_errors(args.first(), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject fort = cb_utilities.cb_guess_fort(id, (SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject string = conses_high.second(args);
        if (string.equalp((SubLObject)hierarchy_browser.$str154$term)) {
            hierarchy_browser.$hb_pivot_term$.setDynamicValue(fort, thread);
        }
        else if (string.equalp((SubLObject)hierarchy_browser.$str179$predicate)) {
            hierarchy_browser.$hb_predicate$.setDynamicValue(fort, thread);
        }
        else if (string.equalp((SubLObject)hierarchy_browser.$str180$microtheory)) {
            hierarchy_browser.$hb_mt$.setDynamicValue(fort, thread);
        }
        if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_defaults_for_type$.getDynamicValue(thread)) {
            hb_set_defaults_for_type(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread));
        }
        return hb_print_nodes((SubLObject)hierarchy_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 25385L)
    public static SubLObject hb_choose_constants(final SubLObject failures) {
        if (Sequences.length(failures).numE((SubLObject)hierarchy_browser.ONE_INTEGER)) {
            return hb_simple_choose_constants(failures);
        }
        return hb_complex_choose_constants(failures);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 25569L)
    public static SubLObject hb_complex_choose_constants(SubLObject failures) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        failures = Sequences.nreverse(failures);
        final SubLObject color = hierarchy_browser.$hb_background_color$.getDynamicValue(thread);
        html_utilities.html_markup((SubLObject)hierarchy_browser.$str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (hierarchy_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)hierarchy_browser.$str139$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == hierarchy_browser.$kw140$UNINITIALIZED) ? ConsesLow.list(hierarchy_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)hierarchy_browser.$kw141$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)hierarchy_browser.$str190$Choose_Constants__Complex_Version);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$92 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (hierarchy_browser.NIL != color) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str191$Resolve_Ambiguous_Input);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)hierarchy_browser.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)hierarchy_browser.$str143$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    if (hierarchy_browser.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)hierarchy_browser.$str192$hb_handle_complex_choose_constant, (SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                        html_utilities.html_submit_input((SubLObject)hierarchy_browser.$str193$Go, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_br();
                        html_utilities.html_br();
                        html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str194$Please_select_one_term_from_each_);
                        html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                        html_utilities.html_br();
                        SubLObject cdolist_list_var = failures;
                        SubLObject form = (SubLObject)hierarchy_browser.NIL;
                        form = cdolist_list_var.first();
                        while (hierarchy_browser.NIL != cdolist_list_var) {
                            html_utilities.html_br();
                            final SubLObject key = form.first();
                            final SubLObject v_forts = conses_high.second(form);
                            final SubLObject first_c = v_forts.first();
                            final SubLObject heading = (SubLObject)((key == hierarchy_browser.$kw162$TERM) ? hierarchy_browser.$str195$Terms : ((key == hierarchy_browser.$kw164$PRED) ? hierarchy_browser.$str196$Predicates : hierarchy_browser.$str197$Microtheories));
                            final SubLObject name = PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str198$_a, key);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), heading);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                SubLObject cdolist_list_var_$96 = v_forts;
                                SubLObject c = (SubLObject)hierarchy_browser.NIL;
                                c = cdolist_list_var_$96.first();
                                while (hierarchy_browser.NIL != cdolist_list_var_$96) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                            html_utilities.html_radio_input(name, cb_utilities.cb_fort_identifier(c), Equality.equal(c, first_c), (SubLObject)hierarchy_browser.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str199$_);
                                            hb_print_constant(c, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                                    cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                                    c = cdolist_list_var_$96.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            cdolist_list_var = cdolist_list_var.rest();
                            form = cdolist_list_var.first();
                        }
                        html_utilities.html_submit_input((SubLObject)hierarchy_browser.$str193$Go, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$92, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 26851L)
    public static SubLObject hb_handle_complex_choose_constants(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term_id_string = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str154$term, args);
        final SubLObject pred_id_string = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str78$pred, args);
        final SubLObject mt_id_string = html_utilities.html_extract_input((SubLObject)hierarchy_browser.$str85$mt, args);
        final SubLObject term_id = (SubLObject)((hierarchy_browser.NIL != string_utilities.non_empty_stringP(term_id_string)) ? reader.read_from_string_ignoring_errors(term_id_string, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED) : hierarchy_browser.NIL);
        final SubLObject pred_id = (SubLObject)((hierarchy_browser.NIL != string_utilities.non_empty_stringP(pred_id_string)) ? reader.read_from_string_ignoring_errors(pred_id_string, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED) : hierarchy_browser.NIL);
        final SubLObject mt_id = (SubLObject)((hierarchy_browser.NIL != string_utilities.non_empty_stringP(mt_id_string)) ? reader.read_from_string_ignoring_errors(mt_id_string, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED) : hierarchy_browser.NIL);
        if (term_id.isFixnum()) {
            hierarchy_browser.$hb_pivot_term$.setDynamicValue(cb_utilities.cb_guess_fort(term_id, (SubLObject)hierarchy_browser.UNPROVIDED), thread);
        }
        if (pred_id.isFixnum()) {
            hierarchy_browser.$hb_predicate$.setDynamicValue(cb_utilities.cb_guess_fort(pred_id, (SubLObject)hierarchy_browser.UNPROVIDED), thread);
        }
        if (mt_id.isFixnum()) {
            hierarchy_browser.$hb_mt$.setDynamicValue(cb_utilities.cb_guess_fort(mt_id, (SubLObject)hierarchy_browser.UNPROVIDED), thread);
        }
        if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_defaults_for_type$.getDynamicValue(thread)) {
            hb_set_defaults_for_type(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread));
        }
        return hb_print_nodes((SubLObject)hierarchy_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 27738L)
    public static SubLObject hb_select_node(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLObject id = (SubLObject)((hierarchy_browser.NIL != string_utilities.non_empty_stringP(args)) ? args : (args.isCons() ? args.first() : (args.isInteger() ? args : hierarchy_browser.NIL)));
        final SubLObject fort = cb_utilities.cb_guess_fort(id, (SubLObject)hierarchy_browser.UNPROVIDED);
        hierarchy_browser.$hb_pivot_term$.setDynamicValue(fort);
        hb_print_nodes((SubLObject)hierarchy_browser.UNPROVIDED);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 28027L)
    public static SubLObject set_hb_eval_form() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        hierarchy_browser.$hb_eval_form$.setDynamicValue((SubLObject)ConsesLow.list(hierarchy_browser.$hb_predicate$.getDynamicValue(thread), hierarchy_browser.$hb_index_argument$.getDynamicValue(thread), hierarchy_browser.$hb_gather_argument$.getDynamicValue(thread)), thread);
        hierarchy_browser.$hb_inverse_eval_form$.setDynamicValue((SubLObject)ConsesLow.list(hierarchy_browser.$hb_predicate$.getDynamicValue(thread), hierarchy_browser.$hb_gather_argument$.getDynamicValue(thread), hierarchy_browser.$hb_index_argument$.getDynamicValue(thread)), thread);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 28263L)
    public static SubLObject hb_alternate_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject alt_predicate = conses_high.second(conses_high.assoc(predicate, hierarchy_browser.$hb_alternate_predicates$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED));
        return (SubLObject)((hierarchy_browser.NIL != forts.valid_fortP(alt_predicate)) ? alt_predicate : hierarchy_browser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 28458L)
    public static SubLObject set_hb_alternate_predicate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        hierarchy_browser.$hb_alternate_predicate$.setDynamicValue(hb_alternate_predicate(hierarchy_browser.$hb_predicate$.getDynamicValue(thread)), thread);
        return hierarchy_browser.$hb_alternate_predicate$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 28614L)
    public static SubLObject hb_get_nodes(final SubLObject v_term, SubLObject recursive_call) {
        if (recursive_call == hierarchy_browser.UNPROVIDED) {
            recursive_call = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = function_terms.naut_to_nart(v_term);
        final SubLObject predicate = hierarchy_browser.$hb_eval_form$.getDynamicValue(thread).first();
        final SubLObject index_arg = conses_high.second(hierarchy_browser.$hb_eval_form$.getDynamicValue(thread));
        final SubLObject gather_arg = conses_high.third(hierarchy_browser.$hb_eval_form$.getDynamicValue(thread));
        SubLObject ans = (SubLObject)hierarchy_browser.NIL;
        if (hierarchy_browser.NIL != kb_indexing_datastructures.indexed_term_p(fort)) {
            if (hierarchy_browser.$hb_mt$.getDynamicValue(thread) == hierarchy_browser.$kw45$ALL) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(hierarchy_browser.$const59$EverythingPSC, thread);
                    ans = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_genl_mts$.getDynamicValue(thread)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(hierarchy_browser.$hb_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    ans = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym202$RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(hierarchy_browser.$hb_mt$.getDynamicValue(thread), thread);
                    ans = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (hierarchy_browser.NIL == recursive_call && hierarchy_browser.NIL != forts.valid_fortP(hierarchy_browser.$hb_alternate_predicate$.getDynamicValue(thread))) {
                final SubLObject _prev_bind_0 = hierarchy_browser.$hb_eval_form$.currentBinding(thread);
                try {
                    hierarchy_browser.$hb_eval_form$.bind(conses_high.subst(hierarchy_browser.$hb_alternate_predicate$.getDynamicValue(thread), predicate, hierarchy_browser.$hb_eval_form$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED), thread);
                    ans = conses_high.union(ans, hb_get_nodes(v_term, (SubLObject)hierarchy_browser.T), Symbols.symbol_function((SubLObject)hierarchy_browser.EQUAL), (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    hierarchy_browser.$hb_eval_form$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 29461L)
    public static SubLObject hb_comments(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = function_terms.naut_to_nart(v_term);
        final SubLObject pred = hierarchy_browser.$const203$comment;
        SubLObject assertions = (SubLObject)hierarchy_browser.NIL;
        SubLObject mt_string_pairs = (SubLObject)hierarchy_browser.NIL;
        if (hierarchy_browser.NIL != kb_indexing_datastructures.indexed_term_p(fort) && hierarchy_browser.NIL != pred) {
            if (hierarchy_browser.$hb_mt$.getDynamicValue(thread) == hierarchy_browser.$kw45$ALL) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(hierarchy_browser.$const59$EverythingPSC, thread);
                    assertions = kb_mapping.gather_gaf_arg_index(fort, (SubLObject)hierarchy_browser.ONE_INTEGER, pred, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_genl_mts$.getDynamicValue(thread)) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(hierarchy_browser.$hb_mt$.getDynamicValue(thread));
                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    assertions = kb_mapping.gather_gaf_arg_index(fort, (SubLObject)hierarchy_browser.ONE_INTEGER, pred, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym202$RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(hierarchy_browser.$hb_mt$.getDynamicValue(thread), thread);
                    assertions = kb_mapping.gather_gaf_arg_index(fort, (SubLObject)hierarchy_browser.ONE_INTEGER, pred, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            SubLObject cdolist_list_var = assertions;
            SubLObject ass = (SubLObject)hierarchy_browser.NIL;
            ass = cdolist_list_var.first();
            while (hierarchy_browser.NIL != cdolist_list_var) {
                final SubLObject formula = misc_kb_utilities.make_lispy_form(ass);
                final SubLObject string = conses_high.third(formula);
                final SubLObject mt = assertions_high.assertion_mt(ass);
                mt_string_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(mt, string), mt_string_pairs);
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            }
            mt_string_pairs = Sort.sort(mt_string_pairs, Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym204$NAME_OF_CAR));
        }
        return mt_string_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 30254L)
    public static SubLObject hb_maybe_print_comments(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hierarchy_browser.NIL != hierarchy_browser.$hb_show_comments$.getDynamicValue(thread)) {
            final SubLObject mt_comment_pairs = hb_comments(fort);
            if (hierarchy_browser.NIL != mt_comment_pairs) {
                html_utilities.html_br();
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    SubLObject cdolist_list_var = mt_comment_pairs;
                    SubLObject pair = (SubLObject)hierarchy_browser.NIL;
                    pair = cdolist_list_var.first();
                    while (hierarchy_browser.NIL != cdolist_list_var) {
                        html_utilities.html_br();
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (hierarchy_browser.NIL != size_val) {
                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    html_utilities.html_markup(size_val);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                    cb_utilities.cb_form(pair.first(), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str113$__);
                                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (hierarchy_browser.NIL != size_val) {
                                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    html_utilities.html_markup(size_val);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                    html_utilities.html_princ_doc_string(conses_high.second(pair), (SubLObject)hierarchy_browser.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$104, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$103, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        pair = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 30803L)
    public static SubLObject hb_string_for_constant(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)hierarchy_browser.NIL;
        if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_lexicon$.getDynamicValue(thread)) {
            string = pph_main.generate_phrase(fort, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        }
        else {
            string = misc_kb_utilities.coerce_name(fort);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 31023L)
    public static SubLObject hb_print_constant(final SubLObject fort, SubLObject hb_linkP) {
        if (hb_linkP == hierarchy_browser.UNPROVIDED) {
            hb_linkP = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = (SubLObject)((hierarchy_browser.NIL != forts.valid_fortP(fort)) ? cb_utilities.cb_fort_identifier(fort) : hierarchy_browser.NIL);
        if (hierarchy_browser.NIL != id && hierarchy_browser.NIL != hb_linkP) {
            if (hierarchy_browser.$hb_icon$.getDynamicValue(thread).equal((SubLObject)hierarchy_browser.$str4$_)) {
                cyc_navigator_internals.nav_link((SubLObject)hierarchy_browser.$kw205$HB_SELECT_NODE_TEXT, (SubLObject)ConsesLow.list(id), (SubLObject)hierarchy_browser.$kw188$SELF, hierarchy_browser.$hb_icon$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            else {
                cyc_navigator_internals.nav_link((SubLObject)hierarchy_browser.$kw206$HB_SELECT_NODE_IMAGE, (SubLObject)ConsesLow.list(id), (SubLObject)hierarchy_browser.$kw188$SELF, (SubLObject)hierarchy_browser.NIL, hierarchy_browser.$hb_icon$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$str4$_, (SubLObject)hierarchy_browser.$kw73$TOP, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
        }
        if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_lexicon$.getDynamicValue(thread)) {
            pph_html.html_phrase_with_target(fort, (SubLObject)hierarchy_browser.$sym207$CB_CF, (SubLObject)hierarchy_browser.$kw188$SELF);
        }
        else {
            cb_utilities.cb_form(fort, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 31487L)
    public static SubLObject hb_accessor(final SubLObject fort, final SubLObject mt, SubLObject key) {
        if (key == hierarchy_browser.UNPROVIDED) {
            key = (SubLObject)hierarchy_browser.$kw208$ISA;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mtP = isa.isa_in_any_mtP(mt, hierarchy_browser.$const86$Microtheory);
        SubLObject function = (SubLObject)hierarchy_browser.NIL;
        SubLObject ans = (SubLObject)hierarchy_browser.NIL;
        if (hierarchy_browser.NIL != kb_indexing_datastructures.indexed_term_p(fort)) {
            final SubLObject pcase_var = key;
            if (pcase_var.eql((SubLObject)hierarchy_browser.$kw208$ISA)) {
                function = (SubLObject)hierarchy_browser.$sym209$MIN_ISA;
            }
            else if (pcase_var.eql((SubLObject)hierarchy_browser.$kw210$GENLS)) {
                function = (SubLObject)hierarchy_browser.$sym211$MIN_GENLS;
            }
            else if (pcase_var.eql((SubLObject)hierarchy_browser.$kw212$ALL_ISA)) {
                function = (SubLObject)hierarchy_browser.$sym213$ALL_ISA;
            }
            else if (pcase_var.eql((SubLObject)hierarchy_browser.$kw214$ALL_GENLS)) {
                function = (SubLObject)hierarchy_browser.$sym215$ALL_GENLS;
            }
            else {
                function = (SubLObject)hierarchy_browser.$sym216$LIST;
            }
            if (mt == hierarchy_browser.$kw45$ALL) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(hierarchy_browser.$const59$EverythingPSC, thread);
                    ans = Functions.funcall(function, fort);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_genl_mts$.getDynamicValue(thread) && hierarchy_browser.NIL != mtP) {
                final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    ans = Functions.funcall(function, fort);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                }
            }
            else if (hierarchy_browser.NIL != mtP) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym202$RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    ans = Functions.funcall(function, fort);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(hierarchy_browser.$const59$EverythingPSC, thread);
                    ans = Functions.funcall(function, fort);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return Sequences.remove_duplicates(ans, Symbols.symbol_function((SubLObject)hierarchy_browser.EQUAL), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 32244L)
    public static SubLObject hb_status_heading(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        cb_utilities.cb_form(hierarchy_browser.$const217$isa, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str113$__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$107, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$106, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        final SubLObject isas = hb_accessor(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread), hierarchy_browser.$hb_mt$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$kw208$ISA);
                        final SubLObject sorted_isas = Sort.sort(isas, Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym178$HB_STRING_FOR_CONSTANT));
                        final SubLObject last = conses_high.last(sorted_isas, (SubLObject)hierarchy_browser.UNPROVIDED).first();
                        if (hierarchy_browser.NIL != isas) {
                            SubLObject cdolist_list_var = sorted_isas;
                            SubLObject v_isa = (SubLObject)hierarchy_browser.NIL;
                            v_isa = cdolist_list_var.first();
                            while (hierarchy_browser.NIL != cdolist_list_var) {
                                hb_print_constant(v_isa, (SubLObject)hierarchy_browser.UNPROVIDED);
                                if (!v_isa.equal(last)) {
                                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str218$__);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                v_isa = cdolist_list_var.first();
                            }
                        }
                        else {
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str65$None);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$109, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$108, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            if (hierarchy_browser.NIL != Sequences.find(hierarchy_browser.$const219$Collection, hb_accessor(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread), hierarchy_browser.$hb_mt$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$kw212$ALL_ISA), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (hierarchy_browser.NIL != size_val) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(size_val);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_utilities.cb_form(hierarchy_browser.$const220$genls, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str113$__);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$112, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$111, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (hierarchy_browser.NIL != size_val) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(size_val);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            final SubLObject v_genls = hb_accessor(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread), hierarchy_browser.$hb_mt$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$kw210$GENLS);
                            final SubLObject sorted_genls = Sort.sort(v_genls, Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym178$HB_STRING_FOR_CONSTANT));
                            final SubLObject last = conses_high.last(sorted_genls, (SubLObject)hierarchy_browser.UNPROVIDED).first();
                            if (hierarchy_browser.NIL != v_genls) {
                                SubLObject cdolist_list_var = sorted_genls;
                                SubLObject genl = (SubLObject)hierarchy_browser.NIL;
                                genl = cdolist_list_var.first();
                                while (hierarchy_browser.NIL != cdolist_list_var) {
                                    hb_print_constant(genl, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    if (!genl.equal(last)) {
                                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str218$__);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    genl = cdolist_list_var.first();
                                }
                            }
                            else {
                                html_utilities.html_princ((SubLObject)hierarchy_browser.$str65$None);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$114, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$113, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$110, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str221$Context__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$117, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$116, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        final SubLObject mtP = isa.isa_in_any_mtP(hierarchy_browser.$hb_mt$.getDynamicValue(thread), hierarchy_browser.$const86$Microtheory);
                        if (hierarchy_browser.$hb_mt$.getDynamicValue(thread) == hierarchy_browser.$kw45$ALL) {
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str222$Union_of_all_contexts);
                        }
                        else if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_genl_mts$.getDynamicValue(thread) && hierarchy_browser.NIL != mtP) {
                            hb_print_constant(hierarchy_browser.$hb_mt$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str223$_and_its_);
                            cb_utilities.cb_form(hierarchy_browser.$const224$genlMt, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str225$s);
                        }
                        else if (hierarchy_browser.NIL != mtP) {
                            hb_print_constant(hierarchy_browser.$hb_mt$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        else {
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str226$Unknown_);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$119, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$118, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$115, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str227$Predicate__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$121, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        hb_print_constant(hierarchy_browser.$hb_predicate$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
                        if (hierarchy_browser.NIL != forts.valid_fortP(hierarchy_browser.$hb_alternate_predicate$.getDynamicValue(thread))) {
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str218$__);
                            hb_print_constant(hierarchy_browser.$hb_alternate_predicate$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$120, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str92$right));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str228$Index__);
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != size_val) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(size_val);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$str198$_a, hierarchy_browser.$hb_index_argument$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 34825L)
    public static SubLObject clear_hb_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!hierarchy_browser.$hb_table$.getDynamicValue(thread).isHashtable()) {
            hierarchy_browser.$hb_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)hierarchy_browser.$int229$100, Symbols.symbol_function((SubLObject)hierarchy_browser.EQUAL), (SubLObject)hierarchy_browser.UNPROVIDED), thread);
        }
        Hashtables.clrhash(hierarchy_browser.$hb_table$.getDynamicValue(thread));
        return hierarchy_browser.$hb_table$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 34994L)
    public static SubLObject clear_hb_duplicates_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!hierarchy_browser.$hb_duplicates_table$.getDynamicValue(thread).isHashtable()) {
            hierarchy_browser.$hb_duplicates_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)hierarchy_browser.$int229$100, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED), thread);
        }
        Hashtables.clrhash(hierarchy_browser.$hb_duplicates_table$.getDynamicValue(thread));
        return hierarchy_browser.$hb_duplicates_table$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 35210L)
    public static SubLObject clear_hb_superior_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!hierarchy_browser.$hb_superior_table$.getDynamicValue(thread).isHashtable()) {
            hierarchy_browser.$hb_superior_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)hierarchy_browser.$int229$100, Symbols.symbol_function((SubLObject)hierarchy_browser.EQUAL), (SubLObject)hierarchy_browser.UNPROVIDED), thread);
        }
        final SubLObject cdohash_table = hierarchy_browser.$hb_superior_table$.getDynamicValue(thread);
        SubLObject key = (SubLObject)hierarchy_browser.NIL;
        SubLObject val = (SubLObject)hierarchy_browser.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                if (val.isHashtable()) {
                    Hashtables.clrhash(val);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return hierarchy_browser.$hb_superior_table$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 35502L)
    public static SubLObject hb_init() {
        clear_hb_table();
        clear_hb_duplicates_table();
        clear_hb_superior_table();
        apps_shared.configure_app_colors();
        set_default_hb_icon();
        set_hb_eval_form();
        set_hb_alternate_predicate();
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 35721L)
    public static SubLObject hb_bar(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hierarchy_browser.NIL != hierarchy_browser.$hb_bar$.getDynamicValue(thread)) {
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(hierarchy_browser.$hb_bar$.getDynamicValue(thread));
            final SubLObject align = (SubLObject)hierarchy_browser.$kw73$TOP;
            final SubLObject alt = (SubLObject)hierarchy_browser.$str230$__________;
            final SubLObject border = (SubLObject)hierarchy_browser.ZERO_INTEGER;
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(image_src);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            if (hierarchy_browser.NIL != alt) {
                html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(alt);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            if (hierarchy_browser.NIL != align) {
                html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align(align));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            if (hierarchy_browser.NIL != border) {
                html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(border);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 35913L)
    public static SubLObject hb_print_nodes(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hierarchy_browser.NIL != forts.valid_fortP(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread))) {
            hb_init();
            final SubLObject color = hierarchy_browser.$hb_background_color$.getDynamicValue(thread);
            html_utilities.html_markup((SubLObject)hierarchy_browser.$str138$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (hierarchy_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup((SubLObject)hierarchy_browser.$str139$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == hierarchy_browser.$kw140$UNINITIALIZED) ? ConsesLow.list(hierarchy_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)hierarchy_browser.$kw141$CB_CYC);
                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$str233$Hierarchical_Display___a, hb_string_for_constant(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread)));
                html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$130 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != color) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(color));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        cb_browser.cb_term_page_heading(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread), (SubLObject)hierarchy_browser.$sym234$HIERARCHY_DEFAULT);
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)hierarchy_browser.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)hierarchy_browser.$str143$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        if (hierarchy_browser.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)hierarchy_browser.$str235$hb_parameters, (SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_simple_attribute(html_macros.$html_table_noflow$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)hierarchy_browser.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str199$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$135, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str199$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        hb_status_heading((SubLObject)hierarchy_browser.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$139, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                                if (hierarchy_browser.NIL != hierarchy_browser.$hb_message$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                            final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                                            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                            if (hierarchy_browser.NIL != size_val) {
                                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                                html_utilities.html_markup(size_val);
                                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                            }
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                                hb_message((SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$142, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$140, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str199$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$143, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str199$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$146, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        cb_utilities.cb_help_preamble((SubLObject)hierarchy_browser.$kw231$HB_PRINT_NODES, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        html_utilities.html_submit_input((SubLObject)hierarchy_browser.$str236$Change_Hierarchy_Browser_Settings, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$148, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$147, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                                if (hierarchy_browser.NIL != hierarchy_browser.$hb_bar$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_align((SubLObject)hierarchy_browser.$str75$middle));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                            hb_bar((SubLObject)hierarchy_browser.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                                hb_print_nodes_1(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread));
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$130, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)hierarchy_browser.UNPROVIDED);
        }
        else {
            hierarchy_browser.$hb_message$.setDynamicValue(PrintLow.format((SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.$str237$_a_is_not_a_valid_constant_, hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread)), thread);
            hb_parameters((SubLObject)hierarchy_browser.UNPROVIDED);
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 37377L)
    public static SubLObject hb_construct_superior_paths(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_hb_superior_table();
        clear_hb_table();
        if (hierarchy_browser.NIL != kb_indexing_datastructures.indexed_term_p(fort)) {
            final SubLObject _prev_bind_0 = hierarchy_browser.$hb_eval_form$.currentBinding(thread);
            try {
                hierarchy_browser.$hb_eval_form$.bind(hierarchy_browser.$hb_inverse_eval_form$.getDynamicValue(thread), thread);
                hb_construct_superior_paths_int((SubLObject)ConsesLow.list(fort), hierarchy_browser.$hb_eval_form$.getDynamicValue(thread), (SubLObject)hierarchy_browser.ZERO_INTEGER);
            }
            finally {
                hierarchy_browser.$hb_eval_form$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 37640L)
    public static SubLObject hb_superior_table_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)hierarchy_browser.ZERO_INTEGER;
        if (!hierarchy_browser.$hb_superior_table$.getDynamicValue(thread).isHashtable()) {
            hierarchy_browser.$hb_superior_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)hierarchy_browser.$int161$50, Symbols.symbol_function((SubLObject)hierarchy_browser.EQUAL), (SubLObject)hierarchy_browser.UNPROVIDED), thread);
        }
        final SubLObject cdohash_table = hierarchy_browser.$hb_superior_table$.getDynamicValue(thread);
        SubLObject key = (SubLObject)hierarchy_browser.NIL;
        SubLObject val = (SubLObject)hierarchy_browser.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                val = Hashtables.getEntryValue(cdohash_entry);
                if (val.isHashtable() && Hashtables.hash_table_count(val).numG((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
                    count = Numbers.add(count, (SubLObject)hierarchy_browser.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 37985L)
    public static SubLObject hb_construct_superior_paths_int(SubLObject v_forts, final SubLObject eval_form, SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = eval_form.first();
        final SubLObject alt_pred = hb_alternate_predicate(predicate);
        final SubLObject index_arg = conses_high.second(eval_form);
        final SubLObject gather_arg = conses_high.third(eval_form);
        SubLObject superiors = (SubLObject)hierarchy_browser.NIL;
        for (SubLObject all_superiors = (SubLObject)hierarchy_browser.NIL; hierarchy_browser.NIL != v_forts && (!hierarchy_browser.$hb_max_height$.getDynamicValue(thread).isInteger() || !level.numGE(hierarchy_browser.$hb_max_height$.getDynamicValue(thread))); v_forts = all_superiors, all_superiors = (SubLObject)hierarchy_browser.NIL, superiors = (SubLObject)hierarchy_browser.NIL, level = Numbers.add(level, (SubLObject)hierarchy_browser.ONE_INTEGER)) {
            SubLObject cdolist_list_var = v_forts;
            SubLObject fort = (SubLObject)hierarchy_browser.NIL;
            fort = cdolist_list_var.first();
            while (hierarchy_browser.NIL != cdolist_list_var) {
                if (hierarchy_browser.NIL != kb_indexing_datastructures.indexed_term_p(fort)) {
                    if (hierarchy_browser.$hb_mt$.getDynamicValue(thread) == hierarchy_browser.$kw45$ALL) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym58$RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind(hierarchy_browser.$const59$EverythingPSC, thread);
                            superiors = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, (SubLObject)hierarchy_browser.UNPROVIDED);
                            if (hierarchy_browser.NIL != forts.valid_fortP(alt_pred)) {
                                superiors = conses_high.union(superiors, kb_mapping_utilities.pred_values(fort, alt_pred, index_arg, gather_arg, (SubLObject)hierarchy_browser.UNPROVIDED), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    else if (hierarchy_browser.NIL != hierarchy_browser.$hb_use_genl_mts$.getDynamicValue(thread)) {
                        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(hierarchy_browser.$hb_mt$.getDynamicValue(thread));
                        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            superiors = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, (SubLObject)hierarchy_browser.UNPROVIDED);
                            if (hierarchy_browser.NIL != forts.valid_fortP(alt_pred)) {
                                superiors = conses_high.union(superiors, kb_mapping_utilities.pred_values(fort, alt_pred, index_arg, gather_arg, (SubLObject)hierarchy_browser.UNPROVIDED), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                            }
                        }
                        finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                        }
                    }
                    else {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)hierarchy_browser.$sym202$RELEVANT_MT_IS_EQ, thread);
                            mt_relevance_macros.$mt$.bind(hierarchy_browser.$hb_mt$.getDynamicValue(thread), thread);
                            superiors = kb_mapping_utilities.pred_values(fort, predicate, index_arg, gather_arg, (SubLObject)hierarchy_browser.UNPROVIDED);
                            if (hierarchy_browser.NIL != forts.valid_fortP(alt_pred)) {
                                superiors = conses_high.union(superiors, kb_mapping_utilities.pred_values(fort, alt_pred, index_arg, gather_arg, (SubLObject)hierarchy_browser.UNPROVIDED), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                            }
                        }
                        finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (hierarchy_browser.NIL != superiors) {
                    SubLObject table = Hashtables.gethash(level, hierarchy_browser.$hb_superior_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
                    if (!table.isHashtable()) {
                        Hashtables.sethash(level, hierarchy_browser.$hb_superior_table$.getDynamicValue(thread), Hashtables.make_hash_table((SubLObject)hierarchy_browser.$int161$50, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED));
                        table = Hashtables.gethash(level, hierarchy_browser.$hb_superior_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    SubLObject cdolist_list_var_$152 = superiors;
                    SubLObject p = (SubLObject)hierarchy_browser.NIL;
                    p = cdolist_list_var_$152.first();
                    while (hierarchy_browser.NIL != cdolist_list_var_$152) {
                        if (hierarchy_browser.NIL == Hashtables.gethash((SubLObject)ConsesLow.list(fort, p), hierarchy_browser.$hb_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED)) {
                            final SubLObject val = Hashtables.gethash(p, table, (SubLObject)hierarchy_browser.UNPROVIDED);
                            Hashtables.sethash(p, table, conses_high.adjoin(fort, val, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED));
                            final SubLObject item_var = p;
                            if (hierarchy_browser.NIL == conses_high.member(item_var, all_superiors, Symbols.symbol_function((SubLObject)hierarchy_browser.EQL), Symbols.symbol_function((SubLObject)hierarchy_browser.IDENTITY))) {
                                all_superiors = (SubLObject)ConsesLow.cons(item_var, all_superiors);
                            }
                            Hashtables.sethash((SubLObject)ConsesLow.list(fort, p), hierarchy_browser.$hb_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.T);
                        }
                        cdolist_list_var_$152 = cdolist_list_var_$152.rest();
                        p = cdolist_list_var_$152.first();
                    }
                    superiors = (SubLObject)hierarchy_browser.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                fort = cdolist_list_var.first();
            }
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 39807L)
    public static SubLObject hb_print_mt_list(final SubLObject pivot_term, final SubLObject c2, SubLObject pivot_term_is_to_c2) {
        if (pivot_term_is_to_c2 == hierarchy_browser.UNPROVIDED) {
            pivot_term_is_to_c2 = (SubLObject)hierarchy_browser.$kw239$SUPERIOR;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg1 = (SubLObject)hierarchy_browser.NIL;
        SubLObject arg2 = (SubLObject)hierarchy_browser.NIL;
        if ((pivot_term_is_to_c2 == hierarchy_browser.$kw239$SUPERIOR && hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).eql((SubLObject)hierarchy_browser.ONE_INTEGER)) || (pivot_term_is_to_c2 == hierarchy_browser.$kw240$INFERIOR && hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).eql((SubLObject)hierarchy_browser.TWO_INTEGER))) {
            arg1 = pivot_term;
            arg2 = c2;
        }
        else if ((pivot_term_is_to_c2 == hierarchy_browser.$kw239$SUPERIOR && hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).eql((SubLObject)hierarchy_browser.TWO_INTEGER)) || (pivot_term_is_to_c2 == hierarchy_browser.$kw240$INFERIOR && hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).eql((SubLObject)hierarchy_browser.ONE_INTEGER))) {
            arg2 = pivot_term;
            arg1 = c2;
        }
        final SubLObject some_mts = kb_indexing.gaf_mts((SubLObject)ConsesLow.list(hierarchy_browser.$hb_predicate$.getDynamicValue(thread), arg1, arg2));
        final SubLObject mts = (hierarchy_browser.NIL != forts.valid_fortP(hierarchy_browser.$hb_alternate_predicate$.getDynamicValue(thread))) ? conses_high.union(some_mts, kb_indexing.gaf_mts((SubLObject)ConsesLow.list(hierarchy_browser.$hb_alternate_predicate$.getDynamicValue(thread), arg1, arg2)), Symbols.symbol_function((SubLObject)hierarchy_browser.EQUAL), (SubLObject)hierarchy_browser.UNPROVIDED) : some_mts;
        final SubLObject sorted_mts = Sort.sort(mts, Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym135$COERCE_NAME));
        final SubLObject last = conses_high.last(sorted_mts, (SubLObject)hierarchy_browser.UNPROVIDED).first();
        final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (hierarchy_browser.NIL != size_val) {
            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(size_val);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
            html_utilities.html_princ((SubLObject)hierarchy_browser.$str241$__);
            if (hierarchy_browser.NIL != sorted_mts) {
                SubLObject cdolist_list_var = sorted_mts;
                SubLObject mt = (SubLObject)hierarchy_browser.NIL;
                mt = cdolist_list_var.first();
                while (hierarchy_browser.NIL != cdolist_list_var) {
                    cb_utilities.cb_form(mt, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                    if (!mt.equal(last)) {
                        html_utilities.html_princ((SubLObject)hierarchy_browser.$str218$__);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    mt = cdolist_list_var.first();
                }
            }
            else {
                html_utilities.html_princ((SubLObject)hierarchy_browser.$str226$Unknown_);
            }
            html_utilities.html_princ((SubLObject)hierarchy_browser.$str242$_);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 40933L)
    public static SubLObject hb_print_pivot_mts(final SubLObject pivot_term, final SubLObject v_forts, final SubLObject indent, SubLObject pivot_term_position) {
        if (pivot_term_position == hierarchy_browser.UNPROVIDED) {
            pivot_term_position = (SubLObject)hierarchy_browser.$kw239$SUPERIOR;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_hb_table();
        SubLObject mt_list = (SubLObject)hierarchy_browser.NIL;
        SubLObject cdolist_list_var = v_forts;
        SubLObject c = (SubLObject)hierarchy_browser.NIL;
        c = cdolist_list_var.first();
        while (hierarchy_browser.NIL != cdolist_list_var) {
            SubLObject arg1 = (SubLObject)hierarchy_browser.NIL;
            SubLObject arg2 = (SubLObject)hierarchy_browser.NIL;
            if ((pivot_term_position == hierarchy_browser.$kw239$SUPERIOR && hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).eql((SubLObject)hierarchy_browser.ONE_INTEGER)) || (pivot_term_position == hierarchy_browser.$kw240$INFERIOR && hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).eql((SubLObject)hierarchy_browser.TWO_INTEGER))) {
                arg1 = pivot_term;
                arg2 = c;
            }
            else if ((pivot_term_position == hierarchy_browser.$kw239$SUPERIOR && hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).eql((SubLObject)hierarchy_browser.TWO_INTEGER)) || (pivot_term_position == hierarchy_browser.$kw240$INFERIOR && hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).eql((SubLObject)hierarchy_browser.ONE_INTEGER))) {
                arg2 = pivot_term;
                arg1 = c;
            }
            SubLObject mts = kb_indexing.gaf_mts((SubLObject)ConsesLow.list(hierarchy_browser.$hb_predicate$.getDynamicValue(thread), arg1, arg2));
            if (hierarchy_browser.NIL != forts.valid_fortP(hierarchy_browser.$hb_alternate_predicate$.getDynamicValue(thread))) {
                mts = conses_high.union(mts, kb_indexing.gaf_mts((SubLObject)ConsesLow.list(hierarchy_browser.$hb_alternate_predicate$.getDynamicValue(thread), arg1, arg2)), Symbols.symbol_function((SubLObject)hierarchy_browser.EQUAL), (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            SubLObject cdolist_list_var_$153 = mts;
            SubLObject mt = (SubLObject)hierarchy_browser.NIL;
            mt = cdolist_list_var_$153.first();
            while (hierarchy_browser.NIL != cdolist_list_var_$153) {
                hash_table_utilities.pushnew_hash(mt, c, hierarchy_browser.$hb_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject item_var = mt;
                if (hierarchy_browser.NIL == conses_high.member(item_var, mt_list, Symbols.symbol_function((SubLObject)hierarchy_browser.EQL), Symbols.symbol_function((SubLObject)hierarchy_browser.IDENTITY))) {
                    mt_list = (SubLObject)ConsesLow.cons(item_var, mt_list);
                }
                cdolist_list_var_$153 = cdolist_list_var_$153.rest();
                mt = cdolist_list_var_$153.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            c = cdolist_list_var.first();
        }
        if (hierarchy_browser.NIL != mt_list) {
            cdolist_list_var = Sort.sort(mt_list, Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym135$COERCE_NAME));
            SubLObject x = (SubLObject)hierarchy_browser.NIL;
            x = cdolist_list_var.first();
            while (hierarchy_browser.NIL != cdolist_list_var) {
                final SubLObject val = Sort.sort(conses_high.copy_list(Hashtables.gethash(x, hierarchy_browser.$hb_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED)), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym178$HB_STRING_FOR_CONSTANT));
                final SubLObject last = conses_high.last(val, (SubLObject)hierarchy_browser.UNPROVIDED).first();
                html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_indent(indent);
                final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (hierarchy_browser.NIL != size_val) {
                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(size_val);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str243$_);
                    cb_utilities.cb_form(x, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str244$_____);
                    SubLObject cdolist_list_var_$154 = val;
                    SubLObject v = (SubLObject)hierarchy_browser.NIL;
                    v = cdolist_list_var_$154.first();
                    while (hierarchy_browser.NIL != cdolist_list_var_$154) {
                        hb_print_constant(v, (SubLObject)hierarchy_browser.T);
                        if (!v.equal(last)) {
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str218$__);
                        }
                        cdolist_list_var_$154 = cdolist_list_var_$154.rest();
                        v = cdolist_list_var_$154.first();
                    }
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str245$__);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                x = cdolist_list_var.first();
            }
        }
        else {
            html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_indent(indent);
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)hierarchy_browser.$str246$_Unknown__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        clear_hb_table();
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 42459L)
    public static SubLObject hb_display_superiors() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_hb_table();
        hierarchy_browser.$hb_indent$.setDynamicValue((SubLObject)hierarchy_browser.ZERO_INTEGER, thread);
        final SubLObject superior_level_count = hb_superior_table_count();
        if (superior_level_count.numG((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
            SubLObject level;
            SubLObject table;
            SubLObject cdolist_list_var;
            SubLObject v_forts;
            SubLObject c;
            for (level = (SubLObject)hierarchy_browser.NIL, level = Numbers.subtract(superior_level_count, (SubLObject)hierarchy_browser.ONE_INTEGER); !level.numL((SubLObject)hierarchy_browser.ZERO_INTEGER); level = Numbers.subtract(level, (SubLObject)hierarchy_browser.ONE_INTEGER)) {
                table = Hashtables.gethash(level, hierarchy_browser.$hb_superior_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
                v_forts = (cdolist_list_var = Sort.sort(hash_table_utilities.list_table_keys(table), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym247$STRING_), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym135$COERCE_NAME)));
                c = (SubLObject)hierarchy_browser.NIL;
                c = cdolist_list_var.first();
                while (hierarchy_browser.NIL != cdolist_list_var) {
                    hb_trace_superior_paths((SubLObject)hierarchy_browser.NIL, c, table, level, (SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.T);
                    cdolist_list_var = cdolist_list_var.rest();
                    c = cdolist_list_var.first();
                }
            }
        }
        else if (hierarchy_browser.NIL == hierarchy_browser.$hb_max_height$.getDynamicValue(thread) || hierarchy_browser.$hb_max_height$.getDynamicValue(thread).numG((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
            html_utilities.html_br();
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)hierarchy_browser.$str248$No_superior_terms);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_br();
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 43087L)
    public static SubLObject reset_hb_indent(final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!hierarchy_browser.$hb_indent$.getDynamicValue(thread).numGE(indent)) {
            hierarchy_browser.$hb_indent$.setDynamicValue(indent, thread);
        }
        return hierarchy_browser.$hb_indent$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 43217L)
    public static SubLObject hb_trace_superior_paths(final SubLObject previous, final SubLObject c, final SubLObject table, final SubLObject level, final SubLObject indent, final SubLObject starting_levelP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject quant = Numbers.multiply(indent, hierarchy_browser.$hb_indent_quantum$.getDynamicValue(thread));
        final SubLObject next_forts = Sort.sort(Hashtables.gethash(c, table, (SubLObject)hierarchy_browser.UNPROVIDED), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym247$STRING_), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym135$COERCE_NAME));
        final SubLObject next_level = Numbers.subtract(level, (SubLObject)hierarchy_browser.ONE_INTEGER);
        final SubLObject next_table = Hashtables.gethash(next_level, hierarchy_browser.$hb_superior_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject next_indent = Numbers.add(indent, (SubLObject)hierarchy_browser.ONE_INTEGER);
        final SubLObject _prev_bind_0 = hierarchy_browser.$hb_eval_form$.currentBinding(thread);
        try {
            hierarchy_browser.$hb_eval_form$.bind(hierarchy_browser.$hb_inverse_eval_form$.getDynamicValue(thread), thread);
            SubLObject printing_fortP = (SubLObject)hierarchy_browser.NIL;
            SubLObject notice_printedP = (SubLObject)hierarchy_browser.NIL;
            if (hierarchy_browser.NIL == Hashtables.gethash((SubLObject)ConsesLow.list(c, level), hierarchy_browser.$hb_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED) || hierarchy_browser.NIL == starting_levelP) {
                printing_fortP = (SubLObject)hierarchy_browser.T;
                if (hierarchy_browser.NIL != starting_levelP) {
                    final SubLObject sign = (hierarchy_browser.NIL != hb_get_nodes(c, (SubLObject)hierarchy_browser.UNPROVIDED)) ? hierarchy_browser.$hb_more_superiors_sign$.getDynamicValue(thread) : hierarchy_browser.$hb_top_sign$.getDynamicValue(thread);
                    final SubLObject len = Sequences.length(sign);
                    html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_indent(Numbers.subtract(quant, hierarchy_browser.$hb_indent_quantum$.getDynamicValue(thread)));
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), sign);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_indent(Numbers.subtract(quant, len));
                    hb_print_constant(c, (SubLObject)hierarchy_browser.T);
                    if (hierarchy_browser.NIL == kb_indexing_datastructures.indexed_term_p(c)) {
                        final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (hierarchy_browser.NIL != size_val) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(size_val);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str249$__not_an_indexed_term_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                else {
                    html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                    html_utilities.html_indent(quant);
                    hb_print_constant(c, (SubLObject)hierarchy_browser.T);
                    if (hierarchy_browser.NIL == kb_indexing_datastructures.indexed_term_p(c)) {
                        final SubLObject size_val2 = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (hierarchy_browser.NIL != size_val2) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(size_val2);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_princ((SubLObject)hierarchy_browser.$str249$__not_an_indexed_term_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$156, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                }
                hierarchy_browser.$hb_counter$.setDynamicValue(Numbers.add(hierarchy_browser.$hb_counter$.getDynamicValue(thread), (SubLObject)hierarchy_browser.ONE_INTEGER), thread);
                reset_hb_indent(indent);
                if (hierarchy_browser.NIL != hierarchy_browser.$hb_show_mts$.getDynamicValue(thread) && hierarchy_browser.NIL != previous) {
                    hb_print_mt_list(c, previous, (SubLObject)hierarchy_browser.$kw240$INFERIOR);
                }
            }
            Hashtables.sethash((SubLObject)ConsesLow.list(c, level), hierarchy_browser.$hb_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.T);
            SubLObject cdolist_list_var = next_forts;
            SubLObject next = (SubLObject)hierarchy_browser.NIL;
            next = cdolist_list_var.first();
            while (hierarchy_browser.NIL != cdolist_list_var) {
                hash_table_utilities.cinc_hash((SubLObject)ConsesLow.list(c, next), hierarchy_browser.$hb_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject count = Hashtables.gethash((SubLObject)ConsesLow.list(c, next), hierarchy_browser.$hb_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
                if (count.numL((SubLObject)hierarchy_browser.TWO_INTEGER)) {
                    hb_maybe_print_comments(c);
                    if (level.numG((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
                        hb_trace_superior_paths(c, next, next_table, next_level, next_indent, (SubLObject)hierarchy_browser.NIL);
                    }
                }
                else if (count.numGE((SubLObject)hierarchy_browser.TWO_INTEGER) && hierarchy_browser.NIL != printing_fortP && level.numG((SubLObject)hierarchy_browser.ZERO_INTEGER) && hierarchy_browser.NIL == notice_printedP) {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(hierarchy_browser.$hb_more_inferiors_sign$.getDynamicValue(thread));
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    final SubLObject size_val3 = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != size_val3) {
                        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        html_utilities.html_markup(size_val3);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                        html_utilities.html_princ(hierarchy_browser.$hb_cycle_sign$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$157, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    hb_maybe_print_comments(c);
                    notice_printedP = (SubLObject)hierarchy_browser.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                next = cdolist_list_var.first();
            }
        }
        finally {
            hierarchy_browser.$hb_eval_form$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 45100L)
    public static SubLObject hb_display_term(final SubLObject fort, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = hierarchy_browser.$hb_eval_form$.currentBinding(thread);
        try {
            hierarchy_browser.$hb_eval_form$.bind(hierarchy_browser.$hb_inverse_eval_form$.getDynamicValue(thread), thread);
            final SubLObject superiors = hb_get_nodes(fort, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject amount = Numbers.multiply(indent, hierarchy_browser.$hb_indent_quantum$.getDynamicValue(thread));
            html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            html_utilities.html_indent(amount);
            final SubLObject size_val = hierarchy_browser.$hb_large_font_size$.getDynamicValue(thread);
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (hierarchy_browser.NIL != size_val) {
                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(size_val);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                hb_print_constant(fort, (SubLObject)hierarchy_browser.T);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            hierarchy_browser.$hb_counter$.setDynamicValue(Numbers.add(hierarchy_browser.$hb_counter$.getDynamicValue(thread), (SubLObject)hierarchy_browser.ONE_INTEGER), thread);
            if (hierarchy_browser.NIL != hierarchy_browser.$hb_show_mts$.getDynamicValue(thread) && hierarchy_browser.NIL != superiors) {
                hb_print_pivot_mts(fort, superiors, amount, (SubLObject)hierarchy_browser.$kw240$INFERIOR);
            }
            hb_maybe_print_comments(fort);
        }
        finally {
            hierarchy_browser.$hb_eval_form$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 45568L)
    public static SubLObject hb_print_nodes_2(final SubLObject fort, final SubLObject max, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = hierarchy_browser.$hb_previous_term_id$.currentBinding(thread);
        try {
            hierarchy_browser.$hb_previous_term_id$.bind((hierarchy_browser.NIL != hierarchy_browser.$hb_previous_term_id$.getDynamicValue(thread)) ? hierarchy_browser.$hb_previous_term_id$.getDynamicValue(thread) : cb_utilities.cb_fort_identifier(hierarchy_browser.$hb_pivot_term$.getDynamicValue(thread)), thread);
            final SubLObject previous = cb_utilities.cb_guess_fort(hierarchy_browser.$hb_previous_term_id$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject id = (SubLObject)((hierarchy_browser.NIL != forts.valid_fortP(fort)) ? cb_utilities.cb_fort_identifier(fort) : hierarchy_browser.NIL);
            final SubLObject already_printedP = Hashtables.gethash(id, hierarchy_browser.$hb_duplicates_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject index = Numbers.multiply(depth, hierarchy_browser.$hb_indent_quantum$.getDynamicValue(thread));
            final SubLObject nodes = hb_get_nodes(fort, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject sorted_nodes = Sort.sort(nodes, Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym178$HB_STRING_FOR_CONSTANT));
            if (hierarchy_browser.NIL != id && (hierarchy_browser.NIL == max || depth.numL(max))) {
                html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_indent(index);
                Hashtables.sethash(id, hierarchy_browser.$hb_duplicates_table$.getDynamicValue(thread), (SubLObject)hierarchy_browser.T);
                hb_print_constant(fort, (SubLObject)hierarchy_browser.T);
                hierarchy_browser.$hb_counter$.setDynamicValue(Numbers.add(hierarchy_browser.$hb_counter$.getDynamicValue(thread), (SubLObject)hierarchy_browser.ONE_INTEGER), thread);
                if (hierarchy_browser.NIL != previous && hierarchy_browser.NIL != hierarchy_browser.$hb_show_mts$.getDynamicValue(thread)) {
                    hb_print_mt_list(fort, previous, (SubLObject)hierarchy_browser.$kw240$INFERIOR);
                }
                if (hierarchy_browser.NIL != already_printedP) {
                    if (hierarchy_browser.NIL != nodes) {
                        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_utilities.html_princ(hierarchy_browser.$hb_more_inferiors_sign$.getDynamicValue(thread));
                        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (hierarchy_browser.NIL != size_val) {
                            html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                            html_utilities.html_markup(size_val);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                            html_utilities.html_princ(hierarchy_browser.$hb_cycle_sign$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    else {
                        html_utilities.html_princ(hierarchy_browser.$hb_bottom_sign$.getDynamicValue(thread));
                    }
                }
                else if (max.isInteger() && depth.numLE(Numbers.subtract(max, (SubLObject)hierarchy_browser.ONE_INTEGER))) {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    if (hierarchy_browser.NIL != nodes) {
                        if (depth.numE(Numbers.subtract(max, (SubLObject)hierarchy_browser.ONE_INTEGER))) {
                            html_utilities.html_princ(hierarchy_browser.$hb_more_inferiors_sign$.getDynamicValue(thread));
                        }
                    }
                    else {
                        html_utilities.html_princ(hierarchy_browser.$hb_bottom_sign$.getDynamicValue(thread));
                    }
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                else if (hierarchy_browser.NIL == max && hierarchy_browser.NIL == nodes) {
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ(hierarchy_browser.$hb_bottom_sign$.getDynamicValue(thread));
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                hb_maybe_print_comments(fort);
                if (hierarchy_browser.NIL == already_printedP) {
                    SubLObject cdolist_list_var = sorted_nodes;
                    SubLObject node = (SubLObject)hierarchy_browser.NIL;
                    node = cdolist_list_var.first();
                    while (hierarchy_browser.NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0_$160 = hierarchy_browser.$hb_previous_term_id$.currentBinding(thread);
                        try {
                            hierarchy_browser.$hb_previous_term_id$.bind(id, thread);
                            hb_print_nodes_2(node, max, Numbers.add(depth, (SubLObject)hierarchy_browser.ONE_INTEGER));
                        }
                        finally {
                            hierarchy_browser.$hb_previous_term_id$.rebind(_prev_bind_0_$160, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        node = cdolist_list_var.first();
                    }
                }
            }
            else if (hierarchy_browser.NIL == max || depth.numL(max)) {
                html_utilities.html_newline((SubLObject)hierarchy_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                html_utilities.html_indent(index);
                cb_utilities.cb_form(fort, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject size_val = hierarchy_browser.$hb_small_font_size$.getDynamicValue(thread);
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (hierarchy_browser.NIL != size_val) {
                    html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                    html_utilities.html_markup(size_val);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$161 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                    html_utilities.html_princ((SubLObject)hierarchy_browser.$str249$__not_an_indexed_term_);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$161, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
            }
        }
        finally {
            hierarchy_browser.$hb_previous_term_id$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 47291L)
    public static SubLObject hb_display_inferiors(final SubLObject fort, final SubLObject depth, final SubLObject indent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_hb_duplicates_table();
        if (!hierarchy_browser.$hb_max_depth$.getDynamicValue(thread).equal((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
            final SubLObject id = cb_utilities.cb_fort_identifier(fort);
            final SubLObject nodes = hb_get_nodes(fort, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject sorted_nodes = Sort.sort(nodes, Symbols.symbol_function((SubLObject)hierarchy_browser.$sym134$STRING_LESSP), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym178$HB_STRING_FOR_CONSTANT));
            final SubLObject new_depth = (SubLObject)(depth.isInteger() ? Numbers.add(indent, depth) : hierarchy_browser.NIL);
            if (hierarchy_browser.NIL != sorted_nodes && !depth.equal((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
                SubLObject cdolist_list_var = sorted_nodes;
                SubLObject node = (SubLObject)hierarchy_browser.NIL;
                node = cdolist_list_var.first();
                while (hierarchy_browser.NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = hierarchy_browser.$hb_previous_term_id$.currentBinding(thread);
                    try {
                        hierarchy_browser.$hb_previous_term_id$.bind(id, thread);
                        hb_print_nodes_2(node, new_depth, indent);
                        html_utilities.html_flush();
                    }
                    finally {
                        hierarchy_browser.$hb_previous_term_id$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                }
            }
            else {
                html_utilities.html_br();
                html_utilities.html_br();
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)hierarchy_browser.$str250$No_inferior_terms);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
        }
        clear_hb_duplicates_table();
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 47967L)
    public static SubLObject hb_print_nodes_1(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!hierarchy_browser.$hb_indent_quantum$.getDynamicValue(thread).isInteger() || !hierarchy_browser.$hb_indent_quantum$.getDynamicValue(thread).numGE((SubLObject)hierarchy_browser.ZERO_INTEGER)) {
            hierarchy_browser.$hb_indent_quantum$.setDynamicValue((SubLObject)hierarchy_browser.TWO_INTEGER, thread);
        }
        hb_compute_allowable_depth(fort);
        SubLObject index = (SubLObject)hierarchy_browser.ONE_INTEGER;
        hb_construct_superior_paths(fort);
        hb_display_superiors();
        index = Numbers.add(hierarchy_browser.$hb_indent$.getDynamicValue(thread), (SubLObject)hierarchy_browser.ONE_INTEGER);
        hb_display_term(fort, index);
        index = Numbers.add(index, (SubLObject)hierarchy_browser.ONE_INTEGER);
        hb_display_inferiors(fort, hierarchy_browser.$hb_computed_max_depth$.getDynamicValue(thread), index);
        if (hierarchy_browser.$hb_counter$.getDynamicValue(thread).numG(hierarchy_browser.$hb_reset_parameter_notice_threshhold$.getDynamicValue(thread))) {
            html_utilities.html_br();
            html_utilities.html_br();
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_hash, (SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)hierarchy_browser.$str76$top);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
                html_utilities.html_princ((SubLObject)hierarchy_browser.$str251$Go_to_Top);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        hierarchy_browser.$hb_counter$.setDynamicValue((SubLObject)hierarchy_browser.ZERO_INTEGER, thread);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 48656L)
    public static SubLObject hb_compute_allowable_depth(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        hierarchy_browser.$hb_computed_max_depth$.setDynamicValue((SubLObject)hierarchy_browser.ZERO_INTEGER, thread);
        if (hierarchy_browser.$hb_max_depth$.getDynamicValue(thread).equal((SubLObject)hierarchy_browser.ONE_INTEGER)) {
            hierarchy_browser.$hb_computed_max_depth$.setDynamicValue((SubLObject)hierarchy_browser.ONE_INTEGER, thread);
        }
        else if (hierarchy_browser.NIL == hierarchy_browser.$hb_max_depth$.getDynamicValue(thread) && (!hierarchy_browser.$hb_max_inferiors$.getDynamicValue(thread).isInteger() || !hierarchy_browser.$hb_max_inferiors$.getDynamicValue(thread).numGE((SubLObject)hierarchy_browser.ZERO_INTEGER))) {
            hierarchy_browser.$hb_computed_max_depth$.setDynamicValue((SubLObject)hierarchy_browser.NIL, thread);
        }
        else if (hierarchy_browser.NIL == hierarchy_browser.$hb_max_depth$.getDynamicValue(thread)) {
            hierarchy_browser.$hb_computed_max_depth$.setDynamicValue(hierarchy_browser.$hb_max_depth$.getDynamicValue(thread), thread);
        }
        else {
            hierarchy_browser.$hb_counter$.setDynamicValue((SubLObject)hierarchy_browser.ZERO_INTEGER, thread);
            SubLObject level = (SubLObject)hierarchy_browser.ZERO_INTEGER;
            SubLObject last_count = (SubLObject)hierarchy_browser.ZERO_INTEGER;
            SubLObject nodes = (SubLObject)ConsesLow.list(fort);
            SubLObject temp = (SubLObject)hierarchy_browser.NIL;
            while (hierarchy_browser.NIL != nodes && (!hierarchy_browser.$hb_max_inferiors$.getDynamicValue(thread).isInteger() || !hierarchy_browser.$hb_counter$.getDynamicValue(thread).numG(hierarchy_browser.$hb_max_inferiors$.getDynamicValue(thread)) || !level.numG((SubLObject)hierarchy_browser.ONE_INTEGER)) && (!hierarchy_browser.$hb_max_depth$.getDynamicValue(thread).isInteger() || !level.numG(hierarchy_browser.$hb_max_depth$.getDynamicValue(thread)))) {
                SubLObject doneP = (SubLObject)hierarchy_browser.NIL;
                if (hierarchy_browser.NIL == doneP) {
                    SubLObject csome_list_var = nodes;
                    SubLObject node = (SubLObject)hierarchy_browser.NIL;
                    node = csome_list_var.first();
                    while (hierarchy_browser.NIL == doneP && hierarchy_browser.NIL != csome_list_var) {
                        final SubLObject new_nodes = hb_get_nodes(node, (SubLObject)hierarchy_browser.UNPROVIDED);
                        temp = ConsesLow.append(temp, new_nodes);
                        last_count = hierarchy_browser.$hb_counter$.getDynamicValue(thread);
                        hierarchy_browser.$hb_counter$.setDynamicValue(Numbers.add(hierarchy_browser.$hb_counter$.getDynamicValue(thread), Sequences.length(new_nodes)), thread);
                        if (hierarchy_browser.$hb_max_inferiors$.getDynamicValue(thread).isInteger() && hierarchy_browser.$hb_counter$.getDynamicValue(thread).numG(hierarchy_browser.$hb_max_inferiors$.getDynamicValue(thread))) {
                            doneP = (SubLObject)hierarchy_browser.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        node = csome_list_var.first();
                    }
                }
                nodes = temp;
                temp = (SubLObject)hierarchy_browser.NIL;
                level = Numbers.add(level, (SubLObject)hierarchy_browser.ONE_INTEGER);
                if (hierarchy_browser.NIL != hierarchy_browser.$hb_debug$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.$str252$____);
                    PrintLow.format((SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.$str253$____Level_finished___s, level);
                    PrintLow.format((SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.$str254$__);
                    PrintLow.format((SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.$str255$_______Total_count___s, hierarchy_browser.$hb_counter$.getDynamicValue(thread));
                }
            }
            hierarchy_browser.$hb_counter$.setDynamicValue(last_count, thread);
            hierarchy_browser.$hb_computed_max_depth$.setDynamicValue(Numbers.subtract(level, (SubLObject)hierarchy_browser.ONE_INTEGER), thread);
            if (hierarchy_browser.NIL != hierarchy_browser.$hb_debug$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.$str252$____);
                PrintLow.format((SubLObject)hierarchy_browser.T, (SubLObject)hierarchy_browser.$str256$Computed_max_depth___s, hierarchy_browser.$hb_computed_max_depth$.getDynamicValue(thread));
            }
        }
        hierarchy_browser.$hb_counter$.setDynamicValue((SubLObject)hierarchy_browser.ZERO_INTEGER, thread);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 50206L)
    public static SubLObject hb_start(SubLObject args) {
        if (args == hierarchy_browser.UNPROVIDED) {
            args = (SubLObject)hierarchy_browser.NIL;
        }
        hb_init();
        hb_parameters((SubLObject)hierarchy_browser.UNPROVIDED);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 50387L)
    public static SubLObject cb_link_hierarchy_browser(SubLObject linktext) {
        if (linktext == hierarchy_browser.UNPROVIDED) {
            linktext = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hierarchy_browser.NIL == linktext) {
            linktext = (SubLObject)hierarchy_browser.$str258$Hier;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)hierarchy_browser.$kw259$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)hierarchy_browser.$str260$hb_start);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        if (hierarchy_browser.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)hierarchy_browser.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)hierarchy_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)hierarchy_browser.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 50675L)
    public static SubLObject cb_hier_default(final SubLObject args) {
        SubLObject fort_spec = (SubLObject)hierarchy_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)hierarchy_browser.$list265);
        fort_spec = args.first();
        final SubLObject current = args.rest();
        if (hierarchy_browser.NIL == current) {
            SubLObject fort = (SubLObject)hierarchy_browser.NIL;
            fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)hierarchy_browser.UNPROVIDED);
            if (hierarchy_browser.NIL == forts.fort_p(fort)) {
                return cb_utilities.cb_error((SubLObject)hierarchy_browser.$str266$Could_not_determine_a_term_from__, fort_spec, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            cb_hier_default_internal(fort);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)hierarchy_browser.$list265);
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 50997L)
    public static SubLObject cb_hier_default_internal(final SubLObject fort) {
        hb_set_defaults_for_type(fort);
        return hb_print_nodes((SubLObject)hierarchy_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 51160L)
    public static SubLObject cb_hier(final SubLObject args) {
        SubLObject fort_spec = (SubLObject)hierarchy_browser.NIL;
        SubLObject arg_string = (SubLObject)hierarchy_browser.NIL;
        SubLObject pred_spec = (SubLObject)hierarchy_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)hierarchy_browser.$list268);
        fort_spec = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)hierarchy_browser.$list268);
        arg_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)hierarchy_browser.$list268);
        pred_spec = current.first();
        current = current.rest();
        final SubLObject mt_spec = (SubLObject)(current.isCons() ? current.first() : hierarchy_browser.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)hierarchy_browser.$list268);
        current = current.rest();
        if (hierarchy_browser.NIL == current) {
            SubLObject fort = (SubLObject)hierarchy_browser.NIL;
            SubLObject arg = (SubLObject)hierarchy_browser.NIL;
            SubLObject predicate = (SubLObject)hierarchy_browser.NIL;
            SubLObject mt = (SubLObject)hierarchy_browser.NIL;
            fort = cb_utilities.cb_guess_fort(fort_spec, (SubLObject)hierarchy_browser.UNPROVIDED);
            if (hierarchy_browser.NIL == forts.fort_p(fort)) {
                return cb_utilities.cb_error((SubLObject)hierarchy_browser.$str266$Could_not_determine_a_term_from__, fort_spec, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            arg = reader.read_from_string_ignoring_errors(arg_string, (SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.NIL, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            if (!arg.isFixnum()) {
                return cb_utilities.cb_error((SubLObject)hierarchy_browser.$str269$Could_not_determine_an_arg_from__, arg_string, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            predicate = cb_utilities.cb_guess_fort(pred_spec, (SubLObject)hierarchy_browser.UNPROVIDED);
            if (hierarchy_browser.NIL == forts.fort_p(predicate)) {
                return cb_utilities.cb_error((SubLObject)hierarchy_browser.$str266$Could_not_determine_a_term_from__, pred_spec, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
            }
            if (hierarchy_browser.NIL != mt_spec) {
                mt = cb_utilities.cb_guess_term(mt_spec, (SubLObject)hierarchy_browser.UNPROVIDED);
                if (hierarchy_browser.NIL == hlmt.hlmt_p(mt)) {
                    return cb_utilities.cb_error((SubLObject)hierarchy_browser.$str266$Could_not_determine_a_term_from__, mt_spec, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
                }
            }
            cb_hier_internal(fort, arg, predicate, mt);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)hierarchy_browser.$list268);
        }
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 52022L)
    public static SubLObject cb_hier_internal(final SubLObject fort, final SubLObject arg, final SubLObject predicate, SubLObject mt) {
        if (mt == hierarchy_browser.UNPROVIDED) {
            mt = (SubLObject)hierarchy_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_form = Sequences.find(predicate, hierarchy_browser.$hb_type_default_forms$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)hierarchy_browser.EQL), Symbols.symbol_function((SubLObject)hierarchy_browser.$sym271$SECOND), (SubLObject)hierarchy_browser.UNPROVIDED, (SubLObject)hierarchy_browser.UNPROVIDED);
        hierarchy_browser.$hb_pivot_term$.setDynamicValue(fort, thread);
        hierarchy_browser.$hb_predicate$.setDynamicValue(predicate, thread);
        hierarchy_browser.$hb_mt$.setDynamicValue((SubLObject)((hierarchy_browser.NIL != mt) ? mt : hierarchy_browser.$kw45$ALL), thread);
        if (hierarchy_browser.$hb_mt$.getDynamicValue(thread) != hierarchy_browser.$kw45$ALL) {
            hierarchy_browser.$hb_use_genl_mts$.setDynamicValue((SubLObject)hierarchy_browser.T, thread);
        }
        hierarchy_browser.$hb_index_argument$.setDynamicValue((hierarchy_browser.NIL != default_form) ? conses_high.third(default_form) : arg, thread);
        hierarchy_browser.$hb_gather_argument$.setDynamicValue((SubLObject)(hierarchy_browser.$hb_index_argument$.getDynamicValue(thread).numE((SubLObject)hierarchy_browser.ONE_INTEGER) ? hierarchy_browser.TWO_INTEGER : hierarchy_browser.ONE_INTEGER), thread);
        hierarchy_browser.$hb_max_height$.setDynamicValue((SubLObject)hierarchy_browser.TWO_INTEGER, thread);
        hierarchy_browser.$hb_max_depth$.setDynamicValue((SubLObject)hierarchy_browser.TWO_INTEGER, thread);
        return hb_print_nodes((SubLObject)hierarchy_browser.UNPROVIDED);
    }
    
    public static SubLObject declare_hierarchy_browser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_default_method_info", "HB-DEFAULT-METHOD-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_default_method_availableP", "HB-DEFAULT-METHOD-AVAILABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "set_default_hb_icon", "SET-DEFAULT-HB-ICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_debug", "HB-DEBUG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_no_debug", "HB-NO-DEBUG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_message", "HB-MESSAGE", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_show_parameters", "HB-SHOW-PARAMETERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_show_colors_and_symbols", "HB-SHOW-COLORS-AND-SYMBOLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "sorted_gaf_mts", "SORTED-GAF-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_parameters", "HB-PARAMETERS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_colors_and_symbols", "HB-COLORS-AND-SYMBOLS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_binary_predicateP", "HB-BINARY-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_handle_parameters", "HB-HANDLE-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_handle_colors_and_symbols", "HB-HANDLE-COLORS-AND-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_set_defaults_for_type", "HB-SET-DEFAULTS-FOR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_simple_choose_constants", "HB-SIMPLE-CHOOSE-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_handle_simple_choose_constants", "HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_choose_constants", "HB-CHOOSE-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_complex_choose_constants", "HB-COMPLEX-CHOOSE-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_handle_complex_choose_constants", "HB-HANDLE-COMPLEX-CHOOSE-CONSTANTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_select_node", "HB-SELECT-NODE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "set_hb_eval_form", "SET-HB-EVAL-FORM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_alternate_predicate", "HB-ALTERNATE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "set_hb_alternate_predicate", "SET-HB-ALTERNATE-PREDICATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_get_nodes", "HB-GET-NODES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_comments", "HB-COMMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_maybe_print_comments", "HB-MAYBE-PRINT-COMMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_string_for_constant", "HB-STRING-FOR-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_print_constant", "HB-PRINT-CONSTANT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_accessor", "HB-ACCESSOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_status_heading", "HB-STATUS-HEADING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "clear_hb_table", "CLEAR-HB-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "clear_hb_duplicates_table", "CLEAR-HB-DUPLICATES-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "clear_hb_superior_table", "CLEAR-HB-SUPERIOR-TABLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_init", "HB-INIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_bar", "HB-BAR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_print_nodes", "HB-PRINT-NODES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_construct_superior_paths", "HB-CONSTRUCT-SUPERIOR-PATHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_superior_table_count", "HB-SUPERIOR-TABLE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_construct_superior_paths_int", "HB-CONSTRUCT-SUPERIOR-PATHS-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_print_mt_list", "HB-PRINT-MT-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_print_pivot_mts", "HB-PRINT-PIVOT-MTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_display_superiors", "HB-DISPLAY-SUPERIORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "reset_hb_indent", "RESET-HB-INDENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_trace_superior_paths", "HB-TRACE-SUPERIOR-PATHS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_display_term", "HB-DISPLAY-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_print_nodes_2", "HB-PRINT-NODES-2", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_display_inferiors", "HB-DISPLAY-INFERIORS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_print_nodes_1", "HB-PRINT-NODES-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_compute_allowable_depth", "HB-COMPUTE-ALLOWABLE-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "hb_start", "HB-START", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "cb_link_hierarchy_browser", "CB-LINK-HIERARCHY-BROWSER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "cb_hier_default", "CB-HIER-DEFAULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "cb_hier_default_internal", "CB-HIER-DEFAULT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "cb_hier", "CB-HIER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hierarchy_browser", "cb_hier_internal", "CB-HIER-INTERNAL", 3, 1, false);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    public static SubLObject init_hierarchy_browser_file() {
        hierarchy_browser.$hb_type_default_forms$ = SubLFiles.defparameter("*HB-TYPE-DEFAULT-FORMS*", (SubLObject)hierarchy_browser.$list0);
        hierarchy_browser.$hb_alternate_predicates$ = SubLFiles.defparameter("*HB-ALTERNATE-PREDICATES*", (SubLObject)hierarchy_browser.$list1);
        hierarchy_browser.$hb_icon_choices$ = SubLFiles.defparameter("*HB-ICON-CHOICES*", (SubLObject)hierarchy_browser.$list9);
        hierarchy_browser.$hb_bar_choice$ = SubLFiles.defparameter("*HB-BAR-CHOICE*", (SubLObject)hierarchy_browser.$kw10$CELTIC_BAR);
        hierarchy_browser.$hb_previous_term_id$ = SubLFiles.defparameter("*HB-PREVIOUS-TERM-ID*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_icon$ = SubLFiles.defparameter("*HB-ICON*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_bar$ = SubLFiles.defparameter("*HB-BAR*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_top_sign$ = SubLFiles.defparameter("*HB-TOP-SIGN*", (SubLObject)hierarchy_browser.$str14$___);
        hierarchy_browser.$hb_bottom_sign$ = SubLFiles.defparameter("*HB-BOTTOM-SIGN*", (SubLObject)hierarchy_browser.$str16$___);
        hierarchy_browser.$hb_more_superiors_sign$ = SubLFiles.defparameter("*HB-MORE-SUPERIORS-SIGN*", (SubLObject)hierarchy_browser.$str18$____);
        hierarchy_browser.$hb_more_inferiors_sign$ = SubLFiles.defparameter("*HB-MORE-INFERIORS-SIGN*", (SubLObject)hierarchy_browser.$str20$____);
        hierarchy_browser.$hb_cycle_sign$ = SubLFiles.defparameter("*HB-CYCLE-SIGN*", (SubLObject)hierarchy_browser.$str22$__see_above_);
        hierarchy_browser.$hb_large_font_size$ = SubLFiles.defparameter("*HB-LARGE-FONT-SIZE*", (SubLObject)hierarchy_browser.FIVE_INTEGER);
        hierarchy_browser.$hb_small_font_size$ = SubLFiles.defparameter("*HB-SMALL-FONT-SIZE*", (SubLObject)hierarchy_browser.TWO_INTEGER);
        hierarchy_browser.$hb_tiny_font_size$ = SubLFiles.defparameter("*HB-TINY-FONT-SIZE*", (SubLObject)hierarchy_browser.ONE_INTEGER);
        hierarchy_browser.$hb_pivot_term$ = SubLFiles.defparameter("*HB-PIVOT-TERM*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_table$ = SubLFiles.defparameter("*HB-TABLE*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_superior_table$ = SubLFiles.defparameter("*HB-SUPERIOR-TABLE*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_duplicates_table$ = SubLFiles.defparameter("*HB-DUPLICATES-TABLE*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_indent_quantum$ = SubLFiles.defparameter("*HB-INDENT-QUANTUM*", (SubLObject)hierarchy_browser.THREE_INTEGER);
        hierarchy_browser.$hb_indent$ = SubLFiles.defparameter("*HB-INDENT*", (SubLObject)hierarchy_browser.ZERO_INTEGER);
        hierarchy_browser.$hb_counter$ = SubLFiles.defparameter("*HB-COUNTER*", (SubLObject)hierarchy_browser.ZERO_INTEGER);
        hierarchy_browser.$hb_reset_parameter_notice_threshhold$ = SubLFiles.defparameter("*HB-RESET-PARAMETER-NOTICE-THRESHHOLD*", (SubLObject)hierarchy_browser.TEN_INTEGER);
        hierarchy_browser.$hb_use_defaults_for_type$ = SubLFiles.defparameter("*HB-USE-DEFAULTS-FOR-TYPE*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_alternate_predicate$ = SubLFiles.defparameter("*HB-ALTERNATE-PREDICATE*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_use_lexicon$ = SubLFiles.defparameter("*HB-USE-LEXICON*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_computed_max_depth$ = SubLFiles.defparameter("*HB-COMPUTED-MAX-DEPTH*", (SubLObject)hierarchy_browser.ZERO_INTEGER);
        hierarchy_browser.$hb_max_depth$ = SubLFiles.defparameter("*HB-MAX-DEPTH*", (SubLObject)hierarchy_browser.FOUR_INTEGER);
        hierarchy_browser.$hb_max_height$ = SubLFiles.defparameter("*HB-MAX-HEIGHT*", (SubLObject)hierarchy_browser.FOUR_INTEGER);
        hierarchy_browser.$hb_max_inferiors$ = SubLFiles.defparameter("*HB-MAX-INFERIORS*", (SubLObject)hierarchy_browser.$int41$200);
        hierarchy_browser.$hb_show_comments$ = SubLFiles.defparameter("*HB-SHOW-COMMENTS*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_show_mts$ = SubLFiles.defparameter("*HB-SHOW-MTS*", (SubLObject)hierarchy_browser.T);
        hierarchy_browser.$hb_mt$ = SubLFiles.defparameter("*HB-MT*", (SubLObject)hierarchy_browser.$kw45$ALL);
        hierarchy_browser.$hb_predicate$ = SubLFiles.defparameter("*HB-PREDICATE*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_index_argument$ = SubLFiles.defparameter("*HB-INDEX-ARGUMENT*", (SubLObject)hierarchy_browser.TWO_INTEGER);
        hierarchy_browser.$hb_gather_argument$ = SubLFiles.defparameter("*HB-GATHER-ARGUMENT*", (SubLObject)hierarchy_browser.ONE_INTEGER);
        hierarchy_browser.$hb_use_genl_mts$ = SubLFiles.defparameter("*HB-USE-GENL-MTS*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_background_color$ = SubLFiles.defparameter("*HB-BACKGROUND-COLOR*", (SubLObject)hierarchy_browser.$kw51$LIGHT_GRAY);
        hierarchy_browser.$hb_message_color$ = SubLFiles.defparameter("*HB-MESSAGE-COLOR*", (SubLObject)hierarchy_browser.$kw53$RED);
        hierarchy_browser.$hb_message$ = SubLFiles.defparameter("*HB-MESSAGE*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_eval_form$ = SubLFiles.defparameter("*HB-EVAL-FORM*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_inverse_eval_form$ = SubLFiles.defparameter("*HB-INVERSE-EVAL-FORM*", (SubLObject)hierarchy_browser.NIL);
        hierarchy_browser.$hb_debug$ = SubLFiles.defparameter("*HB-DEBUG*", (SubLObject)hierarchy_browser.NIL);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    public static SubLObject setup_hierarchy_browser_file() {
        Hashtables.sethash((SubLObject)hierarchy_browser.$kw2$YELLOW_STAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)hierarchy_browser.$str3$star_gif, (SubLObject)hierarchy_browser.$str4$_));
        Hashtables.sethash((SubLObject)hierarchy_browser.$kw5$GREEN_STAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)hierarchy_browser.$str6$grnstar_gif, (SubLObject)hierarchy_browser.$str4$_));
        Hashtables.sethash((SubLObject)hierarchy_browser.$kw7$CYAN_STAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)hierarchy_browser.$str8$cyanstar_gif, (SubLObject)hierarchy_browser.$str4$_));
        Hashtables.sethash((SubLObject)hierarchy_browser.$kw10$CELTIC_BAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)hierarchy_browser.$str11$celtic_bar_gif, (SubLObject)hierarchy_browser.NIL));
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym12$_HB_ICON_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym12$_HB_ICON_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym13$_HB_BAR_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym13$_HB_BAR_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym15$_HB_TOP_SIGN_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym15$_HB_TOP_SIGN_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym17$_HB_BOTTOM_SIGN_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym17$_HB_BOTTOM_SIGN_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym19$_HB_MORE_SUPERIORS_SIGN_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym19$_HB_MORE_SUPERIORS_SIGN_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym21$_HB_MORE_INFERIORS_SIGN_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym21$_HB_MORE_INFERIORS_SIGN_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym23$_HB_CYCLE_SIGN_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym23$_HB_CYCLE_SIGN_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym24$_HB_LARGE_FONT_SIZE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym25$_HB_SMALL_FONT_SIZE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym26$_HB_TINY_FONT_SIZE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym27$_HB_PIVOT_TERM_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym28$_HB_TABLE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym29$_HB_SUPERIOR_TABLE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym30$_HB_DUPLICATES_TABLE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym31$_HB_INDENT_QUANTUM_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym31$_HB_INDENT_QUANTUM_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym32$_HB_INDENT_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym33$_HB_COUNTER_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym34$_HB_RESET_PARAMETER_NOTICE_THRESHHOLD_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym35$_HB_USE_DEFAULTS_FOR_TYPE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym36$_HB_ALTERNATE_PREDICATE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym37$_HB_USE_LEXICON_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym37$_HB_USE_LEXICON_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym38$_HB_COMPUTED_MAX_DEPTH_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym39$_HB_MAX_DEPTH_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym39$_HB_MAX_DEPTH_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym40$_HB_MAX_HEIGHT_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym40$_HB_MAX_HEIGHT_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym42$_HB_MAX_INFERIORS_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym42$_HB_MAX_INFERIORS_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym43$_HB_SHOW_COMMENTS_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym43$_HB_SHOW_COMMENTS_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym44$_HB_SHOW_MTS_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym44$_HB_SHOW_MTS_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym46$_HB_MT_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym46$_HB_MT_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym47$_HB_PREDICATE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym48$_HB_INDEX_ARGUMENT_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym48$_HB_INDEX_ARGUMENT_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym49$_HB_GATHER_ARGUMENT_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym50$_HB_USE_GENL_MTS_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym50$_HB_USE_GENL_MTS_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym52$_HB_BACKGROUND_COLOR_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym52$_HB_BACKGROUND_COLOR_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym54$_HB_MESSAGE_COLOR_);
        utilities_macros.register_html_interface_variable((SubLObject)hierarchy_browser.$sym54$_HB_MESSAGE_COLOR_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym55$_HB_MESSAGE_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym56$_HB_EVAL_FORM_);
        utilities_macros.register_html_state_variable((SubLObject)hierarchy_browser.$sym57$_HB_INVERSE_EVAL_FORM_);
        Hashtables.sethash((SubLObject)hierarchy_browser.$kw136$HB_PARAMETERS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)hierarchy_browser.$str137$hb_parameters_html, (SubLObject)hierarchy_browser.NIL));
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym147$HB_PARAMETERS, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym153$HB_COLORS_AND_SYMBOLS, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym170$HB_HANDLE_PARAMETERS, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym174$HB_HANDLE_COLORS_AND_SYMBOLS, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym189$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym200$HB_HANDLE_COMPLEX_CHOOSE_CONSTANTS, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym201$HB_SELECT_NODE, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        Hashtables.sethash((SubLObject)hierarchy_browser.$kw231$HB_PRINT_NODES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)hierarchy_browser.$str232$hb_print_nodes_html, (SubLObject)hierarchy_browser.NIL));
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym238$HB_PRINT_NODES, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym257$HB_START, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)hierarchy_browser.$kw261$HIERARCHY_BROWSER, (SubLObject)hierarchy_browser.$sym262$CB_LINK_HIERARCHY_BROWSER, (SubLObject)hierarchy_browser.ONE_INTEGER);
        cb_utilities.declare_cb_tool((SubLObject)hierarchy_browser.$kw261$HIERARCHY_BROWSER, (SubLObject)hierarchy_browser.$str263$Hierarchy_Browser, (SubLObject)hierarchy_browser.$str258$Hier, (SubLObject)hierarchy_browser.$str264$The_Hierarchy_Browser);
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym267$CB_HIER_DEFAULT, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)hierarchy_browser.$sym270$CB_HIER, (SubLObject)hierarchy_browser.$kw148$HTML_HANDLER);
        return (SubLObject)hierarchy_browser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_hierarchy_browser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_hierarchy_browser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_hierarchy_browser_file();
    }
    
    static {
        me = (SubLFile)new hierarchy_browser();
        hierarchy_browser.$hb_type_default_forms$ = null;
        hierarchy_browser.$hb_alternate_predicates$ = null;
        hierarchy_browser.$hb_icon_choices$ = null;
        hierarchy_browser.$hb_bar_choice$ = null;
        hierarchy_browser.$hb_previous_term_id$ = null;
        hierarchy_browser.$hb_icon$ = null;
        hierarchy_browser.$hb_bar$ = null;
        hierarchy_browser.$hb_top_sign$ = null;
        hierarchy_browser.$hb_bottom_sign$ = null;
        hierarchy_browser.$hb_more_superiors_sign$ = null;
        hierarchy_browser.$hb_more_inferiors_sign$ = null;
        hierarchy_browser.$hb_cycle_sign$ = null;
        hierarchy_browser.$hb_large_font_size$ = null;
        hierarchy_browser.$hb_small_font_size$ = null;
        hierarchy_browser.$hb_tiny_font_size$ = null;
        hierarchy_browser.$hb_pivot_term$ = null;
        hierarchy_browser.$hb_table$ = null;
        hierarchy_browser.$hb_superior_table$ = null;
        hierarchy_browser.$hb_duplicates_table$ = null;
        hierarchy_browser.$hb_indent_quantum$ = null;
        hierarchy_browser.$hb_indent$ = null;
        hierarchy_browser.$hb_counter$ = null;
        hierarchy_browser.$hb_reset_parameter_notice_threshhold$ = null;
        hierarchy_browser.$hb_use_defaults_for_type$ = null;
        hierarchy_browser.$hb_alternate_predicate$ = null;
        hierarchy_browser.$hb_use_lexicon$ = null;
        hierarchy_browser.$hb_computed_max_depth$ = null;
        hierarchy_browser.$hb_max_depth$ = null;
        hierarchy_browser.$hb_max_height$ = null;
        hierarchy_browser.$hb_max_inferiors$ = null;
        hierarchy_browser.$hb_show_comments$ = null;
        hierarchy_browser.$hb_show_mts$ = null;
        hierarchy_browser.$hb_mt$ = null;
        hierarchy_browser.$hb_predicate$ = null;
        hierarchy_browser.$hb_index_argument$ = null;
        hierarchy_browser.$hb_gather_argument$ = null;
        hierarchy_browser.$hb_use_genl_mts$ = null;
        hierarchy_browser.$hb_background_color$ = null;
        hierarchy_browser.$hb_message_color$ = null;
        hierarchy_browser.$hb_message$ = null;
        hierarchy_browser.$hb_eval_form$ = null;
        hierarchy_browser.$hb_inverse_eval_form$ = null;
        hierarchy_browser.$hb_debug$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)hierarchy_browser.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.FIVE_INTEGER, (SubLObject)hierarchy_browser.FIVE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)hierarchy_browser.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeographicalRegion")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geographicalSubRegions")), (SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)hierarchy_browser.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDenotingFunction")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlFuncs")), (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.FIVE_INTEGER, (SubLObject)hierarchy_browser.FIVE_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScientificFieldOfStudy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subFields")), (SubLObject)hierarchy_browser.ONE_INTEGER, (SubLObject)hierarchy_browser.TWO_INTEGER, (SubLObject)hierarchy_browser.FIVE_INTEGER, (SubLObject)hierarchy_browser.FIVE_INTEGER));
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"))));
        $kw2$YELLOW_STAR = SubLObjectFactory.makeKeyword("YELLOW-STAR");
        $str3$star_gif = SubLObjectFactory.makeString("star.gif");
        $str4$_ = SubLObjectFactory.makeString("*");
        $kw5$GREEN_STAR = SubLObjectFactory.makeKeyword("GREEN-STAR");
        $str6$grnstar_gif = SubLObjectFactory.makeString("grnstar.gif");
        $kw7$CYAN_STAR = SubLObjectFactory.makeKeyword("CYAN-STAR");
        $str8$cyanstar_gif = SubLObjectFactory.makeString("cyanstar.gif");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("*"), (SubLObject)SubLObjectFactory.makeKeyword("RED-DIAMOND"), (SubLObject)SubLObjectFactory.makeKeyword("YELLOW-STAR"), (SubLObject)SubLObjectFactory.makeKeyword("GREEN-STAR"), (SubLObject)SubLObjectFactory.makeKeyword("CYAN-STAR"));
        $kw10$CELTIC_BAR = SubLObjectFactory.makeKeyword("CELTIC-BAR");
        $str11$celtic_bar_gif = SubLObjectFactory.makeString("celtic_bar.gif");
        $sym12$_HB_ICON_ = SubLObjectFactory.makeSymbol("*HB-ICON*");
        $sym13$_HB_BAR_ = SubLObjectFactory.makeSymbol("*HB-BAR*");
        $str14$___ = SubLObjectFactory.makeString("-> ");
        $sym15$_HB_TOP_SIGN_ = SubLObjectFactory.makeSymbol("*HB-TOP-SIGN*");
        $str16$___ = SubLObjectFactory.makeString(" <-");
        $sym17$_HB_BOTTOM_SIGN_ = SubLObjectFactory.makeSymbol("*HB-BOTTOM-SIGN*");
        $str18$____ = SubLObjectFactory.makeString("... ");
        $sym19$_HB_MORE_SUPERIORS_SIGN_ = SubLObjectFactory.makeSymbol("*HB-MORE-SUPERIORS-SIGN*");
        $str20$____ = SubLObjectFactory.makeString(" ...");
        $sym21$_HB_MORE_INFERIORS_SIGN_ = SubLObjectFactory.makeSymbol("*HB-MORE-INFERIORS-SIGN*");
        $str22$__see_above_ = SubLObjectFactory.makeString(" *see above*");
        $sym23$_HB_CYCLE_SIGN_ = SubLObjectFactory.makeSymbol("*HB-CYCLE-SIGN*");
        $sym24$_HB_LARGE_FONT_SIZE_ = SubLObjectFactory.makeSymbol("*HB-LARGE-FONT-SIZE*");
        $sym25$_HB_SMALL_FONT_SIZE_ = SubLObjectFactory.makeSymbol("*HB-SMALL-FONT-SIZE*");
        $sym26$_HB_TINY_FONT_SIZE_ = SubLObjectFactory.makeSymbol("*HB-TINY-FONT-SIZE*");
        $sym27$_HB_PIVOT_TERM_ = SubLObjectFactory.makeSymbol("*HB-PIVOT-TERM*");
        $sym28$_HB_TABLE_ = SubLObjectFactory.makeSymbol("*HB-TABLE*");
        $sym29$_HB_SUPERIOR_TABLE_ = SubLObjectFactory.makeSymbol("*HB-SUPERIOR-TABLE*");
        $sym30$_HB_DUPLICATES_TABLE_ = SubLObjectFactory.makeSymbol("*HB-DUPLICATES-TABLE*");
        $sym31$_HB_INDENT_QUANTUM_ = SubLObjectFactory.makeSymbol("*HB-INDENT-QUANTUM*");
        $sym32$_HB_INDENT_ = SubLObjectFactory.makeSymbol("*HB-INDENT*");
        $sym33$_HB_COUNTER_ = SubLObjectFactory.makeSymbol("*HB-COUNTER*");
        $sym34$_HB_RESET_PARAMETER_NOTICE_THRESHHOLD_ = SubLObjectFactory.makeSymbol("*HB-RESET-PARAMETER-NOTICE-THRESHHOLD*");
        $sym35$_HB_USE_DEFAULTS_FOR_TYPE_ = SubLObjectFactory.makeSymbol("*HB-USE-DEFAULTS-FOR-TYPE*");
        $sym36$_HB_ALTERNATE_PREDICATE_ = SubLObjectFactory.makeSymbol("*HB-ALTERNATE-PREDICATE*");
        $sym37$_HB_USE_LEXICON_ = SubLObjectFactory.makeSymbol("*HB-USE-LEXICON*");
        $sym38$_HB_COMPUTED_MAX_DEPTH_ = SubLObjectFactory.makeSymbol("*HB-COMPUTED-MAX-DEPTH*");
        $sym39$_HB_MAX_DEPTH_ = SubLObjectFactory.makeSymbol("*HB-MAX-DEPTH*");
        $sym40$_HB_MAX_HEIGHT_ = SubLObjectFactory.makeSymbol("*HB-MAX-HEIGHT*");
        $int41$200 = SubLObjectFactory.makeInteger(200);
        $sym42$_HB_MAX_INFERIORS_ = SubLObjectFactory.makeSymbol("*HB-MAX-INFERIORS*");
        $sym43$_HB_SHOW_COMMENTS_ = SubLObjectFactory.makeSymbol("*HB-SHOW-COMMENTS*");
        $sym44$_HB_SHOW_MTS_ = SubLObjectFactory.makeSymbol("*HB-SHOW-MTS*");
        $kw45$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym46$_HB_MT_ = SubLObjectFactory.makeSymbol("*HB-MT*");
        $sym47$_HB_PREDICATE_ = SubLObjectFactory.makeSymbol("*HB-PREDICATE*");
        $sym48$_HB_INDEX_ARGUMENT_ = SubLObjectFactory.makeSymbol("*HB-INDEX-ARGUMENT*");
        $sym49$_HB_GATHER_ARGUMENT_ = SubLObjectFactory.makeSymbol("*HB-GATHER-ARGUMENT*");
        $sym50$_HB_USE_GENL_MTS_ = SubLObjectFactory.makeSymbol("*HB-USE-GENL-MTS*");
        $kw51$LIGHT_GRAY = SubLObjectFactory.makeKeyword("LIGHT-GRAY");
        $sym52$_HB_BACKGROUND_COLOR_ = SubLObjectFactory.makeSymbol("*HB-BACKGROUND-COLOR*");
        $kw53$RED = SubLObjectFactory.makeKeyword("RED");
        $sym54$_HB_MESSAGE_COLOR_ = SubLObjectFactory.makeSymbol("*HB-MESSAGE-COLOR*");
        $sym55$_HB_MESSAGE_ = SubLObjectFactory.makeSymbol("*HB-MESSAGE*");
        $sym56$_HB_EVAL_FORM_ = SubLObjectFactory.makeSymbol("*HB-EVAL-FORM*");
        $sym57$_HB_INVERSE_EVAL_FORM_ = SubLObjectFactory.makeSymbol("*HB-INVERSE-EVAL-FORM*");
        $sym58$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const59$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw60$RED_DIAMOND = SubLObjectFactory.makeKeyword("RED-DIAMOND");
        $str61$ = SubLObjectFactory.makeString("");
        $str62$Starting_Term = SubLObjectFactory.makeString("Starting Term");
        $str63$Current_Term__ = SubLObjectFactory.makeString("Current Term: ");
        $str64$_2 = SubLObjectFactory.makeString("+2");
        $str65$None = SubLObjectFactory.makeString("None");
        $str66$cur_term = SubLObjectFactory.makeString("cur-term");
        $str67$Change_Term__ = SubLObjectFactory.makeString("Change Term: ");
        $str68$new_term = SubLObjectFactory.makeString("new-term");
        $str69$Complete = SubLObjectFactory.makeString("Complete");
        $int70$25 = SubLObjectFactory.makeInteger(25);
        $str71$defaults_for_type = SubLObjectFactory.makeString("defaults-for-type");
        $str72$_Use_default_settings_for_term = SubLObjectFactory.makeString(" Use default settings for term");
        $kw73$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str74$Specify_Non_Default_Settings = SubLObjectFactory.makeString("Specify Non-Default Settings");
        $str75$middle = SubLObjectFactory.makeString("middle");
        $str76$top = SubLObjectFactory.makeString("top");
        $str77$Binary_Predicate = SubLObjectFactory.makeString("Binary Predicate");
        $str78$pred = SubLObjectFactory.makeString("pred");
        $const79$BinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"));
        $str80$Index_Argument = SubLObjectFactory.makeString("Index Argument");
        $str81$index = SubLObjectFactory.makeString("index");
        $str82$_1 = SubLObjectFactory.makeString(" 1");
        $str83$_2 = SubLObjectFactory.makeString(" 2");
        $str84$Microtheory = SubLObjectFactory.makeString("Microtheory");
        $str85$mt = SubLObjectFactory.makeString("mt");
        $const86$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $str87$genl_mts = SubLObjectFactory.makeString("genl-mts");
        $str88$_Use_its_genl_mts_too__if_possibl = SubLObjectFactory.makeString(" Use its genl mts too, if possible");
        $str89$all_mts = SubLObjectFactory.makeString("all-mts");
        $str90$_Use_all_mts = SubLObjectFactory.makeString(" Use all mts");
        $str91$Height_and_Depth = SubLObjectFactory.makeString("Height and Depth");
        $str92$right = SubLObjectFactory.makeString("right");
        $str93$Max_height__ = SubLObjectFactory.makeString("Max height: ");
        $str94$height = SubLObjectFactory.makeString("height");
        $sym95$ALL = SubLObjectFactory.makeSymbol("ALL");
        $sym96$NONE = SubLObjectFactory.makeSymbol("NONE");
        $list97 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NONE"), hierarchy_browser.ONE_INTEGER, hierarchy_browser.TWO_INTEGER, hierarchy_browser.THREE_INTEGER, hierarchy_browser.FOUR_INTEGER, hierarchy_browser.FIVE_INTEGER, hierarchy_browser.SIX_INTEGER, hierarchy_browser.SEVEN_INTEGER, hierarchy_browser.EIGHT_INTEGER, hierarchy_browser.NINE_INTEGER, SubLObjectFactory.makeSymbol("ALL") });
        $str98$Max_depth__ = SubLObjectFactory.makeString("Max depth: ");
        $str99$depth = SubLObjectFactory.makeString("depth");
        $str100$Max_inferior_terms__ = SubLObjectFactory.makeString("Max inferior terms: ");
        $str101$inferior = SubLObjectFactory.makeString("inferior");
        $str102$Extras = SubLObjectFactory.makeString("Extras");
        $str103$lex = SubLObjectFactory.makeString("lex");
        $str104$_Use_lexicon_entries__if_possible = SubLObjectFactory.makeString(" Use lexicon entries, if possible");
        $str105$comments = SubLObjectFactory.makeString("comments");
        $str106$_Show_comments_for_terms = SubLObjectFactory.makeString(" Show comments for terms");
        $str107$mts_after = SubLObjectFactory.makeString("mts-after");
        $str108$_Show_assertion_s_mts_after_terms = SubLObjectFactory.makeString(" Show assertion's mts after terms");
        $str109$Indent_quantum__ = SubLObjectFactory.makeString("Indent quantum: ");
        $str110$quantum = SubLObjectFactory.makeString("quantum");
        $kw111$HB_COLORS_AND_SYMBOLS = SubLObjectFactory.makeKeyword("HB-COLORS-AND-SYMBOLS");
        $str112$bg_color = SubLObjectFactory.makeString("bg-color");
        $str113$__ = SubLObjectFactory.makeString(": ");
        $str114$The_background_color_for_Hierarch = SubLObjectFactory.makeString("The background color for Hierarchy Browser pages");
        $str115$msg_color = SubLObjectFactory.makeString("msg-color");
        $str116$The_color_for_Hierarchy_Browser_a = SubLObjectFactory.makeString("The color for Hierarchy Browser alert messages");
        $str117$hb_icon = SubLObjectFactory.makeString("hb-icon");
        $str118$The_hierarchical_display_link_ico = SubLObjectFactory.makeString("The hierarchical display link icon, currently ");
        $str119$hb_bar = SubLObjectFactory.makeString("hb-bar");
        $str120$___ = SubLObjectFactory.makeString(" : ");
        $str121$Use_decorative_separator_bar = SubLObjectFactory.makeString("Use decorative separator bar");
        $str122$hb_top_sign = SubLObjectFactory.makeString("hb-top-sign");
        $str123$__term_ = SubLObjectFactory.makeString(" <term>");
        $str124$Indicates_that__term__has_no_supe = SubLObjectFactory.makeString("Indicates that <term> has no superiors");
        $str125$_term__ = SubLObjectFactory.makeString("<term> ");
        $str126$hb_bottom_sign = SubLObjectFactory.makeString("hb-bottom-sign");
        $str127$Indicates_that__term__has_no_infe = SubLObjectFactory.makeString("Indicates that <term> has no inferiors");
        $str128$superiors_sign = SubLObjectFactory.makeString("superiors-sign");
        $str129$Indicates_that__term__has_more_un = SubLObjectFactory.makeString("Indicates that <term> has more undisplayed superiors");
        $str130$inferiors_sign = SubLObjectFactory.makeString("inferiors-sign");
        $str131$Indicates_that__term__has_more_un = SubLObjectFactory.makeString("Indicates that <term> has more undisplayed inferiors");
        $str132$cycle_sign = SubLObjectFactory.makeString("cycle-sign");
        $str133$Indicates_that_a_sequence_of_term = SubLObjectFactory.makeString("Indicates that a sequence of terms beginning with <term> has already been displayed");
        $sym134$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym135$COERCE_NAME = SubLObjectFactory.makeSymbol("COERCE-NAME");
        $kw136$HB_PARAMETERS = SubLObjectFactory.makeKeyword("HB-PARAMETERS");
        $str137$hb_parameters_html = SubLObjectFactory.makeString("hb-parameters.html");
        $str138$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str139$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw140$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw141$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str142$Cyc_Hierarchy_Browser = SubLObjectFactory.makeString("Cyc Hierarchy Browser");
        $str143$post = SubLObjectFactory.makeString("post");
        $str144$hb_handle_parameters = SubLObjectFactory.makeString("hb-handle-parameters");
        $str145$Current_Settings = SubLObjectFactory.makeString("Current Settings");
        $str146$Display_Hierarchy = SubLObjectFactory.makeString("Display Hierarchy");
        $sym147$HB_PARAMETERS = SubLObjectFactory.makeSymbol("HB-PARAMETERS");
        $kw148$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str149$HB_Colors_and_Symbols = SubLObjectFactory.makeString("HB Colors and Symbols");
        $str150$Hierarchy_Browser_Colors_and_Symb = SubLObjectFactory.makeString("Hierarchy Browser Colors and Symbols");
        $str151$hb_handle_colors_and_symbols = SubLObjectFactory.makeString("hb-handle-colors-and-symbols");
        $str152$Update = SubLObjectFactory.makeString("Update");
        $sym153$HB_COLORS_AND_SYMBOLS = SubLObjectFactory.makeSymbol("HB-COLORS-AND-SYMBOLS");
        $str154$term = SubLObjectFactory.makeString("term");
        $sym155$VALID_TIMESTRING_CHAR_ = SubLObjectFactory.makeSymbol("VALID-TIMESTRING-CHAR?");
        $sym156$VALID_FORT_ = SubLObjectFactory.makeSymbol("VALID-FORT?");
        $list157 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("all"), (SubLObject)SubLObjectFactory.makeString(":all"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeSymbol("ALL"));
        $sym158$MT_ = SubLObjectFactory.makeSymbol("MT?");
        $sym159$HB_BINARY_PREDICATE_ = SubLObjectFactory.makeSymbol("HB-BINARY-PREDICATE?");
        $str160$2 = SubLObjectFactory.makeString("2");
        $int161$50 = SubLObjectFactory.makeInteger(50);
        $kw162$TERM = SubLObjectFactory.makeKeyword("TERM");
        $const163$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $kw164$PRED = SubLObjectFactory.makeKeyword("PRED");
        $kw165$MT = SubLObjectFactory.makeKeyword("MT");
        $str166$The_input__s_did_not_yield_a_vali = SubLObjectFactory.makeString("The input ~s did not yield a valid constant.");
        $str167$The_input__s_did_not_yield_a_vali = SubLObjectFactory.makeString("The input ~s did not yield a valid predicate.");
        $str168$The_input__s_did_not_yield_a_vali = SubLObjectFactory.makeString("The input ~s did not yield a valid microtheory.");
        $str169$Parameters_updated_at__a_on__a = SubLObjectFactory.makeString("Parameters updated at ~a on ~a");
        $sym170$HB_HANDLE_PARAMETERS = SubLObjectFactory.makeSymbol("HB-HANDLE-PARAMETERS");
        $kw171$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw172$BLACK = SubLObjectFactory.makeKeyword("BLACK");
        $str173$Colors_and_symbols_updated_at__a_ = SubLObjectFactory.makeString("Colors and symbols updated at ~a on ~a");
        $sym174$HB_HANDLE_COLORS_AND_SYMBOLS = SubLObjectFactory.makeSymbol("HB-HANDLE-COLORS-AND-SYMBOLS");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER"), (SubLObject)SubLObjectFactory.makeSymbol("HEIGHT"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $str176$Using_default_settings_for_instan = SubLObjectFactory.makeString("Using default settings for instances of ~a.");
        $str177$No_default_display_parameters_are = SubLObjectFactory.makeString("No default display parameters are defined for the term `~a'.");
        $sym178$HB_STRING_FOR_CONSTANT = SubLObjectFactory.makeSymbol("HB-STRING-FOR-CONSTANT");
        $str179$predicate = SubLObjectFactory.makeString("predicate");
        $str180$microtheory = SubLObjectFactory.makeString("microtheory");
        $str181$microtheories = SubLObjectFactory.makeString("microtheories");
        $str182$_as = SubLObjectFactory.makeString("~as");
        $str183$Choose_Constants__Simple_Version = SubLObjectFactory.makeString("Choose Constants: Simple Version");
        $str184$Choose_a__a = SubLObjectFactory.makeString("Choose a ~a");
        $str185$Please_choose_one_of_the_followin = SubLObjectFactory.makeString("Please choose one of the following ~a:");
        $str186$left = SubLObjectFactory.makeString("left");
        $kw187$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS = SubLObjectFactory.makeKeyword("HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS");
        $kw188$SELF = SubLObjectFactory.makeKeyword("SELF");
        $sym189$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS = SubLObjectFactory.makeSymbol("HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS");
        $str190$Choose_Constants__Complex_Version = SubLObjectFactory.makeString("Choose Constants: Complex Version");
        $str191$Resolve_Ambiguous_Input = SubLObjectFactory.makeString("Resolve Ambiguous Input");
        $str192$hb_handle_complex_choose_constant = SubLObjectFactory.makeString("hb-handle-complex-choose-constants");
        $str193$Go = SubLObjectFactory.makeString("Go");
        $str194$Please_select_one_term_from_each_ = SubLObjectFactory.makeString("Please select one term from each category below:");
        $str195$Terms = SubLObjectFactory.makeString("Terms");
        $str196$Predicates = SubLObjectFactory.makeString("Predicates");
        $str197$Microtheories = SubLObjectFactory.makeString("Microtheories");
        $str198$_a = SubLObjectFactory.makeString("~a");
        $str199$_ = SubLObjectFactory.makeString(" ");
        $sym200$HB_HANDLE_COMPLEX_CHOOSE_CONSTANTS = SubLObjectFactory.makeSymbol("HB-HANDLE-COMPLEX-CHOOSE-CONSTANTS");
        $sym201$HB_SELECT_NODE = SubLObjectFactory.makeSymbol("HB-SELECT-NODE");
        $sym202$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $const203$comment = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comment"));
        $sym204$NAME_OF_CAR = SubLObjectFactory.makeSymbol("NAME-OF-CAR");
        $kw205$HB_SELECT_NODE_TEXT = SubLObjectFactory.makeKeyword("HB-SELECT-NODE-TEXT");
        $kw206$HB_SELECT_NODE_IMAGE = SubLObjectFactory.makeKeyword("HB-SELECT-NODE-IMAGE");
        $sym207$CB_CF = SubLObjectFactory.makeSymbol("CB-CF");
        $kw208$ISA = SubLObjectFactory.makeKeyword("ISA");
        $sym209$MIN_ISA = SubLObjectFactory.makeSymbol("MIN-ISA");
        $kw210$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $sym211$MIN_GENLS = SubLObjectFactory.makeSymbol("MIN-GENLS");
        $kw212$ALL_ISA = SubLObjectFactory.makeKeyword("ALL-ISA");
        $sym213$ALL_ISA = SubLObjectFactory.makeSymbol("ALL-ISA");
        $kw214$ALL_GENLS = SubLObjectFactory.makeKeyword("ALL-GENLS");
        $sym215$ALL_GENLS = SubLObjectFactory.makeSymbol("ALL-GENLS");
        $sym216$LIST = SubLObjectFactory.makeSymbol("LIST");
        $const217$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str218$__ = SubLObjectFactory.makeString(", ");
        $const219$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const220$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str221$Context__ = SubLObjectFactory.makeString("Context: ");
        $str222$Union_of_all_contexts = SubLObjectFactory.makeString("Union of all contexts");
        $str223$_and_its_ = SubLObjectFactory.makeString(" and its ");
        $const224$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $str225$s = SubLObjectFactory.makeString("s");
        $str226$Unknown_ = SubLObjectFactory.makeString("Unknown!");
        $str227$Predicate__ = SubLObjectFactory.makeString("Predicate: ");
        $str228$Index__ = SubLObjectFactory.makeString("Index: ");
        $int229$100 = SubLObjectFactory.makeInteger(100);
        $str230$__________ = SubLObjectFactory.makeString("----------");
        $kw231$HB_PRINT_NODES = SubLObjectFactory.makeKeyword("HB-PRINT-NODES");
        $str232$hb_print_nodes_html = SubLObjectFactory.makeString("hb-print-nodes.html");
        $str233$Hierarchical_Display___a = SubLObjectFactory.makeString("Hierarchical Display: ~a");
        $sym234$HIERARCHY_DEFAULT = SubLObjectFactory.makeSymbol("HIERARCHY-DEFAULT");
        $str235$hb_parameters = SubLObjectFactory.makeString("hb-parameters");
        $str236$Change_Hierarchy_Browser_Settings = SubLObjectFactory.makeString("Change Hierarchy Browser Settings");
        $str237$_a_is_not_a_valid_constant_ = SubLObjectFactory.makeString("~a is not a valid constant.");
        $sym238$HB_PRINT_NODES = SubLObjectFactory.makeSymbol("HB-PRINT-NODES");
        $kw239$SUPERIOR = SubLObjectFactory.makeKeyword("SUPERIOR");
        $kw240$INFERIOR = SubLObjectFactory.makeKeyword("INFERIOR");
        $str241$__ = SubLObjectFactory.makeString(" [");
        $str242$_ = SubLObjectFactory.makeString("]");
        $str243$_ = SubLObjectFactory.makeString("[");
        $str244$_____ = SubLObjectFactory.makeString(" -> (");
        $str245$__ = SubLObjectFactory.makeString(")]");
        $str246$_Unknown__ = SubLObjectFactory.makeString("[Unknown!]");
        $sym247$STRING_ = SubLObjectFactory.makeSymbol("STRING<");
        $str248$No_superior_terms = SubLObjectFactory.makeString("No superior terms");
        $str249$__not_an_indexed_term_ = SubLObjectFactory.makeString(" [not an indexed term]");
        $str250$No_inferior_terms = SubLObjectFactory.makeString("No inferior terms");
        $str251$Go_to_Top = SubLObjectFactory.makeString("Go to Top");
        $str252$____ = SubLObjectFactory.makeString("~%~%");
        $str253$____Level_finished___s = SubLObjectFactory.makeString("    Level finished: ~s");
        $str254$__ = SubLObjectFactory.makeString("~%");
        $str255$_______Total_count___s = SubLObjectFactory.makeString("       Total count: ~s");
        $str256$Computed_max_depth___s = SubLObjectFactory.makeString("Computed max depth: ~s");
        $sym257$HB_START = SubLObjectFactory.makeSymbol("HB-START");
        $str258$Hier = SubLObjectFactory.makeString("Hier");
        $kw259$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str260$hb_start = SubLObjectFactory.makeString("hb-start");
        $kw261$HIERARCHY_BROWSER = SubLObjectFactory.makeKeyword("HIERARCHY-BROWSER");
        $sym262$CB_LINK_HIERARCHY_BROWSER = SubLObjectFactory.makeSymbol("CB-LINK-HIERARCHY-BROWSER");
        $str263$Hierarchy_Browser = SubLObjectFactory.makeString("Hierarchy Browser");
        $str264$The_Hierarchy_Browser = SubLObjectFactory.makeString("The Hierarchy Browser");
        $list265 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-SPEC"));
        $str266$Could_not_determine_a_term_from__ = SubLObjectFactory.makeString("Could not determine a term from ~a");
        $sym267$CB_HIER_DEFAULT = SubLObjectFactory.makeSymbol("CB-HIER-DEFAULT");
        $list268 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("ARG-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT-SPEC"));
        $str269$Could_not_determine_an_arg_from__ = SubLObjectFactory.makeString("Could not determine an arg from ~a");
        $sym270$CB_HIER = SubLObjectFactory.makeSymbol("CB-HIER");
        $sym271$SECOND = SubLObjectFactory.makeSymbol("SECOND");
    }
}

/*

	Total time: 3993 ms
	
*/