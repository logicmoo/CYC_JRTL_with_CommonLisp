/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nreconc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      APPLICABLE-RELATIONS
 * source file: /cyc/top/cycl/applicable-relations.lisp
 * created:     2019/07/03 17:37:35
 */
public final class applicable_relations extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new applicable_relations();

 public static final String myName = "com.cyc.cycjava.cycl.applicable_relations";








    private static final SubLSymbol $ARG_QUOTED_ISA = makeKeyword("ARG-QUOTED-ISA");

    private static final SubLSymbol $ARG_GENL_HORIZON = makeKeyword("ARG-GENL-HORIZON");



    private static final SubLObject $$Function_Denotational = reader_make_constant_shell("Function-Denotational");

    static private final SubLList $list16 = cons(makeSymbol("TERM"), makeSymbol("OTHER-TERMS"));

    private static final SubLSymbol NOT_KEYHASH_KEY_P = makeSymbol("NOT-KEYHASH-KEY-P");

    private static final SubLString $$$Considering_predicates = makeString("Considering predicates");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol SUGGESTED_GAFS_FOR_TERMS_ITERATOR_DONE_P = makeSymbol("SUGGESTED-GAFS-FOR-TERMS-ITERATOR-DONE-P");

    private static final SubLSymbol SUGGESTED_GAFS_FOR_TERMS_ITERATOR_NEXT = makeSymbol("SUGGESTED-GAFS-FOR-TERMS-ITERATOR-NEXT");

    static private final SubLList $list23 = list(makeSymbol("CANDIDATE-GAFS"), makeSymbol("CANDIDATE-PREDICATE-ITERATOR"), makeSymbol("TOTAL"), makeSymbol("MAX-NUMBER"), makeSymbol("&REST"), makeSymbol("RESOURCES"));

    static private final SubLList $list24 = list(makeSymbol("CANDIDATE-GAFS"), makeSymbol("CANDIDATE-PREDICATE-ITERATOR"), makeSymbol("TOTAL"), makeSymbol("MAX-NUMBER"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("SBHL-RESOURCE"), makeSymbol("TERMS"), makeSymbol("MT-INFO"));





    static private final SubLSymbol $sym31$PREDICATE_BETTER_FOR_GAF_SUGGESTION_ = makeSymbol("PREDICATE-BETTER-FOR-GAF-SUGGESTION?");

    private static final SubLSymbol PREDICATE_USAGE_ESTIMATE_CACHED = makeSymbol("PREDICATE-USAGE-ESTIMATE-CACHED");

    public static final SubLSymbol $predicate_usage_estimate_cached_caching_state$ = makeSymbol("*PREDICATE-USAGE-ESTIMATE-CACHED-CACHING-STATE*");

    private static final SubLSymbol KEYHASH_P = makeSymbol("KEYHASH-P");

    // Definitions
    /**
     * Return a list of relations applicable to TERM in MT.
     * PROPERTIES is a plist specifying additional restrictions on the search:
     * :DOMAIN (when non-nil) states that only relations that are instances of
     * this type should be returned.
     * :ISA-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argIsa constraints on functions.
     * :GENLS-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argGenl constraints on functions.
     * :USAGE-THRESHOLD (when non-nil) states that returned functions must have
     * at least this many uses.
     */
    @LispMethod(comment = "Return a list of relations applicable to TERM in MT.\r\nPROPERTIES is a plist specifying additional restrictions on the search:\r\n:DOMAIN (when non-nil) states that only relations that are instances of\r\nthis type should be returned.\r\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argIsa constraints on functions.\r\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argGenl constraints on functions.\r\n:USAGE-THRESHOLD (when non-nil) states that returned functions must have\r\nat least this many uses.\nReturn a list of relations applicable to TERM in MT.\nPROPERTIES is a plist specifying additional restrictions on the search:\n:DOMAIN (when non-nil) states that only relations that are instances of\nthis type should be returned.\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argIsa constraints on functions.\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argGenl constraints on functions.\n:USAGE-THRESHOLD (when non-nil) states that returned functions must have\nat least this many uses.")
    public static final SubLObject applicable_relations_alt(SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject datum = v_properties;
            SubLObject current = datum;
            SubLObject domain_tail = property_list_member($DOMAIN, current);
            SubLObject domain = (NIL != domain_tail) ? ((SubLObject) (cadr(domain_tail))) : NIL;
            SubLObject isa_horizon_tail = property_list_member($ISA_HORIZON, current);
            SubLObject isa_horizon = (NIL != isa_horizon_tail) ? ((SubLObject) (cadr(isa_horizon_tail))) : NIL;
            SubLObject genls_horizon_tail = property_list_member($GENLS_HORIZON, current);
            SubLObject genls_horizon = (NIL != genls_horizon_tail) ? ((SubLObject) (cadr(genls_horizon_tail))) : NIL;
            SubLObject usage_threshold_tail = property_list_member($USAGE_THRESHOLD, current);
            SubLObject usage_threshold = (NIL != usage_threshold_tail) ? ((SubLObject) (cadr(usage_threshold_tail))) : NIL;
            SubLObject all_isa = com.cyc.cycjava.cycl.applicable_relations.applicable_relations_all_isa(v_term, mt);
            SubLObject all_genls_set = com.cyc.cycjava.cycl.applicable_relations.applicable_relations_all_genls_set(v_term, mt);
            SubLObject all_quoted_isa_set = com.cyc.cycjava.cycl.applicable_relations.applicable_relations_all_quoted_isa_set(v_term, mt);
            SubLObject relations = NIL;
            SubLObject relation_set = set.new_set(symbol_function(EQ), ZERO_INTEGER);
            SubLObject cdolist_list_var = all_isa;
            SubLObject arg_isa = NIL;
            for (arg_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_isa = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.applicable_relations.ar_below_horizonP(arg_isa, isa_horizon)) {
                    {
                        SubLObject pred_var = $$argIsa;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg_isa, THREE_INTEGER, pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg_isa, THREE_INTEGER, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                        if (NIL != valid) {
                                            {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                    {
                                                        SubLObject done_var_1 = NIL;
                                                        SubLObject token_var_2 = NIL;
                                                        while (NIL == done_var_1) {
                                                            {
                                                                SubLObject arg_isa_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                SubLObject valid_3 = makeBoolean(token_var_2 != arg_isa_gaf);
                                                                if (NIL != valid_3) {
                                                                    {
                                                                        SubLObject relation = assertions_high.gaf_arg1(arg_isa_gaf);
                                                                        if ((NIL != com.cyc.cycjava.cycl.applicable_relations.ar_within_domainP(relation, domain, mt)) && (NIL != com.cyc.cycjava.cycl.applicable_relations.ar_within_usage_thresholdP(relation, usage_threshold))) {
                                                                            {
                                                                                SubLObject argnum = assertions_high.gaf_arg2(arg_isa_gaf);
                                                                                SubLObject some_arg_genlP = NIL;
                                                                                SubLObject some_arg_genl_within_horizonP = NIL;
                                                                                SubLObject rejectedP = NIL;
                                                                                {
                                                                                    SubLObject pred_var_4 = $$argGenl;
                                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var_4)) {
                                                                                        {
                                                                                            SubLObject iterator_var_5 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var_4);
                                                                                            SubLObject done_var_6 = rejectedP;
                                                                                            SubLObject token_var_7 = NIL;
                                                                                            while (NIL == done_var_6) {
                                                                                                {
                                                                                                    SubLObject final_index_spec_8 = iteration.iteration_next_without_values_macro_helper(iterator_var_5, token_var_7);
                                                                                                    SubLObject valid_9 = makeBoolean(token_var_7 != final_index_spec_8);
                                                                                                    if (NIL != valid_9) {
                                                                                                        {
                                                                                                            SubLObject final_index_iterator_10 = NIL;
                                                                                                            try {
                                                                                                                final_index_iterator_10 = kb_mapping_macros.new_final_index_iterator(final_index_spec_8, $GAF, $TRUE, NIL);
                                                                                                                {
                                                                                                                    SubLObject done_var_11 = rejectedP;
                                                                                                                    SubLObject token_var_12 = NIL;
                                                                                                                    while (NIL == done_var_11) {
                                                                                                                        {
                                                                                                                            SubLObject arg_genl_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_10, token_var_12);
                                                                                                                            SubLObject valid_13 = makeBoolean(token_var_12 != arg_genl_gaf);
                                                                                                                            if (NIL != valid_13) {
                                                                                                                                if (argnum.numE(assertions_high.gaf_arg2(arg_genl_gaf))) {
                                                                                                                                    some_arg_genlP = T;
                                                                                                                                    {
                                                                                                                                        SubLObject arg_genl = assertions_high.gaf_arg3(arg_genl_gaf);
                                                                                                                                        if (NIL != com.cyc.cycjava.cycl.applicable_relations.ar_below_horizonP(arg_genl, genls_horizon)) {
                                                                                                                                            some_arg_genl_within_horizonP = T;
                                                                                                                                        }
                                                                                                                                        if (NIL == set.set_memberP(arg_genl, all_genls_set)) {
                                                                                                                                            rejectedP = $ARG_GENL;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            done_var_11 = makeBoolean((NIL == valid_13) || (NIL != rejectedP));
                                                                                                                        }
                                                                                                                    } 
                                                                                                                }
                                                                                                            } finally {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                                                                                    try {
                                                                                                                        bind($is_thread_performing_cleanupP$, T);
                                                                                                                        if (NIL != final_index_iterator_10) {
                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_10);
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    done_var_6 = makeBoolean((NIL == valid_9) || (NIL != rejectedP));
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject pred_var_14 = $$argQuotedIsa;
                                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var_14)) {
                                                                                        {
                                                                                            SubLObject iterator_var_15 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var_14);
                                                                                            SubLObject done_var_16 = rejectedP;
                                                                                            SubLObject token_var_17 = NIL;
                                                                                            while (NIL == done_var_16) {
                                                                                                {
                                                                                                    SubLObject final_index_spec_18 = iteration.iteration_next_without_values_macro_helper(iterator_var_15, token_var_17);
                                                                                                    SubLObject valid_19 = makeBoolean(token_var_17 != final_index_spec_18);
                                                                                                    if (NIL != valid_19) {
                                                                                                        {
                                                                                                            SubLObject final_index_iterator_20 = NIL;
                                                                                                            try {
                                                                                                                final_index_iterator_20 = kb_mapping_macros.new_final_index_iterator(final_index_spec_18, $GAF, $TRUE, NIL);
                                                                                                                {
                                                                                                                    SubLObject done_var_21 = rejectedP;
                                                                                                                    SubLObject token_var_22 = NIL;
                                                                                                                    while (NIL == done_var_21) {
                                                                                                                        {
                                                                                                                            SubLObject arg_quoted_isa_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_20, token_var_22);
                                                                                                                            SubLObject valid_23 = makeBoolean(token_var_22 != arg_quoted_isa_gaf);
                                                                                                                            if (NIL != valid_23) {
                                                                                                                                if (argnum.numE(assertions_high.gaf_arg2(arg_quoted_isa_gaf))) {
                                                                                                                                    {
                                                                                                                                        SubLObject arg_quoted_isa = assertions_high.gaf_arg3(arg_quoted_isa_gaf);
                                                                                                                                        if (NIL == set.set_memberP(arg_quoted_isa, all_quoted_isa_set)) {
                                                                                                                                            rejectedP = $ARG_QUOTED_ISA;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            done_var_21 = makeBoolean((NIL == valid_23) || (NIL != rejectedP));
                                                                                                                        }
                                                                                                                    } 
                                                                                                                }
                                                                                                            } finally {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                                                                                    try {
                                                                                                                        bind($is_thread_performing_cleanupP$, T);
                                                                                                                        if (NIL != final_index_iterator_20) {
                                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_20);
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    done_var_16 = makeBoolean((NIL == valid_19) || (NIL != rejectedP));
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if ((NIL != some_arg_genlP) && (NIL == some_arg_genl_within_horizonP)) {
                                                                                    rejectedP = $ARG_GENL_HORIZON;
                                                                                }
                                                                                if (NIL == rejectedP) {
                                                                                    if (NIL != set.set_add(relation, relation_set)) {
                                                                                        relations = cons(relation, relations);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                done_var_1 = makeBoolean(NIL == valid_3);
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
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        }
                    }
                }
            }
            return nreverse(relations);
        }
    }

    // Definitions
    /**
     * Return a list of relations applicable to TERM in MT.
     * PROPERTIES is a plist specifying additional restrictions on the search:
     * :DOMAIN (when non-nil) states that only relations that are instances of
     * this type should be returned.
     * :ISA-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argIsa constraints on functions.
     * :GENLS-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argGenl constraints on functions.
     * :USAGE-THRESHOLD (when non-nil) states that returned functions must have
     * at least this many uses.
     */
    @LispMethod(comment = "Return a list of relations applicable to TERM in MT.\r\nPROPERTIES is a plist specifying additional restrictions on the search:\r\n:DOMAIN (when non-nil) states that only relations that are instances of\r\nthis type should be returned.\r\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argIsa constraints on functions.\r\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argGenl constraints on functions.\r\n:USAGE-THRESHOLD (when non-nil) states that returned functions must have\r\nat least this many uses.\nReturn a list of relations applicable to TERM in MT.\nPROPERTIES is a plist specifying additional restrictions on the search:\n:DOMAIN (when non-nil) states that only relations that are instances of\nthis type should be returned.\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argIsa constraints on functions.\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argGenl constraints on functions.\n:USAGE-THRESHOLD (when non-nil) states that returned functions must have\nat least this many uses.")
    public static SubLObject applicable_relations(final SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject current;
        final SubLObject datum = current = v_properties;
        final SubLObject domain_tail = property_list_member($DOMAIN, current);
        final SubLObject domain = (NIL != domain_tail) ? cadr(domain_tail) : NIL;
        final SubLObject isa_horizon_tail = property_list_member($ISA_HORIZON, current);
        final SubLObject isa_horizon = (NIL != isa_horizon_tail) ? cadr(isa_horizon_tail) : NIL;
        final SubLObject genls_horizon_tail = property_list_member($GENLS_HORIZON, current);
        final SubLObject genls_horizon = (NIL != genls_horizon_tail) ? cadr(genls_horizon_tail) : NIL;
        final SubLObject usage_threshold_tail = property_list_member($USAGE_THRESHOLD, current);
        final SubLObject usage_threshold = (NIL != usage_threshold_tail) ? cadr(usage_threshold_tail) : NIL;
        final SubLObject all_isa = applicable_relations_all_isa(v_term, mt);
        final SubLObject all_genls_set = applicable_relations_all_genls_set(v_term, mt);
        final SubLObject all_quoted_isa_set = applicable_relations_all_quoted_isa_set(v_term, mt);
        SubLObject relations = NIL;
        final SubLObject relation_set = set.new_set(symbol_function(EQL), ZERO_INTEGER);
        SubLObject cdolist_list_var = all_isa;
        SubLObject arg_isa = NIL;
        arg_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != ar_below_horizonP(arg_isa, isa_horizon)) {
                final SubLObject pred_var = $$argIsa;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(arg_isa, THREE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(arg_isa, THREE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$1 = NIL;
                                final SubLObject token_var_$2 = NIL;
                                while (NIL == done_var_$1) {
                                    final SubLObject arg_isa_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(arg_isa_gaf));
                                    if (NIL != valid_$3) {
                                        final SubLObject relation = assertions_high.gaf_arg1(arg_isa_gaf);
                                        if ((NIL != ar_within_domainP(relation, domain, mt)) && (NIL != ar_within_usage_thresholdP(relation, usage_threshold))) {
                                            final SubLObject argnum = assertions_high.gaf_arg2(arg_isa_gaf);
                                            SubLObject some_arg_genlP = NIL;
                                            SubLObject some_arg_genl_within_horizonP = NIL;
                                            SubLObject rejectedP = NIL;
                                            final SubLObject pred_var_$4 = $$argGenl;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var_$4)) {
                                                final SubLObject iterator_var_$5 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var_$4);
                                                SubLObject done_var_$2 = rejectedP;
                                                final SubLObject token_var_$3 = NIL;
                                                while (NIL == done_var_$2) {
                                                    final SubLObject final_index_spec_$8 = iteration.iteration_next_without_values_macro_helper(iterator_var_$5, token_var_$3);
                                                    final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(final_index_spec_$8));
                                                    if (NIL != valid_$4) {
                                                        SubLObject final_index_iterator_$10 = NIL;
                                                        try {
                                                            final_index_iterator_$10 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$8, $GAF, $TRUE, NIL);
                                                            SubLObject done_var_$3 = rejectedP;
                                                            final SubLObject token_var_$4 = NIL;
                                                            while (NIL == done_var_$3) {
                                                                final SubLObject arg_genl_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$10, token_var_$4);
                                                                final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(arg_genl_gaf));
                                                                if ((NIL != valid_$5) && argnum.numE(assertions_high.gaf_arg2(arg_genl_gaf))) {
                                                                    some_arg_genlP = T;
                                                                    final SubLObject arg_genl = assertions_high.gaf_arg3(arg_genl_gaf);
                                                                    if (NIL != ar_below_horizonP(arg_genl, genls_horizon)) {
                                                                        some_arg_genl_within_horizonP = T;
                                                                    }
                                                                    if (NIL == set.set_memberP(arg_genl, all_genls_set)) {
                                                                        rejectedP = $ARG_GENL;
                                                                    }
                                                                }
                                                                done_var_$3 = makeBoolean((NIL == valid_$5) || (NIL != rejectedP));
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                                            try {
                                                                bind($is_thread_performing_cleanupP$, T);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator_$10) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$10);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                                            }
                                                        }
                                                    }
                                                    done_var_$2 = makeBoolean((NIL == valid_$4) || (NIL != rejectedP));
                                                } 
                                            }
                                            final SubLObject pred_var_$5 = $$argQuotedIsa;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var_$5)) {
                                                final SubLObject iterator_var_$6 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var_$5);
                                                SubLObject done_var_$4 = rejectedP;
                                                final SubLObject token_var_$5 = NIL;
                                                while (NIL == done_var_$4) {
                                                    final SubLObject final_index_spec_$9 = iteration.iteration_next_without_values_macro_helper(iterator_var_$6, token_var_$5);
                                                    final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(final_index_spec_$9));
                                                    if (NIL != valid_$6) {
                                                        SubLObject final_index_iterator_$11 = NIL;
                                                        try {
                                                            final_index_iterator_$11 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$9, $GAF, $TRUE, NIL);
                                                            SubLObject done_var_$5 = rejectedP;
                                                            final SubLObject token_var_$6 = NIL;
                                                            while (NIL == done_var_$5) {
                                                                final SubLObject arg_quoted_isa_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$11, token_var_$6);
                                                                final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(arg_quoted_isa_gaf));
                                                                if ((NIL != valid_$7) && argnum.numE(assertions_high.gaf_arg2(arg_quoted_isa_gaf))) {
                                                                    final SubLObject arg_quoted_isa = assertions_high.gaf_arg3(arg_quoted_isa_gaf);
                                                                    if (NIL == set.set_memberP(arg_quoted_isa, all_quoted_isa_set)) {
                                                                        rejectedP = $ARG_QUOTED_ISA;
                                                                    }
                                                                }
                                                                done_var_$5 = makeBoolean((NIL == valid_$7) || (NIL != rejectedP));
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                                                            try {
                                                                bind($is_thread_performing_cleanupP$, T);
                                                                final SubLObject _values2 = getValuesAsVector();
                                                                if (NIL != final_index_iterator_$11) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$11);
                                                                }
                                                                restoreValuesFromVector(_values2);
                                                            } finally {
                                                                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                                                            }
                                                        }
                                                    }
                                                    done_var_$4 = makeBoolean((NIL == valid_$6) || (NIL != rejectedP));
                                                } 
                                            }
                                            if ((NIL != some_arg_genlP) && (NIL == some_arg_genl_within_horizonP)) {
                                                rejectedP = $ARG_GENL_HORIZON;
                                            }
                                            if ((NIL == rejectedP) && (NIL != set.set_add(relation, relation_set))) {
                                                relations = cons(relation, relations);
                                            }
                                        }
                                    }
                                    done_var_$1 = makeBoolean(NIL == valid_$3);
                                } 
                            } finally {
                                final SubLObject _prev_bind_3 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values3 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_3);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_isa = cdolist_list_var.first();
        } 
        return nreverse(relations);
    }

    /**
     * Return a list of predicates applicable to TERM in MT.
     * PROPERTIES is a plist specifying additional restrictions on the search:
     * :ISA-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argIsa constraints on predicates.
     * :GENLS-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argGenl constraints on predicates.
     * :USAGE-THRESHOLD (when non-nil) states that returned predicates must have
     * at least this many uses.
     */
    @LispMethod(comment = "Return a list of predicates applicable to TERM in MT.\r\nPROPERTIES is a plist specifying additional restrictions on the search:\r\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argIsa constraints on predicates.\r\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argGenl constraints on predicates.\r\n:USAGE-THRESHOLD (when non-nil) states that returned predicates must have\r\nat least this many uses.\nReturn a list of predicates applicable to TERM in MT.\nPROPERTIES is a plist specifying additional restrictions on the search:\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argIsa constraints on predicates.\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argGenl constraints on predicates.\n:USAGE-THRESHOLD (when non-nil) states that returned predicates must have\nat least this many uses.")
    public static final SubLObject applicable_predicates_alt(SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        v_properties = copy_list(v_properties);
        v_properties = putf(v_properties, $DOMAIN, $$Predicate);
        return com.cyc.cycjava.cycl.applicable_relations.applicable_relations(v_term, mt, v_properties);
    }

    /**
     * Return a list of predicates applicable to TERM in MT.
     * PROPERTIES is a plist specifying additional restrictions on the search:
     * :ISA-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argIsa constraints on predicates.
     * :GENLS-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argGenl constraints on predicates.
     * :USAGE-THRESHOLD (when non-nil) states that returned predicates must have
     * at least this many uses.
     */
    @LispMethod(comment = "Return a list of predicates applicable to TERM in MT.\r\nPROPERTIES is a plist specifying additional restrictions on the search:\r\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argIsa constraints on predicates.\r\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argGenl constraints on predicates.\r\n:USAGE-THRESHOLD (when non-nil) states that returned predicates must have\r\nat least this many uses.\nReturn a list of predicates applicable to TERM in MT.\nPROPERTIES is a plist specifying additional restrictions on the search:\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argIsa constraints on predicates.\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argGenl constraints on predicates.\n:USAGE-THRESHOLD (when non-nil) states that returned predicates must have\nat least this many uses.")
    public static SubLObject applicable_predicates(final SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        v_properties = copy_list(v_properties);
        v_properties = putf(v_properties, $DOMAIN, $$Predicate);
        return applicable_relations(v_term, mt, v_properties);
    }/**
     * Return a list of predicates applicable to TERM in MT.
     * PROPERTIES is a plist specifying additional restrictions on the search:
     * :ISA-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argIsa constraints on predicates.
     * :GENLS-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argGenl constraints on predicates.
     * :USAGE-THRESHOLD (when non-nil) states that returned predicates must have
     * at least this many uses.
     */


    /**
     * Return a list of functions applicable to TERM in MT.
     * PROPERTIES is a plist specifying additional restrictions on the search:
     * :ISA-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argIsa constraints on functions.
     * :GENLS-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argGenl constraints on functions.
     * :USAGE-THRESHOLD (when non-nil) states that returned functions must have
     * at least this many uses.
     */
    @LispMethod(comment = "Return a list of functions applicable to TERM in MT.\r\nPROPERTIES is a plist specifying additional restrictions on the search:\r\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argIsa constraints on functions.\r\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argGenl constraints on functions.\r\n:USAGE-THRESHOLD (when non-nil) states that returned functions must have\r\nat least this many uses.\nReturn a list of functions applicable to TERM in MT.\nPROPERTIES is a plist specifying additional restrictions on the search:\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argIsa constraints on functions.\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argGenl constraints on functions.\n:USAGE-THRESHOLD (when non-nil) states that returned functions must have\nat least this many uses.")
    public static final SubLObject applicable_functions_alt(SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        v_properties = copy_list(v_properties);
        v_properties = putf(v_properties, $DOMAIN, $$Function_Denotational);
        return com.cyc.cycjava.cycl.applicable_relations.applicable_relations(v_term, mt, v_properties);
    }

    @LispMethod(comment = "Return a list of functions applicable to TERM in MT.\r\nPROPERTIES is a plist specifying additional restrictions on the search:\r\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argIsa constraints on functions.\r\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\r\nlimit allowed for #$argGenl constraints on functions.\r\n:USAGE-THRESHOLD (when non-nil) states that returned functions must have\r\nat least this many uses.\nReturn a list of functions applicable to TERM in MT.\nPROPERTIES is a plist specifying additional restrictions on the search:\n:ISA-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argIsa constraints on functions.\n:GENLS-HORIZON (when non-nil) states a collection that indicates the generality\nlimit allowed for #$argGenl constraints on functions.\n:USAGE-THRESHOLD (when non-nil) states that returned functions must have\nat least this many uses.")
    public static SubLObject applicable_functions(final SubLObject v_term, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        v_properties = copy_list(v_properties);
        v_properties = putf(v_properties, $DOMAIN, $$Function_Denotational);
        return applicable_relations(v_term, mt, v_properties);
    }/**
     * Return a list of functions applicable to TERM in MT.
     * PROPERTIES is a plist specifying additional restrictions on the search:
     * :ISA-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argIsa constraints on functions.
     * :GENLS-HORIZON (when non-nil) states a collection that indicates the generality
     * limit allowed for #$argGenl constraints on functions.
     * :USAGE-THRESHOLD (when non-nil) states that returned functions must have
     * at least this many uses.
     */


    public static final SubLObject ar_below_horizonP_alt(SubLObject constraint_col, SubLObject horizon) {
        if (NIL == horizon) {
            return T;
        }
        return cardinality_estimates.generality_estimateL(constraint_col, horizon);
    }

    public static SubLObject ar_below_horizonP(final SubLObject constraint_col, final SubLObject horizon) {
        if (NIL == horizon) {
            return T;
        }
        return cardinality_estimates.generality_estimateL(constraint_col, horizon);
    }

    public static final SubLObject ar_within_domainP_alt(SubLObject relation, SubLObject domain, SubLObject mt) {
        if (NIL == domain) {
            return T;
        }
        if (domain == $$Predicate) {
            return fort_types_interface.predicateP(relation);
        } else {
            if (domain == $$Function_Denotational) {
                return fort_types_interface.functionP(relation);
            } else {
                return isa.isaP(relation, domain, mt, UNPROVIDED);
            }
        }
    }

    public static SubLObject ar_within_domainP(final SubLObject relation, final SubLObject domain, final SubLObject mt) {
        if (NIL == domain) {
            return T;
        }
        if (domain.eql($$Predicate)) {
            return fort_types_interface.predicateP(relation);
        }
        if (domain.eql($$Function_Denotational)) {
            return fort_types_interface.functionP(relation);
        }
        return isa.isaP(relation, domain, mt, UNPROVIDED);
    }

    public static final SubLObject ar_within_usage_thresholdP_alt(SubLObject relation, SubLObject threshold) {
        if (NIL == threshold) {
            return T;
        }
        if (NIL != fort_types_interface.predicateP(relation)) {
            return numGE(kb_indexing.num_predicate_extent_index(relation, UNPROVIDED), threshold);
        } else {
            return numGE(kb_indexing.num_index(relation), threshold);
        }
    }

    public static SubLObject ar_within_usage_thresholdP(final SubLObject relation, final SubLObject threshold) {
        if (NIL == threshold) {
            return T;
        }
        if (NIL != fort_types_interface.predicateP(relation)) {
            return numGE(kb_indexing.num_predicate_extent_index(relation, UNPROVIDED), threshold);
        }
        return numGE(kb_indexing.num_index(relation), threshold);
    }

    public static final SubLObject applicable_relations_all_isa_alt(SubLObject v_term, SubLObject mt) {
        {
            SubLObject collections = NIL;
            if (NIL != forts.fort_p(v_term)) {
                collections = isa.all_isa(v_term, mt, UNPROVIDED);
            } else {
                if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
                    collections = isa.all_isa(v_term, mt, UNPROVIDED);
                } else {
                    collections = defns.all_defn_admits(v_term, mt);
                }
            }
            return cardinality_estimates.sort_by_generality_estimate(collections, $ASCENDING);
        }
    }

    public static SubLObject applicable_relations_all_isa(final SubLObject v_term, final SubLObject mt) {
        SubLObject collections = NIL;
        if (NIL != forts.fort_p(v_term)) {
            collections = isa.all_isa(v_term, mt, UNPROVIDED);
        } else
            if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
                collections = isa.all_isa(v_term, mt, UNPROVIDED);
            } else {
                collections = defns.all_defn_admits(v_term, mt);
            }

        return cardinality_estimates.sort_by_generality_estimate(collections, $ASCENDING);
    }

    public static final SubLObject applicable_relations_all_genls_set_alt(SubLObject v_term, SubLObject mt) {
        {
            SubLObject collections = NIL;
            if (NIL != fort_types_interface.isa_collectionP(v_term, mt)) {
                collections = genls.all_genls(v_term, mt, UNPROVIDED);
            }
            return set_utilities.construct_set_from_list(collections, symbol_function(EQ), UNPROVIDED);
        }
    }

    public static SubLObject applicable_relations_all_genls_set(final SubLObject v_term, final SubLObject mt) {
        SubLObject collections = NIL;
        if (NIL != fort_types_interface.isa_collectionP(v_term, mt)) {
            collections = genls.all_genls(v_term, mt, UNPROVIDED);
        }
        return set_utilities.construct_set_from_list(collections, symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject applicable_relations_all_quoted_isa_set_alt(SubLObject v_term, SubLObject mt) {
        {
            SubLObject collections = NIL;
            if (NIL != forts.fort_p(v_term)) {
                collections = isa.all_quoted_isa(v_term, mt, UNPROVIDED);
            } else {
                if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
                    collections = isa.all_quoted_isa(v_term, mt, UNPROVIDED);
                } else {
                    collections = defns.all_quoted_defn_admits(v_term, mt);
                }
            }
            return set_utilities.construct_set_from_list(collections, symbol_function(EQ), UNPROVIDED);
        }
    }

    public static SubLObject applicable_relations_all_quoted_isa_set(final SubLObject v_term, final SubLObject mt) {
        SubLObject collections = NIL;
        if (NIL != forts.fort_p(v_term)) {
            collections = isa.all_quoted_isa(v_term, mt, UNPROVIDED);
        } else
            if (NIL != cycl_grammar.cycl_nat_p(v_term)) {
                collections = isa.all_quoted_isa(v_term, mt, UNPROVIDED);
            } else {
                collections = defns.all_quoted_defn_admits(v_term, mt);
            }

        return set_utilities.construct_set_from_list(collections, symbol_function(EQ), UNPROVIDED);
    }

    /**
     * Return a list of predicates that are applicable to every term in TERMS in MT.
     * PROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.
     */
    @LispMethod(comment = "Return a list of predicates that are applicable to every term in TERMS in MT.\r\nPROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.\nReturn a list of predicates that are applicable to every term in TERMS in MT.\nPROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.")
    public static final SubLObject applicable_predicates_for_terms_alt(SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.checkType(terms, CONSP);
        {
            SubLObject datum = terms;
            SubLObject current = datum;
            SubLObject v_term = NIL;
            SubLObject other_terms = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            v_term = current.first();
            current = current.rest();
            other_terms = current;
            {
                SubLObject result = com.cyc.cycjava.cycl.applicable_relations.applicable_predicates(v_term, mt, v_properties);
                SubLObject v_keyhash = keyhash.new_keyhash(length(result), symbol_function(EQ));
                SubLObject cdolist_list_var = other_terms;
                SubLObject other_term = NIL;
                for (other_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , other_term = cdolist_list_var.first()) {
                    {
                        SubLObject predicates = com.cyc.cycjava.cycl.applicable_relations.applicable_predicates(other_term, mt, v_properties);
                        v_keyhash = com.cyc.cycjava.cycl.applicable_relations.keyhash_refill(v_keyhash, predicates);
                    }
                    result = delete(v_keyhash, result, symbol_function(NOT_KEYHASH_KEY_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a list of predicates that are applicable to every term in TERMS in MT.\r\nPROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.\nReturn a list of predicates that are applicable to every term in TERMS in MT.\nPROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.")
    public static SubLObject applicable_predicates_for_terms(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != consp(terms) : "! consp(terms) " + ("Types.consp(terms) " + "CommonSymbols.NIL != Types.consp(terms) ") + terms;
        SubLObject v_term = NIL;
        SubLObject other_terms = NIL;
        destructuring_bind_must_consp(terms, terms, $list16);
        v_term = terms.first();
        final SubLObject current = other_terms = terms.rest();
        SubLObject result = applicable_predicates(v_term, mt, v_properties);
        SubLObject v_keyhash = keyhash.new_keyhash(length(result), symbol_function(EQ));
        SubLObject cdolist_list_var = other_terms;
        SubLObject other_term = NIL;
        other_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject predicates = applicable_predicates(other_term, mt, v_properties);
            v_keyhash = keyhash_refill(v_keyhash, predicates);
            result = delete(v_keyhash, result, symbol_function(NOT_KEYHASH_KEY_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            other_term = cdolist_list_var.first();
        } 
        return result;
    }/**
     * Return a list of predicates that are applicable to every term in TERMS in MT.
     * PROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.
     */


    /**
     * Return a list of suggested GAFs that could relate TERMS in MT.
     * PROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.
     */
    @LispMethod(comment = "Return a list of suggested GAFs that could relate TERMS in MT.\r\nPROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.\nReturn a list of suggested GAFs that could relate TERMS in MT.\nPROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.")
    public static final SubLObject suggest_gafs_for_terms_alt(SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject candidate_predicates = com.cyc.cycjava.cycl.applicable_relations.possible_gaf_predicates_for_terms(terms, mt, v_properties);
            SubLObject max_number = getf(v_properties, $MAX_NUMBER, NIL);
            return com.cyc.cycjava.cycl.applicable_relations.suggest_gafs_for_terms_using_predicates(terms, candidate_predicates, mt, max_number);
        }
    }

    @LispMethod(comment = "Return a list of suggested GAFs that could relate TERMS in MT.\r\nPROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.\nReturn a list of suggested GAFs that could relate TERMS in MT.\nPROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.")
    public static SubLObject suggest_gafs_for_terms(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject candidate_predicates = possible_gaf_predicates_for_terms(terms, mt, v_properties);
        final SubLObject max_number = getf(v_properties, $MAX_NUMBER, NIL);
        return suggest_gafs_for_terms_using_predicates(terms, candidate_predicates, mt, max_number);
    }/**
     * Return a list of suggested GAFs that could relate TERMS in MT.
     * PROPERTIES controls the allowable predicates as in @xref APPLICABLE-PREDICATES.
     */


    /**
     * Return a list of suggested GAFs that could relate TERMS in MT involving PREDICATES.
     * MAX-NUMBER, if non-nil, is an upper bound on the number of GAFs to return.
     */
    @LispMethod(comment = "Return a list of suggested GAFs that could relate TERMS in MT involving PREDICATES.\r\nMAX-NUMBER, if non-nil, is an upper bound on the number of GAFs to return.\nReturn a list of suggested GAFs that could relate TERMS in MT involving PREDICATES.\nMAX-NUMBER, if non-nil, is an upper bound on the number of GAFs to return.")
    public static final SubLObject suggest_gafs_for_terms_using_predicates_alt(SubLObject terms, SubLObject predicates, SubLObject mt, SubLObject max_number) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_candidate_gafs = NIL;
                SubLObject total = ZERO_INTEGER;
                SubLObject doneP = NIL;
                {
                    SubLObject _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding(thread);
                    try {
                        wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
                        {
                            SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_24 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                        Errors.error($str_alt19$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            if (NIL == wff_macros.within_wffP()) {
                                                wff.reset_wff_state();
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    {
                                                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                        {
                                                            SubLObject _prev_bind_0_26 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                            SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TWELVE_INTEGER), thread);
                                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                                {
                                                                    SubLObject list_var = predicates;
                                                                    $progress_note$.setDynamicValue($$$Considering_predicates, thread);
                                                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                                                    {
                                                                        SubLObject _prev_bind_0_27 = $last_percent_progress_index$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_28 = $last_percent_progress_prediction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_29 = $within_noting_percent_progress$.currentBinding(thread);
                                                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                                        try {
                                                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                                                            $within_noting_percent_progress$.bind(T, thread);
                                                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                                            {
                                                                                SubLObject csome_list_var = list_var;
                                                                                SubLObject predicate = NIL;
                                                                                for (predicate = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
                                                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                                    if (NIL == doneP) {
                                                                                        {
                                                                                            SubLObject candidate_gafs = com.cyc.cycjava.cycl.applicable_relations.suggest_gafs_for_terms_using_predicate(terms, predicate, mt);
                                                                                            total = add(total, length(candidate_gafs));
                                                                                            if (NIL != max_number) {
                                                                                                doneP = makeBoolean((NIL != max_number) && total.numGE(max_number));
                                                                                            }
                                                                                            all_candidate_gafs = nreconc(candidate_gafs, all_candidate_gafs);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            noting_percent_progress_postamble();
                                                                        } finally {
                                                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                            $within_noting_percent_progress$.rebind(_prev_bind_2_29, thread);
                                                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_28, thread);
                                                                            $last_percent_progress_index$.rebind(_prev_bind_0_27, thread);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_26, thread);
                                                            }
                                                        }
                                                    }
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_25, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_24, thread);
                                }
                            }
                        }
                    } finally {
                        wff_vars.$wff_memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                all_candidate_gafs = nreverse(all_candidate_gafs);
                if (NIL != max_number) {
                    all_candidate_gafs = list_utilities.first_n(max_number, all_candidate_gafs);
                }
                return all_candidate_gafs;
            }
        }
    }

    @LispMethod(comment = "Return a list of suggested GAFs that could relate TERMS in MT involving PREDICATES.\r\nMAX-NUMBER, if non-nil, is an upper bound on the number of GAFs to return.\nReturn a list of suggested GAFs that could relate TERMS in MT involving PREDICATES.\nMAX-NUMBER, if non-nil, is an upper bound on the number of GAFs to return.")
    public static SubLObject suggest_gafs_for_terms_using_predicates(final SubLObject terms, final SubLObject predicates, SubLObject mt, SubLObject max_number) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (max_number == UNPROVIDED) {
            max_number = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_candidate_gafs = NIL;
        SubLObject total = ZERO_INTEGER;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding(thread);
        try {
            wff_vars.$wff_memoization_state$.bind(wff_macros.possibly_new_wff_memoization_state(), thread);
            final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$24 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == wff_macros.within_wffP()) {
                        wff.reset_wff_state();
                    }
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$25 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, TWELVE_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        final SubLObject _prev_bind_0_$26 = $progress_note$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$27 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$28 = $progress_total$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $progress_note$.bind($$$Considering_predicates, thread);
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_total$.bind(length(predicates), thread);
                            $progress_sofar$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                SubLObject csome_list_var = predicates;
                                SubLObject predicate = NIL;
                                predicate = csome_list_var.first();
                                while (NIL != csome_list_var) {
                                    if (NIL == doneP) {
                                        final SubLObject candidate_gafs = suggest_gafs_for_terms_using_predicate(terms, predicate, mt);
                                        total = add(total, length(candidate_gafs));
                                        if (NIL != max_number) {
                                            doneP = makeBoolean((NIL != max_number) && total.numGE(max_number));
                                        }
                                        all_candidate_gafs = nreconc(candidate_gafs, all_candidate_gafs);
                                    }
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    csome_list_var = csome_list_var.rest();
                                    predicate = csome_list_var.first();
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                            $progress_sofar$.rebind(_prev_bind_4, thread);
                            $progress_total$.rebind(_prev_bind_2_$28, thread);
                            $progress_start_time$.rebind(_prev_bind_1_$27, thread);
                            $progress_note$.rebind(_prev_bind_0_$26, thread);
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$25, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$24, thread);
            }
        } finally {
            wff_vars.$wff_memoization_state$.rebind(_prev_bind_0, thread);
        }
        all_candidate_gafs = nreverse(all_candidate_gafs);
        if (NIL != max_number) {
            all_candidate_gafs = list_utilities.first_n(max_number, all_candidate_gafs);
        }
        return all_candidate_gafs;
    }/**
     * Return a list of suggested GAFs that could relate TERMS in MT involving PREDICATES.
     * MAX-NUMBER, if non-nil, is an upper bound on the number of GAFs to return.
     */


    /**
     * Return a list of suggested GAFs that could relate TERMS in MT involving PREDICATE (if possible).
     */
    @LispMethod(comment = "Return a list of suggested GAFs that could relate TERMS in MT involving PREDICATE (if possible).")
    public static final SubLObject suggest_gafs_for_terms_using_predicate_alt(SubLObject terms, SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject candidate_gafs = NIL;
            SubLObject cdolist_list_var = list_utilities.permute_list(terms, UNPROVIDED);
            SubLObject candidate_args = NIL;
            for (candidate_args = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_args = cdolist_list_var.first()) {
                {
                    SubLObject candidate_gaf = make_formula(predicate, candidate_args, UNPROVIDED);
                    if (NIL != wff.el_wffP(candidate_gaf, mt, UNPROVIDED)) {
                        candidate_gafs = cons(candidate_gaf, candidate_gafs);
                    }
                }
            }
            return nreverse(candidate_gafs);
        }
    }

    @LispMethod(comment = "Return a list of suggested GAFs that could relate TERMS in MT involving PREDICATE (if possible).")
    public static SubLObject suggest_gafs_for_terms_using_predicate(final SubLObject terms, final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject candidate_gafs = NIL;
        SubLObject cdolist_list_var = list_utilities.permute_list(terms, UNPROVIDED);
        SubLObject candidate_args = NIL;
        candidate_args = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject candidate_gaf = make_formula(predicate, candidate_args, UNPROVIDED);
            if (NIL != wff.el_wffP(candidate_gaf, mt, UNPROVIDED)) {
                candidate_gafs = cons(candidate_gaf, candidate_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_args = cdolist_list_var.first();
        } 
        return nreverse(candidate_gafs);
    }/**
     * Return a list of suggested GAFs that could relate TERMS in MT involving PREDICATE (if possible).
     */


    public static final SubLObject possible_gaf_predicates_for_terms_alt(SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject candidate_predicates = com.cyc.cycjava.cycl.applicable_relations.applicable_predicates_for_terms(terms, mt, v_properties);
            SubLObject call_arity = length(terms);
            SubLObject predicates = NIL;
            SubLObject cdolist_list_var = candidate_predicates;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                if (arity.arity(predicate).eql(call_arity)) {
                    predicates = cons(predicate, predicates);
                }
            }
            predicates = com.cyc.cycjava.cycl.applicable_relations.sort_predicates_for_gaf_suggestion(predicates);
            return predicates;
        }
    }

    public static SubLObject possible_gaf_predicates_for_terms(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject candidate_predicates = applicable_predicates_for_terms(terms, mt, v_properties);
        final SubLObject call_arity = length(terms);
        SubLObject predicates = NIL;
        SubLObject cdolist_list_var = candidate_predicates;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (arity.arity(predicate).eql(call_arity)) {
                predicates = cons(predicate, predicates);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        predicates = sort_predicates_for_gaf_suggestion(predicates);
        return predicates;
    }

    public static final SubLObject new_possible_gaf_predicates_iterator_alt(SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject candidate_predicates = com.cyc.cycjava.cycl.applicable_relations.possible_gaf_predicates_for_terms(terms, mt, v_properties);
            return iteration.new_list_iterator(candidate_predicates);
        }
    }

    public static SubLObject new_possible_gaf_predicates_iterator(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject candidate_predicates = possible_gaf_predicates_for_terms(terms, mt, v_properties);
        return iteration.new_list_iterator(candidate_predicates);
    }

    public static final SubLObject new_suggested_gafs_for_terms_iterator_alt(SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return iteration.new_iterator(com.cyc.cycjava.cycl.applicable_relations.make_suggested_gafs_for_terms_iterator_state(terms, mt, v_properties), SUGGESTED_GAFS_FOR_TERMS_ITERATOR_DONE_P, SUGGESTED_GAFS_FOR_TERMS_ITERATOR_NEXT, UNPROVIDED);
    }

    public static SubLObject new_suggested_gafs_for_terms_iterator(final SubLObject terms, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return iteration.new_iterator(make_suggested_gafs_for_terms_iterator_state(terms, mt, v_properties), SUGGESTED_GAFS_FOR_TERMS_ITERATOR_DONE_P, SUGGESTED_GAFS_FOR_TERMS_ITERATOR_NEXT, UNPROVIDED);
    }

    public static final SubLObject make_suggested_gafs_for_terms_iterator_state_alt(SubLObject terms, SubLObject mt, SubLObject v_properties) {
        {
            SubLObject candidate_gafs = queues.create_queue();
            SubLObject candidate_predicate_iterator = com.cyc.cycjava.cycl.applicable_relations.new_possible_gaf_predicates_iterator(terms, mt, v_properties);
            SubLObject total = ZERO_INTEGER;
            SubLObject max_number = getf(v_properties, $MAX_NUMBER, NIL);
            SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject sbhl_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TWELVE_INTEGER);
            SubLObject mt_info = mt_relevance_macros.mt_info(mt);
            SubLObject state = list(candidate_gafs, candidate_predicate_iterator, total, max_number, v_memoization_state, sbhl_resource, terms, mt_info);
            return state;
        }
    }

    public static SubLObject make_suggested_gafs_for_terms_iterator_state(final SubLObject terms, final SubLObject mt, final SubLObject v_properties) {
        final SubLObject candidate_gafs = queues.create_queue(UNPROVIDED);
        final SubLObject candidate_predicate_iterator = new_possible_gaf_predicates_iterator(terms, mt, v_properties);
        final SubLObject total = ZERO_INTEGER;
        final SubLObject max_number = getf(v_properties, $MAX_NUMBER, NIL);
        final SubLObject v_memoization_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject sbhl_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TWELVE_INTEGER);
        final SubLObject mt_info = mt_relevance_macros.mt_info(mt);
        final SubLObject state = list(candidate_gafs, candidate_predicate_iterator, total, max_number, v_memoization_state, sbhl_resource, terms, mt_info);
        return state;
    }

    public static final SubLObject suggested_gafs_for_terms_iterator_done_p_alt(SubLObject state) {
        {
            SubLObject datum = state;
            SubLObject current = datum;
            SubLObject candidate_gafs = NIL;
            SubLObject candidate_predicate_iterator = NIL;
            SubLObject total = NIL;
            SubLObject max_number = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            candidate_gafs = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            candidate_predicate_iterator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            total = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt23);
            max_number = current.first();
            current = current.rest();
            {
                SubLObject resources = current;
                return makeBoolean(((NIL != queues.queue_empty_p(candidate_gafs)) && (NIL != iteration.iteration_done(candidate_predicate_iterator))) || ((NIL != max_number) && total.numGE(max_number)));
            }
        }
    }

    public static SubLObject suggested_gafs_for_terms_iterator_done_p(final SubLObject state) {
        SubLObject candidate_gafs = NIL;
        SubLObject candidate_predicate_iterator = NIL;
        SubLObject total = NIL;
        SubLObject max_number = NIL;
        destructuring_bind_must_consp(state, state, $list23);
        candidate_gafs = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list23);
        candidate_predicate_iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list23);
        total = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list23);
        max_number = current.first();
        final SubLObject resources;
        current = resources = current.rest();
        return makeBoolean(((NIL != queues.queue_empty_p(candidate_gafs)) && (NIL != iteration.iteration_done(candidate_predicate_iterator))) || ((NIL != max_number) && total.numGE(max_number)));
    }

    public static final SubLObject suggested_gafs_for_terms_iterator_next_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = state;
                SubLObject current = datum;
                SubLObject candidate_gafs = NIL;
                SubLObject candidate_predicate_iterator = NIL;
                SubLObject total = NIL;
                SubLObject max_number = NIL;
                SubLObject v_memoization_state = NIL;
                SubLObject sbhl_resource = NIL;
                SubLObject terms = NIL;
                SubLObject mt_info = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt24);
                candidate_gafs = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt24);
                candidate_predicate_iterator = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt24);
                total = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt24);
                max_number = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt24);
                v_memoization_state = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt24);
                sbhl_resource = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt24);
                terms = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt24);
                mt_info = current.first();
                current = current.rest();
                if (NIL == current) {
                    while ((NIL != queues.queue_empty_p(candidate_gafs)) && (NIL == iteration.iteration_done(candidate_predicate_iterator))) {
                        {
                            SubLObject predicate = iteration.iteration_next(candidate_predicate_iterator);
                            {
                                SubLObject _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding(thread);
                                try {
                                    wff_vars.$wff_memoization_state$.bind(v_memoization_state, thread);
                                    {
                                        SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_30 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                                    Errors.error($str_alt19$Invalid_attempt_to_reuse_memoizat);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    try {
                                                        if (NIL == wff_macros.within_wffP()) {
                                                            wff.reset_wff_state();
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                {
                                                                    SubLObject _prev_bind_0_32 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                                                        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                                                                            {
                                                                                SubLObject _prev_bind_0_33 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_34 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                                try {
                                                                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                                                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                                                                    {
                                                                                        SubLObject gafs = com.cyc.cycjava.cycl.applicable_relations.suggest_gafs_for_terms_using_predicate(terms, predicate, UNPROVIDED);
                                                                                        SubLObject cdolist_list_var = gafs;
                                                                                        SubLObject gaf = NIL;
                                                                                        for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                                                            queues.enqueue(gaf, candidate_gafs);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_34, thread);
                                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_33, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                                                                                {
                                                                                    SubLObject _prev_bind_0_35 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                    SubLObject _prev_bind_1_36 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                                    try {
                                                                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                                                                        mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                                                                        {
                                                                                            SubLObject gafs = com.cyc.cycjava.cycl.applicable_relations.suggest_gafs_for_terms_using_predicate(terms, predicate, UNPROVIDED);
                                                                                            SubLObject cdolist_list_var = gafs;
                                                                                            SubLObject gaf = NIL;
                                                                                            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                                                                queues.enqueue(gaf, candidate_gafs);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_36, thread);
                                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_35, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_37 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_38 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                        try {
                                                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                                                                                            mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                                                                                            {
                                                                                                SubLObject gafs = com.cyc.cycjava.cycl.applicable_relations.suggest_gafs_for_terms_using_predicate(terms, predicate, UNPROVIDED);
                                                                                                SubLObject cdolist_list_var = gafs;
                                                                                                SubLObject gaf = NIL;
                                                                                                for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                                                                    queues.enqueue(gaf, candidate_gafs);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_38, thread);
                                                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_37, thread);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_39 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_40 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                                                        try {
                                                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                                                                            mt_relevance_macros.$mt$.bind(mt_info, thread);
                                                                                            {
                                                                                                SubLObject gafs = com.cyc.cycjava.cycl.applicable_relations.suggest_gafs_for_terms_using_predicate(terms, predicate, UNPROVIDED);
                                                                                                SubLObject cdolist_list_var = gafs;
                                                                                                SubLObject gaf = NIL;
                                                                                                for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                                                                                                    queues.enqueue(gaf, candidate_gafs);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_40, thread);
                                                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_39, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                                                    } finally {
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
                                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1, thread);
                                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_32, thread);
                                                                    }
                                                                }
                                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_31, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_30, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    wff_vars.$wff_memoization_state$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } 
                    if (NIL == queues.queue_empty_p(candidate_gafs)) {
                        {
                            SubLObject next = queues.dequeue(candidate_gafs);
                            set_nth(TWO_INTEGER, state, add(nth(TWO_INTEGER, state), ONE_INTEGER));
                            return values(next, state, NIL);
                        }
                    }
                    return values(NIL, state, T);
                } else {
                    cdestructuring_bind_error(datum, $list_alt24);
                }
            }
            return NIL;
        }
    }

    public static SubLObject suggested_gafs_for_terms_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candidate_gafs = NIL;
        SubLObject candidate_predicate_iterator = NIL;
        SubLObject total = NIL;
        SubLObject max_number = NIL;
        SubLObject v_memoization_state = NIL;
        SubLObject sbhl_resource = NIL;
        SubLObject terms = NIL;
        SubLObject mt_info = NIL;
        destructuring_bind_must_consp(state, state, $list24);
        candidate_gafs = state.first();
        SubLObject current = state.rest();
        destructuring_bind_must_consp(current, state, $list24);
        candidate_predicate_iterator = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list24);
        total = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list24);
        max_number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list24);
        v_memoization_state = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list24);
        sbhl_resource = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list24);
        terms = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, state, $list24);
        mt_info = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(state, $list24);
            return NIL;
        }
        while ((NIL != queues.queue_empty_p(candidate_gafs)) && (NIL == iteration.iteration_done(candidate_predicate_iterator))) {
            final SubLObject predicate = iteration.iteration_next(candidate_predicate_iterator);
            final SubLObject _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding(thread);
            try {
                wff_vars.$wff_memoization_state$.bind(v_memoization_state, thread);
                final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$31 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        if (NIL == wff_macros.within_wffP()) {
                            wff.reset_wff_state();
                        }
                        final SubLObject _prev_bind_0_$32 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_resource, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                            try {
                                if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
                                    final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$34 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        SubLObject cdolist_list_var;
                                        final SubLObject gafs = cdolist_list_var = suggest_gafs_for_terms_using_predicate(terms, predicate, UNPROVIDED);
                                        SubLObject gaf = NIL;
                                        gaf = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            queues.enqueue(gaf, candidate_gafs);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            gaf = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$34, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$33, thread);
                                    }
                                } else
                                    if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                                        final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$35 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                                            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                                            SubLObject cdolist_list_var;
                                            final SubLObject gafs = cdolist_list_var = suggest_gafs_for_terms_using_predicate(terms, predicate, UNPROVIDED);
                                            SubLObject gaf = NIL;
                                            gaf = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                queues.enqueue(gaf, candidate_gafs);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                gaf = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1_$35, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
                                        }
                                    } else
                                        if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                                            final SubLObject _prev_bind_0_$35 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$36 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                                                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                                                SubLObject cdolist_list_var;
                                                final SubLObject gafs = cdolist_list_var = suggest_gafs_for_terms_using_predicate(terms, predicate, UNPROVIDED);
                                                SubLObject gaf = NIL;
                                                gaf = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    queues.enqueue(gaf, candidate_gafs);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    gaf = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$36, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$35, thread);
                                            }
                                        } else {
                                            final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$37 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                                mt_relevance_macros.$mt$.bind(mt_info, thread);
                                                SubLObject cdolist_list_var;
                                                final SubLObject gafs = cdolist_list_var = suggest_gafs_for_terms_using_predicate(terms, predicate, UNPROVIDED);
                                                SubLObject gaf = NIL;
                                                gaf = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    queues.enqueue(gaf, candidate_gafs);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    gaf = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$37, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$36, thread);
                                            }
                                        }


                            } finally {
                                final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$32, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$31, thread);
                }
            } finally {
                wff_vars.$wff_memoization_state$.rebind(_prev_bind_0, thread);
            }
        } 
        if (NIL == queues.queue_empty_p(candidate_gafs)) {
            final SubLObject next = queues.dequeue(candidate_gafs);
            set_nth(TWO_INTEGER, state, add(nth(TWO_INTEGER, state), ONE_INTEGER));
            return values(next, state, NIL);
        }
        return values(NIL, state, T);
    }

    /**
     * Sort PREDICATES in order of heuristic goodness for GAF suggestion.
     */
    @LispMethod(comment = "Sort PREDICATES in order of heuristic goodness for GAF suggestion.")
    public static final SubLObject sort_predicates_for_gaf_suggestion_alt(SubLObject predicates) {
        return Sort.sort(predicates, symbol_function($sym31$PREDICATE_BETTER_FOR_GAF_SUGGESTION_), UNPROVIDED);
    }

    @LispMethod(comment = "Sort PREDICATES in order of heuristic goodness for GAF suggestion.")
    public static SubLObject sort_predicates_for_gaf_suggestion(final SubLObject predicates) {
        return Sort.sort(predicates, symbol_function($sym31$PREDICATE_BETTER_FOR_GAF_SUGGESTION_), UNPROVIDED);
    }/**
     * Sort PREDICATES in order of heuristic goodness for GAF suggestion.
     */


    /**
     * Return T iff PRED1 is a heuristically better predicate for GAF suggestion than PRED2.
     */
    @LispMethod(comment = "Return T iff PRED1 is a heuristically better predicate for GAF suggestion than PRED2.")
    public static final SubLObject predicate_better_for_gaf_suggestionP_alt(SubLObject pred1, SubLObject pred2) {
        return numL(relationship_generality_estimates.relation_generality_estimate(pred1), relationship_generality_estimates.relation_generality_estimate(pred2));
    }

    @LispMethod(comment = "Return T iff PRED1 is a heuristically better predicate for GAF suggestion than PRED2.")
    public static SubLObject predicate_better_for_gaf_suggestionP(final SubLObject pred1, final SubLObject pred2) {
        return numL(relationship_generality_estimates.relation_generality_estimate(pred1), relationship_generality_estimates.relation_generality_estimate(pred2));
    }/**
     * Return T iff PRED1 is a heuristically better predicate for GAF suggestion than PRED2.
     */


    /**
     * Return an integer which is a heuristic estimate of the goodness of PREDICATE for GAF suggestion.
     * Lower values indicate a better PREDICATE.
     */
    @LispMethod(comment = "Return an integer which is a heuristic estimate of the goodness of PREDICATE for GAF suggestion.\r\nLower values indicate a better PREDICATE.\nReturn an integer which is a heuristic estimate of the goodness of PREDICATE for GAF suggestion.\nLower values indicate a better PREDICATE.")
    public static final SubLObject predicate_gaf_suggestion_heuristic_alt(SubLObject predicate) {
        return subtract(relationship_generality_estimates.relation_generality_estimate(predicate), com.cyc.cycjava.cycl.applicable_relations.predicate_usage_estimate(predicate));
    }

    @LispMethod(comment = "Return an integer which is a heuristic estimate of the goodness of PREDICATE for GAF suggestion.\r\nLower values indicate a better PREDICATE.\nReturn an integer which is a heuristic estimate of the goodness of PREDICATE for GAF suggestion.\nLower values indicate a better PREDICATE.")
    public static SubLObject predicate_gaf_suggestion_heuristic(final SubLObject predicate) {
        return subtract(relationship_generality_estimates.relation_generality_estimate(predicate), predicate_usage_estimate(predicate));
    }/**
     * Return an integer which is a heuristic estimate of the goodness of PREDICATE for GAF suggestion.
     * Lower values indicate a better PREDICATE.
     */


    /**
     * Return a non-negative integer which is a logscale estimate of the usage of PREDICATE.
     * Larger values indicate a predicate that is used more.
     */
    @LispMethod(comment = "Return a non-negative integer which is a logscale estimate of the usage of PREDICATE.\r\nLarger values indicate a predicate that is used more.\nReturn a non-negative integer which is a logscale estimate of the usage of PREDICATE.\nLarger values indicate a predicate that is used more.")
    public static final SubLObject predicate_usage_estimate_alt(SubLObject predicate) {
        if (NIL == forts.fort_p(predicate)) {
            return ZERO_INTEGER;
        }
        return com.cyc.cycjava.cycl.applicable_relations.predicate_usage_estimate_cached(predicate);
    }

    @LispMethod(comment = "Return a non-negative integer which is a logscale estimate of the usage of PREDICATE.\r\nLarger values indicate a predicate that is used more.\nReturn a non-negative integer which is a logscale estimate of the usage of PREDICATE.\nLarger values indicate a predicate that is used more.")
    public static SubLObject predicate_usage_estimate(final SubLObject predicate) {
        if (NIL == forts.fort_p(predicate)) {
            return ZERO_INTEGER;
        }
        return predicate_usage_estimate_cached(predicate);
    }/**
     * Return a non-negative integer which is a logscale estimate of the usage of PREDICATE.
     * Larger values indicate a predicate that is used more.
     */


    public static final SubLObject clear_predicate_usage_estimate_cached_alt() {
        {
            SubLObject cs = $predicate_usage_estimate_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_predicate_usage_estimate_cached() {
        final SubLObject cs = $predicate_usage_estimate_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_predicate_usage_estimate_cached_alt(SubLObject predicate) {
        return memoization_state.caching_state_remove_function_results_with_args($predicate_usage_estimate_cached_caching_state$.getGlobalValue(), list(predicate), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_predicate_usage_estimate_cached(final SubLObject predicate) {
        return memoization_state.caching_state_remove_function_results_with_args($predicate_usage_estimate_cached_caching_state$.getGlobalValue(), list(predicate), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject predicate_usage_estimate_cached_internal_alt(SubLObject predicate) {
        {
            SubLObject count = kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED);
            if (!count.isPositive()) {
                return ZERO_INTEGER;
            }
            return values(truncate(multiply($int$1000, log(count, TWO_INTEGER)), UNPROVIDED));
        }
    }

    public static SubLObject predicate_usage_estimate_cached_internal(final SubLObject predicate) {
        final SubLObject count = kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED);
        if (!count.isPositive()) {
            return ZERO_INTEGER;
        }
        return values(truncate(multiply($int$1000, log(count, TWO_INTEGER)), UNPROVIDED));
    }

    public static final SubLObject predicate_usage_estimate_cached_alt(SubLObject predicate) {
        {
            SubLObject caching_state = $predicate_usage_estimate_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(PREDICATE_USAGE_ESTIMATE_CACHED, $predicate_usage_estimate_cached_caching_state$, NIL, EQ, ONE_INTEGER, $int$100);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw36$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw36$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.applicable_relations.predicate_usage_estimate_cached_internal(predicate)));
                    memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject predicate_usage_estimate_cached(final SubLObject predicate) {
        SubLObject caching_state = $predicate_usage_estimate_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PREDICATE_USAGE_ESTIMATE_CACHED, $predicate_usage_estimate_cached_caching_state$, NIL, EQ, ONE_INTEGER, $int$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(predicate_usage_estimate_cached_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject keyhash_refill_alt(SubLObject v_keyhash, SubLObject objects) {
        SubLTrampolineFile.checkType(v_keyhash, KEYHASH_P);
        keyhash.clrkeyhash(v_keyhash);
        {
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = NIL;
            for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                keyhash.setkeyhash(v_object, v_keyhash);
            }
        }
        return v_keyhash;
    }

    public static SubLObject keyhash_refill(final SubLObject v_keyhash, final SubLObject objects) {
        assert NIL != keyhash.keyhash_p(v_keyhash) : "! keyhash.keyhash_p(v_keyhash) " + ("keyhash.keyhash_p(v_keyhash) " + "CommonSymbols.NIL != keyhash.keyhash_p(v_keyhash) ") + v_keyhash;
        keyhash.clrkeyhash(v_keyhash);
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            keyhash.setkeyhash(v_object, v_keyhash);
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        } 
        return v_keyhash;
    }

    public static final SubLObject not_keyhash_key_p_alt(SubLObject v_keyhash, SubLObject key) {
        return makeBoolean(NIL == keyhash.getkeyhash(key, v_keyhash));
    }

    public static SubLObject not_keyhash_key_p(final SubLObject v_keyhash, final SubLObject key) {
        return makeBoolean(NIL == keyhash.getkeyhash(key, v_keyhash));
    }

    public static SubLObject declare_applicable_relations_file() {
        declareFunction("applicable_relations", "APPLICABLE-RELATIONS", 1, 2, false);
        declareFunction("applicable_predicates", "APPLICABLE-PREDICATES", 1, 2, false);
        declareFunction("applicable_functions", "APPLICABLE-FUNCTIONS", 1, 2, false);
        declareFunction("ar_below_horizonP", "AR-BELOW-HORIZON?", 2, 0, false);
        declareFunction("ar_within_domainP", "AR-WITHIN-DOMAIN?", 3, 0, false);
        declareFunction("ar_within_usage_thresholdP", "AR-WITHIN-USAGE-THRESHOLD?", 2, 0, false);
        declareFunction("applicable_relations_all_isa", "APPLICABLE-RELATIONS-ALL-ISA", 2, 0, false);
        declareFunction("applicable_relations_all_genls_set", "APPLICABLE-RELATIONS-ALL-GENLS-SET", 2, 0, false);
        declareFunction("applicable_relations_all_quoted_isa_set", "APPLICABLE-RELATIONS-ALL-QUOTED-ISA-SET", 2, 0, false);
        declareFunction("applicable_predicates_for_terms", "APPLICABLE-PREDICATES-FOR-TERMS", 1, 2, false);
        declareFunction("suggest_gafs_for_terms", "SUGGEST-GAFS-FOR-TERMS", 1, 2, false);
        declareFunction("suggest_gafs_for_terms_using_predicates", "SUGGEST-GAFS-FOR-TERMS-USING-PREDICATES", 2, 2, false);
        declareFunction("suggest_gafs_for_terms_using_predicate", "SUGGEST-GAFS-FOR-TERMS-USING-PREDICATE", 2, 1, false);
        declareFunction("possible_gaf_predicates_for_terms", "POSSIBLE-GAF-PREDICATES-FOR-TERMS", 1, 2, false);
        declareFunction("new_possible_gaf_predicates_iterator", "NEW-POSSIBLE-GAF-PREDICATES-ITERATOR", 1, 2, false);
        declareFunction("new_suggested_gafs_for_terms_iterator", "NEW-SUGGESTED-GAFS-FOR-TERMS-ITERATOR", 1, 2, false);
        declareFunction("make_suggested_gafs_for_terms_iterator_state", "MAKE-SUGGESTED-GAFS-FOR-TERMS-ITERATOR-STATE", 3, 0, false);
        declareFunction("suggested_gafs_for_terms_iterator_done_p", "SUGGESTED-GAFS-FOR-TERMS-ITERATOR-DONE-P", 1, 0, false);
        declareFunction("suggested_gafs_for_terms_iterator_next", "SUGGESTED-GAFS-FOR-TERMS-ITERATOR-NEXT", 1, 0, false);
        declareFunction("sort_predicates_for_gaf_suggestion", "SORT-PREDICATES-FOR-GAF-SUGGESTION", 1, 0, false);
        declareFunction("predicate_better_for_gaf_suggestionP", "PREDICATE-BETTER-FOR-GAF-SUGGESTION?", 2, 0, false);
        declareFunction("predicate_gaf_suggestion_heuristic", "PREDICATE-GAF-SUGGESTION-HEURISTIC", 1, 0, false);
        declareFunction("predicate_usage_estimate", "PREDICATE-USAGE-ESTIMATE", 1, 0, false);
        declareFunction("clear_predicate_usage_estimate_cached", "CLEAR-PREDICATE-USAGE-ESTIMATE-CACHED", 0, 0, false);
        declareFunction("remove_predicate_usage_estimate_cached", "REMOVE-PREDICATE-USAGE-ESTIMATE-CACHED", 1, 0, false);
        declareFunction("predicate_usage_estimate_cached_internal", "PREDICATE-USAGE-ESTIMATE-CACHED-INTERNAL", 1, 0, false);
        declareFunction("predicate_usage_estimate_cached", "PREDICATE-USAGE-ESTIMATE-CACHED", 1, 0, false);
        declareFunction("keyhash_refill", "KEYHASH-REFILL", 2, 0, false);
        declareFunction("not_keyhash_key_p", "NOT-KEYHASH-KEY-P", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_applicable_relations_file() {
        deflexical("*PREDICATE-USAGE-ESTIMATE-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_applicable_relations_file() {
        memoization_state.note_globally_cached_function(PREDICATE_USAGE_ESTIMATE_CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_applicable_relations_file();
    }

    @Override
    public void initializeVariables() {
        init_applicable_relations_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_applicable_relations_file();
    }

    static {
    }

    static private final SubLList $list_alt16 = cons(makeSymbol("TERM"), makeSymbol("OTHER-TERMS"));

    static private final SubLString $str_alt19$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLList $list_alt23 = list(makeSymbol("CANDIDATE-GAFS"), makeSymbol("CANDIDATE-PREDICATE-ITERATOR"), makeSymbol("TOTAL"), makeSymbol("MAX-NUMBER"), makeSymbol("&REST"), makeSymbol("RESOURCES"));

    static private final SubLList $list_alt24 = list(makeSymbol("CANDIDATE-GAFS"), makeSymbol("CANDIDATE-PREDICATE-ITERATOR"), makeSymbol("TOTAL"), makeSymbol("MAX-NUMBER"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("SBHL-RESOURCE"), makeSymbol("TERMS"), makeSymbol("MT-INFO"));

    public static final SubLSymbol $kw36$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 708 ms
 */
