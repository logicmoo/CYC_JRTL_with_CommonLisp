/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      COREFERENCE-RESOLVER
 * source file: /cyc/top/cycl/coreference-resolver.lisp
 * created:     2019/07/03 17:38:53
 */
public final class coreference_resolver extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new coreference_resolver();



    static private final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("PARSE-TREES")), makeKeyword("PUBLIC")));

    // Definitions
    public static final SubLObject coreference_resolver_p_alt(SubLObject v_coreference_resolver) {
        return interfaces.subloop_instanceof_interface(v_coreference_resolver, COREFERENCE_RESOLVER);
    }

    // Definitions
    public static SubLObject coreference_resolver_p(final SubLObject v_coreference_resolver) {
        return interfaces.subloop_instanceof_interface(v_coreference_resolver, COREFERENCE_RESOLVER);
    }

    public static SubLObject declare_coreference_resolver_file() {
        declareFunction("coreference_resolver_p", "COREFERENCE-RESOLVER-P", 1, 0, false);
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

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("PARSE-TREES")), makeKeyword("PUBLIC")));

    @Override
    public void runTopLevelForms() {
        setup_coreference_resolver_file();
    }

    static {
    }
}

/**
 * Total time: 65 ms
 */
