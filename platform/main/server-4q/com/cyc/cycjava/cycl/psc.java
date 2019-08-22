package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class psc extends SubLTranslatedFile {
    public static final SubLFile me = new psc();

    public static final String myName = "com.cyc.cycjava.cycl.psc";

    public static final String myFingerPrint = "ef5ad1fc4c5aedc9bb00e7911555eb532a0ab27fde14c4516434571388593a77";

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLSymbol ALL_MTS_INFERENCE = makeSymbol("ALL-MTS-INFERENCE");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLSymbol PSC_INFERENCE = makeSymbol("PSC-INFERENCE");

    public static final SubLSymbol NORMAL_INFERENCE = makeSymbol("NORMAL-INFERENCE");

    public static final SubLSymbol MT_UNION_INFERENCE = makeSymbol("MT-UNION-INFERENCE");

    public static final SubLSymbol ANYTIME_PSC_INFERENCE = makeSymbol("ANYTIME-PSC-INFERENCE");

    private static final SubLObject $$ProblemSolvingCntxt = reader_make_constant_shell(makeString("ProblemSolvingCntxt"));

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

    public static SubLObject pscP(final SubLObject constant) {
        return isa.isaP(constant, $$ProblemSolvingCntxt, mt_vars.$psc_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject declare_psc_file() {
        declareFunction(me, "mt_inference_function", "MT-INFERENCE-FUNCTION", 1, 0, false);
        declareFunction(me, "pscP", "PSC?", 1, 0, false);
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

    
}

/**
 * Total time: 36 ms
 */
