package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.at_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.at_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class at_macros extends SubLTranslatedFile {
    public static final SubLFile me = new at_macros();

    public static final String myName = "com.cyc.cycjava.cycl.at_macros";

    public static final String myFingerPrint = "cdfa3240a573a39d2132cbfd46cf1def86f515bb9ac9820be5b78b2a65f180b0";



    public static final SubLList $list1 = list(list(makeSymbol("*DEFN-FN-HISTORY*"), list(makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), list(makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*DEFN-COL-HISTORY*"), list(makeSymbol("MAKE-DEFN-COL-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), list(makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));



    public static final SubLList $list3 = list(list(makeSymbol("CLEAR-DEFN-SPACE")));

    public static final SubLList $list4 = list(list(makeSymbol("*DEFN-FN-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*DEFN-COL-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));

    public static final SubLSymbol MAKE_DEFN_FN_HISTORY_TABLE = makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE");

    public static final SubLSymbol WITH_NEW_DEFN_SPACE = makeSymbol("WITH-NEW-DEFN-SPACE");

    public static final SubLSymbol MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE");

    public static final SubLSymbol MAKE_DEFN_COL_HISTORY_TABLE = makeSymbol("MAKE-DEFN-COL-HISTORY-TABLE");

    public static final SubLSymbol MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE");

    public static final SubLSymbol POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE");

    public static final SubLSymbol WITH_POSSIBLY_NEW_DEFN_SPACE = makeSymbol("WITH-POSSIBLY-NEW-DEFN-SPACE");

    public static final SubLSymbol POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE");

    public static final SubLSymbol POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE");

    public static final SubLSymbol POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE");

    public static final SubLList $list15 = list(makeSymbol("DEFNS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_defns$ = makeSymbol("*AT-DEFNS*");

    public static final SubLList $list17 = list(makeSymbol("DEFN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_defn$ = makeSymbol("*AT-DEFN*");

    public static final SubLSymbol $at_functions$ = makeSymbol("*AT-FUNCTIONS*");

    public static final SubLSymbol $at_function$ = makeSymbol("*AT-FUNCTION*");

    public static final SubLList $list21 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list22 = list(makeSymbol("*AT-RESULT*"));



    public static final SubLList $list24 = list(makeSymbol("BOOLEAN-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list25 = list(makeSymbol("*AT-SOME-ARG-ISA?*"));

    public static final SubLList $list26 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_mode$ = makeSymbol("*AT-MODE*");

    public static final SubLList $list28 = list(makeSymbol("COL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_ind_isa$ = makeSymbol("*AT-IND-ISA*");

    public static final SubLList $list30 = list(makeSymbol("TERM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_ind_genl$ = makeSymbol("*AT-IND-GENL*");

    public static final SubLList $list32 = list(makeSymbol("CONSTRAINT-PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_pred$ = makeSymbol("*AT-PRED*");



    public static final SubLSymbol $at_inverse$ = makeSymbol("*AT-INVERSE*");

    public static final SubLList $list36 = list(makeSymbol("CAND"), makeSymbol("*AT-CHECK-GENL-INVERSES?*"), makeSymbol("*AT-INVERSE*"));

    public static final SubLList $list37 = list(list(makeSymbol("*AT-MAPPING-GENL-INVERSES?*"), T));

    public static final SubLList $list38 = list(makeSymbol("RELN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym39$GENL_SOMETHING_ = makeUninternedSymbol("GENL-SOMETHING?");









    private static final SubLSymbol GENL_PREDICATES = makeSymbol("GENL-PREDICATES");

    private static final SubLSymbol GENL_INVERSES = makeSymbol("GENL-INVERSES");

    public static final SubLSymbol $at_reln$ = makeSymbol("*AT-RELN*");

    public static final SubLSymbol $sym47$_AT_SEARCH_GENL_PREDS__ = makeSymbol("*AT-SEARCH-GENL-PREDS?*");



    public static final SubLSymbol $sym49$_AT_CHECK_GENL_PREDS__ = makeSymbol("*AT-CHECK-GENL-PREDS?*");

    public static final SubLSymbol $sym50$_AT_SEARCH_GENL_INVERSES__ = makeSymbol("*AT-SEARCH-GENL-INVERSES?*");

    public static final SubLSymbol $sym51$_AT_CHECK_GENL_INVERSES__ = makeSymbol("*AT-CHECK-GENL-INVERSES?*");

    public static final SubLSymbol $at_arg$ = makeSymbol("*AT-ARG*");

    public static final SubLList $list53 = list(makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_arg_type$ = makeSymbol("*AT-ARG-TYPE*");

    public static final SubLList $list55 = list(makeSymbol("INTEGER"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list57 = list(makeSymbol("INTEGERP"));

    public static final SubLSymbol $at_argnum$ = makeSymbol("*AT-ARGNUM*");

    public static final SubLSymbol $at_ind_arg$ = makeSymbol("*AT-IND-ARG*");

    public static final SubLSymbol $at_ind_argnum$ = makeSymbol("*AT-IND-ARGNUM*");

    public static final SubLList $list61 = list(makeSymbol("COLLECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list62 = list(makeSymbol("FORT-P"));

    public static final SubLSymbol $at_arg_isa$ = makeSymbol("*AT-ARG-ISA*");

    public static final SubLList $list64 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list65 = list(makeSymbol("FUNCTION-SPEC-P"));

    public static final SubLSymbol $at_base_fn$ = makeSymbol("*AT-BASE-FN*");

    public static final SubLSymbol $at_source$ = makeSymbol("*AT-SOURCE*");

    public static final SubLList $list68 = list(makeSymbol("GAF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_constraint_gaf$ = makeSymbol("*AT-CONSTRAINT-GAF*");

    public static final SubLList $list70 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym71$__ = makeSymbol(">=");

    public static final SubLSymbol $at_test_level$ = makeSymbol("*AT-TEST-LEVEL*");

    public static final SubLSymbol $at_trace_level$ = makeSymbol("*AT-TRACE-LEVEL*");

    public static final SubLSymbol $defn_test_level$ = makeSymbol("*DEFN-TEST-LEVEL*");

    public static final SubLSymbol $defn_trace_level$ = makeSymbol("*DEFN-TRACE-LEVEL*");

    public static final SubLList $list76 = list(list(makeSymbol("*GATHER-AT-CONSTRAINTS?*"), T));

    public static final SubLList $list77 = list(list(makeSymbol("CLRHASH"), makeSymbol("*AT-ISA-CONSTRAINTS*")), list(makeSymbol("CLRHASH"), makeSymbol("*AT-GENL-CONSTRAINTS*")));

    public static final SubLList $list78 = list(list(makeSymbol("*GATHER-AT-ASSERTIONS?*"), T));

    public static final SubLList $list79 = list(list(makeSymbol("CLRHASH"), makeSymbol("*AT-ISA-ASSERTIONS*")), list(makeSymbol("CLRHASH"), makeSymbol("*AT-GENL-ASSERTIONS*")));

    public static final SubLList $list80 = list(list(makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*"), T), makeSymbol("*AT-FORMAT-VIOLATIONS*"));

    public static final SubLList $list81 = list(list(makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*"), T), makeSymbol("*AT-DIFFERENT-VIOLATIONS*"));

    public static final SubLList $list82 = list(list(makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*"), T), makeSymbol("*AT-PREDICATE-VIOLATIONS*"));

    public static final SubLSymbol CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");

    private static final SubLSymbol $AT_MAPPING_DONE = makeKeyword("AT-MAPPING-DONE");

    public static final SubLList $list85 = list(list(makeSymbol("*WITHIN-AT-MAPPING?*"), T));

    public static final SubLList $list86 = list(makeSymbol("SYMBOL"));







    public static final SubLList $list90 = list(makeSymbol("*AT-COLLECTION-SPECIFIC-DEFNS*"));

    public static final SubLList $list91 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARG-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $str92$__a_METERS_ = makeString("*~a-METERS*");

    public static final SubLString $str93$_a_METERED = makeString("~a-METERED");

    public static final SubLString $str94$RESET__a_METERS = makeString("RESET-~a-METERS");

    public static final SubLSymbol DEFVAR_DEFN = makeSymbol("DEFVAR-DEFN");

    public static final SubLList $list96 = list(makeSymbol("MAKE-HASH-TABLE"), EIGHT_INTEGER);

    public static final SubLString $str97$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function ~a");









    public static final SubLList $list102 = list(ZERO_INTEGER);



    public static final SubLList $list104 = list(NIL);











    public static final SubLList $list110 = list(list(makeSymbol("RET"), NIL));





    public static final SubLList $list113 = list(makeSymbol("CACHE"), makeSymbol("*DEFN-METER-CACHES*"));

    public static final SubLList $list114 = list(list(makeSymbol("GETHASH"), makeKeyword("FUNCTION"), makeSymbol("CACHE")));

    public static final SubLList $list115 = list(list(makeSymbol("CSETQ"), makeSymbol("*DEFN-METER-CACHES*"), list(makeSymbol("DELETE"), makeSymbol("CACHE"), makeSymbol("*DEFN-METER-CACHES*"))), list(makeSymbol("CLRHASH"), makeSymbol("CACHE")));



    public static final SubLList $list117 = list(makeSymbol("*DEFN-METER-CACHES*"));



    public static final SubLSymbol $sym119$_DEFN_METERS__ = makeSymbol("*DEFN-METERS?*");

    public static final SubLList $list120 = list(makeSymbol("RESULT"), makeSymbol("RUN-TIME"));











    public static final SubLList $list126 = list(list(makeSymbol("RET"), makeSymbol("RESULT")));



    public static final SubLList $list128 = list(list(makeSymbol("CONSTRAINT-VAR"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list129 = list(makeKeyword("DONE-VAR"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol $sym132$ALL_ARG_CONSTRAINTS = makeUninternedSymbol("ALL-ARG-CONSTRAINTS");

    public static final SubLSymbol DTLAC_LIST_GENERATOR = makeSymbol("DTLAC-LIST-GENERATOR");



    public static final SubLSymbol DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS = makeSymbol("DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLSymbol $sym138$ALL_ARG_CONSTRAINTS = makeUninternedSymbol("ALL-ARG-CONSTRAINTS");

    public static final SubLSymbol DAACIO_LIST_GENERATOR = makeSymbol("DAACIO-LIST-GENERATOR");

    public static final SubLSymbol DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT = makeSymbol("DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT");

    public static final SubLList $list141 = list(list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), T), list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), T));

    public static final SubLList $list142 = list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*NOTING-WFF-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"));

    public static final SubLList $list143 = list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*NOTING-WFF-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), makeSymbol("*PROVIDE-WFF-SUGGESTIONS?*"));

    public static SubLObject with_new_defn_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list1, bq_cons(CUNWIND_PROTECT, append(body, $list3)));
    }

    public static SubLObject with_possibly_new_defn_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list4, bq_cons(CUNWIND_PROTECT, append(body, $list3)));
    }

    public static SubLObject make_defn_fn_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return make_hash_table(at_vars.$defn_fn_history_default_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_quoted_defn_fn_history_table() {
        return make_defn_fn_history_table();
    }

    public static SubLObject make_defn_col_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return make_hash_table(at_vars.$defn_col_history_default_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_quoted_defn_col_history_table() {
        return make_defn_col_history_table();
    }

    public static SubLObject possibly_make_defn_fn_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.uninitialized_p(at_vars.$defn_fn_history$.getDynamicValue(thread))) {
            return make_defn_fn_history_table();
        }
        return at_vars.$defn_fn_history$.getDynamicValue(thread);
    }

    public static SubLObject possibly_make_quoted_defn_fn_history_table() {
        return possibly_make_defn_fn_history_table();
    }

    public static SubLObject possibly_make_defn_col_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.uninitialized_p(at_vars.$defn_col_history$.getDynamicValue(thread))) {
            return make_defn_col_history_table();
        }
        return at_vars.$defn_col_history$.getDynamicValue(thread);
    }

    public static SubLObject possibly_make_quoted_defn_col_history_table() {
        return possibly_make_defn_col_history_table();
    }

    public static SubLObject with_at_defns(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_defns = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        v_defns = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_defns$, v_defns)), append(body, NIL));
    }

    public static SubLObject with_at_defn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject defn = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        defn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_defn$, defn)), append(body, NIL));
    }

    public static SubLObject with_at_functions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_defns = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        v_defns = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_functions$, v_defns)), append(body, NIL));
    }

    public static SubLObject with_at_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject defn = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        defn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_function$, defn)), append(body, NIL));
    }

    public static SubLObject with_at_result(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result_var = NIL;
        destructuring_bind_must_consp(current, datum, $list21);
        result_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, $list22, append(body, list(listS(CSETQ, result_var, $list22))));
    }

    public static SubLObject with_some_at_arg_isa_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject boolean_var = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        boolean_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, $list25, append(body, list(listS(CSETQ, boolean_var, $list25))));
    }

    public static SubLObject with_at_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        mode = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_mode$, mode)), append(body, NIL));
    }

    public static SubLObject with_at_ind_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject col = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        col = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_ind_isa$, col)), append(body, NIL));
    }

    public static SubLObject with_at_ind_genl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        v_term = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_ind_genl$, v_term)), append(body, NIL));
    }

    public static SubLObject with_at_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject constraint_pred = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        constraint_pred = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, list(list($at_pred$, constraint_pred)), listS(PWHEN, $at_pred$, append(body, NIL)));
    }

    public static SubLObject with_at_inverse(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject constraint_pred = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        constraint_pred = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_inverse$, constraint_pred)), append(body, NIL));
    }

    public static SubLObject with_at_mapping_inverses(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PWHEN, $list36, listS(CLET, $list37, append(body, NIL)));
    }

    public static SubLObject with_at_reln(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject reln = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        reln = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject genl_somethingP = $sym39$GENL_SOMETHING_;
        return list(PROGN, listS(CLET, list(list(genl_somethingP, list(FWHEN, list(FORT_P, reln), list(COR, list(GENL_PREDICATES, reln), list(GENL_INVERSES, reln)))), list($at_reln$, reln), list($sym47$_AT_SEARCH_GENL_PREDS__, list(CAND, $sym49$_AT_CHECK_GENL_PREDS__, genl_somethingP)), list($sym50$_AT_SEARCH_GENL_INVERSES__, list(CAND, $sym51$_AT_CHECK_GENL_INVERSES__, genl_somethingP))), append(body, NIL)));
    }

    public static SubLObject with_at_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        v_term = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_arg$, v_term)), append(body, NIL));
    }

    public static SubLObject with_at_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list53);
        type = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_arg_type$, type)), append(body, NIL));
    }

    public static SubLObject with_at_argnum(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject integer = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        integer = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, integer, $list57), listS(CLET, list(list($at_argnum$, integer)), append(body, NIL)));
    }

    public static SubLObject with_at_ind_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        v_term = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_ind_arg$, v_term)), append(body, NIL));
    }

    public static SubLObject with_at_ind_argnum(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject integer = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        integer = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, integer, $list57), listS(CLET, list(list($at_ind_argnum$, integer)), append(body, NIL)));
    }

    public static SubLObject with_at_arg_isa(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject collection = NIL;
        destructuring_bind_must_consp(current, datum, $list61);
        collection = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, collection, $list62), listS(CLET, list(list($at_arg_isa$, collection)), append(body, NIL)));
    }

    public static SubLObject with_at_base_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        fn = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, fn, $list65), listS(CLET, list(list($at_base_fn$, fn)), append(body, NIL)));
    }

    public static SubLObject with_at_source(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list30);
        v_term = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_source$, v_term)), append(body, NIL));
    }

    public static SubLObject with_at_constraint_gaf(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject gaf = NIL;
        destructuring_bind_must_consp(current, datum, $list68);
        gaf = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($at_constraint_gaf$, gaf)), append(body, NIL));
    }

    public static SubLObject at_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list70);
        level = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list($sym71$__, $at_test_level$, level), append(body, NIL));
    }

    public static SubLObject at_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list70);
        level = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list($sym71$__, $at_trace_level$, level), append(body, NIL));
    }

    public static SubLObject defn_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list70);
        level = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list($sym71$__, $defn_test_level$, level), append(body, NIL));
    }

    public static SubLObject defn_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list70);
        level = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list($sym71$__, $defn_trace_level$, level), append(body, NIL));
    }

    public static SubLObject gathering_at_constraints(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list76, append(body, $list77));
    }

    public static SubLObject gathering_at_assertions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list78, append(body, $list79));
    }

    public static SubLObject gathering_at_format_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list80, append(body, NIL));
    }

    public static SubLObject gathering_at_different_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list81, append(body, NIL));
    }

    public static SubLObject gathering_at_predicate_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list82, append(body, NIL));
    }

    public static SubLObject until_at_mapping_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CCATCH_IGNORE, $AT_MAPPING_DONE, listS(CLET, $list85, append(body, NIL)));
    }

    public static SubLObject declare_collection_specific_defn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject symbol = NIL;
        destructuring_bind_must_consp(current, datum, $list86);
        symbol = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, list(SYMBOLP, list(QUOTE, symbol)), listS(CPUSHNEW, list(QUOTE, symbol), $list90));
        }
        cdestructuring_bind_error(datum, $list86);
        return NIL;
    }

    public static SubLObject define_defn_metered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list91);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list91);
        final SubLObject temp = current.rest();
        final SubLObject arg_list;
        current = arg_list = current.first();
        final SubLObject body;
        current = body = temp;
        final SubLObject meter_cache = intern(format(NIL, $str92$__a_METERS_, name), UNPROVIDED);
        final SubLObject metered_function = intern(format(NIL, $str93$_a_METERED, name), UNPROVIDED);
        final SubLObject reset_function = intern(format(NIL, $str94$RESET__a_METERS, name), UNPROVIDED);
        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
        return list(new SubLObject[]{ PROGN, list(DEFVAR_DEFN, meter_cache, $list96, format(NIL, $str97$metering_cache_for_calls_to_defn_, name)), listS(DEFINE, new SubLObject[]{ reset_function, NIL, listS(CSETF, list(GETHASH, $CALLS, meter_cache), $list102), listS(CSETF, list(GETHASH, $TIMES, meter_cache), $list104), listS(CSETF, list(GETHASH, $RESULTS, meter_cache), $list104), listS(CSETF, list(GETHASH, $ARGS, meter_cache), $list104), list(SETHASH, $ARG_LIST, meter_cache, list(QUOTE, args)), list(SETHASH, $FUNCTION, meter_cache, list(QUOTE, name)), $list110 }), list(reset_function), list(SETHASH, $RESET, meter_cache, list(QUOTE, reset_function)), listS(DEFINE, metered_function, arg_list, append(body, NIL)), list(CDOLIST, $list113, listS(PWHEN, listS(EQ, list(QUOTE, name), $list114), $list115)), listS(CPUSH, meter_cache, $list117), list(DEFINE, name, arg_list, list(PIF, $sym119$_DEFN_METERS__, listS(CLET, new SubLObject[]{ $list120, list(CTIME, RUN_TIME, list(CSETQ, RESULT, bq_cons(metered_function, append(args, NIL)))), list(CINC, list(GETHASH, $CALLS, meter_cache)), list(CPUSH, RUN_TIME, list(GETHASH, $TIMES, meter_cache)), list(CPUSH, RESULT, list(GETHASH, $RESULTS, meter_cache)), list(CPUSH, bq_cons(LIST, append(args, NIL)), list(GETHASH, $ARGS, meter_cache)), $list126 }), list(RET, bq_cons(metered_function, append(args, NIL))))) });
    }

    public static SubLObject do_all_top_level_arg_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraint_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list128);
        constraint_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list128);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list128);
            if (NIL == member(current_$1, $list129, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list128);
        }
        final SubLObject done_var_tail = property_list_member($DONE_VAR, current);
        final SubLObject done_var = (NIL != done_var_tail) ? cadr(done_var_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject all_arg_constraints = $sym132$ALL_ARG_CONSTRAINTS;
        return list(CLET, list(list(all_arg_constraints, list(DTLAC_LIST_GENERATOR, formula))), listS(CSOME, list(constraint_var, all_arg_constraints, done_var), append(body, NIL)));
    }

    public static SubLObject dtlac_list_generator(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = arg_type.sorted_top_level_arg_constraints_on_formula(formula);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject do_all_arg_constraints_inside_out(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraint_var = NIL;
        SubLObject formula = NIL;
        destructuring_bind_must_consp(current, datum, $list128);
        constraint_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list128);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list128);
            if (NIL == member(current_$2, $list129, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list128);
        }
        final SubLObject done_var_tail = property_list_member($DONE_VAR, current);
        final SubLObject done_var = (NIL != done_var_tail) ? cadr(done_var_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject all_arg_constraints = $sym138$ALL_ARG_CONSTRAINTS;
        return list(CLET, list(list(all_arg_constraints, list(DAACIO_LIST_GENERATOR, formula))), listS(CSOME, list(constraint_var, all_arg_constraints, done_var), append(body, NIL)));
    }

    public static SubLObject daacio_list_generator(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = arg_type.inside_out_arg_constraints_on_formula(formula);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gather_wff_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list141, append(body, NIL));
    }

    public static SubLObject dont_gather_wff_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list142, append(body, NIL));
    }

    public static SubLObject dont_gather_wff_violations_or_suggestions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list143, append(body, NIL));
    }

    public static SubLObject declare_at_macros_file() {
        declareMacro(me, "with_new_defn_space", "WITH-NEW-DEFN-SPACE");
        declareMacro(me, "with_possibly_new_defn_space", "WITH-POSSIBLY-NEW-DEFN-SPACE");
        declareFunction(me, "make_defn_fn_history_table", "MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        declareFunction(me, "make_quoted_defn_fn_history_table", "MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        declareFunction(me, "make_defn_col_history_table", "MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        declareFunction(me, "make_quoted_defn_col_history_table", "MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        declareFunction(me, "possibly_make_defn_fn_history_table", "POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        declareFunction(me, "possibly_make_quoted_defn_fn_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        declareFunction(me, "possibly_make_defn_col_history_table", "POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        declareFunction(me, "possibly_make_quoted_defn_col_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        declareMacro(me, "with_at_defns", "WITH-AT-DEFNS");
        declareMacro(me, "with_at_defn", "WITH-AT-DEFN");
        declareMacro(me, "with_at_functions", "WITH-AT-FUNCTIONS");
        declareMacro(me, "with_at_function", "WITH-AT-FUNCTION");
        declareMacro(me, "with_at_result", "WITH-AT-RESULT");
        declareMacro(me, "with_some_at_arg_isa_var", "WITH-SOME-AT-ARG-ISA-VAR");
        declareMacro(me, "with_at_mode", "WITH-AT-MODE");
        declareMacro(me, "with_at_ind_isa", "WITH-AT-IND-ISA");
        declareMacro(me, "with_at_ind_genl", "WITH-AT-IND-GENL");
        declareMacro(me, "with_at_pred", "WITH-AT-PRED");
        declareMacro(me, "with_at_inverse", "WITH-AT-INVERSE");
        declareMacro(me, "with_at_mapping_inverses", "WITH-AT-MAPPING-INVERSES");
        declareMacro(me, "with_at_reln", "WITH-AT-RELN");
        declareMacro(me, "with_at_arg", "WITH-AT-ARG");
        declareMacro(me, "with_at_type", "WITH-AT-TYPE");
        declareMacro(me, "with_at_argnum", "WITH-AT-ARGNUM");
        declareMacro(me, "with_at_ind_arg", "WITH-AT-IND-ARG");
        declareMacro(me, "with_at_ind_argnum", "WITH-AT-IND-ARGNUM");
        declareMacro(me, "with_at_arg_isa", "WITH-AT-ARG-ISA");
        declareMacro(me, "with_at_base_fn", "WITH-AT-BASE-FN");
        declareMacro(me, "with_at_source", "WITH-AT-SOURCE");
        declareMacro(me, "with_at_constraint_gaf", "WITH-AT-CONSTRAINT-GAF");
        declareMacro(me, "at_test", "AT-TEST");
        declareMacro(me, "at_trace", "AT-TRACE");
        declareMacro(me, "defn_test", "DEFN-TEST");
        declareMacro(me, "defn_trace", "DEFN-TRACE");
        declareMacro(me, "gathering_at_constraints", "GATHERING-AT-CONSTRAINTS");
        declareMacro(me, "gathering_at_assertions", "GATHERING-AT-ASSERTIONS");
        declareMacro(me, "gathering_at_format_violations", "GATHERING-AT-FORMAT-VIOLATIONS");
        declareMacro(me, "gathering_at_different_violations", "GATHERING-AT-DIFFERENT-VIOLATIONS");
        declareMacro(me, "gathering_at_predicate_violations", "GATHERING-AT-PREDICATE-VIOLATIONS");
        declareMacro(me, "until_at_mapping_finished", "UNTIL-AT-MAPPING-FINISHED");
        declareMacro(me, "declare_collection_specific_defn", "DECLARE-COLLECTION-SPECIFIC-DEFN");
        declareMacro(me, "define_defn_metered", "DEFINE-DEFN-METERED");
        declareMacro(me, "do_all_top_level_arg_constraints", "DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS");
        declareFunction(me, "dtlac_list_generator", "DTLAC-LIST-GENERATOR", 1, 0, false);
        declareMacro(me, "do_all_arg_constraints_inside_out", "DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT");
        declareFunction(me, "daacio_list_generator", "DAACIO-LIST-GENERATOR", 1, 0, false);
        declareMacro(me, "gather_wff_violations", "GATHER-WFF-VIOLATIONS");
        declareMacro(me, "dont_gather_wff_violations", "DONT-GATHER-WFF-VIOLATIONS");
        declareMacro(me, "dont_gather_wff_violations_or_suggestions", "DONT-GATHER-WFF-VIOLATIONS-OR-SUGGESTIONS");
        return NIL;
    }

    public static SubLObject init_at_macros_file() {
        return NIL;
    }

    public static SubLObject setup_at_macros_file() {
        register_macro_helper(MAKE_DEFN_FN_HISTORY_TABLE, WITH_NEW_DEFN_SPACE);
        register_macro_helper(MAKE_QUOTED_DEFN_FN_HISTORY_TABLE, WITH_NEW_DEFN_SPACE);
        register_macro_helper(MAKE_DEFN_COL_HISTORY_TABLE, WITH_NEW_DEFN_SPACE);
        register_macro_helper(MAKE_QUOTED_DEFN_COL_HISTORY_TABLE, WITH_NEW_DEFN_SPACE);
        register_macro_helper(POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE, WITH_POSSIBLY_NEW_DEFN_SPACE);
        register_macro_helper(POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE, WITH_POSSIBLY_NEW_DEFN_SPACE);
        register_macro_helper(POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE, WITH_POSSIBLY_NEW_DEFN_SPACE);
        register_macro_helper(POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE, WITH_POSSIBLY_NEW_DEFN_SPACE);
        register_macro_helper(DTLAC_LIST_GENERATOR, DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS);
        register_macro_helper(DAACIO_LIST_GENERATOR, DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_at_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_at_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_at_macros_file();
    }

    static {

















































































































































    }
}

/**
 * Total time: 260 ms
 */
