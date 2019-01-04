package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_unicode extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_unicode";
    public static final String myFingerPrint = "e3b27c85b1b287524268b41c7cf248f41fabe68c75f99689dd3ed82509df91ef";
    @SubLTranslatedFile.SubL(source = "cycl/cb-unicode.lisp", position = 1186L)
    public static SubLSymbol $cb_display_unicode_nauts_as_stringsP$;
    private static final SubLSymbol $sym0$UNICODE_NAUT;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$UNICODE_NAUT;
    private static final SubLSymbol $sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__;
    private static final SubLSymbol $kw4$LAQUO;
    private static final SubLSymbol $kw5$RAQUO;
    private static final SubLSymbol $kw6$TOP;
    private static final SubLString $str7$cb_start__A;
    private static final SubLString $str8$_a__a;
    private static final SubLSymbol $sym9$CB_LINK_UNICODE_NAUT;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-unicode.lisp", position = 1355L)
    public static SubLObject unicode_naut_applicability_test(final SubLObject cons) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_unicode.NIL != cb_unicode.$cb_display_unicode_nauts_as_stringsP$.getDynamicValue(thread) && cb_unicode.NIL != unicode_nauts.unicode_naut_p(cons, (SubLObject)cb_unicode.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-unicode.lisp", position = 1494L)
    public static SubLObject unicode_naut_html_output_fn(final SubLObject cons, final SubLObject depth, final SubLObject wrap_axiomsP) {
        return html_utilities.html_print_doc_string(cons);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-unicode.lisp", position = 1633L)
    public static SubLObject cb_link_unicode_naut(final SubLObject unicode_naut, SubLObject linktext, SubLObject image_keyword) {
        if (linktext == cb_unicode.UNPROVIDED) {
            linktext = (SubLObject)cb_unicode.NIL;
        }
        if (image_keyword == cb_unicode.UNPROVIDED) {
            image_keyword = (SubLObject)cb_unicode.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_unicode.NIL == linktext) {
            linktext = Sequences.cconcatenate(html_utilities.html_glyph_markup((SubLObject)cb_unicode.$kw4$LAQUO), new SubLObject[] { unicode_strings.unicode_display_to_html(conses_high.second(unicode_naut)), html_utilities.html_glyph_markup((SubLObject)cb_unicode.$kw5$RAQUO) });
        }
        SubLObject handler = cb_utilities.$cb_default_naut_handler$.getDynamicValue(thread);
        final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue(thread);
        if (frame == cb_unicode.$kw6$TOP) {
            handler = PrintLow.format((SubLObject)cb_unicode.NIL, (SubLObject)cb_unicode.$str7$cb_start__A, cb_utilities.$cb_default_naut_handler$.getDynamicValue(thread));
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name(frame);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_unicode.$str8$_a__a, handler, cb_utilities.cb_naut_identifier(unicode_naut));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
        if (cb_unicode.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_unicode.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_unicode.T, thread);
            if (cb_unicode.NIL != image_keyword) {
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path(image_keyword);
                final SubLObject align = (SubLObject)cb_unicode.$kw6$TOP;
                final SubLObject alt = (cb_unicode.NIL != linktext) ? linktext : cyc_file_dependencies.cb_get_icon_alt_string(image_keyword);
                final SubLObject border = (SubLObject)cb_unicode.ZERO_INTEGER;
                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
                html_utilities.html_markup(image_src);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
                if (cb_unicode.NIL != alt) {
                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
                    html_utilities.html_markup(alt);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
                }
                if (cb_unicode.NIL != align) {
                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align(align));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
                }
                if (cb_unicode.NIL != border) {
                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
                    html_utilities.html_markup(border);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_unicode.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_unicode.UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_unicode.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                }
                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
            }
            else {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), linktext);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return unicode_naut;
    }
    
    public static SubLObject declare_cb_unicode_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_unicode", "unicode_naut_applicability_test", "UNICODE-NAUT-APPLICABILITY-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_unicode", "unicode_naut_html_output_fn", "UNICODE-NAUT-HTML-OUTPUT-FN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_unicode", "cb_link_unicode_naut", "CB-LINK-UNICODE-NAUT", 1, 2, false);
        return (SubLObject)cb_unicode.NIL;
    }
    
    public static SubLObject init_cb_unicode_file() {
        cb_unicode.$cb_display_unicode_nauts_as_stringsP$ = SubLFiles.defparameter("*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*", (SubLObject)cb_unicode.T);
        return (SubLObject)cb_unicode.NIL;
    }
    
    public static SubLObject setup_cb_unicode_file() {
        cb_utilities.register_cb_form_cons_method((SubLObject)cb_unicode.$sym0$UNICODE_NAUT, (SubLObject)cb_unicode.$list1);
        cb_utilities.declare_cb_form_cons_method_always_active((SubLObject)cb_unicode.$kw2$UNICODE_NAUT);
        utilities_macros.register_html_state_variable((SubLObject)cb_unicode.$sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__);
        utilities_macros.register_html_interface_variable((SubLObject)cb_unicode.$sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__);
        cb_utilities.setup_cb_link_method((SubLObject)cb_unicode.$kw2$UNICODE_NAUT, (SubLObject)cb_unicode.$sym9$CB_LINK_UNICODE_NAUT, (SubLObject)cb_unicode.THREE_INTEGER);
        return (SubLObject)cb_unicode.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_unicode_file();
    }
    
    public void initializeVariables() {
        init_cb_unicode_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_unicode_file();
    }
    
    static {
        me = (SubLFile)new cb_unicode();
        cb_unicode.$cb_display_unicode_nauts_as_stringsP$ = null;
        $sym0$UNICODE_NAUT = SubLObjectFactory.makeSymbol("UNICODE-NAUT");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeString("unicode-naut"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("UNICODE-NAUT"), (SubLObject)SubLObjectFactory.makeKeyword("APPLICABILITY-TEST-FN"), (SubLObject)SubLObjectFactory.makeSymbol("UNICODE-NAUT-APPLICABILITY-TEST"), (SubLObject)SubLObjectFactory.makeKeyword("HTML-OUTPUT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("UNICODE-NAUT-HTML-OUTPUT-FN"));
        $kw2$UNICODE_NAUT = SubLObjectFactory.makeKeyword("UNICODE-NAUT");
        $sym3$_CB_DISPLAY_UNICODE_NAUTS_AS_STRINGS__ = SubLObjectFactory.makeSymbol("*CB-DISPLAY-UNICODE-NAUTS-AS-STRINGS?*");
        $kw4$LAQUO = SubLObjectFactory.makeKeyword("LAQUO");
        $kw5$RAQUO = SubLObjectFactory.makeKeyword("RAQUO");
        $kw6$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str7$cb_start__A = SubLObjectFactory.makeString("cb-start|~A");
        $str8$_a__a = SubLObjectFactory.makeString("~a&~a");
        $sym9$CB_LINK_UNICODE_NAUT = SubLObjectFactory.makeSymbol("CB-LINK-UNICODE-NAUT");
    }
}

/*

	Total time: 94 ms
	
*/