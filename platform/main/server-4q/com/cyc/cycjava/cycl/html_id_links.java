package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class html_id_links extends SubLTranslatedFile {
    public static final SubLFile me = new html_id_links();

    public static final String myName = "com.cyc.cycjava.cycl.html_id_links";

    public static final String myFingerPrint = "d621bb6761b3d2fcb91687c1fa30ac2a9062bcf507f5a277907094508507b620";

    // deflexical
    /**
     * An association between an index and the function used to lookup a value given
     * an id for that index.
     */
    private static final SubLSymbol $html_id_widget_lookup_functions$ = makeSymbol("*HTML-ID-WIDGET-LOOKUP-FUNCTIONS*");

    // deflexical
    /**
     * An association between an index and the function used to find an unique
     * identifier for values in that index.
     */
    private static final SubLSymbol $html_id_widget_id_functions$ = makeSymbol("*HTML-ID-WIDGET-ID-FUNCTIONS*");



    public static final SubLSymbol HTML_ID_LINK_HANDLER_NAME = makeSymbol("HTML-ID-LINK-HANDLER-NAME");

    public static final SubLSymbol DEFINE_HTML_ID_LINK = makeSymbol("DEFINE-HTML-ID-LINK");

    public static final SubLString $str3$_ = makeString("-");

    public static final SubLString $$$HANDLER = makeString("HANDLER");

    public static final SubLSymbol HTML_ID_LINK_BODY = makeSymbol("HTML-ID-LINK-BODY");

    public static final SubLSymbol HTML_BASIC_IMAGE = makeSymbol("HTML-BASIC-IMAGE");



    public static final SubLList $list8 = list(makeSymbol("NAME"), list(makeSymbol("OBJECT")), list(makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("CONTENTS"), makeSymbol("TEXT"), makeSymbol("IMAGE"), makeSymbol("TARGET")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list9 = list(makeKeyword("INDEX"), makeKeyword("CONTENTS"), makeKeyword("TEXT"), makeKeyword("IMAGE"), makeKeyword("TARGET"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");













    public static final SubLSymbol DEFINE_HTML_HANDLER = makeSymbol("DEFINE-HTML-HANDLER");

    public static final SubLList $list18 = list(makeSymbol("ARGS"));



    public static final SubLList $list20 = list(makeSymbol("ID-STR"));







    public static final SubLSymbol HTML_ID_LOOKUP_FUNC = makeSymbol("HTML-ID-LOOKUP-FUNC");

    public static final SubLList $list25 = list(list(makeSymbol("READ-FROM-STRING-IGNORING-ERRORS"), makeSymbol("ID-STR")));





    public static final SubLSymbol HTML_ID_ID_FUNC = makeSymbol("HTML-ID-ID-FUNC");

    public static final SubLSymbol FRAME_LINK = makeSymbol("FRAME-LINK");



    public static final SubLString $str31$_a__a = makeString("~a&~a");

    public static final SubLList $list32 = list(makeSymbol("ID"));

    public static final SubLList $list33 = list(list(makeSymbol("RET"), NIL));

    public static SubLObject get_process_wrapper_by_id(final SubLObject id, final SubLObject process_wrapper_set) {
        final SubLObject set_contents_var = set.do_set_internal(process_wrapper_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject pw;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            pw = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, pw)) && id.eql(process_utilities.process_wrapper_get_id(pw))) {
                return pw;
            }
        }
        return NIL;
    }

    public static SubLObject register_html_id_index(final SubLObject index, final SubLObject lookup, final SubLObject id) {
        assert NIL != function_spec_p(lookup) : "Types.function_spec_p(lookup) " + "CommonSymbols.NIL != Types.function_spec_p(lookup) " + lookup;
        assert NIL != function_spec_p(id) : "Types.function_spec_p(id) " + "CommonSymbols.NIL != Types.function_spec_p(id) " + id;
        dictionary.dictionary_enter($html_id_widget_id_functions$.getGlobalValue(), index, id);
        dictionary.dictionary_enter($html_id_widget_lookup_functions$.getGlobalValue(), index, lookup);
        return NIL;
    }

    public static SubLObject html_id_lookup_func(final SubLObject index) {
        return dictionary.dictionary_lookup($html_id_widget_lookup_functions$.getGlobalValue(), index, UNPROVIDED);
    }

    public static SubLObject html_id_id_func(final SubLObject index) {
        return dictionary.dictionary_lookup($html_id_widget_id_functions$.getGlobalValue(), index, UNPROVIDED);
    }

    public static SubLObject html_id_link_handler_name(final SubLObject link_func) {
        return intern(cconcatenate(symbol_name(link_func), new SubLObject[]{ $str3$_, $$$HANDLER }), UNPROVIDED);
    }

    public static SubLObject html_id_link_body(final SubLObject text, final SubLObject image, final SubLObject contents) {
        if (NIL != image) {
            return list(HTML_BASIC_IMAGE, image, text);
        }
        if (NIL != text) {
            return list(HTML_PRINC, text);
        }
        return contents;
    }

    public static SubLObject define_html_id_link(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            destructuring_bind_must_consp(current, datum, $list8);
            final SubLObject temp_$1 = current.rest();
            current = current.first();
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$2 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum, $list8);
                current_$2 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list8);
                if (NIL == member(current_$2, $list9, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$2 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list8);
            }
            final SubLObject index_tail = property_list_member($INDEX, current);
            final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
            final SubLObject contents_tail = property_list_member($CONTENTS, current);
            final SubLObject contents = (NIL != contents_tail) ? cadr(contents_tail) : NIL;
            final SubLObject text_tail = property_list_member($TEXT, current);
            final SubLObject text = (NIL != text_tail) ? cadr(text_tail) : NIL;
            final SubLObject image_tail = property_list_member($IMAGE, current);
            final SubLObject image = (NIL != image_tail) ? cadr(image_tail) : NIL;
            final SubLObject target_tail = property_list_member($TARGET, current);
            final SubLObject target = (NIL != target_tail) ? cadr(target_tail) : NIL;
            final SubLObject body;
            current = body = temp_$1;
            final SubLObject handler_func = html_id_link_handler_name(name);
            final SubLObject href_func_string = Strings.string_downcase(symbol_name(handler_func), UNPROVIDED, UNPROVIDED);
            return list(PROGN, list(DEFINE_HTML_HANDLER, handler_func, $list18, list(CDESTRUCTURING_BIND, $list20, ARGS, listS(CLET, list(list(v_object, listS(FUNCALL, list(HTML_ID_LOOKUP_FUNC, index), index, $list25))), append(body, NIL)))), list(DEFINE_PRIVATE, name, list(v_object), listS(CLET, list(list(ID, list(FUNCALL, list(HTML_ID_ID_FUNC, index), v_object))), list(FRAME_LINK, listS(HTML_FORMAT, $str31$_a__a, href_func_string, $list32), html_id_link_body(text, image, contents), target), $list33)));
        }
        cdestructuring_bind_error(datum, $list8);
        return NIL;
    }

    public static SubLObject declare_html_id_links_file() {
        declareFunction(me, "get_process_wrapper_by_id", "GET-PROCESS-WRAPPER-BY-ID", 2, 0, false);
        declareFunction(me, "register_html_id_index", "REGISTER-HTML-ID-INDEX", 3, 0, false);
        declareFunction(me, "html_id_lookup_func", "HTML-ID-LOOKUP-FUNC", 1, 0, false);
        declareFunction(me, "html_id_id_func", "HTML-ID-ID-FUNC", 1, 0, false);
        declareFunction(me, "html_id_link_handler_name", "HTML-ID-LINK-HANDLER-NAME", 1, 0, false);
        declareFunction(me, "html_id_link_body", "HTML-ID-LINK-BODY", 3, 0, false);
        declareMacro(me, "define_html_id_link", "DEFINE-HTML-ID-LINK");
        return NIL;
    }

    public static SubLObject init_html_id_links_file() {
        deflexical("*HTML-ID-WIDGET-LOOKUP-FUNCTIONS*", dictionary.new_dictionary(symbol_function(EQL), ZERO_INTEGER));
        deflexical("*HTML-ID-WIDGET-ID-FUNCTIONS*", dictionary.new_dictionary(symbol_function(EQL), ZERO_INTEGER));
        return NIL;
    }

    public static SubLObject setup_html_id_links_file() {
        register_macro_helper(HTML_ID_LINK_HANDLER_NAME, DEFINE_HTML_ID_LINK);
        register_macro_helper(HTML_ID_LINK_BODY, DEFINE_HTML_ID_LINK);
        return NIL;
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

    
}

/**
 * Total time: 108 ms
 */
