package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_sks_registered extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_sks_registered();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.modules.removal.removal_modules_sks_registered";


    private static final SubLObject $$sksRegistered = reader_make_constant_shell(makeString("sksRegistered"));

    private static final SubLSymbol $REMOVAL_SKS_REGISTERED_CHECK_POS = makeKeyword("REMOVAL-SKS-REGISTERED-CHECK-POS");

    private static final SubLList $list2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("sksRegistered")), list($BIND, makeSymbol("SOURCE"))), list(makeKeyword("VALUE"), makeSymbol("SOURCE"))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$sksRegistered <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$sksRegistered #$BLN-Example1-KS)") });

    private static final SubLSymbol $REMOVAL_SKS_REGISTERED_CHECK_NEG = makeKeyword("REMOVAL-SKS-REGISTERED-CHECK-NEG");

    private static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("sksRegistered")), list($BIND, makeSymbol("SOURCE"))), list(makeKeyword("VALUE"), makeSymbol("SOURCE"))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("INVERT-BOOLEAN-ANSWER"), list($CALL, makeSymbol("EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?"), makeKeyword("INPUT"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$sksRegistered <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$sksRegistered #$BLN-Example1-KS))") });

    private static final SubLSymbol $REMOVAL_SKS_REGISTERED_UNIFY_POS = makeKeyword("REMOVAL-SKS-REGISTERED-UNIFY-POS");

    private static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-PATTERN"), list($CALL, makeSymbol("NUMBER-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE")), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("LIST-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("sksRegistered")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$sksRegistered <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$sksRegistered ?SOURCE)") });

    public static SubLObject declare_removal_modules_sks_registered_file() {
        return NIL;
    }

    public static SubLObject init_removal_modules_sks_registered_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_sks_registered_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$sksRegistered);
        inference_modules.inference_removal_module($REMOVAL_SKS_REGISTERED_CHECK_POS, $list2);
        inference_modules.inference_removal_module($REMOVAL_SKS_REGISTERED_CHECK_NEG, $list4);
        inference_modules.inference_removal_module($REMOVAL_SKS_REGISTERED_UNIFY_POS, $list6);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_sks_registered_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_sks_registered_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_sks_registered_file();
    }

    static {








    }
}

/**
 * Total time: 69 ms
 */
