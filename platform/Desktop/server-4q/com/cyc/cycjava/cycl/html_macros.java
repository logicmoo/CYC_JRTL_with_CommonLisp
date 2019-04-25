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

public final class html_macros
    extends
      SubLTranslatedFile
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
  public static SubLObject is_known_dom_event_handlerP(final SubLObject symbol)
  {
    return makeBoolean( symbol.isKeyword() && NIL != list_utilities.member_eqP( symbol, $html_known_dom_events$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 33151L)
  public static SubLObject html_format(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject control_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    control_string = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym346$FORMAT, $sym347$_HTML_STREAM_, control_string, ConsesLow.append( args, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 33415L)
  public static SubLObject html_format_strong(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject control_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list345 );
    control_string = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym348$HTML_STRONG, ConsesLow.listS( $sym346$FORMAT, $sym347$_HTML_STREAM_, control_string, ConsesLow.append( args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 33731L)
  public static SubLObject html_markup_wrapper(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list349 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject head = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list349 );
    head = current.first();
    current = current.rest();
    final SubLObject tail = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list349 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list349 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    if( NIL != tail )
    {
      return ConsesLow.listS( $sym350$PROGN, ConsesLow.list( $sym351$HTML_MARKUP, head ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym351$HTML_MARKUP, tail ) ) ) );
    }
    return ConsesLow.listS( $sym350$PROGN, ConsesLow.list( $sym351$HTML_MARKUP, head ), ConsesLow.append( body, $list352 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 34742L)
  public static SubLObject html_quoted_attribute(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list353 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject att = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list353 );
    att = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym350$PROGN, ConsesLow.list( $sym351$HTML_MARKUP, att ), $list354, ConsesLow.append( body, $list355 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list353 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 34994L)
  public static SubLObject html_markup_body(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym350$PROGN, $list356, ConsesLow.listS( $sym357$CLET, $list358, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 35373L)
  public static SubLObject html_inside_body_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $html_inside_bodyP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 35440L)
  public static SubLObject html_fancy_body(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list359 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list359 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list359 );
      if( NIL == conses_high.member( current_$1, $list360, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list359 );
    }
    final SubLObject show_copyright_tail = cdestructuring_bind.property_list_member( $kw362$SHOW_COPYRIGHT, current );
    final SubLObject show_copyright = ( NIL != show_copyright_tail ) ? conses_high.cadr( show_copyright_tail ) : T;
    final SubLObject background_image_tail = cdestructuring_bind.property_list_member( $kw363$BACKGROUND_IMAGE, current );
    final SubLObject background_image = ( NIL != background_image_tail ) ? conses_high.cadr( background_image_tail ) : NIL;
    final SubLObject background_color_tail = cdestructuring_bind.property_list_member( $kw364$BACKGROUND_COLOR, current );
    final SubLObject background_color = ( NIL != background_color_tail ) ? conses_high.cadr( background_color_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject text_color_tail = cdestructuring_bind.property_list_member( $kw366$TEXT_COLOR, current );
    final SubLObject text_color = ( NIL != text_color_tail ) ? conses_high.cadr( text_color_tail ) : NIL;
    final SubLObject link_color_tail = cdestructuring_bind.property_list_member( $kw367$LINK_COLOR, current );
    final SubLObject link_color = ( NIL != link_color_tail ) ? conses_high.cadr( link_color_tail ) : NIL;
    final SubLObject active_link_color_tail = cdestructuring_bind.property_list_member( $kw368$ACTIVE_LINK_COLOR, current );
    final SubLObject active_link_color = ( NIL != active_link_color_tail ) ? conses_high.cadr( active_link_color_tail ) : NIL;
    final SubLObject visited_link_color_tail = cdestructuring_bind.property_list_member( $kw369$VISITED_LINK_COLOR, current );
    final SubLObject visited_link_color = ( NIL != visited_link_color_tail ) ? conses_high.cadr( visited_link_color_tail ) : NIL;
    final SubLObject script_tail = cdestructuring_bind.property_list_member( $kw370$SCRIPT, current );
    final SubLObject script = ( NIL != script_tail ) ? conses_high.cadr( script_tail ) : NIL;
    final SubLObject onload_tail = cdestructuring_bind.property_list_member( $kw371$ONLOAD, current );
    final SubLObject onload = ( NIL != onload_tail ) ? conses_high.cadr( onload_tail ) : NIL;
    final SubLObject onresize_tail = cdestructuring_bind.property_list_member( $kw372$ONRESIZE, current );
    final SubLObject onresize = ( NIL != onresize_tail ) ? conses_high.cadr( onresize_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != background_image )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list375, background_image.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, background_image ) : background_image ), attributes );
    }
    if( NIL != onload )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list376, background_image.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onload ) : onload ), attributes );
    }
    if( NIL != onresize )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list377, background_image.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onresize ) : onresize ), attributes );
    }
    if( NIL != background_color )
    {
      assert NIL != Types.atom( background_color ) : background_color;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, background_color, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list380, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym381$HTML_COLOR,
          background_color ) ) ) ), attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list382, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != style )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list383, style.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, style ) : style ), attributes );
    }
    if( NIL != text_color )
    {
      assert NIL != Types.atom( text_color ) : text_color;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, text_color, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list384, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym381$HTML_COLOR,
          text_color ) ) ) ), attributes );
    }
    if( NIL != link_color )
    {
      assert NIL != Types.atom( link_color ) : link_color;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, link_color, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list385, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym381$HTML_COLOR,
          link_color ) ) ) ), attributes );
    }
    if( NIL != active_link_color )
    {
      assert NIL != Types.atom( active_link_color ) : active_link_color;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, active_link_color, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list386, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym381$HTML_COLOR,
          active_link_color ) ) ) ), attributes );
    }
    if( NIL != visited_link_color )
    {
      assert NIL != Types.atom( visited_link_color ) : visited_link_color;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, visited_link_color, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list387, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym381$HTML_COLOR,
          visited_link_color ) ) ) ), attributes );
    }
    if( NIL != script )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym350$PROGN, $list388, script.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, script ) : script ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym357$CLET, $list389, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list391, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body,
        ConsesLow.list( $list393, ConsesLow.listS( $sym379$PWHEN, show_copyright, $list394 ) ) ) ) ) ) ), $list395 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 38330L)
  public static SubLObject html_colored_body(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list396 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject color = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list396 );
    color = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject color_value = $sym397$COLOR_VALUE;
      return ConsesLow.list( $sym357$CLET, ConsesLow.list( ConsesLow.list( color_value, color ) ), ConsesLow.listS( $sym398$HTML_FANCY_BODY, ConsesLow.list( $kw364$BACKGROUND_COLOR, color_value ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list396 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 38533L)
  public static SubLObject html_body(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym399$HTML_COLORED_BODY, $list400, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 38740L)
  public static SubLObject html_head(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym350$PROGN, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list401, $list402, ConsesLow.append( body, NIL ) ), $list395 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 39096L)
  public static SubLObject html_head_content_type()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != system_parameters.$permit_utf_8_character_display$.getDynamicValue( thread ) )
    {
      html_utilities.html_meta_utf_8_content_type();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 39256L)
  public static SubLObject html_document(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym350$PROGN, $list405, $list406, $list393, ConsesLow.list( $sym407$WITH_POSSIBLY_NEW_HTML_FILE_DEPENDENCY_SPACE, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list408, ConsesLow.append(
        body, NIL ) ) ), $list395 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 39893L)
  public static SubLObject html_fancy_div(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list409 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list409 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list409 );
      if( NIL == conses_high.member( current_$2, $list410, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list409 );
    }
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject onload_tail = cdestructuring_bind.property_list_member( $kw371$ONLOAD, current );
    final SubLObject onload = ( NIL != onload_tail ) ? conses_high.cadr( onload_tail ) : NIL;
    final SubLObject title_tail = cdestructuring_bind.property_list_member( $kw413$TITLE, current );
    final SubLObject title = ( NIL != title_tail ) ? conses_high.cadr( title_tail ) : NIL;
    final SubLObject misc_tail = cdestructuring_bind.property_list_member( $kw414$MISC, current );
    final SubLObject misc = ( NIL != misc_tail ) ? conses_high.cadr( misc_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != style )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list417, style.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, style ) : style ), attributes );
    }
    if( NIL != title )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list418, title.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, title ) : style ), attributes );
    }
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list419, ConsesLow.list( $sym351$HTML_MARKUP, align ) ) ), attributes );
    }
    if( NIL != onload )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list420, onload.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onload ) : onload ), attributes );
    }
    if( NIL != misc )
    {
      final SubLObject attribute = $sym421$ATTRIBUTE;
      final SubLObject value = $sym422$VALUE;
      attributes = ConsesLow.cons( ConsesLow.list( $sym423$DO_ALIST, ConsesLow.list( attribute, value, misc ), ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, ConsesLow.list( attribute ), ConsesLow.list(
          $sym351$HTML_MARKUP, value ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list424, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 41424L)
  public static SubLObject html_smaller(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym425$HTML_FANCY_SPAN, $list426, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 41612L)
  public static SubLObject html_larger(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym425$HTML_FANCY_SPAN, $list427, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 41797L)
  public static SubLObject html_fancy_span(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list428 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list428 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list428 );
      if( NIL == conses_high.member( current_$3, $list429, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list428 );
    }
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject onclick_tail = cdestructuring_bind.property_list_member( $kw430$ONCLICK, current );
    final SubLObject onclick = ( NIL != onclick_tail ) ? conses_high.cadr( onclick_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject title_tail = cdestructuring_bind.property_list_member( $kw413$TITLE, current );
    final SubLObject title = ( NIL != title_tail ) ? conses_high.cadr( title_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != onclick )
    {
      assert NIL != Types.atom( onclick ) : onclick;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, onclick, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list431, ConsesLow.list( $sym351$HTML_MARKUP, onclick ) ) ), attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != title )
    {
      assert NIL != Types.atom( title ) : title;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, title, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list432, ConsesLow.list( $sym351$HTML_MARKUP, title ) ) ), attributes );
    }
    if( NIL != style )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list433, style.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, style ) : style ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list434, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 42940L)
  public static SubLObject html_meta(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym350$PROGN, $list393, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list435, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 43176L)
  public static SubLObject html_fancy_meta(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list436 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list436 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list436 );
      if( NIL == conses_high.member( current_$4, $list437, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list436 );
    }
    final SubLObject http_equiv_tail = cdestructuring_bind.property_list_member( $kw438$HTTP_EQUIV, current );
    final SubLObject http_equiv = ( NIL != http_equiv_tail ) ? conses_high.cadr( http_equiv_tail ) : NIL;
    final SubLObject content_tail = cdestructuring_bind.property_list_member( $kw439$CONTENT, current );
    final SubLObject content = ( NIL != content_tail ) ? conses_high.cadr( content_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject scheme_tail = cdestructuring_bind.property_list_member( $kw441$SCHEME, current );
    final SubLObject scheme = ( NIL != scheme_tail ) ? conses_high.cadr( scheme_tail ) : NIL;
    final SubLObject lang_tail = cdestructuring_bind.property_list_member( $kw442$LANG, current );
    final SubLObject lang = ( NIL != lang_tail ) ? conses_high.cadr( lang_tail ) : NIL;
    final SubLObject dir_tail = cdestructuring_bind.property_list_member( $kw443$DIR, current );
    final SubLObject dir = ( NIL != dir_tail ) ? conses_high.cadr( dir_tail ) : NIL;
    current = temp;
    if( NIL == current )
    {
      SubLObject attributes = NIL;
      if( NIL != content )
      {
        assert NIL != Types.atom( content ) : content;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, content, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list444, ConsesLow.list( $sym351$HTML_MARKUP, content ) ) ), attributes );
      }
      if( NIL != name )
      {
        assert NIL != Types.atom( name ) : name;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, name, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list445, ConsesLow.list( $sym351$HTML_MARKUP, name ) ) ), attributes );
      }
      if( NIL != scheme )
      {
        assert NIL != Types.atom( scheme ) : scheme;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, scheme, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list446, ConsesLow.list( $sym351$HTML_MARKUP, scheme ) ) ), attributes );
      }
      if( NIL != lang )
      {
        assert NIL != Types.atom( lang ) : lang;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, lang, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list447, ConsesLow.list( $sym351$HTML_MARKUP, lang ) ) ), attributes );
      }
      if( NIL != dir )
      {
        assert NIL != Types.atom( dir ) : dir;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, dir, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list448, ConsesLow.list( $sym351$HTML_MARKUP, dir ) ) ), attributes );
      }
      if( NIL != http_equiv )
      {
        assert NIL != Types.atom( http_equiv ) : http_equiv;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, http_equiv, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list449, ConsesLow.list( $sym351$HTML_MARKUP, http_equiv ) ) ), attributes );
      }
      return reader.bq_cons( $sym450$HTML_META, ConsesLow.append( attributes, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list436 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 44359L)
  public static SubLObject html_link(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym350$PROGN, $list393, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list451, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 44573L)
  public static SubLObject html_fancy_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list452 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list452 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list452 );
      if( NIL == conses_high.member( current_$5, $list453, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list452 );
    }
    final SubLObject rel_tail = cdestructuring_bind.property_list_member( $kw454$REL, current );
    final SubLObject rel = ( NIL != rel_tail ) ? conses_high.cadr( rel_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw455$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject href_tail = cdestructuring_bind.property_list_member( $kw456$HREF, current );
    final SubLObject href = ( NIL != href_tail ) ? conses_high.cadr( href_tail ) : NIL;
    final SubLObject media_tail = cdestructuring_bind.property_list_member( $kw457$MEDIA, current );
    final SubLObject media = ( NIL != media_tail ) ? conses_high.cadr( media_tail ) : NIL;
    final SubLObject title_tail = cdestructuring_bind.property_list_member( $kw413$TITLE, current );
    final SubLObject title = ( NIL != title_tail ) ? conses_high.cadr( title_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    current = temp;
    if( NIL == current )
    {
      SubLObject attributes = NIL;
      if( NIL != media )
      {
        assert NIL != Types.atom( media ) : media;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, media, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list458, ConsesLow.list( $sym351$HTML_MARKUP, media ) ) ), attributes );
      }
      if( NIL != title )
      {
        assert NIL != Types.atom( title ) : title;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, title, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list459, ConsesLow.list( $sym351$HTML_MARKUP, title ) ) ), attributes );
      }
      if( NIL != type )
      {
        assert NIL != Types.atom( type ) : type;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, type, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list460, ConsesLow.list( $sym351$HTML_MARKUP, type ) ) ), attributes );
      }
      if( NIL != href )
      {
        assert NIL != Types.atom( href ) : href;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, href, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list461, ConsesLow.list( $sym351$HTML_MARKUP, href ) ) ), attributes );
      }
      if( NIL != rel )
      {
        assert NIL != Types.atom( rel ) : rel;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, rel, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list462, ConsesLow.list( $sym351$HTML_MARKUP, rel ) ) ), attributes );
      }
      if( NIL != id )
      {
        assert NIL != Types.atom( id ) : id;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
      }
      return reader.bq_cons( $sym463$HTML_LINK, ConsesLow.append( attributes, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list452 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 45690L)
  public static SubLObject html_base(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym350$PROGN, $list393, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list464, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 45904L)
  public static SubLObject html_fancy_base(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list465 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list465 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list465 );
      if( NIL == conses_high.member( current_$6, $list466, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list465 );
    }
    final SubLObject href_tail = cdestructuring_bind.property_list_member( $kw456$HREF, current );
    final SubLObject href = ( NIL != href_tail ) ? conses_high.cadr( href_tail ) : NIL;
    current = temp;
    if( NIL == current )
    {
      SubLObject attributes = NIL;
      if( NIL != href )
      {
        assert NIL != Types.atom( href ) : href;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, href, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list467, ConsesLow.list( $sym351$HTML_MARKUP, href ) ) ), attributes );
      }
      return reader.bq_cons( $sym468$HTML_BASE, ConsesLow.append( attributes, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list465 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 46188L)
  public static SubLObject html_stylesheet_link(final SubLObject href, SubLObject id, SubLObject title, SubLObject media)
  {
    if( id == UNPROVIDED )
    {
      id = NIL;
    }
    if( title == UNPROVIDED )
    {
      title = NIL;
    }
    if( media == UNPROVIDED )
    {
      media = $str469$all;
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( $html_link_head$.getGlobalValue() );
    if( NIL != id )
    {
      html_utilities.html_markup( $html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( $html_link_rel$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str470$stylesheet );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != href )
    {
      html_utilities.html_markup( $html_link_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( href );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( $html_link_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str471$text_css );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != title )
    {
      html_utilities.html_markup( $html_link_title$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( title );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != media )
    {
      html_utilities.html_markup( $html_link_media$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( media );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 46392L)
  public static SubLObject html_style(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym350$PROGN, $list393, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list472, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 46573L)
  public static SubLObject html_title(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym350$PROGN, $list393, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list473, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 46811L)
  public static SubLObject html_simple_document(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list474 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject title = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list474 );
    title = current.first();
    current = current.rest();
    final SubLObject color = current.isCons() ? current.first() : $sym0$_HTML_DEFAULT_BGCOLOR_;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list474 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym475$HTML_DOCUMENT, ConsesLow.list( $sym404$HTML_HEAD, ConsesLow.list( $sym476$HTML_TITLE, ConsesLow.list( $sym477$HTML_PRINC, title ) ) ), ConsesLow.listS( $sym399$HTML_COLORED_BODY,
          ConsesLow.list( color ), ConsesLow.list( $sym478$HTML_HEADING, $list479, ConsesLow.list( $sym477$HTML_PRINC, title ) ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list474 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 47384L)
  public static SubLObject html_simple_browser_document(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list480 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject title = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list480 );
    title = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list480 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list480 );
      if( NIL == conses_high.member( current_$7, $list481, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list480 );
    }
    final SubLObject completionP_tail = cdestructuring_bind.property_list_member( $kw482$COMPLETION_, current );
    final SubLObject completionP = ( NIL != completionP_tail ) ? conses_high.cadr( completionP_tail ) : NIL;
    final SubLObject color_tail = cdestructuring_bind.property_list_member( $kw483$COLOR, current );
    final SubLObject color = ( NIL != color_tail ) ? conses_high.cadr( color_tail ) : $sym0$_HTML_DEFAULT_BGCOLOR_;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym475$HTML_DOCUMENT, ConsesLow.list( $sym404$HTML_HEAD, ConsesLow.list( $sym476$HTML_TITLE, ConsesLow.list( $sym477$HTML_PRINC, title ) ), ConsesLow.listS( $sym379$PWHEN, completionP,
        $list484 ) ), ConsesLow.listS( $sym399$HTML_COLORED_BODY, ConsesLow.list( color ), ConsesLow.list( $sym478$HTML_HEADING, $list479, ConsesLow.list( $sym477$HTML_PRINC, title ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 48083L)
  public static SubLObject html_blockquote(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list485, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 49871L)
  public static SubLObject html_center(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list486, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 50053L)
  public static SubLObject html_heading(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list487 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list487 );
    level = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym350$PROGN, ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list488, ConsesLow.list( $sym351$HTML_MARKUP, level ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list(
          $sym390$HTML_MARKUP_WRAPPER, $list489, ConsesLow.list( $sym351$HTML_MARKUP, level ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list487 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 50438L)
  public static SubLObject html_paragraph(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list490, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 50707L)
  public static SubLObject html_plaintext(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list491, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 51022L)
  public static SubLObject verify_within_html_pre()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $within_html_pre$.getDynamicValue( thread ) )
    {
      Errors.warn( $str492$HTML_UNPRE_used_when_not_within_H );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 51164L)
  public static SubLObject verify_not_within_html_pre()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $within_html_pre$.getDynamicValue( thread ) )
    {
      Errors.warn( $str493$Nested_calls_to_HTML_PRE_will_con );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 51320L)
  public static SubLObject html_pre(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym350$PROGN, $list494, ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list495, ConsesLow.listS( $sym357$CLET, $list496, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 51706L)
  public static SubLObject html_unpre(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym350$PROGN, $list497, ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list498, ConsesLow.listS( $sym357$CLET, $list499, $list393, ConsesLow.append( body, $list395 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52285L)
  public static SubLObject html_address(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list500, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52551L)
  public static SubLObject html_big(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list501, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52726L)
  public static SubLObject html_bold(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list502, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52890L)
  public static SubLObject html_b(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym503$HTML_BOLD, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 52994L)
  public static SubLObject html_cite(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list504, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53173L)
  public static SubLObject html_code(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list505, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53352L)
  public static SubLObject html_definition(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list506, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53548L)
  public static SubLObject html_emphasized(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list507, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53772L)
  public static SubLObject html_em(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym508$HTML_EMPHASIZED, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 53925L)
  public static SubLObject html_fancy_font(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list509 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list509 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list509 );
      if( NIL == conses_high.member( current_$8, $list510, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list509 );
    }
    final SubLObject size_tail = cdestructuring_bind.property_list_member( $kw511$SIZE, current );
    final SubLObject size = ( NIL != size_tail ) ? conses_high.cadr( size_tail ) : NIL;
    final SubLObject color_tail = cdestructuring_bind.property_list_member( $kw483$COLOR, current );
    final SubLObject color = ( NIL != color_tail ) ? conses_high.cadr( color_tail ) : NIL;
    final SubLObject face_tail = cdestructuring_bind.property_list_member( $kw512$FACE, current );
    final SubLObject face = ( NIL != face_tail ) ? conses_high.cadr( face_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != size )
    {
      assert NIL != Types.atom( size ) : size;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, size, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list513, ConsesLow.list( $sym351$HTML_MARKUP, size ) ) ), attributes );
    }
    if( NIL != color )
    {
      assert NIL != Types.atom( color ) : color;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, color, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list514, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym381$HTML_COLOR, color ) ) ) ),
          attributes );
    }
    if( NIL != face )
    {
      assert NIL != Types.atom( face ) : face;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, size, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list515, ConsesLow.list( $sym351$HTML_MARKUP, face ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    if( NIL != attributes )
    {
      return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list516, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
    }
    return reader.bq_cons( $sym350$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 54796L)
  public static SubLObject html_font(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list517 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject size = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list517 );
    size = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject size_val = $sym518$SIZE_VAL;
      return ConsesLow.list( $sym357$CLET, ConsesLow.list( ConsesLow.list( size_val, size ) ), ConsesLow.listS( $sym519$HTML_FANCY_FONT, ConsesLow.list( $kw511$SIZE, size_val ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list517 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55044L)
  public static SubLObject html_font_color(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list396 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject color = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list396 );
    color = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject color_val = $sym520$COLOR_VAL;
      return ConsesLow.list( $sym357$CLET, ConsesLow.list( ConsesLow.list( color_val, color ) ), ConsesLow.listS( $sym519$HTML_FANCY_FONT, ConsesLow.list( $kw483$COLOR, color_val ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list396 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55281L)
  public static SubLObject html_text_background_color(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list396 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject color = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list396 );
    color = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym425$HTML_FANCY_SPAN, ConsesLow.list( $kw373$STYLE, ConsesLow.list( $sym521$HTML_STYLE_BACKGROUND_COLOR, color ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list396 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55501L)
  public static SubLObject html_italic(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list522, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55674L)
  public static SubLObject html_i(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym523$HTML_ITALIC, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55783L)
  public static SubLObject html_keyboard(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list524, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 55973L)
  public static SubLObject html_sample(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list525, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56190L)
  public static SubLObject html_small(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list526, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56373L)
  public static SubLObject html_strikethrough(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list527, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56581L)
  public static SubLObject html_strong(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list528, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56785L)
  public static SubLObject html_subscript(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list529, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 56978L)
  public static SubLObject html_superscript(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list530, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57179L)
  public static SubLObject html_teletype(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list531, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57375L)
  public static SubLObject html_tt(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym532$HTML_TELETYPE, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57504L)
  public static SubLObject html_underlined(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list533, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57698L)
  public static SubLObject html_u(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym534$HTML_UNDERLINED, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 57820L)
  public static SubLObject html_variable(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list535, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 58010L)
  public static SubLObject html_fancy_label(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list536 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list536 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list536 );
      if( NIL == conses_high.member( current_$9, $list537, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list536 );
    }
    final SubLObject access_key_tail = cdestructuring_bind.property_list_member( $kw538$ACCESS_KEY, current );
    final SubLObject access_key = ( NIL != access_key_tail ) ? conses_high.cadr( access_key_tail ) : NIL;
    final SubLObject for_tail = cdestructuring_bind.property_list_member( $kw539$FOR, current );
    final SubLObject v_for = ( NIL != for_tail ) ? conses_high.cadr( for_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != access_key )
    {
      assert NIL != Types.atom( access_key ) : access_key;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, access_key, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list540, ConsesLow.list( $sym351$HTML_MARKUP, access_key ) ) ), attributes );
    }
    if( NIL != v_for )
    {
      assert NIL != Types.atom( v_for ) : v_for;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_for, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list541, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym381$HTML_COLOR, v_for ) ) ) ),
          attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    if( NIL != attributes )
    {
      return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list542, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
    }
    return reader.bq_cons( $sym350$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 58712L)
  public static SubLObject html_definition_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list543, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 59080L)
  public static SubLObject html_compact_definition_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list543, $list544, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 59398L)
  public static SubLObject html_dl_term(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list545, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 59637L)
  public static SubLObject html_dl_definition(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list546, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 59886L)
  public static SubLObject html_directory_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list547, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 60152L)
  public static SubLObject html_compact_directory_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list547, $list544, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 60468L)
  public static SubLObject html_menu_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list548, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 60707L)
  public static SubLObject html_compact_menu_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list548, $list544, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 61005L)
  public static SubLObject html_fancy_ordered_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list549 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list549 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list549 );
      if( NIL == conses_high.member( current_$10, $list550, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list549 );
    }
    final SubLObject compact_tail = cdestructuring_bind.property_list_member( $kw551$COMPACT, current );
    final SubLObject compact = ( NIL != compact_tail ) ? conses_high.cadr( compact_tail ) : NIL;
    final SubLObject continue_tail = cdestructuring_bind.property_list_member( $kw552$CONTINUE, current );
    final SubLObject v_continue = ( NIL != continue_tail ) ? conses_high.cadr( continue_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw455$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw553$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : NIL;
    final SubLObject seqnum_tail = cdestructuring_bind.property_list_member( $kw554$SEQNUM, current );
    final SubLObject seqnum = ( NIL != seqnum_tail ) ? conses_high.cadr( seqnum_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != compact )
    {
      assert NIL != Types.atom( compact ) : compact;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, compact, $list555 ), attributes );
    }
    if( NIL != v_continue )
    {
      assert NIL != Types.atom( v_continue ) : v_continue;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, v_continue, $list556 ), attributes );
    }
    if( NIL != type )
    {
      assert NIL != Types.atom( type ) : type;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, type, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list557, ConsesLow.list( $sym351$HTML_MARKUP, type ) ) ), attributes );
    }
    if( NIL != start )
    {
      assert NIL != Types.atom( start ) : start;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, start, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list558, ConsesLow.list( $sym351$HTML_MARKUP, start ) ) ), attributes );
    }
    if( NIL != seqnum )
    {
      assert NIL != Types.atom( seqnum ) : seqnum;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, seqnum, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list559, ConsesLow.list( $sym351$HTML_MARKUP, seqnum ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list560, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 62146L)
  public static SubLObject html_ordered_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym561$HTML_FANCY_ORDERED_LIST, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 62328L)
  public static SubLObject html_number_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym562$HTML_ORDERED_LIST, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 62489L)
  public static SubLObject html_fancy_unordered_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list563 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list563 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list563 );
      if( NIL == conses_high.member( current_$11, $list564, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list563 );
    }
    final SubLObject compact_tail = cdestructuring_bind.property_list_member( $kw551$COMPACT, current );
    final SubLObject compact = ( NIL != compact_tail ) ? conses_high.cadr( compact_tail ) : NIL;
    final SubLObject plain_tail = cdestructuring_bind.property_list_member( $kw565$PLAIN, current );
    final SubLObject plain = ( NIL != plain_tail ) ? conses_high.cadr( plain_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw455$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject src_tail = cdestructuring_bind.property_list_member( $kw566$SRC, current );
    final SubLObject src = ( NIL != src_tail ) ? conses_high.cadr( src_tail ) : NIL;
    final SubLObject dingbat_tail = cdestructuring_bind.property_list_member( $kw567$DINGBAT, current );
    final SubLObject dingbat = ( NIL != dingbat_tail ) ? conses_high.cadr( dingbat_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != compact )
    {
      assert NIL != Types.atom( compact ) : compact;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, compact, $list555 ), attributes );
    }
    if( NIL != plain )
    {
      assert NIL != Types.atom( plain ) : plain;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, plain, $list568 ), attributes );
    }
    if( NIL != type )
    {
      assert NIL != Types.atom( type ) : type;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, type, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list557, ConsesLow.list( $sym351$HTML_MARKUP, type ) ) ), attributes );
    }
    if( NIL != src )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list569, src.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, src ) : src ), attributes );
    }
    if( NIL != dingbat )
    {
      assert NIL != Types.atom( dingbat ) : dingbat;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, dingbat, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list570, ConsesLow.list( $sym351$HTML_MARKUP, dingbat ) ) ), attributes );
    }
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list571, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 63982L)
  public static SubLObject html_unordered_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym572$HTML_FANCY_UNORDERED_LIST, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 64169L)
  public static SubLObject html_bullet_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return reader.bq_cons( $sym573$HTML_UNORDERED_LIST, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 64333L)
  public static SubLObject html_plain_list(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym572$HTML_FANCY_UNORDERED_LIST, $list574, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 64536L)
  public static SubLObject html_fancy_list_item(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list575 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list575 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list575 );
      if( NIL == conses_high.member( current_$12, $list576, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list575 );
    }
    final SubLObject skip_tail = cdestructuring_bind.property_list_member( $kw577$SKIP, current );
    final SubLObject skip = ( NIL != skip_tail ) ? conses_high.cadr( skip_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw455$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject src_tail = cdestructuring_bind.property_list_member( $kw566$SRC, current );
    final SubLObject src = ( NIL != src_tail ) ? conses_high.cadr( src_tail ) : NIL;
    final SubLObject dingbat_tail = cdestructuring_bind.property_list_member( $kw567$DINGBAT, current );
    final SubLObject dingbat = ( NIL != dingbat_tail ) ? conses_high.cadr( dingbat_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != skip )
    {
      assert NIL != Types.atom( skip ) : skip;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, skip, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list578, ConsesLow.list( $sym351$HTML_MARKUP, skip ) ) ), attributes );
    }
    if( NIL != type )
    {
      assert NIL != Types.atom( type ) : type;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, type, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list579, ConsesLow.list( $sym351$HTML_MARKUP, type ) ) ), attributes );
    }
    if( NIL != src )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list580, src.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, src ) : src ), attributes );
    }
    if( NIL != id )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list581, id.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, id ) : id ), attributes );
    }
    if( NIL != dingbat )
    {
      assert NIL != Types.atom( dingbat ) : dingbat;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, dingbat, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list582, ConsesLow.list( $sym351$HTML_MARKUP, dingbat ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list583, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 65890L)
  public static SubLObject html_list_item(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym584$HTML_FANCY_LIST_ITEM, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 66056L)
  public static SubLObject html_fancy_summary(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list585 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$13 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list585 );
      current_$13 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list585 );
      if( NIL == conses_high.member( current_$13, $list586, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$13 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list585 );
    }
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != id )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list581, id.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, id ) : id ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list587, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 66956L)
  public static SubLObject html_fancy_details(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list585 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$14 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list585 );
      current_$14 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list585 );
      if( NIL == conses_high.member( current_$14, $list586, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$14 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list585 );
    }
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != id )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list581, id.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, id ) : id ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list588, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 67747L)
  public static SubLObject html_applet(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject code = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list589 );
    code = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list589 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$15 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list589 );
      current_$15 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list589 );
      if( NIL == conses_high.member( current_$15, $list590, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$15 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list589 );
    }
    final SubLObject codebase_tail = cdestructuring_bind.property_list_member( $kw591$CODEBASE, current );
    final SubLObject codebase = ( NIL != codebase_tail ) ? conses_high.cadr( codebase_tail ) : NIL;
    final SubLObject archive_tail = cdestructuring_bind.property_list_member( $kw592$ARCHIVE, current );
    final SubLObject archive = ( NIL != archive_tail ) ? conses_high.cadr( archive_tail ) : NIL;
    final SubLObject alt_tail = cdestructuring_bind.property_list_member( $kw593$ALT, current );
    final SubLObject alt = ( NIL != alt_tail ) ? conses_high.cadr( alt_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw594$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw595$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list596, code.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, code ) : code ), attributes );
    if( NIL != codebase )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list597, codebase.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, codebase ) : codebase ), attributes );
    }
    if( NIL != archive )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list598, archive.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, archive ) : archive ), attributes );
    }
    if( NIL != alt )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list599, alt.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, alt ) : alt ), attributes );
    }
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list600, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, align ) ) ) ),
          attributes );
    }
    if( NIL != name )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, name, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list602, ConsesLow.list( $sym351$HTML_MARKUP, name ) ) ), attributes );
    }
    if( NIL != id )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list603, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != height )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list604, height.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, height ) : height ), attributes );
    }
    if( NIL != width )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list605, width.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, width ) : width ), attributes );
    }
    attributes = Sequences.nreverse( attributes );
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list606, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 69560L)
  public static SubLObject html_param(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list607 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list607 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list608, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list609, ConsesLow.list( $sym351$HTML_MARKUP, name ) ), ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE,
          $list610, ConsesLow.list( $sym351$HTML_MARKUP, value ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list607 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 69803L)
  public static SubLObject html_safe_param(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list607 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list607 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list608, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list609, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym611$TO_STRING, name ) ) ), ConsesLow
          .list( $sym374$HTML_QUOTED_ATTRIBUTE, $list610, ConsesLow.list( $sym612$PIF, ConsesLow.list( $sym613$STRINGP, value ), ConsesLow.list( $sym477$HTML_PRINC, value ), ConsesLow.list( $sym614$HTML_PRIN1,
              value ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list607 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70253L)
  public static SubLObject with_html_id_space(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym357$CLET, $list615, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70507L)
  public static SubLObject next_html_id(SubLObject generator)
  {
    if( generator == UNPROVIDED )
    {
      generator = $html_id_space_id_generator$.getDynamicValue();
    }
    return integer_sequence_generator.integer_sequence_generator_next( generator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70645L)
  public static SubLObject next_html_id_definedP(SubLObject generator)
  {
    if( generator == UNPROVIDED )
    {
      generator = $html_id_space_id_generator$.getDynamicValue();
    }
    return integer_sequence_generator.integer_sequence_generator_p( generator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 70930L)
  public static SubLObject with_html_unique_form_fields(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym357$CLET, $list619, ConsesLow.append( body, $list620 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 71500L)
  public static SubLObject with_html_unique_form_field_decoding(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list621 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list621 );
    args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym357$CLET, ConsesLow.list( ConsesLow.list( $sym616$_HTML_FORM_FIELD_UNIQUIFIER_CODE_, ConsesLow.list( $sym622$GET_FORM_FIELD_CODE, args ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list621 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 71748L)
  public static SubLObject next_html_form_field_uniquifier_code()
  {
    final SubLObject isg = find_or_create_html_form_field_uniquifier_isg();
    return integer_sequence_generator.integer_sequence_generator_next( isg );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 72202L)
  public static SubLObject find_or_create_html_form_field_uniquifier_isg()
  {
    final SubLObject isg = $html_form_field_uniquifier_isg$.getGlobalValue();
    if( NIL != integer_sequence_generator.integer_sequence_generator_p( isg ) )
    {
      return isg;
    }
    $html_form_field_uniquifier_isg$.setGlobalValue( integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return $html_form_field_uniquifier_isg$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 72493L)
  public static SubLObject embed_form_field_code(final SubLObject code)
  {
    return html_utilities.html_hidden_input( $str626$uniquifier_code, code, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 72750L)
  public static SubLObject get_form_field_code(final SubLObject args)
  {
    final SubLObject code_string = html_utilities.html_extract_input( $str626$uniquifier_code, args );
    return code_string.isString() ? reader.parse_integer( code_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 73217L)
  public static SubLObject html_fancy_form(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list628 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject action = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list628 );
    action = current.first();
    current = current.rest();
    final SubLObject method = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list628 );
    current = current.rest();
    final SubLObject target = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list628 );
    current = current.rest();
    final SubLObject name = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list628 );
    current = current.rest();
    final SubLObject script = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list628 );
    current = current.rest();
    final SubLObject form_id = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list628 );
    current = current.rest();
    final SubLObject enctype = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list628 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      SubLObject attributes = NIL;
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list629, action.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, action ) : action ), attributes );
      if( NIL != enctype )
      {
        assert NIL != Types.atom( enctype ) : enctype;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, enctype, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list630, ConsesLow.list( $sym351$HTML_MARKUP, enctype ) ) ), attributes );
      }
      if( NIL != form_id )
      {
        assert NIL != Types.atom( form_id ) : form_id;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, form_id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, form_id ) ) ), attributes );
      }
      if( NIL != method )
      {
        assert NIL != Types.atom( method ) : method;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, method, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list631, ConsesLow.list( $sym351$HTML_MARKUP, method ) ) ), attributes );
      }
      if( NIL != name )
      {
        assert NIL != Types.atom( name ) : name;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, name, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list632, ConsesLow.list( $sym351$HTML_MARKUP, name ) ) ), attributes );
      }
      if( NIL != target )
      {
        assert NIL != Types.atom( target ) : target;
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, target, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list633, ConsesLow.list( $sym351$HTML_MARKUP, target ) ) ), attributes );
      }
      if( NIL != script )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym350$PROGN, $list388, script.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, script ) : script ), attributes );
      }
      attributes = Sequences.nreverse( attributes );
      return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list634, ConsesLow.append( attributes, ConsesLow.list( ConsesLow.list( $sym392$HTML_MARKUP_BODY, ConsesLow.list( $sym357$CLET, $list635, reader.bq_cons(
          $sym617$WITH_HTML_UNIQUE_FORM_FIELDS, ConsesLow.append( body, NIL ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list628 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 74817L)
  public static SubLObject html_fancy_input(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list636 );
    type = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$16 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list636 );
      current_$16 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list636 );
      if( NIL == conses_high.member( current_$16, $list637, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$16 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list636 );
    }
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject value_tail = cdestructuring_bind.property_list_member( $kw638$VALUE, current );
    final SubLObject value = ( NIL != value_tail ) ? conses_high.cadr( value_tail ) : NIL;
    final SubLObject checked_tail = cdestructuring_bind.property_list_member( $kw639$CHECKED, current );
    final SubLObject checked = ( NIL != checked_tail ) ? conses_high.cadr( checked_tail ) : NIL;
    final SubLObject disabledP_tail = cdestructuring_bind.property_list_member( $kw640$DISABLED_, current );
    final SubLObject disabledP = ( NIL != disabledP_tail ) ? conses_high.cadr( disabledP_tail ) : NIL;
    final SubLObject readonly_tail = cdestructuring_bind.property_list_member( $kw641$READONLY, current );
    final SubLObject readonly = ( NIL != readonly_tail ) ? conses_high.cadr( readonly_tail ) : NIL;
    final SubLObject size_tail = cdestructuring_bind.property_list_member( $kw511$SIZE, current );
    final SubLObject size = ( NIL != size_tail ) ? conses_high.cadr( size_tail ) : NIL;
    final SubLObject maxlength_tail = cdestructuring_bind.property_list_member( $kw642$MAXLENGTH, current );
    final SubLObject maxlength = ( NIL != maxlength_tail ) ? conses_high.cadr( maxlength_tail ) : NIL;
    final SubLObject src_tail = cdestructuring_bind.property_list_member( $kw566$SRC, current );
    final SubLObject src = ( NIL != src_tail ) ? conses_high.cadr( src_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject border_tail = cdestructuring_bind.property_list_member( $kw643$BORDER, current );
    final SubLObject border = ( NIL != border_tail ) ? conses_high.cadr( border_tail ) : NIL;
    final SubLObject min_tail = cdestructuring_bind.property_list_member( $kw644$MIN, current );
    final SubLObject min = ( NIL != min_tail ) ? conses_high.cadr( min_tail ) : NIL;
    final SubLObject max_tail = cdestructuring_bind.property_list_member( $kw645$MAX, current );
    final SubLObject max = ( NIL != max_tail ) ? conses_high.cadr( max_tail ) : NIL;
    final SubLObject step_tail = cdestructuring_bind.property_list_member( $kw646$STEP, current );
    final SubLObject step = ( NIL != step_tail ) ? conses_high.cadr( step_tail ) : NIL;
    final SubLObject script_tail = cdestructuring_bind.property_list_member( $kw370$SCRIPT, current );
    final SubLObject script = ( NIL != script_tail ) ? conses_high.cadr( script_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject onchange_tail = cdestructuring_bind.property_list_member( $kw647$ONCHANGE, current );
    final SubLObject onchange = ( NIL != onchange_tail ) ? conses_high.cadr( onchange_tail ) : NIL;
    final SubLObject onclick_tail = cdestructuring_bind.property_list_member( $kw430$ONCLICK, current );
    final SubLObject onclick = ( NIL != onclick_tail ) ? conses_high.cadr( onclick_tail ) : NIL;
    final SubLObject onblur_tail = cdestructuring_bind.property_list_member( $kw648$ONBLUR, current );
    final SubLObject onblur = ( NIL != onblur_tail ) ? conses_high.cadr( onblur_tail ) : NIL;
    final SubLObject onfocus_tail = cdestructuring_bind.property_list_member( $kw649$ONFOCUS, current );
    final SubLObject onfocus = ( NIL != onfocus_tail ) ? conses_high.cadr( onfocus_tail ) : NIL;
    final SubLObject onkeyup_tail = cdestructuring_bind.property_list_member( $kw650$ONKEYUP, current );
    final SubLObject onkeyup = ( NIL != onkeyup_tail ) ? conses_high.cadr( onkeyup_tail ) : NIL;
    final SubLObject onkeydown_tail = cdestructuring_bind.property_list_member( $kw651$ONKEYDOWN, current );
    final SubLObject onkeydown = ( NIL != onkeydown_tail ) ? conses_high.cadr( onkeydown_tail ) : NIL;
    final SubLObject onkeypress_tail = cdestructuring_bind.property_list_member( $kw652$ONKEYPRESS, current );
    final SubLObject onkeypress = ( NIL != onkeypress_tail ) ? conses_high.cadr( onkeypress_tail ) : NIL;
    final SubLObject alt_tail = cdestructuring_bind.property_list_member( $kw593$ALT, current );
    final SubLObject alt = ( NIL != alt_tail ) ? conses_high.cadr( alt_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject title_tail = cdestructuring_bind.property_list_member( $kw413$TITLE, current );
    final SubLObject title = ( NIL != title_tail ) ? conses_high.cadr( title_tail ) : NIL;
    SubLObject attributes = NIL;
    SubLObject static_disabledP = NIL;
    assert NIL != Types.atom( type ) : type;
    attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list653, ConsesLow.list( $sym351$HTML_MARKUP, type ) ), attributes );
    if( NIL != style )
    {
      assert NIL != Types.atom( style ) : style;
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list654, ConsesLow.list( $sym351$HTML_MARKUP, style ) ), attributes );
    }
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != name )
    {
      assert NIL != Types.atom( name ) : name;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, name, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list655, ConsesLow.list( $sym351$HTML_MARKUP, name ) ) ), attributes );
    }
    if( NIL != alt )
    {
      assert NIL != Types.atom( alt ) : alt;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, alt, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list656, ConsesLow.list( $sym351$HTML_MARKUP, alt ) ) ), attributes );
    }
    if( NIL != value )
    {
      assert NIL != Types.atom( value ) : value;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, value, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list657, ConsesLow.list( $sym477$HTML_PRINC, value ) ) ), attributes );
    }
    if( NIL != checked )
    {
      assert NIL != Types.atom( checked ) : checked;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, checked, $list658 ), attributes );
    }
    if( NIL != readonly )
    {
      assert NIL != Types.atom( readonly ) : readonly;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, readonly, $list659 ), attributes );
    }
    if( NIL != disabledP )
    {
      assert NIL != Types.atom( disabledP ) : disabledP;
      static_disabledP = T;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, disabledP, $list660 ), attributes );
    }
    if( NIL != size )
    {
      assert NIL != Types.atom( size ) : size;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, size, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list661, ConsesLow.list( $sym351$HTML_MARKUP, size ) ) ), attributes );
    }
    if( NIL != maxlength )
    {
      assert NIL != Types.atom( maxlength ) : maxlength;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, maxlength, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list662, ConsesLow.list( $sym351$HTML_MARKUP, maxlength ) ) ), attributes );
    }
    if( NIL != src )
    {
      if( src.isAtom() )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, src, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list663, ConsesLow.list( $sym351$HTML_MARKUP, src ) ) ), attributes );
      }
      else
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list663, src ), attributes );
      }
    }
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list664, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, align ) ) ) ),
          attributes );
    }
    if( NIL != border )
    {
      assert NIL != Types.atom( border ) : border;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, border, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list665, ConsesLow.list( $sym351$HTML_MARKUP, border ) ) ), attributes );
    }
    if( NIL != min )
    {
      assert NIL != Types.atom( min ) : min;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, min, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list666, ConsesLow.list( $sym351$HTML_MARKUP, min ) ) ), attributes );
    }
    if( NIL != max )
    {
      assert NIL != Types.atom( max ) : max;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, max, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list667, ConsesLow.list( $sym351$HTML_MARKUP, max ) ) ), attributes );
    }
    if( NIL != step )
    {
      assert NIL != Types.atom( step ) : step;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, step, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list668, ConsesLow.list( $sym351$HTML_MARKUP, step ) ) ), attributes );
    }
    if( NIL != script )
    {
      if( script.isAtom() )
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, script, $list388, ConsesLow.list( $sym351$HTML_MARKUP, script ) ), attributes );
      }
      else
      {
        attributes = ConsesLow.cons( ConsesLow.list( $sym350$PROGN, $list388, script ), attributes );
      }
    }
    if( NIL != onchange )
    {
      assert NIL != Types.atom( onchange ) : onchange;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, onchange, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list669, ConsesLow.list( $sym351$HTML_MARKUP, onchange ) ) ), attributes );
    }
    if( NIL != onclick )
    {
      assert NIL != Types.atom( onclick ) : onclick;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, onclick, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list431, ConsesLow.list( $sym351$HTML_MARKUP, onclick ) ) ), attributes );
    }
    if( NIL != onblur )
    {
      assert NIL != Types.atom( onblur ) : onblur;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, onblur, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list670, ConsesLow.list( $sym351$HTML_MARKUP, onblur ) ) ), attributes );
    }
    if( NIL != onfocus )
    {
      assert NIL != Types.atom( onfocus ) : onfocus;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, onfocus, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list671, ConsesLow.list( $sym351$HTML_MARKUP, onfocus ) ) ), attributes );
    }
    if( NIL != onkeyup )
    {
      assert NIL != Types.atom( onkeyup ) : onkeyup;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, onkeyup, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list672, ConsesLow.list( $sym351$HTML_MARKUP, onkeyup ) ) ), attributes );
    }
    if( NIL != onkeydown )
    {
      assert NIL != Types.atom( onkeydown ) : onkeydown;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, onkeydown, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list673, ConsesLow.list( $sym351$HTML_MARKUP, onkeydown ) ) ), attributes );
    }
    if( NIL != onkeypress )
    {
      assert NIL != Types.atom( onkeypress ) : onkeypress;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, onkeypress, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list674, ConsesLow.list( $sym351$HTML_MARKUP, onkeypress ) ) ), attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != title )
    {
      assert NIL != Types.atom( title ) : title;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, title, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list432, ConsesLow.list( $sym351$HTML_MARKUP, title ) ) ), attributes );
    }
    if( NIL == static_disabledP )
    {
      attributes = ConsesLow.cons( $list675, attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list676, ConsesLow.append( attributes, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 80609L)
  public static SubLObject html_script_button(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list677 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list677 );
    value = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$17 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list677 );
      current_$17 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list677 );
      if( NIL == conses_high.member( current_$17, $list678, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$17 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list677 );
    }
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym679$HTML_FANCY_INPUT, $sym680$_HTML_INPUT_BUTTON_, $kw638$VALUE, value, ConsesLow.append( ( NIL != style ) ? ConsesLow.list( $kw373$STYLE, style ) : NIL, ( NIL != v_class ) ? ConsesLow
        .list( $kw365$CLASS, v_class ) : NIL, ConsesLow.list( $kw370$SCRIPT, reader.bq_cons( $sym350$PROGN, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 80889L)
  public static SubLObject html_script_radio(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list681 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list681 );
    name = current.first();
    current = current.rest();
    final SubLObject value = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list681 );
    current = current.rest();
    final SubLObject checkedP = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list681 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( new SubLObject[] { $sym679$HTML_FANCY_INPUT, $sym682$_HTML_INPUT_RADIO_, $kw440$NAME, name, $kw638$VALUE, value, $kw639$CHECKED, checkedP, $kw370$SCRIPT, reader.bq_cons( $sym350$PROGN,
          ConsesLow.append( body, NIL ) )
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list681 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 81118L)
  public static SubLObject html_script_submit(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list683 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list683 );
    value = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$18 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list683 );
      current_$18 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list683 );
      if( NIL == conses_high.member( current_$18, $list684, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$18 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list683 );
    }
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym679$HTML_FANCY_INPUT, $sym685$_HTML_INPUT_SUBMIT_, $kw638$VALUE, value, ConsesLow.append( ( NIL != style ) ? ConsesLow.list( $kw373$STYLE, style ) : NIL, ( NIL != id ) ? ConsesLow.list(
        $kw411$ID, id ) : NIL, ConsesLow.list( $kw370$SCRIPT, reader.bq_cons( $sym350$PROGN, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 81377L)
  public static SubLObject html_fancy_select(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list686 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list686 );
    name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$19 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list686 );
      current_$19 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list686 );
      if( NIL == conses_high.member( current_$19, $list687, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$19 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list686 );
    }
    final SubLObject multiple_tail = cdestructuring_bind.property_list_member( $kw688$MULTIPLE, current );
    final SubLObject multiple = ( NIL != multiple_tail ) ? conses_high.cadr( multiple_tail ) : NIL;
    final SubLObject size_tail = cdestructuring_bind.property_list_member( $kw511$SIZE, current );
    final SubLObject size = ( NIL != size_tail ) ? conses_high.cadr( size_tail ) : NIL;
    final SubLObject script_tail = cdestructuring_bind.property_list_member( $kw370$SCRIPT, current );
    final SubLObject script = ( NIL != script_tail ) ? conses_high.cadr( script_tail ) : NIL;
    final SubLObject onchange_tail = cdestructuring_bind.property_list_member( $kw647$ONCHANGE, current );
    final SubLObject onchange = ( NIL != onchange_tail ) ? conses_high.cadr( onchange_tail ) : NIL;
    final SubLObject disabledP_tail = cdestructuring_bind.property_list_member( $kw640$DISABLED_, current );
    final SubLObject disabledP = ( NIL != disabledP_tail ) ? conses_high.cadr( disabledP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    SubLObject static_disabledP = NIL;
    assert NIL != Types.atom( name ) : name;
    attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list689, ConsesLow.list( $sym351$HTML_MARKUP, name ) ), attributes );
    if( NIL != multiple )
    {
      assert NIL != Types.atom( multiple ) : multiple;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, multiple, $list690 ), attributes );
    }
    if( NIL != size )
    {
      assert NIL != Types.atom( size ) : size;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, size, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list691, ConsesLow.list( $sym351$HTML_MARKUP, size ) ) ), attributes );
    }
    if( NIL != script )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym350$PROGN, $list388, script.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, script ) : script ), attributes );
    }
    if( NIL != onchange )
    {
      assert NIL != Types.atom( onchange ) : onchange;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, onchange, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list669, ConsesLow.list( $sym351$HTML_MARKUP, onchange ) ) ), attributes );
    }
    if( NIL != disabledP )
    {
      assert NIL != Types.atom( disabledP ) : disabledP;
      static_disabledP = T;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, disabledP, $list660 ), attributes );
    }
    if( NIL == static_disabledP )
    {
      attributes = ConsesLow.cons( $list675, attributes );
    }
    attributes = Sequences.nreverse( attributes );
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list692, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 83817L)
  public static SubLObject html_fancy_option(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list693 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$20 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list693 );
      current_$20 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list693 );
      if( NIL == conses_high.member( current_$20, $list694, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$20 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list693 );
    }
    final SubLObject selected_tail = cdestructuring_bind.property_list_member( $kw695$SELECTED, current );
    final SubLObject selected = ( NIL != selected_tail ) ? conses_high.cadr( selected_tail ) : NIL;
    final SubLObject value_tail = cdestructuring_bind.property_list_member( $kw638$VALUE, current );
    final SubLObject value = ( NIL != value_tail ) ? conses_high.cadr( value_tail ) : NIL;
    final SubLObject onmouseover_tail = cdestructuring_bind.property_list_member( $kw696$ONMOUSEOVER, current );
    final SubLObject onmouseover = ( NIL != onmouseover_tail ) ? conses_high.cadr( onmouseover_tail ) : NIL;
    final SubLObject onmouseout_tail = cdestructuring_bind.property_list_member( $kw697$ONMOUSEOUT, current );
    final SubLObject onmouseout = ( NIL != onmouseout_tail ) ? conses_high.cadr( onmouseout_tail ) : NIL;
    final SubLObject script_tail = cdestructuring_bind.property_list_member( $kw370$SCRIPT, current );
    final SubLObject script = ( NIL != script_tail ) ? conses_high.cadr( script_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != selected )
    {
      assert NIL != Types.atom( selected ) : selected;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, selected, $list698 ), attributes );
    }
    if( NIL != value )
    {
      assert NIL != Types.atom( value ) : value;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, value, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list699, ConsesLow.list( $sym351$HTML_MARKUP, value ) ) ), attributes );
    }
    if( NIL != script )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym350$PROGN, $list388, script.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, script ) : script ), attributes );
    }
    if( NIL != onmouseout )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list700, onmouseout.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onmouseout ) : onmouseout ), attributes );
    }
    if( NIL != onmouseover )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list701, onmouseover.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onmouseover ) : onmouseover ), attributes );
    }
    attributes = Sequences.nreverse( attributes );
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list702, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 85034L)
  public static SubLObject html_optgroup(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list703 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$21 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list703 );
      current_$21 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list703 );
      if( NIL == conses_high.member( current_$21, $list704, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$21 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list703 );
    }
    final SubLObject label_tail = cdestructuring_bind.property_list_member( $kw705$LABEL, current );
    final SubLObject label = ( NIL != label_tail ) ? conses_high.cadr( label_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != label )
    {
      assert NIL != Types.atom( label ) : label;
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list706, label.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, label ) : label ), attributes );
    }
    attributes = Sequences.nreverse( attributes );
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list707, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 85490L)
  public static SubLObject html_fancy_textarea(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list708 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list708 );
    name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$22 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list708 );
      current_$22 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list708 );
      if( NIL == conses_high.member( current_$22, $list709, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$22 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list708 );
    }
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject cols_tail = cdestructuring_bind.property_list_member( $kw710$COLS, current );
    final SubLObject cols = ( NIL != cols_tail ) ? conses_high.cadr( cols_tail ) : NIL;
    final SubLObject rows_tail = cdestructuring_bind.property_list_member( $kw711$ROWS, current );
    final SubLObject rows = ( NIL != rows_tail ) ? conses_high.cadr( rows_tail ) : NIL;
    final SubLObject wrap_tail = cdestructuring_bind.property_list_member( $kw712$WRAP, current );
    final SubLObject wrap = ( NIL != wrap_tail ) ? conses_high.cadr( wrap_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    assert NIL != Types.atom( name ) : name;
    attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list713, ConsesLow.list( $sym351$HTML_MARKUP, name ) ), attributes );
    if( NIL != cols )
    {
      assert NIL != Types.atom( cols ) : cols;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, cols, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list714, ConsesLow.list( $sym351$HTML_MARKUP, cols ) ) ), attributes );
    }
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list715, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != rows )
    {
      assert NIL != Types.atom( rows ) : rows;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, rows, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list716, ConsesLow.list( $sym351$HTML_MARKUP, rows ) ) ), attributes );
    }
    if( NIL != wrap )
    {
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, wrap, $list717 ), attributes );
    }
    if( NIL != style )
    {
      assert NIL != Types.atom( style ) : style;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, style, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list718, ConsesLow.list( $sym351$HTML_MARKUP, style ) ) ), attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    attributes = Sequences.nreverse( attributes );
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list719, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 86948L)
  public static SubLObject html_table_caption(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list720 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject align = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list720 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list720 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.atom( align ) : align;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list721, ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list722, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list(
        $sym601$HTML_ALIGN, align ) ) ) ), reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 87354L)
  public static SubLObject html_fancy_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list723 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$23 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list723 );
      current_$23 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list723 );
      if( NIL == conses_high.member( current_$23, $list724, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$23 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list723 );
    }
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject noflow_tail = cdestructuring_bind.property_list_member( $kw725$NOFLOW, current );
    final SubLObject noflow = ( NIL != noflow_tail ) ? conses_high.cadr( noflow_tail ) : NIL;
    final SubLObject nowrap_tail = cdestructuring_bind.property_list_member( $kw726$NOWRAP, current );
    final SubLObject nowrap = ( NIL != nowrap_tail ) ? conses_high.cadr( nowrap_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject border_tail = cdestructuring_bind.property_list_member( $kw643$BORDER, current );
    final SubLObject border = ( NIL != border_tail ) ? conses_high.cadr( border_tail ) : NIL;
    final SubLObject bordercolor_tail = cdestructuring_bind.property_list_member( $kw727$BORDERCOLOR, current );
    final SubLObject bordercolor = ( NIL != bordercolor_tail ) ? conses_high.cadr( bordercolor_tail ) : NIL;
    final SubLObject cellpadding_tail = cdestructuring_bind.property_list_member( $kw728$CELLPADDING, current );
    final SubLObject cellpadding = ( NIL != cellpadding_tail ) ? conses_high.cadr( cellpadding_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject cellspacing_tail = cdestructuring_bind.property_list_member( $kw729$CELLSPACING, current );
    final SubLObject cellspacing = ( NIL != cellspacing_tail ) ? conses_high.cadr( cellspacing_tail ) : NIL;
    final SubLObject colspec_tail = cdestructuring_bind.property_list_member( $kw730$COLSPEC, current );
    final SubLObject colspec = ( NIL != colspec_tail ) ? conses_high.cadr( colspec_tail ) : NIL;
    final SubLObject units_tail = cdestructuring_bind.property_list_member( $kw731$UNITS, current );
    final SubLObject units = ( NIL != units_tail ) ? conses_high.cadr( units_tail ) : NIL;
    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member( $kw732$BGCOLOR, current );
    final SubLObject bgcolor = ( NIL != bgcolor_tail ) ? conses_high.cadr( bgcolor_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw595$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject background_tail = cdestructuring_bind.property_list_member( $kw733$BACKGROUND, current );
    final SubLObject background = ( NIL != background_tail ) ? conses_high.cadr( background_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != noflow )
    {
      assert NIL != Types.atom( noflow ) : noflow;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, noflow, $list734 ), attributes );
    }
    if( NIL != nowrap )
    {
      assert NIL != Types.atom( nowrap ) : nowrap;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, nowrap, $list735 ), attributes );
    }
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list736, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, align ) ) ) ),
          attributes );
    }
    if( NIL != border )
    {
      assert NIL != Types.atom( border ) : border;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, border, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list737, ConsesLow.list( $sym351$HTML_MARKUP, border ) ) ), attributes );
    }
    if( NIL != bordercolor )
    {
      assert NIL != Types.atom( bordercolor ) : bordercolor;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, bordercolor, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list738, ConsesLow.list( $sym351$HTML_MARKUP, bordercolor ) ) ), attributes );
    }
    if( NIL != cellpadding )
    {
      assert NIL != Types.atom( cellpadding ) : cellpadding;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, cellpadding, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list739, ConsesLow.list( $sym351$HTML_MARKUP, cellpadding ) ) ), attributes );
    }
    if( NIL != cellspacing )
    {
      assert NIL != Types.atom( cellspacing ) : cellspacing;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, cellspacing, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list740, ConsesLow.list( $sym351$HTML_MARKUP, cellspacing ) ) ), attributes );
    }
    if( NIL != colspec )
    {
      assert NIL != Types.atom( colspec ) : colspec;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, colspec, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list741, ConsesLow.list( $sym351$HTML_MARKUP, colspec ) ) ), attributes );
    }
    if( NIL != style )
    {
      assert NIL != Types.atom( style ) : style;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, style, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list742, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, style ) ) ) ),
          attributes );
    }
    if( NIL != units )
    {
      assert NIL != Types.atom( units ) : units;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, units, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list743, ConsesLow.list( $sym351$HTML_MARKUP, units ) ) ), attributes );
    }
    if( NIL != bgcolor )
    {
      assert NIL != Types.atom( bgcolor ) : bgcolor;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, bgcolor, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list744, ConsesLow.list( $sym351$HTML_MARKUP, bgcolor ) ) ), attributes );
    }
    if( NIL != width )
    {
      assert NIL != Types.atom( width ) : width;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, width, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list745, ConsesLow.list( $sym351$HTML_MARKUP, width ) ) ), attributes );
    }
    if( NIL != background )
    {
      assert NIL != Types.atom( width ) : width;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, background, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list746, ConsesLow.list( $sym351$HTML_MARKUP, background ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list747, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 90392L)
  public static SubLObject html_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list748 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject border = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list748 );
    border = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym749$HTML_FANCY_TABLE, ConsesLow.list( $kw643$BORDER, border ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list748 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 90497L)
  public static SubLObject html_fancy_table_data(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list750 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$24 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list750 );
      current_$24 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list750 );
      if( NIL == conses_high.member( current_$24, $list751, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$24 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list750 );
    }
    final SubLObject nowrap_tail = cdestructuring_bind.property_list_member( $kw726$NOWRAP, current );
    final SubLObject nowrap = ( NIL != nowrap_tail ) ? conses_high.cadr( nowrap_tail ) : NIL;
    final SubLObject colspan_tail = cdestructuring_bind.property_list_member( $kw752$COLSPAN, current );
    final SubLObject colspan = ( NIL != colspan_tail ) ? conses_high.cadr( colspan_tail ) : NIL;
    final SubLObject rowspan_tail = cdestructuring_bind.property_list_member( $kw753$ROWSPAN, current );
    final SubLObject rowspan = ( NIL != rowspan_tail ) ? conses_high.cadr( rowspan_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject valign_tail = cdestructuring_bind.property_list_member( $kw754$VALIGN, current );
    final SubLObject valign = ( NIL != valign_tail ) ? conses_high.cadr( valign_tail ) : NIL;
    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member( $kw732$BGCOLOR, current );
    final SubLObject bgcolor = ( NIL != bgcolor_tail ) ? conses_high.cadr( bgcolor_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw595$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw594$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject title_tail = cdestructuring_bind.property_list_member( $kw413$TITLE, current );
    final SubLObject title = ( NIL != title_tail ) ? conses_high.cadr( title_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != nowrap )
    {
      assert NIL != Types.atom( nowrap ) : nowrap;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, nowrap, $list755 ), attributes );
    }
    if( NIL != colspan )
    {
      assert NIL != Types.atom( colspan ) : colspan;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, colspan, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list756, ConsesLow.list( $sym351$HTML_MARKUP, colspan ) ) ), attributes );
    }
    if( NIL != rowspan )
    {
      assert NIL != Types.atom( rowspan ) : rowspan;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, rowspan, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list757, ConsesLow.list( $sym351$HTML_MARKUP, rowspan ) ) ), attributes );
    }
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list758, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, align ) ) ) ),
          attributes );
    }
    if( NIL != valign )
    {
      assert NIL != Types.atom( valign ) : valign;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, valign, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list759, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, valign ) ) ) ),
          attributes );
    }
    if( NIL != bgcolor )
    {
      assert NIL != Types.atom( bgcolor ) : bgcolor;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, bgcolor, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list760, ConsesLow.list( $sym351$HTML_MARKUP, bgcolor ) ) ), attributes );
    }
    if( NIL != width )
    {
      assert NIL != Types.atom( width ) : width;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, width, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list761, ConsesLow.list( $sym351$HTML_MARKUP, width ) ) ), attributes );
    }
    if( NIL != height )
    {
      assert NIL != Types.atom( height ) : height;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, height, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list762, ConsesLow.list( $sym351$HTML_MARKUP, height ) ) ), attributes );
    }
    if( NIL != style )
    {
      assert NIL != Types.atom( style ) : style;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, style, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list742, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, style ) ) ) ),
          attributes );
    }
    if( NIL != title )
    {
      assert NIL != Types.atom( title ) : title;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, title, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list432, ConsesLow.list( $sym351$HTML_MARKUP, title ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list763, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 92986L)
  public static SubLObject html_table_data(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym764$HTML_FANCY_TABLE_DATA, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 93077L)
  public static SubLObject html_fancy_table_header(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list765 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$25 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list765 );
      current_$25 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list765 );
      if( NIL == conses_high.member( current_$25, $list766, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$25 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list765 );
    }
    final SubLObject nowrap_tail = cdestructuring_bind.property_list_member( $kw726$NOWRAP, current );
    final SubLObject nowrap = ( NIL != nowrap_tail ) ? conses_high.cadr( nowrap_tail ) : NIL;
    final SubLObject colspan_tail = cdestructuring_bind.property_list_member( $kw752$COLSPAN, current );
    final SubLObject colspan = ( NIL != colspan_tail ) ? conses_high.cadr( colspan_tail ) : NIL;
    final SubLObject rowspan_tail = cdestructuring_bind.property_list_member( $kw753$ROWSPAN, current );
    final SubLObject rowspan = ( NIL != rowspan_tail ) ? conses_high.cadr( rowspan_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject valign_tail = cdestructuring_bind.property_list_member( $kw754$VALIGN, current );
    final SubLObject valign = ( NIL != valign_tail ) ? conses_high.cadr( valign_tail ) : NIL;
    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member( $kw732$BGCOLOR, current );
    final SubLObject bgcolor = ( NIL != bgcolor_tail ) ? conses_high.cadr( bgcolor_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw595$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw594$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject title_tail = cdestructuring_bind.property_list_member( $kw413$TITLE, current );
    final SubLObject title = ( NIL != title_tail ) ? conses_high.cadr( title_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != nowrap )
    {
      assert NIL != Types.atom( nowrap ) : nowrap;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, nowrap, $list755 ), attributes );
    }
    if( NIL != colspan )
    {
      assert NIL != Types.atom( colspan ) : colspan;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, colspan, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list756, ConsesLow.list( $sym351$HTML_MARKUP, colspan ) ) ), attributes );
    }
    if( NIL != rowspan )
    {
      assert NIL != Types.atom( rowspan ) : rowspan;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, rowspan, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list757, ConsesLow.list( $sym351$HTML_MARKUP, rowspan ) ) ), attributes );
    }
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list758, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, align ) ) ) ),
          attributes );
    }
    if( NIL != valign )
    {
      assert NIL != Types.atom( valign ) : valign;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, valign, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list759, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, valign ) ) ) ),
          attributes );
    }
    if( NIL != bgcolor )
    {
      assert NIL != Types.atom( bgcolor ) : bgcolor;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, bgcolor, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list760, ConsesLow.list( $sym351$HTML_MARKUP, bgcolor ) ) ), attributes );
    }
    if( NIL != width )
    {
      assert NIL != Types.atom( width ) : width;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, width, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list761, ConsesLow.list( $sym351$HTML_MARKUP, width ) ) ), attributes );
    }
    if( NIL != height )
    {
      assert NIL != Types.atom( height ) : height;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, height, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list762, ConsesLow.list( $sym351$HTML_MARKUP, height ) ) ), attributes );
    }
    if( NIL != title )
    {
      assert NIL != Types.atom( title ) : title;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, title, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list767, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, title ) ) ) ),
          attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != style )
    {
      assert NIL != Types.atom( style ) : style;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, style, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list742, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, style ) ) ) ),
          attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list768, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 95410L)
  public static SubLObject html_table_heading(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym769$HTML_FANCY_TABLE_HEADER, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 95507L)
  public static SubLObject html_table_header_block(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list770, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 95697L)
  public static SubLObject html_table_footer_block(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list771, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 95863L)
  public static SubLObject html_table_body_block(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list772, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 96027L)
  public static SubLObject html_fancy_table_row(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list773 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$26 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list773 );
      current_$26 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list773 );
      if( NIL == conses_high.member( current_$26, $list774, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$26 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list773 );
    }
    final SubLObject title_tail = cdestructuring_bind.property_list_member( $kw413$TITLE, current );
    final SubLObject title = ( NIL != title_tail ) ? conses_high.cadr( title_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject valign_tail = cdestructuring_bind.property_list_member( $kw754$VALIGN, current );
    final SubLObject valign = ( NIL != valign_tail ) ? conses_high.cadr( valign_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw594$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject bgcolor_tail = cdestructuring_bind.property_list_member( $kw732$BGCOLOR, current );
    final SubLObject bgcolor = ( NIL != bgcolor_tail ) ? conses_high.cadr( bgcolor_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list758, ConsesLow.list( $sym351$HTML_MARKUP, align ) ) ), attributes );
    }
    if( NIL != title )
    {
      assert NIL != Types.atom( title ) : title;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, title, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list767, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, title ) ) ) ),
          attributes );
    }
    if( NIL != name )
    {
      assert NIL != Types.atom( name ) : name;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, name, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list775, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, name ) ) ) ),
          attributes );
    }
    if( NIL != style )
    {
      assert NIL != Types.atom( style ) : style;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, style, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list742, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, style ) ) ) ),
          attributes );
    }
    if( NIL != valign )
    {
      assert NIL != Types.atom( valign ) : valign;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, valign, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list759, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, valign ) ) ) ),
          attributes );
    }
    if( NIL != height )
    {
      assert NIL != Types.atom( height ) : height;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, height, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list776, ConsesLow.list( $sym351$HTML_MARKUP, height ) ) ), attributes );
    }
    if( NIL != bgcolor )
    {
      assert NIL != Types.atom( bgcolor ) : bgcolor;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, bgcolor, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list777, ConsesLow.list( $sym351$HTML_MARKUP, bgcolor ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    return ConsesLow.listS( $sym350$PROGN, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list778, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body,
        NIL ) ) ) ) ), $list395 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 98042L)
  public static SubLObject html_table_row(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym779$HTML_FANCY_TABLE_ROW, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 98313L)
  public static SubLObject html_indent_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list780 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject indent_width = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list780 );
    indent_width = current.first();
    current = current.rest();
    final SubLObject max_indent = current.isCons() ? current.first() : TWENTY_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list780 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym749$HTML_FANCY_TABLE, $list781, ConsesLow.listS( $sym357$CLET, ConsesLow.list( ConsesLow.list( $sym782$_HTML_INDENT_TABLE_MAX_, max_indent ) ), ConsesLow.append( body, ConsesLow.list(
          ConsesLow.list( $sym783$HTML_INDENT_TABLE_INTERNAL, indent_width ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list780 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 98805L)
  public static SubLObject html_indent_row(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list784 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject indent_amount = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list784 );
    indent_amount = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject indent = $sym785$INDENT;
      final SubLObject span = $sym786$SPAN;
      return ConsesLow.list( $sym357$CLET, ConsesLow.list( ConsesLow.list( indent, indent_amount ), ConsesLow.list( span, ConsesLow.list( $sym787$MAX, ONE_INTEGER, ConsesLow.list( $sym788$_,
          $sym782$_HTML_INDENT_TABLE_MAX_, indent ) ) ) ), ConsesLow.list( $sym789$HTML_TABLE_ROW, ConsesLow.list( $sym790$HTML_INDENT_ROW_INTERNAL, indent ), ConsesLow.listS( $sym764$HTML_FANCY_TABLE_DATA, ConsesLow
              .list( $kw752$COLSPAN, span ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list784 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 99170L)
  public static SubLObject html_indented_line(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list791 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject indent_amount = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list791 );
    indent_amount = current.first();
    current = current.rest();
    final SubLObject newlineP = current.isCons() ? current.first() : T;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list791 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym350$PROGN, ConsesLow.listS( $sym379$PWHEN, newlineP, $list792 ), ConsesLow.listS( $sym793$HTML_NO_BREAK, ConsesLow.list( $sym794$HTML_INDENT, indent_amount ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list791 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 99521L)
  public static SubLObject html_indented_line_inverse(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list791 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject indent_amount = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list791 );
    indent_amount = current.first();
    current = current.rest();
    final SubLObject newlineP = current.isCons() ? current.first() : T;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list791 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym350$PROGN, ConsesLow.listS( $sym793$HTML_NO_BREAK, ConsesLow.list( $sym794$HTML_INDENT, indent_amount ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym379$PWHEN, newlineP,
          $list792 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list791 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 99881L)
  public static SubLObject cdolist_with_alternating_bgcolor(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list795 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject listform = NIL;
    SubLObject bgcolor_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list795 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list795 );
    listform = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list795 );
    bgcolor_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$27 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list795 );
      current_$27 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list795 );
      if( NIL == conses_high.member( current_$27, $list796, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$27 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list795 );
    }
    final SubLObject color1_tail = cdestructuring_bind.property_list_member( $kw797$COLOR1, current );
    final SubLObject color1 = ( NIL != color1_tail ) ? conses_high.cadr( color1_tail ) : $html_color_light_grey$.getGlobalValue();
    final SubLObject color2_tail = cdestructuring_bind.property_list_member( $kw798$COLOR2, current );
    final SubLObject color2 = ( NIL != color2_tail ) ? conses_high.cadr( color2_tail ) : $html_color_lighter_grey$.getGlobalValue();
    final SubLObject counter_tail = cdestructuring_bind.property_list_member( $kw799$COUNTER, current );
    final SubLObject counter = ( NIL != counter_tail ) ? conses_high.cadr( counter_tail ) : $sym800$IGNORE_ME;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !bgcolor_var.isSymbol() )
    {
      Errors.error( $str801$Malformed_cdolist_with_alternatin, bgcolor_var );
    }
    final SubLObject color_toggle = $sym802$COLOR_TOGGLE;
    return ConsesLow.list( $sym357$CLET, ConsesLow.list( reader.bq_cons( color_toggle, $list803 ) ), ConsesLow.listS( $sym804$CDOLIST_NUMBERED, ConsesLow.list( var, counter, listform ), ConsesLow.list( $sym612$PIF,
        color_toggle, ConsesLow.listS( $sym805$CSETQ, color_toggle, $list803 ), ConsesLow.listS( $sym805$CSETQ, color_toggle, $list806 ) ), ConsesLow.list( $sym805$CSETQ, bgcolor_var, ConsesLow.list( $sym807$FIF,
            color_toggle, color2, color1 ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 101021L)
  public static SubLObject cdolist_with_cyc_logo_colors(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list808 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject listform = NIL;
    SubLObject bgcolor_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list808 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list808 );
    listform = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list808 );
    bgcolor_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$28 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list808 );
      current_$28 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list808 );
      if( NIL == conses_high.member( current_$28, $list809, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$28 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list808 );
    }
    final SubLObject counter_tail = cdestructuring_bind.property_list_member( $kw799$COUNTER, current );
    final SubLObject counter = ( NIL != counter_tail ) ? conses_high.cadr( counter_tail ) : $sym800$IGNORE_ME;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym810$CDOLIST_WITH_ALTERNATING_BGCOLOR, ConsesLow.list( new SubLObject[] { var, listform, bgcolor_var, $kw797$COLOR1, $sym811$_HTML_COLOR_CYC_LOGO_LIGHT_VIOLET_, $kw798$COLOR2,
      $sym812$_HTML_COLOR_CYC_LOGO_LIGHTER_VIOLET_, $kw799$COUNTER, counter
    } ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 101532L)
  public static SubLObject cdolist_with_cyc_background_colors(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list808 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject listform = NIL;
    SubLObject bgcolor_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list808 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list808 );
    listform = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list808 );
    bgcolor_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$29 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list808 );
      current_$29 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list808 );
      if( NIL == conses_high.member( current_$29, $list809, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$29 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list808 );
    }
    final SubLObject counter_tail = cdestructuring_bind.property_list_member( $kw799$COUNTER, current );
    final SubLObject counter = ( NIL != counter_tail ) ? conses_high.cadr( counter_tail ) : $sym800$IGNORE_ME;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym810$CDOLIST_WITH_ALTERNATING_BGCOLOR, ConsesLow.list( new SubLObject[] { var, listform, bgcolor_var, $kw797$COLOR1, $sym813$_HTML_COLOR_CYC_LOGO_LIGHT_BLUE_, $kw798$COLOR2,
      $sym814$_HTML_COLOR_CYC_LOGO_LIGHTER_BLUE_, $kw799$COUNTER, counter
    } ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 102054L)
  public static SubLObject cdolist_with_alternating_variable(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list815 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject listform = NIL;
    SubLObject alternator_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list815 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list815 );
    listform = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list815 );
    alternator_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$30 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list815 );
      current_$30 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list815 );
      if( NIL == conses_high.member( current_$30, $list816, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$30 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list815 );
    }
    final SubLObject alternative1_tail = cdestructuring_bind.property_list_member( $kw817$ALTERNATIVE1, current );
    final SubLObject alternative1 = ( NIL != alternative1_tail ) ? conses_high.cadr( alternative1_tail ) : $html_alternating_class1$.getDynamicValue( thread );
    final SubLObject alternative2_tail = cdestructuring_bind.property_list_member( $kw818$ALTERNATIVE2, current );
    final SubLObject alternative2 = ( NIL != alternative2_tail ) ? conses_high.cadr( alternative2_tail ) : $html_alternating_class2$.getDynamicValue( thread );
    final SubLObject counter_tail = cdestructuring_bind.property_list_member( $kw799$COUNTER, current );
    final SubLObject counter = ( NIL != counter_tail ) ? conses_high.cadr( counter_tail ) : $sym800$IGNORE_ME;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !alternator_var.isSymbol() )
    {
      Errors.error( $str819$Malformed_cdolist_with_alternatin, alternator_var );
    }
    final SubLObject alternator_toggle = $sym820$ALTERNATOR_TOGGLE;
    return ConsesLow.list( $sym357$CLET, ConsesLow.list( reader.bq_cons( alternator_toggle, $list803 ) ), ConsesLow.listS( $sym804$CDOLIST_NUMBERED, ConsesLow.list( var, counter, listform ), ConsesLow.list( $sym612$PIF,
        alternator_toggle, ConsesLow.listS( $sym805$CSETQ, alternator_toggle, $list803 ), ConsesLow.listS( $sym805$CSETQ, alternator_toggle, $list806 ) ), ConsesLow.list( $sym805$CSETQ, alternator_var, ConsesLow.list(
            $sym807$FIF, alternator_toggle, alternative2, alternative1 ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 102950L)
  public static SubLObject cdolist_with_alternating_classes(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list821 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject listform = NIL;
    SubLObject class_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list821 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list821 );
    listform = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list821 );
    class_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$31 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list821 );
      current_$31 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list821 );
      if( NIL == conses_high.member( current_$31, $list822, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$31 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list821 );
    }
    final SubLObject counter_tail = cdestructuring_bind.property_list_member( $kw799$COUNTER, current );
    final SubLObject counter = ( NIL != counter_tail ) ? conses_high.cadr( counter_tail ) : $sym800$IGNORE_ME;
    final SubLObject class1_tail = cdestructuring_bind.property_list_member( $kw823$CLASS1, current );
    final SubLObject class1 = ( NIL != class1_tail ) ? conses_high.cadr( class1_tail ) : $html_alternating_class1$.getDynamicValue( thread );
    final SubLObject class2_tail = cdestructuring_bind.property_list_member( $kw824$CLASS2, current );
    final SubLObject class2 = ( NIL != class2_tail ) ? conses_high.cadr( class2_tail ) : $html_alternating_class2$.getDynamicValue( thread );
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym825$CDOLIST_WITH_ALTERNATING_VARIABLE, ConsesLow.list( new SubLObject[] { var, listform, class_var, $kw817$ALTERNATIVE1, class1, $kw818$ALTERNATIVE2, class2, $kw799$COUNTER, counter
    } ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 103496L)
  public static SubLObject switch_cyc_logo_color(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list826 );
    var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym805$CSETQ, var, ConsesLow.listS( $sym807$FIF, ConsesLow.listS( EQUAL, var, $list827 ), $list828 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list826 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 103705L)
  public static SubLObject html_fancy_anchor(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list829 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$32 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list829 );
      current_$32 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list829 );
      if( NIL == conses_high.member( current_$32, $list830, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$32 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list829 );
    }
    final SubLObject href_tail = cdestructuring_bind.property_list_member( $kw456$HREF, current );
    final SubLObject href = ( NIL != href_tail ) ? conses_high.cadr( href_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject title_tail = cdestructuring_bind.property_list_member( $kw413$TITLE, current );
    final SubLObject title = ( NIL != title_tail ) ? conses_high.cadr( title_tail ) : NIL;
    final SubLObject target_tail = cdestructuring_bind.property_list_member( $kw831$TARGET, current );
    final SubLObject target = ( NIL != target_tail ) ? conses_high.cadr( target_tail ) : NIL;
    final SubLObject script_tail = cdestructuring_bind.property_list_member( $kw370$SCRIPT, current );
    final SubLObject script = ( NIL != script_tail ) ? conses_high.cadr( script_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject onmouseover_tail = cdestructuring_bind.property_list_member( $kw696$ONMOUSEOVER, current );
    final SubLObject onmouseover = ( NIL != onmouseover_tail ) ? conses_high.cadr( onmouseover_tail ) : NIL;
    final SubLObject onmouseout_tail = cdestructuring_bind.property_list_member( $kw697$ONMOUSEOUT, current );
    final SubLObject onmouseout = ( NIL != onmouseout_tail ) ? conses_high.cadr( onmouseout_tail ) : NIL;
    final SubLObject onmousedown_tail = cdestructuring_bind.property_list_member( $kw832$ONMOUSEDOWN, current );
    final SubLObject onmousedown = ( NIL != onmousedown_tail ) ? conses_high.cadr( onmousedown_tail ) : NIL;
    final SubLObject onmouseup_tail = cdestructuring_bind.property_list_member( $kw833$ONMOUSEUP, current );
    final SubLObject onmouseup = ( NIL != onmouseup_tail ) ? conses_high.cadr( onmouseup_tail ) : NIL;
    final SubLObject onclick_tail = cdestructuring_bind.property_list_member( $kw430$ONCLICK, current );
    final SubLObject onclick = ( NIL != onclick_tail ) ? conses_high.cadr( onclick_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject attrs_tail = cdestructuring_bind.property_list_member( $kw834$ATTRS, current );
    final SubLObject attrs = ( NIL != attrs_tail ) ? conses_high.cadr( attrs_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != href )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list835, href.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, href ) : href ), attributes );
    }
    if( NIL != name )
    {
      assert NIL != Types.atom( name ) : name;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, name, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list836, ConsesLow.list( $sym351$HTML_MARKUP, name ) ) ), attributes );
    }
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list837, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != title )
    {
      assert NIL != Types.atom( title ) : title;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, title, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list838, ConsesLow.list( $sym351$HTML_MARKUP, title ) ) ), attributes );
    }
    if( NIL != target )
    {
      assert NIL != Types.atom( target ) : target;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, target, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list839, ConsesLow.list( $sym351$HTML_MARKUP, target ) ) ), attributes );
    }
    if( NIL != style )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list840, style.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, style ) : style ), attributes );
    }
    if( NIL != onmouseover )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list701, onmouseover.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onmouseover ) : onmouseover ), attributes );
    }
    if( NIL != onmouseup )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list841, onmouseup.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onmouseup ) : onmouseup ), attributes );
    }
    if( NIL != onmousedown )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list842, onmousedown.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onmousedown ) : onmousedown ), attributes );
    }
    if( NIL != onmouseout )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list700, onmouseout.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onmouseout ) : onmouseout ), attributes );
    }
    if( NIL != onclick )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list431, onclick.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, onclick ) : onclick ), attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != script )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym350$PROGN, $list388, script.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, script ) : script ), attributes );
    }
    if( NIL != attrs )
    {
      SubLObject cdolist_list_var = attrs;
      SubLObject attr = NIL;
      attr = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject attr_name = attr.first();
        final SubLObject attr_value = conses_high.second( attr );
        attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, ConsesLow.list( Sequences.cconcatenate( $str843$_, new SubLObject[] { format_nil.format_nil_a_no_copy( attr_name ), $str844$_
        } ) ), ConsesLow.list( $sym351$HTML_MARKUP, attr_value ) ), attributes );
        cdolist_list_var = cdolist_list_var.rest();
        attr = cdolist_list_var.first();
      }
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list845, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 106795L)
  public static SubLObject html_script_anchor(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list846 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject linktext = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list846 );
    linktext = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$33 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list846 );
      current_$33 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list846 );
      if( NIL == conses_high.member( current_$33, $list847, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$33 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list846 );
    }
    final SubLObject href_tail = cdestructuring_bind.property_list_member( $kw456$HREF, current );
    final SubLObject href = ( NIL != href_tail ) ? conses_high.cadr( href_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject target_tail = cdestructuring_bind.property_list_member( $kw831$TARGET, current );
    final SubLObject target = ( NIL != target_tail ) ? conses_high.cadr( target_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym848$HTML_FANCY_ANCHOR, ConsesLow.list( new SubLObject[] { $kw456$HREF, href, $kw440$NAME, name, $kw831$TARGET, target, $kw373$STYLE, style, $kw365$CLASS, v_class, $kw370$SCRIPT, reader
        .bq_cons( $sym350$PROGN, ConsesLow.append( body, NIL ) )
    } ), linktext.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, linktext ) : linktext );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 107093L)
  public static SubLObject html_target_reference(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list849 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list849 );
    name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym848$HTML_FANCY_ANCHOR, ConsesLow.list( $kw456$HREF, ConsesLow.list( $sym350$PROGN, $list850, ConsesLow.list( $sym351$HTML_MARKUP, name ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list849 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 107416L)
  public static SubLObject html_mailto_anchor(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list851 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject address = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list851 );
    address = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym848$HTML_FANCY_ANCHOR, ConsesLow.list( $kw456$HREF, ConsesLow.list( $sym852$HTML_MAILTO_URL, address ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list851 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 107646L)
  public static SubLObject html_file_anchor(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list853 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list853 );
    filename = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym848$HTML_FANCY_ANCHOR, ConsesLow.list( $kw456$HREF, ConsesLow.list( $sym854$HTML_FILE_URL, filename ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list853 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 107873L)
  public static SubLObject html_fancy_area(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$34 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list855 );
      current_$34 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list855 );
      if( NIL == conses_high.member( current_$34, $list856, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$34 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list855 );
    }
    final SubLObject nohref_tail = cdestructuring_bind.property_list_member( $kw857$NOHREF, current );
    final SubLObject nohref = ( NIL != nohref_tail ) ? conses_high.cadr( nohref_tail ) : NIL;
    final SubLObject href_tail = cdestructuring_bind.property_list_member( $kw456$HREF, current );
    final SubLObject href = ( NIL != href_tail ) ? conses_high.cadr( href_tail ) : NIL;
    final SubLObject alt_tail = cdestructuring_bind.property_list_member( $kw593$ALT, current );
    final SubLObject alt = ( NIL != alt_tail ) ? conses_high.cadr( alt_tail ) : NIL;
    final SubLObject target_tail = cdestructuring_bind.property_list_member( $kw831$TARGET, current );
    final SubLObject target = ( NIL != target_tail ) ? conses_high.cadr( target_tail ) : NIL;
    final SubLObject shape_tail = cdestructuring_bind.property_list_member( $kw858$SHAPE, current );
    final SubLObject shape = ( NIL != shape_tail ) ? conses_high.cadr( shape_tail ) : NIL;
    final SubLObject co_ords_tail = cdestructuring_bind.property_list_member( $kw859$CO_ORDS, current );
    final SubLObject co_ords = ( NIL != co_ords_tail ) ? conses_high.cadr( co_ords_tail ) : NIL;
    SubLObject attributes = NIL;
    if( NIL != nohref )
    {
      assert NIL != Types.atom( nohref ) : nohref;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, nohref, $list860 ), attributes );
    }
    if( NIL != href )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list861, href.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, href ) : href ), attributes );
    }
    if( NIL != alt )
    {
      assert NIL != Types.atom( alt ) : alt;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, alt, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list862, ConsesLow.list( $sym351$HTML_MARKUP, alt ) ) ), attributes );
    }
    if( NIL != target )
    {
      assert NIL != Types.atom( target ) : target;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, target, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list863, ConsesLow.list( $sym351$HTML_MARKUP, target ) ) ), attributes );
    }
    if( NIL != shape )
    {
      assert NIL != Types.atom( shape ) : shape;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, shape, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list864, ConsesLow.list( $sym351$HTML_MARKUP, shape ) ) ), attributes );
    }
    if( NIL != co_ords )
    {
      assert NIL != Types.atom( co_ords ) : co_ords;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, co_ords, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list865, ConsesLow.list( $sym351$HTML_MARKUP, co_ords ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list866, ConsesLow.append( attributes, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 109094L)
  public static SubLObject html_blink(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list867, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 109430L)
  public static SubLObject html_comment(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list868, ConsesLow.listS( $sym357$CLET, $list358, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 109784L)
  public static SubLObject html_fancy_frame(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list869 );
    name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$35 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list869 );
      current_$35 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list869 );
      if( NIL == conses_high.member( current_$35, $list870, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$35 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list869 );
    }
    final SubLObject frameborder_tail = cdestructuring_bind.property_list_member( $kw871$FRAMEBORDER, current );
    final SubLObject frameborder = ( NIL != frameborder_tail ) ? conses_high.cadr( frameborder_tail ) : NIL;
    final SubLObject noresize_tail = cdestructuring_bind.property_list_member( $kw872$NORESIZE, current );
    final SubLObject noresize = ( NIL != noresize_tail ) ? conses_high.cadr( noresize_tail ) : NIL;
    final SubLObject src_tail = cdestructuring_bind.property_list_member( $kw566$SRC, current );
    final SubLObject src = ( NIL != src_tail ) ? conses_high.cadr( src_tail ) : NIL;
    final SubLObject scrolling_tail = cdestructuring_bind.property_list_member( $kw873$SCROLLING, current );
    final SubLObject scrolling = ( NIL != scrolling_tail ) ? conses_high.cadr( scrolling_tail ) : NIL;
    final SubLObject marginheight_tail = cdestructuring_bind.property_list_member( $kw874$MARGINHEIGHT, current );
    final SubLObject marginheight = ( NIL != marginheight_tail ) ? conses_high.cadr( marginheight_tail ) : NIL;
    final SubLObject marginwidth_tail = cdestructuring_bind.property_list_member( $kw875$MARGINWIDTH, current );
    final SubLObject marginwidth = ( NIL != marginwidth_tail ) ? conses_high.cadr( marginwidth_tail ) : NIL;
    SubLObject attributes = NIL;
    assert NIL != Types.atom( name ) : name;
    attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list876, ConsesLow.list( $sym351$HTML_MARKUP, name ) ), attributes );
    if( NIL != frameborder )
    {
      assert NIL != Types.atom( frameborder ) : frameborder;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, frameborder, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list877, ConsesLow.list( $sym351$HTML_MARKUP, frameborder ) ) ), attributes );
    }
    if( NIL != noresize )
    {
      assert NIL != Types.atom( noresize ) : noresize;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, noresize, $list878 ), attributes );
    }
    if( NIL != src )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list879, src.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, src ) : src ), attributes );
    }
    if( NIL != scrolling )
    {
      assert NIL != Types.atom( scrolling ) : scrolling;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, scrolling, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list880, ConsesLow.list( $sym351$HTML_MARKUP, scrolling ) ) ), attributes );
    }
    if( NIL != marginheight )
    {
      assert NIL != Types.atom( marginheight ) : marginheight;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, marginheight, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list881, ConsesLow.list( $sym351$HTML_MARKUP, marginheight ) ) ), attributes );
    }
    if( NIL != marginwidth )
    {
      assert NIL != Types.atom( marginwidth ) : marginwidth;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, marginwidth, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list882, ConsesLow.list( $sym351$HTML_MARKUP, marginwidth ) ) ), attributes );
    }
    attributes = Sequences.nreverse( attributes );
    return ConsesLow.list( $sym350$PROGN, $list393, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list883, ConsesLow.append( attributes, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 111336L)
  public static SubLObject html_frame(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list869 );
    name = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$36 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list869 );
      current_$36 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list869 );
      if( NIL == conses_high.member( current_$36, $list870, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$36 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list869 );
    }
    final SubLObject frameborder_tail = cdestructuring_bind.property_list_member( $kw871$FRAMEBORDER, current );
    final SubLObject frameborder = ( NIL != frameborder_tail ) ? conses_high.cadr( frameborder_tail ) : NIL;
    final SubLObject noresize_tail = cdestructuring_bind.property_list_member( $kw872$NORESIZE, current );
    final SubLObject noresize = ( NIL != noresize_tail ) ? conses_high.cadr( noresize_tail ) : NIL;
    final SubLObject src_tail = cdestructuring_bind.property_list_member( $kw566$SRC, current );
    final SubLObject src = ( NIL != src_tail ) ? conses_high.cadr( src_tail ) : NIL;
    final SubLObject scrolling_tail = cdestructuring_bind.property_list_member( $kw873$SCROLLING, current );
    final SubLObject scrolling = ( NIL != scrolling_tail ) ? conses_high.cadr( scrolling_tail ) : NIL;
    final SubLObject marginheight_tail = cdestructuring_bind.property_list_member( $kw874$MARGINHEIGHT, current );
    final SubLObject marginheight = ( NIL != marginheight_tail ) ? conses_high.cadr( marginheight_tail ) : NIL;
    final SubLObject marginwidth_tail = cdestructuring_bind.property_list_member( $kw875$MARGINWIDTH, current );
    final SubLObject marginwidth = ( NIL != marginwidth_tail ) ? conses_high.cadr( marginwidth_tail ) : NIL;
    return ConsesLow.list( new SubLObject[] { $sym884$HTML_FANCY_FRAME, name, $kw871$FRAMEBORDER, frameborder, $kw872$NORESIZE, noresize, $kw566$SRC, src, $kw873$SCROLLING, scrolling, $kw874$MARGINHEIGHT, marginheight,
      $kw875$MARGINWIDTH, marginwidth
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 111610L)
  public static SubLObject html_fancy_frameset(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list885 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$37 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list885 );
      current_$37 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list885 );
      if( NIL == conses_high.member( current_$37, $list886, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$37 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list885 );
    }
    final SubLObject cols_tail = cdestructuring_bind.property_list_member( $kw710$COLS, current );
    final SubLObject cols = ( NIL != cols_tail ) ? conses_high.cadr( cols_tail ) : NIL;
    final SubLObject rows_tail = cdestructuring_bind.property_list_member( $kw711$ROWS, current );
    final SubLObject rows = ( NIL != rows_tail ) ? conses_high.cadr( rows_tail ) : NIL;
    final SubLObject frameborder_tail = cdestructuring_bind.property_list_member( $kw871$FRAMEBORDER, current );
    final SubLObject frameborder = ( NIL != frameborder_tail ) ? conses_high.cadr( frameborder_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != cols )
    {
      assert NIL != Types.atom( cols ) : cols;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, cols, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list887, ConsesLow.list( $sym351$HTML_MARKUP, cols ) ) ), attributes );
    }
    if( NIL != rows )
    {
      assert NIL != Types.atom( rows ) : rows;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, rows, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list888, ConsesLow.list( $sym351$HTML_MARKUP, rows ) ) ), attributes );
    }
    if( NIL != frameborder )
    {
      assert NIL != Types.atom( frameborder ) : frameborder;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, frameborder, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list889, ConsesLow.list( $sym351$HTML_MARKUP, frameborder ) ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.listS( $sym350$PROGN, $list890, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list891, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body,
        NIL ) ) ) ) ), $list395 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 112613L)
  public static SubLObject html_frameset(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list885 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$38 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list885 );
      current_$38 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list885 );
      if( NIL == conses_high.member( current_$38, $list886, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$38 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list885 );
    }
    final SubLObject cols_tail = cdestructuring_bind.property_list_member( $kw710$COLS, current );
    final SubLObject cols = ( NIL != cols_tail ) ? conses_high.cadr( cols_tail ) : NIL;
    final SubLObject rows_tail = cdestructuring_bind.property_list_member( $kw711$ROWS, current );
    final SubLObject rows = ( NIL != rows_tail ) ? conses_high.cadr( rows_tail ) : NIL;
    final SubLObject frameborder_tail = cdestructuring_bind.property_list_member( $kw871$FRAMEBORDER, current );
    final SubLObject frameborder = ( NIL != frameborder_tail ) ? conses_high.cadr( frameborder_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym892$HTML_FANCY_FRAMESET, ConsesLow.list( $kw710$COLS, cols, $kw711$ROWS, rows, $kw871$FRAMEBORDER, frameborder ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 112778L)
  public static SubLObject html_fancy_iframe(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list893 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$39 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list893 );
      current_$39 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list893 );
      if( NIL == conses_high.member( current_$39, $list894, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$39 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list893 );
    }
    final SubLObject src_tail = cdestructuring_bind.property_list_member( $kw566$SRC, current );
    final SubLObject src = ( NIL != src_tail ) ? conses_high.cadr( src_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw595$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw594$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject frameborder_tail = cdestructuring_bind.property_list_member( $kw871$FRAMEBORDER, current );
    final SubLObject frameborder = ( NIL != frameborder_tail ) ? conses_high.cadr( frameborder_tail ) : NIL;
    final SubLObject marginwidth_tail = cdestructuring_bind.property_list_member( $kw875$MARGINWIDTH, current );
    final SubLObject marginwidth = ( NIL != marginwidth_tail ) ? conses_high.cadr( marginwidth_tail ) : NIL;
    final SubLObject marginheight_tail = cdestructuring_bind.property_list_member( $kw874$MARGINHEIGHT, current );
    final SubLObject marginheight = ( NIL != marginheight_tail ) ? conses_high.cadr( marginheight_tail ) : NIL;
    final SubLObject scrolling_tail = cdestructuring_bind.property_list_member( $kw873$SCROLLING, current );
    final SubLObject scrolling = ( NIL != scrolling_tail ) ? conses_high.cadr( scrolling_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != src )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list895, src.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, src ) : src ), attributes );
    }
    if( NIL != name )
    {
      assert NIL != Types.atom( name ) : name;
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list896, ConsesLow.list( $sym351$HTML_MARKUP, name ) ), attributes );
    }
    if( NIL != width )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list897, width.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, width ) : src ), attributes );
    }
    if( NIL != height )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list898, height.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, height ) : src ), attributes );
    }
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list899, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, align ) ) ) ),
          attributes );
    }
    if( NIL != frameborder )
    {
      assert NIL != Types.atom( frameborder ) : frameborder;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, frameborder, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list900, ConsesLow.list( $sym351$HTML_MARKUP, frameborder ) ) ), attributes );
    }
    if( NIL != marginwidth )
    {
      assert NIL != Types.atom( marginwidth ) : marginwidth;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, marginwidth, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list901, ConsesLow.list( $sym351$HTML_MARKUP, marginwidth ) ) ), attributes );
    }
    if( NIL != marginheight )
    {
      assert NIL != Types.atom( marginheight ) : marginheight;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, marginheight, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list902, ConsesLow.list( $sym351$HTML_MARKUP, marginheight ) ) ), attributes );
    }
    if( NIL != scrolling )
    {
      assert NIL != Types.atom( scrolling ) : scrolling;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, scrolling, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list903, ConsesLow.list( $sym351$HTML_MARKUP, scrolling ) ) ), attributes );
    }
    attributes = Sequences.nreverse( attributes );
    return ConsesLow.list( $sym350$PROGN, $list393, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list904, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body,
        NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 114748L)
  public static SubLObject html_fancy_image(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject src = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list905 );
    src = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$40 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list905 );
      current_$40 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list905 );
      if( NIL == conses_high.member( current_$40, $list906, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$40 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list905 );
    }
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject ismap_tail = cdestructuring_bind.property_list_member( $kw907$ISMAP, current );
    final SubLObject ismap = ( NIL != ismap_tail ) ? conses_high.cadr( ismap_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw594$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw595$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject alt_tail = cdestructuring_bind.property_list_member( $kw593$ALT, current );
    final SubLObject alt = ( NIL != alt_tail ) ? conses_high.cadr( alt_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject border_tail = cdestructuring_bind.property_list_member( $kw643$BORDER, current );
    final SubLObject border = ( NIL != border_tail ) ? conses_high.cadr( border_tail ) : NIL;
    final SubLObject style_tail = cdestructuring_bind.property_list_member( $kw373$STYLE, current );
    final SubLObject style = ( NIL != style_tail ) ? conses_high.cadr( style_tail ) : NIL;
    SubLObject attributes = NIL;
    attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list908, src.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, src ) : src ), attributes );
    if( NIL != name )
    {
      assert NIL != Types.atom( name ) : name;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, name, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list909, ConsesLow.list( $sym351$HTML_MARKUP, name ) ) ), attributes );
    }
    if( NIL != id )
    {
      assert NIL != Types.atom( id ) : id;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, id, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list415, ConsesLow.list( $sym351$HTML_MARKUP, id ) ) ), attributes );
    }
    if( NIL != v_class )
    {
      assert NIL != Types.atom( v_class ) : v_class;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, v_class, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list416, ConsesLow.list( $sym351$HTML_MARKUP, v_class ) ) ), attributes );
    }
    if( NIL != ismap )
    {
      assert NIL != Types.atom( ismap ) : ismap;
      attributes = ConsesLow.cons( ConsesLow.listS( $sym379$PWHEN, ismap, $list910 ), attributes );
    }
    if( NIL != height )
    {
      assert NIL != Types.atom( height ) : height;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, height, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list911, ConsesLow.list( $sym351$HTML_MARKUP, height ) ) ), attributes );
    }
    if( NIL != width )
    {
      assert NIL != Types.atom( width ) : width;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, width, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list912, ConsesLow.list( $sym351$HTML_MARKUP, width ) ) ), attributes );
    }
    if( NIL != alt )
    {
      assert NIL != Types.atom( alt ) : alt;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, alt, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list913, alt.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, alt ) : alt ) ), attributes );
    }
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list914, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, align ) ) ) ),
          attributes );
    }
    if( NIL != border )
    {
      assert NIL != Types.atom( border ) : border;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, border, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list915, ConsesLow.list( $sym351$HTML_MARKUP, border ) ) ), attributes );
    }
    if( NIL != style )
    {
      assert NIL != Types.atom( style ) : style;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, style, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list916, ConsesLow.list( $sym351$HTML_MARKUP, style ) ) ), attributes );
    }
    attributes = Sequences.nreverse( attributes );
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list917, ConsesLow.append( attributes, $list918 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 117028L)
  public static SubLObject html_embedded_image(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list919 );
    filename = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$41 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list919 );
      current_$41 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list919 );
      if( NIL == conses_high.member( current_$41, $list920, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$41 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list919 );
    }
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw455$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current );
    final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject ismap_tail = cdestructuring_bind.property_list_member( $kw907$ISMAP, current );
    final SubLObject ismap = ( NIL != ismap_tail ) ? conses_high.cadr( ismap_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw594$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw595$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject alt_tail = cdestructuring_bind.property_list_member( $kw593$ALT, current );
    final SubLObject alt = ( NIL != alt_tail ) ? conses_high.cadr( alt_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject border_tail = cdestructuring_bind.property_list_member( $kw643$BORDER, current );
    final SubLObject border = ( NIL != border_tail ) ? conses_high.cadr( border_tail ) : NIL;
    final SubLObject data_src = $sym921$DATA_SRC;
    return ConsesLow.list( $sym357$CLET, ConsesLow.list( ConsesLow.list( data_src, ConsesLow.list( $sym922$HTML_EMBEDDED_IMAGE_DATA_SRC, filename, type ) ) ), ConsesLow.list( new SubLObject[] { $sym923$HTML_FANCY_IMAGE,
      data_src, $kw440$NAME, name, $kw411$ID, id, $kw365$CLASS, v_class, $kw907$ISMAP, ismap, $kw594$HEIGHT, height, $kw595$WIDTH, width, $kw593$ALT, alt, $kw412$ALIGN, align, $kw643$BORDER, border
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 117459L)
  public static SubLObject html_embedded_image_data_src(final SubLObject filename, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mime_type = http_kernel.html_determine_mime_type( filename, type );
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject base64_string = html_base64_string_for_file( filename );
    final SubLObject pad_chars = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      PrintLow.format( stream, $str925$data__A_base64_, mime_type );
      final SubLObject string_var = base64_string;
      SubLObject end_var_$42;
      SubLObject end_var;
      SubLObject index;
      SubLObject v_char;
      for( end_var = ( end_var_$42 = Sequences.length( string_var ) ), index = NIL, index = ZERO_INTEGER; !index.numGE( end_var_$42 ); index = number_utilities.f_1X( index ) )
      {
        v_char = Strings.sublisp_char( string_var, index );
        if( Numbers.mod( index, $int926$76 ).isZero() )
        {
          streams_high.terpri( stream );
        }
        streams_high.write_char( v_char, stream );
      }
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( pad_chars ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        streams_high.write_char( Characters.CHAR_equal, stream );
      }
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 118022L)
  public static SubLObject html_base64_string_for_file(final SubLObject filename)
  {
    final SubLObject byte_vector = vector_utilities.new_byte_vector_from_file( filename );
    final SubLObject base64_string = vector_utilities.byte_vector_to_64_bit_char_string( byte_vector );
    final SubLObject pad_chars = Numbers.mod( Numbers.min( FOUR_INTEGER, Numbers.subtract( FOUR_INTEGER, Numbers.mod( Sequences.length( base64_string ), FOUR_INTEGER ) ) ), FOUR_INTEGER );
    Sequences.nsubstitute( Characters.CHAR_slash, Characters.CHAR_underbar, base64_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    Sequences.nsubstitute( Characters.CHAR_plus, Characters.CHAR_hyphen, base64_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Values.values( base64_string, pad_chars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 118397L)
  public static SubLObject html_fancy_map(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list849 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list849 );
    name = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list849 );
      return NIL;
    }
    final SubLObject body;
    current = ( body = temp );
    assert NIL != Types.atom( name ) : name;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list927, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list928, ConsesLow.list( $sym351$HTML_MARKUP, name ) ), reader.bq_cons( $sym392$HTML_MARKUP_BODY,
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 118816L)
  public static SubLObject html_map(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list849 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list849 );
    name = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym929$HTML_FANCY_MAP, ConsesLow.list( name ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list849 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 118905L)
  public static SubLObject html_no_break(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list930, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 119171L)
  public static SubLObject html_no_frames(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list931, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 119444L)
  public static SubLObject html_object(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list932 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$43 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list932 );
      current_$43 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list932 );
      if( NIL == conses_high.member( current_$43, $list933, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$43 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list932 );
    }
    final SubLObject classid_tail = cdestructuring_bind.property_list_member( $kw934$CLASSID, current );
    final SubLObject classid = ( NIL != classid_tail ) ? conses_high.cadr( classid_tail ) : NIL;
    final SubLObject codebase_tail = cdestructuring_bind.property_list_member( $kw591$CODEBASE, current );
    final SubLObject codebase = ( NIL != codebase_tail ) ? conses_high.cadr( codebase_tail ) : NIL;
    final SubLObject codetype_tail = cdestructuring_bind.property_list_member( $kw935$CODETYPE, current );
    final SubLObject codetype = ( NIL != codetype_tail ) ? conses_high.cadr( codetype_tail ) : NIL;
    final SubLObject data_tail = cdestructuring_bind.property_list_member( $kw936$DATA, current );
    final SubLObject data = ( NIL != data_tail ) ? conses_high.cadr( data_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw455$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject archive_tail = cdestructuring_bind.property_list_member( $kw592$ARCHIVE, current );
    final SubLObject archive = ( NIL != archive_tail ) ? conses_high.cadr( archive_tail ) : NIL;
    final SubLObject id_tail = cdestructuring_bind.property_list_member( $kw411$ID, current );
    final SubLObject id = ( NIL != id_tail ) ? conses_high.cadr( id_tail ) : NIL;
    final SubLObject class_tail = cdestructuring_bind.property_list_member( $kw365$CLASS, current );
    final SubLObject v_class = ( NIL != class_tail ) ? conses_high.cadr( class_tail ) : NIL;
    final SubLObject align_tail = cdestructuring_bind.property_list_member( $kw412$ALIGN, current );
    final SubLObject align = ( NIL != align_tail ) ? conses_high.cadr( align_tail ) : NIL;
    final SubLObject width_tail = cdestructuring_bind.property_list_member( $kw595$WIDTH, current );
    final SubLObject width = ( NIL != width_tail ) ? conses_high.cadr( width_tail ) : NIL;
    final SubLObject height_tail = cdestructuring_bind.property_list_member( $kw594$HEIGHT, current );
    final SubLObject height = ( NIL != height_tail ) ? conses_high.cadr( height_tail ) : NIL;
    final SubLObject border_tail = cdestructuring_bind.property_list_member( $kw643$BORDER, current );
    final SubLObject border = ( NIL != border_tail ) ? conses_high.cadr( border_tail ) : NIL;
    final SubLObject hspace_tail = cdestructuring_bind.property_list_member( $kw937$HSPACE, current );
    final SubLObject hspace = ( NIL != hspace_tail ) ? conses_high.cadr( hspace_tail ) : NIL;
    final SubLObject vspace_tail = cdestructuring_bind.property_list_member( $kw938$VSPACE, current );
    final SubLObject vspace = ( NIL != vspace_tail ) ? conses_high.cadr( vspace_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    if( NIL != classid )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list939, classid.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, classid ) : classid ), attributes );
    }
    if( NIL != codebase )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list940, codebase.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, codebase ) : codebase ), attributes );
    }
    if( NIL != codetype )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list941, codetype.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, codetype ) : codetype ), attributes );
    }
    if( NIL != data )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list942, data.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, data ) : data ), attributes );
    }
    if( NIL != type )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list943, type.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, type ) : type ), attributes );
    }
    if( NIL != archive )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list944, archive.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, archive ) : archive ), attributes );
    }
    if( NIL != id )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list945, id.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, id ) : id ), attributes );
    }
    if( NIL != v_class )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list946, v_class.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, v_class ) : v_class ), attributes );
    }
    if( NIL != align )
    {
      assert NIL != Types.atom( align ) : align;
      attributes = ConsesLow.cons( ConsesLow.list( $sym379$PWHEN, align, ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list947, ConsesLow.list( $sym351$HTML_MARKUP, ConsesLow.list( $sym601$HTML_ALIGN, align ) ) ) ),
          attributes );
    }
    if( NIL != width )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list948, width.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, width ) : width ), attributes );
    }
    if( NIL != height )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list949, height.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, height ) : height ), attributes );
    }
    if( NIL != border )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list950, border.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, border ) : border ), attributes );
    }
    if( NIL != hspace )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list951, hspace.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, hspace ) : hspace ), attributes );
    }
    if( NIL != vspace )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list952, vspace.isAtom() ? ConsesLow.list( $sym351$HTML_MARKUP, vspace ) : vspace ), attributes );
    }
    attributes = Sequences.nreverse( attributes );
    return ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list953, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 122194L)
  public static SubLObject html_fancy_script(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list954 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$44 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list954 );
      current_$44 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list954 );
      if( NIL == conses_high.member( current_$44, $list955, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$44 == $kw361$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list954 );
    }
    final SubLObject language_tail = cdestructuring_bind.property_list_member( $kw956$LANGUAGE, current );
    final SubLObject language = ( NIL != language_tail ) ? conses_high.cadr( language_tail ) : NIL;
    final SubLObject src_tail = cdestructuring_bind.property_list_member( $kw566$SRC, current );
    final SubLObject src = ( NIL != src_tail ) ? conses_high.cadr( src_tail ) : NIL;
    final SubLObject type_tail = cdestructuring_bind.property_list_member( $kw455$TYPE, current );
    final SubLObject type = ( NIL != type_tail ) ? conses_high.cadr( type_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    SubLObject attributes = NIL;
    assert NIL != Types.atom( language ) : language;
    assert NIL != Types.atom( src ) : src;
    assert NIL != Types.atom( type ) : type;
    if( NIL != language )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list957, ConsesLow.list( $sym351$HTML_MARKUP, language ) ), attributes );
    }
    if( NIL != src )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list958, ConsesLow.list( $sym351$HTML_MARKUP, src ) ), attributes );
    }
    if( NIL != type )
    {
      attributes = ConsesLow.cons( ConsesLow.list( $sym374$HTML_QUOTED_ATTRIBUTE, $list959, ConsesLow.list( $sym351$HTML_MARKUP, type ) ), attributes );
    }
    if( NIL != attributes )
    {
      attributes = Sequences.nreverse( attributes );
    }
    return ConsesLow.list( $sym350$PROGN, $list393, ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, $list960, ConsesLow.append( attributes, ConsesLow.list( reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body,
        ( NIL != body ) ? $list395 : NIL, NIL ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123072L)
  public static SubLObject html_javascript(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym961$HTML_FANCY_SCRIPT, $list962, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123204L)
  public static SubLObject html_noscript(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym390$HTML_MARKUP_WRAPPER, $list963, reader.bq_cons( $sym392$HTML_MARKUP_BODY, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123420L)
  public static SubLObject cyc_link(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject url_body = NIL;
    SubLObject link_body = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list964 );
    url_body = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list964 );
    link_body = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym848$HTML_FANCY_ANCHOR, ConsesLow.list( $kw456$HREF, ConsesLow.list( $sym350$PROGN, $list965, url_body ) ), link_body );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list964 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123693L)
  public static SubLObject html_dummy_form(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym618$HTML_FANCY_FORM, $list966, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123806L)
  public static SubLObject html_basic_cyc_form(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym618$HTML_FANCY_FORM, $list967, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 123947L)
  public static SubLObject html_basic_cyc_form_handler(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list968 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject handler_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list968 );
    handler_name = current.first();
    current = current.rest();
    final SubLObject value = current.isCons() ? current.first() : T;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list968 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym969$HTML_BASIC_CYC_FORM, ConsesLow.list( $sym970$HTML_HIDDEN_INPUT, handler_name, value ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list968 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124139L)
  public static SubLObject html_basic_textarea(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list971 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    SubLObject cols = NIL;
    SubLObject rows = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list971 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list971 );
    cols = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list971 );
    rows = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym972$HTML_FANCY_TEXTAREA, ConsesLow.list( name, $kw710$COLS, cols, $kw711$ROWS, rows ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list971 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124289L)
  public static SubLObject html_basic_textarea_wrap(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list971 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    SubLObject cols = NIL;
    SubLObject rows = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list971 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list971 );
    cols = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list971 );
    rows = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym972$HTML_FANCY_TEXTAREA, ConsesLow.listS( name, $kw710$COLS, cols, $kw711$ROWS, rows, $list973 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list971 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124555L)
  public static SubLObject html_basic_select(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list974 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    SubLObject size = NIL;
    SubLObject multipleP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list974 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list974 );
    size = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list974 );
    multipleP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym975$HTML_FANCY_SELECT, ConsesLow.list( name, $kw688$MULTIPLE, multipleP, $kw511$SIZE, size ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list974 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124715L)
  public static SubLObject html_basic_option(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list976 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject selectedP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list976 );
    selectedP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym977$HTML_FANCY_OPTION, ConsesLow.list( $kw695$SELECTED, selectedP ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list976 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 124847L)
  public static SubLObject html_basic_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list978 );
    final SubLObject temp = current.rest();
    current = current.first();
    final SubLObject caption = current.isCons() ? current.first() : $str180$;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list978 );
    current = current.rest();
    final SubLObject align = current.isCons() ? current.first() : $kw979$TOP;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list978 );
    current = current.rest();
    final SubLObject border = current.isCons() ? current.first() : TWO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list978 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym749$HTML_FANCY_TABLE, ConsesLow.list( $kw643$BORDER, border ), ConsesLow.list( $sym980$HTML_TABLE_CAPTION, ConsesLow.list( align ), ConsesLow.list( $sym477$HTML_PRINC, caption ) ),
          ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list978 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 125070L)
  public static SubLObject html_autocomplete_textarea(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list981 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject name = NIL;
    SubLObject cols = NIL;
    SubLObject rows = NIL;
    SubLObject cycl_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list981 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list981 );
    cols = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list981 );
    rows = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list981 );
    cycl_type = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject id_num = $sym982$ID_NUM;
      final SubLObject input_id = $sym983$INPUT_ID;
      final SubLObject result_id = $sym984$RESULT_ID;
      final SubLObject autocomplete_id = $sym985$AUTOCOMPLETE_ID;
      return ConsesLow.list( $sym612$PIF, $list986, ConsesLow.list( $sym357$CLET, ConsesLow.list( reader.bq_cons( id_num, $list987 ), ConsesLow.list( autocomplete_id, ConsesLow.list( $sym988$FORMAT_NIL,
          $str989$autocomplete__A, id_num ) ), ConsesLow.list( input_id, ConsesLow.list( $sym988$FORMAT_NIL, $str990$input__A, id_num ) ), ConsesLow.list( result_id, ConsesLow.list( $sym988$FORMAT_NIL,
              $str991$autocomplete_results__A, id_num ) ) ), ConsesLow.list( $sym992$HTML_FANCY_DIV, ConsesLow.listS( $kw411$ID, autocomplete_id, $list993 ), ConsesLow.listS( $sym972$HTML_FANCY_TEXTAREA, ConsesLow.listS(
                  name, new SubLObject[]
                  { $kw365$CLASS, $str994$yui_ac_input, $kw411$ID, input_id, $kw710$COLS, cols, $kw711$ROWS, rows, $list995
                  } ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym992$HTML_FANCY_DIV, ConsesLow.listS( $kw411$ID, result_id, $list996 ) ) ), ConsesLow.list( $sym997$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT,
                      input_id, result_id, TWENTY_INTEGER, THREE_INTEGER, NIL, cycl_type ) ), ConsesLow.listS( $sym972$HTML_FANCY_TEXTAREA, ConsesLow.list( name, $kw710$COLS, cols, $kw711$ROWS, rows ), ConsesLow.append(
                          body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list981 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 126040L)
  public static SubLObject with_html_output_to_stream(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject stream = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list998 );
    stream = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym357$CLET, ConsesLow.list( ConsesLow.list( $sym347$_HTML_STREAM_, stream ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 126345L)
  public static SubLObject with_html_output_to_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject string_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list999 );
    string_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    assert NIL != Types.symbolp( string_var ) : string_var;
    final SubLObject stream = $sym1001$STREAM;
    return ConsesLow.list( $sym1002$CWITH_OUTPUT_TO_STRING, ConsesLow.list( stream, string_var ), ConsesLow.listS( $sym1003$WITH_HTML_OUTPUT_TO_STREAM, stream, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 126736L)
  public static SubLObject with_html_output_to_ascii_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject string_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list999 );
    string_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym350$PROGN, ConsesLow.listS( $sym1004$WITH_HTML_OUTPUT_TO_STRING, string_var, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym805$CSETQ, string_var, ConsesLow.list(
        $sym1005$CONVERT_HTML_TO_TEXT, string_var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 127218L)
  public static SubLObject with_html_state(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject machine = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1006 );
    machine = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject state_var = $sym1007$STATE_VAR;
    final SubLObject lock_var = $sym1008$LOCK_VAR;
    final SubLObject v_variables = $sym1009$VARIABLES;
    final SubLObject values = $sym1010$VALUES;
    return ConsesLow.list( $sym357$CLET, ConsesLow.list( ConsesLow.list( state_var, ConsesLow.list( $sym1011$HTML_MACHINE_STATE, machine ) ), ConsesLow.list( lock_var, ConsesLow.list( $sym1012$HTML_MACHINE_STATE_LOCK,
        state_var ) ), v_variables, values ), ConsesLow.list( $sym1013$WITH_LOCK_HELD, ConsesLow.list( lock_var ), ConsesLow.list( $sym805$CSETQ, v_variables, ConsesLow.list( $sym1014$HTML_MACHINE_STATE_VARIABLES,
            state_var ) ), ConsesLow.list( $sym805$CSETQ, values, ConsesLow.list( $sym1015$HTML_MACHINE_STATE_VALUES, state_var ) ) ), ConsesLow.listS( $sym1016$CPROGV, v_variables, values, ConsesLow.append( body,
                ConsesLow.list( ConsesLow.list( $sym1017$SNAPSHOT_HTML_STATE, state_var ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 127801L)
  public static SubLObject html_parameter_entry_format(final SubLObject parameter)
  {
    return Symbols.get( parameter, $kw1018$HTML_PARAMETER_ENTRY_FORMAT, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 130668L)
  public static SubLObject set_html_parameter_entry_format(final SubLObject parameter, final SubLObject entry_format)
  {
    Symbols.put( parameter, $kw1018$HTML_PARAMETER_ENTRY_FORMAT, entry_format );
    return parameter;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 130831L)
  public static SubLObject declare_html_parameter_entry_format(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject parameter = NIL;
    SubLObject entry_format = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1019 );
    parameter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1019 );
    entry_format = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1020$SET_HTML_PARAMETER_ENTRY_FORMAT, ConsesLow.list( $sym1021$QUOTE, parameter ), ConsesLow.list( $sym1021$QUOTE, entry_format ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list1019 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 131360L)
  public static SubLObject define_cgi_handler(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    SubLObject type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1028 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1028 );
    arglist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1028 );
    type = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject max_args = list_utilities.function_arglist_max_args( arglist );
    if( !max_args.numE( ONE_INTEGER ) )
    {
      Errors.warn( $str1029$HTML_handler__A_has_an_invalid_ar, name, arglist );
    }
    return ConsesLow.list( $sym350$PROGN, ConsesLow.listS( $sym1030$DEFINE, name, arglist, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym1031$NOTE_CGI_HANDLER_FUNCTION, ConsesLow.list( $sym1021$QUOTE, name ),
        type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 131823L)
  public static SubLObject note_cgi_handler_function(final SubLObject symbol, final SubLObject type_symbol)
  {
    Hashtables.sethash( symbol, get_handler_mime_type_hash(), type_symbol );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 132194L)
  public static SubLObject get_handler_mime_type_hash()
  {
    if( NIL == $handler_mime_types$.getGlobalValue() || NIL != dictionary.dictionary_p( $handler_mime_types$.getGlobalValue() ) )
    {
      $handler_mime_types$.setGlobalValue( Hashtables.make_hash_table( $int1034$200, EQ, UNPROVIDED ) );
    }
    return $handler_mime_types$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 132580L)
  public static SubLObject get_handler_mime_type_property(final SubLObject symbol)
  {
    return Hashtables.gethash( symbol, $handler_mime_types$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 132683L)
  public static SubLObject define_html_handler(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1035 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1035 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1036$DEFINE_CGI_HANDLER, name, arglist, $html_handler_property$.getGlobalValue(), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 132883L)
  public static SubLObject define_html_fragment_handler(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1035 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1035 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1032$DEFINE_HTML_HANDLER, name, arglist, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133122L)
  public static SubLObject cgi_handler_functionP(final SubLObject symbol)
  {
    return list_utilities.sublisp_boolean( Hashtables.gethash( symbol, get_handler_mime_type_hash(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133301L)
  public static SubLObject html_handler_functionP(final SubLObject symbol)
  {
    return Equality.eq( Hashtables.gethash( symbol, get_handler_mime_type_hash(), UNPROVIDED ), $html_handler_property$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133436L)
  public static SubLObject xml_handler_functionP(final SubLObject symbol)
  {
    return Equality.eq( Hashtables.gethash( get_handler_mime_type_hash(), symbol, UNPROVIDED ), $xml_handler_property$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133633L)
  public static SubLObject json_handler_functionP(final SubLObject symbol)
  {
    return Equality.eq( Hashtables.gethash( symbol, get_handler_mime_type_hash(), UNPROVIDED ), $xml_handler_property$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 133831L)
  public static SubLObject all_cgi_handler_symbols(final SubLObject sym)
  {
    SubLObject symbols = NIL;
    final SubLObject cdohash_table = get_handler_mime_type_hash();
    SubLObject symbol = NIL;
    SubLObject handler_property = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        symbol = Hashtables.getEntryKey( cdohash_entry );
        handler_property = Hashtables.getEntryValue( cdohash_entry );
        if( handler_property.eql( sym ) )
        {
          symbols = ConsesLow.cons( symbol, symbols );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    symbols = Sort.sort( symbols, Symbols.symbol_function( $sym1037$STRING_LESSP ), Symbols.symbol_function( $sym1038$SYMBOL_NAME ) );
    return symbols;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 134293L)
  public static SubLObject all_html_handler_symbols()
  {
    return all_cgi_handler_symbols( $html_handler_property$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 134400L)
  public static SubLObject all_json_handler_symbols()
  {
    return all_cgi_handler_symbols( $json_handler_property$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 134506L)
  public static SubLObject all_xml_handler_symbols()
  {
    return all_cgi_handler_symbols( $xml_handler_property$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 134610L)
  public static SubLObject define_xml_handler(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1035 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1035 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1036$DEFINE_CGI_HANDLER, name, arglist, $xml_handler_property$.getGlobalValue(), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 135012L)
  public static SubLObject define_json_handler(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject arglist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1035 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1035 );
    arglist = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym1036$DEFINE_CGI_HANDLER, name, arglist, $json_handler_property$.getGlobalValue(), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 135415L)
  public static SubLObject with_html_args(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject specs = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1039 );
    specs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1039 );
    args = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject alist = $sym1040$ALIST;
    SubLObject vars = NIL;
    SubLObject parsing_code = NIL;
    SubLObject cdolist_list_var = specs;
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = spec.isCons() ? spec.first() : spec;
      vars = ConsesLow.cons( var, vars );
      if( spec.isCons() )
      {
        SubLObject current_$46;
        final SubLObject datum_$45 = current_$46 = spec;
        SubLObject variable = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$46, datum_$45, $list1041 );
        variable = current_$46.first();
        current_$46 = current_$46.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current_$46;
        SubLObject bad = NIL;
        SubLObject current_$47 = NIL;
        while ( NIL != rest)
        {
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum_$45, $list1041 );
          current_$47 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp( rest, datum_$45, $list1041 );
          if( NIL == conses_high.member( current_$47, $list1042, UNPROVIDED, UNPROVIDED ) )
          {
            bad = T;
          }
          if( current_$47 == $kw361$ALLOW_OTHER_KEYS )
          {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if( NIL != bad && NIL == allow_other_keys_p )
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$45, $list1041 );
        }
        final SubLObject reader_tail = cdestructuring_bind.property_list_member( $kw1043$READER, current_$46 );
        final SubLObject reader = ( NIL != reader_tail ) ? conses_high.cadr( reader_tail ) : NIL;
        final SubLObject type_pred_tail = cdestructuring_bind.property_list_member( $kw1044$TYPE_PRED, current_$46 );
        final SubLObject type_pred = ( NIL != type_pred_tail ) ? conses_high.cadr( type_pred_tail ) : NIL;
        final SubLObject name_tail = cdestructuring_bind.property_list_member( $kw440$NAME, current_$46 );
        final SubLObject name = ( NIL != name_tail ) ? conses_high.cadr( name_tail ) : NIL;
        final SubLObject collect_tail = cdestructuring_bind.property_list_member( $kw1045$COLLECT, current_$46 );
        final SubLObject collect = ( NIL != collect_tail ) ? conses_high.cadr( collect_tail ) : NIL;
        final SubLObject test_tail = cdestructuring_bind.property_list_member( $kw1046$TEST, current_$46 );
        final SubLObject test = ( NIL != test_tail ) ? conses_high.cadr( test_tail ) : $list1047;
        SubLObject key_string = NIL;
        if( NIL != name )
        {
          key_string = name;
        }
        else
        {
          key_string = Strings.string_downcase( Symbols.symbol_name( var ), UNPROVIDED, UNPROVIDED );
        }
        if( NIL != collect )
        {
          final SubLObject current_$48 = $sym1048$CURRENT;
          parsing_code = ConsesLow.cons( ConsesLow.list( $sym1049$CDO, ConsesLow.list( ConsesLow.list( current_$48, alist, ConsesLow.list( $sym1050$CDR, current_$48 ) ) ), ConsesLow.list( ConsesLow.list( $sym1051$NULL,
              current_$48 ) ), ConsesLow.list( $sym379$PWHEN, ConsesLow.list( $sym1052$FUNCALL, test, key_string, ConsesLow.list( $sym1053$CAAR, current_$48 ) ), ( NIL != reader ) ? ConsesLow.list( $sym1054$CPUSH,
                  ConsesLow.list( $sym1052$FUNCALL, reader, ConsesLow.list( $sym1055$CAR, ConsesLow.list( $sym1056$CDAR, current_$48 ) ) ), var )
                  : ConsesLow.list( $sym1054$CPUSH, ConsesLow.list( $sym1055$CAR, ConsesLow.list( $sym1056$CDAR, current_$48 ) ), var ) ) ), parsing_code );
        }
        else if( NIL != reader )
        {
          final SubLObject val = $sym1057$VAL;
          parsing_code = ConsesLow.cons( ConsesLow.list( $sym357$CLET, ConsesLow.list( ConsesLow.list( val, ConsesLow.list( $sym1058$CADR, ConsesLow.list( $sym1059$ASSOC, key_string, alist, test ) ) ) ), ConsesLow.list(
              $sym379$PWHEN, val, ConsesLow.list( $sym1060$CSETF, var, ConsesLow.list( $sym1052$FUNCALL, reader, val ) ) ) ), parsing_code );
        }
        else
        {
          parsing_code = ConsesLow.cons( ConsesLow.list( $sym1060$CSETF, var, ConsesLow.list( $sym1058$CADR, ConsesLow.list( $sym1059$ASSOC, key_string, alist, test ) ) ), parsing_code );
        }
        if( NIL != type_pred )
        {
          parsing_code = ConsesLow.cons( ConsesLow.list( $sym1061$PUNLESS, ConsesLow.list( $sym1052$FUNCALL, type_pred, var ), ConsesLow.list( $sym1062$ERROR, $str1063$HTML_argument_error___S_should_be, var,
              type_pred ) ), parsing_code );
        }
      }
      else
      {
        parsing_code = ConsesLow.cons( ConsesLow.list( $sym1060$CSETF, var, ConsesLow.list( $sym1058$CADR, ConsesLow.listS( $sym1059$ASSOC, Strings.string_downcase( Symbols.symbol_name( var ), UNPROVIDED, UNPROVIDED ),
            alist, $list1064 ) ) ), parsing_code );
      }
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    parsing_code = Sequences.nreverse( parsing_code );
    return ConsesLow.listS( $sym357$CLET, reader.bq_cons( ConsesLow.list( alist, ConsesLow.list( $sym1065$REMOVE_IF_NOT, $list1066, args ) ), ConsesLow.append( vars, NIL ) ), ConsesLow.append( parsing_code, body,
        NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-macros.lisp", position = 137641L)
  public static SubLObject html_possibly_strong(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject strongP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1067 );
    strongP = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject strong_var = $sym1068$STRONG_VAR;
    final SubLObject head = $sym1069$HEAD;
    final SubLObject tail = $sym1070$TAIL;
    return ConsesLow.list( $sym357$CLET, ConsesLow.list( ConsesLow.list( strong_var, strongP ), ConsesLow.list( head, ConsesLow.listS( $sym807$FIF, strong_var, $list1071 ) ), ConsesLow.list( tail, ConsesLow.listS(
        $sym807$FIF, strong_var, $list1072 ) ) ), ConsesLow.listS( $sym390$HTML_MARKUP_WRAPPER, ConsesLow.list( head, tail ), ConsesLow.append( body, NIL ) ) );
  }

  public static SubLObject declare_html_macros_file()
  {
    SubLFiles.declareFunction( me, "is_known_dom_event_handlerP", "IS-KNOWN-DOM-EVENT-HANDLER?", 1, 0, false );
    SubLFiles.declareMacro( me, "html_format", "HTML-FORMAT" );
    SubLFiles.declareMacro( me, "html_format_strong", "HTML-FORMAT-STRONG" );
    SubLFiles.declareMacro( me, "html_markup_wrapper", "HTML-MARKUP-WRAPPER" );
    SubLFiles.declareMacro( me, "html_quoted_attribute", "HTML-QUOTED-ATTRIBUTE" );
    SubLFiles.declareMacro( me, "html_markup_body", "HTML-MARKUP-BODY" );
    SubLFiles.declareFunction( me, "html_inside_body_p", "HTML-INSIDE-BODY-P", 0, 0, false );
    SubLFiles.declareMacro( me, "html_fancy_body", "HTML-FANCY-BODY" );
    SubLFiles.declareMacro( me, "html_colored_body", "HTML-COLORED-BODY" );
    SubLFiles.declareMacro( me, "html_body", "HTML-BODY" );
    SubLFiles.declareMacro( me, "html_head", "HTML-HEAD" );
    SubLFiles.declareFunction( me, "html_head_content_type", "HTML-HEAD-CONTENT-TYPE", 0, 0, false );
    SubLFiles.declareMacro( me, "html_document", "HTML-DOCUMENT" );
    SubLFiles.declareMacro( me, "html_fancy_div", "HTML-FANCY-DIV" );
    SubLFiles.declareMacro( me, "html_smaller", "HTML-SMALLER" );
    SubLFiles.declareMacro( me, "html_larger", "HTML-LARGER" );
    SubLFiles.declareMacro( me, "html_fancy_span", "HTML-FANCY-SPAN" );
    SubLFiles.declareMacro( me, "html_meta", "HTML-META" );
    SubLFiles.declareMacro( me, "html_fancy_meta", "HTML-FANCY-META" );
    SubLFiles.declareMacro( me, "html_link", "HTML-LINK" );
    SubLFiles.declareMacro( me, "html_fancy_link", "HTML-FANCY-LINK" );
    SubLFiles.declareMacro( me, "html_base", "HTML-BASE" );
    SubLFiles.declareMacro( me, "html_fancy_base", "HTML-FANCY-BASE" );
    SubLFiles.declareFunction( me, "html_stylesheet_link", "HTML-STYLESHEET-LINK", 1, 3, false );
    SubLFiles.declareMacro( me, "html_style", "HTML-STYLE" );
    SubLFiles.declareMacro( me, "html_title", "HTML-TITLE" );
    SubLFiles.declareMacro( me, "html_simple_document", "HTML-SIMPLE-DOCUMENT" );
    SubLFiles.declareMacro( me, "html_simple_browser_document", "HTML-SIMPLE-BROWSER-DOCUMENT" );
    SubLFiles.declareMacro( me, "html_blockquote", "HTML-BLOCKQUOTE" );
    SubLFiles.declareMacro( me, "html_center", "HTML-CENTER" );
    SubLFiles.declareMacro( me, "html_heading", "HTML-HEADING" );
    SubLFiles.declareMacro( me, "html_paragraph", "HTML-PARAGRAPH" );
    SubLFiles.declareMacro( me, "html_plaintext", "HTML-PLAINTEXT" );
    SubLFiles.declareFunction( me, "verify_within_html_pre", "VERIFY-WITHIN-HTML-PRE", 0, 0, false );
    SubLFiles.declareFunction( me, "verify_not_within_html_pre", "VERIFY-NOT-WITHIN-HTML-PRE", 0, 0, false );
    SubLFiles.declareMacro( me, "html_pre", "HTML-PRE" );
    SubLFiles.declareMacro( me, "html_unpre", "HTML-UNPRE" );
    SubLFiles.declareMacro( me, "html_address", "HTML-ADDRESS" );
    SubLFiles.declareMacro( me, "html_big", "HTML-BIG" );
    SubLFiles.declareMacro( me, "html_bold", "HTML-BOLD" );
    SubLFiles.declareMacro( me, "html_b", "HTML-B" );
    SubLFiles.declareMacro( me, "html_cite", "HTML-CITE" );
    SubLFiles.declareMacro( me, "html_code", "HTML-CODE" );
    SubLFiles.declareMacro( me, "html_definition", "HTML-DEFINITION" );
    SubLFiles.declareMacro( me, "html_emphasized", "HTML-EMPHASIZED" );
    SubLFiles.declareMacro( me, "html_em", "HTML-EM" );
    SubLFiles.declareMacro( me, "html_fancy_font", "HTML-FANCY-FONT" );
    SubLFiles.declareMacro( me, "html_font", "HTML-FONT" );
    SubLFiles.declareMacro( me, "html_font_color", "HTML-FONT-COLOR" );
    SubLFiles.declareMacro( me, "html_text_background_color", "HTML-TEXT-BACKGROUND-COLOR" );
    SubLFiles.declareMacro( me, "html_italic", "HTML-ITALIC" );
    SubLFiles.declareMacro( me, "html_i", "HTML-I" );
    SubLFiles.declareMacro( me, "html_keyboard", "HTML-KEYBOARD" );
    SubLFiles.declareMacro( me, "html_sample", "HTML-SAMPLE" );
    SubLFiles.declareMacro( me, "html_small", "HTML-SMALL" );
    SubLFiles.declareMacro( me, "html_strikethrough", "HTML-STRIKETHROUGH" );
    SubLFiles.declareMacro( me, "html_strong", "HTML-STRONG" );
    SubLFiles.declareMacro( me, "html_subscript", "HTML-SUBSCRIPT" );
    SubLFiles.declareMacro( me, "html_superscript", "HTML-SUPERSCRIPT" );
    SubLFiles.declareMacro( me, "html_teletype", "HTML-TELETYPE" );
    SubLFiles.declareMacro( me, "html_tt", "HTML-TT" );
    SubLFiles.declareMacro( me, "html_underlined", "HTML-UNDERLINED" );
    SubLFiles.declareMacro( me, "html_u", "HTML-U" );
    SubLFiles.declareMacro( me, "html_variable", "HTML-VARIABLE" );
    SubLFiles.declareMacro( me, "html_fancy_label", "HTML-FANCY-LABEL" );
    SubLFiles.declareMacro( me, "html_definition_list", "HTML-DEFINITION-LIST" );
    SubLFiles.declareMacro( me, "html_compact_definition_list", "HTML-COMPACT-DEFINITION-LIST" );
    SubLFiles.declareMacro( me, "html_dl_term", "HTML-DL-TERM" );
    SubLFiles.declareMacro( me, "html_dl_definition", "HTML-DL-DEFINITION" );
    SubLFiles.declareMacro( me, "html_directory_list", "HTML-DIRECTORY-LIST" );
    SubLFiles.declareMacro( me, "html_compact_directory_list", "HTML-COMPACT-DIRECTORY-LIST" );
    SubLFiles.declareMacro( me, "html_menu_list", "HTML-MENU-LIST" );
    SubLFiles.declareMacro( me, "html_compact_menu_list", "HTML-COMPACT-MENU-LIST" );
    SubLFiles.declareMacro( me, "html_fancy_ordered_list", "HTML-FANCY-ORDERED-LIST" );
    SubLFiles.declareMacro( me, "html_ordered_list", "HTML-ORDERED-LIST" );
    SubLFiles.declareMacro( me, "html_number_list", "HTML-NUMBER-LIST" );
    SubLFiles.declareMacro( me, "html_fancy_unordered_list", "HTML-FANCY-UNORDERED-LIST" );
    SubLFiles.declareMacro( me, "html_unordered_list", "HTML-UNORDERED-LIST" );
    SubLFiles.declareMacro( me, "html_bullet_list", "HTML-BULLET-LIST" );
    SubLFiles.declareMacro( me, "html_plain_list", "HTML-PLAIN-LIST" );
    SubLFiles.declareMacro( me, "html_fancy_list_item", "HTML-FANCY-LIST-ITEM" );
    SubLFiles.declareMacro( me, "html_list_item", "HTML-LIST-ITEM" );
    SubLFiles.declareMacro( me, "html_fancy_summary", "HTML-FANCY-SUMMARY" );
    SubLFiles.declareMacro( me, "html_fancy_details", "HTML-FANCY-DETAILS" );
    SubLFiles.declareMacro( me, "html_applet", "HTML-APPLET" );
    SubLFiles.declareMacro( me, "html_param", "HTML-PARAM" );
    SubLFiles.declareMacro( me, "html_safe_param", "HTML-SAFE-PARAM" );
    SubLFiles.declareMacro( me, "with_html_id_space", "WITH-HTML-ID-SPACE" );
    SubLFiles.declareFunction( me, "next_html_id", "NEXT-HTML-ID", 0, 1, false );
    SubLFiles.declareFunction( me, "next_html_id_definedP", "NEXT-HTML-ID-DEFINED?", 0, 1, false );
    SubLFiles.declareMacro( me, "with_html_unique_form_fields", "WITH-HTML-UNIQUE-FORM-FIELDS" );
    SubLFiles.declareMacro( me, "with_html_unique_form_field_decoding", "WITH-HTML-UNIQUE-FORM-FIELD-DECODING" );
    SubLFiles.declareFunction( me, "next_html_form_field_uniquifier_code", "NEXT-HTML-FORM-FIELD-UNIQUIFIER-CODE", 0, 0, false );
    SubLFiles.declareFunction( me, "find_or_create_html_form_field_uniquifier_isg", "FIND-OR-CREATE-HTML-FORM-FIELD-UNIQUIFIER-ISG", 0, 0, false );
    SubLFiles.declareFunction( me, "embed_form_field_code", "EMBED-FORM-FIELD-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_form_field_code", "GET-FORM-FIELD-CODE", 1, 0, false );
    SubLFiles.declareMacro( me, "html_fancy_form", "HTML-FANCY-FORM" );
    SubLFiles.declareMacro( me, "html_fancy_input", "HTML-FANCY-INPUT" );
    SubLFiles.declareMacro( me, "html_script_button", "HTML-SCRIPT-BUTTON" );
    SubLFiles.declareMacro( me, "html_script_radio", "HTML-SCRIPT-RADIO" );
    SubLFiles.declareMacro( me, "html_script_submit", "HTML-SCRIPT-SUBMIT" );
    SubLFiles.declareMacro( me, "html_fancy_select", "HTML-FANCY-SELECT" );
    SubLFiles.declareMacro( me, "html_fancy_option", "HTML-FANCY-OPTION" );
    SubLFiles.declareMacro( me, "html_optgroup", "HTML-OPTGROUP" );
    SubLFiles.declareMacro( me, "html_fancy_textarea", "HTML-FANCY-TEXTAREA" );
    SubLFiles.declareMacro( me, "html_table_caption", "HTML-TABLE-CAPTION" );
    SubLFiles.declareMacro( me, "html_fancy_table", "HTML-FANCY-TABLE" );
    SubLFiles.declareMacro( me, "html_table", "HTML-TABLE" );
    SubLFiles.declareMacro( me, "html_fancy_table_data", "HTML-FANCY-TABLE-DATA" );
    SubLFiles.declareMacro( me, "html_table_data", "HTML-TABLE-DATA" );
    SubLFiles.declareMacro( me, "html_fancy_table_header", "HTML-FANCY-TABLE-HEADER" );
    SubLFiles.declareMacro( me, "html_table_heading", "HTML-TABLE-HEADING" );
    SubLFiles.declareMacro( me, "html_table_header_block", "HTML-TABLE-HEADER-BLOCK" );
    SubLFiles.declareMacro( me, "html_table_footer_block", "HTML-TABLE-FOOTER-BLOCK" );
    SubLFiles.declareMacro( me, "html_table_body_block", "HTML-TABLE-BODY-BLOCK" );
    SubLFiles.declareMacro( me, "html_fancy_table_row", "HTML-FANCY-TABLE-ROW" );
    SubLFiles.declareMacro( me, "html_table_row", "HTML-TABLE-ROW" );
    SubLFiles.declareMacro( me, "html_indent_table", "HTML-INDENT-TABLE" );
    SubLFiles.declareMacro( me, "html_indent_row", "HTML-INDENT-ROW" );
    SubLFiles.declareMacro( me, "html_indented_line", "HTML-INDENTED-LINE" );
    SubLFiles.declareMacro( me, "html_indented_line_inverse", "HTML-INDENTED-LINE-INVERSE" );
    SubLFiles.declareMacro( me, "cdolist_with_alternating_bgcolor", "CDOLIST-WITH-ALTERNATING-BGCOLOR" );
    SubLFiles.declareMacro( me, "cdolist_with_cyc_logo_colors", "CDOLIST-WITH-CYC-LOGO-COLORS" );
    SubLFiles.declareMacro( me, "cdolist_with_cyc_background_colors", "CDOLIST-WITH-CYC-BACKGROUND-COLORS" );
    SubLFiles.declareMacro( me, "cdolist_with_alternating_variable", "CDOLIST-WITH-ALTERNATING-VARIABLE" );
    SubLFiles.declareMacro( me, "cdolist_with_alternating_classes", "CDOLIST-WITH-ALTERNATING-CLASSES" );
    SubLFiles.declareMacro( me, "switch_cyc_logo_color", "SWITCH-CYC-LOGO-COLOR" );
    SubLFiles.declareMacro( me, "html_fancy_anchor", "HTML-FANCY-ANCHOR" );
    SubLFiles.declareMacro( me, "html_script_anchor", "HTML-SCRIPT-ANCHOR" );
    SubLFiles.declareMacro( me, "html_target_reference", "HTML-TARGET-REFERENCE" );
    SubLFiles.declareMacro( me, "html_mailto_anchor", "HTML-MAILTO-ANCHOR" );
    SubLFiles.declareMacro( me, "html_file_anchor", "HTML-FILE-ANCHOR" );
    SubLFiles.declareMacro( me, "html_fancy_area", "HTML-FANCY-AREA" );
    SubLFiles.declareMacro( me, "html_blink", "HTML-BLINK" );
    SubLFiles.declareMacro( me, "html_comment", "HTML-COMMENT" );
    SubLFiles.declareMacro( me, "html_fancy_frame", "HTML-FANCY-FRAME" );
    SubLFiles.declareMacro( me, "html_frame", "HTML-FRAME" );
    SubLFiles.declareMacro( me, "html_fancy_frameset", "HTML-FANCY-FRAMESET" );
    SubLFiles.declareMacro( me, "html_frameset", "HTML-FRAMESET" );
    SubLFiles.declareMacro( me, "html_fancy_iframe", "HTML-FANCY-IFRAME" );
    SubLFiles.declareMacro( me, "html_fancy_image", "HTML-FANCY-IMAGE" );
    SubLFiles.declareMacro( me, "html_embedded_image", "HTML-EMBEDDED-IMAGE" );
    SubLFiles.declareFunction( me, "html_embedded_image_data_src", "HTML-EMBEDDED-IMAGE-DATA-SRC", 1, 1, false );
    SubLFiles.declareFunction( me, "html_base64_string_for_file", "HTML-BASE64-STRING-FOR-FILE", 1, 0, false );
    SubLFiles.declareMacro( me, "html_fancy_map", "HTML-FANCY-MAP" );
    SubLFiles.declareMacro( me, "html_map", "HTML-MAP" );
    SubLFiles.declareMacro( me, "html_no_break", "HTML-NO-BREAK" );
    SubLFiles.declareMacro( me, "html_no_frames", "HTML-NO-FRAMES" );
    SubLFiles.declareMacro( me, "html_object", "HTML-OBJECT" );
    SubLFiles.declareMacro( me, "html_fancy_script", "HTML-FANCY-SCRIPT" );
    SubLFiles.declareMacro( me, "html_javascript", "HTML-JAVASCRIPT" );
    SubLFiles.declareMacro( me, "html_noscript", "HTML-NOSCRIPT" );
    SubLFiles.declareMacro( me, "cyc_link", "CYC-LINK" );
    SubLFiles.declareMacro( me, "html_dummy_form", "HTML-DUMMY-FORM" );
    SubLFiles.declareMacro( me, "html_basic_cyc_form", "HTML-BASIC-CYC-FORM" );
    SubLFiles.declareMacro( me, "html_basic_cyc_form_handler", "HTML-BASIC-CYC-FORM-HANDLER" );
    SubLFiles.declareMacro( me, "html_basic_textarea", "HTML-BASIC-TEXTAREA" );
    SubLFiles.declareMacro( me, "html_basic_textarea_wrap", "HTML-BASIC-TEXTAREA-WRAP" );
    SubLFiles.declareMacro( me, "html_basic_select", "HTML-BASIC-SELECT" );
    SubLFiles.declareMacro( me, "html_basic_option", "HTML-BASIC-OPTION" );
    SubLFiles.declareMacro( me, "html_basic_table", "HTML-BASIC-TABLE" );
    SubLFiles.declareMacro( me, "html_autocomplete_textarea", "HTML-AUTOCOMPLETE-TEXTAREA" );
    SubLFiles.declareMacro( me, "with_html_output_to_stream", "WITH-HTML-OUTPUT-TO-STREAM" );
    SubLFiles.declareMacro( me, "with_html_output_to_string", "WITH-HTML-OUTPUT-TO-STRING" );
    SubLFiles.declareMacro( me, "with_html_output_to_ascii_string", "WITH-HTML-OUTPUT-TO-ASCII-STRING" );
    SubLFiles.declareMacro( me, "with_html_state", "WITH-HTML-STATE" );
    SubLFiles.declareFunction( me, "html_parameter_entry_format", "HTML-PARAMETER-ENTRY-FORMAT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_html_parameter_entry_format", "SET-HTML-PARAMETER-ENTRY-FORMAT", 2, 0, false );
    SubLFiles.declareMacro( me, "declare_html_parameter_entry_format", "DECLARE-HTML-PARAMETER-ENTRY-FORMAT" );
    SubLFiles.declareMacro( me, "define_cgi_handler", "DEFINE-CGI-HANDLER" );
    SubLFiles.declareFunction( me, "note_cgi_handler_function", "NOTE-CGI-HANDLER-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_handler_mime_type_hash", "GET-HANDLER-MIME-TYPE-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "get_handler_mime_type_property", "GET-HANDLER-MIME-TYPE-PROPERTY", 1, 0, false );
    SubLFiles.declareMacro( me, "define_html_handler", "DEFINE-HTML-HANDLER" );
    SubLFiles.declareMacro( me, "define_html_fragment_handler", "DEFINE-HTML-FRAGMENT-HANDLER" );
    SubLFiles.declareFunction( me, "cgi_handler_functionP", "CGI-HANDLER-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "html_handler_functionP", "HTML-HANDLER-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "xml_handler_functionP", "XML-HANDLER-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "json_handler_functionP", "JSON-HANDLER-FUNCTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "all_cgi_handler_symbols", "ALL-CGI-HANDLER-SYMBOLS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_html_handler_symbols", "ALL-HTML-HANDLER-SYMBOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_json_handler_symbols", "ALL-JSON-HANDLER-SYMBOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_xml_handler_symbols", "ALL-XML-HANDLER-SYMBOLS", 0, 0, false );
    SubLFiles.declareMacro( me, "define_xml_handler", "DEFINE-XML-HANDLER" );
    SubLFiles.declareMacro( me, "define_json_handler", "DEFINE-JSON-HANDLER" );
    SubLFiles.declareMacro( me, "with_html_args", "WITH-HTML-ARGS" );
    SubLFiles.declareMacro( me, "html_possibly_strong", "HTML-POSSIBLY-STRONG" );
    return NIL;
  }

  public static SubLObject init_html_macros_file()
  {
    $html_stream$ = SubLFiles.defparameter( "*HTML-STREAM*", T );
    $html_default_bgcolor$ = SubLFiles.defparameter( "*HTML-DEFAULT-BGCOLOR*", NIL );
    $html_force_ie_standards_mode$ = SubLFiles.defparameter( "*HTML-FORCE-IE-STANDARDS-MODE*", T );
    $html_body_head$ = SubLFiles.defconstant( "*HTML-BODY-HEAD*", $str1$_body );
    $html_body_tail$ = SubLFiles.defconstant( "*HTML-BODY-TAIL*", $str2$__body_ );
    $html_body_bgcolor$ = SubLFiles.defconstant( "*HTML-BODY-BGCOLOR*", $str3$_bgcolor_ );
    $html_body_background$ = SubLFiles.defconstant( "*HTML-BODY-BACKGROUND*", $str4$_background_ );
    $html_body_class$ = SubLFiles.defconstant( "*HTML-BODY-CLASS*", $str5$_class_ );
    $html_body_style$ = SubLFiles.defconstant( "*HTML-BODY-STYLE*", $str6$_style_ );
    $html_body_text$ = SubLFiles.defconstant( "*HTML-BODY-TEXT*", $str7$_text_ );
    $html_body_link$ = SubLFiles.defconstant( "*HTML-BODY-LINK*", $str8$_link_ );
    $html_body_alink$ = SubLFiles.defconstant( "*HTML-BODY-ALINK*", $str9$_alink_ );
    $html_body_vlink$ = SubLFiles.defconstant( "*HTML-BODY-VLINK*", $str10$_vlink_ );
    $html_body_onload$ = SubLFiles.defconstant( "*HTML-BODY-ONLOAD*", $str11$_onLoad_ );
    $html_body_onresize$ = SubLFiles.defconstant( "*HTML-BODY-ONRESIZE*", $str12$_onResize_ );
    $html_div_head$ = SubLFiles.defconstant( "*HTML-DIV-HEAD*", $str13$_div );
    $html_div_tail$ = SubLFiles.defconstant( "*HTML-DIV-TAIL*", $str14$__div_ );
    $html_div_class$ = SubLFiles.defconstant( "*HTML-DIV-CLASS*", $str5$_class_ );
    $html_div_style$ = SubLFiles.defconstant( "*HTML-DIV-STYLE*", $str6$_style_ );
    $html_div_title$ = SubLFiles.defconstant( "*HTML-DIV-TITLE*", $str15$_title_ );
    $html_div_align$ = SubLFiles.defconstant( "*HTML-DIV-ALIGN*", $str16$_align_ );
    $html_div_onload$ = SubLFiles.defconstant( "*HTML-DIV-ONLOAD*", $str11$_onLoad_ );
    $html_span_head$ = SubLFiles.defconstant( "*HTML-SPAN-HEAD*", $str17$_span );
    $html_span_tail$ = SubLFiles.defconstant( "*HTML-SPAN-TAIL*", $str18$__span_ );
    $html_span_class$ = SubLFiles.defconstant( "*HTML-SPAN-CLASS*", $str5$_class_ );
    $html_span_style$ = SubLFiles.defconstant( "*HTML-SPAN-STYLE*", $str6$_style_ );
    $html_head_head$ = SubLFiles.defconstant( "*HTML-HEAD-HEAD*", $str19$_head_ );
    $html_head_tail$ = SubLFiles.defconstant( "*HTML-HEAD-TAIL*", $str20$__head_ );
    $html_html_head$ = SubLFiles.defconstant( "*HTML-HTML-HEAD*", $str21$_html_ );
    $html_html_tail$ = SubLFiles.defconstant( "*HTML-HTML-TAIL*", $str22$__html_ );
    $html_attribute_id$ = SubLFiles.defconstant( "*HTML-ATTRIBUTE-ID*", $str23$_id_ );
    $html_attribute_class$ = SubLFiles.defconstant( "*HTML-ATTRIBUTE-CLASS*", $str5$_class_ );
    $html_attribute_style$ = SubLFiles.defconstant( "*HTML-ATTRIBUTE-STYLE*", $str6$_style_ );
    $html_attribute_title$ = SubLFiles.defconstant( "*HTML-ATTRIBUTE-TITLE*", $str15$_title_ );
    $html_event_attribute_onclick$ = SubLFiles.defconstant( "*HTML-EVENT-ATTRIBUTE-ONCLICK*", $str24$_onclick_ );
    $html_event_attribute_onblur$ = SubLFiles.defconstant( "*HTML-EVENT-ATTRIBUTE-ONBLUR*", $str25$_onblur_ );
    $html_event_attribute_onfocus$ = SubLFiles.defconstant( "*HTML-EVENT-ATTRIBUTE-ONFOCUS*", $str26$_onfocus_ );
    $html_event_attribute_onkeyup$ = SubLFiles.defconstant( "*HTML-EVENT-ATTRIBUTE-ONKEYUP*", $str27$_onkeyup_ );
    $html_event_attribute_onkeydown$ = SubLFiles.defconstant( "*HTML-EVENT-ATTRIBUTE-ONKEYDOWN*", $str28$_onkeydown_ );
    $html_event_attribute_onkeypress$ = SubLFiles.defconstant( "*HTML-EVENT-ATTRIBUTE-ONKEYPRESS*", $str29$_onkeypress_ );
    $html_meta_head$ = SubLFiles.defconstant( "*HTML-META-HEAD*", $str30$_meta );
    $html_meta_http_equiv$ = SubLFiles.defconstant( "*HTML-META-HTTP-EQUIV*", $str31$_http_equiv_ );
    $html_meta_content$ = SubLFiles.defconstant( "*HTML-META-CONTENT*", $str32$_content_ );
    $html_meta_scheme$ = SubLFiles.defconstant( "*HTML-META-SCHEME*", $str33$_scheme_ );
    $html_meta_name$ = SubLFiles.defconstant( "*HTML-META-NAME*", $str34$_name_ );
    $html_meta_lang$ = SubLFiles.defconstant( "*HTML-META-LANG*", $str35$_lang_ );
    $html_meta_dir$ = SubLFiles.defconstant( "*HTML-META-DIR*", $str36$_dir_ );
    $html_title_head$ = SubLFiles.defconstant( "*HTML-TITLE-HEAD*", $str37$_title_ );
    $html_title_tail$ = SubLFiles.defconstant( "*HTML-TITLE-TAIL*", $str38$__title_ );
    $html_link_head$ = SubLFiles.defconstant( "*HTML-LINK-HEAD*", $str39$_link );
    $html_link_rel$ = SubLFiles.defconstant( "*HTML-LINK-REL*", $str40$_rel_ );
    $html_link_type$ = SubLFiles.defconstant( "*HTML-LINK-TYPE*", $str41$_type_ );
    $html_link_href$ = SubLFiles.defconstant( "*HTML-LINK-HREF*", $str42$_href_ );
    $html_link_media$ = SubLFiles.defconstant( "*HTML-LINK-MEDIA*", $str43$_media_ );
    $html_link_title$ = SubLFiles.defconstant( "*HTML-LINK-TITLE*", $str15$_title_ );
    $html_base_head$ = SubLFiles.defconstant( "*HTML-BASE-HEAD*", $str44$_base );
    $html_base_href$ = SubLFiles.defconstant( "*HTML-BASE-HREF*", $str42$_href_ );
    $html_style_head$ = SubLFiles.defconstant( "*HTML-STYLE-HEAD*", $str45$_style_ );
    $html_style_tail$ = SubLFiles.defconstant( "*HTML-STYLE-TAIL*", $str46$__style_ );
    $html_blockquote_head$ = SubLFiles.defconstant( "*HTML-BLOCKQUOTE-HEAD*", $str47$_blockquote_ );
    $html_blockquote_tail$ = SubLFiles.defconstant( "*HTML-BLOCKQUOTE-TAIL*", $str48$__blockquote_ );
    $html_center_head$ = SubLFiles.defconstant( "*HTML-CENTER-HEAD*", $str49$_center_ );
    $html_center_tail$ = SubLFiles.defconstant( "*HTML-CENTER-TAIL*", $str50$__center_ );
    $html_heading_head$ = SubLFiles.defconstant( "*HTML-HEADING-HEAD*", $str51$_h );
    $html_heading_tail$ = SubLFiles.defconstant( "*HTML-HEADING-TAIL*", $str52$__h );
    $html_hr_head$ = SubLFiles.defconstant( "*HTML-HR-HEAD*", $str53$_hr );
    $html_hr_size$ = SubLFiles.defconstant( "*HTML-HR-SIZE*", $str54$_size_ );
    $html_hr_width$ = SubLFiles.defconstant( "*HTML-HR-WIDTH*", $str55$_width_ );
    $html_line_break_atomic$ = SubLFiles.defconstant( "*HTML-LINE-BREAK-ATOMIC*", $str56$_br___ );
    $html_line_break_head$ = SubLFiles.defconstant( "*HTML-LINE-BREAK-HEAD*", $str57$_br );
    $html_line_break_tail$ = SubLFiles.defconstant( "*HTML-LINE-BREAK-TAIL*", $str58$__br_ );
    $html_line_break_clear$ = SubLFiles.defconstant( "*HTML-LINE-BREAK-CLEAR*", $str59$_clear_ );
    $html_line_break$ = SubLFiles.defconstant( "*HTML-LINE-BREAK*", $str60$_br_ );
    $html_paragraph_head$ = SubLFiles.defconstant( "*HTML-PARAGRAPH-HEAD*", $str61$_p_ );
    $html_paragraph_tail$ = SubLFiles.defconstant( "*HTML-PARAGRAPH-TAIL*", $str62$__p_ );
    $html_plaintext_head$ = SubLFiles.defconstant( "*HTML-PLAINTEXT-HEAD*", $str63$_plaintext_ );
    $html_plaintext_tail$ = SubLFiles.defconstant( "*HTML-PLAINTEXT-TAIL*", $str64$__plaintext_ );
    $html_preformatted_head$ = SubLFiles.defconstant( "*HTML-PREFORMATTED-HEAD*", $str65$_pre_ );
    $html_preformatted_tail$ = SubLFiles.defconstant( "*HTML-PREFORMATTED-TAIL*", $str66$__pre_ );
    $html_address_head$ = SubLFiles.defconstant( "*HTML-ADDRESS-HEAD*", $str67$_address_ );
    $html_address_tail$ = SubLFiles.defconstant( "*HTML-ADDRESS-TAIL*", $str68$__address_ );
    $html_big_head$ = SubLFiles.defconstant( "*HTML-BIG-HEAD*", $str69$_big_ );
    $html_big_tail$ = SubLFiles.defconstant( "*HTML-BIG-TAIL*", $str70$__big_ );
    $html_bold_head$ = SubLFiles.defconstant( "*HTML-BOLD-HEAD*", $str71$_b_ );
    $html_bold_tail$ = SubLFiles.defconstant( "*HTML-BOLD-TAIL*", $str72$__b_ );
    $html_cite_head$ = SubLFiles.defconstant( "*HTML-CITE-HEAD*", $str73$_cite_ );
    $html_cite_tail$ = SubLFiles.defconstant( "*HTML-CITE-TAIL*", $str74$__cite_ );
    $html_code_head$ = SubLFiles.defconstant( "*HTML-CODE-HEAD*", $str75$_code_ );
    $html_code_tail$ = SubLFiles.defconstant( "*HTML-CODE-TAIL*", $str76$__code_ );
    $html_definition_head$ = SubLFiles.defconstant( "*HTML-DEFINITION-HEAD*", $str77$_dfn_ );
    $html_definition_tail$ = SubLFiles.defconstant( "*HTML-DEFINITION-TAIL*", $str78$__dfn_ );
    $html_emphasized_head$ = SubLFiles.defconstant( "*HTML-EMPHASIZED-HEAD*", $str79$_em_ );
    $html_emphasized_tail$ = SubLFiles.defconstant( "*HTML-EMPHASIZED-TAIL*", $str80$__em_ );
    $html_font_head$ = SubLFiles.defconstant( "*HTML-FONT-HEAD*", $str81$_font );
    $html_font_tail$ = SubLFiles.defconstant( "*HTML-FONT-TAIL*", $str82$__font_ );
    $html_font_size$ = SubLFiles.defconstant( "*HTML-FONT-SIZE*", $str54$_size_ );
    $html_font_color$ = SubLFiles.defconstant( "*HTML-FONT-COLOR*", $str83$_color_ );
    $html_font_face$ = SubLFiles.defconstant( "*HTML-FONT-FACE*", $str84$_face_ );
    $html_italic_head$ = SubLFiles.defconstant( "*HTML-ITALIC-HEAD*", $str85$_i_ );
    $html_italic_tail$ = SubLFiles.defconstant( "*HTML-ITALIC-TAIL*", $str86$__i_ );
    $html_keyboard_head$ = SubLFiles.defconstant( "*HTML-KEYBOARD-HEAD*", $str87$_kbd_ );
    $html_keyboard_tail$ = SubLFiles.defconstant( "*HTML-KEYBOARD-TAIL*", $str88$__kbd_ );
    $html_sample_head$ = SubLFiles.defconstant( "*HTML-SAMPLE-HEAD*", $str89$_samp_ );
    $html_sample_tail$ = SubLFiles.defconstant( "*HTML-SAMPLE-TAIL*", $str90$__samp_ );
    $html_small_head$ = SubLFiles.defconstant( "*HTML-SMALL-HEAD*", $str91$_small_ );
    $html_small_tail$ = SubLFiles.defconstant( "*HTML-SMALL-TAIL*", $str92$__small_ );
    $html_strikethrough_head$ = SubLFiles.defconstant( "*HTML-STRIKETHROUGH-HEAD*", $str93$_strike_ );
    $html_strikethrough_tail$ = SubLFiles.defconstant( "*HTML-STRIKETHROUGH-TAIL*", $str94$__strike_ );
    $html_strong_head$ = SubLFiles.defconstant( "*HTML-STRONG-HEAD*", $str95$_strong_ );
    $html_strong_tail$ = SubLFiles.defconstant( "*HTML-STRONG-TAIL*", $str96$__strong_ );
    $html_subscript_head$ = SubLFiles.defconstant( "*HTML-SUBSCRIPT-HEAD*", $str97$_sub_ );
    $html_subscript_tail$ = SubLFiles.defconstant( "*HTML-SUBSCRIPT-TAIL*", $str98$__sub_ );
    $html_superscript_head$ = SubLFiles.defconstant( "*HTML-SUPERSCRIPT-HEAD*", $str99$_sup_ );
    $html_superscript_tail$ = SubLFiles.defconstant( "*HTML-SUPERSCRIPT-TAIL*", $str100$__sup_ );
    $html_teletype_head$ = SubLFiles.defconstant( "*HTML-TELETYPE-HEAD*", $str101$_tt_ );
    $html_teletype_tail$ = SubLFiles.defconstant( "*HTML-TELETYPE-TAIL*", $str102$__tt_ );
    $html_underlined_head$ = SubLFiles.defconstant( "*HTML-UNDERLINED-HEAD*", $str103$_u_ );
    $html_underlined_tail$ = SubLFiles.defconstant( "*HTML-UNDERLINED-TAIL*", $str104$__u_ );
    $html_variable_head$ = SubLFiles.defconstant( "*HTML-VARIABLE-HEAD*", $str105$_var_ );
    $html_variable_tail$ = SubLFiles.defconstant( "*HTML-VARIABLE-TAIL*", $str106$__var_ );
    $html_label_head$ = SubLFiles.defconstant( "*HTML-LABEL-HEAD*", $str107$_label );
    $html_label_tail$ = SubLFiles.defconstant( "*HTML-LABEL-TAIL*", $str108$__label_ );
    $html_label_access_key$ = SubLFiles.defconstant( "*HTML-LABEL-ACCESS-KEY*", $str109$_accesskey_ );
    $html_label_for$ = SubLFiles.defconstant( "*HTML-LABEL-FOR*", $str110$_for_ );
    $html_style_font_size_smaller$ = SubLFiles.defconstant( "*HTML-STYLE-FONT-SIZE-SMALLER*", $str111$font_size__smaller );
    $html_style_font_size_larger$ = SubLFiles.defconstant( "*HTML-STYLE-FONT-SIZE-LARGER*", $str112$font_size__larger );
    $html_definition_list_head$ = SubLFiles.defconstant( "*HTML-DEFINITION-LIST-HEAD*", $str113$_dl );
    $html_definition_list_tail$ = SubLFiles.defconstant( "*HTML-DEFINITION-LIST-TAIL*", $str114$__dl_ );
    $html_definition_list_term_head$ = SubLFiles.defconstant( "*HTML-DEFINITION-LIST-TERM-HEAD*", $str115$_dt_ );
    $html_definition_list_term_tail$ = SubLFiles.defconstant( "*HTML-DEFINITION-LIST-TERM-TAIL*", $str116$__dt_ );
    $html_definition_list_def_head$ = SubLFiles.defconstant( "*HTML-DEFINITION-LIST-DEF-HEAD*", $str117$_dd_ );
    $html_definition_list_def_tail$ = SubLFiles.defconstant( "*HTML-DEFINITION-LIST-DEF-TAIL*", $str118$__dd_ );
    $html_directory_list_head$ = SubLFiles.defconstant( "*HTML-DIRECTORY-LIST-HEAD*", $str119$_dir );
    $html_directory_list_tail$ = SubLFiles.defconstant( "*HTML-DIRECTORY-LIST-TAIL*", $str120$__dir_ );
    $html_menu_list_head$ = SubLFiles.defconstant( "*HTML-MENU-LIST-HEAD*", $str121$_menu );
    $html_menu_list_tail$ = SubLFiles.defconstant( "*HTML-MENU-LIST-TAIL*", $str122$__menu_ );
    $html_ordered_list_head$ = SubLFiles.defconstant( "*HTML-ORDERED-LIST-HEAD*", $str123$_ol );
    $html_ordered_list_tail$ = SubLFiles.defconstant( "*HTML-ORDERED-LIST-TAIL*", $str124$__ol_ );
    $html_unordered_list_head$ = SubLFiles.defconstant( "*HTML-UNORDERED-LIST-HEAD*", $str125$_ul );
    $html_unordered_list_tail$ = SubLFiles.defconstant( "*HTML-UNORDERED-LIST-TAIL*", $str126$__ul_ );
    $html_list_compact$ = SubLFiles.defconstant( "*HTML-LIST-COMPACT*", $str127$_compact );
    $html_list_continue$ = SubLFiles.defconstant( "*HTML-LIST-CONTINUE*", $str128$_continue );
    $html_list_dingbat$ = SubLFiles.defconstant( "*HTML-LIST-DINGBAT*", $str129$_dingbat_ );
    $html_list_plain$ = SubLFiles.defconstant( "*HTML-LIST-PLAIN*", $str130$_plain );
    $html_list_seqnum$ = SubLFiles.defconstant( "*HTML-LIST-SEQNUM*", $str131$_seqnum_ );
    $html_list_src$ = SubLFiles.defconstant( "*HTML-LIST-SRC*", $str132$_src_ );
    $html_list_start$ = SubLFiles.defconstant( "*HTML-LIST-START*", $str133$_start_ );
    $html_list_type$ = SubLFiles.defconstant( "*HTML-LIST-TYPE*", $str41$_type_ );
    $html_valid_list_types$ = SubLFiles.defconstant( "*HTML-VALID-LIST-TYPES*", $list134 );
    $html_list_item_head$ = SubLFiles.defconstant( "*HTML-LIST-ITEM-HEAD*", $str135$_li );
    $html_list_item_tail$ = SubLFiles.defconstant( "*HTML-LIST-ITEM-TAIL*", $str136$__li_ );
    $html_list_item_dingbat$ = SubLFiles.defconstant( "*HTML-LIST-ITEM-DINGBAT*", $str129$_dingbat_ );
    $html_list_item_skip$ = SubLFiles.defconstant( "*HTML-LIST-ITEM-SKIP*", $str137$_skip_ );
    $html_list_item_src$ = SubLFiles.defconstant( "*HTML-LIST-ITEM-SRC*", $str132$_src_ );
    $html_list_item_id$ = SubLFiles.defconstant( "*HTML-LIST-ITEM-ID*", $str23$_id_ );
    $html_list_item_type$ = SubLFiles.defconstant( "*HTML-LIST-ITEM-TYPE*", $str41$_type_ );
    $html_summary_head$ = SubLFiles.defconstant( "*HTML-SUMMARY-HEAD*", $str138$_summary );
    $html_summary_tail$ = SubLFiles.defconstant( "*HTML-SUMMARY-TAIL*", $str139$__summary_ );
    $html_details_head$ = SubLFiles.defconstant( "*HTML-DETAILS-HEAD*", $str140$_details );
    $html_details_tail$ = SubLFiles.defconstant( "*HTML-DETAILS-TAIL*", $str141$__details_ );
    $html_form_head$ = SubLFiles.defconstant( "*HTML-FORM-HEAD*", $str142$_form );
    $html_form_tail$ = SubLFiles.defconstant( "*HTML-FORM-TAIL*", $str143$__form_ );
    $html_form_action$ = SubLFiles.defconstant( "*HTML-FORM-ACTION*", $str144$_action_ );
    $html_form_method$ = SubLFiles.defconstant( "*HTML-FORM-METHOD*", $str145$_method_ );
    $html_form_target$ = SubLFiles.defconstant( "*HTML-FORM-TARGET*", $str146$_target_ );
    $html_form_name$ = SubLFiles.defconstant( "*HTML-FORM-NAME*", $str34$_name_ );
    $html_form_enctype$ = SubLFiles.defconstant( "*HTML-FORM-ENCTYPE*", $str147$_enctype_ );
    $html_form_method_get$ = SubLFiles.defconstant( "*HTML-FORM-METHOD-GET*", $str148$get );
    $html_form_method_post$ = SubLFiles.defconstant( "*HTML-FORM-METHOD-POST*", $str149$post );
    $html_blank_target$ = SubLFiles.defconstant( "*HTML-BLANK-TARGET*", $str150$_blank );
    $html_self_target$ = SubLFiles.defconstant( "*HTML-SELF-TARGET*", $str151$_self );
    $html_parent_target$ = SubLFiles.defconstant( "*HTML-PARENT-TARGET*", $str152$_parent );
    $html_top_target$ = SubLFiles.defconstant( "*HTML-TOP-TARGET*", $str153$_top );
    $html_input_head$ = SubLFiles.defconstant( "*HTML-INPUT-HEAD*", $str154$_input );
    $html_input_checked$ = SubLFiles.defconstant( "*HTML-INPUT-CHECKED*", $str155$_checked );
    $html_input_readonly$ = SubLFiles.defconstant( "*HTML-INPUT-READONLY*", $str156$_readonly );
    $html_input_disabled$ = SubLFiles.defconstant( "*HTML-INPUT-DISABLED*", $str157$_disabled );
    $html_input_disabledP$ = SubLFiles.defvar( "*HTML-INPUT-DISABLED?*", NIL );
    $html_input_maxlength$ = SubLFiles.defconstant( "*HTML-INPUT-MAXLENGTH*", $str158$_maxlength_ );
    $html_input_align$ = SubLFiles.defconstant( "*HTML-INPUT-ALIGN*", $str16$_align_ );
    $html_input_border$ = SubLFiles.defconstant( "*HTML-INPUT-BORDER*", $str159$_border_ );
    $html_input_min$ = SubLFiles.defconstant( "*HTML-INPUT-MIN*", $str160$_min_ );
    $html_input_max$ = SubLFiles.defconstant( "*HTML-INPUT-MAX*", $str161$_max_ );
    $html_input_step$ = SubLFiles.defconstant( "*HTML-INPUT-STEP*", $str162$_step_ );
    $html_input_name$ = SubLFiles.defconstant( "*HTML-INPUT-NAME*", $str34$_name_ );
    $html_input_size$ = SubLFiles.defconstant( "*HTML-INPUT-SIZE*", $str54$_size_ );
    $html_input_src$ = SubLFiles.defconstant( "*HTML-INPUT-SRC*", $str132$_src_ );
    $html_input_type$ = SubLFiles.defconstant( "*HTML-INPUT-TYPE*", $str41$_type_ );
    $html_input_style$ = SubLFiles.defconstant( "*HTML-INPUT-STYLE*", $str6$_style_ );
    $html_input_value$ = SubLFiles.defconstant( "*HTML-INPUT-VALUE*", $str163$_value_ );
    $html_input_alt$ = SubLFiles.defconstant( "*HTML-INPUT-ALT*", $str164$_alt_ );
    $html_input_checkbox$ = SubLFiles.defconstant( "*HTML-INPUT-CHECKBOX*", $str165$checkbox );
    $html_input_button$ = SubLFiles.defconstant( "*HTML-INPUT-BUTTON*", $str166$button );
    $html_input_hidden$ = SubLFiles.defconstant( "*HTML-INPUT-HIDDEN*", $str167$hidden );
    $html_input_image$ = SubLFiles.defconstant( "*HTML-INPUT-IMAGE*", $str168$image );
    $html_input_password$ = SubLFiles.defconstant( "*HTML-INPUT-PASSWORD*", $str169$password );
    $html_input_radio$ = SubLFiles.defconstant( "*HTML-INPUT-RADIO*", $str170$radio );
    $html_input_range$ = SubLFiles.defconstant( "*HTML-INPUT-RANGE*", $str171$range );
    $html_input_reset$ = SubLFiles.defconstant( "*HTML-INPUT-RESET*", $str172$reset );
    $html_input_submit$ = SubLFiles.defconstant( "*HTML-INPUT-SUBMIT*", $str173$submit );
    $html_input_text$ = SubLFiles.defconstant( "*HTML-INPUT-TEXT*", $str174$text );
    $html_select_head$ = SubLFiles.defconstant( "*HTML-SELECT-HEAD*", $str175$_select );
    $html_select_tail$ = SubLFiles.defconstant( "*HTML-SELECT-TAIL*", $str176$__select_ );
    $html_select_name$ = SubLFiles.defconstant( "*HTML-SELECT-NAME*", $str34$_name_ );
    $html_select_size$ = SubLFiles.defconstant( "*HTML-SELECT-SIZE*", $str54$_size_ );
    $html_select_multiple$ = SubLFiles.defconstant( "*HTML-SELECT-MULTIPLE*", $str177$_multiple );
    $html_select_onchange$ = SubLFiles.defconstant( "*HTML-SELECT-ONCHANGE*", $str178$_onChange_ );
    $html_option_head$ = SubLFiles.defconstant( "*HTML-OPTION-HEAD*", $str179$_option );
    $html_option_tail$ = SubLFiles.defconstant( "*HTML-OPTION-TAIL*", $str180$ );
    $html_option_value$ = SubLFiles.defconstant( "*HTML-OPTION-VALUE*", $str163$_value_ );
    $html_option_selected$ = SubLFiles.defconstant( "*HTML-OPTION-SELECTED*", $str181$_selected );
    $html_optgroup_head$ = SubLFiles.defconstant( "*HTML-OPTGROUP-HEAD*", $str182$_optgroup );
    $html_optgroup_tail$ = SubLFiles.defconstant( "*HTML-OPTGROUP-TAIL*", $str183$__optgroup_ );
    $html_optgroup_label$ = SubLFiles.defconstant( "*HTML-OPTGROUP-LABEL*", $str184$_label_ );
    $html_select_src$ = SubLFiles.defconstant( "*HTML-SELECT-SRC*", $str132$_src_ );
    $html_select_width$ = SubLFiles.defconstant( "*HTML-SELECT-WIDTH*", $str55$_width_ );
    $html_select_height$ = SubLFiles.defconstant( "*HTML-SELECT-HEIGHT*", $str185$_height_ );
    $html_select_units$ = SubLFiles.defconstant( "*HTML-SELECT-UNITS*", $str186$_units_ );
    $html_option_shape$ = SubLFiles.defconstant( "*HTML-OPTION-SHAPE*", $str187$_shape_ );
    $html_textarea_head$ = SubLFiles.defconstant( "*HTML-TEXTAREA-HEAD*", $str188$_textarea );
    $html_textarea_tail$ = SubLFiles.defconstant( "*HTML-TEXTAREA-TAIL*", $str189$__textarea_ );
    $html_textarea_name$ = SubLFiles.defconstant( "*HTML-TEXTAREA-NAME*", $str34$_name_ );
    $html_textarea_rows$ = SubLFiles.defconstant( "*HTML-TEXTAREA-ROWS*", $str190$_rows_ );
    $html_textarea_cols$ = SubLFiles.defconstant( "*HTML-TEXTAREA-COLS*", $str191$_cols_ );
    $html_textarea_id$ = SubLFiles.defconstant( "*HTML-TEXTAREA-ID*", $str23$_id_ );
    $html_textarea_style$ = SubLFiles.defconstant( "*HTML-TEXTAREA-STYLE*", $str6$_style_ );
    $html_caption_head$ = SubLFiles.defconstant( "*HTML-CAPTION-HEAD*", $str192$_caption );
    $html_caption_tail$ = SubLFiles.defconstant( "*HTML-CAPTION-TAIL*", $str193$__caption_ );
    $html_caption_align$ = SubLFiles.defconstant( "*HTML-CAPTION-ALIGN*", $str16$_align_ );
    $html_table_head$ = SubLFiles.defconstant( "*HTML-TABLE-HEAD*", $str194$_table );
    $html_table_tail$ = SubLFiles.defconstant( "*HTML-TABLE-TAIL*", $str195$__table_ );
    $html_table_noflow$ = SubLFiles.defconstant( "*HTML-TABLE-NOFLOW*", $str196$_noflow );
    $html_table_nowrap$ = SubLFiles.defconstant( "*HTML-TABLE-NOWRAP*", $str197$_nowrap );
    $html_table_wrap$ = SubLFiles.defconstant( "*HTML-TABLE-WRAP*", $str198$_wrap_ );
    $html_table_align$ = SubLFiles.defconstant( "*HTML-TABLE-ALIGN*", $str16$_align_ );
    $html_table_border$ = SubLFiles.defconstant( "*HTML-TABLE-BORDER*", $str159$_border_ );
    $html_table_bordercolor$ = SubLFiles.defconstant( "*HTML-TABLE-BORDERCOLOR*", $str199$_bordercolor_ );
    $html_table_cellpadding$ = SubLFiles.defconstant( "*HTML-TABLE-CELLPADDING*", $str200$_cellpadding_ );
    $html_table_cellspacing$ = SubLFiles.defconstant( "*HTML-TABLE-CELLSPACING*", $str201$_cellspacing_ );
    $html_table_colspec$ = SubLFiles.defconstant( "*HTML-TABLE-COLSPEC*", $str202$_colspec_ );
    $html_table_units$ = SubLFiles.defconstant( "*HTML-TABLE-UNITS*", $str186$_units_ );
    $html_table_bgcolor$ = SubLFiles.defconstant( "*HTML-TABLE-BGCOLOR*", $str3$_bgcolor_ );
    $html_table_width$ = SubLFiles.defconstant( "*HTML-TABLE-WIDTH*", $str55$_width_ );
    $html_table_background$ = SubLFiles.defconstant( "*HTML-TABLE-BACKGROUND*", $str4$_background_ );
    $html_table_thead_head$ = SubLFiles.defconstant( "*HTML-TABLE-THEAD-HEAD*", $str203$_thead );
    $html_table_thead_tail$ = SubLFiles.defconstant( "*HTML-TABLE-THEAD-TAIL*", $str204$__thead_ );
    $html_table_tfoot_head$ = SubLFiles.defconstant( "*HTML-TABLE-TFOOT-HEAD*", $str205$_tfoot );
    $html_table_tfoot_tail$ = SubLFiles.defconstant( "*HTML-TABLE-TFOOT-TAIL*", $str206$__tfoot_ );
    $html_table_tbody_head$ = SubLFiles.defconstant( "*HTML-TABLE-TBODY-HEAD*", $str207$_tbody );
    $html_table_tbody_tail$ = SubLFiles.defconstant( "*HTML-TABLE-TBODY-TAIL*", $str208$__tbody_ );
    $html_table_data_head$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-HEAD*", $str209$_td );
    $html_table_data_tail$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-TAIL*", $str210$__td_ );
    $html_table_header_head$ = SubLFiles.defconstant( "*HTML-TABLE-HEADER-HEAD*", $str211$_th );
    $html_table_header_tail$ = SubLFiles.defconstant( "*HTML-TABLE-HEADER-TAIL*", $str212$__th_ );
    $html_table_row_head$ = SubLFiles.defconstant( "*HTML-TABLE-ROW-HEAD*", $str213$_tr );
    $html_table_row_tail$ = SubLFiles.defconstant( "*HTML-TABLE-ROW-TAIL*", $str214$__tr_ );
    $html_table_row_bgcolor$ = SubLFiles.defconstant( "*HTML-TABLE-ROW-BGCOLOR*", $str3$_bgcolor_ );
    $html_table_row_height$ = SubLFiles.defconstant( "*HTML-TABLE-ROW-HEIGHT*", $str185$_height_ );
    $html_table_row_title$ = SubLFiles.defconstant( "*HTML-TABLE-ROW-TITLE*", $str15$_title_ );
    $html_table_row_name$ = SubLFiles.defconstant( "*HTML-TABLE-ROW-NAME*", $str34$_name_ );
    $html_table_data_nowrap$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-NOWRAP*", $str197$_nowrap );
    $html_table_data_align$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-ALIGN*", $str16$_align_ );
    $html_table_data_colspan$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-COLSPAN*", $str215$_colspan_ );
    $html_table_data_rowspan$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-ROWSPAN*", $str216$_rowspan_ );
    $html_table_data_valign$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-VALIGN*", $str217$_valign_ );
    $html_table_data_bgcolor$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-BGCOLOR*", $str3$_bgcolor_ );
    $html_table_data_width$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-WIDTH*", $str55$_width_ );
    $html_table_data_height$ = SubLFiles.defconstant( "*HTML-TABLE-DATA-HEIGHT*", $str185$_height_ );
    $html_atomic_tail$ = SubLFiles.defconstant( "*HTML-ATOMIC-TAIL*", $str218$__ );
    $html_protocol_mailto$ = SubLFiles.defconstant( "*HTML-PROTOCOL-MAILTO*", $str219$mailto_ );
    $html_protocol_file$ = SubLFiles.defconstant( "*HTML-PROTOCOL-FILE*", $str220$file_ );
    $html_protocol_ftp$ = SubLFiles.defconstant( "*HTML-PROTOCOL-FTP*", $str221$ftp_ );
    $html_anchor_head$ = SubLFiles.defconstant( "*HTML-ANCHOR-HEAD*", $str222$_a );
    $html_anchor_tail$ = SubLFiles.defconstant( "*HTML-ANCHOR-TAIL*", $str223$__a_ );
    $html_anchor_href$ = SubLFiles.defconstant( "*HTML-ANCHOR-HREF*", $str42$_href_ );
    $html_anchor_name$ = SubLFiles.defconstant( "*HTML-ANCHOR-NAME*", $str34$_name_ );
    $html_anchor_id$ = SubLFiles.defconstant( "*HTML-ANCHOR-ID*", $str23$_id_ );
    $html_anchor_title$ = SubLFiles.defconstant( "*HTML-ANCHOR-TITLE*", $str15$_title_ );
    $html_anchor_target$ = SubLFiles.defconstant( "*HTML-ANCHOR-TARGET*", $str146$_target_ );
    $html_anchor_style$ = SubLFiles.defconstant( "*HTML-ANCHOR-STYLE*", $str6$_style_ );
    $html_anchor_onmouseover$ = SubLFiles.defconstant( "*HTML-ANCHOR-ONMOUSEOVER*", $str224$_onmouseover_ );
    $html_anchor_onmouseout$ = SubLFiles.defconstant( "*HTML-ANCHOR-ONMOUSEOUT*", $str225$_onmouseout_ );
    $html_anchor_onmouseup$ = SubLFiles.defconstant( "*HTML-ANCHOR-ONMOUSEUP*", $str226$_onmouseup_ );
    $html_anchor_onmousedown$ = SubLFiles.defconstant( "*HTML-ANCHOR-ONMOUSEDOWN*", $str227$_onmousedown_ );
    $html_area_head$ = SubLFiles.defconstant( "*HTML-AREA-HEAD*", $str228$_area );
    $html_area_nohref$ = SubLFiles.defconstant( "*HTML-AREA-NOHREF*", $str229$_nohref );
    $html_area_alt$ = SubLFiles.defconstant( "*HTML-AREA-ALT*", $str164$_alt_ );
    $html_area_co_ords$ = SubLFiles.defconstant( "*HTML-AREA-CO-ORDS*", $str230$_co_ords_ );
    $html_area_href$ = SubLFiles.defconstant( "*HTML-AREA-HREF*", $str42$_href_ );
    $html_area_shape$ = SubLFiles.defconstant( "*HTML-AREA-SHAPE*", $str187$_shape_ );
    $html_area_target$ = SubLFiles.defconstant( "*HTML-AREA-TARGET*", $str146$_target_ );
    $html_basefont_head$ = SubLFiles.defconstant( "*HTML-BASEFONT-HEAD*", $str231$_basefont );
    $html_basefont_size$ = SubLFiles.defconstant( "*HTML-BASEFONT-SIZE*", $str54$_size_ );
    $html_basefont_color$ = SubLFiles.defconstant( "*HTML-BASEFONT-COLOR*", $str83$_color_ );
    $html_blink_head$ = SubLFiles.defconstant( "*HTML-BLINK-HEAD*", $str232$_blink_ );
    $html_blink_tail$ = SubLFiles.defconstant( "*HTML-BLINK-TAIL*", $str233$__blink_ );
    $html_comment_head$ = SubLFiles.defconstant( "*HTML-COMMENT-HEAD*", $str234$____ );
    $html_comment_tail$ = SubLFiles.defconstant( "*HTML-COMMENT-TAIL*", $str235$___ );
    $html_frame_head$ = SubLFiles.defconstant( "*HTML-FRAME-HEAD*", $str236$_frame );
    $html_frame_frameborder$ = SubLFiles.defconstant( "*HTML-FRAME-FRAMEBORDER*", $str237$_frameborder_ );
    $html_frame_noresize$ = SubLFiles.defconstant( "*HTML-FRAME-NORESIZE*", $str238$_noresize );
    $html_frame_marginheight$ = SubLFiles.defconstant( "*HTML-FRAME-MARGINHEIGHT*", $str239$_marginheight_ );
    $html_frame_marginwidth$ = SubLFiles.defconstant( "*HTML-FRAME-MARGINWIDTH*", $str240$_marginwidth_ );
    $html_frame_name$ = SubLFiles.defconstant( "*HTML-FRAME-NAME*", $str34$_name_ );
    $html_frame_scrolling$ = SubLFiles.defconstant( "*HTML-FRAME-SCROLLING*", $str241$_scrolling_ );
    $html_frame_src$ = SubLFiles.defconstant( "*HTML-FRAME-SRC*", $str132$_src_ );
    $html_frameset_head$ = SubLFiles.defconstant( "*HTML-FRAMESET-HEAD*", $str242$_frameset );
    $html_frameset_tail$ = SubLFiles.defconstant( "*HTML-FRAMESET-TAIL*", $str243$__frameset_ );
    $html_frameset_cols$ = SubLFiles.defconstant( "*HTML-FRAMESET-COLS*", $str191$_cols_ );
    $html_frameset_rows$ = SubLFiles.defconstant( "*HTML-FRAMESET-ROWS*", $str190$_rows_ );
    $html_frameset_frameborder$ = SubLFiles.defconstant( "*HTML-FRAMESET-FRAMEBORDER*", $str237$_frameborder_ );
    $html_iframe_head$ = SubLFiles.defconstant( "*HTML-IFRAME-HEAD*", $str244$_iframe );
    $html_iframe_tail$ = SubLFiles.defconstant( "*HTML-IFRAME-TAIL*", $str245$__iframe_ );
    $html_iframe_align$ = SubLFiles.defconstant( "*HTML-IFRAME-ALIGN*", $str16$_align_ );
    $html_iframe_frameborder$ = SubLFiles.defconstant( "*HTML-IFRAME-FRAMEBORDER*", $str237$_frameborder_ );
    $html_iframe_height$ = SubLFiles.defconstant( "*HTML-IFRAME-HEIGHT*", $str185$_height_ );
    $html_iframe_marginheight$ = SubLFiles.defconstant( "*HTML-IFRAME-MARGINHEIGHT*", $str239$_marginheight_ );
    $html_iframe_marginwidth$ = SubLFiles.defconstant( "*HTML-IFRAME-MARGINWIDTH*", $str240$_marginwidth_ );
    $html_iframe_name$ = SubLFiles.defconstant( "*HTML-IFRAME-NAME*", $str34$_name_ );
    $html_iframe_scrolling$ = SubLFiles.defconstant( "*HTML-IFRAME-SCROLLING*", $str241$_scrolling_ );
    $html_iframe_src$ = SubLFiles.defconstant( "*HTML-IFRAME-SRC*", $str132$_src_ );
    $html_iframe_width$ = SubLFiles.defconstant( "*HTML-IFRAME-WIDTH*", $str55$_width_ );
    $html_image_head$ = SubLFiles.defconstant( "*HTML-IMAGE-HEAD*", $str246$_img );
    $html_image_tail$ = SubLFiles.defconstant( "*HTML-IMAGE-TAIL*", $str247$__img_ );
    $html_image_name$ = SubLFiles.defconstant( "*HTML-IMAGE-NAME*", $str34$_name_ );
    $html_image_ismap$ = SubLFiles.defconstant( "*HTML-IMAGE-ISMAP*", $str248$_ismap );
    $html_image_height$ = SubLFiles.defconstant( "*HTML-IMAGE-HEIGHT*", $str185$_height_ );
    $html_image_width$ = SubLFiles.defconstant( "*HTML-IMAGE-WIDTH*", $str55$_width_ );
    $html_image_alt$ = SubLFiles.defconstant( "*HTML-IMAGE-ALT*", $str164$_alt_ );
    $html_image_align$ = SubLFiles.defconstant( "*HTML-IMAGE-ALIGN*", $str16$_align_ );
    $html_image_border$ = SubLFiles.defconstant( "*HTML-IMAGE-BORDER*", $str159$_border_ );
    $html_image_src$ = SubLFiles.defconstant( "*HTML-IMAGE-SRC*", $str132$_src_ );
    $html_image_style$ = SubLFiles.defconstant( "*HTML-IMAGE-STYLE*", $str6$_style_ );
    $html_applet_head$ = SubLFiles.defconstant( "*HTML-APPLET-HEAD*", $str249$_applet_ );
    $html_applet_tail$ = SubLFiles.defconstant( "*HTML-APPLET-TAIL*", $str250$__applet_ );
    $html_applet_code$ = SubLFiles.defconstant( "*HTML-APPLET-CODE*", $str251$_code_ );
    $html_applet_codebase$ = SubLFiles.defconstant( "*HTML-APPLET-CODEBASE*", $str252$_codebase_ );
    $html_applet_archive$ = SubLFiles.defconstant( "*HTML-APPLET-ARCHIVE*", $str253$_archive_ );
    $html_applet_alt$ = SubLFiles.defconstant( "*HTML-APPLET-ALT*", $str164$_alt_ );
    $html_applet_align$ = SubLFiles.defconstant( "*HTML-APPLET-ALIGN*", $str16$_align_ );
    $html_applet_name$ = SubLFiles.defconstant( "*HTML-APPLET-NAME*", $str34$_name_ );
    $html_applet_id$ = SubLFiles.defconstant( "*HTML-APPLET-ID*", $str23$_id_ );
    $html_applet_height$ = SubLFiles.defconstant( "*HTML-APPLET-HEIGHT*", $str185$_height_ );
    $html_applet_width$ = SubLFiles.defconstant( "*HTML-APPLET-WIDTH*", $str55$_width_ );
    $html_param_head$ = SubLFiles.defconstant( "*HTML-PARAM-HEAD*", $str254$_param_ );
    $html_param_name$ = SubLFiles.defconstant( "*HTML-PARAM-NAME*", $str34$_name_ );
    $html_param_value$ = SubLFiles.defconstant( "*HTML-PARAM-VALUE*", $str163$_value_ );
    $html_map_head$ = SubLFiles.defconstant( "*HTML-MAP-HEAD*", $str255$_map );
    $html_map_tail$ = SubLFiles.defconstant( "*HTML-MAP-TAIL*", $str256$__map_ );
    $html_map_name$ = SubLFiles.defconstant( "*HTML-MAP-NAME*", $str34$_name_ );
    $html_no_break_head$ = SubLFiles.defconstant( "*HTML-NO-BREAK-HEAD*", $str257$_nobr_ );
    $html_no_break_tail$ = SubLFiles.defconstant( "*HTML-NO-BREAK-TAIL*", $str258$__nobr_ );
    $html_no_frames_head$ = SubLFiles.defconstant( "*HTML-NO-FRAMES-HEAD*", $str259$_noframes_ );
    $html_no_frames_tail$ = SubLFiles.defconstant( "*HTML-NO-FRAMES-TAIL*", $str260$__noframes_ );
    $html_object_head$ = SubLFiles.defconstant( "*HTML-OBJECT-HEAD*", $str261$_object_ );
    $html_object_tail$ = SubLFiles.defconstant( "*HTML-OBJECT-TAIL*", $str262$__object_ );
    $html_object_classid$ = SubLFiles.defconstant( "*HTML-OBJECT-CLASSID*", $str263$_classid_ );
    $html_object_codebase$ = SubLFiles.defconstant( "*HTML-OBJECT-CODEBASE*", $str252$_codebase_ );
    $html_object_codetype$ = SubLFiles.defconstant( "*HTML-OBJECT-CODETYPE*", $str264$_codetype_ );
    $html_object_data$ = SubLFiles.defconstant( "*HTML-OBJECT-DATA*", $str265$_data_ );
    $html_object_type$ = SubLFiles.defconstant( "*HTML-OBJECT-TYPE*", $str41$_type_ );
    $html_object_archive$ = SubLFiles.defconstant( "*HTML-OBJECT-ARCHIVE*", $str253$_archive_ );
    $html_object_id$ = SubLFiles.defconstant( "*HTML-OBJECT-ID*", $str23$_id_ );
    $html_object_class$ = SubLFiles.defconstant( "*HTML-OBJECT-CLASS*", $str5$_class_ );
    $html_object_align$ = SubLFiles.defconstant( "*HTML-OBJECT-ALIGN*", $str16$_align_ );
    $html_object_width$ = SubLFiles.defconstant( "*HTML-OBJECT-WIDTH*", $str55$_width_ );
    $html_object_height$ = SubLFiles.defconstant( "*HTML-OBJECT-HEIGHT*", $str185$_height_ );
    $html_object_border$ = SubLFiles.defconstant( "*HTML-OBJECT-BORDER*", $str159$_border_ );
    $html_object_hspace$ = SubLFiles.defconstant( "*HTML-OBJECT-HSPACE*", $str266$_hspace_ );
    $html_object_vspace$ = SubLFiles.defconstant( "*HTML-OBJECT-VSPACE*", $str267$_vspace_ );
    $html_script_head$ = SubLFiles.defconstant( "*HTML-SCRIPT-HEAD*", $str268$_script );
    $html_script_tail$ = SubLFiles.defconstant( "*HTML-SCRIPT-TAIL*", $str269$__script_ );
    $html_script_language$ = SubLFiles.defconstant( "*HTML-SCRIPT-LANGUAGE*", $str270$_language_ );
    $html_script_src$ = SubLFiles.defconstant( "*HTML-SCRIPT-SRC*", $str132$_src_ );
    $html_script_type$ = SubLFiles.defconstant( "*HTML-SCRIPT-TYPE*", $str41$_type_ );
    $html_script_javascript$ = SubLFiles.defconstant( "*HTML-SCRIPT-JAVASCRIPT*", $str271$JavaScript );
    $html_noscript_head$ = SubLFiles.defconstant( "*HTML-NOSCRIPT-HEAD*", $str272$_noscript );
    $html_noscript_tail$ = SubLFiles.defconstant( "*HTML-NOSCRIPT-TAIL*", $str273$__noscript_ );
    $html_word_break$ = SubLFiles.defconstant( "*HTML-WORD-BREAK*", $str274$_wbr_ );
    $html_color_white$ = SubLFiles.defconstant( "*HTML-COLOR-WHITE*", $str275$_ffffff );
    $html_color_black$ = SubLFiles.defconstant( "*HTML-COLOR-BLACK*", $str276$_000000 );
    $html_color_dark_grey$ = SubLFiles.defconstant( "*HTML-COLOR-DARK-GREY*", $str277$_999999 );
    $html_color_light_grey$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHT-GREY*", $str278$_cccccc );
    $html_color_lighter_grey$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHTER-GREY*", $str279$_dddddd );
    $html_color_lightest_grey$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHTEST-GREY*", $str280$_eeeeee );
    $html_color_yellowish_gray$ = SubLFiles.defconstant( "*HTML-COLOR-YELLOWISH-GRAY*", $str281$_eeeee4 );
    $html_color_sat_red$ = SubLFiles.defconstant( "*HTML-COLOR-SAT-RED*", $str282$_ff0000 );
    $html_color_dark_red$ = SubLFiles.defconstant( "*HTML-COLOR-DARK-RED*", $str283$_996666 );
    $html_color_medium_red$ = SubLFiles.defconstant( "*HTML-COLOR-MEDIUM-RED*", $str284$_ff8888 );
    $html_color_medium_dark_red$ = SubLFiles.defconstant( "*HTML-COLOR-MEDIUM-DARK-RED*", $str285$_cc0000 );
    $html_color_light_red$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHT-RED*", $str286$_eeaaaa );
    $html_color_lighter_red$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHTER-RED*", $str287$_ffbbbb );
    $html_color_sat_green$ = SubLFiles.defconstant( "*HTML-COLOR-SAT-GREEN*", $str288$_00ff00 );
    $html_color_dark_green$ = SubLFiles.defconstant( "*HTML-COLOR-DARK-GREEN*", $str289$_669966 );
    $html_color_darker_green$ = SubLFiles.defconstant( "*HTML-COLOR-DARKER-GREEN*", $str290$_335533 );
    $html_color_light_green$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHT-GREEN*", $str291$_aaeeaa );
    $html_color_lighter_green$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHTER-GREEN*", $str292$_bbffbb );
    $html_color_sat_blue$ = SubLFiles.defconstant( "*HTML-COLOR-SAT-BLUE*", $str293$_0000ff );
    $html_color_dark_blue$ = SubLFiles.defconstant( "*HTML-COLOR-DARK-BLUE*", $str294$_668899 );
    $html_color_light_blue$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHT-BLUE*", $str295$_aaccee );
    $html_color_lighter_blue$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHTER-BLUE*", $str296$_bbddff );
    $html_color_sat_yellow$ = SubLFiles.defconstant( "*HTML-COLOR-SAT-YELLOW*", $str297$_ffff00 );
    $html_color_dark_yellow$ = SubLFiles.defconstant( "*HTML-COLOR-DARK-YELLOW*", $str298$_999966 );
    $html_color_light_yellow$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHT-YELLOW*", $str299$_eeeeaa );
    $html_color_lighter_yellow$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHTER-YELLOW*", $str300$_ffffbb );
    $html_color_darker_purple$ = SubLFiles.defconstant( "*HTML-COLOR-DARKER-PURPLE*", $str301$_9900bb );
    $html_color_dark_purple$ = SubLFiles.defconstant( "*HTML-COLOR-DARK-PURPLE*", $str302$_996699 );
    $html_color_light_purple$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHT-PURPLE*", $str303$_ddbbff );
    $html_color_lighter_purple$ = SubLFiles.defconstant( "*HTML-COLOR-LIGHTER-PURPLE*", $str304$_eeccff );
    $html_color_cyan$ = SubLFiles.deflexical( "*HTML-COLOR-CYAN*", $str305$_00ffff );
    $html_color_light_cyan$ = SubLFiles.deflexical( "*HTML-COLOR-LIGHT-CYAN*", $str306$_e0ffff );
    $html_color_cyc_logo_violet$ = SubLFiles.deflexical( "*HTML-COLOR-CYC-LOGO-VIOLET*", $str307$_9933cc );
    $html_color_cyc_logo_light_violet$ = SubLFiles.deflexical( "*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*", $str308$_f0d3ff );
    $html_color_cyc_logo_lighter_violet$ = SubLFiles.deflexical( "*HTML-COLOR-CYC-LOGO-LIGHTER-VIOLET*", $str309$_f4e0ff );
    $html_color_cyc_logo_light_blue$ = SubLFiles.deflexical( "*HTML-COLOR-CYC-LOGO-LIGHT-BLUE*", $str310$_e0e5ff );
    $html_color_cyc_logo_lighter_blue$ = SubLFiles.deflexical( "*HTML-COLOR-CYC-LOGO-LIGHTER-BLUE*", $str311$_e6f0ff );
    $html_color_map$ = SubLFiles.defparameter( "*HTML-COLOR-MAP*", ConsesLow.list( new SubLObject[] { reader.bq_cons( $kw312$BLACK, $html_color_black$.getGlobalValue() ), reader.bq_cons( $kw313$BLUE,
        $html_color_sat_blue$.getGlobalValue() ), reader.bq_cons( $kw314$GREEN, $html_color_sat_green$.getGlobalValue() ), $list315, reader.bq_cons( $kw316$RED, $html_color_sat_red$.getGlobalValue() ), $list317, reader
            .bq_cons( $kw318$YELLOW, $html_color_sat_yellow$.getGlobalValue() ), reader.bq_cons( $kw319$WHITE, $html_color_white$.getGlobalValue() ), reader.bq_cons( $kw320$DARK_BLUE, $html_color_dark_blue$
                .getGlobalValue() ), $list321, reader.bq_cons( $kw322$LIGHTER_BLUE, $html_color_lighter_blue$.getGlobalValue() ), reader.bq_cons( $kw323$DARK_RED, $html_color_dark_red$.getGlobalValue() ), $list324,
      $list325, reader.bq_cons( $kw326$LIGHTER_RED, $html_color_lighter_red$.getGlobalValue() ), reader.bq_cons( $kw327$DARK_YELLOW, $html_color_dark_yellow$.getGlobalValue() ), $list328, reader.bq_cons(
          $kw329$LIGHTER_YELLOW, $html_color_lighter_yellow$.getGlobalValue() ), reader.bq_cons( $kw330$DARK_GRAY, $html_color_dark_grey$.getGlobalValue() ), $list331, reader.bq_cons( $kw332$LIGHT_GREY,
              $html_color_light_grey$.getGlobalValue() ), reader.bq_cons( $kw333$LIGHTER_GRAY, $html_color_lighter_grey$.getGlobalValue() ), reader.bq_cons( $kw334$LIGHTEST_GREY, $html_color_lightest_grey$
                  .getGlobalValue() ), reader.bq_cons( $kw335$DARK_PURPLE, $html_color_dark_purple$.getGlobalValue() ), reader.bq_cons( $kw336$LIGHT_PURPLE, $html_color_light_purple$.getGlobalValue() ), reader.bq_cons(
                      $kw337$LIGHTER_PURPLE, $html_color_lighter_purple$.getGlobalValue() )
    } ) );
    $html_alternating_class1$ = SubLFiles.defparameter( "*HTML-ALTERNATING-CLASS1*", $str338$cyc_alternate_class1 );
    $html_alternating_class2$ = SubLFiles.defparameter( "*HTML-ALTERNATING-CLASS2*", $str339$cyc_alternate_class2 );
    $html_known_dom_events$ = SubLFiles.defconstant( "*HTML-KNOWN-DOM-EVENTS*", $list340 );
    $basic_skin_class$ = SubLFiles.deflexical( "*BASIC-SKIN-CLASS*", $str341$yui_skin_sam );
    $html_escapes_map$ = SubLFiles.defparameter( "*HTML-ESCAPES-MAP*", $list342 );
    $html_prin1_string_escapes_map$ = SubLFiles.deflexical( "*HTML-PRIN1-STRING-ESCAPES-MAP*", $list343 );
    $html_escapes_map_for_showing_newlines$ = SubLFiles.deflexical( "*HTML-ESCAPES-MAP-FOR-SHOWING-NEWLINES*", $list344 );
    $html_safe_print$ = SubLFiles.defparameter( "*HTML-SAFE-PRINT*", T );
    $html_preserve_breaks$ = SubLFiles.defparameter( "*HTML-PRESERVE-BREAKS*", NIL );
    $html_inside_bodyP$ = SubLFiles.defparameter( "*HTML-INSIDE-BODY?*", NIL );
    $within_html_pre$ = SubLFiles.defparameter( "*WITHIN-HTML-PRE*", NIL );
    $suppress_html_source_readability_terpriP$ = SubLFiles.defparameter( "*SUPPRESS-HTML-SOURCE-READABILITY-TERPRI?*", NIL );
    $html_id_space_id_generator$ = SubLFiles.defparameter( "*HTML-ID-SPACE-ID-GENERATOR*", NIL );
    $html_form_field_uniquifier_code$ = SubLFiles.defparameter( "*HTML-FORM-FIELD-UNIQUIFIER-CODE*", NIL );
    $html_form_field_uniquifier_isg$ = SubLFiles.deflexical( "*HTML-FORM-FIELD-UNIQUIFIER-ISG*", ( maybeDefault( $sym624$_HTML_FORM_FIELD_UNIQUIFIER_ISG_, $html_form_field_uniquifier_isg$, NIL ) ) );
    $within_html_form$ = SubLFiles.defparameter( "*WITHIN-HTML-FORM*", NIL );
    $html_indent_table_max$ = SubLFiles.defparameter( "*HTML-INDENT-TABLE-MAX*", NIL );
    $html_handler_property$ = SubLFiles.deflexical( "*HTML-HANDLER-PROPERTY*", ( maybeDefault( $sym1022$_HTML_HANDLER_PROPERTY_, $html_handler_property$, $kw1023$HTML_HANDLER ) ) );
    $xml_handler_property$ = SubLFiles.deflexical( "*XML-HANDLER-PROPERTY*", ( maybeDefault( $sym1024$_XML_HANDLER_PROPERTY_, $xml_handler_property$, $kw1025$XML_HANDLER ) ) );
    $json_handler_property$ = SubLFiles.deflexical( "*JSON-HANDLER-PROPERTY*", ( maybeDefault( $sym1026$_JSON_HANDLER_PROPERTY_, $json_handler_property$, $kw1027$JSON_HANDLER ) ) );
    $handler_mime_types$ = SubLFiles.deflexical( "*HANDLER-MIME-TYPES*", maybeDefault( $sym1033$_HANDLER_MIME_TYPES_, $handler_mime_types$, () -> ( Hashtables.make_hash_table( $int1034$200, EQ, UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_html_macros_file()
  {
    utilities_macros.register_html_state_variable( $sym0$_HTML_DEFAULT_BGCOLOR_ );
    access_macros.register_macro_helper( $sym403$HTML_HEAD_CONTENT_TYPE, $sym404$HTML_HEAD );
    utilities_macros.register_html_state_variable( $sym616$_HTML_FORM_FIELD_UNIQUIFIER_CODE_ );
    access_macros.register_macro_helper( $sym617$WITH_HTML_UNIQUE_FORM_FIELDS, $sym618$HTML_FANCY_FORM );
    access_macros.register_macro_helper( $sym623$NEXT_HTML_FORM_FIELD_UNIQUIFIER_CODE, $sym617$WITH_HTML_UNIQUE_FORM_FIELDS );
    subl_macro_promotions.declare_defglobal( $sym624$_HTML_FORM_FIELD_UNIQUIFIER_ISG_ );
    access_macros.register_macro_helper( $sym625$EMBED_FORM_FIELD_CODE, $sym617$WITH_HTML_UNIQUE_FORM_FIELDS );
    access_macros.register_macro_helper( $sym622$GET_FORM_FIELD_CODE, $sym627$WITH_HTML_UNIQUE_FORM_FIELD_DECODING );
    access_macros.register_macro_helper( $sym922$HTML_EMBEDDED_IMAGE_DATA_SRC, $sym924$HTML_EMBEDDED_IMAGE );
    subl_macro_promotions.declare_defglobal( $sym1022$_HTML_HANDLER_PROPERTY_ );
    subl_macro_promotions.declare_defglobal( $sym1024$_XML_HANDLER_PROPERTY_ );
    subl_macro_promotions.declare_defglobal( $sym1026$_JSON_HANDLER_PROPERTY_ );
    access_macros.register_macro_helper( $sym1031$NOTE_CGI_HANDLER_FUNCTION, $sym1032$DEFINE_HTML_HANDLER );
    subl_macro_promotions.declare_defglobal( $sym1033$_HANDLER_MIME_TYPES_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_html_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_html_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_html_macros_file();
  }
  static
  {
    me = new html_macros();
    $html_stream$ = null;
    $html_default_bgcolor$ = null;
    $html_force_ie_standards_mode$ = null;
    $html_body_head$ = null;
    $html_body_tail$ = null;
    $html_body_bgcolor$ = null;
    $html_body_background$ = null;
    $html_body_class$ = null;
    $html_body_style$ = null;
    $html_body_text$ = null;
    $html_body_link$ = null;
    $html_body_alink$ = null;
    $html_body_vlink$ = null;
    $html_body_onload$ = null;
    $html_body_onresize$ = null;
    $html_div_head$ = null;
    $html_div_tail$ = null;
    $html_div_class$ = null;
    $html_div_style$ = null;
    $html_div_title$ = null;
    $html_div_align$ = null;
    $html_div_onload$ = null;
    $html_span_head$ = null;
    $html_span_tail$ = null;
    $html_span_class$ = null;
    $html_span_style$ = null;
    $html_head_head$ = null;
    $html_head_tail$ = null;
    $html_html_head$ = null;
    $html_html_tail$ = null;
    $html_attribute_id$ = null;
    $html_attribute_class$ = null;
    $html_attribute_style$ = null;
    $html_attribute_title$ = null;
    $html_event_attribute_onclick$ = null;
    $html_event_attribute_onblur$ = null;
    $html_event_attribute_onfocus$ = null;
    $html_event_attribute_onkeyup$ = null;
    $html_event_attribute_onkeydown$ = null;
    $html_event_attribute_onkeypress$ = null;
    $html_meta_head$ = null;
    $html_meta_http_equiv$ = null;
    $html_meta_content$ = null;
    $html_meta_scheme$ = null;
    $html_meta_name$ = null;
    $html_meta_lang$ = null;
    $html_meta_dir$ = null;
    $html_title_head$ = null;
    $html_title_tail$ = null;
    $html_link_head$ = null;
    $html_link_rel$ = null;
    $html_link_type$ = null;
    $html_link_href$ = null;
    $html_link_media$ = null;
    $html_link_title$ = null;
    $html_base_head$ = null;
    $html_base_href$ = null;
    $html_style_head$ = null;
    $html_style_tail$ = null;
    $html_blockquote_head$ = null;
    $html_blockquote_tail$ = null;
    $html_center_head$ = null;
    $html_center_tail$ = null;
    $html_heading_head$ = null;
    $html_heading_tail$ = null;
    $html_hr_head$ = null;
    $html_hr_size$ = null;
    $html_hr_width$ = null;
    $html_line_break_atomic$ = null;
    $html_line_break_head$ = null;
    $html_line_break_tail$ = null;
    $html_line_break_clear$ = null;
    $html_line_break$ = null;
    $html_paragraph_head$ = null;
    $html_paragraph_tail$ = null;
    $html_plaintext_head$ = null;
    $html_plaintext_tail$ = null;
    $html_preformatted_head$ = null;
    $html_preformatted_tail$ = null;
    $html_address_head$ = null;
    $html_address_tail$ = null;
    $html_big_head$ = null;
    $html_big_tail$ = null;
    $html_bold_head$ = null;
    $html_bold_tail$ = null;
    $html_cite_head$ = null;
    $html_cite_tail$ = null;
    $html_code_head$ = null;
    $html_code_tail$ = null;
    $html_definition_head$ = null;
    $html_definition_tail$ = null;
    $html_emphasized_head$ = null;
    $html_emphasized_tail$ = null;
    $html_font_head$ = null;
    $html_font_tail$ = null;
    $html_font_size$ = null;
    $html_font_color$ = null;
    $html_font_face$ = null;
    $html_italic_head$ = null;
    $html_italic_tail$ = null;
    $html_keyboard_head$ = null;
    $html_keyboard_tail$ = null;
    $html_sample_head$ = null;
    $html_sample_tail$ = null;
    $html_small_head$ = null;
    $html_small_tail$ = null;
    $html_strikethrough_head$ = null;
    $html_strikethrough_tail$ = null;
    $html_strong_head$ = null;
    $html_strong_tail$ = null;
    $html_subscript_head$ = null;
    $html_subscript_tail$ = null;
    $html_superscript_head$ = null;
    $html_superscript_tail$ = null;
    $html_teletype_head$ = null;
    $html_teletype_tail$ = null;
    $html_underlined_head$ = null;
    $html_underlined_tail$ = null;
    $html_variable_head$ = null;
    $html_variable_tail$ = null;
    $html_label_head$ = null;
    $html_label_tail$ = null;
    $html_label_access_key$ = null;
    $html_label_for$ = null;
    $html_style_font_size_smaller$ = null;
    $html_style_font_size_larger$ = null;
    $html_definition_list_head$ = null;
    $html_definition_list_tail$ = null;
    $html_definition_list_term_head$ = null;
    $html_definition_list_term_tail$ = null;
    $html_definition_list_def_head$ = null;
    $html_definition_list_def_tail$ = null;
    $html_directory_list_head$ = null;
    $html_directory_list_tail$ = null;
    $html_menu_list_head$ = null;
    $html_menu_list_tail$ = null;
    $html_ordered_list_head$ = null;
    $html_ordered_list_tail$ = null;
    $html_unordered_list_head$ = null;
    $html_unordered_list_tail$ = null;
    $html_list_compact$ = null;
    $html_list_continue$ = null;
    $html_list_dingbat$ = null;
    $html_list_plain$ = null;
    $html_list_seqnum$ = null;
    $html_list_src$ = null;
    $html_list_start$ = null;
    $html_list_type$ = null;
    $html_valid_list_types$ = null;
    $html_list_item_head$ = null;
    $html_list_item_tail$ = null;
    $html_list_item_dingbat$ = null;
    $html_list_item_skip$ = null;
    $html_list_item_src$ = null;
    $html_list_item_id$ = null;
    $html_list_item_type$ = null;
    $html_summary_head$ = null;
    $html_summary_tail$ = null;
    $html_details_head$ = null;
    $html_details_tail$ = null;
    $html_form_head$ = null;
    $html_form_tail$ = null;
    $html_form_action$ = null;
    $html_form_method$ = null;
    $html_form_target$ = null;
    $html_form_name$ = null;
    $html_form_enctype$ = null;
    $html_form_method_get$ = null;
    $html_form_method_post$ = null;
    $html_blank_target$ = null;
    $html_self_target$ = null;
    $html_parent_target$ = null;
    $html_top_target$ = null;
    $html_input_head$ = null;
    $html_input_checked$ = null;
    $html_input_readonly$ = null;
    $html_input_disabled$ = null;
    $html_input_disabledP$ = null;
    $html_input_maxlength$ = null;
    $html_input_align$ = null;
    $html_input_border$ = null;
    $html_input_min$ = null;
    $html_input_max$ = null;
    $html_input_step$ = null;
    $html_input_name$ = null;
    $html_input_size$ = null;
    $html_input_src$ = null;
    $html_input_type$ = null;
    $html_input_style$ = null;
    $html_input_value$ = null;
    $html_input_alt$ = null;
    $html_input_checkbox$ = null;
    $html_input_button$ = null;
    $html_input_hidden$ = null;
    $html_input_image$ = null;
    $html_input_password$ = null;
    $html_input_radio$ = null;
    $html_input_range$ = null;
    $html_input_reset$ = null;
    $html_input_submit$ = null;
    $html_input_text$ = null;
    $html_select_head$ = null;
    $html_select_tail$ = null;
    $html_select_name$ = null;
    $html_select_size$ = null;
    $html_select_multiple$ = null;
    $html_select_onchange$ = null;
    $html_option_head$ = null;
    $html_option_tail$ = null;
    $html_option_value$ = null;
    $html_option_selected$ = null;
    $html_optgroup_head$ = null;
    $html_optgroup_tail$ = null;
    $html_optgroup_label$ = null;
    $html_select_src$ = null;
    $html_select_width$ = null;
    $html_select_height$ = null;
    $html_select_units$ = null;
    $html_option_shape$ = null;
    $html_textarea_head$ = null;
    $html_textarea_tail$ = null;
    $html_textarea_name$ = null;
    $html_textarea_rows$ = null;
    $html_textarea_cols$ = null;
    $html_textarea_id$ = null;
    $html_textarea_style$ = null;
    $html_caption_head$ = null;
    $html_caption_tail$ = null;
    $html_caption_align$ = null;
    $html_table_head$ = null;
    $html_table_tail$ = null;
    $html_table_noflow$ = null;
    $html_table_nowrap$ = null;
    $html_table_wrap$ = null;
    $html_table_align$ = null;
    $html_table_border$ = null;
    $html_table_bordercolor$ = null;
    $html_table_cellpadding$ = null;
    $html_table_cellspacing$ = null;
    $html_table_colspec$ = null;
    $html_table_units$ = null;
    $html_table_bgcolor$ = null;
    $html_table_width$ = null;
    $html_table_background$ = null;
    $html_table_thead_head$ = null;
    $html_table_thead_tail$ = null;
    $html_table_tfoot_head$ = null;
    $html_table_tfoot_tail$ = null;
    $html_table_tbody_head$ = null;
    $html_table_tbody_tail$ = null;
    $html_table_data_head$ = null;
    $html_table_data_tail$ = null;
    $html_table_header_head$ = null;
    $html_table_header_tail$ = null;
    $html_table_row_head$ = null;
    $html_table_row_tail$ = null;
    $html_table_row_bgcolor$ = null;
    $html_table_row_height$ = null;
    $html_table_row_title$ = null;
    $html_table_row_name$ = null;
    $html_table_data_nowrap$ = null;
    $html_table_data_align$ = null;
    $html_table_data_colspan$ = null;
    $html_table_data_rowspan$ = null;
    $html_table_data_valign$ = null;
    $html_table_data_bgcolor$ = null;
    $html_table_data_width$ = null;
    $html_table_data_height$ = null;
    $html_atomic_tail$ = null;
    $html_protocol_mailto$ = null;
    $html_protocol_file$ = null;
    $html_protocol_ftp$ = null;
    $html_anchor_head$ = null;
    $html_anchor_tail$ = null;
    $html_anchor_href$ = null;
    $html_anchor_name$ = null;
    $html_anchor_id$ = null;
    $html_anchor_title$ = null;
    $html_anchor_target$ = null;
    $html_anchor_style$ = null;
    $html_anchor_onmouseover$ = null;
    $html_anchor_onmouseout$ = null;
    $html_anchor_onmouseup$ = null;
    $html_anchor_onmousedown$ = null;
    $html_area_head$ = null;
    $html_area_nohref$ = null;
    $html_area_alt$ = null;
    $html_area_co_ords$ = null;
    $html_area_href$ = null;
    $html_area_shape$ = null;
    $html_area_target$ = null;
    $html_basefont_head$ = null;
    $html_basefont_size$ = null;
    $html_basefont_color$ = null;
    $html_blink_head$ = null;
    $html_blink_tail$ = null;
    $html_comment_head$ = null;
    $html_comment_tail$ = null;
    $html_frame_head$ = null;
    $html_frame_frameborder$ = null;
    $html_frame_noresize$ = null;
    $html_frame_marginheight$ = null;
    $html_frame_marginwidth$ = null;
    $html_frame_name$ = null;
    $html_frame_scrolling$ = null;
    $html_frame_src$ = null;
    $html_frameset_head$ = null;
    $html_frameset_tail$ = null;
    $html_frameset_cols$ = null;
    $html_frameset_rows$ = null;
    $html_frameset_frameborder$ = null;
    $html_iframe_head$ = null;
    $html_iframe_tail$ = null;
    $html_iframe_align$ = null;
    $html_iframe_frameborder$ = null;
    $html_iframe_height$ = null;
    $html_iframe_marginheight$ = null;
    $html_iframe_marginwidth$ = null;
    $html_iframe_name$ = null;
    $html_iframe_scrolling$ = null;
    $html_iframe_src$ = null;
    $html_iframe_width$ = null;
    $html_image_head$ = null;
    $html_image_tail$ = null;
    $html_image_name$ = null;
    $html_image_ismap$ = null;
    $html_image_height$ = null;
    $html_image_width$ = null;
    $html_image_alt$ = null;
    $html_image_align$ = null;
    $html_image_border$ = null;
    $html_image_src$ = null;
    $html_image_style$ = null;
    $html_applet_head$ = null;
    $html_applet_tail$ = null;
    $html_applet_code$ = null;
    $html_applet_codebase$ = null;
    $html_applet_archive$ = null;
    $html_applet_alt$ = null;
    $html_applet_align$ = null;
    $html_applet_name$ = null;
    $html_applet_id$ = null;
    $html_applet_height$ = null;
    $html_applet_width$ = null;
    $html_param_head$ = null;
    $html_param_name$ = null;
    $html_param_value$ = null;
    $html_map_head$ = null;
    $html_map_tail$ = null;
    $html_map_name$ = null;
    $html_no_break_head$ = null;
    $html_no_break_tail$ = null;
    $html_no_frames_head$ = null;
    $html_no_frames_tail$ = null;
    $html_object_head$ = null;
    $html_object_tail$ = null;
    $html_object_classid$ = null;
    $html_object_codebase$ = null;
    $html_object_codetype$ = null;
    $html_object_data$ = null;
    $html_object_type$ = null;
    $html_object_archive$ = null;
    $html_object_id$ = null;
    $html_object_class$ = null;
    $html_object_align$ = null;
    $html_object_width$ = null;
    $html_object_height$ = null;
    $html_object_border$ = null;
    $html_object_hspace$ = null;
    $html_object_vspace$ = null;
    $html_script_head$ = null;
    $html_script_tail$ = null;
    $html_script_language$ = null;
    $html_script_src$ = null;
    $html_script_type$ = null;
    $html_script_javascript$ = null;
    $html_noscript_head$ = null;
    $html_noscript_tail$ = null;
    $html_word_break$ = null;
    $html_color_white$ = null;
    $html_color_black$ = null;
    $html_color_dark_grey$ = null;
    $html_color_light_grey$ = null;
    $html_color_lighter_grey$ = null;
    $html_color_lightest_grey$ = null;
    $html_color_yellowish_gray$ = null;
    $html_color_sat_red$ = null;
    $html_color_dark_red$ = null;
    $html_color_medium_red$ = null;
    $html_color_medium_dark_red$ = null;
    $html_color_light_red$ = null;
    $html_color_lighter_red$ = null;
    $html_color_sat_green$ = null;
    $html_color_dark_green$ = null;
    $html_color_darker_green$ = null;
    $html_color_light_green$ = null;
    $html_color_lighter_green$ = null;
    $html_color_sat_blue$ = null;
    $html_color_dark_blue$ = null;
    $html_color_light_blue$ = null;
    $html_color_lighter_blue$ = null;
    $html_color_sat_yellow$ = null;
    $html_color_dark_yellow$ = null;
    $html_color_light_yellow$ = null;
    $html_color_lighter_yellow$ = null;
    $html_color_darker_purple$ = null;
    $html_color_dark_purple$ = null;
    $html_color_light_purple$ = null;
    $html_color_lighter_purple$ = null;
    $html_color_cyan$ = null;
    $html_color_light_cyan$ = null;
    $html_color_cyc_logo_violet$ = null;
    $html_color_cyc_logo_light_violet$ = null;
    $html_color_cyc_logo_lighter_violet$ = null;
    $html_color_cyc_logo_light_blue$ = null;
    $html_color_cyc_logo_lighter_blue$ = null;
    $html_color_map$ = null;
    $html_alternating_class1$ = null;
    $html_alternating_class2$ = null;
    $html_known_dom_events$ = null;
    $basic_skin_class$ = null;
    $html_escapes_map$ = null;
    $html_prin1_string_escapes_map$ = null;
    $html_escapes_map_for_showing_newlines$ = null;
    $html_safe_print$ = null;
    $html_preserve_breaks$ = null;
    $html_inside_bodyP$ = null;
    $within_html_pre$ = null;
    $suppress_html_source_readability_terpriP$ = null;
    $html_id_space_id_generator$ = null;
    $html_form_field_uniquifier_code$ = null;
    $html_form_field_uniquifier_isg$ = null;
    $within_html_form$ = null;
    $html_indent_table_max$ = null;
    $html_handler_property$ = null;
    $xml_handler_property$ = null;
    $json_handler_property$ = null;
    $handler_mime_types$ = null;
    $sym0$_HTML_DEFAULT_BGCOLOR_ = makeSymbol( "*HTML-DEFAULT-BGCOLOR*" );
    $str1$_body = makeString( "<body" );
    $str2$__body_ = makeString( "</body>" );
    $str3$_bgcolor_ = makeString( " bgcolor=" );
    $str4$_background_ = makeString( " background=" );
    $str5$_class_ = makeString( " class=" );
    $str6$_style_ = makeString( " style=" );
    $str7$_text_ = makeString( " text=" );
    $str8$_link_ = makeString( " link=" );
    $str9$_alink_ = makeString( " alink=" );
    $str10$_vlink_ = makeString( " vlink=" );
    $str11$_onLoad_ = makeString( " onLoad=" );
    $str12$_onResize_ = makeString( " onResize=" );
    $str13$_div = makeString( "<div" );
    $str14$__div_ = makeString( "</div>" );
    $str15$_title_ = makeString( " title=" );
    $str16$_align_ = makeString( " align=" );
    $str17$_span = makeString( "<span" );
    $str18$__span_ = makeString( "</span>" );
    $str19$_head_ = makeString( "<head>" );
    $str20$__head_ = makeString( "</head>" );
    $str21$_html_ = makeString( "<html>" );
    $str22$__html_ = makeString( "</html>" );
    $str23$_id_ = makeString( " id=" );
    $str24$_onclick_ = makeString( " onclick=" );
    $str25$_onblur_ = makeString( " onblur=" );
    $str26$_onfocus_ = makeString( " onfocus=" );
    $str27$_onkeyup_ = makeString( " onkeyup=" );
    $str28$_onkeydown_ = makeString( " onkeydown=" );
    $str29$_onkeypress_ = makeString( " onkeypress=" );
    $str30$_meta = makeString( "<meta" );
    $str31$_http_equiv_ = makeString( " http-equiv=" );
    $str32$_content_ = makeString( " content=" );
    $str33$_scheme_ = makeString( " scheme=" );
    $str34$_name_ = makeString( " name=" );
    $str35$_lang_ = makeString( " lang=" );
    $str36$_dir_ = makeString( " dir=" );
    $str37$_title_ = makeString( "<title>" );
    $str38$__title_ = makeString( "</title>" );
    $str39$_link = makeString( "<link" );
    $str40$_rel_ = makeString( " rel=" );
    $str41$_type_ = makeString( " type=" );
    $str42$_href_ = makeString( " href=" );
    $str43$_media_ = makeString( " media=" );
    $str44$_base = makeString( "<base" );
    $str45$_style_ = makeString( "<style>" );
    $str46$__style_ = makeString( "</style>" );
    $str47$_blockquote_ = makeString( "<blockquote>" );
    $str48$__blockquote_ = makeString( "</blockquote>" );
    $str49$_center_ = makeString( "<center>" );
    $str50$__center_ = makeString( "</center>" );
    $str51$_h = makeString( "<h" );
    $str52$__h = makeString( "</h" );
    $str53$_hr = makeString( "<hr" );
    $str54$_size_ = makeString( " size=" );
    $str55$_width_ = makeString( " width=" );
    $str56$_br___ = makeString( "<br />" );
    $str57$_br = makeString( "<br" );
    $str58$__br_ = makeString( "</br>" );
    $str59$_clear_ = makeString( " clear=" );
    $str60$_br_ = makeString( "<br>" );
    $str61$_p_ = makeString( "<p>" );
    $str62$__p_ = makeString( "</p>" );
    $str63$_plaintext_ = makeString( "<plaintext>" );
    $str64$__plaintext_ = makeString( "</plaintext>" );
    $str65$_pre_ = makeString( "<pre>" );
    $str66$__pre_ = makeString( "</pre>" );
    $str67$_address_ = makeString( "<address>" );
    $str68$__address_ = makeString( "</address>" );
    $str69$_big_ = makeString( "<big>" );
    $str70$__big_ = makeString( "</big>" );
    $str71$_b_ = makeString( "<b>" );
    $str72$__b_ = makeString( "</b>" );
    $str73$_cite_ = makeString( "<cite>" );
    $str74$__cite_ = makeString( "</cite>" );
    $str75$_code_ = makeString( "<code>" );
    $str76$__code_ = makeString( "</code>" );
    $str77$_dfn_ = makeString( "<dfn>" );
    $str78$__dfn_ = makeString( "</dfn>" );
    $str79$_em_ = makeString( "<em>" );
    $str80$__em_ = makeString( "</em>" );
    $str81$_font = makeString( "<font" );
    $str82$__font_ = makeString( "</font>" );
    $str83$_color_ = makeString( " color=" );
    $str84$_face_ = makeString( " face=" );
    $str85$_i_ = makeString( "<i>" );
    $str86$__i_ = makeString( "</i>" );
    $str87$_kbd_ = makeString( "<kbd>" );
    $str88$__kbd_ = makeString( "</kbd>" );
    $str89$_samp_ = makeString( "<samp>" );
    $str90$__samp_ = makeString( "</samp>" );
    $str91$_small_ = makeString( "<small>" );
    $str92$__small_ = makeString( "</small>" );
    $str93$_strike_ = makeString( "<strike>" );
    $str94$__strike_ = makeString( "</strike>" );
    $str95$_strong_ = makeString( "<strong>" );
    $str96$__strong_ = makeString( "</strong>" );
    $str97$_sub_ = makeString( "<sub>" );
    $str98$__sub_ = makeString( "</sub>" );
    $str99$_sup_ = makeString( "<sup>" );
    $str100$__sup_ = makeString( "</sup>" );
    $str101$_tt_ = makeString( "<tt>" );
    $str102$__tt_ = makeString( "</tt>" );
    $str103$_u_ = makeString( "<u>" );
    $str104$__u_ = makeString( "</u>" );
    $str105$_var_ = makeString( "<var>" );
    $str106$__var_ = makeString( "</var>" );
    $str107$_label = makeString( "<label" );
    $str108$__label_ = makeString( "</label>" );
    $str109$_accesskey_ = makeString( " accesskey=" );
    $str110$_for_ = makeString( " for=" );
    $str111$font_size__smaller = makeString( "font-size: smaller" );
    $str112$font_size__larger = makeString( "font-size: larger" );
    $str113$_dl = makeString( "<dl" );
    $str114$__dl_ = makeString( "</dl>" );
    $str115$_dt_ = makeString( "<dt>" );
    $str116$__dt_ = makeString( "</dt>" );
    $str117$_dd_ = makeString( "<dd>" );
    $str118$__dd_ = makeString( "</dd>" );
    $str119$_dir = makeString( "<dir" );
    $str120$__dir_ = makeString( "</dir>" );
    $str121$_menu = makeString( "<menu" );
    $str122$__menu_ = makeString( "</menu>" );
    $str123$_ol = makeString( "<ol" );
    $str124$__ol_ = makeString( "</ol>" );
    $str125$_ul = makeString( "<ul" );
    $str126$__ul_ = makeString( "</ul>" );
    $str127$_compact = makeString( " compact" );
    $str128$_continue = makeString( " continue" );
    $str129$_dingbat_ = makeString( " dingbat=" );
    $str130$_plain = makeString( " plain" );
    $str131$_seqnum_ = makeString( " seqnum=" );
    $str132$_src_ = makeString( " src=" );
    $str133$_start_ = makeString( " start=" );
    $list134 = ConsesLow.list( makeString( "A" ), makeString( "a" ), makeString( "I" ), makeString( "i" ), makeString( "1" ) );
    $str135$_li = makeString( "<li" );
    $str136$__li_ = makeString( "</li>" );
    $str137$_skip_ = makeString( " skip=" );
    $str138$_summary = makeString( "<summary" );
    $str139$__summary_ = makeString( "</summary>" );
    $str140$_details = makeString( "<details" );
    $str141$__details_ = makeString( "</details>" );
    $str142$_form = makeString( "<form" );
    $str143$__form_ = makeString( "</form>" );
    $str144$_action_ = makeString( " action=" );
    $str145$_method_ = makeString( " method=" );
    $str146$_target_ = makeString( " target=" );
    $str147$_enctype_ = makeString( " enctype=" );
    $str148$get = makeString( "get" );
    $str149$post = makeString( "post" );
    $str150$_blank = makeString( "_blank" );
    $str151$_self = makeString( "_self" );
    $str152$_parent = makeString( "_parent" );
    $str153$_top = makeString( "_top" );
    $str154$_input = makeString( "<input" );
    $str155$_checked = makeString( " checked" );
    $str156$_readonly = makeString( " readonly" );
    $str157$_disabled = makeString( " disabled" );
    $str158$_maxlength_ = makeString( " maxlength=" );
    $str159$_border_ = makeString( " border=" );
    $str160$_min_ = makeString( " min=" );
    $str161$_max_ = makeString( " max=" );
    $str162$_step_ = makeString( " step=" );
    $str163$_value_ = makeString( " value=" );
    $str164$_alt_ = makeString( " alt=" );
    $str165$checkbox = makeString( "checkbox" );
    $str166$button = makeString( "button" );
    $str167$hidden = makeString( "hidden" );
    $str168$image = makeString( "image" );
    $str169$password = makeString( "password" );
    $str170$radio = makeString( "radio" );
    $str171$range = makeString( "range" );
    $str172$reset = makeString( "reset" );
    $str173$submit = makeString( "submit" );
    $str174$text = makeString( "text" );
    $str175$_select = makeString( "<select" );
    $str176$__select_ = makeString( "</select>" );
    $str177$_multiple = makeString( " multiple" );
    $str178$_onChange_ = makeString( " onChange=" );
    $str179$_option = makeString( "<option" );
    $str180$ = makeString( "" );
    $str181$_selected = makeString( " selected" );
    $str182$_optgroup = makeString( "<optgroup" );
    $str183$__optgroup_ = makeString( "</optgroup>" );
    $str184$_label_ = makeString( " label=" );
    $str185$_height_ = makeString( " height=" );
    $str186$_units_ = makeString( " units=" );
    $str187$_shape_ = makeString( " shape=" );
    $str188$_textarea = makeString( "<textarea" );
    $str189$__textarea_ = makeString( "</textarea>" );
    $str190$_rows_ = makeString( " rows=" );
    $str191$_cols_ = makeString( " cols=" );
    $str192$_caption = makeString( "<caption" );
    $str193$__caption_ = makeString( "</caption>" );
    $str194$_table = makeString( "<table" );
    $str195$__table_ = makeString( "</table>" );
    $str196$_noflow = makeString( " noflow" );
    $str197$_nowrap = makeString( " nowrap" );
    $str198$_wrap_ = makeString( " wrap=" );
    $str199$_bordercolor_ = makeString( " bordercolor=" );
    $str200$_cellpadding_ = makeString( " cellpadding=" );
    $str201$_cellspacing_ = makeString( " cellspacing=" );
    $str202$_colspec_ = makeString( " colspec=" );
    $str203$_thead = makeString( "<thead" );
    $str204$__thead_ = makeString( "</thead>" );
    $str205$_tfoot = makeString( "<tfoot" );
    $str206$__tfoot_ = makeString( "</tfoot>" );
    $str207$_tbody = makeString( "<tbody" );
    $str208$__tbody_ = makeString( "</tbody>" );
    $str209$_td = makeString( "<td" );
    $str210$__td_ = makeString( "</td>" );
    $str211$_th = makeString( "<th" );
    $str212$__th_ = makeString( "</th>" );
    $str213$_tr = makeString( "<tr" );
    $str214$__tr_ = makeString( "</tr>" );
    $str215$_colspan_ = makeString( " colspan=" );
    $str216$_rowspan_ = makeString( " rowspan=" );
    $str217$_valign_ = makeString( " valign=" );
    $str218$__ = makeString( "/>" );
    $str219$mailto_ = makeString( "mailto:" );
    $str220$file_ = makeString( "file:" );
    $str221$ftp_ = makeString( "ftp:" );
    $str222$_a = makeString( "<a" );
    $str223$__a_ = makeString( "</a>" );
    $str224$_onmouseover_ = makeString( " onmouseover=" );
    $str225$_onmouseout_ = makeString( " onmouseout=" );
    $str226$_onmouseup_ = makeString( " onmouseup=" );
    $str227$_onmousedown_ = makeString( " onmousedown=" );
    $str228$_area = makeString( "<area" );
    $str229$_nohref = makeString( " nohref" );
    $str230$_co_ords_ = makeString( " co-ords=" );
    $str231$_basefont = makeString( "<basefont" );
    $str232$_blink_ = makeString( "<blink>" );
    $str233$__blink_ = makeString( "</blink>" );
    $str234$____ = makeString( "<!--" );
    $str235$___ = makeString( "-->" );
    $str236$_frame = makeString( "<frame" );
    $str237$_frameborder_ = makeString( " frameborder=" );
    $str238$_noresize = makeString( " noresize" );
    $str239$_marginheight_ = makeString( " marginheight=" );
    $str240$_marginwidth_ = makeString( " marginwidth=" );
    $str241$_scrolling_ = makeString( " scrolling=" );
    $str242$_frameset = makeString( "<frameset" );
    $str243$__frameset_ = makeString( "</frameset>" );
    $str244$_iframe = makeString( "<iframe" );
    $str245$__iframe_ = makeString( "</iframe>" );
    $str246$_img = makeString( "<img" );
    $str247$__img_ = makeString( "</img>" );
    $str248$_ismap = makeString( " ismap" );
    $str249$_applet_ = makeString( "<applet " );
    $str250$__applet_ = makeString( "</applet>" );
    $str251$_code_ = makeString( " code=" );
    $str252$_codebase_ = makeString( " codebase=" );
    $str253$_archive_ = makeString( " archive=" );
    $str254$_param_ = makeString( "<param " );
    $str255$_map = makeString( "<map" );
    $str256$__map_ = makeString( "</map>" );
    $str257$_nobr_ = makeString( "<nobr>" );
    $str258$__nobr_ = makeString( "</nobr>" );
    $str259$_noframes_ = makeString( "<noframes>" );
    $str260$__noframes_ = makeString( "</noframes>" );
    $str261$_object_ = makeString( "<object " );
    $str262$__object_ = makeString( "</object>" );
    $str263$_classid_ = makeString( " classid=" );
    $str264$_codetype_ = makeString( " codetype=" );
    $str265$_data_ = makeString( " data=" );
    $str266$_hspace_ = makeString( " hspace=" );
    $str267$_vspace_ = makeString( " vspace=" );
    $str268$_script = makeString( "<script" );
    $str269$__script_ = makeString( "</script>" );
    $str270$_language_ = makeString( " language=" );
    $str271$JavaScript = makeString( "JavaScript" );
    $str272$_noscript = makeString( "<noscript" );
    $str273$__noscript_ = makeString( "</noscript>" );
    $str274$_wbr_ = makeString( "<wbr>" );
    $str275$_ffffff = makeString( "#ffffff" );
    $str276$_000000 = makeString( "#000000" );
    $str277$_999999 = makeString( "#999999" );
    $str278$_cccccc = makeString( "#cccccc" );
    $str279$_dddddd = makeString( "#dddddd" );
    $str280$_eeeeee = makeString( "#eeeeee" );
    $str281$_eeeee4 = makeString( "#eeeee4" );
    $str282$_ff0000 = makeString( "#ff0000" );
    $str283$_996666 = makeString( "#996666" );
    $str284$_ff8888 = makeString( "#ff8888" );
    $str285$_cc0000 = makeString( "#cc0000" );
    $str286$_eeaaaa = makeString( "#eeaaaa" );
    $str287$_ffbbbb = makeString( "#ffbbbb" );
    $str288$_00ff00 = makeString( "#00ff00" );
    $str289$_669966 = makeString( "#669966" );
    $str290$_335533 = makeString( "#335533" );
    $str291$_aaeeaa = makeString( "#aaeeaa" );
    $str292$_bbffbb = makeString( "#bbffbb" );
    $str293$_0000ff = makeString( "#0000ff" );
    $str294$_668899 = makeString( "#668899" );
    $str295$_aaccee = makeString( "#aaccee" );
    $str296$_bbddff = makeString( "#bbddff" );
    $str297$_ffff00 = makeString( "#ffff00" );
    $str298$_999966 = makeString( "#999966" );
    $str299$_eeeeaa = makeString( "#eeeeaa" );
    $str300$_ffffbb = makeString( "#ffffbb" );
    $str301$_9900bb = makeString( "#9900bb" );
    $str302$_996699 = makeString( "#996699" );
    $str303$_ddbbff = makeString( "#ddbbff" );
    $str304$_eeccff = makeString( "#eeccff" );
    $str305$_00ffff = makeString( "#00ffff" );
    $str306$_e0ffff = makeString( "#e0ffff" );
    $str307$_9933cc = makeString( "#9933cc" );
    $str308$_f0d3ff = makeString( "#f0d3ff" );
    $str309$_f4e0ff = makeString( "#f4e0ff" );
    $str310$_e0e5ff = makeString( "#e0e5ff" );
    $str311$_e6f0ff = makeString( "#e6f0ff" );
    $kw312$BLACK = makeKeyword( "BLACK" );
    $kw313$BLUE = makeKeyword( "BLUE" );
    $kw314$GREEN = makeKeyword( "GREEN" );
    $list315 = ConsesLow.cons( makeKeyword( "CYAN" ), makeString( "#00ffff" ) );
    $kw316$RED = makeKeyword( "RED" );
    $list317 = ConsesLow.cons( makeKeyword( "MAGENTA" ), makeString( "#ff00ff" ) );
    $kw318$YELLOW = makeKeyword( "YELLOW" );
    $kw319$WHITE = makeKeyword( "WHITE" );
    $kw320$DARK_BLUE = makeKeyword( "DARK-BLUE" );
    $list321 = ConsesLow.cons( makeKeyword( "LIGHT-BLUE" ), makeString( "#ececff" ) );
    $kw322$LIGHTER_BLUE = makeKeyword( "LIGHTER-BLUE" );
    $kw323$DARK_RED = makeKeyword( "DARK-RED" );
    $list324 = ConsesLow.cons( makeKeyword( "MEDIUM-RED" ), makeString( "#ff8888" ) );
    $list325 = ConsesLow.cons( makeKeyword( "LIGHT-RED" ), makeString( "#ffdede" ) );
    $kw326$LIGHTER_RED = makeKeyword( "LIGHTER-RED" );
    $kw327$DARK_YELLOW = makeKeyword( "DARK-YELLOW" );
    $list328 = ConsesLow.cons( makeKeyword( "LIGHT-YELLOW" ), makeString( "#fffcd2" ) );
    $kw329$LIGHTER_YELLOW = makeKeyword( "LIGHTER-YELLOW" );
    $kw330$DARK_GRAY = makeKeyword( "DARK-GRAY" );
    $list331 = ConsesLow.cons( makeKeyword( "LIGHT-GRAY" ), makeString( "#eeeee4" ) );
    $kw332$LIGHT_GREY = makeKeyword( "LIGHT-GREY" );
    $kw333$LIGHTER_GRAY = makeKeyword( "LIGHTER-GRAY" );
    $kw334$LIGHTEST_GREY = makeKeyword( "LIGHTEST-GREY" );
    $kw335$DARK_PURPLE = makeKeyword( "DARK-PURPLE" );
    $kw336$LIGHT_PURPLE = makeKeyword( "LIGHT-PURPLE" );
    $kw337$LIGHTER_PURPLE = makeKeyword( "LIGHTER-PURPLE" );
    $str338$cyc_alternate_class1 = makeString( "cyc-alternate-class1" );
    $str339$cyc_alternate_class2 = makeString( "cyc-alternate-class2" );
    $list340 = ConsesLow.list( new SubLObject[] { makeKeyword( "ONABORT" ), makeKeyword( "ONBLUR" ), makeKeyword( "ONCHANGE" ), makeKeyword( "ONCLICK" ), makeKeyword( "ONDBLCLICK" ), makeKeyword( "ONDRAGDROP" ),
      makeKeyword( "ONERROR" ), makeKeyword( "ONFOCUS" ), makeKeyword( "ONKEYDOWN" ), makeKeyword( "ONKEYPRESS" ), makeKeyword( "ONKEYUP" ), makeKeyword( "ONLOAD" ), makeKeyword( "ONMOUSEDOWN" ), makeKeyword(
          "ONMOUSEMOVE" ), makeKeyword( "ONMOUSEOUT" ), makeKeyword( "ONMOUSEOVER" ), makeKeyword( "ONMOUSEUP" ), makeKeyword( "ONMOVE" ), makeKeyword( "ONRESET" ), makeKeyword( "ONRESIZE" ), makeKeyword( "ONSELECT" ),
      makeKeyword( "ONSUBMIT" ), makeKeyword( "ONUNLOAD" )
    } );
    $str341$yui_skin_sam = makeString( "yui-skin-sam" );
    $list342 = ConsesLow.list( ConsesLow.cons( Characters.CHAR_ampersand, makeString( "&amp;" ) ), ConsesLow.cons( Characters.CHAR_less, makeString( "&lt;" ) ), ConsesLow.cons( Characters.CHAR_greater, makeString(
        "&gt;" ) ), ConsesLow.cons( Characters.CHAR_quotation, makeString( "&quot;" ) ) );
    $list343 = ConsesLow.list( ConsesLow.cons( Characters.CHAR_ampersand, makeString( "&amp;" ) ), ConsesLow.cons( Characters.CHAR_less, makeString( "&lt;" ) ), ConsesLow.cons( Characters.CHAR_greater, makeString(
        "&gt;" ) ), ConsesLow.cons( Characters.CHAR_quotation, makeString( "\\&quot;" ) ), ConsesLow.cons( Characters.CHAR_backslash, makeString( "\\\\" ) ) );
    $list344 = ConsesLow.list( ConsesLow.cons( Characters.CHAR_ampersand, makeString( "&amp;" ) ), ConsesLow.cons( Characters.CHAR_less, makeString( "&lt;" ) ), ConsesLow.cons( Characters.CHAR_greater, makeString(
        "&gt;" ) ), ConsesLow.cons( Characters.CHAR_quotation, makeString( "&quot;" ) ), ConsesLow.cons( Characters.CHAR_backslash, makeString( "\\\\" ) ), ConsesLow.cons( Characters.CHAR_return, makeString( "" ) ),
        ConsesLow.cons( Characters.CHAR_newline, makeString( "<br>" ) ), ConsesLow.cons( Characters.CHAR_tab, makeString( "&nbsp;&nbsp;&nbsp;&nbsp;" ) ) );
    $list345 = ConsesLow.list( makeSymbol( "CONTROL-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym346$FORMAT = makeSymbol( "FORMAT" );
    $sym347$_HTML_STREAM_ = makeSymbol( "*HTML-STREAM*" );
    $sym348$HTML_STRONG = makeSymbol( "HTML-STRONG" );
    $list349 = ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "TAIL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym350$PROGN = makeSymbol( "PROGN" );
    $sym351$HTML_MARKUP = makeSymbol( "HTML-MARKUP" );
    $list352 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-CHAR" ), Characters.CHAR_greater ) );
    $list353 = ConsesLow.list( ConsesLow.list( makeSymbol( "ATT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list354 = ConsesLow.list( makeSymbol( "HTML-CHAR" ), Characters.CHAR_quotation );
    $list355 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-CHAR" ), Characters.CHAR_quotation ) );
    $list356 = ConsesLow.list( makeSymbol( "HTML-CHAR" ), Characters.CHAR_greater );
    $sym357$CLET = makeSymbol( "CLET" );
    $list358 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HTML-SAFE-PRINT*" ), T ) );
    $list359 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "SHOW-COPYRIGHT" ), T ), makeSymbol( "BACKGROUND-IMAGE" ), makeSymbol( "BACKGROUND-COLOR" ), makeSymbol(
        "CLASS" ), makeSymbol( "TEXT-COLOR" ), makeSymbol( "LINK-COLOR" ), makeSymbol( "ACTIVE-LINK-COLOR" ), makeSymbol( "VISITED-LINK-COLOR" ), makeSymbol( "SCRIPT" ), makeSymbol( "ONLOAD" ), makeSymbol( "ONRESIZE" ),
      makeSymbol( "STYLE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list360 = ConsesLow.list( new SubLObject[] { makeKeyword( "SHOW-COPYRIGHT" ), makeKeyword( "BACKGROUND-IMAGE" ), makeKeyword( "BACKGROUND-COLOR" ), makeKeyword( "CLASS" ), makeKeyword( "TEXT-COLOR" ), makeKeyword(
        "LINK-COLOR" ), makeKeyword( "ACTIVE-LINK-COLOR" ), makeKeyword( "VISITED-LINK-COLOR" ), makeKeyword( "SCRIPT" ), makeKeyword( "ONLOAD" ), makeKeyword( "ONRESIZE" ), makeKeyword( "STYLE" )
    } );
    $kw361$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw362$SHOW_COPYRIGHT = makeKeyword( "SHOW-COPYRIGHT" );
    $kw363$BACKGROUND_IMAGE = makeKeyword( "BACKGROUND-IMAGE" );
    $kw364$BACKGROUND_COLOR = makeKeyword( "BACKGROUND-COLOR" );
    $kw365$CLASS = makeKeyword( "CLASS" );
    $kw366$TEXT_COLOR = makeKeyword( "TEXT-COLOR" );
    $kw367$LINK_COLOR = makeKeyword( "LINK-COLOR" );
    $kw368$ACTIVE_LINK_COLOR = makeKeyword( "ACTIVE-LINK-COLOR" );
    $kw369$VISITED_LINK_COLOR = makeKeyword( "VISITED-LINK-COLOR" );
    $kw370$SCRIPT = makeKeyword( "SCRIPT" );
    $kw371$ONLOAD = makeKeyword( "ONLOAD" );
    $kw372$ONRESIZE = makeKeyword( "ONRESIZE" );
    $kw373$STYLE = makeKeyword( "STYLE" );
    $sym374$HTML_QUOTED_ATTRIBUTE = makeSymbol( "HTML-QUOTED-ATTRIBUTE" );
    $list375 = ConsesLow.list( makeSymbol( "*HTML-BODY-BACKGROUND*" ) );
    $list376 = ConsesLow.list( makeSymbol( "*HTML-BODY-ONLOAD*" ) );
    $list377 = ConsesLow.list( makeSymbol( "*HTML-BODY-ONRESIZE*" ) );
    $sym378$ATOM = makeSymbol( "ATOM" );
    $sym379$PWHEN = makeSymbol( "PWHEN" );
    $list380 = ConsesLow.list( makeSymbol( "*HTML-BODY-BGCOLOR*" ) );
    $sym381$HTML_COLOR = makeSymbol( "HTML-COLOR" );
    $list382 = ConsesLow.list( makeSymbol( "*HTML-BODY-CLASS*" ) );
    $list383 = ConsesLow.list( makeSymbol( "*HTML-BODY-STYLE*" ) );
    $list384 = ConsesLow.list( makeSymbol( "*HTML-BODY-TEXT*" ) );
    $list385 = ConsesLow.list( makeSymbol( "*HTML-BODY-LINK*" ) );
    $list386 = ConsesLow.list( makeSymbol( "*HTML-BODY-ALINK*" ) );
    $list387 = ConsesLow.list( makeSymbol( "*HTML-BODY-VLINK*" ) );
    $list388 = ConsesLow.list( makeSymbol( "HTML-CHAR" ), Characters.CHAR_space );
    $list389 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HTML-INSIDE-BODY?*" ), T ) );
    $sym390$HTML_MARKUP_WRAPPER = makeSymbol( "HTML-MARKUP-WRAPPER" );
    $list391 = ConsesLow.list( makeSymbol( "*HTML-BODY-HEAD*" ), makeSymbol( "*HTML-BODY-TAIL*" ) );
    $sym392$HTML_MARKUP_BODY = makeSymbol( "HTML-MARKUP-BODY" );
    $list393 = ConsesLow.list( makeSymbol( "HTML-SOURCE-READABILITY-TERPRI" ) );
    $list394 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-COPYRIGHT-NOTICE" ) ) );
    $list395 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SOURCE-READABILITY-TERPRI" ) ) );
    $list396 = ConsesLow.list( ConsesLow.list( makeSymbol( "COLOR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym397$COLOR_VALUE = makeUninternedSymbol( "COLOR-VALUE" );
    $sym398$HTML_FANCY_BODY = makeSymbol( "HTML-FANCY-BODY" );
    $sym399$HTML_COLORED_BODY = makeSymbol( "HTML-COLORED-BODY" );
    $list400 = ConsesLow.list( makeSymbol( "*HTML-DEFAULT-BGCOLOR*" ) );
    $list401 = ConsesLow.list( makeSymbol( "*HTML-HEAD-HEAD*" ), makeSymbol( "*HTML-HEAD-TAIL*" ) );
    $list402 = ConsesLow.list( makeSymbol( "HTML-HEAD-CONTENT-TYPE" ) );
    $sym403$HTML_HEAD_CONTENT_TYPE = makeSymbol( "HTML-HEAD-CONTENT-TYPE" );
    $sym404$HTML_HEAD = makeSymbol( "HTML-HEAD" );
    $list405 = ConsesLow.list( makeSymbol( "HTML-MARKUP" ), makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" ) );
    $list406 = ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*HTML-FORCE-IE-STANDARDS-MODE*" ), ConsesLow.list( makeSymbol( "HTML-SOURCE-READABILITY-TERPRI" ) ), ConsesLow.list( makeSymbol( "HTML-MARKUP" ),
        makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" ) ) );
    $sym407$WITH_POSSIBLY_NEW_HTML_FILE_DEPENDENCY_SPACE = makeSymbol( "WITH-POSSIBLY-NEW-HTML-FILE-DEPENDENCY-SPACE" );
    $list408 = ConsesLow.list( makeSymbol( "*HTML-HTML-HEAD*" ), makeSymbol( "*HTML-HTML-TAIL*" ) );
    $list409 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "ID" ), makeSymbol( "CLASS" ), makeSymbol( "STYLE" ), makeSymbol( "ALIGN" ), makeSymbol( "ONLOAD" ), makeSymbol( "TITLE" ), makeSymbol(
        "MISC" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list410 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "CLASS" ), makeKeyword( "STYLE" ), makeKeyword( "ALIGN" ), makeKeyword( "ONLOAD" ), makeKeyword( "TITLE" ), makeKeyword( "MISC" ) );
    $kw411$ID = makeKeyword( "ID" );
    $kw412$ALIGN = makeKeyword( "ALIGN" );
    $kw413$TITLE = makeKeyword( "TITLE" );
    $kw414$MISC = makeKeyword( "MISC" );
    $list415 = ConsesLow.list( makeSymbol( "*HTML-ATTRIBUTE-ID*" ) );
    $list416 = ConsesLow.list( makeSymbol( "*HTML-ATTRIBUTE-CLASS*" ) );
    $list417 = ConsesLow.list( makeSymbol( "*HTML-DIV-STYLE*" ) );
    $list418 = ConsesLow.list( makeSymbol( "*HTML-DIV-TITLE*" ) );
    $list419 = ConsesLow.list( makeSymbol( "*HTML-DIV-ALIGN*" ) );
    $list420 = ConsesLow.list( makeSymbol( "*HTML-DIV-ONLOAD*" ) );
    $sym421$ATTRIBUTE = makeUninternedSymbol( "ATTRIBUTE" );
    $sym422$VALUE = makeUninternedSymbol( "VALUE" );
    $sym423$DO_ALIST = makeSymbol( "DO-ALIST" );
    $list424 = ConsesLow.list( makeSymbol( "*HTML-DIV-HEAD*" ), makeSymbol( "*HTML-DIV-TAIL*" ) );
    $sym425$HTML_FANCY_SPAN = makeSymbol( "HTML-FANCY-SPAN" );
    $list426 = ConsesLow.list( makeKeyword( "STYLE" ), makeSymbol( "*HTML-STYLE-FONT-SIZE-SMALLER*" ) );
    $list427 = ConsesLow.list( makeKeyword( "STYLE" ), makeSymbol( "*HTML-STYLE-FONT-SIZE-LARGER*" ) );
    $list428 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "ID" ), makeSymbol( "ONCLICK" ), makeSymbol( "CLASS" ), makeSymbol( "STYLE" ), makeSymbol( "TITLE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list429 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "ONCLICK" ), makeKeyword( "CLASS" ), makeKeyword( "STYLE" ), makeKeyword( "TITLE" ) );
    $kw430$ONCLICK = makeKeyword( "ONCLICK" );
    $list431 = ConsesLow.list( makeSymbol( "*HTML-EVENT-ATTRIBUTE-ONCLICK*" ) );
    $list432 = ConsesLow.list( makeSymbol( "*HTML-ATTRIBUTE-TITLE*" ) );
    $list433 = ConsesLow.list( makeSymbol( "*HTML-SPAN-STYLE*" ) );
    $list434 = ConsesLow.list( makeSymbol( "*HTML-SPAN-HEAD*" ), makeSymbol( "*HTML-SPAN-TAIL*" ) );
    $list435 = ConsesLow.list( makeSymbol( "*HTML-META-HEAD*" ) );
    $list436 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "HTTP-EQUIV" ), makeSymbol( "CONTENT" ), makeSymbol( "NAME" ), makeSymbol( "SCHEME" ), makeSymbol( "LANG" ), makeSymbol( "DIR" ) ) );
    $list437 = ConsesLow.list( makeKeyword( "HTTP-EQUIV" ), makeKeyword( "CONTENT" ), makeKeyword( "NAME" ), makeKeyword( "SCHEME" ), makeKeyword( "LANG" ), makeKeyword( "DIR" ) );
    $kw438$HTTP_EQUIV = makeKeyword( "HTTP-EQUIV" );
    $kw439$CONTENT = makeKeyword( "CONTENT" );
    $kw440$NAME = makeKeyword( "NAME" );
    $kw441$SCHEME = makeKeyword( "SCHEME" );
    $kw442$LANG = makeKeyword( "LANG" );
    $kw443$DIR = makeKeyword( "DIR" );
    $list444 = ConsesLow.list( makeSymbol( "*HTML-META-CONTENT*" ) );
    $list445 = ConsesLow.list( makeSymbol( "*HTML-META-NAME*" ) );
    $list446 = ConsesLow.list( makeSymbol( "*HTML-META-SCHEME*" ) );
    $list447 = ConsesLow.list( makeSymbol( "*HTML-META-LANG*" ) );
    $list448 = ConsesLow.list( makeSymbol( "*HTML-META-DIR*" ) );
    $list449 = ConsesLow.list( makeSymbol( "*HTML-META-HTTP-EQUIV*" ) );
    $sym450$HTML_META = makeSymbol( "HTML-META" );
    $list451 = ConsesLow.list( makeSymbol( "*HTML-LINK-HEAD*" ) );
    $list452 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "REL" ), makeSymbol( "TYPE" ), makeSymbol( "HREF" ), makeSymbol( "MEDIA" ), makeSymbol( "TITLE" ), makeSymbol( "ID" ) ) );
    $list453 = ConsesLow.list( makeKeyword( "REL" ), makeKeyword( "TYPE" ), makeKeyword( "HREF" ), makeKeyword( "MEDIA" ), makeKeyword( "TITLE" ), makeKeyword( "ID" ) );
    $kw454$REL = makeKeyword( "REL" );
    $kw455$TYPE = makeKeyword( "TYPE" );
    $kw456$HREF = makeKeyword( "HREF" );
    $kw457$MEDIA = makeKeyword( "MEDIA" );
    $list458 = ConsesLow.list( makeSymbol( "*HTML-LINK-MEDIA*" ) );
    $list459 = ConsesLow.list( makeSymbol( "*HTML-LINK-TITLE*" ) );
    $list460 = ConsesLow.list( makeSymbol( "*HTML-LINK-TYPE*" ) );
    $list461 = ConsesLow.list( makeSymbol( "*HTML-LINK-HREF*" ) );
    $list462 = ConsesLow.list( makeSymbol( "*HTML-LINK-REL*" ) );
    $sym463$HTML_LINK = makeSymbol( "HTML-LINK" );
    $list464 = ConsesLow.list( makeSymbol( "*HTML-BASE-HEAD*" ) );
    $list465 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "HREF" ) ) );
    $list466 = ConsesLow.list( makeKeyword( "HREF" ) );
    $list467 = ConsesLow.list( makeSymbol( "*HTML-BASE-HREF*" ) );
    $sym468$HTML_BASE = makeSymbol( "HTML-BASE" );
    $str469$all = makeString( "all" );
    $str470$stylesheet = makeString( "stylesheet" );
    $str471$text_css = makeString( "text/css" );
    $list472 = ConsesLow.list( makeSymbol( "*HTML-STYLE-HEAD*" ), makeSymbol( "*HTML-STYLE-TAIL*" ) );
    $list473 = ConsesLow.list( makeSymbol( "*HTML-TITLE-HEAD*" ), makeSymbol( "*HTML-TITLE-TAIL*" ) );
    $list474 = ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "COLOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*HTML-DEFAULT-BGCOLOR*" ) ) ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym475$HTML_DOCUMENT = makeSymbol( "HTML-DOCUMENT" );
    $sym476$HTML_TITLE = makeSymbol( "HTML-TITLE" );
    $sym477$HTML_PRINC = makeSymbol( "HTML-PRINC" );
    $sym478$HTML_HEADING = makeSymbol( "HTML-HEADING" );
    $list479 = ConsesLow.list( TWO_INTEGER );
    $list480 = ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ), makeSymbol( "&KEY" ), makeSymbol( "COMPLETION?" ), ConsesLow.list( makeSymbol( "COLOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "*HTML-DEFAULT-BGCOLOR*" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list481 = ConsesLow.list( makeKeyword( "COMPLETION?" ), makeKeyword( "COLOR" ) );
    $kw482$COMPLETION_ = makeKeyword( "COMPLETION?" );
    $kw483$COLOR = makeKeyword( "COLOR" );
    $list484 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-COMPLETE-SCRIPT" ) ) );
    $list485 = ConsesLow.list( makeSymbol( "*HTML-BLOCKQUOTE-HEAD*" ), makeSymbol( "*HTML-BLOCKQUOTE-TAIL*" ) );
    $list486 = ConsesLow.list( makeSymbol( "*HTML-CENTER-HEAD*" ), makeSymbol( "*HTML-CENTER-TAIL*" ) );
    $list487 = ConsesLow.list( ConsesLow.list( makeSymbol( "LEVEL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list488 = ConsesLow.list( makeSymbol( "*HTML-HEADING-HEAD*" ) );
    $list489 = ConsesLow.list( makeSymbol( "*HTML-HEADING-TAIL*" ) );
    $list490 = ConsesLow.list( makeSymbol( "*HTML-PARAGRAPH-HEAD*" ), makeSymbol( "*HTML-PARAGRAPH-TAIL*" ) );
    $list491 = ConsesLow.list( makeSymbol( "*HTML-PLAINTEXT-HEAD*" ), makeSymbol( "*HTML-PLAINTEXT-TAIL*" ) );
    $str492$HTML_UNPRE_used_when_not_within_H = makeString( "HTML-UNPRE used when not within HTML-PRE" );
    $str493$Nested_calls_to_HTML_PRE_will_con = makeString( "Nested calls to HTML-PRE will confuse most browsers." );
    $list494 = ConsesLow.list( makeSymbol( "VERIFY-NOT-WITHIN-HTML-PRE" ) );
    $list495 = ConsesLow.list( makeSymbol( "*HTML-PREFORMATTED-HEAD*" ), makeSymbol( "*HTML-PREFORMATTED-TAIL*" ) );
    $list496 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-HTML-PRE*" ), T ) );
    $list497 = ConsesLow.list( makeSymbol( "VERIFY-WITHIN-HTML-PRE" ) );
    $list498 = ConsesLow.list( makeSymbol( "*HTML-PREFORMATTED-TAIL*" ), makeSymbol( "*HTML-PREFORMATTED-HEAD*" ) );
    $list499 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-HTML-PRE*" ), NIL ) );
    $list500 = ConsesLow.list( makeSymbol( "*HTML-ADDRESS-HEAD*" ), makeSymbol( "*HTML-ADDRESS-TAIL*" ) );
    $list501 = ConsesLow.list( makeSymbol( "*HTML-BIG-HEAD*" ), makeSymbol( "*HTML-BIG-TAIL*" ) );
    $list502 = ConsesLow.list( makeSymbol( "*HTML-BOLD-HEAD*" ), makeSymbol( "*HTML-BOLD-TAIL*" ) );
    $sym503$HTML_BOLD = makeSymbol( "HTML-BOLD" );
    $list504 = ConsesLow.list( makeSymbol( "*HTML-CITE-HEAD*" ), makeSymbol( "*HTML-CITE-TAIL*" ) );
    $list505 = ConsesLow.list( makeSymbol( "*HTML-CODE-HEAD*" ), makeSymbol( "*HTML-CODE-TAIL*" ) );
    $list506 = ConsesLow.list( makeSymbol( "*HTML-DEFINITION-HEAD*" ), makeSymbol( "*HTML-DEFINITION-TAIL*" ) );
    $list507 = ConsesLow.list( makeSymbol( "*HTML-EMPHASIZED-HEAD*" ), makeSymbol( "*HTML-EMPHASIZED-TAIL*" ) );
    $sym508$HTML_EMPHASIZED = makeSymbol( "HTML-EMPHASIZED" );
    $list509 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "SIZE" ), makeSymbol( "COLOR" ), makeSymbol( "FACE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list510 = ConsesLow.list( makeKeyword( "SIZE" ), makeKeyword( "COLOR" ), makeKeyword( "FACE" ) );
    $kw511$SIZE = makeKeyword( "SIZE" );
    $kw512$FACE = makeKeyword( "FACE" );
    $list513 = ConsesLow.list( makeSymbol( "*HTML-FONT-SIZE*" ) );
    $list514 = ConsesLow.list( makeSymbol( "*HTML-FONT-COLOR*" ) );
    $list515 = ConsesLow.list( makeSymbol( "*HTML-FONT-FACE*" ) );
    $list516 = ConsesLow.list( makeSymbol( "*HTML-FONT-HEAD*" ), makeSymbol( "*HTML-FONT-TAIL*" ) );
    $list517 = ConsesLow.list( ConsesLow.list( makeSymbol( "SIZE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym518$SIZE_VAL = makeUninternedSymbol( "SIZE-VAL" );
    $sym519$HTML_FANCY_FONT = makeSymbol( "HTML-FANCY-FONT" );
    $sym520$COLOR_VAL = makeUninternedSymbol( "COLOR-VAL" );
    $sym521$HTML_STYLE_BACKGROUND_COLOR = makeSymbol( "HTML-STYLE-BACKGROUND-COLOR" );
    $list522 = ConsesLow.list( makeSymbol( "*HTML-ITALIC-HEAD*" ), makeSymbol( "*HTML-ITALIC-TAIL*" ) );
    $sym523$HTML_ITALIC = makeSymbol( "HTML-ITALIC" );
    $list524 = ConsesLow.list( makeSymbol( "*HTML-KEYBOARD-HEAD*" ), makeSymbol( "*HTML-KEYBOARD-TAIL*" ) );
    $list525 = ConsesLow.list( makeSymbol( "*HTML-SAMPLE-HEAD*" ), makeSymbol( "*HTML-SAMPLE-TAIL*" ) );
    $list526 = ConsesLow.list( makeSymbol( "*HTML-SMALL-HEAD*" ), makeSymbol( "*HTML-SMALL-TAIL*" ) );
    $list527 = ConsesLow.list( makeSymbol( "*HTML-STRIKETHROUGH-HEAD*" ), makeSymbol( "*HTML-STRIKETHROUGH-TAIL*" ) );
    $list528 = ConsesLow.list( makeSymbol( "*HTML-STRONG-HEAD*" ), makeSymbol( "*HTML-STRONG-TAIL*" ) );
    $list529 = ConsesLow.list( makeSymbol( "*HTML-SUBSCRIPT-HEAD*" ), makeSymbol( "*HTML-SUBSCRIPT-TAIL*" ) );
    $list530 = ConsesLow.list( makeSymbol( "*HTML-SUPERSCRIPT-HEAD*" ), makeSymbol( "*HTML-SUPERSCRIPT-TAIL*" ) );
    $list531 = ConsesLow.list( makeSymbol( "*HTML-TELETYPE-HEAD*" ), makeSymbol( "*HTML-TELETYPE-TAIL*" ) );
    $sym532$HTML_TELETYPE = makeSymbol( "HTML-TELETYPE" );
    $list533 = ConsesLow.list( makeSymbol( "*HTML-UNDERLINED-HEAD*" ), makeSymbol( "*HTML-UNDERLINED-TAIL*" ) );
    $sym534$HTML_UNDERLINED = makeSymbol( "HTML-UNDERLINED" );
    $list535 = ConsesLow.list( makeSymbol( "*HTML-VARIABLE-HEAD*" ), makeSymbol( "*HTML-VARIABLE-TAIL*" ) );
    $list536 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "ACCESS-KEY" ), makeSymbol( "FOR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list537 = ConsesLow.list( makeKeyword( "ACCESS-KEY" ), makeKeyword( "FOR" ) );
    $kw538$ACCESS_KEY = makeKeyword( "ACCESS-KEY" );
    $kw539$FOR = makeKeyword( "FOR" );
    $list540 = ConsesLow.list( makeSymbol( "*HTML-LABEL-ACCESS-KEY*" ) );
    $list541 = ConsesLow.list( makeSymbol( "*HTML-LABEL-FOR*" ) );
    $list542 = ConsesLow.list( makeSymbol( "*HTML-LABEL-HEAD*" ), makeSymbol( "*HTML-LABEL-TAIL*" ) );
    $list543 = ConsesLow.list( makeSymbol( "*HTML-DEFINITION-LIST-HEAD*" ), makeSymbol( "*HTML-DEFINITION-LIST-TAIL*" ) );
    $list544 = ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-LIST-COMPACT*" ) );
    $list545 = ConsesLow.list( makeSymbol( "*HTML-DEFINITION-LIST-TERM-HEAD*" ), makeSymbol( "*HTML-DEFINITION-LIST-TERM-TAIL*" ) );
    $list546 = ConsesLow.list( makeSymbol( "*HTML-DEFINITION-LIST-DEF-HEAD*" ), makeSymbol( "*HTML-DEFINITION-LIST-DEF-TAIL*" ) );
    $list547 = ConsesLow.list( makeSymbol( "*HTML-DIRECTORY-LIST-HEAD*" ), makeSymbol( "*HTML-DIRECTORY-LIST-TAIL*" ) );
    $list548 = ConsesLow.list( makeSymbol( "*HTML-MENU-LIST-HEAD*" ), makeSymbol( "*HTML-MENU-LIST-TAIL*" ) );
    $list549 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "COMPACT" ), makeSymbol( "CONTINUE" ), makeSymbol( "TYPE" ), makeSymbol( "START" ), makeSymbol( "SEQNUM" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list550 = ConsesLow.list( makeKeyword( "COMPACT" ), makeKeyword( "CONTINUE" ), makeKeyword( "TYPE" ), makeKeyword( "START" ), makeKeyword( "SEQNUM" ) );
    $kw551$COMPACT = makeKeyword( "COMPACT" );
    $kw552$CONTINUE = makeKeyword( "CONTINUE" );
    $kw553$START = makeKeyword( "START" );
    $kw554$SEQNUM = makeKeyword( "SEQNUM" );
    $list555 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-LIST-COMPACT*" ) ) );
    $list556 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-LIST-CONTINUE*" ) ) );
    $list557 = ConsesLow.list( makeSymbol( "*HTML-LIST-TYPE*" ) );
    $list558 = ConsesLow.list( makeSymbol( "*HTML-LIST-START*" ) );
    $list559 = ConsesLow.list( makeSymbol( "*HTML-LIST-SEQNUM*" ) );
    $list560 = ConsesLow.list( makeSymbol( "*HTML-ORDERED-LIST-HEAD*" ), makeSymbol( "*HTML-ORDERED-LIST-TAIL*" ) );
    $sym561$HTML_FANCY_ORDERED_LIST = makeSymbol( "HTML-FANCY-ORDERED-LIST" );
    $sym562$HTML_ORDERED_LIST = makeSymbol( "HTML-ORDERED-LIST" );
    $list563 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "COMPACT" ), makeSymbol( "PLAIN" ), makeSymbol( "TYPE" ), makeSymbol( "SRC" ), makeSymbol( "DINGBAT" ), makeSymbol( "CLASS" ), makeSymbol(
        "ID" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list564 = ConsesLow.list( makeKeyword( "COMPACT" ), makeKeyword( "PLAIN" ), makeKeyword( "TYPE" ), makeKeyword( "SRC" ), makeKeyword( "DINGBAT" ), makeKeyword( "CLASS" ), makeKeyword( "ID" ) );
    $kw565$PLAIN = makeKeyword( "PLAIN" );
    $kw566$SRC = makeKeyword( "SRC" );
    $kw567$DINGBAT = makeKeyword( "DINGBAT" );
    $list568 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-LIST-PLAIN*" ) ) );
    $list569 = ConsesLow.list( makeSymbol( "*HTML-LIST-SRC*" ) );
    $list570 = ConsesLow.list( makeSymbol( "*HTML-LIST-DINGBAT*" ) );
    $list571 = ConsesLow.list( makeSymbol( "*HTML-UNORDERED-LIST-HEAD*" ), makeSymbol( "*HTML-UNORDERED-LIST-TAIL*" ) );
    $sym572$HTML_FANCY_UNORDERED_LIST = makeSymbol( "HTML-FANCY-UNORDERED-LIST" );
    $sym573$HTML_UNORDERED_LIST = makeSymbol( "HTML-UNORDERED-LIST" );
    $list574 = ConsesLow.list( makeKeyword( "PLAIN" ), T );
    $list575 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "SKIP" ), makeSymbol( "TYPE" ), makeSymbol( "SRC" ), makeSymbol( "DINGBAT" ), makeSymbol( "CLASS" ), makeSymbol( "ID" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list576 = ConsesLow.list( makeKeyword( "SKIP" ), makeKeyword( "TYPE" ), makeKeyword( "SRC" ), makeKeyword( "DINGBAT" ), makeKeyword( "CLASS" ), makeKeyword( "ID" ) );
    $kw577$SKIP = makeKeyword( "SKIP" );
    $list578 = ConsesLow.list( makeSymbol( "*HTML-LIST-ITEM-SKIP*" ) );
    $list579 = ConsesLow.list( makeSymbol( "*HTML-LIST-ITEM-TYPE*" ) );
    $list580 = ConsesLow.list( makeSymbol( "*HTML-LIST-ITEM-SRC*" ) );
    $list581 = ConsesLow.list( makeSymbol( "*HTML-LIST-ITEM-ID*" ) );
    $list582 = ConsesLow.list( makeSymbol( "*HTML-LIST-ITEM-DINGBAT*" ) );
    $list583 = ConsesLow.list( makeSymbol( "*HTML-LIST-ITEM-HEAD*" ), makeSymbol( "*HTML-LIST-ITEM-TAIL*" ) );
    $sym584$HTML_FANCY_LIST_ITEM = makeSymbol( "HTML-FANCY-LIST-ITEM" );
    $list585 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "CLASS" ), makeSymbol( "ID" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list586 = ConsesLow.list( makeKeyword( "CLASS" ), makeKeyword( "ID" ) );
    $list587 = ConsesLow.list( makeSymbol( "*HTML-SUMMARY-HEAD*" ), makeSymbol( "*HTML-SUMMARY-TAIL*" ) );
    $list588 = ConsesLow.list( makeSymbol( "*HTML-DETAILS-HEAD*" ), makeSymbol( "*HTML-DETAILS-TAIL*" ) );
    $list589 = ConsesLow.list( makeSymbol( "CODE" ), ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "CODEBASE" ), makeSymbol( "ARCHIVE" ), makeSymbol( "ALT" ), makeSymbol( "NAME" ), makeSymbol(
        "ALIGN" ), makeSymbol( "HEIGHT" ), makeSymbol( "WIDTH" ), makeSymbol( "ID" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list590 = ConsesLow.list( makeKeyword( "CODEBASE" ), makeKeyword( "ARCHIVE" ), makeKeyword( "ALT" ), makeKeyword( "NAME" ), makeKeyword( "ALIGN" ), makeKeyword( "HEIGHT" ), makeKeyword( "WIDTH" ), makeKeyword(
        "ID" ) );
    $kw591$CODEBASE = makeKeyword( "CODEBASE" );
    $kw592$ARCHIVE = makeKeyword( "ARCHIVE" );
    $kw593$ALT = makeKeyword( "ALT" );
    $kw594$HEIGHT = makeKeyword( "HEIGHT" );
    $kw595$WIDTH = makeKeyword( "WIDTH" );
    $list596 = ConsesLow.list( makeSymbol( "*HTML-APPLET-CODE*" ) );
    $list597 = ConsesLow.list( makeSymbol( "*HTML-APPLET-CODEBASE*" ) );
    $list598 = ConsesLow.list( makeSymbol( "*HTML-APPLET-ARCHIVE*" ) );
    $list599 = ConsesLow.list( makeSymbol( "*HTML-APPLET-ALT*" ) );
    $list600 = ConsesLow.list( makeSymbol( "*HTML-APPLET-ALIGN*" ) );
    $sym601$HTML_ALIGN = makeSymbol( "HTML-ALIGN" );
    $list602 = ConsesLow.list( makeSymbol( "*HTML-APPLET-NAME*" ) );
    $list603 = ConsesLow.list( makeSymbol( "*HTML-APPLET-ID*" ) );
    $list604 = ConsesLow.list( makeSymbol( "*HTML-APPLET-HEIGHT*" ) );
    $list605 = ConsesLow.list( makeSymbol( "*HTML-APPLET-WIDTH*" ) );
    $list606 = ConsesLow.list( makeSymbol( "*HTML-APPLET-HEAD*" ), makeSymbol( "*HTML-APPLET-TAIL*" ) );
    $list607 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "VALUE" ) );
    $list608 = ConsesLow.list( makeSymbol( "*HTML-PARAM-HEAD*" ) );
    $list609 = ConsesLow.list( makeSymbol( "*HTML-PARAM-NAME*" ) );
    $list610 = ConsesLow.list( makeSymbol( "*HTML-PARAM-VALUE*" ) );
    $sym611$TO_STRING = makeSymbol( "TO-STRING" );
    $sym612$PIF = makeSymbol( "PIF" );
    $sym613$STRINGP = makeSymbol( "STRINGP" );
    $sym614$HTML_PRIN1 = makeSymbol( "HTML-PRIN1" );
    $list615 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HTML-ID-SPACE-ID-GENERATOR*" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "INTEGER-SEQUENCE-GENERATOR-P" ), makeSymbol(
        "*HTML-ID-SPACE-ID-GENERATOR*" ) ), makeSymbol( "*HTML-ID-SPACE-ID-GENERATOR*" ), ConsesLow.list( makeSymbol( "NEW-INTEGER-SEQUENCE-GENERATOR" ) ) ) ) );
    $sym616$_HTML_FORM_FIELD_UNIQUIFIER_CODE_ = makeSymbol( "*HTML-FORM-FIELD-UNIQUIFIER-CODE*" );
    $sym617$WITH_HTML_UNIQUE_FORM_FIELDS = makeSymbol( "WITH-HTML-UNIQUE-FORM-FIELDS" );
    $sym618$HTML_FANCY_FORM = makeSymbol( "HTML-FANCY-FORM" );
    $list619 = ConsesLow.list( ConsesLow.list( makeSymbol( "*HTML-FORM-FIELD-UNIQUIFIER-CODE*" ), ConsesLow.list( makeSymbol( "NEXT-HTML-FORM-FIELD-UNIQUIFIER-CODE" ) ) ) );
    $list620 = ConsesLow.list( ConsesLow.list( makeSymbol( "EMBED-FORM-FIELD-CODE" ), makeSymbol( "*HTML-FORM-FIELD-UNIQUIFIER-CODE*" ) ) );
    $list621 = ConsesLow.list( ConsesLow.list( makeSymbol( "ARGS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym622$GET_FORM_FIELD_CODE = makeSymbol( "GET-FORM-FIELD-CODE" );
    $sym623$NEXT_HTML_FORM_FIELD_UNIQUIFIER_CODE = makeSymbol( "NEXT-HTML-FORM-FIELD-UNIQUIFIER-CODE" );
    $sym624$_HTML_FORM_FIELD_UNIQUIFIER_ISG_ = makeSymbol( "*HTML-FORM-FIELD-UNIQUIFIER-ISG*" );
    $sym625$EMBED_FORM_FIELD_CODE = makeSymbol( "EMBED-FORM-FIELD-CODE" );
    $str626$uniquifier_code = makeString( "uniquifier-code" );
    $sym627$WITH_HTML_UNIQUE_FORM_FIELD_DECODING = makeSymbol( "WITH-HTML-UNIQUE-FORM-FIELD-DECODING" );
    $list628 = ConsesLow.list( ConsesLow.list( makeSymbol( "ACTION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "METHOD" ), makeSymbol( "TARGET" ), makeSymbol( "NAME" ), makeSymbol( "SCRIPT" ), makeSymbol( "FORM-ID" ),
        makeSymbol( "ENCTYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list629 = ConsesLow.list( makeSymbol( "*HTML-FORM-ACTION*" ) );
    $list630 = ConsesLow.list( makeSymbol( "*HTML-FORM-ENCTYPE*" ) );
    $list631 = ConsesLow.list( makeSymbol( "*HTML-FORM-METHOD*" ) );
    $list632 = ConsesLow.list( makeSymbol( "*HTML-FORM-NAME*" ) );
    $list633 = ConsesLow.list( makeSymbol( "*HTML-FORM-TARGET*" ) );
    $list634 = ConsesLow.list( makeSymbol( "*HTML-FORM-HEAD*" ), makeSymbol( "*HTML-FORM-TAIL*" ) );
    $list635 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-HTML-FORM*" ), T ) );
    $list636 = ConsesLow.list( new SubLObject[] { makeSymbol( "TYPE" ), makeSymbol( "&KEY" ), makeSymbol( "ID" ), makeSymbol( "NAME" ), makeSymbol( "VALUE" ), makeSymbol( "CHECKED" ), makeSymbol( "DISABLED?" ),
      makeSymbol( "READONLY" ), makeSymbol( "SIZE" ), makeSymbol( "MAXLENGTH" ), makeSymbol( "SRC" ), makeSymbol( "ALIGN" ), makeSymbol( "BORDER" ), makeSymbol( "MIN" ), makeSymbol( "MAX" ), makeSymbol( "STEP" ),
      makeSymbol( "SCRIPT" ), makeSymbol( "STYLE" ), makeSymbol( "ONCHANGE" ), makeSymbol( "ONCLICK" ), makeSymbol( "ONBLUR" ), makeSymbol( "ONFOCUS" ), makeSymbol( "ONKEYUP" ), makeSymbol( "ONKEYDOWN" ), makeSymbol(
          "ONKEYPRESS" ), makeSymbol( "ALT" ), makeSymbol( "CLASS" ), makeSymbol( "TITLE" )
    } );
    $list637 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "NAME" ), makeKeyword( "VALUE" ), makeKeyword( "CHECKED" ), makeKeyword( "DISABLED?" ), makeKeyword( "READONLY" ), makeKeyword(
        "SIZE" ), makeKeyword( "MAXLENGTH" ), makeKeyword( "SRC" ), makeKeyword( "ALIGN" ), makeKeyword( "BORDER" ), makeKeyword( "MIN" ), makeKeyword( "MAX" ), makeKeyword( "STEP" ), makeKeyword( "SCRIPT" ),
      makeKeyword( "STYLE" ), makeKeyword( "ONCHANGE" ), makeKeyword( "ONCLICK" ), makeKeyword( "ONBLUR" ), makeKeyword( "ONFOCUS" ), makeKeyword( "ONKEYUP" ), makeKeyword( "ONKEYDOWN" ), makeKeyword( "ONKEYPRESS" ),
      makeKeyword( "ALT" ), makeKeyword( "CLASS" ), makeKeyword( "TITLE" )
    } );
    $kw638$VALUE = makeKeyword( "VALUE" );
    $kw639$CHECKED = makeKeyword( "CHECKED" );
    $kw640$DISABLED_ = makeKeyword( "DISABLED?" );
    $kw641$READONLY = makeKeyword( "READONLY" );
    $kw642$MAXLENGTH = makeKeyword( "MAXLENGTH" );
    $kw643$BORDER = makeKeyword( "BORDER" );
    $kw644$MIN = makeKeyword( "MIN" );
    $kw645$MAX = makeKeyword( "MAX" );
    $kw646$STEP = makeKeyword( "STEP" );
    $kw647$ONCHANGE = makeKeyword( "ONCHANGE" );
    $kw648$ONBLUR = makeKeyword( "ONBLUR" );
    $kw649$ONFOCUS = makeKeyword( "ONFOCUS" );
    $kw650$ONKEYUP = makeKeyword( "ONKEYUP" );
    $kw651$ONKEYDOWN = makeKeyword( "ONKEYDOWN" );
    $kw652$ONKEYPRESS = makeKeyword( "ONKEYPRESS" );
    $list653 = ConsesLow.list( makeSymbol( "*HTML-INPUT-TYPE*" ) );
    $list654 = ConsesLow.list( makeSymbol( "*HTML-INPUT-STYLE*" ) );
    $list655 = ConsesLow.list( makeSymbol( "*HTML-INPUT-NAME*" ) );
    $list656 = ConsesLow.list( makeSymbol( "*HTML-INPUT-ALT*" ) );
    $list657 = ConsesLow.list( makeSymbol( "*HTML-INPUT-VALUE*" ) );
    $list658 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-INPUT-CHECKED*" ) ) );
    $list659 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-INPUT-READONLY*" ) ) );
    $list660 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-INPUT-DISABLED*" ) ) );
    $list661 = ConsesLow.list( makeSymbol( "*HTML-INPUT-SIZE*" ) );
    $list662 = ConsesLow.list( makeSymbol( "*HTML-INPUT-MAXLENGTH*" ) );
    $list663 = ConsesLow.list( makeSymbol( "*HTML-INPUT-SRC*" ) );
    $list664 = ConsesLow.list( makeSymbol( "*HTML-INPUT-ALIGN*" ) );
    $list665 = ConsesLow.list( makeSymbol( "*HTML-INPUT-BORDER*" ) );
    $list666 = ConsesLow.list( makeSymbol( "*HTML-INPUT-MIN*" ) );
    $list667 = ConsesLow.list( makeSymbol( "*HTML-INPUT-MAX*" ) );
    $list668 = ConsesLow.list( makeSymbol( "*HTML-INPUT-STEP*" ) );
    $list669 = ConsesLow.list( makeSymbol( "*HTML-SELECT-ONCHANGE*" ) );
    $list670 = ConsesLow.list( makeSymbol( "*HTML-EVENT-ATTRIBUTE-ONBLUR*" ) );
    $list671 = ConsesLow.list( makeSymbol( "*HTML-EVENT-ATTRIBUTE-ONFOCUS*" ) );
    $list672 = ConsesLow.list( makeSymbol( "*HTML-EVENT-ATTRIBUTE-ONKEYUP*" ) );
    $list673 = ConsesLow.list( makeSymbol( "*HTML-EVENT-ATTRIBUTE-ONKEYDOWN*" ) );
    $list674 = ConsesLow.list( makeSymbol( "*HTML-EVENT-ATTRIBUTE-ONKEYPRESS*" ) );
    $list675 = ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*HTML-INPUT-DISABLED?*" ), ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-INPUT-DISABLED*" ) ) );
    $list676 = ConsesLow.list( makeSymbol( "*HTML-INPUT-HEAD*" ) );
    $list677 = ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol( "&KEY" ), makeSymbol( "STYLE" ), makeSymbol( "CLASS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list678 = ConsesLow.list( makeKeyword( "STYLE" ), makeKeyword( "CLASS" ) );
    $sym679$HTML_FANCY_INPUT = makeSymbol( "HTML-FANCY-INPUT" );
    $sym680$_HTML_INPUT_BUTTON_ = makeSymbol( "*HTML-INPUT-BUTTON*" );
    $list681 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "VALUE" ), makeSymbol( "CHECKED?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym682$_HTML_INPUT_RADIO_ = makeSymbol( "*HTML-INPUT-RADIO*" );
    $list683 = ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol( "&KEY" ), makeSymbol( "ID" ), makeSymbol( "STYLE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list684 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "STYLE" ) );
    $sym685$_HTML_INPUT_SUBMIT_ = makeSymbol( "*HTML-INPUT-SUBMIT*" );
    $list686 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&KEY" ), makeSymbol( "MULTIPLE" ), makeSymbol( "SIZE" ), makeSymbol( "SCRIPT" ), makeSymbol( "ONCHANGE" ), makeSymbol( "DISABLED?" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list687 = ConsesLow.list( makeKeyword( "MULTIPLE" ), makeKeyword( "SIZE" ), makeKeyword( "SCRIPT" ), makeKeyword( "ONCHANGE" ), makeKeyword( "DISABLED?" ) );
    $kw688$MULTIPLE = makeKeyword( "MULTIPLE" );
    $list689 = ConsesLow.list( makeSymbol( "*HTML-SELECT-NAME*" ) );
    $list690 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-SELECT-MULTIPLE*" ) ) );
    $list691 = ConsesLow.list( makeSymbol( "*HTML-SELECT-SIZE*" ) );
    $list692 = ConsesLow.list( makeSymbol( "*HTML-SELECT-HEAD*" ), makeSymbol( "*HTML-SELECT-TAIL*" ) );
    $list693 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "SELECTED" ), makeSymbol( "VALUE" ), makeSymbol( "ONMOUSEOVER" ), makeSymbol( "ONMOUSEOUT" ), makeSymbol( "SCRIPT" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list694 = ConsesLow.list( makeKeyword( "SELECTED" ), makeKeyword( "VALUE" ), makeKeyword( "ONMOUSEOVER" ), makeKeyword( "ONMOUSEOUT" ), makeKeyword( "SCRIPT" ) );
    $kw695$SELECTED = makeKeyword( "SELECTED" );
    $kw696$ONMOUSEOVER = makeKeyword( "ONMOUSEOVER" );
    $kw697$ONMOUSEOUT = makeKeyword( "ONMOUSEOUT" );
    $list698 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-OPTION-SELECTED*" ) ) );
    $list699 = ConsesLow.list( makeSymbol( "*HTML-OPTION-VALUE*" ) );
    $list700 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-ONMOUSEOUT*" ) );
    $list701 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-ONMOUSEOVER*" ) );
    $list702 = ConsesLow.list( makeSymbol( "*HTML-OPTION-HEAD*" ), makeSymbol( "*HTML-OPTION-TAIL*" ) );
    $list703 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "LABEL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list704 = ConsesLow.list( makeKeyword( "LABEL" ) );
    $kw705$LABEL = makeKeyword( "LABEL" );
    $list706 = ConsesLow.list( makeSymbol( "*HTML-OPTGROUP-LABEL*" ) );
    $list707 = ConsesLow.list( makeSymbol( "*HTML-OPTGROUP-HEAD*" ), makeSymbol( "*HTML-OPTGROUP-TAIL*" ) );
    $list708 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&KEY" ), makeSymbol( "ID" ), makeSymbol( "COLS" ), makeSymbol( "ROWS" ), makeSymbol( "WRAP" ), makeSymbol( "STYLE" ), makeSymbol(
        "CLASS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list709 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "COLS" ), makeKeyword( "ROWS" ), makeKeyword( "WRAP" ), makeKeyword( "STYLE" ), makeKeyword( "CLASS" ) );
    $kw710$COLS = makeKeyword( "COLS" );
    $kw711$ROWS = makeKeyword( "ROWS" );
    $kw712$WRAP = makeKeyword( "WRAP" );
    $list713 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-NAME*" ) );
    $list714 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-COLS*" ) );
    $list715 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-ID*" ) );
    $list716 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-ROWS*" ) );
    $list717 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-QUOTED-ATTRIBUTE" ), ConsesLow.list( makeSymbol( "*HTML-TABLE-WRAP*" ) ), ConsesLow.list( makeSymbol( "HTML-MARKUP" ), makeString( "virtual" ) ) ) );
    $list718 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-STYLE*" ) );
    $list719 = ConsesLow.list( makeSymbol( "*HTML-TEXTAREA-HEAD*" ), makeSymbol( "*HTML-TEXTAREA-TAIL*" ) );
    $list720 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "ALIGN" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list721 = ConsesLow.list( makeSymbol( "*HTML-CAPTION-HEAD*" ), makeSymbol( "*HTML-CAPTION-TAIL*" ) );
    $list722 = ConsesLow.list( makeSymbol( "*HTML-CAPTION-ALIGN*" ) );
    $list723 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "ID" ), makeSymbol( "NOFLOW" ), makeSymbol( "NOWRAP" ), makeSymbol( "ALIGN" ), makeSymbol( "BORDER" ), makeSymbol(
        "BORDERCOLOR" ), makeSymbol( "CELLPADDING" ), makeSymbol( "STYLE" ), makeSymbol( "CELLSPACING" ), makeSymbol( "COLSPEC" ), makeSymbol( "UNITS" ), makeSymbol( "BGCOLOR" ), makeSymbol( "WIDTH" ), makeSymbol(
            "BACKGROUND" ), makeSymbol( "CLASS" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list724 = ConsesLow.list( new SubLObject[] { makeKeyword( "ID" ), makeKeyword( "NOFLOW" ), makeKeyword( "NOWRAP" ), makeKeyword( "ALIGN" ), makeKeyword( "BORDER" ), makeKeyword( "BORDERCOLOR" ), makeKeyword(
        "CELLPADDING" ), makeKeyword( "STYLE" ), makeKeyword( "CELLSPACING" ), makeKeyword( "COLSPEC" ), makeKeyword( "UNITS" ), makeKeyword( "BGCOLOR" ), makeKeyword( "WIDTH" ), makeKeyword( "BACKGROUND" ), makeKeyword(
            "CLASS" )
    } );
    $kw725$NOFLOW = makeKeyword( "NOFLOW" );
    $kw726$NOWRAP = makeKeyword( "NOWRAP" );
    $kw727$BORDERCOLOR = makeKeyword( "BORDERCOLOR" );
    $kw728$CELLPADDING = makeKeyword( "CELLPADDING" );
    $kw729$CELLSPACING = makeKeyword( "CELLSPACING" );
    $kw730$COLSPEC = makeKeyword( "COLSPEC" );
    $kw731$UNITS = makeKeyword( "UNITS" );
    $kw732$BGCOLOR = makeKeyword( "BGCOLOR" );
    $kw733$BACKGROUND = makeKeyword( "BACKGROUND" );
    $list734 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-TABLE-NOFLOW*" ) ) );
    $list735 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-TABLE-NOWRAP*" ) ) );
    $list736 = ConsesLow.list( makeSymbol( "*HTML-TABLE-ALIGN*" ) );
    $list737 = ConsesLow.list( makeSymbol( "*HTML-TABLE-BORDER*" ) );
    $list738 = ConsesLow.list( makeSymbol( "*HTML-TABLE-BORDERCOLOR*" ) );
    $list739 = ConsesLow.list( makeSymbol( "*HTML-TABLE-CELLPADDING*" ) );
    $list740 = ConsesLow.list( makeSymbol( "*HTML-TABLE-CELLSPACING*" ) );
    $list741 = ConsesLow.list( makeSymbol( "*HTML-TABLE-COLSPEC*" ) );
    $list742 = ConsesLow.list( makeSymbol( "*HTML-ATTRIBUTE-STYLE*" ) );
    $list743 = ConsesLow.list( makeSymbol( "*HTML-TABLE-UNITS*" ) );
    $list744 = ConsesLow.list( makeSymbol( "*HTML-TABLE-BGCOLOR*" ) );
    $list745 = ConsesLow.list( makeSymbol( "*HTML-TABLE-WIDTH*" ) );
    $list746 = ConsesLow.list( makeSymbol( "*HTML-TABLE-BACKGROUND*" ) );
    $list747 = ConsesLow.list( makeSymbol( "*HTML-TABLE-HEAD*" ), makeSymbol( "*HTML-TABLE-TAIL*" ) );
    $list748 = ConsesLow.list( ConsesLow.list( makeSymbol( "BORDER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym749$HTML_FANCY_TABLE = makeSymbol( "HTML-FANCY-TABLE" );
    $list750 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "NOWRAP" ), makeSymbol( "COLSPAN" ), makeSymbol( "ROWSPAN" ), makeSymbol( "ALIGN" ), makeSymbol( "VALIGN" ), makeSymbol(
        "BGCOLOR" ), makeSymbol( "WIDTH" ), makeSymbol( "HEIGHT" ), makeSymbol( "ID" ), makeSymbol( "CLASS" ), makeSymbol( "STYLE" ), makeSymbol( "TITLE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list751 = ConsesLow.list( new SubLObject[] { makeKeyword( "NOWRAP" ), makeKeyword( "COLSPAN" ), makeKeyword( "ROWSPAN" ), makeKeyword( "ALIGN" ), makeKeyword( "VALIGN" ), makeKeyword( "BGCOLOR" ), makeKeyword(
        "WIDTH" ), makeKeyword( "HEIGHT" ), makeKeyword( "ID" ), makeKeyword( "CLASS" ), makeKeyword( "STYLE" ), makeKeyword( "TITLE" )
    } );
    $kw752$COLSPAN = makeKeyword( "COLSPAN" );
    $kw753$ROWSPAN = makeKeyword( "ROWSPAN" );
    $kw754$VALIGN = makeKeyword( "VALIGN" );
    $list755 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-TABLE-DATA-NOWRAP*" ) ) );
    $list756 = ConsesLow.list( makeSymbol( "*HTML-TABLE-DATA-COLSPAN*" ) );
    $list757 = ConsesLow.list( makeSymbol( "*HTML-TABLE-DATA-ROWSPAN*" ) );
    $list758 = ConsesLow.list( makeSymbol( "*HTML-TABLE-DATA-ALIGN*" ) );
    $list759 = ConsesLow.list( makeSymbol( "*HTML-TABLE-DATA-VALIGN*" ) );
    $list760 = ConsesLow.list( makeSymbol( "*HTML-TABLE-DATA-BGCOLOR*" ) );
    $list761 = ConsesLow.list( makeSymbol( "*HTML-TABLE-DATA-WIDTH*" ) );
    $list762 = ConsesLow.list( makeSymbol( "*HTML-TABLE-DATA-HEIGHT*" ) );
    $list763 = ConsesLow.list( makeSymbol( "*HTML-TABLE-DATA-HEAD*" ), makeSymbol( "*HTML-TABLE-DATA-TAIL*" ) );
    $sym764$HTML_FANCY_TABLE_DATA = makeSymbol( "HTML-FANCY-TABLE-DATA" );
    $list765 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "NOWRAP" ), makeSymbol( "COLSPAN" ), makeSymbol( "ROWSPAN" ), makeSymbol( "ALIGN" ), makeSymbol( "VALIGN" ), makeSymbol(
        "BGCOLOR" ), makeSymbol( "WIDTH" ), makeSymbol( "HEIGHT" ), makeSymbol( "CLASS" ), makeSymbol( "TITLE" ), makeSymbol( "STYLE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list766 = ConsesLow.list( new SubLObject[] { makeKeyword( "NOWRAP" ), makeKeyword( "COLSPAN" ), makeKeyword( "ROWSPAN" ), makeKeyword( "ALIGN" ), makeKeyword( "VALIGN" ), makeKeyword( "BGCOLOR" ), makeKeyword(
        "WIDTH" ), makeKeyword( "HEIGHT" ), makeKeyword( "CLASS" ), makeKeyword( "TITLE" ), makeKeyword( "STYLE" )
    } );
    $list767 = ConsesLow.list( makeSymbol( "*HTML-TABLE-ROW-TITLE*" ) );
    $list768 = ConsesLow.list( makeSymbol( "*HTML-TABLE-HEADER-HEAD*" ), makeSymbol( "*HTML-TABLE-HEADER-TAIL*" ) );
    $sym769$HTML_FANCY_TABLE_HEADER = makeSymbol( "HTML-FANCY-TABLE-HEADER" );
    $list770 = ConsesLow.list( makeSymbol( "*HTML-TABLE-THEAD-HEAD*" ), makeSymbol( "*HTML-TABLE-THEAD-TAIL*" ) );
    $list771 = ConsesLow.list( makeSymbol( "*HTML-TABLE-TFOOT-HEAD*" ), makeSymbol( "*HTML-TABLE-TFOOT-TAIL*" ) );
    $list772 = ConsesLow.list( makeSymbol( "*HTML-TABLE-TBODY-HEAD*" ), makeSymbol( "*HTML-TABLE-TBODY-TAIL*" ) );
    $list773 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "TITLE" ), makeSymbol( "STYLE" ), makeSymbol( "ALIGN" ), makeSymbol( "VALIGN" ), makeSymbol( "HEIGHT" ), makeSymbol(
        "BGCOLOR" ), makeSymbol( "CLASS" ), makeSymbol( "ID" ), makeSymbol( "NAME" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list774 = ConsesLow.list( new SubLObject[] { makeKeyword( "TITLE" ), makeKeyword( "STYLE" ), makeKeyword( "ALIGN" ), makeKeyword( "VALIGN" ), makeKeyword( "HEIGHT" ), makeKeyword( "BGCOLOR" ), makeKeyword(
        "CLASS" ), makeKeyword( "ID" ), makeKeyword( "NAME" )
    } );
    $list775 = ConsesLow.list( makeSymbol( "*HTML-TABLE-ROW-NAME*" ) );
    $list776 = ConsesLow.list( makeSymbol( "*HTML-TABLE-ROW-HEIGHT*" ) );
    $list777 = ConsesLow.list( makeSymbol( "*HTML-TABLE-ROW-BGCOLOR*" ) );
    $list778 = ConsesLow.list( makeSymbol( "*HTML-TABLE-ROW-HEAD*" ), makeSymbol( "*HTML-TABLE-ROW-TAIL*" ) );
    $sym779$HTML_FANCY_TABLE_ROW = makeSymbol( "HTML-FANCY-TABLE-ROW" );
    $list780 = ConsesLow.list( ConsesLow.list( makeSymbol( "INDENT-WIDTH" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MAX-INDENT" ), TWENTY_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list781 = ConsesLow.list( makeKeyword( "BORDER" ), ZERO_INTEGER, makeKeyword( "CELLPADDING" ), ZERO_INTEGER, makeKeyword( "CELLSPACING" ), ZERO_INTEGER );
    $sym782$_HTML_INDENT_TABLE_MAX_ = makeSymbol( "*HTML-INDENT-TABLE-MAX*" );
    $sym783$HTML_INDENT_TABLE_INTERNAL = makeSymbol( "HTML-INDENT-TABLE-INTERNAL" );
    $list784 = ConsesLow.list( ConsesLow.list( makeSymbol( "INDENT-AMOUNT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym785$INDENT = makeUninternedSymbol( "INDENT" );
    $sym786$SPAN = makeUninternedSymbol( "SPAN" );
    $sym787$MAX = makeSymbol( "MAX" );
    $sym788$_ = makeSymbol( "-" );
    $sym789$HTML_TABLE_ROW = makeSymbol( "HTML-TABLE-ROW" );
    $sym790$HTML_INDENT_ROW_INTERNAL = makeSymbol( "HTML-INDENT-ROW-INTERNAL" );
    $list791 = ConsesLow.list( ConsesLow.list( makeSymbol( "INDENT-AMOUNT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "NEWLINE?" ), T ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list792 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) );
    $sym793$HTML_NO_BREAK = makeSymbol( "HTML-NO-BREAK" );
    $sym794$HTML_INDENT = makeSymbol( "HTML-INDENT" );
    $list795 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LISTFORM" ), makeSymbol( "BGCOLOR-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "COLOR1" ), makeSymbol(
        "*HTML-COLOR-LIGHT-GREY*" ) ), ConsesLow.list( makeSymbol( "COLOR2" ), makeSymbol( "*HTML-COLOR-LIGHTER-GREY*" ) ), ConsesLow.list( makeSymbol( "COUNTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "IGNORE-ME" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list796 = ConsesLow.list( makeKeyword( "COLOR1" ), makeKeyword( "COLOR2" ), makeKeyword( "COUNTER" ) );
    $kw797$COLOR1 = makeKeyword( "COLOR1" );
    $kw798$COLOR2 = makeKeyword( "COLOR2" );
    $kw799$COUNTER = makeKeyword( "COUNTER" );
    $sym800$IGNORE_ME = makeSymbol( "IGNORE-ME" );
    $str801$Malformed_cdolist_with_alternatin = makeString( "Malformed cdolist-with-alternating-bgcolor -- ~S was not a variable" );
    $sym802$COLOR_TOGGLE = makeUninternedSymbol( "COLOR-TOGGLE" );
    $list803 = ConsesLow.list( NIL );
    $sym804$CDOLIST_NUMBERED = makeSymbol( "CDOLIST-NUMBERED" );
    $sym805$CSETQ = makeSymbol( "CSETQ" );
    $list806 = ConsesLow.list( T );
    $sym807$FIF = makeSymbol( "FIF" );
    $list808 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LISTFORM" ), makeSymbol( "BGCOLOR-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "COUNTER" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "IGNORE-ME" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list809 = ConsesLow.list( makeKeyword( "COUNTER" ) );
    $sym810$CDOLIST_WITH_ALTERNATING_BGCOLOR = makeSymbol( "CDOLIST-WITH-ALTERNATING-BGCOLOR" );
    $sym811$_HTML_COLOR_CYC_LOGO_LIGHT_VIOLET_ = makeSymbol( "*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*" );
    $sym812$_HTML_COLOR_CYC_LOGO_LIGHTER_VIOLET_ = makeSymbol( "*HTML-COLOR-CYC-LOGO-LIGHTER-VIOLET*" );
    $sym813$_HTML_COLOR_CYC_LOGO_LIGHT_BLUE_ = makeSymbol( "*HTML-COLOR-CYC-LOGO-LIGHT-BLUE*" );
    $sym814$_HTML_COLOR_CYC_LOGO_LIGHTER_BLUE_ = makeSymbol( "*HTML-COLOR-CYC-LOGO-LIGHTER-BLUE*" );
    $list815 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LISTFORM" ), makeSymbol( "ALTERNATOR-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "ALTERNATIVE1" ), makeSymbol(
        "*HTML-ALTERNATING-CLASS1*" ) ), ConsesLow.list( makeSymbol( "ALTERNATIVE2" ), makeSymbol( "*HTML-ALTERNATING-CLASS2*" ) ), ConsesLow.list( makeSymbol( "COUNTER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "IGNORE-ME" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list816 = ConsesLow.list( makeKeyword( "ALTERNATIVE1" ), makeKeyword( "ALTERNATIVE2" ), makeKeyword( "COUNTER" ) );
    $kw817$ALTERNATIVE1 = makeKeyword( "ALTERNATIVE1" );
    $kw818$ALTERNATIVE2 = makeKeyword( "ALTERNATIVE2" );
    $str819$Malformed_cdolist_with_alternatin = makeString( "Malformed cdolist-with-alternating-variable -- ~S was not a variable" );
    $sym820$ALTERNATOR_TOGGLE = makeUninternedSymbol( "ALTERNATOR-TOGGLE" );
    $list821 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LISTFORM" ), makeSymbol( "CLASS-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "COUNTER" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "IGNORE-ME" ) ) ), ConsesLow.list( makeSymbol( "CLASS1" ), makeSymbol( "*HTML-ALTERNATING-CLASS1*" ) ), ConsesLow.list( makeSymbol( "CLASS2" ), makeSymbol(
            "*HTML-ALTERNATING-CLASS2*" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list822 = ConsesLow.list( makeKeyword( "COUNTER" ), makeKeyword( "CLASS1" ), makeKeyword( "CLASS2" ) );
    $kw823$CLASS1 = makeKeyword( "CLASS1" );
    $kw824$CLASS2 = makeKeyword( "CLASS2" );
    $sym825$CDOLIST_WITH_ALTERNATING_VARIABLE = makeSymbol( "CDOLIST-WITH-ALTERNATING-VARIABLE" );
    $list826 = ConsesLow.list( makeSymbol( "VAR" ) );
    $list827 = ConsesLow.list( makeSymbol( "*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*" ) );
    $list828 = ConsesLow.list( makeSymbol( "*HTML-COLOR-CYC-LOGO-LIGHTER-VIOLET*" ), makeSymbol( "*HTML-COLOR-CYC-LOGO-LIGHT-VIOLET*" ) );
    $list829 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "HREF" ), makeSymbol( "NAME" ), makeSymbol( "TITLE" ), makeSymbol( "TARGET" ), makeSymbol( "SCRIPT" ), makeSymbol(
        "STYLE" ), makeSymbol( "ONMOUSEOVER" ), makeSymbol( "ONMOUSEOUT" ), makeSymbol( "ONMOUSEDOWN" ), makeSymbol( "ONMOUSEUP" ), makeSymbol( "ONCLICK" ), makeSymbol( "CLASS" ), makeSymbol( "ID" ), makeSymbol(
            "ATTRS" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list830 = ConsesLow.list( new SubLObject[] { makeKeyword( "HREF" ), makeKeyword( "NAME" ), makeKeyword( "TITLE" ), makeKeyword( "TARGET" ), makeKeyword( "SCRIPT" ), makeKeyword( "STYLE" ), makeKeyword(
        "ONMOUSEOVER" ), makeKeyword( "ONMOUSEOUT" ), makeKeyword( "ONMOUSEDOWN" ), makeKeyword( "ONMOUSEUP" ), makeKeyword( "ONCLICK" ), makeKeyword( "CLASS" ), makeKeyword( "ID" ), makeKeyword( "ATTRS" )
    } );
    $kw831$TARGET = makeKeyword( "TARGET" );
    $kw832$ONMOUSEDOWN = makeKeyword( "ONMOUSEDOWN" );
    $kw833$ONMOUSEUP = makeKeyword( "ONMOUSEUP" );
    $kw834$ATTRS = makeKeyword( "ATTRS" );
    $list835 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-HREF*" ) );
    $list836 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-NAME*" ) );
    $list837 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-ID*" ) );
    $list838 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-TITLE*" ) );
    $list839 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-TARGET*" ) );
    $list840 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-STYLE*" ) );
    $list841 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-ONMOUSEUP*" ) );
    $list842 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-ONMOUSEDOWN*" ) );
    $str843$_ = makeString( " " );
    $str844$_ = makeString( "=" );
    $list845 = ConsesLow.list( makeSymbol( "*HTML-ANCHOR-HEAD*" ), makeSymbol( "*HTML-ANCHOR-TAIL*" ) );
    $list846 = ConsesLow.list( ConsesLow.list( makeSymbol( "LINKTEXT" ), makeSymbol( "&KEY" ), makeSymbol( "HREF" ), makeSymbol( "NAME" ), makeSymbol( "TARGET" ), makeSymbol( "STYLE" ), makeSymbol( "CLASS" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list847 = ConsesLow.list( makeKeyword( "HREF" ), makeKeyword( "NAME" ), makeKeyword( "TARGET" ), makeKeyword( "STYLE" ), makeKeyword( "CLASS" ) );
    $sym848$HTML_FANCY_ANCHOR = makeSymbol( "HTML-FANCY-ANCHOR" );
    $list849 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list850 = ConsesLow.list( makeSymbol( "HTML-CHAR" ), Characters.CHAR_hash );
    $list851 = ConsesLow.list( ConsesLow.list( makeSymbol( "ADDRESS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym852$HTML_MAILTO_URL = makeSymbol( "HTML-MAILTO-URL" );
    $list853 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILENAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym854$HTML_FILE_URL = makeSymbol( "HTML-FILE-URL" );
    $list855 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "NOHREF" ), makeSymbol( "HREF" ), makeSymbol( "ALT" ), makeSymbol( "TARGET" ), makeSymbol( "SHAPE" ), makeSymbol( "CO-ORDS" ) );
    $list856 = ConsesLow.list( makeKeyword( "NOHREF" ), makeKeyword( "HREF" ), makeKeyword( "ALT" ), makeKeyword( "TARGET" ), makeKeyword( "SHAPE" ), makeKeyword( "CO-ORDS" ) );
    $kw857$NOHREF = makeKeyword( "NOHREF" );
    $kw858$SHAPE = makeKeyword( "SHAPE" );
    $kw859$CO_ORDS = makeKeyword( "CO-ORDS" );
    $list860 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-AREA-NOHREF*" ) ) );
    $list861 = ConsesLow.list( makeSymbol( "*HTML-AREA-HREF*" ) );
    $list862 = ConsesLow.list( makeSymbol( "*HTML-AREA-ALT*" ) );
    $list863 = ConsesLow.list( makeSymbol( "*HTML-AREA-TARGET*" ) );
    $list864 = ConsesLow.list( makeSymbol( "*HTML-AREA-SHAPE*" ) );
    $list865 = ConsesLow.list( makeSymbol( "*HTML-AREA-CO-ORDS*" ) );
    $list866 = ConsesLow.list( makeSymbol( "*HTML-AREA-HEAD*" ) );
    $list867 = ConsesLow.list( makeSymbol( "*HTML-BLINK-HEAD*" ), makeSymbol( "*HTML-BLINK-TAIL*" ) );
    $list868 = ConsesLow.list( makeSymbol( "*HTML-COMMENT-HEAD*" ), makeSymbol( "*HTML-COMMENT-TAIL*" ) );
    $list869 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&KEY" ), makeSymbol( "FRAMEBORDER" ), makeSymbol( "NORESIZE" ), makeSymbol( "SRC" ), makeSymbol( "SCROLLING" ), makeSymbol( "MARGINHEIGHT" ), makeSymbol(
        "MARGINWIDTH" ) );
    $list870 = ConsesLow.list( makeKeyword( "FRAMEBORDER" ), makeKeyword( "NORESIZE" ), makeKeyword( "SRC" ), makeKeyword( "SCROLLING" ), makeKeyword( "MARGINHEIGHT" ), makeKeyword( "MARGINWIDTH" ) );
    $kw871$FRAMEBORDER = makeKeyword( "FRAMEBORDER" );
    $kw872$NORESIZE = makeKeyword( "NORESIZE" );
    $kw873$SCROLLING = makeKeyword( "SCROLLING" );
    $kw874$MARGINHEIGHT = makeKeyword( "MARGINHEIGHT" );
    $kw875$MARGINWIDTH = makeKeyword( "MARGINWIDTH" );
    $list876 = ConsesLow.list( makeSymbol( "*HTML-FRAME-NAME*" ) );
    $list877 = ConsesLow.list( makeSymbol( "*HTML-FRAME-FRAMEBORDER*" ) );
    $list878 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-FRAME-NORESIZE*" ) ) );
    $list879 = ConsesLow.list( makeSymbol( "*HTML-FRAME-SRC*" ) );
    $list880 = ConsesLow.list( makeSymbol( "*HTML-FRAME-SCROLLING*" ) );
    $list881 = ConsesLow.list( makeSymbol( "*HTML-FRAME-MARGINHEIGHT*" ) );
    $list882 = ConsesLow.list( makeSymbol( "*HTML-FRAME-MARGINWIDTH*" ) );
    $list883 = ConsesLow.list( makeSymbol( "*HTML-FRAME-HEAD*" ) );
    $sym884$HTML_FANCY_FRAME = makeSymbol( "HTML-FANCY-FRAME" );
    $list885 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "COLS" ), makeSymbol( "ROWS" ), makeSymbol( "FRAMEBORDER" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list886 = ConsesLow.list( makeKeyword( "COLS" ), makeKeyword( "ROWS" ), makeKeyword( "FRAMEBORDER" ) );
    $list887 = ConsesLow.list( makeSymbol( "*HTML-FRAMESET-COLS*" ) );
    $list888 = ConsesLow.list( makeSymbol( "*HTML-FRAMESET-ROWS*" ) );
    $list889 = ConsesLow.list( makeSymbol( "*HTML-FRAMESET-FRAMEBORDER*" ) );
    $list890 = ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "HTML-INSIDE-BODY-P" ) ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Cannot have a FRAMESET tag inside a BODY tag." ) ) );
    $list891 = ConsesLow.list( makeSymbol( "*HTML-FRAMESET-HEAD*" ), makeSymbol( "*HTML-FRAMESET-TAIL*" ) );
    $sym892$HTML_FANCY_FRAMESET = makeSymbol( "HTML-FANCY-FRAMESET" );
    $list893 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "SRC" ), makeSymbol( "NAME" ), makeSymbol( "WIDTH" ), makeSymbol( "HEIGHT" ), makeSymbol( "ALIGN" ), makeSymbol(
        "FRAMEBORDER" ), makeSymbol( "MARGINWIDTH" ), makeSymbol( "MARGINHEIGHT" ), makeSymbol( "SCROLLING" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list894 = ConsesLow.list( new SubLObject[] { makeKeyword( "SRC" ), makeKeyword( "NAME" ), makeKeyword( "WIDTH" ), makeKeyword( "HEIGHT" ), makeKeyword( "ALIGN" ), makeKeyword( "FRAMEBORDER" ), makeKeyword(
        "MARGINWIDTH" ), makeKeyword( "MARGINHEIGHT" ), makeKeyword( "SCROLLING" )
    } );
    $list895 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-SRC*" ) );
    $list896 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-NAME*" ) );
    $list897 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-WIDTH*" ) );
    $list898 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-HEIGHT*" ) );
    $list899 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-ALIGN*" ) );
    $list900 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-FRAMEBORDER*" ) );
    $list901 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-MARGINWIDTH*" ) );
    $list902 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-MARGINHEIGHT*" ) );
    $list903 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-SCROLLING*" ) );
    $list904 = ConsesLow.list( makeSymbol( "*HTML-IFRAME-HEAD*" ), makeSymbol( "*HTML-IFRAME-TAIL*" ) );
    $list905 = ConsesLow.list( new SubLObject[] { makeSymbol( "SRC" ), makeSymbol( "&KEY" ), makeSymbol( "NAME" ), makeSymbol( "ID" ), makeSymbol( "CLASS" ), makeSymbol( "ISMAP" ), makeSymbol( "HEIGHT" ), makeSymbol(
        "WIDTH" ), makeSymbol( "ALT" ), makeSymbol( "ALIGN" ), makeSymbol( "BORDER" ), makeSymbol( "STYLE" )
    } );
    $list906 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "ID" ), makeKeyword( "CLASS" ), makeKeyword( "ISMAP" ), makeKeyword( "HEIGHT" ), makeKeyword( "WIDTH" ), makeKeyword( "ALT" ),
      makeKeyword( "ALIGN" ), makeKeyword( "BORDER" ), makeKeyword( "STYLE" )
    } );
    $kw907$ISMAP = makeKeyword( "ISMAP" );
    $list908 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-SRC*" ) );
    $list909 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-NAME*" ) );
    $list910 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-SIMPLE-ATTRIBUTE" ), makeSymbol( "*HTML-IMAGE-ISMAP*" ) ) );
    $list911 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-HEIGHT*" ) );
    $list912 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-WIDTH*" ) );
    $list913 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-ALT*" ) );
    $list914 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-ALIGN*" ) );
    $list915 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-BORDER*" ) );
    $list916 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-STYLE*" ) );
    $list917 = ConsesLow.list( makeSymbol( "*HTML-IMAGE-HEAD*" ), makeSymbol( "*HTML-IMAGE-TAIL*" ) );
    $list918 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-MARKUP-BODY" ) ) );
    $list919 = ConsesLow.list( new SubLObject[] { makeSymbol( "FILENAME" ), makeSymbol( "&KEY" ), makeSymbol( "TYPE" ), makeSymbol( "NAME" ), makeSymbol( "ID" ), makeSymbol( "CLASS" ), makeSymbol( "ISMAP" ), makeSymbol(
        "HEIGHT" ), makeSymbol( "WIDTH" ), makeSymbol( "ALT" ), makeSymbol( "ALIGN" ), makeSymbol( "BORDER" )
    } );
    $list920 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "NAME" ), makeKeyword( "ID" ), makeKeyword( "CLASS" ), makeKeyword( "ISMAP" ), makeKeyword( "HEIGHT" ), makeKeyword( "WIDTH" ),
      makeKeyword( "ALT" ), makeKeyword( "ALIGN" ), makeKeyword( "BORDER" )
    } );
    $sym921$DATA_SRC = makeUninternedSymbol( "DATA-SRC" );
    $sym922$HTML_EMBEDDED_IMAGE_DATA_SRC = makeSymbol( "HTML-EMBEDDED-IMAGE-DATA-SRC" );
    $sym923$HTML_FANCY_IMAGE = makeSymbol( "HTML-FANCY-IMAGE" );
    $sym924$HTML_EMBEDDED_IMAGE = makeSymbol( "HTML-EMBEDDED-IMAGE" );
    $str925$data__A_base64_ = makeString( "data:~A;base64," );
    $int926$76 = makeInteger( 76 );
    $list927 = ConsesLow.list( makeSymbol( "*HTML-MAP-HEAD*" ), makeSymbol( "*HTML-MAP-TAIL*" ) );
    $list928 = ConsesLow.list( makeSymbol( "*HTML-MAP-NAME*" ) );
    $sym929$HTML_FANCY_MAP = makeSymbol( "HTML-FANCY-MAP" );
    $list930 = ConsesLow.list( makeSymbol( "*HTML-NO-BREAK-HEAD*" ), makeSymbol( "*HTML-NO-BREAK-TAIL*" ) );
    $list931 = ConsesLow.list( makeSymbol( "*HTML-NO-FRAMES-HEAD*" ), makeSymbol( "*HTML-NO-FRAMES-TAIL*" ) );
    $list932 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "CLASSID" ), makeSymbol( "CODEBASE" ), makeSymbol( "CODETYPE" ), makeSymbol( "DATA" ), makeSymbol( "TYPE" ), makeSymbol(
        "ARCHIVE" ), makeSymbol( "ID" ), makeSymbol( "CLASS" ), makeSymbol( "ALIGN" ), makeSymbol( "WIDTH" ), makeSymbol( "HEIGHT" ), makeSymbol( "BORDER" ), makeSymbol( "HSPACE" ), makeSymbol( "VSPACE" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list933 = ConsesLow.list( new SubLObject[] { makeKeyword( "CLASSID" ), makeKeyword( "CODEBASE" ), makeKeyword( "CODETYPE" ), makeKeyword( "DATA" ), makeKeyword( "TYPE" ), makeKeyword( "ARCHIVE" ), makeKeyword(
        "ID" ), makeKeyword( "CLASS" ), makeKeyword( "ALIGN" ), makeKeyword( "WIDTH" ), makeKeyword( "HEIGHT" ), makeKeyword( "BORDER" ), makeKeyword( "HSPACE" ), makeKeyword( "VSPACE" )
    } );
    $kw934$CLASSID = makeKeyword( "CLASSID" );
    $kw935$CODETYPE = makeKeyword( "CODETYPE" );
    $kw936$DATA = makeKeyword( "DATA" );
    $kw937$HSPACE = makeKeyword( "HSPACE" );
    $kw938$VSPACE = makeKeyword( "VSPACE" );
    $list939 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-CLASSID*" ) );
    $list940 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-CODEBASE*" ) );
    $list941 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-CODETYPE*" ) );
    $list942 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-DATA*" ) );
    $list943 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-TYPE*" ) );
    $list944 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-ARCHIVE*" ) );
    $list945 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-ID*" ) );
    $list946 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-CLASS*" ) );
    $list947 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-ALIGN*" ) );
    $list948 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-WIDTH*" ) );
    $list949 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-HEIGHT*" ) );
    $list950 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-BORDER*" ) );
    $list951 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-HSPACE*" ) );
    $list952 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-VSPACE*" ) );
    $list953 = ConsesLow.list( makeSymbol( "*HTML-OBJECT-HEAD*" ), makeSymbol( "*HTML-OBJECT-TAIL*" ) );
    $list954 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "LANGUAGE" ), makeSymbol( "SRC" ), makeSymbol( "TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list955 = ConsesLow.list( makeKeyword( "LANGUAGE" ), makeKeyword( "SRC" ), makeKeyword( "TYPE" ) );
    $kw956$LANGUAGE = makeKeyword( "LANGUAGE" );
    $list957 = ConsesLow.list( makeSymbol( "*HTML-SCRIPT-LANGUAGE*" ) );
    $list958 = ConsesLow.list( makeSymbol( "*HTML-SCRIPT-SRC*" ) );
    $list959 = ConsesLow.list( makeSymbol( "*HTML-SCRIPT-TYPE*" ) );
    $list960 = ConsesLow.list( makeSymbol( "*HTML-SCRIPT-HEAD*" ), makeSymbol( "*HTML-SCRIPT-TAIL*" ) );
    $sym961$HTML_FANCY_SCRIPT = makeSymbol( "HTML-FANCY-SCRIPT" );
    $list962 = ConsesLow.list( makeKeyword( "LANGUAGE" ), makeSymbol( "*HTML-SCRIPT-JAVASCRIPT*" ) );
    $list963 = ConsesLow.list( makeSymbol( "*HTML-NOSCRIPT-HEAD*" ), makeSymbol( "*HTML-NOSCRIPT-TAIL*" ) );
    $list964 = ConsesLow.list( makeSymbol( "URL-BODY" ), makeSymbol( "LINK-BODY" ) );
    $list965 = ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString( "~A?" ), makeSymbol( "*CYC-CGI-PROGRAM*" ) );
    $list966 = ConsesLow.list( makeSymbol( "*CYC-CGI-PROGRAM*" ) );
    $list967 = ConsesLow.list( makeSymbol( "*CYC-CGI-PROGRAM*" ), makeSymbol( "*HTML-FORM-METHOD-POST*" ) );
    $list968 = ConsesLow.list( ConsesLow.list( makeSymbol( "HANDLER-NAME" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "VALUE" ), T ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym969$HTML_BASIC_CYC_FORM = makeSymbol( "HTML-BASIC-CYC-FORM" );
    $sym970$HTML_HIDDEN_INPUT = makeSymbol( "HTML-HIDDEN-INPUT" );
    $list971 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "COLS" ), makeSymbol( "ROWS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym972$HTML_FANCY_TEXTAREA = makeSymbol( "HTML-FANCY-TEXTAREA" );
    $list973 = ConsesLow.list( makeKeyword( "WRAP" ), T );
    $list974 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "SIZE" ), makeSymbol( "MULTIPLE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym975$HTML_FANCY_SELECT = makeSymbol( "HTML-FANCY-SELECT" );
    $list976 = ConsesLow.list( ConsesLow.list( makeSymbol( "SELECTED?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym977$HTML_FANCY_OPTION = makeSymbol( "HTML-FANCY-OPTION" );
    $list978 = ConsesLow.list( ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "CAPTION" ), makeString( "" ) ), ConsesLow.list( makeSymbol( "ALIGN" ), makeKeyword( "TOP" ) ), ConsesLow.list(
        makeSymbol( "BORDER" ), TWO_INTEGER ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $kw979$TOP = makeKeyword( "TOP" );
    $sym980$HTML_TABLE_CAPTION = makeSymbol( "HTML-TABLE-CAPTION" );
    $list981 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "COLS" ), makeSymbol( "ROWS" ), makeSymbol( "CYCL-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym982$ID_NUM = makeUninternedSymbol( "ID-NUM" );
    $sym983$INPUT_ID = makeUninternedSymbol( "INPUT-ID" );
    $sym984$RESULT_ID = makeUninternedSymbol( "RESULT-ID" );
    $sym985$AUTOCOMPLETE_ID = makeUninternedSymbol( "AUTOCOMPLETE-ID" );
    $list986 = ConsesLow.list( makeSymbol( "NEXT-HTML-ID-DEFINED?" ) );
    $list987 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEXT-HTML-ID" ) ) );
    $sym988$FORMAT_NIL = makeSymbol( "FORMAT-NIL" );
    $str989$autocomplete__A = makeString( "autocomplete-~A" );
    $str990$input__A = makeString( "input-~A" );
    $str991$autocomplete_results__A = makeString( "autocomplete-results-~A" );
    $sym992$HTML_FANCY_DIV = makeSymbol( "HTML-FANCY-DIV" );
    $list993 = ConsesLow.list( makeKeyword( "CLASS" ), makeString( "yui-ac" ) );
    $str994$yui_ac_input = makeString( "yui-ac-input" );
    $list995 = ConsesLow.list( makeKeyword( "STYLE" ), makeString( "position:static" ) );
    $list996 = ConsesLow.list( makeKeyword( "CLASS" ), makeString( "yui-ac-container" ) );
    $sym997$HTML_PRINT_JS_AUTOCOMPLETE_SETUP_INT = makeSymbol( "HTML-PRINT-JS-AUTOCOMPLETE-SETUP-INT" );
    $list998 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list999 = ConsesLow.list( makeSymbol( "STRING-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1000$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym1001$STREAM = makeUninternedSymbol( "STREAM" );
    $sym1002$CWITH_OUTPUT_TO_STRING = makeSymbol( "CWITH-OUTPUT-TO-STRING" );
    $sym1003$WITH_HTML_OUTPUT_TO_STREAM = makeSymbol( "WITH-HTML-OUTPUT-TO-STREAM" );
    $sym1004$WITH_HTML_OUTPUT_TO_STRING = makeSymbol( "WITH-HTML-OUTPUT-TO-STRING" );
    $sym1005$CONVERT_HTML_TO_TEXT = makeSymbol( "CONVERT-HTML-TO-TEXT" );
    $list1006 = ConsesLow.list( makeSymbol( "MACHINE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1007$STATE_VAR = makeUninternedSymbol( "STATE-VAR" );
    $sym1008$LOCK_VAR = makeUninternedSymbol( "LOCK-VAR" );
    $sym1009$VARIABLES = makeUninternedSymbol( "VARIABLES" );
    $sym1010$VALUES = makeUninternedSymbol( "VALUES" );
    $sym1011$HTML_MACHINE_STATE = makeSymbol( "HTML-MACHINE-STATE" );
    $sym1012$HTML_MACHINE_STATE_LOCK = makeSymbol( "HTML-MACHINE-STATE-LOCK" );
    $sym1013$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym1014$HTML_MACHINE_STATE_VARIABLES = makeSymbol( "HTML-MACHINE-STATE-VARIABLES" );
    $sym1015$HTML_MACHINE_STATE_VALUES = makeSymbol( "HTML-MACHINE-STATE-VALUES" );
    $sym1016$CPROGV = makeSymbol( "CPROGV" );
    $sym1017$SNAPSHOT_HTML_STATE = makeSymbol( "SNAPSHOT-HTML-STATE" );
    $kw1018$HTML_PARAMETER_ENTRY_FORMAT = makeKeyword( "HTML-PARAMETER-ENTRY-FORMAT" );
    $list1019 = ConsesLow.list( makeSymbol( "PARAMETER" ), makeSymbol( "ENTRY-FORMAT" ) );
    $sym1020$SET_HTML_PARAMETER_ENTRY_FORMAT = makeSymbol( "SET-HTML-PARAMETER-ENTRY-FORMAT" );
    $sym1021$QUOTE = makeSymbol( "QUOTE" );
    $sym1022$_HTML_HANDLER_PROPERTY_ = makeSymbol( "*HTML-HANDLER-PROPERTY*" );
    $kw1023$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym1024$_XML_HANDLER_PROPERTY_ = makeSymbol( "*XML-HANDLER-PROPERTY*" );
    $kw1025$XML_HANDLER = makeKeyword( "XML-HANDLER" );
    $sym1026$_JSON_HANDLER_PROPERTY_ = makeSymbol( "*JSON-HANDLER-PROPERTY*" );
    $kw1027$JSON_HANDLER = makeKeyword( "JSON-HANDLER" );
    $list1028 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "TYPE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str1029$HTML_handler__A_has_an_invalid_ar = makeString( "HTML handler ~A has an invalid arglist of:~%   ~S~%Use DEFINE instead." );
    $sym1030$DEFINE = makeSymbol( "DEFINE" );
    $sym1031$NOTE_CGI_HANDLER_FUNCTION = makeSymbol( "NOTE-CGI-HANDLER-FUNCTION" );
    $sym1032$DEFINE_HTML_HANDLER = makeSymbol( "DEFINE-HTML-HANDLER" );
    $sym1033$_HANDLER_MIME_TYPES_ = makeSymbol( "*HANDLER-MIME-TYPES*" );
    $int1034$200 = makeInteger( 200 );
    $list1035 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "ARGLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1036$DEFINE_CGI_HANDLER = makeSymbol( "DEFINE-CGI-HANDLER" );
    $sym1037$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym1038$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $list1039 = ConsesLow.list( makeSymbol( "SPECS" ), makeSymbol( "ARGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1040$ALIST = makeUninternedSymbol( "ALIST" );
    $list1041 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&KEY" ), makeSymbol( "READER" ), makeSymbol( "TYPE-PRED" ), makeSymbol( "NAME" ), makeSymbol( "COLLECT" ), ConsesLow.list( makeSymbol( "TEST" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STRING-EQUAL" ) ) ) ) );
    $list1042 = ConsesLow.list( makeKeyword( "READER" ), makeKeyword( "TYPE-PRED" ), makeKeyword( "NAME" ), makeKeyword( "COLLECT" ), makeKeyword( "TEST" ) );
    $kw1043$READER = makeKeyword( "READER" );
    $kw1044$TYPE_PRED = makeKeyword( "TYPE-PRED" );
    $kw1045$COLLECT = makeKeyword( "COLLECT" );
    $kw1046$TEST = makeKeyword( "TEST" );
    $list1047 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STRING-EQUAL" ) );
    $sym1048$CURRENT = makeUninternedSymbol( "CURRENT" );
    $sym1049$CDO = makeSymbol( "CDO" );
    $sym1050$CDR = makeSymbol( "CDR" );
    $sym1051$NULL = makeSymbol( "NULL" );
    $sym1052$FUNCALL = makeSymbol( "FUNCALL" );
    $sym1053$CAAR = makeSymbol( "CAAR" );
    $sym1054$CPUSH = makeSymbol( "CPUSH" );
    $sym1055$CAR = makeSymbol( "CAR" );
    $sym1056$CDAR = makeSymbol( "CDAR" );
    $sym1057$VAL = makeUninternedSymbol( "VAL" );
    $sym1058$CADR = makeSymbol( "CADR" );
    $sym1059$ASSOC = makeSymbol( "ASSOC" );
    $sym1060$CSETF = makeSymbol( "CSETF" );
    $sym1061$PUNLESS = makeSymbol( "PUNLESS" );
    $sym1062$ERROR = makeSymbol( "ERROR" );
    $str1063$HTML_argument_error___S_should_be = makeString( "HTML argument error: ~S should be ~S." );
    $list1064 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STRING-EQUAL" ) ) );
    $sym1065$REMOVE_IF_NOT = makeSymbol( "REMOVE-IF-NOT" );
    $list1066 = ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "CONSP" ) );
    $list1067 = ConsesLow.list( makeSymbol( "STRONG?" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1068$STRONG_VAR = makeUninternedSymbol( "STRONG-VAR" );
    $sym1069$HEAD = makeUninternedSymbol( "HEAD" );
    $sym1070$TAIL = makeUninternedSymbol( "TAIL" );
    $list1071 = ConsesLow.list( makeSymbol( "*HTML-STRONG-HEAD*" ), makeSymbol( "*EMPTY-STRING*" ) );
    $list1072 = ConsesLow.list( makeSymbol( "*HTML-STRONG-TAIL*" ), makeSymbol( "*EMPTY-STRING*" ) );
  }
}
/*
 * 
 * Total time: 6643 ms
 * 
 */