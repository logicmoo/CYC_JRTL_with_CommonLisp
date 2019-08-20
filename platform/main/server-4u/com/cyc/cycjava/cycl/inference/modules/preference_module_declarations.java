/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;

import com.cyc.cycjava.cycl.V12;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PREFERENCE-MODULE-DECLARATIONS
 * source file: /cyc/top/cycl/inference/modules/preference-module-declarations.lisp
 * created:     2019/07/03 17:37:38
 */
public final class preference_module_declarations extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new preference_module_declarations();


    // Internal Constants
    private static final SubLSymbol $ABNORMAL_DELAY_POS = makeKeyword("ABNORMAL-DELAY-POS");

    static private final SubLList $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("abnormal"), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell("abnormal"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND = makeKeyword("INCREASE-OR-DECREASE-IN-VALUE-RETURNED-BY-NOT-FULLY-BOUND");

    static private final SubLList $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell("decreaseInValueReturnedBy"), reader_make_constant_shell("increaseInValueReturnedBy")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    static private final SubLList $list_alt1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("abnormal"), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell("abnormal"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $REQUIRE_ARG1_FULLY_BOUND_GENERAL = makeKeyword("REQUIRE-ARG1-FULLY-BOUND-GENERAL");

    static private final SubLList $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell("candidateTriggerSituationTypes")), makeKeyword("REQUIRED-PATTERN"), listS(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell("decreaseInValueReturnedBy"), reader_make_constant_shell("increaseInValueReturnedBy")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    public static SubLObject declare_preference_module_declarations_file() {
        return NIL;
    }

    public static SubLObject init_preference_module_declarations_file() {
        return NIL;
    }

    public static SubLObject setup_preference_module_declarations_file() {
        preference_modules.inference_preference_module($ABNORMAL_DELAY_POS, $list1);
        preference_modules.inference_preference_module($INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND, $list3);
        preference_modules.inference_preference_module($REQUIRE_ARG1_FULLY_BOUND_GENERAL, $list5);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_preference_module_declarations_file();
    }

    static private final SubLList $list_alt5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(reader_make_constant_shell("candidateTriggerSituationTypes")), makeKeyword("REQUIRED-PATTERN"), listS(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    @Override
    public void initializeVariables() {
        init_preference_module_declarations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_preference_module_declarations_file();
    }

    static {
    }
}

/**
 * Total time: 65 ms
 */
