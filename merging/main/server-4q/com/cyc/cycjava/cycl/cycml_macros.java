/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYCML-MACROS
 * source file: /cyc/top/cycl/cycml-macros.lisp
 * created:     2019/07/03 17:37:07
 */
public final class cycml_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cycml_macros();

 public static final String myName = "com.cyc.cycjava.cycl.cycml_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol DEF_CYCML_PRIMITIVE = makeSymbol("DEF-CYCML-PRIMITIVE");

    static private final SubLList $list2 = list(makeSymbol("NAME"));

    static private final SubLSymbol $sym3$BODY = makeUninternedSymbol("BODY");

    static private final SubLSymbol $sym4$ATTRIBUTES = makeUninternedSymbol("ATTRIBUTES");

    static private final SubLString $str6$CYCML_SERIALIZE_ = makeString("CYCML-SERIALIZE-");

    static private final SubLSymbol $sym7$_OPTIONAL = makeSymbol("&OPTIONAL");

    private static final SubLSymbol CYCML_SERIALIZE_PRIMITIVE = makeSymbol("CYCML-SERIALIZE-PRIMITIVE");

    static private final SubLList $list9 = list(list(RET, NIL));

    static private final SubLList $list10 = list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $cycml_indent_mode_on$ = makeSymbol("*CYCML-INDENT-MODE-ON*");

    static private final SubLList $list13 = list(makeSymbol("FORMAT"), makeSymbol("*XML-STREAM*"), makeString("~&"));

    static private final SubLList $list14 = list(makeSymbol("CYCML-INDENT"));

    private static final SubLSymbol $sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE = makeSymbol("XML-ELEMENT-W/DEFAULT-NAMESPACE");

    private static final SubLList $list16 = list(makeSymbol("CYCML-NAMESPACE"));

    static private final SubLList $list18 = list(list(makeSymbol("*CYCML-INDENT-LEVEL*"), list(makeSymbol("1+"), makeSymbol("*CYCML-INDENT-LEVEL*"))));

    private static final SubLList $list19 = list(list(makeSymbol("PWHEN"), makeSymbol("*CYCML-INDENT-MODE-ON*"), list(makeSymbol("FORMAT"), makeSymbol("*XML-STREAM*"), makeString("~&")), list(makeSymbol("CYCML-INDENT"))));

    // Definitions
    /**
     *
     *
     * @param names;
     * 		LIST of symbols
     * 		Collectively defines a set of `cycml-serialize-X' functions. One for each
     * 		symbol in NAMES.
     * @unknown mahler
     */
    @LispMethod(comment = "@param names;\r\n\t\tLIST of symbols\r\n\t\tCollectively defines a set of `cycml-serialize-X\' functions. One for each\r\n\t\tsymbol in NAMES.\r\n@unknown mahler")
    public static final SubLObject def_cycml_primitives_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject names = current;
            SubLObject couples = NIL;
            SubLObject cdolist_list_var = names;
            SubLObject name = NIL;
            for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                couples = cons(list(DEF_CYCML_PRIMITIVE, name), couples);
            }
            return bq_cons(PROGN, append(couples, NIL));
        }
    }

    // Definitions
    /**
     *
     *
     * @param names;
     * 		LIST of symbols
     * 		Collectively defines a set of `cycml-serialize-X' functions. One for each
     * 		symbol in NAMES.
     * @unknown mahler
     */
    @LispMethod(comment = "@param names;\r\n\t\tLIST of symbols\r\n\t\tCollectively defines a set of `cycml-serialize-X\' functions. One for each\r\n\t\tsymbol in NAMES.\r\n@unknown mahler")
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

    /**
     *
     *
     * @param name;
     * 		SYMBOL
     * 		Defines the function `cycml-serialize-NAME' where NAME is the input parameter.
     * @unknown mahler
     */
    @LispMethod(comment = "@param name;\r\n\t\tSYMBOL\r\n\t\tDefines the function `cycml-serialize-NAME\' where NAME is the input parameter.\r\n@unknown mahler")
    public static final SubLObject def_cycml_primitive_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            name = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject body = $sym3$BODY;
                    SubLObject attributes = $sym4$ATTRIBUTES;
                    return listS(DEFINE_PUBLIC, intern(cconcatenate($str_alt6$CYCML_SERIALIZE_, symbol_name(name)), UNPROVIDED), list(body, $sym7$_OPTIONAL, attributes), list(CYCML_SERIALIZE_PRIMITIVE, Strings.string_downcase(symbol_name(name), UNPROVIDED, UNPROVIDED), body, attributes), $list_alt9);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt2);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param name;
     * 		SYMBOL
     * 		Defines the function `cycml-serialize-NAME' where NAME is the input parameter.
     * @unknown mahler
     */
    @LispMethod(comment = "@param name;\r\n\t\tSYMBOL\r\n\t\tDefines the function `cycml-serialize-NAME\' where NAME is the input parameter.\r\n@unknown mahler")
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

    /**
     *
     *
     * @param name;
    SYMBOL
     * 		
     * @param attributes
     * 		List of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)
     * 		Each ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.
     * @param body
     * 		Prints with indentation a primitive CycL object to @xref :variable *xml-stream*
     * @unknown mahler
     */
    @LispMethod(comment = "@param name;\nSYMBOL\r\n\t\t\r\n@param attributes\r\n\t\tList of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)\r\n\t\tEach ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.\r\n@param body\r\n\t\tPrints with indentation a primitive CycL object to @xref :variable *xml-stream*\r\n@unknown mahler")
    public static final SubLObject cycml_primitive_indented_element_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject attributes = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt10);
            attributes = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(PWHEN, $cycml_indent_mode_on$, $list_alt13, $list_alt14, listS(XML_ELEMENT, name, attributes, append(body, NIL))));
            }
        }
    }

    /**
     *
     *
     * @param name;
    SYMBOL
     * 		
     * @param attributes
     * 		List of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)
     * 		Each ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.
     * @param body
     * 		Prints with indentation a primitive CycL object to @xref :variable *xml-stream*
     * @unknown mahler
     */
    @LispMethod(comment = "@param name;\nSYMBOL\r\n\t\t\r\n@param attributes\r\n\t\tList of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)\r\n\t\tEach ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.\r\n@param body\r\n\t\tPrints with indentation a primitive CycL object to @xref :variable *xml-stream*\r\n@unknown mahler")
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

    /**
     *
     *
     * @param name;
    SYMBOL
     * 		
     * @param attributes
     * 		List of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)
     * 		Each ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.
     * @param body
     * 		Prints with indentation a complex CycL object to @xref :variable *xml-stream*
     * @unknown mahler
     */
    @LispMethod(comment = "@param name;\nSYMBOL\r\n\t\t\r\n@param attributes\r\n\t\tList of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)\r\n\t\tEach ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.\r\n@param body\r\n\t\tPrints with indentation a complex CycL object to @xref :variable *xml-stream*\r\n@unknown mahler")
    public static final SubLObject cycml_complex_indented_element_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            SubLObject attributes = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt10);
            attributes = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(PWHEN, $cycml_indent_mode_on$, $list_alt13, $list_alt14, listS(XML_ELEMENT, name, attributes, listS(CLET, $list_alt17, append(body, NIL)), $list_alt18)));
            }
        }
    }

    /**
     *
     *
     * @param name;
    SYMBOL
     * 		
     * @param attributes
     * 		List of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)
     * 		Each ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.
     * @param body
     * 		Prints with indentation a complex CycL object to @xref :variable *xml-stream*
     * @unknown mahler
     */
    @LispMethod(comment = "@param name;\nSYMBOL\r\n\t\t\r\n@param attributes\r\n\t\tList of the form (ATT-NAME-0 ATT-VALUE-0 ATT-NAME-1 ATT-VALUE-1...)\r\n\t\tEach ATT-NAME-j must be a string.  Each ATT-VALUE-j may be any printable object.\r\n@param body\r\n\t\tPrints with indentation a complex CycL object to @xref :variable *xml-stream*\r\n@unknown mahler")
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
        declareMacro("def_cycml_primitives", "DEF-CYCML-PRIMITIVES");
        declareMacro("def_cycml_primitive", "DEF-CYCML-PRIMITIVE");
        declareMacro("cycml_primitive_indented_element", "CYCML-PRIMITIVE-INDENTED-ELEMENT");
        declareMacro("cycml_complex_indented_element", "CYCML-COMPLEX-INDENTED-ELEMENT");
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

    static private final SubLList $list_alt2 = list(makeSymbol("NAME"));

    @Override
    public void runTopLevelForms() {
        setup_cycml_macros_file();
    }

    

    static private final SubLString $str_alt6$CYCML_SERIALIZE_ = makeString("CYCML-SERIALIZE-");

    static private final SubLList $list_alt9 = list(list(RET, NIL));

    static private final SubLList $list_alt10 = list(makeSymbol("NAME"), makeSymbol("ATTRIBUTES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt13 = list(makeSymbol("FORMAT"), makeSymbol("*XML-STREAM*"), makeString("~&"));

    static private final SubLList $list_alt14 = list(makeSymbol("CYCML-INDENT"));

    private static final SubLSymbol XML_ELEMENT = makeSymbol("XML-ELEMENT");

    static private final SubLList $list_alt17 = list(list(makeSymbol("*CYCML-INDENT-LEVEL*"), list(makeSymbol("1+"), makeSymbol("*CYCML-INDENT-LEVEL*"))));

    static private final SubLList $list_alt18 = list(list(makeSymbol("PWHEN"), makeSymbol("*CYCML-INDENT-MODE-ON*"), list(makeSymbol("FORMAT"), makeSymbol("*XML-STREAM*"), makeString("~&")), list(makeSymbol("CYCML-INDENT"))));
}

/**
 * Total time: 75 ms
 */
