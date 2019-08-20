/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GT-MACROS
 * source file: /cyc/top/cycl/gt-macros.lisp
 * created:     2019/07/03 17:37:19
 */
public final class gt_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new gt_macros();



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $gt_recursion_cutoff$ = makeSymbol("*GT-RECURSION-CUTOFF*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym3$GT_MODE_ = makeSymbol("GT-MODE?");

    static private final SubLString $str4$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    public static final SubLSymbol $gt_mode$ = makeSymbol("*GT-MODE*");

    private static final SubLSymbol WITH_SBHL_READER_LOCK = makeSymbol("WITH-SBHL-READER-LOCK");

    static private final SubLList $list8 = list(list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("*GT-TEST-LEVEL*"), FIVE_INTEGER), list(makeSymbol("CLET"), list(list(makeSymbol("SEARCHED"), list(makeSymbol("SBHL-MARKED-NODES")))), list(makeSymbol("PWHEN"), makeSymbol("SEARCHED"), list(makeSymbol("GT-ERROR"), THREE_INTEGER, makeString("~s marked constants: ~s"), list(makeSymbol("LENGTH"), makeSymbol("SEARCHED")), makeSymbol("SEARCHED"))))));

    static private final SubLList $list9 = list(makeSymbol("TRUTH"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list11 = list(makeSymbol("TRUTH-P"));

    public static final SubLSymbol $gt_truth$ = makeSymbol("*GT-TRUTH*");

    static private final SubLList $list13 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list14 = list(makeSymbol("FORT-P"));

    public static final SubLSymbol $gt_pred$ = makeSymbol("*GT-PRED*");

    static private final SubLList $list16 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list17 = list(makeSymbol("FUNCTION-SPEC-P"));

    public static final SubLSymbol $gt_combine_fn$ = makeSymbol("*GT-COMBINE-FN*");

    public static final SubLSymbol $gt_base_fn$ = makeSymbol("*GT-BASE-FN*");

    public static final SubLSymbol $gt_step_fn$ = makeSymbol("*GT-STEP-FN*");

    public static final SubLSymbol $tt_step_fn$ = makeSymbol("*TT-STEP-FN*");

    static private final SubLString $str24$_a_is_not_a_function = makeString("~a is not a function");

    public static final SubLSymbol $gt_gather_fn$ = makeSymbol("*GT-GATHER-FN*");

    public static final SubLSymbol $gt_compose_fn$ = makeSymbol("*GT-COMPOSE-FN*");

    public static final SubLSymbol $gt_compare_fn$ = makeSymbol("*GT-COMPARE-FN*");

    static private final SubLList $list28 = list(makeSymbol("TARGET"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gt_target$ = makeSymbol("*GT-TARGET*");

    static private final SubLList $list30 = list(makeSymbol("SEARCHER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gt_searcher$ = makeSymbol("*GT-SEARCHER*");

    public static final SubLSymbol $gt_compose_pred$ = makeSymbol("*GT-COMPOSE-PRED*");

    static private final SubLList $list33 = list(makeSymbol("ARG"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list34 = list(makeSymbol("FIXNUMP"));

    public static final SubLSymbol $gt_compose_index_arg$ = makeSymbol("*GT-COMPOSE-INDEX-ARG*");

    public static final SubLSymbol $gt_compose_gather_arg$ = makeSymbol("*GT-COMPOSE-GATHER-ARG*");

    static private final SubLList $list37 = list(makeSymbol("SUP"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gt_link_support$ = makeSymbol("*GT-LINK-SUPPORT*");

    private static final SubLSymbol CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");

    static private final SubLList $list41 = list(list(makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*"), T));

    static private final SubLList $list42 = list(makeSymbol("OBJECT"), makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEVEL"), THREE_INTEGER));

    static private final SubLList $list44 = list(makeSymbol("COR"), makeSymbol("*SUSPEND-TYPE-CHECKING?*"), makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*"), makeSymbol("*IGNORE-MUSTS?*"));

    private static final SubLSymbol GT_CHECK_TYPE_INTERNAL = makeSymbol("GT-CHECK-TYPE-INTERNAL");

    static private final SubLList $list47 = list(list(makeSymbol("CUTOFF-REACHED"), NIL), list(makeSymbol("*GT-RECURSION-CUTOFF*"), list(makeSymbol("FWHEN"), list(makeSymbol("INTEGERP"), makeSymbol("*GT-RECURSION-CUTOFF*")), list(makeSymbol("-"), makeSymbol("*GT-RECURSION-CUTOFF*"), ONE_INTEGER))), list(makeSymbol("*GT-DEPTH-CUTOFF*"), list(makeSymbol("-"), makeSymbol("*GT-DEPTH-CUTOFF*"), ONE_INTEGER)));

    static private final SubLList $list48 = list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("*GT-RECURSION-CUTOFF*")), list(makeSymbol("<"), makeSymbol("*GT-RECURSION-CUTOFF*"), ZERO_INTEGER)), list(makeSymbol("PIF-FEATURE"), makeKeyword("CYC-MAINT"), list(makeSymbol("ERROR"), makeString("GT recursion limit reached.  Please report this problem on bug 15244.")), list(makeSymbol("ERROR"), makeString("GT recursion limit reached."))));

    static private final SubLList $list49 = list(makeSymbol("PWHEN"), makeSymbol("*GT-DEPTH-CUTOFF?*"), list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("*GT-DEPTH-CUTOFF*"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CUTOFF-REACHED"), T)));

    static private final SubLList $list50 = list(makeSymbol("PWHEN"), makeSymbol("*GT-TIME-CUTOFF?*"), list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("*GT-TIME-CUTOFF*"), list(makeSymbol("/"), list(makeSymbol("-"), list(makeSymbol("GET-INTERNAL-REAL-TIME")), makeSymbol("*GT-INITIAL-TIME*")), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"))), list(makeSymbol("CSETQ"), makeSymbol("CUTOFF-REACHED"), T)));

    private static final SubLSymbol CUTOFF_REACHED = makeSymbol("CUTOFF-REACHED");

    static private final SubLList $list52 = list(makeSymbol("CUTOFF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list53 = list(makeSymbol("*GT-DEPTH-CUTOFF?*"), T);

    public static final SubLSymbol $gt_depth_cutoff$ = makeSymbol("*GT-DEPTH-CUTOFF*");

    static private final SubLList $list55 = list(makeSymbol("SECONDS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list56 = list(makeSymbol("*GT-TIME-CUTOFF?*"), T);

    public static final SubLSymbol $gt_time_cutoff$ = makeSymbol("*GT-TIME-CUTOFF*");

    static private final SubLList $list58 = list(list(makeSymbol("*GT-INITIAL-TIME*"), list(makeSymbol("GET-INTERNAL-REAL-TIME"))));

    static private final SubLList $list59 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym61$_ = makeSymbol("<");

    static private final SubLList $list62 = list(ONE_INTEGER);

    static private final SubLList $list63 = list(makeSymbol("GT-ERROR"), THREE_INTEGER, makeString("illegal value for number of answers cutoff. try a bigger one"));

    static private final SubLList $list64 = list(makeSymbol("*GT-ANSWERS-CUTOFF?*"), T);

    public static final SubLSymbol $gt_answers_cutoff$ = makeSymbol("*GT-ANSWERS-CUTOFF*");

    static private final SubLList $list66 = list(list(makeSymbol("*GT-ANSWERS-SO-FAR*"), ZERO_INTEGER));

    static private final SubLList $list67 = list(list(makeSymbol("CUTOFF-REACHED"), NIL));

    static private final SubLList $list68 = list(makeSymbol("PWHEN"), makeSymbol("*GT-ANSWERS-CUTOFF?*"), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("*GT-ANSWERS-SO-FAR*"), makeSymbol("*GT-ANSWERS-CUTOFF*")), list(makeSymbol("MAPPING-FINISHED")), list(makeSymbol("CSETQ"), makeSymbol("CUTOFF-REACHED"), T)));

    static private final SubLList $list69 = list(makeSymbol("CINC"), makeSymbol("*GT-ANSWERS-SO-FAR*"));

    static private final SubLList $list70 = list(makeSymbol("ASSERTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gt_edge_list_returnP$ = makeSymbol("*GT-EDGE-LIST-RETURN?*");

    static private final SubLList $list76 = list(makeSymbol("*GT-EDGE-LIST*"));

    static private final SubLList $list77 = list(list(makeSymbol("*GT-EDGE-LIST-RETURN?*"), T), makeSymbol("*GT-EDGE-LIST*"));

    static private final SubLList $list78 = list(makeSymbol("TABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gt_marking_table$ = makeSymbol("*GT-MARKING-TABLE*");

    static private final SubLList $list80 = list(list(makeSymbol("*GT-TARGET-MARKING-TABLE*"), makeSymbol("*GT-MARKING-TABLE*")), makeSymbol("*GT-MARKING-TABLE*"));

    static private final SubLList $list81 = list(makeSymbol("CSETQ"), makeSymbol("*GT-MARKING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(128)));

    static private final SubLList $list82 = list(list(makeSymbol("*GT-WITHIN-TRANSITIVE-VIA-ARG?*"), T));

    static private final SubLList $list83 = list(list(makeSymbol("*GT-USE-SKSI?*"), NIL));

    static private final SubLList $list84 = list(list(makeSymbol("*GT-USE-SKSI?*"), T));

    // Definitions
    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mode = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            mode = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(MUST, list($sym3$GT_MODE_, mode), $str_alt4$invalid_gt_mode___a, mode), listS(CLET, list(list($gt_mode$, mode)), append(body, NIL)));
            }
        }
    }

    // Definitions
    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        mode = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(MUST, list($sym3$GT_MODE_, mode), $str4$invalid_gt_mode___a, mode), listS(CLET, list(list($gt_mode$, mode)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(PROGN, bq_cons(WITH_SBHL_READER_LOCK, append(body, $list_alt8)));
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, bq_cons(WITH_SBHL_READER_LOCK, append(body, $list8)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_truth_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject truth = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            truth = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, truth, $list_alt11), listS(CLET, list(list($gt_truth$, truth)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_truth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject truth = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        truth = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, truth, $list11), listS(CLET, list(list($gt_truth$, truth)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_pred_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            pred = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, pred, $list_alt14), listS(CLET, list(list($gt_pred$, pred)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        pred = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, pred, $list14), listS(CLET, list(list($gt_pred$, pred)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_combine_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, fn, $list_alt17), listS(CLET, list(list($gt_combine_fn$, fn)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_combine_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, fn, $list17), listS(CLET, list(list($gt_combine_fn$, fn)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_base_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, fn, $list_alt17), listS(CLET, list(list($gt_base_fn$, fn)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_base_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, fn, $list17), listS(CLET, list(list($gt_base_fn$, fn)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_step_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(PWHEN, fn, listS(CHECK_TYPE, fn, $list_alt17)), listS(CLET, list(list($gt_step_fn$, fn)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_step_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(PWHEN, fn, listS(CHECK_TYPE, fn, $list17)), listS(CLET, list(list($gt_step_fn$, fn)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_tt_step_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, fn, $list_alt17), listS(CLET, list(list($tt_step_fn$, fn)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_tt_step_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, fn, $list17), listS(CLET, list(list($tt_step_fn$, fn)), append(body, NIL)));
    }

    public static final SubLObject with_gt_gather_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, list(MUST, list(FUNCTION_SPEC_P, fn), $str_alt24$_a_is_not_a_function, fn), listS(CLET, list(list($gt_gather_fn$, fn)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_gt_gather_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, list(MUST, list(FUNCTION_SPEC_P, fn), $str24$_a_is_not_a_function, fn), listS(CLET, list(list($gt_gather_fn$, fn)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_compose_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, fn, $list_alt17), listS(CLET, list(list($gt_compose_fn$, fn)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_compose_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, fn, $list17), listS(CLET, list(list($gt_compose_fn$, fn)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_compare_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, fn, $list_alt17), listS(CLET, list(list($gt_compare_fn$, fn)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_compare_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, fn, $list17), listS(CLET, list(list($gt_compare_fn$, fn)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_target_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject target = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            target = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($gt_target$, target)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_target(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject target = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        target = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($gt_target$, target)), append(body, NIL));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_searcher_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject searcher = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            searcher = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($gt_searcher$, searcher)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_searcher(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject searcher = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        searcher = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($gt_searcher$, searcher)), append(body, NIL));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_compose_pred_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt13);
            pred = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, pred, $list_alt14), listS(CLET, list(list($gt_compose_pred$, pred)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_compose_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list13);
        pred = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, pred, $list14), listS(CLET, list(list($gt_compose_pred$, pred)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_compose_index_arg_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt33);
            arg = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, arg, $list_alt34), listS(CLET, list(list($gt_compose_index_arg$, arg)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_compose_index_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject arg = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        arg = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, arg, $list34), listS(CLET, list(list($gt_compose_index_arg$, arg)), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static final SubLObject with_gt_compose_gather_arg_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject arg = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt33);
            arg = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, arg, $list_alt34), listS(CLET, list(list($gt_compose_gather_arg$, arg)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following GT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following GT-MACROS.LISP in sysdcl")
    public static SubLObject with_gt_compose_gather_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject arg = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        arg = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, arg, $list34), listS(CLET, list(list($gt_compose_gather_arg$, arg)), append(body, NIL)));
    }

    public static final SubLObject with_gt_link_support_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sup = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt37);
            sup = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($gt_link_support$, sup)), append(body, NIL));
            }
        }
    }

    public static SubLObject with_gt_link_support(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sup = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        sup = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($gt_link_support$, sup)), append(body, NIL));
    }

    public static final SubLObject unless_gt_error_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CCATCH_IGNORE, $GT_ERROR, append(body, NIL));
        }
    }

    public static SubLObject unless_gt_error(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CCATCH_IGNORE, $GT_ERROR, append(body, NIL));
    }

    public static final SubLObject without_gt_type_checking_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt41, append(body, NIL));
        }
    }

    public static SubLObject without_gt_type_checking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list41, append(body, NIL));
    }

    public static final SubLObject gt_check_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            type = current.first();
            current = current.rest();
            {
                SubLObject level = (current.isCons()) ? ((SubLObject) (current.first())) : THREE_INTEGER;
                destructuring_bind_must_listp(current, datum, $list_alt42);
                current = current.rest();
                if (NIL == current) {
                    return list(PUNLESS, $list_alt44, list(GT_CHECK_TYPE_INTERNAL, v_object, type, level));
                } else {
                    cdestructuring_bind_error(datum, $list_alt42);
                }
            }
        }
        return NIL;
    }

    public static SubLObject gt_check_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        type = current.first();
        current = current.rest();
        final SubLObject level = (current.isCons()) ? current.first() : THREE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list42);
        current = current.rest();
        if (NIL == current) {
            return list(PUNLESS, $list44, list(GT_CHECK_TYPE_INTERNAL, v_object, type, level));
        }
        cdestructuring_bind_error(datum, $list42);
        return NIL;
    }

    /**
     * used in gt-map-links for controlling cutoff behavior
     */
    @LispMethod(comment = "used in gt-map-links for controlling cutoff behavior")
    public static final SubLObject possibly_with_gt_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt47, $list_alt48, $list_alt49, $list_alt50, listS(PUNLESS, CUTOFF_REACHED, append(body, NIL)));
        }
    }

    /**
     * used in gt-map-links for controlling cutoff behavior
     */
    @LispMethod(comment = "used in gt-map-links for controlling cutoff behavior")
    public static SubLObject possibly_with_gt_cutoff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list47, $list48, $list49, $list50, listS(PUNLESS, CUTOFF_REACHED, append(body, NIL)));
    }

    /**
     * macro to set depth cutoff flag and level
     */
    @LispMethod(comment = "macro to set depth cutoff flag and level")
    public static final SubLObject with_gt_depth_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject cutoff = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt52);
            cutoff = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list($list_alt53, list($gt_depth_cutoff$, cutoff)), append(body, NIL));
            }
        }
    }

    /**
     * macro to set depth cutoff flag and level
     */
    @LispMethod(comment = "macro to set depth cutoff flag and level")
    public static SubLObject with_gt_depth_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cutoff = NIL;
        destructuring_bind_must_consp(current, datum, $list52);
        cutoff = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list($list53, list($gt_depth_cutoff$, cutoff)), append(body, NIL));
    }

    /**
     * macro to set time cutoff flag and value
     */
    @LispMethod(comment = "macro to set time cutoff flag and value")
    public static final SubLObject with_gt_time_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject seconds = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt55);
            seconds = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, listS($list_alt56, list($gt_time_cutoff$, seconds), $list_alt58), append(body, NIL));
            }
        }
    }

    /**
     * macro to set time cutoff flag and value
     */
    @LispMethod(comment = "macro to set time cutoff flag and value")
    public static SubLObject with_gt_time_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject seconds = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        seconds = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, listS($list56, list($gt_time_cutoff$, seconds), $list58), append(body, NIL));
    }

    /**
     * macro to set answers cutoff flag and value
     */
    @LispMethod(comment = "macro to set answers cutoff flag and value")
    public static final SubLObject with_gt_answers_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject num = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            num = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PIF, listS($sym61$_, num, $list_alt62), $list_alt63, listS(CLET, listS($list_alt64, list($gt_answers_cutoff$, num), $list_alt66), append(body, NIL)));
            }
        }
    }

    /**
     * macro to set answers cutoff flag and value
     */
    @LispMethod(comment = "macro to set answers cutoff flag and value")
    public static SubLObject with_gt_answers_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject num = NIL;
        destructuring_bind_must_consp(current, datum, $list59);
        num = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PIF, listS($sym61$_, num, $list62), $list63, listS(CLET, listS($list64, list($gt_answers_cutoff$, num), $list66), append(body, NIL)));
    }

    /**
     * macro to cutoff after a happy number of answers have been accumulated
     */
    @LispMethod(comment = "macro to cutoff after a happy number of answers have been accumulated")
    public static final SubLObject possibly_with_number_of_answers_cutoff_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt67, $list_alt68, listS(PUNLESS, CUTOFF_REACHED, $list_alt69, append(body, NIL)));
        }
    }

    /**
     * macro to cutoff after a happy number of answers have been accumulated
     */
    @LispMethod(comment = "macro to cutoff after a happy number of answers have been accumulated")
    public static SubLObject possibly_with_number_of_answers_cutoff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list67, $list68, listS(PUNLESS, CUTOFF_REACHED, $list69, append(body, NIL)));
    }

    public static final SubLObject possibly_with_gt_edge_list_accumulation_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject assertion = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt70);
            assertion = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PROGN, list(PWHEN, $gt_edge_list_returnP$, listS(CPUSH, list(LIST, list(GAF_ARG1, assertion), list(GAF_ARG2, assertion)), $list_alt76)), append(body, NIL));
            }
        }
    }

    public static SubLObject possibly_with_gt_edge_list_accumulation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list70);
        assertion = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PROGN, list(PWHEN, $gt_edge_list_returnP$, listS(CPUSH, list(LIST, list(GAF_ARG1, assertion), list(GAF_ARG2, assertion)), $list76)), append(body, NIL));
    }

    /**
     * macro to return all edges from a certain search for graphing utility
     */
    @LispMethod(comment = "macro to return all edges from a certain search for graphing utility")
    public static final SubLObject with_gt_edge_list_return_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt77, bq_cons(PROGN, append(body, $list_alt76)));
        }
    }

    /**
     * macro to return all edges from a certain search for graphing utility
     */
    @LispMethod(comment = "macro to return all edges from a certain search for graphing utility")
    public static SubLObject with_gt_edge_list_return(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list77, bq_cons(PROGN, append(body, $list76)));
    }

    /**
     * macro to search in a specified hashtable
     */
    @LispMethod(comment = "macro to search in a specified hashtable")
    public static final SubLObject gt_search_with_this_hashtable_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject table = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt78);
            table = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($gt_marking_table$, table)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "macro to search in a specified hashtable")
    public static SubLObject gt_search_with_this_hashtable(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list78);
        table = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($gt_marking_table$, table)), append(body, NIL));
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt4$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    /**
     * macro for rebinding old hash-table, and executing body with new search state
     */
    @LispMethod(comment = "macro for rebinding old hash-table, and executing body with new search state")
    public static final SubLObject gt_search_with_dynamic_hash_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt80, $list_alt81, append(body, NIL));
        }
    }

    @LispMethod(comment = "macro for rebinding old hash-table, and executing body with new search state")
    public static SubLObject gt_search_with_dynamic_hash(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list80, $list81, append(body, NIL));
    }

    static private final SubLList $list_alt8 = list(list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("*GT-TEST-LEVEL*"), FIVE_INTEGER), list(makeSymbol("CLET"), list(list(makeSymbol("SEARCHED"), list(makeSymbol("SBHL-MARKED-NODES")))), list(makeSymbol("PWHEN"), makeSymbol("SEARCHED"), list(makeSymbol("GT-ERROR"), THREE_INTEGER, makeString("~s marked constants: ~s"), list(makeSymbol("LENGTH"), makeSymbol("SEARCHED")), makeSymbol("SEARCHED"))))));

    /**
     * BODY is performed within scope of a gt-transitive-via-arg module
     */
    @LispMethod(comment = "BODY is performed within scope of a gt-transitive-via-arg module")
    public static final SubLObject gt_within_transitive_via_arg_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt82, append(body, NIL));
        }
    }

    @LispMethod(comment = "BODY is performed within scope of a gt-transitive-via-arg module")
    public static SubLObject gt_within_transitive_via_arg(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list82, append(body, NIL));
    }

    static private final SubLList $list_alt9 = list(makeSymbol("TRUTH"), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     * macro to turn off SKSI use within GT
     */
    @LispMethod(comment = "macro to turn off SKSI use within GT")
    public static final SubLObject without_gt_sksi_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt83, append(body, NIL));
        }
    }

    @LispMethod(comment = "macro to turn off SKSI use within GT")
    public static SubLObject without_gt_sksi(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list83, append(body, NIL));
    }

    static private final SubLList $list_alt11 = list(makeSymbol("TRUTH-P"));

    static private final SubLList $list_alt13 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     * macro to turn on SKSI use within GT
     */
    @LispMethod(comment = "macro to turn on SKSI use within GT")
    public static final SubLObject with_gt_sksi_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt84, append(body, NIL));
        }
    }

    @LispMethod(comment = "macro to turn on SKSI use within GT")
    public static SubLObject with_gt_sksi(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list84, append(body, NIL));
    }

    static private final SubLList $list_alt14 = list(makeSymbol("FORT-P"));

    static private final SubLList $list_alt16 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt17 = list(makeSymbol("FUNCTION-SPEC-P"));

    public static SubLObject declare_gt_macros_file() {
        declareMacro("with_gt_mode", "WITH-GT-MODE");
        declareMacro("with_gt_lock", "WITH-GT-LOCK");
        declareMacro("with_gt_truth", "WITH-GT-TRUTH");
        declareMacro("with_gt_pred", "WITH-GT-PRED");
        declareMacro("with_gt_combine_fn", "WITH-GT-COMBINE-FN");
        declareMacro("with_gt_base_fn", "WITH-GT-BASE-FN");
        declareMacro("with_gt_step_fn", "WITH-GT-STEP-FN");
        declareMacro("with_tt_step_fn", "WITH-TT-STEP-FN");
        declareMacro("with_gt_gather_fn", "WITH-GT-GATHER-FN");
        declareMacro("with_gt_compose_fn", "WITH-GT-COMPOSE-FN");
        declareMacro("with_gt_compare_fn", "WITH-GT-COMPARE-FN");
        declareMacro("with_gt_target", "WITH-GT-TARGET");
        declareMacro("with_gt_searcher", "WITH-GT-SEARCHER");
        declareMacro("with_gt_compose_pred", "WITH-GT-COMPOSE-PRED");
        declareMacro("with_gt_compose_index_arg", "WITH-GT-COMPOSE-INDEX-ARG");
        declareMacro("with_gt_compose_gather_arg", "WITH-GT-COMPOSE-GATHER-ARG");
        declareMacro("with_gt_link_support", "WITH-GT-LINK-SUPPORT");
        declareMacro("unless_gt_error", "UNLESS-GT-ERROR");
        declareMacro("without_gt_type_checking", "WITHOUT-GT-TYPE-CHECKING");
        declareMacro("gt_check_type", "GT-CHECK-TYPE");
        declareMacro("possibly_with_gt_cutoff", "POSSIBLY-WITH-GT-CUTOFF");
        declareMacro("with_gt_depth_cutoff", "WITH-GT-DEPTH-CUTOFF");
        declareMacro("with_gt_time_cutoff", "WITH-GT-TIME-CUTOFF");
        declareMacro("with_gt_answers_cutoff", "WITH-GT-ANSWERS-CUTOFF");
        declareMacro("possibly_with_number_of_answers_cutoff", "POSSIBLY-WITH-NUMBER-OF-ANSWERS-CUTOFF");
        declareMacro("possibly_with_gt_edge_list_accumulation", "POSSIBLY-WITH-GT-EDGE-LIST-ACCUMULATION");
        declareMacro("with_gt_edge_list_return", "WITH-GT-EDGE-LIST-RETURN");
        declareMacro("gt_search_with_this_hashtable", "GT-SEARCH-WITH-THIS-HASHTABLE");
        declareMacro("gt_search_with_dynamic_hash", "GT-SEARCH-WITH-DYNAMIC-HASH");
        declareMacro("gt_within_transitive_via_arg", "GT-WITHIN-TRANSITIVE-VIA-ARG");
        declareMacro("without_gt_sksi", "WITHOUT-GT-SKSI");
        declareMacro("with_gt_sksi", "WITH-GT-SKSI");
        return NIL;
    }

    static private final SubLString $str_alt24$_a_is_not_a_function = makeString("~a is not a function");

    static private final SubLList $list_alt28 = list(makeSymbol("TARGET"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt30 = list(makeSymbol("SEARCHER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt33 = list(makeSymbol("ARG"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt34 = list(makeSymbol("FIXNUMP"));

    static private final SubLList $list_alt37 = list(makeSymbol("SUP"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt41 = list(list(makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*"), T));

    static private final SubLList $list_alt42 = list(makeSymbol("OBJECT"), makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEVEL"), THREE_INTEGER));

    static private final SubLList $list_alt44 = list(makeSymbol("COR"), makeSymbol("*SUSPEND-TYPE-CHECKING?*"), makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*"), makeSymbol("*IGNORE-MUSTS?*"));

    public static SubLObject init_gt_macros_file() {
        defparameter("*GT-RECURSION-CUTOFF*", $int$64);
        return NIL;
    }

    public static SubLObject setup_gt_macros_file() {
        return NIL;
    }

    static private final SubLList $list_alt47 = list(list(makeSymbol("CUTOFF-REACHED"), NIL), list(makeSymbol("*GT-RECURSION-CUTOFF*"), list(makeSymbol("FWHEN"), list(makeSymbol("INTEGERP"), makeSymbol("*GT-RECURSION-CUTOFF*")), list(makeSymbol("-"), makeSymbol("*GT-RECURSION-CUTOFF*"), ONE_INTEGER))), list(makeSymbol("*GT-DEPTH-CUTOFF*"), list(makeSymbol("-"), makeSymbol("*GT-DEPTH-CUTOFF*"), ONE_INTEGER)));

    @Override
    public void declareFunctions() {
        declare_gt_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_gt_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_gt_macros_file();
    }

    static {
    }

    static private final SubLList $list_alt48 = list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("*GT-RECURSION-CUTOFF*")), list(makeSymbol("<"), makeSymbol("*GT-RECURSION-CUTOFF*"), ZERO_INTEGER)), list(makeSymbol("PIF-FEATURE"), makeKeyword("CYC-MAINT"), list(makeSymbol("ERROR"), makeString("GT recursion limit reached.  Please report this problem on bug 15244.")), list(makeSymbol("ERROR"), makeString("GT recursion limit reached."))));

    static private final SubLList $list_alt49 = list(makeSymbol("PWHEN"), makeSymbol("*GT-DEPTH-CUTOFF?*"), list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("*GT-DEPTH-CUTOFF*"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CUTOFF-REACHED"), T)));

    static private final SubLList $list_alt50 = list(makeSymbol("PWHEN"), makeSymbol("*GT-TIME-CUTOFF?*"), list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("*GT-TIME-CUTOFF*"), list(makeSymbol("/"), list(makeSymbol("-"), list(makeSymbol("GET-INTERNAL-REAL-TIME")), makeSymbol("*GT-INITIAL-TIME*")), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"))), list(makeSymbol("CSETQ"), makeSymbol("CUTOFF-REACHED"), T)));

    static private final SubLList $list_alt52 = list(makeSymbol("CUTOFF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt53 = list(makeSymbol("*GT-DEPTH-CUTOFF?*"), T);

    static private final SubLList $list_alt55 = list(makeSymbol("SECONDS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt56 = list(makeSymbol("*GT-TIME-CUTOFF?*"), T);

    static private final SubLList $list_alt58 = list(list(makeSymbol("*GT-INITIAL-TIME*"), list(makeSymbol("GET-INTERNAL-REAL-TIME"))));

    static private final SubLList $list_alt59 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt62 = list(ONE_INTEGER);

    static private final SubLList $list_alt63 = list(makeSymbol("GT-ERROR"), THREE_INTEGER, makeString("illegal value for number of answers cutoff. try a bigger one"));

    static private final SubLList $list_alt64 = list(makeSymbol("*GT-ANSWERS-CUTOFF?*"), T);

    static private final SubLList $list_alt66 = list(list(makeSymbol("*GT-ANSWERS-SO-FAR*"), ZERO_INTEGER));

    static private final SubLList $list_alt67 = list(list(makeSymbol("CUTOFF-REACHED"), NIL));

    static private final SubLList $list_alt68 = list(makeSymbol("PWHEN"), makeSymbol("*GT-ANSWERS-CUTOFF?*"), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("*GT-ANSWERS-SO-FAR*"), makeSymbol("*GT-ANSWERS-CUTOFF*")), list(makeSymbol("MAPPING-FINISHED")), list(makeSymbol("CSETQ"), makeSymbol("CUTOFF-REACHED"), T)));

    static private final SubLList $list_alt69 = list(makeSymbol("CINC"), makeSymbol("*GT-ANSWERS-SO-FAR*"));

    static private final SubLList $list_alt70 = list(makeSymbol("ASSERTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt76 = list(makeSymbol("*GT-EDGE-LIST*"));

    static private final SubLList $list_alt77 = list(list(makeSymbol("*GT-EDGE-LIST-RETURN?*"), T), makeSymbol("*GT-EDGE-LIST*"));

    static private final SubLList $list_alt78 = list(makeSymbol("TABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt80 = list(list(makeSymbol("*GT-TARGET-MARKING-TABLE*"), makeSymbol("*GT-MARKING-TABLE*")), makeSymbol("*GT-MARKING-TABLE*"));

    static private final SubLList $list_alt81 = list(makeSymbol("CSETQ"), makeSymbol("*GT-MARKING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(128)));

    static private final SubLList $list_alt82 = list(list(makeSymbol("*GT-WITHIN-TRANSITIVE-VIA-ARG?*"), T));

    static private final SubLList $list_alt83 = list(list(makeSymbol("*GT-USE-SKSI?*"), NIL));

    static private final SubLList $list_alt84 = list(list(makeSymbol("*GT-USE-SKSI?*"), T));
}

/**
 * Total time: 149 ms
 */
