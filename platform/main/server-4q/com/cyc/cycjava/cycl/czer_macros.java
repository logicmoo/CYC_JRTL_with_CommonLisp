/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CZER-MACROS
 * source file: /cyc/top/cycl/czer-macros.lisp
 * created:     2019/07/03 17:37:19
 */
public final class czer_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new czer_macros();

 public static final String myName = "com.cyc.cycjava.cycl.czer_macros";


    static private final SubLList $list1 = list(makeSymbol("*CZER-MEMOIZATION-STATE*"));

    static private final SubLList $list3 = list(list(makeSymbol("*CZER-MEMOIZATION-STATE*"), list(makeSymbol("NEW-MEMOIZATION-STATE"), makeString("czer memoization state"))));

    static private final SubLList $list4 = list(list(makeSymbol("*WITHIN-CANONICALIZER?*"), T));

    static private final SubLList $list5 = list(list(makeSymbol("*WITHIN-NEGATION?*"), list(makeSymbol("CNOT"), makeSymbol("*WITHIN-NEGATION?*"))));

    static private final SubLList $list6 = list(list(makeSymbol("*WITHIN-DISJUNCTION?*"), T), list(makeSymbol("*WITHIN-NEGATED-DISJUNCTION?*"), makeSymbol("*WITHIN-NEGATION?*")));

    static private final SubLList $list7 = list(list(makeSymbol("*WITHIN-CONJUNCTION?*"), T), list(makeSymbol("*WITHIN-NEGATED-CONJUNCTION?*"), makeSymbol("*WITHIN-NEGATION?*")));

    static private final SubLList $list8 = list(list(makeSymbol("*WITHIN-ASSERT*"), T));

    static private final SubLList $list9 = list(list(makeSymbol("*WITHIN-ASSERT*"), NIL));

    static private final SubLList $list10 = list(list(makeSymbol("*WITHIN-ASK*"), T));

    static private final SubLList $list11 = list(list(makeSymbol("*WITHIN-QUERY*"), T));

    static private final SubLList $list12 = list(list(makeSymbol("*WITHIN-TOU-GAF?*"), T));

    static private final SubLList $list13 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol VALID_TENSE_CZER_MODE_P = makeSymbol("VALID-TENSE-CZER-MODE-P");

    static private final SubLList $list17 = list(list(makeSymbol("ERROR"), makeString("Cannot set tense czer to invalid mode.")));

    public static final SubLSymbol $tense_czer_mode$ = makeSymbol("*TENSE-CZER-MODE*");

    // Definitions
    public static final SubLObject with_czer_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_MEMOIZATION_STATE, $list_alt1, append(body, NIL));
        }
    }

    // Definitions
    public static SubLObject with_czer_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_MEMOIZATION_STATE, $list1, append(body, NIL));
    }

    public static final SubLObject with_new_czer_memoization_state_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt3, listS(WITH_MEMOIZATION_STATE, $list_alt1, append(body, NIL)));
        }
    }

    public static SubLObject with_new_czer_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list3, listS(WITH_MEMOIZATION_STATE, $list1, append(body, NIL)));
    }

    public static final SubLObject within_canonicalizer_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt4, append(body, NIL));
        }
    }

    public static SubLObject within_canonicalizer(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list4, append(body, NIL));
    }

    public static final SubLObject within_negation_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt5, append(body, NIL));
        }
    }

    public static SubLObject within_negation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list5, append(body, NIL));
    }

    public static final SubLObject within_disjunction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt6, append(body, NIL));
        }
    }

    public static SubLObject within_disjunction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

    /**
     * execute BODY while maintaining state indicating within a conjuntion.
     */
    @LispMethod(comment = "execute BODY while maintaining state indicating within a conjuntion.")
    public static final SubLObject within_conjunction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt7, append(body, NIL));
        }
    }

    /**
     * execute BODY while maintaining state indicating within a conjuntion.
     */
    @LispMethod(comment = "execute BODY while maintaining state indicating within a conjuntion.")
    public static SubLObject within_conjunction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list7, append(body, NIL));
    }

    /**
     * Execute BODY while processing an assert operation.
     */
    @LispMethod(comment = "Execute BODY while processing an assert operation.")
    public static final SubLObject within_assert_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt8, append(body, NIL));
        }
    }

    /**
     * Execute BODY while processing an assert operation.
     */
    @LispMethod(comment = "Execute BODY while processing an assert operation.")
    public static SubLObject within_assert(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list8, append(body, NIL));
    }

    /**
     * Intended to be used within @xref within-assert,
     * to escape out of the context of the assert operation.
     */
    @LispMethod(comment = "Intended to be used within @xref within-assert,\r\nto escape out of the context of the assert operation.\nIntended to be used within @xref within-assert,\nto escape out of the context of the assert operation.")
    public static final SubLObject not_within_assert_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt9, append(body, NIL));
        }
    }

    /**
     * Intended to be used within @xref within-assert,
     * to escape out of the context of the assert operation.
     */
    @LispMethod(comment = "Intended to be used within @xref within-assert,\r\nto escape out of the context of the assert operation.\nIntended to be used within @xref within-assert,\nto escape out of the context of the assert operation.")
    public static SubLObject not_within_assert(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list9, append(body, NIL));
    }

    /**
     * Execute BODY while processing an ask operation.
     */
    @LispMethod(comment = "Execute BODY while processing an ask operation.")
    public static final SubLObject within_ask_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt10, append(body, NIL));
        }
    }

    @LispMethod(comment = "Execute BODY while processing an ask operation.")
    public static SubLObject within_ask(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list10, append(body, NIL));
    }

    /**
     * Execute BODY while processing a CycL query.
     */
    @LispMethod(comment = "Execute BODY while processing a CycL query.")
    public static final SubLObject within_query_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt11, append(body, NIL));
        }
    }

    @LispMethod(comment = "Execute BODY while processing a CycL query.")
    public static SubLObject within_query(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list11, append(body, NIL));
    }

    /**
     * Execute BODY while processing a termOfUnit gaf.
     */
    @LispMethod(comment = "Execute BODY while processing a termOfUnit gaf.")
    public static final SubLObject within_tou_gaf_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt12, append(body, NIL));
        }
    }

    @LispMethod(comment = "Execute BODY while processing a termOfUnit gaf.")
    public static SubLObject within_tou_gaf(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list12, append(body, NIL));
    }

    public static final SubLObject with_tense_czer_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mode = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            mode = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(PUNLESS, list(VALID_TENSE_CZER_MODE_P, mode), $list_alt17), listS(CLET, list(list($tense_czer_mode$, mode)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_tense_czer_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        mode = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(PUNLESS, list(VALID_TENSE_CZER_MODE_P, mode), $list17), listS(CLET, list(list($tense_czer_mode$, mode)), append(body, NIL)));
    }

    public static SubLObject declare_czer_macros_file() {
        declareMacro("with_czer_memoization_state", "WITH-CZER-MEMOIZATION-STATE");
        declareMacro("with_new_czer_memoization_state", "WITH-NEW-CZER-MEMOIZATION-STATE");
        declareMacro("within_canonicalizer", "WITHIN-CANONICALIZER");
        declareMacro("within_negation", "WITHIN-NEGATION");
        declareMacro("within_disjunction", "WITHIN-DISJUNCTION");
        declareMacro("within_conjunction", "WITHIN-CONJUNCTION");
        declareMacro("within_assert", "WITHIN-ASSERT");
        declareMacro("not_within_assert", "NOT-WITHIN-ASSERT");
        declareMacro("within_ask", "WITHIN-ASK");
        declareMacro("within_query", "WITHIN-QUERY");
        declareMacro("within_tou_gaf", "WITHIN-TOU-GAF");
        declareMacro("with_tense_czer_mode", "WITH-TENSE-CZER-MODE");
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("*CZER-MEMOIZATION-STATE*"));

    static private final SubLList $list_alt3 = list(list(makeSymbol("*CZER-MEMOIZATION-STATE*"), list(makeSymbol("NEW-MEMOIZATION-STATE"))));

    static private final SubLList $list_alt4 = list(list(makeSymbol("*WITHIN-CANONICALIZER?*"), T));

    static private final SubLList $list_alt5 = list(list(makeSymbol("*WITHIN-NEGATION?*"), list(makeSymbol("CNOT"), makeSymbol("*WITHIN-NEGATION?*"))));

    static private final SubLList $list_alt6 = list(list(makeSymbol("*WITHIN-DISJUNCTION?*"), T), list(makeSymbol("*WITHIN-NEGATED-DISJUNCTION?*"), makeSymbol("*WITHIN-NEGATION?*")));

    public static SubLObject init_czer_macros_file() {
        return NIL;
    }

    public static SubLObject setup_czer_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_czer_macros_file();
    }

    static private final SubLList $list_alt7 = list(list(makeSymbol("*WITHIN-CONJUNCTION?*"), T), list(makeSymbol("*WITHIN-NEGATED-CONJUNCTION?*"), makeSymbol("*WITHIN-NEGATION?*")));

    @Override
    public void initializeVariables() {
        init_czer_macros_file();
    }

    static private final SubLList $list_alt8 = list(list(makeSymbol("*WITHIN-ASSERT*"), T));

    @Override
    public void runTopLevelForms() {
        setup_czer_macros_file();
    }

    static private final SubLList $list_alt9 = list(list(makeSymbol("*WITHIN-ASSERT*"), NIL));

    static {
    }

    static private final SubLList $list_alt10 = list(list(makeSymbol("*WITHIN-ASK*"), T));

    static private final SubLList $list_alt11 = list(list(makeSymbol("*WITHIN-QUERY*"), T));

    static private final SubLList $list_alt12 = list(list(makeSymbol("*WITHIN-TOU-GAF?*"), T));

    static private final SubLList $list_alt13 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt17 = list(list(makeSymbol("ERROR"), makeString("Cannot set tense czer to invalid mode.")));
}

/**
 * Total time: 147 ms
 */
