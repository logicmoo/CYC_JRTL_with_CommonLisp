package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.lexical_disambiguator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.lexical_disambiguator.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class lexical_disambiguator extends SubLTranslatedFile {
    public static final SubLFile me = new lexical_disambiguator();

    public static final String myName = "com.cyc.cycjava.cycl.lexical_disambiguator";

    public static final String myFingerPrint = "77a9e285f2b870f29f26be336acd65dce75291cba1beaa40c9b1b36bb00ae57f";

    // Internal Constants
    public static final SubLSymbol LEXICAL_DISAMBIGUATOR = makeSymbol("LEXICAL-DISAMBIGUATOR");

    public static final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISAMBIGUATE"), list(makeSymbol("PARSE-TREE"), makeSymbol("PARSE-TREE-CONTEXT")), makeKeyword("PUBLIC")));

    public static SubLObject lexical_disambiguator_p(final SubLObject v_lexical_disambiguator) {
        return interfaces.subloop_instanceof_interface(v_lexical_disambiguator, LEXICAL_DISAMBIGUATOR);
    }

    public static SubLObject declare_lexical_disambiguator_file() {
        declareFunction(me, "lexical_disambiguator_p", "LEXICAL-DISAMBIGUATOR-P", 1, 0, false);
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

    @Override
    public void initializeVariables() {
        init_lexical_disambiguator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexical_disambiguator_file();
    }

    static {



    }
}

/**
 * Total time: 62 ms
 */
