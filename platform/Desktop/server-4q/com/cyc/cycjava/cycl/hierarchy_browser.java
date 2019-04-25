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

public final class hierarchy_browser
    extends
      SubLTranslatedFile
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
  public static SubLObject hb_default_method_info(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject info = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
      final SubLObject isas = isa.all_isa( fort, UNPROVIDED, UNPROVIDED );
      if( NIL == info )
      {
        SubLObject csome_list_var;
        SubLObject v_isa;
        for( csome_list_var = isas, v_isa = NIL, v_isa = csome_list_var.first(); NIL == info && NIL != csome_list_var; info = conses_high.assoc( v_isa, $hb_type_default_forms$.getDynamicValue( thread ), UNPROVIDED,
            UNPROVIDED ), csome_list_var = csome_list_var.rest(), v_isa = csome_list_var.first() )
        {
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4221L)
  public static SubLObject hb_default_method_availableP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != list_utilities.sublisp_boolean( hb_default_method_info( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4356L)
  public static SubLObject set_default_hb_icon()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $hb_icon$.getDynamicValue( thread ) )
    {
      $hb_icon$.setDynamicValue( $kw60$RED_DIAMOND, thread );
    }
    return $hb_icon$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4472L)
  public static SubLObject hb_debug()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $hb_debug$.setDynamicValue( T, thread );
    return $hb_debug$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4544L)
  public static SubLObject hb_no_debug()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $hb_debug$.setDynamicValue( NIL, thread );
    return $hb_debug$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 4621L)
  public static SubLObject hb_message(SubLObject top_spaces, SubLObject bottom_spaces, SubLObject string)
  {
    if( top_spaces == UNPROVIDED )
    {
      top_spaces = NIL;
    }
    if( bottom_spaces == UNPROVIDED )
    {
      bottom_spaces = NIL;
    }
    if( string == UNPROVIDED )
    {
      string = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject message = ( NIL != string_utilities.non_empty_stringP( string ) ) ? string
        : ( ( NIL != string_utilities.non_empty_stringP( $hb_message$.getDynamicValue( thread ) ) ) ? $hb_message$.getDynamicValue( thread ) : $str61$ );
    final SubLObject color = $hb_message_color$.getDynamicValue( thread );
    if( NIL != string_utilities.non_empty_stringP( message ) )
    {
      if( top_spaces.isInteger() )
      {
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( top_spaces ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          html_utilities.html_br();
        }
      }
      html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      final SubLObject color_val = color;
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
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), message );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
      if( bottom_spaces.isInteger() )
      {
        SubLObject i;
        for( i = NIL, i = ZERO_INTEGER; i.numL( bottom_spaces ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          html_utilities.html_br();
        }
      }
      $hb_message$.setDynamicValue( NIL, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 5215L)
  public static SubLObject hb_show_parameters(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str62$Starting_Term );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
    html_utilities.html_princ( $str63$Current_Term__ );
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str64$_2 );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != forts.fort_p( $hb_pivot_term$.getDynamicValue( thread ) ) )
      {
        cb_utilities.cb_form( $hb_pivot_term$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
      }
      else
      {
        html_utilities.html_princ( $str65$None );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
    html_utilities.html_hidden_input( $str66$cur_term, cb_utilities.cb_fort_identifier( $hb_pivot_term$.getDynamicValue( thread ) ), UNPROVIDED );
    html_utilities.html_indent( FIVE_INTEGER );
    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
    html_utilities.html_princ( $str67$Change_Term__ );
    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
    if( NIL != html_complete.$cb_enable_constant_completion$.getDynamicValue( thread ) )
    {
      html_complete.html_complete_button( $str68$new_term, $str69$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
    }
    html_utilities.html_text_input( $str68$new_term, $str61$, $int70$25 );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_checkbox_input( $str71$defaults_for_type, $str71$defaults_for_type, $hb_use_defaults_for_type$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str72$_Use_default_settings_for_term );
    html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_caption_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_caption_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw73$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str74$Specify_Non_Default_Settings );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_markup( html_macros.$html_caption_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str76$top ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str77$Binary_Predicate );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_complete.html_complete_button( $str78$pred, $str69$Complete, $const79$BinaryPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_text_input( $str78$pred, misc_kb_utilities.coerce_name( $hb_predicate$.getDynamicValue( thread ) ), $int70$25 );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str80$Index_Argument );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_radio_input( $str81$index, ONE_INTEGER, Equality.equal( $hb_index_argument$.getDynamicValue( thread ), ONE_INTEGER ), UNPROVIDED );
          html_utilities.html_princ( $str82$_1 );
          html_utilities.html_indent( THREE_INTEGER );
          html_utilities.html_radio_input( $str81$index, TWO_INTEGER, makeBoolean( !$hb_index_argument$.getDynamicValue( thread ).equal( ONE_INTEGER ) ), UNPROVIDED );
          html_utilities.html_princ( $str83$_2 );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FIVE_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str76$top ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str84$Microtheory );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_complete.html_complete_button( $str85$mt, $str69$Complete, $const86$Microtheory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_text_input( $str85$mt, misc_kb_utilities.coerce_name( $hb_mt$.getDynamicValue( thread ) ), $int70$25 );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_checkbox_input( $str87$genl_mts, $str87$genl_mts, $hb_use_genl_mts$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_princ( $str88$_Use_its_genl_mts_too__if_possibl );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_checkbox_input( $str89$all_mts, $str89$all_mts, Equality.eq( $hb_mt$.getDynamicValue( thread ), $kw45$ALL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_princ( $str90$_Use_all_mts );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str76$top ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_br();
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str91$Height_and_Depth );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_br();
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str93$Max_height__ );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( NIL, thread );
                  html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                  html_utilities.html_princ( $str94$height );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    SubLObject current = $hb_max_height$.getDynamicValue( thread );
                    if( NIL == current )
                    {
                      current = $sym95$ALL;
                    }
                    else if( current.equal( ZERO_INTEGER ) )
                    {
                      current = $sym96$NONE;
                    }
                    SubLObject cdolist_list_var = $list97;
                    SubLObject i = NIL;
                    i = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                      final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( NIL, thread );
                        if( i.equal( current ) )
                        {
                          html_utilities.html_princ( html_macros.$html_option_selected$.getGlobalValue() );
                        }
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_princ( i );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                      cdolist_list_var = cdolist_list_var.rest();
                      i = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                }
                html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str98$Max_depth__ );
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
                html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( NIL, thread );
                  html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                  html_utilities.html_princ( $str99$depth );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    SubLObject current = $hb_max_depth$.getDynamicValue( thread );
                    if( NIL == current )
                    {
                      current = $sym95$ALL;
                    }
                    else if( current.equal( ZERO_INTEGER ) )
                    {
                      current = $sym96$NONE;
                    }
                    SubLObject cdolist_list_var = $list97;
                    SubLObject i = NIL;
                    i = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                      final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( NIL, thread );
                        if( i.equal( current ) )
                        {
                          html_utilities.html_princ( html_macros.$html_option_selected$.getGlobalValue() );
                        }
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_princ( i );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                      cdolist_list_var = cdolist_list_var.rest();
                      i = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
                }
                html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          html_utilities.html_princ( $str100$Max_inferior_terms__ );
          html_utilities.html_text_input( $str101$inferior, $hb_max_inferiors$.getDynamicValue( thread ), FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( FIVE_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str76$top ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_br();
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str102$Extras );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_br();
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_checkbox_input( $str103$lex, $str103$lex, $hb_use_lexicon$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_princ( $str104$_Use_lexicon_entries__if_possible );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_checkbox_input( $str105$comments, $str105$comments, $hb_show_comments$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_princ( $str106$_Show_comments_for_terms );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_checkbox_input( $str107$mts_after, $str107$mts_after, $hb_show_mts$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_princ( $str108$_Show_assertion_s_mts_after_terms );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str109$Indent_quantum__ );
                html_utilities.html_text_input( $str110$quantum, $hb_indent_quantum$.getDynamicValue( thread ), THREE_INTEGER );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cyc_navigator_internals.nav_link( $kw111$HB_COLORS_AND_SYMBOLS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 9942L)
  public static SubLObject hb_show_colors_and_symbols(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
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
      final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
          final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( NIL, thread );
            html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
            html_utilities.html_princ( $str112$bg_color );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject cdolist_list_var = apps_shared.$app_color_name_map$.getDynamicValue( thread );
              SubLObject pair = NIL;
              pair = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( NIL, thread );
                  if( pair.first().eql( $hb_background_color$.getDynamicValue( thread ) ) )
                  {
                    html_utilities.html_princ( html_macros.$html_option_selected$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( pair.rest() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$45, thread );
                }
                html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
          }
          html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
          html_utilities.html_princ( $str113$__ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str114$The_background_color_for_Hierarch );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
          final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( NIL, thread );
            html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
            html_utilities.html_princ( $str115$msg_color );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject cdolist_list_var = apps_shared.$app_color_name_map$.getDynamicValue( thread );
              SubLObject pair = NIL;
              pair = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( NIL, thread );
                  if( pair.first().eql( $hb_message_color$.getDynamicValue( thread ) ) )
                  {
                    html_utilities.html_princ( html_macros.$html_option_selected$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( pair.rest() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$53, thread );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
                }
                html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$51, thread );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
          }
          html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
          html_utilities.html_princ( $str113$__ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str116$The_color_for_Hierarchy_Browser_a );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$54, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
          final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( NIL, thread );
            html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
            html_utilities.html_princ( $str117$hb_icon );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
              SubLObject cdolist_list_var = $hb_icon_choices$.getDynamicValue( thread );
              SubLObject item = NIL;
              item = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( NIL, thread );
                  if( item.equal( $hb_icon$.getDynamicValue( thread ) ) )
                  {
                    html_utilities.html_princ( html_macros.$html_option_selected$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( item );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
                }
                html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
              }
              html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
          }
          html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
          html_utilities.html_princ( $str113$__ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str118$The_hierarchical_display_link_ico );
          if( $hb_icon$.getDynamicValue( thread ).equalp( $str4$_ ) )
          {
            html_utilities.html_princ( $str4$_ );
          }
          else
          {
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( $hb_icon$.getDynamicValue( thread ) );
            final SubLObject align = $kw73$TOP;
            final SubLObject alt = $str4$_;
            final SubLObject border = ZERO_INTEGER;
            html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( image_src );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != alt )
            {
              html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( alt );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != align )
            {
              html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( align ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != border )
            {
              html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( border );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$62, thread );
            }
            html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_checkbox_input( $str119$hb_bar, $str119$hb_bar, $hb_bar$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str120$___ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$64, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str121$Use_decorative_separator_bar );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$65, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_text_input( $str122$hb_top_sign, $hb_top_sign$.getDynamicValue( thread ), FOUR_INTEGER );
          html_utilities.html_princ( $str123$__term_ );
          html_utilities.html_princ( $str120$___ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$67, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str124$Indicates_that__term__has_no_supe );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$68, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$66, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str125$_term__ );
          html_utilities.html_text_input( $str126$hb_bottom_sign, $hb_bottom_sign$.getDynamicValue( thread ), FOUR_INTEGER );
          html_utilities.html_princ( $str120$___ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str127$Indicates_that__term__has_no_infe );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$71, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$69, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_text_input( $str128$superiors_sign, $hb_more_superiors_sign$.getDynamicValue( thread ), FOUR_INTEGER );
          html_utilities.html_princ( $str123$__term_ );
          html_utilities.html_princ( $str120$___ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$73, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str129$Indicates_that__term__has_more_un );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$74, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$72, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str125$_term__ );
          html_utilities.html_text_input( $str130$inferiors_sign, $hb_more_inferiors_sign$.getDynamicValue( thread ), FOUR_INTEGER );
          html_utilities.html_princ( $str120$___ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$76, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str131$Indicates_that__term__has_more_un );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$77, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$75, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str125$_term__ );
          html_utilities.html_text_input( $str132$cycle_sign, $hb_cycle_sign$.getDynamicValue( thread ), TWELVE_INTEGER );
          html_utilities.html_princ( $str120$___ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$79, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str133$Indicates_that_a_sequence_of_term );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$80, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$78, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 13290L)
  public static SubLObject sorted_gaf_mts(final SubLObject gaf, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( $sym134$STRING_LESSP );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( $sym135$COERCE_NAME );
    }
    final SubLObject mts = kb_indexing.gaf_mts( gaf );
    final SubLObject sorted_mts = Sort.sort( mts, test, key );
    return sorted_mts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 13519L)
  public static SubLObject hb_parameters(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject color = $hb_background_color$.getDynamicValue( thread );
    html_utilities.html_markup( $str138$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str139$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw140$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw141$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str142$Cyc_Hierarchy_Browser );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_complete.html_complete_script();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$81 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str142$Cyc_Hierarchy_Browser );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
          hb_message( ONE_INTEGER, ONE_INTEGER, UNPROVIDED );
          final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str143$post );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var )
          {
            html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $str144$hb_handle_parameters, T, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
            cb_utilities.cb_help_preamble( $kw136$HB_PARAMETERS, UNPROVIDED, UNPROVIDED );
            html_utilities.html_reset_input( $str145$Current_Settings );
            html_utilities.html_indent( TWO_INTEGER );
            html_utilities.html_submit_input( $str146$Display_Hierarchy, UNPROVIDED, UNPROVIDED );
            html_utilities.html_br();
            hb_show_parameters( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$83, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$82, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$81, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 14182L)
  public static SubLObject hb_colors_and_symbols(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject color = $hb_background_color$.getDynamicValue( thread );
    html_utilities.html_markup( $str138$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str139$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw140$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw141$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str149$HB_Colors_and_Symbols );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_complete.html_complete_script();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$84 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str150$Hierarchy_Browser_Colors_and_Symb );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
          hb_message( ONE_INTEGER, ONE_INTEGER, UNPROVIDED );
          final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str143$post );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var )
          {
            html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $str151$hb_handle_colors_and_symbols, T, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
            cb_utilities.cb_back_button( UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( TWO_INTEGER );
            html_utilities.html_reset_input( $str145$Current_Settings );
            html_utilities.html_indent( TWO_INTEGER );
            html_utilities.html_submit_input( $str152$Update, UNPROVIDED, UNPROVIDED );
            html_utilities.html_br();
            hb_show_colors_and_symbols( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$86, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
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
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 14942L)
  public static SubLObject hb_binary_predicateP(final SubLObject fort)
  {
    return isa.isa_in_any_mtP( fort, $const79$BinaryPredicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 15036L)
  public static SubLObject hb_handle_parameters(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_term = NIL;
    final SubLObject cur_term = html_utilities.html_extract_input( $str66$cur_term, args );
    final SubLObject new_term = html_utilities.html_extract_input( $str68$new_term, args );
    final SubLObject pos_term = html_utilities.html_extract_input( $str154$term, args );
    SubLObject defaults = html_utilities.html_extract_input( $str71$defaults_for_type, args );
    SubLObject mt = html_utilities.html_extract_input( $str85$mt, args );
    SubLObject v_genl_mts = html_utilities.html_extract_input( $str87$genl_mts, args );
    SubLObject all_mts = html_utilities.html_extract_input( $str89$all_mts, args );
    SubLObject pred = html_utilities.html_extract_input( $str78$pred, args );
    SubLObject index = html_utilities.html_extract_input( $str81$index, args );
    SubLObject lex = html_utilities.html_extract_input( $str103$lex, args );
    SubLObject comments = html_utilities.html_extract_input( $str105$comments, args );
    SubLObject mts_after = html_utilities.html_extract_input( $str107$mts_after, args );
    SubLObject height = html_utilities.html_extract_input( $str94$height, args );
    SubLObject depth = html_utilities.html_extract_input( $str99$depth, args );
    SubLObject inferior = html_utilities.html_extract_input( $str101$inferior, args );
    SubLObject quantum = html_utilities.html_extract_input( $str110$quantum, args );
    final SubLObject strings = string_utilities.break_words( numeric_date_utilities.timestring( UNPROVIDED ), Symbols.symbol_function( $sym155$VALID_TIMESTRING_CHAR_ ), UNPROVIDED );
    final SubLObject time = conses_high.second( strings );
    final SubLObject date = strings.first();
    if( NIL != string_utilities.non_empty_stringP( new_term ) )
    {
      v_term = cb_frames.terms_for_browsing( new_term, UNPROVIDED, UNPROVIDED );
      if( v_term.isCons() )
      {
        v_term = list_utilities.delete_if_not( Symbols.symbol_function( $sym156$VALID_FORT_ ), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( v_term.isCons() && Sequences.length( v_term ).numE( ONE_INTEGER ) )
      {
        v_term = v_term.first();
      }
    }
    else if( NIL != cur_term )
    {
      v_term = cb_utilities.cb_guess_fort( cur_term, UNPROVIDED );
    }
    else
    {
      v_term = cb_frames.terms_for_browsing( pos_term, UNPROVIDED, UNPROVIDED );
    }
    defaults = Equality.equalp( defaults, $str71$defaults_for_type );
    if( NIL != string_utilities.non_empty_stringP( mt ) )
    {
      if( NIL != Sequences.find( mt, $list157, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        mt = $kw45$ALL;
      }
      else
      {
        mt = cb_frames.terms_for_browsing( mt, UNPROVIDED, UNPROVIDED );
      }
      if( mt.isCons() )
      {
        mt = list_utilities.delete_if_not( Symbols.symbol_function( $sym158$MT_ ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( mt.isCons() && Sequences.length( mt ).numE( ONE_INTEGER ) )
      {
        mt = mt.first();
      }
    }
    v_genl_mts = Equality.equalp( v_genl_mts, $str87$genl_mts );
    all_mts = makeBoolean( all_mts.equalp( $str89$all_mts ) || mt == $kw45$ALL );
    if( NIL != string_utilities.non_empty_stringP( pred ) )
    {
      pred = cb_frames.terms_for_browsing( pred, UNPROVIDED, UNPROVIDED );
      if( pred.isCons() )
      {
        pred = list_utilities.delete_if_not( Symbols.symbol_function( $sym159$HB_BINARY_PREDICATE_ ), pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( pred.isCons() && Sequences.length( pred ).numE( ONE_INTEGER ) )
      {
        pred = pred.first();
      }
    }
    index = index.equalp( $str160$2 ) ? TWO_INTEGER : ONE_INTEGER;
    lex = Equality.equalp( lex, $str103$lex );
    comments = Equality.equalp( comments, $str105$comments );
    mts_after = Equality.equalp( mts_after, $str107$mts_after );
    height = reader.read_from_string_ignoring_errors( height, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( !height.isInteger() )
    {
      if( height.equal( $sym96$NONE ) )
      {
        height = ZERO_INTEGER;
      }
      else if( height.equal( $sym95$ALL ) )
      {
        height = NIL;
      }
      else
      {
        height = FOUR_INTEGER;
      }
    }
    depth = reader.read_from_string_ignoring_errors( depth, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( !depth.isInteger() )
    {
      if( depth.equal( $sym96$NONE ) )
      {
        depth = ZERO_INTEGER;
      }
      else if( depth.equal( $sym95$ALL ) )
      {
        depth = NIL;
      }
      else
      {
        depth = FOUR_INTEGER;
      }
    }
    if( NIL != string_utilities.non_empty_stringP( inferior ) )
    {
      inferior = reader.read_from_string_ignoring_errors( inferior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( !inferior.isInteger() || !inferior.numGE( ZERO_INTEGER ) )
    {
      inferior = $str61$;
    }
    if( NIL != string_utilities.non_empty_stringP( quantum ) )
    {
      quantum = reader.read_from_string_ignoring_errors( quantum, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( !quantum.isInteger() || !quantum.numGE( ZERO_INTEGER ) || !quantum.numLE( $int161$50 ) )
    {
      quantum = FOUR_INTEGER;
    }
    $hb_use_defaults_for_type$.setDynamicValue( defaults, thread );
    $hb_use_genl_mts$.setDynamicValue( v_genl_mts, thread );
    $hb_index_argument$.setDynamicValue( index, thread );
    $hb_gather_argument$.setDynamicValue( $hb_index_argument$.getDynamicValue( thread ).numE( ONE_INTEGER ) ? TWO_INTEGER : ONE_INTEGER, thread );
    $hb_use_lexicon$.setDynamicValue( lex, thread );
    $hb_show_comments$.setDynamicValue( comments, thread );
    $hb_show_mts$.setDynamicValue( mts_after, thread );
    $hb_max_height$.setDynamicValue( height, thread );
    $hb_max_depth$.setDynamicValue( depth, thread );
    $hb_max_inferiors$.setDynamicValue( inferior, thread );
    $hb_indent_quantum$.setDynamicValue( quantum, thread );
    SubLObject successes = NIL;
    SubLObject failures = NIL;
    if( NIL != forts.valid_fortP( v_term ) )
    {
      $hb_pivot_term$.setDynamicValue( v_term, thread );
      if( NIL != $hb_use_defaults_for_type$.getDynamicValue( thread ) )
      {
        hb_set_defaults_for_type( $hb_pivot_term$.getDynamicValue( thread ) );
        return hb_print_nodes( UNPROVIDED );
      }
      successes = ConsesLow.cons( $kw162$TERM, successes );
    }
    if( NIL != forts.valid_fortP( pred ) && NIL != isa.isa_in_any_mtP( pred, $const163$Predicate ) )
    {
      $hb_predicate$.setDynamicValue( pred, thread );
      successes = ConsesLow.cons( $kw164$PRED, successes );
    }
    if( NIL != all_mts || ( NIL != forts.valid_fortP( mt ) && NIL != isa.isa_in_any_mtP( mt, $const86$Microtheory ) ) )
    {
      $hb_mt$.setDynamicValue( ( NIL != all_mts ) ? $kw45$ALL : mt, thread );
      successes = ConsesLow.cons( $kw165$MT, successes );
    }
    if( NIL == Sequences.find( $kw162$TERM, successes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      if( !v_term.isCons() )
      {
        $hb_message$.setDynamicValue( PrintLow.format( NIL, $str166$The_input__s_did_not_yield_a_vali, html_utilities.html_extract_input( $str68$new_term, args ) ), thread );
        return hb_parameters( UNPROVIDED );
      }
      failures = ConsesLow.cons( ConsesLow.list( $kw162$TERM, v_term ), failures );
    }
    if( NIL == Sequences.find( $kw164$PRED, successes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      if( !pred.isCons() )
      {
        $hb_message$.setDynamicValue( PrintLow.format( NIL, $str167$The_input__s_did_not_yield_a_vali, html_utilities.html_extract_input( $str78$pred, args ) ), thread );
        return hb_parameters( UNPROVIDED );
      }
      failures = ConsesLow.cons( ConsesLow.list( $kw164$PRED, pred ), failures );
    }
    if( NIL == Sequences.find( $kw165$MT, successes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      if( !mt.isCons() )
      {
        $hb_message$.setDynamicValue( PrintLow.format( NIL, $str168$The_input__s_did_not_yield_a_vali, html_utilities.html_extract_input( $str85$mt, args ) ), thread );
        return hb_parameters( UNPROVIDED );
      }
      failures = ConsesLow.cons( ConsesLow.list( $kw165$MT, mt ), failures );
    }
    if( NIL != failures )
    {
      return hb_choose_constants( failures );
    }
    if( NIL != $hb_use_defaults_for_type$.getDynamicValue( thread ) )
    {
      hb_set_defaults_for_type( $hb_pivot_term$.getDynamicValue( thread ) );
    }
    $hb_message$.setDynamicValue( PrintLow.format( NIL, $str169$Parameters_updated_at__a_on__a, time, date ), thread );
    return hb_print_nodes( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 20617L)
  public static SubLObject hb_handle_colors_and_symbols(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject bg_color = html_utilities.html_extract_input( $str112$bg_color, args );
    SubLObject msg_color = html_utilities.html_extract_input( $str115$msg_color, args );
    SubLObject icon = html_utilities.html_extract_input( $str117$hb_icon, args );
    SubLObject bar = html_utilities.html_extract_input( $str119$hb_bar, args );
    SubLObject top_sign = html_utilities.html_extract_input( $str122$hb_top_sign, args );
    SubLObject bottom_sign = html_utilities.html_extract_input( $str126$hb_bottom_sign, args );
    SubLObject sup_sign = html_utilities.html_extract_input( $str128$superiors_sign, args );
    SubLObject inf_sign = html_utilities.html_extract_input( $str130$inferiors_sign, args );
    SubLObject cycle = html_utilities.html_extract_input( $str132$cycle_sign, args );
    final SubLObject strings = string_utilities.break_words( numeric_date_utilities.timestring( UNPROVIDED ), Symbols.symbol_function( $sym155$VALID_TIMESTRING_CHAR_ ), UNPROVIDED );
    final SubLObject time = conses_high.second( strings );
    final SubLObject date = strings.first();
    if( NIL != string_utilities.non_empty_stringP( bg_color ) )
    {
      bg_color = conses_high.rassoc( bg_color, apps_shared.$app_color_name_map$.getDynamicValue( thread ), Symbols.symbol_function( EQUALP ), UNPROVIDED ).first();
    }
    else
    {
      bg_color = $kw171$DEFAULT;
    }
    if( NIL != string_utilities.non_empty_stringP( msg_color ) )
    {
      msg_color = conses_high.rassoc( msg_color, apps_shared.$app_color_name_map$.getDynamicValue( thread ), Symbols.symbol_function( EQUALP ), UNPROVIDED ).first();
    }
    else
    {
      msg_color = $kw172$BLACK;
    }
    if( NIL != string_utilities.non_empty_stringP( icon ) )
    {
      icon = string_utilities.keyword_from_string( icon );
    }
    else
    {
      icon = $str4$_;
    }
    if( NIL == string_utilities.non_empty_stringP( bar ) )
    {
      bar = NIL;
    }
    if( NIL == string_utilities.non_empty_stringP( top_sign ) )
    {
      top_sign = $str61$;
    }
    if( NIL == string_utilities.non_empty_stringP( bottom_sign ) )
    {
      bottom_sign = $str61$;
    }
    if( NIL == string_utilities.non_empty_stringP( sup_sign ) )
    {
      sup_sign = $str61$;
    }
    if( NIL == string_utilities.non_empty_stringP( inf_sign ) )
    {
      inf_sign = $str61$;
    }
    if( NIL == string_utilities.non_empty_stringP( cycle ) )
    {
      cycle = $str61$;
    }
    $hb_background_color$.setDynamicValue( bg_color, thread );
    $hb_message_color$.setDynamicValue( msg_color, thread );
    $hb_icon$.setDynamicValue( ( NIL != conses_high.member( icon, $hb_icon_choices$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) ? icon : $str4$_, thread );
    $hb_bar$.setDynamicValue( ( NIL != bar && $hb_bar_choice$.getDynamicValue( thread ).isKeyword() ) ? $hb_bar_choice$.getDynamicValue( thread ) : NIL, thread );
    $hb_top_sign$.setDynamicValue( top_sign, thread );
    $hb_bottom_sign$.setDynamicValue( bottom_sign, thread );
    $hb_more_superiors_sign$.setDynamicValue( sup_sign, thread );
    $hb_more_inferiors_sign$.setDynamicValue( inf_sign, thread );
    $hb_cycle_sign$.setDynamicValue( cycle, thread );
    $hb_message$.setDynamicValue( PrintLow.format( NIL, $str173$Colors_and_symbols_updated_at__a_, time, date ), thread );
    return hb_parameters( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 22874L)
  public static SubLObject hb_set_defaults_for_type(final SubLObject fort)
  {
    if( NIL != kb_indexing_datastructures.indexed_term_p( fort ) )
    {
      final SubLObject default_method_info = hb_default_method_info( fort );
      if( NIL == default_method_info )
      {
        $hb_message$.setDynamicValue( PrintLow.format( NIL, $str177$No_default_display_parameters_are, hb_string_for_constant( fort ) ) );
        return hb_parameters( UNPROVIDED );
      }
      SubLObject current;
      final SubLObject datum = current = default_method_info;
      SubLObject type = NIL;
      SubLObject predicate = NIL;
      SubLObject index = NIL;
      SubLObject gather = NIL;
      SubLObject height = NIL;
      SubLObject depth = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      type = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      predicate = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      index = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      gather = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      height = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
      depth = current.first();
      current = current.rest();
      if( NIL == current )
      {
        $hb_pivot_term$.setDynamicValue( fort );
        $hb_predicate$.setDynamicValue( predicate );
        $hb_mt$.setDynamicValue( $kw45$ALL );
        $hb_index_argument$.setDynamicValue( index );
        $hb_gather_argument$.setDynamicValue( gather );
        $hb_max_height$.setDynamicValue( height );
        $hb_max_depth$.setDynamicValue( depth );
        $hb_message$.setDynamicValue( PrintLow.format( NIL, $str176$Using_default_settings_for_instan, hb_string_for_constant( type ) ) );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list175 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 23732L)
  public static SubLObject hb_simple_choose_constants(final SubLObject failures)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject color = $hb_background_color$.getDynamicValue( thread );
    final SubLObject form = failures.first();
    final SubLObject key = form.first();
    final SubLObject v_forts = conses_high.second( form );
    final SubLObject sorted_forts = Sort.sort( v_forts, Symbols.symbol_function( $sym134$STRING_LESSP ), Symbols.symbol_function( $sym178$HB_STRING_FOR_CONSTANT ) );
    final SubLObject string = ( key == $kw162$TERM ) ? $str154$term : ( ( key == $kw164$PRED ) ? $str179$predicate : $str180$microtheory );
    final SubLObject plural = string.equalp( $str180$microtheory ) ? $str181$microtheories : PrintLow.format( NIL, $str182$_as, string );
    html_utilities.html_markup( $str138$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str139$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw140$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw141$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str183$Choose_Constants__Simple_Version );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$87 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str184$Choose_a__a, Strings.string_capitalize( string, UNPROVIDED, UNPROVIDED ) );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_br();
          html_utilities.html_br();
          html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str185$Please_choose_one_of_the_followin, plural );
          html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
          html_utilities.html_br();
          html_utilities.html_br();
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            SubLObject cdolist_list_var = sorted_forts;
            SubLObject c = NIL;
            c = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $str186$left ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  cyc_navigator_internals.nav_link( $kw187$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, ConsesLow.list( cb_utilities.cb_fort_identifier( c ), string ), $kw188$SELF, hb_string_for_constant( c ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$91, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$90, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              c = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$89, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$88, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$87, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 24881L)
  public static SubLObject hb_handle_simple_choose_constants(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = reader.read_from_string_ignoring_errors( args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject fort = cb_utilities.cb_guess_fort( id, UNPROVIDED );
    final SubLObject string = conses_high.second( args );
    if( string.equalp( $str154$term ) )
    {
      $hb_pivot_term$.setDynamicValue( fort, thread );
    }
    else if( string.equalp( $str179$predicate ) )
    {
      $hb_predicate$.setDynamicValue( fort, thread );
    }
    else if( string.equalp( $str180$microtheory ) )
    {
      $hb_mt$.setDynamicValue( fort, thread );
    }
    if( NIL != $hb_use_defaults_for_type$.getDynamicValue( thread ) )
    {
      hb_set_defaults_for_type( $hb_pivot_term$.getDynamicValue( thread ) );
    }
    return hb_print_nodes( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 25385L)
  public static SubLObject hb_choose_constants(final SubLObject failures)
  {
    if( Sequences.length( failures ).numE( ONE_INTEGER ) )
    {
      return hb_simple_choose_constants( failures );
    }
    return hb_complex_choose_constants( failures );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 25569L)
  public static SubLObject hb_complex_choose_constants(SubLObject failures)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    failures = Sequences.nreverse( failures );
    final SubLObject color = $hb_background_color$.getDynamicValue( thread );
    html_utilities.html_markup( $str138$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str139$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw140$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw141$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str190$Choose_Constants__Complex_Version );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$92 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str191$Resolve_Ambiguous_Input );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
          final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str143$post );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var )
          {
            html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $str192$hb_handle_complex_choose_constant, T, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
            html_utilities.html_submit_input( $str193$Go, UNPROVIDED, UNPROVIDED );
            html_utilities.html_br();
            html_utilities.html_br();
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str194$Please_select_one_term_from_each_ );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_br();
            SubLObject cdolist_list_var = failures;
            SubLObject form = NIL;
            form = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_br();
              final SubLObject key = form.first();
              final SubLObject v_forts = conses_high.second( form );
              final SubLObject first_c = v_forts.first();
              final SubLObject heading = ( key == $kw162$TERM ) ? $str195$Terms : ( ( key == $kw164$PRED ) ? $str196$Predicates : $str197$Microtheories );
              final SubLObject name = PrintLow.format( NIL, $str198$_a, key );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), heading );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject cdolist_list_var_$96 = v_forts;
                SubLObject c = NIL;
                c = cdolist_list_var_$96.first();
                while ( NIL != cdolist_list_var_$96)
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_radio_input( name, cb_utilities.cb_fort_identifier( c ), Equality.equal( c, first_c ), UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$97, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ( $str199$_ );
                      hb_print_constant( c, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$98, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$96, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                  c = cdolist_list_var_$96.first();
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$95, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              cdolist_list_var = cdolist_list_var.rest();
              form = cdolist_list_var.first();
            }
            html_utilities.html_submit_input( $str193$Go, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$94, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$93, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$92, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 26851L)
  public static SubLObject hb_handle_complex_choose_constants(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_id_string = html_utilities.html_extract_input( $str154$term, args );
    final SubLObject pred_id_string = html_utilities.html_extract_input( $str78$pred, args );
    final SubLObject mt_id_string = html_utilities.html_extract_input( $str85$mt, args );
    final SubLObject term_id = ( NIL != string_utilities.non_empty_stringP( term_id_string ) ) ? reader.read_from_string_ignoring_errors( term_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject pred_id = ( NIL != string_utilities.non_empty_stringP( pred_id_string ) ) ? reader.read_from_string_ignoring_errors( pred_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject mt_id = ( NIL != string_utilities.non_empty_stringP( mt_id_string ) ) ? reader.read_from_string_ignoring_errors( mt_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    if( term_id.isFixnum() )
    {
      $hb_pivot_term$.setDynamicValue( cb_utilities.cb_guess_fort( term_id, UNPROVIDED ), thread );
    }
    if( pred_id.isFixnum() )
    {
      $hb_predicate$.setDynamicValue( cb_utilities.cb_guess_fort( pred_id, UNPROVIDED ), thread );
    }
    if( mt_id.isFixnum() )
    {
      $hb_mt$.setDynamicValue( cb_utilities.cb_guess_fort( mt_id, UNPROVIDED ), thread );
    }
    if( NIL != $hb_use_defaults_for_type$.getDynamicValue( thread ) )
    {
      hb_set_defaults_for_type( $hb_pivot_term$.getDynamicValue( thread ) );
    }
    return hb_print_nodes( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 27738L)
  public static SubLObject hb_select_node(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject id = ( NIL != string_utilities.non_empty_stringP( args ) ) ? args : ( args.isCons() ? args.first() : ( args.isInteger() ? args : NIL ) );
    final SubLObject fort = cb_utilities.cb_guess_fort( id, UNPROVIDED );
    $hb_pivot_term$.setDynamicValue( fort );
    hb_print_nodes( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 28027L)
  public static SubLObject set_hb_eval_form()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $hb_eval_form$.setDynamicValue( ConsesLow.list( $hb_predicate$.getDynamicValue( thread ), $hb_index_argument$.getDynamicValue( thread ), $hb_gather_argument$.getDynamicValue( thread ) ), thread );
    $hb_inverse_eval_form$.setDynamicValue( ConsesLow.list( $hb_predicate$.getDynamicValue( thread ), $hb_gather_argument$.getDynamicValue( thread ), $hb_index_argument$.getDynamicValue( thread ) ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 28263L)
  public static SubLObject hb_alternate_predicate(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject alt_predicate = conses_high.second( conses_high.assoc( predicate, $hb_alternate_predicates$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) );
    return ( NIL != forts.valid_fortP( alt_predicate ) ) ? alt_predicate : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 28458L)
  public static SubLObject set_hb_alternate_predicate()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $hb_alternate_predicate$.setDynamicValue( hb_alternate_predicate( $hb_predicate$.getDynamicValue( thread ) ), thread );
    return $hb_alternate_predicate$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 28614L)
  public static SubLObject hb_get_nodes(final SubLObject v_term, SubLObject recursive_call)
  {
    if( recursive_call == UNPROVIDED )
    {
      recursive_call = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fort = function_terms.naut_to_nart( v_term );
    final SubLObject predicate = $hb_eval_form$.getDynamicValue( thread ).first();
    final SubLObject index_arg = conses_high.second( $hb_eval_form$.getDynamicValue( thread ) );
    final SubLObject gather_arg = conses_high.third( $hb_eval_form$.getDynamicValue( thread ) );
    SubLObject ans = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( fort ) )
    {
      if( $hb_mt$.getDynamicValue( thread ) == $kw45$ALL )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
          ans = kb_mapping_utilities.pred_values( fort, predicate, index_arg, gather_arg, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else if( NIL != $hb_use_genl_mts$.getDynamicValue( thread ) )
      {
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $hb_mt$.getDynamicValue( thread ) );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          ans = kb_mapping_utilities.pred_values( fort, predicate, index_arg, gather_arg, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_5, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_4, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym202$RELEVANT_MT_IS_EQ, thread );
          mt_relevance_macros.$mt$.bind( $hb_mt$.getDynamicValue( thread ), thread );
          ans = kb_mapping_utilities.pred_values( fort, predicate, index_arg, gather_arg, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      if( NIL == recursive_call && NIL != forts.valid_fortP( $hb_alternate_predicate$.getDynamicValue( thread ) ) )
      {
        final SubLObject _prev_bind_0 = $hb_eval_form$.currentBinding( thread );
        try
        {
          $hb_eval_form$.bind( conses_high.subst( $hb_alternate_predicate$.getDynamicValue( thread ), predicate, $hb_eval_form$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ), thread );
          ans = conses_high.union( ans, hb_get_nodes( v_term, T ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
        }
        finally
        {
          $hb_eval_form$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 29461L)
  public static SubLObject hb_comments(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fort = function_terms.naut_to_nart( v_term );
    final SubLObject pred = $const203$comment;
    SubLObject assertions = NIL;
    SubLObject mt_string_pairs = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( fort ) && NIL != pred )
    {
      if( $hb_mt$.getDynamicValue( thread ) == $kw45$ALL )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
          assertions = kb_mapping.gather_gaf_arg_index( fort, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else if( NIL != $hb_use_genl_mts$.getDynamicValue( thread ) )
      {
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $hb_mt$.getDynamicValue( thread ) );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          assertions = kb_mapping.gather_gaf_arg_index( fort, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_5, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_4, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym202$RELEVANT_MT_IS_EQ, thread );
          mt_relevance_macros.$mt$.bind( $hb_mt$.getDynamicValue( thread ), thread );
          assertions = kb_mapping.gather_gaf_arg_index( fort, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      SubLObject cdolist_list_var = assertions;
      SubLObject ass = NIL;
      ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject formula = misc_kb_utilities.make_lispy_form( ass );
        final SubLObject string = conses_high.third( formula );
        final SubLObject mt = assertions_high.assertion_mt( ass );
        mt_string_pairs = ConsesLow.cons( ConsesLow.list( mt, string ), mt_string_pairs );
        cdolist_list_var = cdolist_list_var.rest();
        ass = cdolist_list_var.first();
      }
      mt_string_pairs = Sort.sort( mt_string_pairs, Symbols.symbol_function( $sym134$STRING_LESSP ), Symbols.symbol_function( $sym204$NAME_OF_CAR ) );
    }
    return mt_string_pairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 30254L)
  public static SubLObject hb_maybe_print_comments(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $hb_show_comments$.getDynamicValue( thread ) )
    {
      final SubLObject mt_comment_pairs = hb_comments( fort );
      if( NIL != mt_comment_pairs )
      {
        html_utilities.html_br();
        html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
        html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject cdolist_list_var = mt_comment_pairs;
          SubLObject pair = NIL;
          pair = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_br();
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != size_val )
                {
                  html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( size_val );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  cb_utilities.cb_form( pair.first(), UNPROVIDED, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                  html_utilities.html_princ( $str113$__ );
                  html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$102, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$101, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                if( NIL != size_val )
                {
                  html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( size_val );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ_doc_string( conses_high.second( pair ), UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$104, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$103, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$100, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
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

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 30803L)
  public static SubLObject hb_string_for_constant(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject string = NIL;
    if( NIL != $hb_use_lexicon$.getDynamicValue( thread ) )
    {
      string = pph_main.generate_phrase( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      string = misc_kb_utilities.coerce_name( fort );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 31023L)
  public static SubLObject hb_print_constant(final SubLObject fort, SubLObject hb_linkP)
  {
    if( hb_linkP == UNPROVIDED )
    {
      hb_linkP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = ( NIL != forts.valid_fortP( fort ) ) ? cb_utilities.cb_fort_identifier( fort ) : NIL;
    if( NIL != id && NIL != hb_linkP )
    {
      if( $hb_icon$.getDynamicValue( thread ).equal( $str4$_ ) )
      {
        cyc_navigator_internals.nav_link( $kw205$HB_SELECT_NODE_TEXT, ConsesLow.list( id ), $kw188$SELF, $hb_icon$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cyc_navigator_internals.nav_link( $kw206$HB_SELECT_NODE_IMAGE, ConsesLow.list( id ), $kw188$SELF, NIL, $hb_icon$.getDynamicValue( thread ), $str4$_, $kw73$TOP, UNPROVIDED, UNPROVIDED );
      }
    }
    if( NIL != $hb_use_lexicon$.getDynamicValue( thread ) )
    {
      pph_html.html_phrase_with_target( fort, $sym207$CB_CF, $kw188$SELF );
    }
    else
    {
      cb_utilities.cb_form( fort, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 31487L)
  public static SubLObject hb_accessor(final SubLObject fort, final SubLObject mt, SubLObject key)
  {
    if( key == UNPROVIDED )
    {
      key = $kw208$ISA;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mtP = isa.isa_in_any_mtP( mt, $const86$Microtheory );
    SubLObject function = NIL;
    SubLObject ans = NIL;
    if( NIL != kb_indexing_datastructures.indexed_term_p( fort ) )
    {
      final SubLObject pcase_var = key;
      if( pcase_var.eql( $kw208$ISA ) )
      {
        function = $sym209$MIN_ISA;
      }
      else if( pcase_var.eql( $kw210$GENLS ) )
      {
        function = $sym211$MIN_GENLS;
      }
      else if( pcase_var.eql( $kw212$ALL_ISA ) )
      {
        function = $sym213$ALL_ISA;
      }
      else if( pcase_var.eql( $kw214$ALL_GENLS ) )
      {
        function = $sym215$ALL_GENLS;
      }
      else
      {
        function = $sym216$LIST;
      }
      if( mt == $kw45$ALL )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
          ans = Functions.funcall( function, fort );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else if( NIL != $hb_use_genl_mts$.getDynamicValue( thread ) && NIL != mtP )
      {
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          ans = Functions.funcall( function, fort );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_5, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_4, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
        }
      }
      else if( NIL != mtP )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym202$RELEVANT_MT_IS_EQ, thread );
          mt_relevance_macros.$mt$.bind( mt, thread );
          ans = Functions.funcall( function, fort );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
          ans = Functions.funcall( function, fort );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return Sequences.remove_duplicates( ans, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 32244L)
  public static SubLObject hb_status_heading(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
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
      final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            cb_utilities.cb_form( $const217$isa, UNPROVIDED, UNPROVIDED );
            html_utilities.html_princ( $str113$__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$107, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$106, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject isas = hb_accessor( $hb_pivot_term$.getDynamicValue( thread ), $hb_mt$.getDynamicValue( thread ), $kw208$ISA );
            final SubLObject sorted_isas = Sort.sort( isas, Symbols.symbol_function( $sym134$STRING_LESSP ), Symbols.symbol_function( $sym178$HB_STRING_FOR_CONSTANT ) );
            final SubLObject last = conses_high.last( sorted_isas, UNPROVIDED ).first();
            if( NIL != isas )
            {
              SubLObject cdolist_list_var = sorted_isas;
              SubLObject v_isa = NIL;
              v_isa = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                hb_print_constant( v_isa, UNPROVIDED );
                if( !v_isa.equal( last ) )
                {
                  html_utilities.html_princ( $str218$__ );
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
              }
            }
            else
            {
              html_utilities.html_princ( $str65$None );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$109, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$108, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$105, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      if( NIL != Sequences.find( $const219$Collection, hb_accessor( $hb_pivot_term$.getDynamicValue( thread ), $hb_mt$.getDynamicValue( thread ), $kw212$ALL_ISA ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != size_val )
            {
              html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( size_val );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              cb_utilities.cb_form( $const220$genls, UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str113$__ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$112, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$111, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$113 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != size_val )
            {
              html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( size_val );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$114 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              final SubLObject v_genls = hb_accessor( $hb_pivot_term$.getDynamicValue( thread ), $hb_mt$.getDynamicValue( thread ), $kw210$GENLS );
              final SubLObject sorted_genls = Sort.sort( v_genls, Symbols.symbol_function( $sym134$STRING_LESSP ), Symbols.symbol_function( $sym178$HB_STRING_FOR_CONSTANT ) );
              final SubLObject last = conses_high.last( sorted_genls, UNPROVIDED ).first();
              if( NIL != v_genls )
              {
                SubLObject cdolist_list_var = sorted_genls;
                SubLObject genl = NIL;
                genl = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  hb_print_constant( genl, UNPROVIDED );
                  if( !genl.equal( last ) )
                  {
                    html_utilities.html_princ( $str218$__ );
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  genl = cdolist_list_var.first();
                }
              }
              else
              {
                html_utilities.html_princ( $str65$None );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$114, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$113, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$110, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$115 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$116 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$117 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str221$Context__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$117, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$116, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$118 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$119 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject mtP = isa.isa_in_any_mtP( $hb_mt$.getDynamicValue( thread ), $const86$Microtheory );
            if( $hb_mt$.getDynamicValue( thread ) == $kw45$ALL )
            {
              html_utilities.html_princ( $str222$Union_of_all_contexts );
            }
            else if( NIL != $hb_use_genl_mts$.getDynamicValue( thread ) && NIL != mtP )
            {
              hb_print_constant( $hb_mt$.getDynamicValue( thread ), UNPROVIDED );
              html_utilities.html_princ( $str223$_and_its_ );
              cb_utilities.cb_form( $const224$genlMt, UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str225$s );
            }
            else if( NIL != mtP )
            {
              hb_print_constant( $hb_mt$.getDynamicValue( thread ), UNPROVIDED );
            }
            else
            {
              html_utilities.html_princ( $str226$Unknown_ );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$119, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$118, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$115, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$120 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$121 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str227$Predicate__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$122, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$121, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            hb_print_constant( $hb_predicate$.getDynamicValue( thread ), UNPROVIDED );
            if( NIL != forts.valid_fortP( $hb_alternate_predicate$.getDynamicValue( thread ) ) )
            {
              html_utilities.html_princ( $str218$__ );
              hb_print_constant( $hb_alternate_predicate$.getDynamicValue( thread ), UNPROVIDED );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$124, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$123, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$120, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $str92$right ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str228$Index__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$127, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$126, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str198$_a, $hb_index_argument$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$129, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$128, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$125, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 34825L)
  public static SubLObject clear_hb_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$hb_table$.getDynamicValue( thread ).isHashtable() )
    {
      $hb_table$.setDynamicValue( Hashtables.make_hash_table( $int229$100, Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $hb_table$.getDynamicValue( thread ) );
    return $hb_table$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 34994L)
  public static SubLObject clear_hb_duplicates_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$hb_duplicates_table$.getDynamicValue( thread ).isHashtable() )
    {
      $hb_duplicates_table$.setDynamicValue( Hashtables.make_hash_table( $int229$100, UNPROVIDED, UNPROVIDED ), thread );
    }
    Hashtables.clrhash( $hb_duplicates_table$.getDynamicValue( thread ) );
    return $hb_duplicates_table$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 35210L)
  public static SubLObject clear_hb_superior_table()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$hb_superior_table$.getDynamicValue( thread ).isHashtable() )
    {
      $hb_superior_table$.setDynamicValue( Hashtables.make_hash_table( $int229$100, Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
    }
    final SubLObject cdohash_table = $hb_superior_table$.getDynamicValue( thread );
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        if( val.isHashtable() )
        {
          Hashtables.clrhash( val );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return $hb_superior_table$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 35502L)
  public static SubLObject hb_init()
  {
    clear_hb_table();
    clear_hb_duplicates_table();
    clear_hb_superior_table();
    apps_shared.configure_app_colors();
    set_default_hb_icon();
    set_hb_eval_form();
    set_hb_alternate_predicate();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 35721L)
  public static SubLObject hb_bar(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $hb_bar$.getDynamicValue( thread ) )
    {
      final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( $hb_bar$.getDynamicValue( thread ) );
      final SubLObject align = $kw73$TOP;
      final SubLObject alt = $str230$__________;
      final SubLObject border = ZERO_INTEGER;
      html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( image_src );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != alt )
      {
        html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( alt );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != align )
      {
        html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( align ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != border )
      {
        html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( border );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 35913L)
  public static SubLObject hb_print_nodes(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forts.valid_fortP( $hb_pivot_term$.getDynamicValue( thread ) ) )
    {
      hb_init();
      final SubLObject color = $hb_background_color$.getDynamicValue( thread );
      html_utilities.html_markup( $str138$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str139$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw140$UNINITIALIZED ) ? ConsesLow.list(
            EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw141$CB_CYC );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str233$Hierarchical_Display___a, hb_string_for_constant( $hb_pivot_term$.getDynamicValue( thread ) ) );
        html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$130 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != color )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( color ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_browser.cb_term_page_heading( $hb_pivot_term$.getDynamicValue( thread ), $sym234$HIERARCHY_DEFAULT );
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str143$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str235$hb_parameters, T, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str199$_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$135, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$134, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str199$_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$137, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$136, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    hb_status_heading( UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$139, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$138, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                if( NIL != $hb_message$.getDynamicValue( thread ) )
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
                      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                      if( NIL != size_val )
                      {
                        html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( size_val );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      }
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        hb_message( UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$142, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$141, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$140, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                }
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str199$_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$144, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$143, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str199$_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$146, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$145, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    cb_utilities.cb_help_preamble( $kw231$HB_PRINT_NODES, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_submit_input( $str236$Change_Hierarchy_Browser_Settings, UNPROVIDED, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$148, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$147, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                if( NIL != $hb_bar$.getDynamicValue( thread ) )
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $str75$middle ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      hb_bar( UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$150, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$149, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$133, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                hb_print_nodes_1( $hb_pivot_term$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$151, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$132, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$131, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$130, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    else
    {
      $hb_message$.setDynamicValue( PrintLow.format( NIL, $str237$_a_is_not_a_valid_constant_, $hb_pivot_term$.getDynamicValue( thread ) ), thread );
      hb_parameters( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 37377L)
  public static SubLObject hb_construct_superior_paths(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_hb_superior_table();
    clear_hb_table();
    if( NIL != kb_indexing_datastructures.indexed_term_p( fort ) )
    {
      final SubLObject _prev_bind_0 = $hb_eval_form$.currentBinding( thread );
      try
      {
        $hb_eval_form$.bind( $hb_inverse_eval_form$.getDynamicValue( thread ), thread );
        hb_construct_superior_paths_int( ConsesLow.list( fort ), $hb_eval_form$.getDynamicValue( thread ), ZERO_INTEGER );
      }
      finally
      {
        $hb_eval_form$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 37640L)
  public static SubLObject hb_superior_table_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    if( !$hb_superior_table$.getDynamicValue( thread ).isHashtable() )
    {
      $hb_superior_table$.setDynamicValue( Hashtables.make_hash_table( $int161$50, Symbols.symbol_function( EQUAL ), UNPROVIDED ), thread );
    }
    final SubLObject cdohash_table = $hb_superior_table$.getDynamicValue( thread );
    SubLObject key = NIL;
    SubLObject val = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        val = Hashtables.getEntryValue( cdohash_entry );
        if( val.isHashtable() && Hashtables.hash_table_count( val ).numG( ZERO_INTEGER ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 37985L)
  public static SubLObject hb_construct_superior_paths_int(SubLObject v_forts, final SubLObject eval_form, SubLObject level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = eval_form.first();
    final SubLObject alt_pred = hb_alternate_predicate( predicate );
    final SubLObject index_arg = conses_high.second( eval_form );
    final SubLObject gather_arg = conses_high.third( eval_form );
    SubLObject superiors = NIL;
    for( SubLObject all_superiors = NIL; NIL != v_forts && ( !$hb_max_height$.getDynamicValue( thread ).isInteger() || !level.numGE( $hb_max_height$.getDynamicValue(
        thread ) ) ); v_forts = all_superiors, all_superiors = NIL, superiors = NIL, level = Numbers.add( level, ONE_INTEGER ) )
    {
      SubLObject cdolist_list_var = v_forts;
      SubLObject fort = NIL;
      fort = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != kb_indexing_datastructures.indexed_term_p( fort ) )
        {
          if( $hb_mt$.getDynamicValue( thread ) == $kw45$ALL )
          {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym58$RELEVANT_MT_IS_EVERYTHING, thread );
              mt_relevance_macros.$mt$.bind( $const59$EverythingPSC, thread );
              superiors = kb_mapping_utilities.pred_values( fort, predicate, index_arg, gather_arg, UNPROVIDED );
              if( NIL != forts.valid_fortP( alt_pred ) )
              {
                superiors = conses_high.union( superiors, kb_mapping_utilities.pred_values( fort, alt_pred, index_arg, gather_arg, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
            }
          }
          else if( NIL != $hb_use_genl_mts$.getDynamicValue( thread ) )
          {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $hb_mt$.getDynamicValue( thread ) );
            final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              superiors = kb_mapping_utilities.pred_values( fort, predicate, index_arg, gather_arg, UNPROVIDED );
              if( NIL != forts.valid_fortP( alt_pred ) )
              {
                superiors = conses_high.union( superiors, kb_mapping_utilities.pred_values( fort, alt_pred, index_arg, gather_arg, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_5, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_4, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_3, thread );
            }
          }
          else
          {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( $sym202$RELEVANT_MT_IS_EQ, thread );
              mt_relevance_macros.$mt$.bind( $hb_mt$.getDynamicValue( thread ), thread );
              superiors = kb_mapping_utilities.pred_values( fort, predicate, index_arg, gather_arg, UNPROVIDED );
              if( NIL != forts.valid_fortP( alt_pred ) )
              {
                superiors = conses_high.union( superiors, kb_mapping_utilities.pred_values( fort, alt_pred, index_arg, gather_arg, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
              }
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
            }
          }
        }
        if( NIL != superiors )
        {
          SubLObject table = Hashtables.gethash( level, $hb_superior_table$.getDynamicValue( thread ), UNPROVIDED );
          if( !table.isHashtable() )
          {
            Hashtables.sethash( level, $hb_superior_table$.getDynamicValue( thread ), Hashtables.make_hash_table( $int161$50, UNPROVIDED, UNPROVIDED ) );
            table = Hashtables.gethash( level, $hb_superior_table$.getDynamicValue( thread ), UNPROVIDED );
          }
          SubLObject cdolist_list_var_$152 = superiors;
          SubLObject p = NIL;
          p = cdolist_list_var_$152.first();
          while ( NIL != cdolist_list_var_$152)
          {
            if( NIL == Hashtables.gethash( ConsesLow.list( fort, p ), $hb_table$.getDynamicValue( thread ), UNPROVIDED ) )
            {
              final SubLObject val = Hashtables.gethash( p, table, UNPROVIDED );
              Hashtables.sethash( p, table, conses_high.adjoin( fort, val, UNPROVIDED, UNPROVIDED ) );
              final SubLObject item_var = p;
              if( NIL == conses_high.member( item_var, all_superiors, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                all_superiors = ConsesLow.cons( item_var, all_superiors );
              }
              Hashtables.sethash( ConsesLow.list( fort, p ), $hb_table$.getDynamicValue( thread ), T );
            }
            cdolist_list_var_$152 = cdolist_list_var_$152.rest();
            p = cdolist_list_var_$152.first();
          }
          superiors = NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        fort = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 39807L)
  public static SubLObject hb_print_mt_list(final SubLObject pivot_term, final SubLObject c2, SubLObject pivot_term_is_to_c2)
  {
    if( pivot_term_is_to_c2 == UNPROVIDED )
    {
      pivot_term_is_to_c2 = $kw239$SUPERIOR;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    if( ( pivot_term_is_to_c2 == $kw239$SUPERIOR && $hb_index_argument$.getDynamicValue( thread ).eql( ONE_INTEGER ) ) || ( pivot_term_is_to_c2 == $kw240$INFERIOR && $hb_index_argument$.getDynamicValue( thread ).eql(
        TWO_INTEGER ) ) )
    {
      arg1 = pivot_term;
      arg2 = c2;
    }
    else if( ( pivot_term_is_to_c2 == $kw239$SUPERIOR && $hb_index_argument$.getDynamicValue( thread ).eql( TWO_INTEGER ) ) || ( pivot_term_is_to_c2 == $kw240$INFERIOR && $hb_index_argument$.getDynamicValue( thread )
        .eql( ONE_INTEGER ) ) )
    {
      arg2 = pivot_term;
      arg1 = c2;
    }
    final SubLObject some_mts = kb_indexing.gaf_mts( ConsesLow.list( $hb_predicate$.getDynamicValue( thread ), arg1, arg2 ) );
    final SubLObject mts = ( NIL != forts.valid_fortP( $hb_alternate_predicate$.getDynamicValue( thread ) ) ) ? conses_high.union( some_mts, kb_indexing.gaf_mts( ConsesLow.list( $hb_alternate_predicate$.getDynamicValue(
        thread ), arg1, arg2 ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) : some_mts;
    final SubLObject sorted_mts = Sort.sort( mts, Symbols.symbol_function( $sym134$STRING_LESSP ), Symbols.symbol_function( $sym135$COERCE_NAME ) );
    final SubLObject last = conses_high.last( sorted_mts, UNPROVIDED ).first();
    final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    if( NIL != size_val )
    {
      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( size_val );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str241$__ );
      if( NIL != sorted_mts )
      {
        SubLObject cdolist_list_var = sorted_mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
          if( !mt.equal( last ) )
          {
            html_utilities.html_princ( $str218$__ );
          }
          cdolist_list_var = cdolist_list_var.rest();
          mt = cdolist_list_var.first();
        }
      }
      else
      {
        html_utilities.html_princ( $str226$Unknown_ );
      }
      html_utilities.html_princ( $str242$_ );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 40933L)
  public static SubLObject hb_print_pivot_mts(final SubLObject pivot_term, final SubLObject v_forts, final SubLObject indent, SubLObject pivot_term_position)
  {
    if( pivot_term_position == UNPROVIDED )
    {
      pivot_term_position = $kw239$SUPERIOR;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_hb_table();
    SubLObject mt_list = NIL;
    SubLObject cdolist_list_var = v_forts;
    SubLObject c = NIL;
    c = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject arg1 = NIL;
      SubLObject arg2 = NIL;
      if( ( pivot_term_position == $kw239$SUPERIOR && $hb_index_argument$.getDynamicValue( thread ).eql( ONE_INTEGER ) ) || ( pivot_term_position == $kw240$INFERIOR && $hb_index_argument$.getDynamicValue( thread ).eql(
          TWO_INTEGER ) ) )
      {
        arg1 = pivot_term;
        arg2 = c;
      }
      else if( ( pivot_term_position == $kw239$SUPERIOR && $hb_index_argument$.getDynamicValue( thread ).eql( TWO_INTEGER ) ) || ( pivot_term_position == $kw240$INFERIOR && $hb_index_argument$.getDynamicValue( thread )
          .eql( ONE_INTEGER ) ) )
      {
        arg2 = pivot_term;
        arg1 = c;
      }
      SubLObject mts = kb_indexing.gaf_mts( ConsesLow.list( $hb_predicate$.getDynamicValue( thread ), arg1, arg2 ) );
      if( NIL != forts.valid_fortP( $hb_alternate_predicate$.getDynamicValue( thread ) ) )
      {
        mts = conses_high.union( mts, kb_indexing.gaf_mts( ConsesLow.list( $hb_alternate_predicate$.getDynamicValue( thread ), arg1, arg2 ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
      }
      SubLObject cdolist_list_var_$153 = mts;
      SubLObject mt = NIL;
      mt = cdolist_list_var_$153.first();
      while ( NIL != cdolist_list_var_$153)
      {
        hash_table_utilities.pushnew_hash( mt, c, $hb_table$.getDynamicValue( thread ), UNPROVIDED );
        final SubLObject item_var = mt;
        if( NIL == conses_high.member( item_var, mt_list, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          mt_list = ConsesLow.cons( item_var, mt_list );
        }
        cdolist_list_var_$153 = cdolist_list_var_$153.rest();
        mt = cdolist_list_var_$153.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      c = cdolist_list_var.first();
    }
    if( NIL != mt_list )
    {
      cdolist_list_var = Sort.sort( mt_list, Symbols.symbol_function( $sym134$STRING_LESSP ), Symbols.symbol_function( $sym135$COERCE_NAME ) );
      SubLObject x = NIL;
      x = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject val = Sort.sort( conses_high.copy_list( Hashtables.gethash( x, $hb_table$.getDynamicValue( thread ), UNPROVIDED ) ), Symbols.symbol_function( $sym134$STRING_LESSP ), Symbols.symbol_function(
            $sym178$HB_STRING_FOR_CONSTANT ) );
        final SubLObject last = conses_high.last( val, UNPROVIDED ).first();
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_indent( indent );
        final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
        html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
        if( NIL != size_val )
        {
          html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( size_val );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str243$_ );
          cb_utilities.cb_form( x, UNPROVIDED, UNPROVIDED );
          html_utilities.html_princ( $str244$_____ );
          SubLObject cdolist_list_var_$154 = val;
          SubLObject v = NIL;
          v = cdolist_list_var_$154.first();
          while ( NIL != cdolist_list_var_$154)
          {
            hb_print_constant( v, T );
            if( !v.equal( last ) )
            {
              html_utilities.html_princ( $str218$__ );
            }
            cdolist_list_var_$154 = cdolist_list_var_$154.rest();
            v = cdolist_list_var_$154.first();
          }
          html_utilities.html_princ( $str245$__ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        cdolist_list_var = cdolist_list_var.rest();
        x = cdolist_list_var.first();
      }
    }
    else
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
      html_utilities.html_indent( indent );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str246$_Unknown__ );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    }
    clear_hb_table();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 42459L)
  public static SubLObject hb_display_superiors()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_hb_table();
    $hb_indent$.setDynamicValue( ZERO_INTEGER, thread );
    final SubLObject superior_level_count = hb_superior_table_count();
    if( superior_level_count.numG( ZERO_INTEGER ) )
    {
      SubLObject level;
      SubLObject table;
      SubLObject cdolist_list_var;
      SubLObject v_forts;
      SubLObject c;
      for( level = NIL, level = Numbers.subtract( superior_level_count, ONE_INTEGER ); !level.numL( ZERO_INTEGER ); level = Numbers.subtract( level, ONE_INTEGER ) )
      {
        table = Hashtables.gethash( level, $hb_superior_table$.getDynamicValue( thread ), UNPROVIDED );
        v_forts = ( cdolist_list_var = Sort.sort( hash_table_utilities.list_table_keys( table ), Symbols.symbol_function( $sym247$STRING_ ), Symbols.symbol_function( $sym135$COERCE_NAME ) ) );
        c = NIL;
        c = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          hb_trace_superior_paths( NIL, c, table, level, ONE_INTEGER, T );
          cdolist_list_var = cdolist_list_var.rest();
          c = cdolist_list_var.first();
        }
      }
    }
    else if( NIL == $hb_max_height$.getDynamicValue( thread ) || $hb_max_height$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      html_utilities.html_br();
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_utilities.html_princ( $str248$No_superior_terms );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_br();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 43087L)
  public static SubLObject reset_hb_indent(final SubLObject indent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$hb_indent$.getDynamicValue( thread ).numGE( indent ) )
    {
      $hb_indent$.setDynamicValue( indent, thread );
    }
    return $hb_indent$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 43217L)
  public static SubLObject hb_trace_superior_paths(final SubLObject previous, final SubLObject c, final SubLObject table, final SubLObject level, final SubLObject indent, final SubLObject starting_levelP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject quant = Numbers.multiply( indent, $hb_indent_quantum$.getDynamicValue( thread ) );
    final SubLObject next_forts = Sort.sort( Hashtables.gethash( c, table, UNPROVIDED ), Symbols.symbol_function( $sym247$STRING_ ), Symbols.symbol_function( $sym135$COERCE_NAME ) );
    final SubLObject next_level = Numbers.subtract( level, ONE_INTEGER );
    final SubLObject next_table = Hashtables.gethash( next_level, $hb_superior_table$.getDynamicValue( thread ), UNPROVIDED );
    final SubLObject next_indent = Numbers.add( indent, ONE_INTEGER );
    final SubLObject _prev_bind_0 = $hb_eval_form$.currentBinding( thread );
    try
    {
      $hb_eval_form$.bind( $hb_inverse_eval_form$.getDynamicValue( thread ), thread );
      SubLObject printing_fortP = NIL;
      SubLObject notice_printedP = NIL;
      if( NIL == Hashtables.gethash( ConsesLow.list( c, level ), $hb_table$.getDynamicValue( thread ), UNPROVIDED ) || NIL == starting_levelP )
      {
        printing_fortP = T;
        if( NIL != starting_levelP )
        {
          final SubLObject sign = ( NIL != hb_get_nodes( c, UNPROVIDED ) ) ? $hb_more_superiors_sign$.getDynamicValue( thread ) : $hb_top_sign$.getDynamicValue( thread );
          final SubLObject len = Sequences.length( sign );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_indent( Numbers.subtract( quant, $hb_indent_quantum$.getDynamicValue( thread ) ) );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), sign );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_indent( Numbers.subtract( quant, len ) );
          hb_print_constant( c, T );
          if( NIL == kb_indexing_datastructures.indexed_term_p( c ) )
          {
            final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != size_val )
            {
              html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( size_val );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str249$__not_an_indexed_term_ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$155, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        else
        {
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_indent( quant );
          hb_print_constant( c, T );
          if( NIL == kb_indexing_datastructures.indexed_term_p( c ) )
          {
            final SubLObject size_val2 = $hb_small_font_size$.getDynamicValue( thread );
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != size_val2 )
            {
              html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( size_val2 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str249$__not_an_indexed_term_ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$156, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        $hb_counter$.setDynamicValue( Numbers.add( $hb_counter$.getDynamicValue( thread ), ONE_INTEGER ), thread );
        reset_hb_indent( indent );
        if( NIL != $hb_show_mts$.getDynamicValue( thread ) && NIL != previous )
        {
          hb_print_mt_list( c, previous, $kw240$INFERIOR );
        }
      }
      Hashtables.sethash( ConsesLow.list( c, level ), $hb_table$.getDynamicValue( thread ), T );
      SubLObject cdolist_list_var = next_forts;
      SubLObject next = NIL;
      next = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        hash_table_utilities.cinc_hash( ConsesLow.list( c, next ), $hb_table$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        final SubLObject count = Hashtables.gethash( ConsesLow.list( c, next ), $hb_table$.getDynamicValue( thread ), UNPROVIDED );
        if( count.numL( TWO_INTEGER ) )
        {
          hb_maybe_print_comments( c );
          if( level.numG( ZERO_INTEGER ) )
          {
            hb_trace_superior_paths( c, next, next_table, next_level, next_indent, NIL );
          }
        }
        else if( count.numGE( TWO_INTEGER ) && NIL != printing_fortP && level.numG( ZERO_INTEGER ) && NIL == notice_printedP )
        {
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $hb_more_inferiors_sign$.getDynamicValue( thread ) );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          final SubLObject size_val3 = $hb_small_font_size$.getDynamicValue( thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val3 )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val3 );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $hb_cycle_sign$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$157, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          hb_maybe_print_comments( c );
          notice_printedP = T;
        }
        cdolist_list_var = cdolist_list_var.rest();
        next = cdolist_list_var.first();
      }
    }
    finally
    {
      $hb_eval_form$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 45100L)
  public static SubLObject hb_display_term(final SubLObject fort, final SubLObject indent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $hb_eval_form$.currentBinding( thread );
    try
    {
      $hb_eval_form$.bind( $hb_inverse_eval_form$.getDynamicValue( thread ), thread );
      final SubLObject superiors = hb_get_nodes( fort, UNPROVIDED );
      final SubLObject amount = Numbers.multiply( indent, $hb_indent_quantum$.getDynamicValue( thread ) );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
      html_utilities.html_indent( amount );
      final SubLObject size_val = $hb_large_font_size$.getDynamicValue( thread );
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      if( NIL != size_val )
      {
        html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( size_val );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        hb_print_constant( fort, T );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$158, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      $hb_counter$.setDynamicValue( Numbers.add( $hb_counter$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      if( NIL != $hb_show_mts$.getDynamicValue( thread ) && NIL != superiors )
      {
        hb_print_pivot_mts( fort, superiors, amount, $kw240$INFERIOR );
      }
      hb_maybe_print_comments( fort );
    }
    finally
    {
      $hb_eval_form$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 45568L)
  public static SubLObject hb_print_nodes_2(final SubLObject fort, final SubLObject max, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $hb_previous_term_id$.currentBinding( thread );
    try
    {
      $hb_previous_term_id$.bind( ( NIL != $hb_previous_term_id$.getDynamicValue( thread ) ) ? $hb_previous_term_id$.getDynamicValue( thread )
          : cb_utilities.cb_fort_identifier( $hb_pivot_term$.getDynamicValue( thread ) ), thread );
      final SubLObject previous = cb_utilities.cb_guess_fort( $hb_previous_term_id$.getDynamicValue( thread ), UNPROVIDED );
      final SubLObject id = ( NIL != forts.valid_fortP( fort ) ) ? cb_utilities.cb_fort_identifier( fort ) : NIL;
      final SubLObject already_printedP = Hashtables.gethash( id, $hb_duplicates_table$.getDynamicValue( thread ), UNPROVIDED );
      final SubLObject index = Numbers.multiply( depth, $hb_indent_quantum$.getDynamicValue( thread ) );
      final SubLObject nodes = hb_get_nodes( fort, UNPROVIDED );
      final SubLObject sorted_nodes = Sort.sort( nodes, Symbols.symbol_function( $sym134$STRING_LESSP ), Symbols.symbol_function( $sym178$HB_STRING_FOR_CONSTANT ) );
      if( NIL != id && ( NIL == max || depth.numL( max ) ) )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_indent( index );
        Hashtables.sethash( id, $hb_duplicates_table$.getDynamicValue( thread ), T );
        hb_print_constant( fort, T );
        $hb_counter$.setDynamicValue( Numbers.add( $hb_counter$.getDynamicValue( thread ), ONE_INTEGER ), thread );
        if( NIL != previous && NIL != $hb_show_mts$.getDynamicValue( thread ) )
        {
          hb_print_mt_list( fort, previous, $kw240$INFERIOR );
        }
        if( NIL != already_printedP )
        {
          if( NIL != nodes )
          {
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $hb_more_inferiors_sign$.getDynamicValue( thread ) );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != size_val )
            {
              html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( size_val );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $hb_cycle_sign$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$159, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          else
          {
            html_utilities.html_princ( $hb_bottom_sign$.getDynamicValue( thread ) );
          }
        }
        else if( max.isInteger() && depth.numLE( Numbers.subtract( max, ONE_INTEGER ) ) )
        {
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          if( NIL != nodes )
          {
            if( depth.numE( Numbers.subtract( max, ONE_INTEGER ) ) )
            {
              html_utilities.html_princ( $hb_more_inferiors_sign$.getDynamicValue( thread ) );
            }
          }
          else
          {
            html_utilities.html_princ( $hb_bottom_sign$.getDynamicValue( thread ) );
          }
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        else if( NIL == max && NIL == nodes )
        {
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $hb_bottom_sign$.getDynamicValue( thread ) );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        hb_maybe_print_comments( fort );
        if( NIL == already_printedP )
        {
          SubLObject cdolist_list_var = sorted_nodes;
          SubLObject node = NIL;
          node = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject _prev_bind_0_$160 = $hb_previous_term_id$.currentBinding( thread );
            try
            {
              $hb_previous_term_id$.bind( id, thread );
              hb_print_nodes_2( node, max, Numbers.add( depth, ONE_INTEGER ) );
            }
            finally
            {
              $hb_previous_term_id$.rebind( _prev_bind_0_$160, thread );
            }
            cdolist_list_var = cdolist_list_var.rest();
            node = cdolist_list_var.first();
          }
        }
      }
      else if( NIL == max || depth.numL( max ) )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_indent( index );
        cb_utilities.cb_form( fort, UNPROVIDED, UNPROVIDED );
        final SubLObject size_val = $hb_small_font_size$.getDynamicValue( thread );
        html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
        if( NIL != size_val )
        {
          html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( size_val );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$161 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( $str249$__not_an_indexed_term_ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$161, thread );
        }
        html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
    }
    finally
    {
      $hb_previous_term_id$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 47291L)
  public static SubLObject hb_display_inferiors(final SubLObject fort, final SubLObject depth, final SubLObject indent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_hb_duplicates_table();
    if( !$hb_max_depth$.getDynamicValue( thread ).equal( ZERO_INTEGER ) )
    {
      final SubLObject id = cb_utilities.cb_fort_identifier( fort );
      final SubLObject nodes = hb_get_nodes( fort, UNPROVIDED );
      final SubLObject sorted_nodes = Sort.sort( nodes, Symbols.symbol_function( $sym134$STRING_LESSP ), Symbols.symbol_function( $sym178$HB_STRING_FOR_CONSTANT ) );
      final SubLObject new_depth = depth.isInteger() ? Numbers.add( indent, depth ) : NIL;
      if( NIL != sorted_nodes && !depth.equal( ZERO_INTEGER ) )
      {
        SubLObject cdolist_list_var = sorted_nodes;
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject _prev_bind_0 = $hb_previous_term_id$.currentBinding( thread );
          try
          {
            $hb_previous_term_id$.bind( id, thread );
            hb_print_nodes_2( node, new_depth, indent );
            html_utilities.html_flush();
          }
          finally
          {
            $hb_previous_term_id$.rebind( _prev_bind_0, thread );
          }
          cdolist_list_var = cdolist_list_var.rest();
          node = cdolist_list_var.first();
        }
      }
      else
      {
        html_utilities.html_br();
        html_utilities.html_br();
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( $str250$No_inferior_terms );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
    }
    clear_hb_duplicates_table();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 47967L)
  public static SubLObject hb_print_nodes_1(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$hb_indent_quantum$.getDynamicValue( thread ).isInteger() || !$hb_indent_quantum$.getDynamicValue( thread ).numGE( ZERO_INTEGER ) )
    {
      $hb_indent_quantum$.setDynamicValue( TWO_INTEGER, thread );
    }
    hb_compute_allowable_depth( fort );
    SubLObject index = ONE_INTEGER;
    hb_construct_superior_paths( fort );
    hb_display_superiors();
    index = Numbers.add( $hb_indent$.getDynamicValue( thread ), ONE_INTEGER );
    hb_display_term( fort, index );
    index = Numbers.add( index, ONE_INTEGER );
    hb_display_inferiors( fort, $hb_computed_max_depth$.getDynamicValue( thread ), index );
    if( $hb_counter$.getDynamicValue( thread ).numG( $hb_reset_parameter_notice_threshhold$.getDynamicValue( thread ) ) )
    {
      html_utilities.html_br();
      html_utilities.html_br();
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_hash, UNPROVIDED );
      html_utilities.html_markup( $str76$top );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str251$Go_to_Top );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    $hb_counter$.setDynamicValue( ZERO_INTEGER, thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 48656L)
  public static SubLObject hb_compute_allowable_depth(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $hb_computed_max_depth$.setDynamicValue( ZERO_INTEGER, thread );
    if( $hb_max_depth$.getDynamicValue( thread ).equal( ONE_INTEGER ) )
    {
      $hb_computed_max_depth$.setDynamicValue( ONE_INTEGER, thread );
    }
    else if( NIL == $hb_max_depth$.getDynamicValue( thread ) && ( !$hb_max_inferiors$.getDynamicValue( thread ).isInteger() || !$hb_max_inferiors$.getDynamicValue( thread ).numGE( ZERO_INTEGER ) ) )
    {
      $hb_computed_max_depth$.setDynamicValue( NIL, thread );
    }
    else if( NIL == $hb_max_depth$.getDynamicValue( thread ) )
    {
      $hb_computed_max_depth$.setDynamicValue( $hb_max_depth$.getDynamicValue( thread ), thread );
    }
    else
    {
      $hb_counter$.setDynamicValue( ZERO_INTEGER, thread );
      SubLObject level = ZERO_INTEGER;
      SubLObject last_count = ZERO_INTEGER;
      SubLObject nodes = ConsesLow.list( fort );
      SubLObject temp = NIL;
      while ( NIL != nodes && ( !$hb_max_inferiors$.getDynamicValue( thread ).isInteger() || !$hb_counter$.getDynamicValue( thread ).numG( $hb_max_inferiors$.getDynamicValue( thread ) ) || !level.numG( ONE_INTEGER ) )
          && ( !$hb_max_depth$.getDynamicValue( thread ).isInteger() || !level.numG( $hb_max_depth$.getDynamicValue( thread ) ) ))
      {
        SubLObject doneP = NIL;
        if( NIL == doneP )
        {
          SubLObject csome_list_var = nodes;
          SubLObject node = NIL;
          node = csome_list_var.first();
          while ( NIL == doneP && NIL != csome_list_var)
          {
            final SubLObject new_nodes = hb_get_nodes( node, UNPROVIDED );
            temp = ConsesLow.append( temp, new_nodes );
            last_count = $hb_counter$.getDynamicValue( thread );
            $hb_counter$.setDynamicValue( Numbers.add( $hb_counter$.getDynamicValue( thread ), Sequences.length( new_nodes ) ), thread );
            if( $hb_max_inferiors$.getDynamicValue( thread ).isInteger() && $hb_counter$.getDynamicValue( thread ).numG( $hb_max_inferiors$.getDynamicValue( thread ) ) )
            {
              doneP = T;
            }
            csome_list_var = csome_list_var.rest();
            node = csome_list_var.first();
          }
        }
        nodes = temp;
        temp = NIL;
        level = Numbers.add( level, ONE_INTEGER );
        if( NIL != $hb_debug$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str252$____ );
          PrintLow.format( T, $str253$____Level_finished___s, level );
          PrintLow.format( T, $str254$__ );
          PrintLow.format( T, $str255$_______Total_count___s, $hb_counter$.getDynamicValue( thread ) );
        }
      }
      $hb_counter$.setDynamicValue( last_count, thread );
      $hb_computed_max_depth$.setDynamicValue( Numbers.subtract( level, ONE_INTEGER ), thread );
      if( NIL != $hb_debug$.getDynamicValue( thread ) )
      {
        PrintLow.format( T, $str252$____ );
        PrintLow.format( T, $str256$Computed_max_depth___s, $hb_computed_max_depth$.getDynamicValue( thread ) );
      }
    }
    $hb_counter$.setDynamicValue( ZERO_INTEGER, thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 50206L)
  public static SubLObject hb_start(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    hb_init();
    hb_parameters( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 50387L)
  public static SubLObject cb_link_hierarchy_browser(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str258$Hier;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw259$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str260$hb_start );
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

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 50675L)
  public static SubLObject cb_hier_default(final SubLObject args)
  {
    SubLObject fort_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list265 );
    fort_spec = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      SubLObject fort = NIL;
      fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
      if( NIL == forts.fort_p( fort ) )
      {
        return cb_utilities.cb_error( $str266$Could_not_determine_a_term_from__, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cb_hier_default_internal( fort );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list265 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 50997L)
  public static SubLObject cb_hier_default_internal(final SubLObject fort)
  {
    hb_set_defaults_for_type( fort );
    return hb_print_nodes( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 51160L)
  public static SubLObject cb_hier(final SubLObject args)
  {
    SubLObject fort_spec = NIL;
    SubLObject arg_string = NIL;
    SubLObject pred_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list268 );
    fort_spec = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list268 );
    arg_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list268 );
    pred_spec = current.first();
    current = current.rest();
    final SubLObject mt_spec = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, args, $list268 );
    current = current.rest();
    if( NIL == current )
    {
      SubLObject fort = NIL;
      SubLObject arg = NIL;
      SubLObject predicate = NIL;
      SubLObject mt = NIL;
      fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
      if( NIL == forts.fort_p( fort ) )
      {
        return cb_utilities.cb_error( $str266$Could_not_determine_a_term_from__, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      arg = reader.read_from_string_ignoring_errors( arg_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
      if( !arg.isFixnum() )
      {
        return cb_utilities.cb_error( $str269$Could_not_determine_an_arg_from__, arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      predicate = cb_utilities.cb_guess_fort( pred_spec, UNPROVIDED );
      if( NIL == forts.fort_p( predicate ) )
      {
        return cb_utilities.cb_error( $str266$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != mt_spec )
      {
        mt = cb_utilities.cb_guess_term( mt_spec, UNPROVIDED );
        if( NIL == hlmt.hlmt_p( mt ) )
        {
          return cb_utilities.cb_error( $str266$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      cb_hier_internal( fort, arg, predicate, mt );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list268 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/hierarchy-browser.lisp", position = 52022L)
  public static SubLObject cb_hier_internal(final SubLObject fort, final SubLObject arg, final SubLObject predicate, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject default_form = Sequences.find( predicate, $hb_type_default_forms$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym271$SECOND ), UNPROVIDED, UNPROVIDED );
    $hb_pivot_term$.setDynamicValue( fort, thread );
    $hb_predicate$.setDynamicValue( predicate, thread );
    $hb_mt$.setDynamicValue( ( NIL != mt ) ? mt : $kw45$ALL, thread );
    if( $hb_mt$.getDynamicValue( thread ) != $kw45$ALL )
    {
      $hb_use_genl_mts$.setDynamicValue( T, thread );
    }
    $hb_index_argument$.setDynamicValue( ( NIL != default_form ) ? conses_high.third( default_form ) : arg, thread );
    $hb_gather_argument$.setDynamicValue( $hb_index_argument$.getDynamicValue( thread ).numE( ONE_INTEGER ) ? TWO_INTEGER : ONE_INTEGER, thread );
    $hb_max_height$.setDynamicValue( TWO_INTEGER, thread );
    $hb_max_depth$.setDynamicValue( TWO_INTEGER, thread );
    return hb_print_nodes( UNPROVIDED );
  }

  public static SubLObject declare_hierarchy_browser_file()
  {
    SubLFiles.declareFunction( me, "hb_default_method_info", "HB-DEFAULT-METHOD-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_default_method_availableP", "HB-DEFAULT-METHOD-AVAILABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_default_hb_icon", "SET-DEFAULT-HB-ICON", 0, 0, false );
    SubLFiles.declareFunction( me, "hb_debug", "HB-DEBUG", 0, 0, false );
    SubLFiles.declareFunction( me, "hb_no_debug", "HB-NO-DEBUG", 0, 0, false );
    SubLFiles.declareFunction( me, "hb_message", "HB-MESSAGE", 0, 3, false );
    SubLFiles.declareFunction( me, "hb_show_parameters", "HB-SHOW-PARAMETERS", 0, 1, false );
    SubLFiles.declareFunction( me, "hb_show_colors_and_symbols", "HB-SHOW-COLORS-AND-SYMBOLS", 0, 1, false );
    SubLFiles.declareFunction( me, "sorted_gaf_mts", "SORTED-GAF-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "hb_parameters", "HB-PARAMETERS", 0, 1, false );
    SubLFiles.declareFunction( me, "hb_colors_and_symbols", "HB-COLORS-AND-SYMBOLS", 0, 1, false );
    SubLFiles.declareFunction( me, "hb_binary_predicateP", "HB-BINARY-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_handle_parameters", "HB-HANDLE-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_handle_colors_and_symbols", "HB-HANDLE-COLORS-AND-SYMBOLS", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_set_defaults_for_type", "HB-SET-DEFAULTS-FOR-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_simple_choose_constants", "HB-SIMPLE-CHOOSE-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_handle_simple_choose_constants", "HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS", 0, 1, false );
    SubLFiles.declareFunction( me, "hb_choose_constants", "HB-CHOOSE-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_complex_choose_constants", "HB-COMPLEX-CHOOSE-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_handle_complex_choose_constants", "HB-HANDLE-COMPLEX-CHOOSE-CONSTANTS", 0, 1, false );
    SubLFiles.declareFunction( me, "hb_select_node", "HB-SELECT-NODE", 0, 1, false );
    SubLFiles.declareFunction( me, "set_hb_eval_form", "SET-HB-EVAL-FORM", 0, 0, false );
    SubLFiles.declareFunction( me, "hb_alternate_predicate", "HB-ALTERNATE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_hb_alternate_predicate", "SET-HB-ALTERNATE-PREDICATE", 0, 0, false );
    SubLFiles.declareFunction( me, "hb_get_nodes", "HB-GET-NODES", 1, 1, false );
    SubLFiles.declareFunction( me, "hb_comments", "HB-COMMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_maybe_print_comments", "HB-MAYBE-PRINT-COMMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_string_for_constant", "HB-STRING-FOR-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_print_constant", "HB-PRINT-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction( me, "hb_accessor", "HB-ACCESSOR", 2, 1, false );
    SubLFiles.declareFunction( me, "hb_status_heading", "HB-STATUS-HEADING", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_hb_table", "CLEAR-HB-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_hb_duplicates_table", "CLEAR-HB-DUPLICATES-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_hb_superior_table", "CLEAR-HB-SUPERIOR-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "hb_init", "HB-INIT", 0, 0, false );
    SubLFiles.declareFunction( me, "hb_bar", "HB-BAR", 0, 1, false );
    SubLFiles.declareFunction( me, "hb_print_nodes", "HB-PRINT-NODES", 0, 1, false );
    SubLFiles.declareFunction( me, "hb_construct_superior_paths", "HB-CONSTRUCT-SUPERIOR-PATHS", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_superior_table_count", "HB-SUPERIOR-TABLE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "hb_construct_superior_paths_int", "HB-CONSTRUCT-SUPERIOR-PATHS-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "hb_print_mt_list", "HB-PRINT-MT-LIST", 2, 1, false );
    SubLFiles.declareFunction( me, "hb_print_pivot_mts", "HB-PRINT-PIVOT-MTS", 3, 1, false );
    SubLFiles.declareFunction( me, "hb_display_superiors", "HB-DISPLAY-SUPERIORS", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_hb_indent", "RESET-HB-INDENT", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_trace_superior_paths", "HB-TRACE-SUPERIOR-PATHS", 6, 0, false );
    SubLFiles.declareFunction( me, "hb_display_term", "HB-DISPLAY-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "hb_print_nodes_2", "HB-PRINT-NODES-2", 3, 0, false );
    SubLFiles.declareFunction( me, "hb_display_inferiors", "HB-DISPLAY-INFERIORS", 3, 0, false );
    SubLFiles.declareFunction( me, "hb_print_nodes_1", "HB-PRINT-NODES-1", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_compute_allowable_depth", "HB-COMPUTE-ALLOWABLE-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "hb_start", "HB-START", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_hierarchy_browser", "CB-LINK-HIERARCHY-BROWSER", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_hier_default", "CB-HIER-DEFAULT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hier_default_internal", "CB-HIER-DEFAULT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hier", "CB-HIER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_hier_internal", "CB-HIER-INTERNAL", 3, 1, false );
    return NIL;
  }

  public static SubLObject init_hierarchy_browser_file()
  {
    $hb_type_default_forms$ = SubLFiles.defparameter( "*HB-TYPE-DEFAULT-FORMS*", $list0 );
    $hb_alternate_predicates$ = SubLFiles.defparameter( "*HB-ALTERNATE-PREDICATES*", $list1 );
    $hb_icon_choices$ = SubLFiles.defparameter( "*HB-ICON-CHOICES*", $list9 );
    $hb_bar_choice$ = SubLFiles.defparameter( "*HB-BAR-CHOICE*", $kw10$CELTIC_BAR );
    $hb_previous_term_id$ = SubLFiles.defparameter( "*HB-PREVIOUS-TERM-ID*", NIL );
    $hb_icon$ = SubLFiles.defparameter( "*HB-ICON*", NIL );
    $hb_bar$ = SubLFiles.defparameter( "*HB-BAR*", NIL );
    $hb_top_sign$ = SubLFiles.defparameter( "*HB-TOP-SIGN*", $str14$___ );
    $hb_bottom_sign$ = SubLFiles.defparameter( "*HB-BOTTOM-SIGN*", $str16$___ );
    $hb_more_superiors_sign$ = SubLFiles.defparameter( "*HB-MORE-SUPERIORS-SIGN*", $str18$____ );
    $hb_more_inferiors_sign$ = SubLFiles.defparameter( "*HB-MORE-INFERIORS-SIGN*", $str20$____ );
    $hb_cycle_sign$ = SubLFiles.defparameter( "*HB-CYCLE-SIGN*", $str22$__see_above_ );
    $hb_large_font_size$ = SubLFiles.defparameter( "*HB-LARGE-FONT-SIZE*", FIVE_INTEGER );
    $hb_small_font_size$ = SubLFiles.defparameter( "*HB-SMALL-FONT-SIZE*", TWO_INTEGER );
    $hb_tiny_font_size$ = SubLFiles.defparameter( "*HB-TINY-FONT-SIZE*", ONE_INTEGER );
    $hb_pivot_term$ = SubLFiles.defparameter( "*HB-PIVOT-TERM*", NIL );
    $hb_table$ = SubLFiles.defparameter( "*HB-TABLE*", NIL );
    $hb_superior_table$ = SubLFiles.defparameter( "*HB-SUPERIOR-TABLE*", NIL );
    $hb_duplicates_table$ = SubLFiles.defparameter( "*HB-DUPLICATES-TABLE*", NIL );
    $hb_indent_quantum$ = SubLFiles.defparameter( "*HB-INDENT-QUANTUM*", THREE_INTEGER );
    $hb_indent$ = SubLFiles.defparameter( "*HB-INDENT*", ZERO_INTEGER );
    $hb_counter$ = SubLFiles.defparameter( "*HB-COUNTER*", ZERO_INTEGER );
    $hb_reset_parameter_notice_threshhold$ = SubLFiles.defparameter( "*HB-RESET-PARAMETER-NOTICE-THRESHHOLD*", TEN_INTEGER );
    $hb_use_defaults_for_type$ = SubLFiles.defparameter( "*HB-USE-DEFAULTS-FOR-TYPE*", NIL );
    $hb_alternate_predicate$ = SubLFiles.defparameter( "*HB-ALTERNATE-PREDICATE*", NIL );
    $hb_use_lexicon$ = SubLFiles.defparameter( "*HB-USE-LEXICON*", NIL );
    $hb_computed_max_depth$ = SubLFiles.defparameter( "*HB-COMPUTED-MAX-DEPTH*", ZERO_INTEGER );
    $hb_max_depth$ = SubLFiles.defparameter( "*HB-MAX-DEPTH*", FOUR_INTEGER );
    $hb_max_height$ = SubLFiles.defparameter( "*HB-MAX-HEIGHT*", FOUR_INTEGER );
    $hb_max_inferiors$ = SubLFiles.defparameter( "*HB-MAX-INFERIORS*", $int41$200 );
    $hb_show_comments$ = SubLFiles.defparameter( "*HB-SHOW-COMMENTS*", NIL );
    $hb_show_mts$ = SubLFiles.defparameter( "*HB-SHOW-MTS*", T );
    $hb_mt$ = SubLFiles.defparameter( "*HB-MT*", $kw45$ALL );
    $hb_predicate$ = SubLFiles.defparameter( "*HB-PREDICATE*", NIL );
    $hb_index_argument$ = SubLFiles.defparameter( "*HB-INDEX-ARGUMENT*", TWO_INTEGER );
    $hb_gather_argument$ = SubLFiles.defparameter( "*HB-GATHER-ARGUMENT*", ONE_INTEGER );
    $hb_use_genl_mts$ = SubLFiles.defparameter( "*HB-USE-GENL-MTS*", NIL );
    $hb_background_color$ = SubLFiles.defparameter( "*HB-BACKGROUND-COLOR*", $kw51$LIGHT_GRAY );
    $hb_message_color$ = SubLFiles.defparameter( "*HB-MESSAGE-COLOR*", $kw53$RED );
    $hb_message$ = SubLFiles.defparameter( "*HB-MESSAGE*", NIL );
    $hb_eval_form$ = SubLFiles.defparameter( "*HB-EVAL-FORM*", NIL );
    $hb_inverse_eval_form$ = SubLFiles.defparameter( "*HB-INVERSE-EVAL-FORM*", NIL );
    $hb_debug$ = SubLFiles.defparameter( "*HB-DEBUG*", NIL );
    return NIL;
  }

  public static SubLObject setup_hierarchy_browser_file()
  {
    Hashtables.sethash( $kw2$YELLOW_STAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str3$star_gif, $str4$_ ) );
    Hashtables.sethash( $kw5$GREEN_STAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str6$grnstar_gif, $str4$_ ) );
    Hashtables.sethash( $kw7$CYAN_STAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str8$cyanstar_gif, $str4$_ ) );
    Hashtables.sethash( $kw10$CELTIC_BAR, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str11$celtic_bar_gif, NIL ) );
    utilities_macros.register_html_state_variable( $sym12$_HB_ICON_ );
    utilities_macros.register_html_interface_variable( $sym12$_HB_ICON_ );
    utilities_macros.register_html_state_variable( $sym13$_HB_BAR_ );
    utilities_macros.register_html_interface_variable( $sym13$_HB_BAR_ );
    utilities_macros.register_html_state_variable( $sym15$_HB_TOP_SIGN_ );
    utilities_macros.register_html_interface_variable( $sym15$_HB_TOP_SIGN_ );
    utilities_macros.register_html_state_variable( $sym17$_HB_BOTTOM_SIGN_ );
    utilities_macros.register_html_interface_variable( $sym17$_HB_BOTTOM_SIGN_ );
    utilities_macros.register_html_state_variable( $sym19$_HB_MORE_SUPERIORS_SIGN_ );
    utilities_macros.register_html_interface_variable( $sym19$_HB_MORE_SUPERIORS_SIGN_ );
    utilities_macros.register_html_state_variable( $sym21$_HB_MORE_INFERIORS_SIGN_ );
    utilities_macros.register_html_interface_variable( $sym21$_HB_MORE_INFERIORS_SIGN_ );
    utilities_macros.register_html_state_variable( $sym23$_HB_CYCLE_SIGN_ );
    utilities_macros.register_html_interface_variable( $sym23$_HB_CYCLE_SIGN_ );
    utilities_macros.register_html_state_variable( $sym24$_HB_LARGE_FONT_SIZE_ );
    utilities_macros.register_html_state_variable( $sym25$_HB_SMALL_FONT_SIZE_ );
    utilities_macros.register_html_state_variable( $sym26$_HB_TINY_FONT_SIZE_ );
    utilities_macros.register_html_state_variable( $sym27$_HB_PIVOT_TERM_ );
    utilities_macros.register_html_state_variable( $sym28$_HB_TABLE_ );
    utilities_macros.register_html_state_variable( $sym29$_HB_SUPERIOR_TABLE_ );
    utilities_macros.register_html_state_variable( $sym30$_HB_DUPLICATES_TABLE_ );
    utilities_macros.register_html_state_variable( $sym31$_HB_INDENT_QUANTUM_ );
    utilities_macros.register_html_interface_variable( $sym31$_HB_INDENT_QUANTUM_ );
    utilities_macros.register_html_state_variable( $sym32$_HB_INDENT_ );
    utilities_macros.register_html_state_variable( $sym33$_HB_COUNTER_ );
    utilities_macros.register_html_state_variable( $sym34$_HB_RESET_PARAMETER_NOTICE_THRESHHOLD_ );
    utilities_macros.register_html_state_variable( $sym35$_HB_USE_DEFAULTS_FOR_TYPE_ );
    utilities_macros.register_html_state_variable( $sym36$_HB_ALTERNATE_PREDICATE_ );
    utilities_macros.register_html_state_variable( $sym37$_HB_USE_LEXICON_ );
    utilities_macros.register_html_interface_variable( $sym37$_HB_USE_LEXICON_ );
    utilities_macros.register_html_state_variable( $sym38$_HB_COMPUTED_MAX_DEPTH_ );
    utilities_macros.register_html_state_variable( $sym39$_HB_MAX_DEPTH_ );
    utilities_macros.register_html_interface_variable( $sym39$_HB_MAX_DEPTH_ );
    utilities_macros.register_html_state_variable( $sym40$_HB_MAX_HEIGHT_ );
    utilities_macros.register_html_interface_variable( $sym40$_HB_MAX_HEIGHT_ );
    utilities_macros.register_html_state_variable( $sym42$_HB_MAX_INFERIORS_ );
    utilities_macros.register_html_interface_variable( $sym42$_HB_MAX_INFERIORS_ );
    utilities_macros.register_html_state_variable( $sym43$_HB_SHOW_COMMENTS_ );
    utilities_macros.register_html_interface_variable( $sym43$_HB_SHOW_COMMENTS_ );
    utilities_macros.register_html_state_variable( $sym44$_HB_SHOW_MTS_ );
    utilities_macros.register_html_interface_variable( $sym44$_HB_SHOW_MTS_ );
    utilities_macros.register_html_state_variable( $sym46$_HB_MT_ );
    utilities_macros.register_html_interface_variable( $sym46$_HB_MT_ );
    utilities_macros.register_html_state_variable( $sym47$_HB_PREDICATE_ );
    utilities_macros.register_html_state_variable( $sym48$_HB_INDEX_ARGUMENT_ );
    utilities_macros.register_html_interface_variable( $sym48$_HB_INDEX_ARGUMENT_ );
    utilities_macros.register_html_state_variable( $sym49$_HB_GATHER_ARGUMENT_ );
    utilities_macros.register_html_state_variable( $sym50$_HB_USE_GENL_MTS_ );
    utilities_macros.register_html_interface_variable( $sym50$_HB_USE_GENL_MTS_ );
    utilities_macros.register_html_state_variable( $sym52$_HB_BACKGROUND_COLOR_ );
    utilities_macros.register_html_interface_variable( $sym52$_HB_BACKGROUND_COLOR_ );
    utilities_macros.register_html_state_variable( $sym54$_HB_MESSAGE_COLOR_ );
    utilities_macros.register_html_interface_variable( $sym54$_HB_MESSAGE_COLOR_ );
    utilities_macros.register_html_state_variable( $sym55$_HB_MESSAGE_ );
    utilities_macros.register_html_state_variable( $sym56$_HB_EVAL_FORM_ );
    utilities_macros.register_html_state_variable( $sym57$_HB_INVERSE_EVAL_FORM_ );
    Hashtables.sethash( $kw136$HB_PARAMETERS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str137$hb_parameters_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym147$HB_PARAMETERS, $kw148$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym153$HB_COLORS_AND_SYMBOLS, $kw148$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym170$HB_HANDLE_PARAMETERS, $kw148$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym174$HB_HANDLE_COLORS_AND_SYMBOLS, $kw148$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym189$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS, $kw148$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym200$HB_HANDLE_COMPLEX_CHOOSE_CONSTANTS, $kw148$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym201$HB_SELECT_NODE, $kw148$HTML_HANDLER );
    Hashtables.sethash( $kw231$HB_PRINT_NODES, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str232$hb_print_nodes_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym238$HB_PRINT_NODES, $kw148$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym257$HB_START, $kw148$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw261$HIERARCHY_BROWSER, $sym262$CB_LINK_HIERARCHY_BROWSER, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw261$HIERARCHY_BROWSER, $str263$Hierarchy_Browser, $str258$Hier, $str264$The_Hierarchy_Browser );
    html_macros.note_cgi_handler_function( $sym267$CB_HIER_DEFAULT, $kw148$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym270$CB_HIER, $kw148$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_hierarchy_browser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_hierarchy_browser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_hierarchy_browser_file();
  }
  static
  {
    me = new hierarchy_browser();
    $hb_type_default_forms$ = null;
    $hb_alternate_predicates$ = null;
    $hb_icon_choices$ = null;
    $hb_bar_choice$ = null;
    $hb_previous_term_id$ = null;
    $hb_icon$ = null;
    $hb_bar$ = null;
    $hb_top_sign$ = null;
    $hb_bottom_sign$ = null;
    $hb_more_superiors_sign$ = null;
    $hb_more_inferiors_sign$ = null;
    $hb_cycle_sign$ = null;
    $hb_large_font_size$ = null;
    $hb_small_font_size$ = null;
    $hb_tiny_font_size$ = null;
    $hb_pivot_term$ = null;
    $hb_table$ = null;
    $hb_superior_table$ = null;
    $hb_duplicates_table$ = null;
    $hb_indent_quantum$ = null;
    $hb_indent$ = null;
    $hb_counter$ = null;
    $hb_reset_parameter_notice_threshhold$ = null;
    $hb_use_defaults_for_type$ = null;
    $hb_alternate_predicate$ = null;
    $hb_use_lexicon$ = null;
    $hb_computed_max_depth$ = null;
    $hb_max_depth$ = null;
    $hb_max_height$ = null;
    $hb_max_inferiors$ = null;
    $hb_show_comments$ = null;
    $hb_show_mts$ = null;
    $hb_mt$ = null;
    $hb_predicate$ = null;
    $hb_index_argument$ = null;
    $hb_gather_argument$ = null;
    $hb_use_genl_mts$ = null;
    $hb_background_color$ = null;
    $hb_message_color$ = null;
    $hb_message$ = null;
    $hb_eval_form$ = null;
    $hb_inverse_eval_form$ = null;
    $hb_debug$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ), TWO_INTEGER, ONE_INTEGER,
        TWO_INTEGER, TWO_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), TWO_INTEGER,
            ONE_INTEGER, FIVE_INTEGER, FIVE_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ), constant_handles.reader_make_constant_shell( makeString( "genlMt" ) ),
                TWO_INTEGER, ONE_INTEGER, TWO_INTEGER, TWO_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "GeographicalRegion" ) ), constant_handles.reader_make_constant_shell(
                    makeString( "geographicalSubRegions" ) ), ONE_INTEGER, TWO_INTEGER, TWO_INTEGER, TWO_INTEGER ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                        "CollectionDenotingFunction" ) ), constant_handles.reader_make_constant_shell( makeString( "genlFuncs" ) ), TWO_INTEGER, ONE_INTEGER, FIVE_INTEGER, FIVE_INTEGER ), ConsesLow.list( constant_handles
                            .reader_make_constant_shell( makeString( "ScientificFieldOfStudy" ) ), constant_handles.reader_make_constant_shell( makeString( "subFields" ) ), ONE_INTEGER, TWO_INTEGER, FIVE_INTEGER,
                            FIVE_INTEGER ) );
    $list1 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ) ), ConsesLow.list(
        constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ) ) );
    $kw2$YELLOW_STAR = makeKeyword( "YELLOW-STAR" );
    $str3$star_gif = makeString( "star.gif" );
    $str4$_ = makeString( "*" );
    $kw5$GREEN_STAR = makeKeyword( "GREEN-STAR" );
    $str6$grnstar_gif = makeString( "grnstar.gif" );
    $kw7$CYAN_STAR = makeKeyword( "CYAN-STAR" );
    $str8$cyanstar_gif = makeString( "cyanstar.gif" );
    $list9 = ConsesLow.list( makeString( "*" ), makeKeyword( "RED-DIAMOND" ), makeKeyword( "YELLOW-STAR" ), makeKeyword( "GREEN-STAR" ), makeKeyword( "CYAN-STAR" ) );
    $kw10$CELTIC_BAR = makeKeyword( "CELTIC-BAR" );
    $str11$celtic_bar_gif = makeString( "celtic_bar.gif" );
    $sym12$_HB_ICON_ = makeSymbol( "*HB-ICON*" );
    $sym13$_HB_BAR_ = makeSymbol( "*HB-BAR*" );
    $str14$___ = makeString( "-> " );
    $sym15$_HB_TOP_SIGN_ = makeSymbol( "*HB-TOP-SIGN*" );
    $str16$___ = makeString( " <-" );
    $sym17$_HB_BOTTOM_SIGN_ = makeSymbol( "*HB-BOTTOM-SIGN*" );
    $str18$____ = makeString( "... " );
    $sym19$_HB_MORE_SUPERIORS_SIGN_ = makeSymbol( "*HB-MORE-SUPERIORS-SIGN*" );
    $str20$____ = makeString( " ..." );
    $sym21$_HB_MORE_INFERIORS_SIGN_ = makeSymbol( "*HB-MORE-INFERIORS-SIGN*" );
    $str22$__see_above_ = makeString( " *see above*" );
    $sym23$_HB_CYCLE_SIGN_ = makeSymbol( "*HB-CYCLE-SIGN*" );
    $sym24$_HB_LARGE_FONT_SIZE_ = makeSymbol( "*HB-LARGE-FONT-SIZE*" );
    $sym25$_HB_SMALL_FONT_SIZE_ = makeSymbol( "*HB-SMALL-FONT-SIZE*" );
    $sym26$_HB_TINY_FONT_SIZE_ = makeSymbol( "*HB-TINY-FONT-SIZE*" );
    $sym27$_HB_PIVOT_TERM_ = makeSymbol( "*HB-PIVOT-TERM*" );
    $sym28$_HB_TABLE_ = makeSymbol( "*HB-TABLE*" );
    $sym29$_HB_SUPERIOR_TABLE_ = makeSymbol( "*HB-SUPERIOR-TABLE*" );
    $sym30$_HB_DUPLICATES_TABLE_ = makeSymbol( "*HB-DUPLICATES-TABLE*" );
    $sym31$_HB_INDENT_QUANTUM_ = makeSymbol( "*HB-INDENT-QUANTUM*" );
    $sym32$_HB_INDENT_ = makeSymbol( "*HB-INDENT*" );
    $sym33$_HB_COUNTER_ = makeSymbol( "*HB-COUNTER*" );
    $sym34$_HB_RESET_PARAMETER_NOTICE_THRESHHOLD_ = makeSymbol( "*HB-RESET-PARAMETER-NOTICE-THRESHHOLD*" );
    $sym35$_HB_USE_DEFAULTS_FOR_TYPE_ = makeSymbol( "*HB-USE-DEFAULTS-FOR-TYPE*" );
    $sym36$_HB_ALTERNATE_PREDICATE_ = makeSymbol( "*HB-ALTERNATE-PREDICATE*" );
    $sym37$_HB_USE_LEXICON_ = makeSymbol( "*HB-USE-LEXICON*" );
    $sym38$_HB_COMPUTED_MAX_DEPTH_ = makeSymbol( "*HB-COMPUTED-MAX-DEPTH*" );
    $sym39$_HB_MAX_DEPTH_ = makeSymbol( "*HB-MAX-DEPTH*" );
    $sym40$_HB_MAX_HEIGHT_ = makeSymbol( "*HB-MAX-HEIGHT*" );
    $int41$200 = makeInteger( 200 );
    $sym42$_HB_MAX_INFERIORS_ = makeSymbol( "*HB-MAX-INFERIORS*" );
    $sym43$_HB_SHOW_COMMENTS_ = makeSymbol( "*HB-SHOW-COMMENTS*" );
    $sym44$_HB_SHOW_MTS_ = makeSymbol( "*HB-SHOW-MTS*" );
    $kw45$ALL = makeKeyword( "ALL" );
    $sym46$_HB_MT_ = makeSymbol( "*HB-MT*" );
    $sym47$_HB_PREDICATE_ = makeSymbol( "*HB-PREDICATE*" );
    $sym48$_HB_INDEX_ARGUMENT_ = makeSymbol( "*HB-INDEX-ARGUMENT*" );
    $sym49$_HB_GATHER_ARGUMENT_ = makeSymbol( "*HB-GATHER-ARGUMENT*" );
    $sym50$_HB_USE_GENL_MTS_ = makeSymbol( "*HB-USE-GENL-MTS*" );
    $kw51$LIGHT_GRAY = makeKeyword( "LIGHT-GRAY" );
    $sym52$_HB_BACKGROUND_COLOR_ = makeSymbol( "*HB-BACKGROUND-COLOR*" );
    $kw53$RED = makeKeyword( "RED" );
    $sym54$_HB_MESSAGE_COLOR_ = makeSymbol( "*HB-MESSAGE-COLOR*" );
    $sym55$_HB_MESSAGE_ = makeSymbol( "*HB-MESSAGE*" );
    $sym56$_HB_EVAL_FORM_ = makeSymbol( "*HB-EVAL-FORM*" );
    $sym57$_HB_INVERSE_EVAL_FORM_ = makeSymbol( "*HB-INVERSE-EVAL-FORM*" );
    $sym58$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const59$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw60$RED_DIAMOND = makeKeyword( "RED-DIAMOND" );
    $str61$ = makeString( "" );
    $str62$Starting_Term = makeString( "Starting Term" );
    $str63$Current_Term__ = makeString( "Current Term: " );
    $str64$_2 = makeString( "+2" );
    $str65$None = makeString( "None" );
    $str66$cur_term = makeString( "cur-term" );
    $str67$Change_Term__ = makeString( "Change Term: " );
    $str68$new_term = makeString( "new-term" );
    $str69$Complete = makeString( "Complete" );
    $int70$25 = makeInteger( 25 );
    $str71$defaults_for_type = makeString( "defaults-for-type" );
    $str72$_Use_default_settings_for_term = makeString( " Use default settings for term" );
    $kw73$TOP = makeKeyword( "TOP" );
    $str74$Specify_Non_Default_Settings = makeString( "Specify Non-Default Settings" );
    $str75$middle = makeString( "middle" );
    $str76$top = makeString( "top" );
    $str77$Binary_Predicate = makeString( "Binary Predicate" );
    $str78$pred = makeString( "pred" );
    $const79$BinaryPredicate = constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) );
    $str80$Index_Argument = makeString( "Index Argument" );
    $str81$index = makeString( "index" );
    $str82$_1 = makeString( " 1" );
    $str83$_2 = makeString( " 2" );
    $str84$Microtheory = makeString( "Microtheory" );
    $str85$mt = makeString( "mt" );
    $const86$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $str87$genl_mts = makeString( "genl-mts" );
    $str88$_Use_its_genl_mts_too__if_possibl = makeString( " Use its genl mts too, if possible" );
    $str89$all_mts = makeString( "all-mts" );
    $str90$_Use_all_mts = makeString( " Use all mts" );
    $str91$Height_and_Depth = makeString( "Height and Depth" );
    $str92$right = makeString( "right" );
    $str93$Max_height__ = makeString( "Max height: " );
    $str94$height = makeString( "height" );
    $sym95$ALL = makeSymbol( "ALL" );
    $sym96$NONE = makeSymbol( "NONE" );
    $list97 = ConsesLow.list( new SubLObject[] { makeSymbol( "NONE" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, makeSymbol( "ALL" )
    } );
    $str98$Max_depth__ = makeString( "Max depth: " );
    $str99$depth = makeString( "depth" );
    $str100$Max_inferior_terms__ = makeString( "Max inferior terms: " );
    $str101$inferior = makeString( "inferior" );
    $str102$Extras = makeString( "Extras" );
    $str103$lex = makeString( "lex" );
    $str104$_Use_lexicon_entries__if_possible = makeString( " Use lexicon entries, if possible" );
    $str105$comments = makeString( "comments" );
    $str106$_Show_comments_for_terms = makeString( " Show comments for terms" );
    $str107$mts_after = makeString( "mts-after" );
    $str108$_Show_assertion_s_mts_after_terms = makeString( " Show assertion's mts after terms" );
    $str109$Indent_quantum__ = makeString( "Indent quantum: " );
    $str110$quantum = makeString( "quantum" );
    $kw111$HB_COLORS_AND_SYMBOLS = makeKeyword( "HB-COLORS-AND-SYMBOLS" );
    $str112$bg_color = makeString( "bg-color" );
    $str113$__ = makeString( ": " );
    $str114$The_background_color_for_Hierarch = makeString( "The background color for Hierarchy Browser pages" );
    $str115$msg_color = makeString( "msg-color" );
    $str116$The_color_for_Hierarchy_Browser_a = makeString( "The color for Hierarchy Browser alert messages" );
    $str117$hb_icon = makeString( "hb-icon" );
    $str118$The_hierarchical_display_link_ico = makeString( "The hierarchical display link icon, currently " );
    $str119$hb_bar = makeString( "hb-bar" );
    $str120$___ = makeString( " : " );
    $str121$Use_decorative_separator_bar = makeString( "Use decorative separator bar" );
    $str122$hb_top_sign = makeString( "hb-top-sign" );
    $str123$__term_ = makeString( " <term>" );
    $str124$Indicates_that__term__has_no_supe = makeString( "Indicates that <term> has no superiors" );
    $str125$_term__ = makeString( "<term> " );
    $str126$hb_bottom_sign = makeString( "hb-bottom-sign" );
    $str127$Indicates_that__term__has_no_infe = makeString( "Indicates that <term> has no inferiors" );
    $str128$superiors_sign = makeString( "superiors-sign" );
    $str129$Indicates_that__term__has_more_un = makeString( "Indicates that <term> has more undisplayed superiors" );
    $str130$inferiors_sign = makeString( "inferiors-sign" );
    $str131$Indicates_that__term__has_more_un = makeString( "Indicates that <term> has more undisplayed inferiors" );
    $str132$cycle_sign = makeString( "cycle-sign" );
    $str133$Indicates_that_a_sequence_of_term = makeString( "Indicates that a sequence of terms beginning with <term> has already been displayed" );
    $sym134$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym135$COERCE_NAME = makeSymbol( "COERCE-NAME" );
    $kw136$HB_PARAMETERS = makeKeyword( "HB-PARAMETERS" );
    $str137$hb_parameters_html = makeString( "hb-parameters.html" );
    $str138$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str139$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw140$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw141$CB_CYC = makeKeyword( "CB-CYC" );
    $str142$Cyc_Hierarchy_Browser = makeString( "Cyc Hierarchy Browser" );
    $str143$post = makeString( "post" );
    $str144$hb_handle_parameters = makeString( "hb-handle-parameters" );
    $str145$Current_Settings = makeString( "Current Settings" );
    $str146$Display_Hierarchy = makeString( "Display Hierarchy" );
    $sym147$HB_PARAMETERS = makeSymbol( "HB-PARAMETERS" );
    $kw148$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str149$HB_Colors_and_Symbols = makeString( "HB Colors and Symbols" );
    $str150$Hierarchy_Browser_Colors_and_Symb = makeString( "Hierarchy Browser Colors and Symbols" );
    $str151$hb_handle_colors_and_symbols = makeString( "hb-handle-colors-and-symbols" );
    $str152$Update = makeString( "Update" );
    $sym153$HB_COLORS_AND_SYMBOLS = makeSymbol( "HB-COLORS-AND-SYMBOLS" );
    $str154$term = makeString( "term" );
    $sym155$VALID_TIMESTRING_CHAR_ = makeSymbol( "VALID-TIMESTRING-CHAR?" );
    $sym156$VALID_FORT_ = makeSymbol( "VALID-FORT?" );
    $list157 = ConsesLow.list( makeString( "all" ), makeString( ":all" ), makeKeyword( "ALL" ), makeSymbol( "ALL" ) );
    $sym158$MT_ = makeSymbol( "MT?" );
    $sym159$HB_BINARY_PREDICATE_ = makeSymbol( "HB-BINARY-PREDICATE?" );
    $str160$2 = makeString( "2" );
    $int161$50 = makeInteger( 50 );
    $kw162$TERM = makeKeyword( "TERM" );
    $const163$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $kw164$PRED = makeKeyword( "PRED" );
    $kw165$MT = makeKeyword( "MT" );
    $str166$The_input__s_did_not_yield_a_vali = makeString( "The input ~s did not yield a valid constant." );
    $str167$The_input__s_did_not_yield_a_vali = makeString( "The input ~s did not yield a valid predicate." );
    $str168$The_input__s_did_not_yield_a_vali = makeString( "The input ~s did not yield a valid microtheory." );
    $str169$Parameters_updated_at__a_on__a = makeString( "Parameters updated at ~a on ~a" );
    $sym170$HB_HANDLE_PARAMETERS = makeSymbol( "HB-HANDLE-PARAMETERS" );
    $kw171$DEFAULT = makeKeyword( "DEFAULT" );
    $kw172$BLACK = makeKeyword( "BLACK" );
    $str173$Colors_and_symbols_updated_at__a_ = makeString( "Colors and symbols updated at ~a on ~a" );
    $sym174$HB_HANDLE_COLORS_AND_SYMBOLS = makeSymbol( "HB-HANDLE-COLORS-AND-SYMBOLS" );
    $list175 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "PREDICATE" ), makeSymbol( "INDEX" ), makeSymbol( "GATHER" ), makeSymbol( "HEIGHT" ), makeSymbol( "DEPTH" ) );
    $str176$Using_default_settings_for_instan = makeString( "Using default settings for instances of ~a." );
    $str177$No_default_display_parameters_are = makeString( "No default display parameters are defined for the term `~a'." );
    $sym178$HB_STRING_FOR_CONSTANT = makeSymbol( "HB-STRING-FOR-CONSTANT" );
    $str179$predicate = makeString( "predicate" );
    $str180$microtheory = makeString( "microtheory" );
    $str181$microtheories = makeString( "microtheories" );
    $str182$_as = makeString( "~as" );
    $str183$Choose_Constants__Simple_Version = makeString( "Choose Constants: Simple Version" );
    $str184$Choose_a__a = makeString( "Choose a ~a" );
    $str185$Please_choose_one_of_the_followin = makeString( "Please choose one of the following ~a:" );
    $str186$left = makeString( "left" );
    $kw187$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS = makeKeyword( "HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS" );
    $kw188$SELF = makeKeyword( "SELF" );
    $sym189$HB_HANDLE_SIMPLE_CHOOSE_CONSTANTS = makeSymbol( "HB-HANDLE-SIMPLE-CHOOSE-CONSTANTS" );
    $str190$Choose_Constants__Complex_Version = makeString( "Choose Constants: Complex Version" );
    $str191$Resolve_Ambiguous_Input = makeString( "Resolve Ambiguous Input" );
    $str192$hb_handle_complex_choose_constant = makeString( "hb-handle-complex-choose-constants" );
    $str193$Go = makeString( "Go" );
    $str194$Please_select_one_term_from_each_ = makeString( "Please select one term from each category below:" );
    $str195$Terms = makeString( "Terms" );
    $str196$Predicates = makeString( "Predicates" );
    $str197$Microtheories = makeString( "Microtheories" );
    $str198$_a = makeString( "~a" );
    $str199$_ = makeString( " " );
    $sym200$HB_HANDLE_COMPLEX_CHOOSE_CONSTANTS = makeSymbol( "HB-HANDLE-COMPLEX-CHOOSE-CONSTANTS" );
    $sym201$HB_SELECT_NODE = makeSymbol( "HB-SELECT-NODE" );
    $sym202$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $const203$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $sym204$NAME_OF_CAR = makeSymbol( "NAME-OF-CAR" );
    $kw205$HB_SELECT_NODE_TEXT = makeKeyword( "HB-SELECT-NODE-TEXT" );
    $kw206$HB_SELECT_NODE_IMAGE = makeKeyword( "HB-SELECT-NODE-IMAGE" );
    $sym207$CB_CF = makeSymbol( "CB-CF" );
    $kw208$ISA = makeKeyword( "ISA" );
    $sym209$MIN_ISA = makeSymbol( "MIN-ISA" );
    $kw210$GENLS = makeKeyword( "GENLS" );
    $sym211$MIN_GENLS = makeSymbol( "MIN-GENLS" );
    $kw212$ALL_ISA = makeKeyword( "ALL-ISA" );
    $sym213$ALL_ISA = makeSymbol( "ALL-ISA" );
    $kw214$ALL_GENLS = makeKeyword( "ALL-GENLS" );
    $sym215$ALL_GENLS = makeSymbol( "ALL-GENLS" );
    $sym216$LIST = makeSymbol( "LIST" );
    $const217$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str218$__ = makeString( ", " );
    $const219$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $const220$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $str221$Context__ = makeString( "Context: " );
    $str222$Union_of_all_contexts = makeString( "Union of all contexts" );
    $str223$_and_its_ = makeString( " and its " );
    $const224$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $str225$s = makeString( "s" );
    $str226$Unknown_ = makeString( "Unknown!" );
    $str227$Predicate__ = makeString( "Predicate: " );
    $str228$Index__ = makeString( "Index: " );
    $int229$100 = makeInteger( 100 );
    $str230$__________ = makeString( "----------" );
    $kw231$HB_PRINT_NODES = makeKeyword( "HB-PRINT-NODES" );
    $str232$hb_print_nodes_html = makeString( "hb-print-nodes.html" );
    $str233$Hierarchical_Display___a = makeString( "Hierarchical Display: ~a" );
    $sym234$HIERARCHY_DEFAULT = makeSymbol( "HIERARCHY-DEFAULT" );
    $str235$hb_parameters = makeString( "hb-parameters" );
    $str236$Change_Hierarchy_Browser_Settings = makeString( "Change Hierarchy Browser Settings" );
    $str237$_a_is_not_a_valid_constant_ = makeString( "~a is not a valid constant." );
    $sym238$HB_PRINT_NODES = makeSymbol( "HB-PRINT-NODES" );
    $kw239$SUPERIOR = makeKeyword( "SUPERIOR" );
    $kw240$INFERIOR = makeKeyword( "INFERIOR" );
    $str241$__ = makeString( " [" );
    $str242$_ = makeString( "]" );
    $str243$_ = makeString( "[" );
    $str244$_____ = makeString( " -> (" );
    $str245$__ = makeString( ")]" );
    $str246$_Unknown__ = makeString( "[Unknown!]" );
    $sym247$STRING_ = makeSymbol( "STRING<" );
    $str248$No_superior_terms = makeString( "No superior terms" );
    $str249$__not_an_indexed_term_ = makeString( " [not an indexed term]" );
    $str250$No_inferior_terms = makeString( "No inferior terms" );
    $str251$Go_to_Top = makeString( "Go to Top" );
    $str252$____ = makeString( "~%~%" );
    $str253$____Level_finished___s = makeString( "    Level finished: ~s" );
    $str254$__ = makeString( "~%" );
    $str255$_______Total_count___s = makeString( "       Total count: ~s" );
    $str256$Computed_max_depth___s = makeString( "Computed max depth: ~s" );
    $sym257$HB_START = makeSymbol( "HB-START" );
    $str258$Hier = makeString( "Hier" );
    $kw259$MAIN = makeKeyword( "MAIN" );
    $str260$hb_start = makeString( "hb-start" );
    $kw261$HIERARCHY_BROWSER = makeKeyword( "HIERARCHY-BROWSER" );
    $sym262$CB_LINK_HIERARCHY_BROWSER = makeSymbol( "CB-LINK-HIERARCHY-BROWSER" );
    $str263$Hierarchy_Browser = makeString( "Hierarchy Browser" );
    $str264$The_Hierarchy_Browser = makeString( "The Hierarchy Browser" );
    $list265 = ConsesLow.list( makeSymbol( "FORT-SPEC" ) );
    $str266$Could_not_determine_a_term_from__ = makeString( "Could not determine a term from ~a" );
    $sym267$CB_HIER_DEFAULT = makeSymbol( "CB-HIER-DEFAULT" );
    $list268 = ConsesLow.list( makeSymbol( "FORT-SPEC" ), makeSymbol( "ARG-STRING" ), makeSymbol( "PRED-SPEC" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT-SPEC" ) );
    $str269$Could_not_determine_an_arg_from__ = makeString( "Could not determine an arg from ~a" );
    $sym270$CB_HIER = makeSymbol( "CB-HIER" );
    $sym271$SECOND = makeSymbol( "SECOND" );
  }
}
/*
 * 
 * Total time: 3993 ms
 * 
 */