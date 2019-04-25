package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.html_macros";
    public static final String myFingerPrint = "a773c8fe123299874657e1e8ba1ad9baf45ff87d37c0f50b4827f9b3c06f195a";
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 502L)
    public static SubLSymbol $html_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 654L)
    public static SubLSymbol $html_default_bgcolor$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 702L)
    public static SubLSymbol $html_force_ie_standards_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 758L)
    public static SubLSymbol $html_body_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1400L)
    public static SubLSymbol $html_body_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1457L)
    public static SubLSymbol $html_body_bgcolor$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1516L)
    public static SubLSymbol $html_body_background$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1578L)
    public static SubLSymbol $html_body_class$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1635L)
    public static SubLSymbol $html_body_style$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1692L)
    public static SubLSymbol $html_body_text$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1748L)
    public static SubLSymbol $html_body_link$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1804L)
    public static SubLSymbol $html_body_alink$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1861L)
    public static SubLSymbol $html_body_vlink$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1918L)
    public static SubLSymbol $html_body_onload$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 1976L)
    public static SubLSymbol $html_body_onresize$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2036L)
    public static SubLSymbol $html_div_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2091L)
    public static SubLSymbol $html_div_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2147L)
    public static SubLSymbol $html_div_class$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2204L)
    public static SubLSymbol $html_div_style$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2261L)
    public static SubLSymbol $html_div_title$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2318L)
    public static SubLSymbol $html_div_align$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2375L)
    public static SubLSymbol $html_div_onload$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2433L)
    public static SubLSymbol $html_span_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2489L)
    public static SubLSymbol $html_span_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2546L)
    public static SubLSymbol $html_span_class$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2603L)
    public static SubLSymbol $html_span_style$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2660L)
    public static SubLSymbol $html_head_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2712L)
    public static SubLSymbol $html_head_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2763L)
    public static SubLSymbol $html_html_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2814L)
    public static SubLSymbol $html_html_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2865L)
    public static SubLSymbol $html_attribute_id$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 2996L)
    public static SubLSymbol $html_attribute_class$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3053L)
    public static SubLSymbol $html_attribute_style$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3110L)
    public static SubLSymbol $html_attribute_title$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3167L)
    public static SubLSymbol $html_event_attribute_onclick$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3274L)
    public static SubLSymbol $html_event_attribute_onblur$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3343L)
    public static SubLSymbol $html_event_attribute_onfocus$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3413L)
    public static SubLSymbol $html_event_attribute_onkeyup$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3483L)
    public static SubLSymbol $html_event_attribute_onkeydown$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3555L)
    public static SubLSymbol $html_event_attribute_onkeypress$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3628L)
    public static SubLSymbol $html_meta_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3702L)
    public static SubLSymbol $html_meta_http_equiv$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3764L)
    public static SubLSymbol $html_meta_content$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3823L)
    public static SubLSymbol $html_meta_scheme$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3881L)
    public static SubLSymbol $html_meta_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3937L)
    public static SubLSymbol $html_meta_lang$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 3993L)
    public static SubLSymbol $html_meta_dir$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4048L)
    public static SubLSymbol $html_title_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4101L)
    public static SubLSymbol $html_title_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4154L)
    public static SubLSymbol $html_link_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4205L)
    public static SubLSymbol $html_link_rel$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4255L)
    public static SubLSymbol $html_link_type$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4306L)
    public static SubLSymbol $html_link_href$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4357L)
    public static SubLSymbol $html_link_media$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4409L)
    public static SubLSymbol $html_link_title$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4461L)
    public static SubLSymbol $html_base_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4512L)
    public static SubLSymbol $html_base_href$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4563L)
    public static SubLSymbol $html_style_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4616L)
    public static SubLSymbol $html_style_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4669L)
    public static SubLSymbol $html_blockquote_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4806L)
    public static SubLSymbol $html_blockquote_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4871L)
    public static SubLSymbol $html_center_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4932L)
    public static SubLSymbol $html_center_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 4993L)
    public static SubLSymbol $html_heading_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5048L)
    public static SubLSymbol $html_heading_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5103L)
    public static SubLSymbol $html_hr_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5159L)
    public static SubLSymbol $html_hr_size$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5217L)
    public static SubLSymbol $html_hr_width$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5276L)
    public static SubLSymbol $html_line_break_atomic$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5335L)
    public static SubLSymbol $html_line_break_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5447L)
    public static SubLSymbol $html_line_break_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5504L)
    public static SubLSymbol $html_line_break_clear$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5563L)
    public static SubLSymbol $html_line_break$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5619L)
    public static SubLSymbol $html_paragraph_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5675L)
    public static SubLSymbol $html_paragraph_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5731L)
    public static SubLSymbol $html_plaintext_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5795L)
    public static SubLSymbol $html_plaintext_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5859L)
    public static SubLSymbol $html_preformatted_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5917L)
    public static SubLSymbol $html_preformatted_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 5975L)
    public static SubLSymbol $html_address_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6113L)
    public static SubLSymbol $html_address_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6176L)
    public static SubLSymbol $html_big_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6235L)
    public static SubLSymbol $html_big_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6294L)
    public static SubLSymbol $html_bold_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6351L)
    public static SubLSymbol $html_bold_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6408L)
    public static SubLSymbol $html_cite_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6468L)
    public static SubLSymbol $html_cite_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6528L)
    public static SubLSymbol $html_code_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6588L)
    public static SubLSymbol $html_code_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6648L)
    public static SubLSymbol $html_definition_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6707L)
    public static SubLSymbol $html_definition_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6766L)
    public static SubLSymbol $html_emphasized_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6824L)
    public static SubLSymbol $html_emphasized_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6882L)
    public static SubLSymbol $html_font_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 6969L)
    public static SubLSymbol $html_font_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7029L)
    public static SubLSymbol $html_font_size$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7088L)
    public static SubLSymbol $html_font_color$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7148L)
    public static SubLSymbol $html_font_face$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7207L)
    public static SubLSymbol $html_italic_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7264L)
    public static SubLSymbol $html_italic_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7321L)
    public static SubLSymbol $html_keyboard_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7380L)
    public static SubLSymbol $html_keyboard_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7439L)
    public static SubLSymbol $html_sample_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7531L)
    public static SubLSymbol $html_sample_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7591L)
    public static SubLSymbol $html_small_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7652L)
    public static SubLSymbol $html_small_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7713L)
    public static SubLSymbol $html_strikethrough_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7775L)
    public static SubLSymbol $html_strikethrough_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7837L)
    public static SubLSymbol $html_strong_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7899L)
    public static SubLSymbol $html_strong_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 7961L)
    public static SubLSymbol $html_subscript_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8020L)
    public static SubLSymbol $html_subscript_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8079L)
    public static SubLSymbol $html_superscript_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8138L)
    public static SubLSymbol $html_superscript_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8197L)
    public static SubLSymbol $html_teletype_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8255L)
    public static SubLSymbol $html_teletype_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8313L)
    public static SubLSymbol $html_underlined_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8370L)
    public static SubLSymbol $html_underlined_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8427L)
    public static SubLSymbol $html_variable_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8486L)
    public static SubLSymbol $html_variable_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8545L)
    public static SubLSymbol $html_label_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8605L)
    public static SubLSymbol $html_label_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8666L)
    public static SubLSymbol $html_label_access_key$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8730L)
    public static SubLSymbol $html_label_for$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8788L)
    public static SubLSymbol $html_style_font_size_smaller$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8866L)
    public static SubLSymbol $html_style_font_size_larger$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 8941L)
    public static SubLSymbol $html_definition_list_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9086L)
    public static SubLSymbol $html_definition_list_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9146L)
    public static SubLSymbol $html_definition_list_term_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9211L)
    public static SubLSymbol $html_definition_list_term_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9276L)
    public static SubLSymbol $html_definition_list_def_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9340L)
    public static SubLSymbol $html_definition_list_def_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9404L)
    public static SubLSymbol $html_directory_list_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9472L)
    public static SubLSymbol $html_directory_list_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9532L)
    public static SubLSymbol $html_menu_list_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9587L)
    public static SubLSymbol $html_menu_list_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9643L)
    public static SubLSymbol $html_ordered_list_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9699L)
    public static SubLSymbol $html_ordered_list_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9756L)
    public static SubLSymbol $html_unordered_list_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9814L)
    public static SubLSymbol $html_unordered_list_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9873L)
    public static SubLSymbol $html_list_compact$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 9949L)
    public static SubLSymbol $html_list_continue$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10006L)
    public static SubLSymbol $html_list_dingbat$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10063L)
    public static SubLSymbol $html_list_plain$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10117L)
    public static SubLSymbol $html_list_seqnum$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10173L)
    public static SubLSymbol $html_list_src$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10226L)
    public static SubLSymbol $html_list_start$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10281L)
    public static SubLSymbol $html_list_type$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10335L)
    public static SubLSymbol $html_valid_list_types$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10406L)
    public static SubLSymbol $html_list_item_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10473L)
    public static SubLSymbol $html_list_item_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10527L)
    public static SubLSymbol $html_list_item_dingbat$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10613L)
    public static SubLSymbol $html_list_item_skip$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10671L)
    public static SubLSymbol $html_list_item_src$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10728L)
    public static SubLSymbol $html_list_item_id$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10784L)
    public static SubLSymbol $html_list_item_type$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 10842L)
    public static SubLSymbol $html_summary_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11001L)
    public static SubLSymbol $html_summary_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11058L)
    public static SubLSymbol $html_details_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11125L)
    public static SubLSymbol $html_details_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11182L)
    public static SubLSymbol $html_form_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11302L)
    public static SubLSymbol $html_form_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11356L)
    public static SubLSymbol $html_form_action$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11411L)
    public static SubLSymbol $html_form_method$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11466L)
    public static SubLSymbol $html_form_target$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11521L)
    public static SubLSymbol $html_form_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11574L)
    public static SubLSymbol $html_form_enctype$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11630L)
    public static SubLSymbol $html_form_method_get$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11713L)
    public static SubLSymbol $html_form_method_post$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11768L)
    public static SubLSymbol $html_blank_target$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11899L)
    public static SubLSymbol $html_self_target$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 11952L)
    public static SubLSymbol $html_parent_target$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12007L)
    public static SubLSymbol $html_top_target$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12059L)
    public static SubLSymbol $html_input_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12116L)
    public static SubLSymbol $html_input_checked$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12174L)
    public static SubLSymbol $html_input_readonly$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12233L)
    public static SubLSymbol $html_input_disabled$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12292L)
    public static SubLSymbol $html_input_disabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12469L)
    public static SubLSymbol $html_input_maxlength$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12530L)
    public static SubLSymbol $html_input_align$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12587L)
    public static SubLSymbol $html_input_border$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12645L)
    public static SubLSymbol $html_input_min$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12700L)
    public static SubLSymbol $html_input_max$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12755L)
    public static SubLSymbol $html_input_step$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12811L)
    public static SubLSymbol $html_input_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12867L)
    public static SubLSymbol $html_input_size$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12923L)
    public static SubLSymbol $html_input_src$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 12978L)
    public static SubLSymbol $html_input_type$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13034L)
    public static SubLSymbol $html_input_style$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13091L)
    public static SubLSymbol $html_input_value$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13148L)
    public static SubLSymbol $html_input_alt$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13201L)
    public static SubLSymbol $html_input_checkbox$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13274L)
    public static SubLSymbol $html_input_button$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13350L)
    public static SubLSymbol $html_input_hidden$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13433L)
    public static SubLSymbol $html_input_image$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13487L)
    public static SubLSymbol $html_input_password$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13544L)
    public static SubLSymbol $html_input_radio$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13598L)
    public static SubLSymbol $html_input_range$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13652L)
    public static SubLSymbol $html_input_reset$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13706L)
    public static SubLSymbol $html_input_submit$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13786L)
    public static SubLSymbol $html_input_text$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13839L)
    public static SubLSymbol $html_select_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13908L)
    public static SubLSymbol $html_select_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 13967L)
    public static SubLSymbol $html_select_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14023L)
    public static SubLSymbol $html_select_size$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14079L)
    public static SubLSymbol $html_select_multiple$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14138L)
    public static SubLSymbol $html_select_onchange$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14198L)
    public static SubLSymbol $html_option_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14256L)
    public static SubLSymbol $html_option_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14306L)
    public static SubLSymbol $html_option_value$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14363L)
    public static SubLSymbol $html_option_selected$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14422L)
    public static SubLSymbol $html_optgroup_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14482L)
    public static SubLSymbol $html_optgroup_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14543L)
    public static SubLSymbol $html_optgroup_label$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14600L)
    public static SubLSymbol $html_select_src$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14686L)
    public static SubLSymbol $html_select_width$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14743L)
    public static SubLSymbol $html_select_height$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14801L)
    public static SubLSymbol $html_select_units$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14858L)
    public static SubLSymbol $html_option_shape$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14916L)
    public static SubLSymbol $html_textarea_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 14989L)
    public static SubLSymbol $html_textarea_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15049L)
    public static SubLSymbol $html_textarea_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15104L)
    public static SubLSymbol $html_textarea_rows$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15159L)
    public static SubLSymbol $html_textarea_cols$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15214L)
    public static SubLSymbol $html_textarea_id$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15267L)
    public static SubLSymbol $html_textarea_style$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15323L)
    public static SubLSymbol $html_caption_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15456L)
    public static SubLSymbol $html_caption_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15521L)
    public static SubLSymbol $html_caption_align$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15583L)
    public static SubLSymbol $html_table_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15643L)
    public static SubLSymbol $html_table_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15704L)
    public static SubLSymbol $html_table_noflow$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15764L)
    public static SubLSymbol $html_table_nowrap$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15824L)
    public static SubLSymbol $html_table_wrap$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15883L)
    public static SubLSymbol $html_table_align$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 15943L)
    public static SubLSymbol $html_table_border$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16004L)
    public static SubLSymbol $html_table_bordercolor$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16070L)
    public static SubLSymbol $html_table_cellpadding$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16136L)
    public static SubLSymbol $html_table_cellspacing$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16202L)
    public static SubLSymbol $html_table_colspec$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16264L)
    public static SubLSymbol $html_table_units$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16324L)
    public static SubLSymbol $html_table_bgcolor$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16386L)
    public static SubLSymbol $html_table_width$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16446L)
    public static SubLSymbol $html_table_background$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16511L)
    public static SubLSymbol $html_table_thead_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16633L)
    public static SubLSymbol $html_table_thead_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16693L)
    public static SubLSymbol $html_table_tfoot_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16751L)
    public static SubLSymbol $html_table_tfoot_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16811L)
    public static SubLSymbol $html_table_tbody_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16869L)
    public static SubLSymbol $html_table_tbody_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 16929L)
    public static SubLSymbol $html_table_data_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17005L)
    public static SubLSymbol $html_table_data_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17062L)
    public static SubLSymbol $html_table_header_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17118L)
    public static SubLSymbol $html_table_header_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17175L)
    public static SubLSymbol $html_table_row_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17231L)
    public static SubLSymbol $html_table_row_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17288L)
    public static SubLSymbol $html_table_row_bgcolor$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17349L)
    public static SubLSymbol $html_table_row_height$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17409L)
    public static SubLSymbol $html_table_row_title$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17468L)
    public static SubLSymbol $html_table_row_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17526L)
    public static SubLSymbol $html_table_data_nowrap$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17612L)
    public static SubLSymbol $html_table_data_align$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17672L)
    public static SubLSymbol $html_table_data_colspan$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17734L)
    public static SubLSymbol $html_table_data_rowspan$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17796L)
    public static SubLSymbol $html_table_data_valign$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17857L)
    public static SubLSymbol $html_table_data_bgcolor$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17919L)
    public static SubLSymbol $html_table_data_width$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 17979L)
    public static SubLSymbol $html_table_data_height$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18040L)
    public static SubLSymbol $html_atomic_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18147L)
    public static SubLSymbol $html_protocol_mailto$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18205L)
    public static SubLSymbol $html_protocol_file$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18260L)
    public static SubLSymbol $html_protocol_ftp$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18314L)
    public static SubLSymbol $html_anchor_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18365L)
    public static SubLSymbol $html_anchor_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18417L)
    public static SubLSymbol $html_anchor_href$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18471L)
    public static SubLSymbol $html_anchor_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18525L)
    public static SubLSymbol $html_anchor_id$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18577L)
    public static SubLSymbol $html_anchor_title$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18632L)
    public static SubLSymbol $html_anchor_target$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18688L)
    public static SubLSymbol $html_anchor_style$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18743L)
    public static SubLSymbol $html_anchor_onmouseover$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18810L)
    public static SubLSymbol $html_anchor_onmouseout$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18876L)
    public static SubLSymbol $html_anchor_onmouseup$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 18941L)
    public static SubLSymbol $html_anchor_onmousedown$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19008L)
    public static SubLSymbol $html_area_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19061L)
    public static SubLSymbol $html_area_nohref$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19115L)
    public static SubLSymbol $html_area_alt$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19167L)
    public static SubLSymbol $html_area_co_ords$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19223L)
    public static SubLSymbol $html_area_href$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19276L)
    public static SubLSymbol $html_area_shape$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19330L)
    public static SubLSymbol $html_area_target$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19413L)
    public static SubLSymbol $html_basefont_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19511L)
    public static SubLSymbol $html_basefont_size$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19566L)
    public static SubLSymbol $html_basefont_color$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19622L)
    public static SubLSymbol $html_blink_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19675L)
    public static SubLSymbol $html_blink_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19728L)
    public static SubLSymbol $html_comment_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19780L)
    public static SubLSymbol $html_comment_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19830L)
    public static SubLSymbol $html_frame_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19923L)
    public static SubLSymbol $html_frame_frameborder$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 19989L)
    public static SubLSymbol $html_frame_noresize$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20051L)
    public static SubLSymbol $html_frame_marginheight$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20118L)
    public static SubLSymbol $html_frame_marginwidth$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20184L)
    public static SubLSymbol $html_frame_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20243L)
    public static SubLSymbol $html_frame_scrolling$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20307L)
    public static SubLSymbol $html_frame_src$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20365L)
    public static SubLSymbol $html_frameset_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20430L)
    public static SubLSymbol $html_frameset_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20496L)
    public static SubLSymbol $html_frameset_cols$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20557L)
    public static SubLSymbol $html_frameset_rows$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20618L)
    public static SubLSymbol $html_frameset_frameborder$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20686L)
    public static SubLSymbol $html_iframe_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20748L)
    public static SubLSymbol $html_iframe_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20811L)
    public static SubLSymbol $html_iframe_align$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20872L)
    public static SubLSymbol $html_iframe_frameborder$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 20939L)
    public static SubLSymbol $html_iframe_height$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21001L)
    public static SubLSymbol $html_iframe_marginheight$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21069L)
    public static SubLSymbol $html_iframe_marginwidth$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21136L)
    public static SubLSymbol $html_iframe_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21196L)
    public static SubLSymbol $html_iframe_scrolling$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21261L)
    public static SubLSymbol $html_iframe_src$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21320L)
    public static SubLSymbol $html_iframe_width$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21381L)
    public static SubLSymbol $html_image_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21458L)
    public static SubLSymbol $html_image_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21517L)
    public static SubLSymbol $html_image_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21576L)
    public static SubLSymbol $html_image_ismap$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21635L)
    public static SubLSymbol $html_image_height$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21696L)
    public static SubLSymbol $html_image_width$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21756L)
    public static SubLSymbol $html_image_alt$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21814L)
    public static SubLSymbol $html_image_align$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21874L)
    public static SubLSymbol $html_image_border$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21935L)
    public static SubLSymbol $html_image_src$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 21993L)
    public static SubLSymbol $html_image_style$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22053L)
    public static SubLSymbol $html_applet_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22115L)
    public static SubLSymbol $html_applet_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22178L)
    public static SubLSymbol $html_applet_code$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22238L)
    public static SubLSymbol $html_applet_codebase$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22302L)
    public static SubLSymbol $html_applet_archive$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22365L)
    public static SubLSymbol $html_applet_alt$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22425L)
    public static SubLSymbol $html_applet_align$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22485L)
    public static SubLSymbol $html_applet_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22545L)
    public static SubLSymbol $html_applet_id$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22603L)
    public static SubLSymbol $html_applet_height$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22665L)
    public static SubLSymbol $html_applet_width$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22726L)
    public static SubLSymbol $html_param_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22787L)
    public static SubLSymbol $html_param_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22847L)
    public static SubLSymbol $html_param_value$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22907L)
    public static SubLSymbol $html_map_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 22999L)
    public static SubLSymbol $html_map_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23048L)
    public static SubLSymbol $html_map_name$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23097L)
    public static SubLSymbol $html_no_break_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23183L)
    public static SubLSymbol $html_no_break_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23239L)
    public static SubLSymbol $html_no_frames_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23299L)
    public static SubLSymbol $html_no_frames_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23359L)
    public static SubLSymbol $html_object_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23418L)
    public static SubLSymbol $html_object_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23477L)
    public static SubLSymbol $html_object_classid$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23536L)
    public static SubLSymbol $html_object_codebase$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23596L)
    public static SubLSymbol $html_object_codetype$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23656L)
    public static SubLSymbol $html_object_data$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23712L)
    public static SubLSymbol $html_object_type$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23768L)
    public static SubLSymbol $html_object_archive$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23827L)
    public static SubLSymbol $html_object_id$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23881L)
    public static SubLSymbol $html_object_class$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23938L)
    public static SubLSymbol $html_object_align$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 23995L)
    public static SubLSymbol $html_object_width$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24052L)
    public static SubLSymbol $html_object_height$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24110L)
    public static SubLSymbol $html_object_border$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24168L)
    public static SubLSymbol $html_object_hspace$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24226L)
    public static SubLSymbol $html_object_vspace$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24284L)
    public static SubLSymbol $html_script_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24344L)
    public static SubLSymbol $html_script_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24405L)
    public static SubLSymbol $html_script_language$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24467L)
    public static SubLSymbol $html_script_src$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24524L)
    public static SubLSymbol $html_script_type$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24582L)
    public static SubLSymbol $html_script_javascript$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24644L)
    public static SubLSymbol $html_noscript_head$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24708L)
    public static SubLSymbol $html_noscript_tail$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24773L)
    public static SubLSymbol $html_word_break$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 24824L)
    public static SubLSymbol $html_color_white$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 25419L)
    public static SubLSymbol $html_color_black$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 25478L)
    public static SubLSymbol $html_color_dark_grey$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 25547L)
    public static SubLSymbol $html_color_light_grey$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 25618L)
    public static SubLSymbol $html_color_lighter_grey$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 25677L)
    public static SubLSymbol $html_color_lightest_grey$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 25736L)
    public static SubLSymbol $html_color_yellowish_gray$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 25795L)
    public static SubLSymbol $html_color_sat_red$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 25906L)
    public static SubLSymbol $html_color_dark_red$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 25965L)
    public static SubLSymbol $html_color_medium_red$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26024L)
    public static SubLSymbol $html_color_medium_dark_red$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26084L)
    public static SubLSymbol $html_color_light_red$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26143L)
    public static SubLSymbol $html_color_lighter_red$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26202L)
    public static SubLSymbol $html_color_sat_green$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26272L)
    public static SubLSymbol $html_color_dark_green$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26331L)
    public static SubLSymbol $html_color_darker_green$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26390L)
    public static SubLSymbol $html_color_light_green$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26449L)
    public static SubLSymbol $html_color_lighter_green$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26508L)
    public static SubLSymbol $html_color_sat_blue$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26577L)
    public static SubLSymbol $html_color_dark_blue$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26636L)
    public static SubLSymbol $html_color_light_blue$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26707L)
    public static SubLSymbol $html_color_lighter_blue$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26766L)
    public static SubLSymbol $html_color_sat_yellow$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26837L)
    public static SubLSymbol $html_color_dark_yellow$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26896L)
    public static SubLSymbol $html_color_light_yellow$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 26955L)
    public static SubLSymbol $html_color_lighter_yellow$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27014L)
    public static SubLSymbol $html_color_darker_purple$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27085L)
    public static SubLSymbol $html_color_dark_purple$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27144L)
    public static SubLSymbol $html_color_light_purple$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27203L)
    public static SubLSymbol $html_color_lighter_purple$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27262L)
    public static SubLSymbol $html_color_cyan$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27331L)
    public static SubLSymbol $html_color_light_cyan$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27389L)
    public static SubLSymbol $html_color_cyc_logo_violet$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27476L)
    public static SubLSymbol $html_color_cyc_logo_light_violet$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27543L)
    public static SubLSymbol $html_color_cyc_logo_lighter_violet$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27610L)
    public static SubLSymbol $html_color_cyc_logo_light_blue$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27709L)
    public static SubLSymbol $html_color_cyc_logo_lighter_blue$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 27774L)
    public static SubLSymbol $html_color_map$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 29151L)
    public static SubLSymbol $html_alternating_class1$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 29229L)
    public static SubLSymbol $html_alternating_class2$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 29303L)
    public static SubLSymbol $html_known_dom_events$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 31585L)
    public static SubLSymbol $basic_skin_class$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 31695L)
    public static SubLSymbol $html_escapes_map$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 32234L)
    public static SubLSymbol $html_prin1_string_escapes_map$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 32437L)
    public static SubLSymbol $html_escapes_map_for_showing_newlines$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 32789L)
    public static SubLSymbol $html_safe_print$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 32950L)
    public static SubLSymbol $html_preserve_breaks$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 35200L)
    public static SubLSymbol $html_inside_bodyP$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 50902L)
    public static SubLSymbol $within_html_pre$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 50950L)
    public static SubLSymbol $suppress_html_source_readability_terpriP$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70146L)
    public static SubLSymbol $html_id_space_id_generator$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70789L)
    public static SubLSymbol $html_form_field_uniquifier_code$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 72063L)
    private static SubLSymbol $html_form_field_uniquifier_isg$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 73083L)
    public static SubLSymbol $within_html_form$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 98131L)
    public static SubLSymbol $html_indent_table_max$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 130984L)
    public static SubLSymbol $html_handler_property$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 131160L)
    public static SubLSymbol $xml_handler_property$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 131259L)
    public static SubLSymbol $json_handler_property$;
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 132056L)
    private static SubLSymbol $handler_mime_types$;
    private static final SubLSymbol $sym0$_HTML_DEFAULT_BGCOLOR_;
    private static final SubLString $str1$_body;
    private static final SubLString $str2$__body_;
    private static final SubLString $str3$_bgcolor_;
    private static final SubLString $str4$_background_;
    private static final SubLString $str5$_class_;
    private static final SubLString $str6$_style_;
    private static final SubLString $str7$_text_;
    private static final SubLString $str8$_link_;
    private static final SubLString $str9$_alink_;
    private static final SubLString $str10$_vlink_;
    private static final SubLString $str11$_onLoad_;
    private static final SubLString $str12$_onResize_;
    private static final SubLString $str13$_div;
    private static final SubLString $str14$__div_;
    private static final SubLString $str15$_title_;
    private static final SubLString $str16$_align_;
    private static final SubLString $str17$_span;
    private static final SubLString $str18$__span_;
    private static final SubLString $str19$_head_;
    private static final SubLString $str20$__head_;
    private static final SubLString $str21$_html_;
    private static final SubLString $str22$__html_;
    private static final SubLString $str23$_id_;
    private static final SubLString $str24$_onclick_;
    private static final SubLString $str25$_onblur_;
    private static final SubLString $str26$_onfocus_;
    private static final SubLString $str27$_onkeyup_;
    private static final SubLString $str28$_onkeydown_;
    private static final SubLString $str29$_onkeypress_;
    private static final SubLString $str30$_meta;
    private static final SubLString $str31$_http_equiv_;
    private static final SubLString $str32$_content_;
    private static final SubLString $str33$_scheme_;
    private static final SubLString $str34$_name_;
    private static final SubLString $str35$_lang_;
    private static final SubLString $str36$_dir_;
    private static final SubLString $str37$_title_;
    private static final SubLString $str38$__title_;
    private static final SubLString $str39$_link;
    private static final SubLString $str40$_rel_;
    private static final SubLString $str41$_type_;
    private static final SubLString $str42$_href_;
    private static final SubLString $str43$_media_;
    private static final SubLString $str44$_base;
    private static final SubLString $str45$_style_;
    private static final SubLString $str46$__style_;
    private static final SubLString $str47$_blockquote_;
    private static final SubLString $str48$__blockquote_;
    private static final SubLString $str49$_center_;
    private static final SubLString $str50$__center_;
    private static final SubLString $str51$_h;
    private static final SubLString $str52$__h;
    private static final SubLString $str53$_hr;
    private static final SubLString $str54$_size_;
    private static final SubLString $str55$_width_;
    private static final SubLString $str56$_br___;
    private static final SubLString $str57$_br;
    private static final SubLString $str58$__br_;
    private static final SubLString $str59$_clear_;
    private static final SubLString $str60$_br_;
    private static final SubLString $str61$_p_;
    private static final SubLString $str62$__p_;
    private static final SubLString $str63$_plaintext_;
    private static final SubLString $str64$__plaintext_;
    private static final SubLString $str65$_pre_;
    private static final SubLString $str66$__pre_;
    private static final SubLString $str67$_address_;
    private static final SubLString $str68$__address_;
    private static final SubLString $str69$_big_;
    private static final SubLString $str70$__big_;
    private static final SubLString $str71$_b_;
    private static final SubLString $str72$__b_;
    private static final SubLString $str73$_cite_;
    private static final SubLString $str74$__cite_;
    private static final SubLString $str75$_code_;
    private static final SubLString $str76$__code_;
    private static final SubLString $str77$_dfn_;
    private static final SubLString $str78$__dfn_;
    private static final SubLString $str79$_em_;
    private static final SubLString $str80$__em_;
    private static final SubLString $str81$_font;
    private static final SubLString $str82$__font_;
    private static final SubLString $str83$_color_;
    private static final SubLString $str84$_face_;
    private static final SubLString $str85$_i_;
    private static final SubLString $str86$__i_;
    private static final SubLString $str87$_kbd_;
    private static final SubLString $str88$__kbd_;
    private static final SubLString $str89$_samp_;
    private static final SubLString $str90$__samp_;
    private static final SubLString $str91$_small_;
    private static final SubLString $str92$__small_;
    private static final SubLString $str93$_strike_;
    private static final SubLString $str94$__strike_;
    private static final SubLString $str95$_strong_;
    private static final SubLString $str96$__strong_;
    private static final SubLString $str97$_sub_;
    private static final SubLString $str98$__sub_;
    private static final SubLString $str99$_sup_;
    private static final SubLString $str100$__sup_;
    private static final SubLString $str101$_tt_;
    private static final SubLString $str102$__tt_;
    private static final SubLString $str103$_u_;
    private static final SubLString $str104$__u_;
    private static final SubLString $str105$_var_;
    private static final SubLString $str106$__var_;
    private static final SubLString $str107$_label;
    private static final SubLString $str108$__label_;
    private static final SubLString $str109$_accesskey_;
    private static final SubLString $str110$_for_;
    private static final SubLString $str111$font_size__smaller;
    private static final SubLString $str112$font_size__larger;
    private static final SubLString $str113$_dl;
    private static final SubLString $str114$__dl_;
    private static final SubLString $str115$_dt_;
    private static final SubLString $str116$__dt_;
    private static final SubLString $str117$_dd_;
    private static final SubLString $str118$__dd_;
    private static final SubLString $str119$_dir;
    private static final SubLString $str120$__dir_;
    private static final SubLString $str121$_menu;
    private static final SubLString $str122$__menu_;
    private static final SubLString $str123$_ol;
    private static final SubLString $str124$__ol_;
    private static final SubLString $str125$_ul;
    private static final SubLString $str126$__ul_;
    private static final SubLString $str127$_compact;
    private static final SubLString $str128$_continue;
    private static final SubLString $str129$_dingbat_;
    private static final SubLString $str130$_plain;
    private static final SubLString $str131$_seqnum_;
    private static final SubLString $str132$_src_;
    private static final SubLString $str133$_start_;
    private static final SubLList $list134;
    private static final SubLString $str135$_li;
    private static final SubLString $str136$__li_;
    private static final SubLString $str137$_skip_;
    private static final SubLString $str138$_summary;
    private static final SubLString $str139$__summary_;
    private static final SubLString $str140$_details;
    private static final SubLString $str141$__details_;
    private static final SubLString $str142$_form;
    private static final SubLString $str143$__form_;
    private static final SubLString $str144$_action_;
    private static final SubLString $str145$_method_;
    private static final SubLString $str146$_target_;
    private static final SubLString $str147$_enctype_;
    private static final SubLString $str148$get;
    private static final SubLString $str149$post;
    private static final SubLString $str150$_blank;
    private static final SubLString $str151$_self;
    private static final SubLString $str152$_parent;
    private static final SubLString $str153$_top;
    private static final SubLString $str154$_input;
    private static final SubLString $str155$_checked;
    private static final SubLString $str156$_readonly;
    private static final SubLString $str157$_disabled;
    private static final SubLString $str158$_maxlength_;
    private static final SubLString $str159$_border_;
    private static final SubLString $str160$_min_;
    private static final SubLString $str161$_max_;
    private static final SubLString $str162$_step_;
    private static final SubLString $str163$_value_;
    private static final SubLString $str164$_alt_;
    private static final SubLString $str165$checkbox;
    private static final SubLString $str166$button;
    private static final SubLString $str167$hidden;
    private static final SubLString $str168$image;
    private static final SubLString $str169$password;
    private static final SubLString $str170$radio;
    private static final SubLString $str171$range;
    private static final SubLString $str172$reset;
    private static final SubLString $str173$submit;
    private static final SubLString $str174$text;
    private static final SubLString $str175$_select;
    private static final SubLString $str176$__select_;
    private static final SubLString $str177$_multiple;
    private static final SubLString $str178$_onChange_;
    private static final SubLString $str179$_option;
    private static final SubLString $str180$;
    private static final SubLString $str181$_selected;
    private static final SubLString $str182$_optgroup;
    private static final SubLString $str183$__optgroup_;
    private static final SubLString $str184$_label_;
    private static final SubLString $str185$_height_;
    private static final SubLString $str186$_units_;
    private static final SubLString $str187$_shape_;
    private static final SubLString $str188$_textarea;
    private static final SubLString $str189$__textarea_;
    private static final SubLString $str190$_rows_;
    private static final SubLString $str191$_cols_;
    private static final SubLString $str192$_caption;
    private static final SubLString $str193$__caption_;
    private static final SubLString $str194$_table;
    private static final SubLString $str195$__table_;
    private static final SubLString $str196$_noflow;
    private static final SubLString $str197$_nowrap;
    private static final SubLString $str198$_wrap_;
    private static final SubLString $str199$_bordercolor_;
    private static final SubLString $str200$_cellpadding_;
    private static final SubLString $str201$_cellspacing_;
    private static final SubLString $str202$_colspec_;
    private static final SubLString $str203$_thead;
    private static final SubLString $str204$__thead_;
    private static final SubLString $str205$_tfoot;
    private static final SubLString $str206$__tfoot_;
    private static final SubLString $str207$_tbody;
    private static final SubLString $str208$__tbody_;
    private static final SubLString $str209$_td;
    private static final SubLString $str210$__td_;
    private static final SubLString $str211$_th;
    private static final SubLString $str212$__th_;
    private static final SubLString $str213$_tr;
    private static final SubLString $str214$__tr_;
    private static final SubLString $str215$_colspan_;
    private static final SubLString $str216$_rowspan_;
    private static final SubLString $str217$_valign_;
    private static final SubLString $str218$__;
    private static final SubLString $str219$mailto_;
    private static final SubLString $str220$file_;
    private static final SubLString $str221$ftp_;
    private static final SubLString $str222$_a;
    private static final SubLString $str223$__a_;
    private static final SubLString $str224$_onmouseover_;
    private static final SubLString $str225$_onmouseout_;
    private static final SubLString $str226$_onmouseup_;
    private static final SubLString $str227$_onmousedown_;
    private static final SubLString $str228$_area;
    private static final SubLString $str229$_nohref;
    private static final SubLString $str230$_co_ords_;
    private static final SubLString $str231$_basefont;
    private static final SubLString $str232$_blink_;
    private static final SubLString $str233$__blink_;
    private static final SubLString $str234$____;
    private static final SubLString $str235$___;
    private static final SubLString $str236$_frame;
    private static final SubLString $str237$_frameborder_;
    private static final SubLString $str238$_noresize;
    private static final SubLString $str239$_marginheight_;
    private static final SubLString $str240$_marginwidth_;
    private static final SubLString $str241$_scrolling_;
    private static final SubLString $str242$_frameset;
    private static final SubLString $str243$__frameset_;
    private static final SubLString $str244$_iframe;
    private static final SubLString $str245$__iframe_;
    private static final SubLString $str246$_img;
    private static final SubLString $str247$__img_;
    private static final SubLString $str248$_ismap;
    private static final SubLString $str249$_applet_;
    private static final SubLString $str250$__applet_;
    private static final SubLString $str251$_code_;
    private static final SubLString $str252$_codebase_;
    private static final SubLString $str253$_archive_;
    private static final SubLString $str254$_param_;
    private static final SubLString $str255$_map;
    private static final SubLString $str256$__map_;
    private static final SubLString $str257$_nobr_;
    private static final SubLString $str258$__nobr_;
    private static final SubLString $str259$_noframes_;
    private static final SubLString $str260$__noframes_;
    private static final SubLString $str261$_object_;
    private static final SubLString $str262$__object_;
    private static final SubLString $str263$_classid_;
    private static final SubLString $str264$_codetype_;
    private static final SubLString $str265$_data_;
    private static final SubLString $str266$_hspace_;
    private static final SubLString $str267$_vspace_;
    private static final SubLString $str268$_script;
    private static final SubLString $str269$__script_;
    private static final SubLString $str270$_language_;
    private static final SubLString $str271$JavaScript;
    private static final SubLString $str272$_noscript;
    private static final SubLString $str273$__noscript_;
    private static final SubLString $str274$_wbr_;
    private static final SubLString $str275$_ffffff;
    private static final SubLString $str276$_000000;
    private static final SubLString $str277$_999999;
    private static final SubLString $str278$_cccccc;
    private static final SubLString $str279$_dddddd;
    private static final SubLString $str280$_eeeeee;
    private static final SubLString $str281$_eeeee4;
    private static final SubLString $str282$_ff0000;
    private static final SubLString $str283$_996666;
    private static final SubLString $str284$_ff8888;
    private static final SubLString $str285$_cc0000;
    private static final SubLString $str286$_eeaaaa;
    private static final SubLString $str287$_ffbbbb;
    private static final SubLString $str288$_00ff00;
    private static final SubLString $str289$_669966;
    private static final SubLString $str290$_335533;
    private static final SubLString $str291$_aaeeaa;
    private static final SubLString $str292$_bbffbb;
    private static final SubLString $str293$_0000ff;
    private static final SubLString $str294$_668899;
    private static final SubLString $str295$_aaccee;
    private static final SubLString $str296$_bbddff;
    private static final SubLString $str297$_ffff00;
    private static final SubLString $str298$_999966;
    private static final SubLString $str299$_eeeeaa;
    private static final SubLString $str300$_ffffbb;
    private static final SubLString $str301$_9900bb;
    private static final SubLString $str302$_996699;
    private static final SubLString $str303$_ddbbff;
    private static final SubLString $str304$_eeccff;
    private static final SubLString $str305$_00ffff;
    private static final SubLString $str306$_e0ffff;
    private static final SubLString $str307$_9933cc;
    private static final SubLString $str308$_f0d3ff;
    private static final SubLString $str309$_f4e0ff;
    private static final SubLString $str310$_e0e5ff;
    private static final SubLString $str311$_e6f0ff;
    private static final SubLSymbol $kw312$BLACK;
    private static final SubLSymbol $kw313$BLUE;
    private static final SubLSymbol $kw314$GREEN;
    private static final SubLList $list315;
    private static final SubLSymbol $kw316$RED;
    private static final SubLList $list317;
    private static final SubLSymbol $kw318$YELLOW;
    private static final SubLSymbol $kw319$WHITE;
    private static final SubLSymbol $kw320$DARK_BLUE;
    private static final SubLList $list321;
    private static final SubLSymbol $kw322$LIGHTER_BLUE;
    private static final SubLSymbol $kw323$DARK_RED;
    private static final SubLList $list324;
    private static final SubLList $list325;
    private static final SubLSymbol $kw326$LIGHTER_RED;
    private static final SubLSymbol $kw327$DARK_YELLOW;
    private static final SubLList $list328;
    private static final SubLSymbol $kw329$LIGHTER_YELLOW;
    private static final SubLSymbol $kw330$DARK_GRAY;
    private static final SubLList $list331;
    private static final SubLSymbol $kw332$LIGHT_GREY;
    private static final SubLSymbol $kw333$LIGHTER_GRAY;
    private static final SubLSymbol $kw334$LIGHTEST_GREY;
    private static final SubLSymbol $kw335$DARK_PURPLE;
    private static final SubLSymbol $kw336$LIGHT_PURPLE;
    private static final SubLSymbol $kw337$LIGHTER_PURPLE;
    private static final SubLString $str338$cyc_alternate_class1;
    private static final SubLString $str339$cyc_alternate_class2;
    private static final SubLList $list340;
    private static final SubLString $str341$yui_skin_sam;
    private static final SubLList $list342;
    private static final SubLList $list343;
    private static final SubLList $list344;
    private static final SubLList $list345;
    private static final SubLSymbol $sym346$FORMAT;
    private static final SubLSymbol $sym347$_HTML_STREAM_;
    private static final SubLSymbol $sym348$HTML_STRONG;
    private static final SubLList $list349;
    private static final SubLSymbol $sym350$PROGN;
    private static final SubLSymbol $sym351$HTML_MARKUP;
    private static final SubLList $list352;
    private static final SubLList $list353;
    private static final SubLList $list354;
    private static final SubLList $list355;
    private static final SubLList $list356;
    private static final SubLSymbol $sym357$CLET;
    private static final SubLList $list358;
    private static final SubLList $list359;
    private static final SubLList $list360;
    private static final SubLSymbol $kw361$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw362$SHOW_COPYRIGHT;
    private static final SubLSymbol $kw363$BACKGROUND_IMAGE;
    private static final SubLSymbol $kw364$BACKGROUND_COLOR;
    private static final SubLSymbol $kw365$CLASS;
    private static final SubLSymbol $kw366$TEXT_COLOR;
    private static final SubLSymbol $kw367$LINK_COLOR;
    private static final SubLSymbol $kw368$ACTIVE_LINK_COLOR;
    private static final SubLSymbol $kw369$VISITED_LINK_COLOR;
    private static final SubLSymbol $kw370$SCRIPT;
    private static final SubLSymbol $kw371$ONLOAD;
    private static final SubLSymbol $kw372$ONRESIZE;
    private static final SubLSymbol $kw373$STYLE;
    private static final SubLSymbol $sym374$HTML_QUOTED_ATTRIBUTE;
    private static final SubLList $list375;
    private static final SubLList $list376;
    private static final SubLList $list377;
    private static final SubLSymbol $sym378$ATOM;
    private static final SubLSymbol $sym379$PWHEN;
    private static final SubLList $list380;
    private static final SubLSymbol $sym381$HTML_COLOR;
    private static final SubLList $list382;
    private static final SubLList $list383;
    private static final SubLList $list384;
    private static final SubLList $list385;
    private static final SubLList $list386;
    private static final SubLList $list387;
    private static final SubLList $list388;
    private static final SubLList $list389;
    private static final SubLSymbol $sym390$HTML_MARKUP_WRAPPER;
    private static final SubLList $list391;
    private static final SubLSymbol $sym392$HTML_MARKUP_BODY;
    private static final SubLList $list393;
    private static final SubLList $list394;
    private static final SubLList $list395;
    private static final SubLList $list396;
    private static final SubLSymbol $sym397$COLOR_VALUE;
    private static final SubLSymbol $sym398$HTML_FANCY_BODY;
    private static final SubLSymbol $sym399$HTML_COLORED_BODY;
    private static final SubLList $list400;
    private static final SubLList $list401;
    private static final SubLList $list402;
    private static final SubLSymbol $sym403$HTML_HEAD_CONTENT_TYPE;
    private static final SubLSymbol $sym404$HTML_HEAD;
    private static final SubLList $list405;
    private static final SubLList $list406;
    private static final SubLSymbol $sym407$WITH_POSSIBLY_NEW_HTML_FILE_DEPENDENCY_SPACE;
    private static final SubLList $list408;
    private static final SubLList $list409;
    private static final SubLList $list410;
    private static final SubLSymbol $kw411$ID;
    private static final SubLSymbol $kw412$ALIGN;
    private static final SubLSymbol $kw413$TITLE;
    private static final SubLSymbol $kw414$MISC;
    private static final SubLList $list415;
    private static final SubLList $list416;
    private static final SubLList $list417;
    private static final SubLList $list418;
    private static final SubLList $list419;
    private static final SubLList $list420;
    private static final SubLSymbol $sym421$ATTRIBUTE;
    private static final SubLSymbol $sym422$VALUE;
    private static final SubLSymbol $sym423$DO_ALIST;
    private static final SubLList $list424;
    private static final SubLSymbol $sym425$HTML_FANCY_SPAN;
    private static final SubLList $list426;
    private static final SubLList $list427;
    private static final SubLList $list428;
    private static final SubLList $list429;
    private static final SubLSymbol $kw430$ONCLICK;
    private static final SubLList $list431;
    private static final SubLList $list432;
    private static final SubLList $list433;
    private static final SubLList $list434;
    private static final SubLList $list435;
    private static final SubLList $list436;
    private static final SubLList $list437;
    private static final SubLSymbol $kw438$HTTP_EQUIV;
    private static final SubLSymbol $kw439$CONTENT;
    private static final SubLSymbol $kw440$NAME;
    private static final SubLSymbol $kw441$SCHEME;
    private static final SubLSymbol $kw442$LANG;
    private static final SubLSymbol $kw443$DIR;
    private static final SubLList $list444;
    private static final SubLList $list445;
    private static final SubLList $list446;
    private static final SubLList $list447;
    private static final SubLList $list448;
    private static final SubLList $list449;
    private static final SubLSymbol $sym450$HTML_META;
    private static final SubLList $list451;
    private static final SubLList $list452;
    private static final SubLList $list453;
    private static final SubLSymbol $kw454$REL;
    private static final SubLSymbol $kw455$TYPE;
    private static final SubLSymbol $kw456$HREF;
    private static final SubLSymbol $kw457$MEDIA;
    private static final SubLList $list458;
    private static final SubLList $list459;
    private static final SubLList $list460;
    private static final SubLList $list461;
    private static final SubLList $list462;
    private static final SubLSymbol $sym463$HTML_LINK;
    private static final SubLList $list464;
    private static final SubLList $list465;
    private static final SubLList $list466;
    private static final SubLList $list467;
    private static final SubLSymbol $sym468$HTML_BASE;
    private static final SubLString $str469$all;
    private static final SubLString $str470$stylesheet;
    private static final SubLString $str471$text_css;
    private static final SubLList $list472;
    private static final SubLList $list473;
    private static final SubLList $list474;
    private static final SubLSymbol $sym475$HTML_DOCUMENT;
    private static final SubLSymbol $sym476$HTML_TITLE;
    private static final SubLSymbol $sym477$HTML_PRINC;
    private static final SubLSymbol $sym478$HTML_HEADING;
    private static final SubLList $list479;
    private static final SubLList $list480;
    private static final SubLList $list481;
    private static final SubLSymbol $kw482$COMPLETION_;
    private static final SubLSymbol $kw483$COLOR;
    private static final SubLList $list484;
    private static final SubLList $list485;
    private static final SubLList $list486;
    private static final SubLList $list487;
    private static final SubLList $list488;
    private static final SubLList $list489;
    private static final SubLList $list490;
    private static final SubLList $list491;
    private static final SubLString $str492$HTML_UNPRE_used_when_not_within_H;
    private static final SubLString $str493$Nested_calls_to_HTML_PRE_will_con;
    private static final SubLList $list494;
    private static final SubLList $list495;
    private static final SubLList $list496;
    private static final SubLList $list497;
    private static final SubLList $list498;
    private static final SubLList $list499;
    private static final SubLList $list500;
    private static final SubLList $list501;
    private static final SubLList $list502;
    private static final SubLSymbol $sym503$HTML_BOLD;
    private static final SubLList $list504;
    private static final SubLList $list505;
    private static final SubLList $list506;
    private static final SubLList $list507;
    private static final SubLSymbol $sym508$HTML_EMPHASIZED;
    private static final SubLList $list509;
    private static final SubLList $list510;
    private static final SubLSymbol $kw511$SIZE;
    private static final SubLSymbol $kw512$FACE;
    private static final SubLList $list513;
    private static final SubLList $list514;
    private static final SubLList $list515;
    private static final SubLList $list516;
    private static final SubLList $list517;
    private static final SubLSymbol $sym518$SIZE_VAL;
    private static final SubLSymbol $sym519$HTML_FANCY_FONT;
    private static final SubLSymbol $sym520$COLOR_VAL;
    private static final SubLSymbol $sym521$HTML_STYLE_BACKGROUND_COLOR;
    private static final SubLList $list522;
    private static final SubLSymbol $sym523$HTML_ITALIC;
    private static final SubLList $list524;
    private static final SubLList $list525;
    private static final SubLList $list526;
    private static final SubLList $list527;
    private static final SubLList $list528;
    private static final SubLList $list529;
    private static final SubLList $list530;
    private static final SubLList $list531;
    private static final SubLSymbol $sym532$HTML_TELETYPE;
    private static final SubLList $list533;
    private static final SubLSymbol $sym534$HTML_UNDERLINED;
    private static final SubLList $list535;
    private static final SubLList $list536;
    private static final SubLList $list537;
    private static final SubLSymbol $kw538$ACCESS_KEY;
    private static final SubLSymbol $kw539$FOR;
    private static final SubLList $list540;
    private static final SubLList $list541;
    private static final SubLList $list542;
    private static final SubLList $list543;
    private static final SubLList $list544;
    private static final SubLList $list545;
    private static final SubLList $list546;
    private static final SubLList $list547;
    private static final SubLList $list548;
    private static final SubLList $list549;
    private static final SubLList $list550;
    private static final SubLSymbol $kw551$COMPACT;
    private static final SubLSymbol $kw552$CONTINUE;
    private static final SubLSymbol $kw553$START;
    private static final SubLSymbol $kw554$SEQNUM;
    private static final SubLList $list555;
    private static final SubLList $list556;
    private static final SubLList $list557;
    private static final SubLList $list558;
    private static final SubLList $list559;
    private static final SubLList $list560;
    private static final SubLSymbol $sym561$HTML_FANCY_ORDERED_LIST;
    private static final SubLSymbol $sym562$HTML_ORDERED_LIST;
    private static final SubLList $list563;
    private static final SubLList $list564;
    private static final SubLSymbol $kw565$PLAIN;
    private static final SubLSymbol $kw566$SRC;
    private static final SubLSymbol $kw567$DINGBAT;
    private static final SubLList $list568;
    private static final SubLList $list569;
    private static final SubLList $list570;
    private static final SubLList $list571;
    private static final SubLSymbol $sym572$HTML_FANCY_UNORDERED_LIST;
    private static final SubLSymbol $sym573$HTML_UNORDERED_LIST;
    private static final SubLList $list574;
    private static final SubLList $list575;
    private static final SubLList $list576;
    private static final SubLSymbol $kw577$SKIP;
    private static final SubLList $list578;
    private static final SubLList $list579;
    private static final SubLList $list580;
    private static final SubLList $list581;
    private static final SubLList $list582;
    private static final SubLList $list583;
    private static final SubLSymbol $sym584$HTML_FANCY_LIST_ITEM;
    private static final SubLList $list585;
    private static final SubLList $list586;
    private static final SubLList $list587;
    private static final SubLList $list588;
    private static final SubLList $list589;
    private static final SubLList $list590;
    private static final SubLSymbol $kw591$CODEBASE;
    private static final SubLSymbol $kw592$ARCHIVE;
    private static final SubLSymbol $kw593$ALT;
    private static final SubLSymbol $kw594$HEIGHT;
    private static final SubLSymbol $kw595$WIDTH;
    private static final SubLList $list596;
    private static final SubLList $list597;
    private static final SubLList $list598;
    private static final SubLList $list599;
    private static final SubLList $list600;
    private static final SubLSymbol $sym601$HTML_ALIGN;
    private static final SubLList $list602;
    private static final SubLList $list603;
    private static final SubLList $list604;
    private static final SubLList $list605;
    private static final SubLList $list606;
    private static final SubLList $list607;
    private static final SubLList $list608;
    private static final SubLList $list609;
    private static final SubLList $list610;
    private static final SubLSymbol $sym611$TO_STRING;
    private static final SubLSymbol $sym612$PIF;
    private static final SubLSymbol $sym613$STRINGP;
    private static final SubLSymbol $sym614$HTML_PRIN1;
    private static final SubLList $list615;
    private static final SubLSymbol $sym616$_HTML_FORM_FIELD_UNIQUIFIER_CODE_;
    private static final SubLSymbol $sym617$WITH_HTML_UNIQUE_FORM_FIELDS;
    private static final SubLSymbol $sym618$HTML_FANCY_FORM;
    private static final SubLList $list619;
    private static final SubLList $list620;
    private static final SubLList $list621;
    private static final SubLSymbol $sym622$GET_FORM_FIELD_CODE;
    private static final SubLSymbol $sym623$NEXT_HTML_FORM_FIELD_UNIQUIFIER_CODE;
    private static final SubLSymbol $sym624$_HTML_FORM_FIELD_UNIQUIFIER_ISG_;
    private static final SubLSymbol $sym625$EMBED_FORM_FIELD_CODE;
    private static final SubLString $str626$uniquifier_code;
    private static final SubLSymbol $sym627$WITH_HTML_UNIQUE_FORM_FIELD_DECODING;
    private static final SubLList $list628;
    private static final SubLList $list629;
    private static final SubLList $list630;
    private static final SubLList $list631;
    private static final SubLList $list632;
    private static final SubLList $list633;
    private static final SubLList $list634;
    private static final SubLList $list635;
    private static final SubLList $list636;
    private static final SubLList $list637;
    private static final SubLSymbol $kw638$VALUE;
    private static final SubLSymbol $kw639$CHECKED;
    private static final SubLSymbol $kw640$DISABLED_;
    private static final SubLSymbol $kw641$READONLY;
    private static final SubLSymbol $kw642$MAXLENGTH;
    private static final SubLSymbol $kw643$BORDER;
    private static final SubLSymbol $kw644$MIN;
    private static final SubLSymbol $kw645$MAX;
    private static final SubLSymbol $kw646$STEP;
    private static final SubLSymbol $kw647$ONCHANGE;
    private static final SubLSymbol $kw648$ONBLUR;
    private static final SubLSymbol $kw649$ONFOCUS;
    private static final SubLSymbol $kw650$ONKEYUP;
    private static final SubLSymbol $kw651$ONKEYDOWN;
    private static final SubLSymbol $kw652$ONKEYPRESS;
    private static final SubLList $list653;
    private static final SubLList $list654;
    private static final SubLList $list655;
    private static final SubLList $list656;
    private static final SubLList $list657;
    private static final SubLList $list658;
    private static final SubLList $list659;
    private static final SubLList $list660;
    private static final SubLList $list661;
    private static final SubLList $list662;
    private static final SubLList $list663;
    private static final SubLList $list664;
    private static final SubLList $list665;
    private static final SubLList $list666;
    private static final SubLList $list667;
    private static final SubLList $list668;
    private static final SubLList $list669;
    private static final SubLList $list670;
    private static final SubLList $list671;
    private static final SubLList $list672;
    private static final SubLList $list673;
    private static final SubLList $list674;
    private static final SubLList $list675;
    private static final SubLList $list676;
    private static final SubLList $list677;
    private static final SubLList $list678;
    private static final SubLSymbol $sym679$HTML_FANCY_INPUT;
    private static final SubLSymbol $sym680$_HTML_INPUT_BUTTON_;
    private static final SubLList $list681;
    private static final SubLSymbol $sym682$_HTML_INPUT_RADIO_;
    private static final SubLList $list683;
    private static final SubLList $list684;
    private static final SubLSymbol $sym685$_HTML_INPUT_SUBMIT_;
    private static final SubLList $list686;
    private static final SubLList $list687;
    private static final SubLSymbol $kw688$MULTIPLE;
    private static final SubLList $list689;
    private static final SubLList $list690;
    private static final SubLList $list691;
    private static final SubLList $list692;
    private static final SubLList $list693;
    private static final SubLList $list694;
    private static final SubLSymbol $kw695$SELECTED;
    private static final SubLSymbol $kw696$ONMOUSEOVER;
    private static final SubLSymbol $kw697$ONMOUSEOUT;
    private static final SubLList $list698;
    private static final SubLList $list699;
    private static final SubLList $list700;
    private static final SubLList $list701;
    private static final SubLList $list702;
    private static final SubLList $list703;
    private static final SubLList $list704;
    private static final SubLSymbol $kw705$LABEL;
    private static final SubLList $list706;
    private static final SubLList $list707;
    private static final SubLList $list708;
    private static final SubLList $list709;
    private static final SubLSymbol $kw710$COLS;
    private static final SubLSymbol $kw711$ROWS;
    private static final SubLSymbol $kw712$WRAP;
    private static final SubLList $list713;
    private static final SubLList $list714;
    private static final SubLList $list715;
    private static final SubLList $list716;
    private static final SubLList $list717;
    private static final SubLList $list718;
    private static final SubLList $list719;
    private static final SubLList $list720;
    private static final SubLList $list721;
    private static final SubLList $list722;
    private static final SubLList $list723;
    private static final SubLList $list724;
    private static final SubLSymbol $kw725$NOFLOW;
    private static final SubLSymbol $kw726$NOWRAP;
    private static final SubLSymbol $kw727$BORDERCOLOR;
    private static final SubLSymbol $kw728$CELLPADDING;
    private static final SubLSymbol $kw729$CELLSPACING;
    private static final SubLSymbol $kw730$COLSPEC;
    private static final SubLSymbol $kw731$UNITS;
    private static final SubLSymbol $kw732$BGCOLOR;
    private static final SubLSymbol $kw733$BACKGROUND;
    private static final SubLList $list734;
    private static final SubLList $list735;
    private static final SubLList $list736;
    private static final SubLList $list737;
    private static final SubLList $list738;
    private static final SubLList $list739;
    private static final SubLList $list740;
    private static final SubLList $list741;
    private static final SubLList $list742;
    private static final SubLList $list743;
    private static final SubLList $list744;
    private static final SubLList $list745;
    private static final SubLList $list746;
    private static final SubLList $list747;
    private static final SubLList $list748;
    private static final SubLSymbol $sym749$HTML_FANCY_TABLE;
    private static final SubLList $list750;
    private static final SubLList $list751;
    private static final SubLSymbol $kw752$COLSPAN;
    private static final SubLSymbol $kw753$ROWSPAN;
    private static final SubLSymbol $kw754$VALIGN;
    private static final SubLList $list755;
    private static final SubLList $list756;
    private static final SubLList $list757;
    private static final SubLList $list758;
    private static final SubLList $list759;
    private static final SubLList $list760;
    private static final SubLList $list761;
    private static final SubLList $list762;
    private static final SubLList $list763;
    private static final SubLSymbol $sym764$HTML_FANCY_TABLE_DATA;
    private static final SubLList $list765;
    private static final SubLList $list766;
    private static final SubLList $list767;
    private static final SubLList $list768;
    private static final SubLSymbol $sym769$HTML_FANCY_TABLE_HEADER;
    private static final SubLList $list770;
    private static final SubLList $list771;
    private static final SubLList $list772;
    private static final SubLList $list773;
    private static final SubLList $list774;
    private static final SubLList $list775;
    private static final SubLList $list776;
    private static final SubLList $list777;
    private static final SubLList $list778;
    private static final SubLSymbol $sym779$HTML_FANCY_TABLE_ROW;
    private static final SubLList $list780;
    private static final SubLList $list781;
    private static final SubLSymbol $sym782$_HTML_INDENT_TABLE_MAX_;
    private static final SubLSymbol $sym783$HTML_INDENT_TABLE_INTERNAL;
    private static final SubLList $list784;
    private static final SubLSymbol $sym785$INDENT;
    private static final SubLSymbol $sym786$SPAN;
    private static final SubLSymbol $sym787$MAX;
    private static final SubLSymbol $sym788$_;
    private static final SubLSymbol $sym789$HTML_TABLE_ROW;
    private static final SubLSymbol $sym790$HTML_INDENT_ROW_INTERNAL;
    private static final SubLList $list791;
    private static final SubLList $list792;
    private static final SubLSymbol $sym793$HTML_NO_BREAK;
    private static final SubLSymbol $sym794$HTML_INDENT;
    private static final SubLList $list795;
    private static final SubLList $list796;
    private static final SubLSymbol $kw797$COLOR1;
    private static final SubLSymbol $kw798$COLOR2;
    private static final SubLSymbol $kw799$COUNTER;
    private static final SubLSymbol $sym800$IGNORE_ME;
    private static final SubLString $str801$Malformed_cdolist_with_alternatin;
    private static final SubLSymbol $sym802$COLOR_TOGGLE;
    private static final SubLList $list803;
    private static final SubLSymbol $sym804$CDOLIST_NUMBERED;
    private static final SubLSymbol $sym805$CSETQ;
    private static final SubLList $list806;
    private static final SubLSymbol $sym807$FIF;
    private static final SubLList $list808;
    private static final SubLList $list809;
    private static final SubLSymbol $sym810$CDOLIST_WITH_ALTERNATING_BGCOLOR;
    private static final SubLSymbol $sym811$_HTML_COLOR_CYC_LOGO_LIGHT_VIOLET_;
    private static final SubLSymbol $sym812$_HTML_COLOR_CYC_LOGO_LIGHTER_VIOLET_;
    private static final SubLSymbol $sym813$_HTML_COLOR_CYC_LOGO_LIGHT_BLUE_;
    private static final SubLSymbol $sym814$_HTML_COLOR_CYC_LOGO_LIGHTER_BLUE_;
    private static final SubLList $list815;
    private static final SubLList $list816;
    private static final SubLSymbol $kw817$ALTERNATIVE1;
    private static final SubLSymbol $kw818$ALTERNATIVE2;
    private static final SubLString $str819$Malformed_cdolist_with_alternatin;
    private static final SubLSymbol $sym820$ALTERNATOR_TOGGLE;
    private static final SubLList $list821;
    private static final SubLList $list822;
    private static final SubLSymbol $kw823$CLASS1;
    private static final SubLSymbol $kw824$CLASS2;
    private static final SubLSymbol $sym825$CDOLIST_WITH_ALTERNATING_VARIABLE;
    private static final SubLList $list826;
    private static final SubLList $list827;
    private static final SubLList $list828;
    private static final SubLList $list829;
    private static final SubLList $list830;
    private static final SubLSymbol $kw831$TARGET;
    private static final SubLSymbol $kw832$ONMOUSEDOWN;
    private static final SubLSymbol $kw833$ONMOUSEUP;
    private static final SubLSymbol $kw834$ATTRS;
    private static final SubLList $list835;
    private static final SubLList $list836;
    private static final SubLList $list837;
    private static final SubLList $list838;
    private static final SubLList $list839;
    private static final SubLList $list840;
    private static final SubLList $list841;
    private static final SubLList $list842;
    private static final SubLString $str843$_;
    private static final SubLString $str844$_;
    private static final SubLList $list845;
    private static final SubLList $list846;
    private static final SubLList $list847;
    private static final SubLSymbol $sym848$HTML_FANCY_ANCHOR;
    private static final SubLList $list849;
    private static final SubLList $list850;
    private static final SubLList $list851;
    private static final SubLSymbol $sym852$HTML_MAILTO_URL;
    private static final SubLList $list853;
    private static final SubLSymbol $sym854$HTML_FILE_URL;
    private static final SubLList $list855;
    private static final SubLList $list856;
    private static final SubLSymbol $kw857$NOHREF;
    private static final SubLSymbol $kw858$SHAPE;
    private static final SubLSymbol $kw859$CO_ORDS;
    private static final SubLList $list860;
    private static final SubLList $list861;
    private static final SubLList $list862;
    private static final SubLList $list863;
    private static final SubLList $list864;
    private static final SubLList $list865;
    private static final SubLList $list866;
    private static final SubLList $list867;
    private static final SubLList $list868;
    private static final SubLList $list869;
    private static final SubLList $list870;
    private static final SubLSymbol $kw871$FRAMEBORDER;
    private static final SubLSymbol $kw872$NORESIZE;
    private static final SubLSymbol $kw873$SCROLLING;
    private static final SubLSymbol $kw874$MARGINHEIGHT;
    private static final SubLSymbol $kw875$MARGINWIDTH;
    private static final SubLList $list876;
    private static final SubLList $list877;
    private static final SubLList $list878;
    private static final SubLList $list879;
    private static final SubLList $list880;
    private static final SubLList $list881;
    private static final SubLList $list882;
    private static final SubLList $list883;
    private static final SubLSymbol $sym884$HTML_FANCY_FRAME;
    private static final SubLList $list885;
    private static final SubLList $list886;
    private static final SubLList $list887;
    private static final SubLList $list888;
    private static final SubLList $list889;
    private static final SubLList $list890;
    private static final SubLList $list891;
    private static final SubLSymbol $sym892$HTML_FANCY_FRAMESET;
    private static final SubLList $list893;
    private static final SubLList $list894;
    private static final SubLList $list895;
    private static final SubLList $list896;
    private static final SubLList $list897;
    private static final SubLList $list898;
    private static final SubLList $list899;
    private static final SubLList $list900;
    private static final SubLList $list901;
    private static final SubLList $list902;
    private static final SubLList $list903;
    private static final SubLList $list904;
    private static final SubLList $list905;
    private static final SubLList $list906;
    private static final SubLSymbol $kw907$ISMAP;
    private static final SubLList $list908;
    private static final SubLList $list909;
    private static final SubLList $list910;
    private static final SubLList $list911;
    private static final SubLList $list912;
    private static final SubLList $list913;
    private static final SubLList $list914;
    private static final SubLList $list915;
    private static final SubLList $list916;
    private static final SubLList $list917;
    private static final SubLList $list918;
    private static final SubLList $list919;
    private static final SubLList $list920;
    private static final SubLSymbol $sym921$DATA_SRC;
    private static final SubLSymbol $sym922$HTML_EMBEDDED_IMAGE_DATA_SRC;
    private static final SubLSymbol $sym923$HTML_FANCY_IMAGE;
    private static final SubLSymbol $sym924$HTML_EMBEDDED_IMAGE;
    private static final SubLString $str925$data__A_base64_;
    private static final SubLInteger $int926$76;
    private static final SubLList $list927;
    private static final SubLList $list928;
    private static final SubLSymbol $sym929$HTML_FANCY_MAP;
    private static final SubLList $list930;
    private static final SubLList $list931;
    private static final SubLList $list932;
    private static final SubLList $list933;
    private static final SubLSymbol $kw934$CLASSID;
    private static final SubLSymbol $kw935$CODETYPE;
    private static final SubLSymbol $kw936$DATA;
    private static final SubLSymbol $kw937$HSPACE;
    private static final SubLSymbol $kw938$VSPACE;
    private static final SubLList $list939;
    private static final SubLList $list940;
    private static final SubLList $list941;
    private static final SubLList $list942;
    private static final SubLList $list943;
    private static final SubLList $list944;
    private static final SubLList $list945;
    private static final SubLList $list946;
    private static final SubLList $list947;
    private static final SubLList $list948;
    private static final SubLList $list949;
    private static final SubLList $list950;
    private static final SubLList $list951;
    private static final SubLList $list952;
    private static final SubLList $list953;
    private static final SubLList $list954;
    private static final SubLList $list955;
    private static final SubLSymbol $kw956$LANGUAGE;
    private static final SubLList $list957;
    private static final SubLList $list958;
    private static final SubLList $list959;
    private static final SubLList $list960;
    private static final SubLSymbol $sym961$HTML_FANCY_SCRIPT;
    private static final SubLList $list962;
    private static final SubLList $list963;
    private static final SubLList $list964;
    private static final SubLList $list965;
    private static final SubLList $list966;
    private static final SubLList $list967;
    private static final SubLList $list968;
    private static final SubLSymbol $sym969$HTML_BASIC_CYC_FORM;
    private static final SubLSymbol $sym970$HTML_HIDDEN_INPUT;
    private static final SubLList $list971;
    private static final SubLSymbol $sym972$HTML_FANCY_TEXTAREA;
    private static final SubLList $list973;
    private static final SubLList $list974;
    private static final SubLSymbol $sym975$HTML_FANCY_SELECT;
    private static final SubLList $list976;
    private static final SubLSymbol $sym977$HTML_FANCY_OPTION;
    private static final SubLList $list978;
    private static final SubLSymbol $kw979$TOP;
    private static final SubLSymbol $sym980$HTML_TABLE_CAPTION;
    private static final SubLList $list981;
    private static final SubLSymbol $sym982$ID_NUM;
    private static final SubLSymbol $sym983$INPUT_ID;
    private static final SubLSymbol $sym984$RESULT_ID;
    private static final SubLSymbol $sym985$AUTOCOMPLETE_ID;
    private static final SubLList $list986;
    private static final SubLList $list987;
    private static final SubLSymbol $sym988$FORMAT_NIL;
    private static final SubLString $str989$autocomplete__A;
    private static final SubLString $str990$input__A;
    private static final SubLString $str991$autocomplete_results__A;
    private static final SubLSymbol $sym992$HTML_FANCY_DIV;
    private static final SubLList $list993;
    private static final SubLString $str994$yui_ac_input;
    private static final SubLList $list995;
    private static final SubLList $list996;
    private static final SubLSymbol $sym997$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT;
    private static final SubLList $list998;
    private static final SubLList $list999;
    private static final SubLSymbol $sym1000$SYMBOLP;
    private static final SubLSymbol $sym1001$STREAM;
    private static final SubLSymbol $sym1002$CWITH_OUTPUT_TO_STRING;
    private static final SubLSymbol $sym1003$WITH_HTML_OUTPUT_TO_STREAM;
    private static final SubLSymbol $sym1004$WITH_HTML_OUTPUT_TO_STRING;
    private static final SubLSymbol $sym1005$CONVERT_HTML_TO_TEXT;
    private static final SubLList $list1006;
    private static final SubLSymbol $sym1007$STATE_VAR;
    private static final SubLSymbol $sym1008$LOCK_VAR;
    private static final SubLSymbol $sym1009$VARIABLES;
    private static final SubLSymbol $sym1010$VALUES;
    private static final SubLSymbol $sym1011$HTML_MACHINE_STATE;
    private static final SubLSymbol $sym1012$HTML_MACHINE_STATE_LOCK;
    private static final SubLSymbol $sym1013$WITH_LOCK_HELD;
    private static final SubLSymbol $sym1014$HTML_MACHINE_STATE_VARIABLES;
    private static final SubLSymbol $sym1015$HTML_MACHINE_STATE_VALUES;
    private static final SubLSymbol $sym1016$CPROGV;
    private static final SubLSymbol $sym1017$SNAPSHOT_HTML_STATE;
    private static final SubLSymbol $kw1018$HTML_PARAMETER_ENTRY_FORMAT;
    private static final SubLList $list1019;
    private static final SubLSymbol $sym1020$SET_HTML_PARAMETER_ENTRY_FORMAT;
    private static final SubLSymbol $sym1021$QUOTE;
    private static final SubLSymbol $sym1022$_HTML_HANDLER_PROPERTY_;
    private static final SubLSymbol $kw1023$HTML_HANDLER;
    private static final SubLSymbol $sym1024$_XML_HANDLER_PROPERTY_;
    private static final SubLSymbol $kw1025$XML_HANDLER;
    private static final SubLSymbol $sym1026$_JSON_HANDLER_PROPERTY_;
    private static final SubLSymbol $kw1027$JSON_HANDLER;
    private static final SubLList $list1028;
    private static final SubLString $str1029$HTML_handler__A_has_an_invalid_ar;
    private static final SubLSymbol $sym1030$DEFINE;
    private static final SubLSymbol $sym1031$NOTE_CGI_HANDLER_FUNCTION;
    private static final SubLSymbol $sym1032$DEFINE_HTML_HANDLER;
    private static final SubLSymbol $sym1033$_HANDLER_MIME_TYPES_;
    private static final SubLInteger $int1034$200;
    private static final SubLList $list1035;
    private static final SubLSymbol $sym1036$DEFINE_CGI_HANDLER;
    private static final SubLSymbol $sym1037$STRING_LESSP;
    private static final SubLSymbol $sym1038$SYMBOL_NAME;
    private static final SubLList $list1039;
    private static final SubLSymbol $sym1040$ALIST;
    private static final SubLList $list1041;
    private static final SubLList $list1042;
    private static final SubLSymbol $kw1043$READER;
    private static final SubLSymbol $kw1044$TYPE_PRED;
    private static final SubLSymbol $kw1045$COLLECT;
    private static final SubLSymbol $kw1046$TEST;
    private static final SubLList $list1047;
    private static final SubLSymbol $sym1048$CURRENT;
    private static final SubLSymbol $sym1049$CDO;
    private static final SubLSymbol $sym1050$CDR;
    private static final SubLSymbol $sym1051$NULL;
    private static final SubLSymbol $sym1052$FUNCALL;
    private static final SubLSymbol $sym1053$CAAR;
    private static final SubLSymbol $sym1054$CPUSH;
    private static final SubLSymbol $sym1055$CAR;
    private static final SubLSymbol $sym1056$CDAR;
    private static final SubLSymbol $sym1057$VAL;
    private static final SubLSymbol $sym1058$CADR;
    private static final SubLSymbol $sym1059$ASSOC;
    private static final SubLSymbol $sym1060$CSETF;
    private static final SubLSymbol $sym1061$PUNLESS;
    private static final SubLSymbol $sym1062$ERROR;
    private static final SubLString $str1063$HTML_argument_error___S_should_be;
    private static final SubLList $list1064;
    private static final SubLSymbol $sym1065$REMOVE_IF_NOT;
    private static final SubLList $list1066;
    private static final SubLList $list1067;
    private static final SubLSymbol $sym1068$STRONG_VAR;
    private static final SubLSymbol $sym1069$HEAD;
    private static final SubLSymbol $sym1070$TAIL;
    private static final SubLList $list1071;
    private static final SubLList $list1072;
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 31360L)
    public static SubLObject is_known_dom_event_handlerP(final SubLObject symbol) {
        return (SubLObject)SubLObjectFactory.makeBoolean(symbol.isKeyword() && html_macros.NIL != list_utilities.member_eqP(symbol, html_macros.$html_known_dom_events$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 33151L)
    public static SubLObject html_format(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject control_string = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list345);
        control_string = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym346$FORMAT, (SubLObject)html_macros.$sym347$_HTML_STREAM_, control_string, ConsesLow.append(args, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 33415L)
    public static SubLObject html_format_strong(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject control_string = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list345);
        control_string = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym348$HTML_STRONG, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym346$FORMAT, (SubLObject)html_macros.$sym347$_HTML_STREAM_, control_string, ConsesLow.append(args, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 33731L)
    public static SubLObject html_markup_wrapper(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list349);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject head = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list349);
        head = current.first();
        current = current.rest();
        final SubLObject tail = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list349);
        current = current.rest();
        if (html_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list349);
            return (SubLObject)html_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (html_macros.NIL != tail) {
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, head), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, tail))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, head), ConsesLow.append(body, (SubLObject)html_macros.$list352));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 34742L)
    public static SubLObject html_quoted_attribute(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list353);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject att = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list353);
        att = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, att), (SubLObject)html_macros.$list354, ConsesLow.append(body, (SubLObject)html_macros.$list355));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list353);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 34994L)
    public static SubLObject html_markup_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list356, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)html_macros.$list358, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 35373L)
    public static SubLObject html_inside_body_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return html_macros.$html_inside_bodyP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 35440L)
    public static SubLObject html_fancy_body(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list359);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$1 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list359);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list359);
            if (html_macros.NIL == conses_high.member(current_$1, (SubLObject)html_macros.$list360, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$1 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list359);
        }
        final SubLObject show_copyright_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw362$SHOW_COPYRIGHT, current);
        final SubLObject show_copyright = (SubLObject)((html_macros.NIL != show_copyright_tail) ? conses_high.cadr(show_copyright_tail) : html_macros.T);
        final SubLObject background_image_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw363$BACKGROUND_IMAGE, current);
        final SubLObject background_image = (SubLObject)((html_macros.NIL != background_image_tail) ? conses_high.cadr(background_image_tail) : html_macros.NIL);
        final SubLObject background_color_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw364$BACKGROUND_COLOR, current);
        final SubLObject background_color = (SubLObject)((html_macros.NIL != background_color_tail) ? conses_high.cadr(background_color_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject text_color_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw366$TEXT_COLOR, current);
        final SubLObject text_color = (SubLObject)((html_macros.NIL != text_color_tail) ? conses_high.cadr(text_color_tail) : html_macros.NIL);
        final SubLObject link_color_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw367$LINK_COLOR, current);
        final SubLObject link_color = (SubLObject)((html_macros.NIL != link_color_tail) ? conses_high.cadr(link_color_tail) : html_macros.NIL);
        final SubLObject active_link_color_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw368$ACTIVE_LINK_COLOR, current);
        final SubLObject active_link_color = (SubLObject)((html_macros.NIL != active_link_color_tail) ? conses_high.cadr(active_link_color_tail) : html_macros.NIL);
        final SubLObject visited_link_color_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw369$VISITED_LINK_COLOR, current);
        final SubLObject visited_link_color = (SubLObject)((html_macros.NIL != visited_link_color_tail) ? conses_high.cadr(visited_link_color_tail) : html_macros.NIL);
        final SubLObject script_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw370$SCRIPT, current);
        final SubLObject script = (SubLObject)((html_macros.NIL != script_tail) ? conses_high.cadr(script_tail) : html_macros.NIL);
        final SubLObject onload_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw371$ONLOAD, current);
        final SubLObject onload = (SubLObject)((html_macros.NIL != onload_tail) ? conses_high.cadr(onload_tail) : html_macros.NIL);
        final SubLObject onresize_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw372$ONRESIZE, current);
        final SubLObject onresize = (SubLObject)((html_macros.NIL != onresize_tail) ? conses_high.cadr(onresize_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != background_image) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list375, (SubLObject)(background_image.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, background_image) : background_image)), attributes);
        }
        if (html_macros.NIL != onload) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list376, (SubLObject)(background_image.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onload) : onload)), attributes);
        }
        if (html_macros.NIL != onresize) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list377, (SubLObject)(background_image.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onresize) : onresize)), attributes);
        }
        if (html_macros.NIL != background_color) {
            assert html_macros.NIL != Types.atom(background_color) : background_color;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, background_color, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list380, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym381$HTML_COLOR, background_color)))), attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list382, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != style) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list383, (SubLObject)(style.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, style) : style)), attributes);
        }
        if (html_macros.NIL != text_color) {
            assert html_macros.NIL != Types.atom(text_color) : text_color;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, text_color, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list384, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym381$HTML_COLOR, text_color)))), attributes);
        }
        if (html_macros.NIL != link_color) {
            assert html_macros.NIL != Types.atom(link_color) : link_color;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, link_color, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list385, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym381$HTML_COLOR, link_color)))), attributes);
        }
        if (html_macros.NIL != active_link_color) {
            assert html_macros.NIL != Types.atom(active_link_color) : active_link_color;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, active_link_color, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list386, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym381$HTML_COLOR, active_link_color)))), attributes);
        }
        if (html_macros.NIL != visited_link_color) {
            assert html_macros.NIL != Types.atom(visited_link_color) : visited_link_color;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, visited_link_color, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list387, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym381$HTML_COLOR, visited_link_color)))), attributes);
        }
        if (html_macros.NIL != script) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list388, (SubLObject)(script.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, script) : script)), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)html_macros.$list389, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list391, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)html_macros.$list393, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, show_copyright, (SubLObject)html_macros.$list394))))))), (SubLObject)html_macros.$list395);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 38330L)
    public static SubLObject html_colored_body(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list396);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject color = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list396);
        color = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject color_value = (SubLObject)html_macros.$sym397$COLOR_VALUE;
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(color_value, color)), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym398$HTML_FANCY_BODY, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw364$BACKGROUND_COLOR, color_value), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list396);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 38533L)
    public static SubLObject html_body(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym399$HTML_COLORED_BODY, (SubLObject)html_macros.$list400, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 38740L)
    public static SubLObject html_head(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list401, (SubLObject)html_macros.$list402, ConsesLow.append(body, (SubLObject)html_macros.NIL)), (SubLObject)html_macros.$list395);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 39096L)
    public static SubLObject html_head_content_type() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_macros.NIL != system_parameters.$permit_utf_8_character_display$.getDynamicValue(thread)) {
            html_utilities.html_meta_utf_8_content_type();
        }
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 39256L)
    public static SubLObject html_document(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list405, (SubLObject)html_macros.$list406, (SubLObject)html_macros.$list393, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym407$WITH_POSSIBLY_NEW_HTML_FILE_DEPENDENCY_SPACE, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list408, ConsesLow.append(body, (SubLObject)html_macros.NIL))), (SubLObject)html_macros.$list395);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 39893L)
    public static SubLObject html_fancy_div(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list409);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$2 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list409);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list409);
            if (html_macros.NIL == conses_high.member(current_$2, (SubLObject)html_macros.$list410, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$2 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list409);
        }
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject onload_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw371$ONLOAD, current);
        final SubLObject onload = (SubLObject)((html_macros.NIL != onload_tail) ? conses_high.cadr(onload_tail) : html_macros.NIL);
        final SubLObject title_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw413$TITLE, current);
        final SubLObject title = (SubLObject)((html_macros.NIL != title_tail) ? conses_high.cadr(title_tail) : html_macros.NIL);
        final SubLObject misc_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw414$MISC, current);
        final SubLObject misc = (SubLObject)((html_macros.NIL != misc_tail) ? conses_high.cadr(misc_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != style) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list417, (SubLObject)(style.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, style) : style)), attributes);
        }
        if (html_macros.NIL != title) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list418, (SubLObject)(title.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, title) : style)), attributes);
        }
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list419, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, align))), attributes);
        }
        if (html_macros.NIL != onload) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list420, (SubLObject)(onload.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onload) : onload)), attributes);
        }
        if (html_macros.NIL != misc) {
            final SubLObject attribute = (SubLObject)html_macros.$sym421$ATTRIBUTE;
            final SubLObject value = (SubLObject)html_macros.$sym422$VALUE;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym423$DO_ALIST, (SubLObject)ConsesLow.list(attribute, value, misc), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)ConsesLow.list(attribute), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, value))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list424, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 41424L)
    public static SubLObject html_smaller(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym425$HTML_FANCY_SPAN, (SubLObject)html_macros.$list426, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 41612L)
    public static SubLObject html_larger(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym425$HTML_FANCY_SPAN, (SubLObject)html_macros.$list427, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 41797L)
    public static SubLObject html_fancy_span(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list428);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$3 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list428);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list428);
            if (html_macros.NIL == conses_high.member(current_$3, (SubLObject)html_macros.$list429, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$3 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list428);
        }
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject onclick_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw430$ONCLICK, current);
        final SubLObject onclick = (SubLObject)((html_macros.NIL != onclick_tail) ? conses_high.cadr(onclick_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject title_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw413$TITLE, current);
        final SubLObject title = (SubLObject)((html_macros.NIL != title_tail) ? conses_high.cadr(title_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != onclick) {
            assert html_macros.NIL != Types.atom(onclick) : onclick;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, onclick, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list431, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onclick))), attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != title) {
            assert html_macros.NIL != Types.atom(title) : title;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, title, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list432, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, title))), attributes);
        }
        if (html_macros.NIL != style) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list433, (SubLObject)(style.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, style) : style)), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list434, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 42940L)
    public static SubLObject html_meta(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list393, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list435, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 43176L)
    public static SubLObject html_fancy_meta(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list436);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$4 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list436);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list436);
            if (html_macros.NIL == conses_high.member(current_$4, (SubLObject)html_macros.$list437, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$4 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list436);
        }
        final SubLObject http_equiv_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw438$HTTP_EQUIV, current);
        final SubLObject http_equiv = (SubLObject)((html_macros.NIL != http_equiv_tail) ? conses_high.cadr(http_equiv_tail) : html_macros.NIL);
        final SubLObject content_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw439$CONTENT, current);
        final SubLObject content = (SubLObject)((html_macros.NIL != content_tail) ? conses_high.cadr(content_tail) : html_macros.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current);
        final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
        final SubLObject scheme_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw441$SCHEME, current);
        final SubLObject scheme = (SubLObject)((html_macros.NIL != scheme_tail) ? conses_high.cadr(scheme_tail) : html_macros.NIL);
        final SubLObject lang_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw442$LANG, current);
        final SubLObject lang = (SubLObject)((html_macros.NIL != lang_tail) ? conses_high.cadr(lang_tail) : html_macros.NIL);
        final SubLObject dir_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw443$DIR, current);
        final SubLObject dir = (SubLObject)((html_macros.NIL != dir_tail) ? conses_high.cadr(dir_tail) : html_macros.NIL);
        current = temp;
        if (html_macros.NIL == current) {
            SubLObject attributes = (SubLObject)html_macros.NIL;
            if (html_macros.NIL != content) {
                assert html_macros.NIL != Types.atom(content) : content;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, content, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list444, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, content))), attributes);
            }
            if (html_macros.NIL != name) {
                assert html_macros.NIL != Types.atom(name) : name;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, name, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list445, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name))), attributes);
            }
            if (html_macros.NIL != scheme) {
                assert html_macros.NIL != Types.atom(scheme) : scheme;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, scheme, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list446, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, scheme))), attributes);
            }
            if (html_macros.NIL != lang) {
                assert html_macros.NIL != Types.atom(lang) : lang;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, lang, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list447, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, lang))), attributes);
            }
            if (html_macros.NIL != dir) {
                assert html_macros.NIL != Types.atom(dir) : dir;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, dir, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list448, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, dir))), attributes);
            }
            if (html_macros.NIL != http_equiv) {
                assert html_macros.NIL != Types.atom(http_equiv) : http_equiv;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, http_equiv, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list449, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, http_equiv))), attributes);
            }
            return reader.bq_cons((SubLObject)html_macros.$sym450$HTML_META, ConsesLow.append(attributes, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list436);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 44359L)
    public static SubLObject html_link(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list393, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list451, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 44573L)
    public static SubLObject html_fancy_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list452);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$5 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list452);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list452);
            if (html_macros.NIL == conses_high.member(current_$5, (SubLObject)html_macros.$list453, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$5 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list452);
        }
        final SubLObject rel_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw454$REL, current);
        final SubLObject rel = (SubLObject)((html_macros.NIL != rel_tail) ? conses_high.cadr(rel_tail) : html_macros.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw455$TYPE, current);
        final SubLObject type = (SubLObject)((html_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : html_macros.NIL);
        final SubLObject href_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw456$HREF, current);
        final SubLObject href = (SubLObject)((html_macros.NIL != href_tail) ? conses_high.cadr(href_tail) : html_macros.NIL);
        final SubLObject media_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw457$MEDIA, current);
        final SubLObject media = (SubLObject)((html_macros.NIL != media_tail) ? conses_high.cadr(media_tail) : html_macros.NIL);
        final SubLObject title_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw413$TITLE, current);
        final SubLObject title = (SubLObject)((html_macros.NIL != title_tail) ? conses_high.cadr(title_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        current = temp;
        if (html_macros.NIL == current) {
            SubLObject attributes = (SubLObject)html_macros.NIL;
            if (html_macros.NIL != media) {
                assert html_macros.NIL != Types.atom(media) : media;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, media, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list458, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, media))), attributes);
            }
            if (html_macros.NIL != title) {
                assert html_macros.NIL != Types.atom(title) : title;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, title, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list459, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, title))), attributes);
            }
            if (html_macros.NIL != type) {
                assert html_macros.NIL != Types.atom(type) : type;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, type, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list460, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, type))), attributes);
            }
            if (html_macros.NIL != href) {
                assert html_macros.NIL != Types.atom(href) : href;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, href, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list461, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, href))), attributes);
            }
            if (html_macros.NIL != rel) {
                assert html_macros.NIL != Types.atom(rel) : rel;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, rel, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list462, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, rel))), attributes);
            }
            if (html_macros.NIL != id) {
                assert html_macros.NIL != Types.atom(id) : id;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
            }
            return reader.bq_cons((SubLObject)html_macros.$sym463$HTML_LINK, ConsesLow.append(attributes, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list452);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 45690L)
    public static SubLObject html_base(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list393, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list464, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 45904L)
    public static SubLObject html_fancy_base(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list465);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$6 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list465);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list465);
            if (html_macros.NIL == conses_high.member(current_$6, (SubLObject)html_macros.$list466, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$6 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list465);
        }
        final SubLObject href_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw456$HREF, current);
        final SubLObject href = (SubLObject)((html_macros.NIL != href_tail) ? conses_high.cadr(href_tail) : html_macros.NIL);
        current = temp;
        if (html_macros.NIL == current) {
            SubLObject attributes = (SubLObject)html_macros.NIL;
            if (html_macros.NIL != href) {
                assert html_macros.NIL != Types.atom(href) : href;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, href, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list467, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, href))), attributes);
            }
            return reader.bq_cons((SubLObject)html_macros.$sym468$HTML_BASE, ConsesLow.append(attributes, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list465);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 46188L)
    public static SubLObject html_stylesheet_link(final SubLObject href, SubLObject id, SubLObject title, SubLObject media) {
        if (id == html_macros.UNPROVIDED) {
            id = (SubLObject)html_macros.NIL;
        }
        if (title == html_macros.UNPROVIDED) {
            title = (SubLObject)html_macros.NIL;
        }
        if (media == html_macros.UNPROVIDED) {
            media = (SubLObject)html_macros.$str469$all;
        }
        html_utilities.html_source_readability_terpri((SubLObject)html_macros.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_link_head$.getGlobalValue());
        if (html_macros.NIL != id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
            html_utilities.html_markup(id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_link_rel$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_macros.$str470$stylesheet);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
        if (html_macros.NIL != href) {
            html_utilities.html_markup(html_macros.$html_link_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
            html_utilities.html_markup(href);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_link_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_macros.$str471$text_css);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
        if (html_macros.NIL != title) {
            html_utilities.html_markup(html_macros.$html_link_title$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
            html_utilities.html_markup(title);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
        }
        if (html_macros.NIL != media) {
            html_utilities.html_markup(html_macros.$html_link_media$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
            html_utilities.html_markup(media);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_macros.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_macros.UNPROVIDED);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 46392L)
    public static SubLObject html_style(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list393, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list472, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 46573L)
    public static SubLObject html_title(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list393, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list473, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 46811L)
    public static SubLObject html_simple_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list474);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list474);
        title = current.first();
        current = current.rest();
        final SubLObject color = (SubLObject)(current.isCons() ? current.first() : html_macros.$sym0$_HTML_DEFAULT_BGCOLOR_);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list474);
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym475$HTML_DOCUMENT, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym404$HTML_HEAD, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym476$HTML_TITLE, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym477$HTML_PRINC, title))), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym399$HTML_COLORED_BODY, (SubLObject)ConsesLow.list(color), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym478$HTML_HEADING, (SubLObject)html_macros.$list479, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym477$HTML_PRINC, title)), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list474);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 47384L)
    public static SubLObject html_simple_browser_document(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list480);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject title = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list480);
        title = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$7 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list480);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list480);
            if (html_macros.NIL == conses_high.member(current_$7, (SubLObject)html_macros.$list481, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$7 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list480);
        }
        final SubLObject completionP_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw482$COMPLETION_, current);
        final SubLObject completionP = (SubLObject)((html_macros.NIL != completionP_tail) ? conses_high.cadr(completionP_tail) : html_macros.NIL);
        final SubLObject color_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw483$COLOR, current);
        final SubLObject color = (SubLObject)((html_macros.NIL != color_tail) ? conses_high.cadr(color_tail) : html_macros.$sym0$_HTML_DEFAULT_BGCOLOR_);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym475$HTML_DOCUMENT, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym404$HTML_HEAD, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym476$HTML_TITLE, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym477$HTML_PRINC, title)), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, completionP, (SubLObject)html_macros.$list484)), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym399$HTML_COLORED_BODY, (SubLObject)ConsesLow.list(color), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym478$HTML_HEADING, (SubLObject)html_macros.$list479, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym477$HTML_PRINC, title)), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 48083L)
    public static SubLObject html_blockquote(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list485, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 49871L)
    public static SubLObject html_center(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list486, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 50053L)
    public static SubLObject html_heading(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list487);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject level = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list487);
        level = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list488, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, level)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list489, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, level)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list487);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 50438L)
    public static SubLObject html_paragraph(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list490, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 50707L)
    public static SubLObject html_plaintext(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list491, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 51022L)
    public static SubLObject verify_within_html_pre() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_macros.NIL == html_macros.$within_html_pre$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)html_macros.$str492$HTML_UNPRE_used_when_not_within_H);
        }
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 51164L)
    public static SubLObject verify_not_within_html_pre() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_macros.NIL != html_macros.$within_html_pre$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)html_macros.$str493$Nested_calls_to_HTML_PRE_will_con);
        }
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 51320L)
    public static SubLObject html_pre(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list494, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list495, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)html_macros.$list496, ConsesLow.append(body, (SubLObject)html_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 51706L)
    public static SubLObject html_unpre(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list497, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list498, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)html_macros.$list499, (SubLObject)html_macros.$list393, ConsesLow.append(body, (SubLObject)html_macros.$list395))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52285L)
    public static SubLObject html_address(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list500, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52551L)
    public static SubLObject html_big(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list501, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52726L)
    public static SubLObject html_bold(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list502, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52890L)
    public static SubLObject html_b(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)html_macros.$sym503$HTML_BOLD, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52994L)
    public static SubLObject html_cite(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list504, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53173L)
    public static SubLObject html_code(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list505, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53352L)
    public static SubLObject html_definition(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list506, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53548L)
    public static SubLObject html_emphasized(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list507, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53772L)
    public static SubLObject html_em(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)html_macros.$sym508$HTML_EMPHASIZED, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53925L)
    public static SubLObject html_fancy_font(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list509);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$8 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list509);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list509);
            if (html_macros.NIL == conses_high.member(current_$8, (SubLObject)html_macros.$list510, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$8 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list509);
        }
        final SubLObject size_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw511$SIZE, current);
        final SubLObject size = (SubLObject)((html_macros.NIL != size_tail) ? conses_high.cadr(size_tail) : html_macros.NIL);
        final SubLObject color_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw483$COLOR, current);
        final SubLObject color = (SubLObject)((html_macros.NIL != color_tail) ? conses_high.cadr(color_tail) : html_macros.NIL);
        final SubLObject face_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw512$FACE, current);
        final SubLObject face = (SubLObject)((html_macros.NIL != face_tail) ? conses_high.cadr(face_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != size) {
            assert html_macros.NIL != Types.atom(size) : size;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, size, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list513, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, size))), attributes);
        }
        if (html_macros.NIL != color) {
            assert html_macros.NIL != Types.atom(color) : color;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, color, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list514, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym381$HTML_COLOR, color)))), attributes);
        }
        if (html_macros.NIL != face) {
            assert html_macros.NIL != Types.atom(face) : face;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, size, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list515, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, face))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        if (html_macros.NIL != attributes) {
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list516, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
        }
        return reader.bq_cons((SubLObject)html_macros.$sym350$PROGN, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 54796L)
    public static SubLObject html_font(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list517);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject size = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list517);
        size = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject size_val = (SubLObject)html_macros.$sym518$SIZE_VAL;
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(size_val, size)), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym519$HTML_FANCY_FONT, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw511$SIZE, size_val), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list517);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55044L)
    public static SubLObject html_font_color(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list396);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject color = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list396);
        color = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject color_val = (SubLObject)html_macros.$sym520$COLOR_VAL;
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(color_val, color)), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym519$HTML_FANCY_FONT, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw483$COLOR, color_val), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list396);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55281L)
    public static SubLObject html_text_background_color(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list396);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject color = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list396);
        color = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym425$HTML_FANCY_SPAN, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw373$STYLE, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym521$HTML_STYLE_BACKGROUND_COLOR, color)), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list396);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55501L)
    public static SubLObject html_italic(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list522, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55674L)
    public static SubLObject html_i(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)html_macros.$sym523$HTML_ITALIC, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55783L)
    public static SubLObject html_keyboard(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list524, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55973L)
    public static SubLObject html_sample(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list525, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56190L)
    public static SubLObject html_small(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list526, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56373L)
    public static SubLObject html_strikethrough(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list527, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56581L)
    public static SubLObject html_strong(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list528, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56785L)
    public static SubLObject html_subscript(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list529, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56978L)
    public static SubLObject html_superscript(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list530, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57179L)
    public static SubLObject html_teletype(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list531, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57375L)
    public static SubLObject html_tt(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)html_macros.$sym532$HTML_TELETYPE, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57504L)
    public static SubLObject html_underlined(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list533, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57698L)
    public static SubLObject html_u(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)html_macros.$sym534$HTML_UNDERLINED, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57820L)
    public static SubLObject html_variable(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list535, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 58010L)
    public static SubLObject html_fancy_label(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list536);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$9 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list536);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list536);
            if (html_macros.NIL == conses_high.member(current_$9, (SubLObject)html_macros.$list537, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$9 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list536);
        }
        final SubLObject access_key_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw538$ACCESS_KEY, current);
        final SubLObject access_key = (SubLObject)((html_macros.NIL != access_key_tail) ? conses_high.cadr(access_key_tail) : html_macros.NIL);
        final SubLObject for_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw539$FOR, current);
        final SubLObject v_for = (SubLObject)((html_macros.NIL != for_tail) ? conses_high.cadr(for_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != access_key) {
            assert html_macros.NIL != Types.atom(access_key) : access_key;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, access_key, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list540, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, access_key))), attributes);
        }
        if (html_macros.NIL != v_for) {
            assert html_macros.NIL != Types.atom(v_for) : v_for;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_for, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list541, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym381$HTML_COLOR, v_for)))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        if (html_macros.NIL != attributes) {
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list542, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
        }
        return reader.bq_cons((SubLObject)html_macros.$sym350$PROGN, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 58712L)
    public static SubLObject html_definition_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list543, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 59080L)
    public static SubLObject html_compact_definition_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list543, (SubLObject)html_macros.$list544, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 59398L)
    public static SubLObject html_dl_term(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list545, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 59637L)
    public static SubLObject html_dl_definition(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list546, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 59886L)
    public static SubLObject html_directory_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list547, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 60152L)
    public static SubLObject html_compact_directory_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list547, (SubLObject)html_macros.$list544, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 60468L)
    public static SubLObject html_menu_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list548, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 60707L)
    public static SubLObject html_compact_menu_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list548, (SubLObject)html_macros.$list544, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 61005L)
    public static SubLObject html_fancy_ordered_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list549);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$10 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list549);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list549);
            if (html_macros.NIL == conses_high.member(current_$10, (SubLObject)html_macros.$list550, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$10 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list549);
        }
        final SubLObject compact_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw551$COMPACT, current);
        final SubLObject compact = (SubLObject)((html_macros.NIL != compact_tail) ? conses_high.cadr(compact_tail) : html_macros.NIL);
        final SubLObject continue_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw552$CONTINUE, current);
        final SubLObject v_continue = (SubLObject)((html_macros.NIL != continue_tail) ? conses_high.cadr(continue_tail) : html_macros.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw455$TYPE, current);
        final SubLObject type = (SubLObject)((html_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : html_macros.NIL);
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw553$START, current);
        final SubLObject start = (SubLObject)((html_macros.NIL != start_tail) ? conses_high.cadr(start_tail) : html_macros.NIL);
        final SubLObject seqnum_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw554$SEQNUM, current);
        final SubLObject seqnum = (SubLObject)((html_macros.NIL != seqnum_tail) ? conses_high.cadr(seqnum_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != compact) {
            assert html_macros.NIL != Types.atom(compact) : compact;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, compact, (SubLObject)html_macros.$list555), attributes);
        }
        if (html_macros.NIL != v_continue) {
            assert html_macros.NIL != Types.atom(v_continue) : v_continue;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, v_continue, (SubLObject)html_macros.$list556), attributes);
        }
        if (html_macros.NIL != type) {
            assert html_macros.NIL != Types.atom(type) : type;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, type, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list557, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, type))), attributes);
        }
        if (html_macros.NIL != start) {
            assert html_macros.NIL != Types.atom(start) : start;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, start, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list558, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, start))), attributes);
        }
        if (html_macros.NIL != seqnum) {
            assert html_macros.NIL != Types.atom(seqnum) : seqnum;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, seqnum, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list559, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, seqnum))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list560, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 62146L)
    public static SubLObject html_ordered_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym561$HTML_FANCY_ORDERED_LIST, (SubLObject)html_macros.NIL, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 62328L)
    public static SubLObject html_number_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)html_macros.$sym562$HTML_ORDERED_LIST, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 62489L)
    public static SubLObject html_fancy_unordered_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list563);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$11 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list563);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list563);
            if (html_macros.NIL == conses_high.member(current_$11, (SubLObject)html_macros.$list564, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$11 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list563);
        }
        final SubLObject compact_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw551$COMPACT, current);
        final SubLObject compact = (SubLObject)((html_macros.NIL != compact_tail) ? conses_high.cadr(compact_tail) : html_macros.NIL);
        final SubLObject plain_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw565$PLAIN, current);
        final SubLObject plain = (SubLObject)((html_macros.NIL != plain_tail) ? conses_high.cadr(plain_tail) : html_macros.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw455$TYPE, current);
        final SubLObject type = (SubLObject)((html_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : html_macros.NIL);
        final SubLObject src_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw566$SRC, current);
        final SubLObject src = (SubLObject)((html_macros.NIL != src_tail) ? conses_high.cadr(src_tail) : html_macros.NIL);
        final SubLObject dingbat_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw567$DINGBAT, current);
        final SubLObject dingbat = (SubLObject)((html_macros.NIL != dingbat_tail) ? conses_high.cadr(dingbat_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != compact) {
            assert html_macros.NIL != Types.atom(compact) : compact;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, compact, (SubLObject)html_macros.$list555), attributes);
        }
        if (html_macros.NIL != plain) {
            assert html_macros.NIL != Types.atom(plain) : plain;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, plain, (SubLObject)html_macros.$list568), attributes);
        }
        if (html_macros.NIL != type) {
            assert html_macros.NIL != Types.atom(type) : type;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, type, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list557, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, type))), attributes);
        }
        if (html_macros.NIL != src) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list569, (SubLObject)(src.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, src) : src)), attributes);
        }
        if (html_macros.NIL != dingbat) {
            assert html_macros.NIL != Types.atom(dingbat) : dingbat;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, dingbat, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list570, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, dingbat))), attributes);
        }
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list571, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 63982L)
    public static SubLObject html_unordered_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym572$HTML_FANCY_UNORDERED_LIST, (SubLObject)html_macros.NIL, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 64169L)
    public static SubLObject html_bullet_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return reader.bq_cons((SubLObject)html_macros.$sym573$HTML_UNORDERED_LIST, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 64333L)
    public static SubLObject html_plain_list(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym572$HTML_FANCY_UNORDERED_LIST, (SubLObject)html_macros.$list574, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 64536L)
    public static SubLObject html_fancy_list_item(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list575);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$12 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list575);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list575);
            if (html_macros.NIL == conses_high.member(current_$12, (SubLObject)html_macros.$list576, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$12 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list575);
        }
        final SubLObject skip_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw577$SKIP, current);
        final SubLObject skip = (SubLObject)((html_macros.NIL != skip_tail) ? conses_high.cadr(skip_tail) : html_macros.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw455$TYPE, current);
        final SubLObject type = (SubLObject)((html_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : html_macros.NIL);
        final SubLObject src_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw566$SRC, current);
        final SubLObject src = (SubLObject)((html_macros.NIL != src_tail) ? conses_high.cadr(src_tail) : html_macros.NIL);
        final SubLObject dingbat_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw567$DINGBAT, current);
        final SubLObject dingbat = (SubLObject)((html_macros.NIL != dingbat_tail) ? conses_high.cadr(dingbat_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != skip) {
            assert html_macros.NIL != Types.atom(skip) : skip;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, skip, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list578, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, skip))), attributes);
        }
        if (html_macros.NIL != type) {
            assert html_macros.NIL != Types.atom(type) : type;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, type, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list579, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, type))), attributes);
        }
        if (html_macros.NIL != src) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list580, (SubLObject)(src.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, src) : src)), attributes);
        }
        if (html_macros.NIL != id) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list581, (SubLObject)(id.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id) : id)), attributes);
        }
        if (html_macros.NIL != dingbat) {
            assert html_macros.NIL != Types.atom(dingbat) : dingbat;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, dingbat, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list582, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, dingbat))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list583, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 65890L)
    public static SubLObject html_list_item(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym584$HTML_FANCY_LIST_ITEM, (SubLObject)html_macros.NIL, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 66056L)
    public static SubLObject html_fancy_summary(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list585);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$13 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list585);
            current_$13 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list585);
            if (html_macros.NIL == conses_high.member(current_$13, (SubLObject)html_macros.$list586, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$13 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list585);
        }
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != id) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list581, (SubLObject)(id.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id) : id)), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list587, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 66956L)
    public static SubLObject html_fancy_details(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list585);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$14 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list585);
            current_$14 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list585);
            if (html_macros.NIL == conses_high.member(current_$14, (SubLObject)html_macros.$list586, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$14 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list585);
        }
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != id) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list581, (SubLObject)(id.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id) : id)), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list588, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 67747L)
    public static SubLObject html_applet(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject code = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list589);
        code = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list589);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$15 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list589);
            current_$15 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list589);
            if (html_macros.NIL == conses_high.member(current_$15, (SubLObject)html_macros.$list590, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$15 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list589);
        }
        final SubLObject codebase_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw591$CODEBASE, current);
        final SubLObject codebase = (SubLObject)((html_macros.NIL != codebase_tail) ? conses_high.cadr(codebase_tail) : html_macros.NIL);
        final SubLObject archive_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw592$ARCHIVE, current);
        final SubLObject archive = (SubLObject)((html_macros.NIL != archive_tail) ? conses_high.cadr(archive_tail) : html_macros.NIL);
        final SubLObject alt_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw593$ALT, current);
        final SubLObject alt = (SubLObject)((html_macros.NIL != alt_tail) ? conses_high.cadr(alt_tail) : html_macros.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current);
        final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw594$HEIGHT, current);
        final SubLObject height = (SubLObject)((html_macros.NIL != height_tail) ? conses_high.cadr(height_tail) : html_macros.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw595$WIDTH, current);
        final SubLObject width = (SubLObject)((html_macros.NIL != width_tail) ? conses_high.cadr(width_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list596, (SubLObject)(code.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, code) : code)), attributes);
        if (html_macros.NIL != codebase) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list597, (SubLObject)(codebase.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, codebase) : codebase)), attributes);
        }
        if (html_macros.NIL != archive) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list598, (SubLObject)(archive.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, archive) : archive)), attributes);
        }
        if (html_macros.NIL != alt) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list599, (SubLObject)(alt.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, alt) : alt)), attributes);
        }
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list600, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, align)))), attributes);
        }
        if (html_macros.NIL != name) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, name, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list602, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name))), attributes);
        }
        if (html_macros.NIL != id) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list603, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != height) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list604, (SubLObject)(height.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, height) : height)), attributes);
        }
        if (html_macros.NIL != width) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list605, (SubLObject)(width.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, width) : width)), attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list606, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 69560L)
    public static SubLObject html_param(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject value = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list607);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list607);
        value = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list608, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list609, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name)), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list610, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, value)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list607);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 69803L)
    public static SubLObject html_safe_param(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject value = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list607);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list607);
        value = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list608, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list609, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym611$TO_STRING, name))), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list610, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym612$PIF, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym613$STRINGP, value), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym477$HTML_PRINC, value), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym614$HTML_PRIN1, value))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list607);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70253L)
    public static SubLObject with_html_id_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)html_macros.$list615, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70507L)
    public static SubLObject next_html_id(SubLObject generator) {
        if (generator == html_macros.UNPROVIDED) {
            generator = html_macros.$html_id_space_id_generator$.getDynamicValue();
        }
        return integer_sequence_generator.integer_sequence_generator_next(generator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70645L)
    public static SubLObject next_html_id_definedP(SubLObject generator) {
        if (generator == html_macros.UNPROVIDED) {
            generator = html_macros.$html_id_space_id_generator$.getDynamicValue();
        }
        return integer_sequence_generator.integer_sequence_generator_p(generator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70930L)
    public static SubLObject with_html_unique_form_fields(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)html_macros.$list619, ConsesLow.append(body, (SubLObject)html_macros.$list620));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 71500L)
    public static SubLObject with_html_unique_form_field_decoding(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list621);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject args = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list621);
        args = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym616$_HTML_FORM_FIELD_UNIQUIFIER_CODE_, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym622$GET_FORM_FIELD_CODE, args))), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list621);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 71748L)
    public static SubLObject next_html_form_field_uniquifier_code() {
        final SubLObject isg = find_or_create_html_form_field_uniquifier_isg();
        return integer_sequence_generator.integer_sequence_generator_next(isg);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 72202L)
    public static SubLObject find_or_create_html_form_field_uniquifier_isg() {
        final SubLObject isg = html_macros.$html_form_field_uniquifier_isg$.getGlobalValue();
        if (html_macros.NIL != integer_sequence_generator.integer_sequence_generator_p(isg)) {
            return isg;
        }
        html_macros.$html_form_field_uniquifier_isg$.setGlobalValue(integer_sequence_generator.new_integer_sequence_generator((SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED));
        return html_macros.$html_form_field_uniquifier_isg$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 72493L)
    public static SubLObject embed_form_field_code(final SubLObject code) {
        return html_utilities.html_hidden_input((SubLObject)html_macros.$str626$uniquifier_code, code, (SubLObject)html_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 72750L)
    public static SubLObject get_form_field_code(final SubLObject args) {
        final SubLObject code_string = html_utilities.html_extract_input((SubLObject)html_macros.$str626$uniquifier_code, args);
        return (SubLObject)(code_string.isString() ? reader.parse_integer(code_string, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED) : html_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 73217L)
    public static SubLObject html_fancy_form(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list628);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject action = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list628);
        action = current.first();
        current = current.rest();
        final SubLObject method = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list628);
        current = current.rest();
        final SubLObject target = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list628);
        current = current.rest();
        final SubLObject name = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list628);
        current = current.rest();
        final SubLObject script = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list628);
        current = current.rest();
        final SubLObject form_id = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list628);
        current = current.rest();
        final SubLObject enctype = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list628);
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            SubLObject attributes = (SubLObject)html_macros.NIL;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list629, (SubLObject)(action.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, action) : action)), attributes);
            if (html_macros.NIL != enctype) {
                assert html_macros.NIL != Types.atom(enctype) : enctype;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, enctype, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list630, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, enctype))), attributes);
            }
            if (html_macros.NIL != form_id) {
                assert html_macros.NIL != Types.atom(form_id) : form_id;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, form_id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, form_id))), attributes);
            }
            if (html_macros.NIL != method) {
                assert html_macros.NIL != Types.atom(method) : method;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, method, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list631, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, method))), attributes);
            }
            if (html_macros.NIL != name) {
                assert html_macros.NIL != Types.atom(name) : name;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, name, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list632, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name))), attributes);
            }
            if (html_macros.NIL != target) {
                assert html_macros.NIL != Types.atom(target) : target;
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, target, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list633, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, target))), attributes);
            }
            if (html_macros.NIL != script) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list388, (SubLObject)(script.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, script) : script)), attributes);
            }
            attributes = Sequences.nreverse(attributes);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list634, ConsesLow.append(attributes, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)html_macros.$list635, reader.bq_cons((SubLObject)html_macros.$sym617$WITH_HTML_UNIQUE_FORM_FIELDS, ConsesLow.append(body, (SubLObject)html_macros.NIL)))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list628);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 74817L)
    public static SubLObject html_fancy_input(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list636);
        type = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$16 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list636);
            current_$16 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list636);
            if (html_macros.NIL == conses_high.member(current_$16, (SubLObject)html_macros.$list637, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$16 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list636);
        }
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current);
        final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
        final SubLObject value_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw638$VALUE, current);
        final SubLObject value = (SubLObject)((html_macros.NIL != value_tail) ? conses_high.cadr(value_tail) : html_macros.NIL);
        final SubLObject checked_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw639$CHECKED, current);
        final SubLObject checked = (SubLObject)((html_macros.NIL != checked_tail) ? conses_high.cadr(checked_tail) : html_macros.NIL);
        final SubLObject disabledP_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw640$DISABLED_, current);
        final SubLObject disabledP = (SubLObject)((html_macros.NIL != disabledP_tail) ? conses_high.cadr(disabledP_tail) : html_macros.NIL);
        final SubLObject readonly_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw641$READONLY, current);
        final SubLObject readonly = (SubLObject)((html_macros.NIL != readonly_tail) ? conses_high.cadr(readonly_tail) : html_macros.NIL);
        final SubLObject size_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw511$SIZE, current);
        final SubLObject size = (SubLObject)((html_macros.NIL != size_tail) ? conses_high.cadr(size_tail) : html_macros.NIL);
        final SubLObject maxlength_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw642$MAXLENGTH, current);
        final SubLObject maxlength = (SubLObject)((html_macros.NIL != maxlength_tail) ? conses_high.cadr(maxlength_tail) : html_macros.NIL);
        final SubLObject src_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw566$SRC, current);
        final SubLObject src = (SubLObject)((html_macros.NIL != src_tail) ? conses_high.cadr(src_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject border_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw643$BORDER, current);
        final SubLObject border = (SubLObject)((html_macros.NIL != border_tail) ? conses_high.cadr(border_tail) : html_macros.NIL);
        final SubLObject min_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw644$MIN, current);
        final SubLObject min = (SubLObject)((html_macros.NIL != min_tail) ? conses_high.cadr(min_tail) : html_macros.NIL);
        final SubLObject max_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw645$MAX, current);
        final SubLObject max = (SubLObject)((html_macros.NIL != max_tail) ? conses_high.cadr(max_tail) : html_macros.NIL);
        final SubLObject step_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw646$STEP, current);
        final SubLObject step = (SubLObject)((html_macros.NIL != step_tail) ? conses_high.cadr(step_tail) : html_macros.NIL);
        final SubLObject script_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw370$SCRIPT, current);
        final SubLObject script = (SubLObject)((html_macros.NIL != script_tail) ? conses_high.cadr(script_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject onchange_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw647$ONCHANGE, current);
        final SubLObject onchange = (SubLObject)((html_macros.NIL != onchange_tail) ? conses_high.cadr(onchange_tail) : html_macros.NIL);
        final SubLObject onclick_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw430$ONCLICK, current);
        final SubLObject onclick = (SubLObject)((html_macros.NIL != onclick_tail) ? conses_high.cadr(onclick_tail) : html_macros.NIL);
        final SubLObject onblur_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw648$ONBLUR, current);
        final SubLObject onblur = (SubLObject)((html_macros.NIL != onblur_tail) ? conses_high.cadr(onblur_tail) : html_macros.NIL);
        final SubLObject onfocus_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw649$ONFOCUS, current);
        final SubLObject onfocus = (SubLObject)((html_macros.NIL != onfocus_tail) ? conses_high.cadr(onfocus_tail) : html_macros.NIL);
        final SubLObject onkeyup_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw650$ONKEYUP, current);
        final SubLObject onkeyup = (SubLObject)((html_macros.NIL != onkeyup_tail) ? conses_high.cadr(onkeyup_tail) : html_macros.NIL);
        final SubLObject onkeydown_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw651$ONKEYDOWN, current);
        final SubLObject onkeydown = (SubLObject)((html_macros.NIL != onkeydown_tail) ? conses_high.cadr(onkeydown_tail) : html_macros.NIL);
        final SubLObject onkeypress_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw652$ONKEYPRESS, current);
        final SubLObject onkeypress = (SubLObject)((html_macros.NIL != onkeypress_tail) ? conses_high.cadr(onkeypress_tail) : html_macros.NIL);
        final SubLObject alt_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw593$ALT, current);
        final SubLObject alt = (SubLObject)((html_macros.NIL != alt_tail) ? conses_high.cadr(alt_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject title_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw413$TITLE, current);
        final SubLObject title = (SubLObject)((html_macros.NIL != title_tail) ? conses_high.cadr(title_tail) : html_macros.NIL);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        SubLObject static_disabledP = (SubLObject)html_macros.NIL;
        assert html_macros.NIL != Types.atom(type) : type;
        attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list653, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, type)), attributes);
        if (html_macros.NIL != style) {
            assert html_macros.NIL != Types.atom(style) : style;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list654, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, style)), attributes);
        }
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != name) {
            assert html_macros.NIL != Types.atom(name) : name;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, name, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list655, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name))), attributes);
        }
        if (html_macros.NIL != alt) {
            assert html_macros.NIL != Types.atom(alt) : alt;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, alt, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list656, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, alt))), attributes);
        }
        if (html_macros.NIL != value) {
            assert html_macros.NIL != Types.atom(value) : value;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, value, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list657, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym477$HTML_PRINC, value))), attributes);
        }
        if (html_macros.NIL != checked) {
            assert html_macros.NIL != Types.atom(checked) : checked;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, checked, (SubLObject)html_macros.$list658), attributes);
        }
        if (html_macros.NIL != readonly) {
            assert html_macros.NIL != Types.atom(readonly) : readonly;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, readonly, (SubLObject)html_macros.$list659), attributes);
        }
        if (html_macros.NIL != disabledP) {
            assert html_macros.NIL != Types.atom(disabledP) : disabledP;
            static_disabledP = (SubLObject)html_macros.T;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, disabledP, (SubLObject)html_macros.$list660), attributes);
        }
        if (html_macros.NIL != size) {
            assert html_macros.NIL != Types.atom(size) : size;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, size, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list661, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, size))), attributes);
        }
        if (html_macros.NIL != maxlength) {
            assert html_macros.NIL != Types.atom(maxlength) : maxlength;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, maxlength, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list662, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, maxlength))), attributes);
        }
        if (html_macros.NIL != src) {
            if (src.isAtom()) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, src, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list663, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, src))), attributes);
            }
            else {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list663, src), attributes);
            }
        }
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list664, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, align)))), attributes);
        }
        if (html_macros.NIL != border) {
            assert html_macros.NIL != Types.atom(border) : border;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, border, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list665, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, border))), attributes);
        }
        if (html_macros.NIL != min) {
            assert html_macros.NIL != Types.atom(min) : min;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, min, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list666, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, min))), attributes);
        }
        if (html_macros.NIL != max) {
            assert html_macros.NIL != Types.atom(max) : max;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, max, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list667, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, max))), attributes);
        }
        if (html_macros.NIL != step) {
            assert html_macros.NIL != Types.atom(step) : step;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, step, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list668, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, step))), attributes);
        }
        if (html_macros.NIL != script) {
            if (script.isAtom()) {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, script, (SubLObject)html_macros.$list388, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, script)), attributes);
            }
            else {
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list388, script), attributes);
            }
        }
        if (html_macros.NIL != onchange) {
            assert html_macros.NIL != Types.atom(onchange) : onchange;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, onchange, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list669, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onchange))), attributes);
        }
        if (html_macros.NIL != onclick) {
            assert html_macros.NIL != Types.atom(onclick) : onclick;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, onclick, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list431, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onclick))), attributes);
        }
        if (html_macros.NIL != onblur) {
            assert html_macros.NIL != Types.atom(onblur) : onblur;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, onblur, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list670, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onblur))), attributes);
        }
        if (html_macros.NIL != onfocus) {
            assert html_macros.NIL != Types.atom(onfocus) : onfocus;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, onfocus, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list671, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onfocus))), attributes);
        }
        if (html_macros.NIL != onkeyup) {
            assert html_macros.NIL != Types.atom(onkeyup) : onkeyup;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, onkeyup, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list672, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onkeyup))), attributes);
        }
        if (html_macros.NIL != onkeydown) {
            assert html_macros.NIL != Types.atom(onkeydown) : onkeydown;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, onkeydown, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list673, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onkeydown))), attributes);
        }
        if (html_macros.NIL != onkeypress) {
            assert html_macros.NIL != Types.atom(onkeypress) : onkeypress;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, onkeypress, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list674, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onkeypress))), attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != title) {
            assert html_macros.NIL != Types.atom(title) : title;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, title, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list432, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, title))), attributes);
        }
        if (html_macros.NIL == static_disabledP) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)html_macros.$list675, attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list676, ConsesLow.append(attributes, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 80609L)
    public static SubLObject html_script_button(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list677);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list677);
        value = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$17 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list677);
            current_$17 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list677);
            if (html_macros.NIL == conses_high.member(current_$17, (SubLObject)html_macros.$list678, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$17 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list677);
        }
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym679$HTML_FANCY_INPUT, (SubLObject)html_macros.$sym680$_HTML_INPUT_BUTTON_, (SubLObject)html_macros.$kw638$VALUE, value, ConsesLow.append((SubLObject)((html_macros.NIL != style) ? ConsesLow.list((SubLObject)html_macros.$kw373$STYLE, style) : html_macros.NIL), (SubLObject)((html_macros.NIL != v_class) ? ConsesLow.list((SubLObject)html_macros.$kw365$CLASS, v_class) : html_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw370$SCRIPT, reader.bq_cons((SubLObject)html_macros.$sym350$PROGN, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 80889L)
    public static SubLObject html_script_radio(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list681);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list681);
        name = current.first();
        current = current.rest();
        final SubLObject value = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list681);
        current = current.rest();
        final SubLObject checkedP = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list681);
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list(new SubLObject[] { html_macros.$sym679$HTML_FANCY_INPUT, html_macros.$sym682$_HTML_INPUT_RADIO_, html_macros.$kw440$NAME, name, html_macros.$kw638$VALUE, value, html_macros.$kw639$CHECKED, checkedP, html_macros.$kw370$SCRIPT, reader.bq_cons((SubLObject)html_macros.$sym350$PROGN, ConsesLow.append(body, (SubLObject)html_macros.NIL)) });
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list681);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 81118L)
    public static SubLObject html_script_submit(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list683);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject value = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list683);
        value = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$18 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list683);
            current_$18 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list683);
            if (html_macros.NIL == conses_high.member(current_$18, (SubLObject)html_macros.$list684, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$18 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list683);
        }
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym679$HTML_FANCY_INPUT, (SubLObject)html_macros.$sym685$_HTML_INPUT_SUBMIT_, (SubLObject)html_macros.$kw638$VALUE, value, ConsesLow.append((SubLObject)((html_macros.NIL != style) ? ConsesLow.list((SubLObject)html_macros.$kw373$STYLE, style) : html_macros.NIL), (SubLObject)((html_macros.NIL != id) ? ConsesLow.list((SubLObject)html_macros.$kw411$ID, id) : html_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw370$SCRIPT, reader.bq_cons((SubLObject)html_macros.$sym350$PROGN, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 81377L)
    public static SubLObject html_fancy_select(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list686);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list686);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$19 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list686);
            current_$19 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list686);
            if (html_macros.NIL == conses_high.member(current_$19, (SubLObject)html_macros.$list687, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$19 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list686);
        }
        final SubLObject multiple_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw688$MULTIPLE, current);
        final SubLObject multiple = (SubLObject)((html_macros.NIL != multiple_tail) ? conses_high.cadr(multiple_tail) : html_macros.NIL);
        final SubLObject size_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw511$SIZE, current);
        final SubLObject size = (SubLObject)((html_macros.NIL != size_tail) ? conses_high.cadr(size_tail) : html_macros.NIL);
        final SubLObject script_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw370$SCRIPT, current);
        final SubLObject script = (SubLObject)((html_macros.NIL != script_tail) ? conses_high.cadr(script_tail) : html_macros.NIL);
        final SubLObject onchange_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw647$ONCHANGE, current);
        final SubLObject onchange = (SubLObject)((html_macros.NIL != onchange_tail) ? conses_high.cadr(onchange_tail) : html_macros.NIL);
        final SubLObject disabledP_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw640$DISABLED_, current);
        final SubLObject disabledP = (SubLObject)((html_macros.NIL != disabledP_tail) ? conses_high.cadr(disabledP_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        SubLObject static_disabledP = (SubLObject)html_macros.NIL;
        assert html_macros.NIL != Types.atom(name) : name;
        attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list689, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name)), attributes);
        if (html_macros.NIL != multiple) {
            assert html_macros.NIL != Types.atom(multiple) : multiple;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, multiple, (SubLObject)html_macros.$list690), attributes);
        }
        if (html_macros.NIL != size) {
            assert html_macros.NIL != Types.atom(size) : size;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, size, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list691, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, size))), attributes);
        }
        if (html_macros.NIL != script) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list388, (SubLObject)(script.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, script) : script)), attributes);
        }
        if (html_macros.NIL != onchange) {
            assert html_macros.NIL != Types.atom(onchange) : onchange;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, onchange, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list669, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onchange))), attributes);
        }
        if (html_macros.NIL != disabledP) {
            assert html_macros.NIL != Types.atom(disabledP) : disabledP;
            static_disabledP = (SubLObject)html_macros.T;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, disabledP, (SubLObject)html_macros.$list660), attributes);
        }
        if (html_macros.NIL == static_disabledP) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)html_macros.$list675, attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list692, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 83817L)
    public static SubLObject html_fancy_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list693);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$20 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list693);
            current_$20 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list693);
            if (html_macros.NIL == conses_high.member(current_$20, (SubLObject)html_macros.$list694, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$20 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list693);
        }
        final SubLObject selected_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw695$SELECTED, current);
        final SubLObject selected = (SubLObject)((html_macros.NIL != selected_tail) ? conses_high.cadr(selected_tail) : html_macros.NIL);
        final SubLObject value_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw638$VALUE, current);
        final SubLObject value = (SubLObject)((html_macros.NIL != value_tail) ? conses_high.cadr(value_tail) : html_macros.NIL);
        final SubLObject onmouseover_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw696$ONMOUSEOVER, current);
        final SubLObject onmouseover = (SubLObject)((html_macros.NIL != onmouseover_tail) ? conses_high.cadr(onmouseover_tail) : html_macros.NIL);
        final SubLObject onmouseout_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw697$ONMOUSEOUT, current);
        final SubLObject onmouseout = (SubLObject)((html_macros.NIL != onmouseout_tail) ? conses_high.cadr(onmouseout_tail) : html_macros.NIL);
        final SubLObject script_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw370$SCRIPT, current);
        final SubLObject script = (SubLObject)((html_macros.NIL != script_tail) ? conses_high.cadr(script_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != selected) {
            assert html_macros.NIL != Types.atom(selected) : selected;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, selected, (SubLObject)html_macros.$list698), attributes);
        }
        if (html_macros.NIL != value) {
            assert html_macros.NIL != Types.atom(value) : value;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, value, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list699, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, value))), attributes);
        }
        if (html_macros.NIL != script) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list388, (SubLObject)(script.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, script) : script)), attributes);
        }
        if (html_macros.NIL != onmouseout) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list700, (SubLObject)(onmouseout.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onmouseout) : onmouseout)), attributes);
        }
        if (html_macros.NIL != onmouseover) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list701, (SubLObject)(onmouseover.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onmouseover) : onmouseover)), attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list702, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 85034L)
    public static SubLObject html_optgroup(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list703);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$21 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list703);
            current_$21 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list703);
            if (html_macros.NIL == conses_high.member(current_$21, (SubLObject)html_macros.$list704, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$21 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list703);
        }
        final SubLObject label_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw705$LABEL, current);
        final SubLObject label = (SubLObject)((html_macros.NIL != label_tail) ? conses_high.cadr(label_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != label) {
            assert html_macros.NIL != Types.atom(label) : label;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list706, (SubLObject)(label.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, label) : label)), attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list707, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 85490L)
    public static SubLObject html_fancy_textarea(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list708);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list708);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$22 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list708);
            current_$22 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list708);
            if (html_macros.NIL == conses_high.member(current_$22, (SubLObject)html_macros.$list709, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$22 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list708);
        }
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject cols_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw710$COLS, current);
        final SubLObject cols = (SubLObject)((html_macros.NIL != cols_tail) ? conses_high.cadr(cols_tail) : html_macros.NIL);
        final SubLObject rows_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw711$ROWS, current);
        final SubLObject rows = (SubLObject)((html_macros.NIL != rows_tail) ? conses_high.cadr(rows_tail) : html_macros.NIL);
        final SubLObject wrap_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw712$WRAP, current);
        final SubLObject wrap = (SubLObject)((html_macros.NIL != wrap_tail) ? conses_high.cadr(wrap_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        assert html_macros.NIL != Types.atom(name) : name;
        attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list713, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name)), attributes);
        if (html_macros.NIL != cols) {
            assert html_macros.NIL != Types.atom(cols) : cols;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, cols, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list714, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, cols))), attributes);
        }
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list715, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != rows) {
            assert html_macros.NIL != Types.atom(rows) : rows;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, rows, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list716, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, rows))), attributes);
        }
        if (html_macros.NIL != wrap) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, wrap, (SubLObject)html_macros.$list717), attributes);
        }
        if (html_macros.NIL != style) {
            assert html_macros.NIL != Types.atom(style) : style;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, style, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list718, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, style))), attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list719, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 86948L)
    public static SubLObject html_table_caption(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list720);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject align = (SubLObject)(current.isCons() ? current.first() : html_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list720);
        current = current.rest();
        if (html_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list720);
            return (SubLObject)html_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert html_macros.NIL != Types.atom(align) : align;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list721, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list722, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, align)))), reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 87354L)
    public static SubLObject html_fancy_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list723);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$23 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list723);
            current_$23 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list723);
            if (html_macros.NIL == conses_high.member(current_$23, (SubLObject)html_macros.$list724, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$23 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list723);
        }
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject noflow_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw725$NOFLOW, current);
        final SubLObject noflow = (SubLObject)((html_macros.NIL != noflow_tail) ? conses_high.cadr(noflow_tail) : html_macros.NIL);
        final SubLObject nowrap_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw726$NOWRAP, current);
        final SubLObject nowrap = (SubLObject)((html_macros.NIL != nowrap_tail) ? conses_high.cadr(nowrap_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject border_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw643$BORDER, current);
        final SubLObject border = (SubLObject)((html_macros.NIL != border_tail) ? conses_high.cadr(border_tail) : html_macros.NIL);
        final SubLObject bordercolor_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw727$BORDERCOLOR, current);
        final SubLObject bordercolor = (SubLObject)((html_macros.NIL != bordercolor_tail) ? conses_high.cadr(bordercolor_tail) : html_macros.NIL);
        final SubLObject cellpadding_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw728$CELLPADDING, current);
        final SubLObject cellpadding = (SubLObject)((html_macros.NIL != cellpadding_tail) ? conses_high.cadr(cellpadding_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject cellspacing_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw729$CELLSPACING, current);
        final SubLObject cellspacing = (SubLObject)((html_macros.NIL != cellspacing_tail) ? conses_high.cadr(cellspacing_tail) : html_macros.NIL);
        final SubLObject colspec_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw730$COLSPEC, current);
        final SubLObject colspec = (SubLObject)((html_macros.NIL != colspec_tail) ? conses_high.cadr(colspec_tail) : html_macros.NIL);
        final SubLObject units_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw731$UNITS, current);
        final SubLObject units = (SubLObject)((html_macros.NIL != units_tail) ? conses_high.cadr(units_tail) : html_macros.NIL);
        final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw732$BGCOLOR, current);
        final SubLObject bgcolor = (SubLObject)((html_macros.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : html_macros.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw595$WIDTH, current);
        final SubLObject width = (SubLObject)((html_macros.NIL != width_tail) ? conses_high.cadr(width_tail) : html_macros.NIL);
        final SubLObject background_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw733$BACKGROUND, current);
        final SubLObject background = (SubLObject)((html_macros.NIL != background_tail) ? conses_high.cadr(background_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != noflow) {
            assert html_macros.NIL != Types.atom(noflow) : noflow;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, noflow, (SubLObject)html_macros.$list734), attributes);
        }
        if (html_macros.NIL != nowrap) {
            assert html_macros.NIL != Types.atom(nowrap) : nowrap;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, nowrap, (SubLObject)html_macros.$list735), attributes);
        }
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list736, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, align)))), attributes);
        }
        if (html_macros.NIL != border) {
            assert html_macros.NIL != Types.atom(border) : border;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, border, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list737, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, border))), attributes);
        }
        if (html_macros.NIL != bordercolor) {
            assert html_macros.NIL != Types.atom(bordercolor) : bordercolor;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, bordercolor, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list738, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, bordercolor))), attributes);
        }
        if (html_macros.NIL != cellpadding) {
            assert html_macros.NIL != Types.atom(cellpadding) : cellpadding;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, cellpadding, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list739, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, cellpadding))), attributes);
        }
        if (html_macros.NIL != cellspacing) {
            assert html_macros.NIL != Types.atom(cellspacing) : cellspacing;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, cellspacing, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list740, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, cellspacing))), attributes);
        }
        if (html_macros.NIL != colspec) {
            assert html_macros.NIL != Types.atom(colspec) : colspec;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, colspec, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list741, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, colspec))), attributes);
        }
        if (html_macros.NIL != style) {
            assert html_macros.NIL != Types.atom(style) : style;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, style, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list742, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, style)))), attributes);
        }
        if (html_macros.NIL != units) {
            assert html_macros.NIL != Types.atom(units) : units;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, units, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list743, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, units))), attributes);
        }
        if (html_macros.NIL != bgcolor) {
            assert html_macros.NIL != Types.atom(bgcolor) : bgcolor;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, bgcolor, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list744, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, bgcolor))), attributes);
        }
        if (html_macros.NIL != width) {
            assert html_macros.NIL != Types.atom(width) : width;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, width, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list745, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, width))), attributes);
        }
        if (html_macros.NIL != background) {
            assert html_macros.NIL != Types.atom(width) : width;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, background, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list746, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, background))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list747, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 90392L)
    public static SubLObject html_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list748);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject border = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list748);
        border = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym749$HTML_FANCY_TABLE, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw643$BORDER, border), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list748);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 90497L)
    public static SubLObject html_fancy_table_data(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list750);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$24 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list750);
            current_$24 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list750);
            if (html_macros.NIL == conses_high.member(current_$24, (SubLObject)html_macros.$list751, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$24 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list750);
        }
        final SubLObject nowrap_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw726$NOWRAP, current);
        final SubLObject nowrap = (SubLObject)((html_macros.NIL != nowrap_tail) ? conses_high.cadr(nowrap_tail) : html_macros.NIL);
        final SubLObject colspan_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw752$COLSPAN, current);
        final SubLObject colspan = (SubLObject)((html_macros.NIL != colspan_tail) ? conses_high.cadr(colspan_tail) : html_macros.NIL);
        final SubLObject rowspan_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw753$ROWSPAN, current);
        final SubLObject rowspan = (SubLObject)((html_macros.NIL != rowspan_tail) ? conses_high.cadr(rowspan_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject valign_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw754$VALIGN, current);
        final SubLObject valign = (SubLObject)((html_macros.NIL != valign_tail) ? conses_high.cadr(valign_tail) : html_macros.NIL);
        final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw732$BGCOLOR, current);
        final SubLObject bgcolor = (SubLObject)((html_macros.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : html_macros.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw595$WIDTH, current);
        final SubLObject width = (SubLObject)((html_macros.NIL != width_tail) ? conses_high.cadr(width_tail) : html_macros.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw594$HEIGHT, current);
        final SubLObject height = (SubLObject)((html_macros.NIL != height_tail) ? conses_high.cadr(height_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject title_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw413$TITLE, current);
        final SubLObject title = (SubLObject)((html_macros.NIL != title_tail) ? conses_high.cadr(title_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != nowrap) {
            assert html_macros.NIL != Types.atom(nowrap) : nowrap;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, nowrap, (SubLObject)html_macros.$list755), attributes);
        }
        if (html_macros.NIL != colspan) {
            assert html_macros.NIL != Types.atom(colspan) : colspan;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, colspan, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list756, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, colspan))), attributes);
        }
        if (html_macros.NIL != rowspan) {
            assert html_macros.NIL != Types.atom(rowspan) : rowspan;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, rowspan, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list757, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, rowspan))), attributes);
        }
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list758, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, align)))), attributes);
        }
        if (html_macros.NIL != valign) {
            assert html_macros.NIL != Types.atom(valign) : valign;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, valign, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list759, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, valign)))), attributes);
        }
        if (html_macros.NIL != bgcolor) {
            assert html_macros.NIL != Types.atom(bgcolor) : bgcolor;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, bgcolor, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list760, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, bgcolor))), attributes);
        }
        if (html_macros.NIL != width) {
            assert html_macros.NIL != Types.atom(width) : width;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, width, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list761, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, width))), attributes);
        }
        if (html_macros.NIL != height) {
            assert html_macros.NIL != Types.atom(height) : height;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, height, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list762, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, height))), attributes);
        }
        if (html_macros.NIL != style) {
            assert html_macros.NIL != Types.atom(style) : style;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, style, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list742, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, style)))), attributes);
        }
        if (html_macros.NIL != title) {
            assert html_macros.NIL != Types.atom(title) : title;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, title, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list432, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, title))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list763, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 92986L)
    public static SubLObject html_table_data(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym764$HTML_FANCY_TABLE_DATA, (SubLObject)html_macros.NIL, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 93077L)
    public static SubLObject html_fancy_table_header(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list765);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$25 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list765);
            current_$25 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list765);
            if (html_macros.NIL == conses_high.member(current_$25, (SubLObject)html_macros.$list766, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$25 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list765);
        }
        final SubLObject nowrap_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw726$NOWRAP, current);
        final SubLObject nowrap = (SubLObject)((html_macros.NIL != nowrap_tail) ? conses_high.cadr(nowrap_tail) : html_macros.NIL);
        final SubLObject colspan_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw752$COLSPAN, current);
        final SubLObject colspan = (SubLObject)((html_macros.NIL != colspan_tail) ? conses_high.cadr(colspan_tail) : html_macros.NIL);
        final SubLObject rowspan_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw753$ROWSPAN, current);
        final SubLObject rowspan = (SubLObject)((html_macros.NIL != rowspan_tail) ? conses_high.cadr(rowspan_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject valign_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw754$VALIGN, current);
        final SubLObject valign = (SubLObject)((html_macros.NIL != valign_tail) ? conses_high.cadr(valign_tail) : html_macros.NIL);
        final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw732$BGCOLOR, current);
        final SubLObject bgcolor = (SubLObject)((html_macros.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : html_macros.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw595$WIDTH, current);
        final SubLObject width = (SubLObject)((html_macros.NIL != width_tail) ? conses_high.cadr(width_tail) : html_macros.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw594$HEIGHT, current);
        final SubLObject height = (SubLObject)((html_macros.NIL != height_tail) ? conses_high.cadr(height_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject title_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw413$TITLE, current);
        final SubLObject title = (SubLObject)((html_macros.NIL != title_tail) ? conses_high.cadr(title_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != nowrap) {
            assert html_macros.NIL != Types.atom(nowrap) : nowrap;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, nowrap, (SubLObject)html_macros.$list755), attributes);
        }
        if (html_macros.NIL != colspan) {
            assert html_macros.NIL != Types.atom(colspan) : colspan;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, colspan, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list756, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, colspan))), attributes);
        }
        if (html_macros.NIL != rowspan) {
            assert html_macros.NIL != Types.atom(rowspan) : rowspan;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, rowspan, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list757, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, rowspan))), attributes);
        }
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list758, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, align)))), attributes);
        }
        if (html_macros.NIL != valign) {
            assert html_macros.NIL != Types.atom(valign) : valign;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, valign, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list759, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, valign)))), attributes);
        }
        if (html_macros.NIL != bgcolor) {
            assert html_macros.NIL != Types.atom(bgcolor) : bgcolor;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, bgcolor, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list760, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, bgcolor))), attributes);
        }
        if (html_macros.NIL != width) {
            assert html_macros.NIL != Types.atom(width) : width;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, width, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list761, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, width))), attributes);
        }
        if (html_macros.NIL != height) {
            assert html_macros.NIL != Types.atom(height) : height;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, height, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list762, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, height))), attributes);
        }
        if (html_macros.NIL != title) {
            assert html_macros.NIL != Types.atom(title) : title;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, title, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list767, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, title)))), attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != style) {
            assert html_macros.NIL != Types.atom(style) : style;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, style, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list742, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, style)))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list768, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 95410L)
    public static SubLObject html_table_heading(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym769$HTML_FANCY_TABLE_HEADER, (SubLObject)html_macros.NIL, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 95507L)
    public static SubLObject html_table_header_block(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list770, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 95697L)
    public static SubLObject html_table_footer_block(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list771, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 95863L)
    public static SubLObject html_table_body_block(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list772, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 96027L)
    public static SubLObject html_fancy_table_row(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list773);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$26 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list773);
            current_$26 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list773);
            if (html_macros.NIL == conses_high.member(current_$26, (SubLObject)html_macros.$list774, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$26 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list773);
        }
        final SubLObject title_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw413$TITLE, current);
        final SubLObject title = (SubLObject)((html_macros.NIL != title_tail) ? conses_high.cadr(title_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject valign_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw754$VALIGN, current);
        final SubLObject valign = (SubLObject)((html_macros.NIL != valign_tail) ? conses_high.cadr(valign_tail) : html_macros.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw594$HEIGHT, current);
        final SubLObject height = (SubLObject)((html_macros.NIL != height_tail) ? conses_high.cadr(height_tail) : html_macros.NIL);
        final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw732$BGCOLOR, current);
        final SubLObject bgcolor = (SubLObject)((html_macros.NIL != bgcolor_tail) ? conses_high.cadr(bgcolor_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current);
        final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list758, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, align))), attributes);
        }
        if (html_macros.NIL != title) {
            assert html_macros.NIL != Types.atom(title) : title;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, title, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list767, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, title)))), attributes);
        }
        if (html_macros.NIL != name) {
            assert html_macros.NIL != Types.atom(name) : name;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, name, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list775, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, name)))), attributes);
        }
        if (html_macros.NIL != style) {
            assert html_macros.NIL != Types.atom(style) : style;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, style, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list742, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, style)))), attributes);
        }
        if (html_macros.NIL != valign) {
            assert html_macros.NIL != Types.atom(valign) : valign;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, valign, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list759, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, valign)))), attributes);
        }
        if (html_macros.NIL != height) {
            assert html_macros.NIL != Types.atom(height) : height;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, height, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list776, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, height))), attributes);
        }
        if (html_macros.NIL != bgcolor) {
            assert html_macros.NIL != Types.atom(bgcolor) : bgcolor;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, bgcolor, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list777, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, bgcolor))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list778, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL))))), (SubLObject)html_macros.$list395);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 98042L)
    public static SubLObject html_table_row(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym779$HTML_FANCY_TABLE_ROW, (SubLObject)html_macros.NIL, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 98313L)
    public static SubLObject html_indent_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list780);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject indent_width = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list780);
        indent_width = current.first();
        current = current.rest();
        final SubLObject max_indent = (SubLObject)(current.isCons() ? current.first() : html_macros.TWENTY_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list780);
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym749$HTML_FANCY_TABLE, (SubLObject)html_macros.$list781, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym782$_HTML_INDENT_TABLE_MAX_, max_indent)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym783$HTML_INDENT_TABLE_INTERNAL, indent_width)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list780);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 98805L)
    public static SubLObject html_indent_row(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list784);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject indent_amount = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list784);
        indent_amount = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject indent = (SubLObject)html_macros.$sym785$INDENT;
            final SubLObject span = (SubLObject)html_macros.$sym786$SPAN;
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(indent, indent_amount), (SubLObject)ConsesLow.list(span, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym787$MAX, (SubLObject)html_macros.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym788$_, (SubLObject)html_macros.$sym782$_HTML_INDENT_TABLE_MAX_, indent)))), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym789$HTML_TABLE_ROW, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym790$HTML_INDENT_ROW_INTERNAL, indent), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym764$HTML_FANCY_TABLE_DATA, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw752$COLSPAN, span), ConsesLow.append(body, (SubLObject)html_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list784);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 99170L)
    public static SubLObject html_indented_line(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list791);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject indent_amount = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list791);
        indent_amount = current.first();
        current = current.rest();
        final SubLObject newlineP = (SubLObject)(current.isCons() ? current.first() : html_macros.T);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list791);
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, newlineP, (SubLObject)html_macros.$list792), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym793$HTML_NO_BREAK, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym794$HTML_INDENT, indent_amount), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list791);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 99521L)
    public static SubLObject html_indented_line_inverse(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list791);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject indent_amount = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list791);
        indent_amount = current.first();
        current = current.rest();
        final SubLObject newlineP = (SubLObject)(current.isCons() ? current.first() : html_macros.T);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list791);
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym793$HTML_NO_BREAK, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym794$HTML_INDENT, indent_amount), ConsesLow.append(body, (SubLObject)html_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, newlineP, (SubLObject)html_macros.$list792));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list791);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 99881L)
    public static SubLObject cdolist_with_alternating_bgcolor(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list795);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)html_macros.NIL;
        SubLObject listform = (SubLObject)html_macros.NIL;
        SubLObject bgcolor_var = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list795);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list795);
        listform = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list795);
        bgcolor_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$27 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list795);
            current_$27 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list795);
            if (html_macros.NIL == conses_high.member(current_$27, (SubLObject)html_macros.$list796, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$27 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list795);
        }
        final SubLObject color1_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw797$COLOR1, current);
        final SubLObject color1 = (html_macros.NIL != color1_tail) ? conses_high.cadr(color1_tail) : html_macros.$html_color_light_grey$.getGlobalValue();
        final SubLObject color2_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw798$COLOR2, current);
        final SubLObject color2 = (html_macros.NIL != color2_tail) ? conses_high.cadr(color2_tail) : html_macros.$html_color_lighter_grey$.getGlobalValue();
        final SubLObject counter_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw799$COUNTER, current);
        final SubLObject counter = (SubLObject)((html_macros.NIL != counter_tail) ? conses_high.cadr(counter_tail) : html_macros.$sym800$IGNORE_ME);
        final SubLObject body;
        current = (body = temp);
        if (html_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !bgcolor_var.isSymbol()) {
            Errors.error((SubLObject)html_macros.$str801$Malformed_cdolist_with_alternatin, bgcolor_var);
        }
        final SubLObject color_toggle = (SubLObject)html_macros.$sym802$COLOR_TOGGLE;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(color_toggle, (SubLObject)html_macros.$list803)), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym804$CDOLIST_NUMBERED, (SubLObject)ConsesLow.list(var, counter, listform), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym612$PIF, color_toggle, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym805$CSETQ, color_toggle, (SubLObject)html_macros.$list803), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym805$CSETQ, color_toggle, (SubLObject)html_macros.$list806)), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym805$CSETQ, bgcolor_var, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym807$FIF, color_toggle, color2, color1)), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 101021L)
    public static SubLObject cdolist_with_cyc_logo_colors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list808);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)html_macros.NIL;
        SubLObject listform = (SubLObject)html_macros.NIL;
        SubLObject bgcolor_var = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list808);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list808);
        listform = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list808);
        bgcolor_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$28 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list808);
            current_$28 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list808);
            if (html_macros.NIL == conses_high.member(current_$28, (SubLObject)html_macros.$list809, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$28 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list808);
        }
        final SubLObject counter_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw799$COUNTER, current);
        final SubLObject counter = (SubLObject)((html_macros.NIL != counter_tail) ? conses_high.cadr(counter_tail) : html_macros.$sym800$IGNORE_ME);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym810$CDOLIST_WITH_ALTERNATING_BGCOLOR, (SubLObject)ConsesLow.list(new SubLObject[] { var, listform, bgcolor_var, html_macros.$kw797$COLOR1, html_macros.$sym811$_HTML_COLOR_CYC_LOGO_LIGHT_VIOLET_, html_macros.$kw798$COLOR2, html_macros.$sym812$_HTML_COLOR_CYC_LOGO_LIGHTER_VIOLET_, html_macros.$kw799$COUNTER, counter }), ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 101532L)
    public static SubLObject cdolist_with_cyc_background_colors(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list808);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)html_macros.NIL;
        SubLObject listform = (SubLObject)html_macros.NIL;
        SubLObject bgcolor_var = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list808);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list808);
        listform = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list808);
        bgcolor_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$29 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list808);
            current_$29 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list808);
            if (html_macros.NIL == conses_high.member(current_$29, (SubLObject)html_macros.$list809, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$29 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list808);
        }
        final SubLObject counter_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw799$COUNTER, current);
        final SubLObject counter = (SubLObject)((html_macros.NIL != counter_tail) ? conses_high.cadr(counter_tail) : html_macros.$sym800$IGNORE_ME);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym810$CDOLIST_WITH_ALTERNATING_BGCOLOR, (SubLObject)ConsesLow.list(new SubLObject[] { var, listform, bgcolor_var, html_macros.$kw797$COLOR1, html_macros.$sym813$_HTML_COLOR_CYC_LOGO_LIGHT_BLUE_, html_macros.$kw798$COLOR2, html_macros.$sym814$_HTML_COLOR_CYC_LOGO_LIGHTER_BLUE_, html_macros.$kw799$COUNTER, counter }), ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 102054L)
    public static SubLObject cdolist_with_alternating_variable(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list815);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)html_macros.NIL;
        SubLObject listform = (SubLObject)html_macros.NIL;
        SubLObject alternator_var = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list815);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list815);
        listform = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list815);
        alternator_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$30 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list815);
            current_$30 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list815);
            if (html_macros.NIL == conses_high.member(current_$30, (SubLObject)html_macros.$list816, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$30 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list815);
        }
        final SubLObject alternative1_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw817$ALTERNATIVE1, current);
        final SubLObject alternative1 = (html_macros.NIL != alternative1_tail) ? conses_high.cadr(alternative1_tail) : html_macros.$html_alternating_class1$.getDynamicValue(thread);
        final SubLObject alternative2_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw818$ALTERNATIVE2, current);
        final SubLObject alternative2 = (html_macros.NIL != alternative2_tail) ? conses_high.cadr(alternative2_tail) : html_macros.$html_alternating_class2$.getDynamicValue(thread);
        final SubLObject counter_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw799$COUNTER, current);
        final SubLObject counter = (SubLObject)((html_macros.NIL != counter_tail) ? conses_high.cadr(counter_tail) : html_macros.$sym800$IGNORE_ME);
        final SubLObject body;
        current = (body = temp);
        if (html_macros.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !alternator_var.isSymbol()) {
            Errors.error((SubLObject)html_macros.$str819$Malformed_cdolist_with_alternatin, alternator_var);
        }
        final SubLObject alternator_toggle = (SubLObject)html_macros.$sym820$ALTERNATOR_TOGGLE;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(alternator_toggle, (SubLObject)html_macros.$list803)), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym804$CDOLIST_NUMBERED, (SubLObject)ConsesLow.list(var, counter, listform), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym612$PIF, alternator_toggle, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym805$CSETQ, alternator_toggle, (SubLObject)html_macros.$list803), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym805$CSETQ, alternator_toggle, (SubLObject)html_macros.$list806)), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym805$CSETQ, alternator_var, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym807$FIF, alternator_toggle, alternative2, alternative1)), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 102950L)
    public static SubLObject cdolist_with_alternating_classes(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list821);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)html_macros.NIL;
        SubLObject listform = (SubLObject)html_macros.NIL;
        SubLObject class_var = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list821);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list821);
        listform = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list821);
        class_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$31 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list821);
            current_$31 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list821);
            if (html_macros.NIL == conses_high.member(current_$31, (SubLObject)html_macros.$list822, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$31 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list821);
        }
        final SubLObject counter_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw799$COUNTER, current);
        final SubLObject counter = (SubLObject)((html_macros.NIL != counter_tail) ? conses_high.cadr(counter_tail) : html_macros.$sym800$IGNORE_ME);
        final SubLObject class1_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw823$CLASS1, current);
        final SubLObject class1 = (html_macros.NIL != class1_tail) ? conses_high.cadr(class1_tail) : html_macros.$html_alternating_class1$.getDynamicValue(thread);
        final SubLObject class2_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw824$CLASS2, current);
        final SubLObject class2 = (html_macros.NIL != class2_tail) ? conses_high.cadr(class2_tail) : html_macros.$html_alternating_class2$.getDynamicValue(thread);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym825$CDOLIST_WITH_ALTERNATING_VARIABLE, (SubLObject)ConsesLow.list(new SubLObject[] { var, listform, class_var, html_macros.$kw817$ALTERNATIVE1, class1, html_macros.$kw818$ALTERNATIVE2, class2, html_macros.$kw799$COUNTER, counter }), ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 103496L)
    public static SubLObject switch_cyc_logo_color(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list826);
        var = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym805$CSETQ, var, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym807$FIF, (SubLObject)ConsesLow.listS((SubLObject)html_macros.EQUAL, var, (SubLObject)html_macros.$list827), (SubLObject)html_macros.$list828));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list826);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 103705L)
    public static SubLObject html_fancy_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list829);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$32 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list829);
            current_$32 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list829);
            if (html_macros.NIL == conses_high.member(current_$32, (SubLObject)html_macros.$list830, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$32 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list829);
        }
        final SubLObject href_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw456$HREF, current);
        final SubLObject href = (SubLObject)((html_macros.NIL != href_tail) ? conses_high.cadr(href_tail) : html_macros.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current);
        final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
        final SubLObject title_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw413$TITLE, current);
        final SubLObject title = (SubLObject)((html_macros.NIL != title_tail) ? conses_high.cadr(title_tail) : html_macros.NIL);
        final SubLObject target_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw831$TARGET, current);
        final SubLObject target = (SubLObject)((html_macros.NIL != target_tail) ? conses_high.cadr(target_tail) : html_macros.NIL);
        final SubLObject script_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw370$SCRIPT, current);
        final SubLObject script = (SubLObject)((html_macros.NIL != script_tail) ? conses_high.cadr(script_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject onmouseover_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw696$ONMOUSEOVER, current);
        final SubLObject onmouseover = (SubLObject)((html_macros.NIL != onmouseover_tail) ? conses_high.cadr(onmouseover_tail) : html_macros.NIL);
        final SubLObject onmouseout_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw697$ONMOUSEOUT, current);
        final SubLObject onmouseout = (SubLObject)((html_macros.NIL != onmouseout_tail) ? conses_high.cadr(onmouseout_tail) : html_macros.NIL);
        final SubLObject onmousedown_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw832$ONMOUSEDOWN, current);
        final SubLObject onmousedown = (SubLObject)((html_macros.NIL != onmousedown_tail) ? conses_high.cadr(onmousedown_tail) : html_macros.NIL);
        final SubLObject onmouseup_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw833$ONMOUSEUP, current);
        final SubLObject onmouseup = (SubLObject)((html_macros.NIL != onmouseup_tail) ? conses_high.cadr(onmouseup_tail) : html_macros.NIL);
        final SubLObject onclick_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw430$ONCLICK, current);
        final SubLObject onclick = (SubLObject)((html_macros.NIL != onclick_tail) ? conses_high.cadr(onclick_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject attrs_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw834$ATTRS, current);
        final SubLObject attrs = (SubLObject)((html_macros.NIL != attrs_tail) ? conses_high.cadr(attrs_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != href) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list835, (SubLObject)(href.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, href) : href)), attributes);
        }
        if (html_macros.NIL != name) {
            assert html_macros.NIL != Types.atom(name) : name;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, name, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list836, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name))), attributes);
        }
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list837, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != title) {
            assert html_macros.NIL != Types.atom(title) : title;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, title, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list838, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, title))), attributes);
        }
        if (html_macros.NIL != target) {
            assert html_macros.NIL != Types.atom(target) : target;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, target, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list839, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, target))), attributes);
        }
        if (html_macros.NIL != style) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list840, (SubLObject)(style.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, style) : style)), attributes);
        }
        if (html_macros.NIL != onmouseover) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list701, (SubLObject)(onmouseover.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onmouseover) : onmouseover)), attributes);
        }
        if (html_macros.NIL != onmouseup) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list841, (SubLObject)(onmouseup.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onmouseup) : onmouseup)), attributes);
        }
        if (html_macros.NIL != onmousedown) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list842, (SubLObject)(onmousedown.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onmousedown) : onmousedown)), attributes);
        }
        if (html_macros.NIL != onmouseout) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list700, (SubLObject)(onmouseout.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onmouseout) : onmouseout)), attributes);
        }
        if (html_macros.NIL != onclick) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list431, (SubLObject)(onclick.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, onclick) : onclick)), attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != script) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list388, (SubLObject)(script.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, script) : script)), attributes);
        }
        if (html_macros.NIL != attrs) {
            SubLObject cdolist_list_var = attrs;
            SubLObject attr = (SubLObject)html_macros.NIL;
            attr = cdolist_list_var.first();
            while (html_macros.NIL != cdolist_list_var) {
                final SubLObject attr_name = attr.first();
                final SubLObject attr_value = conses_high.second(attr);
                attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)ConsesLow.list(Sequences.cconcatenate((SubLObject)html_macros.$str843$_, new SubLObject[] { format_nil.format_nil_a_no_copy(attr_name), html_macros.$str844$_ })), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, attr_value)), attributes);
                cdolist_list_var = cdolist_list_var.rest();
                attr = cdolist_list_var.first();
            }
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list845, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 106795L)
    public static SubLObject html_script_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list846);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject linktext = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list846);
        linktext = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$33 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list846);
            current_$33 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list846);
            if (html_macros.NIL == conses_high.member(current_$33, (SubLObject)html_macros.$list847, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$33 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list846);
        }
        final SubLObject href_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw456$HREF, current);
        final SubLObject href = (SubLObject)((html_macros.NIL != href_tail) ? conses_high.cadr(href_tail) : html_macros.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current);
        final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
        final SubLObject target_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw831$TARGET, current);
        final SubLObject target = (SubLObject)((html_macros.NIL != target_tail) ? conses_high.cadr(target_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym848$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list(new SubLObject[] { html_macros.$kw456$HREF, href, html_macros.$kw440$NAME, name, html_macros.$kw831$TARGET, target, html_macros.$kw373$STYLE, style, html_macros.$kw365$CLASS, v_class, html_macros.$kw370$SCRIPT, reader.bq_cons((SubLObject)html_macros.$sym350$PROGN, ConsesLow.append(body, (SubLObject)html_macros.NIL)) }), (SubLObject)(linktext.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, linktext) : linktext));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 107093L)
    public static SubLObject html_target_reference(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list849);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list849);
        name = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym848$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw456$HREF, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list850, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name))), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list849);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 107416L)
    public static SubLObject html_mailto_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list851);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject address = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list851);
        address = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym848$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw456$HREF, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym852$HTML_MAILTO_URL, address)), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list851);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 107646L)
    public static SubLObject html_file_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list853);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject filename = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list853);
        filename = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym848$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw456$HREF, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym854$HTML_FILE_URL, filename)), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list853);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 107873L)
    public static SubLObject html_fancy_area(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$34 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list855);
            current_$34 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list855);
            if (html_macros.NIL == conses_high.member(current_$34, (SubLObject)html_macros.$list856, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$34 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list855);
        }
        final SubLObject nohref_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw857$NOHREF, current);
        final SubLObject nohref = (SubLObject)((html_macros.NIL != nohref_tail) ? conses_high.cadr(nohref_tail) : html_macros.NIL);
        final SubLObject href_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw456$HREF, current);
        final SubLObject href = (SubLObject)((html_macros.NIL != href_tail) ? conses_high.cadr(href_tail) : html_macros.NIL);
        final SubLObject alt_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw593$ALT, current);
        final SubLObject alt = (SubLObject)((html_macros.NIL != alt_tail) ? conses_high.cadr(alt_tail) : html_macros.NIL);
        final SubLObject target_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw831$TARGET, current);
        final SubLObject target = (SubLObject)((html_macros.NIL != target_tail) ? conses_high.cadr(target_tail) : html_macros.NIL);
        final SubLObject shape_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw858$SHAPE, current);
        final SubLObject shape = (SubLObject)((html_macros.NIL != shape_tail) ? conses_high.cadr(shape_tail) : html_macros.NIL);
        final SubLObject co_ords_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw859$CO_ORDS, current);
        final SubLObject co_ords = (SubLObject)((html_macros.NIL != co_ords_tail) ? conses_high.cadr(co_ords_tail) : html_macros.NIL);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != nohref) {
            assert html_macros.NIL != Types.atom(nohref) : nohref;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, nohref, (SubLObject)html_macros.$list860), attributes);
        }
        if (html_macros.NIL != href) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list861, (SubLObject)(href.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, href) : href)), attributes);
        }
        if (html_macros.NIL != alt) {
            assert html_macros.NIL != Types.atom(alt) : alt;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, alt, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list862, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, alt))), attributes);
        }
        if (html_macros.NIL != target) {
            assert html_macros.NIL != Types.atom(target) : target;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, target, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list863, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, target))), attributes);
        }
        if (html_macros.NIL != shape) {
            assert html_macros.NIL != Types.atom(shape) : shape;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, shape, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list864, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, shape))), attributes);
        }
        if (html_macros.NIL != co_ords) {
            assert html_macros.NIL != Types.atom(co_ords) : co_ords;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, co_ords, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list865, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, co_ords))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list866, ConsesLow.append(attributes, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 109094L)
    public static SubLObject html_blink(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list867, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 109430L)
    public static SubLObject html_comment(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list868, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)html_macros.$list358, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 109784L)
    public static SubLObject html_fancy_frame(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list869);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$35 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list869);
            current_$35 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list869);
            if (html_macros.NIL == conses_high.member(current_$35, (SubLObject)html_macros.$list870, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$35 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list869);
        }
        final SubLObject frameborder_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw871$FRAMEBORDER, current);
        final SubLObject frameborder = (SubLObject)((html_macros.NIL != frameborder_tail) ? conses_high.cadr(frameborder_tail) : html_macros.NIL);
        final SubLObject noresize_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw872$NORESIZE, current);
        final SubLObject noresize = (SubLObject)((html_macros.NIL != noresize_tail) ? conses_high.cadr(noresize_tail) : html_macros.NIL);
        final SubLObject src_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw566$SRC, current);
        final SubLObject src = (SubLObject)((html_macros.NIL != src_tail) ? conses_high.cadr(src_tail) : html_macros.NIL);
        final SubLObject scrolling_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw873$SCROLLING, current);
        final SubLObject scrolling = (SubLObject)((html_macros.NIL != scrolling_tail) ? conses_high.cadr(scrolling_tail) : html_macros.NIL);
        final SubLObject marginheight_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw874$MARGINHEIGHT, current);
        final SubLObject marginheight = (SubLObject)((html_macros.NIL != marginheight_tail) ? conses_high.cadr(marginheight_tail) : html_macros.NIL);
        final SubLObject marginwidth_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw875$MARGINWIDTH, current);
        final SubLObject marginwidth = (SubLObject)((html_macros.NIL != marginwidth_tail) ? conses_high.cadr(marginwidth_tail) : html_macros.NIL);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        assert html_macros.NIL != Types.atom(name) : name;
        attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list876, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name)), attributes);
        if (html_macros.NIL != frameborder) {
            assert html_macros.NIL != Types.atom(frameborder) : frameborder;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, frameborder, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list877, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, frameborder))), attributes);
        }
        if (html_macros.NIL != noresize) {
            assert html_macros.NIL != Types.atom(noresize) : noresize;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, noresize, (SubLObject)html_macros.$list878), attributes);
        }
        if (html_macros.NIL != src) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list879, (SubLObject)(src.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, src) : src)), attributes);
        }
        if (html_macros.NIL != scrolling) {
            assert html_macros.NIL != Types.atom(scrolling) : scrolling;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, scrolling, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list880, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, scrolling))), attributes);
        }
        if (html_macros.NIL != marginheight) {
            assert html_macros.NIL != Types.atom(marginheight) : marginheight;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, marginheight, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list881, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, marginheight))), attributes);
        }
        if (html_macros.NIL != marginwidth) {
            assert html_macros.NIL != Types.atom(marginwidth) : marginwidth;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, marginwidth, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list882, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, marginwidth))), attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list393, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list883, ConsesLow.append(attributes, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 111336L)
    public static SubLObject html_frame(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list869);
        name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$36 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list869);
            current_$36 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list869);
            if (html_macros.NIL == conses_high.member(current_$36, (SubLObject)html_macros.$list870, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$36 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list869);
        }
        final SubLObject frameborder_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw871$FRAMEBORDER, current);
        final SubLObject frameborder = (SubLObject)((html_macros.NIL != frameborder_tail) ? conses_high.cadr(frameborder_tail) : html_macros.NIL);
        final SubLObject noresize_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw872$NORESIZE, current);
        final SubLObject noresize = (SubLObject)((html_macros.NIL != noresize_tail) ? conses_high.cadr(noresize_tail) : html_macros.NIL);
        final SubLObject src_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw566$SRC, current);
        final SubLObject src = (SubLObject)((html_macros.NIL != src_tail) ? conses_high.cadr(src_tail) : html_macros.NIL);
        final SubLObject scrolling_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw873$SCROLLING, current);
        final SubLObject scrolling = (SubLObject)((html_macros.NIL != scrolling_tail) ? conses_high.cadr(scrolling_tail) : html_macros.NIL);
        final SubLObject marginheight_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw874$MARGINHEIGHT, current);
        final SubLObject marginheight = (SubLObject)((html_macros.NIL != marginheight_tail) ? conses_high.cadr(marginheight_tail) : html_macros.NIL);
        final SubLObject marginwidth_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw875$MARGINWIDTH, current);
        final SubLObject marginwidth = (SubLObject)((html_macros.NIL != marginwidth_tail) ? conses_high.cadr(marginwidth_tail) : html_macros.NIL);
        return (SubLObject)ConsesLow.list(new SubLObject[] { html_macros.$sym884$HTML_FANCY_FRAME, name, html_macros.$kw871$FRAMEBORDER, frameborder, html_macros.$kw872$NORESIZE, noresize, html_macros.$kw566$SRC, src, html_macros.$kw873$SCROLLING, scrolling, html_macros.$kw874$MARGINHEIGHT, marginheight, html_macros.$kw875$MARGINWIDTH, marginwidth });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 111610L)
    public static SubLObject html_fancy_frameset(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list885);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$37 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list885);
            current_$37 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list885);
            if (html_macros.NIL == conses_high.member(current_$37, (SubLObject)html_macros.$list886, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$37 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list885);
        }
        final SubLObject cols_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw710$COLS, current);
        final SubLObject cols = (SubLObject)((html_macros.NIL != cols_tail) ? conses_high.cadr(cols_tail) : html_macros.NIL);
        final SubLObject rows_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw711$ROWS, current);
        final SubLObject rows = (SubLObject)((html_macros.NIL != rows_tail) ? conses_high.cadr(rows_tail) : html_macros.NIL);
        final SubLObject frameborder_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw871$FRAMEBORDER, current);
        final SubLObject frameborder = (SubLObject)((html_macros.NIL != frameborder_tail) ? conses_high.cadr(frameborder_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != cols) {
            assert html_macros.NIL != Types.atom(cols) : cols;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, cols, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list887, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, cols))), attributes);
        }
        if (html_macros.NIL != rows) {
            assert html_macros.NIL != Types.atom(rows) : rows;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, rows, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list888, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, rows))), attributes);
        }
        if (html_macros.NIL != frameborder) {
            assert html_macros.NIL != Types.atom(frameborder) : frameborder;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, frameborder, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list889, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, frameborder))), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list890, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list891, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL))))), (SubLObject)html_macros.$list395);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 112613L)
    public static SubLObject html_frameset(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list885);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$38 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list885);
            current_$38 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list885);
            if (html_macros.NIL == conses_high.member(current_$38, (SubLObject)html_macros.$list886, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$38 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list885);
        }
        final SubLObject cols_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw710$COLS, current);
        final SubLObject cols = (SubLObject)((html_macros.NIL != cols_tail) ? conses_high.cadr(cols_tail) : html_macros.NIL);
        final SubLObject rows_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw711$ROWS, current);
        final SubLObject rows = (SubLObject)((html_macros.NIL != rows_tail) ? conses_high.cadr(rows_tail) : html_macros.NIL);
        final SubLObject frameborder_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw871$FRAMEBORDER, current);
        final SubLObject frameborder = (SubLObject)((html_macros.NIL != frameborder_tail) ? conses_high.cadr(frameborder_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym892$HTML_FANCY_FRAMESET, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw710$COLS, cols, (SubLObject)html_macros.$kw711$ROWS, rows, (SubLObject)html_macros.$kw871$FRAMEBORDER, frameborder), ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 112778L)
    public static SubLObject html_fancy_iframe(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list893);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$39 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list893);
            current_$39 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list893);
            if (html_macros.NIL == conses_high.member(current_$39, (SubLObject)html_macros.$list894, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$39 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list893);
        }
        final SubLObject src_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw566$SRC, current);
        final SubLObject src = (SubLObject)((html_macros.NIL != src_tail) ? conses_high.cadr(src_tail) : html_macros.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current);
        final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw595$WIDTH, current);
        final SubLObject width = (SubLObject)((html_macros.NIL != width_tail) ? conses_high.cadr(width_tail) : html_macros.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw594$HEIGHT, current);
        final SubLObject height = (SubLObject)((html_macros.NIL != height_tail) ? conses_high.cadr(height_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject frameborder_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw871$FRAMEBORDER, current);
        final SubLObject frameborder = (SubLObject)((html_macros.NIL != frameborder_tail) ? conses_high.cadr(frameborder_tail) : html_macros.NIL);
        final SubLObject marginwidth_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw875$MARGINWIDTH, current);
        final SubLObject marginwidth = (SubLObject)((html_macros.NIL != marginwidth_tail) ? conses_high.cadr(marginwidth_tail) : html_macros.NIL);
        final SubLObject marginheight_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw874$MARGINHEIGHT, current);
        final SubLObject marginheight = (SubLObject)((html_macros.NIL != marginheight_tail) ? conses_high.cadr(marginheight_tail) : html_macros.NIL);
        final SubLObject scrolling_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw873$SCROLLING, current);
        final SubLObject scrolling = (SubLObject)((html_macros.NIL != scrolling_tail) ? conses_high.cadr(scrolling_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != src) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list895, (SubLObject)(src.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, src) : src)), attributes);
        }
        if (html_macros.NIL != name) {
            assert html_macros.NIL != Types.atom(name) : name;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list896, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name)), attributes);
        }
        if (html_macros.NIL != width) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list897, (SubLObject)(width.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, width) : src)), attributes);
        }
        if (html_macros.NIL != height) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list898, (SubLObject)(height.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, height) : src)), attributes);
        }
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list899, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, align)))), attributes);
        }
        if (html_macros.NIL != frameborder) {
            assert html_macros.NIL != Types.atom(frameborder) : frameborder;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, frameborder, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list900, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, frameborder))), attributes);
        }
        if (html_macros.NIL != marginwidth) {
            assert html_macros.NIL != Types.atom(marginwidth) : marginwidth;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, marginwidth, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list901, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, marginwidth))), attributes);
        }
        if (html_macros.NIL != marginheight) {
            assert html_macros.NIL != Types.atom(marginheight) : marginheight;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, marginheight, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list902, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, marginheight))), attributes);
        }
        if (html_macros.NIL != scrolling) {
            assert html_macros.NIL != Types.atom(scrolling) : scrolling;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, scrolling, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list903, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, scrolling))), attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list393, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list904, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 114748L)
    public static SubLObject html_fancy_image(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject src = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list905);
        src = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$40 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list905);
            current_$40 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list905);
            if (html_macros.NIL == conses_high.member(current_$40, (SubLObject)html_macros.$list906, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$40 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list905);
        }
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current);
        final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject ismap_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw907$ISMAP, current);
        final SubLObject ismap = (SubLObject)((html_macros.NIL != ismap_tail) ? conses_high.cadr(ismap_tail) : html_macros.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw594$HEIGHT, current);
        final SubLObject height = (SubLObject)((html_macros.NIL != height_tail) ? conses_high.cadr(height_tail) : html_macros.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw595$WIDTH, current);
        final SubLObject width = (SubLObject)((html_macros.NIL != width_tail) ? conses_high.cadr(width_tail) : html_macros.NIL);
        final SubLObject alt_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw593$ALT, current);
        final SubLObject alt = (SubLObject)((html_macros.NIL != alt_tail) ? conses_high.cadr(alt_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject border_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw643$BORDER, current);
        final SubLObject border = (SubLObject)((html_macros.NIL != border_tail) ? conses_high.cadr(border_tail) : html_macros.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw373$STYLE, current);
        final SubLObject style = (SubLObject)((html_macros.NIL != style_tail) ? conses_high.cadr(style_tail) : html_macros.NIL);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list908, (SubLObject)(src.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, src) : src)), attributes);
        if (html_macros.NIL != name) {
            assert html_macros.NIL != Types.atom(name) : name;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, name, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list909, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name))), attributes);
        }
        if (html_macros.NIL != id) {
            assert html_macros.NIL != Types.atom(id) : id;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list415, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id))), attributes);
        }
        if (html_macros.NIL != v_class) {
            assert html_macros.NIL != Types.atom(v_class) : v_class;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, v_class, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list416, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class))), attributes);
        }
        if (html_macros.NIL != ismap) {
            assert html_macros.NIL != Types.atom(ismap) : ismap;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym379$PWHEN, ismap, (SubLObject)html_macros.$list910), attributes);
        }
        if (html_macros.NIL != height) {
            assert html_macros.NIL != Types.atom(height) : height;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, height, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list911, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, height))), attributes);
        }
        if (html_macros.NIL != width) {
            assert html_macros.NIL != Types.atom(width) : width;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, width, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list912, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, width))), attributes);
        }
        if (html_macros.NIL != alt) {
            assert html_macros.NIL != Types.atom(alt) : alt;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, alt, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list913, (SubLObject)(alt.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, alt) : alt))), attributes);
        }
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list914, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, align)))), attributes);
        }
        if (html_macros.NIL != border) {
            assert html_macros.NIL != Types.atom(border) : border;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, border, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list915, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, border))), attributes);
        }
        if (html_macros.NIL != style) {
            assert html_macros.NIL != Types.atom(style) : style;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, style, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list916, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, style))), attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list917, ConsesLow.append(attributes, (SubLObject)html_macros.$list918));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 117028L)
    public static SubLObject html_embedded_image(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filename = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list919);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$41 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list919);
            current_$41 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list919);
            if (html_macros.NIL == conses_high.member(current_$41, (SubLObject)html_macros.$list920, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$41 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list919);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw455$TYPE, current);
        final SubLObject type = (SubLObject)((html_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : html_macros.NIL);
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current);
        final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject ismap_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw907$ISMAP, current);
        final SubLObject ismap = (SubLObject)((html_macros.NIL != ismap_tail) ? conses_high.cadr(ismap_tail) : html_macros.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw594$HEIGHT, current);
        final SubLObject height = (SubLObject)((html_macros.NIL != height_tail) ? conses_high.cadr(height_tail) : html_macros.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw595$WIDTH, current);
        final SubLObject width = (SubLObject)((html_macros.NIL != width_tail) ? conses_high.cadr(width_tail) : html_macros.NIL);
        final SubLObject alt_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw593$ALT, current);
        final SubLObject alt = (SubLObject)((html_macros.NIL != alt_tail) ? conses_high.cadr(alt_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject border_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw643$BORDER, current);
        final SubLObject border = (SubLObject)((html_macros.NIL != border_tail) ? conses_high.cadr(border_tail) : html_macros.NIL);
        final SubLObject data_src = (SubLObject)html_macros.$sym921$DATA_SRC;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(data_src, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym922$HTML_EMBEDDED_IMAGE_DATA_SRC, filename, type))), (SubLObject)ConsesLow.list(new SubLObject[] { html_macros.$sym923$HTML_FANCY_IMAGE, data_src, html_macros.$kw440$NAME, name, html_macros.$kw411$ID, id, html_macros.$kw365$CLASS, v_class, html_macros.$kw907$ISMAP, ismap, html_macros.$kw594$HEIGHT, height, html_macros.$kw595$WIDTH, width, html_macros.$kw593$ALT, alt, html_macros.$kw412$ALIGN, align, html_macros.$kw643$BORDER, border }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 117459L)
    public static SubLObject html_embedded_image_data_src(final SubLObject filename, SubLObject type) {
        if (type == html_macros.UNPROVIDED) {
            type = (SubLObject)html_macros.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mime_type = http_kernel.html_determine_mime_type(filename, type);
        SubLObject result = (SubLObject)html_macros.NIL;
        thread.resetMultipleValues();
        final SubLObject base64_string = html_base64_string_for_file(filename);
        final SubLObject pad_chars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject stream = (SubLObject)html_macros.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            PrintLow.format(stream, (SubLObject)html_macros.$str925$data__A_base64_, mime_type);
            final SubLObject string_var = base64_string;
            SubLObject end_var_$42;
            SubLObject end_var;
            SubLObject index;
            SubLObject v_char;
            for (end_var = (end_var_$42 = Sequences.length(string_var)), index = (SubLObject)html_macros.NIL, index = (SubLObject)html_macros.ZERO_INTEGER; !index.numGE(end_var_$42); index = number_utilities.f_1X(index)) {
                v_char = Strings.sublisp_char(string_var, index);
                if (Numbers.mod(index, (SubLObject)html_macros.$int926$76).isZero()) {
                    streams_high.terpri(stream);
                }
                streams_high.write_char(v_char, stream);
            }
            SubLObject i;
            for (i = (SubLObject)html_macros.NIL, i = (SubLObject)html_macros.ZERO_INTEGER; i.numL(pad_chars); i = Numbers.add(i, (SubLObject)html_macros.ONE_INTEGER)) {
                streams_high.write_char((SubLObject)Characters.CHAR_equal, stream);
            }
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)html_macros.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)html_macros.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 118022L)
    public static SubLObject html_base64_string_for_file(final SubLObject filename) {
        final SubLObject byte_vector = vector_utilities.new_byte_vector_from_file(filename);
        final SubLObject base64_string = vector_utilities.byte_vector_to_64_bit_char_string(byte_vector);
        final SubLObject pad_chars = Numbers.mod(Numbers.min((SubLObject)html_macros.FOUR_INTEGER, Numbers.subtract((SubLObject)html_macros.FOUR_INTEGER, Numbers.mod(Sequences.length(base64_string), (SubLObject)html_macros.FOUR_INTEGER))), (SubLObject)html_macros.FOUR_INTEGER);
        Sequences.nsubstitute((SubLObject)Characters.CHAR_slash, (SubLObject)Characters.CHAR_underbar, base64_string, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED);
        Sequences.nsubstitute((SubLObject)Characters.CHAR_plus, (SubLObject)Characters.CHAR_hyphen, base64_string, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED);
        return Values.values(base64_string, pad_chars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 118397L)
    public static SubLObject html_fancy_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list849);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list849);
        name = current.first();
        current = current.rest();
        if (html_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list849);
            return (SubLObject)html_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert html_macros.NIL != Types.atom(name) : name;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list927, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list928, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, name)), reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 118816L)
    public static SubLObject html_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list849);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list849);
        name = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym929$HTML_FANCY_MAP, (SubLObject)ConsesLow.list(name), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list849);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 118905L)
    public static SubLObject html_no_break(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list930, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 119171L)
    public static SubLObject html_no_frames(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list931, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 119444L)
    public static SubLObject html_object(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list932);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$43 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list932);
            current_$43 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list932);
            if (html_macros.NIL == conses_high.member(current_$43, (SubLObject)html_macros.$list933, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$43 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list932);
        }
        final SubLObject classid_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw934$CLASSID, current);
        final SubLObject classid = (SubLObject)((html_macros.NIL != classid_tail) ? conses_high.cadr(classid_tail) : html_macros.NIL);
        final SubLObject codebase_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw591$CODEBASE, current);
        final SubLObject codebase = (SubLObject)((html_macros.NIL != codebase_tail) ? conses_high.cadr(codebase_tail) : html_macros.NIL);
        final SubLObject codetype_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw935$CODETYPE, current);
        final SubLObject codetype = (SubLObject)((html_macros.NIL != codetype_tail) ? conses_high.cadr(codetype_tail) : html_macros.NIL);
        final SubLObject data_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw936$DATA, current);
        final SubLObject data = (SubLObject)((html_macros.NIL != data_tail) ? conses_high.cadr(data_tail) : html_macros.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw455$TYPE, current);
        final SubLObject type = (SubLObject)((html_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : html_macros.NIL);
        final SubLObject archive_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw592$ARCHIVE, current);
        final SubLObject archive = (SubLObject)((html_macros.NIL != archive_tail) ? conses_high.cadr(archive_tail) : html_macros.NIL);
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw411$ID, current);
        final SubLObject id = (SubLObject)((html_macros.NIL != id_tail) ? conses_high.cadr(id_tail) : html_macros.NIL);
        final SubLObject class_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw365$CLASS, current);
        final SubLObject v_class = (SubLObject)((html_macros.NIL != class_tail) ? conses_high.cadr(class_tail) : html_macros.NIL);
        final SubLObject align_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw412$ALIGN, current);
        final SubLObject align = (SubLObject)((html_macros.NIL != align_tail) ? conses_high.cadr(align_tail) : html_macros.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw595$WIDTH, current);
        final SubLObject width = (SubLObject)((html_macros.NIL != width_tail) ? conses_high.cadr(width_tail) : html_macros.NIL);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw594$HEIGHT, current);
        final SubLObject height = (SubLObject)((html_macros.NIL != height_tail) ? conses_high.cadr(height_tail) : html_macros.NIL);
        final SubLObject border_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw643$BORDER, current);
        final SubLObject border = (SubLObject)((html_macros.NIL != border_tail) ? conses_high.cadr(border_tail) : html_macros.NIL);
        final SubLObject hspace_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw937$HSPACE, current);
        final SubLObject hspace = (SubLObject)((html_macros.NIL != hspace_tail) ? conses_high.cadr(hspace_tail) : html_macros.NIL);
        final SubLObject vspace_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw938$VSPACE, current);
        final SubLObject vspace = (SubLObject)((html_macros.NIL != vspace_tail) ? conses_high.cadr(vspace_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        if (html_macros.NIL != classid) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list939, (SubLObject)(classid.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, classid) : classid)), attributes);
        }
        if (html_macros.NIL != codebase) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list940, (SubLObject)(codebase.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, codebase) : codebase)), attributes);
        }
        if (html_macros.NIL != codetype) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list941, (SubLObject)(codetype.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, codetype) : codetype)), attributes);
        }
        if (html_macros.NIL != data) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list942, (SubLObject)(data.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, data) : data)), attributes);
        }
        if (html_macros.NIL != type) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list943, (SubLObject)(type.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, type) : type)), attributes);
        }
        if (html_macros.NIL != archive) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list944, (SubLObject)(archive.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, archive) : archive)), attributes);
        }
        if (html_macros.NIL != id) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list945, (SubLObject)(id.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, id) : id)), attributes);
        }
        if (html_macros.NIL != v_class) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list946, (SubLObject)(v_class.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, v_class) : v_class)), attributes);
        }
        if (html_macros.NIL != align) {
            assert html_macros.NIL != Types.atom(align) : align;
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, align, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list947, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym601$HTML_ALIGN, align)))), attributes);
        }
        if (html_macros.NIL != width) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list948, (SubLObject)(width.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, width) : width)), attributes);
        }
        if (html_macros.NIL != height) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list949, (SubLObject)(height.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, height) : height)), attributes);
        }
        if (html_macros.NIL != border) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list950, (SubLObject)(border.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, border) : border)), attributes);
        }
        if (html_macros.NIL != hspace) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list951, (SubLObject)(hspace.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, hspace) : hspace)), attributes);
        }
        if (html_macros.NIL != vspace) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list952, (SubLObject)(vspace.isAtom() ? ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, vspace) : vspace)), attributes);
        }
        attributes = Sequences.nreverse(attributes);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list953, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 122194L)
    public static SubLObject html_fancy_script(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list954);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_macros.NIL;
        SubLObject current_$44 = (SubLObject)html_macros.NIL;
        while (html_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list954);
            current_$44 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_macros.$list954);
            if (html_macros.NIL == conses_high.member(current_$44, (SubLObject)html_macros.$list955, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                bad = (SubLObject)html_macros.T;
            }
            if (current_$44 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list954);
        }
        final SubLObject language_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw956$LANGUAGE, current);
        final SubLObject language = (SubLObject)((html_macros.NIL != language_tail) ? conses_high.cadr(language_tail) : html_macros.NIL);
        final SubLObject src_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw566$SRC, current);
        final SubLObject src = (SubLObject)((html_macros.NIL != src_tail) ? conses_high.cadr(src_tail) : html_macros.NIL);
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw455$TYPE, current);
        final SubLObject type = (SubLObject)((html_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : html_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        SubLObject attributes = (SubLObject)html_macros.NIL;
        assert html_macros.NIL != Types.atom(language) : language;
        assert html_macros.NIL != Types.atom(src) : src;
        assert html_macros.NIL != Types.atom(type) : type;
        if (html_macros.NIL != language) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list957, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, language)), attributes);
        }
        if (html_macros.NIL != src) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list958, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, src)), attributes);
        }
        if (html_macros.NIL != type) {
            attributes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym374$HTML_QUOTED_ATTRIBUTE, (SubLObject)html_macros.$list959, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym351$HTML_MARKUP, type)), attributes);
        }
        if (html_macros.NIL != attributes) {
            attributes = Sequences.nreverse(attributes);
        }
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list393, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list960, ConsesLow.append(attributes, (SubLObject)ConsesLow.list(reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)((html_macros.NIL != body) ? html_macros.$list395 : html_macros.NIL), (SubLObject)html_macros.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123072L)
    public static SubLObject html_javascript(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym961$HTML_FANCY_SCRIPT, (SubLObject)html_macros.$list962, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123204L)
    public static SubLObject html_noscript(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)html_macros.$list963, reader.bq_cons((SubLObject)html_macros.$sym392$HTML_MARKUP_BODY, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123420L)
    public static SubLObject cyc_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = (SubLObject)html_macros.NIL;
        SubLObject link_body = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list964);
        url_body = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list964);
        link_body = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym848$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw456$HREF, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)html_macros.$list965, url_body)), link_body);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list964);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123693L)
    public static SubLObject html_dummy_form(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym618$HTML_FANCY_FORM, (SubLObject)html_macros.$list966, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123806L)
    public static SubLObject html_basic_cyc_form(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym618$HTML_FANCY_FORM, (SubLObject)html_macros.$list967, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123947L)
    public static SubLObject html_basic_cyc_form_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list968);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject handler_name = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list968);
        handler_name = current.first();
        current = current.rest();
        final SubLObject value = (SubLObject)(current.isCons() ? current.first() : html_macros.T);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list968);
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym969$HTML_BASIC_CYC_FORM, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym970$HTML_HIDDEN_INPUT, handler_name, value), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list968);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124139L)
    public static SubLObject html_basic_textarea(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list971);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject cols = (SubLObject)html_macros.NIL;
        SubLObject rows = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list971);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list971);
        cols = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list971);
        rows = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym972$HTML_FANCY_TEXTAREA, (SubLObject)ConsesLow.list(name, (SubLObject)html_macros.$kw710$COLS, cols, (SubLObject)html_macros.$kw711$ROWS, rows), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list971);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124289L)
    public static SubLObject html_basic_textarea_wrap(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list971);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject cols = (SubLObject)html_macros.NIL;
        SubLObject rows = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list971);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list971);
        cols = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list971);
        rows = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym972$HTML_FANCY_TEXTAREA, (SubLObject)ConsesLow.listS(name, (SubLObject)html_macros.$kw710$COLS, cols, (SubLObject)html_macros.$kw711$ROWS, rows, (SubLObject)html_macros.$list973), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list971);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124555L)
    public static SubLObject html_basic_select(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list974);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject size = (SubLObject)html_macros.NIL;
        SubLObject multipleP = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list974);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list974);
        size = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list974);
        multipleP = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym975$HTML_FANCY_SELECT, (SubLObject)ConsesLow.list(name, (SubLObject)html_macros.$kw688$MULTIPLE, multipleP, (SubLObject)html_macros.$kw511$SIZE, size), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list974);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124715L)
    public static SubLObject html_basic_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list976);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject selectedP = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list976);
        selectedP = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym977$HTML_FANCY_OPTION, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw695$SELECTED, selectedP), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list976);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124847L)
    public static SubLObject html_basic_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list978);
        final SubLObject temp = current.rest();
        current = current.first();
        final SubLObject caption = (SubLObject)(current.isCons() ? current.first() : html_macros.$str180$);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list978);
        current = current.rest();
        final SubLObject align = (SubLObject)(current.isCons() ? current.first() : html_macros.$kw979$TOP);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list978);
        current = current.rest();
        final SubLObject border = (SubLObject)(current.isCons() ? current.first() : html_macros.TWO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_macros.$list978);
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym749$HTML_FANCY_TABLE, (SubLObject)ConsesLow.list((SubLObject)html_macros.$kw643$BORDER, border), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym980$HTML_TABLE_CAPTION, (SubLObject)ConsesLow.list(align), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym477$HTML_PRINC, caption)), ConsesLow.append(body, (SubLObject)html_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list978);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 125070L)
    public static SubLObject html_autocomplete_textarea(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list981);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject cols = (SubLObject)html_macros.NIL;
        SubLObject rows = (SubLObject)html_macros.NIL;
        SubLObject cycl_type = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list981);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list981);
        cols = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list981);
        rows = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list981);
        cycl_type = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject id_num = (SubLObject)html_macros.$sym982$ID_NUM;
            final SubLObject input_id = (SubLObject)html_macros.$sym983$INPUT_ID;
            final SubLObject result_id = (SubLObject)html_macros.$sym984$RESULT_ID;
            final SubLObject autocomplete_id = (SubLObject)html_macros.$sym985$AUTOCOMPLETE_ID;
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym612$PIF, (SubLObject)html_macros.$list986, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(id_num, (SubLObject)html_macros.$list987), (SubLObject)ConsesLow.list(autocomplete_id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym988$FORMAT_NIL, (SubLObject)html_macros.$str989$autocomplete__A, id_num)), (SubLObject)ConsesLow.list(input_id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym988$FORMAT_NIL, (SubLObject)html_macros.$str990$input__A, id_num)), (SubLObject)ConsesLow.list(result_id, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym988$FORMAT_NIL, (SubLObject)html_macros.$str991$autocomplete_results__A, id_num))), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym992$HTML_FANCY_DIV, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$kw411$ID, autocomplete_id, (SubLObject)html_macros.$list993), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym972$HTML_FANCY_TEXTAREA, (SubLObject)ConsesLow.listS(name, new SubLObject[] { html_macros.$kw365$CLASS, html_macros.$str994$yui_ac_input, html_macros.$kw411$ID, input_id, html_macros.$kw710$COLS, cols, html_macros.$kw711$ROWS, rows, html_macros.$list995 }), ConsesLow.append(body, (SubLObject)html_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym992$HTML_FANCY_DIV, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$kw411$ID, result_id, (SubLObject)html_macros.$list996))), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym997$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT, input_id, result_id, (SubLObject)html_macros.TWENTY_INTEGER, (SubLObject)html_macros.THREE_INTEGER, (SubLObject)html_macros.NIL, cycl_type)), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym972$HTML_FANCY_TEXTAREA, (SubLObject)ConsesLow.list(name, (SubLObject)html_macros.$kw710$COLS, cols, (SubLObject)html_macros.$kw711$ROWS, rows), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list981);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 126040L)
    public static SubLObject with_html_output_to_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject stream = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list998);
        stream = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym347$_HTML_STREAM_, stream)), ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 126345L)
    public static SubLObject with_html_output_to_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string_var = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list999);
        string_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert html_macros.NIL != Types.symbolp(string_var) : string_var;
        final SubLObject stream = (SubLObject)html_macros.$sym1001$STREAM;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1002$CWITH_OUTPUT_TO_STRING, (SubLObject)ConsesLow.list(stream, string_var), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym1003$WITH_HTML_OUTPUT_TO_STREAM, stream, ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 126736L)
    public static SubLObject with_html_output_to_ascii_string(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string_var = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list999);
        string_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym1004$WITH_HTML_OUTPUT_TO_STRING, string_var, ConsesLow.append(body, (SubLObject)html_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym805$CSETQ, string_var, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1005$CONVERT_HTML_TO_TEXT, string_var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 127218L)
    public static SubLObject with_html_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject machine = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1006);
        machine = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject state_var = (SubLObject)html_macros.$sym1007$STATE_VAR;
        final SubLObject lock_var = (SubLObject)html_macros.$sym1008$LOCK_VAR;
        final SubLObject v_variables = (SubLObject)html_macros.$sym1009$VARIABLES;
        final SubLObject values = (SubLObject)html_macros.$sym1010$VALUES;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(state_var, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1011$HTML_MACHINE_STATE, machine)), (SubLObject)ConsesLow.list(lock_var, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1012$HTML_MACHINE_STATE_LOCK, state_var)), v_variables, values), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1013$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock_var), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym805$CSETQ, v_variables, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1014$HTML_MACHINE_STATE_VARIABLES, state_var)), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym805$CSETQ, values, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1015$HTML_MACHINE_STATE_VALUES, state_var))), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym1016$CPROGV, v_variables, values, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1017$SNAPSHOT_HTML_STATE, state_var)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 127801L)
    public static SubLObject html_parameter_entry_format(final SubLObject parameter) {
        return Symbols.get(parameter, (SubLObject)html_macros.$kw1018$HTML_PARAMETER_ENTRY_FORMAT, (SubLObject)html_macros.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 130668L)
    public static SubLObject set_html_parameter_entry_format(final SubLObject parameter, final SubLObject entry_format) {
        Symbols.put(parameter, (SubLObject)html_macros.$kw1018$HTML_PARAMETER_ENTRY_FORMAT, entry_format);
        return parameter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 130831L)
    public static SubLObject declare_html_parameter_entry_format(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject parameter = (SubLObject)html_macros.NIL;
        SubLObject entry_format = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1019);
        parameter = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1019);
        entry_format = current.first();
        current = current.rest();
        if (html_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1020$SET_HTML_PARAMETER_ENTRY_FORMAT, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1021$QUOTE, parameter), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1021$QUOTE, entry_format));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_macros.$list1019);
        return (SubLObject)html_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 131360L)
    public static SubLObject define_cgi_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject arglist = (SubLObject)html_macros.NIL;
        SubLObject type = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1028);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1028);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1028);
        type = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject max_args = list_utilities.function_arglist_max_args(arglist);
        if (!max_args.numE((SubLObject)html_macros.ONE_INTEGER)) {
            Errors.warn((SubLObject)html_macros.$str1029$HTML_handler__A_has_an_invalid_ar, name, arglist);
        }
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym350$PROGN, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym1030$DEFINE, name, arglist, ConsesLow.append(body, (SubLObject)html_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1031$NOTE_CGI_HANDLER_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1021$QUOTE, name), type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 131823L)
    public static SubLObject note_cgi_handler_function(final SubLObject symbol, final SubLObject type_symbol) {
        Hashtables.sethash(symbol, get_handler_mime_type_hash(), type_symbol);
        return (SubLObject)html_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 132194L)
    public static SubLObject get_handler_mime_type_hash() {
        if (html_macros.NIL == html_macros.$handler_mime_types$.getGlobalValue() || html_macros.NIL != dictionary.dictionary_p(html_macros.$handler_mime_types$.getGlobalValue())) {
            html_macros.$handler_mime_types$.setGlobalValue(Hashtables.make_hash_table((SubLObject)html_macros.$int1034$200, (SubLObject)html_macros.EQ, (SubLObject)html_macros.UNPROVIDED));
        }
        return html_macros.$handler_mime_types$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 132580L)
    public static SubLObject get_handler_mime_type_property(final SubLObject symbol) {
        return Hashtables.gethash(symbol, html_macros.$handler_mime_types$.getGlobalValue(), (SubLObject)html_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 132683L)
    public static SubLObject define_html_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject arglist = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1035);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1035);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym1036$DEFINE_CGI_HANDLER, name, arglist, html_macros.$html_handler_property$.getGlobalValue(), ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 132883L)
    public static SubLObject define_html_fragment_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject arglist = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1035);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1035);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym1032$DEFINE_HTML_HANDLER, name, arglist, ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133122L)
    public static SubLObject cgi_handler_functionP(final SubLObject symbol) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(symbol, get_handler_mime_type_hash(), (SubLObject)html_macros.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133301L)
    public static SubLObject html_handler_functionP(final SubLObject symbol) {
        return Equality.eq(Hashtables.gethash(symbol, get_handler_mime_type_hash(), (SubLObject)html_macros.UNPROVIDED), html_macros.$html_handler_property$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133436L)
    public static SubLObject xml_handler_functionP(final SubLObject symbol) {
        return Equality.eq(Hashtables.gethash(get_handler_mime_type_hash(), symbol, (SubLObject)html_macros.UNPROVIDED), html_macros.$xml_handler_property$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133633L)
    public static SubLObject json_handler_functionP(final SubLObject symbol) {
        return Equality.eq(Hashtables.gethash(symbol, get_handler_mime_type_hash(), (SubLObject)html_macros.UNPROVIDED), html_macros.$xml_handler_property$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133831L)
    public static SubLObject all_cgi_handler_symbols(final SubLObject sym) {
        SubLObject symbols = (SubLObject)html_macros.NIL;
        final SubLObject cdohash_table = get_handler_mime_type_hash();
        SubLObject symbol = (SubLObject)html_macros.NIL;
        SubLObject handler_property = (SubLObject)html_macros.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                symbol = Hashtables.getEntryKey(cdohash_entry);
                handler_property = Hashtables.getEntryValue(cdohash_entry);
                if (handler_property.eql(sym)) {
                    symbols = (SubLObject)ConsesLow.cons(symbol, symbols);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        symbols = Sort.sort(symbols, Symbols.symbol_function((SubLObject)html_macros.$sym1037$STRING_LESSP), Symbols.symbol_function((SubLObject)html_macros.$sym1038$SYMBOL_NAME));
        return symbols;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 134293L)
    public static SubLObject all_html_handler_symbols() {
        return all_cgi_handler_symbols(html_macros.$html_handler_property$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 134400L)
    public static SubLObject all_json_handler_symbols() {
        return all_cgi_handler_symbols(html_macros.$json_handler_property$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 134506L)
    public static SubLObject all_xml_handler_symbols() {
        return all_cgi_handler_symbols(html_macros.$xml_handler_property$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 134610L)
    public static SubLObject define_xml_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject arglist = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1035);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1035);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym1036$DEFINE_CGI_HANDLER, name, arglist, html_macros.$xml_handler_property$.getGlobalValue(), ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 135012L)
    public static SubLObject define_json_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_macros.NIL;
        SubLObject arglist = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1035);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1035);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym1036$DEFINE_CGI_HANDLER, name, arglist, html_macros.$json_handler_property$.getGlobalValue(), ConsesLow.append(body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 135415L)
    public static SubLObject with_html_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject specs = (SubLObject)html_macros.NIL;
        SubLObject args = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1039);
        specs = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1039);
        args = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject alist = (SubLObject)html_macros.$sym1040$ALIST;
        SubLObject vars = (SubLObject)html_macros.NIL;
        SubLObject parsing_code = (SubLObject)html_macros.NIL;
        SubLObject cdolist_list_var = specs;
        SubLObject spec = (SubLObject)html_macros.NIL;
        spec = cdolist_list_var.first();
        while (html_macros.NIL != cdolist_list_var) {
            final SubLObject var = spec.isCons() ? spec.first() : spec;
            vars = (SubLObject)ConsesLow.cons(var, vars);
            if (spec.isCons()) {
                SubLObject current_$46;
                final SubLObject datum_$45 = current_$46 = spec;
                SubLObject variable = (SubLObject)html_macros.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$46, datum_$45, (SubLObject)html_macros.$list1041);
                variable = current_$46.first();
                current_$46 = current_$46.rest();
                SubLObject allow_other_keys_p = (SubLObject)html_macros.NIL;
                SubLObject rest = current_$46;
                SubLObject bad = (SubLObject)html_macros.NIL;
                SubLObject current_$47 = (SubLObject)html_macros.NIL;
                while (html_macros.NIL != rest) {
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$45, (SubLObject)html_macros.$list1041);
                    current_$47 = rest.first();
                    rest = rest.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(rest, datum_$45, (SubLObject)html_macros.$list1041);
                    if (html_macros.NIL == conses_high.member(current_$47, (SubLObject)html_macros.$list1042, (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED)) {
                        bad = (SubLObject)html_macros.T;
                    }
                    if (current_$47 == html_macros.$kw361$ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if (html_macros.NIL != bad && html_macros.NIL == allow_other_keys_p) {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$45, (SubLObject)html_macros.$list1041);
                }
                final SubLObject reader_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw1043$READER, current_$46);
                final SubLObject reader = (SubLObject)((html_macros.NIL != reader_tail) ? conses_high.cadr(reader_tail) : html_macros.NIL);
                final SubLObject type_pred_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw1044$TYPE_PRED, current_$46);
                final SubLObject type_pred = (SubLObject)((html_macros.NIL != type_pred_tail) ? conses_high.cadr(type_pred_tail) : html_macros.NIL);
                final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw440$NAME, current_$46);
                final SubLObject name = (SubLObject)((html_macros.NIL != name_tail) ? conses_high.cadr(name_tail) : html_macros.NIL);
                final SubLObject collect_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw1045$COLLECT, current_$46);
                final SubLObject collect = (SubLObject)((html_macros.NIL != collect_tail) ? conses_high.cadr(collect_tail) : html_macros.NIL);
                final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)html_macros.$kw1046$TEST, current_$46);
                final SubLObject test = (SubLObject)((html_macros.NIL != test_tail) ? conses_high.cadr(test_tail) : html_macros.$list1047);
                SubLObject key_string = (SubLObject)html_macros.NIL;
                if (html_macros.NIL != name) {
                    key_string = name;
                }
                else {
                    key_string = Strings.string_downcase(Symbols.symbol_name(var), (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED);
                }
                if (html_macros.NIL != collect) {
                    final SubLObject current_$48 = (SubLObject)html_macros.$sym1048$CURRENT;
                    parsing_code = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1049$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(current_$48, alist, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1050$CDR, current_$48))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1051$NULL, current_$48)), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1052$FUNCALL, test, key_string, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1053$CAAR, current_$48)), (SubLObject)((html_macros.NIL != reader) ? ConsesLow.list((SubLObject)html_macros.$sym1054$CPUSH, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1052$FUNCALL, reader, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1055$CAR, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1056$CDAR, current_$48))), var) : ConsesLow.list((SubLObject)html_macros.$sym1054$CPUSH, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1055$CAR, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1056$CDAR, current_$48)), var)))), parsing_code);
                }
                else if (html_macros.NIL != reader) {
                    final SubLObject val = (SubLObject)html_macros.$sym1057$VAL;
                    parsing_code = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(val, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1058$CADR, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1059$ASSOC, key_string, alist, test)))), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym379$PWHEN, val, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1060$CSETF, var, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1052$FUNCALL, reader, val)))), parsing_code);
                }
                else {
                    parsing_code = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1060$CSETF, var, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1058$CADR, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1059$ASSOC, key_string, alist, test))), parsing_code);
                }
                if (html_macros.NIL != type_pred) {
                    parsing_code = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1061$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1052$FUNCALL, type_pred, var), (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1062$ERROR, (SubLObject)html_macros.$str1063$HTML_argument_error___S_should_be, var, type_pred)), parsing_code);
                }
            }
            else {
                parsing_code = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1060$CSETF, var, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1058$CADR, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym1059$ASSOC, Strings.string_downcase(Symbols.symbol_name(var), (SubLObject)html_macros.UNPROVIDED, (SubLObject)html_macros.UNPROVIDED), alist, (SubLObject)html_macros.$list1064))), parsing_code);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        parsing_code = Sequences.nreverse(parsing_code);
        return (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym357$CLET, reader.bq_cons((SubLObject)ConsesLow.list(alist, (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym1065$REMOVE_IF_NOT, (SubLObject)html_macros.$list1066, args)), ConsesLow.append(vars, (SubLObject)html_macros.NIL)), ConsesLow.append(parsing_code, body, (SubLObject)html_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 137641L)
    public static SubLObject html_possibly_strong(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject strongP = (SubLObject)html_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_macros.$list1067);
        strongP = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject strong_var = (SubLObject)html_macros.$sym1068$STRONG_VAR;
        final SubLObject head = (SubLObject)html_macros.$sym1069$HEAD;
        final SubLObject tail = (SubLObject)html_macros.$sym1070$TAIL;
        return (SubLObject)ConsesLow.list((SubLObject)html_macros.$sym357$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(strong_var, strongP), (SubLObject)ConsesLow.list(head, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym807$FIF, strong_var, (SubLObject)html_macros.$list1071)), (SubLObject)ConsesLow.list(tail, (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym807$FIF, strong_var, (SubLObject)html_macros.$list1072))), (SubLObject)ConsesLow.listS((SubLObject)html_macros.$sym390$HTML_MARKUP_WRAPPER, (SubLObject)ConsesLow.list(head, tail), ConsesLow.append(body, (SubLObject)html_macros.NIL)));
    }
    
    public static SubLObject declare_html_macros_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "is_known_dom_event_handlerP", "IS-KNOWN-DOM-EVENT-HANDLER?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_format", "HTML-FORMAT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_format_strong", "HTML-FORMAT-STRONG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_markup_wrapper", "HTML-MARKUP-WRAPPER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_quoted_attribute", "HTML-QUOTED-ATTRIBUTE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_markup_body", "HTML-MARKUP-BODY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "html_inside_body_p", "HTML-INSIDE-BODY-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_body", "HTML-FANCY-BODY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_colored_body", "HTML-COLORED-BODY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_body", "HTML-BODY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_head", "HTML-HEAD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "html_head_content_type", "HTML-HEAD-CONTENT-TYPE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_document", "HTML-DOCUMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_div", "HTML-FANCY-DIV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_smaller", "HTML-SMALLER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_larger", "HTML-LARGER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_span", "HTML-FANCY-SPAN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_meta", "HTML-META");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_meta", "HTML-FANCY-META");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_link", "HTML-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_link", "HTML-FANCY-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_base", "HTML-BASE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_base", "HTML-FANCY-BASE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "html_stylesheet_link", "HTML-STYLESHEET-LINK", 1, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_style", "HTML-STYLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_title", "HTML-TITLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_simple_document", "HTML-SIMPLE-DOCUMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_simple_browser_document", "HTML-SIMPLE-BROWSER-DOCUMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_blockquote", "HTML-BLOCKQUOTE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_center", "HTML-CENTER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_heading", "HTML-HEADING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_paragraph", "HTML-PARAGRAPH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_plaintext", "HTML-PLAINTEXT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "verify_within_html_pre", "VERIFY-WITHIN-HTML-PRE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "verify_not_within_html_pre", "VERIFY-NOT-WITHIN-HTML-PRE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_pre", "HTML-PRE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_unpre", "HTML-UNPRE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_address", "HTML-ADDRESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_big", "HTML-BIG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_bold", "HTML-BOLD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_b", "HTML-B");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_cite", "HTML-CITE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_code", "HTML-CODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_definition", "HTML-DEFINITION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_emphasized", "HTML-EMPHASIZED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_em", "HTML-EM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_font", "HTML-FANCY-FONT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_font", "HTML-FONT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_font_color", "HTML-FONT-COLOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_text_background_color", "HTML-TEXT-BACKGROUND-COLOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_italic", "HTML-ITALIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_i", "HTML-I");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_keyboard", "HTML-KEYBOARD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_sample", "HTML-SAMPLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_small", "HTML-SMALL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_strikethrough", "HTML-STRIKETHROUGH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_strong", "HTML-STRONG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_subscript", "HTML-SUBSCRIPT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_superscript", "HTML-SUPERSCRIPT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_teletype", "HTML-TELETYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_tt", "HTML-TT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_underlined", "HTML-UNDERLINED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_u", "HTML-U");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_variable", "HTML-VARIABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_label", "HTML-FANCY-LABEL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_definition_list", "HTML-DEFINITION-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_compact_definition_list", "HTML-COMPACT-DEFINITION-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_dl_term", "HTML-DL-TERM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_dl_definition", "HTML-DL-DEFINITION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_directory_list", "HTML-DIRECTORY-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_compact_directory_list", "HTML-COMPACT-DIRECTORY-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_menu_list", "HTML-MENU-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_compact_menu_list", "HTML-COMPACT-MENU-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_ordered_list", "HTML-FANCY-ORDERED-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_ordered_list", "HTML-ORDERED-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_number_list", "HTML-NUMBER-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_unordered_list", "HTML-FANCY-UNORDERED-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_unordered_list", "HTML-UNORDERED-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_bullet_list", "HTML-BULLET-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_plain_list", "HTML-PLAIN-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_list_item", "HTML-FANCY-LIST-ITEM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_list_item", "HTML-LIST-ITEM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_summary", "HTML-FANCY-SUMMARY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_details", "HTML-FANCY-DETAILS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_applet", "HTML-APPLET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_param", "HTML-PARAM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_safe_param", "HTML-SAFE-PARAM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "with_html_id_space", "WITH-HTML-ID-SPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "next_html_id", "NEXT-HTML-ID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "next_html_id_definedP", "NEXT-HTML-ID-DEFINED?", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "with_html_unique_form_fields", "WITH-HTML-UNIQUE-FORM-FIELDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "with_html_unique_form_field_decoding", "WITH-HTML-UNIQUE-FORM-FIELD-DECODING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "next_html_form_field_uniquifier_code", "NEXT-HTML-FORM-FIELD-UNIQUIFIER-CODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "find_or_create_html_form_field_uniquifier_isg", "FIND-OR-CREATE-HTML-FORM-FIELD-UNIQUIFIER-ISG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "embed_form_field_code", "EMBED-FORM-FIELD-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "get_form_field_code", "GET-FORM-FIELD-CODE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_form", "HTML-FANCY-FORM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_input", "HTML-FANCY-INPUT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_script_button", "HTML-SCRIPT-BUTTON");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_script_radio", "HTML-SCRIPT-RADIO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_script_submit", "HTML-SCRIPT-SUBMIT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_select", "HTML-FANCY-SELECT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_option", "HTML-FANCY-OPTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_optgroup", "HTML-OPTGROUP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_textarea", "HTML-FANCY-TEXTAREA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_table_caption", "HTML-TABLE-CAPTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_table", "HTML-FANCY-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_table", "HTML-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_table_data", "HTML-FANCY-TABLE-DATA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_table_data", "HTML-TABLE-DATA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_table_header", "HTML-FANCY-TABLE-HEADER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_table_heading", "HTML-TABLE-HEADING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_table_header_block", "HTML-TABLE-HEADER-BLOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_table_footer_block", "HTML-TABLE-FOOTER-BLOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_table_body_block", "HTML-TABLE-BODY-BLOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_table_row", "HTML-FANCY-TABLE-ROW");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_table_row", "HTML-TABLE-ROW");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_indent_table", "HTML-INDENT-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_indent_row", "HTML-INDENT-ROW");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_indented_line", "HTML-INDENTED-LINE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_indented_line_inverse", "HTML-INDENTED-LINE-INVERSE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "cdolist_with_alternating_bgcolor", "CDOLIST-WITH-ALTERNATING-BGCOLOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "cdolist_with_cyc_logo_colors", "CDOLIST-WITH-CYC-LOGO-COLORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "cdolist_with_cyc_background_colors", "CDOLIST-WITH-CYC-BACKGROUND-COLORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "cdolist_with_alternating_variable", "CDOLIST-WITH-ALTERNATING-VARIABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "cdolist_with_alternating_classes", "CDOLIST-WITH-ALTERNATING-CLASSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "switch_cyc_logo_color", "SWITCH-CYC-LOGO-COLOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_anchor", "HTML-FANCY-ANCHOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_script_anchor", "HTML-SCRIPT-ANCHOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_target_reference", "HTML-TARGET-REFERENCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_mailto_anchor", "HTML-MAILTO-ANCHOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_file_anchor", "HTML-FILE-ANCHOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_area", "HTML-FANCY-AREA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_blink", "HTML-BLINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_comment", "HTML-COMMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_frame", "HTML-FANCY-FRAME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_frame", "HTML-FRAME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_frameset", "HTML-FANCY-FRAMESET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_frameset", "HTML-FRAMESET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_iframe", "HTML-FANCY-IFRAME");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_image", "HTML-FANCY-IMAGE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_embedded_image", "HTML-EMBEDDED-IMAGE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "html_embedded_image_data_src", "HTML-EMBEDDED-IMAGE-DATA-SRC", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "html_base64_string_for_file", "HTML-BASE64-STRING-FOR-FILE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_map", "HTML-FANCY-MAP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_map", "HTML-MAP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_no_break", "HTML-NO-BREAK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_no_frames", "HTML-NO-FRAMES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_object", "HTML-OBJECT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_fancy_script", "HTML-FANCY-SCRIPT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_javascript", "HTML-JAVASCRIPT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_noscript", "HTML-NOSCRIPT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "cyc_link", "CYC-LINK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_dummy_form", "HTML-DUMMY-FORM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_basic_cyc_form", "HTML-BASIC-CYC-FORM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_basic_cyc_form_handler", "HTML-BASIC-CYC-FORM-HANDLER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_basic_textarea", "HTML-BASIC-TEXTAREA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_basic_textarea_wrap", "HTML-BASIC-TEXTAREA-WRAP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_basic_select", "HTML-BASIC-SELECT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_basic_option", "HTML-BASIC-OPTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_basic_table", "HTML-BASIC-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_autocomplete_textarea", "HTML-AUTOCOMPLETE-TEXTAREA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "with_html_output_to_stream", "WITH-HTML-OUTPUT-TO-STREAM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "with_html_output_to_string", "WITH-HTML-OUTPUT-TO-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "with_html_output_to_ascii_string", "WITH-HTML-OUTPUT-TO-ASCII-STRING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "with_html_state", "WITH-HTML-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "html_parameter_entry_format", "HTML-PARAMETER-ENTRY-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "set_html_parameter_entry_format", "SET-HTML-PARAMETER-ENTRY-FORMAT", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "declare_html_parameter_entry_format", "DECLARE-HTML-PARAMETER-ENTRY-FORMAT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "define_cgi_handler", "DEFINE-CGI-HANDLER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "note_cgi_handler_function", "NOTE-CGI-HANDLER-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "get_handler_mime_type_hash", "GET-HANDLER-MIME-TYPE-HASH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "get_handler_mime_type_property", "GET-HANDLER-MIME-TYPE-PROPERTY", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "define_html_handler", "DEFINE-HTML-HANDLER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "define_html_fragment_handler", "DEFINE-HTML-FRAGMENT-HANDLER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "cgi_handler_functionP", "CGI-HANDLER-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "html_handler_functionP", "HTML-HANDLER-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "xml_handler_functionP", "XML-HANDLER-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "json_handler_functionP", "JSON-HANDLER-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "all_cgi_handler_symbols", "ALL-CGI-HANDLER-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "all_html_handler_symbols", "ALL-HTML-HANDLER-SYMBOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "all_json_handler_symbols", "ALL-JSON-HANDLER-SYMBOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_macros", "all_xml_handler_symbols", "ALL-XML-HANDLER-SYMBOLS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "define_xml_handler", "DEFINE-XML-HANDLER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "define_json_handler", "DEFINE-JSON-HANDLER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "with_html_args", "WITH-HTML-ARGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_macros", "html_possibly_strong", "HTML-POSSIBLY-STRONG");
        return (SubLObject)html_macros.NIL;
    }
    
    public static SubLObject init_html_macros_file() {
        html_macros.$html_stream$ = SubLFiles.defparameter("*HTML-STREAM*", (SubLObject)html_macros.T);
        html_macros.$html_default_bgcolor$ = SubLFiles.defparameter("*HTML-DEFAULT-BGCOLOR*", (SubLObject)html_macros.NIL);
        html_macros.$html_force_ie_standards_mode$ = SubLFiles.defparameter("*HTML-FORCE-IE-STANDARDS-MODE*", (SubLObject)html_macros.T);
        html_macros.$html_body_head$ = SubLFiles.defconstant("*HTML-BODY-HEAD*", (SubLObject)html_macros.$str1$_body);
        html_macros.$html_body_tail$ = SubLFiles.defconstant("*HTML-BODY-TAIL*", (SubLObject)html_macros.$str2$__body_);
        html_macros.$html_body_bgcolor$ = SubLFiles.defconstant("*HTML-BODY-BGCOLOR*", (SubLObject)html_macros.$str3$_bgcolor_);
        html_macros.$html_body_background$ = SubLFiles.defconstant("*HTML-BODY-BACKGROUND*", (SubLObject)html_macros.$str4$_background_);
        html_macros.$html_body_class$ = SubLFiles.defconstant("*HTML-BODY-CLASS*", (SubLObject)html_macros.$str5$_class_);
        html_macros.$html_body_style$ = SubLFiles.defconstant("*HTML-BODY-STYLE*", (SubLObject)html_macros.$str6$_style_);
        html_macros.$html_body_text$ = SubLFiles.defconstant("*HTML-BODY-TEXT*", (SubLObject)html_macros.$str7$_text_);
        html_macros.$html_body_link$ = SubLFiles.defconstant("*HTML-BODY-LINK*", (SubLObject)html_macros.$str8$_link_);
        html_macros.$html_body_alink$ = SubLFiles.defconstant("*HTML-BODY-ALINK*", (SubLObject)html_macros.$str9$_alink_);
        html_macros.$html_body_vlink$ = SubLFiles.defconstant("*HTML-BODY-VLINK*", (SubLObject)html_macros.$str10$_vlink_);
        html_macros.$html_body_onload$ = SubLFiles.defconstant("*HTML-BODY-ONLOAD*", (SubLObject)html_macros.$str11$_onLoad_);
        html_macros.$html_body_onresize$ = SubLFiles.defconstant("*HTML-BODY-ONRESIZE*", (SubLObject)html_macros.$str12$_onResize_);
        html_macros.$html_div_head$ = SubLFiles.defconstant("*HTML-DIV-HEAD*", (SubLObject)html_macros.$str13$_div);
        html_macros.$html_div_tail$ = SubLFiles.defconstant("*HTML-DIV-TAIL*", (SubLObject)html_macros.$str14$__div_);
        html_macros.$html_div_class$ = SubLFiles.defconstant("*HTML-DIV-CLASS*", (SubLObject)html_macros.$str5$_class_);
        html_macros.$html_div_style$ = SubLFiles.defconstant("*HTML-DIV-STYLE*", (SubLObject)html_macros.$str6$_style_);
        html_macros.$html_div_title$ = SubLFiles.defconstant("*HTML-DIV-TITLE*", (SubLObject)html_macros.$str15$_title_);
        html_macros.$html_div_align$ = SubLFiles.defconstant("*HTML-DIV-ALIGN*", (SubLObject)html_macros.$str16$_align_);
        html_macros.$html_div_onload$ = SubLFiles.defconstant("*HTML-DIV-ONLOAD*", (SubLObject)html_macros.$str11$_onLoad_);
        html_macros.$html_span_head$ = SubLFiles.defconstant("*HTML-SPAN-HEAD*", (SubLObject)html_macros.$str17$_span);
        html_macros.$html_span_tail$ = SubLFiles.defconstant("*HTML-SPAN-TAIL*", (SubLObject)html_macros.$str18$__span_);
        html_macros.$html_span_class$ = SubLFiles.defconstant("*HTML-SPAN-CLASS*", (SubLObject)html_macros.$str5$_class_);
        html_macros.$html_span_style$ = SubLFiles.defconstant("*HTML-SPAN-STYLE*", (SubLObject)html_macros.$str6$_style_);
        html_macros.$html_head_head$ = SubLFiles.defconstant("*HTML-HEAD-HEAD*", (SubLObject)html_macros.$str19$_head_);
        html_macros.$html_head_tail$ = SubLFiles.defconstant("*HTML-HEAD-TAIL*", (SubLObject)html_macros.$str20$__head_);
        html_macros.$html_html_head$ = SubLFiles.defconstant("*HTML-HTML-HEAD*", (SubLObject)html_macros.$str21$_html_);
        html_macros.$html_html_tail$ = SubLFiles.defconstant("*HTML-HTML-TAIL*", (SubLObject)html_macros.$str22$__html_);
        html_macros.$html_attribute_id$ = SubLFiles.defconstant("*HTML-ATTRIBUTE-ID*", (SubLObject)html_macros.$str23$_id_);
        html_macros.$html_attribute_class$ = SubLFiles.defconstant("*HTML-ATTRIBUTE-CLASS*", (SubLObject)html_macros.$str5$_class_);
        html_macros.$html_attribute_style$ = SubLFiles.defconstant("*HTML-ATTRIBUTE-STYLE*", (SubLObject)html_macros.$str6$_style_);
        html_macros.$html_attribute_title$ = SubLFiles.defconstant("*HTML-ATTRIBUTE-TITLE*", (SubLObject)html_macros.$str15$_title_);
        html_macros.$html_event_attribute_onclick$ = SubLFiles.defconstant("*HTML-EVENT-ATTRIBUTE-ONCLICK*", (SubLObject)html_macros.$str24$_onclick_);
        html_macros.$html_event_attribute_onblur$ = SubLFiles.defconstant("*HTML-EVENT-ATTRIBUTE-ONBLUR*", (SubLObject)html_macros.$str25$_onblur_);
        html_macros.$html_event_attribute_onfocus$ = SubLFiles.defconstant("*HTML-EVENT-ATTRIBUTE-ONFOCUS*", (SubLObject)html_macros.$str26$_onfocus_);
        html_macros.$html_event_attribute_onkeyup$ = SubLFiles.defconstant("*HTML-EVENT-ATTRIBUTE-ONKEYUP*", (SubLObject)html_macros.$str27$_onkeyup_);
        html_macros.$html_event_attribute_onkeydown$ = SubLFiles.defconstant("*HTML-EVENT-ATTRIBUTE-ONKEYDOWN*", (SubLObject)html_macros.$str28$_onkeydown_);
        html_macros.$html_event_attribute_onkeypress$ = SubLFiles.defconstant("*HTML-EVENT-ATTRIBUTE-ONKEYPRESS*", (SubLObject)html_macros.$str29$_onkeypress_);
        html_macros.$html_meta_head$ = SubLFiles.defconstant("*HTML-META-HEAD*", (SubLObject)html_macros.$str30$_meta);
        html_macros.$html_meta_http_equiv$ = SubLFiles.defconstant("*HTML-META-HTTP-EQUIV*", (SubLObject)html_macros.$str31$_http_equiv_);
        html_macros.$html_meta_content$ = SubLFiles.defconstant("*HTML-META-CONTENT*", (SubLObject)html_macros.$str32$_content_);
        html_macros.$html_meta_scheme$ = SubLFiles.defconstant("*HTML-META-SCHEME*", (SubLObject)html_macros.$str33$_scheme_);
        html_macros.$html_meta_name$ = SubLFiles.defconstant("*HTML-META-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_meta_lang$ = SubLFiles.defconstant("*HTML-META-LANG*", (SubLObject)html_macros.$str35$_lang_);
        html_macros.$html_meta_dir$ = SubLFiles.defconstant("*HTML-META-DIR*", (SubLObject)html_macros.$str36$_dir_);
        html_macros.$html_title_head$ = SubLFiles.defconstant("*HTML-TITLE-HEAD*", (SubLObject)html_macros.$str37$_title_);
        html_macros.$html_title_tail$ = SubLFiles.defconstant("*HTML-TITLE-TAIL*", (SubLObject)html_macros.$str38$__title_);
        html_macros.$html_link_head$ = SubLFiles.defconstant("*HTML-LINK-HEAD*", (SubLObject)html_macros.$str39$_link);
        html_macros.$html_link_rel$ = SubLFiles.defconstant("*HTML-LINK-REL*", (SubLObject)html_macros.$str40$_rel_);
        html_macros.$html_link_type$ = SubLFiles.defconstant("*HTML-LINK-TYPE*", (SubLObject)html_macros.$str41$_type_);
        html_macros.$html_link_href$ = SubLFiles.defconstant("*HTML-LINK-HREF*", (SubLObject)html_macros.$str42$_href_);
        html_macros.$html_link_media$ = SubLFiles.defconstant("*HTML-LINK-MEDIA*", (SubLObject)html_macros.$str43$_media_);
        html_macros.$html_link_title$ = SubLFiles.defconstant("*HTML-LINK-TITLE*", (SubLObject)html_macros.$str15$_title_);
        html_macros.$html_base_head$ = SubLFiles.defconstant("*HTML-BASE-HEAD*", (SubLObject)html_macros.$str44$_base);
        html_macros.$html_base_href$ = SubLFiles.defconstant("*HTML-BASE-HREF*", (SubLObject)html_macros.$str42$_href_);
        html_macros.$html_style_head$ = SubLFiles.defconstant("*HTML-STYLE-HEAD*", (SubLObject)html_macros.$str45$_style_);
        html_macros.$html_style_tail$ = SubLFiles.defconstant("*HTML-STYLE-TAIL*", (SubLObject)html_macros.$str46$__style_);
        html_macros.$html_blockquote_head$ = SubLFiles.defconstant("*HTML-BLOCKQUOTE-HEAD*", (SubLObject)html_macros.$str47$_blockquote_);
        html_macros.$html_blockquote_tail$ = SubLFiles.defconstant("*HTML-BLOCKQUOTE-TAIL*", (SubLObject)html_macros.$str48$__blockquote_);
        html_macros.$html_center_head$ = SubLFiles.defconstant("*HTML-CENTER-HEAD*", (SubLObject)html_macros.$str49$_center_);
        html_macros.$html_center_tail$ = SubLFiles.defconstant("*HTML-CENTER-TAIL*", (SubLObject)html_macros.$str50$__center_);
        html_macros.$html_heading_head$ = SubLFiles.defconstant("*HTML-HEADING-HEAD*", (SubLObject)html_macros.$str51$_h);
        html_macros.$html_heading_tail$ = SubLFiles.defconstant("*HTML-HEADING-TAIL*", (SubLObject)html_macros.$str52$__h);
        html_macros.$html_hr_head$ = SubLFiles.defconstant("*HTML-HR-HEAD*", (SubLObject)html_macros.$str53$_hr);
        html_macros.$html_hr_size$ = SubLFiles.defconstant("*HTML-HR-SIZE*", (SubLObject)html_macros.$str54$_size_);
        html_macros.$html_hr_width$ = SubLFiles.defconstant("*HTML-HR-WIDTH*", (SubLObject)html_macros.$str55$_width_);
        html_macros.$html_line_break_atomic$ = SubLFiles.defconstant("*HTML-LINE-BREAK-ATOMIC*", (SubLObject)html_macros.$str56$_br___);
        html_macros.$html_line_break_head$ = SubLFiles.defconstant("*HTML-LINE-BREAK-HEAD*", (SubLObject)html_macros.$str57$_br);
        html_macros.$html_line_break_tail$ = SubLFiles.defconstant("*HTML-LINE-BREAK-TAIL*", (SubLObject)html_macros.$str58$__br_);
        html_macros.$html_line_break_clear$ = SubLFiles.defconstant("*HTML-LINE-BREAK-CLEAR*", (SubLObject)html_macros.$str59$_clear_);
        html_macros.$html_line_break$ = SubLFiles.defconstant("*HTML-LINE-BREAK*", (SubLObject)html_macros.$str60$_br_);
        html_macros.$html_paragraph_head$ = SubLFiles.defconstant("*HTML-PARAGRAPH-HEAD*", (SubLObject)html_macros.$str61$_p_);
        html_macros.$html_paragraph_tail$ = SubLFiles.defconstant("*HTML-PARAGRAPH-TAIL*", (SubLObject)html_macros.$str62$__p_);
        html_macros.$html_plaintext_head$ = SubLFiles.defconstant("*HTML-PLAINTEXT-HEAD*", (SubLObject)html_macros.$str63$_plaintext_);
        html_macros.$html_plaintext_tail$ = SubLFiles.defconstant("*HTML-PLAINTEXT-TAIL*", (SubLObject)html_macros.$str64$__plaintext_);
        html_macros.$html_preformatted_head$ = SubLFiles.defconstant("*HTML-PREFORMATTED-HEAD*", (SubLObject)html_macros.$str65$_pre_);
        html_macros.$html_preformatted_tail$ = SubLFiles.defconstant("*HTML-PREFORMATTED-TAIL*", (SubLObject)html_macros.$str66$__pre_);
        html_macros.$html_address_head$ = SubLFiles.defconstant("*HTML-ADDRESS-HEAD*", (SubLObject)html_macros.$str67$_address_);
        html_macros.$html_address_tail$ = SubLFiles.defconstant("*HTML-ADDRESS-TAIL*", (SubLObject)html_macros.$str68$__address_);
        html_macros.$html_big_head$ = SubLFiles.defconstant("*HTML-BIG-HEAD*", (SubLObject)html_macros.$str69$_big_);
        html_macros.$html_big_tail$ = SubLFiles.defconstant("*HTML-BIG-TAIL*", (SubLObject)html_macros.$str70$__big_);
        html_macros.$html_bold_head$ = SubLFiles.defconstant("*HTML-BOLD-HEAD*", (SubLObject)html_macros.$str71$_b_);
        html_macros.$html_bold_tail$ = SubLFiles.defconstant("*HTML-BOLD-TAIL*", (SubLObject)html_macros.$str72$__b_);
        html_macros.$html_cite_head$ = SubLFiles.defconstant("*HTML-CITE-HEAD*", (SubLObject)html_macros.$str73$_cite_);
        html_macros.$html_cite_tail$ = SubLFiles.defconstant("*HTML-CITE-TAIL*", (SubLObject)html_macros.$str74$__cite_);
        html_macros.$html_code_head$ = SubLFiles.defconstant("*HTML-CODE-HEAD*", (SubLObject)html_macros.$str75$_code_);
        html_macros.$html_code_tail$ = SubLFiles.defconstant("*HTML-CODE-TAIL*", (SubLObject)html_macros.$str76$__code_);
        html_macros.$html_definition_head$ = SubLFiles.defconstant("*HTML-DEFINITION-HEAD*", (SubLObject)html_macros.$str77$_dfn_);
        html_macros.$html_definition_tail$ = SubLFiles.defconstant("*HTML-DEFINITION-TAIL*", (SubLObject)html_macros.$str78$__dfn_);
        html_macros.$html_emphasized_head$ = SubLFiles.defconstant("*HTML-EMPHASIZED-HEAD*", (SubLObject)html_macros.$str79$_em_);
        html_macros.$html_emphasized_tail$ = SubLFiles.defconstant("*HTML-EMPHASIZED-TAIL*", (SubLObject)html_macros.$str80$__em_);
        html_macros.$html_font_head$ = SubLFiles.defconstant("*HTML-FONT-HEAD*", (SubLObject)html_macros.$str81$_font);
        html_macros.$html_font_tail$ = SubLFiles.defconstant("*HTML-FONT-TAIL*", (SubLObject)html_macros.$str82$__font_);
        html_macros.$html_font_size$ = SubLFiles.defconstant("*HTML-FONT-SIZE*", (SubLObject)html_macros.$str54$_size_);
        html_macros.$html_font_color$ = SubLFiles.defconstant("*HTML-FONT-COLOR*", (SubLObject)html_macros.$str83$_color_);
        html_macros.$html_font_face$ = SubLFiles.defconstant("*HTML-FONT-FACE*", (SubLObject)html_macros.$str84$_face_);
        html_macros.$html_italic_head$ = SubLFiles.defconstant("*HTML-ITALIC-HEAD*", (SubLObject)html_macros.$str85$_i_);
        html_macros.$html_italic_tail$ = SubLFiles.defconstant("*HTML-ITALIC-TAIL*", (SubLObject)html_macros.$str86$__i_);
        html_macros.$html_keyboard_head$ = SubLFiles.defconstant("*HTML-KEYBOARD-HEAD*", (SubLObject)html_macros.$str87$_kbd_);
        html_macros.$html_keyboard_tail$ = SubLFiles.defconstant("*HTML-KEYBOARD-TAIL*", (SubLObject)html_macros.$str88$__kbd_);
        html_macros.$html_sample_head$ = SubLFiles.defconstant("*HTML-SAMPLE-HEAD*", (SubLObject)html_macros.$str89$_samp_);
        html_macros.$html_sample_tail$ = SubLFiles.defconstant("*HTML-SAMPLE-TAIL*", (SubLObject)html_macros.$str90$__samp_);
        html_macros.$html_small_head$ = SubLFiles.defconstant("*HTML-SMALL-HEAD*", (SubLObject)html_macros.$str91$_small_);
        html_macros.$html_small_tail$ = SubLFiles.defconstant("*HTML-SMALL-TAIL*", (SubLObject)html_macros.$str92$__small_);
        html_macros.$html_strikethrough_head$ = SubLFiles.defconstant("*HTML-STRIKETHROUGH-HEAD*", (SubLObject)html_macros.$str93$_strike_);
        html_macros.$html_strikethrough_tail$ = SubLFiles.defconstant("*HTML-STRIKETHROUGH-TAIL*", (SubLObject)html_macros.$str94$__strike_);
        html_macros.$html_strong_head$ = SubLFiles.defconstant("*HTML-STRONG-HEAD*", (SubLObject)html_macros.$str95$_strong_);
        html_macros.$html_strong_tail$ = SubLFiles.defconstant("*HTML-STRONG-TAIL*", (SubLObject)html_macros.$str96$__strong_);
        html_macros.$html_subscript_head$ = SubLFiles.defconstant("*HTML-SUBSCRIPT-HEAD*", (SubLObject)html_macros.$str97$_sub_);
        html_macros.$html_subscript_tail$ = SubLFiles.defconstant("*HTML-SUBSCRIPT-TAIL*", (SubLObject)html_macros.$str98$__sub_);
        html_macros.$html_superscript_head$ = SubLFiles.defconstant("*HTML-SUPERSCRIPT-HEAD*", (SubLObject)html_macros.$str99$_sup_);
        html_macros.$html_superscript_tail$ = SubLFiles.defconstant("*HTML-SUPERSCRIPT-TAIL*", (SubLObject)html_macros.$str100$__sup_);
        html_macros.$html_teletype_head$ = SubLFiles.defconstant("*HTML-TELETYPE-HEAD*", (SubLObject)html_macros.$str101$_tt_);
        html_macros.$html_teletype_tail$ = SubLFiles.defconstant("*HTML-TELETYPE-TAIL*", (SubLObject)html_macros.$str102$__tt_);
        html_macros.$html_underlined_head$ = SubLFiles.defconstant("*HTML-UNDERLINED-HEAD*", (SubLObject)html_macros.$str103$_u_);
        html_macros.$html_underlined_tail$ = SubLFiles.defconstant("*HTML-UNDERLINED-TAIL*", (SubLObject)html_macros.$str104$__u_);
        html_macros.$html_variable_head$ = SubLFiles.defconstant("*HTML-VARIABLE-HEAD*", (SubLObject)html_macros.$str105$_var_);
        html_macros.$html_variable_tail$ = SubLFiles.defconstant("*HTML-VARIABLE-TAIL*", (SubLObject)html_macros.$str106$__var_);
        html_macros.$html_label_head$ = SubLFiles.defconstant("*HTML-LABEL-HEAD*", (SubLObject)html_macros.$str107$_label);
        html_macros.$html_label_tail$ = SubLFiles.defconstant("*HTML-LABEL-TAIL*", (SubLObject)html_macros.$str108$__label_);
        html_macros.$html_label_access_key$ = SubLFiles.defconstant("*HTML-LABEL-ACCESS-KEY*", (SubLObject)html_macros.$str109$_accesskey_);
        html_macros.$html_label_for$ = SubLFiles.defconstant("*HTML-LABEL-FOR*", (SubLObject)html_macros.$str110$_for_);
        html_macros.$html_style_font_size_smaller$ = SubLFiles.defconstant("*HTML-STYLE-FONT-SIZE-SMALLER*", (SubLObject)html_macros.$str111$font_size__smaller);
        html_macros.$html_style_font_size_larger$ = SubLFiles.defconstant("*HTML-STYLE-FONT-SIZE-LARGER*", (SubLObject)html_macros.$str112$font_size__larger);
        html_macros.$html_definition_list_head$ = SubLFiles.defconstant("*HTML-DEFINITION-LIST-HEAD*", (SubLObject)html_macros.$str113$_dl);
        html_macros.$html_definition_list_tail$ = SubLFiles.defconstant("*HTML-DEFINITION-LIST-TAIL*", (SubLObject)html_macros.$str114$__dl_);
        html_macros.$html_definition_list_term_head$ = SubLFiles.defconstant("*HTML-DEFINITION-LIST-TERM-HEAD*", (SubLObject)html_macros.$str115$_dt_);
        html_macros.$html_definition_list_term_tail$ = SubLFiles.defconstant("*HTML-DEFINITION-LIST-TERM-TAIL*", (SubLObject)html_macros.$str116$__dt_);
        html_macros.$html_definition_list_def_head$ = SubLFiles.defconstant("*HTML-DEFINITION-LIST-DEF-HEAD*", (SubLObject)html_macros.$str117$_dd_);
        html_macros.$html_definition_list_def_tail$ = SubLFiles.defconstant("*HTML-DEFINITION-LIST-DEF-TAIL*", (SubLObject)html_macros.$str118$__dd_);
        html_macros.$html_directory_list_head$ = SubLFiles.defconstant("*HTML-DIRECTORY-LIST-HEAD*", (SubLObject)html_macros.$str119$_dir);
        html_macros.$html_directory_list_tail$ = SubLFiles.defconstant("*HTML-DIRECTORY-LIST-TAIL*", (SubLObject)html_macros.$str120$__dir_);
        html_macros.$html_menu_list_head$ = SubLFiles.defconstant("*HTML-MENU-LIST-HEAD*", (SubLObject)html_macros.$str121$_menu);
        html_macros.$html_menu_list_tail$ = SubLFiles.defconstant("*HTML-MENU-LIST-TAIL*", (SubLObject)html_macros.$str122$__menu_);
        html_macros.$html_ordered_list_head$ = SubLFiles.defconstant("*HTML-ORDERED-LIST-HEAD*", (SubLObject)html_macros.$str123$_ol);
        html_macros.$html_ordered_list_tail$ = SubLFiles.defconstant("*HTML-ORDERED-LIST-TAIL*", (SubLObject)html_macros.$str124$__ol_);
        html_macros.$html_unordered_list_head$ = SubLFiles.defconstant("*HTML-UNORDERED-LIST-HEAD*", (SubLObject)html_macros.$str125$_ul);
        html_macros.$html_unordered_list_tail$ = SubLFiles.defconstant("*HTML-UNORDERED-LIST-TAIL*", (SubLObject)html_macros.$str126$__ul_);
        html_macros.$html_list_compact$ = SubLFiles.defconstant("*HTML-LIST-COMPACT*", (SubLObject)html_macros.$str127$_compact);
        html_macros.$html_list_continue$ = SubLFiles.defconstant("*HTML-LIST-CONTINUE*", (SubLObject)html_macros.$str128$_continue);
        html_macros.$html_list_dingbat$ = SubLFiles.defconstant("*HTML-LIST-DINGBAT*", (SubLObject)html_macros.$str129$_dingbat_);
        html_macros.$html_list_plain$ = SubLFiles.defconstant("*HTML-LIST-PLAIN*", (SubLObject)html_macros.$str130$_plain);
        html_macros.$html_list_seqnum$ = SubLFiles.defconstant("*HTML-LIST-SEQNUM*", (SubLObject)html_macros.$str131$_seqnum_);
        html_macros.$html_list_src$ = SubLFiles.defconstant("*HTML-LIST-SRC*", (SubLObject)html_macros.$str132$_src_);
        html_macros.$html_list_start$ = SubLFiles.defconstant("*HTML-LIST-START*", (SubLObject)html_macros.$str133$_start_);
        html_macros.$html_list_type$ = SubLFiles.defconstant("*HTML-LIST-TYPE*", (SubLObject)html_macros.$str41$_type_);
        html_macros.$html_valid_list_types$ = SubLFiles.defconstant("*HTML-VALID-LIST-TYPES*", (SubLObject)html_macros.$list134);
        html_macros.$html_list_item_head$ = SubLFiles.defconstant("*HTML-LIST-ITEM-HEAD*", (SubLObject)html_macros.$str135$_li);
        html_macros.$html_list_item_tail$ = SubLFiles.defconstant("*HTML-LIST-ITEM-TAIL*", (SubLObject)html_macros.$str136$__li_);
        html_macros.$html_list_item_dingbat$ = SubLFiles.defconstant("*HTML-LIST-ITEM-DINGBAT*", (SubLObject)html_macros.$str129$_dingbat_);
        html_macros.$html_list_item_skip$ = SubLFiles.defconstant("*HTML-LIST-ITEM-SKIP*", (SubLObject)html_macros.$str137$_skip_);
        html_macros.$html_list_item_src$ = SubLFiles.defconstant("*HTML-LIST-ITEM-SRC*", (SubLObject)html_macros.$str132$_src_);
        html_macros.$html_list_item_id$ = SubLFiles.defconstant("*HTML-LIST-ITEM-ID*", (SubLObject)html_macros.$str23$_id_);
        html_macros.$html_list_item_type$ = SubLFiles.defconstant("*HTML-LIST-ITEM-TYPE*", (SubLObject)html_macros.$str41$_type_);
        html_macros.$html_summary_head$ = SubLFiles.defconstant("*HTML-SUMMARY-HEAD*", (SubLObject)html_macros.$str138$_summary);
        html_macros.$html_summary_tail$ = SubLFiles.defconstant("*HTML-SUMMARY-TAIL*", (SubLObject)html_macros.$str139$__summary_);
        html_macros.$html_details_head$ = SubLFiles.defconstant("*HTML-DETAILS-HEAD*", (SubLObject)html_macros.$str140$_details);
        html_macros.$html_details_tail$ = SubLFiles.defconstant("*HTML-DETAILS-TAIL*", (SubLObject)html_macros.$str141$__details_);
        html_macros.$html_form_head$ = SubLFiles.defconstant("*HTML-FORM-HEAD*", (SubLObject)html_macros.$str142$_form);
        html_macros.$html_form_tail$ = SubLFiles.defconstant("*HTML-FORM-TAIL*", (SubLObject)html_macros.$str143$__form_);
        html_macros.$html_form_action$ = SubLFiles.defconstant("*HTML-FORM-ACTION*", (SubLObject)html_macros.$str144$_action_);
        html_macros.$html_form_method$ = SubLFiles.defconstant("*HTML-FORM-METHOD*", (SubLObject)html_macros.$str145$_method_);
        html_macros.$html_form_target$ = SubLFiles.defconstant("*HTML-FORM-TARGET*", (SubLObject)html_macros.$str146$_target_);
        html_macros.$html_form_name$ = SubLFiles.defconstant("*HTML-FORM-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_form_enctype$ = SubLFiles.defconstant("*HTML-FORM-ENCTYPE*", (SubLObject)html_macros.$str147$_enctype_);
        html_macros.$html_form_method_get$ = SubLFiles.defconstant("*HTML-FORM-METHOD-GET*", (SubLObject)html_macros.$str148$get);
        html_macros.$html_form_method_post$ = SubLFiles.defconstant("*HTML-FORM-METHOD-POST*", (SubLObject)html_macros.$str149$post);
        html_macros.$html_blank_target$ = SubLFiles.defconstant("*HTML-BLANK-TARGET*", (SubLObject)html_macros.$str150$_blank);
        html_macros.$html_self_target$ = SubLFiles.defconstant("*HTML-SELF-TARGET*", (SubLObject)html_macros.$str151$_self);
        html_macros.$html_parent_target$ = SubLFiles.defconstant("*HTML-PARENT-TARGET*", (SubLObject)html_macros.$str152$_parent);
        html_macros.$html_top_target$ = SubLFiles.defconstant("*HTML-TOP-TARGET*", (SubLObject)html_macros.$str153$_top);
        html_macros.$html_input_head$ = SubLFiles.defconstant("*HTML-INPUT-HEAD*", (SubLObject)html_macros.$str154$_input);
        html_macros.$html_input_checked$ = SubLFiles.defconstant("*HTML-INPUT-CHECKED*", (SubLObject)html_macros.$str155$_checked);
        html_macros.$html_input_readonly$ = SubLFiles.defconstant("*HTML-INPUT-READONLY*", (SubLObject)html_macros.$str156$_readonly);
        html_macros.$html_input_disabled$ = SubLFiles.defconstant("*HTML-INPUT-DISABLED*", (SubLObject)html_macros.$str157$_disabled);
        html_macros.$html_input_disabledP$ = SubLFiles.defvar("*HTML-INPUT-DISABLED?*", (SubLObject)html_macros.NIL);
        html_macros.$html_input_maxlength$ = SubLFiles.defconstant("*HTML-INPUT-MAXLENGTH*", (SubLObject)html_macros.$str158$_maxlength_);
        html_macros.$html_input_align$ = SubLFiles.defconstant("*HTML-INPUT-ALIGN*", (SubLObject)html_macros.$str16$_align_);
        html_macros.$html_input_border$ = SubLFiles.defconstant("*HTML-INPUT-BORDER*", (SubLObject)html_macros.$str159$_border_);
        html_macros.$html_input_min$ = SubLFiles.defconstant("*HTML-INPUT-MIN*", (SubLObject)html_macros.$str160$_min_);
        html_macros.$html_input_max$ = SubLFiles.defconstant("*HTML-INPUT-MAX*", (SubLObject)html_macros.$str161$_max_);
        html_macros.$html_input_step$ = SubLFiles.defconstant("*HTML-INPUT-STEP*", (SubLObject)html_macros.$str162$_step_);
        html_macros.$html_input_name$ = SubLFiles.defconstant("*HTML-INPUT-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_input_size$ = SubLFiles.defconstant("*HTML-INPUT-SIZE*", (SubLObject)html_macros.$str54$_size_);
        html_macros.$html_input_src$ = SubLFiles.defconstant("*HTML-INPUT-SRC*", (SubLObject)html_macros.$str132$_src_);
        html_macros.$html_input_type$ = SubLFiles.defconstant("*HTML-INPUT-TYPE*", (SubLObject)html_macros.$str41$_type_);
        html_macros.$html_input_style$ = SubLFiles.defconstant("*HTML-INPUT-STYLE*", (SubLObject)html_macros.$str6$_style_);
        html_macros.$html_input_value$ = SubLFiles.defconstant("*HTML-INPUT-VALUE*", (SubLObject)html_macros.$str163$_value_);
        html_macros.$html_input_alt$ = SubLFiles.defconstant("*HTML-INPUT-ALT*", (SubLObject)html_macros.$str164$_alt_);
        html_macros.$html_input_checkbox$ = SubLFiles.defconstant("*HTML-INPUT-CHECKBOX*", (SubLObject)html_macros.$str165$checkbox);
        html_macros.$html_input_button$ = SubLFiles.defconstant("*HTML-INPUT-BUTTON*", (SubLObject)html_macros.$str166$button);
        html_macros.$html_input_hidden$ = SubLFiles.defconstant("*HTML-INPUT-HIDDEN*", (SubLObject)html_macros.$str167$hidden);
        html_macros.$html_input_image$ = SubLFiles.defconstant("*HTML-INPUT-IMAGE*", (SubLObject)html_macros.$str168$image);
        html_macros.$html_input_password$ = SubLFiles.defconstant("*HTML-INPUT-PASSWORD*", (SubLObject)html_macros.$str169$password);
        html_macros.$html_input_radio$ = SubLFiles.defconstant("*HTML-INPUT-RADIO*", (SubLObject)html_macros.$str170$radio);
        html_macros.$html_input_range$ = SubLFiles.defconstant("*HTML-INPUT-RANGE*", (SubLObject)html_macros.$str171$range);
        html_macros.$html_input_reset$ = SubLFiles.defconstant("*HTML-INPUT-RESET*", (SubLObject)html_macros.$str172$reset);
        html_macros.$html_input_submit$ = SubLFiles.defconstant("*HTML-INPUT-SUBMIT*", (SubLObject)html_macros.$str173$submit);
        html_macros.$html_input_text$ = SubLFiles.defconstant("*HTML-INPUT-TEXT*", (SubLObject)html_macros.$str174$text);
        html_macros.$html_select_head$ = SubLFiles.defconstant("*HTML-SELECT-HEAD*", (SubLObject)html_macros.$str175$_select);
        html_macros.$html_select_tail$ = SubLFiles.defconstant("*HTML-SELECT-TAIL*", (SubLObject)html_macros.$str176$__select_);
        html_macros.$html_select_name$ = SubLFiles.defconstant("*HTML-SELECT-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_select_size$ = SubLFiles.defconstant("*HTML-SELECT-SIZE*", (SubLObject)html_macros.$str54$_size_);
        html_macros.$html_select_multiple$ = SubLFiles.defconstant("*HTML-SELECT-MULTIPLE*", (SubLObject)html_macros.$str177$_multiple);
        html_macros.$html_select_onchange$ = SubLFiles.defconstant("*HTML-SELECT-ONCHANGE*", (SubLObject)html_macros.$str178$_onChange_);
        html_macros.$html_option_head$ = SubLFiles.defconstant("*HTML-OPTION-HEAD*", (SubLObject)html_macros.$str179$_option);
        html_macros.$html_option_tail$ = SubLFiles.defconstant("*HTML-OPTION-TAIL*", (SubLObject)html_macros.$str180$);
        html_macros.$html_option_value$ = SubLFiles.defconstant("*HTML-OPTION-VALUE*", (SubLObject)html_macros.$str163$_value_);
        html_macros.$html_option_selected$ = SubLFiles.defconstant("*HTML-OPTION-SELECTED*", (SubLObject)html_macros.$str181$_selected);
        html_macros.$html_optgroup_head$ = SubLFiles.defconstant("*HTML-OPTGROUP-HEAD*", (SubLObject)html_macros.$str182$_optgroup);
        html_macros.$html_optgroup_tail$ = SubLFiles.defconstant("*HTML-OPTGROUP-TAIL*", (SubLObject)html_macros.$str183$__optgroup_);
        html_macros.$html_optgroup_label$ = SubLFiles.defconstant("*HTML-OPTGROUP-LABEL*", (SubLObject)html_macros.$str184$_label_);
        html_macros.$html_select_src$ = SubLFiles.defconstant("*HTML-SELECT-SRC*", (SubLObject)html_macros.$str132$_src_);
        html_macros.$html_select_width$ = SubLFiles.defconstant("*HTML-SELECT-WIDTH*", (SubLObject)html_macros.$str55$_width_);
        html_macros.$html_select_height$ = SubLFiles.defconstant("*HTML-SELECT-HEIGHT*", (SubLObject)html_macros.$str185$_height_);
        html_macros.$html_select_units$ = SubLFiles.defconstant("*HTML-SELECT-UNITS*", (SubLObject)html_macros.$str186$_units_);
        html_macros.$html_option_shape$ = SubLFiles.defconstant("*HTML-OPTION-SHAPE*", (SubLObject)html_macros.$str187$_shape_);
        html_macros.$html_textarea_head$ = SubLFiles.defconstant("*HTML-TEXTAREA-HEAD*", (SubLObject)html_macros.$str188$_textarea);
        html_macros.$html_textarea_tail$ = SubLFiles.defconstant("*HTML-TEXTAREA-TAIL*", (SubLObject)html_macros.$str189$__textarea_);
        html_macros.$html_textarea_name$ = SubLFiles.defconstant("*HTML-TEXTAREA-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_textarea_rows$ = SubLFiles.defconstant("*HTML-TEXTAREA-ROWS*", (SubLObject)html_macros.$str190$_rows_);
        html_macros.$html_textarea_cols$ = SubLFiles.defconstant("*HTML-TEXTAREA-COLS*", (SubLObject)html_macros.$str191$_cols_);
        html_macros.$html_textarea_id$ = SubLFiles.defconstant("*HTML-TEXTAREA-ID*", (SubLObject)html_macros.$str23$_id_);
        html_macros.$html_textarea_style$ = SubLFiles.defconstant("*HTML-TEXTAREA-STYLE*", (SubLObject)html_macros.$str6$_style_);
        html_macros.$html_caption_head$ = SubLFiles.defconstant("*HTML-CAPTION-HEAD*", (SubLObject)html_macros.$str192$_caption);
        html_macros.$html_caption_tail$ = SubLFiles.defconstant("*HTML-CAPTION-TAIL*", (SubLObject)html_macros.$str193$__caption_);
        html_macros.$html_caption_align$ = SubLFiles.defconstant("*HTML-CAPTION-ALIGN*", (SubLObject)html_macros.$str16$_align_);
        html_macros.$html_table_head$ = SubLFiles.defconstant("*HTML-TABLE-HEAD*", (SubLObject)html_macros.$str194$_table);
        html_macros.$html_table_tail$ = SubLFiles.defconstant("*HTML-TABLE-TAIL*", (SubLObject)html_macros.$str195$__table_);
        html_macros.$html_table_noflow$ = SubLFiles.defconstant("*HTML-TABLE-NOFLOW*", (SubLObject)html_macros.$str196$_noflow);
        html_macros.$html_table_nowrap$ = SubLFiles.defconstant("*HTML-TABLE-NOWRAP*", (SubLObject)html_macros.$str197$_nowrap);
        html_macros.$html_table_wrap$ = SubLFiles.defconstant("*HTML-TABLE-WRAP*", (SubLObject)html_macros.$str198$_wrap_);
        html_macros.$html_table_align$ = SubLFiles.defconstant("*HTML-TABLE-ALIGN*", (SubLObject)html_macros.$str16$_align_);
        html_macros.$html_table_border$ = SubLFiles.defconstant("*HTML-TABLE-BORDER*", (SubLObject)html_macros.$str159$_border_);
        html_macros.$html_table_bordercolor$ = SubLFiles.defconstant("*HTML-TABLE-BORDERCOLOR*", (SubLObject)html_macros.$str199$_bordercolor_);
        html_macros.$html_table_cellpadding$ = SubLFiles.defconstant("*HTML-TABLE-CELLPADDING*", (SubLObject)html_macros.$str200$_cellpadding_);
        html_macros.$html_table_cellspacing$ = SubLFiles.defconstant("*HTML-TABLE-CELLSPACING*", (SubLObject)html_macros.$str201$_cellspacing_);
        html_macros.$html_table_colspec$ = SubLFiles.defconstant("*HTML-TABLE-COLSPEC*", (SubLObject)html_macros.$str202$_colspec_);
        html_macros.$html_table_units$ = SubLFiles.defconstant("*HTML-TABLE-UNITS*", (SubLObject)html_macros.$str186$_units_);
        html_macros.$html_table_bgcolor$ = SubLFiles.defconstant("*HTML-TABLE-BGCOLOR*", (SubLObject)html_macros.$str3$_bgcolor_);
        html_macros.$html_table_width$ = SubLFiles.defconstant("*HTML-TABLE-WIDTH*", (SubLObject)html_macros.$str55$_width_);
        html_macros.$html_table_background$ = SubLFiles.defconstant("*HTML-TABLE-BACKGROUND*", (SubLObject)html_macros.$str4$_background_);
        html_macros.$html_table_thead_head$ = SubLFiles.defconstant("*HTML-TABLE-THEAD-HEAD*", (SubLObject)html_macros.$str203$_thead);
        html_macros.$html_table_thead_tail$ = SubLFiles.defconstant("*HTML-TABLE-THEAD-TAIL*", (SubLObject)html_macros.$str204$__thead_);
        html_macros.$html_table_tfoot_head$ = SubLFiles.defconstant("*HTML-TABLE-TFOOT-HEAD*", (SubLObject)html_macros.$str205$_tfoot);
        html_macros.$html_table_tfoot_tail$ = SubLFiles.defconstant("*HTML-TABLE-TFOOT-TAIL*", (SubLObject)html_macros.$str206$__tfoot_);
        html_macros.$html_table_tbody_head$ = SubLFiles.defconstant("*HTML-TABLE-TBODY-HEAD*", (SubLObject)html_macros.$str207$_tbody);
        html_macros.$html_table_tbody_tail$ = SubLFiles.defconstant("*HTML-TABLE-TBODY-TAIL*", (SubLObject)html_macros.$str208$__tbody_);
        html_macros.$html_table_data_head$ = SubLFiles.defconstant("*HTML-TABLE-DATA-HEAD*", (SubLObject)html_macros.$str209$_td);
        html_macros.$html_table_data_tail$ = SubLFiles.defconstant("*HTML-TABLE-DATA-TAIL*", (SubLObject)html_macros.$str210$__td_);
        html_macros.$html_table_header_head$ = SubLFiles.defconstant("*HTML-TABLE-HEADER-HEAD*", (SubLObject)html_macros.$str211$_th);
        html_macros.$html_table_header_tail$ = SubLFiles.defconstant("*HTML-TABLE-HEADER-TAIL*", (SubLObject)html_macros.$str212$__th_);
        html_macros.$html_table_row_head$ = SubLFiles.defconstant("*HTML-TABLE-ROW-HEAD*", (SubLObject)html_macros.$str213$_tr);
        html_macros.$html_table_row_tail$ = SubLFiles.defconstant("*HTML-TABLE-ROW-TAIL*", (SubLObject)html_macros.$str214$__tr_);
        html_macros.$html_table_row_bgcolor$ = SubLFiles.defconstant("*HTML-TABLE-ROW-BGCOLOR*", (SubLObject)html_macros.$str3$_bgcolor_);
        html_macros.$html_table_row_height$ = SubLFiles.defconstant("*HTML-TABLE-ROW-HEIGHT*", (SubLObject)html_macros.$str185$_height_);
        html_macros.$html_table_row_title$ = SubLFiles.defconstant("*HTML-TABLE-ROW-TITLE*", (SubLObject)html_macros.$str15$_title_);
        html_macros.$html_table_row_name$ = SubLFiles.defconstant("*HTML-TABLE-ROW-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_table_data_nowrap$ = SubLFiles.defconstant("*HTML-TABLE-DATA-NOWRAP*", (SubLObject)html_macros.$str197$_nowrap);
        html_macros.$html_table_data_align$ = SubLFiles.defconstant("*HTML-TABLE-DATA-ALIGN*", (SubLObject)html_macros.$str16$_align_);
        html_macros.$html_table_data_colspan$ = SubLFiles.defconstant("*HTML-TABLE-DATA-COLSPAN*", (SubLObject)html_macros.$str215$_colspan_);
        html_macros.$html_table_data_rowspan$ = SubLFiles.defconstant("*HTML-TABLE-DATA-ROWSPAN*", (SubLObject)html_macros.$str216$_rowspan_);
        html_macros.$html_table_data_valign$ = SubLFiles.defconstant("*HTML-TABLE-DATA-VALIGN*", (SubLObject)html_macros.$str217$_valign_);
        html_macros.$html_table_data_bgcolor$ = SubLFiles.defconstant("*HTML-TABLE-DATA-BGCOLOR*", (SubLObject)html_macros.$str3$_bgcolor_);
        html_macros.$html_table_data_width$ = SubLFiles.defconstant("*HTML-TABLE-DATA-WIDTH*", (SubLObject)html_macros.$str55$_width_);
        html_macros.$html_table_data_height$ = SubLFiles.defconstant("*HTML-TABLE-DATA-HEIGHT*", (SubLObject)html_macros.$str185$_height_);
        html_macros.$html_atomic_tail$ = SubLFiles.defconstant("*HTML-ATOMIC-TAIL*", (SubLObject)html_macros.$str218$__);
        html_macros.$html_protocol_mailto$ = SubLFiles.defconstant("*HTML-PROTOCOL-MAILTO*", (SubLObject)html_macros.$str219$mailto_);
        html_macros.$html_protocol_file$ = SubLFiles.defconstant("*HTML-PROTOCOL-FILE*", (SubLObject)html_macros.$str220$file_);
        html_macros.$html_protocol_ftp$ = SubLFiles.defconstant("*HTML-PROTOCOL-FTP*", (SubLObject)html_macros.$str221$ftp_);
        html_macros.$html_anchor_head$ = SubLFiles.defconstant("*HTML-ANCHOR-HEAD*", (SubLObject)html_macros.$str222$_a);
        html_macros.$html_anchor_tail$ = SubLFiles.defconstant("*HTML-ANCHOR-TAIL*", (SubLObject)html_macros.$str223$__a_);
        html_macros.$html_anchor_href$ = SubLFiles.defconstant("*HTML-ANCHOR-HREF*", (SubLObject)html_macros.$str42$_href_);
        html_macros.$html_anchor_name$ = SubLFiles.defconstant("*HTML-ANCHOR-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_anchor_id$ = SubLFiles.defconstant("*HTML-ANCHOR-ID*", (SubLObject)html_macros.$str23$_id_);
        html_macros.$html_anchor_title$ = SubLFiles.defconstant("*HTML-ANCHOR-TITLE*", (SubLObject)html_macros.$str15$_title_);
        html_macros.$html_anchor_target$ = SubLFiles.defconstant("*HTML-ANCHOR-TARGET*", (SubLObject)html_macros.$str146$_target_);
        html_macros.$html_anchor_style$ = SubLFiles.defconstant("*HTML-ANCHOR-STYLE*", (SubLObject)html_macros.$str6$_style_);
        html_macros.$html_anchor_onmouseover$ = SubLFiles.defconstant("*HTML-ANCHOR-ONMOUSEOVER*", (SubLObject)html_macros.$str224$_onmouseover_);
        html_macros.$html_anchor_onmouseout$ = SubLFiles.defconstant("*HTML-ANCHOR-ONMOUSEOUT*", (SubLObject)html_macros.$str225$_onmouseout_);
        html_macros.$html_anchor_onmouseup$ = SubLFiles.defconstant("*HTML-ANCHOR-ONMOUSEUP*", (SubLObject)html_macros.$str226$_onmouseup_);
        html_macros.$html_anchor_onmousedown$ = SubLFiles.defconstant("*HTML-ANCHOR-ONMOUSEDOWN*", (SubLObject)html_macros.$str227$_onmousedown_);
        html_macros.$html_area_head$ = SubLFiles.defconstant("*HTML-AREA-HEAD*", (SubLObject)html_macros.$str228$_area);
        html_macros.$html_area_nohref$ = SubLFiles.defconstant("*HTML-AREA-NOHREF*", (SubLObject)html_macros.$str229$_nohref);
        html_macros.$html_area_alt$ = SubLFiles.defconstant("*HTML-AREA-ALT*", (SubLObject)html_macros.$str164$_alt_);
        html_macros.$html_area_co_ords$ = SubLFiles.defconstant("*HTML-AREA-CO-ORDS*", (SubLObject)html_macros.$str230$_co_ords_);
        html_macros.$html_area_href$ = SubLFiles.defconstant("*HTML-AREA-HREF*", (SubLObject)html_macros.$str42$_href_);
        html_macros.$html_area_shape$ = SubLFiles.defconstant("*HTML-AREA-SHAPE*", (SubLObject)html_macros.$str187$_shape_);
        html_macros.$html_area_target$ = SubLFiles.defconstant("*HTML-AREA-TARGET*", (SubLObject)html_macros.$str146$_target_);
        html_macros.$html_basefont_head$ = SubLFiles.defconstant("*HTML-BASEFONT-HEAD*", (SubLObject)html_macros.$str231$_basefont);
        html_macros.$html_basefont_size$ = SubLFiles.defconstant("*HTML-BASEFONT-SIZE*", (SubLObject)html_macros.$str54$_size_);
        html_macros.$html_basefont_color$ = SubLFiles.defconstant("*HTML-BASEFONT-COLOR*", (SubLObject)html_macros.$str83$_color_);
        html_macros.$html_blink_head$ = SubLFiles.defconstant("*HTML-BLINK-HEAD*", (SubLObject)html_macros.$str232$_blink_);
        html_macros.$html_blink_tail$ = SubLFiles.defconstant("*HTML-BLINK-TAIL*", (SubLObject)html_macros.$str233$__blink_);
        html_macros.$html_comment_head$ = SubLFiles.defconstant("*HTML-COMMENT-HEAD*", (SubLObject)html_macros.$str234$____);
        html_macros.$html_comment_tail$ = SubLFiles.defconstant("*HTML-COMMENT-TAIL*", (SubLObject)html_macros.$str235$___);
        html_macros.$html_frame_head$ = SubLFiles.defconstant("*HTML-FRAME-HEAD*", (SubLObject)html_macros.$str236$_frame);
        html_macros.$html_frame_frameborder$ = SubLFiles.defconstant("*HTML-FRAME-FRAMEBORDER*", (SubLObject)html_macros.$str237$_frameborder_);
        html_macros.$html_frame_noresize$ = SubLFiles.defconstant("*HTML-FRAME-NORESIZE*", (SubLObject)html_macros.$str238$_noresize);
        html_macros.$html_frame_marginheight$ = SubLFiles.defconstant("*HTML-FRAME-MARGINHEIGHT*", (SubLObject)html_macros.$str239$_marginheight_);
        html_macros.$html_frame_marginwidth$ = SubLFiles.defconstant("*HTML-FRAME-MARGINWIDTH*", (SubLObject)html_macros.$str240$_marginwidth_);
        html_macros.$html_frame_name$ = SubLFiles.defconstant("*HTML-FRAME-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_frame_scrolling$ = SubLFiles.defconstant("*HTML-FRAME-SCROLLING*", (SubLObject)html_macros.$str241$_scrolling_);
        html_macros.$html_frame_src$ = SubLFiles.defconstant("*HTML-FRAME-SRC*", (SubLObject)html_macros.$str132$_src_);
        html_macros.$html_frameset_head$ = SubLFiles.defconstant("*HTML-FRAMESET-HEAD*", (SubLObject)html_macros.$str242$_frameset);
        html_macros.$html_frameset_tail$ = SubLFiles.defconstant("*HTML-FRAMESET-TAIL*", (SubLObject)html_macros.$str243$__frameset_);
        html_macros.$html_frameset_cols$ = SubLFiles.defconstant("*HTML-FRAMESET-COLS*", (SubLObject)html_macros.$str191$_cols_);
        html_macros.$html_frameset_rows$ = SubLFiles.defconstant("*HTML-FRAMESET-ROWS*", (SubLObject)html_macros.$str190$_rows_);
        html_macros.$html_frameset_frameborder$ = SubLFiles.defconstant("*HTML-FRAMESET-FRAMEBORDER*", (SubLObject)html_macros.$str237$_frameborder_);
        html_macros.$html_iframe_head$ = SubLFiles.defconstant("*HTML-IFRAME-HEAD*", (SubLObject)html_macros.$str244$_iframe);
        html_macros.$html_iframe_tail$ = SubLFiles.defconstant("*HTML-IFRAME-TAIL*", (SubLObject)html_macros.$str245$__iframe_);
        html_macros.$html_iframe_align$ = SubLFiles.defconstant("*HTML-IFRAME-ALIGN*", (SubLObject)html_macros.$str16$_align_);
        html_macros.$html_iframe_frameborder$ = SubLFiles.defconstant("*HTML-IFRAME-FRAMEBORDER*", (SubLObject)html_macros.$str237$_frameborder_);
        html_macros.$html_iframe_height$ = SubLFiles.defconstant("*HTML-IFRAME-HEIGHT*", (SubLObject)html_macros.$str185$_height_);
        html_macros.$html_iframe_marginheight$ = SubLFiles.defconstant("*HTML-IFRAME-MARGINHEIGHT*", (SubLObject)html_macros.$str239$_marginheight_);
        html_macros.$html_iframe_marginwidth$ = SubLFiles.defconstant("*HTML-IFRAME-MARGINWIDTH*", (SubLObject)html_macros.$str240$_marginwidth_);
        html_macros.$html_iframe_name$ = SubLFiles.defconstant("*HTML-IFRAME-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_iframe_scrolling$ = SubLFiles.defconstant("*HTML-IFRAME-SCROLLING*", (SubLObject)html_macros.$str241$_scrolling_);
        html_macros.$html_iframe_src$ = SubLFiles.defconstant("*HTML-IFRAME-SRC*", (SubLObject)html_macros.$str132$_src_);
        html_macros.$html_iframe_width$ = SubLFiles.defconstant("*HTML-IFRAME-WIDTH*", (SubLObject)html_macros.$str55$_width_);
        html_macros.$html_image_head$ = SubLFiles.defconstant("*HTML-IMAGE-HEAD*", (SubLObject)html_macros.$str246$_img);
        html_macros.$html_image_tail$ = SubLFiles.defconstant("*HTML-IMAGE-TAIL*", (SubLObject)html_macros.$str247$__img_);
        html_macros.$html_image_name$ = SubLFiles.defconstant("*HTML-IMAGE-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_image_ismap$ = SubLFiles.defconstant("*HTML-IMAGE-ISMAP*", (SubLObject)html_macros.$str248$_ismap);
        html_macros.$html_image_height$ = SubLFiles.defconstant("*HTML-IMAGE-HEIGHT*", (SubLObject)html_macros.$str185$_height_);
        html_macros.$html_image_width$ = SubLFiles.defconstant("*HTML-IMAGE-WIDTH*", (SubLObject)html_macros.$str55$_width_);
        html_macros.$html_image_alt$ = SubLFiles.defconstant("*HTML-IMAGE-ALT*", (SubLObject)html_macros.$str164$_alt_);
        html_macros.$html_image_align$ = SubLFiles.defconstant("*HTML-IMAGE-ALIGN*", (SubLObject)html_macros.$str16$_align_);
        html_macros.$html_image_border$ = SubLFiles.defconstant("*HTML-IMAGE-BORDER*", (SubLObject)html_macros.$str159$_border_);
        html_macros.$html_image_src$ = SubLFiles.defconstant("*HTML-IMAGE-SRC*", (SubLObject)html_macros.$str132$_src_);
        html_macros.$html_image_style$ = SubLFiles.defconstant("*HTML-IMAGE-STYLE*", (SubLObject)html_macros.$str6$_style_);
        html_macros.$html_applet_head$ = SubLFiles.defconstant("*HTML-APPLET-HEAD*", (SubLObject)html_macros.$str249$_applet_);
        html_macros.$html_applet_tail$ = SubLFiles.defconstant("*HTML-APPLET-TAIL*", (SubLObject)html_macros.$str250$__applet_);
        html_macros.$html_applet_code$ = SubLFiles.defconstant("*HTML-APPLET-CODE*", (SubLObject)html_macros.$str251$_code_);
        html_macros.$html_applet_codebase$ = SubLFiles.defconstant("*HTML-APPLET-CODEBASE*", (SubLObject)html_macros.$str252$_codebase_);
        html_macros.$html_applet_archive$ = SubLFiles.defconstant("*HTML-APPLET-ARCHIVE*", (SubLObject)html_macros.$str253$_archive_);
        html_macros.$html_applet_alt$ = SubLFiles.defconstant("*HTML-APPLET-ALT*", (SubLObject)html_macros.$str164$_alt_);
        html_macros.$html_applet_align$ = SubLFiles.defconstant("*HTML-APPLET-ALIGN*", (SubLObject)html_macros.$str16$_align_);
        html_macros.$html_applet_name$ = SubLFiles.defconstant("*HTML-APPLET-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_applet_id$ = SubLFiles.defconstant("*HTML-APPLET-ID*", (SubLObject)html_macros.$str23$_id_);
        html_macros.$html_applet_height$ = SubLFiles.defconstant("*HTML-APPLET-HEIGHT*", (SubLObject)html_macros.$str185$_height_);
        html_macros.$html_applet_width$ = SubLFiles.defconstant("*HTML-APPLET-WIDTH*", (SubLObject)html_macros.$str55$_width_);
        html_macros.$html_param_head$ = SubLFiles.defconstant("*HTML-PARAM-HEAD*", (SubLObject)html_macros.$str254$_param_);
        html_macros.$html_param_name$ = SubLFiles.defconstant("*HTML-PARAM-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_param_value$ = SubLFiles.defconstant("*HTML-PARAM-VALUE*", (SubLObject)html_macros.$str163$_value_);
        html_macros.$html_map_head$ = SubLFiles.defconstant("*HTML-MAP-HEAD*", (SubLObject)html_macros.$str255$_map);
        html_macros.$html_map_tail$ = SubLFiles.defconstant("*HTML-MAP-TAIL*", (SubLObject)html_macros.$str256$__map_);
        html_macros.$html_map_name$ = SubLFiles.defconstant("*HTML-MAP-NAME*", (SubLObject)html_macros.$str34$_name_);
        html_macros.$html_no_break_head$ = SubLFiles.defconstant("*HTML-NO-BREAK-HEAD*", (SubLObject)html_macros.$str257$_nobr_);
        html_macros.$html_no_break_tail$ = SubLFiles.defconstant("*HTML-NO-BREAK-TAIL*", (SubLObject)html_macros.$str258$__nobr_);
        html_macros.$html_no_frames_head$ = SubLFiles.defconstant("*HTML-NO-FRAMES-HEAD*", (SubLObject)html_macros.$str259$_noframes_);
        html_macros.$html_no_frames_tail$ = SubLFiles.defconstant("*HTML-NO-FRAMES-TAIL*", (SubLObject)html_macros.$str260$__noframes_);
        html_macros.$html_object_head$ = SubLFiles.defconstant("*HTML-OBJECT-HEAD*", (SubLObject)html_macros.$str261$_object_);
        html_macros.$html_object_tail$ = SubLFiles.defconstant("*HTML-OBJECT-TAIL*", (SubLObject)html_macros.$str262$__object_);
        html_macros.$html_object_classid$ = SubLFiles.defconstant("*HTML-OBJECT-CLASSID*", (SubLObject)html_macros.$str263$_classid_);
        html_macros.$html_object_codebase$ = SubLFiles.defconstant("*HTML-OBJECT-CODEBASE*", (SubLObject)html_macros.$str252$_codebase_);
        html_macros.$html_object_codetype$ = SubLFiles.defconstant("*HTML-OBJECT-CODETYPE*", (SubLObject)html_macros.$str264$_codetype_);
        html_macros.$html_object_data$ = SubLFiles.defconstant("*HTML-OBJECT-DATA*", (SubLObject)html_macros.$str265$_data_);
        html_macros.$html_object_type$ = SubLFiles.defconstant("*HTML-OBJECT-TYPE*", (SubLObject)html_macros.$str41$_type_);
        html_macros.$html_object_archive$ = SubLFiles.defconstant("*HTML-OBJECT-ARCHIVE*", (SubLObject)html_macros.$str253$_archive_);
        html_macros.$html_object_id$ = SubLFiles.defconstant("*HTML-OBJECT-ID*", (SubLObject)html_macros.$str23$_id_);
        html_macros.$html_object_class$ = SubLFiles.defconstant("*HTML-OBJECT-CLASS*", (SubLObject)html_macros.$str5$_class_);
        html_macros.$html_object_align$ = SubLFiles.defconstant("*HTML-OBJECT-ALIGN*", (SubLObject)html_macros.$str16$_align_);
        html_macros.$html_object_width$ = SubLFiles.defconstant("*HTML-OBJECT-WIDTH*", (SubLObject)html_macros.$str55$_width_);
        html_macros.$html_object_height$ = SubLFiles.defconstant("*HTML-OBJECT-HEIGHT*", (SubLObject)html_macros.$str185$_height_);
        html_macros.$html_object_border$ = SubLFiles.defconstant("*HTML-OBJECT-BORDER*", (SubLObject)html_macros.$str159$_border_);
        html_macros.$html_object_hspace$ = SubLFiles.defconstant("*HTML-OBJECT-HSPACE*", (SubLObject)html_macros.$str266$_hspace_);
        html_macros.$html_object_vspace$ = SubLFiles.defconstant("*HTML-OBJECT-VSPACE*", (SubLObject)html_macros.$str267$_vspace_);
        html_macros.$html_script_head$ = SubLFiles.defconstant("*HTML-SCRIPT-HEAD*", (SubLObject)html_macros.$str268$_script);
        html_macros.$html_script_tail$ = SubLFiles.defconstant("*HTML-SCRIPT-TAIL*", (SubLObject)html_macros.$str269$__script_);
        html_macros.$html_script_language$ = SubLFiles.defconstant("*HTML-SCRIPT-LANGUAGE*", (SubLObject)html_macros.$str270$_language_);
        html_macros.$html_script_src$ = SubLFiles.defconstant("*HTML-SCRIPT-SRC*", (SubLObject)html_macros.$str132$_src_);
        html_macros.$html_script_type$ = SubLFiles.defconstant("*HTML-SCRIPT-TYPE*", (SubLObject)html_macros.$str41$_type_);
        html_macros.$html_script_javascript$ = SubLFiles.defconstant("*HTML-SCRIPT-JAVASCRIPT*", (SubLObject)html_macros.$str271$JavaScript);
        html_macros.$html_noscript_head$ = SubLFiles.defconstant("*HTML-NOSCRIPT-HEAD*", (SubLObject)html_macros.$str272$_noscript);
        html_macros.$html_noscript_tail$ = SubLFiles.defconstant("*HTML-NOSCRIPT-TAIL*", (SubLObject)html_macros.$str273$__noscript_);
        html_macros.$html_word_break$ = SubLFiles.defconstant("*HTML-WORD-BREAK*", (SubLObject)html_macros.$str274$_wbr_);
        html_macros.$html_color_white$ = SubLFiles.defconstant("*HTML-COLOR-WHITE*", (SubLObject)html_macros.$str275$_ffffff);
        html_macros.$html_color_black$ = SubLFiles.defconstant("*HTML-COLOR-BLACK*", (SubLObject)html_macros.$str276$_000000);
        html_macros.$html_color_dark_grey$ = SubLFiles.defconstant("*HTML-COLOR-DARK-GREY*", (SubLObject)html_macros.$str277$_999999);
        html_macros.$html_color_light_grey$ = SubLFiles.defconstant("*HTML-COLOR-LIGHT-GREY*", (SubLObject)html_macros.$str278$_cccccc);
        html_macros.$html_color_lighter_grey$ = SubLFiles.defconstant("*HTML-COLOR-LIGHTER-GREY*", (SubLObject)html_macros.$str279$_dddddd);
        html_macros.$html_color_lightest_grey$ = SubLFiles.defconstant("*HTML-COLOR-LIGHTEST-GREY*", (SubLObject)html_macros.$str280$_eeeeee);
        html_macros.$html_color_yellowish_gray$ = SubLFiles.defconstant("*HTML-COLOR-YELLOWISH-GRAY*", (SubLObject)html_macros.$str281$_eeeee4);
        html_macros.$html_color_sat_red$ = SubLFiles.defconstant("*HTML-COLOR-SAT-RED*", (SubLObject)html_macros.$str282$_ff0000);
        html_macros.$html_color_dark_red$ = SubLFiles.defconstant("*HTML-COLOR-DARK-RED*", (SubLObject)html_macros.$str283$_996666);
        html_macros.$html_color_medium_red$ = SubLFiles.defconstant("*HTML-COLOR-MEDIUM-RED*", (SubLObject)html_macros.$str284$_ff8888);
        html_macros.$html_color_medium_dark_red$ = SubLFiles.defconstant("*HTML-COLOR-MEDIUM-DARK-RED*", (SubLObject)html_macros.$str285$_cc0000);
        html_macros.$html_color_light_red$ = SubLFiles.defconstant("*HTML-COLOR-LIGHT-RED*", (SubLObject)html_macros.$str286$_eeaaaa);
        html_macros.$html_color_lighter_red$ = SubLFiles.defconstant("*HTML-COLOR-LIGHTER-RED*", (SubLObject)html_macros.$str287$_ffbbbb);
        html_macros.$html_color_sat_green$ = SubLFiles.defconstant("*HTML-COLOR-SAT-GREEN*", (SubLObject)html_macros.$str288$_00ff00);
        html_macros.$html_color_dark_green$ = SubLFiles.defconstant("*HTML-COLOR-DARK-GREEN*", (SubLObject)html_macros.$str289$_669966);
        html_macros.$html_color_darker_green$ = SubLFiles.defconstant("*HTML-COLOR-DARKER-GREEN*", (SubLObject)html_macros.$str290$_335533);
        html_macros.$html_color_light_green$ = SubLFiles.defconstant("*HTML-COLOR-LIGHT-GREEN*", (SubLObject)html_macros.$str291$_aaeeaa);
        html_macros.$html_color_lighter_green$ = SubLFiles.defconstant("*HTML-COLOR-LIGHTER-GREEN*", (SubLObject)html_macros.$str292$_bbffbb);
        html_macros.$html_color_sat_blue$ = SubLFiles.defconstant("*HTML-COLOR-SAT-BLUE*", (SubLObject)html_macros.$str293$_0000ff);
        html_macros.$html_color_dark_blue$ = SubLFiles.defconstant("*HTML-COLOR-DARK-BLUE*", (SubLObject)html_macros.$str294$_668899);
        html_macros.$html_color_light_blue$ = SubLFiles.defconstant("*HTML-COLOR-LIGHT-BLUE*", (SubLObject)html_macros.$str295$_aaccee);
        html_macros.$html_color_lighter_blue$ = SubLFiles.defconstant("*HTML-COLOR-LIGHTER-BLUE*", (SubLObject)html_macros.$str296$_bbddff);
        html_macros.$html_color_sat_yellow$ = SubLFiles.defconstant("*HTML-COLOR-SAT-YELLOW*", (SubLObject)html_macros.$str297$_ffff00);
        html_macros.$html_color_dark_yellow$ = SubLFiles.defconstant("*HTML-COLOR-DARK-YELLOW*", (SubLObject)html_macros.$str298$_999966);
        html_macros.$html_color_light_yellow$ = SubLFiles.defconstant("*HTML-COLOR-LIGHT-YELLOW*", (SubLObject)html_macros.$str299$_eeeeaa);
        html_macros.$html_color_lighter_yellow$ = SubLFiles.defconstant("*HTML-COLOR-LIGHTER-YELLOW*", (SubLObject)html_macros.$str300$_ffffbb);
        html_macros.$html_color_darker_purple$ = SubLFiles.defconstant("*HTML-COLOR-DARKER-PURPLE*", (SubLObject)html_macros.$str301$_9900bb);
        html_macros.$html_color_dark_purple$ = SubLFiles.defconstant("*HTML-COLOR-DARK-PURPLE*", (SubLObject)html_macros.$str302$_996699);
        html_macros.$html_color_light_purple$ = SubLFiles.defconstant("*HTML-COLOR-LIGHT-PURPLE*", (SubLObject)html_macros.$str303$_ddbbff);
        html_macros.$html_color_lighter_purple$ = SubLFiles.defconstant("*HTML-COLOR-LIGHTER-PURPLE*", (SubLObject)html_macros.$str304$_eeccff);
        html_macros.$html_color_cyan$ = SubLFiles.deflexical("*HTML-COLOR-CYAN*", (SubLObject)html_macros.$str305$_00ffff);
        html_macros.$html_color_light_cyan$ = SubLFiles.deflexical("*HTML-COLOR-LIGHT-CYAN*", (SubLObject)html_macros.$str306$_e0ffff);
        html_macros.$html_color_cyc_logo_violet$ = SubLFiles.deflexical("*HTML-COLOR-CYC-LOGO-VIOLET*", (SubLObject)html_macros.$str307$_9933cc);
        html_macros.$html_color_cyc_logo_light_violet$ = SubLFiles.deflexical("*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*", (SubLObject)html_macros.$str308$_f0d3ff);
        html_macros.$html_color_cyc_logo_lighter_violet$ = SubLFiles.deflexical("*HTML-COLOR-CYC-LOGO-LIGHTER-VIOLET*", (SubLObject)html_macros.$str309$_f4e0ff);
        html_macros.$html_color_cyc_logo_light_blue$ = SubLFiles.deflexical("*HTML-COLOR-CYC-LOGO-LIGHT-BLUE*", (SubLObject)html_macros.$str310$_e0e5ff);
        html_macros.$html_color_cyc_logo_lighter_blue$ = SubLFiles.deflexical("*HTML-COLOR-CYC-LOGO-LIGHTER-BLUE*", (SubLObject)html_macros.$str311$_e6f0ff);
        html_macros.$html_color_map$ = SubLFiles.defparameter("*HTML-COLOR-MAP*", (SubLObject)ConsesLow.list(new SubLObject[] { reader.bq_cons((SubLObject)html_macros.$kw312$BLACK, html_macros.$html_color_black$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw313$BLUE, html_macros.$html_color_sat_blue$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw314$GREEN, html_macros.$html_color_sat_green$.getGlobalValue()), html_macros.$list315, reader.bq_cons((SubLObject)html_macros.$kw316$RED, html_macros.$html_color_sat_red$.getGlobalValue()), html_macros.$list317, reader.bq_cons((SubLObject)html_macros.$kw318$YELLOW, html_macros.$html_color_sat_yellow$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw319$WHITE, html_macros.$html_color_white$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw320$DARK_BLUE, html_macros.$html_color_dark_blue$.getGlobalValue()), html_macros.$list321, reader.bq_cons((SubLObject)html_macros.$kw322$LIGHTER_BLUE, html_macros.$html_color_lighter_blue$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw323$DARK_RED, html_macros.$html_color_dark_red$.getGlobalValue()), html_macros.$list324, html_macros.$list325, reader.bq_cons((SubLObject)html_macros.$kw326$LIGHTER_RED, html_macros.$html_color_lighter_red$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw327$DARK_YELLOW, html_macros.$html_color_dark_yellow$.getGlobalValue()), html_macros.$list328, reader.bq_cons((SubLObject)html_macros.$kw329$LIGHTER_YELLOW, html_macros.$html_color_lighter_yellow$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw330$DARK_GRAY, html_macros.$html_color_dark_grey$.getGlobalValue()), html_macros.$list331, reader.bq_cons((SubLObject)html_macros.$kw332$LIGHT_GREY, html_macros.$html_color_light_grey$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw333$LIGHTER_GRAY, html_macros.$html_color_lighter_grey$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw334$LIGHTEST_GREY, html_macros.$html_color_lightest_grey$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw335$DARK_PURPLE, html_macros.$html_color_dark_purple$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw336$LIGHT_PURPLE, html_macros.$html_color_light_purple$.getGlobalValue()), reader.bq_cons((SubLObject)html_macros.$kw337$LIGHTER_PURPLE, html_macros.$html_color_lighter_purple$.getGlobalValue()) }));
        html_macros.$html_alternating_class1$ = SubLFiles.defparameter("*HTML-ALTERNATING-CLASS1*", (SubLObject)html_macros.$str338$cyc_alternate_class1);
        html_macros.$html_alternating_class2$ = SubLFiles.defparameter("*HTML-ALTERNATING-CLASS2*", (SubLObject)html_macros.$str339$cyc_alternate_class2);
        html_macros.$html_known_dom_events$ = SubLFiles.defconstant("*HTML-KNOWN-DOM-EVENTS*", (SubLObject)html_macros.$list340);
        html_macros.$basic_skin_class$ = SubLFiles.deflexical("*BASIC-SKIN-CLASS*", (SubLObject)html_macros.$str341$yui_skin_sam);
        html_macros.$html_escapes_map$ = SubLFiles.defparameter("*HTML-ESCAPES-MAP*", (SubLObject)html_macros.$list342);
        html_macros.$html_prin1_string_escapes_map$ = SubLFiles.deflexical("*HTML-PRIN1-STRING-ESCAPES-MAP*", (SubLObject)html_macros.$list343);
        html_macros.$html_escapes_map_for_showing_newlines$ = SubLFiles.deflexical("*HTML-ESCAPES-MAP-FOR-SHOWING-NEWLINES*", (SubLObject)html_macros.$list344);
        html_macros.$html_safe_print$ = SubLFiles.defparameter("*HTML-SAFE-PRINT*", (SubLObject)html_macros.T);
        html_macros.$html_preserve_breaks$ = SubLFiles.defparameter("*HTML-PRESERVE-BREAKS*", (SubLObject)html_macros.NIL);
        html_macros.$html_inside_bodyP$ = SubLFiles.defparameter("*HTML-INSIDE-BODY?*", (SubLObject)html_macros.NIL);
        html_macros.$within_html_pre$ = SubLFiles.defparameter("*WITHIN-HTML-PRE*", (SubLObject)html_macros.NIL);
        html_macros.$suppress_html_source_readability_terpriP$ = SubLFiles.defparameter("*SUPPRESS-HTML-SOURCE-READABILITY-TERPRI?*", (SubLObject)html_macros.NIL);
        html_macros.$html_id_space_id_generator$ = SubLFiles.defparameter("*HTML-ID-SPACE-ID-GENERATOR*", (SubLObject)html_macros.NIL);
        html_macros.$html_form_field_uniquifier_code$ = SubLFiles.defparameter("*HTML-FORM-FIELD-UNIQUIFIER-CODE*", (SubLObject)html_macros.NIL);
        html_macros.$html_form_field_uniquifier_isg$ = SubLFiles.deflexical("*HTML-FORM-FIELD-UNIQUIFIER-ISG*", (SubLObject)(maybeDefault((SubLObject)html_macros.$sym624$_HTML_FORM_FIELD_UNIQUIFIER_ISG_, html_macros.$html_form_field_uniquifier_isg$, html_macros.NIL)));
        html_macros.$within_html_form$ = SubLFiles.defparameter("*WITHIN-HTML-FORM*", (SubLObject)html_macros.NIL);
        html_macros.$html_indent_table_max$ = SubLFiles.defparameter("*HTML-INDENT-TABLE-MAX*", (SubLObject)html_macros.NIL);
        html_macros.$html_handler_property$ = SubLFiles.deflexical("*HTML-HANDLER-PROPERTY*", (SubLObject)(maybeDefault((SubLObject)html_macros.$sym1022$_HTML_HANDLER_PROPERTY_, html_macros.$html_handler_property$, html_macros.$kw1023$HTML_HANDLER)));
        html_macros.$xml_handler_property$ = SubLFiles.deflexical("*XML-HANDLER-PROPERTY*", (SubLObject)(maybeDefault((SubLObject)html_macros.$sym1024$_XML_HANDLER_PROPERTY_, html_macros.$xml_handler_property$, html_macros.$kw1025$XML_HANDLER)));
        html_macros.$json_handler_property$ = SubLFiles.deflexical("*JSON-HANDLER-PROPERTY*", (SubLObject)(maybeDefault((SubLObject)html_macros.$sym1026$_JSON_HANDLER_PROPERTY_, html_macros.$json_handler_property$, html_macros.$kw1027$JSON_HANDLER)));
        html_macros.$handler_mime_types$ = SubLFiles.deflexical("*HANDLER-MIME-TYPES*", maybeDefault((SubLObject)html_macros.$sym1033$_HANDLER_MIME_TYPES_, html_macros.$handler_mime_types$, ()->(Hashtables.make_hash_table((SubLObject)html_macros.$int1034$200, (SubLObject)html_macros.EQ, (SubLObject)html_macros.UNPROVIDED))));
        return (SubLObject)html_macros.NIL;
    }
    
    public static SubLObject setup_html_macros_file() {
        utilities_macros.register_html_state_variable((SubLObject)html_macros.$sym0$_HTML_DEFAULT_BGCOLOR_);
        access_macros.register_macro_helper((SubLObject)html_macros.$sym403$HTML_HEAD_CONTENT_TYPE, (SubLObject)html_macros.$sym404$HTML_HEAD);
        utilities_macros.register_html_state_variable((SubLObject)html_macros.$sym616$_HTML_FORM_FIELD_UNIQUIFIER_CODE_);
        access_macros.register_macro_helper((SubLObject)html_macros.$sym617$WITH_HTML_UNIQUE_FORM_FIELDS, (SubLObject)html_macros.$sym618$HTML_FANCY_FORM);
        access_macros.register_macro_helper((SubLObject)html_macros.$sym623$NEXT_HTML_FORM_FIELD_UNIQUIFIER_CODE, (SubLObject)html_macros.$sym617$WITH_HTML_UNIQUE_FORM_FIELDS);
        subl_macro_promotions.declare_defglobal((SubLObject)html_macros.$sym624$_HTML_FORM_FIELD_UNIQUIFIER_ISG_);
        access_macros.register_macro_helper((SubLObject)html_macros.$sym625$EMBED_FORM_FIELD_CODE, (SubLObject)html_macros.$sym617$WITH_HTML_UNIQUE_FORM_FIELDS);
        access_macros.register_macro_helper((SubLObject)html_macros.$sym622$GET_FORM_FIELD_CODE, (SubLObject)html_macros.$sym627$WITH_HTML_UNIQUE_FORM_FIELD_DECODING);
        access_macros.register_macro_helper((SubLObject)html_macros.$sym922$HTML_EMBEDDED_IMAGE_DATA_SRC, (SubLObject)html_macros.$sym924$HTML_EMBEDDED_IMAGE);
        subl_macro_promotions.declare_defglobal((SubLObject)html_macros.$sym1022$_HTML_HANDLER_PROPERTY_);
        subl_macro_promotions.declare_defglobal((SubLObject)html_macros.$sym1024$_XML_HANDLER_PROPERTY_);
        subl_macro_promotions.declare_defglobal((SubLObject)html_macros.$sym1026$_JSON_HANDLER_PROPERTY_);
        access_macros.register_macro_helper((SubLObject)html_macros.$sym1031$NOTE_CGI_HANDLER_FUNCTION, (SubLObject)html_macros.$sym1032$DEFINE_HTML_HANDLER);
        subl_macro_promotions.declare_defglobal((SubLObject)html_macros.$sym1033$_HANDLER_MIME_TYPES_);
        return (SubLObject)html_macros.NIL;
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
        me = (SubLFile)new html_macros();
        html_macros.$html_stream$ = null;
        html_macros.$html_default_bgcolor$ = null;
        html_macros.$html_force_ie_standards_mode$ = null;
        html_macros.$html_body_head$ = null;
        html_macros.$html_body_tail$ = null;
        html_macros.$html_body_bgcolor$ = null;
        html_macros.$html_body_background$ = null;
        html_macros.$html_body_class$ = null;
        html_macros.$html_body_style$ = null;
        html_macros.$html_body_text$ = null;
        html_macros.$html_body_link$ = null;
        html_macros.$html_body_alink$ = null;
        html_macros.$html_body_vlink$ = null;
        html_macros.$html_body_onload$ = null;
        html_macros.$html_body_onresize$ = null;
        html_macros.$html_div_head$ = null;
        html_macros.$html_div_tail$ = null;
        html_macros.$html_div_class$ = null;
        html_macros.$html_div_style$ = null;
        html_macros.$html_div_title$ = null;
        html_macros.$html_div_align$ = null;
        html_macros.$html_div_onload$ = null;
        html_macros.$html_span_head$ = null;
        html_macros.$html_span_tail$ = null;
        html_macros.$html_span_class$ = null;
        html_macros.$html_span_style$ = null;
        html_macros.$html_head_head$ = null;
        html_macros.$html_head_tail$ = null;
        html_macros.$html_html_head$ = null;
        html_macros.$html_html_tail$ = null;
        html_macros.$html_attribute_id$ = null;
        html_macros.$html_attribute_class$ = null;
        html_macros.$html_attribute_style$ = null;
        html_macros.$html_attribute_title$ = null;
        html_macros.$html_event_attribute_onclick$ = null;
        html_macros.$html_event_attribute_onblur$ = null;
        html_macros.$html_event_attribute_onfocus$ = null;
        html_macros.$html_event_attribute_onkeyup$ = null;
        html_macros.$html_event_attribute_onkeydown$ = null;
        html_macros.$html_event_attribute_onkeypress$ = null;
        html_macros.$html_meta_head$ = null;
        html_macros.$html_meta_http_equiv$ = null;
        html_macros.$html_meta_content$ = null;
        html_macros.$html_meta_scheme$ = null;
        html_macros.$html_meta_name$ = null;
        html_macros.$html_meta_lang$ = null;
        html_macros.$html_meta_dir$ = null;
        html_macros.$html_title_head$ = null;
        html_macros.$html_title_tail$ = null;
        html_macros.$html_link_head$ = null;
        html_macros.$html_link_rel$ = null;
        html_macros.$html_link_type$ = null;
        html_macros.$html_link_href$ = null;
        html_macros.$html_link_media$ = null;
        html_macros.$html_link_title$ = null;
        html_macros.$html_base_head$ = null;
        html_macros.$html_base_href$ = null;
        html_macros.$html_style_head$ = null;
        html_macros.$html_style_tail$ = null;
        html_macros.$html_blockquote_head$ = null;
        html_macros.$html_blockquote_tail$ = null;
        html_macros.$html_center_head$ = null;
        html_macros.$html_center_tail$ = null;
        html_macros.$html_heading_head$ = null;
        html_macros.$html_heading_tail$ = null;
        html_macros.$html_hr_head$ = null;
        html_macros.$html_hr_size$ = null;
        html_macros.$html_hr_width$ = null;
        html_macros.$html_line_break_atomic$ = null;
        html_macros.$html_line_break_head$ = null;
        html_macros.$html_line_break_tail$ = null;
        html_macros.$html_line_break_clear$ = null;
        html_macros.$html_line_break$ = null;
        html_macros.$html_paragraph_head$ = null;
        html_macros.$html_paragraph_tail$ = null;
        html_macros.$html_plaintext_head$ = null;
        html_macros.$html_plaintext_tail$ = null;
        html_macros.$html_preformatted_head$ = null;
        html_macros.$html_preformatted_tail$ = null;
        html_macros.$html_address_head$ = null;
        html_macros.$html_address_tail$ = null;
        html_macros.$html_big_head$ = null;
        html_macros.$html_big_tail$ = null;
        html_macros.$html_bold_head$ = null;
        html_macros.$html_bold_tail$ = null;
        html_macros.$html_cite_head$ = null;
        html_macros.$html_cite_tail$ = null;
        html_macros.$html_code_head$ = null;
        html_macros.$html_code_tail$ = null;
        html_macros.$html_definition_head$ = null;
        html_macros.$html_definition_tail$ = null;
        html_macros.$html_emphasized_head$ = null;
        html_macros.$html_emphasized_tail$ = null;
        html_macros.$html_font_head$ = null;
        html_macros.$html_font_tail$ = null;
        html_macros.$html_font_size$ = null;
        html_macros.$html_font_color$ = null;
        html_macros.$html_font_face$ = null;
        html_macros.$html_italic_head$ = null;
        html_macros.$html_italic_tail$ = null;
        html_macros.$html_keyboard_head$ = null;
        html_macros.$html_keyboard_tail$ = null;
        html_macros.$html_sample_head$ = null;
        html_macros.$html_sample_tail$ = null;
        html_macros.$html_small_head$ = null;
        html_macros.$html_small_tail$ = null;
        html_macros.$html_strikethrough_head$ = null;
        html_macros.$html_strikethrough_tail$ = null;
        html_macros.$html_strong_head$ = null;
        html_macros.$html_strong_tail$ = null;
        html_macros.$html_subscript_head$ = null;
        html_macros.$html_subscript_tail$ = null;
        html_macros.$html_superscript_head$ = null;
        html_macros.$html_superscript_tail$ = null;
        html_macros.$html_teletype_head$ = null;
        html_macros.$html_teletype_tail$ = null;
        html_macros.$html_underlined_head$ = null;
        html_macros.$html_underlined_tail$ = null;
        html_macros.$html_variable_head$ = null;
        html_macros.$html_variable_tail$ = null;
        html_macros.$html_label_head$ = null;
        html_macros.$html_label_tail$ = null;
        html_macros.$html_label_access_key$ = null;
        html_macros.$html_label_for$ = null;
        html_macros.$html_style_font_size_smaller$ = null;
        html_macros.$html_style_font_size_larger$ = null;
        html_macros.$html_definition_list_head$ = null;
        html_macros.$html_definition_list_tail$ = null;
        html_macros.$html_definition_list_term_head$ = null;
        html_macros.$html_definition_list_term_tail$ = null;
        html_macros.$html_definition_list_def_head$ = null;
        html_macros.$html_definition_list_def_tail$ = null;
        html_macros.$html_directory_list_head$ = null;
        html_macros.$html_directory_list_tail$ = null;
        html_macros.$html_menu_list_head$ = null;
        html_macros.$html_menu_list_tail$ = null;
        html_macros.$html_ordered_list_head$ = null;
        html_macros.$html_ordered_list_tail$ = null;
        html_macros.$html_unordered_list_head$ = null;
        html_macros.$html_unordered_list_tail$ = null;
        html_macros.$html_list_compact$ = null;
        html_macros.$html_list_continue$ = null;
        html_macros.$html_list_dingbat$ = null;
        html_macros.$html_list_plain$ = null;
        html_macros.$html_list_seqnum$ = null;
        html_macros.$html_list_src$ = null;
        html_macros.$html_list_start$ = null;
        html_macros.$html_list_type$ = null;
        html_macros.$html_valid_list_types$ = null;
        html_macros.$html_list_item_head$ = null;
        html_macros.$html_list_item_tail$ = null;
        html_macros.$html_list_item_dingbat$ = null;
        html_macros.$html_list_item_skip$ = null;
        html_macros.$html_list_item_src$ = null;
        html_macros.$html_list_item_id$ = null;
        html_macros.$html_list_item_type$ = null;
        html_macros.$html_summary_head$ = null;
        html_macros.$html_summary_tail$ = null;
        html_macros.$html_details_head$ = null;
        html_macros.$html_details_tail$ = null;
        html_macros.$html_form_head$ = null;
        html_macros.$html_form_tail$ = null;
        html_macros.$html_form_action$ = null;
        html_macros.$html_form_method$ = null;
        html_macros.$html_form_target$ = null;
        html_macros.$html_form_name$ = null;
        html_macros.$html_form_enctype$ = null;
        html_macros.$html_form_method_get$ = null;
        html_macros.$html_form_method_post$ = null;
        html_macros.$html_blank_target$ = null;
        html_macros.$html_self_target$ = null;
        html_macros.$html_parent_target$ = null;
        html_macros.$html_top_target$ = null;
        html_macros.$html_input_head$ = null;
        html_macros.$html_input_checked$ = null;
        html_macros.$html_input_readonly$ = null;
        html_macros.$html_input_disabled$ = null;
        html_macros.$html_input_disabledP$ = null;
        html_macros.$html_input_maxlength$ = null;
        html_macros.$html_input_align$ = null;
        html_macros.$html_input_border$ = null;
        html_macros.$html_input_min$ = null;
        html_macros.$html_input_max$ = null;
        html_macros.$html_input_step$ = null;
        html_macros.$html_input_name$ = null;
        html_macros.$html_input_size$ = null;
        html_macros.$html_input_src$ = null;
        html_macros.$html_input_type$ = null;
        html_macros.$html_input_style$ = null;
        html_macros.$html_input_value$ = null;
        html_macros.$html_input_alt$ = null;
        html_macros.$html_input_checkbox$ = null;
        html_macros.$html_input_button$ = null;
        html_macros.$html_input_hidden$ = null;
        html_macros.$html_input_image$ = null;
        html_macros.$html_input_password$ = null;
        html_macros.$html_input_radio$ = null;
        html_macros.$html_input_range$ = null;
        html_macros.$html_input_reset$ = null;
        html_macros.$html_input_submit$ = null;
        html_macros.$html_input_text$ = null;
        html_macros.$html_select_head$ = null;
        html_macros.$html_select_tail$ = null;
        html_macros.$html_select_name$ = null;
        html_macros.$html_select_size$ = null;
        html_macros.$html_select_multiple$ = null;
        html_macros.$html_select_onchange$ = null;
        html_macros.$html_option_head$ = null;
        html_macros.$html_option_tail$ = null;
        html_macros.$html_option_value$ = null;
        html_macros.$html_option_selected$ = null;
        html_macros.$html_optgroup_head$ = null;
        html_macros.$html_optgroup_tail$ = null;
        html_macros.$html_optgroup_label$ = null;
        html_macros.$html_select_src$ = null;
        html_macros.$html_select_width$ = null;
        html_macros.$html_select_height$ = null;
        html_macros.$html_select_units$ = null;
        html_macros.$html_option_shape$ = null;
        html_macros.$html_textarea_head$ = null;
        html_macros.$html_textarea_tail$ = null;
        html_macros.$html_textarea_name$ = null;
        html_macros.$html_textarea_rows$ = null;
        html_macros.$html_textarea_cols$ = null;
        html_macros.$html_textarea_id$ = null;
        html_macros.$html_textarea_style$ = null;
        html_macros.$html_caption_head$ = null;
        html_macros.$html_caption_tail$ = null;
        html_macros.$html_caption_align$ = null;
        html_macros.$html_table_head$ = null;
        html_macros.$html_table_tail$ = null;
        html_macros.$html_table_noflow$ = null;
        html_macros.$html_table_nowrap$ = null;
        html_macros.$html_table_wrap$ = null;
        html_macros.$html_table_align$ = null;
        html_macros.$html_table_border$ = null;
        html_macros.$html_table_bordercolor$ = null;
        html_macros.$html_table_cellpadding$ = null;
        html_macros.$html_table_cellspacing$ = null;
        html_macros.$html_table_colspec$ = null;
        html_macros.$html_table_units$ = null;
        html_macros.$html_table_bgcolor$ = null;
        html_macros.$html_table_width$ = null;
        html_macros.$html_table_background$ = null;
        html_macros.$html_table_thead_head$ = null;
        html_macros.$html_table_thead_tail$ = null;
        html_macros.$html_table_tfoot_head$ = null;
        html_macros.$html_table_tfoot_tail$ = null;
        html_macros.$html_table_tbody_head$ = null;
        html_macros.$html_table_tbody_tail$ = null;
        html_macros.$html_table_data_head$ = null;
        html_macros.$html_table_data_tail$ = null;
        html_macros.$html_table_header_head$ = null;
        html_macros.$html_table_header_tail$ = null;
        html_macros.$html_table_row_head$ = null;
        html_macros.$html_table_row_tail$ = null;
        html_macros.$html_table_row_bgcolor$ = null;
        html_macros.$html_table_row_height$ = null;
        html_macros.$html_table_row_title$ = null;
        html_macros.$html_table_row_name$ = null;
        html_macros.$html_table_data_nowrap$ = null;
        html_macros.$html_table_data_align$ = null;
        html_macros.$html_table_data_colspan$ = null;
        html_macros.$html_table_data_rowspan$ = null;
        html_macros.$html_table_data_valign$ = null;
        html_macros.$html_table_data_bgcolor$ = null;
        html_macros.$html_table_data_width$ = null;
        html_macros.$html_table_data_height$ = null;
        html_macros.$html_atomic_tail$ = null;
        html_macros.$html_protocol_mailto$ = null;
        html_macros.$html_protocol_file$ = null;
        html_macros.$html_protocol_ftp$ = null;
        html_macros.$html_anchor_head$ = null;
        html_macros.$html_anchor_tail$ = null;
        html_macros.$html_anchor_href$ = null;
        html_macros.$html_anchor_name$ = null;
        html_macros.$html_anchor_id$ = null;
        html_macros.$html_anchor_title$ = null;
        html_macros.$html_anchor_target$ = null;
        html_macros.$html_anchor_style$ = null;
        html_macros.$html_anchor_onmouseover$ = null;
        html_macros.$html_anchor_onmouseout$ = null;
        html_macros.$html_anchor_onmouseup$ = null;
        html_macros.$html_anchor_onmousedown$ = null;
        html_macros.$html_area_head$ = null;
        html_macros.$html_area_nohref$ = null;
        html_macros.$html_area_alt$ = null;
        html_macros.$html_area_co_ords$ = null;
        html_macros.$html_area_href$ = null;
        html_macros.$html_area_shape$ = null;
        html_macros.$html_area_target$ = null;
        html_macros.$html_basefont_head$ = null;
        html_macros.$html_basefont_size$ = null;
        html_macros.$html_basefont_color$ = null;
        html_macros.$html_blink_head$ = null;
        html_macros.$html_blink_tail$ = null;
        html_macros.$html_comment_head$ = null;
        html_macros.$html_comment_tail$ = null;
        html_macros.$html_frame_head$ = null;
        html_macros.$html_frame_frameborder$ = null;
        html_macros.$html_frame_noresize$ = null;
        html_macros.$html_frame_marginheight$ = null;
        html_macros.$html_frame_marginwidth$ = null;
        html_macros.$html_frame_name$ = null;
        html_macros.$html_frame_scrolling$ = null;
        html_macros.$html_frame_src$ = null;
        html_macros.$html_frameset_head$ = null;
        html_macros.$html_frameset_tail$ = null;
        html_macros.$html_frameset_cols$ = null;
        html_macros.$html_frameset_rows$ = null;
        html_macros.$html_frameset_frameborder$ = null;
        html_macros.$html_iframe_head$ = null;
        html_macros.$html_iframe_tail$ = null;
        html_macros.$html_iframe_align$ = null;
        html_macros.$html_iframe_frameborder$ = null;
        html_macros.$html_iframe_height$ = null;
        html_macros.$html_iframe_marginheight$ = null;
        html_macros.$html_iframe_marginwidth$ = null;
        html_macros.$html_iframe_name$ = null;
        html_macros.$html_iframe_scrolling$ = null;
        html_macros.$html_iframe_src$ = null;
        html_macros.$html_iframe_width$ = null;
        html_macros.$html_image_head$ = null;
        html_macros.$html_image_tail$ = null;
        html_macros.$html_image_name$ = null;
        html_macros.$html_image_ismap$ = null;
        html_macros.$html_image_height$ = null;
        html_macros.$html_image_width$ = null;
        html_macros.$html_image_alt$ = null;
        html_macros.$html_image_align$ = null;
        html_macros.$html_image_border$ = null;
        html_macros.$html_image_src$ = null;
        html_macros.$html_image_style$ = null;
        html_macros.$html_applet_head$ = null;
        html_macros.$html_applet_tail$ = null;
        html_macros.$html_applet_code$ = null;
        html_macros.$html_applet_codebase$ = null;
        html_macros.$html_applet_archive$ = null;
        html_macros.$html_applet_alt$ = null;
        html_macros.$html_applet_align$ = null;
        html_macros.$html_applet_name$ = null;
        html_macros.$html_applet_id$ = null;
        html_macros.$html_applet_height$ = null;
        html_macros.$html_applet_width$ = null;
        html_macros.$html_param_head$ = null;
        html_macros.$html_param_name$ = null;
        html_macros.$html_param_value$ = null;
        html_macros.$html_map_head$ = null;
        html_macros.$html_map_tail$ = null;
        html_macros.$html_map_name$ = null;
        html_macros.$html_no_break_head$ = null;
        html_macros.$html_no_break_tail$ = null;
        html_macros.$html_no_frames_head$ = null;
        html_macros.$html_no_frames_tail$ = null;
        html_macros.$html_object_head$ = null;
        html_macros.$html_object_tail$ = null;
        html_macros.$html_object_classid$ = null;
        html_macros.$html_object_codebase$ = null;
        html_macros.$html_object_codetype$ = null;
        html_macros.$html_object_data$ = null;
        html_macros.$html_object_type$ = null;
        html_macros.$html_object_archive$ = null;
        html_macros.$html_object_id$ = null;
        html_macros.$html_object_class$ = null;
        html_macros.$html_object_align$ = null;
        html_macros.$html_object_width$ = null;
        html_macros.$html_object_height$ = null;
        html_macros.$html_object_border$ = null;
        html_macros.$html_object_hspace$ = null;
        html_macros.$html_object_vspace$ = null;
        html_macros.$html_script_head$ = null;
        html_macros.$html_script_tail$ = null;
        html_macros.$html_script_language$ = null;
        html_macros.$html_script_src$ = null;
        html_macros.$html_script_type$ = null;
        html_macros.$html_script_javascript$ = null;
        html_macros.$html_noscript_head$ = null;
        html_macros.$html_noscript_tail$ = null;
        html_macros.$html_word_break$ = null;
        html_macros.$html_color_white$ = null;
        html_macros.$html_color_black$ = null;
        html_macros.$html_color_dark_grey$ = null;
        html_macros.$html_color_light_grey$ = null;
        html_macros.$html_color_lighter_grey$ = null;
        html_macros.$html_color_lightest_grey$ = null;
        html_macros.$html_color_yellowish_gray$ = null;
        html_macros.$html_color_sat_red$ = null;
        html_macros.$html_color_dark_red$ = null;
        html_macros.$html_color_medium_red$ = null;
        html_macros.$html_color_medium_dark_red$ = null;
        html_macros.$html_color_light_red$ = null;
        html_macros.$html_color_lighter_red$ = null;
        html_macros.$html_color_sat_green$ = null;
        html_macros.$html_color_dark_green$ = null;
        html_macros.$html_color_darker_green$ = null;
        html_macros.$html_color_light_green$ = null;
        html_macros.$html_color_lighter_green$ = null;
        html_macros.$html_color_sat_blue$ = null;
        html_macros.$html_color_dark_blue$ = null;
        html_macros.$html_color_light_blue$ = null;
        html_macros.$html_color_lighter_blue$ = null;
        html_macros.$html_color_sat_yellow$ = null;
        html_macros.$html_color_dark_yellow$ = null;
        html_macros.$html_color_light_yellow$ = null;
        html_macros.$html_color_lighter_yellow$ = null;
        html_macros.$html_color_darker_purple$ = null;
        html_macros.$html_color_dark_purple$ = null;
        html_macros.$html_color_light_purple$ = null;
        html_macros.$html_color_lighter_purple$ = null;
        html_macros.$html_color_cyan$ = null;
        html_macros.$html_color_light_cyan$ = null;
        html_macros.$html_color_cyc_logo_violet$ = null;
        html_macros.$html_color_cyc_logo_light_violet$ = null;
        html_macros.$html_color_cyc_logo_lighter_violet$ = null;
        html_macros.$html_color_cyc_logo_light_blue$ = null;
        html_macros.$html_color_cyc_logo_lighter_blue$ = null;
        html_macros.$html_color_map$ = null;
        html_macros.$html_alternating_class1$ = null;
        html_macros.$html_alternating_class2$ = null;
        html_macros.$html_known_dom_events$ = null;
        html_macros.$basic_skin_class$ = null;
        html_macros.$html_escapes_map$ = null;
        html_macros.$html_prin1_string_escapes_map$ = null;
        html_macros.$html_escapes_map_for_showing_newlines$ = null;
        html_macros.$html_safe_print$ = null;
        html_macros.$html_preserve_breaks$ = null;
        html_macros.$html_inside_bodyP$ = null;
        html_macros.$within_html_pre$ = null;
        html_macros.$suppress_html_source_readability_terpriP$ = null;
        html_macros.$html_id_space_id_generator$ = null;
        html_macros.$html_form_field_uniquifier_code$ = null;
        html_macros.$html_form_field_uniquifier_isg$ = null;
        html_macros.$within_html_form$ = null;
        html_macros.$html_indent_table_max$ = null;
        html_macros.$html_handler_property$ = null;
        html_macros.$xml_handler_property$ = null;
        html_macros.$json_handler_property$ = null;
        html_macros.$handler_mime_types$ = null;
        $sym0$_HTML_DEFAULT_BGCOLOR_ = SubLObjectFactory.makeSymbol("*HTML-DEFAULT-BGCOLOR*");
        $str1$_body = SubLObjectFactory.makeString("<body");
        $str2$__body_ = SubLObjectFactory.makeString("</body>");
        $str3$_bgcolor_ = SubLObjectFactory.makeString(" bgcolor=");
        $str4$_background_ = SubLObjectFactory.makeString(" background=");
        $str5$_class_ = SubLObjectFactory.makeString(" class=");
        $str6$_style_ = SubLObjectFactory.makeString(" style=");
        $str7$_text_ = SubLObjectFactory.makeString(" text=");
        $str8$_link_ = SubLObjectFactory.makeString(" link=");
        $str9$_alink_ = SubLObjectFactory.makeString(" alink=");
        $str10$_vlink_ = SubLObjectFactory.makeString(" vlink=");
        $str11$_onLoad_ = SubLObjectFactory.makeString(" onLoad=");
        $str12$_onResize_ = SubLObjectFactory.makeString(" onResize=");
        $str13$_div = SubLObjectFactory.makeString("<div");
        $str14$__div_ = SubLObjectFactory.makeString("</div>");
        $str15$_title_ = SubLObjectFactory.makeString(" title=");
        $str16$_align_ = SubLObjectFactory.makeString(" align=");
        $str17$_span = SubLObjectFactory.makeString("<span");
        $str18$__span_ = SubLObjectFactory.makeString("</span>");
        $str19$_head_ = SubLObjectFactory.makeString("<head>");
        $str20$__head_ = SubLObjectFactory.makeString("</head>");
        $str21$_html_ = SubLObjectFactory.makeString("<html>");
        $str22$__html_ = SubLObjectFactory.makeString("</html>");
        $str23$_id_ = SubLObjectFactory.makeString(" id=");
        $str24$_onclick_ = SubLObjectFactory.makeString(" onclick=");
        $str25$_onblur_ = SubLObjectFactory.makeString(" onblur=");
        $str26$_onfocus_ = SubLObjectFactory.makeString(" onfocus=");
        $str27$_onkeyup_ = SubLObjectFactory.makeString(" onkeyup=");
        $str28$_onkeydown_ = SubLObjectFactory.makeString(" onkeydown=");
        $str29$_onkeypress_ = SubLObjectFactory.makeString(" onkeypress=");
        $str30$_meta = SubLObjectFactory.makeString("<meta");
        $str31$_http_equiv_ = SubLObjectFactory.makeString(" http-equiv=");
        $str32$_content_ = SubLObjectFactory.makeString(" content=");
        $str33$_scheme_ = SubLObjectFactory.makeString(" scheme=");
        $str34$_name_ = SubLObjectFactory.makeString(" name=");
        $str35$_lang_ = SubLObjectFactory.makeString(" lang=");
        $str36$_dir_ = SubLObjectFactory.makeString(" dir=");
        $str37$_title_ = SubLObjectFactory.makeString("<title>");
        $str38$__title_ = SubLObjectFactory.makeString("</title>");
        $str39$_link = SubLObjectFactory.makeString("<link");
        $str40$_rel_ = SubLObjectFactory.makeString(" rel=");
        $str41$_type_ = SubLObjectFactory.makeString(" type=");
        $str42$_href_ = SubLObjectFactory.makeString(" href=");
        $str43$_media_ = SubLObjectFactory.makeString(" media=");
        $str44$_base = SubLObjectFactory.makeString("<base");
        $str45$_style_ = SubLObjectFactory.makeString("<style>");
        $str46$__style_ = SubLObjectFactory.makeString("</style>");
        $str47$_blockquote_ = SubLObjectFactory.makeString("<blockquote>");
        $str48$__blockquote_ = SubLObjectFactory.makeString("</blockquote>");
        $str49$_center_ = SubLObjectFactory.makeString("<center>");
        $str50$__center_ = SubLObjectFactory.makeString("</center>");
        $str51$_h = SubLObjectFactory.makeString("<h");
        $str52$__h = SubLObjectFactory.makeString("</h");
        $str53$_hr = SubLObjectFactory.makeString("<hr");
        $str54$_size_ = SubLObjectFactory.makeString(" size=");
        $str55$_width_ = SubLObjectFactory.makeString(" width=");
        $str56$_br___ = SubLObjectFactory.makeString("<br />");
        $str57$_br = SubLObjectFactory.makeString("<br");
        $str58$__br_ = SubLObjectFactory.makeString("</br>");
        $str59$_clear_ = SubLObjectFactory.makeString(" clear=");
        $str60$_br_ = SubLObjectFactory.makeString("<br>");
        $str61$_p_ = SubLObjectFactory.makeString("<p>");
        $str62$__p_ = SubLObjectFactory.makeString("</p>");
        $str63$_plaintext_ = SubLObjectFactory.makeString("<plaintext>");
        $str64$__plaintext_ = SubLObjectFactory.makeString("</plaintext>");
        $str65$_pre_ = SubLObjectFactory.makeString("<pre>");
        $str66$__pre_ = SubLObjectFactory.makeString("</pre>");
        $str67$_address_ = SubLObjectFactory.makeString("<address>");
        $str68$__address_ = SubLObjectFactory.makeString("</address>");
        $str69$_big_ = SubLObjectFactory.makeString("<big>");
        $str70$__big_ = SubLObjectFactory.makeString("</big>");
        $str71$_b_ = SubLObjectFactory.makeString("<b>");
        $str72$__b_ = SubLObjectFactory.makeString("</b>");
        $str73$_cite_ = SubLObjectFactory.makeString("<cite>");
        $str74$__cite_ = SubLObjectFactory.makeString("</cite>");
        $str75$_code_ = SubLObjectFactory.makeString("<code>");
        $str76$__code_ = SubLObjectFactory.makeString("</code>");
        $str77$_dfn_ = SubLObjectFactory.makeString("<dfn>");
        $str78$__dfn_ = SubLObjectFactory.makeString("</dfn>");
        $str79$_em_ = SubLObjectFactory.makeString("<em>");
        $str80$__em_ = SubLObjectFactory.makeString("</em>");
        $str81$_font = SubLObjectFactory.makeString("<font");
        $str82$__font_ = SubLObjectFactory.makeString("</font>");
        $str83$_color_ = SubLObjectFactory.makeString(" color=");
        $str84$_face_ = SubLObjectFactory.makeString(" face=");
        $str85$_i_ = SubLObjectFactory.makeString("<i>");
        $str86$__i_ = SubLObjectFactory.makeString("</i>");
        $str87$_kbd_ = SubLObjectFactory.makeString("<kbd>");
        $str88$__kbd_ = SubLObjectFactory.makeString("</kbd>");
        $str89$_samp_ = SubLObjectFactory.makeString("<samp>");
        $str90$__samp_ = SubLObjectFactory.makeString("</samp>");
        $str91$_small_ = SubLObjectFactory.makeString("<small>");
        $str92$__small_ = SubLObjectFactory.makeString("</small>");
        $str93$_strike_ = SubLObjectFactory.makeString("<strike>");
        $str94$__strike_ = SubLObjectFactory.makeString("</strike>");
        $str95$_strong_ = SubLObjectFactory.makeString("<strong>");
        $str96$__strong_ = SubLObjectFactory.makeString("</strong>");
        $str97$_sub_ = SubLObjectFactory.makeString("<sub>");
        $str98$__sub_ = SubLObjectFactory.makeString("</sub>");
        $str99$_sup_ = SubLObjectFactory.makeString("<sup>");
        $str100$__sup_ = SubLObjectFactory.makeString("</sup>");
        $str101$_tt_ = SubLObjectFactory.makeString("<tt>");
        $str102$__tt_ = SubLObjectFactory.makeString("</tt>");
        $str103$_u_ = SubLObjectFactory.makeString("<u>");
        $str104$__u_ = SubLObjectFactory.makeString("</u>");
        $str105$_var_ = SubLObjectFactory.makeString("<var>");
        $str106$__var_ = SubLObjectFactory.makeString("</var>");
        $str107$_label = SubLObjectFactory.makeString("<label");
        $str108$__label_ = SubLObjectFactory.makeString("</label>");
        $str109$_accesskey_ = SubLObjectFactory.makeString(" accesskey=");
        $str110$_for_ = SubLObjectFactory.makeString(" for=");
        $str111$font_size__smaller = SubLObjectFactory.makeString("font-size: smaller");
        $str112$font_size__larger = SubLObjectFactory.makeString("font-size: larger");
        $str113$_dl = SubLObjectFactory.makeString("<dl");
        $str114$__dl_ = SubLObjectFactory.makeString("</dl>");
        $str115$_dt_ = SubLObjectFactory.makeString("<dt>");
        $str116$__dt_ = SubLObjectFactory.makeString("</dt>");
        $str117$_dd_ = SubLObjectFactory.makeString("<dd>");
        $str118$__dd_ = SubLObjectFactory.makeString("</dd>");
        $str119$_dir = SubLObjectFactory.makeString("<dir");
        $str120$__dir_ = SubLObjectFactory.makeString("</dir>");
        $str121$_menu = SubLObjectFactory.makeString("<menu");
        $str122$__menu_ = SubLObjectFactory.makeString("</menu>");
        $str123$_ol = SubLObjectFactory.makeString("<ol");
        $str124$__ol_ = SubLObjectFactory.makeString("</ol>");
        $str125$_ul = SubLObjectFactory.makeString("<ul");
        $str126$__ul_ = SubLObjectFactory.makeString("</ul>");
        $str127$_compact = SubLObjectFactory.makeString(" compact");
        $str128$_continue = SubLObjectFactory.makeString(" continue");
        $str129$_dingbat_ = SubLObjectFactory.makeString(" dingbat=");
        $str130$_plain = SubLObjectFactory.makeString(" plain");
        $str131$_seqnum_ = SubLObjectFactory.makeString(" seqnum=");
        $str132$_src_ = SubLObjectFactory.makeString(" src=");
        $str133$_start_ = SubLObjectFactory.makeString(" start=");
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("I"), (SubLObject)SubLObjectFactory.makeString("i"), (SubLObject)SubLObjectFactory.makeString("1"));
        $str135$_li = SubLObjectFactory.makeString("<li");
        $str136$__li_ = SubLObjectFactory.makeString("</li>");
        $str137$_skip_ = SubLObjectFactory.makeString(" skip=");
        $str138$_summary = SubLObjectFactory.makeString("<summary");
        $str139$__summary_ = SubLObjectFactory.makeString("</summary>");
        $str140$_details = SubLObjectFactory.makeString("<details");
        $str141$__details_ = SubLObjectFactory.makeString("</details>");
        $str142$_form = SubLObjectFactory.makeString("<form");
        $str143$__form_ = SubLObjectFactory.makeString("</form>");
        $str144$_action_ = SubLObjectFactory.makeString(" action=");
        $str145$_method_ = SubLObjectFactory.makeString(" method=");
        $str146$_target_ = SubLObjectFactory.makeString(" target=");
        $str147$_enctype_ = SubLObjectFactory.makeString(" enctype=");
        $str148$get = SubLObjectFactory.makeString("get");
        $str149$post = SubLObjectFactory.makeString("post");
        $str150$_blank = SubLObjectFactory.makeString("_blank");
        $str151$_self = SubLObjectFactory.makeString("_self");
        $str152$_parent = SubLObjectFactory.makeString("_parent");
        $str153$_top = SubLObjectFactory.makeString("_top");
        $str154$_input = SubLObjectFactory.makeString("<input");
        $str155$_checked = SubLObjectFactory.makeString(" checked");
        $str156$_readonly = SubLObjectFactory.makeString(" readonly");
        $str157$_disabled = SubLObjectFactory.makeString(" disabled");
        $str158$_maxlength_ = SubLObjectFactory.makeString(" maxlength=");
        $str159$_border_ = SubLObjectFactory.makeString(" border=");
        $str160$_min_ = SubLObjectFactory.makeString(" min=");
        $str161$_max_ = SubLObjectFactory.makeString(" max=");
        $str162$_step_ = SubLObjectFactory.makeString(" step=");
        $str163$_value_ = SubLObjectFactory.makeString(" value=");
        $str164$_alt_ = SubLObjectFactory.makeString(" alt=");
        $str165$checkbox = SubLObjectFactory.makeString("checkbox");
        $str166$button = SubLObjectFactory.makeString("button");
        $str167$hidden = SubLObjectFactory.makeString("hidden");
        $str168$image = SubLObjectFactory.makeString("image");
        $str169$password = SubLObjectFactory.makeString("password");
        $str170$radio = SubLObjectFactory.makeString("radio");
        $str171$range = SubLObjectFactory.makeString("range");
        $str172$reset = SubLObjectFactory.makeString("reset");
        $str173$submit = SubLObjectFactory.makeString("submit");
        $str174$text = SubLObjectFactory.makeString("text");
        $str175$_select = SubLObjectFactory.makeString("<select");
        $str176$__select_ = SubLObjectFactory.makeString("</select>");
        $str177$_multiple = SubLObjectFactory.makeString(" multiple");
        $str178$_onChange_ = SubLObjectFactory.makeString(" onChange=");
        $str179$_option = SubLObjectFactory.makeString("<option");
        $str180$ = SubLObjectFactory.makeString("");
        $str181$_selected = SubLObjectFactory.makeString(" selected");
        $str182$_optgroup = SubLObjectFactory.makeString("<optgroup");
        $str183$__optgroup_ = SubLObjectFactory.makeString("</optgroup>");
        $str184$_label_ = SubLObjectFactory.makeString(" label=");
        $str185$_height_ = SubLObjectFactory.makeString(" height=");
        $str186$_units_ = SubLObjectFactory.makeString(" units=");
        $str187$_shape_ = SubLObjectFactory.makeString(" shape=");
        $str188$_textarea = SubLObjectFactory.makeString("<textarea");
        $str189$__textarea_ = SubLObjectFactory.makeString("</textarea>");
        $str190$_rows_ = SubLObjectFactory.makeString(" rows=");
        $str191$_cols_ = SubLObjectFactory.makeString(" cols=");
        $str192$_caption = SubLObjectFactory.makeString("<caption");
        $str193$__caption_ = SubLObjectFactory.makeString("</caption>");
        $str194$_table = SubLObjectFactory.makeString("<table");
        $str195$__table_ = SubLObjectFactory.makeString("</table>");
        $str196$_noflow = SubLObjectFactory.makeString(" noflow");
        $str197$_nowrap = SubLObjectFactory.makeString(" nowrap");
        $str198$_wrap_ = SubLObjectFactory.makeString(" wrap=");
        $str199$_bordercolor_ = SubLObjectFactory.makeString(" bordercolor=");
        $str200$_cellpadding_ = SubLObjectFactory.makeString(" cellpadding=");
        $str201$_cellspacing_ = SubLObjectFactory.makeString(" cellspacing=");
        $str202$_colspec_ = SubLObjectFactory.makeString(" colspec=");
        $str203$_thead = SubLObjectFactory.makeString("<thead");
        $str204$__thead_ = SubLObjectFactory.makeString("</thead>");
        $str205$_tfoot = SubLObjectFactory.makeString("<tfoot");
        $str206$__tfoot_ = SubLObjectFactory.makeString("</tfoot>");
        $str207$_tbody = SubLObjectFactory.makeString("<tbody");
        $str208$__tbody_ = SubLObjectFactory.makeString("</tbody>");
        $str209$_td = SubLObjectFactory.makeString("<td");
        $str210$__td_ = SubLObjectFactory.makeString("</td>");
        $str211$_th = SubLObjectFactory.makeString("<th");
        $str212$__th_ = SubLObjectFactory.makeString("</th>");
        $str213$_tr = SubLObjectFactory.makeString("<tr");
        $str214$__tr_ = SubLObjectFactory.makeString("</tr>");
        $str215$_colspan_ = SubLObjectFactory.makeString(" colspan=");
        $str216$_rowspan_ = SubLObjectFactory.makeString(" rowspan=");
        $str217$_valign_ = SubLObjectFactory.makeString(" valign=");
        $str218$__ = SubLObjectFactory.makeString("/>");
        $str219$mailto_ = SubLObjectFactory.makeString("mailto:");
        $str220$file_ = SubLObjectFactory.makeString("file:");
        $str221$ftp_ = SubLObjectFactory.makeString("ftp:");
        $str222$_a = SubLObjectFactory.makeString("<a");
        $str223$__a_ = SubLObjectFactory.makeString("</a>");
        $str224$_onmouseover_ = SubLObjectFactory.makeString(" onmouseover=");
        $str225$_onmouseout_ = SubLObjectFactory.makeString(" onmouseout=");
        $str226$_onmouseup_ = SubLObjectFactory.makeString(" onmouseup=");
        $str227$_onmousedown_ = SubLObjectFactory.makeString(" onmousedown=");
        $str228$_area = SubLObjectFactory.makeString("<area");
        $str229$_nohref = SubLObjectFactory.makeString(" nohref");
        $str230$_co_ords_ = SubLObjectFactory.makeString(" co-ords=");
        $str231$_basefont = SubLObjectFactory.makeString("<basefont");
        $str232$_blink_ = SubLObjectFactory.makeString("<blink>");
        $str233$__blink_ = SubLObjectFactory.makeString("</blink>");
        $str234$____ = SubLObjectFactory.makeString("<!--");
        $str235$___ = SubLObjectFactory.makeString("-->");
        $str236$_frame = SubLObjectFactory.makeString("<frame");
        $str237$_frameborder_ = SubLObjectFactory.makeString(" frameborder=");
        $str238$_noresize = SubLObjectFactory.makeString(" noresize");
        $str239$_marginheight_ = SubLObjectFactory.makeString(" marginheight=");
        $str240$_marginwidth_ = SubLObjectFactory.makeString(" marginwidth=");
        $str241$_scrolling_ = SubLObjectFactory.makeString(" scrolling=");
        $str242$_frameset = SubLObjectFactory.makeString("<frameset");
        $str243$__frameset_ = SubLObjectFactory.makeString("</frameset>");
        $str244$_iframe = SubLObjectFactory.makeString("<iframe");
        $str245$__iframe_ = SubLObjectFactory.makeString("</iframe>");
        $str246$_img = SubLObjectFactory.makeString("<img");
        $str247$__img_ = SubLObjectFactory.makeString("</img>");
        $str248$_ismap = SubLObjectFactory.makeString(" ismap");
        $str249$_applet_ = SubLObjectFactory.makeString("<applet ");
        $str250$__applet_ = SubLObjectFactory.makeString("</applet>");
        $str251$_code_ = SubLObjectFactory.makeString(" code=");
        $str252$_codebase_ = SubLObjectFactory.makeString(" codebase=");
        $str253$_archive_ = SubLObjectFactory.makeString(" archive=");
        $str254$_param_ = SubLObjectFactory.makeString("<param ");
        $str255$_map = SubLObjectFactory.makeString("<map");
        $str256$__map_ = SubLObjectFactory.makeString("</map>");
        $str257$_nobr_ = SubLObjectFactory.makeString("<nobr>");
        $str258$__nobr_ = SubLObjectFactory.makeString("</nobr>");
        $str259$_noframes_ = SubLObjectFactory.makeString("<noframes>");
        $str260$__noframes_ = SubLObjectFactory.makeString("</noframes>");
        $str261$_object_ = SubLObjectFactory.makeString("<object ");
        $str262$__object_ = SubLObjectFactory.makeString("</object>");
        $str263$_classid_ = SubLObjectFactory.makeString(" classid=");
        $str264$_codetype_ = SubLObjectFactory.makeString(" codetype=");
        $str265$_data_ = SubLObjectFactory.makeString(" data=");
        $str266$_hspace_ = SubLObjectFactory.makeString(" hspace=");
        $str267$_vspace_ = SubLObjectFactory.makeString(" vspace=");
        $str268$_script = SubLObjectFactory.makeString("<script");
        $str269$__script_ = SubLObjectFactory.makeString("</script>");
        $str270$_language_ = SubLObjectFactory.makeString(" language=");
        $str271$JavaScript = SubLObjectFactory.makeString("JavaScript");
        $str272$_noscript = SubLObjectFactory.makeString("<noscript");
        $str273$__noscript_ = SubLObjectFactory.makeString("</noscript>");
        $str274$_wbr_ = SubLObjectFactory.makeString("<wbr>");
        $str275$_ffffff = SubLObjectFactory.makeString("#ffffff");
        $str276$_000000 = SubLObjectFactory.makeString("#000000");
        $str277$_999999 = SubLObjectFactory.makeString("#999999");
        $str278$_cccccc = SubLObjectFactory.makeString("#cccccc");
        $str279$_dddddd = SubLObjectFactory.makeString("#dddddd");
        $str280$_eeeeee = SubLObjectFactory.makeString("#eeeeee");
        $str281$_eeeee4 = SubLObjectFactory.makeString("#eeeee4");
        $str282$_ff0000 = SubLObjectFactory.makeString("#ff0000");
        $str283$_996666 = SubLObjectFactory.makeString("#996666");
        $str284$_ff8888 = SubLObjectFactory.makeString("#ff8888");
        $str285$_cc0000 = SubLObjectFactory.makeString("#cc0000");
        $str286$_eeaaaa = SubLObjectFactory.makeString("#eeaaaa");
        $str287$_ffbbbb = SubLObjectFactory.makeString("#ffbbbb");
        $str288$_00ff00 = SubLObjectFactory.makeString("#00ff00");
        $str289$_669966 = SubLObjectFactory.makeString("#669966");
        $str290$_335533 = SubLObjectFactory.makeString("#335533");
        $str291$_aaeeaa = SubLObjectFactory.makeString("#aaeeaa");
        $str292$_bbffbb = SubLObjectFactory.makeString("#bbffbb");
        $str293$_0000ff = SubLObjectFactory.makeString("#0000ff");
        $str294$_668899 = SubLObjectFactory.makeString("#668899");
        $str295$_aaccee = SubLObjectFactory.makeString("#aaccee");
        $str296$_bbddff = SubLObjectFactory.makeString("#bbddff");
        $str297$_ffff00 = SubLObjectFactory.makeString("#ffff00");
        $str298$_999966 = SubLObjectFactory.makeString("#999966");
        $str299$_eeeeaa = SubLObjectFactory.makeString("#eeeeaa");
        $str300$_ffffbb = SubLObjectFactory.makeString("#ffffbb");
        $str301$_9900bb = SubLObjectFactory.makeString("#9900bb");
        $str302$_996699 = SubLObjectFactory.makeString("#996699");
        $str303$_ddbbff = SubLObjectFactory.makeString("#ddbbff");
        $str304$_eeccff = SubLObjectFactory.makeString("#eeccff");
        $str305$_00ffff = SubLObjectFactory.makeString("#00ffff");
        $str306$_e0ffff = SubLObjectFactory.makeString("#e0ffff");
        $str307$_9933cc = SubLObjectFactory.makeString("#9933cc");
        $str308$_f0d3ff = SubLObjectFactory.makeString("#f0d3ff");
        $str309$_f4e0ff = SubLObjectFactory.makeString("#f4e0ff");
        $str310$_e0e5ff = SubLObjectFactory.makeString("#e0e5ff");
        $str311$_e6f0ff = SubLObjectFactory.makeString("#e6f0ff");
        $kw312$BLACK = SubLObjectFactory.makeKeyword("BLACK");
        $kw313$BLUE = SubLObjectFactory.makeKeyword("BLUE");
        $kw314$GREEN = SubLObjectFactory.makeKeyword("GREEN");
        $list315 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CYAN"), (SubLObject)SubLObjectFactory.makeString("#00ffff"));
        $kw316$RED = SubLObjectFactory.makeKeyword("RED");
        $list317 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MAGENTA"), (SubLObject)SubLObjectFactory.makeString("#ff00ff"));
        $kw318$YELLOW = SubLObjectFactory.makeKeyword("YELLOW");
        $kw319$WHITE = SubLObjectFactory.makeKeyword("WHITE");
        $kw320$DARK_BLUE = SubLObjectFactory.makeKeyword("DARK-BLUE");
        $list321 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-BLUE"), (SubLObject)SubLObjectFactory.makeString("#ececff"));
        $kw322$LIGHTER_BLUE = SubLObjectFactory.makeKeyword("LIGHTER-BLUE");
        $kw323$DARK_RED = SubLObjectFactory.makeKeyword("DARK-RED");
        $list324 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("MEDIUM-RED"), (SubLObject)SubLObjectFactory.makeString("#ff8888"));
        $list325 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-RED"), (SubLObject)SubLObjectFactory.makeString("#ffdede"));
        $kw326$LIGHTER_RED = SubLObjectFactory.makeKeyword("LIGHTER-RED");
        $kw327$DARK_YELLOW = SubLObjectFactory.makeKeyword("DARK-YELLOW");
        $list328 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-YELLOW"), (SubLObject)SubLObjectFactory.makeString("#fffcd2"));
        $kw329$LIGHTER_YELLOW = SubLObjectFactory.makeKeyword("LIGHTER-YELLOW");
        $kw330$DARK_GRAY = SubLObjectFactory.makeKeyword("DARK-GRAY");
        $list331 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("LIGHT-GRAY"), (SubLObject)SubLObjectFactory.makeString("#eeeee4"));
        $kw332$LIGHT_GREY = SubLObjectFactory.makeKeyword("LIGHT-GREY");
        $kw333$LIGHTER_GRAY = SubLObjectFactory.makeKeyword("LIGHTER-GRAY");
        $kw334$LIGHTEST_GREY = SubLObjectFactory.makeKeyword("LIGHTEST-GREY");
        $kw335$DARK_PURPLE = SubLObjectFactory.makeKeyword("DARK-PURPLE");
        $kw336$LIGHT_PURPLE = SubLObjectFactory.makeKeyword("LIGHT-PURPLE");
        $kw337$LIGHTER_PURPLE = SubLObjectFactory.makeKeyword("LIGHTER-PURPLE");
        $str338$cyc_alternate_class1 = SubLObjectFactory.makeString("cyc-alternate-class1");
        $str339$cyc_alternate_class2 = SubLObjectFactory.makeString("cyc-alternate-class2");
        $list340 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ONABORT"), SubLObjectFactory.makeKeyword("ONBLUR"), SubLObjectFactory.makeKeyword("ONCHANGE"), SubLObjectFactory.makeKeyword("ONCLICK"), SubLObjectFactory.makeKeyword("ONDBLCLICK"), SubLObjectFactory.makeKeyword("ONDRAGDROP"), SubLObjectFactory.makeKeyword("ONERROR"), SubLObjectFactory.makeKeyword("ONFOCUS"), SubLObjectFactory.makeKeyword("ONKEYDOWN"), SubLObjectFactory.makeKeyword("ONKEYPRESS"), SubLObjectFactory.makeKeyword("ONKEYUP"), SubLObjectFactory.makeKeyword("ONLOAD"), SubLObjectFactory.makeKeyword("ONMOUSEDOWN"), SubLObjectFactory.makeKeyword("ONMOUSEMOVE"), SubLObjectFactory.makeKeyword("ONMOUSEOUT"), SubLObjectFactory.makeKeyword("ONMOUSEOVER"), SubLObjectFactory.makeKeyword("ONMOUSEUP"), SubLObjectFactory.makeKeyword("ONMOVE"), SubLObjectFactory.makeKeyword("ONRESET"), SubLObjectFactory.makeKeyword("ONRESIZE"), SubLObjectFactory.makeKeyword("ONSELECT"), SubLObjectFactory.makeKeyword("ONSUBMIT"), SubLObjectFactory.makeKeyword("ONUNLOAD") });
        $str341$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $list342 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_ampersand, (SubLObject)SubLObjectFactory.makeString("&amp;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_less, (SubLObject)SubLObjectFactory.makeString("&lt;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_greater, (SubLObject)SubLObjectFactory.makeString("&gt;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_quotation, (SubLObject)SubLObjectFactory.makeString("&quot;")));
        $list343 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_ampersand, (SubLObject)SubLObjectFactory.makeString("&amp;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_less, (SubLObject)SubLObjectFactory.makeString("&lt;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_greater, (SubLObject)SubLObjectFactory.makeString("&gt;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_quotation, (SubLObject)SubLObjectFactory.makeString("\\&quot;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_backslash, (SubLObject)SubLObjectFactory.makeString("\\\\")));
        $list344 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_ampersand, (SubLObject)SubLObjectFactory.makeString("&amp;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_less, (SubLObject)SubLObjectFactory.makeString("&lt;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_greater, (SubLObject)SubLObjectFactory.makeString("&gt;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_quotation, (SubLObject)SubLObjectFactory.makeString("&quot;")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_backslash, (SubLObject)SubLObjectFactory.makeString("\\\\")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_return, (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_newline, (SubLObject)SubLObjectFactory.makeString("<br>")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_tab, (SubLObject)SubLObjectFactory.makeString("&nbsp;&nbsp;&nbsp;&nbsp;")));
        $list345 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTROL-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym346$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $sym347$_HTML_STREAM_ = SubLObjectFactory.makeSymbol("*HTML-STREAM*");
        $sym348$HTML_STRONG = SubLObjectFactory.makeSymbol("HTML-STRONG");
        $list349 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("TAIL")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym350$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym351$HTML_MARKUP = SubLObjectFactory.makeSymbol("HTML-MARKUP");
        $list352 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-CHAR"), (SubLObject)Characters.CHAR_greater));
        $list353 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ATT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list354 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-CHAR"), (SubLObject)Characters.CHAR_quotation);
        $list355 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-CHAR"), (SubLObject)Characters.CHAR_quotation));
        $list356 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-CHAR"), (SubLObject)Characters.CHAR_greater);
        $sym357$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list358 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SAFE-PRINT*"), (SubLObject)html_macros.T));
        $list359 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOW-COPYRIGHT"), (SubLObject)html_macros.T), SubLObjectFactory.makeSymbol("BACKGROUND-IMAGE"), SubLObjectFactory.makeSymbol("BACKGROUND-COLOR"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("TEXT-COLOR"), SubLObjectFactory.makeSymbol("LINK-COLOR"), SubLObjectFactory.makeSymbol("ACTIVE-LINK-COLOR"), SubLObjectFactory.makeSymbol("VISITED-LINK-COLOR"), SubLObjectFactory.makeSymbol("SCRIPT"), SubLObjectFactory.makeSymbol("ONLOAD"), SubLObjectFactory.makeSymbol("ONRESIZE"), SubLObjectFactory.makeSymbol("STYLE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list360 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SHOW-COPYRIGHT"), SubLObjectFactory.makeKeyword("BACKGROUND-IMAGE"), SubLObjectFactory.makeKeyword("BACKGROUND-COLOR"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("TEXT-COLOR"), SubLObjectFactory.makeKeyword("LINK-COLOR"), SubLObjectFactory.makeKeyword("ACTIVE-LINK-COLOR"), SubLObjectFactory.makeKeyword("VISITED-LINK-COLOR"), SubLObjectFactory.makeKeyword("SCRIPT"), SubLObjectFactory.makeKeyword("ONLOAD"), SubLObjectFactory.makeKeyword("ONRESIZE"), SubLObjectFactory.makeKeyword("STYLE") });
        $kw361$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw362$SHOW_COPYRIGHT = SubLObjectFactory.makeKeyword("SHOW-COPYRIGHT");
        $kw363$BACKGROUND_IMAGE = SubLObjectFactory.makeKeyword("BACKGROUND-IMAGE");
        $kw364$BACKGROUND_COLOR = SubLObjectFactory.makeKeyword("BACKGROUND-COLOR");
        $kw365$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $kw366$TEXT_COLOR = SubLObjectFactory.makeKeyword("TEXT-COLOR");
        $kw367$LINK_COLOR = SubLObjectFactory.makeKeyword("LINK-COLOR");
        $kw368$ACTIVE_LINK_COLOR = SubLObjectFactory.makeKeyword("ACTIVE-LINK-COLOR");
        $kw369$VISITED_LINK_COLOR = SubLObjectFactory.makeKeyword("VISITED-LINK-COLOR");
        $kw370$SCRIPT = SubLObjectFactory.makeKeyword("SCRIPT");
        $kw371$ONLOAD = SubLObjectFactory.makeKeyword("ONLOAD");
        $kw372$ONRESIZE = SubLObjectFactory.makeKeyword("ONRESIZE");
        $kw373$STYLE = SubLObjectFactory.makeKeyword("STYLE");
        $sym374$HTML_QUOTED_ATTRIBUTE = SubLObjectFactory.makeSymbol("HTML-QUOTED-ATTRIBUTE");
        $list375 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-BACKGROUND*"));
        $list376 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-ONLOAD*"));
        $list377 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-ONRESIZE*"));
        $sym378$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $sym379$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list380 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-BGCOLOR*"));
        $sym381$HTML_COLOR = SubLObjectFactory.makeSymbol("HTML-COLOR");
        $list382 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-CLASS*"));
        $list383 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-STYLE*"));
        $list384 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-TEXT*"));
        $list385 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-LINK*"));
        $list386 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-ALINK*"));
        $list387 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-VLINK*"));
        $list388 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-CHAR"), (SubLObject)Characters.CHAR_space);
        $list389 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INSIDE-BODY?*"), (SubLObject)html_macros.T));
        $sym390$HTML_MARKUP_WRAPPER = SubLObjectFactory.makeSymbol("HTML-MARKUP-WRAPPER");
        $list391 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-BODY-TAIL*"));
        $sym392$HTML_MARKUP_BODY = SubLObjectFactory.makeSymbol("HTML-MARKUP-BODY");
        $list393 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SOURCE-READABILITY-TERPRI"));
        $list394 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-COPYRIGHT-NOTICE")));
        $list395 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SOURCE-READABILITY-TERPRI")));
        $list396 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym397$COLOR_VALUE = SubLObjectFactory.makeUninternedSymbol("COLOR-VALUE");
        $sym398$HTML_FANCY_BODY = SubLObjectFactory.makeSymbol("HTML-FANCY-BODY");
        $sym399$HTML_COLORED_BODY = SubLObjectFactory.makeSymbol("HTML-COLORED-BODY");
        $list400 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFAULT-BGCOLOR*"));
        $list401 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-HEAD-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-HEAD-TAIL*"));
        $list402 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HEAD-CONTENT-TYPE"));
        $sym403$HTML_HEAD_CONTENT_TYPE = SubLObjectFactory.makeSymbol("HTML-HEAD-CONTENT-TYPE");
        $sym404$HTML_HEAD = SubLObjectFactory.makeSymbol("HTML-HEAD");
        $list405 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"));
        $list406 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORCE-IE-STANDARDS-MODE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SOURCE-READABILITY-TERPRI")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >")));
        $sym407$WITH_POSSIBLY_NEW_HTML_FILE_DEPENDENCY_SPACE = SubLObjectFactory.makeSymbol("WITH-POSSIBLY-NEW-HTML-FILE-DEPENDENCY-SPACE");
        $list408 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-HTML-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-HTML-TAIL*"));
        $list409 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("ALIGN"), (SubLObject)SubLObjectFactory.makeSymbol("ONLOAD"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("MISC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list410 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("ONLOAD"), (SubLObject)SubLObjectFactory.makeKeyword("TITLE"), (SubLObject)SubLObjectFactory.makeKeyword("MISC"));
        $kw411$ID = SubLObjectFactory.makeKeyword("ID");
        $kw412$ALIGN = SubLObjectFactory.makeKeyword("ALIGN");
        $kw413$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $kw414$MISC = SubLObjectFactory.makeKeyword("MISC");
        $list415 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ATTRIBUTE-ID*"));
        $list416 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ATTRIBUTE-CLASS*"));
        $list417 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DIV-STYLE*"));
        $list418 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DIV-TITLE*"));
        $list419 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DIV-ALIGN*"));
        $list420 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DIV-ONLOAD*"));
        $sym421$ATTRIBUTE = SubLObjectFactory.makeUninternedSymbol("ATTRIBUTE");
        $sym422$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $sym423$DO_ALIST = SubLObjectFactory.makeSymbol("DO-ALIST");
        $list424 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DIV-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DIV-TAIL*"));
        $sym425$HTML_FANCY_SPAN = SubLObjectFactory.makeSymbol("HTML-FANCY-SPAN");
        $list426 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-STYLE-FONT-SIZE-SMALLER*"));
        $list427 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-STYLE-FONT-SIZE-LARGER*"));
        $list428 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("ONCLICK"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list429 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("ONCLICK"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("TITLE"));
        $kw430$ONCLICK = SubLObjectFactory.makeKeyword("ONCLICK");
        $list431 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-EVENT-ATTRIBUTE-ONCLICK*"));
        $list432 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ATTRIBUTE-TITLE*"));
        $list433 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SPAN-STYLE*"));
        $list434 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SPAN-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SPAN-TAIL*"));
        $list435 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-META-HEAD*"));
        $list436 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("HTTP-EQUIV"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SCHEME"), (SubLObject)SubLObjectFactory.makeSymbol("LANG"), (SubLObject)SubLObjectFactory.makeSymbol("DIR")));
        $list437 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HTTP-EQUIV"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENT"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SCHEME"), (SubLObject)SubLObjectFactory.makeKeyword("LANG"), (SubLObject)SubLObjectFactory.makeKeyword("DIR"));
        $kw438$HTTP_EQUIV = SubLObjectFactory.makeKeyword("HTTP-EQUIV");
        $kw439$CONTENT = SubLObjectFactory.makeKeyword("CONTENT");
        $kw440$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw441$SCHEME = SubLObjectFactory.makeKeyword("SCHEME");
        $kw442$LANG = SubLObjectFactory.makeKeyword("LANG");
        $kw443$DIR = SubLObjectFactory.makeKeyword("DIR");
        $list444 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-META-CONTENT*"));
        $list445 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-META-NAME*"));
        $list446 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-META-SCHEME*"));
        $list447 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-META-LANG*"));
        $list448 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-META-DIR*"));
        $list449 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-META-HTTP-EQUIV*"));
        $sym450$HTML_META = SubLObjectFactory.makeSymbol("HTML-META");
        $list451 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LINK-HEAD*"));
        $list452 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("REL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("HREF"), (SubLObject)SubLObjectFactory.makeSymbol("MEDIA"), (SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("ID")));
        $list453 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REL"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("HREF"), (SubLObject)SubLObjectFactory.makeKeyword("MEDIA"), (SubLObject)SubLObjectFactory.makeKeyword("TITLE"), (SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $kw454$REL = SubLObjectFactory.makeKeyword("REL");
        $kw455$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw456$HREF = SubLObjectFactory.makeKeyword("HREF");
        $kw457$MEDIA = SubLObjectFactory.makeKeyword("MEDIA");
        $list458 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LINK-MEDIA*"));
        $list459 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LINK-TITLE*"));
        $list460 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LINK-TYPE*"));
        $list461 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LINK-HREF*"));
        $list462 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LINK-REL*"));
        $sym463$HTML_LINK = SubLObjectFactory.makeSymbol("HTML-LINK");
        $list464 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BASE-HEAD*"));
        $list465 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("HREF")));
        $list466 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HREF"));
        $list467 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BASE-HREF*"));
        $sym468$HTML_BASE = SubLObjectFactory.makeSymbol("HTML-BASE");
        $str469$all = SubLObjectFactory.makeString("all");
        $str470$stylesheet = SubLObjectFactory.makeString("stylesheet");
        $str471$text_css = SubLObjectFactory.makeString("text/css");
        $list472 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-STYLE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-STYLE-TAIL*"));
        $list473 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TITLE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TITLE-TAIL*"));
        $list474 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFAULT-BGCOLOR*")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym475$HTML_DOCUMENT = SubLObjectFactory.makeSymbol("HTML-DOCUMENT");
        $sym476$HTML_TITLE = SubLObjectFactory.makeSymbol("HTML-TITLE");
        $sym477$HTML_PRINC = SubLObjectFactory.makeSymbol("HTML-PRINC");
        $sym478$HTML_HEADING = SubLObjectFactory.makeSymbol("HTML-HEADING");
        $list479 = ConsesLow.list((SubLObject)html_macros.TWO_INTEGER);
        $list480 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TITLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETION?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFAULT-BGCOLOR*")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list481 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETION?"), (SubLObject)SubLObjectFactory.makeKeyword("COLOR"));
        $kw482$COMPLETION_ = SubLObjectFactory.makeKeyword("COMPLETION?");
        $kw483$COLOR = SubLObjectFactory.makeKeyword("COLOR");
        $list484 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-COMPLETE-SCRIPT")));
        $list485 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BLOCKQUOTE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-BLOCKQUOTE-TAIL*"));
        $list486 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-CENTER-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-CENTER-TAIL*"));
        $list487 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list488 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-HEADING-HEAD*"));
        $list489 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-HEADING-TAIL*"));
        $list490 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-PARAGRAPH-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-PARAGRAPH-TAIL*"));
        $list491 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-PLAINTEXT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-PLAINTEXT-TAIL*"));
        $str492$HTML_UNPRE_used_when_not_within_H = SubLObjectFactory.makeString("HTML-UNPRE used when not within HTML-PRE");
        $str493$Nested_calls_to_HTML_PRE_will_con = SubLObjectFactory.makeString("Nested calls to HTML-PRE will confuse most browsers.");
        $list494 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERIFY-NOT-WITHIN-HTML-PRE"));
        $list495 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-PREFORMATTED-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-PREFORMATTED-TAIL*"));
        $list496 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-HTML-PRE*"), (SubLObject)html_macros.T));
        $list497 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERIFY-WITHIN-HTML-PRE"));
        $list498 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-PREFORMATTED-TAIL*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-PREFORMATTED-HEAD*"));
        $list499 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-HTML-PRE*"), (SubLObject)html_macros.NIL));
        $list500 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ADDRESS-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ADDRESS-TAIL*"));
        $list501 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BIG-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-BIG-TAIL*"));
        $list502 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BOLD-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-BOLD-TAIL*"));
        $sym503$HTML_BOLD = SubLObjectFactory.makeSymbol("HTML-BOLD");
        $list504 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-CITE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-CITE-TAIL*"));
        $list505 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-CODE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-CODE-TAIL*"));
        $list506 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFINITION-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFINITION-TAIL*"));
        $list507 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-EMPHASIZED-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-EMPHASIZED-TAIL*"));
        $sym508$HTML_EMPHASIZED = SubLObjectFactory.makeSymbol("HTML-EMPHASIZED");
        $list509 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("COLOR"), (SubLObject)SubLObjectFactory.makeSymbol("FACE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list510 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("COLOR"), (SubLObject)SubLObjectFactory.makeKeyword("FACE"));
        $kw511$SIZE = SubLObjectFactory.makeKeyword("SIZE");
        $kw512$FACE = SubLObjectFactory.makeKeyword("FACE");
        $list513 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FONT-SIZE*"));
        $list514 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FONT-COLOR*"));
        $list515 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FONT-FACE*"));
        $list516 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FONT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FONT-TAIL*"));
        $list517 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIZE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym518$SIZE_VAL = SubLObjectFactory.makeUninternedSymbol("SIZE-VAL");
        $sym519$HTML_FANCY_FONT = SubLObjectFactory.makeSymbol("HTML-FANCY-FONT");
        $sym520$COLOR_VAL = SubLObjectFactory.makeUninternedSymbol("COLOR-VAL");
        $sym521$HTML_STYLE_BACKGROUND_COLOR = SubLObjectFactory.makeSymbol("HTML-STYLE-BACKGROUND-COLOR");
        $list522 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ITALIC-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ITALIC-TAIL*"));
        $sym523$HTML_ITALIC = SubLObjectFactory.makeSymbol("HTML-ITALIC");
        $list524 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-KEYBOARD-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-KEYBOARD-TAIL*"));
        $list525 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SAMPLE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SAMPLE-TAIL*"));
        $list526 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SMALL-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SMALL-TAIL*"));
        $list527 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-STRIKETHROUGH-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-STRIKETHROUGH-TAIL*"));
        $list528 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-STRONG-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-STRONG-TAIL*"));
        $list529 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SUBSCRIPT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SUBSCRIPT-TAIL*"));
        $list530 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SUPERSCRIPT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SUPERSCRIPT-TAIL*"));
        $list531 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TELETYPE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TELETYPE-TAIL*"));
        $sym532$HTML_TELETYPE = SubLObjectFactory.makeSymbol("HTML-TELETYPE");
        $list533 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-UNDERLINED-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-UNDERLINED-TAIL*"));
        $sym534$HTML_UNDERLINED = SubLObjectFactory.makeSymbol("HTML-UNDERLINED");
        $list535 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-VARIABLE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-VARIABLE-TAIL*"));
        $list536 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ACCESS-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("FOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list537 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESS-KEY"), (SubLObject)SubLObjectFactory.makeKeyword("FOR"));
        $kw538$ACCESS_KEY = SubLObjectFactory.makeKeyword("ACCESS-KEY");
        $kw539$FOR = SubLObjectFactory.makeKeyword("FOR");
        $list540 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LABEL-ACCESS-KEY*"));
        $list541 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LABEL-FOR*"));
        $list542 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LABEL-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-LABEL-TAIL*"));
        $list543 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFINITION-LIST-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFINITION-LIST-TAIL*"));
        $list544 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-COMPACT*"));
        $list545 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFINITION-LIST-TERM-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFINITION-LIST-TERM-TAIL*"));
        $list546 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFINITION-LIST-DEF-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DEFINITION-LIST-DEF-TAIL*"));
        $list547 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DIRECTORY-LIST-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DIRECTORY-LIST-TAIL*"));
        $list548 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-MENU-LIST-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-MENU-LIST-TAIL*"));
        $list549 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPACT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTINUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("SEQNUM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list550 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPACT"), (SubLObject)SubLObjectFactory.makeKeyword("CONTINUE"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("SEQNUM"));
        $kw551$COMPACT = SubLObjectFactory.makeKeyword("COMPACT");
        $kw552$CONTINUE = SubLObjectFactory.makeKeyword("CONTINUE");
        $kw553$START = SubLObjectFactory.makeKeyword("START");
        $kw554$SEQNUM = SubLObjectFactory.makeKeyword("SEQNUM");
        $list555 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-COMPACT*")));
        $list556 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-CONTINUE*")));
        $list557 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-TYPE*"));
        $list558 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-START*"));
        $list559 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-SEQNUM*"));
        $list560 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ORDERED-LIST-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ORDERED-LIST-TAIL*"));
        $sym561$HTML_FANCY_ORDERED_LIST = SubLObjectFactory.makeSymbol("HTML-FANCY-ORDERED-LIST");
        $sym562$HTML_ORDERED_LIST = SubLObjectFactory.makeSymbol("HTML-ORDERED-LIST");
        $list563 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("COMPACT"), (SubLObject)SubLObjectFactory.makeSymbol("PLAIN"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SRC"), (SubLObject)SubLObjectFactory.makeSymbol("DINGBAT"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list564 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPACT"), (SubLObject)SubLObjectFactory.makeKeyword("PLAIN"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SRC"), (SubLObject)SubLObjectFactory.makeKeyword("DINGBAT"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $kw565$PLAIN = SubLObjectFactory.makeKeyword("PLAIN");
        $kw566$SRC = SubLObjectFactory.makeKeyword("SRC");
        $kw567$DINGBAT = SubLObjectFactory.makeKeyword("DINGBAT");
        $list568 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-PLAIN*")));
        $list569 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-SRC*"));
        $list570 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-DINGBAT*"));
        $list571 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-UNORDERED-LIST-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-UNORDERED-LIST-TAIL*"));
        $sym572$HTML_FANCY_UNORDERED_LIST = SubLObjectFactory.makeSymbol("HTML-FANCY-UNORDERED-LIST");
        $sym573$HTML_UNORDERED_LIST = SubLObjectFactory.makeSymbol("HTML-UNORDERED-LIST");
        $list574 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PLAIN"), (SubLObject)html_macros.T);
        $list575 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SKIP"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SRC"), (SubLObject)SubLObjectFactory.makeSymbol("DINGBAT"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list576 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SKIP"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SRC"), (SubLObject)SubLObjectFactory.makeKeyword("DINGBAT"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $kw577$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $list578 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-ITEM-SKIP*"));
        $list579 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-ITEM-TYPE*"));
        $list580 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-ITEM-SRC*"));
        $list581 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-ITEM-ID*"));
        $list582 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-ITEM-DINGBAT*"));
        $list583 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-ITEM-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-LIST-ITEM-TAIL*"));
        $sym584$HTML_FANCY_LIST_ITEM = SubLObjectFactory.makeSymbol("HTML-FANCY-LIST-ITEM");
        $list585 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list586 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $list587 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SUMMARY-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SUMMARY-TAIL*"));
        $list588 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-DETAILS-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-DETAILS-TAIL*"));
        $list589 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CODE"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("CODEBASE"), SubLObjectFactory.makeSymbol("ARCHIVE"), SubLObjectFactory.makeSymbol("ALT"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("ID") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list590 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CODEBASE"), (SubLObject)SubLObjectFactory.makeKeyword("ARCHIVE"), (SubLObject)SubLObjectFactory.makeKeyword("ALT"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"), (SubLObject)SubLObjectFactory.makeKeyword("ID"));
        $kw591$CODEBASE = SubLObjectFactory.makeKeyword("CODEBASE");
        $kw592$ARCHIVE = SubLObjectFactory.makeKeyword("ARCHIVE");
        $kw593$ALT = SubLObjectFactory.makeKeyword("ALT");
        $kw594$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw595$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $list596 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-CODE*"));
        $list597 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-CODEBASE*"));
        $list598 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-ARCHIVE*"));
        $list599 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-ALT*"));
        $list600 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-ALIGN*"));
        $sym601$HTML_ALIGN = SubLObjectFactory.makeSymbol("HTML-ALIGN");
        $list602 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-NAME*"));
        $list603 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-ID*"));
        $list604 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-HEIGHT*"));
        $list605 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-WIDTH*"));
        $list606 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-APPLET-TAIL*"));
        $list607 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list608 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-PARAM-HEAD*"));
        $list609 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-PARAM-NAME*"));
        $list610 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-PARAM-VALUE*"));
        $sym611$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $sym612$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym613$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym614$HTML_PRIN1 = SubLObjectFactory.makeSymbol("HTML-PRIN1");
        $list615 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ID-SPACE-ID-GENERATOR*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGER-SEQUENCE-GENERATOR-P"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ID-SPACE-ID-GENERATOR*")), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ID-SPACE-ID-GENERATOR*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-INTEGER-SEQUENCE-GENERATOR")))));
        $sym616$_HTML_FORM_FIELD_UNIQUIFIER_CODE_ = SubLObjectFactory.makeSymbol("*HTML-FORM-FIELD-UNIQUIFIER-CODE*");
        $sym617$WITH_HTML_UNIQUE_FORM_FIELDS = SubLObjectFactory.makeSymbol("WITH-HTML-UNIQUE-FORM-FIELDS");
        $sym618$HTML_FANCY_FORM = SubLObjectFactory.makeSymbol("HTML-FANCY-FORM");
        $list619 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-FIELD-UNIQUIFIER-CODE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-HTML-FORM-FIELD-UNIQUIFIER-CODE"))));
        $list620 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMBED-FORM-FIELD-CODE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-FIELD-UNIQUIFIER-CODE*")));
        $list621 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym622$GET_FORM_FIELD_CODE = SubLObjectFactory.makeSymbol("GET-FORM-FIELD-CODE");
        $sym623$NEXT_HTML_FORM_FIELD_UNIQUIFIER_CODE = SubLObjectFactory.makeSymbol("NEXT-HTML-FORM-FIELD-UNIQUIFIER-CODE");
        $sym624$_HTML_FORM_FIELD_UNIQUIFIER_ISG_ = SubLObjectFactory.makeSymbol("*HTML-FORM-FIELD-UNIQUIFIER-ISG*");
        $sym625$EMBED_FORM_FIELD_CODE = SubLObjectFactory.makeSymbol("EMBED-FORM-FIELD-CODE");
        $str626$uniquifier_code = SubLObjectFactory.makeString("uniquifier-code");
        $sym627$WITH_HTML_UNIQUE_FORM_FIELD_DECODING = SubLObjectFactory.makeSymbol("WITH-HTML-UNIQUE-FORM-FIELD-DECODING");
        $list628 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SCRIPT"), (SubLObject)SubLObjectFactory.makeSymbol("FORM-ID"), (SubLObject)SubLObjectFactory.makeSymbol("ENCTYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list629 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-ACTION*"));
        $list630 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-ENCTYPE*"));
        $list631 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-METHOD*"));
        $list632 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-NAME*"));
        $list633 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-TARGET*"));
        $list634 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-TAIL*"));
        $list635 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-HTML-FORM*"), (SubLObject)html_macros.T));
        $list636 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("VALUE"), SubLObjectFactory.makeSymbol("CHECKED"), SubLObjectFactory.makeSymbol("DISABLED?"), SubLObjectFactory.makeSymbol("READONLY"), SubLObjectFactory.makeSymbol("SIZE"), SubLObjectFactory.makeSymbol("MAXLENGTH"), SubLObjectFactory.makeSymbol("SRC"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("BORDER"), SubLObjectFactory.makeSymbol("MIN"), SubLObjectFactory.makeSymbol("MAX"), SubLObjectFactory.makeSymbol("STEP"), SubLObjectFactory.makeSymbol("SCRIPT"), SubLObjectFactory.makeSymbol("STYLE"), SubLObjectFactory.makeSymbol("ONCHANGE"), SubLObjectFactory.makeSymbol("ONCLICK"), SubLObjectFactory.makeSymbol("ONBLUR"), SubLObjectFactory.makeSymbol("ONFOCUS"), SubLObjectFactory.makeSymbol("ONKEYUP"), SubLObjectFactory.makeSymbol("ONKEYDOWN"), SubLObjectFactory.makeSymbol("ONKEYPRESS"), SubLObjectFactory.makeSymbol("ALT"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("TITLE") });
        $list637 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("VALUE"), SubLObjectFactory.makeKeyword("CHECKED"), SubLObjectFactory.makeKeyword("DISABLED?"), SubLObjectFactory.makeKeyword("READONLY"), SubLObjectFactory.makeKeyword("SIZE"), SubLObjectFactory.makeKeyword("MAXLENGTH"), SubLObjectFactory.makeKeyword("SRC"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("BORDER"), SubLObjectFactory.makeKeyword("MIN"), SubLObjectFactory.makeKeyword("MAX"), SubLObjectFactory.makeKeyword("STEP"), SubLObjectFactory.makeKeyword("SCRIPT"), SubLObjectFactory.makeKeyword("STYLE"), SubLObjectFactory.makeKeyword("ONCHANGE"), SubLObjectFactory.makeKeyword("ONCLICK"), SubLObjectFactory.makeKeyword("ONBLUR"), SubLObjectFactory.makeKeyword("ONFOCUS"), SubLObjectFactory.makeKeyword("ONKEYUP"), SubLObjectFactory.makeKeyword("ONKEYDOWN"), SubLObjectFactory.makeKeyword("ONKEYPRESS"), SubLObjectFactory.makeKeyword("ALT"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("TITLE") });
        $kw638$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw639$CHECKED = SubLObjectFactory.makeKeyword("CHECKED");
        $kw640$DISABLED_ = SubLObjectFactory.makeKeyword("DISABLED?");
        $kw641$READONLY = SubLObjectFactory.makeKeyword("READONLY");
        $kw642$MAXLENGTH = SubLObjectFactory.makeKeyword("MAXLENGTH");
        $kw643$BORDER = SubLObjectFactory.makeKeyword("BORDER");
        $kw644$MIN = SubLObjectFactory.makeKeyword("MIN");
        $kw645$MAX = SubLObjectFactory.makeKeyword("MAX");
        $kw646$STEP = SubLObjectFactory.makeKeyword("STEP");
        $kw647$ONCHANGE = SubLObjectFactory.makeKeyword("ONCHANGE");
        $kw648$ONBLUR = SubLObjectFactory.makeKeyword("ONBLUR");
        $kw649$ONFOCUS = SubLObjectFactory.makeKeyword("ONFOCUS");
        $kw650$ONKEYUP = SubLObjectFactory.makeKeyword("ONKEYUP");
        $kw651$ONKEYDOWN = SubLObjectFactory.makeKeyword("ONKEYDOWN");
        $kw652$ONKEYPRESS = SubLObjectFactory.makeKeyword("ONKEYPRESS");
        $list653 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-TYPE*"));
        $list654 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-STYLE*"));
        $list655 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-NAME*"));
        $list656 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-ALT*"));
        $list657 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-VALUE*"));
        $list658 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-CHECKED*")));
        $list659 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-READONLY*")));
        $list660 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-DISABLED*")));
        $list661 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-SIZE*"));
        $list662 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-MAXLENGTH*"));
        $list663 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-SRC*"));
        $list664 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-ALIGN*"));
        $list665 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-BORDER*"));
        $list666 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-MIN*"));
        $list667 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-MAX*"));
        $list668 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-STEP*"));
        $list669 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-ONCHANGE*"));
        $list670 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-EVENT-ATTRIBUTE-ONBLUR*"));
        $list671 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-EVENT-ATTRIBUTE-ONFOCUS*"));
        $list672 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-EVENT-ATTRIBUTE-ONKEYUP*"));
        $list673 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-EVENT-ATTRIBUTE-ONKEYDOWN*"));
        $list674 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-EVENT-ATTRIBUTE-ONKEYPRESS*"));
        $list675 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-DISABLED?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-DISABLED*")));
        $list676 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-HEAD*"));
        $list677 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list678 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"));
        $sym679$HTML_FANCY_INPUT = SubLObjectFactory.makeSymbol("HTML-FANCY-INPUT");
        $sym680$_HTML_INPUT_BUTTON_ = SubLObjectFactory.makeSymbol("*HTML-INPUT-BUTTON*");
        $list681 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CHECKED?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym682$_HTML_INPUT_RADIO_ = SubLObjectFactory.makeSymbol("*HTML-INPUT-RADIO*");
        $list683 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list684 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("STYLE"));
        $sym685$_HTML_INPUT_SUBMIT_ = SubLObjectFactory.makeSymbol("*HTML-INPUT-SUBMIT*");
        $list686 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SCRIPT"), (SubLObject)SubLObjectFactory.makeSymbol("ONCHANGE"), (SubLObject)SubLObjectFactory.makeSymbol("DISABLED?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list687 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("SCRIPT"), (SubLObject)SubLObjectFactory.makeKeyword("ONCHANGE"), (SubLObject)SubLObjectFactory.makeKeyword("DISABLED?"));
        $kw688$MULTIPLE = SubLObjectFactory.makeKeyword("MULTIPLE");
        $list689 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-NAME*"));
        $list690 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-MULTIPLE*")));
        $list691 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-SIZE*"));
        $list692 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SELECT-TAIL*"));
        $list693 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SELECTED"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("ONMOUSEOVER"), (SubLObject)SubLObjectFactory.makeSymbol("ONMOUSEOUT"), (SubLObject)SubLObjectFactory.makeSymbol("SCRIPT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list694 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SELECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("ONMOUSEOVER"), (SubLObject)SubLObjectFactory.makeKeyword("ONMOUSEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("SCRIPT"));
        $kw695$SELECTED = SubLObjectFactory.makeKeyword("SELECTED");
        $kw696$ONMOUSEOVER = SubLObjectFactory.makeKeyword("ONMOUSEOVER");
        $kw697$ONMOUSEOUT = SubLObjectFactory.makeKeyword("ONMOUSEOUT");
        $list698 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTION-SELECTED*")));
        $list699 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTION-VALUE*"));
        $list700 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-ONMOUSEOUT*"));
        $list701 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-ONMOUSEOVER*"));
        $list702 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTION-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTION-TAIL*"));
        $list703 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list704 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LABEL"));
        $kw705$LABEL = SubLObjectFactory.makeKeyword("LABEL");
        $list706 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTGROUP-LABEL*"));
        $list707 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTGROUP-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-OPTGROUP-TAIL*"));
        $list708 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("COLS"), (SubLObject)SubLObjectFactory.makeSymbol("ROWS"), (SubLObject)SubLObjectFactory.makeSymbol("WRAP"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list709 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("COLS"), (SubLObject)SubLObjectFactory.makeKeyword("ROWS"), (SubLObject)SubLObjectFactory.makeKeyword("WRAP"), (SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"));
        $kw710$COLS = SubLObjectFactory.makeKeyword("COLS");
        $kw711$ROWS = SubLObjectFactory.makeKeyword("ROWS");
        $kw712$WRAP = SubLObjectFactory.makeKeyword("WRAP");
        $list713 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-NAME*"));
        $list714 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-COLS*"));
        $list715 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-ID*"));
        $list716 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-ROWS*"));
        $list717 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-QUOTED-ATTRIBUTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-WRAP*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP"), (SubLObject)SubLObjectFactory.makeString("virtual"))));
        $list718 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-STYLE*"));
        $list719 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TEXTAREA-TAIL*"));
        $list720 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("ALIGN")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list721 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-CAPTION-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-CAPTION-TAIL*"));
        $list722 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-CAPTION-ALIGN*"));
        $list723 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("NOFLOW"), SubLObjectFactory.makeSymbol("NOWRAP"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("BORDER"), SubLObjectFactory.makeSymbol("BORDERCOLOR"), SubLObjectFactory.makeSymbol("CELLPADDING"), SubLObjectFactory.makeSymbol("STYLE"), SubLObjectFactory.makeSymbol("CELLSPACING"), SubLObjectFactory.makeSymbol("COLSPEC"), SubLObjectFactory.makeSymbol("UNITS"), SubLObjectFactory.makeSymbol("BGCOLOR"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("BACKGROUND"), SubLObjectFactory.makeSymbol("CLASS") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list724 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("NOFLOW"), SubLObjectFactory.makeKeyword("NOWRAP"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("BORDER"), SubLObjectFactory.makeKeyword("BORDERCOLOR"), SubLObjectFactory.makeKeyword("CELLPADDING"), SubLObjectFactory.makeKeyword("STYLE"), SubLObjectFactory.makeKeyword("CELLSPACING"), SubLObjectFactory.makeKeyword("COLSPEC"), SubLObjectFactory.makeKeyword("UNITS"), SubLObjectFactory.makeKeyword("BGCOLOR"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("BACKGROUND"), SubLObjectFactory.makeKeyword("CLASS") });
        $kw725$NOFLOW = SubLObjectFactory.makeKeyword("NOFLOW");
        $kw726$NOWRAP = SubLObjectFactory.makeKeyword("NOWRAP");
        $kw727$BORDERCOLOR = SubLObjectFactory.makeKeyword("BORDERCOLOR");
        $kw728$CELLPADDING = SubLObjectFactory.makeKeyword("CELLPADDING");
        $kw729$CELLSPACING = SubLObjectFactory.makeKeyword("CELLSPACING");
        $kw730$COLSPEC = SubLObjectFactory.makeKeyword("COLSPEC");
        $kw731$UNITS = SubLObjectFactory.makeKeyword("UNITS");
        $kw732$BGCOLOR = SubLObjectFactory.makeKeyword("BGCOLOR");
        $kw733$BACKGROUND = SubLObjectFactory.makeKeyword("BACKGROUND");
        $list734 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-NOFLOW*")));
        $list735 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-NOWRAP*")));
        $list736 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-ALIGN*"));
        $list737 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-BORDER*"));
        $list738 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-BORDERCOLOR*"));
        $list739 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-CELLPADDING*"));
        $list740 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-CELLSPACING*"));
        $list741 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-COLSPEC*"));
        $list742 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ATTRIBUTE-STYLE*"));
        $list743 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-UNITS*"));
        $list744 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-BGCOLOR*"));
        $list745 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-WIDTH*"));
        $list746 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-BACKGROUND*"));
        $list747 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-TAIL*"));
        $list748 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BORDER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym749$HTML_FANCY_TABLE = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE");
        $list750 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("NOWRAP"), SubLObjectFactory.makeSymbol("COLSPAN"), SubLObjectFactory.makeSymbol("ROWSPAN"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("VALIGN"), SubLObjectFactory.makeSymbol("BGCOLOR"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("STYLE"), SubLObjectFactory.makeSymbol("TITLE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list751 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NOWRAP"), SubLObjectFactory.makeKeyword("COLSPAN"), SubLObjectFactory.makeKeyword("ROWSPAN"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("VALIGN"), SubLObjectFactory.makeKeyword("BGCOLOR"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("STYLE"), SubLObjectFactory.makeKeyword("TITLE") });
        $kw752$COLSPAN = SubLObjectFactory.makeKeyword("COLSPAN");
        $kw753$ROWSPAN = SubLObjectFactory.makeKeyword("ROWSPAN");
        $kw754$VALIGN = SubLObjectFactory.makeKeyword("VALIGN");
        $list755 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-NOWRAP*")));
        $list756 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-COLSPAN*"));
        $list757 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-ROWSPAN*"));
        $list758 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-ALIGN*"));
        $list759 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-VALIGN*"));
        $list760 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-BGCOLOR*"));
        $list761 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-WIDTH*"));
        $list762 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-HEIGHT*"));
        $list763 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-DATA-TAIL*"));
        $sym764$HTML_FANCY_TABLE_DATA = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA");
        $list765 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("NOWRAP"), SubLObjectFactory.makeSymbol("COLSPAN"), SubLObjectFactory.makeSymbol("ROWSPAN"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("VALIGN"), SubLObjectFactory.makeSymbol("BGCOLOR"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("TITLE"), SubLObjectFactory.makeSymbol("STYLE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list766 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NOWRAP"), SubLObjectFactory.makeKeyword("COLSPAN"), SubLObjectFactory.makeKeyword("ROWSPAN"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("VALIGN"), SubLObjectFactory.makeKeyword("BGCOLOR"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeKeyword("STYLE") });
        $list767 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-ROW-TITLE*"));
        $list768 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-HEADER-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-HEADER-TAIL*"));
        $sym769$HTML_FANCY_TABLE_HEADER = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-HEADER");
        $list770 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-THEAD-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-THEAD-TAIL*"));
        $list771 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-TFOOT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-TFOOT-TAIL*"));
        $list772 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-TBODY-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-TBODY-TAIL*"));
        $list773 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("TITLE"), SubLObjectFactory.makeSymbol("STYLE"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("VALIGN"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("BGCOLOR"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("NAME") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list774 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeKeyword("STYLE"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("VALIGN"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("BGCOLOR"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("NAME") });
        $list775 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-ROW-NAME*"));
        $list776 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-ROW-HEIGHT*"));
        $list777 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-ROW-BGCOLOR*"));
        $list778 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-ROW-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-TABLE-ROW-TAIL*"));
        $sym779$HTML_FANCY_TABLE_ROW = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-ROW");
        $list780 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT-WIDTH"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-INDENT"), (SubLObject)html_macros.TWENTY_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list781 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BORDER"), (SubLObject)html_macros.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CELLPADDING"), (SubLObject)html_macros.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CELLSPACING"), (SubLObject)html_macros.ZERO_INTEGER);
        $sym782$_HTML_INDENT_TABLE_MAX_ = SubLObjectFactory.makeSymbol("*HTML-INDENT-TABLE-MAX*");
        $sym783$HTML_INDENT_TABLE_INTERNAL = SubLObjectFactory.makeSymbol("HTML-INDENT-TABLE-INTERNAL");
        $list784 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT-AMOUNT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym785$INDENT = SubLObjectFactory.makeUninternedSymbol("INDENT");
        $sym786$SPAN = SubLObjectFactory.makeUninternedSymbol("SPAN");
        $sym787$MAX = SubLObjectFactory.makeSymbol("MAX");
        $sym788$_ = SubLObjectFactory.makeSymbol("-");
        $sym789$HTML_TABLE_ROW = SubLObjectFactory.makeSymbol("HTML-TABLE-ROW");
        $sym790$HTML_INDENT_ROW_INTERNAL = SubLObjectFactory.makeSymbol("HTML-INDENT-ROW-INTERNAL");
        $list791 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDENT-AMOUNT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEWLINE?"), (SubLObject)html_macros.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list792 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")));
        $sym793$HTML_NO_BREAK = SubLObjectFactory.makeSymbol("HTML-NO-BREAK");
        $sym794$HTML_INDENT = SubLObjectFactory.makeSymbol("HTML-INDENT");
        $list795 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"), (SubLObject)SubLObjectFactory.makeSymbol("BGCOLOR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR1"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-COLOR-LIGHT-GREY*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR2"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-COLOR-LIGHTER-GREY*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ME")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list796 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLOR1"), (SubLObject)SubLObjectFactory.makeKeyword("COLOR2"), (SubLObject)SubLObjectFactory.makeKeyword("COUNTER"));
        $kw797$COLOR1 = SubLObjectFactory.makeKeyword("COLOR1");
        $kw798$COLOR2 = SubLObjectFactory.makeKeyword("COLOR2");
        $kw799$COUNTER = SubLObjectFactory.makeKeyword("COUNTER");
        $sym800$IGNORE_ME = SubLObjectFactory.makeSymbol("IGNORE-ME");
        $str801$Malformed_cdolist_with_alternatin = SubLObjectFactory.makeString("Malformed cdolist-with-alternating-bgcolor -- ~S was not a variable");
        $sym802$COLOR_TOGGLE = SubLObjectFactory.makeUninternedSymbol("COLOR-TOGGLE");
        $list803 = ConsesLow.list((SubLObject)html_macros.NIL);
        $sym804$CDOLIST_NUMBERED = SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED");
        $sym805$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list806 = ConsesLow.list((SubLObject)html_macros.T);
        $sym807$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list808 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"), (SubLObject)SubLObjectFactory.makeSymbol("BGCOLOR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ME")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list809 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COUNTER"));
        $sym810$CDOLIST_WITH_ALTERNATING_BGCOLOR = SubLObjectFactory.makeSymbol("CDOLIST-WITH-ALTERNATING-BGCOLOR");
        $sym811$_HTML_COLOR_CYC_LOGO_LIGHT_VIOLET_ = SubLObjectFactory.makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*");
        $sym812$_HTML_COLOR_CYC_LOGO_LIGHTER_VIOLET_ = SubLObjectFactory.makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHTER-VIOLET*");
        $sym813$_HTML_COLOR_CYC_LOGO_LIGHT_BLUE_ = SubLObjectFactory.makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHT-BLUE*");
        $sym814$_HTML_COLOR_CYC_LOGO_LIGHTER_BLUE_ = SubLObjectFactory.makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHTER-BLUE*");
        $list815 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"), (SubLObject)SubLObjectFactory.makeSymbol("ALTERNATOR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALTERNATIVE1"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ALTERNATING-CLASS1*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALTERNATIVE2"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ALTERNATING-CLASS2*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ME")))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list816 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALTERNATIVE1"), (SubLObject)SubLObjectFactory.makeKeyword("ALTERNATIVE2"), (SubLObject)SubLObjectFactory.makeKeyword("COUNTER"));
        $kw817$ALTERNATIVE1 = SubLObjectFactory.makeKeyword("ALTERNATIVE1");
        $kw818$ALTERNATIVE2 = SubLObjectFactory.makeKeyword("ALTERNATIVE2");
        $str819$Malformed_cdolist_with_alternatin = SubLObjectFactory.makeString("Malformed cdolist-with-alternating-variable -- ~S was not a variable");
        $sym820$ALTERNATOR_TOGGLE = SubLObjectFactory.makeUninternedSymbol("ALTERNATOR-TOGGLE");
        $list821 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("IGNORE-ME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS1"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ALTERNATING-CLASS1*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS2"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ALTERNATING-CLASS2*"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list822 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COUNTER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS1"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS2"));
        $kw823$CLASS1 = SubLObjectFactory.makeKeyword("CLASS1");
        $kw824$CLASS2 = SubLObjectFactory.makeKeyword("CLASS2");
        $sym825$CDOLIST_WITH_ALTERNATING_VARIABLE = SubLObjectFactory.makeSymbol("CDOLIST-WITH-ALTERNATING-VARIABLE");
        $list826 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"));
        $list827 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*"));
        $list828 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHTER-VIOLET*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*"));
        $list829 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("HREF"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("TITLE"), SubLObjectFactory.makeSymbol("TARGET"), SubLObjectFactory.makeSymbol("SCRIPT"), SubLObjectFactory.makeSymbol("STYLE"), SubLObjectFactory.makeSymbol("ONMOUSEOVER"), SubLObjectFactory.makeSymbol("ONMOUSEOUT"), SubLObjectFactory.makeSymbol("ONMOUSEDOWN"), SubLObjectFactory.makeSymbol("ONMOUSEUP"), SubLObjectFactory.makeSymbol("ONCLICK"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("ATTRS") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list830 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("HREF"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("TITLE"), SubLObjectFactory.makeKeyword("TARGET"), SubLObjectFactory.makeKeyword("SCRIPT"), SubLObjectFactory.makeKeyword("STYLE"), SubLObjectFactory.makeKeyword("ONMOUSEOVER"), SubLObjectFactory.makeKeyword("ONMOUSEOUT"), SubLObjectFactory.makeKeyword("ONMOUSEDOWN"), SubLObjectFactory.makeKeyword("ONMOUSEUP"), SubLObjectFactory.makeKeyword("ONCLICK"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("ATTRS") });
        $kw831$TARGET = SubLObjectFactory.makeKeyword("TARGET");
        $kw832$ONMOUSEDOWN = SubLObjectFactory.makeKeyword("ONMOUSEDOWN");
        $kw833$ONMOUSEUP = SubLObjectFactory.makeKeyword("ONMOUSEUP");
        $kw834$ATTRS = SubLObjectFactory.makeKeyword("ATTRS");
        $list835 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-HREF*"));
        $list836 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-NAME*"));
        $list837 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-ID*"));
        $list838 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-TITLE*"));
        $list839 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-TARGET*"));
        $list840 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-STYLE*"));
        $list841 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-ONMOUSEUP*"));
        $list842 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-ONMOUSEDOWN*"));
        $str843$_ = SubLObjectFactory.makeString(" ");
        $str844$_ = SubLObjectFactory.makeString("=");
        $list845 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-ANCHOR-TAIL*"));
        $list846 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINKTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("HREF"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list847 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HREF"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"));
        $sym848$HTML_FANCY_ANCHOR = SubLObjectFactory.makeSymbol("HTML-FANCY-ANCHOR");
        $list849 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list850 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-CHAR"), (SubLObject)Characters.CHAR_hash);
        $list851 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDRESS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym852$HTML_MAILTO_URL = SubLObjectFactory.makeSymbol("HTML-MAILTO-URL");
        $list853 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym854$HTML_FILE_URL = SubLObjectFactory.makeSymbol("HTML-FILE-URL");
        $list855 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NOHREF"), (SubLObject)SubLObjectFactory.makeSymbol("HREF"), (SubLObject)SubLObjectFactory.makeSymbol("ALT"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SHAPE"), (SubLObject)SubLObjectFactory.makeSymbol("CO-ORDS"));
        $list856 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOHREF"), (SubLObject)SubLObjectFactory.makeKeyword("HREF"), (SubLObject)SubLObjectFactory.makeKeyword("ALT"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("SHAPE"), (SubLObject)SubLObjectFactory.makeKeyword("CO-ORDS"));
        $kw857$NOHREF = SubLObjectFactory.makeKeyword("NOHREF");
        $kw858$SHAPE = SubLObjectFactory.makeKeyword("SHAPE");
        $kw859$CO_ORDS = SubLObjectFactory.makeKeyword("CO-ORDS");
        $list860 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-AREA-NOHREF*")));
        $list861 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-AREA-HREF*"));
        $list862 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-AREA-ALT*"));
        $list863 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-AREA-TARGET*"));
        $list864 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-AREA-SHAPE*"));
        $list865 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-AREA-CO-ORDS*"));
        $list866 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-AREA-HEAD*"));
        $list867 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-BLINK-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-BLINK-TAIL*"));
        $list868 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-COMMENT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-COMMENT-TAIL*"));
        $list869 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("FRAMEBORDER"), (SubLObject)SubLObjectFactory.makeSymbol("NORESIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SRC"), (SubLObject)SubLObjectFactory.makeSymbol("SCROLLING"), (SubLObject)SubLObjectFactory.makeSymbol("MARGINHEIGHT"), (SubLObject)SubLObjectFactory.makeSymbol("MARGINWIDTH"));
        $list870 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FRAMEBORDER"), (SubLObject)SubLObjectFactory.makeKeyword("NORESIZE"), (SubLObject)SubLObjectFactory.makeKeyword("SRC"), (SubLObject)SubLObjectFactory.makeKeyword("SCROLLING"), (SubLObject)SubLObjectFactory.makeKeyword("MARGINHEIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("MARGINWIDTH"));
        $kw871$FRAMEBORDER = SubLObjectFactory.makeKeyword("FRAMEBORDER");
        $kw872$NORESIZE = SubLObjectFactory.makeKeyword("NORESIZE");
        $kw873$SCROLLING = SubLObjectFactory.makeKeyword("SCROLLING");
        $kw874$MARGINHEIGHT = SubLObjectFactory.makeKeyword("MARGINHEIGHT");
        $kw875$MARGINWIDTH = SubLObjectFactory.makeKeyword("MARGINWIDTH");
        $list876 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAME-NAME*"));
        $list877 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAME-FRAMEBORDER*"));
        $list878 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAME-NORESIZE*")));
        $list879 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAME-SRC*"));
        $list880 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAME-SCROLLING*"));
        $list881 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAME-MARGINHEIGHT*"));
        $list882 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAME-MARGINWIDTH*"));
        $list883 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAME-HEAD*"));
        $sym884$HTML_FANCY_FRAME = SubLObjectFactory.makeSymbol("HTML-FANCY-FRAME");
        $list885 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("COLS"), (SubLObject)SubLObjectFactory.makeSymbol("ROWS"), (SubLObject)SubLObjectFactory.makeSymbol("FRAMEBORDER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list886 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COLS"), (SubLObject)SubLObjectFactory.makeKeyword("ROWS"), (SubLObject)SubLObjectFactory.makeKeyword("FRAMEBORDER"));
        $list887 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAMESET-COLS*"));
        $list888 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAMESET-ROWS*"));
        $list889 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAMESET-FRAMEBORDER*"));
        $list890 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-INSIDE-BODY-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("Cannot have a FRAMESET tag inside a BODY tag.")));
        $list891 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAMESET-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FRAMESET-TAIL*"));
        $sym892$HTML_FANCY_FRAMESET = SubLObjectFactory.makeSymbol("HTML-FANCY-FRAMESET");
        $list893 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("SRC"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("FRAMEBORDER"), SubLObjectFactory.makeSymbol("MARGINWIDTH"), SubLObjectFactory.makeSymbol("MARGINHEIGHT"), SubLObjectFactory.makeSymbol("SCROLLING") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list894 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SRC"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("FRAMEBORDER"), SubLObjectFactory.makeKeyword("MARGINWIDTH"), SubLObjectFactory.makeKeyword("MARGINHEIGHT"), SubLObjectFactory.makeKeyword("SCROLLING") });
        $list895 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-SRC*"));
        $list896 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-NAME*"));
        $list897 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-WIDTH*"));
        $list898 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-HEIGHT*"));
        $list899 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-ALIGN*"));
        $list900 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-FRAMEBORDER*"));
        $list901 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-MARGINWIDTH*"));
        $list902 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-MARGINHEIGHT*"));
        $list903 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-SCROLLING*"));
        $list904 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-IFRAME-TAIL*"));
        $list905 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("SRC"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("ISMAP"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("ALT"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("BORDER"), SubLObjectFactory.makeSymbol("STYLE") });
        $list906 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("ISMAP"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("ALT"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("BORDER"), SubLObjectFactory.makeKeyword("STYLE") });
        $kw907$ISMAP = SubLObjectFactory.makeKeyword("ISMAP");
        $list908 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-SRC*"));
        $list909 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-NAME*"));
        $list910 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-SIMPLE-ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-ISMAP*")));
        $list911 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-HEIGHT*"));
        $list912 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-WIDTH*"));
        $list913 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-ALT*"));
        $list914 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-ALIGN*"));
        $list915 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-BORDER*"));
        $list916 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-STYLE*"));
        $list917 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-IMAGE-TAIL*"));
        $list918 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-MARKUP-BODY")));
        $list919 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FILENAME"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("ISMAP"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("ALT"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("BORDER") });
        $list920 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("ISMAP"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("ALT"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("BORDER") });
        $sym921$DATA_SRC = SubLObjectFactory.makeUninternedSymbol("DATA-SRC");
        $sym922$HTML_EMBEDDED_IMAGE_DATA_SRC = SubLObjectFactory.makeSymbol("HTML-EMBEDDED-IMAGE-DATA-SRC");
        $sym923$HTML_FANCY_IMAGE = SubLObjectFactory.makeSymbol("HTML-FANCY-IMAGE");
        $sym924$HTML_EMBEDDED_IMAGE = SubLObjectFactory.makeSymbol("HTML-EMBEDDED-IMAGE");
        $str925$data__A_base64_ = SubLObjectFactory.makeString("data:~A;base64,");
        $int926$76 = SubLObjectFactory.makeInteger(76);
        $list927 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-MAP-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-MAP-TAIL*"));
        $list928 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-MAP-NAME*"));
        $sym929$HTML_FANCY_MAP = SubLObjectFactory.makeSymbol("HTML-FANCY-MAP");
        $list930 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-NO-BREAK-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-NO-BREAK-TAIL*"));
        $list931 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-NO-FRAMES-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-NO-FRAMES-TAIL*"));
        $list932 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("CLASSID"), SubLObjectFactory.makeSymbol("CODEBASE"), SubLObjectFactory.makeSymbol("CODETYPE"), SubLObjectFactory.makeSymbol("DATA"), SubLObjectFactory.makeSymbol("TYPE"), SubLObjectFactory.makeSymbol("ARCHIVE"), SubLObjectFactory.makeSymbol("ID"), SubLObjectFactory.makeSymbol("CLASS"), SubLObjectFactory.makeSymbol("ALIGN"), SubLObjectFactory.makeSymbol("WIDTH"), SubLObjectFactory.makeSymbol("HEIGHT"), SubLObjectFactory.makeSymbol("BORDER"), SubLObjectFactory.makeSymbol("HSPACE"), SubLObjectFactory.makeSymbol("VSPACE") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list933 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("CLASSID"), SubLObjectFactory.makeKeyword("CODEBASE"), SubLObjectFactory.makeKeyword("CODETYPE"), SubLObjectFactory.makeKeyword("DATA"), SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("ARCHIVE"), SubLObjectFactory.makeKeyword("ID"), SubLObjectFactory.makeKeyword("CLASS"), SubLObjectFactory.makeKeyword("ALIGN"), SubLObjectFactory.makeKeyword("WIDTH"), SubLObjectFactory.makeKeyword("HEIGHT"), SubLObjectFactory.makeKeyword("BORDER"), SubLObjectFactory.makeKeyword("HSPACE"), SubLObjectFactory.makeKeyword("VSPACE") });
        $kw934$CLASSID = SubLObjectFactory.makeKeyword("CLASSID");
        $kw935$CODETYPE = SubLObjectFactory.makeKeyword("CODETYPE");
        $kw936$DATA = SubLObjectFactory.makeKeyword("DATA");
        $kw937$HSPACE = SubLObjectFactory.makeKeyword("HSPACE");
        $kw938$VSPACE = SubLObjectFactory.makeKeyword("VSPACE");
        $list939 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-CLASSID*"));
        $list940 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-CODEBASE*"));
        $list941 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-CODETYPE*"));
        $list942 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-DATA*"));
        $list943 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-TYPE*"));
        $list944 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-ARCHIVE*"));
        $list945 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-ID*"));
        $list946 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-CLASS*"));
        $list947 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-ALIGN*"));
        $list948 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-WIDTH*"));
        $list949 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-HEIGHT*"));
        $list950 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-BORDER*"));
        $list951 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-HSPACE*"));
        $list952 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-VSPACE*"));
        $list953 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-OBJECT-TAIL*"));
        $list954 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LANGUAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SRC"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list955 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("SRC"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"));
        $kw956$LANGUAGE = SubLObjectFactory.makeKeyword("LANGUAGE");
        $list957 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SCRIPT-LANGUAGE*"));
        $list958 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SCRIPT-SRC*"));
        $list959 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SCRIPT-TYPE*"));
        $list960 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-SCRIPT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SCRIPT-TAIL*"));
        $sym961$HTML_FANCY_SCRIPT = SubLObjectFactory.makeSymbol("HTML-FANCY-SCRIPT");
        $list962 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LANGUAGE"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-SCRIPT-JAVASCRIPT*"));
        $list963 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-NOSCRIPT-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-NOSCRIPT-TAIL*"));
        $list964 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-BODY"));
        $list965 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("~A?"), (SubLObject)SubLObjectFactory.makeSymbol("*CYC-CGI-PROGRAM*"));
        $list966 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYC-CGI-PROGRAM*"));
        $list967 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYC-CGI-PROGRAM*"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-FORM-METHOD-POST*"));
        $list968 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLER-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)html_macros.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym969$HTML_BASIC_CYC_FORM = SubLObjectFactory.makeSymbol("HTML-BASIC-CYC-FORM");
        $sym970$HTML_HIDDEN_INPUT = SubLObjectFactory.makeSymbol("HTML-HIDDEN-INPUT");
        $list971 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("COLS"), (SubLObject)SubLObjectFactory.makeSymbol("ROWS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym972$HTML_FANCY_TEXTAREA = SubLObjectFactory.makeSymbol("HTML-FANCY-TEXTAREA");
        $list973 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WRAP"), (SubLObject)html_macros.T);
        $list974 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym975$HTML_FANCY_SELECT = SubLObjectFactory.makeSymbol("HTML-FANCY-SELECT");
        $list976 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECTED?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym977$HTML_FANCY_OPTION = SubLObjectFactory.makeSymbol("HTML-FANCY-OPTION");
        $list978 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAPTION"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("TOP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BORDER"), (SubLObject)html_macros.TWO_INTEGER)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw979$TOP = SubLObjectFactory.makeKeyword("TOP");
        $sym980$HTML_TABLE_CAPTION = SubLObjectFactory.makeSymbol("HTML-TABLE-CAPTION");
        $list981 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("COLS"), (SubLObject)SubLObjectFactory.makeSymbol("ROWS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym982$ID_NUM = SubLObjectFactory.makeUninternedSymbol("ID-NUM");
        $sym983$INPUT_ID = SubLObjectFactory.makeUninternedSymbol("INPUT-ID");
        $sym984$RESULT_ID = SubLObjectFactory.makeUninternedSymbol("RESULT-ID");
        $sym985$AUTOCOMPLETE_ID = SubLObjectFactory.makeUninternedSymbol("AUTOCOMPLETE-ID");
        $list986 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-HTML-ID-DEFINED?"));
        $list987 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-HTML-ID")));
        $sym988$FORMAT_NIL = SubLObjectFactory.makeSymbol("FORMAT-NIL");
        $str989$autocomplete__A = SubLObjectFactory.makeString("autocomplete-~A");
        $str990$input__A = SubLObjectFactory.makeString("input-~A");
        $str991$autocomplete_results__A = SubLObjectFactory.makeString("autocomplete-results-~A");
        $sym992$HTML_FANCY_DIV = SubLObjectFactory.makeSymbol("HTML-FANCY-DIV");
        $list993 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeString("yui-ac"));
        $str994$yui_ac_input = SubLObjectFactory.makeString("yui-ac-input");
        $list995 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STYLE"), (SubLObject)SubLObjectFactory.makeString("position:static"));
        $list996 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeString("yui-ac-container"));
        $sym997$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT = SubLObjectFactory.makeSymbol("HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT");
        $list998 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list999 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1000$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym1001$STREAM = SubLObjectFactory.makeUninternedSymbol("STREAM");
        $sym1002$CWITH_OUTPUT_TO_STRING = SubLObjectFactory.makeSymbol("CWITH-OUTPUT-TO-STRING");
        $sym1003$WITH_HTML_OUTPUT_TO_STREAM = SubLObjectFactory.makeSymbol("WITH-HTML-OUTPUT-TO-STREAM");
        $sym1004$WITH_HTML_OUTPUT_TO_STRING = SubLObjectFactory.makeSymbol("WITH-HTML-OUTPUT-TO-STRING");
        $sym1005$CONVERT_HTML_TO_TEXT = SubLObjectFactory.makeSymbol("CONVERT-HTML-TO-TEXT");
        $list1006 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1007$STATE_VAR = SubLObjectFactory.makeUninternedSymbol("STATE-VAR");
        $sym1008$LOCK_VAR = SubLObjectFactory.makeUninternedSymbol("LOCK-VAR");
        $sym1009$VARIABLES = SubLObjectFactory.makeUninternedSymbol("VARIABLES");
        $sym1010$VALUES = SubLObjectFactory.makeUninternedSymbol("VALUES");
        $sym1011$HTML_MACHINE_STATE = SubLObjectFactory.makeSymbol("HTML-MACHINE-STATE");
        $sym1012$HTML_MACHINE_STATE_LOCK = SubLObjectFactory.makeSymbol("HTML-MACHINE-STATE-LOCK");
        $sym1013$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $sym1014$HTML_MACHINE_STATE_VARIABLES = SubLObjectFactory.makeSymbol("HTML-MACHINE-STATE-VARIABLES");
        $sym1015$HTML_MACHINE_STATE_VALUES = SubLObjectFactory.makeSymbol("HTML-MACHINE-STATE-VALUES");
        $sym1016$CPROGV = SubLObjectFactory.makeSymbol("CPROGV");
        $sym1017$SNAPSHOT_HTML_STATE = SubLObjectFactory.makeSymbol("SNAPSHOT-HTML-STATE");
        $kw1018$HTML_PARAMETER_ENTRY_FORMAT = SubLObjectFactory.makeKeyword("HTML-PARAMETER-ENTRY-FORMAT");
        $list1019 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY-FORMAT"));
        $sym1020$SET_HTML_PARAMETER_ENTRY_FORMAT = SubLObjectFactory.makeSymbol("SET-HTML-PARAMETER-ENTRY-FORMAT");
        $sym1021$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym1022$_HTML_HANDLER_PROPERTY_ = SubLObjectFactory.makeSymbol("*HTML-HANDLER-PROPERTY*");
        $kw1023$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym1024$_XML_HANDLER_PROPERTY_ = SubLObjectFactory.makeSymbol("*XML-HANDLER-PROPERTY*");
        $kw1025$XML_HANDLER = SubLObjectFactory.makeKeyword("XML-HANDLER");
        $sym1026$_JSON_HANDLER_PROPERTY_ = SubLObjectFactory.makeSymbol("*JSON-HANDLER-PROPERTY*");
        $kw1027$JSON_HANDLER = SubLObjectFactory.makeKeyword("JSON-HANDLER");
        $list1028 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str1029$HTML_handler__A_has_an_invalid_ar = SubLObjectFactory.makeString("HTML handler ~A has an invalid arglist of:~%   ~S~%Use DEFINE instead.");
        $sym1030$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym1031$NOTE_CGI_HANDLER_FUNCTION = SubLObjectFactory.makeSymbol("NOTE-CGI-HANDLER-FUNCTION");
        $sym1032$DEFINE_HTML_HANDLER = SubLObjectFactory.makeSymbol("DEFINE-HTML-HANDLER");
        $sym1033$_HANDLER_MIME_TYPES_ = SubLObjectFactory.makeSymbol("*HANDLER-MIME-TYPES*");
        $int1034$200 = SubLObjectFactory.makeInteger(200);
        $list1035 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1036$DEFINE_CGI_HANDLER = SubLObjectFactory.makeSymbol("DEFINE-CGI-HANDLER");
        $sym1037$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym1038$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $list1039 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECS"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1040$ALIST = SubLObjectFactory.makeUninternedSymbol("ALIST");
        $list1041 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("READER"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-EQUAL")))));
        $list1042 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("READER"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("COLLECT"), (SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $kw1043$READER = SubLObjectFactory.makeKeyword("READER");
        $kw1044$TYPE_PRED = SubLObjectFactory.makeKeyword("TYPE-PRED");
        $kw1045$COLLECT = SubLObjectFactory.makeKeyword("COLLECT");
        $kw1046$TEST = SubLObjectFactory.makeKeyword("TEST");
        $list1047 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-EQUAL"));
        $sym1048$CURRENT = SubLObjectFactory.makeUninternedSymbol("CURRENT");
        $sym1049$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym1050$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym1051$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym1052$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $sym1053$CAAR = SubLObjectFactory.makeSymbol("CAAR");
        $sym1054$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym1055$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym1056$CDAR = SubLObjectFactory.makeSymbol("CDAR");
        $sym1057$VAL = SubLObjectFactory.makeUninternedSymbol("VAL");
        $sym1058$CADR = SubLObjectFactory.makeSymbol("CADR");
        $sym1059$ASSOC = SubLObjectFactory.makeSymbol("ASSOC");
        $sym1060$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym1061$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym1062$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str1063$HTML_argument_error___S_should_be = SubLObjectFactory.makeString("HTML argument error: ~S should be ~S.");
        $list1064 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-EQUAL")));
        $sym1065$REMOVE_IF_NOT = SubLObjectFactory.makeSymbol("REMOVE-IF-NOT");
        $list1066 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP"));
        $list1067 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRONG?"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1068$STRONG_VAR = SubLObjectFactory.makeUninternedSymbol("STRONG-VAR");
        $sym1069$HEAD = SubLObjectFactory.makeUninternedSymbol("HEAD");
        $sym1070$TAIL = SubLObjectFactory.makeUninternedSymbol("TAIL");
        $list1071 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-STRONG-HEAD*"), (SubLObject)SubLObjectFactory.makeSymbol("*EMPTY-STRING*"));
        $list1072 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-STRONG-TAIL*"), (SubLObject)SubLObjectFactory.makeSymbol("*EMPTY-STRING*"));
    }
}

/*

	Total time: 6643 ms
	
*/