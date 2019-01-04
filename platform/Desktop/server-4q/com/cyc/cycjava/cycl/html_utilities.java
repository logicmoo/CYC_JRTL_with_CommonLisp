package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class html_utilities extends SubLTranslatedFile
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
    public static SubLObject html_flush() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.force_output(html_macros.$html_stream$.getDynamicValue(thread));
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 907L)
    public static SubLObject html_char(final SubLObject v_char, SubLObject n) {
        if (n == html_utilities.UNPROVIDED) {
            n = (SubLObject)html_utilities.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        for (i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
            streams_high.write_char(v_char, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return v_char;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 1069L)
    public static SubLObject html_string(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == html_utilities.UNPROVIDED) {
            start = (SubLObject)html_utilities.ZERO_INTEGER;
        }
        if (end == html_utilities.UNPROVIDED) {
            end = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL == end) {
            end = Sequences.length(string);
        }
        if (start.numL(end)) {
            if ((html_utilities.NIL != html_macros.$html_safe_print$.getDynamicValue(thread) && html_utilities.NIL != Sequences.find_if((SubLObject)html_utilities.$sym1$HTML_RESERVED_CHAR_P, string, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) || html_utilities.NIL != Sequences.find_if((SubLObject)html_utilities.$sym2$NON_ASCII_CHAR_P, string, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
                SubLObject end_var_$1;
                SubLObject end_var;
                SubLObject char_num;
                SubLObject v_char;
                SubLObject subst_string;
                for (end_var = (end_var_$1 = ((html_utilities.NIL != end) ? end : Sequences.length(string))), char_num = (SubLObject)html_utilities.NIL, char_num = start; !char_num.numGE(end_var_$1); char_num = number_utilities.f_1X(char_num)) {
                    v_char = Strings.sublisp_char(string, char_num);
                    subst_string = html_escape_string_for_char(v_char, html_macros.$html_safe_print$.getDynamicValue(thread));
                    if (html_utilities.NIL != subst_string) {
                        streams_high.write_string(subst_string, html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    else {
                        streams_high.write_char(v_char, html_macros.$html_stream$.getDynamicValue(thread));
                    }
                }
            }
            else {
                streams_high.write_string(string, html_macros.$html_stream$.getDynamicValue(thread), start, end);
            }
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 1855L)
    public static SubLObject html_reserved_char_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values(html_macros.$html_escapes_map$.getDynamicValue(thread), v_object, Symbols.symbol_function((SubLObject)html_utilities.EQ), (SubLObject)html_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 2045L)
    public static SubLObject html_escape_string_for_char(final SubLObject v_char, final SubLObject escape_reserved_charsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL != unicode_strings.non_ascii_char_p(v_char)) {
            return html_escape_string_for_non_ascii_char(v_char);
        }
        if (html_utilities.NIL != escape_reserved_charsP) {
            return list_utilities.alist_lookup_without_values(html_macros.$html_escapes_map$.getDynamicValue(thread), v_char, Symbols.symbol_function((SubLObject)html_utilities.EQ), (SubLObject)html_utilities.NIL);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 2333L)
    public static SubLObject string_has_any_escape_charsP(final SubLObject string, final SubLObject escape_reserved_charsP) {
        SubLObject result = (SubLObject)html_utilities.NIL;
        final SubLObject end_var = Sequences.length(string);
        if (html_utilities.NIL == result) {
            SubLObject end_var_$2;
            SubLObject char_num;
            SubLObject v_char;
            for (end_var_$2 = end_var, char_num = (SubLObject)html_utilities.NIL, char_num = (SubLObject)html_utilities.ZERO_INTEGER; html_utilities.NIL == result && !char_num.numGE(end_var_$2); char_num = number_utilities.f_1X(char_num)) {
                v_char = Strings.sublisp_char(string, char_num);
                if (html_utilities.NIL != unicode_strings.non_ascii_char_p(v_char) || (html_utilities.NIL != escape_reserved_charsP && html_utilities.NIL != html_reserved_character_code_p(Characters.char_code(v_char)))) {
                    result = (SubLObject)html_utilities.T;
                }
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 2639L)
    public static SubLObject html_reserved_character_code_p(final SubLObject code) {
        if (code.eql((SubLObject)html_utilities.$int3$38) || code.eql((SubLObject)html_utilities.$int4$34) || code.eql((SubLObject)html_utilities.$int5$60) || code.eql((SubLObject)html_utilities.$int6$62)) {
            return (SubLObject)html_utilities.T;
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 2788L)
    public static SubLObject html_escape_string_for_non_ascii_char(final SubLObject v_char) {
        assert html_utilities.NIL != unicode_strings.non_ascii_char_p(v_char) : v_char;
        final SubLObject char_code = Characters.char_code(v_char);
        return Sequences.cconcatenate((SubLObject)html_utilities.$str7$__x, new SubLObject[] { format_nil.format_nil_a_no_copy(number_utilities.convert_to_hexadecimal(char_code)), html_utilities.$str8$_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 3077L)
    public static SubLObject html_escape(final SubLObject string, final SubLObject escape_reserved_charsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_utilities.NIL != Types.stringp(string) : string;
        if (html_utilities.NIL == string_has_any_escape_charsP(string, escape_reserved_charsP)) {
            return string;
        }
        SubLObject new_string = (SubLObject)html_utilities.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(escape_reserved_charsP, thread);
            SubLObject stream = (SubLObject)html_utilities.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0_$3 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    html_string(string, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0_$3, thread);
                }
                new_string = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)html_utilities.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        return new_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 3608L)
    public static SubLObject subl_string_to_display_vector_string(final SubLObject subl_string) {
        return unicode_strings.html_escaped_to_display(html_escape(subl_string, (SubLObject)html_utilities.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 3739L)
    public static SubLObject html_princ(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) {
            if (v_object.isString()) {
                html_string(v_object, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
            }
            else if (html_utilities.NIL != nart_handles.nart_p(v_object)) {
                html_princ(format_nil.format_nil_a(v_object));
            }
            else if (html_utilities.NIL != constant_handles.constant_p(v_object)) {
                html_markup(constants_high.constant_name(v_object));
            }
            else if (v_object.isChar()) {
                html_char(v_object, (SubLObject)html_utilities.UNPROVIDED);
            }
            else if (v_object.isNumber()) {
                print_high.princ(v_object, html_macros.$html_stream$.getDynamicValue(thread));
            }
            else if (v_object.isKeyword()) {
                html_string(Symbols.symbol_name(v_object), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
            }
            else if (v_object.isSymbol()) {
                html_string(Symbols.symbol_name(v_object), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
            }
            else {
                html_princ(format_nil.format_nil_a(v_object));
            }
        }
        else {
            print_high.princ(v_object, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 4591L)
    public static SubLObject html_princ_strong(final SubLObject v_object) {
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(v_object);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 4687L)
    public static SubLObject html_princ_possibly_strong(final SubLObject v_object, final SubLObject strongP) {
        if (html_utilities.NIL != strongP) {
            html_princ_strong(v_object);
        }
        else {
            html_princ(v_object);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 4837L)
    public static SubLObject html_princ_non_breaking(final SubLObject v_object) {
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_princ(v_object);
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 4941L)
    public static SubLObject html_prin1(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL != html_macros.$html_safe_print$.getDynamicValue(thread)) {
            if (v_object.isString()) {
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_escapes_map$.currentBinding(thread);
                try {
                    html_macros.$html_escapes_map$.bind(html_macros.$html_prin1_string_escapes_map$.getGlobalValue(), thread);
                    html_princ(v_object);
                }
                finally {
                    html_macros.$html_escapes_map$.rebind(_prev_bind_0, thread);
                }
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            }
            else if (v_object.isKeyword()) {
                html_char((SubLObject)Characters.CHAR_colon, (SubLObject)html_utilities.UNPROVIDED);
                html_princ(v_object);
            }
            else if (v_object.isNumber()) {
                print_high.prin1(v_object, html_macros.$html_stream$.getDynamicValue(thread));
            }
            else {
                html_princ(format_nil.format_nil_s(v_object));
            }
        }
        else {
            print_high.prin1(v_object, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 5544L)
    public static SubLObject html_princ_formatted_string(final SubLObject string) {
        assert html_utilities.NIL != Types.stringp(string) : string;
        if (html_utilities.NIL == Sequences.find((SubLObject)Characters.CHAR_newline, string, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED) && html_utilities.NIL == Sequences.find((SubLObject)Characters.CHAR_space, string, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
            html_princ(string);
        }
        else {
            SubLObject end_var_$5;
            SubLObject end_var;
            SubLObject char_num;
            SubLObject pcase_var;
            SubLObject character;
            for (end_var = (end_var_$5 = Sequences.length(string)), char_num = (SubLObject)html_utilities.NIL, char_num = (SubLObject)html_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$5); char_num = number_utilities.f_1X(char_num)) {
                character = (pcase_var = Strings.sublisp_char(string, char_num));
                if (pcase_var.eql((SubLObject)Characters.CHAR_newline)) {
                    html_newline((SubLObject)html_utilities.UNPROVIDED);
                }
                else if (pcase_var.eql((SubLObject)Characters.CHAR_space)) {
                    html_glyph((SubLObject)html_utilities.$kw10$NBSP, (SubLObject)html_utilities.UNPROVIDED);
                }
                else {
                    html_char(character, (SubLObject)html_utilities.UNPROVIDED);
                }
            }
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 5999L)
    public static SubLObject html_terpri(SubLObject n) {
        if (n == html_utilities.UNPROVIDED) {
            n = (SubLObject)html_utilities.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        for (i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
            streams_high.terpri(html_macros.$html_stream$.getDynamicValue(thread));
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6147L)
    public static SubLObject html_source_readability_terpri(SubLObject n) {
        if (n == html_utilities.UNPROVIDED) {
            n = (SubLObject)html_utilities.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL == html_macros.$within_html_pre$.getDynamicValue(thread) && html_utilities.NIL == html_macros.$suppress_html_source_readability_terpriP$.getDynamicValue(thread)) {
            html_terpri(n);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6404L)
    public static SubLObject html_tab(SubLObject n) {
        if (n == html_utilities.UNPROVIDED) {
            n = (SubLObject)html_utilities.ONE_INTEGER;
        }
        return html_char((SubLObject)Characters.CHAR_tab, n);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6513L)
    public static SubLObject html_spaces(SubLObject n) {
        if (n == html_utilities.UNPROVIDED) {
            n = (SubLObject)html_utilities.ONE_INTEGER;
        }
        html_indent(n);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6667L)
    public static SubLObject html_indent(SubLObject n) {
        if (n == html_utilities.UNPROVIDED) {
            n = (SubLObject)html_utilities.$float11$0_5;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (n.numG((SubLObject)html_utilities.ZERO_INTEGER)) {
            if (html_utilities.NIL != html_macros.$within_html_pre$.getDynamicValue(thread)) {
                return html_char((SubLObject)Characters.CHAR_space, n);
            }
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.subtract(Numbers.multiply((SubLObject)html_utilities.TWO_INTEGER, n), (SubLObject)html_utilities.ONE_INTEGER), i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
                html_glyph((SubLObject)html_utilities.$kw10$NBSP, (SubLObject)html_utilities.UNPROVIDED);
            }
            html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_utilities.UNPROVIDED);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 6986L)
    public static SubLObject html_markup(final SubLObject thing) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (thing.isString()) {
            streams_high.write_string(thing, html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
        }
        else {
            print_high.princ(thing, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 7351L)
    public static SubLObject html_print_doc_string(final SubLObject string) {
        html_princ((SubLObject)Characters.CHAR_quotation);
        html_princ_doc_string(string, (SubLObject)html_utilities.UNPROVIDED);
        html_princ((SubLObject)Characters.CHAR_quotation);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 7766L)
    public static SubLObject html_princ_doc_string(final SubLObject string, SubLObject link_function) {
        if (link_function == html_utilities.UNPROVIDED) {
            link_function = (SubLObject)html_utilities.$sym12$CB_FORM;
        }
        return html_princ_cycl_string(string, link_function, (SubLObject)html_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 8007L)
    public static SubLObject hide_non_ascii_chars(final SubLObject unicode_string) {
        SubLObject result = (SubLObject)html_utilities.NIL;
        SubLObject stream = (SubLObject)html_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject vector_var = unicode_strings.display_to_unicode_vector(cycl_utilities.nat_arg1(unicode_string, (SubLObject)html_utilities.UNPROVIDED));
            final SubLObject backwardP_var = (SubLObject)html_utilities.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject code;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)html_utilities.NIL, v_iteration = (SubLObject)html_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)html_utilities.ONE_INTEGER)) {
                element_num = ((html_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)html_utilities.ONE_INTEGER) : v_iteration);
                code = Vectors.aref(vector_var, element_num);
                if (code.numL((SubLObject)html_utilities.$int13$128)) {
                    print_high.princ(Characters.code_char(code), stream);
                }
                else {
                    PrintLow.format(stream, (SubLObject)html_utilities.$str14$__A_, code);
                }
            }
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)html_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)html_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 8484L)
    public static SubLObject html_princ_string_with_hidden_non_ascii_chars(final SubLObject str) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject next_start_idx;
        for (SubLObject last_pipe = next_start_idx = (SubLObject)html_utilities.ZERO_INTEGER, next_pipe = Sequences.position((SubLObject)Characters.CHAR_vertical, str, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED); html_utilities.NIL != next_pipe; next_pipe = Sequences.position((SubLObject)Characters.CHAR_vertical, str, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), next_start_idx, (SubLObject)html_utilities.UNPROVIDED)) {
            html_markup(string_utilities.substring(str, next_start_idx, next_pipe));
            last_pipe = (next_start_idx = next_pipe);
            next_pipe = Sequences.position((SubLObject)Characters.CHAR_vertical, str, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), number_utilities.f_1X(last_pipe), (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject code = reader.read_from_string_ignoring_errors(str, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, number_utilities.f_1X(last_pipe), next_pipe);
            if (html_utilities.NIL != subl_promotions.positive_integer_p(code)) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_utilities.$str16$__x_x_, code);
                last_pipe = next_pipe;
                next_start_idx = number_utilities.f_1X(last_pipe);
            }
        }
        if (html_utilities.NIL != list_utilities.lengthG(str, next_start_idx, (SubLObject)html_utilities.UNPROVIDED)) {
            html_markup(string_utilities.substring(str, next_start_idx, (SubLObject)html_utilities.UNPROVIDED));
        }
        return str;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 9421L)
    public static SubLObject html_princ_cycl_string(final SubLObject string, SubLObject link_function, SubLObject require_exactP) {
        if (link_function == html_utilities.UNPROVIDED) {
            link_function = (SubLObject)html_utilities.$sym12$CB_FORM;
        }
        if (require_exactP == html_utilities.UNPROVIDED) {
            require_exactP = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL != unicode_nauts.unicode_naut_p(string, (SubLObject)html_utilities.UNPROVIDED)) {
            SubLObject html = (SubLObject)html_utilities.NIL;
            SubLObject stream = (SubLObject)html_utilities.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
                try {
                    html_macros.$html_stream$.bind(stream, thread);
                    html_princ_cycl_string(hide_non_ascii_chars(string), link_function, require_exactP);
                }
                finally {
                    html_macros.$html_stream$.rebind(_prev_bind_0, thread);
                }
                html = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)html_utilities.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            return html_princ_string_with_hidden_non_ascii_chars(html);
        }
        if (html_utilities.NIL != html_cycl_string_printer.$html_large_string_limit$.getDynamicValue(thread) && html_utilities.NIL != list_utilities.lengthG(string, html_cycl_string_printer.$html_large_string_limit$.getDynamicValue(thread), (SubLObject)html_utilities.UNPROVIDED)) {
            final SubLObject prefix = string_utilities.substring(string, (SubLObject)html_utilities.ZERO_INTEGER, html_cycl_string_printer.$html_large_string_limit$.getDynamicValue(thread));
            final SubLObject truncated_string = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[] { html_utilities.$str17$______i__, format_nil.format_nil_a_no_copy(Sequences.length(string)), html_utilities.$str18$_characters_total___i_ });
            final SubLObject _prev_bind_0 = html_cycl_string_printer.$html_large_string_limit$.currentBinding(thread);
            try {
                html_cycl_string_printer.$html_large_string_limit$.bind((SubLObject)html_utilities.NIL, thread);
                html_princ_cycl_string(truncated_string, link_function, require_exactP);
            }
            finally {
                html_cycl_string_printer.$html_large_string_limit$.rebind(_prev_bind_0, thread);
            }
            return truncated_string;
        }
        return (html_utilities.NIL != html_utilities.$use_new_html_princ_cycl_stringP$.getDynamicValue(thread)) ? html_princ_cycl_string_new(string, link_function, require_exactP) : html_princ_cycl_string_old(string, link_function, require_exactP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 10731L)
    public static SubLObject html_princ_cycl_string_new(final SubLObject string, final SubLObject link_function, final SubLObject require_exactP) {
        final SubLObject printer = html_cycl_string_printer.new_html_cycl_string_printer(string, link_function, require_exactP);
        while (html_utilities.NIL == html_cycl_string_printer.html_cycl_string_printer_done_p(printer)) {
            html_cycl_string_printer.html_cycl_string_printer_print_next(printer);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 11020L)
    public static SubLObject html_princ_cycl_string_old(final SubLObject string, final SubLObject link_function, final SubLObject require_exactP) {
        final SubLObject length = Sequences.length(string);
        SubLObject last_idx = (SubLObject)html_utilities.ZERO_INTEGER;
        SubLObject next_char_idx = (SubLObject)html_utilities.NIL;
        SubLObject inside_cycl_tagP = (SubLObject)html_utilities.NIL;
        SubLObject hash_idx = (SubLObject)html_utilities.NIL;
        SubLObject colon_idx = (SubLObject)html_utilities.NIL;
        SubLObject lt_idx = (SubLObject)html_utilities.NIL;
        SubLObject variable_idx = (SubLObject)html_utilities.NIL;
        SubLObject url_idx = (SubLObject)html_utilities.NIL;
        SubLObject url_end_idx = (SubLObject)html_utilities.NIL;
        hash_idx = Sequences.position((SubLObject)Characters.CHAR_hash, string, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), last_idx, (SubLObject)html_utilities.UNPROVIDED);
        colon_idx = Sequences.position((SubLObject)Characters.CHAR_colon, string, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), last_idx, (SubLObject)html_utilities.UNPROVIDED);
        lt_idx = Sequences.position((SubLObject)Characters.CHAR_less, string, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), last_idx, (SubLObject)html_utilities.UNPROVIDED);
        variable_idx = html_cycl_string_printer.html_cycl_string_variable_index(string, last_idx);
        url_idx = (SubLObject)html_utilities.ZERO_INTEGER;
        url_end_idx = (SubLObject)html_utilities.ZERO_INTEGER;
        while (html_utilities.NIL != colon_idx || html_utilities.NIL != hash_idx || html_utilities.NIL != lt_idx || html_utilities.NIL != variable_idx) {
            next_char_idx = Functions.apply(Symbols.symbol_function((SubLObject)html_utilities.$sym19$MIN), Sequences.remove_if(Symbols.symbol_function((SubLObject)html_utilities.$sym20$NULL), (SubLObject)ConsesLow.list(hash_idx, colon_idx, lt_idx, variable_idx), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED));
            if (colon_idx.eql(next_char_idx)) {
                url_idx = web_utilities.find_url_beginning(string, length, colon_idx);
                if (html_utilities.NIL != url_idx) {
                    url_end_idx = web_utilities.find_url_end(string, length, url_idx);
                }
                if (html_utilities.NIL != url_idx && html_utilities.NIL != url_end_idx) {
                    html_string(string, last_idx, url_idx);
                    html_cycl_string_printer.print_url_with_tag(Sequences.subseq(string, url_idx, url_end_idx));
                    last_idx = url_end_idx;
                }
                else {
                    html_string(string, last_idx, Numbers.add((SubLObject)html_utilities.ONE_INTEGER, colon_idx));
                    last_idx = Numbers.add((SubLObject)html_utilities.ONE_INTEGER, colon_idx);
                }
                colon_idx = Sequences.position((SubLObject)Characters.CHAR_colon, string, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), last_idx, (SubLObject)html_utilities.UNPROVIDED);
                hash_idx = Sequences.position((SubLObject)Characters.CHAR_hash, string, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), last_idx, (SubLObject)html_utilities.UNPROVIDED);
                variable_idx = Sequences.position_if((SubLObject)html_utilities.$sym21$EL_VARIABLE_CHAR_, string, Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), last_idx, (SubLObject)html_utilities.UNPROVIDED);
            }
            else if (hash_idx.eql(next_char_idx)) {
                html_string(string, last_idx, hash_idx);
                final SubLObject dollar_idx = Numbers.add(hash_idx, (SubLObject)html_utilities.ONE_INTEGER);
                if (dollar_idx.numE(length) || !Strings.sublisp_char(string, dollar_idx).eql(constant_reader.constant_reader_macro_char())) {
                    html_princ((SubLObject)Characters.CHAR_hash);
                    last_idx = dollar_idx;
                }
                else {
                    last_idx = html_cycl_string_printer.print_embedded_constant(string, length, dollar_idx, link_function, require_exactP);
                }
                hash_idx = Sequences.position((SubLObject)Characters.CHAR_hash, string, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), last_idx, (SubLObject)html_utilities.UNPROVIDED);
                colon_idx = Sequences.position((SubLObject)Characters.CHAR_colon, string, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), last_idx, (SubLObject)html_utilities.UNPROVIDED);
                variable_idx = Sequences.position_if((SubLObject)html_utilities.$sym21$EL_VARIABLE_CHAR_, string, Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), last_idx, (SubLObject)html_utilities.UNPROVIDED);
            }
            else if (variable_idx.eql(next_char_idx)) {
                html_string(string, last_idx, variable_idx);
                last_idx = variable_idx;
                final SubLObject non_variable_idx = list_utilities.position_if_not((SubLObject)html_utilities.$sym21$EL_VARIABLE_CHAR_, string, Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), variable_idx, (SubLObject)html_utilities.UNPROVIDED);
                if (html_utilities.NIL != inside_cycl_tagP && html_utilities.NIL != non_variable_idx && non_variable_idx.numG(variable_idx) && html_utilities.NIL == Characters.alpha_char_p(Strings.sublisp_char(string, non_variable_idx))) {
                    final SubLObject variable_name = Sequences.subseq(string, variable_idx, non_variable_idx);
                    if (html_utilities.NIL != cycl_variables.valid_el_var_nameP(variable_name)) {
                        html_princ(variable_name);
                    }
                    else if (html_utilities.NIL != string_utilities.integer_string_p(variable_name)) {
                        html_princ(variable_name);
                    }
                    else {
                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_princ(variable_name);
                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                    }
                    last_idx = non_variable_idx;
                }
                if (html_utilities.NIL != non_variable_idx) {
                    variable_idx = html_cycl_string_printer.html_cycl_string_variable_index(string, non_variable_idx);
                }
                else {
                    variable_idx = (SubLObject)html_utilities.NIL;
                }
            }
            else if (lt_idx.eql(next_char_idx)) {
                html_string(string, last_idx, lt_idx);
                last_idx = lt_idx;
                final SubLObject gt_idx = Sequences.position((SubLObject)Characters.CHAR_greater, string, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), lt_idx, (SubLObject)html_utilities.UNPROVIDED);
                if (html_utilities.NIL != gt_idx) {
                    final SubLObject tag_start_idx = (SubLObject)((html_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_slash, Strings.sublisp_char(string, Numbers.add(lt_idx, (SubLObject)html_utilities.ONE_INTEGER)))) ? html_utilities.TWO_INTEGER : html_utilities.ONE_INTEGER);
                    final SubLObject tag = Sequences.subseq(string, Numbers.add(lt_idx, tag_start_idx), gt_idx);
                    if (html_utilities.NIL != subl_promotions.memberP(Strings.string_downcase(string_utilities.trim_whitespace(tag), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED), html_cycl_string_printer.$cycl_string_allowable_html_tags$.getGlobalValue(), Symbols.symbol_function((SubLObject)html_utilities.$sym22$STRING_), (SubLObject)html_utilities.UNPROVIDED)) {
                        html_markup((SubLObject)html_utilities.$str23$_);
                        if (html_utilities.TWO_INTEGER.eql(tag_start_idx)) {
                            html_princ((SubLObject)html_utilities.$str24$_);
                        }
                        html_markup(tag);
                        html_markup((SubLObject)html_utilities.$str25$_);
                        if (html_utilities.NIL != Strings.string_equal(tag, (SubLObject)html_utilities.$str26$code, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED) || html_utilities.NIL != Strings.string_equal(tag, (SubLObject)html_utilities.$str27$pre, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
                            if (html_utilities.TWO_INTEGER.eql(tag_start_idx)) {
                                inside_cycl_tagP = (SubLObject)html_utilities.NIL;
                            }
                            else {
                                inside_cycl_tagP = (SubLObject)html_utilities.T;
                            }
                        }
                        last_idx = Numbers.add(gt_idx, (SubLObject)html_utilities.ONE_INTEGER);
                    }
                }
                lt_idx = Sequences.position((SubLObject)Characters.CHAR_less, string, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), Numbers.add(lt_idx, (SubLObject)html_utilities.ONE_INTEGER), (SubLObject)html_utilities.UNPROVIDED);
            }
            hash_idx = hash_idx;
            colon_idx = colon_idx;
            lt_idx = lt_idx;
            variable_idx = variable_idx;
            url_idx = url_idx;
            url_end_idx = url_end_idx;
        }
        html_string(string, last_idx, (SubLObject)html_utilities.NIL);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 15721L)
    public static SubLObject html_cycl_string(final SubLObject string, SubLObject link_function, SubLObject require_exactP) {
        if (link_function == html_utilities.UNPROVIDED) {
            link_function = (SubLObject)html_utilities.$sym28$HTML_LINK_TO_OWL_URI;
        }
        if (require_exactP == html_utilities.UNPROVIDED) {
            require_exactP = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject html_string = (SubLObject)html_utilities.NIL;
        SubLObject stream = (SubLObject)html_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_princ_cycl_string(string, link_function, require_exactP);
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            html_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)html_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 15985L)
    public static SubLObject opencyc_html_cycl_string(final SubLObject string) {
        return html_cycl_string(string, (SubLObject)html_utilities.$sym29$HTML_LINK_TO_OWL_OPENCYC_URI, (SubLObject)html_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 18237L)
    public static SubLObject cb_form_for_cycl_string(final SubLObject v_cycl_string, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == html_utilities.UNPROVIDED) {
            depth = (SubLObject)html_utilities.NIL;
        }
        if (wrap_axiomsP == html_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)html_utilities.NIL;
        }
        final SubLObject cycl_list = reader.read_from_string_ignoring_errors(v_cycl_string, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != Strings.stringE(format_nil.format_nil_a(cycl_list), v_cycl_string, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
            cb_utilities.cb_form(cycl_list, depth, wrap_axiomsP);
        }
        else {
            cb_utilities.cb_form(v_cycl_string, depth, wrap_axiomsP);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 18902L)
    public static SubLObject html_stale_constant_reference(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == html_utilities.UNPROVIDED) {
            start = (SubLObject)html_utilities.ZERO_INTEGER;
        }
        if (end == html_utilities.UNPROVIDED) {
            end = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL != html_utilities.$html_stale_constant_reference_color$.getDynamicValue(thread)) {
            final SubLObject color_val = html_utilities.$html_stale_constant_reference_color$.getDynamicValue(thread);
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (html_utilities.NIL != color_val) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup(html_color(color_val));
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            }
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                html_string(string, start, end);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        else {
            html_string(string, start, end);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 19176L)
    public static SubLObject html_show_string_with_invalid_constants_highlighted(final SubLObject string, SubLObject require_exactP) {
        if (require_exactP == html_utilities.UNPROVIDED) {
            require_exactP = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = html_utilities.$html_stale_constant_reference_color$.currentBinding(thread);
        try {
            html_utilities.$html_stale_constant_reference_color$.bind((SubLObject)html_utilities.$kw38$RED, thread);
            html_princ_cycl_string(string, (SubLObject)html_utilities.$sym12$CB_FORM, require_exactP);
        }
        finally {
            html_utilities.$html_stale_constant_reference_color$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 24927L)
    public static SubLObject html_url_princ(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.isString()) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Sequences.length(v_object), i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
                html_url_princ_char(Strings.sublisp_char(v_object, i));
            }
        }
        else if (v_object.isSymbol()) {
            html_url_princ(Symbols.symbol_name(v_object));
        }
        else if (v_object.isInteger()) {
            html_markup(v_object);
        }
        else if (html_utilities.NIL != nart_handles.nart_p(v_object)) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_utilities.$str39$_A, v_object);
        }
        else if (html_utilities.NIL != constant_handles.constant_p(v_object)) {
            html_url_princ(constants_high.constant_name(v_object));
        }
        else if (v_object.isChar()) {
            html_url_princ_char(v_object);
        }
        else if (v_object.isCons()) {
            html_url_princ((SubLObject)html_utilities.$str40$_);
            SubLObject rest = (SubLObject)html_utilities.NIL;
            SubLObject item = (SubLObject)html_utilities.NIL;
            rest = v_object;
            item = rest.first();
            while (rest.rest().isCons()) {
                if (!rest.eql(v_object)) {
                    html_url_princ((SubLObject)html_utilities.$str41$_);
                }
                html_url_princ(item);
                rest = rest.rest();
                item = rest.first();
            }
            if (!rest.eql(v_object)) {
                html_url_princ((SubLObject)html_utilities.$str41$_);
            }
            html_url_princ(rest.first());
            if (html_utilities.NIL != rest.rest()) {
                html_url_princ((SubLObject)html_utilities.$str42$___);
                html_url_princ(rest.rest());
            }
            html_url_princ((SubLObject)html_utilities.$str43$_);
        }
        else {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_utilities.$str39$_A, v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 26037L)
    public static SubLObject html_url_princ_char(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL != Characters.alpha_char_p(v_char) || html_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)html_utilities.UNPROVIDED) || html_utilities.NIL != Sequences.find(v_char, (SubLObject)html_utilities.$str44$___, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
            html_char(v_char, (SubLObject)html_utilities.UNPROVIDED);
        }
        else if (v_char.eql((SubLObject)Characters.CHAR_space) && html_utilities.NIL != html_utilities.$html_url_princ_escape_spaces$.getDynamicValue(thread)) {
            html_char((SubLObject)Characters.CHAR_plus, (SubLObject)html_utilities.UNPROVIDED);
        }
        else {
            final SubLObject code = Characters.char_code(v_char);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_utilities.$str45$__C_C, string_utilities.hex_char(Numbers.integerDivide(code, (SubLObject)html_utilities.SIXTEEN_INTEGER)), string_utilities.hex_char(Numbers.mod(code, (SubLObject)html_utilities.SIXTEEN_INTEGER)));
        }
        return v_char;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 26440L)
    public static SubLObject html_simple_attribute(final SubLObject attribute) {
        html_markup(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(attribute), new SubLObject[] { html_utilities.$str46$_, format_nil.format_nil_s_no_copy(attribute) }));
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 26758L)
    public static SubLObject html_simple_quoted_attribute(final SubLObject attribute, final SubLObject value) {
        html_markup(attribute);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(value);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 26969L)
    public static SubLObject html_color(SubLObject color) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (color.isString()) {
            return color;
        }
        color = conses_high.assoc(color, html_macros.$html_color_map$.getDynamicValue(thread), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED).rest();
        if (color.isString()) {
            return color;
        }
        return (SubLObject)html_utilities.$str47$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 27278L)
    public static SubLObject html_style_background_color(final SubLObject color) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject color_string = html_color(color);
        html_princ(html_utilities.$html_style_background$.getDynamicValue(thread));
        html_princ(color_string);
        html_princ((SubLObject)html_utilities.$str8$_);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 27940L)
    public static SubLObject html_align(SubLObject align) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (align.isString()) {
            return align;
        }
        align = conses_high.assoc(align, html_utilities.$html_align_map$.getDynamicValue(thread), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED).rest();
        if (align.isString()) {
            return align;
        }
        return (SubLObject)html_utilities.$str47$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 28532L)
    public static SubLObject html_copyright_notice() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_hr((SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str53$copyright);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_copyright_text();
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 28685L)
    public static SubLObject html_copyright_text() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_utilities.$str54$Copyright__copy__1995____A_, numeric_date_utilities.this_year());
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_utilities.$cycorp_homepage_url$.getDynamicValue(thread));
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            html_princ(html_utilities.$cycorp_homepage_text$.getDynamicValue(thread));
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_princ((SubLObject)html_utilities.$str55$___All_rights_reserved___);
        html_princ(html_utilities.$proprietarity_message$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 29446L)
    public static SubLObject html_mailto_url(final SubLObject address) {
        assert html_utilities.NIL != Types.stringp(address) : address;
        html_markup(html_macros.$html_protocol_mailto$.getGlobalValue());
        html_princ(address);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 29764L)
    public static SubLObject html_file_url(final SubLObject filename) {
        assert html_utilities.NIL != Types.stringp(filename) : filename;
        html_markup(html_macros.$html_protocol_file$.getGlobalValue());
        html_princ(filename);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 29962L)
    public static SubLObject html_refresh(final SubLObject seconds, SubLObject url) {
        if (url == html_utilities.UNPROVIDED) {
            url = (SubLObject)html_utilities.NIL;
        }
        if (seconds.isInteger()) {
            final SubLObject content = Sequences.cconcatenate(format_nil.format_nil_d_no_copy(seconds), format_nil.format_nil_a_no_copy((SubLObject)((html_utilities.NIL != url) ? Sequences.cconcatenate((SubLObject)html_utilities.$str70$_URL_, format_nil.format_nil_a_no_copy(url)) : html_utilities.$str47$)));
            html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_meta_head$.getGlobalValue());
            html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.$str71$Refresh);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            if (html_utilities.NIL != content) {
                html_markup(html_macros.$html_meta_content$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup(content);
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            }
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 30341L)
    public static SubLObject html_meta_utf_8_content_type() {
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str72$Content_type);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_meta_content$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str73$text_html__charset_UTF_8);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 30551L)
    public static SubLObject html_meta_expires(SubLObject seconds, SubLObject minutes, SubLObject hours) {
        if (seconds == html_utilities.UNPROVIDED) {
            seconds = (SubLObject)html_utilities.ZERO_INTEGER;
        }
        if (minutes == html_utilities.UNPROVIDED) {
            minutes = (SubLObject)html_utilities.ZERO_INTEGER;
        }
        if (hours == html_utilities.UNPROVIDED) {
            hours = (SubLObject)html_utilities.ZERO_INTEGER;
        }
        final SubLObject time = numeric_date_utilities.universal_time_from_now(seconds, minutes, hours);
        final SubLObject date_string = web_utilities.http_date_string(time);
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str74$Expires);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != date_string) {
            html_markup(html_macros.$html_meta_content$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(date_string);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 30820L)
    public static SubLObject html_meta_last_modified(SubLObject time) {
        if (time == html_utilities.UNPROVIDED) {
            time = Time.get_universal_time();
        }
        final SubLObject date_string = web_utilities.http_date_string(time);
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str75$Last_Modified);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != date_string) {
            html_markup(html_macros.$html_meta_content$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(date_string);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31041L)
    public static SubLObject html_meta_dont_cache() {
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_http_equiv$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str76$Cache_Control);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_meta_content$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str77$no_cache);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31167L)
    public static SubLObject html_webpage_expires(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_utilities.NIL;
        SubLObject current_$6 = (SubLObject)html_utilities.NIL;
        while (html_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_utilities.$list78);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_utilities.$list78);
            if (html_utilities.NIL == conses_high.member(current_$6, (SubLObject)html_utilities.$list79, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
                bad = (SubLObject)html_utilities.T;
            }
            if (current_$6 == html_utilities.$kw80$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_utilities.NIL != bad && html_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.$list78);
        }
        final SubLObject hh_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw81$HH, current);
        final SubLObject hh = (SubLObject)((html_utilities.NIL != hh_tail) ? conses_high.cadr(hh_tail) : html_utilities.ZERO_INTEGER);
        final SubLObject mm_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw82$MM, current);
        final SubLObject mm = (SubLObject)((html_utilities.NIL != mm_tail) ? conses_high.cadr(mm_tail) : html_utilities.ZERO_INTEGER);
        final SubLObject ss_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw83$SS, current);
        final SubLObject ss = (SubLObject)((html_utilities.NIL != ss_tail) ? conses_high.cadr(ss_tail) : html_utilities.ZERO_INTEGER);
        current = temp;
        if (html_utilities.NIL == current) {
            access_macros.defmacro_obsolete_warning((SubLObject)html_utilities.$sym84$HTML_WEBPAGE_EXPIRES, (SubLObject)html_utilities.$list85);
            return (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym86$HTML_META_EXPIRES, ss, mm, hh);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.$list78);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31316L)
    public static SubLObject html_webpage_last_modified(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        final SubLObject univ_time = current.isCons() ? current.first() : Time.get_universal_time();
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_utilities.$list87);
        current = current.rest();
        if (html_utilities.NIL == current) {
            access_macros.defmacro_obsolete_warning((SubLObject)html_utilities.$sym88$HTML_WEBPAGE_LAST_MODIFIED, (SubLObject)html_utilities.$list89);
            return (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym90$HTML_META_LAST_MODIFIED, univ_time);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.$list87);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31497L)
    public static SubLObject html_dont_cache_webpage(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (html_utilities.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.NIL);
        }
        access_macros.defmacro_obsolete_warning((SubLObject)html_utilities.$sym91$HTML_DONT_CACHE_WEBPAGE, (SubLObject)html_utilities.$list92);
        return (SubLObject)html_utilities.$list92;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31616L)
    public static SubLObject html_meta_no_robots() {
        return html_meta_robot_instructions((SubLObject)html_utilities.NIL, (SubLObject)html_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 31776L)
    public static SubLObject html_meta_robot_instructions(SubLObject index, SubLObject follow) {
        if (index == html_utilities.UNPROVIDED) {
            index = (SubLObject)html_utilities.NIL;
        }
        if (follow == html_utilities.UNPROVIDED) {
            follow = (SubLObject)html_utilities.NIL;
        }
        final SubLObject robot_instructions = html_meta_select_robot_instructions(index, follow);
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_meta_head$.getGlobalValue());
        html_markup(html_macros.$html_meta_name$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str93$ROBOTS);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != robot_instructions) {
            html_markup(html_macros.$html_meta_content$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(robot_instructions);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 32018L)
    public static SubLObject html_meta_select_robot_instructions(final SubLObject index, final SubLObject follow) {
        if (html_utilities.NIL == index && html_utilities.NIL == follow) {
            return (SubLObject)html_utilities.$str94$NOINDEX__NOFOLLOW;
        }
        if (html_utilities.NIL != index && html_utilities.NIL != follow) {
            return (SubLObject)html_utilities.$str95$INDEX__FOLLOW;
        }
        if (html_utilities.NIL == index && html_utilities.NIL != follow) {
            return (SubLObject)html_utilities.$str96$NOINDEX__FOLLOW;
        }
        if (html_utilities.NIL != index && html_utilities.NIL == follow) {
            return (SubLObject)html_utilities.$str97$INDEX__NOFOLLOW;
        }
        Errors.error((SubLObject)html_utilities.$str98$Invalid_HTML_meta_select_robot_in);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 32531L)
    public static SubLObject html_hr(SubLObject size, SubLObject width) {
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        if (width == html_utilities.UNPROVIDED) {
            width = (SubLObject)html_utilities.NIL;
        }
        html_markup(html_macros.$html_hr_head$.getGlobalValue());
        if (html_utilities.NIL != size) {
            html_markup(html_macros.$html_hr_size$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(size);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != width) {
            html_markup(html_macros.$html_hr_width$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(width);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 32895L)
    public static SubLObject html_line_break(SubLObject clear) {
        if (clear == html_utilities.UNPROVIDED) {
            clear = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL != clear) {
            html_markup(html_macros.$html_line_break$.getGlobalValue());
            html_markup(html_macros.$html_line_break_clear$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(clear);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_line_break_tail$.getGlobalValue());
        }
        else {
            html_markup(html_macros.$html_line_break_atomic$.getGlobalValue());
        }
        if (html_utilities.NIL == html_macros.$within_html_pre$.getDynamicValue(thread)) {
            html_terpri((SubLObject)html_utilities.UNPROVIDED);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 33250L)
    public static SubLObject html_br() {
        return html_line_break((SubLObject)html_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 33304L)
    public static SubLObject html_newline(SubLObject n) {
        if (n == html_utilities.UNPROVIDED) {
            n = (SubLObject)html_utilities.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject i;
        for (i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
            if (html_utilities.NIL != html_macros.$within_html_pre$.getDynamicValue(thread)) {
                html_terpri((SubLObject)html_utilities.UNPROVIDED);
            }
            else {
                html_br();
            }
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 33516L)
    public static SubLObject html_checkbox_input(final SubLObject name, SubLObject value, SubLObject checkedP, SubLObject script, SubLObject onclick, SubLObject disabledP) {
        if (value == html_utilities.UNPROVIDED) {
            value = (SubLObject)html_utilities.NIL;
        }
        if (checkedP == html_utilities.UNPROVIDED) {
            checkedP = (SubLObject)html_utilities.NIL;
        }
        if (script == html_utilities.UNPROVIDED) {
            script = (SubLObject)html_utilities.NIL;
        }
        if (onclick == html_utilities.UNPROVIDED) {
            onclick = (SubLObject)html_utilities.NIL;
        }
        if (disabledP == html_utilities.UNPROVIDED) {
            disabledP = html_macros.$html_input_disabledP$.getDynamicValue();
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_checkbox$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_princ(value);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != checkedP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        if (html_utilities.NIL != disabledP) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        if (html_utilities.NIL != script) {
            html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(script);
        }
        if (html_utilities.NIL != onclick) {
            html_markup(html_macros.$html_select_onchange$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(onclick);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34112L)
    public static SubLObject html_hidden_input(final SubLObject name, final SubLObject value, SubLObject id) {
        if (id == html_utilities.UNPROVIDED) {
            id = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_hidden$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(id);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_princ(value);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34289L)
    public static SubLObject html_image_input(final SubLObject name, final SubLObject image_url, SubLObject align, SubLObject border) {
        if (align == html_utilities.UNPROVIDED) {
            align = (SubLObject)html_utilities.NIL;
        }
        if (border == html_utilities.UNPROVIDED) {
            border = (SubLObject)html_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_image$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != image_url) {
            html_markup(html_macros.$html_input_src$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(image_url);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != align) {
            html_markup(html_macros.$html_input_align$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_align(align));
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != border) {
            html_markup(html_macros.$html_input_border$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(border);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34477L)
    public static SubLObject html_password_input(final SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_default.equalp((SubLObject)html_utilities.$str47$)) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_password$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_princ(v_default);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(size);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34690L)
    public static SubLObject html_radio_input(final SubLObject name, SubLObject value, SubLObject checkedP, SubLObject id) {
        if (value == html_utilities.UNPROVIDED) {
            value = (SubLObject)html_utilities.NIL;
        }
        if (checkedP == html_utilities.UNPROVIDED) {
            checkedP = (SubLObject)html_utilities.NIL;
        }
        if (id == html_utilities.UNPROVIDED) {
            id = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(id);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_princ(value);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != checkedP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 34864L)
    public static SubLObject html_reset_input(SubLObject label) {
        if (label == html_utilities.UNPROVIDED) {
            label = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_reset$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_value$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_princ((SubLObject)html_utilities.$str99$Reset_All_Fields);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 35317L)
    public static SubLObject html_submit_input(SubLObject label, SubLObject name, SubLObject script) {
        if (label == html_utilities.UNPROVIDED) {
            label = (SubLObject)html_utilities.NIL;
        }
        if (name == html_utilities.UNPROVIDED) {
            name = (SubLObject)html_utilities.NIL;
        }
        if (script == html_utilities.UNPROVIDED) {
            script = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_submit$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != label) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_princ(label);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != script) {
            html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(script);
        }
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 35512L)
    public static SubLObject html_text_input(final SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_default.equalp((SubLObject)html_utilities.$str47$)) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_princ(v_default);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(size);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 35718L)
    public static SubLObject html_scripted_text_input(final SubLObject name, final SubLObject script, SubLObject v_default, SubLObject size) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_default.equalp((SubLObject)html_utilities.$str47$)) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_princ(v_default);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(size);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != script) {
            html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(script);
        }
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 35955L)
    public static SubLObject html_disabled_text_input(final SubLObject name, SubLObject v_default, SubLObject size) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        if (v_default.equalp((SubLObject)html_utilities.$str47$)) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_input_text$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != v_default) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_princ(v_default);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        if (html_utilities.NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(size);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 36183L)
    public static SubLObject html_format_input(final SubLObject v_default, final SubLObject size, final SubLObject name_format_string, SubLObject arg_1, SubLObject arg_2, SubLObject arg_3, SubLObject arg_4) {
        if (arg_1 == html_utilities.UNPROVIDED) {
            arg_1 = (SubLObject)html_utilities.NIL;
        }
        if (arg_2 == html_utilities.UNPROVIDED) {
            arg_2 = (SubLObject)html_utilities.NIL;
        }
        if (arg_3 == html_utilities.UNPROVIDED) {
            arg_3 = (SubLObject)html_utilities.NIL;
        }
        if (arg_4 == html_utilities.UNPROVIDED) {
            arg_4 = (SubLObject)html_utilities.NIL;
        }
        final SubLObject name = PrintLow.format((SubLObject)html_utilities.NIL, name_format_string, new SubLObject[] { arg_1, arg_2, arg_3, arg_4 });
        return html_text_input(name, v_default, size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 36485L)
    public static SubLObject html_autocomplete_text_input(final SubLObject name, SubLObject v_default, SubLObject size, SubLObject cycl_type, SubLObject style) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        if (cycl_type == html_utilities.UNPROVIDED) {
            cycl_type = (SubLObject)html_utilities.NIL;
        }
        if (style == html_utilities.UNPROVIDED) {
            style = (SubLObject)html_utilities.$str47$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL != html_macros.next_html_id_definedP((SubLObject)html_utilities.UNPROVIDED)) {
            final SubLObject id_num = html_macros.next_html_id((SubLObject)html_utilities.UNPROVIDED);
            final SubLObject autocomplete_id = Sequences.cconcatenate((SubLObject)html_utilities.$str100$autocomplete_, format_nil.format_nil_a_no_copy(id_num));
            final SubLObject input_id = Sequences.cconcatenate((SubLObject)html_utilities.$str101$input_, format_nil.format_nil_a_no_copy(id_num));
            final SubLObject result_id = Sequences.cconcatenate((SubLObject)html_utilities.$str102$autocomplete_results_, format_nil.format_nil_a_no_copy(id_num));
            final SubLObject complete_style = Sequences.cconcatenate((SubLObject)html_utilities.$str103$position_static__width_auto_, format_nil.format_nil_a_no_copy(style));
            html_markup(html_macros.$html_span_head$.getGlobalValue());
            if (html_utilities.NIL != autocomplete_id) {
                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup(autocomplete_id);
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            }
            html_markup(html_macros.$html_attribute_class$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.$str104$yui_ac);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                html_markup(html_macros.$html_input_head$.getGlobalValue());
                html_markup(html_macros.$html_input_type$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup(html_macros.$html_input_text$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup(html_macros.$html_input_style$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup(complete_style);
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                if (html_utilities.NIL != input_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(input_id);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                if (html_utilities.NIL != name) {
                    html_markup(html_macros.$html_input_name$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(name);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                if (html_utilities.NIL != v_default) {
                    html_markup(html_macros.$html_input_value$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_princ(v_default);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                if (html_utilities.NIL != size) {
                    html_markup(html_macros.$html_input_size$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(size);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup((SubLObject)html_utilities.$str105$yui_ac_input);
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                if (html_utilities.NIL != result_id) {
                    html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(result_id);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup((SubLObject)html_utilities.$str106$yui_ac_container);
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_span_tail$.getGlobalValue());
            html_complete.html_print_js_autocomplete_setup_int(input_id, result_id, (SubLObject)html_utilities.TWENTY_INTEGER, (SubLObject)html_utilities.THREE_INTEGER, (SubLObject)html_utilities.NIL, cycl_type);
        }
        else {
            html_text_input(name, v_default, size);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 37617L)
    public static SubLObject html_image_multi_submit(final SubLObject template, SubLObject align) {
        if (align == html_utilities.UNPROVIDED) {
            align = (SubLObject)html_utilities.NIL;
        }
        SubLObject src = (SubLObject)html_utilities.NIL;
        SubLObject name = (SubLObject)html_utilities.NIL;
        SubLObject v_default = (SubLObject)html_utilities.NIL;
        SubLObject map = (SubLObject)html_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(template, template, (SubLObject)html_utilities.$list107);
        src = template.first();
        SubLObject current = template.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, template, (SubLObject)html_utilities.$list107);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, template, (SubLObject)html_utilities.$list107);
        v_default = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, template, (SubLObject)html_utilities.$list107);
        map = current.first();
        current = current.rest();
        if (html_utilities.NIL == current) {
            return html_image_input(name, src, align, (SubLObject)html_utilities.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(template, (SubLObject)html_utilities.$list107);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 38286L)
    public static SubLObject html_extract_multi_submit_input(final SubLObject template, final SubLObject args) {
        SubLObject src = (SubLObject)html_utilities.NIL;
        SubLObject name = (SubLObject)html_utilities.NIL;
        SubLObject v_default = (SubLObject)html_utilities.NIL;
        SubLObject map_items = (SubLObject)html_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(template, template, (SubLObject)html_utilities.$list108);
        src = template.first();
        SubLObject current = template.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, template, (SubLObject)html_utilities.$list108);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, template, (SubLObject)html_utilities.$list108);
        v_default = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, template, (SubLObject)html_utilities.$list108);
        map_items = current.first();
        current = current.rest();
        if (html_utilities.NIL == current) {
            SubLObject x_start = html_extract_multi_submit_input_internal(name, (SubLObject)html_utilities.$str109$_x, args);
            SubLObject y_start = html_extract_multi_submit_input_internal(name, (SubLObject)html_utilities.$str110$_y, args);
            if (x_start.isString() && y_start.isString()) {
                x_start = reader.read_from_string_ignoring_errors(x_start, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                y_start = reader.read_from_string_ignoring_errors(y_start, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                if (x_start.isInteger() && y_start.isInteger()) {
                    SubLObject cdolist_list_var = map_items;
                    SubLObject map_item = (SubLObject)html_utilities.NIL;
                    map_item = cdolist_list_var.first();
                    while (html_utilities.NIL != cdolist_list_var) {
                        SubLObject current_$9;
                        final SubLObject datum_$8 = current_$9 = map_item;
                        SubLObject x_range = (SubLObject)html_utilities.NIL;
                        SubLObject y_range = (SubLObject)html_utilities.NIL;
                        SubLObject value = (SubLObject)html_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$9, datum_$8, (SubLObject)html_utilities.$list111);
                        x_range = current_$9.first();
                        current_$9 = current_$9.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$9, datum_$8, (SubLObject)html_utilities.$list111);
                        y_range = current_$9.first();
                        current_$9 = current_$9.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$9, datum_$8, (SubLObject)html_utilities.$list111);
                        value = current_$9.first();
                        current_$9 = current_$9.rest();
                        if (html_utilities.NIL == current_$9) {
                            if ((html_utilities.NIL == x_range || (x_start.numGE(x_range.first()) && x_start.numLE(conses_high.second(x_range)))) && (html_utilities.NIL == y_range || (y_start.numGE(y_range.first()) && y_start.numLE(conses_high.second(y_range))))) {
                                return value;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$8, (SubLObject)html_utilities.$list111);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        map_item = cdolist_list_var.first();
                    }
                }
            }
            return v_default;
        }
        cdestructuring_bind.cdestructuring_bind_error(template, (SubLObject)html_utilities.$list108);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 39325L)
    public static SubLObject html_extract_multi_submit_input_internal(final SubLObject name, final SubLObject suffix, final SubLObject args) {
        final SubLObject name_length = Sequences.length(name);
        final SubLObject suffix_length = Sequences.length(suffix);
        SubLObject list;
        SubLObject arg;
        SubLObject current;
        SubLObject datum;
        SubLObject arg_name;
        SubLObject value;
        SubLObject arg_name_length;
        for (list = (SubLObject)html_utilities.NIL, list = args; html_utilities.NIL != list; list = list.rest()) {
            arg = list.first();
            if (arg.isCons()) {
                datum = (current = arg);
                arg_name = (SubLObject)html_utilities.NIL;
                value = (SubLObject)html_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list112);
                arg_name = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list112);
                value = current.first();
                current = current.rest();
                if (html_utilities.NIL == current) {
                    arg_name_length = Sequences.length(arg_name);
                    if (arg_name_length.numE(Numbers.add(Sequences.length(name), Sequences.length(suffix))) && html_utilities.NIL != Strings.string_equal(name, arg_name, (SubLObject)html_utilities.ZERO_INTEGER, name_length, (SubLObject)html_utilities.ZERO_INTEGER, name_length) && html_utilities.NIL != Strings.string_equal(suffix, arg_name, (SubLObject)html_utilities.ZERO_INTEGER, suffix_length, name_length, arg_name_length)) {
                        return value;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.$list112);
                }
            }
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 40006L)
    public static SubLObject html_indent_table_internal(final SubLObject indent_width) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            SubLObject i;
            SubLObject _prev_bind_0_$10;
            SubLObject _prev_bind_0_$11;
            for (i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(html_macros.$html_indent_table_max$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_macros.verify_not_within_html_pre();
                    html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                    _prev_bind_0_$11 = html_macros.$within_html_pre$.currentBinding(thread);
                    try {
                        html_macros.$within_html_pre$.bind((SubLObject)html_utilities.T, thread);
                        html_indent(indent_width);
                    }
                    finally {
                        html_macros.$within_html_pre$.rebind(_prev_bind_0_$11, thread);
                    }
                    html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 40356L)
    public static SubLObject html_indent_row_internal(final SubLObject indent_amount) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (indent_amount.numG((SubLObject)html_utilities.ZERO_INTEGER)) {
            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            if (html_utilities.NIL != indent_amount) {
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup(indent_amount);
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            }
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 40561L)
    public static SubLObject html_target_definition(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        if (html_utilities.NIL != name) {
            html_markup(html_macros.$html_anchor_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(name);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 40824L)
    public static SubLObject html_basefont(final SubLObject size) {
        if (html_utilities.NIL != size) {
            html_markup(html_macros.$html_basefont_head$.getGlobalValue());
            html_markup(html_macros.$html_basefont_size$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(size);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 41071L)
    public static SubLObject html_word_break() {
        html_markup(html_macros.$html_word_break$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 41177L)
    public static SubLObject html_print_lexicon_entry(final SubLObject fort) {
        cb_utilities.cb_link((SubLObject)html_utilities.$kw113$LEXICON, fort, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 41408L)
    public static SubLObject html_print_form(final SubLObject form, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == html_utilities.UNPROVIDED) {
            depth = (SubLObject)html_utilities.ZERO_INTEGER;
        }
        if (wrap_axiomsP == html_utilities.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)html_utilities.NIL;
        }
        final SubLObject nautP = term.hl_ground_nautP(form);
        final SubLObject atomic = (SubLObject)((html_utilities.NIL != nautP) ? narts_high.find_nart(form) : html_utilities.NIL);
        if (html_utilities.NIL != nautP && html_utilities.NIL != atomic) {
            cb_utilities.cb_form(atomic, depth, wrap_axiomsP);
        }
        else {
            cb_utilities.cb_form(form, depth, wrap_axiomsP);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 41740L)
    public static SubLObject html_basic_image(final SubLObject name, SubLObject alt, SubLObject align, SubLObject border) {
        if (alt == html_utilities.UNPROVIDED) {
            alt = name;
        }
        if (align == html_utilities.UNPROVIDED) {
            align = (SubLObject)html_utilities.NIL;
        }
        if (border == html_utilities.UNPROVIDED) {
            border = (SubLObject)html_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(system_parameters.$html_image_directory$.getDynamicValue(thread));
        html_markup(name);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != alt) {
            html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(alt);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != align) {
            html_markup(html_macros.$html_image_align$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_align(align));
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != border) {
            html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(border);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_image_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 42163L)
    public static SubLObject html_table_row_list(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            SubLObject cdolist_list_var = items;
            SubLObject item = (SubLObject)html_utilities.NIL;
            item = cdolist_list_var.first();
            while (html_utilities.NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_princ(item);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 42355L)
    public static SubLObject html_table_heading_list(final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            SubLObject cdolist_list_var = items;
            SubLObject item = (SubLObject)html_utilities.NIL;
            item = cdolist_list_var.first();
            while (html_utilities.NIL != cdolist_list_var) {
                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_princ(item);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 42508L)
    public static SubLObject html_percent_progress_bar(final SubLObject sofar, final SubLObject total, SubLObject granularity, SubLObject progress_color, SubLObject remaining_color) {
        if (granularity == html_utilities.UNPROVIDED) {
            granularity = (SubLObject)html_utilities.$int114$100;
        }
        if (progress_color == html_utilities.UNPROVIDED) {
            progress_color = html_macros.$html_color_sat_green$.getGlobalValue();
        }
        if (remaining_color == html_utilities.UNPROVIDED) {
            remaining_color = html_macros.$html_color_sat_red$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_utilities.NIL != Types.integerp(sofar) : sofar;
        assert html_utilities.NIL != Types.integerp(total) : total;
        assert html_utilities.NIL != Types.integerp(granularity) : granularity;
        final SubLObject progress_width = Numbers.truncate(Numbers.multiply(sofar, granularity), total);
        final SubLObject remaining_width = Numbers.subtract(granularity, progress_width);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.ONE_INTEGER);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.ZERO_INTEGER);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.ZERO_INTEGER);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            if (!html_utilities.ZERO_INTEGER.numE(progress_width)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (html_utilities.NIL != progress_color) {
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(progress_color);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    SubLObject i;
                    for (i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(progress_width); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
                        html_glyph((SubLObject)html_utilities.$kw10$NBSP, (SubLObject)html_utilities.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            if (!html_utilities.ZERO_INTEGER.numE(remaining_width)) {
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (html_utilities.NIL != remaining_color) {
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(remaining_color);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    SubLObject i;
                    for (i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(remaining_width); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
                        html_glyph((SubLObject)html_utilities.$kw10$NBSP, (SubLObject)html_utilities.UNPROVIDED);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 43344L)
    public static SubLObject html_fancy_percent_progress_bar(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_utilities.NIL;
        SubLObject current_$16 = (SubLObject)html_utilities.NIL;
        while (html_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_utilities.$list116);
            current_$16 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_utilities.$list116);
            if (html_utilities.NIL == conses_high.member(current_$16, (SubLObject)html_utilities.$list117, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
                bad = (SubLObject)html_utilities.T;
            }
            if (current_$16 == html_utilities.$kw80$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_utilities.NIL != bad && html_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.$list116);
        }
        final SubLObject sofar_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw118$SOFAR, current);
        final SubLObject sofar = (SubLObject)((html_utilities.NIL != sofar_tail) ? conses_high.cadr(sofar_tail) : html_utilities.NIL);
        final SubLObject total_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw119$TOTAL, current);
        final SubLObject total = (SubLObject)((html_utilities.NIL != total_tail) ? conses_high.cadr(total_tail) : html_utilities.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw120$WIDTH, current);
        final SubLObject width = (SubLObject)((html_utilities.NIL != width_tail) ? conses_high.cadr(width_tail) : html_utilities.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw121$HEIGHT, current);
        final SubLObject height = (SubLObject)((html_utilities.NIL != height_tail) ? conses_high.cadr(height_tail) : html_utilities.TWO_INTEGER);
        final SubLObject progress_color_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw122$PROGRESS_COLOR, current);
        final SubLObject progress_color = (SubLObject)((html_utilities.NIL != progress_color_tail) ? conses_high.cadr(progress_color_tail) : html_utilities.$sym123$_HTML_COLOR_SAT_GREEN_);
        final SubLObject remaining_color_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw124$REMAINING_COLOR, current);
        final SubLObject remaining_color = (SubLObject)((html_utilities.NIL != remaining_color_tail) ? conses_high.cadr(remaining_color_tail) : html_utilities.$sym125$_HTML_COLOR_SAT_RED_);
        final SubLObject border_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw126$BORDER, current);
        final SubLObject border = (SubLObject)((html_utilities.NIL != border_tail) ? conses_high.cadr(border_tail) : html_utilities.ZERO_INTEGER);
        final SubLObject width2 = (SubLObject)html_utilities.$sym127$WIDTH1;
        final SubLObject width3 = (SubLObject)html_utilities.$sym128$WIDTH2;
        return (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym129$HTML_FANCY_TABLE, ConsesLow.append((SubLObject)((html_utilities.NIL != width) ? ConsesLow.list((SubLObject)html_utilities.$kw120$WIDTH, width) : html_utilities.NIL), (SubLObject)((html_utilities.NIL != border) ? ConsesLow.list((SubLObject)html_utilities.$kw126$BORDER, border) : html_utilities.NIL), (SubLObject)html_utilities.$list130), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym131$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(width2, width3), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym132$HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS, sofar, total, width), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym133$HTML_FANCY_TABLE_ROW, ConsesLow.append((SubLObject)((html_utilities.NIL != height) ? ConsesLow.list((SubLObject)html_utilities.$kw121$HEIGHT, height) : html_utilities.NIL), (SubLObject)html_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym134$HTML_FANCY_TABLE_DATA, (SubLObject)ConsesLow.list((SubLObject)html_utilities.$kw120$WIDTH, width2, (SubLObject)html_utilities.$kw135$BGCOLOR, progress_color)), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym134$HTML_FANCY_TABLE_DATA, (SubLObject)ConsesLow.list((SubLObject)html_utilities.$kw120$WIDTH, width3, (SubLObject)html_utilities.$kw135$BGCOLOR, remaining_color)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 44036L)
    public static SubLObject html_fancy_percent_progress_bar_widths(final SubLObject sofar, final SubLObject total, final SubLObject width) {
        assert html_utilities.NIL != Types.numberp(sofar) : sofar;
        assert html_utilities.NIL != Types.numberp(total) : total;
        if (sofar.numG(total)) {
            return html_fancy_percent_progress_bar_widths(total, total, width);
        }
        if (sofar.numL((SubLObject)html_utilities.ZERO_INTEGER)) {
            return html_fancy_percent_progress_bar_widths((SubLObject)html_utilities.ZERO_INTEGER, total, width);
        }
        if (total.numLE((SubLObject)html_utilities.ZERO_INTEGER)) {
            return html_fancy_percent_progress_bar_widths(sofar, (SubLObject)html_utilities.ONE_INTEGER, width);
        }
        if (width.isInteger() && width.isPositive()) {
            SubLObject sofar_width = Numbers.truncate(Numbers.divide(Numbers.multiply(sofar, width), total), (SubLObject)html_utilities.UNPROVIDED);
            if (sofar.isPositive()) {
                sofar_width = Numbers.max(sofar_width, (SubLObject)html_utilities.ONE_INTEGER);
            }
            final SubLObject total_width = Numbers.subtract(width, sofar_width);
            return Values.values(sofar_width, total_width);
        }
        return html_fancy_percent_progress_bar_widths(sofar, total, (SubLObject)html_utilities.$int138$1000);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 44937L)
    public static SubLObject html_progress_section(SubLObject message, SubLObject sofar, SubLObject total, SubLObject run_time, SubLObject finish_time) {
        if (message == html_utilities.UNPROVIDED) {
            message = (SubLObject)html_utilities.NIL;
        }
        if (sofar == html_utilities.UNPROVIDED) {
            sofar = (SubLObject)html_utilities.NIL;
        }
        if (total == html_utilities.UNPROVIDED) {
            total = (SubLObject)html_utilities.NIL;
        }
        if (run_time == html_utilities.UNPROVIDED) {
            run_time = (SubLObject)html_utilities.NIL;
        }
        if (finish_time == html_utilities.UNPROVIDED) {
            finish_time = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL != message) {
            html_newline((SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ(message);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_newline((SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != run_time || html_utilities.NIL != sofar) {
            html_newline((SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                if (html_utilities.NIL != run_time) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw139$RIGHT));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw140$TOP));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            if (html_utilities.NIL != finish_time) {
                                html_princ((SubLObject)html_utilities.$str141$Run_Time__);
                            }
                            else {
                                html_princ((SubLObject)html_utilities.$str142$Elapsed_Time__);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            html_indent((SubLObject)html_utilities.TWO_INTEGER);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw143$LEFT));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw140$TOP));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            html_princ(numeric_date_utilities.elapsed_seconds_string(run_time));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
                }
                if (html_utilities.NIL != sofar) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw139$RIGHT));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw140$TOP));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            html_princ((SubLObject)html_utilities.$str144$Current_Total__);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            html_indent((SubLObject)html_utilities.TWO_INTEGER);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw143$LEFT));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw140$TOP));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            html_princ(sofar);
                            if (html_utilities.NIL != total) {
                                html_princ((SubLObject)html_utilities.$str145$_of_);
                                html_princ(total);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        if (html_utilities.NIL != sofar && html_utilities.NIL != total) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_align((SubLObject)html_utilities.$kw139$RIGHT));
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_align((SubLObject)html_utilities.$kw146$CENTER));
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        final SubLObject percent = number_utilities.integer_percent(sofar, total, (SubLObject)html_utilities.UNPROVIDED);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_utilities.$str147$_D_, percent);
                        html_indent((SubLObject)html_utilities.TWO_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_align((SubLObject)html_utilities.$kw143$LEFT));
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_align((SubLObject)html_utilities.$kw146$CENTER));
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        html_percent_progress_bar(sofar, total, (SubLObject)html_utilities.$int114$100, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 47110L)
    public static SubLObject html_horizontal_bar_graph(final SubLObject label_value_pairs, SubLObject outerborder, SubLObject smallerbars, SubLObject color1, SubLObject color2) {
        if (outerborder == html_utilities.UNPROVIDED) {
            outerborder = (SubLObject)html_utilities.TWO_INTEGER;
        }
        if (smallerbars == html_utilities.UNPROVIDED) {
            smallerbars = (SubLObject)html_utilities.NIL;
        }
        if (color1 == html_utilities.UNPROVIDED) {
            color1 = html_macros.$html_color_lighter_blue$.getGlobalValue();
        }
        if (color2 == html_utilities.UNPROVIDED) {
            color2 = html_macros.$html_color_lighter_green$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_utilities.NIL == label_value_pairs) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ((SubLObject)html_utilities.$str148$_No_data_to_graph_);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            return (SubLObject)html_utilities.NIL;
        }
        SubLObject v_switch = (SubLObject)html_utilities.NIL;
        SubLObject newpairs = (SubLObject)html_utilities.NIL;
        SubLObject adjustfactor = (SubLObject)html_utilities.ONE_INTEGER;
        adjustfactor = Numbers.divide((SubLObject)html_utilities.$int114$100, Numbers.max((SubLObject)html_utilities.ONE_INTEGER, Functions.apply(Symbols.symbol_function((SubLObject)html_utilities.$sym149$MAX), Mapping.mapcar(Symbols.symbol_function((SubLObject)html_utilities.$sym150$SECOND), label_value_pairs))));
        SubLObject cdolist_list_var = label_value_pairs;
        SubLObject pair = (SubLObject)html_utilities.NIL;
        pair = cdolist_list_var.first();
        while (html_utilities.NIL != cdolist_list_var) {
            newpairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pair.first(), Numbers.round(Numbers.multiply(conses_high.second(pair), adjustfactor), (SubLObject)html_utilities.UNPROVIDED), conses_high.second(pair)), newpairs);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        final SubLObject workingpairs = Sequences.nreverse(newpairs);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        if (html_utilities.NIL != outerborder) {
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(outerborder);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.FOUR_INTEGER);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.FOUR_INTEGER);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str151$100_);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup((SubLObject)html_utilities.ZERO_INTEGER);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup((SubLObject)html_utilities.ZERO_INTEGER);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup((SubLObject)html_utilities.ZERO_INTEGER);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_macros.$html_table_width$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup((SubLObject)html_utilities.$str151$100_);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        SubLObject cdolist_list_var2 = workingpairs;
                        SubLObject pair2 = (SubLObject)html_utilities.NIL;
                        pair2 = cdolist_list_var2.first();
                        while (html_utilities.NIL != cdolist_list_var2) {
                            final SubLObject label_string = pair2.first();
                            final SubLObject perc_width = conses_high.second(pair2);
                            final SubLObject actual_width = conses_high.third(pair2);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                                final SubLObject widthstring = (SubLObject)(perc_width.isZero() ? html_utilities.$str152$1_ : Sequences.cconcatenate(format_nil.format_nil_a_no_copy(perc_width), (SubLObject)html_utilities.$str153$_));
                                final SubLObject switchedcolor = (html_utilities.NIL != v_switch) ? color1 : color2;
                                html_draw_bargraph_label(label_string);
                                html_draw_bargraph_colorbar(widthstring, actual_width, switchedcolor, smallerbars);
                                v_switch = (SubLObject)SubLObjectFactory.makeBoolean(html_utilities.NIL == v_switch);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            pair2 = cdolist_list_var2.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 49112L)
    public static SubLObject html_draw_bargraph_label(final SubLObject labelstring) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_align((SubLObject)html_utilities.$kw139$RIGHT));
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str154$5_);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            html_princ(labelstring);
            html_indent((SubLObject)html_utilities.TWO_INTEGER);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 49403L)
    public static SubLObject html_draw_bargraph_colorbar(final SubLObject widthstring, final SubLObject actualwidth, final SubLObject bgcolor, final SubLObject smallbars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str155$95_);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_width$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.$str151$100_);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (html_utilities.NIL != bgcolor) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(bgcolor);
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    if (html_utilities.NIL != widthstring) {
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(widthstring);
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        final SubLObject size_val = (SubLObject)html_utilities.TWO_INTEGER;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (html_utilities.NIL != size_val) {
                            html_markup(html_macros.$html_font_size$.getGlobalValue());
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                            html_markup(size_val);
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        }
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_utilities.$str156$__D, actualwidth);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        if (html_utilities.NIL != smallbars) {
                            final SubLObject size_val = (SubLObject)html_utilities.TWO_INTEGER;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (html_utilities.NIL != size_val) {
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                                html_markup(size_val);
                                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                            }
                            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                                html_glyph((SubLObject)html_utilities.$kw10$NBSP, (SubLObject)html_utilities.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                        }
                        else {
                            html_glyph((SubLObject)html_utilities.$kw10$NBSP, (SubLObject)html_utilities.UNPROVIDED);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 50228L)
    public static SubLObject html_control_parameter_chooser(final SubLObject parameter, SubLObject descriptionP) {
        if (descriptionP == html_utilities.UNPROVIDED) {
            descriptionP = (SubLObject)html_utilities.NIL;
        }
        assert html_utilities.NIL != Types.symbolp(parameter) : parameter;
        SubLObject fancy_name = Symbols.get(parameter, (SubLObject)html_utilities.$kw158$FANCY_NAME, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject description = Symbols.get(parameter, (SubLObject)html_utilities.$kw159$DESCRIPTION, (SubLObject)html_utilities.UNPROVIDED);
        SubLObject settings_spec = Symbols.get(parameter, (SubLObject)html_utilities.$kw160$SETTINGS_SPEC, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != Symbols.boundp(parameter)) {
            if (html_utilities.NIL == fancy_name) {
                fancy_name = Symbols.symbol_name(parameter);
            }
            if (html_utilities.NIL == settings_spec) {
                settings_spec = (SubLObject)html_utilities.$list161;
            }
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ(fancy_name);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            if (html_utilities.NIL != descriptionP) {
                html_newline((SubLObject)html_utilities.UNPROVIDED);
                html_princ_doc_string(description, (SubLObject)html_utilities.UNPROVIDED);
            }
            final SubLObject entry_name = html_control_parameter_entry_name(parameter);
            final SubLObject radio_name = html_control_parameter_radio_name(parameter);
            final SubLObject some_entryP = Sequences.find((SubLObject)html_utilities.$kw162$ENTRY, settings_spec, Symbols.symbol_function((SubLObject)html_utilities.EQL), Symbols.symbol_function((SubLObject)html_utilities.$sym163$FIRST), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject current_value = Eval.eval(parameter);
            final SubLObject total_settings = Sequences.length(settings_spec);
            SubLObject index = (SubLObject)html_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var = settings_spec;
            SubLObject setting_spec = (SubLObject)html_utilities.NIL;
            setting_spec = cdolist_list_var.first();
            while (html_utilities.NIL != cdolist_list_var) {
                html_newline((SubLObject)html_utilities.UNPROVIDED);
                SubLObject current;
                final SubLObject datum = current = setting_spec;
                SubLObject type = (SubLObject)html_utilities.NIL;
                SubLObject datum_$38 = (SubLObject)html_utilities.NIL;
                SubLObject possibility_fancy_name = (SubLObject)html_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list164);
                type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list164);
                datum_$38 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list164);
                possibility_fancy_name = current.first();
                current = current.rest();
                if (html_utilities.NIL == current) {
                    SubLObject radio_checkedP = (SubLObject)html_utilities.NIL;
                    SubLObject entry_default = (SubLObject)html_utilities.NIL;
                    if (total_settings.numE((SubLObject)html_utilities.ONE_INTEGER)) {
                        radio_checkedP = (SubLObject)html_utilities.T;
                    }
                    else if (type == html_utilities.$kw162$ENTRY) {
                        radio_checkedP = Functions.funcall(datum_$38, current_value);
                    }
                    else {
                        radio_checkedP = Equality.equal(current_value, datum_$38);
                    }
                    if (html_utilities.NIL != radio_checkedP && type == html_utilities.$kw162$ENTRY) {
                        entry_default = print_high.princ_to_string(current_value);
                    }
                    if (total_settings.numE((SubLObject)html_utilities.ONE_INTEGER)) {
                        html_hidden_input(radio_name, index, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    else {
                        if (html_utilities.NIL != some_entryP) {
                            if (type == html_utilities.$kw162$ENTRY) {
                                html_script_utilities.html_focus_radio_input(radio_name, entry_name, index, radio_checkedP, (SubLObject)html_utilities.UNPROVIDED);
                            }
                            else {
                                html_script_utilities.html_clear_radio_input(radio_name, entry_name, index, radio_checkedP, (SubLObject)html_utilities.UNPROVIDED);
                            }
                        }
                        else {
                            html_radio_input(radio_name, index, radio_checkedP, (SubLObject)html_utilities.UNPROVIDED);
                        }
                        html_indent((SubLObject)html_utilities.UNPROVIDED);
                    }
                    if (type == html_utilities.$kw162$ENTRY) {
                        SubLObject entry_format = html_macros.html_parameter_entry_format(parameter);
                        if (html_utilities.NIL == entry_format) {
                            entry_format = (SubLObject)html_utilities.$list165;
                        }
                        SubLObject current_$40;
                        final SubLObject datum_$39 = current_$40 = entry_format;
                        SubLObject type_$41 = (SubLObject)html_utilities.NIL;
                        SubLObject size = (SubLObject)html_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$40, datum_$39, (SubLObject)html_utilities.$list166);
                        type_$41 = current_$40.first();
                        current_$40 = current_$40.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$40, datum_$39, (SubLObject)html_utilities.$list166);
                        size = current_$40.first();
                        current_$40 = current_$40.rest();
                        if (html_utilities.NIL == current_$40) {
                            final SubLObject pcase_var = type_$41;
                            if (pcase_var.eql((SubLObject)html_utilities.$kw167$TEXT)) {
                                html_text_input(entry_name, entry_default, size);
                            }
                            else {
                                html_text_input(entry_name, entry_default, (SubLObject)html_utilities.UNPROVIDED);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$39, (SubLObject)html_utilities.$list166);
                        }
                        html_indent((SubLObject)html_utilities.UNPROVIDED);
                    }
                    html_princ(possibility_fancy_name);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.$list164);
                }
                index = Numbers.add(index, (SubLObject)html_utilities.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                setting_spec = cdolist_list_var.first();
            }
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 52758L)
    public static SubLObject html_extract_control_parameter_value(final SubLObject parameter, final SubLObject args) {
        assert html_utilities.NIL != Types.symbolp(parameter) : parameter;
        final SubLObject fancy_name = Symbols.get(parameter, (SubLObject)html_utilities.$kw158$FANCY_NAME, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject settings_spec = Symbols.get(parameter, (SubLObject)html_utilities.$kw160$SETTINGS_SPEC, (SubLObject)html_utilities.UNPROVIDED);
        SubLObject new_value = (SubLObject)html_utilities.NIL;
        SubLObject invalid_explanation = (SubLObject)html_utilities.NIL;
        if (html_utilities.NIL != fancy_name && html_utilities.NIL != settings_spec && html_utilities.NIL != Symbols.boundp(parameter)) {
            final SubLObject radio_name = html_control_parameter_radio_name(parameter);
            final SubLObject radio_choice = html_extract_input(radio_name, args);
            if (html_utilities.NIL != radio_choice) {
                final SubLObject setting_spec = ConsesLow.nth(reader.read_from_string_ignoring_errors(radio_choice, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED), settings_spec);
                SubLObject current;
                final SubLObject datum = current = setting_spec;
                SubLObject type = (SubLObject)html_utilities.NIL;
                SubLObject datum_$42 = (SubLObject)html_utilities.NIL;
                SubLObject possibility_fancy_name = (SubLObject)html_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list164);
                type = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list164);
                datum_$42 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list164);
                possibility_fancy_name = current.first();
                current = current.rest();
                if (html_utilities.NIL == current) {
                    if (type == html_utilities.$kw162$ENTRY) {
                        final SubLObject entry_name = html_control_parameter_entry_name(parameter);
                        final SubLObject entry_string = html_extract_input(entry_name, args);
                        if (html_utilities.NIL != entry_string) {
                            if (html_utilities.NIL != Functions.funcall(datum_$42, entry_string)) {
                                new_value = entry_string;
                            }
                            else {
                                final SubLObject value = reader.read_from_string_ignoring_errors(entry_string, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                                if (html_utilities.NIL != Functions.funcall(datum_$42, value)) {
                                    new_value = value;
                                }
                                else {
                                    invalid_explanation = Sequences.cconcatenate((SubLObject)html_utilities.$str168$The_value_entered_for__, new SubLObject[] { format_nil.format_nil_a_no_copy(fancy_name), html_utilities.$str169$__was_not_valid_ });
                                }
                            }
                        }
                        else {
                            invalid_explanation = Sequences.cconcatenate((SubLObject)html_utilities.$str170$No_value_was_entered_for__, new SubLObject[] { format_nil.format_nil_a_no_copy(fancy_name), html_utilities.$str171$__ });
                        }
                    }
                    else {
                        new_value = datum_$42;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.$list164);
                }
            }
            else {
                invalid_explanation = Sequences.cconcatenate((SubLObject)html_utilities.$str172$No_choice_was_made_for__, new SubLObject[] { format_nil.format_nil_a_no_copy(fancy_name), html_utilities.$str171$__ });
            }
        }
        else {
            invalid_explanation = Sequences.cconcatenate(format_nil.format_nil_s_no_copy(parameter), (SubLObject)html_utilities.$str173$_is_not_a_declared_control_parame);
        }
        return Values.values(new_value, invalid_explanation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 54507L)
    public static SubLObject html_set_control_parameter(final SubLObject parameter, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = html_extract_control_parameter_value(parameter, args);
        final SubLObject error_message = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (html_utilities.NIL != error_message) {
            cb_utilities.cb_error(error_message, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
            return (SubLObject)html_utilities.NIL;
        }
        Eval.eval((SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym174$CSETQ, parameter, (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym175$QUOTE, value)));
        return (SubLObject)html_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 54941L)
    public static SubLObject html_control_parameter_entry_name(final SubLObject parameter) {
        final SubLObject name = Symbols.symbol_name(parameter);
        return Sequences.cconcatenate((SubLObject)html_utilities.$str176$entry_, format_nil.format_nil_a_no_copy(name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 55142L)
    public static SubLObject html_control_parameter_radio_name(final SubLObject parameter) {
        final SubLObject name = Symbols.symbol_name(parameter);
        return Sequences.cconcatenate((SubLObject)html_utilities.$str177$radio_, format_nil.format_nil_a_no_copy(name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 55329L)
    public static SubLObject html_select_from_list(final SubLObject name, final SubLObject selected_option_content, final SubLObject option_contents, SubLObject option_values) {
        if (option_values == html_utilities.UNPROVIDED) {
            option_values = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_select_head$.getGlobalValue());
        html_markup(html_macros.$html_select_name$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(name);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            SubLObject option_content = (SubLObject)html_utilities.NIL;
            SubLObject option_content_$43 = (SubLObject)html_utilities.NIL;
            SubLObject option_value = (SubLObject)html_utilities.NIL;
            SubLObject option_value_$44 = (SubLObject)html_utilities.NIL;
            option_content = option_contents;
            option_content_$43 = option_content.first();
            option_value = option_values;
            option_value_$44 = option_value.first();
            while (html_utilities.NIL != option_value || html_utilities.NIL != option_content) {
                final SubLObject selectedP = Equality.equal(option_content_$43, selected_option_content);
                html_markup(html_macros.$html_option_head$.getGlobalValue());
                if (html_utilities.NIL != selectedP) {
                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                }
                if (html_utilities.NIL != option_value_$44) {
                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(option_value_$44);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_princ(option_content_$43);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                }
                html_markup(html_macros.$html_option_tail$.getGlobalValue());
                option_content = option_content.rest();
                option_content_$43 = option_content.first();
                option_value = option_value.rest();
                option_value_$44 = option_value.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_select_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 56527L)
    public static SubLObject matching_html_field(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && v_object.first().equalp(html_utilities.$html_extract_field_name$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 56696L)
    public static SubLObject matching_html_button_field(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && conses_high.second(v_object).equalp(html_utilities.$html_extract_field_name$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 56887L)
    public static SubLObject html_extract_input(final SubLObject field_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_utilities.NIL != Types.stringp(field_name) : field_name;
        assert html_utilities.NIL != Types.listp(args) : args;
        SubLObject ans = (SubLObject)html_utilities.NIL;
        final SubLObject _prev_bind_0 = html_utilities.$html_extract_field_name$.currentBinding(thread);
        try {
            html_utilities.$html_extract_field_name$.bind(field_name, thread);
            ans = Sequences.find_if(Symbols.symbol_function((SubLObject)html_utilities.$sym179$MATCHING_HTML_FIELD), args, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
        }
        finally {
            html_utilities.$html_extract_field_name$.rebind(_prev_bind_0, thread);
        }
        return conses_high.second(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 57212L)
    public static SubLObject html_extract_input_values(final SubLObject field_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_utilities.NIL != Types.stringp(field_name) : field_name;
        assert html_utilities.NIL != Types.listp(args) : args;
        SubLObject ans = (SubLObject)html_utilities.NIL;
        final SubLObject _prev_bind_0 = html_utilities.$html_extract_field_name$.currentBinding(thread);
        try {
            html_utilities.$html_extract_field_name$.bind(field_name, thread);
            SubLObject cdolist_list_var = args;
            SubLObject arg = (SubLObject)html_utilities.NIL;
            arg = cdolist_list_var.first();
            while (html_utilities.NIL != cdolist_list_var) {
                if (html_utilities.NIL != matching_html_field(arg)) {
                    ans = (SubLObject)ConsesLow.cons(conses_high.second(arg), ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        finally {
            html_utilities.$html_extract_field_name$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 57601L)
    public static SubLObject html_extract_value(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        SubLObject result = html_extract_input(field_name, html_args);
        if (html_utilities.NIL == result) {
            result = v_default;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 57919L)
    public static SubLObject html_extract_integer(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = html_extract_value(field_name, html_args, (SubLObject)html_utilities.NIL);
        SubLObject v_int = v_default;
        if (html_utilities.NIL != Sequences.find_if((SubLObject)html_utilities.$sym180$DIGIT_CHAR_P, str, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
            SubLObject ignore_errors_tag = (SubLObject)html_utilities.NIL;
            try {
                thread.throwStack.push(html_utilities.$kw181$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)html_utilities.$sym182$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        v_int = reader.parse_integer(str, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)html_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)html_utilities.$kw181$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return v_int;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 58264L)
    public static SubLObject html_extract_date(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = html_extract_value(field_name, html_args, v_default);
        SubLObject dates = v_default;
        SubLObject ignore_errors_tag = (SubLObject)html_utilities.NIL;
        try {
            thread.throwStack.push(html_utilities.$kw181$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)html_utilities.$sym182$IGNORE_ERRORS_HANDLER), thread);
                try {
                    dates = date_utilities.parse_date_from_string_fast(str, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)html_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)html_utilities.$kw181$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return dates;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 58697L)
    public static SubLObject html_extract_keyword(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.$kw183$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = html_extract_value(field_name, html_args, v_default);
        SubLObject kwd = v_default;
        SubLObject ignore_errors_tag = (SubLObject)html_utilities.NIL;
        try {
            thread.throwStack.push(html_utilities.$kw181$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)html_utilities.$sym182$IGNORE_ERRORS_HANDLER), thread);
                try {
                    kwd = Symbols.make_keyword(Strings.string_upcase(str, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)html_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)html_utilities.$kw181$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return kwd;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 59026L)
    public static SubLObject html_extract_string(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.$str47$;
        }
        return html_extract_value(field_name, html_args, v_default);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 59243L)
    public static SubLObject html_extract_boolean(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        return list_utilities.sublisp_boolean(html_extract_value(field_name, html_args, v_default));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 59464L)
    public static SubLObject html_extract_sexpr(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        return html_extract_sexpr_int(field_name, html_args, v_default, (SubLObject)html_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 59688L)
    public static SubLObject html_extract_cyclified_sexpr(final SubLObject field_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        if (html_utilities.$str47$.equal(html_extract_input(field_name, html_args))) {
            return v_default;
        }
        return html_extract_sexpr_int(field_name, html_args, v_default, (SubLObject)html_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 60022L)
    public static SubLObject html_extract_sexpr_int(final SubLObject field_name, final SubLObject html_args, final SubLObject v_default, final SubLObject cyclifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = reader.$read_eval$.currentBinding(thread);
        try {
            reader.$read_eval$.bind((SubLObject)html_utilities.NIL, thread);
            final SubLObject value = html_extract_input(field_name, html_args);
            final SubLObject clean_value = (html_utilities.NIL != value && html_utilities.NIL != cyclifyP) ? string_utilities.cyclify_string(value) : value;
            final SubLObject sexpr = (html_utilities.NIL != value) ? reader.read_from_string_ignoring_errors(clean_value, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED) : v_default;
            return sexpr;
        }
        finally {
            reader.$read_eval$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 60403L)
    public static SubLObject html_extract_button_value(final SubLObject button_name, final SubLObject html_args, SubLObject v_default) {
        if (v_default == html_utilities.UNPROVIDED) {
            v_default = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert html_utilities.NIL != Types.stringp(button_name) : button_name;
        assert html_utilities.NIL != Types.listp(html_args) : html_args;
        SubLObject ans = (SubLObject)html_utilities.NIL;
        final SubLObject _prev_bind_0 = html_utilities.$html_extract_field_name$.currentBinding(thread);
        try {
            html_utilities.$html_extract_field_name$.bind(button_name, thread);
            ans = Sequences.find_if(Symbols.symbol_function((SubLObject)html_utilities.$sym185$MATCHING_HTML_BUTTON_FIELD), html_args, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
        }
        finally {
            html_utilities.$html_extract_field_name$.rebind(_prev_bind_0, thread);
        }
        return ans.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 60798L)
    public static SubLObject decode_html_language_abbreviation(final SubLObject lang_value) {
        SubLObject lang = (SubLObject)html_utilities.NIL;
        if (lang_value.equalp((SubLObject)html_utilities.$str186$en)) {
            lang = html_utilities.$const187$EnglishLanguage;
        }
        else if (lang_value.equalp((SubLObject)html_utilities.$str188$en_gb)) {
            lang = html_utilities.$const189$BritishEnglishDialect;
        }
        else if (lang_value.equalp((SubLObject)html_utilities.$str190$fr)) {
            lang = html_utilities.$const191$FrenchLanguage;
        }
        else if (lang_value.equalp((SubLObject)html_utilities.$str192$de)) {
            lang = html_utilities.$const193$GermanLanguage;
        }
        else {
            lang = kb_mapping_utilities.fpred_value_in_any_mt(lang_value, html_utilities.$const194$languageCodeDigraph, (SubLObject)html_utilities.TWO_INTEGER, (SubLObject)html_utilities.ONE_INTEGER, (SubLObject)html_utilities.UNPROVIDED);
        }
        return lang;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 61286L)
    public static SubLObject html_glyph(final SubLObject glyph, SubLObject n) {
        if (n == html_utilities.UNPROVIDED) {
            n = (SubLObject)html_utilities.ONE_INTEGER;
        }
        assert html_utilities.NIL != Types.symbolp(glyph) : glyph;
        final SubLObject markup = html_glyph_markup(glyph);
        if (markup.isString()) {
            SubLObject i;
            for (i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
                html_markup(markup);
            }
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 61594L)
    public static SubLObject html_glyph_markup(final SubLObject glyph) {
        return Symbols.get(glyph, (SubLObject)html_utilities.$kw195$HTML_GLYPH, (SubLObject)html_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 61676L)
    public static SubLObject html_declare_glyph(final SubLObject glyph, final SubLObject markup) {
        assert html_utilities.NIL != Types.symbolp(glyph) : glyph;
        assert html_utilities.NIL != Types.stringp(markup) : markup;
        Symbols.put(glyph, (SubLObject)html_utilities.$kw195$HTML_GLYPH, markup);
        return glyph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 83307L)
    public static SubLObject html_unicode_char(final SubLObject unicode_identifier, SubLObject n) {
        if (n == html_utilities.UNPROVIDED) {
            n = (SubLObject)html_utilities.ONE_INTEGER;
        }
        assert html_utilities.NIL != string_utilities.hex_char_string_p(unicode_identifier) : unicode_identifier;
        SubLObject i;
        for (i = (SubLObject)html_utilities.NIL, i = (SubLObject)html_utilities.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)html_utilities.ONE_INTEGER)) {
            html_markup(Sequences.cconcatenate((SubLObject)html_utilities.$str668$__, new SubLObject[] { unicode_identifier, html_utilities.$str8$_ }));
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 83710L)
    public static SubLObject html_create_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script) {
        if (values == html_utilities.UNPROVIDED) {
            values = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        if (choice_offset == html_utilities.UNPROVIDED) {
            choice_offset = (SubLObject)html_utilities.NIL;
        }
        if (script == html_utilities.UNPROVIDED) {
            script = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_select_head$.getGlobalValue());
        html_markup(html_macros.$html_select_name$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(field_name);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != size) {
            html_markup(html_macros.$html_select_size$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(size);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(script);
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            SubLObject list_var = (SubLObject)html_utilities.NIL;
            SubLObject item = (SubLObject)html_utilities.NIL;
            SubLObject i = (SubLObject)html_utilities.NIL;
            list_var = choices;
            item = list_var.first();
            for (i = (SubLObject)html_utilities.ZERO_INTEGER; html_utilities.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = Numbers.add((SubLObject)html_utilities.ONE_INTEGER, i)) {
                final SubLObject is_selectedP = Equality.eql(i, choice_offset);
                final SubLObject value = (SubLObject)((html_utilities.NIL != list_utilities.lengthG(values, i, (SubLObject)html_utilities.UNPROVIDED)) ? Sequences.elt(values, i) : html_utilities.NIL);
                html_markup(html_macros.$html_option_head$.getGlobalValue());
                if (html_utilities.NIL != is_selectedP) {
                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                }
                if (html_utilities.NIL != value) {
                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(value);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_princ(item);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                }
                html_markup(html_macros.$html_option_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_select_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 84680L)
    public static SubLObject html_create_radiobox_form(final SubLObject form_name, final SubLObject choices, SubLObject values, SubLObject choice_offset, SubLObject same_lineP) {
        if (values == html_utilities.UNPROVIDED) {
            values = (SubLObject)html_utilities.NIL;
        }
        if (choice_offset == html_utilities.UNPROVIDED) {
            choice_offset = (SubLObject)html_utilities.NIL;
        }
        if (same_lineP == html_utilities.UNPROVIDED) {
            same_lineP = (SubLObject)html_utilities.NIL;
        }
        SubLObject list_var = (SubLObject)html_utilities.NIL;
        SubLObject item = (SubLObject)html_utilities.NIL;
        SubLObject i = (SubLObject)html_utilities.NIL;
        list_var = choices;
        item = list_var.first();
        for (i = (SubLObject)html_utilities.ZERO_INTEGER; html_utilities.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = Numbers.add((SubLObject)html_utilities.ONE_INTEGER, i)) {
            final SubLObject is_selectedP = Equality.eql(i, choice_offset);
            final SubLObject user_value = Sequences.elt(values, i);
            final SubLObject form_value = (html_utilities.NIL != user_value) ? user_value : item;
            if (html_utilities.NIL != string_utilities.non_empty_stringP(item)) {
                html_radio_input(form_name, form_value, is_selectedP, (SubLObject)html_utilities.UNPROVIDED);
                html_indent((SubLObject)html_utilities.UNPROVIDED);
                html_princ(item);
            }
            if (html_utilities.NIL != same_lineP) {
                html_indent((SubLObject)html_utilities.UNPROVIDED);
            }
            else {
                html_newline((SubLObject)html_utilities.UNPROVIDED);
            }
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 85658L)
    public static SubLObject html_create_multiple_selection_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets) {
        if (values == html_utilities.UNPROVIDED) {
            values = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        if (choice_offsets == html_utilities.UNPROVIDED) {
            choice_offsets = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_select_head$.getGlobalValue());
        html_markup(html_macros.$html_select_name$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup(field_name);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_simple_attribute(html_macros.$html_select_multiple$.getGlobalValue());
        if (html_utilities.NIL != size) {
            html_markup(html_macros.$html_select_size$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(size);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            SubLObject list_var = (SubLObject)html_utilities.NIL;
            SubLObject item = (SubLObject)html_utilities.NIL;
            SubLObject i = (SubLObject)html_utilities.NIL;
            list_var = choices;
            item = list_var.first();
            for (i = (SubLObject)html_utilities.ZERO_INTEGER; html_utilities.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), i = Numbers.add((SubLObject)html_utilities.ONE_INTEGER, i)) {
                final SubLObject is_selectedP = conses_high.member(i, choice_offsets, Symbols.symbol_function((SubLObject)html_utilities.EQL), (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject value = Sequences.elt(values, i);
                html_markup(html_macros.$html_option_head$.getGlobalValue());
                if (html_utilities.NIL != is_selectedP) {
                    html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                }
                if (html_utilities.NIL != value) {
                    html_markup(html_macros.$html_option_value$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(value);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_princ(item);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_markup(html_macros.$html_option_tail$.getGlobalValue());
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_select_tail$.getGlobalValue());
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 86480L)
    public static SubLObject html_create_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset, SubLObject script) {
        if (values == html_utilities.UNPROVIDED) {
            values = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        if (choice_offset == html_utilities.UNPROVIDED) {
            choice_offset = (SubLObject)html_utilities.NIL;
        }
        if (script == html_utilities.UNPROVIDED) {
            script = (SubLObject)html_utilities.NIL;
        }
        return html_create_listbox(field_name, choices, values, size, choice_offset, script);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 86830L)
    public static SubLObject html_create_simple_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject default_choice) {
        if (default_choice == html_utilities.UNPROVIDED) {
            default_choice = (SubLObject)html_utilities.NIL;
        }
        return html_create_listbox(field_name, choices, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.ONE_INTEGER, Sequences.position(default_choice, choices, Symbols.symbol_function((SubLObject)html_utilities.EQUAL), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED), (SubLObject)html_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 87175L)
    public static SubLObject create_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset) {
        if (values == html_utilities.UNPROVIDED) {
            values = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        if (choice_offset == html_utilities.UNPROVIDED) {
            choice_offset = (SubLObject)html_utilities.NIL;
        }
        return html_create_listbox(field_name, choices, values, size, choice_offset, (SubLObject)html_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 87390L)
    public static SubLObject create_multiple_selection_listbox(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offsets) {
        if (values == html_utilities.UNPROVIDED) {
            values = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        if (choice_offsets == html_utilities.UNPROVIDED) {
            choice_offsets = (SubLObject)html_utilities.NIL;
        }
        return html_create_multiple_selection_listbox(field_name, choices, values, size, choice_offsets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 87665L)
    public static SubLObject create_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject values, SubLObject size, SubLObject choice_offset) {
        if (values == html_utilities.UNPROVIDED) {
            values = (SubLObject)html_utilities.NIL;
        }
        if (size == html_utilities.UNPROVIDED) {
            size = (SubLObject)html_utilities.NIL;
        }
        if (choice_offset == html_utilities.UNPROVIDED) {
            choice_offset = (SubLObject)html_utilities.NIL;
        }
        return html_create_dropdown_list(field_name, choices, values, size, choice_offset, (SubLObject)html_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 87898L)
    public static SubLObject create_simple_dropdown_list(final SubLObject field_name, final SubLObject choices, SubLObject default_choice) {
        if (default_choice == html_utilities.UNPROVIDED) {
            default_choice = (SubLObject)html_utilities.NIL;
        }
        return html_create_simple_dropdown_list(field_name, choices, default_choice);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 88130L)
    public static SubLObject get_encoded_form_field_name(final SubLObject basic_name) {
        return encode_form_field_name(basic_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 88472L)
    public static SubLObject extract_encoded_form_field_value(final SubLObject unencoded_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)html_utilities.NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
            final SubLObject encoded_field_name = get_encoded_form_field_name(unencoded_name);
            ans = html_extract_input(encoded_field_name, args);
        }
        finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 88913L)
    public static SubLObject encode_form_field_name(final SubLObject basic_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread).isInteger()) {
            return Sequences.cconcatenate(basic_name, new SubLObject[] { html_utilities.$str669$_, print_high.princ_to_string(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread)) });
        }
        return basic_name;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 89389L)
    public static SubLObject html_echo_args(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup((SubLObject)html_utilities.$str670$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (html_utilities.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.$str671$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == html_utilities.$kw672$UNINITIALIZED) ? ConsesLow.list(html_utilities.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ((SubLObject)html_utilities.$str673$Echo_of_ARGS);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$48 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)html_utilities.T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (html_utilities.NIL != color_value) {
                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_color(color_value));
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup((SubLObject)html_utilities.TWO_INTEGER);
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    html_princ((SubLObject)html_utilities.$str673$Echo_of_ARGS);
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup((SubLObject)html_utilities.TWO_INTEGER);
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)html_utilities.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        cb_utilities.cb_back_button((SubLObject)html_utilities.$kw674$SELF, (SubLObject)html_utilities.$str675$Back);
                        html_macros.verify_not_within_html_pre();
                        html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                        final SubLObject _prev_bind_0_$51 = html_macros.$within_html_pre$.currentBinding(thread);
                        try {
                            html_macros.$within_html_pre$.bind((SubLObject)html_utilities.T, thread);
                            SubLObject cdolist_list_var = args;
                            SubLObject arg = (SubLObject)html_utilities.NIL;
                            arg = cdolist_list_var.first();
                            while (html_utilities.NIL != cdolist_list_var) {
                                html_prin1(arg);
                                html_terpri((SubLObject)html_utilities.UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                arg = cdolist_list_var.first();
                            }
                        }
                        finally {
                            html_macros.$within_html_pre$.rebind(_prev_bind_0_$51, thread);
                        }
                        html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                    }
                    html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
                    html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$48, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 89702L)
    public static SubLObject html_echo_file(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject filename = (SubLObject)html_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)html_utilities.$list678);
        filename = args.first();
        final SubLObject current = args.rest();
        if (html_utilities.NIL == current) {
            SubLObject stream = (SubLObject)html_utilities.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)html_utilities.NIL, thread);
                    stream = compatibility.open_text(filename, (SubLObject)html_utilities.$kw679$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)html_utilities.$str680$Unable_to_open__S, filename);
                }
                SubLObject s;
                SubLObject v_char;
                for (s = stream, v_char = (SubLObject)html_utilities.NIL, v_char = streams_high.read_char(s, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, (SubLObject)html_utilities.UNPROVIDED); html_utilities.$kw15$EOF != v_char; v_char = streams_high.read_char(s, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, (SubLObject)html_utilities.UNPROVIDED)) {
                    html_char(v_char, (SubLObject)html_utilities.UNPROVIDED);
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)html_utilities.$list678);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 89953L)
    public static SubLObject remove_html_tags(final SubLObject string, SubLObject separator_string) {
        if (separator_string == html_utilities.UNPROVIDED) {
            separator_string = (SubLObject)html_utilities.$str41$_;
        }
        final SubLObject open = (SubLObject)html_utilities.$str23$_;
        final SubLObject close = (SubLObject)html_utilities.$str25$_;
        final SubLObject quote = (SubLObject)html_utilities.$str682$_;
        final SubLObject open_comment = (SubLObject)html_utilities.$str683$____;
        final SubLObject close_comment = (SubLObject)html_utilities.$str684$___;
        final SubLObject open_script = (SubLObject)html_utilities.$str685$_script;
        final SubLObject close_script = (SubLObject)html_utilities.$str686$__script_;
        final SubLObject html_string1 = string_utilities.string_substitute((SubLObject)html_utilities.$str685$_script, (SubLObject)html_utilities.$str685$_script, string, Symbols.symbol_function((SubLObject)html_utilities.EQUALP));
        final SubLObject html_string2 = string_utilities.string_substitute((SubLObject)html_utilities.$str687$__script, (SubLObject)html_utilities.$str687$__script, html_string1, Symbols.symbol_function((SubLObject)html_utilities.EQUALP));
        final SubLObject strings = string_utilities.string_tokenize(html_string2, (SubLObject)ConsesLow.list(open_comment, close_comment, open_script, close_script, open, close, quote), (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.T, (SubLObject)html_utilities.T, (SubLObject)html_utilities.$list688, (SubLObject)html_utilities.UNPROVIDED);
        SubLObject in_tagP = (SubLObject)html_utilities.NIL;
        SubLObject in_commentP = (SubLObject)html_utilities.NIL;
        SubLObject in_scriptP = (SubLObject)html_utilities.NIL;
        SubLObject in_quoteP = (SubLObject)html_utilities.NIL;
        SubLObject tagless_string = (SubLObject)html_utilities.NIL;
        SubLObject stream = (SubLObject)html_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject cdolist_list_var = strings;
            SubLObject substring = (SubLObject)html_utilities.NIL;
            substring = cdolist_list_var.first();
            while (html_utilities.NIL != cdolist_list_var) {
                if (html_utilities.NIL != in_commentP) {
                    if (substring.equalp(close_comment)) {
                        in_commentP = (SubLObject)html_utilities.NIL;
                    }
                }
                else if (html_utilities.NIL != in_scriptP) {
                    if (substring.equalp(open_comment)) {
                        in_commentP = (SubLObject)html_utilities.T;
                    }
                    else if (substring.equalp(close_script)) {
                        in_scriptP = (SubLObject)html_utilities.NIL;
                    }
                }
                else if (html_utilities.NIL != in_tagP) {
                    if (html_utilities.NIL != in_quoteP) {
                        if (substring.equalp(quote)) {
                            in_quoteP = (SubLObject)html_utilities.NIL;
                        }
                    }
                    else if (substring.equalp(open_comment)) {
                        in_commentP = (SubLObject)html_utilities.T;
                    }
                    else if (substring.equalp(quote)) {
                        in_quoteP = (SubLObject)html_utilities.T;
                    }
                    else if (substring.equalp(close)) {
                        in_tagP = (SubLObject)html_utilities.NIL;
                    }
                }
                else if (substring.equalp(open_comment)) {
                    in_commentP = (SubLObject)html_utilities.T;
                }
                else if (substring.equalp(open_script)) {
                    in_scriptP = (SubLObject)html_utilities.T;
                    if (html_utilities.NIL == string_utilities.empty_string_p(separator_string)) {
                        print_high.princ(separator_string, stream);
                    }
                }
                else if (substring.equalp(open)) {
                    in_tagP = (SubLObject)html_utilities.T;
                    if (html_utilities.NIL == string_utilities.empty_string_p(separator_string)) {
                        print_high.princ(separator_string, stream);
                    }
                }
                else if (html_utilities.NIL == string_utilities.empty_string_p(substring)) {
                    print_high.princ(substring, stream);
                }
                cdolist_list_var = cdolist_list_var.rest();
                substring = cdolist_list_var.first();
            }
            tagless_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)html_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)html_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return tagless_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 92147L)
    public static SubLObject convert_html_to_text(final SubLObject html_text) {
        return remove_html_tags(html_text, (SubLObject)html_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 92868L)
    public static SubLObject url_to_text(SubLObject url) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)html_utilities.NIL;
        SubLObject ignore_errors_tag = (SubLObject)html_utilities.NIL;
        try {
            thread.throwStack.push(html_utilities.$kw181$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)html_utilities.$sym182$IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (html_utilities.NIL == string_utilities.starts_with(Strings.string_downcase(url, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED), (SubLObject)html_utilities.$str690$http___) && html_utilities.NIL == web_utilities.url_p(url)) {
                        url = Sequences.cconcatenate((SubLObject)html_utilities.$str690$http___, url);
                    }
                    thread.resetMultipleValues();
                    SubLObject machine = web_utilities.parse_http_url(url);
                    SubLObject port = thread.secondMultipleValue();
                    SubLObject path = thread.thirdMultipleValue();
                    final SubLObject query = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if (html_utilities.NIL == machine) {
                        machine = url;
                    }
                    if (html_utilities.NIL == path) {
                        path = (SubLObject)html_utilities.$str24$_;
                    }
                    if (!port.isInteger()) {
                        port = (SubLObject)html_utilities.$int691$80;
                    }
                    SubLObject out_stream = (SubLObject)html_utilities.NIL;
                    try {
                        out_stream = streams_high.make_private_string_output_stream();
                        SubLObject stream = (SubLObject)html_utilities.NIL;
                        try {
                            stream = streams_high.make_private_string_input_stream(web_utilities.http_retrieve((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(query)), path, machine, port, (SubLObject)html_utilities.$kw692$GET, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED), (SubLObject)html_utilities.ZERO_INTEGER, (SubLObject)html_utilities.NIL);
                            SubLObject tokens = xml_parsing_utilities.xml_tokenize(stream, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                            while (html_utilities.NIL != tokens) {
                                final SubLObject token = tokens.first();
                                if (html_utilities.NIL != xml_parsing_utilities.xml_token_starts_with(token, (SubLObject)html_utilities.$str685$_script)) {
                                    tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)html_utilities.$str686$__script_, (SubLObject)html_utilities.UNPROVIDED), (SubLObject)html_utilities.UNPROVIDED);
                                }
                                else if (html_utilities.NIL != xml_parsing_utilities.xml_token_starts_with(token, (SubLObject)html_utilities.$str693$_style)) {
                                    tokens = xml_parsing_utilities.advance_xml_tokens(xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)html_utilities.$str694$__style_, (SubLObject)html_utilities.UNPROVIDED), (SubLObject)html_utilities.UNPROVIDED);
                                }
                                else if (html_utilities.NIL != xml_parsing_utilities.xml_token_starts_with(token, (SubLObject)html_utilities.$str695$_p_)) {
                                    print_high.princ((SubLObject)html_utilities.$str41$_, out_stream);
                                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)html_utilities.UNPROVIDED);
                                }
                                else if (html_utilities.NIL != xml_parsing_utilities.xml_token_starts_with(token, (SubLObject)html_utilities.$str23$_)) {
                                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)html_utilities.UNPROVIDED);
                                }
                                else {
                                    PrintLow.format(out_stream, (SubLObject)html_utilities.$str39$_A, token);
                                    tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)html_utilities.UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                streams_high.close(stream, (SubLObject)html_utilities.UNPROVIDED);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                        result = streams_high.get_output_stream_string(out_stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_utilities.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            streams_high.close(out_stream, (SubLObject)html_utilities.UNPROVIDED);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)html_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)html_utilities.$kw181$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        if (result.isString()) {
            return string_utilities.do_string_substitutions_robust(result, html_utilities.$url_to_text_replacements$.getGlobalValue(), (SubLObject)html_utilities.UNPROVIDED);
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 94429L)
    public static SubLObject generate_html_filename_input_fieldname(final SubLObject name) {
        return Sequences.cconcatenate(html_utilities.$html_filename_input_prefix$.getGlobalValue(), name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 94552L)
    public static SubLObject html_filename_input(final SubLObject name, final SubLObject initial_value, final SubLObject size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file_input = generate_html_filename_input_fieldname(name);
        final SubLObject update_name_script = Sequences.cconcatenate((SubLObject)html_utilities.$str697$this_form_, new SubLObject[] { name, html_utilities.$str698$_value___this_value_ });
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.$str699$TEXT);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        if (html_utilities.NIL != file_input) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(file_input);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != file_input) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(file_input);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != initial_value) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_princ(initial_value);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != size) {
            html_markup(html_macros.$html_input_size$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(size);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != update_name_script) {
            html_markup(html_macros.$html_select_onchange$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(update_name_script);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != update_name_script) {
            html_markup(html_macros.$html_event_attribute_onblur$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(update_name_script);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        }
        if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        html_hidden_input(name, (SubLObject)html_utilities.$str47$, (SubLObject)html_utilities.NIL);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 95108L)
    public static SubLObject html_with_file_transmitting_form(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list700);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject handler_name = (SubLObject)html_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list700);
        handler_name = current.first();
        current = current.rest();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : html_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_utilities.$list700);
        current = current.rest();
        if (html_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject frame_name_var = (SubLObject)html_utilities.$sym701$FRAME_NAME_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym702$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(frame_name_var, (SubLObject)ConsesLow.list((SubLObject)html_utilities.$sym703$CB_FRAME_NAME, target))), (SubLObject)ConsesLow.listS((SubLObject)html_utilities.$sym704$HTML_FANCY_FORM, (SubLObject)ConsesLow.listS((SubLObject)html_utilities.$sym705$_CYC_CGI_PROGRAM_, (SubLObject)html_utilities.$sym706$_HTML_FORM_METHOD_POST_, frame_name_var, (SubLObject)html_utilities.$list707), (SubLObject)ConsesLow.listS((SubLObject)html_utilities.$sym708$HTML_HIDDEN_INPUT, handler_name, (SubLObject)html_utilities.$list709), ConsesLow.append(body, (SubLObject)html_utilities.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.$list700);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 95895L)
    public static SubLObject html_arguments_contain_multipart_form_dataP(final SubLObject args) {
        return list_utilities.sublisp_boolean(html_extract_input(html_utilities.$html_multipart_form_date$.getGlobalValue(), args));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 96035L)
    public static SubLObject html_parse_multipart_form_data(final SubLObject string) {
        SubLObject values = (SubLObject)html_utilities.NIL;
        SubLObject s = (SubLObject)html_utilities.NIL;
        try {
            s = streams_high.make_private_string_input_stream(string, (SubLObject)html_utilities.ZERO_INTEGER, (SubLObject)html_utilities.NIL);
            final SubLObject separator = streams_high.read_line(s, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, (SubLObject)html_utilities.UNPROVIDED);
            SubLObject eof = (SubLObject)html_utilities.NIL;
            while (html_utilities.NIL == eof) {
                final SubLObject content_disposition = streams_high.read_line(s, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject content_type = streams_high.read_line(s, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, (SubLObject)html_utilities.UNPROVIDED);
                SubLObject field = (SubLObject)html_utilities.NIL;
                SubLObject content = (SubLObject)html_utilities.NIL;
                if (html_utilities.$kw15$EOF == content_disposition) {
                    eof = (SubLObject)html_utilities.T;
                }
                else {
                    field = html_parse_data_name_from_content_disposition(content_disposition);
                    if (html_utilities.NIL != Sequences.search((SubLObject)html_utilities.$str711$application_octet_stream, content_type, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
                        content = html_parse_multipart_form_line(s, separator);
                    }
                    else {
                        content = streams_high.read_line(s, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, (SubLObject)html_utilities.UNPROVIDED);
                        html_parse_consume_separator(s, separator);
                    }
                    values = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(field, Sequences.delete((SubLObject)Characters.CHAR_return, content, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)), values);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)html_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(s, (SubLObject)html_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        values = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(html_utilities.$html_multipart_form_date$.getGlobalValue(), (SubLObject)html_utilities.$str712$T), values);
        return Sequences.nreverse(values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 97053L)
    public static SubLObject html_parse_consume_separator(final SubLObject stream, final SubLObject separator) {
        return Strings.string_equal(separator, streams_high.read_line(stream, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, (SubLObject)html_utilities.UNPROVIDED), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 97182L)
    public static SubLObject html_parse_data_name_from_content_disposition(final SubLObject content) {
        final SubLObject first_quote = Sequences.position((SubLObject)Characters.CHAR_quotation, content, Symbols.symbol_function((SubLObject)html_utilities.$sym713$CHAR_), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject inside_value = Numbers.add((SubLObject)html_utilities.ONE_INTEGER, first_quote);
        final SubLObject second_quote = Sequences.position((SubLObject)Characters.CHAR_quotation, content, Symbols.symbol_function((SubLObject)html_utilities.$sym713$CHAR_), Symbols.symbol_function((SubLObject)html_utilities.IDENTITY), inside_value, (SubLObject)html_utilities.UNPROVIDED);
        return string_utilities.substring(content, inside_value, second_quote);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 97561L)
    public static SubLObject html_parse_multipart_form_line(final SubLObject s, final SubLObject separator) {
        streams_high.read_line(s, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, (SubLObject)html_utilities.UNPROVIDED);
        SubLObject line = streams_high.read_line(s, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$kw15$EOF, (SubLObject)html_utilities.UNPROVIDED);
        SubLObject pieces = (SubLObject)html_utilities.$str47$;
        while (html_utilities.NIL == Strings.string_equal(separator, line, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED)) {
            pieces = Sequences.cconcatenate(pieces, new SubLObject[] { line, html_utilities.$html_newline_string$.getGlobalValue() });
            line = streams_high.read_line(s, (SubLObject)html_utilities.NIL, separator, (SubLObject)html_utilities.UNPROVIDED);
        }
        return Sequences.delete((SubLObject)Characters.CHAR_return, pieces, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 97986L)
    public static SubLObject html_construct_message_from_multipart_data(final SubLObject contents) {
        SubLObject result = (SubLObject)html_utilities.NIL;
        SubLObject stream = (SubLObject)html_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject list_var = (SubLObject)html_utilities.NIL;
            SubLObject component = (SubLObject)html_utilities.NIL;
            SubLObject index = (SubLObject)html_utilities.NIL;
            list_var = contents;
            component = list_var.first();
            for (index = (SubLObject)html_utilities.ZERO_INTEGER; html_utilities.NIL != list_var; list_var = list_var.rest(), component = list_var.first(), index = Numbers.add((SubLObject)html_utilities.ONE_INTEGER, index)) {
                SubLObject current;
                final SubLObject datum = current = component;
                SubLObject item = (SubLObject)html_utilities.NIL;
                SubLObject value = (SubLObject)html_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list714);
                item = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_utilities.$list714);
                value = current.first();
                current = current.rest();
                if (html_utilities.NIL == current) {
                    if (index.isPositive()) {
                        streams_high.write_char((SubLObject)Characters.CHAR_ampersand, stream);
                    }
                    streams_high.write_string(item, stream, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                    streams_high.write_char((SubLObject)Characters.CHAR_equal, stream);
                    final SubLObject string_var = value;
                    SubLObject end_var_$54;
                    SubLObject end_var;
                    SubLObject char_num;
                    SubLObject v_char;
                    for (end_var = (end_var_$54 = Sequences.length(string_var)), char_num = (SubLObject)html_utilities.NIL, char_num = (SubLObject)html_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$54); char_num = number_utilities.f_1X(char_num)) {
                        v_char = Strings.sublisp_char(string_var, char_num);
                        if (html_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_space, v_char)) {
                            streams_high.write_char((SubLObject)Characters.CHAR_plus, stream);
                        }
                        else if (html_utilities.NIL != Characters.alphanumericp(v_char)) {
                            streams_high.write_char(v_char, stream);
                        }
                        else {
                            PrintLow.format(stream, (SubLObject)html_utilities.$str715$__2__0X, Characters.char_code(v_char));
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_utilities.$list714);
                }
            }
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)html_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)html_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 98871L)
    public static SubLObject html_request_arguments_are_multipart_dataP(final SubLObject v_arguments) {
        return (SubLObject)SubLObjectFactory.makeBoolean(html_utilities.NIL != list_utilities.lengthG(v_arguments, html_utilities.$html_multipart_content_marker_size$.getGlobalValue(), (SubLObject)html_utilities.UNPROVIDED) && html_utilities.NIL != Strings.string_equal(v_arguments, html_utilities.$html_multipart_content_marker$.getGlobalValue(), (SubLObject)html_utilities.ZERO_INTEGER, html_utilities.$html_multipart_content_marker_size$.getGlobalValue(), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 99155L)
    public static SubLObject html_treemap_table(final SubLObject treemap, SubLObject width, SubLObject height, SubLObject split_type, SubLObject display_properties) {
        if (width == html_utilities.UNPROVIDED) {
            width = (SubLObject)html_utilities.$int717$200;
        }
        if (height == html_utilities.UNPROVIDED) {
            height = width;
        }
        if (split_type == html_utilities.UNPROVIDED) {
            split_type = (SubLObject)html_utilities.$kw718$VERTICAL;
        }
        if (display_properties == html_utilities.UNPROVIDED) {
            display_properties = (SubLObject)html_utilities.NIL;
        }
        html_treemap_table_recursive(treemap, width, height, split_type, display_properties);
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 99720L)
    public static SubLObject treemap_size(final SubLObject treemap) {
        if (treemap.first().isList()) {
            SubLObject size = (SubLObject)html_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var = treemap;
            SubLObject subtreemap = (SubLObject)html_utilities.NIL;
            subtreemap = cdolist_list_var.first();
            while (html_utilities.NIL != cdolist_list_var) {
                size = Numbers.add(size, treemap_size(subtreemap));
                cdolist_list_var = cdolist_list_var.rest();
                subtreemap = cdolist_list_var.first();
            }
            return size;
        }
        return conses_high.getf(treemap, (SubLObject)html_utilities.$kw719$SIZE, (SubLObject)html_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 99999L)
    public static SubLObject treemap_class_size(final SubLObject treemap, final SubLObject v_class) {
        if (treemap.first().isList()) {
            SubLObject size = (SubLObject)html_utilities.ZERO_INTEGER;
            SubLObject cdolist_list_var = treemap;
            SubLObject subtreemap = (SubLObject)html_utilities.NIL;
            subtreemap = cdolist_list_var.first();
            while (html_utilities.NIL != cdolist_list_var) {
                size = Numbers.add(size, treemap_class_size(subtreemap, v_class));
                cdolist_list_var = cdolist_list_var.rest();
                subtreemap = cdolist_list_var.first();
            }
            return size;
        }
        if (v_class.equal(conses_high.getf(treemap, (SubLObject)html_utilities.$kw720$CLASS, (SubLObject)html_utilities.UNPROVIDED))) {
            return conses_high.getf(treemap, (SubLObject)html_utilities.$kw719$SIZE, (SubLObject)html_utilities.UNPROVIDED);
        }
        return (SubLObject)html_utilities.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 100401L)
    public static SubLObject build_treemap(final SubLObject root, final SubLObject dtrs_fn, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn) {
        assert html_utilities.NIL != Types.function_spec_p(dtrs_fn) : dtrs_fn;
        assert html_utilities.NIL != Types.function_spec_p(size_fn) : size_fn;
        assert html_utilities.NIL != Types.function_spec_p(name_fn) : name_fn;
        assert html_utilities.NIL != Types.function_spec_p(class_fn) : class_fn;
        return build_treemap_recursive(root, dtrs_fn, size_fn, name_fn, class_fn, set.new_set(Symbols.symbol_function((SubLObject)html_utilities.EQUAL), (SubLObject)html_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 100918L)
    public static SubLObject html_treemap_table_recursive(final SubLObject treemap, final SubLObject width, final SubLObject height, final SubLObject split_type, final SubLObject display_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!treemap.first().isList()) {
            final SubLObject size_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw719$SIZE, treemap);
            final SubLObject size = (SubLObject)((html_utilities.NIL != size_tail) ? conses_high.cadr(size_tail) : html_utilities.NIL);
            final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw722$NAME, treemap);
            final SubLObject name = (SubLObject)((html_utilities.NIL != name_tail) ? conses_high.cadr(name_tail) : html_utilities.NIL);
            final SubLObject color_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw723$COLOR, treemap);
            final SubLObject color = (SubLObject)((html_utilities.NIL != color_tail) ? conses_high.cadr(color_tail) : html_utilities.NIL);
            final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw720$CLASS, treemap);
            final SubLObject v_class = (SubLObject)((html_utilities.NIL != class_tail) ? conses_high.cadr(class_tail) : html_utilities.NIL);
            final SubLObject bgcolor = compute_treemap_color(color, v_class, display_properties);
            final SubLObject font_color = conses_high.getf(display_properties, (SubLObject)html_utilities.$kw724$FONT_COLOR, (SubLObject)html_utilities.$kw725$BLACK);
            final SubLObject border = conses_high.getf(display_properties, (SubLObject)html_utilities.$kw126$BORDER, (SubLObject)html_utilities.ONE_INTEGER);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (html_utilities.NIL != border) {
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                html_markup(border);
                html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            }
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (html_utilities.NIL != height) {
                    html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(height);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_align((SubLObject)html_utilities.$kw146$CENTER));
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_align((SubLObject)html_utilities.$kw146$CENTER));
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    if (html_utilities.NIL != bgcolor) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(bgcolor);
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    if (html_utilities.NIL != width) {
                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(width);
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        final SubLObject color_val = font_color;
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (html_utilities.NIL != color_val) {
                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                            html_markup(html_color(color_val));
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        }
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            if (Numbers.multiply(width, height).numG((SubLObject)html_utilities.$int726$400)) {
                                if (Numbers.multiply(width, height).numG((SubLObject)html_utilities.$int727$800)) {
                                    html_princ(name);
                                    html_indent((SubLObject)html_utilities.UNPROVIDED);
                                }
                                html_princ(size);
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        else if (split_type == html_utilities.$kw718$VERTICAL) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                final SubLObject tree_size = treemap_size(treemap);
                SubLObject cdolist_list_var = treemap;
                SubLObject subtreemap = (SubLObject)html_utilities.NIL;
                subtreemap = cdolist_list_var.first();
                while (html_utilities.NIL != cdolist_list_var) {
                    final SubLObject subtree_size = treemap_size(subtreemap);
                    final SubLObject sub_height = Numbers.round(Numbers.multiply(height, Numbers.divide(subtree_size, tree_size)), (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    if (html_utilities.NIL != sub_height) {
                        html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(sub_height);
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw146$CENTER));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw146$CENTER));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        if (html_utilities.NIL != width) {
                            html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                            html_markup(width);
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        }
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            html_treemap_table_recursive(subtreemap, width, sub_height, (SubLObject)html_utilities.$kw728$HORIZONTAL, display_properties);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    subtreemap = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        else if (split_type == html_utilities.$kw728$HORIZONTAL) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_markup((SubLObject)html_utilities.ZERO_INTEGER);
            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                final SubLObject tree_size = treemap_size(treemap);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (html_utilities.NIL != height) {
                    html_markup(html_macros.$html_table_row_height$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup(height);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                }
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    SubLObject cdolist_list_var2 = treemap;
                    SubLObject subtreemap2 = (SubLObject)html_utilities.NIL;
                    subtreemap2 = cdolist_list_var2.first();
                    while (html_utilities.NIL != cdolist_list_var2) {
                        final SubLObject subtree_size2 = treemap_size(subtreemap2);
                        final SubLObject sub_width = Numbers.round(Numbers.multiply(width, Numbers.divide(subtree_size2, tree_size)), (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw146$CENTER));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(html_align((SubLObject)html_utilities.$kw146$CENTER));
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        if (html_utilities.NIL != sub_width) {
                            html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                            html_markup(sub_width);
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        }
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            html_treemap_table_recursive(subtreemap2, sub_width, height, (SubLObject)html_utilities.$kw718$VERTICAL, display_properties);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        subtreemap2 = cdolist_list_var2.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return (SubLObject)html_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 102798L)
    public static SubLObject compute_treemap_color(SubLObject color, final SubLObject v_class, final SubLObject display_properties) {
        if (html_utilities.NIL == color) {
            final SubLObject class_colormap_tail = cdestructuring_bind.property_list_member((SubLObject)html_utilities.$kw729$CLASS_COLORMAP, display_properties);
            final SubLObject class_colormap = (SubLObject)((html_utilities.NIL != class_colormap_tail) ? conses_high.cadr(class_colormap_tail) : html_utilities.NIL);
            if (html_utilities.NIL != class_colormap) {
                color = list_utilities.alist_lookup_without_values(class_colormap, v_class, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
            }
        }
        return color;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 105707L)
    public static SubLObject build_treemap_recursive(final SubLObject root, final SubLObject dtrs_fn, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn, final SubLObject done) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject subtreemap_for_root = treemap_entry_for_node(root, size_fn, name_fn, class_fn);
        final SubLObject dtrs = Functions.funcall(dtrs_fn, root);
        SubLObject treemap = (SubLObject)html_utilities.NIL;
        if (html_utilities.NIL == set.set_memberP(root, done)) {
            if (html_utilities.NIL != dtrs) {
                SubLObject subtreemaps = (SubLObject)html_utilities.NIL;
                if (!html_utilities.$build_treemap_depth$.getDynamicValue(thread).numGE(html_utilities.$build_treemap_max_depth$.getGlobalValue())) {
                    final SubLObject _prev_bind_0 = html_utilities.$build_treemap_depth$.currentBinding(thread);
                    try {
                        html_utilities.$build_treemap_depth$.bind(number_utilities.f_1X(html_utilities.$build_treemap_depth$.getDynamicValue(thread)), thread);
                        SubLObject cdolist_list_var = dtrs;
                        SubLObject dtr = (SubLObject)html_utilities.NIL;
                        dtr = cdolist_list_var.first();
                        while (html_utilities.NIL != cdolist_list_var) {
                            if (html_utilities.NIL == set.set_memberP(dtr, done)) {
                                final SubLObject subtreemap = build_treemap_recursive(dtr, dtrs_fn, size_fn, name_fn, class_fn, done);
                                if (html_utilities.NIL != number_utilities.positive_number_p(treemap_size(subtreemap))) {
                                    subtreemaps = (SubLObject)ConsesLow.cons(subtreemap, subtreemaps);
                                }
                                set.set_add(dtr, done);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            dtr = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_utilities.$build_treemap_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                if (html_utilities.NIL != number_utilities.positive_number_p(treemap_size(subtreemap_for_root))) {
                    subtreemaps = (SubLObject)ConsesLow.cons(subtreemap_for_root, subtreemaps);
                }
                return Sequences.nreverse(subtreemaps);
            }
            treemap = subtreemap_for_root;
        }
        set.set_add(root, done);
        return treemap;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 106723L)
    public static SubLObject treemap_entry_for_node(final SubLObject root, final SubLObject size_fn, final SubLObject name_fn, final SubLObject class_fn) {
        final SubLObject size = Functions.funcall(size_fn, root);
        final SubLObject name = Functions.funcall(name_fn, root);
        final SubLObject v_class = Functions.funcall(class_fn, root);
        SubLObject entry = (SubLObject)html_utilities.NIL;
        if (html_utilities.NIL != number_utilities.positive_number_p(size)) {
            entry = conses_high.putf(entry, (SubLObject)html_utilities.$kw719$SIZE, size);
        }
        if (html_utilities.NIL != name) {
            entry = conses_high.putf(entry, (SubLObject)html_utilities.$kw722$NAME, name);
        }
        if (html_utilities.NIL != v_class) {
            entry = conses_high.putf(entry, (SubLObject)html_utilities.$kw720$CLASS, v_class);
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-utilities.lisp", position = 107126L)
    public static SubLObject html_user_id_and_password(SubLObject user_id_field, SubLObject hashed_password_field, SubLObject user_text, SubLObject password_text, SubLObject user, SubLObject bad_passwordP) {
        if (user_id_field == html_utilities.UNPROVIDED) {
            user_id_field = (SubLObject)html_utilities.$str730$new_login_id;
        }
        if (hashed_password_field == html_utilities.UNPROVIDED) {
            hashed_password_field = (SubLObject)html_utilities.$str731$hashed_password;
        }
        if (user_text == html_utilities.UNPROVIDED) {
            user_text = (SubLObject)html_utilities.$str732$User_ID;
        }
        if (password_text == html_utilities.UNPROVIDED) {
            password_text = (SubLObject)html_utilities.$str733$Password;
        }
        if (user == html_utilities.UNPROVIDED) {
            user = (SubLObject)html_utilities.NIL;
        }
        if (bad_passwordP == html_utilities.UNPROVIDED) {
            bad_passwordP = (SubLObject)html_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unhashed_password = Sequences.cconcatenate((SubLObject)html_utilities.$str734$unhashed_password_, user_id_field);
        final SubLObject keyup_event = Sequences.cconcatenate((SubLObject)html_utilities.$str735$var_oldB64Pad___b64pad__b64pad___, new SubLObject[] { format_nil.format_nil_a_no_copy(user_id_field), html_utilities.$str736$_value_this_form_, format_nil.format_nil_a_no_copy(unhashed_password), html_utilities.$str737$_value___this_form_, format_nil.format_nil_a_no_copy(hashed_password_field), html_utilities.$str738$_value_b64_sha1_theInput___b64pad });
        cyc_file_dependencies.javascript((SubLObject)html_utilities.$kw739$SHA1);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_markup((SubLObject)html_utilities.ZERO_INTEGER);
        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_princ(user_text);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_text_input(user_id_field, user, (SubLObject)html_utilities.$int740$30);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    if (html_utilities.NIL != bad_passwordP) {
                        html_markup(html_macros.$html_font_head$.getGlobalValue());
                        if (html_utilities.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                            html_markup(html_macros.$html_font_color$.getGlobalValue());
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                            html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                            html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        }
                        html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                            html_princ(password_text);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                        }
                        html_markup(html_macros.$html_font_tail$.getGlobalValue());
                    }
                    else {
                        html_princ(password_text);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_markup(html_macros.$html_input_head$.getGlobalValue());
                    html_markup(html_macros.$html_input_type$.getGlobalValue());
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    html_markup((SubLObject)html_utilities.$kw741$PASSWORD);
                    html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    if (html_utilities.NIL != unhashed_password) {
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(unhashed_password);
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    if (html_utilities.NIL != keyup_event) {
                        html_markup(html_macros.$html_event_attribute_onkeyup$.getGlobalValue());
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                        html_markup(keyup_event);
                        html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_utilities.UNPROVIDED);
                    }
                    if (html_utilities.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                    }
                    html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_reset_input((SubLObject)html_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_utilities.T, thread);
                    html_submit_input((SubLObject)html_utilities.$str742$Submit, (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri((SubLObject)html_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_hidden_input(hashed_password_field, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.$int691$80);
        return (SubLObject)html_utilities.NIL;
    }
    
    public static SubLObject declare_html_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_flush", "HTML-FLUSH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_char", "HTML-CHAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_string", "HTML-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_reserved_char_p", "HTML-RESERVED-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_escape_string_for_char", "HTML-ESCAPE-STRING-FOR-CHAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "string_has_any_escape_charsP", "STRING-HAS-ANY-ESCAPE-CHARS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_reserved_character_code_p", "HTML-RESERVED-CHARACTER-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_escape_string_for_non_ascii_char", "HTML-ESCAPE-STRING-FOR-NON-ASCII-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_escape", "HTML-ESCAPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "subl_string_to_display_vector_string", "SUBL-STRING-TO-DISPLAY-VECTOR-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ", "HTML-PRINC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ_strong", "HTML-PRINC-STRONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ_possibly_strong", "HTML-PRINC-POSSIBLY-STRONG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ_non_breaking", "HTML-PRINC-NON-BREAKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_prin1", "HTML-PRIN1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ_formatted_string", "HTML-PRINC-FORMATTED-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_terpri", "HTML-TERPRI", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_source_readability_terpri", "HTML-SOURCE-READABILITY-TERPRI", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_tab", "HTML-TAB", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_spaces", "HTML-SPACES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_indent", "HTML-INDENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_markup", "HTML-MARKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_print_doc_string", "HTML-PRINT-DOC-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ_doc_string", "HTML-PRINC-DOC-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "hide_non_ascii_chars", "HIDE-NON-ASCII-CHARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ_string_with_hidden_non_ascii_chars", "HTML-PRINC-STRING-WITH-HIDDEN-NON-ASCII-CHARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ_cycl_string", "HTML-PRINC-CYCL-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ_cycl_string_new", "HTML-PRINC-CYCL-STRING-NEW", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_princ_cycl_string_old", "HTML-PRINC-CYCL-STRING-OLD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_cycl_string", "HTML-CYCL-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "opencyc_html_cycl_string", "OPENCYC-HTML-CYCL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "cb_form_for_cycl_string", "CB-FORM-FOR-CYCL-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_stale_constant_reference", "HTML-STALE-CONSTANT-REFERENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_show_string_with_invalid_constants_highlighted", "HTML-SHOW-STRING-WITH-INVALID-CONSTANTS-HIGHLIGHTED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_url_princ", "HTML-URL-PRINC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_url_princ_char", "HTML-URL-PRINC-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_simple_attribute", "HTML-SIMPLE-ATTRIBUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_simple_quoted_attribute", "HTML-SIMPLE-QUOTED-ATTRIBUTE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_color", "HTML-COLOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_style_background_color", "HTML-STYLE-BACKGROUND-COLOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_align", "HTML-ALIGN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_copyright_notice", "HTML-COPYRIGHT-NOTICE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_copyright_text", "HTML-COPYRIGHT-TEXT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_mailto_url", "HTML-MAILTO-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_file_url", "HTML-FILE-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_refresh", "HTML-REFRESH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_meta_utf_8_content_type", "HTML-META-UTF-8-CONTENT-TYPE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_meta_expires", "HTML-META-EXPIRES", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_meta_last_modified", "HTML-META-LAST-MODIFIED", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_meta_dont_cache", "HTML-META-DONT-CACHE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_utilities", "html_webpage_expires", "HTML-WEBPAGE-EXPIRES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_utilities", "html_webpage_last_modified", "HTML-WEBPAGE-LAST-MODIFIED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_utilities", "html_dont_cache_webpage", "HTML-DONT-CACHE-WEBPAGE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_meta_no_robots", "HTML-META-NO-ROBOTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_meta_robot_instructions", "HTML-META-ROBOT-INSTRUCTIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_meta_select_robot_instructions", "HTML-META-SELECT-ROBOT-INSTRUCTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_hr", "HTML-HR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_line_break", "HTML-LINE-BREAK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_br", "HTML-BR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_newline", "HTML-NEWLINE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_checkbox_input", "HTML-CHECKBOX-INPUT", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_hidden_input", "HTML-HIDDEN-INPUT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_image_input", "HTML-IMAGE-INPUT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_password_input", "HTML-PASSWORD-INPUT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_radio_input", "HTML-RADIO-INPUT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_reset_input", "HTML-RESET-INPUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_submit_input", "HTML-SUBMIT-INPUT", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_text_input", "HTML-TEXT-INPUT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_scripted_text_input", "HTML-SCRIPTED-TEXT-INPUT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_disabled_text_input", "HTML-DISABLED-TEXT-INPUT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_format_input", "HTML-FORMAT-INPUT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_autocomplete_text_input", "HTML-AUTOCOMPLETE-TEXT-INPUT", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_image_multi_submit", "HTML-IMAGE-MULTI-SUBMIT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_multi_submit_input", "HTML-EXTRACT-MULTI-SUBMIT-INPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_multi_submit_input_internal", "HTML-EXTRACT-MULTI-SUBMIT-INPUT-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_indent_table_internal", "HTML-INDENT-TABLE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_indent_row_internal", "HTML-INDENT-ROW-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_target_definition", "HTML-TARGET-DEFINITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_basefont", "HTML-BASEFONT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_word_break", "HTML-WORD-BREAK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_print_lexicon_entry", "HTML-PRINT-LEXICON-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_print_form", "HTML-PRINT-FORM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_basic_image", "HTML-BASIC-IMAGE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_table_row_list", "HTML-TABLE-ROW-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_table_heading_list", "HTML-TABLE-HEADING-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_percent_progress_bar", "HTML-PERCENT-PROGRESS-BAR", 2, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_utilities", "html_fancy_percent_progress_bar", "HTML-FANCY-PERCENT-PROGRESS-BAR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_fancy_percent_progress_bar_widths", "HTML-FANCY-PERCENT-PROGRESS-BAR-WIDTHS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_progress_section", "HTML-PROGRESS-SECTION", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_horizontal_bar_graph", "HTML-HORIZONTAL-BAR-GRAPH", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_draw_bargraph_label", "HTML-DRAW-BARGRAPH-LABEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_draw_bargraph_colorbar", "HTML-DRAW-BARGRAPH-COLORBAR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_control_parameter_chooser", "HTML-CONTROL-PARAMETER-CHOOSER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_control_parameter_value", "HTML-EXTRACT-CONTROL-PARAMETER-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_set_control_parameter", "HTML-SET-CONTROL-PARAMETER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_control_parameter_entry_name", "HTML-CONTROL-PARAMETER-ENTRY-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_control_parameter_radio_name", "HTML-CONTROL-PARAMETER-RADIO-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_select_from_list", "HTML-SELECT-FROM-LIST", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "matching_html_field", "MATCHING-HTML-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "matching_html_button_field", "MATCHING-HTML-BUTTON-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_input", "HTML-EXTRACT-INPUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_input_values", "HTML-EXTRACT-INPUT-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_value", "HTML-EXTRACT-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_integer", "HTML-EXTRACT-INTEGER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_date", "HTML-EXTRACT-DATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_keyword", "HTML-EXTRACT-KEYWORD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_string", "HTML-EXTRACT-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_boolean", "HTML-EXTRACT-BOOLEAN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_sexpr", "HTML-EXTRACT-SEXPR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_cyclified_sexpr", "HTML-EXTRACT-CYCLIFIED-SEXPR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_sexpr_int", "HTML-EXTRACT-SEXPR-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_extract_button_value", "HTML-EXTRACT-BUTTON-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "decode_html_language_abbreviation", "DECODE-HTML-LANGUAGE-ABBREVIATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_glyph", "HTML-GLYPH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_glyph_markup", "HTML-GLYPH-MARKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_declare_glyph", "HTML-DECLARE-GLYPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_unicode_char", "HTML-UNICODE-CHAR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_create_listbox", "HTML-CREATE-LISTBOX", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_create_radiobox_form", "HTML-CREATE-RADIOBOX-FORM", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_create_multiple_selection_listbox", "HTML-CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_create_dropdown_list", "HTML-CREATE-DROPDOWN-LIST", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_create_simple_dropdown_list", "HTML-CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "create_listbox", "CREATE-LISTBOX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "create_multiple_selection_listbox", "CREATE-MULTIPLE-SELECTION-LISTBOX", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "create_dropdown_list", "CREATE-DROPDOWN-LIST", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "create_simple_dropdown_list", "CREATE-SIMPLE-DROPDOWN-LIST", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "get_encoded_form_field_name", "GET-ENCODED-FORM-FIELD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "extract_encoded_form_field_value", "EXTRACT-ENCODED-FORM-FIELD-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "encode_form_field_name", "ENCODE-FORM-FIELD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_echo_args", "HTML-ECHO-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_echo_file", "HTML-ECHO-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "remove_html_tags", "REMOVE-HTML-TAGS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "convert_html_to_text", "CONVERT-HTML-TO-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "url_to_text", "URL-TO-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "generate_html_filename_input_fieldname", "GENERATE-HTML-FILENAME-INPUT-FIELDNAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_filename_input", "HTML-FILENAME-INPUT", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_utilities", "html_with_file_transmitting_form", "HTML-WITH-FILE-TRANSMITTING-FORM");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_arguments_contain_multipart_form_dataP", "HTML-ARGUMENTS-CONTAIN-MULTIPART-FORM-DATA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_parse_multipart_form_data", "HTML-PARSE-MULTIPART-FORM-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_parse_consume_separator", "HTML-PARSE-CONSUME-SEPARATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_parse_data_name_from_content_disposition", "HTML-PARSE-DATA-NAME-FROM-CONTENT-DISPOSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_parse_multipart_form_line", "HTML-PARSE-MULTIPART-FORM-LINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_construct_message_from_multipart_data", "HTML-CONSTRUCT-MESSAGE-FROM-MULTIPART-DATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_request_arguments_are_multipart_dataP", "HTML-REQUEST-ARGUMENTS-ARE-MULTIPART-DATA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_treemap_table", "HTML-TREEMAP-TABLE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "treemap_size", "TREEMAP-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "treemap_class_size", "TREEMAP-CLASS-SIZE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "build_treemap", "BUILD-TREEMAP", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_treemap_table_recursive", "HTML-TREEMAP-TABLE-RECURSIVE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "compute_treemap_color", "COMPUTE-TREEMAP-COLOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "build_treemap_recursive", "BUILD-TREEMAP-RECURSIVE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "treemap_entry_for_node", "TREEMAP-ENTRY-FOR-NODE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_utilities", "html_user_id_and_password", "HTML-USER-ID-AND-PASSWORD", 0, 6, false);
        return (SubLObject)html_utilities.NIL;
    }
    
    public static SubLObject init_html_utilities_file() {
        html_utilities.$cb_use_frames$ = SubLFiles.defparameter("*CB-USE-FRAMES*", (SubLObject)html_utilities.T);
        html_utilities.$use_new_html_princ_cycl_stringP$ = SubLFiles.defparameter("*USE-NEW-HTML-PRINC-CYCL-STRING?*", (SubLObject)html_utilities.T);
        html_utilities.$html_stale_constant_reference_color$ = SubLFiles.defparameter("*HTML-STALE-CONSTANT-REFERENCE-COLOR*", (SubLObject)html_utilities.NIL);
        html_utilities.$html_url_princ_escape_spaces$ = SubLFiles.defparameter("*HTML-URL-PRINC-ESCAPE-SPACES*", (SubLObject)html_utilities.T);
        html_utilities.$html_style_background$ = SubLFiles.defparameter("*HTML-STYLE-BACKGROUND*", (SubLObject)html_utilities.$str48$background_color_);
        html_utilities.$html_align_map$ = SubLFiles.defparameter("*HTML-ALIGN-MAP*", (SubLObject)html_utilities.$list49);
        html_utilities.$cycorp_homepage_url$ = SubLFiles.defparameter("*CYCORP-HOMEPAGE-URL*", (SubLObject)html_utilities.$str50$http___www_cyc_com);
        html_utilities.$cycorp_homepage_text$ = SubLFiles.defparameter("*CYCORP-HOMEPAGE-TEXT*", (SubLObject)html_utilities.$str51$Cycorp);
        html_utilities.$proprietarity_message$ = SubLFiles.deflexical("*PROPRIETARITY-MESSAGE*", (SubLObject)((html_utilities.NIL != Symbols.boundp((SubLObject)html_utilities.$sym52$_PROPRIETARITY_MESSAGE_)) ? html_utilities.$proprietarity_message$.getGlobalValue() : html_utilities.$str47$));
        html_utilities.$html_extract_field_name$ = SubLFiles.defparameter("*HTML-EXTRACT-FIELD-NAME*", (SubLObject)html_utilities.NIL);
        html_utilities.$url_to_text_replacements$ = SubLFiles.deflexical("*URL-TO-TEXT-REPLACEMENTS*", (SubLObject)html_utilities.$list689);
        html_utilities.$html_filename_input_prefix$ = SubLFiles.deflexical("*HTML-FILENAME-INPUT-PREFIX*", (SubLObject)html_utilities.$str696$_file_input_);
        html_utilities.$html_multipart_form_date$ = SubLFiles.deflexical("*HTML-MULTIPART-FORM-DATE*", (SubLObject)html_utilities.$str710$_multipart_formdata);
        html_utilities.$html_newline_string$ = SubLFiles.defconstant("*HTML-NEWLINE-STRING*", Strings.make_string((SubLObject)html_utilities.ONE_INTEGER, (SubLObject)Characters.CHAR_newline));
        html_utilities.$html_multipart_content_marker$ = SubLFiles.deflexical("*HTML-MULTIPART-CONTENT-MARKER*", (SubLObject)html_utilities.$str716$____________________);
        html_utilities.$html_multipart_content_marker_size$ = SubLFiles.deflexical("*HTML-MULTIPART-CONTENT-MARKER-SIZE*", Sequences.length(html_utilities.$html_multipart_content_marker$.getGlobalValue()));
        html_utilities.$build_treemap_depth$ = SubLFiles.defparameter("*BUILD-TREEMAP-DEPTH*", (SubLObject)html_utilities.ZERO_INTEGER);
        html_utilities.$build_treemap_max_depth$ = SubLFiles.deflexical("*BUILD-TREEMAP-MAX-DEPTH*", (SubLObject)html_utilities.TEN_INTEGER);
        html_utilities.$html_utils_test$ = SubLFiles.defconstant("*HTML-UTILS-TEST*", (SubLObject)html_utilities.$str743$HTML_Utilities_Test);
        html_utilities.$html_utils_test_category$ = SubLFiles.defconstant("*HTML-UTILS-TEST-CATEGORY*", Sequences.cconcatenate(html_utilities.$html_utils_test$.getGlobalValue(), (SubLObject)html_utilities.$str744$_Category));
        html_utilities.$html_utils_test_suite$ = SubLFiles.defconstant("*HTML-UTILS-TEST-SUITE*", Sequences.cconcatenate(html_utilities.$html_utils_test$.getGlobalValue(), (SubLObject)html_utilities.$str745$_Suite));
        html_utilities.$html_utils_module$ = SubLFiles.defconstant("*HTML-UTILS-MODULE*", (SubLObject)html_utilities.$str746$HTML_Utilities);
        return (SubLObject)html_utilities.NIL;
    }
    
    public static SubLObject setup_html_utilities_file() {
        utilities_macros.register_html_state_variable((SubLObject)html_utilities.$sym0$_CB_USE_FRAMES_);
        utilities_macros.register_html_interface_variable((SubLObject)html_utilities.$sym0$_CB_USE_FRAMES_);
        generic_testing.define_test_case_table_int((SubLObject)html_utilities.$sym30$OPENCYC_HTML_CYCL_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { html_utilities.$kw31$TEST, html_utilities.NIL, html_utilities.$kw32$OWNER, html_utilities.NIL, html_utilities.$kw33$CLASSES, html_utilities.NIL, html_utilities.$kw34$KB, html_utilities.$kw35$FULL, html_utilities.$kw36$WORKING_, html_utilities.T }), (SubLObject)html_utilities.$list37);
        subl_macro_promotions.declare_defglobal((SubLObject)html_utilities.$sym52$_PROPRIETARITY_MESSAGE_);
        Hashtables.sethash((SubLObject)html_utilities.$kw56$CYC_LOGO_SMALL_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$str57$cyc_logo_violet_16_gif, (SubLObject)html_utilities.NIL));
        Hashtables.sethash((SubLObject)html_utilities.$kw58$CYC_LOGO_LARGE_VIOLET_FULL_URL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$str59$cyc_logo_violet_60_gif, (SubLObject)html_utilities.NIL));
        Hashtables.sethash((SubLObject)html_utilities.$kw60$CYCORP_SYMBOL_TINY, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$str61$cyc_logo_tiny_gif, (SubLObject)html_utilities.NIL));
        Hashtables.sethash((SubLObject)html_utilities.$kw62$CYCORP_SYMBOL_SMALL, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$str63$cyc_logo_sm_gif, (SubLObject)html_utilities.NIL));
        Hashtables.sethash((SubLObject)html_utilities.$kw64$CYCORP_SYMBOL_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$str65$cyc_logo_10_t_gif, (SubLObject)html_utilities.NIL));
        Hashtables.sethash((SubLObject)html_utilities.$kw66$CYCORP_LOGO_MEDIUM, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$str67$cyc_logo_25_t_gif, (SubLObject)html_utilities.NIL));
        Hashtables.sethash((SubLObject)html_utilities.$kw68$CYCORP_LOGO_BIG, cyc_file_dependencies.$html_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)html_utilities.$str69$cyc_logo_50_t_gif, (SubLObject)html_utilities.NIL));
        access_macros.register_macro_helper((SubLObject)html_utilities.$sym132$HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS, (SubLObject)html_utilities.$sym136$HTML_FANCY_PERCENT_PROGRESS_BAR);
        html_declare_glyph((SubLObject)html_utilities.$kw196$LT, (SubLObject)html_utilities.$str197$_lt_);
        html_declare_glyph((SubLObject)html_utilities.$kw198$GT, (SubLObject)html_utilities.$str199$_gt_);
        html_declare_glyph((SubLObject)html_utilities.$kw200$AMP, (SubLObject)html_utilities.$str201$_amp_);
        html_declare_glyph((SubLObject)html_utilities.$kw202$QUOT, (SubLObject)html_utilities.$str203$_quot_);
        html_declare_glyph((SubLObject)html_utilities.$kw204$REG, (SubLObject)html_utilities.$str205$_reg_);
        html_declare_glyph((SubLObject)html_utilities.$kw206$COPY, (SubLObject)html_utilities.$str207$_copy_);
        html_declare_glyph((SubLObject)html_utilities.$kw10$NBSP, (SubLObject)html_utilities.$str208$_nbsp_);
        html_declare_glyph((SubLObject)html_utilities.$kw209$EMSP, (SubLObject)html_utilities.$str210$_emsp_);
        html_declare_glyph((SubLObject)html_utilities.$kw211$ENSP, (SubLObject)html_utilities.$str212$_ensp_);
        html_declare_glyph((SubLObject)html_utilities.$kw213$SPACE, (SubLObject)html_utilities.$str214$__X0020_);
        html_declare_glyph((SubLObject)html_utilities.$kw215$EM_SPACE, (SubLObject)html_utilities.$str216$__X2003_);
        html_declare_glyph((SubLObject)html_utilities.$kw217$EN_SPACE, (SubLObject)html_utilities.$str218$__X2002_);
        html_declare_glyph((SubLObject)html_utilities.$kw219$TWO_PER_EM_SPACE, html_glyph_markup((SubLObject)html_utilities.$kw217$EN_SPACE));
        html_declare_glyph((SubLObject)html_utilities.$kw220$THREE_PER_EM_SPACE, (SubLObject)html_utilities.$str221$__X2004_);
        html_declare_glyph((SubLObject)html_utilities.$kw222$FOUR_PER_EM_SPACE, (SubLObject)html_utilities.$str223$__X2005_);
        html_declare_glyph((SubLObject)html_utilities.$kw224$SIX_PER_EM_SPACE, (SubLObject)html_utilities.$str225$__X2006_);
        html_declare_glyph((SubLObject)html_utilities.$kw226$THIN_SPACE, (SubLObject)html_utilities.$str227$__X2009_);
        html_declare_glyph((SubLObject)html_utilities.$kw228$HAIR_SPACE, (SubLObject)html_utilities.$str229$__X200A_);
        html_declare_glyph((SubLObject)html_utilities.$kw230$IEXCL, (SubLObject)html_utilities.$str231$_iexcl_);
        html_declare_glyph((SubLObject)html_utilities.$kw232$CENT, (SubLObject)html_utilities.$str233$_cent_);
        html_declare_glyph((SubLObject)html_utilities.$kw234$POUND, (SubLObject)html_utilities.$str235$_pound_);
        html_declare_glyph((SubLObject)html_utilities.$kw236$CURREN, (SubLObject)html_utilities.$str237$_curren_);
        html_declare_glyph((SubLObject)html_utilities.$kw238$YEN, (SubLObject)html_utilities.$str239$_yen_);
        html_declare_glyph((SubLObject)html_utilities.$kw240$BRVBAR, (SubLObject)html_utilities.$str241$_brvba_);
        html_declare_glyph((SubLObject)html_utilities.$kw242$SECT, (SubLObject)html_utilities.$str243$_sect_);
        html_declare_glyph((SubLObject)html_utilities.$kw244$UML, (SubLObject)html_utilities.$str245$_uml_);
        html_declare_glyph((SubLObject)html_utilities.$kw206$COPY, (SubLObject)html_utilities.$str207$_copy_);
        html_declare_glyph((SubLObject)html_utilities.$kw246$ORDF, (SubLObject)html_utilities.$str247$_ordf_);
        html_declare_glyph((SubLObject)html_utilities.$kw248$LAQUO, (SubLObject)html_utilities.$str249$_laquo_);
        html_declare_glyph((SubLObject)html_utilities.$kw250$NOT, (SubLObject)html_utilities.$str251$_not_);
        html_declare_glyph((SubLObject)html_utilities.$kw252$SHY, (SubLObject)html_utilities.$str253$_shy_);
        html_declare_glyph((SubLObject)html_utilities.$kw204$REG, (SubLObject)html_utilities.$str205$_reg_);
        html_declare_glyph((SubLObject)html_utilities.$kw254$MACR, (SubLObject)html_utilities.$str255$_macr_);
        html_declare_glyph((SubLObject)html_utilities.$kw256$DEG, (SubLObject)html_utilities.$str257$_deg_);
        html_declare_glyph((SubLObject)html_utilities.$kw258$PLUSMN, (SubLObject)html_utilities.$str259$_plusmn_);
        html_declare_glyph((SubLObject)html_utilities.$kw260$SUP2, (SubLObject)html_utilities.$str261$_sup2_);
        html_declare_glyph((SubLObject)html_utilities.$kw262$SUP3, (SubLObject)html_utilities.$str263$_sup3_);
        html_declare_glyph((SubLObject)html_utilities.$kw264$ACUTE, (SubLObject)html_utilities.$str265$_acute_);
        html_declare_glyph((SubLObject)html_utilities.$kw266$MICRO, (SubLObject)html_utilities.$str267$_micro_);
        html_declare_glyph((SubLObject)html_utilities.$kw268$PARA, (SubLObject)html_utilities.$str269$_para_);
        html_declare_glyph((SubLObject)html_utilities.$kw270$MIDDOT, (SubLObject)html_utilities.$str271$_middoy_);
        html_declare_glyph((SubLObject)html_utilities.$kw272$CEDIL, (SubLObject)html_utilities.$str273$_cedil_);
        html_declare_glyph((SubLObject)html_utilities.$kw274$SUP1, (SubLObject)html_utilities.$str275$_sup1_);
        html_declare_glyph((SubLObject)html_utilities.$kw276$ORDM, (SubLObject)html_utilities.$str277$_ordm_);
        html_declare_glyph((SubLObject)html_utilities.$kw278$RAQUO, (SubLObject)html_utilities.$str279$_raquo_);
        html_declare_glyph((SubLObject)html_utilities.$kw280$FRAC14, (SubLObject)html_utilities.$str281$_frac14_);
        html_declare_glyph((SubLObject)html_utilities.$kw282$FRAC12, (SubLObject)html_utilities.$str283$_frac12_);
        html_declare_glyph((SubLObject)html_utilities.$kw284$FRAC34, (SubLObject)html_utilities.$str285$_frac34_);
        html_declare_glyph((SubLObject)html_utilities.$kw286$IQUEST, (SubLObject)html_utilities.$str287$_iquest_);
        html_declare_glyph((SubLObject)html_utilities.$kw288$AGRAVE_CAP, (SubLObject)html_utilities.$str289$_Agrave_);
        html_declare_glyph((SubLObject)html_utilities.$kw290$AACUTE_CAP, (SubLObject)html_utilities.$str291$_Aacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw292$ACIRC_CAP, (SubLObject)html_utilities.$str293$_Acirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw294$ATILDE_CAP, (SubLObject)html_utilities.$str295$_Atilde_);
        html_declare_glyph((SubLObject)html_utilities.$kw296$AUML_CAP, (SubLObject)html_utilities.$str297$_Auml_);
        html_declare_glyph((SubLObject)html_utilities.$kw298$ARING_CAP, (SubLObject)html_utilities.$str299$_Aring_);
        html_declare_glyph((SubLObject)html_utilities.$kw300$AELIG_CAP, (SubLObject)html_utilities.$str301$_AElig_);
        html_declare_glyph((SubLObject)html_utilities.$kw302$CCEDIL_CAP, (SubLObject)html_utilities.$str303$_Ccedil_);
        html_declare_glyph((SubLObject)html_utilities.$kw304$EGRAVE_CAP, (SubLObject)html_utilities.$str305$_Egrave_);
        html_declare_glyph((SubLObject)html_utilities.$kw306$EACUTE_CAP, (SubLObject)html_utilities.$str307$_Eacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw308$ECIRC_CAP, (SubLObject)html_utilities.$str309$_Ecirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw310$EUML_CAP, (SubLObject)html_utilities.$str311$_Euml_);
        html_declare_glyph((SubLObject)html_utilities.$kw312$IGRAVE_CAP, (SubLObject)html_utilities.$str313$_Igrave_);
        html_declare_glyph((SubLObject)html_utilities.$kw314$IACUTE_CAP, (SubLObject)html_utilities.$str315$_Iacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw316$ICIRC_CAP, (SubLObject)html_utilities.$str317$_Icirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw318$IUML_CAP, (SubLObject)html_utilities.$str319$_Iuml_);
        html_declare_glyph((SubLObject)html_utilities.$kw320$ETH_CAP, (SubLObject)html_utilities.$str321$_ETH_);
        html_declare_glyph((SubLObject)html_utilities.$kw322$NTILDE_CAP, (SubLObject)html_utilities.$str323$_Ntilde_);
        html_declare_glyph((SubLObject)html_utilities.$kw324$OGRAVE_CAP, (SubLObject)html_utilities.$str325$_Ograve_);
        html_declare_glyph((SubLObject)html_utilities.$kw326$OACUTE_CAP, (SubLObject)html_utilities.$str327$_Oacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw328$OCIRC_CAP, (SubLObject)html_utilities.$str329$_Ocirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw330$OTILDE_CAP, (SubLObject)html_utilities.$str331$_Otilde_);
        html_declare_glyph((SubLObject)html_utilities.$kw332$OUML_CAP, (SubLObject)html_utilities.$str333$_Ouml_);
        html_declare_glyph((SubLObject)html_utilities.$kw334$TIMES, (SubLObject)html_utilities.$str335$_times_);
        html_declare_glyph((SubLObject)html_utilities.$kw336$OSLASH_CAP, (SubLObject)html_utilities.$str337$_Oslash_);
        html_declare_glyph((SubLObject)html_utilities.$kw338$UGRAVE_CAP, (SubLObject)html_utilities.$str339$_Ugrave_);
        html_declare_glyph((SubLObject)html_utilities.$kw340$UACUTE_CAP, (SubLObject)html_utilities.$str341$_Uacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw342$UCIRC_CAP, (SubLObject)html_utilities.$str343$_Ucirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw344$UUML_CAP, (SubLObject)html_utilities.$str345$_Uuml_);
        html_declare_glyph((SubLObject)html_utilities.$kw346$YACUTE_CAP, (SubLObject)html_utilities.$str347$_Yacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw348$THORN_CAP, (SubLObject)html_utilities.$str349$_THORN_);
        html_declare_glyph((SubLObject)html_utilities.$kw350$SZLIG, (SubLObject)html_utilities.$str351$_szlig_);
        html_declare_glyph((SubLObject)html_utilities.$kw352$AGRAVE, (SubLObject)html_utilities.$str353$_agrave_);
        html_declare_glyph((SubLObject)html_utilities.$kw354$AACUTE, (SubLObject)html_utilities.$str355$_aacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw356$ACIRC, (SubLObject)html_utilities.$str357$_acirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw358$ATILDE, (SubLObject)html_utilities.$str359$_atilde_);
        html_declare_glyph((SubLObject)html_utilities.$kw360$AUML, (SubLObject)html_utilities.$str361$_auml_);
        html_declare_glyph((SubLObject)html_utilities.$kw362$ARING, (SubLObject)html_utilities.$str363$_aring_);
        html_declare_glyph((SubLObject)html_utilities.$kw364$AELIG, (SubLObject)html_utilities.$str365$_aelig_);
        html_declare_glyph((SubLObject)html_utilities.$kw366$CCEDIL, (SubLObject)html_utilities.$str367$_ccedil_);
        html_declare_glyph((SubLObject)html_utilities.$kw368$EGRAVE, (SubLObject)html_utilities.$str369$_egrave_);
        html_declare_glyph((SubLObject)html_utilities.$kw370$EACUTE, (SubLObject)html_utilities.$str371$_eacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw372$ECIRC, (SubLObject)html_utilities.$str373$_ecirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw374$EUML, (SubLObject)html_utilities.$str375$_euml_);
        html_declare_glyph((SubLObject)html_utilities.$kw376$IGRAVE, (SubLObject)html_utilities.$str377$_igrave_);
        html_declare_glyph((SubLObject)html_utilities.$kw378$IACUTE, (SubLObject)html_utilities.$str379$_iacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw380$ICIRC, (SubLObject)html_utilities.$str381$_icirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw382$IUML, (SubLObject)html_utilities.$str383$_iuml_);
        html_declare_glyph((SubLObject)html_utilities.$kw384$ETH, (SubLObject)html_utilities.$str385$_eth_);
        html_declare_glyph((SubLObject)html_utilities.$kw386$NTILDE, (SubLObject)html_utilities.$str387$_ntilde_);
        html_declare_glyph((SubLObject)html_utilities.$kw388$OGRAVE, (SubLObject)html_utilities.$str389$_ograve_);
        html_declare_glyph((SubLObject)html_utilities.$kw390$OACUTE, (SubLObject)html_utilities.$str391$_oacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw392$OCIRC, (SubLObject)html_utilities.$str393$_ocirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw394$OTILDE, (SubLObject)html_utilities.$str395$_otilde_);
        html_declare_glyph((SubLObject)html_utilities.$kw396$OUML, (SubLObject)html_utilities.$str397$_ouml_);
        html_declare_glyph((SubLObject)html_utilities.$kw398$DIVIDE, (SubLObject)html_utilities.$str399$_divide_);
        html_declare_glyph((SubLObject)html_utilities.$kw400$OSLASH, (SubLObject)html_utilities.$str401$_oslash_);
        html_declare_glyph((SubLObject)html_utilities.$kw402$UGRAVE, (SubLObject)html_utilities.$str403$_ugrave_);
        html_declare_glyph((SubLObject)html_utilities.$kw404$UACUTE, (SubLObject)html_utilities.$str405$_uacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw406$UCIRC, (SubLObject)html_utilities.$str407$_ucirc_);
        html_declare_glyph((SubLObject)html_utilities.$kw408$UUML, (SubLObject)html_utilities.$str409$_uuml_);
        html_declare_glyph((SubLObject)html_utilities.$kw410$YACUTE, (SubLObject)html_utilities.$str411$_yacute_);
        html_declare_glyph((SubLObject)html_utilities.$kw412$THORN, (SubLObject)html_utilities.$str413$_thorn_);
        html_declare_glyph((SubLObject)html_utilities.$kw414$YUML, (SubLObject)html_utilities.$str415$_yuml_);
        html_declare_glyph((SubLObject)html_utilities.$kw416$FNOF, (SubLObject)html_utilities.$str417$_fnof_);
        html_declare_glyph((SubLObject)html_utilities.$kw418$ALPHA_CAP, (SubLObject)html_utilities.$str419$_Alpha_);
        html_declare_glyph((SubLObject)html_utilities.$kw420$BETA_CAP, (SubLObject)html_utilities.$str421$_Beta_);
        html_declare_glyph((SubLObject)html_utilities.$kw422$GAMMA_CAP, (SubLObject)html_utilities.$str423$_Gamma_);
        html_declare_glyph((SubLObject)html_utilities.$kw424$DELTA_CAP, (SubLObject)html_utilities.$str425$_Delta_);
        html_declare_glyph((SubLObject)html_utilities.$kw426$EPSILON_CAP, (SubLObject)html_utilities.$str427$_Epsilon_);
        html_declare_glyph((SubLObject)html_utilities.$kw428$ZETA_CAP, (SubLObject)html_utilities.$str429$_Zeta_);
        html_declare_glyph((SubLObject)html_utilities.$kw430$ETA_CAP, (SubLObject)html_utilities.$str431$_Eta_);
        html_declare_glyph((SubLObject)html_utilities.$kw432$THETA_CAP, (SubLObject)html_utilities.$str433$_Theta_);
        html_declare_glyph((SubLObject)html_utilities.$kw434$IOTA_CAP, (SubLObject)html_utilities.$str435$_Iota_);
        html_declare_glyph((SubLObject)html_utilities.$kw436$KAPPA_CAP, (SubLObject)html_utilities.$str437$_Kappa_);
        html_declare_glyph((SubLObject)html_utilities.$kw438$LAMBDA_CAP, (SubLObject)html_utilities.$str439$_Lambda_);
        html_declare_glyph((SubLObject)html_utilities.$kw440$MU_CAP, (SubLObject)html_utilities.$str441$_Mu_);
        html_declare_glyph((SubLObject)html_utilities.$kw442$NU_CAP, (SubLObject)html_utilities.$str443$_Nu_);
        html_declare_glyph((SubLObject)html_utilities.$kw444$XI_CAP, (SubLObject)html_utilities.$str445$_Xi_);
        html_declare_glyph((SubLObject)html_utilities.$kw446$OMICRON_CAP, (SubLObject)html_utilities.$str447$_Omicron_);
        html_declare_glyph((SubLObject)html_utilities.$kw448$PI_CAP, (SubLObject)html_utilities.$str449$_Pi_);
        html_declare_glyph((SubLObject)html_utilities.$kw450$RHO_CAP, (SubLObject)html_utilities.$str451$_Rho_);
        html_declare_glyph((SubLObject)html_utilities.$kw452$SIGMA_CAP, (SubLObject)html_utilities.$str453$_Sigma_);
        html_declare_glyph((SubLObject)html_utilities.$kw454$TAU_CAP, (SubLObject)html_utilities.$str455$_Tau_);
        html_declare_glyph((SubLObject)html_utilities.$kw456$UPSILON_CAP, (SubLObject)html_utilities.$str457$_Upsilon_);
        html_declare_glyph((SubLObject)html_utilities.$kw458$PHI_CAP, (SubLObject)html_utilities.$str459$_Phi_);
        html_declare_glyph((SubLObject)html_utilities.$kw460$CHI_CAP, (SubLObject)html_utilities.$str461$_Chi_);
        html_declare_glyph((SubLObject)html_utilities.$kw462$PSI_CAP, (SubLObject)html_utilities.$str463$_Psi_);
        html_declare_glyph((SubLObject)html_utilities.$kw464$OMEGA_CAP, (SubLObject)html_utilities.$str465$_Omega_);
        html_declare_glyph((SubLObject)html_utilities.$kw466$ALPHA, (SubLObject)html_utilities.$str467$_alpha_);
        html_declare_glyph((SubLObject)html_utilities.$kw468$BETA, (SubLObject)html_utilities.$str469$_beta_);
        html_declare_glyph((SubLObject)html_utilities.$kw470$GAMMA, (SubLObject)html_utilities.$str471$_gamma_);
        html_declare_glyph((SubLObject)html_utilities.$kw472$DELTA, (SubLObject)html_utilities.$str473$_delta_);
        html_declare_glyph((SubLObject)html_utilities.$kw474$EPSILON, (SubLObject)html_utilities.$str475$_epsilon_);
        html_declare_glyph((SubLObject)html_utilities.$kw476$ZETA, (SubLObject)html_utilities.$str477$_zeta_);
        html_declare_glyph((SubLObject)html_utilities.$kw478$ETA, (SubLObject)html_utilities.$str479$_eta_);
        html_declare_glyph((SubLObject)html_utilities.$kw480$THETA, (SubLObject)html_utilities.$str481$_theta_);
        html_declare_glyph((SubLObject)html_utilities.$kw482$IOTA, (SubLObject)html_utilities.$str483$_iota_);
        html_declare_glyph((SubLObject)html_utilities.$kw484$KAPPA, (SubLObject)html_utilities.$str485$_kappa_);
        html_declare_glyph((SubLObject)html_utilities.$kw486$LAMBDA, (SubLObject)html_utilities.$str487$_lambda_);
        html_declare_glyph((SubLObject)html_utilities.$kw488$MU, (SubLObject)html_utilities.$str489$_mu_);
        html_declare_glyph((SubLObject)html_utilities.$kw490$NU, (SubLObject)html_utilities.$str491$_nu_);
        html_declare_glyph((SubLObject)html_utilities.$kw492$XI, (SubLObject)html_utilities.$str493$_xi_);
        html_declare_glyph((SubLObject)html_utilities.$kw494$OMICRON, (SubLObject)html_utilities.$str495$_omicron_);
        html_declare_glyph((SubLObject)html_utilities.$kw496$PI, (SubLObject)html_utilities.$str497$_pi_);
        html_declare_glyph((SubLObject)html_utilities.$kw498$RHO, (SubLObject)html_utilities.$str499$_rho_);
        html_declare_glyph((SubLObject)html_utilities.$kw500$SIGMAF, (SubLObject)html_utilities.$str501$_sigmaf_);
        html_declare_glyph((SubLObject)html_utilities.$kw502$SIGMA, (SubLObject)html_utilities.$str503$_sigma_);
        html_declare_glyph((SubLObject)html_utilities.$kw504$TAU, (SubLObject)html_utilities.$str505$_tau_);
        html_declare_glyph((SubLObject)html_utilities.$kw506$UPSILON, (SubLObject)html_utilities.$str507$_upsilon_);
        html_declare_glyph((SubLObject)html_utilities.$kw508$PHI, (SubLObject)html_utilities.$str509$_phi_);
        html_declare_glyph((SubLObject)html_utilities.$kw510$CHI, (SubLObject)html_utilities.$str511$_chi_);
        html_declare_glyph((SubLObject)html_utilities.$kw512$PSI, (SubLObject)html_utilities.$str513$_psi_);
        html_declare_glyph((SubLObject)html_utilities.$kw514$OMEGA, (SubLObject)html_utilities.$str515$_omega_);
        html_declare_glyph((SubLObject)html_utilities.$kw516$THETASYM, (SubLObject)html_utilities.$str481$_theta_);
        html_declare_glyph((SubLObject)html_utilities.$kw517$UPSIH, (SubLObject)html_utilities.$str518$_upsih_);
        html_declare_glyph((SubLObject)html_utilities.$kw519$PIV, (SubLObject)html_utilities.$str520$_piv_);
        html_declare_glyph((SubLObject)html_utilities.$kw521$BULL, (SubLObject)html_utilities.$str522$_bull_);
        html_declare_glyph((SubLObject)html_utilities.$kw523$HELLIP, (SubLObject)html_utilities.$str524$_hellip_);
        html_declare_glyph((SubLObject)html_utilities.$kw525$PRIME, (SubLObject)html_utilities.$str526$_prime_);
        html_declare_glyph((SubLObject)html_utilities.$kw527$PRIME_DBL, (SubLObject)html_utilities.$str528$_Prime_);
        html_declare_glyph((SubLObject)html_utilities.$kw529$OLINE, (SubLObject)html_utilities.$str530$_oline_);
        html_declare_glyph((SubLObject)html_utilities.$kw531$FRASL, (SubLObject)html_utilities.$str532$_frasl_);
        html_declare_glyph((SubLObject)html_utilities.$kw533$WEIERP, (SubLObject)html_utilities.$str534$_weierp_);
        html_declare_glyph((SubLObject)html_utilities.$kw535$IMAGE, (SubLObject)html_utilities.$str536$_image_);
        html_declare_glyph((SubLObject)html_utilities.$kw537$REAL, (SubLObject)html_utilities.$str538$_real_);
        html_declare_glyph((SubLObject)html_utilities.$kw539$TRADE, (SubLObject)html_utilities.$str540$_trade_);
        html_declare_glyph((SubLObject)html_utilities.$kw541$ALEFSYM, (SubLObject)html_utilities.$str542$_alefsym_);
        html_declare_glyph((SubLObject)html_utilities.$kw543$UPWARDS_ARROW, (SubLObject)html_utilities.$str544$_uarr_);
        html_declare_glyph((SubLObject)html_utilities.$kw545$RIGHTWARDS_ARROW, (SubLObject)html_utilities.$str546$_rarr_);
        html_declare_glyph((SubLObject)html_utilities.$kw547$LARR, (SubLObject)html_utilities.$str548$_larr_);
        html_declare_glyph((SubLObject)html_utilities.$kw549$UARR, (SubLObject)html_utilities.$str544$_uarr_);
        html_declare_glyph((SubLObject)html_utilities.$kw550$RARR, (SubLObject)html_utilities.$str546$_rarr_);
        html_declare_glyph((SubLObject)html_utilities.$kw551$DARR, (SubLObject)html_utilities.$str552$_darr_);
        html_declare_glyph((SubLObject)html_utilities.$kw553$HARR, (SubLObject)html_utilities.$str554$_harr_);
        html_declare_glyph((SubLObject)html_utilities.$kw555$CRARR, (SubLObject)html_utilities.$str556$_crarr_);
        html_declare_glyph((SubLObject)html_utilities.$kw557$LARR_DBL, (SubLObject)html_utilities.$str558$_lArr_);
        html_declare_glyph((SubLObject)html_utilities.$kw559$UARR_DBL, (SubLObject)html_utilities.$str560$_uArr_);
        html_declare_glyph((SubLObject)html_utilities.$kw561$RARR_DBL, (SubLObject)html_utilities.$str562$_rArr_);
        html_declare_glyph((SubLObject)html_utilities.$kw563$DARR_DBL, (SubLObject)html_utilities.$str564$_dArr_);
        html_declare_glyph((SubLObject)html_utilities.$kw565$HARR_DBL, (SubLObject)html_utilities.$str566$_hArr_);
        html_declare_glyph((SubLObject)html_utilities.$kw567$FORALL, (SubLObject)html_utilities.$str568$_forall_);
        html_declare_glyph((SubLObject)html_utilities.$kw569$PART, (SubLObject)html_utilities.$str570$_part_);
        html_declare_glyph((SubLObject)html_utilities.$kw571$EXIST, (SubLObject)html_utilities.$str572$_exist_);
        html_declare_glyph((SubLObject)html_utilities.$kw573$EMPTY, (SubLObject)html_utilities.$str574$_empty_);
        html_declare_glyph((SubLObject)html_utilities.$kw575$NABLA, (SubLObject)html_utilities.$str576$_nabla_);
        html_declare_glyph((SubLObject)html_utilities.$kw577$ISIN, (SubLObject)html_utilities.$str578$_isin_);
        html_declare_glyph((SubLObject)html_utilities.$kw579$NOTIN, (SubLObject)html_utilities.$str580$_notin_);
        html_declare_glyph((SubLObject)html_utilities.$kw581$NI, (SubLObject)html_utilities.$str582$_ni_);
        html_declare_glyph((SubLObject)html_utilities.$kw583$PROD, (SubLObject)html_utilities.$str584$_prod_);
        html_declare_glyph((SubLObject)html_utilities.$kw585$SUM, (SubLObject)html_utilities.$str586$_sum_);
        html_declare_glyph((SubLObject)html_utilities.$kw587$MINUS, (SubLObject)html_utilities.$str588$_minus_);
        html_declare_glyph((SubLObject)html_utilities.$kw589$LOWAST, (SubLObject)html_utilities.$str590$_lowast_);
        html_declare_glyph((SubLObject)html_utilities.$kw591$RADIC, (SubLObject)html_utilities.$str592$_radic_);
        html_declare_glyph((SubLObject)html_utilities.$kw593$PROP, (SubLObject)html_utilities.$str594$_prop_);
        html_declare_glyph((SubLObject)html_utilities.$kw595$INFIN, (SubLObject)html_utilities.$str596$_infin_);
        html_declare_glyph((SubLObject)html_utilities.$kw597$ANG, (SubLObject)html_utilities.$str598$_ang_);
        html_declare_glyph((SubLObject)html_utilities.$kw599$AND, (SubLObject)html_utilities.$str600$_and_);
        html_declare_glyph((SubLObject)html_utilities.$kw601$OR, (SubLObject)html_utilities.$str602$_or_);
        html_declare_glyph((SubLObject)html_utilities.$kw603$CAP, (SubLObject)html_utilities.$str604$_cap_);
        html_declare_glyph((SubLObject)html_utilities.$kw605$CUP, (SubLObject)html_utilities.$str606$_cup_);
        html_declare_glyph((SubLObject)html_utilities.$kw607$INT, (SubLObject)html_utilities.$str608$_int_);
        html_declare_glyph((SubLObject)html_utilities.$kw609$THERE4, (SubLObject)html_utilities.$str610$_there4_);
        html_declare_glyph((SubLObject)html_utilities.$kw611$SIM, (SubLObject)html_utilities.$str612$_sim_);
        html_declare_glyph((SubLObject)html_utilities.$kw613$CONG, (SubLObject)html_utilities.$str614$_cong_);
        html_declare_glyph((SubLObject)html_utilities.$kw615$ASYMP, (SubLObject)html_utilities.$str616$_asymp_);
        html_declare_glyph((SubLObject)html_utilities.$kw617$NE, (SubLObject)html_utilities.$str618$_ne_);
        html_declare_glyph((SubLObject)html_utilities.$kw619$EQUIV, (SubLObject)html_utilities.$str620$_equiv_);
        html_declare_glyph((SubLObject)html_utilities.$kw621$LE, (SubLObject)html_utilities.$str622$_le_);
        html_declare_glyph((SubLObject)html_utilities.$kw623$GE, (SubLObject)html_utilities.$str624$_ge_);
        html_declare_glyph((SubLObject)html_utilities.$kw625$SUB, (SubLObject)html_utilities.$str626$_sub_);
        html_declare_glyph((SubLObject)html_utilities.$kw627$SUP, (SubLObject)html_utilities.$str628$_sup_);
        html_declare_glyph((SubLObject)html_utilities.$kw629$NSUB, (SubLObject)html_utilities.$str630$_nsub_);
        html_declare_glyph((SubLObject)html_utilities.$kw631$SUBE, (SubLObject)html_utilities.$str632$_sube_);
        html_declare_glyph((SubLObject)html_utilities.$kw633$SUPE, (SubLObject)html_utilities.$str634$_supe_);
        html_declare_glyph((SubLObject)html_utilities.$kw635$OPLUS, (SubLObject)html_utilities.$str636$_oplus_);
        html_declare_glyph((SubLObject)html_utilities.$kw637$OTIMES, (SubLObject)html_utilities.$str638$_otimes_);
        html_declare_glyph((SubLObject)html_utilities.$kw639$PERP, (SubLObject)html_utilities.$str640$_perp_);
        html_declare_glyph((SubLObject)html_utilities.$kw641$SDOT, (SubLObject)html_utilities.$str642$_sdot_);
        html_declare_glyph((SubLObject)html_utilities.$kw643$LCEIL, (SubLObject)html_utilities.$str644$_lceil_);
        html_declare_glyph((SubLObject)html_utilities.$kw645$RCEIL, (SubLObject)html_utilities.$str646$_rceil_);
        html_declare_glyph((SubLObject)html_utilities.$kw647$LFLOOR, (SubLObject)html_utilities.$str648$_lfloor_);
        html_declare_glyph((SubLObject)html_utilities.$kw649$RFLOOR, (SubLObject)html_utilities.$str650$_rfloor_);
        html_declare_glyph((SubLObject)html_utilities.$kw651$LANG, (SubLObject)html_utilities.$str652$_lang_);
        html_declare_glyph((SubLObject)html_utilities.$kw653$RANG, (SubLObject)html_utilities.$str654$_rang_);
        html_declare_glyph((SubLObject)html_utilities.$kw655$LOZ, (SubLObject)html_utilities.$str656$_loz_);
        html_declare_glyph((SubLObject)html_utilities.$kw657$SPADES, (SubLObject)html_utilities.$str658$_spades_);
        html_declare_glyph((SubLObject)html_utilities.$kw659$CLUBS, (SubLObject)html_utilities.$str660$_clubs_);
        html_declare_glyph((SubLObject)html_utilities.$kw661$HEARTS, (SubLObject)html_utilities.$str662$_hearts_);
        html_declare_glyph((SubLObject)html_utilities.$kw663$DIAMS, (SubLObject)html_utilities.$str664$_diams_);
        html_declare_glyph((SubLObject)html_utilities.$kw665$FROWNY_FACE, (SubLObject)html_utilities.$str666$__9785_);
        html_macros.note_cgi_handler_function((SubLObject)html_utilities.$sym676$HTML_ECHO_ARGS, (SubLObject)html_utilities.$kw677$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)html_utilities.$sym681$HTML_ECHO_FILE, (SubLObject)html_utilities.$kw677$HTML_HANDLER);
        sunit_external.define_test_category(html_utilities.$html_utils_test_category$.getGlobalValue(), (SubLObject)html_utilities.UNPROVIDED);
        sunit_external.define_test_suite(html_utilities.$html_utils_test_suite$.getGlobalValue(), (SubLObject)ConsesLow.list(html_utilities.$html_utils_test_category$.getGlobalValue()), (SubLObject)html_utilities.UNPROVIDED, (SubLObject)html_utilities.UNPROVIDED);
        return (SubLObject)html_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_html_utilities_file();
    }
    
    public void initializeVariables() {
        init_html_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_html_utilities_file();
    }
    
    static {
        me = (SubLFile)new html_utilities();
        html_utilities.$cb_use_frames$ = null;
        html_utilities.$use_new_html_princ_cycl_stringP$ = null;
        html_utilities.$html_stale_constant_reference_color$ = null;
        html_utilities.$html_url_princ_escape_spaces$ = null;
        html_utilities.$html_style_background$ = null;
        html_utilities.$html_align_map$ = null;
        html_utilities.$cycorp_homepage_url$ = null;
        html_utilities.$cycorp_homepage_text$ = null;
        html_utilities.$proprietarity_message$ = null;
        html_utilities.$html_extract_field_name$ = null;
        html_utilities.$url_to_text_replacements$ = null;
        html_utilities.$html_filename_input_prefix$ = null;
        html_utilities.$html_multipart_form_date$ = null;
        html_utilities.$html_newline_string$ = null;
        html_utilities.$html_multipart_content_marker$ = null;
        html_utilities.$html_multipart_content_marker_size$ = null;
        html_utilities.$build_treemap_depth$ = null;
        html_utilities.$build_treemap_max_depth$ = null;
        html_utilities.$html_utils_test$ = null;
        html_utilities.$html_utils_test_category$ = null;
        html_utilities.$html_utils_test_suite$ = null;
        html_utilities.$html_utils_module$ = null;
        $sym0$_CB_USE_FRAMES_ = SubLObjectFactory.makeSymbol("*CB-USE-FRAMES*");
        $sym1$HTML_RESERVED_CHAR_P = SubLObjectFactory.makeSymbol("HTML-RESERVED-CHAR-P");
        $sym2$NON_ASCII_CHAR_P = SubLObjectFactory.makeSymbol("NON-ASCII-CHAR-P");
        $int3$38 = SubLObjectFactory.makeInteger(38);
        $int4$34 = SubLObjectFactory.makeInteger(34);
        $int5$60 = SubLObjectFactory.makeInteger(60);
        $int6$62 = SubLObjectFactory.makeInteger(62);
        $str7$__x = SubLObjectFactory.makeString("&#x");
        $str8$_ = SubLObjectFactory.makeString(";");
        $sym9$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw10$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $float11$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $sym12$CB_FORM = SubLObjectFactory.makeSymbol("CB-FORM");
        $int13$128 = SubLObjectFactory.makeInteger(128);
        $str14$__A_ = SubLObjectFactory.makeString("|~A|");
        $kw15$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str16$__x_x_ = SubLObjectFactory.makeString("&#x~x;");
        $str17$______i__ = SubLObjectFactory.makeString(" ... <i>(");
        $str18$_characters_total___i_ = SubLObjectFactory.makeString(" characters total)</i>");
        $sym19$MIN = SubLObjectFactory.makeSymbol("MIN");
        $sym20$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym21$EL_VARIABLE_CHAR_ = SubLObjectFactory.makeSymbol("EL-VARIABLE-CHAR?");
        $sym22$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $str23$_ = SubLObjectFactory.makeString("<");
        $str24$_ = SubLObjectFactory.makeString("/");
        $str25$_ = SubLObjectFactory.makeString(">");
        $str26$code = SubLObjectFactory.makeString("code");
        $str27$pre = SubLObjectFactory.makeString("pre");
        $sym28$HTML_LINK_TO_OWL_URI = SubLObjectFactory.makeSymbol("HTML-LINK-TO-OWL-URI");
        $sym29$HTML_LINK_TO_OWL_OPENCYC_URI = SubLObjectFactory.makeSymbol("HTML-LINK-TO-OWL-OPENCYC-URI");
        $sym30$OPENCYC_HTML_CYCL_STRING = SubLObjectFactory.makeSymbol("OPENCYC-HTML-CYCL-STRING");
        $kw31$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw32$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw33$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw34$KB = SubLObjectFactory.makeKeyword("KB");
        $kw35$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw36$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list37 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("#$rdfs:label is")), (SubLObject)SubLObjectFactory.makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("#$rdfs:label is #$owl:NONSENSE http://www.w3.org/2000/01/rdf-schema#label")), (SubLObject)SubLObjectFactory.makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rdpCjwNu9QdaChuanmVyrQg\" class=\"cyc_term\">rdfs_label</a> is <font color=\"#ff0000\">#$owl:NONSENSE</font> <a href= \"http://www.w3.org/2000/01/rdf-schema#label\">http://www.w3.org/2000/01/rdf-schema#label</a>")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("This is a <code>META-VARIABLE</code>.")), (SubLObject)SubLObjectFactory.makeString("This is a <code><b>META-VARIABLE</b></code>.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("This is not a META-VARIABLE.")), (SubLObject)SubLObjectFactory.makeString("This is not a META-VARIABLE.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("<code>(#$isa #$Emu THING)</code>.")), (SubLObject)SubLObjectFactory.makeString("<code>(<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvViBBJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">isa</a> <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a> <b>THING</b>)</code>.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Bert is an #$Emu.")), (SubLObject)SubLObjectFactory.makeString("Bert is an <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Please link to http://www.cyc.com.")), (SubLObject)SubLObjectFactory.makeString("Please link to <a href= \"http://www.cyc.com\">http://www.cyc.com</a>.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("#$Emus are kind and gentle creatures.")), (SubLObject)SubLObjectFactory.makeString("<a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rwBpLoJwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Emu</a>s are kind and gentle creatures.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("The #$FamousHuman artist known as &u99AC;&u53CB;&u53CB;."))), (SubLObject)SubLObjectFactory.makeString("The <a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvVjma5wpEbGdrcN5Y29ycA\" class=\"cyc_term\">FamousHuman</a> artist known as &#x99AC;&#x53CB;&#x53CB;.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Blake loves <code>code</code>, but hates <CODE>code</CODE> unless there's a <code>#$Person</code> in it.")), (SubLObject)SubLObjectFactory.makeString("Blake loves <code>code</code>, but hates <CODE>code</CODE> unless there's a <code><a href=\"http://sw.opencyc.org/2012/05/10/concept/Mx4rvViAkpwpEbGdrcN5Y29ycA\" class=\"cyc_term\">Person</a></code> in it.")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("S")), (SubLObject)SubLObjectFactory.makeString("S")) });
        $kw38$RED = SubLObjectFactory.makeKeyword("RED");
        $str39$_A = SubLObjectFactory.makeString("~A");
        $str40$_ = SubLObjectFactory.makeString("(");
        $str41$_ = SubLObjectFactory.makeString(" ");
        $str42$___ = SubLObjectFactory.makeString(" . ");
        $str43$_ = SubLObjectFactory.makeString(")");
        $str44$___ = SubLObjectFactory.makeString("-_.");
        $str45$__C_C = SubLObjectFactory.makeString("%~C~C");
        $str46$_ = SubLObjectFactory.makeString("=");
        $str47$ = SubLObjectFactory.makeString("");
        $str48$background_color_ = SubLObjectFactory.makeString("background-color:");
        $list49 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TOP"), (SubLObject)SubLObjectFactory.makeString("top")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MIDDLE"), (SubLObject)SubLObjectFactory.makeString("middle")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BOTTOM"), (SubLObject)SubLObjectFactory.makeString("bottom")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LEFT"), (SubLObject)SubLObjectFactory.makeString("left")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CENTER"), (SubLObject)SubLObjectFactory.makeString("center")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("RIGHT"), (SubLObject)SubLObjectFactory.makeString("right")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("TEXTTOP"), (SubLObject)SubLObjectFactory.makeString("top")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ABSMIDDLE"), (SubLObject)SubLObjectFactory.makeString("middle")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("BASELINE"), (SubLObject)SubLObjectFactory.makeString("bottom")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ABSBOTTOM"), (SubLObject)SubLObjectFactory.makeString("bottom")) });
        $str50$http___www_cyc_com = SubLObjectFactory.makeString("http://www.cyc.com");
        $str51$Cycorp = SubLObjectFactory.makeString("Cycorp");
        $sym52$_PROPRIETARITY_MESSAGE_ = SubLObjectFactory.makeSymbol("*PROPRIETARITY-MESSAGE*");
        $str53$copyright = SubLObjectFactory.makeString("copyright");
        $str54$Copyright__copy__1995____A_ = SubLObjectFactory.makeString("Copyright &copy; 1995 - ~A ");
        $str55$___All_rights_reserved___ = SubLObjectFactory.makeString(".  All rights reserved.  ");
        $kw56$CYC_LOGO_SMALL_VIOLET_FULL_URL = SubLObjectFactory.makeKeyword("CYC-LOGO-SMALL-VIOLET-FULL-URL");
        $str57$cyc_logo_violet_16_gif = SubLObjectFactory.makeString("cyc-logo-violet-16.gif");
        $kw58$CYC_LOGO_LARGE_VIOLET_FULL_URL = SubLObjectFactory.makeKeyword("CYC-LOGO-LARGE-VIOLET-FULL-URL");
        $str59$cyc_logo_violet_60_gif = SubLObjectFactory.makeString("cyc-logo-violet-60.gif");
        $kw60$CYCORP_SYMBOL_TINY = SubLObjectFactory.makeKeyword("CYCORP-SYMBOL-TINY");
        $str61$cyc_logo_tiny_gif = SubLObjectFactory.makeString("cyc-logo-tiny.gif");
        $kw62$CYCORP_SYMBOL_SMALL = SubLObjectFactory.makeKeyword("CYCORP-SYMBOL-SMALL");
        $str63$cyc_logo_sm_gif = SubLObjectFactory.makeString("cyc-logo-sm.gif");
        $kw64$CYCORP_SYMBOL_MEDIUM = SubLObjectFactory.makeKeyword("CYCORP-SYMBOL-MEDIUM");
        $str65$cyc_logo_10_t_gif = SubLObjectFactory.makeString("cyc-logo-10-t.gif");
        $kw66$CYCORP_LOGO_MEDIUM = SubLObjectFactory.makeKeyword("CYCORP-LOGO-MEDIUM");
        $str67$cyc_logo_25_t_gif = SubLObjectFactory.makeString("cyc-logo-25-t.gif");
        $kw68$CYCORP_LOGO_BIG = SubLObjectFactory.makeKeyword("CYCORP-LOGO-BIG");
        $str69$cyc_logo_50_t_gif = SubLObjectFactory.makeString("cyc-logo-50-t.gif");
        $str70$_URL_ = SubLObjectFactory.makeString(";URL=");
        $str71$Refresh = SubLObjectFactory.makeString("Refresh");
        $str72$Content_type = SubLObjectFactory.makeString("Content-type");
        $str73$text_html__charset_UTF_8 = SubLObjectFactory.makeString("text/html; charset=UTF-8");
        $str74$Expires = SubLObjectFactory.makeString("Expires");
        $str75$Last_Modified = SubLObjectFactory.makeString("Last-Modified");
        $str76$Cache_Control = SubLObjectFactory.makeString("Cache-Control");
        $str77$no_cache = SubLObjectFactory.makeString("no-cache");
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HH"), (SubLObject)html_utilities.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MM"), (SubLObject)html_utilities.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SS"), (SubLObject)html_utilities.ZERO_INTEGER)));
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HH"), (SubLObject)SubLObjectFactory.makeKeyword("MM"), (SubLObject)SubLObjectFactory.makeKeyword("SS"));
        $kw80$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw81$HH = SubLObjectFactory.makeKeyword("HH");
        $kw82$MM = SubLObjectFactory.makeKeyword("MM");
        $kw83$SS = SubLObjectFactory.makeKeyword("SS");
        $sym84$HTML_WEBPAGE_EXPIRES = SubLObjectFactory.makeSymbol("HTML-WEBPAGE-EXPIRES");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-META-EXPIRES"));
        $sym86$HTML_META_EXPIRES = SubLObjectFactory.makeSymbol("HTML-META-EXPIRES");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIV-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-UNIVERSAL-TIME"))));
        $sym88$HTML_WEBPAGE_LAST_MODIFIED = SubLObjectFactory.makeSymbol("HTML-WEBPAGE-LAST-MODIFIED");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-META-LAST-MODIFIED"));
        $sym90$HTML_META_LAST_MODIFIED = SubLObjectFactory.makeSymbol("HTML-META-LAST-MODIFIED");
        $sym91$HTML_DONT_CACHE_WEBPAGE = SubLObjectFactory.makeSymbol("HTML-DONT-CACHE-WEBPAGE");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-META-DONT-CACHE"));
        $str93$ROBOTS = SubLObjectFactory.makeString("ROBOTS");
        $str94$NOINDEX__NOFOLLOW = SubLObjectFactory.makeString("NOINDEX, NOFOLLOW");
        $str95$INDEX__FOLLOW = SubLObjectFactory.makeString("INDEX, FOLLOW");
        $str96$NOINDEX__FOLLOW = SubLObjectFactory.makeString("NOINDEX, FOLLOW");
        $str97$INDEX__NOFOLLOW = SubLObjectFactory.makeString("INDEX, NOFOLLOW");
        $str98$Invalid_HTML_meta_select_robot_in = SubLObjectFactory.makeString("Invalid HTML meta select robot instruction.");
        $str99$Reset_All_Fields = SubLObjectFactory.makeString("Reset All Fields");
        $str100$autocomplete_ = SubLObjectFactory.makeString("autocomplete-");
        $str101$input_ = SubLObjectFactory.makeString("input-");
        $str102$autocomplete_results_ = SubLObjectFactory.makeString("autocomplete-results-");
        $str103$position_static__width_auto_ = SubLObjectFactory.makeString("position:static; width:auto ");
        $str104$yui_ac = SubLObjectFactory.makeString("yui-ac");
        $str105$yui_ac_input = SubLObjectFactory.makeString("yui-ac-input");
        $str106$yui_ac_container = SubLObjectFactory.makeString("yui-ac-container");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SRC"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"));
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SRC"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)SubLObjectFactory.makeSymbol("MAP-ITEMS"));
        $str109$_x = SubLObjectFactory.makeString(".x");
        $str110$_y = SubLObjectFactory.makeString(".y");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X-RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("Y-RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $kw113$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $int114$100 = SubLObjectFactory.makeInteger(100);
        $sym115$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SOFAR"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL"), (SubLObject)SubLObjectFactory.makeSymbol("WIDTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEIGHT"), (SubLObject)html_utilities.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-COLOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-COLOR-SAT-GREEN*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMAINING-COLOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-COLOR-SAT-RED*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BORDER"), (SubLObject)html_utilities.ZERO_INTEGER));
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOFAR"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-COLOR"), (SubLObject)SubLObjectFactory.makeKeyword("REMAINING-COLOR"), (SubLObject)SubLObjectFactory.makeKeyword("BORDER"));
        $kw118$SOFAR = SubLObjectFactory.makeKeyword("SOFAR");
        $kw119$TOTAL = SubLObjectFactory.makeKeyword("TOTAL");
        $kw120$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $kw121$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw122$PROGRESS_COLOR = SubLObjectFactory.makeKeyword("PROGRESS-COLOR");
        $sym123$_HTML_COLOR_SAT_GREEN_ = SubLObjectFactory.makeSymbol("*HTML-COLOR-SAT-GREEN*");
        $kw124$REMAINING_COLOR = SubLObjectFactory.makeKeyword("REMAINING-COLOR");
        $sym125$_HTML_COLOR_SAT_RED_ = SubLObjectFactory.makeSymbol("*HTML-COLOR-SAT-RED*");
        $kw126$BORDER = SubLObjectFactory.makeKeyword("BORDER");
        $sym127$WIDTH1 = SubLObjectFactory.makeUninternedSymbol("WIDTH1");
        $sym128$WIDTH2 = SubLObjectFactory.makeUninternedSymbol("WIDTH2");
        $sym129$HTML_FANCY_TABLE = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CELLSPACING"), (SubLObject)html_utilities.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CELLPADDING"), (SubLObject)html_utilities.ZERO_INTEGER);
        $sym131$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym132$HTML_FANCY_PERCENT_PROGRESS_BAR_WIDTHS = SubLObjectFactory.makeSymbol("HTML-FANCY-PERCENT-PROGRESS-BAR-WIDTHS");
        $sym133$HTML_FANCY_TABLE_ROW = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-ROW");
        $sym134$HTML_FANCY_TABLE_DATA = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA");
        $kw135$BGCOLOR = SubLObjectFactory.makeKeyword("BGCOLOR");
        $sym136$HTML_FANCY_PERCENT_PROGRESS_BAR = SubLObjectFactory.makeSymbol("HTML-FANCY-PERCENT-PROGRESS-BAR");
        $sym137$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $int138$1000 = SubLObjectFactory.makeInteger(1000);
        $kw139$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $kw140$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str141$Run_Time__ = SubLObjectFactory.makeString("Run Time :");
        $str142$Elapsed_Time__ = SubLObjectFactory.makeString("Elapsed Time :");
        $kw143$LEFT = SubLObjectFactory.makeKeyword("LEFT");
        $str144$Current_Total__ = SubLObjectFactory.makeString("Current Total :");
        $str145$_of_ = SubLObjectFactory.makeString(" of ");
        $kw146$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str147$_D_ = SubLObjectFactory.makeString("~D%");
        $str148$_No_data_to_graph_ = SubLObjectFactory.makeString("[No data to graph]");
        $sym149$MAX = SubLObjectFactory.makeSymbol("MAX");
        $sym150$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str151$100_ = SubLObjectFactory.makeString("100%");
        $str152$1_ = SubLObjectFactory.makeString("1%");
        $str153$_ = SubLObjectFactory.makeString("%");
        $str154$5_ = SubLObjectFactory.makeString("5%");
        $str155$95_ = SubLObjectFactory.makeString("95%");
        $str156$__D = SubLObjectFactory.makeString("~:D");
        $sym157$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $kw158$FANCY_NAME = SubLObjectFactory.makeKeyword("FANCY-NAME");
        $kw159$DESCRIPTION = SubLObjectFactory.makeKeyword("DESCRIPTION");
        $kw160$SETTINGS_SPEC = SubLObjectFactory.makeKeyword("SETTINGS-SPEC");
        $list161 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"), (SubLObject)SubLObjectFactory.makeString("Value")));
        $kw162$ENTRY = SubLObjectFactory.makeKeyword("ENTRY");
        $sym163$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list164 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DATUM"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBILITY-FANCY-NAME"));
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)html_utilities.NIL);
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE"));
        $kw167$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str168$The_value_entered_for__ = SubLObjectFactory.makeString("The value entered for '");
        $str169$__was_not_valid_ = SubLObjectFactory.makeString("' was not valid.");
        $str170$No_value_was_entered_for__ = SubLObjectFactory.makeString("No value was entered for '");
        $str171$__ = SubLObjectFactory.makeString("'.");
        $str172$No_choice_was_made_for__ = SubLObjectFactory.makeString("No choice was made for '");
        $str173$_is_not_a_declared_control_parame = SubLObjectFactory.makeString(" is not a declared control parameter");
        $sym174$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym175$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $str176$entry_ = SubLObjectFactory.makeString("entry-");
        $str177$radio_ = SubLObjectFactory.makeString("radio-");
        $sym178$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym179$MATCHING_HTML_FIELD = SubLObjectFactory.makeSymbol("MATCHING-HTML-FIELD");
        $sym180$DIGIT_CHAR_P = SubLObjectFactory.makeSymbol("DIGIT-CHAR-P");
        $kw181$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym182$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw183$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym184$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym185$MATCHING_HTML_BUTTON_FIELD = SubLObjectFactory.makeSymbol("MATCHING-HTML-BUTTON-FIELD");
        $str186$en = SubLObjectFactory.makeString("en");
        $const187$EnglishLanguage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishLanguage"));
        $str188$en_gb = SubLObjectFactory.makeString("en-gb");
        $const189$BritishEnglishDialect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BritishEnglishDialect"));
        $str190$fr = SubLObjectFactory.makeString("fr");
        $const191$FrenchLanguage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FrenchLanguage"));
        $str192$de = SubLObjectFactory.makeString("de");
        $const193$GermanLanguage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GermanLanguage"));
        $const194$languageCodeDigraph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languageCodeDigraph"));
        $kw195$HTML_GLYPH = SubLObjectFactory.makeKeyword("HTML-GLYPH");
        $kw196$LT = SubLObjectFactory.makeKeyword("LT");
        $str197$_lt_ = SubLObjectFactory.makeString("&lt;");
        $kw198$GT = SubLObjectFactory.makeKeyword("GT");
        $str199$_gt_ = SubLObjectFactory.makeString("&gt;");
        $kw200$AMP = SubLObjectFactory.makeKeyword("AMP");
        $str201$_amp_ = SubLObjectFactory.makeString("&amp;");
        $kw202$QUOT = SubLObjectFactory.makeKeyword("QUOT");
        $str203$_quot_ = SubLObjectFactory.makeString("&quot;");
        $kw204$REG = SubLObjectFactory.makeKeyword("REG");
        $str205$_reg_ = SubLObjectFactory.makeString("&reg;");
        $kw206$COPY = SubLObjectFactory.makeKeyword("COPY");
        $str207$_copy_ = SubLObjectFactory.makeString("&copy;");
        $str208$_nbsp_ = SubLObjectFactory.makeString("&nbsp;");
        $kw209$EMSP = SubLObjectFactory.makeKeyword("EMSP");
        $str210$_emsp_ = SubLObjectFactory.makeString("&emsp;");
        $kw211$ENSP = SubLObjectFactory.makeKeyword("ENSP");
        $str212$_ensp_ = SubLObjectFactory.makeString("&ensp;");
        $kw213$SPACE = SubLObjectFactory.makeKeyword("SPACE");
        $str214$__X0020_ = SubLObjectFactory.makeString("&#X0020;");
        $kw215$EM_SPACE = SubLObjectFactory.makeKeyword("EM-SPACE");
        $str216$__X2003_ = SubLObjectFactory.makeString("&#X2003;");
        $kw217$EN_SPACE = SubLObjectFactory.makeKeyword("EN-SPACE");
        $str218$__X2002_ = SubLObjectFactory.makeString("&#X2002;");
        $kw219$TWO_PER_EM_SPACE = SubLObjectFactory.makeKeyword("TWO-PER-EM-SPACE");
        $kw220$THREE_PER_EM_SPACE = SubLObjectFactory.makeKeyword("THREE-PER-EM-SPACE");
        $str221$__X2004_ = SubLObjectFactory.makeString("&#X2004;");
        $kw222$FOUR_PER_EM_SPACE = SubLObjectFactory.makeKeyword("FOUR-PER-EM-SPACE");
        $str223$__X2005_ = SubLObjectFactory.makeString("&#X2005;");
        $kw224$SIX_PER_EM_SPACE = SubLObjectFactory.makeKeyword("SIX-PER-EM-SPACE");
        $str225$__X2006_ = SubLObjectFactory.makeString("&#X2006;");
        $kw226$THIN_SPACE = SubLObjectFactory.makeKeyword("THIN-SPACE");
        $str227$__X2009_ = SubLObjectFactory.makeString("&#X2009;");
        $kw228$HAIR_SPACE = SubLObjectFactory.makeKeyword("HAIR-SPACE");
        $str229$__X200A_ = SubLObjectFactory.makeString("&#X200A;");
        $kw230$IEXCL = SubLObjectFactory.makeKeyword("IEXCL");
        $str231$_iexcl_ = SubLObjectFactory.makeString("&iexcl;");
        $kw232$CENT = SubLObjectFactory.makeKeyword("CENT");
        $str233$_cent_ = SubLObjectFactory.makeString("&cent;");
        $kw234$POUND = SubLObjectFactory.makeKeyword("POUND");
        $str235$_pound_ = SubLObjectFactory.makeString("&pound;");
        $kw236$CURREN = SubLObjectFactory.makeKeyword("CURREN");
        $str237$_curren_ = SubLObjectFactory.makeString("&curren;");
        $kw238$YEN = SubLObjectFactory.makeKeyword("YEN");
        $str239$_yen_ = SubLObjectFactory.makeString("&yen;");
        $kw240$BRVBAR = SubLObjectFactory.makeKeyword("BRVBAR");
        $str241$_brvba_ = SubLObjectFactory.makeString("&brvba;");
        $kw242$SECT = SubLObjectFactory.makeKeyword("SECT");
        $str243$_sect_ = SubLObjectFactory.makeString("&sect;");
        $kw244$UML = SubLObjectFactory.makeKeyword("UML");
        $str245$_uml_ = SubLObjectFactory.makeString("&uml;");
        $kw246$ORDF = SubLObjectFactory.makeKeyword("ORDF");
        $str247$_ordf_ = SubLObjectFactory.makeString("&ordf;");
        $kw248$LAQUO = SubLObjectFactory.makeKeyword("LAQUO");
        $str249$_laquo_ = SubLObjectFactory.makeString("&laquo;");
        $kw250$NOT = SubLObjectFactory.makeKeyword("NOT");
        $str251$_not_ = SubLObjectFactory.makeString("&not;");
        $kw252$SHY = SubLObjectFactory.makeKeyword("SHY");
        $str253$_shy_ = SubLObjectFactory.makeString("&shy;");
        $kw254$MACR = SubLObjectFactory.makeKeyword("MACR");
        $str255$_macr_ = SubLObjectFactory.makeString("&macr;");
        $kw256$DEG = SubLObjectFactory.makeKeyword("DEG");
        $str257$_deg_ = SubLObjectFactory.makeString("&deg;");
        $kw258$PLUSMN = SubLObjectFactory.makeKeyword("PLUSMN");
        $str259$_plusmn_ = SubLObjectFactory.makeString("&plusmn;");
        $kw260$SUP2 = SubLObjectFactory.makeKeyword("SUP2");
        $str261$_sup2_ = SubLObjectFactory.makeString("&sup2;");
        $kw262$SUP3 = SubLObjectFactory.makeKeyword("SUP3");
        $str263$_sup3_ = SubLObjectFactory.makeString("&sup3;");
        $kw264$ACUTE = SubLObjectFactory.makeKeyword("ACUTE");
        $str265$_acute_ = SubLObjectFactory.makeString("&acute;");
        $kw266$MICRO = SubLObjectFactory.makeKeyword("MICRO");
        $str267$_micro_ = SubLObjectFactory.makeString("&micro;");
        $kw268$PARA = SubLObjectFactory.makeKeyword("PARA");
        $str269$_para_ = SubLObjectFactory.makeString("&para;");
        $kw270$MIDDOT = SubLObjectFactory.makeKeyword("MIDDOT");
        $str271$_middoy_ = SubLObjectFactory.makeString("&middoy;");
        $kw272$CEDIL = SubLObjectFactory.makeKeyword("CEDIL");
        $str273$_cedil_ = SubLObjectFactory.makeString("&cedil;");
        $kw274$SUP1 = SubLObjectFactory.makeKeyword("SUP1");
        $str275$_sup1_ = SubLObjectFactory.makeString("&sup1;");
        $kw276$ORDM = SubLObjectFactory.makeKeyword("ORDM");
        $str277$_ordm_ = SubLObjectFactory.makeString("&ordm;");
        $kw278$RAQUO = SubLObjectFactory.makeKeyword("RAQUO");
        $str279$_raquo_ = SubLObjectFactory.makeString("&raquo;");
        $kw280$FRAC14 = SubLObjectFactory.makeKeyword("FRAC14");
        $str281$_frac14_ = SubLObjectFactory.makeString("&frac14;");
        $kw282$FRAC12 = SubLObjectFactory.makeKeyword("FRAC12");
        $str283$_frac12_ = SubLObjectFactory.makeString("&frac12;");
        $kw284$FRAC34 = SubLObjectFactory.makeKeyword("FRAC34");
        $str285$_frac34_ = SubLObjectFactory.makeString("&frac34;");
        $kw286$IQUEST = SubLObjectFactory.makeKeyword("IQUEST");
        $str287$_iquest_ = SubLObjectFactory.makeString("&iquest;");
        $kw288$AGRAVE_CAP = SubLObjectFactory.makeKeyword("AGRAVE-CAP");
        $str289$_Agrave_ = SubLObjectFactory.makeString("&Agrave;");
        $kw290$AACUTE_CAP = SubLObjectFactory.makeKeyword("AACUTE-CAP");
        $str291$_Aacute_ = SubLObjectFactory.makeString("&Aacute;");
        $kw292$ACIRC_CAP = SubLObjectFactory.makeKeyword("ACIRC-CAP");
        $str293$_Acirc_ = SubLObjectFactory.makeString("&Acirc;");
        $kw294$ATILDE_CAP = SubLObjectFactory.makeKeyword("ATILDE-CAP");
        $str295$_Atilde_ = SubLObjectFactory.makeString("&Atilde;");
        $kw296$AUML_CAP = SubLObjectFactory.makeKeyword("AUML-CAP");
        $str297$_Auml_ = SubLObjectFactory.makeString("&Auml;");
        $kw298$ARING_CAP = SubLObjectFactory.makeKeyword("ARING-CAP");
        $str299$_Aring_ = SubLObjectFactory.makeString("&Aring;");
        $kw300$AELIG_CAP = SubLObjectFactory.makeKeyword("AELIG-CAP");
        $str301$_AElig_ = SubLObjectFactory.makeString("&AElig;");
        $kw302$CCEDIL_CAP = SubLObjectFactory.makeKeyword("CCEDIL-CAP");
        $str303$_Ccedil_ = SubLObjectFactory.makeString("&Ccedil;");
        $kw304$EGRAVE_CAP = SubLObjectFactory.makeKeyword("EGRAVE-CAP");
        $str305$_Egrave_ = SubLObjectFactory.makeString("&Egrave;");
        $kw306$EACUTE_CAP = SubLObjectFactory.makeKeyword("EACUTE-CAP");
        $str307$_Eacute_ = SubLObjectFactory.makeString("&Eacute;");
        $kw308$ECIRC_CAP = SubLObjectFactory.makeKeyword("ECIRC-CAP");
        $str309$_Ecirc_ = SubLObjectFactory.makeString("&Ecirc;");
        $kw310$EUML_CAP = SubLObjectFactory.makeKeyword("EUML-CAP");
        $str311$_Euml_ = SubLObjectFactory.makeString("&Euml;");
        $kw312$IGRAVE_CAP = SubLObjectFactory.makeKeyword("IGRAVE-CAP");
        $str313$_Igrave_ = SubLObjectFactory.makeString("&Igrave;");
        $kw314$IACUTE_CAP = SubLObjectFactory.makeKeyword("IACUTE-CAP");
        $str315$_Iacute_ = SubLObjectFactory.makeString("&Iacute;");
        $kw316$ICIRC_CAP = SubLObjectFactory.makeKeyword("ICIRC-CAP");
        $str317$_Icirc_ = SubLObjectFactory.makeString("&Icirc;");
        $kw318$IUML_CAP = SubLObjectFactory.makeKeyword("IUML-CAP");
        $str319$_Iuml_ = SubLObjectFactory.makeString("&Iuml;");
        $kw320$ETH_CAP = SubLObjectFactory.makeKeyword("ETH-CAP");
        $str321$_ETH_ = SubLObjectFactory.makeString("&ETH;");
        $kw322$NTILDE_CAP = SubLObjectFactory.makeKeyword("NTILDE-CAP");
        $str323$_Ntilde_ = SubLObjectFactory.makeString("&Ntilde;");
        $kw324$OGRAVE_CAP = SubLObjectFactory.makeKeyword("OGRAVE-CAP");
        $str325$_Ograve_ = SubLObjectFactory.makeString("&Ograve;");
        $kw326$OACUTE_CAP = SubLObjectFactory.makeKeyword("OACUTE-CAP");
        $str327$_Oacute_ = SubLObjectFactory.makeString("&Oacute;");
        $kw328$OCIRC_CAP = SubLObjectFactory.makeKeyword("OCIRC-CAP");
        $str329$_Ocirc_ = SubLObjectFactory.makeString("&Ocirc;");
        $kw330$OTILDE_CAP = SubLObjectFactory.makeKeyword("OTILDE-CAP");
        $str331$_Otilde_ = SubLObjectFactory.makeString("&Otilde;");
        $kw332$OUML_CAP = SubLObjectFactory.makeKeyword("OUML-CAP");
        $str333$_Ouml_ = SubLObjectFactory.makeString("&Ouml;");
        $kw334$TIMES = SubLObjectFactory.makeKeyword("TIMES");
        $str335$_times_ = SubLObjectFactory.makeString("&times;");
        $kw336$OSLASH_CAP = SubLObjectFactory.makeKeyword("OSLASH-CAP");
        $str337$_Oslash_ = SubLObjectFactory.makeString("&Oslash;");
        $kw338$UGRAVE_CAP = SubLObjectFactory.makeKeyword("UGRAVE-CAP");
        $str339$_Ugrave_ = SubLObjectFactory.makeString("&Ugrave;");
        $kw340$UACUTE_CAP = SubLObjectFactory.makeKeyword("UACUTE-CAP");
        $str341$_Uacute_ = SubLObjectFactory.makeString("&Uacute;");
        $kw342$UCIRC_CAP = SubLObjectFactory.makeKeyword("UCIRC-CAP");
        $str343$_Ucirc_ = SubLObjectFactory.makeString("&Ucirc;");
        $kw344$UUML_CAP = SubLObjectFactory.makeKeyword("UUML-CAP");
        $str345$_Uuml_ = SubLObjectFactory.makeString("&Uuml;");
        $kw346$YACUTE_CAP = SubLObjectFactory.makeKeyword("YACUTE-CAP");
        $str347$_Yacute_ = SubLObjectFactory.makeString("&Yacute;");
        $kw348$THORN_CAP = SubLObjectFactory.makeKeyword("THORN-CAP");
        $str349$_THORN_ = SubLObjectFactory.makeString("&THORN;");
        $kw350$SZLIG = SubLObjectFactory.makeKeyword("SZLIG");
        $str351$_szlig_ = SubLObjectFactory.makeString("&szlig;");
        $kw352$AGRAVE = SubLObjectFactory.makeKeyword("AGRAVE");
        $str353$_agrave_ = SubLObjectFactory.makeString("&agrave;");
        $kw354$AACUTE = SubLObjectFactory.makeKeyword("AACUTE");
        $str355$_aacute_ = SubLObjectFactory.makeString("&aacute;");
        $kw356$ACIRC = SubLObjectFactory.makeKeyword("ACIRC");
        $str357$_acirc_ = SubLObjectFactory.makeString("&acirc;");
        $kw358$ATILDE = SubLObjectFactory.makeKeyword("ATILDE");
        $str359$_atilde_ = SubLObjectFactory.makeString("&atilde;");
        $kw360$AUML = SubLObjectFactory.makeKeyword("AUML");
        $str361$_auml_ = SubLObjectFactory.makeString("&auml;");
        $kw362$ARING = SubLObjectFactory.makeKeyword("ARING");
        $str363$_aring_ = SubLObjectFactory.makeString("&aring;");
        $kw364$AELIG = SubLObjectFactory.makeKeyword("AELIG");
        $str365$_aelig_ = SubLObjectFactory.makeString("&aelig;");
        $kw366$CCEDIL = SubLObjectFactory.makeKeyword("CCEDIL");
        $str367$_ccedil_ = SubLObjectFactory.makeString("&ccedil;");
        $kw368$EGRAVE = SubLObjectFactory.makeKeyword("EGRAVE");
        $str369$_egrave_ = SubLObjectFactory.makeString("&egrave;");
        $kw370$EACUTE = SubLObjectFactory.makeKeyword("EACUTE");
        $str371$_eacute_ = SubLObjectFactory.makeString("&eacute;");
        $kw372$ECIRC = SubLObjectFactory.makeKeyword("ECIRC");
        $str373$_ecirc_ = SubLObjectFactory.makeString("&ecirc;");
        $kw374$EUML = SubLObjectFactory.makeKeyword("EUML");
        $str375$_euml_ = SubLObjectFactory.makeString("&euml;");
        $kw376$IGRAVE = SubLObjectFactory.makeKeyword("IGRAVE");
        $str377$_igrave_ = SubLObjectFactory.makeString("&igrave;");
        $kw378$IACUTE = SubLObjectFactory.makeKeyword("IACUTE");
        $str379$_iacute_ = SubLObjectFactory.makeString("&iacute;");
        $kw380$ICIRC = SubLObjectFactory.makeKeyword("ICIRC");
        $str381$_icirc_ = SubLObjectFactory.makeString("&icirc;");
        $kw382$IUML = SubLObjectFactory.makeKeyword("IUML");
        $str383$_iuml_ = SubLObjectFactory.makeString("&iuml;");
        $kw384$ETH = SubLObjectFactory.makeKeyword("ETH");
        $str385$_eth_ = SubLObjectFactory.makeString("&eth;");
        $kw386$NTILDE = SubLObjectFactory.makeKeyword("NTILDE");
        $str387$_ntilde_ = SubLObjectFactory.makeString("&ntilde;");
        $kw388$OGRAVE = SubLObjectFactory.makeKeyword("OGRAVE");
        $str389$_ograve_ = SubLObjectFactory.makeString("&ograve;");
        $kw390$OACUTE = SubLObjectFactory.makeKeyword("OACUTE");
        $str391$_oacute_ = SubLObjectFactory.makeString("&oacute;");
        $kw392$OCIRC = SubLObjectFactory.makeKeyword("OCIRC");
        $str393$_ocirc_ = SubLObjectFactory.makeString("&ocirc;");
        $kw394$OTILDE = SubLObjectFactory.makeKeyword("OTILDE");
        $str395$_otilde_ = SubLObjectFactory.makeString("&otilde;");
        $kw396$OUML = SubLObjectFactory.makeKeyword("OUML");
        $str397$_ouml_ = SubLObjectFactory.makeString("&ouml;");
        $kw398$DIVIDE = SubLObjectFactory.makeKeyword("DIVIDE");
        $str399$_divide_ = SubLObjectFactory.makeString("&divide;");
        $kw400$OSLASH = SubLObjectFactory.makeKeyword("OSLASH");
        $str401$_oslash_ = SubLObjectFactory.makeString("&oslash;");
        $kw402$UGRAVE = SubLObjectFactory.makeKeyword("UGRAVE");
        $str403$_ugrave_ = SubLObjectFactory.makeString("&ugrave;");
        $kw404$UACUTE = SubLObjectFactory.makeKeyword("UACUTE");
        $str405$_uacute_ = SubLObjectFactory.makeString("&uacute;");
        $kw406$UCIRC = SubLObjectFactory.makeKeyword("UCIRC");
        $str407$_ucirc_ = SubLObjectFactory.makeString("&ucirc;");
        $kw408$UUML = SubLObjectFactory.makeKeyword("UUML");
        $str409$_uuml_ = SubLObjectFactory.makeString("&uuml;");
        $kw410$YACUTE = SubLObjectFactory.makeKeyword("YACUTE");
        $str411$_yacute_ = SubLObjectFactory.makeString("&yacute;");
        $kw412$THORN = SubLObjectFactory.makeKeyword("THORN");
        $str413$_thorn_ = SubLObjectFactory.makeString("&thorn;");
        $kw414$YUML = SubLObjectFactory.makeKeyword("YUML");
        $str415$_yuml_ = SubLObjectFactory.makeString("&yuml;");
        $kw416$FNOF = SubLObjectFactory.makeKeyword("FNOF");
        $str417$_fnof_ = SubLObjectFactory.makeString("&fnof;");
        $kw418$ALPHA_CAP = SubLObjectFactory.makeKeyword("ALPHA-CAP");
        $str419$_Alpha_ = SubLObjectFactory.makeString("&Alpha;");
        $kw420$BETA_CAP = SubLObjectFactory.makeKeyword("BETA-CAP");
        $str421$_Beta_ = SubLObjectFactory.makeString("&Beta;");
        $kw422$GAMMA_CAP = SubLObjectFactory.makeKeyword("GAMMA-CAP");
        $str423$_Gamma_ = SubLObjectFactory.makeString("&Gamma;");
        $kw424$DELTA_CAP = SubLObjectFactory.makeKeyword("DELTA-CAP");
        $str425$_Delta_ = SubLObjectFactory.makeString("&Delta;");
        $kw426$EPSILON_CAP = SubLObjectFactory.makeKeyword("EPSILON-CAP");
        $str427$_Epsilon_ = SubLObjectFactory.makeString("&Epsilon;");
        $kw428$ZETA_CAP = SubLObjectFactory.makeKeyword("ZETA-CAP");
        $str429$_Zeta_ = SubLObjectFactory.makeString("&Zeta;");
        $kw430$ETA_CAP = SubLObjectFactory.makeKeyword("ETA-CAP");
        $str431$_Eta_ = SubLObjectFactory.makeString("&Eta;");
        $kw432$THETA_CAP = SubLObjectFactory.makeKeyword("THETA-CAP");
        $str433$_Theta_ = SubLObjectFactory.makeString("&Theta;");
        $kw434$IOTA_CAP = SubLObjectFactory.makeKeyword("IOTA-CAP");
        $str435$_Iota_ = SubLObjectFactory.makeString("&Iota;");
        $kw436$KAPPA_CAP = SubLObjectFactory.makeKeyword("KAPPA-CAP");
        $str437$_Kappa_ = SubLObjectFactory.makeString("&Kappa;");
        $kw438$LAMBDA_CAP = SubLObjectFactory.makeKeyword("LAMBDA-CAP");
        $str439$_Lambda_ = SubLObjectFactory.makeString("&Lambda;");
        $kw440$MU_CAP = SubLObjectFactory.makeKeyword("MU-CAP");
        $str441$_Mu_ = SubLObjectFactory.makeString("&Mu;");
        $kw442$NU_CAP = SubLObjectFactory.makeKeyword("NU-CAP");
        $str443$_Nu_ = SubLObjectFactory.makeString("&Nu;");
        $kw444$XI_CAP = SubLObjectFactory.makeKeyword("XI-CAP");
        $str445$_Xi_ = SubLObjectFactory.makeString("&Xi;");
        $kw446$OMICRON_CAP = SubLObjectFactory.makeKeyword("OMICRON-CAP");
        $str447$_Omicron_ = SubLObjectFactory.makeString("&Omicron;");
        $kw448$PI_CAP = SubLObjectFactory.makeKeyword("PI-CAP");
        $str449$_Pi_ = SubLObjectFactory.makeString("&Pi;");
        $kw450$RHO_CAP = SubLObjectFactory.makeKeyword("RHO-CAP");
        $str451$_Rho_ = SubLObjectFactory.makeString("&Rho;");
        $kw452$SIGMA_CAP = SubLObjectFactory.makeKeyword("SIGMA-CAP");
        $str453$_Sigma_ = SubLObjectFactory.makeString("&Sigma;");
        $kw454$TAU_CAP = SubLObjectFactory.makeKeyword("TAU-CAP");
        $str455$_Tau_ = SubLObjectFactory.makeString("&Tau;");
        $kw456$UPSILON_CAP = SubLObjectFactory.makeKeyword("UPSILON-CAP");
        $str457$_Upsilon_ = SubLObjectFactory.makeString("&Upsilon;");
        $kw458$PHI_CAP = SubLObjectFactory.makeKeyword("PHI-CAP");
        $str459$_Phi_ = SubLObjectFactory.makeString("&Phi;");
        $kw460$CHI_CAP = SubLObjectFactory.makeKeyword("CHI-CAP");
        $str461$_Chi_ = SubLObjectFactory.makeString("&Chi;");
        $kw462$PSI_CAP = SubLObjectFactory.makeKeyword("PSI-CAP");
        $str463$_Psi_ = SubLObjectFactory.makeString("&Psi;");
        $kw464$OMEGA_CAP = SubLObjectFactory.makeKeyword("OMEGA-CAP");
        $str465$_Omega_ = SubLObjectFactory.makeString("&Omega;");
        $kw466$ALPHA = SubLObjectFactory.makeKeyword("ALPHA");
        $str467$_alpha_ = SubLObjectFactory.makeString("&alpha;");
        $kw468$BETA = SubLObjectFactory.makeKeyword("BETA");
        $str469$_beta_ = SubLObjectFactory.makeString("&beta;");
        $kw470$GAMMA = SubLObjectFactory.makeKeyword("GAMMA");
        $str471$_gamma_ = SubLObjectFactory.makeString("&gamma;");
        $kw472$DELTA = SubLObjectFactory.makeKeyword("DELTA");
        $str473$_delta_ = SubLObjectFactory.makeString("&delta;");
        $kw474$EPSILON = SubLObjectFactory.makeKeyword("EPSILON");
        $str475$_epsilon_ = SubLObjectFactory.makeString("&epsilon;");
        $kw476$ZETA = SubLObjectFactory.makeKeyword("ZETA");
        $str477$_zeta_ = SubLObjectFactory.makeString("&zeta;");
        $kw478$ETA = SubLObjectFactory.makeKeyword("ETA");
        $str479$_eta_ = SubLObjectFactory.makeString("&eta;");
        $kw480$THETA = SubLObjectFactory.makeKeyword("THETA");
        $str481$_theta_ = SubLObjectFactory.makeString("&theta;");
        $kw482$IOTA = SubLObjectFactory.makeKeyword("IOTA");
        $str483$_iota_ = SubLObjectFactory.makeString("&iota;");
        $kw484$KAPPA = SubLObjectFactory.makeKeyword("KAPPA");
        $str485$_kappa_ = SubLObjectFactory.makeString("&kappa;");
        $kw486$LAMBDA = SubLObjectFactory.makeKeyword("LAMBDA");
        $str487$_lambda_ = SubLObjectFactory.makeString("&lambda;");
        $kw488$MU = SubLObjectFactory.makeKeyword("MU");
        $str489$_mu_ = SubLObjectFactory.makeString("&mu;");
        $kw490$NU = SubLObjectFactory.makeKeyword("NU");
        $str491$_nu_ = SubLObjectFactory.makeString("&nu;");
        $kw492$XI = SubLObjectFactory.makeKeyword("XI");
        $str493$_xi_ = SubLObjectFactory.makeString("&xi;");
        $kw494$OMICRON = SubLObjectFactory.makeKeyword("OMICRON");
        $str495$_omicron_ = SubLObjectFactory.makeString("&omicron;");
        $kw496$PI = SubLObjectFactory.makeKeyword("PI");
        $str497$_pi_ = SubLObjectFactory.makeString("&pi;");
        $kw498$RHO = SubLObjectFactory.makeKeyword("RHO");
        $str499$_rho_ = SubLObjectFactory.makeString("&rho;");
        $kw500$SIGMAF = SubLObjectFactory.makeKeyword("SIGMAF");
        $str501$_sigmaf_ = SubLObjectFactory.makeString("&sigmaf;");
        $kw502$SIGMA = SubLObjectFactory.makeKeyword("SIGMA");
        $str503$_sigma_ = SubLObjectFactory.makeString("&sigma;");
        $kw504$TAU = SubLObjectFactory.makeKeyword("TAU");
        $str505$_tau_ = SubLObjectFactory.makeString("&tau;");
        $kw506$UPSILON = SubLObjectFactory.makeKeyword("UPSILON");
        $str507$_upsilon_ = SubLObjectFactory.makeString("&upsilon;");
        $kw508$PHI = SubLObjectFactory.makeKeyword("PHI");
        $str509$_phi_ = SubLObjectFactory.makeString("&phi;");
        $kw510$CHI = SubLObjectFactory.makeKeyword("CHI");
        $str511$_chi_ = SubLObjectFactory.makeString("&chi;");
        $kw512$PSI = SubLObjectFactory.makeKeyword("PSI");
        $str513$_psi_ = SubLObjectFactory.makeString("&psi;");
        $kw514$OMEGA = SubLObjectFactory.makeKeyword("OMEGA");
        $str515$_omega_ = SubLObjectFactory.makeString("&omega;");
        $kw516$THETASYM = SubLObjectFactory.makeKeyword("THETASYM");
        $kw517$UPSIH = SubLObjectFactory.makeKeyword("UPSIH");
        $str518$_upsih_ = SubLObjectFactory.makeString("&upsih;");
        $kw519$PIV = SubLObjectFactory.makeKeyword("PIV");
        $str520$_piv_ = SubLObjectFactory.makeString("&piv;");
        $kw521$BULL = SubLObjectFactory.makeKeyword("BULL");
        $str522$_bull_ = SubLObjectFactory.makeString("&bull;");
        $kw523$HELLIP = SubLObjectFactory.makeKeyword("HELLIP");
        $str524$_hellip_ = SubLObjectFactory.makeString("&hellip;");
        $kw525$PRIME = SubLObjectFactory.makeKeyword("PRIME");
        $str526$_prime_ = SubLObjectFactory.makeString("&prime;");
        $kw527$PRIME_DBL = SubLObjectFactory.makeKeyword("PRIME-DBL");
        $str528$_Prime_ = SubLObjectFactory.makeString("&Prime;");
        $kw529$OLINE = SubLObjectFactory.makeKeyword("OLINE");
        $str530$_oline_ = SubLObjectFactory.makeString("&oline;");
        $kw531$FRASL = SubLObjectFactory.makeKeyword("FRASL");
        $str532$_frasl_ = SubLObjectFactory.makeString("&frasl;");
        $kw533$WEIERP = SubLObjectFactory.makeKeyword("WEIERP");
        $str534$_weierp_ = SubLObjectFactory.makeString("&weierp;");
        $kw535$IMAGE = SubLObjectFactory.makeKeyword("IMAGE");
        $str536$_image_ = SubLObjectFactory.makeString("&image;");
        $kw537$REAL = SubLObjectFactory.makeKeyword("REAL");
        $str538$_real_ = SubLObjectFactory.makeString("&real;");
        $kw539$TRADE = SubLObjectFactory.makeKeyword("TRADE");
        $str540$_trade_ = SubLObjectFactory.makeString("&trade;");
        $kw541$ALEFSYM = SubLObjectFactory.makeKeyword("ALEFSYM");
        $str542$_alefsym_ = SubLObjectFactory.makeString("&alefsym;");
        $kw543$UPWARDS_ARROW = SubLObjectFactory.makeKeyword("UPWARDS-ARROW");
        $str544$_uarr_ = SubLObjectFactory.makeString("&uarr;");
        $kw545$RIGHTWARDS_ARROW = SubLObjectFactory.makeKeyword("RIGHTWARDS-ARROW");
        $str546$_rarr_ = SubLObjectFactory.makeString("&rarr;");
        $kw547$LARR = SubLObjectFactory.makeKeyword("LARR");
        $str548$_larr_ = SubLObjectFactory.makeString("&larr;");
        $kw549$UARR = SubLObjectFactory.makeKeyword("UARR");
        $kw550$RARR = SubLObjectFactory.makeKeyword("RARR");
        $kw551$DARR = SubLObjectFactory.makeKeyword("DARR");
        $str552$_darr_ = SubLObjectFactory.makeString("&darr;");
        $kw553$HARR = SubLObjectFactory.makeKeyword("HARR");
        $str554$_harr_ = SubLObjectFactory.makeString("&harr;");
        $kw555$CRARR = SubLObjectFactory.makeKeyword("CRARR");
        $str556$_crarr_ = SubLObjectFactory.makeString("&crarr;");
        $kw557$LARR_DBL = SubLObjectFactory.makeKeyword("LARR-DBL");
        $str558$_lArr_ = SubLObjectFactory.makeString("&lArr;");
        $kw559$UARR_DBL = SubLObjectFactory.makeKeyword("UARR-DBL");
        $str560$_uArr_ = SubLObjectFactory.makeString("&uArr;");
        $kw561$RARR_DBL = SubLObjectFactory.makeKeyword("RARR-DBL");
        $str562$_rArr_ = SubLObjectFactory.makeString("&rArr;");
        $kw563$DARR_DBL = SubLObjectFactory.makeKeyword("DARR-DBL");
        $str564$_dArr_ = SubLObjectFactory.makeString("&dArr;");
        $kw565$HARR_DBL = SubLObjectFactory.makeKeyword("HARR-DBL");
        $str566$_hArr_ = SubLObjectFactory.makeString("&hArr;");
        $kw567$FORALL = SubLObjectFactory.makeKeyword("FORALL");
        $str568$_forall_ = SubLObjectFactory.makeString("&forall;");
        $kw569$PART = SubLObjectFactory.makeKeyword("PART");
        $str570$_part_ = SubLObjectFactory.makeString("&part;");
        $kw571$EXIST = SubLObjectFactory.makeKeyword("EXIST");
        $str572$_exist_ = SubLObjectFactory.makeString("&exist;");
        $kw573$EMPTY = SubLObjectFactory.makeKeyword("EMPTY");
        $str574$_empty_ = SubLObjectFactory.makeString("&empty;");
        $kw575$NABLA = SubLObjectFactory.makeKeyword("NABLA");
        $str576$_nabla_ = SubLObjectFactory.makeString("&nabla;");
        $kw577$ISIN = SubLObjectFactory.makeKeyword("ISIN");
        $str578$_isin_ = SubLObjectFactory.makeString("&isin;");
        $kw579$NOTIN = SubLObjectFactory.makeKeyword("NOTIN");
        $str580$_notin_ = SubLObjectFactory.makeString("&notin;");
        $kw581$NI = SubLObjectFactory.makeKeyword("NI");
        $str582$_ni_ = SubLObjectFactory.makeString("&ni;");
        $kw583$PROD = SubLObjectFactory.makeKeyword("PROD");
        $str584$_prod_ = SubLObjectFactory.makeString("&prod;");
        $kw585$SUM = SubLObjectFactory.makeKeyword("SUM");
        $str586$_sum_ = SubLObjectFactory.makeString("&sum;");
        $kw587$MINUS = SubLObjectFactory.makeKeyword("MINUS");
        $str588$_minus_ = SubLObjectFactory.makeString("&minus;");
        $kw589$LOWAST = SubLObjectFactory.makeKeyword("LOWAST");
        $str590$_lowast_ = SubLObjectFactory.makeString("&lowast;");
        $kw591$RADIC = SubLObjectFactory.makeKeyword("RADIC");
        $str592$_radic_ = SubLObjectFactory.makeString("&radic;");
        $kw593$PROP = SubLObjectFactory.makeKeyword("PROP");
        $str594$_prop_ = SubLObjectFactory.makeString("&prop;");
        $kw595$INFIN = SubLObjectFactory.makeKeyword("INFIN");
        $str596$_infin_ = SubLObjectFactory.makeString("&infin;");
        $kw597$ANG = SubLObjectFactory.makeKeyword("ANG");
        $str598$_ang_ = SubLObjectFactory.makeString("&ang;");
        $kw599$AND = SubLObjectFactory.makeKeyword("AND");
        $str600$_and_ = SubLObjectFactory.makeString("&and;");
        $kw601$OR = SubLObjectFactory.makeKeyword("OR");
        $str602$_or_ = SubLObjectFactory.makeString("&or;");
        $kw603$CAP = SubLObjectFactory.makeKeyword("CAP");
        $str604$_cap_ = SubLObjectFactory.makeString("&cap;");
        $kw605$CUP = SubLObjectFactory.makeKeyword("CUP");
        $str606$_cup_ = SubLObjectFactory.makeString("&cup;");
        $kw607$INT = SubLObjectFactory.makeKeyword("INT");
        $str608$_int_ = SubLObjectFactory.makeString("&int;");
        $kw609$THERE4 = SubLObjectFactory.makeKeyword("THERE4");
        $str610$_there4_ = SubLObjectFactory.makeString("&there4;");
        $kw611$SIM = SubLObjectFactory.makeKeyword("SIM");
        $str612$_sim_ = SubLObjectFactory.makeString("&sim;");
        $kw613$CONG = SubLObjectFactory.makeKeyword("CONG");
        $str614$_cong_ = SubLObjectFactory.makeString("&cong;");
        $kw615$ASYMP = SubLObjectFactory.makeKeyword("ASYMP");
        $str616$_asymp_ = SubLObjectFactory.makeString("&asymp;");
        $kw617$NE = SubLObjectFactory.makeKeyword("NE");
        $str618$_ne_ = SubLObjectFactory.makeString("&ne;");
        $kw619$EQUIV = SubLObjectFactory.makeKeyword("EQUIV");
        $str620$_equiv_ = SubLObjectFactory.makeString("&equiv;");
        $kw621$LE = SubLObjectFactory.makeKeyword("LE");
        $str622$_le_ = SubLObjectFactory.makeString("&le;");
        $kw623$GE = SubLObjectFactory.makeKeyword("GE");
        $str624$_ge_ = SubLObjectFactory.makeString("&ge;");
        $kw625$SUB = SubLObjectFactory.makeKeyword("SUB");
        $str626$_sub_ = SubLObjectFactory.makeString("&sub;");
        $kw627$SUP = SubLObjectFactory.makeKeyword("SUP");
        $str628$_sup_ = SubLObjectFactory.makeString("&sup;");
        $kw629$NSUB = SubLObjectFactory.makeKeyword("NSUB");
        $str630$_nsub_ = SubLObjectFactory.makeString("&nsub;");
        $kw631$SUBE = SubLObjectFactory.makeKeyword("SUBE");
        $str632$_sube_ = SubLObjectFactory.makeString("&sube;");
        $kw633$SUPE = SubLObjectFactory.makeKeyword("SUPE");
        $str634$_supe_ = SubLObjectFactory.makeString("&supe;");
        $kw635$OPLUS = SubLObjectFactory.makeKeyword("OPLUS");
        $str636$_oplus_ = SubLObjectFactory.makeString("&oplus;");
        $kw637$OTIMES = SubLObjectFactory.makeKeyword("OTIMES");
        $str638$_otimes_ = SubLObjectFactory.makeString("&otimes;");
        $kw639$PERP = SubLObjectFactory.makeKeyword("PERP");
        $str640$_perp_ = SubLObjectFactory.makeString("&perp;");
        $kw641$SDOT = SubLObjectFactory.makeKeyword("SDOT");
        $str642$_sdot_ = SubLObjectFactory.makeString("&sdot;");
        $kw643$LCEIL = SubLObjectFactory.makeKeyword("LCEIL");
        $str644$_lceil_ = SubLObjectFactory.makeString("&lceil;");
        $kw645$RCEIL = SubLObjectFactory.makeKeyword("RCEIL");
        $str646$_rceil_ = SubLObjectFactory.makeString("&rceil;");
        $kw647$LFLOOR = SubLObjectFactory.makeKeyword("LFLOOR");
        $str648$_lfloor_ = SubLObjectFactory.makeString("&lfloor;");
        $kw649$RFLOOR = SubLObjectFactory.makeKeyword("RFLOOR");
        $str650$_rfloor_ = SubLObjectFactory.makeString("&rfloor;");
        $kw651$LANG = SubLObjectFactory.makeKeyword("LANG");
        $str652$_lang_ = SubLObjectFactory.makeString("&lang;");
        $kw653$RANG = SubLObjectFactory.makeKeyword("RANG");
        $str654$_rang_ = SubLObjectFactory.makeString("&rang;");
        $kw655$LOZ = SubLObjectFactory.makeKeyword("LOZ");
        $str656$_loz_ = SubLObjectFactory.makeString("&loz;");
        $kw657$SPADES = SubLObjectFactory.makeKeyword("SPADES");
        $str658$_spades_ = SubLObjectFactory.makeString("&spades;");
        $kw659$CLUBS = SubLObjectFactory.makeKeyword("CLUBS");
        $str660$_clubs_ = SubLObjectFactory.makeString("&clubs;");
        $kw661$HEARTS = SubLObjectFactory.makeKeyword("HEARTS");
        $str662$_hearts_ = SubLObjectFactory.makeString("&hearts;");
        $kw663$DIAMS = SubLObjectFactory.makeKeyword("DIAMS");
        $str664$_diams_ = SubLObjectFactory.makeString("&diams;");
        $kw665$FROWNY_FACE = SubLObjectFactory.makeKeyword("FROWNY-FACE");
        $str666$__9785_ = SubLObjectFactory.makeString("&#9785;");
        $sym667$HEX_CHAR_STRING_P = SubLObjectFactory.makeSymbol("HEX-CHAR-STRING-P");
        $str668$__ = SubLObjectFactory.makeString("&#");
        $str669$_ = SubLObjectFactory.makeString("_");
        $str670$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str671$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw672$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str673$Echo_of_ARGS = SubLObjectFactory.makeString("Echo of ARGS");
        $kw674$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str675$Back = SubLObjectFactory.makeString("Back");
        $sym676$HTML_ECHO_ARGS = SubLObjectFactory.makeSymbol("HTML-ECHO-ARGS");
        $kw677$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $list678 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"));
        $kw679$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str680$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym681$HTML_ECHO_FILE = SubLObjectFactory.makeSymbol("HTML-ECHO-FILE");
        $str682$_ = SubLObjectFactory.makeString("\"");
        $str683$____ = SubLObjectFactory.makeString("<!--");
        $str684$___ = SubLObjectFactory.makeString("-->");
        $str685$_script = SubLObjectFactory.makeString("<script");
        $str686$__script_ = SubLObjectFactory.makeString("</script>");
        $str687$__script = SubLObjectFactory.makeString("</script");
        $list688 = ConsesLow.list((SubLObject)Characters.CHAR_backslash);
        $list689 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&quot;"), (SubLObject)SubLObjectFactory.makeString("\"")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&amp;"), (SubLObject)SubLObjectFactory.makeString("&")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("&nbsp;"), (SubLObject)SubLObjectFactory.makeString(" ")));
        $str690$http___ = SubLObjectFactory.makeString("http://");
        $int691$80 = SubLObjectFactory.makeInteger(80);
        $kw692$GET = SubLObjectFactory.makeKeyword("GET");
        $str693$_style = SubLObjectFactory.makeString("<style");
        $str694$__style_ = SubLObjectFactory.makeString("</style>");
        $str695$_p_ = SubLObjectFactory.makeString("<p>");
        $str696$_file_input_ = SubLObjectFactory.makeString("_file_input_");
        $str697$this_form_ = SubLObjectFactory.makeString("this.form.");
        $str698$_value___this_value_ = SubLObjectFactory.makeString(".value = this.value;");
        $str699$TEXT = SubLObjectFactory.makeString("TEXT");
        $list700 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLER-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym701$FRAME_NAME_VAR = SubLObjectFactory.makeUninternedSymbol("FRAME-NAME-VAR");
        $sym702$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym703$CB_FRAME_NAME = SubLObjectFactory.makeSymbol("CB-FRAME-NAME");
        $sym704$HTML_FANCY_FORM = SubLObjectFactory.makeSymbol("HTML-FANCY-FORM");
        $sym705$_CYC_CGI_PROGRAM_ = SubLObjectFactory.makeSymbol("*CYC-CGI-PROGRAM*");
        $sym706$_HTML_FORM_METHOD_POST_ = SubLObjectFactory.makeSymbol("*HTML-FORM-METHOD-POST*");
        $list707 = ConsesLow.list((SubLObject)html_utilities.NIL, (SubLObject)html_utilities.NIL, (SubLObject)html_utilities.NIL, (SubLObject)SubLObjectFactory.makeString("multipart/form-data"));
        $sym708$HTML_HIDDEN_INPUT = SubLObjectFactory.makeSymbol("HTML-HIDDEN-INPUT");
        $list709 = ConsesLow.list((SubLObject)html_utilities.T);
        $str710$_multipart_formdata = SubLObjectFactory.makeString(" multipart/formdata");
        $str711$application_octet_stream = SubLObjectFactory.makeString("application/octet-stream");
        $str712$T = SubLObjectFactory.makeString("T");
        $sym713$CHAR_ = SubLObjectFactory.makeSymbol("CHAR=");
        $list714 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str715$__2__0X = SubLObjectFactory.makeString("%~2,'0X");
        $str716$____________________ = SubLObjectFactory.makeString("--------------------");
        $int717$200 = SubLObjectFactory.makeInteger(200);
        $kw718$VERTICAL = SubLObjectFactory.makeKeyword("VERTICAL");
        $kw719$SIZE = SubLObjectFactory.makeKeyword("SIZE");
        $kw720$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $sym721$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $kw722$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw723$COLOR = SubLObjectFactory.makeKeyword("COLOR");
        $kw724$FONT_COLOR = SubLObjectFactory.makeKeyword("FONT-COLOR");
        $kw725$BLACK = SubLObjectFactory.makeKeyword("BLACK");
        $int726$400 = SubLObjectFactory.makeInteger(400);
        $int727$800 = SubLObjectFactory.makeInteger(800);
        $kw728$HORIZONTAL = SubLObjectFactory.makeKeyword("HORIZONTAL");
        $kw729$CLASS_COLORMAP = SubLObjectFactory.makeKeyword("CLASS-COLORMAP");
        $str730$new_login_id = SubLObjectFactory.makeString("new_login_id");
        $str731$hashed_password = SubLObjectFactory.makeString("hashed_password");
        $str732$User_ID = SubLObjectFactory.makeString("User ID");
        $str733$Password = SubLObjectFactory.makeString("Password");
        $str734$unhashed_password_ = SubLObjectFactory.makeString("unhashed_password_");
        $str735$var_oldB64Pad___b64pad__b64pad___ = SubLObjectFactory.makeString("var oldB64Pad = b64pad; b64pad = '='; var theInput=(this.form.");
        $str736$_value_this_form_ = SubLObjectFactory.makeString(".value+this.form.");
        $str737$_value___this_form_ = SubLObjectFactory.makeString(".value); this.form.");
        $str738$_value_b64_sha1_theInput___b64pad = SubLObjectFactory.makeString(".value=b64_sha1(theInput); b64pad = oldB64Pad");
        $kw739$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $int740$30 = SubLObjectFactory.makeInteger(30);
        $kw741$PASSWORD = SubLObjectFactory.makeKeyword("PASSWORD");
        $str742$Submit = SubLObjectFactory.makeString("Submit");
        $str743$HTML_Utilities_Test = SubLObjectFactory.makeString("HTML Utilities Test");
        $str744$_Category = SubLObjectFactory.makeString(" Category");
        $str745$_Suite = SubLObjectFactory.makeString(" Suite");
        $str746$HTML_Utilities = SubLObjectFactory.makeString("HTML-Utilities");
    }
}

/*

	Total time: 2858 ms
	
*/