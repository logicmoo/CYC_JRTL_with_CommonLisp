/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.sbhl.sbhl_iteration.sbhl_iteration_next;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_time_search extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_time_search();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_search";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sbhl_time_precedes_depths$ = makeSymbol("*SBHL-TIME-PRECEDES-DEPTHS*");

    private static final SubLObject $$weak_HL_TimePrecedence = reader_make_constant_shell("weak-HL-TimePrecedence");



    private static final SubLObject $$strict_HL_TimePrecedence = reader_make_constant_shell("strict-HL-TimePrecedence");

    private static final SubLObject $$weakSuccessor_HL_TimePrecedence = reader_make_constant_shell("weakSuccessor-HL-TimePrecedence");

    private static final SubLObject $$successorStrict_HL_TimePrecedence = reader_make_constant_shell("successorStrict-HL-TimePrecedence");

    private static final SubLInteger $int$_3 = makeInteger(-3);

    static private final SubLString $str13$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str18$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    static private final SubLList $list22 = list(ZERO_INTEGER, MINUS_ONE_INTEGER, makeInteger(-2), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER);

    private static final SubLSymbol SBHL_PUSH_ONTO_RESULT = makeSymbol("SBHL-PUSH-ONTO-RESULT");

    static private final SubLList $list25 = list(makeSymbol("LINK0"), makeSymbol("LINK1"));

    static private final SubLList $list26 = list(makeSymbol("DATE-TAG"), makeSymbol("DATE-MT"), makeSymbol("LINK-DATE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list27 = list(makeSymbol("NODE-TAG"), makeSymbol("NODE-MT"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list28 = list(makeSymbol("LINK0"), makeSymbol("LINK1"), makeSymbol("LINK2"));

    static private final SubLList $list29 = list(makeSymbol("DATE-TAG"), makeSymbol("DATE-MT"), makeSymbol("DATE-DATE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list30 = list(makeSymbol("INT-TAG"), makeSymbol("INT-MT"), makeSymbol("INT-DATE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list31 = list(makeSymbol("LINK-TAG"), makeSymbol("LINK-MT"), makeSymbol("LINK-NODE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list33 = list(makeSymbol("DATE-TAG"), makeSymbol("DATE-MT"), makeSymbol("DATE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    // Definitions
    /**
     * Modifier: Creates and stores the link of module corresponding to VAL, from INFERIOR to SUPERIOR in MT with @hack truth #$MonotonicallyTrue. Also creates and stores corresponding backward link.
     */
    @LispMethod(comment = "Modifier: Creates and stores the link of module corresponding to VAL, from INFERIOR to SUPERIOR in MT with @hack truth #$MonotonicallyTrue. Also creates and stores corresponding backward link.")
    public static final SubLObject add_precedence_link_alt(SubLObject inferior, SubLObject mt, SubLObject val, SubLObject superior) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = val;
                if (pcase_var.eql($WEAK)) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                            sbhl_link_methods.add_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (pcase_var.eql($STRICT)) {
                        {
                            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$strict_HL_TimePrecedence), thread);
                                sbhl_link_methods.add_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (pcase_var.eql($WEAK_SUCCESSOR)) {
                            {
                                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weakSuccessor_HL_TimePrecedence), thread);
                                    sbhl_link_methods.add_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                {
                                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$successorStrict_HL_TimePrecedence), thread);
                                        sbhl_link_methods.add_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    // Definitions
    /**
     * Modifier: Creates and stores the link of module corresponding to VAL, from INFERIOR to SUPERIOR in MT with @hack truth #$MonotonicallyTrue. Also creates and stores corresponding backward link.
     */
    @LispMethod(comment = "Modifier: Creates and stores the link of module corresponding to VAL, from INFERIOR to SUPERIOR in MT with @hack truth #$MonotonicallyTrue. Also creates and stores corresponding backward link.")
    public static SubLObject add_precedence_link(final SubLObject inferior, final SubLObject mt, final SubLObject val, final SubLObject superior) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (val.eql($WEAK)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                sbhl_link_methods.add_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        } else
            if (val.eql($STRICT)) {
                final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$strict_HL_TimePrecedence), thread);
                    sbhl_link_methods.add_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            } else
                if (val.eql($WEAK_SUCCESSOR)) {
                    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weakSuccessor_HL_TimePrecedence), thread);
                        sbhl_link_methods.add_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                } else
                    if (val.eql($SUCCESSOR_STRICT)) {
                        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$successorStrict_HL_TimePrecedence), thread);
                            sbhl_link_methods.add_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }



        return NIL;
    }

    /**
     * Modifier: Removes stored link of module corresponding to VAL, from INFERIOR to SUPERIOR in MT with @hack truth #$MonotonicallyTrue. Also removes stored backward link.
     */
    @LispMethod(comment = "Modifier: Removes stored link of module corresponding to VAL, from INFERIOR to SUPERIOR in MT with @hack truth #$MonotonicallyTrue. Also removes stored backward link.")
    public static final SubLObject remove_precedence_link_alt(SubLObject inferior, SubLObject mt, SubLObject val, SubLObject superior) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = val;
                if (pcase_var.eql($WEAK)) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                            sbhl_link_methods.remove_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (pcase_var.eql($STRICT)) {
                        {
                            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$strict_HL_TimePrecedence), thread);
                                sbhl_link_methods.remove_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        if (pcase_var.eql($WEAK_SUCCESSOR)) {
                            {
                                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weakSuccessor_HL_TimePrecedence), thread);
                                    sbhl_link_methods.remove_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } else {
                            if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                {
                                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$successorStrict_HL_TimePrecedence), thread);
                                        sbhl_link_methods.remove_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Modifier: Removes stored link of module corresponding to VAL, from INFERIOR to SUPERIOR in MT with @hack truth #$MonotonicallyTrue. Also removes stored backward link.
     */
    @LispMethod(comment = "Modifier: Removes stored link of module corresponding to VAL, from INFERIOR to SUPERIOR in MT with @hack truth #$MonotonicallyTrue. Also removes stored backward link.")
    public static SubLObject remove_precedence_link(final SubLObject inferior, final SubLObject mt, final SubLObject val, final SubLObject superior) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (val.eql($WEAK)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                sbhl_link_methods.remove_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        } else
            if (val.eql($STRICT)) {
                final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$strict_HL_TimePrecedence), thread);
                    sbhl_link_methods.remove_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                } finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            } else
                if (val.eql($WEAK_SUCCESSOR)) {
                    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weakSuccessor_HL_TimePrecedence), thread);
                        sbhl_link_methods.remove_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                    }
                } else
                    if (val.eql($SUCCESSOR_STRICT)) {
                        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$successorStrict_HL_TimePrecedence), thread);
                            sbhl_link_methods.remove_sbhl_link(inferior, superior, mt, $$MonotonicallyTrue);
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }



        return NIL;
    }

    public static final SubLObject weakly_precedesP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return T;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return sbhl_time_dates.sbhl_dateLE(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_before(before, after, mt, ZERO_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_after(before, after, mt, ZERO_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_node_node(before, after, mt, ZERO_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject weakly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return T;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return sbhl_time_dates.sbhl_dateLE(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return precedesP_date_before(before, after, mt, ZERO_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return precedesP_date_after(before, after, mt, ZERO_INTEGER);
        }
        return precedesP_node_node(before, after, mt, ZERO_INTEGER);
    }

    public static final SubLObject strictly_precedesP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return sbhl_time_dates.sbhl_dateL(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_before(before, after, mt, MINUS_ONE_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_after(before, after, mt, MINUS_ONE_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_node_node(before, after, mt, MINUS_ONE_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return sbhl_time_dates.sbhl_dateL(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return precedesP_date_before(before, after, mt, MINUS_ONE_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return precedesP_date_after(before, after, mt, MINUS_ONE_INTEGER);
        }
        return precedesP_node_node(before, after, mt, MINUS_ONE_INTEGER);
    }

    public static final SubLObject weakly_precedes_successorP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return T;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return sbhl_time_dates.sbhl_dateLE(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_before(before, after, mt, ONE_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_after(before, after, mt, ONE_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_node_node(before, after, mt, ONE_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject weakly_precedes_successorP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return T;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return sbhl_time_dates.sbhl_dateLE(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return precedesP_date_before(before, after, mt, ONE_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return precedesP_date_after(before, after, mt, ONE_INTEGER);
        }
        return precedesP_node_node(before, after, mt, ONE_INTEGER);
    }

    public static final SubLObject successor_strictly_precedesP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return sbhl_time_dates.sbhl_dateL(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_before(before, after, mt, $int$_2);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_after(before, after, mt, $int$_2);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_node_node(before, after, mt, $int$_2);
                    }
                }
            }
        }
    }

    public static SubLObject successor_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return sbhl_time_dates.sbhl_dateL(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return precedesP_date_before(before, after, mt, $int$_2);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return precedesP_date_after(before, after, mt, $int$_2);
        }
        return precedesP_node_node(before, after, mt, $int$_2);
    }

    public static final SubLObject weakly_precedes_successors_successorP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return T;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return sbhl_time_dates.sbhl_dateLE(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_before(before, after, mt, TWO_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_after(before, after, mt, TWO_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_node_node(before, after, mt, TWO_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject weakly_precedes_successors_successorP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return T;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return sbhl_time_dates.sbhl_dateLE(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return precedesP_date_before(before, after, mt, TWO_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return precedesP_date_after(before, after, mt, TWO_INTEGER);
        }
        return precedesP_node_node(before, after, mt, TWO_INTEGER);
    }

    public static final SubLObject weakly_precedes_successors_successors_successorP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return T;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return sbhl_time_dates.sbhl_dateLE(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_before(before, after, mt, THREE_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_after(before, after, mt, THREE_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_node_node(before, after, mt, THREE_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject weakly_precedes_successors_successors_successorP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return T;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return sbhl_time_dates.sbhl_dateLE(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return precedesP_date_before(before, after, mt, THREE_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return precedesP_date_after(before, after, mt, THREE_INTEGER);
        }
        return precedesP_node_node(before, after, mt, THREE_INTEGER);
    }

    public static final SubLObject successors_successor_strictly_precedesP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return sbhl_time_dates.sbhl_dateL(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_before(before, after, mt, $int$_3);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_date_after(before, after, mt, $int$_3);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_node_node(before, after, mt, $int$_3);
                    }
                }
            }
        }
    }

    public static SubLObject successors_successor_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return sbhl_time_dates.sbhl_dateL(sbhl_time_utilities.hl_interval_of_endpoint(before), sbhl_time_utilities.hl_interval_of_endpoint(after));
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return precedesP_date_before(before, after, mt, $int$_3);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return precedesP_date_after(before, after, mt, $int$_3);
        }
        return precedesP_node_node(before, after, mt, $int$_3);
    }

    public static final SubLObject coordinateP_alt(SubLObject node1, SubLObject node2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_search.weakly_precedesP(node1, node2, mt)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_search.weakly_precedesP(node2, node1, mt)));
    }

    public static SubLObject coordinateP(final SubLObject node1, final SubLObject node2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != weakly_precedesP(node1, node2, mt)) && (NIL != weakly_precedesP(node2, node1, mt)));
    }

    public static final SubLObject successorP_alt(SubLObject node, SubLObject successor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_search.strictly_precedesP(node, successor, mt)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_search.weakly_precedes_successorP(successor, node, mt)));
    }

    public static SubLObject successorP(final SubLObject node, final SubLObject successor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != strictly_precedesP(node, successor, mt)) && (NIL != weakly_precedes_successorP(successor, node, mt)));
    }

    public static final SubLObject predecessorP_alt(SubLObject node, SubLObject predecessor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.successorP(predecessor, node, mt);
    }

    public static SubLObject predecessorP(final SubLObject node, final SubLObject predecessor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return successorP(predecessor, node, mt);
    }

    public static final SubLObject successors_successorP_alt(SubLObject node, SubLObject successors_successor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_search.successor_strictly_precedesP(node, successors_successor, mt)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_search.weakly_precedes_successors_successorP(successors_successor, node, mt)));
    }

    public static SubLObject successors_successorP(final SubLObject node, final SubLObject successors_successor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != successor_strictly_precedesP(node, successors_successor, mt)) && (NIL != weakly_precedes_successors_successorP(successors_successor, node, mt)));
    }

    public static final SubLObject precedesP_date_before_alt(SubLObject before, SubLObject after, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_5 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_6 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_7 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_9 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_10 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_12 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_13 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_14 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            successP = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_node_date(after, sbhl_time_utilities.hl_interval_of_endpoint(before), mt, depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_15, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_14, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_13, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_12, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_11, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_10, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_9, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_8, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_7, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_6, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_5, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_3, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_2, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject precedesP_date_before(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$5 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$14 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        successP = precedesP_node_date(after, sbhl_time_utilities.hl_interval_of_endpoint(before), mt, depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$15, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$14, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$5, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$6, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$5, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$4, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$4, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$4, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$3, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static final SubLObject precedesP_date_after_alt(SubLObject before, SubLObject after, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_16 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_18 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_20 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_21 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_24 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_25 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_26 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_27 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_28 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_29 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            successP = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.precedesP_node_date(before, sbhl_time_utilities.hl_interval_of_endpoint(after), mt, depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_30, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_29, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_28, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_27, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_26, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_25, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_24, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_23, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_22, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_21, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_20, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_19, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_18, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_17, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_16, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject precedesP_date_after(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            final SubLObject _prev_bind_0_$16 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$17 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$18 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$19 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$19 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$20 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$29 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        successP = precedesP_node_date(before, sbhl_time_utilities.hl_interval_of_endpoint(after), mt, depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$30, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$29, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$20, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$20, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$21, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$20, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$19, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$19, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$19, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$18, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$18, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$17, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$16, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    public static final SubLObject precedesP_node_date_alt(SubLObject node, SubLObject date, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue();
                        SubLObject search_depth = NIL;
                        for (search_depth = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , search_depth = csome_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject search_node = sbhl_time_dates.sbhl_time_date_find_search_node(node, mt, search_depth);
                                SubLObject search_date = thread.secondMultipleValue();
                                SubLObject search_tag = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != search_date) {
                                    successP = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? ((SubLObject) (add(depth, minus(search_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)).isNegative() ? ((SubLObject) (sbhl_time_dates.sbhl_dateL(search_date, date))) : sbhl_time_dates.sbhl_dateLE(search_date, date))) : add(depth, minus(search_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)).isNegative() ? ((SubLObject) (sbhl_time_dates.sbhl_dateG(search_date, date))) : sbhl_time_dates.sbhl_dateGE(search_date, date);
                                }
                            }
                            doneP = makeBoolean((NIL != successP) || search_depth.eql(depth));
                        }
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject precedesP_node_date(final SubLObject node, final SubLObject date, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var;
            SubLObject search_depth;
            SubLObject search_node;
            SubLObject search_date;
            SubLObject search_tag;
            for (csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue(), search_depth = NIL, search_depth = csome_list_var.first(); (NIL == doneP) && (NIL != csome_list_var); doneP = makeBoolean((NIL != successP) || search_depth.eql(depth)) , csome_list_var = csome_list_var.rest() , search_depth = csome_list_var.first()) {
                thread.resetMultipleValues();
                search_node = sbhl_time_dates.sbhl_time_date_find_search_node(node, mt, search_depth);
                search_date = thread.secondMultipleValue();
                search_tag = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != search_date) {
                    successP = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? add(depth, minus(search_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)).isNegative() ? sbhl_time_dates.sbhl_dateL(search_date, date) : sbhl_time_dates.sbhl_dateLE(search_date, date) : add(depth, minus(search_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)).isNegative() ? sbhl_time_dates.sbhl_dateG(search_date, date) : sbhl_time_dates.sbhl_dateGE(search_date, date);
                }
            }
        }
        return successP;
    }

    public static final SubLObject precedesP_node_node_alt(SubLObject before, SubLObject after, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                SubLTrampolineFile.checkType(depth, INTEGERP);
                {
                    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                        successP = sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), before, after, mt, UNPROVIDED);
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == successP) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                            {
                                SubLObject before_doneP = NIL;
                                if (NIL == before_doneP) {
                                    {
                                        SubLObject csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue();
                                        SubLObject before_depth = NIL;
                                        for (before_depth = csome_list_var.first(); !((NIL != before_doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , before_depth = csome_list_var.first()) {
                                            {
                                                SubLObject before_node = NIL;
                                                SubLObject before_date = NIL;
                                                SubLObject before_tag = NIL;
                                                {
                                                    SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject before_node_32 = sbhl_time_dates.sbhl_time_date_find_search_node(before, mt, before_depth);
                                                            SubLObject before_date_33 = thread.secondMultipleValue();
                                                            SubLObject before_tag_34 = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            before_node = before_node_32;
                                                            before_date = before_date_33;
                                                            before_tag = before_tag_34;
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_31, thread);
                                                    }
                                                }
                                                if (NIL != before_date) {
                                                    {
                                                        SubLObject after_doneP = NIL;
                                                        if (NIL == after_doneP) {
                                                            {
                                                                SubLObject csome_list_var_35 = $sbhl_time_precedes_depths$.getGlobalValue();
                                                                SubLObject after_depth = NIL;
                                                                for (after_depth = csome_list_var_35.first(); !((NIL != after_doneP) || (NIL == csome_list_var_35)); csome_list_var_35 = csome_list_var_35.rest() , after_depth = csome_list_var_35.first()) {
                                                                    {
                                                                        SubLObject after_node = NIL;
                                                                        SubLObject after_date = NIL;
                                                                        SubLObject after_tag = NIL;
                                                                        {
                                                                            SubLObject _prev_bind_0_36 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject after_node_37 = sbhl_time_dates.sbhl_time_date_find_search_node(after, mt, after_depth);
                                                                                    SubLObject after_date_38 = thread.secondMultipleValue();
                                                                                    SubLObject after_tag_39 = thread.thirdMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    after_node = after_node_37;
                                                                                    after_date = after_date_38;
                                                                                    after_tag = after_tag_39;
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_36, thread);
                                                                            }
                                                                        }
                                                                        if (NIL != after_date) {
                                                                            successP = (add(new SubLObject[]{ depth, minus(before_depth), minus(after_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(before_tag), sbhl_marking_utilities.sbhl_temporal_tag_increment(after_tag) }).isNegative()) ? ((SubLObject) (sbhl_time_dates.sbhl_dateL(before_date, after_date))) : sbhl_time_dates.sbhl_dateLE(before_date, after_date);
                                                                        }
                                                                    }
                                                                    after_doneP = makeBoolean((NIL != successP) || after_depth.eql(depth));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            before_doneP = makeBoolean((NIL != successP) || before_depth.eql(depth));
                                        }
                                    }
                                }
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject precedesP_node_node(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        assert NIL != integerp(depth) : "! integerp(depth) " + ("Types.integerp(depth) " + "CommonSymbols.NIL != Types.integerp(depth) ") + depth;
        SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
            successP = sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), before, after, mt, UNPROVIDED);
        } finally {
            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0, thread);
        }
        if (NIL == successP) {
            _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                SubLObject before_doneP = NIL;
                if (NIL == before_doneP) {
                    SubLObject csome_list_var;
                    SubLObject before_depth;
                    SubLObject before_node;
                    SubLObject before_date;
                    SubLObject before_tag;
                    SubLObject _prev_bind_0_$31;
                    SubLObject before_node_$32;
                    SubLObject before_date_$33;
                    SubLObject before_tag_$34;
                    SubLObject after_doneP;
                    SubLObject csome_list_var_$35;
                    SubLObject after_depth;
                    SubLObject after_node;
                    SubLObject after_date;
                    SubLObject after_tag;
                    SubLObject _prev_bind_0_$32;
                    SubLObject after_node_$37;
                    SubLObject after_date_$38;
                    SubLObject after_tag_$39;
                    for (csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue(), before_depth = NIL, before_depth = csome_list_var.first(); (NIL == before_doneP) && (NIL != csome_list_var); before_doneP = makeBoolean((NIL != successP) || before_depth.eql(depth)) , csome_list_var = csome_list_var.rest() , before_depth = csome_list_var.first()) {
                        before_node = NIL;
                        before_date = NIL;
                        before_tag = NIL;
                        _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                        try {
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            thread.resetMultipleValues();
                            before_node_$32 = sbhl_time_dates.sbhl_time_date_find_search_node(before, mt, before_depth);
                            before_date_$33 = thread.secondMultipleValue();
                            before_tag_$34 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            before_node = before_node_$32;
                            before_date = before_date_$33;
                            before_tag = before_tag_$34;
                        } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$31, thread);
                        }
                        if (NIL != before_date) {
                            after_doneP = NIL;
                            if (NIL == after_doneP) {
                                for (csome_list_var_$35 = $sbhl_time_precedes_depths$.getGlobalValue(), after_depth = NIL, after_depth = csome_list_var_$35.first(); (NIL == after_doneP) && (NIL != csome_list_var_$35); after_doneP = makeBoolean((NIL != successP) || after_depth.eql(depth)) , csome_list_var_$35 = csome_list_var_$35.rest() , after_depth = csome_list_var_$35.first()) {
                                    after_node = NIL;
                                    after_date = NIL;
                                    after_tag = NIL;
                                    _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                        thread.resetMultipleValues();
                                        after_node_$37 = sbhl_time_dates.sbhl_time_date_find_search_node(after, mt, after_depth);
                                        after_date_$38 = thread.secondMultipleValue();
                                        after_tag_$39 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        after_node = after_node_$37;
                                        after_date = after_date_$38;
                                        after_tag = after_tag_$39;
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$32, thread);
                                    }
                                    if (NIL != after_date) {
                                        successP = (add(new SubLObject[]{ depth, minus(before_depth), minus(after_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(before_tag), sbhl_marking_utilities.sbhl_temporal_tag_increment(after_tag) }).isNegative()) ? sbhl_time_dates.sbhl_dateL(before_date, after_date) : sbhl_time_dates.sbhl_dateLE(before_date, after_date);
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return successP;
    }

    public static final SubLObject all_weakly_precedes_alt(SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_date(before, mt, ZERO_INTEGER))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_node(before, mt, ZERO_INTEGER);
    }

    public static SubLObject all_weakly_precedes(final SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? all_forward_precedes_date(before, mt, ZERO_INTEGER) : all_forward_precedes_node(before, mt, ZERO_INTEGER);
    }

    public static final SubLObject all_weakly_precedes_inverse_alt(SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_date(after, mt, ZERO_INTEGER))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_node(after, mt, ZERO_INTEGER);
    }

    public static SubLObject all_weakly_precedes_inverse(final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? all_backward_precedes_date(after, mt, ZERO_INTEGER) : all_backward_precedes_node(after, mt, ZERO_INTEGER);
    }

    public static final SubLObject all_strictly_precedes_alt(SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_date(before, mt, MINUS_ONE_INTEGER))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_node(before, mt, MINUS_ONE_INTEGER);
    }

    public static SubLObject all_strictly_precedes(final SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? all_forward_precedes_date(before, mt, MINUS_ONE_INTEGER) : all_forward_precedes_node(before, mt, MINUS_ONE_INTEGER);
    }

    public static final SubLObject all_strictly_precedes_inverse_alt(SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_date(after, mt, MINUS_ONE_INTEGER))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_node(after, mt, MINUS_ONE_INTEGER);
    }

    public static SubLObject all_strictly_precedes_inverse(final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? all_backward_precedes_date(after, mt, MINUS_ONE_INTEGER) : all_backward_precedes_node(after, mt, MINUS_ONE_INTEGER);
    }

    public static final SubLObject all_weakly_precedes_successor_alt(SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_date(before, mt, ONE_INTEGER))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_node(before, mt, ONE_INTEGER);
    }

    public static SubLObject all_weakly_precedes_successor(final SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? all_forward_precedes_date(before, mt, ONE_INTEGER) : all_forward_precedes_node(before, mt, ONE_INTEGER);
    }

    public static final SubLObject all_weakly_precedes_successor_inverse_alt(SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_date(after, mt, ONE_INTEGER))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_node(after, mt, ONE_INTEGER);
    }

    public static SubLObject all_weakly_precedes_successor_inverse(final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? all_backward_precedes_date(after, mt, ONE_INTEGER) : all_backward_precedes_node(after, mt, ONE_INTEGER);
    }

    public static final SubLObject all_successor_strictly_precedes_alt(SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_date(before, mt, $int$_2))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_node(before, mt, $int$_2);
    }

    public static SubLObject all_successor_strictly_precedes(final SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? all_forward_precedes_date(before, mt, $int$_2) : all_forward_precedes_node(before, mt, $int$_2);
    }

    public static final SubLObject all_successor_strictly_precedes_inverse_alt(SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_date(after, mt, $int$_2))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_node(after, mt, $int$_2);
    }

    public static SubLObject all_successor_strictly_precedes_inverse(final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? all_backward_precedes_date(after, mt, $int$_2) : all_backward_precedes_node(after, mt, $int$_2);
    }

    public static final SubLObject all_weakly_precedes_successors_successor_alt(SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_date(before, mt, TWO_INTEGER))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_forward_precedes_node(before, mt, TWO_INTEGER);
    }

    public static SubLObject all_weakly_precedes_successors_successor(final SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(before) ? all_forward_precedes_date(before, mt, TWO_INTEGER) : all_forward_precedes_node(before, mt, TWO_INTEGER);
    }

    public static final SubLObject all_weakly_precedes_successors_successor_inverse_alt(SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_date(after, mt, TWO_INTEGER))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_backward_precedes_node(after, mt, TWO_INTEGER);
    }

    public static SubLObject all_weakly_precedes_successors_successor_inverse(final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return NIL != sbhl_time_utilities.hl_date_point_p(after) ? all_backward_precedes_date(after, mt, TWO_INTEGER) : all_backward_precedes_node(after, mt, TWO_INTEGER);
    }

    public static final SubLObject all_forward_precedes_date_alt(SubLObject before, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject before_date = sbhl_time_utilities.hl_interval_of_endpoint(before);
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_40 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_41 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_42 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_43 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_44 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_45 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_46 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_47 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_48 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_49 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_50 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_51 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_52 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_53 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            results = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_precedes_date(before_date, depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_54, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_53, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_52, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_51, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_50, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_49, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_48, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_47, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_46, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_45, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_44, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_43, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_42, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_41, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_40, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject all_forward_precedes_date(final SubLObject before, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject before_date = sbhl_time_utilities.hl_interval_of_endpoint(before);
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            final SubLObject _prev_bind_0_$40 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$41 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$42 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$43 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$44 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$53 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        results = all_precedes_date(before_date, depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$54, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$53, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$44, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$44, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$45, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$44, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$43, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$43, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$43, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$42, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$42, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$41, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$42, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$41, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$40, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject all_backward_precedes_date_alt(SubLObject after, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject after_date = sbhl_time_utilities.hl_interval_of_endpoint(after);
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_55 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_56 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_57 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_58 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_59 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_60 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_61 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_62 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_63 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_64 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_65 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_66 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_67 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_68 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_69 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            results = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_precedes_date(after_date, depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_69, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_68, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_67, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_66, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_65, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_64, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_63, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_62, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_61, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_60, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_59, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_58, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_57, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_56, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_55, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject all_backward_precedes_date(final SubLObject after, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject after_date = sbhl_time_utilities.hl_interval_of_endpoint(after);
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            final SubLObject _prev_bind_0_$55 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$56 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$57 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$58 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$58 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$58 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$59 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$59 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$59 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$68 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$69 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        results = all_precedes_date(after_date, depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$69, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$68, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$59, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$59, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$60, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$59, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$58, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$58, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$58, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$57, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$57, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$56, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$57, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$56, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$55, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject all_forward_precedes_node_alt(SubLObject before, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_70 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_71 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_72 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_73 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_74 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_75 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_76 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_77 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_78 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_79 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_80 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_81 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_82 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_83 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            results = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_precedes_node(before, depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_84, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_83, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_82, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_81, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_80, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_79, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_78, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_77, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_76, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_75, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_74, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_73, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_72, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_71, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_70, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject all_forward_precedes_node(final SubLObject before, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$71 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$72 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$71 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$72 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$73 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$73 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$74 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$74 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$83 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$84 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        results = all_precedes_node(before, depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$84, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$83, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$74, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$74, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$75, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$74, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$73, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$73, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$73, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$72, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$72, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$71, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$72, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$71, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$70, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject all_backward_precedes_node_alt(SubLObject after, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_85 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_86 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_87 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_88 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_89 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_90 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_91 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_92 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_93 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_94 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_95 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_96 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_97 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_98 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            results = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.all_precedes_node(after, depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_99, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_98, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_97, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_96, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_95, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_94, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_93, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_92, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_91, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_90, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_89, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_88, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_87, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_86, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_85, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject all_backward_precedes_node(final SubLObject after, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            final SubLObject _prev_bind_0_$85 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$86 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$87 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$86 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$87 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$88 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$88 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$88 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$89 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$90 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$89 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$89 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$98 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$99 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        results = all_precedes_node(after, depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$99, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$98, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$89, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$89, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$90, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$89, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$88, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$88, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$88, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$87, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$87, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$86, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$87, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$86, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$85, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject all_precedes_date_alt(SubLObject date, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                        sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT, thread);
                        {
                            SubLObject date0 = NIL;
                            SubLObject date1 = NIL;
                            if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
                                date0 = date;
                                date1 = NIL;
                            } else {
                                date0 = NIL;
                                date1 = date;
                            }
                            {
                                SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_date_link_iterator(date0, date1, sbhl_link_vars.get_sbhl_link_direction());
                                SubLObject done_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject raw_links = sbhl_iteration_next(iterator);
                                        if (NIL != raw_links) {
                                            {
                                                SubLObject datum = raw_links;
                                                SubLObject current = datum;
                                                SubLObject link0 = NIL;
                                                SubLObject link1 = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt25);
                                                link0 = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt25);
                                                link1 = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    {
                                                        SubLObject datum_100 = link0;
                                                        SubLObject current_101 = datum_100;
                                                        SubLObject date_tag = NIL;
                                                        SubLObject date_mt = NIL;
                                                        SubLObject link_date = NIL;
                                                        destructuring_bind_must_consp(current_101, datum_100, $list_alt26);
                                                        date_tag = current_101.first();
                                                        current_101 = current_101.rest();
                                                        destructuring_bind_must_consp(current_101, datum_100, $list_alt26);
                                                        date_mt = current_101.first();
                                                        current_101 = current_101.rest();
                                                        destructuring_bind_must_consp(current_101, datum_100, $list_alt26);
                                                        link_date = current_101.first();
                                                        current_101 = current_101.rest();
                                                        {
                                                            SubLObject link_supports = (current_101.isCons()) ? ((SubLObject) (current_101.first())) : NIL;
                                                            destructuring_bind_must_listp(current_101, datum_100, $list_alt26);
                                                            current_101 = current_101.rest();
                                                            if (NIL == current_101) {
                                                                {
                                                                    SubLObject datum_102 = link1;
                                                                    SubLObject current_103 = datum_102;
                                                                    SubLObject node_tag = NIL;
                                                                    SubLObject node_mt = NIL;
                                                                    SubLObject node = NIL;
                                                                    destructuring_bind_must_consp(current_103, datum_102, $list_alt27);
                                                                    node_tag = current_103.first();
                                                                    current_103 = current_103.rest();
                                                                    destructuring_bind_must_consp(current_103, datum_102, $list_alt27);
                                                                    node_mt = current_103.first();
                                                                    current_103 = current_103.rest();
                                                                    destructuring_bind_must_consp(current_103, datum_102, $list_alt27);
                                                                    node = current_103.first();
                                                                    current_103 = current_103.rest();
                                                                    {
                                                                        SubLObject link_supports_104 = (current_103.isCons()) ? ((SubLObject) (current_103.first())) : NIL;
                                                                        destructuring_bind_must_listp(current_103, datum_102, $list_alt27);
                                                                        current_103 = current_103.rest();
                                                                        if (NIL == current_103) {
                                                                            {
                                                                                SubLObject succession_depth = (NIL != sbhl_time_dates.sbhl_dateE(date, link_date)) ? ((SubLObject) (add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node_tag)))) : sbhl_time_vars.sbhl_temporality_date_succession();
                                                                                SubLTrampolineFile.checkType(succession_depth, INTEGERP);
                                                                                {
                                                                                    SubLObject _prev_bind_0_105 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_106 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(succession_depth, thread);
                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                        results = nconc(results, sbhl_search_methods.sbhl_transitive_closure(node));
                                                                                    } finally {
                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_1_106, thread);
                                                                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_105, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum_102, $list_alt27);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                cdestructuring_bind_error(datum_100, $list_alt26);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt25);
                                                }
                                            }
                                        }
                                        done_var = sublisp_null(raw_links);
                                    }
                                } 
                            }
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject all_precedes_date(final SubLObject date, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT, thread);
            SubLObject date2 = NIL;
            SubLObject date3 = NIL;
            if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) {
                date2 = date;
                date3 = NIL;
            } else {
                date2 = NIL;
                date3 = date;
            }
            final SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_date_link_iterator(date2, date3, sbhl_link_vars.get_sbhl_link_direction());
            SubLObject raw_links;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = sublisp_null(raw_links)) {
                raw_links = sbhl_iteration_next(iterator);
                if (NIL != raw_links) {
                    SubLObject current;
                    final SubLObject datum = current = raw_links;
                    SubLObject link0 = NIL;
                    SubLObject link2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list25);
                    link0 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list25);
                    link2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject current_$101;
                        final SubLObject datum_$100 = current_$101 = link0;
                        SubLObject date_tag = NIL;
                        SubLObject date_mt = NIL;
                        SubLObject link_date = NIL;
                        destructuring_bind_must_consp(current_$101, datum_$100, $list26);
                        date_tag = current_$101.first();
                        current_$101 = current_$101.rest();
                        destructuring_bind_must_consp(current_$101, datum_$100, $list26);
                        date_mt = current_$101.first();
                        current_$101 = current_$101.rest();
                        destructuring_bind_must_consp(current_$101, datum_$100, $list26);
                        link_date = current_$101.first();
                        current_$101 = current_$101.rest();
                        final SubLObject link_supports = (current_$101.isCons()) ? current_$101.first() : NIL;
                        destructuring_bind_must_listp(current_$101, datum_$100, $list26);
                        current_$101 = current_$101.rest();
                        if (NIL == current_$101) {
                            SubLObject current_$102;
                            final SubLObject datum_$101 = current_$102 = link2;
                            SubLObject node_tag = NIL;
                            SubLObject node_mt = NIL;
                            SubLObject node = NIL;
                            destructuring_bind_must_consp(current_$102, datum_$101, $list27);
                            node_tag = current_$102.first();
                            current_$102 = current_$102.rest();
                            destructuring_bind_must_consp(current_$102, datum_$101, $list27);
                            node_mt = current_$102.first();
                            current_$102 = current_$102.rest();
                            destructuring_bind_must_consp(current_$102, datum_$101, $list27);
                            node = current_$102.first();
                            current_$102 = current_$102.rest();
                            final SubLObject link_supports_$104 = (current_$102.isCons()) ? current_$102.first() : NIL;
                            destructuring_bind_must_listp(current_$102, datum_$101, $list27);
                            current_$102 = current_$102.rest();
                            if (NIL == current_$102) {
                                final SubLObject succession_depth = (NIL != sbhl_time_dates.sbhl_dateE(date, link_date)) ? add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node_tag)) : sbhl_time_vars.sbhl_temporality_date_succession();
                                assert NIL != integerp(succession_depth) : "! integerp(succession_depth) " + ("Types.integerp(succession_depth) " + "CommonSymbols.NIL != Types.integerp(succession_depth) ") + succession_depth;
                                final SubLObject _prev_bind_0_$105 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$106 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                try {
                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(succession_depth, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    results = nconc(results, sbhl_search_methods.sbhl_transitive_closure(node));
                                } finally {
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_1_$106, thread);
                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$105, thread);
                                }
                            } else {
                                cdestructuring_bind_error(datum_$101, $list27);
                            }
                        } else {
                            cdestructuring_bind_error(datum_$100, $list26);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list25);
                    }
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject all_precedes_node_alt(SubLObject node, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                        sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT, thread);
                        SubLTrampolineFile.checkType(depth, INTEGERP);
                        {
                            SubLObject _prev_bind_0_107 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                            try {
                                sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                                results = sbhl_search_methods.sbhl_transitive_closure(node);
                            } finally {
                                sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_107, thread);
                            }
                        }
                        thread.resetMultipleValues();
                        {
                            SubLObject initial_node = sbhl_time_dates.sbhl_time_date_find_search_node(node, UNPROVIDED, UNPROVIDED);
                            SubLObject initial_date = thread.secondMultipleValue();
                            SubLObject initial_tag = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != initial_node) {
                                {
                                    SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_link_iterator(initial_node, sbhl_link_vars.get_sbhl_link_direction(), NIL, NIL);
                                    SubLObject done_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject raw_links = sbhl_iteration_next(iterator);
                                            if (NIL != raw_links) {
                                                {
                                                    SubLObject datum = raw_links;
                                                    SubLObject current = datum;
                                                    SubLObject link0 = NIL;
                                                    SubLObject link1 = NIL;
                                                    SubLObject link2 = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt28);
                                                    link0 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt28);
                                                    link1 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt28);
                                                    link2 = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        {
                                                            SubLObject datum_108 = link0;
                                                            SubLObject current_109 = datum_108;
                                                            SubLObject date_tag = NIL;
                                                            SubLObject date_mt = NIL;
                                                            SubLObject date_date = NIL;
                                                            destructuring_bind_must_consp(current_109, datum_108, $list_alt29);
                                                            date_tag = current_109.first();
                                                            current_109 = current_109.rest();
                                                            destructuring_bind_must_consp(current_109, datum_108, $list_alt29);
                                                            date_mt = current_109.first();
                                                            current_109 = current_109.rest();
                                                            destructuring_bind_must_consp(current_109, datum_108, $list_alt29);
                                                            date_date = current_109.first();
                                                            current_109 = current_109.rest();
                                                            {
                                                                SubLObject link_supports = (current_109.isCons()) ? ((SubLObject) (current_109.first())) : NIL;
                                                                destructuring_bind_must_listp(current_109, datum_108, $list_alt29);
                                                                current_109 = current_109.rest();
                                                                if (NIL == current_109) {
                                                                    {
                                                                        SubLObject datum_110 = link1;
                                                                        SubLObject current_111 = datum_110;
                                                                        SubLObject int_tag = NIL;
                                                                        SubLObject int_mt = NIL;
                                                                        SubLObject int_date = NIL;
                                                                        destructuring_bind_must_consp(current_111, datum_110, $list_alt30);
                                                                        int_tag = current_111.first();
                                                                        current_111 = current_111.rest();
                                                                        destructuring_bind_must_consp(current_111, datum_110, $list_alt30);
                                                                        int_mt = current_111.first();
                                                                        current_111 = current_111.rest();
                                                                        destructuring_bind_must_consp(current_111, datum_110, $list_alt30);
                                                                        int_date = current_111.first();
                                                                        current_111 = current_111.rest();
                                                                        {
                                                                            SubLObject link_supports_112 = (current_111.isCons()) ? ((SubLObject) (current_111.first())) : NIL;
                                                                            destructuring_bind_must_listp(current_111, datum_110, $list_alt30);
                                                                            current_111 = current_111.rest();
                                                                            if (NIL == current_111) {
                                                                                {
                                                                                    SubLObject datum_113 = link2;
                                                                                    SubLObject current_114 = datum_113;
                                                                                    SubLObject link_tag = NIL;
                                                                                    SubLObject link_mt = NIL;
                                                                                    SubLObject link_node = NIL;
                                                                                    destructuring_bind_must_consp(current_114, datum_113, $list_alt31);
                                                                                    link_tag = current_114.first();
                                                                                    current_114 = current_114.rest();
                                                                                    destructuring_bind_must_consp(current_114, datum_113, $list_alt31);
                                                                                    link_mt = current_114.first();
                                                                                    current_114 = current_114.rest();
                                                                                    destructuring_bind_must_consp(current_114, datum_113, $list_alt31);
                                                                                    link_node = current_114.first();
                                                                                    current_114 = current_114.rest();
                                                                                    {
                                                                                        SubLObject link_supports_115 = (current_114.isCons()) ? ((SubLObject) (current_114.first())) : NIL;
                                                                                        destructuring_bind_must_listp(current_114, datum_113, $list_alt31);
                                                                                        current_114 = current_114.rest();
                                                                                        if (NIL == current_114) {
                                                                                            {
                                                                                                SubLObject succession_depth = (NIL != sbhl_time_dates.sbhl_dateE(date_date, int_date)) ? ((SubLObject) (add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(date_tag), sbhl_marking_utilities.sbhl_temporal_tag_increment(link_tag)))) : sbhl_time_vars.sbhl_temporality_date_succession();
                                                                                                SubLTrampolineFile.checkType(succession_depth, INTEGERP);
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_116 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_117 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(succession_depth, thread);
                                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                                        results = nconc(results, sbhl_search_methods.sbhl_transitive_closure(link_node));
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_1_117, thread);
                                                                                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_116, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            cdestructuring_bind_error(datum_113, $list_alt31);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum_110, $list_alt30);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum_108, $list_alt29);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt28);
                                                    }
                                                }
                                            }
                                            done_var = sublisp_null(raw_links);
                                        }
                                    } 
                                }
                            }
                        }
                    } finally {
                        sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject all_precedes_node(final SubLObject node, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT, thread);
            assert NIL != integerp(depth) : "! integerp(depth) " + ("Types.integerp(depth) " + "CommonSymbols.NIL != Types.integerp(depth) ") + depth;
            final SubLObject _prev_bind_0_$107 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
            try {
                sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                results = sbhl_search_methods.sbhl_transitive_closure(node);
            } finally {
                sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$107, thread);
            }
            thread.resetMultipleValues();
            final SubLObject initial_node = sbhl_time_dates.sbhl_time_date_find_search_node(node, UNPROVIDED, UNPROVIDED);
            final SubLObject initial_date = thread.secondMultipleValue();
            final SubLObject initial_tag = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != initial_node) {
                final SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_link_iterator(initial_node, sbhl_link_vars.get_sbhl_link_direction(), NIL, NIL);
                SubLObject raw_links;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = sublisp_null(raw_links)) {
                    raw_links = sbhl_iteration_next(iterator);
                    if (NIL != raw_links) {
                        SubLObject current;
                        final SubLObject datum = current = raw_links;
                        SubLObject link0 = NIL;
                        SubLObject link2 = NIL;
                        SubLObject link3 = NIL;
                        destructuring_bind_must_consp(current, datum, $list28);
                        link0 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list28);
                        link2 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list28);
                        link3 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            SubLObject current_$109;
                            final SubLObject datum_$108 = current_$109 = link0;
                            SubLObject date_tag = NIL;
                            SubLObject date_mt = NIL;
                            SubLObject date_date = NIL;
                            destructuring_bind_must_consp(current_$109, datum_$108, $list29);
                            date_tag = current_$109.first();
                            current_$109 = current_$109.rest();
                            destructuring_bind_must_consp(current_$109, datum_$108, $list29);
                            date_mt = current_$109.first();
                            current_$109 = current_$109.rest();
                            destructuring_bind_must_consp(current_$109, datum_$108, $list29);
                            date_date = current_$109.first();
                            current_$109 = current_$109.rest();
                            final SubLObject link_supports = (current_$109.isCons()) ? current_$109.first() : NIL;
                            destructuring_bind_must_listp(current_$109, datum_$108, $list29);
                            current_$109 = current_$109.rest();
                            if (NIL == current_$109) {
                                SubLObject current_$110;
                                final SubLObject datum_$109 = current_$110 = link2;
                                SubLObject int_tag = NIL;
                                SubLObject int_mt = NIL;
                                SubLObject int_date = NIL;
                                destructuring_bind_must_consp(current_$110, datum_$109, $list30);
                                int_tag = current_$110.first();
                                current_$110 = current_$110.rest();
                                destructuring_bind_must_consp(current_$110, datum_$109, $list30);
                                int_mt = current_$110.first();
                                current_$110 = current_$110.rest();
                                destructuring_bind_must_consp(current_$110, datum_$109, $list30);
                                int_date = current_$110.first();
                                current_$110 = current_$110.rest();
                                final SubLObject link_supports_$112 = (current_$110.isCons()) ? current_$110.first() : NIL;
                                destructuring_bind_must_listp(current_$110, datum_$109, $list30);
                                current_$110 = current_$110.rest();
                                if (NIL == current_$110) {
                                    SubLObject current_$111;
                                    final SubLObject datum_$110 = current_$111 = link3;
                                    SubLObject link_tag = NIL;
                                    SubLObject link_mt = NIL;
                                    SubLObject link_node = NIL;
                                    destructuring_bind_must_consp(current_$111, datum_$110, $list31);
                                    link_tag = current_$111.first();
                                    current_$111 = current_$111.rest();
                                    destructuring_bind_must_consp(current_$111, datum_$110, $list31);
                                    link_mt = current_$111.first();
                                    current_$111 = current_$111.rest();
                                    destructuring_bind_must_consp(current_$111, datum_$110, $list31);
                                    link_node = current_$111.first();
                                    current_$111 = current_$111.rest();
                                    final SubLObject link_supports_$113 = (current_$111.isCons()) ? current_$111.first() : NIL;
                                    destructuring_bind_must_listp(current_$111, datum_$110, $list31);
                                    current_$111 = current_$111.rest();
                                    if (NIL == current_$111) {
                                        final SubLObject succession_depth = (NIL != sbhl_time_dates.sbhl_dateE(date_date, int_date)) ? add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(date_tag), sbhl_marking_utilities.sbhl_temporal_tag_increment(link_tag)) : sbhl_time_vars.sbhl_temporality_date_succession();
                                        assert NIL != integerp(succession_depth) : "! integerp(succession_depth) " + ("Types.integerp(succession_depth) " + "CommonSymbols.NIL != Types.integerp(succession_depth) ") + succession_depth;
                                        final SubLObject _prev_bind_0_$108 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$117 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        try {
                                            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(succession_depth, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                            results = nconc(results, sbhl_search_methods.sbhl_transitive_closure(link_node));
                                        } finally {
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_1_$117, thread);
                                            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$108, thread);
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum_$110, $list31);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum_$109, $list30);
                                }
                            } else {
                                cdestructuring_bind_error(datum_$108, $list29);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list28);
                        }
                    }
                }
            }
        } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject all_coordinate_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_forward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), ZERO_INTEGER, node, node, mt, UNPROVIDED);
    }

    public static SubLObject all_coordinate(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_temporality_all_forward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), ZERO_INTEGER, node, node, mt, UNPROVIDED);
    }

    public static final SubLObject all_successors_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_forward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), MINUS_ONE_INTEGER, node, node, mt, UNPROVIDED);
    }

    public static SubLObject all_successors(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_temporality_all_forward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), MINUS_ONE_INTEGER, node, node, mt, UNPROVIDED);
    }

    public static final SubLObject all_predecessors_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_backward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), MINUS_ONE_INTEGER, node, node, mt, UNPROVIDED);
    }

    public static SubLObject all_predecessors(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_temporality_all_backward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), MINUS_ONE_INTEGER, node, node, mt, UNPROVIDED);
    }

    public static final SubLObject all_successors_successors_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_forward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), $int$_2, node, node, mt, UNPROVIDED);
    }

    public static SubLObject all_successors_successors(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_temporality_all_forward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), $int$_2, node, node, mt, UNPROVIDED);
    }

    public static final SubLObject all_predecessors_predecessors_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_backward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), $int$_2, node, node, mt, UNPROVIDED);
    }

    public static SubLObject all_predecessors_predecessors(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_temporality_all_backward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), $int$_2, node, node, mt, UNPROVIDED);
    }

    public static final SubLObject all_between_alt(SubLObject marking_depth, SubLObject searching_depth, SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_forward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), marking_depth, before, after, mt, searching_depth);
    }

    public static SubLObject all_between(final SubLObject marking_depth, final SubLObject searching_depth, final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_temporality_all_forward_nodes_between(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), marking_depth, before, after, mt, searching_depth);
    }

    public static final SubLObject sbhl_temporality_all_forward_nodes_between_alt(SubLObject module, SubLObject depth, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject search_depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (search_depth == UNPROVIDED) {
            search_depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_118 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_119 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_120 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_121 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_122 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_123 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_124 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_125 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_126 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_127 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_128 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_129 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_130 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_131 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_132 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            result = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between(depth, node1, node2, search_depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_132, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_131, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_130, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_129, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_128, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_127, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_126, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_125, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_124, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_123, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_122, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_121, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_120, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_119, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_118, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sbhl_temporality_all_forward_nodes_between(final SubLObject module, final SubLObject depth, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject search_depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (search_depth == UNPROVIDED) {
            search_depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$118 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$119 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$120 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$119 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$120 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$120 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$121 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$121 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$121 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$122 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$122 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$122 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$131 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$132 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        result = sbhl_temporality_all_nodes_accessed_between(depth, node1, node2, search_depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$132, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$131, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$122, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$122, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$123, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$122, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$121, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$121, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$121, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$120, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$120, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$119, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$120, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$119, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$118, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sbhl_temporality_all_backward_nodes_between_alt(SubLObject module, SubLObject depth, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject search_depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (search_depth == UNPROVIDED) {
            search_depth = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_133 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_134 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_135 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_136 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_137 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_138 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_139 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_140 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_141 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_142 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_143 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_144 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_145 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_146 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_147 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            result = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between(depth, node1, node2, search_depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_147, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_146, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_145, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_144, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_143, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_142, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_141, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_140, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_139, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_138, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_137, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_136, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_135, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_134, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_133, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sbhl_temporality_all_backward_nodes_between(final SubLObject module, final SubLObject depth, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject search_depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (search_depth == UNPROVIDED) {
            search_depth = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$133 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$134 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$135 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$134 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$135 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$135 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$136 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$136 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$136 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$137 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$138 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$137 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$137 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$146 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$147 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        result = sbhl_temporality_all_nodes_accessed_between(depth, node1, node2, search_depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$147, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$146, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$137, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$137, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$138, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$137, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$136, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$136, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$136, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$135, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$135, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$134, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$135, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$134, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$133, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Search method for between searches. Marks the closure of NODE1,
     * then proceeds from NODE2 in the opposite direction, Gathering those
     * nodes that were marked positive by NODE1 and are positive by NODE2's
     * marking. DEPTH sets the initial succesion depth for the first marking,
     * from NODE1. SEARCH-DEPTH sets the initial succession depth for the
     * marking proceeding from NODE2. SEARCH-DEPTH, if not provided, is
     * set to the negative of DEPTH.
     */
    @LispMethod(comment = "Search method for between searches. Marks the closure of NODE1,\r\nthen proceeds from NODE2 in the opposite direction, Gathering those\r\nnodes that were marked positive by NODE1 and are positive by NODE2\'s\r\nmarking. DEPTH sets the initial succesion depth for the first marking,\r\nfrom NODE1. SEARCH-DEPTH sets the initial succession depth for the\r\nmarking proceeding from NODE2. SEARCH-DEPTH, if not provided, is\r\nset to the negative of DEPTH.\nSearch method for between searches. Marks the closure of NODE1,\nthen proceeds from NODE2 in the opposite direction, Gathering those\nnodes that were marked positive by NODE1 and are positive by NODE2\'s\nmarking. DEPTH sets the initial succesion depth for the first marking,\nfrom NODE1. SEARCH-DEPTH sets the initial succession depth for the\nmarking proceeding from NODE2. SEARCH-DEPTH, if not provided, is\nset to the negative of DEPTH.")
    public static final SubLObject sbhl_temporality_all_nodes_accessed_between_alt(SubLObject depth, SubLObject node1, SubLObject node2, SubLObject search_depth) {
        if (search_depth == UNPROVIDED) {
            search_depth = NIL;
        }
        if (NIL == search_depth) {
            search_depth = minus(depth);
        }
        {
            SubLObject node1_date = (NIL != sbhl_time_utilities.hl_date_point_p(node1)) ? ((SubLObject) (sbhl_time_utilities.hl_interval_of_endpoint(node1))) : NIL;
            SubLObject node2_date = (NIL != sbhl_time_utilities.hl_date_point_p(node2)) ? ((SubLObject) (sbhl_time_utilities.hl_interval_of_endpoint(node2))) : NIL;
            if ((NIL != node1_date) && (NIL != node2_date)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between_dates(depth, node1_date, node2_date, search_depth);
            } else {
                if (NIL != node1_date) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between_date_node(depth, node1_date, node2, search_depth);
                } else {
                    if (NIL != node2_date) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between_node_date(depth, node1, node2_date, search_depth);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between_nodes(depth, node1, node2, search_depth);
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Search method for between searches. Marks the closure of NODE1,\r\nthen proceeds from NODE2 in the opposite direction, Gathering those\r\nnodes that were marked positive by NODE1 and are positive by NODE2\'s\r\nmarking. DEPTH sets the initial succesion depth for the first marking,\r\nfrom NODE1. SEARCH-DEPTH sets the initial succession depth for the\r\nmarking proceeding from NODE2. SEARCH-DEPTH, if not provided, is\r\nset to the negative of DEPTH.\nSearch method for between searches. Marks the closure of NODE1,\nthen proceeds from NODE2 in the opposite direction, Gathering those\nnodes that were marked positive by NODE1 and are positive by NODE2\'s\nmarking. DEPTH sets the initial succesion depth for the first marking,\nfrom NODE1. SEARCH-DEPTH sets the initial succession depth for the\nmarking proceeding from NODE2. SEARCH-DEPTH, if not provided, is\nset to the negative of DEPTH.")
    public static SubLObject sbhl_temporality_all_nodes_accessed_between(final SubLObject depth, final SubLObject node1, final SubLObject node2, SubLObject search_depth) {
        if (search_depth == UNPROVIDED) {
            search_depth = NIL;
        }
        if (NIL == search_depth) {
            search_depth = minus(depth);
        }
        final SubLObject node1_date = (NIL != sbhl_time_utilities.hl_date_point_p(node1)) ? sbhl_time_utilities.hl_interval_of_endpoint(node1) : NIL;
        final SubLObject node2_date = (NIL != sbhl_time_utilities.hl_date_point_p(node2)) ? sbhl_time_utilities.hl_interval_of_endpoint(node2) : NIL;
        if ((NIL != node1_date) && (NIL != node2_date)) {
            return sbhl_temporality_all_nodes_accessed_between_dates(depth, node1_date, node2_date, search_depth);
        }
        if (NIL != node1_date) {
            return sbhl_temporality_all_nodes_accessed_between_date_node(depth, node1_date, node2, search_depth);
        }
        if (NIL != node2_date) {
            return sbhl_temporality_all_nodes_accessed_between_node_date(depth, node1, node2_date, search_depth);
        }
        return sbhl_temporality_all_nodes_accessed_between_nodes(depth, node1, node2, search_depth);
    }/**
     * Search method for between searches. Marks the closure of NODE1,
     * then proceeds from NODE2 in the opposite direction, Gathering those
     * nodes that were marked positive by NODE1 and are positive by NODE2's
     * marking. DEPTH sets the initial succesion depth for the first marking,
     * from NODE1. SEARCH-DEPTH sets the initial succession depth for the
     * marking proceeding from NODE2. SEARCH-DEPTH, if not provided, is
     * set to the negative of DEPTH.
     */


    public static final SubLObject sbhl_temporality_all_nodes_accessed_between_dates_alt(SubLObject depth, SubLObject date1, SubLObject date2, SubLObject search_depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject _prev_bind_0_148 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                results = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between_dates_int(depth, date1, date2, search_depth);
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_148, thread);
                            }
                        }
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    } finally {
                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject sbhl_temporality_all_nodes_accessed_between_dates(final SubLObject depth, final SubLObject date1, final SubLObject date2, final SubLObject search_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$148 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                    results = sbhl_temporality_all_nodes_accessed_between_dates_int(depth, date1, date2, search_depth);
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$148, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$149 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$149, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject sbhl_temporality_all_nodes_accessed_between_dates_int_alt(SubLObject depth, SubLObject date1, SubLObject date2, SubLObject search_depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                if (((NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) && (NIL != sbhl_time_dates.sbhl_dateLE(date1, date2))) || ((NIL != sbhl_link_vars.sbhl_backward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) && (NIL != sbhl_time_dates.sbhl_dateGE(date1, date2)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject earlier = (NIL != sbhl_time_dates.sbhl_dateLE(date1, date2)) ? ((SubLObject) (values(date1, date2))) : values(date2, date1);
                        SubLObject later = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_date_link_iterator(earlier, later, sbhl_link_vars.get_sbhl_link_direction());
                            SubLObject done_var = NIL;
                            while (NIL == done_var) {
                                {
                                    SubLObject raw_links = sbhl_iteration_next(iterator);
                                    if (NIL != raw_links) {
                                        {
                                            SubLObject datum = raw_links;
                                            SubLObject current = datum;
                                            SubLObject link0 = NIL;
                                            SubLObject link1 = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt25);
                                            link0 = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt25);
                                            link1 = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                {
                                                    SubLObject datum_149 = link0;
                                                    SubLObject current_150 = datum_149;
                                                    SubLObject date_tag = NIL;
                                                    SubLObject date_mt = NIL;
                                                    SubLObject date = NIL;
                                                    destructuring_bind_must_consp(current_150, datum_149, $list_alt33);
                                                    date_tag = current_150.first();
                                                    current_150 = current_150.rest();
                                                    destructuring_bind_must_consp(current_150, datum_149, $list_alt33);
                                                    date_mt = current_150.first();
                                                    current_150 = current_150.rest();
                                                    destructuring_bind_must_consp(current_150, datum_149, $list_alt33);
                                                    date = current_150.first();
                                                    current_150 = current_150.rest();
                                                    {
                                                        SubLObject link_supports = (current_150.isCons()) ? ((SubLObject) (current_150.first())) : NIL;
                                                        destructuring_bind_must_listp(current_150, datum_149, $list_alt33);
                                                        current_150 = current_150.rest();
                                                        if (NIL == current_150) {
                                                            {
                                                                SubLObject datum_151 = link1;
                                                                SubLObject current_152 = datum_151;
                                                                SubLObject node_tag = NIL;
                                                                SubLObject node_mt = NIL;
                                                                SubLObject node = NIL;
                                                                destructuring_bind_must_consp(current_152, datum_151, $list_alt27);
                                                                node_tag = current_152.first();
                                                                current_152 = current_152.rest();
                                                                destructuring_bind_must_consp(current_152, datum_151, $list_alt27);
                                                                node_mt = current_152.first();
                                                                current_152 = current_152.rest();
                                                                destructuring_bind_must_consp(current_152, datum_151, $list_alt27);
                                                                node = current_152.first();
                                                                current_152 = current_152.rest();
                                                                {
                                                                    SubLObject link_supports_153 = (current_152.isCons()) ? ((SubLObject) (current_152.first())) : NIL;
                                                                    destructuring_bind_must_listp(current_152, datum_151, $list_alt27);
                                                                    current_152 = current_152.rest();
                                                                    if (NIL == current_152) {
                                                                        {
                                                                            SubLObject succession_depth = (NIL != sbhl_time_dates.sbhl_date_betweenP(date, earlier, later, T)) ? ((SubLObject) (sbhl_time_vars.sbhl_temporality_date_succession())) : add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node_tag));
                                                                            SubLTrampolineFile.checkType(succession_depth, INTEGERP);
                                                                            {
                                                                                SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(succession_depth, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_marking_methods.sbhl_mark_closure_as_marked(node);
                                                                                } finally {
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_1, thread);
                                                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum_151, $list_alt27);
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum_149, $list_alt33);
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt25);
                                            }
                                        }
                                    }
                                    done_var = sublisp_null(raw_links);
                                }
                            } 
                        }
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject _prev_bind_0_154 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject _prev_bind_0_155 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                            try {
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                                sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.bind(T, thread);
                                                sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT, thread);
                                                {
                                                    SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_date_link_iterator(earlier, later, sbhl_link_vars.get_sbhl_link_direction());
                                                    SubLObject done_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject raw_links = sbhl_iteration_next(iterator);
                                                            if (NIL != raw_links) {
                                                                {
                                                                    SubLObject datum = raw_links;
                                                                    SubLObject current = datum;
                                                                    SubLObject link0 = NIL;
                                                                    SubLObject link1 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt25);
                                                                    link0 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt25);
                                                                    link1 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        {
                                                                            SubLObject datum_156 = link0;
                                                                            SubLObject current_157 = datum_156;
                                                                            SubLObject date_tag = NIL;
                                                                            SubLObject date_mt = NIL;
                                                                            SubLObject date = NIL;
                                                                            destructuring_bind_must_consp(current_157, datum_156, $list_alt33);
                                                                            date_tag = current_157.first();
                                                                            current_157 = current_157.rest();
                                                                            destructuring_bind_must_consp(current_157, datum_156, $list_alt33);
                                                                            date_mt = current_157.first();
                                                                            current_157 = current_157.rest();
                                                                            destructuring_bind_must_consp(current_157, datum_156, $list_alt33);
                                                                            date = current_157.first();
                                                                            current_157 = current_157.rest();
                                                                            {
                                                                                SubLObject link_supports = (current_157.isCons()) ? ((SubLObject) (current_157.first())) : NIL;
                                                                                destructuring_bind_must_listp(current_157, datum_156, $list_alt33);
                                                                                current_157 = current_157.rest();
                                                                                if (NIL == current_157) {
                                                                                    {
                                                                                        SubLObject datum_158 = link1;
                                                                                        SubLObject current_159 = datum_158;
                                                                                        SubLObject node_tag = NIL;
                                                                                        SubLObject node_mt = NIL;
                                                                                        SubLObject node = NIL;
                                                                                        destructuring_bind_must_consp(current_159, datum_158, $list_alt27);
                                                                                        node_tag = current_159.first();
                                                                                        current_159 = current_159.rest();
                                                                                        destructuring_bind_must_consp(current_159, datum_158, $list_alt27);
                                                                                        node_mt = current_159.first();
                                                                                        current_159 = current_159.rest();
                                                                                        destructuring_bind_must_consp(current_159, datum_158, $list_alt27);
                                                                                        node = current_159.first();
                                                                                        current_159 = current_159.rest();
                                                                                        {
                                                                                            SubLObject link_supports_160 = (current_159.isCons()) ? ((SubLObject) (current_159.first())) : NIL;
                                                                                            destructuring_bind_must_listp(current_159, datum_158, $list_alt27);
                                                                                            current_159 = current_159.rest();
                                                                                            if (NIL == current_159) {
                                                                                                {
                                                                                                    SubLObject succession_depth = (NIL != sbhl_time_dates.sbhl_date_betweenP(date, earlier, later, T)) ? ((SubLObject) (sbhl_time_vars.sbhl_temporality_date_succession())) : add(search_depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node_tag));
                                                                                                    SubLTrampolineFile.checkType(succession_depth, INTEGERP);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_161 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_162 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(succession_depth, thread);
                                                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                                            results = nconc(results, sbhl_search_methods.sbhl_transitive_closure(node));
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_1_162, thread);
                                                                                                            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_161, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum_158, $list_alt27);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    cdestructuring_bind_error(datum_156, $list_alt33);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt25);
                                                                    }
                                                                }
                                                            }
                                                            done_var = sublisp_null(raw_links);
                                                        }
                                                    } 
                                                }
                                            } finally {
                                                sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
                                                sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.rebind(_prev_bind_1, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_155, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_154, thread);
                                    }
                                }
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(results, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject sbhl_temporality_all_nodes_accessed_between_dates_int(final SubLObject depth, final SubLObject date1, final SubLObject date2, final SubLObject search_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        if (((NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) && (NIL != sbhl_time_dates.sbhl_dateLE(date1, date2))) || ((NIL != sbhl_link_vars.sbhl_backward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) && (NIL != sbhl_time_dates.sbhl_dateGE(date1, date2)))) {
            thread.resetMultipleValues();
            final SubLObject earlier = (NIL != sbhl_time_dates.sbhl_dateLE(date1, date2)) ? values(date1, date2) : values(date2, date1);
            final SubLObject later = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject iterator = sbhl_time_dates.new_sbhl_time_date_date_link_iterator(earlier, later, sbhl_link_vars.get_sbhl_link_direction());
            SubLObject raw_links;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = sublisp_null(raw_links)) {
                raw_links = sbhl_iteration_next(iterator);
                if (NIL != raw_links) {
                    SubLObject current;
                    final SubLObject datum = current = raw_links;
                    SubLObject link0 = NIL;
                    SubLObject link2 = NIL;
                    destructuring_bind_must_consp(current, datum, $list25);
                    link0 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list25);
                    link2 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject current_$151;
                        final SubLObject datum_$150 = current_$151 = link0;
                        SubLObject date_tag = NIL;
                        SubLObject date_mt = NIL;
                        SubLObject date3 = NIL;
                        destructuring_bind_must_consp(current_$151, datum_$150, $list33);
                        date_tag = current_$151.first();
                        current_$151 = current_$151.rest();
                        destructuring_bind_must_consp(current_$151, datum_$150, $list33);
                        date_mt = current_$151.first();
                        current_$151 = current_$151.rest();
                        destructuring_bind_must_consp(current_$151, datum_$150, $list33);
                        date3 = current_$151.first();
                        current_$151 = current_$151.rest();
                        final SubLObject link_supports = (current_$151.isCons()) ? current_$151.first() : NIL;
                        destructuring_bind_must_listp(current_$151, datum_$150, $list33);
                        current_$151 = current_$151.rest();
                        if (NIL == current_$151) {
                            SubLObject current_$152;
                            final SubLObject datum_$151 = current_$152 = link2;
                            SubLObject node_tag = NIL;
                            SubLObject node_mt = NIL;
                            SubLObject node = NIL;
                            destructuring_bind_must_consp(current_$152, datum_$151, $list27);
                            node_tag = current_$152.first();
                            current_$152 = current_$152.rest();
                            destructuring_bind_must_consp(current_$152, datum_$151, $list27);
                            node_mt = current_$152.first();
                            current_$152 = current_$152.rest();
                            destructuring_bind_must_consp(current_$152, datum_$151, $list27);
                            node = current_$152.first();
                            current_$152 = current_$152.rest();
                            final SubLObject link_supports_$154 = (current_$152.isCons()) ? current_$152.first() : NIL;
                            destructuring_bind_must_listp(current_$152, datum_$151, $list27);
                            current_$152 = current_$152.rest();
                            if (NIL == current_$152) {
                                final SubLObject succession_depth = (NIL != sbhl_time_dates.sbhl_date_betweenP(date3, earlier, later, T)) ? sbhl_time_vars.sbhl_temporality_date_succession() : add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node_tag));
                                assert NIL != integerp(succession_depth) : "! integerp(succession_depth) " + ("Types.integerp(succession_depth) " + "CommonSymbols.NIL != Types.integerp(succession_depth) ") + succession_depth;
                                final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                try {
                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(succession_depth, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_marking_methods.sbhl_mark_closure_as_marked(node);
                                } finally {
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2, thread);
                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0, thread);
                                }
                            } else {
                                cdestructuring_bind_error(datum_$151, $list27);
                            }
                        } else {
                            cdestructuring_bind_error(datum_$150, $list33);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list25);
                    }
                }
            }
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$155 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$156 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                            try {
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.bind(T, thread);
                                sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT, thread);
                                final SubLObject iterator2 = sbhl_time_dates.new_sbhl_time_date_date_link_iterator(earlier, later, sbhl_link_vars.get_sbhl_link_direction());
                                SubLObject raw_links2;
                                for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = sublisp_null(raw_links2)) {
                                    raw_links2 = sbhl_iteration_next(iterator2);
                                    if (NIL != raw_links2) {
                                        SubLObject current2;
                                        final SubLObject datum2 = current2 = raw_links2;
                                        SubLObject link3 = NIL;
                                        SubLObject link4 = NIL;
                                        destructuring_bind_must_consp(current2, datum2, $list25);
                                        link3 = current2.first();
                                        current2 = current2.rest();
                                        destructuring_bind_must_consp(current2, datum2, $list25);
                                        link4 = current2.first();
                                        current2 = current2.rest();
                                        if (NIL == current2) {
                                            SubLObject current_$153;
                                            final SubLObject datum_$152 = current_$153 = link3;
                                            SubLObject date_tag2 = NIL;
                                            SubLObject date_mt2 = NIL;
                                            SubLObject date4 = NIL;
                                            destructuring_bind_must_consp(current_$153, datum_$152, $list33);
                                            date_tag2 = current_$153.first();
                                            current_$153 = current_$153.rest();
                                            destructuring_bind_must_consp(current_$153, datum_$152, $list33);
                                            date_mt2 = current_$153.first();
                                            current_$153 = current_$153.rest();
                                            destructuring_bind_must_consp(current_$153, datum_$152, $list33);
                                            date4 = current_$153.first();
                                            current_$153 = current_$153.rest();
                                            final SubLObject link_supports2 = (current_$153.isCons()) ? current_$153.first() : NIL;
                                            destructuring_bind_must_listp(current_$153, datum_$152, $list33);
                                            current_$153 = current_$153.rest();
                                            if (NIL == current_$153) {
                                                SubLObject current_$154;
                                                final SubLObject datum_$153 = current_$154 = link4;
                                                SubLObject node_tag2 = NIL;
                                                SubLObject node_mt2 = NIL;
                                                SubLObject node2 = NIL;
                                                destructuring_bind_must_consp(current_$154, datum_$153, $list27);
                                                node_tag2 = current_$154.first();
                                                current_$154 = current_$154.rest();
                                                destructuring_bind_must_consp(current_$154, datum_$153, $list27);
                                                node_mt2 = current_$154.first();
                                                current_$154 = current_$154.rest();
                                                destructuring_bind_must_consp(current_$154, datum_$153, $list27);
                                                node2 = current_$154.first();
                                                current_$154 = current_$154.rest();
                                                final SubLObject link_supports_$155 = (current_$154.isCons()) ? current_$154.first() : NIL;
                                                destructuring_bind_must_listp(current_$154, datum_$153, $list27);
                                                current_$154 = current_$154.rest();
                                                if (NIL == current_$154) {
                                                    final SubLObject succession_depth2 = (NIL != sbhl_time_dates.sbhl_date_betweenP(date4, earlier, later, T)) ? sbhl_time_vars.sbhl_temporality_date_succession() : add(search_depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node_tag2));
                                                    assert NIL != integerp(succession_depth2) : "! integerp(succession_depth2) " + ("Types.integerp(succession_depth2) " + "CommonSymbols.NIL != Types.integerp(succession_depth2) ") + succession_depth2;
                                                    final SubLObject _prev_bind_0_$157 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$163 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                    try {
                                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(succession_depth2, thread);
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                        results = nconc(results, sbhl_search_methods.sbhl_transitive_closure(node2));
                                                    } finally {
                                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_1_$163, thread);
                                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$157, thread);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum_$153, $list27);
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum_$152, $list33);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum2, $list25);
                                        }
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_5, thread);
                                sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.rebind(_prev_bind_4, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$156, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$158 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$158, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$155, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$159 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$159, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_3, thread);
            }
        }
        return list_utilities.fast_delete_duplicates(results, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject sbhl_temporality_all_nodes_accessed_between_date_node_alt(SubLObject depth, SubLObject date, SubLObject node, SubLObject search_depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                        results = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between_node_date(depth, node, date, search_depth);
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject sbhl_temporality_all_nodes_accessed_between_date_node(final SubLObject depth, final SubLObject date, final SubLObject node, final SubLObject search_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        try {
            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
            results = sbhl_temporality_all_nodes_accessed_between_node_date(depth, node, date, search_depth);
        } finally {
            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject sbhl_temporality_all_nodes_accessed_between_node_date_alt(SubLObject depth, SubLObject node, SubLObject date, SubLObject search_depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject _prev_bind_0_163 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                SubLTrampolineFile.checkType(depth, INTEGERP);
                                {
                                    SubLObject _prev_bind_0_164 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                    try {
                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                                        sbhl_marking_methods.sbhl_mark_closure_as_marked(node);
                                    } finally {
                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_164, thread);
                                    }
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject search_node = sbhl_time_dates.sbhl_time_date_find_search_node(node, UNPROVIDED, UNPROVIDED);
                                    SubLObject search_date = thread.secondMultipleValue();
                                    SubLObject search_tag = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != search_date) {
                                        {
                                            SubLObject adjusted_depth = add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag));
                                            results = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between_dates_int(adjusted_depth, search_date, date, search_depth);
                                        }
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_163, thread);
                            }
                        }
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    } finally {
                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
                    }
                }
                return results;
            }
        }
    }

    public static SubLObject sbhl_temporality_all_nodes_accessed_between_node_date(final SubLObject depth, final SubLObject node, final SubLObject date, final SubLObject search_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$166 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                    assert NIL != integerp(depth) : "! integerp(depth) " + ("Types.integerp(depth) " + "CommonSymbols.NIL != Types.integerp(depth) ") + depth;
                    final SubLObject _prev_bind_0_$167 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                        sbhl_marking_methods.sbhl_mark_closure_as_marked(node);
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$167, thread);
                    }
                    thread.resetMultipleValues();
                    final SubLObject search_node = sbhl_time_dates.sbhl_time_date_find_search_node(node, UNPROVIDED, UNPROVIDED);
                    final SubLObject search_date = thread.secondMultipleValue();
                    final SubLObject search_tag = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != search_date) {
                        final SubLObject adjusted_depth = add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag));
                        results = sbhl_temporality_all_nodes_accessed_between_dates_int(adjusted_depth, search_date, date, search_depth);
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$166, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$168 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$168, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
        }
        return results;
    }

    public static final SubLObject sbhl_temporality_all_nodes_accessed_between_nodes_alt(SubLObject depth, SubLObject node1, SubLObject node2, SubLObject search_depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject results = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                        sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject _prev_bind_0_165 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                                SubLTrampolineFile.checkType(depth, INTEGERP);
                                {
                                    SubLObject _prev_bind_0_166 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                    try {
                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                                        sbhl_marking_methods.sbhl_mark_closure_as_marked(node1);
                                        {
                                            SubLObject _prev_bind_0_167 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                            SubLObject _prev_bind_1_168 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                                sbhl_marking_methods.sbhl_mark_closure_as_marked(node2);
                                            } finally {
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_168, thread);
                                                sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_167, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_166, thread);
                                    }
                                }
                                {
                                    SubLObject node1_node = NIL;
                                    SubLObject node1_date = NIL;
                                    SubLObject node1_tag = NIL;
                                    SubLObject node2_node = NIL;
                                    SubLObject node2_date = NIL;
                                    SubLObject node2_tag = NIL;
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject node1_node_169 = sbhl_time_dates.sbhl_time_date_find_search_node(node1, UNPROVIDED, UNPROVIDED);
                                        SubLObject node1_date_170 = thread.secondMultipleValue();
                                        SubLObject node1_tag_171 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        node1_node = node1_node_169;
                                        node1_date = node1_date_170;
                                        node1_tag = node1_tag_171;
                                    }
                                    {
                                        SubLObject _prev_bind_0_172 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject node2_node_173 = sbhl_time_dates.sbhl_time_date_find_search_node(node2, UNPROVIDED, UNPROVIDED);
                                                SubLObject node2_date_174 = thread.secondMultipleValue();
                                                SubLObject node2_tag_175 = thread.thirdMultipleValue();
                                                thread.resetMultipleValues();
                                                node2_node = node2_node_173;
                                                node2_date = node2_date_174;
                                                node2_tag = node2_tag_175;
                                            }
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_172, thread);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_176 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject _prev_bind_0_177 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    {
                                                        SubLObject _prev_bind_0_178 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                            SubLTrampolineFile.checkType(search_depth, INTEGERP);
                                                            {
                                                                SubLObject _prev_bind_0_179 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_180 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_181 = sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                                                try {
                                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(search_depth, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                                                    sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.bind(T, thread);
                                                                    sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT, thread);
                                                                    results = sbhl_search_methods.sbhl_transitive_closure(node2);
                                                                } finally {
                                                                    sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_3, thread);
                                                                    sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.rebind(_prev_bind_2_181, thread);
                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_180, thread);
                                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_179, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_178, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_177, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_176, thread);
                                        }
                                    }
                                    if ((NIL != node1_date) && (NIL != node2_date)) {
                                        {
                                            SubLObject new_depth = add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node1_tag));
                                            SubLObject new_search_depth = add(search_depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node2_tag));
                                            results = nconc(results, com.cyc.cycjava.cycl.sbhl.sbhl_time_search.sbhl_temporality_all_nodes_accessed_between_dates_int(new_depth, node1_date, node2_date, new_search_depth));
                                        }
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_165, thread);
                            }
                        }
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    } finally {
                        sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
                    }
                }
                return list_utilities.fast_delete_duplicates(results, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject sbhl_temporality_all_nodes_accessed_between_nodes(final SubLObject depth, final SubLObject node1, final SubLObject node2, final SubLObject search_depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$169 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                    assert NIL != integerp(depth) : "! integerp(depth) " + ("Types.integerp(depth) " + "CommonSymbols.NIL != Types.integerp(depth) ") + depth;
                    final SubLObject _prev_bind_0_$170 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                        sbhl_marking_methods.sbhl_mark_closure_as_marked(node1);
                        final SubLObject _prev_bind_0_$171 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$172 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                            sbhl_marking_methods.sbhl_mark_closure_as_marked(node2);
                        } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$172, thread);
                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$171, thread);
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$170, thread);
                    }
                    SubLObject node1_node = NIL;
                    SubLObject node1_date = NIL;
                    SubLObject node1_tag = NIL;
                    SubLObject node2_node = NIL;
                    SubLObject node2_date = NIL;
                    SubLObject node2_tag = NIL;
                    thread.resetMultipleValues();
                    final SubLObject node1_node_$173 = sbhl_time_dates.sbhl_time_date_find_search_node(node1, UNPROVIDED, UNPROVIDED);
                    final SubLObject node1_date_$174 = thread.secondMultipleValue();
                    final SubLObject node1_tag_$175 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    node1_node = node1_node_$173;
                    node1_date = node1_date_$174;
                    node1_tag = node1_tag_$175;
                    final SubLObject _prev_bind_0_$172 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                        thread.resetMultipleValues();
                        final SubLObject node2_node_$177 = sbhl_time_dates.sbhl_time_date_find_search_node(node2, UNPROVIDED, UNPROVIDED);
                        final SubLObject node2_date_$178 = thread.secondMultipleValue();
                        final SubLObject node2_tag_$179 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        node2_node = node2_node_$177;
                        node2_date = node2_date_$178;
                        node2_tag = node2_tag_$179;
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$172, thread);
                    }
                    final SubLObject _prev_bind_0_$173 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$174 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$175 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                        assert NIL != integerp(search_depth) : "! integerp(search_depth) " + ("Types.integerp(search_depth) " + "CommonSymbols.NIL != Types.integerp(search_depth) ") + search_depth;
                                        final SubLObject _prev_bind_0_$176 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$173 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$185 = sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                        try {
                                            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(search_depth, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                            sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.bind(T, thread);
                                            sbhl_search_vars.$sbhl_consider_node_fn$.bind(SBHL_PUSH_ONTO_RESULT, thread);
                                            results = sbhl_search_methods.sbhl_transitive_closure(node2);
                                        } finally {
                                            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_4, thread);
                                            sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.rebind(_prev_bind_2_$185, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$173, thread);
                                            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$176, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_$175, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$177 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$177, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$174, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$178 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$178, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$173, thread);
                    }
                    if ((NIL != node1_date) && (NIL != node2_date)) {
                        final SubLObject new_depth = add(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node1_tag));
                        final SubLObject new_search_depth = add(search_depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(node2_tag));
                        results = nconc(results, sbhl_temporality_all_nodes_accessed_between_dates_int(new_depth, node1_date, node2_date, new_search_depth));
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$169, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$179 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(results, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject why_weakly_precedesP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return NIL;
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_before(before, after, mt, ZERO_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_after(before, after, mt, ZERO_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_node_node(before, after, mt, ZERO_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject why_weakly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return NIL;
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return why_precedesP_date_before(before, after, mt, ZERO_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return why_precedesP_date_after(before, after, mt, ZERO_INTEGER);
        }
        return why_precedesP_node_node(before, after, mt, ZERO_INTEGER);
    }

    public static final SubLObject why_strictly_precedesP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return NIL;
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_before(before, after, mt, MINUS_ONE_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_after(before, after, mt, MINUS_ONE_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_node_node(before, after, mt, MINUS_ONE_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject why_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return NIL;
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return why_precedesP_date_before(before, after, mt, MINUS_ONE_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return why_precedesP_date_after(before, after, mt, MINUS_ONE_INTEGER);
        }
        return why_precedesP_node_node(before, after, mt, MINUS_ONE_INTEGER);
    }

    public static final SubLObject why_weakly_precedes_successorP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return NIL;
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_before(before, after, mt, ONE_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_after(before, after, mt, ONE_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_node_node(before, after, mt, ONE_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject why_weakly_precedes_successorP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return NIL;
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return why_precedesP_date_before(before, after, mt, ONE_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return why_precedesP_date_after(before, after, mt, ONE_INTEGER);
        }
        return why_precedesP_node_node(before, after, mt, ONE_INTEGER);
    }

    public static final SubLObject why_successor_strictly_precedesP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return NIL;
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_before(before, after, mt, $int$_2);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_after(before, after, mt, $int$_2);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_node_node(before, after, mt, $int$_2);
                    }
                }
            }
        }
    }

    public static SubLObject why_successor_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return NIL;
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return why_precedesP_date_before(before, after, mt, $int$_2);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return why_precedesP_date_after(before, after, mt, $int$_2);
        }
        return why_precedesP_node_node(before, after, mt, $int$_2);
    }

    public static final SubLObject why_weakly_precedes_successors_successorP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return NIL;
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_before(before, after, mt, TWO_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_after(before, after, mt, TWO_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_node_node(before, after, mt, TWO_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject why_weakly_precedes_successors_successorP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return NIL;
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return why_precedesP_date_before(before, after, mt, TWO_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return why_precedesP_date_after(before, after, mt, TWO_INTEGER);
        }
        return why_precedesP_node_node(before, after, mt, TWO_INTEGER);
    }

    public static final SubLObject why_weakly_precedes_successors_successors_successorP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return NIL;
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_before(before, after, mt, THREE_INTEGER);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_after(before, after, mt, THREE_INTEGER);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_node_node(before, after, mt, THREE_INTEGER);
                    }
                }
            }
        }
    }

    public static SubLObject why_weakly_precedes_successors_successors_successorP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return NIL;
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return why_precedesP_date_before(before, after, mt, THREE_INTEGER);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return why_precedesP_date_after(before, after, mt, THREE_INTEGER);
        }
        return why_precedesP_node_node(before, after, mt, THREE_INTEGER);
    }

    public static final SubLObject why_successors_successor_strictly_precedesP_alt(SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before == after) {
            return NIL;
        } else {
            if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
                return NIL;
            } else {
                if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_before(before, after, mt, $int$_3);
                } else {
                    if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_date_after(before, after, mt, $int$_3);
                    } else {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_node_node(before, after, mt, $int$_3);
                    }
                }
            }
        }
    }

    public static SubLObject why_successors_successor_strictly_precedesP(final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (before.eql(after)) {
            return NIL;
        }
        if ((NIL != sbhl_time_utilities.hl_date_point_p(before)) && (NIL != sbhl_time_utilities.hl_date_point_p(after))) {
            return NIL;
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(before)) {
            return why_precedesP_date_before(before, after, mt, $int$_3);
        }
        if (NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return why_precedesP_date_after(before, after, mt, $int$_3);
        }
        return why_precedesP_node_node(before, after, mt, $int$_3);
    }

    public static final SubLObject why_coordinateP_alt(SubLObject node1, SubLObject node2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject just_first_half = NIL;
            SubLObject just_second_half = NIL;
            just_first_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_weakly_precedesP(node1, node2, mt);
            if (NIL != just_first_half) {
                just_second_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_weakly_precedesP(node2, node1, mt);
            }
            return (NIL != just_first_half) && (NIL != just_second_half) ? ((SubLObject) (append(just_first_half, just_second_half))) : NIL;
        }
    }

    public static SubLObject why_coordinateP(final SubLObject node1, final SubLObject node2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject just_first_half = NIL;
        SubLObject just_second_half = NIL;
        just_first_half = why_weakly_precedesP(node1, node2, mt);
        if (NIL != just_first_half) {
            just_second_half = why_weakly_precedesP(node2, node1, mt);
        }
        return (NIL != just_first_half) && (NIL != just_second_half) ? append(just_first_half, just_second_half) : NIL;
    }

    public static final SubLObject why_successorP_alt(SubLObject node, SubLObject successor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject just_first_half = NIL;
            SubLObject just_second_half = NIL;
            just_first_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_strictly_precedesP(node, successor, mt);
            if (NIL != just_first_half) {
                just_second_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_weakly_precedes_successorP(successor, node, mt);
            }
            return (NIL != just_first_half) && (NIL != just_second_half) ? ((SubLObject) (append(just_first_half, just_second_half))) : NIL;
        }
    }

    public static SubLObject why_successorP(final SubLObject node, final SubLObject successor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject just_first_half = NIL;
        SubLObject just_second_half = NIL;
        just_first_half = why_strictly_precedesP(node, successor, mt);
        if (NIL != just_first_half) {
            just_second_half = why_weakly_precedes_successorP(successor, node, mt);
        }
        return (NIL != just_first_half) && (NIL != just_second_half) ? append(just_first_half, just_second_half) : NIL;
    }

    public static final SubLObject why_predecessorP_alt(SubLObject node, SubLObject predecessor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_successorP(predecessor, node, mt);
    }

    public static SubLObject why_predecessorP(final SubLObject node, final SubLObject predecessor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return why_successorP(predecessor, node, mt);
    }

    public static final SubLObject why_successors_successorP_alt(SubLObject node, SubLObject successors_successor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject just_first_half = NIL;
            SubLObject just_second_half = NIL;
            just_first_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_successor_strictly_precedesP(node, successors_successor, mt);
            if (NIL != just_first_half) {
                just_second_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_weakly_precedes_successors_successorP(successors_successor, node, mt);
            }
            return (NIL != just_first_half) && (NIL != just_second_half) ? ((SubLObject) (append(just_first_half, just_second_half))) : NIL;
        }
    }

    public static SubLObject why_successors_successorP(final SubLObject node, final SubLObject successors_successor, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject just_first_half = NIL;
        SubLObject just_second_half = NIL;
        just_first_half = why_successor_strictly_precedesP(node, successors_successor, mt);
        if (NIL != just_first_half) {
            just_second_half = why_weakly_precedes_successors_successorP(successors_successor, node, mt);
        }
        return (NIL != just_first_half) && (NIL != just_second_half) ? append(just_first_half, just_second_half) : NIL;
    }

    public static final SubLObject why_precedesP_date_before_alt(SubLObject before, SubLObject after, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_182 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_183 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_184 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_185 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_186 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_187 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_188 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_189 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_190 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_191 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_192 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_193 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_194 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_195 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_196 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            just = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_node_date(after, sbhl_time_utilities.hl_interval_of_endpoint(before), mt, depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_196, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_195, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_194, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_193, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_192, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_191, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_190, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_189, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_188, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_187, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_186, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_185, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_184, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_183, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_182, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return just;
            }
        }
    }

    public static SubLObject why_precedesP_date_before(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            final SubLObject _prev_bind_0_$189 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$190 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$191 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$190 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$191 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$191 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$192 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$192 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$192 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$193 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$194 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$193 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$193 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$202 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$203 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        just = why_precedesP_node_date(after, sbhl_time_utilities.hl_interval_of_endpoint(before), mt, depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$203, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$202, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$193, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$193, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$194, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$193, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$192, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$192, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$192, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$191, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$191, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$190, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$191, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$190, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$189, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return just;
    }

    public static final SubLObject why_precedesP_date_after_alt(SubLObject before, SubLObject after, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_197 = mt_relevance_macros.$mt$.currentBinding(thread);
                                SubLObject _prev_bind_1_198 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_2_199 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                    {
                                        SubLObject tv_var = NIL;
                                        {
                                            SubLObject _prev_bind_0_200 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                            SubLObject _prev_bind_1_201 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                if (NIL != tv_var) {
                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            {
                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                if (pcase_var.eql($ERROR)) {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                } else {
                                                                    if (pcase_var.eql($CERROR)) {
                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($WARN)) {
                                                                            Errors.warn($str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        } else {
                                                                            Errors.warn($str_alt18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                            Errors.cerror($$$continue_anyway, $str_alt13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_202 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_203 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_204 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        {
                                                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                                            {
                                                                SubLObject _prev_bind_0_205 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                                try {
                                                                    sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_206 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? ((SubLObject) (sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                                                            {
                                                                                SubLObject _prev_bind_0_207 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_208 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_209 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_3_210 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                                SubLObject _prev_bind_4_211 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    {
                                                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                                        SubLObject needs_to_releaseP = NIL;
                                                                                        try {
                                                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                                            just = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_precedesP_node_date(before, sbhl_time_utilities.hl_interval_of_endpoint(after), mt, depth);
                                                                                        } finally {
                                                                                            if (NIL != needs_to_releaseP) {
                                                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_211, thread);
                                                                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_210, thread);
                                                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_209, thread);
                                                                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_208, thread);
                                                                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_207, thread);
                                                                                }
                                                                            }
                                                                            if (source == $RESOURCE) {
                                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            }
                                                                        } finally {
                                                                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_206, thread);
                                                                        }
                                                                    }
                                                                    if (source == $RESOURCE) {
                                                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                                    }
                                                                } finally {
                                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_205, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_204, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_203, thread);
                                                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_202, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_201, thread);
                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_200, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_199, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_198, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_197, thread);
                                }
                            }
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
                    }
                }
                return just;
            }
        }
    }

    public static SubLObject why_precedesP_date_after(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
            final SubLObject _prev_bind_0_$204 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$205 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$206 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$205 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_1_$206 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str18$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str13$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$206 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$207 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$207 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_truth$.bind($$True_JustificationTruth, thread);
                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                        final SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        final SubLObject _prev_bind_0_$207 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                            final SubLObject _prev_bind_0_$208 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(source == $OLD ? sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread) : sbhl_marking_vars.sbhl_get_new_space(source), thread);
                                final SubLObject _prev_bind_0_$209 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$208 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$208 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$217 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$218 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                    SubLObject needs_to_releaseP = NIL;
                                    try {
                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                        just = why_precedesP_node_date(before, sbhl_time_utilities.hl_interval_of_endpoint(after), mt, depth);
                                    } finally {
                                        if (NIL != needs_to_releaseP) {
                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_$218, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_$217, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_$208, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_$208, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_$209, thread);
                                }
                                if (source == $RESOURCE) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_$208, thread);
                            }
                            if (source == $RESOURCE) {
                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$207, thread);
                        }
                    } finally {
                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$207, thread);
                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_$207, thread);
                        sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_$206, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$206, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$205, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$206, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$205, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$204, thread);
            }
        } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return just;
    }

    public static final SubLObject why_precedesP_node_date_alt(SubLObject node, SubLObject date, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
                SubLObject doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue();
                        SubLObject search_depth = NIL;
                        for (search_depth = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , search_depth = csome_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject search_node = sbhl_time_dates.sbhl_time_date_find_search_node(node, mt, search_depth);
                                SubLObject search_date = thread.secondMultipleValue();
                                SubLObject search_tag = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != search_node) {
                                    if (NIL != (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()) ? ((SubLObject) (add(depth, minus(search_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)).isNegative() ? ((SubLObject) (sbhl_time_dates.sbhl_dateL(search_date, date))) : sbhl_time_dates.sbhl_dateLE(search_date, date))) : add(depth, minus(search_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)).isNegative() ? ((SubLObject) (sbhl_time_dates.sbhl_dateG(search_date, date))) : sbhl_time_dates.sbhl_dateGE(search_date, date))) {
                                        if (node != search_node) {
                                            {
                                                SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                                try {
                                                    sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind(NIL, thread);
                                                    sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL, thread);
                                                    SubLTrampolineFile.checkType(subtract(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)), INTEGERP);
                                                    {
                                                        SubLObject _prev_bind_0_212 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                        try {
                                                            sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(subtract(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)), thread);
                                                            just = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), node, search_node, mt, UNPROVIDED, UNPROVIDED))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), search_node, node, mt, UNPROVIDED, UNPROVIDED);
                                                        } finally {
                                                            sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_212, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1, thread);
                                                    sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                        {
                                            SubLObject supports = sbhl_time_dates.sbhl_time_date_node_date_link_supports(search_node, search_tag, search_date, mt);
                                            if (NIL != supports) {
                                                just = append(just, supports);
                                            }
                                        }
                                    }
                                }
                            }
                            doneP = makeBoolean((NIL != just) || search_depth.eql(depth));
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(just, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject why_precedesP_node_date(final SubLObject node, final SubLObject date, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var;
            SubLObject search_depth;
            SubLObject search_node;
            SubLObject search_date;
            SubLObject search_tag;
            SubLObject _prev_bind_0;
            SubLObject _prev_bind_2;
            SubLObject _prev_bind_0_$219;
            SubLObject supports;
            for (csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue(), search_depth = NIL, search_depth = csome_list_var.first(); (NIL == doneP) && (NIL != csome_list_var); doneP = makeBoolean((NIL != just) || search_depth.eql(depth)) , csome_list_var = csome_list_var.rest() , search_depth = csome_list_var.first()) {
                thread.resetMultipleValues();
                search_node = sbhl_time_dates.sbhl_time_date_find_search_node(node, mt, search_depth);
                search_date = thread.secondMultipleValue();
                search_tag = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != search_node) && (NIL != (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction()) ? add(depth, minus(search_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)).isNegative() ? sbhl_time_dates.sbhl_dateL(search_date, date) : sbhl_time_dates.sbhl_dateLE(search_date, date) : add(depth, minus(search_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)).isNegative() ? sbhl_time_dates.sbhl_dateG(search_date, date) : sbhl_time_dates.sbhl_dateGE(search_date, date)))) {
                    if (!node.eql(search_node)) {
                        _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding(thread);
                        _prev_bind_2 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                        try {
                            sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind(NIL, thread);
                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL, thread);
                            assert NIL != integerp(subtract(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag))) : "! integerp(Numbers.subtract(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag))) " + ("Types.integerp(Numbers.subtract(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag))) " + "CommonSymbols.NIL != Types.integerp(Numbers.subtract(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag))) ") + subtract(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag));
                            _prev_bind_0_$219 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                            try {
                                sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(subtract(depth, sbhl_marking_utilities.sbhl_temporal_tag_increment(search_tag)), thread);
                                just = (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(sbhl_link_vars.get_sbhl_link_direction())) ? why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), node, search_node, mt, UNPROVIDED, UNPROVIDED) : why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), search_node, node, mt, UNPROVIDED, UNPROVIDED);
                            } finally {
                                sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$219, thread);
                            }
                        } finally {
                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_2, thread);
                            sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    supports = sbhl_time_dates.sbhl_time_date_node_date_link_supports(search_node, search_tag, search_date, mt);
                    if (NIL != supports) {
                        just = append(just, supports);
                    }
                }
            }
        }
        return list_utilities.fast_delete_duplicates(just, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject why_precedesP_node_node_alt(SubLObject before, SubLObject after, SubLObject mt, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind(NIL, thread);
                        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL, thread);
                        SubLTrampolineFile.checkType(depth, INTEGERP);
                        {
                            SubLObject _prev_bind_0_213 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                            try {
                                sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                                just = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), before, after, mt, UNPROVIDED, UNPROVIDED);
                            } finally {
                                sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_213, thread);
                            }
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1, thread);
                        sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == just) {
                    {
                        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                            {
                                SubLObject before_doneP = NIL;
                                if (NIL == before_doneP) {
                                    {
                                        SubLObject csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue();
                                        SubLObject before_depth = NIL;
                                        for (before_depth = csome_list_var.first(); !((NIL != before_doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , before_depth = csome_list_var.first()) {
                                            {
                                                SubLObject before_node = NIL;
                                                SubLObject before_date = NIL;
                                                SubLObject before_tag = NIL;
                                                {
                                                    SubLObject _prev_bind_0_214 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject before_node_215 = sbhl_time_dates.sbhl_time_date_find_search_node(before, mt, before_depth);
                                                            SubLObject before_date_216 = thread.secondMultipleValue();
                                                            SubLObject before_tag_217 = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            before_node = before_node_215;
                                                            before_date = before_date_216;
                                                            before_tag = before_tag_217;
                                                        }
                                                    } finally {
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_214, thread);
                                                    }
                                                }
                                                if (NIL != before_date) {
                                                    {
                                                        SubLObject after_doneP = NIL;
                                                        if (NIL == after_doneP) {
                                                            {
                                                                SubLObject csome_list_var_218 = $sbhl_time_precedes_depths$.getGlobalValue();
                                                                SubLObject after_depth = NIL;
                                                                for (after_depth = csome_list_var_218.first(); !((NIL != after_doneP) || (NIL == csome_list_var_218)); csome_list_var_218 = csome_list_var_218.rest() , after_depth = csome_list_var_218.first()) {
                                                                    {
                                                                        SubLObject after_node = NIL;
                                                                        SubLObject after_date = NIL;
                                                                        SubLObject after_tag = NIL;
                                                                        {
                                                                            SubLObject _prev_bind_0_219 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject after_node_220 = sbhl_time_dates.sbhl_time_date_find_search_node(after, mt, after_depth);
                                                                                    SubLObject after_date_221 = thread.secondMultipleValue();
                                                                                    SubLObject after_tag_222 = thread.thirdMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    after_node = after_node_220;
                                                                                    after_date = after_date_221;
                                                                                    after_tag = after_tag_222;
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_219, thread);
                                                                            }
                                                                        }
                                                                        if (NIL != after_date) {
                                                                            if (NIL != (add(new SubLObject[]{ depth, minus(before_depth), minus(after_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(before_tag), sbhl_marking_utilities.sbhl_temporal_tag_increment(after_tag) }).isNegative() ? ((SubLObject) (sbhl_time_dates.sbhl_dateL(before_date, after_date))) : sbhl_time_dates.sbhl_dateLE(before_date, after_date))) {
                                                                                if (before != before_node) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_223 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind(NIL, thread);
                                                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL, thread);
                                                                                            SubLTrampolineFile.checkType(before_depth, INTEGERP);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_224 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(before_depth, thread);
                                                                                                    just = com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), before, before_node, mt, UNPROVIDED, UNPROVIDED);
                                                                                                } finally {
                                                                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_224, thread);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1, thread);
                                                                                            sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind(_prev_bind_0_223, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject _prev_bind_0_225 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                                        {
                                                                                            SubLObject supports = sbhl_time_dates.sbhl_time_date_node_date_link_supports(before_node, before_tag, before_date, mt);
                                                                                            if (NIL != supports) {
                                                                                                just = append(just, supports);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_225, thread);
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject _prev_bind_0_226 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                                                                        {
                                                                                            SubLObject supports = sbhl_time_dates.sbhl_time_date_date_node_link_supports(after_date, after_tag, after_node, mt);
                                                                                            if (NIL != supports) {
                                                                                                just = append(just, supports);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_226, thread);
                                                                                    }
                                                                                }
                                                                                if (after_node != after) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_227 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind(NIL, thread);
                                                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL, thread);
                                                                                            SubLTrampolineFile.checkType(after_depth, INTEGERP);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_228 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(after_depth, thread);
                                                                                                    just = append(just, com.cyc.cycjava.cycl.sbhl.sbhl_time_search.why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), after_node, after, mt, UNPROVIDED, UNPROVIDED));
                                                                                                } finally {
                                                                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_228, thread);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_1, thread);
                                                                                            sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind(_prev_bind_0_227, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    after_doneP = makeBoolean((NIL != just) || after_depth.eql(depth));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            before_doneP = makeBoolean((NIL != just) || before_depth.eql(depth));
                                        }
                                    }
                                }
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return list_utilities.fast_delete_duplicates(just, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject why_precedesP_node_node(final SubLObject before, final SubLObject after, final SubLObject mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind(NIL, thread);
            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL, thread);
            assert NIL != integerp(depth) : "! integerp(depth) " + ("Types.integerp(depth) " + "CommonSymbols.NIL != Types.integerp(depth) ") + depth;
            final SubLObject _prev_bind_0_$220 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
            try {
                sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(depth, thread);
                just = why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), before, after, mt, UNPROVIDED, UNPROVIDED);
            } finally {
                sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$220, thread);
            }
        } finally {
            sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_2, thread);
            sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind(_prev_bind_0, thread);
        }
        if (NIL == just) {
            _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), thread);
                SubLObject before_doneP = NIL;
                if (NIL == before_doneP) {
                    SubLObject csome_list_var;
                    SubLObject before_depth;
                    SubLObject before_node;
                    SubLObject before_date;
                    SubLObject before_tag;
                    SubLObject _prev_bind_0_$221;
                    SubLObject before_node_$222;
                    SubLObject before_date_$223;
                    SubLObject before_tag_$224;
                    SubLObject after_doneP;
                    SubLObject csome_list_var_$225;
                    SubLObject after_depth;
                    SubLObject after_node;
                    SubLObject after_date;
                    SubLObject after_tag;
                    SubLObject _prev_bind_0_$222;
                    SubLObject after_node_$227;
                    SubLObject after_date_$228;
                    SubLObject after_tag_$229;
                    SubLObject _prev_bind_0_$223;
                    SubLObject _prev_bind_3;
                    SubLObject _prev_bind_0_$224;
                    SubLObject _prev_bind_0_$225;
                    SubLObject supports;
                    SubLObject _prev_bind_0_$226;
                    SubLObject _prev_bind_0_$227;
                    SubLObject _prev_bind_0_$228;
                    for (csome_list_var = $sbhl_time_precedes_depths$.getGlobalValue(), before_depth = NIL, before_depth = csome_list_var.first(); (NIL == before_doneP) && (NIL != csome_list_var); before_doneP = makeBoolean((NIL != just) || before_depth.eql(depth)) , csome_list_var = csome_list_var.rest() , before_depth = csome_list_var.first()) {
                        before_node = NIL;
                        before_date = NIL;
                        before_tag = NIL;
                        _prev_bind_0_$221 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                        try {
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            thread.resetMultipleValues();
                            before_node_$222 = sbhl_time_dates.sbhl_time_date_find_search_node(before, mt, before_depth);
                            before_date_$223 = thread.secondMultipleValue();
                            before_tag_$224 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            before_node = before_node_$222;
                            before_date = before_date_$223;
                            before_tag = before_tag_$224;
                        } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$221, thread);
                        }
                        if (NIL != before_date) {
                            after_doneP = NIL;
                            if (NIL == after_doneP) {
                                for (csome_list_var_$225 = $sbhl_time_precedes_depths$.getGlobalValue(), after_depth = NIL, after_depth = csome_list_var_$225.first(); (NIL == after_doneP) && (NIL != csome_list_var_$225); after_doneP = makeBoolean((NIL != just) || after_depth.eql(depth)) , csome_list_var_$225 = csome_list_var_$225.rest() , after_depth = csome_list_var_$225.first()) {
                                    after_node = NIL;
                                    after_date = NIL;
                                    after_tag = NIL;
                                    _prev_bind_0_$222 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    try {
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                        thread.resetMultipleValues();
                                        after_node_$227 = sbhl_time_dates.sbhl_time_date_find_search_node(after, mt, after_depth);
                                        after_date_$228 = thread.secondMultipleValue();
                                        after_tag_$229 = thread.thirdMultipleValue();
                                        thread.resetMultipleValues();
                                        after_node = after_node_$227;
                                        after_date = after_date_$228;
                                        after_tag = after_tag_$229;
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$222, thread);
                                    }
                                    if ((NIL != after_date) && (NIL != (add(new SubLObject[]{ depth, minus(before_depth), minus(after_depth), sbhl_marking_utilities.sbhl_temporal_tag_increment(before_tag), sbhl_marking_utilities.sbhl_temporal_tag_increment(after_tag) }).isNegative() ? sbhl_time_dates.sbhl_dateL(before_date, after_date) : sbhl_time_dates.sbhl_dateLE(before_date, after_date)))) {
                                        if (!before.eql(before_node)) {
                                            _prev_bind_0_$223 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding(thread);
                                            _prev_bind_3 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                            try {
                                                sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind(NIL, thread);
                                                sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL, thread);
                                                assert NIL != integerp(before_depth) : "! integerp(before_depth) " + ("Types.integerp(before_depth) " + "CommonSymbols.NIL != Types.integerp(before_depth) ") + before_depth;
                                                _prev_bind_0_$224 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                try {
                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(before_depth, thread);
                                                    just = why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), before, before_node, mt, UNPROVIDED, UNPROVIDED);
                                                } finally {
                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$224, thread);
                                                }
                                            } finally {
                                                sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_3, thread);
                                                sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind(_prev_bind_0_$223, thread);
                                            }
                                        }
                                        _prev_bind_0_$225 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                            supports = sbhl_time_dates.sbhl_time_date_node_date_link_supports(before_node, before_tag, before_date, mt);
                                            if (NIL != supports) {
                                                just = append(just, supports);
                                            }
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$225, thread);
                                        }
                                        _prev_bind_0_$226 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        try {
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                            supports = sbhl_time_dates.sbhl_time_date_date_node_link_supports(after_date, after_tag, after_node, mt);
                                            if (NIL != supports) {
                                                just = append(just, supports);
                                            }
                                        } finally {
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_$226, thread);
                                        }
                                        if (!after_node.eql(after)) {
                                            _prev_bind_0_$227 = sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.currentBinding(thread);
                                            _prev_bind_3 = sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.currentBinding(thread);
                                            try {
                                                sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.bind(NIL, thread);
                                                sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.bind(NIL, thread);
                                                assert NIL != integerp(after_depth) : "! integerp(after_depth) " + ("Types.integerp(after_depth) " + "CommonSymbols.NIL != Types.integerp(after_depth) ") + after_depth;
                                                _prev_bind_0_$228 = sbhl_time_vars.$sbhl_temporality_succession_depth$.currentBinding(thread);
                                                try {
                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.bind(after_depth, thread);
                                                    just = append(just, why_sbhl_time_predicate_relation_p(sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence), after_node, after, mt, UNPROVIDED, UNPROVIDED));
                                                } finally {
                                                    sbhl_time_vars.$sbhl_temporality_succession_depth$.rebind(_prev_bind_0_$228, thread);
                                                }
                                            } finally {
                                                sbhl_time_vars.$sbhl_temporality_search_passed_through_dateP$.rebind(_prev_bind_3, thread);
                                                sbhl_time_vars.$sbhl_temporality_justification_gathering_passed_through_dateP$.rebind(_prev_bind_0_$227, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
        }
        return list_utilities.fast_delete_duplicates(just, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject why_sbhl_time_predicate_relation_p_alt(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return list_utilities.fast_delete_duplicates(apply(symbol_function(APPEND), sbhl_search_methods.why_sbhl_predicate_relation_p(module, node1, node2, mt, tv, behavior)), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject why_sbhl_time_predicate_relation_p(final SubLObject module, final SubLObject node1, final SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = NIL;
        }
        if (behavior == UNPROVIDED) {
            behavior = NIL;
        }
        return list_utilities.fast_delete_duplicates(apply(symbol_function(APPEND), sbhl_search_methods.why_sbhl_predicate_relation_p(module, node1, node2, mt, tv, behavior)), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_sbhl_time_search_file() {
        declareFunction("add_precedence_link", "ADD-PRECEDENCE-LINK", 4, 0, false);
        declareFunction("remove_precedence_link", "REMOVE-PRECEDENCE-LINK", 4, 0, false);
        declareFunction("weakly_precedesP", "WEAKLY-PRECEDES?", 2, 1, false);
        declareFunction("strictly_precedesP", "STRICTLY-PRECEDES?", 2, 1, false);
        declareFunction("weakly_precedes_successorP", "WEAKLY-PRECEDES-SUCCESSOR?", 2, 1, false);
        declareFunction("successor_strictly_precedesP", "SUCCESSOR-STRICTLY-PRECEDES?", 2, 1, false);
        declareFunction("weakly_precedes_successors_successorP", "WEAKLY-PRECEDES-SUCCESSORS-SUCCESSOR?", 2, 1, false);
        declareFunction("weakly_precedes_successors_successors_successorP", "WEAKLY-PRECEDES-SUCCESSORS-SUCCESSORS-SUCCESSOR?", 2, 1, false);
        declareFunction("successors_successor_strictly_precedesP", "SUCCESSORS-SUCCESSOR-STRICTLY-PRECEDES?", 2, 1, false);
        declareFunction("coordinateP", "COORDINATE?", 2, 1, false);
        declareFunction("successorP", "SUCCESSOR?", 2, 1, false);
        declareFunction("predecessorP", "PREDECESSOR?", 2, 1, false);
        declareFunction("successors_successorP", "SUCCESSORS-SUCCESSOR?", 2, 1, false);
        declareFunction("precedesP_date_before", "PRECEDES?-DATE-BEFORE", 4, 0, false);
        declareFunction("precedesP_date_after", "PRECEDES?-DATE-AFTER", 4, 0, false);
        declareFunction("precedesP_node_date", "PRECEDES?-NODE-DATE", 4, 0, false);
        declareFunction("precedesP_node_node", "PRECEDES?-NODE-NODE", 4, 0, false);
        declareFunction("all_weakly_precedes", "ALL-WEAKLY-PRECEDES", 1, 1, false);
        declareFunction("all_weakly_precedes_inverse", "ALL-WEAKLY-PRECEDES-INVERSE", 1, 1, false);
        declareFunction("all_strictly_precedes", "ALL-STRICTLY-PRECEDES", 1, 1, false);
        declareFunction("all_strictly_precedes_inverse", "ALL-STRICTLY-PRECEDES-INVERSE", 1, 1, false);
        declareFunction("all_weakly_precedes_successor", "ALL-WEAKLY-PRECEDES-SUCCESSOR", 1, 1, false);
        declareFunction("all_weakly_precedes_successor_inverse", "ALL-WEAKLY-PRECEDES-SUCCESSOR-INVERSE", 1, 1, false);
        declareFunction("all_successor_strictly_precedes", "ALL-SUCCESSOR-STRICTLY-PRECEDES", 1, 1, false);
        declareFunction("all_successor_strictly_precedes_inverse", "ALL-SUCCESSOR-STRICTLY-PRECEDES-INVERSE", 1, 1, false);
        declareFunction("all_weakly_precedes_successors_successor", "ALL-WEAKLY-PRECEDES-SUCCESSORS-SUCCESSOR", 1, 1, false);
        declareFunction("all_weakly_precedes_successors_successor_inverse", "ALL-WEAKLY-PRECEDES-SUCCESSORS-SUCCESSOR-INVERSE", 1, 1, false);
        declareFunction("all_forward_precedes_date", "ALL-FORWARD-PRECEDES-DATE", 3, 0, false);
        declareFunction("all_backward_precedes_date", "ALL-BACKWARD-PRECEDES-DATE", 3, 0, false);
        declareFunction("all_forward_precedes_node", "ALL-FORWARD-PRECEDES-NODE", 3, 0, false);
        declareFunction("all_backward_precedes_node", "ALL-BACKWARD-PRECEDES-NODE", 3, 0, false);
        declareFunction("all_precedes_date", "ALL-PRECEDES-DATE", 2, 0, false);
        declareFunction("all_precedes_node", "ALL-PRECEDES-NODE", 2, 0, false);
        declareFunction("all_coordinate", "ALL-COORDINATE", 1, 1, false);
        declareFunction("all_successors", "ALL-SUCCESSORS", 1, 1, false);
        declareFunction("all_predecessors", "ALL-PREDECESSORS", 1, 1, false);
        declareFunction("all_successors_successors", "ALL-SUCCESSORS-SUCCESSORS", 1, 1, false);
        declareFunction("all_predecessors_predecessors", "ALL-PREDECESSORS-PREDECESSORS", 1, 1, false);
        declareFunction("all_between", "ALL-BETWEEN", 4, 1, false);
        declareFunction("sbhl_temporality_all_forward_nodes_between", "SBHL-TEMPORALITY-ALL-FORWARD-NODES-BETWEEN", 4, 2, false);
        declareFunction("sbhl_temporality_all_backward_nodes_between", "SBHL-TEMPORALITY-ALL-BACKWARD-NODES-BETWEEN", 4, 2, false);
        declareFunction("sbhl_temporality_all_nodes_accessed_between", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN", 3, 1, false);
        declareFunction("sbhl_temporality_all_nodes_accessed_between_dates", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-DATES", 4, 0, false);
        declareFunction("sbhl_temporality_all_nodes_accessed_between_dates_int", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-DATES-INT", 4, 0, false);
        declareFunction("sbhl_temporality_all_nodes_accessed_between_date_node", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-DATE-NODE", 4, 0, false);
        declareFunction("sbhl_temporality_all_nodes_accessed_between_node_date", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-NODE-DATE", 4, 0, false);
        declareFunction("sbhl_temporality_all_nodes_accessed_between_nodes", "SBHL-TEMPORALITY-ALL-NODES-ACCESSED-BETWEEN-NODES", 4, 0, false);
        declareFunction("why_weakly_precedesP", "WHY-WEAKLY-PRECEDES?", 2, 1, false);
        declareFunction("why_strictly_precedesP", "WHY-STRICTLY-PRECEDES?", 2, 1, false);
        declareFunction("why_weakly_precedes_successorP", "WHY-WEAKLY-PRECEDES-SUCCESSOR?", 2, 1, false);
        declareFunction("why_successor_strictly_precedesP", "WHY-SUCCESSOR-STRICTLY-PRECEDES?", 2, 1, false);
        declareFunction("why_weakly_precedes_successors_successorP", "WHY-WEAKLY-PRECEDES-SUCCESSORS-SUCCESSOR?", 2, 1, false);
        declareFunction("why_weakly_precedes_successors_successors_successorP", "WHY-WEAKLY-PRECEDES-SUCCESSORS-SUCCESSORS-SUCCESSOR?", 2, 1, false);
        declareFunction("why_successors_successor_strictly_precedesP", "WHY-SUCCESSORS-SUCCESSOR-STRICTLY-PRECEDES?", 2, 1, false);
        declareFunction("why_coordinateP", "WHY-COORDINATE?", 2, 1, false);
        declareFunction("why_successorP", "WHY-SUCCESSOR?", 2, 1, false);
        declareFunction("why_predecessorP", "WHY-PREDECESSOR?", 2, 1, false);
        declareFunction("why_successors_successorP", "WHY-SUCCESSORS-SUCCESSOR?", 2, 1, false);
        declareFunction("why_precedesP_date_before", "WHY-PRECEDES?-DATE-BEFORE", 4, 0, false);
        declareFunction("why_precedesP_date_after", "WHY-PRECEDES?-DATE-AFTER", 4, 0, false);
        declareFunction("why_precedesP_node_date", "WHY-PRECEDES?-NODE-DATE", 4, 0, false);
        declareFunction("why_precedesP_node_node", "WHY-PRECEDES?-NODE-NODE", 4, 0, false);
        declareFunction("why_sbhl_time_predicate_relation_p", "WHY-SBHL-TIME-PREDICATE-RELATION-P", 3, 3, false);
        return NIL;
    }

    public static SubLObject init_sbhl_time_search_file() {
        deflexical("*SBHL-TIME-PRECEDES-DEPTHS*", $list22);
        return NIL;
    }

    public static SubLObject setup_sbhl_time_search_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_time_search_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_time_search_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_time_search_file();
    }

    

    static private final SubLString $str_alt13$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt18$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLList $list_alt22 = list(ZERO_INTEGER, MINUS_ONE_INTEGER, makeInteger(-2), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER);

    static private final SubLList $list_alt25 = list(makeSymbol("LINK0"), makeSymbol("LINK1"));

    static private final SubLList $list_alt26 = list(makeSymbol("DATE-TAG"), makeSymbol("DATE-MT"), makeSymbol("LINK-DATE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list_alt27 = list(makeSymbol("NODE-TAG"), makeSymbol("NODE-MT"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list_alt28 = list(makeSymbol("LINK0"), makeSymbol("LINK1"), makeSymbol("LINK2"));

    static private final SubLList $list_alt29 = list(makeSymbol("DATE-TAG"), makeSymbol("DATE-MT"), makeSymbol("DATE-DATE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list_alt30 = list(makeSymbol("INT-TAG"), makeSymbol("INT-MT"), makeSymbol("INT-DATE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list_alt31 = list(makeSymbol("LINK-TAG"), makeSymbol("LINK-MT"), makeSymbol("LINK-NODE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));

    static private final SubLList $list_alt33 = list(makeSymbol("DATE-TAG"), makeSymbol("DATE-MT"), makeSymbol("DATE"), makeSymbol("&OPTIONAL"), makeUninternedSymbol("LINK-SUPPORTS"));
}

/**
 * Total time: 1616 ms
 */
