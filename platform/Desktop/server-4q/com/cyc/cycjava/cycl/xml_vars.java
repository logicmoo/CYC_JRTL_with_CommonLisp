package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class xml_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.xml_vars";
    public static final String myFingerPrint = "5c4c9d5b45a7d51db7bdae896b700a0549269c925a01c6d241a047684b7326c5";
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 703L)
    public static SubLSymbol $xml_stream$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 741L)
    public static SubLSymbol $xml_entity_table$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 884L)
    public static SubLSymbol $xml_valid_char_code_ranges$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1170L)
    public static SubLSymbol $xml_predefined_entities$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1408L)
    public static SubLSymbol $xml_document_entity_names$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1558L)
    public static SubLSymbol $xml_default_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1701L)
    private static SubLSymbol $formula_template_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1799L)
    public static SubLSymbol $formula_template_include_namespaceP$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2012L)
    private static SubLSymbol $cycl_query_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2097L)
    public static SubLSymbol $cycl_query_include_namespaceP$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2286L)
    private static SubLSymbol $cycml_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2362L)
    public static SubLSymbol $cycml_include_namespaceP$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2531L)
    private static SubLSymbol $proof_view_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2616L)
    public static SubLSymbol $proof_view_include_namespaceP$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLString $str3$http___www_opencyc_org_xml_formul;
    private static final SubLString $str4$http___www_opencyc_org_xml_cyclQu;
    private static final SubLString $str5$http___www_opencyc_org_xml_cycML_;
    private static final SubLString $str6$http___www_opencyc_org_xml_proofV;
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 1863L)
    public static SubLObject formula_template_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (xml_vars.NIL != xml_vars.$formula_template_include_namespaceP$.getDynamicValue(thread)) ? xml_vars.$formula_template_namespace$.getGlobalValue() : misc_utilities.uninitialized();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2155L)
    public static SubLObject cycl_query_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (xml_vars.NIL != xml_vars.$cycl_query_include_namespaceP$.getDynamicValue(thread)) ? xml_vars.$cycl_query_namespace$.getGlobalValue() : misc_utilities.uninitialized();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2415L)
    public static SubLObject cycml_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (xml_vars.NIL != xml_vars.$cycml_include_namespaceP$.getDynamicValue(thread)) ? xml_vars.$cycml_namespace$.getGlobalValue() : misc_utilities.uninitialized();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/xml-vars.lisp", position = 2674L)
    public static SubLObject proof_view_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (xml_vars.NIL != xml_vars.$proof_view_include_namespaceP$.getDynamicValue(thread)) ? xml_vars.$proof_view_namespace$.getGlobalValue() : misc_utilities.uninitialized();
    }
    
    public static SubLObject declare_xml_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_vars", "formula_template_namespace", "FORMULA-TEMPLATE-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_vars", "cycl_query_namespace", "CYCL-QUERY-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_vars", "cycml_namespace", "CYCML-NAMESPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.xml_vars", "proof_view_namespace", "PROOF-VIEW-NAMESPACE", 0, 0, false);
        return (SubLObject)xml_vars.NIL;
    }
    
    public static SubLObject init_xml_vars_file() {
        xml_vars.$xml_stream$ = SubLFiles.defparameter("*XML-STREAM*", (SubLObject)xml_vars.T);
        xml_vars.$xml_entity_table$ = SubLFiles.defparameter("*XML-ENTITY-TABLE*", (SubLObject)xml_vars.$list0);
        xml_vars.$xml_valid_char_code_ranges$ = SubLFiles.deflexical("*XML-VALID-CHAR-CODE-RANGES*", (SubLObject)xml_vars.$list1);
        xml_vars.$xml_predefined_entities$ = SubLFiles.deflexical("*XML-PREDEFINED-ENTITIES*", (SubLObject)xml_vars.$list2);
        xml_vars.$xml_document_entity_names$ = SubLFiles.defparameter("*XML-DOCUMENT-ENTITY-NAMES*", misc_utilities.uninitialized());
        xml_vars.$xml_default_namespace$ = SubLFiles.defparameter("*XML-DEFAULT-NAMESPACE*", misc_utilities.uninitialized());
        xml_vars.$formula_template_namespace$ = SubLFiles.deflexical("*FORMULA-TEMPLATE-NAMESPACE*", (SubLObject)xml_vars.$str3$http___www_opencyc_org_xml_formul);
        xml_vars.$formula_template_include_namespaceP$ = SubLFiles.defparameter("*FORMULA-TEMPLATE-INCLUDE-NAMESPACE?*", (SubLObject)xml_vars.NIL);
        xml_vars.$cycl_query_namespace$ = SubLFiles.deflexical("*CYCL-QUERY-NAMESPACE*", (SubLObject)xml_vars.$str4$http___www_opencyc_org_xml_cyclQu);
        xml_vars.$cycl_query_include_namespaceP$ = SubLFiles.defparameter("*CYCL-QUERY-INCLUDE-NAMESPACE?*", (SubLObject)xml_vars.NIL);
        xml_vars.$cycml_namespace$ = SubLFiles.deflexical("*CYCML-NAMESPACE*", (SubLObject)xml_vars.$str5$http___www_opencyc_org_xml_cycML_);
        xml_vars.$cycml_include_namespaceP$ = SubLFiles.defparameter("*CYCML-INCLUDE-NAMESPACE?*", (SubLObject)xml_vars.NIL);
        xml_vars.$proof_view_namespace$ = SubLFiles.deflexical("*PROOF-VIEW-NAMESPACE*", (SubLObject)xml_vars.$str6$http___www_opencyc_org_xml_proofV);
        xml_vars.$proof_view_include_namespaceP$ = SubLFiles.defparameter("*PROOF-VIEW-INCLUDE-NAMESPACE?*", (SubLObject)xml_vars.NIL);
        return (SubLObject)xml_vars.NIL;
    }
    
    public static SubLObject setup_xml_vars_file() {
        return (SubLObject)xml_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_xml_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_xml_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_xml_vars_file();
    }
    
    static {
        me = (SubLFile)new xml_vars();
        xml_vars.$xml_stream$ = null;
        xml_vars.$xml_entity_table$ = null;
        xml_vars.$xml_valid_char_code_ranges$ = null;
        xml_vars.$xml_predefined_entities$ = null;
        xml_vars.$xml_document_entity_names$ = null;
        xml_vars.$xml_default_namespace$ = null;
        xml_vars.$formula_template_namespace$ = null;
        xml_vars.$formula_template_include_namespaceP$ = null;
        xml_vars.$cycl_query_namespace$ = null;
        xml_vars.$cycl_query_include_namespaceP$ = null;
        xml_vars.$cycml_namespace$ = null;
        xml_vars.$cycml_include_namespaceP$ = null;
        xml_vars.$proof_view_namespace$ = null;
        xml_vars.$proof_view_include_namespaceP$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_ampersand, (SubLObject)SubLObjectFactory.makeString("amp")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_less, (SubLObject)SubLObjectFactory.makeString("lt")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_greater, (SubLObject)SubLObjectFactory.makeString("gt")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_quotation, (SubLObject)SubLObjectFactory.makeString("quot")), (SubLObject)ConsesLow.cons((SubLObject)Characters.CHAR_quote, (SubLObject)SubLObjectFactory.makeString("apos")));
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)xml_vars.NINE_INTEGER, (SubLObject)xml_vars.NINE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)xml_vars.TEN_INTEGER, (SubLObject)xml_vars.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)xml_vars.THIRTEEN_INTEGER, (SubLObject)xml_vars.THIRTEEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)SubLObjectFactory.makeInteger(32)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(33), (SubLObject)SubLObjectFactory.makeInteger(55295)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(57344), (SubLObject)SubLObjectFactory.makeInteger(65533)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeInteger(65536), (SubLObject)SubLObjectFactory.makeInteger(1114111)));
        $list2 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("quot"), (SubLObject)SubLObjectFactory.makeInteger(34)), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("amp"), (SubLObject)SubLObjectFactory.makeInteger(38)), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("apos"), (SubLObject)SubLObjectFactory.makeInteger(39)), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lt"), (SubLObject)SubLObjectFactory.makeInteger(60)), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("gt"), (SubLObject)SubLObjectFactory.makeInteger(62)));
        $str3$http___www_opencyc_org_xml_formul = SubLObjectFactory.makeString("http://www.opencyc.org/xml/formulaTemplate/");
        $str4$http___www_opencyc_org_xml_cyclQu = SubLObjectFactory.makeString("http://www.opencyc.org/xml/cyclQuery/");
        $str5$http___www_opencyc_org_xml_cycML_ = SubLObjectFactory.makeString("http://www.opencyc.org/xml/cycML/");
        $str6$http___www_opencyc_org_xml_proofV = SubLObjectFactory.makeString("http://www.opencyc.org/xml/proofView/");
    }
}

/*

	Total time: 21 ms
	
*/