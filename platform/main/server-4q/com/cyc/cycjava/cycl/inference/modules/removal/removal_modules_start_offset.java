package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_start_offset extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_start_offset";
    public static String myFingerPrint = "8b1870ef90c82e8c15c150b66ddf7099a0f1137297f42360f41b9252f14ad7c4";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 500L)
    private static SubLSymbol $start_offset_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 2600L)
    private static SubLSymbol $start_offset_unify_cost$;
    private static SubLSymbol $sym0$_START_OFFSET_CHECK_COST_;
    private static SubLSymbol $REMOVAL_START_OFFSET_CHECK_POS;
    private static SubLList $list2;
    private static SubLSymbol $REMOVAL_START_OFFSET_CHECK_NEG;
    private static SubLList $list4;
    private static SubLSymbol $sym5$_START_OFFSET_UNIFY_COST_;
    private static SubLSymbol $REMOVAL_START_OFFSET_UNIFY_ARG3_POS;
    private static SubLList $list7;
    private static SubLSymbol $REMOVAL_START_OFFSET_DELAY;
    private static SubLList $list9;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 600L)
    public static SubLObject string_has_offsetP(SubLObject big_string, SubLObject little_string, SubLObject offset) {
        return string_utilities.starts_with(string_utilities.substring(big_string, offset, UNPROVIDED), little_string);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 1600L)
    public static SubLObject string_has_offset_negP(SubLObject big_string, SubLObject little_string, SubLObject offset) {
        return makeBoolean(NIL == string_has_offsetP(big_string, little_string, offset));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-start-offset.lisp", position = 3600L)
    public static SubLObject start_offset_of_string_iterator(SubLObject big_string, SubLObject little_string) {
        return string_utilities.search_all(little_string, big_string, Symbols.symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject declare_removal_modules_start_offset_file() {
        declareFunction(myName, "string_has_offsetP", "STRING-HAS-OFFSET?", 3, 0, false);
        declareFunction(myName, "string_has_offset_negP", "STRING-HAS-OFFSET-NEG?", 3, 0, false);
        declareFunction(myName, "start_offset_of_string_iterator", "START-OFFSET-OF-STRING-ITERATOR", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_start_offset_file() {
        $start_offset_check_cost$ = deflexical("*START-OFFSET-CHECK-COST*", (maybeDefault($sym0$_START_OFFSET_CHECK_COST_, $start_offset_check_cost$, ONE_INTEGER)));
        $start_offset_unify_cost$ = deflexical("*START-OFFSET-UNIFY-COST*", (maybeDefault($sym5$_START_OFFSET_UNIFY_COST_, $start_offset_unify_cost$, ONE_INTEGER)));
        return NIL;
    }

    public static SubLObject setup_removal_modules_start_offset_file() {
        subl_macro_promotions.declare_defglobal($sym0$_START_OFFSET_CHECK_COST_);
        inference_modules.inference_removal_module($REMOVAL_START_OFFSET_CHECK_POS, $list2);
        inference_modules.inference_removal_module($REMOVAL_START_OFFSET_CHECK_NEG, $list4);
        subl_macro_promotions.declare_defglobal($sym5$_START_OFFSET_UNIFY_COST_);
        inference_modules.inference_removal_module($REMOVAL_START_OFFSET_UNIFY_ARG3_POS, $list7);
        inference_modules.inference_removal_module($REMOVAL_START_OFFSET_DELAY, $list9);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_start_offset_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_start_offset_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_start_offset_file();
    }

    static {
        me = new removal_modules_start_offset();
        $start_offset_check_cost$ = null;
        $start_offset_unify_cost$ = null;
        $sym0$_START_OFFSET_CHECK_COST_ = makeSymbol("*START-OFFSET-CHECK-COST*");
        $REMOVAL_START_OFFSET_CHECK_POS = makeKeyword("REMOVAL-START-OFFSET-CHECK-POS");
        $list2 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startOffset")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startOffset")), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startOffset")), list(makeKeyword("BIND"), makeSymbol("BIG-STRING")), list(makeKeyword("BIND"), makeSymbol("LITTLE-STRING")), list(makeKeyword("BIND"), makeSymbol("OFFSET"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRING-HAS-OFFSET?"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET"))),
                makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" 0)") });
        $REMOVAL_START_OFFSET_CHECK_NEG = makeKeyword("REMOVAL-START-OFFSET-CHECK-NEG");
        $list4 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("startOffset")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startOffset")), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startOffset")), list(makeKeyword("BIND"), makeSymbol("BIG-STRING")), list(makeKeyword("BIND"), makeSymbol("LITTLE-STRING")), list(makeKeyword("BIND"), makeSymbol("OFFSET"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRING-HAS-OFFSET-NEG?"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET"))),
                makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startOffset <string> <string> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$startOffset \"foo\" \"bar\" 0))") });
        $sym5$_START_OFFSET_UNIFY_COST_ = makeSymbol("*START-OFFSET-UNIFY-COST*");
        $REMOVAL_START_OFFSET_UNIFY_ARG3_POS = makeKeyword("REMOVAL-START-OFFSET-UNIFY-ARG3-POS");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startOffset")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startOffset")), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startOffset")), list(makeKeyword("BIND"), makeSymbol("BIG-STRING")), list(makeKeyword("BIND"), makeSymbol("LITTLE-STRING")), list(makeKeyword("BIND"), makeSymbol("OFFSET"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("START-OFFSET-OF-STRING-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
                list(makeConstSym(("startOffset")), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <not-fully-bound>)"),
                makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" ?N)") });
        $REMOVAL_START_OFFSET_DELAY = makeKeyword("REMOVAL-START-OFFSET-DELAY");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startOffset")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), listS(makeConstSym(("startOffset")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeConstSym(("startOffset")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"),
                makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("Delay module that ensures that \n    (#$startOffset . ARGS)\n    is not worked on if one of first two arguments is not fully bound."), makeKeyword("EXAMPLE"),
                makeString("(#$startOffset ?X ?Y 10)") });
    }
}
/*
 *
 * Total time: 91 ms
 *
 */