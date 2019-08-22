package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_source_schema_object_fn extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_source_schema_object_fn();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_source_schema_object_fn";

    public static final String myFingerPrint = "b911b141f08220e426b6b86ab00d1e5875bca46335a3ff0205a1e0509660e70f";

    private static final SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_CHECK_POS = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-CHECK-POS");

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("CHECK"), T, makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-MT"), reader_make_constant_shell(makeString("SKSIMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equals")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("equals")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION1")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION2"))), list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION1")), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION2")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL?"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION1")), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION2")))), makeKeyword("SUPPORT"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$equals\n       (#$SourceSchemaObjectFn <SKS1> <ODS> <ID>)\n       (#$SourceSchemaObjectFn <SKS2> <ODS> <ID>))"), makeKeyword("EXAMPLE"), makeString("(#$equals\n      (#$SourceSchemaObjectFn #$CATS-KS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5))") });

    private static final SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_RIGHT_UNIFY = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-RIGHT-UNIFY");

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-MT"), reader_make_constant_shell(makeString("SKSIMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equals")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("equals")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("equals")), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$equals\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>)\n      <NOT-FULLY-BOUND>)"), makeKeyword("EXAMPLE"), makeString("(#$equals\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn ?SKS #$CATS-fbi-LS 5))") });

    private static final SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_EQUALS_LEFT_UNIFY = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-LEFT-UNIFY");

    public static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("equals")), makeKeyword("REQUIRED-MT"), reader_make_constant_shell(makeString("SKSIMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("EXPRESSION"))), list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("equals")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION"))), makeKeyword("SUPPORT"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$equals\n      <NOT-FULLY-BOUND>\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>))"), makeKeyword("EXAMPLE"), makeString("(#$equals\n      (#$SourceSchemaObjectFn ?SKS #$CATS-fbi-LS 5)\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5))") });

    private static final SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_POS = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-CHECK-POS");

    public static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("CHECK"), T, makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("undefined")), makeKeyword("REQUIRED-MT"), reader_make_constant_shell(makeString("SKSIMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("undefined")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("undefined")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION"))), list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED?"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("SUPPORT"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$undefined\n      (#$SourceSchemaObjectFn <SKS> <ODS> <ID>))"), makeKeyword("EXAMPLE"), makeString("(#$undefined\n      (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-hospital-LS 5))") });

    private static final SubLSymbol $REMOVAL_SOURCE_SCHEMA_OBJECT_FN_UNDEFINED_CHECK_NEG = makeKeyword("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-CHECK-NEG");

    public static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("CHECK"), T, makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("undefined")), makeKeyword("REQUIRED-MT"), reader_make_constant_shell(makeString("SKSIMt")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("undefined")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("SourceSchemaObjectFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("undefined")), list(makeKeyword("BIND"), makeSymbol("EXPRESSION"))), list(list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EXPRESSION")), list(makeKeyword("CALL"), makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-POSSIBLY-DEFINED?"), list(makeKeyword("VALUE"), makeSymbol("EXPRESSION")))), makeKeyword("SUPPORT"), makeSymbol("REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not\n      (#$undefined\n        (#$SourceSchemaObjectFn <SKS> <ODS> <ID>)))"), makeKeyword("EXAMPLE"), makeString("(#$not\n      (#$undefined\n        (#$SourceSchemaObjectFn #$CATS-fbi-KS #$CATS-fbi-LS 5)))") });

    private static final SubLSymbol $SOURCE_SCHEMA_OBJECT_FN = makeKeyword("SOURCE-SCHEMA-OBJECT-FN");

    public static SubLObject removal_source_schema_object_fn_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return removal_modules_equals.$default_unify_cost$.getDynamicValue(thread);
    }

    public static SubLObject removal_source_schema_object_fn_equals_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        final SubLObject support = arguments.make_hl_support($SOURCE_SCHEMA_OBJECT_FN, support_sentence, support_mt, UNPROVIDED);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject removal_source_schema_object_fn_undefined_support(final SubLObject support_sentence, SubLObject support_mt) {
        if (support_mt == UNPROVIDED) {
            support_mt = NIL;
        }
        final SubLObject support = arguments.make_hl_support($SOURCE_SCHEMA_OBJECT_FN, support_sentence, support_mt, UNPROVIDED);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject declare_removal_modules_source_schema_object_fn_file() {
        declareFunction(me, "removal_source_schema_object_fn_unify_cost", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNIFY-COST", 1, 1, false);
        declareFunction(me, "removal_source_schema_object_fn_equals_support", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-EQUALS-SUPPORT", 1, 1, false);
        declareFunction(me, "removal_source_schema_object_fn_undefined_support", "REMOVAL-SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-SUPPORT", 1, 1, false);
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

    
}

/**
 * Total time: 102 ms
 */
