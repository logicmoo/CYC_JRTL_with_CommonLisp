/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.constant_count;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$unprovided$;
import static com.cyc.cycjava.cycl.utilities_macros.declare_control_parameter_internal;
import static com.cyc.cycjava.cycl.utilities_macros.register_global_lock;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.cycjava.cycl.utilities_macros.unprovided_argumentP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CONTROL-VARS
 * source file: /cyc/top/cycl/control-vars.lisp
 * created:     2019/07/03 17:37:07
 */
public final class control_vars extends SubLTranslatedFile implements V12 {
	public static final SubLSymbol $show_assertions_in_english$ = makeSymbol("*SHOW-ASSERTIONS-IN-ENGLISH*");

	/**
	 * Whether to use #$sentenceParameterValueInSpecification, #$microtheoryParameterValueInSpecification,
	 * and #$inferenceModeParameterValueInSpecification for lookup
	 */
	// defvar
	@LispMethod(comment = "Whether to use #$sentenceParameterValueInSpecification, #$microtheoryParameterValueInSpecification,\r\nand #$inferenceModeParameterValueInSpecification for lookup\nWhether to use #$sentenceParameterValueInSpecification, #$microtheoryParameterValueInSpecification,\nand #$inferenceModeParameterValueInSpecification for lookup\ndefvar")
	public static final SubLSymbol $curried_kbq_lookupP$ = makeSymbol("*CURRIED-KBQ-LOOKUP?*");

	/**
	 * An a-list of cache tables for each application using a cache.
	 * The form of each elememt in the a-list
	 * is (<cache-key (<data-type-key-1> . <data-1>) (<data-type-key-2> . <data-2>) ...),
	 * where <cache-key> is a keyword identifying (naming) an application cache,
	 * <data-type-key-n> is a key identifying the kind of data in <data-n>, and <data-n>
	 * is a hash table or a vector.
	 */
	// defparameter
	@LispMethod(comment = "An a-list of cache tables for each application using a cache.\r\nThe form of each elememt in the a-list\r\nis (<cache-key (<data-type-key-1> . <data-1>) (<data-type-key-2> . <data-2>) ...),\r\nwhere <cache-key> is a keyword identifying (naming) an application cache,\r\n<data-type-key-n> is a key identifying the kind of data in <data-n>, and <data-n>\r\nis a hash table or a vector.\nAn a-list of cache tables for each application using a cache.\nThe form of each elememt in the a-list\nis (<cache-key (<data-type-key-1> . <data-1>) (<data-type-key-2> . <data-2>) ...),\nwhere <cache-key> is a keyword identifying (naming) an application cache,\n<data-type-key-n> is a key identifying the kind of data in <data-n>, and <data-n>\nis a hash table or a vector.\ndefparameter")
	public static final SubLSymbol $semantic_retrieval_caches$ = makeSymbol("*SEMANTIC-RETRIEVAL-CACHES*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $keyword_package$ = makeSymbol("*KEYWORD-PACKAGE*");

	public static final SubLFile me = new control_vars();

	// defparameter
	// Definitions
	/**
	 * Does the #$ reader error if the referenced constant does not exist?
	 */
	@LispMethod(comment = "Does the #$ reader error if the referenced constant does not exist?\ndefparameter")
	public static final SubLSymbol $read_require_constant_exists$ = makeSymbol("*READ-REQUIRE-CONSTANT-EXISTS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $bootstrapping_kbP$ = makeSymbol("*BOOTSTRAPPING-KB?*");

	// public static SubLSymbol $keyword_package$;
	// deflexical
	@LispMethod(comment = "public static SubLSymbol $keyword_package$;\ndeflexical")
	public static final SubLSymbol $sublisp_package$ = makeSymbol("*SUBLISP-PACKAGE*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $cyc_package$ = makeSymbol("*CYC-PACKAGE*");

	// defparameter
	/**
	 * predicate used to compare two cnfs when searching for an assertion (or axiom)
	 * in the kb
	 */
	@LispMethod(comment = "predicate used to compare two cnfs when searching for an assertion (or axiom)\r\nin the kb\ndefparameter\npredicate used to compare two cnfs when searching for an assertion (or axiom)\nin the kb")
	public static final SubLSymbol $cnf_matching_predicate$ = makeSymbol("*CNF-MATCHING-PREDICATE*");

	// defparameter
	/**
	 * predicate used to compare two gaf formulas when searching for an assertion
	 * (or axiom) in the kb
	 */
	@LispMethod(comment = "predicate used to compare two gaf formulas when searching for an assertion\r\n(or axiom) in the kb\ndefparameter\npredicate used to compare two gaf formulas when searching for an assertion\n(or axiom) in the kb")
	public static final SubLSymbol $gaf_matching_predicate$ = makeSymbol("*GAF-MATCHING-PREDICATE*");

	// defparameter
	/**
	 * predicate used to compare two nat formulas when searching for a reified nat
	 * in the kb
	 */
	@LispMethod(comment = "predicate used to compare two nat formulas when searching for a reified nat\r\nin the kb\ndefparameter\npredicate used to compare two nat formulas when searching for a reified nat\nin the kb")
	public static final SubLSymbol $nat_matching_predicate$ = makeSymbol("*NAT-MATCHING-PREDICATE*");

	// defparameter
	// used for robust assertion lookup in find-assertions-*
	/**
	 * used for robust assertion lookup in find-assertions-*
	 */
	@LispMethod(comment = "used for robust assertion lookup in find-assertions-*\ndefparameter")
	public static final SubLSymbol $candidate_assertion$ = makeSymbol("*CANDIDATE-ASSERTION*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $variable_names$ = makeSymbol("*VARIABLE-NAMES*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $assertion_truth$ = makeSymbol("*ASSERTION-TRUTH*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_answer$ = makeSymbol("*MAPPING-ANSWER*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_pred$ = makeSymbol("*MAPPING-PRED*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_source$ = makeSymbol("*MAPPING-SOURCE*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_target$ = makeSymbol("*MAPPING-TARGET*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_target_arg$ = makeSymbol("*MAPPING-TARGET-ARG*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_index_arg$ = makeSymbol("*MAPPING-INDEX-ARG*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_gather_arg$ = makeSymbol("*MAPPING-GATHER-ARG*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_gather_args$ = makeSymbol("*MAPPING-GATHER-ARGS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_output_stream$ = makeSymbol("*MAPPING-OUTPUT-STREAM*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_equality_test$ = makeSymbol("*MAPPING-EQUALITY-TEST*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_any_answerP$ = makeSymbol("*MAPPING-ANY-ANSWER?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_relation$ = makeSymbol("*MAPPING-RELATION*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_finished_fn$ = makeSymbol("*MAPPING-FINISHED-FN*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_path$ = makeSymbol("*MAPPING-PATH*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_data_1$ = makeSymbol("*MAPPING-DATA-1*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_data_2$ = makeSymbol("*MAPPING-DATA-2*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_pivot_arg$ = makeSymbol("*MAPPING-PIVOT-ARG*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_gather_key$ = makeSymbol("*MAPPING-GATHER-KEY*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_gather_key_args$ = makeSymbol("*MAPPING-GATHER-KEY-ARGS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_assertion_selection_fn$ = makeSymbol("*MAPPING-ASSERTION-SELECTION-FN*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $mapping_assertion_bookkeeping_fn$ = makeSymbol("*MAPPING-ASSERTION-BOOKKEEPING-FN*");

	// defparameter
	// function applied in mapping-funcall-arg
	/**
	 * function applied in mapping-funcall-arg
	 */
	@LispMethod(comment = "function applied in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn$ = makeSymbol("*MAPPING-FN*");

	// defparameter
	// designates non-default argument in mapping-funcall-arg
	/**
	 * designates non-default argument in mapping-funcall-arg
	 */
	@LispMethod(comment = "designates non-default argument in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn_arg$ = makeSymbol("*MAPPING-FN-ARG*");

	// defparameter
	// default arg1 in mapping-funcall-arg
	/**
	 * default arg1 in mapping-funcall-arg
	 */
	@LispMethod(comment = "default arg1 in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn_arg1$ = makeSymbol("*MAPPING-FN-ARG1*");

	// defparameter
	// default arg2 in mapping-funcall-arg
	/**
	 * default arg2 in mapping-funcall-arg
	 */
	@LispMethod(comment = "default arg2 in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn_arg2$ = makeSymbol("*MAPPING-FN-ARG2*");

	// defparameter
	// default arg3 in mapping-funcall-arg
	/**
	 * default arg3 in mapping-funcall-arg
	 */
	@LispMethod(comment = "default arg3 in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn_arg3$ = makeSymbol("*MAPPING-FN-ARG3*");

	// defparameter
	// default arg4 in mapping-funcall-arg
	/**
	 * default arg4 in mapping-funcall-arg
	 */
	@LispMethod(comment = "default arg4 in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn_arg4$ = makeSymbol("*MAPPING-FN-ARG4*");

	// defparameter
	// default arg5 in mapping-funcall-arg
	/**
	 * default arg5 in mapping-funcall-arg
	 */
	@LispMethod(comment = "default arg5 in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn_arg5$ = makeSymbol("*MAPPING-FN-ARG5*");

	// defparameter
	// default arg6 in mapping-funcall-arg
	/**
	 * default arg6 in mapping-funcall-arg
	 */
	@LispMethod(comment = "default arg6 in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn_arg6$ = makeSymbol("*MAPPING-FN-ARG6*");

	// defparameter
	// default arg7 in mapping-funcall-arg
	/**
	 * default arg7 in mapping-funcall-arg
	 */
	@LispMethod(comment = "default arg7 in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn_arg7$ = makeSymbol("*MAPPING-FN-ARG7*");

	// defparameter
	// default arg8 in mapping-funcall-arg
	/**
	 * default arg8 in mapping-funcall-arg
	 */
	@LispMethod(comment = "default arg8 in mapping-funcall-arg\ndefparameter")
	public static final SubLSymbol $mapping_fn_arg8$ = makeSymbol("*MAPPING-FN-ARG8*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $kba_pred$ = makeSymbol("*KBA-PRED*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $standard_indent_string$ = makeSymbol("*STANDARD-INDENT-STRING*");

	// defparameter
	/**
	 * The maximum function complexity of CycL allowed by the system. NIL means 'no
	 * limit'.
	 */
	@LispMethod(comment = "The maximum function complexity of CycL allowed by the system. NIL means \'no\r\nlimit\'.\ndefparameter\nThe maximum function complexity of CycL allowed by the system. NIL means \'no\nlimit\'.")
	public static final SubLSymbol $term_functional_complexity_cutoff$ = makeSymbol("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*");

	// defparameter
	/**
	 * The maximum relation complexity of CycL allowed by the system. NIL means 'no
	 * limit'.
	 */
	@LispMethod(comment = "The maximum relation complexity of CycL allowed by the system. NIL means \'no\r\nlimit\'.\ndefparameter\nThe maximum relation complexity of CycL allowed by the system. NIL means \'no\nlimit\'.")
	public static final SubLSymbol $term_relational_complexity_cutoff$ = makeSymbol("*TERM-RELATIONAL-COMPLEXITY-CUTOFF*");

	// defparameter
	// compile successful inference chains into macro rules?
	/**
	 * compile successful inference chains into macro rules?
	 */
	@LispMethod(comment = "compile successful inference chains into macro rules?\ndefparameter")
	public static final SubLSymbol $collect_justification_compilationsP$ = makeSymbol("*COLLECT-JUSTIFICATION-COMPILATIONS?*");

	// defparameter
	// candidate macro rules are recorded here
	/**
	 * candidate macro rules are recorded here
	 */
	@LispMethod(comment = "candidate macro rules are recorded here\ndefparameter")
	public static final SubLSymbol $justification_compilations$ = makeSymbol("*JUSTIFICATION-COMPILATIONS*");

	// defparameter
	// tracing level for ebl module [0..5]
	/**
	 * tracing level for ebl module [0..5]
	 */
	@LispMethod(comment = "tracing level for ebl module [0..5]\ndefparameter")
	public static final SubLSymbol $ebl_trace$ = makeSymbol("*EBL-TRACE*");

	// defparameter
	// Do we allow skolemization during forward inference?
	/**
	 * Do we allow skolemization during forward inference?
	 */
	@LispMethod(comment = "Do we allow skolemization during forward inference?\ndefparameter")
	public static final SubLSymbol $allow_forward_skolemization$ = makeSymbol("*ALLOW-FORWARD-SKOLEMIZATION*");

	// defparameter
	/**
	 * Do we prefer skolemization during forward inference? This option will make
	 * forward inference tend not to unify to existing NARTs so that new NARTs can
	 * be created if they would come into existence (see nat-lookup-pos-preference.)
	 */
	@LispMethod(comment = "Do we prefer skolemization during forward inference? This option will make\r\nforward inference tend not to unify to existing NARTs so that new NARTs can\r\nbe created if they would come into existence (see nat-lookup-pos-preference.)\ndefparameter\nDo we prefer skolemization during forward inference? This option will make\nforward inference tend not to unify to existing NARTs so that new NARTs can\nbe created if they would come into existence (see nat-lookup-pos-preference.)")
	public static final SubLSymbol $prefer_forward_skolemization$ = makeSymbol("*PREFER-FORWARD-SKOLEMIZATION*");

	// defparameter
	/**
	 * Do we check for and reject unifications where a variable appears in its own
	 * binding?
	 */
	@LispMethod(comment = "Do we check for and reject unifications where a variable appears in its own\r\nbinding?\ndefparameter\nDo we check for and reject unifications where a variable appears in its own\nbinding?")
	public static final SubLSymbol $perform_unification_occurs_check$ = makeSymbol("*PERFORM-UNIFICATION-OCCURS-CHECK*");

	// defparameter
	// Do we use #$equals assertions within term unification?
	/**
	 * Do we use #$equals assertions within term unification?
	 */
	@LispMethod(comment = "Do we use #$equals assertions within term unification?\ndefparameter")
	public static final SubLSymbol $perform_equals_unification$ = makeSymbol("*PERFORM-EQUALS-UNIFICATION*");

	// defparameter
	// Do we allow backward gafs?
	/**
	 * Do we allow backward gafs?
	 */
	@LispMethod(comment = "Do we allow backward gafs?\ndefparameter")
	public static final SubLSymbol $allow_backward_gafs$ = makeSymbol("*ALLOW-BACKWARD-GAFS*");

	// defparameter
	// The direction to use for cached ask results.
	/**
	 * The direction to use for cached ask results.
	 */
	@LispMethod(comment = "The direction to use for cached ask results.\ndefparameter")
	public static final SubLSymbol $cached_ask_result_direction$ = makeSymbol("*CACHED-ASK-RESULT-DIRECTION*");

	// defparameter
	// Do we check for circularly justified assertions?
	/**
	 * Do we check for circularly justified assertions?
	 */
	@LispMethod(comment = "Do we check for circularly justified assertions?\ndefparameter")
	public static final SubLSymbol $check_for_circular_justs$ = makeSymbol("*CHECK-FOR-CIRCULAR-JUSTS*");

	// defparameter
	// Do we ignore deductions for gafs which are already trivially derivable?
	/**
	 * Do we ignore deductions for gafs which are already trivially derivable?
	 */
	@LispMethod(comment = "Do we ignore deductions for gafs which are already trivially derivable?\ndefparameter")
	public static final SubLSymbol $filter_deductions_for_trivially_derivable_gafs$ = makeSymbol("*FILTER-DEDUCTIONS-FOR-TRIVIALLY-DERIVABLE-GAFS*");

	// defparameter
	// Whether the inference engine is to be run in debug mode.
	/**
	 * Whether the inference engine is to be run in debug mode.
	 */
	@LispMethod(comment = "Whether the inference engine is to be run in debug mode.\ndefparameter")
	public static final SubLSymbol $inference_debugP$ = makeSymbol("*INFERENCE-DEBUG?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $inference_trace_level$ = makeSymbol("*INFERENCE-TRACE-LEVEL*");

	// defvar
	/**
	 * Whether forward inferences will be browsable. If NIL, they will be destroyed
	 * after use, along with their problem stores. If T, problem store destruction
	 * may never happen for many problem stores--BE CAREFUL
	 */
	@LispMethod(comment = "Whether forward inferences will be browsable. If NIL, they will be destroyed\r\nafter use, along with their problem stores. If T, problem store destruction\r\nmay never happen for many problem stores--BE CAREFUL\ndefvar\nWhether forward inferences will be browsable. If NIL, they will be destroyed\nafter use, along with their problem stores. If T, problem store destruction\nmay never happen for many problem stores--BE CAREFUL")
	public static final SubLSymbol $browse_forward_inferencesP$ = makeSymbol("*BROWSE-FORWARD-INFERENCES?*");

	// defparameter
	// The query properties that should be inherited by recursive queries.
	/**
	 * The query properties that should be inherited by recursive queries.
	 */
	@LispMethod(comment = "The query properties that should be inherited by recursive queries.\ndefparameter")
	public static final SubLSymbol $query_properties_inherited_by_recursive_queries$ = makeSymbol("*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*");

	// defparameter
	// Are we using the inference engine as a proof-checker?
	/**
	 * Are we using the inference engine as a proof-checker?
	 */
	@LispMethod(comment = "Are we using the inference engine as a proof-checker?\ndefparameter")
	public static final SubLSymbol $proof_checking_enabled$ = makeSymbol("*PROOF-CHECKING-ENABLED*");

	// defparameter
	// allowable rules
	/**
	 * allowable rules
	 */
	@LispMethod(comment = "allowable rules\ndefparameter")
	public static final SubLSymbol $proof_checker_rules$ = makeSymbol("*PROOF-CHECKER-RULES*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $inference_propagate_mt_scope$ = makeSymbol("*INFERENCE-PROPAGATE-MT-SCOPE*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $inference_current_node_mt_scope$ = makeSymbol("*INFERENCE-CURRENT-NODE-MT-SCOPE*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $inference_literal$ = makeSymbol("*INFERENCE-LITERAL*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $inference_sense$ = makeSymbol("*INFERENCE-SENSE*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $inference_arg$ = makeSymbol("*INFERENCE-ARG*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $inference_more_supports$ = makeSymbol("*INFERENCE-MORE-SUPPORTS*");

	// defparameter
	// Axioms specified by #$highlyRelevantAssertion.
	/**
	 * Axioms specified by #$highlyRelevantAssertion.
	 */
	@LispMethod(comment = "Axioms specified by #$highlyRelevantAssertion.\ndefparameter")
	public static final SubLSymbol $inference_highly_relevant_assertions$ = makeSymbol("*INFERENCE-HIGHLY-RELEVANT-ASSERTIONS*");

	// defparameter
	// Microtheories specified by highlyRelevantMt.
	/**
	 * Microtheories specified by highlyRelevantMt.
	 */
	@LispMethod(comment = "Microtheories specified by highlyRelevantMt.\ndefparameter")
	public static final SubLSymbol $inference_highly_relevant_mts$ = makeSymbol("*INFERENCE-HIGHLY-RELEVANT-MTS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $within_hl_failure_backchainingP$ = makeSymbol("*WITHIN-HL-FAILURE-BACKCHAINING?*");

	// defparameter
	// Do we backchain on evaluatable predicates?
	/**
	 * Do we backchain on evaluatable predicates?
	 */
	@LispMethod(comment = "Do we backchain on evaluatable predicates?\ndefparameter")
	public static final SubLSymbol $evaluatable_backchain_enabled$ = makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $default_removal_cost_cutoff$ = makeSymbol("*DEFAULT-REMOVAL-COST-CUTOFF*");

	// defparameter
	// How expensive a removal do we allow (NIL for no restriction).
	/**
	 * How expensive a removal do we allow (NIL for no restriction).
	 */
	@LispMethod(comment = "How expensive a removal do we allow (NIL for no restriction).\ndefparameter")
	public static final SubLSymbol $removal_cost_cutoff$ = makeSymbol("*REMOVAL-COST-CUTOFF*");

	// defparameter
	/**
	 * How expensive a removal do we allow during forward inference (NIL for no
	 * restriction).
	 */
	@LispMethod(comment = "How expensive a removal do we allow during forward inference (NIL for no\r\nrestriction).\ndefparameter\nHow expensive a removal do we allow during forward inference (NIL for no\nrestriction).")
	public static final SubLSymbol $forward_inference_removal_cost_cutoff$ = makeSymbol("*FORWARD-INFERENCE-REMOVAL-COST-CUTOFF*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $application_filtering_enabled$ = makeSymbol("*APPLICATION-FILTERING-ENABLED*");

	// defparameter
	/**
	 * When a goal node is rejected, do we mark all its semantically invalid
	 * ancestors as doomed, thereby cutting off large chunks of search which will
	 * fail.
	 */
	@LispMethod(comment = "When a goal node is rejected, do we mark all its semantically invalid\r\nancestors as doomed, thereby cutting off large chunks of search which will\r\nfail.\ndefparameter\nWhen a goal node is rejected, do we mark all its semantically invalid\nancestors as doomed, thereby cutting off large chunks of search which will\nfail.")
	public static final SubLSymbol $marking_doomed_inference_ancestors$ = makeSymbol("*MARKING-DOOMED-INFERENCE-ANCESTORS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $inference_search_strategy$ = makeSymbol("*INFERENCE-SEARCH-STRATEGY*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $unique_inference_result_bindings$ = makeSymbol("*UNIQUE-INFERENCE-RESULT-BINDINGS*");

	// defparameter
	/**
	 * The handler function to use when generating the results to return from
	 * inference searches.
	 */
	@LispMethod(comment = "The handler function to use when generating the results to return from\r\ninference searches.\ndefparameter\nThe handler function to use when generating the results to return from\ninference searches.")
	public static final SubLSymbol $inference_answer_handler$ = makeSymbol("*INFERENCE-ANSWER-HANDLER*");

	// defparameter
	// The cost value used for performing an HL module simplification step.
	/**
	 * The cost value used for performing an HL module simplification step.
	 */
	@LispMethod(comment = "The cost value used for performing an HL module simplification step.\ndefparameter")
	public static final SubLSymbol $hl_module_simplification_cost$ = makeSymbol("*HL-MODULE-SIMPLIFICATION-COST*");

	// defparameter
	// The cost value used for performing fully-bound HL module checks.
	/**
	 * The cost value used for performing fully-bound HL module checks.
	 */
	@LispMethod(comment = "The cost value used for performing fully-bound HL module checks.\ndefparameter")
	public static final SubLSymbol $hl_module_check_cost$ = makeSymbol("*HL-MODULE-CHECK-COST*");

	// deflexical
	// The cost value used for performing cheap fully-bound HL module checks.
	/**
	 * The cost value used for performing cheap fully-bound HL module checks.
	 */
	@LispMethod(comment = "The cost value used for performing cheap fully-bound HL module checks.\ndeflexical")
	public static final SubLSymbol $cheap_hl_module_check_cost$ = makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*");

	// deflexical
	// The cost value used for performing typical fully-bound HL module checks.
	/**
	 * The cost value used for performing typical fully-bound HL module checks.
	 */
	@LispMethod(comment = "The cost value used for performing typical fully-bound HL module checks.\ndeflexical")
	public static final SubLSymbol $typical_hl_module_check_cost$ = makeSymbol("*TYPICAL-HL-MODULE-CHECK-COST*");

	// deflexical
	/**
	 * The cost value used for performing expensive fully-bound HL module checks.
	 */
	@LispMethod(comment = "The cost value used for performing expensive fully-bound HL module checks.\ndeflexical")
	public static final SubLSymbol $expensive_hl_module_check_cost$ = makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*");

	// deflexical
	// The cost value used for performing expensive HL module generations.
	/**
	 * The cost value used for performing expensive HL module generations.
	 */
	@LispMethod(comment = "The cost value used for performing expensive HL module generations.\ndeflexical")
	public static final SubLSymbol $expensive_hl_module_singleton_generate_cost$ = makeSymbol("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*");

	// defparameter
	/**
	 * When non-nil, the maximum cost value allowable for fully-bound HL module
	 * checks.
	 */
	@LispMethod(comment = "When non-nil, the maximum cost value allowable for fully-bound HL module\r\nchecks.\ndefparameter\nWhen non-nil, the maximum cost value allowable for fully-bound HL module\nchecks.")
	public static final SubLSymbol $maximum_hl_module_check_cost$ = makeSymbol("*MAXIMUM-HL-MODULE-CHECK-COST*");

	// defparameter
	// An estimate of the total number of types for the average term.
	/**
	 * An estimate of the total number of types for the average term.
	 */
	@LispMethod(comment = "An estimate of the total number of types for the average term.\ndefparameter")
	public static final SubLSymbol $average_all_isa_count$ = makeSymbol("*AVERAGE-ALL-ISA-COUNT*");

	// defparameter
	/**
	 * An estimate of the total number of superclasses for the average collection.
	 */
	@LispMethod(comment = "An estimate of the total number of superclasses for the average collection.\ndefparameter")
	public static final SubLSymbol $average_all_genls_count$ = makeSymbol("*AVERAGE-ALL-GENLS-COUNT*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $pgia_activeP$ = makeSymbol("*PGIA-ACTIVE?*");

	// defparameter
	// Global control of whether we ever allow any the-term reasoning at all.
	/**
	 * Global control of whether we ever allow any the-term reasoning at all.
	 */
	@LispMethod(comment = "Global control of whether we ever allow any the-term reasoning at all.\ndefparameter")
	public static final SubLSymbol $the_term_inference_enabled$ = makeSymbol("*THE-TERM-INFERENCE-ENABLED*");

	// defparameter
	/**
	 * Controls whether the unifier treats the-terms as variables. Should always be
	 * globally NIL and bound to T by the-term inference methods.
	 */
	@LispMethod(comment = "Controls whether the unifier treats the-terms as variables. Should always be\r\nglobally NIL and bound to T by the-term inference methods.\ndefparameter\nControls whether the unifier treats the-terms as variables. Should always be\nglobally NIL and bound to T by the-term inference methods.")
	public static final SubLSymbol $allow_the_term_unification$ = makeSymbol("*ALLOW-THE-TERM-UNIFICATION*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $inference_the_term_bindings$ = makeSymbol("*INFERENCE-THE-TERM-BINDINGS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $the_term_qua_constant$ = makeSymbol("*THE-TERM-QUA-CONSTANT*");

	// defparameter
	// Determines whether or not External HL module inferencing is enabled.
	/**
	 * Determines whether or not External HL module inferencing is enabled.
	 */
	@LispMethod(comment = "Determines whether or not External HL module inferencing is enabled.\ndefparameter")
	public static final SubLSymbol $external_inference_enabled$ = makeSymbol("*EXTERNAL-INFERENCE-ENABLED*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $suppress_conflict_noticesP$ = makeSymbol("*SUPPRESS-CONFLICT-NOTICES?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $ignore_conflictsP$ = makeSymbol("*IGNORE-CONFLICTS?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $ignore_non_definitional_conflictsP$ = makeSymbol("*IGNORE-NON-DEFINITIONAL-CONFLICTS?*");

	// defparameter
	// Do we treat semantically invalid deductions as conflicts?
	/**
	 * Do we treat semantically invalid deductions as conflicts?
	 */
	@LispMethod(comment = "Do we treat semantically invalid deductions as conflicts?\ndefparameter")
	public static final SubLSymbol $conflicts_from_invalid_deductions$ = makeSymbol("*CONFLICTS-FROM-INVALID-DEDUCTIONS*");

	// defparameter
	/**
	 * When non-nil, sets of mutually inconsistent HL supports are stored on the
	 * variable *inconsistent-support-sets*
	 */
	@LispMethod(comment = "When non-nil, sets of mutually inconsistent HL supports are stored on the\r\nvariable *inconsistent-support-sets*\ndefparameter\nWhen non-nil, sets of mutually inconsistent HL supports are stored on the\nvariable *inconsistent-support-sets*")
	public static final SubLSymbol $record_inconsistent_support_sets$ = makeSymbol("*RECORD-INCONSISTENT-SUPPORT-SETS*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $last_agenda_op$ = makeSymbol("*LAST-AGENDA-OP*");

	// deflexical
	@LispMethod(comment = "deflexical")
	public static final SubLSymbol $last_agenda_error_message$ = makeSymbol("*LAST-AGENDA-ERROR-MESSAGE*");

	// deflexical
	/**
	 * A list - containing either one or more assertions or a list of the form
	 * (#$equals <term> <term>) - the contents of which accounts for the halting of
	 * the agenda.
	 */
	@LispMethod(comment = "A list - containing either one or more assertions or a list of the form\r\n(#$equals <term> <term>) - the contents of which accounts for the halting of\r\nthe agenda.\ndeflexical\nA list - containing either one or more assertions or a list of the form\n(#$equals <term> <term>) - the contents of which accounts for the halting of\nthe agenda.")
	public static final SubLSymbol $last_agenda_error_explanatory_supports$ = makeSymbol("*LAST-AGENDA-ERROR-EXPLANATORY-SUPPORTS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $agenda_display_fi_warnings$ = makeSymbol("*AGENDA-DISPLAY-FI-WARNINGS*");

	// defparameter
	// Do we ignore remote errors or handle them the same way as local errors?.
	/**
	 * Do we ignore remote errors or handle them the same way as local errors?.
	 */
	@LispMethod(comment = "Do we ignore remote errors or handle them the same way as local errors?.\ndefparameter")
	public static final SubLSymbol $ignore_remote_errors$ = makeSymbol("*IGNORE-REMOTE-ERRORS*");

	// deflexical
	/**
	 * Controls whether the running image will load submitted transcripts via
	 * MAYBE-LOAD-SUBMITTED-TRANSCRIPT.
	 */
	@LispMethod(comment = "Controls whether the running image will load submitted transcripts via\r\nMAYBE-LOAD-SUBMITTED-TRANSCRIPT.\ndeflexical\nControls whether the running image will load submitted transcripts via\nMAYBE-LOAD-SUBMITTED-TRANSCRIPT.")
	private static final SubLSymbol $load_submitted_transcriptsP$ = makeSymbol("*LOAD-SUBMITTED-TRANSCRIPTS?*");

	// deflexical
	/**
	 * Controls whether, when a submitted transcript is loaded, the image should
	 * notify the submitter that it is being loaded as part of a build.
	 */
	@LispMethod(comment = "Controls whether, when a submitted transcript is loaded, the image should\r\nnotify the submitter that it is being loaded as part of a build.\ndeflexical\nControls whether, when a submitted transcript is loaded, the image should\nnotify the submitter that it is being loaded as part of a build.")
	private static final SubLSymbol $send_submitted_transcript_loading_noticesP$ = makeSymbol("*SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?*");

	// defvar
	/**
	 * A string consisting of `<machine-name>-<universal-time>-<process-id>' which
	 * uniquely identifies every separate Cyc image
	 */
	@LispMethod(comment = "A string consisting of `<machine-name>-<universal-time>-<process-id>\' which\r\nuniquely identifies every separate Cyc image\ndefvar\nA string consisting of `<machine-name>-<universal-time>-<process-id>\' which\nuniquely identifies every separate Cyc image")
	public static final SubLSymbol $cyc_image_id$ = makeSymbol("*CYC-IMAGE-ID*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $use_tcp_port_in_image_id$ = makeSymbol("*USE-TCP-PORT-IN-IMAGE-ID*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $use_transcriptP$ = makeSymbol("*USE-TRANSCRIPT?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $unencapsulating_within_agenda$ = makeSymbol("*UNENCAPSULATING-WITHIN-AGENDA*");

	// defvar
	// Whether to save queries asked into a query transcript.
	/**
	 * Whether to save queries asked into a query transcript.
	 */
	@LispMethod(comment = "Whether to save queries asked into a query transcript.\ndefvar")
	public static final SubLSymbol $save_asked_queriesP$ = makeSymbol("*SAVE-ASKED-QUERIES?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $within_assert$ = makeSymbol("*WITHIN-ASSERT*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $within_unassert$ = makeSymbol("*WITHIN-UNASSERT*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $within_ask$ = makeSymbol("*WITHIN-ASK*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $within_query$ = makeSymbol("*WITHIN-QUERY*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $compute_inference_results$ = makeSymbol("*COMPUTE-INFERENCE-RESULTS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $transformation_depth_cutoff$ = makeSymbol("*TRANSFORMATION-DEPTH-CUTOFF*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $partial_semanticsP$ = makeSymbol("*PARTIAL-SEMANTICS?*");

	// defparameter
	// Insist on mass vs. count distinction for looking up noun denotations?
	/**
	 * Insist on mass vs. count distinction for looking up noun denotations?
	 */
	@LispMethod(comment = "Insist on mass vs. count distinction for looking up noun denotations?\ndefparameter")
	public static final SubLSymbol $enforce_mass_vs_countP$ = makeSymbol("*ENFORCE-MASS-VS-COUNT?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $partial_syntaxP$ = makeSymbol("*PARTIAL-SYNTAX?*");

	// deflexical
	@LispMethod(comment = "deflexical")
	private static final SubLSymbol $cb_presentation_languages$ = makeSymbol("*CB-PRESENTATION-LANGUAGES*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $show_credits$ = makeSymbol("*SHOW-CREDITS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $meta_query_start_string$ = makeSymbol("*META-QUERY-START-STRING*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $current_cache$ = makeSymbol("*CURRENT-CACHE*");

	// defvar
	// The mt within which RKF interactions are assumed.
	/**
	 * The mt within which RKF interactions are assumed.
	 */
	@LispMethod(comment = "The mt within which RKF interactions are assumed.\ndefvar")
	public static final SubLSymbol $rkf_mt$ = makeSymbol("*RKF-MT*");

	// defparameter
	// Has the db meta query init file successfully loaded, or not?
	/**
	 * Has the db meta query init file successfully loaded, or not?
	 */
	@LispMethod(comment = "Has the db meta query init file successfully loaded, or not?\ndefparameter")
	public static final SubLSymbol $dbm_init_file_loadedP$ = makeSymbol("*DBM-INIT-FILE-LOADED?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $dbm_cache_loading_startedP$ = makeSymbol("*DBM-CACHE-LOADING-STARTED?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $dbm_cache_loading_finishedP$ = makeSymbol("*DBM-CACHE-LOADING-FINISHED?*");

	// defparameter
	// This tag will be inserted into every Janus operation that is logged.
	/**
	 * This tag will be inserted into every Janus operation that is logged.
	 */
	@LispMethod(comment = "This tag will be inserted into every Janus operation that is logged.\ndefparameter")
	public static final SubLSymbol $janus_tag$ = makeSymbol("*JANUS-TAG*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $janus_new_constants$ = makeSymbol("*JANUS-NEW-CONSTANTS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $janus_test_case_loggingP$ = makeSymbol("*JANUS-TEST-CASE-LOGGING?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $janus_operations$ = makeSymbol("*JANUS-OPERATIONS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $janus_extraction_deduce_specs$ = makeSymbol("*JANUS-EXTRACTION-DEDUCE-SPECS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $janus_within_somethingP$ = makeSymbol("*JANUS-WITHIN-SOMETHING?*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $janus_testing_deduce_specs$ = makeSymbol("*JANUS-TESTING-DEDUCE-SPECS*");

	// defparameter
	@LispMethod(comment = "defparameter")
	public static final SubLSymbol $janus_test_case_runningP$ = makeSymbol("*JANUS-TEST-CASE-RUNNING?*");

	// defvar
	@LispMethod(comment = "defvar")
	public static final SubLSymbol $ask_quirkP$ = makeSymbol("*ASK-QUIRK?*");

	// defparameter
	/**
	 * When non-nil, the inferences and problem-stores generated by KBQ-RUN-QUERY
	 * are auto-destroyed.
	 */
	@LispMethod(comment = "When non-nil, the inferences and problem-stores generated by KBQ-RUN-QUERY\r\nare auto-destroyed.\ndefparameter\nWhen non-nil, the inferences and problem-stores generated by KBQ-RUN-QUERY\nare auto-destroyed.")
	public static final SubLSymbol $kbq_run_query_auto_destroy_enabledP$ = makeSymbol("*KBQ-RUN-QUERY-AUTO-DESTROY-ENABLED?*");

	// defparameter
	/**
	 * When non-nil, the inferences generated by KBQ-RUN-QUERY are always run with
	 * :continuable? NIL since they won't ever be continued.
	 */
	@LispMethod(comment = "When non-nil, the inferences generated by KBQ-RUN-QUERY are always run with\r\n:continuable? NIL since they won\'t ever be continued.\ndefparameter\nWhen non-nil, the inferences generated by KBQ-RUN-QUERY are always run with\n:continuable? NIL since they won\'t ever be continued.")
	public static final SubLSymbol $kbq_run_query_non_continuable_enabledP$ = makeSymbol("*KBQ-RUN-QUERY-NON-CONTINUABLE-ENABLED?*");

	// defvar
	@LispMethod(comment = "defvar")
	public static final SubLSymbol $kbq_run_query_practice_modeP$ = makeSymbol("*KBQ-RUN-QUERY-PRACTICE-MODE?*");

	// Internal Constants
	@LispMethod(comment = "Internal Constants")
	public static final SubLSymbol $table_area$ = makeSymbol("*TABLE-AREA*");

	public static final SubLSymbol $hl_lock$ = makeSymbol("*HL-LOCK*");

	static private final SubLString $$$HL_Store_Lock = makeString("HL Store Lock");

	static private final SubLList $list4 = list(makeSymbol("*HL-LOCK*"));

	static private final SubLString $$$KEYWORD = makeString("KEYWORD");

	static private final SubLString $$$SUBLISP = makeString("SUBLISP");

	static private final SubLString $$$CYC = makeString("CYC");

	private static final SubLString $str9$Symbol__S_from_package__S_is_not_ = makeString("Symbol ~S from package ~S is not visible to SubL.");

	private static final SubLString $$$_ = makeString(" ");

	private static final SubLList $list13 = list(makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));

	public static final SubLSymbol $hl_failure_backchaining$ = makeSymbol("*HL-FAILURE-BACKCHAINING*");

	private static final SubLString $$$Enable_HL_predicate_backchaining = makeString("Enable HL predicate backchaining");

	private static final SubLString $str16$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow backchaining on those predicates \nwhich have dedicated HL module support, such as #$isa, #$genls and #$equals.");

	private static final SubLList $list17 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes (expensive)")));

	public static final SubLSymbol $negation_by_failure$ = makeSymbol("*NEGATION-BY-FAILURE*");

	private static final SubLString $$$Enable_negation_by_failure = makeString("Enable negation by failure");

	private static final SubLString $str20$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");

	private static final SubLList $list21 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes")));

	public static final SubLSymbol $complete_extent_minimization$ = makeSymbol("*COMPLETE-EXTENT-MINIMIZATION*");

	private static final SubLString $str23$Enable_complete_extent_minimizati = makeString("Enable complete extent minimization");

	private static final SubLString $str24$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");

	public static final SubLSymbol $unbound_rule_backchain_enabled$ = makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*");

	private static final SubLString $str26$Enable_unbound_predicate_rule_bac = makeString("Enable unbound predicate rule backchaining");

	private static final SubLString $str27$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow backchaining with rules\nthat conclude literals whose predicate position is unbound.\nMany type-level predicates have defining axioms of this form.");

	private static final SubLInteger $int$100000 = makeInteger(100000);

	private static final SubLSymbol INFERENCE_RETURN_BLISTS = makeSymbol("INFERENCE-RETURN-BLISTS");

	private static final SubLFloat $float$0_1 = makeDouble(0.1);

	private static final SubLFloat $float$0_5 = makeDouble(0.5);

	private static final SubLFloat $float$1_0 = makeDouble(1.0);

	private static final SubLFloat $float$1_5 = makeDouble(1.5);

	public static final SubLSymbol $auto_increment_kb$ = makeSymbol("*AUTO-INCREMENT-KB*");

	private static final SubLString $$$UNKNOWN = makeString("UNKNOWN");

	private static final SubLString $str40$_ = makeString("-");

	private static final SubLString $str41$ = makeString("");

	private static final SubLString $str42$_a__a_a__a = makeString("~a-~a~a-~a");

	private static final SubLSymbol $build_kb_loaded$ = makeSymbol("*BUILD-KB-LOADED*");

	private static final SubLSymbol $kb_loaded$ = makeSymbol("*KB-LOADED*");

	private static final SubLInteger $int$10000 = makeInteger(10000);

	public static final SubLSymbol $kb_pedigree$ = makeSymbol("*KB-PEDIGREE*");

	public static final SubLSymbol $run_own_operationsP$ = makeSymbol("*RUN-OWN-OPERATIONS?*");

	public static final SubLSymbol $caught_up_on_master_transcript$ = makeSymbol("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*");

	public static final SubLSymbol $communication_mode$ = makeSymbol("*COMMUNICATION-MODE*");

	public static final SubLSymbol $init_file_loadedP$ = makeSymbol("*INIT-FILE-LOADED?*");

	public static final SubLSymbol $cache_inference_results$ = makeSymbol("*CACHE-INFERENCE-RESULTS*");

	private static final SubLString $$$Cache_backward_query_results = makeString("Cache backward query results");

	private static final SubLString $str57$This_controls_whether_the_results = makeString("This controls whether the results of successful backward queries are cached in the KB.");

	private static final SubLSymbol $lexicon_initializedP$ = makeSymbol("*LEXICON-INITIALIZED?*");

	private static final SubLList $list59 = list($CYCL, makeKeyword("NL"), makeKeyword("FOL"), $SILK);

	public static final SubLSymbol $cb_major_presentation_language$ = makeSymbol("*CB-MAJOR-PRESENTATION-LANGUAGE*");

	private static final SubLList $list63 = list(makeSymbol("CAND"), list(makeSymbol("FWHEN-FEATURE"), makeKeyword("CYC-HALO"), T), list(EQ, $SILK, makeSymbol("*CB-MAJOR-PRESENTATION-LANGUAGE*")));

	private static final SubLList $list65 = list(makeSymbol("CB-SILK-PRESENTATION-LANGUAGE?"));

	public static final SubLSymbol $assume_cyc_cyclist_dialogP$ = makeSymbol("*ASSUME-CYC-CYCLIST-DIALOG?*");

	public static final SubLSymbol $generated_phrases_browsableP$ = makeSymbol("*GENERATED-PHRASES-BROWSABLE?*");

	public static final SubLSymbol $highlight_demerits_in_generated_phrasesP$ = makeSymbol("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*");

	public static final SubLSymbol $cb_paraphrase_mt$ = makeSymbol("*CB-PARAPHRASE-MT*");

	public static final SubLSymbol $show_fet_edit_buttonsP$ = makeSymbol("*SHOW-FET-EDIT-BUTTONS?*");

	public static final SubLSymbol $show_fet_create_instance_buttonsP$ = makeSymbol("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*");

	public static final SubLSymbol $show_fet_create_spec_buttonsP$ = makeSymbol("*SHOW-FET-CREATE-SPEC-BUTTONS?*");

	public static final SubLSymbol $cb_literal_query_results_one_per_lineP$ = makeSymbol("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*");

	public static final SubLSymbol $cb_skolem_applicable_relationsP$ = makeSymbol("*CB-SKOLEM-APPLICABLE-RELATIONS?*");

	public static final SubLSymbol $cb_applicable_relations_one_per_lineP$ = makeSymbol("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*");

	public static final SubLSymbol $cb_paraphrase_applicable_relationsP$ = makeSymbol("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*");

	public static final SubLSymbol $browse_in_meta_query_modeP$ = makeSymbol("*BROWSE-IN-META-QUERY-MODE?*");

	public static final SubLSymbol $wordnet_initializedP$ = makeSymbol("*WORDNET-INITIALIZED?*");

	public static final SubLSymbol $use_wn_linksP$ = makeSymbol("*USE-WN-LINKS?*");

	public static final SubLSymbol $acip_subkernel_extraction$ = makeSymbol("*ACIP-SUBKERNEL-EXTRACTION*");

	public static final SubLSymbol $acip_subkernel_output_stream$ = makeSymbol("*ACIP-SUBKERNEL-OUTPUT-STREAM*");

	static final boolean assertionsDisabledSynth = true;

	public static final SubLObject within_hl_modification_alt(SubLObject macroform, SubLObject environment) {
		{
			SubLObject datum = macroform.rest();
			SubLObject current = datum;
			SubLObject body = current;
			return listS(WITH_LOCK_HELD, $list_alt4, append(body, NIL));
		}
	}

	public static SubLObject within_hl_modification(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(WITH_LOCK_HELD, $list4, append(body, NIL));
	}

	public static SubLObject subl_symbol_package(final SubLObject symbol) {
		assert NIL != symbolp(symbol) : "! symbolp(symbol) " + ("Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) ") + symbol;
		if (symbol.isKeyword()) {
			return $keyword_package$.getGlobalValue();
		}
		final SubLObject v_package = symbol_package(symbol);
		if (NIL == v_package) {
			return NIL;
		}
		final SubLObject name = symbol_name(symbol);
		if (symbol.eql(find_symbol(name, $sublisp_package$.getGlobalValue()))) {
			return $sublisp_package$.getGlobalValue();
		}
		if (symbol.eql(find_symbol(name, $cyc_package$.getGlobalValue()))) {
			return $cyc_package$.getGlobalValue();
		}
		return Errors.error($str9$Symbol__S_from_package__S_is_not_, symbol, v_package);
	}

	public static final SubLObject mapping_funcall_arg_alt(SubLObject arg, SubLObject n) {
		if (n == UNPROVIDED) {
			n = $mapping_fn_arg$.getDynamicValue();
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = NIL;
				SubLObject pcase_var = n;
				if (pcase_var.eql(ONE_INTEGER)) {
					{
						SubLObject _prev_bind_0 = $mapping_fn_arg1$.currentBinding(thread);
						try {
							$mapping_fn_arg1$.bind(arg, thread);
							result = mapping_funcall_int();
						} finally {
							$mapping_fn_arg1$.rebind(_prev_bind_0, thread);
						}
					}
				} else {
					if (pcase_var.eql(TWO_INTEGER)) {
						{
							SubLObject _prev_bind_0 = $mapping_fn_arg2$.currentBinding(thread);
							try {
								$mapping_fn_arg2$.bind(arg, thread);
								result = mapping_funcall_int();
							} finally {
								$mapping_fn_arg2$.rebind(_prev_bind_0, thread);
							}
						}
					} else {
						if (pcase_var.eql(THREE_INTEGER)) {
							{
								SubLObject _prev_bind_0 = $mapping_fn_arg3$.currentBinding(thread);
								try {
									$mapping_fn_arg3$.bind(arg, thread);
									result = mapping_funcall_int();
								} finally {
									$mapping_fn_arg3$.rebind(_prev_bind_0, thread);
								}
							}
						} else {
							if (pcase_var.eql(FOUR_INTEGER)) {
								{
									SubLObject _prev_bind_0 = $mapping_fn_arg4$.currentBinding(thread);
									try {
										$mapping_fn_arg4$.bind(arg, thread);
										result = mapping_funcall_int();
									} finally {
										$mapping_fn_arg4$.rebind(_prev_bind_0, thread);
									}
								}
							} else {
								if (pcase_var.eql(FIVE_INTEGER)) {
									{
										SubLObject _prev_bind_0 = $mapping_fn_arg5$.currentBinding(thread);
										try {
											$mapping_fn_arg5$.bind(arg, thread);
											result = mapping_funcall_int();
										} finally {
											$mapping_fn_arg5$.rebind(_prev_bind_0, thread);
										}
									}
								} else {
									if (pcase_var.eql(SIX_INTEGER)) {
										{
											SubLObject _prev_bind_0 = $mapping_fn_arg6$.currentBinding(thread);
											try {
												$mapping_fn_arg6$.bind(arg, thread);
												result = mapping_funcall_int();
											} finally {
												$mapping_fn_arg6$.rebind(_prev_bind_0, thread);
											}
										}
									} else {
										if (pcase_var.eql(SEVEN_INTEGER)) {
											{
												SubLObject _prev_bind_0 = $mapping_fn_arg7$.currentBinding(thread);
												try {
													$mapping_fn_arg7$.bind(arg, thread);
													result = mapping_funcall_int();
												} finally {
													$mapping_fn_arg7$.rebind(_prev_bind_0, thread);
												}
											}
										} else {
											if (pcase_var.eql(EIGHT_INTEGER)) {
												{
													SubLObject _prev_bind_0 = $mapping_fn_arg8$.currentBinding(thread);
													try {
														$mapping_fn_arg8$.bind(arg, thread);
														result = mapping_funcall_int();
													} finally {
														$mapping_fn_arg8$.rebind(_prev_bind_0, thread);
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
				return result;
			}
		}
	}

	public static SubLObject mapping_funcall_arg(final SubLObject arg, SubLObject n) {
		if (n == UNPROVIDED) {
			n = $mapping_fn_arg$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		final SubLObject pcase_var = n;
		if (pcase_var.eql(ONE_INTEGER)) {
			final SubLObject _prev_bind_0 = $mapping_fn_arg1$.currentBinding(thread);
			try {
				$mapping_fn_arg1$.bind(arg, thread);
				result = mapping_funcall_int();
			} finally {
				$mapping_fn_arg1$.rebind(_prev_bind_0, thread);
			}
		} else if (pcase_var.eql(TWO_INTEGER)) {
			final SubLObject _prev_bind_0 = $mapping_fn_arg2$.currentBinding(thread);
			try {
				$mapping_fn_arg2$.bind(arg, thread);
				result = mapping_funcall_int();
			} finally {
				$mapping_fn_arg2$.rebind(_prev_bind_0, thread);
			}
		} else if (pcase_var.eql(THREE_INTEGER)) {
			final SubLObject _prev_bind_0 = $mapping_fn_arg3$.currentBinding(thread);
			try {
				$mapping_fn_arg3$.bind(arg, thread);
				result = mapping_funcall_int();
			} finally {
				$mapping_fn_arg3$.rebind(_prev_bind_0, thread);
			}
		} else if (pcase_var.eql(FOUR_INTEGER)) {
			final SubLObject _prev_bind_0 = $mapping_fn_arg4$.currentBinding(thread);
			try {
				$mapping_fn_arg4$.bind(arg, thread);
				result = mapping_funcall_int();
			} finally {
				$mapping_fn_arg4$.rebind(_prev_bind_0, thread);
			}
		} else if (pcase_var.eql(FIVE_INTEGER)) {
			final SubLObject _prev_bind_0 = $mapping_fn_arg5$.currentBinding(thread);
			try {
				$mapping_fn_arg5$.bind(arg, thread);
				result = mapping_funcall_int();
			} finally {
				$mapping_fn_arg5$.rebind(_prev_bind_0, thread);
			}
		} else if (pcase_var.eql(SIX_INTEGER)) {
			final SubLObject _prev_bind_0 = $mapping_fn_arg6$.currentBinding(thread);
			try {
				$mapping_fn_arg6$.bind(arg, thread);
				result = mapping_funcall_int();
			} finally {
				$mapping_fn_arg6$.rebind(_prev_bind_0, thread);
			}
		} else if (pcase_var.eql(SEVEN_INTEGER)) {
			final SubLObject _prev_bind_0 = $mapping_fn_arg7$.currentBinding(thread);
			try {
				$mapping_fn_arg7$.bind(arg, thread);
				result = mapping_funcall_int();
			} finally {
				$mapping_fn_arg7$.rebind(_prev_bind_0, thread);
			}
		} else if (pcase_var.eql(EIGHT_INTEGER)) {
			final SubLObject _prev_bind_0 = $mapping_fn_arg8$.currentBinding(thread);
			try {
				$mapping_fn_arg8$.bind(arg, thread);
				result = mapping_funcall_int();
			} finally {
				$mapping_fn_arg8$.rebind(_prev_bind_0, thread);
			}
		}

		return result;
	}

	public static final SubLObject mapping_funcall_int_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != unprovided_argumentP($mapping_fn$.getDynamicValue(thread))) {
			} else {
				if (NIL != unprovided_argumentP($mapping_fn_arg2$.getDynamicValue(thread))) {
					return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread));
				} else {
					if (NIL != unprovided_argumentP($mapping_fn_arg3$.getDynamicValue(thread))) {
						return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread));
					} else {
						if (NIL != unprovided_argumentP($mapping_fn_arg4$.getDynamicValue(thread))) {
							return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread));
						} else {
							if (NIL != unprovided_argumentP($mapping_fn_arg5$.getDynamicValue(thread))) {
								return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread));
							} else {
								if (NIL != unprovided_argumentP($mapping_fn_arg6$.getDynamicValue(thread))) {
									return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread));
								} else {
									if (NIL != unprovided_argumentP($mapping_fn_arg7$.getDynamicValue(thread))) {
										return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread), $mapping_fn_arg6$.getDynamicValue(thread));
									} else {
										if (NIL != unprovided_argumentP($mapping_fn_arg8$.getDynamicValue(thread))) {
											return funcall($mapping_fn$.getDynamicValue(thread), new SubLObject[] { $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread), $mapping_fn_arg6$.getDynamicValue(thread), $mapping_fn_arg7$.getDynamicValue(thread) });
										} else {
											return funcall($mapping_fn$.getDynamicValue(thread),
													new SubLObject[] { $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread), $mapping_fn_arg6$.getDynamicValue(thread), $mapping_fn_arg7$.getDynamicValue(thread), $mapping_fn_arg8$.getDynamicValue(thread) });
										}
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

	public static SubLObject mapping_funcall_int() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != unprovided_argumentP($mapping_fn$.getDynamicValue(thread))) {
			return NIL;
		}
		if (NIL != unprovided_argumentP($mapping_fn_arg2$.getDynamicValue(thread))) {
			return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread));
		}
		if (NIL != unprovided_argumentP($mapping_fn_arg3$.getDynamicValue(thread))) {
			return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread));
		}
		if (NIL != unprovided_argumentP($mapping_fn_arg4$.getDynamicValue(thread))) {
			return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread));
		}
		if (NIL != unprovided_argumentP($mapping_fn_arg5$.getDynamicValue(thread))) {
			return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread));
		}
		if (NIL != unprovided_argumentP($mapping_fn_arg6$.getDynamicValue(thread))) {
			return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread));
		}
		if (NIL != unprovided_argumentP($mapping_fn_arg7$.getDynamicValue(thread))) {
			return funcall($mapping_fn$.getDynamicValue(thread), $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread), $mapping_fn_arg6$.getDynamicValue(thread));
		}
		if (NIL != unprovided_argumentP($mapping_fn_arg8$.getDynamicValue(thread))) {
			return funcall($mapping_fn$.getDynamicValue(thread), new SubLObject[] { $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread), $mapping_fn_arg6$.getDynamicValue(thread), $mapping_fn_arg7$.getDynamicValue(thread) });
		}
		return funcall($mapping_fn$.getDynamicValue(thread),
				new SubLObject[] { $mapping_fn_arg1$.getDynamicValue(thread), $mapping_fn_arg2$.getDynamicValue(thread), $mapping_fn_arg3$.getDynamicValue(thread), $mapping_fn_arg4$.getDynamicValue(thread), $mapping_fn_arg5$.getDynamicValue(thread), $mapping_fn_arg6$.getDynamicValue(thread), $mapping_fn_arg7$.getDynamicValue(thread), $mapping_fn_arg8$.getDynamicValue(thread) });
	}

	public static final SubLObject inference_warn_alt(SubLObject format_string, SubLObject arg1, SubLObject arg2) {
		if (arg1 == UNPROVIDED) {
			arg1 = NIL;
		}
		if (arg2 == UNPROVIDED) {
			arg2 = NIL;
		}
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			if (NIL != $inference_debugP$.getDynamicValue(thread)) {
				return Errors.error(format_string, arg1, arg2);
			} else {
				return Errors.warn(format_string, arg1, arg2);
			}
		}
	}

	public static SubLObject inference_warn(final SubLObject format_string, SubLObject arg1, SubLObject arg2) {
		if (arg1 == UNPROVIDED) {
			arg1 = NIL;
		}
		if (arg2 == UNPROVIDED) {
			arg2 = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != $inference_debugP$.getDynamicValue(thread)) {
			return Errors.error(format_string, arg1, arg2);
		}
		return Errors.warn(format_string, arg1, arg2);
	}

	public static final SubLObject browse_forward_inferencesP_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $browse_forward_inferencesP$.getDynamicValue(thread);
		}
	}

	public static SubLObject browse_forward_inferencesP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $browse_forward_inferencesP$.getDynamicValue(thread);
	}

	public static final SubLObject the_term_qua_constantP_alt(SubLObject v_term) {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return subl_promotions.memberP(v_term, $the_term_qua_constant$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		}
	}

	public static SubLObject the_term_qua_constantP(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return subl_promotions.memberP(v_term, $the_term_qua_constant$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
	}

	/**
	 * Accessor for *auto-increment-kb*.
	 */
	@LispMethod(comment = "Accessor for *auto-increment-kb*.")
	public static final SubLObject auto_increment_kb_alt() {
		return $auto_increment_kb$.getGlobalValue();
	}

	/**
	 * Accessor for *auto-increment-kb*.
	 */
	@LispMethod(comment = "Accessor for *auto-increment-kb*.")
	public static SubLObject auto_increment_kb() {
		return $auto_increment_kb$.getGlobalValue();
	}

	public static final SubLObject set_auto_increment_kb_alt(SubLObject v_boolean) {
		SubLSystemTrampolineFile.checkType(v_boolean, BOOLEANP);
		$auto_increment_kb$.setGlobalValue(v_boolean);
		return $auto_increment_kb$.getGlobalValue();
	}

	public static SubLObject set_auto_increment_kb(final SubLObject v_boolean) {
		assert NIL != booleanp(v_boolean) : "! booleanp(v_boolean) " + ("Types.booleanp(v_boolean) " + "CommonSymbols.NIL != Types.booleanp(v_boolean) ") + v_boolean;
		$auto_increment_kb$.setGlobalValue(v_boolean);
		return $auto_increment_kb$.getGlobalValue();
	}

	/**
	 *
	 *
	 * @return booleanp
	Controls whether the running image will load submitted transcripts via
	MAYBE-LOAD-SUBMITTED-TRANSCRIPT.
	 */
	@LispMethod(comment = "@return booleanp\r\nControls whether the running image will load submitted transcripts via\r\nMAYBE-LOAD-SUBMITTED-TRANSCRIPT.")
	public static final SubLObject load_submitted_transcriptsP_alt() {
		return $load_submitted_transcriptsP$.getGlobalValue();
	}

	/**
	 *
	 *
	 * @return booleanp
	Controls whether the running image will load submitted transcripts via
	MAYBE-LOAD-SUBMITTED-TRANSCRIPT.
	 */
	@LispMethod(comment = "@return booleanp\r\nControls whether the running image will load submitted transcripts via\r\nMAYBE-LOAD-SUBMITTED-TRANSCRIPT.")
	public static SubLObject load_submitted_transcriptsP() {
		return $load_submitted_transcriptsP$.getGlobalValue();
	}

	public static final SubLObject set_load_submitted_transcripts_alt(SubLObject v_boolean) {
		SubLSystemTrampolineFile.checkType(v_boolean, BOOLEANP);
		$load_submitted_transcriptsP$.setGlobalValue(v_boolean);
		return $load_submitted_transcriptsP$.getGlobalValue();
	}

	public static SubLObject set_load_submitted_transcripts(final SubLObject v_boolean) {
		assert NIL != booleanp(v_boolean) : "! booleanp(v_boolean) " + ("Types.booleanp(v_boolean) " + "CommonSymbols.NIL != Types.booleanp(v_boolean) ") + v_boolean;
		$load_submitted_transcriptsP$.setGlobalValue(v_boolean);
		return $load_submitted_transcriptsP$.getGlobalValue();
	}

	/**
	 *
	 *
	 * @return booleanp
	Controls whether the running image will send notices to transcript
	submitters when a submitted transcript is loaded.
	 */
	@LispMethod(comment = "@return booleanp\r\nControls whether the running image will send notices to transcript\r\nsubmitters when a submitted transcript is loaded.")
	public static final SubLObject send_submitted_transcript_loading_noticesP_alt() {
		return $send_submitted_transcript_loading_noticesP$.getGlobalValue();
	}

	/**
	 *
	 *
	 * @return booleanp
	Controls whether the running image will send notices to transcript
	submitters when a submitted transcript is loaded.
	 */
	@LispMethod(comment = "@return booleanp\r\nControls whether the running image will send notices to transcript\r\nsubmitters when a submitted transcript is loaded.")
	public static SubLObject send_submitted_transcript_loading_noticesP() {
		return $send_submitted_transcript_loading_noticesP$.getGlobalValue();
	}

	public static final SubLObject set_send_submitted_transcript_loading_notices_alt(SubLObject v_boolean) {
		SubLSystemTrampolineFile.checkType(v_boolean, BOOLEANP);
		$send_submitted_transcript_loading_noticesP$.setGlobalValue(v_boolean);
		return $send_submitted_transcript_loading_noticesP$.getGlobalValue();
	}

	public static SubLObject set_send_submitted_transcript_loading_notices(final SubLObject v_boolean) {
		assert NIL != booleanp(v_boolean) : "! booleanp(v_boolean) " + ("Types.booleanp(v_boolean) " + "CommonSymbols.NIL != Types.booleanp(v_boolean) ") + v_boolean;
		$send_submitted_transcript_loading_noticesP$.setGlobalValue(v_boolean);
		return $send_submitted_transcript_loading_noticesP$.getGlobalValue();
	}

	/**
	 * Make a unique identifier for a Cyc image: `<machine-name>-<universal-time>-<process-id>'.
	 */
	@LispMethod(comment = "Make a unique identifier for a Cyc image: `<machine-name>-<universal-time>-<process-id>\'.")
	public static final SubLObject make_cyc_image_id_alt() {
		{
			SubLObject machine_name = Strings.string_downcase(string_utilities.string_upto(Environment.get_machine_name($$$UNKNOWN), CHAR_period), UNPROVIDED, UNPROVIDED);
			SubLObject process_id = Environment.get_process_id(UNPROVIDED);
			SubLObject cyc_universal_time = numeric_date_utilities.universal_timestring(UNPROVIDED);
			return format(NIL, $str_alt38$_a__a__a, new SubLObject[] { machine_name, cyc_universal_time, process_id });
		}
	}

	/**
	 * Make a unique identifier for a Cyc image: `<machine-name>-<universal-time>-<process-id>'.
	 */
	@LispMethod(comment = "Make a unique identifier for a Cyc image: `<machine-name>-<universal-time>-<process-id>\'.")
	public static SubLObject make_cyc_image_id() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject machine_name = Strings.string_downcase(string_utilities.string_upto(Environment.get_machine_name($$$UNKNOWN), CHAR_period), UNPROVIDED, UNPROVIDED);
		final SubLObject base_port_string = ((NIL != $use_tcp_port_in_image_id$.getGlobalValue()) && (NIL != system_parameters.$base_tcp_port$.getDynamicValue(thread))) ? cconcatenate(string_utilities.to_string(system_parameters.$base_tcp_port$.getDynamicValue(thread)), $str40$_) : $str41$;
		final SubLObject process_id = Environment.get_process_id(UNPROVIDED);
		final SubLObject uniquifier = (process_id.isZero()) ? random.random($most_positive_fixnum$.getGlobalValue()) : process_id;
		final SubLObject cyc_universal_time = numeric_date_utilities.universal_timestring(UNPROVIDED);
		return format(NIL, $str42$_a__a_a__a, new SubLObject[] { machine_name, base_port_string, cyc_universal_time, uniquifier });
	}

	public static final SubLObject set_cyc_image_id_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			$cyc_image_id$.setDynamicValue(make_cyc_image_id(), thread);
			return $cyc_image_id$.getDynamicValue(thread);
		}
	}

	public static SubLObject set_cyc_image_id() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		$cyc_image_id$.setDynamicValue(make_cyc_image_id(), thread);
		return $cyc_image_id$.getDynamicValue(thread);
	}

	/**
	 * Accessor for *cyc-image-id*.
	 */
	@LispMethod(comment = "Accessor for *cyc-image-id*.")
	public static final SubLObject cyc_image_id_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $cyc_image_id$.getDynamicValue(thread);
		}
	}

	/**
	 * Accessor for *cyc-image-id*.
	 */
	@LispMethod(comment = "Accessor for *cyc-image-id*.")
	public static SubLObject cyc_image_id() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $cyc_image_id$.getDynamicValue(thread);
	}

	/**
	 *
	 *
	 * @return nil or integerp; Return the KB version used during world-building.
	 */
	@LispMethod(comment = "@return nil or integerp; Return the KB version used during world-building.")
	public static final SubLObject build_kb_loaded_alt() {
		return $build_kb_loaded$.getGlobalValue();
	}

	/**
	 *
	 *
	 * @return nil or integerp; Return the KB version used during world-building.
	 */
	@LispMethod(comment = "@return nil or integerp; Return the KB version used during world-building.")
	public static SubLObject build_kb_loaded() {
		return $build_kb_loaded$.getGlobalValue();
	}

	public static final SubLObject set_build_kb_loaded_alt(SubLObject kb) {
		if (NIL != kb) {
			SubLSystemTrampolineFile.checkType(kb, INTEGERP);
		}
		$build_kb_loaded$.setGlobalValue(kb);
		return set_kb_loaded(kb);
	}

	public static SubLObject set_build_kb_loaded(final SubLObject kb) {
		if (((NIL != kb) && (!assertionsDisabledSynth)) && (NIL == integerp(kb))) {
			throw new AssertionError(kb);
		}
		$build_kb_loaded$.setGlobalValue(kb);
		return set_kb_loaded(kb);
	}

	/**
	 *
	 *
	 * @return nil or integerp; Return the current KB version.
	 */
	@LispMethod(comment = "@return nil or integerp; Return the current KB version.")
	public static final SubLObject kb_loaded_alt() {
		return $kb_loaded$.getGlobalValue();
	}

	/**
	 *
	 *
	 * @return nil or integerp; Return the current KB version.
	 */
	@LispMethod(comment = "@return nil or integerp; Return the current KB version.")
	public static SubLObject kb_loaded() {
		return $kb_loaded$.getGlobalValue();
	}

	public static final SubLObject set_kb_loaded_alt(SubLObject kb) {
		if (NIL != kb) {
			SubLSystemTrampolineFile.checkType(kb, INTEGERP);
		}
		$kb_loaded$.setGlobalValue(kb);
		return kb;
	}

	public static SubLObject set_kb_loaded(final SubLObject kb) {
		if (((NIL != kb) && (!assertionsDisabledSynth)) && (NIL == integerp(kb))) {
			throw new AssertionError(kb);
		}
		$kb_loaded$.setGlobalValue(kb);
		return kb;
	}

	/**
	 * Is the core of the KB, that which is necessary for any KB-dependent code
	 * at all to be run, loaded?
	 */
	@LispMethod(comment = "Is the core of the KB, that which is necessary for any KB-dependent code\r\nat all to be run, loaded?\nIs the core of the KB, that which is necessary for any KB-dependent code\nat all to be run, loaded?")
	public static final SubLObject core_kb_loadedP_alt() {
		return list_utilities.sublisp_boolean(kb_loaded());
	}

	/**
	 * Is the core of the KB, that which is necessary for any KB-dependent code
	 * at all to be run, loaded?
	 */
	@LispMethod(comment = "Is the core of the KB, that which is necessary for any KB-dependent code\r\nat all to be run, loaded?\nIs the core of the KB, that which is necessary for any KB-dependent code\nat all to be run, loaded?")
	public static SubLObject core_kb_loadedP() {
		return list_utilities.sublisp_boolean(kb_loaded());
	}

	/**
	 * Does the KB contain a nontrivial amount that is not the core (tiny) KB?
	 */
	@LispMethod(comment = "Does the KB contain a nontrivial amount that is not the core (tiny) KB?")
	public static final SubLObject non_tiny_kb_loadedP_alt() {
		return makeBoolean(constant_count().numG($int$10000) && EIGHT_INTEGER.numL(integerDivide(assertion_handles.assertion_count(), forts.fort_count())));
	}

	/**
	 * Does the KB contain a nontrivial amount that is not the core (tiny) KB?
	 */
	@LispMethod(comment = "Does the KB contain a nontrivial amount that is not the core (tiny) KB?")
	public static SubLObject non_tiny_kb_loadedP() {
		return numG(constant_count(), $int$10000);
	}

	public static final SubLObject kb_tiny_or_full_alt() {
		if (NIL != non_tiny_kb_loadedP()) {
			return $FULL;
		} else {
			return $TINY;
		}
	}

	public static SubLObject kb_tiny_or_full() {
		if (NIL != non_tiny_kb_loadedP()) {
			return $FULL;
		}
		return $TINY;
	}

	/**
	 * Return the pedigree of the current KB version.
	 */
	@LispMethod(comment = "Return the pedigree of the current KB version.")
	public static final SubLObject kb_pedigree_alt() {
		return $kb_pedigree$.getGlobalValue();
	}

	/**
	 * Return the pedigree of the current KB version.
	 */
	@LispMethod(comment = "Return the pedigree of the current KB version.")
	public static SubLObject kb_pedigree() {
		return $kb_pedigree$.getGlobalValue();
	}

	/**
	 * Accessor for *caught-up-on-master-transcript*.
	 */
	@LispMethod(comment = "Accessor for *caught-up-on-master-transcript*.")
	public static final SubLObject caught_up_on_master_transcript_alt() {
		return $caught_up_on_master_transcript$.getGlobalValue();
	}

	/**
	 * Accessor for *caught-up-on-master-transcript*.
	 */
	@LispMethod(comment = "Accessor for *caught-up-on-master-transcript*.")
	public static SubLObject caught_up_on_master_transcript() {
		return $caught_up_on_master_transcript$.getGlobalValue();
	}

	/**
	 * Function that sets *caught-up-on-master-transcript*.
	 */
	@LispMethod(comment = "Function that sets *caught-up-on-master-transcript*.")
	public static final SubLObject set_caught_up_on_master_transcript_alt(SubLObject v_boolean) {
		$caught_up_on_master_transcript$.setGlobalValue(v_boolean);
		return $caught_up_on_master_transcript$.getGlobalValue();
	}

	/**
	 * Function that sets *caught-up-on-master-transcript*.
	 */
	@LispMethod(comment = "Function that sets *caught-up-on-master-transcript*.")
	public static SubLObject set_caught_up_on_master_transcript(final SubLObject v_boolean) {
		$caught_up_on_master_transcript$.setGlobalValue(v_boolean);
		return $caught_up_on_master_transcript$.getGlobalValue();
	}

	public static final SubLObject save_asked_queriesP_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return makeBoolean(((NIL != $save_asked_queriesP$.getDynamicValue(thread)) && (NIL != non_tiny_kb_loadedP())) && (NIL != subl_promotions.positive_integer_p(kb_loaded())));
		}
	}

	public static SubLObject save_asked_queriesP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean(((NIL != $save_asked_queriesP$.getDynamicValue(thread)) && (NIL != non_tiny_kb_loadedP())) && (NIL != subl_promotions.positive_integer_p(kb_loaded())));
	}

	public static final SubLObject within_askP_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $within_ask$.getDynamicValue(thread);
		}
	}

	public static SubLObject within_askP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $within_ask$.getDynamicValue(thread);
	}

	public static final SubLObject within_queryP_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return makeBoolean((NIL != $within_ask$.getDynamicValue(thread)) || (NIL != $within_query$.getDynamicValue(thread)));
		}
	}

	public static SubLObject within_queryP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return makeBoolean((NIL != $within_ask$.getDynamicValue(thread)) || (NIL != $within_query$.getDynamicValue(thread)));
	}

	public static final SubLObject within_assertP_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $within_assert$.getDynamicValue(thread);
		}
	}

	public static SubLObject within_assertP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $within_assert$.getDynamicValue(thread);
	}

	public static final SubLObject within_unassertP_alt() {
		{
			final SubLThread thread = SubLProcess.currentSubLThread();
			return $within_unassert$.getDynamicValue(thread);
		}
	}

	public static SubLObject within_unassertP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $within_unassert$.getDynamicValue(thread);
	}

	public static final SubLObject note_lexicon_initialized_alt() {
		$lexicon_initializedP$.setGlobalValue(T);
		return $lexicon_initializedP$.getGlobalValue();
	}

	public static SubLObject note_lexicon_initialized() {
		$lexicon_initializedP$.setGlobalValue(T);
		return $lexicon_initializedP$.getGlobalValue();
	}

	public static final SubLObject lexicon_initialized_p_alt() {
		return list_utilities.sublisp_boolean($lexicon_initializedP$.getGlobalValue());
	}

	public static SubLObject lexicon_initialized_p() {
		return list_utilities.sublisp_boolean($lexicon_initializedP$.getGlobalValue());
	}

	public static SubLObject cb_presentation_language_p(final SubLObject v_object) {
		return list_utilities.member_eqP(v_object, $cb_presentation_languages$.getGlobalValue());
	}

	public static SubLObject cb_silk_presentation_languageP(final SubLObject macroform, final SubLObject environment) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject datum = macroform.rest();
		if (NIL != datum) {
			cdestructuring_bind_error(datum, NIL);
		}
		if (NIL != subl_promotions.memberP($CYC_HALO, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
			return $list63;
		}
		return NIL;
	}

	public static SubLObject pwhen_cb_silk_presentation_language(final SubLObject macroform, final SubLObject environment) {
		final SubLObject datum = macroform.rest();
		final SubLObject body;
		final SubLObject current = body = datum;
		return listS(PWHEN, $list65, append(body, NIL));
	}

	public static SubLObject declare_control_vars_file() {
		declareMacro("within_hl_modification", "WITHIN-HL-MODIFICATION");
		declareFunction("subl_symbol_package", "SUBL-SYMBOL-PACKAGE", 1, 0, false);
		declareFunction("mapping_funcall_arg", "MAPPING-FUNCALL-ARG", 1, 1, false);
		declareFunction("mapping_funcall_int", "MAPPING-FUNCALL-INT", 0, 0, false);
		declareFunction("inference_warn", "INFERENCE-WARN", 1, 2, false);
		declareFunction("browse_forward_inferencesP", "BROWSE-FORWARD-INFERENCES?", 0, 0, false);
		declareFunction("the_term_qua_constantP", "THE-TERM-QUA-CONSTANT?", 1, 0, false);
		declareFunction("auto_increment_kb", "AUTO-INCREMENT-KB", 0, 0, false);
		declareFunction("set_auto_increment_kb", "SET-AUTO-INCREMENT-KB", 1, 0, false);
		declareFunction("load_submitted_transcriptsP", "LOAD-SUBMITTED-TRANSCRIPTS?", 0, 0, false);
		declareFunction("set_load_submitted_transcripts", "SET-LOAD-SUBMITTED-TRANSCRIPTS", 1, 0, false);
		declareFunction("send_submitted_transcript_loading_noticesP", "SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?", 0, 0, false);
		declareFunction("set_send_submitted_transcript_loading_notices", "SET-SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES", 1, 0, false);
		declareFunction("make_cyc_image_id", "MAKE-CYC-IMAGE-ID", 0, 0, false);
		declareFunction("set_cyc_image_id", "SET-CYC-IMAGE-ID", 0, 0, false);
		declareFunction("cyc_image_id", "CYC-IMAGE-ID", 0, 0, false);
		declareFunction("build_kb_loaded", "BUILD-KB-LOADED", 0, 0, false);
		declareFunction("set_build_kb_loaded", "SET-BUILD-KB-LOADED", 1, 0, false);
		declareFunction("kb_loaded", "KB-LOADED", 0, 0, false);
		declareFunction("set_kb_loaded", "SET-KB-LOADED", 1, 0, false);
		declareFunction("core_kb_loadedP", "CORE-KB-LOADED?", 0, 0, false);
		declareFunction("non_tiny_kb_loadedP", "NON-TINY-KB-LOADED?", 0, 0, false);
		declareFunction("kb_tiny_or_full", "KB-TINY-OR-FULL", 0, 0, false);
		declareFunction("kb_pedigree", "KB-PEDIGREE", 0, 0, false);
		declareFunction("caught_up_on_master_transcript", "CAUGHT-UP-ON-MASTER-TRANSCRIPT", 0, 0, false);
		declareFunction("set_caught_up_on_master_transcript", "SET-CAUGHT-UP-ON-MASTER-TRANSCRIPT", 1, 0, false);
		declareFunction("save_asked_queriesP", "SAVE-ASKED-QUERIES?", 0, 0, false);
		declareFunction("within_askP", "WITHIN-ASK?", 0, 0, false);
		declareFunction("within_queryP", "WITHIN-QUERY?", 0, 0, false);
		declareFunction("within_assertP", "WITHIN-ASSERT?", 0, 0, false);
		declareFunction("within_unassertP", "WITHIN-UNASSERT?", 0, 0, false);
		declareFunction("note_lexicon_initialized", "NOTE-LEXICON-INITIALIZED", 0, 0, false);
		declareFunction("lexicon_initialized_p", "LEXICON-INITIALIZED-P", 0, 0, false);
		declareFunction("cb_presentation_language_p", "CB-PRESENTATION-LANGUAGE-P", 1, 0, false);
		declareMacro("cb_silk_presentation_languageP", "CB-SILK-PRESENTATION-LANGUAGE?");
		declareMacro("pwhen_cb_silk_presentation_language", "PWHEN-CB-SILK-PRESENTATION-LANGUAGE");
		return NIL;
	}

	public static final SubLObject init_control_vars_file_alt() {
		defparameter("*READ-REQUIRE-CONSTANT-EXISTS*", T);
		deflexical("*TABLE-AREA*", NIL != boundp($table_area$) ? ((SubLObject) ($table_area$.getGlobalValue())) : NIL);
		deflexical("*HL-LOCK*", NIL != boundp($hl_lock$) ? ((SubLObject) ($hl_lock$.getGlobalValue())) : make_lock($$$HL_Store_Lock));
		defparameter("*BOOTSTRAPPING-KB?*", NIL);
		deflexical("*KEYWORD-PACKAGE*", find_package($$$KEYWORD));
		deflexical("*SUBLISP-PACKAGE*", find_package($$$SUBLISP));
		deflexical("*CYC-PACKAGE*", find_package($$$CYC));
		defparameter("*CNF-MATCHING-PREDICATE*", EQUAL);
		defparameter("*GAF-MATCHING-PREDICATE*", EQUAL);
		defparameter("*NAT-MATCHING-PREDICATE*", EQUAL);
		defparameter("*CANDIDATE-ASSERTION*", NIL);
		defparameter("*VARIABLE-NAMES*", NIL);
		defparameter("*ASSERTION-TRUTH*", $TRUE);
		defparameter("*MAPPING-ANSWER*", NIL);
		defparameter("*MAPPING-PRED*", NIL);
		defparameter("*MAPPING-SOURCE*", NIL);
		defparameter("*MAPPING-TARGET*", NIL);
		defparameter("*MAPPING-TARGET-ARG*", NIL);
		defparameter("*MAPPING-INDEX-ARG*", NIL);
		defparameter("*MAPPING-GATHER-ARG*", NIL);
		defparameter("*MAPPING-GATHER-ARGS*", NIL);
		defparameter("*MAPPING-OUTPUT-STREAM*", T);
		defparameter("*MAPPING-EQUALITY-TEST*", symbol_function(EQ));
		defparameter("*MAPPING-ANY-ANSWER?*", NIL);
		defparameter("*MAPPING-RELATION*", NIL);
		defparameter("*MAPPING-FINISHED-FN*", NIL);
		defparameter("*MAPPING-PATH*", NIL);
		defparameter("*MAPPING-DATA-1*", NIL);
		defparameter("*MAPPING-DATA-2*", NIL);
		defparameter("*MAPPING-PIVOT-ARG*", NIL);
		defparameter("*MAPPING-GATHER-KEY*", symbol_function(IDENTITY));
		defparameter("*MAPPING-GATHER-KEY-ARGS*", NIL);
		defparameter("*MAPPING-ASSERTION-SELECTION-FN*", NIL);
		defparameter("*MAPPING-ASSERTION-BOOKKEEPING-FN*", NIL);
		defparameter("*MAPPING-FN*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG*", ONE_INTEGER);
		defparameter("*MAPPING-FN-ARG1*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG2*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG3*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG4*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG5*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG6*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG7*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG8*", $unprovided$.getGlobalValue());
		defparameter("*KBA-PRED*", NIL);
		defparameter("*STANDARD-INDENT-STRING*", $str_alt9$_);
		defparameter("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*", NIL);
		defparameter("*TERM-RELATIONAL-COMPLEXITY-CUTOFF*", NIL);
		defparameter("*COLLECT-JUSTIFICATION-COMPILATIONS?*", NIL);
		defparameter("*JUSTIFICATION-COMPILATIONS*", NIL);
		defparameter("*EBL-TRACE*", ZERO_INTEGER);
		defparameter("*ALLOW-FORWARD-SKOLEMIZATION*", NIL);
		defparameter("*PREFER-FORWARD-SKOLEMIZATION*", NIL);
		defparameter("*PERFORM-UNIFICATION-OCCURS-CHECK*", T);
		defparameter("*PERFORM-EQUALS-UNIFICATION*", T);
		defparameter("*ALLOW-BACKWARD-GAFS*", T);
		defparameter("*CACHED-ASK-RESULT-DIRECTION*", $FORWARD);
		defparameter("*CHECK-FOR-CIRCULAR-JUSTS*", T);
		defparameter("*FILTER-DEDUCTIONS-FOR-TRIVIALLY-DERIVABLE-GAFS*", NIL);
		defparameter("*INFERENCE-DEBUG?*", NIL);
		defvar("*BROWSE-FORWARD-INFERENCES?*", NIL);
		defparameter("*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*", $list_alt11);
		defparameter("*PROOF-CHECKING-ENABLED*", NIL);
		defparameter("*PROOF-CHECKER-RULES*", NIL);
		defparameter("*INFERENCE-PROPAGATE-MT-SCOPE*", NIL);
		defparameter("*INFERENCE-CURRENT-NODE-MT-SCOPE*", NIL);
		defparameter("*INFERENCE-LITERAL*", NIL);
		defparameter("*INFERENCE-SENSE*", NIL);
		defparameter("*INFERENCE-ARG*", NIL);
		defparameter("*INFERENCE-MORE-SUPPORTS*", NIL);
		defparameter("*INFERENCE-HIGHLY-RELEVANT-ASSERTIONS*", NIL);
		defparameter("*INFERENCE-HIGHLY-RELEVANT-MTS*", NIL);
		defparameter("*WITHIN-HL-FAILURE-BACKCHAINING?*", NIL);
		defparameter("*HL-FAILURE-BACKCHAINING*", NIL);
		defparameter("*EVALUATABLE-BACKCHAIN-ENABLED*", NIL);
		defparameter("*NEGATION-BY-FAILURE*", NIL);
		defparameter("*COMPLETE-EXTENT-MINIMIZATION*", T);
		defparameter("*UNBOUND-RULE-BACKCHAIN-ENABLED*", NIL);
		deflexical("*DEFAULT-REMOVAL-COST-CUTOFF*", $int$10000);
		defparameter("*REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
		defparameter("*FORWARD-INFERENCE-REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
		defparameter("*APPLICATION-FILTERING-ENABLED*", NIL);
		defparameter("*MARKING-DOOMED-INFERENCE-ANCESTORS*", NIL);
		defparameter("*INFERENCE-SEARCH-STRATEGY*", $HEURISTIC);
		defparameter("*UNIQUE-INFERENCE-RESULT-BINDINGS*", T);
		defparameter("*INFERENCE-ANSWER-HANDLER*", INFERENCE_RETURN_BLISTS);
		defparameter("*HL-MODULE-SIMPLIFICATION-COST*", $float$0_1);
		defparameter("*HL-MODULE-CHECK-COST*", $float$0_5);
		deflexical("*CHEAP-HL-MODULE-CHECK-COST*", $float$0_5);
		deflexical("*TYPICAL-HL-MODULE-CHECK-COST*", $float$1_0);
		deflexical("*EXPENSIVE-HL-MODULE-CHECK-COST*", $float$1_5);
		deflexical("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
		defparameter("*MAXIMUM-HL-MODULE-CHECK-COST*", NIL);
		defparameter("*AVERAGE-ALL-ISA-COUNT*", $int$38);
		defparameter("*AVERAGE-ALL-GENLS-COUNT*", $int$47);
		defparameter("*PGIA-ACTIVE?*", NIL);
		defparameter("*THE-TERM-INFERENCE-ENABLED*", NIL);
		defparameter("*ALLOW-THE-TERM-UNIFICATION*", NIL);
		defparameter("*INFERENCE-THE-TERM-BINDINGS*", NIL);
		defparameter("*THE-TERM-QUA-CONSTANT*", NIL);
		defparameter("*EXTERNAL-INFERENCE-ENABLED*", NIL);
		defparameter("*SUPPRESS-CONFLICT-NOTICES?*", NIL);
		defparameter("*IGNORE-CONFLICTS?*", NIL);
		defparameter("*CONFLICTS-FROM-INVALID-DEDUCTIONS*", NIL);
		defparameter("*RECORD-INCONSISTENT-SUPPORT-SETS*", NIL);
		deflexical("*LAST-AGENDA-OP*", NIL);
		deflexical("*LAST-AGENDA-ERROR-MESSAGE*", NIL);
		deflexical("*LAST-AGENDA-ERROR-EXPLANATORY-SUPPORTS*", NIL);
		defparameter("*AGENDA-DISPLAY-FI-WARNINGS*", NIL);
		defparameter("*IGNORE-REMOTE-ERRORS*", T);
		deflexical("*AUTO-INCREMENT-KB*", NIL != boundp($auto_increment_kb$) ? ((SubLObject) ($auto_increment_kb$.getGlobalValue())) : NIL);
		deflexical("*LOAD-SUBMITTED-TRANSCRIPTS?*", NIL);
		deflexical("*SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?*", NIL);
		defvar("*CYC-IMAGE-ID*", NIL);
		deflexical("*BUILD-KB-LOADED*", NIL != boundp($build_kb_loaded$) ? ((SubLObject) ($build_kb_loaded$.getGlobalValue())) : NIL);
		deflexical("*KB-LOADED*", NIL != boundp($kb_loaded$) ? ((SubLObject) ($kb_loaded$.getGlobalValue())) : NIL);
		deflexical("*KB-PEDIGREE*", NIL != boundp($kb_pedigree$) ? ((SubLObject) ($kb_pedigree$.getGlobalValue())) : $UNKNOWN);
		defparameter("*USE-TRANSCRIPT?*", T);
		deflexical("*RUN-OWN-OPERATIONS?*", NIL != boundp($run_own_operationsP$) ? ((SubLObject) ($run_own_operationsP$.getGlobalValue())) : T);
		deflexical("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*", NIL != boundp($caught_up_on_master_transcript$) ? ((SubLObject) ($caught_up_on_master_transcript$.getGlobalValue())) : NIL);
		deflexical("*COMMUNICATION-MODE*", NIL != boundp($communication_mode$) ? ((SubLObject) ($communication_mode$.getGlobalValue())) : $UNKNOWN);
		defparameter("*UNENCAPSULATING-WITHIN-AGENDA*", NIL);
		defvar("*SAVE-ASKED-QUERIES?*", T);
		deflexical("*INIT-FILE-LOADED?*", NIL != boundp($init_file_loadedP$) ? ((SubLObject) ($init_file_loadedP$.getGlobalValue())) : NIL);
		defparameter("*WITHIN-ASSERT*", NIL);
		defparameter("*WITHIN-UNASSERT*", NIL);
		defparameter("*WITHIN-ASK*", NIL);
		defparameter("*WITHIN-QUERY*", NIL);
		defparameter("*COMPUTE-INFERENCE-RESULTS*", T);
		defparameter("*CACHE-INFERENCE-RESULTS*", NIL);
		defparameter("*TRANSFORMATION-DEPTH-CUTOFF*", NIL);
		deflexical("*LEXICON-INITIALIZED?*", NIL != boundp($lexicon_initializedP$) ? ((SubLObject) ($lexicon_initializedP$.getGlobalValue())) : NIL);
		defparameter("*PARTIAL-SEMANTICS?*", NIL);
		defparameter("*ENFORCE-MASS-VS-COUNT?*", T);
		defparameter("*PARTIAL-SYNTAX?*", NIL);
		defparameter("*SHOW-ASSERTIONS-IN-ENGLISH*", NIL);
		defparameter("*ASSUME-CYC-CYCLIST-DIALOG?*", T);
		defparameter("*CB-PARAPHRASE-MT*", NIL);
		defparameter("*SHOW-FET-EDIT-BUTTONS?*", T);
		defparameter("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*", T);
		defparameter("*SHOW-FET-CREATE-SPEC-BUTTONS?*", NIL);
		defparameter("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*", NIL);
		defparameter("*CB-SKOLEM-APPLICABLE-RELATIONS?*", NIL);
		defparameter("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*", NIL);
		defparameter("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*", NIL);
		defparameter("*SHOW-CREDITS*", NIL);
		defparameter("*BROWSE-IN-META-QUERY-MODE?*", NIL);
		defparameter("*META-QUERY-START-STRING*", NIL);
		defparameter("*CURRENT-CACHE*", NIL);
		defparameter("*SEMANTIC-RETRIEVAL-CACHES*", NIL);
		defvar("*RKF-MT*", NIL);
		defparameter("*DBM-INIT-FILE-LOADED?*", NIL);
		defparameter("*DBM-CACHE-LOADING-STARTED?*", NIL);
		defparameter("*DBM-CACHE-LOADING-FINISHED?*", NIL);
		deflexical("*WORDNET-INITIALIZED?*", NIL != boundp($wordnet_initializedP$) ? ((SubLObject) ($wordnet_initializedP$.getGlobalValue())) : NIL);
		deflexical("*USE-WN-LINKS?*", NIL != boundp($use_wn_linksP$) ? ((SubLObject) ($use_wn_linksP$.getGlobalValue())) : NIL);
		deflexical("*ACIP-SUBKERNEL-EXTRACTION*", NIL != boundp($acip_subkernel_extraction$) ? ((SubLObject) ($acip_subkernel_extraction$.getGlobalValue())) : NIL);
		deflexical("*ACIP-SUBKERNEL-OUTPUT-STREAM*", NIL != boundp($acip_subkernel_output_stream$) ? ((SubLObject) ($acip_subkernel_output_stream$.getGlobalValue())) : NIL);
		defparameter("*JANUS-TAG*", NIL);
		defparameter("*JANUS-NEW-CONSTANTS*", NIL);
		defparameter("*JANUS-TEST-CASE-LOGGING?*", NIL);
		defparameter("*JANUS-OPERATIONS*", NIL);
		defparameter("*JANUS-EXTRACTION-DEDUCE-SPECS*", NIL);
		defparameter("*JANUS-WITHIN-SOMETHING?*", NIL);
		defparameter("*JANUS-TESTING-DEDUCE-SPECS*", NIL);
		defparameter("*JANUS-TEST-CASE-RUNNING?*", NIL);
		defvar("*ASK-QUIRK?*", NIL);
		defvar("*CURRIED-KBQ-LOOKUP?*", T);
		defparameter("*KBQ-RUN-QUERY-AUTO-DESTROY-ENABLED?*", T);
		defparameter("*KBQ-RUN-QUERY-NON-CONTINUABLE-ENABLED?*", T);
		return NIL;
	}

	public static SubLObject init_control_vars_file() {
		if (SubLFiles.USE_V1) {
			defparameter("*READ-REQUIRE-CONSTANT-EXISTS*", T);
			deflexical("*TABLE-AREA*", SubLSystemTrampolineFile.maybeDefault($table_area$, $table_area$, NIL));
			deflexical("*HL-LOCK*", SubLSystemTrampolineFile.maybeDefault($hl_lock$, $hl_lock$, () -> make_lock($$$HL_Store_Lock)));
			defparameter("*BOOTSTRAPPING-KB?*", NIL);
			deflexical("*KEYWORD-PACKAGE*", find_package($$$KEYWORD));
			deflexical("*SUBLISP-PACKAGE*", find_package($$$SUBLISP));
			deflexical("*CYC-PACKAGE*", find_package($$$CYC));
			defparameter("*CNF-MATCHING-PREDICATE*", EQUAL);
			defparameter("*GAF-MATCHING-PREDICATE*", EQUAL);
			defparameter("*NAT-MATCHING-PREDICATE*", EQUAL);
			defparameter("*CANDIDATE-ASSERTION*", NIL);
			defparameter("*VARIABLE-NAMES*", NIL);
			defparameter("*ASSERTION-TRUTH*", $TRUE);
			defparameter("*MAPPING-ANSWER*", NIL);
			defparameter("*MAPPING-PRED*", NIL);
			defparameter("*MAPPING-SOURCE*", NIL);
			defparameter("*MAPPING-TARGET*", NIL);
			defparameter("*MAPPING-TARGET-ARG*", NIL);
			defparameter("*MAPPING-INDEX-ARG*", NIL);
			defparameter("*MAPPING-GATHER-ARG*", NIL);
			defparameter("*MAPPING-GATHER-ARGS*", NIL);
			defparameter("*MAPPING-OUTPUT-STREAM*", T);
			defparameter("*MAPPING-EQUALITY-TEST*", symbol_function(EQUAL));
			defparameter("*MAPPING-ANY-ANSWER?*", NIL);
			defparameter("*MAPPING-RELATION*", NIL);
			defparameter("*MAPPING-FINISHED-FN*", NIL);
			defparameter("*MAPPING-PATH*", NIL);
			defparameter("*MAPPING-DATA-1*", NIL);
			defparameter("*MAPPING-DATA-2*", NIL);
			defparameter("*MAPPING-PIVOT-ARG*", NIL);
			defparameter("*MAPPING-GATHER-KEY*", symbol_function(IDENTITY));
			defparameter("*MAPPING-GATHER-KEY-ARGS*", NIL);
			defparameter("*MAPPING-ASSERTION-SELECTION-FN*", NIL);
			defparameter("*MAPPING-ASSERTION-BOOKKEEPING-FN*", NIL);
			defparameter("*MAPPING-FN*", $unprovided$.getGlobalValue());
			defparameter("*MAPPING-FN-ARG*", ONE_INTEGER);
			defparameter("*MAPPING-FN-ARG1*", $unprovided$.getGlobalValue());
			defparameter("*MAPPING-FN-ARG2*", $unprovided$.getGlobalValue());
			defparameter("*MAPPING-FN-ARG3*", $unprovided$.getGlobalValue());
			defparameter("*MAPPING-FN-ARG4*", $unprovided$.getGlobalValue());
			defparameter("*MAPPING-FN-ARG5*", $unprovided$.getGlobalValue());
			defparameter("*MAPPING-FN-ARG6*", $unprovided$.getGlobalValue());
			defparameter("*MAPPING-FN-ARG7*", $unprovided$.getGlobalValue());
			defparameter("*MAPPING-FN-ARG8*", $unprovided$.getGlobalValue());
			defparameter("*KBA-PRED*", NIL);
			defparameter("*STANDARD-INDENT-STRING*", $$$_);
			defparameter("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*", NIL);
			defparameter("*TERM-RELATIONAL-COMPLEXITY-CUTOFF*", NIL);
			defparameter("*COLLECT-JUSTIFICATION-COMPILATIONS?*", NIL);
			defparameter("*JUSTIFICATION-COMPILATIONS*", NIL);
			defparameter("*EBL-TRACE*", ZERO_INTEGER);
			defparameter("*ALLOW-FORWARD-SKOLEMIZATION*", NIL);
			defparameter("*PREFER-FORWARD-SKOLEMIZATION*", NIL);
			defparameter("*PERFORM-UNIFICATION-OCCURS-CHECK*", T);
			defparameter("*PERFORM-EQUALS-UNIFICATION*", T);
			defparameter("*ALLOW-BACKWARD-GAFS*", T);
			defparameter("*CACHED-ASK-RESULT-DIRECTION*", $FORWARD);
			defparameter("*CHECK-FOR-CIRCULAR-JUSTS*", T);
			defparameter("*FILTER-DEDUCTIONS-FOR-TRIVIALLY-DERIVABLE-GAFS*", NIL);
			defparameter("*INFERENCE-DEBUG?*", NIL);
			defparameter("*INFERENCE-TRACE-LEVEL*", ZERO_INTEGER);
			defvar("*BROWSE-FORWARD-INFERENCES?*", NIL);
			defparameter("*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*", $list13);
			defparameter("*PROOF-CHECKING-ENABLED*", NIL);
			defparameter("*PROOF-CHECKER-RULES*", NIL);
			defparameter("*INFERENCE-PROPAGATE-MT-SCOPE*", NIL);
			defparameter("*INFERENCE-CURRENT-NODE-MT-SCOPE*", NIL);
			defparameter("*INFERENCE-LITERAL*", NIL);
			defparameter("*INFERENCE-SENSE*", NIL);
			defparameter("*INFERENCE-ARG*", NIL);
			defparameter("*INFERENCE-MORE-SUPPORTS*", NIL);
			defparameter("*INFERENCE-HIGHLY-RELEVANT-ASSERTIONS*", NIL);
			defparameter("*INFERENCE-HIGHLY-RELEVANT-MTS*", NIL);
			defparameter("*WITHIN-HL-FAILURE-BACKCHAINING?*", NIL);
			defparameter("*HL-FAILURE-BACKCHAINING*", NIL);
			defparameter("*EVALUATABLE-BACKCHAIN-ENABLED*", NIL);
			defparameter("*NEGATION-BY-FAILURE*", NIL);
			defparameter("*COMPLETE-EXTENT-MINIMIZATION*", T);
			defparameter("*UNBOUND-RULE-BACKCHAIN-ENABLED*", NIL);
			deflexical("*DEFAULT-REMOVAL-COST-CUTOFF*", $int$100000);
			defparameter("*REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
			defparameter("*FORWARD-INFERENCE-REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
			defparameter("*APPLICATION-FILTERING-ENABLED*", NIL);
			defparameter("*MARKING-DOOMED-INFERENCE-ANCESTORS*", NIL);
			defparameter("*INFERENCE-SEARCH-STRATEGY*", $HEURISTIC);
			defparameter("*UNIQUE-INFERENCE-RESULT-BINDINGS*", T);
			defparameter("*INFERENCE-ANSWER-HANDLER*", INFERENCE_RETURN_BLISTS);
			defparameter("*HL-MODULE-SIMPLIFICATION-COST*", $float$0_1);
			defparameter("*HL-MODULE-CHECK-COST*", $float$0_5);
			deflexical("*CHEAP-HL-MODULE-CHECK-COST*", $float$0_5);
			deflexical("*TYPICAL-HL-MODULE-CHECK-COST*", $float$1_0);
			deflexical("*EXPENSIVE-HL-MODULE-CHECK-COST*", $float$1_5);
			deflexical("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
			defparameter("*MAXIMUM-HL-MODULE-CHECK-COST*", NIL);
			defparameter("*AVERAGE-ALL-ISA-COUNT*", $int$38);
			defparameter("*AVERAGE-ALL-GENLS-COUNT*", $int$47);
			defparameter("*PGIA-ACTIVE?*", NIL);
			defparameter("*THE-TERM-INFERENCE-ENABLED*", NIL);
			defparameter("*ALLOW-THE-TERM-UNIFICATION*", NIL);
			defparameter("*INFERENCE-THE-TERM-BINDINGS*", NIL);
			defparameter("*THE-TERM-QUA-CONSTANT*", NIL);
			defparameter("*EXTERNAL-INFERENCE-ENABLED*", NIL);
			defparameter("*SUPPRESS-CONFLICT-NOTICES?*", NIL);
			defparameter("*IGNORE-CONFLICTS?*", NIL);
			defparameter("*IGNORE-NON-DEFINITIONAL-CONFLICTS?*", NIL);
			defparameter("*CONFLICTS-FROM-INVALID-DEDUCTIONS*", NIL);
			defparameter("*RECORD-INCONSISTENT-SUPPORT-SETS*", NIL);
			deflexical("*LAST-AGENDA-OP*", NIL);
			deflexical("*LAST-AGENDA-ERROR-MESSAGE*", NIL);
			deflexical("*LAST-AGENDA-ERROR-EXPLANATORY-SUPPORTS*", NIL);
			defparameter("*AGENDA-DISPLAY-FI-WARNINGS*", NIL);
			defparameter("*IGNORE-REMOTE-ERRORS*", T);
			deflexical("*AUTO-INCREMENT-KB*", SubLSystemTrampolineFile.maybeDefault($auto_increment_kb$, $auto_increment_kb$, NIL));
			deflexical("*LOAD-SUBMITTED-TRANSCRIPTS?*", NIL);
			deflexical("*SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?*", NIL);
			defvar("*CYC-IMAGE-ID*", NIL);
			deflexical("*USE-TCP-PORT-IN-IMAGE-ID*", T);
			deflexical("*BUILD-KB-LOADED*", SubLSystemTrampolineFile.maybeDefault($build_kb_loaded$, $build_kb_loaded$, NIL));
			deflexical("*KB-LOADED*", SubLSystemTrampolineFile.maybeDefault($kb_loaded$, $kb_loaded$, NIL));
			deflexical("*KB-PEDIGREE*", SubLSystemTrampolineFile.maybeDefault($kb_pedigree$, $kb_pedigree$, $UNKNOWN));
			defparameter("*USE-TRANSCRIPT?*", T);
			deflexical("*RUN-OWN-OPERATIONS?*", SubLSystemTrampolineFile.maybeDefault($run_own_operationsP$, $run_own_operationsP$, T));
			deflexical("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*", SubLSystemTrampolineFile.maybeDefault($caught_up_on_master_transcript$, $caught_up_on_master_transcript$, NIL));
			deflexical("*COMMUNICATION-MODE*", SubLSystemTrampolineFile.maybeDefault($communication_mode$, $communication_mode$, $UNKNOWN));
			defparameter("*UNENCAPSULATING-WITHIN-AGENDA*", NIL);
			defvar("*SAVE-ASKED-QUERIES?*", NIL);
			deflexical("*INIT-FILE-LOADED?*", SubLSystemTrampolineFile.maybeDefault($init_file_loadedP$, $init_file_loadedP$, NIL));
			defparameter("*WITHIN-ASSERT*", NIL);
			defparameter("*WITHIN-UNASSERT*", NIL);
			defparameter("*WITHIN-ASK*", NIL);
			defparameter("*WITHIN-QUERY*", NIL);
			defparameter("*COMPUTE-INFERENCE-RESULTS*", T);
			defparameter("*CACHE-INFERENCE-RESULTS*", NIL);
			defparameter("*TRANSFORMATION-DEPTH-CUTOFF*", NIL);
			deflexical("*LEXICON-INITIALIZED?*", SubLSystemTrampolineFile.maybeDefault($lexicon_initializedP$, $lexicon_initializedP$, NIL));
			defparameter("*PARTIAL-SEMANTICS?*", NIL);
			defparameter("*ENFORCE-MASS-VS-COUNT?*", T);
			defparameter("*PARTIAL-SYNTAX?*", NIL);
			deflexical("*CB-PRESENTATION-LANGUAGES*", $list59);
			defparameter("*CB-MAJOR-PRESENTATION-LANGUAGE*", $CYCL);
			defparameter("*SHOW-ASSERTIONS-IN-ENGLISH*", NIL);
			defparameter("*ASSUME-CYC-CYCLIST-DIALOG?*", T);
			defparameter("*GENERATED-PHRASES-BROWSABLE?*", T);
			defparameter("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*", T);
			defparameter("*CB-PARAPHRASE-MT*", NIL);
			defparameter("*SHOW-FET-EDIT-BUTTONS?*", T);
			defparameter("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*", T);
			defparameter("*SHOW-FET-CREATE-SPEC-BUTTONS?*", NIL);
			defparameter("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*", NIL);
			defparameter("*CB-SKOLEM-APPLICABLE-RELATIONS?*", NIL);
			defparameter("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*", NIL);
			defparameter("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*", NIL);
			defparameter("*SHOW-CREDITS*", NIL);
			defparameter("*BROWSE-IN-META-QUERY-MODE?*", NIL);
			defparameter("*META-QUERY-START-STRING*", NIL);
			defparameter("*CURRENT-CACHE*", NIL);
			defvar("*RKF-MT*", NIL);
			defparameter("*DBM-INIT-FILE-LOADED?*", NIL);
			defparameter("*DBM-CACHE-LOADING-STARTED?*", NIL);
			defparameter("*DBM-CACHE-LOADING-FINISHED?*", NIL);
			deflexical("*WORDNET-INITIALIZED?*", SubLSystemTrampolineFile.maybeDefault($wordnet_initializedP$, $wordnet_initializedP$, NIL));
			deflexical("*USE-WN-LINKS?*", SubLSystemTrampolineFile.maybeDefault($use_wn_linksP$, $use_wn_linksP$, NIL));
			deflexical("*ACIP-SUBKERNEL-EXTRACTION*", SubLSystemTrampolineFile.maybeDefault($acip_subkernel_extraction$, $acip_subkernel_extraction$, NIL));
			deflexical("*ACIP-SUBKERNEL-OUTPUT-STREAM*", SubLSystemTrampolineFile.maybeDefault($acip_subkernel_output_stream$, $acip_subkernel_output_stream$, NIL));
			defparameter("*JANUS-TAG*", NIL);
			defparameter("*JANUS-NEW-CONSTANTS*", NIL);
			defparameter("*JANUS-TEST-CASE-LOGGING?*", NIL);
			defparameter("*JANUS-OPERATIONS*", NIL);
			defparameter("*JANUS-EXTRACTION-DEDUCE-SPECS*", NIL);
			defparameter("*JANUS-WITHIN-SOMETHING?*", NIL);
			defparameter("*JANUS-TESTING-DEDUCE-SPECS*", NIL);
			defparameter("*JANUS-TEST-CASE-RUNNING?*", NIL);
			defvar("*ASK-QUIRK?*", NIL);
			defparameter("*KBQ-RUN-QUERY-AUTO-DESTROY-ENABLED?*", T);
			defparameter("*KBQ-RUN-QUERY-NON-CONTINUABLE-ENABLED?*", T);
			defvar("*KBQ-RUN-QUERY-PRACTICE-MODE?*", NIL);
		}
		if (SubLFiles.USE_V2) {
			deflexical("*TABLE-AREA*", NIL != boundp($table_area$) ? ((SubLObject) ($table_area$.getGlobalValue())) : NIL);
			deflexical("*HL-LOCK*", NIL != boundp($hl_lock$) ? ((SubLObject) ($hl_lock$.getGlobalValue())) : make_lock($$$HL_Store_Lock));
			defparameter("*MAPPING-EQUALITY-TEST*", symbol_function(EQ));
			defparameter("*STANDARD-INDENT-STRING*", $str_alt9$_);
			defparameter("*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*", $list_alt11);
			deflexical("*DEFAULT-REMOVAL-COST-CUTOFF*", $int$10000);
			deflexical("*AUTO-INCREMENT-KB*", NIL != boundp($auto_increment_kb$) ? ((SubLObject) ($auto_increment_kb$.getGlobalValue())) : NIL);
			deflexical("*BUILD-KB-LOADED*", NIL != boundp($build_kb_loaded$) ? ((SubLObject) ($build_kb_loaded$.getGlobalValue())) : NIL);
			deflexical("*KB-LOADED*", NIL != boundp($kb_loaded$) ? ((SubLObject) ($kb_loaded$.getGlobalValue())) : NIL);
			deflexical("*KB-PEDIGREE*", NIL != boundp($kb_pedigree$) ? ((SubLObject) ($kb_pedigree$.getGlobalValue())) : $UNKNOWN);
			deflexical("*RUN-OWN-OPERATIONS?*", NIL != boundp($run_own_operationsP$) ? ((SubLObject) ($run_own_operationsP$.getGlobalValue())) : T);
			deflexical("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*", NIL != boundp($caught_up_on_master_transcript$) ? ((SubLObject) ($caught_up_on_master_transcript$.getGlobalValue())) : NIL);
			deflexical("*COMMUNICATION-MODE*", NIL != boundp($communication_mode$) ? ((SubLObject) ($communication_mode$.getGlobalValue())) : $UNKNOWN);
			defvar("*SAVE-ASKED-QUERIES?*", T);
			deflexical("*INIT-FILE-LOADED?*", NIL != boundp($init_file_loadedP$) ? ((SubLObject) ($init_file_loadedP$.getGlobalValue())) : NIL);
			deflexical("*LEXICON-INITIALIZED?*", NIL != boundp($lexicon_initializedP$) ? ((SubLObject) ($lexicon_initializedP$.getGlobalValue())) : NIL);
			defparameter("*SEMANTIC-RETRIEVAL-CACHES*", NIL);
			deflexical("*WORDNET-INITIALIZED?*", NIL != boundp($wordnet_initializedP$) ? ((SubLObject) ($wordnet_initializedP$.getGlobalValue())) : NIL);
			deflexical("*USE-WN-LINKS?*", NIL != boundp($use_wn_linksP$) ? ((SubLObject) ($use_wn_linksP$.getGlobalValue())) : NIL);
			deflexical("*ACIP-SUBKERNEL-EXTRACTION*", NIL != boundp($acip_subkernel_extraction$) ? ((SubLObject) ($acip_subkernel_extraction$.getGlobalValue())) : NIL);
			deflexical("*ACIP-SUBKERNEL-OUTPUT-STREAM*", NIL != boundp($acip_subkernel_output_stream$) ? ((SubLObject) ($acip_subkernel_output_stream$.getGlobalValue())) : NIL);
			defvar("*CURRIED-KBQ-LOOKUP?*", T);
		}
		return NIL;
	}

	public static SubLObject init_control_vars_file_Previous() {
		defparameter("*READ-REQUIRE-CONSTANT-EXISTS*", T);
		deflexical("*TABLE-AREA*", SubLSystemTrampolineFile.maybeDefault($table_area$, $table_area$, NIL));
		deflexical("*HL-LOCK*", SubLSystemTrampolineFile.maybeDefault($hl_lock$, $hl_lock$, () -> make_lock($$$HL_Store_Lock)));
		defparameter("*BOOTSTRAPPING-KB?*", NIL);
		deflexical("*KEYWORD-PACKAGE*", find_package($$$KEYWORD));
		deflexical("*SUBLISP-PACKAGE*", find_package($$$SUBLISP));
		deflexical("*CYC-PACKAGE*", find_package($$$CYC));
		defparameter("*CNF-MATCHING-PREDICATE*", EQUAL);
		defparameter("*GAF-MATCHING-PREDICATE*", EQUAL);
		defparameter("*NAT-MATCHING-PREDICATE*", EQUAL);
		defparameter("*CANDIDATE-ASSERTION*", NIL);
		defparameter("*VARIABLE-NAMES*", NIL);
		defparameter("*ASSERTION-TRUTH*", $TRUE);
		defparameter("*MAPPING-ANSWER*", NIL);
		defparameter("*MAPPING-PRED*", NIL);
		defparameter("*MAPPING-SOURCE*", NIL);
		defparameter("*MAPPING-TARGET*", NIL);
		defparameter("*MAPPING-TARGET-ARG*", NIL);
		defparameter("*MAPPING-INDEX-ARG*", NIL);
		defparameter("*MAPPING-GATHER-ARG*", NIL);
		defparameter("*MAPPING-GATHER-ARGS*", NIL);
		defparameter("*MAPPING-OUTPUT-STREAM*", T);
		defparameter("*MAPPING-EQUALITY-TEST*", symbol_function(EQUAL));
		defparameter("*MAPPING-ANY-ANSWER?*", NIL);
		defparameter("*MAPPING-RELATION*", NIL);
		defparameter("*MAPPING-FINISHED-FN*", NIL);
		defparameter("*MAPPING-PATH*", NIL);
		defparameter("*MAPPING-DATA-1*", NIL);
		defparameter("*MAPPING-DATA-2*", NIL);
		defparameter("*MAPPING-PIVOT-ARG*", NIL);
		defparameter("*MAPPING-GATHER-KEY*", symbol_function(IDENTITY));
		defparameter("*MAPPING-GATHER-KEY-ARGS*", NIL);
		defparameter("*MAPPING-ASSERTION-SELECTION-FN*", NIL);
		defparameter("*MAPPING-ASSERTION-BOOKKEEPING-FN*", NIL);
		defparameter("*MAPPING-FN*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG*", ONE_INTEGER);
		defparameter("*MAPPING-FN-ARG1*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG2*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG3*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG4*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG5*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG6*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG7*", $unprovided$.getGlobalValue());
		defparameter("*MAPPING-FN-ARG8*", $unprovided$.getGlobalValue());
		defparameter("*KBA-PRED*", NIL);
		defparameter("*STANDARD-INDENT-STRING*", $$$_);
		defparameter("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*", NIL);
		defparameter("*TERM-RELATIONAL-COMPLEXITY-CUTOFF*", NIL);
		defparameter("*COLLECT-JUSTIFICATION-COMPILATIONS?*", NIL);
		defparameter("*JUSTIFICATION-COMPILATIONS*", NIL);
		defparameter("*EBL-TRACE*", ZERO_INTEGER);
		defparameter("*ALLOW-FORWARD-SKOLEMIZATION*", NIL);
		defparameter("*PREFER-FORWARD-SKOLEMIZATION*", NIL);
		defparameter("*PERFORM-UNIFICATION-OCCURS-CHECK*", T);
		defparameter("*PERFORM-EQUALS-UNIFICATION*", T);
		defparameter("*ALLOW-BACKWARD-GAFS*", T);
		defparameter("*CACHED-ASK-RESULT-DIRECTION*", $FORWARD);
		defparameter("*CHECK-FOR-CIRCULAR-JUSTS*", T);
		defparameter("*FILTER-DEDUCTIONS-FOR-TRIVIALLY-DERIVABLE-GAFS*", NIL);
		defparameter("*INFERENCE-DEBUG?*", NIL);
		defparameter("*INFERENCE-TRACE-LEVEL*", ZERO_INTEGER);
		defvar("*BROWSE-FORWARD-INFERENCES?*", NIL);
		defparameter("*QUERY-PROPERTIES-INHERITED-BY-RECURSIVE-QUERIES*", $list13);
		defparameter("*PROOF-CHECKING-ENABLED*", NIL);
		defparameter("*PROOF-CHECKER-RULES*", NIL);
		defparameter("*INFERENCE-PROPAGATE-MT-SCOPE*", NIL);
		defparameter("*INFERENCE-CURRENT-NODE-MT-SCOPE*", NIL);
		defparameter("*INFERENCE-LITERAL*", NIL);
		defparameter("*INFERENCE-SENSE*", NIL);
		defparameter("*INFERENCE-ARG*", NIL);
		defparameter("*INFERENCE-MORE-SUPPORTS*", NIL);
		defparameter("*INFERENCE-HIGHLY-RELEVANT-ASSERTIONS*", NIL);
		defparameter("*INFERENCE-HIGHLY-RELEVANT-MTS*", NIL);
		defparameter("*WITHIN-HL-FAILURE-BACKCHAINING?*", NIL);
		defparameter("*HL-FAILURE-BACKCHAINING*", NIL);
		defparameter("*EVALUATABLE-BACKCHAIN-ENABLED*", NIL);
		defparameter("*NEGATION-BY-FAILURE*", NIL);
		defparameter("*COMPLETE-EXTENT-MINIMIZATION*", T);
		defparameter("*UNBOUND-RULE-BACKCHAIN-ENABLED*", NIL);
		deflexical("*DEFAULT-REMOVAL-COST-CUTOFF*", $int$100000);
		defparameter("*REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
		defparameter("*FORWARD-INFERENCE-REMOVAL-COST-CUTOFF*", $default_removal_cost_cutoff$.getGlobalValue());
		defparameter("*APPLICATION-FILTERING-ENABLED*", NIL);
		defparameter("*MARKING-DOOMED-INFERENCE-ANCESTORS*", NIL);
		defparameter("*INFERENCE-SEARCH-STRATEGY*", $HEURISTIC);
		defparameter("*UNIQUE-INFERENCE-RESULT-BINDINGS*", T);
		defparameter("*INFERENCE-ANSWER-HANDLER*", INFERENCE_RETURN_BLISTS);
		defparameter("*HL-MODULE-SIMPLIFICATION-COST*", $float$0_1);
		defparameter("*HL-MODULE-CHECK-COST*", $float$0_5);
		deflexical("*CHEAP-HL-MODULE-CHECK-COST*", $float$0_5);
		deflexical("*TYPICAL-HL-MODULE-CHECK-COST*", $float$1_0);
		deflexical("*EXPENSIVE-HL-MODULE-CHECK-COST*", $float$1_5);
		deflexical("*EXPENSIVE-HL-MODULE-SINGLETON-GENERATE-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
		defparameter("*MAXIMUM-HL-MODULE-CHECK-COST*", NIL);
		defparameter("*AVERAGE-ALL-ISA-COUNT*", $int$38);
		defparameter("*AVERAGE-ALL-GENLS-COUNT*", $int$47);
		defparameter("*PGIA-ACTIVE?*", NIL);
		defparameter("*THE-TERM-INFERENCE-ENABLED*", NIL);
		defparameter("*ALLOW-THE-TERM-UNIFICATION*", NIL);
		defparameter("*INFERENCE-THE-TERM-BINDINGS*", NIL);
		defparameter("*THE-TERM-QUA-CONSTANT*", NIL);
		defparameter("*EXTERNAL-INFERENCE-ENABLED*", NIL);
		defparameter("*SUPPRESS-CONFLICT-NOTICES?*", NIL);
		defparameter("*IGNORE-CONFLICTS?*", NIL);
		defparameter("*IGNORE-NON-DEFINITIONAL-CONFLICTS?*", NIL);
		defparameter("*CONFLICTS-FROM-INVALID-DEDUCTIONS*", NIL);
		defparameter("*RECORD-INCONSISTENT-SUPPORT-SETS*", NIL);
		deflexical("*LAST-AGENDA-OP*", NIL);
		deflexical("*LAST-AGENDA-ERROR-MESSAGE*", NIL);
		deflexical("*LAST-AGENDA-ERROR-EXPLANATORY-SUPPORTS*", NIL);
		defparameter("*AGENDA-DISPLAY-FI-WARNINGS*", NIL);
		defparameter("*IGNORE-REMOTE-ERRORS*", T);
		deflexical("*AUTO-INCREMENT-KB*", SubLSystemTrampolineFile.maybeDefault($auto_increment_kb$, $auto_increment_kb$, NIL));
		deflexical("*LOAD-SUBMITTED-TRANSCRIPTS?*", NIL);
		deflexical("*SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?*", NIL);
		defvar("*CYC-IMAGE-ID*", NIL);
		deflexical("*USE-TCP-PORT-IN-IMAGE-ID*", T);
		deflexical("*BUILD-KB-LOADED*", SubLSystemTrampolineFile.maybeDefault($build_kb_loaded$, $build_kb_loaded$, NIL));
		deflexical("*KB-LOADED*", SubLSystemTrampolineFile.maybeDefault($kb_loaded$, $kb_loaded$, NIL));
		deflexical("*KB-PEDIGREE*", SubLSystemTrampolineFile.maybeDefault($kb_pedigree$, $kb_pedigree$, $UNKNOWN));
		defparameter("*USE-TRANSCRIPT?*", T);
		deflexical("*RUN-OWN-OPERATIONS?*", SubLSystemTrampolineFile.maybeDefault($run_own_operationsP$, $run_own_operationsP$, T));
		deflexical("*CAUGHT-UP-ON-MASTER-TRANSCRIPT*", SubLSystemTrampolineFile.maybeDefault($caught_up_on_master_transcript$, $caught_up_on_master_transcript$, NIL));
		deflexical("*COMMUNICATION-MODE*", SubLSystemTrampolineFile.maybeDefault($communication_mode$, $communication_mode$, $UNKNOWN));
		defparameter("*UNENCAPSULATING-WITHIN-AGENDA*", NIL);
		defvar("*SAVE-ASKED-QUERIES?*", NIL);
		deflexical("*INIT-FILE-LOADED?*", SubLSystemTrampolineFile.maybeDefault($init_file_loadedP$, $init_file_loadedP$, NIL));
		defparameter("*WITHIN-ASSERT*", NIL);
		defparameter("*WITHIN-UNASSERT*", NIL);
		defparameter("*WITHIN-ASK*", NIL);
		defparameter("*WITHIN-QUERY*", NIL);
		defparameter("*COMPUTE-INFERENCE-RESULTS*", T);
		defparameter("*CACHE-INFERENCE-RESULTS*", NIL);
		defparameter("*TRANSFORMATION-DEPTH-CUTOFF*", NIL);
		deflexical("*LEXICON-INITIALIZED?*", SubLSystemTrampolineFile.maybeDefault($lexicon_initializedP$, $lexicon_initializedP$, NIL));
		defparameter("*PARTIAL-SEMANTICS?*", NIL);
		defparameter("*ENFORCE-MASS-VS-COUNT?*", T);
		defparameter("*PARTIAL-SYNTAX?*", NIL);
		deflexical("*CB-PRESENTATION-LANGUAGES*", $list59);
		defparameter("*CB-MAJOR-PRESENTATION-LANGUAGE*", $CYCL);
		defparameter("*SHOW-ASSERTIONS-IN-ENGLISH*", NIL);
		defparameter("*ASSUME-CYC-CYCLIST-DIALOG?*", T);
		defparameter("*GENERATED-PHRASES-BROWSABLE?*", T);
		defparameter("*HIGHLIGHT-DEMERITS-IN-GENERATED-PHRASES?*", T);
		defparameter("*CB-PARAPHRASE-MT*", NIL);
		defparameter("*SHOW-FET-EDIT-BUTTONS?*", T);
		defparameter("*SHOW-FET-CREATE-INSTANCE-BUTTONS?*", T);
		defparameter("*SHOW-FET-CREATE-SPEC-BUTTONS?*", NIL);
		defparameter("*CB-LITERAL-QUERY-RESULTS-ONE-PER-LINE?*", NIL);
		defparameter("*CB-SKOLEM-APPLICABLE-RELATIONS?*", NIL);
		defparameter("*CB-APPLICABLE-RELATIONS-ONE-PER-LINE?*", NIL);
		defparameter("*CB-PARAPHRASE-APPLICABLE-RELATIONS?*", NIL);
		defparameter("*SHOW-CREDITS*", NIL);
		defparameter("*BROWSE-IN-META-QUERY-MODE?*", NIL);
		defparameter("*META-QUERY-START-STRING*", NIL);
		defparameter("*CURRENT-CACHE*", NIL);
		defvar("*RKF-MT*", NIL);
		defparameter("*DBM-INIT-FILE-LOADED?*", NIL);
		defparameter("*DBM-CACHE-LOADING-STARTED?*", NIL);
		defparameter("*DBM-CACHE-LOADING-FINISHED?*", NIL);
		deflexical("*WORDNET-INITIALIZED?*", SubLSystemTrampolineFile.maybeDefault($wordnet_initializedP$, $wordnet_initializedP$, NIL));
		deflexical("*USE-WN-LINKS?*", SubLSystemTrampolineFile.maybeDefault($use_wn_linksP$, $use_wn_linksP$, NIL));
		deflexical("*ACIP-SUBKERNEL-EXTRACTION*", SubLSystemTrampolineFile.maybeDefault($acip_subkernel_extraction$, $acip_subkernel_extraction$, NIL));
		deflexical("*ACIP-SUBKERNEL-OUTPUT-STREAM*", SubLSystemTrampolineFile.maybeDefault($acip_subkernel_output_stream$, $acip_subkernel_output_stream$, NIL));
		defparameter("*JANUS-TAG*", NIL);
		defparameter("*JANUS-NEW-CONSTANTS*", NIL);
		defparameter("*JANUS-TEST-CASE-LOGGING?*", NIL);
		defparameter("*JANUS-OPERATIONS*", NIL);
		defparameter("*JANUS-EXTRACTION-DEDUCE-SPECS*", NIL);
		defparameter("*JANUS-WITHIN-SOMETHING?*", NIL);
		defparameter("*JANUS-TESTING-DEDUCE-SPECS*", NIL);
		defparameter("*JANUS-TEST-CASE-RUNNING?*", NIL);
		defvar("*ASK-QUIRK?*", NIL);
		defparameter("*KBQ-RUN-QUERY-AUTO-DESTROY-ENABLED?*", T);
		defparameter("*KBQ-RUN-QUERY-NON-CONTINUABLE-ENABLED?*", T);
		defvar("*KBQ-RUN-QUERY-PRACTICE-MODE?*", NIL);
		return NIL;
	}

	static private final SubLList $list_alt4 = list(makeSymbol("*HL-LOCK*"));

	static private final SubLString $str_alt9$_ = makeString(" ");

	static private final SubLList $list_alt11 = list(makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));

	static private final SubLString $str_alt14$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow backchaining on those predicates \nwhich have dedicated HL module support, such as #$isa, #$genls and #$equals.");

	static private final SubLList $list_alt15 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes (expensive)")));

	static private final SubLString $str_alt18$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");

	static private final SubLList $list_alt19 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes")));

	static private final SubLString $str_alt21$Enable_complete_extent_minimizati = makeString("Enable complete extent minimization");

	static private final SubLString $str_alt22$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");

	public static final SubLObject setup_control_vars_file_alt() {
		declare_defglobal($table_area$);
		declare_defglobal($hl_lock$);
		register_global_lock($hl_lock$, $$$HL_Store_Lock);
		declare_control_parameter_internal($hl_failure_backchaining$, $$$Enable_HL_predicate_backchaining, $str_alt14$This_controls_whether_or_not_we_a, $list_alt15);
		declare_control_parameter_internal($negation_by_failure$, $$$Enable_negation_by_failure, $str_alt18$This_controls_whether_or_not_we_a, $list_alt19);
		declare_control_parameter_internal($complete_extent_minimization$, $str_alt21$Enable_complete_extent_minimizati, $str_alt22$This_controls_whether_or_not_we_a, $list_alt19);
		declare_control_parameter_internal($unbound_rule_backchain_enabled$, $str_alt24$Enable_unbound_predicate_rule_bac, $str_alt25$This_controls_whether_or_not_we_a, $list_alt15);
		declare_defglobal($auto_increment_kb$);
		declare_defglobal($build_kb_loaded$);
		declare_defglobal($kb_loaded$);
		declare_defglobal($kb_pedigree$);
		declare_defglobal($run_own_operationsP$);
		declare_defglobal($caught_up_on_master_transcript$);
		declare_defglobal($communication_mode$);
		declare_defglobal($init_file_loadedP$);
		declare_control_parameter_internal($cache_inference_results$, $$$Cache_backward_query_results, $str_alt52$This_controls_whether_the_results, $list_alt19);
		declare_defglobal($lexicon_initializedP$);
		register_html_state_variable($show_assertions_in_english$);
		register_html_interface_variable($show_assertions_in_english$);
		register_html_state_variable($assume_cyc_cyclist_dialogP$);
		register_html_interface_variable($assume_cyc_cyclist_dialogP$);
		register_html_state_variable($cb_paraphrase_mt$);
		register_html_interface_variable($cb_paraphrase_mt$);
		register_html_state_variable($show_fet_edit_buttonsP$);
		register_html_interface_variable($show_fet_edit_buttonsP$);
		register_html_state_variable($show_fet_create_instance_buttonsP$);
		register_html_interface_variable($show_fet_create_instance_buttonsP$);
		register_html_state_variable($show_fet_create_spec_buttonsP$);
		register_html_interface_variable($show_fet_create_spec_buttonsP$);
		register_html_state_variable($cb_literal_query_results_one_per_lineP$);
		register_html_interface_variable($cb_literal_query_results_one_per_lineP$);
		register_html_state_variable($cb_skolem_applicable_relationsP$);
		register_html_interface_variable($cb_skolem_applicable_relationsP$);
		register_html_state_variable($cb_applicable_relations_one_per_lineP$);
		register_html_interface_variable($cb_applicable_relations_one_per_lineP$);
		register_html_state_variable($cb_paraphrase_applicable_relationsP$);
		register_html_interface_variable($cb_paraphrase_applicable_relationsP$);
		register_html_state_variable($browse_in_meta_query_modeP$);
		declare_defglobal($wordnet_initializedP$);
		declare_defglobal($use_wn_linksP$);
		declare_defglobal($acip_subkernel_extraction$);
		declare_defglobal($acip_subkernel_output_stream$);
		return NIL;
	}

	public static SubLObject setup_control_vars_file() {
		if (SubLFiles.USE_V1) {
			declare_defglobal($table_area$);
			declare_defglobal($hl_lock$);
			register_global_lock($hl_lock$, $$$HL_Store_Lock);
			declare_control_parameter_internal($hl_failure_backchaining$, $$$Enable_HL_predicate_backchaining, $str16$This_controls_whether_or_not_we_a, $list17);
			declare_control_parameter_internal($negation_by_failure$, $$$Enable_negation_by_failure, $str20$This_controls_whether_or_not_we_a, $list21);
			declare_control_parameter_internal($complete_extent_minimization$, $str23$Enable_complete_extent_minimizati, $str24$This_controls_whether_or_not_we_a, $list21);
			declare_control_parameter_internal($unbound_rule_backchain_enabled$, $str26$Enable_unbound_predicate_rule_bac, $str27$This_controls_whether_or_not_we_a, $list17);
			declare_defglobal($auto_increment_kb$);
			declare_defglobal($build_kb_loaded$);
			declare_defglobal($kb_loaded$);
			declare_defglobal($kb_pedigree$);
			declare_defglobal($run_own_operationsP$);
			declare_defglobal($caught_up_on_master_transcript$);
			declare_defglobal($communication_mode$);
			declare_defglobal($init_file_loadedP$);
			declare_control_parameter_internal($cache_inference_results$, $$$Cache_backward_query_results, $str57$This_controls_whether_the_results, $list21);
			declare_defglobal($lexicon_initializedP$);
			register_html_state_variable($cb_major_presentation_language$);
			register_html_interface_variable($cb_major_presentation_language$);
			register_html_state_variable($assume_cyc_cyclist_dialogP$);
			register_html_interface_variable($assume_cyc_cyclist_dialogP$);
			register_html_state_variable($generated_phrases_browsableP$);
			register_html_interface_variable($generated_phrases_browsableP$);
			register_html_state_variable($highlight_demerits_in_generated_phrasesP$);
			register_html_interface_variable($highlight_demerits_in_generated_phrasesP$);
			register_html_state_variable($cb_paraphrase_mt$);
			register_html_interface_variable($cb_paraphrase_mt$);
			register_html_state_variable($show_fet_edit_buttonsP$);
			register_html_interface_variable($show_fet_edit_buttonsP$);
			register_html_state_variable($show_fet_create_instance_buttonsP$);
			register_html_interface_variable($show_fet_create_instance_buttonsP$);
			register_html_state_variable($show_fet_create_spec_buttonsP$);
			register_html_interface_variable($show_fet_create_spec_buttonsP$);
			register_html_state_variable($cb_literal_query_results_one_per_lineP$);
			register_html_interface_variable($cb_literal_query_results_one_per_lineP$);
			register_html_state_variable($cb_skolem_applicable_relationsP$);
			register_html_interface_variable($cb_skolem_applicable_relationsP$);
			register_html_state_variable($cb_applicable_relations_one_per_lineP$);
			register_html_interface_variable($cb_applicable_relations_one_per_lineP$);
			register_html_state_variable($cb_paraphrase_applicable_relationsP$);
			register_html_interface_variable($cb_paraphrase_applicable_relationsP$);
			register_html_state_variable($browse_in_meta_query_modeP$);
			declare_defglobal($wordnet_initializedP$);
			declare_defglobal($use_wn_linksP$);
			declare_defglobal($acip_subkernel_extraction$);
			declare_defglobal($acip_subkernel_output_stream$);
		}
		if (SubLFiles.USE_V2) {
			declare_control_parameter_internal($hl_failure_backchaining$, $$$Enable_HL_predicate_backchaining, $str_alt14$This_controls_whether_or_not_we_a, $list_alt15);
			declare_control_parameter_internal($negation_by_failure$, $$$Enable_negation_by_failure, $str_alt18$This_controls_whether_or_not_we_a, $list_alt19);
			declare_control_parameter_internal($complete_extent_minimization$, $str_alt21$Enable_complete_extent_minimizati, $str_alt22$This_controls_whether_or_not_we_a, $list_alt19);
			declare_control_parameter_internal($unbound_rule_backchain_enabled$, $str_alt24$Enable_unbound_predicate_rule_bac, $str_alt25$This_controls_whether_or_not_we_a, $list_alt15);
			declare_defglobal($run_own_operationsP$);
			declare_defglobal($init_file_loadedP$);
			declare_control_parameter_internal($cache_inference_results$, $$$Cache_backward_query_results, $str_alt52$This_controls_whether_the_results, $list_alt19);
			declare_defglobal($lexicon_initializedP$);
			register_html_state_variable($show_assertions_in_english$);
			register_html_interface_variable($show_assertions_in_english$);
			register_html_state_variable($assume_cyc_cyclist_dialogP$);
			register_html_interface_variable($assume_cyc_cyclist_dialogP$);
			register_html_state_variable($show_fet_edit_buttonsP$);
			register_html_interface_variable($show_fet_edit_buttonsP$);
			register_html_state_variable($show_fet_create_instance_buttonsP$);
			register_html_interface_variable($show_fet_create_instance_buttonsP$);
			register_html_state_variable($show_fet_create_spec_buttonsP$);
			register_html_interface_variable($show_fet_create_spec_buttonsP$);
			register_html_state_variable($cb_literal_query_results_one_per_lineP$);
			register_html_interface_variable($cb_literal_query_results_one_per_lineP$);
			register_html_state_variable($cb_skolem_applicable_relationsP$);
			register_html_interface_variable($cb_skolem_applicable_relationsP$);
			register_html_state_variable($cb_applicable_relations_one_per_lineP$);
			register_html_interface_variable($cb_applicable_relations_one_per_lineP$);
			register_html_state_variable($cb_paraphrase_applicable_relationsP$);
			register_html_interface_variable($cb_paraphrase_applicable_relationsP$);
			register_html_state_variable($browse_in_meta_query_modeP$);
			declare_defglobal($wordnet_initializedP$);
			declare_defglobal($use_wn_linksP$);
		}
		return NIL;
	}

	public static SubLObject setup_control_vars_file_Previous() {
		declare_defglobal($table_area$);
		declare_defglobal($hl_lock$);
		register_global_lock($hl_lock$, $$$HL_Store_Lock);
		declare_control_parameter_internal($hl_failure_backchaining$, $$$Enable_HL_predicate_backchaining, $str16$This_controls_whether_or_not_we_a, $list17);
		declare_control_parameter_internal($negation_by_failure$, $$$Enable_negation_by_failure, $str20$This_controls_whether_or_not_we_a, $list21);
		declare_control_parameter_internal($complete_extent_minimization$, $str23$Enable_complete_extent_minimizati, $str24$This_controls_whether_or_not_we_a, $list21);
		declare_control_parameter_internal($unbound_rule_backchain_enabled$, $str26$Enable_unbound_predicate_rule_bac, $str27$This_controls_whether_or_not_we_a, $list17);
		declare_defglobal($auto_increment_kb$);
		declare_defglobal($build_kb_loaded$);
		declare_defglobal($kb_loaded$);
		declare_defglobal($kb_pedigree$);
		declare_defglobal($run_own_operationsP$);
		declare_defglobal($caught_up_on_master_transcript$);
		declare_defglobal($communication_mode$);
		declare_defglobal($init_file_loadedP$);
		declare_control_parameter_internal($cache_inference_results$, $$$Cache_backward_query_results, $str57$This_controls_whether_the_results, $list21);
		declare_defglobal($lexicon_initializedP$);
		register_html_state_variable($cb_major_presentation_language$);
		register_html_interface_variable($cb_major_presentation_language$);
		register_html_state_variable($assume_cyc_cyclist_dialogP$);
		register_html_interface_variable($assume_cyc_cyclist_dialogP$);
		register_html_state_variable($generated_phrases_browsableP$);
		register_html_interface_variable($generated_phrases_browsableP$);
		register_html_state_variable($highlight_demerits_in_generated_phrasesP$);
		register_html_interface_variable($highlight_demerits_in_generated_phrasesP$);
		register_html_state_variable($cb_paraphrase_mt$);
		register_html_interface_variable($cb_paraphrase_mt$);
		register_html_state_variable($show_fet_edit_buttonsP$);
		register_html_interface_variable($show_fet_edit_buttonsP$);
		register_html_state_variable($show_fet_create_instance_buttonsP$);
		register_html_interface_variable($show_fet_create_instance_buttonsP$);
		register_html_state_variable($show_fet_create_spec_buttonsP$);
		register_html_interface_variable($show_fet_create_spec_buttonsP$);
		register_html_state_variable($cb_literal_query_results_one_per_lineP$);
		register_html_interface_variable($cb_literal_query_results_one_per_lineP$);
		register_html_state_variable($cb_skolem_applicable_relationsP$);
		register_html_interface_variable($cb_skolem_applicable_relationsP$);
		register_html_state_variable($cb_applicable_relations_one_per_lineP$);
		register_html_interface_variable($cb_applicable_relations_one_per_lineP$);
		register_html_state_variable($cb_paraphrase_applicable_relationsP$);
		register_html_interface_variable($cb_paraphrase_applicable_relationsP$);
		register_html_state_variable($browse_in_meta_query_modeP$);
		declare_defglobal($wordnet_initializedP$);
		declare_defglobal($use_wn_linksP$);
		declare_defglobal($acip_subkernel_extraction$);
		declare_defglobal($acip_subkernel_output_stream$);
		return NIL;
	}

	static private final SubLString $str_alt24$Enable_unbound_predicate_rule_bac = makeString("Enable unbound predicate rule backchaining");

	static private final SubLString $str_alt25$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow backchaining with rules\nthat conclude literals whose predicate position is unbound.\nMany type-level predicates have defining axioms of this form.");

	static private final SubLString $str_alt38$_a__a__a = makeString("~a-~a-~a");

	static private final SubLString $str_alt52$This_controls_whether_the_results = makeString("This controls whether the results of successful backward queries are cached in the KB.");

	@Override
	public void declareFunctions() {
		declare_control_vars_file();
	}

	@Override
	public void initializeVariables() {
		init_control_vars_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_control_vars_file();
	}

}

/**
 * Total time: 366 ms synthetic
 */
