package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_source_schema_object_fn extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_schema_object_fn";
    public static String myFingerPrint = "b911b141f08220e426b6b86ab00d1e5875bca46335a3ff0205a1e0509660e70f";
    private static SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS;
    private static SubLList $list1;
    private static SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY;
    private static SubLList $list3;
    private static SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY;
    private static SubLList $list5;
    private static SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS;
    private static SubLList $list7;
    private static SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG;
    private static SubLList $list9;
    private static SubLSymbol $SOURCE_SCHEMA_OBJECT_FN;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-schema-object-fn.lisp", position = 6700L)
    public static SubLObject removal_source_schema_object_fn_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        return removal_modules_equals.$default_unify_cost$.getDynamicValue(thread);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-schema-object-fn.lisp", position = 6900L)
    public static SubLObject removal_source_schema_object_fn_equals_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject support = arguments.make_hl_support($SOURCE_SCHEMA_OBJECT_FN, support_sentence, support_mt, UNPROVIDED);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-source-schema-object-fn.lisp", position = 7100L)
    public static SubLObject removal_source_schema_object_fn_undefined_support(SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        SubLObject support = arguments.make_hl_support($SOURCE_SCHEMA_OBJECT_FN, support_sentence, support_mt, UNPROVIDED);
        SubLObject more_supports = NIL;
        return Values.values(support, more_supports);
    }

    public static SubLObject declare_removal_modules_source_schema_object_fn_file() {
        declareFunction(myName, "removal_source_schema_object_fn_unify_cost", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST", 1, 1, false);
        declareFunction(myName, "removal_source_schema_object_fn_equals_support", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT", 1, 1, false);
        declareFunction(myName, "removal_source_schema_object_fn_undefined_support", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_source_schema_object_fn_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_source_schema_object_fn_file() {
        inference_modules.inference_removal_module($REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS, $list1);
        inference_modules.inference_removal_module($REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY, $list3);
        inference_modules.inference_removal_module($REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY, $list5);
        inference_modules.inference_removal_module($REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS, $list7);
        inference_modules.inference_removal_module($REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG, $list9);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_source_schema_object_fn_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_source_schema_object_fn_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_source_schema_object_fn_file();
    }

    static {
        me = new removal_modules_source_schema_object_fn();
        $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-CHECK-POS");
        $list1 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("CHECK"), T, makeKeyword("PREDICATE"), makeConstSym(("equals")), makeKeyword("REQUIRED-MT"), makeConstSym(("SKSIMt")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("equals")), list(makeKeyword("NAT"), list(makeConstSym(("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))),
                        list(makeKeyword("NAT"), list(makeConstSym(("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("equals")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION1")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION1")), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION2")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL?"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION1")), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION2")))),
                makeKeyword("SUPPORT"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$equals\n       (#$SourceSchemaObjectFn <SKS1> <ODS> <ID>)\n       (#$SourceSchemaObjectFn <SKS2> <ODS> <ID>))"), makeKeyword("EXAMPLE"),
                makeString("(#$equals\n      (#$SourceSchemaObjectFn #$CATS-KS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5))") });
        $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-RIGHT-UNIFY");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("equals")), makeKeyword("REQUIRED-MT"), makeConstSym(("SKSIMt")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("equals")), list(makeKeyword("NAT"), list(makeConstSym(("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"),
                makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("equals")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("equals")), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$equals\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>)\n      <NOT-FULLY-BOUND>)"), makeKeyword("EXAMPLE"), makeString("(#$equals\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn ?SKS #$CATS-fbi-LS 5))") });
        $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-LEFT-UNIFY");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("equals")), makeKeyword("REQUIRED-MT"), makeConstSym(("SKSIMt")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("equals")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), list(makeConstSym(("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"),
                makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("equals")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("EXPRESSION"))), list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("equals")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION"))), makeKeyword("SUPPORT"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT"), makeKeyword("DOCUMENTATION"),
                makeString("(#$equals\n      <NOT-FULLY-BOUND>\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>))"), makeKeyword("EXAMPLE"), makeString("(#$equals\n      (#$SourceSchemaObjectFn ?SKS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5))") });
        $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-CHECK-POS");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("CHECK"), T, makeKeyword("PREDICATE"), makeConstSym(("undefined")), makeKeyword("REQUIRED-MT"), makeConstSym(("SKSIMt")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("undefined")), list(makeKeyword("NAT"), list(makeConstSym(("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("undefined")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION"))), list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED?"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("SUPPORT"),
                makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$undefined\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>))"), makeKeyword("EXAMPLE"),
                makeString("(#$undefined\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-hospital-LS 5))") });
        $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-CHECK-NEG");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("CHECK"), T, makeKeyword("PREDICATE"), makeConstSym(("undefined")), makeKeyword("REQUIRED-MT"), makeConstSym(("SKSIMt")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("undefined")), list(makeKeyword("NAT"), list(makeConstSym(("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"),
                makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("undefined")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION"))), list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-POSSIBLY-DEFINED?"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("SUPPORT"),
                makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not\n      (#$undefined\n        (#$SourceSchemaObjectFn <SKS> <ODS> <ID>)))"), makeKeyword("EXAMPLE"),
                makeString("(#$not\n      (#$undefined\n        (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5)))") });
        $SOURCE_SCHEMA_OBJECT_FN = makeKeyword("SOURCE-SCHEMA-OBJECT-FN");
    }
}
/*
 *
 * Total time: 102 ms
 *
 */