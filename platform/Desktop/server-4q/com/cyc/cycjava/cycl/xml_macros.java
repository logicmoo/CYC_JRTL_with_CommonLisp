package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.xml_macros";
    public static final String myFingerPrint = "eac41364fcd530e3d4f7e81ce2c8fa758cce994348891bdd838fd033292a1cbc";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$NAME_VAR;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLSymbol $sym3$XML_START_TAG_INTERNAL;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$XML_END_TAG_INTERNAL;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$NAME_VAR;
    private static final SubLSymbol $sym9$_XML_DEFAULT_NAMESPACE_;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$FORMAT;
    private static final SubLSymbol $sym12$_XML_STREAM_;
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-macros.lisp", position = 734L)
    public static SubLObject xml_element(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)xml_macros.NIL;
        SubLObject attributes = (SubLObject)xml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_macros.$list0);
        attributes = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (xml_macros.NIL != body) {
            final SubLObject name_var = (SubLObject)xml_macros.$sym1$NAME_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)xml_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(name_var, name)), (SubLObject)ConsesLow.listS((SubLObject)xml_macros.$sym3$XML_START_TAG_INTERNAL, name_var, attributes, (SubLObject)xml_macros.$list4), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)xml_macros.$sym5$XML_END_TAG_INTERNAL, name_var))));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)xml_macros.$sym3$XML_START_TAG_INTERNAL, name, attributes, (SubLObject)xml_macros.$list6);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-macros.lisp", position = 1833L)
    public static SubLObject xml_element_wXdefault_namespace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)xml_macros.NIL;
        SubLObject attributes = (SubLObject)xml_macros.NIL;
        SubLObject default_namespace = (SubLObject)xml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_macros.$list7);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_macros.$list7);
        attributes = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_macros.$list7);
        default_namespace = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject name_var = (SubLObject)xml_macros.$sym8$NAME_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)xml_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(name_var, name)), (SubLObject)ConsesLow.list((SubLObject)xml_macros.$sym3$XML_START_TAG_INTERNAL, name_var, attributes, (SubLObject)xml_macros.NIL, (SubLObject)xml_macros.NIL, default_namespace), (SubLObject)ConsesLow.listS((SubLObject)xml_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)xml_macros.$sym9$_XML_DEFAULT_NAMESPACE_, default_namespace)), ConsesLow.append(body, (SubLObject)xml_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)xml_macros.$sym5$XML_END_TAG_INTERNAL, name_var));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-macros.lisp", position = 2536L)
    public static SubLObject xml_format(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject control_string = (SubLObject)xml_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)xml_macros.$list10);
        control_string = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)xml_macros.$sym11$FORMAT, (SubLObject)xml_macros.$sym12$_XML_STREAM_, control_string, ConsesLow.append(args, (SubLObject)xml_macros.NIL));
    }
    
    public static SubLObject declare_xml_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.xml_macros", "xml_element", "XML-ELEMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.xml_macros", "xml_element_wXdefault_namespace", "XML-ELEMENT-W/DEFAULT-NAMESPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.xml_macros", "xml_format", "XML-FORMAT");
        return (SubLObject)xml_macros.NIL;
    }
    
    public static SubLObject init_xml_macros_file() {
        return (SubLObject)xml_macros.NIL;
    }
    
    public static SubLObject setup_xml_macros_file() {
        return (SubLObject)xml_macros.NIL;
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
    
    static {
        me = (SubLFile)new xml_macros();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$NAME_VAR = SubLObjectFactory.makeUninternedSymbol("NAME-VAR");
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym3$XML_START_TAG_INTERNAL = SubLObjectFactory.makeSymbol("XML-START-TAG-INTERNAL");
        $list4 = ConsesLow.list((SubLObject)xml_macros.NIL);
        $sym5$XML_END_TAG_INTERNAL = SubLObjectFactory.makeSymbol("XML-END-TAG-INTERNAL");
        $list6 = ConsesLow.list((SubLObject)xml_macros.T);
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTES"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-NAMESPACE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym8$NAME_VAR = SubLObjectFactory.makeUninternedSymbol("NAME-VAR");
        $sym9$_XML_DEFAULT_NAMESPACE_ = SubLObjectFactory.makeSymbol("*XML-DEFAULT-NAMESPACE*");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTROL-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym11$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $sym12$_XML_STREAM_ = SubLObjectFactory.makeSymbol("*XML-STREAM*");
    }
}

/*

	Total time: 68 ms
	
*/