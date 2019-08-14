/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class psc extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new psc();

 public static final String myName = "com.cyc.cycjava.cycl.psc";




    private static final SubLSymbol ALL_MTS_INFERENCE = makeSymbol("ALL-MTS-INFERENCE");



    private static final SubLSymbol PSC_INFERENCE = makeSymbol("PSC-INFERENCE");

    private static final SubLSymbol NORMAL_INFERENCE = makeSymbol("NORMAL-INFERENCE");

    private static final SubLSymbol MT_UNION_INFERENCE = makeSymbol("MT-UNION-INFERENCE");

    private static final SubLSymbol ANYTIME_PSC_INFERENCE = makeSymbol("ANYTIME-PSC-INFERENCE");



    // Definitions
    public static final SubLObject mt_inference_function_alt(SubLObject mt) {
        if (mt == $$EverythingPSC) {
            return ALL_MTS_INFERENCE;
        } else {
            if (mt == $$InferencePSC) {
                return PSC_INFERENCE;
            } else {
                if (NIL == possibly_naut_p(mt)) {
                    return NORMAL_INFERENCE;
                } else {
                    if (NIL != hlmt.mt_union_naut_p(mt)) {
                        return MT_UNION_INFERENCE;
                    } else {
                        if (NIL != hlmt.hlmt_with_anytime_psc_p(mt)) {
                            return ANYTIME_PSC_INFERENCE;
                        } else {
                            return NORMAL_INFERENCE;
                        }
                    }
                }
            }
        }
    }

    // Definitions
    public static SubLObject mt_inference_function(final SubLObject mt) {
        if (NIL != kb_utilities.kbeq(mt, $$EverythingPSC)) {
            return ALL_MTS_INFERENCE;
        }
        if (NIL != kb_utilities.kbeq(mt, $$InferencePSC)) {
            return PSC_INFERENCE;
        }
        if (NIL == possibly_naut_p(mt)) {
            return NORMAL_INFERENCE;
        }
        if (NIL != hlmt.mt_union_naut_p(mt)) {
            return MT_UNION_INFERENCE;
        }
        if (NIL != hlmt.hlmt_with_anytime_psc_p(mt)) {
            return ANYTIME_PSC_INFERENCE;
        }
        return NORMAL_INFERENCE;
    }

    public static final SubLObject pscP_alt(SubLObject constant) {
        return isa.isaP(constant, $$ProblemSolvingCntxt, mt_vars.$psc_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject pscP(final SubLObject constant) {
        return isa.isaP(constant, $$ProblemSolvingCntxt, mt_vars.$psc_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject declare_psc_file() {
        declareFunction("mt_inference_function", "MT-INFERENCE-FUNCTION", 1, 0, false);
        declareFunction("pscP", "PSC?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_psc_file() {
        return NIL;
    }

    public static SubLObject setup_psc_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_psc_file();
    }

    @Override
    public void initializeVariables() {
        init_psc_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_psc_file();
    }

    static {
    }
}

/**
 * Total time: 36 ms
 */
