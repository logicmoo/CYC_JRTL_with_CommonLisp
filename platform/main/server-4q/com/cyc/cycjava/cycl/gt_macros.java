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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class gt_macros extends SubLTranslatedFile {
    public static final SubLFile me = new gt_macros();

    public static final String myName = "com.cyc.cycjava.cycl.gt_macros";

    public static final String myFingerPrint = "98712826175262e07b5bd2ed5289c9f61addd0abe13d8e48c420f12492025132";

    // defparameter
    public static final SubLSymbol $gt_recursion_cutoff$ = makeSymbol("*GT-RECURSION-CUTOFF*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));





    public static final SubLSymbol $sym3$GT_MODE_ = makeSymbol("GT-MODE?");

    public static final SubLString $str4$invalid_gt_mode___a = makeString("invalid gt mode: ~a");



    public static final SubLSymbol $gt_mode$ = makeSymbol("*GT-MODE*");

    public static final SubLSymbol WITH_SBHL_READER_LOCK = makeSymbol("WITH-SBHL-READER-LOCK");

    public static final SubLList $list8 = list(list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("*GT-TEST-LEVEL*"), FIVE_INTEGER), list(makeSymbol("CLET"), list(list(makeSymbol("SEARCHED"), list(makeSymbol("SBHL-MARKED-NODES")))), list(makeSymbol("PWHEN"), makeSymbol("SEARCHED"), list(makeSymbol("GT-ERROR"), THREE_INTEGER, makeString("~s marked constants: ~s"), list(makeSymbol("LENGTH"), makeSymbol("SEARCHED")), makeSymbol("SEARCHED"))))));

    public static final SubLList $list9 = list(makeSymbol("TRUTH"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list11 = list(makeSymbol("TRUTH-P"));

    public static final SubLSymbol $gt_truth$ = makeSymbol("*GT-TRUTH*");

    public static final SubLList $list13 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list14 = list(makeSymbol("FORT-P"));

    public static final SubLSymbol $gt_pred$ = makeSymbol("*GT-PRED*");

    public static final SubLList $list16 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list17 = list(makeSymbol("FUNCTION-SPEC-P"));

    public static final SubLSymbol $gt_combine_fn$ = makeSymbol("*GT-COMBINE-FN*");

    public static final SubLSymbol $gt_base_fn$ = makeSymbol("*GT-BASE-FN*");



    public static final SubLSymbol $gt_step_fn$ = makeSymbol("*GT-STEP-FN*");

    public static final SubLSymbol $tt_step_fn$ = makeSymbol("*TT-STEP-FN*");



    public static final SubLString $str24$_a_is_not_a_function = makeString("~a is not a function");

    public static final SubLSymbol $gt_gather_fn$ = makeSymbol("*GT-GATHER-FN*");

    public static final SubLSymbol $gt_compose_fn$ = makeSymbol("*GT-COMPOSE-FN*");

    public static final SubLSymbol $gt_compare_fn$ = makeSymbol("*GT-COMPARE-FN*");

    public static final SubLList $list28 = list(makeSymbol("TARGET"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gt_target$ = makeSymbol("*GT-TARGET*");

    public static final SubLList $list30 = list(makeSymbol("SEARCHER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gt_searcher$ = makeSymbol("*GT-SEARCHER*");

    public static final SubLSymbol $gt_compose_pred$ = makeSymbol("*GT-COMPOSE-PRED*");

    public static final SubLList $list33 = list(makeSymbol("ARG"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list34 = list(makeSymbol("FIXNUMP"));

    public static final SubLSymbol $gt_compose_index_arg$ = makeSymbol("*GT-COMPOSE-INDEX-ARG*");

    public static final SubLSymbol $gt_compose_gather_arg$ = makeSymbol("*GT-COMPOSE-GATHER-ARG*");

    public static final SubLList $list37 = list(makeSymbol("SUP"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gt_link_support$ = makeSymbol("*GT-LINK-SUPPORT*");

    public static final SubLSymbol CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");



    public static final SubLList $list41 = list(list(makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*"), T));

    public static final SubLList $list42 = list(makeSymbol("OBJECT"), makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEVEL"), THREE_INTEGER));



    public static final SubLList $list44 = list(makeSymbol("COR"), makeSymbol("*SUSPEND-TYPE-CHECKING?*"), makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*"), makeSymbol("*IGNORE-MUSTS?*"));

    public static final SubLSymbol GT_CHECK_TYPE_INTERNAL = makeSymbol("GT-CHECK-TYPE-INTERNAL");



    public static final SubLList $list47 = list(list(makeSymbol("CUTOFF-REACHED"), NIL), list(makeSymbol("*GT-RECURSION-CUTOFF*"), list(makeSymbol("FWHEN"), list(makeSymbol("INTEGERP"), makeSymbol("*GT-RECURSION-CUTOFF*")), list(makeSymbol("-"), makeSymbol("*GT-RECURSION-CUTOFF*"), ONE_INTEGER))), list(makeSymbol("*GT-DEPTH-CUTOFF*"), list(makeSymbol("-"), makeSymbol("*GT-DEPTH-CUTOFF*"), ONE_INTEGER)));

    public static final SubLList $list48 = list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("*GT-RECURSION-CUTOFF*")), list(makeSymbol("<"), makeSymbol("*GT-RECURSION-CUTOFF*"), ZERO_INTEGER)), list(makeSymbol("PIF-FEATURE"), makeKeyword("CYC-MAINT"), list(makeSymbol("ERROR"), makeString("GT recursion limit reached.  Please report this problem on bug 15244.")), list(makeSymbol("ERROR"), makeString("GT recursion limit reached."))));

    public static final SubLList $list49 = list(makeSymbol("PWHEN"), makeSymbol("*GT-DEPTH-CUTOFF?*"), list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("*GT-DEPTH-CUTOFF*"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CUTOFF-REACHED"), T)));

    public static final SubLList $list50 = list(makeSymbol("PWHEN"), makeSymbol("*GT-TIME-CUTOFF?*"), list(makeSymbol("PWHEN"), list(makeSymbol("<"), makeSymbol("*GT-TIME-CUTOFF*"), list(makeSymbol("/"), list(makeSymbol("-"), list(makeSymbol("GET-INTERNAL-REAL-TIME")), makeSymbol("*GT-INITIAL-TIME*")), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"))), list(makeSymbol("CSETQ"), makeSymbol("CUTOFF-REACHED"), T)));

    public static final SubLSymbol CUTOFF_REACHED = makeSymbol("CUTOFF-REACHED");

    public static final SubLList $list52 = list(makeSymbol("CUTOFF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list53 = list(makeSymbol("*GT-DEPTH-CUTOFF?*"), T);

    public static final SubLSymbol $gt_depth_cutoff$ = makeSymbol("*GT-DEPTH-CUTOFF*");

    public static final SubLList $list55 = list(makeSymbol("SECONDS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list56 = list(makeSymbol("*GT-TIME-CUTOFF?*"), T);

    public static final SubLSymbol $gt_time_cutoff$ = makeSymbol("*GT-TIME-CUTOFF*");

    public static final SubLList $list58 = list(list(makeSymbol("*GT-INITIAL-TIME*"), list(makeSymbol("GET-INTERNAL-REAL-TIME"))));

    public static final SubLList $list59 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sym61$_ = makeSymbol("<");

    public static final SubLList $list62 = list(ONE_INTEGER);

    public static final SubLList $list63 = list(makeSymbol("GT-ERROR"), THREE_INTEGER, makeString("illegal value for number of answers cutoff. try a bigger one"));

    public static final SubLList $list64 = list(makeSymbol("*GT-ANSWERS-CUTOFF?*"), T);

    public static final SubLSymbol $gt_answers_cutoff$ = makeSymbol("*GT-ANSWERS-CUTOFF*");

    public static final SubLList $list66 = list(list(makeSymbol("*GT-ANSWERS-SO-FAR*"), ZERO_INTEGER));

    public static final SubLList $list67 = list(list(makeSymbol("CUTOFF-REACHED"), NIL));

    public static final SubLList $list68 = list(makeSymbol("PWHEN"), makeSymbol("*GT-ANSWERS-CUTOFF?*"), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("*GT-ANSWERS-SO-FAR*"), makeSymbol("*GT-ANSWERS-CUTOFF*")), list(makeSymbol("MAPPING-FINISHED")), list(makeSymbol("CSETQ"), makeSymbol("CUTOFF-REACHED"), T)));

    public static final SubLList $list69 = list(makeSymbol("CINC"), makeSymbol("*GT-ANSWERS-SO-FAR*"));

    public static final SubLList $list70 = list(makeSymbol("ASSERTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym71$_GT_EDGE_LIST_RETURN__ = makeSymbol("*GT-EDGE-LIST-RETURN?*");









    public static final SubLList $list76 = list(makeSymbol("*GT-EDGE-LIST*"));

    public static final SubLList $list77 = list(list(makeSymbol("*GT-EDGE-LIST-RETURN?*"), T), makeSymbol("*GT-EDGE-LIST*"));

    public static final SubLList $list78 = list(makeSymbol("TABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $gt_marking_table$ = makeSymbol("*GT-MARKING-TABLE*");

    public static final SubLList $list80 = list(list(makeSymbol("*GT-TARGET-MARKING-TABLE*"), makeSymbol("*GT-MARKING-TABLE*")), makeSymbol("*GT-MARKING-TABLE*"));

    public static final SubLList $list81 = list(makeSymbol("CSETQ"), makeSymbol("*GT-MARKING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(128)));

    public static final SubLList $list82 = list(list(makeSymbol("*GT-WITHIN-TRANSITIVE-VIA-ARG?*"), T));

    public static final SubLList $list83 = list(list(makeSymbol("*GT-USE-SKSI?*"), NIL));

    public static final SubLList $list84 = list(list(makeSymbol("*GT-USE-SKSI?*"), T));

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

    public static SubLObject with_gt_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, bq_cons(WITH_SBHL_READER_LOCK, append(body, $list8)));
    }

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

    public static SubLObject unless_gt_error(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CCATCH_IGNORE, $GT_ERROR, append(body, NIL));
    }

    public static SubLObject without_gt_type_checking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list41, append(body, NIL));
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

    public static SubLObject possibly_with_gt_cutoff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list47, $list48, $list49, $list50, listS(PUNLESS, CUTOFF_REACHED, append(body, NIL)));
    }

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

    public static SubLObject possibly_with_number_of_answers_cutoff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list67, $list68, listS(PUNLESS, CUTOFF_REACHED, $list69, append(body, NIL)));
    }

    public static SubLObject possibly_with_gt_edge_list_accumulation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = NIL;
        destructuring_bind_must_consp(current, datum, $list70);
        assertion = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PROGN, list(PWHEN, $sym71$_GT_EDGE_LIST_RETURN__, listS(CPUSH, list(LIST, list(GAF_ARG1, assertion), list(GAF_ARG2, assertion)), $list76)), append(body, NIL));
    }

    public static SubLObject with_gt_edge_list_return(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list77, bq_cons(PROGN, append(body, $list76)));
    }

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

    public static SubLObject gt_search_with_dynamic_hash(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list80, $list81, append(body, NIL));
    }

    public static SubLObject gt_within_transitive_via_arg(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list82, append(body, NIL));
    }

    public static SubLObject without_gt_sksi(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list83, append(body, NIL));
    }

    public static SubLObject with_gt_sksi(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list84, append(body, NIL));
    }

    public static SubLObject declare_gt_macros_file() {
        declareMacro(me, "with_gt_mode", "WITH-GT-MODE");
        declareMacro(me, "with_gt_lock", "WITH-GT-LOCK");
        declareMacro(me, "with_gt_truth", "WITH-GT-TRUTH");
        declareMacro(me, "with_gt_pred", "WITH-GT-PRED");
        declareMacro(me, "with_gt_combine_fn", "WITH-GT-COMBINE-FN");
        declareMacro(me, "with_gt_base_fn", "WITH-GT-BASE-FN");
        declareMacro(me, "with_gt_step_fn", "WITH-GT-STEP-FN");
        declareMacro(me, "with_tt_step_fn", "WITH-TT-STEP-FN");
        declareMacro(me, "with_gt_gather_fn", "WITH-GT-GATHER-FN");
        declareMacro(me, "with_gt_compose_fn", "WITH-GT-COMPOSE-FN");
        declareMacro(me, "with_gt_compare_fn", "WITH-GT-COMPARE-FN");
        declareMacro(me, "with_gt_target", "WITH-GT-TARGET");
        declareMacro(me, "with_gt_searcher", "WITH-GT-SEARCHER");
        declareMacro(me, "with_gt_compose_pred", "WITH-GT-COMPOSE-PRED");
        declareMacro(me, "with_gt_compose_index_arg", "WITH-GT-COMPOSE-INDEX-ARG");
        declareMacro(me, "with_gt_compose_gather_arg", "WITH-GT-COMPOSE-GATHER-ARG");
        declareMacro(me, "with_gt_link_support", "WITH-GT-LINK-SUPPORT");
        declareMacro(me, "unless_gt_error", "UNLESS-GT-ERROR");
        declareMacro(me, "without_gt_type_checking", "WITHOUT-GT-TYPE-CHECKING");
        declareMacro(me, "gt_check_type", "GT-CHECK-TYPE");
        declareMacro(me, "possibly_with_gt_cutoff", "POSSIBLY-WITH-GT-CUTOFF");
        declareMacro(me, "with_gt_depth_cutoff", "WITH-GT-DEPTH-CUTOFF");
        declareMacro(me, "with_gt_time_cutoff", "WITH-GT-TIME-CUTOFF");
        declareMacro(me, "with_gt_answers_cutoff", "WITH-GT-ANSWERS-CUTOFF");
        declareMacro(me, "possibly_with_number_of_answers_cutoff", "POSSIBLY-WITH-NUMBER-OF-ANSWERS-CUTOFF");
        declareMacro(me, "possibly_with_gt_edge_list_accumulation", "POSSIBLY-WITH-GT-EDGE-LIST-ACCUMULATION");
        declareMacro(me, "with_gt_edge_list_return", "WITH-GT-EDGE-LIST-RETURN");
        declareMacro(me, "gt_search_with_this_hashtable", "GT-SEARCH-WITH-THIS-HASHTABLE");
        declareMacro(me, "gt_search_with_dynamic_hash", "GT-SEARCH-WITH-DYNAMIC-HASH");
        declareMacro(me, "gt_within_transitive_via_arg", "GT-WITHIN-TRANSITIVE-VIA-ARG");
        declareMacro(me, "without_gt_sksi", "WITHOUT-GT-SKSI");
        declareMacro(me, "with_gt_sksi", "WITH-GT-SKSI");
        return NIL;
    }

    public static SubLObject init_gt_macros_file() {
        defparameter("*GT-RECURSION-CUTOFF*", $int$64);
        return NIL;
    }

    public static SubLObject setup_gt_macros_file() {
        return NIL;
    }

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

    
}

/**
 * Total time: 149 ms
 */
