package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.html_macros.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_backslash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_underbar;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class html_macros extends SubLTranslatedFile {
    public static final SubLFile me = new html_macros();

    public static final String myName = "com.cyc.cycjava.cycl.html_macros";

    public static final String myFingerPrint = "a773c8fe123299874657e1e8ba1ad9baf45ff87d37c0f50b4827f9b3c06f195a";





    // defparameter
    public static final SubLSymbol $html_force_ie_standards_mode$ = makeSymbol("*HTML-FORCE-IE-STANDARDS-MODE*");

    // defconstant
    public static final SubLSymbol $html_body_head$ = makeSymbol("*HTML-BODY-HEAD*");

    // defconstant
    public static final SubLSymbol $html_body_tail$ = makeSymbol("*HTML-BODY-TAIL*");

    // defconstant
    public static final SubLSymbol $html_body_bgcolor$ = makeSymbol("*HTML-BODY-BGCOLOR*");

    // defconstant
    public static final SubLSymbol $html_body_background$ = makeSymbol("*HTML-BODY-BACKGROUND*");

    // defconstant
    public static final SubLSymbol $html_body_class$ = makeSymbol("*HTML-BODY-CLASS*");

    // defconstant
    public static final SubLSymbol $html_body_style$ = makeSymbol("*HTML-BODY-STYLE*");

    // defconstant
    public static final SubLSymbol $html_body_text$ = makeSymbol("*HTML-BODY-TEXT*");

    // defconstant
    public static final SubLSymbol $html_body_link$ = makeSymbol("*HTML-BODY-LINK*");

    // defconstant
    public static final SubLSymbol $html_body_alink$ = makeSymbol("*HTML-BODY-ALINK*");

    // defconstant
    public static final SubLSymbol $html_body_vlink$ = makeSymbol("*HTML-BODY-VLINK*");

    // defconstant
    public static final SubLSymbol $html_body_onload$ = makeSymbol("*HTML-BODY-ONLOAD*");

    // defconstant
    public static final SubLSymbol $html_body_onresize$ = makeSymbol("*HTML-BODY-ONRESIZE*");

    // defconstant
    public static final SubLSymbol $html_div_head$ = makeSymbol("*HTML-DIV-HEAD*");

    // defconstant
    public static final SubLSymbol $html_div_tail$ = makeSymbol("*HTML-DIV-TAIL*");

    // defconstant
    public static final SubLSymbol $html_div_class$ = makeSymbol("*HTML-DIV-CLASS*");

    // defconstant
    public static final SubLSymbol $html_div_style$ = makeSymbol("*HTML-DIV-STYLE*");

    // defconstant
    public static final SubLSymbol $html_div_title$ = makeSymbol("*HTML-DIV-TITLE*");

    // defconstant
    public static final SubLSymbol $html_div_align$ = makeSymbol("*HTML-DIV-ALIGN*");

    // defconstant
    public static final SubLSymbol $html_div_onload$ = makeSymbol("*HTML-DIV-ONLOAD*");

    // defconstant
    public static final SubLSymbol $html_span_head$ = makeSymbol("*HTML-SPAN-HEAD*");

    // defconstant
    public static final SubLSymbol $html_span_tail$ = makeSymbol("*HTML-SPAN-TAIL*");

    // defconstant
    public static final SubLSymbol $html_span_class$ = makeSymbol("*HTML-SPAN-CLASS*");

    // defconstant
    public static final SubLSymbol $html_span_style$ = makeSymbol("*HTML-SPAN-STYLE*");

    // defconstant
    public static final SubLSymbol $html_head_head$ = makeSymbol("*HTML-HEAD-HEAD*");

    // defconstant
    public static final SubLSymbol $html_head_tail$ = makeSymbol("*HTML-HEAD-TAIL*");

    // defconstant
    public static final SubLSymbol $html_html_head$ = makeSymbol("*HTML-HTML-HEAD*");

    // defconstant
    public static final SubLSymbol $html_html_tail$ = makeSymbol("*HTML-HTML-TAIL*");

    // defconstant
    public static final SubLSymbol $html_attribute_id$ = makeSymbol("*HTML-ATTRIBUTE-ID*");

    // defconstant
    public static final SubLSymbol $html_attribute_class$ = makeSymbol("*HTML-ATTRIBUTE-CLASS*");

    // defconstant
    public static final SubLSymbol $html_attribute_style$ = makeSymbol("*HTML-ATTRIBUTE-STYLE*");

    // defconstant
    public static final SubLSymbol $html_attribute_title$ = makeSymbol("*HTML-ATTRIBUTE-TITLE*");

    // defconstant
    public static final SubLSymbol $html_event_attribute_onclick$ = makeSymbol("*HTML-EVENT-ATTRIBUTE-ONCLICK*");

    // defconstant
    public static final SubLSymbol $html_event_attribute_onblur$ = makeSymbol("*HTML-EVENT-ATTRIBUTE-ONBLUR*");

    // defconstant
    public static final SubLSymbol $html_event_attribute_onfocus$ = makeSymbol("*HTML-EVENT-ATTRIBUTE-ONFOCUS*");

    // defconstant
    public static final SubLSymbol $html_event_attribute_onkeyup$ = makeSymbol("*HTML-EVENT-ATTRIBUTE-ONKEYUP*");

    // defconstant
    public static final SubLSymbol $html_event_attribute_onkeydown$ = makeSymbol("*HTML-EVENT-ATTRIBUTE-ONKEYDOWN*");

    // defconstant
    public static final SubLSymbol $html_event_attribute_onkeypress$ = makeSymbol("*HTML-EVENT-ATTRIBUTE-ONKEYPRESS*");

    // defconstant
    public static final SubLSymbol $html_meta_head$ = makeSymbol("*HTML-META-HEAD*");

    // defconstant
    public static final SubLSymbol $html_meta_http_equiv$ = makeSymbol("*HTML-META-HTTP-EQUIV*");

    // defconstant
    public static final SubLSymbol $html_meta_content$ = makeSymbol("*HTML-META-CONTENT*");

    // defconstant
    public static final SubLSymbol $html_meta_scheme$ = makeSymbol("*HTML-META-SCHEME*");

    // defconstant
    public static final SubLSymbol $html_meta_name$ = makeSymbol("*HTML-META-NAME*");

    // defconstant
    public static final SubLSymbol $html_meta_lang$ = makeSymbol("*HTML-META-LANG*");

    // defconstant
    public static final SubLSymbol $html_meta_dir$ = makeSymbol("*HTML-META-DIR*");

    // defconstant
    public static final SubLSymbol $html_title_head$ = makeSymbol("*HTML-TITLE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_title_tail$ = makeSymbol("*HTML-TITLE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_link_head$ = makeSymbol("*HTML-LINK-HEAD*");

    // defconstant
    public static final SubLSymbol $html_link_rel$ = makeSymbol("*HTML-LINK-REL*");

    // defconstant
    public static final SubLSymbol $html_link_type$ = makeSymbol("*HTML-LINK-TYPE*");

    // defconstant
    public static final SubLSymbol $html_link_href$ = makeSymbol("*HTML-LINK-HREF*");

    // defconstant
    public static final SubLSymbol $html_link_media$ = makeSymbol("*HTML-LINK-MEDIA*");

    // defconstant
    public static final SubLSymbol $html_link_title$ = makeSymbol("*HTML-LINK-TITLE*");

    // defconstant
    public static final SubLSymbol $html_base_head$ = makeSymbol("*HTML-BASE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_base_href$ = makeSymbol("*HTML-BASE-HREF*");

    // defconstant
    public static final SubLSymbol $html_style_head$ = makeSymbol("*HTML-STYLE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_style_tail$ = makeSymbol("*HTML-STYLE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_blockquote_head$ = makeSymbol("*HTML-BLOCKQUOTE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_blockquote_tail$ = makeSymbol("*HTML-BLOCKQUOTE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_center_head$ = makeSymbol("*HTML-CENTER-HEAD*");

    // defconstant
    public static final SubLSymbol $html_center_tail$ = makeSymbol("*HTML-CENTER-TAIL*");

    // defconstant
    public static final SubLSymbol $html_heading_head$ = makeSymbol("*HTML-HEADING-HEAD*");

    // defconstant
    public static final SubLSymbol $html_heading_tail$ = makeSymbol("*HTML-HEADING-TAIL*");

    // defconstant
    public static final SubLSymbol $html_hr_head$ = makeSymbol("*HTML-HR-HEAD*");

    // defconstant
    public static final SubLSymbol $html_hr_size$ = makeSymbol("*HTML-HR-SIZE*");

    // defconstant
    public static final SubLSymbol $html_hr_width$ = makeSymbol("*HTML-HR-WIDTH*");

    // defconstant
    public static final SubLSymbol $html_line_break_atomic$ = makeSymbol("*HTML-LINE-BREAK-ATOMIC*");

    // defconstant
    public static final SubLSymbol $html_line_break_head$ = makeSymbol("*HTML-LINE-BREAK-HEAD*");

    // defconstant
    public static final SubLSymbol $html_line_break_tail$ = makeSymbol("*HTML-LINE-BREAK-TAIL*");

    // defconstant
    public static final SubLSymbol $html_line_break_clear$ = makeSymbol("*HTML-LINE-BREAK-CLEAR*");

    // defconstant
    public static final SubLSymbol $html_line_break$ = makeSymbol("*HTML-LINE-BREAK*");

    // defconstant
    public static final SubLSymbol $html_paragraph_head$ = makeSymbol("*HTML-PARAGRAPH-HEAD*");

    // defconstant
    public static final SubLSymbol $html_paragraph_tail$ = makeSymbol("*HTML-PARAGRAPH-TAIL*");

    // defconstant
    public static final SubLSymbol $html_plaintext_head$ = makeSymbol("*HTML-PLAINTEXT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_plaintext_tail$ = makeSymbol("*HTML-PLAINTEXT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_preformatted_head$ = makeSymbol("*HTML-PREFORMATTED-HEAD*");

    // defconstant
    public static final SubLSymbol $html_preformatted_tail$ = makeSymbol("*HTML-PREFORMATTED-TAIL*");

    // defconstant
    public static final SubLSymbol $html_address_head$ = makeSymbol("*HTML-ADDRESS-HEAD*");

    // defconstant
    public static final SubLSymbol $html_address_tail$ = makeSymbol("*HTML-ADDRESS-TAIL*");

    // defconstant
    public static final SubLSymbol $html_big_head$ = makeSymbol("*HTML-BIG-HEAD*");

    // defconstant
    public static final SubLSymbol $html_big_tail$ = makeSymbol("*HTML-BIG-TAIL*");

    // defconstant
    public static final SubLSymbol $html_bold_head$ = makeSymbol("*HTML-BOLD-HEAD*");

    // defconstant
    public static final SubLSymbol $html_bold_tail$ = makeSymbol("*HTML-BOLD-TAIL*");

    // defconstant
    public static final SubLSymbol $html_cite_head$ = makeSymbol("*HTML-CITE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_cite_tail$ = makeSymbol("*HTML-CITE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_code_head$ = makeSymbol("*HTML-CODE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_code_tail$ = makeSymbol("*HTML-CODE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_definition_head$ = makeSymbol("*HTML-DEFINITION-HEAD*");

    // defconstant
    public static final SubLSymbol $html_definition_tail$ = makeSymbol("*HTML-DEFINITION-TAIL*");

    // defconstant
    public static final SubLSymbol $html_emphasized_head$ = makeSymbol("*HTML-EMPHASIZED-HEAD*");

    // defconstant
    public static final SubLSymbol $html_emphasized_tail$ = makeSymbol("*HTML-EMPHASIZED-TAIL*");

    // defconstant
    public static final SubLSymbol $html_font_head$ = makeSymbol("*HTML-FONT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_font_tail$ = makeSymbol("*HTML-FONT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_font_size$ = makeSymbol("*HTML-FONT-SIZE*");

    // defconstant
    public static final SubLSymbol $html_font_color$ = makeSymbol("*HTML-FONT-COLOR*");

    // defconstant
    public static final SubLSymbol $html_font_face$ = makeSymbol("*HTML-FONT-FACE*");

    // defconstant
    public static final SubLSymbol $html_italic_head$ = makeSymbol("*HTML-ITALIC-HEAD*");

    // defconstant
    public static final SubLSymbol $html_italic_tail$ = makeSymbol("*HTML-ITALIC-TAIL*");

    // defconstant
    public static final SubLSymbol $html_keyboard_head$ = makeSymbol("*HTML-KEYBOARD-HEAD*");

    // defconstant
    public static final SubLSymbol $html_keyboard_tail$ = makeSymbol("*HTML-KEYBOARD-TAIL*");

    // defconstant
    public static final SubLSymbol $html_sample_head$ = makeSymbol("*HTML-SAMPLE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_sample_tail$ = makeSymbol("*HTML-SAMPLE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_small_head$ = makeSymbol("*HTML-SMALL-HEAD*");

    // defconstant
    public static final SubLSymbol $html_small_tail$ = makeSymbol("*HTML-SMALL-TAIL*");

    // defconstant
    public static final SubLSymbol $html_strikethrough_head$ = makeSymbol("*HTML-STRIKETHROUGH-HEAD*");

    // defconstant
    public static final SubLSymbol $html_strikethrough_tail$ = makeSymbol("*HTML-STRIKETHROUGH-TAIL*");

    // defconstant
    public static final SubLSymbol $html_strong_head$ = makeSymbol("*HTML-STRONG-HEAD*");

    // defconstant
    public static final SubLSymbol $html_strong_tail$ = makeSymbol("*HTML-STRONG-TAIL*");

    // defconstant
    public static final SubLSymbol $html_subscript_head$ = makeSymbol("*HTML-SUBSCRIPT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_subscript_tail$ = makeSymbol("*HTML-SUBSCRIPT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_superscript_head$ = makeSymbol("*HTML-SUPERSCRIPT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_superscript_tail$ = makeSymbol("*HTML-SUPERSCRIPT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_teletype_head$ = makeSymbol("*HTML-TELETYPE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_teletype_tail$ = makeSymbol("*HTML-TELETYPE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_underlined_head$ = makeSymbol("*HTML-UNDERLINED-HEAD*");

    // defconstant
    public static final SubLSymbol $html_underlined_tail$ = makeSymbol("*HTML-UNDERLINED-TAIL*");

    // defconstant
    public static final SubLSymbol $html_variable_head$ = makeSymbol("*HTML-VARIABLE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_variable_tail$ = makeSymbol("*HTML-VARIABLE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_label_head$ = makeSymbol("*HTML-LABEL-HEAD*");

    // defconstant
    public static final SubLSymbol $html_label_tail$ = makeSymbol("*HTML-LABEL-TAIL*");

    // defconstant
    public static final SubLSymbol $html_label_access_key$ = makeSymbol("*HTML-LABEL-ACCESS-KEY*");

    // defconstant
    public static final SubLSymbol $html_label_for$ = makeSymbol("*HTML-LABEL-FOR*");

    // defconstant
    public static final SubLSymbol $html_style_font_size_smaller$ = makeSymbol("*HTML-STYLE-FONT-SIZE-SMALLER*");

    // defconstant
    public static final SubLSymbol $html_style_font_size_larger$ = makeSymbol("*HTML-STYLE-FONT-SIZE-LARGER*");

    // defconstant
    public static final SubLSymbol $html_definition_list_head$ = makeSymbol("*HTML-DEFINITION-LIST-HEAD*");

    // defconstant
    public static final SubLSymbol $html_definition_list_tail$ = makeSymbol("*HTML-DEFINITION-LIST-TAIL*");

    // defconstant
    public static final SubLSymbol $html_definition_list_term_head$ = makeSymbol("*HTML-DEFINITION-LIST-TERM-HEAD*");

    // defconstant
    public static final SubLSymbol $html_definition_list_term_tail$ = makeSymbol("*HTML-DEFINITION-LIST-TERM-TAIL*");

    // defconstant
    public static final SubLSymbol $html_definition_list_def_head$ = makeSymbol("*HTML-DEFINITION-LIST-DEF-HEAD*");

    // defconstant
    public static final SubLSymbol $html_definition_list_def_tail$ = makeSymbol("*HTML-DEFINITION-LIST-DEF-TAIL*");

    // defconstant
    public static final SubLSymbol $html_directory_list_head$ = makeSymbol("*HTML-DIRECTORY-LIST-HEAD*");

    // defconstant
    public static final SubLSymbol $html_directory_list_tail$ = makeSymbol("*HTML-DIRECTORY-LIST-TAIL*");

    // defconstant
    public static final SubLSymbol $html_menu_list_head$ = makeSymbol("*HTML-MENU-LIST-HEAD*");

    // defconstant
    public static final SubLSymbol $html_menu_list_tail$ = makeSymbol("*HTML-MENU-LIST-TAIL*");

    // defconstant
    public static final SubLSymbol $html_ordered_list_head$ = makeSymbol("*HTML-ORDERED-LIST-HEAD*");

    // defconstant
    public static final SubLSymbol $html_ordered_list_tail$ = makeSymbol("*HTML-ORDERED-LIST-TAIL*");

    // defconstant
    public static final SubLSymbol $html_unordered_list_head$ = makeSymbol("*HTML-UNORDERED-LIST-HEAD*");

    // defconstant
    public static final SubLSymbol $html_unordered_list_tail$ = makeSymbol("*HTML-UNORDERED-LIST-TAIL*");

    // defconstant
    public static final SubLSymbol $html_list_compact$ = makeSymbol("*HTML-LIST-COMPACT*");

    // defconstant
    public static final SubLSymbol $html_list_continue$ = makeSymbol("*HTML-LIST-CONTINUE*");

    // defconstant
    public static final SubLSymbol $html_list_dingbat$ = makeSymbol("*HTML-LIST-DINGBAT*");

    // defconstant
    public static final SubLSymbol $html_list_plain$ = makeSymbol("*HTML-LIST-PLAIN*");

    // defconstant
    public static final SubLSymbol $html_list_seqnum$ = makeSymbol("*HTML-LIST-SEQNUM*");

    // defconstant
    public static final SubLSymbol $html_list_src$ = makeSymbol("*HTML-LIST-SRC*");

    // defconstant
    public static final SubLSymbol $html_list_start$ = makeSymbol("*HTML-LIST-START*");

    // defconstant
    public static final SubLSymbol $html_list_type$ = makeSymbol("*HTML-LIST-TYPE*");

    // defconstant
    public static final SubLSymbol $html_valid_list_types$ = makeSymbol("*HTML-VALID-LIST-TYPES*");

    // defconstant
    public static final SubLSymbol $html_list_item_head$ = makeSymbol("*HTML-LIST-ITEM-HEAD*");

    // defconstant
    public static final SubLSymbol $html_list_item_tail$ = makeSymbol("*HTML-LIST-ITEM-TAIL*");

    // defconstant
    public static final SubLSymbol $html_list_item_dingbat$ = makeSymbol("*HTML-LIST-ITEM-DINGBAT*");

    // defconstant
    public static final SubLSymbol $html_list_item_skip$ = makeSymbol("*HTML-LIST-ITEM-SKIP*");

    // defconstant
    public static final SubLSymbol $html_list_item_src$ = makeSymbol("*HTML-LIST-ITEM-SRC*");

    // defconstant
    public static final SubLSymbol $html_list_item_id$ = makeSymbol("*HTML-LIST-ITEM-ID*");

    // defconstant
    public static final SubLSymbol $html_list_item_type$ = makeSymbol("*HTML-LIST-ITEM-TYPE*");

    // defconstant
    public static final SubLSymbol $html_summary_head$ = makeSymbol("*HTML-SUMMARY-HEAD*");

    // defconstant
    public static final SubLSymbol $html_summary_tail$ = makeSymbol("*HTML-SUMMARY-TAIL*");

    // defconstant
    public static final SubLSymbol $html_details_head$ = makeSymbol("*HTML-DETAILS-HEAD*");

    // defconstant
    public static final SubLSymbol $html_details_tail$ = makeSymbol("*HTML-DETAILS-TAIL*");

    // defconstant
    public static final SubLSymbol $html_form_head$ = makeSymbol("*HTML-FORM-HEAD*");

    // defconstant
    public static final SubLSymbol $html_form_tail$ = makeSymbol("*HTML-FORM-TAIL*");

    // defconstant
    public static final SubLSymbol $html_form_action$ = makeSymbol("*HTML-FORM-ACTION*");

    // defconstant
    public static final SubLSymbol $html_form_method$ = makeSymbol("*HTML-FORM-METHOD*");

    // defconstant
    public static final SubLSymbol $html_form_target$ = makeSymbol("*HTML-FORM-TARGET*");

    // defconstant
    public static final SubLSymbol $html_form_name$ = makeSymbol("*HTML-FORM-NAME*");

    // defconstant
    public static final SubLSymbol $html_form_enctype$ = makeSymbol("*HTML-FORM-ENCTYPE*");

    // defconstant
    public static final SubLSymbol $html_form_method_get$ = makeSymbol("*HTML-FORM-METHOD-GET*");

    // defconstant
    public static final SubLSymbol $html_form_method_post$ = makeSymbol("*HTML-FORM-METHOD-POST*");

    // defconstant
    public static final SubLSymbol $html_blank_target$ = makeSymbol("*HTML-BLANK-TARGET*");

    // defconstant
    public static final SubLSymbol $html_self_target$ = makeSymbol("*HTML-SELF-TARGET*");

    // defconstant
    public static final SubLSymbol $html_parent_target$ = makeSymbol("*HTML-PARENT-TARGET*");

    // defconstant
    public static final SubLSymbol $html_top_target$ = makeSymbol("*HTML-TOP-TARGET*");

    // defconstant
    public static final SubLSymbol $html_input_head$ = makeSymbol("*HTML-INPUT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_input_checked$ = makeSymbol("*HTML-INPUT-CHECKED*");

    // defconstant
    public static final SubLSymbol $html_input_readonly$ = makeSymbol("*HTML-INPUT-READONLY*");

    // defconstant
    public static final SubLSymbol $html_input_disabled$ = makeSymbol("*HTML-INPUT-DISABLED*");

    // defvar
    public static final SubLSymbol $html_input_disabledP$ = makeSymbol("*HTML-INPUT-DISABLED?*");

    // defconstant
    public static final SubLSymbol $html_input_maxlength$ = makeSymbol("*HTML-INPUT-MAXLENGTH*");

    // defconstant
    public static final SubLSymbol $html_input_align$ = makeSymbol("*HTML-INPUT-ALIGN*");

    // defconstant
    public static final SubLSymbol $html_input_border$ = makeSymbol("*HTML-INPUT-BORDER*");

    // defconstant
    public static final SubLSymbol $html_input_min$ = makeSymbol("*HTML-INPUT-MIN*");

    // defconstant
    public static final SubLSymbol $html_input_max$ = makeSymbol("*HTML-INPUT-MAX*");

    // defconstant
    public static final SubLSymbol $html_input_step$ = makeSymbol("*HTML-INPUT-STEP*");

    // defconstant
    public static final SubLSymbol $html_input_name$ = makeSymbol("*HTML-INPUT-NAME*");

    // defconstant
    public static final SubLSymbol $html_input_size$ = makeSymbol("*HTML-INPUT-SIZE*");

    // defconstant
    public static final SubLSymbol $html_input_src$ = makeSymbol("*HTML-INPUT-SRC*");

    // defconstant
    public static final SubLSymbol $html_input_type$ = makeSymbol("*HTML-INPUT-TYPE*");

    // defconstant
    public static final SubLSymbol $html_input_style$ = makeSymbol("*HTML-INPUT-STYLE*");

    // defconstant
    public static final SubLSymbol $html_input_value$ = makeSymbol("*HTML-INPUT-VALUE*");

    // defconstant
    public static final SubLSymbol $html_input_alt$ = makeSymbol("*HTML-INPUT-ALT*");

    // defconstant
    public static final SubLSymbol $html_input_checkbox$ = makeSymbol("*HTML-INPUT-CHECKBOX*");



    // defconstant
    public static final SubLSymbol $html_input_hidden$ = makeSymbol("*HTML-INPUT-HIDDEN*");

    // defconstant
    public static final SubLSymbol $html_input_image$ = makeSymbol("*HTML-INPUT-IMAGE*");

    // defconstant
    public static final SubLSymbol $html_input_password$ = makeSymbol("*HTML-INPUT-PASSWORD*");



    // defconstant
    public static final SubLSymbol $html_input_range$ = makeSymbol("*HTML-INPUT-RANGE*");

    // defconstant
    public static final SubLSymbol $html_input_reset$ = makeSymbol("*HTML-INPUT-RESET*");



    // defconstant
    public static final SubLSymbol $html_input_text$ = makeSymbol("*HTML-INPUT-TEXT*");

    // defconstant
    public static final SubLSymbol $html_select_head$ = makeSymbol("*HTML-SELECT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_select_tail$ = makeSymbol("*HTML-SELECT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_select_name$ = makeSymbol("*HTML-SELECT-NAME*");

    // defconstant
    public static final SubLSymbol $html_select_size$ = makeSymbol("*HTML-SELECT-SIZE*");

    // defconstant
    public static final SubLSymbol $html_select_multiple$ = makeSymbol("*HTML-SELECT-MULTIPLE*");

    // defconstant
    public static final SubLSymbol $html_select_onchange$ = makeSymbol("*HTML-SELECT-ONCHANGE*");

    // defconstant
    public static final SubLSymbol $html_option_head$ = makeSymbol("*HTML-OPTION-HEAD*");

    // defconstant
    public static final SubLSymbol $html_option_tail$ = makeSymbol("*HTML-OPTION-TAIL*");

    // defconstant
    public static final SubLSymbol $html_option_value$ = makeSymbol("*HTML-OPTION-VALUE*");

    // defconstant
    public static final SubLSymbol $html_option_selected$ = makeSymbol("*HTML-OPTION-SELECTED*");

    // defconstant
    public static final SubLSymbol $html_optgroup_head$ = makeSymbol("*HTML-OPTGROUP-HEAD*");

    // defconstant
    public static final SubLSymbol $html_optgroup_tail$ = makeSymbol("*HTML-OPTGROUP-TAIL*");

    // defconstant
    public static final SubLSymbol $html_optgroup_label$ = makeSymbol("*HTML-OPTGROUP-LABEL*");

    // defconstant
    public static final SubLSymbol $html_select_src$ = makeSymbol("*HTML-SELECT-SRC*");

    // defconstant
    public static final SubLSymbol $html_select_width$ = makeSymbol("*HTML-SELECT-WIDTH*");

    // defconstant
    public static final SubLSymbol $html_select_height$ = makeSymbol("*HTML-SELECT-HEIGHT*");

    // defconstant
    public static final SubLSymbol $html_select_units$ = makeSymbol("*HTML-SELECT-UNITS*");

    // defconstant
    public static final SubLSymbol $html_option_shape$ = makeSymbol("*HTML-OPTION-SHAPE*");

    // defconstant
    public static final SubLSymbol $html_textarea_head$ = makeSymbol("*HTML-TEXTAREA-HEAD*");

    // defconstant
    public static final SubLSymbol $html_textarea_tail$ = makeSymbol("*HTML-TEXTAREA-TAIL*");

    // defconstant
    public static final SubLSymbol $html_textarea_name$ = makeSymbol("*HTML-TEXTAREA-NAME*");

    // defconstant
    public static final SubLSymbol $html_textarea_rows$ = makeSymbol("*HTML-TEXTAREA-ROWS*");

    // defconstant
    public static final SubLSymbol $html_textarea_cols$ = makeSymbol("*HTML-TEXTAREA-COLS*");

    // defconstant
    public static final SubLSymbol $html_textarea_id$ = makeSymbol("*HTML-TEXTAREA-ID*");

    // defconstant
    public static final SubLSymbol $html_textarea_style$ = makeSymbol("*HTML-TEXTAREA-STYLE*");

    // defconstant
    public static final SubLSymbol $html_caption_head$ = makeSymbol("*HTML-CAPTION-HEAD*");

    // defconstant
    public static final SubLSymbol $html_caption_tail$ = makeSymbol("*HTML-CAPTION-TAIL*");

    // defconstant
    public static final SubLSymbol $html_caption_align$ = makeSymbol("*HTML-CAPTION-ALIGN*");

    // defconstant
    public static final SubLSymbol $html_table_head$ = makeSymbol("*HTML-TABLE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_table_tail$ = makeSymbol("*HTML-TABLE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_table_noflow$ = makeSymbol("*HTML-TABLE-NOFLOW*");

    // defconstant
    public static final SubLSymbol $html_table_nowrap$ = makeSymbol("*HTML-TABLE-NOWRAP*");

    // defconstant
    public static final SubLSymbol $html_table_wrap$ = makeSymbol("*HTML-TABLE-WRAP*");

    // defconstant
    public static final SubLSymbol $html_table_align$ = makeSymbol("*HTML-TABLE-ALIGN*");

    // defconstant
    public static final SubLSymbol $html_table_border$ = makeSymbol("*HTML-TABLE-BORDER*");

    // defconstant
    public static final SubLSymbol $html_table_bordercolor$ = makeSymbol("*HTML-TABLE-BORDERCOLOR*");

    // defconstant
    public static final SubLSymbol $html_table_cellpadding$ = makeSymbol("*HTML-TABLE-CELLPADDING*");

    // defconstant
    public static final SubLSymbol $html_table_cellspacing$ = makeSymbol("*HTML-TABLE-CELLSPACING*");

    // defconstant
    public static final SubLSymbol $html_table_colspec$ = makeSymbol("*HTML-TABLE-COLSPEC*");

    // defconstant
    public static final SubLSymbol $html_table_units$ = makeSymbol("*HTML-TABLE-UNITS*");

    // defconstant
    public static final SubLSymbol $html_table_bgcolor$ = makeSymbol("*HTML-TABLE-BGCOLOR*");

    // defconstant
    public static final SubLSymbol $html_table_width$ = makeSymbol("*HTML-TABLE-WIDTH*");

    // defconstant
    public static final SubLSymbol $html_table_background$ = makeSymbol("*HTML-TABLE-BACKGROUND*");

    // defconstant
    public static final SubLSymbol $html_table_thead_head$ = makeSymbol("*HTML-TABLE-THEAD-HEAD*");

    // defconstant
    public static final SubLSymbol $html_table_thead_tail$ = makeSymbol("*HTML-TABLE-THEAD-TAIL*");

    // defconstant
    public static final SubLSymbol $html_table_tfoot_head$ = makeSymbol("*HTML-TABLE-TFOOT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_table_tfoot_tail$ = makeSymbol("*HTML-TABLE-TFOOT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_table_tbody_head$ = makeSymbol("*HTML-TABLE-TBODY-HEAD*");

    // defconstant
    public static final SubLSymbol $html_table_tbody_tail$ = makeSymbol("*HTML-TABLE-TBODY-TAIL*");

    // defconstant
    public static final SubLSymbol $html_table_data_head$ = makeSymbol("*HTML-TABLE-DATA-HEAD*");

    // defconstant
    public static final SubLSymbol $html_table_data_tail$ = makeSymbol("*HTML-TABLE-DATA-TAIL*");

    // defconstant
    public static final SubLSymbol $html_table_header_head$ = makeSymbol("*HTML-TABLE-HEADER-HEAD*");

    // defconstant
    public static final SubLSymbol $html_table_header_tail$ = makeSymbol("*HTML-TABLE-HEADER-TAIL*");

    // defconstant
    public static final SubLSymbol $html_table_row_head$ = makeSymbol("*HTML-TABLE-ROW-HEAD*");

    // defconstant
    public static final SubLSymbol $html_table_row_tail$ = makeSymbol("*HTML-TABLE-ROW-TAIL*");

    // defconstant
    public static final SubLSymbol $html_table_row_bgcolor$ = makeSymbol("*HTML-TABLE-ROW-BGCOLOR*");

    // defconstant
    public static final SubLSymbol $html_table_row_height$ = makeSymbol("*HTML-TABLE-ROW-HEIGHT*");

    // defconstant
    public static final SubLSymbol $html_table_row_title$ = makeSymbol("*HTML-TABLE-ROW-TITLE*");

    // defconstant
    public static final SubLSymbol $html_table_row_name$ = makeSymbol("*HTML-TABLE-ROW-NAME*");

    // defconstant
    public static final SubLSymbol $html_table_data_nowrap$ = makeSymbol("*HTML-TABLE-DATA-NOWRAP*");

    // defconstant
    public static final SubLSymbol $html_table_data_align$ = makeSymbol("*HTML-TABLE-DATA-ALIGN*");

    // defconstant
    public static final SubLSymbol $html_table_data_colspan$ = makeSymbol("*HTML-TABLE-DATA-COLSPAN*");

    // defconstant
    public static final SubLSymbol $html_table_data_rowspan$ = makeSymbol("*HTML-TABLE-DATA-ROWSPAN*");

    // defconstant
    public static final SubLSymbol $html_table_data_valign$ = makeSymbol("*HTML-TABLE-DATA-VALIGN*");

    // defconstant
    public static final SubLSymbol $html_table_data_bgcolor$ = makeSymbol("*HTML-TABLE-DATA-BGCOLOR*");

    // defconstant
    public static final SubLSymbol $html_table_data_width$ = makeSymbol("*HTML-TABLE-DATA-WIDTH*");

    // defconstant
    public static final SubLSymbol $html_table_data_height$ = makeSymbol("*HTML-TABLE-DATA-HEIGHT*");

    // defconstant
    public static final SubLSymbol $html_atomic_tail$ = makeSymbol("*HTML-ATOMIC-TAIL*");

    // defconstant
    public static final SubLSymbol $html_protocol_mailto$ = makeSymbol("*HTML-PROTOCOL-MAILTO*");

    // defconstant
    public static final SubLSymbol $html_protocol_file$ = makeSymbol("*HTML-PROTOCOL-FILE*");

    // defconstant
    public static final SubLSymbol $html_protocol_ftp$ = makeSymbol("*HTML-PROTOCOL-FTP*");

    // defconstant
    public static final SubLSymbol $html_anchor_head$ = makeSymbol("*HTML-ANCHOR-HEAD*");

    // defconstant
    public static final SubLSymbol $html_anchor_tail$ = makeSymbol("*HTML-ANCHOR-TAIL*");

    // defconstant
    public static final SubLSymbol $html_anchor_href$ = makeSymbol("*HTML-ANCHOR-HREF*");

    // defconstant
    public static final SubLSymbol $html_anchor_name$ = makeSymbol("*HTML-ANCHOR-NAME*");

    // defconstant
    public static final SubLSymbol $html_anchor_id$ = makeSymbol("*HTML-ANCHOR-ID*");

    // defconstant
    public static final SubLSymbol $html_anchor_title$ = makeSymbol("*HTML-ANCHOR-TITLE*");

    // defconstant
    public static final SubLSymbol $html_anchor_target$ = makeSymbol("*HTML-ANCHOR-TARGET*");

    // defconstant
    public static final SubLSymbol $html_anchor_style$ = makeSymbol("*HTML-ANCHOR-STYLE*");

    // defconstant
    public static final SubLSymbol $html_anchor_onmouseover$ = makeSymbol("*HTML-ANCHOR-ONMOUSEOVER*");

    // defconstant
    public static final SubLSymbol $html_anchor_onmouseout$ = makeSymbol("*HTML-ANCHOR-ONMOUSEOUT*");

    // defconstant
    public static final SubLSymbol $html_anchor_onmouseup$ = makeSymbol("*HTML-ANCHOR-ONMOUSEUP*");

    // defconstant
    public static final SubLSymbol $html_anchor_onmousedown$ = makeSymbol("*HTML-ANCHOR-ONMOUSEDOWN*");

    // defconstant
    public static final SubLSymbol $html_area_head$ = makeSymbol("*HTML-AREA-HEAD*");

    // defconstant
    public static final SubLSymbol $html_area_nohref$ = makeSymbol("*HTML-AREA-NOHREF*");

    // defconstant
    public static final SubLSymbol $html_area_alt$ = makeSymbol("*HTML-AREA-ALT*");

    // defconstant
    public static final SubLSymbol $html_area_co_ords$ = makeSymbol("*HTML-AREA-CO-ORDS*");

    // defconstant
    public static final SubLSymbol $html_area_href$ = makeSymbol("*HTML-AREA-HREF*");

    // defconstant
    public static final SubLSymbol $html_area_shape$ = makeSymbol("*HTML-AREA-SHAPE*");

    // defconstant
    public static final SubLSymbol $html_area_target$ = makeSymbol("*HTML-AREA-TARGET*");

    // defconstant
    public static final SubLSymbol $html_basefont_head$ = makeSymbol("*HTML-BASEFONT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_basefont_size$ = makeSymbol("*HTML-BASEFONT-SIZE*");

    // defconstant
    public static final SubLSymbol $html_basefont_color$ = makeSymbol("*HTML-BASEFONT-COLOR*");

    // defconstant
    public static final SubLSymbol $html_blink_head$ = makeSymbol("*HTML-BLINK-HEAD*");

    // defconstant
    public static final SubLSymbol $html_blink_tail$ = makeSymbol("*HTML-BLINK-TAIL*");

    // defconstant
    public static final SubLSymbol $html_comment_head$ = makeSymbol("*HTML-COMMENT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_comment_tail$ = makeSymbol("*HTML-COMMENT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_frame_head$ = makeSymbol("*HTML-FRAME-HEAD*");

    // defconstant
    public static final SubLSymbol $html_frame_frameborder$ = makeSymbol("*HTML-FRAME-FRAMEBORDER*");

    // defconstant
    public static final SubLSymbol $html_frame_noresize$ = makeSymbol("*HTML-FRAME-NORESIZE*");

    // defconstant
    public static final SubLSymbol $html_frame_marginheight$ = makeSymbol("*HTML-FRAME-MARGINHEIGHT*");

    // defconstant
    public static final SubLSymbol $html_frame_marginwidth$ = makeSymbol("*HTML-FRAME-MARGINWIDTH*");

    // defconstant
    public static final SubLSymbol $html_frame_name$ = makeSymbol("*HTML-FRAME-NAME*");

    // defconstant
    public static final SubLSymbol $html_frame_scrolling$ = makeSymbol("*HTML-FRAME-SCROLLING*");

    // defconstant
    public static final SubLSymbol $html_frame_src$ = makeSymbol("*HTML-FRAME-SRC*");

    // defconstant
    public static final SubLSymbol $html_frameset_head$ = makeSymbol("*HTML-FRAMESET-HEAD*");

    // defconstant
    public static final SubLSymbol $html_frameset_tail$ = makeSymbol("*HTML-FRAMESET-TAIL*");

    // defconstant
    public static final SubLSymbol $html_frameset_cols$ = makeSymbol("*HTML-FRAMESET-COLS*");

    // defconstant
    public static final SubLSymbol $html_frameset_rows$ = makeSymbol("*HTML-FRAMESET-ROWS*");

    // defconstant
    public static final SubLSymbol $html_frameset_frameborder$ = makeSymbol("*HTML-FRAMESET-FRAMEBORDER*");

    // defconstant
    public static final SubLSymbol $html_iframe_head$ = makeSymbol("*HTML-IFRAME-HEAD*");

    // defconstant
    public static final SubLSymbol $html_iframe_tail$ = makeSymbol("*HTML-IFRAME-TAIL*");

    // defconstant
    public static final SubLSymbol $html_iframe_align$ = makeSymbol("*HTML-IFRAME-ALIGN*");

    // defconstant
    public static final SubLSymbol $html_iframe_frameborder$ = makeSymbol("*HTML-IFRAME-FRAMEBORDER*");

    // defconstant
    public static final SubLSymbol $html_iframe_height$ = makeSymbol("*HTML-IFRAME-HEIGHT*");

    // defconstant
    public static final SubLSymbol $html_iframe_marginheight$ = makeSymbol("*HTML-IFRAME-MARGINHEIGHT*");

    // defconstant
    public static final SubLSymbol $html_iframe_marginwidth$ = makeSymbol("*HTML-IFRAME-MARGINWIDTH*");

    // defconstant
    public static final SubLSymbol $html_iframe_name$ = makeSymbol("*HTML-IFRAME-NAME*");

    // defconstant
    public static final SubLSymbol $html_iframe_scrolling$ = makeSymbol("*HTML-IFRAME-SCROLLING*");

    // defconstant
    public static final SubLSymbol $html_iframe_src$ = makeSymbol("*HTML-IFRAME-SRC*");

    // defconstant
    public static final SubLSymbol $html_iframe_width$ = makeSymbol("*HTML-IFRAME-WIDTH*");

    // defconstant
    public static final SubLSymbol $html_image_head$ = makeSymbol("*HTML-IMAGE-HEAD*");

    // defconstant
    public static final SubLSymbol $html_image_tail$ = makeSymbol("*HTML-IMAGE-TAIL*");

    // defconstant
    public static final SubLSymbol $html_image_name$ = makeSymbol("*HTML-IMAGE-NAME*");

    // defconstant
    public static final SubLSymbol $html_image_ismap$ = makeSymbol("*HTML-IMAGE-ISMAP*");

    // defconstant
    public static final SubLSymbol $html_image_height$ = makeSymbol("*HTML-IMAGE-HEIGHT*");

    // defconstant
    public static final SubLSymbol $html_image_width$ = makeSymbol("*HTML-IMAGE-WIDTH*");

    // defconstant
    public static final SubLSymbol $html_image_alt$ = makeSymbol("*HTML-IMAGE-ALT*");

    // defconstant
    public static final SubLSymbol $html_image_align$ = makeSymbol("*HTML-IMAGE-ALIGN*");

    // defconstant
    public static final SubLSymbol $html_image_border$ = makeSymbol("*HTML-IMAGE-BORDER*");

    // defconstant
    public static final SubLSymbol $html_image_src$ = makeSymbol("*HTML-IMAGE-SRC*");

    // defconstant
    public static final SubLSymbol $html_image_style$ = makeSymbol("*HTML-IMAGE-STYLE*");

    // defconstant
    public static final SubLSymbol $html_applet_head$ = makeSymbol("*HTML-APPLET-HEAD*");

    // defconstant
    public static final SubLSymbol $html_applet_tail$ = makeSymbol("*HTML-APPLET-TAIL*");

    // defconstant
    public static final SubLSymbol $html_applet_code$ = makeSymbol("*HTML-APPLET-CODE*");

    // defconstant
    public static final SubLSymbol $html_applet_codebase$ = makeSymbol("*HTML-APPLET-CODEBASE*");

    // defconstant
    public static final SubLSymbol $html_applet_archive$ = makeSymbol("*HTML-APPLET-ARCHIVE*");

    // defconstant
    public static final SubLSymbol $html_applet_alt$ = makeSymbol("*HTML-APPLET-ALT*");

    // defconstant
    public static final SubLSymbol $html_applet_align$ = makeSymbol("*HTML-APPLET-ALIGN*");

    // defconstant
    public static final SubLSymbol $html_applet_name$ = makeSymbol("*HTML-APPLET-NAME*");

    // defconstant
    public static final SubLSymbol $html_applet_id$ = makeSymbol("*HTML-APPLET-ID*");

    // defconstant
    public static final SubLSymbol $html_applet_height$ = makeSymbol("*HTML-APPLET-HEIGHT*");

    // defconstant
    public static final SubLSymbol $html_applet_width$ = makeSymbol("*HTML-APPLET-WIDTH*");

    // defconstant
    public static final SubLSymbol $html_param_head$ = makeSymbol("*HTML-PARAM-HEAD*");

    // defconstant
    public static final SubLSymbol $html_param_name$ = makeSymbol("*HTML-PARAM-NAME*");

    // defconstant
    public static final SubLSymbol $html_param_value$ = makeSymbol("*HTML-PARAM-VALUE*");

    // defconstant
    public static final SubLSymbol $html_map_head$ = makeSymbol("*HTML-MAP-HEAD*");

    // defconstant
    public static final SubLSymbol $html_map_tail$ = makeSymbol("*HTML-MAP-TAIL*");

    // defconstant
    public static final SubLSymbol $html_map_name$ = makeSymbol("*HTML-MAP-NAME*");

    // defconstant
    public static final SubLSymbol $html_no_break_head$ = makeSymbol("*HTML-NO-BREAK-HEAD*");

    // defconstant
    public static final SubLSymbol $html_no_break_tail$ = makeSymbol("*HTML-NO-BREAK-TAIL*");

    // defconstant
    public static final SubLSymbol $html_no_frames_head$ = makeSymbol("*HTML-NO-FRAMES-HEAD*");

    // defconstant
    public static final SubLSymbol $html_no_frames_tail$ = makeSymbol("*HTML-NO-FRAMES-TAIL*");

    // defconstant
    public static final SubLSymbol $html_object_head$ = makeSymbol("*HTML-OBJECT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_object_tail$ = makeSymbol("*HTML-OBJECT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_object_classid$ = makeSymbol("*HTML-OBJECT-CLASSID*");

    // defconstant
    public static final SubLSymbol $html_object_codebase$ = makeSymbol("*HTML-OBJECT-CODEBASE*");

    // defconstant
    public static final SubLSymbol $html_object_codetype$ = makeSymbol("*HTML-OBJECT-CODETYPE*");

    // defconstant
    public static final SubLSymbol $html_object_data$ = makeSymbol("*HTML-OBJECT-DATA*");

    // defconstant
    public static final SubLSymbol $html_object_type$ = makeSymbol("*HTML-OBJECT-TYPE*");

    // defconstant
    public static final SubLSymbol $html_object_archive$ = makeSymbol("*HTML-OBJECT-ARCHIVE*");

    // defconstant
    public static final SubLSymbol $html_object_id$ = makeSymbol("*HTML-OBJECT-ID*");

    // defconstant
    public static final SubLSymbol $html_object_class$ = makeSymbol("*HTML-OBJECT-CLASS*");

    // defconstant
    public static final SubLSymbol $html_object_align$ = makeSymbol("*HTML-OBJECT-ALIGN*");

    // defconstant
    public static final SubLSymbol $html_object_width$ = makeSymbol("*HTML-OBJECT-WIDTH*");

    // defconstant
    public static final SubLSymbol $html_object_height$ = makeSymbol("*HTML-OBJECT-HEIGHT*");

    // defconstant
    public static final SubLSymbol $html_object_border$ = makeSymbol("*HTML-OBJECT-BORDER*");

    // defconstant
    public static final SubLSymbol $html_object_hspace$ = makeSymbol("*HTML-OBJECT-HSPACE*");

    // defconstant
    public static final SubLSymbol $html_object_vspace$ = makeSymbol("*HTML-OBJECT-VSPACE*");

    // defconstant
    public static final SubLSymbol $html_script_head$ = makeSymbol("*HTML-SCRIPT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_script_tail$ = makeSymbol("*HTML-SCRIPT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_script_language$ = makeSymbol("*HTML-SCRIPT-LANGUAGE*");

    // defconstant
    public static final SubLSymbol $html_script_src$ = makeSymbol("*HTML-SCRIPT-SRC*");

    // defconstant
    public static final SubLSymbol $html_script_type$ = makeSymbol("*HTML-SCRIPT-TYPE*");

    // defconstant
    public static final SubLSymbol $html_script_javascript$ = makeSymbol("*HTML-SCRIPT-JAVASCRIPT*");

    // defconstant
    public static final SubLSymbol $html_noscript_head$ = makeSymbol("*HTML-NOSCRIPT-HEAD*");

    // defconstant
    public static final SubLSymbol $html_noscript_tail$ = makeSymbol("*HTML-NOSCRIPT-TAIL*");

    // defconstant
    public static final SubLSymbol $html_word_break$ = makeSymbol("*HTML-WORD-BREAK*");

    // defconstant
    public static final SubLSymbol $html_color_white$ = makeSymbol("*HTML-COLOR-WHITE*");

    // defconstant
    public static final SubLSymbol $html_color_black$ = makeSymbol("*HTML-COLOR-BLACK*");

    // defconstant
    public static final SubLSymbol $html_color_dark_grey$ = makeSymbol("*HTML-COLOR-DARK-GREY*");

    // defconstant
    public static final SubLSymbol $html_color_light_grey$ = makeSymbol("*HTML-COLOR-LIGHT-GREY*");

    // defconstant
    public static final SubLSymbol $html_color_lighter_grey$ = makeSymbol("*HTML-COLOR-LIGHTER-GREY*");

    // defconstant
    public static final SubLSymbol $html_color_lightest_grey$ = makeSymbol("*HTML-COLOR-LIGHTEST-GREY*");

    // defconstant
    public static final SubLSymbol $html_color_yellowish_gray$ = makeSymbol("*HTML-COLOR-YELLOWISH-GRAY*");

    // defconstant
    public static final SubLSymbol $html_color_sat_red$ = makeSymbol("*HTML-COLOR-SAT-RED*");

    // defconstant
    public static final SubLSymbol $html_color_dark_red$ = makeSymbol("*HTML-COLOR-DARK-RED*");

    // defconstant
    public static final SubLSymbol $html_color_medium_red$ = makeSymbol("*HTML-COLOR-MEDIUM-RED*");

    // defconstant
    public static final SubLSymbol $html_color_medium_dark_red$ = makeSymbol("*HTML-COLOR-MEDIUM-DARK-RED*");

    // defconstant
    public static final SubLSymbol $html_color_light_red$ = makeSymbol("*HTML-COLOR-LIGHT-RED*");

    // defconstant
    public static final SubLSymbol $html_color_lighter_red$ = makeSymbol("*HTML-COLOR-LIGHTER-RED*");

    // defconstant
    public static final SubLSymbol $html_color_sat_green$ = makeSymbol("*HTML-COLOR-SAT-GREEN*");

    // defconstant
    public static final SubLSymbol $html_color_dark_green$ = makeSymbol("*HTML-COLOR-DARK-GREEN*");

    // defconstant
    public static final SubLSymbol $html_color_darker_green$ = makeSymbol("*HTML-COLOR-DARKER-GREEN*");

    // defconstant
    public static final SubLSymbol $html_color_light_green$ = makeSymbol("*HTML-COLOR-LIGHT-GREEN*");

    // defconstant
    public static final SubLSymbol $html_color_lighter_green$ = makeSymbol("*HTML-COLOR-LIGHTER-GREEN*");

    // defconstant
    public static final SubLSymbol $html_color_sat_blue$ = makeSymbol("*HTML-COLOR-SAT-BLUE*");

    // defconstant
    public static final SubLSymbol $html_color_dark_blue$ = makeSymbol("*HTML-COLOR-DARK-BLUE*");

    // defconstant
    public static final SubLSymbol $html_color_light_blue$ = makeSymbol("*HTML-COLOR-LIGHT-BLUE*");

    // defconstant
    public static final SubLSymbol $html_color_lighter_blue$ = makeSymbol("*HTML-COLOR-LIGHTER-BLUE*");

    // defconstant
    public static final SubLSymbol $html_color_sat_yellow$ = makeSymbol("*HTML-COLOR-SAT-YELLOW*");

    // defconstant
    public static final SubLSymbol $html_color_dark_yellow$ = makeSymbol("*HTML-COLOR-DARK-YELLOW*");

    // defconstant
    public static final SubLSymbol $html_color_light_yellow$ = makeSymbol("*HTML-COLOR-LIGHT-YELLOW*");

    // defconstant
    public static final SubLSymbol $html_color_lighter_yellow$ = makeSymbol("*HTML-COLOR-LIGHTER-YELLOW*");

    // defconstant
    public static final SubLSymbol $html_color_darker_purple$ = makeSymbol("*HTML-COLOR-DARKER-PURPLE*");

    // defconstant
    public static final SubLSymbol $html_color_dark_purple$ = makeSymbol("*HTML-COLOR-DARK-PURPLE*");

    // defconstant
    public static final SubLSymbol $html_color_light_purple$ = makeSymbol("*HTML-COLOR-LIGHT-PURPLE*");

    // defconstant
    public static final SubLSymbol $html_color_lighter_purple$ = makeSymbol("*HTML-COLOR-LIGHTER-PURPLE*");

    // deflexical
    public static final SubLSymbol $html_color_cyan$ = makeSymbol("*HTML-COLOR-CYAN*");

    // deflexical
    public static final SubLSymbol $html_color_light_cyan$ = makeSymbol("*HTML-COLOR-LIGHT-CYAN*");

    // deflexical
    public static final SubLSymbol $html_color_cyc_logo_violet$ = makeSymbol("*HTML-COLOR-CYC-LOGO-VIOLET*");









    // defparameter
    // color mapping for named colors
    public static final SubLSymbol $html_color_map$ = makeSymbol("*HTML-COLOR-MAP*");

    // defparameter
    public static final SubLSymbol $html_alternating_class1$ = makeSymbol("*HTML-ALTERNATING-CLASS1*");

    // defparameter
    public static final SubLSymbol $html_alternating_class2$ = makeSymbol("*HTML-ALTERNATING-CLASS2*");

    // defconstant
    public static final SubLSymbol $html_known_dom_events$ = makeSymbol("*HTML-KNOWN-DOM-EVENTS*");

    // deflexical
    // The name of the overall class used to style the Cyc browser
    public static final SubLSymbol $basic_skin_class$ = makeSymbol("*BASIC-SKIN-CLASS*");

    // defparameter
    // map of ascii chars to HTML ampersand escapes
    public static final SubLSymbol $html_escapes_map$ = makeSymbol("*HTML-ESCAPES-MAP*");

    // deflexical
    // special map of ascii chars to HTML escapes for use by prin1
    public static final SubLSymbol $html_prin1_string_escapes_map$ = makeSymbol("*HTML-PRIN1-STRING-ESCAPES-MAP*");

    // deflexical
    /**
     * When *cb-a-show-newlines-in-string-args* is T this is appended to
     * html-escapes-map* so that newlines can be shown. @owner jantos
     */
    public static final SubLSymbol $html_escapes_map_for_showing_newlines$ = makeSymbol("*HTML-ESCAPES-MAP-FOR-SHOWING-NEWLINES*");

    // defparameter
    /**
     * If non-NIL, then when printing to *html-stream*, substitute HTML escape
     * sequences for HTML reserved characters
     */
    public static final SubLSymbol $html_safe_print$ = makeSymbol("*HTML-SAFE-PRINT*");

    // defparameter
    /**
     * If non-NIL, then when printing a string to *html-stream*, substitute
     * appropriate HTML directives for return characters to preserver line breaks
     */
    public static final SubLSymbol $html_preserve_breaks$ = makeSymbol("*HTML-PRESERVE-BREAKS*");

    // defparameter
    // Will be rebound to T when inside the BODY clause in HTML
    public static final SubLSymbol $html_inside_bodyP$ = makeSymbol("*HTML-INSIDE-BODY?*");

    // defparameter
    public static final SubLSymbol $within_html_pre$ = makeSymbol("*WITHIN-HTML-PRE*");

    // defparameter
    public static final SubLSymbol $suppress_html_source_readability_terpriP$ = makeSymbol("*SUPPRESS-HTML-SOURCE-READABILITY-TERPRI?*");

    // defparameter
    public static final SubLSymbol $html_id_space_id_generator$ = makeSymbol("*HTML-ID-SPACE-ID-GENERATOR*");





    // defparameter
    public static final SubLSymbol $within_html_form$ = makeSymbol("*WITHIN-HTML-FORM*");











    // Internal Constants
    public static final SubLSymbol $html_default_bgcolor$ = makeSymbol("*HTML-DEFAULT-BGCOLOR*");

    public static final SubLString $str1$_body = makeString("<body");

    public static final SubLString $str2$__body_ = makeString("</body>");

    public static final SubLString $str3$_bgcolor_ = makeString(" bgcolor=");

    public static final SubLString $str4$_background_ = makeString(" background=");

    public static final SubLString $str5$_class_ = makeString(" class=");

    private static final SubLString $str6$_style_ = makeString(" style=");

    private static final SubLString $str7$_text_ = makeString(" text=");

    private static final SubLString $str8$_link_ = makeString(" link=");

    private static final SubLString $str9$_alink_ = makeString(" alink=");

    private static final SubLString $str10$_vlink_ = makeString(" vlink=");

    private static final SubLString $str11$_onLoad_ = makeString(" onLoad=");

    private static final SubLString $str12$_onResize_ = makeString(" onResize=");

    private static final SubLString $str13$_div = makeString("<div");

    private static final SubLString $str14$__div_ = makeString("</div>");

    private static final SubLString $str15$_title_ = makeString(" title=");

    private static final SubLString $str16$_align_ = makeString(" align=");

    private static final SubLString $str17$_span = makeString("<span");

    private static final SubLString $str18$__span_ = makeString("</span>");

    private static final SubLString $str19$_head_ = makeString("<head>");

    private static final SubLString $str20$__head_ = makeString("</head>");

    private static final SubLString $str21$_html_ = makeString("<html>");

    private static final SubLString $str22$__html_ = makeString("</html>");

    private static final SubLString $str23$_id_ = makeString(" id=");

    private static final SubLString $str24$_onclick_ = makeString(" onclick=");

    private static final SubLString $str25$_onblur_ = makeString(" onblur=");

    private static final SubLString $str26$_onfocus_ = makeString(" onfocus=");

    private static final SubLString $str27$_onkeyup_ = makeString(" onkeyup=");

    private static final SubLString $str28$_onkeydown_ = makeString(" onkeydown=");

    private static final SubLString $str29$_onkeypress_ = makeString(" onkeypress=");

    private static final SubLString $str30$_meta = makeString("<meta");

    private static final SubLString $str31$_http_equiv_ = makeString(" http-equiv=");

    private static final SubLString $str32$_content_ = makeString(" content=");

    private static final SubLString $str33$_scheme_ = makeString(" scheme=");

    private static final SubLString $str34$_name_ = makeString(" name=");

    private static final SubLString $str35$_lang_ = makeString(" lang=");

    private static final SubLString $str36$_dir_ = makeString(" dir=");

    private static final SubLString $str37$_title_ = makeString("<title>");

    private static final SubLString $str38$__title_ = makeString("</title>");

    private static final SubLString $str39$_link = makeString("<link");

    private static final SubLString $str40$_rel_ = makeString(" rel=");

    private static final SubLString $str41$_type_ = makeString(" type=");

    private static final SubLString $str42$_href_ = makeString(" href=");

    private static final SubLString $str43$_media_ = makeString(" media=");

    private static final SubLString $str44$_base = makeString("<base");

    private static final SubLString $str45$_style_ = makeString("<style>");

    private static final SubLString $str46$__style_ = makeString("</style>");

    private static final SubLString $str47$_blockquote_ = makeString("<blockquote>");

    private static final SubLString $str48$__blockquote_ = makeString("</blockquote>");

    private static final SubLString $str49$_center_ = makeString("<center>");

    private static final SubLString $str50$__center_ = makeString("</center>");

    private static final SubLString $str51$_h = makeString("<h");

    private static final SubLString $str52$__h = makeString("</h");

    private static final SubLString $str53$_hr = makeString("<hr");

    private static final SubLString $str54$_size_ = makeString(" size=");

    private static final SubLString $str55$_width_ = makeString(" width=");

    private static final SubLString $str56$_br___ = makeString("<br />");

    private static final SubLString $str57$_br = makeString("<br");

    private static final SubLString $str58$__br_ = makeString("</br>");

    private static final SubLString $str59$_clear_ = makeString(" clear=");

    private static final SubLString $str60$_br_ = makeString("<br>");

    private static final SubLString $str61$_p_ = makeString("<p>");

    private static final SubLString $str62$__p_ = makeString("</p>");

    private static final SubLString $str63$_plaintext_ = makeString("<plaintext>");

    private static final SubLString $str64$__plaintext_ = makeString("</plaintext>");

    private static final SubLString $str65$_pre_ = makeString("<pre>");

    private static final SubLString $str66$__pre_ = makeString("</pre>");

    private static final SubLString $str67$_address_ = makeString("<address>");

    private static final SubLString $str68$__address_ = makeString("</address>");

    private static final SubLString $str69$_big_ = makeString("<big>");

    private static final SubLString $str70$__big_ = makeString("</big>");

    private static final SubLString $str71$_b_ = makeString("<b>");

    private static final SubLString $str72$__b_ = makeString("</b>");

    private static final SubLString $str73$_cite_ = makeString("<cite>");

    private static final SubLString $str74$__cite_ = makeString("</cite>");

    private static final SubLString $str75$_code_ = makeString("<code>");

    private static final SubLString $str76$__code_ = makeString("</code>");

    private static final SubLString $str77$_dfn_ = makeString("<dfn>");

    private static final SubLString $str78$__dfn_ = makeString("</dfn>");

    private static final SubLString $str79$_em_ = makeString("<em>");

    private static final SubLString $str80$__em_ = makeString("</em>");

    private static final SubLString $str81$_font = makeString("<font");

    private static final SubLString $str82$__font_ = makeString("</font>");

    private static final SubLString $str83$_color_ = makeString(" color=");

    private static final SubLString $str84$_face_ = makeString(" face=");

    private static final SubLString $str85$_i_ = makeString("<i>");

    private static final SubLString $str86$__i_ = makeString("</i>");

    private static final SubLString $str87$_kbd_ = makeString("<kbd>");

    private static final SubLString $str88$__kbd_ = makeString("</kbd>");

    private static final SubLString $str89$_samp_ = makeString("<samp>");

    private static final SubLString $str90$__samp_ = makeString("</samp>");

    private static final SubLString $str91$_small_ = makeString("<small>");

    private static final SubLString $str92$__small_ = makeString("</small>");

    private static final SubLString $str93$_strike_ = makeString("<strike>");

    private static final SubLString $str94$__strike_ = makeString("</strike>");

    private static final SubLString $str95$_strong_ = makeString("<strong>");

    private static final SubLString $str96$__strong_ = makeString("</strong>");

    private static final SubLString $str97$_sub_ = makeString("<sub>");

    private static final SubLString $str98$__sub_ = makeString("</sub>");

    private static final SubLString $str99$_sup_ = makeString("<sup>");

    private static final SubLString $str100$__sup_ = makeString("</sup>");

    private static final SubLString $str101$_tt_ = makeString("<tt>");

    private static final SubLString $str102$__tt_ = makeString("</tt>");

    private static final SubLString $str103$_u_ = makeString("<u>");

    private static final SubLString $str104$__u_ = makeString("</u>");

    private static final SubLString $str105$_var_ = makeString("<var>");

    private static final SubLString $str106$__var_ = makeString("</var>");

    private static final SubLString $str107$_label = makeString("<label");

    private static final SubLString $str108$__label_ = makeString("</label>");

    private static final SubLString $str109$_accesskey_ = makeString(" accesskey=");

    private static final SubLString $str110$_for_ = makeString(" for=");

    private static final SubLString $str111$font_size__smaller = makeString("font-size: smaller");

    private static final SubLString $str112$font_size__larger = makeString("font-size: larger");

    private static final SubLString $str113$_dl = makeString("<dl");

    private static final SubLString $str114$__dl_ = makeString("</dl>");

    private static final SubLString $str115$_dt_ = makeString("<dt>");

    private static final SubLString $str116$__dt_ = makeString("</dt>");

    private static final SubLString $str117$_dd_ = makeString("<dd>");

    private static final SubLString $str118$__dd_ = makeString("</dd>");

    private static final SubLString $str119$_dir = makeString("<dir");

    private static final SubLString $str120$__dir_ = makeString("</dir>");

    private static final SubLString $str121$_menu = makeString("<menu");

    private static final SubLString $str122$__menu_ = makeString("</menu>");

    private static final SubLString $str123$_ol = makeString("<ol");

    private static final SubLString $str124$__ol_ = makeString("</ol>");

    private static final SubLString $str125$_ul = makeString("<ul");

    private static final SubLString $str126$__ul_ = makeString("</ul>");

    private static final SubLString $$$_compact = makeString(" compact");

    private static final SubLString $$$_continue = makeString(" continue");

    private static final SubLString $str129$_dingbat_ = makeString(" dingbat=");

    private static final SubLString $$$_plain = makeString(" plain");

    private static final SubLString $str131$_seqnum_ = makeString(" seqnum=");

    private static final SubLString $str132$_src_ = makeString(" src=");

    private static final SubLString $str133$_start_ = makeString(" start=");

    private static final SubLList $list134 = list(makeString("A"), makeString("a"), makeString("I"), makeString("i"), makeString("1"));

    private static final SubLString $str135$_li = makeString("<li");

    private static final SubLString $str136$__li_ = makeString("</li>");

    private static final SubLString $str137$_skip_ = makeString(" skip=");

    private static final SubLString $str138$_summary = makeString("<summary");

    private static final SubLString $str139$__summary_ = makeString("</summary>");

    private static final SubLString $str140$_details = makeString("<details");

    private static final SubLString $str141$__details_ = makeString("</details>");

    private static final SubLString $str142$_form = makeString("<form");

    private static final SubLString $str143$__form_ = makeString("</form>");

    private static final SubLString $str144$_action_ = makeString(" action=");

    private static final SubLString $str145$_method_ = makeString(" method=");

    private static final SubLString $str146$_target_ = makeString(" target=");

    private static final SubLString $str147$_enctype_ = makeString(" enctype=");

    private static final SubLString $$$get = makeString("get");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str150$_blank = makeString("_blank");

    private static final SubLString $str151$_self = makeString("_self");

    private static final SubLString $str152$_parent = makeString("_parent");

    private static final SubLString $str153$_top = makeString("_top");

    private static final SubLString $str154$_input = makeString("<input");

    private static final SubLString $$$_checked = makeString(" checked");

    private static final SubLString $$$_readonly = makeString(" readonly");

    private static final SubLString $$$_disabled = makeString(" disabled");

    private static final SubLString $str158$_maxlength_ = makeString(" maxlength=");

    private static final SubLString $str159$_border_ = makeString(" border=");

    private static final SubLString $str160$_min_ = makeString(" min=");

    private static final SubLString $str161$_max_ = makeString(" max=");

    private static final SubLString $str162$_step_ = makeString(" step=");

    private static final SubLString $str163$_value_ = makeString(" value=");

    private static final SubLString $str164$_alt_ = makeString(" alt=");

    private static final SubLString $$$checkbox = makeString("checkbox");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$hidden = makeString("hidden");

    private static final SubLString $$$image = makeString("image");

    private static final SubLString $$$password = makeString("password");

    private static final SubLString $$$radio = makeString("radio");

    private static final SubLString $$$range = makeString("range");

    private static final SubLString $$$reset = makeString("reset");

    private static final SubLString $$$submit = makeString("submit");

    private static final SubLString $$$text = makeString("text");

    private static final SubLString $str175$_select = makeString("<select");

    private static final SubLString $str176$__select_ = makeString("</select>");

    private static final SubLString $$$_multiple = makeString(" multiple");

    private static final SubLString $str178$_onChange_ = makeString(" onChange=");

    private static final SubLString $str179$_option = makeString("<option");

    private static final SubLString $str180$ = makeString("");

    private static final SubLString $$$_selected = makeString(" selected");

    private static final SubLString $str182$_optgroup = makeString("<optgroup");

    private static final SubLString $str183$__optgroup_ = makeString("</optgroup>");

    private static final SubLString $str184$_label_ = makeString(" label=");

    private static final SubLString $str185$_height_ = makeString(" height=");

    private static final SubLString $str186$_units_ = makeString(" units=");

    private static final SubLString $str187$_shape_ = makeString(" shape=");

    private static final SubLString $str188$_textarea = makeString("<textarea");

    private static final SubLString $str189$__textarea_ = makeString("</textarea>");

    private static final SubLString $str190$_rows_ = makeString(" rows=");

    private static final SubLString $str191$_cols_ = makeString(" cols=");

    private static final SubLString $str192$_caption = makeString("<caption");

    private static final SubLString $str193$__caption_ = makeString("</caption>");

    private static final SubLString $str194$_table = makeString("<table");

    private static final SubLString $str195$__table_ = makeString("</table>");

    private static final SubLString $$$_noflow = makeString(" noflow");

    private static final SubLString $$$_nowrap = makeString(" nowrap");

    private static final SubLString $str198$_wrap_ = makeString(" wrap=");

    private static final SubLString $str199$_bordercolor_ = makeString(" bordercolor=");

    private static final SubLString $str200$_cellpadding_ = makeString(" cellpadding=");

    private static final SubLString $str201$_cellspacing_ = makeString(" cellspacing=");

    private static final SubLString $str202$_colspec_ = makeString(" colspec=");

    private static final SubLString $str203$_thead = makeString("<thead");

    private static final SubLString $str204$__thead_ = makeString("</thead>");

    private static final SubLString $str205$_tfoot = makeString("<tfoot");

    private static final SubLString $str206$__tfoot_ = makeString("</tfoot>");

    private static final SubLString $str207$_tbody = makeString("<tbody");

    private static final SubLString $str208$__tbody_ = makeString("</tbody>");

    private static final SubLString $str209$_td = makeString("<td");

    private static final SubLString $str210$__td_ = makeString("</td>");

    private static final SubLString $str211$_th = makeString("<th");

    private static final SubLString $str212$__th_ = makeString("</th>");

    private static final SubLString $str213$_tr = makeString("<tr");

    private static final SubLString $str214$__tr_ = makeString("</tr>");

    private static final SubLString $str215$_colspan_ = makeString(" colspan=");

    private static final SubLString $str216$_rowspan_ = makeString(" rowspan=");

    private static final SubLString $str217$_valign_ = makeString(" valign=");

    private static final SubLString $str218$__ = makeString("/>");

    private static final SubLString $str219$mailto_ = makeString("mailto:");

    private static final SubLString $str220$file_ = makeString("file:");

    private static final SubLString $str221$ftp_ = makeString("ftp:");

    private static final SubLString $str222$_a = makeString("<a");

    private static final SubLString $str223$__a_ = makeString("</a>");

    private static final SubLString $str224$_onmouseover_ = makeString(" onmouseover=");

    private static final SubLString $str225$_onmouseout_ = makeString(" onmouseout=");

    private static final SubLString $str226$_onmouseup_ = makeString(" onmouseup=");

    private static final SubLString $str227$_onmousedown_ = makeString(" onmousedown=");

    private static final SubLString $str228$_area = makeString("<area");

    private static final SubLString $$$_nohref = makeString(" nohref");

    private static final SubLString $str230$_co_ords_ = makeString(" co-ords=");

    private static final SubLString $str231$_basefont = makeString("<basefont");

    private static final SubLString $str232$_blink_ = makeString("<blink>");

    private static final SubLString $str233$__blink_ = makeString("</blink>");

    private static final SubLString $str234$____ = makeString("<!--");

    private static final SubLString $str235$___ = makeString("-->");

    private static final SubLString $str236$_frame = makeString("<frame");

    private static final SubLString $str237$_frameborder_ = makeString(" frameborder=");

    private static final SubLString $$$_noresize = makeString(" noresize");

    private static final SubLString $str239$_marginheight_ = makeString(" marginheight=");

    private static final SubLString $str240$_marginwidth_ = makeString(" marginwidth=");

    private static final SubLString $str241$_scrolling_ = makeString(" scrolling=");

    private static final SubLString $str242$_frameset = makeString("<frameset");

    private static final SubLString $str243$__frameset_ = makeString("</frameset>");

    private static final SubLString $str244$_iframe = makeString("<iframe");

    private static final SubLString $str245$__iframe_ = makeString("</iframe>");

    private static final SubLString $str246$_img = makeString("<img");

    private static final SubLString $str247$__img_ = makeString("</img>");

    private static final SubLString $$$_ismap = makeString(" ismap");

    private static final SubLString $str249$_applet_ = makeString("<applet ");

    private static final SubLString $str250$__applet_ = makeString("</applet>");

    private static final SubLString $str251$_code_ = makeString(" code=");

    private static final SubLString $str252$_codebase_ = makeString(" codebase=");

    private static final SubLString $str253$_archive_ = makeString(" archive=");

    private static final SubLString $str254$_param_ = makeString("<param ");

    private static final SubLString $str255$_map = makeString("<map");

    private static final SubLString $str256$__map_ = makeString("</map>");

    private static final SubLString $str257$_nobr_ = makeString("<nobr>");

    private static final SubLString $str258$__nobr_ = makeString("</nobr>");

    private static final SubLString $str259$_noframes_ = makeString("<noframes>");

    private static final SubLString $str260$__noframes_ = makeString("</noframes>");

    private static final SubLString $str261$_object_ = makeString("<object ");

    private static final SubLString $str262$__object_ = makeString("</object>");

    private static final SubLString $str263$_classid_ = makeString(" classid=");

    private static final SubLString $str264$_codetype_ = makeString(" codetype=");

    private static final SubLString $str265$_data_ = makeString(" data=");

    private static final SubLString $str266$_hspace_ = makeString(" hspace=");

    private static final SubLString $str267$_vspace_ = makeString(" vspace=");

    private static final SubLString $str268$_script = makeString("<script");

    private static final SubLString $str269$__script_ = makeString("</script>");

    private static final SubLString $str270$_language_ = makeString(" language=");

    private static final SubLString $$$JavaScript = makeString("JavaScript");

    private static final SubLString $str272$_noscript = makeString("<noscript");

    private static final SubLString $str273$__noscript_ = makeString("</noscript>");

    private static final SubLString $str274$_wbr_ = makeString("<wbr>");

    private static final SubLString $str275$_ffffff = makeString("#ffffff");

    private static final SubLString $str276$_000000 = makeString("#000000");

    private static final SubLString $str277$_999999 = makeString("#999999");

    private static final SubLString $str278$_cccccc = makeString("#cccccc");

    private static final SubLString $str279$_dddddd = makeString("#dddddd");

    private static final SubLString $str280$_eeeeee = makeString("#eeeeee");

    private static final SubLString $str281$_eeeee4 = makeString("#eeeee4");

    private static final SubLString $str282$_ff0000 = makeString("#ff0000");

    private static final SubLString $str283$_996666 = makeString("#996666");

    private static final SubLString $str284$_ff8888 = makeString("#ff8888");

    private static final SubLString $str285$_cc0000 = makeString("#cc0000");

    private static final SubLString $str286$_eeaaaa = makeString("#eeaaaa");

    private static final SubLString $str287$_ffbbbb = makeString("#ffbbbb");

    private static final SubLString $str288$_00ff00 = makeString("#00ff00");

    private static final SubLString $str289$_669966 = makeString("#669966");

    private static final SubLString $str290$_335533 = makeString("#335533");

    private static final SubLString $str291$_aaeeaa = makeString("#aaeeaa");

    private static final SubLString $str292$_bbffbb = makeString("#bbffbb");

    private static final SubLString $str293$_0000ff = makeString("#0000ff");

    private static final SubLString $str294$_668899 = makeString("#668899");

    private static final SubLString $str295$_aaccee = makeString("#aaccee");

    private static final SubLString $str296$_bbddff = makeString("#bbddff");

    private static final SubLString $str297$_ffff00 = makeString("#ffff00");

    private static final SubLString $str298$_999966 = makeString("#999966");

    private static final SubLString $str299$_eeeeaa = makeString("#eeeeaa");

    private static final SubLString $str300$_ffffbb = makeString("#ffffbb");

    private static final SubLString $str301$_9900bb = makeString("#9900bb");

    private static final SubLString $str302$_996699 = makeString("#996699");

    private static final SubLString $str303$_ddbbff = makeString("#ddbbff");

    private static final SubLString $str304$_eeccff = makeString("#eeccff");

    private static final SubLString $str305$_00ffff = makeString("#00ffff");

    private static final SubLString $str306$_e0ffff = makeString("#e0ffff");

    private static final SubLString $str307$_9933cc = makeString("#9933cc");

    private static final SubLString $str308$_f0d3ff = makeString("#f0d3ff");

    private static final SubLString $str309$_f4e0ff = makeString("#f4e0ff");

    private static final SubLString $str310$_e0e5ff = makeString("#e0e5ff");

    private static final SubLString $str311$_e6f0ff = makeString("#e6f0ff");







    private static final SubLList $list315 = cons(makeKeyword("CYAN"), makeString("#00ffff"));



    private static final SubLList $list317 = cons(makeKeyword("MAGENTA"), makeString("#ff00ff"));







    private static final SubLList $list321 = cons(makeKeyword("LIGHT-BLUE"), makeString("#ececff"));





    public static final SubLList $list324 = cons(makeKeyword("MEDIUM-RED"), makeString("#ff8888"));

    public static final SubLList $list325 = cons(makeKeyword("LIGHT-RED"), makeString("#ffdede"));





    private static final SubLList $list328 = cons(makeKeyword("LIGHT-YELLOW"), makeString("#fffcd2"));





    public static final SubLList $list331 = cons(makeKeyword("LIGHT-GRAY"), makeString("#eeeee4"));













    private static final SubLString $str338$cyc_alternate_class1 = makeString("cyc-alternate-class1");

    private static final SubLString $str339$cyc_alternate_class2 = makeString("cyc-alternate-class2");

    public static final SubLList $list340 = list(new SubLObject[]{ makeKeyword("ONABORT"), makeKeyword("ONBLUR"), makeKeyword("ONCHANGE"), makeKeyword("ONCLICK"), makeKeyword("ONDBLCLICK"), makeKeyword("ONDRAGDROP"), makeKeyword("ONERROR"), makeKeyword("ONFOCUS"), makeKeyword("ONKEYDOWN"), makeKeyword("ONKEYPRESS"), makeKeyword("ONKEYUP"), makeKeyword("ONLOAD"), makeKeyword("ONMOUSEDOWN"), makeKeyword("ONMOUSEMOVE"), makeKeyword("ONMOUSEOUT"), makeKeyword("ONMOUSEOVER"), makeKeyword("ONMOUSEUP"), makeKeyword("ONMOVE"), makeKeyword("ONRESET"), makeKeyword("ONRESIZE"), makeKeyword("ONSELECT"), makeKeyword("ONSUBMIT"), makeKeyword("ONUNLOAD") });

    private static final SubLString $str341$yui_skin_sam = makeString("yui-skin-sam");

    public static final SubLList $list342 = list(cons(CHAR_ampersand, makeString("&amp;")), cons(CHAR_less, makeString("&lt;")), cons(CHAR_greater, makeString("&gt;")), cons(CHAR_quotation, makeString("&quot;")));

    private static final SubLList $list343 = list(cons(CHAR_ampersand, makeString("&amp;")), cons(CHAR_less, makeString("&lt;")), cons(CHAR_greater, makeString("&gt;")), cons(CHAR_quotation, makeString("\\&quot;")), cons(CHAR_backslash, makeString("\\\\")));

    private static final SubLList $list344 = list(cons(CHAR_ampersand, makeString("&amp;")), cons(CHAR_less, makeString("&lt;")), cons(CHAR_greater, makeString("&gt;")), cons(CHAR_quotation, makeString("&quot;")), cons(CHAR_backslash, makeString("\\\\")), cons(CHAR_return, makeString("")), cons(CHAR_newline, makeString("<br>")), cons(CHAR_tab, makeString("&nbsp;&nbsp;&nbsp;&nbsp;")));

    private static final SubLList $list345 = list(makeSymbol("CONTROL-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    public static final SubLSymbol $html_stream$ = makeSymbol("*HTML-STREAM*");



    private static final SubLList $list349 = list(list(makeSymbol("HEAD"), makeSymbol("&OPTIONAL"), makeSymbol("TAIL")), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLList $list352 = list(list(makeSymbol("HTML-CHAR"), CHAR_greater));

    private static final SubLList $list353 = list(list(makeSymbol("ATT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list354 = list(makeSymbol("HTML-CHAR"), CHAR_quotation);

    private static final SubLList $list355 = list(list(makeSymbol("HTML-CHAR"), CHAR_quotation));

    public static final SubLList $list356 = list(makeSymbol("HTML-CHAR"), CHAR_greater);



    public static final SubLList $list358 = list(list(makeSymbol("*HTML-SAFE-PRINT*"), T));

    private static final SubLList $list359 = list(list(new SubLObject[]{ makeSymbol("&KEY"), list(makeSymbol("SHOW-COPYRIGHT"), T), makeSymbol("BACKGROUND-IMAGE"), makeSymbol("BACKGROUND-COLOR"), makeSymbol("CLASS"), makeSymbol("TEXT-COLOR"), makeSymbol("LINK-COLOR"), makeSymbol("ACTIVE-LINK-COLOR"), makeSymbol("VISITED-LINK-COLOR"), makeSymbol("SCRIPT"), makeSymbol("ONLOAD"), makeSymbol("ONRESIZE"), makeSymbol("STYLE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list360 = list(new SubLObject[]{ makeKeyword("SHOW-COPYRIGHT"), makeKeyword("BACKGROUND-IMAGE"), makeKeyword("BACKGROUND-COLOR"), makeKeyword("CLASS"), makeKeyword("TEXT-COLOR"), makeKeyword("LINK-COLOR"), makeKeyword("ACTIVE-LINK-COLOR"), makeKeyword("VISITED-LINK-COLOR"), makeKeyword("SCRIPT"), makeKeyword("ONLOAD"), makeKeyword("ONRESIZE"), makeKeyword("STYLE") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");













    private static final SubLSymbol $ACTIVE_LINK_COLOR = makeKeyword("ACTIVE-LINK-COLOR");

    private static final SubLSymbol $VISITED_LINK_COLOR = makeKeyword("VISITED-LINK-COLOR");









    private static final SubLSymbol HTML_QUOTED_ATTRIBUTE = makeSymbol("HTML-QUOTED-ATTRIBUTE");

    public static final SubLList $list375 = list(makeSymbol("*HTML-BODY-BACKGROUND*"));

    public static final SubLList $list376 = list(makeSymbol("*HTML-BODY-ONLOAD*"));

    private static final SubLList $list377 = list(makeSymbol("*HTML-BODY-ONRESIZE*"));





    public static final SubLList $list380 = list(makeSymbol("*HTML-BODY-BGCOLOR*"));

    private static final SubLSymbol HTML_COLOR = makeSymbol("HTML-COLOR");

    public static final SubLList $list382 = list(makeSymbol("*HTML-BODY-CLASS*"));

    private static final SubLList $list383 = list(makeSymbol("*HTML-BODY-STYLE*"));

    private static final SubLList $list384 = list(makeSymbol("*HTML-BODY-TEXT*"));

    public static final SubLList $list385 = list(makeSymbol("*HTML-BODY-LINK*"));

    public static final SubLList $list386 = list(makeSymbol("*HTML-BODY-ALINK*"));

    public static final SubLList $list387 = list(makeSymbol("*HTML-BODY-VLINK*"));

    private static final SubLList $list388 = list(makeSymbol("HTML-CHAR"), CHAR_space);

    private static final SubLList $list389 = list(list(makeSymbol("*HTML-INSIDE-BODY?*"), T));

    private static final SubLSymbol HTML_MARKUP_WRAPPER = makeSymbol("HTML-MARKUP-WRAPPER");

    public static final SubLList $list391 = list(makeSymbol("*HTML-BODY-HEAD*"), makeSymbol("*HTML-BODY-TAIL*"));

    private static final SubLSymbol HTML_MARKUP_BODY = makeSymbol("HTML-MARKUP-BODY");

    public static final SubLList $list393 = list(makeSymbol("HTML-SOURCE-READABILITY-TERPRI"));

    public static final SubLList $list394 = list(list(makeSymbol("HTML-COPYRIGHT-NOTICE")));

    private static final SubLList $list395 = list(list(makeSymbol("HTML-SOURCE-READABILITY-TERPRI")));

    private static final SubLList $list396 = list(list(makeSymbol("COLOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym397$COLOR_VALUE = makeUninternedSymbol("COLOR-VALUE");



    private static final SubLSymbol HTML_COLORED_BODY = makeSymbol("HTML-COLORED-BODY");

    public static final SubLList $list400 = list(makeSymbol("*HTML-DEFAULT-BGCOLOR*"));

    public static final SubLList $list401 = list(makeSymbol("*HTML-HEAD-HEAD*"), makeSymbol("*HTML-HEAD-TAIL*"));

    public static final SubLList $list402 = list(makeSymbol("HTML-HEAD-CONTENT-TYPE"));

    private static final SubLSymbol HTML_HEAD_CONTENT_TYPE = makeSymbol("HTML-HEAD-CONTENT-TYPE");

    private static final SubLSymbol HTML_HEAD = makeSymbol("HTML-HEAD");

    public static final SubLList $list405 = list(makeSymbol("HTML-MARKUP"), makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"));

    public static final SubLList $list406 = list(makeSymbol("PWHEN"), makeSymbol("*HTML-FORCE-IE-STANDARDS-MODE*"), list(makeSymbol("HTML-SOURCE-READABILITY-TERPRI")), list(makeSymbol("HTML-MARKUP"), makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >")));

    private static final SubLSymbol WITH_POSSIBLY_NEW_HTML_FILE_DEPENDENCY_SPACE = makeSymbol("WITH-POSSIBLY-NEW-HTML-FILE-DEPENDENCY-SPACE");

    public static final SubLList $list408 = list(makeSymbol("*HTML-HTML-HEAD*"), makeSymbol("*HTML-HTML-TAIL*"));

    private static final SubLList $list409 = list(list(makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("CLASS"), makeSymbol("STYLE"), makeSymbol("ALIGN"), makeSymbol("ONLOAD"), makeSymbol("TITLE"), makeSymbol("MISC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list410 = list(makeKeyword("ID"), makeKeyword("CLASS"), makeKeyword("STYLE"), makeKeyword("ALIGN"), makeKeyword("ONLOAD"), makeKeyword("TITLE"), makeKeyword("MISC"));









    public static final SubLList $list415 = list(makeSymbol("*HTML-ATTRIBUTE-ID*"));

    public static final SubLList $list416 = list(makeSymbol("*HTML-ATTRIBUTE-CLASS*"));

    public static final SubLList $list417 = list(makeSymbol("*HTML-DIV-STYLE*"));

    public static final SubLList $list418 = list(makeSymbol("*HTML-DIV-TITLE*"));

    public static final SubLList $list419 = list(makeSymbol("*HTML-DIV-ALIGN*"));

    public static final SubLList $list420 = list(makeSymbol("*HTML-DIV-ONLOAD*"));

    private static final SubLSymbol $sym421$ATTRIBUTE = makeUninternedSymbol("ATTRIBUTE");

    private static final SubLSymbol $sym422$VALUE = makeUninternedSymbol("VALUE");



    public static final SubLList $list424 = list(makeSymbol("*HTML-DIV-HEAD*"), makeSymbol("*HTML-DIV-TAIL*"));

    private static final SubLSymbol HTML_FANCY_SPAN = makeSymbol("HTML-FANCY-SPAN");

    private static final SubLList $list426 = list(makeKeyword("STYLE"), makeSymbol("*HTML-STYLE-FONT-SIZE-SMALLER*"));

    private static final SubLList $list427 = list(makeKeyword("STYLE"), makeSymbol("*HTML-STYLE-FONT-SIZE-LARGER*"));

    private static final SubLList $list428 = list(list(makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("ONCLICK"), makeSymbol("CLASS"), makeSymbol("STYLE"), makeSymbol("TITLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list429 = list(makeKeyword("ID"), makeKeyword("ONCLICK"), makeKeyword("CLASS"), makeKeyword("STYLE"), makeKeyword("TITLE"));



    public static final SubLList $list431 = list(makeSymbol("*HTML-EVENT-ATTRIBUTE-ONCLICK*"));

    public static final SubLList $list432 = list(makeSymbol("*HTML-ATTRIBUTE-TITLE*"));

    public static final SubLList $list433 = list(makeSymbol("*HTML-SPAN-STYLE*"));

    public static final SubLList $list434 = list(makeSymbol("*HTML-SPAN-HEAD*"), makeSymbol("*HTML-SPAN-TAIL*"));

    private static final SubLList $list435 = list(makeSymbol("*HTML-META-HEAD*"));

    public static final SubLList $list436 = list(list(makeSymbol("&KEY"), makeSymbol("HTTP-EQUIV"), makeSymbol("CONTENT"), makeSymbol("NAME"), makeSymbol("SCHEME"), makeSymbol("LANG"), makeSymbol("DIR")));

    public static final SubLList $list437 = list(makeKeyword("HTTP-EQUIV"), makeKeyword("CONTENT"), makeKeyword("NAME"), makeKeyword("SCHEME"), makeKeyword("LANG"), makeKeyword("DIR"));













    public static final SubLList $list444 = list(makeSymbol("*HTML-META-CONTENT*"));

    public static final SubLList $list445 = list(makeSymbol("*HTML-META-NAME*"));

    public static final SubLList $list446 = list(makeSymbol("*HTML-META-SCHEME*"));

    private static final SubLList $list447 = list(makeSymbol("*HTML-META-LANG*"));

    private static final SubLList $list448 = list(makeSymbol("*HTML-META-DIR*"));

    private static final SubLList $list449 = list(makeSymbol("*HTML-META-HTTP-EQUIV*"));

    private static final SubLSymbol HTML_META = makeSymbol("HTML-META");

    public static final SubLList $list451 = list(makeSymbol("*HTML-LINK-HEAD*"));

    public static final SubLList $list452 = list(list(makeSymbol("&KEY"), makeSymbol("REL"), makeSymbol("TYPE"), makeSymbol("HREF"), makeSymbol("MEDIA"), makeSymbol("TITLE"), makeSymbol("ID")));

    public static final SubLList $list453 = list(makeKeyword("REL"), makeKeyword("TYPE"), makeKeyword("HREF"), makeKeyword("MEDIA"), makeKeyword("TITLE"), makeKeyword("ID"));









    private static final SubLList $list458 = list(makeSymbol("*HTML-LINK-MEDIA*"));

    private static final SubLList $list459 = list(makeSymbol("*HTML-LINK-TITLE*"));

    public static final SubLList $list460 = list(makeSymbol("*HTML-LINK-TYPE*"));

    public static final SubLList $list461 = list(makeSymbol("*HTML-LINK-HREF*"));

    private static final SubLList $list462 = list(makeSymbol("*HTML-LINK-REL*"));

    private static final SubLSymbol HTML_LINK = makeSymbol("HTML-LINK");

    private static final SubLList $list464 = list(makeSymbol("*HTML-BASE-HEAD*"));

    private static final SubLList $list465 = list(list(makeSymbol("&KEY"), makeSymbol("HREF")));

    private static final SubLList $list466 = list(makeKeyword("HREF"));

    private static final SubLList $list467 = list(makeSymbol("*HTML-BASE-HREF*"));

    private static final SubLSymbol HTML_BASE = makeSymbol("HTML-BASE");

    private static final SubLString $$$all = makeString("all");

    private static final SubLString $$$stylesheet = makeString("stylesheet");

    private static final SubLString $str471$text_css = makeString("text/css");

    public static final SubLList $list472 = list(makeSymbol("*HTML-STYLE-HEAD*"), makeSymbol("*HTML-STYLE-TAIL*"));

    public static final SubLList $list473 = list(makeSymbol("*HTML-TITLE-HEAD*"), makeSymbol("*HTML-TITLE-TAIL*"));

    public static final SubLList $list474 = list(list(makeSymbol("TITLE"), makeSymbol("&OPTIONAL"), list(makeSymbol("COLOR"), list(makeSymbol("QUOTE"), makeSymbol("*HTML-DEFAULT-BGCOLOR*")))), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol HTML_TITLE = makeSymbol("HTML-TITLE");



    private static final SubLSymbol HTML_HEADING = makeSymbol("HTML-HEADING");

    public static final SubLList $list479 = list(TWO_INTEGER);

    public static final SubLList $list480 = list(list(makeSymbol("TITLE"), makeSymbol("&KEY"), makeSymbol("COMPLETION?"), list(makeSymbol("COLOR"), list(makeSymbol("QUOTE"), makeSymbol("*HTML-DEFAULT-BGCOLOR*")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list481 = list(makeKeyword("COMPLETION?"), makeKeyword("COLOR"));





    public static final SubLList $list484 = list(list(makeSymbol("HTML-COMPLETE-SCRIPT")));

    public static final SubLList $list485 = list(makeSymbol("*HTML-BLOCKQUOTE-HEAD*"), makeSymbol("*HTML-BLOCKQUOTE-TAIL*"));

    public static final SubLList $list486 = list(makeSymbol("*HTML-CENTER-HEAD*"), makeSymbol("*HTML-CENTER-TAIL*"));

    public static final SubLList $list487 = list(list(makeSymbol("LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list488 = list(makeSymbol("*HTML-HEADING-HEAD*"));

    public static final SubLList $list489 = list(makeSymbol("*HTML-HEADING-TAIL*"));

    public static final SubLList $list490 = list(makeSymbol("*HTML-PARAGRAPH-HEAD*"), makeSymbol("*HTML-PARAGRAPH-TAIL*"));

    public static final SubLList $list491 = list(makeSymbol("*HTML-PLAINTEXT-HEAD*"), makeSymbol("*HTML-PLAINTEXT-TAIL*"));

    private static final SubLString $str492$HTML_UNPRE_used_when_not_within_H = makeString("HTML-UNPRE used when not within HTML-PRE");

    private static final SubLString $str493$Nested_calls_to_HTML_PRE_will_con = makeString("Nested calls to HTML-PRE will confuse most browsers.");

    public static final SubLList $list494 = list(makeSymbol("VERIFY-NOT-WITHIN-HTML-PRE"));

    public static final SubLList $list495 = list(makeSymbol("*HTML-PREFORMATTED-HEAD*"), makeSymbol("*HTML-PREFORMATTED-TAIL*"));

    private static final SubLList $list496 = list(list(makeSymbol("*WITHIN-HTML-PRE*"), T));

    private static final SubLList $list497 = list(makeSymbol("VERIFY-WITHIN-HTML-PRE"));

    public static final SubLList $list498 = list(makeSymbol("*HTML-PREFORMATTED-TAIL*"), makeSymbol("*HTML-PREFORMATTED-HEAD*"));

    public static final SubLList $list499 = list(list(makeSymbol("*WITHIN-HTML-PRE*"), NIL));

    public static final SubLList $list500 = list(makeSymbol("*HTML-ADDRESS-HEAD*"), makeSymbol("*HTML-ADDRESS-TAIL*"));

    public static final SubLList $list501 = list(makeSymbol("*HTML-BIG-HEAD*"), makeSymbol("*HTML-BIG-TAIL*"));

    public static final SubLList $list502 = list(makeSymbol("*HTML-BOLD-HEAD*"), makeSymbol("*HTML-BOLD-TAIL*"));

    private static final SubLSymbol HTML_BOLD = makeSymbol("HTML-BOLD");

    private static final SubLList $list504 = list(makeSymbol("*HTML-CITE-HEAD*"), makeSymbol("*HTML-CITE-TAIL*"));

    private static final SubLList $list505 = list(makeSymbol("*HTML-CODE-HEAD*"), makeSymbol("*HTML-CODE-TAIL*"));

    private static final SubLList $list506 = list(makeSymbol("*HTML-DEFINITION-HEAD*"), makeSymbol("*HTML-DEFINITION-TAIL*"));

    public static final SubLList $list507 = list(makeSymbol("*HTML-EMPHASIZED-HEAD*"), makeSymbol("*HTML-EMPHASIZED-TAIL*"));

    private static final SubLSymbol HTML_EMPHASIZED = makeSymbol("HTML-EMPHASIZED");

    public static final SubLList $list509 = list(list(makeSymbol("&KEY"), makeSymbol("SIZE"), makeSymbol("COLOR"), makeSymbol("FACE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list510 = list(makeKeyword("SIZE"), makeKeyword("COLOR"), makeKeyword("FACE"));





    public static final SubLList $list513 = list(makeSymbol("*HTML-FONT-SIZE*"));

    public static final SubLList $list514 = list(makeSymbol("*HTML-FONT-COLOR*"));

    public static final SubLList $list515 = list(makeSymbol("*HTML-FONT-FACE*"));

    public static final SubLList $list516 = list(makeSymbol("*HTML-FONT-HEAD*"), makeSymbol("*HTML-FONT-TAIL*"));

    private static final SubLList $list517 = list(list(makeSymbol("SIZE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym518$SIZE_VAL = makeUninternedSymbol("SIZE-VAL");

    private static final SubLSymbol HTML_FANCY_FONT = makeSymbol("HTML-FANCY-FONT");

    private static final SubLSymbol $sym520$COLOR_VAL = makeUninternedSymbol("COLOR-VAL");

    private static final SubLSymbol HTML_STYLE_BACKGROUND_COLOR = makeSymbol("HTML-STYLE-BACKGROUND-COLOR");

    public static final SubLList $list522 = list(makeSymbol("*HTML-ITALIC-HEAD*"), makeSymbol("*HTML-ITALIC-TAIL*"));

    private static final SubLSymbol HTML_ITALIC = makeSymbol("HTML-ITALIC");

    private static final SubLList $list524 = list(makeSymbol("*HTML-KEYBOARD-HEAD*"), makeSymbol("*HTML-KEYBOARD-TAIL*"));

    public static final SubLList $list525 = list(makeSymbol("*HTML-SAMPLE-HEAD*"), makeSymbol("*HTML-SAMPLE-TAIL*"));

    public static final SubLList $list526 = list(makeSymbol("*HTML-SMALL-HEAD*"), makeSymbol("*HTML-SMALL-TAIL*"));

    public static final SubLList $list527 = list(makeSymbol("*HTML-STRIKETHROUGH-HEAD*"), makeSymbol("*HTML-STRIKETHROUGH-TAIL*"));

    public static final SubLList $list528 = list(makeSymbol("*HTML-STRONG-HEAD*"), makeSymbol("*HTML-STRONG-TAIL*"));

    public static final SubLList $list529 = list(makeSymbol("*HTML-SUBSCRIPT-HEAD*"), makeSymbol("*HTML-SUBSCRIPT-TAIL*"));

    public static final SubLList $list530 = list(makeSymbol("*HTML-SUPERSCRIPT-HEAD*"), makeSymbol("*HTML-SUPERSCRIPT-TAIL*"));

    public static final SubLList $list531 = list(makeSymbol("*HTML-TELETYPE-HEAD*"), makeSymbol("*HTML-TELETYPE-TAIL*"));

    private static final SubLSymbol HTML_TELETYPE = makeSymbol("HTML-TELETYPE");

    public static final SubLList $list533 = list(makeSymbol("*HTML-UNDERLINED-HEAD*"), makeSymbol("*HTML-UNDERLINED-TAIL*"));

    private static final SubLSymbol HTML_UNDERLINED = makeSymbol("HTML-UNDERLINED");

    public static final SubLList $list535 = list(makeSymbol("*HTML-VARIABLE-HEAD*"), makeSymbol("*HTML-VARIABLE-TAIL*"));

    private static final SubLList $list536 = list(list(makeSymbol("&KEY"), makeSymbol("ACCESS-KEY"), makeSymbol("FOR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list537 = list(makeKeyword("ACCESS-KEY"), makeKeyword("FOR"));





    public static final SubLList $list540 = list(makeSymbol("*HTML-LABEL-ACCESS-KEY*"));

    public static final SubLList $list541 = list(makeSymbol("*HTML-LABEL-FOR*"));

    public static final SubLList $list542 = list(makeSymbol("*HTML-LABEL-HEAD*"), makeSymbol("*HTML-LABEL-TAIL*"));

    public static final SubLList $list543 = list(makeSymbol("*HTML-DEFINITION-LIST-HEAD*"), makeSymbol("*HTML-DEFINITION-LIST-TAIL*"));

    public static final SubLList $list544 = list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-LIST-COMPACT*"));

    public static final SubLList $list545 = list(makeSymbol("*HTML-DEFINITION-LIST-TERM-HEAD*"), makeSymbol("*HTML-DEFINITION-LIST-TERM-TAIL*"));

    private static final SubLList $list546 = list(makeSymbol("*HTML-DEFINITION-LIST-DEF-HEAD*"), makeSymbol("*HTML-DEFINITION-LIST-DEF-TAIL*"));

    private static final SubLList $list547 = list(makeSymbol("*HTML-DIRECTORY-LIST-HEAD*"), makeSymbol("*HTML-DIRECTORY-LIST-TAIL*"));

    public static final SubLList $list548 = list(makeSymbol("*HTML-MENU-LIST-HEAD*"), makeSymbol("*HTML-MENU-LIST-TAIL*"));

    public static final SubLList $list549 = list(list(makeSymbol("&KEY"), makeSymbol("COMPACT"), makeSymbol("CONTINUE"), makeSymbol("TYPE"), makeSymbol("START"), makeSymbol("SEQNUM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list550 = list(makeKeyword("COMPACT"), makeKeyword("CONTINUE"), makeKeyword("TYPE"), makeKeyword("START"), makeKeyword("SEQNUM"));









    public static final SubLList $list555 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-LIST-COMPACT*")));

    public static final SubLList $list556 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-LIST-CONTINUE*")));

    private static final SubLList $list557 = list(makeSymbol("*HTML-LIST-TYPE*"));

    private static final SubLList $list558 = list(makeSymbol("*HTML-LIST-START*"));

    public static final SubLList $list559 = list(makeSymbol("*HTML-LIST-SEQNUM*"));

    public static final SubLList $list560 = list(makeSymbol("*HTML-ORDERED-LIST-HEAD*"), makeSymbol("*HTML-ORDERED-LIST-TAIL*"));

    private static final SubLSymbol HTML_FANCY_ORDERED_LIST = makeSymbol("HTML-FANCY-ORDERED-LIST");

    private static final SubLSymbol HTML_ORDERED_LIST = makeSymbol("HTML-ORDERED-LIST");

    public static final SubLList $list563 = list(list(makeSymbol("&KEY"), makeSymbol("COMPACT"), makeSymbol("PLAIN"), makeSymbol("TYPE"), makeSymbol("SRC"), makeSymbol("DINGBAT"), makeSymbol("CLASS"), makeSymbol("ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list564 = list(makeKeyword("COMPACT"), makeKeyword("PLAIN"), makeKeyword("TYPE"), makeKeyword("SRC"), makeKeyword("DINGBAT"), makeKeyword("CLASS"), makeKeyword("ID"));







    private static final SubLList $list568 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-LIST-PLAIN*")));

    public static final SubLList $list569 = list(makeSymbol("*HTML-LIST-SRC*"));

    public static final SubLList $list570 = list(makeSymbol("*HTML-LIST-DINGBAT*"));

    private static final SubLList $list571 = list(makeSymbol("*HTML-UNORDERED-LIST-HEAD*"), makeSymbol("*HTML-UNORDERED-LIST-TAIL*"));

    private static final SubLSymbol HTML_FANCY_UNORDERED_LIST = makeSymbol("HTML-FANCY-UNORDERED-LIST");

    private static final SubLSymbol HTML_UNORDERED_LIST = makeSymbol("HTML-UNORDERED-LIST");

    private static final SubLList $list574 = list(makeKeyword("PLAIN"), T);

    private static final SubLList $list575 = list(list(makeSymbol("&KEY"), makeSymbol("SKIP"), makeSymbol("TYPE"), makeSymbol("SRC"), makeSymbol("DINGBAT"), makeSymbol("CLASS"), makeSymbol("ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list576 = list(makeKeyword("SKIP"), makeKeyword("TYPE"), makeKeyword("SRC"), makeKeyword("DINGBAT"), makeKeyword("CLASS"), makeKeyword("ID"));



    public static final SubLList $list578 = list(makeSymbol("*HTML-LIST-ITEM-SKIP*"));

    public static final SubLList $list579 = list(makeSymbol("*HTML-LIST-ITEM-TYPE*"));

    public static final SubLList $list580 = list(makeSymbol("*HTML-LIST-ITEM-SRC*"));

    public static final SubLList $list581 = list(makeSymbol("*HTML-LIST-ITEM-ID*"));

    private static final SubLList $list582 = list(makeSymbol("*HTML-LIST-ITEM-DINGBAT*"));

    public static final SubLList $list583 = list(makeSymbol("*HTML-LIST-ITEM-HEAD*"), makeSymbol("*HTML-LIST-ITEM-TAIL*"));

    private static final SubLSymbol HTML_FANCY_LIST_ITEM = makeSymbol("HTML-FANCY-LIST-ITEM");

    public static final SubLList $list585 = list(list(makeSymbol("&KEY"), makeSymbol("CLASS"), makeSymbol("ID")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list586 = list(makeKeyword("CLASS"), makeKeyword("ID"));

    public static final SubLList $list587 = list(makeSymbol("*HTML-SUMMARY-HEAD*"), makeSymbol("*HTML-SUMMARY-TAIL*"));

    public static final SubLList $list588 = list(makeSymbol("*HTML-DETAILS-HEAD*"), makeSymbol("*HTML-DETAILS-TAIL*"));

    public static final SubLList $list589 = list(makeSymbol("CODE"), list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("CODEBASE"), makeSymbol("ARCHIVE"), makeSymbol("ALT"), makeSymbol("NAME"), makeSymbol("ALIGN"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ID") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list590 = list(makeKeyword("CODEBASE"), makeKeyword("ARCHIVE"), makeKeyword("ALT"), makeKeyword("NAME"), makeKeyword("ALIGN"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ID"));











    private static final SubLList $list596 = list(makeSymbol("*HTML-APPLET-CODE*"));

    private static final SubLList $list597 = list(makeSymbol("*HTML-APPLET-CODEBASE*"));

    private static final SubLList $list598 = list(makeSymbol("*HTML-APPLET-ARCHIVE*"));

    public static final SubLList $list599 = list(makeSymbol("*HTML-APPLET-ALT*"));

    public static final SubLList $list600 = list(makeSymbol("*HTML-APPLET-ALIGN*"));

    private static final SubLSymbol HTML_ALIGN = makeSymbol("HTML-ALIGN");

    private static final SubLList $list602 = list(makeSymbol("*HTML-APPLET-NAME*"));

    private static final SubLList $list603 = list(makeSymbol("*HTML-APPLET-ID*"));

    private static final SubLList $list604 = list(makeSymbol("*HTML-APPLET-HEIGHT*"));

    private static final SubLList $list605 = list(makeSymbol("*HTML-APPLET-WIDTH*"));

    private static final SubLList $list606 = list(makeSymbol("*HTML-APPLET-HEAD*"), makeSymbol("*HTML-APPLET-TAIL*"));

    private static final SubLList $list607 = list(makeSymbol("NAME"), makeSymbol("VALUE"));

    public static final SubLList $list608 = list(makeSymbol("*HTML-PARAM-HEAD*"));

    public static final SubLList $list609 = list(makeSymbol("*HTML-PARAM-NAME*"));

    public static final SubLList $list610 = list(makeSymbol("*HTML-PARAM-VALUE*"));







    private static final SubLSymbol HTML_PRIN1 = makeSymbol("HTML-PRIN1");

    public static final SubLList $list615 = list(list(makeSymbol("*HTML-ID-SPACE-ID-GENERATOR*"), list(makeSymbol("FIF"), list(makeSymbol("INTEGER-SEQUENCE-GENERATOR-P"), makeSymbol("*HTML-ID-SPACE-ID-GENERATOR*")), makeSymbol("*HTML-ID-SPACE-ID-GENERATOR*"), list(makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR")))));

    public static final SubLSymbol $html_form_field_uniquifier_code$ = makeSymbol("*HTML-FORM-FIELD-UNIQUIFIER-CODE*");

    private static final SubLSymbol WITH_HTML_UNIQUE_FORM_FIELDS = makeSymbol("WITH-HTML-UNIQUE-FORM-FIELDS");

    private static final SubLSymbol HTML_FANCY_FORM = makeSymbol("HTML-FANCY-FORM");

    private static final SubLList $list619 = list(list(makeSymbol("*HTML-FORM-FIELD-UNIQUIFIER-CODE*"), list(makeSymbol("NEXT-HTML-FORM-FIELD-UNIQUIFIER-CODE"))));

    private static final SubLList $list620 = list(list(makeSymbol("EMBED-FORM-FIELD-CODE"), makeSymbol("*HTML-FORM-FIELD-UNIQUIFIER-CODE*")));

    private static final SubLList $list621 = list(list(makeSymbol("ARGS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol GET_FORM_FIELD_CODE = makeSymbol("GET-FORM-FIELD-CODE");

    private static final SubLSymbol NEXT_HTML_FORM_FIELD_UNIQUIFIER_CODE = makeSymbol("NEXT-HTML-FORM-FIELD-UNIQUIFIER-CODE");

    private static final SubLSymbol $html_form_field_uniquifier_isg$ = makeSymbol("*HTML-FORM-FIELD-UNIQUIFIER-ISG*");

    private static final SubLSymbol EMBED_FORM_FIELD_CODE = makeSymbol("EMBED-FORM-FIELD-CODE");

    private static final SubLString $str626$uniquifier_code = makeString("uniquifier-code");

    private static final SubLSymbol WITH_HTML_UNIQUE_FORM_FIELD_DECODING = makeSymbol("WITH-HTML-UNIQUE-FORM-FIELD-DECODING");

    private static final SubLList $list628 = list(list(makeSymbol("ACTION"), makeSymbol("&OPTIONAL"), makeSymbol("METHOD"), makeSymbol("TARGET"), makeSymbol("NAME"), makeSymbol("SCRIPT"), makeSymbol("FORM-ID"), makeSymbol("ENCTYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list629 = list(makeSymbol("*HTML-FORM-ACTION*"));

    private static final SubLList $list630 = list(makeSymbol("*HTML-FORM-ENCTYPE*"));

    public static final SubLList $list631 = list(makeSymbol("*HTML-FORM-METHOD*"));

    public static final SubLList $list632 = list(makeSymbol("*HTML-FORM-NAME*"));

    public static final SubLList $list633 = list(makeSymbol("*HTML-FORM-TARGET*"));

    public static final SubLList $list634 = list(makeSymbol("*HTML-FORM-HEAD*"), makeSymbol("*HTML-FORM-TAIL*"));

    public static final SubLList $list635 = list(list(makeSymbol("*WITHIN-HTML-FORM*"), T));

    public static final SubLList $list636 = list(new SubLObject[]{ makeSymbol("TYPE"), makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("NAME"), makeSymbol("VALUE"), makeSymbol("CHECKED"), makeSymbol("DISABLED?"), makeSymbol("READONLY"), makeSymbol("SIZE"), makeSymbol("MAXLENGTH"), makeSymbol("SRC"), makeSymbol("ALIGN"), makeSymbol("BORDER"), makeSymbol("MIN"), makeSymbol("MAX"), makeSymbol("STEP"), makeSymbol("SCRIPT"), makeSymbol("STYLE"), makeSymbol("ONCHANGE"), makeSymbol("ONCLICK"), makeSymbol("ONBLUR"), makeSymbol("ONFOCUS"), makeSymbol("ONKEYUP"), makeSymbol("ONKEYDOWN"), makeSymbol("ONKEYPRESS"), makeSymbol("ALT"), makeSymbol("CLASS"), makeSymbol("TITLE") });

    public static final SubLList $list637 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("NAME"), makeKeyword("VALUE"), makeKeyword("CHECKED"), makeKeyword("DISABLED?"), makeKeyword("READONLY"), makeKeyword("SIZE"), makeKeyword("MAXLENGTH"), makeKeyword("SRC"), makeKeyword("ALIGN"), makeKeyword("BORDER"), makeKeyword("MIN"), makeKeyword("MAX"), makeKeyword("STEP"), makeKeyword("SCRIPT"), makeKeyword("STYLE"), makeKeyword("ONCHANGE"), makeKeyword("ONCLICK"), makeKeyword("ONBLUR"), makeKeyword("ONFOCUS"), makeKeyword("ONKEYUP"), makeKeyword("ONKEYDOWN"), makeKeyword("ONKEYPRESS"), makeKeyword("ALT"), makeKeyword("CLASS"), makeKeyword("TITLE") });































    public static final SubLList $list653 = list(makeSymbol("*HTML-INPUT-TYPE*"));

    private static final SubLList $list654 = list(makeSymbol("*HTML-INPUT-STYLE*"));

    private static final SubLList $list655 = list(makeSymbol("*HTML-INPUT-NAME*"));

    public static final SubLList $list656 = list(makeSymbol("*HTML-INPUT-ALT*"));

    private static final SubLList $list657 = list(makeSymbol("*HTML-INPUT-VALUE*"));

    public static final SubLList $list658 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-INPUT-CHECKED*")));

    public static final SubLList $list659 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-INPUT-READONLY*")));

    private static final SubLList $list660 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-INPUT-DISABLED*")));

    public static final SubLList $list661 = list(makeSymbol("*HTML-INPUT-SIZE*"));

    public static final SubLList $list662 = list(makeSymbol("*HTML-INPUT-MAXLENGTH*"));

    private static final SubLList $list663 = list(makeSymbol("*HTML-INPUT-SRC*"));

    public static final SubLList $list664 = list(makeSymbol("*HTML-INPUT-ALIGN*"));

    public static final SubLList $list665 = list(makeSymbol("*HTML-INPUT-BORDER*"));

    public static final SubLList $list666 = list(makeSymbol("*HTML-INPUT-MIN*"));

    public static final SubLList $list667 = list(makeSymbol("*HTML-INPUT-MAX*"));

    public static final SubLList $list668 = list(makeSymbol("*HTML-INPUT-STEP*"));

    public static final SubLList $list669 = list(makeSymbol("*HTML-SELECT-ONCHANGE*"));

    private static final SubLList $list670 = list(makeSymbol("*HTML-EVENT-ATTRIBUTE-ONBLUR*"));

    private static final SubLList $list671 = list(makeSymbol("*HTML-EVENT-ATTRIBUTE-ONFOCUS*"));

    private static final SubLList $list672 = list(makeSymbol("*HTML-EVENT-ATTRIBUTE-ONKEYUP*"));

    public static final SubLList $list673 = list(makeSymbol("*HTML-EVENT-ATTRIBUTE-ONKEYDOWN*"));

    public static final SubLList $list674 = list(makeSymbol("*HTML-EVENT-ATTRIBUTE-ONKEYPRESS*"));

    public static final SubLList $list675 = list(makeSymbol("PWHEN"), makeSymbol("*HTML-INPUT-DISABLED?*"), list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-INPUT-DISABLED*")));

    public static final SubLList $list676 = list(makeSymbol("*HTML-INPUT-HEAD*"));

    public static final SubLList $list677 = list(list(makeSymbol("VALUE"), makeSymbol("&KEY"), makeSymbol("STYLE"), makeSymbol("CLASS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list678 = list(makeKeyword("STYLE"), makeKeyword("CLASS"));

    private static final SubLSymbol HTML_FANCY_INPUT = makeSymbol("HTML-FANCY-INPUT");

    public static final SubLSymbol $html_input_button$ = makeSymbol("*HTML-INPUT-BUTTON*");

    private static final SubLList $list681 = list(list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("VALUE"), makeSymbol("CHECKED?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $html_input_radio$ = makeSymbol("*HTML-INPUT-RADIO*");

    public static final SubLList $list683 = list(list(makeSymbol("VALUE"), makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("STYLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list684 = list(makeKeyword("ID"), makeKeyword("STYLE"));

    public static final SubLSymbol $html_input_submit$ = makeSymbol("*HTML-INPUT-SUBMIT*");

    public static final SubLList $list686 = list(list(makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("MULTIPLE"), makeSymbol("SIZE"), makeSymbol("SCRIPT"), makeSymbol("ONCHANGE"), makeSymbol("DISABLED?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list687 = list(makeKeyword("MULTIPLE"), makeKeyword("SIZE"), makeKeyword("SCRIPT"), makeKeyword("ONCHANGE"), makeKeyword("DISABLED?"));



    public static final SubLList $list689 = list(makeSymbol("*HTML-SELECT-NAME*"));

    public static final SubLList $list690 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-SELECT-MULTIPLE*")));

    public static final SubLList $list691 = list(makeSymbol("*HTML-SELECT-SIZE*"));

    public static final SubLList $list692 = list(makeSymbol("*HTML-SELECT-HEAD*"), makeSymbol("*HTML-SELECT-TAIL*"));

    public static final SubLList $list693 = list(list(makeSymbol("&KEY"), makeSymbol("SELECTED"), makeSymbol("VALUE"), makeSymbol("ONMOUSEOVER"), makeSymbol("ONMOUSEOUT"), makeSymbol("SCRIPT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list694 = list(makeKeyword("SELECTED"), makeKeyword("VALUE"), makeKeyword("ONMOUSEOVER"), makeKeyword("ONMOUSEOUT"), makeKeyword("SCRIPT"));







    private static final SubLList $list698 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-OPTION-SELECTED*")));

    private static final SubLList $list699 = list(makeSymbol("*HTML-OPTION-VALUE*"));

    private static final SubLList $list700 = list(makeSymbol("*HTML-ANCHOR-ONMOUSEOUT*"));

    private static final SubLList $list701 = list(makeSymbol("*HTML-ANCHOR-ONMOUSEOVER*"));

    private static final SubLList $list702 = list(makeSymbol("*HTML-OPTION-HEAD*"), makeSymbol("*HTML-OPTION-TAIL*"));

    public static final SubLList $list703 = list(list(makeSymbol("&KEY"), makeSymbol("LABEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list704 = list(makeKeyword("LABEL"));



    public static final SubLList $list706 = list(makeSymbol("*HTML-OPTGROUP-LABEL*"));

    public static final SubLList $list707 = list(makeSymbol("*HTML-OPTGROUP-HEAD*"), makeSymbol("*HTML-OPTGROUP-TAIL*"));

    public static final SubLList $list708 = list(list(makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("COLS"), makeSymbol("ROWS"), makeSymbol("WRAP"), makeSymbol("STYLE"), makeSymbol("CLASS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list709 = list(makeKeyword("ID"), makeKeyword("COLS"), makeKeyword("ROWS"), makeKeyword("WRAP"), makeKeyword("STYLE"), makeKeyword("CLASS"));







    public static final SubLList $list713 = list(makeSymbol("*HTML-TEXTAREA-NAME*"));

    public static final SubLList $list714 = list(makeSymbol("*HTML-TEXTAREA-COLS*"));

    public static final SubLList $list715 = list(makeSymbol("*HTML-TEXTAREA-ID*"));

    private static final SubLList $list716 = list(makeSymbol("*HTML-TEXTAREA-ROWS*"));

    public static final SubLList $list717 = list(list(makeSymbol("HTML-QUOTED-ATTRIBUTE"), list(makeSymbol("*HTML-TABLE-WRAP*")), list(makeSymbol("HTML-MARKUP"), makeString("virtual"))));

    public static final SubLList $list718 = list(makeSymbol("*HTML-TEXTAREA-STYLE*"));

    private static final SubLList $list719 = list(makeSymbol("*HTML-TEXTAREA-HEAD*"), makeSymbol("*HTML-TEXTAREA-TAIL*"));

    private static final SubLList $list720 = list(list(makeSymbol("&OPTIONAL"), makeSymbol("ALIGN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list721 = list(makeSymbol("*HTML-CAPTION-HEAD*"), makeSymbol("*HTML-CAPTION-TAIL*"));

    public static final SubLList $list722 = list(makeSymbol("*HTML-CAPTION-ALIGN*"));

    public static final SubLList $list723 = list(list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("ID"), makeSymbol("NOFLOW"), makeSymbol("NOWRAP"), makeSymbol("ALIGN"), makeSymbol("BORDER"), makeSymbol("BORDERCOLOR"), makeSymbol("CELLPADDING"), makeSymbol("STYLE"), makeSymbol("CELLSPACING"), makeSymbol("COLSPEC"), makeSymbol("UNITS"), makeSymbol("BGCOLOR"), makeSymbol("WIDTH"), makeSymbol("BACKGROUND"), makeSymbol("CLASS") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list724 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("NOFLOW"), makeKeyword("NOWRAP"), makeKeyword("ALIGN"), makeKeyword("BORDER"), makeKeyword("BORDERCOLOR"), makeKeyword("CELLPADDING"), makeKeyword("STYLE"), makeKeyword("CELLSPACING"), makeKeyword("COLSPEC"), makeKeyword("UNITS"), makeKeyword("BGCOLOR"), makeKeyword("WIDTH"), makeKeyword("BACKGROUND"), makeKeyword("CLASS") });



















    public static final SubLList $list734 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-TABLE-NOFLOW*")));

    private static final SubLList $list735 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-TABLE-NOWRAP*")));

    public static final SubLList $list736 = list(makeSymbol("*HTML-TABLE-ALIGN*"));

    public static final SubLList $list737 = list(makeSymbol("*HTML-TABLE-BORDER*"));

    public static final SubLList $list738 = list(makeSymbol("*HTML-TABLE-BORDERCOLOR*"));

    private static final SubLList $list739 = list(makeSymbol("*HTML-TABLE-CELLPADDING*"));

    public static final SubLList $list740 = list(makeSymbol("*HTML-TABLE-CELLSPACING*"));

    public static final SubLList $list741 = list(makeSymbol("*HTML-TABLE-COLSPEC*"));

    public static final SubLList $list742 = list(makeSymbol("*HTML-ATTRIBUTE-STYLE*"));

    private static final SubLList $list743 = list(makeSymbol("*HTML-TABLE-UNITS*"));

    public static final SubLList $list744 = list(makeSymbol("*HTML-TABLE-BGCOLOR*"));

    public static final SubLList $list745 = list(makeSymbol("*HTML-TABLE-WIDTH*"));

    private static final SubLList $list746 = list(makeSymbol("*HTML-TABLE-BACKGROUND*"));

    private static final SubLList $list747 = list(makeSymbol("*HTML-TABLE-HEAD*"), makeSymbol("*HTML-TABLE-TAIL*"));

    public static final SubLList $list748 = list(list(makeSymbol("BORDER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol HTML_FANCY_TABLE = makeSymbol("HTML-FANCY-TABLE");

    private static final SubLList $list750 = list(list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("NOWRAP"), makeSymbol("COLSPAN"), makeSymbol("ROWSPAN"), makeSymbol("ALIGN"), makeSymbol("VALIGN"), makeSymbol("BGCOLOR"), makeSymbol("WIDTH"), makeSymbol("HEIGHT"), makeSymbol("ID"), makeSymbol("CLASS"), makeSymbol("STYLE"), makeSymbol("TITLE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list751 = list(new SubLObject[]{ makeKeyword("NOWRAP"), makeKeyword("COLSPAN"), makeKeyword("ROWSPAN"), makeKeyword("ALIGN"), makeKeyword("VALIGN"), makeKeyword("BGCOLOR"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("ID"), makeKeyword("CLASS"), makeKeyword("STYLE"), makeKeyword("TITLE") });







    public static final SubLList $list755 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-TABLE-DATA-NOWRAP*")));

    public static final SubLList $list756 = list(makeSymbol("*HTML-TABLE-DATA-COLSPAN*"));

    private static final SubLList $list757 = list(makeSymbol("*HTML-TABLE-DATA-ROWSPAN*"));

    private static final SubLList $list758 = list(makeSymbol("*HTML-TABLE-DATA-ALIGN*"));

    public static final SubLList $list759 = list(makeSymbol("*HTML-TABLE-DATA-VALIGN*"));

    public static final SubLList $list760 = list(makeSymbol("*HTML-TABLE-DATA-BGCOLOR*"));

    private static final SubLList $list761 = list(makeSymbol("*HTML-TABLE-DATA-WIDTH*"));

    private static final SubLList $list762 = list(makeSymbol("*HTML-TABLE-DATA-HEIGHT*"));

    private static final SubLList $list763 = list(makeSymbol("*HTML-TABLE-DATA-HEAD*"), makeSymbol("*HTML-TABLE-DATA-TAIL*"));



    private static final SubLList $list765 = list(list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("NOWRAP"), makeSymbol("COLSPAN"), makeSymbol("ROWSPAN"), makeSymbol("ALIGN"), makeSymbol("VALIGN"), makeSymbol("BGCOLOR"), makeSymbol("WIDTH"), makeSymbol("HEIGHT"), makeSymbol("CLASS"), makeSymbol("TITLE"), makeSymbol("STYLE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list766 = list(new SubLObject[]{ makeKeyword("NOWRAP"), makeKeyword("COLSPAN"), makeKeyword("ROWSPAN"), makeKeyword("ALIGN"), makeKeyword("VALIGN"), makeKeyword("BGCOLOR"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("CLASS"), makeKeyword("TITLE"), makeKeyword("STYLE") });

    private static final SubLList $list767 = list(makeSymbol("*HTML-TABLE-ROW-TITLE*"));

    private static final SubLList $list768 = list(makeSymbol("*HTML-TABLE-HEADER-HEAD*"), makeSymbol("*HTML-TABLE-HEADER-TAIL*"));

    private static final SubLSymbol HTML_FANCY_TABLE_HEADER = makeSymbol("HTML-FANCY-TABLE-HEADER");

    public static final SubLList $list770 = list(makeSymbol("*HTML-TABLE-THEAD-HEAD*"), makeSymbol("*HTML-TABLE-THEAD-TAIL*"));

    private static final SubLList $list771 = list(makeSymbol("*HTML-TABLE-TFOOT-HEAD*"), makeSymbol("*HTML-TABLE-TFOOT-TAIL*"));

    public static final SubLList $list772 = list(makeSymbol("*HTML-TABLE-TBODY-HEAD*"), makeSymbol("*HTML-TABLE-TBODY-TAIL*"));

    private static final SubLList $list773 = list(list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("TITLE"), makeSymbol("STYLE"), makeSymbol("ALIGN"), makeSymbol("VALIGN"), makeSymbol("HEIGHT"), makeSymbol("BGCOLOR"), makeSymbol("CLASS"), makeSymbol("ID"), makeSymbol("NAME") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list774 = list(new SubLObject[]{ makeKeyword("TITLE"), makeKeyword("STYLE"), makeKeyword("ALIGN"), makeKeyword("VALIGN"), makeKeyword("HEIGHT"), makeKeyword("BGCOLOR"), makeKeyword("CLASS"), makeKeyword("ID"), makeKeyword("NAME") });

    public static final SubLList $list775 = list(makeSymbol("*HTML-TABLE-ROW-NAME*"));

    private static final SubLList $list776 = list(makeSymbol("*HTML-TABLE-ROW-HEIGHT*"));

    private static final SubLList $list777 = list(makeSymbol("*HTML-TABLE-ROW-BGCOLOR*"));

    private static final SubLList $list778 = list(makeSymbol("*HTML-TABLE-ROW-HEAD*"), makeSymbol("*HTML-TABLE-ROW-TAIL*"));

    private static final SubLSymbol HTML_FANCY_TABLE_ROW = makeSymbol("HTML-FANCY-TABLE-ROW");

    private static final SubLList $list780 = list(list(makeSymbol("INDENT-WIDTH"), makeSymbol("&OPTIONAL"), list(makeSymbol("MAX-INDENT"), TWENTY_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list781 = list(makeKeyword("BORDER"), ZERO_INTEGER, makeKeyword("CELLPADDING"), ZERO_INTEGER, makeKeyword("CELLSPACING"), ZERO_INTEGER);

    public static final SubLSymbol $html_indent_table_max$ = makeSymbol("*HTML-INDENT-TABLE-MAX*");

    private static final SubLSymbol HTML_INDENT_TABLE_INTERNAL = makeSymbol("HTML-INDENT-TABLE-INTERNAL");

    private static final SubLList $list784 = list(list(makeSymbol("INDENT-AMOUNT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym785$INDENT = makeUninternedSymbol("INDENT");

    private static final SubLSymbol $sym786$SPAN = makeUninternedSymbol("SPAN");



    private static final SubLSymbol $sym788$_ = makeSymbol("-");



    private static final SubLSymbol HTML_INDENT_ROW_INTERNAL = makeSymbol("HTML-INDENT-ROW-INTERNAL");

    private static final SubLList $list791 = list(list(makeSymbol("INDENT-AMOUNT"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEWLINE?"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list792 = list(list(makeSymbol("HTML-NEWLINE")));

    private static final SubLSymbol HTML_NO_BREAK = makeSymbol("HTML-NO-BREAK");



    public static final SubLList $list795 = list(list(makeSymbol("VAR"), makeSymbol("LISTFORM"), makeSymbol("BGCOLOR-VAR"), makeSymbol("&KEY"), list(makeSymbol("COLOR1"), makeSymbol("*HTML-COLOR-LIGHT-GREY*")), list(makeSymbol("COLOR2"), makeSymbol("*HTML-COLOR-LIGHTER-GREY*")), list(makeSymbol("COUNTER"), list(makeSymbol("QUOTE"), makeSymbol("IGNORE-ME")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list796 = list(makeKeyword("COLOR1"), makeKeyword("COLOR2"), makeKeyword("COUNTER"));









    private static final SubLString $str801$Malformed_cdolist_with_alternatin = makeString("Malformed cdolist-with-alternating-bgcolor -- ~S was not a variable");

    private static final SubLSymbol $sym802$COLOR_TOGGLE = makeUninternedSymbol("COLOR-TOGGLE");

    public static final SubLList $list803 = list(NIL);





    public static final SubLList $list806 = list(T);



    public static final SubLList $list808 = list(list(makeSymbol("VAR"), makeSymbol("LISTFORM"), makeSymbol("BGCOLOR-VAR"), makeSymbol("&KEY"), list(makeSymbol("COUNTER"), list(makeSymbol("QUOTE"), makeSymbol("IGNORE-ME")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list809 = list(makeKeyword("COUNTER"));

    private static final SubLSymbol CDOLIST_WITH_ALTERNATING_BGCOLOR = makeSymbol("CDOLIST-WITH-ALTERNATING-BGCOLOR");

    public static final SubLSymbol $html_color_cyc_logo_light_violet$ = makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*");

    public static final SubLSymbol $html_color_cyc_logo_lighter_violet$ = makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHTER-VIOLET*");

    public static final SubLSymbol $html_color_cyc_logo_light_blue$ = makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHT-BLUE*");

    public static final SubLSymbol $html_color_cyc_logo_lighter_blue$ = makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHTER-BLUE*");

    private static final SubLList $list815 = list(list(makeSymbol("VAR"), makeSymbol("LISTFORM"), makeSymbol("ALTERNATOR-VAR"), makeSymbol("&KEY"), list(makeSymbol("ALTERNATIVE1"), makeSymbol("*HTML-ALTERNATING-CLASS1*")), list(makeSymbol("ALTERNATIVE2"), makeSymbol("*HTML-ALTERNATING-CLASS2*")), list(makeSymbol("COUNTER"), list(makeSymbol("QUOTE"), makeSymbol("IGNORE-ME")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list816 = list(makeKeyword("ALTERNATIVE1"), makeKeyword("ALTERNATIVE2"), makeKeyword("COUNTER"));





    private static final SubLString $str819$Malformed_cdolist_with_alternatin = makeString("Malformed cdolist-with-alternating-variable -- ~S was not a variable");

    private static final SubLSymbol $sym820$ALTERNATOR_TOGGLE = makeUninternedSymbol("ALTERNATOR-TOGGLE");

    private static final SubLList $list821 = list(list(makeSymbol("VAR"), makeSymbol("LISTFORM"), makeSymbol("CLASS-VAR"), makeSymbol("&KEY"), list(makeSymbol("COUNTER"), list(makeSymbol("QUOTE"), makeSymbol("IGNORE-ME"))), list(makeSymbol("CLASS1"), makeSymbol("*HTML-ALTERNATING-CLASS1*")), list(makeSymbol("CLASS2"), makeSymbol("*HTML-ALTERNATING-CLASS2*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list822 = list(makeKeyword("COUNTER"), makeKeyword("CLASS1"), makeKeyword("CLASS2"));





    private static final SubLSymbol CDOLIST_WITH_ALTERNATING_VARIABLE = makeSymbol("CDOLIST-WITH-ALTERNATING-VARIABLE");

    public static final SubLList $list826 = list(makeSymbol("VAR"));

    public static final SubLList $list827 = list(makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*"));

    public static final SubLList $list828 = list(makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHTER-VIOLET*"), makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*"));

    public static final SubLList $list829 = list(list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("HREF"), makeSymbol("NAME"), makeSymbol("TITLE"), makeSymbol("TARGET"), makeSymbol("SCRIPT"), makeSymbol("STYLE"), makeSymbol("ONMOUSEOVER"), makeSymbol("ONMOUSEOUT"), makeSymbol("ONMOUSEDOWN"), makeSymbol("ONMOUSEUP"), makeSymbol("ONCLICK"), makeSymbol("CLASS"), makeSymbol("ID"), makeSymbol("ATTRS") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list830 = list(new SubLObject[]{ makeKeyword("HREF"), makeKeyword("NAME"), makeKeyword("TITLE"), makeKeyword("TARGET"), makeKeyword("SCRIPT"), makeKeyword("STYLE"), makeKeyword("ONMOUSEOVER"), makeKeyword("ONMOUSEOUT"), makeKeyword("ONMOUSEDOWN"), makeKeyword("ONMOUSEUP"), makeKeyword("ONCLICK"), makeKeyword("CLASS"), makeKeyword("ID"), makeKeyword("ATTRS") });









    private static final SubLList $list835 = list(makeSymbol("*HTML-ANCHOR-HREF*"));

    private static final SubLList $list836 = list(makeSymbol("*HTML-ANCHOR-NAME*"));

    private static final SubLList $list837 = list(makeSymbol("*HTML-ANCHOR-ID*"));

    private static final SubLList $list838 = list(makeSymbol("*HTML-ANCHOR-TITLE*"));

    public static final SubLList $list839 = list(makeSymbol("*HTML-ANCHOR-TARGET*"));

    public static final SubLList $list840 = list(makeSymbol("*HTML-ANCHOR-STYLE*"));

    public static final SubLList $list841 = list(makeSymbol("*HTML-ANCHOR-ONMOUSEUP*"));

    public static final SubLList $list842 = list(makeSymbol("*HTML-ANCHOR-ONMOUSEDOWN*"));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str844$_ = makeString("=");

    public static final SubLList $list845 = list(makeSymbol("*HTML-ANCHOR-HEAD*"), makeSymbol("*HTML-ANCHOR-TAIL*"));

    public static final SubLList $list846 = list(list(makeSymbol("LINKTEXT"), makeSymbol("&KEY"), makeSymbol("HREF"), makeSymbol("NAME"), makeSymbol("TARGET"), makeSymbol("STYLE"), makeSymbol("CLASS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list847 = list(makeKeyword("HREF"), makeKeyword("NAME"), makeKeyword("TARGET"), makeKeyword("STYLE"), makeKeyword("CLASS"));



    public static final SubLList $list849 = list(list(makeSymbol("NAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list850 = list(makeSymbol("HTML-CHAR"), CHAR_hash);

    public static final SubLList $list851 = list(list(makeSymbol("ADDRESS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol HTML_MAILTO_URL = makeSymbol("HTML-MAILTO-URL");

    public static final SubLList $list853 = list(list(makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol HTML_FILE_URL = makeSymbol("HTML-FILE-URL");

    private static final SubLList $list855 = list(makeSymbol("&KEY"), makeSymbol("NOHREF"), makeSymbol("HREF"), makeSymbol("ALT"), makeSymbol("TARGET"), makeSymbol("SHAPE"), makeSymbol("CO-ORDS"));

    public static final SubLList $list856 = list(makeKeyword("NOHREF"), makeKeyword("HREF"), makeKeyword("ALT"), makeKeyword("TARGET"), makeKeyword("SHAPE"), makeKeyword("CO-ORDS"));







    public static final SubLList $list860 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-AREA-NOHREF*")));

    public static final SubLList $list861 = list(makeSymbol("*HTML-AREA-HREF*"));

    public static final SubLList $list862 = list(makeSymbol("*HTML-AREA-ALT*"));

    public static final SubLList $list863 = list(makeSymbol("*HTML-AREA-TARGET*"));

    public static final SubLList $list864 = list(makeSymbol("*HTML-AREA-SHAPE*"));

    public static final SubLList $list865 = list(makeSymbol("*HTML-AREA-CO-ORDS*"));

    public static final SubLList $list866 = list(makeSymbol("*HTML-AREA-HEAD*"));

    public static final SubLList $list867 = list(makeSymbol("*HTML-BLINK-HEAD*"), makeSymbol("*HTML-BLINK-TAIL*"));

    public static final SubLList $list868 = list(makeSymbol("*HTML-COMMENT-HEAD*"), makeSymbol("*HTML-COMMENT-TAIL*"));

    public static final SubLList $list869 = list(makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("FRAMEBORDER"), makeSymbol("NORESIZE"), makeSymbol("SRC"), makeSymbol("SCROLLING"), makeSymbol("MARGINHEIGHT"), makeSymbol("MARGINWIDTH"));

    private static final SubLList $list870 = list(makeKeyword("FRAMEBORDER"), makeKeyword("NORESIZE"), makeKeyword("SRC"), makeKeyword("SCROLLING"), makeKeyword("MARGINHEIGHT"), makeKeyword("MARGINWIDTH"));











    public static final SubLList $list876 = list(makeSymbol("*HTML-FRAME-NAME*"));

    public static final SubLList $list877 = list(makeSymbol("*HTML-FRAME-FRAMEBORDER*"));

    public static final SubLList $list878 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-FRAME-NORESIZE*")));

    public static final SubLList $list879 = list(makeSymbol("*HTML-FRAME-SRC*"));

    public static final SubLList $list880 = list(makeSymbol("*HTML-FRAME-SCROLLING*"));

    public static final SubLList $list881 = list(makeSymbol("*HTML-FRAME-MARGINHEIGHT*"));

    public static final SubLList $list882 = list(makeSymbol("*HTML-FRAME-MARGINWIDTH*"));

    private static final SubLList $list883 = list(makeSymbol("*HTML-FRAME-HEAD*"));

    private static final SubLSymbol HTML_FANCY_FRAME = makeSymbol("HTML-FANCY-FRAME");

    private static final SubLList $list885 = list(list(makeSymbol("&KEY"), makeSymbol("COLS"), makeSymbol("ROWS"), makeSymbol("FRAMEBORDER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list886 = list(makeKeyword("COLS"), makeKeyword("ROWS"), makeKeyword("FRAMEBORDER"));

    private static final SubLList $list887 = list(makeSymbol("*HTML-FRAMESET-COLS*"));

    private static final SubLList $list888 = list(makeSymbol("*HTML-FRAMESET-ROWS*"));

    public static final SubLList $list889 = list(makeSymbol("*HTML-FRAMESET-FRAMEBORDER*"));

    public static final SubLList $list890 = list(makeSymbol("PWHEN"), list(makeSymbol("HTML-INSIDE-BODY-P")), list(makeSymbol("ERROR"), makeString("Cannot have a FRAMESET tag inside a BODY tag.")));

    private static final SubLList $list891 = list(makeSymbol("*HTML-FRAMESET-HEAD*"), makeSymbol("*HTML-FRAMESET-TAIL*"));

    private static final SubLSymbol HTML_FANCY_FRAMESET = makeSymbol("HTML-FANCY-FRAMESET");

    public static final SubLList $list893 = list(list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("SRC"), makeSymbol("NAME"), makeSymbol("WIDTH"), makeSymbol("HEIGHT"), makeSymbol("ALIGN"), makeSymbol("FRAMEBORDER"), makeSymbol("MARGINWIDTH"), makeSymbol("MARGINHEIGHT"), makeSymbol("SCROLLING") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list894 = list(new SubLObject[]{ makeKeyword("SRC"), makeKeyword("NAME"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("ALIGN"), makeKeyword("FRAMEBORDER"), makeKeyword("MARGINWIDTH"), makeKeyword("MARGINHEIGHT"), makeKeyword("SCROLLING") });

    public static final SubLList $list895 = list(makeSymbol("*HTML-IFRAME-SRC*"));

    private static final SubLList $list896 = list(makeSymbol("*HTML-IFRAME-NAME*"));

    private static final SubLList $list897 = list(makeSymbol("*HTML-IFRAME-WIDTH*"));

    private static final SubLList $list898 = list(makeSymbol("*HTML-IFRAME-HEIGHT*"));

    private static final SubLList $list899 = list(makeSymbol("*HTML-IFRAME-ALIGN*"));

    private static final SubLList $list900 = list(makeSymbol("*HTML-IFRAME-FRAMEBORDER*"));

    public static final SubLList $list901 = list(makeSymbol("*HTML-IFRAME-MARGINWIDTH*"));

    public static final SubLList $list902 = list(makeSymbol("*HTML-IFRAME-MARGINHEIGHT*"));

    public static final SubLList $list903 = list(makeSymbol("*HTML-IFRAME-SCROLLING*"));

    public static final SubLList $list904 = list(makeSymbol("*HTML-IFRAME-HEAD*"), makeSymbol("*HTML-IFRAME-TAIL*"));

    public static final SubLList $list905 = list(new SubLObject[]{ makeSymbol("SRC"), makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("ID"), makeSymbol("CLASS"), makeSymbol("ISMAP"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ALT"), makeSymbol("ALIGN"), makeSymbol("BORDER"), makeSymbol("STYLE") });

    public static final SubLList $list906 = list(new SubLObject[]{ makeKeyword("NAME"), makeKeyword("ID"), makeKeyword("CLASS"), makeKeyword("ISMAP"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ALT"), makeKeyword("ALIGN"), makeKeyword("BORDER"), makeKeyword("STYLE") });



    public static final SubLList $list908 = list(makeSymbol("*HTML-IMAGE-SRC*"));

    public static final SubLList $list909 = list(makeSymbol("*HTML-IMAGE-NAME*"));

    public static final SubLList $list910 = list(list(makeSymbol("HTML-SIMPLE-ATTRIBUTE"), makeSymbol("*HTML-IMAGE-ISMAP*")));

    public static final SubLList $list911 = list(makeSymbol("*HTML-IMAGE-HEIGHT*"));

    public static final SubLList $list912 = list(makeSymbol("*HTML-IMAGE-WIDTH*"));

    public static final SubLList $list913 = list(makeSymbol("*HTML-IMAGE-ALT*"));

    public static final SubLList $list914 = list(makeSymbol("*HTML-IMAGE-ALIGN*"));

    public static final SubLList $list915 = list(makeSymbol("*HTML-IMAGE-BORDER*"));

    public static final SubLList $list916 = list(makeSymbol("*HTML-IMAGE-STYLE*"));

    public static final SubLList $list917 = list(makeSymbol("*HTML-IMAGE-HEAD*"), makeSymbol("*HTML-IMAGE-TAIL*"));

    private static final SubLList $list918 = list(list(makeSymbol("HTML-MARKUP-BODY")));

    public static final SubLList $list919 = list(new SubLObject[]{ makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("NAME"), makeSymbol("ID"), makeSymbol("CLASS"), makeSymbol("ISMAP"), makeSymbol("HEIGHT"), makeSymbol("WIDTH"), makeSymbol("ALT"), makeSymbol("ALIGN"), makeSymbol("BORDER") });

    public static final SubLList $list920 = list(new SubLObject[]{ makeKeyword("TYPE"), makeKeyword("NAME"), makeKeyword("ID"), makeKeyword("CLASS"), makeKeyword("ISMAP"), makeKeyword("HEIGHT"), makeKeyword("WIDTH"), makeKeyword("ALT"), makeKeyword("ALIGN"), makeKeyword("BORDER") });

    private static final SubLSymbol $sym921$DATA_SRC = makeUninternedSymbol("DATA-SRC");

    private static final SubLSymbol HTML_EMBEDDED_IMAGE_DATA_SRC = makeSymbol("HTML-EMBEDDED-IMAGE-DATA-SRC");

    private static final SubLSymbol HTML_FANCY_IMAGE = makeSymbol("HTML-FANCY-IMAGE");

    private static final SubLSymbol HTML_EMBEDDED_IMAGE = makeSymbol("HTML-EMBEDDED-IMAGE");

    private static final SubLString $str925$data__A_base64_ = makeString("data:~A;base64,");

    private static final SubLInteger $int$76 = makeInteger(76);

    public static final SubLList $list927 = list(makeSymbol("*HTML-MAP-HEAD*"), makeSymbol("*HTML-MAP-TAIL*"));

    public static final SubLList $list928 = list(makeSymbol("*HTML-MAP-NAME*"));

    private static final SubLSymbol HTML_FANCY_MAP = makeSymbol("HTML-FANCY-MAP");

    public static final SubLList $list930 = list(makeSymbol("*HTML-NO-BREAK-HEAD*"), makeSymbol("*HTML-NO-BREAK-TAIL*"));

    private static final SubLList $list931 = list(makeSymbol("*HTML-NO-FRAMES-HEAD*"), makeSymbol("*HTML-NO-FRAMES-TAIL*"));

    private static final SubLList $list932 = list(list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("CLASSID"), makeSymbol("CODEBASE"), makeSymbol("CODETYPE"), makeSymbol("DATA"), makeSymbol("TYPE"), makeSymbol("ARCHIVE"), makeSymbol("ID"), makeSymbol("CLASS"), makeSymbol("ALIGN"), makeSymbol("WIDTH"), makeSymbol("HEIGHT"), makeSymbol("BORDER"), makeSymbol("HSPACE"), makeSymbol("VSPACE") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list933 = list(new SubLObject[]{ makeKeyword("CLASSID"), makeKeyword("CODEBASE"), makeKeyword("CODETYPE"), makeKeyword("DATA"), makeKeyword("TYPE"), makeKeyword("ARCHIVE"), makeKeyword("ID"), makeKeyword("CLASS"), makeKeyword("ALIGN"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"), makeKeyword("BORDER"), makeKeyword("HSPACE"), makeKeyword("VSPACE") });











    private static final SubLList $list939 = list(makeSymbol("*HTML-OBJECT-CLASSID*"));

    public static final SubLList $list940 = list(makeSymbol("*HTML-OBJECT-CODEBASE*"));

    private static final SubLList $list941 = list(makeSymbol("*HTML-OBJECT-CODETYPE*"));

    private static final SubLList $list942 = list(makeSymbol("*HTML-OBJECT-DATA*"));

    public static final SubLList $list943 = list(makeSymbol("*HTML-OBJECT-TYPE*"));

    public static final SubLList $list944 = list(makeSymbol("*HTML-OBJECT-ARCHIVE*"));

    private static final SubLList $list945 = list(makeSymbol("*HTML-OBJECT-ID*"));

    private static final SubLList $list946 = list(makeSymbol("*HTML-OBJECT-CLASS*"));

    private static final SubLList $list947 = list(makeSymbol("*HTML-OBJECT-ALIGN*"));

    private static final SubLList $list948 = list(makeSymbol("*HTML-OBJECT-WIDTH*"));

    private static final SubLList $list949 = list(makeSymbol("*HTML-OBJECT-HEIGHT*"));

    private static final SubLList $list950 = list(makeSymbol("*HTML-OBJECT-BORDER*"));

    public static final SubLList $list951 = list(makeSymbol("*HTML-OBJECT-HSPACE*"));

    private static final SubLList $list952 = list(makeSymbol("*HTML-OBJECT-VSPACE*"));

    private static final SubLList $list953 = list(makeSymbol("*HTML-OBJECT-HEAD*"), makeSymbol("*HTML-OBJECT-TAIL*"));

    private static final SubLList $list954 = list(list(makeSymbol("&KEY"), makeSymbol("LANGUAGE"), makeSymbol("SRC"), makeSymbol("TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list955 = list(makeKeyword("LANGUAGE"), makeKeyword("SRC"), makeKeyword("TYPE"));



    private static final SubLList $list957 = list(makeSymbol("*HTML-SCRIPT-LANGUAGE*"));

    private static final SubLList $list958 = list(makeSymbol("*HTML-SCRIPT-SRC*"));

    private static final SubLList $list959 = list(makeSymbol("*HTML-SCRIPT-TYPE*"));

    private static final SubLList $list960 = list(makeSymbol("*HTML-SCRIPT-HEAD*"), makeSymbol("*HTML-SCRIPT-TAIL*"));

    private static final SubLSymbol HTML_FANCY_SCRIPT = makeSymbol("HTML-FANCY-SCRIPT");

    private static final SubLList $list962 = list(makeKeyword("LANGUAGE"), makeSymbol("*HTML-SCRIPT-JAVASCRIPT*"));

    private static final SubLList $list963 = list(makeSymbol("*HTML-NOSCRIPT-HEAD*"), makeSymbol("*HTML-NOSCRIPT-TAIL*"));

    private static final SubLList $list964 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"));

    private static final SubLList $list965 = list(makeSymbol("HTML-FORMAT"), makeString("~A?"), makeSymbol("*CYC-CGI-PROGRAM*"));

    public static final SubLList $list966 = list(makeSymbol("*CYC-CGI-PROGRAM*"));

    public static final SubLList $list967 = list(makeSymbol("*CYC-CGI-PROGRAM*"), makeSymbol("*HTML-FORM-METHOD-POST*"));

    private static final SubLList $list968 = list(list(makeSymbol("HANDLER-NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("VALUE"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol HTML_BASIC_CYC_FORM = makeSymbol("HTML-BASIC-CYC-FORM");

    private static final SubLSymbol HTML_HIDDEN_INPUT = makeSymbol("HTML-HIDDEN-INPUT");

    private static final SubLList $list971 = list(list(makeSymbol("NAME"), makeSymbol("COLS"), makeSymbol("ROWS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol HTML_FANCY_TEXTAREA = makeSymbol("HTML-FANCY-TEXTAREA");

    public static final SubLList $list973 = list(makeKeyword("WRAP"), T);

    public static final SubLList $list974 = list(list(makeSymbol("NAME"), makeSymbol("SIZE"), makeSymbol("MULTIPLE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol HTML_FANCY_SELECT = makeSymbol("HTML-FANCY-SELECT");

    private static final SubLList $list976 = list(list(makeSymbol("SELECTED?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol HTML_FANCY_OPTION = makeSymbol("HTML-FANCY-OPTION");

    private static final SubLList $list978 = list(list(makeSymbol("&OPTIONAL"), list(makeSymbol("CAPTION"), makeString("")), list(makeSymbol("ALIGN"), makeKeyword("TOP")), list(makeSymbol("BORDER"), TWO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol HTML_TABLE_CAPTION = makeSymbol("HTML-TABLE-CAPTION");

    private static final SubLList $list981 = list(list(makeSymbol("NAME"), makeSymbol("COLS"), makeSymbol("ROWS"), makeSymbol("CYCL-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym982$ID_NUM = makeUninternedSymbol("ID-NUM");

    private static final SubLSymbol $sym983$INPUT_ID = makeUninternedSymbol("INPUT-ID");

    private static final SubLSymbol $sym984$RESULT_ID = makeUninternedSymbol("RESULT-ID");

    private static final SubLSymbol $sym985$AUTOCOMPLETE_ID = makeUninternedSymbol("AUTOCOMPLETE-ID");

    private static final SubLList $list986 = list(makeSymbol("NEXT-HTML-ID-DEFINED?"));

    private static final SubLList $list987 = list(list(makeSymbol("NEXT-HTML-ID")));



    private static final SubLString $str989$autocomplete__A = makeString("autocomplete-~A");

    private static final SubLString $str990$input__A = makeString("input-~A");

    private static final SubLString $str991$autocomplete_results__A = makeString("autocomplete-results-~A");

    private static final SubLSymbol HTML_FANCY_DIV = makeSymbol("HTML-FANCY-DIV");

    private static final SubLList $list993 = list(makeKeyword("CLASS"), makeString("yui-ac"));

    private static final SubLString $str994$yui_ac_input = makeString("yui-ac-input");

    public static final SubLList $list995 = list(makeKeyword("STYLE"), makeString("position:static"));

    public static final SubLList $list996 = list(makeKeyword("CLASS"), makeString("yui-ac-container"));

    private static final SubLSymbol HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT = makeSymbol("HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT");

    public static final SubLList $list998 = list(makeSymbol("STREAM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list999 = list(makeSymbol("STRING-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $sym1001$STREAM = makeUninternedSymbol("STREAM");



    private static final SubLSymbol WITH_HTML_OUTPUT_TO_STREAM = makeSymbol("WITH-HTML-OUTPUT-TO-STREAM");

    private static final SubLSymbol WITH_HTML_OUTPUT_TO_STRING = makeSymbol("WITH-HTML-OUTPUT-TO-STRING");

    private static final SubLSymbol CONVERT_HTML_TO_TEXT = makeSymbol("CONVERT-HTML-TO-TEXT");

    private static final SubLList $list1006 = list(makeSymbol("MACHINE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym1007$STATE_VAR = makeUninternedSymbol("STATE-VAR");

    private static final SubLSymbol $sym1008$LOCK_VAR = makeUninternedSymbol("LOCK-VAR");

    private static final SubLSymbol $sym1009$VARIABLES = makeUninternedSymbol("VARIABLES");

    private static final SubLSymbol $sym1010$VALUES = makeUninternedSymbol("VALUES");

    private static final SubLSymbol HTML_MACHINE_STATE = makeSymbol("HTML-MACHINE-STATE");

    private static final SubLSymbol HTML_MACHINE_STATE_LOCK = makeSymbol("HTML-MACHINE-STATE-LOCK");



    private static final SubLSymbol HTML_MACHINE_STATE_VARIABLES = makeSymbol("HTML-MACHINE-STATE-VARIABLES");

    private static final SubLSymbol HTML_MACHINE_STATE_VALUES = makeSymbol("HTML-MACHINE-STATE-VALUES");



    private static final SubLSymbol SNAPSHOT_HTML_STATE = makeSymbol("SNAPSHOT-HTML-STATE");

    private static final SubLSymbol $HTML_PARAMETER_ENTRY_FORMAT = makeKeyword("HTML-PARAMETER-ENTRY-FORMAT");

    private static final SubLList $list1019 = list(makeSymbol("PARAMETER"), makeSymbol("ENTRY-FORMAT"));

    private static final SubLSymbol SET_HTML_PARAMETER_ENTRY_FORMAT = makeSymbol("SET-HTML-PARAMETER-ENTRY-FORMAT");



    public static final SubLSymbol $html_handler_property$ = makeSymbol("*HTML-HANDLER-PROPERTY*");



    public static final SubLSymbol $xml_handler_property$ = makeSymbol("*XML-HANDLER-PROPERTY*");



    public static final SubLSymbol $json_handler_property$ = makeSymbol("*JSON-HANDLER-PROPERTY*");



    private static final SubLList $list1028 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str1029$HTML_handler__A_has_an_invalid_ar = makeString("HTML handler ~A has an invalid arglist of:~%   ~S~%Use DEFINE instead.");



    private static final SubLSymbol NOTE_CGI_HANDLER_FUNCTION = makeSymbol("NOTE-CGI-HANDLER-FUNCTION");

    private static final SubLSymbol DEFINE_HTML_HANDLER = makeSymbol("DEFINE-HTML-HANDLER");

    public static final SubLSymbol $handler_mime_types$ = makeSymbol("*HANDLER-MIME-TYPES*");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLList $list1035 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEFINE_CGI_HANDLER = makeSymbol("DEFINE-CGI-HANDLER");





    public static final SubLList $list1039 = list(makeSymbol("SPECS"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym1040$ALIST = makeUninternedSymbol("ALIST");

    public static final SubLList $list1041 = list(makeSymbol("VARIABLE"), makeSymbol("&KEY"), makeSymbol("READER"), makeSymbol("TYPE-PRED"), makeSymbol("NAME"), makeSymbol("COLLECT"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), makeSymbol("STRING-EQUAL")))));

    public static final SubLList $list1042 = list(makeKeyword("READER"), makeKeyword("TYPE-PRED"), makeKeyword("NAME"), makeKeyword("COLLECT"), makeKeyword("TEST"));









    public static final SubLList $list1047 = list(makeSymbol("FUNCTION"), makeSymbol("STRING-EQUAL"));

    private static final SubLSymbol $sym1048$CURRENT = makeUninternedSymbol("CURRENT");

















    private static final SubLSymbol $sym1057$VAL = makeUninternedSymbol("VAL");











    private static final SubLString $str1063$HTML_argument_error___S_should_be = makeString("HTML argument error: ~S should be ~S.");

    private static final SubLList $list1064 = list(list(makeSymbol("FUNCTION"), makeSymbol("STRING-EQUAL")));

    private static final SubLSymbol REMOVE_IF_NOT = makeSymbol("REMOVE-IF-NOT");

    private static final SubLList $list1066 = list(makeSymbol("FUNCTION"), makeSymbol("CONSP"));

    private static final SubLList $list1067 = list(makeSymbol("STRONG?"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym1068$STRONG_VAR = makeUninternedSymbol("STRONG-VAR");

    private static final SubLSymbol $sym1069$HEAD = makeUninternedSymbol("HEAD");

    private static final SubLSymbol $sym1070$TAIL = makeUninternedSymbol("TAIL");

    private static final SubLList $list1071 = list(makeSymbol("*HTML-STRONG-HEAD*"), makeSymbol("*EMPTY-STRING*"));

    private static final SubLList $list1072 = list(makeSymbol("*HTML-STRONG-TAIL*"), makeSymbol("*EMPTY-STRING*"));

    public static SubLObject is_known_dom_event_handlerP(final SubLObject symbol) {
        return makeBoolean(symbol.isKeyword() && (NIL != list_utilities.member_eqP(symbol, $html_known_dom_events$.getGlobalValue())));
    }

    public static SubLObject html_format(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject control_string = NIL;
        destructuring_bind_must_consp(current, datum, $list345);
        control_string = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(FORMAT, $html_stream$, control_string, append(args, NIL));
    }

    public static SubLObject html_format_strong(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject control_string = NIL;
        destructuring_bind_must_consp(current, datum, $list345);
        control_string = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(HTML_STRONG, listS(FORMAT, $html_stream$, control_string, append(args, NIL)));
    }

    public static SubLObject html_markup_wrapper(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list349);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject head = NIL;
        destructuring_bind_must_consp(current, datum, $list349);
        head = current.first();
        current = current.rest();
        final SubLObject tail = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list349);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list349);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        if (NIL != tail) {
            return listS(PROGN, list(HTML_MARKUP, head), append(body, list(list(HTML_MARKUP, tail))));
        }
        return listS(PROGN, list(HTML_MARKUP, head), append(body, $list352));
    }

    public static SubLObject html_quoted_attribute(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list353);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject att = NIL;
        destructuring_bind_must_consp(current, datum, $list353);
        att = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(HTML_MARKUP, att), $list354, append(body, $list355));
        }
        cdestructuring_bind_error(datum, $list353);
        return NIL;
    }

    public static SubLObject html_markup_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list356, listS(CLET, $list358, append(body, NIL)));
    }

    public static SubLObject html_inside_body_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $html_inside_bodyP$.getDynamicValue(thread);
    }

    public static SubLObject html_fancy_body(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list359);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list359);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list359);
            if (NIL == member(current_$1, $list360, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list359);
        }
        final SubLObject show_copyright_tail = property_list_member($SHOW_COPYRIGHT, current);
        final SubLObject show_copyright = (NIL != show_copyright_tail) ? cadr(show_copyright_tail) : T;
        final SubLObject background_image_tail = property_list_member($BACKGROUND_IMAGE, current);
        final SubLObject background_image = (NIL != background_image_tail) ? cadr(background_image_tail) : NIL;
        final SubLObject background_color_tail = property_list_member($BACKGROUND_COLOR, current);
        final SubLObject background_color = (NIL != background_color_tail) ? cadr(background_color_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject text_color_tail = property_list_member($TEXT_COLOR, current);
        final SubLObject text_color = (NIL != text_color_tail) ? cadr(text_color_tail) : NIL;
        final SubLObject link_color_tail = property_list_member($LINK_COLOR, current);
        final SubLObject link_color = (NIL != link_color_tail) ? cadr(link_color_tail) : NIL;
        final SubLObject active_link_color_tail = property_list_member($ACTIVE_LINK_COLOR, current);
        final SubLObject active_link_color = (NIL != active_link_color_tail) ? cadr(active_link_color_tail) : NIL;
        final SubLObject visited_link_color_tail = property_list_member($VISITED_LINK_COLOR, current);
        final SubLObject visited_link_color = (NIL != visited_link_color_tail) ? cadr(visited_link_color_tail) : NIL;
        final SubLObject script_tail = property_list_member($SCRIPT, current);
        final SubLObject script = (NIL != script_tail) ? cadr(script_tail) : NIL;
        final SubLObject onload_tail = property_list_member($ONLOAD, current);
        final SubLObject onload = (NIL != onload_tail) ? cadr(onload_tail) : NIL;
        final SubLObject onresize_tail = property_list_member($ONRESIZE, current);
        final SubLObject onresize = (NIL != onresize_tail) ? cadr(onresize_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != background_image) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list375, background_image.isAtom() ? list(HTML_MARKUP, background_image) : background_image), attributes);
        }
        if (NIL != onload) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list376, background_image.isAtom() ? list(HTML_MARKUP, onload) : onload), attributes);
        }
        if (NIL != onresize) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list377, background_image.isAtom() ? list(HTML_MARKUP, onresize) : onresize), attributes);
        }
        if (NIL != background_color) {
            assert NIL != atom(background_color) : "Types.atom(background_color) " + "CommonSymbols.NIL != Types.atom(background_color) " + background_color;
            attributes = cons(list(PWHEN, background_color, list(HTML_QUOTED_ATTRIBUTE, $list380, list(HTML_MARKUP, list(HTML_COLOR, background_color)))), attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list382, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != style) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list383, style.isAtom() ? list(HTML_MARKUP, style) : style), attributes);
        }
        if (NIL != text_color) {
            assert NIL != atom(text_color) : "Types.atom(text_color) " + "CommonSymbols.NIL != Types.atom(text_color) " + text_color;
            attributes = cons(list(PWHEN, text_color, list(HTML_QUOTED_ATTRIBUTE, $list384, list(HTML_MARKUP, list(HTML_COLOR, text_color)))), attributes);
        }
        if (NIL != link_color) {
            assert NIL != atom(link_color) : "Types.atom(link_color) " + "CommonSymbols.NIL != Types.atom(link_color) " + link_color;
            attributes = cons(list(PWHEN, link_color, list(HTML_QUOTED_ATTRIBUTE, $list385, list(HTML_MARKUP, list(HTML_COLOR, link_color)))), attributes);
        }
        if (NIL != active_link_color) {
            assert NIL != atom(active_link_color) : "Types.atom(active_link_color) " + "CommonSymbols.NIL != Types.atom(active_link_color) " + active_link_color;
            attributes = cons(list(PWHEN, active_link_color, list(HTML_QUOTED_ATTRIBUTE, $list386, list(HTML_MARKUP, list(HTML_COLOR, active_link_color)))), attributes);
        }
        if (NIL != visited_link_color) {
            assert NIL != atom(visited_link_color) : "Types.atom(visited_link_color) " + "CommonSymbols.NIL != Types.atom(visited_link_color) " + visited_link_color;
            attributes = cons(list(PWHEN, visited_link_color, list(HTML_QUOTED_ATTRIBUTE, $list387, list(HTML_MARKUP, list(HTML_COLOR, visited_link_color)))), attributes);
        }
        if (NIL != script) {
            attributes = cons(list(PROGN, $list388, script.isAtom() ? list(HTML_MARKUP, script) : script), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(CLET, $list389, listS(HTML_MARKUP_WRAPPER, $list391, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, list($list393, listS(PWHEN, show_copyright, $list394))))))), $list395);
    }

    public static SubLObject html_colored_body(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list396);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject color = NIL;
        destructuring_bind_must_consp(current, datum, $list396);
        color = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject color_value = $sym397$COLOR_VALUE;
            return list(CLET, list(list(color_value, color)), listS(HTML_FANCY_BODY, list($BACKGROUND_COLOR, color_value), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list396);
        return NIL;
    }

    public static SubLObject html_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_COLORED_BODY, $list400, append(body, NIL));
    }

    public static SubLObject html_head(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PROGN, listS(HTML_MARKUP_WRAPPER, $list401, $list402, append(body, NIL)), $list395);
    }

    public static SubLObject html_head_content_type() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != system_parameters.$permit_utf_8_character_display$.getDynamicValue(thread)) {
            html_meta_utf_8_content_type();
        }
        return NIL;
    }

    public static SubLObject html_document(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PROGN, $list405, $list406, $list393, list(WITH_POSSIBLY_NEW_HTML_FILE_DEPENDENCY_SPACE, listS(HTML_MARKUP_WRAPPER, $list408, append(body, NIL))), $list395);
    }

    public static SubLObject html_fancy_div(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list409);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list409);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list409);
            if (NIL == member(current_$2, $list410, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list409);
        }
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject onload_tail = property_list_member($ONLOAD, current);
        final SubLObject onload = (NIL != onload_tail) ? cadr(onload_tail) : NIL;
        final SubLObject title_tail = property_list_member($TITLE, current);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : NIL;
        final SubLObject misc_tail = property_list_member($MISC, current);
        final SubLObject misc = (NIL != misc_tail) ? cadr(misc_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != style) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list417, style.isAtom() ? list(HTML_MARKUP, style) : style), attributes);
        }
        if (NIL != title) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list418, title.isAtom() ? list(HTML_MARKUP, title) : style), attributes);
        }
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list419, list(HTML_MARKUP, align))), attributes);
        }
        if (NIL != onload) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list420, onload.isAtom() ? list(HTML_MARKUP, onload) : onload), attributes);
        }
        if (NIL != misc) {
            final SubLObject attribute = $sym421$ATTRIBUTE;
            final SubLObject value = $sym422$VALUE;
            attributes = cons(list(DO_ALIST, list(attribute, value, misc), list(HTML_QUOTED_ATTRIBUTE, list(attribute), list(HTML_MARKUP, value))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list424, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_smaller(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_SPAN, $list426, append(body, NIL));
    }

    public static SubLObject html_larger(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_SPAN, $list427, append(body, NIL));
    }

    public static SubLObject html_fancy_span(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list428);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list428);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list428);
            if (NIL == member(current_$3, $list429, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list428);
        }
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject onclick_tail = property_list_member($ONCLICK, current);
        final SubLObject onclick = (NIL != onclick_tail) ? cadr(onclick_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject title_tail = property_list_member($TITLE, current);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != onclick) {
            assert NIL != atom(onclick) : "Types.atom(onclick) " + "CommonSymbols.NIL != Types.atom(onclick) " + onclick;
            attributes = cons(list(PWHEN, onclick, list(HTML_QUOTED_ATTRIBUTE, $list431, list(HTML_MARKUP, onclick))), attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != title) {
            assert NIL != atom(title) : "Types.atom(title) " + "CommonSymbols.NIL != Types.atom(title) " + title;
            attributes = cons(list(PWHEN, title, list(HTML_QUOTED_ATTRIBUTE, $list432, list(HTML_MARKUP, title))), attributes);
        }
        if (NIL != style) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list433, style.isAtom() ? list(HTML_MARKUP, style) : style), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list434, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_meta(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list393, listS(HTML_MARKUP_WRAPPER, $list435, append(body, NIL)));
    }

    public static SubLObject html_fancy_meta(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list436);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list436);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list436);
            if (NIL == member(current_$4, $list437, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list436);
        }
        final SubLObject http_equiv_tail = property_list_member($HTTP_EQUIV, current);
        final SubLObject http_equiv = (NIL != http_equiv_tail) ? cadr(http_equiv_tail) : NIL;
        final SubLObject content_tail = property_list_member($CONTENT, current);
        final SubLObject content = (NIL != content_tail) ? cadr(content_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject scheme_tail = property_list_member($SCHEME, current);
        final SubLObject scheme = (NIL != scheme_tail) ? cadr(scheme_tail) : NIL;
        final SubLObject lang_tail = property_list_member($LANG, current);
        final SubLObject lang = (NIL != lang_tail) ? cadr(lang_tail) : NIL;
        final SubLObject dir_tail = property_list_member($DIR, current);
        final SubLObject dir = (NIL != dir_tail) ? cadr(dir_tail) : NIL;
        current = temp;
        if (NIL == current) {
            SubLObject attributes = NIL;
            if (NIL != content) {
                assert NIL != atom(content) : "Types.atom(content) " + "CommonSymbols.NIL != Types.atom(content) " + content;
                attributes = cons(list(PWHEN, content, list(HTML_QUOTED_ATTRIBUTE, $list444, list(HTML_MARKUP, content))), attributes);
            }
            if (NIL != name) {
                assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
                attributes = cons(list(PWHEN, name, list(HTML_QUOTED_ATTRIBUTE, $list445, list(HTML_MARKUP, name))), attributes);
            }
            if (NIL != scheme) {
                assert NIL != atom(scheme) : "Types.atom(scheme) " + "CommonSymbols.NIL != Types.atom(scheme) " + scheme;
                attributes = cons(list(PWHEN, scheme, list(HTML_QUOTED_ATTRIBUTE, $list446, list(HTML_MARKUP, scheme))), attributes);
            }
            if (NIL != lang) {
                assert NIL != atom(lang) : "Types.atom(lang) " + "CommonSymbols.NIL != Types.atom(lang) " + lang;
                attributes = cons(list(PWHEN, lang, list(HTML_QUOTED_ATTRIBUTE, $list447, list(HTML_MARKUP, lang))), attributes);
            }
            if (NIL != dir) {
                assert NIL != atom(dir) : "Types.atom(dir) " + "CommonSymbols.NIL != Types.atom(dir) " + dir;
                attributes = cons(list(PWHEN, dir, list(HTML_QUOTED_ATTRIBUTE, $list448, list(HTML_MARKUP, dir))), attributes);
            }
            if (NIL != http_equiv) {
                assert NIL != atom(http_equiv) : "Types.atom(http_equiv) " + "CommonSymbols.NIL != Types.atom(http_equiv) " + http_equiv;
                attributes = cons(list(PWHEN, http_equiv, list(HTML_QUOTED_ATTRIBUTE, $list449, list(HTML_MARKUP, http_equiv))), attributes);
            }
            return bq_cons(HTML_META, append(attributes, NIL));
        }
        cdestructuring_bind_error(datum, $list436);
        return NIL;
    }

    public static SubLObject html_link(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list393, listS(HTML_MARKUP_WRAPPER, $list451, append(body, NIL)));
    }

    public static SubLObject html_fancy_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list452);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list452);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list452);
            if (NIL == member(current_$5, $list453, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list452);
        }
        final SubLObject rel_tail = property_list_member($REL, current);
        final SubLObject rel = (NIL != rel_tail) ? cadr(rel_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject href_tail = property_list_member($HREF, current);
        final SubLObject href = (NIL != href_tail) ? cadr(href_tail) : NIL;
        final SubLObject media_tail = property_list_member($MEDIA, current);
        final SubLObject media = (NIL != media_tail) ? cadr(media_tail) : NIL;
        final SubLObject title_tail = property_list_member($TITLE, current);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        current = temp;
        if (NIL == current) {
            SubLObject attributes = NIL;
            if (NIL != media) {
                assert NIL != atom(media) : "Types.atom(media) " + "CommonSymbols.NIL != Types.atom(media) " + media;
                attributes = cons(list(PWHEN, media, list(HTML_QUOTED_ATTRIBUTE, $list458, list(HTML_MARKUP, media))), attributes);
            }
            if (NIL != title) {
                assert NIL != atom(title) : "Types.atom(title) " + "CommonSymbols.NIL != Types.atom(title) " + title;
                attributes = cons(list(PWHEN, title, list(HTML_QUOTED_ATTRIBUTE, $list459, list(HTML_MARKUP, title))), attributes);
            }
            if (NIL != type) {
                assert NIL != atom(type) : "Types.atom(type) " + "CommonSymbols.NIL != Types.atom(type) " + type;
                attributes = cons(list(PWHEN, type, list(HTML_QUOTED_ATTRIBUTE, $list460, list(HTML_MARKUP, type))), attributes);
            }
            if (NIL != href) {
                assert NIL != atom(href) : "Types.atom(href) " + "CommonSymbols.NIL != Types.atom(href) " + href;
                attributes = cons(list(PWHEN, href, list(HTML_QUOTED_ATTRIBUTE, $list461, list(HTML_MARKUP, href))), attributes);
            }
            if (NIL != rel) {
                assert NIL != atom(rel) : "Types.atom(rel) " + "CommonSymbols.NIL != Types.atom(rel) " + rel;
                attributes = cons(list(PWHEN, rel, list(HTML_QUOTED_ATTRIBUTE, $list462, list(HTML_MARKUP, rel))), attributes);
            }
            if (NIL != id) {
                assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
                attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, id))), attributes);
            }
            return bq_cons(HTML_LINK, append(attributes, NIL));
        }
        cdestructuring_bind_error(datum, $list452);
        return NIL;
    }

    public static SubLObject html_base(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list393, listS(HTML_MARKUP_WRAPPER, $list464, append(body, NIL)));
    }

    public static SubLObject html_fancy_base(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list465);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list465);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list465);
            if (NIL == member(current_$6, $list466, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list465);
        }
        final SubLObject href_tail = property_list_member($HREF, current);
        final SubLObject href = (NIL != href_tail) ? cadr(href_tail) : NIL;
        current = temp;
        if (NIL == current) {
            SubLObject attributes = NIL;
            if (NIL != href) {
                assert NIL != atom(href) : "Types.atom(href) " + "CommonSymbols.NIL != Types.atom(href) " + href;
                attributes = cons(list(PWHEN, href, list(HTML_QUOTED_ATTRIBUTE, $list467, list(HTML_MARKUP, href))), attributes);
            }
            return bq_cons(HTML_BASE, append(attributes, NIL));
        }
        cdestructuring_bind_error(datum, $list465);
        return NIL;
    }

    public static SubLObject html_stylesheet_link(final SubLObject href, SubLObject id, SubLObject title, SubLObject media) {
        if (id == UNPROVIDED) {
            id = NIL;
        }
        if (title == UNPROVIDED) {
            title = NIL;
        }
        if (media == UNPROVIDED) {
            media = $$$all;
        }
        html_source_readability_terpri(UNPROVIDED);
        html_markup($html_link_head$.getGlobalValue());
        if (NIL != id) {
            html_markup($html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup($html_link_rel$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$stylesheet);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != href) {
            html_markup($html_link_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(href);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup($html_link_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str471$text_css);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != title) {
            html_markup($html_link_title$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(title);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != media) {
            html_markup($html_link_media$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(media);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject html_style(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list393, listS(HTML_MARKUP_WRAPPER, $list472, append(body, NIL)));
    }

    public static SubLObject html_title(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list393, listS(HTML_MARKUP_WRAPPER, $list473, append(body, NIL)));
    }

    public static SubLObject html_simple_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list474);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = NIL;
        destructuring_bind_must_consp(current, datum, $list474);
        title = current.first();
        current = current.rest();
        final SubLObject color = (current.isCons()) ? current.first() : $html_default_bgcolor$;
        destructuring_bind_must_listp(current, datum, $list474);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(HTML_DOCUMENT, list(HTML_HEAD, list(HTML_TITLE, list(HTML_PRINC, title))), listS(HTML_COLORED_BODY, list(color), list(HTML_HEADING, $list479, list(HTML_PRINC, title)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list474);
        return NIL;
    }

    public static SubLObject html_simple_browser_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list480);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = NIL;
        destructuring_bind_must_consp(current, datum, $list480);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list480);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list480);
            if (NIL == member(current_$7, $list481, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list480);
        }
        final SubLObject completionP_tail = property_list_member($COMPLETION_, current);
        final SubLObject completionP = (NIL != completionP_tail) ? cadr(completionP_tail) : NIL;
        final SubLObject color_tail = property_list_member($COLOR, current);
        final SubLObject color = (NIL != color_tail) ? cadr(color_tail) : $html_default_bgcolor$;
        final SubLObject body;
        current = body = temp;
        return list(HTML_DOCUMENT, list(HTML_HEAD, list(HTML_TITLE, list(HTML_PRINC, title)), listS(PWHEN, completionP, $list484)), listS(HTML_COLORED_BODY, list(color), list(HTML_HEADING, $list479, list(HTML_PRINC, title)), append(body, NIL)));
    }

    public static SubLObject html_blockquote(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list485, append(body, NIL));
    }

    public static SubLObject html_center(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list486, append(body, NIL));
    }

    public static SubLObject html_heading(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list487);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list487);
        level = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGN, list(HTML_MARKUP_WRAPPER, $list488, list(HTML_MARKUP, level)), append(body, list(list(HTML_MARKUP_WRAPPER, $list489, list(HTML_MARKUP, level)))));
        }
        cdestructuring_bind_error(datum, $list487);
        return NIL;
    }

    public static SubLObject html_paragraph(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list490, append(body, NIL));
    }

    public static SubLObject html_plaintext(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list491, append(body, NIL));
    }

    public static SubLObject verify_within_html_pre() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $within_html_pre$.getDynamicValue(thread)) {
            Errors.warn($str492$HTML_UNPRE_used_when_not_within_H);
        }
        return NIL;
    }

    public static SubLObject verify_not_within_html_pre() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $within_html_pre$.getDynamicValue(thread)) {
            Errors.warn($str493$Nested_calls_to_HTML_PRE_will_con);
        }
        return NIL;
    }

    public static SubLObject html_pre(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list494, list(HTML_MARKUP_WRAPPER, $list495, listS(CLET, $list496, append(body, NIL))));
    }

    public static SubLObject html_unpre(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, $list497, list(HTML_MARKUP_WRAPPER, $list498, listS(CLET, $list499, $list393, append(body, $list395))));
    }

    public static SubLObject html_address(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list500, append(body, NIL));
    }

    public static SubLObject html_big(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list501, append(body, NIL));
    }

    public static SubLObject html_bold(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list502, append(body, NIL));
    }

    public static SubLObject html_b(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_BOLD, append(body, NIL));
    }

    public static SubLObject html_cite(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list504, append(body, NIL));
    }

    public static SubLObject html_code(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list505, append(body, NIL));
    }

    public static SubLObject html_definition(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list506, append(body, NIL));
    }

    public static SubLObject html_emphasized(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list507, append(body, NIL));
    }

    public static SubLObject html_em(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_EMPHASIZED, append(body, NIL));
    }

    public static SubLObject html_fancy_font(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list509);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list509);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list509);
            if (NIL == member(current_$8, $list510, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list509);
        }
        final SubLObject size_tail = property_list_member($SIZE, current);
        final SubLObject size = (NIL != size_tail) ? cadr(size_tail) : NIL;
        final SubLObject color_tail = property_list_member($COLOR, current);
        final SubLObject color = (NIL != color_tail) ? cadr(color_tail) : NIL;
        final SubLObject face_tail = property_list_member($FACE, current);
        final SubLObject face = (NIL != face_tail) ? cadr(face_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != size) {
            assert NIL != atom(size) : "Types.atom(size) " + "CommonSymbols.NIL != Types.atom(size) " + size;
            attributes = cons(list(PWHEN, size, list(HTML_QUOTED_ATTRIBUTE, $list513, list(HTML_MARKUP, size))), attributes);
        }
        if (NIL != color) {
            assert NIL != atom(color) : "Types.atom(color) " + "CommonSymbols.NIL != Types.atom(color) " + color;
            attributes = cons(list(PWHEN, color, list(HTML_QUOTED_ATTRIBUTE, $list514, list(HTML_MARKUP, list(HTML_COLOR, color)))), attributes);
        }
        if (NIL != face) {
            assert NIL != atom(face) : "Types.atom(face) " + "CommonSymbols.NIL != Types.atom(face) " + face;
            attributes = cons(list(PWHEN, size, list(HTML_QUOTED_ATTRIBUTE, $list515, list(HTML_MARKUP, face))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        if (NIL != attributes) {
            return listS(HTML_MARKUP_WRAPPER, $list516, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject html_font(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list517);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject size = NIL;
        destructuring_bind_must_consp(current, datum, $list517);
        size = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject size_val = $sym518$SIZE_VAL;
            return list(CLET, list(list(size_val, size)), listS(HTML_FANCY_FONT, list($SIZE, size_val), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list517);
        return NIL;
    }

    public static SubLObject html_font_color(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list396);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject color = NIL;
        destructuring_bind_must_consp(current, datum, $list396);
        color = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject color_val = $sym520$COLOR_VAL;
            return list(CLET, list(list(color_val, color)), listS(HTML_FANCY_FONT, list($COLOR, color_val), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list396);
        return NIL;
    }

    public static SubLObject html_text_background_color(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list396);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject color = NIL;
        destructuring_bind_must_consp(current, datum, $list396);
        color = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_SPAN, list($STYLE, list(HTML_STYLE_BACKGROUND_COLOR, color)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list396);
        return NIL;
    }

    public static SubLObject html_italic(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list522, append(body, NIL));
    }

    public static SubLObject html_i(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_ITALIC, append(body, NIL));
    }

    public static SubLObject html_keyboard(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list524, append(body, NIL));
    }

    public static SubLObject html_sample(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list525, append(body, NIL));
    }

    public static SubLObject html_small(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list526, append(body, NIL));
    }

    public static SubLObject html_strikethrough(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list527, append(body, NIL));
    }

    public static SubLObject html_strong(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list528, append(body, NIL));
    }

    public static SubLObject html_subscript(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list529, append(body, NIL));
    }

    public static SubLObject html_superscript(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list530, append(body, NIL));
    }

    public static SubLObject html_teletype(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list531, append(body, NIL));
    }

    public static SubLObject html_tt(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_TELETYPE, append(body, NIL));
    }

    public static SubLObject html_underlined(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list533, append(body, NIL));
    }

    public static SubLObject html_u(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_UNDERLINED, append(body, NIL));
    }

    public static SubLObject html_variable(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list535, append(body, NIL));
    }

    public static SubLObject html_fancy_label(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list536);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$9 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list536);
            current_$9 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list536);
            if (NIL == member(current_$9, $list537, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$9 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list536);
        }
        final SubLObject access_key_tail = property_list_member($ACCESS_KEY, current);
        final SubLObject access_key = (NIL != access_key_tail) ? cadr(access_key_tail) : NIL;
        final SubLObject for_tail = property_list_member($FOR, current);
        final SubLObject v_for = (NIL != for_tail) ? cadr(for_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != access_key) {
            assert NIL != atom(access_key) : "Types.atom(access_key) " + "CommonSymbols.NIL != Types.atom(access_key) " + access_key;
            attributes = cons(list(PWHEN, access_key, list(HTML_QUOTED_ATTRIBUTE, $list540, list(HTML_MARKUP, access_key))), attributes);
        }
        if (NIL != v_for) {
            assert NIL != atom(v_for) : "Types.atom(v_for) " + "CommonSymbols.NIL != Types.atom(v_for) " + v_for;
            attributes = cons(list(PWHEN, v_for, list(HTML_QUOTED_ATTRIBUTE, $list541, list(HTML_MARKUP, list(HTML_COLOR, v_for)))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        if (NIL != attributes) {
            return listS(HTML_MARKUP_WRAPPER, $list542, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject html_definition_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list543, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_compact_definition_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list543, $list544, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_dl_term(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list545, append(body, NIL));
    }

    public static SubLObject html_dl_definition(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list546, append(body, NIL));
    }

    public static SubLObject html_directory_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list547, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_compact_directory_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list547, $list544, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_menu_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list548, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_compact_menu_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list548, $list544, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_fancy_ordered_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list549);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$10 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list549);
            current_$10 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list549);
            if (NIL == member(current_$10, $list550, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$10 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list549);
        }
        final SubLObject compact_tail = property_list_member($COMPACT, current);
        final SubLObject compact = (NIL != compact_tail) ? cadr(compact_tail) : NIL;
        final SubLObject continue_tail = property_list_member($CONTINUE, current);
        final SubLObject v_continue = (NIL != continue_tail) ? cadr(continue_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : NIL;
        final SubLObject seqnum_tail = property_list_member($SEQNUM, current);
        final SubLObject seqnum = (NIL != seqnum_tail) ? cadr(seqnum_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != compact) {
            assert NIL != atom(compact) : "Types.atom(compact) " + "CommonSymbols.NIL != Types.atom(compact) " + compact;
            attributes = cons(listS(PWHEN, compact, $list555), attributes);
        }
        if (NIL != v_continue) {
            assert NIL != atom(v_continue) : "Types.atom(v_continue) " + "CommonSymbols.NIL != Types.atom(v_continue) " + v_continue;
            attributes = cons(listS(PWHEN, v_continue, $list556), attributes);
        }
        if (NIL != type) {
            assert NIL != atom(type) : "Types.atom(type) " + "CommonSymbols.NIL != Types.atom(type) " + type;
            attributes = cons(list(PWHEN, type, list(HTML_QUOTED_ATTRIBUTE, $list557, list(HTML_MARKUP, type))), attributes);
        }
        if (NIL != start) {
            assert NIL != atom(start) : "Types.atom(start) " + "CommonSymbols.NIL != Types.atom(start) " + start;
            attributes = cons(list(PWHEN, start, list(HTML_QUOTED_ATTRIBUTE, $list558, list(HTML_MARKUP, start))), attributes);
        }
        if (NIL != seqnum) {
            assert NIL != atom(seqnum) : "Types.atom(seqnum) " + "CommonSymbols.NIL != Types.atom(seqnum) " + seqnum;
            attributes = cons(list(PWHEN, seqnum, list(HTML_QUOTED_ATTRIBUTE, $list559, list(HTML_MARKUP, seqnum))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list560, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_ordered_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_ORDERED_LIST, NIL, append(body, NIL));
    }

    public static SubLObject html_number_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_ORDERED_LIST, append(body, NIL));
    }

    public static SubLObject html_fancy_unordered_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list563);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$11 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list563);
            current_$11 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list563);
            if (NIL == member(current_$11, $list564, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$11 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list563);
        }
        final SubLObject compact_tail = property_list_member($COMPACT, current);
        final SubLObject compact = (NIL != compact_tail) ? cadr(compact_tail) : NIL;
        final SubLObject plain_tail = property_list_member($PLAIN, current);
        final SubLObject plain = (NIL != plain_tail) ? cadr(plain_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject src_tail = property_list_member($SRC, current);
        final SubLObject src = (NIL != src_tail) ? cadr(src_tail) : NIL;
        final SubLObject dingbat_tail = property_list_member($DINGBAT, current);
        final SubLObject dingbat = (NIL != dingbat_tail) ? cadr(dingbat_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != compact) {
            assert NIL != atom(compact) : "Types.atom(compact) " + "CommonSymbols.NIL != Types.atom(compact) " + compact;
            attributes = cons(listS(PWHEN, compact, $list555), attributes);
        }
        if (NIL != plain) {
            assert NIL != atom(plain) : "Types.atom(plain) " + "CommonSymbols.NIL != Types.atom(plain) " + plain;
            attributes = cons(listS(PWHEN, plain, $list568), attributes);
        }
        if (NIL != type) {
            assert NIL != atom(type) : "Types.atom(type) " + "CommonSymbols.NIL != Types.atom(type) " + type;
            attributes = cons(list(PWHEN, type, list(HTML_QUOTED_ATTRIBUTE, $list557, list(HTML_MARKUP, type))), attributes);
        }
        if (NIL != src) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list569, src.isAtom() ? list(HTML_MARKUP, src) : src), attributes);
        }
        if (NIL != dingbat) {
            assert NIL != atom(dingbat) : "Types.atom(dingbat) " + "CommonSymbols.NIL != Types.atom(dingbat) " + dingbat;
            attributes = cons(list(PWHEN, dingbat, list(HTML_QUOTED_ATTRIBUTE, $list570, list(HTML_MARKUP, dingbat))), attributes);
        }
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list571, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_unordered_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_UNORDERED_LIST, NIL, append(body, NIL));
    }

    public static SubLObject html_bullet_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return bq_cons(HTML_UNORDERED_LIST, append(body, NIL));
    }

    public static SubLObject html_plain_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_UNORDERED_LIST, $list574, append(body, NIL));
    }

    public static SubLObject html_fancy_list_item(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list575);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$12 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list575);
            current_$12 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list575);
            if (NIL == member(current_$12, $list576, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$12 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list575);
        }
        final SubLObject skip_tail = property_list_member($SKIP, current);
        final SubLObject skip = (NIL != skip_tail) ? cadr(skip_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject src_tail = property_list_member($SRC, current);
        final SubLObject src = (NIL != src_tail) ? cadr(src_tail) : NIL;
        final SubLObject dingbat_tail = property_list_member($DINGBAT, current);
        final SubLObject dingbat = (NIL != dingbat_tail) ? cadr(dingbat_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != skip) {
            assert NIL != atom(skip) : "Types.atom(skip) " + "CommonSymbols.NIL != Types.atom(skip) " + skip;
            attributes = cons(list(PWHEN, skip, list(HTML_QUOTED_ATTRIBUTE, $list578, list(HTML_MARKUP, skip))), attributes);
        }
        if (NIL != type) {
            assert NIL != atom(type) : "Types.atom(type) " + "CommonSymbols.NIL != Types.atom(type) " + type;
            attributes = cons(list(PWHEN, type, list(HTML_QUOTED_ATTRIBUTE, $list579, list(HTML_MARKUP, type))), attributes);
        }
        if (NIL != src) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list580, src.isAtom() ? list(HTML_MARKUP, src) : src), attributes);
        }
        if (NIL != id) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list581, id.isAtom() ? list(HTML_MARKUP, id) : id), attributes);
        }
        if (NIL != dingbat) {
            assert NIL != atom(dingbat) : "Types.atom(dingbat) " + "CommonSymbols.NIL != Types.atom(dingbat) " + dingbat;
            attributes = cons(list(PWHEN, dingbat, list(HTML_QUOTED_ATTRIBUTE, $list582, list(HTML_MARKUP, dingbat))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list583, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_list_item(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_LIST_ITEM, NIL, append(body, NIL));
    }

    public static SubLObject html_fancy_summary(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list585);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$13 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list585);
            current_$13 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list585);
            if (NIL == member(current_$13, $list586, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$13 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list585);
        }
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != id) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list581, id.isAtom() ? list(HTML_MARKUP, id) : id), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list587, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_fancy_details(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list585);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$14 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list585);
            current_$14 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list585);
            if (NIL == member(current_$14, $list586, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$14 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list585);
        }
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != id) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list581, id.isAtom() ? list(HTML_MARKUP, id) : id), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list588, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_applet(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject code = NIL;
        destructuring_bind_must_consp(current, datum, $list589);
        code = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list589);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$15 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list589);
            current_$15 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list589);
            if (NIL == member(current_$15, $list590, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$15 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list589);
        }
        final SubLObject codebase_tail = property_list_member($CODEBASE, current);
        final SubLObject codebase = (NIL != codebase_tail) ? cadr(codebase_tail) : NIL;
        final SubLObject archive_tail = property_list_member($ARCHIVE, current);
        final SubLObject archive = (NIL != archive_tail) ? cadr(archive_tail) : NIL;
        final SubLObject alt_tail = property_list_member($ALT, current);
        final SubLObject alt = (NIL != alt_tail) ? cadr(alt_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list596, code.isAtom() ? list(HTML_MARKUP, code) : code), attributes);
        if (NIL != codebase) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list597, codebase.isAtom() ? list(HTML_MARKUP, codebase) : codebase), attributes);
        }
        if (NIL != archive) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list598, archive.isAtom() ? list(HTML_MARKUP, archive) : archive), attributes);
        }
        if (NIL != alt) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list599, alt.isAtom() ? list(HTML_MARKUP, alt) : alt), attributes);
        }
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list600, list(HTML_MARKUP, list(HTML_ALIGN, align)))), attributes);
        }
        if (NIL != name) {
            attributes = cons(list(PWHEN, name, list(HTML_QUOTED_ATTRIBUTE, $list602, list(HTML_MARKUP, name))), attributes);
        }
        if (NIL != id) {
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list603, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != height) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list604, height.isAtom() ? list(HTML_MARKUP, height) : height), attributes);
        }
        if (NIL != width) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list605, width.isAtom() ? list(HTML_MARKUP, width) : width), attributes);
        }
        attributes = nreverse(attributes);
        return listS(HTML_MARKUP_WRAPPER, $list606, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_param(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list607);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list607);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(HTML_MARKUP_WRAPPER, $list608, list(HTML_QUOTED_ATTRIBUTE, $list609, list(HTML_MARKUP, name)), list(HTML_QUOTED_ATTRIBUTE, $list610, list(HTML_MARKUP, value)));
        }
        cdestructuring_bind_error(datum, $list607);
        return NIL;
    }

    public static SubLObject html_safe_param(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list607);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list607);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(HTML_MARKUP_WRAPPER, $list608, list(HTML_QUOTED_ATTRIBUTE, $list609, list(HTML_MARKUP, list(TO_STRING, name))), list(HTML_QUOTED_ATTRIBUTE, $list610, list(PIF, list(STRINGP, value), list(HTML_PRINC, value), list(HTML_PRIN1, value))));
        }
        cdestructuring_bind_error(datum, $list607);
        return NIL;
    }

    public static SubLObject with_html_id_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list615, append(body, NIL));
    }

    public static SubLObject next_html_id(SubLObject generator) {
        if (generator == UNPROVIDED) {
            generator = $html_id_space_id_generator$.getDynamicValue();
        }
        return integer_sequence_generator.integer_sequence_generator_next(generator);
    }

    public static SubLObject next_html_id_definedP(SubLObject generator) {
        if (generator == UNPROVIDED) {
            generator = $html_id_space_id_generator$.getDynamicValue();
        }
        return integer_sequence_generator.integer_sequence_generator_p(generator);
    }

    public static SubLObject with_html_unique_form_fields(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list619, append(body, $list620));
    }

    public static SubLObject with_html_unique_form_field_decoding(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list621);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list621);
        args = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($html_form_field_uniquifier_code$, list(GET_FORM_FIELD_CODE, args))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list621);
        return NIL;
    }

    public static SubLObject next_html_form_field_uniquifier_code() {
        final SubLObject isg = find_or_create_html_form_field_uniquifier_isg();
        return integer_sequence_generator.integer_sequence_generator_next(isg);
    }

    public static SubLObject find_or_create_html_form_field_uniquifier_isg() {
        final SubLObject isg = $html_form_field_uniquifier_isg$.getGlobalValue();
        if (NIL != integer_sequence_generator.integer_sequence_generator_p(isg)) {
            return isg;
        }
        $html_form_field_uniquifier_isg$.setGlobalValue(integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return $html_form_field_uniquifier_isg$.getGlobalValue();
    }

    public static SubLObject embed_form_field_code(final SubLObject code) {
        return html_hidden_input($str626$uniquifier_code, code, UNPROVIDED);
    }

    public static SubLObject get_form_field_code(final SubLObject args) {
        final SubLObject code_string = html_extract_input($str626$uniquifier_code, args);
        return code_string.isString() ? parse_integer(code_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject html_fancy_form(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list628);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject action = NIL;
        destructuring_bind_must_consp(current, datum, $list628);
        action = current.first();
        current = current.rest();
        final SubLObject method = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list628);
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list628);
        current = current.rest();
        final SubLObject name = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list628);
        current = current.rest();
        final SubLObject script = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list628);
        current = current.rest();
        final SubLObject form_id = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list628);
        current = current.rest();
        final SubLObject enctype = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list628);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            SubLObject attributes = NIL;
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list629, action.isAtom() ? list(HTML_MARKUP, action) : action), attributes);
            if (NIL != enctype) {
                assert NIL != atom(enctype) : "Types.atom(enctype) " + "CommonSymbols.NIL != Types.atom(enctype) " + enctype;
                attributes = cons(list(PWHEN, enctype, list(HTML_QUOTED_ATTRIBUTE, $list630, list(HTML_MARKUP, enctype))), attributes);
            }
            if (NIL != form_id) {
                assert NIL != atom(form_id) : "Types.atom(form_id) " + "CommonSymbols.NIL != Types.atom(form_id) " + form_id;
                attributes = cons(list(PWHEN, form_id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, form_id))), attributes);
            }
            if (NIL != method) {
                assert NIL != atom(method) : "Types.atom(method) " + "CommonSymbols.NIL != Types.atom(method) " + method;
                attributes = cons(list(PWHEN, method, list(HTML_QUOTED_ATTRIBUTE, $list631, list(HTML_MARKUP, method))), attributes);
            }
            if (NIL != name) {
                assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
                attributes = cons(list(PWHEN, name, list(HTML_QUOTED_ATTRIBUTE, $list632, list(HTML_MARKUP, name))), attributes);
            }
            if (NIL != target) {
                assert NIL != atom(target) : "Types.atom(target) " + "CommonSymbols.NIL != Types.atom(target) " + target;
                attributes = cons(list(PWHEN, target, list(HTML_QUOTED_ATTRIBUTE, $list633, list(HTML_MARKUP, target))), attributes);
            }
            if (NIL != script) {
                attributes = cons(list(PROGN, $list388, script.isAtom() ? list(HTML_MARKUP, script) : script), attributes);
            }
            attributes = nreverse(attributes);
            return listS(HTML_MARKUP_WRAPPER, $list634, append(attributes, list(list(HTML_MARKUP_BODY, list(CLET, $list635, bq_cons(WITH_HTML_UNIQUE_FORM_FIELDS, append(body, NIL)))))));
        }
        cdestructuring_bind_error(datum, $list628);
        return NIL;
    }

    public static SubLObject html_fancy_input(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list636);
        type = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$16 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list636);
            current_$16 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list636);
            if (NIL == member(current_$16, $list637, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$16 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list636);
        }
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject value_tail = property_list_member($VALUE, current);
        final SubLObject value = (NIL != value_tail) ? cadr(value_tail) : NIL;
        final SubLObject checked_tail = property_list_member($CHECKED, current);
        final SubLObject checked = (NIL != checked_tail) ? cadr(checked_tail) : NIL;
        final SubLObject disabledP_tail = property_list_member($DISABLED_, current);
        final SubLObject disabledP = (NIL != disabledP_tail) ? cadr(disabledP_tail) : NIL;
        final SubLObject readonly_tail = property_list_member($READONLY, current);
        final SubLObject readonly = (NIL != readonly_tail) ? cadr(readonly_tail) : NIL;
        final SubLObject size_tail = property_list_member($SIZE, current);
        final SubLObject size = (NIL != size_tail) ? cadr(size_tail) : NIL;
        final SubLObject maxlength_tail = property_list_member($MAXLENGTH, current);
        final SubLObject maxlength = (NIL != maxlength_tail) ? cadr(maxlength_tail) : NIL;
        final SubLObject src_tail = property_list_member($SRC, current);
        final SubLObject src = (NIL != src_tail) ? cadr(src_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject border_tail = property_list_member($BORDER, current);
        final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : NIL;
        final SubLObject min_tail = property_list_member($MIN, current);
        final SubLObject min = (NIL != min_tail) ? cadr(min_tail) : NIL;
        final SubLObject max_tail = property_list_member($MAX, current);
        final SubLObject max = (NIL != max_tail) ? cadr(max_tail) : NIL;
        final SubLObject step_tail = property_list_member($STEP, current);
        final SubLObject step = (NIL != step_tail) ? cadr(step_tail) : NIL;
        final SubLObject script_tail = property_list_member($SCRIPT, current);
        final SubLObject script = (NIL != script_tail) ? cadr(script_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject onchange_tail = property_list_member($ONCHANGE, current);
        final SubLObject onchange = (NIL != onchange_tail) ? cadr(onchange_tail) : NIL;
        final SubLObject onclick_tail = property_list_member($ONCLICK, current);
        final SubLObject onclick = (NIL != onclick_tail) ? cadr(onclick_tail) : NIL;
        final SubLObject onblur_tail = property_list_member($ONBLUR, current);
        final SubLObject onblur = (NIL != onblur_tail) ? cadr(onblur_tail) : NIL;
        final SubLObject onfocus_tail = property_list_member($ONFOCUS, current);
        final SubLObject onfocus = (NIL != onfocus_tail) ? cadr(onfocus_tail) : NIL;
        final SubLObject onkeyup_tail = property_list_member($ONKEYUP, current);
        final SubLObject onkeyup = (NIL != onkeyup_tail) ? cadr(onkeyup_tail) : NIL;
        final SubLObject onkeydown_tail = property_list_member($ONKEYDOWN, current);
        final SubLObject onkeydown = (NIL != onkeydown_tail) ? cadr(onkeydown_tail) : NIL;
        final SubLObject onkeypress_tail = property_list_member($ONKEYPRESS, current);
        final SubLObject onkeypress = (NIL != onkeypress_tail) ? cadr(onkeypress_tail) : NIL;
        final SubLObject alt_tail = property_list_member($ALT, current);
        final SubLObject alt = (NIL != alt_tail) ? cadr(alt_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject title_tail = property_list_member($TITLE, current);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : NIL;
        SubLObject attributes = NIL;
        SubLObject static_disabledP = NIL;
        assert NIL != atom(type) : "Types.atom(type) " + "CommonSymbols.NIL != Types.atom(type) " + type;
        attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list653, list(HTML_MARKUP, type)), attributes);
        if (NIL != style) {
            assert NIL != atom(style) : "Types.atom(style) " + "CommonSymbols.NIL != Types.atom(style) " + style;
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list654, list(HTML_MARKUP, style)), attributes);
        }
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != name) {
            assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
            attributes = cons(list(PWHEN, name, list(HTML_QUOTED_ATTRIBUTE, $list655, list(HTML_MARKUP, name))), attributes);
        }
        if (NIL != alt) {
            assert NIL != atom(alt) : "Types.atom(alt) " + "CommonSymbols.NIL != Types.atom(alt) " + alt;
            attributes = cons(list(PWHEN, alt, list(HTML_QUOTED_ATTRIBUTE, $list656, list(HTML_MARKUP, alt))), attributes);
        }
        if (NIL != value) {
            assert NIL != atom(value) : "Types.atom(value) " + "CommonSymbols.NIL != Types.atom(value) " + value;
            attributes = cons(list(PWHEN, value, list(HTML_QUOTED_ATTRIBUTE, $list657, list(HTML_PRINC, value))), attributes);
        }
        if (NIL != checked) {
            assert NIL != atom(checked) : "Types.atom(checked) " + "CommonSymbols.NIL != Types.atom(checked) " + checked;
            attributes = cons(listS(PWHEN, checked, $list658), attributes);
        }
        if (NIL != readonly) {
            assert NIL != atom(readonly) : "Types.atom(readonly) " + "CommonSymbols.NIL != Types.atom(readonly) " + readonly;
            attributes = cons(listS(PWHEN, readonly, $list659), attributes);
        }
        if (NIL != disabledP) {
            assert NIL != atom(disabledP) : "Types.atom(disabledP) " + "CommonSymbols.NIL != Types.atom(disabledP) " + disabledP;
            static_disabledP = T;
            attributes = cons(listS(PWHEN, disabledP, $list660), attributes);
        }
        if (NIL != size) {
            assert NIL != atom(size) : "Types.atom(size) " + "CommonSymbols.NIL != Types.atom(size) " + size;
            attributes = cons(list(PWHEN, size, list(HTML_QUOTED_ATTRIBUTE, $list661, list(HTML_MARKUP, size))), attributes);
        }
        if (NIL != maxlength) {
            assert NIL != atom(maxlength) : "Types.atom(maxlength) " + "CommonSymbols.NIL != Types.atom(maxlength) " + maxlength;
            attributes = cons(list(PWHEN, maxlength, list(HTML_QUOTED_ATTRIBUTE, $list662, list(HTML_MARKUP, maxlength))), attributes);
        }
        if (NIL != src) {
            if (src.isAtom()) {
                attributes = cons(list(PWHEN, src, list(HTML_QUOTED_ATTRIBUTE, $list663, list(HTML_MARKUP, src))), attributes);
            } else {
                attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list663, src), attributes);
            }
        }
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list664, list(HTML_MARKUP, list(HTML_ALIGN, align)))), attributes);
        }
        if (NIL != border) {
            assert NIL != atom(border) : "Types.atom(border) " + "CommonSymbols.NIL != Types.atom(border) " + border;
            attributes = cons(list(PWHEN, border, list(HTML_QUOTED_ATTRIBUTE, $list665, list(HTML_MARKUP, border))), attributes);
        }
        if (NIL != min) {
            assert NIL != atom(min) : "Types.atom(min) " + "CommonSymbols.NIL != Types.atom(min) " + min;
            attributes = cons(list(PWHEN, min, list(HTML_QUOTED_ATTRIBUTE, $list666, list(HTML_MARKUP, min))), attributes);
        }
        if (NIL != max) {
            assert NIL != atom(max) : "Types.atom(max) " + "CommonSymbols.NIL != Types.atom(max) " + max;
            attributes = cons(list(PWHEN, max, list(HTML_QUOTED_ATTRIBUTE, $list667, list(HTML_MARKUP, max))), attributes);
        }
        if (NIL != step) {
            assert NIL != atom(step) : "Types.atom(step) " + "CommonSymbols.NIL != Types.atom(step) " + step;
            attributes = cons(list(PWHEN, step, list(HTML_QUOTED_ATTRIBUTE, $list668, list(HTML_MARKUP, step))), attributes);
        }
        if (NIL != script) {
            if (script.isAtom()) {
                attributes = cons(list(PWHEN, script, $list388, list(HTML_MARKUP, script)), attributes);
            } else {
                attributes = cons(list(PROGN, $list388, script), attributes);
            }
        }
        if (NIL != onchange) {
            assert NIL != atom(onchange) : "Types.atom(onchange) " + "CommonSymbols.NIL != Types.atom(onchange) " + onchange;
            attributes = cons(list(PWHEN, onchange, list(HTML_QUOTED_ATTRIBUTE, $list669, list(HTML_MARKUP, onchange))), attributes);
        }
        if (NIL != onclick) {
            assert NIL != atom(onclick) : "Types.atom(onclick) " + "CommonSymbols.NIL != Types.atom(onclick) " + onclick;
            attributes = cons(list(PWHEN, onclick, list(HTML_QUOTED_ATTRIBUTE, $list431, list(HTML_MARKUP, onclick))), attributes);
        }
        if (NIL != onblur) {
            assert NIL != atom(onblur) : "Types.atom(onblur) " + "CommonSymbols.NIL != Types.atom(onblur) " + onblur;
            attributes = cons(list(PWHEN, onblur, list(HTML_QUOTED_ATTRIBUTE, $list670, list(HTML_MARKUP, onblur))), attributes);
        }
        if (NIL != onfocus) {
            assert NIL != atom(onfocus) : "Types.atom(onfocus) " + "CommonSymbols.NIL != Types.atom(onfocus) " + onfocus;
            attributes = cons(list(PWHEN, onfocus, list(HTML_QUOTED_ATTRIBUTE, $list671, list(HTML_MARKUP, onfocus))), attributes);
        }
        if (NIL != onkeyup) {
            assert NIL != atom(onkeyup) : "Types.atom(onkeyup) " + "CommonSymbols.NIL != Types.atom(onkeyup) " + onkeyup;
            attributes = cons(list(PWHEN, onkeyup, list(HTML_QUOTED_ATTRIBUTE, $list672, list(HTML_MARKUP, onkeyup))), attributes);
        }
        if (NIL != onkeydown) {
            assert NIL != atom(onkeydown) : "Types.atom(onkeydown) " + "CommonSymbols.NIL != Types.atom(onkeydown) " + onkeydown;
            attributes = cons(list(PWHEN, onkeydown, list(HTML_QUOTED_ATTRIBUTE, $list673, list(HTML_MARKUP, onkeydown))), attributes);
        }
        if (NIL != onkeypress) {
            assert NIL != atom(onkeypress) : "Types.atom(onkeypress) " + "CommonSymbols.NIL != Types.atom(onkeypress) " + onkeypress;
            attributes = cons(list(PWHEN, onkeypress, list(HTML_QUOTED_ATTRIBUTE, $list674, list(HTML_MARKUP, onkeypress))), attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != title) {
            assert NIL != atom(title) : "Types.atom(title) " + "CommonSymbols.NIL != Types.atom(title) " + title;
            attributes = cons(list(PWHEN, title, list(HTML_QUOTED_ATTRIBUTE, $list432, list(HTML_MARKUP, title))), attributes);
        }
        if (NIL == static_disabledP) {
            attributes = cons($list675, attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list676, append(attributes, NIL));
    }

    public static SubLObject html_script_button(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list677);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list677);
        value = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$17 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list677);
            current_$17 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list677);
            if (NIL == member(current_$17, $list678, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$17 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list677);
        }
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(HTML_FANCY_INPUT, $html_input_button$, $VALUE, value, append(NIL != style ? list($STYLE, style) : NIL, NIL != v_class ? list($CLASS, v_class) : NIL, list($SCRIPT, bq_cons(PROGN, append(body, NIL)))));
    }

    public static SubLObject html_script_radio(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list681);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list681);
        name = current.first();
        current = current.rest();
        final SubLObject value = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list681);
        current = current.rest();
        final SubLObject checkedP = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list681);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(new SubLObject[]{ HTML_FANCY_INPUT, $html_input_radio$, $NAME, name, $VALUE, value, $CHECKED, checkedP, $SCRIPT, bq_cons(PROGN, append(body, NIL)) });
        }
        cdestructuring_bind_error(datum, $list681);
        return NIL;
    }

    public static SubLObject html_script_submit(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list683);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list683);
        value = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$18 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list683);
            current_$18 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list683);
            if (NIL == member(current_$18, $list684, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$18 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list683);
        }
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(HTML_FANCY_INPUT, $html_input_submit$, $VALUE, value, append(NIL != style ? list($STYLE, style) : NIL, NIL != id ? list($ID, id) : NIL, list($SCRIPT, bq_cons(PROGN, append(body, NIL)))));
    }

    public static SubLObject html_fancy_select(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list686);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list686);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$19 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list686);
            current_$19 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list686);
            if (NIL == member(current_$19, $list687, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$19 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list686);
        }
        final SubLObject multiple_tail = property_list_member($MULTIPLE, current);
        final SubLObject multiple = (NIL != multiple_tail) ? cadr(multiple_tail) : NIL;
        final SubLObject size_tail = property_list_member($SIZE, current);
        final SubLObject size = (NIL != size_tail) ? cadr(size_tail) : NIL;
        final SubLObject script_tail = property_list_member($SCRIPT, current);
        final SubLObject script = (NIL != script_tail) ? cadr(script_tail) : NIL;
        final SubLObject onchange_tail = property_list_member($ONCHANGE, current);
        final SubLObject onchange = (NIL != onchange_tail) ? cadr(onchange_tail) : NIL;
        final SubLObject disabledP_tail = property_list_member($DISABLED_, current);
        final SubLObject disabledP = (NIL != disabledP_tail) ? cadr(disabledP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        SubLObject static_disabledP = NIL;
        assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
        attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list689, list(HTML_MARKUP, name)), attributes);
        if (NIL != multiple) {
            assert NIL != atom(multiple) : "Types.atom(multiple) " + "CommonSymbols.NIL != Types.atom(multiple) " + multiple;
            attributes = cons(listS(PWHEN, multiple, $list690), attributes);
        }
        if (NIL != size) {
            assert NIL != atom(size) : "Types.atom(size) " + "CommonSymbols.NIL != Types.atom(size) " + size;
            attributes = cons(list(PWHEN, size, list(HTML_QUOTED_ATTRIBUTE, $list691, list(HTML_MARKUP, size))), attributes);
        }
        if (NIL != script) {
            attributes = cons(list(PROGN, $list388, script.isAtom() ? list(HTML_MARKUP, script) : script), attributes);
        }
        if (NIL != onchange) {
            assert NIL != atom(onchange) : "Types.atom(onchange) " + "CommonSymbols.NIL != Types.atom(onchange) " + onchange;
            attributes = cons(list(PWHEN, onchange, list(HTML_QUOTED_ATTRIBUTE, $list669, list(HTML_MARKUP, onchange))), attributes);
        }
        if (NIL != disabledP) {
            assert NIL != atom(disabledP) : "Types.atom(disabledP) " + "CommonSymbols.NIL != Types.atom(disabledP) " + disabledP;
            static_disabledP = T;
            attributes = cons(listS(PWHEN, disabledP, $list660), attributes);
        }
        if (NIL == static_disabledP) {
            attributes = cons($list675, attributes);
        }
        attributes = nreverse(attributes);
        return listS(HTML_MARKUP_WRAPPER, $list692, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_fancy_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list693);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$20 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list693);
            current_$20 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list693);
            if (NIL == member(current_$20, $list694, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$20 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list693);
        }
        final SubLObject selected_tail = property_list_member($SELECTED, current);
        final SubLObject selected = (NIL != selected_tail) ? cadr(selected_tail) : NIL;
        final SubLObject value_tail = property_list_member($VALUE, current);
        final SubLObject value = (NIL != value_tail) ? cadr(value_tail) : NIL;
        final SubLObject onmouseover_tail = property_list_member($ONMOUSEOVER, current);
        final SubLObject onmouseover = (NIL != onmouseover_tail) ? cadr(onmouseover_tail) : NIL;
        final SubLObject onmouseout_tail = property_list_member($ONMOUSEOUT, current);
        final SubLObject onmouseout = (NIL != onmouseout_tail) ? cadr(onmouseout_tail) : NIL;
        final SubLObject script_tail = property_list_member($SCRIPT, current);
        final SubLObject script = (NIL != script_tail) ? cadr(script_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != selected) {
            assert NIL != atom(selected) : "Types.atom(selected) " + "CommonSymbols.NIL != Types.atom(selected) " + selected;
            attributes = cons(listS(PWHEN, selected, $list698), attributes);
        }
        if (NIL != value) {
            assert NIL != atom(value) : "Types.atom(value) " + "CommonSymbols.NIL != Types.atom(value) " + value;
            attributes = cons(list(PWHEN, value, list(HTML_QUOTED_ATTRIBUTE, $list699, list(HTML_MARKUP, value))), attributes);
        }
        if (NIL != script) {
            attributes = cons(list(PROGN, $list388, script.isAtom() ? list(HTML_MARKUP, script) : script), attributes);
        }
        if (NIL != onmouseout) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list700, onmouseout.isAtom() ? list(HTML_MARKUP, onmouseout) : onmouseout), attributes);
        }
        if (NIL != onmouseover) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list701, onmouseover.isAtom() ? list(HTML_MARKUP, onmouseover) : onmouseover), attributes);
        }
        attributes = nreverse(attributes);
        return listS(HTML_MARKUP_WRAPPER, $list702, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_optgroup(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list703);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$21 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list703);
            current_$21 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list703);
            if (NIL == member(current_$21, $list704, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$21 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list703);
        }
        final SubLObject label_tail = property_list_member($LABEL, current);
        final SubLObject label = (NIL != label_tail) ? cadr(label_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != label) {
            assert NIL != atom(label) : "Types.atom(label) " + "CommonSymbols.NIL != Types.atom(label) " + label;
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list706, label.isAtom() ? list(HTML_MARKUP, label) : label), attributes);
        }
        attributes = nreverse(attributes);
        return listS(HTML_MARKUP_WRAPPER, $list707, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_fancy_textarea(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list708);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list708);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$22 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list708);
            current_$22 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list708);
            if (NIL == member(current_$22, $list709, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$22 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list708);
        }
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject cols_tail = property_list_member($COLS, current);
        final SubLObject cols = (NIL != cols_tail) ? cadr(cols_tail) : NIL;
        final SubLObject rows_tail = property_list_member($ROWS, current);
        final SubLObject rows = (NIL != rows_tail) ? cadr(rows_tail) : NIL;
        final SubLObject wrap_tail = property_list_member($WRAP, current);
        final SubLObject wrap = (NIL != wrap_tail) ? cadr(wrap_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
        attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list713, list(HTML_MARKUP, name)), attributes);
        if (NIL != cols) {
            assert NIL != atom(cols) : "Types.atom(cols) " + "CommonSymbols.NIL != Types.atom(cols) " + cols;
            attributes = cons(list(PWHEN, cols, list(HTML_QUOTED_ATTRIBUTE, $list714, list(HTML_MARKUP, cols))), attributes);
        }
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list715, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != rows) {
            assert NIL != atom(rows) : "Types.atom(rows) " + "CommonSymbols.NIL != Types.atom(rows) " + rows;
            attributes = cons(list(PWHEN, rows, list(HTML_QUOTED_ATTRIBUTE, $list716, list(HTML_MARKUP, rows))), attributes);
        }
        if (NIL != wrap) {
            attributes = cons(listS(PWHEN, wrap, $list717), attributes);
        }
        if (NIL != style) {
            assert NIL != atom(style) : "Types.atom(style) " + "CommonSymbols.NIL != Types.atom(style) " + style;
            attributes = cons(list(PWHEN, style, list(HTML_QUOTED_ATTRIBUTE, $list718, list(HTML_MARKUP, style))), attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        attributes = nreverse(attributes);
        return listS(HTML_MARKUP_WRAPPER, $list719, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_table_caption(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list720);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject align = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list720);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list720);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
        return list(HTML_MARKUP_WRAPPER, $list721, list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list722, list(HTML_MARKUP, list(HTML_ALIGN, align)))), bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_fancy_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list723);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$23 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list723);
            current_$23 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list723);
            if (NIL == member(current_$23, $list724, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$23 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list723);
        }
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject noflow_tail = property_list_member($NOFLOW, current);
        final SubLObject noflow = (NIL != noflow_tail) ? cadr(noflow_tail) : NIL;
        final SubLObject nowrap_tail = property_list_member($NOWRAP, current);
        final SubLObject nowrap = (NIL != nowrap_tail) ? cadr(nowrap_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject border_tail = property_list_member($BORDER, current);
        final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : NIL;
        final SubLObject bordercolor_tail = property_list_member($BORDERCOLOR, current);
        final SubLObject bordercolor = (NIL != bordercolor_tail) ? cadr(bordercolor_tail) : NIL;
        final SubLObject cellpadding_tail = property_list_member($CELLPADDING, current);
        final SubLObject cellpadding = (NIL != cellpadding_tail) ? cadr(cellpadding_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject cellspacing_tail = property_list_member($CELLSPACING, current);
        final SubLObject cellspacing = (NIL != cellspacing_tail) ? cadr(cellspacing_tail) : NIL;
        final SubLObject colspec_tail = property_list_member($COLSPEC, current);
        final SubLObject colspec = (NIL != colspec_tail) ? cadr(colspec_tail) : NIL;
        final SubLObject units_tail = property_list_member($UNITS, current);
        final SubLObject units = (NIL != units_tail) ? cadr(units_tail) : NIL;
        final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
        final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject background_tail = property_list_member($BACKGROUND, current);
        final SubLObject background = (NIL != background_tail) ? cadr(background_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != noflow) {
            assert NIL != atom(noflow) : "Types.atom(noflow) " + "CommonSymbols.NIL != Types.atom(noflow) " + noflow;
            attributes = cons(listS(PWHEN, noflow, $list734), attributes);
        }
        if (NIL != nowrap) {
            assert NIL != atom(nowrap) : "Types.atom(nowrap) " + "CommonSymbols.NIL != Types.atom(nowrap) " + nowrap;
            attributes = cons(listS(PWHEN, nowrap, $list735), attributes);
        }
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list736, list(HTML_MARKUP, list(HTML_ALIGN, align)))), attributes);
        }
        if (NIL != border) {
            assert NIL != atom(border) : "Types.atom(border) " + "CommonSymbols.NIL != Types.atom(border) " + border;
            attributes = cons(list(PWHEN, border, list(HTML_QUOTED_ATTRIBUTE, $list737, list(HTML_MARKUP, border))), attributes);
        }
        if (NIL != bordercolor) {
            assert NIL != atom(bordercolor) : "Types.atom(bordercolor) " + "CommonSymbols.NIL != Types.atom(bordercolor) " + bordercolor;
            attributes = cons(list(PWHEN, bordercolor, list(HTML_QUOTED_ATTRIBUTE, $list738, list(HTML_MARKUP, bordercolor))), attributes);
        }
        if (NIL != cellpadding) {
            assert NIL != atom(cellpadding) : "Types.atom(cellpadding) " + "CommonSymbols.NIL != Types.atom(cellpadding) " + cellpadding;
            attributes = cons(list(PWHEN, cellpadding, list(HTML_QUOTED_ATTRIBUTE, $list739, list(HTML_MARKUP, cellpadding))), attributes);
        }
        if (NIL != cellspacing) {
            assert NIL != atom(cellspacing) : "Types.atom(cellspacing) " + "CommonSymbols.NIL != Types.atom(cellspacing) " + cellspacing;
            attributes = cons(list(PWHEN, cellspacing, list(HTML_QUOTED_ATTRIBUTE, $list740, list(HTML_MARKUP, cellspacing))), attributes);
        }
        if (NIL != colspec) {
            assert NIL != atom(colspec) : "Types.atom(colspec) " + "CommonSymbols.NIL != Types.atom(colspec) " + colspec;
            attributes = cons(list(PWHEN, colspec, list(HTML_QUOTED_ATTRIBUTE, $list741, list(HTML_MARKUP, colspec))), attributes);
        }
        if (NIL != style) {
            assert NIL != atom(style) : "Types.atom(style) " + "CommonSymbols.NIL != Types.atom(style) " + style;
            attributes = cons(list(PWHEN, style, list(HTML_QUOTED_ATTRIBUTE, $list742, list(HTML_MARKUP, list(HTML_ALIGN, style)))), attributes);
        }
        if (NIL != units) {
            assert NIL != atom(units) : "Types.atom(units) " + "CommonSymbols.NIL != Types.atom(units) " + units;
            attributes = cons(list(PWHEN, units, list(HTML_QUOTED_ATTRIBUTE, $list743, list(HTML_MARKUP, units))), attributes);
        }
        if (NIL != bgcolor) {
            assert NIL != atom(bgcolor) : "Types.atom(bgcolor) " + "CommonSymbols.NIL != Types.atom(bgcolor) " + bgcolor;
            attributes = cons(list(PWHEN, bgcolor, list(HTML_QUOTED_ATTRIBUTE, $list744, list(HTML_MARKUP, bgcolor))), attributes);
        }
        if (NIL != width) {
            assert NIL != atom(width) : "Types.atom(width) " + "CommonSymbols.NIL != Types.atom(width) " + width;
            attributes = cons(list(PWHEN, width, list(HTML_QUOTED_ATTRIBUTE, $list745, list(HTML_MARKUP, width))), attributes);
        }
        if (NIL != background) {
            assert NIL != atom(width) : "Types.atom(width) " + "CommonSymbols.NIL != Types.atom(width) " + width;
            attributes = cons(list(PWHEN, background, list(HTML_QUOTED_ATTRIBUTE, $list746, list(HTML_MARKUP, background))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list747, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list748);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject border = NIL;
        destructuring_bind_must_consp(current, datum, $list748);
        border = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_TABLE, list($BORDER, border), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list748);
        return NIL;
    }

    public static SubLObject html_fancy_table_data(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list750);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$24 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list750);
            current_$24 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list750);
            if (NIL == member(current_$24, $list751, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$24 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list750);
        }
        final SubLObject nowrap_tail = property_list_member($NOWRAP, current);
        final SubLObject nowrap = (NIL != nowrap_tail) ? cadr(nowrap_tail) : NIL;
        final SubLObject colspan_tail = property_list_member($COLSPAN, current);
        final SubLObject colspan = (NIL != colspan_tail) ? cadr(colspan_tail) : NIL;
        final SubLObject rowspan_tail = property_list_member($ROWSPAN, current);
        final SubLObject rowspan = (NIL != rowspan_tail) ? cadr(rowspan_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject valign_tail = property_list_member($VALIGN, current);
        final SubLObject valign = (NIL != valign_tail) ? cadr(valign_tail) : NIL;
        final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
        final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject title_tail = property_list_member($TITLE, current);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != nowrap) {
            assert NIL != atom(nowrap) : "Types.atom(nowrap) " + "CommonSymbols.NIL != Types.atom(nowrap) " + nowrap;
            attributes = cons(listS(PWHEN, nowrap, $list755), attributes);
        }
        if (NIL != colspan) {
            assert NIL != atom(colspan) : "Types.atom(colspan) " + "CommonSymbols.NIL != Types.atom(colspan) " + colspan;
            attributes = cons(list(PWHEN, colspan, list(HTML_QUOTED_ATTRIBUTE, $list756, list(HTML_MARKUP, colspan))), attributes);
        }
        if (NIL != rowspan) {
            assert NIL != atom(rowspan) : "Types.atom(rowspan) " + "CommonSymbols.NIL != Types.atom(rowspan) " + rowspan;
            attributes = cons(list(PWHEN, rowspan, list(HTML_QUOTED_ATTRIBUTE, $list757, list(HTML_MARKUP, rowspan))), attributes);
        }
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list758, list(HTML_MARKUP, list(HTML_ALIGN, align)))), attributes);
        }
        if (NIL != valign) {
            assert NIL != atom(valign) : "Types.atom(valign) " + "CommonSymbols.NIL != Types.atom(valign) " + valign;
            attributes = cons(list(PWHEN, valign, list(HTML_QUOTED_ATTRIBUTE, $list759, list(HTML_MARKUP, list(HTML_ALIGN, valign)))), attributes);
        }
        if (NIL != bgcolor) {
            assert NIL != atom(bgcolor) : "Types.atom(bgcolor) " + "CommonSymbols.NIL != Types.atom(bgcolor) " + bgcolor;
            attributes = cons(list(PWHEN, bgcolor, list(HTML_QUOTED_ATTRIBUTE, $list760, list(HTML_MARKUP, bgcolor))), attributes);
        }
        if (NIL != width) {
            assert NIL != atom(width) : "Types.atom(width) " + "CommonSymbols.NIL != Types.atom(width) " + width;
            attributes = cons(list(PWHEN, width, list(HTML_QUOTED_ATTRIBUTE, $list761, list(HTML_MARKUP, width))), attributes);
        }
        if (NIL != height) {
            assert NIL != atom(height) : "Types.atom(height) " + "CommonSymbols.NIL != Types.atom(height) " + height;
            attributes = cons(list(PWHEN, height, list(HTML_QUOTED_ATTRIBUTE, $list762, list(HTML_MARKUP, height))), attributes);
        }
        if (NIL != style) {
            assert NIL != atom(style) : "Types.atom(style) " + "CommonSymbols.NIL != Types.atom(style) " + style;
            attributes = cons(list(PWHEN, style, list(HTML_QUOTED_ATTRIBUTE, $list742, list(HTML_MARKUP, list(HTML_ALIGN, style)))), attributes);
        }
        if (NIL != title) {
            assert NIL != atom(title) : "Types.atom(title) " + "CommonSymbols.NIL != Types.atom(title) " + title;
            attributes = cons(list(PWHEN, title, list(HTML_QUOTED_ATTRIBUTE, $list432, list(HTML_MARKUP, title))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list763, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_table_data(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_TABLE_DATA, NIL, append(body, NIL));
    }

    public static SubLObject html_fancy_table_header(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list765);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$25 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list765);
            current_$25 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list765);
            if (NIL == member(current_$25, $list766, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$25 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list765);
        }
        final SubLObject nowrap_tail = property_list_member($NOWRAP, current);
        final SubLObject nowrap = (NIL != nowrap_tail) ? cadr(nowrap_tail) : NIL;
        final SubLObject colspan_tail = property_list_member($COLSPAN, current);
        final SubLObject colspan = (NIL != colspan_tail) ? cadr(colspan_tail) : NIL;
        final SubLObject rowspan_tail = property_list_member($ROWSPAN, current);
        final SubLObject rowspan = (NIL != rowspan_tail) ? cadr(rowspan_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject valign_tail = property_list_member($VALIGN, current);
        final SubLObject valign = (NIL != valign_tail) ? cadr(valign_tail) : NIL;
        final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
        final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject title_tail = property_list_member($TITLE, current);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != nowrap) {
            assert NIL != atom(nowrap) : "Types.atom(nowrap) " + "CommonSymbols.NIL != Types.atom(nowrap) " + nowrap;
            attributes = cons(listS(PWHEN, nowrap, $list755), attributes);
        }
        if (NIL != colspan) {
            assert NIL != atom(colspan) : "Types.atom(colspan) " + "CommonSymbols.NIL != Types.atom(colspan) " + colspan;
            attributes = cons(list(PWHEN, colspan, list(HTML_QUOTED_ATTRIBUTE, $list756, list(HTML_MARKUP, colspan))), attributes);
        }
        if (NIL != rowspan) {
            assert NIL != atom(rowspan) : "Types.atom(rowspan) " + "CommonSymbols.NIL != Types.atom(rowspan) " + rowspan;
            attributes = cons(list(PWHEN, rowspan, list(HTML_QUOTED_ATTRIBUTE, $list757, list(HTML_MARKUP, rowspan))), attributes);
        }
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list758, list(HTML_MARKUP, list(HTML_ALIGN, align)))), attributes);
        }
        if (NIL != valign) {
            assert NIL != atom(valign) : "Types.atom(valign) " + "CommonSymbols.NIL != Types.atom(valign) " + valign;
            attributes = cons(list(PWHEN, valign, list(HTML_QUOTED_ATTRIBUTE, $list759, list(HTML_MARKUP, list(HTML_ALIGN, valign)))), attributes);
        }
        if (NIL != bgcolor) {
            assert NIL != atom(bgcolor) : "Types.atom(bgcolor) " + "CommonSymbols.NIL != Types.atom(bgcolor) " + bgcolor;
            attributes = cons(list(PWHEN, bgcolor, list(HTML_QUOTED_ATTRIBUTE, $list760, list(HTML_MARKUP, bgcolor))), attributes);
        }
        if (NIL != width) {
            assert NIL != atom(width) : "Types.atom(width) " + "CommonSymbols.NIL != Types.atom(width) " + width;
            attributes = cons(list(PWHEN, width, list(HTML_QUOTED_ATTRIBUTE, $list761, list(HTML_MARKUP, width))), attributes);
        }
        if (NIL != height) {
            assert NIL != atom(height) : "Types.atom(height) " + "CommonSymbols.NIL != Types.atom(height) " + height;
            attributes = cons(list(PWHEN, height, list(HTML_QUOTED_ATTRIBUTE, $list762, list(HTML_MARKUP, height))), attributes);
        }
        if (NIL != title) {
            assert NIL != atom(title) : "Types.atom(title) " + "CommonSymbols.NIL != Types.atom(title) " + title;
            attributes = cons(list(PWHEN, title, list(HTML_QUOTED_ATTRIBUTE, $list767, list(HTML_MARKUP, list(HTML_ALIGN, title)))), attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != style) {
            assert NIL != atom(style) : "Types.atom(style) " + "CommonSymbols.NIL != Types.atom(style) " + style;
            attributes = cons(list(PWHEN, style, list(HTML_QUOTED_ATTRIBUTE, $list742, list(HTML_MARKUP, list(HTML_ALIGN, style)))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list768, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_table_heading(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_TABLE_HEADER, NIL, append(body, NIL));
    }

    public static SubLObject html_table_header_block(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list770, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_table_footer_block(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list771, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_table_body_block(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list772, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_fancy_table_row(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list773);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$26 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list773);
            current_$26 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list773);
            if (NIL == member(current_$26, $list774, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$26 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list773);
        }
        final SubLObject title_tail = property_list_member($TITLE, current);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject valign_tail = property_list_member($VALIGN, current);
        final SubLObject valign = (NIL != valign_tail) ? cadr(valign_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject bgcolor_tail = property_list_member($BGCOLOR, current);
        final SubLObject bgcolor = (NIL != bgcolor_tail) ? cadr(bgcolor_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list758, list(HTML_MARKUP, align))), attributes);
        }
        if (NIL != title) {
            assert NIL != atom(title) : "Types.atom(title) " + "CommonSymbols.NIL != Types.atom(title) " + title;
            attributes = cons(list(PWHEN, title, list(HTML_QUOTED_ATTRIBUTE, $list767, list(HTML_MARKUP, list(HTML_ALIGN, title)))), attributes);
        }
        if (NIL != name) {
            assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
            attributes = cons(list(PWHEN, name, list(HTML_QUOTED_ATTRIBUTE, $list775, list(HTML_MARKUP, list(HTML_ALIGN, name)))), attributes);
        }
        if (NIL != style) {
            assert NIL != atom(style) : "Types.atom(style) " + "CommonSymbols.NIL != Types.atom(style) " + style;
            attributes = cons(list(PWHEN, style, list(HTML_QUOTED_ATTRIBUTE, $list742, list(HTML_MARKUP, list(HTML_ALIGN, style)))), attributes);
        }
        if (NIL != valign) {
            assert NIL != atom(valign) : "Types.atom(valign) " + "CommonSymbols.NIL != Types.atom(valign) " + valign;
            attributes = cons(list(PWHEN, valign, list(HTML_QUOTED_ATTRIBUTE, $list759, list(HTML_MARKUP, list(HTML_ALIGN, valign)))), attributes);
        }
        if (NIL != height) {
            assert NIL != atom(height) : "Types.atom(height) " + "CommonSymbols.NIL != Types.atom(height) " + height;
            attributes = cons(list(PWHEN, height, list(HTML_QUOTED_ATTRIBUTE, $list776, list(HTML_MARKUP, height))), attributes);
        }
        if (NIL != bgcolor) {
            assert NIL != atom(bgcolor) : "Types.atom(bgcolor) " + "CommonSymbols.NIL != Types.atom(bgcolor) " + bgcolor;
            attributes = cons(list(PWHEN, bgcolor, list(HTML_QUOTED_ATTRIBUTE, $list777, list(HTML_MARKUP, bgcolor))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, id))), attributes);
        }
        return listS(PROGN, listS(HTML_MARKUP_WRAPPER, $list778, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL))))), $list395);
    }

    public static SubLObject html_table_row(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_TABLE_ROW, NIL, append(body, NIL));
    }

    public static SubLObject html_indent_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list780);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject indent_width = NIL;
        destructuring_bind_must_consp(current, datum, $list780);
        indent_width = current.first();
        current = current.rest();
        final SubLObject max_indent = (current.isCons()) ? current.first() : TWENTY_INTEGER;
        destructuring_bind_must_listp(current, datum, $list780);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(HTML_FANCY_TABLE, $list781, listS(CLET, list(list($html_indent_table_max$, max_indent)), append(body, list(list(HTML_INDENT_TABLE_INTERNAL, indent_width)))));
        }
        cdestructuring_bind_error(datum, $list780);
        return NIL;
    }

    public static SubLObject html_indent_row(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list784);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject indent_amount = NIL;
        destructuring_bind_must_consp(current, datum, $list784);
        indent_amount = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject indent = $sym785$INDENT;
            final SubLObject span = $sym786$SPAN;
            return list(CLET, list(list(indent, indent_amount), list(span, list(MAX, ONE_INTEGER, list($sym788$_, $html_indent_table_max$, indent)))), list(HTML_TABLE_ROW, list(HTML_INDENT_ROW_INTERNAL, indent), listS(HTML_FANCY_TABLE_DATA, list($COLSPAN, span), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list784);
        return NIL;
    }

    public static SubLObject html_indented_line(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list791);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject indent_amount = NIL;
        destructuring_bind_must_consp(current, datum, $list791);
        indent_amount = current.first();
        current = current.rest();
        final SubLObject newlineP = (current.isCons()) ? current.first() : T;
        destructuring_bind_must_listp(current, datum, $list791);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(PWHEN, newlineP, $list792), listS(HTML_NO_BREAK, list(HTML_INDENT, indent_amount), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list791);
        return NIL;
    }

    public static SubLObject html_indented_line_inverse(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list791);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject indent_amount = NIL;
        destructuring_bind_must_consp(current, datum, $list791);
        indent_amount = current.first();
        current = current.rest();
        final SubLObject newlineP = (current.isCons()) ? current.first() : T;
        destructuring_bind_must_listp(current, datum, $list791);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(HTML_NO_BREAK, list(HTML_INDENT, indent_amount), append(body, NIL)), listS(PWHEN, newlineP, $list792));
        }
        cdestructuring_bind_error(datum, $list791);
        return NIL;
    }

    public static SubLObject cdolist_with_alternating_bgcolor(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list795);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject listform = NIL;
        SubLObject bgcolor_var = NIL;
        destructuring_bind_must_consp(current, datum, $list795);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list795);
        listform = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list795);
        bgcolor_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$27 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list795);
            current_$27 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list795);
            if (NIL == member(current_$27, $list796, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$27 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list795);
        }
        final SubLObject color1_tail = property_list_member($COLOR1, current);
        final SubLObject color1 = (NIL != color1_tail) ? cadr(color1_tail) : $html_color_light_grey$.getGlobalValue();
        final SubLObject color2_tail = property_list_member($COLOR2, current);
        final SubLObject color2 = (NIL != color2_tail) ? cadr(color2_tail) : $html_color_lighter_grey$.getGlobalValue();
        final SubLObject counter_tail = property_list_member($COUNTER, current);
        final SubLObject counter = (NIL != counter_tail) ? cadr(counter_tail) : IGNORE_ME;
        final SubLObject body;
        current = body = temp;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!bgcolor_var.isSymbol())) {
            Errors.error($str801$Malformed_cdolist_with_alternatin, bgcolor_var);
        }
        final SubLObject color_toggle = $sym802$COLOR_TOGGLE;
        return list(CLET, list(bq_cons(color_toggle, $list803)), listS(CDOLIST_NUMBERED, list(var, counter, listform), list(PIF, color_toggle, listS(CSETQ, color_toggle, $list803), listS(CSETQ, color_toggle, $list806)), list(CSETQ, bgcolor_var, list(FIF, color_toggle, color2, color1)), append(body, NIL)));
    }

    public static SubLObject cdolist_with_cyc_logo_colors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list808);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject listform = NIL;
        SubLObject bgcolor_var = NIL;
        destructuring_bind_must_consp(current, datum, $list808);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list808);
        listform = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list808);
        bgcolor_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$28 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list808);
            current_$28 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list808);
            if (NIL == member(current_$28, $list809, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$28 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list808);
        }
        final SubLObject counter_tail = property_list_member($COUNTER, current);
        final SubLObject counter = (NIL != counter_tail) ? cadr(counter_tail) : IGNORE_ME;
        final SubLObject body;
        current = body = temp;
        return listS(CDOLIST_WITH_ALTERNATING_BGCOLOR, list(new SubLObject[]{ var, listform, bgcolor_var, $COLOR1, $html_color_cyc_logo_light_violet$, $COLOR2, $html_color_cyc_logo_lighter_violet$, $COUNTER, counter }), append(body, NIL));
    }

    public static SubLObject cdolist_with_cyc_background_colors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list808);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject listform = NIL;
        SubLObject bgcolor_var = NIL;
        destructuring_bind_must_consp(current, datum, $list808);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list808);
        listform = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list808);
        bgcolor_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$29 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list808);
            current_$29 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list808);
            if (NIL == member(current_$29, $list809, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$29 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list808);
        }
        final SubLObject counter_tail = property_list_member($COUNTER, current);
        final SubLObject counter = (NIL != counter_tail) ? cadr(counter_tail) : IGNORE_ME;
        final SubLObject body;
        current = body = temp;
        return listS(CDOLIST_WITH_ALTERNATING_BGCOLOR, list(new SubLObject[]{ var, listform, bgcolor_var, $COLOR1, $html_color_cyc_logo_light_blue$, $COLOR2, $html_color_cyc_logo_lighter_blue$, $COUNTER, counter }), append(body, NIL));
    }

    public static SubLObject cdolist_with_alternating_variable(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list815);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject listform = NIL;
        SubLObject alternator_var = NIL;
        destructuring_bind_must_consp(current, datum, $list815);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list815);
        listform = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list815);
        alternator_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$30 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list815);
            current_$30 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list815);
            if (NIL == member(current_$30, $list816, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$30 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list815);
        }
        final SubLObject alternative1_tail = property_list_member($ALTERNATIVE1, current);
        final SubLObject alternative1 = (NIL != alternative1_tail) ? cadr(alternative1_tail) : $html_alternating_class1$.getDynamicValue(thread);
        final SubLObject alternative2_tail = property_list_member($ALTERNATIVE2, current);
        final SubLObject alternative2 = (NIL != alternative2_tail) ? cadr(alternative2_tail) : $html_alternating_class2$.getDynamicValue(thread);
        final SubLObject counter_tail = property_list_member($COUNTER, current);
        final SubLObject counter = (NIL != counter_tail) ? cadr(counter_tail) : IGNORE_ME;
        final SubLObject body;
        current = body = temp;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!alternator_var.isSymbol())) {
            Errors.error($str819$Malformed_cdolist_with_alternatin, alternator_var);
        }
        final SubLObject alternator_toggle = $sym820$ALTERNATOR_TOGGLE;
        return list(CLET, list(bq_cons(alternator_toggle, $list803)), listS(CDOLIST_NUMBERED, list(var, counter, listform), list(PIF, alternator_toggle, listS(CSETQ, alternator_toggle, $list803), listS(CSETQ, alternator_toggle, $list806)), list(CSETQ, alternator_var, list(FIF, alternator_toggle, alternative2, alternative1)), append(body, NIL)));
    }

    public static SubLObject cdolist_with_alternating_classes(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list821);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject listform = NIL;
        SubLObject class_var = NIL;
        destructuring_bind_must_consp(current, datum, $list821);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list821);
        listform = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list821);
        class_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$31 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list821);
            current_$31 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list821);
            if (NIL == member(current_$31, $list822, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$31 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list821);
        }
        final SubLObject counter_tail = property_list_member($COUNTER, current);
        final SubLObject counter = (NIL != counter_tail) ? cadr(counter_tail) : IGNORE_ME;
        final SubLObject class1_tail = property_list_member($CLASS1, current);
        final SubLObject class1 = (NIL != class1_tail) ? cadr(class1_tail) : $html_alternating_class1$.getDynamicValue(thread);
        final SubLObject class2_tail = property_list_member($CLASS2, current);
        final SubLObject class2 = (NIL != class2_tail) ? cadr(class2_tail) : $html_alternating_class2$.getDynamicValue(thread);
        final SubLObject body;
        current = body = temp;
        return listS(CDOLIST_WITH_ALTERNATING_VARIABLE, list(new SubLObject[]{ var, listform, class_var, $ALTERNATIVE1, class1, $ALTERNATIVE2, class2, $COUNTER, counter }), append(body, NIL));
    }

    public static SubLObject switch_cyc_logo_color(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list826);
        var = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, var, listS(FIF, listS(EQUAL, var, $list827), $list828));
        }
        cdestructuring_bind_error(datum, $list826);
        return NIL;
    }

    public static SubLObject html_fancy_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list829);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$32 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list829);
            current_$32 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list829);
            if (NIL == member(current_$32, $list830, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$32 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list829);
        }
        final SubLObject href_tail = property_list_member($HREF, current);
        final SubLObject href = (NIL != href_tail) ? cadr(href_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject title_tail = property_list_member($TITLE, current);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : NIL;
        final SubLObject target_tail = property_list_member($TARGET, current);
        final SubLObject target = (NIL != target_tail) ? cadr(target_tail) : NIL;
        final SubLObject script_tail = property_list_member($SCRIPT, current);
        final SubLObject script = (NIL != script_tail) ? cadr(script_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject onmouseover_tail = property_list_member($ONMOUSEOVER, current);
        final SubLObject onmouseover = (NIL != onmouseover_tail) ? cadr(onmouseover_tail) : NIL;
        final SubLObject onmouseout_tail = property_list_member($ONMOUSEOUT, current);
        final SubLObject onmouseout = (NIL != onmouseout_tail) ? cadr(onmouseout_tail) : NIL;
        final SubLObject onmousedown_tail = property_list_member($ONMOUSEDOWN, current);
        final SubLObject onmousedown = (NIL != onmousedown_tail) ? cadr(onmousedown_tail) : NIL;
        final SubLObject onmouseup_tail = property_list_member($ONMOUSEUP, current);
        final SubLObject onmouseup = (NIL != onmouseup_tail) ? cadr(onmouseup_tail) : NIL;
        final SubLObject onclick_tail = property_list_member($ONCLICK, current);
        final SubLObject onclick = (NIL != onclick_tail) ? cadr(onclick_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject attrs_tail = property_list_member($ATTRS, current);
        final SubLObject attrs = (NIL != attrs_tail) ? cadr(attrs_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != href) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list835, href.isAtom() ? list(HTML_MARKUP, href) : href), attributes);
        }
        if (NIL != name) {
            assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
            attributes = cons(list(PWHEN, name, list(HTML_QUOTED_ATTRIBUTE, $list836, list(HTML_MARKUP, name))), attributes);
        }
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list837, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != title) {
            assert NIL != atom(title) : "Types.atom(title) " + "CommonSymbols.NIL != Types.atom(title) " + title;
            attributes = cons(list(PWHEN, title, list(HTML_QUOTED_ATTRIBUTE, $list838, list(HTML_MARKUP, title))), attributes);
        }
        if (NIL != target) {
            assert NIL != atom(target) : "Types.atom(target) " + "CommonSymbols.NIL != Types.atom(target) " + target;
            attributes = cons(list(PWHEN, target, list(HTML_QUOTED_ATTRIBUTE, $list839, list(HTML_MARKUP, target))), attributes);
        }
        if (NIL != style) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list840, style.isAtom() ? list(HTML_MARKUP, style) : style), attributes);
        }
        if (NIL != onmouseover) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list701, onmouseover.isAtom() ? list(HTML_MARKUP, onmouseover) : onmouseover), attributes);
        }
        if (NIL != onmouseup) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list841, onmouseup.isAtom() ? list(HTML_MARKUP, onmouseup) : onmouseup), attributes);
        }
        if (NIL != onmousedown) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list842, onmousedown.isAtom() ? list(HTML_MARKUP, onmousedown) : onmousedown), attributes);
        }
        if (NIL != onmouseout) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list700, onmouseout.isAtom() ? list(HTML_MARKUP, onmouseout) : onmouseout), attributes);
        }
        if (NIL != onclick) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list431, onclick.isAtom() ? list(HTML_MARKUP, onclick) : onclick), attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != script) {
            attributes = cons(list(PROGN, $list388, script.isAtom() ? list(HTML_MARKUP, script) : script), attributes);
        }
        if (NIL != attrs) {
            SubLObject cdolist_list_var = attrs;
            SubLObject attr = NIL;
            attr = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject attr_name = attr.first();
                final SubLObject attr_value = second(attr);
                attributes = cons(list(HTML_QUOTED_ATTRIBUTE, list(cconcatenate($$$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(attr_name), $str844$_ })), list(HTML_MARKUP, attr_value)), attributes);
                cdolist_list_var = cdolist_list_var.rest();
                attr = cdolist_list_var.first();
            } 
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list845, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_script_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list846);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject linktext = NIL;
        destructuring_bind_must_consp(current, datum, $list846);
        linktext = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$33 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list846);
            current_$33 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list846);
            if (NIL == member(current_$33, $list847, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$33 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list846);
        }
        final SubLObject href_tail = property_list_member($HREF, current);
        final SubLObject href = (NIL != href_tail) ? cadr(href_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject target_tail = property_list_member($TARGET, current);
        final SubLObject target = (NIL != target_tail) ? cadr(target_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(HTML_FANCY_ANCHOR, list(new SubLObject[]{ $HREF, href, $NAME, name, $TARGET, target, $STYLE, style, $CLASS, v_class, $SCRIPT, bq_cons(PROGN, append(body, NIL)) }), linktext.isAtom() ? list(HTML_MARKUP, linktext) : linktext);
    }

    public static SubLObject html_target_reference(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list849);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list849);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_ANCHOR, list($HREF, list(PROGN, $list850, list(HTML_MARKUP, name))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list849);
        return NIL;
    }

    public static SubLObject html_mailto_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list851);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject address = NIL;
        destructuring_bind_must_consp(current, datum, $list851);
        address = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_ANCHOR, list($HREF, list(HTML_MAILTO_URL, address)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list851);
        return NIL;
    }

    public static SubLObject html_file_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list853);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list853);
        filename = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_ANCHOR, list($HREF, list(HTML_FILE_URL, filename)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list853);
        return NIL;
    }

    public static SubLObject html_fancy_area(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$34 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list855);
            current_$34 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list855);
            if (NIL == member(current_$34, $list856, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$34 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list855);
        }
        final SubLObject nohref_tail = property_list_member($NOHREF, current);
        final SubLObject nohref = (NIL != nohref_tail) ? cadr(nohref_tail) : NIL;
        final SubLObject href_tail = property_list_member($HREF, current);
        final SubLObject href = (NIL != href_tail) ? cadr(href_tail) : NIL;
        final SubLObject alt_tail = property_list_member($ALT, current);
        final SubLObject alt = (NIL != alt_tail) ? cadr(alt_tail) : NIL;
        final SubLObject target_tail = property_list_member($TARGET, current);
        final SubLObject target = (NIL != target_tail) ? cadr(target_tail) : NIL;
        final SubLObject shape_tail = property_list_member($SHAPE, current);
        final SubLObject shape = (NIL != shape_tail) ? cadr(shape_tail) : NIL;
        final SubLObject co_ords_tail = property_list_member($CO_ORDS, current);
        final SubLObject co_ords = (NIL != co_ords_tail) ? cadr(co_ords_tail) : NIL;
        SubLObject attributes = NIL;
        if (NIL != nohref) {
            assert NIL != atom(nohref) : "Types.atom(nohref) " + "CommonSymbols.NIL != Types.atom(nohref) " + nohref;
            attributes = cons(listS(PWHEN, nohref, $list860), attributes);
        }
        if (NIL != href) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list861, href.isAtom() ? list(HTML_MARKUP, href) : href), attributes);
        }
        if (NIL != alt) {
            assert NIL != atom(alt) : "Types.atom(alt) " + "CommonSymbols.NIL != Types.atom(alt) " + alt;
            attributes = cons(list(PWHEN, alt, list(HTML_QUOTED_ATTRIBUTE, $list862, list(HTML_MARKUP, alt))), attributes);
        }
        if (NIL != target) {
            assert NIL != atom(target) : "Types.atom(target) " + "CommonSymbols.NIL != Types.atom(target) " + target;
            attributes = cons(list(PWHEN, target, list(HTML_QUOTED_ATTRIBUTE, $list863, list(HTML_MARKUP, target))), attributes);
        }
        if (NIL != shape) {
            assert NIL != atom(shape) : "Types.atom(shape) " + "CommonSymbols.NIL != Types.atom(shape) " + shape;
            attributes = cons(list(PWHEN, shape, list(HTML_QUOTED_ATTRIBUTE, $list864, list(HTML_MARKUP, shape))), attributes);
        }
        if (NIL != co_ords) {
            assert NIL != atom(co_ords) : "Types.atom(co_ords) " + "CommonSymbols.NIL != Types.atom(co_ords) " + co_ords;
            attributes = cons(list(PWHEN, co_ords, list(HTML_QUOTED_ATTRIBUTE, $list865, list(HTML_MARKUP, co_ords))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(HTML_MARKUP_WRAPPER, $list866, append(attributes, NIL));
    }

    public static SubLObject html_blink(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list867, append(body, NIL));
    }

    public static SubLObject html_comment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list868, listS(CLET, $list358, append(body, NIL)));
    }

    public static SubLObject html_fancy_frame(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list869);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$35 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list869);
            current_$35 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list869);
            if (NIL == member(current_$35, $list870, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$35 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list869);
        }
        final SubLObject frameborder_tail = property_list_member($FRAMEBORDER, current);
        final SubLObject frameborder = (NIL != frameborder_tail) ? cadr(frameborder_tail) : NIL;
        final SubLObject noresize_tail = property_list_member($NORESIZE, current);
        final SubLObject noresize = (NIL != noresize_tail) ? cadr(noresize_tail) : NIL;
        final SubLObject src_tail = property_list_member($SRC, current);
        final SubLObject src = (NIL != src_tail) ? cadr(src_tail) : NIL;
        final SubLObject scrolling_tail = property_list_member($SCROLLING, current);
        final SubLObject scrolling = (NIL != scrolling_tail) ? cadr(scrolling_tail) : NIL;
        final SubLObject marginheight_tail = property_list_member($MARGINHEIGHT, current);
        final SubLObject marginheight = (NIL != marginheight_tail) ? cadr(marginheight_tail) : NIL;
        final SubLObject marginwidth_tail = property_list_member($MARGINWIDTH, current);
        final SubLObject marginwidth = (NIL != marginwidth_tail) ? cadr(marginwidth_tail) : NIL;
        SubLObject attributes = NIL;
        assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
        attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list876, list(HTML_MARKUP, name)), attributes);
        if (NIL != frameborder) {
            assert NIL != atom(frameborder) : "Types.atom(frameborder) " + "CommonSymbols.NIL != Types.atom(frameborder) " + frameborder;
            attributes = cons(list(PWHEN, frameborder, list(HTML_QUOTED_ATTRIBUTE, $list877, list(HTML_MARKUP, frameborder))), attributes);
        }
        if (NIL != noresize) {
            assert NIL != atom(noresize) : "Types.atom(noresize) " + "CommonSymbols.NIL != Types.atom(noresize) " + noresize;
            attributes = cons(listS(PWHEN, noresize, $list878), attributes);
        }
        if (NIL != src) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list879, src.isAtom() ? list(HTML_MARKUP, src) : src), attributes);
        }
        if (NIL != scrolling) {
            assert NIL != atom(scrolling) : "Types.atom(scrolling) " + "CommonSymbols.NIL != Types.atom(scrolling) " + scrolling;
            attributes = cons(list(PWHEN, scrolling, list(HTML_QUOTED_ATTRIBUTE, $list880, list(HTML_MARKUP, scrolling))), attributes);
        }
        if (NIL != marginheight) {
            assert NIL != atom(marginheight) : "Types.atom(marginheight) " + "CommonSymbols.NIL != Types.atom(marginheight) " + marginheight;
            attributes = cons(list(PWHEN, marginheight, list(HTML_QUOTED_ATTRIBUTE, $list881, list(HTML_MARKUP, marginheight))), attributes);
        }
        if (NIL != marginwidth) {
            assert NIL != atom(marginwidth) : "Types.atom(marginwidth) " + "CommonSymbols.NIL != Types.atom(marginwidth) " + marginwidth;
            attributes = cons(list(PWHEN, marginwidth, list(HTML_QUOTED_ATTRIBUTE, $list882, list(HTML_MARKUP, marginwidth))), attributes);
        }
        attributes = nreverse(attributes);
        return list(PROGN, $list393, listS(HTML_MARKUP_WRAPPER, $list883, append(attributes, NIL)));
    }

    public static SubLObject html_frame(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list869);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$36 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list869);
            current_$36 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list869);
            if (NIL == member(current_$36, $list870, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$36 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list869);
        }
        final SubLObject frameborder_tail = property_list_member($FRAMEBORDER, current);
        final SubLObject frameborder = (NIL != frameborder_tail) ? cadr(frameborder_tail) : NIL;
        final SubLObject noresize_tail = property_list_member($NORESIZE, current);
        final SubLObject noresize = (NIL != noresize_tail) ? cadr(noresize_tail) : NIL;
        final SubLObject src_tail = property_list_member($SRC, current);
        final SubLObject src = (NIL != src_tail) ? cadr(src_tail) : NIL;
        final SubLObject scrolling_tail = property_list_member($SCROLLING, current);
        final SubLObject scrolling = (NIL != scrolling_tail) ? cadr(scrolling_tail) : NIL;
        final SubLObject marginheight_tail = property_list_member($MARGINHEIGHT, current);
        final SubLObject marginheight = (NIL != marginheight_tail) ? cadr(marginheight_tail) : NIL;
        final SubLObject marginwidth_tail = property_list_member($MARGINWIDTH, current);
        final SubLObject marginwidth = (NIL != marginwidth_tail) ? cadr(marginwidth_tail) : NIL;
        return list(new SubLObject[]{ HTML_FANCY_FRAME, name, $FRAMEBORDER, frameborder, $NORESIZE, noresize, $SRC, src, $SCROLLING, scrolling, $MARGINHEIGHT, marginheight, $MARGINWIDTH, marginwidth });
    }

    public static SubLObject html_fancy_frameset(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list885);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$37 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list885);
            current_$37 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list885);
            if (NIL == member(current_$37, $list886, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$37 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list885);
        }
        final SubLObject cols_tail = property_list_member($COLS, current);
        final SubLObject cols = (NIL != cols_tail) ? cadr(cols_tail) : NIL;
        final SubLObject rows_tail = property_list_member($ROWS, current);
        final SubLObject rows = (NIL != rows_tail) ? cadr(rows_tail) : NIL;
        final SubLObject frameborder_tail = property_list_member($FRAMEBORDER, current);
        final SubLObject frameborder = (NIL != frameborder_tail) ? cadr(frameborder_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != cols) {
            assert NIL != atom(cols) : "Types.atom(cols) " + "CommonSymbols.NIL != Types.atom(cols) " + cols;
            attributes = cons(list(PWHEN, cols, list(HTML_QUOTED_ATTRIBUTE, $list887, list(HTML_MARKUP, cols))), attributes);
        }
        if (NIL != rows) {
            assert NIL != atom(rows) : "Types.atom(rows) " + "CommonSymbols.NIL != Types.atom(rows) " + rows;
            attributes = cons(list(PWHEN, rows, list(HTML_QUOTED_ATTRIBUTE, $list888, list(HTML_MARKUP, rows))), attributes);
        }
        if (NIL != frameborder) {
            assert NIL != atom(frameborder) : "Types.atom(frameborder) " + "CommonSymbols.NIL != Types.atom(frameborder) " + frameborder;
            attributes = cons(list(PWHEN, frameborder, list(HTML_QUOTED_ATTRIBUTE, $list889, list(HTML_MARKUP, frameborder))), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return listS(PROGN, $list890, listS(HTML_MARKUP_WRAPPER, $list891, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL))))), $list395);
    }

    public static SubLObject html_frameset(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list885);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$38 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list885);
            current_$38 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list885);
            if (NIL == member(current_$38, $list886, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$38 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list885);
        }
        final SubLObject cols_tail = property_list_member($COLS, current);
        final SubLObject cols = (NIL != cols_tail) ? cadr(cols_tail) : NIL;
        final SubLObject rows_tail = property_list_member($ROWS, current);
        final SubLObject rows = (NIL != rows_tail) ? cadr(rows_tail) : NIL;
        final SubLObject frameborder_tail = property_list_member($FRAMEBORDER, current);
        final SubLObject frameborder = (NIL != frameborder_tail) ? cadr(frameborder_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(HTML_FANCY_FRAMESET, list($COLS, cols, $ROWS, rows, $FRAMEBORDER, frameborder), append(body, NIL));
    }

    public static SubLObject html_fancy_iframe(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list893);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$39 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list893);
            current_$39 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list893);
            if (NIL == member(current_$39, $list894, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$39 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list893);
        }
        final SubLObject src_tail = property_list_member($SRC, current);
        final SubLObject src = (NIL != src_tail) ? cadr(src_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject frameborder_tail = property_list_member($FRAMEBORDER, current);
        final SubLObject frameborder = (NIL != frameborder_tail) ? cadr(frameborder_tail) : NIL;
        final SubLObject marginwidth_tail = property_list_member($MARGINWIDTH, current);
        final SubLObject marginwidth = (NIL != marginwidth_tail) ? cadr(marginwidth_tail) : NIL;
        final SubLObject marginheight_tail = property_list_member($MARGINHEIGHT, current);
        final SubLObject marginheight = (NIL != marginheight_tail) ? cadr(marginheight_tail) : NIL;
        final SubLObject scrolling_tail = property_list_member($SCROLLING, current);
        final SubLObject scrolling = (NIL != scrolling_tail) ? cadr(scrolling_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != src) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list895, src.isAtom() ? list(HTML_MARKUP, src) : src), attributes);
        }
        if (NIL != name) {
            assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list896, list(HTML_MARKUP, name)), attributes);
        }
        if (NIL != width) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list897, width.isAtom() ? list(HTML_MARKUP, width) : src), attributes);
        }
        if (NIL != height) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list898, height.isAtom() ? list(HTML_MARKUP, height) : src), attributes);
        }
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list899, list(HTML_MARKUP, list(HTML_ALIGN, align)))), attributes);
        }
        if (NIL != frameborder) {
            assert NIL != atom(frameborder) : "Types.atom(frameborder) " + "CommonSymbols.NIL != Types.atom(frameborder) " + frameborder;
            attributes = cons(list(PWHEN, frameborder, list(HTML_QUOTED_ATTRIBUTE, $list900, list(HTML_MARKUP, frameborder))), attributes);
        }
        if (NIL != marginwidth) {
            assert NIL != atom(marginwidth) : "Types.atom(marginwidth) " + "CommonSymbols.NIL != Types.atom(marginwidth) " + marginwidth;
            attributes = cons(list(PWHEN, marginwidth, list(HTML_QUOTED_ATTRIBUTE, $list901, list(HTML_MARKUP, marginwidth))), attributes);
        }
        if (NIL != marginheight) {
            assert NIL != atom(marginheight) : "Types.atom(marginheight) " + "CommonSymbols.NIL != Types.atom(marginheight) " + marginheight;
            attributes = cons(list(PWHEN, marginheight, list(HTML_QUOTED_ATTRIBUTE, $list902, list(HTML_MARKUP, marginheight))), attributes);
        }
        if (NIL != scrolling) {
            assert NIL != atom(scrolling) : "Types.atom(scrolling) " + "CommonSymbols.NIL != Types.atom(scrolling) " + scrolling;
            attributes = cons(list(PWHEN, scrolling, list(HTML_QUOTED_ATTRIBUTE, $list903, list(HTML_MARKUP, scrolling))), attributes);
        }
        attributes = nreverse(attributes);
        return list(PROGN, $list393, listS(HTML_MARKUP_WRAPPER, $list904, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL))))));
    }

    public static SubLObject html_fancy_image(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject src = NIL;
        destructuring_bind_must_consp(current, datum, $list905);
        src = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$40 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list905);
            current_$40 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list905);
            if (NIL == member(current_$40, $list906, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$40 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list905);
        }
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject ismap_tail = property_list_member($ISMAP, current);
        final SubLObject ismap = (NIL != ismap_tail) ? cadr(ismap_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject alt_tail = property_list_member($ALT, current);
        final SubLObject alt = (NIL != alt_tail) ? cadr(alt_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject border_tail = property_list_member($BORDER, current);
        final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : NIL;
        final SubLObject style_tail = property_list_member($STYLE, current);
        final SubLObject style = (NIL != style_tail) ? cadr(style_tail) : NIL;
        SubLObject attributes = NIL;
        attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list908, src.isAtom() ? list(HTML_MARKUP, src) : src), attributes);
        if (NIL != name) {
            assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
            attributes = cons(list(PWHEN, name, list(HTML_QUOTED_ATTRIBUTE, $list909, list(HTML_MARKUP, name))), attributes);
        }
        if (NIL != id) {
            assert NIL != atom(id) : "Types.atom(id) " + "CommonSymbols.NIL != Types.atom(id) " + id;
            attributes = cons(list(PWHEN, id, list(HTML_QUOTED_ATTRIBUTE, $list415, list(HTML_MARKUP, id))), attributes);
        }
        if (NIL != v_class) {
            assert NIL != atom(v_class) : "Types.atom(v_class) " + "CommonSymbols.NIL != Types.atom(v_class) " + v_class;
            attributes = cons(list(PWHEN, v_class, list(HTML_QUOTED_ATTRIBUTE, $list416, list(HTML_MARKUP, v_class))), attributes);
        }
        if (NIL != ismap) {
            assert NIL != atom(ismap) : "Types.atom(ismap) " + "CommonSymbols.NIL != Types.atom(ismap) " + ismap;
            attributes = cons(listS(PWHEN, ismap, $list910), attributes);
        }
        if (NIL != height) {
            assert NIL != atom(height) : "Types.atom(height) " + "CommonSymbols.NIL != Types.atom(height) " + height;
            attributes = cons(list(PWHEN, height, list(HTML_QUOTED_ATTRIBUTE, $list911, list(HTML_MARKUP, height))), attributes);
        }
        if (NIL != width) {
            assert NIL != atom(width) : "Types.atom(width) " + "CommonSymbols.NIL != Types.atom(width) " + width;
            attributes = cons(list(PWHEN, width, list(HTML_QUOTED_ATTRIBUTE, $list912, list(HTML_MARKUP, width))), attributes);
        }
        if (NIL != alt) {
            assert NIL != atom(alt) : "Types.atom(alt) " + "CommonSymbols.NIL != Types.atom(alt) " + alt;
            attributes = cons(list(PWHEN, alt, list(HTML_QUOTED_ATTRIBUTE, $list913, alt.isAtom() ? list(HTML_MARKUP, alt) : alt)), attributes);
        }
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list914, list(HTML_MARKUP, list(HTML_ALIGN, align)))), attributes);
        }
        if (NIL != border) {
            assert NIL != atom(border) : "Types.atom(border) " + "CommonSymbols.NIL != Types.atom(border) " + border;
            attributes = cons(list(PWHEN, border, list(HTML_QUOTED_ATTRIBUTE, $list915, list(HTML_MARKUP, border))), attributes);
        }
        if (NIL != style) {
            assert NIL != atom(style) : "Types.atom(style) " + "CommonSymbols.NIL != Types.atom(style) " + style;
            attributes = cons(list(PWHEN, style, list(HTML_QUOTED_ATTRIBUTE, $list916, list(HTML_MARKUP, style))), attributes);
        }
        attributes = nreverse(attributes);
        return listS(HTML_MARKUP_WRAPPER, $list917, append(attributes, $list918));
    }

    public static SubLObject html_embedded_image(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list919);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$41 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list919);
            current_$41 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list919);
            if (NIL == member(current_$41, $list920, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$41 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list919);
        }
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject ismap_tail = property_list_member($ISMAP, current);
        final SubLObject ismap = (NIL != ismap_tail) ? cadr(ismap_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject alt_tail = property_list_member($ALT, current);
        final SubLObject alt = (NIL != alt_tail) ? cadr(alt_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject border_tail = property_list_member($BORDER, current);
        final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : NIL;
        final SubLObject data_src = $sym921$DATA_SRC;
        return list(CLET, list(list(data_src, list(HTML_EMBEDDED_IMAGE_DATA_SRC, filename, type))), list(new SubLObject[]{ HTML_FANCY_IMAGE, data_src, $NAME, name, $ID, id, $CLASS, v_class, $ISMAP, ismap, $HEIGHT, height, $WIDTH, width, $ALT, alt, $ALIGN, align, $BORDER, border }));
    }

    public static SubLObject html_embedded_image_data_src(final SubLObject filename, SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mime_type = http_kernel.html_determine_mime_type(filename, type);
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject base64_string = html_base64_string_for_file(filename);
        final SubLObject pad_chars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            format(stream, $str925$data__A_base64_, mime_type);
            final SubLObject string_var = base64_string;
            SubLObject end_var_$42;
            SubLObject end_var;
            SubLObject index;
            SubLObject v_char;
            for (end_var = end_var_$42 = length(string_var), index = NIL, index = ZERO_INTEGER; !index.numGE(end_var_$42); index = number_utilities.f_1X(index)) {
                v_char = Strings.sublisp_char(string_var, index);
                if (mod(index, $int$76).isZero()) {
                    terpri(stream);
                }
                write_char(v_char, stream);
            }
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(pad_chars); i = add(i, ONE_INTEGER)) {
                write_char(CHAR_equal, stream);
            }
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject html_base64_string_for_file(final SubLObject filename) {
        final SubLObject byte_vector = vector_utilities.new_byte_vector_from_file(filename);
        final SubLObject base64_string = vector_utilities.byte_vector_to_64_bit_char_string(byte_vector);
        final SubLObject pad_chars = mod(min(FOUR_INTEGER, subtract(FOUR_INTEGER, mod(length(base64_string), FOUR_INTEGER))), FOUR_INTEGER);
        nsubstitute(CHAR_slash, CHAR_underbar, base64_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        nsubstitute(CHAR_plus, CHAR_hyphen, base64_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(base64_string, pad_chars);
    }

    public static SubLObject html_fancy_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list849);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list849);
        name = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list849);
            return NIL;
        }
        final SubLObject body;
        current = body = temp;
        assert NIL != atom(name) : "Types.atom(name) " + "CommonSymbols.NIL != Types.atom(name) " + name;
        return list(HTML_MARKUP_WRAPPER, $list927, list(HTML_QUOTED_ATTRIBUTE, $list928, list(HTML_MARKUP, name)), bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject html_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list849);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list849);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_MAP, list(name), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list849);
        return NIL;
    }

    public static SubLObject html_no_break(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list930, append(body, NIL));
    }

    public static SubLObject html_no_frames(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_MARKUP_WRAPPER, $list931, append(body, NIL));
    }

    public static SubLObject html_object(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list932);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$43 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list932);
            current_$43 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list932);
            if (NIL == member(current_$43, $list933, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$43 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list932);
        }
        final SubLObject classid_tail = property_list_member($CLASSID, current);
        final SubLObject classid = (NIL != classid_tail) ? cadr(classid_tail) : NIL;
        final SubLObject codebase_tail = property_list_member($CODEBASE, current);
        final SubLObject codebase = (NIL != codebase_tail) ? cadr(codebase_tail) : NIL;
        final SubLObject codetype_tail = property_list_member($CODETYPE, current);
        final SubLObject codetype = (NIL != codetype_tail) ? cadr(codetype_tail) : NIL;
        final SubLObject data_tail = property_list_member($DATA, current);
        final SubLObject data = (NIL != data_tail) ? cadr(data_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject archive_tail = property_list_member($ARCHIVE, current);
        final SubLObject archive = (NIL != archive_tail) ? cadr(archive_tail) : NIL;
        final SubLObject id_tail = property_list_member($ID, current);
        final SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject class_tail = property_list_member($CLASS, current);
        final SubLObject v_class = (NIL != class_tail) ? cadr(class_tail) : NIL;
        final SubLObject align_tail = property_list_member($ALIGN, current);
        final SubLObject align = (NIL != align_tail) ? cadr(align_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : NIL;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        final SubLObject border_tail = property_list_member($BORDER, current);
        final SubLObject border = (NIL != border_tail) ? cadr(border_tail) : NIL;
        final SubLObject hspace_tail = property_list_member($HSPACE, current);
        final SubLObject hspace = (NIL != hspace_tail) ? cadr(hspace_tail) : NIL;
        final SubLObject vspace_tail = property_list_member($VSPACE, current);
        final SubLObject vspace = (NIL != vspace_tail) ? cadr(vspace_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        if (NIL != classid) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list939, classid.isAtom() ? list(HTML_MARKUP, classid) : classid), attributes);
        }
        if (NIL != codebase) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list940, codebase.isAtom() ? list(HTML_MARKUP, codebase) : codebase), attributes);
        }
        if (NIL != codetype) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list941, codetype.isAtom() ? list(HTML_MARKUP, codetype) : codetype), attributes);
        }
        if (NIL != data) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list942, data.isAtom() ? list(HTML_MARKUP, data) : data), attributes);
        }
        if (NIL != type) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list943, type.isAtom() ? list(HTML_MARKUP, type) : type), attributes);
        }
        if (NIL != archive) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list944, archive.isAtom() ? list(HTML_MARKUP, archive) : archive), attributes);
        }
        if (NIL != id) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list945, id.isAtom() ? list(HTML_MARKUP, id) : id), attributes);
        }
        if (NIL != v_class) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list946, v_class.isAtom() ? list(HTML_MARKUP, v_class) : v_class), attributes);
        }
        if (NIL != align) {
            assert NIL != atom(align) : "Types.atom(align) " + "CommonSymbols.NIL != Types.atom(align) " + align;
            attributes = cons(list(PWHEN, align, list(HTML_QUOTED_ATTRIBUTE, $list947, list(HTML_MARKUP, list(HTML_ALIGN, align)))), attributes);
        }
        if (NIL != width) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list948, width.isAtom() ? list(HTML_MARKUP, width) : width), attributes);
        }
        if (NIL != height) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list949, height.isAtom() ? list(HTML_MARKUP, height) : height), attributes);
        }
        if (NIL != border) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list950, border.isAtom() ? list(HTML_MARKUP, border) : border), attributes);
        }
        if (NIL != hspace) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list951, hspace.isAtom() ? list(HTML_MARKUP, hspace) : hspace), attributes);
        }
        if (NIL != vspace) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list952, vspace.isAtom() ? list(HTML_MARKUP, vspace) : vspace), attributes);
        }
        attributes = nreverse(attributes);
        return listS(HTML_MARKUP_WRAPPER, $list953, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL)))));
    }

    public static SubLObject html_fancy_script(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list954);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$44 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list954);
            current_$44 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list954);
            if (NIL == member(current_$44, $list955, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$44 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list954);
        }
        final SubLObject language_tail = property_list_member($LANGUAGE, current);
        final SubLObject language = (NIL != language_tail) ? cadr(language_tail) : NIL;
        final SubLObject src_tail = property_list_member($SRC, current);
        final SubLObject src = (NIL != src_tail) ? cadr(src_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        SubLObject attributes = NIL;
        assert NIL != atom(language) : "Types.atom(language) " + "CommonSymbols.NIL != Types.atom(language) " + language;
        assert NIL != atom(src) : "Types.atom(src) " + "CommonSymbols.NIL != Types.atom(src) " + src;
        assert NIL != atom(type) : "Types.atom(type) " + "CommonSymbols.NIL != Types.atom(type) " + type;
        if (NIL != language) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list957, list(HTML_MARKUP, language)), attributes);
        }
        if (NIL != src) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list958, list(HTML_MARKUP, src)), attributes);
        }
        if (NIL != type) {
            attributes = cons(list(HTML_QUOTED_ATTRIBUTE, $list959, list(HTML_MARKUP, type)), attributes);
        }
        if (NIL != attributes) {
            attributes = nreverse(attributes);
        }
        return list(PROGN, $list393, listS(HTML_MARKUP_WRAPPER, $list960, append(attributes, list(bq_cons(HTML_MARKUP_BODY, append(body, NIL != body ? $list395 : NIL, NIL))))));
    }

    public static SubLObject html_javascript(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_SCRIPT, $list962, append(body, NIL));
    }

    public static SubLObject html_noscript(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(HTML_MARKUP_WRAPPER, $list963, bq_cons(HTML_MARKUP_BODY, append(body, NIL)));
    }

    public static SubLObject cyc_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = NIL;
        SubLObject link_body = NIL;
        destructuring_bind_must_consp(current, datum, $list964);
        url_body = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list964);
        link_body = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(HTML_FANCY_ANCHOR, list($HREF, list(PROGN, $list965, url_body)), link_body);
        }
        cdestructuring_bind_error(datum, $list964);
        return NIL;
    }

    public static SubLObject html_dummy_form(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_FORM, $list966, append(body, NIL));
    }

    public static SubLObject html_basic_cyc_form(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(HTML_FANCY_FORM, $list967, append(body, NIL));
    }

    public static SubLObject html_basic_cyc_form_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list968);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject handler_name = NIL;
        destructuring_bind_must_consp(current, datum, $list968);
        handler_name = current.first();
        current = current.rest();
        final SubLObject value = (current.isCons()) ? current.first() : T;
        destructuring_bind_must_listp(current, datum, $list968);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_BASIC_CYC_FORM, list(HTML_HIDDEN_INPUT, handler_name, value), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list968);
        return NIL;
    }

    public static SubLObject html_basic_textarea(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list971);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        SubLObject cols = NIL;
        SubLObject rows = NIL;
        destructuring_bind_must_consp(current, datum, $list971);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list971);
        cols = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list971);
        rows = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_TEXTAREA, list(name, $COLS, cols, $ROWS, rows), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list971);
        return NIL;
    }

    public static SubLObject html_basic_textarea_wrap(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list971);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        SubLObject cols = NIL;
        SubLObject rows = NIL;
        destructuring_bind_must_consp(current, datum, $list971);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list971);
        cols = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list971);
        rows = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_TEXTAREA, listS(name, $COLS, cols, $ROWS, rows, $list973), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list971);
        return NIL;
    }

    public static SubLObject html_basic_select(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list974);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        SubLObject size = NIL;
        SubLObject multipleP = NIL;
        destructuring_bind_must_consp(current, datum, $list974);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list974);
        size = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list974);
        multipleP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_SELECT, list(name, $MULTIPLE, multipleP, $SIZE, size), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list974);
        return NIL;
    }

    public static SubLObject html_basic_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list976);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject selectedP = NIL;
        destructuring_bind_must_consp(current, datum, $list976);
        selectedP = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_OPTION, list($SELECTED, selectedP), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list976);
        return NIL;
    }

    public static SubLObject html_basic_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list978);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject caption = (current.isCons()) ? current.first() : $str180$;
        destructuring_bind_must_listp(current, datum, $list978);
        current = current.rest();
        final SubLObject align = (current.isCons()) ? current.first() : $TOP;
        destructuring_bind_must_listp(current, datum, $list978);
        current = current.rest();
        final SubLObject border = (current.isCons()) ? current.first() : TWO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list978);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(HTML_FANCY_TABLE, list($BORDER, border), list(HTML_TABLE_CAPTION, list(align), list(HTML_PRINC, caption)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list978);
        return NIL;
    }

    public static SubLObject html_autocomplete_textarea(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list981);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = NIL;
        SubLObject cols = NIL;
        SubLObject rows = NIL;
        SubLObject cycl_type = NIL;
        destructuring_bind_must_consp(current, datum, $list981);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list981);
        cols = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list981);
        rows = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list981);
        cycl_type = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject id_num = $sym982$ID_NUM;
            final SubLObject input_id = $sym983$INPUT_ID;
            final SubLObject result_id = $sym984$RESULT_ID;
            final SubLObject autocomplete_id = $sym985$AUTOCOMPLETE_ID;
            return list(PIF, $list986, list(CLET, list(bq_cons(id_num, $list987), list(autocomplete_id, list(FORMAT_NIL, $str989$autocomplete__A, id_num)), list(input_id, list(FORMAT_NIL, $str990$input__A, id_num)), list(result_id, list(FORMAT_NIL, $str991$autocomplete_results__A, id_num))), list(HTML_FANCY_DIV, listS($ID, autocomplete_id, $list993), listS(HTML_FANCY_TEXTAREA, listS(name, new SubLObject[]{ $CLASS, $str994$yui_ac_input, $ID, input_id, $COLS, cols, $ROWS, rows, $list995 }), append(body, NIL)), list(HTML_FANCY_DIV, listS($ID, result_id, $list996))), list(HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT, input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, cycl_type)), listS(HTML_FANCY_TEXTAREA, list(name, $COLS, cols, $ROWS, rows), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list981);
        return NIL;
    }

    public static SubLObject with_html_output_to_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject stream = NIL;
        destructuring_bind_must_consp(current, datum, $list998);
        stream = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($html_stream$, stream)), append(body, NIL));
    }

    public static SubLObject with_html_output_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string_var = NIL;
        destructuring_bind_must_consp(current, datum, $list999);
        string_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        assert NIL != symbolp(string_var) : "Types.symbolp(string_var) " + "CommonSymbols.NIL != Types.symbolp(string_var) " + string_var;
        final SubLObject stream = $sym1001$STREAM;
        return list(CWITH_OUTPUT_TO_STRING, list(stream, string_var), listS(WITH_HTML_OUTPUT_TO_STREAM, stream, append(body, NIL)));
    }

    public static SubLObject with_html_output_to_ascii_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string_var = NIL;
        destructuring_bind_must_consp(current, datum, $list999);
        string_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(WITH_HTML_OUTPUT_TO_STRING, string_var, append(body, NIL)), list(CSETQ, string_var, list(CONVERT_HTML_TO_TEXT, string_var)));
    }

    public static SubLObject with_html_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject machine = NIL;
        destructuring_bind_must_consp(current, datum, $list1006);
        machine = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject state_var = $sym1007$STATE_VAR;
        final SubLObject lock_var = $sym1008$LOCK_VAR;
        final SubLObject v_variables = $sym1009$VARIABLES;
        final SubLObject values = $sym1010$VALUES;
        return list(CLET, list(list(state_var, list(HTML_MACHINE_STATE, machine)), list(lock_var, list(HTML_MACHINE_STATE_LOCK, state_var)), v_variables, values), list(WITH_LOCK_HELD, list(lock_var), list(CSETQ, v_variables, list(HTML_MACHINE_STATE_VARIABLES, state_var)), list(CSETQ, values, list(HTML_MACHINE_STATE_VALUES, state_var))), listS(CPROGV, v_variables, values, append(body, list(list(SNAPSHOT_HTML_STATE, state_var)))));
    }

    public static SubLObject html_parameter_entry_format(final SubLObject parameter) {
        return get(parameter, $HTML_PARAMETER_ENTRY_FORMAT, NIL);
    }

    public static SubLObject set_html_parameter_entry_format(final SubLObject parameter, final SubLObject entry_format) {
        put(parameter, $HTML_PARAMETER_ENTRY_FORMAT, entry_format);
        return parameter;
    }

    public static SubLObject declare_html_parameter_entry_format(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject parameter = NIL;
        SubLObject entry_format = NIL;
        destructuring_bind_must_consp(current, datum, $list1019);
        parameter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1019);
        entry_format = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(SET_HTML_PARAMETER_ENTRY_FORMAT, list(QUOTE, parameter), list(QUOTE, entry_format));
        }
        cdestructuring_bind_error(datum, $list1019);
        return NIL;
    }

    public static SubLObject define_cgi_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list1028);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1028);
        arglist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1028);
        type = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject max_args = list_utilities.function_arglist_max_args(arglist);
        if (!max_args.numE(ONE_INTEGER)) {
            Errors.warn($str1029$HTML_handler__A_has_an_invalid_ar, name, arglist);
        }
        return list(PROGN, listS(DEFINE, name, arglist, append(body, NIL)), list(NOTE_CGI_HANDLER_FUNCTION, list(QUOTE, name), type));
    }

    public static SubLObject note_cgi_handler_function(final SubLObject symbol, final SubLObject type_symbol) {
        sethash(symbol, get_handler_mime_type_hash(), type_symbol);
        return T;
    }

    public static SubLObject get_handler_mime_type_hash() {
        if ((NIL == $handler_mime_types$.getGlobalValue()) || (NIL != dictionary.dictionary_p($handler_mime_types$.getGlobalValue()))) {
            $handler_mime_types$.setGlobalValue(make_hash_table($int$200, EQ, UNPROVIDED));
        }
        return $handler_mime_types$.getGlobalValue();
    }

    public static SubLObject get_handler_mime_type_property(final SubLObject symbol) {
        return gethash(symbol, $handler_mime_types$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject define_html_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list1035);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1035);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(DEFINE_CGI_HANDLER, name, arglist, $html_handler_property$.getGlobalValue(), append(body, NIL));
    }

    public static SubLObject define_html_fragment_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list1035);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1035);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(DEFINE_HTML_HANDLER, name, arglist, append(body, NIL));
    }

    public static SubLObject cgi_handler_functionP(final SubLObject symbol) {
        return list_utilities.sublisp_boolean(gethash(symbol, get_handler_mime_type_hash(), UNPROVIDED));
    }

    public static SubLObject html_handler_functionP(final SubLObject symbol) {
        return eq(gethash(symbol, get_handler_mime_type_hash(), UNPROVIDED), $html_handler_property$.getGlobalValue());
    }

    public static SubLObject xml_handler_functionP(final SubLObject symbol) {
        return eq(gethash(get_handler_mime_type_hash(), symbol, UNPROVIDED), $xml_handler_property$.getGlobalValue());
    }

    public static SubLObject json_handler_functionP(final SubLObject symbol) {
        return eq(gethash(symbol, get_handler_mime_type_hash(), UNPROVIDED), $xml_handler_property$.getGlobalValue());
    }

    public static SubLObject all_cgi_handler_symbols(final SubLObject sym) {
        SubLObject symbols = NIL;
        final SubLObject cdohash_table = get_handler_mime_type_hash();
        SubLObject symbol = NIL;
        SubLObject handler_property = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                symbol = getEntryKey(cdohash_entry);
                handler_property = getEntryValue(cdohash_entry);
                if (handler_property.eql(sym)) {
                    symbols = cons(symbol, symbols);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        symbols = Sort.sort(symbols, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        return symbols;
    }

    public static SubLObject all_html_handler_symbols() {
        return all_cgi_handler_symbols($html_handler_property$.getGlobalValue());
    }

    public static SubLObject all_json_handler_symbols() {
        return all_cgi_handler_symbols($json_handler_property$.getGlobalValue());
    }

    public static SubLObject all_xml_handler_symbols() {
        return all_cgi_handler_symbols($xml_handler_property$.getGlobalValue());
    }

    public static SubLObject define_xml_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list1035);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1035);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(DEFINE_CGI_HANDLER, name, arglist, $xml_handler_property$.getGlobalValue(), append(body, NIL));
    }

    public static SubLObject define_json_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject arglist = NIL;
        destructuring_bind_must_consp(current, datum, $list1035);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1035);
        arglist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(DEFINE_CGI_HANDLER, name, arglist, $json_handler_property$.getGlobalValue(), append(body, NIL));
    }

    public static SubLObject with_html_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject specs = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list1039);
        specs = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1039);
        args = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject alist = $sym1040$ALIST;
        SubLObject vars = NIL;
        SubLObject parsing_code = NIL;
        SubLObject cdolist_list_var = specs;
        SubLObject spec = NIL;
        spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = (spec.isCons()) ? spec.first() : spec;
            vars = cons(var, vars);
            if (spec.isCons()) {
                SubLObject current_$46;
                final SubLObject datum_$45 = current_$46 = spec;
                SubLObject variable = NIL;
                destructuring_bind_must_consp(current_$46, datum_$45, $list1041);
                variable = current_$46.first();
                current_$46 = current_$46.rest();
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current_$46;
                SubLObject bad = NIL;
                SubLObject current_$47 = NIL;
                while (NIL != rest) {
                    destructuring_bind_must_consp(rest, datum_$45, $list1041);
                    current_$47 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum_$45, $list1041);
                    if (NIL == member(current_$47, $list1042, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_$47 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                } 
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum_$45, $list1041);
                }
                final SubLObject reader_tail = property_list_member($READER, current_$46);
                final SubLObject reader = (NIL != reader_tail) ? cadr(reader_tail) : NIL;
                final SubLObject type_pred_tail = property_list_member($TYPE_PRED, current_$46);
                final SubLObject type_pred = (NIL != type_pred_tail) ? cadr(type_pred_tail) : NIL;
                final SubLObject name_tail = property_list_member($NAME, current_$46);
                final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
                final SubLObject collect_tail = property_list_member($COLLECT, current_$46);
                final SubLObject collect = (NIL != collect_tail) ? cadr(collect_tail) : NIL;
                final SubLObject test_tail = property_list_member($TEST, current_$46);
                final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : $list1047;
                SubLObject key_string = NIL;
                if (NIL != name) {
                    key_string = name;
                } else {
                    key_string = Strings.string_downcase(symbol_name(var), UNPROVIDED, UNPROVIDED);
                }
                if (NIL != collect) {
                    final SubLObject current_$48 = $sym1048$CURRENT;
                    parsing_code = cons(list(CDO, list(list(current_$48, alist, list(CDR, current_$48))), list(list(NULL, current_$48)), list(PWHEN, list(FUNCALL, test, key_string, list(CAAR, current_$48)), NIL != reader ? list(CPUSH, list(FUNCALL, reader, list(CAR, list(CDAR, current_$48))), var) : list(CPUSH, list(CAR, list(CDAR, current_$48)), var))), parsing_code);
                } else
                    if (NIL != reader) {
                        final SubLObject val = $sym1057$VAL;
                        parsing_code = cons(list(CLET, list(list(val, list(CADR, list(ASSOC, key_string, alist, test)))), list(PWHEN, val, list(CSETF, var, list(FUNCALL, reader, val)))), parsing_code);
                    } else {
                        parsing_code = cons(list(CSETF, var, list(CADR, list(ASSOC, key_string, alist, test))), parsing_code);
                    }

                if (NIL != type_pred) {
                    parsing_code = cons(list(PUNLESS, list(FUNCALL, type_pred, var), list(ERROR, $str1063$HTML_argument_error___S_should_be, var, type_pred)), parsing_code);
                }
            } else {
                parsing_code = cons(list(CSETF, var, list(CADR, listS(ASSOC, Strings.string_downcase(symbol_name(var), UNPROVIDED, UNPROVIDED), alist, $list1064))), parsing_code);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        } 
        parsing_code = nreverse(parsing_code);
        return listS(CLET, bq_cons(list(alist, list(REMOVE_IF_NOT, $list1066, args)), append(vars, NIL)), append(parsing_code, body, NIL));
    }

    public static SubLObject html_possibly_strong(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject strongP = NIL;
        destructuring_bind_must_consp(current, datum, $list1067);
        strongP = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject strong_var = $sym1068$STRONG_VAR;
        final SubLObject head = $sym1069$HEAD;
        final SubLObject tail = $sym1070$TAIL;
        return list(CLET, list(list(strong_var, strongP), list(head, listS(FIF, strong_var, $list1071)), list(tail, listS(FIF, strong_var, $list1072))), listS(HTML_MARKUP_WRAPPER, list(head, tail), append(body, NIL)));
    }

    public static SubLObject declare_html_macros_file() {
        declareFunction(me, "is_known_dom_event_handlerP", "IS-KNOWN-DOM-EVENT-HANDLER?", 1, 0, false);
        declareMacro(me, "html_format", "HTML-FORMAT");
        declareMacro(me, "html_format_strong", "HTML-FORMAT-STRONG");
        declareMacro(me, "html_markup_wrapper", "HTML-MARKUP-WRAPPER");
        declareMacro(me, "html_quoted_attribute", "HTML-QUOTED-ATTRIBUTE");
        declareMacro(me, "html_markup_body", "HTML-MARKUP-BODY");
        declareFunction(me, "html_inside_body_p", "HTML-INSIDE-BODY-P", 0, 0, false);
        declareMacro(me, "html_fancy_body", "HTML-FANCY-BODY");
        declareMacro(me, "html_colored_body", "HTML-COLORED-BODY");
        declareMacro(me, "html_body", "HTML-BODY");
        declareMacro(me, "html_head", "HTML-HEAD");
        declareFunction(me, "html_head_content_type", "HTML-HEAD-CONTENT-TYPE", 0, 0, false);
        declareMacro(me, "html_document", "HTML-DOCUMENT");
        declareMacro(me, "html_fancy_div", "HTML-FANCY-DIV");
        declareMacro(me, "html_smaller", "HTML-SMALLER");
        declareMacro(me, "html_larger", "HTML-LARGER");
        declareMacro(me, "html_fancy_span", "HTML-FANCY-SPAN");
        declareMacro(me, "html_meta", "HTML-META");
        declareMacro(me, "html_fancy_meta", "HTML-FANCY-META");
        declareMacro(me, "html_link", "HTML-LINK");
        declareMacro(me, "html_fancy_link", "HTML-FANCY-LINK");
        declareMacro(me, "html_base", "HTML-BASE");
        declareMacro(me, "html_fancy_base", "HTML-FANCY-BASE");
        declareFunction(me, "html_stylesheet_link", "HTML-STYLESHEET-LINK", 1, 3, false);
        declareMacro(me, "html_style", "HTML-STYLE");
        declareMacro(me, "html_title", "HTML-TITLE");
        declareMacro(me, "html_simple_document", "HTML-SIMPLE-DOCUMENT");
        declareMacro(me, "html_simple_browser_document", "HTML-SIMPLE-BROWSER-DOCUMENT");
        declareMacro(me, "html_blockquote", "HTML-BLOCKQUOTE");
        declareMacro(me, "html_center", "HTML-CENTER");
        declareMacro(me, "html_heading", "HTML-HEADING");
        declareMacro(me, "html_paragraph", "HTML-PARAGRAPH");
        declareMacro(me, "html_plaintext", "HTML-PLAINTEXT");
        declareFunction(me, "verify_within_html_pre", "VERIFY-WITHIN-HTML-PRE", 0, 0, false);
        declareFunction(me, "verify_not_within_html_pre", "VERIFY-NOT-WITHIN-HTML-PRE", 0, 0, false);
        declareMacro(me, "html_pre", "HTML-PRE");
        declareMacro(me, "html_unpre", "HTML-UNPRE");
        declareMacro(me, "html_address", "HTML-ADDRESS");
        declareMacro(me, "html_big", "HTML-BIG");
        declareMacro(me, "html_bold", "HTML-BOLD");
        declareMacro(me, "html_b", "HTML-B");
        declareMacro(me, "html_cite", "HTML-CITE");
        declareMacro(me, "html_code", "HTML-CODE");
        declareMacro(me, "html_definition", "HTML-DEFINITION");
        declareMacro(me, "html_emphasized", "HTML-EMPHASIZED");
        declareMacro(me, "html_em", "HTML-EM");
        declareMacro(me, "html_fancy_font", "HTML-FANCY-FONT");
        declareMacro(me, "html_font", "HTML-FONT");
        declareMacro(me, "html_font_color", "HTML-FONT-COLOR");
        declareMacro(me, "html_text_background_color", "HTML-TEXT-BACKGROUND-COLOR");
        declareMacro(me, "html_italic", "HTML-ITALIC");
        declareMacro(me, "html_i", "HTML-I");
        declareMacro(me, "html_keyboard", "HTML-KEYBOARD");
        declareMacro(me, "html_sample", "HTML-SAMPLE");
        declareMacro(me, "html_small", "HTML-SMALL");
        declareMacro(me, "html_strikethrough", "HTML-STRIKETHROUGH");
        declareMacro(me, "html_strong", "HTML-STRONG");
        declareMacro(me, "html_subscript", "HTML-SUBSCRIPT");
        declareMacro(me, "html_superscript", "HTML-SUPERSCRIPT");
        declareMacro(me, "html_teletype", "HTML-TELETYPE");
        declareMacro(me, "html_tt", "HTML-TT");
        declareMacro(me, "html_underlined", "HTML-UNDERLINED");
        declareMacro(me, "html_u", "HTML-U");
        declareMacro(me, "html_variable", "HTML-VARIABLE");
        declareMacro(me, "html_fancy_label", "HTML-FANCY-LABEL");
        declareMacro(me, "html_definition_list", "HTML-DEFINITION-LIST");
        declareMacro(me, "html_compact_definition_list", "HTML-COMPACT-DEFINITION-LIST");
        declareMacro(me, "html_dl_term", "HTML-DL-TERM");
        declareMacro(me, "html_dl_definition", "HTML-DL-DEFINITION");
        declareMacro(me, "html_directory_list", "HTML-DIRECTORY-LIST");
        declareMacro(me, "html_compact_directory_list", "HTML-COMPACT-DIRECTORY-LIST");
        declareMacro(me, "html_menu_list", "HTML-MENU-LIST");
        declareMacro(me, "html_compact_menu_list", "HTML-COMPACT-MENU-LIST");
        declareMacro(me, "html_fancy_ordered_list", "HTML-FANCY-ORDERED-LIST");
        declareMacro(me, "html_ordered_list", "HTML-ORDERED-LIST");
        declareMacro(me, "html_number_list", "HTML-NUMBER-LIST");
        declareMacro(me, "html_fancy_unordered_list", "HTML-FANCY-UNORDERED-LIST");
        declareMacro(me, "html_unordered_list", "HTML-UNORDERED-LIST");
        declareMacro(me, "html_bullet_list", "HTML-BULLET-LIST");
        declareMacro(me, "html_plain_list", "HTML-PLAIN-LIST");
        declareMacro(me, "html_fancy_list_item", "HTML-FANCY-LIST-ITEM");
        declareMacro(me, "html_list_item", "HTML-LIST-ITEM");
        declareMacro(me, "html_fancy_summary", "HTML-FANCY-SUMMARY");
        declareMacro(me, "html_fancy_details", "HTML-FANCY-DETAILS");
        declareMacro(me, "html_applet", "HTML-APPLET");
        declareMacro(me, "html_param", "HTML-PARAM");
        declareMacro(me, "html_safe_param", "HTML-SAFE-PARAM");
        declareMacro(me, "with_html_id_space", "WITH-HTML-ID-SPACE");
        declareFunction(me, "next_html_id", "NEXT-HTML-ID", 0, 1, false);
        declareFunction(me, "next_html_id_definedP", "NEXT-HTML-ID-DEFINED?", 0, 1, false);
        declareMacro(me, "with_html_unique_form_fields", "WITH-HTML-UNIQUE-FORM-FIELDS");
        declareMacro(me, "with_html_unique_form_field_decoding", "WITH-HTML-UNIQUE-FORM-FIELD-DECODING");
        declareFunction(me, "next_html_form_field_uniquifier_code", "NEXT-HTML-FORM-FIELD-UNIQUIFIER-CODE", 0, 0, false);
        declareFunction(me, "find_or_create_html_form_field_uniquifier_isg", "FIND-OR-CREATE-HTML-FORM-FIELD-UNIQUIFIER-ISG", 0, 0, false);
        declareFunction(me, "embed_form_field_code", "EMBED-FORM-FIELD-CODE", 1, 0, false);
        declareFunction(me, "get_form_field_code", "GET-FORM-FIELD-CODE", 1, 0, false);
        declareMacro(me, "html_fancy_form", "HTML-FANCY-FORM");
        declareMacro(me, "html_fancy_input", "HTML-FANCY-INPUT");
        declareMacro(me, "html_script_button", "HTML-SCRIPT-BUTTON");
        declareMacro(me, "html_script_radio", "HTML-SCRIPT-RADIO");
        declareMacro(me, "html_script_submit", "HTML-SCRIPT-SUBMIT");
        declareMacro(me, "html_fancy_select", "HTML-FANCY-SELECT");
        declareMacro(me, "html_fancy_option", "HTML-FANCY-OPTION");
        declareMacro(me, "html_optgroup", "HTML-OPTGROUP");
        declareMacro(me, "html_fancy_textarea", "HTML-FANCY-TEXTAREA");
        declareMacro(me, "html_table_caption", "HTML-TABLE-CAPTION");
        declareMacro(me, "html_fancy_table", "HTML-FANCY-TABLE");
        declareMacro(me, "html_table", "HTML-TABLE");
        declareMacro(me, "html_fancy_table_data", "HTML-FANCY-TABLE-DATA");
        declareMacro(me, "html_table_data", "HTML-TABLE-DATA");
        declareMacro(me, "html_fancy_table_header", "HTML-FANCY-TABLE-HEADER");
        declareMacro(me, "html_table_heading", "HTML-TABLE-HEADING");
        declareMacro(me, "html_table_header_block", "HTML-TABLE-HEADER-BLOCK");
        declareMacro(me, "html_table_footer_block", "HTML-TABLE-FOOTER-BLOCK");
        declareMacro(me, "html_table_body_block", "HTML-TABLE-BODY-BLOCK");
        declareMacro(me, "html_fancy_table_row", "HTML-FANCY-TABLE-ROW");
        declareMacro(me, "html_table_row", "HTML-TABLE-ROW");
        declareMacro(me, "html_indent_table", "HTML-INDENT-TABLE");
        declareMacro(me, "html_indent_row", "HTML-INDENT-ROW");
        declareMacro(me, "html_indented_line", "HTML-INDENTED-LINE");
        declareMacro(me, "html_indented_line_inverse", "HTML-INDENTED-LINE-INVERSE");
        declareMacro(me, "cdolist_with_alternating_bgcolor", "CDOLIST-WITH-ALTERNATING-BGCOLOR");
        declareMacro(me, "cdolist_with_cyc_logo_colors", "CDOLIST-WITH-CYC-LOGO-COLORS");
        declareMacro(me, "cdolist_with_cyc_background_colors", "CDOLIST-WITH-CYC-BACKGROUND-COLORS");
        declareMacro(me, "cdolist_with_alternating_variable", "CDOLIST-WITH-ALTERNATING-VARIABLE");
        declareMacro(me, "cdolist_with_alternating_classes", "CDOLIST-WITH-ALTERNATING-CLASSES");
        declareMacro(me, "switch_cyc_logo_color", "SWITCH-CYC-LOGO-COLOR");
        declareMacro(me, "html_fancy_anchor", "HTML-FANCY-ANCHOR");
        declareMacro(me, "html_script_anchor", "HTML-SCRIPT-ANCHOR");
        declareMacro(me, "html_target_reference", "HTML-TARGET-REFERENCE");
        declareMacro(me, "html_mailto_anchor", "HTML-MAILTO-ANCHOR");
        declareMacro(me, "html_file_anchor", "HTML-FILE-ANCHOR");
        declareMacro(me, "html_fancy_area", "HTML-FANCY-AREA");
        declareMacro(me, "html_blink", "HTML-BLINK");
        declareMacro(me, "html_comment", "HTML-COMMENT");
        declareMacro(me, "html_fancy_frame", "HTML-FANCY-FRAME");
        declareMacro(me, "html_frame", "HTML-FRAME");
        declareMacro(me, "html_fancy_frameset", "HTML-FANCY-FRAMESET");
        declareMacro(me, "html_frameset", "HTML-FRAMESET");
        declareMacro(me, "html_fancy_iframe", "HTML-FANCY-IFRAME");
        declareMacro(me, "html_fancy_image", "HTML-FANCY-IMAGE");
        declareMacro(me, "html_embedded_image", "HTML-EMBEDDED-IMAGE");
        declareFunction(me, "html_embedded_image_data_src", "HTML-EMBEDDED-IMAGE-DATA-SRC", 1, 1, false);
        declareFunction(me, "html_base64_string_for_file", "HTML-BASE64-STRING-FOR-FILE", 1, 0, false);
        declareMacro(me, "html_fancy_map", "HTML-FANCY-MAP");
        declareMacro(me, "html_map", "HTML-MAP");
        declareMacro(me, "html_no_break", "HTML-NO-BREAK");
        declareMacro(me, "html_no_frames", "HTML-NO-FRAMES");
        declareMacro(me, "html_object", "HTML-OBJECT");
        declareMacro(me, "html_fancy_script", "HTML-FANCY-SCRIPT");
        declareMacro(me, "html_javascript", "HTML-JAVASCRIPT");
        declareMacro(me, "html_noscript", "HTML-NOSCRIPT");
        declareMacro(me, "cyc_link", "CYC-LINK");
        declareMacro(me, "html_dummy_form", "HTML-DUMMY-FORM");
        declareMacro(me, "html_basic_cyc_form", "HTML-BASIC-CYC-FORM");
        declareMacro(me, "html_basic_cyc_form_handler", "HTML-BASIC-CYC-FORM-HANDLER");
        declareMacro(me, "html_basic_textarea", "HTML-BASIC-TEXTAREA");
        declareMacro(me, "html_basic_textarea_wrap", "HTML-BASIC-TEXTAREA-WRAP");
        declareMacro(me, "html_basic_select", "HTML-BASIC-SELECT");
        declareMacro(me, "html_basic_option", "HTML-BASIC-OPTION");
        declareMacro(me, "html_basic_table", "HTML-BASIC-TABLE");
        declareMacro(me, "html_autocomplete_textarea", "HTML-AUTOCOMPLETE-TEXTAREA");
        declareMacro(me, "with_html_output_to_stream", "WITH-HTML-OUTPUT-TO-STREAM");
        declareMacro(me, "with_html_output_to_string", "WITH-HTML-OUTPUT-TO-STRING");
        declareMacro(me, "with_html_output_to_ascii_string", "WITH-HTML-OUTPUT-TO-ASCII-STRING");
        declareMacro(me, "with_html_state", "WITH-HTML-STATE");
        declareFunction(me, "html_parameter_entry_format", "HTML-PARAMETER-ENTRY-FORMAT", 1, 0, false);
        declareFunction(me, "set_html_parameter_entry_format", "SET-HTML-PARAMETER-ENTRY-FORMAT", 2, 0, false);
        declareMacro(me, "declare_html_parameter_entry_format", "DECLARE-HTML-PARAMETER-ENTRY-FORMAT");
        declareMacro(me, "define_cgi_handler", "DEFINE-CGI-HANDLER");
        declareFunction(me, "note_cgi_handler_function", "NOTE-CGI-HANDLER-FUNCTION", 2, 0, false);
        declareFunction(me, "get_handler_mime_type_hash", "GET-HANDLER-MIME-TYPE-HASH", 0, 0, false);
        declareFunction(me, "get_handler_mime_type_property", "GET-HANDLER-MIME-TYPE-PROPERTY", 1, 0, false);
        declareMacro(me, "define_html_handler", "DEFINE-HTML-HANDLER");
        declareMacro(me, "define_html_fragment_handler", "DEFINE-HTML-FRAGMENT-HANDLER");
        declareFunction(me, "cgi_handler_functionP", "CGI-HANDLER-FUNCTION?", 1, 0, false);
        declareFunction(me, "html_handler_functionP", "HTML-HANDLER-FUNCTION?", 1, 0, false);
        declareFunction(me, "xml_handler_functionP", "XML-HANDLER-FUNCTION?", 1, 0, false);
        declareFunction(me, "json_handler_functionP", "JSON-HANDLER-FUNCTION?", 1, 0, false);
        declareFunction(me, "all_cgi_handler_symbols", "ALL-CGI-HANDLER-SYMBOLS", 1, 0, false);
        declareFunction(me, "all_html_handler_symbols", "ALL-HTML-HANDLER-SYMBOLS", 0, 0, false);
        declareFunction(me, "all_json_handler_symbols", "ALL-JSON-HANDLER-SYMBOLS", 0, 0, false);
        declareFunction(me, "all_xml_handler_symbols", "ALL-XML-HANDLER-SYMBOLS", 0, 0, false);
        declareMacro(me, "define_xml_handler", "DEFINE-XML-HANDLER");
        declareMacro(me, "define_json_handler", "DEFINE-JSON-HANDLER");
        declareMacro(me, "with_html_args", "WITH-HTML-ARGS");
        declareMacro(me, "html_possibly_strong", "HTML-POSSIBLY-STRONG");
        return NIL;
    }

    public static SubLObject init_html_macros_file() {
        defparameter("*HTML-STREAM*", T);
        defparameter("*HTML-DEFAULT-BGCOLOR*", NIL);
        defparameter("*HTML-FORCE-IE-STANDARDS-MODE*", T);
        defconstant("*HTML-BODY-HEAD*", $str1$_body);
        defconstant("*HTML-BODY-TAIL*", $str2$__body_);
        defconstant("*HTML-BODY-BGCOLOR*", $str3$_bgcolor_);
        defconstant("*HTML-BODY-BACKGROUND*", $str4$_background_);
        defconstant("*HTML-BODY-CLASS*", $str5$_class_);
        defconstant("*HTML-BODY-STYLE*", $str6$_style_);
        defconstant("*HTML-BODY-TEXT*", $str7$_text_);
        defconstant("*HTML-BODY-LINK*", $str8$_link_);
        defconstant("*HTML-BODY-ALINK*", $str9$_alink_);
        defconstant("*HTML-BODY-VLINK*", $str10$_vlink_);
        defconstant("*HTML-BODY-ONLOAD*", $str11$_onLoad_);
        defconstant("*HTML-BODY-ONRESIZE*", $str12$_onResize_);
        defconstant("*HTML-DIV-HEAD*", $str13$_div);
        defconstant("*HTML-DIV-TAIL*", $str14$__div_);
        defconstant("*HTML-DIV-CLASS*", $str5$_class_);
        defconstant("*HTML-DIV-STYLE*", $str6$_style_);
        defconstant("*HTML-DIV-TITLE*", $str15$_title_);
        defconstant("*HTML-DIV-ALIGN*", $str16$_align_);
        defconstant("*HTML-DIV-ONLOAD*", $str11$_onLoad_);
        defconstant("*HTML-SPAN-HEAD*", $str17$_span);
        defconstant("*HTML-SPAN-TAIL*", $str18$__span_);
        defconstant("*HTML-SPAN-CLASS*", $str5$_class_);
        defconstant("*HTML-SPAN-STYLE*", $str6$_style_);
        defconstant("*HTML-HEAD-HEAD*", $str19$_head_);
        defconstant("*HTML-HEAD-TAIL*", $str20$__head_);
        defconstant("*HTML-HTML-HEAD*", $str21$_html_);
        defconstant("*HTML-HTML-TAIL*", $str22$__html_);
        defconstant("*HTML-ATTRIBUTE-ID*", $str23$_id_);
        defconstant("*HTML-ATTRIBUTE-CLASS*", $str5$_class_);
        defconstant("*HTML-ATTRIBUTE-STYLE*", $str6$_style_);
        defconstant("*HTML-ATTRIBUTE-TITLE*", $str15$_title_);
        defconstant("*HTML-EVENT-ATTRIBUTE-ONCLICK*", $str24$_onclick_);
        defconstant("*HTML-EVENT-ATTRIBUTE-ONBLUR*", $str25$_onblur_);
        defconstant("*HTML-EVENT-ATTRIBUTE-ONFOCUS*", $str26$_onfocus_);
        defconstant("*HTML-EVENT-ATTRIBUTE-ONKEYUP*", $str27$_onkeyup_);
        defconstant("*HTML-EVENT-ATTRIBUTE-ONKEYDOWN*", $str28$_onkeydown_);
        defconstant("*HTML-EVENT-ATTRIBUTE-ONKEYPRESS*", $str29$_onkeypress_);
        defconstant("*HTML-META-HEAD*", $str30$_meta);
        defconstant("*HTML-META-HTTP-EQUIV*", $str31$_http_equiv_);
        defconstant("*HTML-META-CONTENT*", $str32$_content_);
        defconstant("*HTML-META-SCHEME*", $str33$_scheme_);
        defconstant("*HTML-META-NAME*", $str34$_name_);
        defconstant("*HTML-META-LANG*", $str35$_lang_);
        defconstant("*HTML-META-DIR*", $str36$_dir_);
        defconstant("*HTML-TITLE-HEAD*", $str37$_title_);
        defconstant("*HTML-TITLE-TAIL*", $str38$__title_);
        defconstant("*HTML-LINK-HEAD*", $str39$_link);
        defconstant("*HTML-LINK-REL*", $str40$_rel_);
        defconstant("*HTML-LINK-TYPE*", $str41$_type_);
        defconstant("*HTML-LINK-HREF*", $str42$_href_);
        defconstant("*HTML-LINK-MEDIA*", $str43$_media_);
        defconstant("*HTML-LINK-TITLE*", $str15$_title_);
        defconstant("*HTML-BASE-HEAD*", $str44$_base);
        defconstant("*HTML-BASE-HREF*", $str42$_href_);
        defconstant("*HTML-STYLE-HEAD*", $str45$_style_);
        defconstant("*HTML-STYLE-TAIL*", $str46$__style_);
        defconstant("*HTML-BLOCKQUOTE-HEAD*", $str47$_blockquote_);
        defconstant("*HTML-BLOCKQUOTE-TAIL*", $str48$__blockquote_);
        defconstant("*HTML-CENTER-HEAD*", $str49$_center_);
        defconstant("*HTML-CENTER-TAIL*", $str50$__center_);
        defconstant("*HTML-HEADING-HEAD*", $str51$_h);
        defconstant("*HTML-HEADING-TAIL*", $str52$__h);
        defconstant("*HTML-HR-HEAD*", $str53$_hr);
        defconstant("*HTML-HR-SIZE*", $str54$_size_);
        defconstant("*HTML-HR-WIDTH*", $str55$_width_);
        defconstant("*HTML-LINE-BREAK-ATOMIC*", $str56$_br___);
        defconstant("*HTML-LINE-BREAK-HEAD*", $str57$_br);
        defconstant("*HTML-LINE-BREAK-TAIL*", $str58$__br_);
        defconstant("*HTML-LINE-BREAK-CLEAR*", $str59$_clear_);
        defconstant("*HTML-LINE-BREAK*", $str60$_br_);
        defconstant("*HTML-PARAGRAPH-HEAD*", $str61$_p_);
        defconstant("*HTML-PARAGRAPH-TAIL*", $str62$__p_);
        defconstant("*HTML-PLAINTEXT-HEAD*", $str63$_plaintext_);
        defconstant("*HTML-PLAINTEXT-TAIL*", $str64$__plaintext_);
        defconstant("*HTML-PREFORMATTED-HEAD*", $str65$_pre_);
        defconstant("*HTML-PREFORMATTED-TAIL*", $str66$__pre_);
        defconstant("*HTML-ADDRESS-HEAD*", $str67$_address_);
        defconstant("*HTML-ADDRESS-TAIL*", $str68$__address_);
        defconstant("*HTML-BIG-HEAD*", $str69$_big_);
        defconstant("*HTML-BIG-TAIL*", $str70$__big_);
        defconstant("*HTML-BOLD-HEAD*", $str71$_b_);
        defconstant("*HTML-BOLD-TAIL*", $str72$__b_);
        defconstant("*HTML-CITE-HEAD*", $str73$_cite_);
        defconstant("*HTML-CITE-TAIL*", $str74$__cite_);
        defconstant("*HTML-CODE-HEAD*", $str75$_code_);
        defconstant("*HTML-CODE-TAIL*", $str76$__code_);
        defconstant("*HTML-DEFINITION-HEAD*", $str77$_dfn_);
        defconstant("*HTML-DEFINITION-TAIL*", $str78$__dfn_);
        defconstant("*HTML-EMPHASIZED-HEAD*", $str79$_em_);
        defconstant("*HTML-EMPHASIZED-TAIL*", $str80$__em_);
        defconstant("*HTML-FONT-HEAD*", $str81$_font);
        defconstant("*HTML-FONT-TAIL*", $str82$__font_);
        defconstant("*HTML-FONT-SIZE*", $str54$_size_);
        defconstant("*HTML-FONT-COLOR*", $str83$_color_);
        defconstant("*HTML-FONT-FACE*", $str84$_face_);
        defconstant("*HTML-ITALIC-HEAD*", $str85$_i_);
        defconstant("*HTML-ITALIC-TAIL*", $str86$__i_);
        defconstant("*HTML-KEYBOARD-HEAD*", $str87$_kbd_);
        defconstant("*HTML-KEYBOARD-TAIL*", $str88$__kbd_);
        defconstant("*HTML-SAMPLE-HEAD*", $str89$_samp_);
        defconstant("*HTML-SAMPLE-TAIL*", $str90$__samp_);
        defconstant("*HTML-SMALL-HEAD*", $str91$_small_);
        defconstant("*HTML-SMALL-TAIL*", $str92$__small_);
        defconstant("*HTML-STRIKETHROUGH-HEAD*", $str93$_strike_);
        defconstant("*HTML-STRIKETHROUGH-TAIL*", $str94$__strike_);
        defconstant("*HTML-STRONG-HEAD*", $str95$_strong_);
        defconstant("*HTML-STRONG-TAIL*", $str96$__strong_);
        defconstant("*HTML-SUBSCRIPT-HEAD*", $str97$_sub_);
        defconstant("*HTML-SUBSCRIPT-TAIL*", $str98$__sub_);
        defconstant("*HTML-SUPERSCRIPT-HEAD*", $str99$_sup_);
        defconstant("*HTML-SUPERSCRIPT-TAIL*", $str100$__sup_);
        defconstant("*HTML-TELETYPE-HEAD*", $str101$_tt_);
        defconstant("*HTML-TELETYPE-TAIL*", $str102$__tt_);
        defconstant("*HTML-UNDERLINED-HEAD*", $str103$_u_);
        defconstant("*HTML-UNDERLINED-TAIL*", $str104$__u_);
        defconstant("*HTML-VARIABLE-HEAD*", $str105$_var_);
        defconstant("*HTML-VARIABLE-TAIL*", $str106$__var_);
        defconstant("*HTML-LABEL-HEAD*", $str107$_label);
        defconstant("*HTML-LABEL-TAIL*", $str108$__label_);
        defconstant("*HTML-LABEL-ACCESS-KEY*", $str109$_accesskey_);
        defconstant("*HTML-LABEL-FOR*", $str110$_for_);
        defconstant("*HTML-STYLE-FONT-SIZE-SMALLER*", $str111$font_size__smaller);
        defconstant("*HTML-STYLE-FONT-SIZE-LARGER*", $str112$font_size__larger);
        defconstant("*HTML-DEFINITION-LIST-HEAD*", $str113$_dl);
        defconstant("*HTML-DEFINITION-LIST-TAIL*", $str114$__dl_);
        defconstant("*HTML-DEFINITION-LIST-TERM-HEAD*", $str115$_dt_);
        defconstant("*HTML-DEFINITION-LIST-TERM-TAIL*", $str116$__dt_);
        defconstant("*HTML-DEFINITION-LIST-DEF-HEAD*", $str117$_dd_);
        defconstant("*HTML-DEFINITION-LIST-DEF-TAIL*", $str118$__dd_);
        defconstant("*HTML-DIRECTORY-LIST-HEAD*", $str119$_dir);
        defconstant("*HTML-DIRECTORY-LIST-TAIL*", $str120$__dir_);
        defconstant("*HTML-MENU-LIST-HEAD*", $str121$_menu);
        defconstant("*HTML-MENU-LIST-TAIL*", $str122$__menu_);
        defconstant("*HTML-ORDERED-LIST-HEAD*", $str123$_ol);
        defconstant("*HTML-ORDERED-LIST-TAIL*", $str124$__ol_);
        defconstant("*HTML-UNORDERED-LIST-HEAD*", $str125$_ul);
        defconstant("*HTML-UNORDERED-LIST-TAIL*", $str126$__ul_);
        defconstant("*HTML-LIST-COMPACT*", $$$_compact);
        defconstant("*HTML-LIST-CONTINUE*", $$$_continue);
        defconstant("*HTML-LIST-DINGBAT*", $str129$_dingbat_);
        defconstant("*HTML-LIST-PLAIN*", $$$_plain);
        defconstant("*HTML-LIST-SEQNUM*", $str131$_seqnum_);
        defconstant("*HTML-LIST-SRC*", $str132$_src_);
        defconstant("*HTML-LIST-START*", $str133$_start_);
        defconstant("*HTML-LIST-TYPE*", $str41$_type_);
        defconstant("*HTML-VALID-LIST-TYPES*", $list134);
        defconstant("*HTML-LIST-ITEM-HEAD*", $str135$_li);
        defconstant("*HTML-LIST-ITEM-TAIL*", $str136$__li_);
        defconstant("*HTML-LIST-ITEM-DINGBAT*", $str129$_dingbat_);
        defconstant("*HTML-LIST-ITEM-SKIP*", $str137$_skip_);
        defconstant("*HTML-LIST-ITEM-SRC*", $str132$_src_);
        defconstant("*HTML-LIST-ITEM-ID*", $str23$_id_);
        defconstant("*HTML-LIST-ITEM-TYPE*", $str41$_type_);
        defconstant("*HTML-SUMMARY-HEAD*", $str138$_summary);
        defconstant("*HTML-SUMMARY-TAIL*", $str139$__summary_);
        defconstant("*HTML-DETAILS-HEAD*", $str140$_details);
        defconstant("*HTML-DETAILS-TAIL*", $str141$__details_);
        defconstant("*HTML-FORM-HEAD*", $str142$_form);
        defconstant("*HTML-FORM-TAIL*", $str143$__form_);
        defconstant("*HTML-FORM-ACTION*", $str144$_action_);
        defconstant("*HTML-FORM-METHOD*", $str145$_method_);
        defconstant("*HTML-FORM-TARGET*", $str146$_target_);
        defconstant("*HTML-FORM-NAME*", $str34$_name_);
        defconstant("*HTML-FORM-ENCTYPE*", $str147$_enctype_);
        defconstant("*HTML-FORM-METHOD-GET*", $$$get);
        defconstant("*HTML-FORM-METHOD-POST*", $$$post);
        defconstant("*HTML-BLANK-TARGET*", $str150$_blank);
        defconstant("*HTML-SELF-TARGET*", $str151$_self);
        defconstant("*HTML-PARENT-TARGET*", $str152$_parent);
        defconstant("*HTML-TOP-TARGET*", $str153$_top);
        defconstant("*HTML-INPUT-HEAD*", $str154$_input);
        defconstant("*HTML-INPUT-CHECKED*", $$$_checked);
        defconstant("*HTML-INPUT-READONLY*", $$$_readonly);
        defconstant("*HTML-INPUT-DISABLED*", $$$_disabled);
        defvar("*HTML-INPUT-DISABLED?*", NIL);
        defconstant("*HTML-INPUT-MAXLENGTH*", $str158$_maxlength_);
        defconstant("*HTML-INPUT-ALIGN*", $str16$_align_);
        defconstant("*HTML-INPUT-BORDER*", $str159$_border_);
        defconstant("*HTML-INPUT-MIN*", $str160$_min_);
        defconstant("*HTML-INPUT-MAX*", $str161$_max_);
        defconstant("*HTML-INPUT-STEP*", $str162$_step_);
        defconstant("*HTML-INPUT-NAME*", $str34$_name_);
        defconstant("*HTML-INPUT-SIZE*", $str54$_size_);
        defconstant("*HTML-INPUT-SRC*", $str132$_src_);
        defconstant("*HTML-INPUT-TYPE*", $str41$_type_);
        defconstant("*HTML-INPUT-STYLE*", $str6$_style_);
        defconstant("*HTML-INPUT-VALUE*", $str163$_value_);
        defconstant("*HTML-INPUT-ALT*", $str164$_alt_);
        defconstant("*HTML-INPUT-CHECKBOX*", $$$checkbox);
        defconstant("*HTML-INPUT-BUTTON*", $$$button);
        defconstant("*HTML-INPUT-HIDDEN*", $$$hidden);
        defconstant("*HTML-INPUT-IMAGE*", $$$image);
        defconstant("*HTML-INPUT-PASSWORD*", $$$password);
        defconstant("*HTML-INPUT-RADIO*", $$$radio);
        defconstant("*HTML-INPUT-RANGE*", $$$range);
        defconstant("*HTML-INPUT-RESET*", $$$reset);
        defconstant("*HTML-INPUT-SUBMIT*", $$$submit);
        defconstant("*HTML-INPUT-TEXT*", $$$text);
        defconstant("*HTML-SELECT-HEAD*", $str175$_select);
        defconstant("*HTML-SELECT-TAIL*", $str176$__select_);
        defconstant("*HTML-SELECT-NAME*", $str34$_name_);
        defconstant("*HTML-SELECT-SIZE*", $str54$_size_);
        defconstant("*HTML-SELECT-MULTIPLE*", $$$_multiple);
        defconstant("*HTML-SELECT-ONCHANGE*", $str178$_onChange_);
        defconstant("*HTML-OPTION-HEAD*", $str179$_option);
        defconstant("*HTML-OPTION-TAIL*", $str180$);
        defconstant("*HTML-OPTION-VALUE*", $str163$_value_);
        defconstant("*HTML-OPTION-SELECTED*", $$$_selected);
        defconstant("*HTML-OPTGROUP-HEAD*", $str182$_optgroup);
        defconstant("*HTML-OPTGROUP-TAIL*", $str183$__optgroup_);
        defconstant("*HTML-OPTGROUP-LABEL*", $str184$_label_);
        defconstant("*HTML-SELECT-SRC*", $str132$_src_);
        defconstant("*HTML-SELECT-WIDTH*", $str55$_width_);
        defconstant("*HTML-SELECT-HEIGHT*", $str185$_height_);
        defconstant("*HTML-SELECT-UNITS*", $str186$_units_);
        defconstant("*HTML-OPTION-SHAPE*", $str187$_shape_);
        defconstant("*HTML-TEXTAREA-HEAD*", $str188$_textarea);
        defconstant("*HTML-TEXTAREA-TAIL*", $str189$__textarea_);
        defconstant("*HTML-TEXTAREA-NAME*", $str34$_name_);
        defconstant("*HTML-TEXTAREA-ROWS*", $str190$_rows_);
        defconstant("*HTML-TEXTAREA-COLS*", $str191$_cols_);
        defconstant("*HTML-TEXTAREA-ID*", $str23$_id_);
        defconstant("*HTML-TEXTAREA-STYLE*", $str6$_style_);
        defconstant("*HTML-CAPTION-HEAD*", $str192$_caption);
        defconstant("*HTML-CAPTION-TAIL*", $str193$__caption_);
        defconstant("*HTML-CAPTION-ALIGN*", $str16$_align_);
        defconstant("*HTML-TABLE-HEAD*", $str194$_table);
        defconstant("*HTML-TABLE-TAIL*", $str195$__table_);
        defconstant("*HTML-TABLE-NOFLOW*", $$$_noflow);
        defconstant("*HTML-TABLE-NOWRAP*", $$$_nowrap);
        defconstant("*HTML-TABLE-WRAP*", $str198$_wrap_);
        defconstant("*HTML-TABLE-ALIGN*", $str16$_align_);
        defconstant("*HTML-TABLE-BORDER*", $str159$_border_);
        defconstant("*HTML-TABLE-BORDERCOLOR*", $str199$_bordercolor_);
        defconstant("*HTML-TABLE-CELLPADDING*", $str200$_cellpadding_);
        defconstant("*HTML-TABLE-CELLSPACING*", $str201$_cellspacing_);
        defconstant("*HTML-TABLE-COLSPEC*", $str202$_colspec_);
        defconstant("*HTML-TABLE-UNITS*", $str186$_units_);
        defconstant("*HTML-TABLE-BGCOLOR*", $str3$_bgcolor_);
        defconstant("*HTML-TABLE-WIDTH*", $str55$_width_);
        defconstant("*HTML-TABLE-BACKGROUND*", $str4$_background_);
        defconstant("*HTML-TABLE-THEAD-HEAD*", $str203$_thead);
        defconstant("*HTML-TABLE-THEAD-TAIL*", $str204$__thead_);
        defconstant("*HTML-TABLE-TFOOT-HEAD*", $str205$_tfoot);
        defconstant("*HTML-TABLE-TFOOT-TAIL*", $str206$__tfoot_);
        defconstant("*HTML-TABLE-TBODY-HEAD*", $str207$_tbody);
        defconstant("*HTML-TABLE-TBODY-TAIL*", $str208$__tbody_);
        defconstant("*HTML-TABLE-DATA-HEAD*", $str209$_td);
        defconstant("*HTML-TABLE-DATA-TAIL*", $str210$__td_);
        defconstant("*HTML-TABLE-HEADER-HEAD*", $str211$_th);
        defconstant("*HTML-TABLE-HEADER-TAIL*", $str212$__th_);
        defconstant("*HTML-TABLE-ROW-HEAD*", $str213$_tr);
        defconstant("*HTML-TABLE-ROW-TAIL*", $str214$__tr_);
        defconstant("*HTML-TABLE-ROW-BGCOLOR*", $str3$_bgcolor_);
        defconstant("*HTML-TABLE-ROW-HEIGHT*", $str185$_height_);
        defconstant("*HTML-TABLE-ROW-TITLE*", $str15$_title_);
        defconstant("*HTML-TABLE-ROW-NAME*", $str34$_name_);
        defconstant("*HTML-TABLE-DATA-NOWRAP*", $$$_nowrap);
        defconstant("*HTML-TABLE-DATA-ALIGN*", $str16$_align_);
        defconstant("*HTML-TABLE-DATA-COLSPAN*", $str215$_colspan_);
        defconstant("*HTML-TABLE-DATA-ROWSPAN*", $str216$_rowspan_);
        defconstant("*HTML-TABLE-DATA-VALIGN*", $str217$_valign_);
        defconstant("*HTML-TABLE-DATA-BGCOLOR*", $str3$_bgcolor_);
        defconstant("*HTML-TABLE-DATA-WIDTH*", $str55$_width_);
        defconstant("*HTML-TABLE-DATA-HEIGHT*", $str185$_height_);
        defconstant("*HTML-ATOMIC-TAIL*", $str218$__);
        defconstant("*HTML-PROTOCOL-MAILTO*", $str219$mailto_);
        defconstant("*HTML-PROTOCOL-FILE*", $str220$file_);
        defconstant("*HTML-PROTOCOL-FTP*", $str221$ftp_);
        defconstant("*HTML-ANCHOR-HEAD*", $str222$_a);
        defconstant("*HTML-ANCHOR-TAIL*", $str223$__a_);
        defconstant("*HTML-ANCHOR-HREF*", $str42$_href_);
        defconstant("*HTML-ANCHOR-NAME*", $str34$_name_);
        defconstant("*HTML-ANCHOR-ID*", $str23$_id_);
        defconstant("*HTML-ANCHOR-TITLE*", $str15$_title_);
        defconstant("*HTML-ANCHOR-TARGET*", $str146$_target_);
        defconstant("*HTML-ANCHOR-STYLE*", $str6$_style_);
        defconstant("*HTML-ANCHOR-ONMOUSEOVER*", $str224$_onmouseover_);
        defconstant("*HTML-ANCHOR-ONMOUSEOUT*", $str225$_onmouseout_);
        defconstant("*HTML-ANCHOR-ONMOUSEUP*", $str226$_onmouseup_);
        defconstant("*HTML-ANCHOR-ONMOUSEDOWN*", $str227$_onmousedown_);
        defconstant("*HTML-AREA-HEAD*", $str228$_area);
        defconstant("*HTML-AREA-NOHREF*", $$$_nohref);
        defconstant("*HTML-AREA-ALT*", $str164$_alt_);
        defconstant("*HTML-AREA-CO-ORDS*", $str230$_co_ords_);
        defconstant("*HTML-AREA-HREF*", $str42$_href_);
        defconstant("*HTML-AREA-SHAPE*", $str187$_shape_);
        defconstant("*HTML-AREA-TARGET*", $str146$_target_);
        defconstant("*HTML-BASEFONT-HEAD*", $str231$_basefont);
        defconstant("*HTML-BASEFONT-SIZE*", $str54$_size_);
        defconstant("*HTML-BASEFONT-COLOR*", $str83$_color_);
        defconstant("*HTML-BLINK-HEAD*", $str232$_blink_);
        defconstant("*HTML-BLINK-TAIL*", $str233$__blink_);
        defconstant("*HTML-COMMENT-HEAD*", $str234$____);
        defconstant("*HTML-COMMENT-TAIL*", $str235$___);
        defconstant("*HTML-FRAME-HEAD*", $str236$_frame);
        defconstant("*HTML-FRAME-FRAMEBORDER*", $str237$_frameborder_);
        defconstant("*HTML-FRAME-NORESIZE*", $$$_noresize);
        defconstant("*HTML-FRAME-MARGINHEIGHT*", $str239$_marginheight_);
        defconstant("*HTML-FRAME-MARGINWIDTH*", $str240$_marginwidth_);
        defconstant("*HTML-FRAME-NAME*", $str34$_name_);
        defconstant("*HTML-FRAME-SCROLLING*", $str241$_scrolling_);
        defconstant("*HTML-FRAME-SRC*", $str132$_src_);
        defconstant("*HTML-FRAMESET-HEAD*", $str242$_frameset);
        defconstant("*HTML-FRAMESET-TAIL*", $str243$__frameset_);
        defconstant("*HTML-FRAMESET-COLS*", $str191$_cols_);
        defconstant("*HTML-FRAMESET-ROWS*", $str190$_rows_);
        defconstant("*HTML-FRAMESET-FRAMEBORDER*", $str237$_frameborder_);
        defconstant("*HTML-IFRAME-HEAD*", $str244$_iframe);
        defconstant("*HTML-IFRAME-TAIL*", $str245$__iframe_);
        defconstant("*HTML-IFRAME-ALIGN*", $str16$_align_);
        defconstant("*HTML-IFRAME-FRAMEBORDER*", $str237$_frameborder_);
        defconstant("*HTML-IFRAME-HEIGHT*", $str185$_height_);
        defconstant("*HTML-IFRAME-MARGINHEIGHT*", $str239$_marginheight_);
        defconstant("*HTML-IFRAME-MARGINWIDTH*", $str240$_marginwidth_);
        defconstant("*HTML-IFRAME-NAME*", $str34$_name_);
        defconstant("*HTML-IFRAME-SCROLLING*", $str241$_scrolling_);
        defconstant("*HTML-IFRAME-SRC*", $str132$_src_);
        defconstant("*HTML-IFRAME-WIDTH*", $str55$_width_);
        defconstant("*HTML-IMAGE-HEAD*", $str246$_img);
        defconstant("*HTML-IMAGE-TAIL*", $str247$__img_);
        defconstant("*HTML-IMAGE-NAME*", $str34$_name_);
        defconstant("*HTML-IMAGE-ISMAP*", $$$_ismap);
        defconstant("*HTML-IMAGE-HEIGHT*", $str185$_height_);
        defconstant("*HTML-IMAGE-WIDTH*", $str55$_width_);
        defconstant("*HTML-IMAGE-ALT*", $str164$_alt_);
        defconstant("*HTML-IMAGE-ALIGN*", $str16$_align_);
        defconstant("*HTML-IMAGE-BORDER*", $str159$_border_);
        defconstant("*HTML-IMAGE-SRC*", $str132$_src_);
        defconstant("*HTML-IMAGE-STYLE*", $str6$_style_);
        defconstant("*HTML-APPLET-HEAD*", $str249$_applet_);
        defconstant("*HTML-APPLET-TAIL*", $str250$__applet_);
        defconstant("*HTML-APPLET-CODE*", $str251$_code_);
        defconstant("*HTML-APPLET-CODEBASE*", $str252$_codebase_);
        defconstant("*HTML-APPLET-ARCHIVE*", $str253$_archive_);
        defconstant("*HTML-APPLET-ALT*", $str164$_alt_);
        defconstant("*HTML-APPLET-ALIGN*", $str16$_align_);
        defconstant("*HTML-APPLET-NAME*", $str34$_name_);
        defconstant("*HTML-APPLET-ID*", $str23$_id_);
        defconstant("*HTML-APPLET-HEIGHT*", $str185$_height_);
        defconstant("*HTML-APPLET-WIDTH*", $str55$_width_);
        defconstant("*HTML-PARAM-HEAD*", $str254$_param_);
        defconstant("*HTML-PARAM-NAME*", $str34$_name_);
        defconstant("*HTML-PARAM-VALUE*", $str163$_value_);
        defconstant("*HTML-MAP-HEAD*", $str255$_map);
        defconstant("*HTML-MAP-TAIL*", $str256$__map_);
        defconstant("*HTML-MAP-NAME*", $str34$_name_);
        defconstant("*HTML-NO-BREAK-HEAD*", $str257$_nobr_);
        defconstant("*HTML-NO-BREAK-TAIL*", $str258$__nobr_);
        defconstant("*HTML-NO-FRAMES-HEAD*", $str259$_noframes_);
        defconstant("*HTML-NO-FRAMES-TAIL*", $str260$__noframes_);
        defconstant("*HTML-OBJECT-HEAD*", $str261$_object_);
        defconstant("*HTML-OBJECT-TAIL*", $str262$__object_);
        defconstant("*HTML-OBJECT-CLASSID*", $str263$_classid_);
        defconstant("*HTML-OBJECT-CODEBASE*", $str252$_codebase_);
        defconstant("*HTML-OBJECT-CODETYPE*", $str264$_codetype_);
        defconstant("*HTML-OBJECT-DATA*", $str265$_data_);
        defconstant("*HTML-OBJECT-TYPE*", $str41$_type_);
        defconstant("*HTML-OBJECT-ARCHIVE*", $str253$_archive_);
        defconstant("*HTML-OBJECT-ID*", $str23$_id_);
        defconstant("*HTML-OBJECT-CLASS*", $str5$_class_);
        defconstant("*HTML-OBJECT-ALIGN*", $str16$_align_);
        defconstant("*HTML-OBJECT-WIDTH*", $str55$_width_);
        defconstant("*HTML-OBJECT-HEIGHT*", $str185$_height_);
        defconstant("*HTML-OBJECT-BORDER*", $str159$_border_);
        defconstant("*HTML-OBJECT-HSPACE*", $str266$_hspace_);
        defconstant("*HTML-OBJECT-VSPACE*", $str267$_vspace_);
        defconstant("*HTML-SCRIPT-HEAD*", $str268$_script);
        defconstant("*HTML-SCRIPT-TAIL*", $str269$__script_);
        defconstant("*HTML-SCRIPT-LANGUAGE*", $str270$_language_);
        defconstant("*HTML-SCRIPT-SRC*", $str132$_src_);
        defconstant("*HTML-SCRIPT-TYPE*", $str41$_type_);
        defconstant("*HTML-SCRIPT-JAVASCRIPT*", $$$JavaScript);
        defconstant("*HTML-NOSCRIPT-HEAD*", $str272$_noscript);
        defconstant("*HTML-NOSCRIPT-TAIL*", $str273$__noscript_);
        defconstant("*HTML-WORD-BREAK*", $str274$_wbr_);
        defconstant("*HTML-COLOR-WHITE*", $str275$_ffffff);
        defconstant("*HTML-COLOR-BLACK*", $str276$_000000);
        defconstant("*HTML-COLOR-DARK-GREY*", $str277$_999999);
        defconstant("*HTML-COLOR-LIGHT-GREY*", $str278$_cccccc);
        defconstant("*HTML-COLOR-LIGHTER-GREY*", $str279$_dddddd);
        defconstant("*HTML-COLOR-LIGHTEST-GREY*", $str280$_eeeeee);
        defconstant("*HTML-COLOR-YELLOWISH-GRAY*", $str281$_eeeee4);
        defconstant("*HTML-COLOR-SAT-RED*", $str282$_ff0000);
        defconstant("*HTML-COLOR-DARK-RED*", $str283$_996666);
        defconstant("*HTML-COLOR-MEDIUM-RED*", $str284$_ff8888);
        defconstant("*HTML-COLOR-MEDIUM-DARK-RED*", $str285$_cc0000);
        defconstant("*HTML-COLOR-LIGHT-RED*", $str286$_eeaaaa);
        defconstant("*HTML-COLOR-LIGHTER-RED*", $str287$_ffbbbb);
        defconstant("*HTML-COLOR-SAT-GREEN*", $str288$_00ff00);
        defconstant("*HTML-COLOR-DARK-GREEN*", $str289$_669966);
        defconstant("*HTML-COLOR-DARKER-GREEN*", $str290$_335533);
        defconstant("*HTML-COLOR-LIGHT-GREEN*", $str291$_aaeeaa);
        defconstant("*HTML-COLOR-LIGHTER-GREEN*", $str292$_bbffbb);
        defconstant("*HTML-COLOR-SAT-BLUE*", $str293$_0000ff);
        defconstant("*HTML-COLOR-DARK-BLUE*", $str294$_668899);
        defconstant("*HTML-COLOR-LIGHT-BLUE*", $str295$_aaccee);
        defconstant("*HTML-COLOR-LIGHTER-BLUE*", $str296$_bbddff);
        defconstant("*HTML-COLOR-SAT-YELLOW*", $str297$_ffff00);
        defconstant("*HTML-COLOR-DARK-YELLOW*", $str298$_999966);
        defconstant("*HTML-COLOR-LIGHT-YELLOW*", $str299$_eeeeaa);
        defconstant("*HTML-COLOR-LIGHTER-YELLOW*", $str300$_ffffbb);
        defconstant("*HTML-COLOR-DARKER-PURPLE*", $str301$_9900bb);
        defconstant("*HTML-COLOR-DARK-PURPLE*", $str302$_996699);
        defconstant("*HTML-COLOR-LIGHT-PURPLE*", $str303$_ddbbff);
        defconstant("*HTML-COLOR-LIGHTER-PURPLE*", $str304$_eeccff);
        deflexical("*HTML-COLOR-CYAN*", $str305$_00ffff);
        deflexical("*HTML-COLOR-LIGHT-CYAN*", $str306$_e0ffff);
        deflexical("*HTML-COLOR-CYC-LOGO-VIOLET*", $str307$_9933cc);
        deflexical("*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*", $str308$_f0d3ff);
        deflexical("*HTML-COLOR-CYC-LOGO-LIGHTER-VIOLET*", $str309$_f4e0ff);
        deflexical("*HTML-COLOR-CYC-LOGO-LIGHT-BLUE*", $str310$_e0e5ff);
        deflexical("*HTML-COLOR-CYC-LOGO-LIGHTER-BLUE*", $str311$_e6f0ff);
        defparameter("*HTML-COLOR-MAP*", list(new SubLObject[]{ bq_cons($BLACK, $html_color_black$.getGlobalValue()), bq_cons($BLUE, $html_color_sat_blue$.getGlobalValue()), bq_cons($GREEN, $html_color_sat_green$.getGlobalValue()), $list315, bq_cons($RED, $html_color_sat_red$.getGlobalValue()), $list317, bq_cons($YELLOW, $html_color_sat_yellow$.getGlobalValue()), bq_cons($WHITE, $html_color_white$.getGlobalValue()), bq_cons($DARK_BLUE, $html_color_dark_blue$.getGlobalValue()), $list321, bq_cons($LIGHTER_BLUE, $html_color_lighter_blue$.getGlobalValue()), bq_cons($DARK_RED, $html_color_dark_red$.getGlobalValue()), $list324, $list325, bq_cons($LIGHTER_RED, $html_color_lighter_red$.getGlobalValue()), bq_cons($DARK_YELLOW, $html_color_dark_yellow$.getGlobalValue()), $list328, bq_cons($LIGHTER_YELLOW, $html_color_lighter_yellow$.getGlobalValue()), bq_cons($DARK_GRAY, $html_color_dark_grey$.getGlobalValue()), $list331, bq_cons($LIGHT_GREY, $html_color_light_grey$.getGlobalValue()), bq_cons($LIGHTER_GRAY, $html_color_lighter_grey$.getGlobalValue()), bq_cons($LIGHTEST_GREY, $html_color_lightest_grey$.getGlobalValue()), bq_cons($DARK_PURPLE, $html_color_dark_purple$.getGlobalValue()), bq_cons($LIGHT_PURPLE, $html_color_light_purple$.getGlobalValue()), bq_cons($LIGHTER_PURPLE, $html_color_lighter_purple$.getGlobalValue()) }));
        defparameter("*HTML-ALTERNATING-CLASS1*", $str338$cyc_alternate_class1);
        defparameter("*HTML-ALTERNATING-CLASS2*", $str339$cyc_alternate_class2);
        defconstant("*HTML-KNOWN-DOM-EVENTS*", $list340);
        deflexical("*BASIC-SKIN-CLASS*", $str341$yui_skin_sam);
        defparameter("*HTML-ESCAPES-MAP*", $list342);
        deflexical("*HTML-PRIN1-STRING-ESCAPES-MAP*", $list343);
        deflexical("*HTML-ESCAPES-MAP-FOR-SHOWING-NEWLINES*", $list344);
        defparameter("*HTML-SAFE-PRINT*", T);
        defparameter("*HTML-PRESERVE-BREAKS*", NIL);
        defparameter("*HTML-INSIDE-BODY?*", NIL);
        defparameter("*WITHIN-HTML-PRE*", NIL);
        defparameter("*SUPPRESS-HTML-SOURCE-READABILITY-TERPRI?*", NIL);
        defparameter("*HTML-ID-SPACE-ID-GENERATOR*", NIL);
        defparameter("*HTML-FORM-FIELD-UNIQUIFIER-CODE*", NIL);
        deflexical("*HTML-FORM-FIELD-UNIQUIFIER-ISG*", SubLTrampolineFile.maybeDefault($html_form_field_uniquifier_isg$, $html_form_field_uniquifier_isg$, NIL));
        defparameter("*WITHIN-HTML-FORM*", NIL);
        defparameter("*HTML-INDENT-TABLE-MAX*", NIL);
        deflexical("*HTML-HANDLER-PROPERTY*", SubLTrampolineFile.maybeDefault($html_handler_property$, $html_handler_property$, $HTML_HANDLER));
        deflexical("*XML-HANDLER-PROPERTY*", SubLTrampolineFile.maybeDefault($xml_handler_property$, $xml_handler_property$, $XML_HANDLER));
        deflexical("*JSON-HANDLER-PROPERTY*", SubLTrampolineFile.maybeDefault($json_handler_property$, $json_handler_property$, $JSON_HANDLER));
        deflexical("*HANDLER-MIME-TYPES*", SubLTrampolineFile.maybeDefault($handler_mime_types$, $handler_mime_types$, () -> make_hash_table($int$200, EQ, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_html_macros_file() {
        register_html_state_variable($html_default_bgcolor$);
        register_macro_helper(HTML_HEAD_CONTENT_TYPE, HTML_HEAD);
        register_html_state_variable($html_form_field_uniquifier_code$);
        register_macro_helper(WITH_HTML_UNIQUE_FORM_FIELDS, HTML_FANCY_FORM);
        register_macro_helper(NEXT_HTML_FORM_FIELD_UNIQUIFIER_CODE, WITH_HTML_UNIQUE_FORM_FIELDS);
        declare_defglobal($html_form_field_uniquifier_isg$);
        register_macro_helper(EMBED_FORM_FIELD_CODE, WITH_HTML_UNIQUE_FORM_FIELDS);
        register_macro_helper(GET_FORM_FIELD_CODE, WITH_HTML_UNIQUE_FORM_FIELD_DECODING);
        register_macro_helper(HTML_EMBEDDED_IMAGE_DATA_SRC, HTML_EMBEDDED_IMAGE);
        declare_defglobal($html_handler_property$);
        declare_defglobal($xml_handler_property$);
        declare_defglobal($json_handler_property$);
        register_macro_helper(NOTE_CGI_HANDLER_FUNCTION, DEFINE_HTML_HANDLER);
        declare_defglobal($handler_mime_types$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_html_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_html_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_html_macros_file();
    }

    static {








































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































    }
}

/**
 * Total time: 6643 ms
 */
