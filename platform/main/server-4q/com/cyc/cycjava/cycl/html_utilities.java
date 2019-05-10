package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.html_utilities";
  public static final String myFingerPrint = "7f1f08509cd9b640a6d9a125f843de6a12d2c85f77e8d6b17b20f4581064408a";
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 618L)
  public static SubLSymbol $cb_use_frames$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 9362L)
  public static SubLSymbol $use_new_html_princ_cycl_stringP$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 18715L)
  private static SubLSymbol $html_stale_constant_reference_color$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 24672L)
  public static SubLSymbol $html_url_princ_escape_spaces$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 27210L)
  private static SubLSymbol $html_style_background$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 27483L)
  public static SubLSymbol $html_align_map$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 28182L)
  public static SubLSymbol $cycorp_homepage_url$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 28315L)
  public static SubLSymbol $cycorp_homepage_text$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 28373L)
  public static SubLSymbol $proprietarity_message$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 56431L)
  private static SubLSymbol $html_extract_field_name$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 92760L)
  private static SubLSymbol $url_to_text_replacements$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 94286L)
  private static SubLSymbol $html_filename_input_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 95653L)
  public static SubLSymbol $html_multipart_form_date$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 97490L)
  private static SubLSymbol $html_newline_string$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 98682L)
  private static SubLSymbol $html_multipart_content_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 98772L)
  private static SubLSymbol $html_multipart_content_marker_size$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 103083L)
  private static SubLSymbol $build_treemap_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 105657L)
  private static SubLSymbol $build_treemap_max_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 110969L)
  private static SubLSymbol $html_utils_test$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 110969L)
  private static SubLSymbol $html_utils_test_category$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 110969L)
  private static SubLSymbol $html_utils_test_suite$;
  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 110969L)
  private static SubLSymbol $html_utils_module$;
  private static final SubLSymbol $sym0$_CB_USE_FRAMES_;
  private static final SubLSymbol $sym1$HTML_RESERVED_CHAR_P;
  private static final SubLSymbol $sym2$NON_ASCII_CHAR_P;
  private static final SubLInteger $int3$38;
  private static final SubLInteger $int4$34;
  private static final SubLInteger $int5$60;
  private static final SubLInteger $int6$62;
  private static final SubLString $str7$__x;
  private static final SubLString $str8$_;
  private static final SubLSymbol $sym9$STRINGP;
  private static final SubLSymbol $kw10$NBSP;
  private static final SubLFloat $float11$0_5;
  private static final SubLSymbol $sym12$CB_FORM;
  private static final SubLInteger $int13$128;
  private static final SubLString $str14$__A_;
  private static final SubLSymbol $kw15$EOF;
  private static final SubLString $str16$__x_x_;
  private static final SubLString $str17$______i__;
  private static final SubLString $str18$_characters_total___i_;
  private static final SubLSymbol $sym19$MIN;
  private static final SubLSymbol $sym20$NULL;
  private static final SubLSymbol $sym21$EL_VARIABLE_CHAR_;
  private static final SubLSymbol $sym22$STRING_;
  private static final SubLString $str23$_;
  private static final SubLString $str24$_;
  private static final SubLString $str25$_;
  private static final SubLString $str26$code;
  private static final SubLString $str27$pre;
  private static final SubLSymbol $sym28$HTML_LINK_TO_OWL_URI;
  private static final SubLSymbol $sym29$HTML_LINK_TO_OWL_OPENCYC_URI;
  private static final SubLSymbol $sym30$OPENCYC_HTML_CYCL_STRING;
  private static final SubLSymbol $kw31$TEST;
  private static final SubLSymbol $kw32$OWNER;
  private static final SubLSymbol $kw33$CLASSES;
  private static final SubLSymbol $kw34$KB;
  private static final SubLSymbol $kw35$FULL;
  private static final SubLSymbol $kw36$WORKING_;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$RED;
  private static final SubLString $str39$_A;
  private static final SubLString $str40$_;
  private static final SubLString $str41$_;
  private static final SubLString $str42$___;
  private static final SubLString $str43$_;
  private static final SubLString $str44$___;
  private static final SubLString $str45$__C_C;
  private static final SubLString $str46$_;
  private static final SubLString $str47$;
  private static final SubLString $str48$background_color_;
  private static final SubLList $list49;
  private static final SubLString $str50$http___www_cyc_com;
  private static final SubLString $str51$Cycorp;
  private static final SubLSymbol $sym52$_PROPRIETARITY_MESSAGE_;
  private static final SubLString $str53$copyright;
  private static final SubLString $str54$Copyright__copy__1995____A_;
  private static final SubLString $str55$___All_rights_reserved___;
  private static final SubLSymbol $kw56$CYC_LOGO_SMALL_VIOLET_FULL_URL;
  private static final SubLString $str57$cyc_logo_violet_16_gif;
  private static final SubLSymbol $kw58$CYC_LOGO_LARGE_VIOLET_FULL_URL;
  private static final SubLString $str59$cyc_logo_violet_60_gif;
  private static final SubLSymbol $kw60$CYCORP_SYMBOL_TINY;
  private static final SubLString $str61$cyc_logo_tiny_gif;
  private static final SubLSymbol $kw62$CYCORP_SYMBOL_SMALL;
  private static final SubLString $str63$cyc_logo_sm_gif;
  private static final SubLSymbol $kw64$CYCORP_SYMBOL_MEDIUM;
  private static final SubLString $str65$cyc_logo_10_t_gif;
  private static final SubLSymbol $kw66$CYCORP_LOGO_MEDIUM;
  private static final SubLString $str67$cyc_logo_25_t_gif;
  private static final SubLSymbol $kw68$CYCORP_LOGO_BIG;
  private static final SubLString $str69$cyc_logo_50_t_gif;
  private static final SubLString $str70$_URL_;
  private static final SubLString $str71$Refresh;
  private static final SubLString $str72$Content_type;
  private static final SubLString $str73$text_html__charset_UTF_8;
  private static final SubLString $str74$Expires;
  private static final SubLString $str75$Last_Modified;
  private static final SubLString $str76$Cache_Control;
  private static final SubLString $str77$no_cache;
  private static final SubLList $list78;
  private static final SubLList $list79;
  private static final SubLSymbol $kw80$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw81$HH;
  private static final SubLSymbol $kw82$MM;
  private static final SubLSymbol $kw83$SS;
  private static final SubLSymbol $sym84$HTML_WEBPAGE_EXPIRES;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$HTML_META_EXPIRES;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$HTML_WEBPAGE_LAST_MODIFIED;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$HTML_META_LAST_MODIFIED;
  private static final SubLSymbol $sym91$HTML_DONT_CACHE_WEBPAGE;
  private static final SubLList $list92;
  private static final SubLString $str93$ROBOTS;
  private static final SubLString $str94$NOINDEX__NOFOLLOW;
  private static final SubLString $str95$INDEX__FOLLOW;
  private static final SubLString $str96$NOINDEX__FOLLOW;
  private static final SubLString $str97$INDEX__NOFOLLOW;
  private static final SubLString $str98$Invalid_HTML_meta_select_robot_in;
  private static final SubLString $str99$Reset_All_Fields;
  private static final SubLString $str100$autocomplete_;
  private static final SubLString $str101$input_;
  private static final SubLString $str102$autocomplete_results_;
  private static final SubLString $str103$position_static__width_auto_;
  private static final SubLString $str104$yui_ac;
  private static final SubLString $str105$yui_ac_input;
  private static final SubLString $str106$yui_ac_container;
  private static final SubLList $list107;
  private static final SubLList $list108;
  private static final SubLString $str109$_x;
  private static final SubLString $str110$_y;
  private static final SubLList $list111;
  private static final SubLList $list112;
  private static final SubLSymbol $kw113$LEXICON;
  private static final SubLInteger $int114$100;
  private static final SubLSymbol $sym115$INTEGERP;
  private static final SubLList $list116;
  private static final SubLList $list117;
  private static final SubLSymbol $kw118$SOFAR;
  private static final SubLSymbol $kw119$TOTAL;
  private static final SubLSymbol $kw120$WIDTH;
  private static final SubLSymbol $kw121$HEIGHT;
  private static final SubLSymbol $kw122$PROGRESS_COLOR;
  private static final SubLSymbol $sym123$_HTML_COLOR_SAT_GREEN_;
  private static final SubLSymbol $kw124$REMAINING_COLOR;
  private static final SubLSymbol $sym125$_HTML_COLOR_SAT_RED_;
  private static final SubLSymbol $kw126$BORDER;
  private static final SubLSymbol $sym127$WIDTH1;
  private static final SubLSymbol $sym128$WIDTH2;
  private static final SubLSymbol $sym129$HTML_FANCY_TABLE;
  private static final SubLList $list130;
  private static final SubLSymbol $sym131$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym132$HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS;
  private static final SubLSymbol $sym133$HTML_FANCY_TABLE_ROW;
  private static final SubLSymbol $sym134$HTML_FANCY_TABLE_DATA;
  private static final SubLSymbol $kw135$BGCOLOR;
  private static final SubLSymbol $sym136$HTML_FANCY_PERCENT_PROGRESS_BAR;
  private static final SubLSymbol $sym137$NUMBERP;
  private static final SubLInteger $int138$1000;
  private static final SubLSymbol $kw139$RIGHT;
  private static final SubLSymbol $kw140$TOP;
  private static final SubLString $str141$Run_Time__;
  private static final SubLString $str142$Elapsed_Time__;
  private static final SubLSymbol $kw143$LEFT;
  private static final SubLString $str144$Current_Total__;
  private static final SubLString $str145$_of_;
  private static final SubLSymbol $kw146$CENTER;
  private static final SubLString $str147$_D_;
  private static final SubLString $str148$_No_data_to_graph_;
  private static final SubLSymbol $sym149$MAX;
  private static final SubLSymbol $sym150$SECOND;
  private static final SubLString $str151$100_;
  private static final SubLString $str152$1_;
  private static final SubLString $str153$_;
  private static final SubLString $str154$5_;
  private static final SubLString $str155$95_;
  private static final SubLString $str156$__D;
  private static final SubLSymbol $sym157$SYMBOLP;
  private static final SubLSymbol $kw158$FANCY_NAME;
  private static final SubLSymbol $kw159$DESCRIPTION;
  private static final SubLSymbol $kw160$SETTINGS_SPEC;
  private static final SubLList $list161;
  private static final SubLSymbol $kw162$ENTRY;
  private static final SubLSymbol $sym163$FIRST;
  private static final SubLList $list164;
  private static final SubLList $list165;
  private static final SubLList $list166;
  private static final SubLSymbol $kw167$TEXT;
  private static final SubLString $str168$The_value_entered_for__;
  private static final SubLString $str169$__was_not_valid_;
  private static final SubLString $str170$No_value_was_entered_for__;
  private static final SubLString $str171$__;
  private static final SubLString $str172$No_choice_was_made_for__;
  private static final SubLString $str173$_is_not_a_declared_control_parame;
  private static final SubLSymbol $sym174$CSETQ;
  private static final SubLSymbol $sym175$QUOTE;
  private static final SubLString $str176$entry_;
  private static final SubLString $str177$radio_;
  private static final SubLSymbol $sym178$LISTP;
  private static final SubLSymbol $sym179$MATCHING_HTML_FIELD;
  private static final SubLSymbol $sym180$DIGIT_CHAR_P;
  private static final SubLSymbol $kw181$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym182$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $kw183$DEFAULT;
  private static final SubLSymbol $sym184$_EXIT;
  private static final SubLSymbol $sym185$MATCHING_HTML_BUTTON_FIELD;
  private static final SubLString $str186$en;
  private static final SubLObject $const187$EnglishLanguage;
  private static final SubLString $str188$en_gb;
  private static final SubLObject $const189$BritishEnglishDialect;
  private static final SubLString $str190$fr;
  private static final SubLObject $const191$FrenchLanguage;
  private static final SubLString $str192$de;
  private static final SubLObject $const193$GermanLanguage;
  private static final SubLObject $const194$languageCodeDigraph;
  private static final SubLSymbol $kw195$HTML_GLYPH;
  private static final SubLSymbol $kw196$LT;
  private static final SubLString $str197$_lt_;
  private static final SubLSymbol $kw198$GT;
  private static final SubLString $str199$_gt_;
  private static final SubLSymbol $kw200$AMP;
  private static final SubLString $str201$_amp_;
  private static final SubLSymbol $kw202$QUOT;
  private static final SubLString $str203$_quot_;
  private static final SubLSymbol $kw204$REG;
  private static final SubLString $str205$_reg_;
  private static final SubLSymbol $kw206$COPY;
  private static final SubLString $str207$_copy_;
  private static final SubLString $str208$_nbsp_;
  private static final SubLSymbol $kw209$EMSP;
  private static final SubLString $str210$_emsp_;
  private static final SubLSymbol $kw211$ENSP;
  private static final SubLString $str212$_ensp_;
  private static final SubLSymbol $kw213$SPACE;
  private static final SubLString $str214$__X0020_;
  private static final SubLSymbol $kw215$EM_SPACE;
  private static final SubLString $str216$__X2003_;
  private static final SubLSymbol $kw217$EN_SPACE;
  private static final SubLString $str218$__X2002_;
  private static final SubLSymbol $kw219$TWO_PER_EM_SPACE;
  private static final SubLSymbol $kw220$THREE_PER_EM_SPACE;
  private static final SubLString $str221$__X2004_;
  private static final SubLSymbol $kw222$FOUR_PER_EM_SPACE;
  private static final SubLString $str223$__X2005_;
  private static final SubLSymbol $kw224$SIX_PER_EM_SPACE;
  private static final SubLString $str225$__X2006_;
  private static final SubLSymbol $kw226$THIN_SPACE;
  private static final SubLString $str227$__X2009_;
  private static final SubLSymbol $kw228$HAIR_SPACE;
  private static final SubLString $str229$__X200A_;
  private static final SubLSymbol $kw230$IEXCL;
  private static final SubLString $str231$_iexcl_;
  private static final SubLSymbol $kw232$CENT;
  private static final SubLString $str233$_cent_;
  private static final SubLSymbol $kw234$POUND;
  private static final SubLString $str235$_pound_;
  private static final SubLSymbol $kw236$CURREN;
  private static final SubLString $str237$_curren_;
  private static final SubLSymbol $kw238$YEN;
  private static final SubLString $str239$_yen_;
  private static final SubLSymbol $kw240$BRVBAR;
  private static final SubLString $str241$_brvba_;
  private static final SubLSymbol $kw242$SECT;
  private static final SubLString $str243$_sect_;
  private static final SubLSymbol $kw244$UML;
  private static final SubLString $str245$_uml_;
  private static final SubLSymbol $kw246$ORDF;
  private static final SubLString $str247$_ordf_;
  private static final SubLSymbol $kw248$LAQUO;
  private static final SubLString $str249$_laquo_;
  private static final SubLSymbol $kw250$NOT;
  private static final SubLString $str251$_not_;
  private static final SubLSymbol $kw252$SHY;
  private static final SubLString $str253$_shy_;
  private static final SubLSymbol $kw254$MACR;
  private static final SubLString $str255$_macr_;
  private static final SubLSymbol $kw256$DEG;
  private static final SubLString $str257$_deg_;
  private static final SubLSymbol $kw258$PLUSMN;
  private static final SubLString $str259$_plusmn_;
  private static final SubLSymbol $kw260$SUP2;
  private static final SubLString $str261$_sup2_;
  private static final SubLSymbol $kw262$SUP3;
  private static final SubLString $str263$_sup3_;
  private static final SubLSymbol $kw264$ACUTE;
  private static final SubLString $str265$_acute_;
  private static final SubLSymbol $kw266$MICRO;
  private static final SubLString $str267$_micro_;
  private static final SubLSymbol $kw268$PARA;
  private static final SubLString $str269$_para_;
  private static final SubLSymbol $kw270$MIDDOT;
  private static final SubLString $str271$_middoy_;
  private static final SubLSymbol $kw272$CEDIL;
  private static final SubLString $str273$_cedil_;
  private static final SubLSymbol $kw274$SUP1;
  private static final SubLString $str275$_sup1_;
  private static final SubLSymbol $kw276$ORDM;
  private static final SubLString $str277$_ordm_;
  private static final SubLSymbol $kw278$RAQUO;
  private static final SubLString $str279$_raquo_;
  private static final SubLSymbol $kw280$FRAC14;
  private static final SubLString $str281$_frac14_;
  private static final SubLSymbol $kw282$FRAC12;
  private static final SubLString $str283$_frac12_;
  private static final SubLSymbol $kw284$FRAC34;
  private static final SubLString $str285$_frac34_;
  private static final SubLSymbol $kw286$IQUEST;
  private static final SubLString $str287$_iquest_;
  private static final SubLSymbol $kw288$AGRAVE_CAP;
  private static final SubLString $str289$_Agrave_;
  private static final SubLSymbol $kw290$AACUTE_CAP;
  private static final SubLString $str291$_Aacute_;
  private static final SubLSymbol $kw292$ACIRC_CAP;
  private static final SubLString $str293$_Acirc_;
  private static final SubLSymbol $kw294$ATILDE_CAP;
  private static final SubLString $str295$_Atilde_;
  private static final SubLSymbol $kw296$AUML_CAP;
  private static final SubLString $str297$_Auml_;
  private static final SubLSymbol $kw298$ARING_CAP;
  private static final SubLString $str299$_Aring_;
  private static final SubLSymbol $kw300$AELIG_CAP;
  private static final SubLString $str301$_AElig_;
  private static final SubLSymbol $kw302$CCEDIL_CAP;
  private static final SubLString $str303$_Ccedil_;
  private static final SubLSymbol $kw304$EGRAVE_CAP;
  private static final SubLString $str305$_Egrave_;
  private static final SubLSymbol $kw306$EACUTE_CAP;
  private static final SubLString $str307$_Eacute_;
  private static final SubLSymbol $kw308$ECIRC_CAP;
  private static final SubLString $str309$_Ecirc_;
  private static final SubLSymbol $kw310$EUML_CAP;
  private static final SubLString $str311$_Euml_;
  private static final SubLSymbol $kw312$IGRAVE_CAP;
  private static final SubLString $str313$_Igrave_;
  private static final SubLSymbol $kw314$IACUTE_CAP;
  private static final SubLString $str315$_Iacute_;
  private static final SubLSymbol $kw316$ICIRC_CAP;
  private static final SubLString $str317$_Icirc_;
  private static final SubLSymbol $kw318$IUML_CAP;
  private static final SubLString $str319$_Iuml_;
  private static final SubLSymbol $kw320$ETH_CAP;
  private static final SubLString $str321$_ETH_;
  private static final SubLSymbol $kw322$NTILDE_CAP;
  private static final SubLString $str323$_Ntilde_;
  private static final SubLSymbol $kw324$OGRAVE_CAP;
  private static final SubLString $str325$_Ograve_;
  private static final SubLSymbol $kw326$OACUTE_CAP;
  private static final SubLString $str327$_Oacute_;
  private static final SubLSymbol $kw328$OCIRC_CAP;
  private static final SubLString $str329$_Ocirc_;
  private static final SubLSymbol $kw330$OTILDE_CAP;
  private static final SubLString $str331$_Otilde_;
  private static final SubLSymbol $kw332$OUML_CAP;
  private static final SubLString $str333$_Ouml_;
  private static final SubLSymbol $kw334$TIMES;
  private static final SubLString $str335$_times_;
  private static final SubLSymbol $kw336$OSLASH_CAP;
  private static final SubLString $str337$_Oslash_;
  private static final SubLSymbol $kw338$UGRAVE_CAP;
  private static final SubLString $str339$_Ugrave_;
  private static final SubLSymbol $kw340$UACUTE_CAP;
  private static final SubLString $str341$_Uacute_;
  private static final SubLSymbol $kw342$UCIRC_CAP;
  private static final SubLString $str343$_Ucirc_;
  private static final SubLSymbol $kw344$UUML_CAP;
  private static final SubLString $str345$_Uuml_;
  private static final SubLSymbol $kw346$YACUTE_CAP;
  private static final SubLString $str347$_Yacute_;
  private static final SubLSymbol $kw348$THORN_CAP;
  private static final SubLString $str349$_THORN_;
  private static final SubLSymbol $kw350$SZLIG;
  private static final SubLString $str351$_szlig_;
  private static final SubLSymbol $kw352$AGRAVE;
  private static final SubLString $str353$_agrave_;
  private static final SubLSymbol $kw354$AACUTE;
  private static final SubLString $str355$_aacute_;
  private static final SubLSymbol $kw356$ACIRC;
  private static final SubLString $str357$_acirc_;
  private static final SubLSymbol $kw358$ATILDE;
  private static final SubLString $str359$_atilde_;
  private static final SubLSymbol $kw360$AUML;
  private static final SubLString $str361$_auml_;
  private static final SubLSymbol $kw362$ARING;
  private static final SubLString $str363$_aring_;
  private static final SubLSymbol $kw364$AELIG;
  private static final SubLString $str365$_aelig_;
  private static final SubLSymbol $kw366$CCEDIL;
  private static final SubLString $str367$_ccedil_;
  private static final SubLSymbol $kw368$EGRAVE;
  private static final SubLString $str369$_egrave_;
  private static final SubLSymbol $kw370$EACUTE;
  private static final SubLString $str371$_eacute_;
  private static final SubLSymbol $kw372$ECIRC;
  private static final SubLString $str373$_ecirc_;
  private static final SubLSymbol $kw374$EUML;
  private static final SubLString $str375$_euml_;
  private static final SubLSymbol $kw376$IGRAVE;
  private static final SubLString $str377$_igrave_;
  private static final SubLSymbol $kw378$IACUTE;
  private static final SubLString $str379$_iacute_;
  private static final SubLSymbol $kw380$ICIRC;
  private static final SubLString $str381$_icirc_;
  private static final SubLSymbol $kw382$IUML;
  private static final SubLString $str383$_iuml_;
  private static final SubLSymbol $kw384$ETH;
  private static final SubLString $str385$_eth_;
  private static final SubLSymbol $kw386$NTILDE;
  private static final SubLString $str387$_ntilde_;
  private static final SubLSymbol $kw388$OGRAVE;
  private static final SubLString $str389$_ograve_;
  private static final SubLSymbol $kw390$OACUTE;
  private static final SubLString $str391$_oacute_;
  private static final SubLSymbol $kw392$OCIRC;
  private static final SubLString $str393$_ocirc_;
  private static final SubLSymbol $kw394$OTILDE;
  private static final SubLString $str395$_otilde_;
  private static final SubLSymbol $kw396$OUML;
  private static final SubLString $str397$_ouml_;
  private static final SubLSymbol $kw398$DIVIDE;
  private static final SubLString $str399$_divide_;
  private static final SubLSymbol $kw400$OSLASH;
  private static final SubLString $str401$_oslash_;
  private static final SubLSymbol $kw402$UGRAVE;
  private static final SubLString $str403$_ugrave_;
  private static final SubLSymbol $kw404$UACUTE;
  private static final SubLString $str405$_uacute_;
  private static final SubLSymbol $kw406$UCIRC;
  private static final SubLString $str407$_ucirc_;
  private static final SubLSymbol $kw408$UUML;
  private static final SubLString $str409$_uuml_;
  private static final SubLSymbol $kw410$YACUTE;
  private static final SubLString $str411$_yacute_;
  private static final SubLSymbol $kw412$THORN;
  private static final SubLString $str413$_thorn_;
  private static final SubLSymbol $kw414$YUML;
  private static final SubLString $str415$_yuml_;
  private static final SubLSymbol $kw416$FNOF;
  private static final SubLString $str417$_fnof_;
  private static final SubLSymbol $kw418$ALPHA_CAP;
  private static final SubLString $str419$_Alpha_;
  private static final SubLSymbol $kw420$BETA_CAP;
  private static final SubLString $str421$_Beta_;
  private static final SubLSymbol $kw422$GAMMA_CAP;
  private static final SubLString $str423$_Gamma_;
  private static final SubLSymbol $kw424$DELTA_CAP;
  private static final SubLString $str425$_Delta_;
  private static final SubLSymbol $kw426$EPSILON_CAP;
  private static final SubLString $str427$_Epsilon_;
  private static final SubLSymbol $kw428$ZETA_CAP;
  private static final SubLString $str429$_Zeta_;
  private static final SubLSymbol $kw430$ETA_CAP;
  private static final SubLString $str431$_Eta_;
  private static final SubLSymbol $kw432$THETA_CAP;
  private static final SubLString $str433$_Theta_;
  private static final SubLSymbol $kw434$IOTA_CAP;
  private static final SubLString $str435$_Iota_;
  private static final SubLSymbol $kw436$KAPPA_CAP;
  private static final SubLString $str437$_Kappa_;
  private static final SubLSymbol $kw438$LAMBDA_CAP;
  private static final SubLString $str439$_Lambda_;
  private static final SubLSymbol $kw440$MU_CAP;
  private static final SubLString $str441$_Mu_;
  private static final SubLSymbol $kw442$NU_CAP;
  private static final SubLString $str443$_Nu_;
  private static final SubLSymbol $kw444$XI_CAP;
  private static final SubLString $str445$_Xi_;
  private static final SubLSymbol $kw446$OMICRON_CAP;
  private static final SubLString $str447$_Omicron_;
  private static final SubLSymbol $kw448$PI_CAP;
  private static final SubLString $str449$_Pi_;
  private static final SubLSymbol $kw450$RHO_CAP;
  private static final SubLString $str451$_Rho_;
  private static final SubLSymbol $kw452$SIGMA_CAP;
  private static final SubLString $str453$_Sigma_;
  private static final SubLSymbol $kw454$TAU_CAP;
  private static final SubLString $str455$_Tau_;
  private static final SubLSymbol $kw456$UPSILON_CAP;
  private static final SubLString $str457$_Upsilon_;
  private static final SubLSymbol $kw458$PHI_CAP;
  private static final SubLString $str459$_Phi_;
  private static final SubLSymbol $kw460$CHI_CAP;
  private static final SubLString $str461$_Chi_;
  private static final SubLSymbol $kw462$PSI_CAP;
  private static final SubLString $str463$_Psi_;
  private static final SubLSymbol $kw464$OMEGA_CAP;
  private static final SubLString $str465$_Omega_;
  private static final SubLSymbol $kw466$ALPHA;
  private static final SubLString $str467$_alpha_;
  private static final SubLSymbol $kw468$BETA;
  private static final SubLString $str469$_beta_;
  private static final SubLSymbol $kw470$GAMMA;
  private static final SubLString $str471$_gamma_;
  private static final SubLSymbol $kw472$DELTA;
  private static final SubLString $str473$_delta_;
  private static final SubLSymbol $kw474$EPSILON;
  private static final SubLString $str475$_epsilon_;
  private static final SubLSymbol $kw476$ZETA;
  private static final SubLString $str477$_zeta_;
  private static final SubLSymbol $kw478$ETA;
  private static final SubLString $str479$_eta_;
  private static final SubLSymbol $kw480$THETA;
  private static final SubLString $str481$_theta_;
  private static final SubLSymbol $kw482$IOTA;
  private static final SubLString $str483$_iota_;
  private static final SubLSymbol $kw484$KAPPA;
  private static final SubLString $str485$_kappa_;
  private static final SubLSymbol $kw486$LAMBDA;
  private static final SubLString $str487$_lambda_;
  private static final SubLSymbol $kw488$MU;
  private static final SubLString $str489$_mu_;
  private static final SubLSymbol $kw490$NU;
  private static final SubLString $str491$_nu_;
  private static final SubLSymbol $kw492$XI;
  private static final SubLString $str493$_xi_;
  private static final SubLSymbol $kw494$OMICRON;
  private static final SubLString $str495$_omicron_;
  private static final SubLSymbol $kw496$PI;
  private static final SubLString $str497$_pi_;
  private static final SubLSymbol $kw498$RHO;
  private static final SubLString $str499$_rho_;
  private static final SubLSymbol $kw500$SIGMAF;
  private static final SubLString $str501$_sigmaf_;
  private static final SubLSymbol $kw502$SIGMA;
  private static final SubLString $str503$_sigma_;
  private static final SubLSymbol $kw504$TAU;
  private static final SubLString $str505$_tau_;
  private static final SubLSymbol $kw506$UPSILON;
  private static final SubLString $str507$_upsilon_;
  private static final SubLSymbol $kw508$PHI;
  private static final SubLString $str509$_phi_;
  private static final SubLSymbol $kw510$CHI;
  private static final SubLString $str511$_chi_;
  private static final SubLSymbol $kw512$PSI;
  private static final SubLString $str513$_psi_;
  private static final SubLSymbol $kw514$OMEGA;
  private static final SubLString $str515$_omega_;
  private static final SubLSymbol $kw516$THETASYM;
  private static final SubLSymbol $kw517$UPSIH;
  private static final SubLString $str518$_upsih_;
  private static final SubLSymbol $kw519$PIV;
  private static final SubLString $str520$_piv_;
  private static final SubLSymbol $kw521$BULL;
  private static final SubLString $str522$_bull_;
  private static final SubLSymbol $kw523$HELLIP;
  private static final SubLString $str524$_hellip_;
  private static final SubLSymbol $kw525$PRIME;
  private static final SubLString $str526$_prime_;
  private static final SubLSymbol $kw527$PRIME_DBL;
  private static final SubLString $str528$_Prime_;
  private static final SubLSymbol $kw529$OLINE;
  private static final SubLString $str530$_oline_;
  private static final SubLSymbol $kw531$FRASL;
  private static final SubLString $str532$_frasl_;
  private static final SubLSymbol $kw533$WEIERP;
  private static final SubLString $str534$_weierp_;
  private static final SubLSymbol $kw535$IMAGE;
  private static final SubLString $str536$_image_;
  private static final SubLSymbol $kw537$REAL;
  private static final SubLString $str538$_real_;
  private static final SubLSymbol $kw539$TRADE;
  private static final SubLString $str540$_trade_;
  private static final SubLSymbol $kw541$ALEFSYM;
  private static final SubLString $str542$_alefsym_;
  private static final SubLSymbol $kw543$UPWARDS_ARROW;
  private static final SubLString $str544$_uarr_;
  private static final SubLSymbol $kw545$RIGHTWARDS_ARROW;
  private static final SubLString $str546$_rarr_;
  private static final SubLSymbol $kw547$LARR;
  private static final SubLString $str548$_larr_;
  private static final SubLSymbol $kw549$UARR;
  private static final SubLSymbol $kw550$RARR;
  private static final SubLSymbol $kw551$DARR;
  private static final SubLString $str552$_darr_;
  private static final SubLSymbol $kw553$HARR;
  private static final SubLString $str554$_harr_;
  private static final SubLSymbol $kw555$CRARR;
  private static final SubLString $str556$_crarr_;
  private static final SubLSymbol $kw557$LARR_DBL;
  private static final SubLString $str558$_lArr_;
  private static final SubLSymbol $kw559$UARR_DBL;
  private static final SubLString $str560$_uArr_;
  private static final SubLSymbol $kw561$RARR_DBL;
  private static final SubLString $str562$_rArr_;
  private static final SubLSymbol $kw563$DARR_DBL;
  private static final SubLString $str564$_dArr_;
  private static final SubLSymbol $kw565$HARR_DBL;
  private static final SubLString $str566$_hArr_;
  private static final SubLSymbol $kw567$FORALL;
  private static final SubLString $str568$_forall_;
  private static final SubLSymbol $kw569$PART;
  private static final SubLString $str570$_part_;
  private static final SubLSymbol $kw571$EXIST;
  private static final SubLString $str572$_exist_;
  private static final SubLSymbol $kw573$EMPTY;
  private static final SubLString $str574$_empty_;
  private static final SubLSymbol $kw575$NABLA;
  private static final SubLString $str576$_nabla_;
  private static final SubLSymbol $kw577$ISIN;
  private static final SubLString $str578$_isin_;
  private static final SubLSymbol $kw579$NOTIN;
  private static final SubLString $str580$_notin_;
  private static final SubLSymbol $kw581$NI;
  private static final SubLString $str582$_ni_;
  private static final SubLSymbol $kw583$PROD;
  private static final SubLString $str584$_prod_;
  private static final SubLSymbol $kw585$SUM;
  private static final SubLString $str586$_sum_;
  private static final SubLSymbol $kw587$MINUS;
  private static final SubLString $str588$_minus_;
  private static final SubLSymbol $kw589$LOWAST;
  private static final SubLString $str590$_lowast_;
  private static final SubLSymbol $kw591$RADIC;
  private static final SubLString $str592$_radic_;
  private static final SubLSymbol $kw593$PROP;
  private static final SubLString $str594$_prop_;
  private static final SubLSymbol $kw595$INFIN;
  private static final SubLString $str596$_infin_;
  private static final SubLSymbol $kw597$ANG;
  private static final SubLString $str598$_ang_;
  private static final SubLSymbol $kw599$AND;
  private static final SubLString $str600$_and_;
  private static final SubLSymbol $kw601$OR;
  private static final SubLString $str602$_or_;
  private static final SubLSymbol $kw603$CAP;
  private static final SubLString $str604$_cap_;
  private static final SubLSymbol $kw605$CUP;
  private static final SubLString $str606$_cup_;
  private static final SubLSymbol $kw607$INT;
  private static final SubLString $str608$_int_;
  private static final SubLSymbol $kw609$THERE4;
  private static final SubLString $str610$_there4_;
  private static final SubLSymbol $kw611$SIM;
  private static final SubLString $str612$_sim_;
  private static final SubLSymbol $kw613$CONG;
  private static final SubLString $str614$_cong_;
  private static final SubLSymbol $kw615$ASYMP;
  private static final SubLString $str616$_asymp_;
  private static final SubLSymbol $kw617$NE;
  private static final SubLString $str618$_ne_;
  private static final SubLSymbol $kw619$EQUIV;
  private static final SubLString $str620$_equiv_;
  private static final SubLSymbol $kw621$LE;
  private static final SubLString $str622$_le_;
  private static final SubLSymbol $kw623$GE;
  private static final SubLString $str624$_ge_;
  private static final SubLSymbol $kw625$SUB;
  private static final SubLString $str626$_sub_;
  private static final SubLSymbol $kw627$SUP;
  private static final SubLString $str628$_sup_;
  private static final SubLSymbol $kw629$NSUB;
  private static final SubLString $str630$_nsub_;
  private static final SubLSymbol $kw631$SUBE;
  private static final SubLString $str632$_sube_;
  private static final SubLSymbol $kw633$SUPE;
  private static final SubLString $str634$_supe_;
  private static final SubLSymbol $kw635$OPLUS;
  private static final SubLString $str636$_oplus_;
  private static final SubLSymbol $kw637$OTIMES;
  private static final SubLString $str638$_otimes_;
  private static final SubLSymbol $kw639$PERP;
  private static final SubLString $str640$_perp_;
  private static final SubLSymbol $kw641$SDOT;
  private static final SubLString $str642$_sdot_;
  private static final SubLSymbol $kw643$LCEIL;
  private static final SubLString $str644$_lceil_;
  private static final SubLSymbol $kw645$RCEIL;
  private static final SubLString $str646$_rceil_;
  private static final SubLSymbol $kw647$LFLOOR;
  private static final SubLString $str648$_lfloor_;
  private static final SubLSymbol $kw649$RFLOOR;
  private static final SubLString $str650$_rfloor_;
  private static final SubLSymbol $kw651$LANG;
  private static final SubLString $str652$_lang_;
  private static final SubLSymbol $kw653$RANG;
  private static final SubLString $str654$_rang_;
  private static final SubLSymbol $kw655$LOZ;
  private static final SubLString $str656$_loz_;
  private static final SubLSymbol $kw657$SPADES;
  private static final SubLString $str658$_spades_;
  private static final SubLSymbol $kw659$CLUBS;
  private static final SubLString $str660$_clubs_;
  private static final SubLSymbol $kw661$HEARTS;
  private static final SubLString $str662$_hearts_;
  private static final SubLSymbol $kw663$DIAMS;
  private static final SubLString $str664$_diams_;
  private static final SubLSymbol $kw665$FROWNY_FACE;
  private static final SubLString $str666$__9785_;
  private static final SubLSymbol $sym667$HEX_CHAR_STRING_P;
  private static final SubLString $str668$__;
  private static final SubLString $str669$_;
  private static final SubLString $str670$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str671$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw672$UNINITIALIZED;
  private static final SubLString $str673$Echo_of_ARGS;
  private static final SubLSymbol $kw674$SELF;
  private static final SubLString $str675$Back;
  private static final SubLSymbol $sym676$HTML_ECHO_ARGS;
  private static final SubLSymbol $kw677$HTML_HANDLER;
  private static final SubLList $list678;
  private static final SubLSymbol $kw679$INPUT;
  private static final SubLString $str680$Unable_to_open__S;
  private static final SubLSymbol $sym681$HTML_ECHO_FILE;
  private static final SubLString $str682$_;
  private static final SubLString $str683$____;
  private static final SubLString $str684$___;
  private static final SubLString $str685$_script;
  private static final SubLString $str686$__script_;
  private static final SubLString $str687$__script;
  private static final SubLList $list688;
  private static final SubLList $list689;
  private static final SubLString $str690$http___;
  private static final SubLInteger $int691$80;
  private static final SubLSymbol $kw692$GET;
  private static final SubLString $str693$_style;
  private static final SubLString $str694$__style_;
  private static final SubLString $str695$_p_;
  private static final SubLString $str696$_file_input_;
  private static final SubLString $str697$this_form_;
  private static final SubLString $str698$_value___this_value_;
  private static final SubLString $str699$TEXT;
  private static final SubLList $list700;
  private static final SubLSymbol $sym701$FRAME_NAME_VAR;
  private static final SubLSymbol $sym702$CLET;
  private static final SubLSymbol $sym703$CB_FRAME_NAME;
  private static final SubLSymbol $sym704$HTML_FANCY_FORM;
  private static final SubLSymbol $sym705$_CYC_CGI_PROGRAM_;
  private static final SubLSymbol $sym706$_HTML_FORM_METHOD_POST_;
  private static final SubLList $list707;
  private static final SubLSymbol $sym708$HTML_HIDDEN_INPUT;
  private static final SubLList $list709;
  private static final SubLString $str710$_multipart_formdata;
  private static final SubLString $str711$application_octet_stream;
  private static final SubLString $str712$T;
  private static final SubLSymbol $sym713$CHAR_;
  private static final SubLList $list714;
  private static final SubLString $str715$__2__0X;
  private static final SubLString $str716$____________________;
  private static final SubLInteger $int717$200;
  private static final SubLSymbol $kw718$VERTICAL;
  private static final SubLSymbol $kw719$SIZE;
  private static final SubLSymbol $kw720$CLASS;
  private static final SubLSymbol $sym721$FUNCTION_SPEC_P;
  private static final SubLSymbol $kw722$NAME;
  private static final SubLSymbol $kw723$COLOR;
  private static final SubLSymbol $kw724$FONT_COLOR;
  private static final SubLSymbol $kw725$BLACK;
  private static final SubLInteger $int726$400;
  private static final SubLInteger $int727$800;
  private static final SubLSymbol $kw728$HORIZONTAL;
  private static final SubLSymbol $kw729$CLASS_COLORMAP;
  private static final SubLString $str730$new_login_id;
  private static final SubLString $str731$hashed_password;
  private static final SubLString $str732$User_ID;
  private static final SubLString $str733$Password;
  private static final SubLString $str734$unhashed_password_;
  private static final SubLString $str735$var_oldB64Pad___b64pad__b64pad___;
  private static final SubLString $str736$_value_this_form_;
  private static final SubLString $str737$_value___this_form_;
  private static final SubLString $str738$_value_b64_sha1_theInput___b64pad;
  private static final SubLSymbol $kw739$SHA1;
  private static final SubLInteger $int740$30;
  private static final SubLSymbol $kw741$PASSWORD;
  private static final SubLString $str742$Submit;
  private static final SubLString $str743$HTML_Utilities_Test;
  private static final SubLString $str744$_Category;
  private static final SubLString $str745$_Suite;
  private static final SubLString $str746$HTML_Utilities;

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 716L)
  public static SubLObject html_flush()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    streams_high.force_output( html_macros.$html_stream$.getDynamicValue( thread ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 907L)
  public static SubLObject html_char(final SubLObject v_char, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      streams_high.write_char( v_char, html_macros.$html_stream$.getDynamicValue( thread ) );
    }
    return v_char;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 1069L)
  public static SubLObject html_string(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == end )
    {
      end = Sequences.length( string );
    }
    if( start.numL( end ) )
    {
      if( ( NIL != html_macros.$html_safe_print$.getDynamicValue( thread ) && NIL != Sequences.find_if( $sym1$HTML_RESERVED_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) || NIL != Sequences.find_if(
          $sym2$NON_ASCII_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject v_char;
        SubLObject subst_string;
        for( end_var = ( end_var_$1 = ( ( NIL != end ) ? end : Sequences.length( string ) ) ), char_num = NIL, char_num = start; !char_num.numGE( end_var_$1 ); char_num = number_utilities.f_1X( char_num ) )
        {
          v_char = Strings.sublisp_char( string, char_num );
          subst_string = html_escape_string_for_char( v_char, html_macros.$html_safe_print$.getDynamicValue( thread ) );
          if( NIL != subst_string )
          {
            streams_high.write_string( subst_string, html_macros.$html_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          }
          else
          {
            streams_high.write_char( v_char, html_macros.$html_stream$.getDynamicValue( thread ) );
          }
        }
      }
      else
      {
        streams_high.write_string( string, html_macros.$html_stream$.getDynamicValue( thread ), start, end );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 1855L)
  public static SubLObject html_reserved_char_p(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.sublisp_boolean( list_utilities.alist_lookup_without_values( html_macros.$html_escapes_map$.getDynamicValue( thread ), v_object, Symbols.symbol_function( EQ ), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 2045L)
  public static SubLObject html_escape_string_for_char(final SubLObject v_char, final SubLObject escape_reserved_charsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != unicode_strings.non_ascii_char_p( v_char ) )
    {
      return html_escape_string_for_non_ascii_char( v_char );
    }
    if( NIL != escape_reserved_charsP )
    {
      return list_utilities.alist_lookup_without_values( html_macros.$html_escapes_map$.getDynamicValue( thread ), v_char, Symbols.symbol_function( EQ ), NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 2333L)
  public static SubLObject string_has_any_escape_charsP(final SubLObject string, final SubLObject escape_reserved_charsP)
  {
    SubLObject result = NIL;
    final SubLObject end_var = Sequences.length( string );
    if( NIL == result )
    {
      SubLObject end_var_$2;
      SubLObject char_num;
      SubLObject v_char;
      for( end_var_$2 = end_var, char_num = NIL, char_num = ZERO_INTEGER; NIL == result && !char_num.numGE( end_var_$2 ); char_num = number_utilities.f_1X( char_num ) )
      {
        v_char = Strings.sublisp_char( string, char_num );
        if( NIL != unicode_strings.non_ascii_char_p( v_char ) || ( NIL != escape_reserved_charsP && NIL != html_reserved_character_code_p( Characters.char_code( v_char ) ) ) )
        {
          result = T;
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 2639L)
  public static SubLObject html_reserved_character_code_p(final SubLObject code)
  {
    if( code.eql( $int3$38 ) || code.eql( $int4$34 ) || code.eql( $int5$60 ) || code.eql( $int6$62 ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 2788L)
  public static SubLObject html_escape_string_for_non_ascii_char(final SubLObject v_char)
  {
    assert NIL != unicode_strings.non_ascii_char_p( v_char ) : v_char;
    final SubLObject char_code = Characters.char_code( v_char );
    return Sequences.cconcatenate( $str7$__x, new SubLObject[] { format_nil.format_nil_a_no_copy( number_utilities.convert_to_hexadecimal( char_code ) ), $str8$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 3077L)
  public static SubLObject html_escape(final SubLObject string, final SubLObject escape_reserved_charsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    if( NIL == string_has_any_escape_charsP( string, escape_reserved_charsP ) )
    {
      return string;
    }
    SubLObject new_string = NIL;
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( escape_reserved_charsP, thread );
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        final SubLObject _prev_bind_0_$3 = html_macros.$html_stream$.currentBinding( thread );
        try
        {
          html_macros.$html_stream$.bind( stream, thread );
          html_string( string, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_stream$.rebind( _prev_bind_0_$3, thread );
        }
        new_string = streams_high.get_output_stream_string( stream );
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    return new_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 3608L)
  public static SubLObject subl_string_to_display_vector_string(final SubLObject subl_string)
  {
    return unicode_strings.html_escaped_to_display( html_escape( subl_string, T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 3739L)
  public static SubLObject html_princ(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != html_macros.$html_safe_print$.getDynamicValue( thread ) )
    {
      if( v_object.isString() )
      {
        html_string( v_object, UNPROVIDED, UNPROVIDED );
      }
      else if( NIL != nart_handles.nart_p( v_object ) )
      {
        html_princ( format_nil.format_nil_a( v_object ) );
      }
      else if( NIL != constant_handles.constant_p( v_object ) )
      {
        html_markup( constants_high.constant_name( v_object ) );
      }
      else if( v_object.isChar() )
      {
        html_char( v_object, UNPROVIDED );
      }
      else if( v_object.isNumber() )
      {
        print_high.princ( v_object, html_macros.$html_stream$.getDynamicValue( thread ) );
      }
      else if( v_object.isKeyword() )
      {
        html_string( Symbols.symbol_name( v_object ), UNPROVIDED, UNPROVIDED );
      }
      else if( v_object.isSymbol() )
      {
        html_string( Symbols.symbol_name( v_object ), UNPROVIDED, UNPROVIDED );
      }
      else
      {
        html_princ( format_nil.format_nil_a( v_object ) );
      }
    }
    else
    {
      print_high.princ( v_object, html_macros.$html_stream$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 4591L)
  public static SubLObject html_princ_strong(final SubLObject v_object)
  {
    html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_princ( v_object );
    html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 4687L)
  public static SubLObject html_princ_possibly_strong(final SubLObject v_object, final SubLObject strongP)
  {
    if( NIL != strongP )
    {
      html_princ_strong( v_object );
    }
    else
    {
      html_princ( v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 4837L)
  public static SubLObject html_princ_non_breaking(final SubLObject v_object)
  {
    html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    html_princ( v_object );
    html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 4941L)
  public static SubLObject html_prin1(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != html_macros.$html_safe_print$.getDynamicValue( thread ) )
    {
      if( v_object.isString() )
      {
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_escapes_map$.currentBinding( thread );
        try
        {
          html_macros.$html_escapes_map$.bind( html_macros.$html_prin1_string_escapes_map$.getGlobalValue(), thread );
          html_princ( v_object );
        }
        finally
        {
          html_macros.$html_escapes_map$.rebind( _prev_bind_0, thread );
        }
        html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      else if( v_object.isKeyword() )
      {
        html_char( Characters.CHAR_colon, UNPROVIDED );
        html_princ( v_object );
      }
      else if( v_object.isNumber() )
      {
        print_high.prin1( v_object, html_macros.$html_stream$.getDynamicValue( thread ) );
      }
      else
      {
        html_princ( format_nil.format_nil_s( v_object ) );
      }
    }
    else
    {
      print_high.prin1( v_object, html_macros.$html_stream$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 5544L)
  public static SubLObject html_princ_formatted_string(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    if( NIL == Sequences.find( Characters.CHAR_newline, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL == Sequences.find( Characters.CHAR_space, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      html_princ( string );
    }
    else
    {
      SubLObject end_var_$5;
      SubLObject end_var;
      SubLObject char_num;
      SubLObject pcase_var;
      SubLObject character;
      for( end_var = ( end_var_$5 = Sequences.length( string ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$5 ); char_num = number_utilities.f_1X( char_num ) )
      {
        character = ( pcase_var = Strings.sublisp_char( string, char_num ) );
        if( pcase_var.eql( Characters.CHAR_newline ) )
        {
          html_newline( UNPROVIDED );
        }
        else if( pcase_var.eql( Characters.CHAR_space ) )
        {
          html_glyph( $kw10$NBSP, UNPROVIDED );
        }
        else
        {
          html_char( character, UNPROVIDED );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 5999L)
  public static SubLObject html_terpri(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      streams_high.terpri( html_macros.$html_stream$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6147L)
  public static SubLObject html_source_readability_terpri(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == html_macros.$within_html_pre$.getDynamicValue( thread ) && NIL == html_macros.$suppress_html_source_readability_terpriP$.getDynamicValue( thread ) )
    {
      html_terpri( n );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6404L)
  public static SubLObject html_tab(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    return html_char( Characters.CHAR_tab, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6513L)
  public static SubLObject html_spaces(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    html_indent( n );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6667L)
  public static SubLObject html_indent(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $float11$0_5;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( n.numG( ZERO_INTEGER ) )
    {
      if( NIL != html_macros.$within_html_pre$.getDynamicValue( thread ) )
      {
        return html_char( Characters.CHAR_space, n );
      }
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.subtract( Numbers.multiply( TWO_INTEGER, n ), ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        html_glyph( $kw10$NBSP, UNPROVIDED );
      }
      html_char( Characters.CHAR_space, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6986L)
  public static SubLObject html_markup(final SubLObject thing)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( thing.isString() )
    {
      streams_high.write_string( thing, html_macros.$html_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    }
    else
    {
      print_high.princ( thing, html_macros.$html_stream$.getDynamicValue( thread ) );
    }
    return thing;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 7351L)
  public static SubLObject html_print_doc_string(final SubLObject string)
  {
    html_princ( Characters.CHAR_quotation );
    html_princ_doc_string( string, UNPROVIDED );
    html_princ( Characters.CHAR_quotation );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 7766L)
  public static SubLObject html_princ_doc_string(final SubLObject string, SubLObject link_function)
  {
    if( link_function == UNPROVIDED )
    {
      link_function = $sym12$CB_FORM;
    }
    return html_princ_cycl_string( string, link_function, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 8007L)
  public static SubLObject hide_non_ascii_chars(final SubLObject unicode_string)
  {
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject vector_var = unicode_strings.display_to_unicode_vector( cycl_utilities.nat_arg1( unicode_string, UNPROVIDED ) );
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject code;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        code = Vectors.aref( vector_var, element_num );
        if( code.numL( $int13$128 ) )
        {
          print_high.princ( Characters.code_char( code ), stream );
        }
        else
        {
          PrintLow.format( stream, $str14$__A_, code );
        }
      }
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 8484L)
  public static SubLObject html_princ_string_with_hidden_non_ascii_chars(final SubLObject str)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject next_start_idx;
    for( SubLObject last_pipe = next_start_idx = ZERO_INTEGER, next_pipe = Sequences.position( Characters.CHAR_vertical, str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ); NIL != next_pipe; next_pipe = Sequences
        .position( Characters.CHAR_vertical, str, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), next_start_idx, UNPROVIDED ) )
    {
      html_markup( string_utilities.substring( str, next_start_idx, next_pipe ) );
      last_pipe = ( next_start_idx = next_pipe );
      next_pipe = Sequences.position( Characters.CHAR_vertical, str, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), number_utilities.f_1X( last_pipe ), UNPROVIDED );
      final SubLObject code = reader.read_from_string_ignoring_errors( str, NIL, $kw15$EOF, number_utilities.f_1X( last_pipe ), next_pipe );
      if( NIL != subl_promotions.positive_integer_p( code ) )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str16$__x_x_, code );
        last_pipe = next_pipe;
        next_start_idx = number_utilities.f_1X( last_pipe );
      }
    }
    if( NIL != list_utilities.lengthG( str, next_start_idx, UNPROVIDED ) )
    {
      html_markup( string_utilities.substring( str, next_start_idx, UNPROVIDED ) );
    }
    return str;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 9421L)
  public static SubLObject html_princ_cycl_string(final SubLObject string, SubLObject link_function, SubLObject require_exactP)
  {
    if( link_function == UNPROVIDED )
    {
      link_function = $sym12$CB_FORM;
    }
    if( require_exactP == UNPROVIDED )
    {
      require_exactP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != unicode_nauts.unicode_naut_p( string, UNPROVIDED ) )
    {
      SubLObject html = NIL;
      SubLObject stream = NIL;
      try
      {
        stream = streams_high.make_private_string_output_stream();
        final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
        try
        {
          html_macros.$html_stream$.bind( stream, thread );
          html_princ_cycl_string( hide_non_ascii_chars( string ), link_function, require_exactP );
        }
        finally
        {
          html_macros.$html_stream$.rebind( _prev_bind_0, thread );
        }
        html = streams_high.get_output_stream_string( stream );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( stream, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      return html_princ_string_with_hidden_non_ascii_chars( html );
    }
    if( NIL != html_cycl_string_printer.$html_large_string_limit$.getDynamicValue( thread ) && NIL != list_utilities.lengthG( string, html_cycl_string_printer.$html_large_string_limit$.getDynamicValue( thread ),
        UNPROVIDED ) )
    {
      final SubLObject prefix = string_utilities.substring( string, ZERO_INTEGER, html_cycl_string_printer.$html_large_string_limit$.getDynamicValue( thread ) );
      final SubLObject truncated_string = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( prefix ), new SubLObject[] { $str17$______i__, format_nil.format_nil_a_no_copy( Sequences.length( string ) ),
        $str18$_characters_total___i_
      } );
      final SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding( thread );
      try
      {
        html_cycl_string_printer.$html_large_string_limit$.bind( NIL, thread );
        html_princ_cycl_string( truncated_string, link_function, require_exactP );
      }
      finally
      {
        html_cycl_string_printer.$html_large_string_limit$.rebind( _prev_bind_0, thread );
      }
      return truncated_string;
    }
    return ( NIL != $use_new_html_princ_cycl_stringP$.getDynamicValue( thread ) ) ? html_princ_cycl_string_new( string, link_function, require_exactP )
        : html_princ_cycl_string_old( string, link_function, require_exactP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 10731L)
  public static SubLObject html_princ_cycl_string_new(final SubLObject string, final SubLObject link_function, final SubLObject require_exactP)
  {
    final SubLObject printer = html_cycl_string_printer.new_html_cycl_string_printer( string, link_function, require_exactP );
    while ( NIL == html_cycl_string_printer.html_cycl_string_printer_done_p( printer ))
    {
      html_cycl_string_printer.html_cycl_string_printer_print_next( printer );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 11020L)
  public static SubLObject html_princ_cycl_string_old(final SubLObject string, final SubLObject link_function, final SubLObject require_exactP)
  {
    final SubLObject length = Sequences.length( string );
    SubLObject last_idx = ZERO_INTEGER;
    SubLObject next_char_idx = NIL;
    SubLObject inside_cycl_tagP = NIL;
    SubLObject hash_idx = NIL;
    SubLObject colon_idx = NIL;
    SubLObject lt_idx = NIL;
    SubLObject variable_idx = NIL;
    SubLObject url_idx = NIL;
    SubLObject url_end_idx = NIL;
    hash_idx = Sequences.position( Characters.CHAR_hash, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED );
    colon_idx = Sequences.position( Characters.CHAR_colon, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED );
    lt_idx = Sequences.position( Characters.CHAR_less, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED );
    variable_idx = html_cycl_string_printer.html_cycl_string_variable_index( string, last_idx );
    url_idx = ZERO_INTEGER;
    url_end_idx = ZERO_INTEGER;
    while ( NIL != colon_idx || NIL != hash_idx || NIL != lt_idx || NIL != variable_idx)
    {
      next_char_idx = Functions.apply( Symbols.symbol_function( $sym19$MIN ), Sequences.remove_if( Symbols.symbol_function( $sym20$NULL ), ConsesLow.list( hash_idx, colon_idx, lt_idx, variable_idx ), UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      if( colon_idx.eql( next_char_idx ) )
      {
        url_idx = web_utilities.find_url_beginning( string, length, colon_idx );
        if( NIL != url_idx )
        {
          url_end_idx = web_utilities.find_url_end( string, length, url_idx );
        }
        if( NIL != url_idx && NIL != url_end_idx )
        {
          html_string( string, last_idx, url_idx );
          html_cycl_string_printer.print_url_with_tag( Sequences.subseq( string, url_idx, url_end_idx ) );
          last_idx = url_end_idx;
        }
        else
        {
          html_string( string, last_idx, Numbers.add( ONE_INTEGER, colon_idx ) );
          last_idx = Numbers.add( ONE_INTEGER, colon_idx );
        }
        colon_idx = Sequences.position( Characters.CHAR_colon, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED );
        hash_idx = Sequences.position( Characters.CHAR_hash, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED );
        variable_idx = Sequences.position_if( $sym21$EL_VARIABLE_CHAR_, string, Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED );
      }
      else if( hash_idx.eql( next_char_idx ) )
      {
        html_string( string, last_idx, hash_idx );
        final SubLObject dollar_idx = Numbers.add( hash_idx, ONE_INTEGER );
        if( dollar_idx.numE( length ) || !Strings.sublisp_char( string, dollar_idx ).eql( constant_reader.constant_reader_macro_char() ) )
        {
          html_princ( Characters.CHAR_hash );
          last_idx = dollar_idx;
        }
        else
        {
          last_idx = html_cycl_string_printer.print_embedded_constant( string, length, dollar_idx, link_function, require_exactP );
        }
        hash_idx = Sequences.position( Characters.CHAR_hash, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED );
        colon_idx = Sequences.position( Characters.CHAR_colon, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED );
        variable_idx = Sequences.position_if( $sym21$EL_VARIABLE_CHAR_, string, Symbols.symbol_function( IDENTITY ), last_idx, UNPROVIDED );
      }
      else if( variable_idx.eql( next_char_idx ) )
      {
        html_string( string, last_idx, variable_idx );
        last_idx = variable_idx;
        final SubLObject non_variable_idx = list_utilities.position_if_not( $sym21$EL_VARIABLE_CHAR_, string, Symbols.symbol_function( IDENTITY ), variable_idx, UNPROVIDED );
        if( NIL != inside_cycl_tagP && NIL != non_variable_idx && non_variable_idx.numG( variable_idx ) && NIL == Characters.alpha_char_p( Strings.sublisp_char( string, non_variable_idx ) ) )
        {
          final SubLObject variable_name = Sequences.subseq( string, variable_idx, non_variable_idx );
          if( NIL != cycl_variables.valid_el_var_nameP( variable_name ) )
          {
            html_princ( variable_name );
          }
          else if( NIL != string_utilities.integer_string_p( variable_name ) )
          {
            html_princ( variable_name );
          }
          else
          {
            html_markup( html_macros.$html_bold_head$.getGlobalValue() );
            html_princ( variable_name );
            html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
          }
          last_idx = non_variable_idx;
        }
        if( NIL != non_variable_idx )
        {
          variable_idx = html_cycl_string_printer.html_cycl_string_variable_index( string, non_variable_idx );
        }
        else
        {
          variable_idx = NIL;
        }
      }
      else if( lt_idx.eql( next_char_idx ) )
      {
        html_string( string, last_idx, lt_idx );
        last_idx = lt_idx;
        final SubLObject gt_idx = Sequences.position( Characters.CHAR_greater, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), lt_idx, UNPROVIDED );
        if( NIL != gt_idx )
        {
          final SubLObject tag_start_idx = ( NIL != Characters.charE( Characters.CHAR_slash, Strings.sublisp_char( string, Numbers.add( lt_idx, ONE_INTEGER ) ) ) ) ? TWO_INTEGER : ONE_INTEGER;
          final SubLObject tag = Sequences.subseq( string, Numbers.add( lt_idx, tag_start_idx ), gt_idx );
          if( NIL != subl_promotions.memberP( Strings.string_downcase( string_utilities.trim_whitespace( tag ), UNPROVIDED, UNPROVIDED ), html_cycl_string_printer.$cycl_string_allowable_html_tags$.getGlobalValue(),
              Symbols.symbol_function( $sym22$STRING_ ), UNPROVIDED ) )
          {
            html_markup( $str23$_ );
            if( TWO_INTEGER.eql( tag_start_idx ) )
            {
              html_princ( $str24$_ );
            }
            html_markup( tag );
            html_markup( $str25$_ );
            if( NIL != Strings.string_equal( tag, $str26$code, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Strings.string_equal( tag, $str27$pre, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              if( TWO_INTEGER.eql( tag_start_idx ) )
              {
                inside_cycl_tagP = NIL;
              }
              else
              {
                inside_cycl_tagP = T;
              }
            }
            last_idx = Numbers.add( gt_idx, ONE_INTEGER );
          }
        }
        lt_idx = Sequences.position( Characters.CHAR_less, string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), Numbers.add( lt_idx, ONE_INTEGER ), UNPROVIDED );
      }
      hash_idx = hash_idx;
      colon_idx = colon_idx;
      lt_idx = lt_idx;
      variable_idx = variable_idx;
      url_idx = url_idx;
      url_end_idx = url_end_idx;
    }
    html_string( string, last_idx, NIL );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 15721L)
  public static SubLObject html_cycl_string(final SubLObject string, SubLObject link_function, SubLObject require_exactP)
  {
    if( link_function == UNPROVIDED )
    {
      link_function = $sym28$HTML_LINK_TO_OWL_URI;
    }
    if( require_exactP == UNPROVIDED )
    {
      require_exactP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject html_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding( thread );
      try
      {
        html_macros.$html_stream$.bind( stream, thread );
        html_princ_cycl_string( string, link_function, require_exactP );
      }
      finally
      {
        html_macros.$html_stream$.rebind( _prev_bind_0, thread );
      }
      html_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return html_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 15985L)
  public static SubLObject opencyc_html_cycl_string(final SubLObject string)
  {
    return html_cycl_string( string, $sym29$HTML_LINK_TO_OWL_OPENCYC_URI, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 18237L)
  public static SubLObject cb_form_for_cycl_string(final SubLObject v_cycl_string, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLObject cycl_list = reader.read_from_string_ignoring_errors( v_cycl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != Strings.stringE( format_nil.format_nil_a( cycl_list ), v_cycl_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      cb_utilities.cb_form( cycl_list, depth, wrap_axiomsP );
    }
    else
    {
      cb_utilities.cb_form( v_cycl_string, depth, wrap_axiomsP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 18902L)
  public static SubLObject html_stale_constant_reference(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $html_stale_constant_reference_color$.getDynamicValue( thread ) )
    {
      final SubLObject color_val = $html_stale_constant_reference_color$.getDynamicValue( thread );
      html_markup( html_macros.$html_font_head$.getGlobalValue() );
      if( NIL != color_val )
      {
        html_markup( html_macros.$html_font_color$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( html_color( color_val ) );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_string( string, start, end );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    }
    else
    {
      html_string( string, start, end );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 19176L)
  public static SubLObject html_show_string_with_invalid_constants_highlighted(final SubLObject string, SubLObject require_exactP)
  {
    if( require_exactP == UNPROVIDED )
    {
      require_exactP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $html_stale_constant_reference_color$.currentBinding( thread );
    try
    {
      $html_stale_constant_reference_color$.bind( $kw38$RED, thread );
      html_princ_cycl_string( string, $sym12$CB_FORM, require_exactP );
    }
    finally
    {
      $html_stale_constant_reference_color$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 24927L)
  public static SubLObject html_url_princ(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( v_object.isString() )
    {
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Sequences.length( v_object ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        html_url_princ_char( Strings.sublisp_char( v_object, i ) );
      }
    }
    else if( v_object.isSymbol() )
    {
      html_url_princ( Symbols.symbol_name( v_object ) );
    }
    else if( v_object.isInteger() )
    {
      html_markup( v_object );
    }
    else if( NIL != nart_handles.nart_p( v_object ) )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str39$_A, v_object );
    }
    else if( NIL != constant_handles.constant_p( v_object ) )
    {
      html_url_princ( constants_high.constant_name( v_object ) );
    }
    else if( v_object.isChar() )
    {
      html_url_princ_char( v_object );
    }
    else if( v_object.isCons() )
    {
      html_url_princ( $str40$_ );
      SubLObject rest = NIL;
      SubLObject item = NIL;
      rest = v_object;
      item = rest.first();
      while ( rest.rest().isCons())
      {
        if( !rest.eql( v_object ) )
        {
          html_url_princ( $str41$_ );
        }
        html_url_princ( item );
        rest = rest.rest();
        item = rest.first();
      }
      if( !rest.eql( v_object ) )
      {
        html_url_princ( $str41$_ );
      }
      html_url_princ( rest.first() );
      if( NIL != rest.rest() )
      {
        html_url_princ( $str42$___ );
        html_url_princ( rest.rest() );
      }
      html_url_princ( $str43$_ );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str39$_A, v_object );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 26037L)
  public static SubLObject html_url_princ_char(final SubLObject v_char)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Characters.alpha_char_p( v_char ) || NIL != Characters.digit_char_p( v_char, UNPROVIDED ) || NIL != Sequences.find( v_char, $str44$___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      html_char( v_char, UNPROVIDED );
    }
    else if( v_char.eql( Characters.CHAR_space ) && NIL != $html_url_princ_escape_spaces$.getDynamicValue( thread ) )
    {
      html_char( Characters.CHAR_plus, UNPROVIDED );
    }
    else
    {
      final SubLObject code = Characters.char_code( v_char );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str45$__C_C, string_utilities.hex_char( Numbers.integerDivide( code, SIXTEEN_INTEGER ) ), string_utilities.hex_char( Numbers.mod( code,
          SIXTEEN_INTEGER ) ) );
    }
    return v_char;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 26440L)
  public static SubLObject html_simple_attribute(final SubLObject attribute)
  {
    html_markup( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( attribute ), new SubLObject[] { $str46$_, format_nil.format_nil_s_no_copy( attribute )
    } ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 26758L)
  public static SubLObject html_simple_quoted_attribute(final SubLObject attribute, final SubLObject value)
  {
    html_markup( attribute );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( value );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 26969L)
  public static SubLObject html_color(SubLObject color)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( color.isString() )
    {
      return color;
    }
    color = conses_high.assoc( color, html_macros.$html_color_map$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest();
    if( color.isString() )
    {
      return color;
    }
    return $str47$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 27278L)
  public static SubLObject html_style_background_color(final SubLObject color)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject color_string = html_color( color );
    html_princ( $html_style_background$.getDynamicValue( thread ) );
    html_princ( color_string );
    html_princ( $str8$_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 27940L)
  public static SubLObject html_align(SubLObject align)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( align.isString() )
    {
      return align;
    }
    align = conses_high.assoc( align, $html_align_map$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ).rest();
    if( align.isString() )
    {
      return align;
    }
    return $str47$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 28532L)
  public static SubLObject html_copyright_notice()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_hr( UNPROVIDED, UNPROVIDED );
    html_markup( html_macros.$html_span_head$.getGlobalValue() );
    html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str53$copyright );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_markup( html_macros.$html_italic_head$.getGlobalValue() );
      html_copyright_text();
      html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 28685L)
  public static SubLObject html_copyright_text()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str54$Copyright__copy__1995____A_, numeric_date_utilities.this_year() );
    html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $cycorp_homepage_url$.getDynamicValue( thread ) );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_princ( $cycorp_homepage_text$.getDynamicValue( thread ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_princ( $str55$___All_rights_reserved___ );
    html_princ( $proprietarity_message$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 29446L)
  public static SubLObject html_mailto_url(final SubLObject address)
  {
    assert NIL != Types.stringp( address ) : address;
    html_markup( html_macros.$html_protocol_mailto$.getGlobalValue() );
    html_princ( address );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 29764L)
  public static SubLObject html_file_url(final SubLObject filename)
  {
    assert NIL != Types.stringp( filename ) : filename;
    html_markup( html_macros.$html_protocol_file$.getGlobalValue() );
    html_princ( filename );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 29962L)
  public static SubLObject html_refresh(final SubLObject seconds, SubLObject url)
  {
    if( url == UNPROVIDED )
    {
      url = NIL;
    }
    if( seconds.isInteger() )
    {
      final SubLObject content = Sequences.cconcatenate( format_nil.format_nil_d_no_copy( seconds ), format_nil.format_nil_a_no_copy( ( NIL != url ) ? Sequences.cconcatenate( $str70$_URL_, format_nil
          .format_nil_a_no_copy( url ) ) : $str47$ ) );
      html_source_readability_terpri( UNPROVIDED );
      html_markup( html_macros.$html_meta_head$.getGlobalValue() );
      html_markup( html_macros.$html_meta_http_equiv$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( $str71$Refresh );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != content )
      {
        html_markup( html_macros.$html_meta_content$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( content );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_char( Characters.CHAR_greater, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 30341L)
  public static SubLObject html_meta_utf_8_content_type()
  {
    html_source_readability_terpri( UNPROVIDED );
    html_markup( html_macros.$html_meta_head$.getGlobalValue() );
    html_markup( html_macros.$html_meta_http_equiv$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str72$Content_type );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_meta_content$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str73$text_html__charset_UTF_8 );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 30551L)
  public static SubLObject html_meta_expires(SubLObject seconds, SubLObject minutes, SubLObject hours)
  {
    if( seconds == UNPROVIDED )
    {
      seconds = ZERO_INTEGER;
    }
    if( minutes == UNPROVIDED )
    {
      minutes = ZERO_INTEGER;
    }
    if( hours == UNPROVIDED )
    {
      hours = ZERO_INTEGER;
    }
    final SubLObject time = numeric_date_utilities.universal_time_from_now( seconds, minutes, hours );
    final SubLObject date_string = web_utilities.http_date_string( time );
    html_source_readability_terpri( UNPROVIDED );
    html_markup( html_macros.$html_meta_head$.getGlobalValue() );
    html_markup( html_macros.$html_meta_http_equiv$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str74$Expires );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != date_string )
    {
      html_markup( html_macros.$html_meta_content$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( date_string );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 30820L)
  public static SubLObject html_meta_last_modified(SubLObject time)
  {
    if( time == UNPROVIDED )
    {
      time = Time.get_universal_time();
    }
    final SubLObject date_string = web_utilities.http_date_string( time );
    html_source_readability_terpri( UNPROVIDED );
    html_markup( html_macros.$html_meta_head$.getGlobalValue() );
    html_markup( html_macros.$html_meta_http_equiv$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str75$Last_Modified );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != date_string )
    {
      html_markup( html_macros.$html_meta_content$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( date_string );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31041L)
  public static SubLObject html_meta_dont_cache()
  {
    html_source_readability_terpri( UNPROVIDED );
    html_markup( html_macros.$html_meta_head$.getGlobalValue() );
    html_markup( html_macros.$html_meta_http_equiv$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str76$Cache_Control );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_meta_content$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str77$no_cache );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31167L)
  public static SubLObject html_webpage_expires(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list78 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list78 );
      if( NIL == conses_high.member( current_$6, $list79, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw80$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
    }
    final SubLObject hh_tail = cdestructuring_bind.property_list_member( $kw81$HH, current );
    final SubLObject hh = ( NIL != hh_tail ) ? conses_high.cadr( hh_tail ) : ZERO_INTEGER;
    final SubLObject mm_tail = cdestructuring_bind.property_list_member( $kw82$MM, current );
    final SubLObject mm = ( NIL != mm_tail ) ? conses_high.cadr( mm_tail ) : ZERO_INTEGER;
    final SubLObject ss_tail = cdestructuring_bind.property_list_member( $kw83$SS, current );
    final SubLObject ss = ( NIL != ss_tail ) ? conses_high.cadr( ss_tail ) : ZERO_INTEGER;
    current = temp;
    if( NIL == current )
    {
      access_macros.defmacro_obsolete_warning( $sym84$HTML_WEBPAGE_EXPIRES, $list85 );
      return ConsesLow.list( $sym86$HTML_META_EXPIRES, ss, mm, hh );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31316L)
  public static SubLObject html_webpage_last_modified(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    final SubLObject univ_time = current.isCons() ? current.first() : Time.get_universal_time();
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list87 );
    current = current.rest();
    if( NIL == current )
    {
      access_macros.defmacro_obsolete_warning( $sym88$HTML_WEBPAGE_LAST_MODIFIED, $list89 );
      return ConsesLow.list( $sym90$HTML_META_LAST_MODIFIED, univ_time );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list87 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31497L)
  public static SubLObject html_dont_cache_webpage(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    if( NIL != datum )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, NIL );
    }
    access_macros.defmacro_obsolete_warning( $sym91$HTML_DONT_CACHE_WEBPAGE, $list92 );
    return $list92;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31616L)
  public static SubLObject html_meta_no_robots()
  {
    return html_meta_robot_instructions( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31776L)
  public static SubLObject html_meta_robot_instructions(SubLObject index, SubLObject follow)
  {
    if( index == UNPROVIDED )
    {
      index = NIL;
    }
    if( follow == UNPROVIDED )
    {
      follow = NIL;
    }
    final SubLObject robot_instructions = html_meta_select_robot_instructions( index, follow );
    html_source_readability_terpri( UNPROVIDED );
    html_markup( html_macros.$html_meta_head$.getGlobalValue() );
    html_markup( html_macros.$html_meta_name$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str93$ROBOTS );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != robot_instructions )
    {
      html_markup( html_macros.$html_meta_content$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( robot_instructions );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 32018L)
  public static SubLObject html_meta_select_robot_instructions(final SubLObject index, final SubLObject follow)
  {
    if( NIL == index && NIL == follow )
    {
      return $str94$NOINDEX__NOFOLLOW;
    }
    if( NIL != index && NIL != follow )
    {
      return $str95$INDEX__FOLLOW;
    }
    if( NIL == index && NIL != follow )
    {
      return $str96$NOINDEX__FOLLOW;
    }
    if( NIL != index && NIL == follow )
    {
      return $str97$INDEX__NOFOLLOW;
    }
    Errors.error( $str98$Invalid_HTML_meta_select_robot_in );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 32531L)
  public static SubLObject html_hr(SubLObject size, SubLObject width)
  {
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( width == UNPROVIDED )
    {
      width = NIL;
    }
    html_markup( html_macros.$html_hr_head$.getGlobalValue() );
    if( NIL != size )
    {
      html_markup( html_macros.$html_hr_size$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( size );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != width )
    {
      html_markup( html_macros.$html_hr_width$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( width );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 32895L)
  public static SubLObject html_line_break(SubLObject clear)
  {
    if( clear == UNPROVIDED )
    {
      clear = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != clear )
    {
      html_markup( html_macros.$html_line_break$.getGlobalValue() );
      html_markup( html_macros.$html_line_break_clear$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( clear );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_line_break_tail$.getGlobalValue() );
    }
    else
    {
      html_markup( html_macros.$html_line_break_atomic$.getGlobalValue() );
    }
    if( NIL == html_macros.$within_html_pre$.getDynamicValue( thread ) )
    {
      html_terpri( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 33250L)
  public static SubLObject html_br()
  {
    return html_line_break( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 33304L)
  public static SubLObject html_newline(SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      if( NIL != html_macros.$within_html_pre$.getDynamicValue( thread ) )
      {
        html_terpri( UNPROVIDED );
      }
      else
      {
        html_br();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 33516L)
  public static SubLObject html_checkbox_input(final SubLObject name, SubLObject value, SubLObject checkedP, SubLObject script, SubLObject onclick, SubLObject disabledP)
  {
    if( value == UNPROVIDED )
    {
      value = NIL;
    }
    if( checkedP == UNPROVIDED )
    {
      checkedP = NIL;
    }
    if( script == UNPROVIDED )
    {
      script = NIL;
    }
    if( onclick == UNPROVIDED )
    {
      onclick = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = html_macros.$html_input_disabledP$.getDynamicValue();
    }
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_checkbox$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != name )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != value )
    {
      html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_princ( value );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != checkedP )
    {
      html_simple_attribute( html_macros.$html_input_checked$.getGlobalValue() );
    }
    if( NIL != disabledP )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    if( NIL != script )
    {
      html_char( Characters.CHAR_space, UNPROVIDED );
      html_markup( script );
    }
    if( NIL != onclick )
    {
      html_markup( html_macros.$html_select_onchange$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( onclick );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34112L)
  public static SubLObject html_hidden_input(final SubLObject name, final SubLObject value, SubLObject id)
  {
    if( id == UNPROVIDED )
    {
      id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_hidden$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != id )
    {
      html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( id );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != name )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != value )
    {
      html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_princ( value );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34289L)
  public static SubLObject html_image_input(final SubLObject name, final SubLObject image_url, SubLObject align, SubLObject border)
  {
    if( align == UNPROVIDED )
    {
      align = NIL;
    }
    if( border == UNPROVIDED )
    {
      border = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_image$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != name )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != image_url )
    {
      html_markup( html_macros.$html_input_src$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( image_url );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != align )
    {
      html_markup( html_macros.$html_input_align$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_align( align ) );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != border )
    {
      html_markup( html_macros.$html_input_border$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( border );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34477L)
  public static SubLObject html_password_input(final SubLObject name, SubLObject v_default, SubLObject size)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( v_default.equalp( $str47$ ) )
    {
      v_default = NIL;
    }
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_password$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != name )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != v_default )
    {
      html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_princ( v_default );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != size )
    {
      html_markup( html_macros.$html_input_size$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( size );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34690L)
  public static SubLObject html_radio_input(final SubLObject name, SubLObject value, SubLObject checkedP, SubLObject id)
  {
    if( value == UNPROVIDED )
    {
      value = NIL;
    }
    if( checkedP == UNPROVIDED )
    {
      checkedP = NIL;
    }
    if( id == UNPROVIDED )
    {
      id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_radio$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != id )
    {
      html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( id );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != name )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != value )
    {
      html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_princ( value );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != checkedP )
    {
      html_simple_attribute( html_macros.$html_input_checked$.getGlobalValue() );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34864L)
  public static SubLObject html_reset_input(SubLObject label)
  {
    if( label == UNPROVIDED )
    {
      label = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_reset$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_value$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_princ( $str99$Reset_All_Fields );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 35317L)
  public static SubLObject html_submit_input(SubLObject label, SubLObject name, SubLObject script)
  {
    if( label == UNPROVIDED )
    {
      label = NIL;
    }
    if( name == UNPROVIDED )
    {
      name = NIL;
    }
    if( script == UNPROVIDED )
    {
      script = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_submit$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != name )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != label )
    {
      html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_princ( label );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != script )
    {
      html_char( Characters.CHAR_space, UNPROVIDED );
      html_markup( script );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 35512L)
  public static SubLObject html_text_input(final SubLObject name, SubLObject v_default, SubLObject size)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( v_default.equalp( $str47$ ) )
    {
      v_default = NIL;
    }
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_text$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != name )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != v_default )
    {
      html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_princ( v_default );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != size )
    {
      html_markup( html_macros.$html_input_size$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( size );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 35718L)
  public static SubLObject html_scripted_text_input(final SubLObject name, final SubLObject script, SubLObject v_default, SubLObject size)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( v_default.equalp( $str47$ ) )
    {
      v_default = NIL;
    }
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_text$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != name )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != v_default )
    {
      html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_princ( v_default );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != size )
    {
      html_markup( html_macros.$html_input_size$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( size );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != script )
    {
      html_char( Characters.CHAR_space, UNPROVIDED );
      html_markup( script );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 35955L)
  public static SubLObject html_disabled_text_input(final SubLObject name, SubLObject v_default, SubLObject size)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( v_default.equalp( $str47$ ) )
    {
      v_default = NIL;
    }
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_input_text$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != name )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != v_default )
    {
      html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_princ( v_default );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    if( NIL != size )
    {
      html_markup( html_macros.$html_input_size$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( size );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 36183L)
  public static SubLObject html_format_input(final SubLObject v_default, final SubLObject size, final SubLObject name_format_string, SubLObject arg_1, SubLObject arg_2, SubLObject arg_3, SubLObject arg_4)
  {
    if( arg_1 == UNPROVIDED )
    {
      arg_1 = NIL;
    }
    if( arg_2 == UNPROVIDED )
    {
      arg_2 = NIL;
    }
    if( arg_3 == UNPROVIDED )
    {
      arg_3 = NIL;
    }
    if( arg_4 == UNPROVIDED )
    {
      arg_4 = NIL;
    }
    final SubLObject name = PrintLow.format( NIL, name_format_string, new SubLObject[] { arg_1, arg_2, arg_3, arg_4
    } );
    return html_text_input( name, v_default, size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 36485L)
  public static SubLObject html_autocomplete_text_input(final SubLObject name, SubLObject v_default, SubLObject size, SubLObject cycl_type, SubLObject style)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( cycl_type == UNPROVIDED )
    {
      cycl_type = NIL;
    }
    if( style == UNPROVIDED )
    {
      style = $str47$;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != html_macros.next_html_id_definedP( UNPROVIDED ) )
    {
      final SubLObject id_num = html_macros.next_html_id( UNPROVIDED );
      final SubLObject autocomplete_id = Sequences.cconcatenate( $str100$autocomplete_, format_nil.format_nil_a_no_copy( id_num ) );
      final SubLObject input_id = Sequences.cconcatenate( $str101$input_, format_nil.format_nil_a_no_copy( id_num ) );
      final SubLObject result_id = Sequences.cconcatenate( $str102$autocomplete_results_, format_nil.format_nil_a_no_copy( id_num ) );
      final SubLObject complete_style = Sequences.cconcatenate( $str103$position_static__width_auto_, format_nil.format_nil_a_no_copy( style ) );
      html_markup( html_macros.$html_span_head$.getGlobalValue() );
      if( NIL != autocomplete_id )
      {
        html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( autocomplete_id );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( $str104$yui_ac );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_markup( html_macros.$html_input_head$.getGlobalValue() );
        html_markup( html_macros.$html_input_type$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( html_macros.$html_input_text$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( html_macros.$html_input_style$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( complete_style );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != input_id )
        {
          html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( input_id );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != name )
        {
          html_markup( html_macros.$html_input_name$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( name );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != v_default )
        {
          html_markup( html_macros.$html_input_value$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_princ( v_default );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != size )
        {
          html_markup( html_macros.$html_input_size$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( size );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( $str105$yui_ac_input );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
        {
          html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
        }
        html_char( Characters.CHAR_greater, UNPROVIDED );
        html_markup( html_macros.$html_div_head$.getGlobalValue() );
        if( NIL != result_id )
        {
          html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( result_id );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( $str106$yui_ac_container );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
        }
        html_markup( html_macros.$html_div_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      html_complete.html_print_js_autocomplete_setup_int( input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, cycl_type );
    }
    else
    {
      html_text_input( name, v_default, size );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 37617L)
  public static SubLObject html_image_multi_submit(final SubLObject template, SubLObject align)
  {
    if( align == UNPROVIDED )
    {
      align = NIL;
    }
    SubLObject src = NIL;
    SubLObject name = NIL;
    SubLObject v_default = NIL;
    SubLObject map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( template, template, $list107 );
    src = template.first();
    SubLObject current = template.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, template, $list107 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, template, $list107 );
    v_default = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, template, $list107 );
    map = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return html_image_input( name, src, align, UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( template, $list107 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 38286L)
  public static SubLObject html_extract_multi_submit_input(final SubLObject template, final SubLObject args)
  {
    SubLObject src = NIL;
    SubLObject name = NIL;
    SubLObject v_default = NIL;
    SubLObject map_items = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( template, template, $list108 );
    src = template.first();
    SubLObject current = template.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, template, $list108 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, template, $list108 );
    v_default = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, template, $list108 );
    map_items = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject x_start = html_extract_multi_submit_input_internal( name, $str109$_x, args );
      SubLObject y_start = html_extract_multi_submit_input_internal( name, $str110$_y, args );
      if( x_start.isString() && y_start.isString() )
      {
        x_start = reader.read_from_string_ignoring_errors( x_start, NIL, NIL, UNPROVIDED, UNPROVIDED );
        y_start = reader.read_from_string_ignoring_errors( y_start, NIL, NIL, UNPROVIDED, UNPROVIDED );
        if( x_start.isInteger() && y_start.isInteger() )
        {
          SubLObject cdolist_list_var = map_items;
          SubLObject map_item = NIL;
          map_item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current_$9;
            final SubLObject datum_$8 = current_$9 = map_item;
            SubLObject x_range = NIL;
            SubLObject y_range = NIL;
            SubLObject value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$9, datum_$8, $list111 );
            x_range = current_$9.first();
            current_$9 = current_$9.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$9, datum_$8, $list111 );
            y_range = current_$9.first();
            current_$9 = current_$9.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$9, datum_$8, $list111 );
            value = current_$9.first();
            current_$9 = current_$9.rest();
            if( NIL == current_$9 )
            {
              if( ( NIL == x_range || ( x_start.numGE( x_range.first() ) && x_start.numLE( conses_high.second( x_range ) ) ) ) && ( NIL == y_range || ( y_start.numGE( y_range.first() ) && y_start.numLE( conses_high
                  .second( y_range ) ) ) ) )
              {
                return value;
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$8, $list111 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            map_item = cdolist_list_var.first();
          }
        }
      }
      return v_default;
    }
    cdestructuring_bind.cdestructuring_bind_error( template, $list108 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 39325L)
  public static SubLObject html_extract_multi_submit_input_internal(final SubLObject name, final SubLObject suffix, final SubLObject args)
  {
    final SubLObject name_length = Sequences.length( name );
    final SubLObject suffix_length = Sequences.length( suffix );
    SubLObject list;
    SubLObject arg;
    SubLObject current;
    SubLObject datum;
    SubLObject arg_name;
    SubLObject value;
    SubLObject arg_name_length;
    for( list = NIL, list = args; NIL != list; list = list.rest() )
    {
      arg = list.first();
      if( arg.isCons() )
      {
        datum = ( current = arg );
        arg_name = NIL;
        value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
        arg_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
        value = current.first();
        current = current.rest();
        if( NIL == current )
        {
          arg_name_length = Sequences.length( arg_name );
          if( arg_name_length.numE( Numbers.add( Sequences.length( name ), Sequences.length( suffix ) ) ) && NIL != Strings.string_equal( name, arg_name, ZERO_INTEGER, name_length, ZERO_INTEGER, name_length )
              && NIL != Strings.string_equal( suffix, arg_name, ZERO_INTEGER, suffix_length, name_length, arg_name_length ) )
          {
            return value;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list112 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 40006L)
  public static SubLObject html_indent_table_internal(final SubLObject indent_width)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject i;
      SubLObject _prev_bind_0_$10;
      SubLObject _prev_bind_0_$11;
      for( i = NIL, i = ZERO_INTEGER; i.numL( html_macros.$html_indent_table_max$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_macros.verify_not_within_html_pre();
          html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
          _prev_bind_0_$11 = html_macros.$within_html_pre$.currentBinding( thread );
          try
          {
            html_macros.$within_html_pre$.bind( T, thread );
            html_indent( indent_width );
          }
          finally
          {
            html_macros.$within_html_pre$.rebind( _prev_bind_0_$11, thread );
          }
          html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 40356L)
  public static SubLObject html_indent_row_internal(final SubLObject indent_amount)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( indent_amount.numG( ZERO_INTEGER ) )
    {
      html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      if( NIL != indent_amount )
      {
        html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( indent_amount );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 40561L)
  public static SubLObject html_target_definition(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    if( NIL != name )
    {
      html_markup( html_macros.$html_anchor_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( name );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 40824L)
  public static SubLObject html_basefont(final SubLObject size)
  {
    if( NIL != size )
    {
      html_markup( html_macros.$html_basefont_head$.getGlobalValue() );
      html_markup( html_macros.$html_basefont_size$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( size );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_char( Characters.CHAR_greater, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 41071L)
  public static SubLObject html_word_break()
  {
    html_markup( html_macros.$html_word_break$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 41177L)
  public static SubLObject html_print_lexicon_entry(final SubLObject fort)
  {
    cb_utilities.cb_link( $kw113$LEXICON, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 41408L)
  public static SubLObject html_print_form(final SubLObject form, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    final SubLObject nautP = term.hl_ground_nautP( form );
    final SubLObject atomic = ( NIL != nautP ) ? narts_high.find_nart( form ) : NIL;
    if( NIL != nautP && NIL != atomic )
    {
      cb_utilities.cb_form( atomic, depth, wrap_axiomsP );
    }
    else
    {
      cb_utilities.cb_form( form, depth, wrap_axiomsP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 41740L)
  public static SubLObject html_basic_image(final SubLObject name, SubLObject alt, SubLObject align, SubLObject border)
  {
    if( alt == UNPROVIDED )
    {
      alt = name;
    }
    if( align == UNPROVIDED )
    {
      align = NIL;
    }
    if( border == UNPROVIDED )
    {
      border = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_image_head$.getGlobalValue() );
    html_markup( html_macros.$html_image_src$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( system_parameters.$html_image_directory$.getDynamicValue( thread ) );
    html_markup( name );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != alt )
    {
      html_markup( html_macros.$html_image_alt$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( alt );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != align )
    {
      html_markup( html_macros.$html_image_align$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_align( align ) );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != border )
    {
      html_markup( html_macros.$html_image_border$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( border );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_image_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 42163L)
  public static SubLObject html_table_row_list(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject cdolist_list_var = items;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_princ( item );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 42355L)
  public static SubLObject html_table_heading_list(final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject cdolist_list_var = items;
      SubLObject item = NIL;
      item = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_princ( item );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
        }
        html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
        cdolist_list_var = cdolist_list_var.rest();
        item = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 42508L)
  public static SubLObject html_percent_progress_bar(final SubLObject sofar, final SubLObject total, SubLObject granularity, SubLObject progress_color, SubLObject remaining_color)
  {
    if( granularity == UNPROVIDED )
    {
      granularity = $int114$100;
    }
    if( progress_color == UNPROVIDED )
    {
      progress_color = html_macros.$html_color_sat_green$.getGlobalValue();
    }
    if( remaining_color == UNPROVIDED )
    {
      remaining_color = html_macros.$html_color_sat_red$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( sofar ) : sofar;
    assert NIL != Types.integerp( total ) : total;
    assert NIL != Types.integerp( granularity ) : granularity;
    final SubLObject progress_width = Numbers.truncate( Numbers.multiply( sofar, granularity ), total );
    final SubLObject remaining_width = Numbers.subtract( granularity, progress_width );
    html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( ONE_INTEGER );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( ZERO_INTEGER );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( ZERO_INTEGER );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( !ZERO_INTEGER.numE( progress_width ) )
      {
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        if( NIL != progress_color )
        {
          html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( progress_color );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject i;
          for( i = NIL, i = ZERO_INTEGER; i.numL( progress_width ); i = Numbers.add( i, ONE_INTEGER ) )
          {
            html_glyph( $kw10$NBSP, UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      if( !ZERO_INTEGER.numE( remaining_width ) )
      {
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        if( NIL != remaining_color )
        {
          html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( remaining_color );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject i;
          for( i = NIL, i = ZERO_INTEGER; i.numL( remaining_width ); i = Numbers.add( i, ONE_INTEGER ) )
          {
            html_glyph( $kw10$NBSP, UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 43344L)
  public static SubLObject html_fancy_percent_progress_bar(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$16 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list116 );
      current_$16 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list116 );
      if( NIL == conses_high.member( current_$16, $list117, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$16 == $kw80$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
    }
    final SubLObject sofar_tail = cdestructuring_bind.property_list_member( $kw118$SOFAR, current );
    final SubLObject sofar = ( NIL != sofar_tail ) ? conses_high.cadr( sofar_tail ) : NIL;
    final SubLObject total_tail = cdestructuring_bind.property_list_member( $kw119$TOTAL, current );
    final SubLObject total = ( NIL != total_tail ) ? conses_high.cadr( total_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw120$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw121$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : TWO_INTEGER;
    final SubLObject progress_color_tail = cdestructuring_bind.property_list_member( $kw122$PROGRESS_COLOR, current );
    final SubLObject progress_color = ( NIL != progress_color_tail ) ? conses_high.cadr( progress_color_tail ) : $sym123$_HTML_COLOR_SAT_GREEN_;
    final SubLObject remaining_color_tail = cdestructuring_bind.property_list_member( $kw124$REMAINING_COLOR, current );
    final SubLObject remaining_color = ( NIL != remaining_color_tail ) ? conses_high.cadr( remaining_color_tail ) : $sym125$_HTML_COLOR_SAT_RED_;
    final SubLObject border_tail = cdestructuring_bind.property_list_member( $kw126$BORDER, current );
    final SubLObject border = ( NIL != border_tail ) ? conses_high.cadr( border_tail ) : ZERO_INTEGER;
    final SubLObject width2 = $sym127$WIDTH1;
    final SubLObject width3 = $sym128$WIDTH2;
    return ConsesLow.list( $sym129$HTML_FANCY_TABLE, ConsesLow.append( ( NIL != width ) ? ConsesLow.list( $kw120$WIDTH, width ) : NIL, ( NIL != border ) ? ConsesLow.list( $kw126$BORDER, border ) : NIL, $list130 ),
        ConsesLow.list( $sym131$CMULTIPLE_VALUE_BIND, ConsesLow.list( width2, width3 ), ConsesLow.list( $sym132$HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS, sofar, total, width ), ConsesLow.list( $sym133$HTML_FANCY_TABLE_ROW,
            ConsesLow.append( ( NIL != height ) ? ConsesLow.list( $kw121$HEIGHT, height ) : NIL, NIL ), ConsesLow.list( $sym134$HTML_FANCY_TABLE_DATA, ConsesLow.list( $kw120$WIDTH, width2, $kw135$BGCOLOR,
                progress_color ) ), ConsesLow.list( $sym134$HTML_FANCY_TABLE_DATA, ConsesLow.list( $kw120$WIDTH, width3, $kw135$BGCOLOR, remaining_color ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 44036L)
  public static SubLObject html_fancy_percent_progress_bar_widths(final SubLObject sofar, final SubLObject total, final SubLObject width)
  {
    assert NIL != Types.numberp( sofar ) : sofar;
    assert NIL != Types.numberp( total ) : total;
    if( sofar.numG( total ) )
    {
      return html_fancy_percent_progress_bar_widths( total, total, width );
    }
    if( sofar.numL( ZERO_INTEGER ) )
    {
      return html_fancy_percent_progress_bar_widths( ZERO_INTEGER, total, width );
    }
    if( total.numLE( ZERO_INTEGER ) )
    {
      return html_fancy_percent_progress_bar_widths( sofar, ONE_INTEGER, width );
    }
    if( width.isInteger() && width.isPositive() )
    {
      SubLObject sofar_width = Numbers.truncate( Numbers.divide( Numbers.multiply( sofar, width ), total ), UNPROVIDED );
      if( sofar.isPositive() )
      {
        sofar_width = Numbers.max( sofar_width, ONE_INTEGER );
      }
      final SubLObject total_width = Numbers.subtract( width, sofar_width );
      return Values.values( sofar_width, total_width );
    }
    return html_fancy_percent_progress_bar_widths( sofar, total, $int138$1000 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 44937L)
  public static SubLObject html_progress_section(SubLObject message, SubLObject sofar, SubLObject total, SubLObject run_time, SubLObject finish_time)
  {
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    if( sofar == UNPROVIDED )
    {
      sofar = NIL;
    }
    if( total == UNPROVIDED )
    {
      total = NIL;
    }
    if( run_time == UNPROVIDED )
    {
      run_time = NIL;
    }
    if( finish_time == UNPROVIDED )
    {
      finish_time = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != message )
    {
      html_newline( UNPROVIDED );
      html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_princ( message );
      html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_newline( UNPROVIDED );
    }
    if( NIL != run_time || NIL != sofar )
    {
      html_newline( UNPROVIDED );
      html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        if( NIL != run_time )
        {
          html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw139$RIGHT ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw140$TOP ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != finish_time )
              {
                html_princ( $str141$Run_Time__ );
              }
              else
              {
                html_princ( $str142$Elapsed_Time__ );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
            }
            html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_indent( TWO_INTEGER );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
            }
            html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw143$LEFT ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw140$TOP ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_princ( numeric_date_utilities.elapsed_seconds_string( run_time ) );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
            }
            html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
          }
          html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_source_readability_terpri( UNPROVIDED );
        }
        if( NIL != sofar )
        {
          html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw139$RIGHT ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw140$TOP ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_princ( $str144$Current_Total__ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
            }
            html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_indent( TWO_INTEGER );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
            }
            html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw143$LEFT ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw140$TOP ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_princ( sofar );
              if( NIL != total )
              {
                html_princ( $str145$_of_ );
                html_princ( total );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
            }
            html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
          }
          html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_source_readability_terpri( UNPROVIDED );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    if( NIL != sofar && NIL != total )
    {
      html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_align( $kw139$RIGHT ) );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_align( $kw146$CENTER ) );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject percent = number_utilities.integer_percent( sofar, total, UNPROVIDED );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str147$_D_, percent );
            html_indent( TWO_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
          }
          html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_align( $kw143$LEFT ) );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_align( $kw146$CENTER ) );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_percent_progress_bar( sofar, total, $int114$100, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
          }
          html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
        }
        html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 47110L)
  public static SubLObject html_horizontal_bar_graph(final SubLObject label_value_pairs, SubLObject outerborder, SubLObject smallerbars, SubLObject color1, SubLObject color2)
  {
    if( outerborder == UNPROVIDED )
    {
      outerborder = TWO_INTEGER;
    }
    if( smallerbars == UNPROVIDED )
    {
      smallerbars = NIL;
    }
    if( color1 == UNPROVIDED )
    {
      color1 = html_macros.$html_color_lighter_blue$.getGlobalValue();
    }
    if( color2 == UNPROVIDED )
    {
      color2 = html_macros.$html_color_lighter_green$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == label_value_pairs )
    {
      html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      html_princ( $str148$_No_data_to_graph_ );
      html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      return NIL;
    }
    SubLObject v_switch = NIL;
    SubLObject newpairs = NIL;
    SubLObject adjustfactor = ONE_INTEGER;
    adjustfactor = Numbers.divide( $int114$100, Numbers.max( ONE_INTEGER, Functions.apply( Symbols.symbol_function( $sym149$MAX ), Mapping.mapcar( Symbols.symbol_function( $sym150$SECOND ), label_value_pairs ) ) ) );
    SubLObject cdolist_list_var = label_value_pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      newpairs = ConsesLow.cons( ConsesLow.list( pair.first(), Numbers.round( Numbers.multiply( conses_high.second( pair ), adjustfactor ), UNPROVIDED ), conses_high.second( pair ) ), newpairs );
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    final SubLObject workingpairs = Sequences.nreverse( newpairs );
    html_markup( html_macros.$html_table_head$.getGlobalValue() );
    if( NIL != outerborder )
    {
      html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( outerborder );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( FOUR_INTEGER );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( FOUR_INTEGER );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_table_width$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str151$100_ );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( ZERO_INTEGER );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( ZERO_INTEGER );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( ZERO_INTEGER );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_macros.$html_table_width$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( $str151$100_ );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            SubLObject cdolist_list_var2 = workingpairs;
            SubLObject pair2 = NIL;
            pair2 = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              final SubLObject label_string = pair2.first();
              final SubLObject perc_width = conses_high.second( pair2 );
              final SubLObject actual_width = conses_high.third( pair2 );
              html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                final SubLObject widthstring = perc_width.isZero() ? $str152$1_ : Sequences.cconcatenate( format_nil.format_nil_a_no_copy( perc_width ), $str153$_ );
                final SubLObject switchedcolor = ( NIL != v_switch ) ? color1 : color2;
                html_draw_bargraph_label( label_string );
                html_draw_bargraph_colorbar( widthstring, actual_width, switchedcolor, smallerbars );
                v_switch = makeBoolean( NIL == v_switch );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
              }
              html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_source_readability_terpri( UNPROVIDED );
              cdolist_list_var2 = cdolist_list_var2.rest();
              pair2 = cdolist_list_var2.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
          }
          html_markup( html_macros.$html_table_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
      }
      html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 49112L)
  public static SubLObject html_draw_bargraph_label(final SubLObject labelstring)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
    html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_align( $kw139$RIGHT ) );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str154$5_ );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_princ( labelstring );
      html_indent( TWO_INTEGER );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 49403L)
  public static SubLObject html_draw_bargraph_colorbar(final SubLObject widthstring, final SubLObject actualwidth, final SubLObject bgcolor, final SubLObject smallbars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str155$95_ );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_width$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( $str151$100_ );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          if( NIL != bgcolor )
          {
            html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( bgcolor );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          if( NIL != widthstring )
          {
            html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( widthstring );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject size_val = TWO_INTEGER;
            html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != size_val )
            {
              html_markup( html_macros.$html_font_size$.getGlobalValue() );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_markup( size_val );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str156$__D, actualwidth );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
            }
            html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
          }
          html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != smallbars )
            {
              final SubLObject size_val = TWO_INTEGER;
              html_markup( html_macros.$html_font_head$.getGlobalValue() );
              if( NIL != size_val )
              {
                html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_markup( size_val );
                html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_glyph( $kw10$NBSP, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
              }
              html_markup( html_macros.$html_font_tail$.getGlobalValue() );
            }
            else
            {
              html_glyph( $kw10$NBSP, UNPROVIDED );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
          }
          html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
        }
        html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
      }
      html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 50228L)
  public static SubLObject html_control_parameter_chooser(final SubLObject parameter, SubLObject descriptionP)
  {
    if( descriptionP == UNPROVIDED )
    {
      descriptionP = NIL;
    }
    assert NIL != Types.symbolp( parameter ) : parameter;
    SubLObject fancy_name = Symbols.get( parameter, $kw158$FANCY_NAME, UNPROVIDED );
    final SubLObject description = Symbols.get( parameter, $kw159$DESCRIPTION, UNPROVIDED );
    SubLObject settings_spec = Symbols.get( parameter, $kw160$SETTINGS_SPEC, UNPROVIDED );
    if( NIL != Symbols.boundp( parameter ) )
    {
      if( NIL == fancy_name )
      {
        fancy_name = Symbols.symbol_name( parameter );
      }
      if( NIL == settings_spec )
      {
        settings_spec = $list161;
      }
      html_markup( html_macros.$html_bold_head$.getGlobalValue() );
      html_princ( fancy_name );
      html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
      if( NIL != descriptionP )
      {
        html_newline( UNPROVIDED );
        html_princ_doc_string( description, UNPROVIDED );
      }
      final SubLObject entry_name = html_control_parameter_entry_name( parameter );
      final SubLObject radio_name = html_control_parameter_radio_name( parameter );
      final SubLObject some_entryP = Sequences.find( $kw162$ENTRY, settings_spec, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym163$FIRST ), UNPROVIDED, UNPROVIDED );
      final SubLObject current_value = Eval.eval( parameter );
      final SubLObject total_settings = Sequences.length( settings_spec );
      SubLObject index = ZERO_INTEGER;
      SubLObject cdolist_list_var = settings_spec;
      SubLObject setting_spec = NIL;
      setting_spec = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_newline( UNPROVIDED );
        SubLObject current;
        final SubLObject datum = current = setting_spec;
        SubLObject type = NIL;
        SubLObject datum_$38 = NIL;
        SubLObject possibility_fancy_name = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
        datum_$38 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
        possibility_fancy_name = current.first();
        current = current.rest();
        if( NIL == current )
        {
          SubLObject radio_checkedP = NIL;
          SubLObject entry_default = NIL;
          if( total_settings.numE( ONE_INTEGER ) )
          {
            radio_checkedP = T;
          }
          else if( type == $kw162$ENTRY )
          {
            radio_checkedP = Functions.funcall( datum_$38, current_value );
          }
          else
          {
            radio_checkedP = Equality.equal( current_value, datum_$38 );
          }
          if( NIL != radio_checkedP && type == $kw162$ENTRY )
          {
            entry_default = print_high.princ_to_string( current_value );
          }
          if( total_settings.numE( ONE_INTEGER ) )
          {
            html_hidden_input( radio_name, index, UNPROVIDED );
          }
          else
          {
            if( NIL != some_entryP )
            {
              if( type == $kw162$ENTRY )
              {
                html_script_utilities.html_focus_radio_input( radio_name, entry_name, index, radio_checkedP, UNPROVIDED );
              }
              else
              {
                html_script_utilities.html_clear_radio_input( radio_name, entry_name, index, radio_checkedP, UNPROVIDED );
              }
            }
            else
            {
              html_radio_input( radio_name, index, radio_checkedP, UNPROVIDED );
            }
            html_indent( UNPROVIDED );
          }
          if( type == $kw162$ENTRY )
          {
            SubLObject entry_format = html_macros.html_parameter_entry_format( parameter );
            if( NIL == entry_format )
            {
              entry_format = $list165;
            }
            SubLObject current_$40;
            final SubLObject datum_$39 = current_$40 = entry_format;
            SubLObject type_$41 = NIL;
            SubLObject size = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$40, datum_$39, $list166 );
            type_$41 = current_$40.first();
            current_$40 = current_$40.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$40, datum_$39, $list166 );
            size = current_$40.first();
            current_$40 = current_$40.rest();
            if( NIL == current_$40 )
            {
              final SubLObject pcase_var = type_$41;
              if( pcase_var.eql( $kw167$TEXT ) )
              {
                html_text_input( entry_name, entry_default, size );
              }
              else
              {
                html_text_input( entry_name, entry_default, UNPROVIDED );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$39, $list166 );
            }
            html_indent( UNPROVIDED );
          }
          html_princ( possibility_fancy_name );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list164 );
        }
        index = Numbers.add( index, ONE_INTEGER );
        cdolist_list_var = cdolist_list_var.rest();
        setting_spec = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 52758L)
  public static SubLObject html_extract_control_parameter_value(final SubLObject parameter, final SubLObject args)
  {
    assert NIL != Types.symbolp( parameter ) : parameter;
    final SubLObject fancy_name = Symbols.get( parameter, $kw158$FANCY_NAME, UNPROVIDED );
    final SubLObject settings_spec = Symbols.get( parameter, $kw160$SETTINGS_SPEC, UNPROVIDED );
    SubLObject new_value = NIL;
    SubLObject invalid_explanation = NIL;
    if( NIL != fancy_name && NIL != settings_spec && NIL != Symbols.boundp( parameter ) )
    {
      final SubLObject radio_name = html_control_parameter_radio_name( parameter );
      final SubLObject radio_choice = html_extract_input( radio_name, args );
      if( NIL != radio_choice )
      {
        final SubLObject setting_spec = ConsesLow.nth( reader.read_from_string_ignoring_errors( radio_choice, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), settings_spec );
        SubLObject current;
        final SubLObject datum = current = setting_spec;
        SubLObject type = NIL;
        SubLObject datum_$42 = NIL;
        SubLObject possibility_fancy_name = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
        datum_$42 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
        possibility_fancy_name = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( type == $kw162$ENTRY )
          {
            final SubLObject entry_name = html_control_parameter_entry_name( parameter );
            final SubLObject entry_string = html_extract_input( entry_name, args );
            if( NIL != entry_string )
            {
              if( NIL != Functions.funcall( datum_$42, entry_string ) )
              {
                new_value = entry_string;
              }
              else
              {
                final SubLObject value = reader.read_from_string_ignoring_errors( entry_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
                if( NIL != Functions.funcall( datum_$42, value ) )
                {
                  new_value = value;
                }
                else
                {
                  invalid_explanation = Sequences.cconcatenate( $str168$The_value_entered_for__, new SubLObject[] { format_nil.format_nil_a_no_copy( fancy_name ), $str169$__was_not_valid_
                  } );
                }
              }
            }
            else
            {
              invalid_explanation = Sequences.cconcatenate( $str170$No_value_was_entered_for__, new SubLObject[] { format_nil.format_nil_a_no_copy( fancy_name ), $str171$__
              } );
            }
          }
          else
          {
            new_value = datum_$42;
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list164 );
        }
      }
      else
      {
        invalid_explanation = Sequences.cconcatenate( $str172$No_choice_was_made_for__, new SubLObject[] { format_nil.format_nil_a_no_copy( fancy_name ), $str171$__
        } );
      }
    }
    else
    {
      invalid_explanation = Sequences.cconcatenate( format_nil.format_nil_s_no_copy( parameter ), $str173$_is_not_a_declared_control_parame );
    }
    return Values.values( new_value, invalid_explanation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 54507L)
  public static SubLObject html_set_control_parameter(final SubLObject parameter, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject value = html_extract_control_parameter_value( parameter, args );
    final SubLObject error_message = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error_message )
    {
      cb_utilities.cb_error( error_message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    Eval.eval( ConsesLow.list( $sym174$CSETQ, parameter, ConsesLow.list( $sym175$QUOTE, value ) ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 54941L)
  public static SubLObject html_control_parameter_entry_name(final SubLObject parameter)
  {
    final SubLObject name = Symbols.symbol_name( parameter );
    return Sequences.cconcatenate( $str176$entry_, format_nil.format_nil_a_no_copy( name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 55142L)
  public static SubLObject html_control_parameter_radio_name(final SubLObject parameter)
  {
    final SubLObject name = Symbols.symbol_name( parameter );
    return Sequences.cconcatenate( $str177$radio_, format_nil.format_nil_a_no_copy( name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 55329L)
  public static SubLObject html_select_from_list(final SubLObject name, final SubLObject selected_option_content, final SubLObject option_contents, SubLObject option_values)
  {
    if( option_values == UNPROVIDED )
    {
      option_values = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_select_head$.getGlobalValue() );
    html_markup( html_macros.$html_select_name$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( name );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject option_content = NIL;
      SubLObject option_content_$43 = NIL;
      SubLObject option_value = NIL;
      SubLObject option_value_$44 = NIL;
      option_content = option_contents;
      option_content_$43 = option_content.first();
      option_value = option_values;
      option_value_$44 = option_value.first();
      while ( NIL != option_value || NIL != option_content)
      {
        final SubLObject selectedP = Equality.equal( option_content_$43, selected_option_content );
        html_markup( html_macros.$html_option_head$.getGlobalValue() );
        if( NIL != selectedP )
        {
          html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
        }
        if( NIL != option_value_$44 )
        {
          html_markup( html_macros.$html_option_value$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( option_value_$44 );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_princ( option_content_$43 );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$45, thread );
        }
        html_markup( html_macros.$html_option_tail$.getGlobalValue() );
        option_content = option_content.rest();
        option_content_$43 = option_content.first();
        option_value = option_value.rest();
        option_value_$44 = option_value.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_select_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 56527L)
  public static SubLObject matching_html_field(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( v_object.isCons() && v_object.first().equalp( $html_extract_field_name$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 56696L)
  public static SubLObject matching_html_button_field(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( v_object.isCons() && conses_high.second( v_object ).equalp( $html_extract_field_name$.getDynamicValue( thread ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 56887L)
  public static SubLObject html_extract_input(final SubLObject field_name, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( field_name ) : field_name;
    assert NIL != Types.listp( args ) : args;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding( thread );
    try
    {
      $html_extract_field_name$.bind( field_name, thread );
      ans = Sequences.find_if( Symbols.symbol_function( $sym179$MATCHING_HTML_FIELD ), args, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $html_extract_field_name$.rebind( _prev_bind_0, thread );
    }
    return conses_high.second( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 57212L)
  public static SubLObject html_extract_input_values(final SubLObject field_name, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( field_name ) : field_name;
    assert NIL != Types.listp( args ) : args;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding( thread );
    try
    {
      $html_extract_field_name$.bind( field_name, thread );
      SubLObject cdolist_list_var = args;
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != matching_html_field( arg ) )
        {
          ans = ConsesLow.cons( conses_high.second( arg ), ans );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    finally
    {
      $html_extract_field_name$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 57601L)
  public static SubLObject html_extract_value(final SubLObject field_name, final SubLObject html_args, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    SubLObject result = html_extract_input( field_name, html_args );
    if( NIL == result )
    {
      result = v_default;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 57919L)
  public static SubLObject html_extract_integer(final SubLObject field_name, final SubLObject html_args, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject str = html_extract_value( field_name, html_args, NIL );
    SubLObject v_int = v_default;
    if( NIL != Sequences.find_if( $sym180$DIGIT_CHAR_P, str, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw181$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym182$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            v_int = reader.parse_integer( str, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw181$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return v_int;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 58264L)
  public static SubLObject html_extract_date(final SubLObject field_name, final SubLObject html_args, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject str = html_extract_value( field_name, html_args, v_default );
    SubLObject dates = v_default;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw181$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym182$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          dates = date_utilities.parse_date_from_string_fast( str, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw181$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return dates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 58697L)
  public static SubLObject html_extract_keyword(final SubLObject field_name, final SubLObject html_args, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = $kw183$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject str = html_extract_value( field_name, html_args, v_default );
    SubLObject kwd = v_default;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw181$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym182$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          kwd = Symbols.make_keyword( Strings.string_upcase( str, UNPROVIDED, UNPROVIDED ) );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw181$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return kwd;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 59026L)
  public static SubLObject html_extract_string(final SubLObject field_name, final SubLObject html_args, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = $str47$;
    }
    return html_extract_value( field_name, html_args, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 59243L)
  public static SubLObject html_extract_boolean(final SubLObject field_name, final SubLObject html_args, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return list_utilities.sublisp_boolean( html_extract_value( field_name, html_args, v_default ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 59464L)
  public static SubLObject html_extract_sexpr(final SubLObject field_name, final SubLObject html_args, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    return html_extract_sexpr_int( field_name, html_args, v_default, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 59688L)
  public static SubLObject html_extract_cyclified_sexpr(final SubLObject field_name, final SubLObject html_args, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    if( $str47$.equal( html_extract_input( field_name, html_args ) ) )
    {
      return v_default;
    }
    return html_extract_sexpr_int( field_name, html_args, v_default, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 60022L)
  public static SubLObject html_extract_sexpr_int(final SubLObject field_name, final SubLObject html_args, final SubLObject v_default, final SubLObject cyclifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = reader.$read_eval$.currentBinding( thread );
    try
    {
      reader.$read_eval$.bind( NIL, thread );
      final SubLObject value = html_extract_input( field_name, html_args );
      final SubLObject clean_value = ( NIL != value && NIL != cyclifyP ) ? string_utilities.cyclify_string( value ) : value;
      final SubLObject sexpr = ( NIL != value ) ? reader.read_from_string_ignoring_errors( clean_value, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : v_default;
      return sexpr;
    }
    finally
    {
      reader.$read_eval$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 60403L)
  public static SubLObject html_extract_button_value(final SubLObject button_name, final SubLObject html_args, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( button_name ) : button_name;
    assert NIL != Types.listp( html_args ) : html_args;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $html_extract_field_name$.currentBinding( thread );
    try
    {
      $html_extract_field_name$.bind( button_name, thread );
      ans = Sequences.find_if( Symbols.symbol_function( $sym185$MATCHING_HTML_BUTTON_FIELD ), html_args, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $html_extract_field_name$.rebind( _prev_bind_0, thread );
    }
    return ans.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 60798L)
  public static SubLObject decode_html_language_abbreviation(final SubLObject lang_value)
  {
    SubLObject lang = NIL;
    if( lang_value.equalp( $str186$en ) )
    {
      lang = $const187$EnglishLanguage;
    }
    else if( lang_value.equalp( $str188$en_gb ) )
    {
      lang = $const189$BritishEnglishDialect;
    }
    else if( lang_value.equalp( $str190$fr ) )
    {
      lang = $const191$FrenchLanguage;
    }
    else if( lang_value.equalp( $str192$de ) )
    {
      lang = $const193$GermanLanguage;
    }
    else
    {
      lang = kb_mapping_utilities.fpred_value_in_any_mt( lang_value, $const194$languageCodeDigraph, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
    }
    return lang;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 61286L)
  public static SubLObject html_glyph(final SubLObject glyph, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    assert NIL != Types.symbolp( glyph ) : glyph;
    final SubLObject markup = html_glyph_markup( glyph );
    if( markup.isString() )
    {
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        html_markup( markup );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 61594L)
  public static SubLObject html_glyph_markup(final SubLObject glyph)
  {
    return Symbols.get( glyph, $kw195$HTML_GLYPH, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 61676L)
  public static SubLObject html_declare_glyph(final SubLObject glyph, final SubLObject markup)
  {
    assert NIL != Types.symbolp( glyph ) : glyph;
    assert NIL != Types.stringp( markup ) : markup;
    Symbols.put( glyph, $kw195$HTML_GLYPH, markup );
    return glyph;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 83307L)
  public static SubLObject html_unicode_char(final SubLObject unicode_identifier, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    assert NIL != string_utilities.hex_char_string_p( unicode_identifier ) : unicode_identifier;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      html_markup( Sequences.cconcatenate( $str668$__, new SubLObject[] { unicode_identifier, $str8$_
      } ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 83710L)
  public static SubLObject html_create_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script)
  {
    if( values == UNPROVIDED )
    {
      values = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( choice_offset == UNPROVIDED )
    {
      choice_offset = NIL;
    }
    if( script == UNPROVIDED )
    {
      script = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_select_head$.getGlobalValue() );
    html_markup( html_macros.$html_select_name$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( field_name );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != size )
    {
      html_markup( html_macros.$html_select_size$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( size );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_char( Characters.CHAR_space, UNPROVIDED );
    html_markup( script );
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject list_var = NIL;
      SubLObject item = NIL;
      SubLObject i = NIL;
      list_var = choices;
      item = list_var.first();
      for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
      {
        final SubLObject is_selectedP = Equality.eql( i, choice_offset );
        final SubLObject value = ( NIL != list_utilities.lengthG( values, i, UNPROVIDED ) ) ? Sequences.elt( values, i ) : NIL;
        html_markup( html_macros.$html_option_head$.getGlobalValue() );
        if( NIL != is_selectedP )
        {
          html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
        }
        if( NIL != value )
        {
          html_markup( html_macros.$html_option_value$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( value );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_princ( item );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
        }
        html_markup( html_macros.$html_option_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_select_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 84680L)
  public static SubLObject html_create_radiobox_form(final SubLObject form_name, final SubLObject choices, SubLObject values, SubLObject choice_offset, SubLObject same_lineP)
  {
    if( values == UNPROVIDED )
    {
      values = NIL;
    }
    if( choice_offset == UNPROVIDED )
    {
      choice_offset = NIL;
    }
    if( same_lineP == UNPROVIDED )
    {
      same_lineP = NIL;
    }
    SubLObject list_var = NIL;
    SubLObject item = NIL;
    SubLObject i = NIL;
    list_var = choices;
    item = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      final SubLObject is_selectedP = Equality.eql( i, choice_offset );
      final SubLObject user_value = Sequences.elt( values, i );
      final SubLObject form_value = ( NIL != user_value ) ? user_value : item;
      if( NIL != string_utilities.non_empty_stringP( item ) )
      {
        html_radio_input( form_name, form_value, is_selectedP, UNPROVIDED );
        html_indent( UNPROVIDED );
        html_princ( item );
      }
      if( NIL != same_lineP )
      {
        html_indent( UNPROVIDED );
      }
      else
      {
        html_newline( UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 85658L)
  public static SubLObject html_create_multiple_selection_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets)
  {
    if( values == UNPROVIDED )
    {
      values = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( choice_offsets == UNPROVIDED )
    {
      choice_offsets = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( html_macros.$html_select_head$.getGlobalValue() );
    html_markup( html_macros.$html_select_name$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( field_name );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_simple_attribute( html_macros.$html_select_multiple$.getGlobalValue() );
    if( NIL != size )
    {
      html_markup( html_macros.$html_select_size$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( size );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject list_var = NIL;
      SubLObject item = NIL;
      SubLObject i = NIL;
      list_var = choices;
      item = list_var.first();
      for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
      {
        final SubLObject is_selectedP = conses_high.member( i, choice_offsets, Symbols.symbol_function( EQL ), UNPROVIDED );
        final SubLObject value = Sequences.elt( values, i );
        html_markup( html_macros.$html_option_head$.getGlobalValue() );
        if( NIL != is_selectedP )
        {
          html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
        }
        if( NIL != value )
        {
          html_markup( html_macros.$html_option_value$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( value );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_princ( item );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
        }
        html_markup( html_macros.$html_option_tail$.getGlobalValue() );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_select_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 86480L)
  public static SubLObject html_create_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script)
  {
    if( values == UNPROVIDED )
    {
      values = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( choice_offset == UNPROVIDED )
    {
      choice_offset = NIL;
    }
    if( script == UNPROVIDED )
    {
      script = NIL;
    }
    return html_create_listbox( field_name, choices, values, size, choice_offset, script );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 86830L)
  public static SubLObject html_create_simple_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject default_choice)
  {
    if( default_choice == UNPROVIDED )
    {
      default_choice = NIL;
    }
    return html_create_listbox( field_name, choices, NIL, ONE_INTEGER, Sequences.position( default_choice, choices, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 87175L)
  public static SubLObject create_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset)
  {
    if( values == UNPROVIDED )
    {
      values = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( choice_offset == UNPROVIDED )
    {
      choice_offset = NIL;
    }
    return html_create_listbox( field_name, choices, values, size, choice_offset, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 87390L)
  public static SubLObject create_multiple_selection_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets)
  {
    if( values == UNPROVIDED )
    {
      values = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( choice_offsets == UNPROVIDED )
    {
      choice_offsets = NIL;
    }
    return html_create_multiple_selection_listbox( field_name, choices, values, size, choice_offsets );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 87665L)
  public static SubLObject create_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset)
  {
    if( values == UNPROVIDED )
    {
      values = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( choice_offset == UNPROVIDED )
    {
      choice_offset = NIL;
    }
    return html_create_dropdown_list( field_name, choices, values, size, choice_offset, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 87898L)
  public static SubLObject create_simple_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject default_choice)
  {
    if( default_choice == UNPROVIDED )
    {
      default_choice = NIL;
    }
    return html_create_simple_dropdown_list( field_name, choices, default_choice );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 88130L)
  public static SubLObject get_encoded_form_field_name(final SubLObject basic_name)
  {
    return encode_form_field_name( basic_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 88472L)
  public static SubLObject extract_encoded_form_field_value(final SubLObject unencoded_name, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.get_form_field_code( args ), thread );
      final SubLObject encoded_field_name = get_encoded_form_field_name( unencoded_name );
      ans = html_extract_input( encoded_field_name, args );
    }
    finally
    {
      html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 88913L)
  public static SubLObject encode_form_field_name(final SubLObject basic_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ).isInteger() )
    {
      return Sequences.cconcatenate( basic_name, new SubLObject[] { $str669$_, print_high.princ_to_string( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) )
      } );
    }
    return basic_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 89389L)
  public static SubLObject html_echo_args(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_markup( $str670$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_source_readability_terpri( UNPROVIDED );
      html_markup( $str671$_meta_http_equiv__X_UA_Compatible );
    }
    html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw672$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_source_readability_terpri( UNPROVIDED );
      html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_princ( $str673$Echo_of_ARGS );
      html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$48 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color_value )
        {
          html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_color( color_value ) );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_markup( TWO_INTEGER );
          html_char( Characters.CHAR_greater, UNPROVIDED );
          html_princ( $str673$Echo_of_ARGS );
          html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_markup( TWO_INTEGER );
          html_char( Characters.CHAR_greater, UNPROVIDED );
          html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            cb_utilities.cb_back_button( $kw674$SELF, $str675$Back );
            html_macros.verify_not_within_html_pre();
            html_markup( html_macros.$html_preformatted_head$.getGlobalValue() );
            final SubLObject _prev_bind_0_$51 = html_macros.$within_html_pre$.currentBinding( thread );
            try
            {
              html_macros.$within_html_pre$.bind( T, thread );
              SubLObject cdolist_list_var = args;
              SubLObject arg = NIL;
              arg = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_prin1( arg );
                html_terpri( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
              }
            }
            finally
            {
              html_macros.$within_html_pre$.rebind( _prev_bind_0_$51, thread );
            }
            html_markup( html_macros.$html_preformatted_tail$.getGlobalValue() );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
          }
          html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_source_readability_terpri( UNPROVIDED );
          html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
        }
        html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$48, thread );
      }
      html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 89702L)
  public static SubLObject html_echo_file(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list678 );
    filename = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( filename, $kw679$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str680$Unable_to_open__S, filename );
        }
        SubLObject s;
        SubLObject v_char;
        for( s = stream, v_char = NIL, v_char = streams_high.read_char( s, NIL, $kw15$EOF, UNPROVIDED ); $kw15$EOF != v_char; v_char = streams_high.read_char( s, NIL, $kw15$EOF, UNPROVIDED ) )
        {
          html_char( v_char, UNPROVIDED );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list678 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 89953L)
  public static SubLObject remove_html_tags(final SubLObject string, SubLObject separator_string)
  {
    if( separator_string == UNPROVIDED )
    {
      separator_string = $str41$_;
    }
    final SubLObject open = $str23$_;
    final SubLObject close = $str25$_;
    final SubLObject quote = $str682$_;
    final SubLObject open_comment = $str683$____;
    final SubLObject close_comment = $str684$___;
    final SubLObject open_script = $str685$_script;
    final SubLObject close_script = $str686$__script_;
    final SubLObject html_string1 = string_utilities.string_substitute( $str685$_script, $str685$_script, string, Symbols.symbol_function( EQUALP ) );
    final SubLObject html_string2 = string_utilities.string_substitute( $str687$__script, $str687$__script, html_string1, Symbols.symbol_function( EQUALP ) );
    final SubLObject strings = string_utilities.string_tokenize( html_string2, ConsesLow.list( open_comment, close_comment, open_script, close_script, open, close, quote ), NIL, T, T, $list688, UNPROVIDED );
    SubLObject in_tagP = NIL;
    SubLObject in_commentP = NIL;
    SubLObject in_scriptP = NIL;
    SubLObject in_quoteP = NIL;
    SubLObject tagless_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      SubLObject cdolist_list_var = strings;
      SubLObject substring = NIL;
      substring = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != in_commentP )
        {
          if( substring.equalp( close_comment ) )
          {
            in_commentP = NIL;
          }
        }
        else if( NIL != in_scriptP )
        {
          if( substring.equalp( open_comment ) )
          {
            in_commentP = T;
          }
          else if( substring.equalp( close_script ) )
          {
            in_scriptP = NIL;
          }
        }
        else if( NIL != in_tagP )
        {
          if( NIL != in_quoteP )
          {
            if( substring.equalp( quote ) )
            {
              in_quoteP = NIL;
            }
          }
          else if( substring.equalp( open_comment ) )
          {
            in_commentP = T;
          }
          else if( substring.equalp( quote ) )
          {
            in_quoteP = T;
          }
          else if( substring.equalp( close ) )
          {
            in_tagP = NIL;
          }
        }
        else if( substring.equalp( open_comment ) )
        {
          in_commentP = T;
        }
        else if( substring.equalp( open_script ) )
        {
          in_scriptP = T;
          if( NIL == string_utilities.empty_string_p( separator_string ) )
          {
            print_high.princ( separator_string, stream );
          }
        }
        else if( substring.equalp( open ) )
        {
          in_tagP = T;
          if( NIL == string_utilities.empty_string_p( separator_string ) )
          {
            print_high.princ( separator_string, stream );
          }
        }
        else if( NIL == string_utilities.empty_string_p( substring ) )
        {
          print_high.princ( substring, stream );
        }
        cdolist_list_var = cdolist_list_var.rest();
        substring = cdolist_list_var.first();
      }
      tagless_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return tagless_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 92147L)
  public static SubLObject convert_html_to_text(final SubLObject html_text)
  {
    return remove_html_tags( html_text, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 92868L)
  public static SubLObject url_to_text(SubLObject url)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw181$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym182$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          if( NIL == string_utilities.starts_with( Strings.string_downcase( url, UNPROVIDED, UNPROVIDED ), $str690$http___ ) && NIL == web_utilities.url_p( url ) )
          {
            url = Sequences.cconcatenate( $str690$http___, url );
          }
          thread.resetMultipleValues();
          SubLObject machine = web_utilities.parse_http_url( url );
          SubLObject port = thread.secondMultipleValue();
          SubLObject path = thread.thirdMultipleValue();
          final SubLObject query = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          if( NIL == machine )
          {
            machine = url;
          }
          if( NIL == path )
          {
            path = $str24$_;
          }
          if( !port.isInteger() )
          {
            port = $int691$80;
          }
          SubLObject out_stream = NIL;
          try
          {
            out_stream = streams_high.make_private_string_output_stream();
            SubLObject stream = NIL;
            try
            {
              stream = streams_high.make_private_string_input_stream( web_utilities.http_retrieve( ConsesLow.list( ConsesLow.list( query ) ), path, machine, port, $kw692$GET, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                  UNPROVIDED ), ZERO_INTEGER, NIL );
              SubLObject tokens = xml_parsing_utilities.xml_tokenize( stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              while ( NIL != tokens)
              {
                final SubLObject token = tokens.first();
                if( NIL != xml_parsing_utilities.xml_token_starts_with( token, $str685$_script ) )
                {
                  tokens = xml_parsing_utilities.advance_xml_tokens( xml_parsing_utilities.advance_xml_tokens_to( tokens, $str686$__script_, UNPROVIDED ), UNPROVIDED );
                }
                else if( NIL != xml_parsing_utilities.xml_token_starts_with( token, $str693$_style ) )
                {
                  tokens = xml_parsing_utilities.advance_xml_tokens( xml_parsing_utilities.advance_xml_tokens_to( tokens, $str694$__style_, UNPROVIDED ), UNPROVIDED );
                }
                else if( NIL != xml_parsing_utilities.xml_token_starts_with( token, $str695$_p_ ) )
                {
                  print_high.princ( $str41$_, out_stream );
                  tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
                }
                else if( NIL != xml_parsing_utilities.xml_token_starts_with( token, $str23$_ ) )
                {
                  tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
                }
                else
                {
                  PrintLow.format( out_stream, $str39$_A, token );
                  tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close( stream, UNPROVIDED );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
              }
            }
            result = streams_high.get_output_stream_string( out_stream );
          }
          finally
          {
            final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              streams_high.close( out_stream, UNPROVIDED );
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$53, thread );
            }
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw181$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( result.isString() )
    {
      return string_utilities.do_string_substitutions_robust( result, $url_to_text_replacements$.getGlobalValue(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 94429L)
  public static SubLObject generate_html_filename_input_fieldname(final SubLObject name)
  {
    return Sequences.cconcatenate( $html_filename_input_prefix$.getGlobalValue(), name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 94552L)
  public static SubLObject html_filename_input(final SubLObject name, final SubLObject initial_value, final SubLObject size)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject file_input = generate_html_filename_input_fieldname( name );
    final SubLObject update_name_script = Sequences.cconcatenate( $str697$this_form_, new SubLObject[] { name, $str698$_value___this_value_
    } );
    html_markup( html_macros.$html_input_head$.getGlobalValue() );
    html_markup( html_macros.$html_input_type$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( $str699$TEXT );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != file_input )
    {
      html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( file_input );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != file_input )
    {
      html_markup( html_macros.$html_input_name$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( file_input );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != initial_value )
    {
      html_markup( html_macros.$html_input_value$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_princ( initial_value );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != size )
    {
      html_markup( html_macros.$html_input_size$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( size );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != update_name_script )
    {
      html_markup( html_macros.$html_select_onchange$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( update_name_script );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != update_name_script )
    {
      html_markup( html_macros.$html_event_attribute_onblur$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( update_name_script );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
    {
      html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
    }
    html_char( Characters.CHAR_greater, UNPROVIDED );
    html_hidden_input( name, $str47$, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 95108L)
  public static SubLObject html_with_file_transmitting_form(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list700 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject handler_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list700 );
    handler_name = current.first();
    current = current.rest();
    final SubLObject target = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list700 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject frame_name_var = $sym701$FRAME_NAME_VAR;
      return ConsesLow.list( $sym702$CLET, ConsesLow.list( ConsesLow.list( frame_name_var, ConsesLow.list( $sym703$CB_FRAME_NAME, target ) ) ), ConsesLow.listS( $sym704$HTML_FANCY_FORM, ConsesLow.listS(
          $sym705$_CYC_CGI_PROGRAM_, $sym706$_HTML_FORM_METHOD_POST_, frame_name_var, $list707 ), ConsesLow.listS( $sym708$HTML_HIDDEN_INPUT, handler_name, $list709 ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list700 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 95895L)
  public static SubLObject html_arguments_contain_multipart_form_dataP(final SubLObject args)
  {
    return list_utilities.sublisp_boolean( html_extract_input( $html_multipart_form_date$.getGlobalValue(), args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 96035L)
  public static SubLObject html_parse_multipart_form_data(final SubLObject string)
  {
    SubLObject values = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_input_stream( string, ZERO_INTEGER, NIL );
      final SubLObject separator = streams_high.read_line( s, NIL, $kw15$EOF, UNPROVIDED );
      SubLObject eof = NIL;
      while ( NIL == eof)
      {
        final SubLObject content_disposition = streams_high.read_line( s, NIL, $kw15$EOF, UNPROVIDED );
        final SubLObject content_type = streams_high.read_line( s, NIL, $kw15$EOF, UNPROVIDED );
        SubLObject field = NIL;
        SubLObject content = NIL;
        if( $kw15$EOF == content_disposition )
        {
          eof = T;
        }
        else
        {
          field = html_parse_data_name_from_content_disposition( content_disposition );
          if( NIL != Sequences.search( $str711$application_octet_stream, content_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            content = html_parse_multipart_form_line( s, separator );
          }
          else
          {
            content = streams_high.read_line( s, NIL, $kw15$EOF, UNPROVIDED );
            html_parse_consume_separator( s, separator );
          }
          values = ConsesLow.cons( ConsesLow.list( field, Sequences.delete( Characters.CHAR_return, content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), values );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    values = ConsesLow.cons( ConsesLow.list( $html_multipart_form_date$.getGlobalValue(), $str712$T ), values );
    return Sequences.nreverse( values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 97053L)
  public static SubLObject html_parse_consume_separator(final SubLObject stream, final SubLObject separator)
  {
    return Strings.string_equal( separator, streams_high.read_line( stream, NIL, $kw15$EOF, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 97182L)
  public static SubLObject html_parse_data_name_from_content_disposition(final SubLObject content)
  {
    final SubLObject first_quote = Sequences.position( Characters.CHAR_quotation, content, Symbols.symbol_function( $sym713$CHAR_ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject inside_value = Numbers.add( ONE_INTEGER, first_quote );
    final SubLObject second_quote = Sequences.position( Characters.CHAR_quotation, content, Symbols.symbol_function( $sym713$CHAR_ ), Symbols.symbol_function( IDENTITY ), inside_value, UNPROVIDED );
    return string_utilities.substring( content, inside_value, second_quote );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 97561L)
  public static SubLObject html_parse_multipart_form_line(final SubLObject s, final SubLObject separator)
  {
    streams_high.read_line( s, NIL, $kw15$EOF, UNPROVIDED );
    SubLObject line = streams_high.read_line( s, NIL, $kw15$EOF, UNPROVIDED );
    SubLObject pieces = $str47$;
    while ( NIL == Strings.string_equal( separator, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ))
    {
      pieces = Sequences.cconcatenate( pieces, new SubLObject[] { line, $html_newline_string$.getGlobalValue()
      } );
      line = streams_high.read_line( s, NIL, separator, UNPROVIDED );
    }
    return Sequences.delete( Characters.CHAR_return, pieces, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 97986L)
  public static SubLObject html_construct_message_from_multipart_data(final SubLObject contents)
  {
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      SubLObject list_var = NIL;
      SubLObject component = NIL;
      SubLObject index = NIL;
      list_var = contents;
      component = list_var.first();
      for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), component = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
      {
        SubLObject current;
        final SubLObject datum = current = component;
        SubLObject item = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list714 );
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list714 );
        value = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( index.isPositive() )
          {
            streams_high.write_char( Characters.CHAR_ampersand, stream );
          }
          streams_high.write_string( item, stream, UNPROVIDED, UNPROVIDED );
          streams_high.write_char( Characters.CHAR_equal, stream );
          final SubLObject string_var = value;
          SubLObject end_var_$54;
          SubLObject end_var;
          SubLObject char_num;
          SubLObject v_char;
          for( end_var = ( end_var_$54 = Sequences.length( string_var ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$54 ); char_num = number_utilities.f_1X( char_num ) )
          {
            v_char = Strings.sublisp_char( string_var, char_num );
            if( NIL != Characters.charE( Characters.CHAR_space, v_char ) )
            {
              streams_high.write_char( Characters.CHAR_plus, stream );
            }
            else if( NIL != Characters.alphanumericp( v_char ) )
            {
              streams_high.write_char( v_char, stream );
            }
            else
            {
              PrintLow.format( stream, $str715$__2__0X, Characters.char_code( v_char ) );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list714 );
        }
      }
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 98871L)
  public static SubLObject html_request_arguments_are_multipart_dataP(final SubLObject v_arguments)
  {
    return makeBoolean( NIL != list_utilities.lengthG( v_arguments, $html_multipart_content_marker_size$.getGlobalValue(), UNPROVIDED ) && NIL != Strings.string_equal( v_arguments, $html_multipart_content_marker$
        .getGlobalValue(), ZERO_INTEGER, $html_multipart_content_marker_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 99155L)
  public static SubLObject html_treemap_table(final SubLObject treemap, SubLObject width, SubLObject height, SubLObject split_type, SubLObject display_properties)
  {
    if( width == UNPROVIDED )
    {
      width = $int717$200;
    }
    if( height == UNPROVIDED )
    {
      height = width;
    }
    if( split_type == UNPROVIDED )
    {
      split_type = $kw718$VERTICAL;
    }
    if( display_properties == UNPROVIDED )
    {
      display_properties = NIL;
    }
    html_treemap_table_recursive( treemap, width, height, split_type, display_properties );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 99720L)
  public static SubLObject treemap_size(final SubLObject treemap)
  {
    if( treemap.first().isList() )
    {
      SubLObject size = ZERO_INTEGER;
      SubLObject cdolist_list_var = treemap;
      SubLObject subtreemap = NIL;
      subtreemap = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        size = Numbers.add( size, treemap_size( subtreemap ) );
        cdolist_list_var = cdolist_list_var.rest();
        subtreemap = cdolist_list_var.first();
      }
      return size;
    }
    return conses_high.getf( treemap, $kw719$SIZE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 99999L)
  public static SubLObject treemap_class_size(final SubLObject treemap, final SubLObject v_class)
  {
    if( treemap.first().isList() )
    {
      SubLObject size = ZERO_INTEGER;
      SubLObject cdolist_list_var = treemap;
      SubLObject subtreemap = NIL;
      subtreemap = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        size = Numbers.add( size, treemap_class_size( subtreemap, v_class ) );
        cdolist_list_var = cdolist_list_var.rest();
        subtreemap = cdolist_list_var.first();
      }
      return size;
    }
    if( v_class.equal( conses_high.getf( treemap, $kw720$CLASS, UNPROVIDED ) ) )
    {
      return conses_high.getf( treemap, $kw719$SIZE, UNPROVIDED );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 100401L)
  public static SubLObject build_treemap(final SubLObject root, final SubLObject dtrs_fn, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn)
  {
    assert NIL != Types.function_spec_p( dtrs_fn ) : dtrs_fn;
    assert NIL != Types.function_spec_p( size_fn ) : size_fn;
    assert NIL != Types.function_spec_p( name_fn ) : name_fn;
    assert NIL != Types.function_spec_p( class_fn ) : class_fn;
    return build_treemap_recursive( root, dtrs_fn, size_fn, name_fn, class_fn, set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 100918L)
  public static SubLObject html_treemap_table_recursive(final SubLObject treemap, final SubLObject width, final SubLObject height, final SubLObject split_type, final SubLObject display_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !treemap.first().isList() )
    {
      final SubLObject size_tail = cdestructuring_bind.property_list_member( $kw719$SIZE, treemap );
      final SubLObject size = ( NIL != size_tail ) ? conses_high.cadr( size_tail ) : NIL;
      final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw722$NAME, treemap );
      final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
      final SubLObject color_tail = cdestructuring_bind.property_list_member( $kw723$COLOR, treemap );
      final SubLObject color = ( NIL != color_tail ) ? conses_high.cadr( color_tail ) : NIL;
      final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw720$CLASS, treemap );
      final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
      final SubLObject bgcolor = compute_treemap_color( color, v_class, display_properties );
      final SubLObject font_color = conses_high.getf( display_properties, $kw724$FONT_COLOR, $kw725$BLACK );
      final SubLObject border = conses_high.getf( display_properties, $kw126$BORDER, ONE_INTEGER );
      html_markup( html_macros.$html_table_head$.getGlobalValue() );
      if( NIL != border )
      {
        html_markup( html_macros.$html_table_border$.getGlobalValue() );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_markup( border );
        html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        if( NIL != height )
        {
          html_markup( html_macros.$html_table_row_height$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( height );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_align( $kw146$CENTER ) );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( html_align( $kw146$CENTER ) );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != bgcolor )
          {
            html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( bgcolor );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          if( NIL != width )
          {
            html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( width );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject color_val = font_color;
            html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != color_val )
            {
              html_markup( html_macros.$html_font_color$.getGlobalValue() );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_markup( html_color( color_val ) );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( Numbers.multiply( width, height ).numG( $int726$400 ) )
              {
                if( Numbers.multiply( width, height ).numG( $int727$800 ) )
                {
                  html_princ( name );
                  html_indent( UNPROVIDED );
                }
                html_princ( size );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
            }
            html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
          }
          html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
        }
        html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    else if( split_type == $kw718$VERTICAL )
    {
      html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject tree_size = treemap_size( treemap );
        SubLObject cdolist_list_var = treemap;
        SubLObject subtreemap = NIL;
        subtreemap = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject subtree_size = treemap_size( subtreemap );
          final SubLObject sub_height = Numbers.round( Numbers.multiply( height, Numbers.divide( subtree_size, tree_size ) ), UNPROVIDED );
          html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          if( NIL != sub_height )
          {
            html_markup( html_macros.$html_table_row_height$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( sub_height );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw146$CENTER ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw146$CENTER ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != width )
            {
              html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_markup( width );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_treemap_table_recursive( subtreemap, width, sub_height, $kw728$HORIZONTAL, display_properties );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
            }
            html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
          }
          html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_source_readability_terpri( UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          subtreemap = cdolist_list_var.first();
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    else if( split_type == $kw728$HORIZONTAL )
    {
      html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_markup( ZERO_INTEGER );
      html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject tree_size = treemap_size( treemap );
        html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        if( NIL != height )
        {
          html_markup( html_macros.$html_table_row_height$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( height );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject cdolist_list_var2 = treemap;
          SubLObject subtreemap2 = NIL;
          subtreemap2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            final SubLObject subtree_size2 = treemap_size( subtreemap2 );
            final SubLObject sub_width = Numbers.round( Numbers.multiply( width, Numbers.divide( subtree_size2, tree_size ) ), UNPROVIDED );
            html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw146$CENTER ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( html_align( $kw146$CENTER ) );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != sub_width )
            {
              html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_markup( sub_width );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_treemap_table_recursive( subtreemap2, sub_width, height, $kw718$VERTICAL, display_properties );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
            }
            html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            cdolist_list_var2 = cdolist_list_var2.rest();
            subtreemap2 = cdolist_list_var2.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
        }
        html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 102798L)
  public static SubLObject compute_treemap_color(SubLObject color, final SubLObject v_class, final SubLObject display_properties)
  {
    if( NIL == color )
    {
      final SubLObject class_colormap_tail = cdestructuring_bind.property_list_member( $kw729$CLASS_COLORMAP, display_properties );
      final SubLObject class_colormap = ( NIL != class_colormap_tail ) ? conses_high.cadr( class_colormap_tail ) : NIL;
      if( NIL != class_colormap )
      {
        color = list_utilities.alist_lookup_without_values( class_colormap, v_class, UNPROVIDED, UNPROVIDED );
      }
    }
    return color;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 105707L)
  public static SubLObject build_treemap_recursive(final SubLObject root, final SubLObject dtrs_fn, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn, final SubLObject done)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject subtreemap_for_root = treemap_entry_for_node( root, size_fn, name_fn, class_fn );
    final SubLObject dtrs = Functions.funcall( dtrs_fn, root );
    SubLObject treemap = NIL;
    if( NIL == set.set_memberP( root, done ) )
    {
      if( NIL != dtrs )
      {
        SubLObject subtreemaps = NIL;
        if( !$build_treemap_depth$.getDynamicValue( thread ).numGE( $build_treemap_max_depth$.getGlobalValue() ) )
        {
          final SubLObject _prev_bind_0 = $build_treemap_depth$.currentBinding( thread );
          try
          {
            $build_treemap_depth$.bind( number_utilities.f_1X( $build_treemap_depth$.getDynamicValue( thread ) ), thread );
            SubLObject cdolist_list_var = dtrs;
            SubLObject dtr = NIL;
            dtr = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL == set.set_memberP( dtr, done ) )
              {
                final SubLObject subtreemap = build_treemap_recursive( dtr, dtrs_fn, size_fn, name_fn, class_fn, done );
                if( NIL != number_utilities.positive_number_p( treemap_size( subtreemap ) ) )
                {
                  subtreemaps = ConsesLow.cons( subtreemap, subtreemaps );
                }
                set.set_add( dtr, done );
              }
              cdolist_list_var = cdolist_list_var.rest();
              dtr = cdolist_list_var.first();
            }
          }
          finally
          {
            $build_treemap_depth$.rebind( _prev_bind_0, thread );
          }
        }
        if( NIL != number_utilities.positive_number_p( treemap_size( subtreemap_for_root ) ) )
        {
          subtreemaps = ConsesLow.cons( subtreemap_for_root, subtreemaps );
        }
        return Sequences.nreverse( subtreemaps );
      }
      treemap = subtreemap_for_root;
    }
    set.set_add( root, done );
    return treemap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 106723L)
  public static SubLObject treemap_entry_for_node(final SubLObject root, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn)
  {
    final SubLObject size = Functions.funcall( size_fn, root );
    final SubLObject name = Functions.funcall( name_fn, root );
    final SubLObject v_class = Functions.funcall( class_fn, root );
    SubLObject entry = NIL;
    if( NIL != number_utilities.positive_number_p( size ) )
    {
      entry = conses_high.putf( entry, $kw719$SIZE, size );
    }
    if( NIL != name )
    {
      entry = conses_high.putf( entry, $kw722$NAME, name );
    }
    if( NIL != v_class )
    {
      entry = conses_high.putf( entry, $kw720$CLASS, v_class );
    }
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 107126L)
  public static SubLObject html_user_id_and_password(SubLObject user_id_field, SubLObject hashed_password_field, SubLObject user_text, SubLObject password_text, SubLObject user, SubLObject bad_passwordP)
  {
    if( user_id_field == UNPROVIDED )
    {
      user_id_field = $str730$new_login_id;
    }
    if( hashed_password_field == UNPROVIDED )
    {
      hashed_password_field = $str731$hashed_password;
    }
    if( user_text == UNPROVIDED )
    {
      user_text = $str732$User_ID;
    }
    if( password_text == UNPROVIDED )
    {
      password_text = $str733$Password;
    }
    if( user == UNPROVIDED )
    {
      user = NIL;
    }
    if( bad_passwordP == UNPROVIDED )
    {
      bad_passwordP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject unhashed_password = Sequences.cconcatenate( $str734$unhashed_password_, user_id_field );
    final SubLObject keyup_event = Sequences.cconcatenate( $str735$var_oldB64Pad___b64pad__b64pad___, new SubLObject[] { format_nil.format_nil_a_no_copy( user_id_field ), $str736$_value_this_form_, format_nil
        .format_nil_a_no_copy( unhashed_password ), $str737$_value___this_form_, format_nil.format_nil_a_no_copy( hashed_password_field ), $str738$_value_b64_sha1_theInput___b64pad
    } );
    cyc_file_dependencies.javascript( $kw739$SHA1 );
    html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_markup( ZERO_INTEGER );
    html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_princ( user_text );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_text_input( user_id_field, user, $int740$30 );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$64, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$62, thread );
      }
      html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_source_readability_terpri( UNPROVIDED );
      html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != bad_passwordP )
          {
            html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
            {
              html_markup( html_macros.$html_font_color$.getGlobalValue() );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_markup( html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
              html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_princ( password_text );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$67, thread );
            }
            html_markup( html_macros.$html_font_tail$.getGlobalValue() );
          }
          else
          {
            html_princ( password_text );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$66, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_markup( html_macros.$html_input_head$.getGlobalValue() );
          html_markup( html_macros.$html_input_type$.getGlobalValue() );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_markup( $kw741$PASSWORD );
          html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != unhashed_password )
          {
            html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( unhashed_password );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          if( NIL != keyup_event )
          {
            html_markup( html_macros.$html_event_attribute_onkeyup$.getGlobalValue() );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_markup( keyup_event );
            html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
          {
            html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
          }
          html_char( Characters.CHAR_greater, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$68, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$65, thread );
      }
      html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_source_readability_terpri( UNPROVIDED );
      html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_reset_input( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_submit_input( $str742$Submit, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$71, thread );
        }
        html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$69, thread );
      }
      html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    html_hidden_input( hashed_password_field, NIL, $int691$80 );
    return NIL;
  }

  public static SubLObject declare_html_utilities_file()
  {
    SubLFiles.declareFunction( me, "html_flush", "HTML-FLUSH", 0, 0, false );
    SubLFiles.declareFunction( me, "html_char", "HTML-CHAR", 1, 1, false );
    SubLFiles.declareFunction( me, "html_string", "HTML-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "html_reserved_char_p", "HTML-RESERVED-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "html_escape_string_for_char", "HTML-ESCAPE-STRING-FOR-CHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "string_has_any_escape_charsP", "STRING-HAS-ANY-ESCAPE-CHARS?", 2, 0, false );
    SubLFiles.declareFunction( me, "html_reserved_character_code_p", "HTML-RESERVED-CHARACTER-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "html_escape_string_for_non_ascii_char", "HTML-ESCAPE-STRING-FOR-NON-ASCII-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "html_escape", "HTML-ESCAPE", 2, 0, false );
    SubLFiles.declareFunction( me, "subl_string_to_display_vector_string", "SUBL-STRING-TO-DISPLAY-VECTOR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_princ", "HTML-PRINC", 1, 0, false );
    SubLFiles.declareFunction( me, "html_princ_strong", "HTML-PRINC-STRONG", 1, 0, false );
    SubLFiles.declareFunction( me, "html_princ_possibly_strong", "HTML-PRINC-POSSIBLY-STRONG", 2, 0, false );
    SubLFiles.declareFunction( me, "html_princ_non_breaking", "HTML-PRINC-NON-BREAKING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_prin1", "HTML-PRIN1", 1, 0, false );
    SubLFiles.declareFunction( me, "html_princ_formatted_string", "HTML-PRINC-FORMATTED-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_terpri", "HTML-TERPRI", 0, 1, false );
    SubLFiles.declareFunction( me, "html_source_readability_terpri", "HTML-SOURCE-READABILITY-TERPRI", 0, 1, false );
    SubLFiles.declareFunction( me, "html_tab", "HTML-TAB", 0, 1, false );
    SubLFiles.declareFunction( me, "html_spaces", "HTML-SPACES", 0, 1, false );
    SubLFiles.declareFunction( me, "html_indent", "HTML-INDENT", 0, 1, false );
    SubLFiles.declareFunction( me, "html_markup", "HTML-MARKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "html_print_doc_string", "HTML-PRINT-DOC-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_princ_doc_string", "HTML-PRINC-DOC-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "hide_non_ascii_chars", "HIDE-NON-ASCII-CHARS", 1, 0, false );
    SubLFiles.declareFunction( me, "html_princ_string_with_hidden_non_ascii_chars", "HTML-PRINC-STRING-WITH-HIDDEN-NON-ASCII-CHARS", 1, 0, false );
    SubLFiles.declareFunction( me, "html_princ_cycl_string", "HTML-PRINC-CYCL-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "html_princ_cycl_string_new", "HTML-PRINC-CYCL-STRING-NEW", 3, 0, false );
    SubLFiles.declareFunction( me, "html_princ_cycl_string_old", "HTML-PRINC-CYCL-STRING-OLD", 3, 0, false );
    SubLFiles.declareFunction( me, "html_cycl_string", "HTML-CYCL-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "opencyc_html_cycl_string", "OPENCYC-HTML-CYCL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_form_for_cycl_string", "CB-FORM-FOR-CYCL-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "html_stale_constant_reference", "HTML-STALE-CONSTANT-REFERENCE", 1, 2, false );
    SubLFiles.declareFunction( me, "html_show_string_with_invalid_constants_highlighted", "HTML-SHOW-STRING-WITH-INVALID-CONSTANTS-HIGHLIGHTED", 1, 1, false );
    SubLFiles.declareFunction( me, "html_url_princ", "HTML-URL-PRINC", 1, 0, false );
    SubLFiles.declareFunction( me, "html_url_princ_char", "HTML-URL-PRINC-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "html_simple_attribute", "HTML-SIMPLE-ATTRIBUTE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_simple_quoted_attribute", "HTML-SIMPLE-QUOTED-ATTRIBUTE", 2, 0, false );
    SubLFiles.declareFunction( me, "html_color", "HTML-COLOR", 1, 0, false );
    SubLFiles.declareFunction( me, "html_style_background_color", "HTML-STYLE-BACKGROUND-COLOR", 1, 0, false );
    SubLFiles.declareFunction( me, "html_align", "HTML-ALIGN", 1, 0, false );
    SubLFiles.declareFunction( me, "html_copyright_notice", "HTML-COPYRIGHT-NOTICE", 0, 0, false );
    SubLFiles.declareFunction( me, "html_copyright_text", "HTML-COPYRIGHT-TEXT", 0, 0, false );
    SubLFiles.declareFunction( me, "html_mailto_url", "HTML-MAILTO-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "html_file_url", "HTML-FILE-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "html_refresh", "HTML-REFRESH", 1, 1, false );
    SubLFiles.declareFunction( me, "html_meta_utf_8_content_type", "HTML-META-UTF-8-CONTENT-TYPE", 0, 0, false );
    SubLFiles.declareFunction( me, "html_meta_expires", "HTML-META-EXPIRES", 0, 3, false );
    SubLFiles.declareFunction( me, "html_meta_last_modified", "HTML-META-LAST-MODIFIED", 0, 1, false );
    SubLFiles.declareFunction( me, "html_meta_dont_cache", "HTML-META-DONT-CACHE", 0, 0, false );
    SubLFiles.declareMacro( me, "html_webpage_expires", "HTML-WEBPAGE-EXPIRES" );
    SubLFiles.declareMacro( me, "html_webpage_last_modified", "HTML-WEBPAGE-LAST-MODIFIED" );
    SubLFiles.declareMacro( me, "html_dont_cache_webpage", "HTML-DONT-CACHE-WEBPAGE" );
    SubLFiles.declareFunction( me, "html_meta_no_robots", "HTML-META-NO-ROBOTS", 0, 0, false );
    SubLFiles.declareFunction( me, "html_meta_robot_instructions", "HTML-META-ROBOT-INSTRUCTIONS", 0, 2, false );
    SubLFiles.declareFunction( me, "html_meta_select_robot_instructions", "HTML-META-SELECT-ROBOT-INSTRUCTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "html_hr", "HTML-HR", 0, 2, false );
    SubLFiles.declareFunction( me, "html_line_break", "HTML-LINE-BREAK", 0, 1, false );
    SubLFiles.declareFunction( me, "html_br", "HTML-BR", 0, 0, false );
    SubLFiles.declareFunction( me, "html_newline", "HTML-NEWLINE", 0, 1, false );
    SubLFiles.declareFunction( me, "html_checkbox_input", "HTML-CHECKBOX-INPUT", 1, 5, false );
    SubLFiles.declareFunction( me, "html_hidden_input", "HTML-HIDDEN-INPUT", 2, 1, false );
    SubLFiles.declareFunction( me, "html_image_input", "HTML-IMAGE-INPUT", 2, 2, false );
    SubLFiles.declareFunction( me, "html_password_input", "HTML-PASSWORD-INPUT", 1, 2, false );
    SubLFiles.declareFunction( me, "html_radio_input", "HTML-RADIO-INPUT", 1, 3, false );
    SubLFiles.declareFunction( me, "html_reset_input", "HTML-RESET-INPUT", 0, 1, false );
    SubLFiles.declareFunction( me, "html_submit_input", "HTML-SUBMIT-INPUT", 0, 3, false );
    SubLFiles.declareFunction( me, "html_text_input", "HTML-TEXT-INPUT", 1, 2, false );
    SubLFiles.declareFunction( me, "html_scripted_text_input", "HTML-SCRIPTED-TEXT-INPUT", 2, 2, false );
    SubLFiles.declareFunction( me, "html_disabled_text_input", "HTML-DISABLED-TEXT-INPUT", 1, 2, false );
    SubLFiles.declareFunction( me, "html_format_input", "HTML-FORMAT-INPUT", 3, 4, false );
    SubLFiles.declareFunction( me, "html_autocomplete_text_input", "HTML-AUTOCOMPLETE-TEXT-INPUT", 1, 4, false );
    SubLFiles.declareFunction( me, "html_image_multi_submit", "HTML-IMAGE-MULTI-SUBMIT", 1, 1, false );
    SubLFiles.declareFunction( me, "html_extract_multi_submit_input", "HTML-EXTRACT-MULTI-SUBMIT-INPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "html_extract_multi_submit_input_internal", "HTML-EXTRACT-MULTI-SUBMIT-INPUT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "html_indent_table_internal", "HTML-INDENT-TABLE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "html_indent_row_internal", "HTML-INDENT-ROW-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "html_target_definition", "HTML-TARGET-DEFINITION", 1, 0, false );
    SubLFiles.declareFunction( me, "html_basefont", "HTML-BASEFONT", 1, 0, false );
    SubLFiles.declareFunction( me, "html_word_break", "HTML-WORD-BREAK", 0, 0, false );
    SubLFiles.declareFunction( me, "html_print_lexicon_entry", "HTML-PRINT-LEXICON-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "html_print_form", "HTML-PRINT-FORM", 1, 2, false );
    SubLFiles.declareFunction( me, "html_basic_image", "HTML-BASIC-IMAGE", 1, 3, false );
    SubLFiles.declareFunction( me, "html_table_row_list", "HTML-TABLE-ROW-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "html_table_heading_list", "HTML-TABLE-HEADING-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "html_percent_progress_bar", "HTML-PERCENT-PROGRESS-BAR", 2, 3, false );
    SubLFiles.declareMacro( me, "html_fancy_percent_progress_bar", "HTML-FANCY-PERCENT-PROGRESS-BAR" );
    SubLFiles.declareFunction( me, "html_fancy_percent_progress_bar_widths", "HTML-FANCY-PERCENT-PROGRESS-BAR-WIDTHS", 3, 0, false );
    SubLFiles.declareFunction( me, "html_progress_section", "HTML-PROGRESS-SECTION", 0, 5, false );
    SubLFiles.declareFunction( me, "html_horizontal_bar_graph", "HTML-HORIZONTAL-BAR-GRAPH", 1, 4, false );
    SubLFiles.declareFunction( me, "html_draw_bargraph_label", "HTML-DRAW-BARGRAPH-LABEL", 1, 0, false );
    SubLFiles.declareFunction( me, "html_draw_bargraph_colorbar", "HTML-DRAW-BARGRAPH-COLORBAR", 4, 0, false );
    SubLFiles.declareFunction( me, "html_control_parameter_chooser", "HTML-CONTROL-PARAMETER-CHOOSER", 1, 1, false );
    SubLFiles.declareFunction( me, "html_extract_control_parameter_value", "HTML-EXTRACT-CONTROL-PARAMETER-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "html_set_control_parameter", "HTML-SET-CONTROL-PARAMETER", 2, 0, false );
    SubLFiles.declareFunction( me, "html_control_parameter_entry_name", "HTML-CONTROL-PARAMETER-ENTRY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "html_control_parameter_radio_name", "HTML-CONTROL-PARAMETER-RADIO-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "html_select_from_list", "HTML-SELECT-FROM-LIST", 3, 1, false );
    SubLFiles.declareFunction( me, "matching_html_field", "MATCHING-HTML-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "matching_html_button_field", "MATCHING-HTML-BUTTON-FIELD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_extract_input", "HTML-EXTRACT-INPUT", 2, 0, false );
    SubLFiles.declareFunction( me, "html_extract_input_values", "HTML-EXTRACT-INPUT-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "html_extract_value", "HTML-EXTRACT-VALUE", 2, 1, false );
    SubLFiles.declareFunction( me, "html_extract_integer", "HTML-EXTRACT-INTEGER", 2, 1, false );
    SubLFiles.declareFunction( me, "html_extract_date", "HTML-EXTRACT-DATE", 2, 1, false );
    SubLFiles.declareFunction( me, "html_extract_keyword", "HTML-EXTRACT-KEYWORD", 2, 1, false );
    SubLFiles.declareFunction( me, "html_extract_string", "HTML-EXTRACT-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "html_extract_boolean", "HTML-EXTRACT-BOOLEAN", 2, 1, false );
    SubLFiles.declareFunction( me, "html_extract_sexpr", "HTML-EXTRACT-SEXPR", 2, 1, false );
    SubLFiles.declareFunction( me, "html_extract_cyclified_sexpr", "HTML-EXTRACT-CYCLIFIED-SEXPR", 2, 1, false );
    SubLFiles.declareFunction( me, "html_extract_sexpr_int", "HTML-EXTRACT-SEXPR-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "html_extract_button_value", "HTML-EXTRACT-BUTTON-VALUE", 2, 1, false );
    SubLFiles.declareFunction( me, "decode_html_language_abbreviation", "DECODE-HTML-LANGUAGE-ABBREVIATION", 1, 0, false );
    SubLFiles.declareFunction( me, "html_glyph", "HTML-GLYPH", 1, 1, false );
    SubLFiles.declareFunction( me, "html_glyph_markup", "HTML-GLYPH-MARKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "html_declare_glyph", "HTML-DECLARE-GLYPH", 2, 0, false );
    SubLFiles.declareFunction( me, "html_unicode_char", "HTML-UNICODE-CHAR", 1, 1, false );
    SubLFiles.declareFunction( me, "html_create_listbox", "HTML-CREATE-LISTBOX", 2, 4, false );
    SubLFiles.declareFunction( me, "html_create_radiobox_form", "HTML-CREATE-RADIOBOX-FORM", 2, 3, false );
    SubLFiles.declareFunction( me, "html_create_multiple_selection_listbox", "HTML-CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false );
    SubLFiles.declareFunction( me, "html_create_dropdown_list", "HTML-CREATE-DROPDOWN-LIST", 2, 4, false );
    SubLFiles.declareFunction( me, "html_create_simple_dropdown_list", "HTML-CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false );
    SubLFiles.declareFunction( me, "create_listbox", "CREATE-LISTBOX", 2, 3, false );
    SubLFiles.declareFunction( me, "create_multiple_selection_listbox", "CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false );
    SubLFiles.declareFunction( me, "create_dropdown_list", "CREATE-DROPDOWN-LIST", 2, 3, false );
    SubLFiles.declareFunction( me, "create_simple_dropdown_list", "CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false );
    SubLFiles.declareFunction( me, "get_encoded_form_field_name", "GET-ENCODED-FORM-FIELD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_encoded_form_field_value", "EXTRACT-ENCODED-FORM-FIELD-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "encode_form_field_name", "ENCODE-FORM-FIELD-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "html_echo_args", "HTML-ECHO-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "html_echo_file", "HTML-ECHO-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_html_tags", "REMOVE-HTML-TAGS", 1, 1, false );
    SubLFiles.declareFunction( me, "convert_html_to_text", "CONVERT-HTML-TO-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "url_to_text", "URL-TO-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "generate_html_filename_input_fieldname", "GENERATE-HTML-FILENAME-INPUT-FIELDNAME", 1, 0, false );
    SubLFiles.declareFunction( me, "html_filename_input", "HTML-FILENAME-INPUT", 3, 0, false );
    SubLFiles.declareMacro( me, "html_with_file_transmitting_form", "HTML-WITH-FILE-TRANSMITTING-FORM" );
    SubLFiles.declareFunction( me, "html_arguments_contain_multipart_form_dataP", "HTML-ARGUMENTS-CONTAIN-MULTIPART-FORM-DATA?", 1, 0, false );
    SubLFiles.declareFunction( me, "html_parse_multipart_form_data", "HTML-PARSE-MULTIPART-FORM-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "html_parse_consume_separator", "HTML-PARSE-CONSUME-SEPARATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "html_parse_data_name_from_content_disposition", "HTML-PARSE-DATA-NAME-FROM-CONTENT-DISPOSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "html_parse_multipart_form_line", "HTML-PARSE-MULTIPART-FORM-LINE", 2, 0, false );
    SubLFiles.declareFunction( me, "html_construct_message_from_multipart_data", "HTML-CONSTRUCT-MESSAGE-FROM-MULTIPART-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "html_request_arguments_are_multipart_dataP", "HTML-REQUEST-ARGUMENTS-ARE-MULTIPART-DATA?", 1, 0, false );
    SubLFiles.declareFunction( me, "html_treemap_table", "HTML-TREEMAP-TABLE", 1, 4, false );
    SubLFiles.declareFunction( me, "treemap_size", "TREEMAP-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "treemap_class_size", "TREEMAP-CLASS-SIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "build_treemap", "BUILD-TREEMAP", 5, 0, false );
    SubLFiles.declareFunction( me, "html_treemap_table_recursive", "HTML-TREEMAP-TABLE-RECURSIVE", 5, 0, false );
    SubLFiles.declareFunction( me, "compute_treemap_color", "COMPUTE-TREEMAP-COLOR", 3, 0, false );
    SubLFiles.declareFunction( me, "build_treemap_recursive", "BUILD-TREEMAP-RECURSIVE", 6, 0, false );
    SubLFiles.declareFunction( me, "treemap_entry_for_node", "TREEMAP-ENTRY-FOR-NODE", 4, 0, false );
    SubLFiles.declareFunction( me, "html_user_id_and_password", "HTML-USER-ID-AND-PASSWORD", 0, 6, false );
    return NIL;
  }

  public static SubLObject init_html_utilities_file()
  {
    $cb_use_frames$ = SubLFiles.defparameter( "*CB-USE-FRAMES*", T );
    $use_new_html_princ_cycl_stringP$ = SubLFiles.defparameter( "*USE-NEW-HTML-PRINC-CYCL-STRING?*", T );
    $html_stale_constant_reference_color$ = SubLFiles.defparameter( "*HTML-STALE-CONSTANT-REFERENCE-COLOR*", NIL );
    $html_url_princ_escape_spaces$ = SubLFiles.defparameter( "*HTML-URL-PRINC-ESCAPE-SPACES*", T );
    $html_style_background$ = SubLFiles.defparameter( "*HTML-STYLE-BACKGROUND*", $str48$background_color_ );
    $html_align_map$ = SubLFiles.defparameter( "*HTML-ALIGN-MAP*", $list49 );
    $cycorp_homepage_url$ = SubLFiles.defparameter( "*CYCORP-HOMEPAGE-URL*", $str50$http___www_cyc_com );
    $cycorp_homepage_text$ = SubLFiles.defparameter( "*CYCORP-HOMEPAGE-TEXT*", $str51$Cycorp );
    $proprietarity_message$ = SubLFiles.deflexical( "*PROPRIETARITY-MESSAGE*", ( maybeDefault( $sym52$_PROPRIETARITY_MESSAGE_, $proprietarity_message$, $str47$ ) ) );
    $html_extract_field_name$ = SubLFiles.defparameter( "*HTML-EXTRACT-FIELD-NAME*", NIL );
    $url_to_text_replacements$ = SubLFiles.deflexical( "*URL-TO-TEXT-REPLACEMENTS*", $list689 );
    $html_filename_input_prefix$ = SubLFiles.deflexical( "*HTML-FILENAME-INPUT-PREFIX*", $str696$_file_input_ );
    $html_multipart_form_date$ = SubLFiles.deflexical( "*HTML-MULTIPART-FORM-DATE*", $str710$_multipart_formdata );
    $html_newline_string$ = SubLFiles.defconstant( "*HTML-NEWLINE-STRING*", Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ) );
    $html_multipart_content_marker$ = SubLFiles.deflexical( "*HTML-MULTIPART-CONTENT-MARKER*", $str716$____________________ );
    $html_multipart_content_marker_size$ = SubLFiles.deflexical( "*HTML-MULTIPART-CONTENT-MARKER-SIZE*", Sequences.length( $html_multipart_content_marker$.getGlobalValue() ) );
    $build_treemap_depth$ = SubLFiles.defparameter( "*BUILD-TREEMAP-DEPTH*", ZERO_INTEGER );
    $build_treemap_max_depth$ = SubLFiles.deflexical( "*BUILD-TREEMAP-MAX-DEPTH*", TEN_INTEGER );
    $html_utils_test$ = SubLFiles.defconstant( "*HTML-UTILS-TEST*", $str743$HTML_Utilities_Test );
    $html_utils_test_category$ = SubLFiles.defconstant( "*HTML-UTILS-TEST-CATEGORY*", Sequences.cconcatenate( $html_utils_test$.getGlobalValue(), $str744$_Category ) );
    $html_utils_test_suite$ = SubLFiles.defconstant( "*HTML-UTILS-TEST-SUITE*", Sequences.cconcatenate( $html_utils_test$.getGlobalValue(), $str745$_Suite ) );
    $html_utils_module$ = SubLFiles.defconstant( "*HTML-UTILS-MODULE*", $str746$HTML_Utilities );
    return NIL;
  }

  public static SubLObject setup_html_utilities_file()
  {
    utilities_macros.register_html_state_variable( $sym0$_CB_USE_FRAMES_ );
    utilities_macros.register_html_interface_variable( $sym0$_CB_USE_FRAMES_ );
    generic_testing.define_test_case_table_int( $sym30$OPENCYC_HTML_CYCL_STRING, ConsesLow.list( new SubLObject[] { $kw31$TEST, NIL, $kw32$OWNER, NIL, $kw33$CLASSES, NIL, $kw34$KB, $kw35$FULL, $kw36$WORKING_, T
    } ), $list37 );
    subl_macro_promotions.declare_defglobal( $sym52$_PROPRIETARITY_MESSAGE_ );
    Hashtables.sethash( $kw56$CYC_LOGO_SMALL_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str57$cyc_logo_violet_16_gif, NIL ) );
    Hashtables.sethash( $kw58$CYC_LOGO_LARGE_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str59$cyc_logo_violet_60_gif, NIL ) );
    Hashtables.sethash( $kw60$CYCORP_SYMBOL_TINY, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str61$cyc_logo_tiny_gif, NIL ) );
    Hashtables.sethash( $kw62$CYCORP_SYMBOL_SMALL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str63$cyc_logo_sm_gif, NIL ) );
    Hashtables.sethash( $kw64$CYCORP_SYMBOL_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str65$cyc_logo_10_t_gif, NIL ) );
    Hashtables.sethash( $kw66$CYCORP_LOGO_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str67$cyc_logo_25_t_gif, NIL ) );
    Hashtables.sethash( $kw68$CYCORP_LOGO_BIG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), ConsesLow.list( $str69$cyc_logo_50_t_gif, NIL ) );
    access_macros.register_macro_helper( $sym132$HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS, $sym136$HTML_FANCY_PERCENT_PROGRESS_BAR );
    html_declare_glyph( $kw196$LT, $str197$_lt_ );
    html_declare_glyph( $kw198$GT, $str199$_gt_ );
    html_declare_glyph( $kw200$AMP, $str201$_amp_ );
    html_declare_glyph( $kw202$QUOT, $str203$_quot_ );
    html_declare_glyph( $kw204$REG, $str205$_reg_ );
    html_declare_glyph( $kw206$COPY, $str207$_copy_ );
    html_declare_glyph( $kw10$NBSP, $str208$_nbsp_ );
    html_declare_glyph( $kw209$EMSP, $str210$_emsp_ );
    html_declare_glyph( $kw211$ENSP, $str212$_ensp_ );
    html_declare_glyph( $kw213$SPACE, $str214$__X0020_ );
    html_declare_glyph( $kw215$EM_SPACE, $str216$__X2003_ );
    html_declare_glyph( $kw217$EN_SPACE, $str218$__X2002_ );
    html_declare_glyph( $kw219$TWO_PER_EM_SPACE, html_glyph_markup( $kw217$EN_SPACE ) );
    html_declare_glyph( $kw220$THREE_PER_EM_SPACE, $str221$__X2004_ );
    html_declare_glyph( $kw222$FOUR_PER_EM_SPACE, $str223$__X2005_ );
    html_declare_glyph( $kw224$SIX_PER_EM_SPACE, $str225$__X2006_ );
    html_declare_glyph( $kw226$THIN_SPACE, $str227$__X2009_ );
    html_declare_glyph( $kw228$HAIR_SPACE, $str229$__X200A_ );
    html_declare_glyph( $kw230$IEXCL, $str231$_iexcl_ );
    html_declare_glyph( $kw232$CENT, $str233$_cent_ );
    html_declare_glyph( $kw234$POUND, $str235$_pound_ );
    html_declare_glyph( $kw236$CURREN, $str237$_curren_ );
    html_declare_glyph( $kw238$YEN, $str239$_yen_ );
    html_declare_glyph( $kw240$BRVBAR, $str241$_brvba_ );
    html_declare_glyph( $kw242$SECT, $str243$_sect_ );
    html_declare_glyph( $kw244$UML, $str245$_uml_ );
    html_declare_glyph( $kw206$COPY, $str207$_copy_ );
    html_declare_glyph( $kw246$ORDF, $str247$_ordf_ );
    html_declare_glyph( $kw248$LAQUO, $str249$_laquo_ );
    html_declare_glyph( $kw250$NOT, $str251$_not_ );
    html_declare_glyph( $kw252$SHY, $str253$_shy_ );
    html_declare_glyph( $kw204$REG, $str205$_reg_ );
    html_declare_glyph( $kw254$MACR, $str255$_macr_ );
    html_declare_glyph( $kw256$DEG, $str257$_deg_ );
    html_declare_glyph( $kw258$PLUSMN, $str259$_plusmn_ );
    html_declare_glyph( $kw260$SUP2, $str261$_sup2_ );
    html_declare_glyph( $kw262$SUP3, $str263$_sup3_ );
    html_declare_glyph( $kw264$ACUTE, $str265$_acute_ );
    html_declare_glyph( $kw266$MICRO, $str267$_micro_ );
    html_declare_glyph( $kw268$PARA, $str269$_para_ );
    html_declare_glyph( $kw270$MIDDOT, $str271$_middoy_ );
    html_declare_glyph( $kw272$CEDIL, $str273$_cedil_ );
    html_declare_glyph( $kw274$SUP1, $str275$_sup1_ );
    html_declare_glyph( $kw276$ORDM, $str277$_ordm_ );
    html_declare_glyph( $kw278$RAQUO, $str279$_raquo_ );
    html_declare_glyph( $kw280$FRAC14, $str281$_frac14_ );
    html_declare_glyph( $kw282$FRAC12, $str283$_frac12_ );
    html_declare_glyph( $kw284$FRAC34, $str285$_frac34_ );
    html_declare_glyph( $kw286$IQUEST, $str287$_iquest_ );
    html_declare_glyph( $kw288$AGRAVE_CAP, $str289$_Agrave_ );
    html_declare_glyph( $kw290$AACUTE_CAP, $str291$_Aacute_ );
    html_declare_glyph( $kw292$ACIRC_CAP, $str293$_Acirc_ );
    html_declare_glyph( $kw294$ATILDE_CAP, $str295$_Atilde_ );
    html_declare_glyph( $kw296$AUML_CAP, $str297$_Auml_ );
    html_declare_glyph( $kw298$ARING_CAP, $str299$_Aring_ );
    html_declare_glyph( $kw300$AELIG_CAP, $str301$_AElig_ );
    html_declare_glyph( $kw302$CCEDIL_CAP, $str303$_Ccedil_ );
    html_declare_glyph( $kw304$EGRAVE_CAP, $str305$_Egrave_ );
    html_declare_glyph( $kw306$EACUTE_CAP, $str307$_Eacute_ );
    html_declare_glyph( $kw308$ECIRC_CAP, $str309$_Ecirc_ );
    html_declare_glyph( $kw310$EUML_CAP, $str311$_Euml_ );
    html_declare_glyph( $kw312$IGRAVE_CAP, $str313$_Igrave_ );
    html_declare_glyph( $kw314$IACUTE_CAP, $str315$_Iacute_ );
    html_declare_glyph( $kw316$ICIRC_CAP, $str317$_Icirc_ );
    html_declare_glyph( $kw318$IUML_CAP, $str319$_Iuml_ );
    html_declare_glyph( $kw320$ETH_CAP, $str321$_ETH_ );
    html_declare_glyph( $kw322$NTILDE_CAP, $str323$_Ntilde_ );
    html_declare_glyph( $kw324$OGRAVE_CAP, $str325$_Ograve_ );
    html_declare_glyph( $kw326$OACUTE_CAP, $str327$_Oacute_ );
    html_declare_glyph( $kw328$OCIRC_CAP, $str329$_Ocirc_ );
    html_declare_glyph( $kw330$OTILDE_CAP, $str331$_Otilde_ );
    html_declare_glyph( $kw332$OUML_CAP, $str333$_Ouml_ );
    html_declare_glyph( $kw334$TIMES, $str335$_times_ );
    html_declare_glyph( $kw336$OSLASH_CAP, $str337$_Oslash_ );
    html_declare_glyph( $kw338$UGRAVE_CAP, $str339$_Ugrave_ );
    html_declare_glyph( $kw340$UACUTE_CAP, $str341$_Uacute_ );
    html_declare_glyph( $kw342$UCIRC_CAP, $str343$_Ucirc_ );
    html_declare_glyph( $kw344$UUML_CAP, $str345$_Uuml_ );
    html_declare_glyph( $kw346$YACUTE_CAP, $str347$_Yacute_ );
    html_declare_glyph( $kw348$THORN_CAP, $str349$_THORN_ );
    html_declare_glyph( $kw350$SZLIG, $str351$_szlig_ );
    html_declare_glyph( $kw352$AGRAVE, $str353$_agrave_ );
    html_declare_glyph( $kw354$AACUTE, $str355$_aacute_ );
    html_declare_glyph( $kw356$ACIRC, $str357$_acirc_ );
    html_declare_glyph( $kw358$ATILDE, $str359$_atilde_ );
    html_declare_glyph( $kw360$AUML, $str361$_auml_ );
    html_declare_glyph( $kw362$ARING, $str363$_aring_ );
    html_declare_glyph( $kw364$AELIG, $str365$_aelig_ );
    html_declare_glyph( $kw366$CCEDIL, $str367$_ccedil_ );
    html_declare_glyph( $kw368$EGRAVE, $str369$_egrave_ );
    html_declare_glyph( $kw370$EACUTE, $str371$_eacute_ );
    html_declare_glyph( $kw372$ECIRC, $str373$_ecirc_ );
    html_declare_glyph( $kw374$EUML, $str375$_euml_ );
    html_declare_glyph( $kw376$IGRAVE, $str377$_igrave_ );
    html_declare_glyph( $kw378$IACUTE, $str379$_iacute_ );
    html_declare_glyph( $kw380$ICIRC, $str381$_icirc_ );
    html_declare_glyph( $kw382$IUML, $str383$_iuml_ );
    html_declare_glyph( $kw384$ETH, $str385$_eth_ );
    html_declare_glyph( $kw386$NTILDE, $str387$_ntilde_ );
    html_declare_glyph( $kw388$OGRAVE, $str389$_ograve_ );
    html_declare_glyph( $kw390$OACUTE, $str391$_oacute_ );
    html_declare_glyph( $kw392$OCIRC, $str393$_ocirc_ );
    html_declare_glyph( $kw394$OTILDE, $str395$_otilde_ );
    html_declare_glyph( $kw396$OUML, $str397$_ouml_ );
    html_declare_glyph( $kw398$DIVIDE, $str399$_divide_ );
    html_declare_glyph( $kw400$OSLASH, $str401$_oslash_ );
    html_declare_glyph( $kw402$UGRAVE, $str403$_ugrave_ );
    html_declare_glyph( $kw404$UACUTE, $str405$_uacute_ );
    html_declare_glyph( $kw406$UCIRC, $str407$_ucirc_ );
    html_declare_glyph( $kw408$UUML, $str409$_uuml_ );
    html_declare_glyph( $kw410$YACUTE, $str411$_yacute_ );
    html_declare_glyph( $kw412$THORN, $str413$_thorn_ );
    html_declare_glyph( $kw414$YUML, $str415$_yuml_ );
    html_declare_glyph( $kw416$FNOF, $str417$_fnof_ );
    html_declare_glyph( $kw418$ALPHA_CAP, $str419$_Alpha_ );
    html_declare_glyph( $kw420$BETA_CAP, $str421$_Beta_ );
    html_declare_glyph( $kw422$GAMMA_CAP, $str423$_Gamma_ );
    html_declare_glyph( $kw424$DELTA_CAP, $str425$_Delta_ );
    html_declare_glyph( $kw426$EPSILON_CAP, $str427$_Epsilon_ );
    html_declare_glyph( $kw428$ZETA_CAP, $str429$_Zeta_ );
    html_declare_glyph( $kw430$ETA_CAP, $str431$_Eta_ );
    html_declare_glyph( $kw432$THETA_CAP, $str433$_Theta_ );
    html_declare_glyph( $kw434$IOTA_CAP, $str435$_Iota_ );
    html_declare_glyph( $kw436$KAPPA_CAP, $str437$_Kappa_ );
    html_declare_glyph( $kw438$LAMBDA_CAP, $str439$_Lambda_ );
    html_declare_glyph( $kw440$MU_CAP, $str441$_Mu_ );
    html_declare_glyph( $kw442$NU_CAP, $str443$_Nu_ );
    html_declare_glyph( $kw444$XI_CAP, $str445$_Xi_ );
    html_declare_glyph( $kw446$OMICRON_CAP, $str447$_Omicron_ );
    html_declare_glyph( $kw448$PI_CAP, $str449$_Pi_ );
    html_declare_glyph( $kw450$RHO_CAP, $str451$_Rho_ );
    html_declare_glyph( $kw452$SIGMA_CAP, $str453$_Sigma_ );
    html_declare_glyph( $kw454$TAU_CAP, $str455$_Tau_ );
    html_declare_glyph( $kw456$UPSILON_CAP, $str457$_Upsilon_ );
    html_declare_glyph( $kw458$PHI_CAP, $str459$_Phi_ );
    html_declare_glyph( $kw460$CHI_CAP, $str461$_Chi_ );
    html_declare_glyph( $kw462$PSI_CAP, $str463$_Psi_ );
    html_declare_glyph( $kw464$OMEGA_CAP, $str465$_Omega_ );
    html_declare_glyph( $kw466$ALPHA, $str467$_alpha_ );
    html_declare_glyph( $kw468$BETA, $str469$_beta_ );
    html_declare_glyph( $kw470$GAMMA, $str471$_gamma_ );
    html_declare_glyph( $kw472$DELTA, $str473$_delta_ );
    html_declare_glyph( $kw474$EPSILON, $str475$_epsilon_ );
    html_declare_glyph( $kw476$ZETA, $str477$_zeta_ );
    html_declare_glyph( $kw478$ETA, $str479$_eta_ );
    html_declare_glyph( $kw480$THETA, $str481$_theta_ );
    html_declare_glyph( $kw482$IOTA, $str483$_iota_ );
    html_declare_glyph( $kw484$KAPPA, $str485$_kappa_ );
    html_declare_glyph( $kw486$LAMBDA, $str487$_lambda_ );
    html_declare_glyph( $kw488$MU, $str489$_mu_ );
    html_declare_glyph( $kw490$NU, $str491$_nu_ );
    html_declare_glyph( $kw492$XI, $str493$_xi_ );
    html_declare_glyph( $kw494$OMICRON, $str495$_omicron_ );
    html_declare_glyph( $kw496$PI, $str497$_pi_ );
    html_declare_glyph( $kw498$RHO, $str499$_rho_ );
    html_declare_glyph( $kw500$SIGMAF, $str501$_sigmaf_ );
    html_declare_glyph( $kw502$SIGMA, $str503$_sigma_ );
    html_declare_glyph( $kw504$TAU, $str505$_tau_ );
    html_declare_glyph( $kw506$UPSILON, $str507$_upsilon_ );
    html_declare_glyph( $kw508$PHI, $str509$_phi_ );
    html_declare_glyph( $kw510$CHI, $str511$_chi_ );
    html_declare_glyph( $kw512$PSI, $str513$_psi_ );
    html_declare_glyph( $kw514$OMEGA, $str515$_omega_ );
    html_declare_glyph( $kw516$THETASYM, $str481$_theta_ );
    html_declare_glyph( $kw517$UPSIH, $str518$_upsih_ );
    html_declare_glyph( $kw519$PIV, $str520$_piv_ );
    html_declare_glyph( $kw521$BULL, $str522$_bull_ );
    html_declare_glyph( $kw523$HELLIP, $str524$_hellip_ );
    html_declare_glyph( $kw525$PRIME, $str526$_prime_ );
    html_declare_glyph( $kw527$PRIME_DBL, $str528$_Prime_ );
    html_declare_glyph( $kw529$OLINE, $str530$_oline_ );
    html_declare_glyph( $kw531$FRASL, $str532$_frasl_ );
    html_declare_glyph( $kw533$WEIERP, $str534$_weierp_ );
    html_declare_glyph( $kw535$IMAGE, $str536$_image_ );
    html_declare_glyph( $kw537$REAL, $str538$_real_ );
    html_declare_glyph( $kw539$TRADE, $str540$_trade_ );
    html_declare_glyph( $kw541$ALEFSYM, $str542$_alefsym_ );
    html_declare_glyph( $kw543$UPWARDS_ARROW, $str544$_uarr_ );
    html_declare_glyph( $kw545$RIGHTWARDS_ARROW, $str546$_rarr_ );
    html_declare_glyph( $kw547$LARR, $str548$_larr_ );
    html_declare_glyph( $kw549$UARR, $str544$_uarr_ );
    html_declare_glyph( $kw550$RARR, $str546$_rarr_ );
    html_declare_glyph( $kw551$DARR, $str552$_darr_ );
    html_declare_glyph( $kw553$HARR, $str554$_harr_ );
    html_declare_glyph( $kw555$CRARR, $str556$_crarr_ );
    html_declare_glyph( $kw557$LARR_DBL, $str558$_lArr_ );
    html_declare_glyph( $kw559$UARR_DBL, $str560$_uArr_ );
    html_declare_glyph( $kw561$RARR_DBL, $str562$_rArr_ );
    html_declare_glyph( $kw563$DARR_DBL, $str564$_dArr_ );
    html_declare_glyph( $kw565$HARR_DBL, $str566$_hArr_ );
    html_declare_glyph( $kw567$FORALL, $str568$_forall_ );
    html_declare_glyph( $kw569$PART, $str570$_part_ );
    html_declare_glyph( $kw571$EXIST, $str572$_exist_ );
    html_declare_glyph( $kw573$EMPTY, $str574$_empty_ );
    html_declare_glyph( $kw575$NABLA, $str576$_nabla_ );
    html_declare_glyph( $kw577$ISIN, $str578$_isin_ );
    html_declare_glyph( $kw579$NOTIN, $str580$_notin_ );
    html_declare_glyph( $kw581$NI, $str582$_ni_ );
    html_declare_glyph( $kw583$PROD, $str584$_prod_ );
    html_declare_glyph( $kw585$SUM, $str586$_sum_ );
    html_declare_glyph( $kw587$MINUS, $str588$_minus_ );
    html_declare_glyph( $kw589$LOWAST, $str590$_lowast_ );
    html_declare_glyph( $kw591$RADIC, $str592$_radic_ );
    html_declare_glyph( $kw593$PROP, $str594$_prop_ );
    html_declare_glyph( $kw595$INFIN, $str596$_infin_ );
    html_declare_glyph( $kw597$ANG, $str598$_ang_ );
    html_declare_glyph( $kw599$AND, $str600$_and_ );
    html_declare_glyph( $kw601$OR, $str602$_or_ );
    html_declare_glyph( $kw603$CAP, $str604$_cap_ );
    html_declare_glyph( $kw605$CUP, $str606$_cup_ );
    html_declare_glyph( $kw607$INT, $str608$_int_ );
    html_declare_glyph( $kw609$THERE4, $str610$_there4_ );
    html_declare_glyph( $kw611$SIM, $str612$_sim_ );
    html_declare_glyph( $kw613$CONG, $str614$_cong_ );
    html_declare_glyph( $kw615$ASYMP, $str616$_asymp_ );
    html_declare_glyph( $kw617$NE, $str618$_ne_ );
    html_declare_glyph( $kw619$EQUIV, $str620$_equiv_ );
    html_declare_glyph( $kw621$LE, $str622$_le_ );
    html_declare_glyph( $kw623$GE, $str624$_ge_ );
    html_declare_glyph( $kw625$SUB, $str626$_sub_ );
    html_declare_glyph( $kw627$SUP, $str628$_sup_ );
    html_declare_glyph( $kw629$NSUB, $str630$_nsub_ );
    html_declare_glyph( $kw631$SUBE, $str632$_sube_ );
    html_declare_glyph( $kw633$SUPE, $str634$_supe_ );
    html_declare_glyph( $kw635$OPLUS, $str636$_oplus_ );
    html_declare_glyph( $kw637$OTIMES, $str638$_otimes_ );
    html_declare_glyph( $kw639$PERP, $str640$_perp_ );
    html_declare_glyph( $kw641$SDOT, $str642$_sdot_ );
    html_declare_glyph( $kw643$LCEIL, $str644$_lceil_ );
    html_declare_glyph( $kw645$RCEIL, $str646$_rceil_ );
    html_declare_glyph( $kw647$LFLOOR, $str648$_lfloor_ );
    html_declare_glyph( $kw649$RFLOOR, $str650$_rfloor_ );
    html_declare_glyph( $kw651$LANG, $str652$_lang_ );
    html_declare_glyph( $kw653$RANG, $str654$_rang_ );
    html_declare_glyph( $kw655$LOZ, $str656$_loz_ );
    html_declare_glyph( $kw657$SPADES, $str658$_spades_ );
    html_declare_glyph( $kw659$CLUBS, $str660$_clubs_ );
    html_declare_glyph( $kw661$HEARTS, $str662$_hearts_ );
    html_declare_glyph( $kw663$DIAMS, $str664$_diams_ );
    html_declare_glyph( $kw665$FROWNY_FACE, $str666$__9785_ );
    html_macros.note_cgi_handler_function( $sym676$HTML_ECHO_ARGS, $kw677$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym681$HTML_ECHO_FILE, $kw677$HTML_HANDLER );
    sunit_external.define_test_category( $html_utils_test_category$.getGlobalValue(), UNPROVIDED );
    sunit_external.define_test_suite( $html_utils_test_suite$.getGlobalValue(), ConsesLow.list( $html_utils_test_category$.getGlobalValue() ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_html_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_html_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_html_utilities_file();
  }
  static
  {
    me = new html_utilities();
    $cb_use_frames$ = null;
    $use_new_html_princ_cycl_stringP$ = null;
    $html_stale_constant_reference_color$ = null;
    $html_url_princ_escape_spaces$ = null;
    $html_style_background$ = null;
    $html_align_map$ = null;
    $cycorp_homepage_url$ = null;
    $cycorp_homepage_text$ = null;
    $proprietarity_message$ = null;
    $html_extract_field_name$ = null;
    $url_to_text_replacements$ = null;
    $html_filename_input_prefix$ = null;
    $html_multipart_form_date$ = null;
    $html_newline_string$ = null;
    $html_multipart_content_marker$ = null;
    $html_multipart_content_marker_size$ = null;
    $build_treemap_depth$ = null;
    $build_treemap_max_depth$ = null;
    $html_utils_test$ = null;
    $html_utils_test_category$ = null;
    $html_utils_test_suite$ = null;
    $html_utils_module$ = null;
    $sym0$_CB_USE_FRAMES_ = makeSymbol( "*CB-USE-FRAMES*" );
    $sym1$HTML_RESERVED_CHAR_P = makeSymbol( "HTML-RESERVED-CHAR-P" );
    $sym2$NON_ASCII_CHAR_P = makeSymbol( "NON-ASCII-CHAR-P" );
    $int3$38 = makeInteger( 38 );
    $int4$34 = makeInteger( 34 );
    $int5$60 = makeInteger( 60 );
    $int6$62 = makeInteger( 62 );
    $str7$__x = makeString( "&#x" );
    $str8$_ = makeString( ";" );
    $sym9$STRINGP = makeSymbol( "STRINGP" );
    $kw10$NBSP = makeKeyword( "NBSP" );
    $float11$0_5 = makeDouble( 0.5 );
    $sym12$CB_FORM = makeSymbol( "CB-FORM" );
    $int13$128 = makeInteger( 128 );
    $str14$__A_ = makeString( "|~A|" );
    $kw15$EOF = makeKeyword( "EOF" );
    $str16$__x_x_ = makeString( "&#x~x;" );
    $str17$______i__ = makeString( " ... <i>(" );
    $str18$_characters_total___i_ = makeString( " characters total)</i>" );
    $sym19$MIN = makeSymbol( "MIN" );
    $sym20$NULL = makeSymbol( "NULL" );
    $sym21$EL_VARIABLE_CHAR_ = makeSymbol( "EL-VARIABLE-CHAR?" );
    $sym22$STRING_ = makeSymbol( "STRING=" );
    $str23$_ = makeString( "<" );
    $str24$_ = makeString( "/" );
    $str25$_ = makeString( ">" );
    $str26$code = makeString( "code" );
    $str27$pre = makeString( "pre" );
    $sym28$HTML_LINK_TO_OWL_URI = makeSymbol( "HTML-LINK-TO-OWL-URI" );
    $sym29$HTML_LINK_TO_OWL_OPENCYC_URI = makeSymbol( "HTML-LINK-TO-OWL-OPENCYC-URI" );
    $sym30$OPENCYC_HTML_CYCL_STRING = makeSymbol( "OPENCYC-HTML-CYCL-STRING" );
    $kw31$TEST = makeKeyword( "TEST" );
    $kw32$OWNER = makeKeyword( "OWNER" );
    $kw33$CLASSES = makeKeyword( "CLASSES" );
    $kw34$KB = makeKeyword( "KB" );
    $kw35$FULL = makeKeyword( "FULL" );
    $kw36$WORKING_ = makeKeyword( "WORKING?" );
    $list37 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "#$rdfs:label is" ) ), makeString(
        "<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is" ) ), ConsesLow.list( ConsesLow.list( makeString(
            "#$rdfs:label is #$owl:NONSENSE http://www.w3.org/2000/01/rdf-schema#label" ) ), makeString(
                "<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is <font color=\"#ff0000\">#$owl:NONSENSE</font> <a href= \"http://www.w3.org/2000/01/rdf-schema#label\">http://www.w3.org/2000/01/rdf-schema#label</a>" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "This is a <code>META-VARIABLE</code>." ) ), makeString( "This is a <code><b>META-VARIABLE</b></code>." ) ), ConsesLow.list( ConsesLow.list( makeString(
          "This is not a META-VARIABLE." ) ), makeString( "This is not a META-VARIABLE." ) ), ConsesLow.list( ConsesLow.list( makeString( "<code>(#$isa #$Emu THING)</code>." ) ), makeString(
              "<code>(<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvViBBJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">isa</a> <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a> <b>THING</b>)</code>." ) ),
      ConsesLow.list( ConsesLow.list( makeString( "Bert is an #$Emu." ) ), makeString( "Bert is an <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>." ) ),
      ConsesLow.list( ConsesLow.list( makeString( "Please link to http://www.cyc.com." ) ), makeString( "Please link to <a href= \"http://www.cyc.com\">http://www.cyc.com</a>." ) ), ConsesLow.list( ConsesLow.list(
          makeString( "#$Emus are kind and gentle creatures." ) ), makeString(
              "<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>s are kind and gentle creatures." ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                  constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "The #$FamousHuman artist known as &u99AC;&u53CB;&u53CB;." ) ) ), makeString(
                      "The <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvVjma5wpEbGdrcN5Y29ycA\" class=\"cyc_term\">FamousHuman</a> artist known as &#x99AC;&#x53CB;&#x53CB;." ) ), ConsesLow.list( ConsesLow
                          .list( makeString( "Blake loves <code>code</code>, but hates <CODE>code</CODE> unless there's a <code>#$Person</code> in it." ) ), makeString(
                              "Blake loves <code>code</code>, but hates <CODE>code</CODE> unless there's a <code><a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvViAkpwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Person</a></code> in it." ) ),
      ConsesLow.list( ConsesLow.list( makeString( "S" ) ), makeString( "S" ) )
    } );
    $kw38$RED = makeKeyword( "RED" );
    $str39$_A = makeString( "~A" );
    $str40$_ = makeString( "(" );
    $str41$_ = makeString( " " );
    $str42$___ = makeString( " . " );
    $str43$_ = makeString( ")" );
    $str44$___ = makeString( "-_." );
    $str45$__C_C = makeString( "%~C~C" );
    $str46$_ = makeString( "=" );
    $str47$ = makeString( "" );
    $str48$background_color_ = makeString( "background-color:" );
    $list49 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeKeyword( "TOP" ), makeString( "top" ) ), ConsesLow.cons( makeKeyword( "MIDDLE" ), makeString( "middle" ) ), ConsesLow.cons( makeKeyword( "BOTTOM" ),
        makeString( "bottom" ) ), ConsesLow.cons( makeKeyword( "LEFT" ), makeString( "left" ) ), ConsesLow.cons( makeKeyword( "CENTER" ), makeString( "center" ) ), ConsesLow.cons( makeKeyword( "RIGHT" ), makeString(
            "right" ) ), ConsesLow.cons( makeKeyword( "TEXTTOP" ), makeString( "top" ) ), ConsesLow.cons( makeKeyword( "ABSMIDDLE" ), makeString( "middle" ) ), ConsesLow.cons( makeKeyword( "BASELINE" ), makeString(
                "bottom" ) ), ConsesLow.cons( makeKeyword( "ABSBOTTOM" ), makeString( "bottom" ) )
    } );
    $str50$http___www_cyc_com = makeString( "http://www.cyc.com" );
    $str51$Cycorp = makeString( "Cycorp" );
    $sym52$_PROPRIETARITY_MESSAGE_ = makeSymbol( "*PROPRIETARITY-MESSAGE*" );
    $str53$copyright = makeString( "copyright" );
    $str54$Copyright__copy__1995____A_ = makeString( "Copyright &copy; 1995 - ~A " );
    $str55$___All_rights_reserved___ = makeString( ".  All rights reserved.  " );
    $kw56$CYC_LOGO_SMALL_VIOLET_FULL_URL = makeKeyword( "CYC-LOGO-SMALL-VIOLET-FULL-URL" );
    $str57$cyc_logo_violet_16_gif = makeString( "cyc-logo-violet-16.gif" );
    $kw58$CYC_LOGO_LARGE_VIOLET_FULL_URL = makeKeyword( "CYC-LOGO-LARGE-VIOLET-FULL-URL" );
    $str59$cyc_logo_violet_60_gif = makeString( "cyc-logo-violet-60.gif" );
    $kw60$CYCORP_SYMBOL_TINY = makeKeyword( "CYCORP-SYMBOL-TINY" );
    $str61$cyc_logo_tiny_gif = makeString( "cyc-logo-tiny.gif" );
    $kw62$CYCORP_SYMBOL_SMALL = makeKeyword( "CYCORP-SYMBOL-SMALL" );
    $str63$cyc_logo_sm_gif = makeString( "cyc-logo-sm.gif" );
    $kw64$CYCORP_SYMBOL_MEDIUM = makeKeyword( "CYCORP-SYMBOL-MEDIUM" );
    $str65$cyc_logo_10_t_gif = makeString( "cyc-logo-10-t.gif" );
    $kw66$CYCORP_LOGO_MEDIUM = makeKeyword( "CYCORP-LOGO-MEDIUM" );
    $str67$cyc_logo_25_t_gif = makeString( "cyc-logo-25-t.gif" );
    $kw68$CYCORP_LOGO_BIG = makeKeyword( "CYCORP-LOGO-BIG" );
    $str69$cyc_logo_50_t_gif = makeString( "cyc-logo-50-t.gif" );
    $str70$_URL_ = makeString( ";URL=" );
    $str71$Refresh = makeString( "Refresh" );
    $str72$Content_type = makeString( "Content-type" );
    $str73$text_html__charset_UTF_8 = makeString( "text/html; charset=UTF-8" );
    $str74$Expires = makeString( "Expires" );
    $str75$Last_Modified = makeString( "Last-Modified" );
    $str76$Cache_Control = makeString( "Cache-Control" );
    $str77$no_cache = makeString( "no-cache" );
    $list78 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "HH" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "MM" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "SS" ),
        ZERO_INTEGER ) ) );
    $list79 = ConsesLow.list( makeKeyword( "HH" ), makeKeyword( "MM" ), makeKeyword( "SS" ) );
    $kw80$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw81$HH = makeKeyword( "HH" );
    $kw82$MM = makeKeyword( "MM" );
    $kw83$SS = makeKeyword( "SS" );
    $sym84$HTML_WEBPAGE_EXPIRES = makeSymbol( "HTML-WEBPAGE-EXPIRES" );
    $list85 = ConsesLow.list( makeSymbol( "HTML-META-EXPIRES" ) );
    $sym86$HTML_META_EXPIRES = makeSymbol( "HTML-META-EXPIRES" );
    $list87 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "UNIV-TIME" ), ConsesLow.list( makeSymbol( "GET-UNIVERSAL-TIME" ) ) ) );
    $sym88$HTML_WEBPAGE_LAST_MODIFIED = makeSymbol( "HTML-WEBPAGE-LAST-MODIFIED" );
    $list89 = ConsesLow.list( makeSymbol( "HTML-META-LAST-MODIFIED" ) );
    $sym90$HTML_META_LAST_MODIFIED = makeSymbol( "HTML-META-LAST-MODIFIED" );
    $sym91$HTML_DONT_CACHE_WEBPAGE = makeSymbol( "HTML-DONT-CACHE-WEBPAGE" );
    $list92 = ConsesLow.list( makeSymbol( "HTML-META-DONT-CACHE" ) );
    $str93$ROBOTS = makeString( "ROBOTS" );
    $str94$NOINDEX__NOFOLLOW = makeString( "NOINDEX, NOFOLLOW" );
    $str95$INDEX__FOLLOW = makeString( "INDEX, FOLLOW" );
    $str96$NOINDEX__FOLLOW = makeString( "NOINDEX, FOLLOW" );
    $str97$INDEX__NOFOLLOW = makeString( "INDEX, NOFOLLOW" );
    $str98$Invalid_HTML_meta_select_robot_in = makeString( "Invalid HTML meta select robot instruction." );
    $str99$Reset_All_Fields = makeString( "Reset All Fields" );
    $str100$autocomplete_ = makeString( "autocomplete-" );
    $str101$input_ = makeString( "input-" );
    $str102$autocomplete_results_ = makeString( "autocomplete-results-" );
    $str103$position_static__width_auto_ = makeString( "position:static; width:auto " );
    $str104$yui_ac = makeString( "yui-ac" );
    $str105$yui_ac_input = makeString( "yui-ac-input" );
    $str106$yui_ac_container = makeString( "yui-ac-container" );
    $list107 = ConsesLow.list( makeSymbol( "SRC" ), makeSymbol( "NAME" ), makeSymbol( "DEFAULT" ), makeSymbol( "MAP" ) );
    $list108 = ConsesLow.list( makeSymbol( "SRC" ), makeSymbol( "NAME" ), makeSymbol( "DEFAULT" ), makeSymbol( "MAP-ITEMS" ) );
    $str109$_x = makeString( ".x" );
    $str110$_y = makeString( ".y" );
    $list111 = ConsesLow.list( makeSymbol( "X-RANGE" ), makeSymbol( "Y-RANGE" ), makeSymbol( "VALUE" ) );
    $list112 = ConsesLow.list( makeSymbol( "ARG-NAME" ), makeSymbol( "VALUE" ) );
    $kw113$LEXICON = makeKeyword( "LEXICON" );
    $int114$100 = makeInteger( 100 );
    $sym115$INTEGERP = makeSymbol( "INTEGERP" );
    $list116 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "SOFAR" ), makeSymbol( "TOTAL" ), makeSymbol( "WIDTH" ), ConsesLow.list( makeSymbol( "HEIGHT" ), TWO_INTEGER ), ConsesLow.list( makeSymbol(
        "PROGRESS-COLOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*HTML-COLOR-SAT-GREEN*" ) ) ), ConsesLow.list( makeSymbol( "REMAINING-COLOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "*HTML-COLOR-SAT-RED*" ) ) ), ConsesLow.list( makeSymbol( "BORDER" ), ZERO_INTEGER ) );
    $list117 = ConsesLow.list( makeKeyword( "SOFAR" ), makeKeyword( "TOTAL" ), makeKeyword( "WIDTH" ), makeKeyword( "HEIGHT" ), makeKeyword( "PROGRESS-COLOR" ), makeKeyword( "REMAINING-COLOR" ), makeKeyword(
        "BORDER" ) );
    $kw118$SOFAR = makeKeyword( "SOFAR" );
    $kw119$TOTAL = makeKeyword( "TOTAL" );
    $kw120$WIDTH = makeKeyword( "WIDTH" );
    $kw121$HEIGHT = makeKeyword( "HEIGHT" );
    $kw122$PROGRESS_COLOR = makeKeyword( "PROGRESS-COLOR" );
    $sym123$_HTML_COLOR_SAT_GREEN_ = makeSymbol( "*HTML-COLOR-SAT-GREEN*" );
    $kw124$REMAINING_COLOR = makeKeyword( "REMAINING-COLOR" );
    $sym125$_HTML_COLOR_SAT_RED_ = makeSymbol( "*HTML-COLOR-SAT-RED*" );
    $kw126$BORDER = makeKeyword( "BORDER" );
    $sym127$WIDTH1 = makeUninternedSymbol( "WIDTH1" );
    $sym128$WIDTH2 = makeUninternedSymbol( "WIDTH2" );
    $sym129$HTML_FANCY_TABLE = makeSymbol( "HTML-FANCY-TABLE" );
    $list130 = ConsesLow.list( makeKeyword( "CELLSPACING" ), ZERO_INTEGER, makeKeyword( "CELLPADDING" ), ZERO_INTEGER );
    $sym131$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym132$HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS = makeSymbol( "HTML-FANCY-PERCENT-PROGRESS-BAR-WIDTHS" );
    $sym133$HTML_FANCY_TABLE_ROW = makeSymbol( "HTML-FANCY-TABLE-ROW" );
    $sym134$HTML_FANCY_TABLE_DATA = makeSymbol( "HTML-FANCY-TABLE-DATA" );
    $kw135$BGCOLOR = makeKeyword( "BGCOLOR" );
    $sym136$HTML_FANCY_PERCENT_PROGRESS_BAR = makeSymbol( "HTML-FANCY-PERCENT-PROGRESS-BAR" );
    $sym137$NUMBERP = makeSymbol( "NUMBERP" );
    $int138$1000 = makeInteger( 1000 );
    $kw139$RIGHT = makeKeyword( "RIGHT" );
    $kw140$TOP = makeKeyword( "TOP" );
    $str141$Run_Time__ = makeString( "Run Time :" );
    $str142$Elapsed_Time__ = makeString( "Elapsed Time :" );
    $kw143$LEFT = makeKeyword( "LEFT" );
    $str144$Current_Total__ = makeString( "Current Total :" );
    $str145$_of_ = makeString( " of " );
    $kw146$CENTER = makeKeyword( "CENTER" );
    $str147$_D_ = makeString( "~D%" );
    $str148$_No_data_to_graph_ = makeString( "[No data to graph]" );
    $sym149$MAX = makeSymbol( "MAX" );
    $sym150$SECOND = makeSymbol( "SECOND" );
    $str151$100_ = makeString( "100%" );
    $str152$1_ = makeString( "1%" );
    $str153$_ = makeString( "%" );
    $str154$5_ = makeString( "5%" );
    $str155$95_ = makeString( "95%" );
    $str156$__D = makeString( "~:D" );
    $sym157$SYMBOLP = makeSymbol( "SYMBOLP" );
    $kw158$FANCY_NAME = makeKeyword( "FANCY-NAME" );
    $kw159$DESCRIPTION = makeKeyword( "DESCRIPTION" );
    $kw160$SETTINGS_SPEC = makeKeyword( "SETTINGS-SPEC" );
    $list161 = ConsesLow.list( ConsesLow.list( makeKeyword( "ENTRY" ), makeSymbol( "TRUE" ), makeString( "Value" ) ) );
    $kw162$ENTRY = makeKeyword( "ENTRY" );
    $sym163$FIRST = makeSymbol( "FIRST" );
    $list164 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "DATUM" ), makeSymbol( "POSSIBILITY-FANCY-NAME" ) );
    $list165 = ConsesLow.list( makeKeyword( "TEXT" ), NIL );
    $list166 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "SIZE" ) );
    $kw167$TEXT = makeKeyword( "TEXT" );
    $str168$The_value_entered_for__ = makeString( "The value entered for '" );
    $str169$__was_not_valid_ = makeString( "' was not valid." );
    $str170$No_value_was_entered_for__ = makeString( "No value was entered for '" );
    $str171$__ = makeString( "'." );
    $str172$No_choice_was_made_for__ = makeString( "No choice was made for '" );
    $str173$_is_not_a_declared_control_parame = makeString( " is not a declared control parameter" );
    $sym174$CSETQ = makeSymbol( "CSETQ" );
    $sym175$QUOTE = makeSymbol( "QUOTE" );
    $str176$entry_ = makeString( "entry-" );
    $str177$radio_ = makeString( "radio-" );
    $sym178$LISTP = makeSymbol( "LISTP" );
    $sym179$MATCHING_HTML_FIELD = makeSymbol( "MATCHING-HTML-FIELD" );
    $sym180$DIGIT_CHAR_P = makeSymbol( "DIGIT-CHAR-P" );
    $kw181$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym182$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $kw183$DEFAULT = makeKeyword( "DEFAULT" );
    $sym184$_EXIT = makeSymbol( "%EXIT" );
    $sym185$MATCHING_HTML_BUTTON_FIELD = makeSymbol( "MATCHING-HTML-BUTTON-FIELD" );
    $str186$en = makeString( "en" );
    $const187$EnglishLanguage = constant_handles.reader_make_constant_shell( makeString( "EnglishLanguage" ) );
    $str188$en_gb = makeString( "en-gb" );
    $const189$BritishEnglishDialect = constant_handles.reader_make_constant_shell( makeString( "BritishEnglishDialect" ) );
    $str190$fr = makeString( "fr" );
    $const191$FrenchLanguage = constant_handles.reader_make_constant_shell( makeString( "FrenchLanguage" ) );
    $str192$de = makeString( "de" );
    $const193$GermanLanguage = constant_handles.reader_make_constant_shell( makeString( "GermanLanguage" ) );
    $const194$languageCodeDigraph = constant_handles.reader_make_constant_shell( makeString( "languageCodeDigraph" ) );
    $kw195$HTML_GLYPH = makeKeyword( "HTML-GLYPH" );
    $kw196$LT = makeKeyword( "LT" );
    $str197$_lt_ = makeString( "&lt;" );
    $kw198$GT = makeKeyword( "GT" );
    $str199$_gt_ = makeString( "&gt;" );
    $kw200$AMP = makeKeyword( "AMP" );
    $str201$_amp_ = makeString( "&amp;" );
    $kw202$QUOT = makeKeyword( "QUOT" );
    $str203$_quot_ = makeString( "&quot;" );
    $kw204$REG = makeKeyword( "REG" );
    $str205$_reg_ = makeString( "&reg;" );
    $kw206$COPY = makeKeyword( "COPY" );
    $str207$_copy_ = makeString( "&copy;" );
    $str208$_nbsp_ = makeString( "&nbsp;" );
    $kw209$EMSP = makeKeyword( "EMSP" );
    $str210$_emsp_ = makeString( "&emsp;" );
    $kw211$ENSP = makeKeyword( "ENSP" );
    $str212$_ensp_ = makeString( "&ensp;" );
    $kw213$SPACE = makeKeyword( "SPACE" );
    $str214$__X0020_ = makeString( "&#X0020;" );
    $kw215$EM_SPACE = makeKeyword( "EM-SPACE" );
    $str216$__X2003_ = makeString( "&#X2003;" );
    $kw217$EN_SPACE = makeKeyword( "EN-SPACE" );
    $str218$__X2002_ = makeString( "&#X2002;" );
    $kw219$TWO_PER_EM_SPACE = makeKeyword( "TWO-PER-EM-SPACE" );
    $kw220$THREE_PER_EM_SPACE = makeKeyword( "THREE-PER-EM-SPACE" );
    $str221$__X2004_ = makeString( "&#X2004;" );
    $kw222$FOUR_PER_EM_SPACE = makeKeyword( "FOUR-PER-EM-SPACE" );
    $str223$__X2005_ = makeString( "&#X2005;" );
    $kw224$SIX_PER_EM_SPACE = makeKeyword( "SIX-PER-EM-SPACE" );
    $str225$__X2006_ = makeString( "&#X2006;" );
    $kw226$THIN_SPACE = makeKeyword( "THIN-SPACE" );
    $str227$__X2009_ = makeString( "&#X2009;" );
    $kw228$HAIR_SPACE = makeKeyword( "HAIR-SPACE" );
    $str229$__X200A_ = makeString( "&#X200A;" );
    $kw230$IEXCL = makeKeyword( "IEXCL" );
    $str231$_iexcl_ = makeString( "&iexcl;" );
    $kw232$CENT = makeKeyword( "CENT" );
    $str233$_cent_ = makeString( "&cent;" );
    $kw234$POUND = makeKeyword( "POUND" );
    $str235$_pound_ = makeString( "&pound;" );
    $kw236$CURREN = makeKeyword( "CURREN" );
    $str237$_curren_ = makeString( "&curren;" );
    $kw238$YEN = makeKeyword( "YEN" );
    $str239$_yen_ = makeString( "&yen;" );
    $kw240$BRVBAR = makeKeyword( "BRVBAR" );
    $str241$_brvba_ = makeString( "&brvba;" );
    $kw242$SECT = makeKeyword( "SECT" );
    $str243$_sect_ = makeString( "&sect;" );
    $kw244$UML = makeKeyword( "UML" );
    $str245$_uml_ = makeString( "&uml;" );
    $kw246$ORDF = makeKeyword( "ORDF" );
    $str247$_ordf_ = makeString( "&ordf;" );
    $kw248$LAQUO = makeKeyword( "LAQUO" );
    $str249$_laquo_ = makeString( "&laquo;" );
    $kw250$NOT = makeKeyword( "NOT" );
    $str251$_not_ = makeString( "&not;" );
    $kw252$SHY = makeKeyword( "SHY" );
    $str253$_shy_ = makeString( "&shy;" );
    $kw254$MACR = makeKeyword( "MACR" );
    $str255$_macr_ = makeString( "&macr;" );
    $kw256$DEG = makeKeyword( "DEG" );
    $str257$_deg_ = makeString( "&deg;" );
    $kw258$PLUSMN = makeKeyword( "PLUSMN" );
    $str259$_plusmn_ = makeString( "&plusmn;" );
    $kw260$SUP2 = makeKeyword( "SUP2" );
    $str261$_sup2_ = makeString( "&sup2;" );
    $kw262$SUP3 = makeKeyword( "SUP3" );
    $str263$_sup3_ = makeString( "&sup3;" );
    $kw264$ACUTE = makeKeyword( "ACUTE" );
    $str265$_acute_ = makeString( "&acute;" );
    $kw266$MICRO = makeKeyword( "MICRO" );
    $str267$_micro_ = makeString( "&micro;" );
    $kw268$PARA = makeKeyword( "PARA" );
    $str269$_para_ = makeString( "&para;" );
    $kw270$MIDDOT = makeKeyword( "MIDDOT" );
    $str271$_middoy_ = makeString( "&middoy;" );
    $kw272$CEDIL = makeKeyword( "CEDIL" );
    $str273$_cedil_ = makeString( "&cedil;" );
    $kw274$SUP1 = makeKeyword( "SUP1" );
    $str275$_sup1_ = makeString( "&sup1;" );
    $kw276$ORDM = makeKeyword( "ORDM" );
    $str277$_ordm_ = makeString( "&ordm;" );
    $kw278$RAQUO = makeKeyword( "RAQUO" );
    $str279$_raquo_ = makeString( "&raquo;" );
    $kw280$FRAC14 = makeKeyword( "FRAC14" );
    $str281$_frac14_ = makeString( "&frac14;" );
    $kw282$FRAC12 = makeKeyword( "FRAC12" );
    $str283$_frac12_ = makeString( "&frac12;" );
    $kw284$FRAC34 = makeKeyword( "FRAC34" );
    $str285$_frac34_ = makeString( "&frac34;" );
    $kw286$IQUEST = makeKeyword( "IQUEST" );
    $str287$_iquest_ = makeString( "&iquest;" );
    $kw288$AGRAVE_CAP = makeKeyword( "AGRAVE-CAP" );
    $str289$_Agrave_ = makeString( "&Agrave;" );
    $kw290$AACUTE_CAP = makeKeyword( "AACUTE-CAP" );
    $str291$_Aacute_ = makeString( "&Aacute;" );
    $kw292$ACIRC_CAP = makeKeyword( "ACIRC-CAP" );
    $str293$_Acirc_ = makeString( "&Acirc;" );
    $kw294$ATILDE_CAP = makeKeyword( "ATILDE-CAP" );
    $str295$_Atilde_ = makeString( "&Atilde;" );
    $kw296$AUML_CAP = makeKeyword( "AUML-CAP" );
    $str297$_Auml_ = makeString( "&Auml;" );
    $kw298$ARING_CAP = makeKeyword( "ARING-CAP" );
    $str299$_Aring_ = makeString( "&Aring;" );
    $kw300$AELIG_CAP = makeKeyword( "AELIG-CAP" );
    $str301$_AElig_ = makeString( "&AElig;" );
    $kw302$CCEDIL_CAP = makeKeyword( "CCEDIL-CAP" );
    $str303$_Ccedil_ = makeString( "&Ccedil;" );
    $kw304$EGRAVE_CAP = makeKeyword( "EGRAVE-CAP" );
    $str305$_Egrave_ = makeString( "&Egrave;" );
    $kw306$EACUTE_CAP = makeKeyword( "EACUTE-CAP" );
    $str307$_Eacute_ = makeString( "&Eacute;" );
    $kw308$ECIRC_CAP = makeKeyword( "ECIRC-CAP" );
    $str309$_Ecirc_ = makeString( "&Ecirc;" );
    $kw310$EUML_CAP = makeKeyword( "EUML-CAP" );
    $str311$_Euml_ = makeString( "&Euml;" );
    $kw312$IGRAVE_CAP = makeKeyword( "IGRAVE-CAP" );
    $str313$_Igrave_ = makeString( "&Igrave;" );
    $kw314$IACUTE_CAP = makeKeyword( "IACUTE-CAP" );
    $str315$_Iacute_ = makeString( "&Iacute;" );
    $kw316$ICIRC_CAP = makeKeyword( "ICIRC-CAP" );
    $str317$_Icirc_ = makeString( "&Icirc;" );
    $kw318$IUML_CAP = makeKeyword( "IUML-CAP" );
    $str319$_Iuml_ = makeString( "&Iuml;" );
    $kw320$ETH_CAP = makeKeyword( "ETH-CAP" );
    $str321$_ETH_ = makeString( "&ETH;" );
    $kw322$NTILDE_CAP = makeKeyword( "NTILDE-CAP" );
    $str323$_Ntilde_ = makeString( "&Ntilde;" );
    $kw324$OGRAVE_CAP = makeKeyword( "OGRAVE-CAP" );
    $str325$_Ograve_ = makeString( "&Ograve;" );
    $kw326$OACUTE_CAP = makeKeyword( "OACUTE-CAP" );
    $str327$_Oacute_ = makeString( "&Oacute;" );
    $kw328$OCIRC_CAP = makeKeyword( "OCIRC-CAP" );
    $str329$_Ocirc_ = makeString( "&Ocirc;" );
    $kw330$OTILDE_CAP = makeKeyword( "OTILDE-CAP" );
    $str331$_Otilde_ = makeString( "&Otilde;" );
    $kw332$OUML_CAP = makeKeyword( "OUML-CAP" );
    $str333$_Ouml_ = makeString( "&Ouml;" );
    $kw334$TIMES = makeKeyword( "TIMES" );
    $str335$_times_ = makeString( "&times;" );
    $kw336$OSLASH_CAP = makeKeyword( "OSLASH-CAP" );
    $str337$_Oslash_ = makeString( "&Oslash;" );
    $kw338$UGRAVE_CAP = makeKeyword( "UGRAVE-CAP" );
    $str339$_Ugrave_ = makeString( "&Ugrave;" );
    $kw340$UACUTE_CAP = makeKeyword( "UACUTE-CAP" );
    $str341$_Uacute_ = makeString( "&Uacute;" );
    $kw342$UCIRC_CAP = makeKeyword( "UCIRC-CAP" );
    $str343$_Ucirc_ = makeString( "&Ucirc;" );
    $kw344$UUML_CAP = makeKeyword( "UUML-CAP" );
    $str345$_Uuml_ = makeString( "&Uuml;" );
    $kw346$YACUTE_CAP = makeKeyword( "YACUTE-CAP" );
    $str347$_Yacute_ = makeString( "&Yacute;" );
    $kw348$THORN_CAP = makeKeyword( "THORN-CAP" );
    $str349$_THORN_ = makeString( "&THORN;" );
    $kw350$SZLIG = makeKeyword( "SZLIG" );
    $str351$_szlig_ = makeString( "&szlig;" );
    $kw352$AGRAVE = makeKeyword( "AGRAVE" );
    $str353$_agrave_ = makeString( "&agrave;" );
    $kw354$AACUTE = makeKeyword( "AACUTE" );
    $str355$_aacute_ = makeString( "&aacute;" );
    $kw356$ACIRC = makeKeyword( "ACIRC" );
    $str357$_acirc_ = makeString( "&acirc;" );
    $kw358$ATILDE = makeKeyword( "ATILDE" );
    $str359$_atilde_ = makeString( "&atilde;" );
    $kw360$AUML = makeKeyword( "AUML" );
    $str361$_auml_ = makeString( "&auml;" );
    $kw362$ARING = makeKeyword( "ARING" );
    $str363$_aring_ = makeString( "&aring;" );
    $kw364$AELIG = makeKeyword( "AELIG" );
    $str365$_aelig_ = makeString( "&aelig;" );
    $kw366$CCEDIL = makeKeyword( "CCEDIL" );
    $str367$_ccedil_ = makeString( "&ccedil;" );
    $kw368$EGRAVE = makeKeyword( "EGRAVE" );
    $str369$_egrave_ = makeString( "&egrave;" );
    $kw370$EACUTE = makeKeyword( "EACUTE" );
    $str371$_eacute_ = makeString( "&eacute;" );
    $kw372$ECIRC = makeKeyword( "ECIRC" );
    $str373$_ecirc_ = makeString( "&ecirc;" );
    $kw374$EUML = makeKeyword( "EUML" );
    $str375$_euml_ = makeString( "&euml;" );
    $kw376$IGRAVE = makeKeyword( "IGRAVE" );
    $str377$_igrave_ = makeString( "&igrave;" );
    $kw378$IACUTE = makeKeyword( "IACUTE" );
    $str379$_iacute_ = makeString( "&iacute;" );
    $kw380$ICIRC = makeKeyword( "ICIRC" );
    $str381$_icirc_ = makeString( "&icirc;" );
    $kw382$IUML = makeKeyword( "IUML" );
    $str383$_iuml_ = makeString( "&iuml;" );
    $kw384$ETH = makeKeyword( "ETH" );
    $str385$_eth_ = makeString( "&eth;" );
    $kw386$NTILDE = makeKeyword( "NTILDE" );
    $str387$_ntilde_ = makeString( "&ntilde;" );
    $kw388$OGRAVE = makeKeyword( "OGRAVE" );
    $str389$_ograve_ = makeString( "&ograve;" );
    $kw390$OACUTE = makeKeyword( "OACUTE" );
    $str391$_oacute_ = makeString( "&oacute;" );
    $kw392$OCIRC = makeKeyword( "OCIRC" );
    $str393$_ocirc_ = makeString( "&ocirc;" );
    $kw394$OTILDE = makeKeyword( "OTILDE" );
    $str395$_otilde_ = makeString( "&otilde;" );
    $kw396$OUML = makeKeyword( "OUML" );
    $str397$_ouml_ = makeString( "&ouml;" );
    $kw398$DIVIDE = makeKeyword( "DIVIDE" );
    $str399$_divide_ = makeString( "&divide;" );
    $kw400$OSLASH = makeKeyword( "OSLASH" );
    $str401$_oslash_ = makeString( "&oslash;" );
    $kw402$UGRAVE = makeKeyword( "UGRAVE" );
    $str403$_ugrave_ = makeString( "&ugrave;" );
    $kw404$UACUTE = makeKeyword( "UACUTE" );
    $str405$_uacute_ = makeString( "&uacute;" );
    $kw406$UCIRC = makeKeyword( "UCIRC" );
    $str407$_ucirc_ = makeString( "&ucirc;" );
    $kw408$UUML = makeKeyword( "UUML" );
    $str409$_uuml_ = makeString( "&uuml;" );
    $kw410$YACUTE = makeKeyword( "YACUTE" );
    $str411$_yacute_ = makeString( "&yacute;" );
    $kw412$THORN = makeKeyword( "THORN" );
    $str413$_thorn_ = makeString( "&thorn;" );
    $kw414$YUML = makeKeyword( "YUML" );
    $str415$_yuml_ = makeString( "&yuml;" );
    $kw416$FNOF = makeKeyword( "FNOF" );
    $str417$_fnof_ = makeString( "&fnof;" );
    $kw418$ALPHA_CAP = makeKeyword( "ALPHA-CAP" );
    $str419$_Alpha_ = makeString( "&Alpha;" );
    $kw420$BETA_CAP = makeKeyword( "BETA-CAP" );
    $str421$_Beta_ = makeString( "&Beta;" );
    $kw422$GAMMA_CAP = makeKeyword( "GAMMA-CAP" );
    $str423$_Gamma_ = makeString( "&Gamma;" );
    $kw424$DELTA_CAP = makeKeyword( "DELTA-CAP" );
    $str425$_Delta_ = makeString( "&Delta;" );
    $kw426$EPSILON_CAP = makeKeyword( "EPSILON-CAP" );
    $str427$_Epsilon_ = makeString( "&Epsilon;" );
    $kw428$ZETA_CAP = makeKeyword( "ZETA-CAP" );
    $str429$_Zeta_ = makeString( "&Zeta;" );
    $kw430$ETA_CAP = makeKeyword( "ETA-CAP" );
    $str431$_Eta_ = makeString( "&Eta;" );
    $kw432$THETA_CAP = makeKeyword( "THETA-CAP" );
    $str433$_Theta_ = makeString( "&Theta;" );
    $kw434$IOTA_CAP = makeKeyword( "IOTA-CAP" );
    $str435$_Iota_ = makeString( "&Iota;" );
    $kw436$KAPPA_CAP = makeKeyword( "KAPPA-CAP" );
    $str437$_Kappa_ = makeString( "&Kappa;" );
    $kw438$LAMBDA_CAP = makeKeyword( "LAMBDA-CAP" );
    $str439$_Lambda_ = makeString( "&Lambda;" );
    $kw440$MU_CAP = makeKeyword( "MU-CAP" );
    $str441$_Mu_ = makeString( "&Mu;" );
    $kw442$NU_CAP = makeKeyword( "NU-CAP" );
    $str443$_Nu_ = makeString( "&Nu;" );
    $kw444$XI_CAP = makeKeyword( "XI-CAP" );
    $str445$_Xi_ = makeString( "&Xi;" );
    $kw446$OMICRON_CAP = makeKeyword( "OMICRON-CAP" );
    $str447$_Omicron_ = makeString( "&Omicron;" );
    $kw448$PI_CAP = makeKeyword( "PI-CAP" );
    $str449$_Pi_ = makeString( "&Pi;" );
    $kw450$RHO_CAP = makeKeyword( "RHO-CAP" );
    $str451$_Rho_ = makeString( "&Rho;" );
    $kw452$SIGMA_CAP = makeKeyword( "SIGMA-CAP" );
    $str453$_Sigma_ = makeString( "&Sigma;" );
    $kw454$TAU_CAP = makeKeyword( "TAU-CAP" );
    $str455$_Tau_ = makeString( "&Tau;" );
    $kw456$UPSILON_CAP = makeKeyword( "UPSILON-CAP" );
    $str457$_Upsilon_ = makeString( "&Upsilon;" );
    $kw458$PHI_CAP = makeKeyword( "PHI-CAP" );
    $str459$_Phi_ = makeString( "&Phi;" );
    $kw460$CHI_CAP = makeKeyword( "CHI-CAP" );
    $str461$_Chi_ = makeString( "&Chi;" );
    $kw462$PSI_CAP = makeKeyword( "PSI-CAP" );
    $str463$_Psi_ = makeString( "&Psi;" );
    $kw464$OMEGA_CAP = makeKeyword( "OMEGA-CAP" );
    $str465$_Omega_ = makeString( "&Omega;" );
    $kw466$ALPHA = makeKeyword( "ALPHA" );
    $str467$_alpha_ = makeString( "&alpha;" );
    $kw468$BETA = makeKeyword( "BETA" );
    $str469$_beta_ = makeString( "&beta;" );
    $kw470$GAMMA = makeKeyword( "GAMMA" );
    $str471$_gamma_ = makeString( "&gamma;" );
    $kw472$DELTA = makeKeyword( "DELTA" );
    $str473$_delta_ = makeString( "&delta;" );
    $kw474$EPSILON = makeKeyword( "EPSILON" );
    $str475$_epsilon_ = makeString( "&epsilon;" );
    $kw476$ZETA = makeKeyword( "ZETA" );
    $str477$_zeta_ = makeString( "&zeta;" );
    $kw478$ETA = makeKeyword( "ETA" );
    $str479$_eta_ = makeString( "&eta;" );
    $kw480$THETA = makeKeyword( "THETA" );
    $str481$_theta_ = makeString( "&theta;" );
    $kw482$IOTA = makeKeyword( "IOTA" );
    $str483$_iota_ = makeString( "&iota;" );
    $kw484$KAPPA = makeKeyword( "KAPPA" );
    $str485$_kappa_ = makeString( "&kappa;" );
    $kw486$LAMBDA = makeKeyword( "LAMBDA" );
    $str487$_lambda_ = makeString( "&lambda;" );
    $kw488$MU = makeKeyword( "MU" );
    $str489$_mu_ = makeString( "&mu;" );
    $kw490$NU = makeKeyword( "NU" );
    $str491$_nu_ = makeString( "&nu;" );
    $kw492$XI = makeKeyword( "XI" );
    $str493$_xi_ = makeString( "&xi;" );
    $kw494$OMICRON = makeKeyword( "OMICRON" );
    $str495$_omicron_ = makeString( "&omicron;" );
    $kw496$PI = makeKeyword( "PI" );
    $str497$_pi_ = makeString( "&pi;" );
    $kw498$RHO = makeKeyword( "RHO" );
    $str499$_rho_ = makeString( "&rho;" );
    $kw500$SIGMAF = makeKeyword( "SIGMAF" );
    $str501$_sigmaf_ = makeString( "&sigmaf;" );
    $kw502$SIGMA = makeKeyword( "SIGMA" );
    $str503$_sigma_ = makeString( "&sigma;" );
    $kw504$TAU = makeKeyword( "TAU" );
    $str505$_tau_ = makeString( "&tau;" );
    $kw506$UPSILON = makeKeyword( "UPSILON" );
    $str507$_upsilon_ = makeString( "&upsilon;" );
    $kw508$PHI = makeKeyword( "PHI" );
    $str509$_phi_ = makeString( "&phi;" );
    $kw510$CHI = makeKeyword( "CHI" );
    $str511$_chi_ = makeString( "&chi;" );
    $kw512$PSI = makeKeyword( "PSI" );
    $str513$_psi_ = makeString( "&psi;" );
    $kw514$OMEGA = makeKeyword( "OMEGA" );
    $str515$_omega_ = makeString( "&omega;" );
    $kw516$THETASYM = makeKeyword( "THETASYM" );
    $kw517$UPSIH = makeKeyword( "UPSIH" );
    $str518$_upsih_ = makeString( "&upsih;" );
    $kw519$PIV = makeKeyword( "PIV" );
    $str520$_piv_ = makeString( "&piv;" );
    $kw521$BULL = makeKeyword( "BULL" );
    $str522$_bull_ = makeString( "&bull;" );
    $kw523$HELLIP = makeKeyword( "HELLIP" );
    $str524$_hellip_ = makeString( "&hellip;" );
    $kw525$PRIME = makeKeyword( "PRIME" );
    $str526$_prime_ = makeString( "&prime;" );
    $kw527$PRIME_DBL = makeKeyword( "PRIME-DBL" );
    $str528$_Prime_ = makeString( "&Prime;" );
    $kw529$OLINE = makeKeyword( "OLINE" );
    $str530$_oline_ = makeString( "&oline;" );
    $kw531$FRASL = makeKeyword( "FRASL" );
    $str532$_frasl_ = makeString( "&frasl;" );
    $kw533$WEIERP = makeKeyword( "WEIERP" );
    $str534$_weierp_ = makeString( "&weierp;" );
    $kw535$IMAGE = makeKeyword( "IMAGE" );
    $str536$_image_ = makeString( "&image;" );
    $kw537$REAL = makeKeyword( "REAL" );
    $str538$_real_ = makeString( "&real;" );
    $kw539$TRADE = makeKeyword( "TRADE" );
    $str540$_trade_ = makeString( "&trade;" );
    $kw541$ALEFSYM = makeKeyword( "ALEFSYM" );
    $str542$_alefsym_ = makeString( "&alefsym;" );
    $kw543$UPWARDS_ARROW = makeKeyword( "UPWARDS-ARROW" );
    $str544$_uarr_ = makeString( "&uarr;" );
    $kw545$RIGHTWARDS_ARROW = makeKeyword( "RIGHTWARDS-ARROW" );
    $str546$_rarr_ = makeString( "&rarr;" );
    $kw547$LARR = makeKeyword( "LARR" );
    $str548$_larr_ = makeString( "&larr;" );
    $kw549$UARR = makeKeyword( "UARR" );
    $kw550$RARR = makeKeyword( "RARR" );
    $kw551$DARR = makeKeyword( "DARR" );
    $str552$_darr_ = makeString( "&darr;" );
    $kw553$HARR = makeKeyword( "HARR" );
    $str554$_harr_ = makeString( "&harr;" );
    $kw555$CRARR = makeKeyword( "CRARR" );
    $str556$_crarr_ = makeString( "&crarr;" );
    $kw557$LARR_DBL = makeKeyword( "LARR-DBL" );
    $str558$_lArr_ = makeString( "&lArr;" );
    $kw559$UARR_DBL = makeKeyword( "UARR-DBL" );
    $str560$_uArr_ = makeString( "&uArr;" );
    $kw561$RARR_DBL = makeKeyword( "RARR-DBL" );
    $str562$_rArr_ = makeString( "&rArr;" );
    $kw563$DARR_DBL = makeKeyword( "DARR-DBL" );
    $str564$_dArr_ = makeString( "&dArr;" );
    $kw565$HARR_DBL = makeKeyword( "HARR-DBL" );
    $str566$_hArr_ = makeString( "&hArr;" );
    $kw567$FORALL = makeKeyword( "FORALL" );
    $str568$_forall_ = makeString( "&forall;" );
    $kw569$PART = makeKeyword( "PART" );
    $str570$_part_ = makeString( "&part;" );
    $kw571$EXIST = makeKeyword( "EXIST" );
    $str572$_exist_ = makeString( "&exist;" );
    $kw573$EMPTY = makeKeyword( "EMPTY" );
    $str574$_empty_ = makeString( "&empty;" );
    $kw575$NABLA = makeKeyword( "NABLA" );
    $str576$_nabla_ = makeString( "&nabla;" );
    $kw577$ISIN = makeKeyword( "ISIN" );
    $str578$_isin_ = makeString( "&isin;" );
    $kw579$NOTIN = makeKeyword( "NOTIN" );
    $str580$_notin_ = makeString( "&notin;" );
    $kw581$NI = makeKeyword( "NI" );
    $str582$_ni_ = makeString( "&ni;" );
    $kw583$PROD = makeKeyword( "PROD" );
    $str584$_prod_ = makeString( "&prod;" );
    $kw585$SUM = makeKeyword( "SUM" );
    $str586$_sum_ = makeString( "&sum;" );
    $kw587$MINUS = makeKeyword( "MINUS" );
    $str588$_minus_ = makeString( "&minus;" );
    $kw589$LOWAST = makeKeyword( "LOWAST" );
    $str590$_lowast_ = makeString( "&lowast;" );
    $kw591$RADIC = makeKeyword( "RADIC" );
    $str592$_radic_ = makeString( "&radic;" );
    $kw593$PROP = makeKeyword( "PROP" );
    $str594$_prop_ = makeString( "&prop;" );
    $kw595$INFIN = makeKeyword( "INFIN" );
    $str596$_infin_ = makeString( "&infin;" );
    $kw597$ANG = makeKeyword( "ANG" );
    $str598$_ang_ = makeString( "&ang;" );
    $kw599$AND = makeKeyword( "AND" );
    $str600$_and_ = makeString( "&and;" );
    $kw601$OR = makeKeyword( "OR" );
    $str602$_or_ = makeString( "&or;" );
    $kw603$CAP = makeKeyword( "CAP" );
    $str604$_cap_ = makeString( "&cap;" );
    $kw605$CUP = makeKeyword( "CUP" );
    $str606$_cup_ = makeString( "&cup;" );
    $kw607$INT = makeKeyword( "INT" );
    $str608$_int_ = makeString( "&int;" );
    $kw609$THERE4 = makeKeyword( "THERE4" );
    $str610$_there4_ = makeString( "&there4;" );
    $kw611$SIM = makeKeyword( "SIM" );
    $str612$_sim_ = makeString( "&sim;" );
    $kw613$CONG = makeKeyword( "CONG" );
    $str614$_cong_ = makeString( "&cong;" );
    $kw615$ASYMP = makeKeyword( "ASYMP" );
    $str616$_asymp_ = makeString( "&asymp;" );
    $kw617$NE = makeKeyword( "NE" );
    $str618$_ne_ = makeString( "&ne;" );
    $kw619$EQUIV = makeKeyword( "EQUIV" );
    $str620$_equiv_ = makeString( "&equiv;" );
    $kw621$LE = makeKeyword( "LE" );
    $str622$_le_ = makeString( "&le;" );
    $kw623$GE = makeKeyword( "GE" );
    $str624$_ge_ = makeString( "&ge;" );
    $kw625$SUB = makeKeyword( "SUB" );
    $str626$_sub_ = makeString( "&sub;" );
    $kw627$SUP = makeKeyword( "SUP" );
    $str628$_sup_ = makeString( "&sup;" );
    $kw629$NSUB = makeKeyword( "NSUB" );
    $str630$_nsub_ = makeString( "&nsub;" );
    $kw631$SUBE = makeKeyword( "SUBE" );
    $str632$_sube_ = makeString( "&sube;" );
    $kw633$SUPE = makeKeyword( "SUPE" );
    $str634$_supe_ = makeString( "&supe;" );
    $kw635$OPLUS = makeKeyword( "OPLUS" );
    $str636$_oplus_ = makeString( "&oplus;" );
    $kw637$OTIMES = makeKeyword( "OTIMES" );
    $str638$_otimes_ = makeString( "&otimes;" );
    $kw639$PERP = makeKeyword( "PERP" );
    $str640$_perp_ = makeString( "&perp;" );
    $kw641$SDOT = makeKeyword( "SDOT" );
    $str642$_sdot_ = makeString( "&sdot;" );
    $kw643$LCEIL = makeKeyword( "LCEIL" );
    $str644$_lceil_ = makeString( "&lceil;" );
    $kw645$RCEIL = makeKeyword( "RCEIL" );
    $str646$_rceil_ = makeString( "&rceil;" );
    $kw647$LFLOOR = makeKeyword( "LFLOOR" );
    $str648$_lfloor_ = makeString( "&lfloor;" );
    $kw649$RFLOOR = makeKeyword( "RFLOOR" );
    $str650$_rfloor_ = makeString( "&rfloor;" );
    $kw651$LANG = makeKeyword( "LANG" );
    $str652$_lang_ = makeString( "&lang;" );
    $kw653$RANG = makeKeyword( "RANG" );
    $str654$_rang_ = makeString( "&rang;" );
    $kw655$LOZ = makeKeyword( "LOZ" );
    $str656$_loz_ = makeString( "&loz;" );
    $kw657$SPADES = makeKeyword( "SPADES" );
    $str658$_spades_ = makeString( "&spades;" );
    $kw659$CLUBS = makeKeyword( "CLUBS" );
    $str660$_clubs_ = makeString( "&clubs;" );
    $kw661$HEARTS = makeKeyword( "HEARTS" );
    $str662$_hearts_ = makeString( "&hearts;" );
    $kw663$DIAMS = makeKeyword( "DIAMS" );
    $str664$_diams_ = makeString( "&diams;" );
    $kw665$FROWNY_FACE = makeKeyword( "FROWNY-FACE" );
    $str666$__9785_ = makeString( "&#9785;" );
    $sym667$HEX_CHAR_STRING_P = makeSymbol( "HEX-CHAR-STRING-P" );
    $str668$__ = makeString( "&#" );
    $str669$_ = makeString( "_" );
    $str670$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str671$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw672$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str673$Echo_of_ARGS = makeString( "Echo of ARGS" );
    $kw674$SELF = makeKeyword( "SELF" );
    $str675$Back = makeString( "Back" );
    $sym676$HTML_ECHO_ARGS = makeSymbol( "HTML-ECHO-ARGS" );
    $kw677$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $list678 = ConsesLow.list( makeSymbol( "FILENAME" ) );
    $kw679$INPUT = makeKeyword( "INPUT" );
    $str680$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym681$HTML_ECHO_FILE = makeSymbol( "HTML-ECHO-FILE" );
    $str682$_ = makeString( "\"" );
    $str683$____ = makeString( "<!--" );
    $str684$___ = makeString( "-->" );
    $str685$_script = makeString( "<script" );
    $str686$__script_ = makeString( "</script>" );
    $str687$__script = makeString( "</script" );
    $list688 = ConsesLow.list( Characters.CHAR_backslash );
    $list689 = ConsesLow.list( ConsesLow.cons( makeString( "&quot;" ), makeString( "\"" ) ), ConsesLow.cons( makeString( "&amp;" ), makeString( "&" ) ), ConsesLow.cons( makeString( "&nbsp;" ), makeString( " " ) ) );
    $str690$http___ = makeString( "http://" );
    $int691$80 = makeInteger( 80 );
    $kw692$GET = makeKeyword( "GET" );
    $str693$_style = makeString( "<style" );
    $str694$__style_ = makeString( "</style>" );
    $str695$_p_ = makeString( "<p>" );
    $str696$_file_input_ = makeString( "_file_input_" );
    $str697$this_form_ = makeString( "this.form." );
    $str698$_value___this_value_ = makeString( ".value = this.value;" );
    $str699$TEXT = makeString( "TEXT" );
    $list700 = ConsesLow.list( ConsesLow.list( makeSymbol( "HANDLER-NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TARGET" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym701$FRAME_NAME_VAR = makeUninternedSymbol( "FRAME-NAME-VAR" );
    $sym702$CLET = makeSymbol( "CLET" );
    $sym703$CB_FRAME_NAME = makeSymbol( "CB-FRAME-NAME" );
    $sym704$HTML_FANCY_FORM = makeSymbol( "HTML-FANCY-FORM" );
    $sym705$_CYC_CGI_PROGRAM_ = makeSymbol( "*CYC-CGI-PROGRAM*" );
    $sym706$_HTML_FORM_METHOD_POST_ = makeSymbol( "*HTML-FORM-METHOD-POST*" );
    $list707 = ConsesLow.list( NIL, NIL, NIL, makeString( "multipart/form-data" ) );
    $sym708$HTML_HIDDEN_INPUT = makeSymbol( "HTML-HIDDEN-INPUT" );
    $list709 = ConsesLow.list( T );
    $str710$_multipart_formdata = makeString( " multipart/formdata" );
    $str711$application_octet_stream = makeString( "application/octet-stream" );
    $str712$T = makeString( "T" );
    $sym713$CHAR_ = makeSymbol( "CHAR=" );
    $list714 = ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "VALUE" ) );
    $str715$__2__0X = makeString( "%~2,'0X" );
    $str716$____________________ = makeString( "--------------------" );
    $int717$200 = makeInteger( 200 );
    $kw718$VERTICAL = makeKeyword( "VERTICAL" );
    $kw719$SIZE = makeKeyword( "SIZE" );
    $kw720$CLASS = makeKeyword( "CLASS" );
    $sym721$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $kw722$NAME = makeKeyword( "NAME" );
    $kw723$COLOR = makeKeyword( "COLOR" );
    $kw724$FONT_COLOR = makeKeyword( "FONT-COLOR" );
    $kw725$BLACK = makeKeyword( "BLACK" );
    $int726$400 = makeInteger( 400 );
    $int727$800 = makeInteger( 800 );
    $kw728$HORIZONTAL = makeKeyword( "HORIZONTAL" );
    $kw729$CLASS_COLORMAP = makeKeyword( "CLASS-COLORMAP" );
    $str730$new_login_id = makeString( "new_login_id" );
    $str731$hashed_password = makeString( "hashed_password" );
    $str732$User_ID = makeString( "User ID" );
    $str733$Password = makeString( "Password" );
    $str734$unhashed_password_ = makeString( "unhashed_password_" );
    $str735$var_oldB64Pad___b64pad__b64pad___ = makeString( "var oldB64Pad = b64pad; b64pad = '='; var theInput=(this.form." );
    $str736$_value_this_form_ = makeString( ".value+this.form." );
    $str737$_value___this_form_ = makeString( ".value); this.form." );
    $str738$_value_b64_sha1_theInput___b64pad = makeString( ".value=b64_sha1(theInput); b64pad = oldB64Pad" );
    $kw739$SHA1 = makeKeyword( "SHA1" );
    $int740$30 = makeInteger( 30 );
    $kw741$PASSWORD = makeKeyword( "PASSWORD" );
    $str742$Submit = makeString( "Submit" );
    $str743$HTML_Utilities_Test = makeString( "HTML Utilities Test" );
    $str744$_Category = makeString( " Category" );
    $str745$_Suite = makeString( " Suite" );
    $str746$HTML_Utilities = makeString( "HTML-Utilities" );
  }
}
/*
 * 
 * Total time: 2858 ms
 * 
 */