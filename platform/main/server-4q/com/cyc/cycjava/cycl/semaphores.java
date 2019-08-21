package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.semaphores.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class semaphores extends SubLTranslatedFile {
    public static final SubLFile me = new semaphores();

    public static final String myName = "com.cyc.cycjava.cycl.semaphores";

    public static final String myFingerPrint = "3bb49851cc00c2f3615e2684458b87c4ce285f95be6c80f567fa643e9673dead";



    public static final SubLList $list1 = list(makeSymbol("SEMAPHORE-WAIT"));

    public static final SubLSymbol V_SEMAPHORE = makeSymbol("V-SEMAPHORE");

    public static final SubLList $list3 = list(makeSymbol("SEMAPHORE-SIGNAL"));

    public static final SubLSymbol SEMAPHORE_DRAIN_UNIT_TEST = makeSymbol("SEMAPHORE-DRAIN-UNIT-TEST");













    private static final SubLList $list11 = list(list(list(makeString("Test Semaphore 1")), makeKeyword("SUCCESS")));





    private static final SubLSymbol SEMAPHORE_WAIT_WITH_TIMEOUT_UNIT_TEST = makeSymbol("SEMAPHORE-WAIT-WITH-TIMEOUT-UNIT-TEST");

    private static final SubLList $list15 = list(list(list(makeString("Test Semaphore 2")), makeKeyword("SUCCESS")));

    private static final SubLFloat $float$1_9 = makeDouble(1.9);

    private static final SubLFloat $float$3_0 = makeDouble(3.0);

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol SEMAPHORE_UNIT_TEST_INTERRUPT_SAFE = makeSymbol("SEMAPHORE-UNIT-TEST-INTERRUPT-SAFE");

    private static final SubLList $list20 = list(list(list(makeString("Semaphore Waiting Process")), makeKeyword("SUCCESS")));

    private static final SubLString $$$Semaphore_for_ = makeString("Semaphore for ");

    private static final SubLSymbol SEMAPHORE_UNIT_TEST_INTERRUPT_ASSISTANT = makeSymbol("SEMAPHORE-UNIT-TEST-INTERRUPT-ASSISTANT");

    public static SubLObject p_semaphore(final SubLObject semaphore) {
        return Semaphores.semaphore_wait(semaphore);
    }

    public static SubLObject v_semaphore(final SubLObject semaphore) {
        return Semaphores.semaphore_signal(semaphore);
    }

    public static SubLObject semaphore_drain_unit_test(final SubLObject semaphore_name) {
        final SubLObject test_semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
        SubLObject result = NIL;
        if (!ZERO_INTEGER.eql(Semaphores.semaphore_current_count(test_semaphore))) {
            return $FAILURE;
        }
        result = Semaphores.semaphore_drain(test_semaphore);
        if (!ZERO_INTEGER.eql(result)) {
            return $FAILURE;
        }
        if (!ZERO_INTEGER.eql(Semaphores.semaphore_current_count(test_semaphore))) {
            return $FAILURE;
        }
        Semaphores.semaphore_signal(test_semaphore);
        result = Semaphores.semaphore_drain(test_semaphore);
        if (!ONE_INTEGER.eql(result)) {
            return $FAILURE;
        }
        if (!ZERO_INTEGER.eql(Semaphores.semaphore_current_count(test_semaphore))) {
            return $FAILURE;
        }
        Semaphores.semaphore_signal(test_semaphore);
        Semaphores.semaphore_signal(test_semaphore);
        result = Semaphores.semaphore_drain(test_semaphore);
        if (!TWO_INTEGER.eql(result)) {
            return $FAILURE;
        }
        if (!ZERO_INTEGER.eql(Semaphores.semaphore_current_count(test_semaphore))) {
            return $FAILURE;
        }
        return $SUCCESS;
    }

    public static SubLObject semaphore_wait_with_timeout_unit_test(final SubLObject semaphore_name) {
        final SubLObject test_semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
        SubLObject test_time = MINUS_ONE_INTEGER;
        SubLObject time_var = get_internal_real_time();
        Semaphores.semaphore_wait_with_timeout(test_semaphore, TWO_INTEGER);
        test_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (test_time.numL($float$1_9) || test_time.numG($float$3_0)) {
            return $FAILURE;
        }
        Semaphores.semaphore_signal(test_semaphore);
        time_var = get_internal_real_time();
        Semaphores.semaphore_wait_with_timeout(test_semaphore, TWO_INTEGER);
        test_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (test_time.numG($float$0_5)) {
            return $FAILURE;
        }
        return $SUCCESS;
    }

    public static SubLObject semaphore_unit_test_interrupt_safe(final SubLObject process_name) {
        final SubLObject semaphore_name = cconcatenate($$$Semaphore_for_, process_name);
        final SubLObject semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
        final SubLObject assistant = subl_promotions.make_process_with_args(process_name, SEMAPHORE_UNIT_TEST_INTERRUPT_ASSISTANT, list(semaphore));
        sleep(TWO_INTEGER);
        kill_process(assistant);
        while (NIL != valid_process_p(assistant)) {
            sleep(ONE_INTEGER);
        } 
        return Semaphores.semaphore_current_count(semaphore).isZero() ? $SUCCESS : $FAILURE;
    }

    public static SubLObject semaphore_unit_test_interrupt_assistant(final SubLObject semaphore) {
        Semaphores.semaphore_wait(semaphore);
        return $FAILURE;
    }

    public static SubLObject declare_semaphores_file() {
        declareFunction(me, "p_semaphore", "P-SEMAPHORE", 1, 0, false);
        declareFunction(me, "v_semaphore", "V-SEMAPHORE", 1, 0, false);
        declareFunction(me, "semaphore_drain_unit_test", "SEMAPHORE-DRAIN-UNIT-TEST", 1, 0, false);
        declareFunction(me, "semaphore_wait_with_timeout_unit_test", "SEMAPHORE-WAIT-WITH-TIMEOUT-UNIT-TEST", 1, 0, false);
        declareFunction(me, "semaphore_unit_test_interrupt_safe", "SEMAPHORE-UNIT-TEST-INTERRUPT-SAFE", 1, 0, false);
        declareFunction(me, "semaphore_unit_test_interrupt_assistant", "SEMAPHORE-UNIT-TEST-INTERRUPT-ASSISTANT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_semaphores_file() {
        return NIL;
    }

    public static SubLObject setup_semaphores_file() {
        define_obsolete_register(P_SEMAPHORE, $list1);
        define_obsolete_register(V_SEMAPHORE, $list3);
        define_test_case_table_int(SEMAPHORE_DRAIN_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list11);
        define_test_case_table_int(SEMAPHORE_WAIT_WITH_TIMEOUT_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list15);
        define_test_case_table_int(SEMAPHORE_UNIT_TEST_INTERRUPT_SAFE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list20);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_semaphores_file();
    }

    @Override
    public void initializeVariables() {
        init_semaphores_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_semaphores_file();
    }

    static {
























    }
}

/**
 * Total time: 94 ms
 */
