package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;


import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_variables;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_variables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kct_variables extends SubLTranslatedFile {
    public static final SubLFile me = new kct_variables();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_variables";

    public static final String myFingerPrint = "76d31cd7a46a1f57c0b901290b2bbf5e11af4e75c19e28a1ba182e87c16eb155";

    // defparameter
    // Definitions
    private static final SubLSymbol $kct_mt$ = makeSymbol("*KCT-MT*");

    private static final SubLObject $$TestVocabularyMt = reader_make_constant_shell(makeString("TestVocabularyMt"));



    private static final SubLObject $$Now = reader_make_constant_shell(makeString("Now"));

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell(makeString("Null-TimeParameter"));

    public static SubLObject kct_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kct_mt$.getDynamicValue(thread);
    }

    public static SubLObject set_kct_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != fort_types_interface.microtheory_p(mt) : "fort_types_interface.microtheory_p(mt) " + "CommonSymbols.NIL != fort_types_interface.microtheory_p(mt) " + mt;
        $kct_mt$.setDynamicValue(mt, thread);
        return $kct_mt$.getDynamicValue(thread);
    }

    public static SubLObject kct_mt_for_now(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_mt();
        }
        return kct_utils.kct_new_hlmt(mt, $$Now, $$Null_TimeParameter);
    }

    public static SubLObject declare_kct_variables_file() {
        declareFunction(me, "kct_mt", "KCT-MT", 0, 0, false);
        declareFunction(me, "set_kct_mt", "SET-KCT-MT", 1, 0, false);
        declareFunction(me, "kct_mt_for_now", "KCT-MT-FOR-NOW", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_kct_variables_file() {
        defparameter("*KCT-MT*", $$TestVocabularyMt);
        return NIL;
    }

    public static SubLObject setup_kct_variables_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kct_variables_file();
    }

    @Override
    public void initializeVariables() {
        init_kct_variables_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kct_variables_file();
    }

    static {






    }
}

/**
 * Total time: 76 ms
 */
