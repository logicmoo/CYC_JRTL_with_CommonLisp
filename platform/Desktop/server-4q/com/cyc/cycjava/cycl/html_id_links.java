package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_id_links extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.html_id_links";
    public static final String myFingerPrint = "d621bb6761b3d2fcb91687c1fa30ac2a9062bcf507f5a277907094508507b620";
    @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 2586L)
    private static SubLSymbol $html_id_widget_lookup_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 2775L)
    private static SubLSymbol $html_id_widget_id_functions$;
    private static final SubLSymbol $sym0$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym1$HTML_ID_LINK_HANDLER_NAME;
    private static final SubLSymbol $sym2$DEFINE_HTML_ID_LINK;
    private static final SubLString $str3$_;
    private static final SubLString $str4$HANDLER;
    private static final SubLSymbol $sym5$HTML_ID_LINK_BODY;
    private static final SubLSymbol $sym6$HTML_BASIC_IMAGE;
    private static final SubLSymbol $sym7$HTML_PRINC;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw11$INDEX;
    private static final SubLSymbol $kw12$CONTENTS;
    private static final SubLSymbol $kw13$TEXT;
    private static final SubLSymbol $kw14$IMAGE;
    private static final SubLSymbol $kw15$TARGET;
    private static final SubLSymbol $sym16$PROGN;
    private static final SubLSymbol $sym17$DEFINE_HTML_HANDLER;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$CDESTRUCTURING_BIND;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$ARGS;
    private static final SubLSymbol $sym22$CLET;
    private static final SubLSymbol $sym23$FUNCALL;
    private static final SubLSymbol $sym24$HTML_ID_LOOKUP_FUNC;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$DEFINE_PRIVATE;
    private static final SubLSymbol $sym27$ID;
    private static final SubLSymbol $sym28$HTML_ID_ID_FUNC;
    private static final SubLSymbol $sym29$FRAME_LINK;
    private static final SubLSymbol $sym30$HTML_FORMAT;
    private static final SubLString $str31$_a__a;
    private static final SubLList $list32;
    private static final SubLList $list33;
    
    @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 2255L)
    public static SubLObject get_process_wrapper_by_id(final SubLObject id, final SubLObject process_wrapper_set) {
        final SubLObject set_contents_var = set.do_set_internal(process_wrapper_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject pw;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)html_id_links.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); html_id_links.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            pw = set_contents.do_set_contents_next(basis_object, state);
            if (html_id_links.NIL != set_contents.do_set_contents_element_validP(state, pw) && id.eql(process_utilities.process_wrapper_get_id(pw))) {
                return pw;
            }
        }
        return (SubLObject)html_id_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 2969L)
    public static SubLObject register_html_id_index(final SubLObject index, final SubLObject lookup, final SubLObject id) {
        assert html_id_links.NIL != Types.function_spec_p(lookup) : lookup;
        assert html_id_links.NIL != Types.function_spec_p(id) : id;
        dictionary.dictionary_enter(html_id_links.$html_id_widget_id_functions$.getGlobalValue(), index, id);
        dictionary.dictionary_enter(html_id_links.$html_id_widget_lookup_functions$.getGlobalValue(), index, lookup);
        return (SubLObject)html_id_links.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3251L)
    public static SubLObject html_id_lookup_func(final SubLObject index) {
        return dictionary.dictionary_lookup(html_id_links.$html_id_widget_lookup_functions$.getGlobalValue(), index, (SubLObject)html_id_links.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3362L)
    public static SubLObject html_id_id_func(final SubLObject index) {
        return dictionary.dictionary_lookup(html_id_links.$html_id_widget_id_functions$.getGlobalValue(), index, (SubLObject)html_id_links.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3462L)
    public static SubLObject html_id_link_handler_name(final SubLObject link_func) {
        return Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(link_func), new SubLObject[] { html_id_links.$str3$_, html_id_links.$str4$HANDLER }), (SubLObject)html_id_links.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3636L)
    public static SubLObject html_id_link_body(final SubLObject text, final SubLObject image, final SubLObject contents) {
        if (html_id_links.NIL != image) {
            return (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym6$HTML_BASIC_IMAGE, image, text);
        }
        if (html_id_links.NIL != text) {
            return (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym7$HTML_PRINC, text);
        }
        return contents;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-id-links.lisp", position = 3848L)
    public static SubLObject define_html_id_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_id_links.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_id_links.$list8);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_id_links.$list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_object = (SubLObject)html_id_links.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_id_links.$list8);
        v_object = current.first();
        current = current.rest();
        if (html_id_links.NIL == current) {
            current = temp;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_id_links.$list8);
            final SubLObject temp_$1 = current.rest();
            current = current.first();
            SubLObject allow_other_keys_p = (SubLObject)html_id_links.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)html_id_links.NIL;
            SubLObject current_$2 = (SubLObject)html_id_links.NIL;
            while (html_id_links.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_id_links.$list8);
                current_$2 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_id_links.$list8);
                if (html_id_links.NIL == conses_high.member(current_$2, (SubLObject)html_id_links.$list9, (SubLObject)html_id_links.UNPROVIDED, (SubLObject)html_id_links.UNPROVIDED)) {
                    bad = (SubLObject)html_id_links.T;
                }
                if (current_$2 == html_id_links.$kw10$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (html_id_links.NIL != bad && html_id_links.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_id_links.$list8);
            }
            final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)html_id_links.$kw11$INDEX, current);
            final SubLObject index = (SubLObject)((html_id_links.NIL != index_tail) ? conses_high.cadr(index_tail) : html_id_links.NIL);
            final SubLObject contents_tail = cdestructuring_bind.property_list_member((SubLObject)html_id_links.$kw12$CONTENTS, current);
            final SubLObject contents = (SubLObject)((html_id_links.NIL != contents_tail) ? conses_high.cadr(contents_tail) : html_id_links.NIL);
            final SubLObject text_tail = cdestructuring_bind.property_list_member((SubLObject)html_id_links.$kw13$TEXT, current);
            final SubLObject text = (SubLObject)((html_id_links.NIL != text_tail) ? conses_high.cadr(text_tail) : html_id_links.NIL);
            final SubLObject image_tail = cdestructuring_bind.property_list_member((SubLObject)html_id_links.$kw14$IMAGE, current);
            final SubLObject image = (SubLObject)((html_id_links.NIL != image_tail) ? conses_high.cadr(image_tail) : html_id_links.NIL);
            final SubLObject target_tail = cdestructuring_bind.property_list_member((SubLObject)html_id_links.$kw15$TARGET, current);
            final SubLObject target = (SubLObject)((html_id_links.NIL != target_tail) ? conses_high.cadr(target_tail) : html_id_links.NIL);
            final SubLObject body;
            current = (body = temp_$1);
            final SubLObject handler_func = html_id_link_handler_name(name);
            final SubLObject href_func_string = Strings.string_downcase(Symbols.symbol_name(handler_func), (SubLObject)html_id_links.UNPROVIDED, (SubLObject)html_id_links.UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym16$PROGN, (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym17$DEFINE_HTML_HANDLER, handler_func, (SubLObject)html_id_links.$list18, (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym19$CDESTRUCTURING_BIND, (SubLObject)html_id_links.$list20, (SubLObject)html_id_links.$sym21$ARGS, (SubLObject)ConsesLow.listS((SubLObject)html_id_links.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(v_object, (SubLObject)ConsesLow.listS((SubLObject)html_id_links.$sym23$FUNCALL, (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym24$HTML_ID_LOOKUP_FUNC, index), index, (SubLObject)html_id_links.$list25))), ConsesLow.append(body, (SubLObject)html_id_links.NIL)))), (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym26$DEFINE_PRIVATE, name, (SubLObject)ConsesLow.list(v_object), (SubLObject)ConsesLow.listS((SubLObject)html_id_links.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym27$ID, (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym23$FUNCALL, (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym28$HTML_ID_ID_FUNC, index), v_object))), (SubLObject)ConsesLow.list((SubLObject)html_id_links.$sym29$FRAME_LINK, (SubLObject)ConsesLow.listS((SubLObject)html_id_links.$sym30$HTML_FORMAT, (SubLObject)html_id_links.$str31$_a__a, href_func_string, (SubLObject)html_id_links.$list32), html_id_link_body(text, image, contents), target), (SubLObject)html_id_links.$list33)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_id_links.$list8);
        return (SubLObject)html_id_links.NIL;
    }
    
    public static SubLObject declare_html_id_links_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_id_links", "get_process_wrapper_by_id", "GET-PROCESS-WRAPPER-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_id_links", "register_html_id_index", "REGISTER-HTML-ID-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_id_links", "html_id_lookup_func", "HTML-ID-LOOKUP-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_id_links", "html_id_id_func", "HTML-ID-ID-FUNC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_id_links", "html_id_link_handler_name", "HTML-ID-LINK-HANDLER-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_id_links", "html_id_link_body", "HTML-ID-LINK-BODY", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_id_links", "define_html_id_link", "DEFINE-HTML-ID-LINK");
        return (SubLObject)html_id_links.NIL;
    }
    
    public static SubLObject init_html_id_links_file() {
        html_id_links.$html_id_widget_lookup_functions$ = SubLFiles.deflexical("*HTML-ID-WIDGET-LOOKUP-FUNCTIONS*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)html_id_links.EQL), (SubLObject)html_id_links.ZERO_INTEGER));
        html_id_links.$html_id_widget_id_functions$ = SubLFiles.deflexical("*HTML-ID-WIDGET-ID-FUNCTIONS*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)html_id_links.EQL), (SubLObject)html_id_links.ZERO_INTEGER));
        return (SubLObject)html_id_links.NIL;
    }
    
    public static SubLObject setup_html_id_links_file() {
        access_macros.register_macro_helper((SubLObject)html_id_links.$sym1$HTML_ID_LINK_HANDLER_NAME, (SubLObject)html_id_links.$sym2$DEFINE_HTML_ID_LINK);
        access_macros.register_macro_helper((SubLObject)html_id_links.$sym5$HTML_ID_LINK_BODY, (SubLObject)html_id_links.$sym2$DEFINE_HTML_ID_LINK);
        return (SubLObject)html_id_links.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_html_id_links_file();
    }
    
    @Override
	public void initializeVariables() {
        init_html_id_links_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_html_id_links_file();
    }
    
    static {
        me = (SubLFile)new html_id_links();
        html_id_links.$html_id_widget_lookup_functions$ = null;
        html_id_links.$html_id_widget_id_functions$ = null;
        $sym0$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym1$HTML_ID_LINK_HANDLER_NAME = SubLObjectFactory.makeSymbol("HTML-ID-LINK-HANDLER-NAME");
        $sym2$DEFINE_HTML_ID_LINK = SubLObjectFactory.makeSymbol("DEFINE-HTML-ID-LINK");
        $str3$_ = SubLObjectFactory.makeString("-");
        $str4$HANDLER = SubLObjectFactory.makeString("HANDLER");
        $sym5$HTML_ID_LINK_BODY = SubLObjectFactory.makeSymbol("HTML-ID-LINK-BODY");
        $sym6$HTML_BASIC_IMAGE = SubLObjectFactory.makeSymbol("HTML-BASIC-IMAGE");
        $sym7$HTML_PRINC = SubLObjectFactory.makeSymbol("HTML-PRINC");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENTS"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"), (SubLObject)SubLObjectFactory.makeSymbol("IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENTS"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"), (SubLObject)SubLObjectFactory.makeKeyword("IMAGE"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"));
        $kw10$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw11$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw12$CONTENTS = SubLObjectFactory.makeKeyword("CONTENTS");
        $kw13$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $kw14$IMAGE = SubLObjectFactory.makeKeyword("IMAGE");
        $kw15$TARGET = SubLObjectFactory.makeKeyword("TARGET");
        $sym16$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym17$DEFINE_HTML_HANDLER = SubLObjectFactory.makeSymbol("DEFINE-HTML-HANDLER");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym19$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-STR"));
        $sym21$ARGS = SubLObjectFactory.makeSymbol("ARGS");
        $sym22$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym23$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $sym24$HTML_ID_LOOKUP_FUNC = SubLObjectFactory.makeSymbol("HTML-ID-LOOKUP-FUNC");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), (SubLObject)SubLObjectFactory.makeSymbol("ID-STR")));
        $sym26$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $sym27$ID = SubLObjectFactory.makeSymbol("ID");
        $sym28$HTML_ID_ID_FUNC = SubLObjectFactory.makeSymbol("HTML-ID-ID-FUNC");
        $sym29$FRAME_LINK = SubLObjectFactory.makeSymbol("FRAME-LINK");
        $sym30$HTML_FORMAT = SubLObjectFactory.makeSymbol("HTML-FORMAT");
        $str31$_a__a = SubLObjectFactory.makeString("~a&~a");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)html_id_links.NIL));
    }
}

/*

	Total time: 108 ms
	
*/