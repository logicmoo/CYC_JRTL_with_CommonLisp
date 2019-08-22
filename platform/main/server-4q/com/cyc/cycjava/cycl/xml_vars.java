package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class xml_vars extends SubLTranslatedFile {
    public static final SubLFile me = new xml_vars();

    public static final String myName = "com.cyc.cycjava.cycl.xml_vars";

    public static final String myFingerPrint = "5c4c9d5b45a7d51db7bdae896b700a0549269c925a01c6d241a047684b7326c5";

    // defparameter
    public static final SubLSymbol $xml_stream$ = makeSymbol("*XML-STREAM*");

    // defparameter
    public static final SubLSymbol $xml_entity_table$ = makeSymbol("*XML-ENTITY-TABLE*");

    // deflexical
    public static final SubLSymbol $xml_valid_char_code_ranges$ = makeSymbol("*XML-VALID-CHAR-CODE-RANGES*");

    // deflexical
    /**
     * The five entities that can be used without declaring them in an XML document.
     */
    public static final SubLSymbol $xml_predefined_entities$ = makeSymbol("*XML-PREDEFINED-ENTITIES*");

    // defparameter
    /**
     * SEQUENCEP of entity names (without & and ;) defined in the current document
     */
    public static final SubLSymbol $xml_document_entity_names$ = makeSymbol("*XML-DOCUMENT-ENTITY-NAMES*");

    // defparameter
    public static final SubLSymbol $xml_default_namespace$ = makeSymbol("*XML-DEFAULT-NAMESPACE*");

    // deflexical
    private static final SubLSymbol $formula_template_namespace$ = makeSymbol("*FORMULA-TEMPLATE-NAMESPACE*");

    // defparameter
    public static final SubLSymbol $formula_template_include_namespaceP$ = makeSymbol("*FORMULA-TEMPLATE-INCLUDE-NAMESPACE?*");

    // deflexical
    private static final SubLSymbol $cycl_query_namespace$ = makeSymbol("*CYCL-QUERY-NAMESPACE*");

    // defparameter
    public static final SubLSymbol $cycl_query_include_namespaceP$ = makeSymbol("*CYCL-QUERY-INCLUDE-NAMESPACE?*");

    // deflexical
    private static final SubLSymbol $cycml_namespace$ = makeSymbol("*CYCML-NAMESPACE*");

    // defparameter
    public static final SubLSymbol $cycml_include_namespaceP$ = makeSymbol("*CYCML-INCLUDE-NAMESPACE?*");

    // deflexical
    private static final SubLSymbol $proof_view_namespace$ = makeSymbol("*PROOF-VIEW-NAMESPACE*");

    // defparameter
    public static final SubLSymbol $proof_view_include_namespaceP$ = makeSymbol("*PROOF-VIEW-INCLUDE-NAMESPACE?*");

    // Internal Constants
    public static final SubLList $list0 = list(cons(CHAR_ampersand, makeString("amp")), cons(CHAR_less, makeString("lt")), cons(CHAR_greater, makeString("gt")), cons(CHAR_quotation, makeString("quot")), cons(CHAR_quote, makeString("apos")));

    public static final SubLList $list1 = list(list(NINE_INTEGER, NINE_INTEGER), list(TEN_INTEGER, TEN_INTEGER), list(THIRTEEN_INTEGER, THIRTEEN_INTEGER), list(makeInteger(32), makeInteger(32)), list(makeInteger(33), makeInteger(55295)), list(makeInteger(57344), makeInteger(65533)), list(makeInteger(65536), makeInteger(1114111)));

    public static final SubLList $list2 = list(cons(makeString("quot"), makeInteger(34)), cons(makeString("amp"), makeInteger(38)), cons(makeString("apos"), makeInteger(39)), cons(makeString("lt"), makeInteger(60)), cons(makeString("gt"), makeInteger(62)));

    private static final SubLString $str3$http___www_opencyc_org_xml_formul = makeString("http://www.opencyc.org/xml/formulaTemplate/");

    private static final SubLString $str4$http___www_opencyc_org_xml_cyclQu = makeString("http://www.opencyc.org/xml/cyclQuery/");

    private static final SubLString $str5$http___www_opencyc_org_xml_cycML_ = makeString("http://www.opencyc.org/xml/cycML/");

    private static final SubLString $str6$http___www_opencyc_org_xml_proofV = makeString("http://www.opencyc.org/xml/proofView/");

    public static SubLObject formula_template_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $formula_template_include_namespaceP$.getDynamicValue(thread) ? $formula_template_namespace$.getGlobalValue() : misc_utilities.uninitialized();
    }

    public static SubLObject cycl_query_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $cycl_query_include_namespaceP$.getDynamicValue(thread) ? $cycl_query_namespace$.getGlobalValue() : misc_utilities.uninitialized();
    }

    public static SubLObject cycml_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $cycml_include_namespaceP$.getDynamicValue(thread) ? $cycml_namespace$.getGlobalValue() : misc_utilities.uninitialized();
    }

    public static SubLObject proof_view_namespace() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $proof_view_include_namespaceP$.getDynamicValue(thread) ? $proof_view_namespace$.getGlobalValue() : misc_utilities.uninitialized();
    }

    public static SubLObject declare_xml_vars_file() {
        declareFunction(me, "formula_template_namespace", "FORMULA-TEMPLATE-NAMESPACE", 0, 0, false);
        declareFunction(me, "cycl_query_namespace", "CYCL-QUERY-NAMESPACE", 0, 0, false);
        declareFunction(me, "cycml_namespace", "CYCML-NAMESPACE", 0, 0, false);
        declareFunction(me, "proof_view_namespace", "PROOF-VIEW-NAMESPACE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_xml_vars_file() {
        defparameter("*XML-STREAM*", T);
        defparameter("*XML-ENTITY-TABLE*", $list0);
        deflexical("*XML-VALID-CHAR-CODE-RANGES*", $list1);
        deflexical("*XML-PREDEFINED-ENTITIES*", $list2);
        defparameter("*XML-DOCUMENT-ENTITY-NAMES*", misc_utilities.uninitialized());
        defparameter("*XML-DEFAULT-NAMESPACE*", misc_utilities.uninitialized());
        deflexical("*FORMULA-TEMPLATE-NAMESPACE*", $str3$http___www_opencyc_org_xml_formul);
        defparameter("*FORMULA-TEMPLATE-INCLUDE-NAMESPACE?*", NIL);
        deflexical("*CYCL-QUERY-NAMESPACE*", $str4$http___www_opencyc_org_xml_cyclQu);
        defparameter("*CYCL-QUERY-INCLUDE-NAMESPACE?*", NIL);
        deflexical("*CYCML-NAMESPACE*", $str5$http___www_opencyc_org_xml_cycML_);
        defparameter("*CYCML-INCLUDE-NAMESPACE?*", NIL);
        deflexical("*PROOF-VIEW-NAMESPACE*", $str6$http___www_opencyc_org_xml_proofV);
        defparameter("*PROOF-VIEW-INCLUDE-NAMESPACE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_xml_vars_file() {
        return NIL;
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

    
}

/**
 * Total time: 21 ms
 */
