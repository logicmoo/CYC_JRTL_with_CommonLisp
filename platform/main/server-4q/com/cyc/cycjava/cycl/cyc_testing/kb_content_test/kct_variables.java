/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KCT-VARIABLES
 * source file: /cyc/top/cycl/cyc-testing/kb-content-test/kct-variables.lisp
 * created:     2019/07/03 17:37:56
 */
public final class kct_variables extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new kct_variables();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_variables";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $kct_mt$ = makeSymbol("*KCT-MT*");





    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell("Null-TimeParameter");

    /**
     * Return the microtheory to use for retrieving and storing KB content
     * test definitions.
     */
    @LispMethod(comment = "Return the microtheory to use for retrieving and storing KB content\r\ntest definitions.\nReturn the microtheory to use for retrieving and storing KB content\ntest definitions.")
    public static final SubLObject kct_mt_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $kct_mt$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Return the microtheory to use for retrieving and storing KB content\r\ntest definitions.\nReturn the microtheory to use for retrieving and storing KB content\ntest definitions.")
    public static SubLObject kct_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kct_mt$.getDynamicValue(thread);
    }

    public static final SubLObject set_kct_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(mt, MICROTHEORY_P);
            $kct_mt$.setDynamicValue(mt, thread);
            return $kct_mt$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_kct_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != fort_types_interface.microtheory_p(mt) : "! fort_types_interface.microtheory_p(mt) " + ("fort_types_interface.microtheory_p(mt) " + "CommonSymbols.NIL != fort_types_interface.microtheory_p(mt) ") + mt;
        $kct_mt$.setDynamicValue(mt, thread);
        return $kct_mt$.getDynamicValue(thread);
    }

    /**
     * Returns a hlmt based on (KCT-MT) for what's true #$Now and with $Null-TimeParameter.
     */
    @LispMethod(comment = "Returns a hlmt based on (KCT-MT) for what\'s true #$Now and with $Null-TimeParameter.")
    public static final SubLObject kct_mt_for_now_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_variables.kct_mt();
        }
        return kct_utils.kct_new_hlmt(mt, $$Now, $$Null_TimeParameter);
    }

    /**
     * Returns a hlmt based on (KCT-MT) for what's true #$Now and with $Null-TimeParameter.
     */
    @LispMethod(comment = "Returns a hlmt based on (KCT-MT) for what\'s true #$Now and with $Null-TimeParameter.")
    public static SubLObject kct_mt_for_now(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_mt();
        }
        return kct_utils.kct_new_hlmt(mt, $$Now, $$Null_TimeParameter);
    }

    public static SubLObject declare_kct_variables_file() {
        declareFunction("kct_mt", "KCT-MT", 0, 0, false);
        declareFunction("set_kct_mt", "SET-KCT-MT", 1, 0, false);
        declareFunction("kct_mt_for_now", "KCT-MT-FOR-NOW", 0, 1, false);
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
