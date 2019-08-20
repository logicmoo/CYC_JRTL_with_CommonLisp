/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.V02;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-STANDARD-BB-SUBSETS
 *  source file: /cyc/top/cycl/cyblack/cyblack-standard-bb-subsets.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_standard_bb_subsets extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_standard_bb_subsets() {
    }

    public static final SubLFile me = new cyblack_standard_bb_subsets();


    // // Definitions
    public static final SubLObject declare_cyblack_standard_bb_subsets_file() {
        return NIL;
    }

    public static final SubLObject init_cyblack_standard_bb_subsets_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_standard_bb_subsets_file() {
                cyblack_defbbsubset.construct_and_register_blackboard_subset(CYBLACK_SYSTEM_BLACKBOARD_SUBSET, NIL, $list_alt1);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_SYSTEM_BLACKBOARD_SUBSET = makeSymbol("CYBLACK-SYSTEM-BLACKBOARD-SUBSET");

    static private final SubLList $list_alt1 = list(list(makeKeyword("TYPE-GRAPH"), list(makeKeyword("ROOT-TYPE"), makeString("SYSTEM")), list(makeKeyword("SUBTYPE"), makeString("INTERNAL-ACTIVITY"), makeString("SYSTEM")), list(makeKeyword("SUBTYPE"), makeString("INTERNAL-QUIESCENCE"), makeString("INTERNAL-ACTIVITY"))), list(makeKeyword("TYPE-TO-POSTING-CLASS-MAP"), list(makeKeyword("POSTING-CLASS"), makeString("SYSTEM"), makeSymbol("CYBLACK-BASIC-INTERNAL-STATE-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("INTERNAL-ACTIVITY"), makeSymbol("CYBLACK-INTERNAL-ACTIVITY-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("INTERNAL-QUIESCENCE"), makeSymbol("CYBLACK-INTERNAL-QUIESCENCE-POSTING"))), list(makeKeyword("TYPE-TO-PANEL-CLASS-MAP"), list(makeKeyword("PANEL-CLASS"), makeString("SYSTEM"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("INTERNAL-ACTIVITY"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("INTERNAL-QUIESCENCE"), makeSymbol("CYBLACK-SINGLETON-PANEL"))));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_standard_bb_subsets_file();
    }

    public void initializeVariables() {
        init_cyblack_standard_bb_subsets_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_standard_bb_subsets_file();
    }
}

