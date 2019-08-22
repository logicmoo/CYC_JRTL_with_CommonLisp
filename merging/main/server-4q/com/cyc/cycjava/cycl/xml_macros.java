/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      XML-MACROS
 * source file: /cyc/top/cycl/xml-macros.lisp
 * created:     2019/07/03 17:37:51
 */
public final class xml_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new xml_macros();

 public static final String myName = "com.cyc.cycjava.cycl.xml_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym1$NAME_VAR = makeUninternedSymbol("NAME-VAR");

    private static final SubLSymbol XML_START_TAG_INTERNAL = makeSymbol("XML-START-TAG-INTERNAL");

    static private final SubLList $list4 = list(NIL);

    private static final SubLSymbol XML_END_TAG_INTERNAL = makeSymbol("XML-END-TAG-INTERNAL");

    static private final SubLList $list6 = list(T);

    static private final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("DEFAULT-NAMESPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym8$NAME_VAR = makeUninternedSymbol("NAME-VAR");

    private static final SubLSymbol $xml_default_namespace$ = makeSymbol("*XML-DEFAULT-NAMESPACE*");

    private static final SubLList $list10 = list(makeSymbol("CONTROL-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol $xml_stream$ = makeSymbol("*XML-STREAM*");

    // Definitions
    /**
     *
     *
     * @param name
     * 		Name of element.
     * @param attributes
     * 		List of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)
     * 		Each ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.
     * @param body
     * 		
     * @unknown Every one of NAME, ATTRIBUTES will be evaluated.
     * @unknown Outputs an element of type NAME to @xref :variable *xml-stream*
    All XML output in BODY will occur within the element.
     * @unknown for outputting XML with decent formatting, it's generally better to use XML-TAG instead
    of XML-ELEMENT
     */
    @LispMethod(comment = "@param name\r\n\t\tName of element.\r\n@param attributes\r\n\t\tList of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)\r\n\t\tEach ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.\r\n@param body\r\n\t\t\r\n@unknown Every one of NAME, ATTRIBUTES will be evaluated.\r\n@unknown Outputs an element of type NAME to @xref :variable *xml-stream*\r\nAll XML output in BODY will occur within the element.\r\n@unknown for outputting XML with decent formatting, it\'s generally better to use XML-TAG instead\r\nof XML-ELEMENT")
    public static final SubLObject xml_element_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject attributes = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            attributes = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                if (NIL != body) {
                    {
                        SubLObject name_var = $sym1$NAME_VAR;
                        return listS(CLET, list(list(name_var, name)), listS(XML_START_TAG_INTERNAL, name_var, attributes, $list_alt4), append(body, list(list(XML_END_TAG_INTERNAL, name_var))));
                    }
                } else {
                    return listS(XML_START_TAG_INTERNAL, name, attributes, $list_alt6);
                }
            }
        }
    }

    // Definitions
    /**
     *
     *
     * @param name
     * 		Name of element.
     * @param attributes
     * 		List of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)
     * 		Each ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.
     * @param body
     * 		
     * @unknown Every one of NAME, ATTRIBUTES will be evaluated.
     * @unknown Outputs an element of type NAME to @xref :variable *xml-stream*
    All XML output in BODY will occur within the element.
     * @unknown for outputting XML with decent formatting, it's generally better to use XML-TAG instead
    of XML-ELEMENT
     */
    @LispMethod(comment = "@param name\r\n\t\tName of element.\r\n@param attributes\r\n\t\tList of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)\r\n\t\tEach ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.\r\n@param body\r\n\t\t\r\n@unknown Every one of NAME, ATTRIBUTES will be evaluated.\r\n@unknown Outputs an element of type NAME to @xref :variable *xml-stream*\r\nAll XML output in BODY will occur within the element.\r\n@unknown for outputting XML with decent formatting, it\'s generally better to use XML-TAG instead\r\nof XML-ELEMENT")
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     * Call format on @xref :variable *xml-stream*
     */
    @LispMethod(comment = "Call format on @xref :variable *xml-stream*")
    public static final SubLObject xml_format_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject control_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            control_string = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(FORMAT, $xml_stream$, control_string, append(args, NIL));
            }
        }
    }

    /**
     * Call format on @xref :variable *xml-stream*
     */
    @LispMethod(comment = "Call format on @xref :variable *xml-stream*")
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

    static private final SubLList $list_alt4 = list(NIL);

    static private final SubLList $list_alt6 = list(T);

    static private final SubLList $list_alt7 = list(makeSymbol("CONTROL-STRING"), makeSymbol("&REST"), makeSymbol("ARGS"));

    public static SubLObject declare_xml_macros_file() {
        declareMacro("xml_element", "XML-ELEMENT");
        declareMacro("xml_element_wXdefault_namespace", "XML-ELEMENT-W/DEFAULT-NAMESPACE");
        declareMacro("xml_format", "XML-FORMAT");
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
