package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cycml_macros extends SubLTranslatedFile {
    public static final SubLFile me = new cycml_macros();

    public static final String myName = "com.cyc.cycjava.cycl.cycml_macros";

    public static final String myFingerPrint = "e700a724f2a530ade411036e5f248722c5ba644f35d577c6393392f99911a380";

    // Internal Constants
    public static final SubLSymbol DEF_CYCML_PRIMITIVE = makeSymbol("DEF-CYCML-PRIMITIVE");



    public static final SubLList $list2 = list(makeSymbol("NAME"));

    public static final SubLSymbol $sym3$BODY = makeUninternedSymbol("BODY");

    public static final SubLSymbol $sym4$ATTRIBUTES = makeUninternedSymbol("ATTRIBUTES");



    public static final SubLString $str6$CYCML_SERIALIZE_ = makeString("CYCML-SERIALIZE-");

    public static final SubLSymbol $sym7$_OPTIONAL = makeSymbol("&OPTIONAL");

    public static final SubLSymbol CYCML_SERIALIZE_PRIMITIVE = makeSymbol("CYCML-SERIALIZE-PRIMITIVE");

    public static final SubLList $list9 = list(list(makeSymbol("RET"), NIL));

    public static final SubLList $list10 = list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $cycml_indent_mode_on$ = makeSymbol("*CYCML-INDENT-MODE-ON*");

    public static final SubLList $list13 = list(makeSymbol("FORMAT"), makeSymbol("*XML-STREAM*"), makeString("~&"));

    public static final SubLList $list14 = list(makeSymbol("CYCML-INDENT"));

    private static final SubLSymbol $sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE = makeSymbol("XML-ELEMENT-W/DEFAULT-NAMESPACE");

    private static final SubLList $list16 = list(makeSymbol("CYCML-NAMESPACE"));



    public static final SubLList $list18 = list(list(makeSymbol("*CYCML-INDENT-LEVEL*"), list(makeSymbol("1+"), makeSymbol("*CYCML-INDENT-LEVEL*"))));

    private static final SubLList $list19 = list(list(makeSymbol("PWHEN"), makeSymbol("*CYCML-INDENT-MODE-ON*"), list(makeSymbol("FORMAT"), makeSymbol("*XML-STREAM*"), makeString("~&")), list(makeSymbol("CYCML-INDENT"))));

    public static SubLObject def_cycml_primitives(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject names;
        final SubLObject current = names = datum;
        SubLObject couples = NIL;
        SubLObject cdolist_list_var = names;
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            couples = cons(list(DEF_CYCML_PRIMITIVE, name), couples);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return bq_cons(PROGN, append(couples, NIL));
    }

    public static SubLObject def_cycml_primitive(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body = $sym3$BODY;
            final SubLObject attributes = $sym4$ATTRIBUTES;
            return listS(DEFINE_PUBLIC, intern(cconcatenate($str6$CYCML_SERIALIZE_, symbol_name(name)), UNPROVIDED), list(body, $sym7$_OPTIONAL, attributes), list(CYCML_SERIALIZE_PRIMITIVE, Strings.string_downcase(symbol_name(name), UNPROVIDED, UNPROVIDED), body, attributes), $list9);
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static SubLObject cycml_primitive_indented_element(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject attributes = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        attributes = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(PWHEN, $cycml_indent_mode_on$, $list13, $list14, listS($sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE, name, attributes, $list16, append(body, NIL))));
    }

    public static SubLObject cycml_complex_indented_element(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject attributes = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        attributes = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(PWHEN, $cycml_indent_mode_on$, $list13, $list14, listS($sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE, name, attributes, $list16, listS(CLET, $list18, append(body, NIL)), $list19)));
    }

    public static SubLObject declare_cycml_macros_file() {
        declareMacro(me, "def_cycml_primitives", "DEF-CYCML-PRIMITIVES");
        declareMacro(me, "def_cycml_primitive", "DEF-CYCML-PRIMITIVE");
        declareMacro(me, "cycml_primitive_indented_element", "CYCML-PRIMITIVE-INDENTED-ELEMENT");
        declareMacro(me, "cycml_complex_indented_element", "CYCML-COMPLEX-INDENTED-ELEMENT");
        return NIL;
    }

    public static SubLObject init_cycml_macros_file() {
        return NIL;
    }

    public static SubLObject setup_cycml_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cycml_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_cycml_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cycml_macros_file();
    }

    
}

/**
 * Total time: 75 ms
 */
