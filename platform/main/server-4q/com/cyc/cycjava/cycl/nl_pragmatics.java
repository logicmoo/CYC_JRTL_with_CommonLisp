package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.nl_pragmatics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.nl_pragmatics.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class nl_pragmatics extends SubLTranslatedFile {
    public static final SubLFile me = new nl_pragmatics();

    public static final String myName = "com.cyc.cycjava.cycl.nl_pragmatics";

    public static final String myFingerPrint = "a8d9592b1931bd70e655b6add907ce0c26f7c46334fcaecbca45ae2d78f2de74";

    private static final SubLObject $$SlangSpeech = reader_make_constant_shell(makeString("SlangSpeech"));

    private static final SubLObject $$ArchaicSpeech = reader_make_constant_shell(makeString("ArchaicSpeech"));

    public static SubLObject pragmatically_acceptableP(final SubLObject pragmatic_attribute) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != lexicon_vars.lexicon_filter_activeP(lexicon_vars.$exclude_vulgaritiesP$.getDynamicValue(thread))) && (NIL != lexicon_accessors.potentially_offensive_politeness_levelP(pragmatic_attribute))) {
            return NIL;
        }
        if ((NIL != lexicon_vars.lexicon_filter_activeP(lexicon_vars.$exclude_slangP$.getDynamicValue(thread))) && $$SlangSpeech.eql(pragmatic_attribute)) {
            return NIL;
        }
        if ((NIL != lexicon_vars.lexicon_filter_activeP(lexicon_vars.$exclude_archaic_speechP$.getDynamicValue(thread))) && $$ArchaicSpeech.eql(pragmatic_attribute)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject declare_nl_pragmatics_file() {
        declareFunction(me, "pragmatically_acceptableP", "PRAGMATICALLY-ACCEPTABLE?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_nl_pragmatics_file() {
        return NIL;
    }

    public static SubLObject setup_nl_pragmatics_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nl_pragmatics_file();
    }

    @Override
    public void initializeVariables() {
        init_nl_pragmatics_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nl_pragmatics_file();
    }

    static {



    }
}

/**
 * Total time: 61 ms
 */
