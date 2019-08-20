/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-START-OFFSET
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-start-offset.lisp
 * created:     2019/07/03 17:37:46
 */
public final class removal_modules_start_offset extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_start_offset();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $start_offset_check_cost$ = makeSymbol("*START-OFFSET-CHECK-COST*");

    private static final SubLSymbol $REMOVAL_START_OFFSET_CHECK_POS = makeKeyword("REMOVAL-START-OFFSET-CHECK-POS");

    static private final SubLList $list2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("startOffset"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("startOffset"), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("startOffset"), list($BIND, makeSymbol("BIG-STRING")), list($BIND, makeSymbol("LITTLE-STRING")), list($BIND, makeSymbol("OFFSET"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("STRING-HAS-OFFSET?"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET"))), makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" 0)") });

    private static final SubLSymbol $REMOVAL_START_OFFSET_CHECK_NEG = makeKeyword("REMOVAL-START-OFFSET-CHECK-NEG");

    static private final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("startOffset"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("startOffset"), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("startOffset"), list($BIND, makeSymbol("BIG-STRING")), list($BIND, makeSymbol("LITTLE-STRING")), list($BIND, makeSymbol("OFFSET"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("STRING-HAS-OFFSET-NEG?"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startOffset <string> <string> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$startOffset \"foo\" \"bar\" 0))") });

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("startOffset"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("startOffset"), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("startOffset"), list($BIND, makeSymbol("BIG-STRING")), list($BIND, makeSymbol("LITTLE-STRING")), list($BIND, makeSymbol("OFFSET"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("STRING-HAS-OFFSET?"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET"))), makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" 0)") });

    public static final SubLSymbol $start_offset_unify_cost$ = makeSymbol("*START-OFFSET-UNIFY-COST*");

    private static final SubLSymbol $REMOVAL_START_OFFSET_UNIFY_ARG3_POS = makeKeyword("REMOVAL-START-OFFSET-UNIFY-ARG3-POS");

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("startOffset"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("startOffset"), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("startOffset"), list($BIND, makeSymbol("BIG-STRING")), list($BIND, makeSymbol("LITTLE-STRING")), list($BIND, makeSymbol("OFFSET"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("START-OFFSET-OF-STRING-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("startOffset"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" ?N)") });

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell("startOffset"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("startOffset"), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("startOffset"), list($BIND, makeSymbol("BIG-STRING")), list($BIND, makeSymbol("LITTLE-STRING")), list($BIND, makeSymbol("OFFSET"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list($CALL, makeSymbol("STRING-HAS-OFFSET-NEG?"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startOffset <string> <string> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$startOffset \"foo\" \"bar\" 0))") });

    private static final SubLSymbol $REMOVAL_START_OFFSET_DELAY = makeKeyword("REMOVAL-START-OFFSET-DELAY");

    static private final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("startOffset"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), listS(reader_make_constant_shell("startOffset"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("startOffset"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("Delay module that ensures that \n    (#$startOffset . ARGS)\n    is not worked on if one of first two arguments is not fully bound."), makeKeyword("EXAMPLE"), makeString("(#$startOffset ?X ?Y 10)") });

    /**
     * Returns T iff LITTLE-STRING is a case-sensitive substring of BIG-STRING starting at OFFSET.
     */
    @LispMethod(comment = "Returns T iff LITTLE-STRING is a case-sensitive substring of BIG-STRING starting at OFFSET.")
    public static final SubLObject string_has_offsetP_alt(SubLObject big_string, SubLObject little_string, SubLObject offset) {
        return string_utilities.starts_with(string_utilities.substring(big_string, offset, UNPROVIDED), little_string);
    }

    /**
     * Returns T iff LITTLE-STRING is a case-sensitive substring of BIG-STRING starting at OFFSET.
     */
    @LispMethod(comment = "Returns T iff LITTLE-STRING is a case-sensitive substring of BIG-STRING starting at OFFSET.")
    public static SubLObject string_has_offsetP(final SubLObject big_string, final SubLObject little_string, final SubLObject offset) {
        return string_utilities.starts_with(string_utilities.substring(big_string, offset, UNPROVIDED), little_string);
    }

    /**
     * Returns NIL iff LITTLE-STRING is a case-sensitive substring of BIG-STRING starting at OFFSET.
     */
    @LispMethod(comment = "Returns NIL iff LITTLE-STRING is a case-sensitive substring of BIG-STRING starting at OFFSET.")
    public static final SubLObject string_has_offset_negP_alt(SubLObject big_string, SubLObject little_string, SubLObject offset) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_start_offset.string_has_offsetP(big_string, little_string, offset));
    }

    /**
     * Returns NIL iff LITTLE-STRING is a case-sensitive substring of BIG-STRING starting at OFFSET.
     */
    @LispMethod(comment = "Returns NIL iff LITTLE-STRING is a case-sensitive substring of BIG-STRING starting at OFFSET.")
    public static SubLObject string_has_offset_negP(final SubLObject big_string, final SubLObject little_string, final SubLObject offset) {
        return makeBoolean(NIL == string_has_offsetP(big_string, little_string, offset));
    }

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("startOffset"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("startOffset"), makeKeyword("STRING"), makeKeyword("STRING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*START-OFFSET-UNIFY-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("startOffset"), list($BIND, makeSymbol("BIG-STRING")), list($BIND, makeSymbol("LITTLE-STRING")), list($BIND, makeSymbol("OFFSET"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), list(makeKeyword("VALUE"), makeSymbol("OFFSET")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("START-OFFSET-OF-STRING-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("startOffset"), list(makeKeyword("VALUE"), makeSymbol("BIG-STRING")), list(makeKeyword("VALUE"), makeSymbol("LITTLE-STRING")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$startOffset <string> <string> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$startOffset \"food\" \"foo\" ?N)") });

    public static final SubLObject start_offset_of_string_iterator_alt(SubLObject big_string, SubLObject little_string) {
        return string_utilities.search_all(little_string, big_string, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject start_offset_of_string_iterator(final SubLObject big_string, final SubLObject little_string) {
        return string_utilities.search_all(little_string, big_string, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject declare_removal_modules_start_offset_file() {
        declareFunction("string_has_offsetP", "STRING-HAS-OFFSET?", 3, 0, false);
        declareFunction("string_has_offset_negP", "STRING-HAS-OFFSET-NEG?", 3, 0, false);
        declareFunction("start_offset_of_string_iterator", "START-OFFSET-OF-STRING-ITERATOR", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_removal_modules_start_offset_file_alt() {
        deflexical("*START-OFFSET-CHECK-COST*", NIL != boundp($start_offset_check_cost$) ? ((SubLObject) ($start_offset_check_cost$.getGlobalValue())) : ONE_INTEGER);
        deflexical("*START-OFFSET-UNIFY-COST*", NIL != boundp($start_offset_unify_cost$) ? ((SubLObject) ($start_offset_unify_cost$.getGlobalValue())) : ONE_INTEGER);
        return NIL;
    }

    public static SubLObject init_removal_modules_start_offset_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*START-OFFSET-CHECK-COST*", SubLTrampolineFile.maybeDefault($start_offset_check_cost$, $start_offset_check_cost$, ONE_INTEGER));
            deflexical("*START-OFFSET-UNIFY-COST*", SubLTrampolineFile.maybeDefault($start_offset_unify_cost$, $start_offset_unify_cost$, ONE_INTEGER));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*START-OFFSET-CHECK-COST*", NIL != boundp($start_offset_check_cost$) ? ((SubLObject) ($start_offset_check_cost$.getGlobalValue())) : ONE_INTEGER);
            deflexical("*START-OFFSET-UNIFY-COST*", NIL != boundp($start_offset_unify_cost$) ? ((SubLObject) ($start_offset_unify_cost$.getGlobalValue())) : ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject init_removal_modules_start_offset_file_Previous() {
        deflexical("*START-OFFSET-CHECK-COST*", SubLTrampolineFile.maybeDefault($start_offset_check_cost$, $start_offset_check_cost$, ONE_INTEGER));
        deflexical("*START-OFFSET-UNIFY-COST*", SubLTrampolineFile.maybeDefault($start_offset_unify_cost$, $start_offset_unify_cost$, ONE_INTEGER));
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

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("startOffset"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), listS(reader_make_constant_shell("startOffset"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("startOffset"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("Delay module that ensures that \n    (#$startOffset . ARGS)\n    is not worked on if one of first two arguments is not fully bound."), makeKeyword("EXAMPLE"), makeString("(#$startOffset ?X ?Y 10)") });

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
    }
}

/**
 * Total time: 91 ms
 */
