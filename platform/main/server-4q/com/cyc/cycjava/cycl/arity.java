/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg1;
import static com.cyc.cycjava.cycl.assertions_high.gaf_arg2;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_binary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_quaternary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_quintary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_ternary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.cyc_const_unary_logical_op_p;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_arity;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_p;
import static com.cyc.cycjava.cycl.el_utilities.lambda_function_arity;
import static com.cyc.cycjava.cycl.el_utilities.lambda_function_p;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ARITY
 * source file: /cyc/top/cycl/arity.lisp
 * created:     2019/07/03 17:37:24
 */
public final class arity extends SubLTranslatedFile implements V12 {
    // The me for arity
    @LispMethod(comment = "The me for arity")
    public static final SubLFile me = new arity();


    // deflexical
    // Definitions
    // The equality test used for the KB arity tables.
    /**
     * The equality test used for the KB arity tables.
     */
    @LispMethod(comment = "The equality test used for the KB arity tables.\ndeflexical")
    private static final SubLSymbol $kb_arity_table_equality_test$ = makeSymbol("*KB-ARITY-TABLE-EQUALITY-TEST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $kb_arity_table$ = makeSymbol("*KB-ARITY-TABLE*");

    static private final SubLSymbol $sym3$CYC_VAR_ = makeSymbol("CYC-VAR?");

    static private final SubLList $list5 = list(makeSymbol("RELATION"));

    static private final SubLString $str6$Return_the_arity_for_relation_con = makeString("Return the arity for relation constant RELATION.");

    static private final SubLSymbol $sym7$_X = makeSymbol("?X");

    static private final SubLList $list9 = list(makeSymbol("?X"));

    static private final SubLList $list11 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    static private final SubLString $str12$Initializing_all_arities___ = makeString("Initializing all arities...");

    static private final SubLString $str18$Trying_to_overload_arity_for__A_f = makeString("Trying to overload arity for ~A from ~A to ~A");

    public static final SubLSymbol $kb_arity_min_table$ = makeSymbol("*KB-ARITY-MIN-TABLE*");

    static private final SubLString $str22$Trying_to_overload_arityMin_for__ = makeString("Trying to overload arityMin for ~A from ~A to ~A");

    private static final SubLSymbol MIN_ARITY = makeSymbol("MIN-ARITY");

    private static final SubLSymbol $kb_arity_max_table$ = makeSymbol("*KB-ARITY-MAX-TABLE*");

    private static final SubLString $str26$Trying_to_overload_arityMax_for__ = makeString("Trying to overload arityMax for ~A from ~A to ~A");

    private static final SubLSymbol MAX_ARITY = makeSymbol("MAX-ARITY");

    private static final SubLSymbol RELATION_P = makeSymbol("RELATION-P");

    private static final SubLSymbol $sym29$ARITY_ADMITS_ = makeSymbol("ARITY-ADMITS?");

    private static final SubLList $list36 = list(list(list(reader_make_constant_shell("commutativeInArgs"), TWO_INTEGER), NIL), list(list(reader_make_constant_shell("commutativeInArgs"), THREE_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), FOUR_INTEGER), T),
	    list(list(reader_make_constant_shell("commutativeInArgs"), FIVE_INTEGER), T));

    private static final SubLSymbol $sym37$ARITY_ADMITS__ = makeSymbol("ARITY-ADMITS>=");

    private static final SubLList $list38 = list(list(list(reader_make_constant_shell("commutativeInArgs"), makeInteger(212)), T));

    private static final SubLSymbol $sym39$ARITY_ADMITS_ = makeSymbol("ARITY-ADMITS>");

    private static final SubLList $list40 = list(list(list(reader_make_constant_shell("commutativeInArgs"), ONE_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), SEVEN_INTEGER), T));

    private static final SubLSymbol $sym41$ARITY_ADMITS__ = makeSymbol("ARITY-ADMITS<=");

    private static final SubLList $list42 = list(list(list(reader_make_constant_shell("commutativeInArgs"), THREE_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), FOUR_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), TWO_INTEGER), NIL));

    private static final SubLSymbol $sym43$ARITY_ADMITS_ = makeSymbol("ARITY-ADMITS<");

    private static final SubLList $list44 = list(list(list(reader_make_constant_shell("commutativeInArgs"), SEVEN_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), ONE_INTEGER), NIL), list(list(reader_make_constant_shell("commutativeInArgs"), FOUR_INTEGER), T),
	    list(list(reader_make_constant_shell("commutativeInArgs"), THREE_INTEGER), NIL));

    private static final SubLSymbol RELATION_ARITY_CONSTRAINT_SENTENCES = makeSymbol("RELATION-ARITY-CONSTRAINT-SENTENCES");

    static private final SubLList $list47 = list(list(list(reader_make_constant_shell("isa")), list(list(reader_make_constant_shell("arity"), reader_make_constant_shell("isa"), TWO_INTEGER))),
	    list(list(reader_make_constant_shell("different")), list(list(reader_make_constant_shell("arityMin"), reader_make_constant_shell("different"), TWO_INTEGER))),
	    list(list(reader_make_constant_shell("Percent")), list(list(reader_make_constant_shell("arityMin"), reader_make_constant_shell("Percent"), ONE_INTEGER), list(reader_make_constant_shell("arityMax"), reader_make_constant_shell("Percent"), TWO_INTEGER))));

    public static final SubLObject initialize_arity_table_alt() {
	$kb_arity_table$.setGlobalValue(make_hash_table(cardinality_estimates.instance_cardinality($$Relation), $kb_arity_table_equality_test$.getGlobalValue(), UNPROVIDED));
	return $kb_arity_table$.getGlobalValue();
    }

    public static SubLObject initialize_arity_table() {
	arity.$kb_arity_table$.setGlobalValue(make_hash_table(cardinality_estimates.instance_cardinality(arity.$$Relation), arity.$kb_arity_table_equality_test$.getGlobalValue(), UNPROVIDED));
	return arity.$kb_arity_table$.getGlobalValue();
    }

    public static final SubLObject arity_lookup_alt(SubLObject relation) {
	SubLTrampolineFile.checkType(relation, FORT_P);
	return gethash_without_values(relation, $kb_arity_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject arity_lookup(final SubLObject relation) {
	assert NIL != forts.fort_p(relation) : "! forts.fort_p(relation) " + ("forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) ") + relation;
	return gethash_without_values(relation, arity.$kb_arity_table$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject set_arity_alt(SubLObject relation, SubLObject v_arity) {
	SubLTrampolineFile.checkType(relation, FORT_P);
	return sethash(relation, $kb_arity_table$.getGlobalValue(), v_arity);
    }

    public static SubLObject set_arity(final SubLObject relation, final SubLObject v_arity) {
	assert NIL != forts.fort_p(relation) : "! forts.fort_p(relation) " + ("forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) ") + relation;
	return sethash(relation, arity.$kb_arity_table$.getGlobalValue(), v_arity);
    }

    public static final SubLObject rem_arity_alt(SubLObject relation) {
	remhash(relation, $kb_arity_table$.getGlobalValue());
	return relation;
    }

    public static SubLObject rem_arity(final SubLObject relation) {
	remhash(relation, arity.$kb_arity_table$.getGlobalValue());
	return relation;
    }

    /**
     * Return the arity for relation constant RELATION.
     */
    @LispMethod(comment = "Return the arity for relation constant RELATION.")
    public static final SubLObject arity_alt(SubLObject relation) {
	if (NIL != fort_p(relation)) {
	    return com.cyc.cycjava.cycl.arity.arity_lookup(relation);
	} else {
	    if (NIL != obsolete.reifiable_natP(relation, symbol_function($sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue())) {
		return com.cyc.cycjava.cycl.arity.arity(narts_high.find_nart(relation));
	    } else {
		if (NIL != kappa_predicate_p(relation)) {
		    return kappa_predicate_arity(relation);
		} else {
		    if (NIL != lambda_function_p(relation)) {
			return lambda_function_arity(relation);
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     * Return the arity for relation constant RELATION.
     */
    @LispMethod(comment = "Return the arity for relation constant RELATION.")
    public static SubLObject arity(final SubLObject relation) {
	if (NIL != forts.fort_p(relation)) {
	    return arity.arity_lookup(relation);
	}
	if (NIL != obsolete.reifiable_natP(relation, symbol_function(arity.$sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue())) {
	    return arity.arity(narts_high.find_nart(relation));
	}
	if (NIL != kappa_predicate_p(relation)) {
	    return kappa_predicate_arity(relation);
	}
	if (NIL != lambda_function_p(relation)) {
	    return lambda_function_arity(relation);
	}
	return NIL;
    }

    public static SubLObject arity_robust(final SubLObject relation) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	final SubLObject first_val = arity.arity(relation);
	final SubLObject second_val = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if ((NIL == first_val) && (NIL != narts_high.naut_p(relation))) {
	    final SubLObject query_results = ask_utilities.query_template(arity.$sym7$_X, listS(arity.$$arity, relation, arity.$list9), arity.$$InferencePSC, arity.$list11);
	    return values(query_results.first(), list_utilities.sublisp_boolean(query_results));
	}
	return values(first_val, second_val);
    }

    public static final SubLObject initialize_all_arities_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
		try {
		    $noting_progress_start_time$.bind(get_universal_time(), thread);
		    noting_progress_preamble($str_alt12$Initializing_all_arities___);
		    com.cyc.cycjava.cycl.arity.initialize_arities();
		    com.cyc.cycjava.cycl.arity.initialize_min_arities();
		    com.cyc.cycjava.cycl.arity.initialize_max_arities();
		    noting_progress_postamble();
		} finally {
		    $noting_progress_start_time$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject initialize_all_arities() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject str = arity.$str12$Initializing_all_arities___;
	final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
	try {
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
	    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
	    $progress_notification_count$.bind(ZERO_INTEGER, thread);
	    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
	    $progress_count$.bind(ZERO_INTEGER, thread);
	    $is_noting_progressP$.bind(T, thread);
	    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
	    noting_progress_preamble(str);
	    arity.initialize_arities();
	    arity.initialize_min_arities();
	    arity.initialize_max_arities();
	    noting_progress_postamble();
	} finally {
	    $silent_progressP$.rebind(_prev_bind_8, thread);
	    $is_noting_progressP$.rebind(_prev_bind_7, thread);
	    $progress_count$.rebind(_prev_bind_6, thread);
	    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
	    $progress_notification_count$.rebind(_prev_bind_4, thread);
	    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
	    $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
	    $progress_start_time$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject initialize_arities_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $kb_arity_table$.getGlobalValue()) {
		clrhash($kb_arity_table$.getGlobalValue());
	    } else {
		com.cyc.cycjava.cycl.arity.initialize_arity_table();
	    }
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
		    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
		    {
			SubLObject pred_var = $$arity;
			if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
			    {
				SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
								SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
								SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
								if (NIL != valid_3) {
								    com.cyc.cycjava.cycl.arity.initialize_arity_from_assertion(assertion);
								}
								done_var_1 = makeBoolean(NIL == valid_3);
							    }
							}
						    }
						} finally {
						    {
							SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
							    $is_thread_performing_cleanupP$.bind(T, thread);
							    if (NIL != final_index_iterator) {
								kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
							    }
							} finally {
							    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
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
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return hash_table_count($kb_arity_table$.getGlobalValue());
	}
    }

    public static SubLObject initialize_arities() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != arity.$kb_arity_table$.getGlobalValue()) {
	    clrhash(arity.$kb_arity_table$.getGlobalValue());
	} else {
	    arity.initialize_arity_table();
	}
	final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
	try {
	    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
	    mt_relevance_macros.$mt$.bind(arity.$$EverythingPSC, thread);
	    final SubLObject pred_var = arity.$$arity;
	    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
		final SubLObject pred_var_$1 = arity.$$arity;
		if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var_$1)) {
		    final SubLObject str = NIL;
		    final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
		    final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
		    final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
		    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
		    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
		    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
		    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
		    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
		    try {
			$progress_start_time$.bind(get_universal_time(), thread);
			$progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
			$progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			$progress_notification_count$.bind(ZERO_INTEGER, thread);
			$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
			$progress_count$.bind(ZERO_INTEGER, thread);
			$is_noting_progressP$.bind(T, thread);
			$silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
			noting_progress_preamble(str);
			final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var_$1);
			SubLObject done_var = NIL;
			final SubLObject token_var = NIL;
			while (NIL == done_var) {
			    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
			    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
			    if (NIL != valid) {
				note_progress();
				SubLObject final_index_iterator = NIL;
				try {
				    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
				    SubLObject done_var_$4 = NIL;
				    final SubLObject token_var_$5 = NIL;
				    while (NIL == done_var_$4) {
					final SubLObject assertion_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
					final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion_var));
					if (NIL != valid_$6) {
					    final SubLObject formula = assertions_high.gaf_formula(assertion_var);
					    arity.initialize_arity_from_formula(formula);
					}
					done_var_$4 = makeBoolean(NIL == valid_$6);
				    }
				} finally {
				    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
				    try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					if (NIL != final_index_iterator) {
					    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
					}
					restoreValuesFromVector(_values);
				    } finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
				    }
				}
			    }
			    done_var = makeBoolean(NIL == valid);
			}
			noting_progress_postamble();
		    } finally {
			$silent_progressP$.rebind(_prev_bind_8, thread);
			$is_noting_progressP$.rebind(_prev_bind_7, thread);
			$progress_count$.rebind(_prev_bind_6, thread);
			$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
			$progress_notification_count$.rebind(_prev_bind_4, thread);
			$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
			$progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
			$progress_start_time$.rebind(_prev_bind_0_$2, thread);
		    }
		}
	    }
	} finally {
	    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
	}
	return hash_table_count(arity.$kb_arity_table$.getGlobalValue());
    }

    public static SubLObject initialize_arity_from_formula(final SubLObject formula) {
	final SubLObject relation = cycl_utilities.formula_arg1(formula, UNPROVIDED);
	if (NIL != forts.fort_p(relation)) {
	    final SubLObject v_arity = cycl_utilities.formula_arg2(formula, UNPROVIDED);
	    return arity.initialize_arity_for_relation_guts(relation, v_arity);
	}
	return NIL;
    }

    public static final SubLObject initialize_arity_from_assertion_alt(SubLObject assertion) {
	{
	    SubLObject relation = gaf_arg1(assertion);
	    if (NIL != fort_p(relation)) {
		{
		    SubLObject v_arity = gaf_arg2(assertion);
		    return com.cyc.cycjava.cycl.arity.initialize_arity_for_relation_guts(relation, v_arity);
		}
	    }
	}
	return NIL;
    }

    public static SubLObject initialize_arity_from_assertion(final SubLObject assertion) {
	return arity.initialize_arity_from_formula(assertions_high.gaf_formula(assertion));
    }

    public static final SubLObject initialize_arity_for_relation_alt(SubLObject relation) {
	{
	    SubLObject v_arity = kb_mapping_utilities.fpred_value_in_any_mt(relation, $$arity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL == v_arity) {
		return NIL;
	    }
	    return com.cyc.cycjava.cycl.arity.initialize_arity_for_relation_guts(relation, v_arity);
	}
    }

    public static SubLObject initialize_arity_for_relation(final SubLObject relation) {
	final SubLObject v_arity = kb_mapping_utilities.fpred_value_in_any_mt(relation, arity.$$arity, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if (NIL == v_arity) {
	    return NIL;
	}
	return arity.initialize_arity_for_relation_guts(relation, v_arity);
    }

    public static final SubLObject initialize_arity_for_relation_guts_alt(SubLObject relation, SubLObject v_arity) {
	v_arity = com.cyc.cycjava.cycl.arity.possibly_simplify_arity(v_arity);
	SubLTrampolineFile.checkType(v_arity, INTEGERP);
	com.cyc.cycjava.cycl.arity.set_arity(relation, v_arity);
	return v_arity;
    }

    public static SubLObject initialize_arity_for_relation_guts(final SubLObject relation, SubLObject v_arity) {
	v_arity = arity.possibly_simplify_arity(v_arity);
	assert NIL != integerp(v_arity) : "! integerp(v_arity) " + ("Types.integerp(v_arity) " + "CommonSymbols.NIL != Types.integerp(v_arity) ") + v_arity;
	arity.set_arity(relation, v_arity);
	return v_arity;
    }

    public static final SubLObject possibly_simplify_arity_alt(SubLObject v_arity) {
	if ((!v_arity.isInteger()) && (NIL != kb_control_vars.quant_kb_loaded_p())) {
	    v_arity = quantities.cycl_real_number_to_number(v_arity);
	}
	return v_arity;
    }

    public static SubLObject possibly_simplify_arity(SubLObject v_arity) {
	if ((!v_arity.isInteger()) && (NIL != kb_control_vars.quant_kb_loaded_p())) {
	    v_arity = quantities.cycl_real_number_to_number(v_arity);
	}
	return v_arity;
    }

    public static final SubLObject maybe_add_arity_for_relation_alt(SubLObject relation, SubLObject v_arity) {
	v_arity = com.cyc.cycjava.cycl.arity.possibly_simplify_arity(v_arity);
	SubLTrampolineFile.checkType(v_arity, INTEGERP);
	{
	    SubLObject arity_in_table = com.cyc.cycjava.cycl.arity.arity(relation);
	    if (NIL != arity_in_table) {
		if (!arity_in_table.eql(v_arity)) {
		    Errors.error($str_alt18$Trying_to_overload_arity_for__A_f, relation, arity_in_table, v_arity);
		}
	    }
	    com.cyc.cycjava.cycl.arity.set_arity(relation, v_arity);
	}
	return v_arity;
    }

    public static SubLObject maybe_add_arity_for_relation(final SubLObject relation, SubLObject v_arity) {
	v_arity = arity.possibly_simplify_arity(v_arity);
	assert NIL != integerp(v_arity) : "! integerp(v_arity) " + ("Types.integerp(v_arity) " + "CommonSymbols.NIL != Types.integerp(v_arity) ") + v_arity;
	final SubLObject arity_in_table = arity.arity(relation);
	if ((NIL != arity_in_table) && (!arity_in_table.eql(v_arity))) {
	    Errors.error(arity.$str18$Trying_to_overload_arity_for__A_f, relation, arity_in_table, v_arity);
	}
	arity.set_arity(relation, v_arity);
	return v_arity;
    }

    public static final SubLObject maybe_remove_arity_for_relation_alt(SubLObject relation, SubLObject v_arity) {
	{
	    SubLObject dont_remove = NIL;
	    SubLObject other_arity = NIL;
	    SubLObject pred_var = $$arity;
	    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
		{
		    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
		    SubLObject done_var = dont_remove;
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
					    SubLObject done_var_5 = dont_remove;
					    SubLObject token_var_6 = NIL;
					    while (NIL == done_var_5) {
						{
						    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
						    SubLObject valid_7 = makeBoolean(token_var_6 != assertion);
						    if (NIL != valid_7) {
							{
							    SubLObject asserted_arity = gaf_arg2(assertion);
							    if (v_arity.numE(asserted_arity)) {
								dont_remove = kb_accessors.assertion_still_thereP(assertion, $TRUE);
							    } else {
								other_arity = asserted_arity;
							    }
							}
						    }
						    done_var_5 = makeBoolean((NIL == valid_7) || (NIL != dont_remove));
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
			    done_var = makeBoolean((NIL == valid) || (NIL != dont_remove));
			}
		    }
		}
	    }
	    if (NIL == dont_remove) {
		com.cyc.cycjava.cycl.arity.rem_arity(relation);
	    }
	    if (NIL != other_arity) {
		com.cyc.cycjava.cycl.arity.set_arity(relation, other_arity);
	    }
	}
	return relation;
    }

    public static SubLObject maybe_remove_arity_for_relation(final SubLObject relation, final SubLObject v_arity) {
	SubLObject dont_remove = NIL;
	SubLObject other_arity = NIL;
	final SubLObject pred_var = arity.$$arity;
	if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
	    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
	    SubLObject done_var = dont_remove;
	    final SubLObject token_var = NIL;
	    while (NIL == done_var) {
		final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
		final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
		if (NIL != valid) {
		    SubLObject final_index_iterator = NIL;
		    try {
			final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
			SubLObject done_var_$8 = dont_remove;
			final SubLObject token_var_$9 = NIL;
			while (NIL == done_var_$8) {
			    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
			    final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(assertion));
			    if (NIL != valid_$10) {
				final SubLObject asserted_arity = assertions_high.gaf_arg2(assertion);
				if (v_arity.numE(asserted_arity)) {
				    dont_remove = kb_accessors.assertion_still_thereP(assertion, $TRUE);
				} else {
				    other_arity = asserted_arity;
				}
			    }
			    done_var_$8 = makeBoolean((NIL == valid_$10) || (NIL != dont_remove));
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
		done_var = makeBoolean((NIL == valid) || (NIL != dont_remove));
	    }
	}
	if (NIL == dont_remove) {
	    arity.rem_arity(relation);
	}
	if (NIL != other_arity) {
	    arity.set_arity(relation, other_arity);
	}
	return relation;
    }

    public static final SubLObject initialize_arity_min_table_alt() {
	$kb_arity_min_table$.setGlobalValue(make_hash_table(cardinality_estimates.instance_cardinality($$VariableArityRelation), $kb_arity_table_equality_test$.getGlobalValue(), UNPROVIDED));
	return $kb_arity_min_table$.getGlobalValue();
    }

    public static SubLObject initialize_arity_min_table() {
	arity.$kb_arity_min_table$.setGlobalValue(make_hash_table(cardinality_estimates.instance_cardinality(arity.$$VariableArityRelation), arity.$kb_arity_table_equality_test$.getGlobalValue(), UNPROVIDED));
	return arity.$kb_arity_min_table$.getGlobalValue();
    }

    public static final SubLObject arity_min_lookup_alt(SubLObject relation) {
	SubLTrampolineFile.checkType(relation, FORT_P);
	return gethash_without_values(relation, $kb_arity_min_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject arity_min_lookup(final SubLObject relation) {
	assert NIL != forts.fort_p(relation) : "! forts.fort_p " + relation;
	return gethash_without_values(relation, arity.$kb_arity_min_table$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject set_arity_min_alt(SubLObject relation, SubLObject arity_min) {
	SubLTrampolineFile.checkType(relation, FORT_P);
	return sethash(relation, $kb_arity_min_table$.getGlobalValue(), arity_min);
    }

    public static SubLObject set_arity_min(final SubLObject relation, final SubLObject arity_min) {
	assert NIL != forts.fort_p(relation) : "! forts.fort_p(relation) " + ("forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) ") + relation;
	return sethash(relation, arity.$kb_arity_min_table$.getGlobalValue(), arity_min);
    }

    public static final SubLObject rem_arity_min_alt(SubLObject relation) {
	remhash(relation, $kb_arity_min_table$.getGlobalValue());
	return relation;
    }

    public static SubLObject rem_arity_min(final SubLObject relation) {
	remhash(relation, arity.$kb_arity_min_table$.getGlobalValue());
	return relation;
    }

    /**
     * Return the arity-min for RELATION.
     */
    @LispMethod(comment = "Return the arity-min for RELATION.")
    public static final SubLObject arity_min_alt(SubLObject relation) {
	{
	    SubLObject arity_min = com.cyc.cycjava.cycl.arity.arity_min_int(relation);
	    return NIL != arity_min ? ((SubLObject) (arity_min)) : ZERO_INTEGER;
	}
    }

    /**
     * Return the arity-min for RELATION.
     */
    @LispMethod(comment = "Return the arity-min for RELATION.")
    public static SubLObject arity_min(final SubLObject relation) {
	final SubLObject arity_min = arity.arity_min_int(relation);
	return NIL != arity_min ? arity_min : ZERO_INTEGER;
    }

    public static final SubLObject arity_min_int_alt(SubLObject relation) {
	if (NIL != fort_p(relation)) {
	    {
		SubLObject arity_min_in_table = com.cyc.cycjava.cycl.arity.arity_min_lookup(relation);
		if (NIL != arity_min_in_table) {
		    return arity_min_in_table;
		} else {
		    return com.cyc.cycjava.cycl.arity.initialize_arity_min_for_relation(relation);
		}
	    }
	} else {
	    if (NIL != obsolete.reifiable_natP(relation, symbol_function($sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue())) {
		return com.cyc.cycjava.cycl.arity.arity_min(narts_high.find_nart(relation));
	    }
	}
	return NIL;
    }

    public static SubLObject arity_min_int(final SubLObject relation) {
	if (NIL != forts.fort_p(relation)) {
	    final SubLObject arity_min_in_table = arity.arity_min_lookup(relation);
	    if (NIL != arity_min_in_table) {
		return arity_min_in_table;
	    }
	    return arity.initialize_arity_min_for_relation(relation);
	} else {
	    if (NIL != obsolete.reifiable_natP(relation, symbol_function(arity.$sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue())) {
		return arity.arity_min(narts_high.find_nart(relation));
	    }
	    return NIL;
	}
    }

    public static final SubLObject initialize_min_arities_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $kb_arity_min_table$.getGlobalValue()) {
		clrhash($kb_arity_min_table$.getGlobalValue());
	    } else {
		com.cyc.cycjava.cycl.arity.initialize_arity_min_table();
	    }
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
		    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
		    {
			SubLObject pred_var = $$arityMin;
			if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
			    {
				SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
							SubLObject done_var_8 = NIL;
							SubLObject token_var_9 = NIL;
							while (NIL == done_var_8) {
							    {
								SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_9);
								SubLObject valid_10 = makeBoolean(token_var_9 != assertion);
								if (NIL != valid_10) {
								    com.cyc.cycjava.cycl.arity.initialize_arity_min_from_assertion(assertion);
								}
								done_var_8 = makeBoolean(NIL == valid_10);
							    }
							}
						    }
						} finally {
						    {
							SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
							    $is_thread_performing_cleanupP$.bind(T, thread);
							    if (NIL != final_index_iterator) {
								kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
							    }
							} finally {
							    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
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
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return hash_table_count($kb_arity_min_table$.getGlobalValue());
	}
    }

    public static SubLObject initialize_min_arities() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != arity.$kb_arity_min_table$.getGlobalValue()) {
	    clrhash(arity.$kb_arity_min_table$.getGlobalValue());
	} else {
	    arity.initialize_arity_min_table();
	}
	final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
	try {
	    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
	    mt_relevance_macros.$mt$.bind(arity.$$EverythingPSC, thread);
	    final SubLObject pred_var = arity.$$arityMin;
	    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
		final SubLObject pred_var_$11 = arity.$$arityMin;
		if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var_$11)) {
		    final SubLObject str = NIL;
		    final SubLObject _prev_bind_0_$12 = $progress_start_time$.currentBinding(thread);
		    final SubLObject _prev_bind_1_$13 = $progress_last_pacification_time$.currentBinding(thread);
		    final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
		    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
		    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
		    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
		    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
		    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
		    try {
			$progress_start_time$.bind(get_universal_time(), thread);
			$progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
			$progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			$progress_notification_count$.bind(ZERO_INTEGER, thread);
			$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
			$progress_count$.bind(ZERO_INTEGER, thread);
			$is_noting_progressP$.bind(T, thread);
			$silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
			noting_progress_preamble(str);
			final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var_$11);
			SubLObject done_var = NIL;
			final SubLObject token_var = NIL;
			while (NIL == done_var) {
			    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
			    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
			    if (NIL != valid) {
				note_progress();
				SubLObject final_index_iterator = NIL;
				try {
				    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
				    SubLObject done_var_$14 = NIL;
				    final SubLObject token_var_$15 = NIL;
				    while (NIL == done_var_$14) {
					final SubLObject assertion_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$15);
					final SubLObject valid_$16 = makeBoolean(!token_var_$15.eql(assertion_var));
					if (NIL != valid_$16) {
					    final SubLObject formula = assertions_high.gaf_formula(assertion_var);
					    arity.initialize_arity_min_from_formula(formula);
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
			noting_progress_postamble();
		    } finally {
			$silent_progressP$.rebind(_prev_bind_8, thread);
			$is_noting_progressP$.rebind(_prev_bind_7, thread);
			$progress_count$.rebind(_prev_bind_6, thread);
			$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
			$progress_notification_count$.rebind(_prev_bind_4, thread);
			$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
			$progress_last_pacification_time$.rebind(_prev_bind_1_$13, thread);
			$progress_start_time$.rebind(_prev_bind_0_$12, thread);
		    }
		}
	    }
	} finally {
	    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
	}
	return hash_table_count(arity.$kb_arity_min_table$.getGlobalValue());
    }

    public static SubLObject initialize_arity_min_from_formula(final SubLObject formula) {
	final SubLObject relation = cycl_utilities.formula_arg1(formula, UNPROVIDED);
	if (NIL != forts.fort_p(relation)) {
	    final SubLObject arity_min = cycl_utilities.formula_arg2(formula, UNPROVIDED);
	    return arity.initialize_arity_min_for_relation_guts(relation, arity_min);
	}
	return NIL;
    }

    public static final SubLObject initialize_arity_min_from_assertion_alt(SubLObject assertion) {
	{
	    SubLObject relation = gaf_arg1(assertion);
	    if (NIL != fort_p(relation)) {
		{
		    SubLObject arity_min = gaf_arg2(assertion);
		    return com.cyc.cycjava.cycl.arity.initialize_arity_min_for_relation_guts(relation, arity_min);
		}
	    }
	}
	return NIL;
    }

    public static SubLObject initialize_arity_min_from_assertion(final SubLObject assertion) {
	return arity.initialize_arity_min_from_formula(assertions_high.gaf_formula(assertion));
    }

    public static final SubLObject initialize_arity_min_for_relation_alt(SubLObject relation) {
	{
	    SubLObject arity_min = kb_mapping_utilities.fpred_value_in_any_mt(relation, $$arityMin, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL == arity_min) {
		return NIL;
	    }
	    return com.cyc.cycjava.cycl.arity.initialize_arity_min_for_relation_guts(relation, arity_min);
	}
    }

    public static SubLObject initialize_arity_min_for_relation(final SubLObject relation) {
	final SubLObject arity_min = kb_mapping_utilities.fpred_value_in_any_mt(relation, arity.$$arityMin, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if (NIL == arity_min) {
	    return NIL;
	}
	return arity.initialize_arity_min_for_relation_guts(relation, arity_min);
    }

    public static final SubLObject initialize_arity_min_for_relation_guts_alt(SubLObject relation, SubLObject arity_min) {
	arity_min = com.cyc.cycjava.cycl.arity.possibly_simplify_arity(arity_min);
	SubLTrampolineFile.checkType(arity_min, INTEGERP);
	com.cyc.cycjava.cycl.arity.set_arity_min(relation, arity_min);
	return arity_min;
    }

    public static SubLObject initialize_arity_min_for_relation_guts(final SubLObject relation, SubLObject arity_min) {
	arity_min = arity.possibly_simplify_arity(arity_min);
	assert NIL != integerp(arity_min) : "! integerp(arity_min) " + ("Types.integerp(arity_min) " + "CommonSymbols.NIL != Types.integerp(arity_min) ") + arity_min;
	arity.set_arity_min(relation, arity_min);
	return arity_min;
    }

    public static final SubLObject maybe_add_arity_min_for_relation_alt(SubLObject relation, SubLObject arity_min) {
	arity_min = com.cyc.cycjava.cycl.arity.possibly_simplify_arity(arity_min);
	SubLTrampolineFile.checkType(arity_min, INTEGERP);
	{
	    SubLObject arity_min_in_table = com.cyc.cycjava.cycl.arity.arity_min(relation);
	    if (NIL != arity_min_in_table) {
		if (!arity_min_in_table.eql(arity_min)) {
		    Errors.error($str_alt22$Trying_to_overload_arityMin_for__, relation, arity_min_in_table, arity_min);
		}
	    }
	    com.cyc.cycjava.cycl.arity.set_arity_min(relation, arity_min);
	}
	return arity_min;
    }

    public static SubLObject maybe_add_arity_min_for_relation(final SubLObject relation, SubLObject arity_min) {
	arity_min = arity.possibly_simplify_arity(arity_min);
	assert NIL != integerp(arity_min) : "! integerp(arity_min) " + ("Types.integerp(arity_min) " + "CommonSymbols.NIL != Types.integerp(arity_min) ") + arity_min;
	final SubLObject arity_min_in_table = arity.arity_min(relation);
	if ((NIL != arity_min_in_table) && (!arity_min_in_table.eql(arity_min))) {
	    Errors.error(arity.$str22$Trying_to_overload_arityMin_for__, relation, arity_min_in_table, arity_min);
	}
	arity.set_arity_min(relation, arity_min);
	return arity_min;
    }

    public static final SubLObject maybe_remove_arity_min_for_relation_alt(SubLObject relation) {
	{
	    SubLObject dont_remove = NIL;
	    SubLObject pred_var = $$arityMin;
	    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
		{
		    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
		    SubLObject done_var = dont_remove;
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
					    SubLObject done_var_12 = dont_remove;
					    SubLObject token_var_13 = NIL;
					    while (NIL == done_var_12) {
						{
						    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_13);
						    SubLObject valid_14 = makeBoolean(token_var_13 != assertion);
						    if (NIL != valid_14) {
							dont_remove = kb_accessors.assertion_still_thereP(assertion, $TRUE);
						    }
						    done_var_12 = makeBoolean((NIL == valid_14) || (NIL != dont_remove));
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
			    done_var = makeBoolean((NIL == valid) || (NIL != dont_remove));
			}
		    }
		}
	    }
	    if (NIL == dont_remove) {
		com.cyc.cycjava.cycl.arity.rem_arity_min(relation);
	    }
	}
	return relation;
    }

    public static SubLObject maybe_remove_arity_min_for_relation(final SubLObject relation) {
	SubLObject dont_remove = NIL;
	final SubLObject pred_var = arity.$$arityMin;
	if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
	    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
	    SubLObject done_var = dont_remove;
	    final SubLObject token_var = NIL;
	    while (NIL == done_var) {
		final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
		final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
		if (NIL != valid) {
		    SubLObject final_index_iterator = NIL;
		    try {
			final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
			SubLObject done_var_$18 = dont_remove;
			final SubLObject token_var_$19 = NIL;
			while (NIL == done_var_$18) {
			    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
			    final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(assertion));
			    if (NIL != valid_$20) {
				dont_remove = kb_accessors.assertion_still_thereP(assertion, $TRUE);
			    }
			    done_var_$18 = makeBoolean((NIL == valid_$20) || (NIL != dont_remove));
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
		done_var = makeBoolean((NIL == valid) || (NIL != dont_remove));
	    }
	}
	if (NIL == dont_remove) {
	    arity.rem_arity_min(relation);
	}
	return relation;
    }

    public static final SubLObject min_arity_alt(SubLObject relation) {
	{
	    SubLObject v_arity = com.cyc.cycjava.cycl.arity.arity(relation);
	    if (NIL != v_arity) {
		return v_arity;
	    } else {
		return com.cyc.cycjava.cycl.arity.arity_min(relation);
	    }
	}
    }

    public static SubLObject min_arity(final SubLObject relation) {
	final SubLObject v_arity = arity.arity(relation);
	if (NIL != v_arity) {
	    return v_arity;
	}
	return arity.arity_min(relation);
    }

    public static final SubLObject initialize_arity_max_table_alt() {
	$kb_arity_max_table$.setGlobalValue(make_hash_table(cardinality_estimates.instance_cardinality($$VariableArityRelation), $kb_arity_table_equality_test$.getGlobalValue(), UNPROVIDED));
	return $kb_arity_max_table$.getGlobalValue();
    }

    public static SubLObject initialize_arity_max_table() {
	arity.$kb_arity_max_table$.setGlobalValue(make_hash_table(cardinality_estimates.instance_cardinality(arity.$$VariableArityRelation), arity.$kb_arity_table_equality_test$.getGlobalValue(), UNPROVIDED));
	return arity.$kb_arity_max_table$.getGlobalValue();
    }

    public static final SubLObject arity_max_lookup_alt(SubLObject relation) {
	SubLTrampolineFile.checkType(relation, FORT_P);
	return gethash_without_values(relation, $kb_arity_max_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject arity_max_lookup(final SubLObject relation) {
	assert NIL != forts.fort_p(relation) : "! forts.fort_p(relation) " + ("forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) ") + relation;
	return gethash_without_values(relation, arity.$kb_arity_max_table$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject set_arity_max_alt(SubLObject relation, SubLObject arity_max) {
	SubLTrampolineFile.checkType(relation, FORT_P);
	return sethash(relation, $kb_arity_max_table$.getGlobalValue(), arity_max);
    }

    public static SubLObject set_arity_max(final SubLObject relation, final SubLObject arity_max) {
	assert NIL != forts.fort_p(relation) : "! forts.fort_p(relation) " + ("forts.fort_p(relation) " + "CommonSymbols.NIL != forts.fort_p(relation) ") + relation;
	return sethash(relation, arity.$kb_arity_max_table$.getGlobalValue(), arity_max);
    }

    public static final SubLObject rem_arity_max_alt(SubLObject relation) {
	remhash(relation, $kb_arity_max_table$.getGlobalValue());
	return relation;
    }

    public static SubLObject rem_arity_max(final SubLObject relation) {
	remhash(relation, arity.$kb_arity_max_table$.getGlobalValue());
	return relation;
    }

    /**
     * Return the arityMax for RELATION.
     */
    @LispMethod(comment = "Return the arityMax for RELATION.")
    public static final SubLObject arity_max_alt(SubLObject relation) {
	if (NIL != fort_p(relation)) {
	    {
		SubLObject arity_max_in_table = com.cyc.cycjava.cycl.arity.arity_max_lookup(relation);
		if (NIL != arity_max_in_table) {
		    return arity_max_in_table;
		} else {
		    return com.cyc.cycjava.cycl.arity.initialize_arity_max_for_relation(relation);
		}
	    }
	} else {
	    if (NIL != obsolete.reifiable_natP(relation, symbol_function($sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue())) {
		return com.cyc.cycjava.cycl.arity.arity_max(narts_high.find_nart(relation));
	    }
	}
	return NIL;
    }

    /**
     * Return the arityMax for RELATION.
     */
    @LispMethod(comment = "Return the arityMax for RELATION.")
    public static SubLObject arity_max(final SubLObject relation) {
	if (NIL != forts.fort_p(relation)) {
	    final SubLObject arity_max_in_table = arity.arity_max_lookup(relation);
	    if (NIL != arity_max_in_table) {
		return arity_max_in_table;
	    }
	    return arity.initialize_arity_max_for_relation(relation);
	} else {
	    if (NIL != obsolete.reifiable_natP(relation, symbol_function(arity.$sym3$CYC_VAR_), mt_vars.$anect_mt$.getGlobalValue())) {
		return arity.arity_max(narts_high.find_nart(relation));
	    }
	    return NIL;
	}
    }

    public static final SubLObject initialize_max_arities_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $kb_arity_max_table$.getGlobalValue()) {
		clrhash($kb_arity_max_table$.getGlobalValue());
	    } else {
		com.cyc.cycjava.cycl.arity.initialize_arity_max_table();
	    }
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
		    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
		    {
			SubLObject pred_var = $$arityMax;
			if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
			    {
				SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
							SubLObject done_var_15 = NIL;
							SubLObject token_var_16 = NIL;
							while (NIL == done_var_15) {
							    {
								SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_16);
								SubLObject valid_17 = makeBoolean(token_var_16 != assertion);
								if (NIL != valid_17) {
								    com.cyc.cycjava.cycl.arity.initialize_arity_max_from_assertion(assertion);
								}
								done_var_15 = makeBoolean(NIL == valid_17);
							    }
							}
						    }
						} finally {
						    {
							SubLObject _prev_bind_0_18 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
							    $is_thread_performing_cleanupP$.bind(T, thread);
							    if (NIL != final_index_iterator) {
								kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
							    }
							} finally {
							    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_18, thread);
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
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return hash_table_count($kb_arity_max_table$.getGlobalValue());
	}
    }

    public static SubLObject initialize_max_arities() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != arity.$kb_arity_max_table$.getGlobalValue()) {
	    clrhash(arity.$kb_arity_max_table$.getGlobalValue());
	} else {
	    arity.initialize_arity_max_table();
	}
	final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
	final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
	try {
	    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
	    mt_relevance_macros.$mt$.bind(arity.$$EverythingPSC, thread);
	    final SubLObject pred_var = arity.$$arityMax;
	    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
		final SubLObject pred_var_$21 = arity.$$arityMax;
		if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var_$21)) {
		    final SubLObject str = NIL;
		    final SubLObject _prev_bind_0_$22 = $progress_start_time$.currentBinding(thread);
		    final SubLObject _prev_bind_1_$23 = $progress_last_pacification_time$.currentBinding(thread);
		    final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
		    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
		    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
		    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
		    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
		    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
		    try {
			$progress_start_time$.bind(get_universal_time(), thread);
			$progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
			$progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
			$progress_notification_count$.bind(ZERO_INTEGER, thread);
			$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
			$progress_count$.bind(ZERO_INTEGER, thread);
			$is_noting_progressP$.bind(T, thread);
			$silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
			noting_progress_preamble(str);
			final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var_$21);
			SubLObject done_var = NIL;
			final SubLObject token_var = NIL;
			while (NIL == done_var) {
			    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
			    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
			    if (NIL != valid) {
				note_progress();
				SubLObject final_index_iterator = NIL;
				try {
				    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
				    SubLObject done_var_$24 = NIL;
				    final SubLObject token_var_$25 = NIL;
				    while (NIL == done_var_$24) {
					final SubLObject assertion_var = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$25);
					final SubLObject valid_$26 = makeBoolean(!token_var_$25.eql(assertion_var));
					if (NIL != valid_$26) {
					    final SubLObject formula = assertions_high.gaf_formula(assertion_var);
					    arity.initialize_arity_max_from_formula(formula);
					}
					done_var_$24 = makeBoolean(NIL == valid_$26);
				    }
				} finally {
				    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
				    try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					if (NIL != final_index_iterator) {
					    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
					}
					restoreValuesFromVector(_values);
				    } finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
				    }
				}
			    }
			    done_var = makeBoolean(NIL == valid);
			}
			noting_progress_postamble();
		    } finally {
			$silent_progressP$.rebind(_prev_bind_8, thread);
			$is_noting_progressP$.rebind(_prev_bind_7, thread);
			$progress_count$.rebind(_prev_bind_6, thread);
			$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
			$progress_notification_count$.rebind(_prev_bind_4, thread);
			$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
			$progress_last_pacification_time$.rebind(_prev_bind_1_$23, thread);
			$progress_start_time$.rebind(_prev_bind_0_$22, thread);
		    }
		}
	    }
	} finally {
	    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
	    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
	}
	return hash_table_count(arity.$kb_arity_max_table$.getGlobalValue());
    }

    public static SubLObject initialize_arity_max_from_formula(final SubLObject formula) {
	final SubLObject relation = cycl_utilities.formula_arg1(formula, UNPROVIDED);
	if (NIL != forts.fort_p(relation)) {
	    final SubLObject arity_max = cycl_utilities.formula_arg2(formula, UNPROVIDED);
	    return arity.initialize_arity_max_for_relation_guts(relation, arity_max);
	}
	return NIL;
    }

    public static final SubLObject initialize_arity_max_from_assertion_alt(SubLObject assertion) {
	{
	    SubLObject relation = gaf_arg1(assertion);
	    if (NIL != fort_p(relation)) {
		{
		    SubLObject arity_max = gaf_arg2(assertion);
		    return com.cyc.cycjava.cycl.arity.initialize_arity_max_for_relation_guts(relation, arity_max);
		}
	    }
	}
	return NIL;
    }

    public static SubLObject initialize_arity_max_from_assertion(final SubLObject assertion) {
	return arity.initialize_arity_max_from_formula(assertions_high.gaf_formula(assertion));
    }

    public static final SubLObject initialize_arity_max_for_relation_alt(SubLObject relation) {
	{
	    SubLObject arity_max = kb_mapping_utilities.fpred_value_in_any_mt(relation, $$arityMax, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL == arity_max) {
		return NIL;
	    }
	    return com.cyc.cycjava.cycl.arity.initialize_arity_max_for_relation_guts(relation, arity_max);
	}
    }

    public static SubLObject initialize_arity_max_for_relation(final SubLObject relation) {
	final SubLObject arity_max = kb_mapping_utilities.fpred_value_in_any_mt(relation, arity.$$arityMax, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	if (NIL == arity_max) {
	    return NIL;
	}
	return arity.initialize_arity_max_for_relation_guts(relation, arity_max);
    }

    public static final SubLObject initialize_arity_max_for_relation_guts_alt(SubLObject relation, SubLObject arity_max) {
	arity_max = com.cyc.cycjava.cycl.arity.possibly_simplify_arity(arity_max);
	SubLTrampolineFile.checkType(arity_max, INTEGERP);
	com.cyc.cycjava.cycl.arity.set_arity_max(relation, arity_max);
	return arity_max;
    }

    public static SubLObject initialize_arity_max_for_relation_guts(final SubLObject relation, SubLObject arity_max) {
	arity_max = arity.possibly_simplify_arity(arity_max);
	assert NIL != integerp(arity_max) : "! integerp(arity_max) " + ("Types.integerp(arity_max) " + "CommonSymbols.NIL != Types.integerp(arity_max) ") + arity_max;
	arity.set_arity_max(relation, arity_max);
	return arity_max;
    }

    public static final SubLObject maybe_add_arity_max_for_relation_alt(SubLObject relation, SubLObject arity_max) {
	arity_max = com.cyc.cycjava.cycl.arity.possibly_simplify_arity(arity_max);
	SubLTrampolineFile.checkType(arity_max, INTEGERP);
	{
	    SubLObject arity_max_in_table = com.cyc.cycjava.cycl.arity.arity_max(relation);
	    if (NIL != arity_max_in_table) {
		if (!arity_max_in_table.eql(arity_max)) {
		    Errors.error($str_alt25$Trying_to_overload_arityMax_for__, relation, arity_max_in_table, arity_max);
		}
	    }
	    com.cyc.cycjava.cycl.arity.set_arity_max(relation, arity_max);
	}
	return arity_max;
    }

    public static SubLObject maybe_add_arity_max_for_relation(final SubLObject relation, SubLObject arity_max) {
	arity_max = arity.possibly_simplify_arity(arity_max);
	assert NIL != integerp(arity_max) : "! integerp(arity_max) " + ("Types.integerp(arity_max) " + "CommonSymbols.NIL != Types.integerp(arity_max) ") + arity_max;
	final SubLObject arity_max_in_table = arity.arity_max(relation);
	if ((NIL != arity_max_in_table) && (!arity_max_in_table.eql(arity_max))) {
	    Errors.error(arity.$str26$Trying_to_overload_arityMax_for__, relation, arity_max_in_table, arity_max);
	}
	arity.set_arity_max(relation, arity_max);
	return arity_max;
    }

    public static final SubLObject maybe_remove_arity_max_for_relation_alt(SubLObject relation) {
	{
	    SubLObject dont_remove = NIL;
	    SubLObject pred_var = $$arityMax;
	    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
		{
		    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
		    SubLObject done_var = dont_remove;
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
					    SubLObject done_var_19 = dont_remove;
					    SubLObject token_var_20 = NIL;
					    while (NIL == done_var_19) {
						{
						    SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_20);
						    SubLObject valid_21 = makeBoolean(token_var_20 != assertion);
						    if (NIL != valid_21) {
							dont_remove = kb_accessors.assertion_still_thereP(assertion, $TRUE);
						    }
						    done_var_19 = makeBoolean((NIL == valid_21) || (NIL != dont_remove));
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
			    done_var = makeBoolean((NIL == valid) || (NIL != dont_remove));
			}
		    }
		}
	    }
	    if (NIL == dont_remove) {
		com.cyc.cycjava.cycl.arity.rem_arity_max(relation);
	    }
	}
	return relation;
    }

    public static SubLObject maybe_remove_arity_max_for_relation(final SubLObject relation) {
	SubLObject dont_remove = NIL;
	final SubLObject pred_var = arity.$$arityMax;
	if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(relation, ONE_INTEGER, pred_var)) {
	    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(relation, ONE_INTEGER, pred_var);
	    SubLObject done_var = dont_remove;
	    final SubLObject token_var = NIL;
	    while (NIL == done_var) {
		final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
		final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
		if (NIL != valid) {
		    SubLObject final_index_iterator = NIL;
		    try {
			final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
			SubLObject done_var_$28 = dont_remove;
			final SubLObject token_var_$29 = NIL;
			while (NIL == done_var_$28) {
			    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
			    final SubLObject valid_$30 = makeBoolean(!token_var_$29.eql(assertion));
			    if (NIL != valid_$30) {
				dont_remove = kb_accessors.assertion_still_thereP(assertion, $TRUE);
			    }
			    done_var_$28 = makeBoolean((NIL == valid_$30) || (NIL != dont_remove));
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
		done_var = makeBoolean((NIL == valid) || (NIL != dont_remove));
	    }
	}
	if (NIL == dont_remove) {
	    arity.rem_arity_max(relation);
	}
	return relation;
    }

    public static final SubLObject max_arity_alt(SubLObject relation) {
	{
	    SubLObject v_arity = com.cyc.cycjava.cycl.arity.arity(relation);
	    if (NIL != v_arity) {
		return v_arity;
	    } else {
		return com.cyc.cycjava.cycl.arity.arity_max(relation);
	    }
	}
    }

    public static SubLObject max_arity(final SubLObject relation) {
	final SubLObject v_arity = arity.arity(relation);
	if (NIL != v_arity) {
	    return v_arity;
	}
	return arity.arity_max(relation);
    }

    public static SubLObject valid_relation_argnumP(final SubLObject relation, final SubLObject argnum) {
	final SubLObject max_arity = arity.max_arity(relation);
	return makeBoolean(((NIL == max_arity) && (NIL != arity.variable_arityP(relation))) || ((max_arity.isNumber() && argnum.isNumber()) && max_arity.numGE(argnum)));
    }

    /**
     *
     *
     * @return boolean; t iff RELATION admits N arguments.
     * @unknown (arity-admits? #$commutativeInArgs 2) NIL
     * @unknown (arity-admits? #$commutativeInArgs 3) T
     * @unknown (arity-admits? #$commutativeInArgs 4) T
     * @unknown (arity-admits? #$commutativeInArgs 5) T
     */
    @LispMethod(comment = "@return boolean; t iff RELATION admits N arguments.\r\n@unknown (arity-admits? #$commutativeInArgs 2) NIL\r\n@unknown (arity-admits? #$commutativeInArgs 3) T\r\n@unknown (arity-admits? #$commutativeInArgs 4) T\r\n@unknown (arity-admits? #$commutativeInArgs 5) T")
    public static final SubLObject arity_admitsP_alt(SubLObject relation, SubLObject n) {
	SubLTrampolineFile.checkType(n, INTEGERP);
	{
	    SubLObject v_arity = com.cyc.cycjava.cycl.arity.arity(relation);
	    if (v_arity.isInteger()) {
		return numE(v_arity, n);
	    } else {
		if (NIL != com.cyc.cycjava.cycl.arity.variable_arityP(relation)) {
		    {
			SubLObject arity_min = com.cyc.cycjava.cycl.arity.arity_min(relation);
			SubLObject arity_max = com.cyc.cycjava.cycl.arity.arity_max(relation);
			return makeBoolean(((NIL == arity_min) || n.numGE(arity_min)) && ((NIL == arity_max) || n.numLE(arity_max)));
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff RELATION admits N arguments.
     * @unknown (arity-admits? #$commutativeInArgs 2) NIL
     * @unknown (arity-admits? #$commutativeInArgs 3) T
     * @unknown (arity-admits? #$commutativeInArgs 4) T
     * @unknown (arity-admits? #$commutativeInArgs 5) T
     */
    @LispMethod(comment = "@return boolean; t iff RELATION admits N arguments.\r\n@unknown (arity-admits? #$commutativeInArgs 2) NIL\r\n@unknown (arity-admits? #$commutativeInArgs 3) T\r\n@unknown (arity-admits? #$commutativeInArgs 4) T\r\n@unknown (arity-admits? #$commutativeInArgs 5) T")
    public static SubLObject arity_admitsP(final SubLObject relation, final SubLObject n) {
	assert NIL != integerp(n) : "! integerp(n) " + ("Types.integerp(n) " + "CommonSymbols.NIL != Types.integerp(n) ") + n;
	final SubLObject v_arity = arity.arity(relation);
	if (v_arity.isInteger()) {
	    return numE(v_arity, n);
	}
	if (NIL != arity.variable_arityP(relation)) {
	    final SubLObject arity_min = arity.arity_min(relation);
	    final SubLObject arity_max = arity.arity_max(relation);
	    return makeBoolean(((NIL == arity_min) || n.numGE(arity_min)) && ((NIL == arity_max) || n.numLE(arity_max)));
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff any relation in RELATIONS admits N arguments.
     */
    @LispMethod(comment = "@return boolean; t iff any relation in RELATIONS admits N arguments.")
    public static final SubLObject any_arity_admitsP_alt(SubLObject relations, SubLObject n) {
	{
	    SubLObject cdolist_list_var = relations;
	    SubLObject relation = NIL;
	    for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), relation = cdolist_list_var.first()) {
		if (NIL != com.cyc.cycjava.cycl.arity.arity_admitsP(relation, n)) {
		    return T;
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff any relation in RELATIONS admits N arguments.
     */
    @LispMethod(comment = "@return boolean; t iff any relation in RELATIONS admits N arguments.")
    public static SubLObject any_arity_admitsP(final SubLObject relations, final SubLObject n) {
	SubLObject cdolist_list_var = relations;
	SubLObject relation = NIL;
	relation = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != arity.arity_admitsP(relation, n)) {
		return T;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    relation = cdolist_list_var.first();
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff there exists an M such that M >= N
    and RELATION admits M arguments.
     * @unknown (arity-admits>= #$commutativeInArgs 212) T
     */
    @LispMethod(comment = "@return boolean; t iff there exists an M such that M >= N\r\nand RELATION admits M arguments.\r\n@unknown (arity-admits>= #$commutativeInArgs 212) T")
    public static final SubLObject arity_admitsGE_alt(SubLObject relation, SubLObject n) {
	SubLTrampolineFile.checkType(n, INTEGERP);
	{
	    SubLObject v_arity = com.cyc.cycjava.cycl.arity.arity(relation);
	    if (v_arity.isInteger()) {
		return numGE(v_arity, n);
	    } else {
		if (NIL != com.cyc.cycjava.cycl.arity.variable_arityP(relation)) {
		    {
			SubLObject arity_max = com.cyc.cycjava.cycl.arity.arity_max(relation);
			return makeBoolean((NIL == arity_max) || n.numLE(arity_max));
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff there exists an M such that M >= N
    and RELATION admits M arguments.
     * @unknown (arity-admits>= #$commutativeInArgs 212) T
     */
    @LispMethod(comment = "@return boolean; t iff there exists an M such that M >= N\r\nand RELATION admits M arguments.\r\n@unknown (arity-admits>= #$commutativeInArgs 212) T")
    public static SubLObject arity_admitsGE(final SubLObject relation, final SubLObject n) {
	assert NIL != integerp(n) : "! integerp(n) " + ("Types.integerp(n) " + "CommonSymbols.NIL != Types.integerp(n) ") + n;
	final SubLObject v_arity = arity.arity(relation);
	if (v_arity.isInteger()) {
	    return numGE(v_arity, n);
	}
	if (NIL != arity.variable_arityP(relation)) {
	    final SubLObject arity_max = arity.arity_max(relation);
	    return makeBoolean((NIL == arity_max) || n.numLE(arity_max));
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff there exists an M such that M > N
    and RELATION admits M arguments.
     * @unknown (arity-admits> #$commutativeInArgs 1) T
     * @unknown (arity-admits> #$commutativeInArgs 7) T
     */
    @LispMethod(comment = "@return boolean; t iff there exists an M such that M > N\r\nand RELATION admits M arguments.\r\n@unknown (arity-admits> #$commutativeInArgs 1) T\r\n@unknown (arity-admits> #$commutativeInArgs 7) T")
    public static final SubLObject arity_admitsG_alt(SubLObject relation, SubLObject n) {
	SubLTrampolineFile.checkType(n, INTEGERP);
	{
	    SubLObject v_arity = com.cyc.cycjava.cycl.arity.arity(relation);
	    if (v_arity.isInteger()) {
		return numG(v_arity, n);
	    } else {
		if (NIL != com.cyc.cycjava.cycl.arity.variable_arityP(relation)) {
		    {
			SubLObject arity_max = com.cyc.cycjava.cycl.arity.arity_max(relation);
			return makeBoolean((NIL == arity_max) || n.numL(arity_max));
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff there exists an M such that M > N
    and RELATION admits M arguments.
     * @unknown (arity-admits> #$commutativeInArgs 1) T
     * @unknown (arity-admits> #$commutativeInArgs 7) T
     */
    @LispMethod(comment = "@return boolean; t iff there exists an M such that M > N\r\nand RELATION admits M arguments.\r\n@unknown (arity-admits> #$commutativeInArgs 1) T\r\n@unknown (arity-admits> #$commutativeInArgs 7) T")
    public static SubLObject arity_admitsG(final SubLObject relation, final SubLObject n) {
	assert NIL != integerp(n) : "! integerp(n) " + ("Types.integerp(n) " + "CommonSymbols.NIL != Types.integerp(n) ") + n;
	final SubLObject v_arity = arity.arity(relation);
	if (v_arity.isInteger()) {
	    return numG(v_arity, n);
	}
	if (NIL != arity.variable_arityP(relation)) {
	    final SubLObject arity_max = arity.arity_max(relation);
	    return makeBoolean((NIL == arity_max) || n.numL(arity_max));
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff there exists an M such that M <= N
    and RELATION admits M arguments.
     * @unknown (arity-admits<= #$commutativeInArgs 3) T
     * @unknown (arity-admits<= #$commutativeInArgs 4) T
     * @unknown (arity-admits<= #$commutativeInArgs 2) NIL
     */
    @LispMethod(comment = "@return boolean; t iff there exists an M such that M <= N\r\nand RELATION admits M arguments.\r\n@unknown (arity-admits<= #$commutativeInArgs 3) T\r\n@unknown (arity-admits<= #$commutativeInArgs 4) T\r\n@unknown (arity-admits<= #$commutativeInArgs 2) NIL")
    public static final SubLObject arity_admitsLE_alt(SubLObject relation, SubLObject n) {
	SubLTrampolineFile.checkType(n, INTEGERP);
	{
	    SubLObject v_arity = com.cyc.cycjava.cycl.arity.arity(relation);
	    if (v_arity.isInteger()) {
		return numLE(v_arity, n);
	    } else {
		if (NIL != com.cyc.cycjava.cycl.arity.variable_arityP(relation)) {
		    {
			SubLObject arity_min = com.cyc.cycjava.cycl.arity.arity_min(relation);
			return makeBoolean((NIL == arity_min) || n.numGE(arity_min));
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff there exists an M such that M <= N
    and RELATION admits M arguments.
     * @unknown (arity-admits<= #$commutativeInArgs 3) T
     * @unknown (arity-admits<= #$commutativeInArgs 4) T
     * @unknown (arity-admits<= #$commutativeInArgs 2) NIL
     */
    @LispMethod(comment = "@return boolean; t iff there exists an M such that M <= N\r\nand RELATION admits M arguments.\r\n@unknown (arity-admits<= #$commutativeInArgs 3) T\r\n@unknown (arity-admits<= #$commutativeInArgs 4) T\r\n@unknown (arity-admits<= #$commutativeInArgs 2) NIL")
    public static SubLObject arity_admitsLE(final SubLObject relation, final SubLObject n) {
	assert NIL != integerp(n) : "! integerp(n) " + ("Types.integerp(n) " + "CommonSymbols.NIL != Types.integerp(n) ") + n;
	final SubLObject v_arity = arity.arity(relation);
	if (v_arity.isInteger()) {
	    return numLE(v_arity, n);
	}
	if (NIL != arity.variable_arityP(relation)) {
	    final SubLObject arity_min = arity.arity_min(relation);
	    return makeBoolean((NIL == arity_min) || n.numGE(arity_min));
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff there exists an M such that M <= N
    and RELATION admits M arguments.
     * @unknown (arity-admits< #$commutativeInArgs 7) T
     * @unknown (arity-admits< #$commutativeInArgs 1) NIL
     * @unknown (arity-admits< #$commutativeInArgs 4) T
     * @unknown (arity-admits< #$commutativeInArgs 3) NIL
     */
    @LispMethod(comment = "@return boolean; t iff there exists an M such that M <= N\r\nand RELATION admits M arguments.\r\n@unknown (arity-admits< #$commutativeInArgs 7) T\r\n@unknown (arity-admits< #$commutativeInArgs 1) NIL\r\n@unknown (arity-admits< #$commutativeInArgs 4) T\r\n@unknown (arity-admits< #$commutativeInArgs 3) NIL")
    public static final SubLObject arity_admitsL_alt(SubLObject relation, SubLObject n) {
	SubLTrampolineFile.checkType(n, INTEGERP);
	{
	    SubLObject v_arity = com.cyc.cycjava.cycl.arity.arity(relation);
	    if (v_arity.isInteger()) {
		return numL(v_arity, n);
	    } else {
		if (NIL != com.cyc.cycjava.cycl.arity.variable_arityP(relation)) {
		    {
			SubLObject arity_min = com.cyc.cycjava.cycl.arity.arity_min(relation);
			return makeBoolean((NIL == arity_min) || n.numG(arity_min));
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff there exists an M such that M <= N
    and RELATION admits M arguments.
     * @unknown (arity-admits< #$commutativeInArgs 7) T
     * @unknown (arity-admits< #$commutativeInArgs 1) NIL
     * @unknown (arity-admits< #$commutativeInArgs 4) T
     * @unknown (arity-admits< #$commutativeInArgs 3) NIL
     */
    @LispMethod(comment = "@return boolean; t iff there exists an M such that M <= N\r\nand RELATION admits M arguments.\r\n@unknown (arity-admits< #$commutativeInArgs 7) T\r\n@unknown (arity-admits< #$commutativeInArgs 1) NIL\r\n@unknown (arity-admits< #$commutativeInArgs 4) T\r\n@unknown (arity-admits< #$commutativeInArgs 3) NIL")
    public static SubLObject arity_admitsL(final SubLObject relation, final SubLObject n) {
	assert NIL != integerp(n) : "! integerp(n) " + ("Types.integerp(n) " + "CommonSymbols.NIL != Types.integerp(n) ") + n;
	final SubLObject v_arity = arity.arity(relation);
	if (v_arity.isInteger()) {
	    return numL(v_arity, n);
	}
	if (NIL != arity.variable_arityP(relation)) {
	    final SubLObject arity_min = arity.arity_min(relation);
	    return makeBoolean((NIL == arity_min) || n.numG(arity_min));
	}
	return NIL;
    }

    public static final SubLObject binaryP_alt(SubLObject relation) {
	return eql(com.cyc.cycjava.cycl.arity.arity(relation), TWO_INTEGER);
    }

    public static SubLObject binaryP(final SubLObject relation) {
	return eql(arity.arity(relation), TWO_INTEGER);
    }

    public static final SubLObject binary_arg_swap_alt(SubLObject arg) {
	{
	    SubLObject pcase_var = arg;
	    if (pcase_var.eql(ONE_INTEGER)) {
		return TWO_INTEGER;
	    } else {
		if (pcase_var.eql(TWO_INTEGER)) {
		    return ONE_INTEGER;
		} else {
		    return arg;
		}
	    }
	}
    }

    public static SubLObject binary_arg_swap(final SubLObject arg) {
	if (arg.eql(ONE_INTEGER)) {
	    return TWO_INTEGER;
	}
	if (arg.eql(TWO_INTEGER)) {
	    return ONE_INTEGER;
	}
	return arg;
    }

    /**
     * Returns the arity of OBJECT if it's a logical operator.
     * Returns NIL if OBJECT is not a logical operator or is variable arity.
     */
    @LispMethod(comment = "Returns the arity of OBJECT if it\'s a logical operator.\r\nReturns NIL if OBJECT is not a logical operator or is variable arity.\nReturns the arity of OBJECT if it\'s a logical operator.\nReturns NIL if OBJECT is not a logical operator or is variable arity.")
    public static final SubLObject logical_operator_arity_alt(SubLObject v_object) {
	if (NIL != cyc_const_unary_logical_op_p(v_object)) {
	    return ONE_INTEGER;
	} else {
	    if (NIL != cyc_const_binary_logical_op_p(v_object)) {
		return TWO_INTEGER;
	    } else {
		if (NIL != cyc_const_ternary_logical_op_p(v_object)) {
		    return THREE_INTEGER;
		} else {
		    if (NIL != cyc_const_quaternary_logical_op_p(v_object)) {
			return FOUR_INTEGER;
		    } else {
			if (NIL != cyc_const_quintary_logical_op_p(v_object)) {
			    return FIVE_INTEGER;
			} else {
			    return NIL;
			}
		    }
		}
	    }
	}
    }

    @LispMethod(comment = "Returns the arity of OBJECT if it\'s a logical operator.\r\nReturns NIL if OBJECT is not a logical operator or is variable arity.\nReturns the arity of OBJECT if it\'s a logical operator.\nReturns NIL if OBJECT is not a logical operator or is variable arity.")
    public static SubLObject logical_operator_arity(final SubLObject v_object) {
	if (NIL != cyc_const_unary_logical_op_p(v_object)) {
	    return ONE_INTEGER;
	}
	if (NIL != cyc_const_binary_logical_op_p(v_object)) {
	    return TWO_INTEGER;
	}
	if (NIL != cyc_const_ternary_logical_op_p(v_object)) {
	    return THREE_INTEGER;
	}
	if (NIL != cyc_const_quaternary_logical_op_p(v_object)) {
	    return FOUR_INTEGER;
	}
	if (NIL != cyc_const_quintary_logical_op_p(v_object)) {
	    return FIVE_INTEGER;
	}
	return NIL;
    }

    /**
    * Returns the arity of OBJECT if it's a logical operator.
    * Returns NIL if OBJECT is not a logical operator or is variable arity.
    */

    public static final SubLObject variable_arityP_alt(SubLObject relation) {
	return fort_types_interface.isa_variable_arity_relationP(relation, mt_vars.$anect_mt$.getGlobalValue());
    }

    public static SubLObject variable_arityP(final SubLObject relation) {
	return fort_types_interface.isa_variable_arity_relationP(relation, mt_vars.$anect_mt$.getGlobalValue());
    }

    /**
     * Returns a list of CycL sentences expressing the arity constraints for RELATION.
     */
    @LispMethod(comment = "Returns a list of CycL sentences expressing the arity constraints for RELATION.")
    public static final SubLObject relation_arity_constraint_sentences_alt(SubLObject relation) {
	SubLTrampolineFile.checkType(relation, RELATION_P);
	if (NIL != fort_types_interface.variable_arity_relation_p(relation)) {
	    {
		SubLObject max_arity = com.cyc.cycjava.cycl.arity.max_arity(relation);
		SubLObject min_arity = com.cyc.cycjava.cycl.arity.min_arity(relation);
		SubLObject arity_constraints = NIL;
		arity_constraints = cons(list($$arityMin, relation, min_arity), arity_constraints);
		if (NIL != max_arity) {
		    arity_constraints = cons(list($$arityMax, relation, max_arity), arity_constraints);
		}
		return nreverse(arity_constraints);
	    }
	} else {
	    return list(list($$arity, relation, com.cyc.cycjava.cycl.arity.arity(relation)));
	}
    }

    @LispMethod(comment = "Returns a list of CycL sentences expressing the arity constraints for RELATION.")
    public static SubLObject relation_arity_constraint_sentences(final SubLObject relation) {
	assert NIL != fort_types_interface.relation_p(relation) : "! fort_types_interface.relation_p(relation) " + ("fort_types_interface.relation_p(relation) " + "CommonSymbols.NIL != fort_types_interface.relation_p(relation) ") + relation;
	if (NIL != fort_types_interface.variable_arity_relation_p(relation)) {
	    final SubLObject max_arity = arity.max_arity(relation);
	    final SubLObject min_arity = arity.min_arity(relation);
	    SubLObject arity_constraints = NIL;
	    arity_constraints = cons(list(arity.$$arityMin, relation, min_arity), arity_constraints);
	    if (NIL != max_arity) {
		arity_constraints = cons(list(arity.$$arityMax, relation, max_arity), arity_constraints);
	    }
	    return nreverse(arity_constraints);
	}
	return list(list(arity.$$arity, relation, arity.arity(relation)));
    }

    /**
    * Returns a list of CycL sentences expressing the arity constraints for RELATION.
    */

    public static final SubLObject arity_cache_unbuiltP_alt() {
	return sublisp_null($kb_arity_table$.getGlobalValue());
    }

    public static SubLObject arity_cache_unbuiltP() {
	return sublisp_null(arity.$kb_arity_table$.getGlobalValue());
    }

    public static final SubLObject rebuild_arity_cache_alt() {
	return com.cyc.cycjava.cycl.arity.initialize_all_arities();
    }

    public static SubLObject rebuild_arity_cache() {
	return arity.initialize_all_arities();
    }

    public static final SubLObject dump_arity_cache_to_stream_alt(SubLObject stream) {
	cfasl_output($kb_arity_table$.getGlobalValue(), stream);
	cfasl_output($kb_arity_min_table$.getGlobalValue(), stream);
	cfasl_output($kb_arity_max_table$.getGlobalValue(), stream);
	cfasl_output(NIL, stream);
	return NIL;
    }

    public static SubLObject dump_arity_cache_to_stream(final SubLObject stream) {
	cfasl_output(arity.$kb_arity_table$.getGlobalValue(), stream);
	cfasl_output(arity.$kb_arity_min_table$.getGlobalValue(), stream);
	cfasl_output(arity.$kb_arity_max_table$.getGlobalValue(), stream);
	cfasl_output(NIL, stream);
	return NIL;
    }

    public static final SubLObject load_arity_cache_from_stream_alt(SubLObject stream) {
	{
	    SubLObject dummy = NIL;
	    $kb_arity_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
	    $kb_arity_min_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
	    $kb_arity_max_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
	    dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	}
	return NIL;
    }

    public static SubLObject load_arity_cache_from_stream(final SubLObject stream) {
	SubLObject dummy = NIL;
	arity.$kb_arity_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
	arity.$kb_arity_min_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
	arity.$kb_arity_max_table$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
	dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	return NIL;
    }

    public static SubLObject declare_arity_file() {
	declareFunction("initialize_arity_table", "INITIALIZE-ARITY-TABLE", 0, 0, false);
	declareFunction("arity_lookup", "ARITY-LOOKUP", 1, 0, false);
	declareFunction("set_arity", "SET-ARITY", 2, 0, false);
	declareFunction("rem_arity", "REM-ARITY", 1, 0, false);
	declareFunction("arity", "ARITY", 1, 0, false);
	new arity.$arity$UnaryFunction();
	declareFunction("arity_robust", "ARITY-ROBUST", 1, 0, false);
	declareFunction("initialize_all_arities", "INITIALIZE-ALL-ARITIES", 0, 0, false);
	declareFunction("initialize_arities", "INITIALIZE-ARITIES", 0, 0, false);
	declareFunction("initialize_arity_from_formula", "INITIALIZE-ARITY-FROM-FORMULA", 1, 0, false);
	declareFunction("initialize_arity_from_assertion", "INITIALIZE-ARITY-FROM-ASSERTION", 1, 0, false);
	declareFunction("initialize_arity_for_relation", "INITIALIZE-ARITY-FOR-RELATION", 1, 0, false);
	declareFunction("initialize_arity_for_relation_guts", "INITIALIZE-ARITY-FOR-RELATION-GUTS", 2, 0, false);
	declareFunction("possibly_simplify_arity", "POSSIBLY-SIMPLIFY-ARITY", 1, 0, false);
	declareFunction("maybe_add_arity_for_relation", "MAYBE-ADD-ARITY-FOR-RELATION", 2, 0, false);
	declareFunction("maybe_remove_arity_for_relation", "MAYBE-REMOVE-ARITY-FOR-RELATION", 2, 0, false);
	declareFunction("initialize_arity_min_table", "INITIALIZE-ARITY-MIN-TABLE", 0, 0, false);
	declareFunction("arity_min_lookup", "ARITY-MIN-LOOKUP", 1, 0, false);
	declareFunction("set_arity_min", "SET-ARITY-MIN", 2, 0, false);
	declareFunction("rem_arity_min", "REM-ARITY-MIN", 1, 0, false);
	declareFunction("arity_min", "ARITY-MIN", 1, 0, false);
	declareFunction("arity_min_int", "ARITY-MIN-INT", 1, 0, false);
	declareFunction("initialize_min_arities", "INITIALIZE-MIN-ARITIES", 0, 0, false);
	declareFunction("initialize_arity_min_from_formula", "INITIALIZE-ARITY-MIN-FROM-FORMULA", 1, 0, false);
	declareFunction("initialize_arity_min_from_assertion", "INITIALIZE-ARITY-MIN-FROM-ASSERTION", 1, 0, false);
	declareFunction("initialize_arity_min_for_relation", "INITIALIZE-ARITY-MIN-FOR-RELATION", 1, 0, false);
	declareFunction("initialize_arity_min_for_relation_guts", "INITIALIZE-ARITY-MIN-FOR-RELATION-GUTS", 2, 0, false);
	declareFunction("maybe_add_arity_min_for_relation", "MAYBE-ADD-ARITY-MIN-FOR-RELATION", 2, 0, false);
	declareFunction("maybe_remove_arity_min_for_relation", "MAYBE-REMOVE-ARITY-MIN-FOR-RELATION", 1, 0, false);
	declareFunction("min_arity", "MIN-ARITY", 1, 0, false);
	declareFunction("initialize_arity_max_table", "INITIALIZE-ARITY-MAX-TABLE", 0, 0, false);
	declareFunction("arity_max_lookup", "ARITY-MAX-LOOKUP", 1, 0, false);
	declareFunction("set_arity_max", "SET-ARITY-MAX", 2, 0, false);
	declareFunction("rem_arity_max", "REM-ARITY-MAX", 1, 0, false);
	declareFunction("arity_max", "ARITY-MAX", 1, 0, false);
	declareFunction("initialize_max_arities", "INITIALIZE-MAX-ARITIES", 0, 0, false);
	declareFunction("initialize_arity_max_from_formula", "INITIALIZE-ARITY-MAX-FROM-FORMULA", 1, 0, false);
	declareFunction("initialize_arity_max_from_assertion", "INITIALIZE-ARITY-MAX-FROM-ASSERTION", 1, 0, false);
	declareFunction("initialize_arity_max_for_relation", "INITIALIZE-ARITY-MAX-FOR-RELATION", 1, 0, false);
	declareFunction("initialize_arity_max_for_relation_guts", "INITIALIZE-ARITY-MAX-FOR-RELATION-GUTS", 2, 0, false);
	declareFunction("maybe_add_arity_max_for_relation", "MAYBE-ADD-ARITY-MAX-FOR-RELATION", 2, 0, false);
	declareFunction("maybe_remove_arity_max_for_relation", "MAYBE-REMOVE-ARITY-MAX-FOR-RELATION", 1, 0, false);
	declareFunction("max_arity", "MAX-ARITY", 1, 0, false);
	declareFunction("valid_relation_argnumP", "VALID-RELATION-ARGNUM?", 2, 0, false);
	declareFunction("arity_admitsP", "ARITY-ADMITS?", 2, 0, false);
	declareFunction("any_arity_admitsP", "ANY-ARITY-ADMITS?", 2, 0, false);
	declareFunction("arity_admitsGE", "ARITY-ADMITS>=", 2, 0, false);
	declareFunction("arity_admitsG", "ARITY-ADMITS>", 2, 0, false);
	declareFunction("arity_admitsLE", "ARITY-ADMITS<=", 2, 0, false);
	declareFunction("arity_admitsL", "ARITY-ADMITS<", 2, 0, false);
	declareFunction("binaryP", "BINARY?", 1, 0, false);
	declareFunction("binary_arg_swap", "BINARY-ARG-SWAP", 1, 0, false);
	declareFunction("logical_operator_arity", "LOGICAL-OPERATOR-ARITY", 1, 0, false);
	declareFunction("variable_arityP", "VARIABLE-ARITY?", 1, 0, false);
	declareFunction("relation_arity_constraint_sentences", "RELATION-ARITY-CONSTRAINT-SENTENCES", 1, 0, false);
	declareFunction("arity_cache_unbuiltP", "ARITY-CACHE-UNBUILT?", 0, 0, false);
	declareFunction("rebuild_arity_cache", "REBUILD-ARITY-CACHE", 0, 0, false);
	declareFunction("dump_arity_cache_to_stream", "DUMP-ARITY-CACHE-TO-STREAM", 1, 0, false);
	declareFunction("load_arity_cache_from_stream", "LOAD-ARITY-CACHE-FROM-STREAM", 1, 0, false);
	return NIL;
    }

    public static final SubLObject init_arity_file_alt() {
	deflexical("*KB-ARITY-TABLE-EQUALITY-TEST*", symbol_function(EQ));
	deflexical("*KB-ARITY-TABLE*", NIL != boundp($kb_arity_table$) ? ((SubLObject) ($kb_arity_table$.getGlobalValue())) : NIL);
	deflexical("*KB-ARITY-MIN-TABLE*", NIL != boundp($kb_arity_min_table$) ? ((SubLObject) ($kb_arity_min_table$.getGlobalValue())) : NIL);
	deflexical("*KB-ARITY-MAX-TABLE*", NIL != boundp($kb_arity_max_table$) ? ((SubLObject) ($kb_arity_max_table$.getGlobalValue())) : NIL);
	return NIL;
    }

    public static SubLObject init_arity_file() {
	if (SubLFiles.USE_V1) {
	    deflexical("*KB-ARITY-TABLE-EQUALITY-TEST*", symbol_function(EQL));
	    deflexical("*KB-ARITY-TABLE*", SubLTrampolineFile.maybeDefault(arity.$kb_arity_table$, arity.$kb_arity_table$, NIL));
	    deflexical("*KB-ARITY-MIN-TABLE*", SubLTrampolineFile.maybeDefault(arity.$kb_arity_min_table$, arity.$kb_arity_min_table$, NIL));
	    deflexical("*KB-ARITY-MAX-TABLE*", SubLTrampolineFile.maybeDefault(arity.$kb_arity_max_table$, arity.$kb_arity_max_table$, NIL));
	}
	if (SubLFiles.USE_V2) {
	    deflexical("*KB-ARITY-TABLE-EQUALITY-TEST*", symbol_function(EQ));
	    deflexical("*KB-ARITY-TABLE*", NIL != boundp($kb_arity_table$) ? ((SubLObject) ($kb_arity_table$.getGlobalValue())) : NIL);
	    deflexical("*KB-ARITY-MIN-TABLE*", NIL != boundp($kb_arity_min_table$) ? ((SubLObject) ($kb_arity_min_table$.getGlobalValue())) : NIL);
	    deflexical("*KB-ARITY-MAX-TABLE*", NIL != boundp($kb_arity_max_table$) ? ((SubLObject) ($kb_arity_max_table$.getGlobalValue())) : NIL);
	}
	return NIL;
    }

    public static SubLObject init_arity_file_Previous() {
	deflexical("*KB-ARITY-TABLE-EQUALITY-TEST*", symbol_function(EQL));
	deflexical("*KB-ARITY-TABLE*", SubLTrampolineFile.maybeDefault(arity.$kb_arity_table$, arity.$kb_arity_table$, NIL));
	deflexical("*KB-ARITY-MIN-TABLE*", SubLTrampolineFile.maybeDefault(arity.$kb_arity_min_table$, arity.$kb_arity_min_table$, NIL));
	deflexical("*KB-ARITY-MAX-TABLE*", SubLTrampolineFile.maybeDefault(arity.$kb_arity_max_table$, arity.$kb_arity_max_table$, NIL));
	return NIL;
    }

    public static final SubLObject setup_arity_file_alt() {
	declare_defglobal($kb_arity_table$);
	register_cyc_api_function(ARITY, $list_alt5, $str_alt6$Return_the_arity_for_relation_con, NIL, NIL);
	declare_defglobal($kb_arity_min_table$);
	declare_defglobal($kb_arity_max_table$);
	define_test_case_table_int($sym27$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt35);
	define_test_case_table_int($sym36$ARITY_ADMITS__, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt37);
	define_test_case_table_int($sym38$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt39);
	define_test_case_table_int($sym40$ARITY_ADMITS__, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt41);
	define_test_case_table_int($sym42$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt43);
	define_test_case_table_int(RELATION_ARITY_CONSTRAINT_SENTENCES, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt47);
	return NIL;
    }

    public static SubLObject setup_arity_file() {
	if (SubLFiles.USE_V1) {
	    declare_defglobal(arity.$kb_arity_table$);
	    register_cyc_api_function(ARITY, arity.$list5, arity.$str6$Return_the_arity_for_relation_con, NIL, NIL);
	    declare_defglobal(arity.$kb_arity_min_table$);
	    register_external_symbol(arity.MIN_ARITY);
	    declare_defglobal(arity.$kb_arity_max_table$);
	    register_external_symbol(arity.MAX_ARITY);
	    define_test_case_table_int(arity.$sym29$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list36);
	    define_test_case_table_int(arity.$sym37$ARITY_ADMITS__, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list38);
	    define_test_case_table_int(arity.$sym39$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list40);
	    define_test_case_table_int(arity.$sym41$ARITY_ADMITS__, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list42);
	    define_test_case_table_int(arity.$sym43$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list44);
	    define_test_case_table_int(arity.RELATION_ARITY_CONSTRAINT_SENTENCES, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), arity.$list47);
	}
	if (SubLFiles.USE_V2) {
	    define_test_case_table_int($sym27$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt35);
	    define_test_case_table_int($sym36$ARITY_ADMITS__, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt37);
	    define_test_case_table_int($sym38$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt39);
	    define_test_case_table_int($sym40$ARITY_ADMITS__, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt41);
	    define_test_case_table_int($sym42$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$ashenoy, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt43);
	    define_test_case_table_int(RELATION_ARITY_CONSTRAINT_SENTENCES, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$pace, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt47);
	}
	return NIL;
    }

    public static SubLObject setup_arity_file_Previous() {
	declare_defglobal(arity.$kb_arity_table$);
	register_cyc_api_function(ARITY, arity.$list5, arity.$str6$Return_the_arity_for_relation_con, NIL, NIL);
	declare_defglobal(arity.$kb_arity_min_table$);
	register_external_symbol(arity.MIN_ARITY);
	declare_defglobal(arity.$kb_arity_max_table$);
	register_external_symbol(arity.MAX_ARITY);
	define_test_case_table_int(arity.$sym29$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list36);
	define_test_case_table_int(arity.$sym37$ARITY_ADMITS__, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list38);
	define_test_case_table_int(arity.$sym39$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list40);
	define_test_case_table_int(arity.$sym41$ARITY_ADMITS__, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list42);
	define_test_case_table_int(arity.$sym43$ARITY_ADMITS_, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), arity.$list44);
	define_test_case_table_int(arity.RELATION_ARITY_CONSTRAINT_SENTENCES, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), arity.$list47);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	arity.declare_arity_file();
    }

    @Override
    public void initializeVariables() {
	arity.init_arity_file();
    }

    @Override
    public void runTopLevelForms() {
	arity.setup_arity_file();
    }

    static {
    }

    public static final class $arity$UnaryFunction extends UnaryFunction {
	public $arity$UnaryFunction() {
	    super(extractFunctionNamed("ARITY"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return arity.arity(arg1);
	}
    }

    static private final SubLList $list_alt5 = list(makeSymbol("RELATION"));

    static private final SubLString $str_alt6$Return_the_arity_for_relation_con = makeString("Return the arity for relation constant RELATION.");

    static private final SubLList $list_alt9 = list(makeSymbol("?X"));

    static private final SubLList $list_alt11 = list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL);

    static private final SubLString $str_alt12$Initializing_all_arities___ = makeString("Initializing all arities...");

    static private final SubLString $str_alt18$Trying_to_overload_arity_for__A_f = makeString("Trying to overload arity for ~A from ~A to ~A");

    static private final SubLString $str_alt22$Trying_to_overload_arityMin_for__ = makeString("Trying to overload arityMin for ~A from ~A to ~A");

    static private final SubLString $str_alt25$Trying_to_overload_arityMax_for__ = makeString("Trying to overload arityMax for ~A from ~A to ~A");

    static private final SubLSymbol $sym27$ARITY_ADMITS_ = makeSymbol("ARITY-ADMITS?");

    static private final SubLString $$$ashenoy = makeString("ashenoy");

    static private final SubLList $list_alt35 = list(list(list(reader_make_constant_shell("commutativeInArgs"), TWO_INTEGER), NIL), list(list(reader_make_constant_shell("commutativeInArgs"), THREE_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), FOUR_INTEGER), T),
	    list(list(reader_make_constant_shell("commutativeInArgs"), FIVE_INTEGER), T));

    static private final SubLSymbol $sym36$ARITY_ADMITS__ = makeSymbol("ARITY-ADMITS>=");

    static private final SubLList $list_alt37 = list(list(list(reader_make_constant_shell("commutativeInArgs"), makeInteger(212)), T));

    static private final SubLSymbol $sym38$ARITY_ADMITS_ = makeSymbol("ARITY-ADMITS>");

    static private final SubLList $list_alt39 = list(list(list(reader_make_constant_shell("commutativeInArgs"), ONE_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), SEVEN_INTEGER), T));

    static private final SubLSymbol $sym40$ARITY_ADMITS__ = makeSymbol("ARITY-ADMITS<=");

    static private final SubLList $list_alt41 = list(list(list(reader_make_constant_shell("commutativeInArgs"), THREE_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), FOUR_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), TWO_INTEGER), NIL));

    static private final SubLSymbol $sym42$ARITY_ADMITS_ = makeSymbol("ARITY-ADMITS<");

    static private final SubLList $list_alt43 = list(list(list(reader_make_constant_shell("commutativeInArgs"), SEVEN_INTEGER), T), list(list(reader_make_constant_shell("commutativeInArgs"), ONE_INTEGER), NIL), list(list(reader_make_constant_shell("commutativeInArgs"), FOUR_INTEGER), T),
	    list(list(reader_make_constant_shell("commutativeInArgs"), THREE_INTEGER), NIL));

    static private final SubLString $$$pace = makeString("pace");

    static private final SubLList $list_alt47 = list(list(list(reader_make_constant_shell("isa")), list(list(reader_make_constant_shell("arity"), reader_make_constant_shell("isa"), TWO_INTEGER))),
	    list(list(reader_make_constant_shell("different")), list(list(reader_make_constant_shell("arityMin"), reader_make_constant_shell("different"), TWO_INTEGER))),
	    list(list(reader_make_constant_shell("Percent")), list(list(reader_make_constant_shell("arityMin"), reader_make_constant_shell("Percent"), ONE_INTEGER), list(reader_make_constant_shell("arityMax"), reader_make_constant_shell("Percent"), TWO_INTEGER))));
}

/**
 * Total time: 636 ms
 */
