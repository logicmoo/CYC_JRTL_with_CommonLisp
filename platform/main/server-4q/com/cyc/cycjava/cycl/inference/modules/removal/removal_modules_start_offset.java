package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_start_offset extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_start_offset();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_start_offset";

    public static final String myFingerPrint = "8b1870ef90c82e8c15c150b66ddf7099a0f1137297f42360f41b9252f14ad7c4";





    // Internal Constants
    public static final SubLSymbol $start_offset_check_cost$ = makeSymbol("*START-OFFSET-CHECK-COST*");

    private static final SubLSymbol $REMOVAL_START_OFFSET_CHECK_POS = makeKeyword("REMOVAL-START-OFFSET-CHECK-POS");

    public static final SubLList $list2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startOffset")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startOffset")), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startOffset")), list(makeKeyword("BIND"), makeSymbol("BIG-STRING")), list(makeKeyword("BIND"), makeSymbol("LITTLE-STRING")), list(makeKeyword("BIND"), makeSymbol("OFFSET"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRING-HAS-OFFSET?"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET"))), makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" 0)") });

    private static final SubLSymbol $REMOVAL_START_OFFSET_CHECK_NEG = makeKeyword("REMOVAL-START-OFFSET-CHECK-NEG");

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startOffset")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startOffset")), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startOffset")), list(makeKeyword("BIND"), makeSymbol("BIG-STRING")), list(makeKeyword("BIND"), makeSymbol("LITTLE-STRING")), list(makeKeyword("BIND"), makeSymbol("OFFSET"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("CALL"), makeSymbol("STRING-HAS-OFFSET-NEG?"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startOffset <string> <string> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$startOffset \"foo\" \"bar\" 0))") });

    public static final SubLSymbol $start_offset_unify_cost$ = makeSymbol("*START-OFFSET-UNIFY-COST*");

    private static final SubLSymbol $REMOVAL_START_OFFSET_UNIFY_ARG3_POS = makeKeyword("REMOVAL-START-OFFSET-UNIFY-ARG3-POS");

    public static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startOffset")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("startOffset")), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("startOffset")), list(makeKeyword("BIND"), makeSymbol("BIG-STRING")), list(makeKeyword("BIND"), makeSymbol("LITTLE-STRING")), list(makeKeyword("BIND"), makeSymbol("OFFSET"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("START-OFFSET-OF-STRING-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("startOffset")), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" ?N)") });

    private static final SubLSymbol $REMOVAL_START_OFFSET_DELAY = makeKeyword("REMOVAL-START-OFFSET-DELAY");

    public static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("startOffset")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), listS(reader_make_constant_shell(makeString("startOffset")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("startOffset")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("Delay module that ensures that \n    (#$startOffset . ARGS)\n    is not worked on if one of first two arguments is not fully bound."), makeKeyword("EXAMPLE"), makeString("(#$startOffset ?X ?Y 10)") });

    public static SubLObject string_has_offsetP(final SubLObject big_string, final SubLObject little_string, final SubLObject offset) {
        return string_utilities.starts_with(string_utilities.substring(big_string, offset, UNPROVIDED), little_string);
    }

    public static SubLObject string_has_offset_negP(final SubLObject big_string, final SubLObject little_string, final SubLObject offset) {
        return makeBoolean(NIL == string_has_offsetP(big_string, little_string, offset));
    }

    public static SubLObject start_offset_of_string_iterator(final SubLObject big_string, final SubLObject little_string) {
        return string_utilities.search_all(little_string, big_string, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject declare_removal_modules_start_offset_file() {
        declareFunction(me, "string_has_offsetP", "STRING-HAS-OFFSET?", 3, 0, false);
        declareFunction(me, "string_has_offset_negP", "STRING-HAS-OFFSET-NEG?", 3, 0, false);
        declareFunction(me, "start_offset_of_string_iterator", "START-OFFSET-OF-STRING-ITERATOR", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_start_offset_file() {
        deflexical("*START-OFFSET-CHECK-COST*", SubLSystemTrampolineFile.maybeDefault($start_offset_check_cost$, $start_offset_check_cost$, ONE_INTEGER));
        deflexical("*START-OFFSET-UNIFY-COST*", SubLSystemTrampolineFile.maybeDefault($start_offset_unify_cost$, $start_offset_unify_cost$, ONE_INTEGER));
        return NIL;
    }

    public static SubLObject setup_removal_modules_start_offset_file() {
        declare_defglobal($start_offset_check_cost$);
        inference_modules.inference_removal_module($REMOVAL_START_OFFSET_CHECK_POS, $list2);
        inference_modules.inference_removal_module($REMOVAL_START_OFFSET_CHECK_NEG, $list4);
        declare_defglobal($start_offset_unify_cost$);
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

    
}

/**
 * Total time: 91 ms
 */
