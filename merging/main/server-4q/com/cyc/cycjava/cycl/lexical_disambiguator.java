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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LEXICAL-DISAMBIGUATOR
 * source file: /cyc/top/cycl/lexical-disambiguator.lisp
 * created:     2019/07/03 17:38:53
 */
public final class lexical_disambiguator extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new lexical_disambiguator();

 public static final String myName = "com.cyc.cycjava.cycl.lexical_disambiguator";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol LEXICAL_DISAMBIGUATOR = makeSymbol("LEXICAL-DISAMBIGUATOR");

    static private final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISAMBIGUATE"), list(makeSymbol("PARSE-TREE"), makeSymbol("PARSE-TREE-CONTEXT")), makeKeyword("PUBLIC")));

    // Definitions
    public static final SubLObject lexical_disambiguator_p_alt(SubLObject v_lexical_disambiguator) {
        return interfaces.subloop_instanceof_interface(v_lexical_disambiguator, LEXICAL_DISAMBIGUATOR);
    }

    public static SubLObject lexical_disambiguator_p(final SubLObject v_lexical_disambiguator) {
        return interfaces.subloop_instanceof_interface(v_lexical_disambiguator, LEXICAL_DISAMBIGUATOR);
    }

    public static SubLObject declare_lexical_disambiguator_file() {
        declareFunction("lexical_disambiguator_p", "LEXICAL-DISAMBIGUATOR-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_lexical_disambiguator_file() {
        return NIL;
    }

    public static SubLObject setup_lexical_disambiguator_file() {
        interfaces.new_interface(LEXICAL_DISAMBIGUATOR, NIL, NIL, $list1);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexical_disambiguator_file();
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISAMBIGUATE"), list(makeSymbol("PARSE-TREE"), makeSymbol("PARSE-TREE-CONTEXT")), makeKeyword("PUBLIC")));

    @Override
    public void initializeVariables() {
        init_lexical_disambiguator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexical_disambiguator_file();
    }

    
}

/**
 * Total time: 62 ms
 */
