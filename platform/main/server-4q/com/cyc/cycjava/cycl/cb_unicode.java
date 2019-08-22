package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_default_term_frame$;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_default_naut_handler$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_naut_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_form_cons_method_always_active;
import static com.cyc.cycjava.cycl.cb_utilities.register_cb_form_cons_method;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_print_doc_string;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_unicode extends SubLTranslatedFile {
    public static final SubLFile me = new cb_unicode();

    public static final String myName = "com.cyc.cycjava.cycl.cb_unicode";

    public static final String myFingerPrint = "e3b27c85b1b287524268b41c7cf248f41fabe68c75f99689dd3ed82509df91ef";

    // defparameter
    public static final SubLSymbol $cb_display_unicode_nauts_as_stringsP$ = makeSymbol("*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*");

    // Internal Constants
    public static final SubLSymbol UNICODE_NAUT = makeSymbol("UNICODE-NAUT");

    public static final SubLList $list1 = list(makeKeyword("NAME"), makeString("unicode-naut"), makeKeyword("KEYWORD"), makeKeyword("UNICODE-NAUT"), makeKeyword("APPLICABILITY-TEST-FN"), makeSymbol("UNICODE-NAUT-APPLICABILITY-TEST"), makeKeyword("HTML-OUTPUT-FN"), makeSymbol("UNICODE-NAUT-HTML-OUTPUT-FN"));



    public static final SubLSymbol $sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ = makeSymbol("*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*");







    public static final SubLString $str7$cb_start__A = makeString("cb-start|~A");

    public static final SubLString $str8$_a__a = makeString("~a&~a");

    public static final SubLSymbol CB_LINK_UNICODE_NAUT = makeSymbol("CB-LINK-UNICODE-NAUT");

    public static SubLObject unicode_naut_applicability_test(final SubLObject cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $cb_display_unicode_nauts_as_stringsP$.getDynamicValue(thread)) && (NIL != unicode_nauts.unicode_naut_p(cons, UNPROVIDED)));
    }

    public static SubLObject unicode_naut_html_output_fn(final SubLObject cons, final SubLObject depth, final SubLObject wrap_axiomsP) {
        return html_print_doc_string(cons);
    }

    public static SubLObject cb_link_unicode_naut(final SubLObject unicode_naut, SubLObject linktext, SubLObject image_keyword) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (image_keyword == UNPROVIDED) {
            image_keyword = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = cconcatenate(html_glyph_markup($LAQUO), new SubLObject[]{ unicode_strings.unicode_display_to_html(second(unicode_naut)), html_glyph_markup($RAQUO) });
        }
        SubLObject handler = $cb_default_naut_handler$.getDynamicValue(thread);
        final SubLObject frame = $cb_default_term_frame$.getDynamicValue(thread);
        if (frame == $TOP) {
            handler = format(NIL, $str7$cb_start__A, $cb_default_naut_handler$.getDynamicValue(thread));
        }
        final SubLObject frame_name_var = cb_frame_name(frame);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str8$_a__a, handler, cb_naut_identifier(unicode_naut));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != image_keyword) {
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image_keyword);
                final SubLObject align = $TOP;
                final SubLObject alt = (NIL != linktext) ? linktext : cyc_file_dependencies.cb_get_icon_alt_string(image_keyword);
                final SubLObject border = ZERO_INTEGER;
                html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(image_src);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != alt) {
                    html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(alt);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != align) {
                    html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align(align));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != border) {
                    html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(border);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                }
                html_markup(html_macros.$html_image_tail$.getGlobalValue());
            } else {
                format(html_macros.$html_stream$.getDynamicValue(thread), linktext);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return unicode_naut;
    }

    public static SubLObject declare_cb_unicode_file() {
        declareFunction(me, "unicode_naut_applicability_test", "UNICODE-NAUT-APPLICABILITY-TEST", 1, 0, false);
        declareFunction(me, "unicode_naut_html_output_fn", "UNICODE-NAUT-HTML-OUTPUT-FN", 3, 0, false);
        declareFunction(me, "cb_link_unicode_naut", "CB-LINK-UNICODE-NAUT", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_cb_unicode_file() {
        defparameter("*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*", T);
        return NIL;
    }

    public static SubLObject setup_cb_unicode_file() {
        register_cb_form_cons_method(UNICODE_NAUT, $list1);
        declare_cb_form_cons_method_always_active($UNICODE_NAUT);
        register_html_state_variable($sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__);
        register_html_interface_variable($sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__);
        setup_cb_link_method($UNICODE_NAUT, CB_LINK_UNICODE_NAUT, THREE_INTEGER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_unicode_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_unicode_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_unicode_file();
    }

    
}

/**
 * Total time: 94 ms
 */
