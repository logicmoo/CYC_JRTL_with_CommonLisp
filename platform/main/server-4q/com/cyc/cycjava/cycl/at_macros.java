/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class at_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new at_macros();

 public static final String myName = "com.cyc.cycjava.cycl.at_macros";


    static private final SubLList $list1 = list(list(makeSymbol("*DEFN-FN-HISTORY*"), list(makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), list(makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*DEFN-COL-HISTORY*"), list(makeSymbol("MAKE-DEFN-COL-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), list(makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));

    static private final SubLList $list3 = list(list(makeSymbol("CLEAR-DEFN-SPACE")));

    static private final SubLList $list4 = list(list(makeSymbol("*DEFN-FN-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*DEFN-COL-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));

    private static final SubLSymbol MAKE_DEFN_FN_HISTORY_TABLE = makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE");

    private static final SubLSymbol WITH_NEW_DEFN_SPACE = makeSymbol("WITH-NEW-DEFN-SPACE");

    private static final SubLSymbol MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE");

    private static final SubLSymbol MAKE_DEFN_COL_HISTORY_TABLE = makeSymbol("MAKE-DEFN-COL-HISTORY-TABLE");

    private static final SubLSymbol MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE");

    private static final SubLSymbol POSSIBLY_MAKE_DEFN_FN_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE");

    private static final SubLSymbol WITH_POSSIBLY_NEW_DEFN_SPACE = makeSymbol("WITH-POSSIBLY-NEW-DEFN-SPACE");

    private static final SubLSymbol POSSIBLY_MAKE_QUOTED_DEFN_FN_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE");

    private static final SubLSymbol POSSIBLY_MAKE_DEFN_COL_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE");

    private static final SubLSymbol POSSIBLY_MAKE_QUOTED_DEFN_COL_HISTORY_TABLE = makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE");

    static private final SubLList $list15 = list(makeSymbol("DEFNS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_defns$ = makeSymbol("*AT-DEFNS*");

    static private final SubLList $list17 = list(makeSymbol("DEFN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_defn$ = makeSymbol("*AT-DEFN*");

    public static final SubLSymbol $at_functions$ = makeSymbol("*AT-FUNCTIONS*");

    public static final SubLSymbol $at_function$ = makeSymbol("*AT-FUNCTION*");

    static private final SubLList $list21 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list22 = list(makeSymbol("*AT-RESULT*"));

    static private final SubLList $list24 = list(makeSymbol("BOOLEAN-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list25 = list(makeSymbol("*AT-SOME-ARG-ISA?*"));

    static private final SubLList $list26 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_mode$ = makeSymbol("*AT-MODE*");

    static private final SubLList $list28 = list(makeSymbol("COL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_ind_isa$ = makeSymbol("*AT-IND-ISA*");

    static private final SubLList $list30 = list(makeSymbol("TERM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_ind_genl$ = makeSymbol("*AT-IND-GENL*");

    static private final SubLList $list32 = list(makeSymbol("CONSTRAINT-PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_pred$ = makeSymbol("*AT-PRED*");

    public static final SubLSymbol $at_inverse$ = makeSymbol("*AT-INVERSE*");

    static private final SubLList $list36 = list(makeSymbol("CAND"), makeSymbol("*AT-CHECK-GENL-INVERSES?*"), makeSymbol("*AT-INVERSE*"));

    static private final SubLList $list37 = list(list(makeSymbol("*AT-MAPPING-GENL-INVERSES?*"), T));

    static private final SubLList $list38 = list(makeSymbol("RELN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym39$GENL_SOMETHING_ = makeUninternedSymbol("GENL-SOMETHING?");

    private static final SubLSymbol GENL_PREDICATES = makeSymbol("GENL-PREDICATES");

    private static final SubLSymbol GENL_INVERSES = makeSymbol("GENL-INVERSES");

    public static final SubLSymbol $at_reln$ = makeSymbol("*AT-RELN*");

    public static final SubLSymbol $at_search_genl_predsP$ = makeSymbol("*AT-SEARCH-GENL-PREDS?*");

    public static final SubLSymbol $at_check_genl_predsP$ = makeSymbol("*AT-CHECK-GENL-PREDS?*");

    public static final SubLSymbol $at_search_genl_inversesP$ = makeSymbol("*AT-SEARCH-GENL-INVERSES?*");

    public static final SubLSymbol $at_check_genl_inversesP$ = makeSymbol("*AT-CHECK-GENL-INVERSES?*");

    public static final SubLSymbol $at_arg$ = makeSymbol("*AT-ARG*");

    static private final SubLList $list53 = list(makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_arg_type$ = makeSymbol("*AT-ARG-TYPE*");

    static private final SubLList $list55 = list(makeSymbol("INTEGER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list57 = list(makeSymbol("INTEGERP"));

    public static final SubLSymbol $at_argnum$ = makeSymbol("*AT-ARGNUM*");

    public static final SubLSymbol $at_ind_arg$ = makeSymbol("*AT-IND-ARG*");

    public static final SubLSymbol $at_ind_argnum$ = makeSymbol("*AT-IND-ARGNUM*");

    static private final SubLList $list61 = list(makeSymbol("COLLECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list62 = list(makeSymbol("FORT-P"));

    public static final SubLSymbol $at_arg_isa$ = makeSymbol("*AT-ARG-ISA*");

    static private final SubLList $list64 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list65 = list(makeSymbol("FUNCTION-SPEC-P"));

    public static final SubLSymbol $at_base_fn$ = makeSymbol("*AT-BASE-FN*");

    public static final SubLSymbol $at_source$ = makeSymbol("*AT-SOURCE*");

    static private final SubLList $list68 = list(makeSymbol("GAF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $at_constraint_gaf$ = makeSymbol("*AT-CONSTRAINT-GAF*");

    static private final SubLList $list70 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym71$__ = makeSymbol(">=");

    public static final SubLSymbol $at_test_level$ = makeSymbol("*AT-TEST-LEVEL*");

    public static final SubLSymbol $at_trace_level$ = makeSymbol("*AT-TRACE-LEVEL*");

    public static final SubLSymbol $defn_test_level$ = makeSymbol("*DEFN-TEST-LEVEL*");

    public static final SubLSymbol $defn_trace_level$ = makeSymbol("*DEFN-TRACE-LEVEL*");

    static private final SubLList $list76 = list(list(makeSymbol("*GATHER-AT-CONSTRAINTS?*"), T));

    static private final SubLList $list77 = list(list(makeSymbol("CLRHASH"), makeSymbol("*AT-ISA-CONSTRAINTS*")), list(makeSymbol("CLRHASH"), makeSymbol("*AT-GENL-CONSTRAINTS*")));

    static private final SubLList $list78 = list(list(makeSymbol("*GATHER-AT-ASSERTIONS?*"), T));

    static private final SubLList $list79 = list(list(makeSymbol("CLRHASH"), makeSymbol("*AT-ISA-ASSERTIONS*")), list(makeSymbol("CLRHASH"), makeSymbol("*AT-GENL-ASSERTIONS*")));

    static private final SubLList $list80 = list(list(makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*"), T), makeSymbol("*AT-FORMAT-VIOLATIONS*"));

    static private final SubLList $list81 = list(list(makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*"), T), makeSymbol("*AT-DIFFERENT-VIOLATIONS*"));

    static private final SubLList $list82 = list(list(makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*"), T), makeSymbol("*AT-PREDICATE-VIOLATIONS*"));

    private static final SubLSymbol CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");

    private static final SubLSymbol $AT_MAPPING_DONE = makeKeyword("AT-MAPPING-DONE");

    static private final SubLList $list85 = list(list(makeSymbol("*WITHIN-AT-MAPPING?*"), T));

    static private final SubLList $list86 = list(makeSymbol("SYMBOL"));

    static private final SubLList $list90 = list(makeSymbol("*AT-COLLECTION-SPECIFIC-DEFNS*"));

    static private final SubLList $list91 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARG-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str92$__a_METERS_ = makeString("*~a-METERS*");

    static private final SubLString $str93$_a_METERED = makeString("~a-METERED");

    static private final SubLString $str94$RESET__a_METERS = makeString("RESET-~a-METERS");

    private static final SubLSymbol DEFVAR_DEFN = makeSymbol("DEFVAR-DEFN");

    static private final SubLList $list96 = list(makeSymbol("MAKE-HASH-TABLE"), EIGHT_INTEGER);

    static private final SubLString $str97$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function ~a");

    static private final SubLList $list102 = list(ZERO_INTEGER);

    static private final SubLList $list104 = list(NIL);

    static private final SubLList $list110 = list(list(RET, NIL));

    static private final SubLList $list113 = list(makeSymbol("CACHE"), makeSymbol("*DEFN-METER-CACHES*"));

    static private final SubLList $list114 = list(list(makeSymbol("GETHASH"), makeKeyword("FUNCTION"), makeSymbol("CACHE")));

    static private final SubLList $list115 = list(list(makeSymbol("CSETQ"), makeSymbol("*DEFN-METER-CACHES*"), list(makeSymbol("DELETE"), makeSymbol("CACHE"), makeSymbol("*DEFN-METER-CACHES*"))), list(makeSymbol("CLRHASH"), makeSymbol("CACHE")));

    static private final SubLList $list117 = list(makeSymbol("*DEFN-METER-CACHES*"));

    public static final SubLSymbol $defn_metersP$ = makeSymbol("*DEFN-METERS?*");

    static private final SubLList $list120 = list(makeSymbol("RESULT"), makeSymbol("RUN-TIME"));

    static private final SubLList $list126 = list(list(RET, makeSymbol("RESULT")));

    static private final SubLList $list128 = list(list(makeSymbol("CONSTRAINT-VAR"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list129 = list(makeKeyword("DONE-VAR"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym132$ALL_ARG_CONSTRAINTS = makeUninternedSymbol("ALL-ARG-CONSTRAINTS");

    private static final SubLSymbol DTLAC_LIST_GENERATOR = makeSymbol("DTLAC-LIST-GENERATOR");

    private static final SubLSymbol DO_ALL_TOP_LEVEL_ARG_CONSTRAINTS = makeSymbol("DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS");



    static private final SubLSymbol $sym138$ALL_ARG_CONSTRAINTS = makeUninternedSymbol("ALL-ARG-CONSTRAINTS");

    private static final SubLSymbol DAACIO_LIST_GENERATOR = makeSymbol("DAACIO-LIST-GENERATOR");

    private static final SubLSymbol DO_ALL_ARG_CONSTRAINTS_INSIDE_OUT = makeSymbol("DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT");

    static private final SubLList $list141 = list(list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), T), list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), T));

    static private final SubLList $list142 = list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*NOTING-WFF-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"));

    static private final SubLList $list143 = list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*NOTING-WFF-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), makeSymbol("*PROVIDE-WFF-SUGGESTIONS?*"));

    // Definitions
    /**
     * execute <body> within a fresh sbhl search state
     */
    @LispMethod(comment = "execute <body> within a fresh sbhl search state")
    public static final SubLObject with_new_defn_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt1, bq_cons(CUNWIND_PROTECT, append(body, $list_alt3)));
        }
    }

    // Definitions
    /**
     * execute <body> within a fresh sbhl search state
     */
    @LispMethod(comment = "execute <body> within a fresh sbhl search state")
    public static SubLObject with_new_defn_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list1, bq_cons(CUNWIND_PROTECT, append(body, $list3)));
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_possibly_new_defn_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt4, bq_cons(CUNWIND_PROTECT, append(body, $list_alt3)));
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static SubLObject with_possibly_new_defn_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list4, bq_cons(CUNWIND_PROTECT, append(body, $list3)));
    }

    public static final SubLObject make_defn_fn_history_table_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return make_hash_table(at_vars.$defn_fn_history_default_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject make_defn_fn_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return make_hash_table(at_vars.$defn_fn_history_default_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject make_quoted_defn_fn_history_table_alt() {
        return com.cyc.cycjava.cycl.at_macros.make_defn_fn_history_table();
    }

    public static SubLObject make_quoted_defn_fn_history_table() {
        return make_defn_fn_history_table();
    }

    public static final SubLObject make_defn_col_history_table_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return make_hash_table(at_vars.$defn_col_history_default_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject make_defn_col_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return make_hash_table(at_vars.$defn_col_history_default_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject make_quoted_defn_col_history_table_alt() {
        return com.cyc.cycjava.cycl.at_macros.make_defn_col_history_table();
    }

    public static SubLObject make_quoted_defn_col_history_table() {
        return make_defn_col_history_table();
    }

    public static final SubLObject possibly_make_defn_fn_history_table_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != misc_utilities.uninitialized_p(at_vars.$defn_fn_history$.getDynamicValue(thread))) {
                return com.cyc.cycjava.cycl.at_macros.make_defn_fn_history_table();
            } else {
                return at_vars.$defn_fn_history$.getDynamicValue(thread);
            }
        }
    }

    public static SubLObject possibly_make_defn_fn_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.uninitialized_p(at_vars.$defn_fn_history$.getDynamicValue(thread))) {
            return make_defn_fn_history_table();
        }
        return at_vars.$defn_fn_history$.getDynamicValue(thread);
    }

    public static final SubLObject possibly_make_quoted_defn_fn_history_table_alt() {
        return com.cyc.cycjava.cycl.at_macros.possibly_make_defn_fn_history_table();
    }

    public static SubLObject possibly_make_quoted_defn_fn_history_table() {
        return possibly_make_defn_fn_history_table();
    }

    public static final SubLObject possibly_make_defn_col_history_table_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != misc_utilities.uninitialized_p(at_vars.$defn_col_history$.getDynamicValue(thread))) {
                return com.cyc.cycjava.cycl.at_macros.make_defn_col_history_table();
            } else {
                return at_vars.$defn_col_history$.getDynamicValue(thread);
            }
        }
    }

    public static SubLObject possibly_make_defn_col_history_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.uninitialized_p(at_vars.$defn_col_history$.getDynamicValue(thread))) {
            return make_defn_col_history_table();
        }
        return at_vars.$defn_col_history$.getDynamicValue(thread);
    }

    public static final SubLObject possibly_make_quoted_defn_col_history_table_alt() {
        return com.cyc.cycjava.cycl.at_macros.possibly_make_defn_col_history_table();
    }

    public static SubLObject possibly_make_quoted_defn_col_history_table() {
        return possibly_make_defn_col_history_table();
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_defns_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_defns = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            v_defns = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_defns$, v_defns)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_defn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject defn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            defn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_defn$, defn)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_functions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_defns = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            v_defns = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_functions$, v_defns)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_function_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject defn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt17);
            defn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_function$, defn)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_result_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            result_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt22, append(body, list(listS(CSETQ, result_var, $list_alt22))));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * assigne to BOOLEAN-VAR the value of *at-some-arg-isa?* (which is presumably bound while performing BODY)
     */
    @LispMethod(comment = "assigne to BOOLEAN-VAR the value of *at-some-arg-isa?* (which is presumably bound while performing BODY)")
    public static final SubLObject with_some_at_arg_isa_var_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject boolean_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            boolean_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt25, append(body, list(listS(CSETQ, boolean_var, $list_alt25))));
            }
        }
    }

    /**
     * assigne to BOOLEAN-VAR the value of *at-some-arg-isa?* (which is presumably bound while performing BODY)
     */
    @LispMethod(comment = "assigne to BOOLEAN-VAR the value of *at-some-arg-isa?* (which is presumably bound while performing BODY)")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mode = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            mode = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_mode$, mode)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_ind_isa_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject col = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt28);
            col = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_ind_isa$, col)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_ind_genl_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_ind_genl$, v_term)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_pred_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject constraint_pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            constraint_pred = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, list(list($at_pred$, constraint_pred)), listS(PWHEN, $at_pred$, append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * dynammically bind *at-inverse* with CONSTRAINT-PRED and execute BODY
     */
    @LispMethod(comment = "dynammically bind *at-inverse* with CONSTRAINT-PRED and execute BODY")
    public static final SubLObject with_at_inverse_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject constraint_pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt32);
            constraint_pred = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_inverse$, constraint_pred)), append(body, NIL));
            }
        }
    }

    /**
     * dynammically bind *at-inverse* with CONSTRAINT-PRED and execute BODY
     */
    @LispMethod(comment = "dynammically bind *at-inverse* with CONSTRAINT-PRED and execute BODY")
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

    /**
     * dynamically bind *at-search-genl-inverses?* to T if appropriate, and execute BODY
     */
    @LispMethod(comment = "dynamically bind *at-search-genl-inverses?* to T if appropriate, and execute BODY")
    public static final SubLObject with_at_mapping_inverses_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(PWHEN, $list_alt36, listS(CLET, $list_alt37, append(body, NIL)));
        }
    }

    /**
     * dynamically bind *at-search-genl-inverses?* to T if appropriate, and execute BODY
     */
    @LispMethod(comment = "dynamically bind *at-search-genl-inverses?* to T if appropriate, and execute BODY")
    public static SubLObject with_at_mapping_inverses(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PWHEN, $list36, listS(CLET, $list37, append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_reln_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject reln = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt38);
            reln = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject asserted_genl_somethingP = $sym39$ASSERTED_GENL_SOMETHING_;
                return list(PROGN, listS(CLET, list(list(asserted_genl_somethingP, list(FWHEN, list(FORT_P, reln), list(COR, list($sym44$ASSERTED_GENL_PREDICATES_, reln), list($sym45$ASSERTED_GENL_INVERSES_, reln)))), list($at_reln$, reln), list($at_search_genl_predsP$, list(CAND, $at_check_genl_predsP$, asserted_genl_somethingP)), list($at_search_genl_inversesP$, list(CAND, $at_check_genl_inversesP$, asserted_genl_somethingP))), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static SubLObject with_at_reln(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject reln = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        reln = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject genl_somethingP = $sym39$GENL_SOMETHING_;
        return list(PROGN, listS(CLET, list(list(genl_somethingP, list(FWHEN, list(FORT_P, reln), list(COR, list(GENL_PREDICATES, reln), list(GENL_INVERSES, reln)))), list($at_reln$, reln), list($at_search_genl_predsP$, list(CAND, $at_check_genl_predsP$, genl_somethingP)), list($at_search_genl_inversesP$, list(CAND, $at_check_genl_inversesP$, genl_somethingP))), append(body, NIL)));
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_arg_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_arg$, v_term)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject type = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            type = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_arg_type$, type)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_argnum_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject integer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt55);
            integer = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, integer, $list_alt57), listS(CLET, list(list($at_argnum$, integer)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_ind_arg_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_ind_arg$, v_term)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_ind_argnum_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject integer = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt55);
            integer = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, integer, $list_alt57), listS(CLET, list(list($at_ind_argnum$, integer)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_arg_isa_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject collection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt61);
            collection = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, collection, $list_alt62), listS(CLET, list(list($at_arg_isa$, collection)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_base_fn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject fn = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt64);
            fn = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, fn, $list_alt65), listS(CLET, list(list($at_base_fn$, fn)), append(body, NIL)));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_source_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            v_term = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_source$, v_term)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject with_at_constraint_gaf_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject gaf = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt68);
            gaf = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($at_constraint_gaf$, gaf)), append(body, NIL));
            }
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
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

    public static final SubLObject at_test_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt70);
            level = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PWHEN, list($sym71$__, $at_test_level$, level), append(body, NIL));
            }
        }
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

    public static final SubLObject at_trace_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt70);
            level = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PWHEN, list($sym71$__, $at_trace_level$, level), append(body, NIL));
            }
        }
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

    public static final SubLObject defn_test_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt70);
            level = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PWHEN, list($sym71$__, $defn_test_level$, level), append(body, NIL));
            }
        }
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

    public static final SubLObject defn_trace_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt70);
            level = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PWHEN, list($sym71$__, $defn_trace_level$, level), append(body, NIL));
            }
        }
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

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject gathering_at_constraints_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt76, append(body, $list_alt77));
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static SubLObject gathering_at_constraints(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list76, append(body, $list77));
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject gathering_at_assertions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt78, append(body, $list_alt79));
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static SubLObject gathering_at_assertions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list78, append(body, $list79));
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject gathering_at_format_violations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt80, append(body, NIL));
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static SubLObject gathering_at_format_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list80, append(body, NIL));
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject gathering_at_different_violations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt81, append(body, NIL));
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static SubLObject gathering_at_different_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list81, append(body, NIL));
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static final SubLObject gathering_at_predicate_violations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt82, append(body, NIL));
        }
    }

    /**
     * this macro should only appear in forms following AT-MACROS.LISP in sysdcl
     */
    @LispMethod(comment = "this macro should only appear in forms following AT-MACROS.LISP in sysdcl")
    public static SubLObject gathering_at_predicate_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list82, append(body, NIL));
    }

    public static final SubLObject until_at_mapping_finished_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CCATCH_IGNORE, $AT_MAPPING_DONE, listS(CLET, $list_alt85, append(body, NIL)));
        }
    }

    public static SubLObject until_at_mapping_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CCATCH_IGNORE, $AT_MAPPING_DONE, listS(CLET, $list85, append(body, NIL)));
    }

    /**
     * declare that SYMBOL names a defn function that calls DEFN-COLLECTION (results will not be cached)
     */
    @LispMethod(comment = "declare that SYMBOL names a defn function that calls DEFN-COLLECTION (results will not be cached)")
    public static final SubLObject declare_collection_specific_defn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject symbol = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt86);
            symbol = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PWHEN, list(SYMBOLP, list(QUOTE, symbol)), listS(CPUSHNEW, list(QUOTE, symbol), $list_alt90));
            } else {
                cdestructuring_bind_error(datum, $list_alt86);
            }
        }
        return NIL;
    }

    /**
     * declare that SYMBOL names a defn function that calls DEFN-COLLECTION (results will not be cached)
     */
    @LispMethod(comment = "declare that SYMBOL names a defn function that calls DEFN-COLLECTION (results will not be cached)")
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

    public static final SubLObject define_defn_metered_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt91);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt91);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject arg_list = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        SubLObject meter_cache = intern(format(NIL, $str_alt92$__a_METERS_, name), UNPROVIDED);
                        SubLObject metered_function = intern(format(NIL, $str_alt93$_a_METERED, name), UNPROVIDED);
                        SubLObject reset_function = intern(format(NIL, $str_alt94$RESET__a_METERS, name), UNPROVIDED);
                        SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        return list(new SubLObject[]{ PROGN, list(DEFVAR_DEFN, meter_cache, $list_alt96, format(NIL, $str_alt97$metering_cache_for_calls_to_defn_, name)), listS(DEFINE, new SubLObject[]{ reset_function, NIL, listS(CSETF, list(GETHASH, $CALLS, meter_cache), $list_alt102), listS(CSETF, list(GETHASH, $TIMES, meter_cache), $list_alt104), listS(CSETF, list(GETHASH, $RESULTS, meter_cache), $list_alt104), listS(CSETF, list(GETHASH, $ARGS, meter_cache), $list_alt104), list(SETHASH, $ARG_LIST, meter_cache, list(QUOTE, args)), list(SETHASH, $FUNCTION, meter_cache, list(QUOTE, name)), $list_alt110 }), list(reset_function), list(SETHASH, $RESET, meter_cache, list(QUOTE, reset_function)), listS(DEFINE, metered_function, arg_list, append(body, NIL)), list(CDOLIST, $list_alt113, listS(PWHEN, listS(EQ, list(QUOTE, name), $list_alt114), $list_alt115)), listS(CPUSH, meter_cache, $list_alt117), list(DEFINE, name, arg_list, list(PIF, $defn_metersP$, listS(CLET, new SubLObject[]{ $list_alt120, list(CTIME, RUN_TIME, list(CSETQ, RESULT, bq_cons(metered_function, append(args, NIL)))), list(CINC, list(GETHASH, $CALLS, meter_cache)), list(CPUSH, RUN_TIME, list(GETHASH, $TIMES, meter_cache)), list(CPUSH, RESULT, list(GETHASH, $RESULTS, meter_cache)), list(CPUSH, bq_cons(LIST, append(args, NIL)), list(GETHASH, $ARGS, meter_cache)), $list_alt126 }), list(RET, bq_cons(metered_function, append(args, NIL))))) });
                    }
                }
            }
        }
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
        return list(new SubLObject[]{ PROGN, list(DEFVAR_DEFN, meter_cache, $list96, format(NIL, $str97$metering_cache_for_calls_to_defn_, name)), listS(DEFINE, new SubLObject[]{ reset_function, NIL, listS(CSETF, list(GETHASH, $CALLS, meter_cache), $list102), listS(CSETF, list(GETHASH, $TIMES, meter_cache), $list104), listS(CSETF, list(GETHASH, $RESULTS, meter_cache), $list104), listS(CSETF, list(GETHASH, $ARGS, meter_cache), $list104), list(SETHASH, $ARG_LIST, meter_cache, list(QUOTE, args)), list(SETHASH, $FUNCTION, meter_cache, list(QUOTE, name)), $list110 }), list(reset_function), list(SETHASH, $RESET, meter_cache, list(QUOTE, reset_function)), listS(DEFINE, metered_function, arg_list, append(body, NIL)), list(CDOLIST, $list113, listS(PWHEN, listS(EQ, list(QUOTE, name), $list114), $list115)), listS(CPUSH, meter_cache, $list117), list(DEFINE, name, arg_list, list(PIF, $defn_metersP$, listS(CLET, new SubLObject[]{ $list120, list(CTIME, RUN_TIME, list(CSETQ, RESULT, bq_cons(metered_function, append(args, NIL)))), list(CINC, list(GETHASH, $CALLS, meter_cache)), list(CPUSH, RUN_TIME, list(GETHASH, $TIMES, meter_cache)), list(CPUSH, RESULT, list(GETHASH, $RESULTS, meter_cache)), list(CPUSH, bq_cons(LIST, append(args, NIL)), list(GETHASH, $ARGS, meter_cache)), $list126 }), list(RET, bq_cons(metered_function, append(args, NIL))))) });
    }

    /**
     *
     *
     * @unknown CONSTRAINT-VAR to the arg constraints (arg-constraint-p) on FORMULA imposed
    by the operator of FORMULA.
    All constraints are self-contained.
    Variable operators impose (#$isa <ARGN> #$Thing)
     */
    @LispMethod(comment = "@unknown CONSTRAINT-VAR to the arg constraints (arg-constraint-p) on FORMULA imposed\r\nby the operator of FORMULA.\r\nAll constraints are self-contained.\r\nVariable operators impose (#$isa <ARGN> #$Thing)")
    public static final SubLObject do_all_top_level_arg_constraints_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt128);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constraint_var = NIL;
                    SubLObject formula = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt128);
                    constraint_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt128);
                    formula = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt128);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt128);
                            if (NIL == member(current_1, $list_alt129, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt128);
                        }
                        {
                            SubLObject done_var_tail = property_list_member($DONE_VAR, current);
                            SubLObject done_var = (NIL != done_var_tail) ? ((SubLObject) (cadr(done_var_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject all_arg_constraints = $sym132$ALL_ARG_CONSTRAINTS;
                                return list(CLET, list(list(all_arg_constraints, list(DTLAC_LIST_GENERATOR, formula))), listS(CSOME, list(constraint_var, all_arg_constraints, done_var), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown CONSTRAINT-VAR to the arg constraints (arg-constraint-p) on FORMULA imposed
    by the operator of FORMULA.
    All constraints are self-contained.
    Variable operators impose (#$isa <ARGN> #$Thing)
     */
    @LispMethod(comment = "@unknown CONSTRAINT-VAR to the arg constraints (arg-constraint-p) on FORMULA imposed\r\nby the operator of FORMULA.\r\nAll constraints are self-contained.\r\nVariable operators impose (#$isa <ARGN> #$Thing)")
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

    public static final SubLObject dtlac_list_generator_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = arg_type.sorted_top_level_arg_constraints_on_formula(formula);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
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

    /**
     *
     *
     * @unknown CONSTRAINT-VAR to all arg constraints (arg-constraint-p) on FORMULA.
    All constraints are self-contained.
    Returns the innermost constraints before the constraints on their containing expressions,
    but does not guarantee breadth-first or depth-first.
    Variable operators impose (#$isa <ARGN> #$Thing)
     */
    @LispMethod(comment = "@unknown CONSTRAINT-VAR to all arg constraints (arg-constraint-p) on FORMULA.\r\nAll constraints are self-contained.\r\nReturns the innermost constraints before the constraints on their containing expressions,\r\nbut does not guarantee breadth-first or depth-first.\r\nVariable operators impose (#$isa <ARGN> #$Thing)")
    public static final SubLObject do_all_arg_constraints_inside_out_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt128);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constraint_var = NIL;
                    SubLObject formula = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt128);
                    constraint_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt128);
                    formula = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt128);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt128);
                            if (NIL == member(current_2, $list_alt129, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt128);
                        }
                        {
                            SubLObject done_var_tail = property_list_member($DONE_VAR, current);
                            SubLObject done_var = (NIL != done_var_tail) ? ((SubLObject) (cadr(done_var_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject all_arg_constraints = $sym138$ALL_ARG_CONSTRAINTS;
                                return list(CLET, list(list(all_arg_constraints, list(DAACIO_LIST_GENERATOR, formula))), listS(CSOME, list(constraint_var, all_arg_constraints, done_var), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown CONSTRAINT-VAR to all arg constraints (arg-constraint-p) on FORMULA.
    All constraints are self-contained.
    Returns the innermost constraints before the constraints on their containing expressions,
    but does not guarantee breadth-first or depth-first.
    Variable operators impose (#$isa <ARGN> #$Thing)
     */
    @LispMethod(comment = "@unknown CONSTRAINT-VAR to all arg constraints (arg-constraint-p) on FORMULA.\r\nAll constraints are self-contained.\r\nReturns the innermost constraints before the constraints on their containing expressions,\r\nbut does not guarantee breadth-first or depth-first.\r\nVariable operators impose (#$isa <ARGN> #$Thing)")
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

    public static final SubLObject daacio_list_generator_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = arg_type.inside_out_arg_constraints_on_formula(formula);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
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

    public static final SubLObject gather_wff_violations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt141, append(body, NIL));
        }
    }

    public static SubLObject gather_wff_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list141, append(body, NIL));
    }

    public static final SubLObject dont_gather_wff_violations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt142, append(body, NIL));
        }
    }

    public static SubLObject dont_gather_wff_violations(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list142, append(body, NIL));
    }

    public static final SubLObject dont_gather_wff_violations_or_suggestions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt143, append(body, NIL));
        }
    }

    public static SubLObject dont_gather_wff_violations_or_suggestions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list143, append(body, NIL));
    }

    public static SubLObject declare_at_macros_file() {
        declareMacro("with_new_defn_space", "WITH-NEW-DEFN-SPACE");
        declareMacro("with_possibly_new_defn_space", "WITH-POSSIBLY-NEW-DEFN-SPACE");
        declareFunction("make_defn_fn_history_table", "MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        declareFunction("make_quoted_defn_fn_history_table", "MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        declareFunction("make_defn_col_history_table", "MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        declareFunction("make_quoted_defn_col_history_table", "MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        declareFunction("possibly_make_defn_fn_history_table", "POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        declareFunction("possibly_make_quoted_defn_fn_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE", 0, 0, false);
        declareFunction("possibly_make_defn_col_history_table", "POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        declareFunction("possibly_make_quoted_defn_col_history_table", "POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE", 0, 0, false);
        declareMacro("with_at_defns", "WITH-AT-DEFNS");
        declareMacro("with_at_defn", "WITH-AT-DEFN");
        declareMacro("with_at_functions", "WITH-AT-FUNCTIONS");
        declareMacro("with_at_function", "WITH-AT-FUNCTION");
        declareMacro("with_at_result", "WITH-AT-RESULT");
        declareMacro("with_some_at_arg_isa_var", "WITH-SOME-AT-ARG-ISA-VAR");
        declareMacro("with_at_mode", "WITH-AT-MODE");
        declareMacro("with_at_ind_isa", "WITH-AT-IND-ISA");
        declareMacro("with_at_ind_genl", "WITH-AT-IND-GENL");
        declareMacro("with_at_pred", "WITH-AT-PRED");
        declareMacro("with_at_inverse", "WITH-AT-INVERSE");
        declareMacro("with_at_mapping_inverses", "WITH-AT-MAPPING-INVERSES");
        declareMacro("with_at_reln", "WITH-AT-RELN");
        declareMacro("with_at_arg", "WITH-AT-ARG");
        declareMacro("with_at_type", "WITH-AT-TYPE");
        declareMacro("with_at_argnum", "WITH-AT-ARGNUM");
        declareMacro("with_at_ind_arg", "WITH-AT-IND-ARG");
        declareMacro("with_at_ind_argnum", "WITH-AT-IND-ARGNUM");
        declareMacro("with_at_arg_isa", "WITH-AT-ARG-ISA");
        declareMacro("with_at_base_fn", "WITH-AT-BASE-FN");
        declareMacro("with_at_source", "WITH-AT-SOURCE");
        declareMacro("with_at_constraint_gaf", "WITH-AT-CONSTRAINT-GAF");
        declareMacro("at_test", "AT-TEST");
        declareMacro("at_trace", "AT-TRACE");
        declareMacro("defn_test", "DEFN-TEST");
        declareMacro("defn_trace", "DEFN-TRACE");
        declareMacro("gathering_at_constraints", "GATHERING-AT-CONSTRAINTS");
        declareMacro("gathering_at_assertions", "GATHERING-AT-ASSERTIONS");
        declareMacro("gathering_at_format_violations", "GATHERING-AT-FORMAT-VIOLATIONS");
        declareMacro("gathering_at_different_violations", "GATHERING-AT-DIFFERENT-VIOLATIONS");
        declareMacro("gathering_at_predicate_violations", "GATHERING-AT-PREDICATE-VIOLATIONS");
        declareMacro("until_at_mapping_finished", "UNTIL-AT-MAPPING-FINISHED");
        declareMacro("declare_collection_specific_defn", "DECLARE-COLLECTION-SPECIFIC-DEFN");
        declareMacro("define_defn_metered", "DEFINE-DEFN-METERED");
        declareMacro("do_all_top_level_arg_constraints", "DO-ALL-TOP-LEVEL-ARG-CONSTRAINTS");
        declareFunction("dtlac_list_generator", "DTLAC-LIST-GENERATOR", 1, 0, false);
        declareMacro("do_all_arg_constraints_inside_out", "DO-ALL-ARG-CONSTRAINTS-INSIDE-OUT");
        declareFunction("daacio_list_generator", "DAACIO-LIST-GENERATOR", 1, 0, false);
        declareMacro("gather_wff_violations", "GATHER-WFF-VIOLATIONS");
        declareMacro("dont_gather_wff_violations", "DONT-GATHER-WFF-VIOLATIONS");
        declareMacro("dont_gather_wff_violations_or_suggestions", "DONT-GATHER-WFF-VIOLATIONS-OR-SUGGESTIONS");
        return NIL;
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("*DEFN-FN-HISTORY*"), list(makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), list(makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*DEFN-COL-HISTORY*"), list(makeSymbol("MAKE-DEFN-COL-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), list(makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));

    static private final SubLList $list_alt3 = list(list(makeSymbol("CLEAR-DEFN-SPACE")));

    static private final SubLList $list_alt4 = list(list(makeSymbol("*DEFN-FN-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-FN-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"))), list(makeSymbol("*DEFN-COL-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE"))), list(makeSymbol("*QUOTED-DEFN-COL-HISTORY*"), list(makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"))));

    static private final SubLList $list_alt15 = list(makeSymbol("DEFNS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject init_at_macros_file() {
        return NIL;
    }

    static private final SubLList $list_alt17 = list(makeSymbol("DEFN"), makeSymbol("&BODY"), makeSymbol("BODY"));

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

    static private final SubLList $list_alt21 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(makeSymbol("*AT-RESULT*"));

    static private final SubLList $list_alt24 = list(makeSymbol("BOOLEAN-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt25 = list(makeSymbol("*AT-SOME-ARG-ISA?*"));

    static private final SubLList $list_alt26 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt28 = list(makeSymbol("COL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void declareFunctions() {
        declare_at_macros_file();
    }

    static private final SubLList $list_alt30 = list(makeSymbol("TERM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    @Override
    public void initializeVariables() {
        init_at_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_at_macros_file();
    }

    static private final SubLList $list_alt32 = list(makeSymbol("CONSTRAINT-PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static {
    }

    static private final SubLList $list_alt36 = list(makeSymbol("CAND"), makeSymbol("*AT-CHECK-GENL-INVERSES?*"), makeSymbol("*AT-INVERSE*"));

    static private final SubLList $list_alt37 = list(list(makeSymbol("*AT-MAPPING-GENL-INVERSES?*"), T));

    static private final SubLList $list_alt38 = list(makeSymbol("RELN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym39$ASSERTED_GENL_SOMETHING_ = makeUninternedSymbol("ASSERTED-GENL-SOMETHING?");

    static private final SubLSymbol $sym44$ASSERTED_GENL_PREDICATES_ = makeSymbol("ASSERTED-GENL-PREDICATES?");

    static private final SubLSymbol $sym45$ASSERTED_GENL_INVERSES_ = makeSymbol("ASSERTED-GENL-INVERSES?");

    static private final SubLList $list_alt53 = list(makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt55 = list(makeSymbol("INTEGER"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt57 = list(makeSymbol("INTEGERP"));

    static private final SubLList $list_alt61 = list(makeSymbol("COLLECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt62 = list(makeSymbol("FORT-P"));

    static private final SubLList $list_alt64 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt65 = list(makeSymbol("FUNCTION-SPEC-P"));

    static private final SubLList $list_alt68 = list(makeSymbol("GAF"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt70 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt76 = list(list(makeSymbol("*GATHER-AT-CONSTRAINTS?*"), T));

    static private final SubLList $list_alt77 = list(list(makeSymbol("CLRHASH"), makeSymbol("*AT-ISA-CONSTRAINTS*")), list(makeSymbol("CLRHASH"), makeSymbol("*AT-GENL-CONSTRAINTS*")));

    static private final SubLList $list_alt78 = list(list(makeSymbol("*GATHER-AT-ASSERTIONS?*"), T));

    static private final SubLList $list_alt79 = list(list(makeSymbol("CLRHASH"), makeSymbol("*AT-ISA-ASSERTIONS*")), list(makeSymbol("CLRHASH"), makeSymbol("*AT-GENL-ASSERTIONS*")));

    static private final SubLList $list_alt80 = list(list(makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*"), T), makeSymbol("*AT-FORMAT-VIOLATIONS*"));

    static private final SubLList $list_alt81 = list(list(makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*"), T), makeSymbol("*AT-DIFFERENT-VIOLATIONS*"));

    static private final SubLList $list_alt82 = list(list(makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*"), T), makeSymbol("*AT-PREDICATE-VIOLATIONS*"));

    static private final SubLList $list_alt85 = list(list(makeSymbol("*WITHIN-AT-MAPPING?*"), T));

    static private final SubLList $list_alt86 = list(makeSymbol("SYMBOL"));

    static private final SubLList $list_alt90 = list(makeSymbol("*AT-COLLECTION-SPECIFIC-DEFNS*"));

    static private final SubLList $list_alt91 = list(makeSymbol("NAME"), list(makeSymbol("&REST"), makeSymbol("ARG-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt92$__a_METERS_ = makeString("*~a-METERS*");

    static private final SubLString $str_alt93$_a_METERED = makeString("~a-METERED");

    static private final SubLString $str_alt94$RESET__a_METERS = makeString("RESET-~a-METERS");

    static private final SubLList $list_alt96 = list(makeSymbol("MAKE-HASH-TABLE"), EIGHT_INTEGER);

    static private final SubLString $str_alt97$metering_cache_for_calls_to_defn_ = makeString("metering cache for calls to defn module function ~a");

    static private final SubLList $list_alt102 = list(ZERO_INTEGER);

    static private final SubLList $list_alt104 = list(NIL);

    static private final SubLList $list_alt110 = list(list(RET, NIL));

    static private final SubLList $list_alt113 = list(makeSymbol("CACHE"), makeSymbol("*DEFN-METER-CACHES*"));

    static private final SubLList $list_alt114 = list(list(makeSymbol("GETHASH"), makeKeyword("FUNCTION"), makeSymbol("CACHE")));

    static private final SubLList $list_alt115 = list(list(makeSymbol("CSETQ"), makeSymbol("*DEFN-METER-CACHES*"), list(makeSymbol("DELETE"), makeSymbol("CACHE"), makeSymbol("*DEFN-METER-CACHES*"))), list(makeSymbol("CLRHASH"), makeSymbol("CACHE")));

    static private final SubLList $list_alt117 = list(makeSymbol("*DEFN-METER-CACHES*"));

    static private final SubLList $list_alt120 = list(makeSymbol("RESULT"), makeSymbol("RUN-TIME"));

    static private final SubLList $list_alt126 = list(list(RET, makeSymbol("RESULT")));

    static private final SubLList $list_alt128 = list(list(makeSymbol("CONSTRAINT-VAR"), makeSymbol("FORMULA"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt129 = list(makeKeyword("DONE-VAR"));

    static private final SubLList $list_alt141 = list(list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), T), list(makeSymbol("*NOTING-WFF-VIOLATIONS?*"), T), list(makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), T));

    static private final SubLList $list_alt142 = list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*NOTING-WFF-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"));

    static private final SubLList $list_alt143 = list(makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*NOTING-WFF-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), makeSymbol("*PROVIDE-WFF-SUGGESTIONS?*"));
}

/**
 * Total time: 260 ms
 */
