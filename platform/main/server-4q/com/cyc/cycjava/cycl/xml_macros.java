package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class xml_macros extends SubLTranslatedFile {
    public static final SubLFile me = new xml_macros();

    public static final String myName = "com.cyc.cycjava.cycl.xml_macros";

    public static final String myFingerPrint = "eac41364fcd530e3d4f7e81ce2c8fa758cce994348891bdd838fd033292a1cbc";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym1$NAME_VAR = makeUninternedSymbol("NAME-VAR");



    public static final SubLSymbol XML_START_TAG_INTERNAL = makeSymbol("XML-START-TAG-INTERNAL");

    public static final SubLList $list4 = list(NIL);

    public static final SubLSymbol XML_END_TAG_INTERNAL = makeSymbol("XML-END-TAG-INTERNAL");

    public static final SubLList $list6 = list(T);

    public static final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("DEFAULT-NAMESPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym8$NAME_VAR = makeUninternedSymbol("NAME-VAR");

    private static final SubLSymbol $xml_default_namespace$ = makeSymbol("*XML-DEFAULT-NAMESPACE*");

    private static final SubLList $list10 = list(makeSymbol("CONTROL-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));



    private static final SubLSymbol $xml_stream$ = makeSymbol("*XML-STREAM*");

    public static SubLObject xml_element(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject attributes = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        attributes = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (NIL != body) {
            final SubLObject name_var = $sym1$NAME_VAR;
            return listS(CLET, list(list(name_var, name)), listS(XML_START_TAG_INTERNAL, name_var, attributes, $list4), append(body, list(list(XML_END_TAG_INTERNAL, name_var))));
        }
        return listS(XML_START_TAG_INTERNAL, name, attributes, $list6);
    }

    public static SubLObject xml_element_wXdefault_namespace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject attributes = NIL;
        SubLObject default_namespace = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        attributes = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        default_namespace = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject name_var = $sym8$NAME_VAR;
        return list(CLET, list(list(name_var, name)), list(XML_START_TAG_INTERNAL, name_var, attributes, NIL, NIL, default_namespace), listS(CLET, list(list($xml_default_namespace$, default_namespace)), append(body, NIL)), list(XML_END_TAG_INTERNAL, name_var));
    }

    public static SubLObject xml_format(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject control_string = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        control_string = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(FORMAT, $xml_stream$, control_string, append(args, NIL));
    }

    public static SubLObject declare_xml_macros_file() {
        declareMacro(me, "xml_element", "XML-ELEMENT");
        declareMacro(me, "xml_element_wXdefault_namespace", "XML-ELEMENT-W/DEFAULT-NAMESPACE");
        declareMacro(me, "xml_format", "XML-FORMAT");
        return NIL;
    }

    public static SubLObject init_xml_macros_file() {
        return NIL;
    }

    public static SubLObject setup_xml_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_xml_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_xml_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_xml_macros_file();
    }

    
}

/**
 * Total time: 68 ms
 */
