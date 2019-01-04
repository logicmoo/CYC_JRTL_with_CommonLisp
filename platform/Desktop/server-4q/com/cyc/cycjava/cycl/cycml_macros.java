package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cycml_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cycml_macros";
    public static final String myFingerPrint = "e700a724f2a530ade411036e5f248722c5ba644f35d577c6393392f99911a380";
    private static final SubLSymbol $sym0$DEF_CYCML_PRIMITIVE;
    private static final SubLSymbol $sym1$PROGN;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$BODY;
    private static final SubLSymbol $sym4$ATTRIBUTES;
    private static final SubLSymbol $sym5$DEFINE_PUBLIC;
    private static final SubLString $str6$CYCML_SERIALIZE_;
    private static final SubLSymbol $sym7$_OPTIONAL;
    private static final SubLSymbol $sym8$CYCML_SERIALIZE_PRIMITIVE;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$PWHEN;
    private static final SubLSymbol $sym12$_CYCML_INDENT_MODE_ON_;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$CLET;
    private static final SubLList $list18;
    private static final SubLList $list19;
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-macros.lisp", position = 829L)
    public static SubLObject def_cycml_primitives(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject names;
        final SubLObject current = names = datum;
        SubLObject couples = (SubLObject)cycml_macros.NIL;
        SubLObject cdolist_list_var = names;
        SubLObject name = (SubLObject)cycml_macros.NIL;
        name = cdolist_list_var.first();
        while (cycml_macros.NIL != cdolist_list_var) {
            couples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)cycml_macros.$sym0$DEF_CYCML_PRIMITIVE, name), couples);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        }
        return reader.bq_cons((SubLObject)cycml_macros.$sym1$PROGN, ConsesLow.append(couples, (SubLObject)cycml_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-macros.lisp", position = 1159L)
    public static SubLObject def_cycml_primitive(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cycml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycml_macros.$list2);
        name = current.first();
        current = current.rest();
        if (cycml_macros.NIL == current) {
            final SubLObject body = (SubLObject)cycml_macros.$sym3$BODY;
            final SubLObject attributes = (SubLObject)cycml_macros.$sym4$ATTRIBUTES;
            return (SubLObject)ConsesLow.listS((SubLObject)cycml_macros.$sym5$DEFINE_PUBLIC, Packages.intern(Sequences.cconcatenate((SubLObject)cycml_macros.$str6$CYCML_SERIALIZE_, Symbols.symbol_name(name)), (SubLObject)cycml_macros.UNPROVIDED), (SubLObject)ConsesLow.list(body, (SubLObject)cycml_macros.$sym7$_OPTIONAL, attributes), (SubLObject)ConsesLow.list((SubLObject)cycml_macros.$sym8$CYCML_SERIALIZE_PRIMITIVE, Strings.string_downcase(Symbols.symbol_name(name), (SubLObject)cycml_macros.UNPROVIDED, (SubLObject)cycml_macros.UNPROVIDED), body, attributes), (SubLObject)cycml_macros.$list9);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cycml_macros.$list2);
        return (SubLObject)cycml_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-macros.lisp", position = 1580L)
    public static SubLObject cycml_primitive_indented_element(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cycml_macros.NIL;
        SubLObject attributes = (SubLObject)cycml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycml_macros.$list10);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycml_macros.$list10);
        attributes = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)cycml_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)cycml_macros.$sym11$PWHEN, (SubLObject)cycml_macros.$sym12$_CYCML_INDENT_MODE_ON_, (SubLObject)cycml_macros.$list13, (SubLObject)cycml_macros.$list14, (SubLObject)ConsesLow.listS((SubLObject)cycml_macros.$sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE, name, attributes, (SubLObject)cycml_macros.$list16, ConsesLow.append(body, (SubLObject)cycml_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cycml-macros.lisp", position = 2171L)
    public static SubLObject cycml_complex_indented_element(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)cycml_macros.NIL;
        SubLObject attributes = (SubLObject)cycml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycml_macros.$list10);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cycml_macros.$list10);
        attributes = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)cycml_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)cycml_macros.$sym11$PWHEN, (SubLObject)cycml_macros.$sym12$_CYCML_INDENT_MODE_ON_, (SubLObject)cycml_macros.$list13, (SubLObject)cycml_macros.$list14, (SubLObject)ConsesLow.listS((SubLObject)cycml_macros.$sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE, name, attributes, (SubLObject)cycml_macros.$list16, (SubLObject)ConsesLow.listS((SubLObject)cycml_macros.$sym17$CLET, (SubLObject)cycml_macros.$list18, ConsesLow.append(body, (SubLObject)cycml_macros.NIL)), (SubLObject)cycml_macros.$list19)));
    }
    
    public static SubLObject declare_cycml_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycml_macros", "def_cycml_primitives", "DEF-CYCML-PRIMITIVES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycml_macros", "def_cycml_primitive", "DEF-CYCML-PRIMITIVE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycml_macros", "cycml_primitive_indented_element", "CYCML-PRIMITIVE-INDENTED-ELEMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cycml_macros", "cycml_complex_indented_element", "CYCML-COMPLEX-INDENTED-ELEMENT");
        return (SubLObject)cycml_macros.NIL;
    }
    
    public static SubLObject init_cycml_macros_file() {
        return (SubLObject)cycml_macros.NIL;
    }
    
    public static SubLObject setup_cycml_macros_file() {
        return (SubLObject)cycml_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_cycml_macros_file();
    }
    
    public void initializeVariables() {
        init_cycml_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_cycml_macros_file();
    }
    
    static {
        me = (SubLFile)new cycml_macros();
        $sym0$DEF_CYCML_PRIMITIVE = SubLObjectFactory.makeSymbol("DEF-CYCML-PRIMITIVE");
        $sym1$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $sym3$BODY = SubLObjectFactory.makeUninternedSymbol("BODY");
        $sym4$ATTRIBUTES = SubLObjectFactory.makeUninternedSymbol("ATTRIBUTES");
        $sym5$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $str6$CYCML_SERIALIZE_ = SubLObjectFactory.makeString("CYCML-SERIALIZE-");
        $sym7$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $sym8$CYCML_SERIALIZE_PRIMITIVE = SubLObjectFactory.makeSymbol("CYCML-SERIALIZE-PRIMITIVE");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)cycml_macros.NIL));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym12$_CYCML_INDENT_MODE_ON_ = SubLObjectFactory.makeSymbol("*CYCML-INDENT-MODE-ON*");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeString("~&"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-INDENT"));
        $sym15$XML_ELEMENT_W_DEFAULT_NAMESPACE = SubLObjectFactory.makeSymbol("XML-ELEMENT-W/DEFAULT-NAMESPACE");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-NAMESPACE"));
        $sym17$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCML-INDENT-LEVEL*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("*CYCML-INDENT-LEVEL*"))));
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*CYCML-INDENT-MODE-ON*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("*XML-STREAM*"), (SubLObject)SubLObjectFactory.makeString("~&")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCML-INDENT"))));
    }
}

/*

	Total time: 75 ms
	
*/