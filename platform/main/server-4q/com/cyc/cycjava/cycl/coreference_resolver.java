package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class coreference_resolver extends SubLTranslatedFile {
    public static final SubLFile me = new coreference_resolver();

    public static final String myName = "com.cyc.cycjava.cycl.coreference_resolver";

    public static final String myFingerPrint = "b2c20504bf9ce1e77c6ebcf25058faa554baf58154cfe4e8caa2d2d925847eea";



    public static final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("PARSE-TREES")), makeKeyword("PUBLIC")));

    public static SubLObject coreference_resolver_p(final SubLObject v_coreference_resolver) {
        return interfaces.subloop_instanceof_interface(v_coreference_resolver, COREFERENCE_RESOLVER);
    }

    public static SubLObject declare_coreference_resolver_file() {
        declareFunction(me, "coreference_resolver_p", "COREFERENCE-RESOLVER-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_coreference_resolver_file() {
        return NIL;
    }

    public static SubLObject setup_coreference_resolver_file() {
        interfaces.new_interface(COREFERENCE_RESOLVER, NIL, NIL, $list1);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_coreference_resolver_file();
    }

    @Override
    public void initializeVariables() {
        init_coreference_resolver_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_coreference_resolver_file();
    }

    
}

/**
 * Total time: 65 ms
 */
