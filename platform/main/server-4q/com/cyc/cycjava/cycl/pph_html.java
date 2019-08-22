package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.cb_parameters.cb_glob_id;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_escape;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_cycl_string;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_doc_string;
import static com.cyc.cycjava.cycl.html_utilities.html_string;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_html extends SubLTranslatedFile {
    public static final SubLFile me = new pph_html();

    public static final String myName = "com.cyc.cycjava.cycl.pph_html";

    public static final String myFingerPrint = "7cbcc8ce67ab0daac953d2f189e57a8ecd0127233681f7b6b58e3fcc006025dd";

    // defconstant
    private static final SubLSymbol $pph_old_citation_method_visual_indicator_html_color$ = makeSymbol("*PPH-OLD-CITATION-METHOD-VISUAL-INDICATOR-HTML-COLOR*");



    public static final SubLSymbol $sym1$HLMT_ = makeSymbol("HLMT?");

    private static final SubLSymbol $HTML_GENERATE_PHRASE = makeKeyword("HTML-GENERATE-PHRASE");







    private static final SubLString $str6$cb_cf = makeString("cb-cf");

    private static final SubLSymbol PARAPHRASE_LINK_TO_CB_START = makeSymbol("PARAPHRASE-LINK-TO-CB-START");



    private static final SubLSymbol HTML_PG_ANCHOR_TEXT = makeSymbol("HTML-PG-ANCHOR-TEXT");

    private static final SubLList $list10 = list(makeSymbol("HTML-GENERATE-ANCHOR-TEXT"));

    private static final SubLString $$$paraphrase = makeString("paraphrase");

    private static final SubLString $$$string = makeString("string");



    private static final SubLString $str14$sub_paraphrase = makeString("sub-paraphrase");

    private static final SubLString $str15$open_tag = makeString("open-tag");

    private static final SubLString $str16$close_tag = makeString("close-tag");

    private static final SubLString $str17$arg_position = makeString("arg-position");

    private static final SubLString $str18$cycl_id = makeString("cycl-id");

    private static final SubLString $$$offset = makeString("offset");

    private static final SubLString $str20$_a_href_ = makeString("<a href=");

    private static final SubLString $str21$_ = makeString(">");

    private static final SubLString $str22$__a_ = makeString("</a>");

    private static final SubLString $$$naut = makeString("naut");

    private static final SubLSymbol PPH_NAUT_ID_FN = makeSymbol("PPH-NAUT-ID-FN");

    private static final SubLList $list25 = list(reader_make_constant_shell(makeString("URLFn")), list(makeKeyword("TEST"), makeSymbol("URL-P")));

    private static final SubLSymbol $sym26$_URL = makeSymbol("?URL");

    private static final SubLObject $$salientURL = reader_make_constant_shell(makeString("salientURL"));

    private static final SubLList $list28 = list(makeSymbol("?URL"));

    private static final SubLSymbol GET_TERM_ID = makeSymbol("GET-TERM-ID");



    private static final SubLString $str31$_a_href__ = makeString("<a href=\"");

    private static final SubLString $str32$_ = makeString("?");

    private static final SubLString $str33$_ = makeString("&");

    private static final SubLString $str34$__target__ = makeString("\" target=\"");

    public static final SubLString $str35$__ = makeString("\">");

    private static final SubLString $str36$__Adding_tag_to__S_for__S___ = makeString("~&Adding tag to ~S for ~S.~%");

    private static final SubLString $$$href = makeString("href");

    private static final SubLString $str38$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str39$__ = makeString(") ");

    private static final SubLString $str40$__Adding_tag_to_string_containing = makeString("~&Adding tag to string containing tag: ~S ~S~%");

    private static final SubLSymbol $sym41$_ = makeSymbol("<");



    private static final SubLSymbol PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS = makeSymbol("PPH-FOOTNOTE-STRING-FOR-SORTED-SOURCE-IDS");

    public static final SubLList $list44 = cons(makeSymbol("SOURCE-ID"), makeSymbol("SOURCE"));

    private static final SubLString $str45$__ = makeString(", ");

    private static final SubLString $str46$Source__ = makeString("Source: ");

    private static final SubLString $str47$_ = makeString("[");

    private static final SubLString $str48$_ = makeString("]");

    private static final SubLObject $$CycorpStyleSpecificationStandard = reader_make_constant_shell(makeString("CycorpStyleSpecificationStandard"));

    private static final SubLObject $$HypertextMarkupLanguage = reader_make_constant_shell(makeString("HypertextMarkupLanguage"));



    private static final SubLString $str52$__strengthened_by_Cyc_ = makeString(" (strengthened by Cyc)");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$sourcefootnote = makeString("sourcefootnote");



    private static final SubLString $str56$__D_ = makeString("[~D]");

    private static final SubLList $list57 = list(list(makeKeyword("TEST"), makeSymbol("POSITIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("CYCL-TERM-P")), list(makeKeyword("TEST"), makeSymbol("BOOLEANP")));

    private static final SubLList $list58 = list(makeSymbol("OPEN-TAG"), makeSymbol("CLOSE-TAG"));

    private static final SubLSymbol HTML_GENERATE_EXPONENT_NAUT = makeSymbol("HTML-GENERATE-EXPONENT-NAUT");





    private static final SubLList $list62 = list(makeSymbol("BASE"), makeSymbol("EXPONENT"));





    public static SubLObject html_generate_phrase(final SubLObject v_object, SubLObject nl_preds, SubLObject determiner, SubLObject language_mt, SubLObject domain_mt) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (determiner == UNPROVIDED) {
            determiner = NIL;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmtP(language_mt) : "hlmt.hlmtP(language_mt) " + "CommonSymbols.NIL != hlmt.hlmtP(language_mt) " + language_mt;
        assert NIL != hlmt.hlmtP(domain_mt) : "hlmt.hlmtP(domain_mt) " + "CommonSymbols.NIL != hlmt.hlmtP(domain_mt) " + domain_mt;
        SubLObject ans = NIL;
        SubLObject pred = NIL;
        SubLObject justifications = NIL;
        SubLObject output_list = NIL;
        SubLObject demerits = NIL;
        SubLObject v_pph_phrase = NIL;
        final SubLObject _prev_bind_0 = pph_utilities.$pph_current_environment$.currentBinding(thread);
        try {
            pph_utilities.$pph_current_environment$.bind(pph_utilities.find_or_create_pph_context(), thread);
            pph_utilities.pph_push_environment($HTML_GENERATE_PHRASE);
            try {
                thread.resetMultipleValues();
                final SubLObject ans_$1 = pph_main.generate_phrase_no_checks(v_object, nl_preds, determiner, language_mt, domain_mt, $HTML, UNPROVIDED, UNPROVIDED);
                final SubLObject pred_$2 = thread.secondMultipleValue();
                final SubLObject justifications_$3 = thread.thirdMultipleValue();
                final SubLObject output_list_$4 = thread.fourthMultipleValue();
                final SubLObject demerits_$5 = thread.fifthMultipleValue();
                final SubLObject v_pph_phrase_$6 = thread.sixthMultipleValue();
                thread.resetMultipleValues();
                ans = ans_$1;
                pred = pred_$2;
                justifications = justifications_$3;
                output_list = output_list_$4;
                demerits = demerits_$5;
                v_pph_phrase = v_pph_phrase_$6;
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pph_utilities.pph_pop_environment();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            pph_utilities.$pph_current_environment$.rebind(_prev_bind_0, thread);
        }
        return values(ans, pred, justifications, output_list, demerits, v_pph_phrase);
    }

    public static SubLObject html_generate_text(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        assert NIL != hlmt.hlmtP(language_mt) : "hlmt.hlmtP(language_mt) " + "CommonSymbols.NIL != hlmt.hlmtP(language_mt) " + language_mt;
        assert NIL != hlmt.hlmtP(domain_mt) : "hlmt.hlmtP(domain_mt) " + "CommonSymbols.NIL != hlmt.hlmtP(domain_mt) " + domain_mt;
        return pph_main.generate_text_wXsentential_force(v_object, $DECLARATIVE, nl_preds, language_mt, domain_mt, $HTML, UNPROVIDED);
    }

    public static SubLObject html_generate_question(final SubLObject v_object, SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt) {
        if (nl_preds == UNPROVIDED) {
            nl_preds = $ANY;
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        assert NIL != hlmt.hlmtP(language_mt) : "hlmt.hlmtP(language_mt) " + "CommonSymbols.NIL != hlmt.hlmtP(language_mt) " + language_mt;
        assert NIL != hlmt.hlmtP(domain_mt) : "hlmt.hlmtP(domain_mt) " + "CommonSymbols.NIL != hlmt.hlmtP(domain_mt) " + domain_mt;
        return pph_main.generate_text_wXsentential_force(v_object, $INTERROGATIVE, nl_preds, language_mt, domain_mt, $HTML, UNPROVIDED);
    }

    public static SubLObject paraphrase_link_to_cb_start(final SubLObject arg) {
        final SubLObject id_string = arg.first();
        return cb_frames.cb_start(list($str6$cb_cf, id_string));
    }

    public static SubLObject html_generate_anchor_phrase(final SubLObject cycl_object, SubLObject function, SubLObject target) {
        if (function == UNPROVIDED) {
            function = PARAPHRASE_LINK_TO_CB_START;
        }
        if (target == UNPROVIDED) {
            target = html_macros.$html_top_target$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject phrase = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind(NIL != function ? function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
            pph_vars.$html_generation_target$.bind(NIL != target ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
            phrase = html_generate_phrase(cycl_object, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }

    public static SubLObject html_phrase_with_target(final SubLObject cycl_object, SubLObject function, SubLObject target) {
        if (function == UNPROVIDED) {
            function = PARAPHRASE_LINK_TO_CB_START;
        }
        if (target == UNPROVIDED) {
            target = html_macros.$html_top_target$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!target.isString()) {
            target = cb_frame_name(target);
        }
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(NIL, thread);
            html_string(string_utilities.str(html_generate_anchor_phrase(cycl_object, function, target)), UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject html_pg_anchor_text(final SubLObject cycl_object, SubLObject function, SubLObject target) {
        if (function == UNPROVIDED) {
            function = PARAPHRASE_LINK_TO_CB_START;
        }
        if (target == UNPROVIDED) {
            target = html_macros.$html_top_target$.getGlobalValue();
        }
        return html_generate_anchor_text(cycl_object, function, target, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject html_generate_anchor_text(final SubLObject cycl_object, SubLObject function, SubLObject target, SubLObject language_mt, SubLObject domain_mt) {
        if (function == UNPROVIDED) {
            function = PARAPHRASE_LINK_TO_CB_START;
        }
        if (target == UNPROVIDED) {
            target = html_macros.$html_top_target$.getGlobalValue();
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject text = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$constant_link_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$html_generation_target$.currentBinding(thread);
        try {
            pph_vars.$constant_link_function$.bind(NIL != function ? function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
            pph_vars.$html_generation_target$.bind(NIL != target ? target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
            text = html_generate_text(cycl_object, $ANY, language_mt, domain_mt);
        } finally {
            pph_vars.$html_generation_target$.rebind(_prev_bind_2, thread);
            pph_vars.$constant_link_function$.rebind(_prev_bind_0, thread);
        }
        return text;
    }

    public static SubLObject html_text_with_target(final SubLObject cycl_object, SubLObject function, SubLObject target, SubLObject language_mt, SubLObject domain_mt) {
        if (function == UNPROVIDED) {
            function = PARAPHRASE_LINK_TO_CB_START;
        }
        if (target == UNPROVIDED) {
            target = html_macros.$html_top_target$.getGlobalValue();
        }
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!target.isString()) {
            target = cb_frame_name(target);
        }
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(NIL, thread);
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            html_princ_doc_string(string_utilities.str(html_generate_anchor_text(cycl_object, function, target, UNPROVIDED, UNPROVIDED)), UNPROVIDED);
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject xml_output_pph_javalist(final SubLObject javalist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$paraphrase, list($$$string, pph_utilities.pph_javalist_string(javalist)), NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    SubLObject cdolist_list_var = pph_utilities.pph_javalist_items(javalist);
                    SubLObject item = NIL;
                    item = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        xml_utilities.xml_terpri();
                        xml_output_pph_javalist_item(item);
                        cdolist_list_var = cdolist_list_var.rest();
                        item = cdolist_list_var.first();
                    } 
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$8, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$paraphrase);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject xml_output_pph_javalist_item(final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal($str14$sub_paraphrase, pph_javalist_item_xml_attributes(item), T, NIL, $UNINITIALIZED);
            final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$9, thread);
            }
        } finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return item;
    }

    public static SubLObject pph_javalist_item_xml_attributes(final SubLObject item) {
        SubLObject attributes = list($$$string, pph_utilities.pph_javalist_item_string(item));
        final SubLObject open_tag = pph_utilities.pph_javalist_item_open_tag(item);
        if (NIL != open_tag) {
            attributes = append(attributes, list($str15$open_tag, open_tag));
        }
        final SubLObject close_tag = pph_utilities.pph_javalist_item_close_tag(item);
        if (NIL != close_tag) {
            attributes = append(attributes, list($str16$close_tag, close_tag));
        }
        final SubLObject arg_position = pph_utilities.pph_javalist_item_arg_position(item);
        if (NIL == pph_utilities.pph_unknown_arg_position_p(arg_position)) {
            attributes = append(attributes, list($str17$arg_position, arg_position));
        }
        final SubLObject cycl = pph_utilities.pph_javalist_item_cycl(item);
        if (NIL == pph_phrase.pph_empty_cycl_p(cycl)) {
            attributes = append(attributes, list($str18$cycl_id, kb_utilities.compact_hl_external_id_string(cycl)));
        }
        attributes = append(attributes, list($$$offset, pph_utilities.pph_javalist_item_start_char(item)));
        return attributes;
    }

    public static SubLObject pph_use_anchor_tags_for_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((pph_vars.$paraphrase_mode$.getDynamicValue(thread) == $HTML) && (NIL == pph_utilities.pph_nl_tagP(v_term)));
    }

    public static SubLObject pph_use_anchor_tags_for_arg_positionP(final SubLObject arg_position) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == pph_utilities.pph_unknown_arg_position_p(arg_position)) && ((NIL == pph_phrase.pph_arg0_position_p(arg_position)) || (NIL != pph_vars.$pph_link_arg0P$.getDynamicValue(thread))));
    }

    public static SubLObject pph_anchor_tags_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_vars.$pph_use_salient_urlP$.getDynamicValue(thread)) {
            final SubLObject salient_url = pph_get_salient_url(v_term);
            if (NIL != salient_url) {
                return values(cconcatenate($str20$_a_href_, new SubLObject[]{ format_nil.format_nil_s_no_copy(salient_url), $str21$_ }), $str22$__a_);
            }
        }
        final SubLObject open_tag = pph_html_open_tag_for_term(v_term);
        final SubLObject close_tag = (NIL != open_tag) ? pph_html_close_tag_for_term(v_term) : NIL;
        return values(open_tag, close_tag);
    }

    public static SubLObject pph_naut_id_fn(final SubLObject naut) {
        return NIL != narts_high.naut_p(naut) ? cconcatenate($$$naut, format_nil.format_nil_a_no_copy(cb_glob_id(naut))) : NIL;
    }

    public static SubLObject pph_get_salient_url(final SubLObject v_term) {
        SubLObject url_string = NIL;
        if (NIL == url_string) {
            SubLObject csome_list_var = pph_utilities.pph_ask_variable_new($sym26$_URL, listS($$salientURL, v_term, $list28), UNPROVIDED, UNPROVIDED);
            SubLObject url = NIL;
            url = csome_list_var.first();
            while ((NIL == url_string) && (NIL != csome_list_var)) {
                if (NIL != web_utilities.url_p(url)) {
                    url_string = url;
                } else
                    if (NIL != formula_pattern_match.formula_matches_pattern(url, $list25)) {
                        url_string = cycl_utilities.nat_arg1(url, UNPROVIDED);
                    }

                csome_list_var = csome_list_var.rest();
                url = csome_list_var.first();
            } 
        }
        return url_string;
    }

    public static SubLObject pph_get_term_id(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id_fn = (pph_vars.$html_generation_term_id_function$.getDynamicValue(thread).isFunctionSpec()) ? pph_vars.$html_generation_term_id_function$.getDynamicValue(thread) : GET_TERM_ID;
        return funcall(id_fn, v_term);
    }

    public static SubLObject pph_html_open_tag_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = pph_get_term_id(v_term);
        if ($NONE == pph_vars.$constant_link_function$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != fact_sheets.within_fact_sheet_paraphraseP()) {
            if (NIL == id) {
                return NIL;
            }
            return fact_sheets.fact_sheet_bogus_hyperlink_open_tag_for_term(v_term, id);
        } else {
            if (NIL != id) {
                return cconcatenate($str31$_a_href__, new SubLObject[]{ format_nil.format_nil_a_no_copy(system_parameters.$cyc_cgi_program$.getDynamicValue(thread)), $str32$_, format_nil.format_nil_a_no_copy(pph_vars.$constant_link_function$.getDynamicValue(thread)), $str33$_, format_nil.format_nil_a_no_copy(id), $str34$__target__, format_nil.format_nil_a_no_copy(pph_vars.$html_generation_target$.getDynamicValue(thread)), $str35$__ });
            }
            return NIL;
        }
    }

    public static SubLObject pph_html_close_tag_for_term(final SubLObject v_term) {
        return html_macros.$html_anchor_tail$.getGlobalValue();
    }

    public static SubLObject pph_html_includes_anchor_open_tagP(final SubLObject html) {
        return makeBoolean(html.isString() && (NIL != string_utilities.substringP(html_macros.$html_anchor_head$.getGlobalValue(), html, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_html_includes_anchor_close_tagP(final SubLObject html) {
        return makeBoolean(html.isString() && (NIL != string_utilities.substringP(html_macros.$html_anchor_tail$.getGlobalValue(), html, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject string_term_anchor(final SubLObject string, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str36$__Adding_tag_to__S_for__S___, string, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != string_utilities.substringP($$$href, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject new_format_string = cconcatenate($str38$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str39$__, format_nil.format_nil_a_no_copy($str40$__Adding_tag_to_string_containing) });
            pph_error.pph_handle_error(new_format_string, list(v_term, string));
        }
        SubLObject ans = string;
        final SubLObject id = misc_kb_utilities.get_term_id(v_term);
        if ((NIL == parsing_utilities.nl_tagP(v_term, UNPROVIDED)) && id.isInteger()) {
            ans = cconcatenate($str31$_a_href__, new SubLObject[]{ format_nil.format_nil_a_no_copy(system_parameters.$cyc_cgi_program$.getDynamicValue(thread)), $str32$_, format_nil.format_nil_a_no_copy(pph_vars.$constant_link_function$.getDynamicValue(thread)), $str33$_, format_nil.format_nil_a_no_copy(id), $str34$__target__, format_nil.format_nil_a_no_copy(pph_vars.$html_generation_target$.getDynamicValue(thread)), $str35$__, format_nil.format_nil_a_no_copy(string), $str22$__a_ });
        }
        return ans;
    }

    public static SubLObject pph_footnote_string_for_source_ids(final SubLObject source_ids) {
        final SubLObject sorted_ids = Sort.sort(copy_list(source_ids), symbol_function($sym41$_), symbol_function(CAR));
        return pph_footnote_string_for_sorted_source_ids(sorted_ids);
    }

    public static SubLObject pph_footnote_string_for_sorted_source_ids_internal(final SubLObject sorted_ids) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sorted_ids) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        SubLObject done_a_sourceP = NIL;
        SubLObject footnote_string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                SubLObject cdolist_list_var = sorted_ids;
                SubLObject source_id_and_source = NIL;
                source_id_and_source = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = source_id_and_source;
                    SubLObject source_id = NIL;
                    SubLObject source = NIL;
                    destructuring_bind_must_consp(current, datum, $list44);
                    source_id = current.first();
                    current = source = current.rest();
                    if (NIL != done_a_sourceP) {
                        html_princ($str45$__);
                    }
                    final SubLObject superscriptP = T;
                    pph_maybe_show_source_icon(source, $str46$Source__, superscriptP);
                    pph_html_citation_id_string(source_id, pph_vars.$pph_citation_format$.getDynamicValue(thread));
                    done_a_sourceP = T;
                    cdolist_list_var = cdolist_list_var.rest();
                    source_id_and_source = cdolist_list_var.first();
                } 
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            footnote_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return footnote_string;
    }

    public static SubLObject pph_footnote_string_for_sorted_source_ids(final SubLObject sorted_ids) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_footnote_string_for_sorted_source_ids_internal(sorted_ids);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sorted_ids, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(pph_footnote_string_for_sorted_source_ids_internal(sorted_ids)));
            memoization_state.caching_state_put(caching_state, sorted_ids, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pph_maybe_show_source_icon(SubLObject source, SubLObject alt_intro, SubLObject superscriptP) {
        if (alt_intro == UNPROVIDED) {
            alt_intro = string_utilities.$empty_string$.getGlobalValue();
        }
        if (superscriptP == UNPROVIDED) {
            superscriptP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject icon_path = sources.icon_path_for_source(source, UNPROVIDED);
        final SubLObject provenance = thread.secondMultipleValue();
        final SubLObject source_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != icon_path) {
            final SubLObject alternate_text = pph_alternate_text_for_source(source, provenance, source_type, alt_intro);
            if (NIL != superscriptP) {
                html_markup(html_macros.$html_superscript_head$.getGlobalValue());
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(icon_path);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alternate_text) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alternate_text);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
                html_markup(html_macros.$html_superscript_tail$.getGlobalValue());
            } else {
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(icon_path);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alternate_text) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alternate_text);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
        }
        return source;
    }

    public static SubLObject pph_alternate_text_for_source(SubLObject source, final SubLObject provenance, final SubLObject source_type, SubLObject intro) {
        if (intro == UNPROVIDED) {
            intro = string_utilities.$empty_string$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != source) {
            final SubLObject source_result = sources.source_citation_string(source, $ANY, $ANY);
            if (NIL != source_result) {
                return source_result;
            }
        }
        final SubLObject content = (NIL != source) ? source : NIL != provenance ? provenance : source_type;
        SubLObject alternate_text = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        try {
            pph_vars.$pph_terse_modeP$.bind(T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
            alternate_text = pph_main.generate_phrase(content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != alternate_text) {
            alternate_text = html_escape(cycl_string.cycl_string_to_utf8_string(alternate_text), T);
        }
        return cconcatenate($str47$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(intro), format_nil.format_nil_a_no_copy(NIL != alternate_text ? alternate_text : string_utilities.$empty_string$.getGlobalValue()), $str48$_ });
    }

    public static SubLObject pph_citation_string_new(SubLObject source) {
        return sources.source_citation_string(source, $$CycorpStyleSpecificationStandard, $$HypertextMarkupLanguage);
    }

    public static SubLObject pph_html_citation_string(final SubLObject citation, SubLObject type, SubLObject allow_web_linksP) {
        if (type == UNPROVIDED) {
            type = $SUPERSCRIPTS;
        }
        if (allow_web_linksP == UNPROVIDED) {
            allow_web_linksP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject source = pph_source_citation_source(citation);
        SubLObject citation_id_string = NIL;
        SubLObject citation_body_string = NIL;
        SubLObject new_implementation_succeededP = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                new_implementation_succeededP = pph_html_citation_string_int(source, allow_web_linksP);
                if (NIL != pph_source_citation_strengthenedP(citation)) {
                    html_princ($str52$__strengthened_by_Cyc_);
                }
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            citation_body_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                final SubLObject id = pph_source_citation_id(citation);
                if ((NIL != new_implementation_succeededP) || (NIL == deprecate_old_source_citation_formatP())) {
                    pph_html_citation_id_string(id, type);
                } else {
                    final SubLObject color_val = $pph_old_citation_method_visual_indicator_html_color$.getGlobalValue();
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != color_val) {
                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(color_val));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        pph_html_citation_id_string(id, type);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
                pph_maybe_show_source_icon(source, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            citation_id_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return cconcatenate(citation_id_string, new SubLObject[]{ $$$_, citation_body_string });
    }

    public static SubLObject deprecate_old_source_citation_formatP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(pph_vars.$pph_deprecate_old_source_citation_formatP$.getDynamicValue(thread));
    }

    public static SubLObject pph_html_citation_id_string(final SubLObject id, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$sourcefootnote);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (type.eql($SUPERSCRIPTS)) {
                html_markup(html_macros.$html_superscript_head$.getGlobalValue());
                html_princ(id);
                html_markup(html_macros.$html_superscript_tail$.getGlobalValue());
            } else
                if (type.eql($SQUARE_BRACKETS)) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str56$__D_, id);
                }

        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return id;
    }

    public static SubLObject pph_html_citation_string_int(SubLObject source, final SubLObject allow_web_linksP) {
        final SubLObject new_implementation_succeededP = pph_html_citation_string_int_new(source, allow_web_linksP);
        if (NIL == new_implementation_succeededP) {
            pph_html_citation_string_int_old(source, allow_web_linksP);
        }
        return new_implementation_succeededP;
    }

    public static SubLObject pph_html_citation_string_int_new(SubLObject source, final SubLObject allow_web_linksP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject citation_string = pph_citation_string_new(source);
        if (NIL != unicode_nauts.unicode_naut_p(citation_string, UNPROVIDED)) {
            citation_string = unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(citation_string, UNPROVIDED));
        }
        if (citation_string.isString()) {
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(NIL, thread);
                if (NIL != allow_web_linksP) {
                    html_princ_cycl_string(citation_string, UNPROVIDED, UNPROVIDED);
                } else {
                    html_princ(citation_string);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
        }
        return citation_string;
    }

    public static SubLObject pph_html_citation_string_int_old(SubLObject source, final SubLObject allow_web_linksP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_use_salient_urlP$.currentBinding(thread);
        try {
            pph_vars.$pph_use_salient_urlP$.bind(allow_web_linksP, thread);
            pph_proof.pph_show_term(source, UNPROVIDED, UNPROVIDED);
        } finally {
            pph_vars.$pph_use_salient_urlP$.rebind(_prev_bind_0, thread);
        }
        return source;
    }

    public static SubLObject pph_source_citation_p(final SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != pattern_match.tree_matches_pattern(v_object, $list57)));
    }

    public static SubLObject new_pph_source_citation(SubLObject source, final SubLObject id, SubLObject strengthenedP) {
        if (strengthenedP == UNPROVIDED) {
            strengthenedP = NIL;
        }
        return list(id, source, strengthenedP);
    }

    public static SubLObject pph_source_citation_id(final SubLObject citation) {
        return citation.first();
    }

    public static SubLObject pph_source_citation_source(final SubLObject citation) {
        return second(citation);
    }

    public static SubLObject pph_source_citation_strengthenedP(final SubLObject citation) {
        return third(citation);
    }

    public static SubLObject pph_phrase_italicize(final SubLObject phrase) {
        return pph_phrase.pph_phrase_add_html_tags(phrase, html_macros.$html_italic_head$.getGlobalValue(), html_macros.$html_italic_tail$.getGlobalValue());
    }

    public static SubLObject pph_phrase_output_item_italicize(final SubLObject output_item) {
        SubLObject current;
        final SubLObject datum = current = pph_data_structures.pph_phrase_output_item_html_tags(output_item);
        SubLObject open_tag = NIL;
        SubLObject close_tag = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        open_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        close_tag = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject new_open_tag = (open_tag.isString()) ? cconcatenate(html_macros.$html_italic_head$.getGlobalValue(), open_tag) : html_macros.$html_italic_head$.getGlobalValue();
            final SubLObject new_close_tag = (close_tag.isString()) ? cconcatenate(close_tag, html_macros.$html_italic_tail$.getGlobalValue()) : html_macros.$html_italic_tail$.getGlobalValue();
            pph_data_structures.pph_phrase_output_item_set_html_tags(output_item, new_open_tag, new_close_tag);
        } else {
            cdestructuring_bind_error(datum, $list58);
        }
        return output_item;
    }

    public static SubLObject pph_phrase_output_item_superscript(final SubLObject output_item) {
        SubLObject current;
        final SubLObject datum = current = pph_data_structures.pph_phrase_output_item_html_tags(output_item);
        SubLObject open_tag = NIL;
        SubLObject close_tag = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        open_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        close_tag = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject new_open_tag = (open_tag.isString()) ? cconcatenate(html_macros.$html_superscript_head$.getGlobalValue(), open_tag) : html_macros.$html_superscript_head$.getGlobalValue();
            final SubLObject new_close_tag = (close_tag.isString()) ? cconcatenate(close_tag, html_macros.$html_superscript_tail$.getGlobalValue()) : html_macros.$html_superscript_tail$.getGlobalValue();
            pph_data_structures.pph_phrase_output_item_set_html_tags(output_item, new_open_tag, new_close_tag);
        } else {
            cdestructuring_bind_error(datum, $list58);
        }
        return output_item;
    }

    public static SubLObject pph_phrase_output_item_subscript(final SubLObject output_item) {
        SubLObject current;
        final SubLObject datum = current = pph_data_structures.pph_phrase_output_item_html_tags(output_item);
        SubLObject open_tag = NIL;
        SubLObject close_tag = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        open_tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        close_tag = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject new_open_tag = (open_tag.isString()) ? cconcatenate(html_macros.$html_subscript_head$.getGlobalValue(), open_tag) : html_macros.$html_subscript_head$.getGlobalValue();
            final SubLObject new_close_tag = (close_tag.isString()) ? cconcatenate(close_tag, html_macros.$html_subscript_tail$.getGlobalValue()) : html_macros.$html_subscript_tail$.getGlobalValue();
            pph_data_structures.pph_phrase_output_item_set_html_tags(output_item, new_open_tag, new_close_tag);
        } else {
            cdestructuring_bind_error(datum, $list58);
        }
        return output_item;
    }

    public static SubLObject term_anchor(final SubLObject v_term) {
        final SubLObject name = misc_kb_utilities.coerce_name(v_term);
        return string_term_anchor(name, v_term);
    }

    public static SubLObject html_generate_exponent_naut(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($HTML.eql(pph_vars.$paraphrase_mode$.getDynamicValue(thread))) {
            final SubLObject naut = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.nat_args(naut, UNPROVIDED);
            SubLObject base = NIL;
            SubLObject exponent = NIL;
            destructuring_bind_must_consp(current, datum, $list62);
            base = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list62);
            exponent = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject output_list = list(pph_data_structures.new_pph_phrase_output_item(pph_main.generate_phrase_no_checks(base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pph_utilities.pph_arg_position_from_template($ARG1), base, UNPROVIDED, UNPROVIDED, UNPROVIDED), pph_phrase_output_item_superscript(pph_data_structures.new_pph_phrase_output_item(pph_main.generate_phrase_no_checks(exponent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pph_utilities.pph_arg_position_from_template($ARG2), exponent, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                pph_phrase.pph_phrase_set_output_list(phrase, output_list, UNPROVIDED);
                pph_phrase.pph_phrase_note_done(phrase);
                return output_list;
            }
            cdestructuring_bind_error(datum, $list62);
        }
        return NIL;
    }

    public static SubLObject declare_pph_html_file() {
        declareFunction(me, "html_generate_phrase", "HTML-GENERATE-PHRASE", 1, 4, false);
        declareFunction(me, "html_generate_text", "HTML-GENERATE-TEXT", 1, 3, false);
        declareFunction(me, "html_generate_question", "HTML-GENERATE-QUESTION", 1, 3, false);
        declareFunction(me, "paraphrase_link_to_cb_start", "PARAPHRASE-LINK-TO-CB-START", 1, 0, false);
        declareFunction(me, "html_generate_anchor_phrase", "HTML-GENERATE-ANCHOR-PHRASE", 1, 2, false);
        declareFunction(me, "html_phrase_with_target", "HTML-PHRASE-WITH-TARGET", 1, 2, false);
        declareFunction(me, "html_pg_anchor_text", "HTML-PG-ANCHOR-TEXT", 1, 2, false);
        declareFunction(me, "html_generate_anchor_text", "HTML-GENERATE-ANCHOR-TEXT", 1, 4, false);
        declareFunction(me, "html_text_with_target", "HTML-TEXT-WITH-TARGET", 1, 4, false);
        declareFunction(me, "xml_output_pph_javalist", "XML-OUTPUT-PPH-JAVALIST", 1, 0, false);
        declareFunction(me, "xml_output_pph_javalist_item", "XML-OUTPUT-PPH-JAVALIST-ITEM", 1, 0, false);
        declareFunction(me, "pph_javalist_item_xml_attributes", "PPH-JAVALIST-ITEM-XML-ATTRIBUTES", 1, 0, false);
        declareFunction(me, "pph_use_anchor_tags_for_termP", "PPH-USE-ANCHOR-TAGS-FOR-TERM?", 1, 0, false);
        declareFunction(me, "pph_use_anchor_tags_for_arg_positionP", "PPH-USE-ANCHOR-TAGS-FOR-ARG-POSITION?", 1, 0, false);
        declareFunction(me, "pph_anchor_tags_for_term", "PPH-ANCHOR-TAGS-FOR-TERM", 1, 0, false);
        declareFunction(me, "pph_naut_id_fn", "PPH-NAUT-ID-FN", 1, 0, false);
        declareFunction(me, "pph_get_salient_url", "PPH-GET-SALIENT-URL", 1, 0, false);
        declareFunction(me, "pph_get_term_id", "PPH-GET-TERM-ID", 1, 0, false);
        declareFunction(me, "pph_html_open_tag_for_term", "PPH-HTML-OPEN-TAG-FOR-TERM", 1, 0, false);
        declareFunction(me, "pph_html_close_tag_for_term", "PPH-HTML-CLOSE-TAG-FOR-TERM", 1, 0, false);
        declareFunction(me, "pph_html_includes_anchor_open_tagP", "PPH-HTML-INCLUDES-ANCHOR-OPEN-TAG?", 1, 0, false);
        declareFunction(me, "pph_html_includes_anchor_close_tagP", "PPH-HTML-INCLUDES-ANCHOR-CLOSE-TAG?", 1, 0, false);
        declareFunction(me, "string_term_anchor", "STRING-TERM-ANCHOR", 2, 0, false);
        declareFunction(me, "pph_footnote_string_for_source_ids", "PPH-FOOTNOTE-STRING-FOR-SOURCE-IDS", 1, 0, false);
        declareFunction(me, "pph_footnote_string_for_sorted_source_ids_internal", "PPH-FOOTNOTE-STRING-FOR-SORTED-SOURCE-IDS-INTERNAL", 1, 0, false);
        declareFunction(me, "pph_footnote_string_for_sorted_source_ids", "PPH-FOOTNOTE-STRING-FOR-SORTED-SOURCE-IDS", 1, 0, false);
        declareFunction(me, "pph_maybe_show_source_icon", "PPH-MAYBE-SHOW-SOURCE-ICON", 1, 2, false);
        declareFunction(me, "pph_alternate_text_for_source", "PPH-ALTERNATE-TEXT-FOR-SOURCE", 3, 1, false);
        declareFunction(me, "pph_citation_string_new", "PPH-CITATION-STRING-NEW", 1, 0, false);
        declareFunction(me, "pph_html_citation_string", "PPH-HTML-CITATION-STRING", 1, 2, false);
        declareFunction(me, "deprecate_old_source_citation_formatP", "DEPRECATE-OLD-SOURCE-CITATION-FORMAT?", 0, 0, false);
        declareFunction(me, "pph_html_citation_id_string", "PPH-HTML-CITATION-ID-STRING", 2, 0, false);
        declareFunction(me, "pph_html_citation_string_int", "PPH-HTML-CITATION-STRING-INT", 2, 0, false);
        declareFunction(me, "pph_html_citation_string_int_new", "PPH-HTML-CITATION-STRING-INT-NEW", 2, 0, false);
        declareFunction(me, "pph_html_citation_string_int_old", "PPH-HTML-CITATION-STRING-INT-OLD", 2, 0, false);
        declareFunction(me, "pph_source_citation_p", "PPH-SOURCE-CITATION-P", 1, 0, false);
        declareFunction(me, "new_pph_source_citation", "NEW-PPH-SOURCE-CITATION", 2, 1, false);
        declareFunction(me, "pph_source_citation_id", "PPH-SOURCE-CITATION-ID", 1, 0, false);
        declareFunction(me, "pph_source_citation_source", "PPH-SOURCE-CITATION-SOURCE", 1, 0, false);
        declareFunction(me, "pph_source_citation_strengthenedP", "PPH-SOURCE-CITATION-STRENGTHENED?", 1, 0, false);
        declareFunction(me, "pph_phrase_italicize", "PPH-PHRASE-ITALICIZE", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_italicize", "PPH-PHRASE-OUTPUT-ITEM-ITALICIZE", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_superscript", "PPH-PHRASE-OUTPUT-ITEM-SUPERSCRIPT", 1, 0, false);
        declareFunction(me, "pph_phrase_output_item_subscript", "PPH-PHRASE-OUTPUT-ITEM-SUBSCRIPT", 1, 0, false);
        declareFunction(me, "term_anchor", "TERM-ANCHOR", 1, 0, false);
        declareFunction(me, "html_generate_exponent_naut", "HTML-GENERATE-EXPONENT-NAUT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_html_file() {
        defconstant("*PPH-OLD-CITATION-METHOD-VISUAL-INDICATOR-HTML-COLOR*", html_macros.$html_color_medium_dark_red$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_pph_html_file() {
        html_macros.note_cgi_handler_function(PARAPHRASE_LINK_TO_CB_START, $HTML_HANDLER);
        define_obsolete_register(HTML_PG_ANCHOR_TEXT, $list10);
        note_funcall_helper_function(PPH_NAUT_ID_FN);
        memoization_state.note_memoized_function(PPH_FOOTNOTE_STRING_FOR_SORTED_SOURCE_IDS);
        pph_types.pph_register_method(HTML_GENERATE_EXPONENT_NAUT, $EXPONENT_NAUT, $BEST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_html_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_html_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_html_file();
    }

    
}

/**
 * Total time: 594 ms
 */
