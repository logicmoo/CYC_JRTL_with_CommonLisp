/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class predicate_strengthener_internals extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new predicate_strengthener_internals();

 public static final String myName = "com.cyc.cycjava.cycl.predicate_strengthener_internals";


    // defparameter
    /**
     * Precomputed all-genls of each of the constraint collections for leaf
     * predicate wrt arg-type searches.
     */
    @LispMethod(comment = "Precomputed all-genls of each of the constraint collections for leaf\r\npredicate wrt arg-type searches.\ndefparameter\nPrecomputed all-genls of each of the constraint collections for leaf\npredicate wrt arg-type searches.")
    private static final SubLSymbol $arg_type_genls_stores$ = makeSymbol("*ARG-TYPE-GENLS-STORES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pred_streng_doneP$ = makeSymbol("*PRED-STRENG-DONE?*");

    // defparameter
    /**
     * Variable used to store the results of predicate-strengthening. Contains a
     * dictionary, with preds as keys, and markings as the values. @see MARKED-WITH
     * for marking details
     */
    @LispMethod(comment = "Variable used to store the results of predicate-strengthening. Contains a\r\ndictionary, with preds as keys, and markings as the values. @see MARKED-WITH\r\nfor marking details\ndefparameter\nVariable used to store the results of predicate-strengthening. Contains a\ndictionary, with preds as keys, and markings as the values. @see MARKED-WITH\nfor marking details")
    private static final SubLSymbol $pred_streng_result_nodes$ = makeSymbol("*PRED-STRENG-RESULT-NODES*");

    // defparameter
    /**
     * At the present state of search, how many suggested nodes have been passed
     * through?
     */
    @LispMethod(comment = "At the present state of search, how many suggested nodes have been passed\r\nthrough?\ndefparameter\nAt the present state of search, how many suggested nodes have been passed\nthrough?")
    private static final SubLSymbol $current_suggested_depth$ = makeSymbol("*CURRENT-SUGGESTED-DEPTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pred_streng_space$ = makeSymbol("*PRED-STRENG-SPACE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pred_streng_generational_space$ = makeSymbol("*PRED-STRENG-GENERATIONAL-SPACE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pred_streng_suggested_space$ = makeSymbol("*PRED-STRENG-SUGGESTED-SPACE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("ALIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $arg_type_alist$ = makeSymbol("*ARG-TYPE-ALIST*");

    static private final SubLList $list3 = list(list(makeSymbol("*ARG-TYPE-GENLS-STORES*"), list(makeSymbol("NEW-DICTIONARY"), list(QUOTE, EQUAL))));

    private static final SubLSymbol INITIALIZE_ARG_TYPE_GENLS_STORES = makeSymbol("INITIALIZE-ARG-TYPE-GENLS-STORES");







    private static final SubLObject $const8$kePrecisionSuggestionByTypeRestri = reader_make_constant_shell("kePrecisionSuggestionByTypeRestriction-Inverse");

    private static final SubLSymbol WITH_NEW_PRED_STRENG_DONE = makeSymbol("WITH-NEW-PRED-STRENG-DONE");

    private static final SubLSymbol WITH_NEW_PRED_STRENG_SPACES = makeSymbol("WITH-NEW-PRED-STRENG-SPACES");

    private static final SubLSymbol WITH_NEW_SUGGESTED_DEPTH = makeSymbol("WITH-NEW-SUGGESTED-DEPTH");

    private static final SubLSymbol WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = makeSymbol("WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");

    static private final SubLList $list13 = list(list(makeSymbol("*PRED-STRENG-DONE?*"), NIL));

    static private final SubLList $list14 = list(list(makeSymbol("*PRED-STRENG-RESULT-NODES*"), list(makeSymbol("NEW-DICTIONARY"))));

    static private final SubLList $list15 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_NEW_PRED_STRENG_RESULT_NODES = makeSymbol("WITH-NEW-PRED-STRENG-RESULT-NODES");

    static private final SubLList $list20 = list(list(makeSymbol("COMPUTE-PRED-STRENG-RESULT")));

    static private final SubLList $list21 = list(list(makeSymbol("*CURRENT-SUGGESTED-DEPTH*"), list(makeSymbol("1+"), makeSymbol("*CURRENT-SUGGESTED-DEPTH*"))));

    static private final SubLList $list22 = list(list(makeSymbol("*CURRENT-SUGGESTED-DEPTH*"), ZERO_INTEGER));

    static private final SubLList $list23 = list(list(makeSymbol("*PRED-STRENG-GENERATIONAL-SPACE*"), list(makeSymbol("MAKE-HASH-TABLE"), TWENTY_INTEGER)), list(makeSymbol("*PRED-STRENG-SUGGESTED-SPACE*"), list(makeSymbol("MAKE-HASH-TABLE"), TWENTY_INTEGER)));

    static private final SubLList $list24 = list(list(makeSymbol("*PRED-STRENG-SPACE*"), makeSymbol("*PRED-STRENG-GENERATIONAL-SPACE*")));

    static private final SubLList $list25 = list(list(makeSymbol("*PRED-STRENG-SPACE*"), makeSymbol("*PRED-STRENG-SUGGESTED-SPACE*")));

    static private final SubLList $list26 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list27 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym30$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    static private final SubLSymbol $sym31$ASS_VAR = makeUninternedSymbol("ASS-VAR");



    private static final SubLSymbol FLIP_GENL_INVERSE_MODE = makeSymbol("FLIP-GENL-INVERSE-MODE");



    static private final SubLList $list39 = list(list(makeSymbol("ASS-VAR"), makeSymbol("LINK-NODE-VAR"), makeSymbol("DEPTH-VAR"), makeSymbol("NODE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym40$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    private static final SubLObject $const41$kePrecisionSuggestionByTypeRestri = reader_make_constant_shell("kePrecisionSuggestionByTypeRestriction-Binary");

    static private final SubLList $list43 = list(makeSymbol("*CURRENT-SUGGESTED-DEPTH*"));

    private static final SubLSymbol WITH_INCREMENTED_SUGGESTED_DEPTH = makeSymbol("WITH-INCREMENTED-SUGGESTED-DEPTH");



    /**
     * Accessor. @see *arg-type-alist*
     */
    @LispMethod(comment = "Accessor. @see *arg-type-alist*")
    public static final SubLObject get_arg_type_alist_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $arg_type_alist$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @see *arg-type-alist*
     */
    @LispMethod(comment = "Accessor. @see *arg-type-alist*")
    public static SubLObject get_arg_type_alist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $arg_type_alist$.getDynamicValue(thread);
    }

    /**
     * Binds *arg-type-alist* to ALIST
     */
    @LispMethod(comment = "Binds *arg-type-alist* to ALIST")
    public static final SubLObject with_arg_type_alist_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject alist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            alist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($arg_type_alist$, alist)), append(body, NIL));
            }
        }
    }

    /**
     * Binds *arg-type-alist* to ALIST
     */
    @LispMethod(comment = "Binds *arg-type-alist* to ALIST")
    public static SubLObject with_arg_type_alist(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        alist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($arg_type_alist$, alist)), append(body, NIL));
    }

    /**
     * Accessor. @see *arg-type-genls-stores*
     */
    @LispMethod(comment = "Accessor. @see *arg-type-genls-stores*")
    public static final SubLObject get_arg_type_store_alt(SubLObject key_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary.dictionary_lookup($arg_type_genls_stores$.getDynamicValue(thread), key_list, UNPROVIDED);
        }
    }

    /**
     * Accessor. @see *arg-type-genls-stores*
     */
    @LispMethod(comment = "Accessor. @see *arg-type-genls-stores*")
    public static SubLObject get_arg_type_store(final SubLObject key_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($arg_type_genls_stores$.getDynamicValue(thread), key_list, UNPROVIDED);
    }

    /**
     * Binds *arg-type-genls-stores* to be a new dictionary. Computes the all-genls of each constraint in ALIST, and stores them in *arg-type-genls-stores*.
     */
    @LispMethod(comment = "Binds *arg-type-genls-stores* to be a new dictionary. Computes the all-genls of each constraint in ALIST, and stores them in *arg-type-genls-stores*.")
    public static final SubLObject with_new_arg_type_genls_stores_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject alist = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            alist = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, $list_alt3, list(INITIALIZE_ARG_TYPE_GENLS_STORES, alist), append(body, NIL));
            }
        }
    }

    /**
     * Binds *arg-type-genls-stores* to be a new dictionary. Computes the all-genls of each constraint in ALIST, and stores them in *arg-type-genls-stores*.
     */
    @LispMethod(comment = "Binds *arg-type-genls-stores* to be a new dictionary. Computes the all-genls of each constraint in ALIST, and stores them in *arg-type-genls-stores*.")
    public static SubLObject with_new_arg_type_genls_stores(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject alist = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        alist = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, $list3, list(INITIALIZE_ARG_TYPE_GENLS_STORES, alist), append(body, NIL));
    }

    /**
     * Computes the all-genls of each constraint in ALIST, and stores them in *arg-type-genls-stores*.
     */
    @LispMethod(comment = "Computes the all-genls of each constraint in ALIST, and stores them in *arg-type-genls-stores*.")
    public static final SubLObject initialize_arg_type_genls_stores_alt(SubLObject alist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = alist;
                SubLObject arg_info = NIL;
                for (arg_info = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_info = cdolist_list_var.first()) {
                    {
                        SubLObject argnum = arg_info.first();
                        SubLObject cdolist_list_var_1 = second(arg_info);
                        SubLObject constraints = NIL;
                        for (constraints = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , constraints = cdolist_list_var_1.first()) {
                            {
                                SubLObject constraint_pred = constraints.first();
                                {
                                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject cdolist_list_var_2 = constraints.rest();
                                            SubLObject constraint_col = NIL;
                                            for (constraint_col = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , constraint_col = cdolist_list_var_2.first()) {
                                                com.cyc.cycjava.cycl.predicate_strengthener_internals.pred_streng_depth_mark_all_forward_true_nodes(constraint_col);
                                            }
                                            dictionary.dictionary_enter($arg_type_genls_stores$.getDynamicValue(thread), list(argnum, constraint_pred), hash_table_utilities.copy_hashtable(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), UNPROVIDED));
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
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
     * Computes the all-genls of each constraint in ALIST, and stores them in *arg-type-genls-stores*.
     */
    @LispMethod(comment = "Computes the all-genls of each constraint in ALIST, and stores them in *arg-type-genls-stores*.")
    public static SubLObject initialize_arg_type_genls_stores(final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = alist;
        SubLObject arg_info = NIL;
        arg_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject argnum = arg_info.first();
            SubLObject cdolist_list_var_$1 = second(arg_info);
            SubLObject constraints = NIL;
            constraints = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject constraint_pred = constraints.first();
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject cdolist_list_var_$2 = constraints.rest();
                        SubLObject constraint_col = NIL;
                        constraint_col = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            pred_streng_depth_mark_all_forward_true_nodes(constraint_col);
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            constraint_col = cdolist_list_var_$2.first();
                        } 
                        dictionary.dictionary_enter($arg_type_genls_stores$.getDynamicValue(thread), list(argnum, constraint_pred), hash_table_utilities.copy_hashtable(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), UNPROVIDED));
                    } finally {
                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                constraints = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            arg_info = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject pred_streng_depth_mark_all_forward_true_nodes_alt(SubLObject col) {
        sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject pred_streng_depth_mark_all_forward_true_nodes(final SubLObject col) {
        sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject non_trivial_argn_isa_alt(SubLObject pred, SubLObject argnum) {
        return remove($$Thing, kb_accessors.argn_isa(pred, argnum, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject non_trivial_argn_isa(final SubLObject pred, final SubLObject argnum) {
        return remove($$Thing, kb_accessors.argn_isa(pred, argnum, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Determines whether the arg type constraints of PRED would be satisfied by the constraints given in @see *arg-type-alist*.
     */
    @LispMethod(comment = "Determines whether the arg type constraints of PRED would be satisfied by the constraints given in @see *arg-type-alist*.")
    public static final SubLObject arg_types_alist_satisfied_p_alt(SubLObject pred) {
        {
            SubLObject failP = NIL;
            SubLObject successful_args = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = com.cyc.cycjava.cycl.predicate_strengthener_internals.get_arg_type_alist();
                    SubLObject arg_info = NIL;
                    for (arg_info = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg_info = csome_list_var.first()) {
                        {
                            SubLObject arg = arg_info.first();
                            SubLObject arg_constraint_arg = arg;
                            if ((NIL != sbhl_search_vars.genl_inverse_mode_p()) && (arg.numE(ONE_INTEGER) || arg.numE(TWO_INTEGER))) {
                                arg_constraint_arg = misc_utilities.other_binary_arg(arg);
                            }
                            if (NIL == failP) {
                                {
                                    SubLObject csome_list_var_3 = second(arg_info);
                                    SubLObject constraints = NIL;
                                    for (constraints = csome_list_var_3.first(); !((NIL != failP) || (NIL == csome_list_var_3)); csome_list_var_3 = csome_list_var_3.rest() , constraints = csome_list_var_3.first()) {
                                        {
                                            SubLObject constraint_pred = constraints.first();
                                            SubLObject pred_arg_constraints = NIL;
                                            SubLObject successP = NIL;
                                            SubLObject pcase_var = constraint_pred;
                                            if (pcase_var.eql($$isa)) {
                                                pred_arg_constraints = kb_accessors.argn_isa(pred, arg_constraint_arg, UNPROVIDED);
                                            } else {
                                                if (pcase_var.eql($$genls)) {
                                                    pred_arg_constraints = kb_accessors.argn_genl(pred, arg_constraint_arg, UNPROVIDED);
                                                }
                                            }
                                            if ((NIL == pred_arg_constraints) || ((NIL == com.cyc.cycjava.cycl.predicate_strengthener_internals.non_trivial_argn_isa(pred, arg_constraint_arg)) && (NIL == kb_accessors.argn_genl(pred, arg_constraint_arg, UNPROVIDED)))) {
                                                successP = T;
                                                {
                                                    SubLObject item_var = arg_constraint_arg;
                                                    if (NIL == member(item_var, successful_args, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        successful_args = cons(item_var, successful_args);
                                                    }
                                                }
                                            } else {
                                                {
                                                    SubLObject store_key = list(arg, constraint_pred);
                                                    if (NIL == successP) {
                                                        {
                                                            SubLObject csome_list_var_4 = pred_arg_constraints;
                                                            SubLObject arg_constraint = NIL;
                                                            for (arg_constraint = csome_list_var_4.first(); !((NIL != successP) || (NIL == csome_list_var_4)); csome_list_var_4 = csome_list_var_4.rest() , arg_constraint = csome_list_var_4.first()) {
                                                                if (NIL != sbhl_marking_utilities.sbhl_marked_node_p(arg_constraint, com.cyc.cycjava.cycl.predicate_strengthener_internals.get_arg_type_store(store_key))) {
                                                                    successP = T;
                                                                    {
                                                                        SubLObject item_var = arg_constraint_arg;
                                                                        if (NIL == member(item_var, successful_args, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                            successful_args = cons(item_var, successful_args);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL == successP) {
                                                failP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == list_utilities.lengthE(successful_args, TWO_INTEGER, UNPROVIDED)) {
                failP = T;
            }
            return makeBoolean(NIL == failP);
        }
    }

    /**
     * Determines whether the arg type constraints of PRED would be satisfied by the constraints given in @see *arg-type-alist*.
     */
    @LispMethod(comment = "Determines whether the arg type constraints of PRED would be satisfied by the constraints given in @see *arg-type-alist*.")
    public static SubLObject arg_types_alist_satisfied_p(final SubLObject pred) {
        SubLObject failP = NIL;
        SubLObject successful_args = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = get_arg_type_alist();
            SubLObject arg_info = NIL;
            arg_info = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                SubLObject arg_constraint_arg;
                final SubLObject arg = arg_constraint_arg = arg_info.first();
                if ((NIL != sbhl_search_vars.genl_inverse_mode_p()) && (arg.numE(ONE_INTEGER) || arg.numE(TWO_INTEGER))) {
                    arg_constraint_arg = misc_utilities.other_binary_arg(arg);
                }
                if (NIL == failP) {
                    SubLObject csome_list_var_$4 = second(arg_info);
                    SubLObject constraints = NIL;
                    constraints = csome_list_var_$4.first();
                    while ((NIL == failP) && (NIL != csome_list_var_$4)) {
                        final SubLObject constraint_pred = constraints.first();
                        SubLObject pred_arg_constraints = NIL;
                        SubLObject successP = NIL;
                        final SubLObject pcase_var = constraint_pred;
                        if (pcase_var.eql($$isa)) {
                            pred_arg_constraints = kb_accessors.argn_isa(pred, arg_constraint_arg, UNPROVIDED);
                        } else
                            if (pcase_var.eql($$genls)) {
                                pred_arg_constraints = kb_accessors.argn_genl(pred, arg_constraint_arg, UNPROVIDED);
                            }

                        if ((NIL == pred_arg_constraints) || ((NIL == non_trivial_argn_isa(pred, arg_constraint_arg)) && (NIL == kb_accessors.argn_genl(pred, arg_constraint_arg, UNPROVIDED)))) {
                            successP = T;
                            final SubLObject item_var = arg_constraint_arg;
                            if (NIL == member(item_var, successful_args, symbol_function(EQL), symbol_function(IDENTITY))) {
                                successful_args = cons(item_var, successful_args);
                            }
                        } else {
                            final SubLObject store_key = list(arg, constraint_pred);
                            if (NIL == successP) {
                                SubLObject csome_list_var_$5 = pred_arg_constraints;
                                SubLObject arg_constraint = NIL;
                                arg_constraint = csome_list_var_$5.first();
                                while ((NIL == successP) && (NIL != csome_list_var_$5)) {
                                    if (NIL != sbhl_marking_utilities.sbhl_marked_node_p(arg_constraint, get_arg_type_store(store_key))) {
                                        successP = T;
                                        final SubLObject item_var2 = arg_constraint_arg;
                                        if (NIL == member(item_var2, successful_args, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            successful_args = cons(item_var2, successful_args);
                                        }
                                    }
                                    csome_list_var_$5 = csome_list_var_$5.rest();
                                    arg_constraint = csome_list_var_$5.first();
                                } 
                            }
                        }
                        if (NIL == successP) {
                            failP = T;
                        }
                        csome_list_var_$4 = csome_list_var_$4.rest();
                        constraints = csome_list_var_$4.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                arg_info = csome_list_var.first();
            } 
        }
        if (NIL == list_utilities.lengthE(successful_args, TWO_INTEGER, UNPROVIDED)) {
            failP = T;
        }
        return makeBoolean(NIL == failP);
    }

    public static final SubLObject node_meets_arg_constraints_p_alt(SubLObject node) {
        return com.cyc.cycjava.cycl.predicate_strengthener_internals.arg_types_alist_satisfied_p(node);
    }

    public static SubLObject node_meets_arg_constraints_p(final SubLObject node) {
        return arg_types_alist_satisfied_p(node);
    }

    /**
     * determine whether or not the more specific predicate in ASSERTION can be justified by means of
     * the arguments of the original formula meeting the suggested constraints
     */
    @LispMethod(comment = "determine whether or not the more specific predicate in ASSERTION can be justified by means of\r\nthe arguments of the original formula meeting the suggested constraints\ndetermine whether or not the more specific predicate in ASSERTION can be justified by means of\nthe arguments of the original formula meeting the suggested constraints")
    public static final SubLObject suggestion_assertion_meets_arg_constraints_p_alt(SubLObject assertion) {
        {
            SubLObject constraint_1 = assertions_high.gaf_arg3(assertion);
            SubLObject constraint_2 = assertions_high.gaf_arg4(assertion);
            SubLObject inverse_predP = eq(assertions_high.gaf_arg0(assertion), $const8$kePrecisionSuggestionByTypeRestri);
            if (makeBoolean(NIL == sbhl_search_vars.genl_inverse_mode_p()) != makeBoolean(NIL == inverse_predP)) {
                {
                    SubLObject swap_var = constraint_1;
                    constraint_1 = constraint_2;
                    constraint_2 = swap_var;
                }
            }
            {
                SubLObject arg1_store = com.cyc.cycjava.cycl.predicate_strengthener_internals.get_arg_type_store(list(ONE_INTEGER, $$isa));
                SubLObject arg2_store = com.cyc.cycjava.cycl.predicate_strengthener_internals.get_arg_type_store(list(TWO_INTEGER, $$isa));
                return makeBoolean(((arg1_store.isHashtable() && arg2_store.isHashtable()) && (NIL != sbhl_marking_utilities.sbhl_marked_node_p(constraint_1, arg1_store))) && (NIL != sbhl_marking_utilities.sbhl_marked_node_p(constraint_2, arg2_store)));
            }
        }
    }

    /**
     * determine whether or not the more specific predicate in ASSERTION can be justified by means of
     * the arguments of the original formula meeting the suggested constraints
     */
    @LispMethod(comment = "determine whether or not the more specific predicate in ASSERTION can be justified by means of\r\nthe arguments of the original formula meeting the suggested constraints\ndetermine whether or not the more specific predicate in ASSERTION can be justified by means of\nthe arguments of the original formula meeting the suggested constraints")
    public static SubLObject suggestion_assertion_meets_arg_constraints_p(final SubLObject assertion) {
        SubLObject constraint_1 = assertions_high.gaf_arg3(assertion);
        SubLObject constraint_2 = assertions_high.gaf_arg4(assertion);
        final SubLObject inverse_predP = eq(assertions_high.gaf_arg0(assertion), $const8$kePrecisionSuggestionByTypeRestri);
        if (!makeBoolean(NIL == sbhl_search_vars.genl_inverse_mode_p()).eql(makeBoolean(NIL == inverse_predP))) {
            final SubLObject swap_var = constraint_1;
            constraint_1 = constraint_2;
            constraint_2 = swap_var;
        }
        final SubLObject arg1_store = get_arg_type_store(list(ONE_INTEGER, $$isa));
        final SubLObject arg2_store = get_arg_type_store(list(TWO_INTEGER, $$isa));
        return makeBoolean(((arg1_store.isHashtable() && arg2_store.isHashtable()) && (NIL != sbhl_marking_utilities.sbhl_marked_node_p(constraint_1, arg1_store))) && (NIL != sbhl_marking_utilities.sbhl_marked_node_p(constraint_2, arg2_store)));
    }

    public static final SubLObject with_new_pred_streng_setup_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NEW_PRED_STRENG_DONE, list(WITH_NEW_PRED_STRENG_SPACES, list(WITH_NEW_SUGGESTED_DEPTH, bq_cons(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, append(body, NIL)))));
        }
    }

    public static SubLObject with_new_pred_streng_setup(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_PRED_STRENG_DONE, list(WITH_NEW_PRED_STRENG_SPACES, list(WITH_NEW_SUGGESTED_DEPTH, bq_cons(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, append(body, NIL)))));
    }

    public static final SubLObject with_new_pred_streng_done_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt13, append(body, NIL));
        }
    }

    public static SubLObject with_new_pred_streng_done(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list13, append(body, NIL));
    }

    public static final SubLObject with_new_pred_streng_result_nodes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt14, append(body, NIL));
        }
    }

    public static SubLObject with_new_pred_streng_result_nodes(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list14, append(body, NIL));
    }

    public static final SubLObject push_node_onto_result_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            dictionary.dictionary_enter($pred_streng_result_nodes$.getDynamicValue(thread), node, com.cyc.cycjava.cycl.predicate_strengthener_internals.marked_with(node));
            return NIL;
        }
    }

    public static SubLObject push_node_onto_result(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.dictionary_enter($pred_streng_result_nodes$.getDynamicValue(thread), node, marked_with(node));
        return NIL;
    }

    public static final SubLObject clear_result_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            dictionary.clear_dictionary($pred_streng_result_nodes$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject clear_result() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary($pred_streng_result_nodes$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject with_pred_streng_result_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject result_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt15);
            result_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_NEW_PRED_STRENG_RESULT_NODES, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list_alt20)));
            }
        }
    }

    public static SubLObject with_pred_streng_result(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result_var = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        result_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_NEW_PRED_STRENG_RESULT_NODES, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CSETQ, result_var, $list20)));
    }

    public static final SubLObject get_current_suggested_depth_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $current_suggested_depth$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_current_suggested_depth() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_suggested_depth$.getDynamicValue(thread);
    }

    public static final SubLObject with_incremented_suggested_depth_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt21, append(body, NIL));
        }
    }

    public static SubLObject with_incremented_suggested_depth(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list21, append(body, NIL));
    }

    public static final SubLObject with_new_suggested_depth_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt22, append(body, NIL));
        }
    }

    public static SubLObject with_new_suggested_depth(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list22, append(body, NIL));
    }

    public static final SubLObject with_new_pred_streng_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt23, append(body, NIL));
        }
    }

    public static SubLObject with_new_pred_streng_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list23, append(body, NIL));
    }

    public static final SubLObject with_generational_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt24, append(body, NIL));
        }
    }

    public static SubLObject with_generational_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list24, append(body, NIL));
    }

    public static final SubLObject with_suggested_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt25, append(body, NIL));
        }
    }

    public static SubLObject with_suggested_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list25, append(body, NIL));
    }

    /**
     * Iterate overs all typed spec-preds/inverses from node, with *genl-inverse-mode-p* set accordingly
     */
    @LispMethod(comment = "Iterate overs all typed spec-preds/inverses from node, with *genl-inverse-mode-p* set accordingly")
    public static final SubLObject do_accessible_typed_nodes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject link_node_var = NIL;
                    SubLObject node = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    link_node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    node = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt26);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt26);
                            if (NIL == member(current_5, $list_alt27, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt26);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject done_var = $sym30$DONE_VAR;
                                SubLObject ass_var = $sym31$ASS_VAR;
                                return list(CLET, list(list(done_var, done)), list(DO_GAF_ARG_INDEX, list(ass_var, node, $INDEX, TWO_INTEGER, $PREDICATE, $$typedGenlPreds, $DONE, done_var), listS(CLET, list(list(link_node_var, list(GAF_ARG1, ass_var))), append(body, NIL))), list(FLIP_GENL_INVERSE_MODE, list(DO_GAF_ARG_INDEX, list(ass_var, node, $INDEX, TWO_INTEGER, $PREDICATE, $$typedGenlInverse, $DONE, done_var), listS(CLET, list(list(link_node_var, list(GAF_ARG1, ass_var))), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate overs all typed spec-preds/inverses from node, with *genl-inverse-mode-p* set accordingly
     */
    @LispMethod(comment = "Iterate overs all typed spec-preds/inverses from node, with *genl-inverse-mode-p* set accordingly")
    public static SubLObject do_accessible_typed_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list26);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list26);
        node = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list26);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list26);
            if (NIL == member(current_$6, $list27, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list26);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject done_var = $sym30$DONE_VAR;
        final SubLObject ass_var = $sym31$ASS_VAR;
        return list(CLET, list(list(done_var, done)), list(DO_GAF_ARG_INDEX, list(ass_var, node, $INDEX, TWO_INTEGER, $PREDICATE, $$typedGenlPreds, $DONE, done_var), listS(CLET, list(list(link_node_var, list(GAF_ARG1, ass_var))), append(body, NIL))), list(FLIP_GENL_INVERSE_MODE, list(DO_GAF_ARG_INDEX, list(ass_var, node, $INDEX, TWO_INTEGER, $PREDICATE, $$typedGenlInverse, $DONE, done_var), listS(CLET, list(list(link_node_var, list(GAF_ARG1, ass_var))), append(body, NIL)))));
    }

    /**
     * Iterate overs all suggested spec-preds/inverses from node, with *genl-inverse-mode-p* and *current-suggested-depth* set accordingly
     */
    @LispMethod(comment = "Iterate overs all suggested spec-preds/inverses from node, with *genl-inverse-mode-p* and *current-suggested-depth* set accordingly")
    public static final SubLObject do_accessible_suggested_assertions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject ass_var = NIL;
                    SubLObject link_node_var = NIL;
                    SubLObject depth_var = NIL;
                    SubLObject node = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    ass_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    link_node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    depth_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    node = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt39);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt39);
                            if (NIL == member(current_6, $list_alt27, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt39);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject done_var = $sym40$DONE_VAR;
                                return list(CLET, list(list(done_var, done)), list(DO_GAF_ARG_INDEX, list(ass_var, node, $INDEX, ONE_INTEGER, $PREDICATE, $const41$kePrecisionSuggestionByTypeRestri, $DONE, done_var), list(CLET, list(list(link_node_var, list(GAF_ARG2, ass_var)), bq_cons(depth_var, $list_alt43)), bq_cons(WITH_INCREMENTED_SUGGESTED_DEPTH, append(body, NIL)))), list(FLIP_GENL_INVERSE_MODE, list(DO_GAF_ARG_INDEX, list(ass_var, node, $INDEX, ONE_INTEGER, $PREDICATE, $const8$kePrecisionSuggestionByTypeRestri, $DONE, done_var), list(CLET, list(list(link_node_var, list(GAF_ARG2, ass_var)), bq_cons(depth_var, $list_alt43)), bq_cons(WITH_INCREMENTED_SUGGESTED_DEPTH, append(body, NIL))))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate overs all suggested spec-preds/inverses from node, with *genl-inverse-mode-p* and *current-suggested-depth* set accordingly
     */
    @LispMethod(comment = "Iterate overs all suggested spec-preds/inverses from node, with *genl-inverse-mode-p* and *current-suggested-depth* set accordingly")
    public static SubLObject do_accessible_suggested_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject ass_var = NIL;
        SubLObject link_node_var = NIL;
        SubLObject depth_var = NIL;
        SubLObject node = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        ass_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        depth_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        node = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list39);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list39);
            if (NIL == member(current_$7, $list27, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list39);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject done_var = $sym40$DONE_VAR;
        return list(CLET, list(list(done_var, done)), list(DO_GAF_ARG_INDEX, list(ass_var, node, $INDEX, ONE_INTEGER, $PREDICATE, $const41$kePrecisionSuggestionByTypeRestri, $DONE, done_var), list(CLET, list(list(link_node_var, list(GAF_ARG2, ass_var)), bq_cons(depth_var, $list43)), bq_cons(WITH_INCREMENTED_SUGGESTED_DEPTH, append(body, NIL)))), list(FLIP_GENL_INVERSE_MODE, list(DO_GAF_ARG_INDEX, list(ass_var, node, $INDEX, ONE_INTEGER, $PREDICATE, $const8$kePrecisionSuggestionByTypeRestri, $DONE, done_var), list(CLET, list(list(link_node_var, list(GAF_ARG2, ass_var)), bq_cons(depth_var, $list43)), bq_cons(WITH_INCREMENTED_SUGGESTED_DEPTH, append(body, NIL))))));
    }

    /**
     * The main entry-point into the predicate strengthener.  The function finds leaf typed-spec-preds and typed-spec-inverses
     * of PRED, as well as any suggested strengthenings (via #$kePrecisionSuggestionByTypeRestriction-Binary/Inverse) and the number
     * of suggestions that must be crossed to get to each particular strengthened predicate.
     *
     * @param PRED
    predicate
     * 		
     * @param ALIST
     * 		alist; contains constraints on the arg1 and arg2 of pred in the formula for which strengthening is desired
     * 		e.g. ((1 ((#$isa Col10))) (2 ((#$isa Col8))))
     * @return dictionary; keys are predicates, values are markings @see MARKED-WITH
     */
    @LispMethod(comment = "The main entry-point into the predicate strengthener.  The function finds leaf typed-spec-preds and typed-spec-inverses\r\nof PRED, as well as any suggested strengthenings (via #$kePrecisionSuggestionByTypeRestriction-Binary/Inverse) and the number\r\nof suggestions that must be crossed to get to each particular strengthened predicate.\r\n\r\n@param PRED\npredicate\r\n\t\t\r\n@param ALIST\r\n\t\talist; contains constraints on the arg1 and arg2 of pred in the formula for which strengthening is desired\r\n\t\te.g. ((1 ((#$isa Col10))) (2 ((#$isa Col8))))\r\n@return dictionary; keys are predicates, values are markings @see MARKED-WITH\nThe main entry-point into the predicate strengthener.  The function finds leaf typed-spec-preds and typed-spec-inverses\nof PRED, as well as any suggested strengthenings (via #$kePrecisionSuggestionByTypeRestriction-Binary/Inverse) and the number\nof suggestions that must be crossed to get to each particular strengthened predicate.")
    public static final SubLObject strengthened_preds_alt(SubLObject pred, SubLObject alist, SubLObject use_suggestionsP) {
        if (use_suggestionsP == UNPROVIDED) {
            use_suggestionsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $pred_streng_result_nodes$.currentBinding(thread);
                    try {
                        $pred_streng_result_nodes$.bind(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
                        try {
                            {
                                SubLObject _prev_bind_0_7 = $arg_type_alist$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $arg_type_genls_stores$.currentBinding(thread);
                                try {
                                    $arg_type_alist$.bind(alist, thread);
                                    $arg_type_genls_stores$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                                    com.cyc.cycjava.cycl.predicate_strengthener_internals.initialize_arg_type_genls_stores(alist);
                                    {
                                        SubLObject _prev_bind_0_8 = $pred_streng_doneP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_9 = $pred_streng_generational_space$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $pred_streng_suggested_space$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $current_suggested_depth$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            $pred_streng_doneP$.bind(NIL, thread);
                                            $pred_streng_generational_space$.bind(make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED), thread);
                                            $pred_streng_suggested_space$.bind(make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED), thread);
                                            $current_suggested_depth$.bind(ZERO_INTEGER, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            {
                                                SubLObject _prev_bind_0_10 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_marking_generation$.bind(ZERO_INTEGER, thread);
                                                    com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_connected_typed_links(pred, use_suggestionsP);
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_marking_generation$.rebind(_prev_bind_0_10, thread);
                                                }
                                            }
                                            if (NIL != use_suggestionsP) {
                                                com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_suggested_links(pred);
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            $current_suggested_depth$.rebind(_prev_bind_3, thread);
                                            $pred_streng_suggested_space$.rebind(_prev_bind_2, thread);
                                            $pred_streng_generational_space$.rebind(_prev_bind_1_9, thread);
                                            $pred_streng_doneP$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                } finally {
                                    $arg_type_genls_stores$.rebind(_prev_bind_1, thread);
                                    $arg_type_alist$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    result = com.cyc.cycjava.cycl.predicate_strengthener_internals.compute_pred_streng_result();
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
                                }
                            }
                        }
                    } finally {
                        $pred_streng_result_nodes$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * The main entry-point into the predicate strengthener.  The function finds leaf typed-spec-preds and typed-spec-inverses
     * of PRED, as well as any suggested strengthenings (via #$kePrecisionSuggestionByTypeRestriction-Binary/Inverse) and the number
     * of suggestions that must be crossed to get to each particular strengthened predicate.
     *
     * @param PRED
    		predicate
     * 		
     * @param ALIST
     * 		alist; contains constraints on the arg1 and arg2 of pred in the formula for which strengthening is desired
     * 		e.g. ((1 ((#$isa Col10))) (2 ((#$isa Col8))))
     * @return dictionary; keys are predicates, values are markings @see MARKED-WITH
     */
    @LispMethod(comment = "The main entry-point into the predicate strengthener.  The function finds leaf typed-spec-preds and typed-spec-inverses\r\nof PRED, as well as any suggested strengthenings (via #$kePrecisionSuggestionByTypeRestriction-Binary/Inverse) and the number\r\nof suggestions that must be crossed to get to each particular strengthened predicate.\r\n\r\n@param PRED\n\t\tpredicate\r\n\t\t\r\n@param ALIST\r\n\t\talist; contains constraints on the arg1 and arg2 of pred in the formula for which strengthening is desired\r\n\t\te.g. ((1 ((#$isa Col10))) (2 ((#$isa Col8))))\r\n@return dictionary; keys are predicates, values are markings @see MARKED-WITH\nThe main entry-point into the predicate strengthener.  The function finds leaf typed-spec-preds and typed-spec-inverses\nof PRED, as well as any suggested strengthenings (via #$kePrecisionSuggestionByTypeRestriction-Binary/Inverse) and the number\nof suggestions that must be crossed to get to each particular strengthened predicate.")
    public static SubLObject strengthened_preds(final SubLObject pred, final SubLObject alist, SubLObject use_suggestionsP) {
        if (use_suggestionsP == UNPROVIDED) {
            use_suggestionsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $pred_streng_result_nodes$.currentBinding(thread);
        try {
            $pred_streng_result_nodes$.bind(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
            try {
                final SubLObject _prev_bind_0_$8 = $arg_type_alist$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $arg_type_genls_stores$.currentBinding(thread);
                try {
                    $arg_type_alist$.bind(alist, thread);
                    $arg_type_genls_stores$.bind(dictionary.new_dictionary(EQUAL, UNPROVIDED), thread);
                    initialize_arg_type_genls_stores(alist);
                    final SubLObject _prev_bind_0_$9 = $pred_streng_doneP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$10 = $pred_streng_generational_space$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $pred_streng_suggested_space$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $current_suggested_depth$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                        $pred_streng_doneP$.bind(NIL, thread);
                        $pred_streng_generational_space$.bind(make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED), thread);
                        $pred_streng_suggested_space$.bind(make_hash_table(TWENTY_INTEGER, UNPROVIDED, UNPROVIDED), thread);
                        $current_suggested_depth$.bind(ZERO_INTEGER, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        final SubLObject _prev_bind_0_$10 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_marking_generation$.bind(ZERO_INTEGER, thread);
                            mark_and_sweep_connected_typed_links(pred, use_suggestionsP);
                        } finally {
                            sbhl_marking_vars.$sbhl_marking_generation$.rebind(_prev_bind_0_$10, thread);
                        }
                        if (NIL != use_suggestionsP) {
                            mark_and_sweep_suggested_links(pred);
                        }
                    } finally {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_5, thread);
                        $current_suggested_depth$.rebind(_prev_bind_4, thread);
                        $pred_streng_suggested_space$.rebind(_prev_bind_3, thread);
                        $pred_streng_generational_space$.rebind(_prev_bind_1_$10, thread);
                        $pred_streng_doneP$.rebind(_prev_bind_0_$9, thread);
                    }
                } finally {
                    $arg_type_genls_stores$.rebind(_prev_bind_2, thread);
                    $arg_type_alist$.rebind(_prev_bind_0_$8, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    result = compute_pred_streng_result();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            $pred_streng_result_nodes$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return dictionary; @see *pred-streng-result-nodes* for format of dictionary
     */
    @LispMethod(comment = "@return dictionary; @see *pred-streng-result-nodes* for format of dictionary")
    public static final SubLObject compute_pred_streng_result_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $pred_streng_result_nodes$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return dictionary; @see *pred-streng-result-nodes* for format of dictionary
     */
    @LispMethod(comment = "@return dictionary; @see *pred-streng-result-nodes* for format of dictionary")
    public static SubLObject compute_pred_streng_result() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $pred_streng_result_nodes$.getDynamicValue(thread);
    }

    /**
     * sweep through connected typed and suggested links from NODE, marking
     * all with the generation their visited in
     * and the number of suggested-links on the path back to the original
     * node.  If node is a leaf of a typed spec graph
     * and meets the arg-constraints, push it onto the result stack.
     *
     * @param NODE
    predicate
     * 		
     * @return boolean; does this node meet the arg-constraints specified in
     * @unknown *arg-type-alist*?
     */
    @LispMethod(comment = "sweep through connected typed and suggested links from NODE, marking\r\nall with the generation their visited in\r\nand the number of suggested-links on the path back to the original\r\nnode.  If node is a leaf of a typed spec graph\r\nand meets the arg-constraints, push it onto the result stack.\r\n\r\n@param NODE\npredicate\r\n\t\t\r\n@return boolean; does this node meet the arg-constraints specified in\r\n@unknown *arg-type-alist*?\nsweep through connected typed and suggested links from NODE, marking\nall with the generation their visited in\nand the number of suggested-links on the path back to the original\nnode.  If node is a leaf of a typed spec graph\nand meets the arg-constraints, push it onto the result stack.")
    public static final SubLObject mark_and_sweep_connected_typed_links_alt(SubLObject node, SubLObject use_suggestionsP) {
        if (use_suggestionsP == UNPROVIDED) {
            use_suggestionsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_nodes = NIL;
                {
                    SubLObject _prev_bind_0 = $pred_streng_space$.currentBinding(thread);
                    try {
                        $pred_streng_space$.bind($pred_streng_generational_space$.getDynamicValue(thread), thread);
                        if (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p(node)) {
                            if ((NIL != predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.getDynamicValue(thread)) && (NIL == isa.isaP(node, $$UnderspecifiedPredicate, UNPROVIDED, UNPROVIDED))) {
                                if (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_is_of_current_generation_p(node)) {
                                    sbhl_marking_vars.increment_sbhl_marking_generation();
                                    com.cyc.cycjava.cycl.predicate_strengthener_internals.push_node_onto_result(node);
                                    {
                                        SubLObject item_var = node;
                                        if (NIL == member(item_var, result_nodes, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                            result_nodes = cons(item_var, result_nodes);
                                        }
                                    }
                                } else {
                                    if (predicate_strengthener.max_pred_strengs().isInteger() && (NIL != list_utilities.lengthG(result_nodes, predicate_strengthener.max_pred_strengs(), UNPROVIDED))) {
                                        com.cyc.cycjava.cycl.predicate_strengthener_internals.clear_result();
                                        com.cyc.cycjava.cycl.predicate_strengthener_internals.push_node_onto_result(node);
                                    } else {
                                        com.cyc.cycjava.cycl.predicate_strengthener_internals.push_node_onto_result(node);
                                        {
                                            SubLObject item_var = node;
                                            if (NIL == member(item_var, result_nodes, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                result_nodes = cons(item_var, result_nodes);
                                            }
                                        }
                                    }
                                }
                            } else {
                                if ((NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_visited_in_current_mode_p(node)) && (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_is_unmysterious_p(node))) {
                                    if ((NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_meets_arg_constraints_p(node)) && (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_is_older_than_current_generation_p(node))) {
                                        sbhl_marking_vars.increment_sbhl_marking_generation();
                                    }
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_meets_arg_constraints_p(node)) {
                                        {
                                            SubLObject valid_node_visitedP = NIL;
                                            com.cyc.cycjava.cycl.predicate_strengthener_internals.generationally_mark_typed_node(node);
                                            {
                                                SubLObject done_var = $pred_streng_doneP$.getDynamicValue(thread);
                                                {
                                                    SubLObject pred_var = $$typedGenlPreds;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, TWO_INTEGER, pred_var)) {
                                                        {
                                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, TWO_INTEGER, pred_var);
                                                            SubLObject done_var_12 = done_var;
                                                            SubLObject token_var = NIL;
                                                            while (NIL == done_var_12) {
                                                                {
                                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                    if (NIL != valid) {
                                                                        {
                                                                            SubLObject final_index_iterator = NIL;
                                                                            try {
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                {
                                                                                    SubLObject done_var_13 = done_var;
                                                                                    SubLObject token_var_14 = NIL;
                                                                                    while (NIL == done_var_13) {
                                                                                        {
                                                                                            SubLObject ass_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                                            SubLObject valid_15 = makeBoolean(token_var_14 != ass_var);
                                                                                            if (NIL != valid_15) {
                                                                                                {
                                                                                                    SubLObject link_node = assertions_high.gaf_arg1(ass_var);
                                                                                                    valid_node_visitedP = makeBoolean((NIL != valid_node_visitedP) || (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_meets_arg_constraints_p(link_node)));
                                                                                                    result_nodes = nunion(result_nodes, com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_connected_typed_links(link_node, use_suggestionsP), symbol_function(EQUAL), UNPROVIDED);
                                                                                                    if (NIL != use_suggestionsP) {
                                                                                                        result_nodes = nunion(result_nodes, com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_suggested_links(link_node), symbol_function(EQUAL), UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            done_var_13 = makeBoolean((NIL == valid_15) || (NIL != done_var));
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if (NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_12 = makeBoolean((NIL == valid) || (NIL != done_var));
                                                                }
                                                            } 
                                                        }
                                                    }
                                                }
                                                {
                                                    SubLObject _prev_bind_0_17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        {
                                                            SubLObject pred_var = $$typedGenlInverse;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, TWO_INTEGER, pred_var)) {
                                                                {
                                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, TWO_INTEGER, pred_var);
                                                                    SubLObject done_var_18 = done_var;
                                                                    SubLObject token_var = NIL;
                                                                    while (NIL == done_var_18) {
                                                                        {
                                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                            if (NIL != valid) {
                                                                                {
                                                                                    SubLObject final_index_iterator = NIL;
                                                                                    try {
                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                        {
                                                                                            SubLObject done_var_19 = done_var;
                                                                                            SubLObject token_var_20 = NIL;
                                                                                            while (NIL == done_var_19) {
                                                                                                {
                                                                                                    SubLObject ass_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_20);
                                                                                                    SubLObject valid_21 = makeBoolean(token_var_20 != ass_var);
                                                                                                    if (NIL != valid_21) {
                                                                                                        {
                                                                                                            SubLObject link_node = assertions_high.gaf_arg1(ass_var);
                                                                                                            valid_node_visitedP = makeBoolean((NIL != valid_node_visitedP) || (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_meets_arg_constraints_p(link_node)));
                                                                                                            result_nodes = nunion(result_nodes, com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_connected_typed_links(link_node, use_suggestionsP), symbol_function(EQUAL), UNPROVIDED);
                                                                                                            if (NIL != use_suggestionsP) {
                                                                                                                result_nodes = nunion(result_nodes, com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_suggested_links(link_node), symbol_function(EQUAL), UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    done_var_19 = makeBoolean((NIL == valid_21) || (NIL != done_var));
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if (NIL != final_index_iterator) {
                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_18 = makeBoolean((NIL == valid) || (NIL != done_var));
                                                                        }
                                                                    } 
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_17, thread);
                                                    }
                                                }
                                            }
                                            if ((NIL == valid_node_visitedP) && (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_is_of_current_generation_p(node))) {
                                                sbhl_marking_vars.increment_sbhl_marking_generation();
                                                com.cyc.cycjava.cycl.predicate_strengthener_internals.push_node_onto_result(node);
                                                {
                                                    SubLObject item_var = node;
                                                    if (NIL == member(item_var, result_nodes, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        result_nodes = cons(item_var, result_nodes);
                                                    }
                                                }
                                            } else {
                                                if (predicate_strengthener.max_pred_strengs().isInteger() && (NIL != list_utilities.lengthG(result_nodes, predicate_strengthener.max_pred_strengs(), UNPROVIDED))) {
                                                    com.cyc.cycjava.cycl.predicate_strengthener_internals.clear_result();
                                                    com.cyc.cycjava.cycl.predicate_strengthener_internals.push_node_onto_result(node);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $pred_streng_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return result_nodes;
            }
        }
    }

    /**
     * sweep through connected typed and suggested links from NODE, marking
     * all with the generation their visited in
     * and the number of suggested-links on the path back to the original
     * node.  If node is a leaf of a typed spec graph
     * and meets the arg-constraints, push it onto the result stack.
     *
     * @param NODE
    		predicate
     * 		
     * @return boolean; does this node meet the arg-constraints specified in
     * @unknown *arg-type-alist*?
     */
    @LispMethod(comment = "sweep through connected typed and suggested links from NODE, marking\r\nall with the generation their visited in\r\nand the number of suggested-links on the path back to the original\r\nnode.  If node is a leaf of a typed spec graph\r\nand meets the arg-constraints, push it onto the result stack.\r\n\r\n@param NODE\n\t\tpredicate\r\n\t\t\r\n@return boolean; does this node meet the arg-constraints specified in\r\n@unknown *arg-type-alist*?\nsweep through connected typed and suggested links from NODE, marking\nall with the generation their visited in\nand the number of suggested-links on the path back to the original\nnode.  If node is a leaf of a typed spec graph\nand meets the arg-constraints, push it onto the result stack.")
    public static SubLObject mark_and_sweep_connected_typed_links(final SubLObject node, SubLObject use_suggestionsP) {
        if (use_suggestionsP == UNPROVIDED) {
            use_suggestionsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_nodes = NIL;
        final SubLObject _prev_bind_0 = $pred_streng_space$.currentBinding(thread);
        try {
            $pred_streng_space$.bind($pred_streng_generational_space$.getDynamicValue(thread), thread);
            if (NIL != node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p(node)) {
                if ((NIL != predicate_strengthener.$pred_strengthen_stop_at_first_specified_pred$.getDynamicValue(thread)) && (NIL == isa.isaP(node, $$UnderspecifiedPredicate, UNPROVIDED, UNPROVIDED))) {
                    if (NIL != node_is_of_current_generation_p(node)) {
                        sbhl_marking_vars.increment_sbhl_marking_generation();
                        push_node_onto_result(node);
                        if (NIL == member(node, result_nodes, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            result_nodes = cons(node, result_nodes);
                        }
                    } else
                        if (predicate_strengthener.max_pred_strengs().isInteger() && (NIL != list_utilities.lengthG(result_nodes, predicate_strengthener.max_pred_strengs(), UNPROVIDED))) {
                            clear_result();
                            push_node_onto_result(node);
                        } else {
                            push_node_onto_result(node);
                            if (NIL == member(node, result_nodes, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                result_nodes = cons(node, result_nodes);
                            }
                        }

                } else
                    if ((NIL != node_visited_in_current_mode_p(node)) && (NIL != node_is_unmysterious_p(node))) {
                        if ((NIL != node_meets_arg_constraints_p(node)) && (NIL != node_is_older_than_current_generation_p(node))) {
                            sbhl_marking_vars.increment_sbhl_marking_generation();
                        }
                    } else
                        if (NIL != node_meets_arg_constraints_p(node)) {
                            SubLObject valid_node_visitedP = NIL;
                            generationally_mark_typed_node(node);
                            final SubLObject done_var = $pred_streng_doneP$.getDynamicValue(thread);
                            final SubLObject pred_var = $$typedGenlPreds;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, TWO_INTEGER, pred_var)) {
                                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, TWO_INTEGER, pred_var);
                                SubLObject done_var_$13 = done_var;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var_$13) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            SubLObject done_var_$14 = done_var;
                                            final SubLObject token_var_$15 = NIL;
                                            while (NIL == done_var_$14) {
                                                final SubLObject ass_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                                final SubLObject valid_$16 = makeBoolean(!token_var_$15.eql(ass_var));
                                                if (NIL != valid_$16) {
                                                    final SubLObject link_node = assertions_high.gaf_arg1(ass_var);
                                                    valid_node_visitedP = makeBoolean((NIL != valid_node_visitedP) || (NIL != node_meets_arg_constraints_p(link_node)));
                                                    result_nodes = nunion(result_nodes, mark_and_sweep_connected_typed_links(link_node, use_suggestionsP), symbol_function(EQUAL), UNPROVIDED);
                                                    if (NIL != use_suggestionsP) {
                                                        result_nodes = nunion(result_nodes, mark_and_sweep_suggested_links(link_node), symbol_function(EQUAL), UNPROVIDED);
                                                    }
                                                }
                                                done_var_$14 = makeBoolean((NIL == valid_$16) || (NIL != done_var));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                            }
                                        }
                                    }
                                    done_var_$13 = makeBoolean((NIL == valid) || (NIL != done_var));
                                } 
                            }
                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                final SubLObject pred_var2 = $$typedGenlInverse;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, TWO_INTEGER, pred_var2)) {
                                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, TWO_INTEGER, pred_var2);
                                    SubLObject done_var_$15 = done_var;
                                    final SubLObject token_var2 = NIL;
                                    while (NIL == done_var_$15) {
                                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                        final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                        if (NIL != valid2) {
                                            SubLObject final_index_iterator2 = NIL;
                                            try {
                                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                                SubLObject done_var_$16 = done_var;
                                                final SubLObject token_var_$16 = NIL;
                                                while (NIL == done_var_$16) {
                                                    final SubLObject ass_var2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$16);
                                                    final SubLObject valid_$17 = makeBoolean(!token_var_$16.eql(ass_var2));
                                                    if (NIL != valid_$17) {
                                                        final SubLObject link_node2 = assertions_high.gaf_arg1(ass_var2);
                                                        valid_node_visitedP = makeBoolean((NIL != valid_node_visitedP) || (NIL != node_meets_arg_constraints_p(link_node2)));
                                                        result_nodes = nunion(result_nodes, mark_and_sweep_connected_typed_links(link_node2, use_suggestionsP), symbol_function(EQUAL), UNPROVIDED);
                                                        if (NIL != use_suggestionsP) {
                                                            result_nodes = nunion(result_nodes, mark_and_sweep_suggested_links(link_node2), symbol_function(EQUAL), UNPROVIDED);
                                                        }
                                                    }
                                                    done_var_$16 = makeBoolean((NIL == valid_$17) || (NIL != done_var));
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    if (NIL != final_index_iterator2) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                    }
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                                }
                                            }
                                        }
                                        done_var_$15 = makeBoolean((NIL == valid2) || (NIL != done_var));
                                    } 
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$18, thread);
                            }
                            if ((NIL == valid_node_visitedP) && (NIL != node_is_of_current_generation_p(node))) {
                                sbhl_marking_vars.increment_sbhl_marking_generation();
                                push_node_onto_result(node);
                                if (NIL == member(node, result_nodes, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    result_nodes = cons(node, result_nodes);
                                }
                            } else
                                if (predicate_strengthener.max_pred_strengs().isInteger() && (NIL != list_utilities.lengthG(result_nodes, predicate_strengthener.max_pred_strengs(), UNPROVIDED))) {
                                    clear_result();
                                    push_node_onto_result(node);
                                }

                        }


            }
        } finally {
            $pred_streng_space$.rebind(_prev_bind_0, thread);
        }
        return result_nodes;
    }

    /**
     * sweep through connected typed and suggested links from NODE, marking all with the generation their visited in
     * and the number of suggested-links on the path back to the original node.  If node is a tail of a suggestion assertion
     * and meets the arg-constraints, push it onto the result stack.
     *
     * @param NODE
    predicate
     * 		
     */
    @LispMethod(comment = "sweep through connected typed and suggested links from NODE, marking all with the generation their visited in\r\nand the number of suggested-links on the path back to the original node.  If node is a tail of a suggestion assertion\r\nand meets the arg-constraints, push it onto the result stack.\r\n\r\n@param NODE\npredicate\nsweep through connected typed and suggested links from NODE, marking all with the generation their visited in\nand the number of suggested-links on the path back to the original node.  If node is a tail of a suggestion assertion\nand meets the arg-constraints, push it onto the result stack.")
    public static final SubLObject mark_and_sweep_suggested_links_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_nodes = NIL;
                {
                    SubLObject _prev_bind_0 = $pred_streng_space$.currentBinding(thread);
                    try {
                        $pred_streng_space$.bind($pred_streng_suggested_space$.getDynamicValue(thread), thread);
                        if (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p(node)) {
                            if (!((NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_visited_in_current_mode_p(node)) && (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_is_unmysterious_p(node)))) {
                                if (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.arg_types_alist_satisfied_p(node)) {
                                    {
                                        SubLObject node_markedP = NIL;
                                        SubLObject done_var = $pred_streng_doneP$.getDynamicValue(thread);
                                        {
                                            SubLObject pred_var = $const41$kePrecisionSuggestionByTypeRestri;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
                                                    SubLObject done_var_23 = done_var;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var_23) {
                                                        {
                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                        {
                                                                            SubLObject done_var_24 = done_var;
                                                                            SubLObject token_var_25 = NIL;
                                                                            while (NIL == done_var_24) {
                                                                                {
                                                                                    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_25);
                                                                                    SubLObject valid_26 = makeBoolean(token_var_25 != assertion);
                                                                                    if (NIL != valid_26) {
                                                                                        {
                                                                                            SubLObject link_node = assertions_high.gaf_arg2(assertion);
                                                                                            SubLObject depth = $current_suggested_depth$.getDynamicValue(thread);
                                                                                            {
                                                                                                SubLObject _prev_bind_0_27 = $current_suggested_depth$.currentBinding(thread);
                                                                                                try {
                                                                                                    $current_suggested_depth$.bind(number_utilities.f_1X($current_suggested_depth$.getDynamicValue(thread)), thread);
                                                                                                    if (NIL == node_markedP) {
                                                                                                        node_markedP = T;
                                                                                                        com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_suggested_node(node, depth);
                                                                                                    }
                                                                                                    if (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.suggestion_assertion_meets_arg_constraints_p(assertion)) {
                                                                                                        {
                                                                                                            SubLObject _prev_bind_0_28 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding(thread);
                                                                                                            try {
                                                                                                                sbhl_marking_vars.$sbhl_marking_generation$.bind(ZERO_INTEGER, thread);
                                                                                                                result_nodes = nunion(result_nodes, com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_connected_typed_links(link_node, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                                                                                                            } finally {
                                                                                                                sbhl_marking_vars.$sbhl_marking_generation$.rebind(_prev_bind_0_28, thread);
                                                                                                            }
                                                                                                        }
                                                                                                        result_nodes = nunion(result_nodes, com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_suggested_links(link_node), symbol_function(EQUAL), UNPROVIDED);
                                                                                                    }
                                                                                                } finally {
                                                                                                    $current_suggested_depth$.rebind(_prev_bind_0_27, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var_24 = makeBoolean((NIL == valid_26) || (NIL != done_var));
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_29, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            done_var_23 = makeBoolean((NIL == valid) || (NIL != done_var));
                                                        }
                                                    } 
                                                }
                                            }
                                        }
                                        {
                                            SubLObject _prev_bind_0_30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                {
                                                    SubLObject pred_var = $const8$kePrecisionSuggestionByTypeRestri;
                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
                                                        {
                                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
                                                            SubLObject done_var_31 = done_var;
                                                            SubLObject token_var = NIL;
                                                            while (NIL == done_var_31) {
                                                                {
                                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                    if (NIL != valid) {
                                                                        {
                                                                            SubLObject final_index_iterator = NIL;
                                                                            try {
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                {
                                                                                    SubLObject done_var_32 = done_var;
                                                                                    SubLObject token_var_33 = NIL;
                                                                                    while (NIL == done_var_32) {
                                                                                        {
                                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_33);
                                                                                            SubLObject valid_34 = makeBoolean(token_var_33 != assertion);
                                                                                            if (NIL != valid_34) {
                                                                                                {
                                                                                                    SubLObject link_node = assertions_high.gaf_arg2(assertion);
                                                                                                    SubLObject depth = $current_suggested_depth$.getDynamicValue(thread);
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_35 = $current_suggested_depth$.currentBinding(thread);
                                                                                                        try {
                                                                                                            $current_suggested_depth$.bind(number_utilities.f_1X($current_suggested_depth$.getDynamicValue(thread)), thread);
                                                                                                            if (NIL == node_markedP) {
                                                                                                                node_markedP = T;
                                                                                                                com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_suggested_node(node, depth);
                                                                                                            }
                                                                                                            if (NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.suggestion_assertion_meets_arg_constraints_p(assertion)) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_36 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_marking_vars.$sbhl_marking_generation$.bind(ZERO_INTEGER, thread);
                                                                                                                        result_nodes = nunion(result_nodes, com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_connected_typed_links(link_node, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                                                                                                                    } finally {
                                                                                                                        sbhl_marking_vars.$sbhl_marking_generation$.rebind(_prev_bind_0_36, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                                result_nodes = nunion(result_nodes, com.cyc.cycjava.cycl.predicate_strengthener_internals.mark_and_sweep_suggested_links(link_node), symbol_function(EQUAL), UNPROVIDED);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            $current_suggested_depth$.rebind(_prev_bind_0_35, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            done_var_32 = makeBoolean((NIL == valid_34) || (NIL != done_var));
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            } finally {
                                                                                {
                                                                                    SubLObject _prev_bind_0_37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        if (NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_37, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_31 = makeBoolean((NIL == valid) || (NIL != done_var));
                                                                }
                                                            } 
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_30, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $pred_streng_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return result_nodes;
            }
        }
    }

    /**
     * sweep through connected typed and suggested links from NODE, marking all with the generation their visited in
     * and the number of suggested-links on the path back to the original node.  If node is a tail of a suggestion assertion
     * and meets the arg-constraints, push it onto the result stack.
     *
     * @param NODE
    		predicate
     * 		
     */
    @LispMethod(comment = "sweep through connected typed and suggested links from NODE, marking all with the generation their visited in\r\nand the number of suggested-links on the path back to the original node.  If node is a tail of a suggestion assertion\r\nand meets the arg-constraints, push it onto the result stack.\r\n\r\n@param NODE\n\t\tpredicate\nsweep through connected typed and suggested links from NODE, marking all with the generation their visited in\nand the number of suggested-links on the path back to the original node.  If node is a tail of a suggestion assertion\nand meets the arg-constraints, push it onto the result stack.")
    public static SubLObject mark_and_sweep_suggested_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_nodes = NIL;
        final SubLObject _prev_bind_0 = $pred_streng_space$.currentBinding(thread);
        try {
            $pred_streng_space$.bind($pred_streng_suggested_space$.getDynamicValue(thread), thread);
            if (((NIL != node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p(node)) && ((NIL == node_visited_in_current_mode_p(node)) || (NIL == node_is_unmysterious_p(node)))) && (NIL != arg_types_alist_satisfied_p(node))) {
                SubLObject node_markedP = NIL;
                final SubLObject done_var = $pred_streng_doneP$.getDynamicValue(thread);
                final SubLObject pred_var = $const41$kePrecisionSuggestionByTypeRestri;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var);
                    SubLObject done_var_$24 = done_var;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var_$24) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$25 = done_var;
                                final SubLObject token_var_$26 = NIL;
                                while (NIL == done_var_$25) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                    final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(assertion));
                                    if (NIL != valid_$27) {
                                        final SubLObject link_node = assertions_high.gaf_arg2(assertion);
                                        final SubLObject depth = $current_suggested_depth$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$28 = $current_suggested_depth$.currentBinding(thread);
                                        try {
                                            $current_suggested_depth$.bind(number_utilities.f_1X($current_suggested_depth$.getDynamicValue(thread)), thread);
                                            if (NIL == node_markedP) {
                                                node_markedP = T;
                                                mark_suggested_node(node, depth);
                                            }
                                            if (NIL != suggestion_assertion_meets_arg_constraints_p(assertion)) {
                                                final SubLObject _prev_bind_0_$29 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_marking_generation$.bind(ZERO_INTEGER, thread);
                                                    result_nodes = nunion(result_nodes, mark_and_sweep_connected_typed_links(link_node, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_marking_generation$.rebind(_prev_bind_0_$29, thread);
                                                }
                                                result_nodes = nunion(result_nodes, mark_and_sweep_suggested_links(link_node), symbol_function(EQUAL), UNPROVIDED);
                                            }
                                        } finally {
                                            $current_suggested_depth$.rebind(_prev_bind_0_$28, thread);
                                        }
                                    }
                                    done_var_$25 = makeBoolean((NIL == valid_$27) || (NIL != done_var));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                                }
                            }
                        }
                        done_var_$24 = makeBoolean((NIL == valid) || (NIL != done_var));
                    } 
                }
                final SubLObject _prev_bind_0_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                try {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                    final SubLObject pred_var2 = $const8$kePrecisionSuggestionByTypeRestri;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, ONE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, ONE_INTEGER, pred_var2);
                        SubLObject done_var_$26 = done_var;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var_$26) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                    SubLObject done_var_$27 = done_var;
                                    final SubLObject token_var_$27 = NIL;
                                    while (NIL == done_var_$27) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$27);
                                        final SubLObject valid_$28 = makeBoolean(!token_var_$27.eql(assertion2));
                                        if (NIL != valid_$28) {
                                            final SubLObject link_node2 = assertions_high.gaf_arg2(assertion2);
                                            final SubLObject depth2 = $current_suggested_depth$.getDynamicValue(thread);
                                            final SubLObject _prev_bind_0_$32 = $current_suggested_depth$.currentBinding(thread);
                                            try {
                                                $current_suggested_depth$.bind(number_utilities.f_1X($current_suggested_depth$.getDynamicValue(thread)), thread);
                                                if (NIL == node_markedP) {
                                                    node_markedP = T;
                                                    mark_suggested_node(node, depth2);
                                                }
                                                if (NIL != suggestion_assertion_meets_arg_constraints_p(assertion2)) {
                                                    final SubLObject _prev_bind_0_$33 = sbhl_marking_vars.$sbhl_marking_generation$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$sbhl_marking_generation$.bind(ZERO_INTEGER, thread);
                                                        result_nodes = nunion(result_nodes, mark_and_sweep_connected_typed_links(link_node2, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
                                                    } finally {
                                                        sbhl_marking_vars.$sbhl_marking_generation$.rebind(_prev_bind_0_$33, thread);
                                                    }
                                                    result_nodes = nunion(result_nodes, mark_and_sweep_suggested_links(link_node2), symbol_function(EQUAL), UNPROVIDED);
                                                }
                                            } finally {
                                                $current_suggested_depth$.rebind(_prev_bind_0_$32, thread);
                                            }
                                        }
                                        done_var_$27 = makeBoolean((NIL == valid_$28) || (NIL != done_var));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                    }
                                }
                            }
                            done_var_$26 = makeBoolean((NIL == valid2) || (NIL != done_var));
                        } 
                    }
                } finally {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            $pred_streng_space$.rebind(_prev_bind_0, thread);
        }
        return result_nodes;
    }

    /**
     *
     *
     * @param NODE
    predicate
     * 		
     * @return list; the marking for NODE, of form (mode suggested-count generation), where mode = (#$genlInverse) || (#$genlPreds) ||
    (#$genlInverse #$genlPreds)
     */
    @LispMethod(comment = "@param NODE\npredicate\r\n\t\t\r\n@return list; the marking for NODE, of form (mode suggested-count generation), where mode = (#$genlInverse) || (#$genlPreds) ||\r\n(#$genlInverse #$genlPreds)")
    public static final SubLObject marked_with_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return gethash(node, $pred_streng_space$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param NODE
    predicate
     * 		
     * @return list; the marking for NODE, of form (mode suggested-count generation), where mode = (#$genlInverse) || (#$genlPreds) ||
    (#$genlInverse #$genlPreds)
     */
    @LispMethod(comment = "@param NODE\npredicate\r\n\t\t\r\n@return list; the marking for NODE, of form (mode suggested-count generation), where mode = (#$genlInverse) || (#$genlPreds) ||\r\n(#$genlInverse #$genlPreds)")
    public static SubLObject marked_with(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(node, $pred_streng_space$.getDynamicValue(thread), UNPROVIDED);
    }

    /**
     * has NODE been visited in the present mode (genlInverse/genlPreds)?
     */
    @LispMethod(comment = "has NODE been visited in the present mode (genlInverse/genlPreds)?")
    public static final SubLObject node_visited_in_current_mode_p_alt(SubLObject node) {
        return sbhl_marking_utilities.sbhl_predicate_path_termination_p(com.cyc.cycjava.cycl.predicate_strengthener_internals.node_marking_mode(node));
    }

    @LispMethod(comment = "has NODE been visited in the present mode (genlInverse/genlPreds)?")
    public static SubLObject node_visited_in_current_mode_p(final SubLObject node) {
        return sbhl_marking_utilities.sbhl_predicate_path_termination_p(node_marking_mode(node));
    }/**
     * has NODE been visited in the present mode (genlInverse/genlPreds)?
     */


    public static final SubLObject node_is_marked_with_fewer_than_current_suggested_links_p_alt(SubLObject node) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_is_unmysterious_p(node)) && com.cyc.cycjava.cycl.predicate_strengthener_internals.node_marking_suggested_count(node).numL(com.cyc.cycjava.cycl.predicate_strengthener_internals.get_current_suggested_depth()));
    }

    public static SubLObject node_is_marked_with_fewer_than_current_suggested_links_p(final SubLObject node) {
        return makeBoolean((NIL != node_is_unmysterious_p(node)) && node_marking_suggested_count(node).numL(get_current_suggested_depth()));
    }

    public static final SubLObject node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p_alt(SubLObject node) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.predicate_strengthener_internals.node_is_unmysterious_p(node)) || com.cyc.cycjava.cycl.predicate_strengthener_internals.node_marking_suggested_count(node).numG(com.cyc.cycjava.cycl.predicate_strengthener_internals.get_current_suggested_depth()));
    }

    public static SubLObject node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p(final SubLObject node) {
        return makeBoolean((NIL != node_is_unmysterious_p(node)) || node_marking_suggested_count(node).numG(get_current_suggested_depth()));
    }

    /**
     * node has not been marked marked with a suggested-count
     */
    @LispMethod(comment = "node has not been marked marked with a suggested-count")
    public static final SubLObject node_is_unmysterious_p_alt(SubLObject node) {
        return makeBoolean(!com.cyc.cycjava.cycl.predicate_strengthener_internals.node_marking_suggested_count(node).isInteger());
    }

    @LispMethod(comment = "node has not been marked marked with a suggested-count")
    public static SubLObject node_is_unmysterious_p(final SubLObject node) {
        return makeBoolean(!node_marking_suggested_count(node).isInteger());
    }/**
     * node has not been marked marked with a suggested-count
     */


    /**
     * Older means that it was visited earlier, and hence has a lower generational marking number than the current generation
     */
    @LispMethod(comment = "Older means that it was visited earlier, and hence has a lower generational marking number than the current generation")
    public static final SubLObject node_is_older_than_current_generation_p_alt(SubLObject node) {
        return numL(com.cyc.cycjava.cycl.predicate_strengthener_internals.node_marking_generation(node), sbhl_marking_vars.get_sbhl_marking_generation());
    }

    @LispMethod(comment = "Older means that it was visited earlier, and hence has a lower generational marking number than the current generation")
    public static SubLObject node_is_older_than_current_generation_p(final SubLObject node) {
        return numL(node_marking_generation(node), sbhl_marking_vars.get_sbhl_marking_generation());
    }/**
     * Older means that it was visited earlier, and hence has a lower generational marking number than the current generation
     */


    public static final SubLObject node_is_of_current_generation_p_alt(SubLObject node) {
        return numE(com.cyc.cycjava.cycl.predicate_strengthener_internals.node_marking_generation(node), sbhl_marking_vars.get_sbhl_marking_generation());
    }

    public static SubLObject node_is_of_current_generation_p(final SubLObject node) {
        return numE(node_marking_generation(node), sbhl_marking_vars.get_sbhl_marking_generation());
    }

    public static final SubLObject node_marking_mode_alt(SubLObject node) {
        return com.cyc.cycjava.cycl.predicate_strengthener_internals.pred_streng_marking_mode(com.cyc.cycjava.cycl.predicate_strengthener_internals.marked_with(node));
    }

    public static SubLObject node_marking_mode(final SubLObject node) {
        return pred_streng_marking_mode(marked_with(node));
    }

    public static final SubLObject pred_streng_marking_mode_alt(SubLObject marking) {
        return marking.first();
    }

    public static SubLObject pred_streng_marking_mode(final SubLObject marking) {
        return marking.first();
    }

    public static final SubLObject node_marking_suggested_count_alt(SubLObject node) {
        return com.cyc.cycjava.cycl.predicate_strengthener_internals.pred_streng_marking_suggested_count(com.cyc.cycjava.cycl.predicate_strengthener_internals.marked_with(node));
    }

    public static SubLObject node_marking_suggested_count(final SubLObject node) {
        return pred_streng_marking_suggested_count(marked_with(node));
    }

    public static final SubLObject pred_streng_marking_suggested_count_alt(SubLObject marking) {
        {
            SubLObject suggested_count = second(marking);
            if (suggested_count.isInteger()) {
                return suggested_count;
            }
        }
        return NIL;
    }

    public static SubLObject pred_streng_marking_suggested_count(final SubLObject marking) {
        final SubLObject suggested_count = second(marking);
        if (suggested_count.isInteger()) {
            return suggested_count;
        }
        return NIL;
    }

    public static final SubLObject node_marking_generation_alt(SubLObject node) {
        return com.cyc.cycjava.cycl.predicate_strengthener_internals.pred_streng_marking_generation(com.cyc.cycjava.cycl.predicate_strengthener_internals.marked_with(node));
    }

    public static SubLObject node_marking_generation(final SubLObject node) {
        return pred_streng_marking_generation(marked_with(node));
    }

    public static final SubLObject pred_streng_marking_generation_alt(SubLObject marking) {
        {
            SubLObject generation = third(marking);
            if (generation.isInteger()) {
                return generation;
            }
        }
        return ZERO_INTEGER;
    }

    public static SubLObject pred_streng_marking_generation(final SubLObject marking) {
        final SubLObject generation = third(marking);
        if (generation.isInteger()) {
            return generation;
        }
        return ZERO_INTEGER;
    }

    /**
     * remember that MARKING is appropriate for NODE
     *
     * @param NODE
    predicate
     * 		
     * @param MARKING
     * 		list; @see MARKED-WITH for details of marking
     */
    @LispMethod(comment = "remember that MARKING is appropriate for NODE\r\n\r\n@param NODE\npredicate\r\n\t\t\r\n@param MARKING\r\n\t\tlist; @see MARKED-WITH for details of marking")
    public static final SubLObject store_marking_alt(SubLObject node, SubLObject marking) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(node, $pred_streng_space$.getDynamicValue(thread), marking);
            return NIL;
        }
    }

    @LispMethod(comment = "remember that MARKING is appropriate for NODE\r\n\r\n@param NODE\n\t\tpredicate\r\n\t\t\r\n@param MARKING\r\n\t\tlist; @see MARKED-WITH for details of marking")
    public static SubLObject store_marking(final SubLObject node, final SubLObject marking) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(node, $pred_streng_space$.getDynamicValue(thread), marking);
        return NIL;
    }/**
     * remember that MARKING is appropriate for NODE
     *
     * @param NODE
    		predicate
     * 		
     * @param MARKING
     * 		list; @see MARKED-WITH for details of marking
     */


    /**
     * mark NODE with current mode, suggestion-depth, and generation
     */
    @LispMethod(comment = "mark NODE with current mode, suggestion-depth, and generation")
    public static final SubLObject generationally_mark_typed_node_alt(SubLObject node) {
        {
            SubLObject current_mode_marking = com.cyc.cycjava.cycl.predicate_strengthener_internals.node_marking_mode(node);
            SubLObject new_mode_marking = com.cyc.cycjava.cycl.predicate_strengthener_internals.determine_mode_from_marking(current_mode_marking);
            com.cyc.cycjava.cycl.predicate_strengthener_internals.store_marking(node, list(new_mode_marking, com.cyc.cycjava.cycl.predicate_strengthener_internals.get_current_suggested_depth(), sbhl_marking_vars.get_sbhl_marking_generation()));
        }
        return NIL;
    }

    @LispMethod(comment = "mark NODE with current mode, suggestion-depth, and generation")
    public static SubLObject generationally_mark_typed_node(final SubLObject node) {
        final SubLObject current_mode_marking = node_marking_mode(node);
        final SubLObject new_mode_marking = determine_mode_from_marking(current_mode_marking);
        store_marking(node, list(new_mode_marking, get_current_suggested_depth(), sbhl_marking_vars.get_sbhl_marking_generation()));
        return NIL;
    }/**
     * mark NODE with current mode, suggestion-depth, and generation
     */


    /**
     * mark NODE with current mode and suggestion-depth
     */
    @LispMethod(comment = "mark NODE with current mode and suggestion-depth")
    public static final SubLObject mark_suggested_node_alt(SubLObject node, SubLObject depth) {
        {
            SubLObject current_mode_marking = com.cyc.cycjava.cycl.predicate_strengthener_internals.node_marking_mode(node);
            SubLObject new_mode_marking = com.cyc.cycjava.cycl.predicate_strengthener_internals.determine_mode_from_marking(current_mode_marking);
            com.cyc.cycjava.cycl.predicate_strengthener_internals.store_marking(node, list(new_mode_marking, depth));
        }
        return NIL;
    }

    @LispMethod(comment = "mark NODE with current mode and suggestion-depth")
    public static SubLObject mark_suggested_node(final SubLObject node, final SubLObject depth) {
        final SubLObject current_mode_marking = node_marking_mode(node);
        final SubLObject new_mode_marking = determine_mode_from_marking(current_mode_marking);
        store_marking(node, list(new_mode_marking, depth));
        return NIL;
    }/**
     * mark NODE with current mode and suggestion-depth
     */


    public static final SubLObject determine_mode_from_marking_alt(SubLObject current_mode) {
        {
            SubLObject inverse_modeP = sbhl_search_vars.genl_inverse_mode_p();
            SubLObject result = NIL;
            if (NIL == current_mode) {
                if (NIL != inverse_modeP) {
                    result = sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue();
                } else {
                    result = sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue();
                }
            } else {
                if ((NIL != sbhl_marking_vars.genl_inverse_marking_p(current_mode)) && (NIL != inverse_modeP)) {
                    result = sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue();
                } else {
                    if ((NIL != sbhl_marking_vars.genl_preds_marking_p(current_mode)) && (NIL == inverse_modeP)) {
                        result = sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue();
                    } else {
                        result = sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue();
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject determine_mode_from_marking(final SubLObject current_mode) {
        final SubLObject inverse_modeP = sbhl_search_vars.genl_inverse_mode_p();
        SubLObject result = NIL;
        if (NIL == current_mode) {
            if (NIL != inverse_modeP) {
                result = sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue();
            } else {
                result = sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue();
            }
        } else
            if ((NIL != sbhl_marking_vars.genl_inverse_marking_p(current_mode)) && (NIL != inverse_modeP)) {
                result = sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue();
            } else
                if ((NIL != sbhl_marking_vars.genl_preds_marking_p(current_mode)) && (NIL == inverse_modeP)) {
                    result = sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue();
                } else {
                    result = sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue();
                }


        return result;
    }

    public static SubLObject declare_predicate_strengthener_internals_file() {
        declareFunction("get_arg_type_alist", "GET-ARG-TYPE-ALIST", 0, 0, false);
        declareMacro("with_arg_type_alist", "WITH-ARG-TYPE-ALIST");
        declareFunction("get_arg_type_store", "GET-ARG-TYPE-STORE", 1, 0, false);
        declareMacro("with_new_arg_type_genls_stores", "WITH-NEW-ARG-TYPE-GENLS-STORES");
        declareFunction("initialize_arg_type_genls_stores", "INITIALIZE-ARG-TYPE-GENLS-STORES", 1, 0, false);
        declareFunction("pred_streng_depth_mark_all_forward_true_nodes", "PRED-STRENG-DEPTH-MARK-ALL-FORWARD-TRUE-NODES", 1, 0, false);
        declareFunction("non_trivial_argn_isa", "NON-TRIVIAL-ARGN-ISA", 2, 0, false);
        declareFunction("arg_types_alist_satisfied_p", "ARG-TYPES-ALIST-SATISFIED-P", 1, 0, false);
        declareFunction("node_meets_arg_constraints_p", "NODE-MEETS-ARG-CONSTRAINTS-P", 1, 0, false);
        declareFunction("suggestion_assertion_meets_arg_constraints_p", "SUGGESTION-ASSERTION-MEETS-ARG-CONSTRAINTS-P", 1, 0, false);
        declareMacro("with_new_pred_streng_setup", "WITH-NEW-PRED-STRENG-SETUP");
        declareMacro("with_new_pred_streng_done", "WITH-NEW-PRED-STRENG-DONE");
        declareMacro("with_new_pred_streng_result_nodes", "WITH-NEW-PRED-STRENG-RESULT-NODES");
        declareFunction("push_node_onto_result", "PUSH-NODE-ONTO-RESULT", 1, 0, false);
        declareFunction("clear_result", "CLEAR-RESULT", 0, 0, false);
        declareMacro("with_pred_streng_result", "WITH-PRED-STRENG-RESULT");
        declareFunction("get_current_suggested_depth", "GET-CURRENT-SUGGESTED-DEPTH", 0, 0, false);
        declareMacro("with_incremented_suggested_depth", "WITH-INCREMENTED-SUGGESTED-DEPTH");
        declareMacro("with_new_suggested_depth", "WITH-NEW-SUGGESTED-DEPTH");
        declareMacro("with_new_pred_streng_spaces", "WITH-NEW-PRED-STRENG-SPACES");
        declareMacro("with_generational_space", "WITH-GENERATIONAL-SPACE");
        declareMacro("with_suggested_space", "WITH-SUGGESTED-SPACE");
        declareMacro("do_accessible_typed_nodes", "DO-ACCESSIBLE-TYPED-NODES");
        declareMacro("do_accessible_suggested_assertions", "DO-ACCESSIBLE-SUGGESTED-ASSERTIONS");
        declareFunction("strengthened_preds", "STRENGTHENED-PREDS", 2, 1, false);
        declareFunction("compute_pred_streng_result", "COMPUTE-PRED-STRENG-RESULT", 0, 0, false);
        declareFunction("mark_and_sweep_connected_typed_links", "MARK-AND-SWEEP-CONNECTED-TYPED-LINKS", 1, 1, false);
        declareFunction("mark_and_sweep_suggested_links", "MARK-AND-SWEEP-SUGGESTED-LINKS", 1, 0, false);
        declareFunction("marked_with", "MARKED-WITH", 1, 0, false);
        declareFunction("node_visited_in_current_mode_p", "NODE-VISITED-IN-CURRENT-MODE-P", 1, 0, false);
        declareFunction("node_is_marked_with_fewer_than_current_suggested_links_p", "NODE-IS-MARKED-WITH-FEWER-THAN-CURRENT-SUGGESTED-LINKS-P", 1, 0, false);
        declareFunction("node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p", "NODE-IS-UNMYSTERIOUS-OR-MARKED-WITH-MORE-THAN-CURRENT-SUGGESTED-LINKS-P", 1, 0, false);
        declareFunction("node_is_unmysterious_p", "NODE-IS-UNMYSTERIOUS-P", 1, 0, false);
        declareFunction("node_is_older_than_current_generation_p", "NODE-IS-OLDER-THAN-CURRENT-GENERATION-P", 1, 0, false);
        declareFunction("node_is_of_current_generation_p", "NODE-IS-OF-CURRENT-GENERATION-P", 1, 0, false);
        declareFunction("node_marking_mode", "NODE-MARKING-MODE", 1, 0, false);
        declareFunction("pred_streng_marking_mode", "PRED-STRENG-MARKING-MODE", 1, 0, false);
        declareFunction("node_marking_suggested_count", "NODE-MARKING-SUGGESTED-COUNT", 1, 0, false);
        declareFunction("pred_streng_marking_suggested_count", "PRED-STRENG-MARKING-SUGGESTED-COUNT", 1, 0, false);
        declareFunction("node_marking_generation", "NODE-MARKING-GENERATION", 1, 0, false);
        declareFunction("pred_streng_marking_generation", "PRED-STRENG-MARKING-GENERATION", 1, 0, false);
        declareFunction("store_marking", "STORE-MARKING", 2, 0, false);
        declareFunction("generationally_mark_typed_node", "GENERATIONALLY-MARK-TYPED-NODE", 1, 0, false);
        declareFunction("mark_suggested_node", "MARK-SUGGESTED-NODE", 2, 0, false);
        declareFunction("determine_mode_from_marking", "DETERMINE-MODE-FROM-MARKING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_predicate_strengthener_internals_file() {
        defparameter("*ARG-TYPE-ALIST*", NIL);
        defparameter("*ARG-TYPE-GENLS-STORES*", NIL);
        defparameter("*PRED-STRENG-DONE?*", NIL);
        defparameter("*PRED-STRENG-RESULT-NODES*", NIL);
        defparameter("*CURRENT-SUGGESTED-DEPTH*", NIL);
        defparameter("*PRED-STRENG-SPACE*", NIL);
        defparameter("*PRED-STRENG-GENERATIONAL-SPACE*", NIL);
        defparameter("*PRED-STRENG-SUGGESTED-SPACE*", NIL);
        return NIL;
    }

    public static SubLObject setup_predicate_strengthener_internals_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_predicate_strengthener_internals_file();
    }

    @Override
    public void initializeVariables() {
        init_predicate_strengthener_internals_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_predicate_strengthener_internals_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("ALIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt3 = list(list(makeSymbol("*ARG-TYPE-GENLS-STORES*"), list(makeSymbol("NEW-DICTIONARY"), list(QUOTE, EQUAL))));

    static private final SubLList $list_alt13 = list(list(makeSymbol("*PRED-STRENG-DONE?*"), NIL));

    static private final SubLList $list_alt14 = list(list(makeSymbol("*PRED-STRENG-RESULT-NODES*"), list(makeSymbol("NEW-DICTIONARY"))));

    static private final SubLList $list_alt15 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("COMPUTE-PRED-STRENG-RESULT")));

    static private final SubLList $list_alt21 = list(list(makeSymbol("*CURRENT-SUGGESTED-DEPTH*"), list(makeSymbol("1+"), makeSymbol("*CURRENT-SUGGESTED-DEPTH*"))));

    static private final SubLList $list_alt22 = list(list(makeSymbol("*CURRENT-SUGGESTED-DEPTH*"), ZERO_INTEGER));

    static private final SubLList $list_alt23 = list(list(makeSymbol("*PRED-STRENG-GENERATIONAL-SPACE*"), list(makeSymbol("MAKE-HASH-TABLE"), TWENTY_INTEGER)), list(makeSymbol("*PRED-STRENG-SUGGESTED-SPACE*"), list(makeSymbol("MAKE-HASH-TABLE"), TWENTY_INTEGER)));

    static private final SubLList $list_alt24 = list(list(makeSymbol("*PRED-STRENG-SPACE*"), makeSymbol("*PRED-STRENG-GENERATIONAL-SPACE*")));

    static private final SubLList $list_alt25 = list(list(makeSymbol("*PRED-STRENG-SPACE*"), makeSymbol("*PRED-STRENG-SUGGESTED-SPACE*")));

    static private final SubLList $list_alt26 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt27 = list($DONE);

    static private final SubLList $list_alt39 = list(list(makeSymbol("ASS-VAR"), makeSymbol("LINK-NODE-VAR"), makeSymbol("DEPTH-VAR"), makeSymbol("NODE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt43 = list(makeSymbol("*CURRENT-SUGGESTED-DEPTH*"));
}

/**
 * Total time: 398 ms
 */
