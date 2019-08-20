package com.cyc.cycjava.cycl.inference.modules;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class preference_module_declarations extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "1230d3a84dde5f6b3fcfc688beaf0bccbc1563481458e2b3afdc6f1c259a6999";
    private static SubLSymbol $ABNORMAL_DELAY_POS;
    private static SubLList $list1;
    private static SubLSymbol $INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND;
    private static SubLList $list3;
    private static SubLSymbol $REQUIRE_ARG1_FULLY_BOUND_GENERAL;
    private static SubLList $list5;

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

    @Override
    public void initializeVariables() {
        init_preference_module_declarations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_preference_module_declarations_file();
    }

    static {
        me = new preference_module_declarations();
        $ABNORMAL_DELAY_POS = makeKeyword("ABNORMAL-DELAY-POS");
        $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("abnormal")), makeKeyword("REQUIRED-PATTERN"), cons(makeConstSym(("abnormal")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
        $INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND = makeKeyword("INCREASE-OR-DECREASE-IN-VALUE-RETURNED-BY-NOT-FULLY-BOUND");
        $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(makeConstSym(("decreaseInValueReturnedBy")), makeConstSym(("increaseInValueReturnedBy"))), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"))),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REQUIRE_ARG1_FULLY_BOUND_GENERAL = makeKeyword("REQUIRE-ARG1-FULLY-BOUND-GENERAL");
        $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ANY-PREDICATES"), list(makeConstSym(("candidateTriggerSituationTypes"))), makeKeyword("REQUIRED-PATTERN"), listS(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
    }
}
/*
 *
 * Total time: 65 ms
 *
 */