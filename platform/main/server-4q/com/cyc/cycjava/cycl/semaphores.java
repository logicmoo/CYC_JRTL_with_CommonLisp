/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SEMAPHORES
 * source file: /cyc/top/cycl/semaphores.lisp
 * created:     2019/07/03 17:37:13
 */
public final class semaphores extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new semaphores();



    static private final SubLList $list1 = list(makeSymbol("SEMAPHORE-WAIT"));

    private static final SubLSymbol V_SEMAPHORE = makeSymbol("V-SEMAPHORE");

    static private final SubLList $list3 = list(makeSymbol("SEMAPHORE-SIGNAL"));

    private static final SubLSymbol SEMAPHORE_DRAIN_UNIT_TEST = makeSymbol("SEMAPHORE-DRAIN-UNIT-TEST");

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

    // Definitions
    /**
     * A synonym for @xref SEMAPHORE-WAIT
     */
    @LispMethod(comment = "A synonym for @xref SEMAPHORE-WAIT")
    public static final SubLObject p_semaphore_alt(SubLObject semaphore) {
        return Semaphores.semaphore_wait(semaphore);
    }

    // Definitions
    /**
     * A synonym for @xref SEMAPHORE-WAIT
     */
    @LispMethod(comment = "A synonym for @xref SEMAPHORE-WAIT")
    public static SubLObject p_semaphore(final SubLObject semaphore) {
        return Semaphores.semaphore_wait(semaphore);
    }

    /**
     * A synonym for @xref SEMAPHORE-SIGNAL
     */
    @LispMethod(comment = "A synonym for @xref SEMAPHORE-SIGNAL")
    public static final SubLObject v_semaphore_alt(SubLObject semaphore) {
        return Semaphores.semaphore_signal(semaphore);
    }

    /**
     * A synonym for @xref SEMAPHORE-SIGNAL
     */
    @LispMethod(comment = "A synonym for @xref SEMAPHORE-SIGNAL")
    public static SubLObject v_semaphore(final SubLObject semaphore) {
        return Semaphores.semaphore_signal(semaphore);
    }

    public static final SubLObject semaphore_drain_unit_test_alt(SubLObject semaphore_name) {
        {
            SubLObject test_semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
            SubLObject result = NIL;
            if (ZERO_INTEGER != Semaphores.semaphore_current_count(test_semaphore)) {
                return $FAILURE;
            }
            result = Semaphores.semaphore_drain(test_semaphore);
            if (ZERO_INTEGER != result) {
                return $FAILURE;
            }
            if (ZERO_INTEGER != Semaphores.semaphore_current_count(test_semaphore)) {
                return $FAILURE;
            }
            Semaphores.semaphore_signal(test_semaphore);
            result = Semaphores.semaphore_drain(test_semaphore);
            if (ONE_INTEGER != result) {
                return $FAILURE;
            }
            if (ZERO_INTEGER != Semaphores.semaphore_current_count(test_semaphore)) {
                return $FAILURE;
            }
            Semaphores.semaphore_signal(test_semaphore);
            Semaphores.semaphore_signal(test_semaphore);
            result = Semaphores.semaphore_drain(test_semaphore);
            if (TWO_INTEGER != result) {
                return $FAILURE;
            }
            if (ZERO_INTEGER != Semaphores.semaphore_current_count(test_semaphore)) {
                return $FAILURE;
            }
        }
        return $SUCCESS;
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

    public static final SubLObject semaphore_wait_with_timeout_unit_test_alt(SubLObject semaphore_name) {
        {
            SubLObject test_semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
            SubLObject test_time = MINUS_ONE_INTEGER;
            {
                SubLObject time_var = get_internal_real_time();
                Semaphores.semaphore_wait_with_timeout(test_semaphore, TWO_INTEGER);
                test_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            }
            if (test_time.numL($float$1_9) || test_time.numG($float$3_0)) {
                return $FAILURE;
            }
            Semaphores.semaphore_signal(test_semaphore);
            {
                SubLObject time_var = get_internal_real_time();
                Semaphores.semaphore_wait_with_timeout(test_semaphore, TWO_INTEGER);
                test_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            }
            if (test_time.numG($float$0_5)) {
                return $FAILURE;
            }
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

    public static final SubLObject semaphore_unit_test_interrupt_safe_alt(SubLObject process_name) {
        {
            SubLObject semaphore_name = cconcatenate($str_alt23$Semaphore_for_, process_name);
            SubLObject semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
            SubLObject assistant = subl_promotions.make_process_with_args(process_name, SEMAPHORE_UNIT_TEST_INTERRUPT_ASSISTANT, list(semaphore));
            sleep(TWO_INTEGER);
            kill_process(assistant);
            while (NIL != valid_process_p(assistant)) {
                sleep(ONE_INTEGER);
            } 
            return Semaphores.semaphore_current_count(semaphore).isZero() ? ((SubLObject) ($SUCCESS)) : $FAILURE;
        }
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

    /**
     * Wait to be killed on the semaphore.
     */
    @LispMethod(comment = "Wait to be killed on the semaphore.")
    public static final SubLObject semaphore_unit_test_interrupt_assistant_alt(SubLObject semaphore) {
        Semaphores.semaphore_wait(semaphore);
        return $FAILURE;
    }

    /**
     * Wait to be killed on the semaphore.
     */
    @LispMethod(comment = "Wait to be killed on the semaphore.")
    public static SubLObject semaphore_unit_test_interrupt_assistant(final SubLObject semaphore) {
        Semaphores.semaphore_wait(semaphore);
        return $FAILURE;
    }

    public static SubLObject declare_semaphores_file() {
        declareFunction("p_semaphore", "P-SEMAPHORE", 1, 0, false);
        declareFunction("v_semaphore", "V-SEMAPHORE", 1, 0, false);
        declareFunction("semaphore_drain_unit_test", "SEMAPHORE-DRAIN-UNIT-TEST", 1, 0, false);
        declareFunction("semaphore_wait_with_timeout_unit_test", "SEMAPHORE-WAIT-WITH-TIMEOUT-UNIT-TEST", 1, 0, false);
        declareFunction("semaphore_unit_test_interrupt_safe", "SEMAPHORE-UNIT-TEST-INTERRUPT-SAFE", 1, 0, false);
        declareFunction("semaphore_unit_test_interrupt_assistant", "SEMAPHORE-UNIT-TEST-INTERRUPT-ASSISTANT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_semaphores_file() {
        return NIL;
    }

    public static final SubLObject setup_semaphores_file_alt() {
        define_obsolete_register(P_SEMAPHORE, $list_alt1);
        define_obsolete_register(V_SEMAPHORE, $list_alt3);
        define_test_case_table_int(SEMAPHORE_DRAIN_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$tbrussea, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt12);
        define_test_case_table_int(SEMAPHORE_WAIT_WITH_TIMEOUT_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$tbrussea, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt16);
        define_test_case_table_int(SEMAPHORE_UNIT_TEST_INTERRUPT_SAFE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt22);
        return NIL;
    }

    public static SubLObject setup_semaphores_file() {
        if (SubLFiles.USE_V1) {
            define_obsolete_register(P_SEMAPHORE, $list1);
            define_obsolete_register(V_SEMAPHORE, $list3);
            define_test_case_table_int(SEMAPHORE_DRAIN_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list11);
            define_test_case_table_int(SEMAPHORE_WAIT_WITH_TIMEOUT_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list15);
            define_test_case_table_int(SEMAPHORE_UNIT_TEST_INTERRUPT_SAFE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list20);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(SEMAPHORE_DRAIN_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$tbrussea, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt12);
            define_test_case_table_int(SEMAPHORE_WAIT_WITH_TIMEOUT_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$tbrussea, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt16);
            define_test_case_table_int(SEMAPHORE_UNIT_TEST_INTERRUPT_SAFE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt22);
        }
        return NIL;
    }

    public static SubLObject setup_semaphores_file_Previous() {
        define_obsolete_register(P_SEMAPHORE, $list1);
        define_obsolete_register(V_SEMAPHORE, $list3);
        define_test_case_table_int(SEMAPHORE_DRAIN_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list11);
        define_test_case_table_int(SEMAPHORE_WAIT_WITH_TIMEOUT_UNIT_TEST, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list15);
        define_test_case_table_int(SEMAPHORE_UNIT_TEST_INTERRUPT_SAFE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list20);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("SEMAPHORE-WAIT"));

    static private final SubLList $list_alt3 = list(makeSymbol("SEMAPHORE-SIGNAL"));

    static private final SubLString $$$tbrussea = makeString("tbrussea");

    static private final SubLList $list_alt12 = list(list(list(makeString("Test Semaphore 1")), makeKeyword("SUCCESS")));

    @Override
    public void declareFunctions() {
        declare_semaphores_file();
    }

    @Override
    public void initializeVariables() {
        init_semaphores_file();
    }

    static private final SubLList $list_alt16 = list(list(list(makeString("Test Semaphore 2")), makeKeyword("SUCCESS")));

    @Override
    public void runTopLevelForms() {
        setup_semaphores_file();
    }

    static {
    }

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt22 = list(list(list(makeString("Semaphore Waiting Process")), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt23$Semaphore_for_ = makeString("Semaphore for ");
}

/**
 * Total time: 94 ms
 */
