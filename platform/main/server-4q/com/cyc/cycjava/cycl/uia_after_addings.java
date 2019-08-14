/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      UIA-AFTER-ADDINGS
 *  source file: /cyc/top/cycl/uia-after-addings.lisp
 *  created:     2019/07/03 17:37:56
 */
public final class uia_after_addings extends SubLTranslatedFile implements V02 {
    // // Constructor
    private uia_after_addings() {
    }

    public static final SubLFile me = new uia_after_addings();

    public static final String myName = "com.cyc.cycjava.cycl.uia_after_addings";

    // // Definitions
    /**
     * Called when adding any #$assertViaUIA GAF.
     */
    public static final SubLObject add_assert_via_uia(SubLObject argument, SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject datum = assertions_high.gaf_args(assertion);
                SubLObject current = datum;
                SubLObject sentence = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt0);
                mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    kb_action_to_uia_trampolines.kb_action_to_uia_assertion_creator(sentence, mt);
                } else {
                    cdestructuring_bind_error(datum, $list_alt0);
                }
            }
        }
        return NIL;
    }

    /**
     * Called when adding any #$refineInUIA GAF.
     */
    public static final SubLObject add_refine_in_uia(SubLObject argument, SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject datum = assertions_high.gaf_args(assertion);
                SubLObject current = datum;
                SubLObject v_term = NIL;
                SubLObject mt = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt2);
                v_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt2);
                mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    kb_action_to_uia_trampolines.kb_action_to_uia_salient_descriptor(v_term, mt);
                } else {
                    cdestructuring_bind_error(datum, $list_alt2);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_uia_after_addings_file() {
        declareFunction("add_assert_via_uia", "ADD-ASSERT-VIA-UIA", 2, 0, false);
        declareFunction("add_refine_in_uia", "ADD-REFINE-IN-UIA", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_uia_after_addings_file() {
        return NIL;
    }

    public static final SubLObject setup_uia_after_addings_file() {
                utilities_macros.register_kb_function(ADD_ASSERT_VIA_UIA);
        utilities_macros.register_kb_function(ADD_REFINE_IN_UIA);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("SENTENCE"), makeSymbol("MT"));

    private static final SubLSymbol ADD_ASSERT_VIA_UIA = makeSymbol("ADD-ASSERT-VIA-UIA");

    static private final SubLList $list_alt2 = list(makeSymbol("TERM"), makeSymbol("MT"));

    private static final SubLSymbol ADD_REFINE_IN_UIA = makeSymbol("ADD-REFINE-IN-UIA");

    // // Initializers
    public void declareFunctions() {
        declare_uia_after_addings_file();
    }

    public void initializeVariables() {
        init_uia_after_addings_file();
    }

    public void runTopLevelForms() {
        setup_uia_after_addings_file();
    }
}

