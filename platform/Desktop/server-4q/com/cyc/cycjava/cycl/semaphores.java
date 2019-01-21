package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class semaphores extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.semaphores";
    public static final String myFingerPrint = "3bb49851cc00c2f3615e2684458b87c4ce285f95be6c80f567fa643e9673dead";
    private static final SubLSymbol $sym0$P_SEMAPHORE;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$V_SEMAPHORE;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$SEMAPHORE_DRAIN_UNIT_TEST;
    private static final SubLSymbol $kw5$TEST;
    private static final SubLSymbol $kw6$OWNER;
    private static final SubLSymbol $kw7$CLASSES;
    private static final SubLSymbol $kw8$KB;
    private static final SubLSymbol $kw9$TINY;
    private static final SubLSymbol $kw10$WORKING_;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$FAILURE;
    private static final SubLSymbol $kw13$SUCCESS;
    private static final SubLSymbol $sym14$SEMAPHORE_WAIT_WITH_TIMEOUT_UNIT_TEST;
    private static final SubLList $list15;
    private static final SubLFloat $float16$1_9;
    private static final SubLFloat $float17$3_0;
    private static final SubLFloat $float18$0_5;
    private static final SubLSymbol $sym19$SEMAPHORE_UNIT_TEST_INTERRUPT_SAFE;
    private static final SubLList $list20;
    private static final SubLString $str21$Semaphore_for_;
    private static final SubLSymbol $sym22$SEMAPHORE_UNIT_TEST_INTERRUPT_ASSISTANT;
    
    @SubLTranslatedFile.SubL(source = "cycl/semaphores.lisp", position = 835L)
    public static SubLObject p_semaphore(final SubLObject semaphore) {
        return Semaphores.semaphore_wait(semaphore);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semaphores.lisp", position = 8437L)
    public static SubLObject v_semaphore(final SubLObject semaphore) {
        return Semaphores.semaphore_signal(semaphore);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semaphores.lisp", position = 9934L)
    public static SubLObject semaphore_drain_unit_test(final SubLObject semaphore_name) {
        final SubLObject test_semaphore = Semaphores.new_semaphore(semaphore_name, (SubLObject)semaphores.ZERO_INTEGER);
        SubLObject result = (SubLObject)semaphores.NIL;
        if (!semaphores.ZERO_INTEGER.eql(Semaphores.semaphore_current_count(test_semaphore))) {
            return (SubLObject)semaphores.$kw12$FAILURE;
        }
        result = Semaphores.semaphore_drain(test_semaphore);
        if (!semaphores.ZERO_INTEGER.eql(result)) {
            return (SubLObject)semaphores.$kw12$FAILURE;
        }
        if (!semaphores.ZERO_INTEGER.eql(Semaphores.semaphore_current_count(test_semaphore))) {
            return (SubLObject)semaphores.$kw12$FAILURE;
        }
        Semaphores.semaphore_signal(test_semaphore);
        result = Semaphores.semaphore_drain(test_semaphore);
        if (!semaphores.ONE_INTEGER.eql(result)) {
            return (SubLObject)semaphores.$kw12$FAILURE;
        }
        if (!semaphores.ZERO_INTEGER.eql(Semaphores.semaphore_current_count(test_semaphore))) {
            return (SubLObject)semaphores.$kw12$FAILURE;
        }
        Semaphores.semaphore_signal(test_semaphore);
        Semaphores.semaphore_signal(test_semaphore);
        result = Semaphores.semaphore_drain(test_semaphore);
        if (!semaphores.TWO_INTEGER.eql(result)) {
            return (SubLObject)semaphores.$kw12$FAILURE;
        }
        if (!semaphores.ZERO_INTEGER.eql(Semaphores.semaphore_current_count(test_semaphore))) {
            return (SubLObject)semaphores.$kw12$FAILURE;
        }
        return (SubLObject)semaphores.$kw13$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semaphores.lisp", position = 11158L)
    public static SubLObject semaphore_wait_with_timeout_unit_test(final SubLObject semaphore_name) {
        final SubLObject test_semaphore = Semaphores.new_semaphore(semaphore_name, (SubLObject)semaphores.ZERO_INTEGER);
        SubLObject test_time = (SubLObject)semaphores.MINUS_ONE_INTEGER;
        SubLObject time_var = Time.get_internal_real_time();
        Semaphores.semaphore_wait_with_timeout(test_semaphore, (SubLObject)semaphores.TWO_INTEGER);
        test_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (test_time.numL((SubLObject)semaphores.$float16$1_9) || test_time.numG((SubLObject)semaphores.$float17$3_0)) {
            return (SubLObject)semaphores.$kw12$FAILURE;
        }
        Semaphores.semaphore_signal(test_semaphore);
        time_var = Time.get_internal_real_time();
        Semaphores.semaphore_wait_with_timeout(test_semaphore, (SubLObject)semaphores.TWO_INTEGER);
        test_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (test_time.numG((SubLObject)semaphores.$float18$0_5)) {
            return (SubLObject)semaphores.$kw12$FAILURE;
        }
        return (SubLObject)semaphores.$kw13$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semaphores.lisp", position = 11829L)
    public static SubLObject semaphore_unit_test_interrupt_safe(final SubLObject process_name) {
        final SubLObject semaphore_name = Sequences.cconcatenate((SubLObject)semaphores.$str21$Semaphore_for_, process_name);
        final SubLObject semaphore = Semaphores.new_semaphore(semaphore_name, (SubLObject)semaphores.ZERO_INTEGER);
        final SubLObject assistant = subl_promotions.make_process_with_args(process_name, (SubLObject)semaphores.$sym22$SEMAPHORE_UNIT_TEST_INTERRUPT_ASSISTANT, (SubLObject)ConsesLow.list(semaphore));
        Threads.sleep((SubLObject)semaphores.TWO_INTEGER);
        Threads.kill_process(assistant);
        while (semaphores.NIL != Threads.valid_process_p(assistant)) {
            Threads.sleep((SubLObject)semaphores.ONE_INTEGER);
        }
        return (SubLObject)(Semaphores.semaphore_current_count(semaphore).isZero() ? semaphores.$kw13$SUCCESS : semaphores.$kw12$FAILURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/semaphores.lisp", position = 12575L)
    public static SubLObject semaphore_unit_test_interrupt_assistant(final SubLObject semaphore) {
        Semaphores.semaphore_wait(semaphore);
        return (SubLObject)semaphores.$kw12$FAILURE;
    }
    
    public static SubLObject declare_semaphores_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semaphores", "p_semaphore", "P-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semaphores", "v_semaphore", "V-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semaphores", "semaphore_drain_unit_test", "SEMAPHORE-DRAIN-UNIT-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semaphores", "semaphore_wait_with_timeout_unit_test", "SEMAPHORE-WAIT-WITH-TIMEOUT-UNIT-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semaphores", "semaphore_unit_test_interrupt_safe", "SEMAPHORE-UNIT-TEST-INTERRUPT-SAFE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.semaphores", "semaphore_unit_test_interrupt_assistant", "SEMAPHORE-UNIT-TEST-INTERRUPT-ASSISTANT", 1, 0, false);
        return (SubLObject)semaphores.NIL;
    }
    
    public static SubLObject init_semaphores_file() {
        return (SubLObject)semaphores.NIL;
    }
    
    public static SubLObject setup_semaphores_file() {
        access_macros.define_obsolete_register((SubLObject)semaphores.$sym0$P_SEMAPHORE, (SubLObject)semaphores.$list1);
        access_macros.define_obsolete_register((SubLObject)semaphores.$sym2$V_SEMAPHORE, (SubLObject)semaphores.$list3);
        generic_testing.define_test_case_table_int((SubLObject)semaphores.$sym4$SEMAPHORE_DRAIN_UNIT_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { semaphores.$kw5$TEST, semaphores.NIL, semaphores.$kw6$OWNER, semaphores.NIL, semaphores.$kw7$CLASSES, semaphores.NIL, semaphores.$kw8$KB, semaphores.$kw9$TINY, semaphores.$kw10$WORKING_, semaphores.T }), (SubLObject)semaphores.$list11);
        generic_testing.define_test_case_table_int((SubLObject)semaphores.$sym14$SEMAPHORE_WAIT_WITH_TIMEOUT_UNIT_TEST, (SubLObject)ConsesLow.list(new SubLObject[] { semaphores.$kw5$TEST, semaphores.NIL, semaphores.$kw6$OWNER, semaphores.NIL, semaphores.$kw7$CLASSES, semaphores.NIL, semaphores.$kw8$KB, semaphores.$kw9$TINY, semaphores.$kw10$WORKING_, semaphores.T }), (SubLObject)semaphores.$list15);
        generic_testing.define_test_case_table_int((SubLObject)semaphores.$sym19$SEMAPHORE_UNIT_TEST_INTERRUPT_SAFE, (SubLObject)ConsesLow.list(new SubLObject[] { semaphores.$kw5$TEST, semaphores.NIL, semaphores.$kw6$OWNER, semaphores.NIL, semaphores.$kw7$CLASSES, semaphores.NIL, semaphores.$kw8$KB, semaphores.$kw9$TINY, semaphores.$kw10$WORKING_, semaphores.T }), (SubLObject)semaphores.$list20);
        return (SubLObject)semaphores.NIL;
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
        me = (SubLFile)new semaphores();
        $sym0$P_SEMAPHORE = SubLObjectFactory.makeSymbol("P-SEMAPHORE");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE-WAIT"));
        $sym2$V_SEMAPHORE = SubLObjectFactory.makeSymbol("V-SEMAPHORE");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE-SIGNAL"));
        $sym4$SEMAPHORE_DRAIN_UNIT_TEST = SubLObjectFactory.makeSymbol("SEMAPHORE-DRAIN-UNIT-TEST");
        $kw5$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw6$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw7$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw8$KB = SubLObjectFactory.makeKeyword("KB");
        $kw9$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw10$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Test Semaphore 1")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $kw12$FAILURE = SubLObjectFactory.makeKeyword("FAILURE");
        $kw13$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $sym14$SEMAPHORE_WAIT_WITH_TIMEOUT_UNIT_TEST = SubLObjectFactory.makeSymbol("SEMAPHORE-WAIT-WITH-TIMEOUT-UNIT-TEST");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Test Semaphore 2")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $float16$1_9 = (SubLFloat)SubLObjectFactory.makeDouble(1.9);
        $float17$3_0 = (SubLFloat)SubLObjectFactory.makeDouble(3.0);
        $float18$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $sym19$SEMAPHORE_UNIT_TEST_INTERRUPT_SAFE = SubLObjectFactory.makeSymbol("SEMAPHORE-UNIT-TEST-INTERRUPT-SAFE");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Semaphore Waiting Process")), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
        $str21$Semaphore_for_ = SubLObjectFactory.makeString("Semaphore for ");
        $sym22$SEMAPHORE_UNIT_TEST_INTERRUPT_ASSISTANT = SubLObjectFactory.makeSymbol("SEMAPHORE-UNIT-TEST-INTERRUPT-ASSISTANT");
    }
}

/*

	Total time: 94 ms
	
*/