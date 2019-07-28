package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.kb_gp_mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.kb_gp_mapping.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kb_gp_mapping extends SubLTranslatedFile {
    public static final SubLFile me = new kb_gp_mapping();

    public static final String myName = "com.cyc.cycjava.cycl.kb_gp_mapping";

    public static final String myFingerPrint = "4991f980f0679868b49fd1b6e5e2a893962cd62fea598ccc50ae3e3ba22a7c1d";

    // defparameter
    public static final SubLSymbol $mapping_arg_swap$ = makeSymbol("*MAPPING-ARG-SWAP*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list1 = list(makeKeyword("INDEX"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");







    public static final SubLSymbol WITH_ALL_SPEC_PREDICATES = makeSymbol("WITH-ALL-SPEC-PREDICATES");









    public static final SubLSymbol $sym11$DGAIGP_BINARY_ = makeSymbol("DGAIGP-BINARY?");

    public static final SubLSymbol WITH_ALL_SPEC_INVERSES = makeSymbol("WITH-ALL-SPEC-INVERSES");

    public static final SubLSymbol BINARY_ARG_SWAP = makeSymbol("BINARY-ARG-SWAP");



    public static final SubLList $list15 = list(list(makeSymbol("*MAPPING-ARG-SWAP*"), list(makeSymbol("CNOT"), makeSymbol("*MAPPING-ARG-SWAP*"))));



    public static final SubLList $list17 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("GATHER-INDEX"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym18$ASSERTION = makeUninternedSymbol("ASSERTION");

    public static final SubLSymbol DGAIVGP_ARG = makeSymbol("DGAIVGP-ARG");

    public static final SubLSymbol DO_GAF_ARG_INDEX_VALUES_GP = makeSymbol("DO-GAF-ARG-INDEX-VALUES-GP");











    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

















    public static final SubLList $list35 = list(list(makeSymbol("VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol ALL_SPEC_PREDS = makeSymbol("ALL-SPEC-PREDS");

    public static final SubLSymbol ALL_SPEC_INVERSES = makeSymbol("ALL-SPEC-INVERSES");

    public static final SubLList $list39 = list(list(makeSymbol("VAR"), makeSymbol("PRED"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list40 = list(makeKeyword("TRUTH"), makeKeyword("DONE"));

    public static final SubLSymbol $sym41$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");

    public static final SubLSymbol DO_ALL_SPEC_PREDICATES2 = makeSymbol("DO-ALL-SPEC-PREDICATES2");



    public static final SubLSymbol $sym44$BINARY_ = makeSymbol("BINARY?");

    public static final SubLSymbol DO_ALL_SPEC_INVERSES2 = makeSymbol("DO-ALL-SPEC-INVERSES2");

    public static final SubLList $list46 = list(list(makeSymbol("VAR"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym47$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");



    public static final SubLList $list49 = list(list(makeSymbol("VAR"), makeSymbol("TERM"), makeSymbol("PRED"), makeSymbol("DONE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), makeSymbol("TRUTH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym50$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");



    public static final SubLSymbol DO_ARG_INDEX_WITH_SPEC_PREDS = makeSymbol("DO-ARG-INDEX-WITH-SPEC-PREDS");

    public static SubLObject do_gaf_arg_index_gp(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PROGN, list(WITH_ALL_SPEC_PREDICATES, predicate, listS(DO_GAF_ARG_INDEX, list(var, v_term, $INDEX, index, $TRUTH, $TRUE, $DONE, done), append(body, NIL))), list(PWHEN, list($sym11$DGAIGP_BINARY_, predicate), list(WITH_ALL_SPEC_INVERSES, predicate, list(DO_GAF_ARG_INDEX, list(var, v_term, $INDEX, list(BINARY_ARG_SWAP, index), $TRUTH, $TRUE, $DONE, done), listS(CLET, $list15, append(body, NIL))))));
    }

    public static SubLObject dgaigp_binaryP(final SubLObject predicate) {
        return arity.binaryP(predicate);
    }

    public static SubLObject do_gaf_arg_index_values_gp(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject gather_index = NIL;
        SubLObject predicate = NIL;
        destructuring_bind_must_consp(current, datum, $list17);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        gather_index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list17);
        predicate = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list17);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list17);
            if (NIL == member(current_$2, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list17);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject assertion = $sym18$ASSERTION;
        return list(DO_GAF_ARG_INDEX_GP, list(assertion, v_term, predicate, $INDEX, index, $DONE, done), listS(CLET, list(list(var, list(DGAIVGP_ARG, assertion, gather_index))), append(body, NIL)));
    }

    public static SubLObject dgaivgp_arg(final SubLObject assertion, final SubLObject gather_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return assertions_high.gaf_arg(assertion, NIL != $mapping_arg_swap$.getDynamicValue(thread) ? arity.binary_arg_swap(gather_index) : gather_index);
    }

    public static SubLObject gp_map_arg_index(final SubLObject function, final SubLObject v_term, final SubLObject arg, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                pred_relevance_macros.$pred$.bind(predicate, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arg, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arg, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$3 = NIL;
                                final SubLObject token_var_$4 = NIL;
                                while (NIL == done_var_$3) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                    if (NIL != valid_$5) {
                                        funcall(function, assertion);
                                    }
                                    done_var_$3 = makeBoolean(NIL == valid_$5);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
            if (NIL != dgaigp_binaryP(predicate)) {
                _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                    pred_relevance_macros.$pred$.bind(predicate, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(arg), pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(arg), pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion));
                                        if (NIL != valid_$6) {
                                            final SubLObject _prev_bind_0_$7 = $mapping_arg_swap$.currentBinding(thread);
                                            try {
                                                $mapping_arg_swap$.bind(makeBoolean(NIL == $mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                funcall(function, assertion);
                                            } finally {
                                                $mapping_arg_swap$.rebind(_prev_bind_0_$7, thread);
                                            }
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject gp_gather_gaf_arg_index(final SubLObject v_term, final SubLObject arg, final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        if (NIL == mt) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject _prev_bind_0_$12 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$13 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                    pred_relevance_macros.$pred$.bind(predicate, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arg, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arg, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$14 = NIL;
                                    final SubLObject token_var_$15 = NIL;
                                    while (NIL == done_var_$14) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
                                        final SubLObject valid_$16 = makeBoolean(!token_var_$15.eql(assertion));
                                        if (NIL != valid_$16) {
                                            v_answer = cons(assertion, v_answer);
                                        }
                                        done_var_$14 = makeBoolean(NIL == valid_$16);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_$13, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$12, thread);
                }
                if (NIL != dgaigp_binaryP(predicate)) {
                    final SubLObject _prev_bind_0_$14 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$14 = pred_relevance_macros.$pred$.currentBinding(thread);
                    try {
                        pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                        pred_relevance_macros.$pred$.bind(predicate, thread);
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(arg), pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(arg), pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$15 = NIL;
                                        final SubLObject token_var_$16 = NIL;
                                        while (NIL == done_var_$15) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$16);
                                            final SubLObject valid_$17 = makeBoolean(!token_var_$16.eql(assertion));
                                            if (NIL != valid_$17) {
                                                final SubLObject _prev_bind_0_$15 = $mapping_arg_swap$.currentBinding(thread);
                                                try {
                                                    $mapping_arg_swap$.bind(makeBoolean(NIL == $mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                    v_answer = cons(assertion, v_answer);
                                                } finally {
                                                    $mapping_arg_swap$.rebind(_prev_bind_0_$15, thread);
                                                }
                                            }
                                            done_var_$15 = makeBoolean(NIL == valid_$17);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } finally {
                        pred_relevance_macros.$pred$.rebind(_prev_bind_1_$14, thread);
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                final SubLObject _prev_bind_0_$17 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$15 = pred_relevance_macros.$pred$.currentBinding(thread);
                try {
                    pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                    pred_relevance_macros.$pred$.bind(predicate, thread);
                    final SubLObject pred_var = NIL;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arg, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arg, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$16 = NIL;
                                    final SubLObject token_var_$17 = NIL;
                                    while (NIL == done_var_$16) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                        final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(assertion));
                                        if (NIL != valid_$18) {
                                            v_answer = cons(assertion, v_answer);
                                        }
                                        done_var_$16 = makeBoolean(NIL == valid_$18);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } finally {
                    pred_relevance_macros.$pred$.rebind(_prev_bind_1_$15, thread);
                    pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$17, thread);
                }
                if (NIL != dgaigp_binaryP(predicate)) {
                    final SubLObject _prev_bind_0_$19 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$16 = pred_relevance_macros.$pred$.currentBinding(thread);
                    try {
                        pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                        pred_relevance_macros.$pred$.bind(predicate, thread);
                        final SubLObject pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(arg), pred_var)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(arg), pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$17 = NIL;
                                        final SubLObject token_var_$18 = NIL;
                                        while (NIL == done_var_$17) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                            final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(assertion));
                                            if (NIL != valid_$19) {
                                                final SubLObject _prev_bind_0_$20 = $mapping_arg_swap$.currentBinding(thread);
                                                try {
                                                    $mapping_arg_swap$.bind(makeBoolean(NIL == $mapping_arg_swap$.getDynamicValue(thread)), thread);
                                                    v_answer = cons(assertion, v_answer);
                                                } finally {
                                                    $mapping_arg_swap$.rebind(_prev_bind_0_$20, thread);
                                                }
                                            }
                                            done_var_$17 = makeBoolean(NIL == valid_$19);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                        }
                    } finally {
                        pred_relevance_macros.$pred$.rebind(_prev_bind_1_$16, thread);
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return v_answer;
    }

    public static SubLObject gp_fpred_value(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) " + v_term;
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        assert NIL != integerp(index_arg) : "Types.integerp(index_arg) " + "CommonSymbols.NIL != Types.integerp(index_arg) " + index_arg;
        assert NIL != integerp(gather_arg) : "Types.integerp(gather_arg) " + "CommonSymbols.NIL != Types.integerp(gather_arg) " + gather_arg;
        SubLObject done = NIL;
        SubLObject v_answer = NIL;
        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
            pred_relevance_macros.$pred$.bind(pred, thread);
            final SubLObject pred_var = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred_var);
                SubLObject done_var = done;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$38 = done;
                            final SubLObject token_var_$39 = NIL;
                            while (NIL == done_var_$38) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$39);
                                final SubLObject valid_$40 = makeBoolean(!token_var_$39.eql(assertion));
                                if (NIL != valid_$40) {
                                    final SubLObject value = v_answer = dgaivgp_arg(assertion, gather_arg);
                                    done = T;
                                }
                                done_var_$38 = makeBoolean((NIL == valid_$40) || (NIL != done));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != done));
                } 
            }
        } finally {
            pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != dgaigp_binaryP(pred)) {
            _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                pred_relevance_macros.$pred$.bind(pred, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(index_arg), pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(index_arg), pred_var);
                    SubLObject done_var = done;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$39 = done;
                                final SubLObject token_var_$40 = NIL;
                                while (NIL == done_var_$39) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                    final SubLObject valid_$41 = makeBoolean(!token_var_$40.eql(assertion));
                                    if (NIL != valid_$41) {
                                        final SubLObject _prev_bind_0_$42 = $mapping_arg_swap$.currentBinding(thread);
                                        try {
                                            $mapping_arg_swap$.bind(makeBoolean(NIL == $mapping_arg_swap$.getDynamicValue(thread)), thread);
                                            final SubLObject value2 = v_answer = dgaivgp_arg(assertion, gather_arg);
                                            done = T;
                                        } finally {
                                            $mapping_arg_swap$.rebind(_prev_bind_0_$42, thread);
                                        }
                                    }
                                    done_var_$39 = makeBoolean((NIL == valid_$41) || (NIL != done));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != done));
                    } 
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        }
        return v_answer;
    }

    public static SubLObject gp_fpred_value_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            ans = gp_fpred_value(v_term, pred, index_arg, gather_arg);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject gp_fpred_value_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(mts) : "Types.listp(mts) " + "CommonSymbols.NIL != Types.listp(mts) " + mts;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            ans = gp_fpred_value(v_term, pred, index_arg, gather_arg);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject gp_fpred_value_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = gp_fpred_value(v_term, pred, index_arg, gather_arg);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject gp_fpred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            ans = gp_fpred_value(v_term, pred, index_arg, gather_arg);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject gp_pred_values(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(v_term) : "kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) " + v_term;
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        assert NIL != integerp(index_arg) : "Types.integerp(index_arg) " + "CommonSymbols.NIL != Types.integerp(index_arg) " + index_arg;
        assert NIL != integerp(gather_arg) : "Types.integerp(gather_arg) " + "CommonSymbols.NIL != Types.integerp(gather_arg) " + gather_arg;
        SubLObject v_answer = NIL;
        SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        SubLObject _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
        try {
            pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
            pred_relevance_macros.$pred$.bind(pred, thread);
            final SubLObject pred_var = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, index_arg, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, index_arg, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$47 = NIL;
                            final SubLObject token_var_$48 = NIL;
                            while (NIL == done_var_$47) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$48);
                                final SubLObject valid_$49 = makeBoolean(!token_var_$48.eql(assertion));
                                if (NIL != valid_$49) {
                                    final SubLObject value = dgaivgp_arg(assertion, gather_arg);
                                    if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
                                        final SubLObject item_var = value;
                                        if (NIL == member(item_var, v_answer, $mapping_equality_test$.getDynamicValue(thread), symbol_function(IDENTITY))) {
                                            v_answer = cons(item_var, v_answer);
                                        }
                                    } else {
                                        v_answer = cons(value, v_answer);
                                    }
                                }
                                done_var_$47 = makeBoolean(NIL == valid_$49);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != dgaigp_binaryP(pred)) {
            _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            _prev_bind_2 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
                pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                pred_relevance_macros.$pred$.bind(pred, thread);
                final SubLObject pred_var = NIL;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, arity.binary_arg_swap(index_arg), pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, arity.binary_arg_swap(index_arg), pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$48 = NIL;
                                final SubLObject token_var_$49 = NIL;
                                while (NIL == done_var_$48) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$49);
                                    final SubLObject valid_$50 = makeBoolean(!token_var_$49.eql(assertion));
                                    if (NIL != valid_$50) {
                                        final SubLObject _prev_bind_0_$51 = $mapping_arg_swap$.currentBinding(thread);
                                        try {
                                            $mapping_arg_swap$.bind(makeBoolean(NIL == $mapping_arg_swap$.getDynamicValue(thread)), thread);
                                            final SubLObject value2 = dgaivgp_arg(assertion, gather_arg);
                                            if (NIL != $mapping_equality_test$.getDynamicValue(thread)) {
                                                final SubLObject item_var2 = value2;
                                                if (NIL == member(item_var2, v_answer, $mapping_equality_test$.getDynamicValue(thread), symbol_function(IDENTITY))) {
                                                    v_answer = cons(item_var2, v_answer);
                                                }
                                            } else {
                                                v_answer = cons(value2, v_answer);
                                            }
                                        } finally {
                                            $mapping_arg_swap$.rebind(_prev_bind_0_$51, thread);
                                        }
                                    }
                                    done_var_$48 = makeBoolean(NIL == valid_$50);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_2, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
        }
        return v_answer;
    }

    public static SubLObject gp_pred_values_in_mt(final SubLObject v_term, final SubLObject pred, final SubLObject mt, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            ans = gp_pred_values(v_term, pred, index_arg, gather_arg);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject gp_pred_values_in_mts(final SubLObject v_term, final SubLObject pred, final SubLObject mts, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(mts) : "Types.listp(mts) " + "CommonSymbols.NIL != Types.listp(mts) " + mts;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            ans = gp_pred_values(v_term, pred, index_arg, gather_arg);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject gp_pred_values_in_any_mt(final SubLObject v_term, final SubLObject pred, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = gp_pred_values(v_term, pred, index_arg, gather_arg);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject gp_pred_values_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject gather_arg) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = TWO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            ans = gp_pred_values(v_term, pred, index_arg, gather_arg);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject do_all_spec_predicates2(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(var, list(ALL_SPEC_PREDS, pred)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    public static SubLObject do_all_spec_inverses2(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, list(var, list(ALL_SPEC_INVERSES, pred)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    public static SubLObject some_spec_pred_value_in_relevant_mts(final SubLObject v_term, final SubLObject pred, SubLObject mt, SubLObject index_arg, SubLObject truth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (index_arg == UNPROVIDED) {
            index_arg = ONE_INTEGER;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        SubLObject cdolist_list_var = genl_predicates.all_spec_preds(pred, UNPROVIDED, UNPROVIDED);
        SubLObject spec_pred = NIL;
        spec_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, spec_pred, mt, index_arg, truth)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject do_spec_pred_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$56 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list39);
            current_$56 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list39);
            if (NIL == member(current_$56, $list40, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$56 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list39);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject spec_pred = $sym41$SPEC_PRED;
        return list(PROGN, list(DO_ALL_SPEC_PREDICATES2, list(spec_pred, pred), listS(DO_PREDICATE_EXTENT_INDEX, list(var, spec_pred, $TRUTH, truth, $DONE, done), append(body, NIL))), list(PWHEN, list($sym44$BINARY_, pred), list(CLET, $list15, list(DO_ALL_SPEC_INVERSES2, list(spec_pred, pred), listS(DO_PREDICATE_EXTENT_INDEX, list(var, spec_pred, $TRUTH, truth, $DONE, done), append(body, NIL))))));
    }

    public static SubLObject do_spec_pred_index_in_any_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        done = current.first();
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list46);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject spec_pred = $sym47$SPEC_PRED;
            return list(WITH_ALL_MTS, list(DO_ALL_SPEC_PREDICATES2, list(spec_pred, pred), listS(DO_PREDICATE_EXTENT_INDEX, list(var, spec_pred, $TRUTH, truth, $DONE, done), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list46);
        return NIL;
    }

    public static SubLObject do_arg_index_with_spec_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        done = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list49);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list49);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject spec_pred = $sym50$SPEC_PRED;
            return list(DO_ALL_SPEC_PREDICATES2, list(spec_pred, pred), listS(DO_GAF_ARG_INDEX, list(new SubLObject[]{ var, v_term, $PREDICATE, spec_pred, $INDEX, index, $TRUTH, truth, $DONE, done }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list49);
        return NIL;
    }

    public static SubLObject do_arg_index_in_any_mt_with_spec_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject v_term = NIL;
        SubLObject pred = NIL;
        SubLObject done = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        done = current.first();
        current = current.rest();
        final SubLObject index = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list49);
        current = current.rest();
        final SubLObject truth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list49);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_ALL_MTS, listS(DO_ARG_INDEX_WITH_SPEC_PREDS, list(var, v_term, pred, done, index, truth), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list49);
        return NIL;
    }

    public static SubLObject num_spec_pred_index(final SubLObject pred, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var = genl_predicates.all_spec_preds(pred, UNPROVIDED, UNPROVIDED);
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, kb_indexing.num_predicate_extent_index(spec_pred, UNPROVIDED));
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject declare_kb_gp_mapping_file() {
        declareMacro(me, "do_gaf_arg_index_gp", "DO-GAF-ARG-INDEX-GP");
        declareFunction(me, "dgaigp_binaryP", "DGAIGP-BINARY?", 1, 0, false);
        declareMacro(me, "do_gaf_arg_index_values_gp", "DO-GAF-ARG-INDEX-VALUES-GP");
        declareFunction(me, "dgaivgp_arg", "DGAIVGP-ARG", 2, 0, false);
        declareFunction(me, "gp_map_arg_index", "GP-MAP-ARG-INDEX", 4, 0, false);
        declareFunction(me, "gp_gather_gaf_arg_index", "GP-GATHER-GAF-ARG-INDEX", 3, 1, false);
        declareFunction(me, "gp_fpred_value", "GP-FPRED-VALUE", 2, 2, false);
        declareFunction(me, "gp_fpred_value_in_mt", "GP-FPRED-VALUE-IN-MT", 3, 2, false);
        declareFunction(me, "gp_fpred_value_in_mts", "GP-FPRED-VALUE-IN-MTS", 3, 2, false);
        declareFunction(me, "gp_fpred_value_in_any_mt", "GP-FPRED-VALUE-IN-ANY-MT", 2, 2, false);
        declareFunction(me, "gp_fpred_value_in_relevant_mts", "GP-FPRED-VALUE-IN-RELEVANT-MTS", 2, 3, false);
        declareFunction(me, "gp_pred_values", "GP-PRED-VALUES", 2, 2, false);
        declareFunction(me, "gp_pred_values_in_mt", "GP-PRED-VALUES-IN-MT", 3, 2, false);
        declareFunction(me, "gp_pred_values_in_mts", "GP-PRED-VALUES-IN-MTS", 3, 2, false);
        declareFunction(me, "gp_pred_values_in_any_mt", "GP-PRED-VALUES-IN-ANY-MT", 2, 2, false);
        declareFunction(me, "gp_pred_values_in_relevant_mts", "GP-PRED-VALUES-IN-RELEVANT-MTS", 2, 3, false);
        declareMacro(me, "do_all_spec_predicates2", "DO-ALL-SPEC-PREDICATES2");
        declareMacro(me, "do_all_spec_inverses2", "DO-ALL-SPEC-INVERSES2");
        declareFunction(me, "some_spec_pred_value_in_relevant_mts", "SOME-SPEC-PRED-VALUE-IN-RELEVANT-MTS", 2, 3, false);
        declareMacro(me, "do_spec_pred_index", "DO-SPEC-PRED-INDEX");
        declareMacro(me, "do_spec_pred_index_in_any_mt", "DO-SPEC-PRED-INDEX-IN-ANY-MT");
        declareMacro(me, "do_arg_index_with_spec_preds", "DO-ARG-INDEX-WITH-SPEC-PREDS");
        declareMacro(me, "do_arg_index_in_any_mt_with_spec_preds", "DO-ARG-INDEX-IN-ANY-MT-WITH-SPEC-PREDS");
        declareFunction(me, "num_spec_pred_index", "NUM-SPEC-PRED-INDEX", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_kb_gp_mapping_file() {
        defparameter("*MAPPING-ARG-SWAP*", NIL);
        return NIL;
    }

    public static SubLObject setup_kb_gp_mapping_file() {
        register_macro_helper($sym11$DGAIGP_BINARY_, DO_GAF_ARG_INDEX_GP);
        register_macro_helper(DGAIVGP_ARG, DO_GAF_ARG_INDEX_VALUES_GP);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_gp_mapping_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_gp_mapping_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_gp_mapping_file();
    }

    static {























































    }
}

/**
 * Total time: 806 ms
 */
