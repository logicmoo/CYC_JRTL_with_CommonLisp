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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class predicate_strengthener_internals extends SubLTranslatedFile {
    public static final SubLFile me = new predicate_strengthener_internals();

    public static final String myName = "com.cyc.cycjava.cycl.predicate_strengthener_internals";

    public static final String myFingerPrint = "522d36a84a0836eba6fefa66a8494aad079e12e305d097455d89b85b6d459c88";



    // defparameter
    /**
     * Precomputed all-genls of each of the constraint collections for leaf
     * predicate wrt arg-type searches.
     */
    private static final SubLSymbol $arg_type_genls_stores$ = makeSymbol("*ARG-TYPE-GENLS-STORES*");

    // defparameter
    private static final SubLSymbol $pred_streng_doneP$ = makeSymbol("*PRED-STRENG-DONE?*");

    // defparameter
    /**
     * Variable used to store the results of predicate-strengthening. Contains a
     * dictionary, with preds as keys, and markings as the values. @see MARKED-WITH
     * for marking details
     */
    private static final SubLSymbol $pred_streng_result_nodes$ = makeSymbol("*PRED-STRENG-RESULT-NODES*");

    // defparameter
    /**
     * At the present state of search, how many suggested nodes have been passed
     * through?
     */
    private static final SubLSymbol $current_suggested_depth$ = makeSymbol("*CURRENT-SUGGESTED-DEPTH*");

    // defparameter
    private static final SubLSymbol $pred_streng_space$ = makeSymbol("*PRED-STRENG-SPACE*");

    // defparameter
    private static final SubLSymbol $pred_streng_generational_space$ = makeSymbol("*PRED-STRENG-GENERATIONAL-SPACE*");

    // defparameter
    private static final SubLSymbol $pred_streng_suggested_space$ = makeSymbol("*PRED-STRENG-SUGGESTED-SPACE*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("ALIST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $arg_type_alist$ = makeSymbol("*ARG-TYPE-ALIST*");

    public static final SubLList $list3 = list(list(makeSymbol("*ARG-TYPE-GENLS-STORES*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("QUOTE"), EQUAL))));

    public static final SubLSymbol INITIALIZE_ARG_TYPE_GENLS_STORES = makeSymbol("INITIALIZE-ARG-TYPE-GENLS-STORES");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $const8$kePrecisionSuggestionByTypeRestri = reader_make_constant_shell(makeString("kePrecisionSuggestionByTypeRestriction-Inverse"));

    public static final SubLSymbol WITH_NEW_PRED_STRENG_DONE = makeSymbol("WITH-NEW-PRED-STRENG-DONE");

    public static final SubLSymbol WITH_NEW_PRED_STRENG_SPACES = makeSymbol("WITH-NEW-PRED-STRENG-SPACES");

    public static final SubLSymbol WITH_NEW_SUGGESTED_DEPTH = makeSymbol("WITH-NEW-SUGGESTED-DEPTH");

    public static final SubLSymbol WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = makeSymbol("WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");

    public static final SubLList $list13 = list(list(makeSymbol("*PRED-STRENG-DONE?*"), NIL));

    public static final SubLList $list14 = list(list(makeSymbol("*PRED-STRENG-RESULT-NODES*"), list(makeSymbol("NEW-DICTIONARY"))));

    public static final SubLList $list15 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol WITH_NEW_PRED_STRENG_RESULT_NODES = makeSymbol("WITH-NEW-PRED-STRENG-RESULT-NODES");







    public static final SubLList $list20 = list(list(makeSymbol("COMPUTE-PRED-STRENG-RESULT")));

    public static final SubLList $list21 = list(list(makeSymbol("*CURRENT-SUGGESTED-DEPTH*"), list(makeSymbol("1+"), makeSymbol("*CURRENT-SUGGESTED-DEPTH*"))));

    public static final SubLList $list22 = list(list(makeSymbol("*CURRENT-SUGGESTED-DEPTH*"), ZERO_INTEGER));

    public static final SubLList $list23 = list(list(makeSymbol("*PRED-STRENG-GENERATIONAL-SPACE*"), list(makeSymbol("MAKE-HASH-TABLE"), TWENTY_INTEGER)), list(makeSymbol("*PRED-STRENG-SUGGESTED-SPACE*"), list(makeSymbol("MAKE-HASH-TABLE"), TWENTY_INTEGER)));

    public static final SubLList $list24 = list(list(makeSymbol("*PRED-STRENG-SPACE*"), makeSymbol("*PRED-STRENG-GENERATIONAL-SPACE*")));

    public static final SubLList $list25 = list(list(makeSymbol("*PRED-STRENG-SPACE*"), makeSymbol("*PRED-STRENG-SUGGESTED-SPACE*")));

    public static final SubLList $list26 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list27 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol $sym30$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    public static final SubLSymbol $sym31$ASS_VAR = makeUninternedSymbol("ASS-VAR");







    private static final SubLObject $$typedGenlPreds = reader_make_constant_shell(makeString("typedGenlPreds"));



    public static final SubLSymbol FLIP_GENL_INVERSE_MODE = makeSymbol("FLIP-GENL-INVERSE-MODE");

    private static final SubLObject $$typedGenlInverse = reader_make_constant_shell(makeString("typedGenlInverse"));

    public static final SubLList $list39 = list(list(makeSymbol("ASS-VAR"), makeSymbol("LINK-NODE-VAR"), makeSymbol("DEPTH-VAR"), makeSymbol("NODE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym40$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    private static final SubLObject $const41$kePrecisionSuggestionByTypeRestri = reader_make_constant_shell(makeString("kePrecisionSuggestionByTypeRestriction-Binary"));



    public static final SubLList $list43 = list(makeSymbol("*CURRENT-SUGGESTED-DEPTH*"));

    public static final SubLSymbol WITH_INCREMENTED_SUGGESTED_DEPTH = makeSymbol("WITH-INCREMENTED-SUGGESTED-DEPTH");

    private static final SubLObject $$UnderspecifiedPredicate = reader_make_constant_shell(makeString("UnderspecifiedPredicate"));



    public static SubLObject get_arg_type_alist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $arg_type_alist$.getDynamicValue(thread);
    }

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

    public static SubLObject get_arg_type_store(final SubLObject key_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($arg_type_genls_stores$.getDynamicValue(thread), key_list, UNPROVIDED);
    }

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

    public static SubLObject pred_streng_depth_mark_all_forward_true_nodes(final SubLObject col) {
        sbhl_marking_methods.sbhl_mark_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject non_trivial_argn_isa(final SubLObject pred, final SubLObject argnum) {
        return remove($$Thing, kb_accessors.argn_isa(pred, argnum, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

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

    public static SubLObject node_meets_arg_constraints_p(final SubLObject node) {
        return arg_types_alist_satisfied_p(node);
    }

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

    public static SubLObject with_new_pred_streng_setup(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_PRED_STRENG_DONE, list(WITH_NEW_PRED_STRENG_SPACES, list(WITH_NEW_SUGGESTED_DEPTH, bq_cons(WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, append(body, NIL)))));
    }

    public static SubLObject with_new_pred_streng_done(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list13, append(body, NIL));
    }

    public static SubLObject with_new_pred_streng_result_nodes(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list14, append(body, NIL));
    }

    public static SubLObject push_node_onto_result(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.dictionary_enter($pred_streng_result_nodes$.getDynamicValue(thread), node, marked_with(node));
        return NIL;
    }

    public static SubLObject clear_result() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary($pred_streng_result_nodes$.getDynamicValue(thread));
        return NIL;
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

    public static SubLObject get_current_suggested_depth() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_suggested_depth$.getDynamicValue(thread);
    }

    public static SubLObject with_incremented_suggested_depth(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list21, append(body, NIL));
    }

    public static SubLObject with_new_suggested_depth(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list22, append(body, NIL));
    }

    public static SubLObject with_new_pred_streng_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list23, append(body, NIL));
    }

    public static SubLObject with_generational_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list24, append(body, NIL));
    }

    public static SubLObject with_suggested_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list25, append(body, NIL));
    }

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

    public static SubLObject compute_pred_streng_result() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $pred_streng_result_nodes$.getDynamicValue(thread);
    }

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

    public static SubLObject marked_with(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(node, $pred_streng_space$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject node_visited_in_current_mode_p(final SubLObject node) {
        return sbhl_marking_utilities.sbhl_predicate_path_termination_p(node_marking_mode(node));
    }

    public static SubLObject node_is_marked_with_fewer_than_current_suggested_links_p(final SubLObject node) {
        return makeBoolean((NIL != node_is_unmysterious_p(node)) && node_marking_suggested_count(node).numL(get_current_suggested_depth()));
    }

    public static SubLObject node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p(final SubLObject node) {
        return makeBoolean((NIL != node_is_unmysterious_p(node)) || node_marking_suggested_count(node).numG(get_current_suggested_depth()));
    }

    public static SubLObject node_is_unmysterious_p(final SubLObject node) {
        return makeBoolean(!node_marking_suggested_count(node).isInteger());
    }

    public static SubLObject node_is_older_than_current_generation_p(final SubLObject node) {
        return numL(node_marking_generation(node), sbhl_marking_vars.get_sbhl_marking_generation());
    }

    public static SubLObject node_is_of_current_generation_p(final SubLObject node) {
        return numE(node_marking_generation(node), sbhl_marking_vars.get_sbhl_marking_generation());
    }

    public static SubLObject node_marking_mode(final SubLObject node) {
        return pred_streng_marking_mode(marked_with(node));
    }

    public static SubLObject pred_streng_marking_mode(final SubLObject marking) {
        return marking.first();
    }

    public static SubLObject node_marking_suggested_count(final SubLObject node) {
        return pred_streng_marking_suggested_count(marked_with(node));
    }

    public static SubLObject pred_streng_marking_suggested_count(final SubLObject marking) {
        final SubLObject suggested_count = second(marking);
        if (suggested_count.isInteger()) {
            return suggested_count;
        }
        return NIL;
    }

    public static SubLObject node_marking_generation(final SubLObject node) {
        return pred_streng_marking_generation(marked_with(node));
    }

    public static SubLObject pred_streng_marking_generation(final SubLObject marking) {
        final SubLObject generation = third(marking);
        if (generation.isInteger()) {
            return generation;
        }
        return ZERO_INTEGER;
    }

    public static SubLObject store_marking(final SubLObject node, final SubLObject marking) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(node, $pred_streng_space$.getDynamicValue(thread), marking);
        return NIL;
    }

    public static SubLObject generationally_mark_typed_node(final SubLObject node) {
        final SubLObject current_mode_marking = node_marking_mode(node);
        final SubLObject new_mode_marking = determine_mode_from_marking(current_mode_marking);
        store_marking(node, list(new_mode_marking, get_current_suggested_depth(), sbhl_marking_vars.get_sbhl_marking_generation()));
        return NIL;
    }

    public static SubLObject mark_suggested_node(final SubLObject node, final SubLObject depth) {
        final SubLObject current_mode_marking = node_marking_mode(node);
        final SubLObject new_mode_marking = determine_mode_from_marking(current_mode_marking);
        store_marking(node, list(new_mode_marking, depth));
        return NIL;
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
        declareFunction(me, "get_arg_type_alist", "GET-ARG-TYPE-ALIST", 0, 0, false);
        declareMacro(me, "with_arg_type_alist", "WITH-ARG-TYPE-ALIST");
        declareFunction(me, "get_arg_type_store", "GET-ARG-TYPE-STORE", 1, 0, false);
        declareMacro(me, "with_new_arg_type_genls_stores", "WITH-NEW-ARG-TYPE-GENLS-STORES");
        declareFunction(me, "initialize_arg_type_genls_stores", "INITIALIZE-ARG-TYPE-GENLS-STORES", 1, 0, false);
        declareFunction(me, "pred_streng_depth_mark_all_forward_true_nodes", "PRED-STRENG-DEPTH-MARK-ALL-FORWARD-TRUE-NODES", 1, 0, false);
        declareFunction(me, "non_trivial_argn_isa", "NON-TRIVIAL-ARGN-ISA", 2, 0, false);
        declareFunction(me, "arg_types_alist_satisfied_p", "ARG-TYPES-ALIST-SATISFIED-P", 1, 0, false);
        declareFunction(me, "node_meets_arg_constraints_p", "NODE-MEETS-ARG-CONSTRAINTS-P", 1, 0, false);
        declareFunction(me, "suggestion_assertion_meets_arg_constraints_p", "SUGGESTION-ASSERTION-MEETS-ARG-CONSTRAINTS-P", 1, 0, false);
        declareMacro(me, "with_new_pred_streng_setup", "WITH-NEW-PRED-STRENG-SETUP");
        declareMacro(me, "with_new_pred_streng_done", "WITH-NEW-PRED-STRENG-DONE");
        declareMacro(me, "with_new_pred_streng_result_nodes", "WITH-NEW-PRED-STRENG-RESULT-NODES");
        declareFunction(me, "push_node_onto_result", "PUSH-NODE-ONTO-RESULT", 1, 0, false);
        declareFunction(me, "clear_result", "CLEAR-RESULT", 0, 0, false);
        declareMacro(me, "with_pred_streng_result", "WITH-PRED-STRENG-RESULT");
        declareFunction(me, "get_current_suggested_depth", "GET-CURRENT-SUGGESTED-DEPTH", 0, 0, false);
        declareMacro(me, "with_incremented_suggested_depth", "WITH-INCREMENTED-SUGGESTED-DEPTH");
        declareMacro(me, "with_new_suggested_depth", "WITH-NEW-SUGGESTED-DEPTH");
        declareMacro(me, "with_new_pred_streng_spaces", "WITH-NEW-PRED-STRENG-SPACES");
        declareMacro(me, "with_generational_space", "WITH-GENERATIONAL-SPACE");
        declareMacro(me, "with_suggested_space", "WITH-SUGGESTED-SPACE");
        declareMacro(me, "do_accessible_typed_nodes", "DO-ACCESSIBLE-TYPED-NODES");
        declareMacro(me, "do_accessible_suggested_assertions", "DO-ACCESSIBLE-SUGGESTED-ASSERTIONS");
        declareFunction(me, "strengthened_preds", "STRENGTHENED-PREDS", 2, 1, false);
        declareFunction(me, "compute_pred_streng_result", "COMPUTE-PRED-STRENG-RESULT", 0, 0, false);
        declareFunction(me, "mark_and_sweep_connected_typed_links", "MARK-AND-SWEEP-CONNECTED-TYPED-LINKS", 1, 1, false);
        declareFunction(me, "mark_and_sweep_suggested_links", "MARK-AND-SWEEP-SUGGESTED-LINKS", 1, 0, false);
        declareFunction(me, "marked_with", "MARKED-WITH", 1, 0, false);
        declareFunction(me, "node_visited_in_current_mode_p", "NODE-VISITED-IN-CURRENT-MODE-P", 1, 0, false);
        declareFunction(me, "node_is_marked_with_fewer_than_current_suggested_links_p", "NODE-IS-MARKED-WITH-FEWER-THAN-CURRENT-SUGGESTED-LINKS-P", 1, 0, false);
        declareFunction(me, "node_is_unmysterious_or_marked_with_more_than_current_suggested_links_p", "NODE-IS-UNMYSTERIOUS-OR-MARKED-WITH-MORE-THAN-CURRENT-SUGGESTED-LINKS-P", 1, 0, false);
        declareFunction(me, "node_is_unmysterious_p", "NODE-IS-UNMYSTERIOUS-P", 1, 0, false);
        declareFunction(me, "node_is_older_than_current_generation_p", "NODE-IS-OLDER-THAN-CURRENT-GENERATION-P", 1, 0, false);
        declareFunction(me, "node_is_of_current_generation_p", "NODE-IS-OF-CURRENT-GENERATION-P", 1, 0, false);
        declareFunction(me, "node_marking_mode", "NODE-MARKING-MODE", 1, 0, false);
        declareFunction(me, "pred_streng_marking_mode", "PRED-STRENG-MARKING-MODE", 1, 0, false);
        declareFunction(me, "node_marking_suggested_count", "NODE-MARKING-SUGGESTED-COUNT", 1, 0, false);
        declareFunction(me, "pred_streng_marking_suggested_count", "PRED-STRENG-MARKING-SUGGESTED-COUNT", 1, 0, false);
        declareFunction(me, "node_marking_generation", "NODE-MARKING-GENERATION", 1, 0, false);
        declareFunction(me, "pred_streng_marking_generation", "PRED-STRENG-MARKING-GENERATION", 1, 0, false);
        declareFunction(me, "store_marking", "STORE-MARKING", 2, 0, false);
        declareFunction(me, "generationally_mark_typed_node", "GENERATIONALLY-MARK-TYPED-NODE", 1, 0, false);
        declareFunction(me, "mark_suggested_node", "MARK-SUGGESTED-NODE", 2, 0, false);
        declareFunction(me, "determine_mode_from_marking", "DETERMINE-MODE-FROM-MARKING", 1, 0, false);
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

    
}

/**
 * Total time: 398 ms
 */
