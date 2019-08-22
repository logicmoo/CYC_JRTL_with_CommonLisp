/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.el_utilities.add_sequence_var_to_end;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_tracing_p;
import static com.cyc.cycjava.cycl.el_utilities.el_var_listP;
import static com.cyc.cycjava.cycl.el_utilities.el_warn;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.formula_non_var_symbols;
import static com.cyc.cycjava.cycl.el_utilities.genls_litP;
import static com.cyc.cycjava.cycl.el_utilities.isa_litP;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.el_utilities.tou_litP;
import static com.cyc.cycjava.cycl.el_utilities.tou_lits;
import static com.cyc.cycjava.cycl.el_utilities.valid_argnum_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sixth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKOLEMS
 * source file: /cyc/top/cycl/skolems.lisp
 * created:     2019/07/03 17:37:32
 */
public final class skolems extends SubLTranslatedFile implements V12 {
    public static final SubLObject skolems_vars_ordered() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = defn;
                                                    SubLObject current = datum;
                                                    SubLObject constant = NIL;
                                                    SubLObject data = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt89);
                                                    constant = current.first();
                                                    current = current.rest();
                                                    data = current;
                                                    if (NIL != forts.fort_p(constant)) {
                                                        {
                                                            SubLObject vars = com.cyc.cycjava.cycl.skolems.skolem_defn_vars(constant);
                                                            if ((NIL != vars) && vars.equal(clausifier.sort_vars(vars))) {
                                                                result = cons(constant, result);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject skolems_vars_misordered() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = defn;
                                                    SubLObject current = datum;
                                                    SubLObject constant = NIL;
                                                    SubLObject data = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt89);
                                                    constant = current.first();
                                                    current = current.rest();
                                                    data = current;
                                                    if (NIL != forts.fort_p(constant)) {
                                                        {
                                                            SubLObject vars = com.cyc.cycjava.cycl.skolems.skolem_defn_vars(constant);
                                                            if (!vars.equal(clausifier.sort_vars(vars))) {
                                                                result = cons(constant, result);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject skolems_defn_not_wff_via(SubLObject malady) {
        if (malady == UNPROVIDED) {
            malady = $SKOLEM_DEFN_OBSOLETE_NUMBER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject table_var = czer_vars.$skolem_axiom_table$.getGlobalValue();
                $progress_note$.setDynamicValue($str_alt86$mapping__skolem_axiom_table_, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                if (NIL == com.cyc.cycjava.cycl.skolems.skolem_defn_wffP(defn)) {
                                                    if (NIL != assoc(malady, com.cyc.cycjava.cycl.skolems.why_skolem_defn_not_wff(defn), UNPROVIDED, UNPROVIDED)) {
                                                        result = cons(com.cyc.cycjava.cycl.skolems.skolem_of_defn(defn), result);
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject skolem_defns_not_wff_via(SubLObject malady) {
        if (malady == UNPROVIDED) {
            malady = $SKOLEM_DEFN_OBSOLETE_NUMBER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject table_var = czer_vars.$skolem_axiom_table$.getGlobalValue();
                $progress_note$.setDynamicValue($str_alt86$mapping__skolem_axiom_table_, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                if (NIL == com.cyc.cycjava.cycl.skolems.skolem_defn_wffP(defn)) {
                                                    if (NIL != assoc(malady, com.cyc.cycjava.cycl.skolems.why_skolem_defn_not_wff(defn), UNPROVIDED, UNPROVIDED)) {
                                                    }
                                                    result = cons(defn, result);
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject skolem_defns_not_wff() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject table_var = czer_vars.$skolem_axiom_table$.getGlobalValue();
                $progress_note$.setDynamicValue($str_alt86$mapping__skolem_axiom_table_, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                if (NIL == com.cyc.cycjava.cycl.skolems.skolem_defn_wffP(defn)) {
                                                    result = cons(defn, result);
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject skolem_defn_vars(SubLObject skolem) {
        {
            SubLObject unreified_skolem_term = com.cyc.cycjava.cycl.skolems.unreified_sk_term(skolem);
            if (NIL != com.cyc.cycjava.cycl.skolems.skolem_number(unreified_skolem_term)) {
                return butlast(com.cyc.cycjava.cycl.skolems.skolem_defn_args(skolem), UNPROVIDED);
            } else {
                return com.cyc.cycjava.cycl.skolems.skolem_defn_args(skolem);
            }
        }
    }

    public static final SubLObject skolem_defn_maladies() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject table_var = czer_vars.$skolem_axiom_table$.getGlobalValue();
                $progress_note$.setDynamicValue($str_alt86$mapping__skolem_axiom_table_, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject cdolist_list_var_13 = com.cyc.cycjava.cycl.skolems.why_skolem_defn_not_wff(defn);
                                                    SubLObject malady = NIL;
                                                    for (malady = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , malady = cdolist_list_var_13.first()) {
                                                        {
                                                            SubLObject mal_type = malady.first();
                                                            SubLObject mal_type_rec = assoc(mal_type, result, UNPROVIDED, UNPROVIDED);
                                                            if (NIL != mal_type_rec) {
                                                                rplacd(mal_type_rec, add(mal_type_rec.rest(), ONE_INTEGER));
                                                            } else {
                                                                result = cons(cons(mal_type, ONE_INTEGER), result);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return Sort.sort(result, symbol_function($sym87$_), symbol_function(CDR));
            }
        }
    }

    public static final SubLObject oldest_newest_forts(SubLObject v_forts) {
        {
            SubLObject oldest = NIL;
            SubLObject newest = NIL;
            SubLObject old = NIL;
            SubLObject v_new = NIL;
            SubLObject cdolist_list_var = v_forts;
            SubLObject fort = NIL;
            for (fort = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fort = cdolist_list_var.first()) {
                {
                    SubLObject time = bookkeeping_store.creation_time(fort, UNPROVIDED);
                    if (time.isInteger()) {
                        if ((NIL == oldest) || oldest.numG(time)) {
                            oldest = time;
                            old = fort;
                        }
                        if ((NIL == newest) || newest.numL(time)) {
                            newest = time;
                            v_new = fort;
                        }
                    }
                }
            }
            return list(oldest, old, newest, v_new);
        }
    }

    // Internal Constant Initializer Methods
    @LispMethod(comment = "Internal Constant Initializer Methods")
    private static final SubLObject _constant_109_initializer() {
        return list(new SubLObject[]{ reader_make_constant_shell("SKF-16971619"), reader_make_constant_shell("SKF-9662286"), reader_make_constant_shell("SKF-45878693"), reader_make_constant_shell("SKF-27834981"), reader_make_constant_shell("SKF-12369461"), reader_make_constant_shell("SKF-10688698"), reader_make_constant_shell("SKF-45547787"), reader_make_constant_shell("SKF-31789746"), reader_make_constant_shell("SKF-26692934"), reader_make_constant_shell("SKF-48466118"), reader_make_constant_shell("SKF-60531811"), reader_make_constant_shell("SKF-29624762"), reader_make_constant_shell("SKF-22643466"), reader_make_constant_shell("SKF-29472649"), reader_make_constant_shell("SKF-6535610808"), reader_make_constant_shell("SKF-6391880459"), reader_make_constant_shell("SKF-6069753105"), reader_make_constant_shell("SKF-1836062444"), reader_make_constant_shell("SKF-1140288587"), reader_make_constant_shell("SKF-0975510193"), reader_make_constant_shell("SKF-0417114039"), reader_make_constant_shell("SKF-2399775374"), reader_make_constant_shell("SKF-9741300383"), reader_make_constant_shell("SKF-0828551493"), reader_make_constant_shell("SKF-2588418129"), reader_make_constant_shell("SKF-1857929740"), reader_make_constant_shell("SKF-9771221235"), reader_make_constant_shell("SKF-5248881133"), reader_make_constant_shell("SKF-30037247"), reader_make_constant_shell("SKF-60060919"), reader_make_constant_shell("SKF-10786079"), reader_make_constant_shell("SKF-14077376"), reader_make_constant_shell("SKF-55914574"), reader_make_constant_shell("SKF-16648407"), reader_make_constant_shell("SKF-44601733"), reader_make_constant_shell("SKF-7913899905"), reader_make_constant_shell("SKF-4396958760"), reader_make_constant_shell("SKF-8020199718"), reader_make_constant_shell("SKF-20333"), reader_make_constant_shell("SKF-3701677947"), reader_make_constant_shell("SKF-2758282998"), reader_make_constant_shell("SKF-32592026"), reader_make_constant_shell("SKF-15476867"), reader_make_constant_shell("SKF-11623545"), reader_make_constant_shell("SKF-39071040"), reader_make_constant_shell("SKF-22133371"), reader_make_constant_shell("SKF-49114437"), reader_make_constant_shell("SKF-6397777"), reader_make_constant_shell("SKF-27545347"), reader_make_constant_shell("SKF-44682034"), reader_make_constant_shell("SKF-55141454"), reader_make_constant_shell("SKF-29896988"), reader_make_constant_shell("SKF-42443574"), reader_make_constant_shell("SKF-13447977"), reader_make_constant_shell("SKF-30519480"), reader_make_constant_shell("SKF-62227276"), reader_make_constant_shell("SKF-17408839"), reader_make_constant_shell("SKF-58430677"), reader_make_constant_shell("SKF-59662976"), reader_make_constant_shell("SKF-12620975"), reader_make_constant_shell("SKF-9433064"), reader_make_constant_shell("SKF-9205245"), reader_make_constant_shell("SKF-DepictedGroupMember"), reader_make_constant_shell("SKF-19625320"), reader_make_constant_shell("SKF-3784346661"), reader_make_constant_shell("SKF-6544284149"), reader_make_constant_shell("SKF-0614825063"), reader_make_constant_shell("SKF-0016213450"), reader_make_constant_shell("SKF-22649603"), reader_make_constant_shell("SKF-4118636"), reader_make_constant_shell("SKF-19878232"), reader_make_constant_shell("SKF-15013378"), reader_make_constant_shell("SKF-65815517"), reader_make_constant_shell("SKF-56452378"), reader_make_constant_shell("SKF-49139121"), reader_make_constant_shell("SKF-12749049"), reader_make_constant_shell("SKF-2910558946"), reader_make_constant_shell("SKF-2910558946"), reader_make_constant_shell("SKF-8609688279"), reader_make_constant_shell("SKF-3254220233"), reader_make_constant_shell("SKF-4116454483"), reader_make_constant_shell("SKF-9882206036"), reader_make_constant_shell("SKF-7876960574"), reader_make_constant_shell("SKF-7849157406"), reader_make_constant_shell("SKF-0013694801"), reader_make_constant_shell("SKF-3786700124"), reader_make_constant_shell("SKF-1714230847"), reader_make_constant_shell("SKF-7566265665"), reader_make_constant_shell("SKF-8055872557"), reader_make_constant_shell("SKF-6624619390"), reader_make_constant_shell("SKF-4749393956"), reader_make_constant_shell("SKF-9902000475"), reader_make_constant_shell("SKF-2176445673"), reader_make_constant_shell("SKF-9582976901"), reader_make_constant_shell("SKF-62641426"), reader_make_constant_shell("SKF-37581079"), reader_make_constant_shell("SKF-9780389"), reader_make_constant_shell("SKF-51938893"), reader_make_constant_shell("SKF-33012437"), reader_make_constant_shell("SKF-9412760"), reader_make_constant_shell("SKF-22314298"), reader_make_constant_shell("SKF-52903378"), reader_make_constant_shell("SKF-59517423"), reader_make_constant_shell("SKF-24705784"), reader_make_constant_shell("SKF-22566254"), reader_make_constant_shell("SKF-35236481"), reader_make_constant_shell("SKF-26725746"), reader_make_constant_shell("SKF-55356852"), reader_make_constant_shell("SKF-3634339"), reader_make_constant_shell("SKF-65815517"), reader_make_constant_shell("SKF-56452378"), reader_make_constant_shell("SKF-49139121"), reader_make_constant_shell("SKF-12749049"), reader_make_constant_shell("SKF-4408119749"), reader_make_constant_shell("SKF-3789312666"), reader_make_constant_shell("SKF-0283155048"), reader_make_constant_shell("SKF-9294061441"), reader_make_constant_shell("SKF-4876245588"), reader_make_constant_shell("SKF-2809645919"), reader_make_constant_shell("SKF-1124554131"), reader_make_constant_shell("SKF-0220610914"), reader_make_constant_shell("SKF-4790221775"), reader_make_constant_shell("SKF-1168015263"), reader_make_constant_shell("SKF-4318796173"), reader_make_constant_shell("SKF-1828131226"), reader_make_constant_shell("SKF-2199671088"), reader_make_constant_shell("SKF-9895165404"), reader_make_constant_shell("SKF-6604522774"), reader_make_constant_shell("SKF-6086634185"), reader_make_constant_shell("SKF-0428133650"), reader_make_constant_shell("SKF-7899934995"), reader_make_constant_shell("SKF-0860923384"), reader_make_constant_shell("SKF-4146570201"), reader_make_constant_shell("SKF-0406242321"), reader_make_constant_shell("SKF-4468030352"), reader_make_constant_shell("SKF-8519691249"), reader_make_constant_shell("SKF-6471415053"), reader_make_constant_shell("SKF-6816884555"), reader_make_constant_shell("SKF-2207590761"), reader_make_constant_shell("SKF-4785728462"), reader_make_constant_shell("SKF-6959780810"), reader_make_constant_shell("SKF-2698165023"), reader_make_constant_shell("SKF-1592332182"), reader_make_constant_shell("SKF-9127604959"), reader_make_constant_shell("SKF-3352641286"), reader_make_constant_shell("SKF-9726105841"), reader_make_constant_shell("SKF-0624682876"), reader_make_constant_shell("SKF-9673514545"), reader_make_constant_shell("SKF-1902545429"), reader_make_constant_shell("SKF-6876074534"), reader_make_constant_shell("SKF-8288491486"), reader_make_constant_shell("SKF-4637358284"), reader_make_constant_shell("SKF-0635199939"), reader_make_constant_shell("SKF-4292973565"), reader_make_constant_shell("SKF-7798353664"), reader_make_constant_shell("SKF-34523039"), reader_make_constant_shell("SKF-33538847"), reader_make_constant_shell("SKF-58036047"), reader_make_constant_shell("SKF-9708075"), reader_make_constant_shell("SKF-13094314"), reader_make_constant_shell("SKF-27004431"), reader_make_constant_shell("SKF-47290403"), reader_make_constant_shell("SKF-49713991"), reader_make_constant_shell("SKF-40178904"), reader_make_constant_shell("SKF-62659908"), reader_make_constant_shell("SKF-61484227"), reader_make_constant_shell("SKF-35458681"), reader_make_constant_shell("SKF-17599345"), reader_make_constant_shell("SKF-53668837"), reader_make_constant_shell("SKF-24102297"), reader_make_constant_shell("SKF-32709431"), reader_make_constant_shell("SKF-51752162"), reader_make_constant_shell("SKF-35359227"), reader_make_constant_shell("SKF-20847759"), reader_make_constant_shell("SKF-51781280"), reader_make_constant_shell("SKF-51473172"), reader_make_constant_shell("SKF-36777684"), reader_make_constant_shell("SKF-27183984"), reader_make_constant_shell("SKF-24538299"), reader_make_constant_shell("SKF-51270566"), reader_make_constant_shell("SKF-6498804"), reader_make_constant_shell("SKF-52375281"), reader_make_constant_shell("SKF-59156909"), reader_make_constant_shell("SKF-59507392"), reader_make_constant_shell("SKF-21555986"), reader_make_constant_shell("SKF-0925186357"), reader_make_constant_shell("SKF-6223276020"), reader_make_constant_shell("SKF-5400448981"), reader_make_constant_shell("SKF-0033649819"), reader_make_constant_shell("SKF-8779626658"), reader_make_constant_shell("SKF-2650598318"), reader_make_constant_shell("SKF-1317366451"), reader_make_constant_shell("SKF-5713244721"), reader_make_constant_shell("SKF-5494021688"), reader_make_constant_shell("SKF-50021281"), reader_make_constant_shell("SKF-52700384"), reader_make_constant_shell("SKF-27017330"), reader_make_constant_shell("SKF-6926447"), reader_make_constant_shell("SKF-57742011"), reader_make_constant_shell("SKF-32797409"), reader_make_constant_shell("SKF-36775099"), reader_make_constant_shell("SKF-8803460"), reader_make_constant_shell("SKF-11685259"), reader_make_constant_shell("SKF-49596986"), reader_make_constant_shell("SKF-1515868"), reader_make_constant_shell("SKF-12425256"), reader_make_constant_shell("SKF-26526786"), reader_make_constant_shell("SKF-757265"), reader_make_constant_shell("SKF-66361621"), reader_make_constant_shell("SKF-50135687"), reader_make_constant_shell("SKF-28256974"), reader_make_constant_shell("SKF-52059331"), reader_make_constant_shell("SKF-60879947"), reader_make_constant_shell("SKF-10095100"), reader_make_constant_shell("SKF-20576203"), reader_make_constant_shell("SKF-49828332"), reader_make_constant_shell("SKF-44916076"), reader_make_constant_shell("SKF-63714570"), reader_make_constant_shell("SKF-3886762"), reader_make_constant_shell("SKF-14991605"), reader_make_constant_shell("SKF-35022890"), reader_make_constant_shell("SKF-9692584"), reader_make_constant_shell("SKF-56789029"), reader_make_constant_shell("SKF-63331999"), reader_make_constant_shell("SKF-60839916"), reader_make_constant_shell("SKF-11805601"), reader_make_constant_shell("MarriedCoupleFn"), reader_make_constant_shell("SKF-54717125"), reader_make_constant_shell("SKF-47103024"), reader_make_constant_shell("SKF-32504795"), reader_make_constant_shell("SKF-50991035"), reader_make_constant_shell("SKF-54893967"), reader_make_constant_shell("SKF-4588740"), reader_make_constant_shell("SKF-34044423"), reader_make_constant_shell("SKF-23158350"), reader_make_constant_shell("SKF-26216492"), reader_make_constant_shell("SKF-23792367"), reader_make_constant_shell("SKF-26655735"), reader_make_constant_shell("SKF-36384184"), reader_make_constant_shell("SKF-28223401"), reader_make_constant_shell("SKF-30705866"), reader_make_constant_shell("SKF-31089449"), reader_make_constant_shell("SKF-43795517"), reader_make_constant_shell("SKF-54692934"), reader_make_constant_shell("SKF-62874373"), reader_make_constant_shell("SKF-13198899"), reader_make_constant_shell("SKF-6598020"), reader_make_constant_shell("SKF-66712623"), reader_make_constant_shell("SKF-61590093"), reader_make_constant_shell("SKF-4298210"), reader_make_constant_shell("SKF-13358052"), reader_make_constant_shell("SKF-1077450"), reader_make_constant_shell("SKF-27216176"), reader_make_constant_shell("SKF-28083191"), reader_make_constant_shell("SKF-539243"), reader_make_constant_shell("SKF-14104209"), reader_make_constant_shell("SKF-6066610"), reader_make_constant_shell("SKF-14779626"), reader_make_constant_shell("SKF-1007216"), reader_make_constant_shell("SKF-49463821"), reader_make_constant_shell("SKF-764714"), reader_make_constant_shell("SKF-59277817"), reader_make_constant_shell("SKF-24473185"), reader_make_constant_shell("SKF-22799176"), reader_make_constant_shell("SKF-13378825"), reader_make_constant_shell("SKF-8692086"), reader_make_constant_shell("SKF-59150515"), reader_make_constant_shell("SKF-6649426"), reader_make_constant_shell("SKF-18423567"), reader_make_constant_shell("SKF-61014428"), reader_make_constant_shell("SKF-612301"), reader_make_constant_shell("SKF-390407"), reader_make_constant_shell("SKF-469762"), reader_make_constant_shell("SKF-57350382"), reader_make_constant_shell("SKF-550621"), reader_make_constant_shell("SKF-41449368"), reader_make_constant_shell("SKF-20918103"), reader_make_constant_shell("SKF-447007"), reader_make_constant_shell("SKF-1383963"), reader_make_constant_shell("SKF-348190"), reader_make_constant_shell("SKF-693803"), reader_make_constant_shell("SKF-133452"), reader_make_constant_shell("SKF-2813385"), reader_make_constant_shell("SKF-31097107"), reader_make_constant_shell("SKF-57888"), reader_make_constant_shell("SKF-10895131"), reader_make_constant_shell("SKF-13225721"), reader_make_constant_shell("SKF-43450038"), reader_make_constant_shell("SKF-21119958"), reader_make_constant_shell("SKF-47744038"), reader_make_constant_shell("SKF-466900"), reader_make_constant_shell("SKF-46555292"), reader_make_constant_shell("SKF-23253528"), reader_make_constant_shell("SKF-924570"), reader_make_constant_shell("SKF-BandMemPlaying"), reader_make_constant_shell("SKF-48376054"), reader_make_constant_shell("SKF-121716"), reader_make_constant_shell("SKF-7364934"), reader_make_constant_shell("SKF-14760742"), reader_make_constant_shell("SKF-17172575"), reader_make_constant_shell("SKF-23584353"), reader_make_constant_shell("SKF-53200158"), reader_make_constant_shell("SKF-48653451"), reader_make_constant_shell("SKF-55897365"), reader_make_constant_shell("SKF-52891476"), reader_make_constant_shell("SKF-33105457"), reader_make_constant_shell("SKF-10518089"), reader_make_constant_shell("SKF-33158362"), reader_make_constant_shell("SKF-66304485"), reader_make_constant_shell("SKF-810295"), reader_make_constant_shell("SKF-968219"), reader_make_constant_shell("SKF-9855449"), reader_make_constant_shell("SKF-51029398"), reader_make_constant_shell("SKF-9874778"), reader_make_constant_shell("SKF-14008069"), reader_make_constant_shell("SKF-197207"), reader_make_constant_shell("SKF-9176578"), reader_make_constant_shell("SKF-62825"), reader_make_constant_shell("SKF-476059"), reader_make_constant_shell("SKF-366078"), reader_make_constant_shell("SKF-17345463"), reader_make_constant_shell("SKF-51339287"), reader_make_constant_shell("SKF-1046930"), reader_make_constant_shell("SKF-828757"), reader_make_constant_shell("SKF-51633710"), reader_make_constant_shell("SKF-19769806"), reader_make_constant_shell("SKF-46906520"), reader_make_constant_shell("SKF-20309046"), reader_make_constant_shell("SKF-7477821"), reader_make_constant_shell("SKF-21294579"), reader_make_constant_shell("SKF-17746"), reader_make_constant_shell("SKF-42407080"), reader_make_constant_shell("SKF-32539269"), reader_make_constant_shell("SKF-17651656"), reader_make_constant_shell("SKF-49636199"), reader_make_constant_shell("SKF-63665039"), reader_make_constant_shell("SKF-923916"), reader_make_constant_shell("SKF-41511095"), reader_make_constant_shell("SKF-402998"), reader_make_constant_shell("SKF-1827166"), reader_make_constant_shell("SKF-25558723"), reader_make_constant_shell("SKF-92235"), reader_make_constant_shell("SKF-24405989"), reader_make_constant_shell("SKF-37741853"), reader_make_constant_shell("SKF-681210"), reader_make_constant_shell("SKF-16612795"), reader_make_constant_shell("SKF-55392675"), reader_make_constant_shell("SKF-41395088"), reader_make_constant_shell("SKF-427687"), reader_make_constant_shell("SKF-46187940"), reader_make_constant_shell("SKF-18860364"), reader_make_constant_shell("SKF-846216"), reader_make_constant_shell("SKF-5393361"), reader_make_constant_shell("SKF-12316220"), reader_make_constant_shell("SKF-54217404"), reader_make_constant_shell("SKF-5169399"), reader_make_constant_shell("SKF-920133"), reader_make_constant_shell("SKF-3247485"), reader_make_constant_shell("SKF-2269494"), reader_make_constant_shell("SKF-13038949"), reader_make_constant_shell("SKF-28759634"), reader_make_constant_shell("SKF-17122972"), reader_make_constant_shell("SKF-953550"), reader_make_constant_shell("SKF-906137"), reader_make_constant_shell("SKF-14962533"), reader_make_constant_shell("SKF-8254998"), reader_make_constant_shell("SKF-46599863"), reader_make_constant_shell("SKF-36778441"), reader_make_constant_shell("SKF-45777401"), reader_make_constant_shell("SKF-45356858"), reader_make_constant_shell("SKF-28542904"), reader_make_constant_shell("SKF-33462840"), reader_make_constant_shell("SKF-18834377"), reader_make_constant_shell("SKF-23165858"), reader_make_constant_shell("SKF-171447"), reader_make_constant_shell("SKF-38743072"), reader_make_constant_shell("SKF-62752838"), reader_make_constant_shell("SKF-46799967"), reader_make_constant_shell("SKF-38741805"), reader_make_constant_shell("SKF-22034341"), reader_make_constant_shell("SKF-49949893"), reader_make_constant_shell("SKF-750835"), reader_make_constant_shell("SKF-27330810"), reader_make_constant_shell("SKF-61593935"), reader_make_constant_shell("SKF-29534329"), reader_make_constant_shell("SKF-8780298"), reader_make_constant_shell("SKF-10230735"), reader_make_constant_shell("SKF-28051850"), reader_make_constant_shell("SKF-15346572"), reader_make_constant_shell("SKF-38351646"), reader_make_constant_shell("SKF-54477051"), reader_make_constant_shell("SKF-58577410"), reader_make_constant_shell("SKF-41179398"), reader_make_constant_shell("SKF-9098087"), reader_make_constant_shell("SKF-464896"), reader_make_constant_shell("SKF-13765056"), reader_make_constant_shell("SKF-54796118"), reader_make_constant_shell("SKF-892012"), reader_make_constant_shell("SKF-5733810632"), reader_make_constant_shell("SKF-9732365118"), reader_make_constant_shell("SKF-8062776921"), reader_make_constant_shell("SKF-9356282252"), reader_make_constant_shell("SKF-7770326773"), reader_make_constant_shell("SKF-9303451156"), reader_make_constant_shell("SKF-7682359700"), reader_make_constant_shell("SKF-0472592080"), reader_make_constant_shell("SKF-5868767078"), reader_make_constant_shell("SKF-6969827182"), reader_make_constant_shell("SKF-8235654414"), reader_make_constant_shell("SKF-9268693067"), reader_make_constant_shell("SKF-4188164665"), reader_make_constant_shell("SKF-3268848892"), reader_make_constant_shell("SKF-3954038304"), reader_make_constant_shell("SKF-8411301306"), reader_make_constant_shell("SKF-6870027660"), reader_make_constant_shell("SKF-2200319382"), reader_make_constant_shell("SKF-8663443543"), reader_make_constant_shell("SKF-6270260084"), reader_make_constant_shell("SKF-7428624994"), reader_make_constant_shell("SKF-6367907452"), reader_make_constant_shell("SKF-7752915649"), reader_make_constant_shell("SKF-4786775108"), reader_make_constant_shell("SKF-5640043419"), reader_make_constant_shell("SKF-6071218505"), reader_make_constant_shell("SKF-3183844767"), reader_make_constant_shell("SKF-7356970316"), reader_make_constant_shell("SKF-4272845489"), reader_make_constant_shell("SKF-5224425512"), reader_make_constant_shell("SKF-3795912959"), reader_make_constant_shell("SKF-7714022869"), reader_make_constant_shell("SKF-8565886278"), reader_make_constant_shell("SKF-0519624184"), reader_make_constant_shell("SKF-4286299680"), reader_make_constant_shell("SKF-3516286017"), reader_make_constant_shell("SKF-8782865500"), reader_make_constant_shell("SKF-4515155650"), reader_make_constant_shell("SKF-5391096127"), reader_make_constant_shell("SKF-8826617065"), reader_make_constant_shell("SKF-6950497514"), reader_make_constant_shell("SKF-4751258604"), reader_make_constant_shell("SKF-3616130689"), reader_make_constant_shell("SKF-7131788917"), reader_make_constant_shell("SKF-4848573733"), reader_make_constant_shell("SKF-2401054776"), reader_make_constant_shell("SKF-0985467323") });
    }

    static private final SubLString $str_alt135$ = makeString("");

    public static final SubLFile me = new skolems();

 public static final String myName = "com.cyc.cycjava.cycl.skolems";


    // defparameter
    // variable mapping for current skolem defn
    /**
     * variable mapping for current skolem defn
     */
    @LispMethod(comment = "variable mapping for current skolem defn\ndefparameter")
    private static final SubLSymbol $skolem_arg_sort$ = makeSymbol("*SKOLEM-ARG-SORT*");

    // defparameter
    // Bound while recomputing skolem defns
    /**
     * Bound while recomputing skolem defns
     */
    @LispMethod(comment = "Bound while recomputing skolem defns\ndefparameter")
    private static final SubLSymbol $recompute_skolem_defn_info$ = makeSymbol("*RECOMPUTE-SKOLEM-DEFN-INFO*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $skolems_with_known_issues$ = makeSymbol("*SKOLEMS-WITH-KNOWN-ISSUES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $skolems_safe_to_recanonicalize_at_el$ = makeSymbol("*SKOLEMS-SAFE-TO-RECANONICALIZE-AT-EL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $target_consequent_literal_count$ = makeSymbol("*TARGET-CONSEQUENT-LITERAL-COUNT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $skolems_known_to_be_unfindable_via_el$ = makeSymbol("*SKOLEMS-KNOWN-TO-BE-UNFINDABLE-VIA-EL*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("SKOLEM-TERM"));



    static private final SubLList $list2 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));









    static private final SubLString $str7$unreified_skolem_term_references_ = makeString("unreified-skolem-term references unknown skolem type: ~s");

    static private final SubLSymbol $sym9$_ = makeSymbol("<");

    static private final SubLString $str11$skolem_args____s_vs__s = makeString("skolem-args : ~s vs ~s");

    private static final SubLSymbol CLAUSE_FREE_SEQUENCE_VARIABLES = makeSymbol("CLAUSE-FREE-SEQUENCE-VARIABLES");

    private static final SubLSymbol CLAUSE_FREE_TERM_VARIABLES = makeSymbol("CLAUSE-FREE-TERM-VARIABLES");

    private static final SubLSymbol $TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE = makeKeyword("TOO-MANY-SEQUENCE-VARS-IN-SKOLEM-SCOPE");

    static private final SubLSymbol $sym15$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLSymbol $sym16$UNREIFIED_SKOLEM_TERM_ = makeSymbol("UNREIFIED-SKOLEM-TERM?");

    private static final SubLSymbol SKOLEM_FUNCTION_VAR = makeSymbol("SKOLEM-FUNCTION-VAR");

    static private final SubLList $list18 = list(makeSymbol("OLD-SK-CONSTANT"), makeSymbol("OLD-UNREIFIED-SK-TERM"), makeSymbol("SK-MT"), makeSymbol("OLD-DEFN"));









    static private final SubLSymbol $sym23$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol FORMULA_CONSTANT_STR = makeSymbol("FORMULA-CONSTANT-STR");

    static private final SubLSymbol $sym26$CYC_VAR_EXCEPT_FOR_X_0_ = makeSymbol("CYC-VAR-EXCEPT-FOR-X-0?");

    public static final SubLSymbol $formula_constant_str_caching_state$ = makeSymbol("*FORMULA-CONSTANT-STR-CACHING-STATE*");

    static private final SubLSymbol $sym30$_X_0 = makeSymbol("?X-0");

    static private final SubLList $list32 = list(makeSymbol("SKOLEM-TYPE"), makeSymbol("VARS"), makeSymbol("SK-VAR"), makeSymbol("SEQVAR-OR-NUMBER"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));

    static private final SubLString $str33$Multiple_skolem_sequence_variable = makeString("Multiple skolem sequence variables: ~a ~a ~a");

    static private final SubLString $str34$SkolemFuncN_appears_as_SkolemFunc = makeString("SkolemFuncN appears as SkolemFunction: ~a");

    static private final SubLSymbol $sym35$_X = makeSymbol("?X");

    static private final SubLList $list36 = list(makeSymbol("SK-CONSTANT"), makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("MT"), makeSymbol("CNFS"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");





    private static final SubLSymbol ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");

    private static final SubLSymbol SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");

    static private final SubLSymbol $sym46$OPAQUE_ARG_WRT_EL_TEMPLATE_ = makeSymbol("OPAQUE-ARG-WRT-EL-TEMPLATE?");

    static private final SubLString $str47$_in_gaf_has_corresponding_cnf_in_ = makeString("[in gaf-has-corresponding-cnf-in-skolem-defn?] skolem ~s is not a skolem constant");



    private static final SubLSymbol $sym49$REIFIED_SKOLEM_FN_ = makeSymbol("REIFIED-SKOLEM-FN?");

    private static final SubLSymbol SENTENCE_ARG0 = makeSymbol("SENTENCE-ARG0");

    private static final SubLSymbol DEDUCTION_ASSERTION = makeSymbol("DEDUCTION-ASSERTION");

    private static final SubLSymbol $sym53$REIFIED_SKOLEM_FN_IN_ANY_MT_ = makeSymbol("REIFIED-SKOLEM-FN-IN-ANY-MT?");

    private static final SubLString $str54$recomputing_skolem_defn_info_cons = makeString("recomputing-skolem-defn-info-constant called when not recomputing a skolem defn");

    private static final SubLString $str55$recomputing_skolem_defn_info_var_ = makeString("recomputing-skolem-defn-info-var called when not recomputing a skolem defn");

    private static final SubLString $str56$really_recomputing_skolem_defn__c = makeString("really-recomputing-skolem-defn? called when not recomputing a skolem defn");

    private static final SubLString $str57$recomputing_skolem_defn_info_defn = makeString("recomputing-skolem-defn-info-defn called when not recomputing a skolem defn");

    private static final SubLString $str58$recomputing_skolem_defn_info_key_ = makeString("recomputing-skolem-defn-info-key called when not recomputing a skolem defn");

    private static final SubLString $str59$recomputing_skolem_defn_info_blis = makeString("recomputing-skolem-defn-info-blist called when not recomputing a skolem defn");

    private static final SubLString $str60$set_recomputing_skolem_defn_resul = makeString("set-recomputing-skolem-defn-result called when not recomputing a skolem defn");

    private static final SubLString $str61$set_recomputing_skolem_defn_blist = makeString("set-recomputing-skolem-defn-blist called when not recomputing a skolem defn");

    private static final SubLString $str63$note_skolem_binding_called_when_n = makeString("note-skolem-binding called when not recomputing a skolem defn");

    private static final SubLString $str64$Total_KB_Skolems___a = makeString("Total KB Skolems: ~a");

    private static final SubLString $$$building_skolem_defn_table = makeString("building skolem defn table");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $append_stack_traces_to_error_messagesP$ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list68 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);

    private static final SubLString $str71$_A = makeString("~A");

    private static final SubLString $str72$____reified_skolem__a_not_known_t = makeString("~%~%reified skolem ~a not known to be an instance of #$SkolemFunction");

    private static final SubLString $str73$No_skolem_defn_assertions_for___S = makeString("No skolem defn assertions for: ~S");







    private static final SubLSymbol $UNNAMED_SKOLEM_FN = makeKeyword("UNNAMED-SKOLEM-FN");

    private static final SubLString $str78$__disjoint_result_types___s____s = makeString("~%disjoint result types: ~s : ~s");

    private static final SubLString $str79$__explicit_result_types___s____s = makeString("~%explicit result types: ~s : ~s");

    private static final SubLString $str80$__tacit_result_isa___s____s = makeString("~%tacit result isa: ~s : ~s");

    private static final SubLString $str81$__no_result_types___s = makeString("~%no result types: ~s");

    private static final SubLString $str82$__tacit_result_genl___s____s = makeString("~%tacit result genl: ~s : ~s");



    static private final SubLList $list84 = list(reader_make_constant_shell("NonNegativeScalarInterval"));

    private static final SubLString $$$mapping_skolem_defn_table = makeString("mapping skolem defn table");

    private static final SubLList $list86 = list(makeSymbol("SKOLEM"), makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("MT"), makeSymbol("CNFS"));

    private static final SubLString $str87$__tacit_arg__s_type___s____s = makeString("~%tacit arg ~s type: ~s : ~s");

    private static final SubLString $str88$__no_arg__s_type___s____s = makeString("~%no arg ~s type: ~s : ~s");

    private static final SubLString $$$mapping_skolem_axiom_table = makeString("mapping skolem axiom table");

    private static final SubLList $list90 = list(makeSymbol("CONSTANT"), makeSymbol("LISPY"), makeSymbol("MT"), makeSymbol("CNFS"));

    private static final SubLSymbol CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P = makeSymbol("CYC-CONST-GENERAL-EXISTENTIAL-OPERATOR-P");

    private static final SubLString $str92$fixing_skolems_w_o_mts = makeString("fixing skolems w/o mts");

    private static final SubLList $list93 = list(makeKeyword("SKOLEM-DEFN-MISSING"));

    private static final SubLSymbol $SKOLEM_DEFN_NOT_LIST = makeKeyword("SKOLEM-DEFN-NOT-LIST");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_LENGTH = makeKeyword("SKOLEM-DEFN-MAL-LENGTH");

    private static final SubLList $list96 = listS(makeSymbol("FIRST"), makeSymbol("&OPTIONAL"), makeSymbol("SECOND"), makeSymbol("THIRD"), makeSymbol("FOURTH"), makeSymbol("ORTS"));

    private static final SubLSymbol $SKOLEM_DEFN_ORTS = makeKeyword("SKOLEM-DEFN-ORTS");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_SKOLEM_FORT = makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FORT");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH = makeKeyword("SKOLEM-DEFN-MAL-UNREIFIED-FN-LENGTH");

    private static final SubLList $list100 = list(makeSymbol("SKOLEM-FN-FUNCTION"), makeSymbol("ARGS"), makeSymbol("VAR"), makeSymbol("SEQVAR-OR-NUMBER"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));

    private static final SubLSymbol $SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE = makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FN-TYPE");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS = makeKeyword("SKOLEM-DEFN-MAL-SKOLEM-FN-ARGS");

    private static final SubLSymbol $kw103$SKOLEM_DEFN_ARGS_W_O_NUMBER = makeKeyword("SKOLEM-DEFN-ARGS-W/O-NUMBER");

    private static final SubLSymbol $SKOLEM_DEFN_NON_VAR_ARGS = makeKeyword("SKOLEM-DEFN-NON-VAR-ARGS");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_SK_VAR = makeKeyword("SKOLEM-DEFN-MAL-SK-VAR");

    private static final SubLSymbol $kw106$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH = makeKeyword("SKOLEM-DEFN-ARGS-SK-TYPE/NUMBER-MISMATCH");



    private static final SubLSymbol $SKOLEM_DEFN_OBSOLETE_NUMBER = makeKeyword("SKOLEM-DEFN-OBSOLETE-NUMBER");

    private static final SubLSymbol $SKOLEM_DEFN_MAL_MT = makeKeyword("SKOLEM-DEFN-MAL-MT");

    private static final SubLList $list110 = list(makeKeyword("SKOLEM-DEFN-W/O-CLAUSES"));

    private static final SubLList $list111 = list(new SubLObject[]{ reader_make_constant_shell("ThePrototypicalFixedAritySkolemFunction"), reader_make_constant_shell("SKF-4855075916"), reader_make_constant_shell("SKF-9401565"), reader_make_constant_shell("SKF-30608153"), reader_make_constant_shell("SKF-358427"), reader_make_constant_shell("SKF-981029"), reader_make_constant_shell("SKF-378457"), reader_make_constant_shell("SKF-7897525238"), reader_make_constant_shell("SKF-23426283"), reader_make_constant_shell("SKF-4978723980"), reader_make_constant_shell("SKF-8095780367"), reader_make_constant_shell("SKF-2283707389"), reader_make_constant_shell("SKF-3819196850"), reader_make_constant_shell("SKF-2177078880"), reader_make_constant_shell("SKF-9178370244"), reader_make_constant_shell("SKF-2313708415"), reader_make_constant_shell("SKF-54808499"), reader_make_constant_shell("SKF-2396342019"), reader_make_constant_shell("SKF-0540013113"), reader_make_constant_shell("SKF-7329112212"), reader_make_constant_shell("SKF-2463549462"), reader_make_constant_shell("SKF-7267986583"), reader_make_constant_shell("SKF-2341431804"), reader_make_constant_shell("SKF-5635570701"), reader_make_constant_shell("SKF-8712676684"), reader_make_constant_shell("SKF-6439069748"), reader_make_constant_shell("SKF-3035846539"), reader_make_constant_shell("SKF-9609006789"), reader_make_constant_shell("SKF-2094656502"), reader_make_constant_shell("SKF-1622895730"), reader_make_constant_shell("SKF-6034791567"), reader_make_constant_shell("SKF-8429706273"), reader_make_constant_shell("SKF-5002539315"), reader_make_constant_shell("SKF-7731242586"), reader_make_constant_shell("SKF-1935351914"), reader_make_constant_shell("SKF-5819554541"), reader_make_constant_shell("SKF-7665225690"), reader_make_constant_shell("SKF-5742181768"), reader_make_constant_shell("SKF-7774820049"), reader_make_constant_shell("SKF-9832002172"), reader_make_constant_shell("SKF-9099460346"), reader_make_constant_shell("SKF-6802057837"), reader_make_constant_shell("SKF-0233545031"), reader_make_constant_shell("SKF-7143243607"), reader_make_constant_shell("SKF-5547792583"), reader_make_constant_shell("SKF-1970550724"), reader_make_constant_shell("SKF-2043784885"), reader_make_constant_shell("SKF-1714183462"), reader_make_constant_shell("SKF-6071957396"), reader_make_constant_shell("SKF-7004599156"), reader_make_constant_shell("SKF-0633671947"), reader_make_constant_shell("SKF-4928965872"), reader_make_constant_shell("SKF-4365040835"), reader_make_constant_shell("SKF-9778251013"), reader_make_constant_shell("SKF-8146092452"), reader_make_constant_shell("SKF-0882987459"), reader_make_constant_shell("SKF-6693421741"), reader_make_constant_shell("SKF-1800635573"), reader_make_constant_shell("SKF-5174206356"), reader_make_constant_shell("SKF-8137704160"), reader_make_constant_shell("SKF-6138620537"), reader_make_constant_shell("SKF-6954747722"), reader_make_constant_shell("SKF-8822929547"), reader_make_constant_shell("SKF-6574888924"), reader_make_constant_shell("SKF-4648710733"), reader_make_constant_shell("SKF-3574121958"), reader_make_constant_shell("SKF-7111033530"), reader_make_constant_shell("SKF-1259710929"), reader_make_constant_shell("SKF-9511328868"), reader_make_constant_shell("SKF-7988430072"), reader_make_constant_shell("SKF-9334424285"), reader_make_constant_shell("SKF-0241028856"), reader_make_constant_shell("SKF-8824048486"), reader_make_constant_shell("SKF-4709173148"), reader_make_constant_shell("SKF-9085853324"), reader_make_constant_shell("SKF-5615627058"), reader_make_constant_shell("SKF-6491665291"), reader_make_constant_shell("SKF-0256832978"), reader_make_constant_shell("SKF-1494753028"), reader_make_constant_shell("SKF-3439360561"), reader_make_constant_shell("SKF-4359556905"), reader_make_constant_shell("SKF-1746016905"), reader_make_constant_shell("SKF-4430979996"), reader_make_constant_shell("SKF-5792768502"), reader_make_constant_shell("SKF-5965884944"), reader_make_constant_shell("SKF-4975731367"), reader_make_constant_shell("SKF-2918153882"), reader_make_constant_shell("SKF-0992686716"), reader_make_constant_shell("SKF-8537516687"), reader_make_constant_shell("SKF-7685719048"), reader_make_constant_shell("SKF-1488659619"), reader_make_constant_shell("SKF-9837174340"), reader_make_constant_shell("SKF-0372211184"), reader_make_constant_shell("SKF-6796242698"), reader_make_constant_shell("SKF-4631282123"), reader_make_constant_shell("SKF-8747036173"), reader_make_constant_shell("SKF-9214557550"), reader_make_constant_shell("SKF-2969771224"), reader_make_constant_shell("SKF-3201009743"), reader_make_constant_shell("SKF-8199787846"), reader_make_constant_shell("SKF-1857924337"), reader_make_constant_shell("SKF-2577476768"), reader_make_constant_shell("SKF-9606922473"), reader_make_constant_shell("SKF-3890236588"), reader_make_constant_shell("SKF-2976547342"), reader_make_constant_shell("SKF-2734536924"), reader_make_constant_shell("SKF-4107434815"), reader_make_constant_shell("SKF-8121330546"), reader_make_constant_shell("SKF-0714339318"), reader_make_constant_shell("SKF-3616130689"), reader_make_constant_shell("SKF-4918966"), reader_make_constant_shell("SKF-12370394"), reader_make_constant_shell("SKF-58467056"), reader_make_constant_shell("SKF-61049284"), reader_make_constant_shell("SKF-14302329"), reader_make_constant_shell("SKF-4779393528"), reader_make_constant_shell("SKF-1305979122"), reader_make_constant_shell("SKF-3277105"), reader_make_constant_shell("SKF-23116387"), reader_make_constant_shell("SKF-55356852"), reader_make_constant_shell("SKF-4332265"), reader_make_constant_shell("SKF-DepictedFamilyMem2"), reader_make_constant_shell("SKF-38156889"), reader_make_constant_shell("SKF-DepictedFamilyMem1"), reader_make_constant_shell("SKF-0858093676"), reader_make_constant_shell("SKF-7924901403"), reader_make_constant_shell("SKF-7033956451"), reader_make_constant_shell("SKF-4442841559") });

    private static final SubLObject $list112 = _constant_112_initializer();

    private static final SubLString $str113$_a__a__s__ = makeString("~a ~a ~s~%");

    private static final SubLSymbol DIAGNOSE_JUST_THIS_SKOLEM = makeSymbol("DIAGNOSE-JUST-THIS-SKOLEM");

    private static final SubLList $list122 = list(makeKeyword("RAW-SKOLEM"), makeKeyword("UNREIFIED-SKOLEM"), makeKeyword("FREE-VARIABLE"));

    private static final SubLString $str124$different_el_formulas_for__a____s = makeString("different el formulas for ~a:~%~s~%~s");

    static private final SubLList $list125 = list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?")));

    static private final SubLList $list126 = list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?"))));

    static private final SubLList $list127 = list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?")))));

    static private final SubLList $list128 = list(reader_make_constant_shell("implies"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?"))));

    static private final SubLList $list129 = list(reader_make_constant_shell("implies"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?")))));

    static private final SubLList $list130 = list(reader_make_constant_shell("implies"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?"))))));

    static private final SubLList $list131 = list(reader_make_constant_shell("implies"), makeKeyword("ANYTHING"), list(list($TEST, makeSymbol("CYC-CONST-BOUNDED-EXISTENTIAL-OPERATOR-P")), list($TEST, makeSymbol("GROUND?")), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?"))));

    private static final SubLList $list132 = list(reader_make_constant_shell("and"), list($TEST, makeSymbol("EL-LITERAL-P")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("temporalMicrotheoriesIntersect"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))));

    static private final SubLList $list133 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("temporalMicrotheoriesIntersect"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))), list($TEST, makeSymbol("EL-LITERAL-P")));

    private static final SubLList $list135 = list(makeSymbol("SKOLEM-TYPE"), makeSymbol("VARS"), makeSymbol("SK-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));

    private static final SubLString $str136$Skolem_type_mismatch___a__a__a = makeString("Skolem type mismatch: ~a ~a ~a");

    private static final SubLString $str137$ = makeString("");

    private static final SubLString $$$temporalMicrotheoriesIntersect_ = makeString("temporalMicrotheoriesIntersect ");

    private static final SubLString $str139$___amismatch_for__a___a___a__ = makeString("~%~amismatch for ~a~%~a~%~a~%");

    static private final SubLList $list140 = list(makeSymbol("SK-FN"), makeSymbol("VARS"), makeSymbol("VAR"), makeSymbol("SEQVAR"));

    private static final SubLString $$$Error = makeString("Error");

    static private final SubLList $list142 = list(makeSymbol("SK-FN"), makeSymbol("VARS"), makeSymbol("VAR"), makeSymbol("SEQVAR"), makeSymbol("&OPTIONAL"), makeSymbol("EXISTING-NUMBER"));

    private static final SubLSymbol $sym143$SKOLEM_SCALAR_TERM_ = makeSymbol("SKOLEM-SCALAR-TERM?");

    static private final SubLList $list144 = list(makeSymbol("ASS1"), makeSymbol("ASS2"));



    private static final SubLList $list146 = list(makeSymbol("CONTENT-ASS"), makeSymbol("TMI-ASS"));



    private static final SubLSymbol $sym148$_TIME = makeSymbol("?TIME");





    static private final SubLList $list151 = list(list(reader_make_constant_shell("MtTimeDimFn"), makeSymbol("?TIME")));



    static private final SubLList $list153 = list(list(reader_make_constant_shell("temporalMicrotheoriesIntersect"), list(reader_make_constant_shell("MtTimeDimFn"), makeSymbol("?TIME")), list(reader_make_constant_shell("MtTimeWithGranularityDimFn"), list(reader_make_constant_shell("IntervalEndedByFn"), reader_make_constant_shell("Now-Indexical")), reader_make_constant_shell("TimePoint"))));



    private static final SubLList $list155 = list(new SubLObject[]{ reader_make_constant_shell("SKF-2172650888"), reader_make_constant_shell("SKF-6548862369"), reader_make_constant_shell("SKF-8409811003"), reader_make_constant_shell("SKF-7363528201"), reader_make_constant_shell("SKF-1358114357"), reader_make_constant_shell("SKF-4072021064"), reader_make_constant_shell("SKF-1681761679"), reader_make_constant_shell("SKF-2548755082"), reader_make_constant_shell("SKF-6067931751"), reader_make_constant_shell("SKF-5709128133"), reader_make_constant_shell("SKF-1590734700"), reader_make_constant_shell("SKF-5134195828"), reader_make_constant_shell("SKF-3907269039"), reader_make_constant_shell("SKF-6454474627"), reader_make_constant_shell("SKF-9567857250"), reader_make_constant_shell("SKF-5128698501"), reader_make_constant_shell("SKF-0849952130"), reader_make_constant_shell("SKF-5716409094"), reader_make_constant_shell("SKF-9715593487"), reader_make_constant_shell("SKF-4012481774"), reader_make_constant_shell("SKF-9973400181"), reader_make_constant_shell("SKF-4749210628"), reader_make_constant_shell("SKF-7688139609"), reader_make_constant_shell("SKF-7103881989"), reader_make_constant_shell("SKF-5296958920"), reader_make_constant_shell("SKF-9684239747"), reader_make_constant_shell("SKF-9283857452"), reader_make_constant_shell("SKF-8076090600"), reader_make_constant_shell("SKF-8853185369"), reader_make_constant_shell("SKF-2870709283"), reader_make_constant_shell("SKF-4865105368"), reader_make_constant_shell("SKF-6632523431"), reader_make_constant_shell("SKF-8236383708"), reader_make_constant_shell("SKF-0341790583"), reader_make_constant_shell("SKF-5342612010") });

    private static final SubLString $$$recanonicalizing_skolems = makeString("recanonicalizing skolems");

    private static final SubLList $list157 = list(new SubLObject[]{ reader_make_constant_shell("ThePrototypicalFixedAritySkolemFunction"), reader_make_constant_shell("SKF-4855075916"), reader_make_constant_shell("SKF-9401565"), reader_make_constant_shell("SKF-30608153"), reader_make_constant_shell("SKF-358427"), reader_make_constant_shell("SKF-981029"), reader_make_constant_shell("SKF-378457"), reader_make_constant_shell("SKF-7897525238"), reader_make_constant_shell("SKF-23426283"), reader_make_constant_shell("SKF-4978723980"), reader_make_constant_shell("SKF-8095780367"), reader_make_constant_shell("SKF-2283707389"), reader_make_constant_shell("SKF-3819196850"), reader_make_constant_shell("SKF-2177078880"), reader_make_constant_shell("SKF-9178370244"), reader_make_constant_shell("SKF-2313708415"), reader_make_constant_shell("SKF-54808499"), reader_make_constant_shell("SKF-2396342019"), reader_make_constant_shell("SKF-0540013113"), reader_make_constant_shell("SKF-7329112212"), reader_make_constant_shell("SKF-2463549462"), reader_make_constant_shell("SKF-7267986583"), reader_make_constant_shell("SKF-2341431804"), reader_make_constant_shell("SKF-5635570701"), reader_make_constant_shell("SKF-8712676684"), reader_make_constant_shell("SKF-6439069748"), reader_make_constant_shell("SKF-3035846539"), reader_make_constant_shell("SKF-9609006789"), reader_make_constant_shell("SKF-2094656502"), reader_make_constant_shell("SKF-1622895730"), reader_make_constant_shell("SKF-6034791567"), reader_make_constant_shell("SKF-8429706273"), reader_make_constant_shell("SKF-5002539315"), reader_make_constant_shell("SKF-7731242586"), reader_make_constant_shell("SKF-1935351914"), reader_make_constant_shell("SKF-5819554541"), reader_make_constant_shell("SKF-7665225690"), reader_make_constant_shell("SKF-5742181768"), reader_make_constant_shell("SKF-7774820049"), reader_make_constant_shell("SKF-9832002172"), reader_make_constant_shell("SKF-9099460346"), reader_make_constant_shell("SKF-6802057837"), reader_make_constant_shell("SKF-0233545031"), reader_make_constant_shell("SKF-7143243607"), reader_make_constant_shell("SKF-5547792583"), reader_make_constant_shell("SKF-1970550724"), reader_make_constant_shell("SKF-2043784885"), reader_make_constant_shell("SKF-1714183462"), reader_make_constant_shell("SKF-6071957396"), reader_make_constant_shell("SKF-7004599156"), reader_make_constant_shell("SKF-0633671947"), reader_make_constant_shell("SKF-4928965872"), reader_make_constant_shell("SKF-4365040835"), reader_make_constant_shell("SKF-9778251013"), reader_make_constant_shell("SKF-8146092452"), reader_make_constant_shell("SKF-0882987459"), reader_make_constant_shell("SKF-6693421741"), reader_make_constant_shell("SKF-1800635573"), reader_make_constant_shell("SKF-5174206356"), reader_make_constant_shell("SKF-8137704160"), reader_make_constant_shell("SKF-6138620537"), reader_make_constant_shell("SKF-6954747722"), reader_make_constant_shell("SKF-8822929547"), reader_make_constant_shell("SKF-6574888924"), reader_make_constant_shell("SKF-4648710733"), reader_make_constant_shell("SKF-3574121958"), reader_make_constant_shell("SKF-7111033530"), reader_make_constant_shell("SKF-1259710929"), reader_make_constant_shell("SKF-9511328868"), reader_make_constant_shell("SKF-7988430072"), reader_make_constant_shell("SKF-9334424285"), reader_make_constant_shell("SKF-0241028856"), reader_make_constant_shell("SKF-8824048486"), reader_make_constant_shell("SKF-4709173148"), reader_make_constant_shell("SKF-9085853324"), reader_make_constant_shell("SKF-5615627058"), reader_make_constant_shell("SKF-6491665291"), reader_make_constant_shell("SKF-0256832978"), reader_make_constant_shell("SKF-1494753028"), reader_make_constant_shell("SKF-3439360561"), reader_make_constant_shell("SKF-4359556905"), reader_make_constant_shell("SKF-1746016905"), reader_make_constant_shell("SKF-4430979996"), reader_make_constant_shell("SKF-5792768502"), reader_make_constant_shell("SKF-5965884944"), reader_make_constant_shell("SKF-4975731367"), reader_make_constant_shell("SKF-2918153882"), reader_make_constant_shell("SKF-0992686716"), reader_make_constant_shell("SKF-8537516687"), reader_make_constant_shell("SKF-7685719048"), reader_make_constant_shell("SKF-1488659619"), reader_make_constant_shell("SKF-9837174340"), reader_make_constant_shell("SKF-0372211184"), reader_make_constant_shell("SKF-6796242698"), reader_make_constant_shell("SKF-4631282123"), reader_make_constant_shell("SKF-8747036173"), reader_make_constant_shell("SKF-9214557550"), reader_make_constant_shell("SKF-2969771224"), reader_make_constant_shell("SKF-3201009743"), reader_make_constant_shell("SKF-8199787846"), reader_make_constant_shell("SKF-1857924337"), reader_make_constant_shell("SKF-2577476768"), reader_make_constant_shell("SKF-9606922473"), reader_make_constant_shell("SKF-3890236588"), reader_make_constant_shell("SKF-2976547342"), reader_make_constant_shell("SKF-2734536924"), reader_make_constant_shell("SKF-4107434815"), reader_make_constant_shell("SKF-8121330546"), reader_make_constant_shell("SKF-0714339318"), reader_make_constant_shell("SKF-3616130689"), reader_make_constant_shell("SKF-4918966"), reader_make_constant_shell("SKF-12370394"), reader_make_constant_shell("SKF-58467056"), reader_make_constant_shell("SKF-61049284"), reader_make_constant_shell("SKF-14302329"), reader_make_constant_shell("SKF-4779393528"), reader_make_constant_shell("SKF-1305979122"), reader_make_constant_shell("SKF-0519624184"), reader_make_constant_shell("SKF-8565886278"), reader_make_constant_shell("SKF-5224425512"), reader_make_constant_shell("SKF-4272845489"), reader_make_constant_shell("SKF-8653559423"), reader_make_constant_shell("SKF-6875965541"), reader_make_constant_shell("SKF-3326030935"), reader_make_constant_shell("SKF-5171360072"), reader_make_constant_shell("SKF-1849376525"), reader_make_constant_shell("SKF-9027182255"), reader_make_constant_shell("SKF-9111966754"), reader_make_constant_shell("SKF-3322944904"), reader_make_constant_shell("SKF-6974073305"), reader_make_constant_shell("SKF-9804613947"), reader_make_constant_shell("SKF-4372359165"), reader_make_constant_shell("SKF-59006438"), reader_make_constant_shell("SKF-7033956451"), reader_make_constant_shell("SKF-4442841559") });

    private static final SubLString $str163$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str168$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str169$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str170$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list171 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str172$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str173$Bad_skolem_function___A__ = makeString("Bad skolem function: ~A~%");

    // Definitions
    /**
     * each element of UNREIFIED-SK-TERMS is a skolem nat whose function has not yet been reified;
     * e.g., (#$SkolemFunctionFn (?X) ?Y212).  CLAUSES is a set of cnfs or cnfs that reference elements
     * of UNREIFIED-SK-TERMS.  Returned are the elements of CLAUSES with skolem nats that include
     * either reified functions, e.g., (#$SKF-748758 ?X), when reification is appropriate, or the
     * the unreified functions, when reification is not appropriate.  Reification is appropriate
     * either when the formula being canonicalized is being asserted (e.g., *within-assert* is non-nil)
     * or when a reified term already exists for this skolem (e.g., the same formula has already been
     * asserted).
     */
    @LispMethod(comment = "each element of UNREIFIED-SK-TERMS is a skolem nat whose function has not yet been reified;\r\ne.g., (#$SkolemFunctionFn (?X) ?Y212).  CLAUSES is a set of cnfs or cnfs that reference elements\r\nof UNREIFIED-SK-TERMS.  Returned are the elements of CLAUSES with skolem nats that include\r\neither reified functions, e.g., (#$SKF-748758 ?X), when reification is appropriate, or the\r\nthe unreified functions, when reification is not appropriate.  Reification is appropriate\r\neither when the formula being canonicalized is being asserted (e.g., *within-assert* is non-nil)\r\nor when a reified term already exists for this skolem (e.g., the same formula has already been\r\nasserted).\neach element of UNREIFIED-SK-TERMS is a skolem nat whose function has not yet been reified;\ne.g., (#$SkolemFunctionFn (?X) ?Y212).  CLAUSES is a set of cnfs or cnfs that reference elements\nof UNREIFIED-SK-TERMS.  Returned are the elements of CLAUSES with skolem nats that include\neither reified functions, e.g., (#$SKF-748758 ?X), when reification is appropriate, or the\nthe unreified functions, when reification is not appropriate.  Reification is appropriate\neither when the formula being canonicalized is being asserted (e.g., *within-assert* is non-nil)\nor when a reified term already exists for this skolem (e.g., the same formula has already been\nasserted).")
    public static final SubLObject reify_skolems_in_alt(SubLObject unreified_sk_terms, SubLObject v_clauses, SubLObject mt, SubLObject createP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pairs = NIL;
                {
                    SubLObject cdolist_list_var = unreified_sk_terms;
                    SubLObject unreified_sk_term = NIL;
                    for (unreified_sk_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unreified_sk_term = cdolist_list_var.first()) {
                        unreified_sk_term = com.cyc.cycjava.cycl.skolems.canonicalize_fns_in_sk_term(unreified_sk_term);
                        {
                            SubLObject sk_clauses = clause_utilities.term_clauses_including_refd_vars(unreified_sk_term, v_clauses, symbol_function(EQUAL));
                            SubLObject skolem_term = com.cyc.cycjava.cycl.skolems.canonicalize_skolem_term(unreified_sk_term, sk_clauses, mt, createP);
                            if (NIL != misc_utilities.initialized_p(czer_main.$tou_skolem_blist$.getDynamicValue(thread))) {
                                {
                                    SubLObject orig_var = com.cyc.cycjava.cycl.skolems.skolem_function_var(unreified_sk_term);
                                    SubLObject sk_functor = cycl_utilities.nat_functor(skolem_term);
                                    czer_main.$tou_skolem_blist$.setDynamicValue(cons(cons(sk_functor, orig_var), czer_main.$tou_skolem_blist$.getDynamicValue(thread)), thread);
                                }
                            }
                            pairs = cons(list(unreified_sk_term, skolem_term), pairs);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = pairs;
                    SubLObject pair = NIL;
                    for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                        {
                            SubLObject datum = pair;
                            SubLObject current = datum;
                            SubLObject unreified_sk_term = NIL;
                            SubLObject skolem_term = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt0);
                            unreified_sk_term = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt0);
                            skolem_term = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                v_clauses = com.cyc.cycjava.cycl.skolems.subst_skolem_in(unreified_sk_term, skolem_term, v_clauses);
                            } else {
                                cdestructuring_bind_error(datum, $list_alt0);
                            }
                        }
                    }
                }
                return v_clauses;
            }
        }
    }

    // Definitions
    /**
     * each element of UNREIFIED-SK-TERMS is a skolem nat whose function has not yet been reified;
     * e.g., (#$SkolemFunctionFn (?X) ?Y212).  CLAUSES is a set of cnfs or cnfs that reference elements
     * of UNREIFIED-SK-TERMS.  Returned are the elements of CLAUSES with skolem nats that include
     * either reified functions, e.g., (#$SKF-748758 ?X), when reification is appropriate, or the
     * the unreified functions, when reification is not appropriate.  Reification is appropriate
     * either when the formula being canonicalized is being asserted (e.g., *within-assert* is non-nil)
     * or when a reified term already exists for this skolem (e.g., the same formula has already been
     * asserted).
     */
    @LispMethod(comment = "each element of UNREIFIED-SK-TERMS is a skolem nat whose function has not yet been reified;\r\ne.g., (#$SkolemFunctionFn (?X) ?Y212).  CLAUSES is a set of cnfs or cnfs that reference elements\r\nof UNREIFIED-SK-TERMS.  Returned are the elements of CLAUSES with skolem nats that include\r\neither reified functions, e.g., (#$SKF-748758 ?X), when reification is appropriate, or the\r\nthe unreified functions, when reification is not appropriate.  Reification is appropriate\r\neither when the formula being canonicalized is being asserted (e.g., *within-assert* is non-nil)\r\nor when a reified term already exists for this skolem (e.g., the same formula has already been\r\nasserted).\neach element of UNREIFIED-SK-TERMS is a skolem nat whose function has not yet been reified;\ne.g., (#$SkolemFunctionFn (?X) ?Y212).  CLAUSES is a set of cnfs or cnfs that reference elements\nof UNREIFIED-SK-TERMS.  Returned are the elements of CLAUSES with skolem nats that include\neither reified functions, e.g., (#$SKF-748758 ?X), when reification is appropriate, or the\nthe unreified functions, when reification is not appropriate.  Reification is appropriate\neither when the formula being canonicalized is being asserted (e.g., *within-assert* is non-nil)\nor when a reified term already exists for this skolem (e.g., the same formula has already been\nasserted).")
    public static SubLObject reify_skolems_in(final SubLObject unreified_sk_terms, SubLObject v_clauses, final SubLObject mt, final SubLObject createP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pairs = NIL;
        SubLObject cdolist_list_var = unreified_sk_terms;
        SubLObject unreified_sk_term = NIL;
        unreified_sk_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            unreified_sk_term = canonicalize_fns_in_sk_term(unreified_sk_term);
            final SubLObject sk_clauses = clause_utilities.term_clauses_including_refd_vars(unreified_sk_term, v_clauses, symbol_function(EQUAL));
            final SubLObject skolem_term = canonicalize_skolem_term(unreified_sk_term, sk_clauses, mt, createP);
            if (NIL != misc_utilities.initialized_p(czer_main.$tou_skolem_blist$.getDynamicValue(thread))) {
                final SubLObject orig_var = skolem_function_var(unreified_sk_term);
                final SubLObject sk_functor = cycl_utilities.nat_functor(skolem_term);
                czer_main.$tou_skolem_blist$.setDynamicValue(cons(cons(sk_functor, orig_var), czer_main.$tou_skolem_blist$.getDynamicValue(thread)), thread);
            }
            pairs = cons(list(unreified_sk_term, skolem_term), pairs);
            cdolist_list_var = cdolist_list_var.rest();
            unreified_sk_term = cdolist_list_var.first();
        } 
        cdolist_list_var = pairs;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject unreified_sk_term2 = NIL;
            SubLObject skolem_term2 = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            unreified_sk_term2 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list0);
            skolem_term2 = current.first();
            current = current.rest();
            if (NIL == current) {
                v_clauses = subst_skolem_in(unreified_sk_term2, skolem_term2, v_clauses);
            } else {
                cdestructuring_bind_error(datum, $list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return v_clauses;
    }

    public static final SubLObject canonicalize_fns_in_sk_term_alt(SubLObject sk_term) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = sk_term;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != term.function_termP(v_term)) {
                    result = cons(czer_main.canonicalize_fn_term_if_reified(v_term), result);
                } else {
                    result = cons(v_term, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject canonicalize_fns_in_sk_term(final SubLObject sk_term) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sk_term;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != term.function_termP(v_term)) {
                result = cons(czer_main.canonicalize_fn_term_if_reified(v_term), result);
            } else {
                result = cons(v_term, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject subst_skolem_in_alt(SubLObject unreified_sk_term, SubLObject skolem_term, SubLObject v_clauses) {
        if (NIL != term.reified_skolem_constant_termP(skolem_term)) {
            return czer_main.reify_function_in(skolem_term, subst(skolem_term, unreified_sk_term, v_clauses, symbol_function(EQUAL), UNPROVIDED));
        } else {
            if (NIL != term.reified_skolem_function_termP(skolem_term)) {
                {
                    SubLObject sk_var = com.cyc.cycjava.cycl.skolems.skolem_function_var(unreified_sk_term);
                    SubLObject tou_lit = list($$termOfUnit, sk_var, skolem_term);
                    SubLObject result = NIL;
                    SubLObject cdolist_list_var = subst(sk_var, unreified_sk_term, v_clauses, symbol_function(EQUAL), UNPROVIDED);
                    SubLObject clause = NIL;
                    for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                        if (NIL != list_utilities.cons_tree_find(sk_var, clause, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject datum = clause;
                                SubLObject current = datum;
                                SubLObject neg_lits = NIL;
                                SubLObject pos_lits = NIL;
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                neg_lits = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list_alt2);
                                pos_lits = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    result = cons(list(list_utilities.nadd_to_end(tou_lit, neg_lits), pos_lits), result);
                                } else {
                                    cdestructuring_bind_error(datum, $list_alt2);
                                }
                            }
                        } else {
                            result = cons(clause, result);
                        }
                    }
                    return nreverse(result);
                }
            } else {
                if (NIL != skolem_term) {
                    return subst(skolem_term, unreified_sk_term, v_clauses, symbol_function(EQUAL), UNPROVIDED);
                } else {
                    return v_clauses;
                }
            }
        }
    }

    public static SubLObject subst_skolem_in(final SubLObject unreified_sk_term, final SubLObject skolem_term, final SubLObject v_clauses) {
        if (NIL != term.reified_skolem_constant_termP(skolem_term)) {
            return czer_main.reify_function_in(skolem_term, subst(skolem_term, unreified_sk_term, v_clauses, symbol_function(EQUAL), UNPROVIDED));
        }
        if (NIL != term.reified_skolem_function_termP(skolem_term)) {
            final SubLObject sk_var = skolem_function_var(unreified_sk_term);
            final SubLObject tou_lit = list($$termOfUnit, sk_var, skolem_term);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = subst(sk_var, unreified_sk_term, v_clauses, symbol_function(EQUAL), UNPROVIDED);
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != list_utilities.cons_tree_find(sk_var, clause, UNPROVIDED, UNPROVIDED)) {
                    SubLObject current;
                    final SubLObject datum = current = clause;
                    SubLObject neg_lits = NIL;
                    SubLObject pos_lits = NIL;
                    destructuring_bind_must_consp(current, datum, $list2);
                    neg_lits = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list2);
                    pos_lits = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        result = cons(list(list_utilities.nadd_to_end(tou_lit, neg_lits), pos_lits), result);
                    } else {
                        cdestructuring_bind_error(datum, $list2);
                    }
                } else {
                    result = cons(clause, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            return nreverse(result);
        }
        if (NIL != skolem_term) {
            return subst(skolem_term, unreified_sk_term, v_clauses, symbol_function(EQUAL), UNPROVIDED);
        }
        return v_clauses;
    }

    public static final SubLObject skolem_function_dependent_vars_alt(SubLObject unreified_skolem_term) {
        {
            SubLObject result = cycl_utilities.nat_arg1(unreified_skolem_term, UNPROVIDED);
            SubLObject sequence_var = cycl_utilities.nat_arg3(unreified_skolem_term, UNPROVIDED);
            if (NIL != sequence_var) {
                result = cons(sequence_var, result);
            }
            return result;
        }
    }

    public static SubLObject skolem_function_dependent_vars(final SubLObject unreified_skolem_term) {
        SubLObject result = cycl_utilities.nat_arg1(unreified_skolem_term, UNPROVIDED);
        final SubLObject sequence_var = cycl_utilities.nat_arg3(unreified_skolem_term, UNPROVIDED);
        if (NIL != sequence_var) {
            result = cons(sequence_var, result);
        }
        return result;
    }

    public static final SubLObject skolem_function_var_alt(SubLObject unreified_skolem_term) {
        {
            SubLObject pcase_var = cycl_utilities.nat_functor(unreified_skolem_term);
            if (pcase_var.eql($$SkolemFunctionFn)) {
                return cycl_utilities.nat_arg2(unreified_skolem_term, UNPROVIDED);
            } else {
                if (pcase_var.eql($$SkolemFunction)) {
                    return list_utilities.last_one(unreified_skolem_term);
                } else {
                    if (pcase_var.eql($$SkolemFuncN)) {
                        return list_utilities.penultimate_one(unreified_skolem_term);
                    } else {
                        if (pcase_var.eql($$SkolemFuncNFn)) {
                            return cycl_utilities.nat_arg2(unreified_skolem_term, UNPROVIDED);
                        } else {
                            el_error(FIVE_INTEGER, $str_alt7$unreified_skolem_term_references_, unreified_skolem_term, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject skolem_function_var(final SubLObject unreified_skolem_term) {
        final SubLObject pcase_var = cycl_utilities.nat_functor(unreified_skolem_term);
        if (pcase_var.eql($$SkolemFunctionFn)) {
            return cycl_utilities.nat_arg2(unreified_skolem_term, UNPROVIDED);
        }
        if (pcase_var.eql($$SkolemFunction)) {
            return list_utilities.last_one(unreified_skolem_term);
        }
        if (pcase_var.eql($$SkolemFuncN)) {
            return list_utilities.penultimate_one(unreified_skolem_term);
        }
        if (pcase_var.eql($$SkolemFuncNFn)) {
            return cycl_utilities.nat_arg2(unreified_skolem_term, UNPROVIDED);
        }
        el_error(FIVE_INTEGER, $str7$unreified_skolem_term_references_, unreified_skolem_term, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject skolem_args_alt(SubLObject unreified_skolem_term, SubLObject v_clauses, SubLObject arg_sort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sk_number = com.cyc.cycjava.cycl.skolems.skolem_number(unreified_skolem_term);
                SubLObject args = NIL;
                {
                    SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(CAR), Sort.sort(copy_list(arg_sort), symbol_function($sym9$_), symbol_function(CDR)));
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        if (NIL != subl_promotions.memberP(arg, second(unreified_skolem_term), UNPROVIDED, UNPROVIDED)) {
                            args = cons(arg, args);
                        }
                    }
                }
                args = nreverse(args);
                if (czer_vars.$el_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    if ((NIL != set_difference(second(unreified_skolem_term), args, UNPROVIDED, UNPROVIDED)) || (NIL != set_difference(args, second(unreified_skolem_term), UNPROVIDED, UNPROVIDED))) {
                        el_error(THREE_INTEGER, $str_alt11$skolem_args____s_vs__s, second(unreified_skolem_term), args, UNPROVIDED);
                    }
                }
                {
                    SubLObject sequence_vars = list_utilities.mapunion(symbol_function(CLAUSE_FREE_SEQUENCE_VARIABLES), v_clauses, UNPROVIDED);
                    SubLObject term_vars = list_utilities.mapunion(symbol_function(CLAUSE_FREE_TERM_VARIABLES), v_clauses, UNPROVIDED);
                    SubLObject ans = NIL;
                    if (length(sequence_vars).numG(ONE_INTEGER)) {
                        sublisp_throw($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, list($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, com.cyc.cycjava.cycl.skolems.skolem_seqvar(unreified_skolem_term), sequence_vars));
                    }
                    if (NIL != czer_vars.$minimal_skolem_arityP$.getDynamicValue(thread)) {
                        if (NIL != sk_number) {
                            return list_utilities.nadd_to_end(sk_number, args);
                        } else {
                            return args;
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var = args;
                            SubLObject arg = NIL;
                            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                if (NIL != subl_promotions.memberP(arg, term_vars, UNPROVIDED, UNPROVIDED)) {
                                    ans = cons(arg, ans);
                                }
                            }
                            return nreverse(list_utilities.cons_if(sk_number, ans));
                        }
                    }
                }
            }
        }
    }

    public static SubLObject skolem_args(final SubLObject unreified_skolem_term, final SubLObject v_clauses, final SubLObject arg_sort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sk_number = skolem_number(unreified_skolem_term);
        SubLObject args = NIL;
        SubLObject cdolist_list_var = Mapping.mapcar(symbol_function(CAR), Sort.sort(copy_list(arg_sort), symbol_function($sym9$_), symbol_function(CDR)));
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(arg, second(unreified_skolem_term), UNPROVIDED, UNPROVIDED)) {
                args = cons(arg, args);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        args = nreverse(args);
        if (czer_vars.$el_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER) && ((NIL != set_difference(second(unreified_skolem_term), args, UNPROVIDED, UNPROVIDED)) || (NIL != set_difference(args, second(unreified_skolem_term), UNPROVIDED, UNPROVIDED)))) {
            el_error(THREE_INTEGER, $str11$skolem_args____s_vs__s, second(unreified_skolem_term), args, UNPROVIDED);
        }
        final SubLObject sequence_vars = list_utilities.mapunion(symbol_function(CLAUSE_FREE_SEQUENCE_VARIABLES), v_clauses, UNPROVIDED);
        final SubLObject term_vars = list_utilities.mapunion(symbol_function(CLAUSE_FREE_TERM_VARIABLES), v_clauses, UNPROVIDED);
        SubLObject ans = NIL;
        if (length(sequence_vars).numG(ONE_INTEGER)) {
            sublisp_throw($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, list($TOO_MANY_SEQUENCE_VARS_IN_SKOLEM_SCOPE, skolem_seqvar(unreified_skolem_term), sequence_vars));
        }
        if (NIL == czer_vars.$minimal_skolem_arityP$.getDynamicValue(thread)) {
            SubLObject cdolist_list_var2 = args;
            SubLObject arg2 = NIL;
            arg2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                if (NIL != subl_promotions.memberP(arg2, term_vars, UNPROVIDED, UNPROVIDED)) {
                    ans = cons(arg2, ans);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                arg2 = cdolist_list_var2.first();
            } 
            return nreverse(list_utilities.cons_if(sk_number, ans));
        }
        if (NIL != sk_number) {
            return list_utilities.nadd_to_end(sk_number, args);
        }
        return args;
    }

    /**
     * if some skolem fn equivalent to UNREIFIED-SK-TERM has already been reified,
     * then return a new skolem nat referencing the reified skolem fn,
     * else, when CREATE? is non-nil, reify a new skolem fn
     */
    @LispMethod(comment = "if some skolem fn equivalent to UNREIFIED-SK-TERM has already been reified,\r\nthen return a new skolem nat referencing the reified skolem fn,\r\nelse, when CREATE? is non-nil, reify a new skolem fn\nif some skolem fn equivalent to UNREIFIED-SK-TERM has already been reified,\nthen return a new skolem nat referencing the reified skolem fn,\nelse, when CREATE? is non-nil, reify a new skolem fn")
    public static final SubLObject canonicalize_skolem_term_alt(SubLObject unreified_sk_term, SubLObject skolem_clauses, SubLObject mt, SubLObject createP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject defn = NIL;
                SubLObject arg_sort = NIL;
                SubLObject sortable_skolem_clauses = com.cyc.cycjava.cycl.skolems.replace_unreified_skolem_terms_with_variables(skolem_clauses);
                {
                    SubLObject _prev_bind_0 = $skolem_arg_sort$.currentBinding(thread);
                    try {
                        $skolem_arg_sort$.bind(NIL, thread);
                        defn = com.cyc.cycjava.cycl.skolems.sk_defn_from_clauses(com.cyc.cycjava.cycl.skolems.skolem_function_var(unreified_sk_term), sortable_skolem_clauses, symbol_function($sym15$EL_VAR_));
                        arg_sort = $skolem_arg_sort$.getDynamicValue(thread);
                    } finally {
                        $skolem_arg_sort$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject term_args = com.cyc.cycjava.cycl.skolems.skolem_args(unreified_sk_term, skolem_clauses, arg_sort);
                    SubLObject seqvar = com.cyc.cycjava.cycl.skolems.skolem_seqvar(unreified_sk_term);
                    SubLObject possibly_dotted_args = (NIL != seqvar) ? ((SubLObject) (NIL != term_args ? ((SubLObject) (add_sequence_var_to_end(seqvar, term_args))) : seqvar)) : term_args;
                    SubLObject arity_min = length(term_args);
                    if (NIL != com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_ofP(unreified_sk_term)) {
                        com.cyc.cycjava.cycl.skolems.recompute_skolem_defn(unreified_sk_term, term_args, skolem_clauses, mt, defn, arity_min);
                    }
                    {
                        SubLObject sk_defns = com.cyc.cycjava.cycl.skolems.skolem_defns_from_key_specification(arity_min, defn);
                        SubLObject sk_constant = com.cyc.cycjava.cycl.skolems.lookup_sk_constant_from_defns(defn, mt, sk_defns);
                        if (NIL != sk_constant) {
                            return cons(sk_constant, possibly_dotted_args);
                        } else {
                            if (NIL != createP) {
                                {
                                    SubLObject arg_isas = com.cyc.cycjava.cycl.skolems.skolem_arg_isa_constraints(unreified_sk_term, skolem_clauses, UNPROVIDED);
                                    SubLObject defn_unreified_sk_term = com.cyc.cycjava.cycl.skolems.defn_unreified_sk_term(unreified_sk_term, term_args, skolem_clauses);
                                    return com.cyc.cycjava.cycl.skolems.create_skolem(defn_unreified_sk_term, possibly_dotted_args, mt, defn, arg_isas);
                                }
                            } else {
                                if (NIL != list_utilities.not_equal(term_args, second(unreified_sk_term))) {
                                    return cons(unreified_sk_term.first(), cons(term_args, cddr(unreified_sk_term)));
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
     * if some skolem fn equivalent to UNREIFIED-SK-TERM has already been reified,
     * then return a new skolem nat referencing the reified skolem fn,
     * else, when CREATE? is non-nil, reify a new skolem fn
     */
    @LispMethod(comment = "if some skolem fn equivalent to UNREIFIED-SK-TERM has already been reified,\r\nthen return a new skolem nat referencing the reified skolem fn,\r\nelse, when CREATE? is non-nil, reify a new skolem fn\nif some skolem fn equivalent to UNREIFIED-SK-TERM has already been reified,\nthen return a new skolem nat referencing the reified skolem fn,\nelse, when CREATE? is non-nil, reify a new skolem fn")
    public static SubLObject canonicalize_skolem_term(final SubLObject unreified_sk_term, final SubLObject skolem_clauses, final SubLObject mt, final SubLObject createP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject defn = NIL;
        SubLObject arg_sort = NIL;
        final SubLObject sortable_skolem_clauses = replace_unreified_skolem_terms_with_variables(skolem_clauses);
        final SubLObject _prev_bind_0 = $skolem_arg_sort$.currentBinding(thread);
        try {
            $skolem_arg_sort$.bind(NIL, thread);
            defn = sk_defn_from_clauses(skolem_function_var(unreified_sk_term), sortable_skolem_clauses, symbol_function($sym15$EL_VAR_));
            arg_sort = $skolem_arg_sort$.getDynamicValue(thread);
        } finally {
            $skolem_arg_sort$.rebind(_prev_bind_0, thread);
        }
        final SubLObject term_args = skolem_args(unreified_sk_term, skolem_clauses, arg_sort);
        final SubLObject seqvar = skolem_seqvar(unreified_sk_term);
        final SubLObject possibly_dotted_args = (NIL != seqvar) ? NIL != term_args ? add_sequence_var_to_end(seqvar, term_args) : seqvar : term_args;
        final SubLObject arity_min = length(term_args);
        if (NIL != recomputing_skolem_defn_ofP(unreified_sk_term)) {
            recompute_skolem_defn(unreified_sk_term, term_args, skolem_clauses, mt, defn, arity_min);
        }
        final SubLObject sk_defns = skolem_defns_from_key_specification(arity_min, defn);
        final SubLObject sk_constant = lookup_sk_constant_from_defns(defn, mt, sk_defns);
        if (NIL != sk_constant) {
            return cons(sk_constant, possibly_dotted_args);
        }
        if (NIL != createP) {
            final SubLObject arg_isas = skolem_arg_isa_constraints(unreified_sk_term, skolem_clauses, UNPROVIDED);
            final SubLObject defn_unreified_sk_term = defn_unreified_sk_term(unreified_sk_term, term_args, skolem_clauses);
            return create_skolem(defn_unreified_sk_term, possibly_dotted_args, mt, defn, arg_isas);
        }
        if (NIL != list_utilities.not_equal(term_args, second(unreified_sk_term))) {
            return cons(unreified_sk_term.first(), cons(term_args, cddr(unreified_sk_term)));
        }
        return NIL;
    }

    public static final SubLObject replace_unreified_skolem_terms_with_variables_alt(SubLObject v_clauses) {
        return transform_list_utilities.transform(v_clauses, $sym16$UNREIFIED_SKOLEM_TERM_, SKOLEM_FUNCTION_VAR, UNPROVIDED);
    }

    public static SubLObject replace_unreified_skolem_terms_with_variables(final SubLObject v_clauses) {
        return transform_list_utilities.transform(v_clauses, $sym16$UNREIFIED_SKOLEM_TERM_, SKOLEM_FUNCTION_VAR, UNPROVIDED);
    }

    public static final SubLObject lookup_sk_constant_from_defns_alt(SubLObject defn, SubLObject mt, SubLObject sk_defns) {
        {
            SubLObject sk_constant = NIL;
            if (NIL == sk_constant) {
                {
                    SubLObject csome_list_var = sk_defns;
                    SubLObject sk_defn = NIL;
                    for (sk_defn = csome_list_var.first(); !((NIL != sk_constant) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sk_defn = csome_list_var.first()) {
                        {
                            SubLObject datum = sk_defn;
                            SubLObject current = datum;
                            SubLObject old_sk_constant = NIL;
                            SubLObject old_unreified_sk_term = NIL;
                            SubLObject sk_mt = NIL;
                            SubLObject old_defn = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt18);
                            old_sk_constant = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt18);
                            old_unreified_sk_term = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt18);
                            sk_mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt18);
                            old_defn = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (defn.equal(old_defn) && (NIL != hlmt.hlmt_equalP(mt, sk_mt))) {
                                    sk_constant = old_sk_constant;
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt18);
                            }
                        }
                    }
                }
            }
            return sk_constant;
        }
    }

    public static SubLObject lookup_sk_constant_from_defns(final SubLObject defn, final SubLObject mt, final SubLObject sk_defns) {
        SubLObject sk_constant = NIL;
        if (NIL == sk_constant) {
            SubLObject csome_list_var = sk_defns;
            SubLObject sk_defn = NIL;
            sk_defn = csome_list_var.first();
            while ((NIL == sk_constant) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = sk_defn;
                SubLObject old_sk_constant = NIL;
                SubLObject old_unreified_sk_term = NIL;
                SubLObject sk_mt = NIL;
                SubLObject old_defn = NIL;
                destructuring_bind_must_consp(current, datum, $list18);
                old_sk_constant = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list18);
                old_unreified_sk_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list18);
                sk_mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list18);
                old_defn = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (defn.equal(old_defn) && (NIL != hlmt.hlmt_equalP(mt, sk_mt))) {
                        sk_constant = old_sk_constant;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list18);
                }
                csome_list_var = csome_list_var.rest();
                sk_defn = csome_list_var.first();
            } 
        }
        return sk_constant;
    }

    public static final SubLObject defn_unreified_sk_term_alt(SubLObject unreified_sk_term, SubLObject args, SubLObject skolem_clauses) {
        return list_utilities.replace_nth(ONE_INTEGER, args, czer_main.el_nununiquify_vars_wrt(unreified_sk_term, skolem_clauses));
    }

    public static SubLObject defn_unreified_sk_term(final SubLObject unreified_sk_term, final SubLObject args, final SubLObject skolem_clauses) {
        return list_utilities.replace_nth(ONE_INTEGER, args, czer_main.el_nununiquify_vars_wrt(unreified_sk_term, skolem_clauses));
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static final SubLObject skolem_collection_alt(SubLObject unreified_sk_term) {
        return NIL != com.cyc.cycjava.cycl.skolems.skolem_number(unreified_sk_term) ? ((SubLObject) (NIL != com.cyc.cycjava.cycl.skolems.skolem_seqvar(unreified_sk_term) ? ((SubLObject) (NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ? ((SubLObject) ($$VariableAritySkolemFuncN)) : $$SkolemFuncN)) : NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ? ((SubLObject) ($$FixedAritySkolemFuncN)) : $$SkolemFuncN)) : NIL != com.cyc.cycjava.cycl.skolems.skolem_seqvar(unreified_sk_term) ? ((SubLObject) (NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ? ((SubLObject) ($$VariableAritySkolemFunction)) : $$SkolemFunction)) : NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ? ((SubLObject) ($$FixedAritySkolemFunction)) : $$SkolemFunction;
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static SubLObject skolem_collection(final SubLObject unreified_sk_term) {
        return NIL != skolem_number(unreified_sk_term) ? NIL != skolem_seqvar(unreified_sk_term) ? NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ? $$VariableAritySkolemFuncN : $$SkolemFuncN : NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ? $$FixedAritySkolemFuncN : $$SkolemFuncN : NIL != skolem_seqvar(unreified_sk_term) ? NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ? $$VariableAritySkolemFunction : $$SkolemFunction : NIL != czer_vars.$el_supports_variable_arity_skolemsP$.getGlobalValue() ? $$FixedAritySkolemFunction : $$SkolemFunction;
    }

    public static final SubLObject create_skolem_alt(SubLObject unreified_sk_term, SubLObject args, SubLObject mt, SubLObject cnfs, SubLObject arg_types) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject skolem = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        {
                            SubLObject tl_cnfs = canon_tl.convert_assertions_to_tl_ist_formulas(cnfs);
                            skolem = fi.fi_create_skolem(constants_high.make_skolem_id(), unreified_sk_term, mt, tl_cnfs, arg_types);
                            czer_vars.$subordinate_fi_opsP$.setDynamicValue(T, thread);
                            if (NIL != skolem) {
                                fi.fi_timestamp_constant(operation_communication.the_cyclist(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), fi.ke_purpose(), numeric_date_utilities.get_universal_second(UNPROVIDED));
                            }
                        }
                    } finally {
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
                return cons(skolem, args);
            }
        }
    }

    public static SubLObject create_skolem(final SubLObject unreified_sk_term, final SubLObject args, final SubLObject mt, final SubLObject cnfs, final SubLObject arg_types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject skolem = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            final SubLObject tl_cnfs = canon_tl.convert_assertions_to_tl_ist_formulas(cnfs);
            skolem = fi.fi_create_skolem(constants_high.make_skolem_id(), unreified_sk_term, mt, tl_cnfs, arg_types);
            czer_vars.$subordinate_fi_opsP$.setDynamicValue(T, thread);
            if (NIL != skolem) {
                fi.fi_timestamp_constant(operation_communication.the_cyclist(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), fi.ke_purpose(), numeric_date_utilities.get_universal_second(UNPROVIDED));
            }
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return cons(skolem, args);
    }

    public static final SubLObject sk_defn_from_clauses_alt(SubLObject unreified_sk_term, SubLObject v_clauses, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject sorted_clauses = NIL;
                {
                    SubLObject cdolist_list_var = v_clauses;
                    SubLObject clause = NIL;
                    for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                        sorted_clauses = cons(czer_main.canonicalize_skolem_clause(clause, UNPROVIDED), sorted_clauses);
                    }
                }
                if (NIL == czer_vars.$control_2$.getDynamicValue(thread)) {
                    sorted_clauses = subst(com.cyc.cycjava.cycl.skolems.sk_defn_var(), unreified_sk_term, sorted_clauses, symbol_function(EQUAL), UNPROVIDED);
                }
                sorted_clauses = com.cyc.cycjava.cycl.skolems.alpha_sort_clauses(nreverse(sorted_clauses));
                {
                    SubLObject cdolist_list_var = sorted_clauses;
                    SubLObject clause = NIL;
                    for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                        result = cons(com.cyc.cycjava.cycl.skolems.rename_skolem_clause_vars(unreified_sk_term, clause, varP), result);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static SubLObject sk_defn_from_clauses(final SubLObject unreified_sk_term, final SubLObject v_clauses, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject sorted_clauses = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sorted_clauses = cons(czer_main.canonicalize_skolem_clause(clause, UNPROVIDED), sorted_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        if (NIL == czer_vars.$control_2$.getDynamicValue(thread)) {
            sorted_clauses = subst(sk_defn_var(), unreified_sk_term, sorted_clauses, symbol_function(EQUAL), UNPROVIDED);
        }
        sorted_clauses = cdolist_list_var = alpha_sort_clauses(nreverse(sorted_clauses));
        clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(rename_skolem_clause_vars(unreified_sk_term, clause, varP), result);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject alpha_sort_clauses_alt(SubLObject v_clauses) {
        if (NIL != list_utilities.singletonP(v_clauses)) {
            return v_clauses;
        } else {
            return Sort.stable_sort(copy_list(v_clauses), symbol_function($sym23$STRING_), symbol_function(FORMULA_CONSTANT_STR));
        }
    }

    public static SubLObject alpha_sort_clauses(final SubLObject v_clauses) {
        if (NIL != list_utilities.singletonP(v_clauses)) {
            return v_clauses;
        }
        return Sort.stable_sort(copy_list(v_clauses), symbol_function($sym23$STRING_), symbol_function(FORMULA_CONSTANT_STR));
    }

    public static final SubLObject rename_skolem_clause_vars_alt(SubLObject unreified_sk_term, SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_new = com.cyc.cycjava.cycl.skolems.sk_defn_var();
                SubLObject blist = list(cons(unreified_sk_term, v_new));
                SubLObject count = ONE_INTEGER;
                SubLObject cdolist_list_var = clausifier.sort_vars(clause_utilities.clause_variables(clause, varP));
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    if (!(var.equal(unreified_sk_term) || var.equal(com.cyc.cycjava.cycl.skolems.sk_defn_var()))) {
                        if (NIL == assoc(var, $skolem_arg_sort$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)) {
                            $skolem_arg_sort$.setDynamicValue(cons(cons(var, count), $skolem_arg_sort$.getDynamicValue(thread)), thread);
                        }
                        v_new = czer_utilities.get_nth_canonical_variable(count, $EL_VAR);
                        count = add(count, ONE_INTEGER);
                        blist = cons(cons(var, v_new), blist);
                    }
                }
                return sublis(blist, clause, symbol_function(EQUAL), UNPROVIDED);
            }
        }
    }

    public static SubLObject rename_skolem_clause_vars(final SubLObject unreified_sk_term, final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym15$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_new = sk_defn_var();
        SubLObject blist = list(cons(unreified_sk_term, v_new));
        SubLObject count = ONE_INTEGER;
        SubLObject cdolist_list_var = clausifier.sort_vars(clause_utilities.clause_variables(clause, varP));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!var.equal(unreified_sk_term)) && (!var.equal(sk_defn_var()))) {
                if (NIL == assoc(var, $skolem_arg_sort$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)) {
                    $skolem_arg_sort$.setDynamicValue(cons(cons(var, count), $skolem_arg_sort$.getDynamicValue(thread)), thread);
                }
                v_new = czer_utilities.get_nth_canonical_variable(count, $EL_VAR);
                count = add(count, ONE_INTEGER);
                blist = cons(cons(var, v_new), blist);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return sublis(blist, clause, symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject sk_defn_var_alt() {
        return czer_utilities.get_nth_canonical_variable(ZERO_INTEGER, $EL_VAR);
    }

    public static SubLObject sk_defn_var() {
        return czer_utilities.get_nth_canonical_variable(ZERO_INTEGER, $EL_VAR);
    }

    public static final SubLObject clear_formula_constant_str_alt() {
        {
            SubLObject cs = $formula_constant_str_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_formula_constant_str() {
        final SubLObject cs = $formula_constant_str_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_formula_constant_str_alt(SubLObject formula) {
        return memoization_state.caching_state_remove_function_results_with_args($formula_constant_str_caching_state$.getGlobalValue(), list(formula), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_formula_constant_str(final SubLObject formula) {
        return memoization_state.caching_state_remove_function_results_with_args($formula_constant_str_caching_state$.getGlobalValue(), list(formula), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject formula_constant_str_internal_alt(SubLObject formula) {
        return string_utilities.str(formula_non_var_symbols(formula, symbol_function($sym26$CYC_VAR_EXCEPT_FOR_X_0_)));
    }

    public static SubLObject formula_constant_str_internal(final SubLObject formula) {
        return string_utilities.str(formula_non_var_symbols(formula, symbol_function($sym26$CYC_VAR_EXCEPT_FOR_X_0_)));
    }

    public static final SubLObject formula_constant_str_alt(SubLObject formula) {
        {
            SubLObject caching_state = $formula_constant_str_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(FORMULA_CONSTANT_STR, $formula_constant_str_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$64);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, formula, $kw29$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw29$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.skolems.formula_constant_str_internal(formula)));
                    memoization_state.caching_state_put(caching_state, formula, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject formula_constant_str(final SubLObject formula) {
        SubLObject caching_state = $formula_constant_str_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FORMULA_CONSTANT_STR, $formula_constant_str_caching_state$, $int$512, EQUAL, ONE_INTEGER, $int$64);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, formula, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(formula_constant_str_internal(formula)));
            memoization_state.caching_state_put(caching_state, formula, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * We pinned the position of ?X-0 down by the unreified-sk-term, so we can treat it as a non-var.
     */
    @LispMethod(comment = "We pinned the position of ?X-0 down by the unreified-sk-term, so we can treat it as a non-var.")
    public static final SubLObject cyc_var_except_for_x_0P_alt(SubLObject v_object) {
        if ($sym30$_X_0.eql(v_object)) {
            return NIL;
        } else {
            return cycl_variables.cyc_varP(v_object);
        }
    }

    /**
     * We pinned the position of ?X-0 down by the unreified-sk-term, so we can treat it as a non-var.
     */
    @LispMethod(comment = "We pinned the position of ?X-0 down by the unreified-sk-term, so we can treat it as a non-var.")
    public static SubLObject cyc_var_except_for_x_0P(final SubLObject v_object) {
        if ($sym30$_X_0.eql(v_object)) {
            return NIL;
        }
        return cycl_variables.cyc_varP(v_object);
    }

    public static final SubLObject make_sk_defn_alt(SubLObject sk_constant, SubLObject unreified_sk_term, SubLObject mt, SubLObject cnfs) {
        return list(sk_constant, unreified_sk_term, mt, cnfs);
    }

    public static SubLObject make_sk_defn(final SubLObject sk_constant, final SubLObject unreified_sk_term, final SubLObject mt, final SubLObject cnfs) {
        return list(sk_constant, unreified_sk_term, mt, cnfs);
    }

    public static final SubLObject sk_arity_alt(SubLObject sk_args, SubLObject sk_number) {
        if (sk_number == UNPROVIDED) {
            sk_number = NIL;
        }
        if (NIL != sk_number) {
            return add(ONE_INTEGER, length(sk_args));
        } else {
            return length(sk_args);
        }
    }

    public static SubLObject sk_arity(final SubLObject sk_args, SubLObject sk_number) {
        if (sk_number == UNPROVIDED) {
            sk_number = NIL;
        }
        if (NIL != sk_number) {
            return add(ONE_INTEGER, length(sk_args));
        }
        return length(sk_args);
    }

    public static final SubLObject make_unreified_sk_nat_alt(SubLObject sk_args, SubLObject sk_var, SubLObject sk_seqvar, SubLObject sk_number) {
        if (NIL != sk_number) {
            return list($$SkolemFuncNFn, sk_args, sk_var, sk_seqvar, sk_number);
        } else {
            return list($$SkolemFunctionFn, sk_args, sk_var, sk_seqvar);
        }
    }

    public static SubLObject make_unreified_sk_nat(final SubLObject sk_args, final SubLObject sk_var, final SubLObject sk_seqvar, final SubLObject sk_number) {
        if (NIL != sk_number) {
            return list($$SkolemFuncNFn, sk_args, sk_var, sk_seqvar, sk_number);
        }
        return list($$SkolemFunctionFn, sk_args, sk_var, sk_seqvar);
    }

    public static final SubLObject skolem_defn_alt(SubLObject skolem) {
        {
            SubLObject v_answer = NIL;
            SubLObject catch_var = NIL;
            try {
                {
                    SubLObject key = NIL;
                    SubLObject v_defns = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                v_defns = getEntryValue(cdohash_entry);
                                {
                                    SubLObject cdolist_list_var = v_defns;
                                    SubLObject defn = NIL;
                                    for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                        if (defn.first() == skolem) {
                                            v_answer = defn;
                                            mapping_finished();
                                        }
                                    }
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
            return v_answer;
        }
    }

    public static SubLObject skolem_defn(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            SubLObject key = NIL;
            SubLObject v_defns = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    SubLObject cdolist_list_var;
                    v_defns = cdolist_list_var = getEntryValue(cdohash_entry);
                    SubLObject defn = NIL;
                    defn = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (defn.first().eql(skolem)) {
                            v_answer = defn;
                            mapping_finished();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        defn = cdolist_list_var.first();
                    } 
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return v_answer;
    }

    public static final SubLObject skolem_defnXkey_alt(SubLObject skolem) {
        {
            SubLObject v_answer = NIL;
            SubLObject catch_var = NIL;
            try {
                {
                    SubLObject key = NIL;
                    SubLObject v_defns = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                v_defns = getEntryValue(cdohash_entry);
                                {
                                    SubLObject cdolist_list_var = v_defns;
                                    SubLObject defn = NIL;
                                    for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                        if (defn.first() == skolem) {
                                            v_answer = list(defn, key);
                                            mapping_finished();
                                        }
                                    }
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
            return v_answer;
        }
    }

    public static SubLObject skolem_defnXkey(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            SubLObject key = NIL;
            SubLObject v_defns = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    SubLObject cdolist_list_var;
                    v_defns = cdolist_list_var = getEntryValue(cdohash_entry);
                    SubLObject defn = NIL;
                    defn = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (defn.first().eql(skolem)) {
                            v_answer = list(defn, key);
                            mapping_finished();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        defn = cdolist_list_var.first();
                    } 
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return v_answer;
    }

    public static final SubLObject skolem_defn_key_alt(SubLObject skolem) {
        {
            SubLObject v_answer = NIL;
            SubLObject catch_var = NIL;
            try {
                {
                    SubLObject key = NIL;
                    SubLObject v_defns = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                key = getEntryKey(cdohash_entry);
                                v_defns = getEntryValue(cdohash_entry);
                                {
                                    SubLObject cdolist_list_var = v_defns;
                                    SubLObject defn = NIL;
                                    for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                        if (defn.first() == skolem) {
                                            v_answer = key;
                                            mapping_finished();
                                        }
                                    }
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
            }
            return v_answer;
        }
    }

    public static SubLObject skolem_defn_key(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            SubLObject key = NIL;
            SubLObject v_defns = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    SubLObject cdolist_list_var;
                    v_defns = cdolist_list_var = getEntryValue(cdohash_entry);
                    SubLObject defn = NIL;
                    defn = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (defn.first().eql(skolem)) {
                            v_answer = key;
                            mapping_finished();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        defn = cdolist_list_var.first();
                    } 
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return v_answer;
    }

    public static final SubLObject skolem_of_defn_alt(SubLObject skolem_defn) {
        return skolem_defn.first();
    }

    public static SubLObject skolem_of_defn(final SubLObject skolem_defn) {
        return skolem_defn.first();
    }

    public static final SubLObject unreified_sk_term_alt(SubLObject skolem) {
        return second(com.cyc.cycjava.cycl.skolems.skolem_defn(skolem));
    }

    public static SubLObject unreified_sk_term(final SubLObject skolem) {
        return second(skolem_defn(skolem));
    }

    public static final SubLObject skolem_defn_mt_alt(SubLObject constant) {
        return third(com.cyc.cycjava.cycl.skolems.skolem_defn(constant));
    }

    public static SubLObject skolem_defn_mt(final SubLObject constant) {
        return third(skolem_defn(constant));
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static final SubLObject skolem_seqvar_alt(SubLObject unreified_skolem_term) {
        if (NIL != com.cyc.cycjava.cycl.skolems.old_format_skolemP(unreified_skolem_term)) {
            return NIL;
        } else {
            return cycl_utilities.nat_arg3(unreified_skolem_term, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static SubLObject skolem_seqvar(final SubLObject unreified_skolem_term) {
        if (NIL != old_format_skolemP(unreified_skolem_term)) {
            return NIL;
        }
        return cycl_utilities.nat_arg3(unreified_skolem_term, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static final SubLObject skolem_defn_seqvar_alt(SubLObject skolem) {
        return com.cyc.cycjava.cycl.skolems.skolem_seqvar(com.cyc.cycjava.cycl.skolems.unreified_sk_term(skolem));
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static SubLObject skolem_defn_seqvar(final SubLObject skolem) {
        return skolem_seqvar(unreified_sk_term(skolem));
    }

    /**
     *
     *
     * @return boolean; t iff UNREIFIED-SKOLEM-TERM is a legacy skolem of the shorter format before sequence variables were introduced (2/00).
     * @unknown pace
     */
    @LispMethod(comment = "@return boolean; t iff UNREIFIED-SKOLEM-TERM is a legacy skolem of the shorter format before sequence variables were introduced (2/00).\r\n@unknown pace")
    public static final SubLObject old_format_skolemP_alt(SubLObject unreified_skolem_term) {
        if ($$SkolemFunctionFn == cycl_utilities.nat_functor(unreified_skolem_term)) {
            return formula_arityE(unreified_skolem_term, TWO_INTEGER, UNPROVIDED);
        } else {
            if ($$SkolemFuncNFn == cycl_utilities.nat_functor(unreified_skolem_term)) {
                return formula_arityE(unreified_skolem_term, THREE_INTEGER, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff UNREIFIED-SKOLEM-TERM is a legacy skolem of the shorter format before sequence variables were introduced (2/00).
     * @unknown pace
     */
    @LispMethod(comment = "@return boolean; t iff UNREIFIED-SKOLEM-TERM is a legacy skolem of the shorter format before sequence variables were introduced (2/00).\r\n@unknown pace")
    public static SubLObject old_format_skolemP(final SubLObject unreified_skolem_term) {
        if ($$SkolemFunctionFn.eql(cycl_utilities.nat_functor(unreified_skolem_term))) {
            return formula_arityE(unreified_skolem_term, TWO_INTEGER, UNPROVIDED);
        }
        if ($$SkolemFuncNFn.eql(cycl_utilities.nat_functor(unreified_skolem_term))) {
            return formula_arityE(unreified_skolem_term, THREE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static final SubLObject skolem_number_alt(SubLObject unreified_skolem_term) {
        if (NIL != com.cyc.cycjava.cycl.skolems.old_format_skolemP(unreified_skolem_term)) {
            return cycl_utilities.nat_arg3(unreified_skolem_term, UNPROVIDED);
        } else {
            return cycl_utilities.nat_arg4(unreified_skolem_term, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @unknown pace
     */
    @LispMethod(comment = "@unknown pace")
    public static SubLObject skolem_number(final SubLObject unreified_skolem_term) {
        if (NIL != old_format_skolemP(unreified_skolem_term)) {
            return cycl_utilities.nat_arg3(unreified_skolem_term, UNPROVIDED);
        }
        return cycl_utilities.nat_arg4(unreified_skolem_term, UNPROVIDED);
    }

    public static final SubLObject skolem_defn_number_alt(SubLObject skolem) {
        return com.cyc.cycjava.cycl.skolems.skolem_number(com.cyc.cycjava.cycl.skolems.unreified_sk_term(skolem));
    }

    public static SubLObject skolem_defn_number(final SubLObject skolem) {
        return skolem_number(unreified_sk_term(skolem));
    }

    public static final SubLObject skolem_defn_args_alt(SubLObject skolem) {
        return second(com.cyc.cycjava.cycl.skolems.unreified_sk_term(skolem));
    }

    public static SubLObject skolem_defn_args(final SubLObject skolem) {
        return second(unreified_sk_term(skolem));
    }

    public static final SubLObject skolem_var_alt(SubLObject skolem) {
        return com.cyc.cycjava.cycl.skolems.skolem_function_var(com.cyc.cycjava.cycl.skolems.unreified_sk_term(skolem));
    }

    public static SubLObject skolem_var(final SubLObject skolem) {
        return skolem_function_var(unreified_sk_term(skolem));
    }

    /**
     * Note: this updates old format skolems into new format skolems automatically.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Note: this updates old format skolems into new format skolems automatically.\r\n\r\n@unknown pace")
    public static final SubLObject el_unreified_sk_term_alt(SubLObject constant) {
        {
            SubLObject unreified_sk_term = com.cyc.cycjava.cycl.skolems.compute_unreified_sk_term_via_hl(constant);
            SubLObject skolem_number = com.cyc.cycjava.cycl.skolems.skolem_number(unreified_sk_term);
            if (NIL != skolem_number) {
                {
                    SubLObject datum = unreified_sk_term;
                    SubLObject current = datum;
                    SubLObject skolem_type = NIL;
                    SubLObject vars = NIL;
                    SubLObject sk_var = NIL;
                    SubLObject seqvar_or_number = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt32);
                    skolem_type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt32);
                    vars = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt32);
                    sk_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt32);
                    seqvar_or_number = current.first();
                    current = current.rest();
                    {
                        SubLObject number = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt32);
                        current = current.rest();
                        if (NIL == current) {
                            return NIL != com.cyc.cycjava.cycl.skolems.old_format_skolemP(unreified_sk_term) ? ((SubLObject) (make_el_formula(skolem_type, list(butlast(vars, UNPROVIDED), sk_var, NIL, seqvar_or_number), UNPROVIDED))) : make_el_formula(skolem_type, list(butlast(vars, UNPROVIDED), sk_var, seqvar_or_number, number), UNPROVIDED);
                        } else {
                            cdestructuring_bind_error(datum, $list_alt32);
                        }
                    }
                }
            } else {
                return NIL != com.cyc.cycjava.cycl.skolems.old_format_skolemP(unreified_sk_term) ? ((SubLObject) (list_utilities.nadd_to_end(NIL, unreified_sk_term))) : unreified_sk_term;
            }
        }
        return NIL;
    }

    /**
     * Note: this updates old format skolems into new format skolems automatically.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Note: this updates old format skolems into new format skolems automatically.\r\n\r\n@unknown pace")
    public static SubLObject el_unreified_sk_term(final SubLObject constant) {
        final SubLObject unreified_sk_term = compute_unreified_sk_term_via_hl(constant);
        final SubLObject skolem_number = skolem_number(unreified_sk_term);
        if (NIL == skolem_number) {
            return NIL != old_format_skolemP(unreified_sk_term) ? list_utilities.nadd_to_end(NIL, unreified_sk_term) : unreified_sk_term;
        }
        SubLObject current;
        final SubLObject datum = current = unreified_sk_term;
        SubLObject skolem_type = NIL;
        SubLObject vars = NIL;
        SubLObject sk_var = NIL;
        SubLObject seqvar_or_number = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        skolem_type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        sk_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list32);
        seqvar_or_number = current.first();
        current = current.rest();
        final SubLObject number = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list32);
        current = current.rest();
        if (NIL == current) {
            return NIL != old_format_skolemP(unreified_sk_term) ? make_el_formula(skolem_type, list(butlast(vars, UNPROVIDED), sk_var, NIL, seqvar_or_number), UNPROVIDED) : make_el_formula(skolem_type, list(butlast(vars, UNPROVIDED), sk_var, seqvar_or_number, number), UNPROVIDED);
        }
        cdestructuring_bind_error(datum, $list32);
        return NIL;
    }

    public static final SubLObject compute_unreified_sk_term_via_hl_alt(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject sk_args = com.cyc.cycjava.cycl.skolems.compute_skolem_info_from_assertions(skolem, com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED));
                SubLObject sk_var = thread.secondMultipleValue();
                SubLObject sk_seqvar = thread.thirdMultipleValue();
                SubLObject sk_number = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                if (NIL != sk_var) {
                    {
                        SubLObject args = clausifier.sort_vars(sk_args);
                        SubLObject sk_defn_args = (NIL != sk_number) ? ((SubLObject) (nreverse(cons(sk_number, nreverse(args))))) : args;
                        SubLObject unreified_sk_term = com.cyc.cycjava.cycl.skolems.make_unreified_sk_nat(sk_defn_args, sk_var, sk_seqvar, sk_number);
                        return unreified_sk_term;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_unreified_sk_term_via_hl(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sk_args = compute_skolem_info_from_assertions(skolem, skolem_defn_assertions(skolem, UNPROVIDED));
        final SubLObject sk_var = thread.secondMultipleValue();
        final SubLObject sk_seqvar = thread.thirdMultipleValue();
        final SubLObject sk_number = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (NIL != sk_var) {
            final SubLObject args = clausifier.sort_vars(sk_args);
            final SubLObject sk_defn_args = (NIL != sk_number) ? nreverse(cons(sk_number, nreverse(args))) : args;
            final SubLObject unreified_sk_term = make_unreified_sk_nat(sk_defn_args, sk_var, sk_seqvar, sk_number);
            return unreified_sk_term;
        }
        return NIL;
    }

    public static final SubLObject compute_skolem_info_from_assertions_alt(SubLObject skolem, SubLObject assertions) {
        {
            SubLObject cnfs = NIL;
            SubLObject args = NIL;
            SubLObject sk_args = NIL;
            SubLObject sk_var = NIL;
            SubLObject sk_seqvar = NIL;
            SubLObject sk_number = NIL;
            SubLObject generate_sk_varP = NIL;
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                {
                    SubLObject cnf = fi.assertion_cnf_with_el_vars(assertion);
                    SubLObject tou_lits = uncanonicalizer.tou_lits_to_remove(cnf);
                    SubLObject pos_lits = NIL;
                    SubLObject neg_lits = NIL;
                    SubLObject sk_cnf = NIL;
                    if ((NIL == tou_lits) && (arity.arity(skolem) == ZERO_INTEGER)) {
                        cnfs = cons(cnf, cnfs);
                        generate_sk_varP = T;
                    } else {
                        pos_lits = set_difference(clauses.pos_lits(cnf), tou_lits, symbol_function(EQUAL), UNPROVIDED);
                        neg_lits = set_difference(clauses.neg_lits(cnf), tou_lits, symbol_function(EQUAL), UNPROVIDED);
                        sk_cnf = clauses.make_cnf(neg_lits, pos_lits);
                        {
                            SubLObject cdolist_list_var_1 = tou_lits;
                            SubLObject lit = NIL;
                            for (lit = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , lit = cdolist_list_var_1.first()) {
                                if (NIL == term.reified_skolem_termP(literal_arg2(lit, UNPROVIDED))) {
                                    sk_cnf = subst(literal_arg2(lit, UNPROVIDED), literal_arg1(lit, UNPROVIDED), sk_cnf, symbol_function(EQUAL), UNPROVIDED);
                                }
                            }
                        }
                        {
                            SubLObject cdolist_list_var_2 = tou_lits;
                            SubLObject lit = NIL;
                            for (lit = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , lit = cdolist_list_var_2.first()) {
                                if (skolem == cycl_utilities.nat_functor(literal_arg2(lit, UNPROVIDED))) {
                                    if (NIL == sk_var) {
                                        sk_var = literal_arg1(lit, UNPROVIDED);
                                        if (NIL == args) {
                                            args = cycl_utilities.nat_args(literal_arg2(lit, UNPROVIDED), UNPROVIDED);
                                            {
                                                SubLObject seqvar = sequence_var(literal_arg2(lit, UNPROVIDED), UNPROVIDED);
                                                if (NIL != seqvar) {
                                                    if ((NIL != sk_seqvar) && (!seqvar.eql(sk_seqvar))) {
                                                        Errors.warn($str_alt33$Multiple_skolem_sequence_variable, skolem, sk_seqvar, seqvar);
                                                    } else {
                                                        sk_seqvar = seqvar;
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject cdolist_list_var_3 = args;
                                                SubLObject arg = NIL;
                                                for (arg = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , arg = cdolist_list_var_3.first()) {
                                                    if (NIL != collection_defns.el_variableP(arg)) {
                                                        sk_args = cons(arg, sk_args);
                                                    } else {
                                                        if ((NIL != com.cyc.cycjava.cycl.skolems.skolem_scalar_termP(arg, assertions_high.assertion_mt(assertion))) && arg.equal(list_utilities.last_one(args))) {
                                                            if (NIL == sk_number) {
                                                                sk_number = arg;
                                                            }
                                                        } else {
                                                            Errors.warn($str_alt34$SkolemFuncN_appears_as_SkolemFunc, skolem);
                                                            sk_args = cons(arg, sk_args);
                                                        }
                                                    }
                                                }
                                            }
                                            sk_args = nreverse(sk_args);
                                        }
                                    }
                                }
                            }
                        }
                        cnfs = cons(sk_cnf, cnfs);
                    }
                }
            }
            cnfs = nreverse(cnfs);
            if (NIL != generate_sk_varP) {
                if (NIL == sk_var) {
                    {
                        SubLObject skolem_nart = narts_high.find_nart(list(skolem));
                        if (NIL != skolem_nart) {
                            sk_var = czer_utilities.unique_el_var_wrt_expression(cnfs, UNPROVIDED);
                            if (!$sym35$_X.eql(sk_var)) {
                                print(sk_var, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return values(sk_args, sk_var, sk_seqvar, sk_number);
        }
    }

    public static SubLObject compute_skolem_info_from_assertions(final SubLObject skolem, final SubLObject assertions) {
        SubLObject cnfs = NIL;
        SubLObject args = NIL;
        SubLObject sk_args = NIL;
        SubLObject sk_var = NIL;
        SubLObject sk_seqvar = NIL;
        SubLObject sk_number = NIL;
        SubLObject generate_sk_varP = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cnf = fi.assertion_cnf_with_el_vars(assertion);
            final SubLObject tou_lits = uncanonicalizer.tou_lits_to_remove(cnf);
            SubLObject pos_lits = NIL;
            SubLObject neg_lits = NIL;
            SubLObject sk_cnf = NIL;
            if ((NIL == tou_lits) && arity.arity(skolem).eql(ZERO_INTEGER)) {
                cnfs = cons(cnf, cnfs);
                generate_sk_varP = T;
            } else {
                pos_lits = set_difference(clauses.pos_lits(cnf), tou_lits, symbol_function(EQUAL), UNPROVIDED);
                neg_lits = set_difference(clauses.neg_lits(cnf), tou_lits, symbol_function(EQUAL), UNPROVIDED);
                sk_cnf = clauses.make_cnf(neg_lits, pos_lits);
                SubLObject cdolist_list_var_$1 = tou_lits;
                SubLObject lit = NIL;
                lit = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if (NIL == term.reified_skolem_termP(literal_arg2(lit, UNPROVIDED))) {
                        sk_cnf = subst(literal_arg2(lit, UNPROVIDED), literal_arg1(lit, UNPROVIDED), sk_cnf, symbol_function(EQUAL), UNPROVIDED);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    lit = cdolist_list_var_$1.first();
                } 
                SubLObject cdolist_list_var_$2 = tou_lits;
                lit = NIL;
                lit = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    if (skolem.eql(cycl_utilities.nat_functor(literal_arg2(lit, UNPROVIDED))) && (NIL == sk_var)) {
                        sk_var = literal_arg1(lit, UNPROVIDED);
                        if (NIL == args) {
                            args = cycl_utilities.nat_args(literal_arg2(lit, UNPROVIDED), UNPROVIDED);
                            final SubLObject seqvar = sequence_var(literal_arg2(lit, UNPROVIDED), UNPROVIDED);
                            if (NIL != seqvar) {
                                if ((NIL != sk_seqvar) && (!seqvar.eql(sk_seqvar))) {
                                    Errors.warn($str33$Multiple_skolem_sequence_variable, skolem, sk_seqvar, seqvar);
                                } else {
                                    sk_seqvar = seqvar;
                                }
                            }
                            SubLObject cdolist_list_var_$3 = args;
                            SubLObject arg = NIL;
                            arg = cdolist_list_var_$3.first();
                            while (NIL != cdolist_list_var_$3) {
                                if (NIL != collection_defns.el_variableP(arg)) {
                                    sk_args = cons(arg, sk_args);
                                } else
                                    if ((NIL != skolem_scalar_termP(arg, assertions_high.assertion_mt(assertion))) && arg.equal(list_utilities.last_one(args))) {
                                        if (NIL == sk_number) {
                                            sk_number = arg;
                                        }
                                    } else {
                                        Errors.warn($str34$SkolemFuncN_appears_as_SkolemFunc, skolem);
                                        sk_args = cons(arg, sk_args);
                                    }

                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                arg = cdolist_list_var_$3.first();
                            } 
                            sk_args = nreverse(sk_args);
                        }
                    }
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    lit = cdolist_list_var_$2.first();
                } 
                cnfs = cons(sk_cnf, cnfs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        cnfs = nreverse(cnfs);
        if ((NIL != generate_sk_varP) && (NIL == sk_var)) {
            final SubLObject skolem_nart = narts_high.find_nart(list(skolem));
            if (NIL != skolem_nart) {
                sk_var = czer_utilities.unique_el_var_wrt_expression(cnfs, UNPROVIDED);
                if (!$sym35$_X.eql(sk_var)) {
                    print(sk_var, UNPROVIDED);
                }
            }
        }
        return values(sk_args, sk_var, sk_seqvar, sk_number);
    }

    public static final SubLObject skolem_table_key_from_defn_alt(SubLObject defn) {
        if (NIL != defn) {
            {
                SubLObject datum = defn;
                SubLObject current = datum;
                SubLObject sk_constant = NIL;
                SubLObject unreified_sk_term = NIL;
                SubLObject mt = NIL;
                SubLObject cnfs = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt36);
                sk_constant = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt36);
                unreified_sk_term = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt36);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt36);
                cnfs = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sk_args = second(unreified_sk_term);
                        return com.cyc.cycjava.cycl.skolems.skolem_hash_key(length(sk_args), cnfs);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt36);
                }
            }
        }
        return NIL;
    }

    public static SubLObject skolem_table_key_from_defn(final SubLObject defn) {
        if (NIL != defn) {
            SubLObject sk_constant = NIL;
            SubLObject unreified_sk_term = NIL;
            SubLObject mt = NIL;
            SubLObject cnfs = NIL;
            destructuring_bind_must_consp(defn, defn, $list36);
            sk_constant = defn.first();
            SubLObject current = defn.rest();
            destructuring_bind_must_consp(current, defn, $list36);
            unreified_sk_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, defn, $list36);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, defn, $list36);
            cnfs = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject sk_args = second(unreified_sk_term);
                return skolem_hash_key(length(sk_args), cnfs);
            }
            cdestructuring_bind_error(defn, $list36);
        }
        return NIL;
    }

    public static final SubLObject skolem_table_key_from_constant_alt(SubLObject skolem) {
        return com.cyc.cycjava.cycl.skolems.skolem_table_key_from_defn(com.cyc.cycjava.cycl.skolems.skolem_defn(skolem));
    }

    public static SubLObject skolem_table_key_from_constant(final SubLObject skolem) {
        return skolem_table_key_from_defn(skolem_defn(skolem));
    }

    public static final SubLObject skolem_hash_key_alt(SubLObject v_arity, SubLObject skolem_clauses) {
        return cons(v_arity, czer_main.fort_sort_by_type_and_id(cycl_utilities.formula_forts(com.cyc.cycjava.cycl.skolems.opaquify_unreified_skolem_terms(skolem_clauses), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject skolem_hash_key(final SubLObject v_arity, final SubLObject skolem_clauses) {
        return cons(v_arity, czer_main.fort_sort_by_type_and_id(cycl_utilities.formula_forts(opaquify_unreified_skolem_terms(skolem_clauses), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject opaquify_unreified_skolem_terms_alt(SubLObject v_clauses) {
        return transform_list_utilities.transform(v_clauses, $sym16$UNREIFIED_SKOLEM_TERM_, FALSE, UNPROVIDED);
    }

    public static SubLObject opaquify_unreified_skolem_terms(final SubLObject v_clauses) {
        return transform_list_utilities.transform(v_clauses, $sym16$UNREIFIED_SKOLEM_TERM_, FALSE, UNPROVIDED);
    }

    public static final SubLObject skolem_defns_from_key_specification_alt(SubLObject v_arity, SubLObject skolem_clauses) {
        {
            SubLObject key = com.cyc.cycjava.cycl.skolems.skolem_hash_key(v_arity, skolem_clauses);
            SubLObject v_defns = gethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED);
            SubLObject ort_key = cons(v_arity, czer_main.fort_sort_by_type_and_id(cycl_utilities.formula_constants(skolem_clauses, UNPROVIDED)));
            SubLObject ort_defns = gethash(ort_key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED);
            if (NIL != ort_defns) {
                return append(v_defns, ort_defns);
            } else {
                return v_defns;
            }
        }
    }

    public static SubLObject skolem_defns_from_key_specification(final SubLObject v_arity, final SubLObject skolem_clauses) {
        final SubLObject key = skolem_hash_key(v_arity, skolem_clauses);
        final SubLObject v_defns = gethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED);
        final SubLObject ort_key = cons(v_arity, czer_main.fort_sort_by_type_and_id(cycl_utilities.formula_constants(skolem_clauses, UNPROVIDED)));
        final SubLObject ort_defns = gethash(ort_key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED);
        if (NIL != ort_defns) {
            return append(v_defns, ort_defns);
        }
        return v_defns;
    }

    public static final SubLObject cnfs_of_skolem_defn_alt(SubLObject skolem_defn) {
        {
            SubLObject datum = skolem_defn;
            SubLObject current = datum;
            SubLObject sk_constant = NIL;
            SubLObject unreified_sk_term = NIL;
            SubLObject mt = NIL;
            SubLObject cnfs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            sk_constant = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            unreified_sk_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            cnfs = current.first();
            current = current.rest();
            if (NIL == current) {
                return cnfs;
            } else {
                cdestructuring_bind_error(datum, $list_alt36);
            }
        }
        return NIL;
    }

    public static SubLObject cnfs_of_skolem_defn(final SubLObject skolem_defn) {
        SubLObject sk_constant = NIL;
        SubLObject unreified_sk_term = NIL;
        SubLObject mt = NIL;
        SubLObject cnfs = NIL;
        destructuring_bind_must_consp(skolem_defn, skolem_defn, $list36);
        sk_constant = skolem_defn.first();
        SubLObject current = skolem_defn.rest();
        destructuring_bind_must_consp(current, skolem_defn, $list36);
        unreified_sk_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, skolem_defn, $list36);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, skolem_defn, $list36);
        cnfs = current.first();
        current = current.rest();
        if (NIL == current) {
            return cnfs;
        }
        cdestructuring_bind_error(skolem_defn, $list36);
        return NIL;
    }

    public static final SubLObject mt_of_skolem_defn_alt(SubLObject skolem_defn) {
        {
            SubLObject datum = skolem_defn;
            SubLObject current = datum;
            SubLObject sk_constant = NIL;
            SubLObject unreified_sk_term = NIL;
            SubLObject mt = NIL;
            SubLObject cnfs = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            sk_constant = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            unreified_sk_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt36);
            cnfs = current.first();
            current = current.rest();
            if (NIL == current) {
                return mt;
            } else {
                cdestructuring_bind_error(datum, $list_alt36);
            }
        }
        return NIL;
    }

    public static SubLObject mt_of_skolem_defn(final SubLObject skolem_defn) {
        SubLObject sk_constant = NIL;
        SubLObject unreified_sk_term = NIL;
        SubLObject mt = NIL;
        SubLObject cnfs = NIL;
        destructuring_bind_must_consp(skolem_defn, skolem_defn, $list36);
        sk_constant = skolem_defn.first();
        SubLObject current = skolem_defn.rest();
        destructuring_bind_must_consp(current, skolem_defn, $list36);
        unreified_sk_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, skolem_defn, $list36);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, skolem_defn, $list36);
        cnfs = current.first();
        current = current.rest();
        if (NIL == current) {
            return mt;
        }
        cdestructuring_bind_error(skolem_defn, $list36);
        return NIL;
    }

    public static final SubLObject skolem_defn_cnfs_alt(SubLObject skolem) {
        {
            SubLObject cnfs = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                {
                    SubLObject item_var = assertions_high.assertion_cnf(assertion);
                    if (NIL == member(item_var, cnfs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        cnfs = cons(item_var, cnfs);
                    }
                }
            }
            return nreverse(cnfs);
        }
    }

    public static SubLObject skolem_defn_cnfs(final SubLObject skolem) {
        SubLObject cnfs = NIL;
        SubLObject cdolist_list_var = skolem_defn_assertions(skolem, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = assertions_high.assertion_cnf(assertion);
            if (NIL == member(item_var, cnfs, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                cnfs = cons(item_var, cnfs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return nreverse(cnfs);
    }

    /**
     * A version of @xref skolem-defn-assertions that ignores errors, and
     * if the skolem defn assertions are NIL, returns all rules on the skolem.
     * That's not correct, especially not for zero-arity skolems, but it's strictly better than NIL.
     */
    @LispMethod(comment = "A version of @xref skolem-defn-assertions that ignores errors, and\r\nif the skolem defn assertions are NIL, returns all rules on the skolem.\r\nThat\'s not correct, especially not for zero-arity skolems, but it\'s strictly better than NIL.\nA version of @xref skolem-defn-assertions that ignores errors, and\nif the skolem defn assertions are NIL, returns all rules on the skolem.\nThat\'s not correct, especially not for zero-arity skolems, but it\'s strictly better than NIL.")
    public static final SubLObject skolem_defn_assertions_robust_alt(SubLObject skolem, SubLObject printP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                result = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, printP);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                if (NIL == result) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            result = kb_mapping.gather_function_rule_index(skolem, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * A version of @xref skolem-defn-assertions that ignores errors, and
     * if the skolem defn assertions are NIL, returns all rules on the skolem.
     * That's not correct, especially not for zero-arity skolems, but it's strictly better than NIL.
     */
    @LispMethod(comment = "A version of @xref skolem-defn-assertions that ignores errors, and\r\nif the skolem defn assertions are NIL, returns all rules on the skolem.\r\nThat\'s not correct, especially not for zero-arity skolems, but it\'s strictly better than NIL.\nA version of @xref skolem-defn-assertions that ignores errors, and\nif the skolem defn assertions are NIL, returns all rules on the skolem.\nThat\'s not correct, especially not for zero-arity skolems, but it\'s strictly better than NIL.")
    public static SubLObject skolem_defn_assertions_robust(final SubLObject skolem, SubLObject printP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = skolem_defn_assertions(skolem, printP);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == result) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                result = kb_mapping.gather_function_rule_index(skolem, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static final SubLObject skolem_function_has_no_defn_assertions_robustP_alt(SubLObject skolem_function) {
        return sublisp_null(com.cyc.cycjava.cycl.skolems.skolem_defn_assertions_robust(skolem_function, UNPROVIDED));
    }

    public static SubLObject skolem_function_has_no_defn_assertions_robustP(final SubLObject skolem_function) {
        return sublisp_null(skolem_defn_assertions_robust(skolem_function, UNPROVIDED));
    }

    public static final SubLObject skolem_function_has_no_defn_assertionsP_alt(SubLObject skolem_function) {
        return sublisp_null(com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem_function, UNPROVIDED));
    }

    public static SubLObject skolem_function_has_no_defn_assertionsP(final SubLObject skolem_function) {
        return sublisp_null(skolem_defn_assertions(skolem_function, UNPROVIDED));
    }

    public static final SubLObject skolem_defining_bookkeeping_assertion_alt(SubLObject skolem) {
        return kb_mapping_utilities.fpred_value_gaf(skolem, $$skolem, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject skolem_defining_bookkeeping_assertion(final SubLObject skolem) {
        return kb_mapping_utilities.fpred_value_gaf_in_any_mt(skolem, $$skolem, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject skolem_defn_assertions_alt(SubLObject skolem, SubLObject printP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        {
            SubLObject defining_bookeeping_assertion = com.cyc.cycjava.cycl.skolems.skolem_defining_bookkeeping_assertion(skolem);
            if (NIL != defining_bookeeping_assertion) {
                {
                    SubLObject deduction = assertions_high.assertion_arguments(defining_bookeeping_assertion).first();
                    if (NIL != deduction_handles.deduction_p(deduction)) {
                        return deductions_high.deduction_supports(deduction);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject skolem_defn_assertions(final SubLObject skolem, SubLObject printP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        final SubLObject defining_bookeeping_assertion = skolem_defining_bookkeeping_assertion(skolem);
        if (NIL != defining_bookeeping_assertion) {
            final SubLObject deduction = assertions_high.assertion_arguments(defining_bookeeping_assertion).first();
            if (NIL != deduction_handles.deduction_p(deduction)) {
                return deductions_high.deduction_supports(deduction);
            }
        }
        return NIL;
    }

    public static final SubLObject skolems_defn_assertions_alt(SubLObject v_skolems) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_skolems;
            SubLObject skolem = NIL;
            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                {
                    SubLObject items_var = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
                    if (items_var.isVector()) {
                        {
                            SubLObject vector_var = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject item = aref(vector_var, element_num);
                                    result = cons(item, result);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var_4 = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
                            SubLObject item = NIL;
                            for (item = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , item = cdolist_list_var_4.first()) {
                                result = cons(item, result);
                            }
                        }
                    }
                }
            }
            return delete_duplicates(nreverse(result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject skolems_defn_assertions(final SubLObject v_skolems) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_skolems;
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject items_var = skolem_defn_assertions(skolem, UNPROVIDED);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = aref(vector_var, element_num);
                    result = cons(item, result);
                }
            } else {
                SubLObject cdolist_list_var_$4 = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    result = cons(item2, result);
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    item2 = cdolist_list_var_$4.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return delete_duplicates(nreverse(result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list of skolem-function-p; all skolems (including SKOLEM itself) that occur in SKOLEM's defining assertions
     */
    @LispMethod(comment = "@return list of skolem-function-p; all skolems (including SKOLEM itself) that occur in SKOLEM\'s defining assertions")
    public static final SubLObject skolem_defn_siblings_alt(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
                    try {
                        czer_vars.$assertion_key$.bind(ASSERTION_IST_FORMULA, thread);
                        result = cycl_utilities.expression_gather(com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, NIL), SKOLEM_FUNCTION_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return list of skolem-function-p; all skolems (including SKOLEM itself) that occur in SKOLEM's defining assertions
     */
    @LispMethod(comment = "@return list of skolem-function-p; all skolems (including SKOLEM itself) that occur in SKOLEM\'s defining assertions")
    public static SubLObject skolem_defn_siblings(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
        try {
            czer_vars.$assertion_key$.bind(ASSERTION_IST_FORMULA, thread);
            result = cycl_utilities.expression_gather(skolem_defn_assertions(skolem, NIL), SKOLEM_FUNCTION_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @return list of skolem-function-p; other skolems that occur in SKOLEM's defining assertions
     */
    @LispMethod(comment = "@return list of skolem-function-p; other skolems that occur in SKOLEM\'s defining assertions")
    public static final SubLObject skolem_defn_proper_siblings_alt(SubLObject skolem) {
        return remove(skolem, com.cyc.cycjava.cycl.skolems.skolem_defn_siblings(skolem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list of skolem-function-p; other skolems that occur in SKOLEM's defining assertions
     */
    @LispMethod(comment = "@return list of skolem-function-p; other skolems that occur in SKOLEM\'s defining assertions")
    public static SubLObject skolem_defn_proper_siblings(final SubLObject skolem) {
        return remove(skolem, skolem_defn_siblings(skolem), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown this uses internal ids so may not be stable across images
     */
    @LispMethod(comment = "@unknown this uses internal ids so may not be stable across images")
    public static final SubLObject skolem_canonical_sibling_alt(SubLObject skolem) {
        return kb_utilities.sort_forts(copy_list(com.cyc.cycjava.cycl.skolems.skolem_defn_siblings(skolem))).first();
    }

    /**
     *
     *
     * @unknown this uses internal ids so may not be stable across images
     */
    @LispMethod(comment = "@unknown this uses internal ids so may not be stable across images")
    public static SubLObject skolem_canonical_sibling(final SubLObject skolem) {
        return kb_utilities.sort_forts(copy_list(skolem_defn_siblings(skolem))).first();
    }

    public static final SubLObject skolems_min_mt_alt(SubLObject v_skolems) {
        return assertion_utilities.assertions_min_mt(com.cyc.cycjava.cycl.skolems.skolems_defn_assertions(v_skolems));
    }

    public static SubLObject skolems_min_mt(final SubLObject v_skolems) {
        return assertion_utilities.assertions_min_mt(skolems_defn_assertions(v_skolems));
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION only mentions reified SKOLEM function within
    arguments constrained to be EL templates (or doesn't mention it at all).
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION only mentions reified SKOLEM function within\r\narguments constrained to be EL templates (or doesn\'t mention it at all).")
    public static final SubLObject skolem_only_mentioned_in_el_templatesP_alt(SubLObject skolem, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject found_outside_of_templateP = NIL;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_2 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(assertions_high.assertion_mt(assertion), thread);
                            cycl_utilities.$opaque_arg_function$.bind($sym46$OPAQUE_ARG_WRT_EL_TEMPLATE_, thread);
                            found_outside_of_templateP = cycl_utilities.assertion_find(skolem, assertion, NIL, UNPROVIDED, UNPROVIDED);
                        } finally {
                            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return makeBoolean(NIL == found_outside_of_templateP);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return boolean; t iff ASSERTION only mentions reified SKOLEM function within
    arguments constrained to be EL templates (or doesn't mention it at all).
     */
    @LispMethod(comment = "@return boolean; t iff ASSERTION only mentions reified SKOLEM function within\r\narguments constrained to be EL templates (or doesn\'t mention it at all).")
    public static SubLObject skolem_only_mentioned_in_el_templatesP(final SubLObject skolem, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            SubLObject found_outside_of_templateP = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(assertions_high.assertion_mt(assertion), thread);
                cycl_utilities.$opaque_arg_function$.bind($sym46$OPAQUE_ARG_WRT_EL_TEMPLATE_, thread);
                found_outside_of_templateP = cycl_utilities.assertion_find(skolem, assertion, NIL, UNPROVIDED, UNPROVIDED);
            } finally {
                cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            return makeBoolean(NIL == found_outside_of_templateP);
        }
        return NIL;
    }

    public static final SubLObject skolem_defn_assertionP_alt(SubLObject skolem, SubLObject assertion, SubLObject printP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        return subl_promotions.memberP(assertion, com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, printP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject skolem_defn_assertionP(final SubLObject skolem, final SubLObject assertion, SubLObject printP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        return subl_promotions.memberP(assertion, skolem_defn_assertions(skolem, printP), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff GAF-ASSERTION corresponds to a cnf in the skolem-defn of SKOLEM
     */
    @LispMethod(comment = "@return boolean; t iff GAF-ASSERTION corresponds to a cnf in the skolem-defn of SKOLEM")
    public static final SubLObject gaf_has_corresponding_cnf_in_skolem_defnP_alt(SubLObject skolem, SubLObject gaf_assertion, SubLObject gaf_skolem) {
        if (gaf_skolem == UNPROVIDED) {
            gaf_skolem = NIL;
        }
        {
            SubLObject skolem_defn = com.cyc.cycjava.cycl.skolems.skolem_defn(skolem);
            SubLObject mt = assertions_high.assertion_mt(gaf_assertion);
            if (NIL != skolem_defn) {
                if (NIL != hlmt.hlmt_equalP(mt, com.cyc.cycjava.cycl.skolems.mt_of_skolem_defn(skolem_defn))) {
                    {
                        SubLObject cnfs = com.cyc.cycjava.cycl.skolems.cnfs_of_skolem_defn(skolem_defn);
                        SubLObject cnf_skolem = (NIL != gaf_skolem) ? ((SubLObject) (gaf_skolem)) : skolem;
                        SubLObject cnf = subst(com.cyc.cycjava.cycl.skolems.sk_defn_var(), cnf_skolem, assertions_high.assertion_cnf(gaf_assertion), UNPROVIDED, UNPROVIDED);
                        if (NIL != el_tracing_p(TWO_INTEGER)) {
                            if (NIL != list_utilities.tree_find(cnf_skolem, assertions_high.assertion_cnf(gaf_assertion), UNPROVIDED, UNPROVIDED)) {
                                if (NIL == com.cyc.cycjava.cycl.skolems.constant_denoting_reified_skolem_fnP(skolem)) {
                                    el_warn(TWO_INTEGER, $str_alt47$_in_gaf_has_corresponding_cnf_in_, skolem, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                        return subl_promotions.memberP(cnf, cnfs, symbol_function(EQUAL), UNPROVIDED);
                    }
                }
            } else {
                if (NIL != term.skolem_constantP(skolem)) {
                    {
                        SubLObject skolem_to_use = cycl_utilities.nat_arg0(skolem);
                        return com.cyc.cycjava.cycl.skolems.gaf_has_corresponding_cnf_in_skolem_defnP(skolem_to_use, gaf_assertion, skolem);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff GAF-ASSERTION corresponds to a cnf in the skolem-defn of SKOLEM
     */
    @LispMethod(comment = "@return boolean; t iff GAF-ASSERTION corresponds to a cnf in the skolem-defn of SKOLEM")
    public static SubLObject gaf_has_corresponding_cnf_in_skolem_defnP(final SubLObject skolem, final SubLObject gaf_assertion, SubLObject gaf_skolem) {
        if (gaf_skolem == UNPROVIDED) {
            gaf_skolem = NIL;
        }
        final SubLObject skolem_defn = skolem_defn(skolem);
        final SubLObject mt = assertions_high.assertion_mt(gaf_assertion);
        if (NIL != skolem_defn) {
            if (NIL != hlmt.hlmt_equalP(mt, mt_of_skolem_defn(skolem_defn))) {
                final SubLObject cnfs = cnfs_of_skolem_defn(skolem_defn);
                final SubLObject cnf_skolem = (NIL != gaf_skolem) ? gaf_skolem : skolem;
                final SubLObject cnf = subst(sk_defn_var(), cnf_skolem, assertions_high.assertion_cnf(gaf_assertion), UNPROVIDED, UNPROVIDED);
                if (((NIL != el_tracing_p(TWO_INTEGER)) && (NIL != list_utilities.tree_find(cnf_skolem, assertions_high.assertion_cnf(gaf_assertion), UNPROVIDED, UNPROVIDED))) && (NIL == constant_denoting_reified_skolem_fnP(skolem))) {
                    el_warn(TWO_INTEGER, $str47$_in_gaf_has_corresponding_cnf_in_, skolem, UNPROVIDED, UNPROVIDED);
                }
                return subl_promotions.memberP(cnf, cnfs, symbol_function(EQUAL), UNPROVIDED);
            }
        } else
            if (NIL != term.skolem_constantP(skolem)) {
                final SubLObject skolem_to_use = cycl_utilities.nat_arg0(skolem);
                return gaf_has_corresponding_cnf_in_skolem_defnP(skolem_to_use, gaf_assertion, skolem);
            }

        return NIL;
    }

    public static final SubLObject constant_denoting_reified_skolem_fnP_alt(SubLObject functor) {
        return makeBoolean((NIL != term.reified_skolem_fnP(functor)) && ZERO_INTEGER.eql(arity.arity(functor)));
    }

    public static SubLObject constant_denoting_reified_skolem_fnP(final SubLObject functor) {
        return makeBoolean((NIL != term.reified_skolem_fnP(functor)) && ZERO_INTEGER.eql(arity.arity(functor)));
    }

    public static final SubLObject computed_skolem_assertionP_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == assertions_high.asserted_assertionP(assertion)) || (((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != subl_promotions.memberP(assertions_high.gaf_arg0(assertion), czer_vars.$preds_of_computed_skolem_gafs$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) && ((!assertions_high.gaf_arg0(assertion).eql($$isa)) || ((NIL != term.reified_skolem_fnP(assertions_high.gaf_arg1(assertion))) && (NIL != genls.genlP(assertions_high.gaf_arg2(assertion), $$SkolemFunction, assertions_high.assertion_mt(assertion), UNPROVIDED))))));
        }
    }

    public static SubLObject computed_skolem_assertionP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == assertions_high.asserted_assertionP(assertion)) || (((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL != subl_promotions.memberP(assertions_high.gaf_arg0(assertion), czer_vars.$preds_of_computed_skolem_gafs$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) && ((!assertions_high.gaf_arg0(assertion).eql($$isa)) || ((NIL != term.reified_skolem_fnP(assertions_high.gaf_arg1(assertion))) && (NIL != genls.genlP(assertions_high.gaf_arg2(assertion), $$SkolemFunction, assertions_high.assertion_mt(assertion), UNPROVIDED))))));
    }

    /**
     * Return T iff there is some skolem defined by ASSERTION.
     */
    @LispMethod(comment = "Return T iff there is some skolem defined by ASSERTION.")
    public static final SubLObject skolem_defining_assertionP_alt(SubLObject assertion) {
        return subl_promotions.memberP($$skolem, Mapping.mapcar(SENTENCE_ARG0, Mapping.mapcar(DEDUCTION_ASSERTION, assertions_high.assertion_dependents(assertion))), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff there is some skolem defined by ASSERTION.
     */
    @LispMethod(comment = "Return T iff there is some skolem defined by ASSERTION.")
    public static SubLObject skolem_defining_assertionP(final SubLObject assertion) {
        if ((NIL != cycl_utilities.expression_find_if($sym49$REIFIED_SKOLEM_FN_, assertions_high.assertion_cons(assertion), T, UNPROVIDED)) || (NIL != cycl_utilities.expression_find_if($sym49$REIFIED_SKOLEM_FN_, assertions_high.assertion_mt(assertion), T, UNPROVIDED))) {
            final SubLObject dependents = assertions_high.assertion_dependent_list(assertion);
            return subl_promotions.memberP($$skolem, Mapping.mapcar(SENTENCE_ARG0, Mapping.mapcar(DEDUCTION_ASSERTION, dependents)), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject defn_assertion_of_skolemP_alt(SubLObject skolem, SubLObject assertion) {
        return makeBoolean((NIL != cycl_utilities.expression_find(skolem, assertion, T, UNPROVIDED, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.skolems.skolem_defn_assertionP(skolem, assertion, UNPROVIDED)));
    }

    public static SubLObject defn_assertion_of_skolemP(final SubLObject skolem, final SubLObject assertion) {
        return makeBoolean((NIL != cycl_utilities.expression_find(skolem, assertion, T, UNPROVIDED, UNPROVIDED)) && (NIL != skolem_defn_assertionP(skolem, assertion, UNPROVIDED)));
    }

    public static final SubLObject assertion_skolems_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
                    try {
                        czer_vars.$assertion_key$.bind(ASSERTION_FORMULA, thread);
                        result = cycl_utilities.expression_gather(assertion, symbol_function($sym52$REIFIED_SKOLEM_FN_IN_ANY_MT_), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject assertion_skolems(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
        try {
            czer_vars.$assertion_key$.bind(ASSERTION_FORMULA, thread);
            result = cycl_utilities.expression_gather(assertion, symbol_function($sym53$REIFIED_SKOLEM_FN_IN_ANY_MT_), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject defn_assertion_skolems_alt(SubLObject assertion) {
        {
            SubLObject v_skolems = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.assertion_skolems(assertion);
            SubLObject skolem = NIL;
            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.skolems.defn_assertion_of_skolemP(skolem, assertion)) {
                    v_skolems = cons(skolem, v_skolems);
                }
            }
            return nreverse(v_skolems);
        }
    }

    public static SubLObject defn_assertion_skolems(final SubLObject assertion) {
        SubLObject v_skolems = NIL;
        SubLObject cdolist_list_var = assertion_skolems(assertion);
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != defn_assertion_of_skolemP(skolem, assertion)) {
                v_skolems = cons(skolem, v_skolems);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return nreverse(v_skolems);
    }

    public static final SubLObject all_skolem_mt_defn_assertions_alt(SubLObject skolem, SubLObject mt, SubLObject printP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, printP);
                            SubLObject assertion = NIL;
                            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                                {
                                    SubLObject item_var = assertion;
                                    if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        result = cons(item_var, result);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject all_skolem_mt_defn_assertions(final SubLObject skolem, final SubLObject mt, SubLObject printP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var = skolem_defn_assertions(skolem, printP);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = assertion;
                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Bound by reset-defn-of-skolem to the #$SkolemFunction whose defn is being reset
     */
    @LispMethod(comment = "Bound by reset-defn-of-skolem to the #$SkolemFunction whose defn is being reset")
    public static final SubLObject recomputing_skolem_defn_info_constant_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) {
                    Errors.error($str_alt53$recomputing_skolem_defn_info_cons);
                }
            }
            return $recompute_skolem_defn_info$.getDynamicValue(thread).first();
        }
    }

    /**
     * Bound by reset-defn-of-skolem to the #$SkolemFunction whose defn is being reset
     */
    @LispMethod(comment = "Bound by reset-defn-of-skolem to the #$SkolemFunction whose defn is being reset")
    public static SubLObject recomputing_skolem_defn_info_constant() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == recomputing_skolem_defnP())) {
            Errors.error($str54$recomputing_skolem_defn_info_cons);
        }
        return $recompute_skolem_defn_info$.getDynamicValue(thread).first();
    }

    /**
     * Bound by reset-defn-of-skolem to the variable of the skolem whose defn is being reset
     */
    @LispMethod(comment = "Bound by reset-defn-of-skolem to the variable of the skolem whose defn is being reset")
    public static final SubLObject recomputing_skolem_defn_info_var_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) {
                    Errors.error($str_alt54$recomputing_skolem_defn_info_var_);
                }
            }
            return second($recompute_skolem_defn_info$.getDynamicValue(thread));
        }
    }

    /**
     * Bound by reset-defn-of-skolem to the variable of the skolem whose defn is being reset
     */
    @LispMethod(comment = "Bound by reset-defn-of-skolem to the variable of the skolem whose defn is being reset")
    public static SubLObject recomputing_skolem_defn_info_var() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == recomputing_skolem_defnP())) {
            Errors.error($str55$recomputing_skolem_defn_info_var_);
        }
        return second($recompute_skolem_defn_info$.getDynamicValue(thread));
    }

    /**
     * Boolean bound by reset-defn-of-skolem, whether to actually do it
     */
    @LispMethod(comment = "Boolean bound by reset-defn-of-skolem, whether to actually do it")
    public static final SubLObject really_recomputing_skolem_defnP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) {
                    Errors.error($str_alt55$really_recomputing_skolem_defn__c);
                }
            }
            return third($recompute_skolem_defn_info$.getDynamicValue(thread));
        }
    }

    /**
     * Boolean bound by reset-defn-of-skolem, whether to actually do it
     */
    @LispMethod(comment = "Boolean bound by reset-defn-of-skolem, whether to actually do it")
    public static SubLObject really_recomputing_skolem_defnP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == recomputing_skolem_defnP())) {
            Errors.error($str56$really_recomputing_skolem_defn__c);
        }
        return third($recompute_skolem_defn_info$.getDynamicValue(thread));
    }

    /**
     * Set to the result (the defn), for use by reset-defn-of-skolem
     */
    @LispMethod(comment = "Set to the result (the defn), for use by reset-defn-of-skolem")
    public static final SubLObject recomputing_skolem_defn_info_defn_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) {
                    Errors.error($str_alt56$recomputing_skolem_defn_info_defn);
                }
            }
            return fourth($recompute_skolem_defn_info$.getDynamicValue(thread));
        }
    }

    /**
     * Set to the result (the defn), for use by reset-defn-of-skolem
     */
    @LispMethod(comment = "Set to the result (the defn), for use by reset-defn-of-skolem")
    public static SubLObject recomputing_skolem_defn_info_defn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == recomputing_skolem_defnP())) {
            Errors.error($str57$recomputing_skolem_defn_info_defn);
        }
        return fourth($recompute_skolem_defn_info$.getDynamicValue(thread));
    }

    /**
     * Set to the result (the key), for use by reset-defn-of-skolem
     */
    @LispMethod(comment = "Set to the result (the key), for use by reset-defn-of-skolem")
    public static final SubLObject recomputing_skolem_defn_info_key_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) {
                    Errors.error($str_alt57$recomputing_skolem_defn_info_key_);
                }
            }
            return fifth($recompute_skolem_defn_info$.getDynamicValue(thread));
        }
    }

    /**
     * Set to the result (the key), for use by reset-defn-of-skolem
     */
    @LispMethod(comment = "Set to the result (the key), for use by reset-defn-of-skolem")
    public static SubLObject recomputing_skolem_defn_info_key() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == recomputing_skolem_defnP())) {
            Errors.error($str58$recomputing_skolem_defn_info_key_);
        }
        return fifth($recompute_skolem_defn_info$.getDynamicValue(thread));
    }

    /**
     * Set to the EL variable binding list created by the uncanonicalizer, so we don't spuriously uniquify variables in defns.
     */
    @LispMethod(comment = "Set to the EL variable binding list created by the uncanonicalizer, so we don\'t spuriously uniquify variables in defns.")
    public static final SubLObject recomputing_skolem_defn_info_blist_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) {
                    Errors.error($str_alt58$recomputing_skolem_defn_info_blis);
                }
            }
            return sixth($recompute_skolem_defn_info$.getDynamicValue(thread));
        }
    }

    /**
     * Set to the EL variable binding list created by the uncanonicalizer, so we don't spuriously uniquify variables in defns.
     */
    @LispMethod(comment = "Set to the EL variable binding list created by the uncanonicalizer, so we don\'t spuriously uniquify variables in defns.")
    public static SubLObject recomputing_skolem_defn_info_blist() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == recomputing_skolem_defnP())) {
            Errors.error($str59$recomputing_skolem_defn_info_blis);
        }
        return sixth($recompute_skolem_defn_info$.getDynamicValue(thread));
    }

    public static final SubLObject set_recomputing_skolem_defn_result_alt(SubLObject defn, SubLObject key) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) {
                    Errors.error($str_alt59$set_recomputing_skolem_defn_resul);
                }
            }
            list_utilities.nreplace_nth(THREE_INTEGER, defn, $recompute_skolem_defn_info$.getDynamicValue(thread));
            list_utilities.nreplace_nth(FOUR_INTEGER, key, $recompute_skolem_defn_info$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject set_recomputing_skolem_defn_result(final SubLObject defn, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == recomputing_skolem_defnP())) {
            Errors.error($str60$set_recomputing_skolem_defn_resul);
        }
        list_utilities.nreplace_nth(THREE_INTEGER, defn, $recompute_skolem_defn_info$.getDynamicValue(thread));
        list_utilities.nreplace_nth(FOUR_INTEGER, key, $recompute_skolem_defn_info$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject set_recomputing_skolem_defn_blist_alt(SubLObject blist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) {
                    Errors.error($str_alt60$set_recomputing_skolem_defn_blist);
                }
            }
            list_utilities.nreplace_nth(FIVE_INTEGER, blist, $recompute_skolem_defn_info$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject set_recomputing_skolem_defn_blist(final SubLObject blist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == recomputing_skolem_defnP())) {
            Errors.error($str61$set_recomputing_skolem_defn_blist);
        }
        list_utilities.nreplace_nth(FIVE_INTEGER, blist, $recompute_skolem_defn_info$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject recomputing_skolem_defnP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($recompute_skolem_defn_info$.getDynamicValue(thread));
        }
    }

    public static SubLObject recomputing_skolem_defnP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($recompute_skolem_defn_info$.getDynamicValue(thread));
    }

    public static final SubLObject recomputing_defn_of_skolemP_alt(SubLObject skolem) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) && (skolem == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_constant()));
    }

    public static SubLObject recomputing_defn_of_skolemP(final SubLObject skolem) {
        return makeBoolean((NIL != recomputing_skolem_defnP()) && skolem.eql(recomputing_skolem_defn_info_constant()));
    }

    public static final SubLObject recomputing_skolem_defn_ofP_alt(SubLObject unreified_sk_term) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) && ((($GAF == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_var()) && (NIL != cycl_utilities.expression_find(bindings.variable_binding_variable(com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_blist().first()), unreified_sk_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (com.cyc.cycjava.cycl.skolems.skolem_function_var(unreified_sk_term) == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_var())));
    }

    public static SubLObject recomputing_skolem_defn_ofP(final SubLObject unreified_sk_term) {
        return makeBoolean((NIL != recomputing_skolem_defnP()) && ((($GAF == recomputing_skolem_defn_info_var()) && (NIL != cycl_utilities.expression_find(bindings.variable_binding_variable(recomputing_skolem_defn_info_blist().first()), unreified_sk_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || skolem_function_var(unreified_sk_term).eql(recomputing_skolem_defn_info_var())));
    }

    public static final SubLObject note_skolem_binding_alt(SubLObject uniq_var, SubLObject orig_var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.skolems.recomputing_skolem_defnP()) {
                    Errors.error($str_alt62$note_skolem_binding_called_when_n);
                }
            }
            {
                SubLObject new_binding = cons(uniq_var, orig_var);
                if (NIL == list_utilities.member_equalP(new_binding, com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_blist())) {
                    com.cyc.cycjava.cycl.skolems.set_recomputing_skolem_defn_blist(cons(new_binding, com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_blist()));
                }
            }
            return NIL;
        }
    }

    public static SubLObject note_skolem_binding(final SubLObject uniq_var, final SubLObject orig_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == recomputing_skolem_defnP())) {
            Errors.error($str63$note_skolem_binding_called_when_n);
        }
        final SubLObject new_binding = cons(uniq_var, orig_var);
        if (NIL == list_utilities.member_equalP(new_binding, recomputing_skolem_defn_info_blist())) {
            set_recomputing_skolem_defn_blist(cons(new_binding, recomputing_skolem_defn_info_blist()));
        }
        return NIL;
    }

    public static final SubLObject recompute_skolem_defn_alt(SubLObject unreified_sk_term, SubLObject term_args, SubLObject skolem_clauses, SubLObject mt, SubLObject defn, SubLObject arity_min) {
        {
            SubLObject ununiquified_unreified_sk_term = cycl_utilities.expression_sublis(com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_blist(), unreified_sk_term, UNPROVIDED, UNPROVIDED);
            SubLObject defn_unreified_sk_term = com.cyc.cycjava.cycl.skolems.defn_unreified_sk_term(ununiquified_unreified_sk_term, term_args, skolem_clauses);
            SubLObject key = com.cyc.cycjava.cycl.skolems.skolem_hash_key(arity_min, defn);
            SubLObject sk_defn = com.cyc.cycjava.cycl.skolems.make_sk_defn(com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_constant(), defn_unreified_sk_term, mt, defn);
            com.cyc.cycjava.cycl.skolems.set_recomputing_skolem_defn_result(sk_defn, key);
            if (NIL != com.cyc.cycjava.cycl.skolems.really_recomputing_skolem_defnP()) {
                com.cyc.cycjava.cycl.skolems.add_skolem_defn(sk_defn, key);
            }
            return values(sk_defn, key);
        }
    }

    public static SubLObject recompute_skolem_defn(final SubLObject unreified_sk_term, final SubLObject term_args, final SubLObject skolem_clauses, final SubLObject mt, final SubLObject defn, final SubLObject arity_min) {
        final SubLObject ununiquified_unreified_sk_term = cycl_utilities.expression_sublis(recomputing_skolem_defn_info_blist(), unreified_sk_term, UNPROVIDED, UNPROVIDED);
        final SubLObject defn_unreified_sk_term = defn_unreified_sk_term(ununiquified_unreified_sk_term, term_args, skolem_clauses);
        final SubLObject key = skolem_hash_key(arity_min, defn);
        final SubLObject sk_defn = make_sk_defn(recomputing_skolem_defn_info_constant(), defn_unreified_sk_term, mt, defn);
        set_recomputing_skolem_defn_result(sk_defn, key);
        if (NIL != really_recomputing_skolem_defnP()) {
            add_skolem_defn(sk_defn, key);
        }
        return values(sk_defn, key);
    }

    public static final SubLObject remove_defn_of_skolem_alt(SubLObject skolem, SubLObject key) {
        if (key == UNPROVIDED) {
            key = com.cyc.cycjava.cycl.skolems.skolem_defn_key(skolem);
        }
        {
            SubLObject new_table_value = NIL;
            SubLObject cdolist_list_var = gethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED);
            SubLObject defn = NIL;
            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                if (!skolem.eql(defn.first())) {
                    new_table_value = cons(defn, new_table_value);
                }
            }
            sethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), nreverse(new_table_value));
        }
        return NIL;
    }

    public static SubLObject remove_defn_of_skolem(final SubLObject skolem, SubLObject key) {
        if (key == UNPROVIDED) {
            key = skolem_defn_key(skolem);
        }
        SubLObject new_table_value = NIL;
        SubLObject cdolist_list_var = gethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED);
        SubLObject defn = NIL;
        defn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!skolem.eql(defn.first())) {
                new_table_value = cons(defn, new_table_value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defn = cdolist_list_var.first();
        } 
        sethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), nreverse(new_table_value));
        return NIL;
    }

    public static final SubLObject add_skolem_defn_alt(SubLObject defn, SubLObject key) {
        if (key == UNPROVIDED) {
            key = com.cyc.cycjava.cycl.skolems.skolem_table_key_from_defn(defn);
        }
        sethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), cons(defn, gethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED)));
        return NIL;
    }

    public static SubLObject add_skolem_defn(final SubLObject defn, SubLObject key) {
        if (key == UNPROVIDED) {
            key = skolem_table_key_from_defn(defn);
        }
        hl_transcript_tracing.note_hlt_add_skolem_defn(defn, key);
        sethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), cons(defn, gethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), UNPROVIDED)));
        return NIL;
    }

    public static final SubLObject kb_skolems_alt() {
        return fort_types_interface.all_forts_of_type($$SkolemFunction);
    }

    public static SubLObject kb_skolems() {
        return fort_types_interface.all_forts_of_type($$SkolemFunction);
    }

    public static final SubLObject skolem_table_contains_old_format_skolemsP_alt() {
        {
            SubLObject key = NIL;
            SubLObject v_defns = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        {
                            SubLObject cdolist_list_var = v_defns;
                            SubLObject defn = NIL;
                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                {
                                    SubLObject unreified_sk_term = second(defn);
                                    if (NIL != com.cyc.cycjava.cycl.skolems.old_format_skolemP(unreified_sk_term)) {
                                        return T;
                                    }
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject skolem_table_contains_old_format_skolemsP() {
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                v_defns = cdolist_list_var = getEntryValue(cdohash_entry);
                SubLObject defn = NIL;
                defn = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject unreified_sk_term = second(defn);
                    if (NIL != old_format_skolemP(unreified_sk_term)) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    defn = cdolist_list_var.first();
                } 
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static final SubLObject reset_skolem_defn_table_alt(SubLObject do_itP, SubLObject printP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clrhash(czer_vars.$skolem_axiom_table$.getGlobalValue());
            czer_vars.$empty_skolems$.setDynamicValue(NIL, thread);
            czer_vars.$mal_skolems$.setDynamicValue(NIL, thread);
            {
                SubLObject v_skolems = com.cyc.cycjava.cycl.skolems.kb_skolems();
                if (NIL != printP) {
                    format(T, $str_alt63$Total_KB_Skolems___a, length(v_skolems));
                }
                {
                    SubLObject list_var = v_skolems;
                    $progress_note$.setDynamicValue($$$building_skolem_defn_table, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(length(list_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject skolem = NIL;
                                for (skolem = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , skolem = csome_list_var.first()) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    if (NIL == hl_prototypes.hl_prototypical_instanceP(skolem)) {
                                        {
                                            SubLObject message_var = NIL;
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_5 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                        try {
                                                            com.cyc.cycjava.cycl.skolems.reset_defn_of_skolem(skolem, do_itP);
                                                        } catch (Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                            } catch (Throwable ccatch_env_var) {
                                                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            }
                                            if (message_var.isString()) {
                                                Errors.warn($str_alt66$_A, message_var);
                                            }
                                        }
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject reset_skolem_defn_table(SubLObject do_itP, SubLObject printP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        if (printP == UNPROVIDED) {
            printP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        clrhash(czer_vars.$skolem_axiom_table$.getGlobalValue());
        czer_vars.$empty_skolems$.setDynamicValue(NIL, thread);
        czer_vars.$mal_skolems$.setDynamicValue(NIL, thread);
        final SubLObject v_skolems = kb_skolems();
        if (NIL != printP) {
            format(T, $str64$Total_KB_Skolems___a, length(v_skolems));
        }
        final SubLObject list_var = v_skolems;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$building_skolem_defn_table, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject skolem = NIL;
                skolem = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (NIL == hl_prototypes.hl_prototypical_instanceP(skolem)) {
                        SubLObject message_var = NIL;
                        final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
                        eval($list68);
                        try {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        reset_defn_of_skolem(skolem, do_itP);
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                        if (message_var.isString()) {
                            Errors.warn($str71$_A, message_var);
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    skolem = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reset_defn_of_skolem_alt(SubLObject skolem, SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        return com.cyc.cycjava.cycl.skolems.reset_skolem_defn_from_assertions(skolem, com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED), do_itP);
    }

    public static SubLObject reset_defn_of_skolem(final SubLObject skolem, SubLObject do_itP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        return reset_skolem_defn_from_assertions(skolem, skolem_defn_assertions(skolem, UNPROVIDED), do_itP);
    }

    public static final SubLObject skolem_defn_from_assertions_alt(SubLObject skolem, SubLObject assertions) {
        if (assertions == UNPROVIDED) {
            assertions = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
        }
        return com.cyc.cycjava.cycl.skolems.reset_skolem_defn_from_assertions(skolem, assertions, NIL);
    }

    public static SubLObject skolem_defn_from_assertions(final SubLObject skolem, SubLObject assertions) {
        if (assertions == UNPROVIDED) {
            assertions = skolem_defn_assertions(skolem, UNPROVIDED);
        }
        return reset_skolem_defn_from_assertions(skolem, assertions, NIL);
    }

    public static final SubLObject reset_skolem_defn_from_assertions_alt(SubLObject skolem, SubLObject assertions, SubLObject do_itP) {
        if (assertions == UNPROVIDED) {
            assertions = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
        }
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_defn = NIL;
                SubLObject result_key = NIL;
                if (NIL == isa.isaP(skolem, $$SkolemFunction, UNPROVIDED, UNPROVIDED)) {
                    Errors.warn($str_alt67$____reified_skolem__a_not_known_t, skolem);
                }
                {
                    SubLObject _prev_bind_0 = $recompute_skolem_defn_info$.currentBinding(thread);
                    try {
                        $recompute_skolem_defn_info$.bind(list(skolem, com.cyc.cycjava.cycl.skolems.skolem_variable_from_assertions(skolem, assertions), do_itP, NIL, NIL, NIL), thread);
                        {
                            SubLObject ass = assertions.first();
                            thread.resetMultipleValues();
                            {
                                SubLObject el_formula = uncanonicalizer.assertion_el_formula(ass);
                                SubLObject el_mt = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                czer_main.canonicalize_wf_cycl(el_formula, el_mt);
                            }
                            result_defn = com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_defn();
                            result_key = com.cyc.cycjava.cycl.skolems.recomputing_skolem_defn_info_key();
                        }
                    } finally {
                        $recompute_skolem_defn_info$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result_defn, result_key);
            }
        }
    }

    public static SubLObject reset_skolem_defn_from_assertions(final SubLObject skolem, SubLObject assertions, SubLObject do_itP) {
        if (assertions == UNPROVIDED) {
            assertions = skolem_defn_assertions(skolem, UNPROVIDED);
        }
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_defn = NIL;
        SubLObject result_key = NIL;
        if (NIL == isa.isaP(skolem, $$SkolemFunction, UNPROVIDED, UNPROVIDED)) {
            Errors.warn($str72$____reified_skolem__a_not_known_t, skolem);
        }
        if (NIL == assertions) {
            Errors.warn($str73$No_skolem_defn_assertions_for___S, skolem);
        }
        if (NIL != assertions) {
            final SubLObject _prev_bind_0 = $recompute_skolem_defn_info$.currentBinding(thread);
            try {
                $recompute_skolem_defn_info$.bind(list(skolem, skolem_variable_from_assertions(skolem, assertions), do_itP, NIL, NIL, NIL), thread);
                final SubLObject ass = assertions.first();
                thread.resetMultipleValues();
                final SubLObject el_formula = uncanonicalizer.assertion_el_formula(ass);
                final SubLObject el_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                czer_main.canonicalize_wf_cycl(el_formula, el_mt);
                result_defn = recomputing_skolem_defn_info_defn();
                result_key = recomputing_skolem_defn_info_key();
            } finally {
                $recompute_skolem_defn_info$.rebind(_prev_bind_0, thread);
            }
        }
        return values(result_defn, result_key);
    }

    public static final SubLObject skolem_variable_from_assertions_alt(SubLObject skolem, SubLObject assertions) {
        {
            SubLObject cdolist_list_var = assertions;
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                if (NIL != assertions_high.gaf_assertionP(ass)) {
                    return $GAF;
                } else {
                    {
                        SubLObject cdolist_list_var_6 = clauses.neg_lits(fi.assertion_cnf_with_el_vars(ass));
                        SubLObject lit = NIL;
                        for (lit = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , lit = cdolist_list_var_6.first()) {
                            if (NIL != tou_litP(lit)) {
                                if (skolem == cycl_utilities.nat_functor(literal_arg2(lit, UNPROVIDED))) {
                                    return literal_arg1(lit, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject skolem_variable_from_assertions(final SubLObject skolem, final SubLObject assertions) {
        SubLObject cdolist_list_var = assertions;
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.gaf_assertionP(ass)) {
                return $GAF;
            }
            SubLObject cdolist_list_var_$8 = clauses.neg_lits(fi.assertion_cnf_with_el_vars(ass));
            SubLObject lit = NIL;
            lit = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                if ((NIL != tou_litP(lit)) && skolem.eql(cycl_utilities.nat_functor(literal_arg2(lit, UNPROVIDED)))) {
                    return literal_arg1(lit, UNPROVIDED);
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                lit = cdolist_list_var_$8.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject skolem_scalar_termP_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((((NIL != el_formula_with_operator_p(v_object, $$IntervalMinFn)) || (NIL != el_formula_with_operator_p(v_object, $$IntervalMaxFn))) || (NIL != term.scalar_termP(v_object, mt))) || ((NIL != possibly_naut_p(v_object)) && (NIL != genls.any_specP($$ScalarInterval, kb_accessors.result_isa(cycl_utilities.nat_functor(v_object), mt), UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject skolem_scalar_termP(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((((NIL != el_formula_with_operator_p(v_object, $$IntervalMinFn)) || (NIL != el_formula_with_operator_p(v_object, $$IntervalMaxFn))) || (NIL != term.scalar_termP(v_object, mt))) || ((NIL != possibly_naut_p(v_object)) && (NIL != genls.any_specP($$ScalarInterval, kb_accessors.result_isa(cycl_utilities.nat_functor(v_object), mt), UNPROVIDED, UNPROVIDED))));
    }

    public static final SubLObject skolem_result_types_from_cnfs_alt(SubLObject sk_term, SubLObject cnfs, SubLObject mt, SubLObject traceP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (traceP == UNPROVIDED) {
            traceP = NIL;
        }
        return com.cyc.cycjava.cycl.skolems.guess_skolem_result_types_from_cnfs($UNNAMED_SKOLEM_FN, sk_term, cnfs, mt, traceP);
    }

    public static SubLObject skolem_result_types_from_cnfs(final SubLObject sk_term, final SubLObject cnfs, SubLObject mt, SubLObject traceP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (traceP == UNPROVIDED) {
            traceP = NIL;
        }
        return guess_skolem_result_types_from_cnfs($UNNAMED_SKOLEM_FN, sk_term, cnfs, mt, traceP);
    }

    public static final SubLObject guess_skolem_result_types_from_cnfs_alt(SubLObject skolem, SubLObject sk_term, SubLObject cnfs, SubLObject mt, SubLObject traceP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (traceP == UNPROVIDED) {
            traceP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result_isas = com.cyc.cycjava.cycl.skolems.skolem_cnfs_pos_lit_types(sk_term, cnfs, mt);
                SubLObject result_isa_args = thread.secondMultipleValue();
                SubLObject result_genls = thread.thirdMultipleValue();
                SubLObject result_genl_args = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                result_isas = genls.min_cols(result_isas, mt, UNPROVIDED);
                if (NIL != result_isas) {
                    if (NIL != disjoint_with.any_disjoint_collection_pair(result_isas, mt)) {
                        if (NIL != traceP) {
                            format(T, $str_alt72$__disjoint_result_types___s____s, skolem, result_isas);
                        }
                    } else {
                        if (NIL != traceP) {
                            format(T, $str_alt73$__explicit_result_types___s____s, skolem, result_isas);
                        }
                    }
                } else {
                    {
                        SubLObject cols = com.cyc.cycjava.cycl.skolems.skolem_var_isa_constraints_wrt_cnfs(sk_term, cnfs, mt);
                        if (NIL != cols) {
                            if (NIL == disjoint_with.any_disjoint_collection_pair(cols, mt)) {
                                result_isas = cols;
                                if (NIL != traceP) {
                                    format(T, $str_alt74$__tacit_result_isa___s____s, skolem, result_isas);
                                }
                            }
                        }
                    }
                }
                if (NIL == result_isas) {
                    if (NIL != traceP) {
                        format(T, $str_alt75$__no_result_types___s, skolem);
                    }
                }
                result_genls = genls.min_cols(result_genls, mt, UNPROVIDED);
                if (NIL != result_genls) {
                    if (NIL != disjoint_with.any_disjoint_collection_pair(result_genls, mt)) {
                        if (NIL != traceP) {
                            format(T, $str_alt72$__disjoint_result_types___s____s, skolem, result_genls);
                        }
                    } else {
                        if (NIL != traceP) {
                            format(T, $str_alt73$__explicit_result_types___s____s, skolem, result_genls);
                        }
                    }
                } else {
                    {
                        SubLObject cols = com.cyc.cycjava.cycl.skolems.skolem_var_genl_constraints_wrt_cnfs(sk_term, cnfs, mt);
                        if (NIL != cols) {
                            if (NIL == disjoint_with.any_disjoint_collection_pair(cols, mt)) {
                                result_genls = cols;
                                if (NIL != traceP) {
                                    format(T, $str_alt76$__tacit_result_genl___s____s, skolem, result_genls);
                                }
                            }
                        }
                    }
                }
                if (NIL == result_genls) {
                    if (NIL != traceP) {
                        format(T, $str_alt75$__no_result_types___s, skolem);
                    }
                }
                return values(result_isas, result_isa_args, result_genls, result_genl_args);
            }
        }
    }

    public static SubLObject guess_skolem_result_types_from_cnfs(final SubLObject skolem, final SubLObject sk_term, final SubLObject cnfs, SubLObject mt, SubLObject traceP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (traceP == UNPROVIDED) {
            traceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result_isas = skolem_cnfs_pos_lit_types(sk_term, cnfs, mt);
        final SubLObject result_isa_args = thread.secondMultipleValue();
        SubLObject result_genls = thread.thirdMultipleValue();
        final SubLObject result_genl_args = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        result_isas = genls.min_cols(result_isas, mt, UNPROVIDED);
        if (NIL != result_isas) {
            if (NIL != disjoint_with.any_disjoint_collection_pair(result_isas, mt)) {
                if (NIL != traceP) {
                    format(T, $str78$__disjoint_result_types___s____s, skolem, result_isas);
                }
            } else
                if (NIL != traceP) {
                    format(T, $str79$__explicit_result_types___s____s, skolem, result_isas);
                }

        } else {
            final SubLObject cols = skolem_var_isa_constraints_wrt_cnfs(sk_term, cnfs, mt);
            if ((NIL != cols) && (NIL == disjoint_with.any_disjoint_collection_pair(cols, mt))) {
                result_isas = cols;
                if (NIL != traceP) {
                    format(T, $str80$__tacit_result_isa___s____s, skolem, result_isas);
                }
            }
        }
        if ((NIL == result_isas) && (NIL != traceP)) {
            format(T, $str81$__no_result_types___s, skolem);
        }
        result_genls = genls.min_cols(result_genls, mt, UNPROVIDED);
        if (NIL != result_genls) {
            if (NIL != disjoint_with.any_disjoint_collection_pair(result_genls, mt)) {
                if (NIL != traceP) {
                    format(T, $str78$__disjoint_result_types___s____s, skolem, result_genls);
                }
            } else
                if (NIL != traceP) {
                    format(T, $str79$__explicit_result_types___s____s, skolem, result_genls);
                }

        } else {
            final SubLObject cols = skolem_var_genl_constraints_wrt_cnfs(sk_term, cnfs, mt);
            if ((NIL != cols) && (NIL == disjoint_with.any_disjoint_collection_pair(cols, mt))) {
                result_genls = cols;
                if (NIL != traceP) {
                    format(T, $str82$__tacit_result_genl___s____s, skolem, result_genls);
                }
            }
        }
        if ((NIL == result_genls) && (NIL != traceP)) {
            format(T, $str81$__no_result_types___s, skolem);
        }
        return values(result_isas, result_isa_args, result_genls, result_genl_args);
    }

    public static final SubLObject skolem_cnfs_pos_lit_types_alt(SubLObject v_term, SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject isas = NIL;
                SubLObject isa_args = NIL;
                SubLObject v_genls = NIL;
                SubLObject genl_args = NIL;
                SubLObject cdolist_list_var = cnfs;
                SubLObject cnf = NIL;
                for (cnf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cnf = cdolist_list_var.first()) {
                    {
                        SubLObject pos_lits = clauses.pos_lits(cnf);
                        SubLObject cdolist_list_var_7 = pos_lits;
                        SubLObject pos_lit = NIL;
                        for (pos_lit = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , pos_lit = cdolist_list_var_7.first()) {
                            {
                                SubLObject second_term = literal_arg1(pos_lit, UNPROVIDED);
                                SubLObject third_term = literal_arg2(pos_lit, UNPROVIDED);
                                if ((NIL != isa_litP(pos_lit)) && second_term.equal(v_term)) {
                                    if (NIL != fort_types_interface.collectionP(third_term)) {
                                        {
                                            SubLObject item_var = third_term;
                                            if (NIL == member(item_var, isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                isas = cons(item_var, isas);
                                            }
                                        }
                                    } else {
                                        if (NIL != cycl_variables.cyc_varP(third_term)) {
                                            {
                                                SubLObject item_var = czer_utilities.canonical_variable_number(third_term);
                                                if (NIL == member(item_var, isa_args, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    isa_args = cons(item_var, isa_args);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if ((NIL != genls_litP(pos_lit)) && second_term.equal(v_term)) {
                                        if (NIL != fort_types_interface.collectionP(third_term)) {
                                            {
                                                SubLObject item_var = third_term;
                                                if (NIL == member(item_var, v_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    v_genls = cons(item_var, v_genls);
                                                }
                                            }
                                        } else {
                                            if (NIL != cycl_variables.cyc_varP(third_term)) {
                                                {
                                                    SubLObject item_var = czer_utilities.canonical_variable_number(third_term);
                                                    if (NIL == member(item_var, genl_args, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                        genl_args = cons(item_var, genl_args);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == list_utilities.singletonP(isas)) {
                    {
                        SubLObject _prev_bind_0 = czer_vars.$interpolate_singleton_arg_isaP$.currentBinding(thread);
                        try {
                            czer_vars.$interpolate_singleton_arg_isaP$.bind(T, thread);
                            isas = com.cyc.cycjava.cycl.skolems.interpolate_arg_type(isas, mt);
                        } finally {
                            czer_vars.$interpolate_singleton_arg_isaP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL == list_utilities.singletonP(v_genls)) {
                    {
                        SubLObject _prev_bind_0 = czer_vars.$interpolate_singleton_arg_isaP$.currentBinding(thread);
                        try {
                            czer_vars.$interpolate_singleton_arg_isaP$.bind(T, thread);
                            v_genls = com.cyc.cycjava.cycl.skolems.interpolate_arg_type(v_genls, mt);
                        } finally {
                            czer_vars.$interpolate_singleton_arg_isaP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(isas, isa_args, v_genls, genl_args);
            }
        }
    }

    public static SubLObject skolem_cnfs_pos_lit_types(final SubLObject v_term, final SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isas = NIL;
        SubLObject isa_args = NIL;
        SubLObject v_genls = NIL;
        SubLObject genl_args = NIL;
        SubLObject cdolist_list_var = cnfs;
        SubLObject cnf = NIL;
        cnf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9;
            final SubLObject pos_lits = cdolist_list_var_$9 = clauses.pos_lits(cnf);
            SubLObject pos_lit = NIL;
            pos_lit = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                final SubLObject second_term = literal_arg1(pos_lit, UNPROVIDED);
                final SubLObject third_term = literal_arg2(pos_lit, UNPROVIDED);
                if ((NIL != isa_litP(pos_lit)) && second_term.equal(v_term)) {
                    if (NIL != fort_types_interface.collectionP(third_term)) {
                        final SubLObject item_var = third_term;
                        if (NIL == member(item_var, isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                            isas = cons(item_var, isas);
                        }
                    } else
                        if (NIL != cycl_variables.cyc_varP(third_term)) {
                            final SubLObject item_var = czer_utilities.canonical_variable_number(third_term);
                            if (NIL == member(item_var, isa_args, symbol_function(EQL), symbol_function(IDENTITY))) {
                                isa_args = cons(item_var, isa_args);
                            }
                        }

                } else
                    if ((NIL != genls_litP(pos_lit)) && second_term.equal(v_term)) {
                        if (NIL != fort_types_interface.collectionP(third_term)) {
                            final SubLObject item_var = third_term;
                            if (NIL == member(item_var, v_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                v_genls = cons(item_var, v_genls);
                            }
                        } else
                            if (NIL != cycl_variables.cyc_varP(third_term)) {
                                final SubLObject item_var = czer_utilities.canonical_variable_number(third_term);
                                if (NIL == member(item_var, genl_args, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    genl_args = cons(item_var, genl_args);
                                }
                            }

                    }

                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                pos_lit = cdolist_list_var_$9.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cnf = cdolist_list_var.first();
        } 
        if (NIL == list_utilities.singletonP(isas)) {
            final SubLObject _prev_bind_0 = czer_vars.$interpolate_singleton_arg_isaP$.currentBinding(thread);
            try {
                czer_vars.$interpolate_singleton_arg_isaP$.bind(T, thread);
                isas = interpolate_arg_type(isas, mt);
            } finally {
                czer_vars.$interpolate_singleton_arg_isaP$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == list_utilities.singletonP(v_genls)) {
            final SubLObject _prev_bind_0 = czer_vars.$interpolate_singleton_arg_isaP$.currentBinding(thread);
            try {
                czer_vars.$interpolate_singleton_arg_isaP$.bind(T, thread);
                v_genls = interpolate_arg_type(v_genls, mt);
            } finally {
                czer_vars.$interpolate_singleton_arg_isaP$.rebind(_prev_bind_0, thread);
            }
        }
        return values(isas, isa_args, v_genls, genl_args);
    }

    public static final SubLObject skolem_var_isa_constraints_wrt_cnfs_alt(SubLObject sk_var, SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$infer_skolem_result_isa_via_arg_constraintsP$.getDynamicValue(thread)) {
                return genls.min_cols(remove($$CycLReifiableDenotationalTerm, at_var_types.var_isa_constraints_wrt_cnfs(sk_var, cnfs, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject skolem_var_isa_constraints_wrt_cnfs(final SubLObject sk_var, final SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$infer_skolem_result_isa_via_arg_constraintsP$.getDynamicValue(thread)) {
            return genls.min_cols(remove($$CycLReifiableDenotationalTerm, at_var_types.var_isa_constraints_wrt_cnfs(sk_var, cnfs, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject skolem_var_genl_constraints_wrt_cnfs_alt(SubLObject sk_var, SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != czer_vars.$infer_skolem_result_isa_via_arg_constraintsP$.getDynamicValue(thread)) {
                return genls.min_cols(at_var_types.var_genl_constraints_wrt_cnfs(sk_var, cnfs, mt, UNPROVIDED), mt, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject skolem_var_genl_constraints_wrt_cnfs(final SubLObject sk_var, final SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$infer_skolem_result_isa_via_arg_constraintsP$.getDynamicValue(thread)) {
            return genls.min_cols(at_var_types.var_genl_constraints_wrt_cnfs(sk_var, cnfs, mt, UNPROVIDED), mt, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject skolem_arg_isa_constraints_alt(SubLObject unreified_sk_term, SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject args = second(unreified_sk_term);
            SubLObject sk_number = com.cyc.cycjava.cycl.skolems.skolem_number(unreified_sk_term);
            SubLObject sk_position = (NIL != sk_number) ? ((SubLObject) (add(ONE_INTEGER, length(args)))) : NIL;
            SubLObject argXtypes = NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                argXtypes = cons(cons(arg, com.cyc.cycjava.cycl.skolems.interpolate_arg_type(at_var_types.cnfs_variable_isa_constraints(arg, cnfs, mt), mt)), argXtypes);
            }
            if (NIL != subl_promotions.memberP(sk_position, czer_vars.$arg_positions$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                argXtypes = cons(cons(sk_number, $list_alt78), argXtypes);
            }
            return nreverse(argXtypes);
        }
    }

    public static SubLObject skolem_arg_isa_constraints(final SubLObject unreified_sk_term, final SubLObject cnfs, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject args = second(unreified_sk_term);
        final SubLObject sk_number = skolem_number(unreified_sk_term);
        final SubLObject sk_position = (NIL != sk_number) ? add(ONE_INTEGER, length(args)) : NIL;
        SubLObject argXtypes = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argXtypes = cons(cons(arg, interpolate_arg_type(at_var_types.cnfs_variable_isa_constraints(arg, cnfs, mt), mt)), argXtypes);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        if (NIL != subl_promotions.memberP(sk_position, czer_vars.$arg_positions$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            argXtypes = cons(cons(sk_number, $list84), argXtypes);
        }
        return nreverse(argXtypes);
    }

    public static final SubLObject install_skolem_arg_types_alt(SubLObject do_itP, SubLObject traceP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        if (traceP == UNPROVIDED) {
            traceP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_defn_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = defn;
                                                    SubLObject current = datum;
                                                    SubLObject skolem = NIL;
                                                    SubLObject unreified_sk_term = NIL;
                                                    SubLObject mt = NIL;
                                                    SubLObject cnfs = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt80);
                                                    skolem = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt80);
                                                    unreified_sk_term = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt80);
                                                    mt = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt80);
                                                    cnfs = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        {
                                                            SubLObject sk_args = second(unreified_sk_term);
                                                            SubLObject cnfs_8 = com.cyc.cycjava.cycl.skolems.skolem_defn_cnfs(skolem);
                                                            SubLObject cdotimes_end_var = length(sk_args);
                                                            SubLObject n_9 = NIL;
                                                            for (n_9 = ZERO_INTEGER; n_9.numL(cdotimes_end_var); n_9 = add(n_9, ONE_INTEGER)) {
                                                                {
                                                                    SubLObject types = NIL;
                                                                    SubLObject arg_types = NIL;
                                                                    SubLObject arg_psn = add(ONE_INTEGER, n_9);
                                                                    if (NIL == kb_accessors.argn_isa(skolem, arg_psn, mt)) {
                                                                        {
                                                                            SubLObject cdolist_list_var_10 = cnfs_8;
                                                                            SubLObject cnf = NIL;
                                                                            for (cnf = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , cnf = cdolist_list_var_10.first()) {
                                                                                types = nunion(types, com.cyc.cycjava.cycl.skolems.cnf_fn_argn_isa(skolem, arg_psn, cnf, mt), UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        }
                                                                        arg_types = com.cyc.cycjava.cycl.skolems.interpolate_arg_type(types, mt);
                                                                        if (NIL != arg_types) {
                                                                            if (NIL != traceP) {
                                                                                format(T, $str_alt81$__tacit_arg__s_type___s____s, new SubLObject[]{ arg_psn, skolem, arg_types });
                                                                            }
                                                                            if (NIL != do_itP) {
                                                                                if (NIL == kb_accessors.argn_isa(skolem, arg_psn, mt)) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_11 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                                                                                        try {
                                                                                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                                                                                            if (NIL != valid_argnum_p(arg_psn)) {
                                                                                                {
                                                                                                    SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(arg_psn, UNPROVIDED, UNPROVIDED);
                                                                                                    if (NIL != forts.fort_p(arg_isa_pred)) {
                                                                                                        {
                                                                                                            SubLObject cdolist_list_var_12 = arg_types;
                                                                                                            SubLObject v_arg_type = NIL;
                                                                                                            for (v_arg_type = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , v_arg_type = cdolist_list_var_12.first()) {
                                                                                                                ke.ke_assert(list(arg_isa_pred, skolem, v_arg_type), mt, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_11, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (NIL != traceP) {
                                                                                format(T, $str_alt82$__no_arg__s_type___s____s, new SubLObject[]{ arg_psn, skolem, arg_types });
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt80);
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject install_skolem_arg_types(SubLObject do_itP, SubLObject traceP) {
        if (do_itP == UNPROVIDED) {
            do_itP = NIL;
        }
        if (traceP == UNPROVIDED) {
            traceP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
        SubLObject n = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$mapping_skolem_defn_table);
                SubLObject key = NIL;
                SubLObject v_defns = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        n = add(n, ONE_INTEGER);
                        note_percent_progress(n, total);
                        SubLObject cdolist_list_var = v_defns;
                        SubLObject defn = NIL;
                        defn = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = defn;
                            SubLObject skolem = NIL;
                            SubLObject unreified_sk_term = NIL;
                            SubLObject mt = NIL;
                            SubLObject cnfs = NIL;
                            destructuring_bind_must_consp(current, datum, $list86);
                            skolem = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list86);
                            unreified_sk_term = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list86);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list86);
                            cnfs = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                final SubLObject sk_args = second(unreified_sk_term);
                                final SubLObject cnfs_$10 = skolem_defn_cnfs(skolem);
                                SubLObject cdotimes_end_var;
                                SubLObject n_$11;
                                SubLObject types;
                                SubLObject arg_types;
                                SubLObject arg_psn;
                                SubLObject cdolist_list_var_$12;
                                SubLObject cnf;
                                SubLObject _prev_bind_0_$13;
                                SubLObject arg_isa_pred;
                                SubLObject cdolist_list_var_$13;
                                SubLObject v_arg_type;
                                for (cdotimes_end_var = length(sk_args), n_$11 = NIL, n_$11 = ZERO_INTEGER; n_$11.numL(cdotimes_end_var); n_$11 = add(n_$11, ONE_INTEGER)) {
                                    types = NIL;
                                    arg_types = NIL;
                                    arg_psn = add(ONE_INTEGER, n_$11);
                                    if (NIL == kb_accessors.argn_isa(skolem, arg_psn, mt)) {
                                        cdolist_list_var_$12 = cnfs_$10;
                                        cnf = NIL;
                                        cnf = cdolist_list_var_$12.first();
                                        while (NIL != cdolist_list_var_$12) {
                                            types = nunion(types, cnf_fn_argn_isa(skolem, arg_psn, cnf, mt), UNPROVIDED, UNPROVIDED);
                                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                            cnf = cdolist_list_var_$12.first();
                                        } 
                                        arg_types = interpolate_arg_type(types, mt);
                                        if (NIL != arg_types) {
                                            if (NIL != traceP) {
                                                format(T, $str87$__tacit_arg__s_type___s____s, new SubLObject[]{ arg_psn, skolem, arg_types });
                                            }
                                            if ((NIL != do_itP) && (NIL == kb_accessors.argn_isa(skolem, arg_psn, mt))) {
                                                _prev_bind_0_$13 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                                                try {
                                                    api_control_vars.$use_local_queueP$.bind(NIL, thread);
                                                    if (NIL != valid_argnum_p(arg_psn)) {
                                                        arg_isa_pred = kb_accessors.arg_isa_pred(arg_psn, UNPROVIDED, UNPROVIDED);
                                                        if (NIL != forts.fort_p(arg_isa_pred)) {
                                                            cdolist_list_var_$13 = arg_types;
                                                            v_arg_type = NIL;
                                                            v_arg_type = cdolist_list_var_$13.first();
                                                            while (NIL != cdolist_list_var_$13) {
                                                                ke.ke_assert(list(arg_isa_pred, skolem, v_arg_type), mt, UNPROVIDED, UNPROVIDED);
                                                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                                                v_arg_type = cdolist_list_var_$13.first();
                                                            } 
                                                        }
                                                    }
                                                } finally {
                                                    api_control_vars.$use_local_queueP$.rebind(_prev_bind_0_$13, thread);
                                                }
                                            }
                                        } else
                                            if (NIL != traceP) {
                                                format(T, $str88$__no_arg__s_type___s____s, new SubLObject[]{ arg_psn, skolem, arg_types });
                                            }

                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list86);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            defn = cdolist_list_var.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject cnf_fn_argn_isa_alt(SubLObject fn, SubLObject arg_psn, SubLObject cnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            SubLObject var = com.cyc.cycjava.cycl.skolems.cnf_fn_argn_var(fn, arg_psn, cnf);
            if (NIL != var) {
                return at_var_types.cnf_variable_isa_constraints(var, cnf, mt);
            }
        }
        return NIL;
    }

    public static SubLObject cnf_fn_argn_isa(final SubLObject fn, final SubLObject arg_psn, final SubLObject cnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject var = cnf_fn_argn_var(fn, arg_psn, cnf);
        if (NIL != var) {
            return at_var_types.cnf_variable_isa_constraints(var, cnf, mt);
        }
        return NIL;
    }

    public static final SubLObject cnf_fn_argn_var_alt(SubLObject fn, SubLObject arg_psn, SubLObject cnf) {
        {
            SubLObject cdolist_list_var = tou_lits(clauses.neg_lits(cnf));
            SubLObject tou_lit = NIL;
            for (tou_lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tou_lit = cdolist_list_var.first()) {
                if (fn.eql(cycl_utilities.nat_functor(third(tou_lit)))) {
                    return nth(arg_psn, third(tou_lit));
                }
            }
        }
        return NIL;
    }

    public static SubLObject cnf_fn_argn_var(final SubLObject fn, final SubLObject arg_psn, final SubLObject cnf) {
        SubLObject cdolist_list_var = tou_lits(clauses.neg_lits(cnf));
        SubLObject tou_lit = NIL;
        tou_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (fn.eql(cycl_utilities.nat_functor(third(tou_lit)))) {
                return nth(arg_psn, third(tou_lit));
            }
            cdolist_list_var = cdolist_list_var.rest();
            tou_lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject interpolate_arg_type_alt(SubLObject types, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != types) {
                types = genls.min_cols(remove_duplicates(types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED);
                if (NIL != second(types)) {
                    types = remove($$CycLReifiableDenotationalTerm, types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (NIL == disjoint_with.any_disjoint_collection_pair(types, mt)) {
                    if (NIL != czer_vars.$interpolate_singleton_arg_isaP$.getDynamicValue(thread)) {
                        if (NIL != list_utilities.singletonP(types)) {
                            return types;
                        } else {
                            {
                                SubLObject floors = genls.max_floor_cols(types, NIL, mt, UNPROVIDED);
                                if (NIL != list_utilities.singletonP(floors)) {
                                    return floors;
                                } else {
                                    {
                                        SubLObject ceilings = genls.min_ceiling_cols(types, NIL, mt, UNPROVIDED);
                                        if (NIL != list_utilities.singletonP(ceilings)) {
                                            return ceilings;
                                        } else {
                                            if (NIL != floors) {
                                                return list(floors.first());
                                            } else {
                                                if (NIL != ceilings) {
                                                    return list(ceilings.first());
                                                } else {
                                                    return NIL;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        return types;
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject interpolate_arg_type(SubLObject types, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != types) {
            types = genls.min_cols(remove_duplicates(types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, UNPROVIDED);
            if (NIL != second(types)) {
                types = remove($$CycLReifiableDenotationalTerm, types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL == disjoint_with.any_disjoint_collection_pair(types, mt)) {
                if (NIL == czer_vars.$interpolate_singleton_arg_isaP$.getDynamicValue(thread)) {
                    return types;
                }
                if (NIL != list_utilities.singletonP(types)) {
                    return types;
                }
                final SubLObject floors = genls.max_floor_cols(types, NIL, mt, UNPROVIDED);
                if (NIL != list_utilities.singletonP(floors)) {
                    return floors;
                }
                final SubLObject ceilings = genls.min_ceiling_cols(types, NIL, mt, UNPROVIDED);
                if (NIL != list_utilities.singletonP(ceilings)) {
                    return ceilings;
                }
                if (NIL != floors) {
                    return list(floors.first());
                }
                if (NIL != ceilings) {
                    return list(ceilings.first());
                }
                return NIL;
            }
        }
        return NIL;
    }

    public static final SubLObject max_skolem_arity_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                SubLObject max = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = defn;
                                                    SubLObject current = datum;
                                                    SubLObject constant = NIL;
                                                    SubLObject lispy = NIL;
                                                    SubLObject mt = NIL;
                                                    SubLObject cnfs = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    constant = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    lispy = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    mt = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    cnfs = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (max.numL(length(second(lispy)))) {
                                                            max = length(second(lispy));
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt84);
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return max;
            }
        }
    }

    public static SubLObject max_skolem_arity() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
        SubLObject n = ZERO_INTEGER;
        SubLObject max = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                SubLObject key = NIL;
                SubLObject v_defns = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        n = add(n, ONE_INTEGER);
                        note_percent_progress(n, total);
                        SubLObject cdolist_list_var = v_defns;
                        SubLObject defn = NIL;
                        defn = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = defn;
                            SubLObject constant = NIL;
                            SubLObject lispy = NIL;
                            SubLObject mt = NIL;
                            SubLObject cnfs = NIL;
                            destructuring_bind_must_consp(current, datum, $list90);
                            constant = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list90);
                            lispy = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list90);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list90);
                            cnfs = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (max.numL(length(second(lispy)))) {
                                    max = length(second(lispy));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list90);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            defn = cdolist_list_var.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return max;
    }

    public static final SubLObject skolems_of_arity_alt(SubLObject v_arity) {
        if (v_arity == UNPROVIDED) {
            v_arity = com.cyc.cycjava.cycl.skolems.max_skolem_arity();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = defn;
                                                    SubLObject current = datum;
                                                    SubLObject constant = NIL;
                                                    SubLObject lispy = NIL;
                                                    SubLObject mt = NIL;
                                                    SubLObject cnfs = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    constant = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    lispy = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    mt = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    cnfs = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (v_arity.numE(length(second(lispy)))) {
                                                            result = cons(constant, result);
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt84);
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject skolems_of_arity(SubLObject v_arity) {
        if (v_arity == UNPROVIDED) {
            v_arity = max_skolem_arity();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
        SubLObject n = ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                SubLObject key = NIL;
                SubLObject v_defns = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        n = add(n, ONE_INTEGER);
                        note_percent_progress(n, total);
                        SubLObject cdolist_list_var = v_defns;
                        SubLObject defn = NIL;
                        defn = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = defn;
                            SubLObject constant = NIL;
                            SubLObject lispy = NIL;
                            SubLObject mt = NIL;
                            SubLObject cnfs = NIL;
                            destructuring_bind_must_consp(current, datum, $list90);
                            constant = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list90);
                            lispy = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list90);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list90);
                            cnfs = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (v_arity.numE(length(second(lispy)))) {
                                    result = cons(constant, result);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list90);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            defn = cdolist_list_var.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject skolem_hosedP_alt(SubLObject skf) {
        if (NIL != com.cyc.cycjava.cycl.skolems.skolem_ill_formedP(skf)) {
            return T;
        }
        {
            SubLObject cdolist_list_var = assertion_utilities.rules_mentioning(skf);
            SubLObject rule = NIL;
            for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.skolems.skolem_rule_hosedP(rule, skf)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject skolem_hosedP(final SubLObject skf) {
        if (NIL != skolem_ill_formedP(skf)) {
            return T;
        }
        SubLObject cdolist_list_var = assertion_utilities.rules_mentioning(skf);
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != skolem_rule_hosedP(rule, skf)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject skolem_ill_formedP_alt(SubLObject skf) {
        {
            SubLObject defining_bookkeeping_assertion = com.cyc.cycjava.cycl.skolems.skolem_defining_bookkeeping_assertion(skf);
            return makeBoolean((NIL == defining_bookkeeping_assertion) || (NIL == assertions_high.deduced_assertionP(defining_bookkeeping_assertion)));
        }
    }

    public static SubLObject skolem_ill_formedP(final SubLObject skf) {
        final SubLObject defining_bookkeeping_assertion = skolem_defining_bookkeeping_assertion(skf);
        return makeBoolean((NIL == defining_bookkeeping_assertion) || (NIL == assertions_high.deduced_assertionP(defining_bookkeeping_assertion)));
    }

    /**
     *
     *
     * @return booleanp; whether RULE is hosed wrt SKF.
    Necessary criteria include:
    - RULE's EL sentence should not mention SKF.
    - RULE's EL sentence should mention an existential.
     */
    @LispMethod(comment = "@return booleanp; whether RULE is hosed wrt SKF.\r\nNecessary criteria include:\r\n- RULE\'s EL sentence should not mention SKF.\r\n- RULE\'s EL sentence should mention an existential.")
    public static final SubLObject skolem_rule_hosedP_alt(SubLObject rule, SubLObject skf) {
        {
            SubLObject el_sentence = uncanonicalizer.assertion_el_formula(rule);
            if (NIL == cycl_utilities.expression_find_if(CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P, el_sentence, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            if (NIL != cycl_utilities.expression_find(skf, el_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether RULE is hosed wrt SKF.
    Necessary criteria include:
    - RULE's EL sentence should not mention SKF.
    - RULE's EL sentence should mention an existential.
     */
    @LispMethod(comment = "@return booleanp; whether RULE is hosed wrt SKF.\r\nNecessary criteria include:\r\n- RULE\'s EL sentence should not mention SKF.\r\n- RULE\'s EL sentence should mention an existential.")
    public static SubLObject skolem_rule_hosedP(final SubLObject rule, final SubLObject skf) {
        final SubLObject el_sentence = uncanonicalizer.assertion_el_formula(rule);
        if (NIL == cycl_utilities.expression_find_if(CYC_CONST_GENERAL_EXISTENTIAL_OPERATOR_P, el_sentence, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != cycl_utilities.expression_find(skf, el_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject all_hosed_skolems_alt() {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.kb_skolems();
            SubLObject skf = NIL;
            for (skf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skf = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.skolems.skolem_hosedP(skf)) {
                    result = cons(skf, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject all_hosed_skolems() {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_skolems();
        SubLObject skf = NIL;
        skf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != skolem_hosedP(skf)) {
                result = cons(skf, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skf = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject multi_skolem_skolems_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject datum = defn;
                                                    SubLObject current = datum;
                                                    SubLObject constant = NIL;
                                                    SubLObject lispy = NIL;
                                                    SubLObject mt = NIL;
                                                    SubLObject cnfs = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    constant = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    lispy = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    mt = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt84);
                                                    cnfs = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        {
                                                            SubLObject v_2nd_skolem = NIL;
                                                            if (NIL == v_2nd_skolem) {
                                                                {
                                                                    SubLObject csome_list_var = remove(constant, remove_duplicates(list_utilities.flatten(cnfs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    SubLObject v_term = NIL;
                                                                    for (v_term = csome_list_var.first(); !((NIL != v_2nd_skolem) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                                                        if (NIL != isa.isaP(v_term, $$SkolemFunction, mt, UNPROVIDED)) {
                                                                            v_2nd_skolem = v_term;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (NIL != v_2nd_skolem) {
                                                                result = cons(constant, result);
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt84);
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject multi_skolem_skolems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
        SubLObject n = ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                SubLObject key = NIL;
                SubLObject v_defns = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        n = add(n, ONE_INTEGER);
                        note_percent_progress(n, total);
                        SubLObject cdolist_list_var = v_defns;
                        SubLObject defn = NIL;
                        defn = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = defn;
                            SubLObject constant = NIL;
                            SubLObject lispy = NIL;
                            SubLObject mt = NIL;
                            SubLObject cnfs = NIL;
                            destructuring_bind_must_consp(current, datum, $list90);
                            constant = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list90);
                            lispy = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list90);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list90);
                            cnfs = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                SubLObject v_2nd_skolem = NIL;
                                if (NIL == v_2nd_skolem) {
                                    SubLObject csome_list_var = remove(constant, remove_duplicates(list_utilities.flatten(cnfs), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    SubLObject v_term = NIL;
                                    v_term = csome_list_var.first();
                                    while ((NIL == v_2nd_skolem) && (NIL != csome_list_var)) {
                                        if (NIL != isa.isaP(v_term, $$SkolemFunction, mt, UNPROVIDED)) {
                                            v_2nd_skolem = v_term;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        v_term = csome_list_var.first();
                                    } 
                                }
                                if (NIL != v_2nd_skolem) {
                                    result = cons(constant, result);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list90);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            defn = cdolist_list_var.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject misindexed_skolem_keys_alt(SubLObject fixP) {
        if (fixP == UNPROVIDED) {
            fixP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject constant = defn.first();
                                                    if (NIL != forts.fort_p(constant)) {
                                                        if (!key.equal(com.cyc.cycjava.cycl.skolems.skolem_table_key_from_constant(constant))) {
                                                            result = cons(constant, result);
                                                            if (NIL != fixP) {
                                                                com.cyc.cycjava.cycl.skolems.reset_defn_of_skolem(constant, T);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject misindexed_skolem_keys(SubLObject fixP) {
        if (fixP == UNPROVIDED) {
            fixP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
        SubLObject n = ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                SubLObject key = NIL;
                SubLObject v_defns = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        n = add(n, ONE_INTEGER);
                        note_percent_progress(n, total);
                        SubLObject cdolist_list_var = v_defns;
                        SubLObject defn = NIL;
                        defn = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject constant = defn.first();
                            if ((NIL != forts.fort_p(constant)) && (!key.equal(skolem_table_key_from_constant(constant)))) {
                                result = cons(constant, result);
                                if (NIL != fixP) {
                                    reset_defn_of_skolem(constant, T);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            defn = cdolist_list_var.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sk_defns_wXo_sk_constants_alt(SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject constant = defn.first();
                                                    if (NIL == forts.fort_p(constant)) {
                                                        result = cons(list(key, defn), result);
                                                        if (NIL != removeP) {
                                                            {
                                                                SubLObject new_defns = remove(defn, v_defns, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                if (NIL != new_defns) {
                                                                    sethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), new_defns);
                                                                } else {
                                                                    remhash(key, czer_vars.$skolem_axiom_table$.getGlobalValue());
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sk_defns_wXo_sk_constants(SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
        SubLObject n = ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                SubLObject key = NIL;
                SubLObject v_defns = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        n = add(n, ONE_INTEGER);
                        note_percent_progress(n, total);
                        SubLObject cdolist_list_var = v_defns;
                        SubLObject defn = NIL;
                        defn = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject constant = defn.first();
                            if (NIL == forts.fort_p(constant)) {
                                result = cons(list(key, defn), result);
                                if (NIL != removeP) {
                                    final SubLObject new_defns = remove(defn, v_defns, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    if (NIL != new_defns) {
                                        sethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), new_defns);
                                    } else {
                                        remhash(key, czer_vars.$skolem_axiom_table$.getGlobalValue());
                                    }
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            defn = cdolist_list_var.first();
                        } 
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sk_keys_wXo_sk_defns_alt(SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        if (NIL == v_defns) {
                                            result = cons(key, result);
                                            if (NIL != removeP) {
                                                remhash(key, czer_vars.$skolem_axiom_table$.getGlobalValue());
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sk_keys_wXo_sk_defns(SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
        SubLObject n = ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                SubLObject key = NIL;
                SubLObject v_defns = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        n = add(n, ONE_INTEGER);
                        note_percent_progress(n, total);
                        if (NIL == v_defns) {
                            result = cons(key, result);
                            if (NIL == removeP) {
                                continue;
                            }
                            remhash(key, czer_vars.$skolem_axiom_table$.getGlobalValue());
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject install_skolemfunction_fn_in_skolem_defns_alt(SubLObject printP, SubLObject removeP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
                SubLObject n = ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        n = add(n, ONE_INTEGER);
                                        note_percent_progress(n, total);
                                        {
                                            SubLObject new_defns = subst($$SkolemFuncNFn, $$SkolemFuncN, subst($$SkolemFunctionFn, $$SkolemFunction, v_defns, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                            if (NIL != new_defns) {
                                                if (NIL != printP) {
                                                    print(new_defns, UNPROVIDED);
                                                }
                                                if (NIL != removeP) {
                                                    sethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), new_defns);
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject install_skolemfunction_fn_in_skolem_defns(SubLObject printP, SubLObject removeP) {
        if (printP == UNPROVIDED) {
            printP = NIL;
        }
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total = hash_table_count(czer_vars.$skolem_axiom_table$.getGlobalValue());
        SubLObject n = ZERO_INTEGER;
        final SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($$$mapping_skolem_axiom_table);
                SubLObject key = NIL;
                SubLObject v_defns = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        n = add(n, ONE_INTEGER);
                        note_percent_progress(n, total);
                        final SubLObject new_defns = subst($$SkolemFuncNFn, $$SkolemFuncN, subst($$SkolemFunctionFn, $$SkolemFunction, v_defns, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        if (NIL != new_defns) {
                            if (NIL != printP) {
                                print(new_defns, UNPROVIDED);
                            }
                            if (NIL == removeP) {
                                continue;
                            }
                            sethash(key, czer_vars.$skolem_axiom_table$.getGlobalValue(), new_defns);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sk_defns_wXo_mts_alt(SubLObject fixP) {
        if (fixP == UNPROVIDED) {
            fixP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject table_var = czer_vars.$skolem_axiom_table$.getGlobalValue();
                $progress_note$.setDynamicValue($$$mapping_skolem_axiom_table, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject key = NIL;
                            SubLObject v_defns = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        v_defns = getEntryValue(cdohash_entry);
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject cdolist_list_var = v_defns;
                                            SubLObject defn = NIL;
                                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                                {
                                                    SubLObject constant = defn.first();
                                                    SubLObject mt = third(defn);
                                                    if (NIL == mt) {
                                                        result = cons(constant, result);
                                                    }
                                                }
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != fixP) {
                    {
                        SubLObject list_var = result;
                        $progress_note$.setDynamicValue($str_alt90$fixing_skolems_w_o_mts, thread);
                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                        $progress_total$.setDynamicValue(length(list_var), thread);
                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                        {
                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                {
                                    SubLObject csome_list_var = list_var;
                                    SubLObject constant = NIL;
                                    for (constant = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , constant = csome_list_var.first()) {
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        com.cyc.cycjava.cycl.skolems.reset_defn_of_skolem(constant, T);
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sk_defns_wXo_mts(SubLObject fixP) {
        if (fixP == UNPROVIDED) {
            fixP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject table_var = czer_vars.$skolem_axiom_table$.getGlobalValue();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$mapping_skolem_axiom_table, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(hash_table_count(table_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject key = NIL;
                SubLObject v_defns = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        SubLObject cdolist_list_var;
                        v_defns = cdolist_list_var = getEntryValue(cdohash_entry);
                        SubLObject defn = NIL;
                        defn = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject constant = defn.first();
                            final SubLObject mt = third(defn);
                            if (NIL == mt) {
                                result = cons(constant, result);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            defn = cdolist_list_var.first();
                        } 
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        if (NIL != fixP) {
            final SubLObject list_var = result;
            final SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str92$fixing_skolems_w_o_mts, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject constant2 = NIL;
                    constant2 = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        reset_defn_of_skolem(constant2, T);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        constant2 = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_16, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
                $last_percent_progress_index$.rebind(_prev_bind_13, thread);
                $progress_sofar$.rebind(_prev_bind_12, thread);
                $progress_total$.rebind(_prev_bind_11, thread);
                $progress_start_time$.rebind(_prev_bind_10, thread);
                $progress_note$.rebind(_prev_bind_9, thread);
            }
        }
        return result;
    }

    public static final SubLObject skolem_wffP_alt(SubLObject skolem) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.skolems.skolem_defn_not_wffP(com.cyc.cycjava.cycl.skolems.skolem_defn(skolem)));
    }

    public static SubLObject skolem_wffP(final SubLObject skolem) {
        return makeBoolean(NIL == skolem_defn_not_wffP(skolem_defn(skolem)));
    }

    public static final SubLObject skolem_not_wffP_alt(SubLObject skolem) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.skolems.skolem_defn_not_wffP(com.cyc.cycjava.cycl.skolems.skolem_defn(skolem)));
    }

    public static SubLObject skolem_not_wffP(final SubLObject skolem) {
        return list_utilities.sublisp_boolean(skolem_defn_not_wffP(skolem_defn(skolem)));
    }

    public static final SubLObject why_skolem_not_wff_alt(SubLObject skolem) {
        return com.cyc.cycjava.cycl.skolems.why_skolem_defn_not_wff(com.cyc.cycjava.cycl.skolems.skolem_defn(skolem));
    }

    public static SubLObject why_skolem_not_wff(final SubLObject skolem) {
        return why_skolem_defn_not_wff(skolem_defn(skolem));
    }

    public static final SubLObject skolem_defn_wffP_alt(SubLObject skolem_defn) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.skolems.why_skolem_defn_not_wff(skolem_defn));
    }

    public static SubLObject skolem_defn_wffP(final SubLObject skolem_defn) {
        return makeBoolean(NIL == why_skolem_defn_not_wff(skolem_defn));
    }

    public static final SubLObject skolem_defn_not_wffP_alt(SubLObject skolem_defn) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.skolems.why_skolem_defn_not_wff(skolem_defn));
    }

    public static SubLObject skolem_defn_not_wffP(final SubLObject skolem_defn) {
        return list_utilities.sublisp_boolean(why_skolem_defn_not_wff(skolem_defn));
    }

    public static final SubLObject why_skolem_defn_not_wff_alt(SubLObject skolem_defn) {
        {
            SubLObject result = NIL;
            if (NIL == skolem_defn) {
                result = cons($list_alt91, result);
            } else {
                if (skolem_defn.isAtom()) {
                    result = cons(list($SKOLEM_DEFN_NOT_LIST, skolem_defn), result);
                }
            }
            if (NIL != result) {
                return result;
            }
            if (!FOUR_INTEGER.numE(length(skolem_defn))) {
                result = cons(list($SKOLEM_DEFN_MAL_LENGTH, skolem_defn), result);
                if (NIL != result) {
                    nreverse(result);
                }
            }
            {
                SubLObject datum = skolem_defn;
                SubLObject current = datum;
                SubLObject first = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt94);
                first = current.first();
                current = current.rest();
                {
                    SubLObject second = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                    destructuring_bind_must_listp(current, datum, $list_alt94);
                    current = current.rest();
                    {
                        SubLObject third = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt94);
                        current = current.rest();
                        {
                            SubLObject fourth = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                            destructuring_bind_must_listp(current, datum, $list_alt94);
                            current = current.rest();
                            {
                                SubLObject orts = current;
                                if (NIL != orts) {
                                    result = cons(list($SKOLEM_DEFN_ORTS, orts), result);
                                    if (NIL != result) {
                                        return nreverse(result);
                                    }
                                }
                                if (NIL == term.reified_skolem_fnP(first)) {
                                    result = cons(list($SKOLEM_DEFN_MAL_SKOLEM_FORT, first), result);
                                    if (NIL != result) {
                                        return nreverse(result);
                                    }
                                }
                                if (NIL != second) {
                                    if (!(second.isCons() && ((THREE_INTEGER.numE(length(second)) || FOUR_INTEGER.numE(length(second))) || FIVE_INTEGER.numE(length(second))))) {
                                        result = cons(list($SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH, second), result);
                                    } else {
                                        {
                                            SubLObject datum_14 = second;
                                            SubLObject current_15 = datum_14;
                                            SubLObject skolem_fn_function = NIL;
                                            SubLObject args = NIL;
                                            SubLObject var = NIL;
                                            SubLObject seqvar_or_number = NIL;
                                            destructuring_bind_must_consp(current_15, datum_14, $list_alt98);
                                            skolem_fn_function = current_15.first();
                                            current_15 = current_15.rest();
                                            destructuring_bind_must_consp(current_15, datum_14, $list_alt98);
                                            args = current_15.first();
                                            current_15 = current_15.rest();
                                            destructuring_bind_must_consp(current_15, datum_14, $list_alt98);
                                            var = current_15.first();
                                            current_15 = current_15.rest();
                                            destructuring_bind_must_consp(current_15, datum_14, $list_alt98);
                                            seqvar_or_number = current_15.first();
                                            current_15 = current_15.rest();
                                            {
                                                SubLObject number = (current_15.isCons()) ? ((SubLObject) (current_15.first())) : NIL;
                                                destructuring_bind_must_listp(current_15, datum_14, $list_alt98);
                                                current_15 = current_15.rest();
                                                if (NIL == current_15) {
                                                    if (NIL != com.cyc.cycjava.cycl.skolems.old_format_skolemP(second)) {
                                                        number = seqvar_or_number;
                                                    }
                                                    if (NIL == term.skolem_fn_functionP(skolem_fn_function)) {
                                                        result = cons(list($SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE, skolem_fn_function), result);
                                                        if (NIL != result) {
                                                            return nreverse(result);
                                                        }
                                                    }
                                                    if (!((NIL == args) || args.isList())) {
                                                        result = cons(list($SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS, args), result);
                                                        if (NIL != result) {
                                                            return nreverse(result);
                                                        }
                                                    }
                                                    if (!((NIL == number) || (NIL != subl_promotions.memberP(number, args, symbol_function(EQUAL), UNPROVIDED)))) {
                                                        result = cons(list($kw101$SKOLEM_DEFN_ARGS_W_O_NUMBER, args, number), result);
                                                        if (NIL != result) {
                                                            return nreverse(result);
                                                        }
                                                    }
                                                    if (NIL == el_var_listP(remove(number, args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                                        result = cons(list($SKOLEM_DEFN_NON_VAR_ARGS, args), result);
                                                        if (NIL != result) {
                                                            return nreverse(result);
                                                        }
                                                    }
                                                    if (!((NIL != var) && (NIL != cycl_variables.el_varP(var)))) {
                                                        result = cons(list($SKOLEM_DEFN_MAL_SK_VAR, var), result);
                                                        if (NIL != result) {
                                                            return nreverse(result);
                                                        }
                                                    }
                                                    if (((NIL != number) && (skolem_fn_function != $$SkolemFuncNFn)) || ((skolem_fn_function == $$SkolemFuncNFn) && (NIL == number))) {
                                                        result = cons(list($kw104$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH, skolem_fn_function, number), result);
                                                        if (NIL != result) {
                                                            return nreverse(result);
                                                        }
                                                    }
                                                    if (((NIL != number) && number.isList()) && (number.first() == $$Unity)) {
                                                        result = cons(list($SKOLEM_DEFN_OBSOLETE_NUMBER, number), result);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum_14, $list_alt98);
                                                }
                                            }
                                        }
                                    }
                                    if (NIL != result) {
                                        return nreverse(result);
                                    }
                                }
                                if (NIL != third) {
                                    if (NIL == hlmt.hlmtP(third)) {
                                        result = cons(list($SKOLEM_DEFN_MAL_MT, third), result);
                                        if (NIL != result) {
                                            return nreverse(result);
                                        }
                                    }
                                }
                                if (NIL == fourth) {
                                    result = cons($list_alt107, result);
                                    if (NIL != result) {
                                        return nreverse(result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject why_skolem_defn_not_wff(final SubLObject skolem_defn) {
        SubLObject result = NIL;
        if (NIL == skolem_defn) {
            result = cons($list93, result);
        } else
            if (skolem_defn.isAtom()) {
                result = cons(list($SKOLEM_DEFN_NOT_LIST, skolem_defn), result);
            }

        if (NIL != result) {
            return result;
        }
        if (!FOUR_INTEGER.numE(length(skolem_defn))) {
            result = cons(list($SKOLEM_DEFN_MAL_LENGTH, skolem_defn), result);
            if (NIL != result) {
                nreverse(result);
            }
        }
        SubLObject first = NIL;
        destructuring_bind_must_consp(skolem_defn, skolem_defn, $list96);
        first = skolem_defn.first();
        SubLObject current = skolem_defn.rest();
        final SubLObject second = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, skolem_defn, $list96);
        current = current.rest();
        final SubLObject third = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, skolem_defn, $list96);
        current = current.rest();
        final SubLObject fourth = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, skolem_defn, $list96);
        final SubLObject orts;
        current = orts = current.rest();
        if (NIL != orts) {
            result = cons(list($SKOLEM_DEFN_ORTS, orts), result);
            if (NIL != result) {
                return nreverse(result);
            }
        }
        if (NIL == term.reified_skolem_fnP(first)) {
            result = cons(list($SKOLEM_DEFN_MAL_SKOLEM_FORT, first), result);
            if (NIL != result) {
                return nreverse(result);
            }
        }
        if (NIL != second) {
            if ((!second.isCons()) || (((!THREE_INTEGER.numE(length(second))) && (!FOUR_INTEGER.numE(length(second)))) && (!FIVE_INTEGER.numE(length(second))))) {
                result = cons(list($SKOLEM_DEFN_MAL_UNREIFIED_FN_LENGTH, second), result);
            } else {
                SubLObject current_$26;
                final SubLObject datum_$25 = current_$26 = second;
                SubLObject skolem_fn_function = NIL;
                SubLObject args = NIL;
                SubLObject var = NIL;
                SubLObject seqvar_or_number = NIL;
                destructuring_bind_must_consp(current_$26, datum_$25, $list100);
                skolem_fn_function = current_$26.first();
                current_$26 = current_$26.rest();
                destructuring_bind_must_consp(current_$26, datum_$25, $list100);
                args = current_$26.first();
                current_$26 = current_$26.rest();
                destructuring_bind_must_consp(current_$26, datum_$25, $list100);
                var = current_$26.first();
                current_$26 = current_$26.rest();
                destructuring_bind_must_consp(current_$26, datum_$25, $list100);
                seqvar_or_number = current_$26.first();
                current_$26 = current_$26.rest();
                SubLObject number = (current_$26.isCons()) ? current_$26.first() : NIL;
                destructuring_bind_must_listp(current_$26, datum_$25, $list100);
                current_$26 = current_$26.rest();
                if (NIL == current_$26) {
                    if (NIL != old_format_skolemP(second)) {
                        number = seqvar_or_number;
                    }
                    if (NIL == term.skolem_fn_functionP(skolem_fn_function)) {
                        result = cons(list($SKOLEM_DEFN_MAL_SKOLEM_FN_TYPE, skolem_fn_function), result);
                        if (NIL != result) {
                            return nreverse(result);
                        }
                    }
                    if ((NIL != args) && (!args.isList())) {
                        result = cons(list($SKOLEM_DEFN_MAL_SKOLEM_FN_ARGS, args), result);
                        if (NIL != result) {
                            return nreverse(result);
                        }
                    }
                    if ((NIL != number) && (NIL == subl_promotions.memberP(number, args, symbol_function(EQUAL), UNPROVIDED))) {
                        result = cons(list($kw103$SKOLEM_DEFN_ARGS_W_O_NUMBER, args, number), result);
                        if (NIL != result) {
                            return nreverse(result);
                        }
                    }
                    if (NIL == el_var_listP(remove(number, args, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        result = cons(list($SKOLEM_DEFN_NON_VAR_ARGS, args), result);
                        if (NIL != result) {
                            return nreverse(result);
                        }
                    }
                    if ((NIL == var) || (NIL == cycl_variables.el_varP(var))) {
                        result = cons(list($SKOLEM_DEFN_MAL_SK_VAR, var), result);
                        if (NIL != result) {
                            return nreverse(result);
                        }
                    }
                    if (((NIL != number) && (!skolem_fn_function.eql($$SkolemFuncNFn))) || (skolem_fn_function.eql($$SkolemFuncNFn) && (NIL == number))) {
                        result = cons(list($kw106$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH, skolem_fn_function, number), result);
                        if (NIL != result) {
                            return nreverse(result);
                        }
                    }
                    if (((NIL != number) && number.isList()) && number.first().eql($$Unity)) {
                        result = cons(list($SKOLEM_DEFN_OBSOLETE_NUMBER, number), result);
                    }
                } else {
                    cdestructuring_bind_error(datum_$25, $list100);
                }
            }
            if (NIL != result) {
                return nreverse(result);
            }
        }
        if ((NIL != third) && (NIL == hlmt.hlmtP(third))) {
            result = cons(list($SKOLEM_DEFN_MAL_MT, third), result);
            if (NIL != result) {
                return nreverse(result);
            }
        }
        if (NIL == fourth) {
            result = cons($list110, result);
            if (NIL != result) {
                return nreverse(result);
            }
        }
        return nreverse(result);
    }

    public static final SubLObject skolem_all_goodP_alt(SubLObject skf) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.skolems.skolem_function_skolem_assertion_goodP(skf)) && (NIL == com.cyc.cycjava.cycl.skolems.skolem_hosedP(skf)));
    }

    public static SubLObject skolem_all_goodP(final SubLObject skf) {
        return makeBoolean((NIL != skolem_function_skolem_assertion_goodP(skf)) && (NIL == skolem_hosedP(skf)));
    }

    public static final SubLObject skolem_function_skolem_assertion_goodP_alt(SubLObject skf) {
        {
            SubLObject skolem_assertion_count = ZERO_INTEGER;
            SubLObject bad_assertionP = NIL;
            SubLObject pred_var = $$skolem;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(skf, ONE_INTEGER, pred_var)) {
                {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(skf, ONE_INTEGER, pred_var);
                    SubLObject done_var = bad_assertionP;
                    SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        {
                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                            if (NIL != valid) {
                                {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        {
                                            SubLObject done_var_16 = bad_assertionP;
                                            SubLObject token_var_17 = NIL;
                                            while (NIL == done_var_16) {
                                                {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_17);
                                                    SubLObject valid_18 = makeBoolean(token_var_17 != ass);
                                                    if (NIL != valid_18) {
                                                        skolem_assertion_count = add(skolem_assertion_count, ONE_INTEGER);
                                                        {
                                                            SubLObject v_arguments = assertions_high.assertion_arguments(ass);
                                                            if (NIL == list_utilities.singletonP(v_arguments)) {
                                                                bad_assertionP = ass;
                                                                {
                                                                    SubLObject argument = v_arguments.first();
                                                                    if (NIL == deduction_handles.deduction_p(argument)) {
                                                                        bad_assertionP = ass;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var_16 = makeBoolean((NIL == valid_18) || (NIL != bad_assertionP));
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                            }
                                        }
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != bad_assertionP));
                        }
                    } 
                }
            }
            if (NIL != bad_assertionP) {
                return NIL;
            }
            if (!ONE_INTEGER.numE(skolem_assertion_count)) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject skolem_function_skolem_assertion_goodP(final SubLObject skf) {
        SubLObject skolem_assertion_count = ZERO_INTEGER;
        SubLObject bad_assertionP = NIL;
        final SubLObject pred_var = $$skolem;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(skf, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(skf, ONE_INTEGER, pred_var);
            SubLObject done_var = bad_assertionP;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$27 = bad_assertionP;
                        final SubLObject token_var_$28 = NIL;
                        while (NIL == done_var_$27) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$28);
                            final SubLObject valid_$29 = makeBoolean(!token_var_$28.eql(ass));
                            if (NIL != valid_$29) {
                                skolem_assertion_count = add(skolem_assertion_count, ONE_INTEGER);
                                final SubLObject v_arguments = assertions_high.assertion_arguments(ass);
                                if (NIL == list_utilities.singletonP(v_arguments)) {
                                    bad_assertionP = ass;
                                    final SubLObject argument = v_arguments.first();
                                    if (NIL == deduction_handles.deduction_p(argument)) {
                                        bad_assertionP = ass;
                                    }
                                }
                            }
                            done_var_$27 = makeBoolean((NIL == valid_$29) || (NIL != bad_assertionP));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != bad_assertionP));
            } 
        }
        if (NIL != bad_assertionP) {
            return NIL;
        }
        if (!ONE_INTEGER.numE(skolem_assertion_count)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject skolem_functions_with_bad_skolem_assertions_alt() {
        {
            SubLObject bad_skfs = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.kb_skolems();
            SubLObject skf = NIL;
            for (skf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skf = cdolist_list_var.first()) {
                if (NIL == hl_prototypes.hl_prototypical_instanceP(skf)) {
                    if (NIL == com.cyc.cycjava.cycl.skolems.skolem_function_skolem_assertion_goodP(skf)) {
                        bad_skfs = cons(skf, bad_skfs);
                    }
                }
            }
            return nreverse(bad_skfs);
        }
    }

    public static SubLObject skolem_functions_with_bad_skolem_assertions() {
        SubLObject bad_skfs = NIL;
        SubLObject cdolist_list_var = kb_skolems();
        SubLObject skf = NIL;
        skf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == hl_prototypes.hl_prototypical_instanceP(skf)) && (NIL == skolem_function_skolem_assertion_goodP(skf))) {
                bad_skfs = cons(skf, bad_skfs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skf = cdolist_list_var.first();
        } 
        return nreverse(bad_skfs);
    }

    public static final SubLObject diagnose_all_skolems_alt() {
        return com.cyc.cycjava.cycl.skolems.diagnose_skolems(com.cyc.cycjava.cycl.skolems.kb_skolems(), UNPROVIDED);
    }

    public static SubLObject diagnose_all_skolems() {
        return diagnose_skolems(kb_skolems(), UNPROVIDED);
    }

    public static final SubLObject diagnose_skolems_alt(SubLObject v_skolems, SubLObject print_allP) {
        if (print_allP == UNPROVIDED) {
            print_allP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt110$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject cdolist_list_var = v_skolems;
                                    SubLObject skolem = NIL;
                                    for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                                        {
                                            SubLObject maladies = com.cyc.cycjava.cycl.skolems.diagnose_skolem(skolem);
                                            if (NIL != maladies) {
                                                count = add(count, ONE_INTEGER);
                                            }
                                            if ((NIL != maladies) || (NIL != print_allP)) {
                                                format_nil.force_format(T, $str_alt111$_a__a__s__, isa.isa(skolem, UNPROVIDED, UNPROVIDED).first(), skolem, maladies, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_19, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return count;
            }
        }
    }

    public static SubLObject diagnose_skolems(final SubLObject v_skolems, SubLObject print_allP) {
        if (print_allP == UNPROVIDED) {
            print_allP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = v_skolems;
                SubLObject skolem = NIL;
                skolem = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject maladies = diagnose_skolem(skolem);
                    if (NIL != maladies) {
                        count = add(count, ONE_INTEGER);
                    }
                    if ((NIL != maladies) || (NIL != print_allP)) {
                        format_nil.force_format(T, $str113$_a__a__s__, isa.isa(skolem, UNPROVIDED, UNPROVIDED).first(), skolem, maladies, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    skolem = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static final SubLObject diagnose_skolem_alt(SubLObject skolem) {
        {
            SubLObject maladies = com.cyc.cycjava.cycl.skolems.diagnose_just_this_skolem(skolem);
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.skolem_defn_proper_siblings(skolem);
            SubLObject sibling = NIL;
            for (sibling = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling = cdolist_list_var.first()) {
                {
                    SubLObject sibling_maladies = com.cyc.cycjava.cycl.skolems.diagnose_just_this_skolem(sibling);
                    SubLObject items_var = sibling_maladies;
                    if (items_var.isVector()) {
                        {
                            SubLObject vector_var = sibling_maladies;
                            SubLObject backwardP_var = NIL;
                            SubLObject length = length(vector_var);
                            SubLObject v_iteration = NIL;
                            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                {
                                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                    SubLObject item = aref(vector_var, element_num);
                                    SubLObject item_var = item;
                                    if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        maladies = cons(item_var, maladies);
                                    }
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject cdolist_list_var_20 = sibling_maladies;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var_20.first(); NIL != cdolist_list_var_20; cdolist_list_var_20 = cdolist_list_var_20.rest() , item = cdolist_list_var_20.first()) {
                                {
                                    SubLObject item_var = item;
                                    if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        maladies = cons(item_var, maladies);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return maladies;
        }
    }

    public static SubLObject diagnose_skolem(final SubLObject skolem) {
        SubLObject maladies = diagnose_just_this_skolem(skolem);
        SubLObject cdolist_list_var = skolem_defn_proper_siblings(skolem);
        SubLObject sibling = NIL;
        sibling = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject items_var;
            final SubLObject sibling_maladies = items_var = diagnose_just_this_skolem(sibling);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item_var;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = item_var = aref(vector_var, element_num);
                    if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                        maladies = cons(item_var, maladies);
                    }
                }
            } else {
                SubLObject cdolist_list_var_$31 = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var_$31.first();
                while (NIL != cdolist_list_var_$31) {
                    final SubLObject item_var2 = item2;
                    if (NIL == member(item_var2, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                        maladies = cons(item_var2, maladies);
                    }
                    cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                    item2 = cdolist_list_var_$31.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            sibling = cdolist_list_var.first();
        } 
        return maladies;
    }

    public static final SubLObject diagnose_just_this_skolem_internal_alt(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject maladies = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject assertions = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
                            if (NIL != assertions) {
                                {
                                    SubLObject previous_mt = NIL;
                                    SubLObject cdolist_list_var = assertions;
                                    SubLObject ass = NIL;
                                    for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject formula = uncanonicalizer.assertion_el_formula(ass);
                                            SubLObject mt = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject ist_sentence = make_ist_sentence(mt, formula);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject assertions_21 = czer_meta.find_assertions_cycl(formula, mt);
                                                    SubLObject not_foundP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != not_foundP) {
                                                        if (NIL != assertions_21) {
                                                            {
                                                                SubLObject item_var = $PARTIALLY_UNFINDABLE;
                                                                if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    maladies = cons(item_var, maladies);
                                                                }
                                                            }
                                                        } else {
                                                            {
                                                                SubLObject item_var = $UNFINDABLE;
                                                                if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                    maladies = cons(item_var, maladies);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                if ((NIL != assertions_high.rule_assertionP(ass)) && (NIL != assertion_utilities.rule_has_unlabelled_dont_care_variableP(ass))) {
                                                    {
                                                        SubLObject item_var = $FREE_VARIABLE;
                                                        if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            maladies = cons(item_var, maladies);
                                                        }
                                                    }
                                                }
                                                if ((NIL != previous_mt) && (NIL == hlmt.hlmt_equalP(mt, previous_mt))) {
                                                    {
                                                        SubLObject item_var = $MULTIPLE_MTS;
                                                        if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            maladies = cons(item_var, maladies);
                                                        }
                                                    }
                                                }
                                                previous_mt = mt;
                                                if (NIL != list_utilities.simple_tree_findP(skolem, ist_sentence)) {
                                                    {
                                                        SubLObject item_var = $RAW_SKOLEM;
                                                        if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            maladies = cons(item_var, maladies);
                                                        }
                                                    }
                                                }
                                                if (NIL != list_utilities.simple_tree_findP($$SkolemFunctionFn, ist_sentence)) {
                                                    {
                                                        SubLObject item_var = $UNREIFIED_SKOLEM;
                                                        if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            maladies = cons(item_var, maladies);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != subl_promotions.memberP(skolem, $skolems_with_known_issues$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                                maladies = cons($KNOWN_ISSUE, maladies);
                            }
                            {
                                SubLObject items_var = com.cyc.cycjava.cycl.skolems.why_skolem_not_wff(skolem);
                                if (items_var.isVector()) {
                                    {
                                        SubLObject vector_var = com.cyc.cycjava.cycl.skolems.why_skolem_not_wff(skolem);
                                        SubLObject backwardP_var = NIL;
                                        SubLObject length = length(vector_var);
                                        SubLObject v_iteration = NIL;
                                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            {
                                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                                SubLObject item = aref(vector_var, element_num);
                                                maladies = cons(item, maladies);
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.why_skolem_not_wff(skolem);
                                        SubLObject item = NIL;
                                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                            maladies = cons(item, maladies);
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (((NIL != maladies) && (NIL == intersection(maladies, $list_alt120, UNPROVIDED, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.skolems.skolem_safe_to_recanonicalize_at_elP(skolem))) {
                    maladies = NIL;
                }
                return nreverse(maladies);
            }
        }
    }

    public static SubLObject diagnose_just_this_skolem_internal(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject maladies = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject assertions = skolem_defn_assertions(skolem, UNPROVIDED);
            if (NIL != assertions) {
                SubLObject previous_mt = NIL;
                SubLObject cdolist_list_var = assertions;
                SubLObject ass = NIL;
                ass = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject formula = uncanonicalizer.assertion_el_formula(ass);
                    final SubLObject mt = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject ist_sentence = make_ist_sentence(mt, formula);
                    thread.resetMultipleValues();
                    final SubLObject assertions_$32 = czer_meta.find_assertions_cycl(formula, mt);
                    final SubLObject not_foundP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != not_foundP) {
                        if (NIL != assertions_$32) {
                            final SubLObject item_var = $PARTIALLY_UNFINDABLE;
                            if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                maladies = cons(item_var, maladies);
                            }
                        } else {
                            final SubLObject item_var = $UNFINDABLE;
                            if (NIL == member(item_var, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                                maladies = cons(item_var, maladies);
                            }
                        }
                    }
                    if ((NIL != assertions_high.rule_assertionP(ass)) && (NIL != assertion_utilities.rule_has_unlabelled_dont_care_variableP(ass))) {
                        final SubLObject item_var2 = $FREE_VARIABLE;
                        if (NIL == member(item_var2, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                            maladies = cons(item_var2, maladies);
                        }
                    }
                    if ((NIL != previous_mt) && (NIL == hlmt.hlmt_equalP(mt, previous_mt))) {
                        final SubLObject item_var2 = $MULTIPLE_MTS;
                        if (NIL == member(item_var2, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                            maladies = cons(item_var2, maladies);
                        }
                    }
                    previous_mt = mt;
                    if (NIL != list_utilities.simple_tree_findP(skolem, ist_sentence)) {
                        final SubLObject item_var2 = $RAW_SKOLEM;
                        if (NIL == member(item_var2, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                            maladies = cons(item_var2, maladies);
                        }
                    }
                    if (NIL != list_utilities.simple_tree_findP($$SkolemFunctionFn, ist_sentence)) {
                        final SubLObject item_var2 = $UNREIFIED_SKOLEM;
                        if (NIL == member(item_var2, maladies, symbol_function(EQL), symbol_function(IDENTITY))) {
                            maladies = cons(item_var2, maladies);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    ass = cdolist_list_var.first();
                } 
            }
            if (NIL != subl_promotions.memberP(skolem, $skolems_with_known_issues$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                maladies = cons($KNOWN_ISSUE, maladies);
            }
            final SubLObject items_var = why_skolem_not_wff(skolem);
            if (items_var.isVector()) {
                final SubLObject vector_var = items_var;
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject item;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    item = aref(vector_var, element_num);
                    maladies = cons(item, maladies);
                }
            } else {
                SubLObject cdolist_list_var = items_var;
                SubLObject item2 = NIL;
                item2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    maladies = cons(item2, maladies);
                    cdolist_list_var = cdolist_list_var.rest();
                    item2 = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (((NIL != maladies) && (NIL == intersection(maladies, $list122, UNPROVIDED, UNPROVIDED))) && (NIL != skolem_safe_to_recanonicalize_at_elP(skolem))) {
            maladies = NIL;
        }
        return nreverse(maladies);
    }

    public static final SubLObject diagnose_just_this_skolem_alt(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.skolems.diagnose_just_this_skolem_internal(skolem);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DIAGNOSE_JUST_THIS_SKOLEM, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DIAGNOSE_JUST_THIS_SKOLEM, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, DIAGNOSE_JUST_THIS_SKOLEM, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, skolem, $kw29$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw29$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.skolems.diagnose_just_this_skolem_internal(skolem)));
                        memoization_state.caching_state_put(caching_state, skolem, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject diagnose_just_this_skolem(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return diagnose_just_this_skolem_internal(skolem);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, DIAGNOSE_JUST_THIS_SKOLEM, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), DIAGNOSE_JUST_THIS_SKOLEM, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, DIAGNOSE_JUST_THIS_SKOLEM, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, skolem, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(diagnose_just_this_skolem_internal(skolem)));
            memoization_state.caching_state_put(caching_state, skolem, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject recanonicalize_skolem_defn_assertions_alt(SubLObject skolem) {
        {
            SubLObject result = NIL;
            SubLObject ass = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED).first();
            if (NIL != assertion_handles.valid_assertionP(ass, UNPROVIDED)) {
                {
                    SubLObject message_var = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    result = cons(ke.ke_recanonicalize_assertion_now(ass, assertion_utilities.meta_assertion_list_for_editing(ass)), result);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                    if (message_var.isString()) {
                        Errors.warn($str_alt66$_A, message_var);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject recanonicalize_skolem_defn_assertions(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject ass = skolem_defn_assertions(skolem, UNPROVIDED).first();
        if (NIL != assertion_handles.valid_assertionP(ass, UNPROVIDED)) {
            SubLObject message_var = NIL;
            final SubLObject was_appendingP = eval($append_stack_traces_to_error_messagesP$);
            eval($list68);
            try {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            result = cons(ke.ke_recanonicalize_assertion_now(ass, assertion_utilities.meta_assertion_list_for_editing(ass)), result);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    eval(list(CSETQ, $append_stack_traces_to_error_messagesP$, was_appendingP));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
            if (message_var.isString()) {
                Errors.warn($str71$_A, message_var);
            }
        }
        return nreverse(result);
    }

    public static final SubLObject skolem_safe_to_recanonicalize_at_elP_alt(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != subl_promotions.memberP(skolem, $skolems_safe_to_recanonicalize_at_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            {
                SubLObject el_formula = NIL;
                SubLObject el_mt = NIL;
                SubLObject opaque_el_formula = NIL;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
                SubLObject ass = NIL;
                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                    thread.resetMultipleValues();
                    {
                        SubLObject this_el_formula = uncanonicalizer.assertion_el_formula(ass);
                        SubLObject this_el_mt = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject this_opaque_el_formula = cycl_utilities.expression_transform(this_el_formula, $sym15$EL_VAR_, FALSE, UNPROVIDED, UNPROVIDED);
                            if ((NIL != el_formula) && (NIL != list_utilities.not_equal(opaque_el_formula, this_opaque_el_formula))) {
                                Errors.warn($str_alt122$different_el_formulas_for__a____s, skolem, el_formula, this_el_formula);
                                return NIL;
                            }
                            el_formula = this_el_formula;
                            el_mt = this_el_mt;
                            opaque_el_formula = this_opaque_el_formula;
                        }
                    }
                }
                {
                    SubLObject result = NIL;
                    {
                        SubLObject _prev_bind_0 = $target_consequent_literal_count$.currentBinding(thread);
                        try {
                            $target_consequent_literal_count$.bind(com.cyc.cycjava.cycl.skolems.compute_target_consequent_literal_count(skolem), thread);
                            result = makeBoolean(((((((((NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list_alt123)) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list_alt124))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list_alt125))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list_alt126))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list_alt127))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list_alt128))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list_alt129))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list_alt130))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list_alt131)));
                        } finally {
                            $target_consequent_literal_count$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
        }
    }

    public static SubLObject skolem_safe_to_recanonicalize_at_elP(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(skolem, $skolems_safe_to_recanonicalize_at_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        SubLObject el_formula = NIL;
        SubLObject el_mt = NIL;
        SubLObject opaque_el_formula = NIL;
        SubLObject cdolist_list_var = skolem_defn_assertions(skolem, UNPROVIDED);
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject this_el_formula = uncanonicalizer.assertion_el_formula(ass);
            final SubLObject this_el_mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject this_opaque_el_formula = cycl_utilities.expression_transform(this_el_formula, $sym15$EL_VAR_, FALSE, UNPROVIDED, UNPROVIDED);
            if ((NIL != el_formula) && (NIL != list_utilities.not_equal(opaque_el_formula, this_opaque_el_formula))) {
                Errors.warn($str124$different_el_formulas_for__a____s, skolem, el_formula, this_el_formula);
                return NIL;
            }
            el_formula = this_el_formula;
            el_mt = this_el_mt;
            opaque_el_formula = this_opaque_el_formula;
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $target_consequent_literal_count$.currentBinding(thread);
        try {
            $target_consequent_literal_count$.bind(compute_target_consequent_literal_count(skolem), thread);
            result = makeBoolean(((((((((NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list125)) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list126))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list127))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list128))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list129))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list130))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list131))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list132))) || (NIL != formula_pattern_match.formula_matches_pattern(el_formula, $list133)));
        } finally {
            $target_consequent_literal_count$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * The number of unique CNFs for SKOLEM's defn assertions.
     * Basically the # of defn assertions, but doesn't double count mt duplication.
     */
    @LispMethod(comment = "The number of unique CNFs for SKOLEM\'s defn assertions.\r\nBasically the # of defn assertions, but doesn\'t double count mt duplication.\nThe number of unique CNFs for SKOLEM\'s defn assertions.\nBasically the # of defn assertions, but doesn\'t double count mt duplication.")
    public static final SubLObject compute_target_consequent_literal_count_alt(SubLObject skolem) {
        {
            SubLObject v_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
            SubLObject ass = NIL;
            for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                set.set_add(assertions_high.assertion_cnf(ass), v_set);
            }
            return set.set_size(v_set);
        }
    }

    @LispMethod(comment = "The number of unique CNFs for SKOLEM\'s defn assertions.\r\nBasically the # of defn assertions, but doesn\'t double count mt duplication.\nThe number of unique CNFs for SKOLEM\'s defn assertions.\nBasically the # of defn assertions, but doesn\'t double count mt duplication.")
    public static SubLObject compute_target_consequent_literal_count(final SubLObject skolem) {
        final SubLObject v_set = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = skolem_defn_assertions(skolem, UNPROVIDED);
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(assertions_high.assertion_cnf(ass), v_set);
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        return set.set_size(v_set);
    }/**
     * The number of unique CNFs for SKOLEM's defn assertions.
     * Basically the # of defn assertions, but doesn't double count mt duplication.
     */


    public static final SubLObject conjunction_of_literalsP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_conjunction_p(v_object)) {
                if (NIL != formula_arityE(v_object, $target_consequent_literal_count$.getDynamicValue(thread), UNPROVIDED)) {
                    {
                        SubLObject args = cycl_utilities.formula_args(v_object, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject lit = NIL;
                        for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                            if (NIL == el_grammar.el_literal_p(lit)) {
                                return NIL;
                            }
                        }
                    }
                }
                return T;
            } else {
                if (NIL != el_grammar.el_literal_p(v_object)) {
                    return number_utilities.onep($target_consequent_literal_count$.getDynamicValue(thread));
                }
            }
            return NIL;
        }
    }

    public static SubLObject conjunction_of_literalsP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_conjunction_p(v_object)) {
            if (NIL != formula_arityE(v_object, $target_consequent_literal_count$.getDynamicValue(thread), UNPROVIDED)) {
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(v_object, $IGNORE);
                SubLObject lit = NIL;
                lit = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == el_grammar.el_literal_p(lit)) {
                        return NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    lit = cdolist_list_var.first();
                } 
            }
            return T;
        }
        if (NIL != el_grammar.el_literal_p(v_object)) {
            return number_utilities.onep($target_consequent_literal_count$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject modernize_skolem_axiom_table_alt() {
        {
            SubLObject key = NIL;
            SubLObject v_defns = NIL;
            {
                final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        v_defns = getEntryValue(cdohash_entry);
                        {
                            SubLObject cdolist_list_var = v_defns;
                            SubLObject defn = NIL;
                            for (defn = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , defn = cdolist_list_var.first()) {
                                {
                                    SubLObject unreified_sk_term = second(defn);
                                    SubLObject modern_unreified_sk_term = com.cyc.cycjava.cycl.skolems.possibly_modernize_unreified_sk_term(unreified_sk_term);
                                    list_utilities.nreplace_nth(ONE_INTEGER, modern_unreified_sk_term, defn);
                                }
                            }
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    public static SubLObject modernize_skolem_axiom_table() {
        SubLObject key = NIL;
        SubLObject v_defns = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(czer_vars.$skolem_axiom_table$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                v_defns = cdolist_list_var = getEntryValue(cdohash_entry);
                SubLObject defn = NIL;
                defn = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject unreified_sk_term = second(defn);
                    final SubLObject modern_unreified_sk_term = possibly_modernize_unreified_sk_term(unreified_sk_term);
                    list_utilities.nreplace_nth(ONE_INTEGER, modern_unreified_sk_term, defn);
                    cdolist_list_var = cdolist_list_var.rest();
                    defn = cdolist_list_var.first();
                } 
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static final SubLObject possibly_modernize_unreified_sk_term_alt(SubLObject unreified_sk_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.skolems.old_format_skolemP(unreified_sk_term)) {
                {
                    SubLObject datum = unreified_sk_term;
                    SubLObject current = datum;
                    SubLObject skolem_type = NIL;
                    SubLObject vars = NIL;
                    SubLObject sk_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt133);
                    skolem_type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt133);
                    vars = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt133);
                    sk_var = current.first();
                    current = current.rest();
                    {
                        SubLObject number = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt133);
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject result = com.cyc.cycjava.cycl.skolems.make_unreified_sk_nat(vars, sk_var, NIL, number);
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (skolem_type != cycl_utilities.nat_functor(result)) {
                                        Errors.error($str_alt134$Skolem_type_mismatch___a__a__a, unreified_sk_term, skolem_type, result);
                                    }
                                }
                                return result;
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt133);
                        }
                    }
                }
            }
            return unreified_sk_term;
        }
    }

    public static SubLObject possibly_modernize_unreified_sk_term(final SubLObject unreified_sk_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != old_format_skolemP(unreified_sk_term)) {
            SubLObject skolem_type = NIL;
            SubLObject vars = NIL;
            SubLObject sk_var = NIL;
            destructuring_bind_must_consp(unreified_sk_term, unreified_sk_term, $list135);
            skolem_type = unreified_sk_term.first();
            SubLObject current = unreified_sk_term.rest();
            destructuring_bind_must_consp(current, unreified_sk_term, $list135);
            vars = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, unreified_sk_term, $list135);
            sk_var = current.first();
            current = current.rest();
            final SubLObject number = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, unreified_sk_term, $list135);
            current = current.rest();
            if (NIL == current) {
                final SubLObject result = make_unreified_sk_nat(vars, sk_var, NIL, number);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!skolem_type.eql(cycl_utilities.nat_functor(result)))) {
                    Errors.error($str136$Skolem_type_mismatch___a__a__a, unreified_sk_term, skolem_type, result);
                }
                return result;
            }
            cdestructuring_bind_error(unreified_sk_term, $list135);
        }
        return unreified_sk_term;
    }

    public static final SubLObject skolems_with_mismatched_unreified_sk_terms_alt() {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.skolems.kb_skolems();
            SubLObject skolem = NIL;
            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                {
                    SubLObject matchP = com.cyc.cycjava.cycl.skolems.skolem_unreified_sk_terms_matchP(skolem);
                    if (NIL == matchP) {
                        result = cons(skolem, result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject skolems_with_mismatched_unreified_sk_terms() {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_skolems();
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject matchP = skolem_unreified_sk_terms_matchP(skolem);
            if (NIL == matchP) {
                result = cons(skolem, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject skolem_unreified_sk_terms_matchP_alt(SubLObject skolem) {
        {
            SubLObject mismatchP = NIL;
            if (!((NIL != list_utilities.member_eqP(skolem, $skolems_with_known_issues$.getGlobalValue())) || (NIL != list_utilities.member_eqP(skolem, $skolems_safe_to_recanonicalize_at_el$.getGlobalValue())))) {
                {
                    SubLObject fresh_unreified_sk_term = second(com.cyc.cycjava.cycl.skolems.skolem_defn_from_assertions(skolem, UNPROVIDED));
                    SubLObject hl_unreified_sk_term = com.cyc.cycjava.cycl.skolems.compute_unreified_sk_term_via_hl(skolem);
                    if (!fresh_unreified_sk_term.equal(hl_unreified_sk_term)) {
                        mismatchP = T;
                        {
                            SubLObject reason_string = $str_alt135$;
                            if (NIL != com.cyc.cycjava.cycl.skolems.tmi_skolemP(skolem)) {
                                reason_string = $str_alt136$temporalMicrotheoriesIntersect_;
                            }
                            format_nil.force_format(T, $str_alt137$___amismatch_for__a___a___a__, reason_string, skolem, fresh_unreified_sk_term, hl_unreified_sk_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            }
            return makeBoolean(NIL == mismatchP);
        }
    }

    public static SubLObject skolem_unreified_sk_terms_matchP(final SubLObject skolem) {
        SubLObject mismatchP = NIL;
        if ((NIL == list_utilities.member_eqP(skolem, $skolems_with_known_issues$.getGlobalValue())) && (NIL == list_utilities.member_eqP(skolem, $skolems_safe_to_recanonicalize_at_el$.getGlobalValue()))) {
            final SubLObject fresh_unreified_sk_term = second(skolem_defn_from_assertions(skolem, UNPROVIDED));
            final SubLObject hl_unreified_sk_term = compute_unreified_sk_term_via_hl(skolem);
            if (!fresh_unreified_sk_term.equal(hl_unreified_sk_term)) {
                mismatchP = T;
                SubLObject reason_string = $str137$;
                if (NIL != tmi_skolemP(skolem)) {
                    reason_string = $$$temporalMicrotheoriesIntersect_;
                }
                format_nil.force_format(T, $str139$___amismatch_for__a___a___a__, reason_string, skolem, fresh_unreified_sk_term, hl_unreified_sk_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return makeBoolean(NIL == mismatchP);
    }

    public static final SubLObject possibly_nrepair_skolems_with_duplicate_vars_alt(SubLObject v_skolems) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_skolems;
            SubLObject skolem = NIL;
            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.skolems.possibly_nrepair_skolem_with_duplicate_vars(skolem)) {
                    result = cons(skolem, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject possibly_nrepair_skolems_with_duplicate_vars(final SubLObject v_skolems) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_skolems;
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != possibly_nrepair_skolem_with_duplicate_vars(skolem)) {
                result = cons(skolem, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject possibly_nrepair_skolem_with_duplicate_vars_alt(SubLObject skolem) {
        if (NIL != list_utilities.duplicatesP(second(second(com.cyc.cycjava.cycl.skolems.skolem_defn(skolem))), UNPROVIDED, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.skolems.nrepair_skolem_with_duplicate_vars(skolem);
        }
        return NIL;
    }

    public static SubLObject possibly_nrepair_skolem_with_duplicate_vars(final SubLObject skolem) {
        if (NIL != list_utilities.duplicatesP(second(second(skolem_defn(skolem))), UNPROVIDED, UNPROVIDED)) {
            return nrepair_skolem_with_duplicate_vars(skolem);
        }
        return NIL;
    }

    public static final SubLObject nrepair_skolem_with_duplicate_vars_alt(SubLObject skolem) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject defn = com.cyc.cycjava.cycl.skolems.skolem_defn(skolem);
                SubLObject unreified_sk_term = com.cyc.cycjava.cycl.skolems.possibly_modernize_unreified_sk_term(second(defn));
                SubLObject datum = unreified_sk_term;
                SubLObject current = datum;
                SubLObject sk_fn = NIL;
                SubLObject vars = NIL;
                SubLObject var = NIL;
                SubLObject seqvar = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt138);
                sk_fn = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt138);
                vars = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt138);
                var = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt138);
                seqvar = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (sk_fn != $$SkolemFunctionFn) {
                            Errors.error($$$Error);
                        }
                    }
                    {
                        SubLObject dupe_var = list_utilities.only_one(list_utilities.duplicates(vars, UNPROVIDED, UNPROVIDED));
                        SubLObject new_vars = list_utilities.remove_first(dupe_var, vars, UNPROVIDED);
                        SubLObject new_unreified_sk_term = com.cyc.cycjava.cycl.skolems.make_unreified_sk_nat(new_vars, var, seqvar, dupe_var);
                        list_utilities.nreplace_nth(ONE_INTEGER, new_unreified_sk_term, defn);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt138);
                }
                return defn;
            }
        }
    }

    public static SubLObject nrepair_skolem_with_duplicate_vars(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defn = skolem_defn(skolem);
        final SubLObject unreified_sk_term = possibly_modernize_unreified_sk_term(second(defn));
        SubLObject current;
        final SubLObject datum = current = unreified_sk_term;
        SubLObject sk_fn = NIL;
        SubLObject vars = NIL;
        SubLObject var = NIL;
        SubLObject seqvar = NIL;
        destructuring_bind_must_consp(current, datum, $list140);
        sk_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list140);
        vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list140);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list140);
        seqvar = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!sk_fn.eql($$SkolemFunctionFn))) {
                Errors.error($$$Error);
            }
            final SubLObject dupe_var = list_utilities.only_one(list_utilities.duplicates(vars, UNPROVIDED, UNPROVIDED));
            final SubLObject new_vars = list_utilities.remove_first(dupe_var, vars, UNPROVIDED);
            final SubLObject new_unreified_sk_term = make_unreified_sk_nat(new_vars, var, seqvar, dupe_var);
            list_utilities.nreplace_nth(ONE_INTEGER, new_unreified_sk_term, defn);
        } else {
            cdestructuring_bind_error(datum, $list140);
        }
        return defn;
    }

    public static final SubLObject possibly_nrepair_skolems_with_malformed_numbers_alt(SubLObject v_skolems) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_skolems;
            SubLObject skolem = NIL;
            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.skolems.possibly_nrepair_skolem_with_malformed_numbers(skolem)) {
                    result = cons(skolem, result);
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject possibly_nrepair_skolems_with_malformed_numbers(final SubLObject v_skolems) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_skolems;
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != possibly_nrepair_skolem_with_malformed_numbers(skolem)) {
                result = cons(skolem, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject possibly_nrepair_skolem_with_malformed_numbers_alt(SubLObject skolem) {
        {
            SubLObject cdolist_list_var = second(second(com.cyc.cycjava.cycl.skolems.skolem_defn(skolem)));
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.skolems.skolem_scalar_termP(var, UNPROVIDED)) {
                    return com.cyc.cycjava.cycl.skolems.nrepair_skolem_with_malformed_numbers(skolem);
                }
            }
        }
        return NIL;
    }

    public static SubLObject possibly_nrepair_skolem_with_malformed_numbers(final SubLObject skolem) {
        SubLObject cdolist_list_var = second(second(skolem_defn(skolem)));
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != skolem_scalar_termP(var, UNPROVIDED)) {
                return nrepair_skolem_with_malformed_numbers(skolem);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject nrepair_skolem_with_malformed_numbers_alt(SubLObject skolem) {
        {
            SubLObject defn = com.cyc.cycjava.cycl.skolems.skolem_defn(skolem);
            SubLObject unreified_sk_term = com.cyc.cycjava.cycl.skolems.possibly_modernize_unreified_sk_term(second(defn));
            SubLObject datum = unreified_sk_term;
            SubLObject current = datum;
            SubLObject sk_fn = NIL;
            SubLObject vars = NIL;
            SubLObject var = NIL;
            SubLObject seqvar = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt140);
            sk_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            vars = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            var = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt140);
            seqvar = current.first();
            current = current.rest();
            {
                SubLObject existing_number = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                destructuring_bind_must_listp(current, datum, $list_alt140);
                current = current.rest();
                if (NIL == current) {
                    if ($$SkolemFunctionFn == sk_fn) {
                        {
                            SubLObject sk_number = list_utilities.only_one(list_utilities.remove_if_not($sym141$SKOLEM_SCALAR_TERM_, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                            SubLObject new_vars = remove_if($sym141$SKOLEM_SCALAR_TERM_, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject new_unreified_sk_term = com.cyc.cycjava.cycl.skolems.make_unreified_sk_nat(new_vars, var, seqvar, sk_number);
                            list_utilities.nreplace_nth(ONE_INTEGER, new_unreified_sk_term, defn);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt140);
                }
            }
            return defn;
        }
    }

    public static SubLObject nrepair_skolem_with_malformed_numbers(final SubLObject skolem) {
        final SubLObject defn = skolem_defn(skolem);
        final SubLObject unreified_sk_term = possibly_modernize_unreified_sk_term(second(defn));
        SubLObject current;
        final SubLObject datum = current = unreified_sk_term;
        SubLObject sk_fn = NIL;
        SubLObject vars = NIL;
        SubLObject var = NIL;
        SubLObject seqvar = NIL;
        destructuring_bind_must_consp(current, datum, $list142);
        sk_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list142);
        vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list142);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list142);
        seqvar = current.first();
        current = current.rest();
        final SubLObject existing_number = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list142);
        current = current.rest();
        if (NIL == current) {
            if ($$SkolemFunctionFn.eql(sk_fn)) {
                final SubLObject sk_number = list_utilities.only_one(list_utilities.remove_if_not($sym143$SKOLEM_SCALAR_TERM_, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                final SubLObject new_vars = remove_if($sym143$SKOLEM_SCALAR_TERM_, vars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject new_unreified_sk_term = make_unreified_sk_nat(new_vars, var, seqvar, sk_number);
                list_utilities.nreplace_nth(ONE_INTEGER, new_unreified_sk_term, defn);
            }
        } else {
            cdestructuring_bind_error(datum, $list142);
        }
        return defn;
    }

    public static final SubLObject tmi_skolemP_alt(SubLObject skolem) {
        if (NIL != valid_constantP(skolem, UNPROVIDED)) {
            {
                SubLObject assertions = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
                if (NIL != list_utilities.lengthE(assertions, TWO_INTEGER, UNPROVIDED)) {
                    {
                        SubLObject datum = assertions;
                        SubLObject current = datum;
                        SubLObject ass1 = NIL;
                        SubLObject ass2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt142);
                        ass1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt142);
                        ass2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (((((NIL != assertions_high.gaf_assertionP(ass1)) && (NIL != assertions_high.gaf_assertionP(ass2))) && (NIL != el_formula_with_operator_p(assertions_high.gaf_formula(ass2), $$temporalMicrotheoriesIntersect))) && (NIL != list_utilities.tree_find($$SkolemFunctionFn, assertions_high.assertion_mt(ass1), UNPROVIDED, UNPROVIDED))) && (NIL != list_utilities.tree_find($$SkolemFunctionFn, assertions_high.assertion_mt(ass2), UNPROVIDED, UNPROVIDED))) {
                                return T;
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt142);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject tmi_skolemP(final SubLObject skolem) {
        if (NIL != valid_constantP(skolem, UNPROVIDED)) {
            final SubLObject assertions = skolem_defn_assertions(skolem, UNPROVIDED);
            if (NIL != list_utilities.lengthE(assertions, TWO_INTEGER, UNPROVIDED)) {
                SubLObject current;
                final SubLObject datum = current = assertions;
                SubLObject ass1 = NIL;
                SubLObject ass2 = NIL;
                destructuring_bind_must_consp(current, datum, $list144);
                ass1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list144);
                ass2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (((((NIL != assertions_high.gaf_assertionP(ass1)) && (NIL != assertions_high.gaf_assertionP(ass2))) && (NIL != el_formula_with_operator_p(assertions_high.gaf_formula(ass2), $$temporalMicrotheoriesIntersect))) && (NIL != list_utilities.tree_find($$SkolemFunctionFn, assertions_high.assertion_mt(ass1), UNPROVIDED, UNPROVIDED))) && (NIL != list_utilities.tree_find($$SkolemFunctionFn, assertions_high.assertion_mt(ass2), UNPROVIDED, UNPROVIDED))) {
                        return T;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list144);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject recanonicalize_tmi_skolems_alt(SubLObject v_skolems) {
        {
            SubLObject cdolist_list_var = v_skolems;
            SubLObject skolem = NIL;
            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.skolems.recanonicalize_tmi_skolem(skolem);
            }
        }
        return NIL;
    }

    public static SubLObject recanonicalize_tmi_skolems(final SubLObject v_skolems) {
        SubLObject cdolist_list_var = v_skolems;
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            recanonicalize_tmi_skolem(skolem);
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Recanonicalizes one of a set of broken #$temporalMicrotheoriesIntersect skolems
     */
    @LispMethod(comment = "Recanonicalizes one of a set of broken #$temporalMicrotheoriesIntersect skolems")
    public static final SubLObject recanonicalize_tmi_skolem_alt(SubLObject skolem) {
        if (NIL != com.cyc.cycjava.cycl.skolems.tmi_skolemP(skolem)) {
            {
                SubLObject datum = com.cyc.cycjava.cycl.skolems.skolem_defn_assertions(skolem, UNPROVIDED);
                SubLObject current = datum;
                SubLObject content_ass = NIL;
                SubLObject tmi_ass = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt144);
                content_ass = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt144);
                tmi_ass = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject sentence = assertions_high.gaf_formula(content_ass);
                        SubLObject monad = hlmt.hlmt_monad_mt(assertions_high.assertion_mt(content_ass));
                        cyc_kernel.cyc_assert_wff(list($$thereExists, $sym146$_TIME, list($$ist, listS($$MtSpace, monad, $list_alt149), listS($$and, sentence, $list_alt151))), $$BaseKB, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt144);
                }
            }
            cyc_kernel.cyc_kill(skolem);
            return T;
        }
        return NIL;
    }

    @LispMethod(comment = "Recanonicalizes one of a set of broken #$temporalMicrotheoriesIntersect skolems")
    public static SubLObject recanonicalize_tmi_skolem(final SubLObject skolem) {
        if (NIL != tmi_skolemP(skolem)) {
            SubLObject current;
            final SubLObject datum = current = skolem_defn_assertions(skolem, UNPROVIDED);
            SubLObject content_ass = NIL;
            SubLObject tmi_ass = NIL;
            destructuring_bind_must_consp(current, datum, $list146);
            content_ass = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list146);
            tmi_ass = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject sentence = assertions_high.gaf_formula(content_ass);
                final SubLObject monad = hlmt.hlmt_monad_mt(assertions_high.assertion_mt(content_ass));
                cyc_kernel.cyc_assert_wff(list($$thereExists, $sym148$_TIME, list($$ist, listS($$MtSpace, monad, $list151), listS($$and, sentence, $list153))), $$BaseKB, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list146);
            }
            cyc_kernel.cyc_kill(skolem);
            return T;
        }
        return NIL;
    }/**
     * Recanonicalizes one of a set of broken #$temporalMicrotheoriesIntersect skolems
     */


    public static final SubLObject possibly_rehabilitate_skolem_defn_table_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.skolems.skolem_table_contains_old_format_skolemsP()) {
                com.cyc.cycjava.cycl.skolems.modernize_skolem_axiom_table();
                com.cyc.cycjava.cycl.skolems.possibly_nrepair_skolems_with_duplicate_vars(fort_types_interface.all_forts_of_type($$SkolemFunction));
                com.cyc.cycjava.cycl.skolems.possibly_nrepair_skolems_with_malformed_numbers(fort_types_interface.all_forts_of_type($$SkolemFunction));
                com.cyc.cycjava.cycl.skolems.recanonicalize_tmi_skolems($list_alt153);
                {
                    SubLObject list_var = $skolems_safe_to_recanonicalize_at_el$.getGlobalValue();
                    $progress_note$.setDynamicValue($$$recanonicalizing_skolems, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(length(list_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject csome_list_var = list_var;
                                SubLObject skolem = NIL;
                                for (skolem = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , skolem = csome_list_var.first()) {
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    if (NIL != valid_constantP(skolem, UNPROVIDED)) {
                                        com.cyc.cycjava.cycl.skolems.recanonicalize_skolem_defn_assertions(skolem);
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject possibly_rehabilitate_skolem_defn_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != skolem_table_contains_old_format_skolemsP()) {
            modernize_skolem_axiom_table();
            possibly_nrepair_skolems_with_duplicate_vars(fort_types_interface.all_forts_of_type($$SkolemFunction));
            possibly_nrepair_skolems_with_malformed_numbers(fort_types_interface.all_forts_of_type($$SkolemFunction));
            recanonicalize_tmi_skolems($list155);
            final SubLObject list_var = $skolems_safe_to_recanonicalize_at_el$.getGlobalValue();
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$recanonicalizing_skolems, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject skolem = NIL;
                    skolem = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != valid_constantP(skolem, UNPROVIDED)) {
                            recanonicalize_skolem_defn_assertions(skolem);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        skolem = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject skolems_that_are_unfindable_via_el() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject node_var = $$SkolemFunction;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$34 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$37 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str168$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$34, UNPROVIDED);
                                        while (NIL != node_var_$34) {
                                            final SubLObject tt_node_var = node_var_$34;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$39 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$46;
                                                                            for (iteration_state_$46 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$46); iteration_state_$46 = dictionary_contents.do_dictionary_contents_next(iteration_state_$46)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$46);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject skolem;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                skolem = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, skolem)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skolem, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(skolem, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if ((NIL == subl_promotions.memberP(skolem, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != skolem_unfindable_via_elP(skolem))) {
                                                                                                        result = cons(skolem, result);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject skolem2 = NIL;
                                                                                                skolem2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skolem2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(skolem2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL == subl_promotions.memberP(skolem2, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != skolem_unfindable_via_elP(skolem2))) {
                                                                                                            result = cons(skolem2, result);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    skolem2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$41, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$46);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$40, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str170$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list171);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list171);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list171);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject skolem;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            skolem = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, skolem)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skolem, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(skolem, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if ((NIL == subl_promotions.memberP(skolem, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != skolem_unfindable_via_elP(skolem))) {
                                                                                                    result = cons(skolem, result);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$50 = sol;
                                                                                            SubLObject skolem2 = NIL;
                                                                                            skolem2 = csome_list_var_$50.first();
                                                                                            while (NIL != csome_list_var_$50) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skolem2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(skolem2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if ((NIL == subl_promotions.memberP(skolem2, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != skolem_unfindable_via_elP(skolem2))) {
                                                                                                        result = cons(skolem2, result);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$50 = csome_list_var_$50.rest();
                                                                                                skolem2 = csome_list_var_$50.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$43, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$42, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list171);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$51;
                                                            final SubLObject new_list = cdolist_list_var_$51 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$51.first();
                                                            while (NIL != cdolist_list_var_$51) {
                                                                final SubLObject _prev_bind_0_$44 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject skolem3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            skolem3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, skolem3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skolem3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(skolem3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if ((NIL == subl_promotions.memberP(skolem3, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != skolem_unfindable_via_elP(skolem3))) {
                                                                                    result = cons(skolem3, result);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject skolem4 = NIL;
                                                                            skolem4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skolem4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(skolem4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if ((NIL == subl_promotions.memberP(skolem4, $skolems_known_to_be_unfindable_via_el$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != skolem_unfindable_via_elP(skolem4))) {
                                                                                        result = cons(skolem4, result);
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                skolem4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$44, thread);
                                                                }
                                                                cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                                                                generating_fn = cdolist_list_var_$51.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$40, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$39, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$45 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$34);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$47;
                                                                            for (iteration_state_$47 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$47); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next(iteration_state_$47)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$47);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$47, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$47);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$46, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str170$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$52;
                                                            final SubLObject new_list2 = cdolist_list_var_$52 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$52.first();
                                                            while (NIL != cdolist_list_var_$52) {
                                                                final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$48, thread);
                                                                }
                                                                cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                                                generating_fn2 = cdolist_list_var_$52.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$41, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$45, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$34 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$39, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$38, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str172$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$38, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$37, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$36, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$35, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("SKOLEM-TERM"));

    static private final SubLList $list_alt2 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLString $str_alt7$unreified_skolem_term_references_ = makeString("unreified-skolem-term references unknown skolem type: ~s");

    static private final SubLString $str_alt11$skolem_args____s_vs__s = makeString("skolem-args : ~s vs ~s");

    static private final SubLList $list_alt18 = list(makeSymbol("OLD-SK-CONSTANT"), makeSymbol("OLD-UNREIFIED-SK-TERM"), makeSymbol("SK-MT"), makeSymbol("OLD-DEFN"));

    public static final SubLSymbol $kw29$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt32 = list(makeSymbol("SKOLEM-TYPE"), makeSymbol("VARS"), makeSymbol("SK-VAR"), makeSymbol("SEQVAR-OR-NUMBER"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));

    static private final SubLString $str_alt33$Multiple_skolem_sequence_variable = makeString("Multiple skolem sequence variables: ~a ~a ~a");

    static private final SubLString $str_alt34$SkolemFuncN_appears_as_SkolemFunc = makeString("SkolemFuncN appears as SkolemFunction: ~a");

    public static SubLObject skolem_unfindable_via_elP(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = skolem_defn_assertions(skolem, UNPROVIDED);
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject formula = uncanonicalizer.assertion_el_formula(ass);
            final SubLObject mt = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject assertions = czer_meta.find_assertions_cycl(formula, mt);
            final SubLObject not_foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != not_foundP) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLList $list_alt36 = list(makeSymbol("SK-CONSTANT"), makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("MT"), makeSymbol("CNFS"));

    static private final SubLString $str_alt47$_in_gaf_has_corresponding_cnf_in_ = makeString("[in gaf-has-corresponding-cnf-in-skolem-defn?] skolem ~s is not a skolem constant");

    public static SubLObject bad_skolem_assertions(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bad_skfs = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject node_var = $$SkolemFunction;
            final SubLObject _prev_bind_0_$62 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$63 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$64 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$63 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str168$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str163$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$66 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$66 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$72 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$64, UNPROVIDED);
                                            while (NIL != node_var_$64) {
                                                final SubLObject tt_node_var = node_var_$64;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$67 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$68 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$76;
                                                                                for (iteration_state_$76 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$76); iteration_state_$76 = dictionary_contents.do_dictionary_contents_next(iteration_state_$76)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$76);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject skf;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    skf = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, skf)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skf, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(skf, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL == hl_prototypes.hl_prototypical_instanceP(skf)) && (NIL == skolem_function_skolem_assertion_goodP(skf))) {
                                                                                                            if (NIL != verboseP) {
                                                                                                                format(T, $str173$Bad_skolem_function___A__, skf);
                                                                                                            }
                                                                                                            bad_skfs = cons(skf, bad_skfs);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject skf2 = NIL;
                                                                                                    skf2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skf2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(skf2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((NIL == hl_prototypes.hl_prototypical_instanceP(skf2)) && (NIL == skolem_function_skolem_assertion_goodP(skf2))) {
                                                                                                                if (NIL != verboseP) {
                                                                                                                    format(T, $str173$Bad_skolem_function___A__, skf2);
                                                                                                                }
                                                                                                                bad_skfs = cons(skf2, bad_skfs);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        skf2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$69, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$76);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$68, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str170$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list171);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list171);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list171);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject skf;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                skf = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, skf)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skf, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(skf, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if ((NIL == hl_prototypes.hl_prototypical_instanceP(skf)) && (NIL == skolem_function_skolem_assertion_goodP(skf))) {
                                                                                                        if (NIL != verboseP) {
                                                                                                            format(T, $str173$Bad_skolem_function___A__, skf);
                                                                                                        }
                                                                                                        bad_skfs = cons(skf, bad_skfs);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$80 = sol;
                                                                                                SubLObject skf2 = NIL;
                                                                                                skf2 = csome_list_var_$80.first();
                                                                                                while (NIL != csome_list_var_$80) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skf2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(skf2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if ((NIL == hl_prototypes.hl_prototypical_instanceP(skf2)) && (NIL == skolem_function_skolem_assertion_goodP(skf2))) {
                                                                                                            if (NIL != verboseP) {
                                                                                                                format(T, $str173$Bad_skolem_function___A__, skf2);
                                                                                                            }
                                                                                                            bad_skfs = cons(skf2, bad_skfs);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$80 = csome_list_var_$80.rest();
                                                                                                    skf2 = csome_list_var_$80.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$71, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$70, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list171);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$81;
                                                                final SubLObject new_list = cdolist_list_var_$81 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$81.first();
                                                                while (NIL != cdolist_list_var_$81) {
                                                                    final SubLObject _prev_bind_0_$72 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject skf3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                skf3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, skf3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skf3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(skf3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if ((NIL == hl_prototypes.hl_prototypical_instanceP(skf3)) && (NIL == skolem_function_skolem_assertion_goodP(skf3))) {
                                                                                        if (NIL != verboseP) {
                                                                                            format(T, $str173$Bad_skolem_function___A__, skf3);
                                                                                        }
                                                                                        bad_skfs = cons(skf3, bad_skfs);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject skf4 = NIL;
                                                                                skf4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(skf4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(skf4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if ((NIL == hl_prototypes.hl_prototypical_instanceP(skf4)) && (NIL == skolem_function_skolem_assertion_goodP(skf4))) {
                                                                                            if (NIL != verboseP) {
                                                                                                format(T, $str173$Bad_skolem_function___A__, skf4);
                                                                                            }
                                                                                            bad_skfs = cons(skf4, bad_skfs);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    skf4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$72, thread);
                                                                    }
                                                                    cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                                                                    generating_fn = cdolist_list_var_$81.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$67, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$67, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$73 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$68 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$64);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$77;
                                                                                for (iteration_state_$77 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$77); iteration_state_$77 = dictionary_contents.do_dictionary_contents_next(iteration_state_$77)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$77);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$75, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$77);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$74, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str170$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$82;
                                                                final SubLObject new_list2 = cdolist_list_var_$82 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$82.first();
                                                                while (NIL != cdolist_list_var_$82) {
                                                                    final SubLObject _prev_bind_0_$76 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str169$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$76, thread);
                                                                    }
                                                                    cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                                                                    generating_fn2 = cdolist_list_var_$82.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$68, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$73, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$64 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$72, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$66, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$66, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str172$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$65, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$65, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$64, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$64, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$77 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$63, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$78 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$63, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$62, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nreverse(bad_skfs);
    }

    static private final SubLSymbol $sym52$REIFIED_SKOLEM_FN_IN_ANY_MT_ = makeSymbol("REIFIED-SKOLEM-FN-IN-ANY-MT?");

    static private final SubLString $str_alt53$recomputing_skolem_defn_info_cons = makeString("recomputing-skolem-defn-info-constant called when not recomputing a skolem defn");

    static private final SubLString $str_alt54$recomputing_skolem_defn_info_var_ = makeString("recomputing-skolem-defn-info-var called when not recomputing a skolem defn");

    static private final SubLString $str_alt55$really_recomputing_skolem_defn__c = makeString("really-recomputing-skolem-defn? called when not recomputing a skolem defn");

    static private final SubLString $str_alt56$recomputing_skolem_defn_info_defn = makeString("recomputing-skolem-defn-info-defn called when not recomputing a skolem defn");

    static private final SubLString $str_alt57$recomputing_skolem_defn_info_key_ = makeString("recomputing-skolem-defn-info-key called when not recomputing a skolem defn");

    static private final SubLString $str_alt58$recomputing_skolem_defn_info_blis = makeString("recomputing-skolem-defn-info-blist called when not recomputing a skolem defn");

    static private final SubLString $str_alt59$set_recomputing_skolem_defn_resul = makeString("set-recomputing-skolem-defn-result called when not recomputing a skolem defn");

    static private final SubLString $str_alt60$set_recomputing_skolem_defn_blist = makeString("set-recomputing-skolem-defn-blist called when not recomputing a skolem defn");

    static private final SubLString $str_alt62$note_skolem_binding_called_when_n = makeString("note-skolem-binding called when not recomputing a skolem defn");

    static private final SubLString $str_alt63$Total_KB_Skolems___a = makeString("Total KB Skolems: ~a");

    static private final SubLString $str_alt66$_A = makeString("~A");

    static private final SubLString $str_alt67$____reified_skolem__a_not_known_t = makeString("~%~%reified skolem ~a not known to be an instance of #$SkolemFunction");

    static private final SubLString $str_alt72$__disjoint_result_types___s____s = makeString("~%disjoint result types: ~s : ~s");

    static private final SubLString $str_alt73$__explicit_result_types___s____s = makeString("~%explicit result types: ~s : ~s");

    static private final SubLString $str_alt74$__tacit_result_isa___s____s = makeString("~%tacit result isa: ~s : ~s");

    static private final SubLString $str_alt75$__no_result_types___s = makeString("~%no result types: ~s");

    static private final SubLString $str_alt76$__tacit_result_genl___s____s = makeString("~%tacit result genl: ~s : ~s");

    static private final SubLList $list_alt78 = list(reader_make_constant_shell("NonNegativeScalarInterval"));

    static private final SubLList $list_alt80 = list(makeSymbol("SKOLEM"), makeSymbol("UNREIFIED-SK-TERM"), makeSymbol("MT"), makeSymbol("CNFS"));

    static private final SubLString $str_alt81$__tacit_arg__s_type___s____s = makeString("~%tacit arg ~s type: ~s : ~s");

    static private final SubLString $str_alt82$__no_arg__s_type___s____s = makeString("~%no arg ~s type: ~s : ~s");

    static private final SubLList $list_alt84 = list(makeSymbol("CONSTANT"), makeSymbol("LISPY"), makeSymbol("MT"), makeSymbol("CNFS"));

    static private final SubLString $str_alt86$mapping__skolem_axiom_table_ = makeString("mapping *skolem-axiom-table*");

    static private final SubLSymbol $sym87$_ = makeSymbol(">");

    static private final SubLList $list_alt89 = cons(makeSymbol("CONSTANT"), makeSymbol("DATA"));

    static private final SubLString $str_alt90$fixing_skolems_w_o_mts = makeString("fixing skolems w/o mts");

    static private final SubLList $list_alt91 = list(makeKeyword("SKOLEM-DEFN-MISSING"));

    static private final SubLList $list_alt94 = listS(makeSymbol("FIRST"), makeSymbol("&OPTIONAL"), makeSymbol("SECOND"), makeSymbol("THIRD"), makeSymbol("FOURTH"), makeSymbol("ORTS"));

    static private final SubLList $list_alt98 = list(makeSymbol("SKOLEM-FN-FUNCTION"), makeSymbol("ARGS"), makeSymbol("VAR"), makeSymbol("SEQVAR-OR-NUMBER"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));

    public static final SubLSymbol $kw101$SKOLEM_DEFN_ARGS_W_O_NUMBER = makeKeyword("SKOLEM-DEFN-ARGS-W/O-NUMBER");

    public static final SubLSymbol $kw104$SKOLEM_DEFN_ARGS_SK_TYPE_NUMBER_MISMATCH = makeKeyword("SKOLEM-DEFN-ARGS-SK-TYPE/NUMBER-MISMATCH");

    static private final SubLList $list_alt107 = list(makeKeyword("SKOLEM-DEFN-W/O-CLAUSES"));

    static private final SubLList $list_alt108 = list(new SubLObject[]{ reader_make_constant_shell("ThePrototypicalFixedAritySkolemFunction"), reader_make_constant_shell("SKF-4855075916"), reader_make_constant_shell("SKF-9401565"), reader_make_constant_shell("SKF-30608153"), reader_make_constant_shell("SKF-358427"), reader_make_constant_shell("SKF-981029"), reader_make_constant_shell("SKF-378457"), reader_make_constant_shell("SKF-7897525238"), reader_make_constant_shell("SKF-23426283"), reader_make_constant_shell("SKF-4978723980"), reader_make_constant_shell("SKF-8095780367"), reader_make_constant_shell("SKF-2283707389"), reader_make_constant_shell("SKF-3819196850"), reader_make_constant_shell("SKF-2177078880"), reader_make_constant_shell("SKF-9178370244"), reader_make_constant_shell("SKF-2313708415"), reader_make_constant_shell("SKF-54808499"), reader_make_constant_shell("SKF-2396342019"), reader_make_constant_shell("SKF-0540013113"), reader_make_constant_shell("SKF-7329112212"), reader_make_constant_shell("SKF-2463549462"), reader_make_constant_shell("SKF-7267986583"), reader_make_constant_shell("SKF-2341431804"), reader_make_constant_shell("SKF-5635570701"), reader_make_constant_shell("SKF-8712676684"), reader_make_constant_shell("SKF-6439069748"), reader_make_constant_shell("SKF-3035846539"), reader_make_constant_shell("SKF-9609006789"), reader_make_constant_shell("SKF-2094656502"), reader_make_constant_shell("SKF-1622895730"), reader_make_constant_shell("SKF-6034791567"), reader_make_constant_shell("SKF-8429706273"), reader_make_constant_shell("SKF-5002539315"), reader_make_constant_shell("SKF-7731242586"), reader_make_constant_shell("SKF-1935351914"), reader_make_constant_shell("SKF-5819554541"), reader_make_constant_shell("SKF-7665225690"), reader_make_constant_shell("SKF-5742181768"), reader_make_constant_shell("SKF-7774820049"), reader_make_constant_shell("SKF-9832002172"), reader_make_constant_shell("SKF-9099460346"), reader_make_constant_shell("SKF-6802057837"), reader_make_constant_shell("SKF-0233545031"), reader_make_constant_shell("SKF-7143243607"), reader_make_constant_shell("SKF-5547792583"), reader_make_constant_shell("SKF-1970550724"), reader_make_constant_shell("SKF-2043784885"), reader_make_constant_shell("SKF-1714183462"), reader_make_constant_shell("SKF-6071957396"), reader_make_constant_shell("SKF-7004599156"), reader_make_constant_shell("SKF-0633671947"), reader_make_constant_shell("SKF-4928965872"), reader_make_constant_shell("SKF-4365040835"), reader_make_constant_shell("SKF-9778251013"), reader_make_constant_shell("SKF-8146092452"), reader_make_constant_shell("SKF-0882987459"), reader_make_constant_shell("SKF-6693421741"), reader_make_constant_shell("SKF-1800635573"), reader_make_constant_shell("SKF-5174206356"), reader_make_constant_shell("SKF-8137704160"), reader_make_constant_shell("SKF-6138620537"), reader_make_constant_shell("SKF-6954747722"), reader_make_constant_shell("SKF-8822929547"), reader_make_constant_shell("SKF-6574888924"), reader_make_constant_shell("SKF-4648710733"), reader_make_constant_shell("SKF-3574121958"), reader_make_constant_shell("SKF-7111033530"), reader_make_constant_shell("SKF-1259710929"), reader_make_constant_shell("SKF-9511328868"), reader_make_constant_shell("SKF-7988430072"), reader_make_constant_shell("SKF-9334424285"), reader_make_constant_shell("SKF-0241028856"), reader_make_constant_shell("SKF-8824048486"), reader_make_constant_shell("SKF-4709173148"), reader_make_constant_shell("SKF-9085853324"), reader_make_constant_shell("SKF-5615627058"), reader_make_constant_shell("SKF-6491665291"), reader_make_constant_shell("SKF-0256832978"), reader_make_constant_shell("SKF-1494753028"), reader_make_constant_shell("SKF-3439360561"), reader_make_constant_shell("SKF-4359556905"), reader_make_constant_shell("SKF-1746016905"), reader_make_constant_shell("SKF-4430979996"), reader_make_constant_shell("SKF-5792768502"), reader_make_constant_shell("SKF-5965884944"), reader_make_constant_shell("SKF-4975731367"), reader_make_constant_shell("SKF-2918153882"), reader_make_constant_shell("SKF-0992686716"), reader_make_constant_shell("SKF-8537516687"), reader_make_constant_shell("SKF-7685719048"), reader_make_constant_shell("SKF-1488659619"), reader_make_constant_shell("SKF-9837174340"), reader_make_constant_shell("SKF-0372211184"), reader_make_constant_shell("SKF-6796242698"), reader_make_constant_shell("SKF-4631282123"), reader_make_constant_shell("SKF-8747036173"), reader_make_constant_shell("SKF-9214557550"), reader_make_constant_shell("SKF-2969771224"), reader_make_constant_shell("SKF-3201009743"), reader_make_constant_shell("SKF-8199787846"), reader_make_constant_shell("SKF-1857924337"), reader_make_constant_shell("SKF-2577476768"), reader_make_constant_shell("SKF-9606922473"), reader_make_constant_shell("SKF-3890236588"), reader_make_constant_shell("SKF-2976547342"), reader_make_constant_shell("SKF-2734536924"), reader_make_constant_shell("SKF-4107434815"), reader_make_constant_shell("SKF-8121330546"), reader_make_constant_shell("SKF-0714339318"), reader_make_constant_shell("SKF-3616130689"), reader_make_constant_shell("SKF-4918966"), reader_make_constant_shell("SKF-12370394"), reader_make_constant_shell("SKF-58467056"), reader_make_constant_shell("SKF-61049284"), reader_make_constant_shell("SKF-14302329"), reader_make_constant_shell("SKF-4779393528"), reader_make_constant_shell("SKF-1305979122"), reader_make_constant_shell("SKF-7033956451"), reader_make_constant_shell("SKF-4442841559") });

    public static final SubLObject $list_alt109 = com.cyc.cycjava.cycl.skolems._constant_109_initializer();

    static private final SubLString $str_alt110$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt111$_a__a__s__ = makeString("~a ~a ~s~%");

    static private final SubLList $list_alt120 = list(makeKeyword("RAW-SKOLEM"), makeKeyword("UNREIFIED-SKOLEM"), makeKeyword("FREE-VARIABLE"));

    static private final SubLString $str_alt122$different_el_formulas_for__a____s = makeString("different el formulas for ~a:~%~s~%~s");

    static private final SubLList $list_alt123 = list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?")));

    static private final SubLList $list_alt124 = list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?"))));

    static private final SubLList $list_alt125 = list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?")))));

    static private final SubLList $list_alt126 = list(reader_make_constant_shell("implies"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?"))));

    static private final SubLList $list_alt127 = list(reader_make_constant_shell("implies"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?")))));

    static private final SubLList $list_alt128 = list(reader_make_constant_shell("implies"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?"))))));

    static private final SubLList $list_alt129 = list(reader_make_constant_shell("implies"), makeKeyword("ANYTHING"), list(list($TEST, makeSymbol("CYC-CONST-BOUNDED-EXISTENTIAL-OPERATOR-P")), list($TEST, makeSymbol("GROUND?")), list($TEST, makeSymbol("EL-VAR?")), list($TEST, makeSymbol("CONJUNCTION-OF-LITERALS?"))));

    static private final SubLList $list_alt130 = list(reader_make_constant_shell("and"), list($TEST, makeSymbol("EL-LITERAL-P")), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("temporalMicrotheoriesIntersect"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))));

    static private final SubLList $list_alt131 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("thereExists"), list($TEST, makeSymbol("EL-VAR?")), list(reader_make_constant_shell("temporalMicrotheoriesIntersect"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"))), list($TEST, makeSymbol("EL-LITERAL-P")));

    static private final SubLList $list_alt133 = list(makeSymbol("SKOLEM-TYPE"), makeSymbol("VARS"), makeSymbol("SK-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("NUMBER"));

    static private final SubLString $str_alt134$Skolem_type_mismatch___a__a__a = makeString("Skolem type mismatch: ~a ~a ~a");

    static private final SubLString $str_alt136$temporalMicrotheoriesIntersect_ = makeString("temporalMicrotheoriesIntersect ");

    static private final SubLString $str_alt137$___amismatch_for__a___a___a__ = makeString("~%~amismatch for ~a~%~a~%~a~%");

    static private final SubLList $list_alt138 = list(makeSymbol("SK-FN"), makeSymbol("VARS"), makeSymbol("VAR"), makeSymbol("SEQVAR"));

    static private final SubLList $list_alt140 = list(makeSymbol("SK-FN"), makeSymbol("VARS"), makeSymbol("VAR"), makeSymbol("SEQVAR"), makeSymbol("&OPTIONAL"), makeSymbol("EXISTING-NUMBER"));

    static private final SubLSymbol $sym141$SKOLEM_SCALAR_TERM_ = makeSymbol("SKOLEM-SCALAR-TERM?");

    static private final SubLList $list_alt142 = list(makeSymbol("ASS1"), makeSymbol("ASS2"));

    static private final SubLList $list_alt144 = list(makeSymbol("CONTENT-ASS"), makeSymbol("TMI-ASS"));

    static private final SubLSymbol $sym146$_TIME = makeSymbol("?TIME");

    static private final SubLList $list_alt149 = list(list(reader_make_constant_shell("MtTimeDimFn"), makeSymbol("?TIME")));

    static private final SubLList $list_alt151 = list(list(reader_make_constant_shell("temporalMicrotheoriesIntersect"), list(reader_make_constant_shell("MtTimeDimFn"), makeSymbol("?TIME")), list(reader_make_constant_shell("MtTimeWithGranularityDimFn"), list(reader_make_constant_shell("IntervalEndedByFn"), reader_make_constant_shell("Now-Indexical")), reader_make_constant_shell("TimePoint"))));

    static private final SubLList $list_alt153 = list(new SubLObject[]{ reader_make_constant_shell("SKF-2172650888"), reader_make_constant_shell("SKF-6548862369"), reader_make_constant_shell("SKF-8409811003"), reader_make_constant_shell("SKF-7363528201"), reader_make_constant_shell("SKF-1358114357"), reader_make_constant_shell("SKF-4072021064"), reader_make_constant_shell("SKF-1681761679"), reader_make_constant_shell("SKF-2548755082"), reader_make_constant_shell("SKF-6067931751"), reader_make_constant_shell("SKF-5709128133"), reader_make_constant_shell("SKF-1590734700"), reader_make_constant_shell("SKF-5134195828"), reader_make_constant_shell("SKF-3907269039"), reader_make_constant_shell("SKF-6454474627"), reader_make_constant_shell("SKF-9567857250"), reader_make_constant_shell("SKF-5128698501"), reader_make_constant_shell("SKF-0849952130"), reader_make_constant_shell("SKF-5716409094"), reader_make_constant_shell("SKF-9715593487"), reader_make_constant_shell("SKF-4012481774"), reader_make_constant_shell("SKF-9973400181"), reader_make_constant_shell("SKF-4749210628"), reader_make_constant_shell("SKF-7688139609"), reader_make_constant_shell("SKF-7103881989"), reader_make_constant_shell("SKF-5296958920"), reader_make_constant_shell("SKF-9684239747"), reader_make_constant_shell("SKF-9283857452"), reader_make_constant_shell("SKF-8076090600"), reader_make_constant_shell("SKF-8853185369"), reader_make_constant_shell("SKF-2870709283"), reader_make_constant_shell("SKF-4865105368"), reader_make_constant_shell("SKF-6632523431"), reader_make_constant_shell("SKF-8236383708"), reader_make_constant_shell("SKF-0341790583"), reader_make_constant_shell("SKF-5342612010") });

    public static final SubLObject declare_skolems_file_alt() {
        declareFunction("reify_skolems_in", "REIFY-SKOLEMS-IN", 4, 0, false);
        declareFunction("canonicalize_fns_in_sk_term", "CANONICALIZE-FNS-IN-SK-TERM", 1, 0, false);
        declareFunction("subst_skolem_in", "SUBST-SKOLEM-IN", 3, 0, false);
        declareFunction("skolem_function_dependent_vars", "SKOLEM-FUNCTION-DEPENDENT-VARS", 1, 0, false);
        declareFunction("skolem_function_var", "SKOLEM-FUNCTION-VAR", 1, 0, false);
        declareFunction("skolem_args", "SKOLEM-ARGS", 3, 0, false);
        declareFunction("canonicalize_skolem_term", "CANONICALIZE-SKOLEM-TERM", 4, 0, false);
        declareFunction("replace_unreified_skolem_terms_with_variables", "REPLACE-UNREIFIED-SKOLEM-TERMS-WITH-VARIABLES", 1, 0, false);
        declareFunction("lookup_sk_constant_from_defns", "LOOKUP-SK-CONSTANT-FROM-DEFNS", 3, 0, false);
        declareFunction("defn_unreified_sk_term", "DEFN-UNREIFIED-SK-TERM", 3, 0, false);
        declareFunction("skolem_collection", "SKOLEM-COLLECTION", 1, 0, false);
        declareFunction("create_skolem", "CREATE-SKOLEM", 5, 0, false);
        declareFunction("sk_defn_from_clauses", "SK-DEFN-FROM-CLAUSES", 2, 1, false);
        declareFunction("alpha_sort_clauses", "ALPHA-SORT-CLAUSES", 1, 0, false);
        declareFunction("rename_skolem_clause_vars", "RENAME-SKOLEM-CLAUSE-VARS", 2, 1, false);
        declareFunction("sk_defn_var", "SK-DEFN-VAR", 0, 0, false);
        declareFunction("clear_formula_constant_str", "CLEAR-FORMULA-CONSTANT-STR", 0, 0, false);
        declareFunction("remove_formula_constant_str", "REMOVE-FORMULA-CONSTANT-STR", 1, 0, false);
        declareFunction("formula_constant_str_internal", "FORMULA-CONSTANT-STR-INTERNAL", 1, 0, false);
        declareFunction("formula_constant_str", "FORMULA-CONSTANT-STR", 1, 0, false);
        declareFunction("cyc_var_except_for_x_0P", "CYC-VAR-EXCEPT-FOR-X-0?", 1, 0, false);
        declareFunction("make_sk_defn", "MAKE-SK-DEFN", 4, 0, false);
        declareFunction("sk_arity", "SK-ARITY", 1, 1, false);
        declareFunction("make_unreified_sk_nat", "MAKE-UNREIFIED-SK-NAT", 4, 0, false);
        declareFunction("skolem_defn", "SKOLEM-DEFN", 1, 0, false);
        declareFunction("skolem_defnXkey", "SKOLEM-DEFN&KEY", 1, 0, false);
        declareFunction("skolem_defn_key", "SKOLEM-DEFN-KEY", 1, 0, false);
        declareFunction("skolem_of_defn", "SKOLEM-OF-DEFN", 1, 0, false);
        declareFunction("unreified_sk_term", "UNREIFIED-SK-TERM", 1, 0, false);
        declareFunction("skolem_defn_mt", "SKOLEM-DEFN-MT", 1, 0, false);
        declareFunction("skolem_seqvar", "SKOLEM-SEQVAR", 1, 0, false);
        declareFunction("skolem_defn_seqvar", "SKOLEM-DEFN-SEQVAR", 1, 0, false);
        declareFunction("old_format_skolemP", "OLD-FORMAT-SKOLEM?", 1, 0, false);
        declareFunction("skolem_number", "SKOLEM-NUMBER", 1, 0, false);
        declareFunction("skolem_defn_number", "SKOLEM-DEFN-NUMBER", 1, 0, false);
        declareFunction("skolem_defn_args", "SKOLEM-DEFN-ARGS", 1, 0, false);
        declareFunction("skolem_var", "SKOLEM-VAR", 1, 0, false);
        declareFunction("el_unreified_sk_term", "EL-UNREIFIED-SK-TERM", 1, 0, false);
        declareFunction("compute_unreified_sk_term_via_hl", "COMPUTE-UNREIFIED-SK-TERM-VIA-HL", 1, 0, false);
        declareFunction("compute_skolem_info_from_assertions", "COMPUTE-SKOLEM-INFO-FROM-ASSERTIONS", 2, 0, false);
        declareFunction("skolem_table_key_from_defn", "SKOLEM-TABLE-KEY-FROM-DEFN", 1, 0, false);
        declareFunction("skolem_table_key_from_constant", "SKOLEM-TABLE-KEY-FROM-CONSTANT", 1, 0, false);
        declareFunction("skolem_hash_key", "SKOLEM-HASH-KEY", 2, 0, false);
        declareFunction("opaquify_unreified_skolem_terms", "OPAQUIFY-UNREIFIED-SKOLEM-TERMS", 1, 0, false);
        declareFunction("skolem_defns_from_key_specification", "SKOLEM-DEFNS-FROM-KEY-SPECIFICATION", 2, 0, false);
        declareFunction("cnfs_of_skolem_defn", "CNFS-OF-SKOLEM-DEFN", 1, 0, false);
        declareFunction("mt_of_skolem_defn", "MT-OF-SKOLEM-DEFN", 1, 0, false);
        declareFunction("skolem_defn_cnfs", "SKOLEM-DEFN-CNFS", 1, 0, false);
        declareFunction("skolem_defn_assertions_robust", "SKOLEM-DEFN-ASSERTIONS-ROBUST", 1, 1, false);
        declareFunction("skolem_function_has_no_defn_assertions_robustP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS-ROBUST?", 1, 0, false);
        declareFunction("skolem_function_has_no_defn_assertionsP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS?", 1, 0, false);
        declareFunction("skolem_defining_bookkeeping_assertion", "SKOLEM-DEFINING-BOOKKEEPING-ASSERTION", 1, 0, false);
        declareFunction("skolem_defn_assertions", "SKOLEM-DEFN-ASSERTIONS", 1, 1, false);
        declareFunction("skolems_defn_assertions", "SKOLEMS-DEFN-ASSERTIONS", 1, 0, false);
        declareFunction("skolem_defn_siblings", "SKOLEM-DEFN-SIBLINGS", 1, 0, false);
        declareFunction("skolem_defn_proper_siblings", "SKOLEM-DEFN-PROPER-SIBLINGS", 1, 0, false);
        declareFunction("skolem_canonical_sibling", "SKOLEM-CANONICAL-SIBLING", 1, 0, false);
        declareFunction("skolems_min_mt", "SKOLEMS-MIN-MT", 1, 0, false);
        declareFunction("skolem_only_mentioned_in_el_templatesP", "SKOLEM-ONLY-MENTIONED-IN-EL-TEMPLATES?", 2, 0, false);
        declareFunction("skolem_defn_assertionP", "SKOLEM-DEFN-ASSERTION?", 2, 1, false);
        declareFunction("gaf_has_corresponding_cnf_in_skolem_defnP", "GAF-HAS-CORRESPONDING-CNF-IN-SKOLEM-DEFN?", 2, 1, false);
        declareFunction("constant_denoting_reified_skolem_fnP", "CONSTANT-DENOTING-REIFIED-SKOLEM-FN?", 1, 0, false);
        declareFunction("computed_skolem_assertionP", "COMPUTED-SKOLEM-ASSERTION?", 1, 0, false);
        declareFunction("skolem_defining_assertionP", "SKOLEM-DEFINING-ASSERTION?", 1, 0, false);
        declareFunction("defn_assertion_of_skolemP", "DEFN-ASSERTION-OF-SKOLEM?", 2, 0, false);
        declareFunction("assertion_skolems", "ASSERTION-SKOLEMS", 1, 0, false);
        declareFunction("defn_assertion_skolems", "DEFN-ASSERTION-SKOLEMS", 1, 0, false);
        declareFunction("all_skolem_mt_defn_assertions", "ALL-SKOLEM-MT-DEFN-ASSERTIONS", 2, 1, false);
        declareFunction("recomputing_skolem_defn_info_constant", "RECOMPUTING-SKOLEM-DEFN-INFO-CONSTANT", 0, 0, false);
        declareFunction("recomputing_skolem_defn_info_var", "RECOMPUTING-SKOLEM-DEFN-INFO-VAR", 0, 0, false);
        declareFunction("really_recomputing_skolem_defnP", "REALLY-RECOMPUTING-SKOLEM-DEFN?", 0, 0, false);
        declareFunction("recomputing_skolem_defn_info_defn", "RECOMPUTING-SKOLEM-DEFN-INFO-DEFN", 0, 0, false);
        declareFunction("recomputing_skolem_defn_info_key", "RECOMPUTING-SKOLEM-DEFN-INFO-KEY", 0, 0, false);
        declareFunction("recomputing_skolem_defn_info_blist", "RECOMPUTING-SKOLEM-DEFN-INFO-BLIST", 0, 0, false);
        declareFunction("set_recomputing_skolem_defn_result", "SET-RECOMPUTING-SKOLEM-DEFN-RESULT", 2, 0, false);
        declareFunction("set_recomputing_skolem_defn_blist", "SET-RECOMPUTING-SKOLEM-DEFN-BLIST", 1, 0, false);
        declareFunction("recomputing_skolem_defnP", "RECOMPUTING-SKOLEM-DEFN?", 0, 0, false);
        declareFunction("recomputing_defn_of_skolemP", "RECOMPUTING-DEFN-OF-SKOLEM?", 1, 0, false);
        declareFunction("recomputing_skolem_defn_ofP", "RECOMPUTING-SKOLEM-DEFN-OF?", 1, 0, false);
        declareFunction("note_skolem_binding", "NOTE-SKOLEM-BINDING", 2, 0, false);
        declareFunction("recompute_skolem_defn", "RECOMPUTE-SKOLEM-DEFN", 6, 0, false);
        declareFunction("remove_defn_of_skolem", "REMOVE-DEFN-OF-SKOLEM", 1, 1, false);
        declareFunction("add_skolem_defn", "ADD-SKOLEM-DEFN", 1, 1, false);
        declareFunction("kb_skolems", "KB-SKOLEMS", 0, 0, false);
        declareFunction("skolem_table_contains_old_format_skolemsP", "SKOLEM-TABLE-CONTAINS-OLD-FORMAT-SKOLEMS?", 0, 0, false);
        declareFunction("reset_skolem_defn_table", "RESET-SKOLEM-DEFN-TABLE", 0, 2, false);
        declareFunction("reset_defn_of_skolem", "RESET-DEFN-OF-SKOLEM", 1, 1, false);
        declareFunction("skolem_defn_from_assertions", "SKOLEM-DEFN-FROM-ASSERTIONS", 1, 1, false);
        declareFunction("reset_skolem_defn_from_assertions", "RESET-SKOLEM-DEFN-FROM-ASSERTIONS", 1, 2, false);
        declareFunction("skolem_variable_from_assertions", "SKOLEM-VARIABLE-FROM-ASSERTIONS", 2, 0, false);
        declareFunction("skolem_scalar_termP", "SKOLEM-SCALAR-TERM?", 1, 1, false);
        declareFunction("skolem_result_types_from_cnfs", "SKOLEM-RESULT-TYPES-FROM-CNFS", 2, 2, false);
        declareFunction("guess_skolem_result_types_from_cnfs", "GUESS-SKOLEM-RESULT-TYPES-FROM-CNFS", 3, 2, false);
        declareFunction("skolem_cnfs_pos_lit_types", "SKOLEM-CNFS-POS-LIT-TYPES", 2, 1, false);
        declareFunction("skolem_var_isa_constraints_wrt_cnfs", "SKOLEM-VAR-ISA-CONSTRAINTS-WRT-CNFS", 2, 1, false);
        declareFunction("skolem_var_genl_constraints_wrt_cnfs", "SKOLEM-VAR-GENL-CONSTRAINTS-WRT-CNFS", 2, 1, false);
        declareFunction("skolem_arg_isa_constraints", "SKOLEM-ARG-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("install_skolem_arg_types", "INSTALL-SKOLEM-ARG-TYPES", 0, 2, false);
        declareFunction("cnf_fn_argn_isa", "CNF-FN-ARGN-ISA", 3, 1, false);
        declareFunction("cnf_fn_argn_var", "CNF-FN-ARGN-VAR", 3, 0, false);
        declareFunction("interpolate_arg_type", "INTERPOLATE-ARG-TYPE", 1, 1, false);
        declareFunction("max_skolem_arity", "MAX-SKOLEM-ARITY", 0, 0, false);
        declareFunction("skolems_of_arity", "SKOLEMS-OF-ARITY", 0, 1, false);
        declareFunction("skolem_hosedP", "SKOLEM-HOSED?", 1, 0, false);
        declareFunction("skolem_ill_formedP", "SKOLEM-ILL-FORMED?", 1, 0, false);
        declareFunction("skolem_rule_hosedP", "SKOLEM-RULE-HOSED?", 2, 0, false);
        declareFunction("all_hosed_skolems", "ALL-HOSED-SKOLEMS", 0, 0, false);
        declareFunction("skolem_defns_not_wff", "SKOLEM-DEFNS-NOT-WFF", 0, 0, false);
        declareFunction("skolem_defn_maladies", "SKOLEM-DEFN-MALADIES", 0, 0, false);
        declareFunction("skolem_defns_not_wff_via", "SKOLEM-DEFNS-NOT-WFF-VIA", 0, 1, false);
        declareFunction("skolems_defn_not_wff_via", "SKOLEMS-DEFN-NOT-WFF-VIA", 0, 1, false);
        declareFunction("skolem_defn_vars", "SKOLEM-DEFN-VARS", 1, 0, false);
        declareFunction("skolems_vars_misordered", "SKOLEMS-VARS-MISORDERED", 0, 0, false);
        declareFunction("skolems_vars_ordered", "SKOLEMS-VARS-ORDERED", 0, 0, false);
        declareFunction("oldest_newest_forts", "OLDEST-NEWEST-FORTS", 1, 0, false);
        declareFunction("multi_skolem_skolems", "MULTI-SKOLEM-SKOLEMS", 0, 0, false);
        declareFunction("misindexed_skolem_keys", "MISINDEXED-SKOLEM-KEYS", 0, 1, false);
        declareFunction("sk_defns_wXo_sk_constants", "SK-DEFNS-W/O-SK-CONSTANTS", 0, 1, false);
        declareFunction("sk_keys_wXo_sk_defns", "SK-KEYS-W/O-SK-DEFNS", 0, 1, false);
        declareFunction("install_skolemfunction_fn_in_skolem_defns", "INSTALL-SKOLEMFUNCTION-FN-IN-SKOLEM-DEFNS", 0, 2, false);
        declareFunction("sk_defns_wXo_mts", "SK-DEFNS-W/O-MTS", 0, 1, false);
        declareFunction("skolem_wffP", "SKOLEM-WFF?", 1, 0, false);
        declareFunction("skolem_not_wffP", "SKOLEM-NOT-WFF?", 1, 0, false);
        declareFunction("why_skolem_not_wff", "WHY-SKOLEM-NOT-WFF", 1, 0, false);
        declareFunction("skolem_defn_wffP", "SKOLEM-DEFN-WFF?", 1, 0, false);
        declareFunction("skolem_defn_not_wffP", "SKOLEM-DEFN-NOT-WFF?", 1, 0, false);
        declareFunction("why_skolem_defn_not_wff", "WHY-SKOLEM-DEFN-NOT-WFF", 1, 0, false);
        declareFunction("skolem_all_goodP", "SKOLEM-ALL-GOOD?", 1, 0, false);
        declareFunction("skolem_function_skolem_assertion_goodP", "SKOLEM-FUNCTION-SKOLEM-ASSERTION-GOOD?", 1, 0, false);
        declareFunction("skolem_functions_with_bad_skolem_assertions", "SKOLEM-FUNCTIONS-WITH-BAD-SKOLEM-ASSERTIONS", 0, 0, false);
        declareFunction("diagnose_all_skolems", "DIAGNOSE-ALL-SKOLEMS", 0, 0, false);
        declareFunction("diagnose_skolems", "DIAGNOSE-SKOLEMS", 1, 1, false);
        declareFunction("diagnose_skolem", "DIAGNOSE-SKOLEM", 1, 0, false);
        declareFunction("diagnose_just_this_skolem_internal", "DIAGNOSE-JUST-THIS-SKOLEM-INTERNAL", 1, 0, false);
        declareFunction("diagnose_just_this_skolem", "DIAGNOSE-JUST-THIS-SKOLEM", 1, 0, false);
        declareFunction("recanonicalize_skolem_defn_assertions", "RECANONICALIZE-SKOLEM-DEFN-ASSERTIONS", 1, 0, false);
        declareFunction("skolem_safe_to_recanonicalize_at_elP", "SKOLEM-SAFE-TO-RECANONICALIZE-AT-EL?", 1, 0, false);
        declareFunction("compute_target_consequent_literal_count", "COMPUTE-TARGET-CONSEQUENT-LITERAL-COUNT", 1, 0, false);
        declareFunction("conjunction_of_literalsP", "CONJUNCTION-OF-LITERALS?", 1, 0, false);
        declareFunction("modernize_skolem_axiom_table", "MODERNIZE-SKOLEM-AXIOM-TABLE", 0, 0, false);
        declareFunction("possibly_modernize_unreified_sk_term", "POSSIBLY-MODERNIZE-UNREIFIED-SK-TERM", 1, 0, false);
        declareFunction("skolems_with_mismatched_unreified_sk_terms", "SKOLEMS-WITH-MISMATCHED-UNREIFIED-SK-TERMS", 0, 0, false);
        declareFunction("skolem_unreified_sk_terms_matchP", "SKOLEM-UNREIFIED-SK-TERMS-MATCH?", 1, 0, false);
        declareFunction("possibly_nrepair_skolems_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEMS-WITH-DUPLICATE-VARS", 1, 0, false);
        declareFunction("possibly_nrepair_skolem_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false);
        declareFunction("nrepair_skolem_with_duplicate_vars", "NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false);
        declareFunction("possibly_nrepair_skolems_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEMS-WITH-MALFORMED-NUMBERS", 1, 0, false);
        declareFunction("possibly_nrepair_skolem_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false);
        declareFunction("nrepair_skolem_with_malformed_numbers", "NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false);
        declareFunction("tmi_skolemP", "TMI-SKOLEM?", 1, 0, false);
        declareFunction("recanonicalize_tmi_skolems", "RECANONICALIZE-TMI-SKOLEMS", 1, 0, false);
        declareFunction("recanonicalize_tmi_skolem", "RECANONICALIZE-TMI-SKOLEM", 1, 0, false);
        declareFunction("possibly_rehabilitate_skolem_defn_table", "POSSIBLY-REHABILITATE-SKOLEM-DEFN-TABLE", 0, 0, false);
        return NIL;
    }

    public static SubLObject declare_skolems_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("reify_skolems_in", "REIFY-SKOLEMS-IN", 4, 0, false);
            declareFunction("canonicalize_fns_in_sk_term", "CANONICALIZE-FNS-IN-SK-TERM", 1, 0, false);
            declareFunction("subst_skolem_in", "SUBST-SKOLEM-IN", 3, 0, false);
            declareFunction("skolem_function_dependent_vars", "SKOLEM-FUNCTION-DEPENDENT-VARS", 1, 0, false);
            declareFunction("skolem_function_var", "SKOLEM-FUNCTION-VAR", 1, 0, false);
            declareFunction("skolem_args", "SKOLEM-ARGS", 3, 0, false);
            declareFunction("canonicalize_skolem_term", "CANONICALIZE-SKOLEM-TERM", 4, 0, false);
            declareFunction("replace_unreified_skolem_terms_with_variables", "REPLACE-UNREIFIED-SKOLEM-TERMS-WITH-VARIABLES", 1, 0, false);
            declareFunction("lookup_sk_constant_from_defns", "LOOKUP-SK-CONSTANT-FROM-DEFNS", 3, 0, false);
            declareFunction("defn_unreified_sk_term", "DEFN-UNREIFIED-SK-TERM", 3, 0, false);
            declareFunction("skolem_collection", "SKOLEM-COLLECTION", 1, 0, false);
            declareFunction("create_skolem", "CREATE-SKOLEM", 5, 0, false);
            declareFunction("sk_defn_from_clauses", "SK-DEFN-FROM-CLAUSES", 2, 1, false);
            declareFunction("alpha_sort_clauses", "ALPHA-SORT-CLAUSES", 1, 0, false);
            declareFunction("rename_skolem_clause_vars", "RENAME-SKOLEM-CLAUSE-VARS", 2, 1, false);
            declareFunction("sk_defn_var", "SK-DEFN-VAR", 0, 0, false);
            declareFunction("clear_formula_constant_str", "CLEAR-FORMULA-CONSTANT-STR", 0, 0, false);
            declareFunction("remove_formula_constant_str", "REMOVE-FORMULA-CONSTANT-STR", 1, 0, false);
            declareFunction("formula_constant_str_internal", "FORMULA-CONSTANT-STR-INTERNAL", 1, 0, false);
            declareFunction("formula_constant_str", "FORMULA-CONSTANT-STR", 1, 0, false);
            declareFunction("cyc_var_except_for_x_0P", "CYC-VAR-EXCEPT-FOR-X-0?", 1, 0, false);
            declareFunction("make_sk_defn", "MAKE-SK-DEFN", 4, 0, false);
            declareFunction("sk_arity", "SK-ARITY", 1, 1, false);
            declareFunction("make_unreified_sk_nat", "MAKE-UNREIFIED-SK-NAT", 4, 0, false);
            declareFunction("skolem_defn", "SKOLEM-DEFN", 1, 0, false);
            declareFunction("skolem_defnXkey", "SKOLEM-DEFN&KEY", 1, 0, false);
            declareFunction("skolem_defn_key", "SKOLEM-DEFN-KEY", 1, 0, false);
            declareFunction("skolem_of_defn", "SKOLEM-OF-DEFN", 1, 0, false);
            declareFunction("unreified_sk_term", "UNREIFIED-SK-TERM", 1, 0, false);
            declareFunction("skolem_defn_mt", "SKOLEM-DEFN-MT", 1, 0, false);
            declareFunction("skolem_seqvar", "SKOLEM-SEQVAR", 1, 0, false);
            declareFunction("skolem_defn_seqvar", "SKOLEM-DEFN-SEQVAR", 1, 0, false);
            declareFunction("old_format_skolemP", "OLD-FORMAT-SKOLEM?", 1, 0, false);
            declareFunction("skolem_number", "SKOLEM-NUMBER", 1, 0, false);
            declareFunction("skolem_defn_number", "SKOLEM-DEFN-NUMBER", 1, 0, false);
            declareFunction("skolem_defn_args", "SKOLEM-DEFN-ARGS", 1, 0, false);
            declareFunction("skolem_var", "SKOLEM-VAR", 1, 0, false);
            declareFunction("el_unreified_sk_term", "EL-UNREIFIED-SK-TERM", 1, 0, false);
            declareFunction("compute_unreified_sk_term_via_hl", "COMPUTE-UNREIFIED-SK-TERM-VIA-HL", 1, 0, false);
            declareFunction("compute_skolem_info_from_assertions", "COMPUTE-SKOLEM-INFO-FROM-ASSERTIONS", 2, 0, false);
            declareFunction("skolem_table_key_from_defn", "SKOLEM-TABLE-KEY-FROM-DEFN", 1, 0, false);
            declareFunction("skolem_table_key_from_constant", "SKOLEM-TABLE-KEY-FROM-CONSTANT", 1, 0, false);
            declareFunction("skolem_hash_key", "SKOLEM-HASH-KEY", 2, 0, false);
            declareFunction("opaquify_unreified_skolem_terms", "OPAQUIFY-UNREIFIED-SKOLEM-TERMS", 1, 0, false);
            declareFunction("skolem_defns_from_key_specification", "SKOLEM-DEFNS-FROM-KEY-SPECIFICATION", 2, 0, false);
            declareFunction("cnfs_of_skolem_defn", "CNFS-OF-SKOLEM-DEFN", 1, 0, false);
            declareFunction("mt_of_skolem_defn", "MT-OF-SKOLEM-DEFN", 1, 0, false);
            declareFunction("skolem_defn_cnfs", "SKOLEM-DEFN-CNFS", 1, 0, false);
            declareFunction("skolem_defn_assertions_robust", "SKOLEM-DEFN-ASSERTIONS-ROBUST", 1, 1, false);
            declareFunction("skolem_function_has_no_defn_assertions_robustP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS-ROBUST?", 1, 0, false);
            declareFunction("skolem_function_has_no_defn_assertionsP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS?", 1, 0, false);
            declareFunction("skolem_defining_bookkeeping_assertion", "SKOLEM-DEFINING-BOOKKEEPING-ASSERTION", 1, 0, false);
            declareFunction("skolem_defn_assertions", "SKOLEM-DEFN-ASSERTIONS", 1, 1, false);
            declareFunction("skolems_defn_assertions", "SKOLEMS-DEFN-ASSERTIONS", 1, 0, false);
            declareFunction("skolem_defn_siblings", "SKOLEM-DEFN-SIBLINGS", 1, 0, false);
            declareFunction("skolem_defn_proper_siblings", "SKOLEM-DEFN-PROPER-SIBLINGS", 1, 0, false);
            declareFunction("skolem_canonical_sibling", "SKOLEM-CANONICAL-SIBLING", 1, 0, false);
            declareFunction("skolems_min_mt", "SKOLEMS-MIN-MT", 1, 0, false);
            declareFunction("skolem_only_mentioned_in_el_templatesP", "SKOLEM-ONLY-MENTIONED-IN-EL-TEMPLATES?", 2, 0, false);
            declareFunction("skolem_defn_assertionP", "SKOLEM-DEFN-ASSERTION?", 2, 1, false);
            declareFunction("gaf_has_corresponding_cnf_in_skolem_defnP", "GAF-HAS-CORRESPONDING-CNF-IN-SKOLEM-DEFN?", 2, 1, false);
            declareFunction("constant_denoting_reified_skolem_fnP", "CONSTANT-DENOTING-REIFIED-SKOLEM-FN?", 1, 0, false);
            declareFunction("computed_skolem_assertionP", "COMPUTED-SKOLEM-ASSERTION?", 1, 0, false);
            declareFunction("skolem_defining_assertionP", "SKOLEM-DEFINING-ASSERTION?", 1, 0, false);
            declareFunction("defn_assertion_of_skolemP", "DEFN-ASSERTION-OF-SKOLEM?", 2, 0, false);
            declareFunction("assertion_skolems", "ASSERTION-SKOLEMS", 1, 0, false);
            declareFunction("defn_assertion_skolems", "DEFN-ASSERTION-SKOLEMS", 1, 0, false);
            declareFunction("all_skolem_mt_defn_assertions", "ALL-SKOLEM-MT-DEFN-ASSERTIONS", 2, 1, false);
            declareFunction("recomputing_skolem_defn_info_constant", "RECOMPUTING-SKOLEM-DEFN-INFO-CONSTANT", 0, 0, false);
            declareFunction("recomputing_skolem_defn_info_var", "RECOMPUTING-SKOLEM-DEFN-INFO-VAR", 0, 0, false);
            declareFunction("really_recomputing_skolem_defnP", "REALLY-RECOMPUTING-SKOLEM-DEFN?", 0, 0, false);
            declareFunction("recomputing_skolem_defn_info_defn", "RECOMPUTING-SKOLEM-DEFN-INFO-DEFN", 0, 0, false);
            declareFunction("recomputing_skolem_defn_info_key", "RECOMPUTING-SKOLEM-DEFN-INFO-KEY", 0, 0, false);
            declareFunction("recomputing_skolem_defn_info_blist", "RECOMPUTING-SKOLEM-DEFN-INFO-BLIST", 0, 0, false);
            declareFunction("set_recomputing_skolem_defn_result", "SET-RECOMPUTING-SKOLEM-DEFN-RESULT", 2, 0, false);
            declareFunction("set_recomputing_skolem_defn_blist", "SET-RECOMPUTING-SKOLEM-DEFN-BLIST", 1, 0, false);
            declareFunction("recomputing_skolem_defnP", "RECOMPUTING-SKOLEM-DEFN?", 0, 0, false);
            declareFunction("recomputing_defn_of_skolemP", "RECOMPUTING-DEFN-OF-SKOLEM?", 1, 0, false);
            declareFunction("recomputing_skolem_defn_ofP", "RECOMPUTING-SKOLEM-DEFN-OF?", 1, 0, false);
            declareFunction("note_skolem_binding", "NOTE-SKOLEM-BINDING", 2, 0, false);
            declareFunction("recompute_skolem_defn", "RECOMPUTE-SKOLEM-DEFN", 6, 0, false);
            declareFunction("remove_defn_of_skolem", "REMOVE-DEFN-OF-SKOLEM", 1, 1, false);
            declareFunction("add_skolem_defn", "ADD-SKOLEM-DEFN", 1, 1, false);
            declareFunction("kb_skolems", "KB-SKOLEMS", 0, 0, false);
            declareFunction("skolem_table_contains_old_format_skolemsP", "SKOLEM-TABLE-CONTAINS-OLD-FORMAT-SKOLEMS?", 0, 0, false);
            declareFunction("reset_skolem_defn_table", "RESET-SKOLEM-DEFN-TABLE", 0, 2, false);
            declareFunction("reset_defn_of_skolem", "RESET-DEFN-OF-SKOLEM", 1, 1, false);
            declareFunction("skolem_defn_from_assertions", "SKOLEM-DEFN-FROM-ASSERTIONS", 1, 1, false);
            declareFunction("reset_skolem_defn_from_assertions", "RESET-SKOLEM-DEFN-FROM-ASSERTIONS", 1, 2, false);
            declareFunction("skolem_variable_from_assertions", "SKOLEM-VARIABLE-FROM-ASSERTIONS", 2, 0, false);
            declareFunction("skolem_scalar_termP", "SKOLEM-SCALAR-TERM?", 1, 1, false);
            declareFunction("skolem_result_types_from_cnfs", "SKOLEM-RESULT-TYPES-FROM-CNFS", 2, 2, false);
            declareFunction("guess_skolem_result_types_from_cnfs", "GUESS-SKOLEM-RESULT-TYPES-FROM-CNFS", 3, 2, false);
            declareFunction("skolem_cnfs_pos_lit_types", "SKOLEM-CNFS-POS-LIT-TYPES", 2, 1, false);
            declareFunction("skolem_var_isa_constraints_wrt_cnfs", "SKOLEM-VAR-ISA-CONSTRAINTS-WRT-CNFS", 2, 1, false);
            declareFunction("skolem_var_genl_constraints_wrt_cnfs", "SKOLEM-VAR-GENL-CONSTRAINTS-WRT-CNFS", 2, 1, false);
            declareFunction("skolem_arg_isa_constraints", "SKOLEM-ARG-ISA-CONSTRAINTS", 2, 1, false);
            declareFunction("install_skolem_arg_types", "INSTALL-SKOLEM-ARG-TYPES", 0, 2, false);
            declareFunction("cnf_fn_argn_isa", "CNF-FN-ARGN-ISA", 3, 1, false);
            declareFunction("cnf_fn_argn_var", "CNF-FN-ARGN-VAR", 3, 0, false);
            declareFunction("interpolate_arg_type", "INTERPOLATE-ARG-TYPE", 1, 1, false);
            declareFunction("max_skolem_arity", "MAX-SKOLEM-ARITY", 0, 0, false);
            declareFunction("skolems_of_arity", "SKOLEMS-OF-ARITY", 0, 1, false);
            declareFunction("skolem_hosedP", "SKOLEM-HOSED?", 1, 0, false);
            declareFunction("skolem_ill_formedP", "SKOLEM-ILL-FORMED?", 1, 0, false);
            declareFunction("skolem_rule_hosedP", "SKOLEM-RULE-HOSED?", 2, 0, false);
            declareFunction("all_hosed_skolems", "ALL-HOSED-SKOLEMS", 0, 0, false);
            declareFunction("multi_skolem_skolems", "MULTI-SKOLEM-SKOLEMS", 0, 0, false);
            declareFunction("misindexed_skolem_keys", "MISINDEXED-SKOLEM-KEYS", 0, 1, false);
            declareFunction("sk_defns_wXo_sk_constants", "SK-DEFNS-W/O-SK-CONSTANTS", 0, 1, false);
            declareFunction("sk_keys_wXo_sk_defns", "SK-KEYS-W/O-SK-DEFNS", 0, 1, false);
            declareFunction("install_skolemfunction_fn_in_skolem_defns", "INSTALL-SKOLEMFUNCTION-FN-IN-SKOLEM-DEFNS", 0, 2, false);
            declareFunction("sk_defns_wXo_mts", "SK-DEFNS-W/O-MTS", 0, 1, false);
            declareFunction("skolem_wffP", "SKOLEM-WFF?", 1, 0, false);
            declareFunction("skolem_not_wffP", "SKOLEM-NOT-WFF?", 1, 0, false);
            declareFunction("why_skolem_not_wff", "WHY-SKOLEM-NOT-WFF", 1, 0, false);
            declareFunction("skolem_defn_wffP", "SKOLEM-DEFN-WFF?", 1, 0, false);
            declareFunction("skolem_defn_not_wffP", "SKOLEM-DEFN-NOT-WFF?", 1, 0, false);
            declareFunction("why_skolem_defn_not_wff", "WHY-SKOLEM-DEFN-NOT-WFF", 1, 0, false);
            declareFunction("skolem_all_goodP", "SKOLEM-ALL-GOOD?", 1, 0, false);
            declareFunction("skolem_function_skolem_assertion_goodP", "SKOLEM-FUNCTION-SKOLEM-ASSERTION-GOOD?", 1, 0, false);
            declareFunction("skolem_functions_with_bad_skolem_assertions", "SKOLEM-FUNCTIONS-WITH-BAD-SKOLEM-ASSERTIONS", 0, 0, false);
            declareFunction("diagnose_all_skolems", "DIAGNOSE-ALL-SKOLEMS", 0, 0, false);
            declareFunction("diagnose_skolems", "DIAGNOSE-SKOLEMS", 1, 1, false);
            declareFunction("diagnose_skolem", "DIAGNOSE-SKOLEM", 1, 0, false);
            declareFunction("diagnose_just_this_skolem_internal", "DIAGNOSE-JUST-THIS-SKOLEM-INTERNAL", 1, 0, false);
            declareFunction("diagnose_just_this_skolem", "DIAGNOSE-JUST-THIS-SKOLEM", 1, 0, false);
            declareFunction("recanonicalize_skolem_defn_assertions", "RECANONICALIZE-SKOLEM-DEFN-ASSERTIONS", 1, 0, false);
            declareFunction("skolem_safe_to_recanonicalize_at_elP", "SKOLEM-SAFE-TO-RECANONICALIZE-AT-EL?", 1, 0, false);
            declareFunction("compute_target_consequent_literal_count", "COMPUTE-TARGET-CONSEQUENT-LITERAL-COUNT", 1, 0, false);
            declareFunction("conjunction_of_literalsP", "CONJUNCTION-OF-LITERALS?", 1, 0, false);
            declareFunction("modernize_skolem_axiom_table", "MODERNIZE-SKOLEM-AXIOM-TABLE", 0, 0, false);
            declareFunction("possibly_modernize_unreified_sk_term", "POSSIBLY-MODERNIZE-UNREIFIED-SK-TERM", 1, 0, false);
            declareFunction("skolems_with_mismatched_unreified_sk_terms", "SKOLEMS-WITH-MISMATCHED-UNREIFIED-SK-TERMS", 0, 0, false);
            declareFunction("skolem_unreified_sk_terms_matchP", "SKOLEM-UNREIFIED-SK-TERMS-MATCH?", 1, 0, false);
            declareFunction("possibly_nrepair_skolems_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEMS-WITH-DUPLICATE-VARS", 1, 0, false);
            declareFunction("possibly_nrepair_skolem_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false);
            declareFunction("nrepair_skolem_with_duplicate_vars", "NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false);
            declareFunction("possibly_nrepair_skolems_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEMS-WITH-MALFORMED-NUMBERS", 1, 0, false);
            declareFunction("possibly_nrepair_skolem_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false);
            declareFunction("nrepair_skolem_with_malformed_numbers", "NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false);
            declareFunction("tmi_skolemP", "TMI-SKOLEM?", 1, 0, false);
            declareFunction("recanonicalize_tmi_skolems", "RECANONICALIZE-TMI-SKOLEMS", 1, 0, false);
            declareFunction("recanonicalize_tmi_skolem", "RECANONICALIZE-TMI-SKOLEM", 1, 0, false);
            declareFunction("possibly_rehabilitate_skolem_defn_table", "POSSIBLY-REHABILITATE-SKOLEM-DEFN-TABLE", 0, 0, false);
            declareFunction("skolems_that_are_unfindable_via_el", "SKOLEMS-THAT-ARE-UNFINDABLE-VIA-EL", 0, 0, false);
            declareFunction("skolem_unfindable_via_elP", "SKOLEM-UNFINDABLE-VIA-EL?", 1, 0, false);
            declareFunction("bad_skolem_assertions", "BAD-SKOLEM-ASSERTIONS", 0, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("skolem_defns_not_wff", "SKOLEM-DEFNS-NOT-WFF", 0, 0, false);
            declareFunction("skolem_defn_maladies", "SKOLEM-DEFN-MALADIES", 0, 0, false);
            declareFunction("skolem_defns_not_wff_via", "SKOLEM-DEFNS-NOT-WFF-VIA", 0, 1, false);
            declareFunction("skolems_defn_not_wff_via", "SKOLEMS-DEFN-NOT-WFF-VIA", 0, 1, false);
            declareFunction("skolem_defn_vars", "SKOLEM-DEFN-VARS", 1, 0, false);
            declareFunction("skolems_vars_misordered", "SKOLEMS-VARS-MISORDERED", 0, 0, false);
            declareFunction("skolems_vars_ordered", "SKOLEMS-VARS-ORDERED", 0, 0, false);
            declareFunction("oldest_newest_forts", "OLDEST-NEWEST-FORTS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_skolems_file_Previous() {
        declareFunction("reify_skolems_in", "REIFY-SKOLEMS-IN", 4, 0, false);
        declareFunction("canonicalize_fns_in_sk_term", "CANONICALIZE-FNS-IN-SK-TERM", 1, 0, false);
        declareFunction("subst_skolem_in", "SUBST-SKOLEM-IN", 3, 0, false);
        declareFunction("skolem_function_dependent_vars", "SKOLEM-FUNCTION-DEPENDENT-VARS", 1, 0, false);
        declareFunction("skolem_function_var", "SKOLEM-FUNCTION-VAR", 1, 0, false);
        declareFunction("skolem_args", "SKOLEM-ARGS", 3, 0, false);
        declareFunction("canonicalize_skolem_term", "CANONICALIZE-SKOLEM-TERM", 4, 0, false);
        declareFunction("replace_unreified_skolem_terms_with_variables", "REPLACE-UNREIFIED-SKOLEM-TERMS-WITH-VARIABLES", 1, 0, false);
        declareFunction("lookup_sk_constant_from_defns", "LOOKUP-SK-CONSTANT-FROM-DEFNS", 3, 0, false);
        declareFunction("defn_unreified_sk_term", "DEFN-UNREIFIED-SK-TERM", 3, 0, false);
        declareFunction("skolem_collection", "SKOLEM-COLLECTION", 1, 0, false);
        declareFunction("create_skolem", "CREATE-SKOLEM", 5, 0, false);
        declareFunction("sk_defn_from_clauses", "SK-DEFN-FROM-CLAUSES", 2, 1, false);
        declareFunction("alpha_sort_clauses", "ALPHA-SORT-CLAUSES", 1, 0, false);
        declareFunction("rename_skolem_clause_vars", "RENAME-SKOLEM-CLAUSE-VARS", 2, 1, false);
        declareFunction("sk_defn_var", "SK-DEFN-VAR", 0, 0, false);
        declareFunction("clear_formula_constant_str", "CLEAR-FORMULA-CONSTANT-STR", 0, 0, false);
        declareFunction("remove_formula_constant_str", "REMOVE-FORMULA-CONSTANT-STR", 1, 0, false);
        declareFunction("formula_constant_str_internal", "FORMULA-CONSTANT-STR-INTERNAL", 1, 0, false);
        declareFunction("formula_constant_str", "FORMULA-CONSTANT-STR", 1, 0, false);
        declareFunction("cyc_var_except_for_x_0P", "CYC-VAR-EXCEPT-FOR-X-0?", 1, 0, false);
        declareFunction("make_sk_defn", "MAKE-SK-DEFN", 4, 0, false);
        declareFunction("sk_arity", "SK-ARITY", 1, 1, false);
        declareFunction("make_unreified_sk_nat", "MAKE-UNREIFIED-SK-NAT", 4, 0, false);
        declareFunction("skolem_defn", "SKOLEM-DEFN", 1, 0, false);
        declareFunction("skolem_defnXkey", "SKOLEM-DEFN&KEY", 1, 0, false);
        declareFunction("skolem_defn_key", "SKOLEM-DEFN-KEY", 1, 0, false);
        declareFunction("skolem_of_defn", "SKOLEM-OF-DEFN", 1, 0, false);
        declareFunction("unreified_sk_term", "UNREIFIED-SK-TERM", 1, 0, false);
        declareFunction("skolem_defn_mt", "SKOLEM-DEFN-MT", 1, 0, false);
        declareFunction("skolem_seqvar", "SKOLEM-SEQVAR", 1, 0, false);
        declareFunction("skolem_defn_seqvar", "SKOLEM-DEFN-SEQVAR", 1, 0, false);
        declareFunction("old_format_skolemP", "OLD-FORMAT-SKOLEM?", 1, 0, false);
        declareFunction("skolem_number", "SKOLEM-NUMBER", 1, 0, false);
        declareFunction("skolem_defn_number", "SKOLEM-DEFN-NUMBER", 1, 0, false);
        declareFunction("skolem_defn_args", "SKOLEM-DEFN-ARGS", 1, 0, false);
        declareFunction("skolem_var", "SKOLEM-VAR", 1, 0, false);
        declareFunction("el_unreified_sk_term", "EL-UNREIFIED-SK-TERM", 1, 0, false);
        declareFunction("compute_unreified_sk_term_via_hl", "COMPUTE-UNREIFIED-SK-TERM-VIA-HL", 1, 0, false);
        declareFunction("compute_skolem_info_from_assertions", "COMPUTE-SKOLEM-INFO-FROM-ASSERTIONS", 2, 0, false);
        declareFunction("skolem_table_key_from_defn", "SKOLEM-TABLE-KEY-FROM-DEFN", 1, 0, false);
        declareFunction("skolem_table_key_from_constant", "SKOLEM-TABLE-KEY-FROM-CONSTANT", 1, 0, false);
        declareFunction("skolem_hash_key", "SKOLEM-HASH-KEY", 2, 0, false);
        declareFunction("opaquify_unreified_skolem_terms", "OPAQUIFY-UNREIFIED-SKOLEM-TERMS", 1, 0, false);
        declareFunction("skolem_defns_from_key_specification", "SKOLEM-DEFNS-FROM-KEY-SPECIFICATION", 2, 0, false);
        declareFunction("cnfs_of_skolem_defn", "CNFS-OF-SKOLEM-DEFN", 1, 0, false);
        declareFunction("mt_of_skolem_defn", "MT-OF-SKOLEM-DEFN", 1, 0, false);
        declareFunction("skolem_defn_cnfs", "SKOLEM-DEFN-CNFS", 1, 0, false);
        declareFunction("skolem_defn_assertions_robust", "SKOLEM-DEFN-ASSERTIONS-ROBUST", 1, 1, false);
        declareFunction("skolem_function_has_no_defn_assertions_robustP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS-ROBUST?", 1, 0, false);
        declareFunction("skolem_function_has_no_defn_assertionsP", "SKOLEM-FUNCTION-HAS-NO-DEFN-ASSERTIONS?", 1, 0, false);
        declareFunction("skolem_defining_bookkeeping_assertion", "SKOLEM-DEFINING-BOOKKEEPING-ASSERTION", 1, 0, false);
        declareFunction("skolem_defn_assertions", "SKOLEM-DEFN-ASSERTIONS", 1, 1, false);
        declareFunction("skolems_defn_assertions", "SKOLEMS-DEFN-ASSERTIONS", 1, 0, false);
        declareFunction("skolem_defn_siblings", "SKOLEM-DEFN-SIBLINGS", 1, 0, false);
        declareFunction("skolem_defn_proper_siblings", "SKOLEM-DEFN-PROPER-SIBLINGS", 1, 0, false);
        declareFunction("skolem_canonical_sibling", "SKOLEM-CANONICAL-SIBLING", 1, 0, false);
        declareFunction("skolems_min_mt", "SKOLEMS-MIN-MT", 1, 0, false);
        declareFunction("skolem_only_mentioned_in_el_templatesP", "SKOLEM-ONLY-MENTIONED-IN-EL-TEMPLATES?", 2, 0, false);
        declareFunction("skolem_defn_assertionP", "SKOLEM-DEFN-ASSERTION?", 2, 1, false);
        declareFunction("gaf_has_corresponding_cnf_in_skolem_defnP", "GAF-HAS-CORRESPONDING-CNF-IN-SKOLEM-DEFN?", 2, 1, false);
        declareFunction("constant_denoting_reified_skolem_fnP", "CONSTANT-DENOTING-REIFIED-SKOLEM-FN?", 1, 0, false);
        declareFunction("computed_skolem_assertionP", "COMPUTED-SKOLEM-ASSERTION?", 1, 0, false);
        declareFunction("skolem_defining_assertionP", "SKOLEM-DEFINING-ASSERTION?", 1, 0, false);
        declareFunction("defn_assertion_of_skolemP", "DEFN-ASSERTION-OF-SKOLEM?", 2, 0, false);
        declareFunction("assertion_skolems", "ASSERTION-SKOLEMS", 1, 0, false);
        declareFunction("defn_assertion_skolems", "DEFN-ASSERTION-SKOLEMS", 1, 0, false);
        declareFunction("all_skolem_mt_defn_assertions", "ALL-SKOLEM-MT-DEFN-ASSERTIONS", 2, 1, false);
        declareFunction("recomputing_skolem_defn_info_constant", "RECOMPUTING-SKOLEM-DEFN-INFO-CONSTANT", 0, 0, false);
        declareFunction("recomputing_skolem_defn_info_var", "RECOMPUTING-SKOLEM-DEFN-INFO-VAR", 0, 0, false);
        declareFunction("really_recomputing_skolem_defnP", "REALLY-RECOMPUTING-SKOLEM-DEFN?", 0, 0, false);
        declareFunction("recomputing_skolem_defn_info_defn", "RECOMPUTING-SKOLEM-DEFN-INFO-DEFN", 0, 0, false);
        declareFunction("recomputing_skolem_defn_info_key", "RECOMPUTING-SKOLEM-DEFN-INFO-KEY", 0, 0, false);
        declareFunction("recomputing_skolem_defn_info_blist", "RECOMPUTING-SKOLEM-DEFN-INFO-BLIST", 0, 0, false);
        declareFunction("set_recomputing_skolem_defn_result", "SET-RECOMPUTING-SKOLEM-DEFN-RESULT", 2, 0, false);
        declareFunction("set_recomputing_skolem_defn_blist", "SET-RECOMPUTING-SKOLEM-DEFN-BLIST", 1, 0, false);
        declareFunction("recomputing_skolem_defnP", "RECOMPUTING-SKOLEM-DEFN?", 0, 0, false);
        declareFunction("recomputing_defn_of_skolemP", "RECOMPUTING-DEFN-OF-SKOLEM?", 1, 0, false);
        declareFunction("recomputing_skolem_defn_ofP", "RECOMPUTING-SKOLEM-DEFN-OF?", 1, 0, false);
        declareFunction("note_skolem_binding", "NOTE-SKOLEM-BINDING", 2, 0, false);
        declareFunction("recompute_skolem_defn", "RECOMPUTE-SKOLEM-DEFN", 6, 0, false);
        declareFunction("remove_defn_of_skolem", "REMOVE-DEFN-OF-SKOLEM", 1, 1, false);
        declareFunction("add_skolem_defn", "ADD-SKOLEM-DEFN", 1, 1, false);
        declareFunction("kb_skolems", "KB-SKOLEMS", 0, 0, false);
        declareFunction("skolem_table_contains_old_format_skolemsP", "SKOLEM-TABLE-CONTAINS-OLD-FORMAT-SKOLEMS?", 0, 0, false);
        declareFunction("reset_skolem_defn_table", "RESET-SKOLEM-DEFN-TABLE", 0, 2, false);
        declareFunction("reset_defn_of_skolem", "RESET-DEFN-OF-SKOLEM", 1, 1, false);
        declareFunction("skolem_defn_from_assertions", "SKOLEM-DEFN-FROM-ASSERTIONS", 1, 1, false);
        declareFunction("reset_skolem_defn_from_assertions", "RESET-SKOLEM-DEFN-FROM-ASSERTIONS", 1, 2, false);
        declareFunction("skolem_variable_from_assertions", "SKOLEM-VARIABLE-FROM-ASSERTIONS", 2, 0, false);
        declareFunction("skolem_scalar_termP", "SKOLEM-SCALAR-TERM?", 1, 1, false);
        declareFunction("skolem_result_types_from_cnfs", "SKOLEM-RESULT-TYPES-FROM-CNFS", 2, 2, false);
        declareFunction("guess_skolem_result_types_from_cnfs", "GUESS-SKOLEM-RESULT-TYPES-FROM-CNFS", 3, 2, false);
        declareFunction("skolem_cnfs_pos_lit_types", "SKOLEM-CNFS-POS-LIT-TYPES", 2, 1, false);
        declareFunction("skolem_var_isa_constraints_wrt_cnfs", "SKOLEM-VAR-ISA-CONSTRAINTS-WRT-CNFS", 2, 1, false);
        declareFunction("skolem_var_genl_constraints_wrt_cnfs", "SKOLEM-VAR-GENL-CONSTRAINTS-WRT-CNFS", 2, 1, false);
        declareFunction("skolem_arg_isa_constraints", "SKOLEM-ARG-ISA-CONSTRAINTS", 2, 1, false);
        declareFunction("install_skolem_arg_types", "INSTALL-SKOLEM-ARG-TYPES", 0, 2, false);
        declareFunction("cnf_fn_argn_isa", "CNF-FN-ARGN-ISA", 3, 1, false);
        declareFunction("cnf_fn_argn_var", "CNF-FN-ARGN-VAR", 3, 0, false);
        declareFunction("interpolate_arg_type", "INTERPOLATE-ARG-TYPE", 1, 1, false);
        declareFunction("max_skolem_arity", "MAX-SKOLEM-ARITY", 0, 0, false);
        declareFunction("skolems_of_arity", "SKOLEMS-OF-ARITY", 0, 1, false);
        declareFunction("skolem_hosedP", "SKOLEM-HOSED?", 1, 0, false);
        declareFunction("skolem_ill_formedP", "SKOLEM-ILL-FORMED?", 1, 0, false);
        declareFunction("skolem_rule_hosedP", "SKOLEM-RULE-HOSED?", 2, 0, false);
        declareFunction("all_hosed_skolems", "ALL-HOSED-SKOLEMS", 0, 0, false);
        declareFunction("multi_skolem_skolems", "MULTI-SKOLEM-SKOLEMS", 0, 0, false);
        declareFunction("misindexed_skolem_keys", "MISINDEXED-SKOLEM-KEYS", 0, 1, false);
        declareFunction("sk_defns_wXo_sk_constants", "SK-DEFNS-W/O-SK-CONSTANTS", 0, 1, false);
        declareFunction("sk_keys_wXo_sk_defns", "SK-KEYS-W/O-SK-DEFNS", 0, 1, false);
        declareFunction("install_skolemfunction_fn_in_skolem_defns", "INSTALL-SKOLEMFUNCTION-FN-IN-SKOLEM-DEFNS", 0, 2, false);
        declareFunction("sk_defns_wXo_mts", "SK-DEFNS-W/O-MTS", 0, 1, false);
        declareFunction("skolem_wffP", "SKOLEM-WFF?", 1, 0, false);
        declareFunction("skolem_not_wffP", "SKOLEM-NOT-WFF?", 1, 0, false);
        declareFunction("why_skolem_not_wff", "WHY-SKOLEM-NOT-WFF", 1, 0, false);
        declareFunction("skolem_defn_wffP", "SKOLEM-DEFN-WFF?", 1, 0, false);
        declareFunction("skolem_defn_not_wffP", "SKOLEM-DEFN-NOT-WFF?", 1, 0, false);
        declareFunction("why_skolem_defn_not_wff", "WHY-SKOLEM-DEFN-NOT-WFF", 1, 0, false);
        declareFunction("skolem_all_goodP", "SKOLEM-ALL-GOOD?", 1, 0, false);
        declareFunction("skolem_function_skolem_assertion_goodP", "SKOLEM-FUNCTION-SKOLEM-ASSERTION-GOOD?", 1, 0, false);
        declareFunction("skolem_functions_with_bad_skolem_assertions", "SKOLEM-FUNCTIONS-WITH-BAD-SKOLEM-ASSERTIONS", 0, 0, false);
        declareFunction("diagnose_all_skolems", "DIAGNOSE-ALL-SKOLEMS", 0, 0, false);
        declareFunction("diagnose_skolems", "DIAGNOSE-SKOLEMS", 1, 1, false);
        declareFunction("diagnose_skolem", "DIAGNOSE-SKOLEM", 1, 0, false);
        declareFunction("diagnose_just_this_skolem_internal", "DIAGNOSE-JUST-THIS-SKOLEM-INTERNAL", 1, 0, false);
        declareFunction("diagnose_just_this_skolem", "DIAGNOSE-JUST-THIS-SKOLEM", 1, 0, false);
        declareFunction("recanonicalize_skolem_defn_assertions", "RECANONICALIZE-SKOLEM-DEFN-ASSERTIONS", 1, 0, false);
        declareFunction("skolem_safe_to_recanonicalize_at_elP", "SKOLEM-SAFE-TO-RECANONICALIZE-AT-EL?", 1, 0, false);
        declareFunction("compute_target_consequent_literal_count", "COMPUTE-TARGET-CONSEQUENT-LITERAL-COUNT", 1, 0, false);
        declareFunction("conjunction_of_literalsP", "CONJUNCTION-OF-LITERALS?", 1, 0, false);
        declareFunction("modernize_skolem_axiom_table", "MODERNIZE-SKOLEM-AXIOM-TABLE", 0, 0, false);
        declareFunction("possibly_modernize_unreified_sk_term", "POSSIBLY-MODERNIZE-UNREIFIED-SK-TERM", 1, 0, false);
        declareFunction("skolems_with_mismatched_unreified_sk_terms", "SKOLEMS-WITH-MISMATCHED-UNREIFIED-SK-TERMS", 0, 0, false);
        declareFunction("skolem_unreified_sk_terms_matchP", "SKOLEM-UNREIFIED-SK-TERMS-MATCH?", 1, 0, false);
        declareFunction("possibly_nrepair_skolems_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEMS-WITH-DUPLICATE-VARS", 1, 0, false);
        declareFunction("possibly_nrepair_skolem_with_duplicate_vars", "POSSIBLY-NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false);
        declareFunction("nrepair_skolem_with_duplicate_vars", "NREPAIR-SKOLEM-WITH-DUPLICATE-VARS", 1, 0, false);
        declareFunction("possibly_nrepair_skolems_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEMS-WITH-MALFORMED-NUMBERS", 1, 0, false);
        declareFunction("possibly_nrepair_skolem_with_malformed_numbers", "POSSIBLY-NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false);
        declareFunction("nrepair_skolem_with_malformed_numbers", "NREPAIR-SKOLEM-WITH-MALFORMED-NUMBERS", 1, 0, false);
        declareFunction("tmi_skolemP", "TMI-SKOLEM?", 1, 0, false);
        declareFunction("recanonicalize_tmi_skolems", "RECANONICALIZE-TMI-SKOLEMS", 1, 0, false);
        declareFunction("recanonicalize_tmi_skolem", "RECANONICALIZE-TMI-SKOLEM", 1, 0, false);
        declareFunction("possibly_rehabilitate_skolem_defn_table", "POSSIBLY-REHABILITATE-SKOLEM-DEFN-TABLE", 0, 0, false);
        declareFunction("skolems_that_are_unfindable_via_el", "SKOLEMS-THAT-ARE-UNFINDABLE-VIA-EL", 0, 0, false);
        declareFunction("skolem_unfindable_via_elP", "SKOLEM-UNFINDABLE-VIA-EL?", 1, 0, false);
        declareFunction("bad_skolem_assertions", "BAD-SKOLEM-ASSERTIONS", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_skolems_file_alt() {
        defparameter("*SKOLEM-ARG-SORT*", NIL);
        deflexical("*FORMULA-CONSTANT-STR-CACHING-STATE*", NIL);
        defparameter("*RECOMPUTE-SKOLEM-DEFN-INFO*", NIL);
        deflexical("*SKOLEMS-WITH-KNOWN-ISSUES*", $list_alt108);
        deflexical("*SKOLEMS-SAFE-TO-RECANONICALIZE-AT-EL*", $list_alt109);
        defparameter("*TARGET-CONSEQUENT-LITERAL-COUNT*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject init_skolems_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*SKOLEM-ARG-SORT*", NIL);
            deflexical("*FORMULA-CONSTANT-STR-CACHING-STATE*", NIL);
            defparameter("*RECOMPUTE-SKOLEM-DEFN-INFO*", NIL);
            deflexical("*SKOLEMS-WITH-KNOWN-ISSUES*", $list111);
            deflexical("*SKOLEMS-SAFE-TO-RECANONICALIZE-AT-EL*", $list112);
            defparameter("*TARGET-CONSEQUENT-LITERAL-COUNT*", $UNINITIALIZED);
            deflexical("*SKOLEMS-KNOWN-TO-BE-UNFINDABLE-VIA-EL*", $list157);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SKOLEMS-WITH-KNOWN-ISSUES*", $list_alt108);
            deflexical("*SKOLEMS-SAFE-TO-RECANONICALIZE-AT-EL*", $list_alt109);
        }
        return NIL;
    }

    public static SubLObject init_skolems_file_Previous() {
        defparameter("*SKOLEM-ARG-SORT*", NIL);
        deflexical("*FORMULA-CONSTANT-STR-CACHING-STATE*", NIL);
        defparameter("*RECOMPUTE-SKOLEM-DEFN-INFO*", NIL);
        deflexical("*SKOLEMS-WITH-KNOWN-ISSUES*", $list111);
        deflexical("*SKOLEMS-SAFE-TO-RECANONICALIZE-AT-EL*", $list112);
        defparameter("*TARGET-CONSEQUENT-LITERAL-COUNT*", $UNINITIALIZED);
        deflexical("*SKOLEMS-KNOWN-TO-BE-UNFINDABLE-VIA-EL*", $list157);
        return NIL;
    }

    public static SubLObject setup_skolems_file() {
        memoization_state.note_globally_cached_function(FORMULA_CONSTANT_STR);
        memoization_state.note_memoized_function(DIAGNOSE_JUST_THIS_SKOLEM);
        return NIL;
    }

    private static SubLObject _constant_112_initializer() {
        return list(new SubLObject[]{ reader_make_constant_shell("SKF-16971619"), reader_make_constant_shell("SKF-9662286"), reader_make_constant_shell("SKF-45878693"), reader_make_constant_shell("SKF-27834981"), reader_make_constant_shell("SKF-12369461"), reader_make_constant_shell("SKF-10688698"), reader_make_constant_shell("SKF-45547787"), reader_make_constant_shell("SKF-31789746"), reader_make_constant_shell("SKF-26692934"), reader_make_constant_shell("SKF-48466118"), reader_make_constant_shell("SKF-60531811"), reader_make_constant_shell("SKF-29624762"), reader_make_constant_shell("SKF-22643466"), reader_make_constant_shell("SKF-29472649"), reader_make_constant_shell("SKF-6535610808"), reader_make_constant_shell("SKF-6391880459"), reader_make_constant_shell("SKF-6069753105"), reader_make_constant_shell("SKF-1836062444"), reader_make_constant_shell("SKF-1140288587"), reader_make_constant_shell("SKF-0975510193"), reader_make_constant_shell("SKF-0417114039"), reader_make_constant_shell("SKF-2399775374"), reader_make_constant_shell("SKF-9741300383"), reader_make_constant_shell("SKF-0828551493"), reader_make_constant_shell("SKF-2588418129"), reader_make_constant_shell("SKF-1857929740"), reader_make_constant_shell("SKF-9771221235"), reader_make_constant_shell("SKF-5248881133"), reader_make_constant_shell("SKF-30037247"), reader_make_constant_shell("SKF-60060919"), reader_make_constant_shell("SKF-10786079"), reader_make_constant_shell("SKF-14077376"), reader_make_constant_shell("SKF-55914574"), reader_make_constant_shell("SKF-16648407"), reader_make_constant_shell("SKF-44601733"), reader_make_constant_shell("SKF-7913899905"), reader_make_constant_shell("SKF-4396958760"), reader_make_constant_shell("SKF-8020199718"), reader_make_constant_shell("SKF-20333"), reader_make_constant_shell("SKF-3701677947"), reader_make_constant_shell("SKF-2758282998"), reader_make_constant_shell("SKF-32592026"), reader_make_constant_shell("SKF-15476867"), reader_make_constant_shell("SKF-11623545"), reader_make_constant_shell("SKF-39071040"), reader_make_constant_shell("SKF-22133371"), reader_make_constant_shell("SKF-49114437"), reader_make_constant_shell("SKF-6397777"), reader_make_constant_shell("SKF-27545347"), reader_make_constant_shell("SKF-44682034"), reader_make_constant_shell("SKF-55141454"), reader_make_constant_shell("SKF-29896988"), reader_make_constant_shell("SKF-42443574"), reader_make_constant_shell("SKF-13447977"), reader_make_constant_shell("SKF-30519480"), reader_make_constant_shell("SKF-62227276"), reader_make_constant_shell("SKF-17408839"), reader_make_constant_shell("SKF-58430677"), reader_make_constant_shell("SKF-59662976"), reader_make_constant_shell("SKF-12620975"), reader_make_constant_shell("SKF-9433064"), reader_make_constant_shell("SKF-9205245"), reader_make_constant_shell("SKF-DepictedGroupMember"), reader_make_constant_shell("SKF-19625320"), reader_make_constant_shell("SKF-3784346661"), reader_make_constant_shell("SKF-6544284149"), reader_make_constant_shell("SKF-0614825063"), reader_make_constant_shell("SKF-0016213450"), reader_make_constant_shell("SKF-22649603"), reader_make_constant_shell("SKF-4118636"), reader_make_constant_shell("SKF-19878232"), reader_make_constant_shell("SKF-15013378"), reader_make_constant_shell("SKF-65815517"), reader_make_constant_shell("SKF-56452378"), reader_make_constant_shell("SKF-49139121"), reader_make_constant_shell("SKF-12749049"), reader_make_constant_shell("SKF-2910558946"), reader_make_constant_shell("SKF-2910558946"), reader_make_constant_shell("SKF-8609688279"), reader_make_constant_shell("SKF-3254220233"), reader_make_constant_shell("SKF-4116454483"), reader_make_constant_shell("SKF-9882206036"), reader_make_constant_shell("SKF-7876960574"), reader_make_constant_shell("SKF-7849157406"), reader_make_constant_shell("SKF-0013694801"), reader_make_constant_shell("SKF-3786700124"), reader_make_constant_shell("SKF-1714230847"), reader_make_constant_shell("SKF-7566265665"), reader_make_constant_shell("SKF-8055872557"), reader_make_constant_shell("SKF-6624619390"), reader_make_constant_shell("SKF-4749393956"), reader_make_constant_shell("SKF-9902000475"), reader_make_constant_shell("SKF-2176445673"), reader_make_constant_shell("SKF-9582976901"), reader_make_constant_shell("SKF-62641426"), reader_make_constant_shell("SKF-37581079"), reader_make_constant_shell("SKF-9780389"), reader_make_constant_shell("SKF-51938893"), reader_make_constant_shell("SKF-33012437"), reader_make_constant_shell("SKF-9412760"), reader_make_constant_shell("SKF-22314298"), reader_make_constant_shell("SKF-52903378"), reader_make_constant_shell("SKF-59517423"), reader_make_constant_shell("SKF-24705784"), reader_make_constant_shell("SKF-22566254"), reader_make_constant_shell("SKF-35236481"), reader_make_constant_shell("SKF-26725746"), reader_make_constant_shell("SKF-55356852"), reader_make_constant_shell("SKF-3634339"), reader_make_constant_shell("SKF-65815517"), reader_make_constant_shell("SKF-56452378"), reader_make_constant_shell("SKF-49139121"), reader_make_constant_shell("SKF-12749049"), reader_make_constant_shell("SKF-4408119749"), reader_make_constant_shell("SKF-3789312666"), reader_make_constant_shell("SKF-0283155048"), reader_make_constant_shell("SKF-9294061441"), reader_make_constant_shell("SKF-4876245588"), reader_make_constant_shell("SKF-2809645919"), reader_make_constant_shell("SKF-1124554131"), reader_make_constant_shell("SKF-0220610914"), reader_make_constant_shell("SKF-4790221775"), reader_make_constant_shell("SKF-1168015263"), reader_make_constant_shell("SKF-4318796173"), reader_make_constant_shell("SKF-1828131226"), reader_make_constant_shell("SKF-2199671088"), reader_make_constant_shell("SKF-9895165404"), reader_make_constant_shell("SKF-6604522774"), reader_make_constant_shell("SKF-6086634185"), reader_make_constant_shell("SKF-0428133650"), reader_make_constant_shell("SKF-7899934995"), reader_make_constant_shell("SKF-0860923384"), reader_make_constant_shell("SKF-4146570201"), reader_make_constant_shell("SKF-0406242321"), reader_make_constant_shell("SKF-4468030352"), reader_make_constant_shell("SKF-8519691249"), reader_make_constant_shell("SKF-6471415053"), reader_make_constant_shell("SKF-6816884555"), reader_make_constant_shell("SKF-2207590761"), reader_make_constant_shell("SKF-4785728462"), reader_make_constant_shell("SKF-6959780810"), reader_make_constant_shell("SKF-2698165023"), reader_make_constant_shell("SKF-1592332182"), reader_make_constant_shell("SKF-9127604959"), reader_make_constant_shell("SKF-3352641286"), reader_make_constant_shell("SKF-9726105841"), reader_make_constant_shell("SKF-0624682876"), reader_make_constant_shell("SKF-9673514545"), reader_make_constant_shell("SKF-1902545429"), reader_make_constant_shell("SKF-6876074534"), reader_make_constant_shell("SKF-8288491486"), reader_make_constant_shell("SKF-4637358284"), reader_make_constant_shell("SKF-0635199939"), reader_make_constant_shell("SKF-4292973565"), reader_make_constant_shell("SKF-7798353664"), reader_make_constant_shell("SKF-34523039"), reader_make_constant_shell("SKF-33538847"), reader_make_constant_shell("SKF-58036047"), reader_make_constant_shell("SKF-9708075"), reader_make_constant_shell("SKF-13094314"), reader_make_constant_shell("SKF-27004431"), reader_make_constant_shell("SKF-47290403"), reader_make_constant_shell("SKF-49713991"), reader_make_constant_shell("SKF-40178904"), reader_make_constant_shell("SKF-62659908"), reader_make_constant_shell("SKF-61484227"), reader_make_constant_shell("SKF-35458681"), reader_make_constant_shell("SKF-17599345"), reader_make_constant_shell("SKF-53668837"), reader_make_constant_shell("SKF-24102297"), reader_make_constant_shell("SKF-32709431"), reader_make_constant_shell("SKF-51752162"), reader_make_constant_shell("SKF-35359227"), reader_make_constant_shell("SKF-20847759"), reader_make_constant_shell("SKF-51781280"), reader_make_constant_shell("SKF-51473172"), reader_make_constant_shell("SKF-36777684"), reader_make_constant_shell("SKF-27183984"), reader_make_constant_shell("SKF-24538299"), reader_make_constant_shell("SKF-51270566"), reader_make_constant_shell("SKF-6498804"), reader_make_constant_shell("SKF-52375281"), reader_make_constant_shell("SKF-59156909"), reader_make_constant_shell("SKF-59507392"), reader_make_constant_shell("SKF-21555986"), reader_make_constant_shell("SKF-0925186357"), reader_make_constant_shell("SKF-6223276020"), reader_make_constant_shell("SKF-5400448981"), reader_make_constant_shell("SKF-0033649819"), reader_make_constant_shell("SKF-8779626658"), reader_make_constant_shell("SKF-2650598318"), reader_make_constant_shell("SKF-1317366451"), reader_make_constant_shell("SKF-5713244721"), reader_make_constant_shell("SKF-5494021688"), reader_make_constant_shell("SKF-50021281"), reader_make_constant_shell("SKF-52700384"), reader_make_constant_shell("SKF-27017330"), reader_make_constant_shell("SKF-6926447"), reader_make_constant_shell("SKF-57742011"), reader_make_constant_shell("SKF-32797409"), reader_make_constant_shell("SKF-36775099"), reader_make_constant_shell("SKF-8803460"), reader_make_constant_shell("SKF-11685259"), reader_make_constant_shell("SKF-49596986"), reader_make_constant_shell("SKF-1515868"), reader_make_constant_shell("SKF-12425256"), reader_make_constant_shell("SKF-26526786"), reader_make_constant_shell("SKF-757265"), reader_make_constant_shell("SKF-66361621"), reader_make_constant_shell("SKF-50135687"), reader_make_constant_shell("SKF-28256974"), reader_make_constant_shell("SKF-52059331"), reader_make_constant_shell("SKF-60879947"), reader_make_constant_shell("SKF-10095100"), reader_make_constant_shell("SKF-20576203"), reader_make_constant_shell("SKF-49828332"), reader_make_constant_shell("SKF-44916076"), reader_make_constant_shell("SKF-63714570"), reader_make_constant_shell("SKF-3886762"), reader_make_constant_shell("SKF-14991605"), reader_make_constant_shell("SKF-35022890"), reader_make_constant_shell("SKF-9692584"), reader_make_constant_shell("SKF-56789029"), reader_make_constant_shell("SKF-63331999"), reader_make_constant_shell("SKF-60839916"), reader_make_constant_shell("SKF-11805601"), reader_make_constant_shell("MarriedCoupleFn"), reader_make_constant_shell("SKF-54717125"), reader_make_constant_shell("SKF-47103024"), reader_make_constant_shell("SKF-32504795"), reader_make_constant_shell("SKF-50991035"), reader_make_constant_shell("SKF-54893967"), reader_make_constant_shell("SKF-4588740"), reader_make_constant_shell("SKF-34044423"), reader_make_constant_shell("SKF-23158350"), reader_make_constant_shell("SKF-26216492"), reader_make_constant_shell("SKF-23792367"), reader_make_constant_shell("SKF-26655735"), reader_make_constant_shell("SKF-36384184"), reader_make_constant_shell("SKF-28223401"), reader_make_constant_shell("SKF-30705866"), reader_make_constant_shell("SKF-31089449"), reader_make_constant_shell("SKF-43795517"), reader_make_constant_shell("SKF-54692934"), reader_make_constant_shell("SKF-62874373"), reader_make_constant_shell("SKF-13198899"), reader_make_constant_shell("SKF-6598020"), reader_make_constant_shell("SKF-66712623"), reader_make_constant_shell("SKF-61590093"), reader_make_constant_shell("SKF-4298210"), reader_make_constant_shell("SKF-13358052"), reader_make_constant_shell("SKF-1077450"), reader_make_constant_shell("SKF-27216176"), reader_make_constant_shell("SKF-28083191"), reader_make_constant_shell("SKF-539243"), reader_make_constant_shell("SKF-14104209"), reader_make_constant_shell("SKF-6066610"), reader_make_constant_shell("SKF-14779626"), reader_make_constant_shell("SKF-1007216"), reader_make_constant_shell("SKF-49463821"), reader_make_constant_shell("SKF-764714"), reader_make_constant_shell("SKF-59277817"), reader_make_constant_shell("SKF-24473185"), reader_make_constant_shell("SKF-22799176"), reader_make_constant_shell("SKF-13378825"), reader_make_constant_shell("SKF-8692086"), reader_make_constant_shell("SKF-59150515"), reader_make_constant_shell("SKF-6649426"), reader_make_constant_shell("SKF-18423567"), reader_make_constant_shell("SKF-61014428"), reader_make_constant_shell("SKF-612301"), reader_make_constant_shell("SKF-390407"), reader_make_constant_shell("SKF-469762"), reader_make_constant_shell("SKF-57350382"), reader_make_constant_shell("SKF-550621"), reader_make_constant_shell("SKF-41449368"), reader_make_constant_shell("SKF-20918103"), reader_make_constant_shell("SKF-447007"), reader_make_constant_shell("SKF-1383963"), reader_make_constant_shell("SKF-348190"), reader_make_constant_shell("SKF-693803"), reader_make_constant_shell("SKF-133452"), reader_make_constant_shell("SKF-2813385"), reader_make_constant_shell("SKF-31097107"), reader_make_constant_shell("SKF-57888"), reader_make_constant_shell("SKF-10895131"), reader_make_constant_shell("SKF-13225721"), reader_make_constant_shell("SKF-43450038"), reader_make_constant_shell("SKF-21119958"), reader_make_constant_shell("SKF-47744038"), reader_make_constant_shell("SKF-466900"), reader_make_constant_shell("SKF-46555292"), reader_make_constant_shell("SKF-23253528"), reader_make_constant_shell("SKF-924570"), reader_make_constant_shell("SKF-BandMemPlaying"), reader_make_constant_shell("SKF-48376054"), reader_make_constant_shell("SKF-121716"), reader_make_constant_shell("SKF-7364934"), reader_make_constant_shell("SKF-14760742"), reader_make_constant_shell("SKF-17172575"), reader_make_constant_shell("SKF-23584353"), reader_make_constant_shell("SKF-53200158"), reader_make_constant_shell("SKF-48653451"), reader_make_constant_shell("SKF-55897365"), reader_make_constant_shell("SKF-52891476"), reader_make_constant_shell("SKF-33105457"), reader_make_constant_shell("SKF-10518089"), reader_make_constant_shell("SKF-33158362"), reader_make_constant_shell("SKF-66304485"), reader_make_constant_shell("SKF-810295"), reader_make_constant_shell("SKF-968219"), reader_make_constant_shell("SKF-9855449"), reader_make_constant_shell("SKF-51029398"), reader_make_constant_shell("SKF-9874778"), reader_make_constant_shell("SKF-14008069"), reader_make_constant_shell("SKF-197207"), reader_make_constant_shell("SKF-9176578"), reader_make_constant_shell("SKF-62825"), reader_make_constant_shell("SKF-476059"), reader_make_constant_shell("SKF-366078"), reader_make_constant_shell("SKF-17345463"), reader_make_constant_shell("SKF-51339287"), reader_make_constant_shell("SKF-1046930"), reader_make_constant_shell("SKF-828757"), reader_make_constant_shell("SKF-51633710"), reader_make_constant_shell("SKF-19769806"), reader_make_constant_shell("SKF-46906520"), reader_make_constant_shell("SKF-20309046"), reader_make_constant_shell("SKF-7477821"), reader_make_constant_shell("SKF-21294579"), reader_make_constant_shell("SKF-17746"), reader_make_constant_shell("SKF-42407080"), reader_make_constant_shell("SKF-32539269"), reader_make_constant_shell("SKF-17651656"), reader_make_constant_shell("SKF-49636199"), reader_make_constant_shell("SKF-63665039"), reader_make_constant_shell("SKF-923916"), reader_make_constant_shell("SKF-41511095"), reader_make_constant_shell("SKF-402998"), reader_make_constant_shell("SKF-1827166"), reader_make_constant_shell("SKF-25558723"), reader_make_constant_shell("SKF-92235"), reader_make_constant_shell("SKF-24405989"), reader_make_constant_shell("SKF-37741853"), reader_make_constant_shell("SKF-681210"), reader_make_constant_shell("SKF-16612795"), reader_make_constant_shell("SKF-55392675"), reader_make_constant_shell("SKF-41395088"), reader_make_constant_shell("SKF-427687"), reader_make_constant_shell("SKF-46187940"), reader_make_constant_shell("SKF-18860364"), reader_make_constant_shell("SKF-846216"), reader_make_constant_shell("SKF-5393361"), reader_make_constant_shell("SKF-12316220"), reader_make_constant_shell("SKF-54217404"), reader_make_constant_shell("SKF-5169399"), reader_make_constant_shell("SKF-920133"), reader_make_constant_shell("SKF-3247485"), reader_make_constant_shell("SKF-2269494"), reader_make_constant_shell("SKF-13038949"), reader_make_constant_shell("SKF-28759634"), reader_make_constant_shell("SKF-17122972"), reader_make_constant_shell("SKF-953550"), reader_make_constant_shell("SKF-906137"), reader_make_constant_shell("SKF-14962533"), reader_make_constant_shell("SKF-8254998"), reader_make_constant_shell("SKF-46599863"), reader_make_constant_shell("SKF-36778441"), reader_make_constant_shell("SKF-45777401"), reader_make_constant_shell("SKF-45356858"), reader_make_constant_shell("SKF-28542904"), reader_make_constant_shell("SKF-33462840"), reader_make_constant_shell("SKF-18834377"), reader_make_constant_shell("SKF-23165858"), reader_make_constant_shell("SKF-171447"), reader_make_constant_shell("SKF-38743072"), reader_make_constant_shell("SKF-62752838"), reader_make_constant_shell("SKF-46799967"), reader_make_constant_shell("SKF-38741805"), reader_make_constant_shell("SKF-22034341"), reader_make_constant_shell("SKF-49949893"), reader_make_constant_shell("SKF-750835"), reader_make_constant_shell("SKF-27330810"), reader_make_constant_shell("SKF-61593935"), reader_make_constant_shell("SKF-29534329"), reader_make_constant_shell("SKF-8780298"), reader_make_constant_shell("SKF-10230735"), reader_make_constant_shell("SKF-28051850"), reader_make_constant_shell("SKF-15346572"), reader_make_constant_shell("SKF-38351646"), reader_make_constant_shell("SKF-54477051"), reader_make_constant_shell("SKF-58577410"), reader_make_constant_shell("SKF-41179398"), reader_make_constant_shell("SKF-9098087"), reader_make_constant_shell("SKF-464896"), reader_make_constant_shell("SKF-13765056"), reader_make_constant_shell("SKF-54796118"), reader_make_constant_shell("SKF-892012"), reader_make_constant_shell("SKF-5733810632"), reader_make_constant_shell("SKF-9732365118"), reader_make_constant_shell("SKF-8062776921"), reader_make_constant_shell("SKF-9356282252"), reader_make_constant_shell("SKF-7770326773"), reader_make_constant_shell("SKF-9303451156"), reader_make_constant_shell("SKF-7682359700"), reader_make_constant_shell("SKF-0472592080"), reader_make_constant_shell("SKF-5868767078"), reader_make_constant_shell("SKF-6969827182"), reader_make_constant_shell("SKF-8235654414"), reader_make_constant_shell("SKF-9268693067"), reader_make_constant_shell("SKF-4188164665"), reader_make_constant_shell("SKF-3268848892"), reader_make_constant_shell("SKF-3954038304"), reader_make_constant_shell("SKF-8411301306"), reader_make_constant_shell("SKF-6870027660"), reader_make_constant_shell("SKF-2200319382"), reader_make_constant_shell("SKF-8663443543"), reader_make_constant_shell("SKF-6270260084"), reader_make_constant_shell("SKF-7428624994"), reader_make_constant_shell("SKF-6367907452"), reader_make_constant_shell("SKF-7752915649"), reader_make_constant_shell("SKF-4786775108"), reader_make_constant_shell("SKF-5640043419"), reader_make_constant_shell("SKF-6071218505"), reader_make_constant_shell("SKF-3183844767"), reader_make_constant_shell("SKF-7356970316"), reader_make_constant_shell("SKF-4272845489"), reader_make_constant_shell("SKF-5224425512"), reader_make_constant_shell("SKF-3795912959"), reader_make_constant_shell("SKF-7714022869"), reader_make_constant_shell("SKF-8565886278"), reader_make_constant_shell("SKF-0519624184"), reader_make_constant_shell("SKF-4286299680"), reader_make_constant_shell("SKF-3516286017"), reader_make_constant_shell("SKF-8782865500"), reader_make_constant_shell("SKF-4515155650"), reader_make_constant_shell("SKF-5391096127"), reader_make_constant_shell("SKF-8826617065"), reader_make_constant_shell("SKF-6950497514"), reader_make_constant_shell("SKF-4751258604"), reader_make_constant_shell("SKF-3616130689"), reader_make_constant_shell("SKF-7131788917"), reader_make_constant_shell("SKF-4848573733"), reader_make_constant_shell("SKF-2401054776"), reader_make_constant_shell("SKF-0985467323") });
    }

    @Override
    public void declareFunctions() {
        declare_skolems_file();
    }

    @Override
    public void initializeVariables() {
        init_skolems_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_skolems_file();
    }

    
}

/**
 * Total time: 3425 ms
 */
