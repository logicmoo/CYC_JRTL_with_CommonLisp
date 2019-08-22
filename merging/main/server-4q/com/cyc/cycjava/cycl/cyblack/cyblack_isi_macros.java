/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.rkf_collaborator_powerloom;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-ISI-MACROS
 *  source file: /cyc/top/cycl/cyblack/cyblack-isi-macros.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_isi_macros extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_isi_macros() {
    }

    public static final SubLFile me = new cyblack_isi_macros();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_isi_macros";

    // // Definitions
    public static final SubLObject stringify_symbol_or_number(SubLObject symbol_or_number) {
        return symbol_or_number.isSymbol() ? ((SubLObject) (symbol_name(symbol_or_number))) : symbol_or_number.isNumber() ? ((SubLObject) (string_utilities.to_string(symbol_or_number))) : NIL;
    }

    public static final SubLObject create_isi_problem(SubLObject query, SubLObject mt, SubLObject backchains, SubLObject number, SubLObject time, SubLObject depth) {
        return list(list($FORMULA, rkf_collaborator_powerloom.stringify_formula(query)), list($MT, rkf_collaborator_powerloom.stringify_formula(mt)), list($BACKCHAINS, stringify_symbol_or_number(backchains)), list($NUMBER, stringify_symbol_or_number(number)), list($TIME, stringify_symbol_or_number(time)), list($DEPTH, stringify_symbol_or_number(depth)));
    }

    public static final SubLObject copy_isi_problem(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject old_problem = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            old_problem = current.first();
            current = current.rest();
            if (NIL == current) {
                return copy_tree(old_problem);
            } else {
                cdestructuring_bind_error(datum, $list_alt6);
            }
        }
        return NIL;
    }

    public static final SubLObject get_isi_problem_query(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            isi_problem = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(GETF, isi_problem, $list_alt9);
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    public static final SubLObject set_isi_problem_query(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            SubLObject new_query = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            isi_problem = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt10);
            new_query = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PUTF, isi_problem, $FORMULA, new_query);
            } else {
                cdestructuring_bind_error(datum, $list_alt10);
            }
        }
        return NIL;
    }

    public static final SubLObject get_isi_problem_mt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            isi_problem = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(GETF, isi_problem, $list_alt12);
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    public static final SubLObject set_isi_problem_mt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            SubLObject new_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            isi_problem = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt13);
            new_mt = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PUTF, isi_problem, $MT, new_mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt13);
            }
        }
        return NIL;
    }

    public static final SubLObject get_isi_problem_backchains(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            isi_problem = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(GETF, isi_problem, $list_alt14);
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    public static final SubLObject set_isi_problem_backchains(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            SubLObject new_backchains = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            isi_problem = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt15);
            new_backchains = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PUTF, isi_problem, $BACKCHAINS, new_backchains);
            } else {
                cdestructuring_bind_error(datum, $list_alt15);
            }
        }
        return NIL;
    }

    public static final SubLObject get_isi_problem_number(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            isi_problem = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(GETF, isi_problem, $list_alt16);
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    public static final SubLObject set_isi_problem_number(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            SubLObject new_number = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            isi_problem = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt17);
            new_number = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PUTF, isi_problem, $NUMBER, new_number);
            } else {
                cdestructuring_bind_error(datum, $list_alt17);
            }
        }
        return NIL;
    }

    public static final SubLObject get_isi_problem_time(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            isi_problem = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(GETF, isi_problem, $list_alt18);
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    public static final SubLObject set_isi_problem_time(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            SubLObject new_time = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            isi_problem = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt19);
            new_time = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PUTF, isi_problem, $TIME, new_time);
            } else {
                cdestructuring_bind_error(datum, $list_alt19);
            }
        }
        return NIL;
    }

    public static final SubLObject get_isi_problem_depth(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt7);
            isi_problem = current.first();
            current = current.rest();
            if (NIL == current) {
                return listS(GETF, isi_problem, $list_alt20);
            } else {
                cdestructuring_bind_error(datum, $list_alt7);
            }
        }
        return NIL;
    }

    public static final SubLObject set_isi_problem_depth(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_problem = NIL;
            SubLObject new_depth = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            isi_problem = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt21);
            new_depth = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PUTF, isi_problem, $DEPTH, new_depth);
            } else {
                cdestructuring_bind_error(datum, $list_alt21);
            }
        }
        return NIL;
    }

    public static final SubLObject isi_problem_equal_p(SubLObject p1, SubLObject p2) {
        return makeBoolean(((((getf(p1, $FORMULA, UNPROVIDED).equal(getf(p2, $FORMULA, UNPROVIDED)) && getf(p1, $MT, UNPROVIDED).equal(getf(p2, $MT, UNPROVIDED))) && getf(p1, $BACKCHAINS, UNPROVIDED).equal(getf(p2, $BACKCHAINS, UNPROVIDED))) && getf(p1, $NUMBER, UNPROVIDED).equal(getf(p2, $NUMBER, UNPROVIDED))) && getf(p1, $TIME, UNPROVIDED).equal(getf(p2, $TIME, UNPROVIDED))) && getf(p1, $DEPTH, UNPROVIDED).equal(getf(p2, $DEPTH, UNPROVIDED)));
    }

    public static final SubLObject create_isi_assertion(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_assert = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            v_assert = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt22);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(LIST, list(LIST, $ASSERT, v_assert), list(LIST, $MT, mt));
            } else {
                cdestructuring_bind_error(datum, $list_alt22);
            }
        }
        return NIL;
    }

    public static final SubLObject get_isi_assertion_assert(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            isi_assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CADR, list(ASSOC, $ASSERT, isi_assertion));
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
    }

    public static final SubLObject set_isi_assertion_assert(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_assertion = NIL;
            SubLObject new_assert = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            isi_assertion = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt28);
            new_assert = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RPLACA, list(CDR, list(ASSOC, $ASSERT, isi_assertion)), new_assert);
            } else {
                cdestructuring_bind_error(datum, $list_alt28);
            }
        }
        return NIL;
    }

    public static final SubLObject get_isi_assertion_mt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            isi_assertion = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CADR, list(ASSOC, $MT, isi_assertion));
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
    }

    public static final SubLObject set_isi_assertion_mt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_assertion = NIL;
            SubLObject new_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            isi_assertion = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt31);
            new_mt = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RPLACA, list(CDR, list(ASSOC, $MT, isi_assertion)), new_mt);
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    public static final SubLObject isi_assertion_equal_p(SubLObject a1, SubLObject a2) {
        return makeBoolean(cadr(assoc($ASSERT, a1, UNPROVIDED, UNPROVIDED)).equal(cadr(assoc($ASSERT, a2, UNPROVIDED, UNPROVIDED))) && cadr(assoc($MT, a1, UNPROVIDED, UNPROVIDED)).equal(cadr(assoc($MT, a2, UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject create_isi_solution(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject list_of_missing_assertions = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            list_of_missing_assertions = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CONS, $MISSING_ASSERTIONS, list(COPY_LIST, list_of_missing_assertions));
            } else {
                cdestructuring_bind_error(datum, $list_alt32);
            }
        }
        return NIL;
    }

    public static final SubLObject copy_isi_solution(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_solution = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            isi_solution = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(COPY_TREE, isi_solution);
            } else {
                cdestructuring_bind_error(datum, $list_alt36);
            }
        }
        return NIL;
    }

    public static final SubLObject get_isi_solution_missing_assertions(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_solution = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            isi_solution = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CDR, isi_solution);
            } else {
                cdestructuring_bind_error(datum, $list_alt36);
            }
        }
        return NIL;
    }

    public static final SubLObject set_isi_solution_missing_assertions(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject isi_solution = NIL;
            SubLObject missing_assertions = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            isi_solution = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt38);
            missing_assertions = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(RPLACD, isi_solution, list(COPY_LIST, missing_assertions));
            } else {
                cdestructuring_bind_error(datum, $list_alt38);
            }
        }
        return NIL;
    }

    public static final SubLObject isi_solution_equal_p(SubLObject s1, SubLObject s2) {
        {
            SubLObject s1_assertions = s1.rest();
            SubLObject s2_assertions = s2.rest();
            return list_utilities.sets_equalP(s1_assertions, s2_assertions, ISI_ASSERTION_EQUAL_P);
        }
    }

    public static final SubLObject declare_cyblack_isi_macros_file() {
        declareFunction("stringify_symbol_or_number", "STRINGIFY-SYMBOL-OR-NUMBER", 1, 0, false);
        declareFunction("create_isi_problem", "CREATE-ISI-PROBLEM", 6, 0, false);
        declareMacro("copy_isi_problem", "COPY-ISI-PROBLEM");
        declareMacro("get_isi_problem_query", "GET-ISI-PROBLEM-QUERY");
        declareMacro("set_isi_problem_query", "SET-ISI-PROBLEM-QUERY");
        declareMacro("get_isi_problem_mt", "GET-ISI-PROBLEM-MT");
        declareMacro("set_isi_problem_mt", "SET-ISI-PROBLEM-MT");
        declareMacro("get_isi_problem_backchains", "GET-ISI-PROBLEM-BACKCHAINS");
        declareMacro("set_isi_problem_backchains", "SET-ISI-PROBLEM-BACKCHAINS");
        declareMacro("get_isi_problem_number", "GET-ISI-PROBLEM-NUMBER");
        declareMacro("set_isi_problem_number", "SET-ISI-PROBLEM-NUMBER");
        declareMacro("get_isi_problem_time", "GET-ISI-PROBLEM-TIME");
        declareMacro("set_isi_problem_time", "SET-ISI-PROBLEM-TIME");
        declareMacro("get_isi_problem_depth", "GET-ISI-PROBLEM-DEPTH");
        declareMacro("set_isi_problem_depth", "SET-ISI-PROBLEM-DEPTH");
        declareFunction("isi_problem_equal_p", "ISI-PROBLEM-EQUAL-P", 2, 0, false);
        declareMacro("create_isi_assertion", "CREATE-ISI-ASSERTION");
        declareMacro("get_isi_assertion_assert", "GET-ISI-ASSERTION-ASSERT");
        declareMacro("set_isi_assertion_assert", "SET-ISI-ASSERTION-ASSERT");
        declareMacro("get_isi_assertion_mt", "GET-ISI-ASSERTION-MT");
        declareMacro("set_isi_assertion_mt", "SET-ISI-ASSERTION-MT");
        declareFunction("isi_assertion_equal_p", "ISI-ASSERTION-EQUAL-P", 2, 0, false);
        declareMacro("create_isi_solution", "CREATE-ISI-SOLUTION");
        declareMacro("copy_isi_solution", "COPY-ISI-SOLUTION");
        declareMacro("get_isi_solution_missing_assertions", "GET-ISI-SOLUTION-MISSING-ASSERTIONS");
        declareMacro("set_isi_solution_missing_assertions", "SET-ISI-SOLUTION-MISSING-ASSERTIONS");
        declareFunction("isi_solution_equal_p", "ISI-SOLUTION-EQUAL-P", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_isi_macros_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_isi_macros_file() {
                return NIL;
    }





    private static final SubLSymbol $BACKCHAINS = makeKeyword("BACKCHAINS");







    static private final SubLList $list_alt6 = list(makeSymbol("OLD-PROBLEM"));

    static private final SubLList $list_alt7 = list(makeSymbol("ISI-PROBLEM"));



    static private final SubLList $list_alt9 = list(makeKeyword("FORMULA"));

    static private final SubLList $list_alt10 = list(makeSymbol("ISI-PROBLEM"), makeSymbol("NEW-QUERY"));



    static private final SubLList $list_alt12 = list(makeKeyword("MT"));

    static private final SubLList $list_alt13 = list(makeSymbol("ISI-PROBLEM"), makeSymbol("NEW-MT"));

    static private final SubLList $list_alt14 = list(makeKeyword("BACKCHAINS"));

    static private final SubLList $list_alt15 = list(makeSymbol("ISI-PROBLEM"), makeSymbol("NEW-BACKCHAINS"));

    static private final SubLList $list_alt16 = list(makeKeyword("NUMBER"));

    static private final SubLList $list_alt17 = list(makeSymbol("ISI-PROBLEM"), makeSymbol("NEW-NUMBER"));

    static private final SubLList $list_alt18 = list($TIME);

    static private final SubLList $list_alt19 = list(makeSymbol("ISI-PROBLEM"), makeSymbol("NEW-TIME"));

    static private final SubLList $list_alt20 = list(makeKeyword("DEPTH"));

    static private final SubLList $list_alt21 = list(makeSymbol("ISI-PROBLEM"), makeSymbol("NEW-DEPTH"));

    static private final SubLList $list_alt22 = list(makeSymbol("ASSERT"), makeSymbol("MT"));





    static private final SubLList $list_alt25 = list(makeSymbol("ISI-ASSERTION"));





    static private final SubLList $list_alt28 = list(makeSymbol("ISI-ASSERTION"), makeSymbol("NEW-ASSERT"));





    static private final SubLList $list_alt31 = list(makeSymbol("ISI-ASSERTION"), makeSymbol("NEW-MT"));

    static private final SubLList $list_alt32 = list(makeSymbol("LIST-OF-MISSING-ASSERTIONS"));



    private static final SubLSymbol $MISSING_ASSERTIONS = makeKeyword("MISSING-ASSERTIONS");



    static private final SubLList $list_alt36 = list(makeSymbol("ISI-SOLUTION"));



    static private final SubLList $list_alt38 = list(makeSymbol("ISI-SOLUTION"), makeSymbol("MISSING-ASSERTIONS"));



    private static final SubLSymbol ISI_ASSERTION_EQUAL_P = makeSymbol("ISI-ASSERTION-EQUAL-P");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_isi_macros_file();
    }

    public void initializeVariables() {
        init_cyblack_isi_macros_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_isi_macros_file();
    }
}

