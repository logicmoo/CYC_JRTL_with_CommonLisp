package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sksi;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sksi.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_sksi extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_sksi();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sksi";

    public static final String myFingerPrint = "627e0be01d9f35acc392823e0f8595b634e484e1e9a180e8b062d9f6bfab6358";

    private static final SubLObject $$sksiEqualsAny = reader_make_constant_shell(makeString("sksiEqualsAny"));



    private static final SubLSymbol $REMOVAL_SKSIEQUALSANY_CHECK = makeKeyword("REMOVAL-SKSIEQUALSANY-CHECK");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("sksiEqualsAny")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("sksiEqualsAny")), makeKeyword("FULLY-BOUND"), cons(reader_make_constant_shell(makeString("TheSet")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$sksiEqualsAny <fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$sksiEqualsAny #$Dog (#$TheSet #$Dog #$Cat))") });

    public static SubLObject declare_removal_modules_sksi_file() {
        return NIL;
    }

    public static SubLObject init_removal_modules_sksi_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_sksi_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$sksiEqualsAny);
        preference_modules.doomed_unless_arg_bindable($POS, $$sksiEqualsAny, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SKSIEQUALSANY_CHECK, $list3);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_sksi_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_sksi_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_sksi_file();
    }

    static {





    }
}

/**
 * Total time: 63 ms
 */
